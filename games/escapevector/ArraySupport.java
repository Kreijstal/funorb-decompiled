/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArraySupport {
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

    final static void copy(char[] source, int sourceOffset, char[] destination, int destinationOffset, int length) {
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

    final static void fill(int[] destination, int offset, int length, int value) {
        length = offset + length - 7;
        while (offset < length) {
          destination[offset++] = value;
          destination[offset++] = value;
          destination[offset++] = value;
          destination[offset++] = value;
          destination[offset++] = value;
          destination[offset++] = value;
          destination[offset++] = value;
          destination[offset++] = value;
        }
        length += 7;
        while (offset < length) {
          destination[offset++] = value;
        }
    }

    final static void fill(byte[] destination, int offset, int length, byte value) {
        length = offset + length - 7;
        while (offset < length) {
          int incrementValue$0 = offset;
          offset++;
          destination[incrementValue$0] = (byte)value;
          int incrementValue$1 = offset;
          offset++;
          destination[incrementValue$1] = (byte)value;
          int incrementValue$2 = offset;
          offset++;
          destination[incrementValue$2] = (byte)value;
          int incrementValue$3 = offset;
          offset++;
          destination[incrementValue$3] = (byte)value;
          int incrementValue$4 = offset;
          offset++;
          destination[incrementValue$4] = (byte)value;
          int incrementValue$5 = offset;
          offset++;
          destination[incrementValue$5] = (byte)value;
          int incrementValue$6 = offset;
          offset++;
          destination[incrementValue$6] = (byte)value;
          int incrementValue$7 = offset;
          offset++;
          destination[incrementValue$7] = (byte)value;
        }
        length += 7;
        while (offset < length) {
          int incrementValue$8 = offset;
          offset++;
          destination[incrementValue$8] = (byte)value;
        }
    }

    final static void clear(int[] destination, int offset, int length) {
        length = offset + length - 7;
        while (offset < length) {
          destination[offset++] = 0;
          destination[offset++] = 0;
          destination[offset++] = 0;
          destination[offset++] = 0;
          destination[offset++] = 0;
          destination[offset++] = 0;
          destination[offset++] = 0;
          destination[offset++] = 0;
        }
        length += 7;
        while (offset < length) {
          destination[offset++] = 0;
        }
    }
}
