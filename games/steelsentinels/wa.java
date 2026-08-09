/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends cn {
    private ke field_q;
    static int field_p;
    static String field_o;
    private ke[] field_r;

    final void a(wk param0, byte param1) {
        ke[] var3 = null;
        int var4 = 0;
        ke var5 = null;
        int var6 = 0;
        ke[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 == 88) {
              var7 = this.field_r;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_a = param0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("wa.EA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(cm param0, int param1, cm param2) {
        java.awt.Canvas var3 = null;
        try {
            var3 = gl.a(false);
            if (!(var3 != null)) {
                var3 = new java.awt.Canvas();
            }
            kc.field_x = new wk[5][];
            if (param0 != null) {
                kc.field_x[0] = new wk[7];
                kc.field_x[0][0] = (wk) ((Object) new ek(param0.a("wz_foreground_01.png", -742, "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[0][1] = (wk) ((Object) new ek(param0.a("wz_foreground_02.png", -742, "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[0][2] = (wk) ((Object) new ek(param0.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[0][3] = (wk) ((Object) new ek(param0.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[0][4] = (wk) ((Object) new ek(param0.a("wz_foreground_05.png", -742, "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[0][5] = (wk) ((Object) new ek(param0.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[0][6] = (wk) ((Object) new ek(param0.a("wz_foreground_07.png", bi.a(param1, -744), "warzone/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[1] = new wk[6];
                kc.field_x[1][0] = (wk) ((Object) new ek(param0.a("sb_foreground_01.png", param1 + -744, "fleetbattle/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[1][1] = (wk) ((Object) new ek(param0.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[1][2] = (wk) ((Object) new ek(param0.a("sb_foreground_03.png", bi.a(param1, -744), "fleetbattle/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[1][3] = (wk) ((Object) new ek(param0.a("sb_foreground_04.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[1][4] = (wk) ((Object) new ek(param0.a("sb_foreground_05.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) var3)));
                kc.field_x[1][5] = (wk) ((Object) new ek(param0.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) var3)));
            }
            kc.field_x[2] = new wk[6];
            kc.field_x[2][0] = rl.a(param2, "basic", "ct_foreground_01", false);
            kc.field_x[2][1] = rl.a(param2, "basic", "ct_foreground_02", false);
            kc.field_x[2][2] = rl.a(param2, "basic", "ct_foreground_03", false);
            kc.field_x[2][3] = rl.a(param2, "basic", "ct_foreground_04", false);
            kc.field_x[param1][4] = rl.a(param2, "basic", "ct_foreground_05", false);
            kc.field_x[2][5] = rl.a(param2, "basic", "ct_foreground_06", false);
            kc.field_x[4] = new wk[2];
            kc.field_x[4][0] = rl.a(param2, "basic", "starcruiser_base", false);
            kc.field_x[4][1] = rl.a(param2, "basic", "starcruiser_top", false);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wa.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != -21121) {
            wa.a((byte) 56);
        }
        field_o = null;
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        lh stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ke var7 = null;
        ke var9 = null;
        oa var10 = null;
        ke var11 = null;
        ke var12 = null;
        ke var13 = null;
        ke var14 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof oa)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (lh) (param1);
                break L1;
              }
            }
            L2: {
              var10 = (oa) ((Object) stackIn_3_0);
              fe.a(param1.field_o + param0, param1.field_z + param4, -111, param1.field_x + param0 - -param1.field_o, param1.field_E + param4 - -param1.field_z);
              if (var10 == null) {
                break L2;
              } else {
                param3 = param3 & var10.field_K;
                break L2;
              }
            }
            L3: {
              var7 = this.field_r[0];
              this.field_q.a((byte) -107);
              var7.a(this.field_q, (wa) (this), (byte) -91, param4, param1, param0);
              if (var10 != null) {
                L4: {
                  if (!var10.field_T) {
                    break L4;
                  } else {
                    var11 = this.field_r[1];
                    if (var11 == null) {
                      break L4;
                    } else {
                      var11.a(this.field_q, (wa) (this), (byte) -117, param4, param1, param0);
                      break L4;
                    }
                  }
                }
                if (var10.field_C) {
                  L5: {
                    var12 = this.field_r[3];
                    if (var10.field_w == 0) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(this.field_q, (wa) (this), (byte) -116, param4, param1, param0);
                        break L3;
                      }
                    }
                  }
                  var9 = this.field_r[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(this.field_q, (wa) (this), (byte) -96, param4, param1, param0);
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (!param1.d(0)) {
                break L6;
              } else {
                var13 = this.field_r[5];
                if (var13 != null) {
                  var13.a(this.field_q, (wa) (this), (byte) -122, param4, param1, param0);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (!param3) {
                var14 = this.field_r[4];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(this.field_q, (wa) (this), (byte) -125, param4, param1, param0);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            if (param2 == -30) {
              this.field_q.a(param0, param1, param4, (wa) (this), false);
              tk.f((byte) 127);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6);

            stackIn_31_1 = new StringBuilder().append("wa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public wa() {
        this.field_r = new ke[6];
        this.field_q = new ke();
        ke dupTemp$0 = new ke();
        this.field_r[0] = dupTemp$0;
        ke var1 = dupTemp$0;
        var1.a((byte) -107);
    }

    final static boolean b(byte param0) {
        if (param0 > -9) {
            wa.b(54);
        }
        return qm.a((byte) -31, bk.field_U, ti.field_p);
    }

    final static String a(byte param0) {
        if (null == g.field_l) {
            return "";
        }
        if (param0 != -43) {
            wa.b((byte) 117);
        }
        return g.field_l;
    }

    final static boolean a(byte param0, int param1, int param2, cm param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 30) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var5 = param3.a(param2, (byte) 92, param1);
            var4 = var5;
            if (var5 != null) {
              ve.a(16, var5);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(wk[] param0, boolean param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (this.field_r[var4_int] == null) {
                this.field_r[var4_int] = new ke();
            }
            if (param1) {
                field_o = (String) null;
            }
            this.field_r[param2].field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wa.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    wa(wa param0, boolean param1) {
        this();
        try {
            param0.a((wa) (this), 65535, param1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ke a(int param0, int param1) {
        if (param0 != -25088) {
            this.field_q = (ke) null;
        }
        ke dupTemp$0 = new ke();
        this.field_r[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static void b(int param0) {
        g.field_l = rf.field_d.h(1);
        CharSequence var2 = (CharSequence) ((Object) g.field_l);
        ng.field_r = ui.a(1, var2);
        if (param0 > -47) {
            wa.b(-63);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = param0 >> -981678896;
        if (param2 != -27) {
            wa.c(60);
        }
        int var4 = 65535 & param0;
        int var5 = param1 >> -2085649968;
        int var6 = 65535 & param1;
        return param1 * var3 + (var4 * var5 + (var4 * var6 >> 70427056));
    }

    private final void a(wa param0, int param1, boolean param2) {
        ke dupTemp$2 = null;
        int var4_int = 0;
        ke var5 = null;
        ke var6 = null;
        int var7 = 0;
        ke stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ke stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ke stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 == 65535) {
              L1: {
                super.a(param0, -3);
                if (!param2) {
                  ii.a(this.field_r, 0, param0.field_r, 0, 6);
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    if ((var4_int ^ -1) <= -7) {
                      break L1;
                    } else {
                      L3: {
                        var5 = this.field_r[var4_int];
                        if (var5 != null) {
                          L4: {
                            var6 = param0.field_r[var4_int];
                            stackIn_10_0 = (ke) (var5);

                            stackIn_10_1 = -123;

                            if (var6 == null) {
                              dupTemp$2 = new ke();
                              param0.field_r[var4_int] = dupTemp$2;
                              stackIn_11_0 = (ke) ((Object) stackIn_10_0);
                              stackIn_11_1 = stackIn_10_1;
                              stackIn_11_2 = (ke) (dupTemp$2);
                              break L4;
                            } else {
                              stackIn_11_0 = (ke) ((Object) stackIn_10_0);
                              stackIn_11_1 = stackIn_10_1;
                              stackIn_11_2 = (ke) (var6);
                              break L4;
                            }
                          }
                          ((ke) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2);
                          break L3;
                        } else {
                          param0.field_r[var4_int] = null;
                          break L3;
                        }
                      }
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("wa.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, wk[] param1) {
        ke[] var3 = null;
        int var4 = 0;
        ke var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var3 = this.field_r;
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                this.field_r = (ke[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var5.field_h = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("wa.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static fm b(int param0, int param1) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        fm[] var5 = gb.b(false);
        fm[] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            if (!(param0 != var5[var3].field_c)) {
                return var5[var3];
            }
        }
        var3 = 71 % ((-1 - param1) / 61);
        return null;
    }

    static {
        field_o = "MODULES:";
    }
}
