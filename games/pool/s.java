/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static int[][] field_b;
    static String field_g;
    static int[] field_e;
    static di field_a;
    static int[] field_f;
    static ob[] field_c;
    static String[] field_d;

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != 2056898529) {
              field_g = (String) null;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              param0.getAppletContext().showDocument(p.a((byte) -83, var2, param0), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("s.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        if (param1 >= 86) {
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param0 & ~var2;
        }
        return -3;
    }

    final static String a(ge param0, int param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          try {
            var3_int = param0.c((byte) -115);
            if (param1 < var3_int) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param0.field_v = param0.field_v + Pool.field_J.a((byte) 36, 0, param0.field_v, var4, param0.field_t, var3_int);
            var5 = tl.a(var3_int, -7510, var4, 0);
            stackIn_7_0 = var5;
            return stackIn_7_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("s.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static dj[] a(byte param0, sj param1) {
        int var5 = 0;
        dj[] stackIn_3_0 = null;
        dj[] stackIn_10_0 = null;
        dj[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        dj[] var4 = null;
        dj var6 = null;
        int var7 = 0;
        le var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Pool.field_O;
        try {
          if (!param1.a((byte) 110)) {
            stackIn_3_0 = new dj[]{};
            return stackIn_3_0;
          }
          var8 = param1.a(84);
          while (var8.field_f == 0) {
            cf.a(-123, 10L);
          }
          if (2 == var8.field_f) {
            stackIn_10_0 = new dj[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          if (param0 > -86) {
            s.a(67, 62);
          }
          var4 = new dj[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new dj();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 2];
            var6.field_i = var3[(var5 << 2) + 1];
            var6.field_d = var3[(var5 << 2) + 2];
            var6.field_k = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("s.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
          if (var2 >= 160) {
            if (param1 != 8) {
              field_f = (int[]) null;
              return (char)var2;
            }
            return (char)var2;
          }
          var3 = rf.field_a[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        if (param1 == 8) {
          return (char)var2;
        }
        field_f = (int[]) null;
        return (char)var2;
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_b = (int[][]) null;
        if (param0 != -1) {
          field_b = (int[][]) null;
        }
    }

    final static int[] a(int param0, int param1) {
        if (param1 > 111) {
          return 0 == param0 ? jc.field_i : param0 != 8 ? 8 > param0 ? v.field_a : dq.field_i : bc.field_c;
        }
        java.applet.Applet var3 = (java.applet.Applet) null;
        s.a((java.applet.Applet) null, 17);
        return 0 == param0 ? jc.field_i : param0 != 8 ? 8 > param0 ? v.field_a : dq.field_i : bc.field_c;
    }

    static {
        field_g = "<%0> has left the lobby.";
        field_c = new ob[25];
        field_e = new int[12];
        field_d = new String[]{"Turn time (seconds)", "Game", "Theme", "Guide"};
    }
}
