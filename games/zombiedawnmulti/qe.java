/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_g;
    private int field_h;
    private int field_m;
    static cp field_e;
    static int[] field_o;
    private boolean field_p;
    static cj field_q;
    static int field_f;
    private int field_a;
    static cj field_k;
    private int field_d;
    private sl field_i;
    private int field_l;
    private boolean field_j;
    private boolean field_b;
    private int field_c;
    float field_n;

    private final String a(int param0, int param1) {
        return vl.a(wp.field_d, new String[1], 2);
    }

    final void a(int param0, boolean param1) {
        L0: {
          if (((qe) this).field_p) {
            if (((qe) this).field_a > ((qe) this).field_d) {
              ((qe) this).field_d = ((qe) this).field_d + 1;
              break L0;
            } else {
              if (((qe) this).field_a < ((qe) this).field_d) {
                ((qe) this).field_d = ((qe) this).field_a;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (!((qe) this).field_j) {
            if (1.0f == ((qe) this).field_n) {
              break L1;
            } else {
              ((qe) this).field_n = ((qe) this).field_n + -0.029999999329447746f;
              if (1.0f < ((qe) this).field_n) {
                break L1;
              } else {
                ((qe) this).field_n = 1.0f;
                break L1;
              }
            }
          } else {
            if (1.0f == ((qe) this).field_n) {
              break L1;
            } else {
              ((qe) this).field_n = ((qe) this).field_n + -0.029999999329447746f;
              if (1.0f < ((qe) this).field_n) {
                break L1;
              } else {
                ((qe) this).field_n = 1.0f;
                break L1;
              }
            }
          }
        }
        L2: {
          if (((qe) this).field_l <= 2950) {
            break L2;
          } else {
            if (((qe) this).field_l % 1500 != 49) {
              break L2;
            } else {
              ((qe) this).field_n = 2.0f;
              break L2;
            }
          }
        }
        if (!param1) {
          L3: {
            if (((qe) this).field_l <= 0) {
              break L3;
            } else {
              if (1550 < ((qe) this).field_l) {
                break L3;
              } else {
                if (49 == ((qe) this).field_l % 50) {
                  ((qe) this).field_n = 2.0f;
                  uj discarded$1 = nm.b(-127, 47);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            if (!((qe) this).field_j) {
              break L4;
            } else {
              if (1.0f < ((qe) this).field_n) {
                this.f(110);
                break L4;
              } else {
                if (49 != ((qe) this).field_l % 50) {
                  break L4;
                } else {
                  this.f(110);
                  break L4;
                }
              }
            }
          }
          L5: {
            if (param0 != ((qe) this).field_c) {
              this.b(param0, 2394342);
              ((qe) this).field_c = param0;
              break L5;
            } else {
              break L5;
            }
          }
          dl.field_h.b((byte) 127);
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_q = null;
        field_k = null;
        field_o = null;
    }

    final static String b(int param0) {
        return rb.field_a;
    }

    final static void a(ul param0, int param1, ul param2, ul param3) {
        RuntimeException var4 = null;
        ri[] var5 = null;
        ri[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ri[] var10 = null;
        ja var11 = null;
        int var11_int = 0;
        ja var12 = null;
        int var13 = 0;
        ri[] var14 = null;
        ja var15 = null;
        int[][] var16 = null;
        ja var17 = null;
        ja var18 = null;
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            sn.field_Nb = pb.a("commonui", param2, -256, "frame_top");
            jh.field_Hb = pb.a("commonui", param2, -256, "frame_bottom");
            hq.field_e = fl.a("commonui", "jagex_logo_grey", param2, 11091);
            ui.field_k = pb.a("commonui", param2, -256, "button");
            rj.field_I = cn.a(true, "validation", param2, "commonui");
            cp.field_H = (fm) (Object) vo.a((byte) -46, "commonui", "arezzo12", param0, param2);
            ke.field_h = (fm) (Object) vo.a((byte) -46, "commonui", "arezzo14", param0, param2);
            ci.field_d = (fm) (Object) vo.a((byte) -46, "commonui", "arezzo14bold", param0, param2);
            var17 = new ja(param3.a("button.gif", "", false), (java.awt.Component) (Object) dk.field_Ib);
            ri discarded$1 = wq.a(-121, "commonui", param2, "dropdown");
            var5 = da.a("screen_options", param2, (byte) 19, "commonui");
            mc.field_h = new ri[4];
            lo.field_a = new ri[4];
            mo.field_Ob = new ri[4];
            var6 = new ri[][]{lo.field_a, mo.field_Ob, mc.field_h};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_l;
            var8 = 1;
            L1: while (true) {
              if (var21.length <= var8) {
                var8 = var5[0].field_m[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_w;
                    m.c(540);
                    var17.a();
                    oo.a(0, 0, oo.field_b, oo.field_l);
                    var15 = new ja(var9, var9);
                    var18 = var15;
                    var18.a();
                    var17.c(0, 0);
                    var11 = new ja(var9, var9);
                    var11.a();
                    var17.c(var9 + -var17.field_x, 0);
                    var12 = new ja(-(var9 * 2) + var17.field_x, var9);
                    var12.a();
                    var17.c(-var9, 0);
                    ql.a(true);
                    ui.field_k = new ja[]{var15, var12, var11};
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
                        var14[var11_int] = nk.a(96, var21[var11_int], var5[var9]);
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
            stackOut_12_1 = new StringBuilder().append("qe.AA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(-8995).append(',');
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -21991) {
            break L0;
          } else {
            ((qe) this).field_b = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((qe) this).field_j) {
              break L2;
            } else {
              if (((qe) this).field_l > 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void c(int param0) {
        ((qe) this).field_j = false;
        if (param0 != 0) {
            ((qe) this).field_p = true;
        }
    }

    final void g(int param0) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!df.field_I) {
            if (((qe) this).field_j) {
                if (((qe) this).field_l > 0) {
                    g.a(jj.field_F[5], 430, 40);
                    rb.field_e[5].g(430, 40);
                }
            }
        }
        oo.e(0, 440, 640, 40, 0);
        g.a(jj.field_F[0], 0, 410);
        rb.field_e[0].g(5, 415);
        g.a(jj.field_F[2], 70, 400);
        rb.field_e[2].g(70, 400);
        kb var5 = op.field_m;
        if (2 <= kj.field_q) {
            qp.field_w.c("L" + var5.field_r, 12, 468, 16777215, 1);
        }
        g.c();
        oo.h(0, 0, 640, 40);
        oo.e(0, 0, 640, 40, 0);
        for (var3 = 0; var5.field_t > var3; var3++) {
            this.a((byte) -126, var3);
        }
        if (param0 != -27635) {
            ((qe) this).field_n = 0.8482644557952881f;
        }
        g.b();
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        ef var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ja var14 = null;
        String var16 = null;
        String var17 = null;
        kb var18 = null;
        kb var19 = null;
        String var21 = null;
        String var22 = null;
        int[] var25 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var18 = op.field_m;
          var19 = var18;
          if (0 == (1 << param1 & var19.field_F)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var5 = var18.field_d[param1];
          var25 = op.field_m.field_D[param1];
          if (param1 != fb.field_e.field_M) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_6_0;
          var8 = var25[0];
          var9 = qp.field_w;
          var10 = 160;
          var11 = param1 * var10;
          var12 = 20;
          var13 = var10 + var11;
          oo.a(var11, 0, -var11 + var13, 38, 65793, 1981188);
          oo.g(var13, 0, 38, 3102221);
          var14 = am.a(0, var18.field_D[param1][1], 0, 1, var18.field_D[param1][0]);
          var14.g(var11, -1 + (-24 + var12));
          var21 = var18.field_b[param1];
          var22 = fm.a((fm) (Object) var9, var21, -2 + var10 + -48);
          ((fm) (Object) var9).c(var22, 48 + var11, var12, var8, 0);
          if (var4 != 0) {
            break L2;
          } else {
            L3: {
              L4: {
                if (var19.field_l == 1) {
                  break L4;
                } else {
                  if (var19.field_l == 0) {
                    break L4;
                  } else {
                    if (var7 == 0) {
                      var16 = en.field_e;
                      var17 = ob.field_C;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var16 = vl.a(ob.field_q, new String[1], 2);
              var17 = vl.a(bi.field_b, new String[1], 2);
              break L3;
            }
            ((fm) (Object) var9).c(var16, var11 + 48, 3 + (((fm) (Object) var9).field_w + var12), var8, 0);
            ((fm) (Object) var9).a(var17, var13, var12 + ((fm) (Object) var9).field_w - -3, 16777215, 0);
            break L2;
          }
        }
        L5: {
          oo.b(var11, 38, 1 + var13, 2763045);
          oo.b(var11, 39, var13 + 1, 2763045);
          if (var4 != 0) {
            oo.f(var11, 0, var13 - var11, 38, 65793, 196);
            int discarded$1 = ((fm) (Object) var9).a(vl.a(uf.field_i, new String[1], 2), var11, 0, var13 + -var11, 40, 16777215, 1, 1, 1, 0);
            break L5;
          } else {
            break L5;
          }
        }
    }

    private final void a(boolean param0) {
        g.c();
        rb.field_e[3].a();
        oo.b();
        ((qe) this).field_i.a(Integer.toString(((qe) this).field_h), -5 + oo.field_b, 5 + ((qe) this).field_i.field_C, 1, 65793);
        jj.field_F[3].a();
        oo.b();
        rb.field_e[3].f(0, 0, 16777215);
        jm.d((byte) -18);
        rb.field_e[3].f(0, 0, 0);
        g.b();
    }

    private final void b(int param0, int param1) {
        g.c();
        rb.field_e[4].a();
        oo.b();
        ((qe) this).field_i.a(this.a(param0, 98), oo.field_b + -5, 5 + ((qe) this).field_i.field_C, 3, -1);
        jj.field_F[4].a();
        oo.b();
        rb.field_e[4].f(0, 0, 16777215);
        jm.d((byte) -18);
        rb.field_e[4].f(0, 0, 0);
        g.b();
    }

    final static void d(int param0) {
        l.field_a = 0;
        kg.field_k = null;
        bl.field_c = -1;
        tf.field_Db = -1;
        cb.field_l = false;
    }

    private final void e(byte param0) {
        g.c();
        rb.field_e[6].a();
        oo.b();
        ((qe) this).field_i.b(vl.a(ra.field_g, new String[2], 2), oo.field_b / 2, 5 + ((qe) this).field_i.field_C, 2, 65793);
        jj.field_F[6].a();
        oo.b();
        rb.field_e[6].f(0, 0, 16777215);
        jm.d((byte) -18);
        rb.field_e[6].f(0, 0, 0);
        g.b();
    }

    final boolean b(byte param0) {
        int var2 = -83 % ((-11 - param0) / 40);
        return fb.field_e.field_j <= fb.field_e.field_Y ? true : false;
    }

    private final void f(int param0) {
        int var3 = 0;
        int var4 = 0;
        g.c();
        if (param0 <= 100) {
            ((qe) this).a(-96, false);
        }
        int var2 = -1;
        if (((qe) this).field_n != 1.0f) {
            eg.field_D.a();
            oo.b();
            ((qe) this).field_i.a(this.d((byte) 51), -5 + oo.field_b, ((qe) this).field_i.field_C + 5, 2, var2);
            var3 = (int)((float)oo.field_b * ((qe) this).field_n);
            var4 = (int)((float)oo.field_l * ((qe) this).field_n);
            rb.field_e[5].a();
            oo.b();
            eg.field_D.f(oo.field_b + -var3, 0, var3, var4);
        } else {
            rb.field_e[5].a();
            oo.b();
            ((qe) this).field_i.a(this.d((byte) -51), oo.field_b - 5, ((qe) this).field_i.field_C - -5, 0, var2);
        }
        jj.field_F[5].a();
        oo.b();
        rb.field_e[5].f(0, 0, 16777215);
        jm.d((byte) -18);
        rb.field_e[5].f(0, 0, 0);
        g.b();
    }

    final void b(byte param0, int param1) {
        if (!(3050 >= param1)) {
            ((qe) this).field_j = false;
            return;
        }
        ((qe) this).field_l = param1;
        if (!(((qe) this).field_j)) {
            this.f(102);
        }
        if (param0 < 89) {
            field_o = null;
        }
        ((qe) this).field_j = true;
    }

    final void h(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        ((qe) this).field_h = 0;
        if (param0 != 2) {
            ((qe) this).field_j = false;
        }
        br var2 = fb.field_e.field_H.c(83);
        while (var2 instanceof id) {
            if (!(!(var2 instanceof wb))) {
                ((qe) this).field_h = ((qe) this).field_h + 1;
            }
            var2 = var2.field_d;
        }
        this.e(430);
        this.a(false);
        if (((qe) this).field_b) {
            this.e((byte) 30);
        }
        dl.field_h.b((byte) 103);
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = oe.a(param1.length, param1, false, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qe.E(").append(-2739).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean i(int param0) {
        return ((qe) this).field_h <= 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param8 < param12) {
            if (param12 >= param5) {
              if (param8 >= param5) {
                un.a(oo.field_i, param13, param1, -10423, param12, param0, param9, param8, param2, param5, param6, param7, param14, param4, param3, param11, param10);
                break L0;
              } else {
                un.a(oo.field_i, param13, param4, -10423, param12, param2, param3, param5, param0, param8, param6, param14, param7, param1, param9, param11, param10);
                break L0;
              }
            } else {
              un.a(oo.field_i, param7, param6, -10423, param5, param2, param3, param12, param11, param8, param4, param14, param13, param1, param10, param0, param9);
              break L0;
            }
          } else {
            if (param8 < param5) {
              un.a(oo.field_i, param7, param1, -10423, param5, param11, param10, param8, param2, param12, param4, param13, param14, param6, param3, param0, param9);
              break L0;
            } else {
              if (param12 >= param5) {
                un.a(oo.field_i, param14, param6, -10423, param8, param0, param9, param12, param11, param5, param1, param7, param13, param4, param10, param2, param3);
                break L0;
              } else {
                un.a(oo.field_i, param14, param4, -10423, param8, param11, param10, param5, param0, param12, param1, param13, param7, param6, param9, param2, param3);
                break L0;
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        int var1 = -58 % ((param0 - 45) / 56);
        Object var2 = null;
        cb.a((String) null, 32, "");
    }

    private final void e(int param0) {
        g.c();
        rb.field_e[2].a();
        oo.b();
        int var2 = op.field_m.field_I;
        int var3 = op.field_m.field_g;
        if (99 < var2) {
            ((qe) this).field_i.c("/" + var2, 22, 2 * ((qe) this).field_i.field_C + 6, 2, 65793);
            ((qe) this).field_i.c(Integer.toString(var3), 15, ((qe) this).field_i.field_C - -6, 2, 65793);
        } else {
            ((qe) this).field_i.c(var3 + "/" + var2, 20, -3 + 2 * ((qe) this).field_i.field_C, 2, 65793);
        }
        jj.field_F[2].a();
        oo.b();
        rb.field_e[2].f(0, 0, 16777215);
        jm.d((byte) -18);
        rb.field_e[2].f(0, 0, 0);
        g.b();
    }

    private final String d(byte param0) {
        int var2 = ((qe) this).field_l / 3000;
        int var4 = 78 / ((param0 - 10) / 33);
        int var3 = ((qe) this).field_l % 3000 / 50;
        if (var3 < 0) {
            var3 = 0;
        }
        return var2 + ":" + (10 <= var3 ? "" : "0") + var3;
    }

    qe() {
        ((qe) this).field_p = false;
        ((qe) this).field_m = 0;
        ((qe) this).field_h = 0;
        ((qe) this).field_l = 0;
        ((qe) this).field_b = false;
        ((qe) this).field_c = 0;
        ((qe) this).field_a = 80;
        ((qe) this).field_j = true;
        ((qe) this).field_d = 0;
        ((qe) this).field_n = 1.0f;
        ((qe) this).field_i = ah.field_e;
        this.f(112);
        this.b(((qe) this).field_c, 2394342);
        ((qe) this).h(2);
        dl.field_h.b((byte) 102);
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 <= -121) {
              stackOut_3_0 = bo.field_b.a("", param1, false);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qe.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
    }
}
