package day3

val day3Input = """
    ....#............#.###...#.#.#.
    .#.#....##.........#.....##.#..
    .#..#.#...####.##..#......#..##
    ......#...#...#.......#........
    ........#...###..#.#....#....#.
    ..##.....#.....#.#.........#.#.
    .##.......#.#.#...#..#...##...#
    ...##.....#....##....#...###.#.
    ..#...#......##.#.##.....#.#..#
    .#....#.###.........#..........
    .#.#..##.....###.....###....#.#
    ....###....#......#...#......##
    ......##...#.##.........#.#..#.
    ##.#....##...#..##....#.#..#.##
    .#...#..#.....#.#.......#...#..
    ..........#..###.###......##..#
    ..#.##.#..#......#.......###.#.
    ...#...#.#.#..#...#.#..........
    #........#..#..#.#....#.##..###
    #...#.....#..####.........####.
    .....###..........#.#...##...#.
    .....#...#..#.......#....##.#..
    ...........#..##.....#...#..#..
    ......##..#........#...........
    #.#..#.#.#..#.....#....#.....#.
    ..#....##....##...#.....#......
    .#.#....#..#.#......#..###...#.
    .......#...#.#....##..#..#..#..
    .#.#.#.......#....#.#.#.......#
    .#..........#.##.#...#..#.#.##.
    ..#.#..........#.#....##.#.##..
    ###..#..#.#...##.#.#..#........
    ##....#...#....#....#...#.#....
    #...#.#....#.##..##...#.#......
    ......#...#.###......##....#...
    .................#.###......#..
    ##..#....#....##...###.#.#..###
    ..#..........#..####..##..#...#
    .#......#..#.#...........##.#..
    .#..#......#...#.#.#..#.#.#.#.#
    .#......###.....#.#.#......##..
    #..........#.##...#...........#
    ..#....#.##....#.........#.....
    .#..##....#...##.........#..#..
    ....##..#.###..#.#...#..###..#.
    ..#......#........#...#.#......
    ........#..#..#..#...#.##......
    .##.#.#......#...#.........#...
    #..###.#...#....###.##..###....
    ........##.............#....#..
    ...#...............#....#.#....
    #..........#..#..#.#.....#...#.
    .#.............#...#.......#..#
    .#..#..#...#........##.........
    .....#.#..#.#..#..##.........#.
    ..#..##...#....#.#...#.###..#..
    #...........##.....#...#.##....
    #.#.#.#........##......#...#.#.
    ......#..#.###.#...#.##.##....#
    .#....#...#....#........#....#.
    ..#.#..........#..##.......#..#
    .....#...##..#................#
    .#...............##...#.##...##
    #.####....##.....#.......#.##..
    ......#.##.#...##..###..#.#....
    .#.##.#...##..#.......#.#..#...
    #...#.##..........##..........#
    #.###...#...#..#.....#.#.##..##
    .##.....#....#...##.....##.....
    ...#........#..###.###...#.....
    ##..#....#.....#...#.#....#.#..
    #....#....#.#..........#...#..#
    ...##..#......#..#..#..#..#....
    .....##...#..####..##.........#
    .....#..#.#...#..#....##..##...
    ..#.......##.#..#.##...#.#....#
    .#..#.#...##..##....#..#......#
    ..##.##..##...###..#....#...#..
    ........##.......##...##.....##
    .#....###...#..#..#..#.......#.
    #.###............#....##.....#.
    ..........#...#...##..#...#....
    ..#......#.##.......#....##..##
    ..#..###.....#...#.......#.....
    #.#...##.....#...#....#.......#
    ....##.##.#....#.....#.#....#..
    ...#....#.###............#..###
    #..##..#.........##.....#.#...#
    ....#.......##......#....#...#.
    ....#..##.#..........#.........
    ....#...#.###.......#...#.#....
    #..#..#...#.......##...#..#.##.
    #.......#...##.##......#.......
    ##..##...##...#......#...#...##
    ..#...#.#.####.#...##.....##...
    #...#..#..#...##......#.#..#..#
    ..##..##.#.#..#...####.....###.
    .#........#..##.###...#.##.#...
    ........#..#...##......#.#....#
    ..#...###.......##..##..#....#.
    .##...#.#..#.##.......##.###...
    #....#.#.#........#....#..#.##.
    ....#.##.#.##..#.#####.....###.
    #.#..#..#...#.#..#.......#.#...
    ....#...#....###...............
    .###.#.....#.#.......###......#
    ##...#.#.###....##..#...##.....
    ...#.#..#.###.#.......#...#.#..
    .#...#....#...#..####....###...
    ..#....##.....##.#.#.##....#...
    #....#..##.......#...##.##....#
    .##..#.......#..#....###.......
    #.##.....##.#.........#......##
    .####.#...#.....#..#...#.##..#.
    ....#...........#.....#........
    .#............##...#.......#.#.
    #....#.##........#....#.#..#..#
    #....#.##....#...##...#..#..#..
    ...#..#.####.#....#............
    ....#......#.........#.........
    #....##....###.....#......#.#..
    ...#..#....#........###..#...#.
    ..#.#........#.#.#.###..#.#.#..
    .....###.....##.#....###.#.....
    ##.#....#....##...##.###.#.##..
    .###.#..#.......##...#...##....
    .#...###........#.......##.##..
    #......####...#...##.#.######..
    ....##.............#..##.##...#
    ...........#..##.#...#.#.#...#.
    ###.......#.##..#....#...#....#
    .........#.....#.#.#..##.#.....
    #...##..#....#..#.............#
    ...#.......#.##.............#.#
    .....#..#...##......####..#....
    .#.#.#.....#...####..#...##...#
    #...#.#..#..#.#..#.##..........
    .....#.##..#.#.##..#.#.#....#.#
    ...##..#...#...#..#....#.......
    ........#.#..#...#...#.#...#...
    ##..#........#..#.....#......##
    .........#..#...#......#......#
    ..#.#.#........##...#.##.....##
    .###....##....#...#....#..#....
    .#.............###...#..##..###
    .##.##.##.......###.........#.#
    ..#..###...#...#....#..#.#..#.#
    ......#..#.#..#.....#.#........
    ......#...####...#.#.....#.....
    .#...##.......#..#......#...#..
    #..#...#.......###..#..#.#.#.#.
    .....#.....###.##....#.#.##.#.#
    #........#....##...#..#.##..#..
    ...#.#........##....#.#..###.#.
    #...#...##.........#........###
    ##...#.##..##...#.....#.###.#..
    #.###.#.#..#...........##..#...
    ........#.......#..#..#.###....
    #........#....#......###.......
    ..#.###.######...#.###..#......
    ...#...######..#.....#....#.#..
    ..#.......#..#..#.........#...#
    .#...#..##.##.........##.......
    .........#.#.##.#..#....#.#...#
    #.......#....#......#.....###.#
    ##..............#.###........#.
    ..#.##..#.##.....#...#.#.#..###
    ..#.#......#..#..##.#........#.
    ..#.....#...#.#...#...###..#.#.
    .......#...........#..#..#.#.##
    .......#...##..#.###...........
    .#........#.###.#..#..#..#..#..
    ##.#.##....#..###..#.##.##...#.
    .....#....##.#........#.#.#....
    ....##....#..#..#....##....#.#.
    #.....##....#.....#.###.#....#.
    .#.##.##..#..#...#...........##
    ...#..###..#.....##....#.......
    ...#..##..###.#..#..#.#........
    ......##..#.......#..##.....###
    .#...##.#.#.#......#...#.#.#.##
    ....#.#....#...#........#...#..
    ....#.#......#.#.###.#.#.##.#..
    #..#........###..#..#..#.....#.
    ...#....#...##...#........##.##
    .....#..#..#.....#....#.#...#..
    ..#.###....#.#..##......#.##.#.
    ..####......#..#.#.#..#.#####..
    .......##..#..###.#............
    ..###.#........#..........##.##
    #.#.........#.##.#......#..#...
    ...#.....#.....##..#..##.##..#.
    #.#.##....#.......###....##....
    ...##.#..#...##.#..#......#..#.
    ..##.........#.##.#####...#.#..
    .#....#...#....#.#.....##...###
    ##.....#..####............###.#
    ......#...........#....#.......
    .#......#.....##...........###.
    #......##.......#.#.#..##.....#
    ...###.#.....##.#...#.#....#.#.
    ...###.......#...#.............
    ..#..#.#....#.#.###.#.#.##..##.
    ..##...#..#.#..##.#.##....##...
    ..#...........#..#....#....#...
    #.##...........#..#.#..##.#.#..
    ...##...##................#..#.
    .#...#.##......#.#......#.####.
    #.##....#....#.........#....###
    .....###........#.#.#.##...#.##
    .....#....#.#....#.........#..#
    ..#...#.#.#.#...#...#...##.#..#
    ###.......#.....#.............#
    #.####.#.......#.#.#.#..#.#....
    #..#..#####......#....#..##....
    ...............#.....#.#....###
    .###.....#...#.##..#.#..#.#####
    #.##.....#......##.......##....
    ..........###.......#...#.#....
    ..#.#..#...##.....#........#.#.
    ........##.##....#####.#.#..##.
    ..##.#.#...#####..........#.#.#
    #.........#......##...#.....#..
    .##.#........#...#..##...#...#.
    .......##..#...#.....#.##......
    ....#.#...##..##..#....##......
    #........#..........##..####.#.
    ...###...#.#.###.#...#....#.#.#
    .....##.#.....#........#.#....#
    #.......#....#...##..#......#..
    ...#..........#.#.#...#.#.###.#
    ....##.....#.##..#.#.#.........
    #.##..##..#....#.........#...#.
    .###..........#...##.#..#......
    .....####.............##...###.
    .#..#....#..#...#..#...........
    #..#..##..#...#.##..#.###.#...#
    ......#.#..###...#..#.....#..#.
    ##.##......#...#.#...#.........
    ....##.#.......#.#..##....#.#.#
    #..##..#...###.#....##.........
    .............#.#....#...##..#..
    ..#....#...#.....#.##.#..##..##
    ##.#..##.#..##.#.#.##.#...#.#..
    .##.#..#.#........##.#...##....
    #.........##....##..#......#...
    .#.#.......##...#..#......###.#
    ........#.#.#.#......#....#..#.
    ...##..#...#...#.##..#....#.#..
    ...#.#.#.#.......#.......###..#
    ...#..##..#####.#.....##.#..#..
    .......#.#.....#.....#...#...##
    #...#...#......##.#....##......
    #.....#.#.#.....#....#......#..
    ..#..#.##.#......##..#.#..#..##
    ####...#.....#....#.#..........
    ....#.....###...#...##......#..
    .....#....#...#............#...
    ...#...#..##.........#...#...##
    #.#..#.#...##.#.......#..#.#...
    .#.....#...##.............#...#
    .....#..##..#....#......#.##..#
    ....#...###.................#..
    ...###...#....#...#...#........
    ....#.##.#.......#..#..........
    ...#..#......#.#...###...#.#...
    ..#.#..#...#.......#.......#.#.
    .#.#...#.#.##........#.........
    ...#..#...#....#.#.#.#.#..###..
    .#..##......#.#.##..#.##....#..
    #....#.......##.....#.#........
    ..###..#.#.#.......##....#.....
    ........#.#.#....##...##..#....
    #....##.#....#...##..##...#....
    ...#..##.#.....#...#.....##....
    .#.#..#..#...#....#..##.#....#.
    ##.#.##....#.....#....#....#.#.
    .##......#............##...#...
    #..##.#.####.#.#....#..#..#.#.#
    #...##...#......##....###.....#
    ..#.##.....#....#....#......#..
    .##.#...#.....#.#.#.#........##
    .#..#....#.#...........#...#...
    #.....#..#.....#.#.##.#.....#..
    ....#.....#..#.#....###........
    .....###...........#.#..##.#.#.
    ....###....#.......###..#...#.#
    .###.....#...##.#...##........#
    ..#..#.#..#...#.#...#.#..#...#.
    #.####.......#....##.#..#.#..#.
    ....#.#.##.#..###.........##.#.
    ..#..#.#....#....#.##..........
    ..##.###..#.#..#.#......#....#.
    .#..#.....##...#.#......##.#..#
    #.#....#..#.#.#........#.###...
    ...#....##....##..###.###.#.#..
    ..#....#.....#....##.#.........
    #.......#....#.........##..#...
    .#..#...#.#..#.#....#.#........
    ...#..###...#.....#......##....
    ..#...........#.....#..........
    ....###.#...#......#...#..#....
    .....#.##..#..#....#.......#..#
    ....##..#.#.#..............#.#.
    .#.#..#..#.#......#...#.#......
    ....#.......#.##....##.#.#.#..#
    ............#.#.#.....##.......
    ........#...##.#..#......#...##
    .........#...#...#....#...#.##.
    ..#.....#......#......#.....#..
    #....#...##..#.#....#.#...#.###
    .......#..#..#..#.#...#.....#.#
    ...#.#...#......##.....#..#....
    ...#.#.####..##.#..#...........
    ..##..##....#.....####...#....#
    ###.......#...##.#...#...#...#.
    .##..#.....#..####......#....#.
    #.....#..#..##..##...#..#..#...
    .#....#.....#...####..####.....
    ..#....#...#......#........#.#.
    ##.#.......#..#.....#..##..##..
    .#..#..#.#.#...#....##...#.##.#
    ##...#..#....#.........##......
""".trimIndent()