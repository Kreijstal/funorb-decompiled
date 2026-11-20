/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FadingDialog extends WidgetContainer {
    private DialogLayer field_H;
    private int field_G;
    boolean field_F;
    static int field_I;
    static RotatedSpriteAsset[] field_K;
    static IntrusiveDeque field_J;

    private final int a(byte param0) {
        if (param0 <= -21) {
          return !this.field_F ? 0 : this != this.field_H.i((byte) -75) ? 0 : 256;
        }
        return 15;
    }

    final static IndexedSprite a(int[] param0, int param1, IndexedSprite param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        Sprite var4 = null;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          var3.field_i = param2.field_i;
          var3.field_k = param2.field_k;
          var3.field_d = param2.field_d;
          var3.field_e = param2.field_e;
          if (param1 >= -86) {
            var4 = (Sprite) null;
            FadingDialog.a(87, -114, (Sprite) null, 117, (Sprite) null);
          }
          var3.field_c = param2.field_c;
          var3.field_n = param0;
          var3.field_l = param2.field_l;
          var3.field_m = param2.field_m;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("rl.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean g(byte param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_25_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != 39) {
          this.field_G = -97;
          var2 = this.a((byte) -57);
          var3 = var2 - this.field_G;
          if (0 < var3) {
            this.field_G = this.field_G + (7 + var3) / 8;
          }
          if (var3 < 0) {
            this.field_G = this.field_G + (-16 + var3 + 1) / 16;
          }
          if (0 != this.field_G) {
            return false;
          }
          if (0 != var2) {
            return false;
          }
          stackIn_25_0 = !(this.field_F);
          return stackIn_25_0;
        }
        var2Lifetime1 = this.a((byte) -57);
        var3Lifetime1 = var2Lifetime1 - this.field_G;
        if (0 < var3Lifetime1) {
          this.field_G = this.field_G + (7 + var3Lifetime1) / 8;
        }
        if (var3Lifetime1 < 0) {
          this.field_G = this.field_G + (-16 + var3Lifetime1 + 1) / 16;
        }
        stackIn_12_0 = (0 == this.field_G) && (0 == var2Lifetime1) && (!this.field_F);
        return stackIn_12_0;
    }

    final static Sprite a(int param0, int param1, Sprite param2, int param3, Sprite param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Sprite var7 = null;
        Sprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = Math.max(param4.width, param3 + param2.width);
          var6 = Math.max(param4.height, param2.height + param1);
          var7 = new Sprite(var5_int, var6);
          TutorialTransition.a(32381);
          var7.bindRaster();
          if (param0 != -5936) {
            field_I = 52;
          }
          param4.drawUnkeyed(0, 0);
          WhirlpoolHasher.a(param1, param3, 107, param2);
          MarkerSliderRenderer.restoreRasterTarget(-1);
          stackIn_3_0 = var7;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("rl.Q(").append(param0).append(',').append(param1).append(',');
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (0 == this.field_G) {
          return;
        }
        if (256 <= this.field_G) {
          if (param3 != 0) {
            return;
          }
          this.drawFrame(param2 + this.x, this.y + param1, (byte) 20);
          super.drawLayer(-9532, param1, param2, param3);
          return;
        }
        if (jh.field_c == null) {
          jh.field_c = new Sprite(this.width, this.height);
          ProxySocketConnector.a(jh.field_c, -1);
          SoftwareRasterizer.clear();
          this.drawFrame(0, 0, (byte) 20);
          super.drawLayer(param0, -param1 - this.y, -this.x - param2, param3);
          dm.b((byte) -10);
          jh.field_c.drawAlpha(param2 + this.x, param1 + this.y, this.field_G);
          return;
        }
        if (jh.field_c.width < this.width) {
          jh.field_c = new Sprite(this.width, this.height);
          ProxySocketConnector.a(jh.field_c, -1);
          SoftwareRasterizer.clear();
          this.drawFrame(0, 0, (byte) 20);
          super.drawLayer(param0, -param1 - this.y, -this.x - param2, param3);
          dm.b((byte) -10);
          jh.field_c.drawAlpha(param2 + this.x, param1 + this.y, this.field_G);
          return;
        }
        if (this.height > jh.field_c.height) {
          jh.field_c = new Sprite(this.width, this.height);
          ProxySocketConnector.a(jh.field_c, -1);
          SoftwareRasterizer.clear();
          this.drawFrame(0, 0, (byte) 20);
          super.drawLayer(param0, -param1 - this.y, -this.x - param2, param3);
          dm.b((byte) -10);
          jh.field_c.drawAlpha(param2 + this.x, param1 + this.y, this.field_G);
          return;
        }
        ProxySocketConnector.a(jh.field_c, -1);
        SoftwareRasterizer.clear();
        this.drawFrame(0, 0, (byte) 20);
        super.drawLayer(param0, -param1 - this.y, -this.x - param2, param3);
        dm.b((byte) -10);
        jh.field_c.drawAlpha(param2 + this.x, param1 + this.y, this.field_G);
    }

    abstract void drawFrame(int param0, int param1, byte param2);

    FadingDialog(DialogLayer param0, int param1, int param2) {
        super(-param1 + EmailAddressValidator.field_i >> 1, -param2 + pe.field_e >> 1, param1, param2, (WidgetRenderer) null);
        try {
          this.field_F = false;
          this.field_H = param0;
          this.field_G = 0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int var6;
        int var7;
        ClientTextResources.field_a[Vector2f.field_h] = param4;
        IterableNodeHashTable.field_h[Vector2f.field_h] = Vector2f.field_h;
        if (param3 < 82) {
          return;
        }
        SpriteSheetAsset.field_j[Vector2f.field_h] = param0;
        if (param0 > r.field_c) {
          VehicleDefinition.field_t = param0;
        }
        if (param0 < MatchingTextValidator.field_j) {
          we.field_j = param0;
        }
        IsaacPacketBuffer.field_u[Vector2f.field_h] = param5;
        ua.field_c[Vector2f.field_h] = param1;
        fj.field_q[Vector2f.field_h] = param2;
        var6 = param2 + (param1 + param5);
        if (var6 == 0) {
          stackIn_10_0 = 0;
        } else {
          stackIn_10_0 = 1000 * param5 / var6;
        }
        var7 = stackIn_10_0;
        NetworkGameClient.field_s[Vector2f.field_h] = var7;
        Vector2f.field_h = Vector2f.field_h + 1;
        if (we.field_j > var7) {
          we.field_j = var7;
        }
        if (var7 > VehicleDefinition.field_t) {
          VehicleDefinition.field_t = var7;
        }
        return;
    }

    public static void clearSharedReferences(int param0) {
        field_J = null;
        field_K = null;
        if (param0 != -1349126303) {
          field_I = -65;
        }
    }

    final static void h(int param0) {
        TutorialPage.a((byte) -126);
        RotatedSpriteAsset.a(param0 + param0, 4);
    }

    final void b(int param0, int param1, int param2) {
        if (param0 == 537342017) {
          this.setBounds(EmailAddressValidator.field_i - param1 >> 1, (byte) 122, pe.field_e - param2 >> 1, param2, param1);
          return;
        }
    }

    final UiWidget f(byte param0) {
        UiWidget var2 = super.f((byte) 83);
        if (var2 != null) {
          return var2;
        }
        if (param0 > 73) {
          return (UiWidget) (this);
        }
        this.drawLayer(-24, 85, 88, -106);
        return (UiWidget) (this);
    }

    boolean a(boolean param0) {
        if (!param0) {
          field_K = (RotatedSpriteAsset[]) null;
          this.field_G = this.a((byte) -31);
          if (this.field_G != 0) {
            return false;
          }
          if (!this.field_F) {
            return true;
          }
          return false;
        }
        this.field_G = this.a((byte) -31);
        if (this.field_G != 0) {
          return false;
        }
        if (!this.field_F) {
          return true;
        }
        return false;
    }

    static {
        field_I = 65;
    }
}
