/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nq extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(208, 115));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("nq.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(float param0, int param1, float param2, int param3, int param4, int param5, float param6, vjb param7, int param8, float param9, int param10, byte[] param11, byte param12, float param13) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        byte[] var20 = null;
        int var21 = 0;
        float[] var25 = null;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param12 > 47) {
                break L1;
              } else {
                var20 = (byte[]) null;
                nq.a(1.1260381937026978f, -88, 0.9253022074699402f, -128, 62, -46, 1.1999729871749878f, (vjb) null, -54, 2.695220470428467f, -81, (byte[]) null, (byte) -123, -0.5407317280769348f);
                break L1;
              }
            }
            var14_int = param4 * param3;
            var25 = new float[var14_int];
            var16 = 0;
            L2: while (true) {
              if (var16 >= param1) {
                var21 = param10;
                var16 = var21;
                var17 = 0;
                L3: while (true) {
                  if (var17 >= var14_int) {
                    break L0;
                  } else {
                    param11[var21] = (byte)(param11[var21] - -127);
                    var21++;
                    var17++;
                    continue L3;
                  }
                }
              } else {
                var17 = param10;
                param7.a(param0 / (float)param3, param6 / (float)param4, var25, param9 / (float)param8, param8, 127.0f * param2, (byte) 99, 0, param3, param5, param4);
                param9 = param9 * 2.0f;
                param2 = param2 * param13;
                var18 = 0;
                L4: while (true) {
                  if (var18 >= var14_int) {
                    param6 = param6 * 2.0f;
                    param0 = param0 * 2.0f;
                    var16++;
                    continue L2;
                  } else {
                    param11[var17] = (byte)(int)((float)param11[var17] + var25[var18]);
                    var17++;
                    var18++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var14 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var14);

            stackIn_15_1 = new StringBuilder().append("nq.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
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
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param12 + ',' + param13 + ')');
        }
    }

    final static void a(byte param0, ds param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            var5 = VoidHunters.field_G;
            try {
              L0: {
                var6 = new byte[24];
                var2 = var6;
                if (param0 <= -69) {
                  L1: {
                    L2: {
                      if (vsa.field_r != null) {
                        try {
                          L3: {
                            vsa.field_r.a(0, 0L);
                            vsa.field_r.a(-112, var6);
                            var3_int = 0;
                            L4: while (true) {
                              L5: {
                                if (var3_int >= 24) {
                                  break L5;
                                } else {
                                  if (0 != var6[var3_int]) {
                                    break L5;
                                  } else {
                                    var3_int++;
                                    continue L4;
                                  }
                                }
                              }
                              if (-25 >= (var3_int ^ -1)) {
                                throw new IOException();
                              } else {
                                param1.a(0, var2, -1, 24);
                                decompiledRegionSelector0 = 0;
                                break L3;
                              }
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var4 = 0;
                            L7: while (true) {
                              if ((var4 ^ -1) <= -25) {
                                decompiledRegionSelector0 = 1;
                                break L6;
                              } else {
                                var2[var4] = (byte)-1;
                                var4++;
                                continue L7;
                              }
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param1.a(0, var2, -1, 24);
                    break L1;
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref);

                stackIn_22_1 = new StringBuilder().append("nq.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L8;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L8;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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

    nq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
