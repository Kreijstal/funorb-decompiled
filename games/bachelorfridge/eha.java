/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eha extends td {
    static String field_r;
    static int[] field_s;
    static String field_p;
    static int[] field_q;

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rg var5 = null;
        int var5_int = 0;
        gea var6_ref_gea = null;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pf var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var11 = ig.field_m;
              var2 = var11.b(16711935);
              var3 = -49 / ((param0 - -10) / 41);
              var4 = var11.b(16711935);
              if (var2 == 0) {
                var5 = (rg) ((Object) rp.field_C.b((byte) 90));
                if (var5 == null) {
                  vc.a((byte) -124);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var6 = dw.field_f + -var11.field_g;
                    var13 = var5.field_g;
                    var12 = var13;
                    var7 = var12;
                    if (var13.length << -978879518 >= var6) {
                      break L2;
                    } else {
                      var6 = var13.length << -1232389342;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var6 <= var8) {
                      var5.a(false);
                      break L1;
                    } else {
                      var7[var8 >> 287933730] = var7[var8 >> 287933730] + (var11.b(16711935) << (dda.a(var8, 3) << -378285016));
                      var8++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 == 1) {
                  var5_int = var11.e(-4095);
                  var6_ref_gea = (gea) ((Object) wd.field_t.b((byte) 90));
                  L4: while (true) {
                    L5: {
                      if (var6_ref_gea == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var6_ref_gea.field_i != var4) {
                            break L6;
                          } else {
                            if (var5_int == var6_ref_gea.field_m) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6_ref_gea = (gea) ((Object) wd.field_t.c(0));
                        continue L4;
                      }
                    }
                    if (var6_ref_gea == null) {
                      vc.a((byte) -109);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6_ref_gea.a(false);
                      break L1;
                    }
                  }
                } else {
                  cv.a(1, "LR1: " + nia.d((byte) -116), (Throwable) null);
                  vc.a((byte) -71);
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "eha.B(" + param0 + ')');
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

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.applet.Applet var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    L2: {
                      var5 = param1.getCodeBase();
                      var3 = ow.a(var5, (byte) -105, param1).getFile();
                      discarded$6 = ac.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, (byte) 73);
                      if (param0 <= -102) {
                        break L2;
                      } else {
                        var4 = (java.applet.Applet) null;
                        eha.a(4, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    discarded$7 = ac.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, (byte) 73);
                    discarded$8 = ac.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, (byte) 73);
                    discarded$9 = ac.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, (byte) 73);
                    discarded$10 = ac.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, (byte) 73);
                    discarded$11 = ac.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, (byte) 73);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("eha.E(").append(param0).append(',');
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
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    eha(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "eha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < bp.field_z) {
                  break L1;
                } else {
                  if (param1.length() > ko.field_e) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == 15) {
                        break L2;
                      } else {
                        var3 = (java.applet.Applet) null;
                        eha.a(13, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("eha.C(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        if (param0 != -1452) {
            eha.c(-28);
        }
        field_p = null;
        field_r = null;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        j var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        ii stackIn_3_0 = null;
        j stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        j stackOut_26_0 = null;
        ii stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            var18 = this.field_h.a(59, param0);
            var4 = new j(this.field_g, new nq(var18));
            var4.field_s = this.field_n;
            var4.field_r = this.field_k;
            var22 = var4.a(0, -77, param0, var18);
            var6 = 17;
            var7 = 17;
            var8 = -1 + var6 >> 1564723649;
            var9 = var7 - 1 >> 766591105;
            if (param1 == 3) {
              var10 = 0;
              L1: while (true) {
                if (var10 >= var6) {
                  var4.field_q = new int[var4.field_o.g(param1 + -3)];
                  var10 = 0;
                  L2: while (true) {
                    if (var10 >= var4.field_q.length) {
                      stackOut_26_0 = (j) (var4);
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4.field_q[var10] = 1 + kla.a(4, param0.field_w, -2147483648);
                      var10++;
                      continue L2;
                    }
                  }
                } else {
                  var11 = 0;
                  L3: while (true) {
                    if (var11 >= var7) {
                      var10++;
                      continue L1;
                    } else {
                      if (var22[var10][var11] == 1) {
                        var12 = this.field_k - -var10 - var8;
                        var13 = this.field_n + -var9 + var11;
                        if (var12 >= 0) {
                          if (param0.field_z > var12) {
                            if (-1 >= (var13 ^ -1)) {
                              if (param0.field_B > var13) {
                                L4: {
                                  var14 = param0.field_a[var12][var13];
                                  var15 = var14.field_l;
                                  if (var15 != null) {
                                    var16 = new iv(new nq(var15), false, 1, 30, 15);
                                    var4.field_o.a(var16, true);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                var11++;
                                continue L3;
                              } else {
                                var11++;
                                continue L3;
                              }
                            } else {
                              var11++;
                              continue L3;
                            }
                          } else {
                            var11++;
                            continue L3;
                          }
                        } else {
                          var11++;
                          continue L3;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = (ii) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("eha.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_27_0);
        }
    }

    final static void c(boolean param0) {
        gfa.field_i = false;
        eea.field_b = param0 ? true : false;
        ep.a(-1, 8192);
        ola.field_p = tn.field_a;
        dka.field_G = tn.field_a;
    }

    static {
        field_p = "Select creatures for battle";
        field_q = new int[4];
        field_r = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
