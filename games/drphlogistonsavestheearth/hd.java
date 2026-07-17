/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends vg {
    boolean field_E;
    private int field_A;
    static String field_O;
    private int field_G;
    private int field_J;
    private nh field_C;
    private nh field_H;
    private int field_K;
    static int field_B;
    private int field_z;
    private nh[] field_D;
    private nh field_F;
    private int field_N;
    static String field_L;
    int field_I;

    final void a(boolean param0, int param1, int param2) {
        ((hd) this).field_G = 8355711 & param1 >> 1;
        ((hd) this).field_K = (param2 & 16711422) >> 1;
        if (param0) {
            Object var5 = null;
            hd.a((byte) 69, (od) null, (bl) null, 110);
        }
        ((hd) this).field_N = param1;
        ((hd) this).field_A = param2;
        int discarded$0 = 2;
        this.f();
    }

    private final nh a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nh var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var14 = new nh(((hd) this).field_J * 2, ((hd) this).field_k);
        aj.a(var14, (byte) 54);
        var5 = ((hd) this).field_k >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((hd) this).field_k) {
            cl.d((byte) -115);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (-1 + 2 * ((hd) this).field_J) % (2 * ((hd) this).field_J);
              var8 = 16711935 & param2;
              var9 = param2 & 65280;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5)) + 128;
              if (256 > var11) {
                stackOut_4_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              wj.g(var7, var6, ((hd) this).field_J, var12);
              var9 = 65280 & param0;
              wj.g(-(2 * ((hd) this).field_J) + var7, var6, ((hd) this).field_J, var12);
              var8 = param0 & 16711935;
              if (var11 < 256) {
                stackOut_7_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            wj.g(var7 - -((hd) this).field_J, var6, ((hd) this).field_J, var12);
            wj.g(var7 + -((hd) this).field_J, var6, ((hd) this).field_J, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        int discarded$0 = 2;
        this.f();
    }

    hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (16711422 & param6) >> 1);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != param1) {
            return;
        }
        int var5 = ((hd) this).field_o + param0;
        if (param2 != -21) {
            ((hd) this).field_C = null;
        }
        int var6 = ((hd) this).field_m + param3;
        this.a((byte) -116, var5, ((hd) this).field_D[0], var6);
        if (((hd) this).field_I < 65536) {
            ib.a(var6, ((hd) this).field_k + var6, (byte) 124, ((hd) this).field_w + var5, (((hd) this).field_w * ((hd) this).field_I >> 16) + var5);
            this.a((byte) -112, var5, ((hd) this).field_D[1], var6);
            cl.d((byte) -117);
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        field_O = null;
        if (param0) {
            hd.b(true);
        }
    }

    final static void a(byte param0, od param1, bl param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new lc();
                ((lc) var18).field_r = param1.l(31760);
                ((lc) var18).field_l = param1.h(-108);
                if (param0 > 95) {
                  ((lc) var18).field_t = new byte[((lc) var18).field_r][][];
                  ((lc) var18).field_p = new int[((lc) var18).field_r];
                  ((lc) var18).field_w = new int[((lc) var18).field_r];
                  ((lc) var18).field_j = new int[((lc) var18).field_r];
                  ((lc) var18).field_n = new il[((lc) var18).field_r];
                  ((lc) var18).field_o = new il[((lc) var18).field_r];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= ((lc) var18).field_r) {
                      g.field_t.a((gi) var18, 255);
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              L5: {
                                var6_int = param1.l(31760);
                                if (var6_int == 0) {
                                  break L5;
                                } else {
                                  if (var6_int == 1) {
                                    break L5;
                                  } else {
                                    if (var6_int == 2) {
                                      break L5;
                                    } else {
                                      L6: {
                                        if (var6_int == 3) {
                                          break L6;
                                        } else {
                                          if (var6_int != 4) {
                                            break L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var20 = param1.b((byte) -93);
                                      var8 = param1.b((byte) -99);
                                      var9 = param1.l(31760);
                                      var10 = new String[var9];
                                      var11_int = 0;
                                      L7: while (true) {
                                        if (~var11_int <= ~var9) {
                                          L8: {
                                            var23 = new byte[var9][];
                                            var22 = var23;
                                            var21 = var22;
                                            var19 = var21;
                                            var11 = var19;
                                            if (var6_int == 3) {
                                              var12_int = 0;
                                              L9: while (true) {
                                                if (var12_int >= var9) {
                                                  break L8;
                                                } else {
                                                  var13 = param1.h(-92);
                                                  var11[var12_int] = new byte[var13];
                                                  param1.b(0, var13, 128, var23[var12_int]);
                                                  var12_int++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                          ((lc) var18).field_j[var5] = var6_int;
                                          var12 = new Class[var9];
                                          var17 = 0;
                                          var13 = var17;
                                          L10: while (true) {
                                            if (var9 <= var17) {
                                              ((lc) var18).field_o[var5] = param2.a(var8, i.a(-32512, var20), var12, (byte) -39);
                                              ((lc) var18).field_t[var5] = var23;
                                              break L3;
                                            } else {
                                              var12[var17] = i.a(-32512, var10[var17]);
                                              var17++;
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          var10[var11_int] = param1.b((byte) -119);
                                          var11_int++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L11: {
                                var15 = param1.b((byte) -77);
                                String dupTemp$1 = param1.b((byte) -101);
                                var16 = dupTemp$1;
                                var8 = dupTemp$1;
                                var9 = 0;
                                if (var6_int != 1) {
                                  break L11;
                                } else {
                                  var9 = param1.h(-124);
                                  break L11;
                                }
                              }
                              ((lc) var18).field_j[var5] = var6_int;
                              ((lc) var18).field_w[var5] = var9;
                              ((lc) var18).field_n[var5] = param2.a(i.a(-32512, var15), var16, (byte) 14);
                              break L4;
                            }
                            break L3;
                          }
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          ((lc) var18).field_p[var5] = -1;
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L15: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          ((lc) var18).field_p[var5] = -4;
                          break L15;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L16: {
                          var6_ref4 = decompiledCaughtException;
                          ((lc) var18).field_p[var5] = -5;
                          break L16;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("hd.B(").append(param0).append(44);
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param1 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L17;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L17;
                }
              }
              L18: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param2 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L18;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L18;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param3 < -127) {
              L1: {
                if (!((hd) this).field_E) {
                  break L1;
                } else {
                  ((hd) this).field_z = ((hd) this).field_z + 1;
                  if (((hd) this).field_z <= 2 * ((hd) this).field_J) {
                    break L1;
                  } else {
                    ((hd) this).field_z = ((hd) this).field_z - 2 * ((hd) this).field_J;
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("hd.I(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final nh a() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = ((hd) this).field_k >> 1;
        nh var3 = new nh(var2, ((hd) this).field_k);
        aj.a(var3, (byte) 85);
        for (var4 = 0; ((hd) this).field_k > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((hd) this).field_k) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                wj.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
            }
        }
        cl.d((byte) -80);
        return var3;
    }

    final static nh[] c() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        nh[] var1 = new nh[bd.field_M];
        for (var2 = 0; var2 < bd.field_M; var2++) {
            var3 = gf.field_o[var2] * qa.field_J[var2];
            var4 = a.field_e[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = aj.field_a[rk.a(255, (int) var4[var6])];
            }
            var1[var2] = new nh(oe.field_b, ih.field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], qa.field_J[var2], var5);
        }
        int discarded$0 = -21;
        oc.a();
        return var1;
    }

    private final void f() {
        ((hd) this).field_D = new nh[]{this.a(((hd) this).field_A, (byte) 43, ((hd) this).field_N), this.a(((hd) this).field_K, (byte) 43, ((hd) this).field_G)};
        int discarded$0 = 101;
        ((hd) this).field_C = this.a();
        ((hd) this).field_H = ((hd) this).field_C.e();
        ((hd) this).field_F = new nh(((hd) this).field_k >> 1, ((hd) this).field_k);
    }

    private final void a(byte param0, int param1, nh param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1 - -((hd) this).field_w;
              if (param0 <= -89) {
                break L1;
              } else {
                ((hd) this).a(false, 41, 72);
                break L1;
              }
            }
            ib.a(param3, param3 - -((hd) this).field_k, (byte) 114, -((hd) this).field_C.field_y + var5_int, param1 - -((hd) this).field_C.field_y);
            var6 = param1 - ((hd) this).field_z;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  cl.d((byte) -67);
                  if (((hd) this).field_C.field_y + param1 >= wj.field_g) {
                    aj.a(((hd) this).field_F, (byte) 84);
                    param2.d(-((hd) this).field_z, 0);
                    param2.d(2 * ((hd) this).field_J + -((hd) this).field_z, 0);
                    ((hd) this).field_H.c(0, 0);
                    cl.d((byte) -120);
                    ((hd) this).field_F.d(param1, param3);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-((hd) this).field_C.field_y + var5_int <= wj.field_b) {
                    aj.a(((hd) this).field_F, (byte) 63);
                    var7 = ((hd) this).field_z + (-((hd) this).field_C.field_y + ((hd) this).field_w);
                    L5: while (true) {
                      if (((hd) this).field_J * 2 >= var7) {
                        param2.d(-var7, 0);
                        param2.d(((hd) this).field_J * 2 + -var7, 0);
                        ((hd) this).field_C.c(0, 0);
                        cl.d((byte) -85);
                        ((hd) this).field_F.d(var5_int + -((hd) this).field_C.field_y, param3);
                        break L4;
                      } else {
                        var7 = var7 - 2 * ((hd) this).field_J;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param2.d(var6, param3);
                var6 = var6 + param2.field_y;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("hd.F(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 41);
        }
    }

    private hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((hd) this).field_A = param6;
        ((hd) this).field_G = param7;
        ((hd) this).field_N = param5;
        ((hd) this).field_K = param8;
        ((hd) this).field_J = param4;
        ((hd) this).a(param1, param3, param0, 16535, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Fire";
        field_L = "End Game";
    }
}
