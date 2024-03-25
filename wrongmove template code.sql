DROP DATABASE wrongmove;
CREATE DATABASE wrongmove;

CREATE TABLE Buyer (
id BIGINT NOT NULL AUTO_INCREMENT,
first_name varchar(256),
last_name varchar(256),
email varchar(256),
telephone varchar(256),
PRIMARY KEY (id)
);

CREATE TABLE sellers(
id BIGINT NOT NULL AUTO_INCREMENT,
first_name varchar(256),
last_name varchar(256),
email varchar(256),
telephone varchar(256),
address varchar(256),
postCode varchar(256),
PRIMARY KEY (id)
);

CREATE TABLE properties(
id BIGINT NOT NULL AUTO_INCREMENT,
address varchar(256),
postcode varchar(256),
`type` Enum( 'DETACHED', 'SEMI', 'APARTMENT' ),
bedrooms INT NOT NULL,
bathrooms INT NOT NULL,
garden BOOLEAN,
price FLOAT NOT NULL,
`status` Enum( 'FORSALE', 'SOLD', 'WITHDRAWN' ),
`description` varchar(2560), 
thumbnail varchar(256),
img2 varchar(256), 
img3 varchar(256), 
img4 varchar(256), 
img5 varchar(256), 
img6 varchar(256), 
img7 varchar(256), 
img8 varchar(256), 
img9 varchar(256),
PRIMARY KEY (id)
);

INSERT INTO Buyer (first_name, last_name, email, telephone)
VALUES
('Sarah', 'Smith', 'sarah.smith@gmail.com', '07562946283'),
('Bob', 'Grant', 'bob.grant@gmail.com', '07354678982'),
('Kate', 'Sanders', 'kate.sanders@gmail.com', '07394517592'),
('Niall', 'Anderson', 'niall123@hotmail.com', '07561325497'),
('Monica', 'Harrison', 'monicaharrison@outlook.com', '07364583663'),
('Steve', 'Barkley', 'stevedog@gmail.com', '07586973614'),
('Gregg', 'Schmitt', 'gregg9080@outlook.com', '07883364759'),
('Harry', 'Plant', 'plantharry56@gmail.com', '07836471922'),
('Henry', 'David', 'henry.david321@gmail.com', '07869936210'),
('Jamie', 'Baker', 'jamie.baker345@outlook.com', '07883647192'),
('Alice', 'Scott', 'alice123scott@gmail.com', '07466244435'),
('Emily', 'Kay', 'emilykay7834@gmail.com', '07117493776'),
('Frank', 'Overton', 'frankieoverton@hotmail.com', '07348562713'),
('Kayleigh', 'Rogan', 'kayleighrogan123@gmail.com', '07846295825'),
('Wallace', 'Gordon', 'wallace123@gmail.com', '07418394628'),
('Clifford', 'The Big Red Dog', 'cliff@big', '123'),
('Max', 'The Dog', 'max@dog', '12345'),
('harry', 'potter', 'l@hogrwa', '45678');

INSERT INTO sellers (first_name, last_name, email, telephone)
VALUES
('Diane', 'Bond', 'D.Bond34@gmail.com', '01282 439567'),
('Michelle', 'Avery', 'M.Avery687@gmail.com', '0121 771 0639'),
('Joshua', 'Hamilton', 'J.Hamilton7438@gmail.com', '01273 476707'),
('Trevor', 'Mackenzie', 'T.Mackenzie48@gmail.com', '01274 729141'),
('Alexander', 'Ross', 'A.Ross423@gmail.com', '0121 706 8101'),
('Dan', 'Simpson', 'D.Simpson647@gmail.com', '01323 761372'),
('Eric', 'Walker', 'E.Walker33@gmail.com', '0131 516 2690'),
('James', 'King', 'J.King769@gmail.com', '01273 911149'),
('Nicholas', 'Gray', 'N.Gray43@gmail.com', '01462 892367'),
('Zoe', 'Hill', 'zoe-Hill78@gmail.com', '01297 445008'),
('Christopher', 'Duncan', 'Chris.Duncan74@gmail.com', '0113 230 0600'),
('Leah', 'Davies', 'L.Davies63@gmail.com', '0844 477 0926'),
('Grace', 'Butler', 'Grace-Butler34@gmail.com', '0845 309 6369'),
('Elizabeth', 'Baker', 'Liz.Baker455@gmail.com', '01324 486733'),
('Edward', 'Abraham', 'ed.Abraham31@gmail.com', '01246 277188');



