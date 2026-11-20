/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlPostProcessor {
    private int height;
    private OpenGlFramebuffer field_o;
    private int captureY;
    private IntrusiveDeque effects;
    private OpenGlFramebuffer field_s;
    private OpenGlToolkit toolkit;
    private boolean captureActive;
    private int width;
    static int field_v;
    private OpenGlFramebuffer field_h;
    private int captureX;
    static String field_d;
    private aia field_w;
    private boolean field_e;
    private aia[] field_l;
    private nv field_n;
    private int passCount;
    private boolean field_f;
    private boolean field_a;
    private int colorFormat;
    private boolean needsDepthTexture;
    private nv field_u;
    private boolean field_j;

    private final void removeEffect(OpenGlPostEffect param0, boolean param1) {
        try {
          param0.enabled = param1 ? true : false;
          param0.releaseResources((byte) 66);
          param0.unlink(-3846);
          this.updateRequirements(false);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void updateRequirements(boolean param0) {
        int var5 = 0;
        int var6 = 0;
        int var8 = VoidHunters.field_G;
        int var2 = param0 ? 1 : 0;
        int var3 = 0;
        int var4 = 0;
        OpenGlPostEffect var9 = (OpenGlPostEffect) (this.effects.first(0));
        int var6Lifetime1;
        while (var9 != null) {
          var6 = var9.getColorBufferPrecision((byte) 7);
          if (var6 > var3) {
            var3 = var6;
          }
          var4 = var4 + var9.getPassCount(23230);
          var2 = var2 != 0 | var9.requiresDepthTexture(0) ? 1 : 0;
          var9 = (OpenGlPostEffect) (this.effects.next((byte) 72));
        }
        if (2 == var3) {
          var5 = 34836;
        } else {
          if (var3 == 1) {
            var5 = 34842;
          } else {
            var5 = 6408;
          }
        }
        if (var5 != this.colorFormat) {
          this.field_e = true;
          this.colorFormat = var5;
        }
        var6Lifetime1 = 2 < this.passCount ? 2 : this.passCount;
        int var7 = var4 <= 2 ? var4 : 2;
        this.passCount = var4;
        if (var6Lifetime1 != var7) {
          this.field_e = true;
          this.field_j = true;
        }
        if ((var2 == 0 ? 1 : 0) == (this.needsDepthTexture ? 1 : 0)) {
          this.needsDepthTexture = var2 != 0 ? true : false;
          this.field_f = true;
        }
    }

    final boolean addEffect(int param0, OpenGlPostEffect param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2998) {
            this.field_h = (OpenGlFramebuffer) null;
          }
          if (null != this.field_h) {
            if (param1.isInitialized(-257) ||
              param1.initialize(param0 - 2907)) {
              this.effects.addLast(-10258, param1);
              this.updateRequirements(false);
              if (this.ensureAttachments(false)) {
                if (this.width != -1 &&
                  -1 != this.height) {
                  param1.resize(this.height, this.width, -19454);
                }
                param1.enabled = true;
                return true;
              }
            }
            this.removeEffect(param1, false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("kha.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean begin(int param0, int param1, int param2, int param3, int param4) {
        IntrusiveNode var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (param4 != -5214) {
          this.effects = (IntrusiveDeque) null;
        }
        if (null != this.field_h &&
          !this.effects.isEmpty(118)) {
          if (this.width != param2 ||
            param3 != this.height) {
            this.height = param3;
            this.width = param2;
            var6 = this.effects.first(param4 + 5214);
            while (var6 != this.effects.sentinel) {
              ((OpenGlPostEffect) (var6)).resize(this.height, this.width, -19454);
              var6 = var6.next;
            }
            this.field_j = true;
            this.field_f = true;
            this.field_e = true;
          }
          if (!this.ensureAttachments(false)) {
            return false;
          }
          this.captureY = param1;
          this.captureX = param0;
          this.captureActive = true;
          this.toolkit.pushFramebuffer((byte) -120, (OpenGlFramebufferBinding) (this.field_h));
          this.field_h.setDrawBuffer(0, 0);
          this.toolkit.setViewportOrigin(this.height + this.captureY - this.toolkit.field_Y, -this.captureX, 0);
          return true;
        }
        return false;
    }

    private final boolean ensureAttachments(boolean param0) {
        aia[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        aia stackIn_34_2 = null;
        boolean stackIn_55_1 = false;
        boolean stackIn_59_0 = false;
        int var3;
        OpenGlPostEffect var4;
        var3 = VoidHunters.field_G;
        if (this.field_f) {
          if (null != this.field_u) {
            this.field_u.e((byte) 119);
            this.field_u = null;
          }
          if (null != this.field_w) {
            this.field_w.dispose(0);
            this.field_w = null;
          }
          if (null != this.field_s) {
            this.field_u = new nv(this.toolkit, 6402, this.width, this.height, this.toolkit.field_Kc);
          }
          if (!this.needsDepthTexture) {
            if (this.field_u == null) {
              this.field_u = new nv(this.toolkit, 6402, this.width, this.height);
            }
          } else {
            this.field_w = new aia(this.toolkit, 34037, 6402, this.width, this.height);
          }
          this.field_j = true;
          this.field_f = false;
          this.field_a = true;
        }
        if (param0) {
          var4 = (OpenGlPostEffect) null;
          this.addEffect(120, (OpenGlPostEffect) null);
        }
        if (this.field_e) {
          if (this.field_n != null) {
            this.field_n.e((byte) 110);
            this.field_n = null;
          }
          if (null != this.field_l[0]) {
            this.field_l[0].dispose(0);
            this.field_l[0] = null;
          }
          if (null != this.field_l[1]) {
            this.field_l[1].dispose(0);
            this.field_l[1] = null;
          }
          if (this.field_s != null) {
            this.field_n = new nv(this.toolkit, this.colorFormat, this.width, this.height, this.toolkit.field_Kc);
          }
          this.field_l[0] = new aia(this.toolkit, 34037, this.colorFormat, this.width, this.height);
          stackIn_33_0 = this.field_l;
          stackIn_33_1 = 1;
          if (1 >= this.passCount) {
            stackIn_34_2 = null;
          } else {
            stackIn_34_2 = new aia(this.toolkit, 34037, this.colorFormat, this.width, this.height);
          }
          stackIn_33_0[stackIn_33_1] = stackIn_34_2;
          this.field_j = true;
          this.field_a = true;
          this.field_e = false;
        }
        if (this.field_j) {
          if (this.field_s != null) {
            this.toolkit.pushFramebuffer((byte) -126, (OpenGlFramebufferBinding) (this.field_o));
            this.field_o.detachAttachment(0, (byte) -27);
            this.field_o.detachAttachment(1, (byte) -27);
            this.field_o.detachAttachment(8, (byte) 110);
            this.field_o.attachTexture(0, (byte) -126, this.field_l[0]);
            if (this.passCount > 1) {
              this.field_o.attachTexture(1, (byte) -126, this.field_l[1]);
            }
            if (this.needsDepthTexture) {
              this.field_o.attachTexture(8, (byte) -128, this.field_w);
            }
            this.toolkit.popFramebuffer(this.field_o, 2896);
            this.toolkit.pushFramebuffer((byte) -122, (OpenGlFramebufferBinding) (this.field_s));
            this.field_s.detachAttachment(0, (byte) -48);
            this.field_s.detachAttachment(8, (byte) -80);
            this.field_s.attachRenderbuffer(0, this.field_n, (byte) -20);
            this.field_s.attachRenderbuffer(8, this.field_u, (byte) -20);
            this.toolkit.popFramebuffer(this.field_s, 2896);
          } else {
            this.toolkit.pushFramebuffer((byte) -125, (OpenGlFramebufferBinding) (this.field_o));
            this.field_o.detachAttachment(0, (byte) -36);
            this.field_o.detachAttachment(1, (byte) -61);
            this.field_o.detachAttachment(8, (byte) -5);
            this.field_o.attachTexture(0, (byte) -127, this.field_l[0]);
            if (this.passCount > 1) {
              this.field_o.attachTexture(1, (byte) -127, this.field_l[1]);
            }
            if (!this.needsDepthTexture) {
              this.field_o.attachRenderbuffer(8, this.field_u, (byte) -20);
            } else {
              this.field_o.attachTexture(8, (byte) -126, this.field_w);
            }
            this.toolkit.popFramebuffer(this.field_o, 2896);
          }
          this.field_j = false;
          this.field_a = true;
        }
        if (this.field_a) {
          this.toolkit.pushFramebuffer((byte) -121, (OpenGlFramebufferBinding) (this.field_h));
          stackIn_55_1 = !(this.field_h.isComplete(93));
          this.field_a = stackIn_55_1;
          this.toolkit.popFramebuffer(this.field_h, 2896);
        }
        stackIn_59_0 = !(this.field_a);
        return stackIn_59_0;
    }

    final void apply(int param0) {
        int var7 = 0;
        int var2;
        int var3;
        OpenGlPostEffect var4_ref_mea;
        int var4;
        OpenGlPostEffect var5;
        int var6;
        int var8;
        int var2Lifetime1;
        var8 = VoidHunters.field_G;
        if (!this.captureActive) {
          return;
        }
        if (null != this.field_s) {
          var2 = 16384;
          this.toolkit.popDrawFramebuffer((byte) 101, (OpenGlFramebufferBinding) (this.field_s));
          this.toolkit.pushDrawFramebuffer(0, this.field_o);
          this.field_s.setReadBuffer(119, 0);
          this.field_o.setDrawBuffer(0, 0);
          if (this.needsDepthTexture) {
            var2 = var2 | 256;
          }
          jaggl.OpenGL.glBlitFramebufferEXT(0, 0, this.width, this.height, 0, 0, this.width, this.height, var2, 9728);
          this.toolkit.popReadFramebuffer((OpenGlFramebufferBinding) (this.field_s), (byte) -94);
          this.toolkit.pushReadFramebuffer(56, this.field_o);
        }
        this.toolkit.n(27841);
        this.toolkit.setBlendMode(0, 127);
        this.toolkit.setTextureCombineMode(0, 1);
        this.toolkit.resetClipRectangle(110);
        var2Lifetime1 = 0;
        var3 = 1;
        var4_ref_mea = (OpenGlPostEffect) (this.effects.first(0));
        while (null != var4_ref_mea) {
          var5 = (OpenGlPostEffect) (this.effects.next((byte) 112));
          var6 = var4_ref_mea.getPassCount(23230);
          for (var7 = 0; var6 > var7; var7++) {
            var4_ref_mea.setupPass(this.field_l[var2Lifetime1], -3009, this.field_w, var7);
            if (null == var5 &&
              -1 + var6 == var7) {
              this.toolkit.popFramebuffer(this.field_o, 2896);
              this.toolkit.setViewportOrigin(0, 0, 0);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.height);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.captureX, this.captureY);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.captureX, this.height + this.captureY);
              jaggl.OpenGL.glTexCoord2f((float)this.width, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.captureX + this.width, this.height + this.captureY);
              jaggl.OpenGL.glTexCoord2f((float)this.width, (float)this.height);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.width + this.captureX, this.captureY);
              jaggl.OpenGL.glEnd();
            } else {
              this.field_o.setDrawBuffer(0, 0 + var3);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.height);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, this.height);
              jaggl.OpenGL.glTexCoord2f((float)this.width, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.width, this.height);
              jaggl.OpenGL.glTexCoord2f((float)this.width, (float)this.height);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.width, 0);
              jaggl.OpenGL.glEnd();
            }
            var2Lifetime1 = 1 + var2Lifetime1 & 1;
            var4_ref_mea.finishPass(var7, 1);
            var3 = var3 + 1 & 1;
          }
          var4_ref_mea = var5;
        }
        this.captureActive = false;
        var4 = -21 / ((55 - param0) / 61);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          return;
        }
        field_d = null;
    }

    final void dispose(boolean param0) {
        IntrusiveNode var2 = null;
        int var3 = VoidHunters.field_G;
        this.field_s = null;
        this.field_l = null;
        this.field_w = null;
        this.field_u = null;
        this.field_h = null;
        this.field_n = null;
        if (!param0) {
          OpenGlPostProcessor.clearSharedReferences(0);
        }
        this.field_o = null;
        if (!this.effects.isEmpty(8)) {
          var2 = this.effects.first(0);
          while (var2 != this.effects.sentinel) {
            ((OpenGlPostEffect) (var2)).releaseResources((byte) 66);
            var2 = var2.next;
          }
        }
        this.height = 1;
        this.width = 1;
    }

    final boolean isAvailable(int param0) {
        if (param0 > -125) {
          OpenGlPostEffect var3 = (OpenGlPostEffect) null;
          this.removeEffect((OpenGlPostEffect) null, true);
        }
        return this.field_h != null ? true : false;
    }

    OpenGlPostProcessor(OpenGlToolkit param0) {
        OpenGlFramebuffer dupTemp$2 = null;
        OpenGlFramebuffer dupTemp$3 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.captureY = 0;
        this.width = 1;
        this.height = 1;
        this.captureX = 0;
        this.effects = new IntrusiveDeque();
        this.field_l = new aia[2];
        this.passCount = 0;
        this.field_a = true;
        this.field_f = true;
        this.colorFormat = -1;
        this.field_e = true;
        this.needsDepthTexture = false;
        this.field_j = true;
        try {
          this.toolkit = param0;
          if (this.toolkit.field_U &&
            this.toolkit.field_g) {
            dupTemp$2 = new OpenGlFramebuffer(this.toolkit);
            this.field_o = dupTemp$2;
            this.field_h = dupTemp$2;
            if (1 < this.toolkit.field_Kc &&
              this.toolkit.field_Ob) {
              if (!this.toolkit.field_gb) {
                return;
              }
              dupTemp$3 = new OpenGlFramebuffer(this.toolkit);
              this.field_s = dupTemp$3;
              this.field_h = dupTemp$3;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("kha.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_d = "Uses energy to block projectiles";
    }
}
