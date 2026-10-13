/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArrayOperations {
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

    final static void clearInts(int[] values, int offset, int length) {
        length = offset + length - 7;
        while (offset < length) {
          values[offset++] = 0;
          values[offset++] = 0;
          values[offset++] = 0;
          values[offset++] = 0;
          values[offset++] = 0;
          values[offset++] = 0;
          values[offset++] = 0;
          values[offset++] = 0;
        }
        length += 7;
        while (offset < length) {
          values[offset++] = 0;
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
}
