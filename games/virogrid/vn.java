/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    private int field_b;
    private int field_a;
    private hl[] field_c;

    final static vn a(eh param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, 0);
        if (var3 == null) {
            return null;
        }
        return new vn(new jc(var3));
    }

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
                  if (this.field_c[var4] != null) {
                    var5 = this.field_c[var4].field_q * 22050 / 1000;
                    var6 = this.field_c[var4].field_g * 22050 / 1000;
                    var13 = this.field_c[var4].a(var5, this.field_c[var4].field_q);
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
            if (this.field_c[var2] != null) {
              if (this.field_c[var2].field_q + this.field_c[var2].field_g > var1) {
                var1 = this.field_c[var2].field_q + this.field_c[var2].field_g;
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

    final ml b() {
        byte[] var1 = this.a();
        return new ml(22050, var1, 22050 * this.field_a / 1000, 22050 * this.field_b / 1000);
    }

    private vn(jc param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_c = new hl[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            this.field_a = param0.c((byte) 114);
            this.field_b = param0.c((byte) 58);
            return;
          } else {
            var3 = param0.g(11132);
            if (var3 != 0) {
              param0.field_l = param0.field_l - 1;
              this.field_c[var2] = new hl();
              this.field_c[var2].a(param0);
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
