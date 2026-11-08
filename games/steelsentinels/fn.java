/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static boolean field_a;

    final static void a(int param0, int param1, boolean param2, int param3, MusicTrack param4) {
        RuntimeException var5 = null;
        MusicTrack var6 = null;
        MusicCrossfadeStream stackIn_2_0;
        int stackIn_2_1;
        MusicTrack stackIn_2_2;
        int stackIn_2_3;
        int stackIn_2_4;
        boolean stackIn_3_5 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = ja.field_g;
          stackIn_2_1 = param3;
          stackIn_2_2 = (MusicTrack) (param4);
          stackIn_2_3 = param1;
          stackIn_2_4 = 1000000;
          stackIn_3_5 = !(param2);
          ((MusicCrossfadeStream) (Object) stackIn_2_0).selectTrack(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_2_4, stackIn_3_5, param0 ^ -15608);
          if (param0 == -26907) {
            return;
          }
          var6 = (MusicTrack) null;
          fn.a(-18, -98, false, -47, (MusicTrack) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fn.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static EmailFormatError a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        EmailFormatError stackIn_3_0 = null;
        EmailFormatError stackIn_7_0 = null;
        EmailFormatError stackIn_17_0 = null;
        EmailFormatError stackIn_20_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        MusicTrack var6 = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_3_0 = ud.field_A;
            return stackIn_3_0;
          }
          if (63 < var2_int) {
            stackIn_7_0 = TextHotspotWidget.field_cb;
            return stackIn_7_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_17_0 = ClientUiHelpers.field_b;
                return stackIn_17_0;
              }
            } else {
              if (sa.field_d.indexOf(var4) == -1) {
                stackIn_20_0 = ClientUiHelpers.field_b;
                return stackIn_20_0;
              }
            }
          }
          if (param0 < -113) {
            return null;
          }
          var6 = (MusicTrack) null;
          fn.a(50, -4, true, -63, (MusicTrack) null);
          stackIn_27_0 = null;
          return (EmailFormatError) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("fn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static AccountRequestResult a(boolean param0, byte param1) {
        AccountRequestResult var2 = null;
        AccountRequestResult var2Lifetime1;
        if (param1 == 69) {
          var2 = new AccountRequestResult(true);
          var2.field_f = param0 ? true : false;
          return var2;
        }
        MusicTrack var3 = (MusicTrack) null;
        fn.a(21, -123, false, -68, (MusicTrack) null);
        var2Lifetime1 = new AccountRequestResult(true);
        var2Lifetime1.field_f = param0 ? true : false;
        return var2Lifetime1;
    }

    static {
        field_a = false;
    }
}
