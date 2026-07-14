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
        ((hd) this).field_G = 8355711 & param1 >> 1363993057;
        ((hd) this).field_K = (param2 & 16711422) >> -516935839;
        if (param0) {
            Object var5 = null;
            hd.a((byte) 69, (od) null, (bl) null, 110);
        }
        ((hd) this).field_N = param1;
        ((hd) this).field_A = param2;
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
          var14 = new nh(((hd) this).field_J * 2, ((hd) this).field_k);
          aj.a(var14, (byte) 54);
          var5 = ((hd) this).field_k >> -374779711;
          if (param1 == 43) {
            break L0;
          } else {
            ((hd) this).field_I = 26;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((hd) this).field_k) {
            cl.d((byte) -115);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> 1307763137) * (-1 + 2 * ((hd) this).field_J) % (2 * ((hd) this).field_J);
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
              wj.g(var7, var6, ((hd) this).field_J, var12);
              var9 = 65280 & param0;
              wj.g(-(2 * ((hd) this).field_J) + var7, var6, ((hd) this).field_J, var12);
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
            wj.g(var7 - -((hd) this).field_J, var6, ((hd) this).field_J, var12);
            wj.g(var7 + -((hd) this).field_J, var6, ((hd) this).field_J, var12);
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
        int var5 = ((hd) this).field_o + param0;
        if (param2 != -21) {
            ((hd) this).field_C = null;
        }
        int var6 = ((hd) this).field_m + param3;
        this.a((byte) -116, var5, ((hd) this).field_D[0], var6);
        if (-65537 < (((hd) this).field_I ^ -1)) {
            ib.a(var6, ((hd) this).field_k + var6, (byte) 124, ((hd) this).field_w + var5, (((hd) this).field_w * ((hd) this).field_I >> 1508823600) + var5);
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
            lc var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var18 = new lc();
            var18.field_r = param1.l(31760);
            var18.field_l = param1.h(-108);
            if (param0 > 95) {
              var18.field_t = new byte[var18.field_r][][];
              var18.field_p = new int[var18.field_r];
              var18.field_w = new int[var18.field_r];
              var18.field_j = new int[var18.field_r];
              var18.field_n = new il[var18.field_r];
              var18.field_o = new il[var18.field_r];
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_r) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_p[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param1.l(31760);
                        if (-1 == var6_int) {
                          break L2;
                        } else {
                          if (-2 == var6_int) {
                            break L2;
                          } else {
                            if (-3 == (var6_int ^ -1)) {
                              break L2;
                            } else {
                              L3: {
                                if ((var6_int ^ -1) == -4) {
                                  break L3;
                                } else {
                                  if ((var6_int ^ -1) == -5) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param1.b((byte) -93);
                              var8 = param1.b((byte) -99);
                              var9 = param1.l(31760);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var11_int >= var9) {
                                  L5: {
                                    var23 = new byte[var9][];
                                    var22 = var23;
                                    var21 = var22;
                                    var19 = var21;
                                    var11 = var19;
                                    if (var6_int == 3) {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var12_int >= var9) {
                                          break L5;
                                        } else {
                                          var13 = param1.h(-92);
                                          var11[var12_int] = new byte[var13];
                                          param1.b(0, var13, 128, var23[var12_int]);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                  var18.field_j[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_o[var5] = param2.a(var8, i.a(-32512, var20), var12, (byte) -39);
                                      var18.field_t[var5] = var23;
                                      var5++;
                                      break L1;
                                    } else {
                                      var12[var17] = i.a(-32512, var10[var17]);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param1.b((byte) -119);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param1.b((byte) -77);
                        var16 = param1.b((byte) -101);
                        var8 = param1.b((byte) -101);
                        var9 = 0;
                        if (var6_int != 1) {
                          break L8;
                        } else {
                          var9 = param1.h(-124);
                          break L8;
                        }
                      }
                      var18.field_j[var5] = var6_int;
                      var18.field_w[var5] = var9;
                      var18.field_n[var5] = param2.a(i.a(-32512, var15), var16, (byte) 14);
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_p[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_p[var5] = -4;
                    var5++;
                  }
                  continue L0;
                }
              }
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
        if (param3 >= -127) {
            return;
        }
        if (((hd) this).field_E) {
            ((hd) this).field_z = ((hd) this).field_z + 1;
            if (((hd) this).field_z > 2 * ((hd) this).field_J) {
                ((hd) this).field_z = ((hd) this).field_z - 2 * ((hd) this).field_J;
            }
        }
    }

    private final nh a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = ((hd) this).field_k >> 310887617;
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
                wj.a(var5, var4, var8 << 1072321072 | (var8 << 136847336 | var8));
            }
        }
        if (param0 != 101) {
            nh discarded$0 = this.a(-23, (byte) -84, -68);
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
            return null;
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
        ((hd) this).field_D = new nh[]{this.a(((hd) this).field_A, (byte) 43, ((hd) this).field_N), this.a(((hd) this).field_K, (byte) 43, ((hd) this).field_G)};
        ((hd) this).field_C = this.a((byte) 101);
        ((hd) this).field_H = ((hd) this).field_C.e();
        ((hd) this).field_F = new nh(((hd) this).field_k >> 236212737, ((hd) this).field_k);
    }

    private final void a(byte param0, int param1, nh param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var5 = param1 - -((hd) this).field_w;
          if (param0 <= -89) {
            break L0;
          } else {
            ((hd) this).a(false, 41, 72);
            break L0;
          }
        }
        ib.a(param3, param3 - -((hd) this).field_k, (byte) 114, -((hd) this).field_C.field_y + var5, param1 - -((hd) this).field_C.field_y);
        var6 = param1 - ((hd) this).field_z;
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              cl.d((byte) -67);
              if (((hd) this).field_C.field_y + param1 >= wj.field_g) {
                aj.a(((hd) this).field_F, (byte) 84);
                param2.d(-((hd) this).field_z, 0);
                param2.d(2 * ((hd) this).field_J + -((hd) this).field_z, 0);
                ((hd) this).field_H.c(0, 0);
                cl.d((byte) -120);
                ((hd) this).field_F.d(param1, param3);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-((hd) this).field_C.field_y + var5 <= wj.field_b) {
                aj.a(((hd) this).field_F, (byte) 63);
                var7 = ((hd) this).field_z + (-((hd) this).field_C.field_y + ((hd) this).field_w);
                L4: while (true) {
                  if (((hd) this).field_J * 2 >= var7) {
                    param2.d(-var7, 0);
                    param2.d(((hd) this).field_J * 2 + -var7, 0);
                    ((hd) this).field_C.c(0, 0);
                    cl.d((byte) -85);
                    ((hd) this).field_F.d(var5 + -((hd) this).field_C.field_y, param3);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((hd) this).field_J;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param2.d(var6, param3);
            var6 = var6 + param2.field_y;
            continue L1;
          }
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
