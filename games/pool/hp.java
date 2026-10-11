/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static long field_a;
    static int[] field_c;
    static dd field_b;
    static String field_e;
    static int[] field_d;

    final static boolean a(boolean param0) {
        if (param0) {
          hp.a(-113, false, -92, -109);
        }
        return tq.a(false, c.field_d, di.field_a);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          String var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(p.a((byte) 79, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param0 != 83) {
              var3 = (String) null;
              hp.a((di) null, (String) null, -87, (String) null);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("hp.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int[] param0, byte param1) {
        int var3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var6 = new int[param0.length];
          var2 = var6;
          for (var3 = 0; var3 < param0.length; var3++) {
            var6[var3] = param0[var3];
          }
          var4 = -94 / ((param1 + 31) / 50);
          stackIn_5_0 = var6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("hp.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(di param0, String param1, int param2, String param3) {
        RuntimeException var4 = null;
        int[] var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.d(-40)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          if (param2 != -641) {
            var5 = (int[]) null;
            hp.a((int[]) null, (byte) 39);
          }
          stackIn_7_0 = param3 + " - " + param0.b(0) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hp.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 > -31) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        if (!fm.field_H) {
          return;
        }
        e.field_a.a(param1, false);
        var5 = -29 / ((param3 + 12) / 33);
        var4 = im.field_Ub.i(-1) ? 1 : 0;
        if (ne.field_s != 0 &&
          var4 == 0) {
          param1 = false;
          th.b(-1);
        }
        if (param1) {
          im.field_Ub.a((byte) 86, param2, param0);
        }
        if (var4 != 0) {
          e.field_a.a(param1, false);
        }
        var6 = im.field_Ub.g(-1) + im.field_Ub.field_sb;
        if (var6 > 640) {
          gj.field_G = gj.field_G + 5;
        } else {
          if (635 > var6 &&
            gj.field_G > 0) {
            gj.field_G = gj.field_G - 5;
          }
        }
    }

    static {
        field_e = "<%0> and <%1> are offering a rematch.";
        field_d = new int[8192];
    }
}
