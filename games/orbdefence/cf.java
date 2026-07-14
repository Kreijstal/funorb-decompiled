/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static int field_c;
    static int[] field_b;
    static String field_g;
    private int[] field_f;
    static eb field_a;
    static int field_d;
    static int[] field_e;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        if (param0 != 0) {
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = OrbDefence.field_D ? 1 : 0;
        if (!ml.b(-107)) {
          if (mg.field_k != null) {
            if (!mg.field_k.field_e) {
              return;
            } else {
              lb.a(true);
              b.field_n.b((byte) 74, (pj) (Object) new gg(b.field_n, hh.field_d));
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$4 = b.field_n.a(em.field_q, false, true, lc.field_t);
          b.field_n.o(117);
          var1 = 17 % ((param0 - 53) / 47);
          L0: while (true) {
            if (!nf.e(32722)) {
              return;
            } else {
              boolean discarded$5 = b.field_n.a(od.field_k, true, ob.field_K);
              continue L0;
            }
          }
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        if (0 == param5) {
          return 0;
        } else {
          var7 = 0;
          if (param2 == -1) {
            param5 = param5 + param3;
            var8 = param0;
            L0: while (true) {
              L1: {
                var9 = param4[var8];
                if (var9 >= 0) {
                  var7++;
                  break L1;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L1;
                }
              }
              L2: {
                var10 = ((cf) this).field_f[var7];
                if (((cf) this).field_f[var7] < 0) {
                  param3++;
                  param1[param3] = (byte)var10;
                  if (param3 < param5) {
                    var7 = 0;
                    break L2;
                  } else {
                    return 1 + var8 - param0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (-1 == (64 & var9)) {
                  var7++;
                  break L3;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L3;
                }
              }
              L4: {
                var10 = ((cf) this).field_f[var7];
                if (((cf) this).field_f[var7] >= 0) {
                  break L4;
                } else {
                  param3++;
                  param1[param3] = (byte)(var10 ^ -1);
                  if (param5 > param3) {
                    var7 = 0;
                    break L4;
                  } else {
                    return 1 + var8 - param0;
                  }
                }
              }
              L5: {
                if ((var9 & 32) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((cf) this).field_f[var7];
                if (0 <= ((cf) this).field_f[var7]) {
                  break L6;
                } else {
                  param3++;
                  param1[param3] = (byte)var10;
                  if (param5 > param3) {
                    var7 = 0;
                    break L6;
                  } else {
                    return 1 + var8 - param0;
                  }
                }
              }
              L7: {
                if (-1 == (16 & var9)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((cf) this).field_f[var7];
                if (((cf) this).field_f[var7] < 0) {
                  param3++;
                  param1[param3] = (byte)var10;
                  if (param5 > param3) {
                    var7 = 0;
                    break L8;
                  } else {
                    return 1 + var8 - param0;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if (-1 == (var9 & 8)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((cf) this).field_f[var7];
                if (((cf) this).field_f[var7] < 0) {
                  param3++;
                  param1[param3] = (byte)(var10 ^ -1);
                  if (param5 > param3) {
                    var7 = 0;
                    break L10;
                  } else {
                    return 1 + var8 - param0;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (0 != (4 & var9)) {
                  var7 = ((cf) this).field_f[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((cf) this).field_f[var7];
                if (((cf) this).field_f[var7] >= 0) {
                  break L12;
                } else {
                  param3++;
                  param1[param3] = (byte)var10;
                  if (param5 > param3) {
                    var7 = 0;
                    break L12;
                  } else {
                    return 1 + var8 - param0;
                  }
                }
              }
              L13: {
                if (-1 == (2 & var9)) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((cf) this).field_f[var7];
                if (0 <= ((cf) this).field_f[var7]) {
                  break L14;
                } else {
                  param3++;
                  param1[param3] = (byte)(var10 ^ -1);
                  if (param3 < param5) {
                    var7 = 0;
                    break L14;
                  } else {
                    return 1 + var8 - param0;
                  }
                }
              }
              L15: {
                if ((1 & var9) != 0) {
                  var7 = ((cf) this).field_f[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              var10 = ((cf) this).field_f[var7];
              if (-1 < (((cf) this).field_f[var7] ^ -1)) {
                param3++;
                param1[param3] = (byte)(var10 ^ -1);
                if (param5 > param3) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  return 1 + var8 - param0;
                }
              } else {
                var8++;
                continue L0;
              }
            }
          } else {
            field_e = null;
            param5 = param5 + param3;
            var8 = param0;
            L16: while (true) {
              L17: {
                var9 = param4[var8];
                if (var9 >= 0) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L17;
                }
              }
              L18: {
                var10 = ((cf) this).field_f[var7];
                if (((cf) this).field_f[var7] < 0) {
                  param3++;
                  param1[param3] = (byte)(var10 ^ -1);
                  if (param3 < param5) {
                    var7 = 0;
                    break L18;
                  } else {
                    return 1 + var8 - param0;
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                if (-1 == (64 & var9 ^ -1)) {
                  var7++;
                  break L19;
                } else {
                  var7 = ((cf) this).field_f[var7];
                  break L19;
                }
              }
              L20: {
                L21: {
                  var10 = ((cf) this).field_f[var7];
                  if (((cf) this).field_f[var7] >= 0) {
                    break L21;
                  } else {
                    param3++;
                    param1[param3] = (byte)(var10 ^ -1);
                    if (param5 > param3) {
                      var7 = 0;
                      break L21;
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if ((var9 & 32) == 0) {
                    var7++;
                    break L22;
                  } else {
                    var7 = ((cf) this).field_f[var7];
                    break L22;
                  }
                }
                L23: {
                  var10 = ((cf) this).field_f[var7];
                  if (0 <= ((cf) this).field_f[var7]) {
                    break L23;
                  } else {
                    param3++;
                    param1[param3] = (byte)var10;
                    if (param5 > param3) {
                      var7 = 0;
                      break L23;
                    } else {
                      break L20;
                    }
                  }
                }
                L24: {
                  if (-1 == (16 & var9)) {
                    var7++;
                    break L24;
                  } else {
                    var7 = ((cf) this).field_f[var7];
                    break L24;
                  }
                }
                L25: {
                  var10 = ((cf) this).field_f[var7];
                  if (((cf) this).field_f[var7] < 0) {
                    param3++;
                    param1[param3] = (byte)var10;
                    if (param5 > param3) {
                      var7 = 0;
                      break L25;
                    } else {
                      break L20;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (-1 == (var9 & 8)) {
                    var7++;
                    break L26;
                  } else {
                    var7 = ((cf) this).field_f[var7];
                    break L26;
                  }
                }
                L27: {
                  var10 = ((cf) this).field_f[var7];
                  if (((cf) this).field_f[var7] < 0) {
                    param3++;
                    param1[param3] = (byte)(var10 ^ -1);
                    if (param5 > param3) {
                      var7 = 0;
                      break L27;
                    } else {
                      return 1 + var8 - param0;
                    }
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (0 != (4 & var9)) {
                    var7 = ((cf) this).field_f[var7];
                    break L28;
                  } else {
                    var7++;
                    break L28;
                  }
                }
                L29: {
                  var10 = ((cf) this).field_f[var7];
                  if (((cf) this).field_f[var7] >= 0) {
                    break L29;
                  } else {
                    param3++;
                    param1[param3] = (byte)var10;
                    if (param5 > param3) {
                      var7 = 0;
                      break L29;
                    } else {
                      return 1 + var8 - param0;
                    }
                  }
                }
                L30: {
                  if (-1 == (2 & var9)) {
                    var7++;
                    break L30;
                  } else {
                    var7 = ((cf) this).field_f[var7];
                    break L30;
                  }
                }
                L31: {
                  var10 = ((cf) this).field_f[var7];
                  if (0 <= ((cf) this).field_f[var7]) {
                    break L31;
                  } else {
                    param3++;
                    param1[param3] = (byte)(var10 ^ -1);
                    if (param3 >= param5) {
                      break L20;
                    } else {
                      var7 = 0;
                      break L31;
                    }
                  }
                }
                L32: {
                  if ((1 & var9) != 0) {
                    var7 = ((cf) this).field_f[var7];
                    break L32;
                  } else {
                    var7++;
                    break L32;
                  }
                }
                var10 = ((cf) this).field_f[var7];
                if (-1 < (((cf) this).field_f[var7] ^ -1)) {
                  param3++;
                  param1[param3] = (byte)(var10 ^ -1);
                  if (param5 > param3) {
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
              return 1 + var8 - param0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_g = "TIME";
        field_e = new int[8192];
    }
}
