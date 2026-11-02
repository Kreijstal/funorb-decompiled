/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArrayBlockSupport {
    final static void fillInts(int[] array, int start, int length, int value) {
        length = start + length - 7;
        while (start < length) {
          array[start++] = value;
          array[start++] = value;
          array[start++] = value;
          array[start++] = value;
          array[start++] = value;
          array[start++] = value;
          array[start++] = value;
          array[start++] = value;
        }
        length += 7;
        while (start < length) {
          array[start++] = value;
        }
    }

    final static void copyBytes(byte[] source, int sourceStart, byte[] destination, int destinationStart, int length) {
        if (source != destination) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        if (sourceStart == destinationStart) {
          return;
        }
        if (destinationStart <= sourceStart) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        if (destinationStart >= sourceStart + length) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        length--;
        sourceStart = sourceStart + length;
        destinationStart = destinationStart + length;
        length = sourceStart - length;
        length += 7;
        while (sourceStart >= length) {
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
        }
        length -= 7;
        while (sourceStart >= length) {
          destination[destinationStart--] = source[sourceStart--];
        }
    }

    final static void clearInts(int[] array, int start, int length) {
        length = start + length - 7;
        while (start < length) {
          array[start++] = 0;
          array[start++] = 0;
          array[start++] = 0;
          array[start++] = 0;
          array[start++] = 0;
          array[start++] = 0;
          array[start++] = 0;
          array[start++] = 0;
        }
        length += 7;
        while (start < length) {
          array[start++] = 0;
        }
    }

    final static void copyInts(int[] source, int sourceStart, int[] destination, int destinationStart, int length) {
        if (source != destination) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        if (sourceStart == destinationStart) {
          return;
        }
        if (destinationStart <= sourceStart) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        if (destinationStart >= sourceStart + length) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        length--;
        sourceStart = sourceStart + length;
        destinationStart = destinationStart + length;
        length = sourceStart - length;
        length += 7;
        while (sourceStart >= length) {
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
        }
        length -= 7;
        while (sourceStart >= length) {
          destination[destinationStart--] = source[sourceStart--];
        }
    }

    final static void copyObjects(Object[] source, int sourceStart, Object[] destination, int destinationStart, int length) {
        if (source != destination) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        if (sourceStart == destinationStart) {
          return;
        }
        if (destinationStart <= sourceStart) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        if (destinationStart >= sourceStart + length) {
          length = length + sourceStart;
          length -= 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
            destination[destinationStart++] = source[sourceStart++];
          }
          length += 7;
          while (sourceStart < length) {
            destination[destinationStart++] = source[sourceStart++];
          }
          return;
        }
        length--;
        sourceStart = sourceStart + length;
        destinationStart = destinationStart + length;
        length = sourceStart - length;
        length += 7;
        while (sourceStart >= length) {
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
          destination[destinationStart--] = source[sourceStart--];
        }
        length -= 7;
        while (sourceStart >= length) {
          destination[destinationStart--] = source[sourceStart--];
        }
    }
}
