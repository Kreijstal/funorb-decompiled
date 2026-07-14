/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static char[] field_b;
    static long field_a;
    static cg[] field_d;
    static String field_c;

    final static boolean c(int param0) {
        kj var1 = null;
        int var2 = 0;
        int var3 = 0;
        kj var4 = null;
        var3 = TrackController.field_F ? 1 : 0;
        var4 = (kj) (Object) si.field_a.b(2);
        var1 = var4;
        if (var1 != null) {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              boolean discarded$2 = lg.c(-128);
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= var1.field_n) {
              return true;
            } else {
              L2: {
                if (null == var4.field_j[var2]) {
                  break L2;
                } else {
                  if (var4.field_j[var2].field_f != 0) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              if (var4.field_v[var2] != null) {
                if (-1 == (var4.field_v[var2].field_f ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static h a(int param0) {
        try {
            Throwable var1 = null;
            h stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            h stackOut_2_0 = null;
            L0: {
              if (param0 >= 54) {
                break L0;
              } else {
                boolean discarded$2 = lg.c(106);
                break L0;
              }
            }
            try {
              stackOut_2_0 = (h) Class.forName("bi").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void b(int param0) {
        if (param0 != 16228) {
            return;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_c = "Click";
    }
}
