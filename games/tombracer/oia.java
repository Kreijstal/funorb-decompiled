/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oia implements SelectivelyLitRenderable {
    PitModel field_c;
    int field_a;
    static String field_e;
    private static String[] field_d;
    int field_b;

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          oia.releaseStatics(true);
          return this.field_c.isRenderExpired((byte) 48);
        }
        return this.field_c.isRenderExpired((byte) 48);
    }

    public final boolean ignoresLight(boolean param0, LightSource param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oia.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int getRenderY(byte param0) {
        if (param0 > 91) {
          return this.field_c.getRenderY((byte) 103) + this.field_b;
        }
        this.field_a = -18;
        return this.field_c.getRenderY((byte) 103) + this.field_b;
    }

    public final void render(int param0, iq param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        TrapPart var3 = this.field_c.getPart(-100);
        if (var3 != null &&
          !var3.isEnabled(-101)) {
          return;
        }
        if (param0 < 103) {
          sda var8 = (sda) null;
          oia.a(9, (sda) null, 48);
        }
        ka var4 = this.field_c.a((byte) 9, this);
        if (var4 == null) {
          return;
        }
        try {
          var5 = this.getRenderX((byte) 69);
          var6 = this.getRenderY((byte) 102);
          var7 = this.getRenderZ((byte) -114);
          gqa.a(0, -83584144, var6, var5, var4, var7);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oia.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
          field_d = (String[]) null;
        }
    }

    public final boolean isUnlit(boolean param0) {
        if (!param0) {
          return true;
        }
        return true;
    }

    final static void a(int param0, sda param1, int param2) {
        BitPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = ql.field_k;
          BitPacketBuffer var3 = var6;
          var6.writeCipheredOpcode(param0, -2988);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(1, 0);
          if (null != param1.field_j) {
            var6.writeByte(param1.field_j.length, 0);
            var6.writeBytes(0, param1.field_j, param1.field_j.length, 105);
          } else {
            var6.writeByte(0, 0);
          }
          int var5 = 72 / ((30 - param2) / 34);
          var6.appendCrc32(var4, 64);
          var6.position = var6.position - 4;
          param1.field_l = var6.readInt(115);
          var6.backpatchByteLength(-var4 + var6.position, (byte) -110);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oia.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.getRenderX((byte) -5);
        }
    }

    public final int getRenderZ(byte param0) {
        if (param0 < -86) {
          return this.field_c.getRenderZ((byte) -119) - 17825792;
        }
        this.field_a = 113;
        return this.field_c.getRenderZ((byte) -119) - 17825792;
    }

    public final int getRenderX(byte param0) {
        int var2 = 35 / ((param0 + 23) / 53);
        return this.field_c.getRenderX((byte) 103) + this.field_a;
    }

    static {
        field_d = new String[2];
        field_d[0] = "Default";
        field_d[1] = "Other";
        field_e = "Next";
    }
}
