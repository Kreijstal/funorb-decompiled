/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ni {
    static boolean field_c;
    private qm field_a;
    private qm field_d;
    private eja field_b;

    final void a(byte param0) {
        ((ni) this).field_a.a(12574);
        if (param0 < 22) {
            ((ni) this).field_d = null;
        }
    }

    final static void a(uia param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            byte[] var12 = null;
            byte[] var13 = null;
            byte[] var14 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var5 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var13 = new byte[24];
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var6 = var7;
                  var14 = var6;
                  var12 = var14;
                  var10 = var12;
                  var8 = var10;
                  var2 = var8;
                  if (null == fua.field_b) {
                    param0.a(0, var13, 24, 68);
                    break L1;
                  } else {
                    try {
                      L2: {
                        fua.field_b.a((byte) 2, 0L);
                        fua.field_b.a(var13, 0);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (24 <= var3_int) {
                              break L4;
                            } else {
                              if (var14[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3_int >= 24) {
                            throw new IOException();
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L2;
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
                            param0.a(0, var14, 24, 68);
                            decompiledRegionSelector0 = 1;
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      param0.a(0, var14, 24, 68);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var2_ref;
                stackOut_18_1 = new StringBuilder().append("ni.B(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L7;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L7;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 77 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ni(eo param0) {
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              mna discarded$4 = param0.a(new ne[2], 0);
              ((ni) this).field_a = param0.c(6, true);
              ((ni) this).field_d = param0.c(6, false);
              boolean discarded$5 = ((ni) this).field_d.a(393168, 12, true);
              ((ni) this).field_b = param0.a(26, false);
              ((ni) this).field_b.a(18, 49146);
              var7 = ((ni) this).field_b.a(true, (byte) -44);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(var7, 125);
                  if (jaclib.memory.Stream.b()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = var4_int * 4;
                        var8.a(var5);
                        var8.a(1 + var5);
                        var8.a(2 + var5);
                        var8.a(var5 + 2);
                        var8.a(var5 - -3);
                        var8.a(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = var4_int * 4;
                        var8.b(var5);
                        var8.b(var5 + 1);
                        var8.b(2 + var5);
                        var8.b(2 + var5);
                        var8.b(var5 + 3);
                        var8.b(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.a();
                boolean discarded$6 = ((ni) this).field_b.a((byte) -97);
                break L1;
              }
            }
            L5: {
              var9 = ((ni) this).field_d.a(-15730, true);
              if (var9 == null) {
                break L5;
              } else {
                L6: {
                  var4 = param0.a(var9, 127);
                  if (!jaclib.memory.Stream.b()) {
                    var5 = 0;
                    L7: while (true) {
                      if (var5 >= 8191) {
                        break L6;
                      } else {
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var5++;
                        continue L7;
                      }
                    }
                  } else {
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= 8191) {
                        break L6;
                      } else {
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
                var4.a();
                boolean discarded$7 = ((ni) this).field_d.a(true);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("ni.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final void a(int param0, eo param1) {
        try {
            boolean discarded$0 = ((ni) this).field_a.a(786336, 24, true);
            int var3_int = -61 / ((param0 - -55) / 41);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ni.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
    }
}
