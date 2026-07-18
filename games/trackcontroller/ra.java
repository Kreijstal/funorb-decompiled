/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends sl {
    private boolean field_q;
    private int field_G;
    static int field_z;
    static int field_v;
    private int field_D;
    private int field_u;
    static la field_C;
    private int field_s;
    private int field_F;
    static rl field_y;
    private short[][] field_B;
    static String field_r;
    static String field_w;
    static String[] field_t;
    private ja field_x;
    private boolean field_E;
    private int field_A;
    private u field_p;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        gd.field_x = param0 ? true : false;
        super.a(false, 1000, param0);
        ((ra) this).field_p = nl.a(((ra) this).field_s, ((ra) this).field_E, -257, ((ra) this).field_a - -(26 * ((ra) this).field_D), ((ra) this).field_G, ((ra) this).field_F, ((ra) this).field_u * 26 + ((ra) this).field_f, ((ra) this).field_d[((ra) this).field_u][((ra) this).field_D]);
        if (((ra) this).field_h >= ((ra) this).field_A) {
            if (((ra) this).field_p != null) {
                ((ra) this).field_x.a((fc) (Object) ((ra) this).field_p, (byte) -78);
            }
            var2 = he.field_e.nextInt() & 16777215;
            ((ra) this).field_A = ((ra) this).field_h - -8 + sc.a(var2, -1);
        }
        u var4 = (u) (Object) ((ra) this).field_x.b(2);
        while (var4 != null) {
            var4.d(18132);
            var4 = (u) (Object) ((ra) this).field_x.a(10);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int[] param5, int param6, int[] param7, int param8, int param9, int param10, int param11) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var12_int = param11 * param1;
              var13 = param9;
              if (param4 == -64) {
                break L1;
              } else {
                var17 = null;
                ra.a(-30, -95, 92, -104, (byte) 105, (int[]) null, 27, (int[]) null, -25, 18, -33, 60);
                break L1;
              }
            }
            var14 = -param2;
            L2: while (true) {
              if (var14 >= 0) {
                break L0;
              } else {
                var15 = -param6;
                L3: while (true) {
                  if (var15 >= 0) {
                    L4: {
                      param0 = param0 + param8;
                      param10 = param10 + (-param9 + var13 - -param1);
                      param9 = var13;
                      param3++;
                      if (param3 == param11) {
                        param3 = 0;
                        param10 = param10 - var12_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var14++;
                    continue L2;
                  } else {
                    L5: {
                      int incrementValue$2 = param0;
                      param0++;
                      int incrementValue$3 = param10;
                      param10++;
                      param5[incrementValue$2] = param7[incrementValue$3];
                      param9++;
                      if (param1 != param9) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var15++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var12 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var12;
            stackOut_15_1 = new StringBuilder().append("ra.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param6).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param7 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    final static hg a(int param0, byte[] param1) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new hg(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qk.field_M);
                if (param0 == -502) {
                  break L1;
                } else {
                  field_v = 93;
                  break L1;
                }
              }
              ff.b(126);
              stackOut_5_0 = (hg) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("ra.Q(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_w = null;
        field_t = null;
        if (param0 >= -64) {
            field_r = null;
        }
        field_y = null;
        field_r = null;
        field_C = null;
    }

    ra(byte[][] param0, int[][] param1, int[][] param2, int param3, int param4, boolean param5) {
        super(param5, param3, param4);
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        ((ra) this).field_q = true;
        ((ra) this).field_E = true;
        ((ra) this).field_x = new ja();
        try {
          L0: {
            ((ra) this).a(param1, (byte) 50, param2, param0);
            ((ra) this).field_B = new short[param0.length][param0[0].length];
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= param1.length) {
                break L0;
              } else {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= param1[var7_int].length) {
                    var7_int++;
                    continue L1;
                  } else {
                    if ((64 & param1[var7_int][var8]) == 0) {
                      var8++;
                      continue L2;
                    } else {
                      ((ra) this).field_D = var8;
                      ((ra) this).field_u = var7_int;
                      ((ra) this).field_d[var7_int][var8] = ma.a(64, param1[var7_int][var8]);
                      ((ra) this).field_F = ud.a((byte) -56, ((ra) this).field_d[var7_int][var8]);
                      ((ra) this).field_s = e.a(((ra) this).field_d[var7_int][var8], -1932340400, ((ra) this).field_F);
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("ra.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = TrackController.field_F ? 1 : 0;
        if (param3 > -39) {
            ((ra) this).a(false);
        }
        int var8 = e.field_a[((ra) this).field_d[((ra) this).field_u][((ra) this).field_D]] & (param6 | param4 | param1);
        var8 = this.b(var8, ((ra) this).field_D, 16384, ((ra) this).field_u);
        if (param4 == var8) {
            ((ra) this).field_s = param2;
        } else {
            if (param6 == var8) {
                ((ra) this).field_s = param5;
            } else {
                if (param1 == var8) {
                    ((ra) this).field_s = param0;
                } else {
                    ((ra) this).field_q = false;
                }
            }
        }
    }

    ra(ea param0, int param1, int param2) {
        this(param0.field_o, param0.field_d, param0.field_i, param1, param2, true);
    }

    final void c(byte param0) {
        int var3 = 0;
        short[] var4 = null;
        int var5 = 0;
        int var6 = TrackController.field_F ? 1 : 0;
        short[][] var2 = ((ra) this).field_B;
        if (param0 <= 42) {
            return;
        }
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            for (var5 = 0; var4.length > var5; var5++) {
                var4[var5] = (short)he.field_e.nextInt();
            }
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        u var5 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        super.a(param0, 101);
        if (param1 >= 72) {
          var5 = (u) (Object) ((ra) this).field_x.b(2);
          L0: while (true) {
            if (var5 == null) {
              if (!((ra) this).field_q) {
                return;
              } else {
                L1: {
                  int fieldTemp$1 = ((ra) this).field_G + 1;
                  ((ra) this).field_G = ((ra) this).field_G + 1;
                  if (13 == fieldTemp$1) {
                    L2: {
                      ((ra) this).field_G = -13;
                      if (((ra) this).field_d[((ra) this).field_u][((ra) this).field_D] != 24) {
                        break L2;
                      } else {
                        if (256 != ((ra) this).field_F) {
                          break L2;
                        } else {
                          L3: {
                            ((ra) this).field_F = 512;
                            stackOut_14_0 = this;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (((ra) this).field_E) {
                              stackOut_16_0 = this;
                              stackOut_16_1 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L3;
                            } else {
                              stackOut_15_0 = this;
                              stackOut_15_1 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_17_1 = stackOut_15_1;
                              break L3;
                            }
                          }
                          ((ra) this).field_E = stackIn_17_1 != 0;
                          ((ra) this).field_s = 4096;
                          break L1;
                        }
                      }
                    }
                    L4: {
                      if (((ra) this).field_d[((ra) this).field_u][((ra) this).field_D] != 25) {
                        break L4;
                      } else {
                        if (((ra) this).field_F == 128) {
                          L5: {
                            ((ra) this).field_s = 2048;
                            ((ra) this).field_F = 1024;
                            stackOut_45_0 = this;
                            stackIn_47_0 = stackOut_45_0;
                            stackIn_46_0 = stackOut_45_0;
                            if (((ra) this).field_E) {
                              stackOut_47_0 = this;
                              stackOut_47_1 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              break L5;
                            } else {
                              stackOut_46_0 = this;
                              stackOut_46_1 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_48_1 = stackOut_46_1;
                              break L5;
                            }
                          }
                          ((ra) this).field_E = stackIn_48_1 != 0;
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (((ra) this).field_s != 4096) {
                          break L7;
                        } else {
                          if (((ra) this).field_D == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (((ra) this).field_s != 8192) {
                          break L8;
                        } else {
                          if (~(-1 + ((ra) this).field_o[0].length) == ~((ra) this).field_D) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (16384 != ((ra) this).field_s) {
                          break L9;
                        } else {
                          if (0 == ((ra) this).field_u) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (((ra) this).field_s != 2048) {
                          break L10;
                        } else {
                          if (~((ra) this).field_u != ~(((ra) this).field_o.length + -1)) {
                            break L10;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 = ((ra) this).field_s;
                      if (var3 != 4096) {
                        if (var3 == 8192) {
                          ((ra) this).field_D = ((ra) this).field_D + 1;
                          ((ra) this).field_F = 256;
                          this.a(2048, 4, 8192, -48, 1, 16384, 16);
                          break L1;
                        } else {
                          if (16384 != var3) {
                            if (var3 != 2048) {
                              break L1;
                            } else {
                              ((ra) this).field_F = 1024;
                              ((ra) this).field_u = ((ra) this).field_u + 1;
                              this.a(8192, 32, 2048, -66, 2, 4096, 16);
                              break L1;
                            }
                          } else {
                            ((ra) this).field_u = ((ra) this).field_u - 1;
                            ((ra) this).field_F = 128;
                            this.a(8192, 8, 16384, -123, 2, 4096, 4);
                            break L1;
                          }
                        }
                      } else {
                        ((ra) this).field_F = 512;
                        ((ra) this).field_D = ((ra) this).field_D - 1;
                        this.a(2048, 8, 4096, -41, 1, 16384, 32);
                        break L1;
                      }
                    }
                    ((ra) this).field_G = 13;
                    ((ra) this).field_q = false;
                    return;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              L11: {
                if (var5.e(0)) {
                  break L11;
                } else {
                  var5.a(-26);
                  break L11;
                }
              }
              var5 = (u) (Object) ((ra) this).field_x.a(10);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        var5 = sc.a(param0, -1);
        if (var5 < 2) {
          return param0;
        } else {
          L0: {
            if (var5 <= 2) {
              break L0;
            } else {
              var6 = (int)(Math.random() * (double)var5);
              var7 = 0;
              L1: while (true) {
                if (var7 >= 32) {
                  break L0;
                } else {
                  L2: {
                    if ((1 & param0) != 1) {
                      break L2;
                    } else {
                      int incrementValue$1 = var6;
                      var6--;
                      if (incrementValue$1 == 0) {
                        return 1 << var7;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0 = param0 >> 1;
                  var7++;
                  continue L1;
                }
              }
            }
          }
          var6 = -1;
          var7 = -1;
          var8 = 0;
          L3: while (true) {
            L4: {
              if (var8 >= 32) {
                break L4;
              } else {
                L5: {
                  if (1 != (param0 & 1)) {
                    break L5;
                  } else {
                    if (var7 != -1) {
                      var6 = var8;
                      break L4;
                    } else {
                      var7 = var8;
                      break L5;
                    }
                  }
                }
                param0 = param0 >> 1;
                var8++;
                continue L3;
              }
            }
            L6: {
              var8 = (-var7 + 9) * var7 / 2 + (var6 - 1);
              var9 = 1 << var8;
              if ((var9 & ((ra) this).field_B[param3][param1]) == 0) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L6;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L6;
              }
            }
            L7: {
              var10 = stackIn_23_0;
              ((ra) this).field_B[param3][param1] = (short)ma.a((int) ((ra) this).field_B[param3][param1], var9);
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              stackIn_24_0 = stackOut_23_0;
              if (var10 != 0) {
                stackOut_25_0 = stackIn_25_0;
                stackOut_25_1 = var6;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L7;
              } else {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = var7;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L7;
              }
            }
            return stackIn_26_0 << stackIn_26_1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = -1;
        field_r = "Level ";
        field_w = "Waiting for extra data";
        field_t = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
