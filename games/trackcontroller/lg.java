/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static char[] field_b;
    static long field_a;
    static cg[] field_d;
    static String field_c;

    final static boolean c(int param0) {
        boolean discarded$2 = false;
        kj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        kj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (kj) ((Object) si.field_a.b(2));
            var1 = var4;
            if (var1 != null) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  discarded$2 = lg.c(-128);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                if (var2 >= var1.field_n) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (null == var4.field_j[var2]) {
                      break L3;
                    } else {
                      if (var4.field_j[var2].field_f != 0) {
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if (var4.field_v[var2] != null) {
                      if (-1 == (var4.field_v[var2].field_f ^ -1)) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "lg.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final static h a(int param0) {
        try {
            boolean discarded$2 = false;
            Throwable var1 = null;
            h stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            h stackOut_2_0 = null;
            L0: {
              if (param0 >= 54) {
                break L0;
              } else {
                discarded$2 = lg.c(106);
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (h) (Class.forName("bi").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L1;
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

    public static void b(int param0) {
        if (param0 != 16228) {
            return;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_b = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_c = "Click";
    }
}
