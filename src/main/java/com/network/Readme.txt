java.net package provides support for the two common network protocols: TCP & UDP

Socket - provides a communication mechanisms between two computers using TCP. it's an endpoint for a two way communication, bound to a port.

Basic client-server connection:
Prerequisite- server is in stand-by, waiting for connections.
1. Client opens a socket and attempts to connect to a server.
2. When the connection is made, server opens a socket on it's end of communication.
socket to socket connection
