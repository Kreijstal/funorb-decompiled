/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private ta field_b;
    private ha field_a;

    final void a(int param0, int param1, int param2, String param3, byte param4, int param5) {
        if (param4 > -7) {
            return;
        }
        if (!(param3 != null)) {
            return;
        }
        this.a(param2, param5, 60);
        this.a(-274, param0, (hr[]) null, param1, 0, 0, param3, (int[]) null, (aa) null);
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int[] param5, hr[] param6, int param7, int param8, int param9, int param10, int param11, String param12, aa param13, int param14, int param15) {
        if (param11 != -8787) {
            ((da) this).field_a = null;
        }
        return this.a(param13, param6, param2, param5, param12, param0, param1, param10, 0, param8, param4, param3, param14, param9, 92, param15, param7);
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        if (param2 == null) {
            return;
        }
        if (param5 < 40) {
            ((da) this).field_a = null;
        }
        this.a(param4, param0, 60);
        this.a(-274, param3, (hr[]) null, -((da) this).field_b.a(param2, 0) + param1, 0, 0, param2, (int[]) null, (aa) null);
    }

    private final void a(String param0, int param1) {
        int var3 = 0;
        Exception var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Sumoblitz.field_L ? 1 : 0;
                    var3 = -2 / ((param1 - 31) / 40);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.startsWith("col=")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!param0.equals((Object) (Object) "/col")) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mn.field_i = 16777215 & fs.field_l | -16777216 & mn.field_i;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = (CharSequence) (Object) param0.substring(4);
                        mn.field_i = mn.field_i & -16777216 | 16777215 & ea.a((byte) -73, var6, 16);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param0.startsWith("argb=")) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = (CharSequence) (Object) param0.substring(5);
                        mn.field_i = ea.a((byte) -73, var7, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!param0.equals((Object) (Object) "/argb")) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        mn.field_i = fs.field_l;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
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
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = (CharSequence) (Object) param0.substring(4);
                        vo.field_I = -16777216 & mn.field_i | ea.a((byte) -73, var8, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!param0.equals((Object) (Object) "str")) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        vo.field_I = 8388608 | -16777216 & mn.field_i;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!param0.equals((Object) (Object) "/str")) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        vo.field_I = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param0.startsWith("u=")) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = (CharSequence) (Object) param0.substring(2);
                        fl.field_p = -16777216 & mn.field_i | ea.a((byte) -73, var9, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!param0.equals((Object) (Object) "u")) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        fl.field_p = -16777216 & mn.field_i;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param0.equals((Object) (Object) "/u")) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        fl.field_p = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param0.equalsIgnoreCase("shad=-1")) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param0.startsWith("shad=")) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!param0.equals((Object) (Object) "shad")) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        jj.field_b = mn.field_i & -16777216;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!param0.equals((Object) (Object) "/shad")) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        jj.field_b = jv.field_b;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!param0.equals((Object) (Object) "br")) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.a(fs.field_l, jv.field_b, 60);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = (CharSequence) (Object) param0.substring(5);
                        jj.field_b = mn.field_i & -16777216 | ea.a((byte) -73, var10, 16);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        jj.field_b = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var4 = (Exception) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(aa param0, hr[] param1, int param2, int[] param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        if (param4 == null) {
          return 0;
        } else {
          L0: {
            this.a(param6, param9, 60);
            if (param7 == 0) {
              param7 = ((da) this).field_b.field_d;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              if (param7 + ((da) this).field_b.field_c + ((da) this).field_b.field_i <= param5) {
                break L2;
              } else {
                if (param5 < param7 - -param7) {
                  var18 = null;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var18 = new int[]{param11};
            break L1;
          }
          L3: {
            if (0 != (param8 ^ -1)) {
              break L3;
            } else {
              param8 = param5 / param7;
              if (param8 >= -1) {
                param8 = 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            var19 = ((da) this).field_b.a(param4, false, hu.field_a, var18, param1);
            if (-1 >= param8) {
              break L4;
            } else {
              if (var19 < param8) {
                break L4;
              } else {
                var19 = param8;
                hu.field_a[-1 + param8] = ((da) this).field_b.a(param11, hu.field_a[param8 - 1], param1, -63);
                break L4;
              }
            }
          }
          L5: {
            if (param15 != 3) {
              break L5;
            } else {
              if ((var19 ^ -1) != -2) {
                break L5;
              } else {
                param15 = 1;
                break L5;
              }
            }
          }
          L6: {
            if (param14 >= 38) {
              break L6;
            } else {
              var23 = null;
              this.a(98, 62, (hr[]) null, 36, 116, -67, (String) null, (int[]) null, (aa) null);
              break L6;
            }
          }
          L7: {
            if (0 == param15) {
              var20 = param16 + ((da) this).field_b.field_i;
              break L7;
            } else {
              if (1 == param15) {
                var20 = ((da) this).field_b.field_i + (param16 + (-((var19 - 1) * param7) + -((da) this).field_b.field_c + param5 + -((da) this).field_b.field_i) / 2);
                break L7;
              } else {
                if (-3 != (param15 ^ -1)) {
                  L8: {
                    var21 = (-((da) this).field_b.field_c + (param5 - (((da) this).field_b.field_i - -(param7 * (-1 + var19))))) / (1 + var19);
                    if (-1 >= (var21 ^ -1)) {
                      break L8;
                    } else {
                      var21 = 0;
                      break L8;
                    }
                  }
                  param7 = param7 + var21;
                  var20 = param16 + (((da) this).field_b.field_i + var21);
                  break L7;
                } else {
                  var20 = -((var19 + -1) * param7) + -((da) this).field_b.field_c + param5 + param16;
                  break L7;
                }
              }
            }
          }
          var21 = 0;
          L9: while (true) {
            if (var21 >= var19) {
              return var19;
            } else {
              L10: {
                if (-1 != (param12 ^ -1)) {
                  if (param12 == 1) {
                    this.a(-274, var20, param1, param10 - -((-((da) this).field_b.a(hu.field_a[var21], 0) + param11) / 2), param2, param13, hu.field_a[var21], param3, param0);
                    break L10;
                  } else {
                    if ((param12 ^ -1) != -3) {
                      if (var19 + -1 == var21) {
                        this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                        break L10;
                      } else {
                        this.a(hu.field_a[var21], param11, (byte) 5);
                        this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                        lb.field_b = 0;
                        break L10;
                      }
                    } else {
                      this.a(-274, var20, param1, param11 + (param10 - ((da) this).field_b.a(hu.field_a[var21], 0)), param2, param13, hu.field_a[var21], param3, param0);
                      break L10;
                    }
                  }
                } else {
                  this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                  break L10;
                }
              }
              var20 = var20 + param7;
              var21++;
              continue L9;
            }
          }
        }
    }

    private final void a(int param0, int param1, hr[] param2, int param3, int param4, int param5, String param6, int[] param7, aa param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15_ref = null;
        int var15 = 0;
        Exception var16 = null;
        int var16_int = 0;
        hr var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        int stackIn_24_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = null;
                    var19 = Sumoblitz.field_L ? 1 : 0;
                    param1 = param1 - ((da) this).field_b.field_d;
                    var10 = -1;
                    var11 = -1;
                    var12 = param6.length();
                    if (param0 == -274) {
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
                    var13 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var13 >= var12) {
                        statePc = 57;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var14 = (char)(255 & uo.a(true, param6.charAt(var13)));
                    if (60 != var14) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var10 = var13;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    if (62 != var14) {
                        statePc = 36;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((var10 ^ -1) == 0) {
                        statePc = 36;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var15_ref = param6.substring(var10 + 1, var13);
                    var10 = -1;
                    if (var15_ref.equals((Object) (Object) "lt")) {
                        statePc = 35;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var15_ref.equals((Object) (Object) "gt")) {
                        statePc = 34;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!var15_ref.equals((Object) (Object) "nbsp")) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var14 = 160;
                    statePc = 36;
                    continue stateLoop;
                }
                case 12: {
                    if (var15_ref.equals((Object) (Object) "shy")) {
                        statePc = 33;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!var15_ref.equals((Object) (Object) "times")) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var14 = 215;
                    statePc = 36;
                    continue stateLoop;
                }
                case 15: {
                    if (var15_ref.equals((Object) (Object) "euro")) {
                        statePc = 32;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var15_ref.equals((Object) (Object) "copy")) {
                        statePc = 31;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (!var15_ref.equals((Object) (Object) "reg")) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var14 = 174;
                    statePc = 36;
                    continue stateLoop;
                }
                case 19: {
                    if (!var15_ref.startsWith("img=")) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var21 = (CharSequence) (Object) var15_ref.substring(4);
                        var16_int = no.a((byte) -127, var21);
                        var17 = param2[var16_int];
                        if (param7 != null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var17.d();
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = param7[var16_int];
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var18 = stackIn_24_0;
                        if (16777215 != (-16777216 & mn.field_i ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var17.a(param3, -var18 + (param1 + ((da) this).field_b.field_d), 1, 0, 1);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var17.a(param3, -var18 + ((da) this).field_b.field_d + param1, 0, mn.field_i & -16777216 | 16777215, 1);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11 = -1;
                        param3 = param3 + param2[var16_int].b();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 29: {
                    var16 = (Exception) (Object) caughtException;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 30: {
                    this.a(var15_ref, 120);
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 31: {
                    var14 = 169;
                    statePc = 36;
                    continue stateLoop;
                }
                case 32: {
                    var14 = 8364;
                    statePc = 36;
                    continue stateLoop;
                }
                case 33: {
                    var14 = 173;
                    statePc = 36;
                    continue stateLoop;
                }
                case 34: {
                    var14 = 62;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    var14 = 60;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var10 == -1) {
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
                    if ((var11 ^ -1) == 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    param3 = param3 + ((da) this).field_b.a(-63, (char) var14, var11);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var14 != 32) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((lb.field_b ^ -1) >= -1) {
                        statePc = 50;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    sb.field_a = sb.field_a + lb.field_b;
                    param3 = param3 + (sb.field_a >> 1186509064);
                    sb.field_a = sb.field_a & 255;
                    statePc = 50;
                    continue stateLoop;
                }
                case 43: {
                    if (param8 == null) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((-16777216 & jj.field_b) == 0) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((da) this).a((char) var14, param3 + 1, param1 - -1, jj.field_b, true, param8, param4, param5);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    ((da) this).a((char) var14, param3, param1, mn.field_i, false, param8, param4, param5);
                    statePc = 50;
                    continue stateLoop;
                }
                case 47: {
                    if ((-16777216 & jj.field_b) == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ((da) this).fa((char) var14, param3 + 1, param1 + 1, jj.field_b, true);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    ((da) this).fa((char) var14, param3, param1, mn.field_i, false);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var15 = ((da) this).field_b.a(var14, (byte) -53);
                    if (-1 != vo.field_I) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ((da) this).field_a.a(vo.field_I, 103, param1 - -(int)(0.7 * (double)((da) this).field_b.field_d), var15, param3);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if ((fl.field_p ^ -1) != 0) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ((da) this).field_a.a(fl.field_p, 122, ((da) this).field_b.field_d + param1 - -1, var15, param3);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var11 = var14;
                    param3 = param3 + var15;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ki param0, ki param1, int param2, ki param3) {
        int var8 = 0;
        int var9 = 0;
        ne[] var14 = null;
        int var11_int = 0;
        int var13 = Sumoblitz.field_L ? 1 : 0;
        li.field_v = kb.a("frame_top", param0, true, "commonui");
        hd.field_O = kb.a("frame_bottom", param0, true, "commonui");
        ar.field_E = jb.a("commonui", "jagex_logo_grey", -104, param0);
        jp.field_j = kb.a("button", param0, true, "commonui");
        fw.field_m = ub.a(param0, "commonui", (byte) -56, "validation");
        jm.field_a = (vn) (Object) vf.a(param1, true, "commonui", "arezzo12", param0);
        kw.field_b = (vn) (Object) vf.a(param1, true, "commonui", "arezzo14", param0);
        tq.field_a = (vn) (Object) vf.a(param1, true, "commonui", "arezzo14bold", param0);
        wb var17 = new wb(param3.a("", "button.gif", -1), (java.awt.Component) (Object) qn.field_f);
        ne discarded$0 = mc.a((byte) 83, param0, "dropdown", "commonui");
        ne[] var5 = rq.a("screen_options", param0, 73, "commonui");
        sb.field_d = new ne[4];
        sm.field_c = new ne[4];
        kn.field_f = new ne[4];
        ne[][] var6 = new ne[][]{sb.field_d, kn.field_f, sm.field_c};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_i;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_h[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            ne[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = jk.a(var21[var11_int], var5[var9], -105);
            }
        }
        var9 = var17.field_u;
        if (param2 != 17474) {
            return;
        }
        kc.j(70);
        var17.d();
        lk.g(0, 0, lk.field_b, lk.field_c);
        wb var15 = new wb(var9, var9);
        wb var18 = var15;
        var18.d();
        var17.c(0, 0);
        wb var11 = new wb(var9, var9);
        var11.d();
        var17.c(var9 + -var17.field_x, 0);
        wb var12 = new wb(-(2 * var9) + var17.field_x, var9);
        var12.d();
        var17.c(-var9, 0);
        su.a((byte) -73);
        jp.field_j = new wb[]{var15, var12, var11};
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param1, param2, 60);
        this.a(-274, param3, (hr[]) null, -(((da) this).field_b.a(param0, param5) / 2) + param4, 0, 0, param0, (int[]) null, (aa) null);
    }

    private final void a(int param0, int param1, int param2) {
        lb.field_b = 0;
        fs.field_l = param0;
        mn.field_i = param0;
        if ((param1 ^ -1) == 0) {
            param1 = 0;
        }
        vo.field_I = -1;
        sb.field_a = 0;
        if (param2 != 60) {
            ((da) this).field_b = null;
        }
        fl.field_p = -1;
        jv.field_b = param1;
        jj.field_b = param1;
    }

    da(ha param0, ta param1) {
        ((da) this).field_b = param1;
        ((da) this).field_a = param0;
    }

    final static boolean a(cd param0, int param1, cd param2) {
        if (!(param0.field_a <= param2.field_a)) {
            return true;
        }
        if (param1 > -11) {
            Object var4 = null;
            da.a((ki) null, (ki) null, 47, (ki) null);
        }
        if (param0.field_a == param2.field_a) {
            if (param2.field_g >= param0.field_g) {
                return false;
            }
            return true;
        }
        return false;
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    private final void a(String param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (param0.length() <= var6) {
            L1: {
              if (-1 <= (var4 ^ -1)) {
                break L1;
              } else {
                lb.field_b = (param1 - ((da) this).field_b.a(param0, 0) << 194521768) / var4;
                break L1;
              }
            }
            L2: {
              if (param2 == 5) {
                break L2;
              } else {
                var9 = null;
                ((da) this).a(-80, -66, 46, (String) null, (byte) 127, -75);
                break L2;
              }
            }
            return;
          } else {
            var7 = param0.charAt(var6);
            if (60 == var7) {
              var5 = 1;
              var6++;
              continue L0;
            } else {
              if (62 == var7) {
                var5 = 0;
                var6++;
                continue L0;
              } else {
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
              }
            }
          }
        }
    }

    static {
    }
}
