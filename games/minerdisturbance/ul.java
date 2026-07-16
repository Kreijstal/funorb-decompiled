/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static int field_b;
    static boolean field_a;
    static String field_d;
    private int[] field_c;

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = MinerDisturbance.field_ab;
        dj.a();
        ml.field_d = 11;
        w.field_R = new int[260];
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2 = 15.0;
            w.field_R[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        if (param0 != 8) {
            ul.a((byte) 48);
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < w.field_R.length) {
            w.field_R[var5] = 255;
            var5++;
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        if (param5 == 256) {
          if (param2 != 0) {
            var7 = 0;
            param2 = param2 + param1;
            var8 = param0;
            L0: while (true) {
              L1: {
                var9 = param3[var8];
                if (0 <= var9) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((ul) this).field_c[var7];
                  break L1;
                }
              }
              L2: {
                L3: {
                  var10 = ((ul) this).field_c[var7];
                  if (((ul) this).field_c[var7] < 0) {
                    int incrementValue$8 = param1;
                    param1++;
                    param4[incrementValue$8] = (byte)(var10 ^ -1);
                    if (param2 > param1) {
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
                  if (0 == (var9 & 64)) {
                    var7++;
                    break L4;
                  } else {
                    var7 = ((ul) this).field_c[var7];
                    break L4;
                  }
                }
                L5: {
                  var10 = ((ul) this).field_c[var7];
                  if (((ul) this).field_c[var7] >= 0) {
                    break L5;
                  } else {
                    int incrementValue$9 = param1;
                    param1++;
                    param4[incrementValue$9] = (byte)(var10 ^ -1);
                    if (param2 <= param1) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((32 & var9) == 0) {
                    var7++;
                    break L6;
                  } else {
                    var7 = ((ul) this).field_c[var7];
                    break L6;
                  }
                }
                L7: {
                  var10 = ((ul) this).field_c[var7];
                  if (((ul) this).field_c[var7] < 0) {
                    int incrementValue$10 = param1;
                    param1++;
                    param4[incrementValue$10] = (byte)(var10 ^ -1);
                    if (param1 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if ((var9 & 16) == 0) {
                    var7++;
                    break L8;
                  } else {
                    var7 = ((ul) this).field_c[var7];
                    break L8;
                  }
                }
                L9: {
                  var10 = ((ul) this).field_c[var7];
                  if (((ul) this).field_c[var7] < 0) {
                    int incrementValue$11 = param1;
                    param1++;
                    param4[incrementValue$11] = (byte)(var10 ^ -1);
                    if (param1 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if ((8 & var9) == 0) {
                    var7++;
                    break L10;
                  } else {
                    var7 = ((ul) this).field_c[var7];
                    break L10;
                  }
                }
                L11: {
                  var10 = ((ul) this).field_c[var7];
                  if (((ul) this).field_c[var7] < 0) {
                    int incrementValue$12 = param1;
                    param1++;
                    param4[incrementValue$12] = (byte)(var10 ^ -1);
                    if (param1 >= param2) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if ((var9 & 4) == 0) {
                    var7++;
                    break L12;
                  } else {
                    var7 = ((ul) this).field_c[var7];
                    break L12;
                  }
                }
                L13: {
                  var10 = ((ul) this).field_c[var7];
                  if (((ul) this).field_c[var7] < 0) {
                    int incrementValue$13 = param1;
                    param1++;
                    param4[incrementValue$13] = (byte)(var10 ^ -1);
                    if (param1 < param2) {
                      var7 = 0;
                      break L13;
                    } else {
                      return var8 - -1 - param0;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((var9 & 2) != 0) {
                    var7 = ((ul) this).field_c[var7];
                    break L14;
                  } else {
                    var7++;
                    break L14;
                  }
                }
                L15: {
                  var10 = ((ul) this).field_c[var7];
                  if (0 > ((ul) this).field_c[var7]) {
                    int incrementValue$14 = param1;
                    param1++;
                    param4[incrementValue$14] = (byte)(var10 ^ -1);
                    if (param2 <= param1) {
                      break L2;
                    } else {
                      var7 = 0;
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (0 != (1 & var9)) {
                    var7 = ((ul) this).field_c[var7];
                    break L16;
                  } else {
                    var7++;
                    break L16;
                  }
                }
                var10 = ((ul) this).field_c[var7];
                if (((ul) this).field_c[var7] < 0) {
                  int incrementValue$15 = param1;
                  param1++;
                  param4[incrementValue$15] = (byte)(var10 ^ -1);
                  if (param1 >= param2) {
                    break L2;
                  } else {
                    var7 = 0;
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
              return var8 - -1 - param0;
            }
          } else {
            return 0;
          }
        } else {
          return 94;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 14) {
            field_a = true;
        }
    }

    private ul() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for graphics";
    }
}
