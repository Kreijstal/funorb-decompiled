/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    private kj[] field_b;
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
                  if (((bi) this).field_b[var4] != null) {
                    var5 = ((bi) this).field_b[var4].field_r * 22050 / 1000;
                    var6 = ((bi) this).field_b[var4].field_h * 22050 / 1000;
                    var13 = ((bi) this).field_b[var4].a(var5, ((bi) this).field_b[var4].field_r);
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
            if (((bi) this).field_b[var2] != null) {
              if (((bi) this).field_b[var2].field_r + ((bi) this).field_b[var2].field_h > var1) {
                var1 = ((bi) this).field_b[var2].field_r + ((bi) this).field_b[var2].field_h;
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

    final ud b() {
        byte[] var1 = this.a();
        return new ud(22050, var1, 22050 * ((bi) this).field_c / 1000, 22050 * ((bi) this).field_a / 1000);
    }

    private bi(wl param0) {
        int var2 = 0;
        int var3 = 0;
        ((bi) this).field_b = new kj[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((bi) this).field_c = param0.e(3);
            ((bi) this).field_a = param0.e(3);
            return;
          } else {
            var3 = param0.d((byte) -82);
            if (var3 != 0) {
              param0.field_n = param0.field_n - 1;
              ((bi) this).field_b[var2] = new kj();
              ((bi) this).field_b[var2].a(param0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static bi a(ji param0, int param1, int param2) {
        byte[] var3 = param0.a(param2, 76, param1);
        if (var3 == null) {
            return null;
        }
        return new bi(new wl(var3));
    }
}
