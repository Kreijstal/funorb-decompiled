/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static int[] field_g;
    static ob field_d;
    static String field_a;
    static int field_e;
    static int[] field_f;
    static mc field_c;
    static int field_b;
    static String field_i;
    static int field_h;

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        mp var9 = null;
        int var10 = 0;
        Object var11 = null;
        int stackIn_18_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        mp stackIn_44_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_37_0 = null;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        mp stackOut_43_0 = null;
        mp stackOut_42_0 = null;
        L0: {
          var10 = Vertigo2.field_L ? 1 : 0;
          var1 = be.field_t;
          var2 = 0;
          if (-3 != da.field_j) {
            break L0;
          } else {
            var3_long = gk.a(95) - qe.field_cb;
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (-1 <= var2) {
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -14732) {
            break L1;
          } else {
            var11 = null;
            boolean discarded$1 = eb.a((String) null, true);
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (mn.field_q.length <= var3) {
            return;
          } else {
            L3: {
              var4 = gd.field_s[var3];
              if (var4 >= 0) {
                if (var4 == ve.field_d.field_c) {
                  var5 = sr.field_a;
                  break L3;
                } else {
                  var5 = ma.field_m;
                  break L3;
                }
              } else {
                var5 = oi.field_b;
                break L3;
              }
            }
            L4: {
              var6 = mn.field_q[var3];
              if ((da.field_j ^ -1) != -3) {
                break L4;
              } else {
                if (var2 == 1) {
                  L5: {
                    if (rp.field_e.length > jo.field_g.length) {
                      stackOut_17_0 = rp.field_e.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = jo.field_g.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_18_0;
                    if (var3 < 6) {
                      break L6;
                    } else {
                      if (var3 >= 6 - -var7) {
                        break L6;
                      } else {
                        L7: {
                          if (-1 >= (-6 + var3 + (jo.field_g.length + -var7) ^ -1)) {
                            stackOut_22_0 = jo.field_g[jo.field_g.length + (-6 + var3 - var7)];
                            stackIn_23_0 = stackOut_22_0;
                            break L7;
                          } else {
                            stackOut_21_0 = "";
                            stackIn_23_0 = stackOut_21_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_23_0;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (ba.field_b.length > bl.field_z.length) {
                      stackOut_26_0 = ba.field_b.length;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      stackOut_25_0 = bl.field_z.length;
                      stackIn_27_0 = stackOut_25_0;
                      break L8;
                    }
                  }
                  var8 = stackIn_27_0;
                  if (var7 + 7 > var3) {
                    break L4;
                  } else {
                    if (var8 + (7 - -var7) > var3) {
                      L9: {
                        if (var3 + (-7 - var7) < bl.field_z.length) {
                          stackOut_32_0 = bl.field_z[-7 + var3 - var7];
                          stackIn_33_0 = stackOut_32_0;
                          break L9;
                        } else {
                          stackOut_31_0 = "";
                          stackIn_33_0 = stackOut_31_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_33_0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L10: {
              if (1 == (var4 ^ -1)) {
                var6_ref = Integer.toString(var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_37_0 = (String) var6_ref;
              stackIn_39_0 = stackOut_37_0;
              stackIn_38_0 = stackOut_37_0;
              if (0 > var4) {
                stackOut_39_0 = (String) (Object) stackIn_39_0;
                stackOut_39_1 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                break L11;
              } else {
                stackOut_38_0 = (String) (Object) stackIn_38_0;
                stackOut_38_1 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                break L11;
              }
            }
            L12: {
              var7 = uc.a(stackIn_40_0, stackIn_40_1 != 0, false);
              var8 = vm.field_c - (var7 >> -758116415);
              if (0 > var4) {
                break L12;
              } else {
                L13: {
                  if (var4 == ve.field_d.field_c) {
                    stackOut_43_0 = mq.field_v;
                    stackIn_44_0 = stackOut_43_0;
                    break L13;
                  } else {
                    stackOut_42_0 = gl.field_i;
                    stackIn_44_0 = stackOut_42_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_44_0;
                  var1 = var1 + al.field_z;
                  if (var9 != null) {
                    var9.a(kd.field_z - -(qc.field_z << 1903291329), var8 + -gl.field_l, var1, var7 - -(gl.field_l << -904791711), -114);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = var1 + qc.field_z;
                break L12;
              }
            }
            if (0 <= var4) {
              gb.field_b.b(var6_ref, var8, var1 + re.field_g, var5, -1);
              var1 = var1 + (kd.field_z + al.field_z + qc.field_z);
              var3++;
              continue L2;
            } else {
              mf.field_c.b(var6_ref, var8, gj.field_y + var1, var5, -1);
              var1 = var1 + gd.field_k;
              var3++;
              continue L2;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_i = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != 15) {
            eb.a((byte) -51);
        }
        field_d = null;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (jj.field_v.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param0.startsWith("https://")) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        if (param1) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var3 >= param0.length()) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        var3++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0) {
        if (!(un.field_Hb != bf.field_b)) {
            return mk.field_S;
        }
        if (!cl.field_c.a((byte) -108)) {
            return cl.field_c.d((byte) 121);
        }
        if (um.field_F == bf.field_b) {
            return cl.field_c.d((byte) 119);
        }
        if (param0 != -1) {
            field_h = -125;
        }
        return ff.field_u;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 != 6337) {
            return null;
        }
        if (!(!param1)) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        if (param0) {
            var4++;
        }
        return m.field_y[var4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[1024];
        field_f = new int[12];
        field_i = "Your ignore list is full. Max of 100 hit.";
    }
}
