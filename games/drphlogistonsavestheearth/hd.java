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
        this.field_G = 8355711 & param1 >> 1363993057;
        this.field_K = (param2 & 16711422) >> -516935839;
        if (param0) {
            bl var5 = (bl) null;
            hd.a((byte) 69, (od) null, (bl) null, 110);
        }
        this.field_N = param1;
        this.field_A = param2;
        this.f(2);
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
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var14 = new nh(this.field_J * 2, this.field_k);
          aj.a(var14, (byte) 54);
          var5 = this.field_k >> -374779711;
          if (param1 == 43) {
            break L0;
          } else {
            this.field_I = 26;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= this.field_k) {
            cl.d((byte) -115);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> 1307763137) * (-1 + 2 * this.field_J) % (2 * this.field_J);
              var8 = 16711935 & param2;
              var9 = param2 & 65280;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5)) + 128;
              if (256 > var11) {
                stackOut_6_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -257208536;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var8 | var9;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              wj.g(var7, var6, this.field_J, var12);
              var9 = 65280 & param0;
              wj.g(-(2 * this.field_J) + var7, var6, this.field_J, var12);
              var8 = param0 & 16711935;
              if ((var11 ^ -1) > -257) {
                stackOut_9_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -1126107128;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var8 | var9;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            wj.g(var7 - -this.field_J, var6, this.field_J, var12);
            wj.g(var7 + -this.field_J, var6, this.field_J, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(2);
    }

    hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -1831115839 & 8355711, (16711422 & param6) >> 830678401);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != param1) {
            return;
        }
        int var5 = this.field_o + param0;
        if (param2 != -21) {
            this.field_C = (nh) null;
        }
        int var6 = this.field_m + param3;
        this.a((byte) -116, var5, this.field_D[0], var6);
        if (-65537 < (this.field_I ^ -1)) {
            ib.a(var6, this.field_k + var6, (byte) 124, this.field_w + var5, (this.field_w * this.field_I >> 1508823600) + var5);
            this.a((byte) -112, var5, this.field_D[1], var6);
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
            byte[] array$2 = null;
            String dupTemp$3 = null;
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
            lc var18_ref = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                var18_ref = new lc();
                var18_ref.field_r = param1.l(31760);
                var18_ref.field_l = param1.h(-108);
                if (param0 > 95) {
                  var18_ref.field_t = new byte[var18_ref.field_r][][];
                  var18_ref.field_p = new int[var18_ref.field_r];
                  var18_ref.field_w = new int[var18_ref.field_r];
                  var18_ref.field_j = new int[var18_ref.field_r];
                  var18_ref.field_n = new il[var18_ref.field_r];
                  var18_ref.field_o = new il[var18_ref.field_r];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var18_ref.field_r) {
                      g.field_t.a(var18_ref, 255);
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              var6_int = param1.l(31760);
                              if (-1 == (var6_int ^ -1)) {
                                break L4;
                              } else {
                                if (-2 == (var6_int ^ -1)) {
                                  break L4;
                                } else {
                                  if (-3 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if ((var6_int ^ -1) == -4) {
                                        break L5;
                                      } else {
                                        if ((var6_int ^ -1) == -5) {
                                          break L5;
                                        } else {
                                          var5++;
                                          decompiledRegionSelector0 = 0;
                                          break L2;
                                        }
                                      }
                                    }
                                    var20 = param1.b((byte) -93);
                                    var8 = param1.b((byte) -99);
                                    var9 = param1.l(31760);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var11_int >= var9) {
                                        L7: {
                                          var21 = new byte[var9][];
                                          var19 = var21;
                                          var11 = var19;
                                          if (var6_int == 3) {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var12_int >= var9) {
                                                break L7;
                                              } else {
                                                var13 = param1.h(-92);
                                                array$2 = new byte[var13];
                                                var11[var12_int] = array$2;
                                                param1.b(0, var13, 128, var21[var12_int]);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        var18_ref.field_j[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var9 <= var17) {
                                            var18_ref.field_o[var5] = param2.a(var8, i.a(-32512, var20), var12, (byte) -39);
                                            var18_ref.field_t[var5] = var21;
                                            break L3;
                                          } else {
                                            var12[var17] = i.a(-32512, var10[var17]);
                                            var17++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param1.b((byte) -119);
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L10: {
                              var15 = param1.b((byte) -77);
                              dupTemp$3 = param1.b((byte) -101);
                              var16 = dupTemp$3;
                              var8 = dupTemp$3;
                              var9 = 0;
                              if (var6_int != 1) {
                                break L10;
                              } else {
                                var9 = param1.h(-124);
                                break L10;
                              }
                            }
                            var18_ref.field_j[var5] = var6_int;
                            var18_ref.field_w[var5] = var9;
                            var18_ref.field_n[var5] = param2.a(i.a(-32512, var15), var16, (byte) 14);
                            break L3;
                          }
                          decompiledRegionSelector0 = 1;
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -1;
                          decompiledRegionSelector0 = 1;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -2;
                          decompiledRegionSelector0 = 1;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -3;
                          decompiledRegionSelector0 = 1;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var18_ref.field_p[var5] = -4;
                          decompiledRegionSelector0 = 1;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var18_ref.field_p[var5] = -5;
                          decompiledRegionSelector0 = 1;
                          break L15;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        continue L1;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) (var4);
                stackOut_36_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param1 == null) {
                  stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param2 == null) {
                  stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
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
        int decompiledRegionSelector0 = 0;
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
                if (!this.field_E) {
                  break L1;
                } else {
                  this.field_z = this.field_z + 1;
                  if (this.field_z <= 2 * this.field_J) {
                    break L1;
                  } else {
                    this.field_z = this.field_z - 2 * this.field_J;
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("hd.I(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final nh a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        nh discarded$0 = null;
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = this.field_k >> 310887617;
        nh var3 = new nh(var2, this.field_k);
        aj.a(var3, (byte) 85);
        for (var4 = 0; this.field_k > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_k) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                wj.a(var5, var4, var8 << 1072321072 | (var8 << 136847336 | var8));
            }
        }
        if (param0 != 101) {
            discarded$0 = this.a(-23, (byte) -84, -68);
        }
        cl.d((byte) -80);
        return var3;
    }

    final static nh[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param0) {
            return (nh[]) null;
        }
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
        oc.a((byte) -21);
        return var1;
    }

    private final void f(int param0) {
        if (param0 != 2) {
            return;
        }
        this.field_D = new nh[]{this.a(this.field_A, (byte) 43, this.field_N), this.a(this.field_K, (byte) 43, this.field_G)};
        this.field_C = this.a((byte) 101);
        this.field_H = this.field_C.e();
        this.field_F = new nh(this.field_k >> 236212737, this.field_k);
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
              var5_int = param1 - -this.field_w;
              if (param0 <= -89) {
                break L1;
              } else {
                this.a(false, 41, 72);
                break L1;
              }
            }
            ib.a(param3, param3 - -this.field_k, (byte) 114, -this.field_C.field_y + var5_int, param1 - -this.field_C.field_y);
            var6 = param1 - this.field_z;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  cl.d((byte) -67);
                  if (this.field_C.field_y + param1 >= wj.field_g) {
                    aj.a(this.field_F, (byte) 84);
                    param2.d(-this.field_z, 0);
                    param2.d(2 * this.field_J + -this.field_z, 0);
                    this.field_H.c(0, 0);
                    cl.d((byte) -120);
                    this.field_F.d(param1, param3);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-this.field_C.field_y + var5_int <= wj.field_b) {
                    aj.a(this.field_F, (byte) 63);
                    var7 = this.field_z + (-this.field_C.field_y + this.field_w);
                    L5: while (true) {
                      if (this.field_J * 2 >= var7) {
                        param2.d(-var7, 0);
                        param2.d(this.field_J * 2 + -var7, 0);
                        this.field_C.c(0, 0);
                        cl.d((byte) -85);
                        this.field_F.d(var5_int + -this.field_C.field_y, param3);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_J;
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
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("hd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    private hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_A = param6;
        this.field_G = param7;
        this.field_N = param5;
        this.field_K = param8;
        this.field_J = param4;
        this.a(param1, param3, param0, 16535, param2);
    }

    static {
        field_O = "Fire";
        field_L = "End Game";
    }
}
