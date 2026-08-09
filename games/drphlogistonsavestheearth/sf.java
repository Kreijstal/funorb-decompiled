/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sf {
    cg field_i;
    int field_s;
    private int field_o;
    rf field_g;
    int field_k;
    int field_n;
    cg field_f;
    cg field_a;
    static Random field_d;
    int field_q;
    static long field_j;
    int field_c;
    int field_t;
    cg field_h;
    private boolean field_p;
    static long field_l;
    int field_r;
    cg field_b;
    static int field_e;
    static he[] field_m;

    final void a(int param0, rf param1) {
        int var7_int = 0;
        ch var19 = null;
        int var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        l var17 = new l(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_S + param1.field_x));
        var17.field_o = 16777215;
        this.field_i = (cg) ((Object) var17);
        ch var4 = new ch();
        var17.a(var4, -66);
        var4.field_b = 11711154;
        this.field_s = 3;
        this.field_o = 15658734;
        this.field_g = param1;
        this.field_r = 15658734;
        this.field_k = 5592405;
        var4.field_l = 15658734;
        this.field_q = -1;
        this.field_n = 3;
        this.field_c = 3;
        this.field_t = 3;
        var4.a((byte) 63, 0).b(256, 15658734).a(eg.a((byte) 126, 10066329, 7829367, 8947848), -61);
        var4.a((byte) 112, 1).a(eg.a((byte) 70, 10066329, 13421772, 11184810), -123);
        var4.a((byte) 74, 3).a(eg.a((byte) 98, 7829367, 10066329, 8947848), -87).a((byte) 92, 1).a(-4130, 1);
        nh[] var5 = new nh[9];
        pg var16 = new pg(32, 32);
        pg var18 = var16;
        for (var7_int = 0; var18.field_B.length > var7_int; var7_int++) {
            var16.field_B[var7_int] = 1077952576;
        }
        var5[4] = (nh) ((Object) var18);
        var4.a((byte) 104, 4).a((byte) 125, true).a(var5, -111);
        var4.a((byte) 124, 5).a(dl.a((byte) 58, 0, 65793, 0, 0), -86).a((byte) 108, true).b(256, -1);
        this.field_b = (cg) ((Object) var4);
        ch var6 = new ch(var4, true);
        var6.field_p = 0;
        ch var7 = new ch(var4, true);
        var7.field_p = 0;
        var7.a(0, uh.a((byte) 121, 8947848));
        var7.a((byte) 65, 1).a(uh.a((byte) 121, 11184810), -87).b(256, 2236962);
        this.field_h = (cg) ((Object) new hb(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
        lg discarded$0 = new lg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        fm discarded$1 = new fm(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ch var8 = new ch();
        var17.a(var8, -54);
        var8.a((byte) 69, 0).a(eg.a((byte) 96, 7829367, 10066329, 15658734), -100).b(256, 1118481).c(-1, 85);
        var8.a((byte) 106, 4).a((byte) 117, true).a(var5, -63);
        this.field_f = (cg) ((Object) var8);
        nh[] var9 = new nh[9];
        var9[4] = new nh(2, 1);
        nh[] var10 = new nh[9];
        var10[4] = new nh(1, 2);
        nh dupTemp$2 = var9[4];
        dupTemp$2.field_B = new int[]{6710886, 7829367};
        var10[4].field_B = new int[]{6710886, 7829367};
        ch var11 = new ch();
        ch var12 = new ch();
        var11.a(var9, 0, 120);
        var12.a(var10, 0, 127);
        nh var13 = new nh(7, 4);
        var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ch var14 = new ch(var4, true);
        if (param0 <= 41) {
            return;
        }
        try {
            var14.a(-32680, var13.a());
            var13.f();
            var14 = new ch(var4, true);
            var14.a(-32680, var13.a());
            var13.f();
            var14 = new ch(var4, true);
            var14.a(-32680, var13.a());
            var13.f();
            var19 = new ch(var4, true);
            var19.a(-32680, var13);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "sf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        wj.d(param6, param4, param2, param5, param1, param3);
        if (param0) {
            this.field_b = (cg) null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        wj.g(param3, param5, param2, param1, param4);
        if (param0 != 95) {
            this.field_b = (cg) null;
        }
    }

    final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_p) {
                this.a(param0, param3, param1, (byte) -1);
                break L1;
              } else {
                this.a(param3, (byte) -23, param0, param1);
                break L1;
              }
            }
            L2: {
              if (param2 <= -125) {
                break L2;
              } else {
                this.field_c = -60;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("sf.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_j = -126L;
        }
        field_m = null;
        field_d = null;
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_n + this.field_s;
              var6 = this.field_t + this.field_c;
              var7 = this.field_q;
              if (-1 == var7) {
                var7 = this.field_g.field_S + this.field_g.field_x;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = wj.field_k >> 2067597090;
                var9 = this.field_g.b(param2);
                var11 = 118 / ((param3 - 87) / 38);
                var10 = this.field_g.field_x - -this.field_g.field_S;
                var12 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param2.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var8 < var9) {
                  var14 = var9 / var8;
                  var13 = var8 - -(2 * ((var9 % var8 + var14 + -1) / var14));
                  break L4;
                } else {
                  var13 = var8;
                  break L4;
                }
              }
              L5: {
                if (null != sd.field_b) {
                  break L5;
                } else {
                  sd.field_b = new String[16];
                  break L5;
                }
              }
              var12 = this.field_g.a(param2, new int[]{var13}, sd.field_b);
              var9 = 0;
              var10 = var10 + var7 * (-1 + var12);
              var14 = 0;
              L6: while (true) {
                if (var14 >= var12) {
                  break L2;
                } else {
                  L7: {
                    var15 = this.field_g.b(sd.field_b[var14]);
                    if ((var15 ^ -1) < (var9 ^ -1)) {
                      var9 = var15;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var14++;
                  continue L6;
                }
              }
            }
            L8: {
              var13 = param1;
              if (wj.field_k >= var13 - -var9 + var5_int) {
                break L8;
              } else {
                var13 = -var5_int + (wj.field_k + -var9);
                break L8;
              }
            }
            L9: {
              var14 = -this.field_g.field_L + param0 - -32;
              if (var6 + var10 + var14 > wj.field_c) {
                var14 = -var6 + param0 - var10;
                break L9;
              } else {
                break L9;
              }
            }
            wj.d(var13, var14, var5_int + var9, var10 + var6, this.field_r);
            wj.f(1 + var13, 1 + var14, -2 + var9 - -var5_int, var6 + (var10 - 2), this.field_k);
            this.field_g.a(param2, this.field_s + var13, var14 - -this.field_c, var9, var10, this.field_o, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("sf.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        vb var4_ref_vb = null;
        int var5 = 0;
        bg var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        lh var27 = null;
        var26 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = dh.field_N;
              if (param0 == -4) {
                break L1;
              } else {
                sf.a(88, 112);
                break L1;
              }
            }
            L2: {
              var2 = var27.l(param0 + 31764);
              if (0 != var2) {
                if (1 != var2) {
                  gb.a((Throwable) null, "HS1: " + al.a(-71), param0 + 14);
                  eg.a((byte) 126);
                  break L2;
                } else {
                  var3 = var27.j(-788751192);
                  var4 = var27.a((byte) -53);
                  var6 = (bg) ((Object) gf.field_h.h(param0 ^ 11149));
                  L3: while (true) {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        if (var6.field_i == var3) {
                          break L4;
                        } else {
                          var6 = (bg) ((Object) gf.field_h.e(param0 + 4));
                          continue L3;
                        }
                      }
                    }
                    if (var6 == null) {
                      eg.a((byte) 126);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var6.field_n = var4;
                      var6.a(-16175);
                      break L2;
                    }
                  }
                }
              } else {
                var3 = var27.j(param0 + -788751188);
                var4_ref_vb = (vb) ((Object) je.field_i.h(-11151));
                L5: while (true) {
                  L6: {
                    if (var4_ref_vb == null) {
                      break L6;
                    } else {
                      if (var4_ref_vb.field_i == var3) {
                        break L6;
                      } else {
                        var4_ref_vb = (vb) ((Object) je.field_i.e(0));
                        continue L5;
                      }
                    }
                  }
                  if (var4_ref_vb != null) {
                    L7: {
                      var5 = var27.l(31760);
                      if (0 == var5) {
                        break L7;
                      } else {
                        var6_int = var4_ref_vb.field_h;
                        ac.field_d[0].field_e = null;
                        var7 = var4_ref_vb.field_m;
                        ac.field_d[0].field_a = oa.field_d;
                        ac.field_d[0].field_d = false;
                        var8_int = 1;
                        L8: while (true) {
                          if (var5 <= var8_int) {
                            dupTemp$0 = new String[3][var6_int];
                            var4_ref_vb.field_p = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6_int];
                            dupTemp$1 = new long[3][var6_int];
                            var4_ref_vb.field_j = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var7 * var6_int];
                            var4_ref_vb.field_t = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.l(31760);
                            if (0 >= var18) {
                              break L7;
                            } else {
                              var19 = 0;
                              L9: while (true) {
                                if (var19 >= var18) {
                                  break L7;
                                } else {
                                  L10: {
                                    var20 = var27.l(31760);
                                    var21 = ac.field_d[var20].field_a;
                                    var22 = var27.a((byte) -53);
                                    var24 = var27.field_j;
                                    if (var19 < var6_int) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = ac.field_d[var20].field_e;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          break L10;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var27.h(-99);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L12: {
                                    if (var21 == null) {
                                      break L12;
                                    } else {
                                      if (ta.a(6, var21)) {
                                        var8[1][var13] = oa.field_d;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var27.field_j = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var27.h(89);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var6_int <= var14) {
                                      break L14;
                                    } else {
                                      if (ac.field_d[var20].field_d) {
                                        break L14;
                                      } else {
                                        ac.field_d[var20].field_d = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = ac.field_d[var20].field_e;
                                        var10[2][var14] = var22;
                                        var27.field_j = var24;
                                        var14++;
                                        var25 = 0;
                                        L15: while (true) {
                                          if (var7 <= var25) {
                                            break L14;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var27.h(-14);
                                            var25++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            L16: {
                              ac.field_d[var8_int].field_a = var27.b((byte) -57);
                              ac.field_d[var8_int].field_d = false;
                              if (-2 == (var27.l(31760) ^ -1)) {
                                ac.field_d[var8_int].field_e = var27.b((byte) -64);
                                break L16;
                              } else {
                                ac.field_d[var8_int].field_e = null;
                                break L16;
                              }
                            }
                            var8_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var4_ref_vb.field_r = true;
                    var4_ref_vb.a(param0 + -16171);
                    break L2;
                  } else {
                    eg.a((byte) 126);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "sf.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_g.b(param3);
              var6 = this.field_g.field_L - -this.field_g.field_S;
              var7 = param0;
              if (wj.field_k < 6 + var7 + var5_int) {
                var7 = -var5_int + (wj.field_k - 6);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 32 + -this.field_g.field_L + param2;
              if (6 + var8 - -var6 > wj.field_c) {
                var8 = -6 + (-var6 + wj.field_c);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              wj.d(var7, var8, var5_int + 6, var6 + 6, this.field_o);
              wj.f(var7 + 1, var8 + 1, 4 + var5_int, 4 + var6, this.field_k);
              this.field_g.c(param3, 3 + var7, 3 + var8 - -this.field_g.field_L, this.field_o, -1);
              if (param1 == -23) {
                break L3;
              } else {
                this.field_t = -69;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("sf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 11649) {
            sf.a(118, -101);
        }
        pe.field_b = param0;
    }

    public sf() {
        this.field_p = true;
    }

    static {
        field_j = 0L;
        field_d = new Random(156L);
    }
}
