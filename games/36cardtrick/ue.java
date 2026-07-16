/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private int[] field_c;
    static int field_d;
    static bk field_b;
    static qk field_a;

    public static void a(int param0) {
        if (param0 != 4) {
            ue.a(-20);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -2694) {
            field_d = -63;
            s.field_c = param0;
            dl.field_g = param2;
            return;
        }
        s.field_c = param0;
        dl.field_g = param2;
    }

    final int a(int param0, byte[] param1, byte[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Main.field_T;
        if (param0 != 0) {
          var7 = 0;
          param0 = param0 + param3;
          if (param4 > 95) {
            var8 = param5;
            L0: while (true) {
              L1: {
                var9 = param2[var8];
                if (0 <= var9) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((ue) this).field_c[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((ue) this).field_c[var7];
                if (((ue) this).field_c[var7] >= 0) {
                  break L2;
                } else {
                  int incrementValue$16 = param3;
                  param3++;
                  param1[incrementValue$16] = (byte)(var10 ^ -1);
                  if (param3 < param0) {
                    var7 = 0;
                    break L2;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L3: {
                if (0 != (64 & var9)) {
                  var7 = ((ue) this).field_c[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((ue) this).field_c[var7];
                if (-1 >= (((ue) this).field_c[var7] ^ -1)) {
                  break L4;
                } else {
                  int incrementValue$17 = param3;
                  param3++;
                  param1[incrementValue$17] = (byte)var10;
                  if (param3 < param0) {
                    var7 = 0;
                    break L4;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L5: {
                if (-1 == (var9 & 32)) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((ue) this).field_c[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((ue) this).field_c[var7];
                if (((ue) this).field_c[var7] < 0) {
                  int incrementValue$18 = param3;
                  param3++;
                  param1[incrementValue$18] = (byte)(var10 ^ -1);
                  if (param0 > param3) {
                    var7 = 0;
                    break L6;
                  } else {
                    return 1 + (var8 - param5);
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if ((var9 & 16) != 0) {
                  var7 = ((ue) this).field_c[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((ue) this).field_c[var7];
                if (0 <= ((ue) this).field_c[var7]) {
                  break L8;
                } else {
                  int incrementValue$19 = param3;
                  param3++;
                  param1[incrementValue$19] = (byte)var10;
                  if (param3 < param0) {
                    var7 = 0;
                    break L8;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L9: {
                if (-1 == (8 & var9)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((ue) this).field_c[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((ue) this).field_c[var7];
                if (-1 >= (((ue) this).field_c[var7] ^ -1)) {
                  break L10;
                } else {
                  int incrementValue$20 = param3;
                  param3++;
                  param1[incrementValue$20] = (byte)var10;
                  if (param0 > param3) {
                    var7 = 0;
                    break L10;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L11: {
                if (-1 != (var9 & 4)) {
                  var7 = ((ue) this).field_c[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((ue) this).field_c[var7];
                if (((ue) this).field_c[var7] >= 0) {
                  break L12;
                } else {
                  int incrementValue$21 = param3;
                  param3++;
                  param1[incrementValue$21] = (byte)(var10 ^ -1);
                  if (param3 < param0) {
                    var7 = 0;
                    break L12;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L13: {
                if ((var9 & 2) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((ue) this).field_c[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((ue) this).field_c[var7];
                if (((ue) this).field_c[var7] < 0) {
                  int incrementValue$22 = param3;
                  param3++;
                  param1[incrementValue$22] = (byte)(var10 ^ -1);
                  if (param0 > param3) {
                    var7 = 0;
                    break L14;
                  } else {
                    return 1 + (var8 - param5);
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
                  var7 = ((ue) this).field_c[var7];
                  break L15;
                }
              }
              var10 = ((ue) this).field_c[var7];
              if (-1 < (((ue) this).field_c[var7] ^ -1)) {
                int incrementValue$23 = param3;
                param3++;
                param1[incrementValue$23] = (byte)(var10 ^ -1);
                if (param0 > param3) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  return 1 + (var8 - param5);
                }
              } else {
                var8++;
                continue L0;
              }
            }
          } else {
            field_a = null;
            var8 = param5;
            L16: while (true) {
              L17: {
                var9 = param2[var8];
                if (0 <= var9) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((ue) this).field_c[var7];
                  break L17;
                }
              }
              L18: {
                var10 = ((ue) this).field_c[var7];
                if (((ue) this).field_c[var7] >= 0) {
                  break L18;
                } else {
                  int incrementValue$24 = param3;
                  param3++;
                  param1[incrementValue$24] = (byte)(var10 ^ -1);
                  if (param3 < param0) {
                    var7 = 0;
                    break L18;
                  } else {
                    return 1 + (var8 - param5);
                  }
                }
              }
              L19: {
                if (0 != (64 & var9)) {
                  var7 = ((ue) this).field_c[var7];
                  break L19;
                } else {
                  var7++;
                  break L19;
                }
              }
              L20: {
                L21: {
                  var10 = ((ue) this).field_c[var7];
                  if (-1 >= (((ue) this).field_c[var7] ^ -1)) {
                    break L21;
                  } else {
                    int incrementValue$25 = param3;
                    param3++;
                    param1[incrementValue$25] = (byte)var10;
                    if (param3 < param0) {
                      var7 = 0;
                      break L21;
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if (-1 == (var9 & 32)) {
                    var7++;
                    break L22;
                  } else {
                    var7 = ((ue) this).field_c[var7];
                    break L22;
                  }
                }
                L23: {
                  var10 = ((ue) this).field_c[var7];
                  if (((ue) this).field_c[var7] < 0) {
                    int incrementValue$26 = param3;
                    param3++;
                    param1[incrementValue$26] = (byte)(var10 ^ -1);
                    if (param0 > param3) {
                      var7 = 0;
                      break L23;
                    } else {
                      break L20;
                    }
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((var9 & 16) != 0) {
                    var7 = ((ue) this).field_c[var7];
                    break L24;
                  } else {
                    var7++;
                    break L24;
                  }
                }
                L25: {
                  var10 = ((ue) this).field_c[var7];
                  if (0 <= ((ue) this).field_c[var7]) {
                    break L25;
                  } else {
                    int incrementValue$27 = param3;
                    param3++;
                    param1[incrementValue$27] = (byte)(var10 ^ -1);
                    if (param3 < param0) {
                      var7 = 0;
                      break L25;
                    } else {
                      return 1 + (var8 - param5);
                    }
                  }
                }
                L26: {
                  if (-1 == (8 & var9)) {
                    var7++;
                    break L26;
                  } else {
                    var7 = ((ue) this).field_c[var7];
                    break L26;
                  }
                }
                L27: {
                  var10 = ((ue) this).field_c[var7];
                  if (-1 <= ((ue) this).field_c[var7]) {
                    break L27;
                  } else {
                    int incrementValue$28 = param3;
                    param3++;
                    param1[incrementValue$28] = (byte)var10;
                    if (param0 > param3) {
                      var7 = 0;
                      break L27;
                    } else {
                      break L20;
                    }
                  }
                }
                L28: {
                  if (-1 != (var9 & 4)) {
                    var7 = ((ue) this).field_c[var7];
                    break L28;
                  } else {
                    var7++;
                    break L28;
                  }
                }
                L29: {
                  var10 = ((ue) this).field_c[var7];
                  if (((ue) this).field_c[var7] >= 0) {
                    break L29;
                  } else {
                    int incrementValue$29 = param3;
                    param3++;
                    param1[incrementValue$29] = (byte)(var10 ^ -1);
                    if (param3 < param0) {
                      var7 = 0;
                      break L29;
                    } else {
                      break L20;
                    }
                  }
                }
                L30: {
                  if ((var9 & 2) == 0) {
                    var7++;
                    break L30;
                  } else {
                    var7 = ((ue) this).field_c[var7];
                    break L30;
                  }
                }
                L31: {
                  var10 = ((ue) this).field_c[var7];
                  if (((ue) this).field_c[var7] < 0) {
                    int incrementValue$30 = param3;
                    param3++;
                    param1[incrementValue$30] = (byte)(var10 ^ -1);
                    if (param0 > param3) {
                      var7 = 0;
                      break L31;
                    } else {
                      return 1 + (var8 - param5);
                    }
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (0 == (var9 & 1)) {
                    var7++;
                    break L32;
                  } else {
                    var7 = ((ue) this).field_c[var7];
                    break L32;
                  }
                }
                var10 = ((ue) this).field_c[var7];
                if (-1 < (((ue) this).field_c[var7] ^ -1)) {
                  int incrementValue$31 = param3;
                  param3++;
                  param1[incrementValue$31] = (byte)(var10 ^ -1);
                  if (param0 > param3) {
                    var7 = 0;
                    var8++;
                    continue L16;
                  } else {
                    break L20;
                  }
                } else {
                  var8++;
                  continue L16;
                }
              }
              return 1 + (var8 - param5);
            }
          }
        } else {
          return 0;
        }
    }

    private ue() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new bk();
    }
}
