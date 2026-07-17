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
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        oi stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length <= 136) {
                if (!param0) {
                  if (!param1) {
                    stackOut_12_0 = (byte[]) param2;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = ek.a(param2, -48);
                    stackIn_11_0 = stackOut_10_0;
                    return (Object) (Object) stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
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
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ah.F(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return (Object) (Object) stackIn_13_0;
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
            L1: {
              var4 = (bk) (Object) na.field_d.c((byte) 118);
              if (param0 == -86) {
                break L1;
              } else {
                field_i = true;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                var5 = (tc) (Object) gf.field_q.c((byte) -18);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ue.a(var5, 2, 5);
                    var5 = (tc) (Object) gf.field_q.c(param0 ^ 344);
                    continue L3;
                  }
                }
              } else {
                ae.a(5, var4, -15024);
                var4 = (bk) (Object) na.field_d.c(-270);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "ah.D(" + param0 + 44 + 5 + 41);
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
