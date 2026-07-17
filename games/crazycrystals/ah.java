/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private long[] field_n;
    static fc field_a;
    static int field_g;
    static int field_e;
    private byte[] field_c;
    static String field_d;
    private long[] field_k;
    private int field_j;
    private byte[] field_l;
    private long[] field_o;
    private long[] field_h;
    static dl field_b;
    private int field_i;
    private long[] field_m;
    static String field_f;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var6 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((ah) this).field_h[var2] = km.a(((ah) this).field_h[var2], km.a(((ah) this).field_k[var2], ((ah) this).field_n[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L5: while (true) {
                          if (8 <= var3) {
                            ((ah) this).field_o[0] = km.a(((ah) this).field_o[0], so.field_a[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ah) this).field_n[var3] = ((ah) this).field_m[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((ah) this).field_m[var3] = ((ah) this).field_o[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L8: while (true) {
                                  if (var8 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((ah) this).field_m[var3] = km.a(((ah) this).field_m[var3], so.field_b[var8][pf.b(255, (int)(((ah) this).field_n[pf.b(var3 + -var8, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ah) this).field_o[var3] = ((ah) this).field_m[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((ah) this).field_m[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((ah) this).field_m[var3] = km.a(((ah) this).field_m[var3], so.field_b[var4][pf.b((int)(((ah) this).field_o[pf.b(7, -var4 + var3)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((ah) this).field_o[var2] = ((ah) this).field_h[var2];
                ((ah) this).field_n[var2] = km.a(((ah) this).field_k[var2], ((ah) this).field_h[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ah) this).field_k[var2] = km.a(km.a(ao.a((long)((ah) this).field_c[var3 - -6] << 8, 65280L), km.a(km.a(km.a(km.a(ao.a((long)((ah) this).field_c[2 + var3], 255L) << 40, km.a((long)((ah) this).field_c[var3] << 56, ao.a((long)((ah) this).field_c[var3 - -1], 255L) << 48)), ao.a(255L, (long)((ah) this).field_c[var3 + 3]) << 32), ao.a((long)((ah) this).field_c[var3 + 4] << 24, 4278190080L)), ao.a((long)((ah) this).field_c[var3 - -5], 255L) << 16)), ao.a(255L, (long)((ah) this).field_c[var3 + 7]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(ng param0, int param1, int param2, un param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            Class[] var13 = null;
            int var13_int = 0;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            Object var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var15 = CrazyCrystals.field_B;
            try {
              L0: {
                var19 = (Object) (Object) new pi();
                ((pi) var19).field_i = param0.h(255);
                ((pi) var19).field_l = param0.b((byte) -61);
                ((pi) var19).field_g = new int[((pi) var19).field_i];
                var5 = 115 % ((-71 - param2) / 52);
                ((pi) var19).field_m = new gb[((pi) var19).field_i];
                ((pi) var19).field_n = new int[((pi) var19).field_i];
                ((pi) var19).field_f = new int[((pi) var19).field_i];
                ((pi) var19).field_h = new byte[((pi) var19).field_i][][];
                ((pi) var19).field_k = new gb[((pi) var19).field_i];
                var6 = 0;
                L1: while (true) {
                  if (var6 >= ((pi) var19).field_i) {
                    hc.field_b.b(0, (jb) var19);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param0.h(255);
                            if (0 == var7_int) {
                              break L4;
                            } else {
                              if (var7_int == 1) {
                                break L4;
                              } else {
                                if (2 != var7_int) {
                                  if (var7_int == 3) {
                                    var21 = param0.i(122);
                                    var22 = param0.i(115);
                                    var10 = param0.h(255);
                                    var11 = new String[var10];
                                    var12_int = 0;
                                    L5: while (true) {
                                      if (var12_int >= var10) {
                                        L6: {
                                          var25 = new byte[var10][];
                                          var24 = var25;
                                          var23 = var24;
                                          var20 = var23;
                                          var12 = var20;
                                          if (var7_int != 3) {
                                            break L6;
                                          } else {
                                            var13_int = 0;
                                            L7: while (true) {
                                              if (var10 <= var13_int) {
                                                break L6;
                                              } else {
                                                var14 = param0.b((byte) 126);
                                                var12[var13_int] = new byte[var14];
                                                param0.a(var14, var25[var13_int], (byte) -89, 0);
                                                var13_int++;
                                                continue L7;
                                              }
                                            }
                                          }
                                        }
                                        ((pi) var19).field_f[var6] = var7_int;
                                        var13 = new Class[var10];
                                        var18 = 0;
                                        var14 = var18;
                                        L8: while (true) {
                                          if (var18 >= var10) {
                                            ((pi) var19).field_m[var6] = param3.a((byte) -93, nh.a((byte) -126, var21), var13, var22);
                                            ((pi) var19).field_h[var6] = var25;
                                            break L3;
                                          } else {
                                            var13[var18] = nh.a((byte) 121, var11[var18]);
                                            var18++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var11[var12_int] = param0.i(116);
                                        var12_int++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (var7_int != 4) {
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var6++;
                                    decompiledRegionSelector0 = 1;
                                    break L2;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var17 = param0.i(111);
                            var8 = var17;
                            var16 = param0.i(115);
                            var9 = var16;
                            var10 = 0;
                            if (var7_int != 1) {
                              break L10;
                            } else {
                              var10 = param0.b((byte) 126);
                              break L10;
                            }
                          }
                          ((pi) var19).field_f[var6] = var7_int;
                          ((pi) var19).field_g[var6] = var10;
                          ((pi) var19).field_k[var6] = param3.a(22, var16, nh.a((byte) -105, var17));
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((pi) var19).field_n[var6] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((pi) var19).field_n[var6] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        ((pi) var19).field_n[var6] = -5;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var6++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("ah.C(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L16;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L16;
                }
              }
              L17: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param3 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & 8 + -((int)param1 & 7);
              var7 = ((ah) this).field_i & 7;
              var9 = param1;
              if (param0 == -82) {
                break L1;
              } else {
                ((ah) this).field_n = null;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (8L >= param1) {
                    L4: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param2[var5_int] << var6 & 255;
                        ((ah) this).field_c[((ah) this).field_j] = (byte)hm.a((int) ((ah) this).field_c[((ah) this).field_j], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 + (long)var7 < 8L) {
                        ((ah) this).field_i = (int)((long)((ah) this).field_i + param1);
                        break L5;
                      } else {
                        L6: {
                          ((ah) this).field_j = ((ah) this).field_j + 1;
                          param1 = param1 - (long)(8 - var7);
                          ((ah) this).field_i = ((ah) this).field_i + (8 + -var7);
                          if (((ah) this).field_i != 512) {
                            break L6;
                          } else {
                            this.a(18236);
                            ((ah) this).field_j = 0;
                            ((ah) this).field_i = 0;
                            break L6;
                          }
                        }
                        ((ah) this).field_c[((ah) this).field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
                        ((ah) this).field_i = ((ah) this).field_i + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param2[var5_int] << var6 | (param2[var5_int + 1] & 255) >>> -var6 + 8;
                      if (0 > var8) {
                        break L7;
                      } else {
                        if (var8 >= 256) {
                          break L7;
                        } else {
                          L8: {
                            ((ah) this).field_c[((ah) this).field_j] = (byte)hm.a((int) ((ah) this).field_c[((ah) this).field_j], var8 >>> var7);
                            ((ah) this).field_i = ((ah) this).field_i + (8 + -var7);
                            ((ah) this).field_j = ((ah) this).field_j + 1;
                            if (((ah) this).field_i == 512) {
                              this.a(18236);
                              ((ah) this).field_i = 0;
                              ((ah) this).field_j = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          ((ah) this).field_c[((ah) this).field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
                          param1 = param1 - 8L;
                          ((ah) this).field_i = ((ah) this).field_i + var7;
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + (((int)var9 & 255) + (255 & ((ah) this).field_l[var11]));
                ((ah) this).field_l[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ah.F(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static void a(String param0, int param1, int param2, byte param3, int param4) {
        try {
            int var5_int = 108 % ((param3 - 31) / 54);
            aj.a(32293, 32, param1, param4, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ah.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != 40) {
            return;
        }
        field_f = null;
    }

    final static String a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
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
            String stackOut_8_0 = null;
            Object stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) hi.a(param1, "getcookies", -92);
                            if (param0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var8 = null;
                            ah.a(33, (String) null, (java.applet.Applet) null);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var4 = ik.a(var3, (byte) -76, ';');
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 13;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = null;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return (String) (Object) stackIn_14_0;
                    }
                    case 15: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_15_0 = (RuntimeException) var3_ref2;
                        stackOut_15_1 = new StringBuilder().append("ah.J(").append(param0).append(44);
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param1 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param2 == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "null";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        throw dn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
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
              if (param1 == 5236) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_2_0 = ci.field_i.a(7693, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ah.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void a(byte[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              ((ah) this).field_c[((ah) this).field_j] = (byte)hm.a((int) ((ah) this).field_c[((ah) this).field_j], 128 >>> pf.b(7, ((ah) this).field_i));
              ((ah) this).field_j = ((ah) this).field_j + 1;
              if (param1) {
                break L1;
              } else {
                ah.a((byte) -28);
                break L1;
              }
            }
            L2: {
              if (((ah) this).field_j > 32) {
                L3: while (true) {
                  if (64 <= ((ah) this).field_j) {
                    this.a(18236);
                    ((ah) this).field_j = 0;
                    break L2;
                  } else {
                    int fieldTemp$2 = ((ah) this).field_j;
                    ((ah) this).field_j = ((ah) this).field_j + 1;
                    ((ah) this).field_c[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              if (((ah) this).field_j >= 32) {
                eg.a(((ah) this).field_l, 0, ((ah) this).field_c, 32, 32);
                this.a(18236);
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((ah) this).field_h[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[var5 + 1] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[3 + var5] = (byte)(int)(var6 >>> 32);
                    param0[4 + var5] = (byte)(int)(var6 >>> 24);
                    param0[var5 + 5] = (byte)(int)(var6 >>> 16);
                    param0[var5 - -6] = (byte)(int)(var6 >>> 8);
                    param0[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((ah) this).field_j;
                ((ah) this).field_j = ((ah) this).field_j + 1;
                ((ah) this).field_c[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ah.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            Object var6 = null;
            String var7 = null;
            String var8 = null;
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
            Throwable decompiledCaughtException = null;
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
            try {
              L0: {
                to.field_f = param1;
                try {
                  L1: {
                    L2: {
                      if (param0 <= -46) {
                        break L2;
                      } else {
                        var6 = null;
                        byte[] discarded$1 = ah.a((String) null, -38);
                        break L2;
                      }
                    }
                    L3: {
                      var7 = param2.getParameter("cookieprefix");
                      var5 = var7;
                      var5 = var7;
                      var4 = param2.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                      var5 = var8;
                      var5 = var8;
                      if (0 != param1.length()) {
                        var5 = var8 + "; Expires=" + sm.a(lo.a((byte) -101) + 94608000000L, (byte) 126) + "; Max-Age=" + 94608000L;
                        break L3;
                      } else {
                        var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      }
                    }
                    hi.a("document.cookie=\"" + var5 + "\"", param2, (byte) -98);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                hk.a(112, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref;
                stackOut_11_1 = new StringBuilder().append("ah.D(").append(param0).append(44);
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw dn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = CrazyCrystals.field_B;
        for (var2 = 0; var2 < 32; var2++) {
            ((ah) this).field_l[var2] = (byte) 0;
        }
        ((ah) this).field_c[0] = (byte) 0;
        ((ah) this).field_j = 0;
        ((ah) this).field_i = 0;
        var2 = 0;
        int var3 = -31 / ((61 - param0) / 51);
        while (var2 < 8) {
            ((ah) this).field_h[var2] = 0L;
            var2++;
        }
    }

    ah() {
        ((ah) this).field_o = new long[8];
        ((ah) this).field_j = 0;
        ((ah) this).field_c = new byte[64];
        ((ah) this).field_i = 0;
        ((ah) this).field_l = new byte[32];
        ((ah) this).field_h = new long[8];
        ((ah) this).field_m = new long[8];
        ((ah) this).field_n = new long[8];
        ((ah) this).field_k = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_d = "END";
        field_a = new fc(16);
        field_f = "Laser Beam";
    }
}
