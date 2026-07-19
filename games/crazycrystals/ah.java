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
        un var7 = null;
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
                    L3: {
                      if (param0 == 18236) {
                        break L3;
                      } else {
                        var7 = (un) null;
                        ah.a((ng) null, -120, 88, (un) null);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        this.field_h[var2] = km.a(this.field_h[var2], km.a(this.field_k[var2], this.field_n[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L6: while (true) {
                          if (8 <= var3) {
                            this.field_o[0] = km.a(this.field_o[0], so.field_a[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_n[var3] = this.field_m[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_m[var3] = this.field_o[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var8 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_m[var3] = km.a(this.field_m[var3], so.field_b[var8][pf.b(255, (int)(this.field_n[pf.b(var3 + -var8, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_o[var3] = this.field_m[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_m[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_m[var3] = km.a(this.field_m[var3], so.field_b[var4][pf.b((int)(this.field_o[pf.b(7, -var4 + var3)] >>> var5), 255)]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_o[var2] = this.field_h[var2];
                this.field_n[var2] = km.a(this.field_k[var2], this.field_h[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_k[var2] = km.a(km.a(ao.a((long)this.field_c[var3 - -6] << -354718264, 65280L), km.a(km.a(km.a(km.a(ao.a((long)this.field_c[2 + var3], 255L) << 1169651432, km.a((long)this.field_c[var3] << 591702072, ao.a((long)this.field_c[var3 - -1], 255L) << 1516352624)), ao.a(255L, (long)this.field_c[var3 + 3]) << -244409120), ao.a((long)this.field_c[var3 + 4] << 435423000, 4278190080L)), ao.a((long)this.field_c[var3 - -5], 255L) << -881362352)), ao.a(255L, (long)this.field_c[var3 + 7]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(ng param0, int param1, int param2, un param3) {
        try {
            byte[] array$1 = null;
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
            pi var19_ref = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
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
                var19_ref = new pi();
                var19_ref.field_i = param0.h(255);
                var19_ref.field_l = param0.b((byte) -61);
                var19_ref.field_g = new int[var19_ref.field_i];
                var5 = 115 % ((-71 - param2) / 52);
                var19_ref.field_m = new gb[var19_ref.field_i];
                var19_ref.field_n = new int[var19_ref.field_i];
                var19_ref.field_f = new int[var19_ref.field_i];
                var19_ref.field_h = new byte[var19_ref.field_i][][];
                var19_ref.field_k = new gb[var19_ref.field_i];
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var19_ref.field_i) {
                    hc.field_b.b(0, var19_ref);
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
                              if (-2 == (var7_int ^ -1)) {
                                break L4;
                              } else {
                                if (2 != var7_int) {
                                  L5: {
                                    if (-4 == (var7_int ^ -1)) {
                                      break L5;
                                    } else {
                                      if ((var7_int ^ -1) == -5) {
                                        break L5;
                                      } else {
                                        var6++;
                                        decompiledRegionSelector0 = 1;
                                        break L2;
                                      }
                                    }
                                  }
                                  var21 = param0.i(122);
                                  var22 = param0.i(115);
                                  var10 = param0.h(255);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var12_int >= var10) {
                                      L7: {
                                        var23 = new byte[var10][];
                                        var20 = var23;
                                        var12 = var20;
                                        if ((var7_int ^ -1) != -4) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var10 <= var13_int) {
                                              break L7;
                                            } else {
                                              var14 = param0.b((byte) 126);
                                              array$1 = new byte[var14];
                                              var12[var13_int] = array$1;
                                              param0.a(var14, var23[var13_int], (byte) -89, 0);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var19_ref.field_f[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          var19_ref.field_m[var6] = param3.a((byte) -93, nh.a((byte) -126, var21), var13, var22);
                                          var19_ref.field_h[var6] = var23;
                                          break L3;
                                        } else {
                                          var13[var18] = nh.a((byte) 121, var11[var18]);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param0.i(116);
                                      var12_int++;
                                      continue L6;
                                    }
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
                          var19_ref.field_f[var6] = var7_int;
                          var19_ref.field_g[var6] = var10;
                          var19_ref.field_k[var6] = param3.a(22, var16, nh.a((byte) -105, var17));
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19_ref.field_n[var6] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19_ref.field_n[var6] = -2;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19_ref.field_n[var6] = -3;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19_ref.field_n[var6] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var19_ref.field_n[var6] = -5;
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
                stackOut_34_0 = (RuntimeException) (var4);
                stackOut_34_1 = new StringBuilder().append("ah.C(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L16;
                } else {
                  stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L16;
                }
              }
              L17: {
                stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param3 == null) {
                  stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
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
              var7 = this.field_i & 7;
              var9 = param1;
              if (param0 == -82) {
                break L1;
              } else {
                this.field_n = (long[]) null;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (-1 < (var11 ^ -1)) {
                L3: while (true) {
                  if (8L >= param1) {
                    L4: {
                      if (-1L <= (param1 ^ -1L)) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param2[var5_int] << var6 & 255;
                        this.field_c[this.field_j] = (byte)hm.a((int) this.field_c[this.field_j], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((param1 + (long)var7 ^ -1L) > -9L) {
                        this.field_i = (int)((long)this.field_i + param1);
                        break L5;
                      } else {
                        L6: {
                          this.field_j = this.field_j + 1;
                          param1 = param1 - (long)(8 - var7);
                          this.field_i = this.field_i + (8 + -var7);
                          if (this.field_i != 512) {
                            break L6;
                          } else {
                            this.a(18236);
                            this.field_j = 0;
                            this.field_i = 0;
                            break L6;
                          }
                        }
                        this.field_c[this.field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
                        this.field_i = this.field_i + (int)param1;
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
                        if (-257 >= (var8 ^ -1)) {
                          break L7;
                        } else {
                          L8: {
                            this.field_c[this.field_j] = (byte)hm.a((int) this.field_c[this.field_j], var8 >>> var7);
                            this.field_i = this.field_i + (8 + -var7);
                            this.field_j = this.field_j + 1;
                            if (this.field_i == 512) {
                              this.a(18236);
                              this.field_i = 0;
                              this.field_j = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_c[this.field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
                          param1 = param1 - 8L;
                          this.field_i = this.field_i + var7;
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + (((int)var9 & 255) + (255 & this.field_l[var11]));
                this.field_l[var11] = (byte)var12;
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
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ah.F(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final static void a(String param0, int param1, int param2, byte param3, int param4) {
        try {
            int var5_int = 108 % ((param3 - 31) / 54);
            aj.a(32293, 32, param1, param4, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ah.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
            java.applet.Applet var8 = null;
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
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            Object stackOut_13_0 = null;
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
            var7 = CrazyCrystals.field_B;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = (String) (hi.a(param1, "getcookies", -92));
                      if (param0) {
                        break L2;
                      } else {
                        var8 = (java.applet.Applet) null;
                        ah.a(33, (String) null, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    var4 = ik.a(var3, (byte) -76, ';');
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if (0 > var6) {
                            break L4;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param2)) {
                              stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                              stackIn_9_0 = stackOut_8_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) (var3_ref2);
                stackOut_15_1 = new StringBuilder().append("ah.J(").append(param0).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L6;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L6;
                }
              }
              L7: {
                stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param2 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L7;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L7;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              return stackIn_9_0;
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
                field_f = (String) null;
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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ah.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte[] param0, boolean param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
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
              this.field_c[this.field_j] = (byte)hm.a((int) this.field_c[this.field_j], 128 >>> pf.b(7, this.field_i));
              this.field_j = this.field_j + 1;
              if (param1) {
                break L1;
              } else {
                ah.a((byte) -28);
                break L1;
              }
            }
            L2: {
              if (-33 > (this.field_j ^ -1)) {
                L3: while (true) {
                  if (64 <= this.field_j) {
                    this.a(18236);
                    this.field_j = 0;
                    break L2;
                  } else {
                    fieldTemp$2 = this.field_j;
                    this.field_j = this.field_j + 1;
                    this.field_c[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              if ((this.field_j ^ -1) <= -33) {
                eg.a(this.field_l, 0, this.field_c, 32, 32);
                this.a(18236);
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var6 = this.field_h[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> -1225529032);
                    param0[var5 + 1] = (byte)(int)(var6 >>> 1604689584);
                    param0[2 + var5] = (byte)(int)(var6 >>> -1983510424);
                    param0[3 + var5] = (byte)(int)(var6 >>> 1924117856);
                    param0[4 + var5] = (byte)(int)(var6 >>> 439097048);
                    param0[var5 + 5] = (byte)(int)(var6 >>> 308363280);
                    param0[var5 - -6] = (byte)(int)(var6 >>> -1182762552);
                    param0[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$3 = this.field_j;
                this.field_j = this.field_j + 1;
                this.field_c[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ah.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            byte[] discarded$1 = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
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
                        var6 = (String) null;
                        discarded$1 = ah.a((String) null, -38);
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
                stackOut_11_0 = (RuntimeException) (var3_ref);
                stackOut_11_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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
            this.field_l[var2] = (byte) 0;
        }
        this.field_c[0] = (byte) 0;
        this.field_j = 0;
        this.field_i = 0;
        var2 = 0;
        int var3 = -31 / ((61 - param0) / 51);
        while ((var2 ^ -1) > -9) {
            this.field_h[var2] = 0L;
            var2++;
        }
    }

    ah() {
        this.field_o = new long[8];
        this.field_j = 0;
        this.field_c = new byte[64];
        this.field_i = 0;
        this.field_l = new byte[32];
        this.field_h = new long[8];
        this.field_m = new long[8];
        this.field_n = new long[8];
        this.field_k = new long[8];
    }

    static {
        field_g = 0;
        field_d = "END";
        field_a = new fc(16);
        field_f = "Laser Beam";
    }
}
