/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private gb field_f;
    static bd field_a;
    static boolean field_d;
    private gb field_c;
    static String field_g;
    static int field_h;
    private jm field_b;
    private jm field_e;

    private final jb a(int[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jb var8 = null;
        qf var9 = null;
        jb stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        jb stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        jb stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2 ^ (param1 >>> -1126962644 | (-1610608641 & param1) << 1158547780);
            var5_int = var5_int | param1 << -1119876656;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (jb) ((Object) this.field_e.a(false, var6));
            if (var8 != null) {
              stackIn_3_0 = (jb) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 < param0[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var9 = (qf) ((Object) this.field_b.a(false, var6));
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = qf.a(this.field_c, param1, param2);
                  if (var9 != null) {
                    this.field_b.a(-122, var6, var9);
                    break L2;
                  } else {
                    stackIn_11_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var8 = var9.a(param0);
              if (param3 == 97) {
                if (var8 != null) {
                  var9.b(126);
                  this.field_e.a(param3 ^ -21, var6, var8);
                  stackIn_20_0 = (jb) (var8);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_18_0 = null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_15_0 = (jb) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("rd.G(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jb) ((Object) stackIn_11_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (jb) ((Object) stackIn_18_0);
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    private final jb a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jb var8 = null;
        va var9 = null;
        int var10 = 0;
        jb var11 = null;
        jb stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        jb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3 ^ ((-1879044097 & param1) << 58583140 | param1 >>> 1335754348);
            var5_int = var5_int | param1 << -1217036240;
            var6 = (long)var5_int;
            var8 = (jb) ((Object) this.field_e.a(false, var6));
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if ((param2[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = va.a(this.field_f, param1, param3);
              if (var9 != null) {
                L2: {
                  var11 = var9.a();
                  var8 = var11;
                  this.field_e.a(-107, var6, var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var11.field_k.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var10 = -41 % ((param0 - -60) / 44);
                stackIn_14_0 = (jb) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (jb) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("rd.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (jb) ((Object) stackIn_6_0);
          } else {
            return stackIn_14_0;
          }
        }
    }

    final jb a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        jb stackIn_2_0 = null;
        jb stackIn_6_0 = null;
        jb stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -22) {
              if (1 == this.field_c.f(-120)) {
                stackIn_6_0 = this.a(param1, 0, param2, (byte) 97);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (1 != this.field_c.c(0, param2)) {
                  throw new RuntimeException();
                } else {
                  stackIn_9_0 = this.a(param1, param2, 0, (byte) 97);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (jb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("rd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final jb a(int[] param0, int param1, int param2) {
        jb discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        jb stackIn_3_0 = null;
        jb stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-2 == (this.field_f.f(-114) ^ -1)) {
              stackIn_3_0 = this.a(-117, 0, param0, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 128) {
                  break L1;
                } else {
                  var5 = (int[]) null;
                  discarded$1 = this.a(44, 65, (int[]) null, 71);
                  break L1;
                }
              }
              if (this.field_f.c(0, param2) != 1) {
                throw new RuntimeException();
              } else {
                stackIn_8_0 = this.a(param1 + -76, param2, param0, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("rd.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            return;
        }
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0) {
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_116_0;
        int stackIn_116_1;
        int stackIn_116_2;
        int stackIn_116_3;
        int stackIn_116_4;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_117_5 = 0;
        int stackIn_119_0;
        int stackIn_119_1;
        int stackIn_119_2;
        int stackIn_119_3;
        int stackIn_119_4;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        int stackIn_120_4 = 0;
        int stackIn_120_5 = 0;
        int stackIn_122_0;
        int stackIn_122_1;
        int stackIn_122_2;
        int stackIn_122_3;
        int stackIn_122_4;
        int stackIn_123_0;
        int stackIn_123_1;
        int stackIn_123_2;
        int stackIn_123_3;
        int stackIn_123_4;
        int stackIn_123_5;
        int stackIn_139_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6_ref_oc = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[] var16 = null;
        boolean[] var17 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        boolean[] var29 = null;
        boolean[] var34 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        boolean[] var42 = null;
        var24 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_h = -14;
                break L1;
              }
            }
            L2: {
              pf.field_I = null;
              if ((5 & el.field_m) == 0) {
                ri.field_h = -1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var1_int = ln.field_a.field_d;
              var2 = ln.field_a.field_n;
              var3 = uj.field_p.field_e;
              var4 = uj.field_p.field_g;
              if (1 == ln.field_a.field_m) {
                si.d();
                break L3;
              } else {
                uf.field_i[4].c(-24 + -var3 / 16, -var4 / 16 + -24);
                break L3;
              }
            }
            L4: {
              stackIn_11_0 = qa.field_b;

              if (80 > qa.field_b) {
                stackIn_12_0 = stackIn_11_0;
                stackIn_12_1 = 0;
                break L4;
              } else {
                stackIn_12_0 = stackIn_11_0;
                stackIn_12_1 = -80 + qa.field_b;
                break L4;
              }
            }
            L5: {




              stackIn_14_2 = 640 + -qa.field_b;

              if (qa.field_b < 80) {


                stackIn_15_2 = stackIn_14_2;
                stackIn_15_3 = 480;
                break L5;
              } else {


                stackIn_15_2 = stackIn_14_2;
                stackIn_15_3 = 80 + (-qa.field_b + 480);
                break L5;
              }
            }
            L6: {
              L7: {
                si.d(stackIn_12_0, stackIn_12_1, stackIn_15_2, stackIn_15_3);
                var5 = mm.field_m[0];
                if (hg.field_e != 1) {
                  uf.field_i[4].c(-(uf.field_i[4].field_z / 2) + 320, 240 + -(uf.field_i[4].field_A / 2));
                  break L7;
                } else {
                  L8: {
                    var6_ref_oc = new oc();
                    ln.field_a.a(-2, 1);
                    var10 = var5.field_j;
                    if (jf.field_c == 0) {
                      L9: {
                        var11 = var10.field_e;
                        var12 = var10.field_g;
                        if (-6 != (ha.field_t ^ -1)) {
                          L10: {
                            if (-7 != (ha.field_t ^ -1)) {
                              break L10;
                            } else {
                              if (var11 < nh.field_E.field_e) {
                                break L10;
                              } else {
                                if (nh.field_E.field_g > var12) {
                                  break L10;
                                } else {
                                  if (nh.field_E.field_e - -2 < var11) {
                                    break L10;
                                  } else {
                                    if (var12 > 2 + nh.field_E.field_g) {
                                      break L10;
                                    } else {
                                      kd.a(9, 1);
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            L12: {
                              if (-1 != (ha.field_t ^ -1)) {
                                break L12;
                              } else {
                                if (var11 < nh.field_E.field_e) {
                                  break L12;
                                } else {
                                  if (var12 < nh.field_E.field_g) {
                                    break L12;
                                  } else {
                                    if (nh.field_E.field_e - -2 < var11) {
                                      break L12;
                                    } else {
                                      if (var12 <= 2 + nh.field_E.field_g) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (-15 != (ha.field_t ^ -1)) {
                              break L9;
                            } else {
                              if (nh.field_E.field_e > var11) {
                                break L9;
                              } else {
                                if (var12 < -3 + nh.field_E.field_g) {
                                  break L9;
                                } else {
                                  if (var11 > nh.field_E.field_e + 4) {
                                    break L9;
                                  } else {
                                    if (var12 <= 4 + nh.field_E.field_g) {
                                      break L11;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (bm.field_c == 0) {
                            L13: {
                              if (-1 != (rl.field_c ^ -1)) {
                                break L13;
                              } else {
                                if (!bj.field_a) {
                                  bj.field_a = true;
                                  break L9;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              if (-2 != (rl.field_c ^ -1)) {
                                break L14;
                              } else {
                                if (!tg.field_a) {
                                  tg.field_a = true;
                                  break L9;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if ((rl.field_c ^ -1) == -10) {
                              mf.a(false, 3);
                              ti.a(253, (byte) -122, 2);
                              break L9;
                            } else {
                              if (2 == rl.field_c) {
                                mf.a(false, 2);
                                ti.a(255, (byte) -112, 0);
                                break L9;
                              } else {
                                mf.a(false, 2);
                                if (6 != rl.field_c) {
                                  break L9;
                                } else {
                                  ti.a(254, (byte) -10, 1);
                                  break L9;
                                }
                              }
                            }
                          } else {
                            break L9;
                          }
                        } else {
                          L15: {
                            var13 = var11 - nh.field_E.field_e;
                            if (0 > var13) {
                              var13 = -var13;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            var14 = var12 + -nh.field_E.field_g;
                            if ((var14 ^ -1) <= -1) {
                              break L16;
                            } else {
                              var14 = -var14;
                              break L16;
                            }
                          }
                          if ((var13 ^ -1) <= -11) {
                            break L9;
                          } else {
                            if ((var14 ^ -1) <= -11) {
                              break L9;
                            } else {
                              kd.a(6, 1);
                              break L9;
                            }
                          }
                        }
                      }
                      if (eh.field_g > 0) {
                        break L8;
                      } else {
                        L17: {
                          if (4 <= mc.field_I) {
                            break L17;
                          } else {
                            eh.field_c.a(fg.field_b[17], 100, 2 * uh.field_i);
                            break L17;
                          }
                        }
                        mf.a(false, 4);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L18: {
                    var11 = var3 / 24;
                    var12 = -1 + var4 / 24;
                    var14 = 20 + var12 + 1;
                    var13 = 2 + var11 + 26;
                    if (var12 <= 0) {
                      var12 = 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var1_int - 1 <= var14) {
                      var14 = var1_int + -2;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var13 >= -1 + var1_int) {
                      var13 = -2 + var1_int;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var11 > 0) {
                      break L21;
                    } else {
                      var11 = 1;
                      break L21;
                    }
                  }
                  var40 = ln.field_a.field_y;
                  var34 = ln.field_a.field_B;
                  var29 = var34;
                  var16 = var29;
                  var17 = ln.field_a.field_r;
                  var39 = ln.field_a.field_o;
                  var42 = ln.field_a.field_e;
                  var20 = var12;
                  L22: while (true) {
                    if (var20 > var14) {
                      var9 = 0;
                      var8 = 0;
                      var41 = ln.field_a.field_u;
                      var6_ref_oc.field_g = var12;
                      L23: while (true) {
                        if (var14 < var6_ref_oc.field_g) {
                          L24: {
                            L25: {
                              lg.a(var4, 0, 0, var3);
                              bi.a(var4, -457, var41, var3);
                              gn.a(var4, var8, var3, 101, var9, var42, var34);
                              if (14 == ul.field_L) {
                                break L25;
                              } else {
                                if (!tg.field_a) {
                                  break L24;
                                } else {
                                  if (of.field_d == dn.field_i) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            L26: {
                              var21 = 688 + -var3;
                              var22 = 560 + -var4;
                              stackIn_116_0 = var21;

                              stackIn_116_1 = var22;

                              stackIn_116_2 = 64;

                              stackIn_116_3 = 64;

                              stackIn_116_4 = 16776960;

                              if (ca.field_c >= 256) {
                                stackIn_117_0 = stackIn_116_0;
                                stackIn_117_1 = stackIn_116_1;
                                stackIn_117_2 = stackIn_116_2;
                                stackIn_117_3 = stackIn_116_3;
                                stackIn_117_4 = stackIn_116_4;
                                stackIn_117_5 = 512 - ca.field_c;
                                break L26;
                              } else {
                                stackIn_117_0 = stackIn_116_0;
                                stackIn_117_1 = stackIn_116_1;
                                stackIn_117_2 = stackIn_116_2;
                                stackIn_117_3 = stackIn_116_3;
                                stackIn_117_4 = stackIn_116_4;
                                stackIn_117_5 = ca.field_c;
                                break L26;
                              }
                            }
                            L27: {
                              si.e(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_117_3, stackIn_117_4, stackIn_117_5 >> -109076927);
                              var23 = 511 & ca.field_c + 64;
                              stackIn_119_0 = 4 + var21;

                              stackIn_119_1 = 4 + var22;

                              stackIn_119_2 = 56;

                              stackIn_119_3 = 56;

                              stackIn_119_4 = 16776960;

                              if ((var23 ^ -1) > -257) {
                                stackIn_120_0 = stackIn_119_0;
                                stackIn_120_1 = stackIn_119_1;
                                stackIn_120_2 = stackIn_119_2;
                                stackIn_120_3 = stackIn_119_3;
                                stackIn_120_4 = stackIn_119_4;
                                stackIn_120_5 = var23;
                                break L27;
                              } else {
                                stackIn_120_0 = stackIn_119_0;
                                stackIn_120_1 = stackIn_119_1;
                                stackIn_120_2 = stackIn_119_2;
                                stackIn_120_3 = stackIn_119_3;
                                stackIn_120_4 = stackIn_119_4;
                                stackIn_120_5 = 512 - var23;
                                break L27;
                              }
                            }
                            L28: {
                              si.e(stackIn_120_0, stackIn_120_1, stackIn_120_2, stackIn_120_3, stackIn_120_4, stackIn_120_5 >> -147454815);
                              var23 = var23 + 64 & 511;
                              stackIn_122_0 = var21 + 8;

                              stackIn_122_1 = 8 + var22;

                              stackIn_122_2 = 48;

                              stackIn_122_3 = 48;

                              stackIn_122_4 = 16776960;

                              if (var23 < 256) {
                                stackIn_123_0 = stackIn_122_0;
                                stackIn_123_1 = stackIn_122_1;
                                stackIn_123_2 = stackIn_122_2;
                                stackIn_123_3 = stackIn_122_3;
                                stackIn_123_4 = stackIn_122_4;
                                stackIn_123_5 = var23;
                                break L28;
                              } else {
                                stackIn_123_0 = stackIn_122_0;
                                stackIn_123_1 = stackIn_122_1;
                                stackIn_123_2 = stackIn_122_2;
                                stackIn_123_3 = stackIn_122_3;
                                stackIn_123_4 = stackIn_122_4;
                                stackIn_123_5 = -var23 + 512;
                                break L28;
                              }
                            }
                            si.e(stackIn_123_0, stackIn_123_1, stackIn_123_2, stackIn_123_3, stackIn_123_4, stackIn_123_5 >> -1633242975);
                            break L24;
                          }
                          L29: {
                            if ((vj.field_g ^ -1) != -2) {
                              if (-3 != (vj.field_g ^ -1)) {
                                break L29;
                              } else {
                                ad.a((byte) -118);
                                break L29;
                              }
                            } else {
                              lf.a((byte) -122);
                              break L29;
                            }
                          }
                          L30: {
                            vf.a(var1_int, var2, var11, 28, var12, var14, var13);
                            lg.a(var4, 0, 1, var3);
                            ih.a(-15587, var1_int);
                            nj.a(11178);
                            nm.a(var1_int, 3);
                            hi.b(false);
                            qa.a(var11, 18, var12, var13, var14, var1_int, var2);
                            ei.d(-114);
                            if (null == pf.field_I) {
                              break L30;
                            } else {
                              id.field_A.b(pf.field_I, lh.field_a, -8 + aj.field_d, 16772608, 0);
                              break L30;
                            }
                          }
                          L31: {
                            dd.g(-125);
                            if (null == q.field_g) {
                              break L31;
                            } else {
                              if (!q.field_g.b(96)) {
                                break L7;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            if ((ul.field_L ^ -1) >= -2) {
                              if ((ul.field_L ^ -1) == 0) {
                                stackIn_139_0 = 1;
                                break L32;
                              } else {
                                stackIn_139_0 = 0;
                                break L32;
                              }
                            } else {
                              stackIn_139_0 = 1;
                              break L32;
                            }
                          }
                          L33: {
                            var21 = stackIn_139_0;
                            if (bm.field_c != 0) {
                              break L33;
                            } else {
                              if (rl.field_c != 0) {
                                break L33;
                              } else {
                                if (of.field_d == dn.field_i) {
                                  var21 = 0;
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          L34: {
                            if (0 != bm.field_c) {
                              break L34;
                            } else {
                              if (1 != rl.field_c) {
                                break L34;
                              } else {
                                if (dn.field_i != of.field_d) {
                                  break L34;
                                } else {
                                  var21 = 0;
                                  break L34;
                                }
                              }
                            }
                          }
                          L35: {
                            if (bm.field_c != 0) {
                              break L35;
                            } else {
                              if (8 != rl.field_c) {
                                break L35;
                              } else {
                                if (3 != ha.field_t) {
                                  break L35;
                                } else {
                                  if (!pm.field_a) {
                                    break L35;
                                  } else {
                                    var21 = 0;
                                    break L35;
                                  }
                                }
                              }
                            }
                          }
                          if (var21 != 0) {
                            nh.field_P.a((byte) -46);
                            break L7;
                          } else {
                            L36: {
                              var6 = 0;
                              if (-6 == (mc.field_I ^ -1)) {
                                var6 = 16777215;
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            L37: {
                              if (0 >= jf.field_c) {
                                break L37;
                              } else {
                                if (128 > jf.field_c) {
                                  si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L38: {
                              if (128 > jf.field_c) {
                                break L38;
                              } else {
                                if (jf.field_c < 256) {
                                  si.a(0, 0, 640, 480, var6, 512 + -(2 * jf.field_c));
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            cb.a(631, var5);
                            if (0 < lg.field_f) {
                              var7 = 0;
                              L39: while (true) {
                                if (20 <= var7) {
                                  break L6;
                                } else {
                                  si.e(0 - -var7, 0 + var7, -(var7 * 2) + 640, -(var7 * 2) + 480, 16711680, lg.field_f * (20 - var7) / 4);
                                  var7++;
                                  continue L39;
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          var6_ref_oc.field_e = var11;
                          L40: while (true) {
                            if (var13 < var6_ref_oc.field_e) {
                              var6_ref_oc.field_g = var6_ref_oc.field_g + 1;
                              continue L23;
                            } else {
                              L41: {
                                var7 = var6_ref_oc.b(-4);
                                vf.a(-63, var7);
                                if (18 > var40[var7]) {
                                  break L41;
                                } else {
                                  if (21 < var40[var7]) {
                                    break L41;
                                  } else {
                                    if (16 <= var41[var7]) {
                                      break L41;
                                    } else {
                                      var41[var7] = 16;
                                      break L41;
                                    }
                                  }
                                }
                              }
                              var6_ref_oc.field_e = var6_ref_oc.field_e + 1;
                              continue L40;
                            }
                          }
                        }
                      }
                    } else {
                      var9 = -var4 + var20 * 24;
                      var7 = var1_int * var20 - -var11;
                      var21 = var11;
                      L42: while (true) {
                        if (var21 > var13) {
                          var20++;
                          continue L22;
                        } else {
                          L43: {
                            var7++;
                            var22 = var39[var7];
                            if ((var22 >> -1484167384 ^ -1) != -5) {
                              break L43;
                            } else {
                              if (bm.field_c != 0) {
                                break L43;
                              } else {
                                if (rl.field_c != 2) {
                                  break L43;
                                } else {
                                  if ((ha.field_t ^ -1) == -15) {
                                    break L43;
                                  } else {
                                    var21++;
                                    continue L42;
                                  }
                                }
                              }
                            }
                          }
                          L44: {
                            if (-1 == var39[var7]) {
                              break L44;
                            } else {
                              if (0 < ak.field_b[var22].field_a) {
                                break L44;
                              } else {
                                var21++;
                                continue L42;
                              }
                            }
                          }
                          L45: {
                            L46: {
                              if (!pa.field_d) {
                                break L46;
                              } else {
                                if (var16[var7]) {
                                  break L46;
                                } else {
                                  if (!var17[var7]) {
                                    break L46;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                            if (pk.field_d[var40[var7]] != null) {
                              var8 = -var3 + 24 * var21;
                              pk.field_d[var40[var7]].e(var8, var9);
                              break L45;
                            } else {
                              var21++;
                              continue L42;
                            }
                          }
                          var21++;
                          continue L42;
                        }
                      }
                    }
                  }
                }
              }
              L47: {
                var6 = 0;
                if (-6 == (mc.field_I ^ -1)) {
                  var6 = 16777215;
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (0 >= jf.field_c) {
                  break L48;
                } else {
                  if (128 > jf.field_c) {
                    si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                    break L48;
                  } else {
                    break L48;
                  }
                }
              }
              L49: {
                if (128 > jf.field_c) {
                  break L49;
                } else {
                  if (jf.field_c < 256) {
                    si.a(0, 0, 640, 480, var6, 512 + -(2 * jf.field_c));
                    break L49;
                  } else {
                    break L49;
                  }
                }
              }
              cb.a(631, var5);
              if (0 < lg.field_f) {
                var7 = 0;
                L50: while (true) {
                  if (20 <= var7) {
                    break L6;
                  } else {
                    si.e(0 - -var7, 0 + var7, -(var7 * 2) + 640, -(var7 * 2) + 480, 16711680, lg.field_f * (20 - var7) / 4);
                    var7++;
                    continue L50;
                  }
                }
              } else {
                break L6;
              }
            }
            L51: {
              if ((li.field_q ^ -1) > -3) {
                break L51;
              } else {
                break L51;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rd.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
            if (param0 != -6) {
                rd.a(false);
            }
            if (null != q.field_b) {
                try {
                    q.field_b.a(0L, (byte) 109);
                    q.field_b.a(24, sc.field_g.field_i, sc.field_g.field_n, (byte) 60);
                } catch (Exception exception) {
                }
            }
            sc.field_g.field_i = sc.field_g.field_i + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rd(gb param0, gb param1) {
        this.field_b = new jm(256);
        this.field_e = new jm(256);
        try {
            this.field_f = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Waiting for music";
        field_h = 10;
        field_d = false;
    }
}
