/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends cb {
    static r field_k;
    static int field_n;
    static int field_o;
    private String field_l;
    private jg field_j;
    static String field_i;
    private boolean field_m;

    final static boolean e(boolean param0) {
        if (!param0) {
          if (!kj.a(param0)) {
            if (hc.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          od.a(16, -41);
          if (!kj.a(param0)) {
            if (hc.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void f(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 4) {
            od.a(-85, -61);
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_j.a(param1, 5) != fg.field_d) {
              var3_int = 71 / ((param0 - 49) / 56);
              if (this.a(param1, 5) != fg.field_d) {
                stackIn_7_0 = c.field_b;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = dl.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_j.a((byte) 122, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("od.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    od(ui param0, ui param1) {
        super(param0);
        this.field_m = false;
        this.field_l = "";
        try {
            this.field_j = new jg(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ag a(String param0, int param1) {
        jf var3 = null;
        RuntimeException var3_ref = null;
        ag stackIn_3_0 = null;
        ag stackIn_6_0 = null;
        ag stackIn_11_0 = null;
        ag stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_j.a(param0, param1 + 0) == fg.field_d) {
              stackIn_3_0 = fg.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 5) {
                L1: {
                  if (!param0.equals(this.field_l)) {
                    var3 = l.a(param0, (byte) -128);
                    if (var3.a(0)) {
                      this.field_l = param0;
                      this.field_m = var3.b(-118);
                      break L1;
                    } else {
                      stackIn_11_0 = bm.field_o;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (this.field_m) {
                    stackIn_16_0 = sc.field_a;
                    break L2;
                  } else {
                    stackIn_16_0 = fg.field_d;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_6_0 = (ag) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("od.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) != -36) {
                if (36 == param1) {
                  L2: {
                    if (wi.field_v == null) {
                      break L2;
                    } else {
                      if (!wi.field_v.k()) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  wi.field_v = rc.b(re.field_a[param1], 100, param2, param0);
                  mg.a(1963987425, wi.field_v);
                  break L1;
                } else {
                  if (param1 != 42) {
                    if (46 != param1) {
                      if ((param1 ^ -1) == -48) {
                        var6 = 4;
                        var4_int = var6;
                        L3: while (true) {
                          if (-1 < (var6 ^ -1)) {
                            break L1;
                          } else {
                            L4: {
                              if (null == si.field_b[var6]) {
                                break L4;
                              } else {
                                if (!si.field_b[var6].k()) {
                                  var6--;
                                  continue L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            si.field_b[var6] = rc.b(re.field_a[param1], 100, param2, param0);
                            mg.a(1963987425, si.field_b[var6]);
                            break L1;
                          }
                        }
                      } else {
                        ii.a(re.field_a[param1], false);
                        break L1;
                      }
                    } else {
                      var4_int = 4;
                      L5: while (true) {
                        if ((var4_int ^ -1) > -1) {
                          break L1;
                        } else {
                          L6: {
                            if (mh.field_b[var4_int] == null) {
                              break L6;
                            } else {
                              if (!mh.field_b[var4_int].k()) {
                                var4_int--;
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          mh.field_b[var4_int] = rc.b(re.field_a[param1], 100, param2, param0);
                          mg.a(param3 + 1963987421, mh.field_b[var4_int]);
                          break L1;
                        }
                      }
                    }
                  } else {
                    L7: {
                      if (df.field_a == null) {
                        break L7;
                      } else {
                        if (!df.field_a.k()) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L7;
                        }
                      }
                    }
                    df.field_a = rc.b(re.field_a[param1], 100, param2, param0);
                    mg.a(1963987425, df.field_a);
                    break L1;
                  }
                }
              } else {
                L8: {
                  if (null == qg.field_b) {
                    break L8;
                  } else {
                    if (qg.field_b.k()) {
                      break L8;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                qg.field_b = rc.b(re.field_a[param1], 100, param2, param0);
                mg.a(param3 + 1963987421, qg.field_b);
                break L1;
              }
            }
            if (param3 == 4) {
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              od.a(-80, -28, -12, -111);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "od.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        aa.field_f = oi.field_J[param1];
        ge.field_d = kd.field_k[param1];
        ic.field_g = ra.field_e[param1];
        if (param0 < 77) {
            field_i = (String) null;
        }
    }

    static {
        field_n = 640;
        field_i = "       ";
        field_o = 250;
        field_k = new r();
    }
}
