/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ObjectSpriteSet {
    static PcmSample field_c;
    static PcmStreamMixer field_e;
    private Sprite[] field_a;
    private Sprite[] field_f;
    private SpriteOffset[] field_g;
    static TrackerMusicDefinition[] field_d;
    static boolean field_b;

    private final Sprite a(byte param0, int param1, Sprite param2, Sprite param3, Sprite param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var6_int = (param3.fullWidth - param2.fullWidth) / 2;
          int var7 = (-param2.fullHeight + param3.fullHeight) / 2;
          SpriteOffset var12 = new SpriteOffset(var6_int, var7);
          var6_int = -param2.fullWidth + (param3.fullWidth - var6_int);
          var7 = -param2.fullHeight + (param3.fullHeight - var7);
          SpriteOffset var9 = new SpriteOffset(var6_int, var7);
          SpriteOffset var13 = rc.a(param1, (byte) 120, var9, var12);
          SpriteOffset var10 = this.a(param1, param2.fullHeight, -29295, param2.fullWidth);
          if (param0 <= 21) {
            ObjectSpriteSet.releaseStatics(104);
          }
          Sprite var11 = new Sprite(var10.x, var10.y);
          SoftwareRasterizer.saveClip(oi.field_M);
          var11.bindAsFramebuffer();
          param4.drawTransparent(-var13.x, -var13.y);
          md.field_D.a(124);
          SoftwareRasterizer.restoreClip(oi.field_M);
          Sprite stackIn_3_0 = var11;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("rk.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final SpriteOffset a(int param0, int param1, int param2, int param3) {
        int var5 = param3;
        int var6 = param1;
        if (param0 == 16384) {
          var6 = param3;
          var5 = param1;
        }
        if (param0 == 32768) {
          var6 = param1;
          var5 = param3;
        }
        if (param0 == 49152) {
          var6 = param3;
          var5 = param1;
        }
        if (param2 == -29295) {
          return new SpriteOffset(var5, var6);
        }
        this.field_g = (SpriteOffset[]) null;
        return new SpriteOffset(var5, var6);
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (guard < 120) {
          ObjectSpriteSet.releaseStatics(53);
        }
    }

    final Sprite a(int param0, int param1) {
        if (param1 == 0) {
          return this.field_f[0];
        }
        if (param1 == 16384) {
          return this.field_f[1];
        }
        if (param0 > -63) {
          ObjectSpriteSet.a(26, -60, 78);
          if (param1 == 32768) {
            return this.field_f[2];
          }
          if (param1 == 49152) {
            return this.field_f[3];
          }
          return null;
        }
        if (param1 == 32768) {
          return this.field_f[2];
        }
        if (param1 == 49152) {
          return this.field_f[3];
        }
        return null;
    }

    private final SpriteOffset a(Sprite param0, int param1, Sprite param2, SpriteOffset param3) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        try {
          int var5_int = param2.fullWidth;
          int var6 = param2.fullHeight;
          if (param1 != -1) {
            Sprite var10 = (Sprite) null;
            Sprite discarded$0 = this.a((Sprite) null, 124, 55);
          }
          int var7 = param3.x;
          int var8 = param3.y;
          if (param0 != null) {
            if (param3.x < 0) {
              var5_int = var5_int - param3.x;
            }
            if (param3.y < 0) {
              var6 = var6 - param3.y;
            }
            var7 = var5_int - param0.fullWidth;
            var8 = -param0.fullHeight + var6;
            if (param3.x >= 0) {
              var7 = var7 - param3.x;
            }
            if (param3.y >= 0) {
              var8 = var8 - param3.y;
            }
          }
          SpriteOffset var9 = new SpriteOffset(var7, var8);
          SpriteOffset stackIn_15_0 = var9;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("rk.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final SpriteOffset a(byte param0, int param1) {
        if (param1 == 0) {
          return this.field_g[0];
        }
        if (16384 == param1) {
          return this.field_g[1];
        }
        if (param1 == 32768) {
          return this.field_g[2];
        }
        int var3 = 6 % ((-71 - param0) / 35);
        if (param1 == 49152) {
          return this.field_g[3];
        }
        return null;
    }

    private final Sprite a(Sprite param0, int param1) {
        String stackIn_8_2 = null;
        try {
          int var3_int = param0.fullWidth;
          if (param0.fullHeight > var3_int) {
            var3_int = param0.fullHeight;
          }
          Sprite var4 = new Sprite(var3_int, var3_int);
          int var5 = (var3_int - param0.fullWidth) / 2;
          int var6 = (-param0.fullHeight + var3_int) / param1;
          SoftwareRasterizer.saveClip(oi.field_M);
          var4.bindAsFramebuffer();
          param0.drawTransparent(var5, var6);
          md.field_D.a(param1 ^ 126);
          SoftwareRasterizer.restoreClip(oi.field_M);
          Sprite stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("rk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final Sprite a(boolean param0, int param1) {
        if (param0) {
          field_e = (PcmStreamMixer) null;
          if (0 == param1) {
            return this.field_a[0];
          }
          if (param1 == 16384) {
            return this.field_a[1];
          }
          if (param1 == 32768) {
            return this.field_a[2];
          }
          if (49152 == param1) {
            return this.field_a[3];
          }
          return null;
        }
        if (0 == param1) {
          return this.field_a[0];
        }
        if (param1 == 16384) {
          return this.field_a[1];
        }
        if (param1 == 32768) {
          return this.field_a[2];
        }
        if (49152 == param1) {
          return this.field_a[3];
        }
        return null;
    }

    ObjectSpriteSet(Sprite param0, Sprite param1, SpriteOffset param2) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          this.field_a = new Sprite[DialWidgetPainter.field_h.length];
          this.field_f = new Sprite[DialWidgetPainter.field_h.length];
          this.field_g = new SpriteOffset[DialWidgetPainter.field_h.length];
          for (int var4_int = 0; this.field_a.length > var4_int; var4_int++) {
            int var5 = DialWidgetPainter.field_h[var4_int];
            this.field_a[var4_int] = this.a(param0, -67, var5);
            this.field_f[var4_int] = this.a(param1, -53, var5);
            SpriteOffset var6 = this.a(param1, -1, param0, param2);
            this.field_g[var4_int] = rc.a(var5, (byte) 124, var6, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("rk.<init>(");
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
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 11710) {
          return;
        }
        ClientException.field_e = param1;
        ng.field_nb = param0;
    }

    private final Sprite a(Sprite param0, int param1, int param2) {
        String stackIn_11_2 = null;
        try {
          if (param0 == null) {
            return null;
          }
          int var4_int = 4096;
          Sprite var5 = this.a(param0, 2);
          if (param1 > -37) {
            Sprite stackIn_5_0 = (Sprite) null;
            return stackIn_5_0;
          }
          int var6 = var5.fullWidth;
          int var7 = var5.fullHeight;
          int var8 = var6 / 2;
          int var9 = var7 / 2;
          Sprite var10 = new Sprite(var6, var7);
          SoftwareRasterizer.saveClip(oi.field_M);
          var10.bindAsFramebuffer();
          var5.drawCenteredRotatedScaled(var8, (byte) 34, var4_int, param2, var9);
          md.field_D.a(124);
          SoftwareRasterizer.restoreClip(oi.field_M);
          Sprite var11 = this.a((byte) 100, param2, param0, var5, var10);
          Sprite stackIn_7_0 = var11;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4;
          StringBuilder stackIn_10_1 = new StringBuilder().append("rk.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
