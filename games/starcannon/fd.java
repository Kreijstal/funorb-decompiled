/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd {
    static String field_d;
    static String field_b;
    static b field_a;
    static long field_c;

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param4 <= -93) {
                break L1;
              } else {
                field_a = (b) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= jf.field_a.length) {
                break L0;
              } else {
                param1 = jf.field_a[var5_int];
                var6 = var5_int << 436875300;
                L3: while (true) {
                  incrementValue$5 = param1;
                  param1--;
                  if (-1 == (incrementValue$5 ^ -1)) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param0 = ih.field_d[incrementValue$6];
                    dupTemp$7 = param2[param0];
                    dupTemp$8 = param3[dupTemp$7];
                    param3[dupTemp$7] = dupTemp$8 + 1;
                    ih.field_d[dupTemp$8] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("fd.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final static void a(rb param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            byte[] var5 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            try {
              L0: {
                var5 = new byte[24];
                var2 = var5;
                if (param1 <= -108) {
                  L1: {
                    if (null != mf.field_c) {
                      try {
                        L2: {
                          mf.field_c.a(0L, 0);
                          mf.field_c.a(var5, 15);
                          var3_int = 0;
                          L3: while (true) {
                            L4: {
                              if (var3_int >= 24) {
                                break L4;
                              } else {
                                if (var5[var3_int] != 0) {
                                  break L4;
                                } else {
                                  var3_int++;
                                  continue L3;
                                }
                              }
                            }
                            if ((var3_int ^ -1) > -25) {
                              break L2;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L6: while (true) {
                            if (var4 >= 24) {
                              break L5;
                            } else {
                              var5[var4] = (byte)-1;
                              var4++;
                              continue L6;
                            }
                          }
                        }
                      }
                      param0.a(var2, 24, -20144, 0);
                      break L1;
                    } else {
                      param0.a(var2, 24, -20144, 0);
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (var2_ref);

                stackIn_18_1 = new StringBuilder().append("fd.E(");

                if (param0 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
            fd.a(98, 30);
        }
        md.field_a = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != -12241) {
            return;
        }
        field_b = null;
    }

    final static short[] a(int param0, short[] param1, int param2, ia param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = StarCannon.field_A;
        try {
          L0: {
            var4_int = param3.e(8, param0);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int != param1.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.e(8, 4);
                var6 = -78 / ((param2 - 34) / 53);
                var7 = (short)param3.e(8, 16);
                if ((var5 ^ -1) >= -1) {
                  var8 = 0;
                  L4: while (true) {
                    if (var8 >= var4_int) {
                      break L3;
                    } else {
                      param1[var8] = (short)var7;
                      var8++;
                      continue L4;
                    }
                  }
                } else {
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var4_int) {
                      break L3;
                    } else {
                      param1[var8] = (short)(param3.e(8, var5) + var7);
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (short[]) (param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("fd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        field_d = "GFX - MEDIUM";
        field_b = "Return to game";
        field_c = 20000000L;
    }
}
