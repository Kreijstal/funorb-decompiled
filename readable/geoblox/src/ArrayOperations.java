/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArrayOperations {
    final static void clearInts(int[] values, int writeIndex, int lengthOrEndIndex) {
        lengthOrEndIndex = writeIndex + lengthOrEndIndex - 7;
        while (writeIndex < lengthOrEndIndex) {
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
            values[writeIndex++] = 0;
        }
        lengthOrEndIndex += 7;
        while (writeIndex < lengthOrEndIndex) {
            values[writeIndex++] = 0;
        }
    }

    final static void copyBytes(byte[] sourceArray, int sourceIndex, byte[] destinationArray, int destinationIndex, int lengthOrSourceBoundary) {
        if (sourceArray != destinationArray) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        if (sourceIndex == destinationIndex) {
            return;
        }
        if (destinationIndex <= sourceIndex) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        if (destinationIndex >= sourceIndex + lengthOrSourceBoundary) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        lengthOrSourceBoundary--;
        sourceIndex = sourceIndex + lengthOrSourceBoundary;
        destinationIndex = destinationIndex + lengthOrSourceBoundary;
        lengthOrSourceBoundary = sourceIndex - lengthOrSourceBoundary;
        lengthOrSourceBoundary += 7;
        while (sourceIndex >= lengthOrSourceBoundary) {
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
        }
        lengthOrSourceBoundary -= 7;
        while (sourceIndex >= lengthOrSourceBoundary) {
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
        }
    }

    final static void copyInts(int[] sourceArray, int sourceIndex, int[] destinationArray, int destinationIndex, int lengthOrSourceBoundary) {
        if (sourceArray != destinationArray) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        if (sourceIndex == destinationIndex) {
            return;
        }
        if (destinationIndex <= sourceIndex) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        if (destinationIndex >= sourceIndex + lengthOrSourceBoundary) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        lengthOrSourceBoundary--;
        sourceIndex = sourceIndex + lengthOrSourceBoundary;
        destinationIndex = destinationIndex + lengthOrSourceBoundary;
        lengthOrSourceBoundary = sourceIndex - lengthOrSourceBoundary;
        lengthOrSourceBoundary += 7;
        while (sourceIndex >= lengthOrSourceBoundary) {
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
        }
        lengthOrSourceBoundary -= 7;
        while (sourceIndex >= lengthOrSourceBoundary) {
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
        }
    }

    final static void copyReferences(Object[] sourceArray, int sourceIndex, Object[] destinationArray, int destinationIndex, int lengthOrSourceBoundary) {
        if (sourceArray != destinationArray) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        if (sourceIndex == destinationIndex) {
            return;
        }
        if (destinationIndex <= sourceIndex) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        if (destinationIndex >= sourceIndex + lengthOrSourceBoundary) {
            lengthOrSourceBoundary = lengthOrSourceBoundary + sourceIndex;
            lengthOrSourceBoundary -= 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            lengthOrSourceBoundary += 7;
            while (sourceIndex < lengthOrSourceBoundary) {
                destinationArray[destinationIndex++] = sourceArray[sourceIndex++];
            }
            return;
        }
        lengthOrSourceBoundary--;
        sourceIndex = sourceIndex + lengthOrSourceBoundary;
        destinationIndex = destinationIndex + lengthOrSourceBoundary;
        lengthOrSourceBoundary = sourceIndex - lengthOrSourceBoundary;
        lengthOrSourceBoundary += 7;
        while (sourceIndex >= lengthOrSourceBoundary) {
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
        }
        lengthOrSourceBoundary -= 7;
        while (sourceIndex >= lengthOrSourceBoundary) {
            destinationArray[destinationIndex--] = sourceArray[sourceIndex--];
        }
    }
}
