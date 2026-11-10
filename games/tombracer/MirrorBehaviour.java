/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MirrorBehaviour extends Behaviour {
    static ToolkitSprite field_r;
    private int field_p;
    private int field_n;
    private int field_v;
    private int field_t;
    private BeamSegment field_u;
    private int field_w;
    private BeamSegment field_o;
    private int field_s;
    private int field_q;

    final int getTypeId(boolean param0) {
        if (param0) {
          return -109;
        }
        return 29;
    }

    final void n(byte param0) {
        if (param0 <= 68) {
          return;
        }
        super.n((byte) 102);
        this.b(1659280738);
        this.j((byte) 1);
    }

    private final void b(int param0) {
        int var2 = this.trap.getFacingAngle(-25787);
        if (param0 != 1659280738) {
          BeamSegment var3 = (BeamSegment) null;
          this.a(65, 57, (BeamSegment) null, 85);
          var2 = GameScreen.a(2048 + var2, 8192, -34);
          if (var2 != this.field_v) {
            this.field_t = MouseInputHandler.a((byte) 99, var2 >> 2);
            this.field_p = bua.a(0, var2 >> 2);
            this.field_v = var2;
            return;
          }
          return;
        }
        var2 = GameScreen.a(2048 + var2, 8192, -34);
        if (var2 == this.field_v) {
          return;
        }
        this.field_t = MouseInputHandler.a((byte) 99, var2 >> 2);
        this.field_p = bua.a(0, var2 >> 2);
        this.field_v = var2;
    }

    final int hashState(int param0, int param1) {
        param0 = CurveOperator.mixHash((byte) 83, param0, this.field_w);
        if (param1 > -48) {
          return -43;
        }
        return param0;
    }

    private final int a(boolean param0, BeamSegment param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_s = 47;
          }
          stackIn_3_0 = ua.a(-param1.field_d + param1.field_e, -104) + ua.a(param1.field_a - param1.field_k, -109);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mc.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    MirrorBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_v = -1;
        this.field_u = new BeamSegment();
    }

    MirrorBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_v = -1;
        this.field_u = new BeamSegment();
    }

    final boolean a(int param0, int param1, BeamSegment param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            field_r = (ToolkitSprite) null;
          }
          var5_int = al.a(param2, 12, 12, this.field_u);
          if (-1 == var5_int) {
            this.field_o = null;
            return false;
          }
          var6 = wm.a(4096, var5_int, -61);
          param2.a(var6, (byte) 47);
          this.field_o = param2;
          this.field_s = this.a(true, param2);
          this.field_q = param0;
          this.field_w = var6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mc.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_r = null;
        int var1 = -15 / ((-36 - param0) / 62);
    }

    final int a(int param0, Effect param1, BeamSegment param2) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        BeamSegment var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Room var16 = null;
        try {
          if (param2 != this.field_o) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4_int = this.a(true, param2);
          if (this.field_s != var4_int) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (param2.field_b == 0) {
            stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          var5 = new BeamSegment();
          if (param0 >= -85) {
            field_r = (ToolkitSprite) null;
          }
          param2.nextSegment = var5;
          var6 = param2.field_e;
          var5.field_j = param2.field_j;
          var7 = param2.field_a;
          var5.field_i = param2.field_i;
          var8 = qva.a((byte) -99, -param2.field_k + var7, var6 - param2.field_d);
          var9 = GameScreen.a(this.field_v + 2048, 8192, -71);
          var10 = S2CRoundResultPacket.a(8192, -16390, var8, var9);
          var11 = GameScreen.a(2 * var10 + var8 + 4096, 8192, 126);
          var12 = MouseInputHandler.a((byte) 99, var11 >> 2);
          var13 = bua.a(0, var11 >> 2);
          var14 = param2.field_b - gqa.a(param2.field_b, (byte) 24, this.field_w);
          var15 = var14 >> 8;
          var5.a(var6, (var12 >> 8) * var15 + var6, var7, (var13 >> 8) * var15 + var7, 44);
          var5.field_b = var14;
          var16 = this.getRoom(true);
          var16.a(this.field_q, this.trap, -108, var5, this.getRoot(6), param1);
          stackIn_14_0 = 0;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("mc.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          super.attachToTrap(true, param1);
          param1.a(param0, 120);
          this.field_n = MidiVoiceMixer.b(param1.getHeight((byte) 55), param1.getWidth(-23), -23);
          this.b(1659280738);
          this.j((byte) 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mc.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void j(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = this.trap.getX(param0 ^ 2);
        if (param0 == 1) {
          var3 = this.trap.getY(9648);
          var4 = this.field_n >> 8;
          var5 = (this.field_t >> 8) * var4 / 2;
          var6 = var4 * (this.field_p >> 8) / 2;
          this.field_u.a(var2 - var5, var5 + var2, -var6 + var3, var6 + var3, 44);
          return;
        }
    }

    final void tick(int param0) {
        this.b(param0 ^ 1659275336);
        if (param0 == 5418) {
          this.j((byte) 1);
          return;
        }
        this.field_p = 81;
        this.j((byte) 1);
    }

    static {
    }
}
