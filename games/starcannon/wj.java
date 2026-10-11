/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static String field_c;
    static String field_f;
    static gi field_d;
    static hl field_g;
    static int field_b;
    static int field_e;
    static volatile int field_a;

    final static void a(int param0, hl[] param1, int param2, int param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param1 != null &&
            param4 > 0) {
            var5_int = param1[0].field_x;
            var6 = param1[2].field_x;
            var7 = param1[1].field_x;
            param1[0].e(param2, param3);
            param1[2].e(param2 + param4 - var6, param3);
            ki.a(be.field_c);
            ki.c(var5_int + param2, param3, -var6 + param2 + param4, param1[1].field_q + param3);
            var8 = param2 + var5_int;
            var9 = 80 % ((param0 - 53) / 32);
            var10 = param2 + (param4 - var6);
            for (param2 = var8; var10 > param2; param2 = param2 + var7) {
              param1[1].e(param2, param3);
            }
            ki.b(be.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
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
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(wh.a(127, var5, param0), "_self");
              if (param1 == 0) {
                return;
              }
              field_f = (String) null;
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
            stackIn_9_0 = var2_ref2;
            stackIn_9_1 = new StringBuilder().append("wj.B(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_d = null;
          field_f = null;
          field_c = null;
          field_g = null;
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        wj.a((java.applet.Applet) null, -56);
        field_d = null;
        field_f = null;
        field_c = null;
        field_g = null;
    }

    final static void b(boolean param0) {
        bc var1 = (bc) (va.field_h.d(77));
        if (var1 == null) {
          var1 = new bc();
        }
        if (param0) {
          var1.a(ki.field_j, ki.field_g, ki.field_i, ki.field_a, ki.field_l, ki.field_e, ki.field_f, false);
          gi.field_a.b(70, var1);
          return;
        }
        hl[] var2 = (hl[]) null;
        wj.a(-47, (hl[]) null, 85, -18, 75);
        var1.a(ki.field_j, ki.field_g, ki.field_i, ki.field_a, ki.field_l, ki.field_e, ki.field_f, false);
        gi.field_a.b(70, var1);
    }

    static {
        field_f = "Create your own free Jagex account";
        field_e = 0;
        field_g = new hl(540, 140);
        field_a = -1;
    }
}
