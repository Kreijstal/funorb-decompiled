/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private ha field_d;
    static int[] field_b;
    private vs field_c;
    static tk field_a;

    final int a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, pa[] param9, aa param10, int param11, int[] param12, int param13, int param14, String param15) {
        if (!param3) {
            ((da) this).field_d = (ha) null;
        }
        return this.a(param14, param4, 0, param10, param11, param2, param15, param13, param5, param6, param0, param7, param9, -2, param12, param1, param8);
    }

    final static gk a(int param0, int param1) {
        gk stackIn_6_0 = null;
        gk stackOut_4_0 = null;
        gk stackOut_5_0 = null;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            field_b = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != oi.field_d) {
              break L2;
            } else {
              if (0 == (param0 ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = lc.a(true, false, true, (byte) -65, 1, param0);
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = oi.field_d;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return (gk) (Object) stackIn_6_0;
    }

    private final void a(String param0, int param1) {
        Exception var3 = null;
        int var4 = 0;
        int[] var5 = null;
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
                    var4 = AceOfSkies.field_G ? 1 : 0;
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
                        var6 = (CharSequence) param0.substring(4);
                        qg.field_c = -16777216 & qg.field_c | 16777215 & np.a(var6, 4, 16);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param0.equals((Object) (Object) "/col")) {
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
                        qg.field_c = tf.field_a & 16777215 | qg.field_c & -16777216;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == -16777216) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = (int[]) null;
                        ((da) this).a(119, 96, (pa[]) null, 57, -108, (String) null, -122, (int[]) null);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0.startsWith("argb=")) {
                            statePc = 32;
                        } else {
                            statePc = 8;
                        }
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
                            statePc = 31;
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
                        if (param0.startsWith("str=")) {
                            statePc = 30;
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
                        if (param0.equals((Object) (Object) "str")) {
                            statePc = 29;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0.equals((Object) (Object) "/str")) {
                            statePc = 28;
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
                        if (param0.startsWith("u=")) {
                            statePc = 27;
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
                        if (param0.equals((Object) (Object) "u")) {
                            statePc = 26;
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
                        if (param0.equals((Object) (Object) "/u")) {
                            statePc = 25;
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
                        if (!param0.equalsIgnoreCase("shad=-1")) {
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
                        es.field_c = 0;
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
                        if (param0.startsWith("shad=")) {
                            statePc = 24;
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
                        if (!param0.equals((Object) (Object) "shad")) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        es.field_c = qg.field_c & -16777216;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0.equals((Object) (Object) "/shad")) {
                            statePc = 23;
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
                        if (!param0.equals((Object) (Object) "br")) {
                            statePc = 35;
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
                        this.a(em.field_d, -1, tf.field_a);
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
                        es.field_c = em.field_d;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = (CharSequence) param0.substring(5);
                        es.field_c = qg.field_c & -16777216 | np.a(var7, 4, 16);
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
                        rb.field_h = -1;
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
                        rb.field_h = -16777216 & qg.field_c;
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
                        var8 = (CharSequence) param0.substring(2);
                        rb.field_h = qg.field_c & -16777216 | np.a(var8, param1 ^ -16777212, 16);
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
                        rs.field_t = -1;
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
                        rs.field_t = -16777216 & qg.field_c | 8388608;
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
                        var9 = (CharSequence) param0.substring(4);
                        rs.field_t = qg.field_c & -16777216 | np.a(var9, 4, 16);
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
                        qg.field_c = tf.field_a;
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
                        var10 = (CharSequence) param0.substring(5);
                        qg.field_c = np.a(var10, 4, 16);
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
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 < 8) {
            field_b = (int[]) null;
        }
        if (!(!param1)) {
            ef.field_m = ef.field_m - 1;
            if (!(-1 != ef.field_m)) {
                vc.field_f = null;
            }
        }
        if (param2) {
            gq.field_e = gq.field_e - 1;
            if (-1 == gq.field_e) {
                sa.field_h = null;
            }
        }
    }

    final void a(int param0, int param1, pa[] param2, int param3, int param4, String param5, int param6, int[] param7) {
        if (param5 == null) {
            return;
        }
        this.a(param1, -1, param0);
        this.a(0, param2, param3, param5, (byte) 5, param7, param6, (aa) null, param4);
    }

    private final int a(int param0, int param1, int param2, aa param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, int param11, pa[] param12, int param13, int[] param14, int param15, int param16) {
        Object var18_ref = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var18_ref = null;
        var23 = AceOfSkies.field_G ? 1 : 0;
        if (param6 == null) {
          return 0;
        } else {
          L0: {
            this.a(param1, -1, param5);
            if (-1 == (param11 ^ -1)) {
              param11 = ((da) this).field_c.field_e;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              if (param11 + ((da) this).field_c.field_i + ((da) this).field_c.field_j <= param0) {
                break L2;
              } else {
                if (param0 >= param11 + param11) {
                  break L2;
                } else {
                  var18_ref = null;
                  break L1;
                }
              }
            }
            var18 = new int[]{param7};
            break L1;
          }
          L3: {
            var20 = 109 / ((param13 - 48) / 39);
            if (-1 != param2) {
              break L3;
            } else {
              param2 = param0 / param11;
              if (0 >= param2) {
                param2 = 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            var19 = ((da) this).field_c.a(-121, param12, var18, vi.field_p, param6);
            if (0 >= param2) {
              break L4;
            } else {
              if (var19 < param2) {
                break L4;
              } else {
                var19 = param2;
                vi.field_p[param2 - 1] = ((da) this).field_c.a(param12, 0, param7, vi.field_p[-1 + param2]);
                break L4;
              }
            }
          }
          L5: {
            if (3 != param4) {
              break L5;
            } else {
              if ((var19 ^ -1) == -2) {
                param4 = 1;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (param4 == 0) {
              var21 = ((da) this).field_c.field_j + param9;
              break L6;
            } else {
              if ((param4 ^ -1) == -2) {
                var21 = (-((da) this).field_c.field_i + (-((da) this).field_c.field_j + (param0 + -((-1 + var19) * param11)))) / 2 + ((da) this).field_c.field_j + param9;
                break L6;
              } else {
                if (param4 == 2) {
                  var21 = -((-1 + var19) * param11) + -((da) this).field_c.field_i + (param0 + param9);
                  break L6;
                } else {
                  L7: {
                    var22 = (-((da) this).field_c.field_i + -((da) this).field_c.field_j + param0 - (var19 + -1) * param11) / (var19 - -1);
                    if (0 > var22) {
                      var22 = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var21 = ((da) this).field_c.field_j + (param9 + var22);
                  param11 = param11 + var22;
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
                if (param8 == 0) {
                  this.a(param16, param12, param15, vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                  break L9;
                } else {
                  if ((param8 ^ -1) == -2) {
                    this.a(param16, param12, param15 - -((-((da) this).field_c.a((byte) 94, vi.field_p[var22]) + param7) / 2), vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                    break L9;
                  } else {
                    if (param8 != 2) {
                      if (var22 != var19 + -1) {
                        this.a(param7, (byte) 104, vi.field_p[var22]);
                        this.a(param16, param12, param15, vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                        tm.field_i = 0;
                        break L9;
                      } else {
                        this.a(param16, param12, param15, vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                        break L9;
                      }
                    } else {
                      this.a(param16, param12, -((da) this).field_c.a((byte) 94, vi.field_p[var22]) + (param15 + param7), vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                      break L9;
                    }
                  }
                }
              }
              var21 = var21 + param11;
              var22++;
              continue L8;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    da(ha param0, vs param1) {
        ((da) this).field_c = param1;
        ((da) this).field_d = param0;
    }

    final void a(int param0, int param1, int param2, String param3, int param4, int param5) {
        if (param3 == null) {
            return;
        }
        if (param4 != 18731) {
            String var8 = (String) null;
            ((da) this).a((String) null, -14, 82, 83, -17, (byte) 19);
        }
        this.a(param1, param4 + -18732, param0);
        this.a(0, (pa[]) null, param2, param3, (byte) 5, (int[]) null, param5, (aa) null, 0);
    }

    private final void a(int param0, pa[] param1, int param2, String param3, byte param4, int[] param5, int param6, aa param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15_ref = null;
        int var15 = 0;
        Exception var16 = null;
        int var16_int = 0;
        pa var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        int stackIn_25_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = null;
                    var19 = AceOfSkies.field_G ? 1 : 0;
                    param6 = param6 - ((da) this).field_c.field_e;
                    if (param4 == 5) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((da) this).field_d = (ha) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var10 = -1;
                    var11 = -1;
                    var12 = param3.length();
                    var13 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var13 >= var12) {
                        statePc = 58;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var14 = (char)(255 & ae.a(param3.charAt(var13), 56));
                    if ((var14 ^ -1) != -61) {
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
                    if (var14 != 62) {
                        statePc = 35;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-1 == var10) {
                        statePc = 35;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var15_ref = param3.substring(var10 - -1, var13);
                    var10 = -1;
                    if (var15_ref.equals((Object) (Object) "lt")) {
                        statePc = 34;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!var15_ref.equals((Object) (Object) "gt")) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var14 = 62;
                    statePc = 35;
                    continue stateLoop;
                }
                case 11: {
                    if (!var15_ref.equals((Object) (Object) "nbsp")) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var14 = 160;
                    statePc = 35;
                    continue stateLoop;
                }
                case 13: {
                    if (var15_ref.equals((Object) (Object) "shy")) {
                        statePc = 33;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (!var15_ref.equals((Object) (Object) "times")) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var14 = 215;
                    statePc = 35;
                    continue stateLoop;
                }
                case 16: {
                    if (var15_ref.equals((Object) (Object) "euro")) {
                        statePc = 32;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15_ref.equals((Object) (Object) "copy")) {
                        statePc = 31;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!var15_ref.equals((Object) (Object) "reg")) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var14 = 174;
                    statePc = 35;
                    continue stateLoop;
                }
                case 20: {
                    if (var15_ref.startsWith("img=")) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.a(var15_ref, -16777216);
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var21 = (CharSequence) var15_ref.substring(4);
                        var16_int = td.a(var21, (byte) 38);
                        var17 = param1[var16_int];
                        if (param5 != null) {
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
                        stackOut_23_0 = var17.c();
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
                        stackOut_24_0 = param5[var16_int];
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
                        var18 = stackIn_25_0;
                        if ((qg.field_c & -16777216 ^ -1) != 16777215) {
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
                        var17.a(param2, -var18 + ((da) this).field_c.field_e + param6, 1, 0, 1);
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
                        var17.a(param2, param6 - -((da) this).field_c.field_e - var18, 0, qg.field_c & -16777216 | 16777215, 1);
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
                        param2 = param2 + param1[var16_int].d();
                        var11 = -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 30: {
                    var16 = (Exception) (Object) caughtException;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 31: {
                    var14 = 169;
                    statePc = 35;
                    continue stateLoop;
                }
                case 32: {
                    var14 = 8364;
                    statePc = 35;
                    continue stateLoop;
                }
                case 33: {
                    var14 = 173;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    var14 = 60;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var10 == -1) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 37: {
                    if ((var11 ^ -1) != 0) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    param2 = param2 + ((da) this).field_c.a(0, (char) var14, var11);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((var14 ^ -1) == -33) {
                        statePc = 49;
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
                    if (0 == (es.field_c & -16777216)) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((da) this).a((char) var14, 1 + param2, param6 - -1, es.field_c, true, param7, param0, param8);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    ((da) this).a((char) var14, param2, param6, qg.field_c, false, param7, param0, param8);
                    statePc = 52;
                    continue stateLoop;
                }
                case 45: {
                    if (0 != (-16777216 & es.field_c)) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((da) this).fa((char) var14, 1 + param2, param6 + 1, es.field_c, true);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    ((da) this).fa((char) var14, param2, param6, qg.field_c, false);
                    statePc = 52;
                    continue stateLoop;
                }
                case 49: {
                    if ((tm.field_i ^ -1) < -1) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ed.field_i = ed.field_i + tm.field_i;
                    param2 = param2 + (ed.field_i >> -1397336856);
                    ed.field_i = ed.field_i & 255;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var15 = ((da) this).field_c.a((byte) 109, var14);
                    if ((rs.field_t ^ -1) != 0) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    ((da) this).field_d.a(param6 - -(int)(0.7 * (double)((da) this).field_c.field_e), rs.field_t, 28321, param2, var15);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (0 == (rb.field_h ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    ((da) this).field_d.a(1 + (param6 - -((da) this).field_c.field_e), rb.field_h, 28321, param2, var15);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    param2 = param2 + var15;
                    var11 = var14;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var4 = 0;
        var5 = 0;
        if (param1 > 98) {
          var6 = 0;
          L0: while (true) {
            if (param2.length() <= var6) {
              L1: {
                if ((var4 ^ -1) >= -1) {
                  break L1;
                } else {
                  tm.field_i = (param0 + -((da) this).field_c.a((byte) 94, param2) << -1649616888) / var4;
                  break L1;
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
        } else {
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param0 == null) {
            return;
        }
        this.a(param2, -1, param1);
        if (param5 != 92) {
            ((da) this).field_d = (ha) null;
        }
        this.a(0, (pa[]) null, param3 + -((da) this).field_c.a((byte) 94, param0), param0, (byte) 5, (int[]) null, param4, (aa) null, 0);
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    private final void a(int param0, int param1, int param2) {
        rs.field_t = -1;
        tf.field_a = param2;
        qg.field_c = param2;
        tm.field_i = 0;
        rb.field_h = param1;
        ed.field_i = 0;
        if (param0 == -1) {
            param0 = 0;
        }
        em.field_d = param0;
        es.field_c = param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        if (!(param5 != null)) {
            return;
        }
        this.a(param2, -1, param1);
        this.a(0, (pa[]) null, -(((da) this).field_c.a((byte) 94, param5) / 2) + param4, param5, (byte) 5, (int[]) null, param3, (aa) null, 0);
        if (param0 < 95) {
            String var8 = (String) null;
            ((da) this).a((String) null, 1, -72, -15, 80, (byte) -125);
        }
    }

    final void a(int param0, int param1, int[] param2, byte param3, int param4, String param5, int param6, pa[] param7) {
        if (!(param5 != null)) {
            return;
        }
        this.a(param0, -1, param1);
        if (param3 > -93) {
            gk discarded$0 = da.a(126, -64);
        }
        this.a(0, param7, -((da) this).field_c.a((byte) 94, param5) + param6, param5, (byte) 5, param2, param4, (aa) null, 0);
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[128];
    }
}