-- INSERT INTO properties (first_line, city, postcode, overview, price, houseType, bedrooms, bathrooms, garden, time_uploaded) 
-- VALUES ('Bridgford Rd', 'Manchester', 'NG2 6AG', 'Nestled in the heart of a tranquil forest, this charming cottage offers a serene escape from the hustle and bustle of city life. Featuring rustic decor, a crackling fireplace, and a private deck overlooking a babbling brook, it''s the perfect spot for nature lovers seeking relaxation.', 2000000, 'Detached', 7, 5, true, '2024-02-13 07:21:53'), 
-- ('Park Lane', 'London', 'W1K 7TY', 'Located in a vibrant downtown neighborhood, this sleek loft boasts floor-to-ceiling windows, exposed brick walls, and industrial-chic furnishings. With its open-concept design and rooftop patio with skyline views, it''s ideal for cosmopolitan professionals seeking a stylish urban oasis.', 3500000, 'Terraced', 5, 4, false, '2024-02-13 07:21:53'), 
-- ('Elm Street', 'Manchester', '12345', 'Perched on a cliff overlooking crystal-clear waters, this luxurious villa offers panoramic ocean views and direct beach access. With spacious living areas, a gourmet kitchen, and a infinity pool, it''s an idyllic retreat for discerning travelers seeking coastal elegance.', 150000, 'Semi-Detached', 3, 2, true, '2024-02-13 10:21:53'), 
-- ('Ocean Avenue', 'Liverpool', '11701', 'Set amidst rolling hills and meandering country roads, this quaint farmhouse exudes charm and character. With its wraparound porch, flower-filled gardens, and cozy interiors, it''s the perfect escape for those craving a simpler way of life.', 800000, 'Terraced', 5, 3, true, '2024-02-12 08:21:53'), 
-- ('123 Main St', 'Liverpool', '54321', 'Tucked away in a picturesque mountain village, this inviting chalet is the ultimate winter getaway. Featuring a stone fireplace, hot tub, and ski-in/ski-out access, it''s an ideal retreat for outdoor enthusiasts seeking adventure on the slopes.', 250000, 'Semi-Detached', 4, 2, false, '2024-02-13 19:21:53'), 
-- ('Maple Avenue', 'Birmingham', '90120', 'Situated in a historic district, this elegant brownstone combines old-world charm with modern amenities. With its original architectural details, gourmet kitchen, and private courtyard garden, it''s a sophisticated urban retreat for those who appreciate timeless elegance.', 420000, 'Terraced', 3, 3, true, '2024-02-13 15:21:53'), 
-- ('Elm Street', 'Birmingham', '45678', 'Surrounded by majestic desert landscapes, this sprawling estate offers unparalleled privacy and luxury. With a sparkling pool, lush gardens, and outdoor entertainment spaces, it''s an oasis of tranquility for those seeking relaxation under the desert sun.', 300000, 'Detached', 6, 4, false, '2024-02-13 14:21:53'), 
-- ('Evergreen Terrace', 'Birmingham', '12345', 'Tucked away in a secluded forest, this cozy cabin offers a peaceful escape from everyday life. With its wood-paneled interiors, stone fireplace, and scenic views, it''s the perfect retreat for nature lovers seeking solace in the mountains.', 500000, 'Detached', 4, 3, true, '2024-02-13 16:21:53'), 
-- ('742 Evergreen Terrace', 'Birmingham', '12345', 'Located steps away from the sandy shores, this modern condo offers breathtaking ocean views and resort-style amenities. With its sleek design, gourmet kitchen, and private balcony, it''s an ideal coastal retreat for those seeking luxury by the sea.', 1000000, 'Semi-Detached', 5, 3, true, '2024-02-13 13:21:53'), 
-- ('Sherlock Holmes St', 'London', 'WC2N 5DU', 'Surrounded by rolling vineyards and manicured gardens, this stately estate offers a taste of refined country living. With its wine cellar, outdoor dining area, and sweeping views, it''s a dream destination for wine enthusiasts and connoisseurs of fine living.', 1800000, 'Semi-Detached', 2, 2, false, '2024-02-13 12:21:53'), 
-- ('221B Baker Street', 'London', 'NW1 6XE', 'Situated in a vibrant urban neighborhood, this stylish apartment showcases Art Deco design elements and contemporary flair. With its high ceilings, designer furnishings, and city views, it''s a chic retreat for those who appreciate architectural elegance and city living.', 2500000, 'Terraced', 4, 3, true, '2024-02-12 11:17:53'), 
-- ('1313 Mockingbird Lane', 'London', '66666', 'Hidden away on a secluded island, this charming bungalow offers a tranquil escape surrounded by lush tropical foliage and pristine beaches. With its hammock-strewn veranda, outdoor shower, and ocean breezes, it''s a slice of paradise for those seeking relaxation in nature.', 1200000, 'Terraced', 6, 5, true, '2024-02-13 11:19:53');


