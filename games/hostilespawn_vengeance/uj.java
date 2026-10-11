/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends am {
    static fd field_k;
    boolean field_j;
    static int field_l;
    static oc field_p;
    static ug field_m;
    static String field_i;
    static bd field_r;
    static int field_n;
    static String field_q;
    static vl field_o;
    static String field_h;

    public static void c(int param0) {
        field_i = null;
        field_r = null;
        field_k = null;
        field_m = null;
        field_o = null;
        field_h = null;
        field_q = null;
        if (param0 == 1) {
          field_p = null;
          return;
        }
        field_k = (fd) null;
        field_p = null;
    }

    final static void d(int param0) {
        int var1 = 31 % ((param0 - 46) / 46);
        bf.field_d = null;
        sf.field_X = null;
        hd.field_r = null;
        ja.field_e = (byte[][]) null;
        nh.field_O = null;
        th.field_Jb = null;
    }

    uj() {
    }

    final static int e(int param0) {
        if (param0 != 1) {
          field_m = (ug) null;
          return tm.field_v;
        }
        return tm.field_v;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(nj.a(param0, true, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 == 41) {
              return;
            }
            uj.c(-75);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("uj.E(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18719) {
            uj.c(33);
          }
          var2 = pm.a(l.a(param0, (byte) 114), (byte) 100);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("uj.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_l = 1;
        field_i = "This password contains repeated characters, and would be easy to guess";
        field_q = "<col=ffffff>Auto<nbsp>gun</col><br>The marine's standard issue auto gun has a long range and efficient ammo use.";
        field_h = "Connection lost - attempting to reconnect";
    }
}
