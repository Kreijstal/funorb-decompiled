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

    final static void g() {
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

    final static void a(String[] args, int param1, String param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            mj.field_a = cr.field_d;
            L1: {
              if (255 != param1) {
                L2: {
                  if (param1 < 100) {
                    break L2;
                  } else {
                    if (105 < param1) {
                      break L2;
                    } else {
                      var7 = args;
                      pp.a(18267, var7);
                      u.field_h = wt.a(-117, args);
                      break L1;
                    }
                  }
                }
                u.field_h = wb.a(-124, param2, param1);
                break L1;
              } else {
                L3: {
                  if (tn.field_b >= 13) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    break L3;
                  }
                }
                u.field_h = mf.a(stackIn_8_0 != 0, 41);
                var6 = null;
                pp.a(18267, (String[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("no.C(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (args == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + -1 + 41);
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

    final static ld a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_3_0 = null;
        ld stackIn_8_0 = null;
        ld stackIn_21_0 = null;
        ld stackIn_26_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_7_0 = null;
        ld stackOut_25_0 = null;
        ld stackOut_20_0 = null;
        ld stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var5 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 63) {
              stackOut_7_0 = st.field_j;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2_int) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if (-1 == qs.field_V.indexOf(var4)) {
                        stackOut_25_0 = lm.field_F;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
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
                      stackOut_20_0 = lm.field_F;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
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
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("no.B(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L3;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + 134217728 + 41);
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
