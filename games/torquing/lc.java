/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends ro {
    static int field_z;
    static String field_B;

    public static void a(boolean param0) {
        if (param0) {
            field_z = 16;
        }
        field_B = null;
    }

    public lc() {
    }

    final static bp a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        var2 = param1.length();
        if (0 == var2) {
          return oj.field_l;
        } else {
          if ((var2 ^ -1) < -64) {
            return wn.field_s;
          } else {
            L0: {
              if (!param0) {
                break L0;
              } else {
                lc.a(-40, -69, -28, 124, -109, 120, -40);
                break L0;
              }
            }
            var3 = 0;
            L1: while (true) {
              if (var3 < var2) {
                L2: {
                  var4 = param1.charAt(var3);
                  if (var4 != 45) {
                    if (0 != (kl.field_t.indexOf(var4) ^ -1)) {
                      break L2;
                    } else {
                      return va.field_H;
                    }
                  } else {
                    L3: {
                      if ((var3 ^ -1) == -1) {
                        break L3;
                      } else {
                        if (var2 - 1 != var3) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return va.field_H;
                  }
                }
                var3++;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static long h(byte param0) {
        if (param0 != -76) {
            return -86L;
        }
        return km.b(-1) - rb.field_C;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        L0: {
          L1: {
            if (-param5 + param1 < kn.field_e) {
              break L1;
            } else {
              if (qg.field_z < param1 - -param5) {
                break L1;
              } else {
                if (j.field_q > param3 - param5) {
                  break L1;
                } else {
                  if (param3 + param5 > qk.field_p) {
                    break L1;
                  } else {
                    mh.a(param0, param1, param5, param6, param3, 15783, param4);
                    if (Torquing.field_u == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          ue.a(-15788, param1, param3, param6, param5, param0, param4);
          break L0;
        }
        var7 = 124 / ((param2 - -16) / 61);
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        L0: {
          L1: {
            var10 = Torquing.field_u;
            var11 = ((lc) this).field_r.a(15142, param1);
            var3 = var11;
            if (!((lc) this).field_r.field_b) {
              break L1;
            } else {
              if (((lc) this).c(-31292)) {
                var4 = var11[0];
                var5 = var11[1];
                var6 = var11[2];
                var7 = ((lc) this).field_u * (param1 % ((lc) this).field_u);
                var8 = 0;
                L2: while (true) {
                  if (var8 >= ci.field_c) {
                    break L1;
                  } else {
                    var9 = ((lc) this).field_s[var8 % ((lc) this).field_x + var7];
                    var6[var8] = ie.a(4080, var9 << 1059507172);
                    var5[var8] = ie.a(var9 >> -188440796, 4080);
                    var4[var8] = ie.a(4080, var9 >> 774516140);
                    var8++;
                    if (var10 != 0) {
                      break L0;
                    } else {
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
          }
          if (param0 == -29116) {
            break L0;
          } else {
            field_z = 43;
            break L0;
          }
        }
        return var11;
    }

    final static void g(int param0) {
        t var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        ph.c(243, 197, 369, 143, 16777215);
        ph.d(244, 198, 367, 141, 0);
        if (null == nc.field_d) {
          L0: {
            if (null != kl.field_o) {
              int discarded$3 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            L2: {
              var1 = nc.field_d[da.field_a];
              if (var1 == null) {
                break L2;
              } else {
                var1.d(245, 199);
                if (var4 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (kl.field_o != null) {
              int discarded$4 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          L3: {
            if (param0 >= 68) {
              break L3;
            } else {
              lc.g(6);
              break L3;
            }
          }
          L4: {
            if ((op.field_j ^ -1) < (mf.field_t ^ -1)) {
              var1 = nc.field_d[gf.field_h];
              if (var1 != null) {
                L5: {
                  var2_int = (60 + var1.field_w) * mf.field_t / op.field_j;
                  var3 = var2_int - 30;
                  if (!pp.field_c) {
                    break L5;
                  } else {
                    ql.a(-256 * var3 / 30, 245, var1, 199, (-var3 + var1.field_w) * 256 / 30, (byte) -122);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                ql.a(256 * (var1.field_w + -var3) / 30, 245, var1, 199, -256 * var3 / 30, (byte) -81);
                break L4;
              } else {
                break L4;
              }
            } else {
              break L4;
            }
          }
          L6: {
            if (null == kl.field_o) {
              break L6;
            } else {
              var2 = null;
              var3 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var3 >= nc.field_d.length) {
                      break L9;
                    } else {
                      var1 = nc.field_d[var3];
                      if (var4 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (var1 == null) {
                            break L10;
                          } else {
                            L11: {
                              if ((var1.field_w ^ -1) != -366) {
                                break L11;
                              } else {
                                if (-140 == (var1.field_u ^ -1)) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (var2 != null) {
                                break L12;
                              } else {
                                var2 = (Object) (Object) Integer.toString(var3);
                                if (var4 == 0) {
                                  break L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var2 = (Object) (Object) (var2 + ", " + var3);
                            break L10;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  if (var2 != null) {
                    break L8;
                  } else {
                    break L6;
                  }
                }
                int discarded$5 = kl.field_o.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                break L6;
              }
            }
          }
          return;
        }
    }

    final static void b(int param0, int param1) {
        df var2 = wa.field_d;
        var2.f(87, param1);
        var2.b(90, 1);
        var2.b(90, param0);
    }

    final static void d(int param0) {
        uf[] var1 = null;
        int[] var2 = null;
        short[] var3 = null;
        t var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        kh var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        sg var11 = null;
        int var12 = 0;
        rm var13_ref_rm = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        t var15 = null;
        int var16 = 0;
        t var16_ref_t = null;
        int var17 = 0;
        kh var17_ref_kh = null;
        int var18_int = 0;
        sg var18 = null;
        int var19_int = 0;
        int[] var19 = null;
        int[] var20 = null;
        t var20_ref = null;
        int[] var21_ref_int__ = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        long var24 = 0L;
        int var26 = 0;
        int var27 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        L0: {
          var27 = Torquing.field_u;
          var1 = new uf[]{new uf((uc) (Object) qh.field_c, 0, 517, 298, (sm) null, 0, 0)};
          var2 = new int[]{0, 1, 2, 4, 6, 5, 9, 18, 7, 8};
          var3 = new short[]{(short)0, (short)2, (short)4, (short)3, (short)1, (short) 5};
          var4 = new t(8, 1);
          var5 = ph.field_e;
          var6 = ph.field_j;
          var7 = ph.field_d;
          var1 = rh.a((byte) -101, var1, var4, vd.field_a);
          ln.a(1, 0, var1, (byte) -58);
          if (param0 == -1339942685) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        var1 = rh.a((byte) 114, var1, kl.field_p, "");
        var1[0].a((byte) -15, 2);
        var1 = rh.a((byte) 116, var1, var4, hl.field_c);
        var1[0].a((byte) 101, 1);
        var1 = rh.a((byte) 125, var1, var4, q.field_i);
        ln.a(1, 0, var1, (byte) -58);
        var1[-1 + var1.length].c(0);
        var1[var1.length + -1].d(102);
        var1 = rh.a((byte) -122, var1, var4, eq.field_c);
        ln.a(0, dd.field_c.field_x, var1, (byte) -58);
        hh.field_e = new t[m.field_n.length];
        be.field_g = 30;
        var8 = var2;
        var9 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var8.length <= var9) {
                break L3;
              } else {
                var10 = var8[var9];
                if (var27 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (m.field_n[var10] != null) {
                      var11_int = be.field_l[200];
                      var12 = be.field_o[200];
                      var13_ref_rm = vc.field_c[var10].field_l;
                      var14 = 99999;
                      var15_int = -99999;
                      var16 = 0;
                      L5: while (true) {
                        L6: {
                          if (var16 >= var13_ref_rm.field_f) {
                            break L6;
                          } else {
                            L7: {
                              var17 = var13_ref_rm.field_B[var16];
                              var18_int = var13_ref_rm.field_E[var16];
                              var19_int = var12 * var17 - var18_int * var11_int >> -1164166256;
                              var18_int = var11_int * var17 - -(var18_int * var12) >> -740545232;
                              var17 = (var19_int << -875284055) / (1024 + var18_int);
                              if (var17 >= var14) {
                                break L7;
                              } else {
                                var14 = var17;
                                break L7;
                              }
                            }
                            L8: {
                              if (var17 <= var15_int) {
                                break L8;
                              } else {
                                var15_int = var17;
                                break L8;
                              }
                            }
                            var16++;
                            if (var27 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L9: {
                          L10: {
                            var16_ref_t = new t(60, -var14 + (1 + var15_int));
                            hh.field_e[var10] = var16_ref_t;
                            var16_ref_t.e();
                            be.a();
                            var17_ref_kh = vc.field_c[var10];
                            var18 = new sg(1);
                            var18.a(0, var17_ref_kh);
                            var19 = new int[]{0, 0, 0, 65535, 0, 0, 0, var12, var11_int, 0, -var11_int, var12};
                            if ((var10 ^ -1) == -2) {
                              var20 = new int[]{0, 0, 0, 0, 0, 65536, 0, 65536, 0, 65536, 0, 0};
                              var21_ref_int__ = new int[12];
                              var22 = 0;
                              L11: while (true) {
                                L12: {
                                  if (3 <= var22) {
                                    break L12;
                                  } else {
                                    stackOut_18_0 = 0;
                                    stackIn_29_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (var27 != 0) {
                                      break L9;
                                    } else {
                                      var23 = stackIn_19_0;
                                      L13: while (true) {
                                        L14: {
                                          if (3 <= var23) {
                                            break L14;
                                          } else {
                                            var24 = 0L;
                                            var26 = 0;
                                            L15: while (true) {
                                              L16: {
                                                if (3 <= var26) {
                                                  break L16;
                                                } else {
                                                  var24 = var24 + (long)var19[3 + (var23 + var26 * 3)] * (long)var20[var22 * 3 + var26 - -3];
                                                  var26++;
                                                  if (var27 == 0) {
                                                    continue L15;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              var21_ref_int__[3 + (var22 * 3 + var23)] = (int)(var24 >>> 1388403856);
                                              var23++;
                                              if (var27 == 0) {
                                                continue L13;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                        var22++;
                                        if (var27 == 0) {
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                var19 = var21_ref_int__;
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          var18.a(var17_ref_kh, var19);
                          sg.a(var17_ref_kh, 80, 1365, -1, -12, 12);
                          be.field_b = -var14;
                          var18.a(new int[12]);
                          stackOut_28_0 = var10;
                          stackIn_29_0 = stackOut_28_0;
                          break L9;
                        }
                        L17: {
                          if (stackIn_29_0 == 0) {
                            var20_ref = new t(60, var15_int - (var14 - -31));
                            var21 = (-31 + (var15_int + -var14)) / 2;
                            t.a(var16_ref_t, var20_ref, 0, 0, 0, 0, 60, var21);
                            var22 = -var21 + var20_ref.field_t;
                            t.a(var16_ref_t, var20_ref, 0, var16_ref_t.field_t - var22, 0, var21, 60, var22);
                            var16_ref_t = new t(var20_ref.field_s, var20_ref.field_t / 2);
                            var16_ref_t.e();
                            var20_ref.c(var20_ref.field_s << 1980166307, var20_ref.field_t << -1339942685, var16_ref_t.field_s << 471761315, var16_ref_t.field_t << -1328843485, 0, 2048);
                            hh.field_e[var10] = var16_ref_t;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var1 = rh.a((byte) 111, var1, var16_ref_t, m.field_n[var10]);
                        ln.a(0, dd.field_c.field_x, var1, (byte) -58);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var9++;
                  if (var27 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var1[-1 + var1.length].d(param0 ^ -1339942758);
            var1 = rh.a((byte) -110, var1, var4, vp.field_G);
            ln.a(0, dd.field_c.field_x, var1, (byte) -58);
            break L2;
          }
          var8_ref = new kh(new rm(8, 2, 2));
          var8_ref.field_q = new mp(2);
          int discarded$8 = var8_ref.field_l.a(-60, -60, 0);
          int discarded$9 = var8_ref.field_l.a(60, -60, 0);
          int discarded$10 = var8_ref.field_l.a(-60, 60, 0);
          int discarded$11 = var8_ref.field_l.a(60, 60, 0);
          oj.a(3, (short) 0, 0, false, true, 1, 0, (short) -1, 2, var8_ref);
          oj.a(1, (short) 0, 3, false, true, 2, 3, (short) -1, 1, var8_ref);
          var9 = be.field_l[1664];
          var10 = be.field_o[1664];
          be.field_g = 40;
          var11 = new sg(1);
          var11.a(0, var8_ref);
          var11.a(var8_ref, new int[12]);
          var12 = 99999;
          var13 = -99999;
          var14 = 0;
          L18: while (true) {
            L19: {
              L20: {
                L21: {
                  L22: {
                    if (var8_ref.field_l.field_f <= var14) {
                      break L22;
                    } else {
                      var15_int = var8_ref.field_l.field_B[var14];
                      var16 = var8_ref.field_l.field_E[var14];
                      var17 = var10 * var15_int + -(var16 * var9) >> -1836488944;
                      var16 = var16 * var10 + var9 * var15_int >> -848667088;
                      var15_int = (var17 << -1478939895) / (var16 + 1024);
                      stackOut_37_0 = var12 ^ -1;
                      stackOut_37_1 = var15_int ^ -1;
                      stackIn_54_0 = stackOut_37_0;
                      stackIn_54_1 = stackOut_37_1;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      if (var27 != 0) {
                        L23: while (true) {
                          if (stackIn_54_0 <= stackIn_54_1) {
                            break L20;
                          } else {
                            var15 = new t(80, var13 + 1 - var12);
                            var15.e();
                            be.a();
                            var8_ref.field_l.field_A[0] = var3[var14];
                            var8_ref.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14]);
                            var8_ref.field_q.field_v = null;
                            var8_ref.field_k = null;
                            var11.a(0, 80, 1365, 0, -1, 0);
                            be.field_b = -var12;
                            var11.a(new int[12]);
                            var1 = rh.a((byte) 120, var1, var15, ga.field_d[var3[var14]]);
                            ln.a(0, dd.field_c.field_x, var1, (byte) -58);
                            var14++;
                            if (var27 != 0) {
                              break L19;
                            } else {
                              if (var27 == 0) {
                                stackOut_56_0 = ga.field_d.length;
                                stackOut_56_1 = var14;
                                stackIn_54_0 = stackOut_56_0;
                                stackIn_54_1 = stackOut_56_1;
                                continue L23;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                      } else {
                        L24: {
                          if (stackIn_38_0 >= stackIn_38_1) {
                            break L24;
                          } else {
                            var12 = var15_int;
                            break L24;
                          }
                        }
                        L25: {
                          if (var15_int <= var13) {
                            break L25;
                          } else {
                            var13 = var15_int;
                            break L25;
                          }
                        }
                        var14++;
                        if (var27 == 0) {
                          continue L18;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  var14 = 0;
                  L26: while (true) {
                    if (ga.field_d.length <= var14) {
                      break L20;
                    } else {
                      var15 = new t(80, var13 + 1 - var12);
                      var15.e();
                      be.a();
                      var8_ref.field_l.field_A[0] = var3[var14];
                      var8_ref.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14]);
                      var8_ref.field_q.field_v = null;
                      var8_ref.field_k = null;
                      var11.a(0, 80, 1365, 0, -1, 0);
                      be.field_b = -var12;
                      var11.a(new int[12]);
                      var1 = rh.a((byte) 120, var1, var15, ga.field_d[var3[var14]]);
                      ln.a(0, dd.field_c.field_x, var1, (byte) -58);
                      var14++;
                      if (var27 != 0) {
                        break L19;
                      } else {
                        if (var27 == 0) {
                          continue L26;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                }
                break L20;
              }
              var1[var1.length + -1].c(0);
              hg.field_b = var1;
              ph.a(var5, var6, var7);
              be.a();
              break L19;
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_B = "achievements to collect";
    }
}
