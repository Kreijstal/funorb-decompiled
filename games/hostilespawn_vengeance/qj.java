/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends am {
    int field_j;
    int field_i;
    static byte[] field_h;
    static String field_m;
    static boolean[] field_k;
    static String field_n;
    static bd field_l;

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                vh.field_c = param0;
                try {
                  L1: {
                    var3 = param1.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    var4 = param1.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    if (param2 > 47) {
                      L2: {
                        var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                        if (-1 != (param0.length() ^ -1)) {
                          break L2;
                        } else {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        }
                      }
                      a.a(param1, 17467, "document.cookie=\"" + var5 + "\"");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  e.a(23148, param1);
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var3_ref2);

                stackIn_12_1 = new StringBuilder().append("qj.D(");

                if (param0 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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

    final static fa a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fa[] var3 = null;
        int var4 = 0;
        fa var5 = null;
        int var6 = 0;
        fa stackIn_3_0 = null;
        fa stackIn_10_0 = null;
        fa stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2 = ae.a(param0, "jagex-last-login-method", 0);
            if (var2 != null) {
              L1: {
                var3 = pe.p(274);
                if (param1 <= -29) {
                  break L1;
                } else {
                  field_l = (bd) null;
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackIn_13_0 = w.field_S;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a(0, var2)) {
                    var4++;
                    continue L2;
                  } else {
                    stackIn_10_0 = (fa) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = w.field_S;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("qj.F(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        jd var4 = null;
        ic var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = (jd) ((Object) ib.field_a.g(-48));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == -21) {
                    break L2;
                  } else {
                    field_k = (boolean[]) null;
                    break L2;
                  }
                }
                var5 = (ic) ((Object) ch.field_p.g(-41));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    rl.a(param1, var5, 746037954);
                    var5 = (ic) ((Object) ch.field_p.a(12684));
                    continue L3;
                  }
                }
              } else {
                ea.a(var4, param1, 70);
                var4 = (jd) ((Object) ib.field_a.a(12684));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "qj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static fn a(gb param0, gb param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        java.applet.Applet var6 = null;
        Object stackIn_4_0 = null;
        fn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                var6 = (java.applet.Applet) null;
                qj.a((java.applet.Applet) null, (byte) 22);
                break L1;
              }
            }
            if (rl.a(2884, param1, param4, param3)) {
              stackIn_6_0 = th.a(-5427, param0.a(false, param3, param4));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("qj.B(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fn) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(vi param0, byte param1) {
        int var2_int = 0;
        try {
            hf.field_a = param0.e(8) << -1928690331;
            var2_int = param0.l(32270);
            sm.field_g = (7 & var2_int) << -167668142;
            hf.field_a = hf.field_a + (var2_int >> -1578453277);
            sm.field_g = sm.field_g + (param0.e(8) << -1476488382);
            var2_int = param0.l(32270);
            sm.field_g = sm.field_g + (var2_int >> 1531800102);
            jn.field_J = var2_int << 1020185039 & 2064384;
            jn.field_J = jn.field_J + (param0.l(32270) << 1061029479);
            if (param1 != -12) {
                vi var3 = (vi) null;
                qj.a((vi) null, (byte) -75);
            }
            var2_int = param0.l(32270);
            jn.field_J = jn.field_J + (var2_int >> -19013471);
            s.field_e = (var2_int & 1) << 2003080368;
            s.field_e = s.field_e + param0.e(8);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "qj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -13206) {
            return;
        }
        field_k = null;
        field_l = null;
        field_h = null;
        field_m = null;
    }

    final static void a(int param0, int param1, oc param2, oc param3) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        oj var5 = null;
        oc var6 = null;
        oj var7 = null;
        oc var8 = null;
        og var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          L0: {
            L1: {
              var4_int = ln.field_a.field_d;
              var5 = mm.field_m[0];
              var6 = var5.field_j;
              var7 = mm.field_m[param1];
              var8 = var7.field_j;
              var9 = var7.field_l;
              if (param0 <= -87) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            L2: {
              var10 = var8.b(-4);
              if ((wb.field_R ^ -1) < -1) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_5_0;
              if (var11 != 0) {
                if ((cm.field_c[var10] ^ -1) < -1) {
                  stackIn_11_0 = 1;
                  break L3;
                } else {
                  stackIn_11_0 = 0;
                  break L3;
                }
              } else {
                stackIn_11_0 = 0;
                break L3;
              }
            }
            var12 = stackIn_11_0;
            var15 = var7.a(3, var12 != 0);
            var16 = var7.field_E;
            var14 = (int)(24.0 * (-var9.field_a + ((double)(-var8.field_g) + (var5.field_l.field_a + (double)var6.field_g))));
            var17 = var7.field_r;
            var13 = (int)(24.0 * ((double)var6.field_e + var5.field_l.field_f - (double)var8.field_e - var9.field_f));
            if (1 != ue.field_d) {
              L4: {
                if ((ul.field_L ^ -1) >= 0) {
                  break L4;
                } else {
                  if (10 <= ul.field_L) {
                    break L4;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L5: {
                if (var7.field_i == 27) {
                  L6: {
                    if (0 >= var7.field_I) {
                      L7: {
                        var7.field_I = 0;
                        if (!var7.field_s) {
                          break L7;
                        } else {
                          tk.a(1, jc.field_c, 27, true);
                          break L7;
                        }
                      }
                      var7.field_s = false;
                      break L6;
                    } else {
                      if (var7.field_x == var7.field_I) {
                        var7.field_s = true;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (var7.field_s) {
                      break L8;
                    } else {
                      var17 = var17 * 8;
                      var7.field_I = var7.field_I + 1;
                      break L8;
                    }
                  }
                  if ((var7.field_L ^ -1) >= -1) {
                    break L5;
                  } else {
                    var7.field_I = var7.field_x;
                    var7.field_L = var7.field_L - 1;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L9: {
                L10: {
                  if (1 != bm.field_c) {
                    break L10;
                  } else {
                    if (-1 == rl.field_c) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                ei.a(var17, var16, var8, var11 != 0, var9, param3, var15, 6, var12 != 0, var7, var4_int, var13, var10, 81, 8, var14, var6);
                break L9;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var4);

            stackIn_36_1 = new StringBuilder().append("qj.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param3 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L12;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L12;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static fe a(int param0, String param1, int param2) {
        el var3 = null;
        RuntimeException var3_ref = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 27) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            var3 = new el();
            ((fe) ((Object) var3)).field_b = param2;
            ((fe) ((Object) var3)).field_a = param1;
            stackIn_3_0 = (el) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("qj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (fe) ((Object) stackIn_3_0);
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        field_m = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_n = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
