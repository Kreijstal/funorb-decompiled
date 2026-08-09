/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hd {
    static int field_d;
    static String field_g;
    private java.util.zip.Inflater field_e;
    static int[] field_c;
    static ka[] field_a;
    static int[][] field_f;
    static ka field_b;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(mc.a(var2, -1, param0), "_top");
                    var3 = -101 % ((40 - param1) / 46);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("hd.A(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, uj param1, Object param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (null != param1.field_p) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (param1.field_p.peekEvent() == null) {
                      break L2;
                    } else {
                      c.a(40, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                if (param0 > 69) {
                  try {
                    L3: {
                      L4: {
                        if (param2 == null) {
                          break L4;
                        } else {
                          param1.field_p.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                          break L4;
                        }
                      }
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("hd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_a = null;
        if (param0 != 102) {
            field_g = (String) null;
        }
        field_f = (int[][]) null;
        field_b = null;
    }

    private hd(int param0, int param1, int param2) {
    }

    final static void a(ka[] param0, int param1, int param2, byte param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var6_int = -44 / ((0 - param3) / 54);
                if (-1 <= (param2 ^ -1)) {
                  break L1;
                } else {
                  if (param1 > 0) {
                    L2: {
                      if (param0[3] == null) {
                        stackIn_10_0 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = param0[3].field_q;
                        break L2;
                      }
                    }
                    L3: {
                      var7 = stackIn_10_0;
                      if (param0[5] == null) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = param0[5].field_q;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_13_0;
                      if (param0[1] == null) {
                        stackIn_16_0 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = param0[1].field_v;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_16_0;
                      if (null == param0[7]) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = param0[7].field_v;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_19_0;
                      var11 = param5 + param2;
                      var12 = param4 + param1;
                      var13 = var7 + param5;
                      var14 = var11 + -var8;
                      var15 = param4 + var9;
                      var16 = -var10 + var12;
                      var17 = var13;
                      var18 = var14;
                      if (var17 > var18) {
                        var18 = param5 + var7 * param2 / (var8 + var7);
                        var17 = param5 + var7 * param2 / (var8 + var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      qg.a(hb.field_a);
                      if (var19 <= var20) {
                        break L7;
                      } else {
                        var20 = param4 + param1 * var9 / (var9 - -var10);
                        var19 = param4 + param1 * var9 / (var9 - -var10);
                        break L7;
                      }
                    }
                    L8: {
                      if (param0[0] == null) {
                        break L8;
                      } else {
                        qg.a(param5, param4, var17, var19);
                        param0[0].g(param5, param4);
                        qg.b(hb.field_a);
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[2] == null) {
                        break L9;
                      } else {
                        qg.a(var18, param4, var11, var19);
                        param0[2].g(var14, param4);
                        qg.b(hb.field_a);
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param0[6]) {
                        qg.a(param5, var20, var17, var12);
                        param0[6].g(param5, var16);
                        qg.b(hb.field_a);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[8] == null) {
                        break L11;
                      } else {
                        qg.a(var18, var20, var11, var12);
                        param0[8].g(var14, var16);
                        qg.b(hb.field_a);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[1]) {
                        break L12;
                      } else {
                        if (0 == param0[1].field_q) {
                          break L12;
                        } else {
                          qg.a(var17, param4, var18, var19);
                          var21 = var13;
                          L13: while (true) {
                            if (var14 <= var21) {
                              qg.b(hb.field_a);
                              break L12;
                            } else {
                              param0[1].g(var21, param4);
                              var21 = var21 + param0[1].field_q;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param0[7] == null) {
                        break L14;
                      } else {
                        if (param0[7].field_q != 0) {
                          qg.a(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            if (var14 <= var21) {
                              qg.b(hb.field_a);
                              break L14;
                            } else {
                              param0[7].g(var21, var16);
                              var21 = var21 + param0[7].field_q;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (param0[3] == null) {
                        break L16;
                      } else {
                        if (param0[3].field_v == 0) {
                          break L16;
                        } else {
                          qg.a(param5, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var21 >= var16) {
                              qg.b(hb.field_a);
                              break L16;
                            } else {
                              param0[3].g(param5, var21);
                              var21 = var21 + param0[3].field_v;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (null == param0[5]) {
                        break L18;
                      } else {
                        if (0 == param0[5].field_v) {
                          break L18;
                        } else {
                          qg.a(var18, var19, var11, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var21 >= var16) {
                              qg.b(hb.field_a);
                              break L18;
                            } else {
                              param0[5].g(var14, var21);
                              var21 = var21 + param0[5].field_v;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param0[4]) {
                        break L20;
                      } else {
                        if (0 == param0[4].field_q) {
                          break L20;
                        } else {
                          if (0 != param0[4].field_v) {
                            qg.a(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var21 >= var16) {
                                qg.b(hb.field_a);
                                break L20;
                              } else {
                                var22 = var13;
                                L22: while (true) {
                                  if (var14 <= var22) {
                                    var21 = var21 + param0[4].field_v;
                                    continue L21;
                                  } else {
                                    param0[4].g(var22, var21);
                                    var22 = var22 + param0[4].field_q;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
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
          L23: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("hd.D(");

            if (param0 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L23;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L23;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final void a(byte[] param0, byte param1, uf param2) {
        try {
            try {
                if (31 != param2.field_m[param2.field_q] || -117 != param2.field_m[param2.field_q - -1]) {
                    throw new RuntimeException("");
                }
                if (param1 != -117) {
                    field_f = (int[][]) null;
                }
                if (null == this.field_e) {
                    this.field_e = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_e.setInput(param2.field_m, param2.field_q - -10, param2.field_m.length + (-8 + -param2.field_q) - 10);
                    this.field_e.inflate(param0);
                } catch (Exception exception) {
                    this.field_e.reset();
                    throw new RuntimeException("");
                }
                this.field_e.reset();
            } catch (RuntimeException runtimeException) {
                throw oj.a((Throwable) ((Object) runtimeException), "hd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public hd() {
        this(-1, 1000000, 1000000);
    }

    final static boolean b(byte param0) {
        int var1 = 73 % ((16 - param0) / 48);
        return cj.field_d;
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, uj param8) {
        rc.field_t = param8;
        vb.field_r = param6;
        mg.field_e = param3;
        vk.field_j = param5;
        pg.field_m = param2;
        mc.field_o = param1;
        vf.field_d = param7;
        wb.field_d = param4;
        gb.field_d = (vb) ((Object) new fl());
        if (param0 != 7) {
            return;
        }
        try {
            gi.field_a = new rb(param8);
            wf.field_i = new oa(gb.field_d, gi.field_a);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hd.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[3];
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_f = new int[][]{new int[]{300}, new int[]{400, 400, 400, 400, 400, 400}, new int[]{250}, new int[]{250}, new int[]{250}, new int[]{300}};
    }
}
