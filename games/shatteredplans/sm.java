/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    private int field_a;
    private int field_g;
    static int field_b;
    private boolean field_f;
    private int field_h;
    private np field_d;
    private int field_i;
    static boolean field_e;
    static String field_c;

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = this.c(32);
        if (0 != var3) {
          L0: {
            L1: {
              if (null != ce.field_x) {
                break L1;
              } else {
                if (null != in.field_g) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            sn.a(640, -46, 480, 192 + (param1 >> 93019649), 0, 0);
            break L0;
          }
          L2: {
            var4 = (640 - var3) / 2;
            var5 = this.h(-127);
            var6 = this.b((byte) -98);
            var7 = var4;
            if (param0 >= 41) {
              break L2;
            } else {
              int discarded$1 = this.h(101);
              break L2;
            }
          }
          L3: {
            var8 = 20 + var3;
            var9 = var5 + -10;
            var10 = var6 - -10;
            kp.field_m = qh.a(kp.field_m, var9 + -3, 24, -3 + var7, -1, 24);
            vl.field_q = qh.a(vl.field_q, 4 + (var9 - -var10) - 24, 24, -24 + (var7 - (-var8 + -3)), -1, 24);
            if ((fj.field_t.field_a ^ -1) == -3) {
              sn.a(var8, -50, var10, param1 + 128, var7, var9);
              bs.field_a = qh.a(bs.field_a, var9, var8, var7, -1, var10);
              bs.a(bs.field_a, 107);
              gf.b(3, 3, 0, 0, var8, var10);
              bs.field_a.a(var7, var9, 128 + -param1 << 74161985);
              cg.i(0);
              break L3;
            } else {
              if (fj.field_t.field_a == 1) {
                sn.a(var8, -29, var10, 128 + param1, var7, var9);
                break L3;
              } else {
                gf.c(var7, var9, var8, var10, 855316, -param1 + 128 << -2073543807);
                break L3;
              }
            }
          }
          ga.a(var10, var9, var7, (byte) -102, var8);
          gf.a(s.field_f);
          gf.d(var7, var9, var7 + var8, var9 - -var10);
          this.e(var5, 7903);
          gf.b(s.field_f);
          return;
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ne.field_o = this.b(-100, pd.field_k, bb.field_b);
        if (param0 > 115) {
          L0: {
            var2 = 0;
            if ((je.field_d ^ -1) == -1) {
              break L0;
            } else {
              var3 = this.b(107, nh.field_p, td.field_P);
              if (0 <= var3) {
                this.d(4, var3);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (0 == so.field_o) {
              break L1;
            } else {
              var2 = so.field_o * -20;
              break L1;
            }
          }
          L2: {
            if (-1 != (ai.field_e ^ -1)) {
              if (rf.field_n != 0) {
                if (ne.field_o != -2) {
                  if (-3 != ne.field_o) {
                    break L2;
                  } else {
                    var2 -= 10;
                    break L2;
                  }
                } else {
                  var2 += 10;
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              if (-1 == (je.field_d ^ -1)) {
                break L2;
              } else {
                if (-2 != ne.field_o) {
                  if ((ne.field_o ^ -1) == 2) {
                    this.a(1, (byte) -57);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  this.a(-1, (byte) -57);
                  break L2;
                }
              }
            }
          }
          L3: {
            L4: {
              if (0 == rf.field_n) {
                break L4;
              } else {
                if (-1 == ne.field_o) {
                  if (!((sm) this).field_f) {
                    ((sm) this).field_f = true;
                    ((sm) this).field_i = bb.field_b;
                    break L3;
                  } else {
                    var2 = -((sm) this).field_i + bb.field_b;
                    ((sm) this).field_i = bb.field_b;
                    break L3;
                  }
                } else {
                  break L4;
                }
              }
            }
            ((sm) this).field_f = false;
            break L3;
          }
          L5: {
            if (0 == var2) {
              break L5;
            } else {
              L6: {
                pr.field_g = pr.field_g - var2;
                ac.field_w = ac.field_w - var2;
                if ((pr.field_g ^ -1) <= -1) {
                  break L6;
                } else {
                  pr.field_g = 0;
                  break L6;
                }
              }
              L7: {
                if (-1 < (ac.field_w ^ -1)) {
                  ac.field_w = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (kb.field_A >= pr.field_g) {
                  break L8;
                } else {
                  pr.field_g = kb.field_A;
                  break L8;
                }
              }
              if (kb.field_A < ac.field_w) {
                ac.field_w = kb.field_A;
                break L5;
              } else {
                break L5;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int b(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 10) {
            this.b(-38, false, 12, 127);
        }
        if ((vr.field_c ^ -1) != (((sm) this).field_a ^ -1)) {
            if (((sm) this).field_a != gr.field_o) {
                return 0;
            }
        }
        if (vr.field_c != gr.field_o) {
            if (nh.a((byte) -76, vr.field_c)) {
                if (nh.a((byte) -76, gr.field_o)) {
                    var2 = wm.a(eh.field_Q, (byte) 121, 32);
                    var4 = (int)((double)(80 + qg.field_r[vr.field_c]) * var2);
                    var5 = -(((int)(var2 * (double)(-qg.field_r[vr.field_c] + qg.field_r[gr.field_o])) + qg.field_r[vr.field_c]) / 2) + 320;
                    if ((vr.field_c ^ -1) == (((sm) this).field_a ^ -1)) {
                        return qg.field_r[vr.field_c] / 2 + var5 + -var4;
                    }
                    return -(qg.field_r[vr.field_c] / 2) + (100 + -var4);
                }
            }
        }
        return 320;
    }

    final void a(int param0, int param1) {
        if (nh.a((byte) -74, param1)) {
            if (((sm) this).field_g == -1) {
            }
            mj.field_Hb[param1].field_g = -1;
        }
        if (param0 != -30492) {
            ((sm) this).a(47, 88);
        }
    }

    private final int b(boolean param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        if (((sm) this).field_a != vr.field_c) {
            if (gr.field_o != ((sm) this).field_a) {
                return 0;
            }
        }
        if (gr.field_o != vr.field_c) {
            if (nh.a((byte) -82, vr.field_c)) {
                if (!(!nh.a((byte) -126, gr.field_o))) {
                    var2 = wm.a(eh.field_Q, (byte) 118, 32);
                    var4 = (int)((-var2 + 1.0) * (double)(80 + qg.field_r[vr.field_c]));
                    var5 = -(((int)(var2 * (double)(qg.field_r[gr.field_o] - qg.field_r[vr.field_c])) + qg.field_r[vr.field_c]) / 2) + 320;
                    var5 = var5 + var4;
                    if ((vr.field_c ^ -1) != (((sm) this).field_a ^ -1)) {
                        return var5;
                    }
                    return -80 + (var5 + -qg.field_r[vr.field_c]);
                }
            }
        }
        if (param0) {
            return -21;
        }
        return (640 - this.c(32)) / 2;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        String var15_ref_String = null;
        int var16 = 0;
        bi var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        bi var20 = null;
        int var21 = 0;
        int[] var25 = null;
        int stackIn_3_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        L0: {
          var21 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((jn.field_b ^ -1) != -1) {
            stackOut_2_0 = re.a(pr.field_g, 32, jn.field_b, ac.field_w, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ac.field_w;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var5 = pe.field_J.length;
          if (0 <= var4) {
            break L1;
          } else {
            var4 = 0;
            break L1;
          }
        }
        L2: {
          if (kb.field_A < var4) {
            var4 = kb.field_A;
            break L2;
          } else {
            break L2;
          }
        }
        var6 = param0 - (-qg.field_r[((sm) this).field_a] + -18);
        param0 -= 8;
        gf.a(param0 - -20, param1 + 2, 18 + (-60 + qg.field_r[((sm) this).field_a] - -o.field_k.field_z), 309, 10, 0, 92);
        gf.f(20 + param0, 2 + param1, qg.field_r[((sm) this).field_a] - 60 + (18 + o.field_k.field_z), 309, 10, 2458760);
        var25 = new int[4];
        gf.a(var25);
        gf.i(25 + param0, 5 + param1, var6 + -20, param1 + qg.field_t[((sm) this).field_a] + -14);
        var8 = -var4;
        var9 = 0;
        L3: while (true) {
          if (var9 >= var5) {
            L4: {
              gf.b(var25);
              if (kb.field_A > var4) {
                bg.field_a.c(param0 - (-qg.field_r[((sm) this).field_a] + 26), -35 + (qg.field_t[((sm) this).field_a] + param1), 256);
                if ((ne.field_o ^ -1) != 2) {
                  break L4;
                } else {
                  bg.field_a.c(qg.field_r[((sm) this).field_a] + param0 + -26, param1 + qg.field_t[((sm) this).field_a] + -35, 256);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (0 >= var4) {
                break L5;
              } else {
                o.field_k.c(-26 + (param0 + qg.field_r[((sm) this).field_a]), 5 + param1, 256);
                if (1 == (ne.field_o ^ -1)) {
                  o.field_k.c(qg.field_r[((sm) this).field_a] + (param0 + -26), param1 - -5, 256);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            var9 = -(21 * var5) + 310;
            if (param2 == 7552) {
              param1 += 8;
              var10 = nc.field_t;
              var11 = 0;
              L6: while (true) {
                if (-1 + var5 <= var11) {
                  var11 = var9 + 16;
                  var12 = 0;
                  L7: while (true) {
                    if (-17 > (var12 ^ -1)) {
                      L8: {
                        ks.a(-18166, 16, 2458760, -1, var6, param1);
                        mh.a(var11, var6 + -16, param1 - -16, 2458760, false);
                        if (((sm) this).field_a != 7) {
                          stackOut_47_0 = 16;
                          stackIn_48_0 = stackOut_47_0;
                          break L8;
                        } else {
                          stackOut_46_0 = 8;
                          stackIn_48_0 = stackOut_46_0;
                          break L8;
                        }
                      }
                      L9: {
                        var12 = stackIn_48_0;
                        ks.a(-18166, var12, 2458760, 1, var6 + -16, var11 + 15 + param1);
                        var13 = ln.field_H[var5 + -1] << -298981982;
                        if (0 == var13) {
                          break L9;
                        } else {
                          var14 = pe.field_J[var5 - 1];
                          var15 = rs.field_Cb.c(var14);
                          var16 = rs.field_Cb.field_q + rs.field_Cb.field_J;
                          var17 = new bi(var16, var15);
                          bs.a(var17, 82);
                          rs.field_Cb.a(var14, rs.field_Cb.field_J * 3 / 4 + 1, -1 + var15, 16777215, -1);
                          cg.i(param2 ^ 7552);
                          var18 = var6 - 14;
                          var19 = (-var15 + var11 >> 1204912001) + 16 + param1;
                          var17.c(var18, var19, (int)(2.67 * (double)var13));
                          break L9;
                        }
                      }
                      return;
                    } else {
                      mh.a(-(var12 * 2) + 32 + var11, -var12 + var6, param1 - -var12, 65793, false);
                      var12++;
                      continue L7;
                    }
                  }
                } else {
                  L10: {
                    var12 = ln.field_H[var11];
                    if (12 < var12) {
                      var12 = 12;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var10 != 0) {
                      stackOut_34_0 = var9 * var12 / var10;
                      stackIn_35_0 = stackOut_34_0;
                      break L11;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_35_0 = stackOut_33_0;
                      break L11;
                    }
                  }
                  var13 = stackIn_35_0;
                  var10 = var10 - var12;
                  var9 = var9 - var13;
                  var13 += 21;
                  var14_int = 0;
                  L12: while (true) {
                    if (-17 > (var14_int ^ -1)) {
                      L13: {
                        ks.a(-18166, 16, 2458760, -1, var6, param1);
                        mh.a(var13, -16 + var6, 16 + param1, 2458760, false);
                        var14_int = -12 + ln.field_H[var11];
                        if (-1 > (var14_int ^ -1)) {
                          var15_ref_String = pe.field_J[var11];
                          var16 = rs.field_Cb.c(var15_ref_String);
                          var17_int = rs.field_Cb.field_q + rs.field_Cb.field_J;
                          var18 = var6 + -15;
                          var19 = (var13 - var16 >> 2102282561) + 8 + param1;
                          var20 = new bi(var17_int, var16);
                          bs.a(var20, 125);
                          rs.field_Cb.a(var15_ref_String, 1 + rs.field_Cb.field_J * 3 / 4, -1 + var16, 16777215, -1);
                          cg.i(0);
                          var20.c(var18, var19, 256 * var14_int / 12);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      param1 = param1 + var13;
                      var11++;
                      continue L6;
                    } else {
                      mh.a(var13, var6 + -var14_int, param1 - -var14_int, 65793, false);
                      var14_int++;
                      continue L12;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L14: {
              if ((var9 ^ -1) >= -1) {
                break L14;
              } else {
                gf.f(param0 - -30, -20 + (3 + (param1 - -var8)), -param0 + var6 + -80, 16777215);
                gf.f(param0 + 30, -40 + (var8 + (param1 - -3)), -80 + (-param0 + var6), 16777215);
                rs.field_Cb.d(pe.field_J[var9], param0 + 50, rs.field_Cb.field_J / 2 + (3 + param1) - -var8 - 30, 16777215, -1);
                break L14;
              }
            }
            L15: {
              if (294 < var8) {
                break L15;
              } else {
                if (var8 >= -294) {
                  this.a(var8 + param1 - -3, true, var9, param0 + 30);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            var8 = var8 + cb.field_i[var9];
            var9++;
            continue L3;
          }
        }
    }

    private final int d(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 53) {
            this.e(93, -98);
        }
        int var4 = 140;
        int var5 = 52;
        int[] var6 = new int[4];
        gf.a(var6);
        gf.a();
        for (var7 = 0; 25 > var7; var7++) {
            if ((var5 ^ -1) >= (param1 ^ -1)) {
                if (var5 - -32 > param1) {
                    if (var4 <= param2) {
                        if (!((param2 ^ -1) <= (var4 - -32 ^ -1))) {
                            return var7;
                        }
                    }
                }
            }
            var5 += 42;
            if (var7 % 13 == 12) {
                var4 = (int)((double)var4 + Math.sqrt(3.0) * 21.0);
                var5 = 73;
            }
        }
        return -1;
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = ln.field_H.length;
          var3 = ac.field_w + 147;
          var4 = 0;
          if (param0 < -31) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var4 >= var2) {
              break L2;
            } else {
              var3 = var3 - cb.field_i[var4];
              if (0 > var3) {
                break L2;
              } else {
                var4++;
                continue L1;
              }
            }
          }
          L3: {
            o.field_s = var4;
            var5 = ne.field_o;
            if ((var5 ^ -1) <= -1) {
              break L3;
            } else {
              var5 = o.field_s;
              break L3;
            }
          }
          nc.field_t = 0;
          var4 = 0;
          L4: while (true) {
            if ((var4 ^ -1) <= (ln.field_H.length ^ -1)) {
              L5: {
                if ((jn.field_b ^ -1) != -1) {
                  jn.field_b = jn.field_b + 1;
                  if ((jn.field_b + 1 ^ -1) == -33) {
                    jn.field_b = 0;
                    pr.field_g = ac.field_w;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (oo.field_b != null) {
                  break L6;
                } else {
                  oo.field_b = new int[5];
                  er.field_q = new int[5];
                  fg.field_c = new int[5];
                  var4 = 0;
                  L7: while (true) {
                    if (var4 >= 5) {
                      break L6;
                    } else {
                      er.field_q[var4] = vc.a((byte) -39, 35);
                      fg.field_c[var4] = vc.a((byte) -39, 35);
                      var4++;
                      continue L7;
                    }
                  }
                }
              }
              L8: {
                var6 = cl.field_n % 50;
                if ((var6 ^ -1) != -1) {
                  break L8;
                } else {
                  var4 = 0;
                  L9: while (true) {
                    if (5 <= var4) {
                      break L8;
                    } else {
                      er.field_q[var4] = fg.field_c[var4];
                      fg.field_c[var4] = vc.a((byte) -39, 35);
                      var4++;
                      continue L9;
                    }
                  }
                }
              }
              return;
            } else {
              L10: {
                var6 = ln.field_H[var4];
                if (var5 == var4) {
                  var6++;
                  if (-25 <= (var6 ^ -1)) {
                    ln.field_H[var4] = var6;
                    break L10;
                  } else {
                    var6 = 24;
                    break L10;
                  }
                } else {
                  var6--;
                  if (var6 >= 0) {
                    ln.field_H[var4] = var6;
                    break L10;
                  } else {
                    var6 = 0;
                    break L10;
                  }
                }
              }
              L11: {
                if (-13 > (var6 ^ -1)) {
                  var6 = 12;
                  break L11;
                } else {
                  break L11;
                }
              }
              nc.field_t = nc.field_t + var6;
              var4++;
              continue L4;
            }
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = this.b(false);
          var4 = qg.field_t[((sm) this).field_a];
          var5 = ((sm) this).field_h % (((sm) this).field_d.field_b * 16);
          if (param1 == 7903) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((sm) this).field_d.field_b) {
            L2: {
              L3: {
                if (-7 == (((sm) this).field_a ^ -1)) {
                  break L3;
                } else {
                  if ((((sm) this).field_a ^ -1) == -8) {
                    break L3;
                  } else {
                    if (((sm) this).field_a != 8) {
                      if (-6 != (((sm) this).field_a ^ -1)) {
                        if (-11 == (((sm) this).field_a ^ -1)) {
                          this.e((byte) 80);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        this.c((byte) -23);
                        break L2;
                      }
                    } else {
                      this.j(-8);
                      break L2;
                    }
                  }
                }
              }
              this.a(this.b(false), param0, 7552);
              break L2;
            }
            return;
          } else {
            L4: {
              if (this.a((byte) 44, var6)) {
                L5: {
                  var7 = (((sm) this).field_h - var6 * 4) * 256 / (((sm) this).field_d.field_b * 4);
                  if (-1 > (var7 ^ -1)) {
                    if ((var7 ^ -1) <= -257) {
                      L6: {
                        stackOut_13_0 = this;
                        stackOut_13_1 = var6;
                        stackOut_13_2 = -127;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        if ((((sm) this).field_d.field_c ^ -1) != (var6 ^ -1)) {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          break L6;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = stackIn_14_2;
                          stackOut_14_3 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          stackIn_16_3 = stackOut_14_3;
                          break L6;
                        }
                      }
                      this.a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0);
                      break L5;
                    } else {
                      L7: {
                        stackOut_9_0 = this;
                        stackOut_9_1 = var6;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if ((var6 ^ -1) != (((sm) this).field_d.field_c ^ -1)) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          break L7;
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L7;
                        }
                      }
                      this.a(stackIn_12_1, stackIn_12_2 != 0, var7, false);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if ((qg.field_p[((sm) this).field_a][var6] ^ -1) == -30) {
                  break L4;
                } else {
                  if (qg.field_p[((sm) this).field_a][var6] != 28) {
                    var4 = this.c(var6, true);
                    if (var6 == ((sm) this).field_d.field_c) {
                      hn.field_c.f(25 + var3, (qg.field_l[((sm) this).field_a] - hn.field_c.field_w) / 2 + var4);
                      break L4;
                    } else {
                      var8 = ((sm) this).field_d.field_b * 6 - -(var6 * 4);
                      var9 = Math.abs(var5 + -var8);
                      if ((2 * ((sm) this).field_d.field_b ^ -1) >= (var9 ^ -1)) {
                        L8: {
                          if (var9 >= 6 * ((sm) this).field_d.field_b) {
                            break L8;
                          } else {
                            var10 = (6 * ((sm) this).field_d.field_b - var9) * 256 / (((sm) this).field_d.field_b * 4);
                            hn.field_c.a(25 + var3, (-hn.field_c.field_w + qg.field_l[((sm) this).field_a]) / 2 + var4, var10);
                            break L8;
                          }
                        }
                        break L4;
                      } else {
                        hn.field_c.a(var3 - -25, var4 + (qg.field_l[((sm) this).field_a] + -hn.field_c.field_w) / 2, 256);
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            var6++;
            continue L1;
          }
        }
    }

    private final void e(byte param0) {
        gf.a(kc.field_m);
        gf.a();
        int var2 = re.a(0, 32, on.field_c, 320, 0);
        int var3 = 200;
        int var4 = this.b(false) - (var2 + -this.c(32) >> 1671672833);
        int var5 = -48 + this.h(-104) + -var3;
        if (param0 < 39) {
            return;
        }
        if ((var2 ^ -1) < -21) {
            ga.a(var3, var5, var4, (byte) -112, var2);
        }
        if (!(-33 != (on.field_c ^ -1))) {
            gf.d(var4 + 8, 8 + var5, var2 + (var4 + -8), var3 + (var5 + -8));
            mp.field_b.c(wc.field_b, (var2 >> 206521409) + var4, mp.field_b.field_J + 10 + var5, 2805974, -1);
            int discarded$0 = rs.field_Cb.a(oi.field_c, 10 + var4, mp.field_b.field_J + (var5 + 10), -20 + var2, -mp.field_b.field_J + (-30 + var3), 2805974, -1, 1, 1, rs.field_Cb.field_J);
        }
        gf.b(kc.field_m);
    }

    private final void a(int param0, boolean param1, int param2, boolean param3) {
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var5 = qg.field_p[((sm) this).field_a][param0];
          if (!param3) {
            break L0;
          } else {
            ((sm) this).field_d = null;
            break L0;
          }
        }
        L1: {
          var6 = this.c(-22609, var5);
          if (param1) {
            stackOut_4_0 = 2805974;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 2458760;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var7 = stackIn_5_0;
            var8 = qg.field_l[((sm) this).field_a];
            var9 = this.b(param0, true);
            var10 = this.c(param0, true);
            if (21 == var5) {
              break L3;
            } else {
              if (var5 == 22) {
                break L3;
              } else {
                mp.field_b.d(var6, var9, var10 - -mp.field_b.field_J, var7, -1, param2);
                break L2;
              }
            }
          }
          L4: {
            mp.field_b.d(var6, var9, mp.field_b.field_J + var10, var7, -1, param2);
            var9 = var9 + hg.field_t;
            gf.d(var9, var10 + (var8 / 2 + -1), 121, 2, var7, param2);
            if ((var5 ^ -1) == -22) {
              stackOut_10_0 = tf.field_p * 120 / 256;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = wm.field_b * 120 / 256;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          var11 = stackIn_11_0;
          gf.d(-1 + (var9 + var11), 3 + var10, 3, -6 + var8, var7, param2);
          break L2;
        }
        L5: {
          if (param0 == ((sm) this).field_g) {
            L6: {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (param3) {
                stackOut_16_0 = this;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L6;
              }
            }
            int discarded$2 = this.a(stackIn_17_1 != 0, param0);
            int discarded$3 = this.b(10);
            break L5;
          } else {
            break L5;
          }
        }
    }

    private final void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          var11 = param0 + param4;
          if (param2 <= param8) {
            gf.f(param2, var11, 1 + (-param2 + param8), param9);
            break L0;
          } else {
            gf.f(param8, var11, 1 + (-param8 + param2), param9);
            break L0;
          }
        }
        L1: {
          var12 = param2 + param8 >> 1269963617;
          if (var12 >= param5) {
            gf.f(param5, param3, -param5 + var12, param9);
            break L1;
          } else {
            gf.f(var12, param3, -var12 + param5, param9);
            break L1;
          }
        }
        L2: {
          if (0 >= param0) {
            gf.j(param8, var11, -param0, param9);
            gf.j(param2, var11, -param0, param9);
            break L2;
          } else {
            gf.j(param8, param4, param0, param9);
            gf.j(param2, param4, param0, param9);
            break L2;
          }
        }
        L3: {
          if ((param3 ^ -1) < (var11 ^ -1)) {
            gf.j(var12, var11, param3 - var11, param9);
            break L3;
          } else {
            gf.j(var12, param3, var11 - param3, param9);
            break L3;
          }
        }
        var13 = wk.a(-9615, param1, (nq) (Object) rs.field_Cb, new int[1]);
        if (param7 == 62) {
          param4 = -(rs.field_Cb.field_J * var13 >> -352604127) + param3;
          int discarded$1 = rs.field_Cb.a(param1, 5 + param5, param4, param6, var13 * rs.field_Cb.field_J - -rs.field_Cb.field_q, param9, -1, 0, 0, rs.field_Cb.field_J);
          return;
        } else {
          return;
        }
    }

    private final void a(String param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        L0: {
          var11 = param1 - (-param9 - param5);
          if (-1 != (var11 ^ -1)) {
            param5 = (200 * param5 + var11) / (2 * var11);
            param1 = (param1 * 200 + var11) / (var11 * 2);
            param9 = (200 * param9 + var11) / (var11 * 2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-1 == param7) {
            break L1;
          } else {
            var13 = 1 + param7 + ".";
            rs.field_Cb.b(var13, 15 + (vn.field_r[0] + param4), param6, param8, -1);
            break L1;
          }
        }
        L2: {
          var12 = param0;
          rs.field_Cb.d(var12, param4 - (-vn.field_r[0] - 20), param6, param8, -1);
          var14 = Integer.toString(param3);
          rs.field_Cb.c(var14, param4 + vn.field_r[1], param6, param8, -1);
          if (var11 < 50) {
            stackOut_7_0 = Integer.toString(var11);
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = "50+";
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var15 = stackIn_8_0;
          var12 = var15;
          rs.field_Cb.c(var15, vn.field_r[2] + param4, param6, param8, -1);
          var12 = param1 + "%";
          if (param2 < -116) {
            break L3;
          } else {
            this.a(-46, (byte) -46, 11, -112, -101, -46, -96);
            break L3;
          }
        }
        rs.field_Cb.c(var12, param4 - -vn.field_r[3], param6, param8, -1);
        var16 = param9 + "%";
        rs.field_Cb.c(var16, param4 + vn.field_r[4], param6, param8, -1);
        var17 = param5 + "%";
        rs.field_Cb.c(var17, vn.field_r[5] + param4, param6, param8, -1);
    }

    final void c(int param0, int param1, int param2) {
        if (ce.field_x == null) {
            // if_acmpne L16
        } else {
            oa.a(480, 0, 640, (byte) -126, 0);
        }
        int var4 = this.c(32);
        int var5 = this.h(-123);
        int var6 = this.b((byte) -98);
        if (param1 != -6469) {
            return;
        }
        double var7 = wm.a(param2, (byte) 99, 128);
        int var9 = (640 - var4) / 2;
        int var10 = (int)((double)(qg.field_r[((sm) this).field_a] + 80) * (1.0 - var7));
        int var11 = var9;
        int var12 = 20 + var4;
        int var13 = var5 + -10;
        int var14 = var6 + 10;
        ga.a(var14, var13, var11, (byte) -73, var12);
        gf.a(s.field_f);
        int var15 = var10 + (var9 - 20);
        int var16 = var12 + var11;
        gf.d(var11, var13, (var15 ^ -1) <= (var16 ^ -1) ? var16 : var15, var14 + var13);
        this.e(var5, param1 + 14372);
        gf.d(var11, var13, var11 - -var12, var14 + var13);
        mj.field_Hb[param0].e(var5, 7903);
        gf.b(s.field_f);
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          gf.a(kc.field_m);
          gf.a();
          if (param0 == -23) {
            break L0;
          } else {
            String discarded$1 = this.c(72, -48);
            break L0;
          }
        }
        if (!w.d(true)) {
          L1: {
            if (ri.field_I == null) {
              ri.field_I = kf.a((byte) 85, 0, 7, 10);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var2 = re.a(0, 32, nb.field_a, 560, param0 ^ -23);
            var3 = 200;
            var4 = this.b(false) - (-this.c(32) + var2 >> 1349520577);
            var5 = this.h(param0 + -71) - var3 + -24;
            if (var2 > 20) {
              ga.a(var3, var5, var4, (byte) -109, var2);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            gf.d(var4 + 8, 8 + var5, var2 + (var4 + -8), -8 + (var3 + var5));
            var6 = 2805974;
            var7 = 16 + var5 - -rs.field_Cb.field_J;
            rs.field_Cb.c(bh.field_r, vn.field_r[1] + var4, var7, var6, -1);
            rs.field_Cb.c(un.field_j, vn.field_r[2] + var4, var7, var6, -1);
            rs.field_Cb.c(ld.field_q, var4 - -vn.field_r[3], var7, var6, -1);
            rs.field_Cb.c(hc.field_c, vn.field_r[4] + var4, var7, var6, -1);
            rs.field_Cb.c(eo.field_X, vn.field_r[5] + var4, var7, var6, -1);
            var7 += 24;
            if (!ri.field_I.field_q) {
              var8 = ea.field_d;
              break L3;
            } else {
              if (null == ri.field_I.field_n) {
                var8 = wj.field_k;
                break L3;
              } else {
                var8 = ne.field_q;
                var9 = ri.field_I.field_n[ff.field_y];
                var10 = ri.field_I.field_m[ff.field_y];
                var11 = 0;
                var12 = 0;
                L4: while (true) {
                  if (-11 >= (var12 ^ -1)) {
                    L5: {
                      if (var11 != 0) {
                        break L5;
                      } else {
                        if (-1 > (ri.field_I.field_h + ri.field_I.field_i + ri.field_I.field_r ^ -1)) {
                          var6 = 2805974;
                          this.a(ln.field_o, ri.field_I.field_i, (byte) -120, ri.field_I.field_l, var4, ri.field_I.field_r, var7, -1, var6, ri.field_I.field_h);
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    break L3;
                  } else {
                    L6: {
                      if (null == var9[var12]) {
                        break L6;
                      } else {
                        L7: {
                          var6 = 2805974;
                          var13 = var9[var12];
                          if (jp.a(var13, (byte) -105)) {
                            var11 = 1;
                            var6 = 16777215;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        this.a(var13, var10[1 + var12 * 4], (byte) -128, var10[4 * var12], var4, var10[2 + 4 * var12], var7, var12, var6, var10[3 + 4 * var12]);
                        var8 = "";
                        break L6;
                      }
                    }
                    var7 += 15;
                    var12++;
                    continue L4;
                  }
                }
              }
            }
          }
          var7 = (rs.field_Cb.field_J + var3 >> -72530207) + var5;
          rs.field_Cb.c(var8, var4 + (var2 >> 1280977345), var7, 2805974, -1);
          gf.b(kc.field_m);
          return;
        } else {
          this.d(param0 ^ -21);
          return;
        }
    }

    private final void d(int param0) {
        int var2 = 420;
        if (param0 != 2) {
            this.a(-30, 106, 23);
        }
        int var3 = re.a(0, 32, nb.field_a, var2, 0);
        int var4 = 80;
        int var5 = this.b(false) + -(var3 - this.c(32) >> -301402559);
        int var6 = -60 + this.h(-122) + -var4 - 48;
        if (!(-21 <= (var3 ^ -1))) {
            ga.a(var4, var6, var5, (byte) -124, var3);
        }
        gf.d(8 + var5, 8 + var6, var5 + var3 - 8, -8 + var6 + var4);
        rs.field_Cb.c(fr.field_D, 320, (rs.field_Cb.field_J + var4 >> -1926588351) + var6, 16777215, -1);
        gf.b(kc.field_m);
    }

    final void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 != ((sm) this).field_d.field_c) {
            param0 = ((sm) this).field_d.field_c;
        }
        if (!((((sm) this).field_a ^ -1) != -12)) {
            param0 = 1;
        }
        if (-9 == (((sm) this).field_a ^ -1)) {
            if (!(!oe.field_e)) {
                if (!(ur.field_zb != null)) {
                    ur.field_zb = vs.a((byte) 88, 4);
                }
            }
        }
        ((sm) this).field_d.a(this.a(bb.field_b, (byte) -109, pd.field_k), param0, param2, 59);
        ((sm) this).field_h = 0;
        an.field_c = -1;
        if (param1 <= 14) {
            this.e((byte) -50);
        }
        qd.field_e = -1;
        ((sm) this).field_g = -1;
        qg.field_q = cl.field_n;
        for (var4 = 1; 6 > var4; var4++) {
            ln.field_H[var4] = 0;
        }
        o.field_s = 0;
        if (!((((sm) this).field_a ^ -1) != -9)) {
            up.field_d = 0;
        }
        ne.field_o = -1;
        nc.field_t = 24;
        ln.field_H[0] = 24;
        if (cb.field_i == null) {
            if (6 != ((sm) this).field_a) {
                // if_icmpeq L228
            } else {
                hd.c(false);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 < -34) {
            break L0;
          } else {
            field_b = 112;
            break L0;
          }
        }
        L1: {
          var4 = qg.field_p[((sm) this).field_a][param0];
          var5 = this.c(-22609, var4);
          if (!param2) {
            stackOut_4_0 = 2458760;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 2805974;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = stackIn_5_0;
            var7 = qg.field_l[((sm) this).field_a];
            var8 = this.b(param0, true);
            var9 = this.c(param0, true);
            if (var4 == 21) {
              break L3;
            } else {
              if (-23 == (var4 ^ -1)) {
                break L3;
              } else {
                mp.field_b.d(var5, var8, mp.field_b.field_J + var9, var6, -1);
                break L2;
              }
            }
          }
          L4: {
            mp.field_b.d(var5, var8, var9 + mp.field_b.field_J, var6, -1);
            var8 = var8 + hg.field_t;
            gf.b(var8, -1 + (var9 + var7 / 2), 121, 2, var6);
            if (21 == var4) {
              stackOut_10_0 = tf.field_p * 120 / 256;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 120 * wm.field_b / 256;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          var10 = stackIn_11_0;
          gf.b(var10 + (var8 + -1), 3 + var9, 3, -6 + var7, var6);
          break L2;
        }
        L5: {
          if (param0 == ((sm) this).field_g) {
            int discarded$2 = this.a(true, param0);
            int discarded$3 = this.b(10);
            break L5;
          } else {
            break L5;
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          le.field_b = le.field_b + 1;
          if (32 >= le.field_b + 1) {
            break L0;
          } else {
            le.field_b = 32;
            break L0;
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            field_c = null;
            break L1;
          }
        }
        var2 = 0;
        L2: while (true) {
          if (jd.field_j.length <= var2) {
            L3: {
              if ((ek.field_A ^ -1) != -1) {
                ek.field_A = ek.field_A + 1;
                if (32 > ek.field_A + 1) {
                  break L3;
                } else {
                  up.field_d = q.field_Bb;
                  ek.field_A = 0;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              if ((an.field_c ^ -1) == 0) {
                stackOut_17_0 = qd.field_e;
                stackIn_18_0 = stackOut_17_0;
                break L4;
              } else {
                stackOut_16_0 = an.field_c;
                stackIn_18_0 = stackOut_16_0;
                break L4;
              }
            }
            L5: {
              var2 = stackIn_18_0;
              if ((var2 ^ -1) == 0) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L5;
              } else {
                stackOut_19_0 = 32 + 16 * nd.field_d[var2];
                stackIn_21_0 = stackOut_19_0;
                break L5;
              }
            }
            L6: {
              var3 = stackIn_21_0;
              if (-25 != (var2 ^ -1)) {
                break L6;
              } else {
                L7: {
                  if ((1 << var2 & vq.field_a) == 0) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L7;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L7;
                  }
                }
                L8: {
                  var4 = stackIn_25_0;
                  if (var4 == 0) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L8;
                  } else {
                    stackOut_26_0 = 32 + 16 * nd.field_d[var2];
                    stackIn_28_0 = stackOut_26_0;
                    break L8;
                  }
                }
                var3 = stackIn_28_0;
                break L6;
              }
            }
            L9: {
              if (q.field_Bb == var3) {
                break L9;
              } else {
                L10: {
                  if (-1 == (ek.field_A ^ -1)) {
                    break L10;
                  } else {
                    up.field_d = re.a(up.field_d, 32, ek.field_A, q.field_Bb, 0);
                    break L10;
                  }
                }
                ek.field_A = 1;
                q.field_Bb = var3;
                break L9;
              }
            }
            return;
          } else {
            L11: {
              if (var2 == qd.field_e) {
                break L11;
              } else {
                if ((an.field_c ^ -1) != (var2 ^ -1)) {
                  ql.field_o[var2] = null;
                  tr.field_sb[var2] = null;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            var2++;
            continue L2;
          }
        }
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          var3 = qg.field_p[((sm) this).field_a][param0];
          if (!param1) {
            break L0;
          } else {
            int discarded$2 = this.a(-113, (byte) 1, 62);
            break L0;
          }
        }
        L1: {
          if (var3 == 21) {
            break L1;
          } else {
            if (22 != var3) {
              return mp.field_b.c(this.c(-22609, var3));
            } else {
              break L1;
            }
          }
        }
        return 120 + hg.field_t;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bi var9_ref = null;
        int var10 = 0;
        om var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        String[] var16 = null;
        int var17_int = 0;
        String var17 = null;
        int var18_int = 0;
        String var18 = null;
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
        Object var31 = null;
        String var32 = null;
        String var33 = null;
        bi var34 = null;
        bi var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var41 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        om var45 = null;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        L0: {
          var31 = null;
          var30 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            ((sm) this).a(12, (byte) -40, false);
            break L0;
          }
        }
        L1: {
          var6 = -60 + qg.field_r[((sm) this).field_a];
          var7 = -50 + qg.field_t[((sm) this).field_a];
          var8 = 1 + rs.field_Cb.field_J * 3 / 4;
          if (-1 != (param2 ^ -1)) {
            if (param2 != 1) {
              if ((param2 ^ -1) != -3) {
                if (param2 != 3) {
                  if (param2 == 4) {
                    L2: {
                      if ((ai.field_e ^ -1) == -2) {
                        param3 -= 5;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      var9 = 295 + param3;
                      var10 = 220;
                      var11 = 16711680;
                      hb.field_d.c(param3 + 5, param0 - -5);
                      this.a(var11, param0 - -5, var9, 5 + param0 + 14, md.field_K, 5, var10, 32 + param0 + 5, (byte) 110, 250 + param3);
                      this.a(-5, nn.field_a, 139 + (5 + param3), 40 + param0 - -5, param0 + 85, var9, var10, (byte) 62, 5 + param3 - -139, var11);
                      this.a(var11, 5 + (param0 + 130), var9, 70 + param0 - -5, pa.field_i, 5, var10, 100 + (5 + param0), (byte) 110, 188 + (5 + param3));
                      this.a(var11, param0 - -130, var9, 95 + param0, kj.field_e, 10, var10, 5 + (param0 + 260), (byte) 110, param3 - -235);
                      this.a(var11, 264 + param0 + 5, var9, 5 + (param0 + 110), ln.field_q, 25, var10, 5 + (param0 + 294), (byte) 110, 210 + (5 + param3));
                      // wide iinc 1 150
                      var12 = 400;
                      if (-2 == (ai.field_e ^ -1)) {
                        var12 = 390;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        ai.a(true);
                        gf.b(16 * var12 + em.field_c[0], ul.field_Db[0] + param0 * 16, 50, 7, h.field_s);
                        rs.field_Cb.d(sk.field_i, var12 + 22, param0 + rs.field_Cb.field_J / 4, 16777215, -1);
                        param0 += 40;
                        gf.b(16 * var12 - -em.field_c[0], ul.field_Db[0] + 16 * param0, 50, 7, h.field_s);
                        gf.b(em.field_c[1] + 16 * var12, 16 * param0 + ul.field_Db[1], 50, 7, h.field_s);
                        rs.field_Cb.d(pg.field_F, var12 - -22, rs.field_Cb.field_J / 4 + param0, 16777215, -1);
                        param0 += 40;
                        gf.b(16 * var12 + em.field_c[0], param0 * 16 - -ul.field_Db[0], 50, 7, h.field_s);
                        gf.b(em.field_c[2] + var12 * 16, ul.field_Db[2] + 16 * param0, 50, 7, h.field_s);
                        gf.b(em.field_c[3] + var12 * 16, ul.field_Db[3] + param0 * 16, 50, 7, h.field_s);
                        rs.field_Cb.d(vd.field_n, var12 + 22, param0 + rs.field_Cb.field_J / 4, 16777215, -1);
                        param0 += 40;
                        qk.field_y[0].b(var12 + -15, param0 - 15, 30, 30);
                        var13 = cl.field_n % 104;
                        if (4 >= var13) {
                          break L5;
                        } else {
                          if (48 >= var13) {
                            qk.field_y[var13 / 4].c(var12 + -15, param0 - 15, 30, 30, 128);
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      qk.field_y[12].c(-15 + var12, -15 + param0, 30, 30, 128);
                      break L4;
                    }
                    rs.field_Cb.d(or.field_d[0], var12 - -22, param0 - -(rs.field_Cb.field_J / 4), 16777215, -1);
                    return;
                  } else {
                    if ((param2 ^ -1) == -6) {
                      var9_ref = new bi(80, 80);
                      bs.a(var9_ref, 90);
                      bd.field_G.a(40, 40, cl.field_n % 25 * 200, 16384);
                      cg.i(0);
                      var9_ref.d(param3 + 15, 8 + param0);
                      var42 = er.field_n;
                      var10 = rs.field_Cb.a(wg.field_e.a(5607, var42), param3 - -80, param0, -80 + var6, var7, 16777215, -1, 3, 0, var8);
                      param0 = param0 + ((3 + var10 * 4) * var8 >> 242801698);
                      var11 = cl.field_n % 200;
                      eo.a(false, 68 + param0, param0 + 40, (byte) -51, var11, 55 + param3, param3);
                      this.a(param0 - -40, var11, param3 - -55, false, 92, param3, param0 - -68, 0, false);
                      var43 = ri.field_N;
                      var10 = rs.field_Cb.a(wg.field_e.a(5607, var43), param3 + 80, param0, var6 - 80, var7, 16777215, -1, 3, 0, var8);
                      param0 = param0 + ((4 * var10 + 3) * var8 >> -1123564190);
                      kj.field_f[cl.field_n % kj.field_f.length].f(5 + param3, 42 + param0);
                      var44 = rk.field_n;
                      var5 = var44;
                      var10 = rs.field_Cb.a(wg.field_e.a(5607, var44), 80 + param3, param0, -80 + var6, var7, 16777215, -1, 3, 0, var8);
                      param0 = param0 + ((3 + var10 * 4) * var8 >> -1463643934);
                      return;
                    } else {
                      if (-7 != (param2 ^ -1)) {
                        if ((param2 ^ -1) == -8) {
                          L6: {
                            var9 = cl.field_n % 200;
                            var10 = rs.field_Cb.a(wg.field_e.a(5607, jl.field_N), param3, param0, var6, var7, 16777215, -1, 3, 0, var8);
                            param0 = param0 + ((2 * var10 - -3) * var8 >> -1916841503);
                            var11 = param0;
                            var12 = param3 - -125;
                            var13 = param3 + 325;
                            var14 = 150;
                            var15 = 125;
                            var16 = new String[16];
                            var17 = wg.field_e.a(5607, ph.field_d);
                            var18 = wg.field_e.a(5607, jb.field_h);
                            var19 = rs.field_Cb.a(var17, new int[1], var16);
                            var20 = rs.field_Cb.a(var18, new int[1], var16);
                            if (var20 < var19) {
                              stackOut_96_0 = var19;
                              stackIn_97_0 = stackOut_96_0;
                              break L6;
                            } else {
                              stackOut_95_0 = var20;
                              stackIn_97_0 = stackOut_95_0;
                              break L6;
                            }
                          }
                          L7: {
                            var10 = stackIn_97_0;
                            var10 = 3;
                            var21 = var8 + var8 * var10;
                            int discarded$5 = rs.field_Cb.a(var17, var12, var11, var14, var21, 16777215, -1, 0, 1, var8);
                            int discarded$6 = rs.field_Cb.a(var18, var13, var11, var15, var21, 16777215, -1, 0, 1, var8);
                            eo.a(false, param0 - -25, 25 + param0, (byte) 120, var9, param3 - -100, param3);
                            this.a(param0 + 25, var9, param3 + 100, false, 92, param3, 25 + param0, 8, true);
                            var22 = (50 + cl.field_n) % 800 / 200;
                            this.a(param3 - -295, 16, var22, (var21 >> 1172414817) + var11, (byte) -70, (cl.field_n + 50) % 200);
                            var11 = var11 + (rs.field_Cb.field_J + var21);
                            var17 = wg.field_e.a(5607, tb.field_b);
                            var18 = wg.field_e.a(5607, wq.field_c);
                            var19 = rs.field_Cb.a(var17, new int[1], var16);
                            var20 = rs.field_Cb.a(var18, new int[1], var16);
                            if ((var20 ^ -1) <= (var19 ^ -1)) {
                              stackOut_99_0 = var20;
                              stackIn_100_0 = stackOut_99_0;
                              break L7;
                            } else {
                              stackOut_98_0 = var19;
                              stackIn_100_0 = stackOut_98_0;
                              break L7;
                            }
                          }
                          L8: {
                            var10 = stackIn_100_0;
                            var21 = var8 * var10 - -var8;
                            int discarded$7 = rs.field_Cb.a(var17, var12, var11, var14, var21, 16777215, -1, 0, 1, var8);
                            int discarded$8 = rs.field_Cb.a(var18, var13, var11, var15, var21, 16777215, -1, 0, 1, var8);
                            eo.a(false, 90 + param0, 90 + param0, (byte) 73, var9, param3 + 10, param3 + 110);
                            this.a(90 + param0, var9, param3 - -10, true, 92, 110 + param3, 90 + param0, 4, true);
                            this.a(param3 - -295, 16, -1, var11 - -(var21 >> 952734657), (byte) -21, (100 + cl.field_n) % 200);
                            var11 = var11 + (var8 + var21);
                            var17 = wg.field_e.a(5607, of.field_a);
                            var10 = rs.field_Cb.a(var17, new int[1], var16);
                            var21 = var10 * var8 + var8;
                            if (40 <= var21) {
                              break L8;
                            } else {
                              var21 = 40;
                              break L8;
                            }
                          }
                          L9: {
                            int discarded$9 = rs.field_Cb.a(var17, var12, var11, 200, var21, 16777215, -1, 0, 1, var8);
                            var23 = -(var9 / 24) + 15;
                            var24 = -(var9 / 17) + 10;
                            if (var24 >= 0) {
                              break L9;
                            } else {
                              var24 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            var25 = 4 + -(var9 / 30);
                            if (0 > var25) {
                              var25 = 0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            var26 = 80;
                            var27 = 5;
                            var28 = param3 + 18;
                            var11 += 10;
                            if (-1 != (ai.field_e ^ -1)) {
                              break L11;
                            } else {
                              var11 += 20;
                              break L11;
                            }
                          }
                          if ((var9 ^ -1) > -1) {
                            return;
                          } else {
                            L12: {
                              if (180 <= var9) {
                                break L12;
                              } else {
                                var29 = 4 * var26 / 15 - -(2 * var27);
                                this.a(var28, (byte) 126, var26, var25, var29, 8421504, var11);
                                var28 += 30;
                                var29 = 2 * var27 + var26;
                                this.a(var28, (byte) 127, var26, var23, var29, df.field_k[0], var11);
                                var28 += 30;
                                var29 = 2 * var27 + 10 * var26 / 15;
                                this.a(var28, (byte) 126, var26, var24, var29, df.field_k[2], var11);
                                break L12;
                              }
                            }
                            return;
                          }
                        } else {
                          if (8 != param2) {
                            if (param2 != 9) {
                              if (10 == param2) {
                                var5 = df.field_m + ac.field_v;
                                break L1;
                              } else {
                                throw new RuntimeException();
                              }
                            } else {
                              var5 = dm.field_a;
                              break L1;
                            }
                          } else {
                            var38 = hs.field_g;
                            var9 = rs.field_Cb.a(wg.field_e.a(5607, var38), param3 - -40, param0, var6 + -40, var7, 16777215, -1, 3, 0, var8);
                            this.a(param3 + 15, 20, 0, param0 + (rs.field_Cb.field_J * (var9 * 2 - -1) >> 1712980994), (byte) -15, cl.field_n % 200);
                            param0 = param0 + ((3 + var9 * 4) * var8 >> -502363550);
                            var39 = sp.field_b;
                            var9 = rs.field_Cb.a(wg.field_e.a(5607, var39), param3 - -40, param0, -40 + var6, var7, 16777215, -1, 3, 0, var8);
                            this.a(15 + param3, 20, 1, param0 + (rs.field_Cb.field_J * (1 + var9 * 2) >> 1114578370), (byte) -71, (cl.field_n + 185) % 200);
                            param0 = param0 + (var8 * (3 + 4 * var9) >> 1092191010);
                            var40 = jb.field_f;
                            var5 = var40;
                            var5 = var40;
                            var9 = rs.field_Cb.a(wg.field_e.a(5607, var40), param3 - -40, param0, var6 + -40, var7, 16777215, -1, 3, 0, var8);
                            this.a(15 + param3, 20, 2, (rs.field_Cb.field_J * (2 * var9 - -1) >> 1652261826) + param0, (byte) -82, (170 + cl.field_n) % 200);
                            var41 = ar.field_o;
                            var5 = var41;
                            var5 = var41;
                            param0 = param0 + (var8 * (4 * var9 - -3) >> 381074274);
                            var9 = rs.field_Cb.a(wg.field_e.a(5607, var41), 40 + param3, param0, var6 + -40, var7, 16777215, -1, 3, 0, var8);
                            this.a(param3 - -15, 20, 3, ((var9 * 2 + 1) * rs.field_Cb.field_J >> -1028884830) + param0, (byte) 90, (155 + cl.field_n) % 200);
                            param0 = param0 + (var8 * (4 * var9 + 3) >> 86763394);
                            return;
                          }
                        }
                      } else {
                        L13: {
                          var45 = (om) (Object) fj.field_p;
                          var10_ref = var45.h();
                          var10_ref.f();
                          var11 = cl.field_n % 200;
                          var12 = param3 + 35;
                          var13 = param0 + 40;
                          if (var11 < 170) {
                            L14: {
                              gf.b(var12, var13, 30, 16777215);
                              gf.c(var12, var13, 30, 16777215, 92);
                              ie.a(var10_ref, var10_ref.field_z << -1034708829, var10_ref.field_w << -1836412381, var12 * 16, var13 * 16, 0, 4096);
                              gf.c(var12, var13, 9, 0, 92);
                              di.field_i[0].f(-(di.field_i[0].field_z / 2) + 30 + var12, var13 - di.field_i[0].field_w / 2);
                              di.field_i[1].f(var12 - 30 - di.field_i[0].field_z / 2, var13 + -(di.field_i[0].field_w / 2));
                              di.field_i[2].f(var12 + -(di.field_i[0].field_z / 2), 30 + (var13 + -(di.field_i[0].field_w / 2)));
                              var14 = 4;
                              if (120 <= var11) {
                                var14 = 1;
                                break L14;
                              } else {
                                L15: {
                                  var15 = (-80 + var11) / 20;
                                  if (var15 < 0) {
                                    var15 = -var15;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (-81 >= (var11 ^ -1)) {
                                    var15++;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                L17: {
                                  var14 = var14 - var15;
                                  if (0 != var14) {
                                    break L17;
                                  } else {
                                    var14 = 1;
                                    break L17;
                                  }
                                }
                                break L14;
                              }
                            }
                            L18: {
                              rs.field_Cb.c(Integer.toString(var14), var12, 4 + var13, 16777215, -1);
                              if (var11 / 20 <= 0) {
                                break L18;
                              } else {
                                if ((var11 / 20 ^ -1) <= -5) {
                                  break L18;
                                } else {
                                  if ((var11 % 20 ^ -1) > -4) {
                                    gf.b(var12 - -30, var13, di.field_i[0].field_z / 2, 16777215);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            L19: {
                              if ((var11 / 20 ^ -1) >= -4) {
                                break L19;
                              } else {
                                if (-8 >= (var11 / 20 ^ -1)) {
                                  break L19;
                                } else {
                                  if ((var11 % 20 ^ -1) <= -4) {
                                    break L19;
                                  } else {
                                    gf.b(-30 + var12, var13, di.field_i[1].field_z / 2, 16777215);
                                    break L19;
                                  }
                                }
                              }
                            }
                            if (var11 <= 160) {
                              break L13;
                            } else {
                              if (-166 < (var11 ^ -1)) {
                                gf.b(var12, 30 + var13, di.field_i[2].field_z / 2, 16777215);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                        L20: {
                          var32 = da.field_a;
                          var14 = rs.field_Cb.a(wg.field_e.a(5607, var32), 80 + param3, param0, var6 + -80, var7, 16777215, -1, 3, 0, var8);
                          param0 = param0 + (var8 * (3 + 4 * var14) >> -531031006);
                          var15 = cl.field_n % 50;
                          if ((var15 ^ -1) <= -26) {
                            var15 -= 25;
                            var15 = var15 * ((614400 - 16384 * var15) * var15) / 15625;
                            break L20;
                          } else {
                            var15 = 0;
                            break L20;
                          }
                        }
                        var16_int = 0;
                        L21: while (true) {
                          if (var16_int >= 6) {
                            var16_int = 0;
                            L22: while (true) {
                              if (-11 >= (var16_int ^ -1)) {
                                L23: {
                                  var33 = er.field_l;
                                  var14 = rs.field_Cb.a(wg.field_e.a(5607, var33), param3 + 80, param0, -80 + var6, var7, 16777215, -1, 3, 0, var8);
                                  param0 = param0 + (var8 * (3 + var14 * 4) >> -1876001086);
                                  var16_int = cl.field_n / 100 % 3;
                                  var17_int = cl.field_n % 100;
                                  var18_int = 0;
                                  if ((var17_int ^ -1) >= -21) {
                                    break L23;
                                  } else {
                                    if (-41 >= (var17_int ^ -1)) {
                                      break L23;
                                    } else {
                                      L24: {
                                        if (-31 > (var17_int ^ -1)) {
                                          stackOut_55_0 = 1000 - var17_int * 25;
                                          stackIn_56_0 = stackOut_55_0;
                                          break L24;
                                        } else {
                                          stackOut_54_0 = -500 + 25 * var17_int;
                                          stackIn_56_0 = stackOut_54_0;
                                          break L24;
                                        }
                                      }
                                      var18_int = stackIn_56_0;
                                      break L23;
                                    }
                                  }
                                }
                                L25: {
                                  if (-22 >= (var17_int ^ -1)) {
                                    if (80 >= var17_int) {
                                      stackOut_61_0 = 256;
                                      stackIn_62_0 = stackOut_61_0;
                                      break L25;
                                    } else {
                                      stackOut_60_0 = 12 * (100 - var17_int);
                                      stackIn_62_0 = stackOut_60_0;
                                      break L25;
                                    }
                                  } else {
                                    stackOut_58_0 = 12 * var17_int;
                                    stackIn_62_0 = stackOut_58_0;
                                    break L25;
                                  }
                                }
                                L26: {
                                  var17_int = stackIn_62_0;
                                  if ((var16_int ^ -1) != -1) {
                                    if (1 != var16_int) {
                                      if (var16_int != 2) {
                                        break L26;
                                      } else {
                                        var35 = new bi(var10_ref.field_z - -30, var10_ref.field_w);
                                        bs.a(var35, 123);
                                        var20 = 0;
                                        var21 = 0;
                                        L27: while (true) {
                                          if ((var21 ^ -1) <= -11) {
                                            cg.i(0);
                                            var35.c(param3 + 3, 15 + param0, var17_int);
                                            var35.c(param3 - -3, param0 + 15, var18_int);
                                            break L26;
                                          } else {
                                            ie.a(var10_ref, 8 * var10_ref.field_z, var10_ref.field_w * 8, (var20 - -(var10_ref.field_z / 4)) * 16, 4 * var10_ref.field_w, 0, 2048);
                                            ie.a(var10_ref, 8 * var10_ref.field_z, var10_ref.field_w * 8, 16 * (var20 - -(var10_ref.field_z / 4)), var10_ref.field_w * 12, 0, 2048);
                                            var21++;
                                            var20 += 5;
                                            continue L27;
                                          }
                                        }
                                      }
                                    } else {
                                      var34 = new bi(var10_ref.field_z - -20, var10_ref.field_w);
                                      bs.a(var34, 83);
                                      var20 = 0;
                                      var21 = 0;
                                      L28: while (true) {
                                        if (5 <= var21) {
                                          cg.i(0);
                                          var34.c(param3 - -7, param0 - -15, var17_int);
                                          var34.c(param3 + 7, 15 + param0, var18_int);
                                          break L26;
                                        } else {
                                          var10_ref.f(var20, 0);
                                          var20 += 5;
                                          var21++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  } else {
                                    var10_ref.c(15 + param3, param0 - -15, var17_int);
                                    var10_ref.c(15 + param3, param0 - -15, var18_int);
                                    break L26;
                                  }
                                }
                                L29: {
                                  var36 = fr.field_F;
                                  var14 = rs.field_Cb.a(wg.field_e.a(5607, var36), 80 + param3, param0, var6 + -80, var7, 16777215, -1, 3, 0, var8);
                                  param0 = param0 + (var8 * (3 + var14 * 4) >> 657413058);
                                  if (null != oo.field_b) {
                                    var19 = cl.field_n % 50;
                                    var20 = 0;
                                    L30: while (true) {
                                      if (5 <= var20) {
                                        var20 = param3 - -10;
                                        var21 = oo.field_b[0] + (10 + param0);
                                        var22 = 1;
                                        L31: while (true) {
                                          if ((var22 ^ -1) <= -6) {
                                            break L29;
                                          } else {
                                            var23 = 0;
                                            L32: while (true) {
                                              if (-11 >= (var23 ^ -1)) {
                                                var22++;
                                                continue L31;
                                              } else {
                                                var24 = var22 * 10 + (param3 - -var23);
                                                var25 = 10 + param0 - -re.a(oo.field_b[-1 + var22], 10, var23, oo.field_b[var22], 0);
                                                gf.g(var20, var21, var24, var25, 12632256);
                                                var21 = var25;
                                                var20 = var24;
                                                var23++;
                                                continue L32;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        oo.field_b[var20] = re.a(er.field_q[var20], 50, var19, fg.field_c[var20], 0);
                                        var20++;
                                        continue L30;
                                      }
                                    }
                                  } else {
                                    break L29;
                                  }
                                }
                                gf.j(9 + param3, param0 + 10, 35, 16777215);
                                gf.f(param3 - -10, param0 - -44, 40, 16777215);
                                var37 = ub.field_Cb;
                                var14 = rs.field_Cb.a(wg.field_e.a(5607, var37), param3 + 80, param0, var6 - 80, var7, 16777215, -1, 3, 0, var8);
                                param0 = param0 + (var8 * (var14 * 4 - -3) >> 657175682);
                                return;
                              } else {
                                gf.f(-(var16_int >> 197779809) + (param3 - -36), var16_int + param0 + 30, -2 & var16_int, 16777215);
                                var16_int++;
                                continue L22;
                              }
                            }
                          } else {
                            var17_int = (-var15 + var16_int * 8192) / 6;
                            var18_int = (20 * je.a(var17_int, (byte) -104) >> 1818768588) + (param3 - -35 << -1404368604);
                            var19 = (20 * oh.b(var17_int, -122) >> 270691532) + (40 + param0 << -291756476);
                            gf.b(var18_int, var19, 64, 255, vj.field_F);
                            var16_int++;
                            continue L21;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L33: {
                    if ((ai.field_e ^ -1) == -2) {
                      param3 -= 5;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  jm.field_r.c(5 + param3, 5 + param0);
                  var9 = param3 - -345;
                  var10 = 120;
                  this.a(0, gp.field_a, 5 + (param3 - -315), 8 + param0, param0 + 8, var9, var10, (byte) 62, 315 + (param3 + 5), 16711680);
                  this.a(16711680, 25 + param0, var9, 25 + param0, lr.field_f, 5, var10, param0 - -25, (byte) 110, 315 + param3 + 5);
                  this.a(16711680, 78 + (5 + param0), var9, 69 + param0, lh.field_u, 0, var10, 78 + param0 + 5, (byte) 110, param3 - -205);
                  this.a(16711680, 95 + (5 + param0), var9, 5 + param0 + 110, eo.field_kb, 0, var10, param0 - -115, (byte) 110, 5 + (param3 - -195));
                  this.a(16711680, param0 + 5 + 120, var9, param0 + 5 - -160, fi.field_h, 5, var10, 5 + (param0 - -200), (byte) 110, 5 + param3 - -86);
                  return;
                }
              } else {
                var5 = jd.field_a;
                break L1;
              }
            } else {
              var5 = ck.field_g;
              break L1;
            }
          } else {
            var5 = vc.field_e;
            break L1;
          }
        }
        this.a(var8, -91, param0, param3, var6, 16777215, var7, (nq) (Object) rs.field_Cb, wg.field_e.a(5607, var5));
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
            ((sm) this).field_f = true;
        }
        return this.b(false) + 65 - -this.a(param1, false);
    }

    private final int f(int param0, int param1) {
        if (param0 != -20) {
            this.e((byte) 56);
        }
        return qg.field_l[((sm) this).field_a];
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((param5 ^ -1) > -151)) {
            return;
        }
        int var7 = param5;
        if (125 < var7) {
            var7 = -param5 + 150;
        }
        int var8 = 0;
        if (-26 >= (var7 ^ -1)) {
        } else {
            if (-126 <= (param5 ^ -1)) {
                var8 = re.a(param1, 25, param5, 0, 0);
            } else {
                var8 = re.a(0, 25, param5 + -125, -param1, 0);
            }
            param1 = re.a(param1 / 2, 25, var7, param1, 0);
        }
        int var9 = 103 / ((param4 - 25) / 40);
        if (0 != (param2 ^ -1)) {
            co.field_p[param2].b(-param1 + param0, var8 + param3 + -param1, 2 * param1, 2 * param1);
        } else {
            bd.field_G.a(15, var8 + param3, 8192 * param1 / bd.field_G.field_z, param0, 200 * (cl.field_n % 25));
        }
    }

    final void g(byte param0) {
        if (-6 == (((sm) this).field_a ^ -1)) {
            ri.field_I = null;
        }
        if (param0 <= 52) {
            sm.f(1);
        }
    }

    private final int b(int param0, int param1, int param2) {
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
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 20 + (this.b(false) - -qg.field_r[((sm) this).field_a]);
        var5 = 10 + this.h(-121);
        var6 = ln.field_H.length;
        if ((param1 ^ -1) < (var4 ^ -1)) {
          return -1;
        } else {
          if ((var4 + -16 ^ -1) < (param1 ^ -1)) {
            L0: {
              if (param1 >= -34 + var4) {
                break L0;
              } else {
                if (param1 <= -54 + var4) {
                  break L0;
                } else {
                  L1: {
                    if ((var5 + -5 ^ -1) <= (param2 ^ -1)) {
                      break L1;
                    } else {
                      if ((var5 + 17 ^ -1) >= (param2 ^ -1)) {
                        break L1;
                      } else {
                        return -2;
                      }
                    }
                  }
                  if (-45 + (var5 - -qg.field_t[((sm) this).field_a]) >= param2) {
                    break L0;
                  } else {
                    if (qg.field_t[((sm) this).field_a] + (var5 + -23) > param2) {
                      return -3;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            return -1;
          } else {
            param1 = var4 - param1;
            var7 = -(var6 * 21) + 310;
            var8 = -12 % ((param0 - 41) / 43);
            var9 = nc.field_t;
            var10 = 0;
            L2: while (true) {
              if ((var6 ^ -1) >= (var10 ^ -1)) {
                return -1;
              } else {
                L3: {
                  var11 = ln.field_H[var10];
                  if ((var11 ^ -1) < -13) {
                    var11 = 12;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var10 ^ -1) != (-1 + var6 ^ -1)) {
                    L5: {
                      if ((var9 ^ -1) != -1) {
                        stackOut_24_0 = var7 * var11 / var9;
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = 0;
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    var12 = stackIn_25_0;
                    var7 = var7 - var12;
                    var9 = var9 - var11;
                    var12 += 21;
                    break L4;
                  } else {
                    var12 = var7 - -16;
                    break L4;
                  }
                }
                L6: {
                  if (var6 - 1 != var10) {
                    if ((var5 + param1 ^ -1) < (param2 ^ -1)) {
                      break L6;
                    } else {
                      if (param2 < var5 - -param1 - -var12) {
                        return var10;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    if ((param2 ^ -1) > (param1 + var5 ^ -1)) {
                      break L6;
                    } else {
                      if (param2 >= var5 - -32 + (-param1 - -var12)) {
                        break L6;
                      } else {
                        return var10;
                      }
                    }
                  }
                }
                var5 = var5 + var12;
                var10++;
                continue L2;
              }
            }
          }
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (md.field_Q) {
            break L0;
          } else {
            if (!is.field_a) {
              L1: while (true) {
                if (!cc.e((byte) 55)) {
                  L2: {
                    L3: {
                      if ((((sm) this).field_a ^ -1) == -7) {
                        break L3;
                      } else {
                        if ((((sm) this).field_a ^ -1) == -8) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    this.f((byte) 122);
                    break L2;
                  }
                  L4: {
                    if (-9 != (((sm) this).field_a ^ -1)) {
                      break L4;
                    } else {
                      this.a(-16084);
                      break L4;
                    }
                  }
                  v.a((byte) -128);
                  ((sm) this).field_d.a(param0 ^ -2665, this.a(td.field_P, (byte) -109, nh.field_p), this.a(bb.field_b, (byte) -109, pd.field_k));
                  if (0 == (((sm) this).field_d.field_c ^ -1)) {
                    break L0;
                  } else {
                    this.a(true, ((sm) this).field_d.field_c, false);
                    break L0;
                  }
                } else {
                  if (oq.field_j != 13) {
                    this.k(23);
                    if ((((sm) this).field_d.field_c ^ -1) == 0) {
                      continue L1;
                    } else {
                      this.a(false, ((sm) this).field_d.field_c, false);
                      continue L1;
                    }
                  } else {
                    L5: {
                      if (1 == ((sm) this).field_a) {
                        break L5;
                      } else {
                        if (((sm) this).field_a == 2) {
                          break L5;
                        } else {
                          if (-4 == (((sm) this).field_a ^ -1)) {
                            break L5;
                          } else {
                            if (((sm) this).field_a == 4) {
                              break L5;
                            } else {
                              if (vr.field_c != 9) {
                                var2 = br.field_m;
                                ta.a(0, var2, (byte) 96, false);
                                continue L1;
                              } else {
                                continue L1;
                              }
                            }
                          }
                        }
                      }
                    }
                    ta.a(0, -1, (byte) 96, false);
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L6: {
          if (param0 == 2664) {
            break L6;
          } else {
            this.d(97, 114);
            break L6;
          }
        }
        L7: {
          L8: {
            if (((sm) this).field_a == 6) {
              break L8;
            } else {
              if (((sm) this).field_a == 7) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          this.d((byte) -70);
          break L7;
        }
        L9: {
          if ((((sm) this).field_a ^ -1) == -9) {
            this.a(true);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          ((sm) this).field_h = ((sm) this).field_h + 1;
          if (((sm) this).field_a != 10) {
            break L10;
          } else {
            on.field_c = on.field_c + 1;
            if (32 < on.field_c + 1) {
              on.field_c = 32;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (-6 != (((sm) this).field_a ^ -1)) {
            break L11;
          } else {
            nb.field_a = nb.field_a + 1;
            if (nb.field_a + 1 > 32) {
              nb.field_a = 32;
              break L11;
            } else {
              break L11;
            }
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        qd.field_e = this.d(param0 + 16191, pd.field_k, bb.field_b);
        if (param0 != -16084) {
            int discarded$0 = this.b(true);
        }
        if (je.field_d == 0) {
        } else {
            var2 = this.d(84, nh.field_p, td.field_P);
            if ((var2 ^ -1) == (an.field_c ^ -1)) {
                an.field_c = -1;
            } else {
                if (!(var2 == -1)) {
                    an.field_c = var2;
                }
            }
        }
    }

    private final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (vr.field_c != ((sm) this).field_a) {
            if (!((((sm) this).field_a ^ -1) == (gr.field_o ^ -1))) {
                return 0;
            }
        }
        if (nh.a((byte) -124, vr.field_c)) {
            if (nh.a((byte) -75, gr.field_o)) {
                if (!((vr.field_c ^ -1) == (gr.field_o ^ -1))) {
                    var2 = qg.field_p[vr.field_c].length * qg.field_l[vr.field_c] + (qg.field_t[vr.field_c] - -10);
                    var3 = qg.field_t[gr.field_o] - -(qg.field_l[gr.field_o] * qg.field_p[gr.field_o].length) - -10;
                    return re.a(var2, 32, eh.field_Q, var3, 0);
                }
            }
        }
        if (param0 != -98) {
            ((sm) this).field_h = -2;
        }
        return qg.field_l[((sm) this).field_a] * qg.field_p[((sm) this).field_a].length + qg.field_t[((sm) this).field_a] - -10;
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        o.field_s = param1;
        pr.field_g = 0 != jn.field_b ? re.a(pr.field_g, 32, jn.field_b, ac.field_w, 0) : ac.field_w;
        ac.field_w = 0;
        if (param0 != 4) {
            this.a((String) null, -102, (byte) 82, -77, 35, 32, 13, -31, 45, 70);
        }
        for (var3 = 0; var3 < param1; var3++) {
            ac.field_w = ac.field_w + cb.field_i[var3];
        }
        jn.field_b = 1;
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != -25370) {
            sm.f(36);
        }
    }

    final void g(int param0) {
        if (null == ce.field_x) {
            // ifnull L32
        }
        oa.a(480, 0, 640, (byte) -116, 0);
        int var2 = this.c(32);
        int var3 = this.b((byte) -98);
        int var4 = this.h(-121);
        int var5 = (-var2 + 640) / 2;
        int var6 = var5;
        int var7 = 20 + var2;
        int var8 = var4 - 10;
        int var9 = var3 - -10;
        int var10 = 127 / ((param0 - 15) / 60);
        ga.a(var9, var8, var6, (byte) -72, var7);
        this.e(var4, 7903);
    }

    private final boolean a(byte param0, int param1) {
        if (param0 != 44) {
            return false;
        }
        return true;
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_73_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_91_2 = null;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        Object stackIn_92_2 = null;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        Object stackIn_93_2 = null;
        int stackIn_93_3 = 0;
        int stackIn_102_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_90_2 = null;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        Object stackOut_92_2 = null;
        int stackOut_92_3 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        Object stackOut_91_2 = null;
        int stackOut_91_3 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param2) {
            break L0;
          } else {
            field_e = true;
            break L0;
          }
        }
        L1: {
          var4 = qg.field_p[((sm) this).field_a][param1];
          if (((sm) this).field_d.d(-1)) {
            this.b(param1, param0, var4, -32580);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = var4;
          if (var6 == 0) {
            break L2;
          } else {
            L3: {
              if (-31 == (var6 ^ -1)) {
                break L3;
              } else {
                if (-2 == (var6 ^ -1)) {
                  break L3;
                } else {
                  if ((var6 ^ -1) == -3) {
                    break L3;
                  } else {
                    if ((var6 ^ -1) != -9) {
                      if (var6 == 25) {
                        break L3;
                      } else {
                        if (-24 != (var6 ^ -1)) {
                          if (var6 != 5) {
                            if ((var6 ^ -1) == -7) {
                              break L3;
                            } else {
                              if (var6 == 9) {
                                break L3;
                              } else {
                                if (4 != var6) {
                                  if (-8 == (var6 ^ -1)) {
                                    break L3;
                                  } else {
                                    if (-11 != (var6 ^ -1)) {
                                      if (-12 != (var6 ^ -1)) {
                                        if (12 == var6) {
                                          break L3;
                                        } else {
                                          if (var6 != 13) {
                                            if ((var6 ^ -1) != -15) {
                                              if (-16 == (var6 ^ -1)) {
                                                break L3;
                                              } else {
                                                if ((var6 ^ -1) != -17) {
                                                  if (17 == var6) {
                                                    break L3;
                                                  } else {
                                                    if ((var6 ^ -1) != -19) {
                                                      if (var6 == 19) {
                                                        break L3;
                                                      } else {
                                                        if (-25 == (var6 ^ -1)) {
                                                          break L3;
                                                        } else {
                                                          if (var6 != 26) {
                                                            if (var6 == 20) {
                                                              break L3;
                                                            } else {
                                                              if ((var6 ^ -1) == -28) {
                                                                break L3;
                                                              } else {
                                                                if ((var6 ^ -1) != -29) {
                                                                  if ((var6 ^ -1) != -30) {
                                                                    if ((var6 ^ -1) == -32) {
                                                                      break L3;
                                                                    } else {
                                                                      if (32 == var6) {
                                                                        break L3;
                                                                      } else {
                                                                        if ((var6 ^ -1) != -22) {
                                                                          if (-23 == (var6 ^ -1)) {
                                                                            L4: {
                                                                              if (((sm) this).field_d.a(-1)) {
                                                                                ak.c(-68, 0);
                                                                                break L4;
                                                                              } else {
                                                                                break L4;
                                                                              }
                                                                            }
                                                                            L5: {
                                                                              if (!((sm) this).field_d.a(true)) {
                                                                                break L5;
                                                                              } else {
                                                                                ak.c(-61, 256);
                                                                                break L5;
                                                                              }
                                                                            }
                                                                            L6: {
                                                                              if (!((sm) this).field_d.b((byte) -73)) {
                                                                                break L6;
                                                                              } else {
                                                                                L7: {
                                                                                  stackOut_90_0 = -120;
                                                                                  stackOut_90_1 = this.b(param1, true);
                                                                                  stackOut_90_2 = this;
                                                                                  stackIn_92_0 = stackOut_90_0;
                                                                                  stackIn_92_1 = stackOut_90_1;
                                                                                  stackIn_92_2 = stackOut_90_2;
                                                                                  stackIn_91_0 = stackOut_90_0;
                                                                                  stackIn_91_1 = stackOut_90_1;
                                                                                  stackIn_91_2 = stackOut_90_2;
                                                                                  if (param2) {
                                                                                    stackOut_92_0 = stackIn_92_0;
                                                                                    stackOut_92_1 = stackIn_92_1;
                                                                                    stackOut_92_2 = this;
                                                                                    stackOut_92_3 = 0;
                                                                                    stackIn_93_0 = stackOut_92_0;
                                                                                    stackIn_93_1 = stackOut_92_1;
                                                                                    stackIn_93_2 = stackOut_92_2;
                                                                                    stackIn_93_3 = stackOut_92_3;
                                                                                    break L7;
                                                                                  } else {
                                                                                    stackOut_91_0 = stackIn_91_0;
                                                                                    stackOut_91_1 = stackIn_91_1;
                                                                                    stackOut_91_2 = this;
                                                                                    stackOut_91_3 = 1;
                                                                                    stackIn_93_0 = stackOut_91_0;
                                                                                    stackIn_93_1 = stackOut_91_1;
                                                                                    stackIn_93_2 = stackOut_91_2;
                                                                                    stackIn_93_3 = stackOut_91_3;
                                                                                    break L7;
                                                                                  }
                                                                                }
                                                                                var6 = stackIn_93_0 + (stackIn_93_1 - (-this.a(stackIn_93_3 != 0, param1) + -hg.field_t)) >> 395712737;
                                                                                var7 = pd.field_k - var6;
                                                                                var8 = 256 * var7 / 120;
                                                                                if ((var8 ^ -1) >= -1) {
                                                                                  ak.c(127, 0);
                                                                                  break L6;
                                                                                } else {
                                                                                  if (256 > var8) {
                                                                                    ak.c(-66, var8);
                                                                                    break L6;
                                                                                  } else {
                                                                                    ak.c(127, 256);
                                                                                    break L6;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L8: {
                                                                              if (!((sm) this).field_d.c(-97)) {
                                                                                break L8;
                                                                              } else {
                                                                                L9: {
                                                                                  if (param2) {
                                                                                    stackOut_101_0 = 0;
                                                                                    stackIn_102_0 = stackOut_101_0;
                                                                                    break L9;
                                                                                  } else {
                                                                                    stackOut_100_0 = 1;
                                                                                    stackIn_102_0 = stackOut_100_0;
                                                                                    break L9;
                                                                                  }
                                                                                }
                                                                                qs.d(stackIn_102_0 != 0);
                                                                                break L8;
                                                                              }
                                                                            }
                                                                            if (!((sm) this).field_d.f(-77)) {
                                                                              break L3;
                                                                            } else {
                                                                              jn.a(11615);
                                                                              break L2;
                                                                            }
                                                                          } else {
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          L10: {
                                                                            var5 = 0;
                                                                            if (!((sm) this).field_d.a(-1)) {
                                                                              break L10;
                                                                            } else {
                                                                              if ((tf.field_p ^ -1) < -1) {
                                                                                js.a(0, 197126152);
                                                                                var5 = 1;
                                                                                break L10;
                                                                              } else {
                                                                                break L10;
                                                                              }
                                                                            }
                                                                          }
                                                                          L11: {
                                                                            if (!((sm) this).field_d.a(true)) {
                                                                              break L11;
                                                                            } else {
                                                                              if (tf.field_p < 256) {
                                                                                var5 = 1;
                                                                                js.a(256, 197126152);
                                                                                break L11;
                                                                              } else {
                                                                                break L11;
                                                                              }
                                                                            }
                                                                          }
                                                                          L12: {
                                                                            if (((sm) this).field_d.b((byte) -50)) {
                                                                              L13: {
                                                                                var6 = this.b(param1, true) + this.a(true, param1) + hg.field_t - 120 >> -1679567071;
                                                                                var7 = pd.field_k - var6;
                                                                                var8 = 256 * var7 / 120;
                                                                                if (0 < var8) {
                                                                                  if (-257 < (var8 ^ -1)) {
                                                                                    js.a(var8, 197126152);
                                                                                    break L13;
                                                                                  } else {
                                                                                    js.a(256, 197126152);
                                                                                    break L13;
                                                                                  }
                                                                                } else {
                                                                                  js.a(0, 197126152);
                                                                                  break L13;
                                                                                }
                                                                              }
                                                                              var5 = 1;
                                                                              break L12;
                                                                            } else {
                                                                              break L12;
                                                                            }
                                                                          }
                                                                          L14: {
                                                                            if (!((sm) this).field_d.c(-97)) {
                                                                              break L14;
                                                                            } else {
                                                                              if ((tf.field_p ^ -1) >= -1) {
                                                                                break L14;
                                                                              } else {
                                                                                L15: {
                                                                                  var5 = 1;
                                                                                  if (param2) {
                                                                                    stackOut_72_0 = 0;
                                                                                    stackIn_73_0 = stackOut_72_0;
                                                                                    break L15;
                                                                                  } else {
                                                                                    stackOut_71_0 = 1;
                                                                                    stackIn_73_0 = stackOut_71_0;
                                                                                    break L15;
                                                                                  }
                                                                                }
                                                                                df.c(stackIn_73_0 != 0);
                                                                                break L14;
                                                                              }
                                                                            }
                                                                          }
                                                                          L16: {
                                                                            if (!((sm) this).field_d.f(-97)) {
                                                                              break L16;
                                                                            } else {
                                                                              if (tf.field_p < 256) {
                                                                                var5 = 1;
                                                                                cc.f((byte) 124);
                                                                                break L16;
                                                                              } else {
                                                                                break L16;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (var5 != 0) {
                                                                            L17: {
                                                                              if (!((sm) this).field_d.b((byte) -114)) {
                                                                                break L17;
                                                                              } else {
                                                                                if (cl.field_n > qg.field_q) {
                                                                                  break L17;
                                                                                } else {
                                                                                  break L2;
                                                                                }
                                                                              }
                                                                            }
                                                                            gm discarded$1 = qk.a(qc.field_w, 89);
                                                                            qg.field_q = 25 + cl.field_n;
                                                                            break L2;
                                                                          } else {
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L2;
          }
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        bi var7 = null;
        bi var7_ref = null;
        bi var8 = null;
        bi var9_ref = null;
        int var9 = 0;
        int var10 = 0;
        bi var10_ref = null;
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
        String var21_ref = null;
        int var21 = 0;
        int var22 = 0;
        String var22_ref_String = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        bi var28 = null;
        bi var29 = null;
        bi var30 = null;
        int stackIn_5_0 = 0;
        bi stackIn_8_0 = null;
        bi stackIn_11_0 = null;
        bi stackIn_24_0 = null;
        bi stackIn_27_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        bi stackOut_7_0 = null;
        bi stackOut_6_0 = null;
        bi stackOut_10_0 = null;
        bi stackOut_9_0 = null;
        bi stackOut_23_0 = null;
        bi stackOut_22_0 = null;
        bi stackOut_26_0 = null;
        bi stackOut_25_0 = null;
        var27 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 52;
        var3 = 140;
        gf.a(kc.field_m);
        var4 = var2;
        gf.a();
        var6 = 0;
        L0: while (true) {
          if (var6 >= 25) {
            L1: {
              if (gl.field_h == null) {
                gl.field_h = new bi(256, 256);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (il.field_gb == null) {
                il.field_gb = new bi(256, 256);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 == (an.field_c ^ -1)) {
                stackOut_40_0 = qd.field_e;
                stackIn_41_0 = stackOut_40_0;
                break L3;
              } else {
                stackOut_39_0 = an.field_c;
                stackIn_41_0 = stackOut_39_0;
                break L3;
              }
            }
            L4: {
              L5: {
                var6 = stackIn_41_0;
                if (0 == (var6 ^ -1)) {
                  break L5;
                } else {
                  if ((vq.field_a & 1 << var6 ^ -1) == -1) {
                    break L5;
                  } else {
                    stackOut_43_0 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    break L4;
                  }
                }
              }
              stackOut_44_0 = 0;
              stackIn_45_0 = stackOut_44_0;
              break L4;
            }
            L6: {
              var5 = stackIn_45_0;
              if (var5 == 0) {
                var7 = pc.field_n;
                var8 = n.field_k;
                break L6;
              } else {
                var7_ref = jd.field_j[var6];
                var8 = mr.a(var6, -94);
                break L6;
              }
            }
            L7: {
              ra.a(-106);
              gl.field_h.e();
              gf.b();
              var7.b(0, 0, 256, 256);
              il.field_gb.e();
              var8.c(0, 0);
              cg.i(0);
              var9 = 64 + (int)(64.0 * Math.cos(3.141592653589793 * (double)(cl.field_n * 2) / 150.0));
              var10 = re.a(0, 32, le.field_b, 600, 0);
              var11 = 155;
              var12 = (640 + -var10) / 2;
              var13 = 220;
              if (20 >= var10) {
                break L7;
              } else {
                ga.a(var11, var13, var12, (byte) -124, var10);
                break L7;
              }
            }
            L8: {
              L9: {
                gf.d(10 + var12, var13, var12 - -var10 - 10, var11 + var13);
                var14 = 98;
                var15 = (qg.field_m[((sm) this).field_a] >> -1731270655) + 24;
                var16 = 128;
                var17 = 113 / ((87 - param0) / 34);
                gf.a(-(var16 >> 661439845) + -(var16 >> 371950401) + var14, var15 + 6, var16 + (var16 >> -262807964), 136, 10, 0, 128);
                gf.f(-(var16 >> -1555728479) + (var14 + -(var16 >> -628873051)), 6 + var15, (var16 >> -1736833500) + var16, 136, 10, ui.a(3974311, 0, -95, 128));
                il.field_gb.c(-var16 + var14, -54 + var15, var16 << -106974559, 256, var9);
                gl.field_h.c(var14 - (var16 >> 1907723809), 10 + var15, var16, 128, 256);
                var18 = 350;
                var2 = 24 + this.b(false) + (this.c(32) + 16) + -var18;
                var19 = 136;
                var20 = -var19 + (-34 + this.h(-110));
                gf.a(var2, var20, var18, var19, 10, 0, 128);
                gf.f(var2, var20, var18, var19, 10, ui.a(3974311, 0, -118, 128));
                if (-1 == var6) {
                  break L9;
                } else {
                  if (var6 != 24) {
                    mp.field_b.d(ud.field_a[var6].toUpperCase(), var2 + 10, var20 + (6 + mp.field_b.field_J), 2805974, -1);
                    var21_ref = "(" + re.a(af.field_e, 4371, new String[1]) + ")";
                    var22 = rs.field_Cb.a(var21_ref, 10 + var2, 14 + (var20 + rs.field_Cb.field_J), var18 - 20, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
                    var22 = var22 + (1 + rs.field_Cb.a(ul.field_Qb[var6], 10 + var2, rs.field_Cb.field_J / 2 + var20 + (14 - -((1 + var22) * rs.field_Cb.field_J)), -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J));
                    int discarded$4 = rs.field_Cb.a(a.field_i, 10 + var2, var20 - (-14 - (var22 + 1) * rs.field_Cb.field_J), var18 + -20, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if ((var6 ^ -1) == -25) {
                L10: {
                  mp.field_b.d(ud.field_a[var6].toUpperCase(), var2 + 10, 6 + var20 + mp.field_b.field_J, 2805974, -1);
                  if (var5 != 0) {
                    var21_ref = "(" + re.a(af.field_e, 4371, new String[1]) + ")";
                    var22_ref_String = ul.field_Qb[var6];
                    break L10;
                  } else {
                    var21_ref = "(" + kj.field_i + "???)";
                    var22_ref = ep.field_c;
                    break L10;
                  }
                }
                var23 = rs.field_Cb.a(var21_ref, var2 - -10, 14 + (var20 + rs.field_Cb.field_J), -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
                var23 = var23 + (1 - -rs.field_Cb.a(var22_ref_String, 10 + var2, (var23 + 1) * rs.field_Cb.field_J + (var20 - (-14 + -(rs.field_Cb.field_J / 2))), var18 - 20, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J));
                int discarded$5 = rs.field_Cb.a(a.field_i, var2 - -10, (var23 + 1) * rs.field_Cb.field_J + 14 + var20, -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
                break L8;
              } else {
                if (!oe.field_e) {
                  mp.field_b.d(me.field_c.toUpperCase(), var2 + 10, mp.field_b.field_J + (6 + var20), 2805974, -1);
                  int discarded$6 = rs.field_Cb.a(rk.field_l, 10 + var2, var20 - -14 - -rs.field_Cb.field_J, -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
                  break L8;
                } else {
                  mp.field_b.d(ol.field_j.toUpperCase(), 10 + var2, var20 + 6 + mp.field_b.field_J, 2805974, -1);
                  int discarded$7 = rs.field_Cb.a(li.field_c, 10 + var2, rs.field_Cb.field_J + var20 + 14, -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
                  break L8;
                }
              }
            }
            L11: {
              if (ek.field_A != 0) {
                var21 = re.a(up.field_d, 32, ek.field_A, q.field_Bb, 0);
                break L11;
              } else {
                var21 = q.field_Bb;
                break L11;
              }
            }
            L12: {
              var21 = re.a(0, 32, le.field_b, var21, 0);
              if (-21 > (var21 ^ -1)) {
                var18 = 52;
                var2 = 89 + var14;
                var20 = -(var21 >> -412989631) + (var15 + 74);
                gf.a(var2, var20, var18, var21, 10, 0, 128);
                gf.f(var2, var20, var18, var21, 10, ui.a(3974311, 0, -122, 128));
                gf.d(4 + var2, 4 + var20, var18 + var2 - 4, -4 + var21 + var20);
                if (0 == (var6 ^ -1)) {
                  break L12;
                } else {
                  L13: {
                    if (var6 != 24) {
                      break L13;
                    } else {
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var22 = nd.field_d[var6];
                  if ((var22 ^ -1) < -2) {
                    L14: {
                      var23 = var20 + 24;
                      var24 = var21;
                      if (var24 < 48) {
                        var24 = 48;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var25 = var20 - -var24 - 24;
                    var26 = 0;
                    L15: while (true) {
                      if ((var22 ^ -1) >= (var26 ^ -1)) {
                        break L12;
                      } else {
                        cm.field_b.c(var2 - -10, var23 + (var26 * (var25 + -var23) / (var22 + -1) - 16), 32, 32);
                        var26++;
                        continue L15;
                      }
                    }
                  } else {
                    cm.field_b.c(10 + var2, var20 + ((var21 >> 958686913) + -16), 32, 32);
                    break L12;
                  }
                }
              } else {
                break L12;
              }
            }
            gf.b(kc.field_m);
            return;
          } else {
            L16: {
              var7_int = (int)(Math.cos((double)(-(23 * var6)) + 3.141592653589793 * (double)(2 * cl.field_n) / 150.0) * 64.0) + 64;
              if ((1 << var6 & vq.field_a ^ -1) == -1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L16;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L16;
              }
            }
            L17: {
              var5 = stackIn_5_0;
              if (var5 != 0) {
                stackOut_7_0 = df.a(var6, 32);
                stackIn_8_0 = stackOut_7_0;
                break L17;
              } else {
                stackOut_6_0 = ed.field_b;
                stackIn_8_0 = stackOut_6_0;
                break L17;
              }
            }
            L18: {
              var28 = stackIn_8_0;
              var8 = var28;
              if (var5 == 0) {
                stackOut_10_0 = lq.field_o;
                stackIn_11_0 = stackOut_10_0;
                break L18;
              } else {
                stackOut_9_0 = oi.a(var6, (byte) 66);
                stackIn_11_0 = stackOut_9_0;
                break L18;
              }
            }
            L19: {
              var29 = stackIn_11_0;
              var9_ref = var29;
              if ((le.field_b ^ -1) == -33) {
                if ((an.field_c ^ -1) == (var6 ^ -1)) {
                  L20: {
                    if (var5 == 0) {
                      stackOut_23_0 = n.field_k;
                      stackIn_24_0 = stackOut_23_0;
                      break L20;
                    } else {
                      stackOut_22_0 = mr.a(var6, -106);
                      stackIn_24_0 = stackOut_22_0;
                      break L20;
                    }
                  }
                  L21: {
                    var8 = stackIn_24_0;
                    if (var5 == 0) {
                      stackOut_26_0 = pc.field_n;
                      stackIn_27_0 = stackOut_26_0;
                      break L21;
                    } else {
                      stackOut_25_0 = jd.field_j[var6];
                      stackIn_27_0 = stackOut_25_0;
                      break L21;
                    }
                  }
                  var30 = stackIn_27_0;
                  var9_ref = var30;
                  var10_ref = new bi(48, 48);
                  bs.a(var10_ref, 112);
                  var30.c(0, 0, 48, 48);
                  cg.i(0);
                  var8.c(var4 - 32, var3 - 32, 96, 96, var7_int << 1998380385);
                  var10_ref.c(var4 + -8, -8 + var3, 256);
                  break L19;
                } else {
                  if ((qd.field_e ^ -1) == (var6 ^ -1)) {
                    if (-1 == an.field_c) {
                      var28.c(-16 + var4, var3 + -16, var7_int);
                      var29.c(var4, var3, 256);
                      var29.c(var4, var3, 128);
                      break L19;
                    } else {
                      var28.c(var4 + -16, var3 - 16, var7_int);
                      var29.c(var4, var3, 256);
                      break L19;
                    }
                  } else {
                    if (0 == (an.field_c ^ -1)) {
                      var28.c(var4 + -16, var3 - 16, var7_int);
                      var29.c(var4, var3, 256);
                      break L19;
                    } else {
                      var28.c(var4 - 16, -16 + var3, var7_int >> 263690497);
                      var29.c(var4, var3, 128);
                      break L19;
                    }
                  }
                }
              } else {
                var28.c(-16 + var4, var3 + -16, var7_int * le.field_b / 32);
                var29.c(var4, var3, (le.field_b << 1059503144) / 32);
                break L19;
              }
            }
            L22: {
              var4 += 42;
              if (12 == var6 % 13) {
                var3 = (int)((double)var3 + Math.sqrt(3.0) * 21.0);
                var4 = var2 - -21;
                break L22;
              } else {
                break L22;
              }
            }
            var6++;
            continue L0;
          }
        }
    }

    private final int b(int param0, boolean param1) {
        if (!param1) {
            return -70;
        }
        return this.b(false) + 65;
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((oq.field_j ^ -1) != -2) {
            break L0;
          } else {
            L1: {
              if (mm.field_n) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            mm.field_n = stackIn_4_0 != 0;
            break L0;
          }
        }
        L2: {
          var2 = 85 / ((-27 - param0) / 45);
          if (2 != oq.field_j) {
            break L2;
          } else {
            em.a(us.b(0), 1);
            break L2;
          }
        }
        L3: {
          if ((oq.field_j ^ -1) != -4) {
            break L3;
          } else {
            em.a(dg.g(1), 1);
            break L3;
          }
        }
        L4: {
          if (oq.field_j != 4) {
            break L4;
          } else {
            em.a(mq.c((byte) 67), 1);
            break L4;
          }
        }
        L5: {
          if (vr.field_c == 6) {
            this.e(170);
            break L5;
          } else {
            if (11 == vr.field_c) {
              ((sm) this).field_d.e(85);
              break L5;
            } else {
              ((sm) this).field_d.b(0);
              break L5;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, nq param7, String param8) {
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = ShatteredPlansClient.field_F ? 1 : 0;
        String[] var16 = vi.a(param7, (byte) 119, param8, new int[1]);
        String[] var11 = var16;
        for (var12 = 0; (var12 ^ -1) > (var11.length ^ -1); var12++) {
            var13 = var11[var12];
            param2 = param2 + param0;
            var14 = param7.c(var13);
            if (4 * var14 < param4 * 3) {
                param7.d(var13, param3, param2, param5, -1);
            } else {
                param7.b(var13, param3, param2, param5, -1, param4);
            }
        }
        if (param1 != -91) {
            this.a(106, true, 125, -94);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var17 = null;
        L0: {
          var8 = 20;
          var9 = 5;
          var10 = -77 % ((param1 - 63) / 63);
          jq.a(2 + var9, param5, 4 + var8, -2 + param6 + (param2 - param4), -2 + param0, (byte) -126, 4 + param4);
          if (0 >= param3) {
            break L0;
          } else {
            L1: {
              var11 = param2 * param3 / 15 - -(2 * var9);
              gf.a(param0, param2 + (param6 + -var11), var8, var11, var9, param5);
              var12 = var11 / 3;
              if ((2 * var9 ^ -1) > (var12 ^ -1)) {
                break L1;
              } else {
                var12 = 1 + var9 * 2;
                break L1;
              }
            }
            gf.b(param0, param2 + (param6 - var11), var8, var12, var9, 0, param5);
            var17 = new int[4];
            gf.a(var17);
            gf.d(param0, param6, param0 + var8, param2 + param6);
            ie.a(ii.field_q, param0, param6);
            gf.b(var17);
            break L0;
          }
        }
        rs.field_Cb.c(Integer.toString(param3), var8 / 2 + param0, 10 + param6 + param2, 16777215, -1);
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = ln.field_H.length;
        int var4 = ac.field_w - -147;
        for (var5 = 0; (var5 ^ -1) > (var3 ^ -1); var5++) {
            var4 = var4 - cb.field_i[var5];
            if (var4 < 0) {
                break;
            }
        }
        if (param1 != -57) {
            return;
        }
        int var6 = var5 - -param0;
        if (var6 >= 0) {
            if ((ln.field_H.length ^ -1) < (var6 ^ -1)) {
                this.d(4, var6);
            }
        }
    }

    sm(int param0) {
        ((sm) this).field_a = param0;
        ((sm) this).field_d = new np(qg.field_p[((sm) this).field_a].length);
        ln.field_H = new int[pe.field_J.length];
        ((sm) this).a(0, (byte) 28, false);
    }

    private final void b(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param3 == -32580) {
            break L0;
          } else {
            field_b = 98;
            break L0;
          }
        }
        L1: {
          var5 = param2;
          if (-1 == (var5 ^ -1)) {
            ((sm) this).field_g = param0;
            var5 = param1 ? 1 : 0;
            ta.a(gr.field_o, 12, (byte) 96, var5 != 0);
            break L1;
          } else {
            if (30 == var5) {
              ((sm) this).field_g = param0;
              var5 = param1 ? 1 : 0;
              var6 = var5;
              ta.a(0, -4, (byte) 96, var6 != 0);
              break L1;
            } else {
              if (var5 == 1) {
                if (w.d(true)) {
                  var5 = 0;
                  uc.a(320, mp.field_b.field_K, mp.field_b.field_K - -mp.field_b.field_q, 240, 8, se.field_a, param1, mr.field_i, (byte) -87, 2, mr.field_i, (nq) (Object) mp.field_b, false, 8, var5);
                  break L1;
                } else {
                  ((sm) this).field_g = param0;
                  var5 = param1 ? 1 : 0;
                  var6 = var5;
                  ta.a(gr.field_o, -6, (byte) 96, var6 != 0);
                  break L1;
                }
              } else {
                if (-3 == (var5 ^ -1)) {
                  ((sm) this).field_g = param0;
                  var5 = param1 ? 1 : 0;
                  ta.a(0, -1, (byte) 96, var5 != 0);
                  break L1;
                } else {
                  if (8 == var5) {
                    ((sm) this).field_g = param0;
                    var5 = param1 ? 1 : 0;
                    ta.a(gr.field_o, 0, (byte) 96, var5 != 0);
                    break L1;
                  } else {
                    if (var5 == 25) {
                      ((sm) this).field_g = param0;
                      var5 = param1 ? 1 : 0;
                      ta.a(gr.field_o, 0, (byte) 96, var5 != 0);
                      uo.field_e = true;
                      break L1;
                    } else {
                      if ((var5 ^ -1) == -24) {
                        ((sm) this).field_g = param0;
                        var5 = param1 ? 1 : 0;
                        ta.a(gr.field_o, 8, (byte) 96, var5 != 0);
                        break L1;
                      } else {
                        if ((var5 ^ -1) != -32) {
                          if (-6 != (var5 ^ -1)) {
                            if (6 != var5) {
                              if ((var5 ^ -1) == -10) {
                                ((sm) this).field_g = param0;
                                var5 = br.field_m;
                                var6 = param1 ? 1 : 0;
                                ta.a(gr.field_o, var5, (byte) 96, var6 != 0);
                                break L1;
                              } else {
                                if ((var5 ^ -1) == -5) {
                                  ((sm) this).field_g = param0;
                                  var5 = param1 ? 1 : 0;
                                  ta.a(gr.field_o, 5, (byte) 96, var5 != 0);
                                  break L1;
                                } else {
                                  if (-22 == (var5 ^ -1)) {
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var5 == 22) {
                                        break L2;
                                      } else {
                                        if (var5 == 7) {
                                          if (null != bj.field_K) {
                                            ej.c(param3 ^ -32580);
                                            break L1;
                                          } else {
                                            var5 = param1 ? 1 : 0;
                                            ne.field_s = false;
                                            m.a(8, 13421772, rm.field_b, 8, mp.field_b.field_K, mr.field_i, 240, mp.field_b.field_K - -mp.field_b.field_q, mr.field_i, 320, (nq) (Object) mp.field_b, (nq) (Object) mp.field_b, 0, mp.field_b.field_K, ah.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (bi[]) null, es.field_n);
                                            fm.a(var5 != 0, -1);
                                            break L1;
                                          }
                                        } else {
                                          if (var5 == 10) {
                                            ((sm) this).field_g = param0;
                                            ce.field_x.a(false, param1);
                                            lg.field_b = true;
                                            cs.field_i = false;
                                            break L1;
                                          } else {
                                            if (11 != var5) {
                                              if (var5 == 12) {
                                                ((sm) this).field_g = param0;
                                                ce.field_x.d(-7970);
                                                var5 = param1 ? 1 : 0;
                                                ta.a(0, -1, (byte) 96, var5 != 0);
                                                break L1;
                                              } else {
                                                if (13 != var5) {
                                                  if (14 != var5) {
                                                    if (var5 != 15) {
                                                      if (-17 == (var5 ^ -1)) {
                                                        break L2;
                                                      } else {
                                                        if ((var5 ^ -1) != -18) {
                                                          if ((var5 ^ -1) == -19) {
                                                            ff.field_y = 0;
                                                            break L1;
                                                          } else {
                                                            if (19 != var5) {
                                                              if (-25 != (var5 ^ -1)) {
                                                                if (26 == var5) {
                                                                  if (!this.a((byte) 44, param0)) {
                                                                    break L2;
                                                                  } else {
                                                                    ((sm) this).field_g = param0;
                                                                    var5 = param1 ? 1 : 0;
                                                                    var6 = var5;
                                                                    ta.a(0, -5, (byte) 96, var6 != 0);
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  if ((var5 ^ -1) != -21) {
                                                                    if (27 != var5) {
                                                                      if (var5 != 28) {
                                                                        if (var5 != 29) {
                                                                          if (32 != var5) {
                                                                            break L2;
                                                                          } else {
                                                                            L3: {
                                                                              if (oq.field_i[32] == ga.field_L) {
                                                                                hk.field_nb = js.field_i;
                                                                                oq.field_i[32] = rj.field_r;
                                                                                break L3;
                                                                              } else {
                                                                                oq.field_i[32] = ga.field_L;
                                                                                hk.field_nb = wp.field_a;
                                                                                break L3;
                                                                              }
                                                                            }
                                                                            jo.a(32767, hk.field_nb, true, 50);
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          if (hi.field_a != td.field_K) {
                                                                            oq.field_i[29] = tp.field_k;
                                                                            td.field_K = hi.field_a;
                                                                            break L1;
                                                                          } else {
                                                                            td.field_K = ec.field_s;
                                                                            oq.field_i[29] = og.field_a;
                                                                            break L1;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L4: {
                                                                          hj.field_k = hj.field_k + 1;
                                                                          if ((hj.field_k ^ -1) == -5) {
                                                                            hj.field_k = 0;
                                                                            break L4;
                                                                          } else {
                                                                            break L4;
                                                                          }
                                                                        }
                                                                        var5 = hj.field_k;
                                                                        if (0 != var5) {
                                                                          if (1 == var5) {
                                                                            oq.field_i[28] = la.field_n;
                                                                            break L1;
                                                                          } else {
                                                                            if (-3 != (var5 ^ -1)) {
                                                                              if ((var5 ^ -1) == -4) {
                                                                                oq.field_i[28] = cf.field_I;
                                                                                break L1;
                                                                              } else {
                                                                                break L1;
                                                                              }
                                                                            } else {
                                                                              oq.field_i[28] = ue.field_c;
                                                                              break L1;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          oq.field_i[28] = lm.field_a;
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var5 = param1 ? 1 : 0;
                                                                      ta.a(gr.field_o, -3, (byte) 96, var5 != 0);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    ((sm) this).field_g = param0;
                                                                    da.a(param3 ^ -32579, kq.f((byte) 127));
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                L5: {
                                                                  if (((sm) this).field_a == 8) {
                                                                    break L5;
                                                                  } else {
                                                                    if (5 == vr.field_c) {
                                                                      break L5;
                                                                    } else {
                                                                      if ((((sm) this).field_a ^ -1) == -12) {
                                                                        ts.a(kq.f((byte) 126), (byte) 51);
                                                                        break L1;
                                                                      } else {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                qk.a(se.field_a, ((sm) this).field_a, (byte) 123);
                                                                break L1;
                                                              }
                                                            } else {
                                                              ff.field_y = 1;
                                                              break L1;
                                                            }
                                                          }
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      break L1;
                                                    }
                                                  } else {
                                                    L6: {
                                                      ((sm) this).field_g = param0;
                                                      if (!v.field_b) {
                                                        break L6;
                                                      } else {
                                                        var5 = param1 ? 1 : 0;
                                                        ta.a(gr.field_o, -7, (byte) 96, var5 != 0);
                                                        break L6;
                                                      }
                                                    }
                                                    if (!kc.field_d) {
                                                      break L2;
                                                    } else {
                                                      os.a(0, 11, true);
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  ((sm) this).field_g = param0;
                                                  ce.field_x.b(-123);
                                                  var5 = param1 ? 1 : 0;
                                                  ta.a(0, -1, (byte) 96, var5 != 0);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              ((sm) this).field_g = param0;
                                              ce.field_x.c(false);
                                              var5 = param1 ? 1 : 0;
                                              ta.a(0, -1, (byte) 96, var5 != 0);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              ((sm) this).field_g = param0;
                              var5 = param1 ? 1 : 0;
                              ta.a(gr.field_o, 7, (byte) 96, var5 != 0);
                              break L1;
                            }
                          } else {
                            ((sm) this).field_g = param0;
                            var5 = param1 ? 1 : 0;
                            ta.a(gr.field_o, 6, (byte) 96, var5 != 0);
                            break L1;
                          }
                        } else {
                          ((sm) this).field_g = param0;
                          var5 = param1 ? 1 : 0;
                          ta.a(gr.field_o, 13, (byte) 96, var5 != 0);
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(byte param0) {
        if (-6 == (((sm) this).field_a ^ -1)) {
            nb.field_a = nb.field_a - 1;
            return nb.field_a - 1 <= 0 ? true : false;
        }
        if (param0 < 32) {
            field_c = null;
        }
        if (8 == ((sm) this).field_a) {
            le.field_b = le.field_b - 1;
            return le.field_b - 1 <= 0 ? true : false;
        }
        if (-11 == (((sm) this).field_a ^ -1)) {
            on.field_c = on.field_c - 1;
            return 0 >= on.field_c - 1 ? true : false;
        }
        return true;
    }

    private final int h(int param0) {
        if ((vr.field_c ^ -1) != (((sm) this).field_a ^ -1)) {
            if ((((sm) this).field_a ^ -1) != (gr.field_o ^ -1)) {
                return 0;
            }
        }
        if (param0 > -92) {
            this.e((byte) 113);
        }
        if ((gr.field_o ^ -1) != (vr.field_c ^ -1)) {
            if (nh.a((byte) -119, vr.field_c)) {
                if (nh.a((byte) -88, gr.field_o)) {
                    return re.a(qg.field_m[vr.field_c], 32, eh.field_Q, qg.field_m[gr.field_o], 0);
                }
            }
        }
        return qg.field_m[((sm) this).field_a];
    }

    private final String c(int param0, int param1) {
        String var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String var5 = null;
        L0: {
          L1: {
            var4 = ShatteredPlansClient.field_F ? 1 : 0;
            var5 = oq.field_i[param1];
            var3 = var5;
            var3 = var5;
            if (29 == param1) {
              break L1;
            } else {
              if (28 != param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = "   " + var5;
          break L0;
        }
        L2: {
          if ((param1 ^ -1) == -10) {
            L3: {
              if ((br.field_m ^ -1) == -1) {
                break L3;
              } else {
                if (gr.field_o == 0) {
                  break L3;
                } else {
                  if (br.field_m == 11) {
                    break L3;
                  } else {
                    if (-12 == (gr.field_o ^ -1)) {
                      break L3;
                    } else {
                      if ((br.field_m ^ -1) == -14) {
                        break L3;
                      } else {
                        if ((gr.field_o ^ -1) == -14) {
                          break L3;
                        } else {
                          L4: {
                            if (1 == br.field_m) {
                              break L4;
                            } else {
                              if (-2 != (gr.field_o ^ -1)) {
                                L5: {
                                  if (2 == br.field_m) {
                                    break L5;
                                  } else {
                                    if ((gr.field_o ^ -1) == -3) {
                                      break L5;
                                    } else {
                                      if (br.field_m == 3) {
                                        break L5;
                                      } else {
                                        if (gr.field_o == 3) {
                                          break L5;
                                        } else {
                                          if ((br.field_m ^ -1) == -5) {
                                            break L5;
                                          } else {
                                            if (4 != gr.field_o) {
                                              break L2;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var3 = ep.field_d;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var3 = ha.field_d;
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref = oq.field_i[8];
            break L2;
          } else {
            break L2;
          }
        }
        L6: {
          if ((param1 ^ -1) == -11) {
            if (null == ce.field_x) {
              break L6;
            } else {
              if (!ce.field_x.field_W) {
                break L6;
              } else {
                var3 = ua.field_g;
                break L6;
              }
            }
          } else {
            break L6;
          }
        }
        if (param0 == -22609) {
          if (var3 != null) {
            return var3.toUpperCase();
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final int c(int param0, boolean param1) {
        if (!param1) {
            return 40;
        }
        return this.h(-105) + (qg.field_t[((sm) this).field_a] + qg.field_l[((sm) this).field_a] * param0);
    }

    private final void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, byte param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          var11 = param9 - -param5;
          if ((param5 ^ -1) >= -1) {
            gf.f(var11, param1, -param5, param0);
            gf.f(var11, param7, -param5, param0);
            break L0;
          } else {
            gf.f(param9, param1, param5, param0);
            gf.f(param9, param7, param5, param0);
            break L0;
          }
        }
        L1: {
          if ((param7 ^ -1) >= (param1 ^ -1)) {
            L2: {
              L3: {
                gf.j(var11, param7, -param7 + (param1 + 1), param0);
                if (param3 < param7) {
                  break L3;
                } else {
                  if (param1 > param3) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L2;
            }
            var12 = stackIn_15_0;
            break L1;
          } else {
            L4: {
              L5: {
                if ((param3 ^ -1) > (param1 ^ -1)) {
                  break L5;
                } else {
                  if ((param7 ^ -1) < (param3 ^ -1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L4;
            }
            var12 = stackIn_9_0;
            gf.j(var11, param1, -param1 + (param7 + 1), param0);
            break L1;
          }
        }
        L6: {
          if (var11 >= param2) {
            L7: {
              if (var12 != 0) {
                L8: {
                  var13 = param1 - -param7 >> -72048639;
                  if (-1 <= (param5 ^ -1)) {
                    gf.f(var11, var13, -param5, param0);
                    var11 = var11 - param5;
                    break L8;
                  } else {
                    var11 = var11 - param5;
                    gf.f(var11, var13, param5, param0);
                    break L8;
                  }
                }
                var14 = param3 + -var13;
                if (0 >= var14) {
                  gf.j(var11, var13 - -var14, -var14, param0);
                  break L7;
                } else {
                  gf.j(var11, var13, var14, param0);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            gf.f(param2, param3, -param2 + var11, param0);
            break L6;
          } else {
            L9: {
              if (var12 != 0) {
                L10: {
                  var13 = param1 + param7 >> -1824139967;
                  if (-1 > (param5 ^ -1)) {
                    gf.f(var11, var13, param5, param0);
                    var11 = var11 + param5;
                    break L10;
                  } else {
                    var11 = var11 + param5;
                    gf.f(var11, var13, -param5, param0);
                    break L10;
                  }
                }
                var14 = -var13 + param3;
                if (var14 <= 0) {
                  gf.j(var11, var14 + var13, -var14, param0);
                  break L9;
                } else {
                  gf.j(var11, var13, var14, param0);
                  break L9;
                }
              } else {
                break L9;
              }
            }
            gf.f(var11, param3, param2 - var11, param0);
            break L6;
          }
        }
        if (param8 == 110) {
          var13 = wk.a(-9615, param4, (nq) (Object) rs.field_Cb, new int[1]);
          param1 = -(var13 * rs.field_Cb.field_J >> 1529844353) + param3;
          int discarded$1 = rs.field_Cb.a(param4, param2 - -5, param1, param6, var13 * rs.field_Cb.field_J - -rs.field_Cb.field_q, param0, -1, 0, 0, rs.field_Cb.field_J);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8) {
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        double var33 = 0.0;
        int var35 = 0;
        bi stackIn_23_0 = null;
        bi stackOut_22_0 = null;
        bi stackOut_21_0 = null;
        L0: {
          var35 = ShatteredPlansClient.field_F ? 1 : 0;
          var10 = Math.sqrt((double)((-param6 + param0) * (-param6 + param0) + (param2 - param5) * (param2 - param5)));
          var12 = (double)(-param5 + param2) / var10;
          var14 = (double)(-param6 + param0) / var10;
          var16 = param5 * 16 - -((-param5 + param2) * 16 * param1 / 200);
          var17 = param1 * (16 * (param0 - param6)) / 200 + 16 * param6;
          var18 = Math.sqrt((double)((var17 + -(param6 * 16)) * (-(param6 * 16) + var17) + (var16 - 16 * param5) * (-(16 * param5) + var16)));
          if (param4 == 92) {
            break L0;
          } else {
            ((sm) this).field_a = 76;
            break L0;
          }
        }
        L1: {
          var10 = Math.sqrt((double)(256 * ((-param6 + param0) * (-param6 + param0)) + (-param5 + param2) * ((-param5 + param2) * 256)));
          var20 = var10 / 2.0;
          var22 = 1.0 / var20;
          var24 = -(0.2 * ((-var20 + var18) * (var18 - var20) * var22)) + var10 / 10.0;
          var26 = (double)(16 * (param6 + -param0));
          var28 = (double)((param5 + -param2) * 16);
          var26 = var26 / var10;
          var28 = var28 / var10;
          var30 = (int)(var24 * var26) + var16;
          var31 = -(int)(var28 * var24) + var17;
          var32 = 0;
          if (0.0 == var12) {
            if (0.0 < var14) {
              var32 = 49152;
              break L1;
            } else {
              var32 = 16384;
              break L1;
            }
          } else {
            if (var14 == 0.0) {
              if (0.0 >= var12) {
                var32 = 32768;
                break L1;
              } else {
                var32 = 0;
                break L1;
              }
            } else {
              L2: {
                var33 = (double)(16 * (param0 - param6));
                if (0.0 > var33) {
                  var33 = -var33;
                  break L2;
                } else {
                  break L2;
                }
              }
              var32 = (int)(Math.asin(var33 / var10) * 32768.0 / 3.141592653589793);
              if (0.0 > var12) {
                if (0.0 > var14) {
                  var32 = 32768 + -var32;
                  break L1;
                } else {
                  var32 = var32 + 32768;
                  break L1;
                }
              } else {
                if (0.0 < var14) {
                  var32 = 65536 + -var32;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L3: {
          // wide iinc 32 -16384
          var32 = -3800 + (var32 + param1 * 7600 / 200);
          if (!param3) {
            stackOut_22_0 = fj.field_p;
            stackIn_23_0 = stackOut_22_0;
            break L3;
          } else {
            stackOut_21_0 = eq.field_o;
            stackIn_23_0 = stackOut_21_0;
            break L3;
          }
        }
        L4: {
          ie.a((om) (Object) stackIn_23_0, fj.field_p.field_z << -736070301, fj.field_p.field_w << 1269129955, var30, var31, var32, 4096);
          if (param8) {
            gf.c(var30 >> 1023912196, var31 >> -2115986716, 9, 0, 92);
            rs.field_Cb.c(Integer.toString(param7), var30 >> -1393634588, 4 + (var31 >> -1595182236), 16777215, -1);
            break L4;
          } else {
            break L4;
          }
        }
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -109) {
            ((sm) this).field_h = 86;
        }
        for (var4 = 0; (qg.field_p[((sm) this).field_a].length ^ -1) < (var4 ^ -1); var4++) {
            var5 = this.c(var4, true);
            if (this.a((byte) 44, var4)) {
                if ((param2 ^ -1) <= (this.b(var4, true) ^ -1)) {
                    if ((param2 ^ -1) > (this.a(true, var4) ^ -1)) {
                        if ((var5 ^ -1) >= (param0 ^ -1)) {
                            if (param0 < var5 + this.f(-20, var4)) {
                                return var4;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private final void e(int param0) {
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 170) {
          L0: {
            L1: {
              if ((oq.field_j ^ -1) != -105) {
                if (105 == oq.field_j) {
                  this.a(1, (byte) -57);
                  break L1;
                } else {
                  if (oq.field_j == 102) {
                    this.d(param0 + -166, 0);
                    break L1;
                  } else {
                    if ((oq.field_j ^ -1) == -104) {
                      this.d(4, ln.field_H.length + -1);
                      break L1;
                    } else {
                      ((sm) this).field_d.b(0);
                      break L0;
                    }
                  }
                }
              } else {
                this.a(-1, (byte) -57);
                break L1;
              }
            }
            ((sm) this).field_d.b(0);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    private final int c(int param0) {
        if (vr.field_c != ((sm) this).field_a) {
            if (!(((sm) this).field_a == gr.field_o)) {
                return 0;
            }
        }
        if (!(gr.field_o != vr.field_c)) {
            return qg.field_r[vr.field_c];
        }
        if (nh.a((byte) -103, vr.field_c)) {
            if (!(!nh.a((byte) -125, gr.field_o))) {
                return re.a(qg.field_r[vr.field_c], 32, eh.field_Q, qg.field_r[gr.field_o], 0);
            }
        }
        double var2 = wm.a(eh.field_Q, (byte) 109, param0);
        if (((sm) this).field_a == vr.field_c) {
            var2 = -var2 + 1.0;
        }
        return (int)((double)qg.field_r[((sm) this).field_a] * var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = "Status";
    }
}
