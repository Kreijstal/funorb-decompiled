/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static int field_c;
    static int[] field_a;
    static cf field_d;
    private int[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            vn[] discarded$0 = bm.a((byte) -11, -100);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        if (0 == param2) {
          return 0;
        } else {
          var7 = 0;
          param2 = param2 + param1;
          if (param3 == 13674) {
            var8 = param4;
            L0: while (true) {
              L1: {
                var9 = param0[var8];
                if ((var9 ^ -1) <= -1) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((bm) this).field_b[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((bm) this).field_b[var7];
                if (((bm) this).field_b[var7] >= 0) {
                  break L2;
                } else {
                  int incrementValue$14 = param1;
                  param1++;
                  param5[incrementValue$14] = (byte)(var10 ^ -1);
                  if (param2 > param1) {
                    var7 = 0;
                    break L2;
                  } else {
                    return -param4 + 1 + var8;
                  }
                }
              }
              L3: {
                if ((var9 & 64) != -1) {
                  var7 = ((bm) this).field_b[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((bm) this).field_b[var7];
                if (-1 > ((bm) this).field_b[var7]) {
                  int incrementValue$15 = param1;
                  param1++;
                  param5[incrementValue$15] = (byte)var10;
                  if (param2 > param1) {
                    var7 = 0;
                    break L4;
                  } else {
                    return -param4 + 1 + var8;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (-1 != (var9 & 32)) {
                  var7 = ((bm) this).field_b[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((bm) this).field_b[var7];
                if (((bm) this).field_b[var7] >= 0) {
                  break L6;
                } else {
                  int incrementValue$16 = param1;
                  param1++;
                  param5[incrementValue$16] = (byte)(var10 ^ -1);
                  if (param2 > param1) {
                    var7 = 0;
                    break L6;
                  } else {
                    return -param4 + 1 + var8;
                  }
                }
              }
              L7: {
                if (0 != (var9 & 16)) {
                  var7 = ((bm) this).field_b[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((bm) this).field_b[var7];
                if (-1 >= (((bm) this).field_b[var7] ^ -1)) {
                  break L8;
                } else {
                  int incrementValue$17 = param1;
                  param1++;
                  param5[incrementValue$17] = (byte)(var10 ^ -1);
                  if (param1 < param2) {
                    var7 = 0;
                    break L8;
                  } else {
                    return -param4 + 1 + var8;
                  }
                }
              }
              L9: {
                if ((8 & var9) == 0) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((bm) this).field_b[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((bm) this).field_b[var7];
                if (0 <= ((bm) this).field_b[var7]) {
                  break L10;
                } else {
                  int incrementValue$18 = param1;
                  param1++;
                  param5[incrementValue$18] = (byte)(var10 ^ -1);
                  if (param2 > param1) {
                    var7 = 0;
                    break L10;
                  } else {
                    return -param4 + 1 + var8;
                  }
                }
              }
              L11: {
                if ((4 & var9) == 0) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((bm) this).field_b[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((bm) this).field_b[var7];
                if (0 > ((bm) this).field_b[var7]) {
                  int incrementValue$19 = param1;
                  param1++;
                  param5[incrementValue$19] = (byte)(var10 ^ -1);
                  if (param2 > param1) {
                    var7 = 0;
                    break L12;
                  } else {
                    return -param4 + 1 + var8;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (-1 == (2 & var9)) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((bm) this).field_b[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((bm) this).field_b[var7];
                if (-1 > ((bm) this).field_b[var7]) {
                  int incrementValue$20 = param1;
                  param1++;
                  param5[incrementValue$20] = (byte)(var10 ^ -1);
                  if (param1 >= param2) {
                    return -param4 + 1 + var8;
                  } else {
                    var7 = 0;
                    break L14;
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
                  var7 = ((bm) this).field_b[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((bm) this).field_b[var7];
                if (-1 >= (((bm) this).field_b[var7] ^ -1)) {
                  break L16;
                } else {
                  break L16;
                }
              }
              var8++;
              continue L0;
            }
          } else {
            ((bm) this).field_b = null;
            var8 = param4;
            L17: while (true) {
              L18: {
                var9 = param0[var8];
                if ((var9 ^ -1) <= -1) {
                  var7++;
                  break L18;
                } else {
                  var7 = ((bm) this).field_b[var7];
                  break L18;
                }
              }
              L19: {
                L20: {
                  var10 = ((bm) this).field_b[var7];
                  if (((bm) this).field_b[var7] >= 0) {
                    break L20;
                  } else {
                    int incrementValue$21 = param1;
                    param1++;
                    param5[incrementValue$21] = (byte)(var10 ^ -1);
                    if (param2 > param1) {
                      var7 = 0;
                      break L20;
                    } else {
                      break L19;
                    }
                  }
                }
                L21: {
                  if ((var9 & 64) != -1) {
                    var7 = ((bm) this).field_b[var7];
                    break L21;
                  } else {
                    var7++;
                    break L21;
                  }
                }
                L22: {
                  var10 = ((bm) this).field_b[var7];
                  if (-1 > ((bm) this).field_b[var7]) {
                    int incrementValue$22 = param1;
                    param1++;
                    param5[incrementValue$22] = (byte)(var10 ^ -1);
                    if (param2 > param1) {
                      var7 = 0;
                      break L22;
                    } else {
                      return -param4 + 1 + var8;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-1 != (var9 & 32 ^ -1)) {
                    var7 = ((bm) this).field_b[var7];
                    break L23;
                  } else {
                    var7++;
                    break L23;
                  }
                }
                L24: {
                  var10 = ((bm) this).field_b[var7];
                  if (((bm) this).field_b[var7] >= 0) {
                    break L24;
                  } else {
                    int incrementValue$23 = param1;
                    param1++;
                    param5[incrementValue$23] = (byte)(var10 ^ -1);
                    if (param2 > param1) {
                      var7 = 0;
                      break L24;
                    } else {
                      return -param4 + 1 + var8;
                    }
                  }
                }
                L25: {
                  if (0 != (var9 & 16)) {
                    var7 = ((bm) this).field_b[var7];
                    break L25;
                  } else {
                    var7++;
                    break L25;
                  }
                }
                L26: {
                  var10 = ((bm) this).field_b[var7];
                  if (-1 >= (((bm) this).field_b[var7] ^ -1)) {
                    break L26;
                  } else {
                    int incrementValue$24 = param1;
                    param1++;
                    param5[incrementValue$24] = (byte)(var10 ^ -1);
                    if (param1 < param2) {
                      var7 = 0;
                      break L26;
                    } else {
                      break L19;
                    }
                  }
                }
                L27: {
                  if ((8 & var9) == 0) {
                    var7++;
                    break L27;
                  } else {
                    var7 = ((bm) this).field_b[var7];
                    break L27;
                  }
                }
                L28: {
                  var10 = ((bm) this).field_b[var7];
                  if (0 <= ((bm) this).field_b[var7]) {
                    break L28;
                  } else {
                    int incrementValue$25 = param1;
                    param1++;
                    param5[incrementValue$25] = (byte)(var10 ^ -1);
                    if (param2 > param1) {
                      var7 = 0;
                      break L28;
                    } else {
                      break L19;
                    }
                  }
                }
                L29: {
                  if ((4 & var9) == 0) {
                    var7++;
                    break L29;
                  } else {
                    var7 = ((bm) this).field_b[var7];
                    break L29;
                  }
                }
                L30: {
                  var10 = ((bm) this).field_b[var7];
                  if (0 > ((bm) this).field_b[var7]) {
                    int incrementValue$26 = param1;
                    param1++;
                    param5[incrementValue$26] = (byte)(var10 ^ -1);
                    if (param2 > param1) {
                      var7 = 0;
                      break L30;
                    } else {
                      return -param4 + 1 + var8;
                    }
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (-1 == (2 & var9)) {
                    var7++;
                    break L31;
                  } else {
                    var7 = ((bm) this).field_b[var7];
                    break L31;
                  }
                }
                L32: {
                  var10 = ((bm) this).field_b[var7];
                  if (-1 > ((bm) this).field_b[var7]) {
                    int incrementValue$27 = param1;
                    param1++;
                    param5[incrementValue$27] = (byte)(var10 ^ -1);
                    if (param1 >= param2) {
                      break L19;
                    } else {
                      var7 = 0;
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (0 == (var9 & 1)) {
                    var7++;
                    break L33;
                  } else {
                    var7 = ((bm) this).field_b[var7];
                    break L33;
                  }
                }
                L34: {
                  var10 = ((bm) this).field_b[var7];
                  if (-1 >= (((bm) this).field_b[var7] ^ -1)) {
                    break L34;
                  } else {
                    break L34;
                  }
                }
                var8++;
                continue L17;
              }
              return -param4 + 1 + var8;
            }
          }
        }
    }

    final static vn[] a(byte param0, int param1) {
        vn[] var2 = null;
        vn[] var3 = null;
        var3 = new vn[9];
        var2 = var3;
        if (param0 >= -67) {
          vn[] discarded$2 = bm.a((byte) 106, 78);
          var3[4] = qk.c(param1, (byte) -71, 64);
          return var2;
        } else {
          var3[4] = qk.c(param1, (byte) -71, 64);
          return var2;
        }
    }

    private bm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[16];
    }
}
