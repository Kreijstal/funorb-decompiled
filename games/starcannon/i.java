/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends qe {
    private byte[][] field_A;

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
                int incrementValue$66 = param3;
                param3++;
                var12 = (255 & param1[incrementValue$66]) * param9 >> 8;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
                  var12 = 256 - var12;
                  var14 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    i(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        ((i) this).field_A = new byte[256][];
        ((i) this).field_A = i.a(param5, param6);
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
                int incrementValue$66 = param3;
                param3++;
                var11 = 255 & param1[incrementValue$66];
                if (var11 == 0) {
                  param4++;
                  var10++;
                  continue L1;
                } else {
                  var12 = ((param2 & 16711935) * var11 & -16711936) + ((param2 & 65280) * var11 & 16711680) >> 8;
                  var11 = 256 - var11;
                  var13 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
                  var10++;
                  continue L1;
                }
              }
            }
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
          var8 = param1 + param2 * ki.field_j;
          var9 = ki.field_j - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= ki.field_e) {
            break L0;
          } else {
            var12 = ki.field_e - param2;
            param4 = param4 - var12;
            param2 = ki.field_e;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * ki.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= ki.field_i) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - ki.field_i);
            break L1;
          }
        }
        L2: {
          if (param1 >= ki.field_l) {
            break L2;
          } else {
            var12 = ki.field_l - param1;
            param3 = param3 - var12;
            param1 = ki.field_l;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= ki.field_g) {
            break L3;
          } else {
            var12 = param1 + param3 - ki.field_g;
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
                  i.a(ki.field_a, ((i) this).field_A[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  lk.a(ki.field_a, ((i) this).field_A[param0], param5, var11, var8, param3, param4, var9, var10);
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * ki.field_j;
          var10 = ki.field_j - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= ki.field_e) {
            break L0;
          } else {
            var13 = ki.field_e - param2;
            param4 = param4 - var13;
            param2 = ki.field_e;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * ki.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= ki.field_i) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - ki.field_i);
            break L1;
          }
        }
        L2: {
          if (param1 >= ki.field_l) {
            break L2;
          } else {
            var13 = ki.field_l - param1;
            param3 = param3 - var13;
            param1 = ki.field_l;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= ki.field_g) {
            break L3;
          } else {
            var13 = param1 + param3 - ki.field_g;
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
                  i.a(ki.field_a, ((i) this).field_A[param0], param5, var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  lk.a(ki.field_a, ((i) this).field_A[param0], param5, var12, var9, param3, param4, var10, var11, param6);
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
}
