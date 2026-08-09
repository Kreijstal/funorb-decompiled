/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends wb implements qk {
    private ph field_gb;
    static int field_db;
    static bd field_cb;
    static int field_ab;
    static String field_bb;
    static bd[][] field_eb;
    static int field_fb;

    final static void b(int param0, int param1) {
        int var3 = 0;
        byte[] var4 = null;
        cl var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5 = (cl) ((Object) ne.field_q.g(-101));
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  if (param1 < -82) {
                    break L2;
                  } else {
                    var4 = (byte[]) null;
                    jh.a(116, (byte[]) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                dk.a(var5, param0, 10);
                var5 = (cl) ((Object) ne.field_q.a(12684));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "jh.O(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, hm param2) {
        try {
            ih.field_x.a(param2, 98);
            int var3_int = -116 / ((param0 - 59) / 53);
            ci.a(param1, 2, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "jh.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, gb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 107 % ((param0 - -6) / 59);
            stackIn_1_0 = param1.e(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("jh.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void g(byte param0) {
        field_cb = null;
        if (param0 > -100) {
            jh.b(-41, -92);
        }
        field_eb = (bd[][]) null;
        field_bb = null;
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        try {
            if (this.field_gb == param3) {
                this.f((byte) -86);
            }
            int var6_int = 64 % ((-63 - param4) / 52);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "jh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gb var16 = null;
        vi var17 = null;
        vi var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new vi(param1);
              var18 = var17;
              var18.field_i = param1.length + -2;
              sc.field_c = var18.e(8);
              vh.field_a = new byte[sc.field_c][];
              ja.field_e = new byte[sc.field_c][];
              th.field_Jb = new int[sc.field_c];
              hd.field_r = new int[sc.field_c];
              sf.field_X = new int[sc.field_c];
              if (param0 == -26869) {
                break L1;
              } else {
                var16 = (gb) null;
                jh.a(-126, (gb) null);
                break L1;
              }
            }
            nh.field_O = new int[sc.field_c];
            qj.field_k = new boolean[sc.field_c];
            var18.field_i = -(sc.field_c * 8) + (-7 + param1.length);
            ra.field_a = var18.e(param0 + 26877);
            vc.field_e = var18.e(8);
            var3 = 1 + (255 & var18.l(32270));
            var4 = 0;
            L2: while (true) {
              if (sc.field_c <= var4) {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= sc.field_c) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= sc.field_c) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= sc.field_c) {
                            var18.field_i = 3 + -(var3 * 3) + param1.length - (7 - -(8 * sc.field_c));
                            bf.field_d = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var18.field_i = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= sc.field_c) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = sf.field_X[var4];
                                      var6 = hd.field_r[var4];
                                      var7 = var5 * var6;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var8 = var19;
                                      ja.field_e[var4] = var21;
                                      var22 = new byte[var7];
                                      var20 = var22;
                                      var9 = var20;
                                      vh.field_a[var4] = var22;
                                      var10 = 0;
                                      var11 = var18.l(32270);
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var7 <= var12) {
                                            if (-1 != (2 & var11 ^ -1)) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    dupTemp$0 = var18.j(0);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_48_0 = var10;

                                                    if ((var13 ^ -1) == 0) {
                                                      stackIn_49_0 = stackIn_48_0;
                                                      stackIn_49_1 = 0;
                                                      break L11;
                                                    } else {
                                                      stackIn_49_0 = stackIn_48_0;
                                                      stackIn_49_1 = 1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_49_0 | stackIn_49_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var18.j(0);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if (-1 == (2 & var11 ^ -1)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        dupTemp$1 = var18.j(0);
                                                        var9[var5 * var13 + var12] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_36_0 = var10;

                                                        if (0 == (var14 ^ -1)) {
                                                          stackIn_37_0 = stackIn_36_0;
                                                          stackIn_37_1 = 0;
                                                          break L15;
                                                        } else {
                                                          stackIn_37_0 = stackIn_36_0;
                                                          stackIn_37_1 = 1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_37_0 | stackIn_37_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var5 * var13 + var12] = var18.j(0);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    qj.field_k[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  bf.field_d[var4] = var18.h(92);
                                  if (0 != bf.field_d[var4]) {
                                    break L17;
                                  } else {
                                    bf.field_d[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            hd.field_r[var4] = var18.e(8);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        sf.field_X[var4] = var18.e(bm.a(param0, -26877));
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    nh.field_O[var4] = var18.e(8);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                th.field_Jb[var4] = var17.e(bm.a(param0, -26877));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("jh.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
    }

    private final void f(byte param0) {
        if (!this.field_F) {
            return;
        }
        if (param0 != -86) {
            return;
        }
        this.field_F = false;
    }

    final static void a(int param0, byte param1, int param2, jb[] param3, int param4) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (-2 == (uj.field_l ^ -1)) {
                L2: {
                  if (param4 > 1) {
                    param2 = param2 + (int)(Math.random() * (double)param4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param3 != jc.field_c) {
                    break L3;
                  } else {
                    if (-2 < (param2 ^ -1)) {
                      break L3;
                    } else {
                      if ((param2 ^ -1) <= -10) {
                        break L3;
                      } else {
                        param0 = param0 * 2;
                        break L3;
                      }
                    }
                  }
                }
                eh.field_c.a(param3[param2], 100, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param1 > 28) {
                break L4;
              } else {
                field_ab = 106;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("jh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    private final ph a(mh param0, String param1, byte param2) {
        ph var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        jb[] var6 = null;
        ph stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new ph(param1, param0);
              var4.field_h = (nn) ((Object) new ke());
              var5 = this.field_x - 6;
              this.field_x = this.field_x + 38;
              var4.a(-30 + this.field_s, var5, 0, 15, 30);
              if (param2 == 50) {
                break L1;
              } else {
                var6 = (jb[]) null;
                jh.a(113, (byte) 58, 125, (jb[]) null, 37);
                break L1;
              }
            }
            this.a(param2 + 51398, var4);
            this.c(0);
            stackIn_3_0 = (ph) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("jh.G(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    jh(gg param0, jf param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == id.field_s) {
                var3 = he.field_z;
                break L1;
              } else {
                if (hf.field_g != param1) {
                  if (param1 != g.field_M) {
                    break L1;
                  } else {
                    var3 = ph.field_y;
                    this.field_x = this.field_x + 30;
                    break L1;
                  }
                } else {
                  this.field_x = this.field_x + 10;
                  var3 = ha.field_y;
                  if (!kd.a((byte) -114)) {
                    break L1;
                  } else {
                    this.field_x = this.field_x + 20;
                    var3 = nj.field_b;
                    break L1;
                  }
                }
              }
            }
            var4 = new ag((String) (var3), (mh) null);
            var4.field_s = this.field_s;
            var4.field_x = 80;
            var4.field_v = 0;
            var4.field_m = 50;
            var4.field_h = (nn) ((Object) new cn(jn.field_G, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(51448, var4);
            this.field_gb = this.a((mh) (this), gi.field_n, (byte) 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("jh.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static bd[] a(bd[] param0, int param1, int param2) {
        bd[] var3 = null;
        RuntimeException var3_ref = null;
        bd[] stackIn_2_0 = null;
        bd[] stackIn_5_0 = null;
        bd[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.length != param2) {
              if (param1 == 150) {
                var3 = new bd[param2];
                kf.a(param0, 0, var3, 0, param2);
                stackIn_7_0 = (bd[]) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (bd[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (bd[]) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jh.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static String a(byte param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$11 = null;
        StringBuilder var2 = new StringBuilder(5);
        if (!((param1 ^ -1) <= -1)) {
            param1 = -param1;
            discarded$0 = var2.append('-');
        }
        StringBuilder discarded$1 = var2.append(param1 / 60);
        param1 = param1 % 60;
        if (param0 >= -60) {
            field_eb = (bd[][]) null;
        }
        StringBuilder discarded$10 = var2.append(':');
        if ((param1 ^ -1) > -11) {
            discarded$11 = var2.append('0');
        }
        StringBuilder discarded$12 = var2.append(param1);
        return var2.toString();
    }

    static {
        field_bb = "End game";
        field_db = 0;
        field_ab = 1;
    }
}
