/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends se {
    private byte[][] field_T;

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                param3++;
                var12 = (255 & param1[param3]) * param9 >> 8;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
                  var12 = 256 - var12;
                  var14 = param0[param4];
                  param4++;
                  param0[param4] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * gf.field_i;
          var10 = gf.field_i - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= gf.field_f) {
            break L0;
          } else {
            var13 = gf.field_f - param2;
            param4 = param4 - var13;
            param2 = gf.field_f;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= gf.field_e) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param1 >= gf.field_j) {
            break L2;
          } else {
            var13 = gf.field_j - param1;
            param3 = param3 - var13;
            param1 = gf.field_j;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= gf.field_h) {
            break L3;
          } else {
            var13 = param1 + param3 - gf.field_h;
            param3 = param3 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                if (!param7) {
                  tj.a(gf.field_b, ((tj) this).field_T[param0], param5, var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  gp.a(gf.field_b, ((tj) this).field_T[param0], param5, var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    tj(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        ((tj) this).field_T = new byte[256][];
        ((tj) this).field_T = tj.a(param5, param6);
    }

    private final static byte[][] a(int[] param0, byte[][] param1) {
        int var2_int = 0;
        byte[][] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= param0.length) {
            var2 = param1;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2.length) {
                return param1;
              } else {
                var4 = var2[var3];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4.length) {
                    var3++;
                    continue L1;
                  } else {
                    var6 = var4[var5];
                    if (var6 != 0) {
                      var4[var5] = (byte)param0[var6];
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            var3 = param0[var2_int];
            var4_int = (var3 >> 15 & 510) + (var3 & 255);
            param0[var2_int] = var4_int / 3 + (var3 >> 8 & 255) >> 1;
            var2_int++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var8 = param1 + param2 * gf.field_i;
          var9 = gf.field_i - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= gf.field_f) {
            break L0;
          } else {
            var12 = gf.field_f - param2;
            param4 = param4 - var12;
            param2 = gf.field_f;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= gf.field_e) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param1 >= gf.field_j) {
            break L2;
          } else {
            var12 = gf.field_j - param1;
            param3 = param3 - var12;
            param1 = gf.field_j;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= gf.field_h) {
            break L3;
          } else {
            var12 = param1 + param3 - gf.field_h;
            param3 = param3 - var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                if (!param6) {
                  tj.a(gf.field_b, ((tj) this).field_T[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  gp.a(gf.field_b, ((tj) this).field_T[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var9 = -param6;
        L0: while (true) {
          if (var9 >= 0) {
            return;
          } else {
            var10 = -param5;
            L1: while (true) {
              if (var10 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var9++;
                continue L0;
              } else {
                param3++;
                var11 = 255 & param1[param3];
                if (var11 == 0) {
                  param4++;
                  var10++;
                  continue L1;
                } else {
                  var12 = ((param2 & 16711935) * var11 & -16711936) + ((param2 & 65280) * var11 & 16711680) >> 8;
                  var11 = 256 - var11;
                  var13 = param0[param4];
                  param4++;
                  param0[param4] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
