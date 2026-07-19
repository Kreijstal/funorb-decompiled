/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static String field_b;
    static String field_a;

    final static void a(int param0, int param1) {
        if (param0 != 24) {
            field_a = (String) null;
            ta.field_a = 1000000000L / (long)param1;
            return;
        }
        ta.field_a = 1000000000L / (long)param1;
    }

    final static void a(gb param0, int param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte stackIn_5_0 = 0;
            int stackIn_9_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_4_0 = 0;
            int stackOut_8_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var5 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (pj.field_D == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          pj.field_D.a(0L, (byte) 45);
                          pj.field_D.a((byte) 58, var6);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (24 <= var3_int) {
                                  break L6;
                                } else {
                                  stackOut_4_0 = var6[var3_int];
                                  stackIn_9_0 = stackOut_4_0;
                                  stackIn_5_0 = stackOut_4_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    if (stackIn_5_0 != 0) {
                                      break L6;
                                    } else {
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_8_0 = var3_int ^ -1;
                              stackIn_9_0 = stackOut_8_0;
                              break L5;
                            }
                            if (stackIn_9_0 > -25) {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L7: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L8: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 0;
                              break L7;
                            } else {
                              var6[var4] = (byte)-1;
                              var4++;
                              if (var5 != 0) {
                                decompiledRegionSelector0 = 1;
                                break L7;
                              } else {
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param0.a(8, 24, var2, 0);
                  break L1;
                }
                if (param1 >= 54) {
                  break L0;
                } else {
                  vh.a(120, 92);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) (var2_ref);
                stackOut_21_1 = new StringBuilder().append("vh.A(");
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param0 == null) {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L9;
                } else {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "{...}";
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L9;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            gb var2 = (gb) null;
            vh.a((gb) null, 57);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = "Quit";
    }
}
