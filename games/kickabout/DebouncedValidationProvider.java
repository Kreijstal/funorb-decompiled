/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidationProvider implements ValidationSource {
    static Sprite field_a;
    static String field_c;
    private long field_b;

    abstract ValidationState evaluateValidationState(boolean param0);

    final static byte[] a(Object param0, boolean param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0 instanceof byte[]) {
            var3 = (byte[]) (param0);
            if (param1) {
              stackIn_9_0 = FullscreenFocusCanvas.a(70, var3);
              return stackIn_9_0;
            }
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (param0 instanceof ByteStorage) {
            var4 = (ByteStorage) (param0);
            stackIn_13_0 = var4.a(2);
            return stackIn_13_0;
          }
          if (param2 == 18828) {
            throw new IllegalArgumentException();
          }
          stackIn_16_0 = (byte[]) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("lg.W(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final String getValidationMessage(int param0) {
        if (this.isInputEmpty((byte) -28)) {
          return null;
        }
        if (param0 > -23) {
          field_c = (String) null;
          if (MonotonicClock.monotonicMillis(37) >= (350L + this.field_b)) {
            return this.evaluateValidationMessage(-1);
          }
          return null;
        }
        if (MonotonicClock.monotonicMillis(37) >= (350L + this.field_b)) {
          return this.evaluateValidationMessage(-1);
        }
        return null;
    }

    public final ValidationState getValidationState(int param0) {
        if (this.isInputEmpty((byte) -28)) {
          return Bzip2State.field_l;
        }
        if (MonotonicClock.monotonicMillis(-104) < 350L + this.field_b) {
          return IconButtonPainter.field_c;
        }
        if (param0 == -24407) {
          return this.evaluateValidationState(false);
        }
        field_a = (Sprite) null;
        return this.evaluateValidationState(false);
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != 350) {
          return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 79) {
            var3 = (Object) null;
            DebouncedValidationProvider.a((Object) null, true, -58);
          }
          if (param0 != null &&
            param0.length() >= IsaacRandom.field_c &&
            param0.length() <= MenuSelection.field_c) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("lg.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void validationChanged(int param0) {
        this.field_b = MonotonicClock.monotonicMillis(-122);
        int var2 = 76 % ((42 - param0) / 58);
    }

    final static AppScreen a(int param0, int param1) {
        if (param0 == -1) {
          return (AppScreen) ((Object) MachineTokenStorageSupport.field_e);
        }
        if (param0 == -2) {
          return (AppScreen) ((Object) SortCriterion.field_l);
        }
        if (param1 != 24939) {
          return (AppScreen) null;
        }
        if (param0 == -3) {
          return (AppScreen) ((Object) new BlackFadeScreen());
        }
        if (param0 == -5) {
          return (AppScreen) ((Object) new SplashScreen());
        }
        if (0 > param0) {
          throw new IllegalStateException();
        }
        return (AppScreen) ((Object) VertexNormal.getMenuScreen(-118, param0));
    }

    abstract String evaluateValidationMessage(int param0);

    static {
        field_c = "Records";
        field_a = new Sprite(926, 1374);
    }
}
