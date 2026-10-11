/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static gh field_c;
    static int field_b;
    static String field_g;
    static int field_a;
    static wk[] field_f;
    static int field_e;
    static long field_d;

    final static void a(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        c var3_ref_c = null;
        rh var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        kj var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        var6 = SteelSentinels.field_G;
        try {
          var9 = rf.field_d;
          var2 = var9.f((byte) -70);
          if (param0 != -16786) {
            return;
          }
          if (var2 != 0) {
            if (var2 != 1) {
              sj.a("A1: " + ci.a((byte) 94), -126, (Throwable) null);
              pm.m(param0 ^ -16880);
              return;
            }
            var3 = var9.i(0);
            var4 = (rh) (ol.field_Vb.e(13058));
            while (var4 != null) {
              if (~var4.field_x != ~var3) {
                var4 = (rh) (ol.field_Vb.a((byte) -59));
                continue;
              }
              break;
            }
            if (var4 != null) {
              var4.b(param0 ^ -16790);
              return;
            }
            stackIn_24_0 = param0;
            stackIn_24_1 = 16882;
            pm.m(stackIn_24_0 + stackIn_24_1);
            return;
          }
          var3_ref_c = (c) (fg.field_Ub.e(13058));
          if (var3_ref_c == null) {
            pm.m(111);
            return;
          }
          var4_int = var9.f((byte) -106);
          if (var4_int == 0) {
            var5 = null;
          } else {
            var11 = new byte[var4_int];
            var10 = var11;
            var8 = var10;
            var5 = var8;
            var9.a(0, var11, 28, var4_int);
          }
          var9.field_p = var9.field_p + 4;
          if (!var9.a((byte) -32)) {
            pm.m(param0 ^ 16871);
            return;
          }
          var3_ref_c.field_q = true;
          var3_ref_c.field_t = (byte[]) (var5);
          var3_ref_c.b(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "be.C(" + param0 + ')');
        }
    }

    final static u a(cm param0, cm param1, byte param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        u stackIn_2_0 = null;
        u stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.a(param4, 34);
          if (param2 >= -44) {
            stackIn_2_0 = (u) null;
            return stackIn_2_0;
          }
          var6 = param0.a(var5_int, -32759, param3);
          stackIn_4_0 = lj.a(param1, var6, -56, param0, var5_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("be.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -34) {
          field_e = 65;
        }
    }

    final static void a(boolean param0, byte param1, String param2, java.applet.Applet param3) {
        try {
          RuntimeException var4 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4_ref = null;
          try {
            if (pn.field_w.startsWith("win") &&
              hj.a(-9062, param2)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              sj.a("MGR1: " + param2, -85, (Throwable) null);
            }
            if (param1 > 0) {
              return;
            }
            field_g = (String) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4;
            stackIn_12_1 = new StringBuilder().append("be.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = "This option cannot be combined with the current '<%0>' setting.";
    }
}
