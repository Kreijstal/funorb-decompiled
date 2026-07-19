/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static wg[] field_a;
    static String[] field_b;
    static o[] field_d;
    static boolean field_c;
    static String field_f;
    static boolean field_e;

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param0) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_f = (String) null;
          if (param0 >= 65) {
            if (90 < param0) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = qj.a(param2 + -27210, param0);
        var4 = wizardrun.a((byte) -110, param0);
        var5 = qj.a(-2942, param1);
        var6 = wizardrun.a((byte) 119, param1);
        var7 = (int)((long)var5 * (long)var3 >> 1024666128);
        if (param2 != 24268) {
          return (int[]) null;
        } else {
          var8 = (int)((long)var3 * (long)var6 >> -2055603056);
          var9 = (int)((long)var5 * (long)var4 >> 1907219856);
          var10 = (int)((long)var4 * (long)var6 >> -1482263792);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        String[] var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (rk.field_k != null) {
                rk.field_k.field_J.a((byte) 87, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != ik.field_G) {
                ik.field_G.field_H.a((byte) 87, param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 == -117) {
              break L0;
            } else {
              var3 = (String[]) null;
              f.a((byte) -120, (String[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("f.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -108 % ((param0 - 13) / 52);
        field_a = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    static {
        int var0 = 0;
        field_a = new wg[255];
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = new wg();
        }
        field_f = "The requirements and rewards for this achievement are hidden until collected";
    }
}
