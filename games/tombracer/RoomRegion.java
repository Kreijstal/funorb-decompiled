/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoomRegion extends IntrusiveNode implements qn, Renderable, noa {
    private int height;
    private int y;
    private VariantMask variantMask;
    static boolean[] field_h;
    private boolean flipped;
    private int x;
    private boolean field_f;
    private int type;
    private Room room;
    private int width;
    static UiComponent field_l;

    private final boolean a(int param0) {
        if (param0 < 65) {
          return false;
        }
        return false;
    }

    final boolean isInVariant(int param0, boolean param1) {
        if (param1) {
          this.getRenderY((byte) -27);
        }
        return this.variantMask.includes(param0, 14530);
    }

    final void mirror(Room param0, byte param1) {
        Camera var4 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.x = param0.mirrorX(this.x, (byte) 71);
          stackIn_3_1 = !(this.flipped);
          this.flipped = stackIn_3_1;
          if (param1 != 104) {
            var4 = (Camera) null;
            this.render(-36, (Camera) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("lk.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean isOutsideActiveVariant(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          return false;
        }
        stackIn_6_0 = (this.room.hasActiveVariant((byte) -82)) && (!this.isInVariant(this.room.getActiveVariant(6029), false));
        return stackIn_6_0;
    }

    final void setX(int param0, int param1) {
        this.x = param1;
        if (param0 != -6492) {
          this.getRenderX((byte) 30);
        }
    }

    public final void render(int param0, Camera param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!this.isOutsideActiveVariant((byte) -1)) {
            dea.roomObjectRenderer.drawRegion(param1, 15, this);
          }
          if (param0 <= 103) {
            this.flipped = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("lk.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final int getRenderX(byte param0) {
        int var2 = -17 % ((-23 - param0) / 53);
        return this.x;
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.room = (Room) null;
        }
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        try {
          if (param0 >= -125) {
            this.x = -37;
          }
          param1.writeBits((byte) 20, this.type, 8);
          param1.writeBits((byte) -127, this.x >> 16, 12);
          param1.writeBits((byte) -43, this.y >> 16, 12);
          param1.writeBits((byte) -125, this.width >> 16, 10);
          param1.writeBits((byte) -128, this.height >> 16, 10);
          param1.writeBits((byte) -127, this.flipped ? 1 : 0, 1);
          param1.writeBits((byte) 86, !this.field_f ? 0 : 1, 1);
          this.variantMask.encode((byte) -86, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "lk.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.a(72);
    }

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          return -46;
        }
        return this.y;
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          this.width = -73;
          return 0;
        }
        return 0;
    }

    final int getX(byte param0) {
        int var2 = -101 % ((56 - param0) / 62);
        return this.x;
    }

    final int getWidth(int param0) {
        if (param0 < 36) {
          return -117;
        }
        return this.width;
    }

    final void setY(int param0, int param1) {
        this.y = param1;
        if (param0 != 0) {
          this.isRenderExpired((byte) 90);
        }
    }

    public static void releaseStatics(boolean param0) {
        field_l = null;
        field_h = null;
        if (param0) {
          field_h = (boolean[]) null;
        }
    }

    final int getHeight(boolean param0) {
        if (param0) {
          field_h = (boolean[]) null;
        }
        return this.height;
    }

    final int getY(byte param0) {
        if (param0 >= -58) {
          return -85;
        }
        return this.y;
    }

    RoomRegion(Room param0, BitPacketBuffer param1) {
        try {
          this.room = param0;
          this.type = param1.readBits((byte) 44, 8);
          this.x = param1.readBits((byte) 44, 12) << 16;
          this.y = param1.readBits((byte) 44, 12) << 16;
          this.width = param1.readBits((byte) 44, 10) << 16;
          this.height = param1.readBits((byte) 44, 10) << 16;
          this.flipped = param1.readBits((byte) 44, 1) == 1 ? true : false;
          this.field_f = param1.readBits((byte) 44, 1) == 1 ? true : false;
          this.variantMask = new VariantMask(param0.formatVersion, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_h = new boolean[42];
        for (var0 = 0; var0 < field_h.length; var0++) {
          field_h[var0] = true;
        }
        field_h[0] = false;
        field_h[36] = false;
        field_h[37] = false;
        field_h[38] = false;
        field_h[33] = false;
        field_h[34] = false;
        field_h[39] = false;
        field_h[40] = false;
        field_h[41] = false;
        field_h[35] = false;
    }
}
