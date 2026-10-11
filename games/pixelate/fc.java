/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static tf[] field_d;
    static String field_b;
    static boolean field_a;
    static String field_c;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 32) {
          return;
        }
        field_c = null;
    }

    final static void a(ak param0, int param1, ak param2) {
        if (param0.field_L == null) {
          param0.field_L = new bb();
        }
        if (param1 != 64) {
          return;
        }
        try {
          if (param2.field_L == null) {
            param2.field_L = new bb();
          }
          if (null == vm.field_b) {
            vm.field_b = new vg(64);
          }
          if (null == hq.field_q) {
            hq.field_q = new vg(64);
          }
          bq.field_b = param2.field_L;
          vp.field_Hb = param0.field_L;
          bd.a((byte) -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(lg.a(false, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 == 19) {
              return;
            }
            var3 = (java.applet.Applet) null;
            fc.a((java.applet.Applet) null, (byte) -14);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("fc.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 >= -30) {
          field_c = (String) null;
          if (32 >= wn.field_u) {
            jg.a(0, 119);
            return;
          }
          var1 = wn.field_u % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          jg.a(wn.field_u - var1, -8);
          return;
        }
        if (32 >= wn.field_u) {
          jg.a(0, 119);
          return;
        }
        var1Lifetime1 = wn.field_u % 32;
        if (var1Lifetime1 == 0) {
          var1Lifetime1 = 32;
        }
        jg.a(wn.field_u - var1Lifetime1, -8);
    }

    static {
        field_b = "Month";
        field_c = "Just play";
    }
}
