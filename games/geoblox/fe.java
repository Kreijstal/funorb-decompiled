/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fe {
    static int field_d;
    static rh field_a;
    static int field_k;
    private static ck field_h;
    static rf field_e;
    static na field_j;
    static int field_f;
    private java.util.zip.Inflater field_i;
    static boolean field_b;
    static int field_g;
    static float field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 122 % ((param0 + 22) / 63);
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final void a(int param0, qc param1, byte[] param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if ((param1.field_j[param1.field_f] == 31) &&
                  (-117 == param1.field_j[1 + param1.field_f])) {
                if (this.field_i == null) {
                  this.field_i = new java.util.zip.Inflater(true);
                }
                try {
                  this.field_i.setInput(param1.field_j, param1.field_f + 10, param1.field_j.length - 8 - (param1.field_f + 10));
                  if (param0 != -1) {
                    fe.a(76);
                  }
                  this.field_i.inflate(param2);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  exception = (Exception) (Object) decompiledCaughtException;
                  this.field_i.reset();
                  throw new RuntimeException("");
                }
                this.field_i.reset();
                return;
              }
              throw new RuntimeException("");
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_15_0 = runtimeException;
              stackIn_15_1 = new StringBuilder().append("fe.D(").append(param0).append(',');
              if (param1 == null) {
                stackIn_16_2 = "null";
              } else {
                stackIn_16_2 = "{...}";
              }
              stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
              if (param2 == null) {
                stackIn_19_2 = "null";
              } else {
                stackIn_19_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0) {
        if (param0 <= 103) {
            return 4;
        }
        return qe.field_a;
    }

    final static ck[] a(int param0) {
        if (param0 == -1) {
            return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
        }
        field_c = -1.1302366256713867f;
        return new ck[]{pj.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, wh.field_t, qj.field_a, fk.field_B, am.field_d, bd.field_c, va.field_f, field_h};
    }

    public fe() {
        this(-1, 1000000, 1000000);
    }

    final static nd a(String param0, boolean param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        nd var7 = null;
        int var8 = 0;
        nd stackIn_3_0 = null;
        nd stackIn_6_0 = null;
        nd stackIn_10_0 = null;
        nd stackIn_13_0 = null;
        nd stackIn_19_0 = null;
        nd stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          if (param1) {
            stackIn_3_0 = (nd) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = pj.field_f;
            return stackIn_6_0;
          }
          if (255 < var2_int) {
            stackIn_10_0 = hk.field_x;
            return stackIn_10_0;
          }
          var3 = uj.a('.', true, param0);
          if (var3.length < 2) {
            stackIn_13_0 = pj.field_f;
            return stackIn_13_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = jk.a(255, var6);
            if (var7 != null) {
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
          }
          stackIn_22_0 = mj.a(var3[-1 + var3.length], (byte) -97);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("fe.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private fe(int param0, int param1, int param2) {
    }

    static {
        field_d = -1;
        field_f = 7;
        field_h = new ck(15, 0, 1, 0);
    }
}
