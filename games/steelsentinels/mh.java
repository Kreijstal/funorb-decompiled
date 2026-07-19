/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    private int field_b;
    private p[] field_a;
    private int field_c;

    final static mh a(cm param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, (byte) 100, param2);
        if (var3 == null) {
            return null;
        }
        return new mh(new gi(var3));
    }

    final sk b() {
        byte[] var1 = this.a();
        return new sk(22050, var1, 22050 * this.field_c / 1000, 22050 * this.field_b / 1000);
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
                  if (this.field_a[var4] != null) {
                    var5 = this.field_a[var4].field_y * 22050 / 1000;
                    var6 = this.field_a[var4].field_j * 22050 / 1000;
                    var13 = this.field_a[var4].a(var5, this.field_a[var4].field_y);
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
              if (this.field_a[var2].field_y + this.field_a[var2].field_j > var1) {
                var1 = this.field_a[var2].field_y + this.field_a[var2].field_j;
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

    private mh(gi param0) {
        int var2 = 0;
        int var3 = 0;
        this.field_a = new p[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            this.field_c = param0.c((byte) -60);
            this.field_b = param0.c((byte) -60);
            return;
          } else {
            var3 = param0.f((byte) -114);
            if (var3 != 0) {
              param0.field_p = param0.field_p - 1;
              this.field_a[var2] = new p();
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
