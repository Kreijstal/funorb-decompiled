/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gd {
    static String field_o;
    static long[] field_k;
    ro field_l;
    static String field_a;
    ro field_h;
    ro field_f;
    ro field_g;
    long field_e;
    int field_c;
    fs field_n;
    fs field_b;
    volatile int field_d;
    volatile int field_j;
    byte field_m;
    fv field_i;

    final static ta a(ki param0, byte param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ta stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ta stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            var5 = param0.a(param2, param3, -1);
            var4 = var5;
            if (var5 != null) {
              if (param1 < -1) {
                stackOut_6_0 = new ta(var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ta) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ta) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("gd.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_7_0;
    }

    final fv a(int param0, boolean param1, int param2, byte param3, byte param4) {
        long var6 = (long)param2 + ((long)param0 << 32);
        fv var8 = new fv();
        var8.field_t = param1 ? true : false;
        var8.field_l = var6;
        var8.field_z = param4;
        int var9 = -16 % ((0 - param3) / 43);
        if (param1) {
            if (!(((gd) this).d(-2115911413) > -21)) {
                throw new RuntimeException();
            }
            ((gd) this).field_l.a((pj) (Object) var8, (byte) -118);
        } else {
            if (!(-21 > ((gd) this).a((byte) -120))) {
                throw new RuntimeException();
            }
            ((gd) this).field_f.a((pj) (Object) var8, (byte) -107);
        }
        return var8;
    }

    abstract void b(int param0);

    final static void a(int param0, int param1, jn param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_f != 1) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var6_int = stackIn_6_0;
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var6_int == 0) {
                  stackOut_9_0 = 50;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_8_0 = 25;
                  stackIn_10_0 = stackOut_8_0;
                  break L3;
                }
              }
              if (stackIn_10_0 <= var7) {
                var7 = 0;
                L4: while (true) {
                  L5: {
                    if (var6_int == 0) {
                      stackOut_15_0 = 30;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = 25;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  if (stackIn_16_0 <= var7) {
                    break L0;
                  } else {
                    int discarded$3 = -96;
                    var8 = new float[]{0.0f, (float)(-(1 + fi.a(10, he.field_o)))};
                    float[] dupTemp$4 = kt.a((byte) -20, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                    var11 = dupTemp$4;
                    var8 = dupTemp$4;
                    param2.a((ms) (Object) new as(64, param4 - -((int)var11[0] << 11), ((int)var11[1] << 11) + param1, 16711680, -(int)var11[0] << 8, -(int)var11[1] << 8, 1), (byte) 39);
                    var7++;
                    continue L4;
                  }
                }
              } else {
                int discarded$5 = -96;
                var8 = new float[]{0.0f, (float)(-(fi.a(10, he.field_o) + 1))};
                var15 = kt.a((byte) -81, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                var14 = var15;
                var13 = var14;
                var12 = var13;
                var10 = var12;
                var8 = var10;
                param2.a((ms) (Object) new as(64, ((int)var15[0] << 11) + param4, ((int)var15[1] << 11) + param1, 16711680, -(int)var15[0] << 8, -(int)var15[1] << 8, 0), (byte) 39);
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("gd.M(").append(10).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 61 + ',' + param4 + ',' + 16711680 + ')');
        }
    }

    final boolean a(int param0) {
        int var2 = 111 / ((param0 - 76) / 32);
        return ((gd) this).d(-2115911413) >= 20 ? true : false;
    }

    abstract void a(boolean param0, byte param1, Object param2);

    final static boolean b() {
        rd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        rd var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (rd) (Object) qr.field_c.b(100);
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var1.field_p <= var2) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L2: {
                    if (null != var4.field_o[var2]) {
                      if (var4.field_o[var2].field_c == 0) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_s[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_s[var2].field_c != 0) {
                        break L3;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1_ref, "gd.K(" + 125 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final int d(int param0) {
        if (param0 != -2115911413) {
          boolean discarded$2 = ((gd) this).b(true);
          return ((gd) this).field_l.a((byte) 2) + ((gd) this).field_h.a((byte) 2);
        } else {
          return ((gd) this).field_l.a((byte) 2) + ((gd) this).field_h.a((byte) 2);
        }
    }

    final static lh a(byte param0, int param1) {
        lh var2 = null;
        if (param0 != -82) {
          field_k = null;
          var2 = new lh();
          no.field_d.a((ms) (Object) var2, (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        } else {
          var2 = new lh();
          no.field_d.a((ms) (Object) var2, (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        }
    }

    final boolean b(boolean param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            var3 = null;
            ta discarded$6 = gd.a((ki) null, (byte) -79, (String) null, (String) null);
            if (((gd) this).a((byte) -100) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((gd) this).a((byte) -100) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(byte param0) {
        if (param0 >= -82) {
          ((gd) this).field_n = null;
          return ((gd) this).field_f.a((byte) 2) + ((gd) this).field_g.a((byte) 2);
        } else {
          return ((gd) this).field_f.a((byte) 2) + ((gd) this).field_g.a((byte) 2);
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (param0) {
            lh discarded$0 = gd.a((byte) -88, 27);
            field_a = null;
            field_k = null;
            return;
        }
        field_a = null;
        field_k = null;
    }

    abstract void c(int param0);

    abstract boolean c(byte param0);

    gd() {
        ((gd) this).field_l = new ro();
        ((gd) this).field_h = new ro();
        ((gd) this).field_f = new ro();
        ((gd) this).field_g = new ro();
        ((gd) this).field_n = new fs(6);
        ((gd) this).field_d = 0;
        ((gd) this).field_j = 0;
        ((gd) this).field_m = (byte) 0;
        ((gd) this).field_b = new fs(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new long[32];
        field_o = "ACHIEVEMENTS";
    }
}
