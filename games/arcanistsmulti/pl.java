/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private int field_a;
    private jj[] field_b;
    private int field_c;

    final wf a() {
        byte[] var1 = this.b();
        return new wf(22050, var1, 22050 * ((pl) this).field_a / 1000, 22050 * ((pl) this).field_c / 1000);
    }

    final static pl a(eg param0, int param1, int param2) {
        byte[] var3 = param0.b(param2, 26219, param1);
        if (var3 == null) {
            return null;
        }
        return new pl(new wk(var3));
    }

    final static pl a(eg param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, param1, -1);
        if (var3 == null) {
            return null;
        }
        return new pl(new wk(var3));
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
                  if (((pl) this).field_b[var4] != null) {
                    var5 = ((pl) this).field_b[var4].field_s * 22050 / 1000;
                    var6 = ((pl) this).field_b[var4].field_p * 22050 / 1000;
                    var13 = ((pl) this).field_b[var4].a(var5, ((pl) this).field_b[var4].field_s);
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
            if (((pl) this).field_b[var2] != null) {
              if (((pl) this).field_b[var2].field_s + ((pl) this).field_b[var2].field_p > var1) {
                var1 = ((pl) this).field_b[var2].field_s + ((pl) this).field_b[var2].field_p;
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

    private pl(wk param0) {
        int var2 = 0;
        int var3 = 0;
        ((pl) this).field_b = new jj[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((pl) this).field_a = param0.n(-98);
            ((pl) this).field_c = param0.n(-98);
            return;
          } else {
            var3 = param0.e((byte) 110);
            if (var3 != 0) {
              param0.field_g = param0.field_g - 1;
              ((pl) this).field_b[var2] = new jj();
              ((pl) this).field_b[var2].a(param0);
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
