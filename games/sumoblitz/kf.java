/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends DualLinkNode implements ft {
    int field_x;
    static Drone field_u;
    static ResourceArchive field_v;
    int field_s;
    private int field_y;
    private int field_D;
    private LegacyOpenGlGraphicsToolkit field_C;
    private int field_z;
    static int field_B;
    int field_A;
    private int field_r;
    static SpriteData[] field_w;
    static String achievementsText;

    final void a(boolean param0, int param1, int param2) {
        if (!param0) {
          jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, this.field_y);
          this.field_z = param2;
          this.field_r = param1;
          return;
        }
        this.field_z = 37;
        jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, this.field_y);
        this.field_z = param2;
        this.field_r = param1;
    }

    final void g(int param0) {
        if (param0 > -124) {
          CharSequence var3 = (CharSequence) null;
          kf.a((CharSequence) null, (byte) -99);
          if (this.field_y > 0) {
            this.field_C.b(this.field_y, 97, this.field_s);
            this.field_y = 0;
            return;
          }
          return;
        }
        if (this.field_y <= 0) {
          return;
        }
        this.field_C.b(this.field_y, 97, this.field_s);
        this.field_y = 0;
    }

    final static String f(int param0) {
        if (param0 != 1) {
          return (String) null;
        }
        if (null == qv.field_o) {
          return "";
        }
        return qv.field_o;
    }

    final static void a(byte param0) {
        int var3 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        PacketBuffer var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6 = new PacketBuffer(Drone.field_g);
          var2 = var6.readUnsignedByte(-31302);
          if (var2 < 1) {
            return;
          }
          bl.field_e = var6.readUnsignedByte(-31302);
          ResourceArchive.field_f = var6.readUnsignedByte(-31302);
          LegacyOpenGlEffectManager.field_i = var6.readUnsignedByte(-31302);
          hc.field_f = var6.readUnsignedByte(-31302);
          if (param0 <= 92) {
            return;
          }
          for (var3 = 0; 36 > var3; var3++) {
            if (25 > var3) {
              go.field_j[var3] = var6.readUnsignedMedium((byte) 122);
              CacheIoRequest.field_z[var3] = var6.readUnsignedShort(255);
              if (var2 >= 2) {
                var4 = var6.readUnsignedByte(-31302);
                CacheIoRequest.field_A[var3] = -1 + eb.a(4, var4);
                if (var2 >= 3) {
                  stackIn_16_0 = up.field_g;
                  stackIn_16_1 = var3;
                  stackIn_17_2 = (eb.a(1, var4 >> 6) == 1);
                  stackIn_16_0[stackIn_16_1] = stackIn_17_2;
                  stackIn_19_0 = qn.field_d;
                  stackIn_19_1 = var3;
                  stackIn_20_2 = (eb.a(1, var4 >> 7) == 1);
                  stackIn_19_0[stackIn_19_1] = stackIn_20_2;
                }
              }
              if (go.field_j[var3] != 0) {
                wm.field_f[var3] = true;
                bl.field_e = var3;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kf.F(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(this.field_z, this.field_r, 36161, 0);
        int var2 = -8 % ((44 - param0) / 58);
        this.field_z = -1;
        this.field_r = -1;
    }

    protected final void finalize() throws Throwable {
        this.g(-125);
        super.finalize();
    }

    public static void releaseStatics(int param0) {
        if (param0 == -21057) {
          field_w = null;
          field_v = null;
          field_u = null;
          achievementsText = null;
          return;
        }
        field_w = (SpriteData[]) null;
        field_w = null;
        field_v = null;
        field_u = null;
        achievementsText = null;
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 38) {
            var3 = (CharSequence) null;
            kf.a((CharSequence) null, (byte) -40);
          }
          var2 = MusicPatch.a(-29275, ScrollControl.encodeBase37Name(param0, 7441));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("kf.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    kf(LegacyOpenGlGraphicsToolkit param0, int param1, int param2, int param3) {
        this.field_r = -1;
        this.field_z = -1;
        try {
          this.field_C = param0;
          this.field_x = param3;
          this.field_A = param2;
          this.field_D = param1;
          jaggl.OpenGL.glGenRenderbuffersEXT(1, DualLinkNode.field_q, 0);
          this.field_y = DualLinkNode.field_q[0];
          jaggl.OpenGL.glBindRenderbufferEXT(36161, this.field_y);
          jaggl.OpenGL.glRenderbufferStorageEXT(36161, this.field_D, this.field_A, this.field_x);
          this.field_s = this.field_A * (this.field_x * this.field_C.d(this.field_D, -72));
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        achievementsText = "Achievements";
    }
}
