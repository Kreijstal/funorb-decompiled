/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static byte[][][] field_a;
    private int[] field_d;
    static String field_e;
    static String field_c;
    static bi field_b;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = null;
          field_b = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = Confined.field_J ? 1 : 0;
        if (param4 == 0) {
          return 0;
        } else {
          if (!param5) {
            var7 = 0;
            param4 = param4 + param2;
            var8 = param0;
            L0: while (true) {
              L1: {
                var9 = param3[var8];
                if (-1 < (var9 ^ -1)) {
                  var7 = ((fh) this).field_d[var7];
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              L2: {
                var10 = ((fh) this).field_d[var7];
                if (0 <= ((fh) this).field_d[var7]) {
                  break L2;
                } else {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L2;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                }
              }
              L3: {
                if ((var9 & 64) != 0) {
                  var7 = ((fh) this).field_d[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((fh) this).field_d[var7];
                if (0 > ((fh) this).field_d[var7]) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L4;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (0 != (var9 & 32)) {
                  var7 = ((fh) this).field_d[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((fh) this).field_d[var7];
                if (-1 < (((fh) this).field_d[var7] ^ -1)) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L6;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if ((var9 & 16) != 0) {
                  var7 = ((fh) this).field_d[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((fh) this).field_d[var7];
                if (0 <= ((fh) this).field_d[var7]) {
                  break L8;
                } else {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L8;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                }
              }
              L9: {
                if ((var9 & 8) != 0) {
                  var7 = ((fh) this).field_d[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((fh) this).field_d[var7];
                if (0 <= ((fh) this).field_d[var7]) {
                  break L10;
                } else {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                }
              }
              L11: {
                if (-1 != (4 & var9 ^ -1)) {
                  var7 = ((fh) this).field_d[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((fh) this).field_d[var7];
                if (((fh) this).field_d[var7] < 0) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L12;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (0 == (var9 & 2)) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((fh) this).field_d[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((fh) this).field_d[var7];
                if (0 > ((fh) this).field_d[var7]) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L14;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if ((1 & var9) == 0) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((fh) this).field_d[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((fh) this).field_d[var7];
                if (0 > ((fh) this).field_d[var7]) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L16;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L16;
                }
              }
              var8++;
              continue L0;
            }
          } else {
            var12 = null;
            int discarded$1 = ((fh) this).a(-19, (byte[]) null, 112, (byte[]) null, -9, true);
            var7 = 0;
            param4 = param4 + param2;
            var8 = param0;
            L17: while (true) {
              L18: {
                var9 = param3[var8];
                if (-1 < (var9 ^ -1)) {
                  var7 = ((fh) this).field_d[var7];
                  break L18;
                } else {
                  var7++;
                  break L18;
                }
              }
              L19: {
                var10 = ((fh) this).field_d[var7];
                if (0 <= ((fh) this).field_d[var7]) {
                  break L19;
                } else {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L19;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                }
              }
              L20: {
                if ((var9 & 64) != 0) {
                  var7 = ((fh) this).field_d[var7];
                  break L20;
                } else {
                  var7++;
                  break L20;
                }
              }
              L21: {
                var10 = ((fh) this).field_d[var7];
                if (0 > ((fh) this).field_d[var7]) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L21;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L21;
                }
              }
              L22: {
                if (0 != (var9 & 32)) {
                  var7 = ((fh) this).field_d[var7];
                  break L22;
                } else {
                  var7++;
                  break L22;
                }
              }
              L23: {
                var10 = ((fh) this).field_d[var7];
                if (-1 < (((fh) this).field_d[var7] ^ -1)) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L23;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L23;
                }
              }
              L24: {
                if ((var9 & 16) != 0) {
                  var7 = ((fh) this).field_d[var7];
                  break L24;
                } else {
                  var7++;
                  break L24;
                }
              }
              L25: {
                var10 = ((fh) this).field_d[var7];
                if (0 <= ((fh) this).field_d[var7]) {
                  break L25;
                } else {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L25;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                }
              }
              L26: {
                if ((var9 & 8) != 0) {
                  var7 = ((fh) this).field_d[var7];
                  break L26;
                } else {
                  var7++;
                  break L26;
                }
              }
              L27: {
                var10 = ((fh) this).field_d[var7];
                if (0 <= ((fh) this).field_d[var7]) {
                  break L27;
                } else {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L27;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                }
              }
              L28: {
                if (-1 != (4 & var9 ^ -1)) {
                  var7 = ((fh) this).field_d[var7];
                  break L28;
                } else {
                  var7++;
                  break L28;
                }
              }
              L29: {
                var10 = ((fh) this).field_d[var7];
                if (((fh) this).field_d[var7] < 0) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param4 > param2) {
                    var7 = 0;
                    break L29;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L29;
                }
              }
              L30: {
                if (0 == (var9 & 2)) {
                  var7++;
                  break L30;
                } else {
                  var7 = ((fh) this).field_d[var7];
                  break L30;
                }
              }
              L31: {
                var10 = ((fh) this).field_d[var7];
                if (0 > ((fh) this).field_d[var7]) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L31;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L31;
                }
              }
              L32: {
                if ((1 & var9) == 0) {
                  var7++;
                  break L32;
                } else {
                  var7 = ((fh) this).field_d[var7];
                  break L32;
                }
              }
              L33: {
                var10 = ((fh) this).field_d[var7];
                if (0 > ((fh) this).field_d[var7]) {
                  param2++;
                  param1[param2] = (byte)(var10 ^ -1);
                  if (param2 < param4) {
                    var7 = 0;
                    break L33;
                  } else {
                    return -param0 + (var8 + 1);
                  }
                } else {
                  break L33;
                }
              }
              var8++;
              continue L17;
            }
          }
        }
    }

    final static void a(int param0, byte param1, String param2) {
        int var3 = 0;
        s.field_K = false;
        if (param1 == -1) {
          jd.field_c = false;
          if (ki.field_c != null) {
            if (ki.field_c.field_H) {
              L0: {
                var3 = 1;
                if (param0 == 8) {
                  L1: {
                    if (!rk.field_f) {
                      param2 = ml.field_b;
                      break L1;
                    } else {
                      param2 = bg.field_e;
                      break L1;
                    }
                  }
                  param0 = 2;
                  om.field_p.a(0, kj.field_c);
                  break L0;
                } else {
                  break L0;
                }
              }
              L2: {
                if ((param0 ^ -1) != -11) {
                  break L2;
                } else {
                  ib.c(false);
                  var3 = 0;
                  break L2;
                }
              }
              L3: {
                if (var3 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (!jd.field_c) {
                      break L4;
                    } else {
                      param2 = b.a(new String[1], cg.field_c, param1 + 1178);
                      break L4;
                    }
                  }
                  L5: {
                    if (!pc.field_f) {
                      break L5;
                    } else {
                      param2 = gj.field_c;
                      break L5;
                    }
                  }
                  ki.field_c.a(param2, param0, false);
                  break L3;
                }
              }
              if (param0 != 256) {
                if (10 != param0) {
                  if (rk.field_f) {
                    return;
                  } else {
                    om.field_p.g((byte) -104);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "That name is not available";
        field_e = "Starting controls";
    }
}
