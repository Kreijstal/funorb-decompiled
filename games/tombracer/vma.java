/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vma {
    private int field_c;
    private int field_b;
    private fka[] field_a;

    final static vma a(cn param0, int param1, int param2) {
        byte[] var3 = param0.a(false, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new vma(new uia(var3));
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
                  if (((vma) this).field_a[var4] != null) {
                    var5 = ((vma) this).field_a[var4].field_v * 22050 / 1000;
                    var6 = ((vma) this).field_a[var4].field_i * 22050 / 1000;
                    var13 = ((vma) this).field_a[var4].a(var5, ((vma) this).field_a[var4].field_v);
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
            if (((vma) this).field_a[var2] != null) {
              if (((vma) this).field_a[var2].field_v + ((vma) this).field_a[var2].field_i > var1) {
                var1 = ((vma) this).field_a[var2].field_v + ((vma) this).field_a[var2].field_i;
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

    final u a() {
        byte[] var1 = this.b();
        return new u(22050, var1, 22050 * ((vma) this).field_c / 1000, 22050 * ((vma) this).field_b / 1000);
    }

    private vma(uia param0) {
        int var2 = 0;
        int var3 = 0;
        ((vma) this).field_a = new fka[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((vma) this).field_c = param0.d(127);
            ((vma) this).field_b = param0.d(121);
          } else {
            var3 = param0.h(255);
            if (var3 != 0) {
              param0.field_h = param0.field_h - 1;
              ((vma) this).field_a[var2] = new fka();
              ((vma) this).field_a[var2].a(param0);
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
