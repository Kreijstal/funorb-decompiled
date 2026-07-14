/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    private int field_c;
    private int field_a;
    private aj[] field_b;

    final static b a(kl param0, String param1, String param2) {
        byte[] var3 = param0.a(-77, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new b(new va(var3));
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
                  if (((b) this).field_b[var4] != null) {
                    var5 = ((b) this).field_b[var4].field_q * 22050 / 1000;
                    var6 = ((b) this).field_b[var4].field_k * 22050 / 1000;
                    var13 = ((b) this).field_b[var4].a(var5, ((b) this).field_b[var4].field_q);
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
            if (((b) this).field_b[var2] != null) {
              if (((b) this).field_b[var2].field_q + ((b) this).field_b[var2].field_k > var1) {
                var1 = ((b) this).field_b[var2].field_q + ((b) this).field_b[var2].field_k;
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

    final static b a(kl param0, int param1, int param2) {
        byte[] var3 = param0.a(param2, param1, 1);
        if (var3 == null) {
            return null;
        }
        return new b(new va(var3));
    }

    final je b() {
        byte[] var1 = this.a();
        return new je(22050, var1, 22050 * ((b) this).field_c / 1000, 22050 * ((b) this).field_a / 1000);
    }

    private b(va param0) {
        int var2 = 0;
        int var3 = 0;
        ((b) this).field_b = new aj[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((b) this).field_c = param0.j(-14477);
            ((b) this).field_a = param0.j(-14477);
          } else {
            var3 = param0.f(255);
            if (var3 != 0) {
              param0.field_m = param0.field_m - 1;
              ((b) this).field_b[var2] = new aj();
              ((b) this).field_b[var2].a(param0);
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
