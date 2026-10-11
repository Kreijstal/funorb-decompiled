/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static int field_I;
    static int field_w;
    private IsaacRandom field_A;
    static String field_x;
    static int[] field_D;
    static SceneWidget field_H;
    static String field_y;
    private int field_F;
    static tg field_z;
    static String field_G;
    static String field_C;
    static String field_E;
    static boolean field_B;

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 + this.field_A.c(-96));
        if (param1 != -117) {
          field_y = (String) null;
        }
    }

    public static void e(boolean param0) {
        field_y = null;
        field_D = null;
        field_G = null;
        field_z = null;
        field_H = null;
        if (!param0) {
          return;
        }
        field_x = null;
        field_E = null;
        field_C = null;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (param3 < 49) {
            field_E = (String) null;
          }
          for (var5_int = 0; var5_int < param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[param0 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.field_A.c(-93));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kj.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int j(int param0) {
        gb.field_c.a(false);
        if (!ne.field_N.d((byte) 125)) {
          return qh.d((byte) -107);
        }
        if (param0 <= 9) {
          CipherPacketBuffer.j(-98);
          return 0;
        }
        return 0;
    }

    final void i(byte param0) {
        if (param0 != -3) {
          CipherPacketBuffer.j(53);
          this.position = (7 + this.field_F) / 8;
          return;
        }
        this.position = (7 + this.field_F) / 8;
    }

    final void a(int param0, int[] param1) {
        try {
          if (param0 != -1833430685) {
            field_B = true;
          }
          this.field_A = new IsaacRandom(param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "kj.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(boolean param0) {
        this.field_F = this.position * 8;
        if (param0) {
          CipherPacketBuffer.j(-27);
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = SteelSentinels.obfuscationControl;
        int var3 = this.field_F >> 3;
        int var4 = -(this.field_F & 7) + 8;
        this.field_F = this.field_F + param1;
        int var5 = 0;
        while (param1 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.payload[incrementValue$0] & DualNode.field_r[var4]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        int var6 = 64 % ((param0 + 27) / 36);
        if (param1 != var4) {
          var5 = var5 + (this.payload[var3] >> var4 - param1 & DualNode.field_r[param1]);
        } else {
          var5 = var5 + (this.payload[var3] & DualNode.field_r[var4]);
        }
        return var5;
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final int f(boolean param0) {
        if (param0) {
          return -93;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0] - this.field_A.c(-102);
    }

    static {
        field_w = 0;
        field_x = "Game Over";
        field_D = new int[]{107, 30, 33, 32, 26, -1, -1, -1, -1, -1};
        field_G = "Highscores";
        field_C = "This password is part of your Player Name, and would be easy to guess";
        field_y = "Sound: ";
        field_E = "Connection timed out. Please try using a different server.";
    }
}
