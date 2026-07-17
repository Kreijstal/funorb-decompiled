/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends f implements pl {
    private qh field_tb;
    private boolean field_vb;
    static String field_sb;
    private boolean field_wb;
    static int field_ub;

    public static void r(int param0) {
        int var1 = 70;
        field_sb = null;
    }

    final static void a(String param0, byte param1, boolean param2, String param3) {
        try {
            b.field_a = param0;
            hg.field_d = param3;
            int var4_int = -62 % ((13 - param1) / 62);
            fa.a(rj.field_g, 480, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "r.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, sl param1, byte param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ni var5 = null;
        int var6 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              ((r) this).field_wb = true;
              if (param2 <= -21) {
                break L1;
              } else {
                field_sb = null;
                break L1;
              }
            }
            L2: {
              if (!param1.field_g) {
                if (null == param1.field_a) {
                  var4_ref = param1.field_e;
                  if (param1.field_j != 248) {
                    break L2;
                  } else {
                    L3: {
                      if (param0) {
                        break L3;
                      } else {
                        cf.h(-65);
                        break L3;
                      }
                    }
                    ((r) this).field_vb = true;
                    var4_ref = hi.field_I;
                    break L2;
                  }
                } else {
                  var4_ref = rh.field_j;
                  if (null != ((r) this).field_tb) {
                    ((r) this).field_tb.a((byte) 83);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4_ref = lh.field_c;
                break L2;
              }
            }
            L4: {
              var5 = new ni((f) this, hh.field_c, var4_ref);
              if (param1.field_g) {
                if (param1.field_d) {
                  ((r) this).b((el) (Object) new s((r) this), -111);
                  return;
                } else {
                  hk discarded$2 = var5.a(-2, cl.field_d, (bb) this);
                  break L4;
                }
              } else {
                L5: {
                  if (!((r) this).field_vb) {
                    if (param1.field_j == 5) {
                      var5.a(nf.field_E, 1, 11);
                      var5.a(rj.field_e, 1, 17);
                      break L5;
                    } else {
                      var5.a(ll.field_b, 1, -1);
                      break L5;
                    }
                  } else {
                    hk discarded$3 = var5.a(-2, cl.field_d, (bb) this);
                    break L5;
                  }
                }
                if (param1.field_j == 3) {
                  var5.a(ee.field_y, 1, 7);
                  break L4;
                } else {
                  if (6 != param1.field_j) {
                    break L4;
                  } else {
                    var5.a(jc.field_c, 1, 9);
                    break L4;
                  }
                }
              }
            }
            ((r) this).b((el) (Object) var5, -36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("r.G(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param2 + 41);
        }
    }

    r(ng param0, qh param1) {
        super(param0, hh.field_c, se.field_i, false, false);
        try {
            ((r) this).field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "r.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static nd a(String param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nd stackIn_4_0 = null;
        nd stackIn_8_0 = null;
        nd stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        nd stackIn_27_0 = null;
        nd stackIn_40_0 = null;
        nd stackIn_45_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_3_0 = null;
        nd stackOut_7_0 = null;
        nd stackOut_39_0 = null;
        nd stackOut_44_0 = null;
        nd stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        nd stackOut_26_0 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var6 = Geoblox.field_C;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = pj.field_f;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = hk.field_x;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (34 != param0.charAt(0)) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var4 >= var2_int) {
                    return null;
                  } else {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        L2: {
                          if (0 == var4) {
                            break L2;
                          } else {
                            if (var4 == -1 + var2_int) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = ii.field_h;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      } else {
                        if (rd.field_w.indexOf(var5) == -1) {
                          stackOut_44_0 = ii.field_h;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      }
                    }
                    var4++;
                    continue L0;
                  }
                }
              } else {
                if (param0.charAt(var2_int + -1) != 34) {
                  stackOut_12_0 = ii.field_h;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var4 < -1 + var2_int) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L5;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_26_0 = ii.field_h;
                                stackIn_27_0 = stackOut_26_0;
                                return stackIn_27_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("r.B(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L7;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + 1 + 41);
        }
    }

    final void q(int param0) {
        this.a(true, ig.a(hi.field_I, 248, false), (byte) -57);
        if (param0 != 12086) {
            ((r) this).field_wb = false;
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        if (!(!((r) this).field_vb)) {
            b.a(true, false, false);
            return;
        }
        if (param1 != -20) {
            return;
        }
        try {
            ki.a(-112);
            ((r) this).h((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "r.Q(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean f(int param0) {
        sl var2 = null;
        if (param0 != -1) {
            field_sb = null;
        }
        if (((r) this).field_I) {
            if (!(((r) this).field_wb)) {
                var2 = n.d((byte) 93);
                if (!(var2 == null)) {
                    this.a(false, var2, (byte) -69);
                }
            }
        }
        return super.f(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
