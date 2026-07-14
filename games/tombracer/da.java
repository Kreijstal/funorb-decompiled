/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    static boolean field_c;
    private qla field_a;
    private ha field_b;

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        if (!(param5 != null)) {
            return;
        }
        this.a(param3, param0, param1 + 116);
        if (param1 != -1) {
            return;
        }
        this.a(false, param2 - ((da) this).field_a.a(param5, (byte) 107) / 2, (aa) null, (int[]) null, 0, (nh[]) null, param5, 0, param4);
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    private final void a(int param0, int param1, int param2) {
        nt.field_b = -1;
        if (param2 < 106) {
            ((da) this).field_a = null;
        }
        cka.field_ab = 0;
        lra.field_g = param0;
        v.field_k = param0;
        moa.field_a = 0;
        if (param1 == -1) {
            param1 = 0;
        }
        moa.field_b = -1;
        tta.field_G = param1;
        wqa.field_G = param1;
    }

    final static void a(boolean param0) {
        uh.field_h.a(rra.field_e.field_G + -(!rca.field_p ? 0 : 40 + (2 + io.field_a + 2)), 18, -23776, 0, 0);
        vw.field_b.a(io.field_a + 42, 18, -23776, 0, -2 + (rra.field_e.field_G - (io.field_a - -40)));
        bsa.field_j.a(rra.field_e.field_G, 2, (byte) 127, 0, io.field_a, -20 + rra.field_e.field_t, 20);
        if (param0) {
            da.a(false);
        }
    }

    private final void a(String param0, int param1) {
        Exception var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0.startsWith("col=")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = (CharSequence) (Object) param0.substring(4);
                        v.field_k = -16777216 & v.field_k | 16777215 & eba.a(var5, -105, 16);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0.equals((Object) (Object) "/col")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        v.field_k = 16777215 & lra.field_g | v.field_k & -16777216;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0.startsWith("argb=")) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = (CharSequence) (Object) param0.substring(5);
                        v.field_k = eba.a(var6, -63, 16);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0.equals((Object) (Object) "/argb")) {
                            statePc = 32;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param0.startsWith("str=")) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = (CharSequence) (Object) param0.substring(4);
                        nt.field_b = v.field_k & -16777216 | eba.a(var7, -45, 16);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0.equals((Object) (Object) "str")) {
                            statePc = 31;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0.equals((Object) (Object) "/str")) {
                            statePc = 30;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0.startsWith("u=")) {
                            statePc = 29;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0.equals((Object) (Object) "u")) {
                            statePc = 28;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param0.equals((Object) (Object) "/u")) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        moa.field_b = -1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!param0.equalsIgnoreCase("shad=-1")) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        wqa.field_G = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param0.startsWith("shad=")) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0.equals((Object) (Object) "shad")) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!param0.equals((Object) (Object) "/shad")) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        wqa.field_G = tta.field_G;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0.equals((Object) (Object) "br")) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.a(lra.field_g, tta.field_G, 122);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        wqa.field_G = -16777216 & v.field_k;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = (CharSequence) (Object) param0.substring(5);
                        wqa.field_G = v.field_k & -16777216 | eba.a(var8, -52, 16);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        moa.field_b = -16777216 & v.field_k;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = (CharSequence) (Object) param0.substring(2);
                        moa.field_b = v.field_k & -16777216 | eba.a(var9, -65, 16);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        nt.field_b = -1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        nt.field_b = 8388608 | -16777216 & v.field_k;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        v.field_k = lra.field_g;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (param1 > 108) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((da) this).field_a = null;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int[] param0, int param1, String param2, int param3, int param4, aa param5, int param6, nh[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        Object var18_ref = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var18_ref = null;
        var23 = TombRacer.field_G ? 1 : 0;
        if (param2 != null) {
          L0: {
            this.a(param16, param15, 109);
            if (param13 == 0) {
              param13 = ((da) this).field_a.field_a;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              if (param9 >= param13 + ((da) this).field_a.field_h - -((da) this).field_a.field_g) {
                break L2;
              } else {
                if (param9 >= param13 + param13) {
                  break L2;
                } else {
                  var18_ref = null;
                  break L1;
                }
              }
            }
            var18 = new int[]{param11};
            break L1;
          }
          L3: {
            var19 = ((da) this).field_a.a(param2, -127, ska.field_q, param7, var18);
            if (0 != (param14 ^ -1)) {
              break L3;
            } else {
              param14 = param9 / param13;
              if (0 >= param14) {
                param14 = 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if ((param14 ^ -1) >= -1) {
              break L4;
            } else {
              if (var19 >= param14) {
                ska.field_q[-1 + param14] = ((da) this).field_a.a(false, param7, ska.field_q[-1 + param14], param11);
                var19 = param14;
                break L4;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (3 != param6) {
              break L5;
            } else {
              if (-2 == var19) {
                param6 = 1;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            var21 = 61 % ((-4 - param12) / 59);
            if (param6 == 0) {
              var20 = param10 - -((da) this).field_a.field_h;
              break L6;
            } else {
              if (-2 == param6) {
                var20 = ((da) this).field_a.field_h + (param10 + (-((var19 + -1) * param13) + -((da) this).field_a.field_g + (-((da) this).field_a.field_h + param9)) / 2);
                break L6;
              } else {
                if ((param6 ^ -1) == -3) {
                  var20 = -((-1 + var19) * param13) + (-((da) this).field_a.field_g + param10) - -param9;
                  break L6;
                } else {
                  L7: {
                    var22 = (-(param13 * (var19 + -1)) + (param9 + -((da) this).field_a.field_h) - ((da) this).field_a.field_g) / (var19 + 1);
                    if (-1 < (var22 ^ -1)) {
                      var22 = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var20 = var22 + (((da) this).field_a.field_h + param10);
                  param13 = param13 + var22;
                  break L6;
                }
              }
            }
          }
          var22 = 0;
          L8: while (true) {
            if (var22 >= var19) {
              return var19;
            } else {
              L9: {
                if (param4 == 0) {
                  this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                  break L9;
                } else {
                  if (param4 == -2) {
                    this.a(false, (param11 - ((da) this).field_a.a(ska.field_q[var22], (byte) -101)) / 2 + param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                    break L9;
                  } else {
                    if (-3 == param4) {
                      this.a(false, -((da) this).field_a.a(ska.field_q[var22], (byte) -116) + (param11 + param1), param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                      break L9;
                    } else {
                      if (var19 + -1 == var22) {
                        this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                        break L9;
                      } else {
                        this.a(true, param11, ska.field_q[var22]);
                        this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                        cka.field_ab = 0;
                        break L9;
                      }
                    }
                  }
                }
              }
              var20 = var20 + param13;
              var22++;
              continue L8;
            }
          }
        } else {
          return 0;
        }
    }

    private final void a(boolean param0, int param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (param2.length() <= var6) {
            L1: {
              if ((var4 ^ -1) < -1) {
                cka.field_ab = (param1 + -((da) this).field_a.a(param2, (byte) -121) << -2020511736) / var4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                ((da) this).field_a = null;
                break L2;
              }
            }
            return;
          } else {
            var7 = param2.charAt(var6);
            if (var7 != 60) {
              if (var7 != 62) {
                if (var5 == 0) {
                  if (32 == var7) {
                    var4++;
                    var6++;
                    continue L0;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var5 = 0;
                var6++;
                continue L0;
              }
            } else {
              var5 = 1;
              var6++;
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, int param1, aa param2, int[] param3, int param4, nh[] param5, String param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15_ref = null;
        int var15 = 0;
        Exception var16 = null;
        int var16_int = 0;
        nh var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        int stackIn_28_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = null;
                    var19 = TombRacer.field_G ? 1 : 0;
                    param8 = param8 - ((da) this).field_a.field_a;
                    var10 = -1;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var11 = -1;
                    var12 = param6.length();
                    var13 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var12 <= var13) {
                        statePc = 59;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var14 = (char)(io.a(-377, param6.charAt(var13)) & 255);
                    if ((var14 ^ -1) == -61) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var10 = var13;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 7: {
                    if (var14 != -63) {
                        statePc = 36;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (0 == var10) {
                        statePc = 36;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var15_ref = param6.substring(1 + var10, var13);
                    var10 = -1;
                    if (!var15_ref.equals((Object) (Object) "lt")) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var14 = 60;
                    statePc = 36;
                    continue stateLoop;
                }
                case 11: {
                    if (var15_ref.equals((Object) (Object) "gt")) {
                        statePc = 35;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (!var15_ref.equals((Object) (Object) "nbsp")) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var14 = 160;
                    statePc = 36;
                    continue stateLoop;
                }
                case 14: {
                    if (!var15_ref.equals((Object) (Object) "shy")) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var14 = 173;
                    statePc = 36;
                    continue stateLoop;
                }
                case 16: {
                    if (!var15_ref.equals((Object) (Object) "times")) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var14 = 215;
                    statePc = 36;
                    continue stateLoop;
                }
                case 18: {
                    if (var15_ref.equals((Object) (Object) "euro")) {
                        statePc = 34;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!var15_ref.equals((Object) (Object) "copy")) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var14 = 169;
                    statePc = 36;
                    continue stateLoop;
                }
                case 21: {
                    if (!var15_ref.equals((Object) (Object) "reg")) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var14 = 174;
                    statePc = 36;
                    continue stateLoop;
                }
                case 23: {
                    if (var15_ref.startsWith("img=")) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.a(var15_ref, 115);
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        var21 = (CharSequence) (Object) var15_ref.substring(4);
                        var16_int = jb.a(var21, (byte) 70);
                        var17 = param5[var16_int];
                        if (param3 == null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = param3[var16_int];
                        stackIn_28_0 = stackOut_26_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = var17.b();
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18 = stackIn_28_0;
                        if (16777215 != (-16777216 & v.field_k ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var17.a(param1, ((da) this).field_a.field_a + param8 - var18, 1, 0, 1);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var17.a(param1, param8 - -((da) this).field_a.field_a + -var18, 0, 16777215 | -16777216 & v.field_k, 1);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param1 = param1 + param5[var16_int].d();
                        var11 = -1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 33: {
                    var16 = (Exception) (Object) caughtException;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 34: {
                    var14 = 8364;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    var14 = 62;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (0 == (var10 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 38: {
                    if (-1 != var11) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    param1 = param1 + ((da) this).field_a.a(var11, -6773, (char) var14);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (32 == var14) {
                        statePc = 51;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (param2 == null) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-1 != (-16777216 & wqa.field_G ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((da) this).a((char) var14, param1 - -1, 1 + param8, wqa.field_G, true, param2, param7, param4);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    ((da) this).a((char) var14, param1, param8, v.field_k, false, param2, param7, param4);
                    statePc = 53;
                    continue stateLoop;
                }
                case 47: {
                    if ((wqa.field_G & -16777216) != 0) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ((da) this).fa((char) var14, param1 - -1, 1 + param8, wqa.field_G, true);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    ((da) this).fa((char) var14, param1, param8, v.field_k, false);
                    statePc = 53;
                    continue stateLoop;
                }
                case 51: {
                    if (cka.field_ab <= 0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    moa.field_a = moa.field_a + cka.field_ab;
                    param1 = param1 + (moa.field_a >> 1059501480);
                    moa.field_a = moa.field_a & 255;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var15 = ((da) this).field_a.a(255, var14);
                    if (0 != (nt.field_b ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((da) this).field_b.a(1, var15, (int)((double)((da) this).field_a.field_a * 0.7) + param8, param1, nt.field_b);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (0 == (moa.field_b ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ((da) this).field_b.a(1, var15, param8 + ((da) this).field_a.field_a + 1, param1, moa.field_b);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    param1 = param1 + var15;
                    var11 = var14;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(aa param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, String param9, byte param10, int param11, int param12, nh[] param13, int param14, int param15) {
        int var17 = -65 % ((24 - param10) / 47);
        return this.a(param6, param14, param9, param3, param7, param0, param15, param13, param12, param11, param4, param1, -71, param2, 0, param5, param8);
    }

    final void a(int param0, boolean param1, String param2, int param3, int param4, int param5) {
        if (!(param2 != null)) {
            return;
        }
        this.a(param4, param5, 125);
        this.a(param1, param3, (aa) null, (int[]) null, 0, (nh[]) null, param2, 0, param0);
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        if (!(param2 != null)) {
            return;
        }
        if (param0 != 12199) {
            ((da) this).field_a = null;
        }
        this.a(param4, param3, 118);
        this.a(false, -((da) this).field_a.a(param2, (byte) -102) + param5, (aa) null, (int[]) null, 0, (nh[]) null, param2, 0, param1);
    }

    da(ha param0, qla param1) {
        ((da) this).field_a = param1;
        ((da) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
    }
}
