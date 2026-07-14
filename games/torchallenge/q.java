/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    private int field_a;
    private dc[] field_b;
    private int field_c;

    final static q a(lj param0, int param1, int param2) {
        byte[] var3 = param0.c(param1, param2, 0);
        if (var3 == null) {
            return null;
        }
        return new q(new uf(var3));
    }

    final static q a(lj param0, String param1, String param2) {
        byte[] var3 = param0.a(-2, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new q(new uf(var3));
    }

    final fe b() {
        byte[] var1 = this.a();
        return new fe(22050, var1, 22050 * ((q) this).field_c / 1000, 22050 * ((q) this).field_a / 1000);
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
                  if (((q) this).field_b[var4] != null) {
                    var5 = ((q) this).field_b[var4].field_h * 22050 / 1000;
                    var6 = ((q) this).field_b[var4].field_t * 22050 / 1000;
                    var13 = ((q) this).field_b[var4].a(var5, ((q) this).field_b[var4].field_h);
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
            if (((q) this).field_b[var2] != null) {
              if (((q) this).field_b[var2].field_h + ((q) this).field_b[var2].field_t > var1) {
                var1 = ((q) this).field_b[var2].field_h + ((q) this).field_b[var2].field_t;
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

    private q(uf param0) {
        int var2 = 0;
        int var3 = 0;
        ((q) this).field_b = new dc[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((q) this).field_c = param0.c(false);
            ((q) this).field_a = param0.c(false);
          } else {
            var3 = param0.j(-109);
            if (var3 != 0) {
              param0.field_q = param0.field_q - 1;
              ((q) this).field_b[var2] = new dc();
              ((q) this).field_b[var2].a(param0);
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
