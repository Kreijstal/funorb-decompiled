/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kd extends se {
    static String field_i;
    static md field_n;
    static String field_m;
    static int[] field_j;
    static double[] field_l;
    private String field_p;
    static String field_k;
    private oo field_o;
    private boolean field_q;

    public static void e(byte param0) {
        field_l = null;
        field_m = null;
        field_j = null;
        field_i = null;
        field_k = null;
        field_n = null;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = CrazyCrystals.field_B;
        try {
          L0: {
            if (md.l(-81)) {
              boolean discarded$15 = kf.field_h.a(eb.field_l, false, true, vl.field_a);
              kf.field_h.b(false);
              L1: while (true) {
                if (!ge.b(-65)) {
                  break L0;
                } else {
                  boolean discarded$16 = kf.field_h.a(pj.field_q, false, c.field_p);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (ph.field_E == null) {
                  break L2;
                } else {
                  if (!ph.field_E.field_d) {
                    break L2;
                  } else {
                    no.e((byte) -23);
                    kf.field_h.b(-3264, (qm) (Object) new gn(kf.field_h, ab.field_A));
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "kd.E(" + 3 + 41);
        }
    }

    kd(ga param0, ga param1) {
        super(param0);
        ((kd) this).field_p = "";
        ((kd) this).field_q = false;
        try {
            ((kd) this).field_o = new oo(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "kd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final oi a(String param0, byte param1) {
        e var3 = null;
        RuntimeException var3_ref = null;
        oi stackIn_3_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_2_0 = null;
        oi stackOut_6_0 = null;
        oi stackOut_11_0 = null;
        oi stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((kd) this).field_o.a(param0, param1) == rk.field_c) {
              stackOut_2_0 = rk.field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((kd) this).field_p)) {
                  break L1;
                } else {
                  var3 = ke.a(param0, 28515);
                  if (var3.b(param1 ^ 82)) {
                    ((kd) this).field_p = param0;
                    ((kd) this).field_q = var3.a((byte) 47);
                    break L1;
                  } else {
                    stackOut_6_0 = ec.field_h;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
              L2: {
                if (((kd) this).field_q) {
                  stackOut_11_0 = ih.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = rk.field_c;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("kd.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        String stackOut_5_0 = null;
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
            if (((kd) this).field_o.a(param0, (byte) -122) == rk.field_c) {
              stackOut_2_0 = ((kd) this).field_o.a(param0, -21);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((kd) this).a(param0, (byte) -122) != rk.field_c) {
                var3_int = -117 / ((41 - param1) / 49);
                stackOut_7_0 = rl.field_f;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = ai.field_l;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("kd.H(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Bomb";
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_k = "This password contains your email address, and would be easy to guess";
        field_m = "This is a laser hub.<br>It beams lasers in all<br>directions. Be careful!";
    }
}
