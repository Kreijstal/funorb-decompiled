/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_c;
    static volatile int field_d;
    static long field_a;
    static String field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static String a(int param0, int param1, jc param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param2.c(false);
              if (var3_int > param1) {
                var3_int = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 128) {
                break L2;
              } else {
                field_b = null;
                break L2;
              }
            }
            var4 = new byte[var3_int];
            param2.field_l = param2.field_l + ph.field_k.a(var4, param2.field_l, 0, var3_int, param2.field_g, true);
            var5 = nf.a(var3_int, (byte) -128, 0, var4);
            stackOut_5_0 = (String) var5;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_6_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var12 = null;
        char[] var7 = null;
        char[] var6 = null;
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        char[] var14 = null;
        char[] var9 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        if ((param0 ^ -1) < param1) {
            if (128 > param0) {
                return true;
            }
            if (param0 < 160) {
                if (param0 == 0) {
                    return false;
                }
                var12 = cg.field_f;
                var7 = var12;
                var6 = var7;
                var2 = var6;
                for (var3 = 0; var12.length > var3; var3++) {
                    var4 = var12[var3];
                    if (param0 == var4) {
                        return true;
                    }
                }
                return false;
            }
            if (param0 > 255) {
                if (param0 == 0) {
                    return false;
                }
                var14 = cg.field_f;
                var9 = var14;
                var6 = var9;
                var2 = var6;
                for (var3 = 0; var14.length > var3; var3++) {
                    var4 = var14[var3];
                    if (param0 == var4) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (param0 >= 160) {
            if (param0 <= 255) {
                return true;
            }
        }
        if (param0 == 0) {
            return false;
        }
        char[] var16 = cg.field_f;
        char[] var11 = var16;
        var6 = var11;
        var2 = var6;
        for (var3 = 0; var16.length > var3; var3++) {
            var4 = var16[var3];
            if (param0 == var4) {
                return true;
            }
        }
        return false;
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if (pm.field_o <= var1) {
          if (param0 != -9986) {
            return -66L;
          } else {
            pm.field_o = var1;
            return var1 - -b.field_Gb;
          }
        } else {
          b.field_Gb = b.field_Gb + (pm.field_o + -var1);
          if (param0 != -9986) {
            return -66L;
          } else {
            pm.field_o = var1;
            return var1 - -b.field_Gb;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 4;
        field_d = 0;
        field_b = "<%0>'s turn (<%1>)";
    }
}
