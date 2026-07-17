/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    private int[] field_j;
    String field_f;
    private int field_d;
    private int[] field_r;
    static String field_h;
    static String field_m;
    static String field_b;
    private pm field_g;
    private String field_e;
    static int field_a;
    private int field_k;
    static String field_l;
    private String[] field_s;
    private int field_c;
    private int field_n;
    private boolean field_o;
    private int[] field_q;
    private int field_p;
    static boolean field_i;

    final static void a(boolean param0) {
        ma.field_o = new bb();
    }

    final void a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ob var9 = null;
        ob var10 = null;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          var3 = -96 / ((param0 - -64) / 35);
          var9 = rk.field_e;
          var10 = var9;
          if (((nn) this).field_n != 0) {
            if (((nn) this).field_n == 1) {
              break L0;
            } else {
              if (2 == ((nn) this).field_n) {
                L1: {
                  if (null != ((nn) this).field_s) {
                    L2: {
                      if (!oa.field_i) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L2;
                      } else {
                        stackOut_12_0 = 110;
                        stackIn_14_0 = stackOut_12_0;
                        break L2;
                      }
                    }
                    var4 = stackIn_14_0;
                    var5 = 0;
                    L3: while (true) {
                      if (2 <= var5) {
                        L4: {
                          var5 = 20;
                          if (((nn) this).field_o) {
                            stackOut_19_0 = 1;
                            stackIn_20_0 = stackOut_19_0;
                            break L4;
                          } else {
                            stackOut_18_0 = 0;
                            stackIn_20_0 = stackOut_18_0;
                            break L4;
                          }
                        }
                        var6 = stackIn_20_0;
                        var7 = 1 + -var6;
                        var10.a(((nn) this).field_s[var6], var5, 420 - var4, 0, -1);
                        var10.c(((nn) this).field_s[var7], -var5 + 640, -var4 + 420, 0, -1);
                        break L1;
                      } else {
                        var9.b(sb.a(((nn) this).field_r[var5], 3), ((nn) this).field_j[var5], -var4 + (((nn) this).field_q[var5] - -155), 0, -1);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (0 >= ((nn) this).field_k) {
                    break L5;
                  } else {
                    L6: {
                      if (!oa.field_i) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        break L6;
                      } else {
                        stackOut_23_0 = 50;
                        stackIn_25_0 = stackOut_23_0;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = stackIn_25_0;
                      if (((nn) this).field_k > 256) {
                        stackOut_27_0 = 256;
                        stackIn_28_0 = stackOut_27_0;
                        break L7;
                      } else {
                        stackOut_26_0 = ((nn) this).field_k;
                        stackIn_28_0 = stackOut_26_0;
                        break L7;
                      }
                    }
                    L8: {
                      var5 = stackIn_28_0;
                      if (380 >= ((nn) this).field_k) {
                        break L8;
                      } else {
                        var5 = -(5 * ((nn) this).field_k) + 2150;
                        break L8;
                      }
                    }
                    var10.a(((nn) this).field_e, 320, -var4 + 130, 0, -1, var5);
                    break L5;
                  }
                }
                if (((nn) this).field_d <= 0) {
                  break L0;
                } else {
                  pm.field_l[3 + -((nn) this).field_d].d(-(((nn) this).field_c >> 1) + 320, 40, ((nn) this).field_c, 90);
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            if (0 < ((nn) this).field_p) {
              fi.a((jl) (Object) var10, po.field_j, Integer.toString(((nn) this).field_g.field_r), rf.field_n, 30, 50, 0, -1, ((nn) this).field_p);
              var9.b(sb.a(((nn) this).field_r[0], 3), 30, 415, 0, -1, ((nn) this).field_p);
              if (null != ((nn) this).field_f) {
                fi.a((jl) (Object) var10, bb.field_e, ((nn) this).field_f, jg.field_J, 30, 390, 0, -1, ((nn) this).field_p);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          if (param0 < -78) {
            break L0;
          } else {
            ((nn) this).field_r = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((nn) this).field_r.length) {
            L2: {
              if (0 < ((nn) this).field_k) {
                ((nn) this).field_k = ((nn) this).field_k - 5;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (oa.field_j != 0) {
                break L3;
              } else {
                if (((nn) this).field_g.field_r <= 0) {
                  break L3;
                } else {
                  if (256 > ((nn) this).field_p) {
                    ((nn) this).field_p = ((nn) this).field_p + 4;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            return;
          } else {
            L4: {
              if (((nn) this).field_r[var2] < -100 + ((nn) this).field_g.field_v[var2]) {
                ((nn) this).field_r[var2] = ((nn) this).field_r[var2] + 40;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((nn) this).field_g.field_v[var2] + -1000 <= ((nn) this).field_r[var2]) {
                if (((nn) this).field_r[var2] >= ((nn) this).field_g.field_v[var2]) {
                  break L5;
                } else {
                  ((nn) this).field_r[var2] = ((nn) this).field_r[var2] + 5;
                  break L5;
                }
              } else {
                ((nn) this).field_r[var2] = ((nn) this).field_r[var2] + 320;
                break L5;
              }
            }
            if (((nn) this).field_r[var2] > ((nn) this).field_g.field_v[var2]) {
              ((nn) this).field_r[var2] = ((nn) this).field_g.field_v[var2];
              var2++;
              continue L1;
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
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
                try {
                  L1: {
                    L2: {
                      var9 = param0.getParameter("cookiehost");
                      var7 = var9;
                      var7 = var9;
                      var8 = 46 % ((18 - param1) / 49);
                      var10 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var9;
                      var7 = var10;
                      var7 = var10;
                      if (param4 >= 0L) {
                        var7 = var10 + "; Expires=" + po.a(10, param4 * 1000L + hm.a(64)) + "; Max-Age=" + param4;
                        break L2;
                      } else {
                        var7 = var10 + "; Discard;";
                        break L2;
                      }
                    }
                    cq.a(param0, (byte) -115, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("nn.H(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param2 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param3 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        ((nn) this).field_k = param0;
        int var2 = 1 + ((nn) this).field_g.field_d.field_d;
        if (!(var2 <= ((nn) this).field_g.field_d.field_l.length)) {
            var2--;
        }
        ((nn) this).field_e = sd.a(field_b, 73, new String[2]);
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 != -1) {
            nn.c(-122);
        }
        field_h = null;
        field_m = null;
        field_b = null;
    }

    final static void a(int param0, fm param1, fm param2, fm param3) {
        RuntimeException var4 = null;
        hh[] var5 = null;
        hh[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        hh[] var10 = null;
        tf var11 = null;
        int var11_int = 0;
        tf var12 = null;
        int var13 = 0;
        hh[] var14 = null;
        tf var15 = null;
        int[][] var16 = null;
        tf var17 = null;
        tf var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            fk.field_s = eh.a("frame_top", "commonui", (byte) 47, param2);
            hd.field_v = eh.a("frame_bottom", "commonui", (byte) 47, param2);
            ge.field_g = bi.a("commonui", "jagex_logo_grey", param2, (byte) -74);
            fc.field_d = eh.a("button", "commonui", (byte) 47, param2);
            ha.field_g = vi.a(param2, 20049, "validation", "commonui");
            ep.field_b = (jl) (Object) kk.a(param2, "commonui", 0, "arezzo12", param3);
            he.field_d = (jl) (Object) kk.a(param2, "commonui", 0, "arezzo14", param3);
            ba.field_d = (jl) (Object) kk.a(param2, "commonui", 0, "arezzo14bold", param3);
            var17 = new tf(param1.a((byte) 24, "", "button.gif"), (java.awt.Component) (Object) ec.field_u);
            hh discarded$1 = dq.a((byte) 31, "dropdown", "commonui", param2);
            var5 = lb.a(param2, param0 ^ 4767934, "commonui", "screen_options");
            ng.field_A = new hh[4];
            ng.field_o = new hh[4];
            qg.field_a = new hh[4];
            var6 = new hh[][]{qg.field_a, ng.field_A, ng.field_o};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_o;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_n[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = param0;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_E;
                    ti.a(false);
                    var17.c();
                    t.e(0, 0, t.field_j, t.field_d);
                    var15 = new tf(var9, var9);
                    var18 = var15;
                    var18.c();
                    var17.f(0, 0);
                    var11 = new tf(var9, var9);
                    var11.c();
                    var17.f(var9 + -var17.field_F, 0);
                    var12 = new tf(-(2 * var9) + var17.field_F, var9);
                    var12.c();
                    var17.f(-var9, 0);
                    ia.a((byte) 92);
                    fc.field_d = new tf[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var14.length) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = wb.a(var5[var9], false, var21[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("nn.F(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param1 == 0) {
            ((nn) this).field_d = 0;
            break L0;
          } else {
            L1: {
              ((nn) this).field_d = 1 + param1 / 50;
              var3 = param1 % 50;
              if (48 == var3) {
                pp discarded$4 = mc.a(4, param0 + -40);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var3 <= 25) {
                break L2;
              } else {
                var3 = 50 - var3;
                break L2;
              }
            }
            if (var3 < 5) {
              ((nn) this).field_c = var3 * 30;
              break L0;
            } else {
              ((nn) this).field_c = 150;
              break L0;
            }
          }
        }
        L3: {
          if (param0 == -87) {
            break L3;
          } else {
            ((nn) this).field_k = -50;
            break L3;
          }
        }
    }

    nn(pm param0, int[] param1, int[] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((nn) this).field_d = 0;
        ((nn) this).field_k = 0;
        ((nn) this).field_c = 0;
        try {
          L0: {
            L1: {
              ((nn) this).field_g = param0;
              ((nn) this).field_j = param1;
              ((nn) this).field_q = param2;
              ((nn) this).field_n = oa.field_j;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((nn) this).field_o = stackIn_4_1 != 0;
              ((nn) this).field_r = new int[((nn) this).field_g.field_v.length];
              ((nn) this).field_p = 0;
              ((nn) this).field_k = 0;
              ((nn) this).field_f = null;
              if (((nn) this).field_n != 2) {
                break L2;
              } else {
                ((nn) this).field_s = new String[((nn) this).field_g.field_i.length];
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= ((nn) this).field_s.length) {
                    break L2;
                  } else {
                    ((nn) this).field_s[var5_int] = ((nn) this).field_g.field_i[var5_int];
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("nn.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Quick Chat lobby";
        field_m = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_b = "<%0> / <%1>";
        field_l = "Rankings";
    }
}
