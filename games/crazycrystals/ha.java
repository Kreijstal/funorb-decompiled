/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private int field_c;
    private int field_a;
    private nm[] field_b;

    private final byte[] a() {
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
                  if (((ha) this).field_b[var4] != null) {
                    var5 = ((ha) this).field_b[var4].field_w * 22050 / 1000;
                    var6 = ((ha) this).field_b[var4].field_g * 22050 / 1000;
                    var13 = ((ha) this).field_b[var4].a(var5, ((ha) this).field_b[var4].field_w);
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
            if (((ha) this).field_b[var2] != null) {
              if (((ha) this).field_b[var2].field_w + ((ha) this).field_b[var2].field_g > var1) {
                var1 = ((ha) this).field_b[var2].field_w + ((ha) this).field_b[var2].field_g;
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

    final static ha a(db param0, int param1, int param2) {
        byte[] var3 = param0.b(param2, 0, param1);
        if (var3 == null) {
            return null;
        }
        return new ha(new ng(var3));
    }

    final static ha a(db param0, String param1, String param2) {
        byte[] var3 = param0.a(7693, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new ha(new ng(var3));
    }

    final ko b() {
        byte[] var1 = this.a();
        return new ko(22050, var1, 22050 * ((ha) this).field_a / 1000, 22050 * ((ha) this).field_c / 1000);
    }

    private ha(ng param0) {
        int var2 = 0;
        int var3 = 0;
        ((ha) this).field_b = new nm[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((ha) this).field_a = param0.c((byte) -7);
            ((ha) this).field_c = param0.c((byte) -7);
            return;
          } else {
            var3 = param0.h(255);
            if (var3 != 0) {
              param0.field_f = param0.field_f - 1;
              ((ha) this).field_b[var2] = new nm();
              ((ha) this).field_b[var2].a(param0);
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
