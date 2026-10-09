/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class am {
    static dm field_b;
    static ck field_d;
    private int[] field_c;
    static int[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 49) {
            am.a((byte) 72);
        }
        field_a = null;
    }

    final int a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        if (!param0) {
          field_b = (dm) null;
        }
        var3 = (this.field_c.length >> 1) - 1;
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_c[1 + var4 + var4];
          if (-1 == var5) {
            return -1;
          }
          if (this.field_c[var4 + var4] == param1) {
            return var5;
          }
          var4 = var4 + 1 & var3;
        }
    }

    final static rh a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            bj var8 = null;
            rh stackIn_2_0 = null;
            rh stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 > -49) {
                stackIn_2_0 = (rh) null;
                return stackIn_2_0;
              }
              var6 = null;
              if (ph.field_i.field_j != null) {
                af.field_d = new sk(ph.field_i.field_j, 5200, 0);
                ph.field_i.field_j = null;
                var6 = new jh(255, af.field_d, new sk(ph.field_i.field_s, 12000, 0), 2097152);
              }
              var7 = null;
              if (af.field_d != null) {
                if (je.field_h == null) {
                  je.field_h = new sk[ph.field_i.field_r.length];
                }
                if (je.field_h[param1] == null) {
                  je.field_h[param1] = new sk(ph.field_i.field_r[param1], 12000, 0);
                  ph.field_i.field_r[param1] = null;
                }
                var7 = new jh(param1, af.field_d, je.field_h[param1], 2097152);
              }
              var8 = gb.field_b.a(param1, (byte) -9, param5, (jh) (var6), (jh) (var7));
              if (param2) {
                var8.b(92);
              }
              stackIn_15_0 = new rh(var8, param4, param3);
              return stackIn_15_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    am(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_c = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_c[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            for (var4 = param0[var3Lifetime1] & var2_int - 1; this.field_c[var4 + var4 + 1] != -1; var4 = var4 + 1 & -1 + var2_int) {
            }
            this.field_c[var4 + var4] = param0[var3Lifetime1];
            this.field_c[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("am.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = new int[12];
        field_d = new ck(12, 0, 1, 0);
    }
}
