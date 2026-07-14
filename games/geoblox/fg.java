/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    private int field_c;
    private int field_b;
    private ed[] field_a;

    final gd a() {
        byte[] var1 = this.b();
        return new gd(22050, var1, 22050 * ((fg) this).field_c / 1000, 22050 * ((fg) this).field_b / 1000);
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
                  if (((fg) this).field_a[var4] != null) {
                    var5 = ((fg) this).field_a[var4].field_d * 22050 / 1000;
                    var6 = ((fg) this).field_a[var4].field_v * 22050 / 1000;
                    var13 = ((fg) this).field_a[var4].a(var5, ((fg) this).field_a[var4].field_d);
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
            if (((fg) this).field_a[var2] != null) {
              if (((fg) this).field_a[var2].field_d + ((fg) this).field_a[var2].field_v > var1) {
                var1 = ((fg) this).field_a[var2].field_d + ((fg) this).field_a[var2].field_v;
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

    private fg(qc param0) {
        int var2 = 0;
        int var3 = 0;
        ((fg) this).field_a = new ed[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((fg) this).field_c = param0.b(true);
            ((fg) this).field_b = param0.b(true);
          } else {
            var3 = param0.c((byte) 34);
            if (var3 != 0) {
              param0.field_f = param0.field_f - 1;
              ((fg) this).field_a[var2] = new ed();
              ((fg) this).field_a[var2].a(param0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static fg a(rh param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, -28153, param2);
        if (var3 == null) {
            return null;
        }
        return new fg(new qc(var3));
    }
}
