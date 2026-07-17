/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_b;
    private int field_a;
    private wg[] field_c;

    final static v a(nh param0, int param1, int param2) {
        byte[] var3 = param0.b(5, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new v(new ec(var3));
    }

    final va a() {
        byte[] var1 = this.b();
        return new va(22050, var1, 22050 * ((v) this).field_a / 1000, 22050 * ((v) this).field_b / 1000);
    }

    private final byte[] b() {
        int var1 = 0;
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            if (var1 != 0) {
              var2 = 22050 * var1 / 1000;
              var3 = new byte[var2];
              var4 = 0;
              L1: while (true) {
                if (var4 >= 10) {
                  return var3;
                } else {
                  if (((v) this).field_c[var4] != null) {
                    var5 = ((v) this).field_c[var4].field_s * 22050 / 1000;
                    var6 = ((v) this).field_c[var4].field_o * 22050 / 1000;
                    var13 = ((v) this).field_c[var4].a(var5, ((v) this).field_c[var4].field_s);
                    var8 = 0;
                    L2: while (true) {
                      if (var8 < var5) {
                        L3: {
                          var9 = var3[var8 + var6] + (var13[var8] >> 8);
                          if ((var9 + 128 & -256) == 0) {
                            break L3;
                          } else {
                            var9 = var9 >> 31 ^ 127;
                            break L3;
                          }
                        }
                        var3[var8 + var6] = (byte)var9;
                        var8++;
                        continue L2;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              return new byte[]{};
            }
          } else {
            if (((v) this).field_c[var2] != null) {
              if (((v) this).field_c[var2].field_s + ((v) this).field_c[var2].field_o > var1) {
                var1 = ((v) this).field_c[var2].field_s + ((v) this).field_c[var2].field_o;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private v(ec param0) {
        int var2 = 0;
        int var3 = 0;
        ((v) this).field_c = new wg[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((v) this).field_a = param0.k(0);
            ((v) this).field_b = param0.k(0);
            return;
          } else {
            var3 = param0.c(true);
            if (var3 != 0) {
              param0.field_o = param0.field_o - 1;
              ((v) this).field_c[var2] = new wg();
              ((v) this).field_c[var2].a(param0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }
}
