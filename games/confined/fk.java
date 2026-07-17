/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private lg[] field_c;
    private int field_a;
    private int field_b;

    final bi a() {
        byte[] var1 = this.b();
        return new bi(22050, var1, 22050 * ((fk) this).field_a / 1000, 22050 * ((fk) this).field_b / 1000);
    }

    final static fk a(mi param0, int param1, int param2) {
        byte[] var3 = param0.a((byte) -2, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new fk(new kg(var3));
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
                  if (((fk) this).field_c[var4] != null) {
                    var5 = ((fk) this).field_c[var4].field_d * 22050 / 1000;
                    var6 = ((fk) this).field_c[var4].field_y * 22050 / 1000;
                    var13 = ((fk) this).field_c[var4].a(var5, ((fk) this).field_c[var4].field_d);
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
            if (((fk) this).field_c[var2] != null) {
              if (((fk) this).field_c[var2].field_d + ((fk) this).field_c[var2].field_y > var1) {
                var1 = ((fk) this).field_c[var2].field_d + ((fk) this).field_c[var2].field_y;
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

    final static fk a(mi param0, String param1, String param2) {
        byte[] var3 = param0.a(-37, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new fk(new kg(var3));
    }

    private fk(kg param0) {
        int var2 = 0;
        int var3 = 0;
        ((fk) this).field_c = new lg[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((fk) this).field_a = param0.a((byte) 25);
            ((fk) this).field_b = param0.a((byte) 25);
            return;
          } else {
            var3 = param0.c(32);
            if (var3 != 0) {
              param0.field_n = param0.field_n - 1;
              ((fk) this).field_c[var2] = new lg();
              ((fk) this).field_c[var2].a(param0);
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
