/*
 * Data types
 * Primitives: int, double, char, boolean,byte, short, long, float
 * Non-primitives: String, Arrays, Classes, Interfaces
 * Primitives are the basic data types in Java, they are not objects.
 * 
 * Primitives are stored in the stack memory, they are stored directly.
 * Non-primitives are stored in the heap memory, they are stored as references.
 * Primitives are immutable, they cannot be changed.
 * Non-primitives can be mutable or immutable, depending on the type.
 * Primitives are passed by value, they are copied when passed to a method.
 * Non-primitives are passed by reference, they are not copied when passed to a
 * method.
 * Primitives have a fixed size, they cannot be changed.
 * Non-primitives can have variable size, depending on the type and the data
 * stored.
 * 
 * Non-primitives are objects, they can be created using classes.
 * Non-primitives are reference types, they store the address of the object in
 * memory.
 * Primitives store the actual value.
 * 
 * size of primitives:
 * int: 4 bytes
 * double: 8 bytes char: 2 bytes boolean: 1 byte
 * byte: 1 byte short: 2 bytes long: 8 bytes float: 4 bytes
 */
public class Basics {
    public static void main(String[] args) {
        int __ = 24;
        System.out.println(__);
    }
}