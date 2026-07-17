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
        field_o = null;
        field_s = null;
    }

    qka(qh param0, v param1) {
        super(param0, param1);
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        ((qka) this).field_n = -1;
        try {
          L0: {
            ((qka) this).field_r = new int[((qka) this).field_c.field_k];
            var3_int = 0;
            L1: while (true) {
              if (((qka) this).field_c.field_k <= var3_int) {
                L2: {
                  if (((qka) this).field_h.d((byte) 116)) {
                    er.b(1, 0);
                    break L2;
                  } else {
                    L3: {
                      if (0 != ((qka) this).field_r[((qka) this).field_h.field_x]) {
                        break L3;
                      } else {
                        if (((qka) this).field_c.field_z >= 0) {
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
                    if (!((qka) this).field_h.field_D) {
                      break L5;
                    } else {
                      if (!((qka) this).field_h.d((byte) 82)) {
                        ((qka) this).field_p = new fna[2];
                        ((qka) this).field_p[0] = new fna(33, wba.field_q[33], 1, false);
                        ((qka) this).field_p[0].field_b = aaa.a(false) + -110;
                        ((qka) this).field_p[0].field_i = koa.b(0) - 25;
                        ((qka) this).field_p[0].a(false);
                        ((qka) this).field_p[1] = new fna(34, wba.field_q[34], 1, false);
                        ((qka) this).field_p[1].field_b = 100;
                        ((qka) this).field_p[1].field_i = koa.b(0) + -25;
                        ((qka) this).field_p[1].a(false);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    ((qka) this).field_p = new fna[1];
                    if (((qka) this).field_h.field_D) {
                      stackOut_25_0 = 33;
                      stackIn_26_0 = stackOut_25_0;
                      break L6;
                    } else {
                      stackOut_24_0 = 16;
                      stackIn_26_0 = stackOut_24_0;
                      break L6;
                    }
                  }
                  var3_int = stackIn_26_0;
                  ((qka) this).field_p[0] = new fna(var3_int, wba.field_q[var3_int], 0, false);
                  ((qka) this).field_p[0].field_b = -100 + aaa.a(false);
                  ((qka) this).field_p[0].field_i = koa.b(0) - 25;
                  ((qka) this).field_p[0].a(false);
                  if (((qka) this).field_h.field_D) {
                    break L4;
                  } else {
                    if (vpa.a(43)) {
                      break L4;
                    } else {
                      ((qka) this).field_p[0].field_e = aua.field_d.toUpperCase();
                      pt.field_p = uta.a(3, ((qka) this).field_h.m(-1), 0, 10, 1);
                      break L4;
                    }
                  }
                }
                break L0;
              } else {
                var4 = 0;
                var5 = 0;
                L7: while (true) {
                  if (((qka) this).field_c.field_v.length <= var5) {
                    L8: {
                      if (!((qka) this).field_c.f((byte) -117, var3_int)) {
                        break L8;
                      } else {
                        var4 = ((qka) this).field_c.field_k + -1;
                        break L8;
                      }
                    }
                    L9: {
                      if (((qka) this).field_c.field_z != -2) {
                        break L9;
                      } else {
                        var4 = 0;
                        break L9;
                      }
                    }
                    ((qka) this).field_r[var3_int] = var4;
                    var3_int++;
                    continue L1;
                  } else {
                    L10: {
                      if (var5 == var3_int) {
                        break L10;
                      } else {
                        if (((qka) this).field_c.field_v[var5] <= ((qka) this).field_c.field_v[var3_int]) {
                          break L10;
                        } else {
                          if (((qka) this).field_c.f((byte) -96, var5)) {
                            break L10;
                          } else {
                            var4++;
                            break L10;
                          }
                        }
                      }
                    }
                    var5++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("qka.<init>(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
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
            if (param2 == 34) {
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
        int stackIn_4_0 = 0;
        fna stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        fna stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        fna stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        fna stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        fna stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        fna stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          ura.a(-10985);
          la.field_j.a(0, 0);
          if (((qka) this).field_h.field_D) {
            var3 = aaa.a(false) >> 1;
            var4 = (aaa.a(false) >> 1) / 3 + 37;
            var5 = 56;
            var6 = ((qka) this).field_c.field_k;
            var22 = 0;
            var7 = var22;
            L1: while (true) {
              if (var22 >= var6) {
                break L0;
              } else {
                L2: {
                  var8 = ((qka) this).field_r[var22];
                  var9 = -var8 + var6;
                  var10 = -(var5 * var9) + koa.b(0);
                  var11 = var4 * var22 + (var3 - (var4 >> 1) * (-1 + var6));
                  ((qka) this).field_c.field_H[var22].n((byte) -120).a(-1, var11, 800, 0, var10);
                  vna.field_c.a(var11 + -(vna.field_c.a() >> 1) + 1, var10 + -8);
                  if (var8 == 0) {
                    sta.field_y[-1 + sta.field_y.length].a(-(sta.field_y[sta.field_y.length - 1].a() >> 1) + var11 + -1, var10 + -12);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var12 = 150;
                cha.a(-60 + var11, 2, tga.field_a, 4, var10 + -250, 120, 65793 | var12 << 24, 1, 100);
                oka.a(((qka) this).field_h.a(var22, false).toUpperCase(), wga.field_a[var22], kn.field_p, -1, var10 + -230, var11, 0);
                try {
                  L3: {
                    tga.field_a.a(var11, var10 - 140, 10 + var11, -151 + var10, var11, var10 - 151, 65793 | var12 << 24, var12 << 24 | 65793, var12 << 24 | 65793, 1);
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
                    break L4;
                  }
                }
                L5: {
                  if (!((qka) this).field_c.f((byte) -102, var22)) {
                    L6: {
                      var13 = 7829367;
                      if (-2 != ((qka) this).field_c.field_z) {
                        int discarded$5 = be.a(gl.a((byte) 93, ga.field_K.toUpperCase(), new String[1]).toUpperCase(), 1, kn.field_p, var13, 16, 60, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                        break L6;
                      } else {
                        int discarded$6 = be.a(paa.field_y.toUpperCase(), 1, kn.field_p, var13, 16, 70, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                        break L6;
                      }
                    }
                    if (!((qka) this).field_c.g(69, var22)) {
                      break L5;
                    } else {
                      int discarded$7 = be.a(w.field_d.toUpperCase(), 1, kn.field_p, 3385907, 16, 40, 1, var10 - 203, -50 + var11, 0, (byte) 60, 100);
                      break L5;
                    }
                  } else {
                    oka.a(id.field_i.toUpperCase(), 11141120, kn.field_p, -1, var10 + -190, var11, 0);
                    break L5;
                  }
                }
                var22++;
                continue L1;
              }
            }
          } else {
            L7: {
              var3 = aaa.a(false) >> 1;
              var4 = koa.b(0) >> 1;
              gg.field_f.a(-(gg.field_f.a() >> 1) + var3, -(gg.field_f.c() >> 1) + var4);
              var5 = 260;
              var6 = 40;
              var7 = var3;
              var8 = var4 + -80;
              kq.field_a.a(var7 - (kq.field_a.a() >> 1), var8 - (kq.field_a.c() >> 1));
              var9 = ((qka) this).field_h.m(-1);
              if (pl.a((byte) 64) != var9) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L7;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L7;
              }
            }
            L8: {
              var11 = stackIn_4_0;
              if (var11 != 0) {
                var10_ref_String = id.field_k.toUpperCase();
                break L8;
              } else {
                var10_ref_String = vj.field_d[var9].toUpperCase();
                break L8;
              }
            }
            L9: {
              int discarded$8 = be.a(var10_ref_String, 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var6, 1, -(var6 >> 1) + var8, var7 - (var5 >> 1), -1, (byte) 60, var5);
              oka.a(((qka) this).field_h.a(((qka) this).field_h.field_x, false).toUpperCase(), wga.field_a[((qka) this).field_h.field_x], eda.field_f, -1, -15 + var4, var3, -1);
              if (((qka) this).field_c.field_z < 0) {
                oka.a(wpa.field_K.toUpperCase(), 2431750, eda.field_f, -1, var4 - 40, var3, -1);
                oka.a(sg.field_n.toUpperCase(), 2431750, kn.field_p, -1, 45 + var4, var3, -1);
                break L9;
              } else {
                oka.a(iaa.field_a.toUpperCase(), 2431750, eda.field_f, -1, -40 + var4, var3, -1);
                if (var9 == uca.field_a) {
                  L10: {
                    var12_ref = null;
                    var13_ref_String = hb.field_v;
                    if (ea.field_j != 3) {
                      break L10;
                    } else {
                      var12_ref = (Object) (Object) za.field_g;
                      var13_ref_String = uaa.field_d;
                      break L10;
                    }
                  }
                  L11: {
                    if (ea.field_j == 2) {
                      var13_ref_String = qna.field_c;
                      var12_ref = (Object) (Object) bca.field_d;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (ea.field_j == 1) {
                      var13_ref_String = ps.field_P;
                      var12_ref = (Object) (Object) rm.field_c;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var12_ref != null) {
                      ((nh) var12_ref).a(var3 - (120 - -(((nh) var12_ref).d() / 2)), var4 - 10);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  oka.a(var13_ref_String, 65793, kn.field_p, -1, 35 + var4, var3 + -120, -1);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            if (var11 != 0) {
              var24 = dea.a(((qka) this).field_c.c((byte) 115, ((qka) this).field_h.field_x), (byte) -8);
              oka.a(cc.field_l.toUpperCase() + " " + var24.toUpperCase(), 2431750, kn.field_p, -1, 20 + var4, -120 + var3, -1);
              oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, var4, 120 + var3, -1);
              var13 = ((qka) this).field_h.field_k.field_G[((qka) this).field_h.field_x].field_g.v(74);
              oka.a(Integer.toString(var13), 2431750, eda.field_f, -1, 20 + var4, 120 + var3, -1);
              break L0;
            } else {
              L14: {
                var23 = dea.a(((qka) this).field_c.c((byte) 115, ((qka) this).field_h.field_x), (byte) -8);
                oka.a(cc.field_l.toUpperCase() + " " + var23.toUpperCase(), 2431750, kn.field_p, -1, 48 + var4, var3 + -120, -1);
                za.field_g.a(-200 + var3, var4 + 60);
                var13 = as.a(var9, 0);
                ts.a(-1, -36, var4 - -79, dea.a(var13, (byte) -8), -200 + (var3 + za.field_g.d()) - -5, kn.field_p, 2431750);
                bca.field_d.a(var3 - 110, 60 + var4);
                ts.a(-1, -92, 79 + var4, dea.a(var13 + var13 / 2, (byte) -8), bca.field_d.d() + (var3 - 110) + 5, kn.field_p, 2431750);
                oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, 5 + var4, 120 + var3, -1);
                var14 = ((qka) this).field_h.field_k.field_G[((qka) this).field_h.field_x].field_g.v(110);
                oka.a(Integer.toString(var14), 2431750, eda.field_f, -1, var4 + 22, var3 + 120, -1);
                if (pt.field_p == null) {
                  break L14;
                } else {
                  if (pt.field_p.field_p == null) {
                    break L14;
                  } else {
                    if (!pt.field_p.field_h) {
                      break L14;
                    } else {
                      L15: {
                        var15 = pt.field_p.field_p[1][0];
                        var16 = -var15 + var14;
                        if (var15 == 0) {
                          break L15;
                        } else {
                          oka.a(gl.a((byte) 103, lea.field_F, new String[1]), 2431750, kn.field_p, -1, 50 + var4, 120 + var3, -1);
                          break L15;
                        }
                      }
                      var17 = 0;
                      var18 = null;
                      var19 = 0;
                      L16: while (true) {
                        L17: {
                          if (~pt.field_p.field_k[2].length >= ~var19) {
                            break L17;
                          } else {
                            var20 = pt.field_p.field_k[2][var19];
                            if (ue.a(var20, 0)) {
                              var19++;
                              continue L16;
                            } else {
                              var17 = pt.field_p.field_p[2][var19];
                              var18 = (Object) (Object) var20;
                              break L17;
                            }
                          }
                        }
                        if (var18 == null) {
                          break L14;
                        } else {
                          var16 = var14 - var17;
                          int discarded$9 = be.a(gl.a((byte) 121, qw.field_g, new String[2]), 0, kn.field_p, 2431750, 13, 50, 1, var4 + 60, var3, -1, (byte) 60, 240);
                          break L14;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        }
        se.f((byte) -6);
        var3 = 0;
        L18: while (true) {
          if (~var3 <= ~((qka) this).field_p.length) {
            L19: {
              if (param0 < -50) {
                break L19;
              } else {
                field_m = null;
                break L19;
              }
            }
            return;
          } else {
            L20: {
              stackOut_57_0 = ((qka) this).field_p[var3];
              stackOut_57_1 = 0;
              stackOut_57_2 = 1;
              stackOut_57_3 = 1;
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              stackIn_59_3 = stackOut_57_3;
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              stackIn_58_3 = stackOut_57_3;
              if (((qka) this).field_n != var3) {
                stackOut_59_0 = (fna) (Object) stackIn_59_0;
                stackOut_59_1 = stackIn_59_1;
                stackOut_59_2 = stackIn_59_2;
                stackOut_59_3 = stackIn_59_3;
                stackOut_59_4 = 0;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                stackIn_60_2 = stackOut_59_2;
                stackIn_60_3 = stackOut_59_3;
                stackIn_60_4 = stackOut_59_4;
                break L20;
              } else {
                stackOut_58_0 = (fna) (Object) stackIn_58_0;
                stackOut_58_1 = stackIn_58_1;
                stackOut_58_2 = stackIn_58_2;
                stackOut_58_3 = stackIn_58_3;
                stackOut_58_4 = 1;
                stackIn_60_0 = stackOut_58_0;
                stackIn_60_1 = stackOut_58_1;
                stackIn_60_2 = stackOut_58_2;
                stackIn_60_3 = stackOut_58_3;
                stackIn_60_4 = stackOut_58_4;
                break L20;
              }
            }
            ((fna) (Object) stackIn_60_0).a(stackIn_60_1 != 0, stackIn_60_2 != 0, stackIn_60_3, stackIn_60_4 != 0);
            var3++;
            continue L18;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 != -1) {
          L0: {
            if (param0 > 114) {
              break L0;
            } else {
              ((qka) this).b(-124, false);
              break L0;
            }
          }
          L1: {
            if (param1 == 0) {
              ((qka) this).field_h.b(false, true, 0);
              if (((qka) this).field_h.field_D) {
                r.a(0, ((qka) this).field_h.d((byte) 120));
                break L1;
              } else {
                ea.field_j = -1;
                break L1;
              }
            } else {
              if (param1 == 1) {
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
        int var3 = 0;
        hf var4_ref_hf = null;
        int var4 = 0;
        int var5 = 0;
        hf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_19_0 = 0;
        fna stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        fna stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        fna stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        fna stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        fna stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        fna stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        hf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        hf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((qka) this).field_c.field_H.length) {
            L1: {
              ((qka) this).field_n = -1;
              ((qka) this).field_q = true;
              if (param0 == 80) {
                break L1;
              } else {
                ((qka) this).b(12, true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (((qka) this).field_p.length <= var3) {
                L3: {
                  if (!((qka) this).field_h.field_D) {
                    break L3;
                  } else {
                    if (!((qka) this).field_h.d((byte) 69)) {
                      var3 = ((qka) this).field_h.field_k.field_t;
                      if ((var3 >> ((qka) this).field_h.field_x & 1) == 1) {
                        ((qka) this).field_p[1].field_e = df.field_I.toUpperCase();
                        break L3;
                      } else {
                        if (var3 != 0) {
                          ((qka) this).field_p[1].field_e = ot.field_t.toUpperCase();
                          break L3;
                        } else {
                          if (((qka) this).field_h.field_k.a(((qka) this).field_h.field_x, true)) {
                            ((qka) this).field_p[1].field_e = sl.field_g.toUpperCase();
                            break L3;
                          } else {
                            ((qka) this).field_p[1].field_e = kna.field_E.toUpperCase();
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
                  L5: {
                    if (!param1) {
                      break L5;
                    } else {
                      if (((qka) this).field_p[var3].field_b - 80 > jba.field_j) {
                        break L5;
                      } else {
                        if (~jba.field_j <= ~(80 + ((qka) this).field_p[var3].field_b)) {
                          break L5;
                        } else {
                          if (~(-25 + ((qka) this).field_p[var3].field_i) < ~sta.field_B) {
                            break L5;
                          } else {
                            if (~(((qka) this).field_p[var3].field_i - -25) >= ~sta.field_B) {
                              break L5;
                            } else {
                              stackOut_17_0 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                }
                L6: {
                  var4 = stackIn_19_0;
                  if (var4 != 0) {
                    ((qka) this).field_n = var3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  stackOut_22_0 = ((qka) this).field_p[var3];
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  if (~((qka) this).field_n != ~var3) {
                    stackOut_24_0 = (fna) (Object) stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    break L7;
                  } else {
                    stackOut_23_0 = (fna) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    break L7;
                  }
                }
                L8: {
                  ((fna) (Object) stackIn_25_0).a(stackIn_25_1 != 0, stackIn_25_2 != 0, true, 6);
                  if (!param1) {
                    break L8;
                  } else {
                    if (var4 == 0) {
                      break L8;
                    } else {
                      if (0 == hf.field_b) {
                        break L8;
                      } else {
                        this.a(120, var3);
                        break L8;
                      }
                    }
                  }
                }
                var3++;
                continue L2;
              }
            }
          } else {
            L9: {
              var4_ref_hf = (hf) (Object) ((qka) this).field_c.field_H[var3].n((byte) -67);
              if (((qka) this).field_q) {
                break L9;
              } else {
                L10: {
                  stackOut_3_0 = (hf) var4_ref_hf;
                  stackOut_3_1 = 26;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var3 != ((qka) this).field_c.field_z) {
                    stackOut_5_0 = (hf) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L10;
                  } else {
                    stackOut_4_0 = (hf) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 23;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L10;
                  }
                }
                ((hf) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, false);
                break L9;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Solo Adventure";
    }
}
