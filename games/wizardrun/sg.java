/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    private si field_d;
    private int field_a;
    static int field_f;
    private si field_c;
    private int field_e;
    static o[][] field_b;

    final byte[] a(boolean param0, int param1) {
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
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_54_0 = null;
            var18 = wizardrun.field_H;
            var3 = (Object) (Object) ((sg) this).field_c;
            synchronized (var3) {
              try {
                L0: {
                  if ((long)(param1 * 6 + 6) <= ((sg) this).field_d.b((byte) 79)) {
                    ((sg) this).field_d.a((long)(6 * param1), (byte) 125);
                    ((sg) this).field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                    var4_int = (wizardrun.field_O[2] & 255) + (((255 & wizardrun.field_O[1]) << 8) + (wizardrun.field_O[0] << 16 & 16711680));
                    var5 = (255 & wizardrun.field_O[5]) + (((255 & wizardrun.field_O[4]) << 8) + (16711680 & wizardrun.field_O[3] << 16));
                    if (var4_int >= 0) {
                      if (((sg) this).field_e >= var4_int) {
                        if (0 < var5) {
                          if (~(long)var5 >= ~(((sg) this).field_c.b((byte) 79) / 520L)) {
                            L1: {
                              var6 = new byte[var4_int];
                              var7 = 0;
                              if (param0) {
                                break L1;
                              } else {
                                ((sg) this).field_e = 12;
                                break L1;
                              }
                            }
                            var8 = 0;
                            L2: while (true) {
                              if (var4_int <= var7) {
                                stackOut_51_0 = (byte[]) var6;
                                stackIn_52_0 = stackOut_51_0;
                                stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                                stackIn_53_0 = stackOut_52_0;
                                break L0;
                              } else {
                                if (0 != var5) {
                                  L3: {
                                    ((sg) this).field_c.a((long)(520 * var5), (byte) -99);
                                    var9 = -var7 + var4_int;
                                    if (param1 <= 65535) {
                                      L4: {
                                        if (var9 > 512) {
                                          var9 = 512;
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                      var14 = 8;
                                      ((sg) this).field_c.a(0, wizardrun.field_O, var14 + var9, (byte) 47);
                                      var12 = (65280 & wizardrun.field_O[5] << 8) + (((255 & wizardrun.field_O[4]) << 16) - -(wizardrun.field_O[6] & 255));
                                      var13 = wizardrun.field_O[7] & 255;
                                      var11 = (wizardrun.field_O[3] & 255) + (65280 & wizardrun.field_O[2] << 8);
                                      var10 = (255 & wizardrun.field_O[1]) + (65280 & wizardrun.field_O[0] << 8);
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 10;
                                        if (var9 > 510) {
                                          var9 = 510;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      ((sg) this).field_c.a(0, wizardrun.field_O, var9 + var14, (byte) 47);
                                      var10 = ((255 & wizardrun.field_O[0]) << 24) + (((255 & wizardrun.field_O[1]) << 16) - (-(65280 & wizardrun.field_O[2] << 8) + -(255 & wizardrun.field_O[3])));
                                      var11 = (wizardrun.field_O[5] & 255) + ((255 & wizardrun.field_O[4]) << 8);
                                      var12 = (wizardrun.field_O[8] & 255) + (((wizardrun.field_O[6] & 255) << 16) - -((wizardrun.field_O[7] & 255) << 8));
                                      var13 = 255 & wizardrun.field_O[9];
                                      break L3;
                                    }
                                  }
                                  if (param1 == var10) {
                                    if (var11 == var8) {
                                      if (~var13 == ~((sg) this).field_a) {
                                        if (0 <= var12) {
                                          if ((long)var12 <= ((sg) this).field_c.b((byte) 79) / 520L) {
                                            var15 = var14 + var9;
                                            var8++;
                                            var5 = var12;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (~var15 >= ~var16) {
                                                continue L2;
                                              } else {
                                                int incrementValue$1 = var7;
                                                var7++;
                                                var6[incrementValue$1] = wizardrun.field_O[var16];
                                                var16++;
                                                continue L6;
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

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            String stackOut_6_0 = null;
            Object stackOut_11_0 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = wizardrun.field_H;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) cl.a(param1, -3264, "getcookies");
                            var4 = tj.a(var3, -22710, ';');
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var4[var5].substring(var6 + 1).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var5++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref = caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = null;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (String) (Object) stackIn_12_0;
                    }
                    case 13: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_13_0 = (RuntimeException) var3_ref2;
                        stackOut_13_1 = new StringBuilder().append("sg.C(");
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "null";
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param1 == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "null";
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 0 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((sg) this).field_a;
    }

    final static void a(byte param0) {
        if (param0 != 64) {
            sg.a((byte) -126);
        }
        ec.field_a = null;
        f.field_b = null;
        ke.field_t = null;
        lb.field_f = null;
        eb.field_a = false;
    }

    public static void b(byte param0) {
        field_b = null;
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, boolean param4) {
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
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            var16 = wizardrun.field_H;
            try {
              var6_ref2 = (Object) (Object) ((sg) this).field_c;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (!param3) {
                        var7_int = (int)((519L + ((sg) this).field_c.b((byte) 79)) / 520L);
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      } else {
                        if (~(long)(6 + 6 * param0) >= ~((sg) this).field_d.b((byte) 79)) {
                          L2: {
                            ((sg) this).field_d.a((long)(6 * param0), (byte) 120);
                            ((sg) this).field_d.a(0, wizardrun.field_O, 6, (byte) 47);
                            var7_int = (255 & wizardrun.field_O[5]) + (wizardrun.field_O[3] << 16 & 16711680) - -(65280 & wizardrun.field_O[4] << 8);
                            if (var7_int <= 0) {
                              break L2;
                            } else {
                              if (~(long)var7_int < ~(((sg) this).field_c.b((byte) 79) / 520L)) {
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
                    wizardrun.field_O[3] = (byte)(var7_int >> 16);
                    wizardrun.field_O[5] = (byte)var7_int;
                    wizardrun.field_O[2] = (byte)param2;
                    wizardrun.field_O[4] = (byte)(var7_int >> 8);
                    wizardrun.field_O[0] = (byte)(param2 >> 16);
                    wizardrun.field_O[1] = (byte)(param2 >> 8);
                    ((sg) this).field_d.a((long)(param0 * 6), (byte) 67);
                    ((sg) this).field_d.a(18729, wizardrun.field_O, 6, 0);
                    var8 = 0;
                    var9 = 0;
                    L3: while (true) {
                      L4: {
                        if (param2 <= var8) {
                          break L4;
                        } else {
                          L5: {
                            var10 = 0;
                            if (param3) {
                              L6: {
                                ((sg) this).field_c.a((long)(520 * var7_int), (byte) -119);
                                if (65535 < param0) {
                                  try {
                                    L7: {
                                      ((sg) this).field_c.a(0, wizardrun.field_O, 10, (byte) 47);
                                      decompiledRegionSelector1 = 0;
                                      break L7;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var13 = wizardrun.field_O[9] & 255;
                                    var10 = (wizardrun.field_O[6] << 16 & 16711680) + ((wizardrun.field_O[7] << 8 & 65280) + (wizardrun.field_O[8] & 255));
                                    var12 = ((255 & wizardrun.field_O[4]) << 8) - -(wizardrun.field_O[5] & 255);
                                    var11 = ((wizardrun.field_O[0] & 255) << 24) - (-(16711680 & wizardrun.field_O[1] << 16) + -(wizardrun.field_O[2] << 8 & 65280)) + (wizardrun.field_O[3] & 255);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      ((sg) this).field_c.a(0, wizardrun.field_O, 8, (byte) 47);
                                      decompiledRegionSelector0 = 0;
                                      break L9;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var14 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var10 = (255 & wizardrun.field_O[6]) + (65280 & wizardrun.field_O[5] << 8) + (16711680 & wizardrun.field_O[4] << 16);
                                    var11 = (65280 & wizardrun.field_O[0] << 8) + (wizardrun.field_O[1] & 255);
                                    var12 = (wizardrun.field_O[3] & 255) + ((wizardrun.field_O[2] & 255) << 8);
                                    var13 = wizardrun.field_O[7] & 255;
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param0 != var11) {
                                  break L11;
                                } else {
                                  if (var9 != var12) {
                                    break L11;
                                  } else {
                                    if (var13 == ((sg) this).field_a) {
                                      L12: {
                                        if (var10 < 0) {
                                          break L12;
                                        } else {
                                          if ((long)var10 > ((sg) this).field_c.b((byte) 79) / 520L) {
                                            break L12;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_38_0 = 0;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackOut_39_0 = stackIn_39_0;
                                      stackIn_40_0 = stackOut_39_0;
                                      return stackIn_40_0 != 0;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              stackOut_33_0 = stackIn_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (0 == var10) {
                              L14: {
                                param3 = false;
                                var10 = (int)((((sg) this).field_c.b((byte) 79) + 519L) / 520L);
                                if (var10 != 0) {
                                  break L14;
                                } else {
                                  var10++;
                                  break L14;
                                }
                              }
                              if (var10 == var7_int) {
                                var10++;
                                break L13;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (param2 - var8 >= -513) {
                              var10 = 0;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 < param0) {
                              L17: {
                                wizardrun.field_O[4] = (byte)(var9 >> 8);
                                wizardrun.field_O[0] = (byte)(param0 >> 24);
                                wizardrun.field_O[2] = (byte)(param0 >> 8);
                                wizardrun.field_O[3] = (byte)param0;
                                wizardrun.field_O[7] = (byte)(var10 >> 8);
                                wizardrun.field_O[1] = (byte)(param0 >> 16);
                                wizardrun.field_O[6] = (byte)(var10 >> 16);
                                wizardrun.field_O[8] = (byte)var10;
                                wizardrun.field_O[9] = (byte)((sg) this).field_a;
                                wizardrun.field_O[5] = (byte)var9;
                                ((sg) this).field_c.a((long)(520 * var7_int), (byte) 47);
                                ((sg) this).field_c.a(18729, wizardrun.field_O, 10, 0);
                                var11 = param2 - var8;
                                if (var11 > 510) {
                                  var11 = 510;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((sg) this).field_c.a(18729, param1, var11, var8);
                              var8 = var8 + var11;
                              break L16;
                            } else {
                              L18: {
                                wizardrun.field_O[7] = (byte)((sg) this).field_a;
                                wizardrun.field_O[0] = (byte)(param0 >> 8);
                                wizardrun.field_O[5] = (byte)(var10 >> 8);
                                wizardrun.field_O[6] = (byte)var10;
                                wizardrun.field_O[3] = (byte)var9;
                                wizardrun.field_O[4] = (byte)(var10 >> 16);
                                wizardrun.field_O[2] = (byte)(var9 >> 8);
                                wizardrun.field_O[1] = (byte)param0;
                                ((sg) this).field_c.a((long)(var7_int * 520), (byte) -61);
                                ((sg) this).field_c.a(18729, wizardrun.field_O, 8, 0);
                                var11 = param2 + -var8;
                                if (var11 > 512) {
                                  var11 = 512;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              ((sg) this).field_c.a(18729, param1, var11, var8);
                              var8 = var8 + var11;
                              break L16;
                            }
                          }
                          var7_int = var10;
                          var9++;
                          continue L3;
                        }
                      }
                      stackOut_61_0 = 1;
                      stackIn_62_0 = stackOut_61_0;
                      stackOut_62_0 = stackIn_62_0;
                      stackIn_63_0 = stackOut_62_0;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_64_0 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  return stackIn_65_0 != 0;
                }
                return stackIn_63_0 != 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) var6_ref;
                stackOut_68_1 = new StringBuilder().append("sg.E(").append(param0).append(',');
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param1 == null) {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "null";
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  stackIn_71_2 = stackOut_70_2;
                  break L19;
                } else {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "{...}";
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_71_1 = stackOut_69_1;
                  stackIn_71_2 = stackOut_69_2;
                  break L19;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param2 + ',' + param3 + ',' + true + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          var5 = (Object) (Object) ((sg) this).field_c;
          synchronized (var5) {
            L0: {
              L1: {
                if (param2 > param3) {
                  break L1;
                } else {
                  if (param3 > ((sg) this).field_e) {
                    break L1;
                  } else {
                    L2: {
                      var6 = this.a(param1, param0, param3, true, true) ? 1 : 0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        var6 = this.a(param1, param0, param3, false, true) ? 1 : 0;
                        break L2;
                      }
                    }
                    stackOut_7_0 = var6;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  }
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("sg.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    sg(int param0, si param1, si param2, int param3) {
        ((sg) this).field_d = null;
        ((sg) this).field_c = null;
        ((sg) this).field_e = 65000;
        try {
            ((sg) this).field_c = param1;
            ((sg) this).field_e = param3;
            ((sg) this).field_d = param2;
            ((sg) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "sg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
