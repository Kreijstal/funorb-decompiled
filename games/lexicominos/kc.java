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
            if (null != jc.field_b) {
                // if_icmpgt L32
                // if_acmpne L24
            } else {
                ed.field_q.field_h = 0;
                return;
            }
            if (ed.field_q.field_h == 0) {
                if (!(rf.c(0) <= p.field_c - -10000L)) {
                    ed.field_q.h(param0, param1 ^ -1);
                }
            }
            if (!((ed.field_q.field_h ^ -1) >= param1)) {
                try {
                    jc.field_b.a(ed.field_q.field_j, ed.field_q.field_h, 120, 0);
                    p.field_c = rf.c(0);
                } catch (IOException iOException) {
                    ck.b((byte) -37);
                }
                ed.field_q.field_h = 0;
            }
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
        int var10 = 0;
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
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        L0: {
          var22 = Lexicominos.field_L ? 1 : 0;
          var10 = -(param1 >> 1169880194);
          param1 = -(param1 & 3);
          if (param6 == 8) {
            break L0;
          } else {
            field_c = 87;
            break L0;
          }
        }
        var11 = -param0;
        L1: while (true) {
          L2: {
            if (var11 >= 0) {
              break L2;
            } else {
              var12 = var10;
              L3: while (true) {
                L4: {
                  if (var12 >= 0) {
                    break L4;
                  } else {
                    L5: {
                      param3++;
                      param4 = param8[param3];
                      if (0 == param4) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param7++;
                    L6: {
                      param3++;
                      param4 = param8[param3];
                      if (0 == param4) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    param7++;
                    L7: {
                      L8: {
                        param3++;
                        param4 = param8[param3];
                        if (param4 != 0) {
                          break L8;
                        } else {
                          param7++;
                          if (0 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        var13 = (16730233 & param4) >> 1541067664;
                        var14 = (param4 & 65406) >> -749200504;
                        var15 = param4 & 255;
                        var16 = param2[param7];
                        var17 = (var16 & 16775412) >> 1773562384;
                        var18 = (var16 & 4043) >> 1436800936;
                        var19 = var16 & 255;
                        if (var13 > var14) {
                          if (var15 >= var13) {
                            stackOut_21_0 = var15;
                            stackIn_22_0 = stackOut_21_0;
                            break L9;
                          } else {
                            stackOut_20_0 = var13;
                            stackIn_22_0 = stackOut_20_0;
                            break L9;
                          }
                        } else {
                          if (var14 <= var15) {
                            stackOut_18_0 = var15;
                            stackIn_22_0 = stackOut_18_0;
                            break L9;
                          } else {
                            stackOut_17_0 = var14;
                            stackIn_22_0 = stackOut_17_0;
                            break L9;
                          }
                        }
                      }
                      L10: {
                        var20 = stackIn_22_0;
                        if (var18 < var17) {
                          if (var17 <= var19) {
                            stackOut_28_0 = var19;
                            stackIn_29_0 = stackOut_28_0;
                            break L10;
                          } else {
                            stackOut_27_0 = var17;
                            stackIn_29_0 = stackOut_27_0;
                            break L10;
                          }
                        } else {
                          if (var18 <= var19) {
                            stackOut_25_0 = var19;
                            stackIn_29_0 = stackOut_25_0;
                            break L10;
                          } else {
                            stackOut_24_0 = var18;
                            stackIn_29_0 = stackOut_24_0;
                            break L10;
                          }
                        }
                      }
                      L11: {
                        var21 = stackIn_29_0;
                        if (var20 <= var21) {
                          break L11;
                        } else {
                          param4 = var15 * var21 / var20 | (var13 * var21 / var20 << -1116122352 | var14 * var21 / var20 << 221442344);
                          break L11;
                        }
                      }
                      param7++;
                      param2[param7] = param4;
                      break L7;
                    }
                    L12: {
                      param3++;
                      param4 = param8[param3];
                      if (param4 == 0) {
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    param7++;
                    var12++;
                    if (0 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var12 = param1;
                L13: while (true) {
                  L14: {
                    if (var12 >= 0) {
                      break L14;
                    } else {
                      L15: {
                        L16: {
                          param3++;
                          param4 = param8[param3];
                          if (0 != param4) {
                            break L16;
                          } else {
                            param7++;
                            if (0 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L17: {
                          var13 = 255 & param4 >> 1191395984;
                          var14 = (65290 & param4) >> -118330008;
                          var15 = 255 & param4;
                          var16 = param2[param7];
                          var17 = (16754807 & var16) >> -166496880;
                          var18 = var16 >> 1479300296 & 15;
                          var19 = var16 & 255;
                          if (var13 > var14) {
                            if (var13 > var15) {
                              stackOut_47_0 = var13;
                              stackIn_48_0 = stackOut_47_0;
                              break L17;
                            } else {
                              stackOut_46_0 = var15;
                              stackIn_48_0 = stackOut_46_0;
                              break L17;
                            }
                          } else {
                            if (var15 < var14) {
                              stackOut_44_0 = var14;
                              stackIn_48_0 = stackOut_44_0;
                              break L17;
                            } else {
                              stackOut_43_0 = var15;
                              stackIn_48_0 = stackOut_43_0;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          var20 = stackIn_48_0;
                          if (var18 >= var17) {
                            if (var18 > var19) {
                              stackOut_54_0 = var18;
                              stackIn_55_0 = stackOut_54_0;
                              break L18;
                            } else {
                              stackOut_53_0 = var19;
                              stackIn_55_0 = stackOut_53_0;
                              break L18;
                            }
                          } else {
                            if (var19 >= var17) {
                              stackOut_51_0 = var19;
                              stackIn_55_0 = stackOut_51_0;
                              break L18;
                            } else {
                              stackOut_50_0 = var17;
                              stackIn_55_0 = stackOut_50_0;
                              break L18;
                            }
                          }
                        }
                        L19: {
                          var21 = stackIn_55_0;
                          if (var21 < var20) {
                            param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 710271312 | var21 * var14 / var20 << -1724225816);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        param7++;
                        param2[param7] = param4;
                        break L15;
                      }
                      var12++;
                      if (0 == 0) {
                        continue L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  param3 = param3 + param5;
                  param7 = param7 + param9;
                  var11++;
                  if (0 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var2 = 0;
          if (param0 <= -111) {
            break L0;
          } else {
            var7 = null;
            ((kc) this).a(-93L, (byte[]) null, 126);
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
                        ((kc) this).field_e[var2] = qg.a(((kc) this).field_e[var2], qg.a(((kc) this).field_h[var2], ((kc) this).field_f[var2]));
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
                            ((kc) this).field_j[0] = qg.a(((kc) this).field_j[0], fb.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((kc) this).field_f[var3] = ((kc) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((kc) this).field_a[var3] = ((kc) this).field_j[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var8 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((kc) this).field_a[var3] = qg.a(((kc) this).field_a[var3], fb.field_j[var8][vg.a(255, (int)(((kc) this).field_f[vg.a(var3 - var8, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((kc) this).field_j[var3] = ((kc) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((kc) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((kc) this).field_a[var3] = qg.a(((kc) this).field_a[var3], fb.field_j[var4][vg.a((int)(((kc) this).field_j[vg.a(var3 - var4, 7)] >>> var5), 255)]);
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
                ((kc) this).field_j[var2] = ((kc) this).field_e[var2];
                ((kc) this).field_f[var2] = qg.a(((kc) this).field_h[var2], ((kc) this).field_e[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((kc) this).field_h[var2] = qg.a(qg.a(tf.a(255L, (long)((kc) this).field_k[var3 + 6]) << -900871224, qg.a(qg.a(qg.a(qg.a(tf.a((long)((kc) this).field_k[2 + var3] << 953476200, 280375465082880L), qg.a((long)((kc) this).field_k[var3] << 783770232, tf.a(71776119061217280L, (long)((kc) this).field_k[var3 - -1] << 1461624112))), tf.a(1095216660480L, (long)((kc) this).field_k[var3 - -3] << -391529184)), tf.a((long)((kc) this).field_k[var3 - -4], 255L) << 426542488), tf.a((long)((kc) this).field_k[var3 - -5] << 1213552656, 16711680L))), tf.a((long)((kc) this).field_k[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L1;
          }
        }
    }

    final void a(int param0, boolean param1, byte[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          ((kc) this).field_k[((kc) this).field_i] = (byte)tb.a((int) ((kc) this).field_k[((kc) this).field_i], 128 >>> vg.a(7, ((kc) this).field_b));
          ((kc) this).field_i = ((kc) this).field_i + 1;
          if ((((kc) this).field_i ^ -1) < -33) {
            L1: while (true) {
              if (((kc) this).field_i >= 64) {
                this.b((byte) -127);
                ((kc) this).field_i = 0;
                break L0;
              } else {
                ((kc) this).field_i = ((kc) this).field_i + 1;
                ((kc) this).field_k[((kc) this).field_i] = (byte) 0;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: while (true) {
          if (-33 >= (((kc) this).field_i ^ -1)) {
            o.a(((kc) this).field_g, 0, ((kc) this).field_k, 32, 32);
            this.b((byte) -122);
            var4 = 0;
            if (!param1) {
              var5 = param0;
              L3: while (true) {
                if (var4 >= 8) {
                  return;
                } else {
                  var6 = ((kc) this).field_e[var4];
                  param2[var5] = (byte)(int)(var6 >>> 796419064);
                  param2[1 + var5] = (byte)(int)(var6 >>> 1141110960);
                  param2[var5 - -2] = (byte)(int)(var6 >>> -1839473176);
                  param2[3 + var5] = (byte)(int)(var6 >>> -403539104);
                  param2[4 + var5] = (byte)(int)(var6 >>> -984102248);
                  param2[5 + var5] = (byte)(int)(var6 >>> -137356848);
                  param2[var5 + 6] = (byte)(int)(var6 >>> -295675448);
                  param2[7 + var5] = (byte)(int)var6;
                  var5 += 8;
                  var4++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            ((kc) this).field_i = ((kc) this).field_i + 1;
            ((kc) this).field_k[((kc) this).field_i] = (byte) 0;
            continue L2;
          }
        }
    }

    final void a(long param0, byte[] param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        var5 = 0;
        var6 = 7 & 8 + -((int)param0 & 7);
        var7 = 7 & ((kc) this).field_b;
        var9 = param0;
        var11 = 31;
        var12 = 0;
        L0: while (true) {
          if (-1 < (var11 ^ -1)) {
            L1: {
              if (param2 == -24893) {
                break L1;
              } else {
                ((kc) this).field_a = null;
                break L1;
              }
            }
            L2: while (true) {
              if (8L >= param0) {
                L3: {
                  if (-1L <= (param0 ^ -1L)) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = param1[var5] << var6 & 255;
                    ((kc) this).field_k[((kc) this).field_i] = (byte)tb.a((int) ((kc) this).field_k[((kc) this).field_i], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (((long)var7 - -param0 ^ -1L) <= -9L) {
                    L5: {
                      param0 = param0 - (long)(-var7 + 8);
                      ((kc) this).field_i = ((kc) this).field_i + 1;
                      ((kc) this).field_b = ((kc) this).field_b + (-var7 + 8);
                      if ((((kc) this).field_b ^ -1) != -513) {
                        break L5;
                      } else {
                        this.b((byte) -119);
                        ((kc) this).field_i = 0;
                        ((kc) this).field_b = 0;
                        break L5;
                      }
                    }
                    ((kc) this).field_k[((kc) this).field_i] = (byte)vg.a(var8 << 8 + -var7, 255);
                    ((kc) this).field_b = ((kc) this).field_b + (int)param0;
                    break L4;
                  } else {
                    ((kc) this).field_b = (int)((long)((kc) this).field_b + param0);
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param1[var5] << var6 | (param1[1 + var5] & 255) >>> 8 - var6;
                  if (0 > var8) {
                    break L6;
                  } else {
                    if (-257 < (var8 ^ -1)) {
                      L7: {
                        ((kc) this).field_k[((kc) this).field_i] = (byte)tb.a((int) ((kc) this).field_k[((kc) this).field_i], var8 >>> var7);
                        ((kc) this).field_i = ((kc) this).field_i + 1;
                        ((kc) this).field_b = ((kc) this).field_b + (8 - var7);
                        if ((((kc) this).field_b ^ -1) != -513) {
                          break L7;
                        } else {
                          this.b((byte) -120);
                          ((kc) this).field_i = 0;
                          ((kc) this).field_b = 0;
                          break L7;
                        }
                      }
                      ((kc) this).field_k[((kc) this).field_i] = (byte)vg.a(var8 << -var7 + 8, 255);
                      param0 = param0 - 8L;
                      var5++;
                      ((kc) this).field_b = ((kc) this).field_b + var7;
                      continue L2;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & ((kc) this).field_g[var11]) + (255 & (int)var9));
            ((kc) this).field_g[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 109) {
            field_d = null;
        }
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((kc) this).field_g[var2] = (byte) 0;
        }
        ((kc) this).field_i = 0;
        ((kc) this).field_b = 0;
        ((kc) this).field_k[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((kc) this).field_e[var2] = 0L;
        }
    }

    kc() {
        ((kc) this).field_a = new long[8];
        ((kc) this).field_b = 0;
        ((kc) this).field_k = new byte[64];
        ((kc) this).field_f = new long[8];
        ((kc) this).field_j = new long[8];
        ((kc) this).field_i = 0;
        ((kc) this).field_g = new byte[32];
        ((kc) this).field_e = new long[8];
        ((kc) this).field_h = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_m = new ke[10];
    }
}
