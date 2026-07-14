/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private int field_c;
    private rh[] field_a;
    private int field_b;

    final static jc a(ul param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, false);
        if (var3 == null) {
            return null;
        }
        return new jc(new k(var3));
    }

    final static jc a(ul param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, true, param2);
        if (var3 == null) {
            return null;
        }
        return new jc(new k(var3));
    }

    final jd a() {
        byte[] var1 = this.b();
        return new jd(22050, var1, 22050 * ((jc) this).field_b / 1000, 22050 * ((jc) this).field_c / 1000);
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
                  if (((jc) this).field_a[var4] != null) {
                    var5 = ((jc) this).field_a[var4].field_b * 22050 / 1000;
                    var6 = ((jc) this).field_a[var4].field_h * 22050 / 1000;
                    var13 = ((jc) this).field_a[var4].a(var5, ((jc) this).field_a[var4].field_b);
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
            if (((jc) this).field_a[var2] != null) {
              if (((jc) this).field_a[var2].field_b + ((jc) this).field_a[var2].field_h > var1) {
                var1 = ((jc) this).field_a[var2].field_b + ((jc) this).field_a[var2].field_h;
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

    private jc(k param0) {
        int var2 = 0;
        int var3 = 0;
        ((jc) this).field_a = new rh[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((jc) this).field_b = param0.d((byte) 69);
            ((jc) this).field_c = param0.d((byte) 69);
          } else {
            var3 = param0.g(31365);
            if (var3 != 0) {
              param0.field_j = param0.field_j - 1;
              ((jc) this).field_a[var2] = new rh();
              ((jc) this).field_a[var2].a(param0);
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
