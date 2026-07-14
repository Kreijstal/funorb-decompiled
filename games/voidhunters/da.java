/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private sw field_b;
    private ha field_a;

    private final void a(int param0, int param1, int param2) {
        vq.field_v = -1;
        if (!(param0 != -1)) {
            param0 = 0;
        }
        nn.field_b = param2;
        gqb.field_a = param2;
        drb.field_j = param1;
        oib.field_c = 0;
        wob.field_p = -1;
        qlb.field_a = param0;
        gba.field_q = param0;
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    final int a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9, String param10, int param11, int param12, aja[] param13, int param14, aa param15) {
        if (param7) {
            Object var18 = null;
            this.a(-23, -25, 54, (aja[]) null, (String) null, 8, -16, (aa) null, (int[]) null);
        }
        return this.a(param12, param3, param8, param10, param6, param13, param11, param0, 516, param4, param9, param1, param15, param2, 0, param5, param14);
    }

    private final void a(int param0, int param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var5 = 114 / ((-63 - param0) / 42);
        var4 = 0;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param2.length()) {
            L1: {
              if (0 < var4) {
                drb.field_j = (-((da) this).field_b.a(param2, 1) + param1 << 92119816) / var4;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            var8 = param2.charAt(var7);
            if (60 == var8) {
              var6 = 1;
              var7++;
              continue L0;
            } else {
              if (62 != var8) {
                if (var6 == 0) {
                  if (var8 == 32) {
                    var4++;
                    var7++;
                    continue L0;
                  } else {
                    var7++;
                    continue L0;
                  }
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var7++;
                continue L0;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, String param3, int[] param4, aja[] param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12, int param13, int param14, int param15, int param16) {
        Object var18_ref = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var18_ref = null;
        var22 = VoidHunters.field_G;
        if (param3 != null) {
          L0: {
            this.a(param0, 0, param16);
            if (0 != param11) {
              break L0;
            } else {
              param11 = ((da) this).field_b.field_a;
              break L0;
            }
          }
          L1: {
            L2: {
              if (param7 >= ((da) this).field_b.field_c + ((da) this).field_b.field_e - -param11) {
                break L2;
              } else {
                if (param7 >= param11 + param11) {
                  break L2;
                } else {
                  var18_ref = null;
                  break L1;
                }
              }
            }
            var18 = new int[]{param10};
            break L1;
          }
          L3: {
            if (0 != (param14 ^ -1)) {
              break L3;
            } else {
              param14 = param7 / param11;
              if (param14 > 0) {
                break L3;
              } else {
                param14 = 1;
                break L3;
              }
            }
          }
          L4: {
            var19 = ((da) this).field_b.a(param3, param5, var18, vha.field_o, 4);
            if (param14 <= 0) {
              break L4;
            } else {
              if (var19 >= param14) {
                var19 = param14;
                vha.field_o[param14 - 1] = ((da) this).field_b.a(vha.field_o[param14 + -1], param10, -62, param5);
                break L4;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (-4 != (param13 ^ -1)) {
              break L5;
            } else {
              if ((var19 ^ -1) != -2) {
                break L5;
              } else {
                param13 = 1;
                break L5;
              }
            }
          }
          if (param8 == 516) {
            L6: {
              if (param13 != 0) {
                if (param13 != 1) {
                  if (param13 != 2) {
                    L7: {
                      var21 = (-((-1 + var19) * param11) + (-((da) this).field_b.field_e + -((da) this).field_b.field_c + param7)) / (var19 + 1);
                      if (var21 < 0) {
                        var21 = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var20 = var21 + param9 - -((da) this).field_b.field_c;
                    param11 = param11 + var21;
                    break L6;
                  } else {
                    var20 = -((var19 + -1) * param11) + (param7 + (param9 - ((da) this).field_b.field_e));
                    break L6;
                  }
                } else {
                  var20 = ((da) this).field_b.field_c + (param9 + (param7 - (((da) this).field_b.field_c + ((da) this).field_b.field_e - -(param11 * (-1 + var19)))) / 2);
                  break L6;
                }
              } else {
                var20 = param9 + ((da) this).field_b.field_c;
                break L6;
              }
            }
            var21 = 0;
            L8: while (true) {
              if (var19 <= var21) {
                return var19;
              } else {
                L9: {
                  if (-1 != (param6 ^ -1)) {
                    if (1 == param6) {
                      this.a(var20, 27, param1, param5, vha.field_o[var21], param15 + (param10 + -((da) this).field_b.a(vha.field_o[var21], 1)) / 2, param2, param12, param4);
                      break L9;
                    } else {
                      if ((param6 ^ -1) == -3) {
                        this.a(var20, param8 + -460, param1, param5, vha.field_o[var21], -((da) this).field_b.a(vha.field_o[var21], 1) + param15 - -param10, param2, param12, param4);
                        break L9;
                      } else {
                        if (var21 != -1 + var19) {
                          this.a(-116, param10, vha.field_o[var21]);
                          this.a(var20, param8 + -432, param1, param5, vha.field_o[var21], param15, param2, param12, param4);
                          drb.field_j = 0;
                          break L9;
                        } else {
                          this.a(var20, param8 + -613, param1, param5, vha.field_o[var21], param15, param2, param12, param4);
                          break L9;
                        }
                      }
                    }
                  } else {
                    this.a(var20, 97, param1, param5, vha.field_o[var21], param15, param2, param12, param4);
                    break L9;
                  }
                }
                var20 = var20 + param11;
                var21++;
                continue L8;
              }
            }
          } else {
            return 10;
          }
        } else {
          return 0;
        }
    }

    private final void a(int param0, int param1, int param2, aja[] param3, String param4, int param5, int param6, aa param7, int[] param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16_ref = null;
        int var16 = 0;
        Exception var17 = null;
        int var17_int = 0;
        aja var18 = null;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        CharSequence var22 = null;
        int stackIn_25_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = null;
                    var20 = VoidHunters.field_G;
                    var10 = -5 % ((param1 - -34) / 35);
                    param0 = param0 - ((da) this).field_b.field_a;
                    var11 = -1;
                    var12 = -1;
                    var13 = param4.length();
                    var14 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var14 >= var13) {
                        statePc = 57;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var15 = (char)(255 & aea.a(-123, param4.charAt(var14)));
                    if (var15 != 60) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var11 = var14;
                    var14++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 4: {
                    if (var15 != 62) {
                        statePc = 35;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 != (var11 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var16_ref = param4.substring(1 + var11, var14);
                    var11 = -1;
                    if (var16_ref.equals((Object) (Object) "lt")) {
                        statePc = 34;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!var16_ref.equals((Object) (Object) "gt")) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var15 = 62;
                    statePc = 35;
                    continue stateLoop;
                }
                case 10: {
                    if (!var16_ref.equals((Object) (Object) "nbsp")) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var15 = 160;
                    statePc = 35;
                    continue stateLoop;
                }
                case 12: {
                    if (!var16_ref.equals((Object) (Object) "shy")) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var15 = 173;
                    statePc = 35;
                    continue stateLoop;
                }
                case 14: {
                    if (!var16_ref.equals((Object) (Object) "times")) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var15 = 215;
                    statePc = 35;
                    continue stateLoop;
                }
                case 16: {
                    if (!var16_ref.equals((Object) (Object) "euro")) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var15 = 8364;
                    statePc = 35;
                    continue stateLoop;
                }
                case 18: {
                    if (var16_ref.equals((Object) (Object) "copy")) {
                        statePc = 33;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var16_ref.equals((Object) (Object) "reg")) {
                        statePc = 32;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!var16_ref.startsWith("img=")) {
                        statePc = 31;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var22 = (CharSequence) (Object) var16_ref.substring(4);
                        var17_int = lob.a(-118, var22);
                        var18 = param3[var17_int];
                        if (param8 == null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = param8[var17_int];
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var18.b();
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var19 = stackIn_25_0;
                        if ((gqb.field_a & -16777216 ^ -1) == 16777215) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var18.a(param5, ((da) this).field_b.field_a + param0 + -var19, 0, -16777216 & gqb.field_a | 16777215, 1);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var18.a(param5, -var19 + (((da) this).field_b.field_a + param0), 1, 0, 1);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        param5 = param5 + param3[var17_int].c();
                        var12 = -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var14++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 30: {
                    var17 = (Exception) (Object) caughtException;
                    var14++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 31: {
                    this.a(97, var16_ref);
                    var14++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 32: {
                    var15 = 174;
                    statePc = 35;
                    continue stateLoop;
                }
                case 33: {
                    var15 = 169;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    var15 = 60;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var11 == -1) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 37: {
                    if (-1 != var12) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    param5 = param5 + ((da) this).field_b.a(var12, (char) var15, -101);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((var15 ^ -1) == -33) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (param7 == null) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (0 == (gba.field_q & -16777216)) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((da) this).a((char) var15, 1 + param5, param0 + 1, gba.field_q, true, param7, param6, param2);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    ((da) this).a((char) var15, param5, param0, gqb.field_a, false, param7, param6, param2);
                    statePc = 51;
                    continue stateLoop;
                }
                case 45: {
                    if ((-16777216 & gba.field_q) == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((da) this).fa((char) var15, param5 + 1, param0 + 1, gba.field_q, true);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    ((da) this).fa((char) var15, param5, param0, gqb.field_a, false);
                    statePc = 51;
                    continue stateLoop;
                }
                case 48: {
                    if (drb.field_j > 0) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    oib.field_c = oib.field_c + drb.field_j;
                    param5 = param5 + (oib.field_c >> -756032728);
                    oib.field_c = oib.field_c & 255;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var16 = ((da) this).field_b.a(var15, (byte) 46);
                    if ((wob.field_p ^ -1) != 0) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    ((da) this).field_a.a(param5, -25559, wob.field_p, param0 + (int)(0.7 * (double)((da) this).field_b.field_a), var16);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (0 == (vq.field_v ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((da) this).field_a.a(param5, -25559, vq.field_v, 1 + ((da) this).field_b.field_a + param0, var16);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    param5 = param5 + var16;
                    var12 = var15;
                    var14++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, String param3, int param4, int param5) {
        if (param3 == null) {
            return;
        }
        this.a(param2, 0, param1);
        this.a(param4, 65, 0, (aja[]) null, param3, param5, 0, (aa) null, (int[]) null);
        if (!param0) {
            Object var8 = null;
            this.a(81, (String) null);
        }
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    private final void a(int param0, String param1) {
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
                    var4 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.startsWith("col=")) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1.equals((Object) (Object) "/col")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        gqb.field_a = 16777215 & nn.field_b | gqb.field_a & -16777216;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = (CharSequence) (Object) param1.substring(4);
                        gqb.field_a = -16777216 & gqb.field_a | tib.a(-596, var5, 16) & 16777215;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1.startsWith("argb=")) {
                            statePc = 32;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!param1.equals((Object) (Object) "/argb")) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        gqb.field_a = nn.field_b;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param1.startsWith("str=")) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = (CharSequence) (Object) param1.substring(4);
                        wob.field_p = gqb.field_a & -16777216 | tib.a(-596, var6, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!param1.equals((Object) (Object) "str")) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        wob.field_p = gqb.field_a & -16777216 | 8388608;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param1.equals((Object) (Object) "/str")) {
                            statePc = 31;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!param1.startsWith("u=")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = (CharSequence) (Object) param1.substring(2);
                        vq.field_v = -16777216 & gqb.field_a | tib.a(-596, var7, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!param1.equals((Object) (Object) "u")) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        vq.field_v = gqb.field_a & -16777216;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param1.equals((Object) (Object) "/u")) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param1.equalsIgnoreCase("shad=-1")) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        gba.field_q = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param1.startsWith("shad=")) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!param1.equals((Object) (Object) "shad")) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        gba.field_q = gqb.field_a & -16777216;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!param1.equals((Object) (Object) "/shad")) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        gba.field_q = qlb.field_a;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1.equals((Object) (Object) "br")) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.a(qlb.field_a, 0, nn.field_b);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = (CharSequence) (Object) param1.substring(5);
                        gba.field_q = -16777216 & gqb.field_a | tib.a(-596, var8, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        vq.field_v = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        wob.field_p = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = (CharSequence) (Object) param1.substring(5);
                        gqb.field_a = tib.a(-596, var9, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param0 >= 65) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((da) this).field_b = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var3 = (Exception) (Object) caughtException;
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

    final void a(int param0, int param1, int param2, boolean param3, int param4, String param5) {
        if (!param3) {
            return;
        }
        if (param5 == null) {
            return;
        }
        this.a(param0, 0, param2);
        this.a(param1, 87, 0, (aja[]) null, param5, param4 + -((da) this).field_b.a(param5, 1), 0, (aa) null, (int[]) null);
    }

    da(ha param0, sw param1) {
        ((da) this).field_b = param1;
        ((da) this).field_a = param0;
    }

    static {
    }
}
