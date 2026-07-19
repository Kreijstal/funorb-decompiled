/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class sh extends mb implements ta {
    private dg field_pb;
    static String field_sb;
    private boolean field_xb;
    private e field_ob;
    private boolean field_vb;
    private boolean field_zb;
    static int field_rb;
    static p field_tb;
    static int[] field_yb;
    private boolean field_wb;
    static hg field_qb;
    static int[] field_ub;

    final void h(boolean param0) {
        if (!this.field_G) {
            return;
        }
        this.field_G = false;
        if (this.field_vb) {
            ch.a((byte) -127);
        } else {
            if (this.field_zb) {
                hm.c(0);
            }
        }
        if (!param0) {
            this.k(62);
        }
    }

    final static ck a(int param0, String param1) {
        RuntimeException var2 = null;
        ck stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        ck stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        ck stackOut_4_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (cb.field_c != ao.field_Kb) {
              if (param0 == 648093968) {
                L1: {
                  if (rg.field_d != cb.field_c) {
                    break L1;
                  } else {
                    if (param1.equals(ve.field_u)) {
                      cb.field_c = kh.field_e;
                      stackOut_11_0 = de.field_ob;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                cb.field_c = ao.field_Kb;
                de.field_ob = null;
                ve.field_u = param1;
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (ck) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("sh.DC(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ck) ((Object) stackIn_10_0);
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void g(boolean param0) {
        field_yb = null;
        field_sb = null;
        field_tb = null;
        if (!param0) {
            field_qb = (hg) null;
        }
        field_qb = null;
        field_ub = null;
    }

    final static int b(int param0, int param1, int param2, int param3) {
        if (!(param2 + param3 > df.field_e)) {
            return param2;
        }
        if (param2 + (param1 + -param3) >= param0) {
            return param1 + param2 + -param3;
        }
        return df.field_e - param3;
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = -30 / ((param3 - -75) / 36);
            if (13 != param2) {
              stackOut_3_0 = super.a(param0, param1, param2, -30);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.h(true);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("sh.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String b(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_8_0 = null;
            String stackIn_14_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            String stackOut_15_0 = null;
            String stackOut_13_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var8 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param1.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      var4 = (String) (q.b("getcookies", 6168, param1));
                      var5 = ql.a(var4, (byte) -123, ';');
                      if (param0 < 0) {
                        break L2;
                      } else {
                        field_tb = (p) null;
                        break L2;
                      }
                    }
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= var5.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L4;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L4;
                            } else {
                              stackOut_7_0 = var5[var6].substring(var7 + 1).trim();
                              stackIn_8_0 = stackOut_7_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null == rh.field_a) {
                    stackOut_15_0 = param1.getParameter("settings");
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_13_0 = rh.field_a;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2_ref);
                stackOut_17_1 = new StringBuilder().append("sh.CC(").append(param0).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0;
              } else {
                return stackIn_8_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, wg param2, wg param3, int param4, int param5) {
        try {
            bj.field_j = param4;
            qg.field_l = param2;
            oh.field_d = param1;
            ul.field_g = param3;
            if (param0 != -40) {
                sh.g(true);
            }
            eh.field_d = param5;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sh.WB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1) {
        String discarded$0 = null;
        if (param0 != 4712) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            discarded$0 = sh.b(76, (java.applet.Applet) null);
        }
        return ak.a(param1, (byte) -74, wa.field_M);
    }

    public void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_xb) {
                kf.a(3, -1);
                this.h(true);
                break L1;
              } else {
                pi.a("tochangedisplayname.ws", -17713, mb.g((byte) 75));
                break L1;
              }
            }
            L2: {
              if (param0 == 12085) {
                break L2;
              } else {
                field_yb = (int[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("sh.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        RuntimeException var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var42 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param16 > param7) {
                break L1;
              } else {
                if (fk.field_n <= param15) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if (param2 >= 0) {
                        break L2;
                      } else {
                        if (param8 < 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param4 < fk.field_o) {
                      break L3;
                    } else {
                      if (param2 < fk.field_o) {
                        break L3;
                      } else {
                        if (fk.field_o > param8) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    var34 = param7 - param15;
                    if (param14 != param15) {
                      L5: {
                        var18 = param4 << -261848176;
                        var17_int = param4 << -261848176;
                        var30 = param3 << -1748164336;
                        var29 = param3 << -1748164336;
                        var26 = param1 << 498714736;
                        var25 = param1 << 498714736;
                        var22 = param11 << -634592784;
                        var21 = param11 << -634592784;
                        var35 = -param15 + param14;
                        var19 = (-param4 + param2 << -362346896) / var35;
                        var20 = (-param4 + param8 << 1812858832) / var34;
                        if (var19 >= var20) {
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var27 = (param13 + -param1 << 1010814320) / var34;
                          var24 = (param12 + -param11 << -1640389168) / var35;
                          var31 = (-param3 + param5 << -102522960) / var34;
                          var23 = (-param11 + param10 << 1254784048) / var34;
                          var28 = (-param1 + param6 << 1971190448) / var35;
                          var33 = 1;
                          var32 = (param9 - param3 << -1577974512) / var35;
                          break L5;
                        } else {
                          var27 = (-param1 + param6 << 197863344) / var35;
                          var31 = (param9 + -param3 << 1115304048) / var35;
                          var23 = (-param11 + param12 << -1890314960) / var35;
                          var32 = (-param3 + param5 << -1144333008) / var34;
                          var28 = (-param1 + param13 << -2110090672) / var34;
                          var24 = (param10 + -param11 << 733908624) / var34;
                          var33 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param15 < 0) {
                            if ((param14 ^ -1) <= -1) {
                              param15 = -param15;
                              var29 = var29 + var31 * param15;
                              var21 = var21 + param15 * var23;
                              var17_int = var17_int + var19 * param15;
                              var25 = var25 + param15 * var27;
                              var26 = var26 + param15 * var28;
                              var30 = var30 + var32 * param15;
                              var18 = var18 + var20 * param15;
                              var22 = var22 + param15 * var24;
                              param15 = 0;
                              break L7;
                            } else {
                              param15 = param14 + -param15;
                              var25 = var25 + var27 * param15;
                              var30 = var30 + var32 * param15;
                              var21 = var21 + param15 * var23;
                              var29 = var29 + var31 * param15;
                              var17_int = var17_int + param15 * var19;
                              var18 = var18 + param15 * var20;
                              var22 = var22 + var24 * param15;
                              var26 = var26 + param15 * var28;
                              param15 = param14;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var36 = fk.field_m[param15];
                        L8: while (true) {
                          if (param14 <= param15) {
                            break L6;
                          } else {
                            L9: {
                              var37 = var17_int >> -479267600;
                              if (fk.field_o <= var37) {
                                break L9;
                              } else {
                                var38 = -(var17_int >> 533700048) + (var18 >> -1232356784);
                                if (0 == var38) {
                                  if (-1 < (var37 ^ -1)) {
                                    break L9;
                                  } else {
                                    if (var37 < fk.field_o) {
                                      sn.a(0, var29, 0, var38, var25, (byte) -80, var37 + var36, param0, 0, var21);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    var39 = (var22 - var21) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (fk.field_o <= var38 + var37) {
                                      var38 = -var37 + fk.field_o + -1;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (0 > var37) {
                                    sn.a(var40, var29 - var37 * var41, var41, var37 + var38, -(var40 * var37) + var25, (byte) 91, var36, param0, var39, -(var39 * var37) + var21);
                                    break L9;
                                  } else {
                                    sn.a(var40, var29, var41, var38, var25, (byte) -104, var37 + var36, param0, var39, var21);
                                    break L9;
                                  }
                                }
                              }
                            }
                            param15++;
                            if (fk.field_n > param15) {
                              var29 = var29 + var31;
                              var26 = var26 + var28;
                              var30 = var30 + var32;
                              var22 = var22 + var24;
                              var18 = var18 + var20;
                              var25 = var25 + var27;
                              var36 = var36 + df.field_e;
                              var21 = var21 + var23;
                              var17_int = var17_int + var19;
                              continue L8;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var36 = param7 + -param14;
                      if (0 == var36) {
                        var27 = 0;
                        var20 = 0;
                        var31 = 0;
                        var19 = 0;
                        var32 = 0;
                        var28 = 0;
                        var24 = 0;
                        var23 = 0;
                        break L4;
                      } else {
                        L11: {
                          var37 = param8 << -446319344;
                          var38 = param10 << -411281968;
                          var39 = param13 << 1337172048;
                          if (var33 == 0) {
                            var17_int = param2 << 9993040;
                            var29 = param9 << -1258625264;
                            var21 = param12 << 1429507664;
                            var25 = param6 << -981863888;
                            break L11;
                          } else {
                            var22 = param12 << 1019193232;
                            var18 = param2 << 143087440;
                            var30 = param9 << 1457907344;
                            var26 = param6 << -2070989072;
                            break L11;
                          }
                        }
                        var40 = param5 << -1294217808;
                        var27 = (-var25 + var39) / var36;
                        var20 = (var37 - var18) / var36;
                        var19 = (-var17_int + var37) / var36;
                        var28 = (var39 + -var26) / var36;
                        var31 = (var40 + -var29) / var36;
                        var23 = (-var21 + var38) / var36;
                        var24 = (var38 + -var22) / var36;
                        var32 = (var40 + -var30) / var36;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param7 == param15) {
                          var17_int = param4 << 131164176;
                          var32 = 0;
                          var23 = 0;
                          var25 = param1;
                          var22 = param12;
                          var29 = param3;
                          var21 = param11;
                          var20 = 0;
                          var28 = 0;
                          var30 = param9;
                          var31 = 0;
                          var19 = 0;
                          var27 = 0;
                          var18 = param2 << 949186096;
                          var24 = 0;
                          var26 = param6;
                          break L12;
                        } else {
                          var35 = -param14 + param7;
                          if (param4 < param2) {
                            var29 = param3 << 1683189744;
                            var17_int = param4 << -1821274576;
                            var25 = param1 << 459348496;
                            var28 = (param13 - param6 << -1294380272) / var35;
                            var27 = (-param1 + param13 << 1960526160) / var34;
                            var31 = (param5 + -param3 << 292112560) / var34;
                            var20 = (param8 - param2 << -2068044944) / var35;
                            var24 = (param10 + -param12 << 1791900048) / var35;
                            var23 = (param10 + -param11 << 2051038064) / var34;
                            var30 = param9 << -1629216240;
                            var22 = param12 << -1832851184;
                            var19 = (param8 - param4 << 1195274480) / var34;
                            var32 = (param5 - param9 << 665325776) / var35;
                            var26 = param6 << -1999367952;
                            var21 = param11 << -1958505424;
                            var18 = param2 << 2007369200;
                            break L12;
                          } else {
                            var23 = (param10 - param12 << -1402105936) / var35;
                            var20 = (param8 - param4 << 267160560) / var34;
                            var29 = param9 << -1043954832;
                            var28 = (-param1 + param13 << 737123088) / var34;
                            var21 = param12 << 687686800;
                            var30 = param3 << 828547920;
                            var26 = param1 << 654451312;
                            var24 = (-param11 + param10 << -912285584) / var34;
                            var22 = param11 << -651299888;
                            var32 = (param5 - param3 << -1763151440) / var34;
                            var25 = param6 << -1033989328;
                            var17_int = param2 << -877377712;
                            var18 = param4 << 955944880;
                            var19 = (-param2 + param8 << 754030352) / var35;
                            var27 = (param13 + -param6 << 589442160) / var35;
                            var31 = (param5 - param9 << 648093968) / var35;
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (-1 >= (param15 ^ -1)) {
                          break L13;
                        } else {
                          param15 = Math.min(-param15, -param15 + param14);
                          var17_int = var17_int + param15 * var19;
                          var29 = var29 + param15 * var31;
                          var21 = var21 + var23 * param15;
                          var25 = var25 + param15 * var27;
                          var30 = var30 + var32 * param15;
                          var26 = var26 + param15 * var28;
                          var22 = var22 + param15 * var24;
                          var18 = var18 + var20 * param15;
                          param15 = 0;
                          break L13;
                        }
                      }
                      var33 = 0;
                      break L4;
                    }
                  }
                  L14: {
                    if (param15 >= 0) {
                      break L14;
                    } else {
                      param15 = -param15;
                      var30 = var30 + var32 * param15;
                      var29 = var29 + var31 * param15;
                      var21 = var21 + param15 * var23;
                      var26 = var26 + var28 * param15;
                      var25 = var25 + var27 * param15;
                      var17_int = var17_int + var19 * param15;
                      var18 = var18 + var20 * param15;
                      var22 = var22 + var24 * param15;
                      param15 = 0;
                      break L14;
                    }
                  }
                  var35 = fk.field_m[param15];
                  L15: while (true) {
                    if (param15 >= param7) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var36 = var17_int >> -937916848;
                        if (fk.field_o <= var36) {
                          break L16;
                        } else {
                          var37 = (var18 >> -1745263696) + -(var17_int >> 494277584);
                          if (var37 == 0) {
                            if (0 > var36) {
                              break L16;
                            } else {
                              if (var36 >= fk.field_o) {
                                break L16;
                              } else {
                                sn.a(0, var29, 0, var37, var25, (byte) 53, var35 + var36, param0, 0, var21);
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (-var25 + var26) / var37;
                              var40 = (var30 - var29) / var37;
                              if (var37 + var36 >= fk.field_o) {
                                var37 = -1 + -var36 + fk.field_o;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if ((var36 ^ -1) <= -1) {
                              sn.a(var39, var29, var40, var37, var25, (byte) -80, var35 + var36, param0, var38, var21);
                              break L16;
                            } else {
                              sn.a(var39, -(var36 * var40) + var29, var40, var36 + var37, -(var39 * var36) + var25, (byte) -123, var35, param0, var38, -(var38 * var36) + var21);
                              break L16;
                            }
                          }
                        }
                      }
                      param15++;
                      if (fk.field_n > param15) {
                        var26 = var26 + var28;
                        var18 = var18 + var20;
                        var21 = var21 + var23;
                        var29 = var29 + var31;
                        var30 = var30 + var32;
                        var17_int = var17_int + var19;
                        var25 = var25 + var27;
                        var22 = var22 + var24;
                        var35 = var35 + df.field_e;
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
            var17 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var17);
            stackOut_74_1 = new StringBuilder().append("sh.TB(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L18;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L18;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
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

    sh(je param0, e param1, String param2, boolean param3, boolean param4) {
        super(param0, new sf((sh) null, param1, param2), 77, 10, 10);
        try {
            this.field_vb = param3 ? true : false;
            this.field_ob = param1;
            this.field_zb = param4 ? true : false;
            this.field_wb = false;
            this.field_xb = false;
            this.field_pb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_pb.field_z = true;
            this.a((fi) (this.field_pb), (byte) -78);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, boolean param1, String param2) {
        tg discarded$2 = null;
        tg discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        sf var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        sf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        sf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        sf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        sf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        sf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        sf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_wb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param1) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                ((sh) (this)).field_wb = stackIn_7_1 != 0;
                stackOut_7_0 = this;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if ((param0 ^ -1) != -257) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L2;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L2;
                }
              }
              L3: {
                ((sh) (this)).field_xb = stackIn_10_1 != 0;
                this.field_pb.d(4210752, 8405024, 118);
                var6 = new sf((sh) (this), this.field_ob, param2);
                if ((param0 ^ -1) == -6) {
                  var6.a(11, rn.field_g, (byte) 126);
                  var6.a(17, og.field_k, (byte) 127);
                  break L3;
                } else {
                  if (param0 != 256) {
                    L4: {
                      stackOut_13_0 = (sf) (var6);
                      stackOut_13_1 = -1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (!this.field_vb) {
                        stackOut_15_0 = (sf) ((Object) stackIn_15_0);
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = jl.field_D;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L4;
                      } else {
                        stackOut_14_0 = (sf) ((Object) stackIn_14_0);
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = tn.field_e;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L4;
                      }
                    }
                    ((sf) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, (byte) 126);
                    break L3;
                  } else {
                    discarded$2 = var6.a((cd) (this), 260, tn.field_e);
                    break L3;
                  }
                }
              }
              L5: {
                if (-4 != (param0 ^ -1)) {
                  if (param0 != 4) {
                    if (6 == param0) {
                      var6.a(9, o.field_f, (byte) 126);
                      break L5;
                    } else {
                      if (param0 != 9) {
                        break L5;
                      } else {
                        discarded$3 = var6.a((cd) (this), 260, ve.field_n);
                        break L5;
                      }
                    }
                  } else {
                    var6.a(8, mn.field_b, (byte) 127);
                    break L5;
                  }
                } else {
                  var6.a(7, qh.field_N, (byte) 127);
                  break L5;
                }
              }
              this.b(var6, (byte) -53);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("sh.SB(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param1, 8);
        var2.a(2, -66);
        if (param0 != -112) {
            return;
        }
        var2.a(4, -95);
        var2.a(nl.b(4), -75);
    }

    final void k(int param0) {
        this.field_pb.d(4210752, 2121792, 122);
        sf var2 = new sf((sh) (this), this.field_ob, nd.field_h);
        if (param0 <= 115) {
            this.field_vb = true;
        }
        var2.a(15, cj.field_f, (byte) 126);
        this.b(var2, (byte) -53);
    }

    static {
        field_sb = "Name is available";
        field_tb = new p();
        field_yb = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
    }
}
