/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static String field_g;
    private int field_h;
    static String field_e;
    static long field_c;
    private int field_d;
    private ew field_f;
    static int field_b;
    static String field_a;
    private ew field_i;

    public static void b(int param0) {
        if (param0 != -1) {
            field_g = (String) null;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final boolean a(byte param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
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
            var5 = this.field_i;
            synchronized (var5) {
              L1: {
                L2: {
                  if (-1 < (param2 ^ -1)) {
                    break L2;
                  } else {
                    if (param2 <= this.field_d) {
                      L3: {
                        var6 = this.a(true, 16, param1, param3, param2) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(false, 16, param1, param3, param2) ? 1 : 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (param0 == 66) {
                          break L4;
                        } else {
                          this.field_h = -36;
                          break L4;
                        }
                      }
                      stackOut_9_0 = var6;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("qh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final byte[] a(int param0, int param1) {
        try {
            int incrementValue$1 = 0;
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_52_0 = null;
            var18 = Kickabout.field_G;
            var3 = this.field_i;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(6 + 6 * param0) <= this.field_f.a(param1 + -65162)) {
                    this.field_f.a((byte) 4, (long)(param0 * 6));
                    this.field_f.a(6, 0, (byte) 93, id.field_u);
                    var4_int = (param1 & id.field_u[1] << 1517957576) + ((255 & id.field_u[0]) << -712151664) + (id.field_u[2] & 255);
                    var5 = (255 & id.field_u[5]) + (((255 & id.field_u[3]) << 328902928) + (id.field_u[4] << 1810700616 & 65280));
                    if (0 <= var4_int) {
                      if (this.field_d >= var4_int) {
                        if ((var5 ^ -1) < -1) {
                          if ((long)var5 <= this.field_i.a(-76) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L1: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_49_0 = (byte[]) (var6);
                                stackIn_50_0 = stackOut_49_0;
                                stackOut_50_0 = (byte[]) ((Object) stackIn_50_0);
                                stackIn_51_0 = stackOut_50_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_i.a((byte) 4, (long)(520 * var5));
                                    var9 = var4_int + -var7;
                                    if (param0 > 65535) {
                                      L3: {
                                        var14 = 10;
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                      this.field_i.a(var14 + var9, 0, (byte) 113, id.field_u);
                                      var13 = 255 & id.field_u[9];
                                      var12 = (id.field_u[8] & 255) + ((id.field_u[7] & 255) << 2087458600) + ((255 & id.field_u[6]) << -328254032);
                                      var10 = (16711680 & id.field_u[1] << -413209424) + (((id.field_u[0] & 255) << 1125560248) - (-(id.field_u[2] << -1682361976 & 65280) - (id.field_u[3] & 255)));
                                      var11 = (id.field_u[4] << 1867160552 & 65280) - -(255 & id.field_u[5]);
                                      break L2;
                                    } else {
                                      L4: {
                                        var14 = 8;
                                        if ((var9 ^ -1) < -513) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      this.field_i.a(var14 + var9, 0, (byte) 116, id.field_u);
                                      var11 = (id.field_u[2] << -749531864 & 65280) + (255 & id.field_u[3]);
                                      var10 = (id.field_u[0] << 1897722952 & 65280) + (255 & id.field_u[1]);
                                      var13 = 255 & id.field_u[7];
                                      var12 = (id.field_u[4] << -234944880 & 16711680) - (-(65280 & id.field_u[5] << 1961718952) - (255 & id.field_u[6]));
                                      break L2;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var8 == var11) {
                                      if (this.field_h == var13) {
                                        if (-1 >= (var12 ^ -1)) {
                                          if ((this.field_i.a(58) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L5: while (true) {
                                              if (var15 <= var16) {
                                                continue L1;
                                              } else {
                                                incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = id.field_u[var16];
                                                var16++;
                                                continue L5;
                                              }
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
                                            decompiledRegionSelector0 = 2;
                                            break L0;
                                          }
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackOut_20_0 = null;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_52_0 = null;
                stackIn_53_0 = stackOut_52_0;
                return (byte[]) ((Object) stackIn_53_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_16_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_22_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_45_0);
                  } else {
                    return stackIn_51_0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, tv param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tv var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (null == param1.field_g) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (0 != param1.field_j) {
                    break L2;
                  } else {
                    if (-1 == (param1.field_p ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (vb.field_j <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = fu.field_b[var2_int];
                      if ((var3.field_c ^ -1) != -3) {
                        break L4;
                      } else {
                        if (var3.field_j != param1.field_j) {
                          break L4;
                        } else {
                          if (var3.field_p == param1.field_p) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_r != null) {
                  ol.field_z = param1.field_c;
                  mv.field_a = param1.field_q;
                  nr.field_r = param1.field_d;
                  qs.field_S = param1.field_r;
                  break L5;
                } else {
                  break L5;
                }
              }
              var2_int = 50 % ((-10 - param0) / 54);
              ec.a(true, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("qh.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
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

    private final boolean a(boolean param0, int param1, int param2, byte[] param3, int param4) {
        try {
            Object var6 = null;
            RuntimeException var6_ref = null;
            Object var6_ref2 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            var16 = Kickabout.field_G;
            try {
              var6_ref2 = this.field_i;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param0) {
                        var7_int = (int)((519L + this.field_i.a(121)) / 520L);
                        if (0 == var7_int) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if ((long)(6 + param2 * 6) <= this.field_f.a(param1 ^ -115)) {
                          L2: {
                            this.field_f.a((byte) 4, (long)(6 * param2));
                            this.field_f.a(6, 0, (byte) 103, id.field_u);
                            var7_int = (255 & id.field_u[5]) + ((id.field_u[3] & 255) << 133634096) - -((id.field_u[4] & 255) << -232133400);
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if (((long)var7_int ^ -1L) < (this.field_i.a(107) / 520L ^ -1L)) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      id.field_u[0] = (byte)(param4 >> -721577328);
                      id.field_u[3] = (byte)(var7_int >> 1172355440);
                      id.field_u[4] = (byte)(var7_int >> 436222504);
                      id.field_u[5] = (byte)var7_int;
                      id.field_u[1] = (byte)(param4 >> 2047810440);
                      if (param1 == 16) {
                        break L3;
                      } else {
                        qh.a(-25);
                        break L3;
                      }
                    }
                    id.field_u[2] = (byte)param4;
                    this.field_f.a((byte) 4, (long)(6 * param2));
                    this.field_f.a(0, 56, 6, id.field_u);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var8 >= param4) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param0) {
                              break L6;
                            } else {
                              L7: {
                                this.field_i.a((byte) 4, (long)(520 * var7_int));
                                if (param2 <= 65535) {
                                  try {
                                    L8: {
                                      this.field_i.a(8, 0, (byte) 118, id.field_u);
                                      decompiledRegionSelector0 = 0;
                                      break L8;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var11 = (id.field_u[1] & 255) + (65280 & id.field_u[0] << -2084796664);
                                    var10 = (id.field_u[6] & 255) + (((id.field_u[5] & 255) << 1986438152) + (16711680 & id.field_u[4] << 1112670544));
                                    var13 = id.field_u[7] & 255;
                                    var12 = ((id.field_u[2] & 255) << -93967800) - -(id.field_u[3] & 255);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_i.a(10, 0, (byte) 104, id.field_u);
                                      decompiledRegionSelector1 = 0;
                                      break L10;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var12 = ((id.field_u[4] & 255) << 1957197736) - -(255 & id.field_u[5]);
                                    var13 = id.field_u[9] & 255;
                                    var11 = (65280 & id.field_u[2] << -936734040) + ((255 & id.field_u[1]) << -2127776720) + (-16777216 & id.field_u[0] << 1165292792) + (id.field_u[3] & 255);
                                    var10 = ((255 & id.field_u[6]) << -418167056) + ((id.field_u[7] & 255) << -1211325400) - -(id.field_u[8] & 255);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param2) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (var13 != this.field_h) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if ((var10 ^ -1) > -1) {
                                          break L13;
                                        } else {
                                          if ((long)var10 <= this.field_i.a(param1 + -117) / 520L) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      stackOut_42_0 = stackIn_42_0;
                                      stackIn_43_0 = stackOut_42_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L14: {
                            if (var10 == 0) {
                              L15: {
                                param0 = false;
                                var10 = (int)((519L + this.field_i.a(97)) / 520L);
                                if (var10 != 0) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                              if (var10 != var7_int) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                          L16: {
                            if ((-var8 + param4 ^ -1) < -513) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if (-65536 > (param2 ^ -1)) {
                              L18: {
                                id.field_u[3] = (byte)param2;
                                id.field_u[2] = (byte)(param2 >> -972193080);
                                id.field_u[1] = (byte)(param2 >> 1455599248);
                                id.field_u[5] = (byte)var9;
                                id.field_u[6] = (byte)(var10 >> 110837104);
                                id.field_u[4] = (byte)(var9 >> 465226248);
                                id.field_u[8] = (byte)var10;
                                id.field_u[0] = (byte)(param2 >> -1734809000);
                                id.field_u[7] = (byte)(var10 >> -255869240);
                                id.field_u[9] = (byte)this.field_h;
                                this.field_i.a((byte) 4, (long)(520 * var7_int));
                                this.field_i.a(0, 125, 10, id.field_u);
                                var11 = param4 - var8;
                                if (510 >= var11) {
                                  break L18;
                                } else {
                                  var11 = 510;
                                  break L18;
                                }
                              }
                              this.field_i.a(var8, param1 + 84, var11, param3);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                id.field_u[4] = (byte)(var10 >> -1072376400);
                                id.field_u[3] = (byte)var9;
                                id.field_u[2] = (byte)(var9 >> -1390729208);
                                id.field_u[1] = (byte)param2;
                                id.field_u[0] = (byte)(param2 >> -1516296632);
                                id.field_u[7] = (byte)this.field_h;
                                id.field_u[6] = (byte)var10;
                                id.field_u[5] = (byte)(var10 >> -362958584);
                                this.field_i.a((byte) 4, (long)(520 * var7_int));
                                this.field_i.a(0, 76, 8, id.field_u);
                                var11 = -var8 + param4;
                                if ((var11 ^ -1) >= -513) {
                                  break L19;
                                } else {
                                  var11 = 512;
                                  break L19;
                                }
                              }
                              this.field_i.a(var8, 102, var11, param3);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      stackOut_61_0 = stackIn_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  return stackIn_64_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_37_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_43_0 != 0;
                      } else {
                        return stackIn_62_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) (var6_ref);
                stackOut_67_1 = new StringBuilder().append("qh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param3 == null) {
                  stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L20;
                } else {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L20;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cf var5 = null;
        bc var6 = null;
        int var7 = 0;
        tf var8 = null;
        cf var9 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var8 = new tf();
              if (jh.field_Hb.field_Db.field_jb == null) {
                break L1;
              } else {
                jh.field_Hb.field_Db.field_jb.a(-17481, var8);
                break L1;
              }
            }
            L2: {
              var2 = mf.field_Gb;
              if ((var2 ^ -1) <= -1) {
                break L2;
              } else {
                var2 = 0;
                break L2;
              }
            }
            var3 = je.field_k;
            var4 = 5 - -(var2 * 18);
            L3: while (true) {
              L4: {
                if (jh.field_Hb.field_Gb.field_mb - (-15 + jh.field_Hb.field_Db.field_J) <= var4) {
                  break L4;
                } else {
                  if (pu.field_Db[var3] <= var2) {
                    break L4;
                  } else {
                    var5 = (cf) ((Object) var8.g(24009));
                    L5: while (true) {
                      L6: {
                        if (var5 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (var5.field_yb != var2) {
                              break L7;
                            } else {
                              if (var5.field_Ab == var3) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var5 = (cf) ((Object) var8.c(33));
                          continue L5;
                        }
                      }
                      L8: {
                        if (var5 != null) {
                          break L8;
                        } else {
                          var9 = cu.a(false, 0, var3, var2, false, false);
                          var5 = var9;
                          var9.a(true, 327, 5, var4, 16);
                          break L8;
                        }
                      }
                      jh.field_Hb.field_Db.a((byte) -109, (hd) (var5));
                      var6 = bf.field_y.a(var2, (byte) 116, var3);
                      var4 += 18;
                      var2++;
                      if (var6 == null) {
                        var5.h((byte) 104);
                        continue L3;
                      } else {
                        var5.a((byte) 59, var6);
                        continue L3;
                      }
                    }
                  }
                }
              }
              var5 = (cf) ((Object) var8.b((byte) 127));
              if (param0 >= 82) {
                L9: while (true) {
                  if (var5 == null) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5.c(true);
                    var5 = (cf) ((Object) var8.b((byte) 127));
                    continue L9;
                  }
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "qh.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qh(int param0, ew param1, ew param2, int param3) {
        this.field_d = 65000;
        this.field_f = null;
        this.field_i = null;
        try {
            this.field_i = param1;
            this.field_h = param0;
            this.field_f = param2;
            this.field_d = param3;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "qh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = "Your search returned no results";
        field_a = "Checking";
        field_g = "Log in to browse the leagues.";
    }
}
