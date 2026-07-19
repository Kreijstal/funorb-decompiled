/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gl {
    static String field_i;
    private nh field_j;
    private int field_k;
    private int field_e;
    private nh field_d;
    static String[] field_g;
    static int field_f;
    static int[] field_c;
    static int[] field_b;
    static String field_a;
    static String field_h;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_g = null;
        field_b = null;
        if (param0 != 3) {
            field_b = (int[]) null;
        }
        field_i = null;
        field_c = null;
    }

    final static int a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1492912648) {
                break L1;
              } else {
                gl.a(123);
                break L1;
              }
            }
            if (!param1) {
              stackOut_5_0 = j.field_h.a(param2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = ti.field_g.a(param2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final boolean a(byte[] param0, int param1, int param2, int param3, boolean param4) {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int decompiledRegionSelector2 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            var17 = Virogrid.field_F ? 1 : 0;
            try {
              var6_ref2 = this.field_d;
              synchronized (var6_ref2) {
                try {
                  L0: {
                    L1: {
                      if (param4) {
                        if ((this.field_j.a((byte) 125) ^ -1L) > ((long)(param3 * 6 - -6) ^ -1L)) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackOut_8_0 = stackIn_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector2 = 0;
                          break L0;
                        } else {
                          L2: {
                            this.field_j.a((long)(param3 * 6), 0);
                            this.field_j.a(0, 6, an.field_c, (byte) 123);
                            var7_int = (an.field_c[4] << 2026607400 & 65280) + ((255 & an.field_c[3]) << -2131929712) - -(255 & an.field_c[5]);
                            if ((var7_int ^ -1) >= -1) {
                              break L2;
                            } else {
                              if ((long)var7_int > this.field_d.a((byte) 126) / 520L) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackOut_14_0 = stackIn_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          decompiledRegionSelector2 = 1;
                          break L0;
                        }
                      } else {
                        var7_int = (int)((519L + this.field_d.a((byte) 127)) / 520L);
                        if (-1 != (var7_int ^ -1)) {
                          break L1;
                        } else {
                          var7_int = 1;
                          break L1;
                        }
                      }
                    }
                    an.field_c[4] = (byte)(var7_int >> -1094431032);
                    an.field_c[0] = (byte)(param1 >> -571949456);
                    an.field_c[1] = (byte)(param1 >> 1358873992);
                    an.field_c[3] = (byte)(var7_int >> 2136131248);
                    an.field_c[2] = (byte)param1;
                    var8 = -52 % ((54 - param2) / 61);
                    an.field_c[5] = (byte)var7_int;
                    this.field_j.a((long)(6 * param3), 0);
                    this.field_j.a(0, an.field_c, 6, 0);
                    var9 = 0;
                    var10 = 0;
                    L3: while (true) {
                      L4: {
                        if (var9 >= param1) {
                          break L4;
                        } else {
                          L5: {
                            var11 = 0;
                            if (param4) {
                              L6: {
                                this.field_d.a((long)(520 * var7_int), 0);
                                if (65535 >= param3) {
                                  try {
                                    L7: {
                                      this.field_d.a(0, 8, an.field_c, (byte) 127);
                                      decompiledRegionSelector0 = 0;
                                      break L7;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 1;
                                      break L8;
                                    }
                                  }
                                  if (decompiledRegionSelector0 == 0) {
                                    var11 = (65280 & an.field_c[5] << -1457314584) + (((an.field_c[4] & 255) << -725085008) + (an.field_c[6] & 255));
                                    var12 = (255 & an.field_c[1]) + (an.field_c[0] << -969996376 & 65280);
                                    var14 = an.field_c[7] & 255;
                                    var13 = ((255 & an.field_c[2]) << -333358520) + (an.field_c[3] & 255);
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  try {
                                    L9: {
                                      this.field_d.a(0, 10, an.field_c, (byte) 127);
                                      decompiledRegionSelector1 = 0;
                                      break L9;
                                    }
                                  } catch (java.io.EOFException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L10: {
                                      var15 = (EOFException) (Object) decompiledCaughtException;
                                      decompiledRegionSelector1 = 1;
                                      break L10;
                                    }
                                  }
                                  if (decompiledRegionSelector1 == 0) {
                                    var13 = (255 & an.field_c[5]) + ((an.field_c[4] & 255) << -1831233144);
                                    var11 = (an.field_c[6] << -2017896624 & 16711680) - -(an.field_c[7] << 1318332520 & 65280) + (an.field_c[8] & 255);
                                    var12 = (255 & an.field_c[3]) + (((255 & an.field_c[2]) << -1363303768) + (an.field_c[0] << -1848871368 & -16777216)) + ((an.field_c[1] & 255) << 191996208);
                                    var14 = 255 & an.field_c[9];
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L11: {
                                if (param3 != var12) {
                                  break L11;
                                } else {
                                  if (var10 != var13) {
                                    break L11;
                                  } else {
                                    if (var14 != this.field_e) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if ((var11 ^ -1) > -1) {
                                          break L12;
                                        } else {
                                          if ((long)var11 <= this.field_d.a((byte) 125) / 520L) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      stackOut_39_0 = 0;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackOut_40_0 = stackIn_40_0;
                                      stackIn_41_0 = stackOut_40_0;
                                      decompiledRegionSelector2 = 3;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              stackOut_34_0 = stackIn_34_0;
                              stackIn_35_0 = stackOut_34_0;
                              decompiledRegionSelector2 = 2;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                          L13: {
                            if (var11 != 0) {
                              break L13;
                            } else {
                              L14: {
                                var11 = (int)((this.field_d.a((byte) 127) - -519L) / 520L);
                                param4 = false;
                                if (var11 == 0) {
                                  var11++;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              if (var7_int == var11) {
                                var11++;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if (-513 > (param1 - var9 ^ -1)) {
                              break L15;
                            } else {
                              var11 = 0;
                              break L15;
                            }
                          }
                          L16: {
                            if (-65536 <= (param3 ^ -1)) {
                              L17: {
                                an.field_c[6] = (byte)var11;
                                an.field_c[7] = (byte)this.field_e;
                                an.field_c[2] = (byte)(var10 >> 532786728);
                                an.field_c[5] = (byte)(var11 >> -910025208);
                                an.field_c[3] = (byte)var10;
                                an.field_c[4] = (byte)(var11 >> 413405200);
                                an.field_c[1] = (byte)param3;
                                an.field_c[0] = (byte)(param3 >> 1973141608);
                                this.field_d.a((long)(var7_int * 520), 0);
                                this.field_d.a(0, an.field_c, 8, 0);
                                var12 = -var9 + param1;
                                if ((var12 ^ -1) >= -513) {
                                  break L17;
                                } else {
                                  var12 = 512;
                                  break L17;
                                }
                              }
                              this.field_d.a(var9, param0, var12, 0);
                              var9 = var9 + var12;
                              break L16;
                            } else {
                              L18: {
                                an.field_c[5] = (byte)var10;
                                an.field_c[0] = (byte)(param3 >> -1094568);
                                an.field_c[9] = (byte)this.field_e;
                                an.field_c[7] = (byte)(var11 >> 652059144);
                                an.field_c[4] = (byte)(var10 >> -1667239256);
                                an.field_c[3] = (byte)param3;
                                an.field_c[8] = (byte)var11;
                                an.field_c[6] = (byte)(var11 >> -992196560);
                                an.field_c[2] = (byte)(param3 >> 810540104);
                                an.field_c[1] = (byte)(param3 >> -1547619088);
                                this.field_d.a((long)(var7_int * 520), 0);
                                this.field_d.a(0, an.field_c, 10, 0);
                                var12 = -var9 + param1;
                                if ((var12 ^ -1) < -511) {
                                  var12 = 510;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_d.a(var9, param0, var12, 0);
                              var9 = var9 + var12;
                              break L16;
                            }
                          }
                          var10++;
                          var7_int = var11;
                          continue L3;
                        }
                      }
                      stackOut_60_0 = 1;
                      stackIn_61_0 = stackOut_60_0;
                      stackOut_61_0 = stackIn_61_0;
                      stackIn_62_0 = stackOut_61_0;
                      decompiledRegionSelector2 = 4;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var7 = (IOException) (Object) decompiledCaughtException;
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  return stackIn_64_0 != 0;
                }
                if (decompiledRegionSelector2 == 0) {
                  return stackIn_9_0 != 0;
                } else {
                  if (decompiledRegionSelector2 == 1) {
                    return stackIn_15_0 != 0;
                  } else {
                    if (decompiledRegionSelector2 == 2) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector2 == 3) {
                        return stackIn_41_0 != 0;
                      } else {
                        return stackIn_62_0 != 0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L19: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) (var6_ref);
                stackOut_67_1 = new StringBuilder().append("gl.A(");
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param0 == null) {
                  stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L19;
                } else {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L19;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(dh param0, byte param1, int param2) {
        hg var3 = null;
        try {
            var3 = gk.field_g;
            var3.g(param2, 8);
            int var4 = -12 % ((0 - param1) / 43);
            var3.a(param0.field_i, 58);
            var3.a(param0.field_g, 126);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "gl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        return "" + this.field_e;
    }

    final byte[] a(int param0, int param1) {
        try {
            int discarded$2 = 0;
            int incrementValue$3 = 0;
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
            String var19 = null;
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_53_0 = null;
            var18 = Virogrid.field_F ? 1 : 0;
            var3 = this.field_d;
            synchronized (var3) {
              try {
                L0: {
                  if (((long)(6 + param0 * 6) ^ -1L) >= (this.field_j.a((byte) 127) ^ -1L)) {
                    L1: {
                      this.field_j.a((long)(6 * param0), 0);
                      this.field_j.a(0, 6, an.field_c, (byte) 123);
                      if (param1 < -33) {
                        break L1;
                      } else {
                        var19 = (String) null;
                        discarded$2 = gl.a(-48, false, (String) null);
                        break L1;
                      }
                    }
                    var4_int = ((255 & an.field_c[1]) << -820541560) + ((16711680 & an.field_c[0] << -86079920) - -(an.field_c[2] & 255));
                    var5 = (an.field_c[3] << 1776131472 & 16711680) - -((255 & an.field_c[4]) << -699324888) - -(an.field_c[5] & 255);
                    if ((var4_int ^ -1) <= -1) {
                      if (var4_int <= this.field_k) {
                        if (-1 > (var5 ^ -1)) {
                          if ((this.field_d.a((byte) 127) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            L2: while (true) {
                              if (var7 >= var4_int) {
                                stackOut_50_0 = (byte[]) (var6);
                                stackIn_51_0 = stackOut_50_0;
                                stackOut_51_0 = (byte[]) ((Object) stackIn_51_0);
                                stackIn_52_0 = stackOut_51_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (var5 != 0) {
                                  L3: {
                                    this.field_d.a((long)(520 * var5), 0);
                                    var9 = var4_int - var7;
                                    if (param0 > 65535) {
                                      L4: {
                                        var14 = 10;
                                        if (var9 <= 510) {
                                          break L4;
                                        } else {
                                          var9 = 510;
                                          break L4;
                                        }
                                      }
                                      this.field_d.a(0, var9 + var14, an.field_c, (byte) 127);
                                      var11 = (255 & an.field_c[5]) + (65280 & an.field_c[4] << -1021770616);
                                      var10 = ((an.field_c[2] & 255) << -1449824056) + (an.field_c[0] << 1284702008 & -16777216) + ((255 & an.field_c[1]) << 8883664) + (255 & an.field_c[3]);
                                      var12 = ((255 & an.field_c[6]) << 1427019792) - (-((an.field_c[7] & 255) << -212918104) - (255 & an.field_c[8]));
                                      var13 = 255 & an.field_c[9];
                                      break L3;
                                    } else {
                                      L5: {
                                        var14 = 8;
                                        if (512 >= var9) {
                                          break L5;
                                        } else {
                                          var9 = 512;
                                          break L5;
                                        }
                                      }
                                      this.field_d.a(0, var14 + var9, an.field_c, (byte) 125);
                                      var10 = (an.field_c[1] & 255) + ((255 & an.field_c[0]) << 1492912648);
                                      var12 = (255 & an.field_c[6]) + ((255 & an.field_c[4]) << -136017456) + ((an.field_c[5] & 255) << 1837336296);
                                      var13 = 255 & an.field_c[7];
                                      var11 = ((255 & an.field_c[2]) << -1675774136) - -(255 & an.field_c[3]);
                                      break L3;
                                    }
                                  }
                                  if (var10 == param0) {
                                    if (var11 == var8) {
                                      if (var13 == this.field_e) {
                                        if (0 <= var12) {
                                          if (((long)var12 ^ -1L) >= (this.field_d.a((byte) 127) / 520L ^ -1L)) {
                                            var15 = var9 + var14;
                                            var8++;
                                            var16 = var14;
                                            L6: while (true) {
                                              if (var15 <= var16) {
                                                var5 = var12;
                                                continue L2;
                                              } else {
                                                incrementValue$3 = var7;
                                                var7++;
                                                var6[incrementValue$3] = an.field_c[var16];
                                                var16++;
                                                continue L6;
                                              }
                                            }
                                          } else {
                                            stackOut_43_0 = null;
                                            stackIn_44_0 = stackOut_43_0;
                                            stackOut_44_0 = stackIn_44_0;
                                            stackIn_45_0 = stackOut_44_0;
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
                                  } else {
                                    return null;
                                  }
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        stackOut_11_0 = stackIn_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
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
                stackOut_53_0 = null;
                stackIn_54_0 = stackOut_53_0;
                return (byte[]) ((Object) stackIn_54_0);
              }
              if (decompiledRegionSelector0 == 0) {
                return (byte[]) ((Object) stackIn_12_0);
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return (byte[]) ((Object) stackIn_18_0);
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return (byte[]) ((Object) stackIn_45_0);
                  } else {
                    return stackIn_52_0;
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

    final boolean a(byte[] param0, int param1, int param2, byte param3) {
        boolean discarded$4 = false;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        byte[] var8 = null;
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
          L0: {
            var5 = this.field_d;
            synchronized (var5) {
              L1: {
                L2: {
                  if ((param2 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (param2 <= this.field_k) {
                      L3: {
                        if (param3 < -43) {
                          break L3;
                        } else {
                          var8 = (byte[]) null;
                          discarded$4 = this.a((byte[]) null, 80, 22, (byte) -103);
                          break L3;
                        }
                      }
                      L4: {
                        var6 = this.a(param0, param2, 116, param1, true) ? 1 : 0;
                        if (var6 == 0) {
                          var6 = this.a(param0, param2, 119, param1, false) ? 1 : 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      stackOut_9_0 = var6;
                      stackIn_10_0 = stackOut_9_0;
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
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("gl.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    gl(int param0, nh param1, nh param2, int param3) {
        this.field_k = 65000;
        this.field_j = null;
        this.field_d = null;
        try {
            this.field_k = param3;
            this.field_d = param1;
            this.field_e = param0;
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "gl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_f = -1;
        field_i = "Unpacking models";
        field_a = "Waiting for extra data";
        field_b = new int[8192];
        field_h = "Move one space to clone<br>or two spaces to jump";
    }
}
