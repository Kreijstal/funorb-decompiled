/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends l {
    static boolean field_n;
    static he field_h;
    static int field_k;
    static String field_i;
    static int field_l;
    static int field_g;
    int field_o;
    static String field_m;
    int field_j;

    final static void a(int param0, eh param1) {
        gj var2 = null;
        if (param0 != 1048576) {
            return;
        }
        try {
            gj.a(param1.a("headers.packvorbis", 100, ""));
            var2 = gj.a(param1, "jagex logo2.packvorbis", "");
            ml discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "la.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_m = null;
    }

    final static void a(int param0, int param1, boolean param2, sc param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (null == wc.field_f) {
              break L0;
            } else {
              wl.a(1048576, param0 + -10509, param1, param3, param2);
              break L0;
            }
          }
          if (param0 == -1) {
            if (vg.field_B != null) {
              var4 = (Object) (Object) ae.field_g;
              synchronized (var4) {
                L1: {
                  vg.field_B.a(param1, true, -1);
                  if (param3 != qi.field_b) {
                    L2: {
                      vg.field_B.c(false);
                      ae.field_g.h();
                      qi.field_b = param3;
                      if (null == qi.field_b) {
                        break L2;
                      } else {
                        vg.field_B.a(param2, 37, qi.field_b);
                        break L2;
                      }
                    }
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("la.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        ab var2 = null;
        Object var3 = null;
        we.field_c.a(param1, 24960);
        var2 = fh.field_c;
        if (param0 >= -60) {
          L0: {
            var3 = null;
            la.a(22, -99, true, (sc) null);
            if (var2 != null) {
              var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (var2 != null) {
              var2.a(0, we.field_c.field_J, we.field_c.field_Bb);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private la() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Ask to join <%0>'s game";
        field_n = false;
        field_m = "Hide game chat";
        field_g = 0;
    }
}
