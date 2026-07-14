/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    private int field_a;
    private int field_c;
    private ve[] field_b;

    final ji a() {
        byte[] var1 = this.b();
        return new ji(22050, var1, 22050 * ((jd) this).field_a / 1000, 22050 * ((jd) this).field_c / 1000);
    }

    final static jd a(bj param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, 0, param1);
        if (var3 == null) {
            return null;
        }
        return new jd(new sb(var3));
    }

    final static jd a(bj param0, int param1, int param2) {
        byte[] var3 = param0.a(false, param1, param2);
        if (var3 == null) {
            return null;
        }
        return new jd(new sb(var3));
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
                  if (((jd) this).field_b[var4] != null) {
                    var5 = ((jd) this).field_b[var4].field_h * 22050 / 1000;
                    var6 = ((jd) this).field_b[var4].field_d * 22050 / 1000;
                    var13 = ((jd) this).field_b[var4].a(var5, ((jd) this).field_b[var4].field_h);
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
            if (((jd) this).field_b[var2] != null) {
              if (((jd) this).field_b[var2].field_h + ((jd) this).field_b[var2].field_d > var1) {
                var1 = ((jd) this).field_b[var2].field_h + ((jd) this).field_b[var2].field_d;
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

    private jd(sb param0) {
        int var2 = 0;
        int var3 = 0;
        ((jd) this).field_b = new ve[10];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 10) {
            ((jd) this).field_a = param0.e(-102);
            ((jd) this).field_c = param0.e(-65);
          } else {
            var3 = param0.d((byte) -54);
            if (var3 != 0) {
              param0.field_o = param0.field_o - 1;
              ((jd) this).field_b[var2] = new ve();
              ((jd) this).field_b[var2].a(param0);
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
