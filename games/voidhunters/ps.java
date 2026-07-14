/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ps {
    static phb[] field_a;

    final static byte[] a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var2 = param0.length();
        if (var2 != 0) {
          var3 = -4 & var2 - -3;
          var4 = 3 * (var3 / 4);
          if (var2 <= var3 - 2) {
            var4 -= 2;
            var14 = new byte[var4];
            var9 = var14;
            var7 = var9;
            var6 = var7;
            var5 = var6;
            if (param1 != 1) {
              return null;
            } else {
              int discarded$5 = ij.a(var14, param1 + -10389, 0, param0);
              return var5;
            }
          } else {
            if (mwa.a(param0.charAt(-2 + var3), -82) != -1) {
              if (var3 - 1 >= var2) {
                var4--;
                var16 = new byte[var4];
                var11 = var16;
                var7 = var11;
                var6 = var7;
                var5 = var6;
                if (param1 != 1) {
                  return null;
                } else {
                  int discarded$6 = ij.a(var16, param1 + -10389, 0, param0);
                  return var5;
                }
              } else {
                if (mwa.a(param0.charAt(var3 + -1), -46) != -1) {
                  var17 = new byte[var4];
                  var12 = var17;
                  var7 = var12;
                  var6 = var7;
                  var5 = var6;
                  if (param1 != 1) {
                    return null;
                  } else {
                    int discarded$7 = ij.a(var17, param1 + -10389, 0, param0);
                    return var5;
                  }
                } else {
                  var4--;
                  var15 = new byte[var4];
                  var10 = var15;
                  var7 = var10;
                  var6 = var7;
                  var5 = var6;
                  if (param1 != 1) {
                    return null;
                  } else {
                    int discarded$8 = ij.a(var15, param1 + -10389, 0, param0);
                    return var5;
                  }
                }
              }
            } else {
              var4 -= 2;
              var13 = new byte[var4];
              var8 = var13;
              var7 = var8;
              var6 = var7;
              var5 = var6;
              if (param1 != 1) {
                return null;
              } else {
                int discarded$9 = ij.a(var13, param1 + -10389, 0, param0);
                return var5;
              }
            }
          }
        } else {
          return new byte[]{};
        }
    }

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
    }

    abstract byte[] b(int param0);

    static {
    }
}
