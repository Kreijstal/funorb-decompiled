/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aj extends nt {
    static String field_t;
    static int field_B;
    private int field_E;
    private int field_w;
    private int field_s;
    private double field_z;
    private int field_v;
    static volatile boolean field_A;
    private double field_F;
    static Calendar field_y;
    static String field_x;
    static br[] field_D;
    private int field_u;
    static boolean field_C;

    aj(int param0, int param1, int param2, int param3, double param4, double param5, int param6, int param7, int param8, int param9, int param10) {
        super(param0, param1, param2, param3);
        ((aj) this).field_E = param9;
        ((aj) this).field_s = param8;
        ((aj) this).field_F = param4;
        ((aj) this).field_v = param7;
        ((aj) this).field_u = param6;
        ((aj) this).field_w = param10;
        ((aj) this).field_z = param5;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -121) {
                break L1;
              } else {
                field_A = false;
                break L1;
              }
            }
            L2: {
              if (((aj) this).field_s == 0) {
                ht.field_e[2 - -((aj) this).field_E].a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)((double)((aj) this).field_w / 14.0 * 3072.0), (int)(65535.0 * ((aj) this).field_F), 1, 0, 2);
                break L2;
              } else {
                if (((aj) this).field_s == 1) {
                  dc.field_ab[((aj) this).field_E + 2].a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)((double)((aj) this).field_w / 14.0 * 3072.0), (int)(((aj) this).field_F * 65535.0), 1, 0, 2);
                  break L2;
                } else {
                  if (((aj) this).field_s != 2) {
                    if (((aj) this).field_s != 3) {
                      if (((aj) this).field_s == 4) {
                        ak.field_a[2 + ((aj) this).field_E].a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)((double)((aj) this).field_w / 14.0 * 3072.0), (int)(((aj) this).field_F * 65535.0), 1, 0, 2);
                        break L2;
                      } else {
                        if (((aj) this).field_s == 5) {
                          mr.field_e[2 - -((aj) this).field_E].a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)(3072.0 * ((double)((aj) this).field_w / 14.0)), (int)(((aj) this).field_F * 65535.0), 1, 0, 2);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      s.field_n[2 + ((aj) this).field_E].a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)((double)((aj) this).field_w / 14.0 * 3072.0), (int)(65535.0 * ((aj) this).field_F), 1, 0, 2);
                      break L2;
                    }
                  } else {
                    hv.field_d[2 - -((aj) this).field_E].a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)((double)((aj) this).field_w / 14.0 * 3072.0), (int)(65535.0 * ((aj) this).field_F), 1, 0, 2);
                    break L2;
                  }
                }
              }
            }
            if (90 > ((aj) this).field_p) {
              break L0;
            } else {
              th.field_B.a((float)(((aj) this).field_k >> 8), (float)(((aj) this).field_o >> 8), (int)((double)((aj) this).field_w / 14.0 * 3072.0), (int)(65535.0 * ((aj) this).field_F), 1, 0, 2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("aj.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final static bj a(boolean param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        bj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = null;
                bj discarded$2 = aj.a(true, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = new bj(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("aj.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        si var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        si stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        si stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (136 >= param1.length) {
                if (param0 < -116) {
                  stackOut_9_0 = cp.a(param1, 0);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                var3 = new si();
                ((nn) (Object) var3).a(param1, -112);
                stackOut_4_0 = (si) var3;
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
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("aj.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + false + ')');
        }
        return (Object) (Object) stackIn_10_0;
    }

    final boolean a(int param0) {
        L0: {
          if (90 > ((aj) this).field_p) {
            ((aj) this).field_o = ((aj) this).field_o + ((aj) this).field_v;
            ((aj) this).field_k = ((aj) this).field_k + ((aj) this).field_u;
            ((aj) this).field_F = ((aj) this).field_F + ((aj) this).field_z;
            ((aj) this).field_u = 251 * ((aj) this).field_u / 256;
            ((aj) this).field_v = 251 * ((aj) this).field_v / 256;
            ((aj) this).field_v = ((aj) this).field_v + 1;
            ((aj) this).field_u = ((aj) this).field_u + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -2567) {
          field_A = false;
          return super.a(-2567);
        } else {
          return super.a(-2567);
        }
    }

    final static hr[] a(ri[] param0, ha param1, int param2) {
        hr[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        hr[] var6 = null;
        hr[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        hr[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6 = new hr[param0.length];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (param0.length <= var4) {
                stackOut_4_0 = (hr[]) var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var6[var4] = param1.a(param0[var4], false);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("aj.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 28513 + ')');
        }
        return stackIn_5_0;
    }

    public static void e(int param0) {
        field_y = null;
        field_x = null;
        field_t = null;
        field_D = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Please check if address is correct";
        field_B = 0;
        field_x = "Create your own free Jagex account";
        field_A = false;
        field_y = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
