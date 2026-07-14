/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_b;
    private tj[] field_a;
    private int field_c;

    final ud a() {
        byte[] var1 = this.b();
        return new ud(22050, var1, 22050 * ((kj) this).field_c / 1000, 22050 * ((kj) this).field_b / 1000);
    }

    final static kj a(pf param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, (byte) -12);
        if (var3 == null) {
            return null;
        }
        return new kj(new ka(var3));
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
                  if (((kj) this).field_a[var4] != null) {
                    var5 = ((kj) this).field_a[var4].field_u * 22050 / 1000;
                    var6 = ((kj) this).field_a[var4].field_y * 22050 / 1000;
                    var13 = ((kj) this).field_a[var4].a(var5, ((kj) this).field_a[var4].field_u);
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
            if (((kj) this).field_a[var2] != null) {
              if (((kj) this).field_a[var2].field_u + ((kj) this).field_a[var2].field_y > var1) {
                var1 = ((kj) this).field_a[var2].field_u + ((kj) this).field_a[var2].field_y;
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

    private kj(ka param0) {
        int var2 = 0;
        int var3 = 0;
        ((kj) this).field_a = new tj[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((kj) this).field_c = param0.c((byte) 27);
            ((kj) this).field_b = param0.c((byte) 116);
          } else {
            var3 = param0.f(4);
            if (var3 != 0) {
              param0.field_k = param0.field_k - 1;
              ((kj) this).field_a[var2] = new tj();
              ((kj) this).field_a[var2].a(param0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static kj a(pf param0, int param1, int param2) {
        byte[] var3 = param0.a(param2, 16, param1);
        if (var3 == null) {
            return null;
        }
        return new kj(new ka(var3));
    }
}
