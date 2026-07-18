/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_e;
    private int field_b;
    static int field_d;
    static String field_c;
    private int field_a;
    private hd field_f;
    private hd field_g;

    final static void a(ni param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -28711) {
                break L1;
              } else {
                String discarded$2 = ln.a(-57, (String) null, -45);
                break L1;
              }
            }
            wa.field_j.a((qb) (Object) param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ln.E(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var3 = bh.a(125, param0);
            if (null == var3) {
              stackOut_3_0 = (String) param1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param2 == 255) {
                stackOut_8_0 = jk.a(new String[1], var3, 30496);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ln.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final byte[] a(int param0, int param1) {
        try {
            Object var3 = null;
            RuntimeException var3_ref = null;
            Object var3_ref2 = null;
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
            int var17 = 0;
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_4_0 = null;
            Object stackIn_5_0 = null;
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_26_0 = null;
            Object stackIn_27_0 = null;
            Object stackIn_47_0 = null;
            Object stackIn_48_0 = null;
            Object stackIn_56_0 = null;
            Object stackIn_57_0 = null;
            byte[] stackIn_64_0 = null;
            byte[] stackIn_65_0 = null;
            Object stackIn_67_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_25_0 = null;
            Object stackOut_26_0 = null;
            Object stackOut_55_0 = null;
            Object stackOut_56_0 = null;
            Object stackOut_46_0 = null;
            Object stackOut_47_0 = null;
            byte[] stackOut_63_0 = null;
            byte[] stackOut_64_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_4_0 = null;
            Object stackOut_66_0 = null;
            var19 = DungeonAssault.field_K;
            try {
              var3_ref2 = (Object) (Object) ((ln) this).field_f;
              synchronized (var3_ref2) {
                try {
                  L0: {
                    if (~(long)(6 + param0 * 6) >= ~((ln) this).field_g.a((byte) -92)) {
                      L1: {
                        ((ln) this).field_g.a((long)(6 * param0), -26296);
                        ((ln) this).field_g.a(0, -1, un.field_c, 6);
                        var4_int = ((255 & un.field_c[0]) << -1462858384) + (((un.field_c[1] & 255) << -788749752) - -(un.field_c[2] & 255));
                        var5 = (un.field_c[5] & 255) + (((un.field_c[4] & 255) << 1148357992) + ((un.field_c[3] & 255) << -2120662384));
                        if (var4_int < 0) {
                          break L1;
                        } else {
                          if (~var4_int >= ~((ln) this).field_b) {
                            L2: {
                              if (var5 <= 0) {
                                break L2;
                              } else {
                                if (~(long)var5 >= ~(((ln) this).field_f.a((byte) -92) / 520L)) {
                                  var6 = new byte[var4_int];
                                  var7 = 0;
                                  var8 = -83 / ((-59 - param1) / 54);
                                  var9 = 0;
                                  L3: while (true) {
                                    L4: {
                                      if (var7 >= var4_int) {
                                        break L4;
                                      } else {
                                        if (var5 == 0) {
                                          stackOut_25_0 = null;
                                          stackIn_26_0 = stackOut_25_0;
                                          stackOut_26_0 = stackIn_26_0;
                                          stackIn_27_0 = stackOut_26_0;
                                          return (byte[]) (Object) stackIn_27_0;
                                        } else {
                                          L5: {
                                            L6: {
                                              ((ln) this).field_f.a((long)(var5 * 520), -26296);
                                              var10 = var4_int + -var7;
                                              if (param0 <= 65535) {
                                                break L6;
                                              } else {
                                                L7: {
                                                  var15 = 10;
                                                  if (510 >= var10) {
                                                    break L7;
                                                  } else {
                                                    var10 = 510;
                                                    break L7;
                                                  }
                                                }
                                                ((ln) this).field_f.a(0, -1, un.field_c, var15 + var10);
                                                var13 = ((255 & un.field_c[6]) << 2049609680) - (-((un.field_c[7] & 255) << -1692605240) + -(un.field_c[8] & 255));
                                                var14 = 255 & un.field_c[9];
                                                var11 = (un.field_c[3] & 255) + ((65280 & un.field_c[2] << 1801615208) + (-16777216 & un.field_c[0] << 1188319192) + ((un.field_c[1] & 255) << -724508368));
                                                var12 = ((un.field_c[4] & 255) << 762675880) + (255 & un.field_c[5]);
                                                if (var19 == 0) {
                                                  break L5;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                            L8: {
                                              if (var10 <= 512) {
                                                break L8;
                                              } else {
                                                var10 = 512;
                                                break L8;
                                              }
                                            }
                                            var15 = 8;
                                            ((ln) this).field_f.a(0, -1, un.field_c, var15 + var10);
                                            var11 = (65280 & un.field_c[0] << -1113447160) - -(255 & un.field_c[1]);
                                            var14 = 255 & un.field_c[7];
                                            var13 = ((un.field_c[5] & 255) << -916305912) + (((un.field_c[4] & 255) << -1785412368) + (255 & un.field_c[6]));
                                            var12 = (un.field_c[3] & 255) + (65280 & un.field_c[2] << -1546843992);
                                            break L5;
                                          }
                                          L9: {
                                            if (var11 != param0) {
                                              break L9;
                                            } else {
                                              if (var9 != var12) {
                                                break L9;
                                              } else {
                                                if (var14 != ((ln) this).field_a) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    if (0 > var13) {
                                                      break L10;
                                                    } else {
                                                      if ((long)var13 > ((ln) this).field_f.a((byte) -92) / 520L) {
                                                        break L10;
                                                      } else {
                                                        var16 = var15 + var10;
                                                        var5 = var13;
                                                        var9++;
                                                        var17 = var15;
                                                        L11: while (true) {
                                                          L12: {
                                                            if (var16 <= var17) {
                                                              break L12;
                                                            } else {
                                                              int incrementValue$1 = var7;
                                                              var7++;
                                                              var6[incrementValue$1] = un.field_c[var17];
                                                              var17++;
                                                              if (var19 != 0) {
                                                                continue L3;
                                                              } else {
                                                                if (var19 == 0) {
                                                                  continue L11;
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (var19 == 0) {
                                                            continue L3;
                                                          } else {
                                                            break L4;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_55_0 = null;
                                                  stackIn_56_0 = stackOut_55_0;
                                                  stackOut_56_0 = stackIn_56_0;
                                                  stackIn_57_0 = stackOut_56_0;
                                                  return (byte[]) (Object) stackIn_57_0;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_46_0 = null;
                                          stackIn_47_0 = stackOut_46_0;
                                          stackOut_47_0 = stackIn_47_0;
                                          stackIn_48_0 = stackOut_47_0;
                                          return (byte[]) (Object) stackIn_48_0;
                                        }
                                      }
                                    }
                                    stackOut_63_0 = (byte[]) var6;
                                    stackIn_64_0 = stackOut_63_0;
                                    stackOut_64_0 = (byte[]) (Object) stackIn_64_0;
                                    stackIn_65_0 = stackOut_64_0;
                                    break L0;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                            stackOut_17_0 = null;
                            stackIn_18_0 = stackOut_17_0;
                            stackOut_18_0 = stackIn_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            return (byte[]) (Object) stackIn_19_0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      stackOut_11_0 = stackIn_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      return (byte[]) (Object) stackIn_12_0;
                    } else {
                      stackOut_3_0 = null;
                      stackIn_4_0 = stackOut_3_0;
                      stackOut_4_0 = stackIn_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      return (byte[]) (Object) stackIn_5_0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (IOException) (Object) decompiledCaughtException;
                  stackOut_66_0 = null;
                  stackIn_67_0 = stackOut_66_0;
                  return (byte[]) (Object) stackIn_67_0;
                }
                return stackIn_65_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw vk.a((Throwable) (Object) var3_ref, "ln.A(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(long param0, byte param1) {
        try {
            InterruptedException var3 = null;
            RuntimeException var3_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                {
                  L1: {
                    Thread.sleep(param0);
                    break L1;
                  }
                }
                L3: {
                  if (param1 <= -41) {
                    break L3;
                  } else {
                    field_d = -95;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw vk.a((Throwable) (Object) var3_ref, "ln.B(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cd a(byte param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        cd stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              var1 = vl.c(param0 + -29335);
              if (var1 == null) {
                break L1;
              } else {
                if (0 <= var1.indexOf('@')) {
                  var1 = "";
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -120) {
                break L2;
              } else {
                field_e = -79;
                break L2;
              }
            }
            stackOut_10_0 = new cd(vl.c(param0 + -29335), pi.c(-555));
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1_ref, "ln.G(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1148357992) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ln.F(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2, boolean param3, byte[] param4) {
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
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_19_0 = 0;
            boolean stackIn_26_0 = false;
            int stackIn_49_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_57_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_84_0 = 0;
            RuntimeException stackIn_88_0 = null;
            StringBuilder stackIn_88_1 = null;
            RuntimeException stackIn_90_0 = null;
            StringBuilder stackIn_90_1 = null;
            RuntimeException stackIn_91_0 = null;
            StringBuilder stackIn_91_1 = null;
            String stackIn_91_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            boolean stackOut_25_0 = false;
            int stackOut_55_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_83_0 = 0;
            RuntimeException stackOut_87_0 = null;
            StringBuilder stackOut_87_1 = null;
            RuntimeException stackOut_90_0 = null;
            StringBuilder stackOut_90_1 = null;
            String stackOut_90_2 = null;
            RuntimeException stackOut_88_0 = null;
            StringBuilder stackOut_88_1 = null;
            String stackOut_88_2 = null;
            var16 = DungeonAssault.field_K;
            try {
              var6_ref2 = (Object) (Object) ((ln) this).field_f;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      L2: {
                        if (param3) {
                          break L2;
                        } else {
                          var7_int = (int)((((ln) this).field_f.a((byte) -92) - -519L) / 520L);
                          if (var7_int != 0) {
                            break L1;
                          } else {
                            var7_int = 1;
                            if (var16 == 0) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      if (~((ln) this).field_g.a((byte) -92) <= ~(long)(6 * param2 + 6)) {
                        L3: {
                          ((ln) this).field_g.a((long)(param2 * 6), -26296);
                          ((ln) this).field_g.a(0, -1, un.field_c, 6);
                          var7_int = ((255 & un.field_c[4]) << 1348346536) + ((255 & un.field_c[3]) << 1204158256) - -(255 & un.field_c[5]);
                          if (var7_int <= 0) {
                            break L3;
                          } else {
                            if (~(long)var7_int < ~(((ln) this).field_f.a((byte) -92) / 520L)) {
                              break L3;
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
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackOut_9_0 = stackIn_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    }
                    L4: {
                      un.field_c[5] = (byte)var7_int;
                      un.field_c[3] = (byte)(var7_int >> -1698558448);
                      un.field_c[4] = (byte)(var7_int >> -826552312);
                      un.field_c[2] = (byte)param1;
                      un.field_c[0] = (byte)(param1 >> -61021776);
                      un.field_c[1] = (byte)(param1 >> -749040408);
                      ((ln) this).field_g.a((long)(6 * param2), -26296);
                      ((ln) this).field_g.a(0, -91, 6, un.field_c);
                      var8 = 0;
                      if (param0) {
                        break L4;
                      } else {
                        ((ln) this).field_b = 88;
                        break L4;
                      }
                    }
                    var9 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var8 >= param1) {
                            break L7;
                          } else {
                            var10 = 0;
                            stackOut_25_0 = param3;
                            stackIn_82_0 = stackOut_25_0 ? 1 : 0;
                            stackIn_26_0 = stackOut_25_0;
                            if (var16 != 0) {
                              break L6;
                            } else {
                              L8: {
                                if (stackIn_26_0) {
                                  L9: {
                                    L10: {
                                      ((ln) this).field_f.a((long)(520 * var7_int), -26296);
                                      if (65535 >= param2) {
                                        break L10;
                                      } else {
                                        try {
                                          L11: {
                                            ((ln) this).field_f.a(0, -1, un.field_c, 10);
                                            decompiledRegionSelector0 = 0;
                                            break L11;
                                          }
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L12: {
                                            var14 = (EOFException) (Object) decompiledCaughtException;
                                            if (var16 == 0) {
                                              decompiledRegionSelector0 = 1;
                                              break L12;
                                            } else {
                                              decompiledRegionSelector0 = 0;
                                              break L12;
                                            }
                                          }
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          var11 = ((un.field_c[1] & 255) << -745070736) + ((-16777216 & un.field_c[0] << -913247752) + (un.field_c[2] << -35779800 & 65280) - -(un.field_c[3] & 255));
                                          var10 = (un.field_c[7] << -1302838360 & 65280) + ((un.field_c[6] & 255) << -202881328) + (255 & un.field_c[8]);
                                          var12 = ((255 & un.field_c[4]) << -595437304) + (255 & un.field_c[5]);
                                          var13 = 255 & un.field_c[9];
                                          if (var16 == 0) {
                                            break L9;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    try {
                                      L13: {
                                        ((ln) this).field_f.a(0, -1, un.field_c, 8);
                                        decompiledRegionSelector1 = 0;
                                        break L13;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L14: {
                                        var14 = (EOFException) (Object) decompiledCaughtException;
                                        if (var16 == 0) {
                                          decompiledRegionSelector1 = 1;
                                          break L14;
                                        } else {
                                          decompiledRegionSelector1 = 0;
                                          break L14;
                                        }
                                      }
                                    }
                                    if (decompiledRegionSelector1 == 0) {
                                      var12 = (65280 & un.field_c[2] << -2076167608) - -(un.field_c[3] & 255);
                                      var13 = un.field_c[7] & 255;
                                      var10 = (un.field_c[4] << 725757616 & 16711680) + (((un.field_c[5] & 255) << 1580256360) + (255 & un.field_c[6]));
                                      var11 = (un.field_c[1] & 255) + (un.field_c[0] << -924064856 & 65280);
                                      break L9;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L15: {
                                    if (var11 != param2) {
                                      break L15;
                                    } else {
                                      if (~var9 != ~var12) {
                                        break L15;
                                      } else {
                                        if (((ln) this).field_a == var13) {
                                          L16: {
                                            if (var10 < 0) {
                                              break L16;
                                            } else {
                                              if (((ln) this).field_f.a((byte) -92) / 520L >= (long)var10) {
                                                break L8;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          stackOut_55_0 = 0;
                                          stackIn_56_0 = stackOut_55_0;
                                          stackOut_56_0 = stackIn_56_0;
                                          stackIn_57_0 = stackOut_56_0;
                                          return stackIn_57_0 != 0;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_48_0 = 0;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackOut_49_0 = stackIn_49_0;
                                  stackIn_50_0 = stackOut_49_0;
                                  return stackIn_50_0 != 0;
                                } else {
                                  break L8;
                                }
                              }
                              L17: {
                                if (0 == var10) {
                                  L18: {
                                    var10 = (int)((519L + ((ln) this).field_f.a((byte) -92)) / 520L);
                                    param3 = false;
                                    if (var10 != 0) {
                                      break L18;
                                    } else {
                                      var10++;
                                      break L18;
                                    }
                                  }
                                  if (var10 == var7_int) {
                                    var10++;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L19: {
                                if (-var8 + param1 > 512) {
                                  break L19;
                                } else {
                                  var10 = 0;
                                  break L19;
                                }
                              }
                              L20: {
                                L21: {
                                  if (param2 > 65535) {
                                    break L21;
                                  } else {
                                    L22: {
                                      un.field_c[2] = (byte)(var9 >> -383385144);
                                      un.field_c[6] = (byte)var10;
                                      un.field_c[5] = (byte)(var10 >> 1778938760);
                                      un.field_c[1] = (byte)param2;
                                      un.field_c[4] = (byte)(var10 >> 1275520304);
                                      un.field_c[7] = (byte)((ln) this).field_a;
                                      un.field_c[3] = (byte)var9;
                                      un.field_c[0] = (byte)(param2 >> 706354440);
                                      ((ln) this).field_f.a((long)(520 * var7_int), -26296);
                                      ((ln) this).field_f.a(0, -97, 8, un.field_c);
                                      var11 = -var8 + param1;
                                      if (var11 <= 512) {
                                        break L22;
                                      } else {
                                        var11 = 512;
                                        break L22;
                                      }
                                    }
                                    ((ln) this).field_f.a(var8, -125, var11, param4);
                                    var8 = var8 + var11;
                                    if (var16 == 0) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                L23: {
                                  un.field_c[1] = (byte)(param2 >> -1248707792);
                                  un.field_c[7] = (byte)(var10 >> 199949032);
                                  un.field_c[5] = (byte)var9;
                                  un.field_c[6] = (byte)(var10 >> -678543280);
                                  un.field_c[4] = (byte)(var9 >> -1875261528);
                                  un.field_c[3] = (byte)param2;
                                  un.field_c[0] = (byte)(param2 >> 1709216056);
                                  un.field_c[9] = (byte)((ln) this).field_a;
                                  un.field_c[2] = (byte)(param2 >> -536568184);
                                  un.field_c[8] = (byte)var10;
                                  ((ln) this).field_f.a((long)(var7_int * 520), -26296);
                                  ((ln) this).field_f.a(0, -116, 10, un.field_c);
                                  var11 = -var8 + param1;
                                  if (var11 > 510) {
                                    var11 = 510;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                ((ln) this).field_f.a(var8, -106, var11, param4);
                                var8 = var8 + var11;
                                break L20;
                              }
                              var9++;
                              var7_int = var10;
                              if (var16 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_80_0 = 1;
                        stackIn_81_0 = stackOut_80_0;
                        stackOut_81_0 = stackIn_81_0;
                        stackIn_82_0 = stackOut_81_0;
                        break L6;
                      }
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_83_0 = 0;
                  stackIn_84_0 = stackOut_83_0;
                  return stackIn_84_0 != 0;
                }
                return stackIn_82_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L24: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_87_0 = (RuntimeException) var6_ref;
                stackOut_87_1 = new StringBuilder().append("ln.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_90_0 = stackOut_87_0;
                stackIn_90_1 = stackOut_87_1;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                if (param4 == null) {
                  stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
                  stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
                  stackOut_90_2 = "null";
                  stackIn_91_0 = stackOut_90_0;
                  stackIn_91_1 = stackOut_90_1;
                  stackIn_91_2 = stackOut_90_2;
                  break L24;
                } else {
                  stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                  stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
                  stackOut_88_2 = "{...}";
                  stackIn_91_0 = stackOut_88_0;
                  stackIn_91_1 = stackOut_88_1;
                  stackIn_91_2 = stackOut_88_2;
                  break L24;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_91_0, stackIn_91_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = "" + ((ln) this).field_a;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ln.toString()");
        }
        return stackIn_1_0;
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          if (param3 == -29447) {
            var5 = (Object) (Object) ((ln) this).field_f;
            synchronized (var5) {
              L0: {
                L1: {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (((ln) this).field_b < param2) {
                      break L1;
                    } else {
                      L2: {
                        var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(true, param2, param1, false, param0) ? 1 : 0;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      stackOut_13_0 = var6;
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    }
                  }
                }
                throw new IllegalArgumentException();
              }
            }
            return stackIn_14_0 != 0;
          } else {
            stackOut_1_0 = 0;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5_ref;
            stackOut_17_1 = new StringBuilder().append("ln.C(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 255) {
              stackOut_3_0 = bl.field_r.b((byte) 113);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ln.I(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    ln(int param0, hd param1, hd param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((ln) this).field_b = 65000;
        ((ln) this).field_f = null;
        ((ln) this).field_g = null;
        try {
          L0: {
            ((ln) this).field_f = param1;
            ((ln) this).field_g = param2;
            ((ln) this).field_a = param0;
            ((ln) this).field_b = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ln.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Use this alternative as your account name";
    }
}
