/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private int field_a;
    private og[] field_b;
    private int field_c;

    final lm a() {
        byte[] var1 = this.b();
        return new lm(22050, var1, 22050 * ((ck) this).field_a / 1000, 22050 * ((ck) this).field_c / 1000);
    }

    final static ck a(um param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, 5847);
        if (var3 == null) {
            return null;
        }
        return new ck(new p(var3));
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
                  if (((ck) this).field_b[var4] != null) {
                    var5 = ((ck) this).field_b[var4].field_u * 22050 / 1000;
                    var6 = ((ck) this).field_b[var4].field_m * 22050 / 1000;
                    var13 = ((ck) this).field_b[var4].a(var5, ((ck) this).field_b[var4].field_u);
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
            if (((ck) this).field_b[var2] != null) {
              if (((ck) this).field_b[var2].field_u + ((ck) this).field_b[var2].field_m > var1) {
                var1 = ((ck) this).field_b[var2].field_u + ((ck) this).field_b[var2].field_m;
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

    private ck(p param0) {
        int var2 = 0;
        int var3 = 0;
        ((ck) this).field_b = new og[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((ck) this).field_a = param0.f(674914976);
            ((ck) this).field_c = param0.f(674914976);
          } else {
            var3 = param0.i(-101);
            if (var3 != 0) {
              param0.field_l = param0.field_l - 1;
              ((ck) this).field_b[var2] = new og();
              ((ck) this).field_b[var2].a(param0);
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
