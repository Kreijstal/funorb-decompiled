/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private int field_a;
    private int field_b;
    private ve[] field_c;

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
                  if (((ml) this).field_c[var4] != null) {
                    var5 = ((ml) this).field_c[var4].field_y * 22050 / 1000;
                    var6 = ((ml) this).field_c[var4].field_b * 22050 / 1000;
                    var13 = ((ml) this).field_c[var4].a(var5, ((ml) this).field_c[var4].field_y);
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
            if (((ml) this).field_c[var2] != null) {
              if (((ml) this).field_c[var2].field_y + ((ml) this).field_c[var2].field_b > var1) {
                var1 = ((ml) this).field_c[var2].field_y + ((ml) this).field_c[var2].field_b;
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

    final gi b() {
        byte[] var1 = this.a();
        return new gi(22050, var1, 22050 * ((ml) this).field_a / 1000, 22050 * ((ml) this).field_b / 1000);
    }

    final static ml a(dj param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, -115, param1);
        if (var3 == null) {
            return null;
        }
        return new ml(new de(var3));
    }

    private ml(de param0) {
        int var2 = 0;
        int var3 = 0;
        ((ml) this).field_c = new ve[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((ml) this).field_a = param0.f(2);
            ((ml) this).field_b = param0.f(2);
          } else {
            var3 = param0.d((byte) -119);
            if (var3 != 0) {
              param0.field_j = param0.field_j - 1;
              ((ml) this).field_c[var2] = new ve();
              ((ml) this).field_c[var2].a(param0);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static ml a(dj param0, int param1, int param2) {
        byte[] var3 = param0.a((byte) 51, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new ml(new de(var3));
    }
}
