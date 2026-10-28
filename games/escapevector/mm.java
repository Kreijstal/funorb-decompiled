/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static PcmSampleStream field_b;
    static String field_c;
    static String field_a;

    final static boolean a(int param0) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (mj.field_d == 0) {
            StringNode.playFrameAppearSound(8192, (byte) 51);
          }
          boolean var1_int = false;
          IntValueNode.field_j = true;
          if (param0 > -13) {
            field_a = (String) null;
          }
          if (0 == mj.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * IterableNodeHashTable.field_c / 64, 8192);
          }
          if (10 == mj.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, IterableNodeHashTable.field_c * 6144 / 64, 8192);
          }
          if (mj.field_d < 1000) {
            mj.field_d = mj.field_d + 1;
          }
          do {
            if (!AccountRequestDialog.pollKeyEvent(-126)) {
              di.field_d.updatePointer(TransitionPoint.hitLoginOrDiscardPrompt(sf.field_c, LoginDialog.field_ob, 8158), (byte) 126, TransitionPoint.hitLoginOrDiscardPrompt(GzipDecoder.field_d, UiContainer.field_y, 8158));
              if (!SpriteOffset.a(true, 0)) {
                return (var1_int);
              }
              var1_int = true;
              boolean stackIn_21_0 = var1_int;
              return (stackIn_21_0);
            }
            di.field_d.handleKeyEvent((byte) 6);
          } while (!SpriteOffset.a(false, 0));
          var1_int = true;
          boolean stackIn_17_0 = var1_int;
          return (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "mm.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        StatefulTextPainter.field_x = param2;
        int var5 = -76 % ((-35 - param0) / 47);
        ok.field_a = param4;
        SpriteFactorySupport.field_b = param1;
        StrongCacheEntry.field_t = param3;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 64) {
          field_b = (PcmSampleStream) null;
          return AccountPanelInputSupport.serviceAccountPanelInput(param0 + 6381);
        }
        return AccountPanelInputSupport.serviceAccountPanelInput(param0 + 6381);
    }

    final static boolean a(int param0, int param1) {
        int var3 = EscapeVector.obfuscationControl;
        if (param0 != 4) {
          return false;
        }
        if (WeightedLruCache.field_c[param1]) {
          return true;
        }
        ResourceArchive var4 = IndexedSpriteState.field_j;
        if (5 == param1) {
          AchievementTracker.loadTutorialSprites(var4, 5);
          SpriteOffset.a((byte) 53);
          return true;
        }
        if (param1 != 4) {
          if (var4.tryLoadNamedGroup(param0 - 4, da.field_d[param1])) {
            EmailValidationError.field_a[param1] = fe.a(da.field_d[param1], var4, "texture", true);
            PcmResampler.field_a[param1] = fe.a(da.field_d[param1], var4, "frosting", true);
            PcmResampler.field_a[param1].expandToFullSize();
            DelayedServerPacket.loadSkyLayers(var4, param1, false);
            WeightedLruCache.field_c[param1] = true;
            SpriteOffset.a((byte) 53);
            return true;
          }
          return false;
        }
        if (se.field_b != null) {
          ChatMessageDecoder.field_b[param1] = se.field_b.field_g;
          pf.field_g[param1] = se.field_b.field_d;
          WeightedLruCache.field_c[param1] = true;
          SpriteOffset.a((byte) 53);
          return true;
        }
        SpriteOffset.a((byte) 53);
        return true;
    }

    final static String a(int param0, CharSequence param1) {
        String stackIn_23_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          char[] var8 = new char[var2_int];
          char[] var7 = var8;
          char[] var3 = var7;
          for (int var4 = param0; var2_int > var4; var4++) {
            int var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(-65 + var5 + 97);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          String stackIn_19_0 = new String(var8);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var2;
          StringBuilder stackIn_22_1 = new StringBuilder().append("mm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        int var1 = -15 % ((guard + 35) / 55);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "Logging in...";
        field_c = "Create your own free Jagex account";
    }
}
