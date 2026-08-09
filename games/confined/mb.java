/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb extends ka {
    private double field_R;
    static String field_H;
    private double field_Q;

    final static boolean a(boolean param0, byte param1) {
        try {
            hb var4 = null;
            hb var5 = null;
            if (param1 != 17) {
                return false;
            }
            if (null == mg.field_a) {
                mg.field_a = ld.field_k.a(nd.field_s, -90, af.field_ab);
            }
            if (!(-1 != (mg.field_a.field_g ^ -1))) {
                return false;
            }
            long dupTemp$0 = ri.a(param1 + -20);
            pc.field_a = dupTemp$0;
            m.field_b = dupTemp$0;
            if (-2 != (mg.field_a.field_g ^ -1)) {
                lk.field_d = i.field_q;
            } else {
                try {
                    kl.field_G = new vd((java.net.Socket) (mg.field_a.field_f), ld.field_k);
                    var4 = e.field_c;
                    var5 = var4;
                    vh.field_a.field_n = 0;
                    kk.field_c = !param0 ? -1 : -2;
                    pk.field_c = !param0 ? -1 : -2;
                    qm.field_y = !param0 ? -1 : -2;
                    lk.field_d = si.field_g;
                    var5.field_n = 0;
                    ql.a(kk.field_b, vh.field_a, rg.field_M, (byte) 40, qa.field_c);
                    tb.a(-1, 116);
                } catch (IOException iOException) {
                    lk.field_d = i.field_q;
                }
            }
            mg.field_a = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, Throwable param2) {
        try {
            df stackIn_14_0;
            int stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            java.net.URL stackIn_14_4;
            StringBuilder stackIn_14_5;
            df stackIn_15_0;
            int stackIn_15_1;
            java.net.URL stackIn_15_2;
            java.net.URL stackIn_15_3;
            java.net.URL stackIn_15_4;
            StringBuilder stackIn_15_5;
            String stackIn_15_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            bc var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            df var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            var6 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param2 == null) {
                    break L1;
                  } else {
                    var3 = ag.a(-19080, param2);
                    break L1;
                  }
                }
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param0;
                    break L2;
                  }
                }
                L4: {
                  ej.a(0, var3);
                  var8 = pi.a(":", "%3a", 22232, var3);
                  var9 = pi.a("@", "%40", 22232, var8);
                  var10 = pi.a("&", "%26", 22232, var9);
                  var11 = pi.a("#", "%23", 22232, var10);
                  if (param1) {
                    break L4;
                  } else {
                    var7 = (df) null;
                    mb.a((Object) null, 13, (df) null);
                    break L4;
                  }
                }
                if (kc.field_k == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackIn_14_0 = hh.field_c;

                    stackIn_14_1 = 0;

                    stackIn_14_2 = null;

                    stackIn_14_3 = null;

                    stackIn_14_4 = kc.field_k.getCodeBase();

                    stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(uh.field_f).append("&u=");

                    if (kc.field_f == null) {
                      stackIn_15_0 = (df) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = null;
                      stackIn_15_3 = null;
                      stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackIn_15_6 = "" + i.field_p;
                      break L5;
                    } else {
                      stackIn_15_0 = (df) ((Object) stackIn_14_0);
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = null;
                      stackIn_15_3 = null;
                      stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackIn_15_6 = kc.field_f;
                      break L5;
                    }
                  }
                  var4 = ((df) (Object) stackIn_15_0).a(stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + df.field_b + "&v2=" + df.field_s + "&e=" + var11));
                  L6: while (true) {
                    if (var4.field_g != 0) {
                      L7: {
                        if (var4.field_g != 1) {
                          break L7;
                        } else {
                          var5 = (DataInputStream) (var4.field_f);
                          var5.read();
                          var5.close();
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      jd.a(1, 1L);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ah param1) {
        try {
            this.a(true, (ee) (param1));
            int var3_int = -24 / ((14 - param0) / 53);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mb(pm param0, double param1, double param2, double param3, bi param4) {
        super(param0, param1, param4);
        try {
            this.field_Q = param2 * this.field_C;
            this.field_R = this.field_C * param3;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.a(-23154, (mb) (this));
              if (param1 < -81) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mb.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(Object param0, int param1, df param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (null == param2.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if ((var3_int ^ -1) <= -51) {
                    break L2;
                  } else {
                    if (null == param2.field_k.peekEvent()) {
                      break L2;
                    } else {
                      jd.a(1, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param1 == 1001) {
                        break L4;
                      } else {
                        field_H = (String) null;
                        break L4;
                      }
                    }
                    L5: {
                      if (param0 == null) {
                        break L5;
                      } else {
                        param2.field_k.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
                        break L5;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("mb.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, hf param1) {
        RuntimeException runtimeException = null;
        il var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(true, (ee) (param1));
              if (param0 <= -29) {
                break L1;
              } else {
                var4 = (il) null;
                this.a(true, (il) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        il var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -23154) {
                break L1;
              } else {
                var4 = (il) null;
                this.a(false, (il) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        try {
            var3_double = -this.field_E + param1.field_E;
            var5 = -this.field_t + param1.field_t;
            var7 = -this.field_D + param1.field_D;
            if (!param0) {
                il var17 = (il) null;
                this.a(true, (il) null);
            }
            var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3_double * var3_double));
            var11 = -var9 + (this.field_C + param1.field_C);
            var13 = (1.0 - this.field_K / (double)uc.field_db.length) * this.field_Q;
            if (param1.field_C > var11) {
                var13 = var13 * (var11 / param1.field_C);
            }
            param1.a(14170, false, var13);
            var15 = var9 >= 0.001 ? 1.0 / var9 : 1000.0;
            var3_double = var3_double * var15;
            var7 = var7 * var15;
            var11 = var11 * (this.field_R / param1.field_M);
            var5 = var5 * var15;
            param1.field_L = param1.field_L + var7 * var11;
            param1.field_K = param1.field_K + var3_double * var11;
            param1.field_G = param1.field_G + var5 * var11;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            return;
        }
        try {
            this.a(true, (ee) (param1));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_H = null;
        if (param0 != 1072) {
            Throwable var2 = (Throwable) null;
            mb.a((String) null, true, (Throwable) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, byte param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        var19 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param8 == 112) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            L2: {
              if (0 > param0) {
                break L2;
              } else {
                if (ti.field_g <= param3) {
                  break L2;
                } else {
                  L3: {
                    if (param4 >= 0) {
                      break L3;
                    } else {
                      if (0 <= param7) {
                        break L3;
                      } else {
                        if ((param6 ^ -1) > -1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param4 < ti.field_e) {
                      break L4;
                    } else {
                      if (ti.field_e > param7) {
                        break L4;
                      } else {
                        if (param6 >= ti.field_e) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    var14 = -param3 + param0;
                    if (param3 == param2) {
                      L6: {
                        if (param3 == param0) {
                          var12 = 0;
                          var9_int = param4 << 2024436112;
                          var11 = 0;
                          var10 = param7 << 1478089136;
                          break L6;
                        } else {
                          var15 = -param2 + param0;
                          if (param7 > param4) {
                            var12 = (param6 - param7 << 1808336208) / var15;
                            var10 = param7 << -1629485552;
                            var9_int = param4 << 745981552;
                            var11 = (-param4 + param6 << 1641842160) / var14;
                            break L6;
                          } else {
                            var10 = param4 << -344652336;
                            var12 = (param6 + -param4 << 1369427664) / var14;
                            var11 = (param6 + -param7 << 1034916336) / var15;
                            var9_int = param7 << -1554678064;
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      if ((param3 ^ -1) <= -1) {
                        break L5;
                      } else {
                        param3 = Math.min(-param3, param2 + -param3);
                        var9_int = var9_int + param3 * var11;
                        var10 = var10 + var12 * param3;
                        param3 = 0;
                        break L5;
                      }
                    } else {
                      L7: {
                        var10 = param4 << -2035249872;
                        var9_int = param4 << -2035249872;
                        var15 = param2 + -param3;
                        var12 = (param6 - param4 << -56263472) / var14;
                        var11 = (-param4 + param7 << 1370294576) / var15;
                        if (var12 <= var11) {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if ((param3 ^ -1) <= -1) {
                            break L9;
                          } else {
                            if (param2 < 0) {
                              param3 = param2 + -param3;
                              var9_int = var9_int + param3 * var11;
                              var10 = var10 + param3 * var12;
                              param3 = param2;
                              break L8;
                            } else {
                              param3 = -param3;
                              var9_int = var9_int + var11 * param3;
                              var10 = var10 + param3 * var12;
                              param3 = 0;
                              break L9;
                            }
                          }
                        }
                        var16 = ti.field_l[param3];
                        L10: while (true) {
                          if (param3 >= param2) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 941504016;
                              if (var17 >= ti.field_e) {
                                break L11;
                              } else {
                                var18 = (var10 >> -490799408) - (var9_int >> 882978128);
                                if (var18 == 0) {
                                  if ((var17 ^ -1) > -1) {
                                    break L11;
                                  } else {
                                    if (var17 >= ti.field_e) {
                                      break L11;
                                    } else {
                                      sm.a(param5, param1, var16 + var17, var18, 87);
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (var17 + var18 >= ti.field_e) {
                                      var18 = ti.field_e - (var17 + 1);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (0 > var17) {
                                    sm.a(param5, param1, var16, var18 + var17, 87);
                                    break L11;
                                  } else {
                                    sm.a(param5, param1, var17 - -var16, var18, 87);
                                    break L11;
                                  }
                                }
                              }
                            }
                            param3++;
                            if (ti.field_g > param3) {
                              var16 = var16 + fn.field_g;
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              continue L10;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = -param2 + param0;
                      if (var16 != 0) {
                        L13: {
                          var17 = param6 << -540023408;
                          if (var13 != 0) {
                            var10 = param7 << 1291341584;
                            break L13;
                          } else {
                            var9_int = param7 << 111756336;
                            break L13;
                          }
                        }
                        var11 = (var17 - var9_int) / var16;
                        var12 = (var17 + -var10) / var16;
                        break L5;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (0 > param3) {
                      param3 = -param3;
                      var10 = var10 + param3 * var12;
                      var9_int = var9_int + var11 * param3;
                      param3 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var15 = ti.field_l[param3];
                  L15: while (true) {
                    if (param0 <= param3) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> -1855143088;
                        if (var16 < ti.field_e) {
                          var17 = (var10 >> -424644816) - (var9_int >> -237114160);
                          if (0 == var17) {
                            if (0 > var16) {
                              break L16;
                            } else {
                              if (ti.field_e <= var16) {
                                break L16;
                              } else {
                                sm.a(param5, param1, var15 + var16, var17, 87);
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (ti.field_e <= var17 + var16) {
                                var17 = ti.field_e - var16 - 1;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (-1 < (var16 ^ -1)) {
                              sm.a(param5, param1, var15, var17 - -var16, 87);
                              break L16;
                            } else {
                              sm.a(param5, param1, var16 - -var15, var17, param8 + -25);
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      param3++;
                      if (param3 < ti.field_g) {
                        var15 = var15 + fn.field_g;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L15;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var9);

            stackIn_77_1 = new StringBuilder().append("mb.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L18;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L18;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    final void a(cl param0, byte param1) {
        try {
            this.a(true, (ee) (param0));
            int var3_int = 66 % ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean g(byte param0) {
        if (param0 <= 64) {
            return true;
        }
        return true;
    }

    final void a(boolean param0, il param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_R = 0.5049676490090665;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mb.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_H = "<col=FFFFFF>Shield:</col> this indispensable item creates a powerful defensive force field around your ship. Look out for these when your shield is low or lost. Without your shield, it only takes one hit to kill you!";
    }
}
