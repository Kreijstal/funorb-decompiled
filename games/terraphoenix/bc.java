/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc {
    static String field_c;
    static String field_b;
    static int field_a;
    private int[] field_d;

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != ig.field_e && (param0 < 0 ||
            od.field_g == mh.field_a)) {
            if (di.field_l.field_k == 0 &&
              ll.a(1000) > (10000L + bl.field_h)) {
              di.field_l.k(-17410, param0);
            }
            if (di.field_l.field_k > 0) {
              try {
                ig.field_e.a(di.field_l.field_k, 0, (byte) -97, di.field_l.field_i);
                bl.field_h = ll.a(param1 ^ 1000);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                gb.g(-17464);
              }
              di.field_l.field_k = 0;
            }
            if (param1 == 0) {
              return;
            }
            bc.a(true);
            return;
          }
          di.field_l.field_k = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = fh.field_d.a("", param0, -21653);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_d.length >> 1) - param0;
        var4 = param1 & var3;
        while (true) {
          var5 = this.field_d[var4 + var4 + 1];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_d[var4 + var4] == param1) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    bc(int[] param0) {
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
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (-1 != this.field_d[var4 + var4 + 1]) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("bc.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = "NO";
        field_c = "Throw TQ: ";
        field_a = 100;
    }
}
