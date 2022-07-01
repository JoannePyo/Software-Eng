# Design information 

1.  As a user of the system I want to be able to see each store's offering and the amount of product in stock by square feet.

   -To realize this requirement, I added to the design a class called User which has the following methods that allow StroeOffering(), and amouintOfProdunctInStock(). 

2. The application must allow employees to add new products to the system. As well as delete and edit them.

​		- To realize this requirement, I added to the design a class called employees which has the follwing methods that allow addNewProdunct(); deleteProduct(), editProduct(), and checkProduct().

3. The different categories of floors available are tile, stone, wood, laminate and vinyl

​		-To realize this requirement, I added the the design the five different categories classes. These are floorTile, floorStone, floorWood, floorLaminate, and floor Vinyl. 

3. The application must contain a database (DB) of floors.

   -It is Implemented, but It is not modeled as it is not part of UML diagram guidelines called a DatabaseofFloors. 

4. Users must be able to search for products by picking from a hierarchical list, where the first level is the floor category, and the second level is the floor type.

​		-To realize this requirement, I use a hierarchical list, so I add to the design a parent class and child class. The parent class called floorCategory. The child class called floorType. The floorCategory class which has the following methods that allow tile(), stone(), wood(), laminate(), and vinyl(). And I added my five categories classes in the child class in floorType.  

6. Users must also be able to specify an item by typing its name (search functionality).

​		-To realize this requirement, the user can search for a item by directly the multiple lists. The class called SearchFloor, which has the following methods that allow SpecifyName().  

7. All floors regardless of their category have an associated color, size, brand, type and price.

​		-To realize this requirement, I added the design a class floorRegardless which has the following methods that allow color(), size(), brand(), type(), and price(). 

8. Categories tile and stone have different materials they are made of, e.g. Tile - porcelain, ceramic, resin; Stone - marble, pebble, slate

   -To realize this requirement, I added interface called floorTypeTile and floorTypeStone. floorTypeTile which has the following methods that allow porcelain(), ceramic(), resin(). floorTypeStone has the following methods that allow mable(), pebble(), and slate(). 

9. Wood floors have both a type (solid, engineered, bamboo, etc) and species (oak, hickory, maple, etc.)

   -To realize this requirement, I added interface called floorTypeWood which has the following methods that allow solid(), engineered(), bamboo(). Wood floor type has species, so I added one more interface called woodSpecies which has the following methods that allow oak(), hickory(), and maple().  

10. Laminate can be regular laminate or water resistant, whereas vinyl can be water resistant or waterproof.

​		-To realize this requirement, I added interface called floorTypeLaminate which has the following methods that allow regularLaminate(), and waterResistance().

11. The User Interface (UI) must be intuitive and responsive.

    -This is not displayed or modeled in the UML diagram because it does not directly affect the design.

