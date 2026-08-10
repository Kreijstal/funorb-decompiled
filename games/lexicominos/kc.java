/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kc {
    private long[] field_f;
    private int field_b;
    static int[] field_l;
    private long[] field_a;
    private byte[] field_g;
    private byte[] field_k;
    static int field_c;
    private int field_i;
    private long[] field_j;
    static byte[] field_d;
    static ke[] field_m;
    private long[] field_h;
    private long[] field_e;

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == jc.field_b) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (gg.field_b != uf.field_m) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (ed.field_q.field_h != 0) {
                    break L2;
                  } else {
                    if (rf.c(0) > p.field_c - -10000L) {
                      ed.field_q.h(param0, param1 ^ -1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((ed.field_q.field_h ^ -1) < param1) {
                    try {
                      L4: {
                        jc.field_b.a(ed.field_q.field_j, ed.field_q.field_h, 120, 0);
                        p.field_c = rf.c(0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ck.b((byte) -37);
                        break L5;
                      }
                    }
                    ed.field_q.field_h = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            ed.field_q.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_m = null;
        field_d = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = -(param1 >> 1169880194);
              param1 = -(param1 & 3);
              if (param6 == 8) {
                break L1;
              } else {
                field_c = 87;
                break L1;
              }
            }
            var11 = -param0;
            L2: while (true) {
              if (var11 >= 0) {
                break L0;
              } else {
                var12 = var10_int;
                L3: while (true) {
                  if (var12 >= 0) {
                    var12 = param1;
                    L4: while (true) {
                      if (var12 >= 0) {
                        param3 = param3 + param5;
                        param7 = param7 + param9;
                        var11++;
                        continue L2;
                      } else {
                        L5: {
                          incrementValue$0 = param3;
                          param3++;
                          param4 = param8[incrementValue$0];
                          if (0 != param4) {
                            L6: {
                              var13 = 255 & param4 >> 1191395984;
                              var14 = (65290 & param4) >> -118330008;
                              var15 = 255 & param4;
                              var16 = param2[param7];
                              var17 = (16754807 & var16) >> -166496880;
                              var18 = var16 >> 1479300296 & 15;
                              var19 = var16 & 255;
                              if (var13 > var14) {
                                if (var13 > var15) {
                                  stackIn_97_0 = var13;
                                  break L6;
                                } else {
                                  stackIn_97_0 = var15;
                                  break L6;
                                }
                              } else {
                                if (var15 < var14) {
                                  stackIn_97_0 = var14;
                                  break L6;
                                } else {
                                  stackIn_97_0 = var15;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              var20 = stackIn_97_0;
                              if (var18 >= var17) {
                                if (var18 > var19) {
                                  stackIn_104_0 = var18;
                                  break L7;
                                } else {
                                  stackIn_104_0 = var19;
                                  break L7;
                                }
                              } else {
                                if (var19 >= var17) {
                                  stackIn_104_0 = var19;
                                  break L7;
                                } else {
                                  stackIn_104_0 = var17;
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var21 = stackIn_104_0;
                              if (var21 < var20) {
                                param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 710271312 | var21 * var14 / var20 << -1724225816);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            incrementValue$1 = param7;
                            param7++;
                            param2[incrementValue$1] = param4;
                            break L5;
                          } else {
                            param7++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    L9: {
                      incrementValue$2 = param3;
                      param3++;
                      param4 = param8[incrementValue$2];
                      if (0 == param4) {
                        param7++;
                        break L9;
                      } else {
                        L10: {
                          var13 = 255 & param4 >> -180184752;
                          var14 = param4 >> 1870134088 & 255;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = (16768750 & var16) >> 822166448;
                          var18 = 15 & var16 >> -1207387096;
                          var19 = var16 & 255;
                          if (var14 < var13) {
                            if (var15 < var13) {
                              stackIn_15_0 = var13;
                              break L10;
                            } else {
                              stackIn_15_0 = var15;
                              break L10;
                            }
                          } else {
                            if (var14 > var15) {
                              stackIn_15_0 = var14;
                              break L10;
                            } else {
                              stackIn_15_0 = var15;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var20 = stackIn_15_0;
                          if (var18 >= var17) {
                            if (var19 >= var18) {
                              stackIn_22_0 = var19;
                              break L11;
                            } else {
                              stackIn_22_0 = var18;
                              break L11;
                            }
                          } else {
                            if (var17 > var19) {
                              stackIn_22_0 = var17;
                              break L11;
                            } else {
                              stackIn_22_0 = var19;
                              break L11;
                            }
                          }
                        }
                        L12: {
                          var21 = stackIn_22_0;
                          if (var20 > var21) {
                            param4 = var21 * var14 / var20 << 1670499240 | var21 * var13 / var20 << 73378000 | var21 * var15 / var20;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        incrementValue$3 = param7;
                        param7++;
                        param2[incrementValue$3] = param4;
                        break L9;
                      }
                    }
                    L13: {
                      incrementValue$4 = param3;
                      param3++;
                      param4 = param8[incrementValue$4];
                      if (0 == param4) {
                        param7++;
                        break L13;
                      } else {
                        L14: {
                          var13 = (param4 & 16771522) >> 714058096;
                          var14 = (param4 & 65535) >> -133897304;
                          var15 = param4 & 255;
                          var16 = param2[param7];
                          var17 = (16751732 & var16) >> 689844688;
                          var18 = (3998 & var16) >> 1773268840;
                          var19 = 255 & var16;
                          if (var13 <= var14) {
                            if (var14 <= var15) {
                              stackIn_35_0 = var15;
                              break L14;
                            } else {
                              stackIn_35_0 = var14;
                              break L14;
                            }
                          } else {
                            if (var13 > var15) {
                              stackIn_35_0 = var13;
                              break L14;
                            } else {
                              stackIn_35_0 = var15;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          var20 = stackIn_35_0;
                          if (var18 < var17) {
                            if (var17 > var19) {
                              stackIn_42_0 = var17;
                              break L15;
                            } else {
                              stackIn_42_0 = var19;
                              break L15;
                            }
                          } else {
                            if (var19 < var18) {
                              stackIn_42_0 = var18;
                              break L15;
                            } else {
                              stackIn_42_0 = var19;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          var21 = stackIn_42_0;
                          if (var20 <= var21) {
                            break L16;
                          } else {
                            param4 = var13 * var21 / var20 << -1156533456 | var21 * var14 / var20 << 1296576584 | var15 * var21 / var20;
                            break L16;
                          }
                        }
                        incrementValue$5 = param7;
                        param7++;
                        param2[incrementValue$5] = param4;
                        break L13;
                      }
                    }
                    L17: {
                      incrementValue$6 = param3;
                      param3++;
                      param4 = param8[incrementValue$6];
                      if (param4 != 0) {
                        L18: {
                          var13 = (16730233 & param4) >> 1541067664;
                          var14 = (param4 & 65406) >> -749200504;
                          var15 = param4 & 255;
                          var16 = param2[param7];
                          var17 = (var16 & 16775412) >> 1773562384;
                          var18 = (var16 & 4043) >> 1436800936;
                          var19 = var16 & 255;
                          if (var13 > var14) {
                            if (var15 >= var13) {
                              stackIn_55_0 = var15;
                              break L18;
                            } else {
                              stackIn_55_0 = var13;
                              break L18;
                            }
                          } else {
                            if (var14 <= var15) {
                              stackIn_55_0 = var15;
                              break L18;
                            } else {
                              stackIn_55_0 = var14;
                              break L18;
                            }
                          }
                        }
                        L19: {
                          var20 = stackIn_55_0;
                          if (var18 < var17) {
                            if (var17 <= var19) {
                              stackIn_62_0 = var19;
                              break L19;
                            } else {
                              stackIn_62_0 = var17;
                              break L19;
                            }
                          } else {
                            if (var18 <= var19) {
                              stackIn_62_0 = var19;
                              break L19;
                            } else {
                              stackIn_62_0 = var18;
                              break L19;
                            }
                          }
                        }
                        L20: {
                          var21 = stackIn_62_0;
                          if (var20 <= var21) {
                            break L20;
                          } else {
                            param4 = var15 * var21 / var20 | (var13 * var21 / var20 << -1116122352 | var14 * var21 / var20 << 221442344);
                            break L20;
                          }
                        }
                        incrementValue$7 = param7;
                        param7++;
                        param2[incrementValue$7] = param4;
                        break L17;
                      } else {
                        param7++;
                        break L17;
                      }
                    }
                    L21: {
                      incrementValue$8 = param3;
                      param3++;
                      param4 = param8[incrementValue$8];
                      if (-1 == (param4 ^ -1)) {
                        param7++;
                        break L21;
                      } else {
                        L22: {
                          var13 = 255 & param4 >> 1046582576;
                          var14 = (65473 & param4) >> 1806238856;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = 255 & var16 >> 682435376;
                          var18 = 15 & var16 >> 1211249224;
                          var19 = 255 & var16;
                          if (var14 >= var13) {
                            if (var14 > var15) {
                              stackIn_73_0 = var14;
                              break L22;
                            } else {
                              stackIn_73_0 = var15;
                              break L22;
                            }
                          } else {
                            if (var13 > var15) {
                              stackIn_73_0 = var13;
                              break L22;
                            } else {
                              stackIn_73_0 = var15;
                              break L22;
                            }
                          }
                        }
                        L23: {
                          var20 = stackIn_73_0;
                          if (var18 < var17) {
                            if (var19 >= var17) {
                              stackIn_80_0 = var19;
                              break L23;
                            } else {
                              stackIn_80_0 = var17;
                              break L23;
                            }
                          } else {
                            if (var19 >= var18) {
                              stackIn_80_0 = var19;
                              break L23;
                            } else {
                              stackIn_80_0 = var18;
                              break L23;
                            }
                          }
                        }
                        L24: {
                          var21 = stackIn_80_0;
                          if (var21 < var20) {
                            param4 = var15 * var21 / var20 | (var21 * var14 / var20 << -1132881272 | var21 * var13 / var20 << 1778785104);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        incrementValue$9 = param7;
                        param7++;
                        param2[incrementValue$9] = param4;
                        break L21;
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var10 = decompiledCaughtException;
            stackIn_113_0 = (RuntimeException) (var10);

            stackIn_113_1 = new StringBuilder().append("kc.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "null";
              break L25;
            } else {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackIn_114_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_116_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "null";
              break L26;
            } else {
              stackIn_114_0 = (RuntimeException) ((Object) stackIn_114_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "{...}";
              break L26;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_114_0), stackIn_117_2 + ',' + param9 + ')');
        }
    }

    private final void b(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        byte[] var7;
        int var8;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var2 = 0;
          if (param0 <= -111) {
            break L0;
          } else {
            var7 = (byte[]) null;
            this.a(-93L, (byte[]) null, 126);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L3: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        this.field_e[var2] = qg.a(this.field_e[var2], qg.a(this.field_h[var2], this.field_f[var2]));
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
                          if ((var3 ^ -1) <= -9) {
                            this.field_j[0] = qg.a(this.field_j[0], fb.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    this.field_f[var3] = this.field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_a[var3] = this.field_j[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var8 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_a[var3] = qg.a(this.field_a[var3], fb.field_j[var8][vg.a(255, (int)(this.field_f[vg.a(var3 - var8, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_j[var3] = this.field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_a[var3] = qg.a(this.field_a[var3], fb.field_j[var4][vg.a((int)(this.field_j[vg.a(var3 - var4, 7)] >>> var5), 255)]);
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
                dupTemp$0 = this.field_e[var2];
                arrayValue$1 = this.field_h[var2];
                this.field_j[var2] = dupTemp$0;
                this.field_f[var2] = qg.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L2;
              }
            }
          } else {
            this.field_h[var2] = qg.a(qg.a(tf.a(255L, (long)this.field_k[var3 + 6]) << -900871224, qg.a(qg.a(qg.a(qg.a(tf.a((long)this.field_k[2 + var3] << 953476200, 280375465082880L), qg.a((long)this.field_k[var3] << 783770232, tf.a(71776119061217280L, (long)this.field_k[var3 - -1] << 1461624112))), tf.a(1095216660480L, (long)this.field_k[var3 - -3] << -391529184)), tf.a((long)this.field_k[var3 - -4], 255L) << 426542488), tf.a((long)this.field_k[var3 - -5] << 1213552656, 16711680L))), tf.a((long)this.field_k[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L1;
          }
        }
    }

    final void a(int param0, boolean param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], 128 >>> vg.a(7, this.field_b));
              this.field_i = this.field_i + 1;
              if ((this.field_i ^ -1) < -33) {
                L2: while (true) {
                  if (this.field_i >= 64) {
                    this.b((byte) -127);
                    this.field_i = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_i;
                    this.field_i = this.field_i + 1;
                    this.field_k[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (-33 >= (this.field_i ^ -1)) {
                o.a(this.field_g, 0, this.field_k, 32, 32);
                this.b((byte) -122);
                var4_int = 0;
                if (!param1) {
                  var5 = param0;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_e[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 796419064);
                      param2[1 + var5] = (byte)(int)(var6 >>> 1141110960);
                      param2[var5 - -2] = (byte)(int)(var6 >>> -1839473176);
                      param2[3 + var5] = (byte)(int)(var6 >>> -403539104);
                      param2[4 + var5] = (byte)(int)(var6 >>> -984102248);
                      param2[5 + var5] = (byte)(int)(var6 >>> -137356848);
                      param2[var5 + 6] = (byte)(int)(var6 >>> -295675448);
                      param2[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                fieldTemp$1 = this.field_i;
                this.field_i = this.field_i + 1;
                this.field_k[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("kc.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(long param0, byte[] param1, int param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & 8 + -((int)param0 & 7);
            var7 = 7 & this.field_b;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (-1 < (var11 ^ -1)) {
                L2: {
                  if (param2 == -24893) {
                    break L2;
                  } else {
                    this.field_a = (long[]) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (8L >= param0) {
                    L4: {
                      if (-1L <= (param0 ^ -1L)) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param1[var5_int] << var6 & 255;
                        this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (((long)var7 - -param0 ^ -1L) <= -9L) {
                        L6: {
                          param0 = param0 - (long)(-var7 + 8);
                          this.field_i = this.field_i + 1;
                          this.field_b = this.field_b + (-var7 + 8);
                          if ((this.field_b ^ -1) != -513) {
                            break L6;
                          } else {
                            this.b((byte) -119);
                            this.field_i = 0;
                            this.field_b = 0;
                            break L6;
                          }
                        }
                        this.field_k[this.field_i] = (byte)vg.a(var8 << 8 + -var7, 255);
                        this.field_b = this.field_b + (int)param0;
                        break L5;
                      } else {
                        this.field_b = (int)((long)this.field_b + param0);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 - var6;
                      if (0 > var8) {
                        break L7;
                      } else {
                        if (-257 < (var8 ^ -1)) {
                          L8: {
                            this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
                            this.field_i = this.field_i + 1;
                            this.field_b = this.field_b + (8 - var7);
                            if ((this.field_b ^ -1) != -513) {
                              break L8;
                            } else {
                              this.b((byte) -120);
                              this.field_i = 0;
                              this.field_b = 0;
                              break L8;
                            }
                          }
                          this.field_k[this.field_i] = (byte)vg.a(var8 << -var7 + 8, 255);
                          param0 = param0 - 8L;
                          var5_int++;
                          this.field_b = this.field_b + var7;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & this.field_g[var11]) + (255 & (int)var9));
                this.field_g[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("kc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 109) {
            field_d = (byte[]) null;
        }
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            this.field_g[var2] = (byte) 0;
        }
        this.field_i = 0;
        this.field_b = 0;
        this.field_k[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            this.field_e[var2] = 0L;
        }
    }

    kc() {
        this.field_a = new long[8];
        this.field_b = 0;
        this.field_k = new byte[64];
        this.field_f = new long[8];
        this.field_j = new long[8];
        this.field_i = 0;
        this.field_g = new byte[32];
        this.field_e = new long[8];
        this.field_h = new long[8];
    }

    static {
        field_l = new int[8192];
        field_m = new ke[10];
    }
}
