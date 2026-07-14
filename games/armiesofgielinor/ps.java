/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps extends lk {
    static kl field_u;
    static int field_E;
    static wk[] field_w;
    static String field_x;
    private ru[] field_B;
    static int[] field_D;
    static pf field_y;
    static String field_A;
    static boolean field_v;
    static String field_z;
    static int[] field_C;

    final static va b(byte param0) {
        int var1 = 0;
        int var2_int = 0;
        IllegalArgumentException var2 = null;
        va var3 = null;
        int var4 = 0;
        va stackIn_4_0 = null;
        va stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var1 = 55 / ((param0 - 21) / 34);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3 = mp.field_Sb.a(var2_int, true);
                        if (!var3.field_H) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (va) var3;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return (va) (Object) stackIn_4_0;
                }
                case 5: {
                    try {
                        var2_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (IllegalArgumentException) (Object) caughtException;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        field_y = null;
        field_w = null;
        field_A = null;
        if (param0) {
          ps.a(-117, false);
          field_x = null;
          field_z = null;
          field_u = null;
          field_C = null;
          field_D = null;
          return;
        } else {
          field_x = null;
          field_z = null;
          field_u = null;
          field_C = null;
          field_D = null;
          return;
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ru var14 = null;
        ru var16 = null;
        ru var18 = null;
        ru var18_ref = null;
        ru var19 = null;
        ru var20 = null;
        ru var21 = null;
        ru var22 = null;
        ru var22_ref = null;
        ru var23 = null;
        ru var24 = null;
        ru var25 = null;
        ru var36 = null;
        ru var37 = null;
        ru var38 = null;
        ru var38_ref = null;
        ru var39 = null;
        ru var39_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_97_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        qn.b(param0.field_B + param1, param4 + param0.field_p, param0.field_l, param0.field_w, 10197915);
        if (param2 <= -79) {
          if (param3) {
            if (!((fw) (Object) param0).field_K) {
              L0: {
                var6 = 0;
                if (param3) {
                  if (param0.a(false)) {
                    stackOut_90_0 = 1;
                    stackIn_92_0 = stackOut_90_0;
                    break L0;
                  } else {
                    stackOut_89_0 = 0;
                    stackIn_92_0 = stackOut_89_0;
                    break L0;
                  }
                } else {
                  stackOut_87_0 = 0;
                  stackIn_92_0 = stackOut_87_0;
                  break L0;
                }
              }
              L1: {
                var7 = stackIn_92_0;
                var8 = 0;
                if (var7 == 0) {
                  break L1;
                } else {
                  var8 = var8 | 2;
                  break L1;
                }
              }
              L2: {
                if (var6 == 0) {
                  stackOut_96_0 = 16777215;
                  stackIn_97_0 = stackOut_96_0;
                  break L2;
                } else {
                  stackOut_95_0 = 2394342;
                  stackIn_97_0 = stackOut_95_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_97_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              var38 = ((ps) this).field_B[var8];
              var39 = var38;
              var39 = var38;
              var11 = param1 + param0.field_B - -((-var38.field_e + param0.field_l) / 2);
              var12 = (-var38.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
              var13 = param0.field_B + (param1 + param0.field_l / 2);
              var38.a(var11, var12);
              ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
              return;
            } else {
              L4: {
                var6 = 1;
                if (param3) {
                  if (!param0.a(false)) {
                    stackOut_76_0 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    break L4;
                  } else {
                    stackOut_75_0 = 1;
                    stackIn_77_0 = stackOut_75_0;
                    break L4;
                  }
                } else {
                  stackOut_73_0 = 0;
                  stackIn_77_0 = stackOut_73_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_77_0;
                var8 = 0;
                if (var7 == 0) {
                  break L5;
                } else {
                  var8 = var8 | 2;
                  break L5;
                }
              }
              L6: {
                if (var6 == 0) {
                  stackOut_81_0 = 16777215;
                  stackIn_82_0 = stackOut_81_0;
                  break L6;
                } else {
                  stackOut_80_0 = 2394342;
                  stackIn_82_0 = stackOut_80_0;
                  break L6;
                }
              }
              L7: {
                var9 = stackIn_82_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              var39_ref = ((ps) this).field_B[var8];
              var11 = param1 + param0.field_B - -((-var39_ref.field_e + param0.field_l) / 2);
              var12 = (-var39_ref.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
              var13 = param0.field_B + (param1 + param0.field_l / 2);
              var39_ref.a(var11, var12);
              ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
              return;
            }
          } else {
            var6 = 0;
            stackOut_60_0 = 0;
            stackIn_62_0 = stackOut_60_0;
            L8: {
              var7 = stackIn_62_0;
              var8 = 0;
              if (var7 == 0) {
                break L8;
              } else {
                var8 = var8 | 2;
                break L8;
              }
            }
            L9: {
              if (var6 == 0) {
                stackOut_66_0 = 16777215;
                stackIn_67_0 = stackOut_66_0;
                break L9;
              } else {
                stackOut_65_0 = 2394342;
                stackIn_67_0 = stackOut_65_0;
                break L9;
              }
            }
            L10: {
              var9 = stackIn_67_0;
              if (var6 != 0) {
                var8 = var8 | 1;
                break L10;
              } else {
                break L10;
              }
            }
            var37 = ((ps) this).field_B[var8];
            var39 = var37;
            var39 = var37;
            var11 = param1 + param0.field_B - -((-var37.field_e + param0.field_l) / 2);
            var12 = (-var37.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
            var13 = param0.field_B + (param1 + param0.field_l / 2);
            var37.a(var11, var12);
            ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
            return;
          }
        } else {
          field_A = null;
          if (param3) {
            if (((fw) (Object) param0).field_K) {
              var6 = 1;
              if (param3) {
                if (!param0.a(false)) {
                  L11: {
                    var7 = 0;
                    var8 = 0;
                    if (var7 == 0) {
                      break L11;
                    } else {
                      var8 = var8 | 2;
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 0) {
                      stackOut_53_0 = 16777215;
                      stackIn_54_0 = stackOut_53_0;
                      break L12;
                    } else {
                      stackOut_52_0 = 2394342;
                      stackIn_54_0 = stackOut_52_0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = stackIn_54_0;
                    if (var6 != 0) {
                      var8 = var8 | 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var22 = ((ps) this).field_B[var8];
                  var23 = var22;
                  var24 = var23;
                  var25 = var24;
                  var23 = var22;
                  var11 = param1 + param0.field_B - -((-var22.field_e + param0.field_l) / 2);
                  var12 = (-var22.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
                  var13 = param0.field_B + (param1 + param0.field_l / 2);
                  var22.a(var11, var12);
                  ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
                  return;
                } else {
                  L14: {
                    var7 = 1;
                    var8 = 0;
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var8 = var8 | 2;
                      break L14;
                    }
                  }
                  L15: {
                    if (var6 == 0) {
                      stackOut_44_0 = 16777215;
                      stackIn_45_0 = stackOut_44_0;
                      break L15;
                    } else {
                      stackOut_43_0 = 2394342;
                      stackIn_45_0 = stackOut_43_0;
                      break L15;
                    }
                  }
                  L16: {
                    var9 = stackIn_45_0;
                    if (var6 != 0) {
                      var8 = var8 | 1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var36 = ((ps) this).field_B[var8];
                  var38_ref = var36;
                  var39 = var38_ref;
                  var38_ref = var36;
                  var11 = param1 + param0.field_B - -((-var36.field_e + param0.field_l) / 2);
                  var12 = (-var36.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
                  var13 = param0.field_B + (param1 + param0.field_l / 2);
                  var36.a(var11, var12);
                  ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
                  return;
                }
              } else {
                L17: {
                  var7 = 0;
                  var8 = 0;
                  if (var7 == 0) {
                    break L17;
                  } else {
                    var8 = var8 | 2;
                    break L17;
                  }
                }
                L18: {
                  if (var6 == 0) {
                    stackOut_34_0 = 16777215;
                    stackIn_35_0 = stackOut_34_0;
                    break L18;
                  } else {
                    stackOut_33_0 = 2394342;
                    stackIn_35_0 = stackOut_33_0;
                    break L18;
                  }
                }
                L19: {
                  var9 = stackIn_35_0;
                  if (var6 != 0) {
                    var8 = var8 | 1;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var18_ref = ((ps) this).field_B[var8];
                var19 = var18_ref;
                var20 = var19;
                var21 = var20;
                var19 = var18_ref;
                var11 = param1 + param0.field_B - -((-var18_ref.field_e + param0.field_l) / 2);
                var12 = (-var18_ref.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
                var13 = param0.field_B + (param1 + param0.field_l / 2);
                var18_ref.a(var11, var12);
                ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
                return;
              }
            } else {
              L20: {
                var6 = 0;
                if (param3) {
                  if (param0.a(false)) {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L20;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_20_0 = stackOut_17_0;
                    break L20;
                  }
                } else {
                  stackOut_15_0 = 0;
                  stackIn_20_0 = stackOut_15_0;
                  break L20;
                }
              }
              L21: {
                var7 = stackIn_20_0;
                var8 = 0;
                if (var7 == 0) {
                  break L21;
                } else {
                  var8 = var8 | 2;
                  break L21;
                }
              }
              L22: {
                if (var6 == 0) {
                  stackOut_24_0 = 16777215;
                  stackIn_25_0 = stackOut_24_0;
                  break L22;
                } else {
                  stackOut_23_0 = 2394342;
                  stackIn_25_0 = stackOut_23_0;
                  break L22;
                }
              }
              L23: {
                var9 = stackIn_25_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L23;
                } else {
                  break L23;
                }
              }
              var16 = ((ps) this).field_B[var8];
              var22_ref = var16;
              var23 = var22_ref;
              var24 = var23;
              var22_ref = var16;
              var11 = param1 + param0.field_B - -((-var16.field_e + param0.field_l) / 2);
              var12 = (-var16.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
              var13 = param0.field_B + (param1 + param0.field_l / 2);
              var16.a(var11, var12);
              ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
              return;
            }
          } else {
            var6 = 0;
            stackOut_2_0 = 0;
            stackIn_4_0 = stackOut_2_0;
            L24: {
              var7 = stackIn_4_0;
              var8 = 0;
              if (var7 == 0) {
                break L24;
              } else {
                var8 = var8 | 2;
                break L24;
              }
            }
            L25: {
              if (var6 == 0) {
                stackOut_8_0 = 16777215;
                stackIn_9_0 = stackOut_8_0;
                break L25;
              } else {
                stackOut_7_0 = 2394342;
                stackIn_9_0 = stackOut_7_0;
                break L25;
              }
            }
            L26: {
              var9 = stackIn_9_0;
              if (var6 != 0) {
                var8 = var8 | 1;
                break L26;
              } else {
                break L26;
              }
            }
            var14 = ((ps) this).field_B[var8];
            var18 = var14;
            var19 = var18;
            var20 = var19;
            var18 = var14;
            var11 = param1 + param0.field_B - -((-var14.field_e + param0.field_l) / 2);
            var12 = (-var14.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
            var13 = param0.field_B + (param1 + param0.field_l / 2);
            var14.a(var11, var12);
            ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          sh.field_l = param0;
          if (sj.field_d != mj.field_c) {
            var2 = mj.field_c * mj.field_c;
            var3 = var2 - sj.field_d * sj.field_d;
            param0 = param0 + var3 * (gb.field_y - param0) / var2;
            break L0;
          } else {
            break L0;
          }
        }
        ag.field_I.a(120, -20500, 640, param0, va.field_u);
        hm.a(-1, mi.field_l, 0, io.field_n, 5, gb.field_y - 24, 640);
        if (!param1) {
          field_z = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, kl param1, kl param2) {
        if (param0 < 30) {
            ps.c(false);
            iw.field_p = param2;
            bh.field_H = param1;
            return;
        }
        iw.field_p = param2;
        bh.field_H = param1;
    }

    ps(ru[] param0) {
        ((ps) this).field_B = param0;
        ((ps) this).field_q = ArmiesOfGielinor.field_J;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new wk[3];
        field_D = new int[]{100, 100, 200, 100, 100, 100, 200, 200, 200, 200, 300, 200, 200, 200, 300, 500, 100, 100, 100, 200, 300, 300, 100, 100, 100, 100, 100, 100, 100, 100, 200, 200, 200, 200, 200, 200, 200, 200, 200, 300, 500, 300, 300, 500, 200, 300, 500, 300, 300, 500, 200, 300, 500, 200, 300, 500};
        field_E = 250;
        field_x = "This ground produces no Mana";
        field_y = new pf("usename");
        field_A = "You are on <%0>";
        field_z = "Click or press F10 to open Quick Chat";
        field_C = new int[]{2, 2, 2, 2, 2};
    }
}
