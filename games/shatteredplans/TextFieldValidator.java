/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidator implements TextFieldListener {
    static String field_k;
    static int field_j;
    static String field_m;
    static AnimatedPanel field_l;
    private TextFieldWidget field_i;

    public final boolean isEmpty(int param0) {
        if (param0 != 16647) {
          field_l = (AnimatedPanel) null;
          if (null != this.field_i.field_s) {
            return this.field_i.field_s.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_i.field_s) {
          return true;
        }
        if (this.field_i.field_s.length() != 0) {
          return false;
        }
        return true;
    }

    final ValidationState computeState(boolean param0) {
        if (!param0) {
          return this.computeStateFor(-11196, this.field_i.field_s);
        }
        field_m = (String) null;
        return this.computeStateFor(-11196, this.field_i.field_s);
    }

    abstract ValidationState computeStateFor(int param0, String param1);

    abstract String computeMessageFor(boolean param0, String param1);

    final static void a(int param0, int param1, int param2, int param3, Sprite param4, int param5, int param6) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var10Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param5 = param5 - param4.field_t;
          param2 = param2 - param4.field_x;
          if (param6 != 16403) {
            field_k = (String) null;
          }
          var7_int = param5 + param4.field_z * param2;
          var8 = param3 + param0 * SoftwareRasterizer.field_b;
          while (true) {
            param1--;
            if (param1 < 0) {
              return;
            }
            incrementValue$4 = var7_int;
            var7_int++;
            var9 = param4.field_B[incrementValue$4];
            var10 = SoftwareRasterizer.field_h[var8];
            var11 = var9 + var10;
            var9 = (var9 & 16711935) + (var10 & 16711935);
            var10Lifetime1 = (var9 & 16777472) + (-var9 + var11 & 65536);
            incrementValue$5 = var8;
            var8++;
            SoftwareRasterizer.field_h[incrementValue$5] = PrivateChatMessage.intOr(-(var10Lifetime1 >>> 8) + var10Lifetime1, var11 - var10Lifetime1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("ml.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void onEnter(int param0, TextFieldWidget param1) {
        try {
          if (param0 != 4340) {
            TextFieldWidget var4 = (TextFieldWidget) null;
            this.onEnter(27, (TextFieldWidget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ml.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(TextFieldWidget param0, int param1) {
        try {
          this.notifyChanged(-85);
          if (param1 != 95) {
            this.computeMessage((byte) -44);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ml.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        BirthDateConfirmationForm var2 = null;
        BirthDateConfirmationForm var2Lifetime1;
        if (param0 < 96) {
          field_l = (AnimatedPanel) null;
          tg.field_c.drawFullRaster(param1, -43);
          var2 = wi.field_c;
          if (var2 != null) {
            var2.draw(tg.field_c.field_N, tg.field_c.field_B, (byte) -66);
            return;
          }
          return;
        }
        tg.field_c.drawFullRaster(param1, -43);
        var2Lifetime1 = wi.field_c;
        if (var2Lifetime1 == null) {
          return;
        }
        var2Lifetime1.draw(tg.field_c.field_N, tg.field_c.field_B, (byte) -66);
    }

    public static void clearStatics(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 != -65) {
          return;
        }
        field_k = null;
    }

    final String computeMessage(byte param0) {
        if (param0 > 61) {
          return this.computeMessageFor(false, this.field_i.field_s);
        }
        field_k = (String) null;
        return this.computeMessageFor(false, this.field_i.field_s);
    }

    TextFieldValidator(TextFieldWidget param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = 4;
        field_k = "Select a system to anchor the other end of the Tannhäuser wormhole, or right click to cancel this project.";
        field_m = "Report <%0> for abuse";
    }
}
