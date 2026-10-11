/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fh extends hd {
    static hl[] field_r;
    static hl field_q;

    fh(qe param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_p, -1, 2147483647, false);
    }

    final static String a(String param0, java.applet.Applet param1, byte param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          String stackIn_6_0 = null;
          Object stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = (String) (mb.a(param1, "getcookies", true));
              var4 = uj.a(-89, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_6_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            if (param2 >= 77) {
              return null;
            }
            field_r = (hl[]) null;
            stackIn_13_0 = null;
            return (String) (stackIn_13_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("fh.N(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        java.applet.Applet var4 = null;
        we var5 = null;
        dg var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = StarCannon.field_A;
        try {
          var6 = (dg) (vb.field_k.c(-3905));
          if (param1 != 8100) {
            var4 = (java.applet.Applet) null;
            fh.a((String) null, (java.applet.Applet) null, (byte) -52);
          }
          while (var6 != null) {
            tj.a((byte) 69, var6, param0);
            var6 = (dg) (vb.field_k.a(param1 - 25013));
          }
          var5 = (we) (ma.field_h.c(-3905));
          while (var5 != null) {
            la.a(0, var5, param0);
            var5 = (we) (ma.field_h.a(param1 - 25013));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "fh.K(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        int var1 = 43 % ((param0 + 7) / 39);
        field_q = null;
        field_r = null;
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        try {
          if (param1) {
            sk.a(param0 + param4.field_s, param4.field_i, param4.field_f, true, param4.field_j + param3);
          }
          int var6_int = -54 / ((param2 - 2) / 54);
          super.a(param0, param1, 66, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fh.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    fh(int param0) {
        this(nb.field_c, param0);
    }

    static {
        field_r = new hl[8];
    }
}
