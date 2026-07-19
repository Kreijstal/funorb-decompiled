/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    private nk[] field_c;
    private int field_a;
    private int field_b;

    final static kb a(vj param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, (byte) 35);
        if (var3 == null) {
            return null;
        }
        return new kb(new od(var3));
    }

    final vk a() {
        byte[] var1 = this.b();
        return new vk(22050, var1, 22050 * this.field_b / 1000, 22050 * this.field_a / 1000);
    }

    final static kb a(vj param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, 24874);
        if (var3 == null) {
            return null;
        }
        return new kb(new od(var3));
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
                  if (this.field_c[var4] != null) {
                    var5 = this.field_c[var4].field_r * 22050 / 1000;
                    var6 = this.field_c[var4].field_t * 22050 / 1000;
                    var13 = this.field_c[var4].a(var5, this.field_c[var4].field_r);
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
              if (this.field_c[var2].field_r + this.field_c[var2].field_t > var1) {
                var1 = this.field_c[var2].field_r + this.field_c[var2].field_t;
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

    private kb(od param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_c = new nk[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            this.field_b = param0.j(-788751192);
            this.field_a = param0.j(-788751192);
            return;
          } else {
            var3 = param0.l(31760);
            if (var3 != 0) {
              param0.field_j = param0.field_j - 1;
              this.field_c[var2] = new nk();
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
