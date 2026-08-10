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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = a.field_r[0];
              if (param0 == 2) {
                break L1;
              } else {
                field_e = (int[]) null;
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (a.field_r.length <= var2) {
                break L0;
              } else {
                var3 = a.field_r[var2];
                an.a(hb.field_Vb, var2 << -461235580, hb.field_Vb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "kh.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var4;
        vi.field_A.field_n = 0;
        vi.field_A.a(true, 12);
        vi.field_A.a(gg.field_A.nextInt(), false);
        if (param0 >= -17) {
          return;
        } else {
          vi.field_A.a(gg.field_A.nextInt(), false);
          vi.field_A.a(true, param1);
          vi.field_A.a(true, param3);
          vi.field_A.d(-1, param2);
          vi.field_A.a(ea.field_k, uk.field_p, true);
          we.field_b.f(18, -4);
          fieldTemp$1 = we.field_b.field_n + 1;
          we.field_b.field_n = we.field_b.field_n + 1;
          var4 = fieldTemp$1;
          we.field_b.a(false, vi.field_A.field_n, vi.field_A.field_r, 0);
          we.field_b.b(we.field_b.field_n - var4, true);
          return;
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var5 = this.field_a;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param3 < 0) {
                    break L2;
                  } else {
                    if (param3 > this.field_g) {
                      break L2;
                    } else {
                      L3: {
                        if (param0 == 43) {
                          break L3;
                        } else {
                          kh.a(')', -33);
                          break L3;
                        }
                      }
                      L4: {
                        var6 = this.a(true, (byte) -108, param2, param3, param1) ? 1 : 0;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(false, (byte) -43, param2, param3, param1) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackIn_10_0 = var6;
                      break L1;
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
            stackIn_15_0 = (RuntimeException) (var5_ref);

            stackIn_15_1 = new StringBuilder().append("kh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final boolean a(boolean param0, byte param1, int param2, int param3, byte[] param4) {
        try {
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_68_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            Object var6 = null;
            RuntimeException var6_ref = null;
            int var7_int = 0;
            IOException var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            int var16 = 0;
            var16 = client.field_A ? 1 : 0;
            try {
              var6 = this.field_a;
              synchronized (var6) {
                try {
                  L0: {
                    if (param1 <= -39) {
                      L1: {
                        if (param0) {
                          if ((this.field_d.b(37) ^ -1L) > ((long)(6 + param2 * 6) ^ -1L)) {
                            stackIn_12_0 = 0;

                            decompiledRegionSelector2 = 1;
                            break L0;
                          } else {
                            L2: {
                              this.field_d.a((long)(6 * param2), (byte) -109);
                              this.field_d.a(0, jb.field_b, 741, 6);
                              var7_int = (255 & jb.field_b[5]) + (((255 & jb.field_b[3]) << -1816350064) - -(jb.field_b[4] << 1510451016 & 65280));
                              if (0 >= var7_int) {
                                break L2;
                              } else {
                                if ((this.field_a.b(-94) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                            stackIn_18_0 = 0;

                            decompiledRegionSelector2 = 2;
                            break L0;
                          }
                        } else {
                          var7_int = (int)((this.field_a.b(74) + 519L) / 520L);
                          if (-1 != (var7_int ^ -1)) {
                            break L1;
                          } else {
                            var7_int = 1;
                            break L1;
                          }
                        }
                      }
                      jb.field_b[0] = (byte)(param3 >> 1086853712);
                      jb.field_b[2] = (byte)param3;
                      jb.field_b[5] = (byte)var7_int;
                      jb.field_b[1] = (byte)(param3 >> 1683129256);
                      jb.field_b[3] = (byte)(var7_int >> -1965896624);
                      jb.field_b[4] = (byte)(var7_int >> 178310472);
                      this.field_d.a((long)(6 * param2), (byte) -109);
                      this.field_d.a(jb.field_b, (byte) 118, 0, 6);
                      var8 = 0;
                      var9 = 0;
                      L3: while (true) {
                        L4: {
                          if (var8 >= param3) {
                            break L4;
                          } else {
                            L5: {
                              var10 = 0;
                              if (param0) {
                                L6: {
                                  this.field_a.a((long)(520 * var7_int), (byte) -109);
                                  if ((param2 ^ -1) >= -65536) {
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
                                      var10 = (255 & jb.field_b[6]) + (16711680 & jb.field_b[4] << 392227152) + ((255 & jb.field_b[5]) << -1090035704);
                                      var13 = 255 & jb.field_b[7];
                                      var12 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 1475077992);
                                      var11 = (255 & jb.field_b[1]) + ((255 & jb.field_b[0]) << -1042807800);
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
                                      var12 = ((jb.field_b[4] & 255) << -405989848) + (jb.field_b[5] & 255);
                                      var13 = 255 & jb.field_b[9];
                                      var11 = (255 & jb.field_b[3]) + (-16777216 & jb.field_b[0] << 127232344) - -((jb.field_b[1] & 255) << -482871280) + ((jb.field_b[2] & 255) << -822689368);
                                      var10 = ((255 & jb.field_b[6]) << 324120208) + (65280 & jb.field_b[7] << -1788207480) - -(jb.field_b[8] & 255);
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
                                    if (var9 != var12) {
                                      break L11;
                                    } else {
                                      if (var13 != this.field_h) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if ((var10 ^ -1) > -1) {
                                            break L12;
                                          } else {
                                            if ((long)var10 <= this.field_a.b(-103) / 520L) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        stackIn_44_0 = 0;

                                        decompiledRegionSelector2 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                stackIn_38_0 = 0;

                                decompiledRegionSelector2 = 3;
                                break L0;
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
                              if (-513 > (-var8 + param3 ^ -1)) {
                                break L15;
                              } else {
                                var10 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              if ((param2 ^ -1) < -65536) {
                                L17: {
                                  jb.field_b[3] = (byte)param2;
                                  jb.field_b[1] = (byte)(param2 >> 531261328);
                                  jb.field_b[8] = (byte)var10;
                                  jb.field_b[6] = (byte)(var10 >> -948474160);
                                  jb.field_b[4] = (byte)(var9 >> 1676966632);
                                  jb.field_b[9] = (byte)this.field_h;
                                  jb.field_b[0] = (byte)(param2 >> -2082895624);
                                  jb.field_b[5] = (byte)var9;
                                  jb.field_b[7] = (byte)(var10 >> -2143680568);
                                  jb.field_b[2] = (byte)(param2 >> -1189518136);
                                  this.field_a.a((long)(var7_int * 520), (byte) -109);
                                  this.field_a.a(jb.field_b, (byte) 96, 0, 10);
                                  var11 = param3 + -var8;
                                  if ((var11 ^ -1) < -511) {
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
                                  jb.field_b[0] = (byte)(param2 >> -1704945272);
                                  jb.field_b[7] = (byte)this.field_h;
                                  jb.field_b[3] = (byte)var9;
                                  jb.field_b[5] = (byte)(var10 >> -1400891000);
                                  jb.field_b[4] = (byte)(var10 >> 1717337616);
                                  jb.field_b[1] = (byte)param2;
                                  jb.field_b[2] = (byte)(var9 >> -906719320);
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
                        stackIn_65_0 = 1;

                        decompiledRegionSelector2 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_4_0 = 0;

                      decompiledRegionSelector2 = 0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_68_0 = 0;
                  return stackIn_68_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_4_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_18_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_38_0 != 0;
                      } else {
                        if (decompiledRegionSelector2 == 4) {
                          return stackIn_44_0 != 0;
                        } else {
                          return stackIn_65_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_73_0 = (RuntimeException) (var6_ref);

                stackIn_73_1 = new StringBuilder().append("kh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackIn_74_2 = "null";
                  break L19;
                } else {
                  stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackIn_74_2 = "{...}";
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
            var1_int = 0;
            if (!param0) {
                field_f = (String) null;
            }
            while (ic.field_c > var1_int) {
                pd.field_g[var1_int] = null;
                var1_int++;
            }
            ic.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kh.E(" + param0 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
        try {
            int incrementValue$2 = 0;
            Object var3 = null;
            Object var3_ref = null;
            int var4_int = 0;
            IOException var4 = null;
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
            Object stackIn_13_0 = null;
            Object stackIn_25_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_57_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var18 = client.field_A ? 1 : 0;
            var3_ref = this.field_a;
            synchronized (var3_ref) {
              try {
                L0: {
                  if (((long)(6 + param0 * 6) ^ -1L) >= (this.field_d.b(103) ^ -1L)) {
                    this.field_d.a((long)(6 * param0), (byte) -109);
                    this.field_d.a(0, jb.field_b, 741, 6);
                    var4_int = (jb.field_b[2] & 255) + (jb.field_b[1] << 253972520 & 65280) + (jb.field_b[0] << 1692978896 & 16711680);
                    if (param1 > 38) {
                      var5 = (16711680 & jb.field_b[3] << 1493935856) - (-((jb.field_b[4] & 255) << 1799068744) - (255 & jb.field_b[5]));
                      if (-1 >= (var4_int ^ -1)) {
                        if (this.field_g >= var4_int) {
                          if (0 < var5) {
                            if ((long)var5 <= this.field_a.b(-128) / 520L) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var7 >= var4_int) {
                                  stackIn_54_0 = (byte[]) (var6);

                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  if (0 != var5) {
                                    L2: {
                                      this.field_a.a((long)(var5 * 520), (byte) -109);
                                      var9 = -var7 + var4_int;
                                      if (-65536 > (param0 ^ -1)) {
                                        L3: {
                                          if ((var9 ^ -1) >= -511) {
                                            break L3;
                                          } else {
                                            var9 = 510;
                                            break L3;
                                          }
                                        }
                                        var14 = 10;
                                        this.field_a.a(0, jb.field_b, 741, var9 - -var14);
                                        var11 = ((255 & jb.field_b[4]) << 818328936) + (jb.field_b[5] & 255);
                                        var12 = ((jb.field_b[6] & 255) << 813250864) + (jb.field_b[7] << 422628680 & 65280) - -(jb.field_b[8] & 255);
                                        var13 = jb.field_b[9] & 255;
                                        var10 = (-16777216 & jb.field_b[0] << -1576939336) + ((jb.field_b[1] & 255) << -1643605936) + ((jb.field_b[2] & 255) << 1367300264) + (255 & jb.field_b[3]);
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
                                        var12 = (jb.field_b[4] << 1334482960 & 16711680) + (jb.field_b[5] << -1069089528 & 65280) - -(255 & jb.field_b[6]);
                                        var11 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 1055080456);
                                        var13 = jb.field_b[7] & 255;
                                        var10 = (jb.field_b[1] & 255) + (65280 & jb.field_b[0] << -1366805240);
                                        break L2;
                                      }
                                    }
                                    if (var10 == param0) {
                                      if (var8 == var11) {
                                        if (this.field_h == var13) {
                                          if ((var12 ^ -1) <= -1) {
                                            if (this.field_a.b(55) / 520L >= (long)var12) {
                                              var15 = var14 - -var9;
                                              var16 = var14;
                                              L5: while (true) {
                                                if (var15 <= var16) {
                                                  var8++;
                                                  var5 = var12;
                                                  continue L1;
                                                } else {
                                                  incrementValue$2 = var7;
                                                  var7++;
                                                  var6[incrementValue$2] = jb.field_b[var16];
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
                                    stackIn_25_0 = null;

                                    decompiledRegionSelector0 = 2;
                                    break L0;
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
                          stackIn_13_0 = null;

                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      stackIn_7_0 = (byte[]) null;

                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_57_0 = null;
                return (byte[]) ((Object) stackIn_57_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_7_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_13_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_25_0);
                  } else {
                    return stackIn_54_0;
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
