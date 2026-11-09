/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidationError {
    static IntrusiveDeque field_a;
    static String[] weekdayShortNames;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean hasAnyMask540800(int flags, byte guard, int unused) {
        if (guard >= -57) {
          return true;
        }
        return (540800 & flags) != 0 ? true : false;
    }

    final static MouseWheelInput createMouseWheelInput(byte guard) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (guard > -125) {
              field_c = -74;
            }
            stackIn_3_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        weekdayShortNames = null;
        field_a = null;
        if (param0 > -31) {
          EmailValidationError.releaseStatics(-122);
        }
    }

    static {
        field_a = new IntrusiveDeque();
        weekdayShortNames = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
