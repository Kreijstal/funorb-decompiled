/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static boolean field_g;
    static boolean field_c;
    static int field_b;
    static boolean field_e;
    static qg field_f;
    static String field_a;
    static String field_d;

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (tg.field_g <= 0) {
              break L0;
            } else {
              int fieldTemp$6 = tg.field_g - 1;
              tg.field_g = tg.field_g - 1;
              var2_ref_byte__ = to.field_d[fieldTemp$6];
              to.field_d[tg.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          field_c = true;
          if (param0 != 5000) {
            break L1;
          } else {
            if (0 >= dj.field_a) {
              break L1;
            } else {
              int fieldTemp$7 = dj.field_a - 1;
              dj.field_a = dj.field_a - 1;
              var2_ref_byte__ = rp.field_c[fieldTemp$7];
              rp.field_c[dj.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (hm.field_s > 0) {
              int fieldTemp$8 = hm.field_s - 1;
              hm.field_s = hm.field_s - 1;
              var2_ref_byte__ = lm.field_l[fieldTemp$8];
              lm.field_l[hm.field_s] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (lo.field_c == null) {
            break L3;
          } else {
            var2 = 0;
            L4: while (true) {
              if (var2 >= fp.field_c.length) {
                break L3;
              } else {
                if (param0 == fp.field_c[var2]) {
                  if (0 < vc.field_c[var2]) {
                    vc.field_c[var2] = vc.field_c[var2] - 1;
                    var3 = lo.field_c[var2][vc.field_c[var2] - 1];
                    lo.field_c[var2][vc.field_c[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_f = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, String param6, String param7) {
        h var8 = null;
        RuntimeException var8_ref = null;
        Object var9 = null;
        h stackIn_4_0 = null;
        h stackIn_5_0 = null;
        h stackIn_6_0 = null;
        cf stackIn_6_1 = null;
        h stackIn_7_0 = null;
        h stackIn_8_0 = null;
        h stackIn_9_0 = null;
        cf stackIn_9_1 = null;
        h stackIn_12_0 = null;
        h stackIn_13_0 = null;
        h stackIn_14_0 = null;
        cf stackIn_14_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        h stackOut_3_0 = null;
        h stackOut_5_0 = null;
        cf stackOut_5_1 = null;
        h stackOut_4_0 = null;
        Object stackOut_4_1 = null;
        h stackOut_6_0 = null;
        h stackOut_8_0 = null;
        Object stackOut_8_1 = null;
        h stackOut_7_0 = null;
        cf stackOut_7_1 = null;
        h stackOut_11_0 = null;
        h stackOut_13_0 = null;
        cf stackOut_13_1 = null;
        h stackOut_12_0 = null;
        Object stackOut_12_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var8 = hp.field_b[param2];
            if (var8 == null) {
              return;
            } else {
              L1: {
                stackOut_3_0 = (h) var8;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param7 != null) {
                  stackOut_5_0 = (h) (Object) stackIn_5_0;
                  stackOut_5_1 = hd.a(false, param0, "da_raider_" + param7);
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = (h) (Object) stackIn_4_0;
                  stackOut_4_1 = null;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = (cf) (Object) stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                stackIn_6_0.field_p = stackIn_6_1;
                stackOut_6_0 = (h) var8;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param1 == null) {
                  stackOut_8_0 = (h) (Object) stackIn_8_0;
                  stackOut_8_1 = null;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = (cf) (Object) stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = (h) (Object) stackIn_7_0;
                  stackOut_7_1 = hd.a(false, param3, "da_raider_" + param1);
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                stackIn_9_0.field_g = stackIn_9_1;
                if (param4 >= 123) {
                  break L3;
                } else {
                  var9 = null;
                  kn.a(19, (String) null, 101, 48, 18, -38, (String) null, (String) null);
                  break L3;
                }
              }
              L4: {
                stackOut_11_0 = (h) var8;
                stackIn_13_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (param6 != null) {
                  stackOut_13_0 = (h) (Object) stackIn_13_0;
                  stackOut_13_1 = hd.a(false, param5, "da_raider_" + param6);
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L4;
                } else {
                  stackOut_12_0 = (h) (Object) stackIn_12_0;
                  stackOut_12_1 = null;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = (cf) (Object) stackOut_12_1;
                  break L4;
                }
              }
              stackIn_14_0.field_a = stackIn_14_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8_ref;
            stackOut_16_1 = new StringBuilder().append("kn.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param6 == null) {
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
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param7 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final static cn[] a(nh param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cn[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a(param1, 1000);
              if (param3 < -43) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            var5 = param0.a(0, param2, var4_int);
            stackOut_2_0 = oi.a(0, var4_int, var5, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("kn.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Retry";
        field_d = "Open in popup window";
    }
}
