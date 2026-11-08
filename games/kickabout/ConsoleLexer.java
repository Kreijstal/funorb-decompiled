/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleLexer {
    static int field_a;
    static volatile int field_c;
    static BitmapFont field_b;

    public static void releaseStatics(boolean param0) {
        field_b = null;
        if (!param0) {
          String var2 = (String) null;
          ConsoleLexer.tokenize(true, (String) null);
        }
    }

    final static void a(boolean param0, boolean param1) {
        NineSlicePanelPainter.field_e = !param1 ? true : false;
        if (param0) {
          field_c = -78;
          return;
        }
    }

    final static String readServerString(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return ByteArrayPool.field_e.readString(-108);
    }

    final static int rotateLeftFourBits(int param0, int param1) {
        if (param0 == -40) {
          return param1 >>> 28 | param1 << 4;
        }
        ConsoleLexer.a(true, false);
        return param1 >>> 28 | param1 << 4;
    }

    final static void showLoadingProgressDialog(int param0) {
        RankingsRequest.field_l.deactivateAllModals(119);
        if (AnimationClip.field_d == null) {
          AnimationClip.field_d = new LoadingProgressDialog(RankingsRequest.field_l, CachedTextLayout.field_m);
        }
        RankingsRequest.field_l.pushModal(AnimationClip.field_d, false);
        if (param0 == -45) {
          return;
        }
        String var2 = (String) null;
        ConsoleLexer.tokenize(true, (String) null);
    }

    final static IntrusiveDeque tokenize(boolean param0, String param1) {
        IntrusiveDeque var2 = null;
        StringCursor var3 = null;
        int var4 = 0;
        int var5 = 0;
        IntrusiveDeque stackIn_3_0 = null;
        IntrusiveDeque stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Kickabout.field_G;
        try {
          var2 = new IntrusiveDeque();
          if (param0) {
            stackIn_3_0 = (IntrusiveDeque) null;
            return stackIn_3_0;
          }
          var3 = new StringCursor(param1);
          while (!var3.isAtEnd((byte) 62)) {
            var4 = var3.nextChar(-78);
            if (Character.isWhitespace((char) var4)) {
              continue;
            }
            if (34 != var4 &&
              var4 != 39) {
              if (40 == var4) {
                var2.addLast(new ConsoleExpression(ReflectionCheck.field_g, -1 + var3.field_c), 3);
                continue;
              }
              if (41 == var4) {
                var2.addLast(new ConsoleExpression(RasterBuffer.field_c, var3.field_c - 1), 3);
                continue;
              }
              if (var4 == 44) {
                var2.addLast(new ConsoleExpression(ColumnTableWidget.field_Gb, -1 + var3.field_c), 3);
                continue;
              }
              var2.addLast(ConsoleTokenParser.readBareToken(var3, false), 3);
              continue;
            }
            var2.addLast(RankingRowNode.readQuotedExpression(-9323, var3), 3);
          }
          stackIn_20_0 = var2;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("fj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_c = 0;
    }
}
