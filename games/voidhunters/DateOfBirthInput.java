/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class DateOfBirthInput extends UiContainer implements ValidatableInput {
    static int fontUnderlineColor;
    static GraphicsToolkitSelector field_x;
    private DateOfBirthValidator validator;
    static String field_y;
    static String field_w;

    void setValidator(int param0, DateOfBirthValidator param1) {
        try {
          this.validator = param1;
          if (param0 <= 73) {
            this.getValidator(68);
          }
          this.validator.input = this;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vq.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    DateOfBirthInput(int param0, int param1, int param2, int param3, UiRenderer param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract boolean isIncomplete(int param0);

    abstract int getDayOfMonth(int param0);

    final static boolean writeBoolean(IsaacPacketBuffer param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        IsaacPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -28 / ((param1 - 0) / 33);
          stackIn_2_0 = (IsaacPacketBuffer) (param0);
          stackIn_2_1 = -632;
          if (param2) {
            stackIn_3_2 = 1;
          } else {
            stackIn_3_2 = 0;
          }
          ((IsaacPacketBuffer) (Object) stackIn_2_0).writeBits(stackIn_2_1, stackIn_3_2, 1);
          stackIn_4_0 = param2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vq.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final InputValidator getValidator(int param0) {
        if (param0 != -782444220) {
          this.getValidator(84);
          return (InputValidator) ((Object) this.validator);
        }
        return (InputValidator) ((Object) this.validator);
    }

    abstract int getYear(int param0);

    public static void clearSharedReferences(byte param0) {
        field_y = null;
        int var1 = -9 / ((35 - param0) / 62);
        field_w = null;
        field_x = null;
    }

    abstract int getMonthIndex(boolean param0);

    final static int pollArchiveConnection(int param0) {
        try {
          int stackIn_17_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_35_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (GetAutozoomAmountMultiply.field_o.errorCount >= 4) {
            if (GetAutozoomAmountMultiply.field_o.errorStatus == -1) {
              return 3;
            }
            if (GetAutozoomAmountMultiply.field_o.errorStatus == -2) {
              return 4;
            }
            return 1;
          }
          if (param0 != -6269) {
            return 121;
          }
          try {
            if (0 == gob.field_c) {
              SoftwareSprite2D.field_b = NormalMapTextureOperation.field_k.openSocket(SetDefaultFiringLeeway.field_p, TextHotspotRegion.field_l, param0 ^ -6201);
              gob.field_c = gob.field_c + 1;
            }
            if (1 == gob.field_c) {
              if (SoftwareSprite2D.field_b.status == 2) {
                stackIn_17_0 = SetReverbDry.a(-93, -1);
                return stackIn_17_0;
              }
              if (SoftwareSprite2D.field_b.status == 1) {
                gob.field_c = gob.field_c + 1;
              }
            }
            if (gob.field_c == 2) {
              TextureLineShape.field_h = new BufferedSocket((java.net.Socket) (SoftwareSprite2D.field_b.result), NormalMapTextureOperation.field_k);
              var2 = new PacketBuffer(13);
              SetVariableLabelActionFactory.a(SetPointDefenceLaserProjectileDamage.field_p, (byte) -48, GetFixedaim.field_o, var2, OpenGlToolkit.field_Ib);
              var2.writeByte(0, 15);
              var2.writeInt(ea.field_d, 332614536);
              TextureLineShape.field_h.write(0, var2.payload, 13, 0);
              gob.field_c = gob.field_c + 1;
              GetRepairModePower.field_r = 30000L + MonotonicMillisClock.currentTimeMillis(false);
            }
            if (gob.field_c == 3) {
              if (0 < TextureLineShape.field_h.available(param0 ^ -6269)) {
                var1_int = TextureLineShape.field_h.readByte(-123);
                if (var1_int != 0) {
                  stackIn_31_0 = SetReverbDry.a(-71, var1_int);
                  return stackIn_31_0;
                }
                gob.field_c = gob.field_c + 1;
              } else {
                if (GetRepairModePower.field_r < MonotonicMillisClock.currentTimeMillis(false)) {
                  stackIn_27_0 = SetReverbDry.a(-84, -2);
                  return stackIn_27_0;
                }
              }
            }
            if (gob.field_c != 4) {
              stackIn_37_0 = -1;
              return stackIn_37_0;
            }
            GetAutozoomAmountMultiply.field_o.setConnection(TextureLineShape.field_h, ToolkitFontMetrics.field_f, false);
            gob.field_c = 0;
            TextureLineShape.field_h = null;
            SoftwareSprite2D.field_b = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return SetReverbDry.a(param0 ^ 6182, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        fontUnderlineColor = -1;
        field_y = "Click or press F10 to open Quick Chat";
        field_w = "Playing";
    }
}
