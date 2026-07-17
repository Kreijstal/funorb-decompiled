/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends gf implements fi, qg {
    wk field_n;
    static ak field_k;
    static ri field_p;
    static int field_m;
    static boolean field_l;
    static String field_o;

    public dj() {
    }

    public final void a(pm param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((dj) this).field_n = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dj.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public static void g(int param0) {
        field_o = null;
        field_k = null;
        field_p = null;
    }

    public final boolean b(int param0) {
        if (param0 != -3) {
            return false;
        }
        return ((dj) this).field_n.a(1872);
    }

    final re f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        re stackIn_2_0 = null;
        re stackIn_6_0 = null;
        re stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        re stackOut_5_0 = null;
        re stackOut_9_0 = null;
        re stackOut_1_0 = null;
        try {
          L0: {
            var2_int = ((dj) this).field_n.i(1);
            var3 = ((dj) this).field_n.j(param0 + -191);
            var4 = ((dj) this).field_n.g((byte) -118);
            var5 = oa.b((byte) -63);
            if (var4 >= 1890) {
              if (var4 > var5 + param0) {
                stackOut_5_0 = jq.field_b;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (!dq.a((byte) -82, var3, var2_int, var4)) {
                  stackOut_9_0 = jq.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = jq.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return jq.field_b;
        }
        if (decompiledRegionSelector0 == 0) {
          return db.field_b;
        } else {
          return stackIn_10_0;
        }
    }

    public final void a(pm param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            ((dj) this).a(-1306);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "dj.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_5_0 = null;
        L0: {
          if (param0 == -3) {
            break L0;
          } else {
            String discarded$2 = ((dj) this).e(-103);
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              var2_int = ((dj) this).field_n.i(1);
              var3 = ((dj) this).field_n.j(param0 + -191);
              var4 = ((dj) this).field_n.g((byte) -86);
              var5 = oa.b((byte) -44);
              if (var4 < 1890) {
                break L2;
              } else {
                if (var4 > var5 + -3) {
                  break L2;
                } else {
                  if (!dq.a((byte) -65, var3, var2_int, var4)) {
                    decompiledRegionSelector0 = 0;
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            }
            stackOut_5_0 = vl.a(ia.field_v, new String[2], 2);
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 0;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return wm.field_T;
        } else {
          return (String) (Object) stackIn_9_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ak();
        field_m = 4;
        field_o = "SCORE";
    }
}
