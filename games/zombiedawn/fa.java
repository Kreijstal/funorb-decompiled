/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fa extends nb {
    fa field_q;
    fa field_r;
    static int field_p;

    final void d(int param0) {
        if (null != ((fa) this).field_r) {
          ((fa) this).field_r.field_q = ((fa) this).field_q;
          ((fa) this).field_q.field_r = ((fa) this).field_r;
          if (param0 != 0) {
            ((fa) this).field_r = null;
            ((fa) this).field_q = null;
            ((fa) this).field_r = null;
            return;
          } else {
            ((fa) this).field_q = null;
            ((fa) this).field_r = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              rf.a((java.awt.Component) (Object) param1, -116);
              mj.a(3490, (java.awt.Component) (Object) param1);
              if (null != jl.field_u) {
                jl.field_u.a((java.awt.Component) (Object) param1, (byte) -36);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -46) {
              break L0;
            } else {
              field_p = -68;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fa.EC(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            var14 = new char[param1];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            if (param3 < -58) {
              L1: while (true) {
                if (param1 <= var6) {
                  stackOut_17_0 = new String(var14, 0, var5);
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  var7 = param0[param2 - -var6] & 255;
                  if (var7 == 0) {
                    var6++;
                    var6++;
                    continue L1;
                  } else {
                    L2: {
                      if (var7 < 128) {
                        break L2;
                      } else {
                        if (var7 >= 160) {
                          break L2;
                        } else {
                          L3: {
                            var8 = fj.field_h[-128 + var7];
                            if (var8 == 0) {
                              var8 = 63;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var7 = var8;
                          break L2;
                        }
                      }
                    }
                    int incrementValue$31 = var5;
                    var5++;
                    var10[incrementValue$31] = (char)var7;
                    var6++;
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("fa.DC(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_18_0;
    }

    protected fa() {
    }

    final static int e(int param0) {
        int var1 = -98 / ((-62 - param0) / 56);
        return 4 + pb.a(so.field_a, 16, 1);
    }

    static {
    }
}
