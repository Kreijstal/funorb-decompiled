/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIndicator extends TextButton {
    static PcmSample field_N;
    private static int[] field_K;
    static int[][] field_E;
    private static int[] field_P;
    private static int[] field_O;
    private ValidationSource field_F;
    static int field_M;
    private static int[] field_I;
    private int field_R;
    static int field_G;
    static Sprite field_Q;
    static PacketBuffer field_L;

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          this.field_R = this.field_R + 1;
          super.updateHover(guard, offsetY, offsetX, root);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oj.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_K = null;
        field_N = null;
        field_O = null;
        field_Q = null;
        field_E = (int[][]) null;
        field_P = null;
        field_I = null;
        if (guard == 113) {
          field_L = null;
          return;
        }
        field_N = (PcmSample) null;
        field_L = null;
    }

    final boolean focusNext(int guard, UiComponent root) {
        String stackIn_7_2 = null;
        try {
          if (guard == -4659) {
            return false;
          }
          field_P = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oj.M(").append(guard).append(',');
          if (root == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        int var11 = EscapeVector.obfuscationControl;
        super.drawLayer(screenY, (byte) 101, layer, screenX);
        if (guard >= 85) {
          if (layer != 0) {
            return;
          }
          int var5 = this.x + screenX + (this.width >> 1);
          int var6 = this.y + screenY + (this.height >> 1);
          ValidationState var8 = this.field_F.validationState(17124);
          if (var8 != of.field_f &&
            ug.field_c != var8) {
            if (ArchiveProvider.field_a == var8) {
              Sprite var24 = EditableTextWidget.field_E[2];
              var24.c(var5 - (var24.width >> 1), var6 - (var24.height >> 1), 256);
              return;
            }
            if (IsaacRandom.field_h != var8) {
              return;
            }
            Sprite var23 = EditableTextWidget.field_E[1];
            var23.c(-(var23.width >> 1) + var5, var6 - (var23.height >> 1), 256);
            return;
          }
          Sprite var25 = EditableTextWidget.field_E[0];
          int var9 = var25.fullWidth << 1;
          int var10 = var25.fullHeight << 1;
          if (RockBuster.field_j == null) {
            RockBuster.field_j = new Sprite(var9, var10);
            eo.a(RockBuster.field_j, (byte) -111);
          } else if (RockBuster.field_j.width < var9) {
            RockBuster.field_j = new Sprite(var9, var10);
            eo.a(RockBuster.field_j, (byte) -111);
          } else if (var10 <= RockBuster.field_j.height) {
            eo.a(RockBuster.field_j, (byte) -79);
            SoftwareRasterizer.clearFramebuffer();
          } else {
            RockBuster.field_j = new Sprite(var9, var10);
            eo.a(RockBuster.field_j, (byte) -111);
          }
          var25.b(112, 144, var25.fullWidth << 4, var25.fullHeight << 4, -this.field_R << 10, 4096);
          dl.a((byte) 116);
          RockBuster.field_j.c(var5 - var25.fullWidth, -var25.fullHeight + var6, 256);
          return;
        }
        field_I = (int[]) null;
        if (layer != 0) {
          return;
        }
        int var5Lifetime1 = this.x + screenX + (this.width >> 1);
        int var6Lifetime1 = this.y + screenY + (this.height >> 1);
        ValidationState var8Lifetime1 = this.field_F.validationState(17124);
        if (var8Lifetime1 == of.field_f) {
          Sprite var15 = EditableTextWidget.field_E[0];
          int var9Lifetime1 = var15.fullWidth << 1;
          int var10Lifetime1 = var15.fullHeight << 1;
          if (RockBuster.field_j != null &&
            RockBuster.field_j.width >= var9Lifetime1 &&
            var10Lifetime1 <= RockBuster.field_j.height) {
            eo.a(RockBuster.field_j, (byte) -79);
            SoftwareRasterizer.clearFramebuffer();
          } else {
            RockBuster.field_j = new Sprite(var9Lifetime1, var10Lifetime1);
            eo.a(RockBuster.field_j, (byte) -111);
          }
          var15.b(112, 144, var15.fullWidth << 4, var15.fullHeight << 4, -this.field_R << 10, 4096);
          dl.a((byte) 116);
          RockBuster.field_j.c(var5Lifetime1 - var15.fullWidth, -var15.fullHeight + var6Lifetime1, 256);
          return;
        }
        if (ug.field_c != var8Lifetime1) {
          if (ArchiveProvider.field_a == var8Lifetime1) {
            Sprite var18 = EditableTextWidget.field_E[2];
            var18.c(var5Lifetime1 - (var18.width >> 1), var6Lifetime1 - (var18.height >> 1), 256);
            return;
          }
          if (IsaacRandom.field_h != var8Lifetime1) {
            return;
          }
          Sprite var17 = EditableTextWidget.field_E[1];
          var17.c(-(var17.width >> 1) + var5Lifetime1, var6Lifetime1 - (var17.height >> 1), 256);
          return;
        }
        Sprite var16 = EditableTextWidget.field_E[0];
        Sprite var14 = var16;
        int var9Lifetime2 = var16.fullWidth << 1;
        int var10Lifetime2 = var16.fullHeight << 1;
        if (RockBuster.field_j != null &&
          RockBuster.field_j.width >= var9Lifetime2 &&
          var10Lifetime2 <= RockBuster.field_j.height) {
          eo.a(RockBuster.field_j, (byte) -79);
          SoftwareRasterizer.clearFramebuffer();
        } else {
          RockBuster.field_j = new Sprite(var9Lifetime2, var10Lifetime2);
          eo.a(RockBuster.field_j, (byte) -111);
        }
        var16.b(112, 144, var16.fullWidth << 4, var16.fullHeight << 4, -this.field_R << 10, 4096);
        dl.a((byte) 116);
        RockBuster.field_j.c(var5Lifetime1 - var16.fullWidth, -var16.fullHeight + var6Lifetime1, 256);
    }

    final static void a(int param0, int param1, byte param2, String param3) {
        try {
          fh.field_g.a(param3, param1 - 1, -1 + param0, 0, -1, 64);
          fh.field_g.a(param3, param1 + 1, -1 + param0, 0, -1, 64);
          fh.field_g.a(param3, -1 + param1, param0 + 1, 0, -1, 64);
          fh.field_g.a(param3, 1 + param1, param0 + 1, 0, -1, 64);
          fh.field_g.b(param3, param1, param0, 16777215, -1);
          int var4_int = -103 / ((param2 - 7) / 46);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] k(int param0) {
        if (param0 != 64) {
          return (int[]) null;
        }
        if (null != bk.field_r) {
          return bk.field_r.d(param0 + 31240);
        }
        return null;
    }

    final static void a(byte param0) {
        if (!mj.a((byte) 93)) {
          return;
        }
        sn.a(4, 0, false);
        if (param0 < 79) {
          field_Q = (Sprite) null;
        }
    }

    final String getTooltip(int guard) {
        if (guard != 1) {
          return (String) null;
        }
        if (!this.hovered) {
          return null;
        }
        return this.field_F.validationMessage(guard ^ 64);
    }

    ValidationIndicator(ValidationSource param0) {
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new int[]{4, 4, 4, 4};
        field_O = new int[]{1, 4, 4, 4, 4};
        field_M = -1;
        field_P = field_O;
        field_I = new int[]{1, 4, 4, 4, 4};
        field_E = new int[][]{field_O, field_P, field_I, field_K};
    }
}
