/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FuseBehaviour extends Behaviour {
    static String field_t;
    private int field_s;
    private int field_r;
    private Effect field_p;
    private FlagSet field_x;
    private int field_o;
    static boolean field_w;
    static su field_v;
    private int field_n;
    private FlagSet field_q;
    private int field_u;

    final int onBeamEffect(int param0, Effect param1, BeamSegment param2) {
        RuntimeException var4 = null;
        BeamSegment var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -85) {
            var5 = (BeamSegment) null;
            this.onBeamEffect(102, (Effect) null, (BeamSegment) null);
          }
          stackIn_3_0 = this.a(param1, (byte) -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ula.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param2 < this.field_u) {
          return false;
        }
        if (param0 < 16) {
          return true;
        }
        if (this.field_x.get(0, param1)) {
          return true;
        }
        return false;
    }

    final int onProjectileEffect(int param0, Projectile param1, Effect param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25940) {
            this.getTypeId(false);
          }
          stackIn_3_0 = this.a(param2, (byte) -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ula.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int hashState(int param0, int param1) {
        if (param1 >= -48) {
          return 57;
        }
        param0 = CurveOperator.mixHash((byte) 122, param0, this.field_s);
        return param0;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          BeamSegment var3 = (BeamSegment) null;
          this.onBeamEffect(-90, (Effect) null, (BeamSegment) null);
        }
        return 31;
    }

    FuseBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_x = new FlagSet(6, param0.formatVersion, param1);
          this.field_q = new FlagSet(6, param0.formatVersion, param1);
          this.field_u = param1.readBits((byte) 44, 8);
          this.field_o = param1.readBits((byte) 44, 8);
          this.field_r = param1.readBits((byte) 44, 8);
          this.field_p = ad.a((byte) 87, param1);
          this.field_n = param1.readBits((byte) 44, 8) << 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ula.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          super.attachToTrap(param0, param1);
          param1.b((byte) -112, 4);
          if (!param0) {
            this.field_x = (FlagSet) null;
          }
          for (var3_int = 0; var3_int < 6; var3_int++) {
            if (this.field_x.get(0, var3_int) ||
              this.field_q.get(0, var3_int)) {
              param1.a(26492, true, var3_int);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ula.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 != 42) {
          field_t = (String) null;
        }
    }

    private final void j(byte param0) {
        Effect var2 = new Effect(this.getRoot(6), this.field_p);
        if (param0 != -67) {
          this.field_q = (FlagSet) null;
        }
        this.getRoom(true).a(124, this.trap.getY(param0 ^ -9715), var2, this.trap.getHeight((byte) 55) + this.field_n * 2, this.trap.getWidth(-107) + 2 * this.field_n, this.trap.getX(3));
        this.stop(false);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_x.encode(param1, (byte) -118);
          this.field_q.encode(param1, (byte) -117);
          param1.writeBits((byte) -11, this.field_u, 8);
          param1.writeBits((byte) 42, this.field_o, 8);
          param1.writeBits((byte) 125, this.field_r, 8);
          this.field_p.a(param1, (byte) 125);
          param1.writeBits((byte) 127, this.field_n >> 16, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ula.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        if (param1 < this.field_o) {
          return false;
        }
        if (!this.field_q.get(0, param2)) {
          return false;
        }
        if (!param0) {
          this.field_p = (Effect) null;
          return true;
        }
        return true;
    }

    private final int a(Effect param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -115) {
            this.field_x = (FlagSet) null;
          }
          var3_int = param0.type;
          var4 = param0.size;
          if (!this.b(8) &&
            this.a(113, var3_int, var4)) {
            if (this.field_r > 0) {
              this.field_s = this.field_r;
            } else {
              this.j((byte) -67);
            }
          }
          if (this.b(8)) {
            if (!this.a(true, var4, var3_int)) {
              return 0;
            }
            this.field_s = 0;
          }
          stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ula.V(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean k(byte param0) {
        int var1 = -55 / ((-52 - param0) / 59);
        return IntrusiveDequeCursor.field_a.loadMasterIndex(false);
    }

    final void tick(int param0) {
        int discarded$0 = 0;
        if (param0 != 5418) {
          Effect var3 = (Effect) null;
          discarded$0 = this.a((Effect) null, (byte) -1);
        }
        if (this.field_s > 0) {
          this.field_s = this.field_s - 1;
          if (this.field_s == 0) {
            this.j((byte) -67);
          }
        }
    }

    private final boolean b(int param0) {
        int discarded$0 = 0;
        if (param0 != 8) {
          Effect var3 = (Effect) null;
          discarded$0 = this.a((Effect) null, (byte) -80);
        }
        return 0 != this.field_s ? true : false;
    }

    final int onAreaEffect(int param0, int param1, Effect param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -62 / ((62 - param4) / 52);
          stackIn_1_0 = this.a(param2, (byte) -115);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ula.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_t = "One Player Puzzle";
        field_v = new su(1, 2, 2, 0);
    }
}
