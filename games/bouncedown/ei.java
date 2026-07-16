/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    private gg[] field_a;
    private int field_c;
    private int field_b;

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
                  if (((ei) this).field_a[var4] != null) {
                    var5 = ((ei) this).field_a[var4].field_n * 22050 / 1000;
                    var6 = ((ei) this).field_a[var4].field_f * 22050 / 1000;
                    var13 = ((ei) this).field_a[var4].a(var5, ((ei) this).field_a[var4].field_n);
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
            if (((ei) this).field_a[var2] != null) {
              if (((ei) this).field_a[var2].field_n + ((ei) this).field_a[var2].field_f > var1) {
                var1 = ((ei) this).field_a[var2].field_n + ((ei) this).field_a[var2].field_f;
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

    final static ei a(gk param0, int param1, int param2) {
        byte[] var3 = param0.b(-113, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new ei(new wi(var3));
    }

    final ue b() {
        byte[] var1 = this.a();
        return new ue(22050, var1, 22050 * ((ei) this).field_b / 1000, 22050 * ((ei) this).field_c / 1000);
    }

    final static ei a(gk param0, String param1, String param2) {
        byte[] var3 = param0.b(param1, param2, 120);
        if (var3 == null) {
            return null;
        }
        return new ei(new wi(var3));
    }

    private ei(wi param0) {
        int var2 = 0;
        int var3 = 0;
        ((ei) this).field_a = new gg[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((ei) this).field_b = param0.a(-1640531527);
            ((ei) this).field_c = param0.a(-1640531527);
            return;
          } else {
            var3 = param0.d((byte) -67);
            if (var3 != 0) {
              param0.field_h = param0.field_h - 1;
              ((ei) this).field_a[var2] = new gg();
              ((ei) this).field_a[var2].a(param0);
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
