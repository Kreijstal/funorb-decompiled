/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq {
    private int[] field_a;
    static al field_b;

    final int a(int param0, int param1, byte[] param2, boolean param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == 0) {
          return 0;
        } else {
          if (param3) {
            param1 = param1 + param0;
            var7 = 0;
            var8 = param4;
            L0: while (true) {
              L1: {
                var9 = param2[var8];
                if (0 <= var9) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((kq) this).field_a[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((kq) this).field_a[var7];
                if (((kq) this).field_a[var7] >= 0) {
                  break L2;
                } else {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param1) {
                    var7 = 0;
                    break L2;
                  } else {
                    return 1 + var8 - param4;
                  }
                }
              }
              L3: {
                if (0 == (var9 & 64)) {
                  var7++;
                  break L3;
                } else {
                  var7 = ((kq) this).field_a[var7];
                  break L3;
                }
              }
              L4: {
                var10 = ((kq) this).field_a[var7];
                if (0 > ((kq) this).field_a[var7]) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param1 > param0) {
                    var7 = 0;
                    break L4;
                  } else {
                    return 1 + var8 - param4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if ((32 & var9) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((kq) this).field_a[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((kq) this).field_a[var7];
                if (0 > ((kq) this).field_a[var7]) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param1 > param0) {
                    var7 = 0;
                    break L6;
                  } else {
                    return 1 + var8 - param4;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (0 == (var9 & 16)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((kq) this).field_a[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((kq) this).field_a[var7];
                if (((kq) this).field_a[var7] >= 0) {
                  break L8;
                } else {
                  param0++;
                  param5[param0] = (byte)var10;
                  if (param0 < param1) {
                    var7 = 0;
                    break L8;
                  } else {
                    return 1 + var8 - param4;
                  }
                }
              }
              L9: {
                if (-1 == (var9 & 8)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((kq) this).field_a[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((kq) this).field_a[var7];
                if (((kq) this).field_a[var7] < 0) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param1 > param0) {
                    var7 = 0;
                    break L10;
                  } else {
                    return 1 + var8 - param4;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if ((4 & var9) != 0) {
                  var7 = ((kq) this).field_a[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((kq) this).field_a[var7];
                if (-1 < (((kq) this).field_a[var7] ^ -1)) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param0 < param1) {
                    var7 = 0;
                    break L12;
                  } else {
                    return 1 + var8 - param4;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (0 != (2 & var9)) {
                  var7 = ((kq) this).field_a[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((kq) this).field_a[var7];
                if (-1 < (((kq) this).field_a[var7] ^ -1)) {
                  param0++;
                  param5[param0] = (byte)(var10 ^ -1);
                  if (param1 > param0) {
                    var7 = 0;
                    break L14;
                  } else {
                    return 1 + var8 - param4;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if (0 == (var9 & 1)) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((kq) this).field_a[var7];
                  break L15;
                }
              }
              var10 = ((kq) this).field_a[var7];
              if (((kq) this).field_a[var7] < 0) {
                param0++;
                param5[param0] = (byte)(var10 ^ -1);
                if (param1 > param0) {
                  var7 = 0;
                  var8++;
                  var8++;
                  continue L0;
                } else {
                  return 1 + var8 - param4;
                }
              } else {
                var8++;
                var8++;
                continue L0;
              }
            }
          } else {
            return 13;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1178) {
            kq.a(-49);
        }
    }

    private kq() throws Throwable {
        throw new Error();
    }

    static {
    }
}
