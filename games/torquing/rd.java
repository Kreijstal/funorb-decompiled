/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rd extends am {
    private int field_y;
    private int field_u;
    private int field_B;
    static rc field_x;
    static String field_t;
    private int field_w;
    private int field_s;
    static la field_z;
    static java.awt.Color field_A;
    static String field_v;

    public rd() {
        super(0, true);
        ((rd) this).field_u = 16;
        ((rd) this).field_y = 0;
        ((rd) this).field_s = 0;
        ((rd) this).field_B = 4096;
        ((rd) this).field_w = 2000;
    }

    final static void a(uc param0, int param1, int param2, String param3, kp param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Torquing.field_u;
          var5 = 0;
          if (param1 == 10580) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (var7 >= param3.length()) {
            return;
          } else {
            L2: {
              var8 = param3.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = (var5 >> 79497000) + param4.field_b[0] - -param0.a(param3.substring(0, var7));
                break L2;
              }
            }
            L3: {
              if (-1 == var6) {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param4.field_b[var7] = param4.field_b[0] + (var5 >> -2122845112) - -param0.a(param3.substring(0, 1 + var7)) - param0.a((char) var8);
                break L3;
              } else {
                param4.field_b[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0) {
        try {
            int var1 = 0;
            Exception var2 = null;
            java.lang.reflect.Method var2_ref = null;
            Throwable var3 = null;
            Runtime var3_ref = null;
            Long var4 = null;
            Object var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var1 = 81 % ((param0 - -46) / 61);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var2_ref == null) {
                                statePc = 7;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = Runtime.getRuntime();
                            var5 = null;
                            var4 = (Long) var2_ref.invoke((Object) (Object) var3_ref, (Object[]) null);
                            df.field_u = 1 + (int)(var4.longValue() / 1048576L);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var3 = caughtException;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var2 = (Exception) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (var4 != 0) {
            if (var4 != -2) {
              if (2 == var4) {
                ((rd) this).field_u = param0.i((byte) -101);
                break L0;
              } else {
                if (-4 != var4) {
                  if (var4 == 4) {
                    ((rd) this).field_B = param0.i(param1 + 7053);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((rd) this).field_y = param0.i(7088);
                  break L0;
                }
              }
            } else {
              ((rd) this).field_w = param0.i(7088);
              break L0;
            }
          } else {
            ((rd) this).field_s = param0.i((byte) -101);
            break L0;
          }
        }
        L1: {
          if (param1 == 35) {
            break L1;
          } else {
            ((rd) this).field_u = 81;
            break L1;
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        Random var6 = null;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[][] var31 = null;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var27 = Torquing.field_u;
          var3 = ((rd) this).field_l.a(param1, 25657);
          if (!((rd) this).field_l.field_b) {
            break L0;
          } else {
            var4 = ((rd) this).field_B >> -1616475775;
            var31 = ((rd) this).field_l.a(0);
            var6 = new Random((long)((rd) this).field_s);
            var7 = 0;
            L1: while (true) {
              if (((rd) this).field_w <= var7) {
                break L0;
              } else {
                L2: {
                  if ((((rd) this).field_B ^ -1) >= -1) {
                    stackOut_5_0 = ((rd) this).field_y;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ((rd) this).field_y - (-va.a(((rd) this).field_B, (byte) 121, var6) + var4);
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_6_0;
                  var8 = (4087 & var8) >> -596194588;
                  var9 = va.a(ci.field_c, (byte) 123, var6);
                  var10 = va.a(um.field_o, (byte) 127, var6);
                  var11 = (((rd) this).field_u * de.field_d[var8] >> -2010635956) + var9;
                  var12 = var10 + (((rd) this).field_u * jh.field_x[var8] >> -1650227156);
                  var13 = var12 - var10;
                  var14 = var11 + -var9;
                  if (0 != var14) {
                    break L3;
                  } else {
                    if (var13 != 0) {
                      break L3;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                L4: {
                  if (var13 < 0) {
                    var13 = -var13;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var13 <= var14) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L6;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_18_0;
                  if (var15 != 0) {
                    var16 = var9;
                    var17 = var11;
                    var9 = var10;
                    var10 = var16;
                    var11 = var12;
                    var12 = var17;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var11 >= var9) {
                    break L8;
                  } else {
                    var16 = var9;
                    var17 = var10;
                    var9 = var11;
                    var11 = var16;
                    var10 = var12;
                    var12 = var17;
                    break L8;
                  }
                }
                L9: {
                  var16 = var10;
                  var17 = var11 - var9;
                  var18 = -var10 + var12;
                  var19 = -var17 / 2;
                  var20 = 2048 / var17;
                  var21 = 1024 + -(va.a(4096, (byte) 124, var6) >> 466902114);
                  if (-1 >= (var18 ^ -1)) {
                    break L9;
                  } else {
                    var18 = -var18;
                    break L9;
                  }
                }
                L10: {
                  if (var10 >= var12) {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L10;
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    break L10;
                  }
                }
                var22 = stackIn_28_0;
                var23 = var9;
                L11: while (true) {
                  if (var11 > var23) {
                    L12: {
                      var24 = var20 * (-var9 + var23) + (1024 + var21);
                      var25 = jh.field_A & var23;
                      var26 = var16 & vp.field_I;
                      if (var15 == 0) {
                        var31[var25][var26] = var24;
                        break L12;
                      } else {
                        var31[var26][var25] = var24;
                        break L12;
                      }
                    }
                    var19 = var19 + var18;
                    if (-1 > (var19 ^ -1)) {
                      var19 = var19 + -var17;
                      var16 = var16 + var22;
                      var23++;
                      continue L11;
                    } else {
                      var23++;
                      continue L11;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        if (param0 > 86) {
          return var3;
        } else {
          return null;
        }
    }

    final void a(byte param0) {
        if (param0 < 123) {
            Object var3 = null;
            rd.a((uc) null, -27, 36, (String) null, (kp) null);
        }
        ie.a(14837);
    }

    public static void c(int param0) {
        field_t = null;
        field_z = null;
        field_x = null;
        field_v = null;
        field_A = null;
        int var1 = -92 / ((param0 - 58) / 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new java.awt.Color(10040319);
        field_v = "No highscores";
    }
}
