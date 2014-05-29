import sys
import BaseHTTPServer
import urllib2
import sre

outf = open('texts3.txt','w')
sys.stdout = outf;

for i in range(20,30):                                       
	sock = urllib2.urlopen("https://www.goodreads.com/quotes?page="+str(i))
	htmlSource = sock.read()                            
	sock.close()                                        
	#print htmlSource 
	matches = sre.findall('&ldquo;(.*?)&rdquo;', htmlSource)
	for stri in matches:
		print stri