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
        if (!param0) {
            fm var2 = (fm) null;
            nn.a(-1, (fm) null, (fm) null, (fm) null);
        }
    }

    final void a(byte param0) {
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ob var9;
        ob var10;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          var3 = -96 / ((param0 - -64) / 35);
          var9 = rk.field_e;
          var10 = var9;
          if (this.field_n != 0) {
            if ((this.field_n ^ -1) == -2) {
              break L0;
            } else {
              if (2 == this.field_n) {
                L1: {
                  if (null != this.field_s) {
                    L2: {
                      if (!oa.field_i) {
                        stackIn_14_0 = 0;
                        break L2;
                      } else {
                        stackIn_14_0 = 110;
                        break L2;
                      }
                    }
                    var4 = stackIn_14_0;
                    var5 = 0;
                    L3: while (true) {
                      if (2 <= var5) {
                        L4: {
                          var5 = 20;
                          if (this.field_o) {
                            stackIn_20_0 = 1;
                            break L4;
                          } else {
                            stackIn_20_0 = 0;
                            break L4;
                          }
                        }
                        var6 = stackIn_20_0;
                        var7 = 1 + -var6;
                        var10.a(this.field_s[var6], var5, 420 - var4, 0, -1);
                        var10.c(this.field_s[var7], -var5 + 640, -var4 + 420, 0, -1);
                        break L1;
                      } else {
                        var9.b(sb.a(this.field_r[var5], 3), this.field_j[var5], -var4 + (this.field_q[var5] - -155), 0, -1);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (0 >= this.field_k) {
                    break L5;
                  } else {
                    L6: {
                      if (!oa.field_i) {
                        stackIn_25_0 = 0;
                        break L6;
                      } else {
                        stackIn_25_0 = 50;
                        break L6;
                      }
                    }
                    L7: {
                      var4 = stackIn_25_0;
                      if (this.field_k > 256) {
                        stackIn_28_0 = 256;
                        break L7;
                      } else {
                        stackIn_28_0 = this.field_k;
                        break L7;
                      }
                    }
                    L8: {
                      var5 = stackIn_28_0;
                      if (380 >= this.field_k) {
                        break L8;
                      } else {
                        var5 = -(5 * this.field_k) + 2150;
                        break L8;
                      }
                    }
                    var10.a(this.field_e, 320, -var4 + 130, 0, -1, var5);
                    break L5;
                  }
                }
                if (this.field_d <= 0) {
                  break L0;
                } else {
                  pm.field_l[3 + -this.field_d].d(-(this.field_c >> 912332065) + 320, 40, this.field_c, 90);
                  break L0;
                }
              } else {
                break L0;
              }
            }
          } else {
            if (0 < this.field_p) {
              fi.a(var10, po.field_j, Integer.toString(this.field_g.field_r), rf.field_n, 30, 50, 0, -1, this.field_p);
              var9.b(sb.a(this.field_r[0], 3), 30, 415, 0, -1, this.field_p);
              if (null != this.field_f) {
                fi.a(var10, bb.field_e, this.field_f, jg.field_J, 30, 390, 0, -1, this.field_p);
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
        int var2;
        int var3;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          var2 = 0;
          if (param0 < -78) {
            break L0;
          } else {
            this.field_r = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= this.field_r.length) {
            L2: {
              if (0 < this.field_k) {
                this.field_k = this.field_k - 5;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (oa.field_j != 0) {
                break L3;
              } else {
                if ((this.field_g.field_r ^ -1) >= -1) {
                  break L3;
                } else {
                  if (256 > this.field_p) {
                    this.field_p = this.field_p + 4;
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
              if (this.field_r[var2] < -100 + this.field_g.field_v[var2]) {
                this.field_r[var2] = this.field_r[var2] + 40;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (this.field_g.field_v[var2] + -1000 <= this.field_r[var2]) {
                if (this.field_r[var2] >= this.field_g.field_v[var2]) {
                  break L5;
                } else {
                  this.field_r[var2] = this.field_r[var2] + 5;
                  break L5;
                }
              } else {
                this.field_r[var2] = this.field_r[var2] + 320;
                break L5;
              }
            }
            if (this.field_r[var2] > this.field_g.field_v[var2]) {
              this.field_r[var2] = this.field_g.field_v[var2];
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
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
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
                      if ((param4 ^ -1L) <= -1L) {
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
                stackIn_9_0 = (RuntimeException) (var6_ref);

                stackIn_9_1 = new StringBuilder().append("nn.H(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L4;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L5;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        this.field_k = param0;
        int var2 = 1 + this.field_g.field_d.field_d;
        if (!(var2 <= this.field_g.field_d.field_l.length)) {
            var2--;
        }
        this.field_e = sd.a(field_b, 73, new String[]{Integer.toString(var2), Integer.toString(this.field_g.field_d.field_l.length)});
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
        tf var17 = null;
        hh[] var5 = null;
        hh[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        hh[] var14 = null;
        int var11_int = 0;
        tf var15 = null;
        tf var18 = null;
        tf var11 = null;
        tf var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Pixelate.field_H ? 1 : 0;
        try {
            fk.field_s = eh.a("frame_top", "commonui", (byte) 47, param2);
            hd.field_v = eh.a("frame_bottom", "commonui", (byte) 47, param2);
            ge.field_g = bi.a("commonui", "jagex_logo_grey", param2, (byte) -74);
            fc.field_d = eh.a("button", "commonui", (byte) 47, param2);
            ha.field_g = vi.a(param2, 20049, "validation", "commonui");
            ep.field_b = (jl) ((Object) kk.a(param2, "commonui", 0, "arezzo12", param3));
            he.field_d = (jl) ((Object) kk.a(param2, "commonui", 0, "arezzo14", param3));
            ba.field_d = (jl) ((Object) kk.a(param2, "commonui", 0, "arezzo14bold", param3));
            var17 = new tf(param1.a((byte) 24, "", "button.gif"), (java.awt.Component) ((Object) ec.field_u));
            dq.a((byte) 31, "dropdown", "commonui", param2);
            var5 = lb.a(param2, param0 ^ 4767934, "commonui", "screen_options");
            ng.field_A = new hh[4];
            ng.field_o = new hh[4];
            qg.field_a = new hh[4];
            var6 = new hh[][]{qg.field_a, ng.field_A, ng.field_o};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_o;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_n[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = param0;
            for (var9 = 0; -4 < (var9 ^ -1); var9++) {
                var14 = var6[var9];
                hh[] var10 = var14;
                for (var11_int = 0; var11_int < var14.length; var11_int++) {
                    var14[var11_int] = wb.a(var5[var9], false, var19[var11_int]);
                }
            }
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
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param1 == 0) {
            this.field_d = 0;
            break L0;
          } else {
            L1: {
              this.field_d = 1 + param1 / 50;
              var3 = param1 % 50;
              if (48 == var3) {
                mc.a(4, param0 + -40);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((var3 ^ -1) >= -26) {
                break L2;
              } else {
                var3 = 50 - var3;
                break L2;
              }
            }
            if ((var3 ^ -1) > -6) {
              this.field_c = var3 * 30;
              break L0;
            } else {
              this.field_c = 150;
              break L0;
            }
          }
        }
        L3: {
          if (param0 == -87) {
            break L3;
          } else {
            this.field_k = -50;
            break L3;
          }
        }
    }

    nn(pm param0, int[] param1, int[] param2, boolean param3) {
        int var5_int = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_d = 0;
        this.field_k = 0;
        this.field_c = 0;
        try {
          L0: {
            L1: {
              this.field_g = param0;
              this.field_j = param1;
              this.field_q = param2;
              this.field_n = oa.field_j;
              stackIn_3_0 = this;

              if (!param3) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((nn) (this)).field_o = stackIn_4_1 != 0;
              this.field_r = new int[this.field_g.field_v.length];
              this.field_p = 0;
              this.field_k = 0;
              this.field_f = null;
              if (-3 != (this.field_n ^ -1)) {
                break L2;
              } else {
                this.field_s = new String[this.field_g.field_i.length];
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= this.field_s.length) {
                    break L2;
                  } else {
                    this.field_s[var5_int] = this.field_g.field_i[var5_int];
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
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("nn.<init>(");

            if (param0 == null) {
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
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    static {
        field_h = "Quick Chat lobby";
        field_m = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_b = "<%0> / <%1>";
        field_l = "Rankings";
    }
}
