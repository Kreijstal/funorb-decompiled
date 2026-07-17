/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends qi {
    private byte[][] field_M;

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    int incrementValue$218 = param3;
                    param3++;
                    if (param1[incrementValue$218] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param0[incrementValue$219] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3++;
                  if (param1[incrementValue$220] == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param0[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3++;
                  if (param1[incrementValue$222] == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param0[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3++;
                  if (param1[incrementValue$224] == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param0[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3++;
                if (param1[incrementValue$226] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
                  param4++;
                  param0[incrementValue$227] = param2;
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
          var9 = param1 + param2 * tc.field_j;
          var10 = tc.field_j - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= tc.field_a) {
            break L0;
          } else {
            var13 = tc.field_a - param2;
            param4 = param4 - var13;
            param2 = tc.field_a;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * tc.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= tc.field_i) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - tc.field_i);
            break L1;
          }
        }
        L2: {
          if (param1 >= tc.field_d) {
            break L2;
          } else {
            var13 = tc.field_d - param1;
            param3 = param3 - var13;
            param1 = tc.field_d;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= tc.field_e) {
            break L3;
          } else {
            var13 = param1 + param3 - tc.field_e;
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
              fn.a(tc.field_b, ((fn) this).field_M[param0], param5, var12, var9, param3, param4, var10, var11, param6);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int[] param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var13 = param2 - tc.field_d;
        var14 = param3 - tc.field_a;
        var15 = var14;
        L0: while (true) {
          if (var15 >= var14 + param5) {
            return;
          } else {
            L1: {
              var16 = param11[var15];
              var17 = param12[var15];
              var18 = param4;
              if (var13 <= var16) {
                var19 = var16 - var13;
                if (var19 < param4) {
                  param7 = param7 + var19;
                  var18 = var18 - var19;
                  param8 = param8 + var19;
                  break L1;
                } else {
                  param7 = param7 + (param4 + param10);
                  param8 = param8 + (param4 + param9);
                  var15++;
                  continue L0;
                }
              } else {
                var19 = var13 - var16;
                if (var19 < var17) {
                  var17 = var17 - var19;
                  break L1;
                } else {
                  param7 = param7 + (param4 + param10);
                  param8 = param8 + (param4 + param9);
                  var15++;
                  continue L0;
                }
              }
            }
            L2: {
              var19 = 0;
              if (var18 >= var17) {
                var19 = var18 - var17;
                break L2;
              } else {
                var17 = var18;
                break L2;
              }
            }
            var20 = -var17;
            L3: while (true) {
              if (var20 >= 0) {
                param7 = param7 + (var19 + param10);
                param8 = param8 + (var19 + param9);
                var15++;
                continue L0;
              } else {
                int incrementValue$2 = param7;
                param7++;
                if (param1[incrementValue$2] == 0) {
                  param8++;
                  var20++;
                  continue L3;
                } else {
                  int incrementValue$3 = param8;
                  param8++;
                  tc.field_b[incrementValue$3] = param6;
                  var20++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    fn(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, byte[][] param5) {
        super(param0, param1, param2, param3, param4);
        ((fn) this).field_M = new byte[256][];
        ((fn) this).field_M = param5;
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        param2 = ((param2 & 16711935) * param9 & -16711936) + ((param2 & 65280) * param9 & 16711680) >> 8;
        param9 = 256 - param9;
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
                if (param1[incrementValue$66] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var12 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = (((var12 & 16711935) * param9 & -16711936) + ((var12 & 65280) * param9 & 16711680) >> 8) + param2;
                  var11++;
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
          var8 = param1 + param2 * tc.field_j;
          var9 = tc.field_j - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= tc.field_a) {
            break L0;
          } else {
            var12 = tc.field_a - param2;
            param4 = param4 - var12;
            param2 = tc.field_a;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * tc.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= tc.field_i) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - tc.field_i);
            break L1;
          }
        }
        L2: {
          if (param1 >= tc.field_d) {
            break L2;
          } else {
            var12 = tc.field_d - param1;
            param3 = param3 - var12;
            param1 = tc.field_d;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= tc.field_e) {
            break L3;
          } else {
            var12 = param1 + param3 - tc.field_e;
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
                if (tc.field_f == null) {
                  fn.a(tc.field_b, ((fn) this).field_M[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  fn.a(tc.field_b, ((fn) this).field_M[param0], param1, param2, param3, param4, param5, var11, var8, var9, var10, tc.field_f, tc.field_h);
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
}
