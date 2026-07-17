/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eib extends rqa {
    static long field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                eib.a(-97, 123, -112);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(2, 124));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("eib.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2) {
        qw var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        ana var4 = null;
        qw var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (ms.field_y == null) {
                break L1;
              } else {
                if (null == kba.field_a) {
                  break L1;
                } else {
                  var3 = (qw) (Object) ms.field_y.d(0);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: {
                        var3_int = param1;
                        if (fbb.field_j[param1] > 1) {
                          var3_int = hob.a(jp.field_Jc, fbb.field_j[param1], 117) + param1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4 = lha.a(param0 ^ -6902, fa.field_d[var3_int]);
                      var5 = new qw();
                      var5.field_k = var4;
                      var5.field_m = false;
                      var5.field_i = jia.field_o;
                      var5.field_f = param1;
                      ms.field_y.b(-10258, (ksa) (Object) var5);
                      break L1;
                    } else {
                      L4: {
                        if (param1 != var3.field_f) {
                          break L4;
                        } else {
                          if (var3.field_m) {
                            break L4;
                          } else {
                            if (Math.abs(var3.field_i - jia.field_o) < param2) {
                              return;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var3 = (qw) (Object) ms.field_y.a((byte) 92);
                      continue L2;
                    }
                  }
                }
              }
            }
            if (param0 == 6811) {
              break L0;
            } else {
              field_o = 48;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3_ref, "eib.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static phb[] a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        phb var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        phb var13 = null;
        phb var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = dma.field_i;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = dma.field_g;
          var8 = dma.field_j;
          var9 = new phb(16, param5);
          var9.b();
          dma.c(0, 0, 16, param5, param4, param2);
          var10 = null;
          var11 = null;
          if (!param0) {
            break L0;
          } else {
            var13 = var9.d();
            var10 = (Object) (Object) var13;
            var13.b();
            dma.h(0, 0, 5, 0);
            dma.h(0, 1, 3, 0);
            dma.h(0, 2, 2, 0);
            dma.h(0, 3, 1, 0);
            dma.h(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          if (!param1) {
            break L1;
          } else {
            var14 = var9.d();
            var11 = (Object) (Object) var14;
            var14.b();
            dma.h(11, 0, 5, 0);
            dma.h(13, 1, 3, 0);
            dma.h(14, 2, 2, 0);
            dma.h(15, 3, 1, 0);
            dma.h(15, 4, 1, 0);
            break L1;
          }
        }
        dma.a(var18, var7, var8);
        return new phb[]{null, null, null, (phb) var10, var9, (phb) var11, null, null, null};
    }

    eib(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 3;
    }
}
