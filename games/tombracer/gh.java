/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gh extends ToolkitSprite {
    private boolean field_h;
    private int field_g;
    static String field_f;
    private int field_l;
    private HardwareGraphicsToolkit field_c;
    private boolean field_a;
    private int field_j;
    private boolean field_b;
    private GpuTexture2D field_d;
    private int field_k;
    static String field_e;
    private int field_i;
    private int field_m;

    final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        AffineTransform3D var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        AffineTransform3D var27;
        GpuTexture2D stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        TextureFilter stackIn_5_2 = null;
        var27 = this.field_c.y((byte) -77);
        var12 = this.field_c.C(0);
        stackIn_4_0 = this.field_d;
        stackIn_4_1 = 7672;
        if (!this.field_a &&
          !this.field_h &&
          (1 & param9) != 0) {
          stackIn_5_2 = MirrorComponent.field_G;
        } else {
          stackIn_5_2 = MiscItemBehaviour.field_v;
        }
        ((GpuTexture2D) (Object) stackIn_4_0).setFilter(stackIn_4_1, stackIn_5_2);
        this.field_c.k((byte) 121);
        this.field_c.bindTexture(true, this.field_d);
        this.field_c.setBlendMode(param8, 1);
        this.field_c.a((byte) -97, param6);
        this.field_c.a(pea.field_c, 1, -82);
        this.field_c.a(1, false, pea.field_c);
        this.field_c.g(3625, param7);
        if (this.field_b) {
          var13 = (float)this.paddedWidth();
          var14 = (float)this.paddedHeight();
          var15 = (-param0 + param2) / var13;
          var16 = (param3 - param1) / var13;
          var17 = (-param0 + param4) / var14;
          var18 = (param5 - param1) / var14;
          var19 = var17 * (float)this.field_j;
          var20 = (float)this.field_j * var18;
          var21 = var15 * (float)this.field_g;
          var22 = (float)this.field_g * var16;
          var23 = (float)this.field_m * -var15;
          var24 = -var16 * (float)this.field_m;
          var25 = (float)this.field_i * -var17;
          param2 = var19 + (param2 + var23);
          param4 = var25 + (var21 + param4);
          var26 = (float)this.field_i * -var18;
          param1 = var20 + (var22 + param1);
          param0 = var21 + param0 + var19;
          param3 = var20 + (var24 + param3);
          param5 = var26 + (param5 + var22);
        }
        var27.a(0.0f, 0.0f, (byte) 102, 0.0f, 0.0f, -param0 + param2, -param0 + param4, -param1 + param3, 1.0f, -param1 + param5);
        var27.a(param1, -108, param0, 0.0f);
        var12.a(1.0f, this.field_d.textureV((float)this.field_l, (byte) -33), false, this.field_d.textureU(62, (float)this.field_k));
        this.field_c.a(pfa.field_i, false);
        this.field_c.F(-1662);
        this.field_c.y(2);
        this.field_c.p((byte) -60);
        this.field_c.a(PlayerContextMenu.field_j, 1, -22);
        this.field_c.a(1, false, PlayerContextMenu.field_j);
    }

    final int width() {
        return this.field_l;
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        AffineTransform3D var8 = this.field_c.y((byte) -77);
        AffineTransform3D var7 = this.field_c.C(0);
        param1 = param1 + this.field_j;
        param0 = param0 + this.field_g;
        this.field_d.setFilter(7672, MiscItemBehaviour.field_v);
        this.field_c.k((byte) 105);
        this.field_c.bindTexture(true, this.field_d);
        this.field_c.setBlendMode(param4, 1);
        this.field_c.a((byte) -19, param2);
        this.field_c.a(pea.field_c, 1, -26);
        this.field_c.a(1, false, pea.field_c);
        this.field_c.g(3625, param3);
        var8.a(0.0f, (float)this.field_l, false, (float)this.field_k);
        var8.translate(param0, param1, 0);
        var7.a(1.0f, this.field_d.textureV((float)this.field_l, (byte) -33), false, this.field_d.textureU(93, (float)this.field_k));
        this.field_c.a(pfa.field_i, false);
        this.field_c.F(-1662);
        this.field_c.y(2);
        this.field_c.p((byte) -58);
        this.field_c.a(PlayerContextMenu.field_j, 1, -89);
        this.field_c.a(1, false, PlayerContextMenu.field_j);
    }

    final static void a(BitPacketBuffer param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        BitPacketBuffer var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (toa.field_j) {
            return;
          }
          var2_int = param0.readUnsignedByte(255);
          ComponentTargetList.field_e = new BitSet(var2_int);
          param0.beginBitAccess((byte) -89);
          for (var3 = 0; var3 < var2_int; var3++) {
            if (CircleMovementLocomotor.readBitFlag(5907, param0)) {
              ComponentTargetList.field_e.set(var3);
            }
          }
          param0.endBitAccess((byte) 98);
          if (param1 >= -41) {
            var5 = (BitPacketBuffer) null;
            gh.a((BitPacketBuffer) null, (byte) 109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gh.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int paddedWidth() {
        return this.field_m + this.field_g + this.field_l;
    }

    final int paddedHeight() {
        return this.field_i + this.field_j + this.field_k;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -2 % ((param0 - 70) / 50);
    }

    final int height() {
        return this.field_k;
    }

    final void setInsets(int param0, int param1, int param2, int param3) {
        boolean stackIn_7_1 = false;
        this.field_i = param3;
        this.field_g = param0;
        this.field_j = param1;
        this.field_m = param2;
        stackIn_7_1 = (0 != this.field_g) || (this.field_j != 0) || (this.field_m != 0) || (this.field_i != 0);
        this.field_b = stackIn_7_1;
    }

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        AffineTransform3D var10;
        AffineTransform3D var11;
        GpuTexture2D stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        TextureFilter stackIn_6_2 = null;
        var11 = this.field_c.y((byte) -77);
        var10 = this.field_c.C(0);
        stackIn_4_0 = this.field_d;
        stackIn_4_1 = 7672;
        if (!this.field_a &&
          !this.field_h &&
          (param7 & 1) != 0) {
          stackIn_6_2 = MirrorComponent.field_G;
        } else {
          stackIn_6_2 = MiscItemBehaviour.field_v;
        }
        ((GpuTexture2D) (Object) stackIn_4_0).setFilter(stackIn_4_1, stackIn_6_2);
        this.field_c.k((byte) 118);
        this.field_c.bindTexture(true, this.field_d);
        this.field_c.setBlendMode(param6, 1);
        this.field_c.a((byte) 117, param4);
        this.field_c.a(pea.field_c, 1, -74);
        this.field_c.a(1, false, pea.field_c);
        this.field_c.g(3625, param5);
        var10.a(1.0f, this.field_d.textureV((float)this.field_l, (byte) -33), false, this.field_d.textureU(81, (float)this.field_k));
        if (this.field_b) {
          param2 = this.field_l * param2 / this.paddedWidth();
          param3 = param3 * this.field_k / this.paddedHeight();
          param0 = param0 + param2 * this.field_g / this.field_l;
          param1 = param1 + param3 * this.field_j / this.field_k;
        }
        var11.a(0.0f, (float)param2, false, (float)param3);
        var11.translate(param0, param1, 0);
        this.field_c.a(pfa.field_i, false);
        this.field_c.F(-1662);
        this.field_c.y(2);
        this.field_c.p((byte) 84);
        this.field_c.a(PlayerContextMenu.field_j, 1, -64);
        this.field_c.a(1, false, PlayerContextMenu.field_j);
    }

    gh(HardwareGraphicsToolkit param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = 0;
        this.field_j = 0;
        this.field_b = false;
        this.field_i = 0;
        this.field_m = 0;
        try {
          this.field_c = param0;
          this.field_k = param2;
          this.field_l = param1;
          this.field_d = param0.createIntTexture2D(param3, param4, false, param1, param5, param2, -82);
          this.field_d.setWrap((byte) -66, true, true);
          stackIn_4_1 = (this.field_d.getWidth(-7070) != param1);
          this.field_a = stackIn_4_1;
          stackIn_7_1 = (param2 != this.field_d.getHeight((byte) -76));
          this.field_h = stackIn_7_1;
          if (!this.field_a) {
            this.field_d.a(-14634);
          }
          if (!this.field_h) {
            this.field_d.a(-14634);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("gh.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_f = "You have not yet unlocked this option for use.";
        field_e = "Ace";
    }
}
