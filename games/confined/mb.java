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
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            bc var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            df var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            df stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            df stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            df stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            df stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            df stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            df stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            var6 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L1;
                  } else {
                    var3_ref = ag.a(-19080, param2);
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
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  }
                }
                L4: {
                  ej.a(0, var3_ref);
                  var8 = pi.a(":", "%3a", 22232, var3_ref);
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
                    stackOut_12_0 = hh.field_c;
                    stackOut_12_1 = 0;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = kc.field_k.getCodeBase();
                    stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(uh.field_f).append("&u=");
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    stackIn_13_5 = stackOut_12_5;
                    if (kc.field_f == null) {
                      stackOut_14_0 = (df) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackOut_14_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackOut_14_6 = "" + i.field_p;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      stackIn_15_6 = stackOut_14_6;
                      break L5;
                    } else {
                      stackOut_13_0 = (df) ((Object) stackIn_13_0);
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackOut_13_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackOut_13_6 = kc.field_f;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      stackIn_15_6 = stackOut_13_6;
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
                          discarded$1 = var5.read();
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
                var3 = (Exception) (Object) decompiledCaughtException;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("mb.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(Object param0, int param1, df param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("mb.H(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("mb.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        il var4 = null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("mb.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        il var17 = null;
        double stackIn_7_0 = 0.0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_6_0 = 0.0;
        double stackOut_5_0 = 0.0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_double = -this.field_E + param1.field_E;
              var5 = -this.field_t + param1.field_t;
              var7 = -this.field_D + param1.field_D;
              if (param0) {
                break L1;
              } else {
                var17 = (il) null;
                this.a(true, (il) null);
                break L1;
              }
            }
            L2: {
              var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3_double * var3_double));
              var11 = -var9 + (this.field_C + param1.field_C);
              var13 = (1.0 - this.field_K / (double)uc.field_db.length) * this.field_Q;
              if (param1.field_C <= var11) {
                break L2;
              } else {
                var13 = var13 * (var11 / param1.field_C);
                break L2;
              }
            }
            L3: {
              if (var9 < 0.001) {
                stackOut_6_0 = 1000.0;
                stackIn_7_0 = stackOut_6_0;
                break L3;
              } else {
                stackOut_5_0 = 1.0 / var9;
                stackIn_7_0 = stackOut_5_0;
                break L3;
              }
            }
            var15 = stackIn_7_0;
            var3_double = var3_double * var15;
            var7 = var7 * var15;
            var11 = var11 * (this.field_R / param1.field_M);
            var5 = var5 * var15;
            param1.field_L = param1.field_L + var7 * var11;
            param1.field_K = param1.field_K + var3_double * var11;
            param1.field_G = param1.field_G + var5 * var11;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("mb.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
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
            stackOut_75_0 = (RuntimeException) (var9);
            stackOut_75_1 = new StringBuilder().append("mb.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param5 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("mb.L(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_H = "<col=FFFFFF>Shield:</col> this indispensable item creates a powerful defensive force field around your ship. Look out for these when your shield is low or lost. Without your shield, it only takes one hit to kill you!";
    }
}
