/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends m {
    private byte[][] field_K;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var8 = param1 + param2 * vb.field_f;
          var9 = vb.field_f - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= vb.field_i) {
            break L0;
          } else {
            var12 = vb.field_i - param2;
            param4 = param4 - var12;
            param2 = vb.field_i;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * vb.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= vb.field_d) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - vb.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= vb.field_e) {
            break L2;
          } else {
            var12 = vb.field_e - param1;
            param3 = param3 - var12;
            param1 = vb.field_e;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= vb.field_k) {
            break L3;
          } else {
            var12 = param1 + param3 - vb.field_k;
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
                if (vb.field_a == null) {
                  bg.a(vb.field_c, this.field_K[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  bg.a(vb.field_c, this.field_K[param0], param1, param2, param3, param4, param5, var11, var8, var9, var10, vb.field_a, vb.field_l);
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

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int[] param12) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var13 = param2 - vb.field_e;
        var14 = param3 - vb.field_i;
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
                incrementValue$0 = param7;
                param7++;
                if (param1[incrementValue$0] == 0) {
                  param8++;
                  var20++;
                  continue L3;
                } else {
                  incrementValue$1 = param8;
                  param8++;
                  vb.field_c[incrementValue$1] = param6;
                  var20++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var13 = 0;
        int var9 = param1 + param2 * vb.field_f;
        int var10 = vb.field_f - param3;
        int var11 = 0;
        int var12 = 0;
        if (param2 < vb.field_i) {
            var13 = vb.field_i - param2;
            param4 = param4 - var13;
            param2 = vb.field_i;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * vb.field_f;
        }
        if (param2 + param4 > vb.field_d) {
            param4 = param4 - (param2 + param4 - vb.field_d);
        }
        if (param1 < vb.field_e) {
            var13 = vb.field_e - param1;
            param3 = param3 - var13;
            param1 = vb.field_e;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param1 + param3 > vb.field_k) {
            var13 = param1 + param3 - vb.field_k;
            param3 = param3 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param3 <= 0 || param4 <= 0) {
            return;
        }
        bg.a(vb.field_c, this.field_K[param0], param5, var12, var9, param3, param4, var10, var11, param6);
    }

    bg(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, byte[][] param5) {
        super(param0, param1, param2, param3, param4);
        this.field_K = new byte[256][];
        this.field_K = param5;
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var9;
        int var10;
        int var11;
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
                    incrementValue$44 = param3;
                    param3++;
                    if (param1[incrementValue$44] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      incrementValue$45 = param4;
                      param4++;
                      param0[incrementValue$45] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$46 = param3;
                  param3++;
                  if (param1[incrementValue$46] == 0) {
                    param4++;
                    break L3;
                  } else {
                    incrementValue$47 = param4;
                    param4++;
                    param0[incrementValue$47] = param2;
                    break L3;
                  }
                }
                L4: {
                  incrementValue$48 = param3;
                  param3++;
                  if (param1[incrementValue$48] == 0) {
                    param4++;
                    break L4;
                  } else {
                    incrementValue$49 = param4;
                    param4++;
                    param0[incrementValue$49] = param2;
                    break L4;
                  }
                }
                L5: {
                  incrementValue$50 = param3;
                  param3++;
                  if (param1[incrementValue$50] == 0) {
                    param4++;
                    break L5;
                  } else {
                    incrementValue$51 = param4;
                    param4++;
                    param0[incrementValue$51] = param2;
                    break L5;
                  }
                }
                incrementValue$52 = param3;
                param3++;
                if (param1[incrementValue$52] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  incrementValue$53 = param4;
                  param4++;
                  param0[incrementValue$53] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
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
                incrementValue$11 = param3;
                param3++;
                if (param1[incrementValue$11] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var12 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = (((var12 & 16711935) * param9 & -16711936) + ((var12 & 65280) * param9 & 16711680) >> 8) + param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
