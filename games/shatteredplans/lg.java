/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lg extends IOException {
    static jp field_e;
    static tj field_c;
    static String field_f;
    static boolean field_b;
    static int[] field_d;
    static int[] field_a;

    final static nk[] a(int param0, bc param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        nk[] stackIn_5_0 = null;
        nk[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vd.a(param3, param1, param2, 2)) {
            stackIn_2_0 = null;
            return (nk[]) (stackIn_2_0);
          }
          if (param0 == -20435) {
            stackIn_7_0 = jj.c(true);
            return stackIn_7_0;
          }
          stackIn_5_0 = (nk[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static nk a(int param0, int param1, int param2, bc param3) {
        RuntimeException var4 = null;
        nk stackIn_5_0 = null;
        nk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vd.a(param2, param3, param1, 2)) {
            return null;
          }
          if (param0 < -71) {
            stackIn_7_0 = ta.c((byte) 118);
            return stackIn_7_0;
          }
          stackIn_5_0 = (nk) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
          field_a = (int[]) null;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -34 / ((23 - param0) / 53);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    lg(String param0) {
        super(param0);
    }

    final static void a(long param0, java.applet.Applet param1, int param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            if (param2 <= 1) {
              lg.a(63);
            }
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L <= param0) {
                var7Lifetime4 = var9 + "; Expires=" + vm.a(pr.a(14274) + 1000L * param0, 10) + "; Max-Age=" + param0;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              ll.a(param1, "document.cookie=\"" + var7Lifetime4 + "\"", (byte) 123);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("lg.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static bi a(int param0, String param1) {
        th var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        bi var5 = null;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = mp.field_b;
          var3 = ((nq) ((Object) var2)).c(param1);
          var4 = ((nq) ((Object) var2)).field_J + ((nq) ((Object) var2)).field_q;
          var5 = new bi(var3, var4);
          bs.a(var5, 112);
          ((nq) ((Object) var2)).d(param1, 0, ((nq) ((Object) var2)).field_J, 16777215, -1);
          cg.i(param0);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("lg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_f = "<%0> has resigned and left.";
        field_a = new int[8192];
    }
}
