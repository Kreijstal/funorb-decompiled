/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArrayUtils {
    final static void fill(int[] array, int offset, int length, int value) {
        length = offset + length - 7;
        while (offset < length) {
          array[offset++] = value;
          array[offset++] = value;
          array[offset++] = value;
          array[offset++] = value;
          array[offset++] = value;
          array[offset++] = value;
          array[offset++] = value;
          array[offset++] = value;
        }
        length += 7;
        while (offset < length) {
          array[offset++] = value;
        }
    }

    final static void clear(int[] array, int offset, int length) {
        length = offset + length - 7;
        while (offset < length) {
          array[offset++] = 0;
          array[offset++] = 0;
          array[offset++] = 0;
          array[offset++] = 0;
          array[offset++] = 0;
          array[offset++] = 0;
          array[offset++] = 0;
          array[offset++] = 0;
        }
        length += 7;
        while (offset < length) {
          array[offset++] = 0;
        }
    }

    final static void copy(byte[] source, int sourceOffset, byte[] destination, int destinationOffset, int length) {
        if (source != destination) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        if (sourceOffset == destinationOffset) {
          return;
        }
        if (destinationOffset <= sourceOffset) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        if (destinationOffset >= sourceOffset + length) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        length--;
        sourceOffset = sourceOffset + length;
        destinationOffset = destinationOffset + length;
        length = sourceOffset - length;
        length += 7;
        while (sourceOffset >= length) {
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
        }
        length -= 7;
        while (sourceOffset >= length) {
          destination[destinationOffset--] = source[sourceOffset--];
        }
    }

    final static void copy(Object[] source, int sourceOffset, Object[] destination, int destinationOffset, int length) {
        if (source != destination) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        if (sourceOffset == destinationOffset) {
          return;
        }
        if (destinationOffset <= sourceOffset) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        if (destinationOffset >= sourceOffset + length) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        length--;
        sourceOffset = sourceOffset + length;
        destinationOffset = destinationOffset + length;
        length = sourceOffset - length;
        length += 7;
        while (sourceOffset >= length) {
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
        }
        length -= 7;
        while (sourceOffset >= length) {
          destination[destinationOffset--] = source[sourceOffset--];
        }
    }

    final static void copy(int[] source, int sourceOffset, int[] destination, int destinationOffset, int length) {
        if (source != destination) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        if (sourceOffset == destinationOffset) {
          return;
        }
        if (destinationOffset <= sourceOffset) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        if (destinationOffset >= sourceOffset + length) {
          length = length + sourceOffset;
          length -= 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
            destination[destinationOffset++] = source[sourceOffset++];
          }
          length += 7;
          while (sourceOffset < length) {
            destination[destinationOffset++] = source[sourceOffset++];
          }
          return;
        }
        length--;
        sourceOffset = sourceOffset + length;
        destinationOffset = destinationOffset + length;
        length = sourceOffset - length;
        length += 7;
        while (sourceOffset >= length) {
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
          destination[destinationOffset--] = source[sourceOffset--];
        }
        length -= 7;
        while (sourceOffset >= length) {
          destination[destinationOffset--] = source[sourceOffset--];
        }
    }
}
