/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Behaviour extends IntrusiveNode implements Switchable, Renderable, noa, TrapPart {
    boolean field_f;
    static String field_h;
    Trap trap;
    private SwitchableId field_j;
    boolean field_k;
    private boolean field_i;
    private SwitchableId field_l;
    private Room field_m;

    final boolean d(int param0) {
        Player var2 = null;
        Player var2Lifetime1;
        if (param0 == 8031) {
          var2 = this.getPlayer((byte) 19);
          return io.centredBoxesOverlap(var2.getWidth(-47), this.trap.getY(9648), (byte) -57, var2.getHeight((byte) 55), this.trap.getX(3), var2.getY(9648), this.trap.getHeight((byte) 55), this.trap.getWidth(param0 ^ -8057), var2.getX(3));
        }
        this.field_m = (Room) null;
        var2Lifetime1 = this.getPlayer((byte) 19);
        return io.centredBoxesOverlap(var2Lifetime1.getWidth(-47), this.trap.getY(9648), (byte) -57, var2Lifetime1.getHeight((byte) 55), this.trap.getX(3), var2Lifetime1.getY(9648), this.trap.getHeight((byte) 55), this.trap.getWidth(param0 ^ -8057), var2Lifetime1.getX(3));
    }

    int a(int param0, Projectile param1, Effect param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 25940) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          this.field_m = (Room) null;
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nv.BC(").append(param0).append(',');
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

    abstract int getTypeId(boolean param0);

    public final SwitchableId getLocalId(byte param0) {
        if (param0 != 84) {
          return (SwitchableId) null;
        }
        return this.field_l;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, Collidable param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("nv.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final SwitchableId getGlobalId(int param0) {
        if (param0 != 31974) {
          return (SwitchableId) null;
        }
        return this.field_j;
    }

    public final Trap getTrap(byte param0) {
        int var2 = 119 / ((-32 - param0) / 50);
        return this.trap;
    }

    void a(Collidable param0, byte param1, WorldBody param2, int param3) {
        try {
          if (param1 < 18) {
            this.e(-16);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    void c(boolean param0) {
        if (param0) {
          return;
        }
        this.field_i = true;
    }

    void a(int param0, ui param1, boolean param2, ui param3) {
        try {
          if (param1 != null) {
            this.field_j = param1.a(84, param2);
          }
          if (param3 != null) {
            this.field_l = param3.a(-57, false);
          }
          int var5_int = -32 / ((param0 + 58) / 57);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.KB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final Player getPlayer(byte param0) {
        if (param0 == 19) {
          return this.trap.getPlayer(param0 ^ -108);
        }
        this.trap = (Trap) null;
        return this.trap.getPlayer(param0 ^ -108);
    }

    int a(int param0, Effect param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -85) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          this.d(-76);
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nv.S(").append(param0).append(',');
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

    public void toggle(int param0) {
        int var2 = 98 % ((28 - param0) / 49);
        if (this.field_k) {
          return;
        }
        this.field_f = !this.field_f ? true : false;
    }

    public final boolean a(int param0) {
        if (param0 > -49) {
          return false;
        }
        return this.field_f;
    }

    public final SwitchableScope getScope(byte param0) {
        if (param0 <= 105) {
          this.c(false);
          return (SwitchableScope) ((Object) this.trap.getRoot(0));
        }
        return (SwitchableScope) ((Object) this.trap.getRoot(0));
    }

    Behaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        this(param0, param2);
        try {
          this.field_f = param1.readBits((byte) 44, 1) == 1 ? true : false;
          if (param0.formatVersion >= 22) {
            this.field_k = param1.readBits((byte) 44, 1) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final Room b(boolean param0) {
        if (!param0) {
          this.a(-83, 93, false);
          return this.field_m;
        }
        return this.field_m;
    }

    public final int getRenderX(byte param0) {
        int var2 = 53 % ((param0 + 23) / 53);
        return this.trap.getX(3);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 18416) {
          return;
        }
        field_h = null;
    }

    void attachToTrap(boolean param0, Trap param1) {
        try {
          if (!param0) {
            this.toggle(23);
          }
          this.trap = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 < 79) {
          field_h = (String) null;
          return 0;
        }
        return 0;
    }

    boolean a(int param0, int param1, BeamSegment param2, int param3) {
        RuntimeException var5 = null;
        Trap var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var6 = (Trap) null;
            this.attachToTrap(false, (Trap) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("nv.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    void g(int param0) {
        if (param0 != -2) {
          this.hashState(-30, -37);
        }
    }

    int a(int param0, int param1, Effect param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = 88 % ((param4 - 62) / 52);
          stackIn_1_0 = 0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("nv.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final IsaacCipher o(byte param0) {
        if (param0 != 46) {
          return (IsaacCipher) null;
        }
        return this.trap.y(1751085328);
    }

    public final boolean a(byte param0) {
        if (param0 != 87) {
          this.p((byte) -104);
          if (null != this.trap) {
            return this.field_i ? true : false;
          }
          return true;
        }
        if (null == this.trap) {
          return true;
        }
        if (!this.field_i) {
          return false;
        }
        return true;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.field_i;
    }

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          this.n((byte) 65);
          return this.trap.getY(9648);
        }
        return this.trap.getY(9648);
    }

    void encode(boolean param0, BitPacketBuffer param1) {
        try {
          param1.writeBits((byte) -127, this.getTypeId(param0), 6);
          param1.writeBits((byte) -126, !this.field_f ? 0 : 1, 1);
          param1.writeBits((byte) 112, !this.field_k ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void h(int param0) {
        if (param0 != 28701) {
          this.a(46);
        }
    }

    void b(int param0, iq param1) {
        try {
          if (param0 < 112) {
            this.n((byte) -120);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final PlayerSimulation i(int param0) {
        if (param0 != 12340) {
          return (PlayerSimulation) null;
        }
        return this.trap.getSimulation(param0 + 3130);
    }

    final Trap e(int param0) {
        if (param0 == 6) {
          return this.trap.getRoot(param0 ^ 6);
        }
        iq var3 = (iq) null;
        this.render(-63, (iq) null);
        return this.trap.getRoot(param0 ^ 6);
    }

    public final int getRenderZ(byte param0) {
        if (param0 > -86) {
          this.a((byte) -24, false);
          return this.trap.g((byte) 115);
        }
        return this.trap.g((byte) 115);
    }

    abstract int hashState(int param0, int param1);

    public final void f(int param0) {
        if (param0 != -4366) {
          Effect var3 = (Effect) null;
          this.a(18, -54, (Effect) null, 115, (byte) 119, -22);
        }
    }

    boolean p(byte param0) {
        if (param0 != 120) {
          WorldBody var3 = (WorldBody) null;
          this.a((Collidable) null, (byte) -1, (WorldBody) null, 16);
          return false;
        }
        return false;
    }

    abstract void tick(int param0);

    Switchable a(int param0, int param1, boolean param2) {
        if (param0 != 0) {
          ui var5 = (ui) null;
          this.a(-91, (ui) null, true, (ui) null);
          if (vh.matchesSwitchableId(param1, param2, -27201, (Switchable) (this))) {
            return (Switchable) (this);
          }
          return null;
        }
        if (vh.matchesSwitchableId(param1, param2, -27201, (Switchable) (this))) {
          return (Switchable) (this);
        }
        return null;
    }

    public final void render(int param0, iq param1) {
        try {
          if (param0 < 103) {
            this.getTrap((byte) -97);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        this.field_k = param1 ? true : false;
        if (param0 != -24) {
          this.field_m = (Room) null;
        }
    }

    void n(byte param0) {
        if (param0 < 68) {
          this.field_f = true;
        }
    }

    Behaviour(Room param0, boolean param1) {
        this.field_f = true;
        this.field_i = false;
        this.field_k = false;
        try {
          this.field_m = param0;
          this.a(48, param0.e(-38), param1, (ui) null);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = "ON";
    }
}
