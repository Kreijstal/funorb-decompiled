/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends OpenGlTexture implements GpuTexture2D {
    static fta field_m;
    static String field_k;
    private int field_l;
    private int field_n;

    final static String[] readStringList(PacketBuffer param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        IntrusiveDeque var6 = null;
        String[] stackIn_3_0 = null;
        PacketBuffer stackIn_6_0 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3_int = 0;
        String[] var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var6 = new IntrusiveDeque();
          if (param1 < 32) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          stackIn_6_0 = (PacketBuffer) (param0);
          while (stackIn_6_0.position < param0.payload.length) {
            var3_int = SoundEventPlayer.a(param0, -58, var6);
            if (!NetworkArchiveRequest.a(param0, QueuedHint.field_j, var3_int, true)) {
              stackIn_6_0 = (PacketBuffer) (param0);
              continue;
            }
            param0.position = param0.position + (QueuedHint.field_j.length - 1);
            break;
          }
          var3 = new String[var6.size((byte) -16)];
          for (var4 = 0; var3.length > var4; var4++) {
            var3[var4] = ((ConsoleHistoryEntry) (var6.removeFirst(-103))).field_h;
          }
          stackIn_13_0 = var3;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("pe.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    pe(HardwareOpenGlToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, 34037, param1, param2, param3 * param4, false);
        try {
          this.field_l = param3;
          this.field_n = param4;
          this.field_j.bindTexture(true, (GpuTexture) (this));
          jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.getGlFormat(78), param3, param4, 0, waa.toGlFormat(this.field_f, 1383), ClientException.glDataType(this.field_a, 5126), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, byte param6) {
        goa var7 = null;
        RuntimeException var7_ref = null;
        goa var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new goa(param4);
          var8 = new goa(param2);
          if (param6 != 53) {
            field_m = (fta) null;
          }
          stackIn_3_0 = PlayPhase.a(var8, param5, param0, param1, var7, param6 + 48, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("pe.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void setFilter(int param0, TextureFilter param1) {
        try {
          super.setFilter(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getWidth(int param0) {
        if (param0 != -7070) {
          this.setWrap((byte) -45, true, false);
          return this.field_l;
        }
        return this.field_l;
    }

    pe(HardwareOpenGlToolkit param0, TextureFormat param1, int param2, int param3, byte[] param4, int param5, int param6) {
        super(param0, 34037, param1, GpuDataType.field_g, param2 * param3, false);
        try {
          this.field_n = param3;
          this.field_l = param2;
          this.field_j.bindTexture(true, (GpuTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.getGlFormat(125), param2, param3, 0, waa.toGlFormat(this.field_f, 1383), 5121, param4, param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final float textureU(int param0, float param1) {
        if (param0 <= 60) {
          return -1.0163322687149048f;
        }
        return param1;
    }

    pe(HardwareOpenGlToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        super(param0, 34037, SwitchableId.field_a, GpuDataType.field_g, param1 * param2, false);
        try {
          this.field_l = param1;
          this.field_n = param2;
          this.field_j.bindTexture(true, (GpuTexture) (this));
          jaggl.OpenGL.glPixelStorei(3314, param5);
          jaggl.OpenGL.glTexImage2Di(this.field_i, 0, 6408, this.field_l, this.field_n, 0, 32993, this.field_j.field_od, param3, param4 * 4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final int getHeight(byte param0) {
        if (param0 > 0) {
          return -120;
        }
        return this.field_n;
    }

    public final void bind(byte param0) {
        if (param0 <= 32) {
          field_k = (String) null;
          super.bind((byte) 72);
          return;
        }
        super.bind((byte) 72);
    }

    public final void setWrap(byte param0, boolean param1, boolean param2) {
        if (param0 <= -60) {
          return;
        }
        this.a(96);
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_k = null;
        if (param0 == 0) {
          return;
        }
        field_m = (fta) null;
    }

    pe(HardwareOpenGlToolkit param0, TextureFormat param1, int param2, int param3, float[] param4, int param5, int param6) {
        super(param0, 34037, param1, GpuDataType.field_h, param2 * param3, false);
        try {
          this.field_n = param3;
          this.field_l = param2;
          this.field_j.bindTexture(true, (GpuTexture) (this));
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Df(this.field_i, 0, this.getGlFormat(75), param2, param3, 0, waa.toGlFormat(this.field_f, 1383), 5126, param4, 4 * param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
          field_m = (fta) null;
          return false;
        }
        return false;
    }

    public final float textureV(float param0, byte param1) {
        if (param1 != -33) {
          return 1.619486927986145f;
        }
        return param0;
    }

    static {
        field_k = "Enter name of player to add to list";
        field_m = new fta();
    }
}
