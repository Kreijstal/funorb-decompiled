/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mc {
    static v field_b;
    static int field_a;
    static String field_e;
    static Random field_c;
    static String field_d;

    final static byte[] a(byte[] param0, int param1) {
        byte[] discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        byte[] var9 = null;
        jc var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var10 = new jc(param0);
              if (param1 > 110) {
                break L1;
              } else {
                var9 = (byte[]) null;
                discarded$2 = mc.a((byte[]) null, 98);
                break L1;
              }
            }
            L2: {
              var3 = var10.g(11132);
              var4 = var10.d((byte) 93);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (on.field_c == 0) {
                    break L3;
                  } else {
                    if (var4 > on.field_c) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (0 != var3) {
                  L4: {
                    var5 = var10.d((byte) 123);
                    if ((var5 ^ -1) > -1) {
                      break L4;
                    } else {
                      L5: {
                        if (on.field_c == 0) {
                          break L5;
                        } else {
                          if (on.field_c < var5) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var14 = new byte[var5];
                        var12 = var14;
                        var6 = var12;
                        if ((var3 ^ -1) != -2) {
                          var7 = te.field_b;
                          synchronized (var7) {
                            L7: {
                              te.field_b.a((byte) 50, var14, var10);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          discarded$3 = bb.a(var14, var5, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackOut_22_0 = (byte[]) (var6);
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5_ref_byte__ = var11;
                  var10.a(0, var4, true, var13);
                  stackOut_8_0 = (byte[]) (var5_ref_byte__);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("mc.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static boolean a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (param2) {
          L0: {
            field_c = (Random) null;
            if (ag.c(-117)) {
              L1: {
                hd.a(param0, (byte) -116, param6, param1);
                if (md.field_e == null) {
                  break L1;
                } else {
                  if (!md.field_e.a(param3, param5, param0, param1, (byte) 95)) {
                    break L1;
                  } else {
                    ch.a(true);
                    param1 = false;
                    break L1;
                  }
                }
              }
              qg.a(7377, param1, param0);
              te.a(param1, -121, param4);
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
          return param1;
        } else {
          L2: {
            if (ag.c(-117)) {
              L3: {
                hd.a(param0, (byte) -116, param6, param1);
                if (md.field_e == null) {
                  break L3;
                } else {
                  if (!md.field_e.a(param3, param5, param0, param1, (byte) 95)) {
                    break L3;
                  } else {
                    ch.a(true);
                    param1 = false;
                    break L3;
                  }
                }
              }
              qg.a(7377, param1, param0);
              te.a(param1, -121, param4);
              param1 = false;
              break L2;
            } else {
              break L2;
            }
          }
          return param1;
        }
    }

    public static void a(boolean param0) {
        boolean discarded$2 = false;
        field_d = null;
        if (param0) {
          discarded$2 = mc.a(44, true, false, -98, 124, 89, 122);
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    static {
        field_a = -1;
        field_e = "<%0> has lost connection.";
        field_c = new Random();
        field_d = "Rotate camera left";
    }
}
