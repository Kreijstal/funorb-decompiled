/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id {
    static int field_c;
    static int[] field_b;
    static int field_a;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = fa.a((byte) 117, "", param1, '_');
          if (param2 != 0) {
            id.a((byte) 108, 39, 2);
          }
          var3 = ag.a(param1, 1);
          stackIn_7_0 = (param0.indexOf(param1) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("id.C(");
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
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static o a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        o var6 = new o(param2, param2);
        o var3 = var6;
        if (param0 <= 51) {
          id.a((byte) -66, -95, 21);
        }
        for (var4 = 0; var4 < var3.field_B.length; var4++) {
          var6.field_B[var4] = param1;
        }
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          id.a((byte[]) null, -117, 97, 106);
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        qk var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          if (param1 < param3) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; param2 > var5_int; var5_int++) {
              var8[var5_int] = param0[var5_int + param3];
            }
          } else {
            var4 = param0;
          }
          var5 = new qk();
          var5.a(117);
          var5.a((long)(param2 * 8), var4, (byte) -19);
          var6 = new byte[64];
          var5.a(var6, 0, (byte) 124);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("id.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        try {
          IOException iOException = null;
          String var3 = null;
          Throwable decompiledCaughtException = null;
          if (jc.field_H != null && (0 > param1 ||
            wh.field_j == hi.field_l)) {
            if (n.field_b.field_m == 0 &&
              hi.field_k + 10000L < d.a((byte) 44)) {
              n.field_b.c((byte) 65, param1);
            }
            if (n.field_b.field_m > 0) {
              try {
                jc.field_H.a(n.field_b.field_m, n.field_b.field_k, 1, 0);
                hi.field_k = d.a((byte) 29);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ql.a(param0 ^ 17);
              }
              n.field_b.field_m = 0;
            }
            if (param0 != -67) {
              var3 = (String) null;
              id.a((String) null, (String) null, -41);
            }
            return;
          }
          n.field_b.field_m = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = 0;
        field_b = new int[1024];
    }
}
