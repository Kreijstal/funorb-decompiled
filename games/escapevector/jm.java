/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jm extends UiComponent {
    static int field_L;
    private int field_z;
    private int field_C;
    private Sprite[] field_J;
    static String field_M;
    int field_B;
    private Sprite field_N;
    private int field_y;
    static Sprite[] field_K;
    private int field_A;
    static ResourceArchive field_I;
    private int field_H;
    boolean field_G;
    private Sprite field_D;
    private int field_F;
    private Sprite field_E;

    jm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    final static int[] j(int param0) {
        if (bk.field_r != null) {
          return bk.field_r.a(37);
        }
        if (param0 == -3282) {
          return null;
        }
        return (int[]) null;
    }

    final void a(int param0, int param1, int param2) {
        this.field_y = (16711422 & param1) >> 1;
        this.field_A = param0;
        this.field_H = param1;
        if (param2 >= -124) {
          this.field_E = (Sprite) null;
        }
        this.field_F = (16711422 & param0) >> 1;
        this.k(-27800);
    }

    private final Sprite e(byte param0) {
        int var9 = EscapeVector.obfuscationControl;
        int var2 = this.height >> 1;
        Sprite var3 = new Sprite(var2, this.height);
        eo.a(var3, (byte) -8);
        for (int var4 = 0; var4 < this.height; var4++) {
          for (int var5 = 0; var2 > var5; var5++) {
            double var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.height));
            int var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(var6 >= 1.0) ? (int)(var6 * 255.0) : 255;
            }
            SoftwareRasterizer.b(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        dl.a((byte) 127);
        if (param0 >= -112) {
          return (Sprite) null;
        }
        return var3;
    }

    public static void releaseStatics(byte guard) {
        field_I = null;
        field_M = null;
        if (guard != 127) {
          return;
        }
        field_K = null;
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        String stackIn_9_2 = null;
        try {
          if (this.field_G) {
            this.field_C = this.field_C + 1;
            if (this.field_C > 2 * this.field_z) {
              this.field_C = this.field_C - 2 * this.field_z;
            }
          }
          if (guard != -14472) {
            Sprite discarded$1 = this.e((byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("jm.Q(").append(guard).append(',').append(offsetY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, Sprite param2, int param3) {
        String stackIn_18_2 = null;
        int var7 = 0;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param0 > -23) {
            field_K = (Sprite[]) null;
          }
          int var5_int = this.width + param3;
          rd.a(var5_int - this.field_N.width, param3 + this.field_N.width, param1 + this.height, 19807, param1);
          for (int var6 = -this.field_C + param3; var6 < var5_int; var6 = var6 + param2.width) {
            param2.e(var6, param1);
          }
          dl.a((byte) -125);
          if (param3 + this.field_N.width >= SoftwareRasterizer.clipLeft) {
            eo.a(this.field_E, (byte) -35);
            param2.e(-this.field_C, 0);
            param2.e(-this.field_C + this.field_z * 2, 0);
            this.field_D.f(0, 0);
            dl.a((byte) 124);
            this.field_E.e(param3, param1);
          }
          if (SoftwareRasterizer.clipRight >= -this.field_N.width + var5_int) {
            eo.a(this.field_E, (byte) -29);
            for (var7 = this.field_C + (this.width - this.field_N.width); 2 * this.field_z < var7; var7 = var7 - this.field_z * 2) {
            }
            param2.e(-var7, 0);
            param2.e(2 * this.field_z - var7, 0);
            this.field_N.f(0, 0);
            dl.a((byte) -65);
            this.field_E.e(var5_int - this.field_N.width, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("jm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void k(int param0) {
        this.field_J = new Sprite[]{this.a(true, this.field_H, this.field_A), this.a(true, this.field_y, this.field_F)};
        this.field_N = this.e((byte) -122);
        this.field_D = this.field_N.copyMirroredHorizontally();
        if (param0 != -27800) {
          return;
        }
        this.field_E = new Sprite(this.height >> 1, this.height);
    }

    final static void a(int param0, PacketBuffer param1) {
        try {
          int var3_int = 0;
          String stackIn_19_2 = null;
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          int var5 = EscapeVector.obfuscationControl;
          try {
            byte[] var6 = new byte[24];
            byte[] var2 = var6;
            if (SavedDataWrite.field_h != null) {
              try {
                SavedDataWrite.field_h.a(0, 0L);
                SavedDataWrite.field_h.a((byte) 94, var6);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var6[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param1.writeBytes(24, (byte) 21, param0, var2);
                decompiledRegionSelector0 = false;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
                for (int var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = true;
              }
              if (!decompiledRegionSelector0) {
                return;
              }
            }
            param1.writeBytes(24, (byte) 21, param0, var2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_18_0 = var2_ref;
            StringBuilder stackIn_18_1 = new StringBuilder().append("jm.I(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void setBounds(int width, int y, int x, boolean guard, int height) {
        super.setBounds(width, y, x, guard, height);
        this.k(-27800);
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (layer != 0) {
          return;
        }
        int var5 = this.x + screenX;
        int var6 = screenY + this.y;
        this.a(-32, var6, this.field_J[0], var5);
        if (65536 > this.field_B) {
          rd.a(this.width + var5, var5 + (this.field_B * this.width >> 16), var6 + this.height, 19807, var6);
          this.a(-81, var6, this.field_J[1], var5);
          dl.a((byte) 119);
        }
        if (guard <= 85) {
          this.field_D = (Sprite) null;
        }
    }

    private final Sprite a(boolean param0, int param1, int param2) {
        int var13 = EscapeVector.obfuscationControl;
        Sprite var14 = new Sprite(2 * this.field_z, this.height);
        eo.a(var14, (byte) -90);
        int var5 = this.height >> 1;
        int var6 = 0;
        if (!param0) {
          this.field_B = 60;
        }
        while (var6 < this.height) {
          int var7 = (var6 >> 1) * (2 * this.field_z - 1) % (this.field_z * 2);
          int var8 = 16711935 & param1;
          int var9 = 65280 & param1;
          int var10 = -var5 + var6;
          int var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
          int var12 = var11 >= 256 ? var9 | var8 : (var11 * var8 & -16711936 | 16711680 & var11 * var9) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.field_z, var12);
          SoftwareRasterizer.drawHorizontalLine(var7 - this.field_z * 2, var6, this.field_z, var12);
          int var8Lifetime1 = param2 & 16711935;
          int var9Lifetime1 = 65280 & param2;
          int var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (-16711936 & var11 * var8Lifetime1 | 16711680 & var11 * var9Lifetime1) >>> 8;
          SoftwareRasterizer.drawHorizontalLine(this.field_z + var7, var6, this.field_z, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.field_z + var7, var6, this.field_z, var12Lifetime1);
          var6++;
        }
        dl.a((byte) 127);
        return var14;
    }

    final static byte[] a(int param0, int param1, CipherPacketBuffer param2, byte[] param3) {
        int var7 = 0;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var4_int = param2.readBits(param0, 8);
          if (0 == var4_int) {
            Object stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param3 == null ||
            var4_int != param3.length) {
            param3 = new byte[var4_int];
          }
          if (param1 <= 113) {
            field_I = (ResourceArchive) null;
          }
          int var5 = param2.readBits(3, 8);
          int var6 = (byte)param2.readBits(8, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (byte)(var6 + param2.readBits(var5, 8));
            }
          }
          byte[] stackIn_18_0 = (byte[]) (param3);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4;
          StringBuilder stackIn_21_1 = new StringBuilder().append("jm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private jm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_z = param4;
        this.field_A = param6;
        this.field_H = param5;
        this.field_F = param8;
        this.field_y = param7;
        this.setBounds(param2, param1, param0, true, param3);
    }

    static {
        field_M = "?";
        field_K = new Sprite[17];
    }
}
