/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp {
    private int field_a;
    private int field_c;
    private sda[] field_b;

    final static vp a(vr param0, int param1, int param2) {
        byte[] var3 = param0.b(104, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new vp(new lu(var3));
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
                  if (((vp) this).field_b[var4] != null) {
                    var5 = ((vp) this).field_b[var4].field_b * 22050 / 1000;
                    var6 = ((vp) this).field_b[var4].field_m * 22050 / 1000;
                    var13 = ((vp) this).field_b[var4].a(var5, ((vp) this).field_b[var4].field_b);
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
            if (((vp) this).field_b[var2] != null) {
              if (((vp) this).field_b[var2].field_b + ((vp) this).field_b[var2].field_m > var1) {
                var1 = ((vp) this).field_b[var2].field_b + ((vp) this).field_b[var2].field_m;
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

    final be b() {
        byte[] var1 = this.a();
        return new be(22050, var1, 22050 * ((vp) this).field_c / 1000, 22050 * ((vp) this).field_a / 1000);
    }

    private vp(lu param0) {
        int var2 = 0;
        int var3 = 0;
        ((vp) this).field_b = new sda[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((vp) this).field_c = param0.e((byte) 113);
            ((vp) this).field_a = param0.e((byte) 47);
          } else {
            var3 = param0.b(16711935);
            if (var3 != 0) {
              param0.field_g = param0.field_g - 1;
              ((vp) this).field_b[var2] = new sda();
              ((vp) this).field_b[var2].a(param0);
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
