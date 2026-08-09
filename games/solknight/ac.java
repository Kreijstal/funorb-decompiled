/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    public static void a(int param0) {
        if (param0 != -15180) {
            ac.a((byte) 86);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        o var5 = null;
        o var6 = null;
        o var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mi.g(243, 197, 369, 143, 16777215);
                        mi.b(244, 198, 367, 141, 0);
                        if (null == jb.field_d) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (sk.field_n != null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var5 = jb.field_d[we.field_h];
                        var6 = var5;
                        var6 = var5;
                        if (var5 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5.d(245, 199);
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == sk.field_n) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (ti.field_e < uc.field_e) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = jb.field_d[vb.field_g];
                        if (var6 == null) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = (var6.field_q - -60) * ti.field_e / uc.field_e;
                        var3 = -30 + var2_int;
                        if (!fh.field_g) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        fl.a(256 * (var6.field_q + -var3) / 30, -256 * var3 / 30, 245, -128, 199, var6);
                        if (var4 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        fl.a(var3 * -256 / 30, 256 * (-var3 + var6.field_q) / 30, 245, 51, 199, var6);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (sk.field_n != null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2 = null;
                        var3 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var3 >= jb.field_d.length) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = jb.field_d[var3];
                        if (var4 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var7 == null) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (365 != var7.field_q) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var7.field_r ^ -1) != -140) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var2 != null) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2 = Integer.toString(var3);
                        if (var4 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var2 = (String) (var2) + ", " + var3;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var2 == null) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        sk.field_n.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param0 < -110) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ac.a(61, false);
                        return;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var1), "ac.D(" + param0 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
          return -57;
        } else {
          param0--;
          param0 = param0 | param0 >>> 1664989313;
          param0 = param0 | param0 >>> 1943770146;
          param0 = param0 | param0 >>> -1869216828;
          param0 = param0 | param0 >>> -1103602104;
          param0 = param0 | param0 >>> 325046672;
          return param0 - -1;
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        if (param0 == 0) {
          return 0;
        } else {
          if (0 >= param0) {
            L0: {
              var2 = 2;
              if (param0 >= -65536) {
                break L0;
              } else {
                param0 = param0 >> 16;
                var2 += 16;
                break L0;
              }
            }
            if (param1 < 123) {
              return -17;
            } else {
              L1: {
                if (param0 < -256) {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (15 < (param0 ^ -1)) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param0 ^ -1) > 3) {
                  param0 = param0 >> 2;
                  var2 += 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param0 >= -2) {
                  break L4;
                } else {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                }
              }
              return var2;
            }
          } else {
            L5: {
              var2 = 1;
              if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0 > 255) {
                var2 += 8;
                param0 = param0 >> 8;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-16 <= (param0 ^ -1)) {
                break L7;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L7;
              }
            }
            L8: {
              if (-4 <= (param0 ^ -1)) {
                break L8;
              } else {
                param0 = param0 >> 2;
                var2 += 2;
                break L8;
              }
            }
            L9: {
              if (1 >= param0) {
                break L9;
              } else {
                var2++;
                param0 = param0 >> 1;
                break L9;
              }
            }
            return var2;
          }
        }
    }

    static {
        field_a = "Press the left mouse button to fire";
    }
}