INSERT INTO properties (id, `description`, address, postcode, thumbnail, img2, img3, img4, img5, img6, img7, img8, img9, price, `type`, bedrooms, bathrooms, garden)
VALUES 
(1, "Nestled in the heart of a tranquil forest, this charming cottage offers a serene escape from the hustle and bustle of city life. Featuring rustic decor, a crackling fireplace, and a private deck overlooking a babbling brook, it's the perfect spot for nature lovers seeking relaxation.", 'Bridgford Rd, Manchester', 'NG2 6AG', 'https://media.rightmove.co.uk/46k/45311/67250766/45311_DRH190225_IMG_01_0000.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 2000000, 'DETACHED', 7, 5, true),
(2, 'Located in a vibrant downtown neighborhood, this sleek loft boasts floor-to-ceiling windows, exposed brick walls, and industrial-chic furnishings. With its open-concept design and rooftop patio with skyline views, it''s ideal for cosmopolitan professionals seeking a stylish urban oasis.', 'Park Lane, London', 'W1K 7TY', 'https://i.pinimg.com/originals/e6/75/ff/e675ffd0c79c51b23c899a63d99dccb7.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 3500000, 'APARTMENT', 5, 4, false),
(3, 'Perched on a cliff overlooking crystal-clear waters, this luxurious villa offers panoramic ocean views and direct beach access. With spacious living areas, a gourmet kitchen, and an infinity pool, it''s an idyllic retreat for discerning travelers seeking coastal elegance.', 'Elm Street, Manchester', '12345', 'https://i.pinimg.com/736x/59/33/00/593300d3e9f898e044f0c36d61218ebd.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 150000, 'SEMI', 3, 2, true),
(4, 'Set amidst rolling hills and meandering country roads, this quaint farmhouse exudes charm and character. With its wraparound porch, flower-filled gardens, and cozy interiors, it''s the perfect escape for those craving a simpler way of life.', 'Ocean Avenue, Liverpool', '11701', 'https://i.pinimg.com/736x/5c/e9/fa/5ce9fa05907a5229f69cc1a05b47a03c--property-for-sale.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 800000, 'APARTMENT', 5, 3, true),
(5, 'Tucked away in a picturesque mountain village, this inviting chalet is the ultimate winter getaway. Featuring a stone fireplace, hot tub, and ski-in/ski-out access, it''s an ideal retreat for outdoor enthusiasts seeking adventure on the slopes.', '123 Main St, Liverpool', '54321', 'https://i.pinimg.com/originals/13/24/fd/1324fd77567454d7179c3f262b337633.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 250000, 'SEMI', 4, 2, false),
(6, 'Situated in a historic district, this elegant brownstone combines old-world charm with modern amenities. With its original architectural details, gourmet kitchen, and private courtyard garden, it''s a sophisticated urban retreat for those who appreciate timeless elegance.', 'Maple Avenue, Birmingham', '90120', 'https://i.pinimg.com/originals/bf/53/e5/bf53e5d610e96b90f9c731cf72bf5624.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 420000, 'APARTMENT', 3, 3, true),
(7, 'Surrounded by majestic desert landscapes, this sprawling estate offers unparalleled privacy and luxury. With a sparkling pool, lush gardens, and outdoor entertainment spaces, it''s an oasis of tranquility for those seeking relaxation under the desert sun.', 'Elm Street, Birmingham', '45678', 'https://i.pinimg.com/originals/b6/a2/de/b6a2de9097a64411d5c4a80ef9a6b638.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 300000, 'DETACHED', 6, 4, false),
(8, 'Tucked away in a secluded forest, this cozy cabin offers a peaceful escape from everyday life. With its wood-paneled interiors, stone fireplace, and scenic views, it''s the perfect retreat for nature lovers seeking solace in the mountains.', 'Evergreen Terrace, Birmingham', '12345', 'https://i.pinimg.com/originals/32/45/c2/3245c243a6bfdf746fedf5dbc229fee2.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 500000, 'DETACHED', 4, 3, true),
(9, 'Located steps away from the sandy shores, this modern condo offers breathtaking ocean views and resort-style amenities. With its sleek design, gourmet kitchen, and private balcony, it''s an ideal coastal retreat for those seeking luxury by the sea.', '742 Evergreen Terrace, Birmingham', '12345', 'https://i.pinimg.com/originals/39/23/66/3923666fa87fc303a79c9b9706457663.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 1000000, 'SEMI', 5, 3, true),
(10, 'Surrounded by rolling vineyards and manicured gardens, this stately estate offers a taste of refined country living. With its wine cellar, outdoor dining area, and sweeping views, it''s a dream destination for wine enthusiasts and connoisseurs of fine living.', 'Sherlock Holmes St, London', 'WC2N 5DU', 'https://i.pinimg.com/originals/56/4b/a5/564ba5a8264efa1d8ceba12814774eae.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 1800000, 'SEMI', 2, 2, false),
(11, 'Situated in a vibrant urban neighborhood, this stylish apartment showcases Art Deco design elements and contemporary flair. With its high ceilings, designer furnishings, and city views, it''s a chic retreat for those who appreciate architectural elegance and city living.', '221B Baker Street, London', 'NW1 6XE', 'https://i.pinimg.com/736x/3c/21/a1/3c21a1e9660bec2c01d6cd4c77692a3f.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 2500000, 'APARTMENT', 4, 3, true),
(12, 'Hidden away on a secluded island, this charming bungalow offers a tranquil escape surrounded by lush tropical foliage and pristine beaches. With its hammock-strewn veranda, outdoor shower, and ocean breezes, it''s a slice of paradise for those seeking relaxation in nature.', '1313 Mockingbird Lane, London', '66666', 'https://i.pinimg.com/originals/4b/69/90/4b6990b55cd6aa745c23f6a22cfbbd52.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 1200000, 'APARTMENT', 6, 5, true),
(13, 'Perched on the edge of a scenic canyon, this modern retreat offers stunning mountain vistas and access to miles of hiking trails. With its expansive deck, hot tub, and floor-to-ceiling windows, it''s an ideal haven for outdoor enthusiasts seeking adventure and rejuvenation.', 'Elm Street, Manchester', '45678', 'https://media.rightmove.co.uk/101k/100816/73152309/100816_843_IMG_18_0000.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 300000, 'APARTMENT', 6, 4, false),
(14, 'Occupying the top floor of a prestigious skyscraper, this luxurious penthouse offers unrivaled city views and opulent amenities. With its spacious layout, designer finishes, and rooftop terrace with a private pool, it''s a sanctuary for those who appreciate the finer things in life.', '1 Mayfair street, Manchester', '95014', 'https://i.pinimg.com/originals/57/a0/c2/57a0c24cfe835890f1484077428570b3.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 1000000000, 'DETACHED', 20, 7, false),
(15, 'HELP', 'Banana street, Manchester', 'M187ER', 'https://i.pinimg.com/originals/63/97/a8/6397a883457fb718e3a9f909b63973f3.jpg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_01_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_00_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_02_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_04_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_05_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_06_0001.jpeg', 'https://media.rightmove.co.uk/80k/79099/141476393/79099_RX281501_IMG_07_0001.jpeg', 250000, 'Detached', 5, 4, true);



SELECT * FROM properties;
SELECT * FROM images;
SELECT * FROM buyer;
SELECT * FROM sellers;
