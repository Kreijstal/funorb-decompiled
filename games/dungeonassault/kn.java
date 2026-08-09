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
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if ((tg.field_g ^ -1) >= -1) {
              break L0;
            } else {
              fieldTemp$3 = tg.field_g - 1;
              tg.field_g = tg.field_g - 1;
              var2_ref_byte__ = to.field_d[fieldTemp$3];
              to.field_d[tg.field_g] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (!param1) {
            break L1;
          } else {
            field_c = true;
            break L1;
          }
        }
        L2: {
          if (-5001 != (param0 ^ -1)) {
            break L2;
          } else {
            if (0 >= dj.field_a) {
              break L2;
            } else {
              fieldTemp$4 = dj.field_a - 1;
              dj.field_a = dj.field_a - 1;
              var2_ref_byte__ = rp.field_c[fieldTemp$4];
              rp.field_c[dj.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if ((param0 ^ -1) != -30001) {
            break L3;
          } else {
            if (hm.field_s > 0) {
              fieldTemp$5 = hm.field_s - 1;
              hm.field_s = hm.field_s - 1;
              var2_ref_byte__ = lm.field_l[fieldTemp$5];
              lm.field_l[hm.field_s] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (lo.field_c == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= fp.field_c.length) {
                break L4;
              } else {
                if (param0 == fp.field_c[var2]) {
                  if (0 < vc.field_c[var2]) {
                    dupTemp$6 = vc.field_c[var2] - 1;
                    arrayValue$7 = lo.field_c[var2];
                    vc.field_c[var2] = dupTemp$6;
                    var3 = arrayValue$7[dupTemp$6];
                    lo.field_c[var2][vc.field_c[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param0];
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            String var2 = (String) null;
            kn.a(114, (String) null, -104, -11, 95, -38, (String) null, (String) null);
        }
        field_f = null;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, String param6, String param7) {
        h stackIn_5_0 = null;
        h stackIn_6_0 = null;
        cf stackIn_6_1 = null;
        h stackIn_8_0 = null;
        h stackIn_9_0 = null;
        cf stackIn_9_1 = null;
        h stackIn_13_0 = null;
        h stackIn_14_0 = null;
        cf stackIn_14_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        h var8 = null;
        RuntimeException var8_ref = null;
        String var9 = null;
        try {
          L0: {
            var8 = hp.field_b[param2];
            if (var8 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_5_0 = (h) (var8);

                if (param7 != null) {
                  stackIn_6_0 = (h) ((Object) stackIn_5_0);
                  stackIn_6_1 = hd.a(false, param0, "da_raider_" + param7);
                  break L1;
                } else {
                  stackIn_6_0 = (h) ((Object) stackIn_5_0);
                  stackIn_6_1 = null;
                  break L1;
                }
              }
              L2: {
                stackIn_6_0.field_p = stackIn_6_1;
                stackIn_8_0 = (h) (var8);

                if (param1 == null) {
                  stackIn_9_0 = (h) ((Object) stackIn_8_0);
                  stackIn_9_1 = null;
                  break L2;
                } else {
                  stackIn_9_0 = (h) ((Object) stackIn_8_0);
                  stackIn_9_1 = hd.a(false, param3, "da_raider_" + param1);
                  break L2;
                }
              }
              L3: {
                stackIn_9_0.field_g = stackIn_9_1;
                if (param4 >= 123) {
                  break L3;
                } else {
                  var9 = (String) null;
                  kn.a(19, (String) null, 101, 48, 18, -38, (String) null, (String) null);
                  break L3;
                }
              }
              L4: {
                stackIn_13_0 = (h) (var8);

                if (param6 != null) {
                  stackIn_14_0 = (h) ((Object) stackIn_13_0);
                  stackIn_14_1 = hd.a(false, param5, "da_raider_" + param6);
                  break L4;
                } else {
                  stackIn_14_0 = (h) ((Object) stackIn_13_0);
                  stackIn_14_1 = null;
                  break L4;
                }
              }
              stackIn_14_0.field_a = stackIn_14_1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("kn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param7 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static cn[] a(nh param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        cn[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = oi.a(0, var4_int, var5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("kn.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_a = "Retry";
        field_d = "Open in popup window";
    }
}
