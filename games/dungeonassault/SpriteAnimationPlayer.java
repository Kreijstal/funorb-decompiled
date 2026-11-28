/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteAnimationPlayer {
    static AccountRequestState field_d;
    eh field_i;
    private int field_c;
    static nn field_f;
    static int field_j;
    int field_e;
    private int field_a;
    private int field_b;
    static bf[] field_l;
    private int field_h;
    private eh field_g;
    eh field_n;
    int field_k;
    private int field_m;

    final void advanceAnimation(byte param0, int param1) {
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 != 109) {
          return;
        }
        if (this.field_k == ConfirmedEmailAvailabilityValidator.field_n) {
          return;
        }
        if (this.field_k == li.field_h) {
          this.field_e = this.field_e - (param1 >> 2);
          if (0 >= this.field_e) {
            this.field_e = 0;
            this.field_k = ConfirmedEmailAvailabilityValidator.field_n;
          }
          return;
        }
        this.field_c = this.field_c - param1;
        while (this.field_c < 0) {
          if (!this.advanceToNextFrame(0)) {
            return;
          }
        }
    }

    final void drawAnimation(int param0, int param1, byte param2, int param3, int param4) {
        if (null == this.field_n) {
          SoftwareRasterizer.fillRectangle(param3, param1, param0, param4, 0);
          return;
        }
        if (this.field_e > 0) {
          this.drawBlendedFrame(param1, 1, param0, param3, param4);
        }
        if (param2 != 102) {
          return;
        }
        if (this.field_e < 256) {
          SoftwareRasterizer.fillRectangleAlpha(param3, param1, param0, param4, 0, 256 - this.field_e);
        }
    }

    final void playOnceThenIdle(int param0, eh param1) {
        try {
          if (param0 < 8) {
            this.advanceAnimation((byte) 98, 50);
          }
          this.startAnimation(ModalDialog.field_M, param1, -10872);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "wd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void prepareNextFrame(byte param0) {
        if (this.field_n == null) {
          this.field_g = null;
          return;
        }
        this.field_g = this.field_n;
        this.field_h = this.field_m + 1;
        if (param0 != 28) {
          field_f = (nn) null;
          if (this.field_h < this.field_n.field_c) {
            return;
          }
          if (this.field_a == rl.field_b) {
            this.field_h = 0;
            return;
          }
          if (this.field_a != ModalDialog.field_M) {
            this.field_g = null;
            return;
          }
          this.field_h = 0;
          this.field_g = this.field_i;
          return;
        }
        if (this.field_h < this.field_n.field_c) {
          return;
        }
        if (this.field_a == rl.field_b) {
          this.field_h = 0;
          return;
        }
        if (this.field_a != ModalDialog.field_M) {
          this.field_g = null;
          return;
        }
        this.field_h = 0;
        this.field_g = this.field_i;
    }

    final static void writeQueuedClientPayload(byte param0, int param1, ue param2) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = ac.field_B;
          CipherPacketBuffer var3 = var6;
          var6.d((byte) -126, param1);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(6, 1);
          if (null != param2.field_l) {
            var6.writeByte(6, param2.field_l.length);
            var6.writeBytes(param2.field_l, 1, param2.field_l.length, 0);
          } else {
            var6.writeByte(6, 0);
          }
          var6.appendCrc32((byte) -106, var4);
          var6.position = var6.position - 4;
          if (param0 >= -68) {
            ue var5 = (ue) null;
            SpriteAnimationPlayer.writeQueuedClientPayload((byte) -67, -90, (ue) null);
          }
          param2.field_k = var6.readInt(-31);
          var6.backpatchByteLength(var6.position - var4, -1);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "wd.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void startAnimation(int param0, eh param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          this.field_e = 256;
          this.field_m = 0;
          this.field_n = param1;
          if (null != this.field_n) {
            this.field_b = this.field_n.field_j[0] * ModalDialogHost.a(320, false, 192) >>> 8;
            this.field_c = this.field_b;
            this.field_k = rl.field_f;
            this.prepareNextFrame((byte) 28);
          } else {
            this.field_k = ConfirmedEmailAvailabilityValidator.field_n;
          }
          if (param2 == -10872) {
            return;
          }
          this.drawBlendedFrame(39, -38, 55, 112, -35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean advanceToNextFrame(int param0) {
        this.field_m = this.field_m + 1;
        if (this.field_n.field_c > this.field_m) {
          if (param0 != 0) {
            SpriteAnimationPlayer.clearAnimationPlayerGlobals(-49);
            this.field_b = this.field_n.field_j[this.field_m] * ModalDialogHost.a(320, false, 192) >>> 8;
            this.field_c = this.field_c + this.field_b;
            this.prepareNextFrame((byte) 28);
            return true;
          }
          this.field_b = this.field_n.field_j[this.field_m] * ModalDialogHost.a(320, false, 192) >>> 8;
          this.field_c = this.field_c + this.field_b;
          this.prepareNextFrame((byte) 28);
          return true;
        }
        if (this.field_a == rl.field_b) {
          this.field_m = 0;
          if (param0 != 0) {
            SpriteAnimationPlayer.clearAnimationPlayerGlobals(-49);
            this.field_b = this.field_n.field_j[this.field_m] * ModalDialogHost.a(320, false, 192) >>> 8;
            this.field_c = this.field_c + this.field_b;
            this.prepareNextFrame((byte) 28);
            return true;
          }
          this.field_b = this.field_n.field_j[this.field_m] * ModalDialogHost.a(320, false, 192) >>> 8;
          this.field_c = this.field_c + this.field_b;
          this.prepareNextFrame((byte) 28);
          return true;
        }
        if (ModalDialog.field_M == this.field_a) {
          this.startAnimation(rl.field_b, this.field_i, -10872);
          return false;
        }
        this.field_m = this.field_m - 1;
        this.field_e = 256;
        this.field_k = this.field_a;
        return false;
    }

    SpriteAnimationPlayer(eh param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param0;
          this.startAnimation(rl.field_b, this.field_i, -10872);
          if (null == this.field_i) {
            return;
          }
          this.advanceAnimation((byte) 109, DraggableWidgetContainer.b(0, this.field_i.field_f));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wd.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void drawBlendedFrame(int param0, int param1, int param2, int param3, int param4) {
        RgbSprite var10 = null;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var7 = 0;
        RgbSprite var8 = this.field_n.a(param2, this.field_m, param4, 0);
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        if (var8 == null) {
          SoftwareRasterizer.fillRectangle(param3, param0, param2, param4, 0);
          return;
        }
        if (param1 != 1) {
          this.field_a = -66;
          var8.drawOpaque(param3, param0);
          if (null == this.field_g) {
            return;
          }
          if (this.field_n != this.field_g) {
            var10 = this.field_g.a(param2, this.field_h, param4, param1 - 1);
            if (var10 != null) {
              var7 = -((this.field_c << 8) / this.field_b) + 256;
              ob.a(var10, param3, var7, param0, true);
            }
            return;
          }
          if (this.field_h == this.field_m) {
            return;
          }
          var11 = this.field_g.a(param2, this.field_h, param4, param1 - 1);
          RgbSprite var9 = var11;
          if (var11 != null) {
            var7Lifetime3 = -((this.field_c << 8) / this.field_b) + 256;
            ob.a(var11, param3, var7Lifetime3, param0, true);
            return;
          }
          return;
        }
        var8.drawOpaque(param3, param0);
        if (null == this.field_g) {
          return;
        }
        if (this.field_n == this.field_g) {
          if (this.field_h != this.field_m) {
            var12 = this.field_g.a(param2, this.field_h, param4, param1 - 1);
            if (var12 != null) {
              var7Lifetime1 = -((this.field_c << 8) / this.field_b) + 256;
              ob.a(var12, param3, var7Lifetime1, param0, true);
            }
            return;
          }
          return;
        }
        RgbSprite var13 = this.field_g.a(param2, this.field_h, param4, param1 - 1);
        if (var13 != null) {
          var7Lifetime2 = -((this.field_c << 8) / this.field_b) + 256;
          ob.a(var13, param3, var7Lifetime2, param0, true);
          return;
        }
    }

    public static void clearAnimationPlayerGlobals(int param0) {
        field_f = null;
        field_d = null;
        field_l = null;
        if (param0 < 5) {
          ue var2 = (ue) null;
          SpriteAnimationPlayer.writeQueuedClientPayload((byte) -55, -32, (ue) null);
        }
    }

    SpriteAnimationPlayer(eh param0, eh param1, int param2) {
        try {
          this.field_i = param0;
          this.startAnimation(param2, param1, -10872);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
