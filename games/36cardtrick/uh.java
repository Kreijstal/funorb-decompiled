/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends qb {
    static de field_n;
    long[][] field_j;
    String[][] field_m;
    int field_h;
    static long field_p;
    int field_g;
    static java.applet.Applet field_i;
    int[][] field_q;
    boolean field_o;
    int field_k;
    static Random field_l;

    final static dh a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        dh var8 = new dh(param5, param3, param0, param6, param4, param7);
        vb.field_c.a(var8, 27362);
        if (param1 > 49) {
          ke.a(var8, param2, 21719);
          return var8;
        }
        field_i = (java.applet.Applet) null;
        ke.a(var8, param2, 21719);
        return var8;
    }

    final static int a(byte param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 97) {
            stackIn_4_0 = ml.a(param2, 0, param1, 12011);
            return stackIn_4_0;
          }
          stackIn_2_0 = 53;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static kc[] a(int param0, qk param1, int param2, byte param3) {
        RuntimeException var4 = null;
        kc[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tc.a(param0, param2, param3 + 25552, param1)) {
            return null;
          }
          if (param3 != -73) {
            field_n = (de) null;
          }
          stackIn_6_0 = ol.s(-106);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("uh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(qk param0, qk param1, qk param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.b(param3 ^ 6) &&
            param0.b(4, "commonui")) {
            if (param2.b(4) &&
              param2.b(param3 ^ 6, "commonui")) {
              if (param1.b(param3 + param3) &&
                param1.b(4, "button.gif")) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("uh.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (param0 > -62) {
          field_l = (Random) null;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_l = null;
        if (param0 != -12908) {
          field_l = (Random) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    final static void a(long param0, int param1, String param2, String param3, java.applet.Applet param4) {
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
            try {
              var8 = param4.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param2 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param1 <= 95) {
                return;
              }
              if (0L <= param0) {
                var7Lifetime4 = var9 + "; Expires=" + h.a(-60, id.a(106) + param0 * 1000L) + "; Max-Age=" + param0;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              vh.a(param4, "document.cookie=\"" + var7Lifetime4 + "\"", -12300);
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
            stackIn_11_1 = new StringBuilder().append("uh.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
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
            throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    uh() {
    }

    static {
        field_n = new de(0, 2, 2, 1);
        field_l = new Random();
    }
}
