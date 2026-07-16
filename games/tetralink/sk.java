/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    private int field_g;
    private p field_i;
    static int field_c;
    static p field_f;
    static wf field_a;
    private int field_d;
    static int[] field_b;
    static hl field_h;
    private p field_e;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        Object var8 = null;
        int stackIn_10_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        L0: {
          if (param2 == 13061) {
            break L0;
          } else {
            var8 = null;
            sk.a((byte) 95, (oh) null);
            break L0;
          }
        }
        var5 = (Object) (Object) ((sk) this).field_i;
        synchronized (var5) {
          L1: {
            L2: {
              if (0 > param1) {
                break L2;
              } else {
                if (((sk) this).field_g < param1) {
                  break L2;
                } else {
                  L3: {
                    var6 = this.a(true, param1, param3, 4, param0) ? 1 : 0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      var6 = this.a(false, param1, param3, 4, param0) ? 1 : 0;
                      break L3;
                    }
                  }
                  stackOut_9_0 = var6;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException();
          }
        }
        return stackIn_10_0 != 0;
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, byte[] param4) {
        try {
            Object var6 = null;
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
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            boolean stackIn_18_0 = false;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_61_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            boolean stackOut_17_0 = false;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_60_0 = 0;
            var16 = TetraLink.field_J;
            var6 = (Object) (Object) ((sk) this).field_i;
            synchronized (var6) {
              try {
                L0: {
                  L1: {
                    L2: {
                      if (param0) {
                        break L2;
                      } else {
                        var7_int = (int)((519L + ((sk) this).field_i.b(-200000001)) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          if (var16 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    if (((sk) this).field_e.b(param3 ^ -200000005) >= (long)(6 + param2 * 6)) {
                      L3: {
                        ((sk) this).field_e.a((long)(param2 * 6), 0);
                        ((sk) this).field_e.a(cf.field_q, 6, 0, (byte) 46);
                        var7_int = (65280 & cf.field_q[4] << -204922904) + (16711680 & cf.field_q[3] << -943989424) - -(cf.field_q[5] & 255);
                        if (-1 <= (var7_int ^ -1)) {
                          break L3;
                        } else {
                          if ((long)var7_int > ((sk) this).field_i.b(-200000001) / 520L) {
                            break L3;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackOut_13_0 = stackIn_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                  cf.field_q[2] = (byte)param1;
                  cf.field_q[0] = (byte)(param1 >> 767205392);
                  cf.field_q[5] = (byte)var7_int;
                  cf.field_q[3] = (byte)(var7_int >> -1507211984);
                  cf.field_q[1] = (byte)(param1 >> 2099284040);
                  cf.field_q[param3] = (byte)(var7_int >> -1892191128);
                  ((sk) this).field_e.a((long)(6 * param2), 0);
                  ((sk) this).field_e.a(-19735, cf.field_q, 0, 6);
                  var8 = 0;
                  var9 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (param1 <= var8) {
                          break L6;
                        } else {
                          var10 = 0;
                          stackOut_17_0 = param0;
                          stackIn_59_0 = stackOut_17_0 ? 1 : 0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var16 != 0) {
                            break L5;
                          } else {
                            L7: {
                              if (!stackIn_18_0) {
                                break L7;
                              } else {
                                L8: {
                                  ((sk) this).field_i.a((long)(var7_int * 520), 0);
                                  if (param2 > 65535) {
                                    break L8;
                                  } else {
                                    try {
                                      L9: {
                                        ((sk) this).field_i.a(cf.field_q, 8, 0, (byte) 43);
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L10: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        if (var16 == 0) {
                                          decompiledRegionSelector0 = 1;
                                          break L10;
                                        } else {
                                          decompiledRegionSelector0 = 0;
                                          break L10;
                                        }
                                      }
                                    }
                                    if (decompiledRegionSelector0 == 0) {
                                      var13 = cf.field_q[7] & 255;
                                      var12 = ((255 & cf.field_q[2]) << 1364958408) - -(255 & cf.field_q[3]);
                                      var11 = ((cf.field_q[0] & 255) << -59165784) - -(255 & cf.field_q[1]);
                                      var10 = (16711680 & cf.field_q[4] << -113013136) + (cf.field_q[5] << 637832264 & 65280) + (cf.field_q[6] & 255);
                                      break L8;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                try {
                                  L11: {
                                    ((sk) this).field_i.a(cf.field_q, 10, 0, (byte) 54);
                                    break L11;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L12: {
                                    var14 = (EOFException) (Object) decompiledCaughtException;
                                    break L12;
                                  }
                                }
                                L13: {
                                  var12 = (cf.field_q[5] & 255) + ((cf.field_q[4] & 255) << 1093401032);
                                  var13 = cf.field_q[9] & 255;
                                  var11 = ((255 & cf.field_q[2]) << 374339208) + ((255 & cf.field_q[0]) << -787378792) - (-((255 & cf.field_q[1]) << 93492336) + -(255 & cf.field_q[3]));
                                  var10 = ((255 & cf.field_q[6]) << -1431389840) + (cf.field_q[7] << 176881448 & 65280) + (255 & cf.field_q[8]);
                                  if (var11 != param2) {
                                    break L13;
                                  } else {
                                    if (var12 != var9) {
                                      break L13;
                                    } else {
                                      if (((sk) this).field_d != var13) {
                                        break L13;
                                      } else {
                                        L14: {
                                          if (0 > var10) {
                                            break L14;
                                          } else {
                                            if ((long)var10 <= ((sk) this).field_i.b(-200000001) / 520L) {
                                              break L7;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        stackOut_38_0 = 0;
                                        stackIn_39_0 = stackOut_38_0;
                                        stackOut_39_0 = stackIn_39_0;
                                        stackIn_40_0 = stackOut_39_0;
                                        return stackIn_40_0 != 0;
                                      }
                                    }
                                  }
                                }
                                stackOut_32_0 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                stackOut_33_0 = stackIn_33_0;
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0 != 0;
                              }
                            }
                            L15: {
                              if (-1 != (var10 ^ -1)) {
                                break L15;
                              } else {
                                L16: {
                                  var10 = (int)((519L + ((sk) this).field_i.b(param3 ^ -200000005)) / 520L);
                                  param0 = false;
                                  if (var10 != 0) {
                                    break L16;
                                  } else {
                                    var10++;
                                    break L16;
                                  }
                                }
                                if (var10 != var7_int) {
                                  break L15;
                                } else {
                                  var10++;
                                  break L15;
                                }
                              }
                            }
                            L17: {
                              if (512 < -var8 + param1) {
                                break L17;
                              } else {
                                var10 = 0;
                                break L17;
                              }
                            }
                            L18: {
                              L19: {
                                if (param2 > 65535) {
                                  break L19;
                                } else {
                                  L20: {
                                    cf.field_q[1] = (byte)param2;
                                    cf.field_q[5] = (byte)(var10 >> -210266552);
                                    cf.field_q[3] = (byte)var9;
                                    cf.field_q[0] = (byte)(param2 >> -572150584);
                                    cf.field_q[2] = (byte)(var9 >> -1324196248);
                                    cf.field_q[4] = (byte)(var10 >> -684794256);
                                    cf.field_q[7] = (byte)((sk) this).field_d;
                                    cf.field_q[6] = (byte)var10;
                                    ((sk) this).field_i.a((long)(520 * var7_int), 0);
                                    ((sk) this).field_i.a(-19735, cf.field_q, 0, 8);
                                    var11 = param1 - var8;
                                    if (-513 > (var11 ^ -1)) {
                                      var11 = 512;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((sk) this).field_i.a(-19735, param4, var8, var11);
                                  var8 = var8 + var11;
                                  if (var16 == 0) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L21: {
                                cf.field_q[6] = (byte)(var10 >> -228787216);
                                cf.field_q[1] = (byte)(param2 >> -569588272);
                                cf.field_q[4] = (byte)(var9 >> -1964063608);
                                cf.field_q[7] = (byte)(var10 >> 798263016);
                                cf.field_q[5] = (byte)var9;
                                cf.field_q[3] = (byte)param2;
                                cf.field_q[8] = (byte)var10;
                                cf.field_q[2] = (byte)(param2 >> 1771228136);
                                cf.field_q[0] = (byte)(param2 >> 1896947960);
                                cf.field_q[9] = (byte)((sk) this).field_d;
                                ((sk) this).field_i.a((long)(520 * var7_int), 0);
                                ((sk) this).field_i.a(-19735, cf.field_q, 0, 10);
                                var11 = -var8 + param1;
                                if ((var11 ^ -1) >= -511) {
                                  break L21;
                                } else {
                                  var11 = 510;
                                  break L21;
                                }
                              }
                              ((sk) this).field_i.a(param3 ^ -19731, param4, var8, var11);
                              var8 = var8 + var11;
                              break L18;
                            }
                            var9++;
                            var7_int = var10;
                            if (var16 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      stackOut_57_0 = 1;
                      stackIn_58_0 = stackOut_57_0;
                      stackOut_58_0 = stackIn_58_0;
                      stackIn_59_0 = stackOut_58_0;
                      break L5;
                    }
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                stackOut_60_0 = 0;
                stackIn_61_0 = stackOut_60_0;
                return stackIn_61_0 != 0;
              }
              return stackIn_59_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (aa.field_bc != null) {
        }
        uk.field_x = 3.1415927410125732f;
        sa.a(-90, true);
        ti.field_g[param0] = (double)rn.field_d * Math.sin((double)dj.field_h);
        ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
        eo.a(-53);
        wb.a(false, param0 + -7869);
        bf discarded$0 = lb.a(pi.field_c, 573509761);
        int var1 = ui.a(3, param0 + 1692);
        if (var1 == se.field_b) {
            var1 = (se.field_b + 1) % 3;
        }
        se.field_b = var1;
        dl.a(27654, qc.field_bb[var1 + 1]);
    }

    final byte[] a(byte param0, int param1) {
        try {
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_41_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            byte[] stackIn_57_0 = null;
            byte[] stackIn_58_0 = null;
            Object stackIn_60_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_56_0 = null;
            byte[] stackOut_57_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_40_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_59_0 = null;
            var18 = TetraLink.field_J;
            var3 = (Object) (Object) ((sk) this).field_i;
            synchronized (var3) {
              try {
                L0: {
                  if (((sk) this).field_e.b(-200000001) >= (long)(6 * param1 + 6)) {
                    ((sk) this).field_e.a((long)(param1 * 6), 0);
                    ((sk) this).field_e.a(cf.field_q, 6, 0, (byte) 92);
                    var4_int = (255 & cf.field_q[2]) + ((16711680 & cf.field_q[0] << -1756434320) + ((cf.field_q[1] & 255) << 1931198824));
                    var5 = (cf.field_q[5] & 255) + ((255 & cf.field_q[3]) << -1134131376) + (65280 & cf.field_q[4] << 1220572360);
                    if (0 <= var4_int) {
                      if (((sk) this).field_g >= var4_int) {
                        if ((var5 ^ -1) < -1) {
                          if ((long)var5 <= ((sk) this).field_i.b(param0 ^ 200000029) / 520L) {
                            if (param0 == -30) {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              var8 = 0;
                              L1: while (true) {
                                if (var4_int <= var7) {
                                  stackOut_56_0 = (byte[]) var6;
                                  stackIn_57_0 = stackOut_56_0;
                                  stackOut_57_0 = (byte[]) (Object) stackIn_57_0;
                                  stackIn_58_0 = stackOut_57_0;
                                  break L0;
                                } else {
                                  if (var5 != 0) {
                                    L2: {
                                      L3: {
                                        ((sk) this).field_i.a((long)(520 * var5), 0);
                                        var9 = -var7 + var4_int;
                                        if ((param1 ^ -1) < -65536) {
                                          break L3;
                                        } else {
                                          L4: {
                                            var14 = 8;
                                            if (var9 > 512) {
                                              var9 = 512;
                                              break L4;
                                            } else {
                                              break L4;
                                            }
                                          }
                                          ((sk) this).field_i.a(cf.field_q, var14 + var9, 0, (byte) 56);
                                          var13 = 255 & cf.field_q[7];
                                          var10 = ((255 & cf.field_q[0]) << 48238184) - -(cf.field_q[1] & 255);
                                          var11 = (cf.field_q[3] & 255) + (cf.field_q[2] << 1587834056 & 65280);
                                          var12 = (255 & cf.field_q[6]) + ((255 & cf.field_q[4]) << 133046512) + (cf.field_q[5] << 1332699464 & 65280);
                                          if (var18 == 0) {
                                            break L2;
                                          } else {
                                            break L3;
                                          }
                                        }
                                      }
                                      L5: {
                                        if (var9 <= 510) {
                                          break L5;
                                        } else {
                                          var9 = 510;
                                          break L5;
                                        }
                                      }
                                      var14 = 10;
                                      ((sk) this).field_i.a(cf.field_q, var9 - -var14, 0, (byte) 112);
                                      var10 = (255 & cf.field_q[3]) + (cf.field_q[2] << 229327016 & 65280) + (cf.field_q[0] << 997751640 & -16777216) - -((cf.field_q[1] & 255) << -1613150416);
                                      var12 = (65280 & cf.field_q[7] << 1567455336) + ((255 & cf.field_q[6]) << -1154109936) - -(cf.field_q[8] & 255);
                                      var13 = cf.field_q[9] & 255;
                                      var11 = (cf.field_q[5] & 255) + ((255 & cf.field_q[4]) << -267401752);
                                      break L2;
                                    }
                                    if (param1 == var10) {
                                      if (var8 == var11) {
                                        if (var13 == ((sk) this).field_d) {
                                          if (-1 >= (var12 ^ -1)) {
                                            if (((sk) this).field_i.b(-200000001) / 520L >= (long)var12) {
                                              var15 = var14 + var9;
                                              var8++;
                                              var16 = var14;
                                              L6: while (true) {
                                                L7: {
                                                  if (var15 <= var16) {
                                                    var5 = var12;
                                                    break L7;
                                                  } else {
                                                    int incrementValue$1 = var7;
                                                    var7++;
                                                    var6[incrementValue$1] = cf.field_q[var16];
                                                    var16++;
                                                    if (var18 != 0) {
                                                      break L7;
                                                    } else {
                                                      continue L6;
                                                    }
                                                  }
                                                }
                                                continue L1;
                                              }
                                            } else {
                                              stackOut_46_0 = null;
                                              stackIn_47_0 = stackOut_46_0;
                                              stackOut_47_0 = stackIn_47_0;
                                              stackIn_48_0 = stackOut_47_0;
                                              return (byte[]) (Object) stackIn_48_0;
                                            }
                                          } else {
                                            return null;
                                          }
                                        } else {
                                          stackOut_40_0 = null;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackOut_41_0 = stackIn_41_0;
                                          stackIn_42_0 = stackOut_41_0;
                                          return (byte[]) (Object) stackIn_42_0;
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
                              stackOut_18_0 = null;
                              stackIn_19_0 = stackOut_18_0;
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              return (byte[]) (Object) stackIn_20_0;
                            }
                          } else {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            return (byte[]) (Object) stackIn_16_0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        return (byte[]) (Object) stackIn_10_0;
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
                stackOut_59_0 = null;
                stackIn_60_0 = stackOut_59_0;
                return (byte[]) (Object) stackIn_60_0;
              }
              return stackIn_58_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.awt.Frame a(int param0, ie param1, int param2, int param3, int param4, int param5) {
        nl[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        nl[] var10 = null;
        vl var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var9 = TetraLink.field_J;
        if (param1.a((byte) -119)) {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                var10 = mn.a(param1, param2 ^ 37956680);
                var6 = var10;
                if (var6 != null) {
                  var7_int = 0;
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      if (var8 >= var10.length) {
                        break L3;
                      } else {
                        stackOut_7_0 = param3;
                        stackOut_7_1 = var10[var8].field_k;
                        stackIn_21_0 = stackOut_7_0;
                        stackIn_21_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var9 != 0) {
                          break L0;
                        } else {
                          L4: {
                            if (stackIn_8_0 != stackIn_8_1) {
                              break L4;
                            } else {
                              if (param5 != var10[var8].field_e) {
                                break L4;
                              } else {
                                L5: {
                                  if (param4 == 0) {
                                    break L5;
                                  } else {
                                    if (param4 == var10[var8].field_i) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L6: {
                                  if (var7_int == 0) {
                                    break L6;
                                  } else {
                                    if (param0 >= var10[var8].field_h) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                param0 = var10[var8].field_h;
                                var7_int = 1;
                                break L4;
                              }
                            }
                          }
                          var8++;
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (var7_int != 0) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
            stackOut_20_0 = param2;
            stackOut_20_1 = 10;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L0;
          }
          L7: {
            if (stackIn_21_0 == stackIn_21_1) {
              break L7;
            } else {
              sk.a(78);
              break L7;
            }
          }
          var11 = param1.a(0, param4, param3, param5, param0);
          L8: while (true) {
            L9: {
              if (var11.field_d != 0) {
                break L9;
              } else {
                tb.a(false, 10L);
                if (var9 == 0) {
                  continue L8;
                } else {
                  break L9;
                }
              }
            }
            var7 = (java.awt.Frame) var11.field_f;
            if (var7 != null) {
              if ((var11.field_d ^ -1) == -3) {
                r.a(param1, var7, 0);
                return null;
              } else {
                return var7;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, oh param1) {
        if (param0 < 104) {
            return;
        }
        nm.b((byte) 96);
        ra.a(param1.field_C, param1.field_t, param1.field_F);
    }

    public final String toString() {
        return "" + ((sk) this).field_d;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != 29187) {
            return;
        }
        field_f = null;
        field_a = null;
        field_h = null;
    }

    final static hm a(byte param0, String param1, boolean param2, String param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        if (param0 != -79) {
          return null;
        } else {
          L0: {
            var4 = 0L;
            var6 = null;
            if (-1 == param1.indexOf('@')) {
              var7 = (CharSequence) (Object) param1;
              var4 = il.a(-23718, var7);
              break L0;
            } else {
              var6 = (Object) (Object) param1;
              break L0;
            }
          }
          return ug.a(var4, (String) var6, param2, param3, -6336);
        }
    }

    final static void b(int param0) {
        gd var1_ref_gd = null;
        el var1_ref_el = null;
        int var1 = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        el stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        el stackOut_12_0 = null;
        mc stackOut_20_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        var2 = TetraLink.field_J;
        var1_ref_gd = (gd) (Object) gl.field_p.c(false);
        L0: while (true) {
          L1: {
            L2: {
              if (var1_ref_gd == null) {
                break L2;
              } else {
                stackOut_2_0 = var1_ref_gd.field_Sb ^ -1;
                stackOut_2_1 = -1;
                stackIn_32_0 = stackOut_2_0;
                stackIn_32_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var2 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 < stackIn_3_1) {
                      var1_ref_gd.field_Sb = var1_ref_gd.field_Sb - 1;
                      if (var1_ref_gd.field_Sb == 0) {
                        var1_ref_gd.field_Xb = 0;
                        if (!var1_ref_gd.d((byte) -1)) {
                          break L3;
                        } else {
                          var1_ref_gd.b(false);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var1_ref_gd = (gd) (Object) gl.field_p.a((byte) -70);
                  if (var2 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var1_ref_el = (el) (Object) jl.field_a.c(false);
            L4: while (true) {
              L5: {
                L6: {
                  if (var1_ref_el == null) {
                    break L6;
                  } else {
                    stackOut_12_0 = (el) var1_ref_el;
                    stackIn_21_0 = (Object) (Object) stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var2 != 0) {
                      break L5;
                    } else {
                      L7: {
                        if ((stackIn_13_0.field_Ub ^ -1) < -1) {
                          var1_ref_el.field_Ub = var1_ref_el.field_Ub - 1;
                          if (-1 != (var1_ref_el.field_Ub ^ -1)) {
                            break L7;
                          } else {
                            var1_ref_el.field_gc = 0;
                            if (var1_ref_el.h(-597)) {
                              var1_ref_el.b(false);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      var1_ref_el = (el) (Object) jl.field_a.a((byte) -70);
                      if (var2 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackOut_20_0 = ui.field_d.c(false);
                stackIn_21_0 = (Object) (Object) stackOut_20_0;
                break L5;
              }
              var1_ref_gd = (gd) (Object) stackIn_21_0;
              L8: while (true) {
                L9: {
                  if (var1_ref_gd == null) {
                    break L9;
                  } else {
                    stackOut_23_0 = 0;
                    stackOut_23_1 = var1_ref_gd.field_Sb;
                    stackIn_32_0 = stackOut_23_0;
                    stackIn_32_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (var2 != 0) {
                      break L1;
                    } else {
                      L10: {
                        if (stackIn_24_0 >= stackIn_24_1) {
                          break L10;
                        } else {
                          var1_ref_gd.field_Sb = var1_ref_gd.field_Sb - 1;
                          if ((var1_ref_gd.field_Sb ^ -1) == -1) {
                            var1_ref_gd.field_Xb = 0;
                            if (var1_ref_gd.d((byte) -1)) {
                              var1_ref_gd.b(false);
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var1_ref_gd = (gd) (Object) ui.field_d.a((byte) -70);
                      if (var2 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                stackOut_31_0 = 63;
                stackOut_31_1 = (param0 - -48) / 57;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                break L1;
              }
            }
          }
          var1 = stackIn_32_0 % stackIn_32_1;
          return;
        }
    }

    sk(int param0, p param1, p param2, int param3) {
        ((sk) this).field_i = null;
        ((sk) this).field_g = 65000;
        ((sk) this).field_e = null;
        ((sk) this).field_e = param2;
        ((sk) this).field_g = param3;
        ((sk) this).field_d = param0;
        ((sk) this).field_i = param1;
    }

    final static String a(String[] args, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var11 = TetraLink.field_J;
          if (param2 > 118) {
            break L0;
          } else {
            field_c = -116;
            break L0;
          }
        }
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L1: while (true) {
          var6_int = param1.indexOf("<%", var5);
          stackOut_3_0 = var6_int ^ -1;
          stackIn_4_0 = stackOut_3_0;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_4_0 <= -1) {
                  break L4;
                } else {
                  if (var11 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_6_0 = 2 + var6_int;
              stackIn_8_0 = stackOut_6_0;
              L5: while (true) {
                L6: {
                  var5 = stackIn_8_0;
                  if (var5 >= var3) {
                    break L6;
                  } else {
                    stackOut_9_0 = fd.a(param1.charAt(var5), (byte) 112);
                    stackIn_4_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var11 != 0) {
                      continue L2;
                    } else {
                      if (!stackIn_10_0) {
                        break L6;
                      } else {
                        var5++;
                        break L6;
                      }
                    }
                  }
                }
                var7_ref_String = param1.substring(var6_int + 2, var5);
                if (!ni.a((CharSequence) (Object) var7_ref_String, 10)) {
                  continue L1;
                } else {
                  stackOut_13_0 = var5;
                  stackOut_13_1 = var3;
                  stackIn_7_0 = stackOut_13_0;
                  stackIn_7_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (var11 != 0) {
                    stackOut_7_0 = stackIn_7_0 + stackIn_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    continue L5;
                  } else {
                    L7: {
                      if (stackIn_14_0 >= stackIn_14_1) {
                        break L7;
                      } else {
                        if (62 == param1.charAt(var5)) {
                          var5++;
                          var8 = rc.a((CharSequence) (Object) var7_ref_String, 10);
                          var4 = var4 + (args[var8].length() - (-var6_int + var5));
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L8: while (true) {
              L9: {
                var8 = param1.indexOf("<%", var5);
                if ((var8 ^ -1) > -1) {
                  StringBuilder discarded$3 = var6.append(param1.substring(var7));
                  break L9;
                } else {
                  if (var11 != 0) {
                    break L9;
                  } else {
                    var5 = var8 - -2;
                    L10: while (true) {
                      L11: {
                        if (var3 <= var5) {
                          break L11;
                        } else {
                          if (!fd.a(param1.charAt(var5), (byte) 115)) {
                            break L11;
                          } else {
                            var5++;
                            continue L10;
                          }
                        }
                      }
                      var9 = param1.substring(2 + var8, var5);
                      if (ni.a((CharSequence) (Object) var9, 10)) {
                        L12: {
                          if (var5 >= var3) {
                            break L12;
                          } else {
                            if (param1.charAt(var5) != 62) {
                              break L12;
                            } else {
                              var5++;
                              var10 = rc.a((CharSequence) (Object) var9, 10);
                              StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                              StringBuilder discarded$5 = var6.append(args[var10]);
                              var7 = var5;
                              break L12;
                            }
                          }
                        }
                        continue L8;
                      } else {
                        continue L8;
                      }
                    }
                  }
                }
              }
              return var6.toString();
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 256;
        field_b = new int[]{100, 100, 100, 100, 200, 100, 100, 200};
    }
}
