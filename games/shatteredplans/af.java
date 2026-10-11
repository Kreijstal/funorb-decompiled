/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends java.awt.Canvas {
    static String field_b;
    static String field_e;
    static qr field_f;
    private java.awt.Component field_a;
    static String field_d;
    static String field_c;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return true;
          }
          if (di.field_q != null) {
            stackIn_9_0 = !(param0.toLowerCase().indexOf(di.field_q.toLowerCase()) < 0);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("af.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        qh.g(83);
        if (param0 != 0) {
          field_f = (qr) null;
          ak.i(-751);
          return;
        }
        ak.i(-751);
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        field_e = null;
        if (param0 == -1) {
          field_c = null;
          return;
        }
        af.a(-3);
        field_c = null;
    }

    final static boolean b(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          try {
            if (!qb.field_b.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                return false;
              }
            }
            if (param1 != -1495) {
              field_d = (String) null;
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("af.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "af.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    af(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "af.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Orb points: <%0>";
        field_b = "You are on <%0>";
        field_c = "Solidity";
        field_d = "<%0> is not on your ignore list.";
    }
}
