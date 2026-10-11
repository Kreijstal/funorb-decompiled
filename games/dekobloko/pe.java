/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pe {
    static ck field_d;
    static String field_a;
    static String field_c;
    static String field_b;
    static w field_e;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != -1) {
          pe.a(100, -24);
        }
        field_d = null;
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fa var4_ref_fa = null;
        Object var5 = null;
        int var6 = 0;
        hd var8 = null;
        uf var9 = null;
        byte[] var13 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var9 = de.field_V;
          var2 = var9.d((byte) -119);
          if (param0 != 14750) {
            field_e = (w) null;
          }
          if (var2 == 0) {
            var8 = (hd) (c.field_r.c((byte) 80));
            if (var8 == null) {
              si.a(67);
              return;
            }
            var4 = var9.d((byte) -90);
            if (0 == var4) {
              var5 = null;
            } else {
              var13 = new byte[var4];
              var9.a(var13, 0, (byte) 125, var4);
            }
            var9.field_n = var9.field_n + 4;
            if (!var9.g(0)) {
              si.a(param0 ^ 14802);
              return;
            }
            var8.b((byte) 109);
          } else {
            if (var2 == 1) {
              var3 = var9.i(7553);
              var4_ref_fa = (fa) (sa.field_C.c((byte) 46));
              while (var4_ref_fa != null) {
                if (var3 != var4_ref_fa.field_s) {
                  var4_ref_fa = (fa) (sa.field_C.d(true));
                  continue;
                }
                break;
              }
              if (var4_ref_fa != null) {
                var4_ref_fa.b((byte) 119);
                return;
              }
              si.a(60);
              return;
            }
            qb.a((Throwable) null, 16408, "A1: " + qk.d((byte) 47));
            si.a(78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "pe.E(" + param0 + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param0 != 25973) {
            field_b = (String) null;
          }
          if (de.field_V.field_n >= param1) {
            return true;
          }
          if (qc.field_s == null) {
            return false;
          }
          try {
            var2_int = qc.field_s.b(0);
            if (var2_int > 0) {
              if (-de.field_V.field_n + param1 < var2_int) {
                var2_int = -de.field_V.field_n + param1;
              }
              qc.field_s.a(var2_int, de.field_V.field_n, (byte) 17, de.field_V.field_r);
              p.field_a = ik.a(4);
              de.field_V.field_n = de.field_V.field_n + var2_int;
              if (param1 > de.field_V.field_n) {
                return false;
              }
              de.field_V.field_n = 0;
              return true;
            }
            if (var2_int < 0) {
              si.a(69);
            } else {
              if (sl.a(param0 - 25974) <= 30000L) {
                return false;
              }
              si.a(69);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            si.a(96);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var4_int = -1;
          if (param2 > -103) {
            pe.a(73, -42);
          }
          for (var5 = param3; var5 < param1; var5++) {
            var4_int = a.field_j[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("pe.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param0 != 922790152) {
          return false;
        }
        return param1 == (-param1 & param1) ? true : false;
    }

    static {
        field_c = "Passwords must be between 5 and 20 characters long";
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
