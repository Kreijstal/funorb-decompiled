/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_g;
    static int[] field_e;
    static int[][] field_a;
    static boolean field_i;
    static String field_c;
    static ka[][][][] field_d;
    static boolean field_h;
    static int[] field_f;
    static int[][][] field_j;
    static int field_b;

    final static void b(int param0, int param1) {
        int var2 = 0;
        ba.field_i = null;
        var2 = 32 - -(4 * param0);
        kd.field_m = null;
        kd.field_m = new ra(var2, param0);
        ba.field_i = kd.field_m;
        if (wi.field_a != null) {
          L0: {
            if (fj.field_m == null) {
              uf.c(-7668);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null == pa.field_z) {
              jf.m(115);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (null == lj.field_j) {
              hl.a((byte) 50);
              break L2;
            } else {
              break L2;
            }
          }
          if (null != je.field_c[param0]) {
            if (!ol.field_a) {
              mf.a(false, je.field_c[param0], 24233, false);
              kd.field_m.b((byte) 63);
              kd.field_m.a(2, param0);
              return;
            } else {
              kd.field_m.b((byte) 63);
              kd.field_m.a(2, param0);
              return;
            }
          } else {
            kd.field_m.b((byte) 63);
            kd.field_m.a(2, param0);
            return;
          }
        } else {
          L3: {
            lb.d((byte) -81);
            if (fj.field_m == null) {
              uf.c(-7668);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == pa.field_z) {
              jf.m(115);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (null == lj.field_j) {
              hl.a((byte) 50);
              break L5;
            } else {
              break L5;
            }
          }
          if (null != je.field_c[param0]) {
            if (!ol.field_a) {
              mf.a(false, je.field_c[param0], 24233, false);
              kd.field_m.b((byte) 63);
              kd.field_m.a(2, param0);
              return;
            } else {
              kd.field_m.b((byte) 63);
              kd.field_m.a(2, param0);
              return;
            }
          } else {
            kd.field_m.b((byte) 63);
            kd.field_m.a(2, param0);
            return;
          }
        }
    }

    final static boolean a(byte param0) {
        return !ji.field_k.b(0);
    }

    final static int a(int param0, int param1) {
        param0 = (param0 & 1431655765) - -(-715827883 & param0 >>> 1);
        param0 = (param0 & 858993459) - -(-1288490189 & param0 >>> 2);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static Object a(boolean param0, boolean param1, byte[] param2) {
        oi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        oi stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        oi stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length <= 136) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = new oi();
                ((of) (Object) var3).a(50, param2);
                stackOut_4_0 = (oi) var3;
                stackIn_5_0 = stackOut_4_0;
                return (Object) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ah.F(").append(false).append(',').append(false).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_j = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        bk var4 = null;
        tc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (bk) (Object) na.field_d.c((byte) 118);
            L1: while (true) {
              if (var4 == null) {
                var5 = (tc) (Object) gf.field_q.c((byte) -18);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ue.a(var5, 2, 5);
                    var5 = (tc) (Object) gf.field_q.c(-270);
                    continue L2;
                  }
                }
              } else {
                ae.a(5, var4, -15024);
                var4 = (bk) (Object) na.field_d.c(-270);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "ah.D(" + -86 + ',' + 5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[][]{new int[7], new int[7], new int[7]};
        field_i = false;
        field_d = new ka[9][8][3][];
        field_h = false;
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_f = new int[]{20, 30, 40};
        field_c = "This password contains repeated characters, and would be easy to guess";
        field_j = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
