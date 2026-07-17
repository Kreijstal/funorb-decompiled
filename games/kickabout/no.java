/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends i {
    static int field_F;
    static String field_G;
    static String[] field_K;
    static long field_H;
    static String field_I;
    static byte[] field_J;

    final static int b(int param0, int param1) {
        if (param1 != 15832) {
            field_J = null;
        }
        if (param0 < 0) {
            if (param0 < -65536) {
                return ve.field_T[134217728 / -param0] + -2048;
            }
            return -ve.field_T[-param0 >> 5];
        }
        if (param0 <= 65536) {
            return ve.field_T[param0 >> 5];
        }
        return 2048 + -ve.field_T[134217728 / param0];
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Kickabout.field_G;
          var1 = 0;
          if (1 == ks.field_e) {
            ps.a(-25246, true, false, false, false, false, false);
            break L0;
          } else {
            if (ks.field_e != 2) {
              if (3 != ks.field_e) {
                if (ks.field_e != 4) {
                  if (ks.field_e != 5) {
                    if (ks.field_e != 6) {
                      if (ks.field_e != 7) {
                        if (8 != ks.field_e) {
                          if (ks.field_e == 9) {
                            ps.a(-25246, false, false, true, true, false, false);
                            break L0;
                          } else {
                            if (ks.field_e != 10) {
                              if (ks.field_e == 11) {
                                ps.a(-25246, true, true, true, true, false, true);
                                break L0;
                              } else {
                                if (ks.field_e != 12) {
                                  if (ks.field_e == 13) {
                                    ps.a(-25246, true, true, true, true, false, true);
                                    break L0;
                                  } else {
                                    ps.a(-25246, true, true, true, true, true, true);
                                    break L0;
                                  }
                                } else {
                                  ps.a(-25246, false, false, true, true, false, false);
                                  break L0;
                                }
                              }
                            } else {
                              ps.a(-25246, false, false, false, false, true, false);
                              break L0;
                            }
                          }
                        } else {
                          ps.a(-25246, true, true, false, true, false, true);
                          break L0;
                        }
                      } else {
                        ps.a(-25246, true, true, false, false, false, true);
                        break L0;
                      }
                    } else {
                      ps.a(-25246, false, false, false, true, false, false);
                      break L0;
                    }
                  } else {
                    ps.a(-25246, false, false, false, true, false, false);
                    break L0;
                  }
                } else {
                  ps.a(-25246, false, false, false, true, false, false);
                  break L0;
                }
              } else {
                ps.a(-25246, true, false, false, false, false, true);
                break L0;
              }
            } else {
              ps.a(-25246, false, false, false, false, false, true);
              break L0;
            }
          }
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              mj.field_a = cr.field_d;
              if (255 != param1) {
                if (param1 < 100) {
                  u.field_h = wb.a(-124, param2, param1);
                  break L1;
                } else {
                  if (105 < param1) {
                    u.field_h = wb.a(-124, param2, param1);
                    break L1;
                  } else {
                    var4 = args;
                    pp.a(18267, var4);
                    u.field_h = wt.a(-117, args);
                    break L1;
                  }
                }
              } else {
                L2: {
                  if (tn.field_b >= 13) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                u.field_h = mf.a(stackIn_5_0 != 0, 41);
                var6 = null;
                pp.a(18267, (String[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("no.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (args == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -1 + 41);
        }
    }

    no() {
        super(9);
        ut var1 = kb.field_E[-1 + kb.field_E.length];
        String var2 = q.field_h[-1 + q.field_h.length];
        String var3 = vo.a((byte) -18, gd.field_e[9], new String[1]);
        ((no) this).a(var3, ((no) this).field_t, var1, -117, ((no) this).field_u);
    }

    final void a(int param0, int param1) {
        super.a(122, param1);
        if (!(!la.a(100))) {
            return;
        }
        if (param0 <= 60) {
            field_K = null;
        }
        or.field_d.b(78, (byte) 113);
    }

    final static ld a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_3_0 = null;
        ld stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        ld stackIn_19_0 = null;
        ld stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_6_0 = null;
        ld stackOut_22_0 = null;
        ld stackOut_18_0 = null;
        Object stackOut_9_0 = null;
        ld stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 63) {
              stackOut_6_0 = st.field_j;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param1 == 134217728) {
                var3 = 0;
                L0: while (true) {
                  if (var3 < var2_int) {
                    L1: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (-1 == qs.field_V.indexOf(var4)) {
                          stackOut_22_0 = lm.field_F;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          break L1;
                        }
                      } else {
                        L2: {
                          if (var3 == 0) {
                            break L2;
                          } else {
                            if (var2_int + -1 == var3) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                        stackOut_18_0 = lm.field_F;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                    var3++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (ld) (Object) stackIn_10_0;
              }
            }
          } else {
            stackOut_2_0 = ld.field_b;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("no.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param1 + 41);
        }
    }

    public static void g(byte param0) {
        field_I = null;
        field_G = null;
        field_K = null;
        if (param0 != -93) {
            no.g((byte) 67);
        }
        field_J = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Unpacking sound", "Unpacking patches", "Unpacking graphics", "Unpacking menus", "Unpacking lobby", "Unpacking 3D models", "Unpacking animations", "Initialising 3D", "Initialising game components", "Initialising menus", "Initialising HUDs", "Initialising pitch", "Initialising UI", "Initialising client", null};
        field_G = "This password contains your email address, and would be easy to guess";
        field_H = 20000000L;
        field_I = "Game full";
    }
}
