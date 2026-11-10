/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class C2SActionPacket extends IntrusiveNode implements GamePacket {
    static String[] field_k;
    static int field_j;
    private int[] orders;
    private int field_h;
    private int hash;
    private int round;
    static oc[] field_l;
    static ur field_i;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = TombRacer.field_G ? 1 : 0;
        int var1_intLifetime1;
        try {
          cq.field_a.resetTiming(108);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            EffectSwitchBehaviour.field_r[var1_int] = 0L;
          }
          if (param0 != -33) {
            OpenGlToolkit var3 = (OpenGlToolkit) null;
            C2SActionPacket.a(70, -25, (String) null, (OpenGlToolkit) null);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            bv.field_xb[var1_intLifetime1] = 0L;
          }
          ScoringObserverFactory.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ea.C(" + param0 + ')');
        }
    }

    final void setHash(int param0, int param1) {
        if (param0 != -2767) {
          return;
        }
        this.hash = param1;
    }

    final void setRound(int param0, byte param1) {
        if (param1 != -113) {
          return;
        }
        this.round = param0;
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 0) {
          field_j = -23;
        }
        field_k = null;
        field_l = null;
    }

    final void b(int param0, int param1) {
        if (param0 != 8469) {
          this.setHash(-55, 80);
        }
        this.field_h = param1;
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          param1.beginBitWrite(param0 - 192);
          param1.writeBits((byte) 90, this.round, 5);
          param1.writeBits((byte) -128, this.hash, 8);
          param1.writeBits((byte) 30, this.field_h, 8);
          for (var3_int = 0; this.orders.length > var3_int; var3_int++) {
            param1.writeBits((byte) 3, IntrusiveDequeCursor.a(-113, this.orders[var3_int]), 7);
          }
          if (param0 != 200) {
            C2SActionPacket.b(-52);
            param1.endBitWrite(-1826190686);
          } else {
            param1.endBitWrite(-1826190686);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, PacketBuffer param2, int param3, int param4) {
        try {
          param2.writeByte(12, 0);
          param2.writeShort(-1477662136, 17);
          param2.writeShort(-1477662136, param3);
          param2.writeShort(-1477662136, param4);
          int var5_int = 33 % ((-57 - param0) / 48);
          param2.writeByte(param1, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ea.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "C2SActionPacket hash:" + this.hash + " round:" + this.round;
        for (var2 = 0; this.orders.length > var2; var2++) {
          var1 = var1 + " " + this.orders[var2];
        }
        return var1;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != -16838) {
          return;
        }
        era.field_e.b(param1 ^ -16792, param0);
        ada var2 = apa.field_c;
        if (var2 != null) {
          var2.renderWithTooltip(-31, era.field_e.field_A, era.field_e.field_q);
        }
    }

    final static pva a(int param0, int param1, String param2, OpenGlToolkit param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pva stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        pva stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17) {
            stackIn_2_0 = (pva) null;
            return stackIn_2_0;
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param1, var4_int);
          jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, RenderLayer.field_b, 0);
          if (-1 != RenderLayer.field_b[0]) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            stackIn_6_0 = null;
            return (pva) (stackIn_6_0);
          }
          jaggl.OpenGL.glBindProgramARB(param1, 0);
          stackIn_8_0 = new pva(param3, param1, var4_int);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ea.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          param0.beginBitAccess((byte) 119);
          this.round = param0.readBits((byte) 44, 5);
          this.hash = param0.readBits((byte) 44, 8);
          this.field_h = param0.readBits((byte) 44, 8);
          for (var3_int = 0; this.orders.length > var3_int; var3_int++) {
            this.orders[var3_int] = DraggableWidget.a(param0.readBits((byte) 44, 7), -6487);
          }
          if (param1 != -19) {
            field_l = (oc[]) null;
            param0.endBitAccess((byte) 98);
          } else {
            param0.endBitAccess((byte) 98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ea.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        this.orders[param1] = param2;
        if (param0 != 17) {
          BitPacketBuffer var5 = (BitPacketBuffer) null;
          this.decode((BitPacketBuffer) null, (byte) 24);
        }
    }

    C2SActionPacket() {
        this.orders = new int[8];
    }

    static {
        field_j = -1;
        field_i = new ur(5);
    }
}
