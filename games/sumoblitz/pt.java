/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pt {
    static java.util.zip.CRC32 field_c;
    static volatile boolean field_a;
    static String field_b;

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
          Sumoblitz.field_H = Sumoblitz.field_H - 1;
          if (0 == Sumoblitz.field_H) {
            jg.field_b = null;
          }
        }
        if (param2 != -1) {
          return;
        }
        if (param1) {
          jj.field_d = jj.field_d - 1;
          if (jj.field_d == 0) {
            bb.field_i = null;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 12) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(pj param0, int param1, pj param2) {
        if (null != param2.field_o) {
          param2.c(-5106);
        }
        if (param1 != 2066481250) {
          return;
        }
        try {
          param2.field_o = param0;
          param2.field_m = param0.field_m;
          param2.field_o.field_m = param2;
          param2.field_m.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pt.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qv var4_ref_qv = null;
        lt var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        pl var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = ig.field_a;
          if (param0 != -22683) {
            return;
          }
          var2 = var10.e(param0 - 8619);
          var3 = var10.e(-31302);
          if (var2 == 0) {
            var4_ref_qv = (qv) (ak.field_b.b(-95));
            if (var4_ref_qv == null) {
              kk.a((byte) -127);
              return;
            }
            var5_int = gu.field_d - var10.field_p;
            var12 = var4_ref_qv.field_m;
            var11 = var12;
            var6 = var11;
            if (var5_int > var12.length << 2) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.e(-31302) << eb.a(768, var7 << 8));
            }
            var4_ref_qv.b(false);
            return;
          }
          if (1 == var2) {
            var4 = var10.h(-2858);
            var5 = (lt) (em.field_d.b(-73));
            while (var5 != null) {
              if (var3 != var5.field_k ||
                var4 != var5.field_o) {
                var5 = (lt) (em.field_d.d((byte) 18));
                continue;
              }
              break;
            }
            if (var5 != null) {
              var5.b(false);
              return;
            }
            kk.a((byte) -114);
            return;
          }
          ms.a("LR1: " + di.b((byte) 126), (Throwable) null, 0);
          kk.a((byte) -119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "pt.I(" + param0 + ')');
        }
    }

    protected pt() throws Throwable {
        throw new Error();
    }

    final static String a(String param0, ki param1, String param2, boolean param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            field_c = (java.util.zip.CRC32) null;
          }
          if (!param1.b((byte) 127)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param4 + " - " + param1.a(param0, (byte) 33) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pt.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_c = new java.util.zip.CRC32();
        field_b = "challenge";
        field_a = true;
    }
}
