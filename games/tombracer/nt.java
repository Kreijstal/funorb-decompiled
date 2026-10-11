/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nt {
    static int field_a;
    static String field_c;
    static int field_d;
    static int field_b;

    final static cn a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          js var8 = null;
          java.applet.Applet var9 = null;
          cn stackIn_14_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (oi.field_a.field_n != null) {
              wka.field_c = new ph(oi.field_a.field_n, 5200, 0);
              oi.field_a.field_n = null;
              var6 = new ppa(255, wka.field_c, new ph(oi.field_a.field_q, 12000, 0), 2097152);
            }
            if (wka.field_c != null) {
              if (tna.field_c == null) {
                tna.field_c = new ph[oi.field_a.field_h.length];
              }
              if (null == tna.field_c[param0]) {
                tna.field_c[param0] = new ph(oi.field_a.field_h[param0], 12000, 0);
                oi.field_a.field_h[param0] = null;
              }
              var7 = new ppa(param0, wka.field_c, tna.field_c[param0], 2097152);
            }
            if (param2 != 5200) {
              var9 = (java.applet.Applet) null;
              nt.a((java.applet.Applet) null, 34);
            }
            var8 = uja.field_a.a((ppa) (var7), param0, (ppa) (var6), param4, param2 ^ 5167);
            if (param3) {
              var8.a((byte) 115);
            }
            stackIn_14_0 = new cn(var8, param5, param1);
            return stackIn_14_0;
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

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_a = -25;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (param1 != -1978) {
                nt.a(true);
              }
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(sda.a(param0, -1, var5), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("nt.C(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
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

    static {
        field_c = "Buying or selling an account";
        field_a = 0;
        field_b = -1;
    }
}
