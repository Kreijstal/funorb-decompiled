/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConstantColorTextureOperation extends TextureOperation {
    static Widget field_k;
    static int argumentSeparatorTokenType;
    private int blue;
    private int green;
    private int red;

    public ConstantColorTextureOperation() {
        this(0);
    }

    private final void setColor(int param0, int param1) {
        this.blue = (255 & param0) << 4;
        this.green = param0 >> 4 & 4080;
        int var3 = -58 % ((param1 + 77) / 41);
        this.red = (16711680 & param0) >> 12;
    }

    final int[][] getColorRow(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        int[][] var9 = this.field_d.getRow(param1, (byte) -98);
        int[][] var3 = var9;
        if (this.field_d.field_g) {
          var4 = var9[0];
          var5 = var9[1];
          var6 = var9[2];
          for (var7 = 0; var7 < TextHotspotRegion.textureWidth; var7++) {
            var4[var7] = this.red;
            var5[var7] = this.green;
            var6[var7] = this.blue;
          }
        }
        if (param0 != 255) {
          return (int[][]) null;
        }
        return var3;
    }

    private ConstantColorTextureOperation(int param0) {
        super(0, false);
        this.setColor(param0, -121);
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 > -60) {
            return;
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.setColor(param2.readUnsignedMedium((byte) -94), -123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jwa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String normalizeName(boolean param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        String stackIn_6_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (MouseWheelInput.isNameSeparator(param1.charAt(var2_int), 120)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (MouseWheelInput.isNameSeparator(param1.charAt(var3 - 1), 116)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            stackIn_19_0 = null;
            return (String) (stackIn_19_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (GetAngularVelocitySustainMax.isNormalizableNameCharacter((byte) -128, (char) var7)) {
              var8 = GetThrusterBoosterForce.normalizeNameCharacter((char) var7, 102);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("jwa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_k = null;
        if (param0 > -76) {
          ConstantColorTextureOperation.clearSharedReferences(-39);
        }
    }

    static {
        argumentSeparatorTokenType = 2;
    }
}
