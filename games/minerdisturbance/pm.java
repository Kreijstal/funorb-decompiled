/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pm extends IOException {
    static int field_c;
    static String field_b;
    static String field_d;
    static int field_a;

    public static void a(int param0) {
        int var1 = 85 % ((9 - param0) / 37);
        field_b = null;
        field_d = null;
    }

    final static bg[] b(int param0) {
        if (param0 != -5596) {
          field_c = -6;
          return new bg[]{gk.field_s, kb.field_e, ff.field_a, ab.field_b, tl.field_l, jk.field_jb, qc.field_a, oc.field_i, sj.field_a, qm.field_h, dl.field_e, hd.field_i, dg.field_a, jg.field_l};
        } else {
          return new bg[]{gk.field_s, kb.field_e, ff.field_a, ab.field_b, tl.field_l, jk.field_jb, qc.field_a, oc.field_i, sj.field_a, qm.field_h, dl.field_e, hd.field_i, dg.field_a, jg.field_l};
        }
    }

    pm(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, int param3, ea[] param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (-1 > (param3 ^ -1)) {
                  var5_int = param4[0].field_x;
                  var6 = param4[2].field_x;
                  var7 = param4[param1].field_x;
                  param4[0].f(param2, param0);
                  param4[2].f(param3 + param2 + -var6, param0);
                  eh.b(en.field_b);
                  eh.f(param2 - -var5_int, param0, param2 - (-param3 + var6), param0 - -param4[1].field_A);
                  var8 = param2 + var5_int;
                  var9 = param3 + param2 - var6;
                  param2 = var8;
                  L2: while (true) {
                    if (var9 <= param2) {
                      eh.a(en.field_b);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param4[1].f(param2, param0);
                      param2 = param2 + var7;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("pm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = 37;
        field_d = "Members' Expansion";
        field_b = null;
    }
}
