/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gf {
    private int field_a;
    private ch field_d;
    private ch field_f;
    static ad field_b;
    static hb field_c;
    private int field_e;

    public final String toString() {
        return "" + this.field_a;
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
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_36_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_52_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var19 = MonkeyPuzzle2.field_F ? 1 : 0;
            var3_ref = this.field_f;
            synchronized (var3_ref) {
              try {
                L0: {
                  if (((long)(param0 * 6 + 6) ^ -1L) >= (this.field_d.c((byte) -72) ^ -1L)) {
                    this.field_d.a((byte) 116, (long)(6 * param0));
                    this.field_d.a(od.field_m, 6, 0, (byte) 41);
                    var4_int = (255 & od.field_m[2]) + ((255 & od.field_m[1]) << -1384670744) + (16711680 & od.field_m[0] << -1492895728);
                    var5 = (16711680 & od.field_m[3] << 695284720) - -((od.field_m[4] & 255) << -1117328472) + (od.field_m[5] & 255);
                    if (-1 >= (var4_int ^ -1)) {
                      if (this.field_e >= var4_int) {
                        if ((var5 ^ -1) < -1) {
                          if ((long)var5 <= this.field_f.c((byte) -107) / 520L) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var9 = 61 % ((param1 - 41) / 50);
                            var8 = 0;
                            L1: while (true) {
                              if (var4_int <= var7) {
                                stackIn_49_0 = (byte[]) (var6);

                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L2: {
                                    this.field_f.a((byte) 121, (long)(var5 * 520));
                                    var10 = var4_int + -var7;
                                    if (65535 >= param0) {
                                      L3: {
                                        if (var10 <= 512) {
                                          break L3;
                                        } else {
                                          var10 = 512;
                                          break L3;
                                        }
                                      }
                                      var15 = 8;
                                      this.field_f.a(od.field_m, var10 - -var15, 0, (byte) 93);
                                      var14 = 255 & od.field_m[7];
                                      var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << -363889464);
                                      var11 = (od.field_m[0] << 1679562824 & 65280) - -(od.field_m[1] & 255);
                                      var13 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << -1741155280) - -(65280 & od.field_m[5] << -1425614456);
                                      break L2;
                                    } else {
                                      L4: {
                                        if (-511 <= (var10 ^ -1)) {
                                          break L4;
                                        } else {
                                          var10 = 510;
                                          break L4;
                                        }
                                      }
                                      var15 = 10;
                                      this.field_f.a(od.field_m, var15 + var10, 0, (byte) 123);
                                      var14 = od.field_m[9] & 255;
                                      var12 = ((255 & od.field_m[4]) << 788474536) + (od.field_m[5] & 255);
                                      var13 = (255 & od.field_m[8]) + (((255 & od.field_m[6]) << 1741999856) - -(65280 & od.field_m[7] << -674420184));
                                      var11 = (od.field_m[3] & 255) + (od.field_m[2] << -1789256280 & 65280) + ((od.field_m[1] & 255) << 763691152) + (-16777216 & od.field_m[0] << -1886461704);
                                      break L2;
                                    }
                                  }
                                  if (var11 == param0) {
                                    if (var12 == var8) {
                                      if (this.field_a == var14) {
                                        if ((var13 ^ -1) <= -1) {
                                          if ((long)var13 <= this.field_f.c((byte) -120) / 520L) {
                                            var16 = var15 + var10;
                                            var17 = var15;
                                            L5: while (true) {
                                              if (var17 >= var16) {
                                                var8++;
                                                var5 = var13;
                                                continue L1;
                                              } else {
                                                incrementValue$2 = var7;
                                                var7++;
                                                var6[incrementValue$2] = od.field_m[var17];
                                                var17++;
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
                                        stackIn_36_0 = null;

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
                              }
                            }
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackIn_9_0 = null;

                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackIn_3_0 = null;

                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_52_0 = null;
                return (byte[]) ((Object) stackIn_52_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_3_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_9_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_36_0);
                  } else {
                    return stackIn_49_0;
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

    public static void a(int param0) {
        if (param0 != -4435) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                L2: {
                  if (-1 < (param2 ^ -1)) {
                    break L2;
                  } else {
                    if (param2 <= this.field_e) {
                      L3: {
                        var6 = this.a(param3, param1, false, param2, true) ? 1 : 0;
                        if (param0 == 5) {
                          break L3;
                        } else {
                          this.field_a = -112;
                          break L3;
                        }
                      }
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          var6 = this.a(param3, param1, false, param2, false) ? 1 : 0;
                          break L4;
                        }
                      }
                      stackIn_9_0 = var6;
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
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("gf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, boolean param4) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
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
            var16 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              var6 = this.field_f;
              synchronized (var6) {
                try {
                  L0: {
                    L1: {
                      if (!param4) {
                        var7_int = (int)((this.field_f.c((byte) -128) - -519L) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if ((long)(6 + param1 * 6) > this.field_d.c((byte) -104)) {
                          stackIn_6_0 = 0;

                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_d.a((byte) 118, (long)(param1 * 6));
                            this.field_d.a(od.field_m, 6, 0, (byte) 65);
                            var7_int = (od.field_m[4] << -2037060792 & 65280) + (((255 & od.field_m[3]) << 832822096) - -(255 & od.field_m[5]));
                            if (0 >= var7_int) {
                              break L2;
                            } else {
                              if (this.field_f.c((byte) -111) / 520L < (long)var7_int) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackIn_12_0 = 0;

                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      od.field_m[3] = (byte)(var7_int >> 1933268048);
                      od.field_m[4] = (byte)(var7_int >> -432976088);
                      od.field_m[0] = (byte)(param3 >> 439619952);
                      if (!param2) {
                        break L3;
                      } else {
                        this.field_e = -65;
                        break L3;
                      }
                    }
                    od.field_m[2] = (byte)param3;
                    od.field_m[1] = (byte)(param3 >> 1161712200);
                    od.field_m[5] = (byte)var7_int;
                    this.field_d.a((byte) 91, (long)(param1 * 6));
                    this.field_d.a(od.field_m, 0, (byte) 44, 6);
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param3 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param4) {
                              break L6;
                            } else {
                              L7: {
                                this.field_f.a((byte) 123, (long)(520 * var7_int));
                                if ((param1 ^ -1) >= -65536) {
                                  try {
                                    L8: {
                                      this.field_f.a(od.field_m, 8, 0, (byte) 27);
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
                                    var12 = (255 & od.field_m[3]) + (65280 & od.field_m[2] << 1031423944);
                                    var11 = (65280 & od.field_m[0] << -605937976) - -(255 & od.field_m[1]);
                                    var13 = 255 & od.field_m[7];
                                    var10 = (od.field_m[6] & 255) + ((od.field_m[4] & 255) << 1199762736) - -(od.field_m[5] << -1646186744 & 65280);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      this.field_f.a(od.field_m, 10, 0, (byte) 121);
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
                                    var12 = (od.field_m[5] & 255) + ((od.field_m[4] & 255) << 1496106824);
                                    var13 = 255 & od.field_m[9];
                                    var11 = (65280 & od.field_m[2] << 1709420968) + (od.field_m[0] << 1761872920 & -16777216) - (-(16711680 & od.field_m[1] << -1639989072) + -(od.field_m[3] & 255));
                                    var10 = (od.field_m[8] & 255) + ((od.field_m[7] << -1179976728 & 65280) + (od.field_m[6] << 316694736 & 16711680));
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param1) {
                                  break L12;
                                } else {
                                  if (var9 != var12) {
                                    break L12;
                                  } else {
                                    if (var13 == this.field_a) {
                                      L13: {
                                        if (0 > var10) {
                                          break L13;
                                        } else {
                                          if (this.field_f.c((byte) -98) / 520L >= (long)var10) {
                                            break L6;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackIn_42_0 = 0;

                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackIn_36_0 = 0;

                              decompiledRegionSelector2 = 2;
                              break L0;
                            }
                          }
                          L14: {
                            if (0 != var10) {
                              break L14;
                            } else {
                              L15: {
                                param4 = false;
                                var10 = (int)((this.field_f.c((byte) -69) + 519L) / 520L);
                                if (0 == var10) {
                                  var10++;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              if (var10 != var7_int) {
                                break L14;
                              } else {
                                var10++;
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (512 >= -var8 + param3) {
                              var10 = 0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (65535 < param1) {
                              L18: {
                                od.field_m[9] = (byte)this.field_a;
                                od.field_m[7] = (byte)(var10 >> -64779928);
                                od.field_m[2] = (byte)(param1 >> 687109448);
                                od.field_m[1] = (byte)(param1 >> 298839152);
                                od.field_m[0] = (byte)(param1 >> 617579032);
                                od.field_m[3] = (byte)param1;
                                od.field_m[6] = (byte)(var10 >> -1241453136);
                                od.field_m[4] = (byte)(var9 >> -1517906904);
                                od.field_m[8] = (byte)var10;
                                od.field_m[5] = (byte)var9;
                                this.field_f.a((byte) 86, (long)(var7_int * 520));
                                this.field_f.a(od.field_m, 0, (byte) 112, 10);
                                var11 = param3 - var8;
                                if ((var11 ^ -1) < -511) {
                                  var11 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_f.a(param0, var8, (byte) 100, var11);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                od.field_m[4] = (byte)(var10 >> 1486857808);
                                od.field_m[2] = (byte)(var9 >> 1991944);
                                od.field_m[1] = (byte)param1;
                                od.field_m[7] = (byte)this.field_a;
                                od.field_m[5] = (byte)(var10 >> 1910636488);
                                od.field_m[6] = (byte)var10;
                                od.field_m[0] = (byte)(param1 >> -1936364664);
                                od.field_m[3] = (byte)var9;
                                this.field_f.a((byte) 118, (long)(var7_int * 520));
                                this.field_f.a(od.field_m, 0, (byte) 122, 8);
                                var11 = param3 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              this.field_f.a(param0, var8, (byte) 100, var11);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L4;
                        }
                      }
                      stackIn_64_0 = 1;

                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackIn_67_0 = 0;
                  return stackIn_67_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_6_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_36_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_42_0 != 0;
                      } else {
                        return stackIn_64_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_72_0 = (RuntimeException) (var6_ref);

                stackIn_72_1 = new StringBuilder().append("gf.D(");

                if (param0 == null) {
                  stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackIn_73_2 = "null";
                  break L20;
                } else {
                  stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackIn_73_2 = "{...}";
                  break L20;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    gf(int param0, ch param1, ch param2, int param3) {
        this.field_d = null;
        this.field_f = null;
        this.field_e = 65000;
        try {
            this.field_f = param1;
            this.field_a = param0;
            this.field_e = param3;
            this.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "gf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
