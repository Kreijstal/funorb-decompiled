/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends hs {
    private int[] field_L;
    private int field_T;
    static String field_P;
    private int field_R;
    private int[] field_S;
    private int[] field_K;
    private int field_N;
    int field_Q;
    static volatile int field_J;
    static String[] field_M;
    static String field_O;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 8192) {
            field_J = 99;
        }
        this.a(param0, param1, param2, param3 + 0, param4);
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 != 0) {
            return;
        }
        int var4 = null != ((ob) this).field_K ? ((ob) this).field_K.length : 0;
        int[] var5 = new int[param0 * var4];
        if (((ob) this).field_L != null) {
            if (0 < ((ob) this).field_L.length) {
                if (0 < var5.length) {
                    if (-1 > (param1 ^ -1)) {
                        vm.a(((ob) this).field_L, 0, var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        ((ob) this).field_L = var5;
    }

    private final void a(int param0, byte param1, kb param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_0 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var20 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = ((ob) this).field_K[-1 + ((ob) this).field_K.length];
          var6 = ((ob) this).field_S[((ob) this).field_S.length + -1];
          stackOut_0_0 = ((ob) this).field_l;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (-1 > (param3 ^ -1)) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = ((ob) this).field_K[param3 + -1];
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0 * stackIn_3_1 / var5;
          if ((param0 ^ -1) >= -1) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ((ob) this).field_S[-1 + param0];
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var8 = stackIn_6_0 * ((ob) this).field_w / var6;
        var9 = ((ob) this).field_K[param3] * ((ob) this).field_l / var5;
        var10 = ((ob) this).field_w * ((ob) this).field_S[param0] / var6;
        var11 = param0 * ((ob) this).field_K.length - -param3;
        var12 = 48 & ((ob) this).field_L[var11];
        var13 = 192 & ((ob) this).field_L[var11];
        var14 = param2.field_B;
        if (param1 == 65) {
          L2: {
            L3: {
              var15 = param2.field_p;
              var16 = param2.field_l;
              var17 = param2.field_w;
              if (var9 - var7 <= var16) {
                break L3;
              } else {
                if ((((ob) this).field_L[var11] & 1) == 0) {
                  break L3;
                } else {
                  var16 = -var7 + var9;
                  var14 = var7;
                  break L2;
                }
              }
            }
            L4: {
              if (var16 <= -var7 + var9) {
                break L4;
              } else {
                if (0 != (((ob) this).field_L[var11] & 4)) {
                  var14 = var7;
                  var16 = -var7 + var9;
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            if (var12 != 16) {
              if (32 != var12) {
                var14 = var7;
                break L2;
              } else {
                var14 = var9 - var16;
                break L2;
              }
            } else {
              var14 = var7 - (-var9 + var16) >> 1138687553;
              break L2;
            }
          }
          L5: {
            L6: {
              if (var17 >= var10 - var8) {
                break L6;
              } else {
                if (-1 != (((ob) this).field_L[var11] & 2 ^ -1)) {
                  var15 = var8;
                  var17 = var10 + -var8;
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (var17 <= -var8 + var10) {
                break L7;
              } else {
                if ((8 & ((ob) this).field_L[var11]) != 0) {
                  var17 = var10 - var8;
                  var15 = var8;
                  break L5;
                } else {
                  break L7;
                }
              }
            }
            if (64 == var13) {
              var15 = -var17 + var8 - -var10 >> 177823105;
              break L5;
            } else {
              if ((var13 ^ -1) == -129) {
                var15 = var10 - var17;
                break L5;
              } else {
                var15 = var8;
                break L5;
              }
            }
          }
          var18 = ((ob) this).field_T;
          var19 = ((ob) this).field_R;
          param2.a(var14 + var18, var16 - var18 * 2, var15 + var19, 8192, -(2 * var19) + var17);
          return;
        } else {
          return;
        }
    }

    final void a(kb param0, int param1, int param2) {
        int var4 = ((ob) this).field_N % ((ob) this).field_K.length;
        int var5 = ((ob) this).field_N / ((ob) this).field_K.length;
        ((ob) this).field_L[((ob) this).field_N] = param1;
        ((ob) this).field_C[((ob) this).field_N] = param0;
        if (param0 != null) {
            this.a(var5, (byte) 65, param0, var4);
        }
        if (param2 != 0) {
            return;
        }
        ((ob) this).field_N = ((ob) this).field_N + 1;
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        if (param3 <= 103) {
            return true;
        }
        return this.a(param0, param1, param2, 123, param4, param5, param6);
    }

    final static int a(int param0, boolean param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 > -3) {
            break L0;
          } else {
            if (-37 >= param0) {
              var4 = 0;
              var5 = 0;
              var6 = param3;
              var7 = param2.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L2: {
                    var9 = param2.charAt(var8);
                    if (0 != var8) {
                      break L2;
                    } else {
                      if (45 == var9) {
                        var4 = 1;
                        var8++;
                        continue L1;
                      } else {
                        if (43 != var9) {
                          break L2;
                        } else {
                          if (!param1) {
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (48 > var9) {
                        break L4;
                      } else {
                        if (var9 > 57) {
                          break L4;
                        } else {
                          var9 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 65) {
                        break L5;
                      } else {
                        if (var9 > 90) {
                          break L5;
                        } else {
                          var9 -= 55;
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (97 > var9) {
                        break L6;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param0) {
                    L7: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var6 != var10 / param0) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L1;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 23) {
            field_J = -52;
        }
        int var4 = ((ob) this).field_K == null ? 0 : ((ob) this).field_K.length;
        kb[] var5 = new kb[param2 * var4];
        if (((ob) this).field_C != null) {
            if (-1 > ((ob) this).field_C.length) {
                if (-1 < var5.length) {
                    if (param1 > 0) {
                        vm.a((Object[]) (Object) ((ob) this).field_C, 0, (Object[]) (Object) var5, 0, Math.min(param1, param2) * var4);
                    }
                }
            }
        }
        ((ob) this).field_C = var5;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.a(param0, param1, param2, param3 ^ 0)) {
          var5 = param1;
          if (98 != var5) {
            if (99 == var5) {
              return ((ob) this).a(param0, ((ob) this).field_K.length, true);
            } else {
              if (96 != var5) {
                if (-98 == (var5 ^ -1)) {
                  return ((ob) this).b(param3 ^ -12286, param0);
                } else {
                  L0: {
                    if (param3 == -12215) {
                      break L0;
                    } else {
                      var7 = null;
                      this.a(14, (int[]) null);
                      break L0;
                    }
                  }
                  return false;
                }
              } else {
                return ((ob) this).a((byte) 88, param0);
              }
            }
          } else {
            return ((ob) this).a((byte) 106, param0, ((ob) this).field_K.length);
          }
        } else {
          return true;
        }
    }

    public static void e(byte param0) {
        if (param0 <= 50) {
            field_O = null;
        }
        field_P = null;
        field_M = null;
        field_O = null;
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kb var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= ((ob) this).field_C.length) {
              break L1;
            } else {
              if (((ob) this).field_S.length <= var3) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (((ob) this).field_C.length > var2) {
                    if (var4 < ((ob) this).field_K.length) {
                      var2++;
                      var5 = ((ob) this).field_C[var2];
                      if (var5 != null) {
                        this.a(var3, (byte) 65, var5, var4);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (param0 >= 84) {
              break L3;
            } else {
              var7 = null;
              boolean discarded$1 = ((ob) this).a(-86, 103, -38, 9, (kb) null, 3, 102);
              break L3;
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = null == ((ob) this).field_S ? 0 : ((ob) this).field_S.length;
        kb[] var5 = new kb[param1 * var4];
        if (null != ((ob) this).field_C) {
            if (-1 > (((ob) this).field_C.length ^ -1)) {
                if (var5.length > 0) {
                    if (!((param0 ^ -1) >= -1)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            vm.a((Object[]) (Object) ((ob) this).field_C, var6 * param0, (Object[]) (Object) var5, var6 * param1, Math.min(param0, param1));
                        }
                    }
                }
            }
        }
        if (param2 != -20410) {
            return;
        }
        ((ob) this).field_C = var5;
    }

    ob(int param0, int param1, int param2, int param3, kh param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        ((ob) this).field_Q = 92;
        ((ob) this).field_N = 0;
        int[] var10 = new int[param5];
        int[] var8 = var10;
        vm.a(var10, 0, param5, 1);
        int[] var9 = new int[param6];
        vm.a(var9, 0, param6, 1);
        this.a((byte) 78, var10);
        this.a(0, var9);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = ((ob) this).field_S != null ? ((ob) this).field_S.length : 0;
        int[] var5 = new int[param2 * var4];
        if (((ob) this).field_L != null) {
            if (0 < ((ob) this).field_L.length) {
                if (var5.length < -1) {
                    if (!(-1 >= param1)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            vm.a(((ob) this).field_L, var6 * param1, var5, param2 * var6, Math.min(param1, param2));
                        }
                    }
                }
            }
        }
        if (!param0) {
            return;
        }
        ((ob) this).field_L = var5;
    }

    private final void a(int param0, int[] param1) {
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = null != ((ob) this).field_S ? ((ob) this).field_S.length : 0;
        int var4 = param1.length;
        ((ob) this).field_S = param1;
        int[] var5 = param1;
        int var6 = 0;
        int var7 = param0;
        while (var5.length > var6) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.a((byte) 65, var3, var4);
        this.c(var4, var3, 0);
    }

    final void d(int param0, int param1, int param2) {
        if (param1 != 57) {
            ((ob) this).field_N = 28;
        }
        ((ob) this).field_R = param0;
        ((ob) this).field_T = param2;
    }

    private final void a(byte param0, int[] param1) {
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 85 % ((-2 - param0) / 62);
        int var4 = ((ob) this).field_K != null ? ((ob) this).field_K.length : 0;
        int var5 = param1.length;
        ((ob) this).field_K = param1;
        int[] var6 = param1;
        int var7 = 0;
        int var8 = 0;
        while (var6.length > var7) {
            var8 = var8 + var6[var7];
            var6[var7] = var8 + var6[var7];
            var7++;
        }
        this.b(var4, var5, -20410);
        this.a(true, var4, var5);
    }

    final static String j(int param0) {
        if (param0 != -129) {
            field_J = -78;
        }
        return mk.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Holding your chosen god's standard high, order your forces into battle. For here, upon these bloodstained battlefields, will the armies of Gielinor wage war.";
        field_J = 0;
        field_O = "Game";
    }
}
