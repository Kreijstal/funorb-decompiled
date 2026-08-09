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
        byte[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_f = (bd) null;
                break L1;
              }
            }
            L2: {
              if (null != this.field_b) {
                var3_int = (int)((long)this.field_e * (long)param0.length / (long)this.field_g) - -14;
                var16 = new int[var3_int];
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
                          var8 = 32768 + var16[var12] >> -1929305456;
                          if ((var8 ^ -1) <= 127) {
                            if (var8 > 127) {
                              param0[var12] = (byte)127;
                              break L5;
                            } else {
                              param0[var12] = (byte)var8;
                              break L5;
                            }
                          } else {
                            param0[var12] = (byte)-128;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param0[var7];
                    var18 = this.field_b[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (-15 >= (var10 ^ -1)) {
                        var6 = var6 + this.field_e;
                        var10 = var6 / this.field_g;
                        var6 = var6 - this.field_g * var10;
                        var5 = var5 + var10;
                        var7++;
                        continue L3;
                      } else {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var18[var10];
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
            stackIn_20_0 = (byte[]) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("nm.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    final static void a(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        double var13_double = 0.0;
        int var13 = 0;
        double var14_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        double var16_double = 0.0;
        int var16 = 0;
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
        try {
          L0: {
            var5 = 24 + uj.field_p.field_e;
            var6 = uj.field_p.field_g;
            var7 = 0;
            if (param1 == 3) {
              var2_int = 0;
              L1: while (true) {
                if (rc.field_e <= var2_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = re.field_n[var2_int];
                    var9 = var8.field_j.b(-4);
                    var3 = -var5 + (int)((var8.field_l.field_f + (double)var8.field_j.field_e) * 24.0);
                    var4 = -var6 + (int)(24.0 * ((double)var8.field_j.field_g + var8.field_l.field_a));
                    if (95 < (var3 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (-96 <= var4) {
                          break L3;
                        } else {
                          if (-31 != (var8.field_i ^ -1)) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (-737 > (var3 ^ -1)) {
                        break L2;
                      } else {
                        if (var4 <= 576) {
                          L4: {
                            if (var8.field_i != 0) {
                              break L4;
                            } else {
                              L5: {
                                ln.field_a.field_e[var9] = true;
                                var10 = -12 + var3;
                                var11 = var4 + -12;
                                gl.a(var10 << -558575996, var11 << -41415164, 384, 128, ni.field_c);
                                if (-1 <= (um.field_e ^ -1)) {
                                  break L5;
                                } else {
                                  si.a(var10 << 1128400644, var11 << 902221700, Math.abs(-um.field_e + 50) + 24 << 1304438500, um.field_e, kh.field_bb);
                                  break L5;
                                }
                              }
                              L6: {
                                if (0 < eh.field_g) {
                                  L7: {
                                    var12_ref_bd__ = ng.field_p[nh.field_H];
                                    if (var12_ref_bd__ == null) {
                                      break L7;
                                    } else {
                                      L8: {
                                        if (cg.field_b < var12_ref_bd__.length) {
                                          break L8;
                                        } else {
                                          cg.field_b = 0;
                                          break L8;
                                        }
                                      }
                                      var12_ref_bd__[cg.field_b].a((double)var11, (double)var10, false, fj.field_Pb, 128);
                                      break L7;
                                    }
                                  }
                                  if (null != of.field_d) {
                                    L9: {
                                      var13_double = var8.field_c;
                                      if (of.field_d.length > dn.field_b) {
                                        break L9;
                                      } else {
                                        dn.field_b = 0;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (of.field_d == od.field_G) {
                                        if (-1 == (nh.field_H ^ -1)) {
                                          dn.field_b = 0;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                    of.field_d[dn.field_b].a(true, 128, (int)var13_double, var10, var11);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  L11: {
                                    var12 = jf.field_c / 25;
                                    if (var12 <= 4) {
                                      break L11;
                                    } else {
                                      var12 = 4;
                                      break L11;
                                    }
                                  }
                                  if (null == aa.field_d) {
                                    break L6;
                                  } else {
                                    if (var12 < aa.field_d.length) {
                                      aa.field_d[var12].a(true, 128, (int)var8.field_c, var10, var11);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
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
                                  if (-6 <= (pj.field_v ^ -1)) {
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
                              if (-11 < (pj.field_v ^ -1)) {
                                break L4;
                              } else {
                                if (12 > pj.field_v) {
                                  var12 = var3 + -12;
                                  var13 = var4 - 12;
                                  var14_double = 3.141592653589793 * var8.field_c / 128.0;
                                  var16_double = 2.1761944901923447;
                                  var12 = (int)((double)var12 + (Math.sin(var16_double + var14_double) + Math.cos(var14_double + var16_double)) * 28.0);
                                  var13 = (int)((double)var13 + (Math.cos(var14_double + var16_double) - Math.sin(var16_double + var14_double)) * 28.0);
                                  df.field_g[3 - (1 & pj.field_v)].a(true, 128, (int)var8.field_c, var12, var13);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          if (-1 == (ue.field_d ^ -1)) {
                            L14: {
                              var8.field_F = 255;
                              var11 = var8.field_i;
                              if (-31 != (var11 ^ -1)) {
                                if (1 != var11) {
                                  if (var11 != 18) {
                                    if (var11 == 19) {
                                      var21 = lb.field_a[var8.field_w][var8.field_z % lb.field_a[var8.field_w].length];
                                      var21.a(true, 128, (int)var8.field_c, var3 - 12, -12 + var4);
                                      break L14;
                                    } else {
                                      if ((var11 ^ -1) == -4) {
                                        var22 = bf.field_f[var8.field_w][var8.field_z % bf.field_f[var8.field_w].length];
                                        var22.a(true, 171, (int)var8.field_c, var3, var4);
                                        break L14;
                                      } else {
                                        if (var11 == 4) {
                                          break L14;
                                        } else {
                                          if ((var11 ^ -1) == -9) {
                                            var23 = re.field_D[var8.field_w][var8.field_z % re.field_D[var8.field_w].length];
                                            var23.a(true, 128, (int)var8.field_c, var3 + -12, -12 + var4);
                                            break L14;
                                          } else {
                                            if (-13 != (var11 ^ -1)) {
                                              if (-14 != (var11 ^ -1)) {
                                                if ((var11 ^ -1) != -15) {
                                                  if ((var11 ^ -1) == -27) {
                                                    var24 = jh.field_eb[var8.field_w][var8.field_z % jh.field_eb[var8.field_w].length];
                                                    var24.a(true, 128, (int)var8.field_c, var3 + -12, var4 + -12);
                                                    break L14;
                                                  } else {
                                                    if ((var11 ^ -1) != -24) {
                                                      if ((var11 ^ -1) == -26) {
                                                        var26 = vd.field_y[var8.field_w][var8.field_z % vd.field_y[var8.field_w].length];
                                                        var26.a(true, 128, (int)var8.field_c, -12 + var3, -12 + var4);
                                                        break L14;
                                                      } else {
                                                        if ((var11 ^ -1) != -28) {
                                                          if (28 == var11) {
                                                            var28 = of.field_c[var8.field_w][var8.field_z % of.field_c[var8.field_w].length];
                                                            var28.a(true, 128, (int)var8.field_c, var3 - 12, -12 + var4);
                                                            break L14;
                                                          } else {
                                                            if (var11 != 24) {
                                                              if (225 == var11) {
                                                                break L14;
                                                              } else {
                                                                if (-232 == (var11 ^ -1)) {
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
                                if (-1 != (var8.field_p ^ -1)) {
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
                                    if (-23 < (var11 ^ -1)) {
                                      break L21;
                                    } else {
                                      if (-29 <= (var11 ^ -1)) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                              if (73 > var11) {
                                break L2;
                              } else {
                                if (76 >= var11) {
                                  break L20;
                                } else {
                                  break L2;
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
                                    break L2;
                                  }
                                }
                              }
                              L23: {
                                var12 = 3;
                                if (!var8.field_b) {
                                  break L23;
                                } else {
                                  if (-226 == (var8.field_i ^ -1)) {
                                    break L23;
                                  } else {
                                    if ((var8.field_i ^ -1) == -28) {
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
                                break L2;
                              } else {
                                if (-1 == (var8.field_i ^ -1)) {
                                  break L2;
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
                                      break L2;
                                    } else {
                                      ln.field_a.field_c[var9 - -param0] = 1;
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              if (0 != r.field_a) {
                                break L2;
                              } else {
                                if ((var8.field_F ^ -1) < -251) {
                                  ln.field_a.field_c[var9] = 3;
                                  break L2;
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
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "nm.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, gb param1, int param2, wm param3) {
        if (param2 > -118) {
            return;
        }
        try {
            tk.field_d = param0 * eh.a((byte) -126) / 1000;
            tk.a(true, param1);
            hd.a(param1, false);
            gb.a(param1, -11310);
            ha.b(255);
            pl.a(-16183);
            tk.field_e = -tk.field_d + 0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "nm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, boolean param1) {
        if (null != this.field_b) {
            param0 = (int)((long)this.field_e * (long)param0 / (long)this.field_g);
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
        if (this.field_b != null) {
            param0 = 6 - -(int)((long)param0 * (long)this.field_e / (long)this.field_g);
        }
        if (param1 != -59) {
            wm var4 = (wm) null;
            nm.a(-73, (gb) null, 7, (wm) null);
        }
        return param0;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = db.a(param1, 0, (byte) -126, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("nm.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    nm(int param0, int param1) {
        int var3;
        int var4;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param1 != param0) {
          var3 = tk.a(param1, (byte) 44, param0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_g = param0;
          this.field_e = param1;
          this.field_b = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return;
            } else {
              L1: {
                var5 = this.field_b[var4];
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

    final static void a(int param0, p param1, int param2, int param3) {
        try {
            if (param3 != 25) {
                nm.a(66, -85);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "nm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_h = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)(-1 + (var0 << 1672448673));
            var6 = (long)((var0 << 1695234145) + 1);
            var2 = (int)(-32768L + (var4 * var4 >> -785508974));
            var3 = (int)((var6 * var6 >> -572644206) - 32768L);
            if (var3 >= field_h.length) {
                var3 = -1 + field_h.length;
            }
            for (var1 = -1 < (var2 ^ -1) ? 0 : var2; var3 >= var1; var1++) {
                field_h[var1] = var0;
            }
        }
        field_j = 0;
        field_c = new int[]{26};
        field_d = "Now you have the data, proceed back to the lift.";
    }
}
