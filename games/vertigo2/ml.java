/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ml extends va {
    static r field_u;
    static int field_v;
    static String field_A;
    static int field_w;
    static String field_x;
    static int[] field_t;
    static r field_y;
    static int field_z;

    ml(int param0) {
        this(qc.field_x, param0);
    }

    ml(cc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_z, -1, 2147483647, false);
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        try {
            if (param0) {
                h.a(param1 - -param3.field_o, 1, param3.field_t + param4, param3.field_n, param3.field_s);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ml.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          L1: {
            var6 = -44;
            if (param1 < ap.field_e) {
              break L1;
            } else {
              if (ib.field_a < param4) {
                break L1;
              } else {
                if (param3 < ua.field_e) {
                  break L1;
                } else {
                  if (cj.field_D >= param2) {
                    bg.a(param0, 61, param4, param3, param1, param2);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          hb.b(param4, param2, 94, param0, param3, param1);
          break L0;
        }
    }

    public static void c() {
        field_x = null;
        field_u = null;
        field_t = null;
        field_A = null;
        field_y = null;
    }

    final static er[] a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        er var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        er var13 = null;
        er var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = bi.field_l;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = bi.field_e;
          var8 = bi.field_j;
          var9 = new er(16, param4);
          var9.d();
          bi.e(0, 0, 16, param4, param1, param3);
          var10 = null;
          var11 = null;
          if (!param2) {
            break L0;
          } else {
            var13 = var9.c();
            var10 = (Object) (Object) var13;
            var13.d();
            bi.b(0, 0, 5, 0);
            bi.b(0, 1, 3, 0);
            bi.b(0, 2, 2, 0);
            bi.b(0, 3, 1, 0);
            bi.b(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          if (!param5) {
            break L1;
          } else {
            var14 = var9.c();
            var11 = (Object) (Object) var14;
            var14.d();
            bi.b(11, 0, 5, 0);
            bi.b(13, 1, 3, 0);
            bi.b(14, 2, 2, 0);
            bi.b(15, 3, 1, 0);
            bi.b(15, 4, 1, 0);
            break L1;
          }
        }
        bi.a(var18, var7, var8);
        return new er[]{null, null, null, (er) var10, var9, (er) var11, null, null, null};
    }

    final static void a(mi param0) {
        Object var2 = null;
        RuntimeException var2_ref = null;
        oc var2_ref2 = null;
        int var12 = 0;
        Object var16 = null;
        Object var19 = null;
        Object var20 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var2 = null;
        var16 = null;
        var19 = null;
        var20 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_ref2 = (oc) (Object) mg.field_N.a((byte) 100);
            if (var2_ref2 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("ml.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + -25 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_x = "ESC - cancel this line";
        field_A = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_t = new int[8192];
    }
}
