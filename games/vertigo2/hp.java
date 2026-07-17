/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    private dn[] field_a;
    private int field_b;
    private int field_c;

    final ae a() {
        byte[] var1 = this.b();
        return new ae(22050, var1, 22050 * ((hp) this).field_b / 1000, 22050 * ((hp) this).field_c / 1000);
    }

    final static hp a(r param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, 0);
        if (var3 == null) {
            return null;
        }
        return new hp(new ed(var3));
    }

    final static hp a(r param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, param2, (byte) -25);
        if (var3 == null) {
            return null;
        }
        return new hp(new ed(var3));
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
                  if (((hp) this).field_a[var4] != null) {
                    var5 = ((hp) this).field_a[var4].field_a * 22050 / 1000;
                    var6 = ((hp) this).field_a[var4].field_d * 22050 / 1000;
                    var13 = ((hp) this).field_a[var4].a(var5, ((hp) this).field_a[var4].field_a);
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
            if (((hp) this).field_a[var2] != null) {
              if (((hp) this).field_a[var2].field_a + ((hp) this).field_a[var2].field_d > var1) {
                var1 = ((hp) this).field_a[var2].field_a + ((hp) this).field_a[var2].field_d;
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

    private hp(ed param0) {
        int var2 = 0;
        int var3 = 0;
        ((hp) this).field_a = new dn[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((hp) this).field_b = param0.a((byte) -11);
            ((hp) this).field_c = param0.a((byte) -11);
            return;
          } else {
            var3 = param0.h(-11);
            if (var3 != 0) {
              param0.field_u = param0.field_u - 1;
              ((hp) this).field_a[var2] = new dn();
              ((hp) this).field_a[var2].a(param0);
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
