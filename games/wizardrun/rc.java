/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int field_a;

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
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
                cl.a(new Object[]{new Integer(param1)}, "resizing", param0 + 30383, jg.f(1));
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
          if (vb.field_F != this) {
            if (this != fc.field_b) {
              if (hi.field_l == this) {
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
        wd var2 = null;
        RuntimeException var2_ref = null;
        wd stackIn_2_0 = null;
        wd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new wd(false);
            var2.field_c = args;
            if (param1 < -63) {
              stackIn_4_0 = (wd) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("rc.C(");

            if (args == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = 0;
        oi discarded$0 = new oi();
    }
}
