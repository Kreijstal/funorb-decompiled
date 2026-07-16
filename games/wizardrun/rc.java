/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int field_a;

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                rc.a(93, 80);
                break L0;
              }
            }
            try {
              L1: {
                Object discarded$1 = cl.a(new Object[1], "resizing", param0 + 30383, jg.f(1));
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          if ((Object) (Object) vb.field_F != this) {
            if (this != (Object) (Object) fc.field_b) {
              if ((Object) (Object) hi.field_l == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static wd a(String[] args, byte param1) {
        wd var2 = new wd(false);
        var2.field_c = args;
        if (param1 >= -63) {
            return null;
        }
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        oi discarded$0 = new oi();
    }
}
