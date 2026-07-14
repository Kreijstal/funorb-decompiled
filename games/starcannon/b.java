/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static int[] field_c;
    static String field_d;
    static String field_a;
    private int[] field_b;
    static String field_e;

    final int a(byte param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = StarCannon.field_A;
        if (param2 == 0) {
          return 0;
        } else {
          if (param0 >= 22) {
            param2 = param2 + param5;
            var7 = 0;
            var8 = param4;
            L0: while (true) {
              L1: {
                var9 = param1[var8];
                if (-1 < (var9 ^ -1)) {
                  var7 = ((b) this).field_b[var7];
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var10 = ((b) this).field_b[var7];
                  if (((b) this).field_b[var7] < 0) {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param5 < param2) {
                      var7 = 0;
                      break L3;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((64 & var9) == -1) {
                    var7++;
                    break L4;
                  } else {
                    var7 = ((b) this).field_b[var7];
                    break L4;
                  }
                }
                L5: {
                  var10 = ((b) this).field_b[var7];
                  if (-1 <= ((b) this).field_b[var7]) {
                    break L5;
                  } else {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param2 <= param5) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((var9 & 32) == -1) {
                    var7++;
                    break L6;
                  } else {
                    var7 = ((b) this).field_b[var7];
                    break L6;
                  }
                }
                L7: {
                  var10 = ((b) this).field_b[var7];
                  if (-1 <= ((b) this).field_b[var7]) {
                    break L7;
                  } else {
                    param5++;
                    param3[param5] = (byte)var10;
                    if (param5 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-1 == (16 & var9)) {
                    var7++;
                    break L8;
                  } else {
                    var7 = ((b) this).field_b[var7];
                    break L8;
                  }
                }
                L9: {
                  var10 = ((b) this).field_b[var7];
                  if (-1 >= (((b) this).field_b[var7] ^ -1)) {
                    break L9;
                  } else {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param2 <= param5) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L9;
                    }
                  }
                }
                L10: {
                  if (0 == (var9 & 8)) {
                    var7++;
                    break L10;
                  } else {
                    var7 = ((b) this).field_b[var7];
                    break L10;
                  }
                }
                L11: {
                  var10 = ((b) this).field_b[var7];
                  if (((b) this).field_b[var7] < 0) {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param5 < param2) {
                      var7 = 0;
                      break L11;
                    } else {
                      return 1 + (var8 + -param4);
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 == (var9 & 4)) {
                    var7++;
                    break L12;
                  } else {
                    var7 = ((b) this).field_b[var7];
                    break L12;
                  }
                }
                L13: {
                  var10 = ((b) this).field_b[var7];
                  if (((b) this).field_b[var7] < 0) {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param5 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((2 & var9) == 0) {
                    var7++;
                    break L14;
                  } else {
                    var7 = ((b) this).field_b[var7];
                    break L14;
                  }
                }
                L15: {
                  var10 = ((b) this).field_b[var7];
                  if (0 <= ((b) this).field_b[var7]) {
                    break L15;
                  } else {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param5 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L15;
                    }
                  }
                }
                L16: {
                  if ((1 & var9) != 0) {
                    var7 = ((b) this).field_b[var7];
                    break L16;
                  } else {
                    var7++;
                    break L16;
                  }
                }
                L17: {
                  var10 = ((b) this).field_b[var7];
                  if (((b) this).field_b[var7] < 0) {
                    param5++;
                    param3[param5] = (byte)(var10 ^ -1);
                    if (param5 < param2) {
                      var7 = 0;
                      break L17;
                    } else {
                      break L2;
                    }
                  } else {
                    break L17;
                  }
                }
                var8++;
                continue L0;
              }
              return 1 + (var8 + -param4);
            }
          } else {
            return -63;
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            b.a(true);
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static ue a(boolean param0, int param1) {
        if (param0) {
            b.a(true);
        }
        return ri.a(true, false, 1, param1, false, true);
    }

    private b() throws Throwable {
        throw new Error();
    }

    final static sk a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        sk var7 = null;
        int var8 = StarCannon.field_A;
        int var2 = param0.length();
        if (var2 == 0) {
            return qb.field_b;
        }
        if (!(var2 >= -256)) {
            return ai.field_a;
        }
        String[] var3 = uj.a(-29, '.', param0);
        if (-3 > var3.length) {
            return qb.field_b;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ad.a(-127, var6);
            if (var7 != null) {
                return var7;
            }
        }
        if (param1 < 108) {
            field_d = null;
        }
        return vf.a(var3[-1 + var3.length], (byte) -18);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8];
        field_d = "HELIX POWER:";
        field_a = "No highscores";
    }
}
