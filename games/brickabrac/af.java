/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class af extends km {
    static char[] field_B;
    static int field_u;
    static Boolean field_r;
    static jp[] field_A;
    private String[] field_E;
    static String[] field_s;
    private vl field_C;
    int[] field_t;
    private vl field_v;
    static jp field_D;
    private int[] field_y;
    private vl[] field_z;
    private int field_x;
    private int field_w;

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, -89);
        nf.field_Y = -1;
        i var4 = (i) (Object) ((af) this).field_C.d(-117);
        if (param2 > -52) {
            field_u = 41;
        }
        while (var4 != null) {
            var4.a(-127);
            var4 = (i) (Object) ((af) this).field_C.a((byte) 116);
        }
        var4 = (i) (Object) ((af) this).field_v.d(-113);
        while (var4 != null) {
            var4.a(-128);
            if (var4.field_p == 0) {
                var4.c(1);
            }
            var4 = (i) (Object) ((af) this).field_v.a((byte) 116);
        }
    }

    final void b(byte param0) {
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
        i var15 = null;
        Object var16 = null;
        i var17 = null;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        bi stackIn_18_0 = null;
        bi stackIn_19_0 = null;
        bi stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        bi stackOut_17_0 = null;
        bi stackOut_19_0 = null;
        String stackOut_19_1 = null;
        bi stackOut_18_0 = null;
        String stackOut_18_1 = null;
        var16 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        super.b((byte) -104);
        im.a(550, 5, 88, 5, 140, (byte) -72, 45);
        vi.a((byte) 98, 560, 80, 140, 228);
        var17 = (i) (Object) ((af) this).field_C.d(-94);
        L0: while (true) {
          if (var17 == null) {
            var15 = (i) (Object) ((af) this).field_v.d(-43);
            L1: while (true) {
              if (var15 == null) {
                L2: {
                  sc.b(-81);
                  im.a(146, 5, 146, 5, 233, (byte) -87, 45);
                  im.a(399, 5, 146, 5, 233, (byte) -107, 196);
                  if (nf.field_P != -1) {
                    stackOut_8_0 = nf.field_P;
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  } else {
                    stackOut_7_0 = nf.field_Y;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
                var3 = stackIn_9_0;
                if (param0 < -14) {
                  L3: {
                    var4 = ob.field_D.field_P + ob.field_D.field_B;
                    var5 = nn.field_g.field_B + nn.field_g.field_P;
                    if (-1 != var3) {
                      L4: {
                        if (!eo.a(((af) this).field_t, var3, (byte) -75)) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                      L5: {
                        var6 = stackIn_17_0;
                        nn.field_g.c(field_s[var3], 209, nn.field_g.field_B + 246, 1, -1);
                        stackOut_17_0 = nn.field_g;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var6 == 0) {
                          stackOut_19_0 = (bi) (Object) stackIn_19_0;
                          stackOut_19_1 = po.field_c;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L5;
                        } else {
                          stackOut_18_0 = (bi) (Object) stackIn_18_0;
                          stackOut_18_1 = gi.field_s;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L5;
                        }
                      }
                      L6: {
                        ((bi) (Object) stackIn_20_0).c(stackIn_20_1, 209, 2 * var5 + 248, 2, -1);
                        if (var6 != 0) {
                          si.field_c[var3].a(54, 242);
                          break L6;
                        } else {
                          vq.field_F.c(54, 242);
                          break L6;
                        }
                      }
                      var7 = 246 + 5 * var5 / 2;
                      var8 = var7 + var5;
                      var9 = var7 - (-(7 * var4) - -ob.field_D.field_F);
                      var10 = ob.field_D.a(rd.a(mp.field_bc[var3], new String[1], (byte) 103), ((af) this).field_y, ((af) this).field_E);
                      var11 = 0;
                      L7: while (true) {
                        if (var11 >= var10) {
                          ob.field_D.c(mq.field_c + on.field_D[var3], 209, var9 + (-(2 * ob.field_D.field_P) - nj.field_z.field_C / 2), 2, -1);
                          ob.field_D.c(fl.field_m, 209, -nn.field_g.field_P + var9, 2, -1);
                          var11 = ob.field_D.c(fl.field_m) + 209;
                          var12 = -(nj.field_z.field_z / 2) + var9;
                          var13 = 0;
                          L8: while (true) {
                            if (fq.field_e[var3] <= var13) {
                              break L3;
                            } else {
                              nj.field_z.a(var11, var12);
                              var11 = var11 + nj.field_z.field_D / 3;
                              var13++;
                              continue L8;
                            }
                          }
                        } else {
                          ob.field_D.c(((af) this).field_E[var11], 209, var8, 2, -1);
                          var8 = var8 + var4;
                          var11++;
                          continue L7;
                        }
                      }
                    } else {
                      nn.field_g.c(jo.field_h, 209, 246 + nn.field_g.field_B, 2, -1);
                      if (!og.h(-26090)) {
                        break L3;
                      } else {
                        var6 = 246 + var5 * 3;
                        ob.field_D.c(na.field_N, 209, var6, 2, -1);
                        break L3;
                      }
                    }
                  }
                  al.a(((af) this).field_a, 19);
                  ((af) this).a(0);
                  return;
                } else {
                  return;
                }
              } else {
                var15.a((byte) 107);
                var15 = (i) (Object) ((af) this).field_v.a((byte) 116);
                continue L1;
              }
            }
          } else {
            var17.a((byte) 103);
            var17 = (i) (Object) ((af) this).field_C.a((byte) 116);
            continue L0;
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param0)) {
            var4 += 4;
        }
        int var5 = 0;
        if (!(!param1)) {
            var4 += 2;
        }
        return gn.field_D[var4];
    }

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (((af) this).field_h.field_j < 0) {
            ((af) this).field_h.a(false, 2);
            break L0;
          } else {
            if (0 == ((af) this).field_h.field_j) {
              L1: {
                if (param1 == 98) {
                  break L1;
                } else {
                  if (99 != param1) {
                    L2: {
                      if (param1 == 96) {
                        break L2;
                      } else {
                        if (param1 == 97) {
                          break L2;
                        } else {
                          break L0;
                        }
                      }
                    }
                    if (((af) this).a((byte) 106, 1)) {
                      ((af) this).field_h.a(false, 1);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              ((af) this).field_h.a(false, 2);
              break L0;
            } else {
              if (((af) this).field_h.field_j == 1) {
                L3: {
                  if (param1 == 98) {
                    break L3;
                  } else {
                    if (param1 == 99) {
                      break L3;
                    } else {
                      L4: {
                        if (param1 == 96) {
                          break L4;
                        } else {
                          if (param1 == 97) {
                            break L4;
                          } else {
                            break L0;
                          }
                        }
                      }
                      if (!((af) this).a((byte) 121, 0)) {
                        break L0;
                      } else {
                        ((af) this).field_h.a(false, 0);
                        break L0;
                      }
                    }
                  }
                }
                ((af) this).field_h.a(false, 2);
                break L0;
              } else {
                if (((af) this).field_h.field_j != 2) {
                  if (((af) this).field_h.field_j == 3) {
                    L5: {
                      if (param1 == 97) {
                        break L5;
                      } else {
                        if (96 == param1) {
                          break L5;
                        } else {
                          L6: {
                            if (98 == param1) {
                              break L6;
                            } else {
                              if (param1 == 99) {
                                break L6;
                              } else {
                                break L0;
                              }
                            }
                          }
                          if (!((af) this).a((byte) 124, 0)) {
                            ((af) this).field_h.a(false, 1);
                            break L0;
                          } else {
                            ((af) this).field_h.a(false, 0);
                            break L0;
                          }
                        }
                      }
                    }
                    ((af) this).field_h.a(false, 2);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  L7: {
                    if (param1 == 97) {
                      break L7;
                    } else {
                      if (param1 != 96) {
                        L8: {
                          if (param1 == 98) {
                            break L8;
                          } else {
                            if (param1 == 99) {
                              break L8;
                            } else {
                              break L0;
                            }
                          }
                        }
                        if (!((af) this).a((byte) 103, 0)) {
                          ((af) this).field_h.a(false, 1);
                          break L0;
                        } else {
                          ((af) this).field_h.a(false, 0);
                          break L0;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (((af) this).field_m.length == 4) {
                    ((af) this).field_h.a(false, 3);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L9: {
          if (param0 == -120) {
            break L9;
          } else {
            var6 = null;
            af.a((jp) null, -23, 26, 101, 46, -121, -33, (jp) null, 118, (jp) null, -100);
            break L9;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 118) {
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
            L2: {
              if (jf.a(0, param1) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("af.SA(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    abstract boolean a(int param0, byte param1);

    public static void f(byte param0) {
        field_A = null;
        field_D = null;
        field_r = null;
        field_s = null;
        field_B = null;
    }

    final static void a(jp param0, int param1, int param2, int param3, int param4, int param5, int param6, jp param7, int param8, jp param9, int param10) {
        RuntimeException var11 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param5 == 0) {
              L1: {
                param7.d((5 * param2 >> 16) + param1 - -((param4 + -param7.field_x) / 2), param10);
                if (param8 == 1) {
                  lb.a(100 / param8 << 4, 1600, 64, 128, sq.field_b);
                  lb.a(200 / param8 << 4, 800, 48, 192, sq.field_b);
                  lb.a(300 / param8 << 4, 1920, 64, 128, sq.field_b);
                  lb.a(370 / param8 << 4, 2720, 48, 128, sq.field_b);
                  lb.a(480 / param8 << 4, 1120, 48, 192, sq.field_b);
                  break L1;
                } else {
                  break L1;
                }
              }
              param9.c(-(220 / param8) + (10 * param2 >> 16) + (param1 + (param4 + -param9.field_x) / 2), -param9.field_z + (480 - -(37 / param8)));
              param0.c(param1 + ((param4 + -param0.field_x) / 2 - -(20 * param2 >> 16)) + -(5 / param8), 480 - param0.field_z);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var11;
            stackOut_7_1 = new StringBuilder().append("af.MA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param7 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param8).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param9 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param10 + ')');
        }
    }

    af(int param0, int[] param1) {
        super(param0, 38, 460, 402, 35, param1);
        int var3_int = 0;
        ((af) this).field_E = new String[24];
        ((af) this).field_C = new vl();
        ((af) this).field_v = new vl();
        try {
            ((af) this).field_z = new vl[1 - -(field_s.length / 16)];
            for (var3_int = 0; ((af) this).field_z.length > var3_int; var3_int++) {
                ((af) this).field_z[var3_int] = new vl();
            }
            ((af) this).field_y = new int[]{373};
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "af.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            field_D = null;
        }
        return ((af) this).field_p;
    }

    final void d(byte param0) {
        this.g((byte) -121);
        if (param0 != 79) {
            ((af) this).field_E = null;
        }
    }

    private final void g(byte param0) {
        this.a(32367, ((af) this).field_C);
        this.a(32367, ((af) this).field_v);
    }

    final boolean a(byte param0, int param1) {
        int var3 = ((af) this).field_m[param1].field_f;
        if (var3 == 44) {
            if (((af) this).field_w == 0) {
                return false;
            }
        }
        if (var3 == 45) {
            if (((af) this).field_x - 1 <= ((af) this).field_w) {
                return false;
            }
        }
        if (param0 < 80) {
            field_u = -122;
            return true;
        }
        return true;
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, 2, 110);
        ((af) this).field_w = 0;
        ((af) this).field_x = 0;
        nf.field_Y = -1;
        nf.field_P = -1;
        ((af) this).field_z[((af) this).field_x].c((byte) -114);
        if (param2 > 96) {
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (var5 >= field_s.length) {
              L1: {
                if (!((af) this).field_z[((af) this).field_x].a(false)) {
                  ((af) this).field_x = ((af) this).field_x + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.a(2, 0, ((af) this).field_z[((af) this).field_w]);
              return;
            } else {
              if (!((af) this).a(var5, (byte) 38)) {
                ((af) this).field_z[((af) this).field_x].a((nm) (Object) new kq(var5), (byte) 3);
                var4++;
                if (var4 == 16) {
                  var4 = 0;
                  int fieldTemp$1 = ((af) this).field_x + 1;
                  ((af) this).field_x = ((af) this).field_x + 1;
                  ((af) this).field_z[fieldTemp$1].c((byte) -46);
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, vl param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        i var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kq var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            nf.field_P = -1;
            var4_int = 640 * param1;
            this.a(32367, ((af) this).field_v);
            var5 = (i) (Object) ((af) this).field_C.c(3);
            L1: while (true) {
              if (var5 == null) {
                var6 = 82;
                var7 = (24 + var6 * 2) / 2;
                var8 = 150;
                var9 = (kq) (Object) param2.d(-74);
                var10 = 0;
                L2: while (true) {
                  if (var9 == null) {
                    break L0;
                  } else {
                    ((af) this).field_C.a((nm) (Object) cn.a(-var4_int, var8, 32, (af) this, 32, var10, var4_int + var7, var9.field_p, 1), (byte) 3);
                    rk.field_Qb = rk.field_Qb | 1 << var10;
                    var9 = (kq) (Object) param2.a((byte) 116);
                    var10++;
                    if (var10 == 8) {
                      var8 += 35;
                      var7 = (80 + var6 * 2) / 2;
                      continue L2;
                    } else {
                      var7 += 56;
                      continue L2;
                    }
                  }
                }
              } else {
                var5.field_x = -1;
                var5.field_p = -var4_int;
                ((af) this).field_v.a((nm) (Object) var5, (byte) 3);
                var5 = (i) (Object) ((af) this).field_C.c(3);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("af.RA(").append(2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void a(int param0, vl param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        i var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var5 = (i) (Object) param1.c(3);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.c(1);
                var5 = (i) (Object) param1.c(3);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("af.G(").append(32367).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 == 123) {
          L0: {
            var8 = ((af) this).field_m[param0];
            var5 = var8.field_f;
            var6 = var5;
            if (var6 != 44) {
              if (45 != var6) {
                return super.a(param0, param1, (byte) 123);
              } else {
                if (!((af) this).field_h.a((byte) 113)) {
                  break L0;
                } else {
                  if (!((af) this).a((byte) 90, param0)) {
                    break L0;
                  } else {
                    if (rk.field_Qb != 0) {
                      break L0;
                    } else {
                      L1: {
                        int fieldTemp$2 = ((af) this).field_w + 1;
                        ((af) this).field_w = ((af) this).field_w + 1;
                        if (fieldTemp$2 < ((af) this).field_x) {
                          break L1;
                        } else {
                          ((af) this).field_w = ((af) this).field_x + -1;
                          break L1;
                        }
                      }
                      L2: {
                        this.a(2, 1, ((af) this).field_z[((af) this).field_w]);
                        if (((af) this).a((byte) 86, 1)) {
                          break L2;
                        } else {
                          ((af) this).field_h.a(false, 0);
                          break L2;
                        }
                      }
                      return true;
                    }
                  }
                }
              }
            } else {
              if (!((af) this).field_h.a((byte) 113)) {
                break L0;
              } else {
                if (!((af) this).a((byte) 86, param0)) {
                  break L0;
                } else {
                  if (rk.field_Qb == 0) {
                    L3: {
                      int fieldTemp$3 = ((af) this).field_w - 1;
                      ((af) this).field_w = ((af) this).field_w - 1;
                      if (fieldTemp$3 >= 0) {
                        break L3;
                      } else {
                        ((af) this).field_w = 0;
                        break L3;
                      }
                    }
                    L4: {
                      this.a(2, -1, ((af) this).field_z[((af) this).field_w]);
                      if (!((af) this).a((byte) 83, 0)) {
                        ((af) this).field_h.a(false, 1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    final void b(boolean param0) {
        q var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        q var6_ref_q = null;
        String var7 = null;
        int var8 = 0;
        q var9 = null;
        String var10 = null;
        q var11 = null;
        String stackIn_7_0 = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          var9 = ((af) this).field_m[0];
          var9.field_a = 145;
          var9.field_c = 50;
          var9.field_j = 25;
          var9.field_d = 78;
          if (param0) {
            break L0;
          } else {
            boolean discarded$2 = ((af) this).a((byte) 110, 75);
            break L0;
          }
        }
        var3 = ((af) this).field_m[1];
        var3.field_c = -5 - (var9.field_j - 595);
        var3.field_a = var9.field_a;
        var3.field_d = var9.field_d;
        var3.field_j = var9.field_j;
        var4 = 0;
        var5 = 2;
        L1: while (true) {
          if (((af) this).field_m.length <= var5) {
            var5 = (640 + -var4) / 2;
            var6 = 2;
            L2: while (true) {
              if (var6 >= ((af) this).field_m.length) {
                return;
              } else {
                var11 = ((af) this).field_m[var6];
                var11.field_c = var5;
                var11.field_a = ((af) this).b(var6, 1);
                var11.field_d = ((af) this).b((byte) -7, var6);
                var5 = var5 + (10 - -var11.field_j);
                var6++;
                continue L2;
              }
            }
          } else {
            L3: {
              var6_ref_q = ((af) this).field_m[var5];
              if (var6_ref_q.field_f == 8) {
                stackOut_6_0 = ((af) this).e((byte) 105);
                stackIn_7_0 = stackOut_6_0;
                break L3;
              } else {
                stackOut_5_0 = ag.field_D[var6_ref_q.field_f];
                stackIn_7_0 = stackOut_5_0;
                break L3;
              }
            }
            var10 = stackIn_7_0;
            var7 = var10;
            int dupTemp$3 = 30 + nn.field_g.c(var10);
            var6_ref_q.field_j = dupTemp$3;
            var4 = var4 + dupTemp$3;
            if (var5 > 3) {
              var4 += 10;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_s = new String[]{"Brick Destroyer", "Brick Assassin", "Brick Slayer", "Chip Away at the Stone", "Stone Idol", "Stone Circle", "Stone Mason", "Another Brick in the Wall", "Follow the Yellow Brick Road", "Bounce Master Junior", "Bounce Master Senior", "Master Builder", "Bricking It", "Chip Off the Old Brick", "Brick Me (Baby) One More Time", "Gone with the Brick", "Rentabrick", "The House That Jack Built", "Blow Our House Down", "Stone Cold Crazy", "Dry Stone Wall", "Stone Destroyer", "Somewhere Over the Rainbow", "Fierce Brickster", "Expert Brickster", "Master Brickster", "Comeback Kid", "Reluctant Charger", "Crazy Fool", "Brickicide", "Glutton for Punishment", "And Still You Did Not Learn", "It's So Easy", "Too Much of a Good Thing", "Covent Garden", "Marble Arch", "Nelson's Column", "Tower of London", "Buckingham Palace", "Brick Crusher", "Romancing the Brick", "Ghost in the Brick"};
    }
}
