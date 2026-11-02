/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FishRainEvent extends SpecialEvent {
    int field_q;
    static String field_r;
    int field_s;
    int[][] field_t;
    static volatile int field_u;

    final void a(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          super.a((byte) -26, param1);
          param1.writeByte(this.field_q, 0);
          param1.writeByte(this.field_s, 0);
          for (var3_int = 0; var3_int < 6; var3_int++) {
            param1.writeByte(this.field_t[var3_int][0], 0);
            param1.writeByte(this.field_t[var3_int][1], 0);
          }
          if (param0 > -12) {
            field_u = 75;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tba.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 9) {
          return;
        }
        field_r = null;
    }

    final void a(BattleState param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = 64 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tba.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 < 84) {
          return;
        }
        ProxySocketConnector.field_g.position = 0;
        ProxySocketConnector.field_g.writeByte(12, 0);
        ProxySocketConnector.field_g.writeInt(ia.field_k.nextInt(), -1615464796);
        ProxySocketConnector.field_g.writeInt(ia.field_k.nextInt(), -1615464796);
        ProxySocketConnector.field_g.writeByte(param3, 0);
        ProxySocketConnector.field_g.writeByte(param2, 0);
        ProxySocketConnector.field_g.b(param1, -113);
        ProxySocketConnector.field_g.encryptRsa(SuperSpeedSpecial.field_p, 0, SlowAllEvent.field_q);
        sja.field_fb.writeCipheredByte(18, (byte) 123);
        int fieldTemp$0 = sja.field_fb.position + 1;
        sja.field_fb.position = sja.field_fb.position + 1;
        int var4 = fieldTemp$0;
        sja.field_fb.a(0, -126, ProxySocketConnector.field_g.position, ProxySocketConnector.field_g.payload);
        sja.field_fb.writeLengthByte((byte) 118, sja.field_fb.position - var4);
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        FishRainAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            this.field_s = -125;
          }
          stackIn_3_0 = new FishRainAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    FishRainEvent(int param0, CreatureRef param1) {
        super(param0, param1);
        try {
          this.field_t = new int[6][2];
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tba.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int[][] e(int param0) {
        int[][] var5 = new int[17][17];
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var5[6][7] = 1;
        var5[5][8] = 1;
        var5[6][8] = 1;
        var5[7][6] = 1;
        var5[7][7] = 1;
        var5[param0][9] = 1;
        var5[7][9] = 1;
        var5[8][7] = 1;
        var5[7][8] = 1;
        var5[8][6] = 1;
        var5[7][10] = 1;
        var5[8][5] = 1;
        var5[9][7] = 1;
        var5[9][6] = 1;
        var5[8][10] = 1;
        var5[8][8] = 1;
        var5[8][11] = 1;
        var5[8][9] = 1;
        var5[9][10] = 1;
        var5[10][7] = 1;
        var5[9][8] = 1;
        var5[9][9] = 1;
        var5[10][8] = 1;
        var5[10][9] = 1;
        var5[11][8] = 1;
        return var2;
    }

    FishRainEvent(PacketBuffer param0) {
        super(param0);
        int var3 = 0;
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.moveId = param0.readUnsignedShort((byte) 84);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (0 <= var2_int) {
              this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
              continue;
            }
            break;
          }
          this.field_q = param0.readUnsignedByte(16711935);
          this.field_s = param0.readUnsignedByte(16711935);
          this.field_t = new int[6][2];
          for (var3 = 0; var3 < 6; var3++) {
            this.field_t[var3] = new int[]{param0.readUnsignedByte(16711935), param0.readUnsignedByte(16711935)};
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("tba.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_r = "You cannot delete this creature:";
        field_u = 0;
    }
}
