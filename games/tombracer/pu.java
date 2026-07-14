/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu implements isa {
    static int[] field_a;
    static int field_b;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        hpa.field_f = true;
        if (param1 != 255) {
          return;
        } else {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          lha.a(var3, var2, (byte) 117, var4, param0);
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2, byte[][] param3, int[] param4, byte[] param5, byte[][] param6, int[] param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          var8 = param7[param0];
          var9 = param4[param0] + var8;
          var10 = param7[param1];
          var11 = param4[param1] + var10;
          var12 = var8;
          if (var8 < var10) {
            var12 = var10;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var13 = var9;
          if (var9 <= var11) {
            break L1;
          } else {
            var13 = var11;
            break L1;
          }
        }
        L2: {
          var14 = 255 & param5[param0];
          if ((param5[param1] & 255) >= var14) {
            break L2;
          } else {
            var14 = param5[param1] & 255;
            break L2;
          }
        }
        var15 = param6[param0];
        if (!param2) {
          L3: {
            field_b = -77;
            var16 = param3[param1];
            var17 = -var8 + var12;
            var18 = -var10 + var12;
            var19 = var12;
            if (var13 <= var19) {
              break L3;
            } else {
              L4: {
                var17++;
                var18++;
                var20 = var15[var17] - -var16[var18];
                if (var20 < var14) {
                  var14 = var20;
                  var19++;
                  break L4;
                } else {
                  var19++;
                  break L4;
                }
              }
              var19++;
              var19++;
              var19++;
              break L3;
            }
          }
          return -var14;
        } else {
          var16 = param3[param1];
          var17 = -var8 + var12;
          var18 = -var10 + var12;
          var19 = var12;
          L5: while (true) {
            if (var13 <= var19) {
              return -var14;
            } else {
              var17++;
              var18++;
              var20 = var15[var17] - -var16[var18];
              if (var20 < var14) {
                var14 = var20;
                var19++;
                var19++;
                continue L5;
              } else {
                var19++;
                var19++;
                continue L5;
              }
            }
          }
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        if (param2 != 16777215) {
            field_a = null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -53) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[1];
    }
}
