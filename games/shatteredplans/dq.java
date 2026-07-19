/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    private pk[] field_b;
    private int field_c;
    private int field_a;

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
                  if (this.field_b[var4] != null) {
                    var5 = this.field_b[var4].field_a * 22050 / 1000;
                    var6 = this.field_b[var4].field_s * 22050 / 1000;
                    var13 = this.field_b[var4].a(var5, this.field_b[var4].field_a);
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
            if (this.field_b[var2] != null) {
              if (this.field_b[var2].field_a + this.field_b[var2].field_s > var1) {
                var1 = this.field_b[var2].field_a + this.field_b[var2].field_s;
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

    final kk b() {
        byte[] var1 = this.a();
        return new kk(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_a / 1000);
    }

    private dq(ob param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_b = new pk[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            this.field_c = param0.f(-20976);
            this.field_a = param0.f(-20976);
            return;
          } else {
            var3 = param0.j(-68);
            if (var3 != 0) {
              param0.field_j = param0.field_j - 1;
              this.field_b[var2] = new pk();
              this.field_b[var2].a(param0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static dq a(bc param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, -1, param2);
        if (var3 == null) {
            return null;
        }
        return new dq(new ob(var3));
    }
}
