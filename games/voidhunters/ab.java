/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    private qda[] field_c;
    private int field_a;
    private int field_b;

    final gd b() {
        byte[] var1 = this.a();
        return new gd(22050, var1, 22050 * ((ab) this).field_b / 1000, 22050 * ((ab) this).field_a / 1000);
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
                  if (((ab) this).field_c[var4] != null) {
                    var5 = ((ab) this).field_c[var4].field_d * 22050 / 1000;
                    var6 = ((ab) this).field_c[var4].field_k * 22050 / 1000;
                    var13 = ((ab) this).field_c[var4].a(var5, ((ab) this).field_c[var4].field_d);
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
            if (((ab) this).field_c[var2] != null) {
              if (((ab) this).field_c[var2].field_d + ((ab) this).field_c[var2].field_k > var1) {
                var1 = ((ab) this).field_c[var2].field_d + ((ab) this).field_c[var2].field_k;
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

    final static ab a(asb param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, (byte) 13);
        if (var3 == null) {
            return null;
        }
        return new ab(new ds(var3));
    }

    private ab(ds param0) {
        int var2 = 0;
        int var3 = 0;
        ((ab) this).field_c = new qda[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((ab) this).field_b = param0.e(1869);
            ((ab) this).field_a = param0.e(1869);
            return;
          } else {
            var3 = param0.e((byte) -92);
            if (var3 != 0) {
              param0.field_e = param0.field_e - 1;
              ((ab) this).field_c[var2] = new qda();
              ((ab) this).field_c[var2].a(param0);
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
