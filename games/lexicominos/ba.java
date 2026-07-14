/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    private ak[] field_a;
    private int field_b;
    private int field_c;

    final static ba a(sh param0, String param1, String param2) {
        byte[] var3 = param0.a((byte) 127, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new ba(new wf(var3));
    }

    final ke a() {
        byte[] var1 = this.b();
        return new ke(22050, var1, 22050 * ((ba) this).field_b / 1000, 22050 * ((ba) this).field_c / 1000);
    }

    final static ba a(sh param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, -27493, param2);
        if (var3 == null) {
            return null;
        }
        return new ba(new wf(var3));
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
                  if (((ba) this).field_a[var4] != null) {
                    var5 = ((ba) this).field_a[var4].field_r * 22050 / 1000;
                    var6 = ((ba) this).field_a[var4].field_o * 22050 / 1000;
                    var13 = ((ba) this).field_a[var4].a(var5, ((ba) this).field_a[var4].field_r);
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
            if (((ba) this).field_a[var2] != null) {
              if (((ba) this).field_a[var2].field_r + ((ba) this).field_a[var2].field_o > var1) {
                var1 = ((ba) this).field_a[var2].field_r + ((ba) this).field_a[var2].field_o;
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

    private ba(wf param0) {
        int var2 = 0;
        int var3 = 0;
        ((ba) this).field_a = new ak[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((ba) this).field_b = param0.b(-1698573656);
            ((ba) this).field_c = param0.b(-1698573656);
          } else {
            var3 = param0.d(true);
            if (var3 != 0) {
              param0.field_h = param0.field_h - 1;
              ((ba) this).field_a[var2] = new ak();
              ((ba) this).field_a[var2].a(param0);
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
