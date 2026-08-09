/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements ch {
    static String field_e;
    private int field_j;
    private int field_b;
    private int field_h;
    static rh field_f;
    static int field_g;
    private int field_l;
    static String field_d;
    private int field_i;
    private int field_m;
    static int field_k;
    private fa field_c;
    static int[][] field_a;

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        qa stackIn_5_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        d var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 instanceof d) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (qa) (param3);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = (d) ((Object) stackIn_5_0);
                        if (var6 == null) {
                            statePc = 6;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 <= -36) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_l = -111;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        gb.e(param3.field_y + param1, param3.field_z + param4, param3.field_u, param3.field_j, this.field_h);
                        var7 = param3.field_u + -(var6.field_M * 2);
                        var8 = param1 + (param3.field_y + var6.field_M);
                        var9 = var6.field_P + param4 - -param3.field_z;
                        gb.d(var8, var9, var8 - -var7, var9, this.field_l);
                        var10 = -1 + var6.i(119);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var10 ^ -1) > -1) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        gb.f(var7 * var6.a(var10, 100) / var6.a((byte) 9) + var8, var9, this.field_b, this.field_j);
                        var10--;
                        if (var11 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var11 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == this.field_c) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_c.a(var6.field_i, var8 + var7 / 2, var6.field_P + (this.field_c.field_N + var9), this.field_i, this.field_m);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var6_ref);
                    stackIn_20_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("ib.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_20_1 = stackIn_22_1;
                    if (param3 == null) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw pf.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, fa param2, dd[] param3, dd[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, fa param14) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ri.a(param3, param12, param14, param8, param6, true, param7, param5, param2, param0, param10, rg.field_n, fb.field_c, 0, param9, 480, (dd[]) null, param4, param11, param1, cm.field_j);
            li.a(param13, (byte) -74);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ib.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_18_2 + ')');
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_46_0 = false;
        int stackIn_56_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_45_0;
        ih var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        gm var5_ref = null;
        gm var6 = null;
        String var6_ref = null;
        gm var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1 = ae.field_a;
            var2 = var1.e(false);
            if (var2 != 0) {
              if ((var2 ^ -1) == -2) {
                L1: {
                  if (null != di.field_b) {
                    break L1;
                  } else {
                    di.field_b = new qk(128);
                    gk.field_A = 0;
                    break L1;
                  }
                }
                L2: {
                  var3 = var1.h(0);
                  if (!((String) (var3)).equals("")) {
                    break L2;
                  } else {
                    var3 = null;
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1.h(0);
                  var5 = var1.h(0);
                  var6 = rg.b((byte) -59, var4_ref_String);
                  if (var6 != null) {
                    break L3;
                  } else {
                    var6 = rg.b((byte) -126, var5);
                    if (null == var6) {
                      break L3;
                    } else {
                      di.field_b.a(var6, -1, (long)uk.a(-127, (CharSequence) ((Object) var4_ref_String)).hashCode());
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != var6) {
                    break L4;
                  } else {
                    var6 = new gm();
                    di.field_b.a(var6, -1, (long)uk.a(41, (CharSequence) ((Object) var4_ref_String)).hashCode());
                    fieldTemp$0 = gk.field_A;
                    gk.field_A = gk.field_A + 1;
                    var6.field_mb = fieldTemp$0;
                    tf.field_E.a(false, var6);
                    break L4;
                  }
                }
                L5: {
                  if (null == var3) {
                    break L5;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L5;
                  }
                }
                var6.field_lb = (String) (var3);
                var6.field_jb = var4_ref_String;
                var6.c(-1);
                var7 = (gm) ((Object) tf.field_E.c((byte) 47));
                L6: while (true) {
                  L7: {
                    L8: {
                      L9: {
                        if (var7 == null) {
                          break L9;
                        } else {
                          stackOut_45_0 = hm.a(var7, var6, true);
                          stackIn_56_0 = stackOut_45_0 ? 1 : 0;
                          stackIn_46_0 = stackOut_45_0;
                          if (var8 != 0) {
                            break L8;
                          } else {
                            if (!stackIn_46_0) {
                              break L9;
                            } else {
                              var7 = (gm) ((Object) tf.field_E.b((byte) -105));
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      L10: {
                        if (var7 != null) {
                          break L10;
                        } else {
                          tf.field_E.a(false, var6);
                          if (var8 == 0) {
                            break L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                      stackIn_56_0 = 123;
                      break L8;
                    }
                    nl.a(stackIn_56_0, var7, var6);
                    break L7;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (var2 == 2) {
                  L11: {
                    if (nb.field_i != 1) {
                      break L11;
                    } else {
                      nb.field_i = 2;
                      break L11;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var2 ^ -1) == -4) {
                    L12: {
                      if ((nb.field_i ^ -1) == -3) {
                        nb.field_i = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 != var2) {
                      L13: {
                        if (param0 <= -94) {
                          break L13;
                        } else {
                          field_f = (rh) null;
                          break L13;
                        }
                      }
                      ud.a("F1: " + ak.a(true), (Throwable) null, 0);
                      k.c(-28354);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      nb.field_i = 1;
                      var3 = var1.h(0);
                      ul.field_F = ((String) (var3)).intern();
                      var4 = var1.e(false);
                      ul.a(18398, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              L14: {
                if (null != kc.field_c) {
                  break L14;
                } else {
                  kc.field_c = new qk(128);
                  ij.field_I = 0;
                  break L14;
                }
              }
              L15: {
                if (-2 != (var1.e(false) ^ -1)) {
                  stackIn_11_0 = 0;
                  break L15;
                } else {
                  stackIn_11_0 = 1;
                  break L15;
                }
              }
              L16: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1.h(0);
                if (var3_int == 0) {
                  break L16;
                } else {
                  var1.h(0);
                  break L16;
                }
              }
              L17: {
                var5_ref = vb.a(var4_ref_String, (byte) -47);
                var6_ref = var1.h(0);
                var7_ref = uk.a(-109, (CharSequence) ((Object) var4_ref_String));
                if (null == var7_ref) {
                  var7_ref = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (null != var5_ref) {
                  break L18;
                } else {
                  var5_ref = vb.a(var6_ref, (byte) 93);
                  if (var5_ref != null) {
                    kc.field_c.a(var5_ref, -1, (long)var7_ref.hashCode());
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (var5_ref != null) {
                  break L19;
                } else {
                  var5_ref = new gm();
                  kc.field_c.a(var5_ref, -1, (long)var7_ref.hashCode());
                  fieldTemp$1 = ij.field_I;
                  ij.field_I = ij.field_I + 1;
                  var5_ref.field_mb = fieldTemp$1;
                  cl.field_e.a(false, var5_ref);
                  break L19;
                }
              }
              var5_ref.field_jb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "ib.E(" + param0 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param2 == -5441) {
                break L1;
              } else {
                ib.a((java.applet.Applet) null, (java.net.URL) null, -68);
                break L1;
              }
            }
            L2: {
              var4 = null;
              if (null == lj.field_g) {
                break L2;
              } else {
                if (lj.field_g.equals(param0.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = lj.field_g;
                  break L2;
                }
              }
            }
            L3: {
              if (null == me.field_b) {
                break L3;
              } else {
                if (!me.field_b.equals(param0.getParameter("session"))) {
                  var4 = me.field_b;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_16_0 = nj.a((byte) 53, -1, (String) (var3), param1, (String) (var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = var3;

            stackIn_20_1 = new StringBuilder().append("ib.D(");

            if (param0 == null) {
              stackIn_21_0 = stackIn_20_0;
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = stackIn_20_0;
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {

              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {

              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_25_2 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 >= -1) {
            return;
        }
        try {
            field_a = (int[][]) null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ib.A(" + param0 + ')');
        }
    }

    ib(fa param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_c = param0;
            this.field_b = param5;
            this.field_h = param4;
            this.field_j = param6;
            this.field_i = param1;
            this.field_l = param3;
            this.field_m = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ib.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_e = "Start classic levels";
        field_g = 0;
        field_d = "to return to the normal view.";
        field_a = new int[][]{new int[]{0, 0, 0}, new int[]{0, 42, 42, 0, 16, 16, 16, 0}, new int[]{0, 32, 32, 32, 32, 32, 32}, new int[]{0, 32, 32, 32, 32, 32, 32, 32}, new int[]{0, 32, 40, 32, 32, 32, 32}, new int[]{16, 16, 16}, new int[]{16, 16, 16, 16}};
    }
}
