/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements WidgetPainter {
    static ShipHullGeometry field_b;
    static SystemTaskService field_a;
    static Sprite[] field_c;
    static java.security.SecureRandom field_d;
    static String[] field_e;

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        String stackIn_11_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var4_int = -1;
          if (param1 > -37) {
            ae.a(45L, (byte) -21);
          }
          for (int var5 = param3; var5 < param2; var5++) {
            var4_int = al.field_a[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          int stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ae.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(long param0, byte param1) {
        try {
          if (param1 != 118) {
            return;
          }
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            InterruptedException var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0) {
        FullscreenFocusCanvas.field_e.a((byte) 12);
        if (param0 != -1021831775) {
          field_b = (ShipHullGeometry) null;
        }
        if (!SelfDestructEffects.field_j.d(-3994)) {
          return un.f(param0 + 1021831755);
        }
        return 0;
    }

    final static IndexedSprite[] a(String param0, String param1, byte param2, ResourceArchive param3) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          if (param2 >= -45) {
            IndexedSprite[] stackIn_2_0 = (IndexedSprite[]) null;
            return stackIn_2_0;
          }
          int var4_int = param3.findGroupId(-1, param0);
          int var5 = param3.findFileId(var4_int, param1, true);
          IndexedSprite[] stackIn_4_0 = TextHotspotRegion.a(var5, 255, param3, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ae.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (guard != 1) {
          ae.releaseStatics(-128);
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        String stackIn_11_2 = null;
        try {
          if (guard > -14) {
            UiComponent var9 = (UiComponent) null;
            this.drawWidget(-95, 88, 12, (UiComponent) null, false);
          }
          int var6_int = originX + component.x;
          int var7 = originY + component.y;
          ReflectionCheck.drawGradientOutline(-27951, var6_int, var7, component.width, component.height);
          Sprite var8 = EditableTextWidget.field_E[1];
          if (component instanceof TextButton &&
            ((TextButton) (component)).field_z) {
            var8.c((-var8.fullWidth + component.width >> 1) + 1 + var6_int, var7 - (-1 - (component.height - var8.fullHeight >> 1)), 256);
          }
          if (component.isFocused(0)) {
            SeekerMine.a(false, component.width - 4, 2 + var6_int, -4 + component.height, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var6;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ae.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(enabled).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = new Sprite[30];
        field_b = new ShipHullGeometry();
        field_e = new String[]{"Congratulations on your success so far.<delay><br><br>We have just received intelligence on two types of alien defence.", "These blue cylinders will repel your ship.", "These green pods will shoot energy balls at any unidentified ship within range of their sensors."};
    }
}
