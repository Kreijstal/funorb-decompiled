/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    private int field_a;
    private int field_c;
    private pg[] field_b;

    final ik b() {
        byte[] var1 = this.a();
        return new ik(22050, var1, 22050 * ((cc) this).field_c / 1000, 22050 * ((cc) this).field_a / 1000);
    }

    final static cc a(kk param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, (byte) -79);
        if (var3 == null) {
            return null;
        }
        return new cc(new be(var3));
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
                  if (((cc) this).field_b[var4] != null) {
                    var5 = ((cc) this).field_b[var4].field_p * 22050 / 1000;
                    var6 = ((cc) this).field_b[var4].field_l * 22050 / 1000;
                    var13 = ((cc) this).field_b[var4].a(var5, ((cc) this).field_b[var4].field_p);
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
            if (((cc) this).field_b[var2] != null) {
              if (((cc) this).field_b[var2].field_p + ((cc) this).field_b[var2].field_l > var1) {
                var1 = ((cc) this).field_b[var2].field_p + ((cc) this).field_b[var2].field_l;
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

    final static cc a(kk param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, -1, param2);
        if (var3 == null) {
            return null;
        }
        return new cc(new be(var3));
    }

    private cc(be param0) {
        int var2 = 0;
        int var3 = 0;
        ((cc) this).field_b = new pg[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((cc) this).field_c = param0.d((byte) -126);
            ((cc) this).field_a = param0.d((byte) -86);
          } else {
            var3 = param0.h(16383);
            if (var3 != 0) {
              param0.field_k = param0.field_k - 1;
              ((cc) this).field_b[var2] = new pg();
              ((cc) this).field_b[var2].a(param0);
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
