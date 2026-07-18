/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    private int field_e;
    private static int[] field_h;
    private int[][] field_b;
    private int field_g;
    static int[] field_c;
    static bd field_f;
    static boolean field_a;
    static int field_j;
    static String field_d;
    static int field_i;

    final byte[] a(byte[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              if (null != ((nm) this).field_b) {
                var3_int = (int)((long)((nm) this).field_e * (long)param0.length / (long)((nm) this).field_g) - -14;
                var20 = new int[var3_int];
                var18 = var20;
                var16 = var18;
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (param0.length <= var7) {
                    param0 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L4: while (true) {
                      if (var12 >= var3_int) {
                        break L2;
                      } else {
                        L5: {
                          var8 = 32768 + var20[var12] >> 16;
                          if (var8 >= -128) {
                            if (var8 > 127) {
                              param0[var12] = (byte) 127;
                              break L5;
                            } else {
                              param0[var12] = (byte)var8;
                              break L5;
                            }
                          } else {
                            param0[var12] = (byte) -128;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[var7];
                    var19 = ((nm) this).field_b[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= 14) {
                        var6 = var6 + ((nm) this).field_e;
                        var10 = var6 / ((nm) this).field_g;
                        var6 = var6 - ((nm) this).field_g * var10;
                        var5 = var5 + var10;
                        var7++;
                        continue L3;
                      } else {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var19[var10];
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_19_0 = (byte[]) param0;
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("nm.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    final static void a(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bd[] var12_ref_bd__ = null;
        int var12 = 0;
        int var13 = 0;
        double var13_double = 0.0;
        int var14 = 0;
        double var14_double = 0.0;
        int var15 = 0;
        int var16 = 0;
        double var16_double = 0.0;
        int var18 = 0;
        bd var19 = null;
        bd var20 = null;
        bd var21 = null;
        bd var22 = null;
        bd var23 = null;
        bd var24 = null;
        bd var25 = null;
        bd var26 = null;
        bd var27 = null;
        bd var28 = null;
        var18 = HostileSpawn.field_I ? 1 : 0;
        var5 = 24 + uj.field_p.field_e;
        var6 = uj.field_p.field_g;
        var7 = 0;
        var2_int = 0;
        L0: while (true) {
          if (~rc.field_e >= ~var2_int) {
            return;
          } else {
            L1: {
              var8 = re.field_n[var2_int];
              var9 = var8.field_j.b(-4);
              var3 = -var5 + (int)((var8.field_l.field_f + (double)var8.field_j.field_e) * 24.0);
              var4 = -var6 + (int)(24.0 * ((double)var8.field_j.field_g + var8.field_l.field_a));
              if (var3 < -96) {
                break L1;
              } else {
                L2: {
                  if (-96 <= var4) {
                    break L2;
                  } else {
                    if (var8.field_i != 30) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 > 736) {
                  break L1;
                } else {
                  if (var4 <= 576) {
                    L3: {
                      if (var8.field_i != 0) {
                        break L3;
                      } else {
                        L4: {
                          ln.field_a.field_e[var9] = true;
                          var10 = -12 + var3;
                          var11 = var4 + -12;
                          gl.a(var10 << 4, var11 << 4, 384, 128, ni.field_c);
                          if (um.field_e <= 0) {
                            break L4;
                          } else {
                            si.a(var10 << 4, var11 << 4, Math.abs(-um.field_e + 50) + 24 << 4, um.field_e, kh.field_bb);
                            break L4;
                          }
                        }
                        L5: {
                          if (0 < eh.field_g) {
                            L6: {
                              var12_ref_bd__ = ng.field_p[nh.field_H];
                              if (var12_ref_bd__ == null) {
                                break L6;
                              } else {
                                L7: {
                                  if (~cg.field_b > ~var12_ref_bd__.length) {
                                    break L7;
                                  } else {
                                    cg.field_b = 0;
                                    break L7;
                                  }
                                }
                                var12_ref_bd__[cg.field_b].a((double)var11, (double)var10, false, fj.field_Pb, 128);
                                break L6;
                              }
                            }
                            if (null != of.field_d) {
                              L8: {
                                var13_double = var8.field_c;
                                if (of.field_d.length > dn.field_b) {
                                  break L8;
                                } else {
                                  dn.field_b = 0;
                                  break L8;
                                }
                              }
                              L9: {
                                if (of.field_d == od.field_G) {
                                  if (nh.field_H == 0) {
                                    dn.field_b = 0;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              of.field_d[dn.field_b].a(true, 128, (int)var13_double, var10, var11);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            L10: {
                              var12 = jf.field_c / 25;
                              if (var12 <= 4) {
                                break L10;
                              } else {
                                var12 = 4;
                                break L10;
                              }
                            }
                            L11: {
                              if (null == aa.field_d) {
                                break L11;
                              } else {
                                if (~var12 > ~aa.field_d.length) {
                                  aa.field_d[var12].a(true, 128, (int)var8.field_c, var10, var11);
                                  break L11;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            break L5;
                          }
                        }
                        L12: {
                          if (0 > pj.field_v) {
                            break L12;
                          } else {
                            if (pj.field_v <= 3) {
                              var12 = var3;
                              var13 = var4;
                              var12 -= 12;
                              var14_double = 3.141592653589793 * var8.field_c / 128.0;
                              var13 -= 12;
                              var16_double = 2.1561944901923447;
                              var12 = (int)((double)var12 + 28.0 * (Math.sin(var16_double + var14_double) + Math.cos(var16_double + var14_double)));
                              var13 = (int)((double)var13 + 28.0 * (Math.cos(var14_double + var16_double) - Math.sin(var16_double + var14_double)));
                              df.field_g[1 & pj.field_v].a(true, 128, (int)var8.field_c, var12, var13);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (4 > pj.field_v) {
                            break L13;
                          } else {
                            if (pj.field_v <= 5) {
                              var12 = -12 + var3;
                              var13 = var4 - 12;
                              var14_double = 3.141592653589793 * var8.field_c / 128.0;
                              var16_double = 2.1561944901923447;
                              var12 = (int)((double)var12 + (Math.sin(var14_double + var16_double) + Math.cos(var16_double + var14_double)) * 28.0);
                              var13 = (int)((double)var13 + (Math.cos(var16_double + var14_double) - Math.sin(var14_double + var16_double)) * 28.0);
                              df.field_g[0].a(true, 128, (int)var8.field_c, var12, var13);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (pj.field_v < 10) {
                          break L3;
                        } else {
                          if (12 > pj.field_v) {
                            var12 = var3 + -12;
                            var13 = var4 - 12;
                            var14_double = 3.141592653589793 * var8.field_c / 128.0;
                            var16_double = 2.1761944901923447;
                            var12 = (int)((double)var12 + (Math.sin(var16_double + var14_double) + Math.cos(var14_double + var16_double)) * 28.0);
                            var13 = (int)((double)var13 + (Math.cos(var14_double + var16_double) - Math.sin(var16_double + var14_double)) * 28.0);
                            df.field_g[3 - (1 & pj.field_v)].a(true, 128, (int)var8.field_c, var12, var13);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (ue.field_d == 0) {
                      L14: {
                        var8.field_F = 255;
                        var11 = var8.field_i;
                        if (var11 != 30) {
                          if (1 != var11) {
                            if (var11 != 18) {
                              if (var11 == 19) {
                                var21 = lb.field_a[var8.field_w][var8.field_z % lb.field_a[var8.field_w].length];
                                var21.a(true, 128, (int)var8.field_c, var3 - 12, -12 + var4);
                                break L14;
                              } else {
                                if (var11 == 3) {
                                  var22 = bf.field_f[var8.field_w][var8.field_z % bf.field_f[var8.field_w].length];
                                  var22.a(true, 171, (int)var8.field_c, var3, var4);
                                  break L14;
                                } else {
                                  if (var11 == 4) {
                                    break L14;
                                  } else {
                                    if (var11 == 8) {
                                      var23 = re.field_D[var8.field_w][var8.field_z % re.field_D[var8.field_w].length];
                                      var23.a(true, 128, (int)var8.field_c, var3 + -12, -12 + var4);
                                      break L14;
                                    } else {
                                      if (var11 != 12) {
                                        if (var11 != 13) {
                                          if (var11 != 14) {
                                            if (var11 == 26) {
                                              var24 = jh.field_eb[var8.field_w][var8.field_z % jh.field_eb[var8.field_w].length];
                                              var24.a(true, 128, (int)var8.field_c, var3 + -12, var4 + -12);
                                              break L14;
                                            } else {
                                              if (var11 != 23) {
                                                if (var11 == 25) {
                                                  var26 = vd.field_y[var8.field_w][var8.field_z % vd.field_y[var8.field_w].length];
                                                  var26.a(true, 128, (int)var8.field_c, -12 + var3, -12 + var4);
                                                  break L14;
                                                } else {
                                                  if (var11 != 27) {
                                                    if (28 == var11) {
                                                      var28 = of.field_c[var8.field_w][var8.field_z % of.field_c[var8.field_w].length];
                                                      var28.a(true, 128, (int)var8.field_c, var3 - 12, -12 + var4);
                                                      break L14;
                                                    } else {
                                                      if (var11 != 24) {
                                                        if (225 == var11) {
                                                          break L14;
                                                        } else {
                                                          if (var11 == 231) {
                                                            L15: {
                                                              if (var7 != 0) {
                                                                break L15;
                                                              } else {
                                                                var7 = 1;
                                                                var11 = pc.field_c;
                                                                L16: while (true) {
                                                                  if (var11 < 1) {
                                                                    break L15;
                                                                  } else {
                                                                    var12 = (int)(24.0 * ((double)vi.field_p[var11].field_j.field_e + vi.field_p[var11].field_l.field_f)) - var5;
                                                                    var13 = -var6 + (int)(24.0 * (vi.field_p[var11].field_l.field_a + (double)vi.field_p[var11].field_j.field_g));
                                                                    qg.field_q.a(true, 128, (int)(64.0 + vi.field_p[var11].field_c), 24 + var12 + -12, 24 + var13 - 12);
                                                                    var11--;
                                                                    continue L16;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            eg.field_v.a(true, 128, (int)(var8.field_c + 64.0), -12 + (var3 + 24), 12 + var4);
                                                            break L14;
                                                          } else {
                                                            break L14;
                                                          }
                                                        }
                                                      } else {
                                                        break L14;
                                                      }
                                                    }
                                                  } else {
                                                    var27 = pa.field_i[var8.field_w][var8.field_z % pa.field_i[var8.field_w].length];
                                                    var27.a(true, 171, (int)var8.field_c, -12 + var3, var4 - 12);
                                                    break L14;
                                                  }
                                                }
                                              } else {
                                                var25 = ck.field_y[var8.field_w][var8.field_z % ck.field_y[var8.field_w].length];
                                                var25.a(true, 128, (int)var8.field_c, -12 + var3, var4 - 12);
                                                break L14;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!var8.field_n) {
                                break L14;
                              } else {
                                var20 = kl.field_b[var8.field_w][var8.field_z % kl.field_b[var8.field_w].length];
                                var20.a(true, 128, (int)var8.field_c, -12 + var3, var4 - 12);
                                break L14;
                              }
                            }
                          } else {
                            var19 = wc.field_f[var8.field_w][var8.field_z % wc.field_f[var8.field_w].length];
                            var19.a(true, 128, (int)var8.field_c, -12 + var3, -12 + var4);
                            break L14;
                          }
                        } else {
                          if (var8.field_p != 0) {
                            break L14;
                          } else {
                            L17: {
                              var11 = c.field_f[0].field_A;
                              var12 = 4 * sg.field_i % var11;
                              var13 = var4 - 12;
                              var14 = 24 * var8.field_z + var4 + -12;
                              var4 = var4 + var12;
                              si.d(0, var13, 640, var14);
                              var15 = 2 * c.field_f.length + -2;
                              var16 = sg.field_i / 2 % var15;
                              if (var16 >= c.field_f.length) {
                                var16 = -var16 + var15;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: while (true) {
                              if (var4 <= -var11 + var13) {
                                L19: while (true) {
                                  if (var4 >= var14) {
                                    si.c();
                                    break L14;
                                  } else {
                                    c.field_f[var16].e(-12 + var3, var4);
                                    var4 = var4 + var11;
                                    continue L19;
                                  }
                                }
                              } else {
                                var4 = var4 - var11;
                                continue L18;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        L21: {
                          var11 = var8.field_i;
                          if (var11 == 7) {
                            break L21;
                          } else {
                            if (var11 < 10) {
                              break L20;
                            } else {
                              if (var11 < 22) {
                                break L21;
                              } else {
                                if (var11 <= 28) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        if (73 > var11) {
                          break L1;
                        } else {
                          if (76 >= var11) {
                            break L20;
                          } else {
                            break L1;
                          }
                        }
                      }
                      if (2 != var11) {
                        L22: {
                          if (!var8.field_b) {
                            break L22;
                          } else {
                            if (var8.field_I > 0) {
                              break L22;
                            } else {
                              break L1;
                            }
                          }
                        }
                        L23: {
                          var12 = 3;
                          if (!var8.field_b) {
                            break L23;
                          } else {
                            if (var8.field_i == 225) {
                              break L23;
                            } else {
                              if (var8.field_i == 27) {
                                break L23;
                              } else {
                                var12 = 5;
                                break L23;
                              }
                            }
                          }
                        }
                        ln.field_a.field_c[var9] = var12;
                        if (3 != var12) {
                          break L1;
                        } else {
                          if (var8.field_i == 0) {
                            break L1;
                          } else {
                            if (var8.field_i != 27) {
                              L24: {
                                if (ln.field_a.field_c[var9 - -1] == 0) {
                                  ln.field_a.field_c[1 + var9] = 1;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              if (ln.field_a.field_c[param0 + var9] != 0) {
                                break L1;
                              } else {
                                ln.field_a.field_c[var9 - -param0] = 1;
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        if (0 != r.field_a) {
                          break L1;
                        } else {
                          if (var8.field_F > 250) {
                            ln.field_a.field_c[var9] = 3;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            var2_int++;
            continue L0;
          }
        }
    }

    final static void a(int param0, gb param1, int param2, wm param3) {
        if (param2 > -118) {
            return;
        }
        try {
            tk.field_d = param0 * eh.a((byte) -126) / 1000;
            tk.a(true, param1);
            int discarded$0 = 0;
            hd.a(param1);
            int discarded$1 = -11310;
            gb.a(param1);
            int discarded$2 = 255;
            ha.b();
            int discarded$3 = -16183;
            pl.a();
            tk.field_e = -tk.field_d;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "nm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, boolean param1) {
        if (null != ((nm) this).field_b) {
            param0 = (int)((long)((nm) this).field_e * (long)param0 / (long)((nm) this).field_g);
        }
        if (!param1) {
            return -33;
        }
        return param0;
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_f = null;
        if (param0 <= 5) {
            field_j = 26;
        }
        field_d = null;
    }

    final int a(int param0, byte param1) {
        if (((nm) this).field_b != null) {
            param0 = 6 - -(int)((long)param0 * (long)((nm) this).field_e / (long)((nm) this).field_g);
        }
        if (param1 != -59) {
            Object var4 = null;
            nm.a(-73, (gb) null, 7, (wm) null);
        }
        return param0;
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
            L1: {
              if (param0 > 121) {
                break L1;
              } else {
                nm.a((byte) -36);
                break L1;
              }
            }
            stackOut_2_0 = db.a(param1, 0, (byte) -126, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("nm.C(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    nm(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param1 != param0) {
          var3 = tk.a(param1, (byte) 44, param0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((nm) this).field_g = param0;
          ((nm) this).field_e = param1;
          ((nm) this).field_b = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return;
            } else {
              L1: {
                var5 = ((nm) this).field_b[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = (-var6 + (double)var8) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + 0.46 * Math.cos(((double)var8 - var6) * 0.2243994752564138));
                  var5[var8] = (int)Math.floor(65536.0 * var14 + 0.5);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, p param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("nm.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ',' + 25 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_h = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)((var0 << 1) + 1);
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            var3 = (int)((var6 * var6 >> 18) - 32768L);
            if (var3 >= field_h.length) {
                var3 = -1 + field_h.length;
            }
            for (var1 = var2 < 0 ? 0 : var2; var3 >= var1; var1++) {
                field_h[var1] = var0;
            }
        }
        field_j = 0;
        field_c = new int[]{26};
        field_d = "Now you have the data, proceed back to the lift.";
    }
}
