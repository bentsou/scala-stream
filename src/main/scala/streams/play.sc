package streams

object play {
	val levelVector = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))
                                                  //> levelVector  : scala.collection.immutable.Vector[scala.collection.immutable.
                                                  //| Vector[Char]] = Vector(Vector(S, T), Vector(o, o), Vector(o, o))
 
	new StringParserTerrain {
		val level =
        """ST
          |oo
          |oo""".stripMargin
		val k = terrainFunction(levelVector)
		val p = findChar('S', levelVector)
		println(p.x, p.y)
	}                                         //> (0,0)
                                                  //| res0: streams.StringParserTerrain{val k: this.Pos => Boolean; val p: this.Po
                                                  //| s} = streams.play$$anonfun$main$1$$anon$1@5d3f03b
}