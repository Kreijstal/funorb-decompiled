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
            field_J = (byte[]) null;
        }
        if (param0 < 0) {
            if (65535 < (param0 ^ -1)) {
                return ve.field_T[134217728 / -param0] + -2048;
            }
            return -ve.field_T[-param0 >> -1617764283];
        }
        if (-65537 <= (param0 ^ -1)) {
            return ve.field_T[param0 >> 622369765];
        }
        return 2048 + -ve.field_T[134217728 / param0];
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Kickabout.field_G;
          var1 = -24 % ((param0 - 38) / 56);
          if (1 == ks.field_e) {
            ps.a(-25246, true, false, false, false, false, false);
            break L0;
          } else {
            if (ks.field_e != 2) {
              if (3 != ks.field_e) {
                if ((ks.field_e ^ -1) != -5) {
                  if (ks.field_e != 5) {
                    if ((ks.field_e ^ -1) != -7) {
                      if ((ks.field_e ^ -1) != -8) {
                        if (8 != ks.field_e) {
                          if (-10 == (ks.field_e ^ -1)) {
                            ps.a(-25246, false, false, true, true, false, false);
                            break L0;
                          } else {
                            if (ks.field_e != 10) {
                              if (ks.field_e == 11) {
                                ps.a(-25246, true, true, true, true, false, true);
                                break L0;
                              } else {
                                if (ks.field_e != 12) {
                                  if (-14 == (ks.field_e ^ -1)) {
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
        int discarded$2 = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              mj.field_a = cr.field_d;
              if (param3 == -1) {
                break L1;
              } else {
                discarded$2 = no.b(-9, -128);
                break L1;
              }
            }
            L2: {
              if (255 != param1) {
                if ((param1 ^ -1) > -101) {
                  u.field_h = wb.a(-124, param2, param1);
                  break L2;
                } else {
                  if (105 < param1) {
                    u.field_h = wb.a(-124, param2, param1);
                    break L2;
                  } else {
                    var7 = args;
                    pp.a(18267, var7);
                    u.field_h = wt.a(-117, args);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (-14 >= (tn.field_b ^ -1)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                u.field_h = mf.a(stackIn_7_0 != 0, param3 ^ -42);
                pp.a(param3 ^ -18268, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("no.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    no() {
        super(9);
        ut var1 = kb.field_E[-1 + kb.field_E.length];
        String var2 = q.field_h[-1 + q.field_h.length];
        String var3 = vo.a((byte) -18, gd.field_e[9], new String[]{var2});
        this.a(var3, this.field_t, var1, -117, this.field_u);
    }

    final void a(int param0, int param1) {
        super.a(122, param1);
        if (!(!la.a(100))) {
            return;
        }
        if (param0 <= 60) {
            field_K = (String[]) null;
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
        ld stackIn_10_0 = null;
        ld stackIn_19_0 = null;
        ld stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_6_0 = null;
        ld stackOut_22_0 = null;
        ld stackOut_18_0 = null;
        ld stackOut_9_0 = null;
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
          L0: {
            var2_int = param0.length();
            if (-1 != (var2_int ^ -1)) {
              if ((var2_int ^ -1) < -64) {
                stackOut_6_0 = st.field_j;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == 134217728) {
                  var3 = 0;
                  L1: while (true) {
                    if (var3 < var2_int) {
                      L2: {
                        var4 = param0.charAt(var3);
                        if (var4 != 45) {
                          if (-1 == qs.field_V.indexOf(var4)) {
                            stackOut_22_0 = lm.field_F;
                            stackIn_23_0 = stackOut_22_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L2;
                          }
                        } else {
                          L3: {
                            if (-1 == (var3 ^ -1)) {
                              break L3;
                            } else {
                              if (var2_int + -1 == var3) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_18_0 = lm.field_F;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = (ld) null;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = ld.field_b;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("no.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_23_0;
              }
            }
          }
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
        field_K = new String[]{"Unpacking sound", "Unpacking patches", "Unpacking graphics", "Unpacking menus", "Unpacking lobby", "Unpacking 3D models", "Unpacking animations", "Initialising 3D", "Initialising game components", "Initialising menus", "Initialising HUDs", "Initialising pitch", "Initialising UI", "Initialising client", null};
        field_G = "This password contains your email address, and would be easy to guess";
        field_H = 20000000L;
        field_I = "Game full";
    }
}
