/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidator implements TextValidator {
    static int field_j;
    private long field_d;
    static Archive field_i;
    static String field_g;
    static byte[][] field_f;
    static int field_h;
    static int field_b;
    static String field_a;
    static int field_e;
    static String[][] field_c;

    final static boolean hasTuhstatbutCookie(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = TetraLink.field_J;
          try {
            if (LoadingStageHook.field_e) {
              return true;
            }
            if (param0 != -17840) {
              field_c = (String[][]) null;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (JavaScriptBridge.callJavaScript((byte) 122, "getcookies", param1));
              var4 = TextLayout.split(var3, ';', 783);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("d.M(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean hasOpenDialog(byte param0) {
        if (param0 <= 32) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          DebouncedValidator.hasTuhstatbutCookie(114, (java.applet.Applet) null);
          if (null == AccountServerResult.field_g) {
            return TextLayout.field_a ? true : false;
          }
          return true;
        }
        if (null != AccountServerResult.field_g) {
          return true;
        }
        if (!TextLayout.field_a) {
          return false;
        }
        return true;
    }

    public final ValidationState getValidationState(int param0) {
        if (this.isEmpty(13074)) {
          return DecodedSpriteBuffers.field_a;
        }
        if (param0 > -7) {
          return (ValidationState) null;
        }
        if (!(ClockAndTextHelpers.monotonicMillis(0) >= 350L + this.field_d)) {
          return FontAndBrightnessHelpers.field_b;
        }
        return this.computeState(false);
    }

    public final void restartDebounce(int param0) {
        this.field_d = ClockAndTextHelpers.monotonicMillis(0);
        if (param0 < 117) {
          DebouncedValidator.releaseStatics((byte) 100);
        }
    }

    public final String getValidationMessage(byte param0) {
        if (this.isEmpty(param0 + 13147)) {
          return null;
        }
        if (param0 != -73) {
          field_e = -50;
          if (350L + this.field_d <= ClockAndTextHelpers.monotonicMillis(0)) {
            return this.computeMessage(0);
          }
          return null;
        }
        if (350L + this.field_d <= ClockAndTextHelpers.monotonicMillis(0)) {
          return this.computeMessage(0);
        }
        return null;
    }

    public static void releaseStatics(byte param0) {
        field_c = (String[][]) null;
        if (param0 == 6) {
          field_i = null;
          field_a = null;
          field_g = null;
          field_f = (byte[][]) null;
          return;
        }
        DebouncedValidator.clearTemporaryRaster(112);
        field_i = null;
        field_a = null;
        field_g = null;
        field_f = (byte[][]) null;
    }

    abstract ValidationState computeState(boolean param0);

    final static void clearTemporaryRaster(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TetraLink.field_J;
        try {
          var5 = LoadingProgressDialog.field_bb;
          var1 = var5;
          if (param0 > -65) {
            field_g = (String) null;
          }
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "d.J(" + param0 + ')');
        }
    }

    abstract String computeMessage(int param0);

    static {
        field_g = "Asking to join <%0>'s game...";
        field_f = new byte[1000][];
        field_a = "Close";
        field_e = 0;
        field_c = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}};
    }
}
