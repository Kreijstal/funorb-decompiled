/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    static h field_a;
    static String field_b;
    private ud field_j;
    private int field_d;
    private ud field_g;
    static int field_i;
    private int field_e;
    static String field_f;
    static boolean field_h;
    static String field_c;

    final byte[] a(int param0, int param1) {
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_45_0 = null;
            Object stackIn_46_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_54_0 = null;
            var18 = HoldTheLine.field_D;
            var3 = (Object) (Object) ((sk) this).field_g;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(param1 * 6 - -6) <= ((sk) this).field_j.c(-32261)) {
                    ((sk) this).field_j.a(25971, (long)(param1 * 6));
                    ((sk) this).field_j.a(-1, 0, 6, oi.field_d);
                    var4_int = (16711680 & oi.field_d[0] << 16) + ((oi.field_d[1] & 255) << 8) - -(oi.field_d[2] & 255);
                    var5 = ((255 & oi.field_d[3]) << 16) - -((oi.field_d[4] & 255) << 8) + (255 & oi.field_d[5]);
                    if (var4_int >= 0) {
                      if (var4_int <= ((sk) this).field_e) {
                        if (var5 > 0) {
                          if (~(long)var5 >= ~(((sk) this).field_g.c(-32261) / 520L)) {
                            L1: {
                              if (param0 > 99) {
                                break L1;
                              } else {
                                ((sk) this).field_j = null;
                                break L1;
                              }
                            }
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    ((sk) this).field_g.a(25971, (long)(var5 * 520));
                                    var9 = var4_int - var7;
                                    if (param1 > 65535) {
                                      L4: {
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 10;
                                      ((sk) this).field_g.a(-1, 0, var14 + var9, oi.field_d);
                                      var11 = (65280 & oi.field_d[4] << 8) - -(oi.field_d[5] & 255);
                                      var13 = 255 & oi.field_d[9];
                                      var12 = (255 & oi.field_d[8]) + (65280 & oi.field_d[7] << 8) + ((oi.field_d[6] & 255) << 16);
                                      var10 = (oi.field_d[0] << 24 & -16777216) - -((oi.field_d[1] & 255) << 16) - (-(65280 & oi.field_d[2] << 8) - (255 & oi.field_d[3]));
                                      break L3;
                                    } else {
                                      L5: {
                                        if (var9 <= 512) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      var14 = 8;
                                      ((sk) this).field_g.a(-1, 0, var9 + var14, oi.field_d);
                                      var13 = 255 & oi.field_d[7];
                                      var12 = (oi.field_d[6] & 255) + (oi.field_d[4] << 16 & 16711680) + (oi.field_d[5] << 8 & 65280);
                                      var11 = ((255 & oi.field_d[2]) << 8) - -(255 & oi.field_d[3]);
                                      var10 = ((255 & oi.field_d[0]) << 8) - -(oi.field_d[1] & 255);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param1) {
                                    if (var11 == var8) {
                                      if (((sk) this).field_d == var13) {
                                        if (var12 >= 0) {
                                          if (((sk) this).field_g.c(-32261) / 520L >= (long)var12) {
                                            var15 = var14 + var9;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var16 >= var15) {
                                                var5 = var12;
                                                var8++;
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = oi.field_d[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_44_0 = null;
                                            stackIn_45_0 = stackOut_44_0;
                                            stackOut_45_0 = stackIn_45_0;
                                            stackIn_46_0 = stackOut_45_0;
                                            return (byte[]) (Object) stackIn_46_0;
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
                              }
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
                stackOut_54_0 = null;
                stackIn_55_0 = stackOut_54_0;
                return (byte[]) (Object) stackIn_55_0;
              }
              return stackIn_53_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((sk) this).field_d;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 18;
        field_c = null;
        field_f = null;
        field_a = null;
    }

    final static int a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!qh.c(-105)) {
                L2: {
                  kl.field_q.a(cm.a((byte) 110, jb.field_U, lb.field_x), cm.a((byte) 110, rf.field_X, nc.field_g), 4);
                  if (!kl.field_q.a(-1)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (0 > kl.field_q.field_g) {
                        break L4;
                      } else {
                        L5: {
                          var3 = ii.field_e[kl.field_q.field_g];
                          if (2 == var3) {
                            break L5;
                          } else {
                            if (5 == var3) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        int discarded$2 = 0;
                        ah.b();
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (2 == pa.field_h) {
                      break L3;
                    } else {
                      int discarded$3 = 0;
                      ah.b();
                      break L3;
                    }
                  }
                }
                L6: {
                  if (0 != var3) {
                    break L6;
                  } else {
                    if (pa.field_h == 2) {
                      var4 = bb.b(-1) - cg.field_g;
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        pe.a(5, true, (byte) -121);
                        var3 = 2;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                stackOut_25_0 = var3;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L7: {
                  kl.field_q.b(-1);
                  if (kl.field_q.a(-1)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (aa.field_n == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "sk.A(" + 18 + ')');
        }
        return stackIn_26_0;
    }

    private final boolean a(int param0, int param1, int param2, boolean param3, byte[] param4) {
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
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            var16 = HoldTheLine.field_D;
            try {
              var6_ref2 = (Object) (Object) ((sk) this).field_g;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param3) {
                        var7_int = (int)((((sk) this).field_g.c(-32261) - -519L) / 520L);
                        if (var7_int == 0) {
                          var7_int = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (~(long)(6 + 6 * param0) >= ~((sk) this).field_j.c(-32261)) {
                          L2: {
                            ((sk) this).field_j.a(25971, (long)(6 * param0));
                            ((sk) this).field_j.a(-1, 0, 6, oi.field_d);
                            var7_int = (255 & oi.field_d[5]) + ((oi.field_d[3] & 255) << 16) - -(65280 & oi.field_d[4] << 8);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if ((long)var7_int <= ((sk) this).field_g.c(-32261) / 520L) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        } else {
                          stackOut_4_0 = 0;
                          stackIn_5_0 = stackOut_4_0;
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          return stackIn_6_0 != 0;
                        }
                      }
                    }
                    L3: {
                      oi.field_d[2] = (byte)param1;
                      oi.field_d[5] = (byte)var7_int;
                      oi.field_d[4] = (byte)(var7_int >> 8);
                      oi.field_d[3] = (byte)(var7_int >> 16);
                      oi.field_d[0] = (byte)(param1 >> 16);
                      oi.field_d[1] = (byte)(param1 >> 8);
                      ((sk) this).field_j.a(25971, (long)(param0 * 6));
                      ((sk) this).field_j.a((byte) 125, 6, 0, oi.field_d);
                      if (param2 > 73) {
                        break L3;
                      } else {
                        field_c = null;
                        break L3;
                      }
                    }
                    var8 = 0;
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (param1 <= var8) {
                          break L5;
                        } else {
                          L6: {
                            var10 = 0;
                            if (!param3) {
                              break L6;
                            } else {
                              L7: {
                                ((sk) this).field_g.a(25971, (long)(520 * var7_int));
                                if (param0 > 65535) {
                                  try {
                                    L8: {
                                      ((sk) this).field_g.a(-1, 0, 10, oi.field_d);
                                      decompiledRegionSelector1 = 0;
                                      break L8;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L9: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L9;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var11 = (oi.field_d[3] & 255) + ((oi.field_d[0] & 255) << 24) + (((oi.field_d[1] & 255) << 16) - -((oi.field_d[2] & 255) << 8));
                                    var12 = (oi.field_d[5] & 255) + ((255 & oi.field_d[4]) << 8);
                                    var13 = oi.field_d[9] & 255;
                                    var10 = (255 & oi.field_d[8]) + (16711680 & oi.field_d[6] << 16) - -(65280 & oi.field_d[7] << 8);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  try {
                                    L10: {
                                      ((sk) this).field_g.a(-1, 0, 8, oi.field_d);
                                      decompiledRegionSelector0 = 0;
                                      break L10;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L11: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L11;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var13 = 255 & oi.field_d[7];
                                    var12 = (oi.field_d[3] & 255) + (65280 & oi.field_d[2] << 8);
                                    var10 = (255 & oi.field_d[6]) + ((oi.field_d[4] & 255) << 16) - -(65280 & oi.field_d[5] << 8);
                                    var11 = (255 & oi.field_d[1]) + ((oi.field_d[0] & 255) << 8);
                                    break L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L12: {
                                if (var11 != param0) {
                                  break L12;
                                } else {
                                  if (var12 != var9) {
                                    break L12;
                                  } else {
                                    if (((sk) this).field_d != var13) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var10 < 0) {
                                          break L13;
                                        } else {
                                          if (~(long)var10 >= ~(((sk) this).field_g.c(-32261) / 520L)) {
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
                                      return stackIn_43_0 != 0;
                                    }
                                  }
                                }
                              }
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              stackOut_36_0 = stackIn_36_0;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            }
                          }
                          L14: {
                            if (0 != var10) {
                              break L14;
                            } else {
                              L15: {
                                var10 = (int)((519L + ((sk) this).field_g.c(-32261)) / 520L);
                                param3 = false;
                                if (var10 == 0) {
                                  var10++;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L16: {
                            if (512 < param1 + -var8) {
                              break L16;
                            } else {
                              var10 = 0;
                              break L16;
                            }
                          }
                          L17: {
                            if (65535 >= param0) {
                              L18: {
                                oi.field_d[6] = (byte)var10;
                                oi.field_d[0] = (byte)(param0 >> 8);
                                oi.field_d[3] = (byte)var9;
                                oi.field_d[2] = (byte)(var9 >> 8);
                                oi.field_d[1] = (byte)param0;
                                oi.field_d[5] = (byte)(var10 >> 8);
                                oi.field_d[7] = (byte)((sk) this).field_d;
                                oi.field_d[4] = (byte)(var10 >> 16);
                                ((sk) this).field_g.a(25971, (long)(520 * var7_int));
                                ((sk) this).field_g.a((byte) 126, 8, 0, oi.field_d);
                                var11 = param1 - var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((sk) this).field_g.a((byte) 126, var11, var8, param4);
                              var8 = var8 + var11;
                              break L17;
                            } else {
                              L19: {
                                oi.field_d[3] = (byte)param0;
                                oi.field_d[0] = (byte)(param0 >> 24);
                                oi.field_d[2] = (byte)(param0 >> 8);
                                oi.field_d[1] = (byte)(param0 >> 16);
                                oi.field_d[8] = (byte)var10;
                                oi.field_d[4] = (byte)(var9 >> 8);
                                oi.field_d[5] = (byte)var9;
                                oi.field_d[6] = (byte)(var10 >> 16);
                                oi.field_d[9] = (byte)((sk) this).field_d;
                                oi.field_d[7] = (byte)(var10 >> 8);
                                ((sk) this).field_g.a(25971, (long)(var7_int * 520));
                                ((sk) this).field_g.a((byte) 126, 10, 0, oi.field_d);
                                var11 = -var8 + param1;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((sk) this).field_g.a((byte) 125, var11, var8, param4);
                              var8 = var8 + var11;
                              break L17;
                            }
                          }
                          var9++;
                          var7_int = var10;
                          continue L4;
                        }
                      }
                      stackOut_63_0 = 1;
                      stackIn_64_0 = stackOut_63_0;
                      stackOut_64_0 = stackIn_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_66_0 = 0;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0 != 0;
                }
                return stackIn_65_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L20: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_70_0 = (RuntimeException) var6_ref;
                stackOut_70_1 = new StringBuilder().append("sk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (param4 == null) {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L20;
                } else {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "{...}";
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  break L20;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, boolean param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        Object var8 = null;
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
          var5 = (Object) (Object) ((sk) this).field_g;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (((sk) this).field_e < param2) {
                    break L1;
                  } else {
                    L2: {
                      if (!param3) {
                        break L2;
                      } else {
                        var8 = null;
                        boolean discarded$3 = this.a(-91, 110, -101, false, (byte[]) null);
                        break L2;
                      }
                    }
                    L3: {
                      var6 = this.a(param1, param2, 113, true, param0) ? 1 : 0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var6 = this.a(param1, param2, 96, false, param0) ? 1 : 0;
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
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("sk.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    sk(int param0, ud param1, ud param2, int param3) {
        ((sk) this).field_j = null;
        ((sk) this).field_g = null;
        ((sk) this).field_e = 65000;
        try {
            ((sk) this).field_e = param3;
            ((sk) this).field_g = param1;
            ((sk) this).field_j = param2;
            ((sk) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "sk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Connection restored.";
        field_a = new h();
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_f = "Beat your competitors around <col=1>8</col> laps of the course to progress through the game.<br><br>Power-ups scattered around the course will give bonuses to those cars that collect them.";
        field_h = false;
    }
}
