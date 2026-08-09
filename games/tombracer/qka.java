/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qka extends qra {
    private int[] field_r;
    static jpa[] field_o;
    private int field_n;
    static long[] field_m;
    static String field_s;
    private boolean field_q;
    private fna[] field_p;

    public static void b(byte param0) {
        field_m = null;
        if (param0 <= 28) {
            field_m = (long[]) null;
        }
        field_o = null;
        field_s = null;
    }

    qka(qh param0, v param1) {
        super(param0, param1);
        int stackIn_26_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        this.field_n = -1;
        try {
          L0: {
            this.field_r = new int[this.field_c.field_k];
            var3_int = 0;
            L1: while (true) {
              if (this.field_c.field_k <= var3_int) {
                L2: {
                  if (this.field_h.d((byte) 116)) {
                    er.b(1, 0);
                    break L2;
                  } else {
                    L3: {
                      if (0 != this.field_r[this.field_h.field_x]) {
                        break L3;
                      } else {
                        if (-1 >= (this.field_c.field_z ^ -1)) {
                          er.b(1, 2);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    er.b(1, 3);
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    if (!this.field_h.field_D) {
                      break L5;
                    } else {
                      if (!this.field_h.d((byte) 82)) {
                        this.field_p = new fna[2];
                        this.field_p[0] = new fna(33, wba.field_q[33], 1, false);
                        this.field_p[0].field_b = aaa.a(false) + -110;
                        this.field_p[0].field_i = koa.b(0) - 25;
                        this.field_p[0].a(false);
                        this.field_p[1] = new fna(34, wba.field_q[34], 1, false);
                        this.field_p[1].field_b = 100;
                        this.field_p[1].field_i = koa.b(0) + -25;
                        this.field_p[1].a(false);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    this.field_p = new fna[1];
                    if (this.field_h.field_D) {
                      stackIn_26_0 = 33;
                      break L6;
                    } else {
                      stackIn_26_0 = 16;
                      break L6;
                    }
                  }
                  L7: {
                    var3_int = stackIn_26_0;
                    this.field_p[0] = new fna(var3_int, wba.field_q[var3_int], 0, false);
                    this.field_p[0].field_b = -100 + aaa.a(false);
                    this.field_p[0].field_i = koa.b(0) - 25;
                    this.field_p[0].a(false);
                    if (this.field_h.field_D) {
                      break L7;
                    } else {
                      if (vpa.a(43)) {
                        break L7;
                      } else {
                        this.field_p[0].field_e = aua.field_d.toUpperCase();
                        pt.field_p = uta.a(3, this.field_h.m(-1), 0, 10, 1);
                        break L7;
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              } else {
                var4 = 0;
                var5 = 0;
                L8: while (true) {
                  if (this.field_c.field_v.length <= var5) {
                    L9: {
                      if (!this.field_c.f((byte) -117, var3_int)) {
                        break L9;
                      } else {
                        var4 = this.field_c.field_k + -1;
                        break L9;
                      }
                    }
                    L10: {
                      if (1 != (this.field_c.field_z ^ -1)) {
                        break L10;
                      } else {
                        var4 = 0;
                        break L10;
                      }
                    }
                    this.field_r[var3_int] = var4;
                    var3_int++;
                    continue L1;
                  } else {
                    L11: {
                      if ((var5 ^ -1) == (var3_int ^ -1)) {
                        break L11;
                      } else {
                        if (this.field_c.field_v[var5] <= this.field_c.field_v[var3_int]) {
                          break L11;
                        } else {
                          if (this.field_c.f((byte) -96, var5)) {
                            break L11;
                          } else {
                            var4++;
                            break L11;
                          }
                        }
                      }
                    }
                    var5++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("qka.<init>(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L12;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L13;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return false;
        }
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param2 == 13) {
            this.a(127, 0);
        } else {
            if ((param2 ^ -1) == -35) {
                this.a(127, 0);
            } else {
                if (param2 == 83) {
                    this.a(127, 0);
                }
            }
        }
        if (param1 != 25) {
            return false;
        }
        return true;
    }

    final void b(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        fna stackIn_59_0;
        int stackIn_59_1;
        int stackIn_59_2;
        int stackIn_59_3;
        fna stackIn_60_0;
        int stackIn_60_1;
        int stackIn_60_2;
        int stackIn_60_3;
        int stackIn_60_4;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        Object var12_ref = null;
        Exception var13_ref_Exception = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          ura.a(-10985);
          la.field_j.a(0, 0);
          if (this.field_h.field_D) {
            var3 = aaa.a(false) >> 719911137;
            var4 = (aaa.a(false) >> -795711711) / 3 + 37;
            var5 = 56;
            var6 = this.field_c.field_k;
            var22 = 0;
            var7 = var22;
            L1: while (true) {
              if (var22 >= var6) {
                break L0;
              } else {
                L2: {
                  var8 = this.field_r[var22];
                  var9 = -var8 + var6;
                  var10 = -(var5 * var9) + koa.b(0);
                  var11 = var4 * var22 + (var3 - (var4 >> -1106508735) * (-1 + var6));
                  this.field_c.field_H[var22].n((byte) -120).a(-1, var11, 800, 0, var10);
                  vna.field_c.a(var11 + -(vna.field_c.a() >> 1477401377) + 1, var10 + -8);
                  if ((var8 ^ -1) == -1) {
                    sta.field_y[-1 + sta.field_y.length].a(-(sta.field_y[sta.field_y.length - 1].a() >> 2061309825) + var11 + -1, var10 + -12);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var12 = 150;
                cha.a(-60 + var11, 2, tga.field_a, 4, var10 + -250, 120, 65793 | var12 << -489188680, 1, 100);
                oka.a(this.field_h.a(var22, false).toUpperCase(), wga.field_a[var22], kn.field_p, -1, var10 + -230, var11, 0);
                try {
                  L3: {
                    tga.field_a.a(var11, var10 - 140, 10 + var11, -151 + var10, var11, var10 - 151, 65793 | var12 << -1346753000, var12 << 1191458392 | 65793, var12 << 1898139576 | 65793, 1);
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
                    break L4;
                  }
                }
                if (!this.field_c.f((byte) -102, var22)) {
                  L5: {
                    var13 = 7829367;
                    if (-2 != this.field_c.field_z) {
                      be.a(gl.a((byte) 93, ga.field_K.toUpperCase(), new String[]{Integer.toString(this.field_c.field_v[var22])}).toUpperCase(), 1, kn.field_p, var13, 16, 60, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                      break L5;
                    } else {
                      be.a(paa.field_y.toUpperCase(), 1, kn.field_p, var13, 16, 70, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                      break L5;
                    }
                  }
                  if (this.field_c.g(69, var22)) {
                    be.a(w.field_d.toUpperCase(), 1, kn.field_p, 3385907, 16, 40, 1, var10 - 203, -50 + var11, 0, (byte) 60, 100);
                    var22++;
                    continue L1;
                  } else {
                    var22++;
                    continue L1;
                  }
                } else {
                  oka.a(id.field_i.toUpperCase(), 11141120, kn.field_p, -1, var10 + -190, var11, 0);
                  var22++;
                  continue L1;
                }
              }
            }
          } else {
            L6: {
              var3 = aaa.a(false) >> -1580473983;
              var4 = koa.b(0) >> 1754536289;
              gg.field_f.a(-(gg.field_f.a() >> 1028426561) + var3, -(gg.field_f.c() >> 944730817) + var4);
              var5 = 260;
              var6 = 40;
              var7 = var3;
              var8 = var4 + -80;
              kq.field_a.a(var7 - (kq.field_a.a() >> 747481697), var8 - (kq.field_a.c() >> -1359371199));
              var9 = this.field_h.m(-1);
              if (pl.a((byte) 64) != var9) {
                stackIn_4_0 = 0;
                break L6;
              } else {
                stackIn_4_0 = 1;
                break L6;
              }
            }
            L7: {
              var11 = stackIn_4_0;
              if (var11 != 0) {
                var10_ref_String = id.field_k.toUpperCase();
                break L7;
              } else {
                var10_ref_String = vj.field_d[var9].toUpperCase();
                break L7;
              }
            }
            L8: {
              be.a(var10_ref_String, 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var6, 1, -(var6 >> -2112849183) + var8, var7 - (var5 >> 1833720769), -1, (byte) 60, var5);
              oka.a(this.field_h.a(this.field_h.field_x, false).toUpperCase(), wga.field_a[this.field_h.field_x], eda.field_f, -1, -15 + var4, var3, -1);
              if ((this.field_c.field_z ^ -1) > -1) {
                oka.a(wpa.field_K.toUpperCase(), 2431750, eda.field_f, -1, var4 - 40, var3, -1);
                oka.a(sg.field_n.toUpperCase(), 2431750, kn.field_p, -1, 45 + var4, var3, -1);
                break L8;
              } else {
                oka.a(iaa.field_a.toUpperCase(), 2431750, eda.field_f, -1, -40 + var4, var3, -1);
                if (var9 == uca.field_a) {
                  L9: {
                    var12_ref = null;
                    var13_ref_String = hb.field_v;
                    if (ea.field_j != 3) {
                      break L9;
                    } else {
                      var12_ref = za.field_g;
                      var13_ref_String = uaa.field_d;
                      break L9;
                    }
                  }
                  L10: {
                    if (-3 == (ea.field_j ^ -1)) {
                      var13_ref_String = qna.field_c;
                      var12_ref = bca.field_d;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-2 == (ea.field_j ^ -1)) {
                      var13_ref_String = ps.field_P;
                      var12_ref = rm.field_c;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var12_ref != null) {
                      ((nh) (var12_ref)).a(var3 - (120 - -(((nh) (var12_ref)).d() / 2)), var4 - 10);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  oka.a(var13_ref_String, 65793, kn.field_p, -1, 35 + var4, var3 + -120, -1);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            if (var11 != 0) {
              var24 = dea.a(this.field_c.c((byte) 115, this.field_h.field_x), (byte) -8);
              oka.a(cc.field_l.toUpperCase() + " " + var24.toUpperCase(), 2431750, kn.field_p, -1, 20 + var4, -120 + var3, -1);
              oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, var4, 120 + var3, -1);
              var13 = this.field_h.field_k.field_G[this.field_h.field_x].field_g.v(74);
              oka.a(Integer.toString(var13), 2431750, eda.field_f, -1, 20 + var4, 120 + var3, -1);
              break L0;
            } else {
              var23 = dea.a(this.field_c.c((byte) 115, this.field_h.field_x), (byte) -8);
              oka.a(cc.field_l.toUpperCase() + " " + var23.toUpperCase(), 2431750, kn.field_p, -1, 48 + var4, var3 + -120, -1);
              za.field_g.a(-200 + var3, var4 + 60);
              var13 = as.a(var9, 0);
              ts.a(-1, -36, var4 - -79, dea.a(var13, (byte) -8), -200 + (var3 + za.field_g.d()) - -5, kn.field_p, 2431750);
              bca.field_d.a(var3 - 110, 60 + var4);
              ts.a(-1, -92, 79 + var4, dea.a(var13 + var13 / 2, (byte) -8), bca.field_d.d() + (var3 - 110) + 5, kn.field_p, 2431750);
              oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, 5 + var4, 120 + var3, -1);
              var14 = this.field_h.field_k.field_G[this.field_h.field_x].field_g.v(110);
              oka.a(Integer.toString(var14), 2431750, eda.field_f, -1, var4 + 22, var3 + 120, -1);
              if (pt.field_p == null) {
                break L0;
              } else {
                if (pt.field_p.field_p == null) {
                  break L0;
                } else {
                  if (!pt.field_p.field_h) {
                    break L0;
                  } else {
                    L13: {
                      var15 = pt.field_p.field_p[1][0];
                      var16 = -var15 + var14;
                      if (var15 == 0) {
                        break L13;
                      } else {
                        oka.a(gl.a((byte) 103, lea.field_F, new String[]{Integer.toString(var15).toUpperCase() + " " + qu.a(var16, -1)}), 2431750, kn.field_p, -1, 50 + var4, 120 + var3, -1);
                        break L13;
                      }
                    }
                    var17 = 0;
                    var18 = null;
                    var19 = 0;
                    L14: while (true) {
                      L15: {
                        if (pt.field_p.field_k[2].length <= var19) {
                          break L15;
                        } else {
                          var20 = pt.field_p.field_k[2][var19];
                          if (ue.a(var20, 0)) {
                            var19++;
                            continue L14;
                          } else {
                            var17 = pt.field_p.field_p[2][var19];
                            var18 = var20;
                            break L15;
                          }
                        }
                      }
                      if (var18 == null) {
                        break L0;
                      } else {
                        var16 = var14 - var17;
                        be.a(gl.a((byte) 121, qw.field_g, new String[]{Integer.toString(var17).toUpperCase() + " " + qu.a(var16, -1), (String) (var18)}), 0, kn.field_p, 2431750, 13, 50, 1, var4 + 60, var3, -1, (byte) 60, 240);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        se.f((byte) -6);
        var3 = 0;
        L16: while (true) {
          if (var3 >= this.field_p.length) {
            L17: {
              if (param0 < -50) {
                break L17;
              } else {
                field_m = (long[]) null;
                break L17;
              }
            }
            return;
          } else {
            L18: {
              stackIn_59_0 = this.field_p[var3];

              stackIn_59_1 = 0;

              stackIn_59_2 = 1;

              stackIn_59_3 = 1;

              if (this.field_n != var3) {
                stackIn_60_0 = (fna) ((Object) stackIn_59_0);
                stackIn_60_1 = stackIn_59_1;
                stackIn_60_2 = stackIn_59_2;
                stackIn_60_3 = stackIn_59_3;
                stackIn_60_4 = 0;
                break L18;
              } else {
                stackIn_60_0 = (fna) ((Object) stackIn_59_0);
                stackIn_60_1 = stackIn_59_1;
                stackIn_60_2 = stackIn_59_2;
                stackIn_60_3 = stackIn_59_3;
                stackIn_60_4 = 1;
                break L18;
              }
            }
            ((fna) (Object) stackIn_60_0).a(stackIn_60_1 != 0, stackIn_60_2 != 0, stackIn_60_3, stackIn_60_4 != 0);
            var3++;
            continue L16;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (0 != (param1 ^ -1)) {
          L0: {
            if (param0 > 114) {
              break L0;
            } else {
              this.b(-124, false);
              break L0;
            }
          }
          L1: {
            if (param1 == 0) {
              this.field_h.b(false, true, 0);
              if (this.field_h.field_D) {
                r.a(0, this.field_h.d((byte) 120));
                break L1;
              } else {
                ea.field_j = -1;
                break L1;
              }
            } else {
              if (-2 == (param1 ^ -1)) {
                ql.field_k.k(67, -2988);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        hf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_24_0 = 0;
        fna stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        fna stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int var3;
        int var4;
        hf var4_ref_hf;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_c.field_H.length) {
            L1: {
              this.field_n = -1;
              this.field_q = true;
              if (param0 == 80) {
                break L1;
              } else {
                this.b(12, true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (this.field_p.length <= var3) {
                L3: {
                  if (!this.field_h.field_D) {
                    break L3;
                  } else {
                    if (!this.field_h.d((byte) 69)) {
                      var3 = this.field_h.field_k.field_t;
                      if (-2 == (var3 >> this.field_h.field_x & 1 ^ -1)) {
                        this.field_p[1].field_e = df.field_I.toUpperCase();
                        break L3;
                      } else {
                        if (-1 != (var3 ^ -1)) {
                          this.field_p[1].field_e = ot.field_t.toUpperCase();
                          break L3;
                        } else {
                          if (this.field_h.field_k.a(this.field_h.field_x, true)) {
                            this.field_p[1].field_e = sl.field_g.toUpperCase();
                            break L3;
                          } else {
                            this.field_p[1].field_e = kna.field_E.toUpperCase();
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              } else {
                L4: {
                  if (param1) {
                    if (this.field_p[var3].field_b - 80 <= jba.field_j) {
                      if (jba.field_j < 80 + this.field_p[var3].field_b) {
                        if (-25 + this.field_p[var3].field_i <= sta.field_B) {
                          if (this.field_p[var3].field_i - -25 > sta.field_B) {
                            stackIn_24_0 = 1;
                            break L4;
                          } else {
                            stackIn_24_0 = 0;
                            break L4;
                          }
                        } else {
                          stackIn_24_0 = 0;
                          break L4;
                        }
                      } else {
                        stackIn_24_0 = 0;
                        break L4;
                      }
                    } else {
                      stackIn_24_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_24_0 = 0;
                    break L4;
                  }
                }
                L5: {
                  var4 = stackIn_24_0;
                  if (var4 != 0) {
                    this.field_n = var3;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  stackIn_29_0 = this.field_p[var3];

                  stackIn_29_1 = 1;

                  if (this.field_n != var3) {
                    stackIn_30_0 = (fna) ((Object) stackIn_29_0);
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = 0;
                    break L6;
                  } else {
                    stackIn_30_0 = (fna) ((Object) stackIn_29_0);
                    stackIn_30_1 = stackIn_29_1;
                    stackIn_30_2 = 1;
                    break L6;
                  }
                }
                ((fna) (Object) stackIn_30_0).a(stackIn_30_1 != 0, stackIn_30_2 != 0, true, 6);
                if (param1) {
                  if (var4 != 0) {
                    if (0 != hf.field_b) {
                      this.a(120, var3);
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          } else {
            L7: {
              var4_ref_hf = (hf) ((Object) this.field_c.field_H[var3].n((byte) -67));
              if (this.field_q) {
                break L7;
              } else {
                L8: {
                  stackIn_5_0 = (hf) (var4_ref_hf);

                  stackIn_5_1 = 26;

                  if (var3 != this.field_c.field_z) {
                    stackIn_6_0 = (hf) ((Object) stackIn_5_0);
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    break L8;
                  } else {
                    stackIn_6_0 = (hf) ((Object) stackIn_5_0);
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 23;
                    break L8;
                  }
                }
                ((hf) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, false);
                break L7;
              }
            }
            var4_ref_hf.a(21463);
            var4_ref_hf.f(-4366);
            var3++;
            continue L0;
          }
        }
    }

    static {
        field_s = "Solo Adventure";
    }
}
