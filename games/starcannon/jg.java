/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends InteractiveWidget {
    private int field_G;
    static int field_A;
    static String field_I;
    static int field_H;
    static ResourceArchive field_F;
    private FieldValidator field_D;
    static Sprite[] field_C;

    final String getTooltipText(int param0) {
        if (this.field_h) {
          return this.field_D.getValidationMessage(26162);
        }
        if (param0 != 12606) {
          this.field_D = (FieldValidator) null;
          return null;
        }
        return null;
    }

    final void a(int param0, int param1, UiWidget param2, int param3) {
        try {
          if (param0 < 27) {
            UiWidget var6 = (UiWidget) null;
            this.a(64, (UiWidget) null);
          }
          this.field_G = this.field_G + 1;
          super.a(40, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "jg.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        p var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = StarCannon.field_A;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        var5 = (this.field_i >> 1) + this.field_s + param1;
        var6 = this.field_j + (param3 + (this.field_f >> 1));
        var8 = this.field_D.getValidationStatus((byte) -126);
        if (cg.field_g == var8) {
          var16 = FrameTimer.field_g[0];
          var9 = var16.field_x << 1;
          var10 = var16.field_q << 1;
          if (EditableTextField.field_H == null) {
            EditableTextField.field_H = new Sprite(var9, var10);
            bc.a(EditableTextField.field_H, 26095);
          } else {
            if (EditableTextField.field_H.field_u < var9) {
              EditableTextField.field_H = new Sprite(var9, var10);
              bc.a(EditableTextField.field_H, 26095);
            } else {
              if (EditableTextField.field_H.field_v >= var10) {
                bc.a(EditableTextField.field_H, 26095);
                SoftwareRasterizer.clearRaster();
              } else {
                EditableTextField.field_H = new Sprite(var9, var10);
                bc.a(EditableTextField.field_H, 26095);
              }
            }
          }
          var16.drawRotatedAboutBilinear(112, 144, var16.field_x << 4, var16.field_q << 4, -this.field_G << 10, 4096);
          wf.a(-120);
          EditableTextField.field_H.drawAdditive(var5 - var16.field_x, -var16.field_q + var6, 256);
          return;
        }
        if (var8 != cd.field_a) {
          if (var8 == BufferedSocket.field_n) {
            var14 = FrameTimer.field_g[2];
            var14.drawAdditive(var5 - (var14.field_u >> 1), var6 - (var14.field_v >> 1), 256);
            return;
          }
          if (var8 != bf.field_x) {
            return;
          }
          var13 = FrameTimer.field_g[1];
          var13.drawAdditive(-(var13.field_u >> 1) + var5, -(var13.field_v >> 1) + var6, 256);
          return;
        }
        var15 = FrameTimer.field_g[0];
        var9Lifetime1 = var15.field_x << 1;
        var10Lifetime1 = var15.field_q << 1;
        if (EditableTextField.field_H == null) {
          EditableTextField.field_H = new Sprite(var9Lifetime1, var10Lifetime1);
          bc.a(EditableTextField.field_H, 26095);
        } else {
          if (EditableTextField.field_H.field_u < var9Lifetime1) {
            EditableTextField.field_H = new Sprite(var9Lifetime1, var10Lifetime1);
            bc.a(EditableTextField.field_H, 26095);
          } else {
            if (EditableTextField.field_H.field_v >= var10Lifetime1) {
              bc.a(EditableTextField.field_H, 26095);
              SoftwareRasterizer.clearRaster();
            } else {
              EditableTextField.field_H = new Sprite(var9Lifetime1, var10Lifetime1);
              bc.a(EditableTextField.field_H, 26095);
            }
          }
        }
        var15.drawRotatedAboutBilinear(112, 144, var15.field_x << 4, var15.field_q << 4, -this.field_G << 10, 4096);
        wf.a(-120);
        EditableTextField.field_H.drawAdditive(var5 - var15.field_x, -var15.field_q + var6, 256);
    }

    final boolean a(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_A = -109;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jg.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_I = null;
        field_C = null;
        if (param0 != 934716193) {
          jg.clearStaticReferences((byte) -6);
          field_F = null;
          return;
        }
        field_F = null;
    }

    final static void clearStaticReferences(byte param0) {
        if (param0 < 99) {
          field_F = (ResourceArchive) null;
        }
    }

    jg(FieldValidator param0) {
        try {
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = new Sprite[10];
        field_I = "Revenge fleet destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
