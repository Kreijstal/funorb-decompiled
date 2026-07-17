/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends al {
    private int field_n;
    static vk field_m;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        Object var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        oi stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        oi stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        oi stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        oi stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        oi stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        oi stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        L0: {
          var22 = ZombieDawn.field_J;
          super.a((byte) -75);
          int discarded$6 = 0;
          li.a();
          var2 = 3 + bj.field_q.field_x + bj.field_q.field_I;
          var3 = 600;
          var6 = vh.field_b + 200;
          if (jp.field_a != 1) {
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
          var7 = stackIn_3_0;
          if (jp.field_a != 3) {
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
          var8 = stackIn_6_0;
          if (param0 < -35) {
            break L2;
          } else {
            var23 = null;
            String discarded$7 = fg.a((String) null, 98, (String) null, (String) null);
            break L2;
          }
        }
        L3: {
          var9 = id.field_M - -135;
          var10 = vh.field_b + 20;
          sg.field_jb.c(gj.field_k[((fg) this).field_n][0], var10, var9, 0, 0);
          var20 = ((fg) this).field_n;
          if (var20 != 0) {
            if (var20 == 1) {
              L4: {
                L5: {
                  var11 = 340;
                  var2 -= 4;
                  if (var7 != 0) {
                    break L5;
                  } else {
                    if (var8 != 0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = 400;
                break L4;
              }
              L6: {
                var13 = 24;
                var12 = var9 + 20;
                le.field_a[1].b(-50 + var6, -8 + var12);
                if (var8 != 0) {
                  var13 = 20;
                  break L6;
                } else {
                  break L6;
                }
              }
              var12 = var12 + (bj.field_q.a(gj.field_g[1][0], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2 + var13);
              var14 = var6 - 95;
              var15 = var12 + -20;
              var12 = var12 + (bj.field_q.a(gj.field_g[1][1], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2 + var13);
              lb.field_eb[3].b(var6 - 31, var12 + 3);
              le.field_a[3].b(-20 + var6, var12 - -15);
              var12 = var12 + (var13 + bj.field_q.a(gj.field_g[1][2], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2);
              le.field_a[5].b(-46 + var6, var12 + 2);
              var12 = var12 + (bj.field_q.a(gj.field_g[1][3], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2 + var13);
              le.field_a[6].b(var6 + -60, var12 + -7);
              var12 = var12 + (var13 - -(var2 * bj.field_q.a(gj.field_g[1][4], var6, var12, var11, 50, 16777215, 0, 0, 0, var2)));
              le.field_a[0].b(var14, var15);
              nb.field_k[0].e(var14 - 8, -4 + var15, 128);
              nb.field_k[0].e(13 + var14, var15 - -14, 128);
              nb.field_k[0].e(var14 + 41, var15 - -11, 128);
              bi.c(var14 + 3, 14 + var15, 77, 47, 16777215);
              bi.b(var14 - -4, 15 + var15, 75, 45, 10066431, 32);
              bi.a(var14 - -5, var15 - -16, 73, 43, 3355647, 32);
              break L3;
            } else {
              if (var20 == 2) {
                var13 = 32;
                var12 = var9 + 40;
                var2 -= 4;
                lb.field_eb[8].b(var6 - 36, 4 + var12);
                le.field_a[3].b(-25 + var6, var12 - -15);
                var12 = var12 + (var13 - -(var2 * bj.field_q.a(gj.field_g[((fg) this).field_n][0], var6, var12, 340, 50, 16777215, 0, 0, 0, var2)));
                le.field_a[4].b(-110 + var6, var12 - 10);
                nb.field_k[0].e(var6 - 54, var12 + -3, 128);
                le.field_a[3].b(-25 + var6, var12 + 30);
                var12 = var12 + (var13 - -(bj.field_q.a(gj.field_g[((fg) this).field_n][1], var6, var12, 340, 50, 16777215, 0, 0, 0, var2) * var2));
                le.field_a[7].b(-63 + var6, 10 + var12);
                var12 = var12 + (var13 - -(var2 * bj.field_q.a(gj.field_g[((fg) this).field_n][2], var6, var12, 340, 50, 16777215, 0, 0, 0, var2)));
                le.field_a[9].b(var6 + -93, var12 + 10);
                var12 = var12 + (var13 - -(var2 * bj.field_q.a(gj.field_g[((fg) this).field_n][3], var6, var12, 340, 50, 16777215, 0, 0, 0, var2)));
                break L3;
              } else {
                if (var20 != 3) {
                  if (var20 != 4) {
                    if (var20 == 5) {
                      var5 = 19 - -var9;
                      var20 = 0;
                      L7: while (true) {
                        if (var20 >= cc.field_h[((fg) this).field_n].length) {
                          break L3;
                        } else {
                          var21 = cc.field_h[((fg) this).field_n][var20];
                          kb.field_i[var21].b(var10, 5 + var5);
                          var5 = var5 + (var2 * bj.field_q.a(gj.field_j[var21], var10 - -40, var5, var3 + -40, 400, 16777215, 0, 0, 0, var2) + 15);
                          var20++;
                          continue L7;
                        }
                      }
                    } else {
                      if (var20 == 6) {
                        var5 = 20 + var9;
                        var20 = 0;
                        L8: while (true) {
                          if (4 <= var20) {
                            break L3;
                          } else {
                            qn.field_k[var20].b(var10 - -8, var5 + -8);
                            var5 = var5 + (var2 * bj.field_q.a(gj.field_p[var20], 80 + var10, var5, -80 + var3, 400, 16777215, 0, 0, 0, var2) + 20);
                            var20++;
                            continue L8;
                          }
                        }
                      } else {
                        if (var20 == 7) {
                          var5 = var9 + 20;
                          var20 = 4;
                          L9: while (true) {
                            if (~qn.field_k.length >= ~var20) {
                              break L3;
                            } else {
                              qn.field_k[var20].b(var10 + 8, -8 + var5);
                              var5 = var5 + (var2 * bj.field_q.a(gj.field_p[var20], var10 - -80, var5, var3 - 80, 400, 16777215, 0, 0, 0, var2) + 20);
                              var20++;
                              continue L9;
                            }
                          }
                        } else {
                          L10: {
                            if (var20 == 8) {
                              break L10;
                            } else {
                              if (var20 == 9) {
                                break L10;
                              } else {
                                if (var20 == 10) {
                                  var5 = var9 + 20;
                                  var20 = 0;
                                  L11: while (true) {
                                    if (var20 >= 4) {
                                      break L3;
                                    } else {
                                      j.field_e[var20].b(var10 - -8, -8 + var5);
                                      var5 = var5 + (bj.field_q.a(gj.field_p[var20 + 8], 80 + var10, var5, -80 + var3, 400, 16777215, 0, 0, 0, var2) * var2 + 20);
                                      var20++;
                                      continue L11;
                                    }
                                  }
                                } else {
                                  if (11 == var20) {
                                    var16 = 30 + var10;
                                    var5 = 20 + var9;
                                    var18 = 3;
                                    var17 = var5;
                                    var19 = 3;
                                    bi.c(-var18 + var16, var17 + -var19, cn.field_c[0].field_w + 2 * var18, var19 * 2 + cn.field_c[0].field_t, 0);
                                    var18--;
                                    var19--;
                                    bi.c(-var18 + var16, -var19 + var17, 2 * var18 + cn.field_c[0].field_w, 2 * var19 + cn.field_c[0].field_t, 16777215);
                                    var19--;
                                    var18--;
                                    bi.c(var16 - var18, -var19 + var17, var18 * 2 + cn.field_c[0].field_w, 2 * var19 + cn.field_c[0].field_t, 0);
                                    cn.field_c[0].b(var16, var17);
                                    var4 = bj.field_q.a(gj.field_g[((fg) this).field_n][0], 195 + vh.field_b, 5 + var5, -170 + var3, 440, 16777215, 0, 0, 0, var2);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                          var4 = bj.field_q.a(gj.field_g[((fg) this).field_n][0], var10, var9 - -20, var3, 440, 16777215, 0, 0, 0, var2);
                          var5 = 39 + var2 * var4 - -var9;
                          var20 = 0;
                          L12: while (true) {
                            if (cc.field_h[((fg) this).field_n].length <= var20) {
                              break L3;
                            } else {
                              var21 = cc.field_h[((fg) this).field_n][var20];
                              kb.field_i[var21].b(var10, 5 + var5);
                              var5 = var5 + (15 + bj.field_q.a(gj.field_j[var21], var10 + 40, var5, var3 - 40, 400, 16777215, 0, 0, 0, var2) * var2);
                              var20++;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var4 = bj.field_q.a(gj.field_g[((fg) this).field_n][0], var10, var9 - -20, var3, 440, 16777215, 0, 0, 0, var2);
                    var5 = var9 + (39 + var2 * var4);
                    var20 = 0;
                    L13: while (true) {
                      if (var20 >= cc.field_h[((fg) this).field_n].length) {
                        break L3;
                      } else {
                        var21 = cc.field_h[((fg) this).field_n][var20];
                        kb.field_i[var21].b(var10, var5 + 5);
                        var5 = var5 + (bj.field_q.a(gj.field_j[var21], vh.field_b + 60, var5, var3 - 40, 400, 16777215, 0, 0, 0, var2) * var2 + 15);
                        var20++;
                        continue L13;
                      }
                    }
                  }
                } else {
                  si.field_Ub[0].b(vh.field_b - -8, id.field_M - -148);
                  si.field_Ub[1].b(70 + vh.field_b, id.field_M - -230);
                  sg.field_jb.c("1/5", 90 + vh.field_b, 202 + id.field_M, 2, -1);
                  sg.field_jb.c("3", 80 + vh.field_b, 285 + id.field_M, 1, -1);
                  sg.field_jb.c("2:15", vh.field_b - -75, id.field_M - -365, 0, -1);
                  var4 = bj.field_q.a(gj.field_g[3][0], 155 + vh.field_b, 170 + id.field_M, var3 + -140, 440, 16777215, 0, 0, 0, var2);
                  break L3;
                }
              }
            }
          } else {
            L14: {
              stackOut_24_0 = bj.field_q;
              stackOut_24_1 = gj.field_g[0][0];
              stackOut_24_2 = var10;
              stackOut_24_3 = var9 - -20;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              stackIn_26_3 = stackOut_24_3;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              stackIn_25_3 = stackOut_24_3;
              if (var7 == 0) {
                stackOut_26_0 = (oi) (Object) stackIn_26_0;
                stackOut_26_1 = (String) (Object) stackIn_26_1;
                stackOut_26_2 = stackIn_26_2;
                stackOut_26_3 = stackIn_26_3;
                stackOut_26_4 = -70 + var3;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                stackIn_27_2 = stackOut_26_2;
                stackIn_27_3 = stackOut_26_3;
                stackIn_27_4 = stackOut_26_4;
                break L14;
              } else {
                stackOut_25_0 = (oi) (Object) stackIn_25_0;
                stackOut_25_1 = (String) (Object) stackIn_25_1;
                stackOut_25_2 = stackIn_25_2;
                stackOut_25_3 = stackIn_25_3;
                stackOut_25_4 = var3;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                stackIn_27_3 = stackOut_25_3;
                stackIn_27_4 = stackOut_25_4;
                break L14;
              }
            }
            L15: {
              var4 = ((oi) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, 440, 16777215, 0, 0, 0, var2);
              var5 = var4 * var2;
              if (var7 == 0) {
                break L15;
              } else {
                var5 -= 20;
                break L15;
              }
            }
            sg.field_jb.c(gj.field_k[0][1], var10, var5 + (var9 + 75), 0, 0);
            int discarded$8 = bj.field_q.a(gj.field_g[0][1], var10, var5 + var9 - -95, var3, 440, 16777215, 0, 0, 0, var2);
            if (var7 != 0) {
              break L3;
            } else {
              l.field_b[0].b(530 + vh.field_b, 150 + id.field_M);
              l.field_b[1].b(vh.field_b + 230, id.field_M - -242);
              break L3;
            }
          }
        }
        int discarded$9 = 1;
        bj.field_q.b(uk.a(1 + ((fg) this).field_n, (byte) 58, 1 + this.a()), 634 + vh.field_b, id.field_M + 410, 16777215, 0);
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            field_m = null;
        }
        return ((fg) this).c(param1, 6) + 180;
    }

    final void d(byte param0) {
        int var2 = -82 / ((param0 - 32) / 56);
        ((fg) this).field_n = 0;
    }

    final static vn d() {
        int[] var20 = null;
        int[] var16 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Object var3 = null;
        int[] var21 = null;
        int[] var17 = null;
        int[] var9 = null;
        int var5 = 0;
        byte[] var18 = null;
        int var7 = ZombieDawn.field_J;
        int var1 = uf.field_n[0] * bn.field_c[0];
        byte[] var19 = vj.field_m[0];
        if (jc.field_r[0]) {
            var18 = ka.field_f[0];
            var20 = new int[var1];
            var16 = var20;
            var13 = var16;
            var11 = var13;
            var5_ref_int__ = var11;
            for (var6 = 0; var1 > var6; var6++) {
                var5_ref_int__[var6] = hi.a(eg.a((int) var18[var6], 255) << 24, j.field_a[eg.a(255, (int) var19[var6])]);
            }
            var3 = (Object) (Object) new cd(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], var20);
        } else {
            var21 = new int[var1];
            var17 = var21;
            var9 = var17;
            for (var5 = 0; var1 > var5; var5++) {
                var9[var5] = j.field_a[eg.a((int) var19[var5], 255)];
            }
            var3 = (Object) (Object) new vn(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], var21);
        }
        no.f((byte) -73);
        return (vn) var3;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -31645) {
          L0: {
            if (((fg) this).field_n != 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_5_0;
            int discarded$2 = 1;
            if (((fg) this).field_n != this.a()) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            L3: {
              var3 = stackIn_8_0;
              if (var2 != 0) {
                break L3;
              } else {
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (kg.field_i == 96) {
                break L4;
              } else {
                if (kg.field_i == 97) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            L5: {
              ((fg) this).field_b.a(1, -1);
              if (var2 == 0) {
                break L5;
              } else {
                if (((fg) this).field_b.field_d != 0) {
                  break L5;
                } else {
                  ((fg) this).field_b.a(1, -1);
                  return;
                }
              }
            }
            L6: {
              if (var3 == 0) {
                break L6;
              } else {
                if (((fg) this).field_b.field_d == 2) {
                  ((fg) this).field_b.a(1, -1);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
          ((fg) this).field_b.a(1, -1);
          return;
        } else {
          return;
        }
    }

    fg(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ((fg) this).field_n = 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
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
        var16 = ZombieDawn.field_J;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (param3 < 0) {
                L2: {
                  if (param5 == 61653921) {
                    break L2;
                  } else {
                    var17 = null;
                    fg.a(107, -48, -75, 124, 49, 11, -113, -78, 117, (int[]) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var18 = param9;
                var10_array = var18;
                var11 = param6;
                var12 = param0;
                var13 = param8;
                var14 = param4;
                var15 = (16711422 & var18[var11]) >> 1;
                var10_array[var11] = var15 + (eg.a(33518850, var14) >> 17) + (eg.a(var13 >> 9, 65280) + eg.a(16711680, var12 >> 1));
                param6++;
                param8 = param8 + param7;
                param4 = param4 + param1;
                param0 = param0 + param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("fg.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param9 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void c() {
        field_m = null;
    }

    final boolean b(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param1 == -1) {
          L0: {
            L1: {
              L2: {
                if (param0 != 0) {
                  break L2;
                } else {
                  if (((fg) this).field_n == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (2 != param0) {
                  break L3;
                } else {
                  int discarded$2 = 1;
                  if (((fg) this).field_n == this.a()) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L0;
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return false;
        }
    }

    final static jc a(int param0, int param1, int param2, int param3) {
        int var6 = ZombieDawn.field_J;
        jc var5 = (jc) (Object) on.field_g.b((byte) 26);
        while (var5 != null) {
            if (param3 == var5.field_s) {
                return var5;
            }
            var5 = (jc) (Object) on.field_g.a(false);
        }
        var5 = new jc();
        var5.field_s = param3;
        var5.field_o = 1;
        var5.field_u = 10;
        on.field_g.a(0, (le) (Object) var5);
        pm.a(0, 3, var5);
        return var5;
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        ((fg) this).field_n = ((fg) this).field_n - 1;
        if (param0 != 20921) {
            return;
        }
        if (!param1) {
            if (!(((fg) this).field_n != 0)) {
                var3 = kg.field_i;
                kg.field_i = 97;
                ((fg) this).field_b.a(1, -1);
                kg.field_i = var3;
            }
        }
    }

    private final int a() {
        return be.field_j <= 0 ? 7 : gj.field_g.length + -1;
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        if (param1 <= 119) {
            Object var4 = null;
            fg.a(6, 53, 47, 73, 20, 34, -122, -33, -19, (int[]) null);
        }
        ((fg) this).field_n = ((fg) this).field_n + 1;
        if (!param0) {
            int discarded$0 = 1;
            if (!(((fg) this).field_n != this.a())) {
                var3 = kg.field_i;
                kg.field_i = 96;
                ((fg) this).field_b.a(1, -1);
                kg.field_i = var3;
            }
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var5 = ZombieDawn.field_J;
        int var4 = param3.indexOf(param0);
        if (param1 >= -126) {
            field_m = null;
        }
        while (var4 != -1) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(var4 - -param0.length());
            var4 = param3.indexOf(param0, param2.length() + var4);
        }
        return param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new vk();
    }
}
