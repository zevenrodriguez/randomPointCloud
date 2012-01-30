import rhinoscriptsyntax as rs

pointsList = []
file = open("points.txt")

inFile = file.readlines()
file.close()

for points in inFile:
#	print type(points)
	points = points.strip()
	pointsList.append(points.split(" "))
#	print points

for pointsCords in pointsList:
	#print pointsCords
	#print pointsCords[0]
	
	rs.AddPoint((pointsCords[1],pointsCords[2],pointsCords[3]))
	#for indiPoints in pointsCords:
	#	 	print indiPoints

#print inFile