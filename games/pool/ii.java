/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static UiComponent field_e;
    static String createPasswordConfirmTooltip;
    static int field_d;
    static int field_a;
    static String muXCannotJoinInprogress;
    static String gameoptTrychanging1;

    public static void releaseStatics(int param0) {
        createPasswordConfirmTooltip = null;
        if (param0 <= 126) {
          return;
        }
        muXCannotJoinInprogress = null;
        field_e = null;
        gameoptTrychanging1 = null;
    }

    final static Sprite a(int param0, IndexedSprite param1) {
        RuntimeException var2 = null;
        int var5 = 0;
        int var6 = 0;
        IndexedSprite var7 = null;
        Sprite var9 = null;
        int[] var15 = null;
        int[] var16 = null;
        Sprite stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new Sprite(4 + param1.width, param1.height + 4);
          var9.field_B = param1.trimY - 2;
          var9.field_G = param1.trimX - 2;
          var15 = new int[4];
          var16 = SoftwareRasterizer.pixels;
          var5 = SoftwareRasterizer.width;
          var6 = SoftwareRasterizer.height;
          SoftwareRasterizer.saveClip(var15);
          var9.bindAsRenderTarget();
          param1.trimY = 0;
          var7 = param1;
          param1.fullWidth = param1.width;
          var7.trimX = 0;
          param1.fullHeight = param1.height;
          param1.draw(2, param0);
          var9.addOutline(4144959);
          var9.addOutline(65793);
          SoftwareRasterizer.setTarget(var16, var5, var6);
          SoftwareRasterizer.restoreClip(var15);
          stackIn_1_0 = var9;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ii.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static SocketConnector createProxyConnector(int param0, String param1, int param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 97) {
            ii.releaseStatics(66);
          }
          var3 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var3)).field_a = param2;
          ((SocketConnector) ((Object) var3)).field_c = param1;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ii.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static long crc64(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var7 = null;
        long stackIn_6_0 = 0L;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = -1L;
          for (var6 = param2; var6 < param1; var6++) {
            var4_long = var4_long >>> 8 ^ NodeHashTableIterator.field_f[(int)(((long)param0[var6] ^ var4_long) & 255L)];
          }
          if (param3 != 154302664) {
            var7 = (byte[]) null;
            ii.crc64((byte[]) null, -86, 117, -25);
          }
          var4_long = ~var4_long;
          stackIn_6_0 = var4_long;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ii.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        if (param0 != -31668) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != sm.field_C) {
          var3 = sm.field_C.updateAndPollNameInput(param2, (byte) -83);
          if (0 != var3) {
            if (var3 == 2 &&
              sm.field_C.text != null &&
              !sm.field_C.text.equals("")) {
              if (sm.field_C.text.charAt(0) != 91) {
                var7 = (CharSequence) ((Object) sm.field_C.text);
                var4 = TutorialController.normalizeDisplayName(85, var7);
              } else {
                var4 = sm.field_C.text;
              }
              var5 = null;
              if (MatchingTextValidator.field_m == 0) {
                var5 = MultiHandleSliderWidget.a(var4, param1, 51);
              }
              if (MatchingTextValidator.field_m == 1) {
                var5 = HalloweenBallSkin.a((byte) 83, var4, param1);
              }
              if (MatchingTextValidator.field_m == 2) {
                var5 = jd.a(param1, var4, param0 ^ -31666);
              }
              if (MatchingTextValidator.field_m == 3) {
                var5 = MembershipBenefitsLoader.removeIgnore(-3266, var4, var4, param1);
              }
              if (var5 == null) {
                MatchingTextValidator.field_m = -1;
                sm.field_C = null;
              } else {
                var6 = (String) null;
                jh.a(0, (String) (var5), (String) null, 2, var4, true);
                MatchingTextValidator.field_m = -1;
                sm.field_C = null;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              MatchingTextValidator.field_m = -1;
              sm.field_C = null;
            }
          }
        }

    }

    final static void a(boolean param0, int param1) {
        t.a(117, param0, false);
        if (param1 != 0) {
          field_d = -51;
        }
    }

    static {
        field_d = 0;
        createPasswordConfirmTooltip = "Type your password again to make sure it's correct";
        muXCannotJoinInprogress = "<%0> cannot join; the game has started.";
        gameoptTrychanging1 = "Try changing the '<%0>' setting.";
        field_a = 0;
    }
}
