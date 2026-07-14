/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qm {
    int[] field_e;
    static qia field_g;
    int field_b;
    int field_f;
    java.awt.Image field_c;
    static wl field_d;
    static po field_a;

    final static fea a(ee[] param0, byte[] param1, int param2) {
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        if (!(param0.length == 256)) {
            throw new IllegalArgumentException();
        }
        int[] var26 = new int[256];
        int[] var21 = var26;
        int[] var16 = var21;
        int[] var11 = var16;
        int[] var10 = var11;
        int[] var3 = var10;
        int[] var27 = new int[256];
        int[] var22 = var27;
        int[] var17 = var22;
        int[] var12 = var17;
        int[] var4 = var12;
        int[] var28 = new int[256];
        int[] var23 = var28;
        int[] var18 = var23;
        int[] var13 = var18;
        int[] var5 = var13;
        int[] var29 = new int[256];
        int[] var24 = var29;
        int[] var19 = var24;
        int[] var14 = var19;
        int[] var6 = var14;
        byte[][] var30 = new byte[256][];
        byte[][] var25 = var30;
        byte[][] var20 = var25;
        byte[][] var15 = var20;
        byte[][] var7 = var15;
        for (var8 = param2; var8 < 256; var8++) {
            var10[var8] = param0[var8].field_f;
            var4[var8] = param0[var8].field_c;
            var5[var8] = param0[var8].field_d;
            var6[var8] = param0[var8].field_e;
            var7[var8] = param0[var8].field_g;
        }
        return new fea(param1, var26, var27, var28, var29, var30);
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        var4 = param2.length();
        var5 = param1.length();
        var6 = param0.length();
        if (var5 != 0) {
          L0: {
            var7 = var4;
            var8 = var6 + -var5;
            if ((var8 ^ -1) != param3) {
              var9_int = 0;
              L1: while (true) {
                var9_int = param2.indexOf(param1, var9_int);
                if (var9_int >= 0) {
                  var9_int = var9_int + var5;
                  var7 = var7 + var8;
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L2: while (true) {
            var11 = param2.indexOf(param1, var10);
            if ((var11 ^ -1) <= -1) {
              StringBuilder discarded$3 = var9.append(param2.substring(var10, var11));
              StringBuilder discarded$4 = var9.append(param0);
              var10 = var11 + var5;
              continue L2;
            } else {
              StringBuilder discarded$5 = var9.append(param2.substring(var10));
              return var9.toString();
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        kg.a(param3, he.field_l, gba.field_Bb, param1, -3, param2, rg.field_h);
        if (param0) {
            field_d = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_d = null;
        field_g = null;
    }

    final static void a(int param0, int param1) {
        cq discarded$7 = ol.a(ib.field_d[param0], true);
        if (param1 != 7758) {
            field_a = null;
        }
    }

    final void a(byte param0) {
        int var2 = -17 % ((76 - param0) / 37);
        dg.a(((qm) this).field_e, ((qm) this).field_b, ((qm) this).field_f);
    }

    abstract void a(byte param0, int param1, java.awt.Graphics param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new qia();
    }
}
