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
        int var1 = -70 / ((param0 - 27) / 48);
        field_sb = null;
    }

    final static void a(String param0, byte param1, boolean param2, String param3) {
        try {
            b.field_a = param0;
            hg.field_d = param3;
            int var4_int = -62 % ((13 - param1) / 62);
            fa.a(rj.field_g, 480, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "r.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, sl param1, byte param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ni var5 = null;
        int var6 = 0;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              this.field_wb = true;
              if (param2 <= -21) {
                break L1;
              } else {
                field_sb = (String) null;
                break L1;
              }
            }
            L2: {
              if (!param1.field_g) {
                if (null == param1.field_a) {
                  var4 = param1.field_e;
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
                    this.field_vb = true;
                    var4 = hi.field_I;
                    break L2;
                  }
                } else {
                  var4 = rh.field_j;
                  if (null != this.field_tb) {
                    this.field_tb.a((byte) 83);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4 = lh.field_c;
                break L2;
              }
            }
            L4: {
              var5 = new ni((f) (this), hh.field_c, var4);
              if (param1.field_g) {
                if (param1.field_d) {
                  this.b(new s((r) (this)), -111);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5.a(-2, cl.field_d, (bb) (this));
                  break L4;
                }
              } else {
                L5: {
                  if (!this.field_vb) {
                    if (param1.field_j == 5) {
                      var5.a(nf.field_E, 1, 11);
                      var5.a(rj.field_e, 1, 17);
                      break L5;
                    } else {
                      var5.a(ll.field_b, 1, -1);
                      break L5;
                    }
                  } else {
                    var5.a(-2, cl.field_d, (bb) (this));
                    break L5;
                  }
                }
                if (-4 == (param1.field_j ^ -1)) {
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
            this.b(var5, -36);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("r.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    r(ng param0, qh param1) {
        super(param0, hh.field_c, se.field_i, false, false);
        try {
            this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static nd a(String param0, boolean param1) {
        nd stackIn_4_0 = null;
        nd stackIn_8_0 = null;
        nd stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        nd stackIn_27_0 = null;
        nd stackIn_41_0 = null;
        nd stackIn_46_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = pj.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackIn_8_0 = hk.field_x;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (34 != param0.charAt(0)) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var2_int) {
                      if (!param1) {
                        field_sb = (String) null;
                        stackIn_52_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      L2: {
                        var5 = param0.charAt(var4);
                        if (var5 == 46) {
                          L3: {
                            if (0 == var4) {
                              break L3;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_41_0 = ii.field_h;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (0 == (rd.field_w.indexOf(var5) ^ -1)) {
                            stackIn_46_0 = ii.field_h;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L2;
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  if (-35 != (param0.charAt(var2_int + -1) ^ -1)) {
                    stackIn_13_0 = ii.field_h;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (var4 < -1 + var2_int) {
                        L5: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L6: {
                              if (var3 != 0) {
                                stackIn_22_0 = 0;
                                break L6;
                              } else {
                                stackIn_22_0 = 1;
                                break L6;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  stackIn_27_0 = ii.field_h;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("r.B(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L8;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_46_0;
                  } else {
                    return (nd) ((Object) stackIn_52_0);
                  }
                }
              }
            }
          }
        }
    }

    final void q(int param0) {
        this.a(true, ig.a(hi.field_I, 248, false), (byte) -57);
        if (param0 != 12086) {
            this.field_wb = false;
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        if (!(!this.field_vb)) {
            b.a(true, false, false);
            return;
        }
        if (param1 != -20) {
            return;
        }
        try {
            ki.a(-112);
            this.h((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "r.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        sl var2 = null;
        if (param0 != -1) {
            field_sb = (String) null;
        }
        if (this.field_I) {
            if (!(this.field_wb)) {
                var2 = n.d((byte) 93);
                if (!(var2 == null)) {
                    this.a(false, var2, (byte) -69);
                }
            }
        }
        return super.f(-1);
    }

    static {
        field_sb = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
