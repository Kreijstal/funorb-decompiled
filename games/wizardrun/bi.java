/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int field_a;

    final static void a(vh param0, byte param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = wizardrun.field_H;
        try {
          if (null == param0.field_a) {
            return;
          }
          if (param1 > -41) {
            var5 = (byte[]) null;
            bi.a((byte[]) null, -74, -99);
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (param0.field_a.peekEvent() != null) {
              tg.a(1L, false);
              continue;
            }
            break;
          }
          try {
            if (param2 != null) {
              param0.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("bi.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, byte[] param2, boolean param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        byte[] var10 = null;
        var9 = wizardrun.field_H;
        try {
          var13 = new char[param1];
          var12 = var13;
          var11 = var12;
          var4 = var11;
          var5 = 0;
          for (var6 = 0; var6 < param1; var6++) {
            var7 = 255 & param2[var6 + param0];
            if (0 != var7) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = ki.field_G[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var11[incrementValue$0] = (char)var7;
            }
          }
          if (param3) {
            stackIn_17_0 = 11;
            stackIn_17_1 = 78;
            var10 = (byte[]) null;
            bi.a(stackIn_17_0, stackIn_17_1, (byte[]) null, true);
          }
          stackIn_19_0 = new String(var13, 0, var5);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("bi.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 10510) {
            stackIn_4_0 = gh.a(param0, 113, 0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 0;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bi.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
