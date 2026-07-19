/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_c;
    private int field_b;
    private we[] field_a;

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
                  if (this.field_a[var4] != null) {
                    var5 = this.field_a[var4].field_l * 22050 / 1000;
                    var6 = this.field_a[var4].field_s * 22050 / 1000;
                    var13 = this.field_a[var4].a(var5, this.field_a[var4].field_l);
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
            if (this.field_a[var2] != null) {
              if (this.field_a[var2].field_l + this.field_a[var2].field_s > var1) {
                var1 = this.field_a[var2].field_l + this.field_a[var2].field_s;
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

    final static kj a(mf param0, String param1, String param2) {
        byte[] var3 = param0.a(-4, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new kj(new n(var3));
    }

    final static kj a(mf param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, (byte) -97, param2);
        if (var3 == null) {
            return null;
        }
        return new kj(new n(var3));
    }

    final hh a() {
        byte[] var1 = this.b();
        return new hh(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_b / 1000);
    }

    private kj(n param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_a = new we[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            this.field_c = param0.f(1952);
            this.field_b = param0.f(1952);
            return;
          } else {
            var3 = param0.e(0);
            if (var3 != 0) {
              param0.field_m = param0.field_m - 1;
              this.field_a[var2] = new we();
              this.field_a[var2].a(param0);
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
