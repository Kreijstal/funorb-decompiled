/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    private long[] field_n;
    private int field_b;
    static int field_j;
    private long[] field_i;
    static nh field_f;
    private int field_g;
    static String field_e;
    static lh field_p;
    static he[] field_d;
    private long[] field_h;
    private byte[] field_k;
    private long[] field_l;
    private long[] field_q;
    static int field_a;
    static String field_c;
    static he field_o;
    private byte[] field_m;

    final void a(byte param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -((int)param2 & 7) + 8 & 7;
            var7 = 7 & this.field_b;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (8L >= param2) {
                    L3: {
                      if (param0 <= -72) {
                        break L3;
                      } else {
                        this.field_n = (long[]) null;
                        break L3;
                      }
                    }
                    L4: {
                      if (-1L > (param2 ^ -1L)) {
                        var8 = 255 & param1[var5_int] << var6;
                        this.field_k[this.field_g] = (byte)li.a((int) this.field_k[this.field_g], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if ((param2 + (long)var7 ^ -1L) > -9L) {
                        this.field_b = (int)((long)this.field_b + param2);
                        break L5;
                      } else {
                        L6: {
                          this.field_g = this.field_g + 1;
                          param2 = param2 - (long)(8 + -var7);
                          this.field_b = this.field_b + (-var7 + 8);
                          if (this.field_b != 512) {
                            break L6;
                          } else {
                            this.a(8);
                            this.field_g = 0;
                            this.field_b = 0;
                            break L6;
                          }
                        }
                        this.field_k[this.field_g] = (byte)rk.a(var8 << 8 + -var7, 255);
                        this.field_b = this.field_b + (int)param2;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param1[var5_int] << var6 & 255 | (param1[var5_int + 1] & 255) >>> 8 - var6;
                      if (-1 < (var8 ^ -1)) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            this.field_k[this.field_g] = (byte)li.a((int) this.field_k[this.field_g], var8 >>> var7);
                            this.field_g = this.field_g + 1;
                            this.field_b = this.field_b + (8 - var7);
                            if (512 != this.field_b) {
                              break L8;
                            } else {
                              this.a(8);
                              this.field_g = 0;
                              this.field_b = 0;
                              break L8;
                            }
                          }
                          this.field_k[this.field_g] = (byte)rk.a(255, var8 << 8 + -var7);
                          this.field_b = this.field_b + var7;
                          param2 = param2 - 8L;
                          var5_int++;
                          continue L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & (int)var9) + (this.field_m[var11] & 255));
                this.field_m[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("nj.H(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                if (aj.field_c) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      if (param1 == 8) {
                        var2 = "tuhstatbut";
                        var3 = (String) (pb.a("getcookies", param0, true));
                        var4 = ki.a((byte) -95, ';', var3);
                        var5 = 0;
                        L2: while (true) {
                          if (var4.length <= var5) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L3: {
                              var6 = var4[var5].indexOf('=');
                              if ((var6 ^ -1) > -1) {
                                break L3;
                              } else {
                                if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                  break L3;
                                } else {
                                  stackOut_12_0 = 1;
                                  stackIn_13_0 = stackOut_12_0;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      L5: {
                        if (null == param0.getParameter("tuhstatbut")) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) (var2_ref2);
                stackOut_21_1 = new StringBuilder().append("nj.E(");
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param0 == null) {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L6;
                } else {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "{...}";
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L6;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_7_0 != 0;
                } else {
                  return stackIn_13_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            this.field_k[this.field_g] = (byte)li.a((int) this.field_k[this.field_g], 128 >>> rk.a(7, this.field_b));
            this.field_g = this.field_g + 1;
            if (param1 <= -94) {
              L1: {
                if ((this.field_g ^ -1) >= -33) {
                  break L1;
                } else {
                  L2: while (true) {
                    if (this.field_g >= 64) {
                      this.a(8);
                      this.field_g = 0;
                      break L1;
                    } else {
                      fieldTemp$2 = this.field_g;
                      this.field_g = this.field_g + 1;
                      this.field_k[fieldTemp$2] = (byte) 0;
                      continue L2;
                    }
                  }
                }
              }
              L3: while (true) {
                if (32 <= this.field_g) {
                  kg.a(this.field_m, 0, this.field_k, 32, 32);
                  this.a(8);
                  var4_int = 0;
                  var5 = param0;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_n[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 1807801720);
                      param2[1 + var5] = (byte)(int)(var6 >>> 751054512);
                      param2[var5 + 2] = (byte)(int)(var6 >>> 1396502760);
                      param2[var5 - -3] = (byte)(int)(var6 >>> -412184928);
                      param2[4 + var5] = (byte)(int)(var6 >>> 884804056);
                      param2[5 + var5] = (byte)(int)(var6 >>> 1178832912);
                      param2[var5 - -6] = (byte)(int)(var6 >>> -1859592376);
                      param2[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  fieldTemp$3 = this.field_g;
                  this.field_g = this.field_g + 1;
                  this.field_k[fieldTemp$3] = (byte) 0;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            this.field_m[var2] = (byte) 0;
        }
        this.field_k[0] = (byte) 0;
        this.field_g = 0;
        this.field_b = 0;
        for (var2 = 0; var2 < 8; var2++) {
            this.field_n[var2] = 0L;
        }
        if (!param0) {
            field_p = (lh) null;
        }
    }

    public static void b(int param0) {
        String discarded$0 = null;
        field_e = null;
        if (param0 != 0) {
            discarded$0 = nj.a(false, true, -15, true);
        }
        field_c = null;
        field_f = null;
        field_d = null;
        field_o = null;
        field_p = null;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (!(!param0)) {
            var4 += 4;
        }
        if (!(!param1)) {
            var4 += 2;
        }
        if (param2 >= -52) {
            return (String) null;
        }
        if (param3) {
            var4++;
        }
        return tf.field_nb[var4];
    }

    final static java.awt.Frame a(int param0, int param1, bl param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        fl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        fl[] var10 = null;
        il var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_31_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param2.a(-20)) {
              L1: {
                if (param1 == 0) {
                  var10 = eb.a(param2, true);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (var10[var8].field_g == param4) {
                          if (var10[var8].field_h == param5) {
                            L3: {
                              L4: {
                                if (-1 == (param0 ^ -1)) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_c == param0) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_b > param1) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param1 = var10[var8].field_b;
                              var7_int = 1;
                              break L3;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                var11 = param2.a(param4, param5, param0, 0, param1);
                if (!param3) {
                  break L6;
                } else {
                  field_o = (he) null;
                  break L6;
                }
              }
              L7: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) (var11.field_g);
                  if (var7 != null) {
                    if (-3 != (var11.field_b ^ -1)) {
                      stackOut_36_0 = (java.awt.Frame) (var7);
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      ce.a(param2, var7, (byte) -47);
                      stackOut_34_0 = null;
                      stackIn_35_0 = stackOut_34_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  kk.a(10L, true);
                  continue L7;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var6);
            stackOut_38_1 = new StringBuilder().append("nj.G(").append(param0).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_32_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_35_0);
            } else {
              return stackIn_37_0;
            }
          }
        }
    }

    private final void a(int param0) {
        java.awt.Frame discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bl var7 = null;
        int var8 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      if (param0 == 8) {
                        break L3;
                      } else {
                        var7 = (bl) null;
                        discarded$1 = nj.a(118, 34, (bl) null, false, -72, 58);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        this.field_n[var2] = ff.a(this.field_n[var2], ff.a(this.field_l[var2], this.field_h[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            this.field_q[0] = ff.a(this.field_q[0], qb.field_e[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_h[var3] = this.field_i[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_i[var3] = this.field_q[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var8 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_i[var3] = ff.a(this.field_i[var3], qb.field_c[var8][rk.a(255, (int)(this.field_h[rk.a(7, var3 + -var8)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_q[var3] = this.field_i[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_i[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_i[var3] = ff.a(this.field_i[var3], qb.field_c[var4][rk.a((int)(this.field_q[rk.a(var3 - var4, 7)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_q[var2] = this.field_n[var2];
                this.field_h[var2] = ff.a(this.field_l[var2], this.field_n[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_l[var2] = ff.a(hg.a(255L, (long)this.field_k[7 + var3]), ff.a(hg.a(65280L, (long)this.field_k[6 + var3] << -1502511992), ff.a(hg.a(16711680L, (long)this.field_k[var3 + 5] << -1351999536), ff.a(ff.a(ff.a(ff.a((long)this.field_k[var3] << -1202474824, hg.a((long)this.field_k[var3 - -1], 255L) << 2003009584), hg.a(255L, (long)this.field_k[2 + var3]) << 208246952), hg.a((long)this.field_k[3 + var3] << 1557832160, 1095216660480L)), hg.a((long)this.field_k[var3 + 4] << 1265708888, 4278190080L)))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    nj() {
        this.field_b = 0;
        this.field_n = new long[8];
        this.field_g = 0;
        this.field_q = new long[8];
        this.field_h = new long[8];
        this.field_i = new long[8];
        this.field_l = new long[8];
        this.field_k = new byte[64];
        this.field_m = new byte[32];
    }

    static {
        field_a = 49;
        field_e = "Passwords must be between 5 and 20 characters long";
        field_c = "This password contains your Player Name, and would be easy to guess";
    }
}
