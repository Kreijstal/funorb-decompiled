/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends nm {
    private int field_o;
    static String field_p;
    boolean field_l;
    static String field_j;
    int[] field_n;
    int field_k;
    static jp field_i;
    int field_m;

    final boolean c(int param0) {
        if (param0 != 1) {
            return true;
        }
        return ((p) this).field_n.length == ((p) this).field_o ? true : false;
    }

    final int a(byte param0) {
        if (param0 != -104) {
          p.b(true);
          int fieldTemp$4 = ((p) this).field_o;
          ((p) this).field_o = ((p) this).field_o + 1;
          return ((p) this).field_n[fieldTemp$4];
        } else {
          int fieldTemp$5 = ((p) this).field_o;
          ((p) this).field_o = ((p) this).field_o + 1;
          return ((p) this).field_n[fieldTemp$5];
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param3 >= 0) {
          if (param3 <= 11) {
            if (param1 >= 1) {
              if (bg.a(param2, 29, param3) < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static String a() {
        String var1 = "";
        if (null != eo.field_k) {
            var1 = eo.field_k.j((byte) -76);
        }
        if (0 == var1.length()) {
            int discarded$0 = 100;
            var1 = dg.b();
        }
        if (!(var1.length() != 0)) {
            var1 = ud.field_t;
        }
        return var1;
    }

    public static void b(boolean param0) {
        field_j = null;
        field_i = null;
        field_p = null;
        if (param0) {
            p.b(true);
        }
    }

    final static jp a(int param0, jp param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        jp var7 = null;
        jp stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var7 = new jp(param1.field_D + param2 * 2, param1.field_C + param2 * 2);
            var7.g();
            var5 = 0;
            L1: while (true) {
              if (param2 <= var5) {
                L2: {
                  kc.field_q.a((byte) 104);
                  var7.field_F = -param2 + param1.field_F;
                  if (param0 == -12) {
                    break L2;
                  } else {
                    field_j = null;
                    break L2;
                  }
                }
                var7.field_E = param1.field_E + -param2;
                stackOut_6_0 = (jp) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param1.d(param2 - param1.field_E, -param1.field_F + param2, param3);
                lb.e(1, 1, 0, 0, var7.field_D, var7.field_C);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("p.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public p() {
        ((p) this).field_n = new int[5];
        ((p) this).field_o = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Login: ";
        field_j = "Allow spectators?";
    }
}
