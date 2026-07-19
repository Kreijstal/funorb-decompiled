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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_n = -1;
        try {
          L0: {
            this.field_r = new int[this.field_c.field_k];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_c.field_k <= var3_int) {
                    break L3;
                  } else {
                    var4 = 0;
                    stackOut_3_0 = 0;
                    stackIn_20_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if ((this.field_c.field_v.length ^ -1) >= (var5 ^ -1)) {
                              break L6;
                            } else {
                              stackOut_6_0 = var5 ^ -1;
                              stackOut_6_1 = var3_int ^ -1;
                              stackIn_16_0 = stackOut_6_0;
                              stackIn_16_1 = stackOut_6_1;
                              stackIn_7_0 = stackOut_6_0;
                              stackIn_7_1 = stackOut_6_1;
                              if (var6 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  L8: {
                                    if (stackIn_7_0 != stackIn_7_1) {
                                      break L8;
                                    } else {
                                      if (var6 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (this.field_c.field_v[var5] <= this.field_c.field_v[var3_int]) {
                                    break L7;
                                  } else {
                                    if (this.field_c.f((byte) -96, var5)) {
                                      break L7;
                                    } else {
                                      var4++;
                                      break L7;
                                    }
                                  }
                                }
                                var5++;
                                if (var6 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L9: {
                            if (!this.field_c.f((byte) -117, var3_int)) {
                              break L9;
                            } else {
                              var4 = this.field_c.field_k + -1;
                              break L9;
                            }
                          }
                          stackOut_15_0 = 1;
                          stackOut_15_1 = this.field_c.field_z ^ -1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          break L5;
                        }
                        L10: {
                          if (stackIn_16_0 != stackIn_16_1) {
                            break L10;
                          } else {
                            var4 = 0;
                            break L10;
                          }
                        }
                        this.field_r[var3_int] = var4;
                        var3_int++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_19_0 = this.field_h.d((byte) 116);
                stackIn_20_0 = stackOut_19_0 ? 1 : 0;
                break L2;
              }
              L11: {
                L12: {
                  if (stackIn_20_0 != 0) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        if (0 != this.field_r[this.field_h.field_x]) {
                          break L14;
                        } else {
                          if (-1 >= (this.field_c.field_z ^ -1)) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      er.b(1, 3);
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                    er.b(1, 2);
                    if (var6 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                er.b(1, 0);
                break L11;
              }
              L15: {
                L16: {
                  L17: {
                    if (!this.field_h.field_D) {
                      break L17;
                    } else {
                      if (!this.field_h.d((byte) 82)) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    this.field_p = new fna[1];
                    if (this.field_h.field_D) {
                      stackOut_30_0 = 33;
                      stackIn_31_0 = stackOut_30_0;
                      break L18;
                    } else {
                      stackOut_29_0 = 16;
                      stackIn_31_0 = stackOut_29_0;
                      break L18;
                    }
                  }
                  L19: {
                    var3_int = stackIn_31_0;
                    this.field_p[0] = new fna(var3_int, wba.field_q[var3_int], 0, false);
                    this.field_p[0].field_b = -100 + aaa.a(false);
                    this.field_p[0].field_i = koa.b(0) - 25;
                    this.field_p[0].a(false);
                    if (this.field_h.field_D) {
                      break L19;
                    } else {
                      if (vpa.a(43)) {
                        break L19;
                      } else {
                        this.field_p[0].field_e = aua.field_d.toUpperCase();
                        pt.field_p = uta.a(3, this.field_h.m(-1), 0, 10, 1);
                        break L19;
                      }
                    }
                  }
                  if (var6 == 0) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
                this.field_p = new fna[2];
                this.field_p[0] = new fna(33, wba.field_q[33], 1, false);
                this.field_p[0].field_b = aaa.a(false) + -110;
                this.field_p[0].field_i = koa.b(0) - 25;
                this.field_p[0].a(false);
                this.field_p[1] = new fna(34, wba.field_q[34], 1, false);
                this.field_p[1].field_b = 100;
                this.field_p[1].field_i = koa.b(0) + -25;
                this.field_p[1].a(false);
                break L15;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("qka.<init>(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L20;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L20;
            }
          }
          L21: {
            stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L21;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return false;
        }
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        L0: {
          L1: {
            if (param2 == 13) {
              break L1;
            } else {
              if ((param2 ^ -1) == -35) {
                break L1;
              } else {
                if (param2 != 83) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.a(127, 0);
          break L0;
        }
        if (param1 == 25) {
          return true;
        } else {
          return false;
        }
    }

    final void b(int param0, boolean param1) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
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
        String var22 = null;
        String var23 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_61_0 = 0;
        fna stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        fna stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        fna stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        fna stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        fna stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        int stackIn_72_4 = 0;
        fna stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        fna stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_31_0 = false;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        fna stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        fna stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        fna stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        fna stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_60_0 = 0;
        fna stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        fna stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        fna stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  var21 = TombRacer.field_G ? 1 : 0;
                  ura.a(-10985);
                  la.field_j.a(0, 0);
                  if (this.field_h.field_D) {
                    break L4;
                  } else {
                    L5: {
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
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        break L5;
                      } else {
                        stackOut_2_0 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        var11 = stackIn_4_0;
                        if (var11 != 0) {
                          break L7;
                        } else {
                          var10_ref_String = vj.field_d[var9].toUpperCase();
                          if (var21 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var10_ref_String = id.field_k.toUpperCase();
                      break L6;
                    }
                    L8: {
                      L9: {
                        discarded$5 = be.a(var10_ref_String, 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var6, 1, -(var6 >> -2112849183) + var8, var7 - (var5 >> 1833720769), -1, (byte) 60, var5);
                        oka.a(this.field_h.a(this.field_h.field_x, false).toUpperCase(), wga.field_a[this.field_h.field_x], eda.field_f, -1, -15 + var4, var3, -1);
                        if ((this.field_c.field_z ^ -1) > -1) {
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
                                var12_ref = za.field_g;
                                var13_ref_String = uaa.field_d;
                                break L10;
                              }
                            }
                            L11: {
                              if (-3 == (ea.field_j ^ -1)) {
                                var13_ref_String = qna.field_c;
                                var12_ref = bca.field_d;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (-2 == (ea.field_j ^ -1)) {
                                var13_ref_String = ps.field_P;
                                var12_ref = rm.field_c;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            L13: {
                              if (var12_ref != null) {
                                ((nh) (var12_ref)).a(var3 - (120 - -(((nh) (var12_ref)).d() / 2)), var4 - 10);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            oka.a(var13_ref_String, 65793, kn.field_p, -1, 35 + var4, var3 + -120, -1);
                            if (var21 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      oka.a(wpa.field_K.toUpperCase(), 2431750, eda.field_f, -1, var4 - 40, var3, -1);
                      oka.a(sg.field_n.toUpperCase(), 2431750, kn.field_p, -1, 45 + var4, var3, -1);
                      break L8;
                    }
                    L14: {
                      L15: {
                        if (var11 != 0) {
                          break L15;
                        } else {
                          L16: {
                            var22 = dea.a(this.field_c.c((byte) 115, this.field_h.field_x), (byte) -8);
                            oka.a(cc.field_l.toUpperCase() + " " + var22.toUpperCase(), 2431750, kn.field_p, -1, 48 + var4, var3 + -120, -1);
                            za.field_g.a(-200 + var3, var4 + 60);
                            var13 = as.a(var9, 0);
                            ts.a(-1, -36, var4 - -79, dea.a(var13, (byte) -8), -200 + (var3 + za.field_g.d()) - -5, kn.field_p, 2431750);
                            bca.field_d.a(var3 - 110, 60 + var4);
                            ts.a(-1, -92, 79 + var4, dea.a(var13 + var13 / 2, (byte) -8), bca.field_d.d() + (var3 - 110) + 5, kn.field_p, 2431750);
                            oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, 5 + var4, 120 + var3, -1);
                            var14 = this.field_h.field_k.field_G[this.field_h.field_x].field_g.v(110);
                            oka.a(Integer.toString(var14), 2431750, eda.field_f, -1, var4 + 22, var3 + 120, -1);
                            if (pt.field_p == null) {
                              break L16;
                            } else {
                              if (pt.field_p.field_p == null) {
                                break L16;
                              } else {
                                if (!pt.field_p.field_h) {
                                  break L16;
                                } else {
                                  L17: {
                                    var15 = pt.field_p.field_p[1][0];
                                    var16 = -var15 + var14;
                                    if ((var15 ^ -1) == -1) {
                                      break L17;
                                    } else {
                                      oka.a(gl.a((byte) 103, lea.field_F, new String[]{Integer.toString(var15).toUpperCase() + " " + qu.a(var16, -1)}), 2431750, kn.field_p, -1, 50 + var4, 120 + var3, -1);
                                      break L17;
                                    }
                                  }
                                  var17 = 0;
                                  var18 = null;
                                  var19 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if ((pt.field_p.field_k[2].length ^ -1) >= (var19 ^ -1)) {
                                        break L19;
                                      } else {
                                        var20 = pt.field_p.field_k[2][var19];
                                        stackOut_31_0 = ue.a(var20, 0);
                                        stackIn_61_0 = stackOut_31_0 ? 1 : 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        if (var21 != 0) {
                                          break L2;
                                        } else {
                                          if (stackIn_32_0) {
                                            var19++;
                                            continue L18;
                                          } else {
                                            var17 = pt.field_p.field_p[2][var19];
                                            var18 = var20;
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                    if (var18 == null) {
                                      break L16;
                                    } else {
                                      var16 = var14 - var17;
                                      discarded$6 = be.a(gl.a((byte) 121, qw.field_g, new String[]{Integer.toString(var17).toUpperCase() + " " + qu.a(var16, -1), (String) (var18)}), 0, kn.field_p, 2431750, 13, 50, 1, var4 + 60, var3, -1, (byte) 60, 240);
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var21 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var23 = dea.a(this.field_c.c((byte) 115, this.field_h.field_x), (byte) -8);
                      oka.a(cc.field_l.toUpperCase() + " " + var23.toUpperCase(), 2431750, kn.field_p, -1, 20 + var4, -120 + var3, -1);
                      oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, var4, 120 + var3, -1);
                      var13 = this.field_h.field_k.field_G[this.field_h.field_x].field_g.v(74);
                      oka.a(Integer.toString(var13), 2431750, eda.field_f, -1, 20 + var4, 120 + var3, -1);
                      break L14;
                    }
                    if (var21 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var3 = aaa.a(false) >> 719911137;
                var4 = (aaa.a(false) >> -795711711) / 3 + 37;
                var5 = 56;
                var6 = this.field_c.field_k;
                var7 = 0;
                L20: while (true) {
                  if (var7 >= var6) {
                    break L3;
                  } else {
                    var8 = this.field_r[var7];
                    var9 = -var8 + var6;
                    var10 = -(var5 * var9) + koa.b(0);
                    var11 = var4 * var7 + (var3 - (var4 >> -1106508735) * (-1 + var6));
                    this.field_c.field_H[var7].n((byte) -120).a(-1, var11, 800, 0, var10);
                    vna.field_c.a(var11 + -(vna.field_c.a() >> 1477401377) + 1, var10 + -8);
                    stackOut_42_0 = var8 ^ -1;
                    stackOut_42_1 = -1;
                    stackIn_79_0 = stackOut_42_0;
                    stackIn_79_1 = stackOut_42_1;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    if (var21 != 0) {
                      L21: while (true) {
                        if (stackIn_79_0 <= stackIn_79_1) {
                          break L1;
                        } else {
                          if (var21 != 0) {
                            break L0;
                          } else {
                            L22: {
                              stackOut_75_0 = this.field_p[var3];
                              stackOut_75_1 = 0;
                              stackOut_75_2 = 1;
                              stackOut_75_3 = 1;
                              stackIn_74_0 = stackOut_75_0;
                              stackIn_74_1 = stackOut_75_1;
                              stackIn_74_2 = stackOut_75_2;
                              stackIn_74_3 = stackOut_75_3;
                              stackIn_76_0 = stackOut_75_0;
                              stackIn_76_1 = stackOut_75_1;
                              stackIn_76_2 = stackOut_75_2;
                              stackIn_76_3 = stackOut_75_3;
                              if (this.field_n != var3) {
                                stackOut_74_0 = (fna) ((Object) stackIn_74_0);
                                stackOut_74_1 = stackIn_74_1;
                                stackOut_74_2 = stackIn_74_2;
                                stackOut_74_3 = stackIn_74_3;
                                stackOut_74_4 = 0;
                                stackIn_72_0 = stackOut_74_0;
                                stackIn_72_1 = stackOut_74_1;
                                stackIn_72_2 = stackOut_74_2;
                                stackIn_72_3 = stackOut_74_3;
                                stackIn_72_4 = stackOut_74_4;
                                break L22;
                              } else {
                                stackOut_76_0 = (fna) ((Object) stackIn_76_0);
                                stackOut_76_1 = stackIn_76_1;
                                stackOut_76_2 = stackIn_76_2;
                                stackOut_76_3 = stackIn_76_3;
                                stackIn_71_0 = stackOut_76_0;
                                stackIn_71_1 = stackOut_76_1;
                                stackIn_71_2 = stackOut_76_2;
                                stackIn_71_3 = stackOut_76_3;
                                stackOut_71_0 = (fna) ((Object) stackIn_71_0);
                                stackOut_71_1 = stackIn_71_1;
                                stackOut_71_2 = stackIn_71_2;
                                stackOut_71_3 = stackIn_71_3;
                                stackOut_71_4 = 1;
                                stackIn_72_0 = stackOut_71_0;
                                stackIn_72_1 = stackOut_71_1;
                                stackIn_72_2 = stackOut_71_2;
                                stackIn_72_3 = stackOut_71_3;
                                stackIn_72_4 = stackOut_71_4;
                                break L22;
                              }
                            }
                            ((fna) (Object) stackIn_72_0).a(stackIn_72_1 != 0, stackIn_72_2 != 0, stackIn_72_3, stackIn_72_4 != 0);
                            var3++;
                            if (var21 == 0) {
                              stackOut_81_0 = var3 ^ -1;
                              stackOut_81_1 = this.field_p.length ^ -1;
                              stackIn_79_0 = stackOut_81_0;
                              stackIn_79_1 = stackOut_81_1;
                              continue L21;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      L23: {
                        if (stackIn_43_0 == stackIn_43_1) {
                          sta.field_y[-1 + sta.field_y.length].a(-(sta.field_y[sta.field_y.length - 1].a() >> 2061309825) + var11 + -1, var10 + -12);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      var12 = 150;
                      cha.a(-60 + var11, 2, tga.field_a, 4, var10 + -250, 120, 65793 | var12 << -489188680, 1, 100);
                      oka.a(this.field_h.a(var7, false).toUpperCase(), wga.field_a[var7], kn.field_p, -1, var10 + -230, var11, 0);
                      try {
                        L24: {
                          tga.field_a.a(var11, var10 - 140, 10 + var11, -151 + var10, var11, var10 - 151, 65793 | var12 << -1346753000, var12 << 1191458392 | 65793, var12 << 1898139576 | 65793, 1);
                          break L24;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L25: {
                          var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
                          break L25;
                        }
                      }
                      L26: {
                        L27: {
                          if (!this.field_c.f((byte) -102, var7)) {
                            break L27;
                          } else {
                            oka.a(id.field_i.toUpperCase(), 11141120, kn.field_p, -1, var10 + -190, var11, 0);
                            if (var21 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L28: {
                          L29: {
                            var13 = 7829367;
                            if (-2 != this.field_c.field_z) {
                              break L29;
                            } else {
                              discarded$7 = be.a(paa.field_y.toUpperCase(), 1, kn.field_p, var13, 16, 70, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                              if (var21 == 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                          discarded$8 = be.a(gl.a((byte) 93, ga.field_K.toUpperCase(), new String[]{Integer.toString(this.field_c.field_v[var7])}).toUpperCase(), 1, kn.field_p, var13, 16, 60, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                          break L28;
                        }
                        if (!this.field_c.g(69, var7)) {
                          break L26;
                        } else {
                          discarded$9 = be.a(w.field_d.toUpperCase(), 1, kn.field_p, 3385907, 16, 40, 1, var10 - 203, -50 + var11, 0, (byte) 60, 100);
                          break L26;
                        }
                      }
                      var7++;
                      if (var21 == 0) {
                        continue L20;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              se.f((byte) -6);
              stackOut_60_0 = 0;
              stackIn_61_0 = stackOut_60_0;
              break L2;
            }
            var3 = stackIn_61_0;
            L30: while (true) {
              if ((var3 ^ -1) <= (this.field_p.length ^ -1)) {
                break L1;
              } else {
                if (var21 != 0) {
                  break L0;
                } else {
                  L31: {
                    stackOut_64_0 = this.field_p[var3];
                    stackOut_64_1 = 0;
                    stackOut_64_2 = 1;
                    stackOut_64_3 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    stackIn_66_2 = stackOut_64_2;
                    stackIn_66_3 = stackOut_64_3;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    stackIn_65_2 = stackOut_64_2;
                    stackIn_65_3 = stackOut_64_3;
                    if (this.field_n != var3) {
                      stackOut_66_0 = (fna) ((Object) stackIn_66_0);
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = stackIn_66_2;
                      stackOut_66_3 = stackIn_66_3;
                      stackOut_66_4 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      stackIn_67_2 = stackOut_66_2;
                      stackIn_67_3 = stackOut_66_3;
                      stackIn_67_4 = stackOut_66_4;
                      break L31;
                    } else {
                      stackOut_65_0 = (fna) ((Object) stackIn_65_0);
                      stackOut_65_1 = stackIn_65_1;
                      stackOut_65_2 = stackIn_65_2;
                      stackOut_65_3 = stackIn_65_3;
                      stackOut_65_4 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_67_2 = stackOut_65_2;
                      stackIn_67_3 = stackOut_65_3;
                      stackIn_67_4 = stackOut_65_4;
                      break L31;
                    }
                  }
                  ((fna) (Object) stackIn_67_0).a(stackIn_67_1 != 0, stackIn_67_2 != 0, stackIn_67_3, stackIn_67_4 != 0);
                  var3++;
                  if (var21 == 0) {
                    continue L30;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (param0 < -50) {
            break L0;
          } else {
            field_m = (long[]) null;
            break L0;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
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
            L2: {
              if ((param1 ^ -1) == -1) {
                break L2;
              } else {
                if (-2 == (param1 ^ -1)) {
                  ql.field_k.k(67, -2988);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              this.field_h.b(false, true, 0);
              if (this.field_h.field_D) {
                break L3;
              } else {
                ea.field_j = -1;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            r.a(0, this.field_h.d((byte) 120));
            break L1;
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
        boolean stackIn_3_0 = false;
        hf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        hf stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_22_0 = 0;
        fna stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        fna stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        fna stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        boolean stackIn_34_0 = false;
        boolean stackOut_2_0 = false;
        hf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hf stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        hf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        fna stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        fna stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        fna stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        boolean stackOut_33_0 = false;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= this.field_c.field_H.length) {
                break L2;
              } else {
                var4_ref_hf = (hf) ((Object) this.field_c.field_H[var3].n((byte) -67));
                stackOut_2_0 = this.field_q;
                stackIn_10_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      break L3;
                    } else {
                      L4: {
                        stackOut_4_0 = (hf) (var4_ref_hf);
                        stackOut_4_1 = 26;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (var3 != this.field_c.field_z) {
                          stackOut_6_0 = (hf) ((Object) stackIn_6_0);
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          break L4;
                        } else {
                          stackOut_5_0 = (hf) ((Object) stackIn_5_0);
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = 23;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          break L4;
                        }
                      }
                      ((hf) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, false);
                      break L3;
                    }
                  }
                  var4_ref_hf.a(21463);
                  var4_ref_hf.f(-4366);
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_n = -1;
            this.field_q = true;
            stackOut_9_0 = param0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == 80) {
              break L5;
            } else {
              this.b(12, true);
              break L5;
            }
          }
          var3 = 0;
          L6: while (true) {
            L7: {
              L8: {
                if (this.field_p.length <= var3) {
                  break L8;
                } else {
                  stackOut_14_0 = param1;
                  stackIn_34_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var5 != 0) {
                    break L7;
                  } else {
                    L9: {
                      L10: {
                        if (!stackIn_15_0) {
                          break L10;
                        } else {
                          if (this.field_p[var3].field_b - 80 > jba.field_j) {
                            break L10;
                          } else {
                            if ((jba.field_j ^ -1) <= (80 + this.field_p[var3].field_b ^ -1)) {
                              break L10;
                            } else {
                              if ((-25 + this.field_p[var3].field_i ^ -1) < (sta.field_B ^ -1)) {
                                break L10;
                              } else {
                                if ((this.field_p[var3].field_i - -25 ^ -1) >= (sta.field_B ^ -1)) {
                                  break L10;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      break L9;
                    }
                    L11: {
                      var4 = stackIn_22_0;
                      if (var4 != 0) {
                        this.field_n = var3;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      stackOut_25_0 = this.field_p[var3];
                      stackOut_25_1 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      if ((this.field_n ^ -1) != (var3 ^ -1)) {
                        stackOut_27_0 = (fna) ((Object) stackIn_27_0);
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        break L12;
                      } else {
                        stackOut_26_0 = (fna) ((Object) stackIn_26_0);
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        stackIn_28_2 = stackOut_26_2;
                        break L12;
                      }
                    }
                    L13: {
                      ((fna) (Object) stackIn_28_0).a(stackIn_28_1 != 0, stackIn_28_2 != 0, true, 6);
                      if (!param1) {
                        break L13;
                      } else {
                        if (var4 == 0) {
                          break L13;
                        } else {
                          if (0 == hf.field_b) {
                            break L13;
                          } else {
                            this.a(120, var3);
                            break L13;
                          }
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              stackOut_33_0 = this.field_h.field_D;
              stackIn_34_0 = stackOut_33_0;
              break L7;
            }
            L14: {
              if (!stackIn_34_0) {
                break L14;
              } else {
                if (!this.field_h.d((byte) 69)) {
                  L15: {
                    var3 = this.field_h.field_k.field_t;
                    if (-2 == (var3 >> this.field_h.field_x & 1 ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (-1 != (var3 ^ -1)) {
                          break L16;
                        } else {
                          L17: {
                            if (this.field_h.field_k.a(this.field_h.field_x, true)) {
                              break L17;
                            } else {
                              this.field_p[1].field_e = kna.field_E.toUpperCase();
                              if (var5 == 0) {
                                break L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                          this.field_p[1].field_e = sl.field_g.toUpperCase();
                          if (var5 == 0) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      this.field_p[1].field_e = ot.field_t.toUpperCase();
                      if (var5 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  this.field_p[1].field_e = df.field_I.toUpperCase();
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            return;
          }
        }
    }

    static {
        field_s = "Solo Adventure";
    }
}
