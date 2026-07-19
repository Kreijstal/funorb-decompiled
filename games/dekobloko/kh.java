/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    private nh field_d;
    static String field_b;
    static String field_f;
    static int[] field_e;
    private nh field_a;
    private int field_h;
    private int field_g;
    static String field_c;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = a.field_r[0];
            var2 = 1;
            L1: while (true) {
              if (~a.field_r.length >= ~var2) {
                break L0;
              } else {
                var3 = a.field_r[var2];
                an.a(hb.field_Vb, var2 << 4, hb.field_Vb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "kh.B(" + 2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        vi.field_A.field_n = 0;
        vi.field_A.a(true, 12);
        vi.field_A.a(gg.field_A.nextInt(), false);
        vi.field_A.a(gg.field_A.nextInt(), false);
        vi.field_A.a(true, param1);
        vi.field_A.a(true, param3);
        vi.field_A.d(-1, param2);
        vi.field_A.a(ea.field_k, uk.field_p, true);
        we.field_b.f(18, -4);
        int fieldTemp$0 = we.field_b.field_n + 1;
        we.field_b.field_n = we.field_b.field_n + 1;
        int var4 = fieldTemp$0;
        we.field_b.a(false, vi.field_A.field_n, vi.field_A.field_r, 0);
        we.field_b.b(we.field_b.field_n - var4, true);
    }

    public final String toString() {
        return "" + this.field_h;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        boolean discarded$4 = false;
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
          var5 = this.field_a;
          synchronized (var5) {
            L0: {
              L1: {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (param3 > this.field_g) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == 43) {
                        break L2;
                      } else {
                        discarded$4 = kh.a(')', -33);
                        break L2;
                      }
                    }
                    L3: {
                      var6 = this.a(true, (byte) -108, param2, param3, param1) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(false, (byte) -43, param2, param3, param1) ? 1 : 0;
                        break L3;
                      }
                    }
                    stackOut_9_0 = var6;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("kh.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(boolean param0, byte param1, int param2, int param3, byte[] param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_68_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_67_0 = 0;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var16 = client.field_A ? 1 : 0;
            try {
              var6_ref2 = this.field_a;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    if (param1 <= -39) {
                      L1: {
                        if (param0) {
                          if (~this.field_d.b(37) > ~(long)(6 + param2 * 6)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackOut_12_0 = stackIn_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            L2: {
                              this.field_d.a((long)(6 * param2), (byte) -109);
                              this.field_d.a(0, jb.field_b, 741, 6);
                              var7_int = (255 & jb.field_b[5]) + (((255 & jb.field_b[3]) << 16) - -(jb.field_b[4] << 8 & 65280));
                              if (0 >= var7_int) {
                                break L2;
                              } else {
                                if (~(this.field_a.b(-94) / 520L) > ~(long)var7_int) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            stackOut_18_0 = stackIn_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
                          }
                        } else {
                          var7_int = (int)((this.field_a.b(74) + 519L) / 520L);
                          if (var7_int != 0) {
                            break L1;
                          } else {
                            var7_int = 1;
                            break L1;
                          }
                        }
                      }
                      jb.field_b[0] = (byte)(param3 >> 16);
                      jb.field_b[2] = (byte)param3;
                      jb.field_b[5] = (byte)var7_int;
                      jb.field_b[1] = (byte)(param3 >> 8);
                      jb.field_b[3] = (byte)(var7_int >> 16);
                      jb.field_b[4] = (byte)(var7_int >> 8);
                      this.field_d.a((long)(6 * param2), (byte) -109);
                      this.field_d.a(jb.field_b, (byte) 118, 0, 6);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (~var8 <= ~param3) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (param0) {
                                L6: {
                                  this.field_a.a((long)(520 * var7_int), (byte) -109);
                                  if (param2 <= 65535) {
                                    try {
                                      L7: {
                                        this.field_a.a(0, jb.field_b, 741, 8);
                                        decompiledRegionSelector0 = 0;
                                        break L7;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L8: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector0 = 1;
                                        break L8;
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var10 = (255 & jb.field_b[6]) + (16711680 & jb.field_b[4] << 16) + ((255 & jb.field_b[5]) << 8);
                                      var13 = 255 & jb.field_b[7];
                                      var12 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 8);
                                      var11 = (255 & jb.field_b[1]) + ((255 & jb.field_b[0]) << 8);
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    try {
                                      L9: {
                                        this.field_a.a(0, jb.field_b, 741, 10);
                                        decompiledRegionSelector1 = 0;
                                        break L9;
                                      }
                                    } catch (java.io.EOFException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L10: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        decompiledRegionSelector1 = 1;
                                        break L10;
                                      }
                                    }
                                    if (decompiledRegionSelector1 == 0) {
                                      var12 = ((jb.field_b[4] & 255) << 8) + (jb.field_b[5] & 255);
                                      var13 = 255 & jb.field_b[9];
                                      var11 = (255 & jb.field_b[3]) + (-16777216 & jb.field_b[0] << 24) - -((jb.field_b[1] & 255) << 16) + ((jb.field_b[2] & 255) << 8);
                                      var10 = ((255 & jb.field_b[6]) << 16) + (65280 & jb.field_b[7] << 8) - -(jb.field_b[8] & 255);
                                      break L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L11: {
                                  if (var11 != param2) {
                                    break L11;
                                  } else {
                                    if (~var9 != ~var12) {
                                      break L11;
                                    } else {
                                      if (~var13 != ~this.field_h) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (var10 < 0) {
                                            break L12;
                                          } else {
                                            if ((long)var10 <= this.field_a.b(-103) / 520L) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        stackOut_43_0 = 0;
                                        stackIn_44_0 = stackOut_43_0;
                                        stackOut_44_0 = stackIn_44_0;
                                        stackIn_45_0 = stackOut_44_0;
                                        return stackIn_45_0 != 0;
                                      }
                                    }
                                  }
                                }
                                stackOut_37_0 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackOut_38_0 = stackIn_38_0;
                                stackIn_39_0 = stackOut_38_0;
                                return stackIn_39_0 != 0;
                              } else {
                                break L5;
                              }
                            }
                            L13: {
                              if (var10 == 0) {
                                L14: {
                                  param0 = false;
                                  var10 = (int)((this.field_a.b(-121) + 519L) / 520L);
                                  if (var10 != 0) {
                                    break L14;
                                  } else {
                                    var10++;
                                    break L14;
                                  }
                                }
                                if (var7_int != var10) {
                                  break L13;
                                } else {
                                  var10++;
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            L15: {
                              if (-var8 + param3 > 512) {
                                break L15;
                              } else {
                                var10 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              if (param2 > 65535) {
                                L17: {
                                  jb.field_b[3] = (byte)param2;
                                  jb.field_b[1] = (byte)(param2 >> 16);
                                  jb.field_b[8] = (byte)var10;
                                  jb.field_b[6] = (byte)(var10 >> 16);
                                  jb.field_b[4] = (byte)(var9 >> 8);
                                  jb.field_b[9] = (byte)this.field_h;
                                  jb.field_b[0] = (byte)(param2 >> 24);
                                  jb.field_b[5] = (byte)var9;
                                  jb.field_b[7] = (byte)(var10 >> 8);
                                  jb.field_b[2] = (byte)(param2 >> 8);
                                  this.field_a.a((long)(var7_int * 520), (byte) -109);
                                  this.field_a.a(jb.field_b, (byte) 96, 0, 10);
                                  var11 = param3 + -var8;
                                  if (var11 > 510) {
                                    var11 = 510;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                this.field_a.a(param4, (byte) 126, var8, var11);
                                var8 = var8 + var11;
                                break L16;
                              } else {
                                L18: {
                                  jb.field_b[0] = (byte)(param2 >> 8);
                                  jb.field_b[7] = (byte)this.field_h;
                                  jb.field_b[3] = (byte)var9;
                                  jb.field_b[5] = (byte)(var10 >> 8);
                                  jb.field_b[4] = (byte)(var10 >> 16);
                                  jb.field_b[1] = (byte)param2;
                                  jb.field_b[2] = (byte)(var9 >> 8);
                                  jb.field_b[6] = (byte)var10;
                                  this.field_a.a((long)(var7_int * 520), (byte) -109);
                                  this.field_a.a(jb.field_b, (byte) 124, 0, 8);
                                  var11 = param3 - var8;
                                  if (var11 > 512) {
                                    var11 = 512;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                this.field_a.a(param4, (byte) 126, var8, var11);
                                var8 = var8 + var11;
                                break L16;
                              }
                            }
                            var7_int = var10;
                            var9++;
                            continue L3;
                          }
                        }
                        stackOut_64_0 = 1;
                        stackIn_65_0 = stackOut_64_0;
                        stackOut_65_0 = stackIn_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        break L0;
                      }
                    } else {
                      stackOut_3_0 = 0;
                      stackIn_4_0 = stackOut_3_0;
                      stackOut_4_0 = stackIn_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0 != 0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  return stackIn_68_0 != 0;
                }
                return stackIn_66_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_71_0 = (RuntimeException) (var6_ref);
                stackOut_71_1 = new StringBuilder().append("kh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param4 == null) {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "null";
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L19;
                } else {
                  stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L19;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -1643605936) {
            kh.b(15);
        }
    }

    final static boolean a(char param0, int param1) {
        L0: {
          if (param0 < 32) {
            break L0;
          } else {
            if (param0 <= 126) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < 160) {
            break L1;
          } else {
            if (255 < param0) {
              break L1;
            } else {
              return true;
            }
          }
        }
        if (8364 != param0) {
          if (param0 != 338) {
            if (param0 != 8212) {
              if (339 != param0) {
                if (param0 != 376) {
                  if (param1 != 8212) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = client.field_A ? 1 : 0;
        try {
            for (var1_int = 0; ~ic.field_c < ~var1_int; var1_int++) {
                pd.field_g[var1_int] = null;
            }
            ic.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kh.E(" + true + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
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
            byte[] stackIn_7_0 = null;
            byte[] stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            Object stackOut_12_0 = null;
            Object stackOut_13_0 = null;
            byte[] stackOut_6_0 = null;
            byte[] stackOut_7_0 = null;
            Object stackOut_56_0 = null;
            var18 = client.field_A ? 1 : 0;
            var3 = this.field_a;
            synchronized (var3) {
              try {
                L0: {
                  if (~(long)(6 + param0 * 6) >= ~this.field_d.b(103)) {
                    this.field_d.a((long)(6 * param0), (byte) -109);
                    this.field_d.a(0, jb.field_b, 741, 6);
                    var4_int = (jb.field_b[2] & 255) + (jb.field_b[1] << 8 & 65280) + (jb.field_b[0] << 16 & 16711680);
                    if (param1 > 38) {
                      var5 = (16711680 & jb.field_b[3] << 16) - (-((jb.field_b[4] & 255) << 8) - (255 & jb.field_b[5]));
                      if (var4_int >= 0) {
                        if (this.field_g >= var4_int) {
                          if (0 < var5) {
                            if ((long)var5 <= this.field_a.b(-128) / 520L) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackOut_53_0 = (byte[]) (var6);
                                  stackIn_54_0 = stackOut_53_0;
                                  stackOut_54_0 = (byte[]) ((Object) stackIn_54_0);
                                  stackIn_55_0 = stackOut_54_0;
                                  break L0;
                                } else {
                                  if (0 != var5) {
                                    L2: {
                                      this.field_a.a((long)(var5 * 520), (byte) -109);
                                      var9 = -var7 + var4_int;
                                      if (param0 > 65535) {
                                        L3: {
                                          if (var9 <= 510) {
                                            break L3;
                                          } else {
                                            var9 = 510;
                                            break L3;
                                          }
                                        }
                                        var14 = 10;
                                        this.field_a.a(0, jb.field_b, 741, var9 - -var14);
                                        var11 = ((255 & jb.field_b[4]) << 8) + (jb.field_b[5] & 255);
                                        var12 = ((jb.field_b[6] & 255) << 16) + (jb.field_b[7] << 8 & 65280) - -(jb.field_b[8] & 255);
                                        var13 = jb.field_b[9] & 255;
                                        var10 = (-16777216 & jb.field_b[0] << 24) + ((jb.field_b[1] & 255) << 16) + ((jb.field_b[2] & 255) << 8) + (255 & jb.field_b[3]);
                                        break L2;
                                      } else {
                                        L4: {
                                          var14 = 8;
                                          if (512 < var9) {
                                            var9 = 512;
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        this.field_a.a(0, jb.field_b, 741, var14 + var9);
                                        var12 = (jb.field_b[4] << 16 & 16711680) + (jb.field_b[5] << 8 & 65280) - -(255 & jb.field_b[6]);
                                        var11 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 8);
                                        var13 = jb.field_b[7] & 255;
                                        var10 = (jb.field_b[1] & 255) + (65280 & jb.field_b[0] << 8);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param0) {
                                      if (var8 == var11) {
                                        if (~this.field_h == ~var13) {
                                          if (var12 >= 0) {
                                            if (this.field_a.b(55) / 520L >= (long)var12) {
                                              var15 = var14 - -var9;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (~var15 >= ~var16) {
                                                  var8++;
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  incrementValue$1 = var7;
                                                  var7++;
                                                  var6[incrementValue$1] = jb.field_b[var16];
                                                  var16++;
                                                  continue L5;
                                                }
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
                                      return null;
                                    }
                                  } else {
                                    stackOut_24_0 = null;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackOut_25_0 = stackIn_25_0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return (byte[]) ((Object) stackIn_26_0);
                                  }
                                }
                              }
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_12_0 = null;
                          stackIn_13_0 = stackOut_12_0;
                          stackOut_13_0 = stackIn_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          return (byte[]) ((Object) stackIn_14_0);
                        }
                      } else {
                        return null;
                      }
                    } else {
                      stackOut_6_0 = (byte[]) null;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = (byte[]) ((Object) stackIn_7_0);
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackOut_56_0 = null;
                stackIn_57_0 = stackOut_56_0;
                return (byte[]) ((Object) stackIn_57_0);
              }
              return stackIn_55_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    kh(int param0, nh param1, nh param2, int param3) {
        this.field_d = null;
        this.field_a = null;
        this.field_g = 65000;
        try {
            this.field_d = param2;
            this.field_a = param1;
            this.field_g = param3;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_f = "Connection timed out. Please try using a different server.";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = new int[4];
        field_c = "Play the game without logging in just yet";
    }
}
