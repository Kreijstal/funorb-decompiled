/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static jn field_a;
    static String[] field_b;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 >= -57) {
            return true;
        }
        return (540800 & param0 ^ -1) != -1 ? true : false;
    }

    final static ns a(byte param0) {
        try {
            Throwable var1 = null;
            ns stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ns stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 <= -125) {
                    break L1;
                  } else {
                    field_c = -74;
                    break L1;
                  }
                }
                stackOut_2_0 = (ns) (Class.forName("gp").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -31) {
            dk.a(-122);
        }
    }

    static {
        field_a = new jn();
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
