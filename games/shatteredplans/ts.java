/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ts extends kg {
    static String[] field_K;
    static bi[] field_L;
    private pf field_D;
    private ql field_I;
    private String[] field_J;
    static String field_E;
    static String field_H;
    static kf field_G;
    static String field_F;

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        pj var5 = (pj) ((Object) this.field_p);
        ql var6 = this.field_I;
        if (var6 != null) {
            var7 = var5.b(0, (vg) (this), param3);
            var8 = var5.a(param2, (vg) (this), 100);
            do {
                dd.a(2 + var6.field_l, param1 ^ -11858, 2 + var6.field_j, var6.field_k + var7 + -2, var8 + (var6.field_m - 2));
                var6 = var6.field_h;
            } while (var6 != null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_J) {
                  break L2;
                } else {
                  if (this.field_J.length > param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param0];
                var8 = var7;
                var4 = var8;
                if (null != this.field_J) {
                  var5 = 0;
                  L4: while (true) {
                    if (this.field_J.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = this.field_J[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_J = var8;
              break L1;
            }
            this.field_J[param0] = param2;
            if (param1) {
              break L0;
            } else {
              this.e(false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4_ref);
            stackOut_13_1 = new StringBuilder().append("ts.L(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    ts(String param0, iq param1) {
        super(param0, (ko) null);
        this.field_I = null;
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ts.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 122, param3, param4);
        this.e(false);
        if (param2 < 99) {
            this.a(23, -42, -29, 82);
        }
    }

    boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 125 / ((61 - param0) / 59);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ts.CA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public static void a(byte param0) {
        field_F = null;
        field_E = null;
        int var1 = -63 / ((-15 - param0) / 60);
        field_L = null;
        field_K = null;
        field_H = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            long dupTemp$2 = 0L;
            IOException var2 = null;
            sl var4 = null;
            sl var5 = null;
            int stackIn_9_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_7_0 = 0;
            L0: {
              if (da.field_e != null) {
                break L0;
              } else {
                da.field_e = nr.field_l.a(65535, of.field_f, mk.field_c);
                break L0;
              }
            }
            if (-1 == (da.field_e.field_d ^ -1)) {
              return false;
            } else {
              dupTemp$2 = pr.a(14274);
              mj.field_Pb = dupTemp$2;
              pf.field_e = dupTemp$2;
              if (param1 != (da.field_e.field_d ^ -1)) {
                cs.field_j = oa.field_a;
                da.field_e = null;
                return true;
              } else {
                try {
                  L1: {
                    L2: {
                      wg.field_f = new ke((java.net.Socket) (da.field_e.field_e), nr.field_l);
                      var4 = sa.field_a;
                      var5 = var4;
                      js.field_f.field_j = 0;
                      if (param0) {
                        stackOut_8_0 = -2;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = -1;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    rm.field_e = stackIn_9_0;
                    tp.field_g = stackIn_9_0;
                    kp.field_n = stackIn_9_0;
                    cs.field_j = j.field_r;
                    var5.field_j = 0;
                    hq.a(sp.field_g, ee.field_o, js.field_f, (byte) 20, uk.field_a);
                    d.a(-1, (byte) 82);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  cs.field_j = oa.field_a;
                  da.field_e = null;
                  return true;
                }
                da.field_e = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  var3 = 96 / ((param1 - -19) / 53);
                  param0.getAppletContext().showDocument(jg.a(param0, false, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) (var2_ref2);
                stackOut_4_1 = new StringBuilder().append("ts.E(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
                  stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param1, ((pj) ((Object) this.field_p)).a(true, (vg) (this)), (byte) 100, param0, param3);
        if (param2 != 57) {
            field_E = (String) null;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ui.field_m == 0) {
          gd.a(-114);
          if (param0 != 6493) {
            return;
          } else {
            L0: {
              if ((bj.field_L ^ -1) > -51) {
                us.a(0, bj.field_L);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              qn.a((byte) -120);
              var1 = tk.field_C.c(np.field_d) + 20;
              if (var1 >= 80) {
                break L1;
              } else {
                var1 = 80;
                break L1;
              }
            }
            nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
            return;
          }
        } else {
          if ((ui.field_m ^ -1) == -2) {
            hd.a(param0 + -6373);
            if (param0 != 6493) {
              return;
            } else {
              L2: {
                if ((bj.field_L ^ -1) > -51) {
                  us.a(0, bj.field_L);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                qn.a((byte) -120);
                var1 = tk.field_C.c(np.field_d) + 20;
                if (var1 >= 80) {
                  break L3;
                } else {
                  var1 = 80;
                  break L3;
                }
              }
              nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
              return;
            }
          } else {
            if (2 != ui.field_m) {
              if (ui.field_m == 3) {
                pa.c(8421504);
                if (param0 != 6493) {
                  return;
                } else {
                  L4: {
                    if ((bj.field_L ^ -1) > -51) {
                      us.a(0, bj.field_L);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    qn.a((byte) -120);
                    var1 = tk.field_C.c(np.field_d) + 20;
                    if (var1 >= 80) {
                      break L5;
                    } else {
                      var1 = 80;
                      break L5;
                    }
                  }
                  nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                  return;
                }
              } else {
                if (4 == ui.field_m) {
                  eb.a(param0 + -6173);
                  if (param0 != 6493) {
                    return;
                  } else {
                    L6: {
                      if ((bj.field_L ^ -1) > -51) {
                        us.a(0, bj.field_L);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      qn.a((byte) -120);
                      var1 = tk.field_C.c(np.field_d) + 20;
                      if (var1 >= 80) {
                        break L7;
                      } else {
                        var1 = 80;
                        break L7;
                      }
                    }
                    nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                    return;
                  }
                } else {
                  if (ui.field_m == 5) {
                    vi.c(param0 ^ 6333);
                    if (param0 != 6493) {
                      return;
                    } else {
                      L8: {
                        if ((bj.field_L ^ -1) > -51) {
                          us.a(0, bj.field_L);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        qn.a((byte) -120);
                        var1 = tk.field_C.c(np.field_d) + 20;
                        if (var1 >= 80) {
                          break L9;
                        } else {
                          var1 = 80;
                          break L9;
                        }
                      }
                      nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                      return;
                    }
                  } else {
                    if (param0 != 6493) {
                      return;
                    } else {
                      L10: {
                        if ((bj.field_L ^ -1) > -51) {
                          us.a(0, bj.field_L);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        qn.a((byte) -120);
                        var1 = tk.field_C.c(np.field_d) + 20;
                        if (var1 >= 80) {
                          break L11;
                        } else {
                          var1 = 80;
                          break L11;
                        }
                      }
                      nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                      return;
                    }
                  }
                }
              }
            } else {
              wj.a(128);
              if (param0 != 6493) {
                return;
              } else {
                L12: {
                  if ((bj.field_L ^ -1) > -51) {
                    us.a(0, bj.field_L);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  qn.a((byte) -120);
                  var1 = tk.field_C.c(np.field_d) + 20;
                  if (var1 >= 80) {
                    break L13;
                  } else {
                    var1 = 80;
                    break L13;
                  }
                }
                nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                return;
              }
            }
          }
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        String var18 = null;
        qo var19 = null;
        ha var20 = null;
        ql var21 = null;
        Object var22 = null;
        String var23 = null;
        qo var24 = null;
        ha var25 = null;
        ql var26 = null;
        pj var27 = null;
        pj var28 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var17 = null;
        var22 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_D = new pf();
        if (param0) {
          field_L = (bi[]) null;
          var2 = 0;
          var28 = (pj) ((Object) this.field_p);
          var19 = var28.a((vg) (this), true);
          L0: while (true) {
            var5 = this.field_s.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = this.field_s.indexOf(">", var5);
              var18 = this.field_s.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var18);
              var2 = this.field_s.indexOf("</hotspot>", var5);
              var8 = var19.a((byte) 87, var5);
              var9 = var19.a((byte) 103, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var20 = var19.field_d[var11];
                    if (var8 == var11) {
                      stackOut_26_0 = var19.a(true, var5);
                      stackIn_27_0 = stackOut_26_0;
                      break L2;
                    } else {
                      stackOut_25_0 = var20.field_b[0];
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_27_0;
                    if (var11 == var9) {
                      stackOut_31_0 = var19.a(true, var2);
                      stackIn_32_0 = stackOut_31_0;
                      break L3;
                    } else {
                      if (var20 != null) {
                        stackOut_30_0 = var20.field_b[var20.field_b.length - 1];
                        stackIn_32_0 = stackOut_30_0;
                        break L3;
                      } else {
                        stackOut_29_0 = 0;
                        stackIn_32_0 = stackOut_29_0;
                        break L3;
                      }
                    }
                  }
                  var14 = stackIn_32_0;
                  var21 = new ql(var7, var13, var20.field_e, var14 - var13, Math.max(var28.a(false), -var20.field_e + var20.field_c));
                  if (var10 == null) {
                    var10 = var21;
                    this.field_D.a((byte) -113, var21);
                    var11++;
                    continue L1;
                  } else {
                    ((ql) (var10)).field_h = var21;
                    var10 = var21;
                    this.field_D.a((byte) -113, var21);
                    var11++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          var2 = 0;
          var27 = (pj) ((Object) this.field_p);
          var24 = var27.a((vg) (this), true);
          L4: while (true) {
            var5 = this.field_s.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = this.field_s.indexOf(">", var5);
              var23 = this.field_s.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var23);
              var2 = this.field_s.indexOf("</hotspot>", var5);
              var8 = var24.a((byte) 87, var5);
              var9 = var24.a((byte) 103, var2);
              var10 = null;
              var11 = var8;
              L5: while (true) {
                if (var9 < var11) {
                  continue L4;
                } else {
                  L6: {
                    var25 = var24.field_d[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var24.a(true, var5);
                      stackIn_9_0 = stackOut_8_0;
                      break L6;
                    } else {
                      stackOut_7_0 = var25.field_b[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L6;
                    }
                  }
                  L7: {
                    var13 = stackIn_9_0;
                    if (var11 == var9) {
                      stackOut_13_0 = var24.a(true, var2);
                      stackIn_14_0 = stackOut_13_0;
                      break L7;
                    } else {
                      if (var25 != null) {
                        stackOut_12_0 = var25.field_b[var25.field_b.length - 1];
                        stackIn_14_0 = stackOut_12_0;
                        break L7;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L7;
                      }
                    }
                  }
                  var14 = stackIn_14_0;
                  var26 = new ql(var7, var13, var25.field_e, var14 - var13, Math.max(var27.a(false), -var25.field_e + var25.field_c));
                  if (var10 == null) {
                    var10 = var26;
                    this.field_D.a((byte) -113, var26);
                    var11++;
                    continue L5;
                  } else {
                    ((ql) (var10)).field_h = var26;
                    var10 = var26;
                    this.field_D.a((byte) -113, var26);
                    var11++;
                    continue L5;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        param0 += 30;
        if (param1 != -1) {
          return;
        } else {
          param2 += 30;
          ga.a(param2, -param2 + 480 >> 1464963841, -param0 + 640 >> 1821600033, (byte) -70, param0);
          return;
        }
    }

    private final ql b(int param0, int param1, byte param2) {
        ql var4 = null;
        ql var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = (ql) ((Object) this.field_D.d(0));
        L0: while (true) {
          if (var4 == null) {
            if (param2 == -66) {
              return null;
            } else {
              this.field_J = (String[]) null;
              return null;
            }
          } else {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (ql) ((Object) this.field_D.a((byte) -71));
                continue L0;
              } else {
                L2: {
                  if (var5.field_k > param0) {
                    break L2;
                  } else {
                    if (var5.field_m > param1) {
                      break L2;
                    } else {
                      if (var5.field_k + var5.field_j <= param0) {
                        break L2;
                      } else {
                        if (var5.field_l + var5.field_m >= param1) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_h;
                continue L1;
              }
            }
          }
        }
    }

    String c(boolean param0) {
        if (null != this.field_I) {
          if (this.field_J != null) {
            if (this.field_J.length > this.field_I.field_i) {
              if (!param0) {
                field_F = (String) null;
                return this.field_J[this.field_I.field_i];
              } else {
                return this.field_J[this.field_I.field_i];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_I = null;
              if (!this.field_k) {
                break L1;
              } else {
                var5_int = -this.field_m + (-param0 + pd.field_k);
                var6 = bb.field_b - param1 + -this.field_q;
                this.field_I = this.b(var5_int, var6, (byte) -66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ts.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        ql var7 = null;
        super.a(param0, param1, param2, param3);
        var5 = -this.field_m + param1;
        var6 = -this.field_q + param2;
        var7 = this.b(var5, var6, (byte) -66);
        if (var7 != null) {
          if (this.field_u == null) {
            return;
          } else {
            ((op) ((Object) this.field_u)).a(param0, var7.field_i, 2, (ts) (this));
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_K = new String[16];
        field_E = "Retry";
        field_H = "Show lobby chat from my friends";
        field_F = "Add <%0> to ignore list";
        field_G = null;
    }
}
