/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    int field_a;
    static int field_b;

    final static void a(int param0) {
        if (param0 < 106) {
          return;
        }
        km.a(117);
        ff.field_a = true;
        cf.field_f = true;
        dc.field_a.h(21);
        jk.a(af.field_a, (byte) -79, false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param1.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              if (param0 != 25530) {
                return;
              }
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4Lifetime2);
              param1.getAppletContext().showDocument(og.a(var5, param1, (byte) -80), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("gq.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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

    gq(int param0) {
        this.field_a = param0;
    }

    final static void a(int[] param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Torquing.field_u;
        try {
          if (param1 != 4) {
            gq.a(32);
          }
          param2 = (param2 & 503) >> 7;
          stackIn_6_0 = (param2 >= 2) ? 0 : 1;
          var3_int = stackIn_6_0;
          stackIn_9_0 = (2 != param2) ? 0 : 1;
          var4 = stackIn_9_0;
          stackIn_12_0 = ((1 & param2) == 0) ? 0 : 1;
          var5 = stackIn_12_0;
          for (var6 = 0; var6 < param0.length; var6++) {
            var7 = (param0[var6] & 64512) >> 10;
            var8 = (896 & param0[var6]) >> 7;
            if (2 <= var8) {
              if (var7 < 4 ||
                var7 > 60) {
                if (var3_int != 0) {
                  param0[var6] = gm.a(ie.a(65408, param0[var6]), 64);
                } else {
                  param0[var6] = gm.a(ie.a(65408, param0[var6]), 6);
                }
              }
              if (var7 > 4 &&
                var7 < 12) {
                if (var5 == 0) {
                  param0[var6] = gm.a(6, ie.a(param0[var6], 65408));
                } else {
                  param0[var6] = gm.a(64, ie.a(param0[var6], 65408));
                }
              }
              if (var7 > 17 &&
                var7 < 25) {
                if (var4 != 0) {
                  param0[var6] = gm.a(64, ie.a(65408, param0[var6]));
                } else {
                  param0[var6] = gm.a(6, ie.a(65408, param0[var6]));
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("gq.B(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
