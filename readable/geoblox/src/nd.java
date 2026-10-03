/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static int avatarFeedbackModeId;
    static long field_b;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int var6;
        int var7;
        int var8;
        hb.field_l[md.field_c] = param1;
        qi.field_i[md.field_c] = md.field_c;
        hg.field_a[md.field_c] = param5;
        if (ok.field_b > param5) {
          qg.field_a = param5;
        }
        if (bd.field_a >= param5) {
          fb.field_m[md.field_c] = param3;
          k.field_i[md.field_c] = param4;
          cj.field_b[md.field_c] = param0;
          var6 = param0 + (param4 + param3);
          var8 = -80 / ((30 - param2) / 42);
          if (var6 != 0) {
            stackIn_17_0 = param3 * 1000 / var6;
          } else {
            stackIn_17_0 = 0;
          }
          var7 = stackIn_17_0;
          gk.field_a[md.field_c] = var7;
          if (va.field_b < var7) {
            va.field_b = var7;
          }
          md.field_c = md.field_c + 1;
          if (qg.field_a <= var7) {
            return;
          }
          qg.field_a = var7;
          return;
        }
        va.field_b = param5;
        fb.field_m[md.field_c] = param3;
        k.field_i[md.field_c] = param4;
        cj.field_b[md.field_c] = param0;
        var6 = param0 + (param4 + param3);
        var8 = -80 / ((30 - param2) / 42);
        if (var6 != 0) {
          stackIn_7_0 = param3 * 1000 / var6;
        } else {
          stackIn_7_0 = 0;
        }
        var7 = stackIn_7_0;
        gk.field_a[md.field_c] = var7;
        if (va.field_b < var7) {
          va.field_b = var7;
        }
        md.field_c = md.field_c + 1;
        if (qg.field_a <= var7) {
          return;
        }
        qg.field_a = var7;
    }

    final static vk a(int param0) {
        try {
            Throwable var1 = null;
            vk stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            if (param0 < 2) {
              field_b = -62L;
            }
            try {
              stackIn_3_0 = (vk) (Class.forName("gl").newInstance());
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1;
          while (param2 > 0) {
            var3_int = var3_int << 1 | param0 & 1;
            param2--;
            param0 = param0 >>> 1;
          }
          stackIn_4_0 = var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "nd.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        avatarFeedbackModeId = 0;
    }
}
