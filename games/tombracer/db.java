/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends IntrusiveNode implements Renderable, Collidable, WorldBody, noa, qn {
    private int field_n;
    private Room field_m;
    private int field_p;
    static IntrusiveDeque field_f;
    static mp field_h;
    static String field_j;
    static int field_l;
    private int field_r;
    private IntrusiveDeque field_k;
    private int field_g;
    private int field_q;
    static jea field_s;
    private bca field_o;
    private boolean field_i;

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
          this.getFacingAngle(25);
          return 0;
        }
        return 0;
    }

    private final void t(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        TrapModel var4 = (TrapModel) (this.field_k.first(-80));
        while (var4 != null) {
          var4.i((byte) -30);
          var4 = (TrapModel) (this.field_k.next(param0 ^ 112));
        }
        if (param0 != 0) {
          this.field_o = (bca) null;
        }
        this.field_k.clear(param0 + 8);
    }

    public final int getWidth(int param0) {
        if (param0 >= -11) {
          this.isFallingIntoPit(-31);
        }
        return this.field_g;
    }

    public final boolean a(int param0, WorldBody param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -77) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("db.OD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(uw param0, byte param1) {
        int var3_int = 0;
        TrapModel var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = -41 % ((param1 - 62) / 37);
          if (this.r(24269)) {
            param0.a(9, (Renderable) (this), (byte) -33);
          }
          var4 = (TrapModel) (this.field_k.first(-80));
          while (var4 != null) {
            var4.a(param0, 111);
            var4 = (TrapModel) (this.field_k.next(124));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("db.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int getElevation(byte param0) {
        if (param0 != 115) {
          this.getFacingAngle(-111);
          return 0;
        }
        return 0;
    }

    public final boolean a(int param0) {
        int var2 = -91 / ((param0 - 6) / 46);
        return true;
    }

    public final int getPreviousX(int param0) {
        if (param0 <= 90) {
          field_s = (jea) null;
        }
        return this.field_p;
    }

    public final void render(int param0, iq param1) {
        try {
          if (param0 < 103) {
            this.getHeight((byte) -57);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "db.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          Projectile var3 = (Projectile) null;
          this.applyProjectileEffect((Effect) null, (Projectile) null, 117);
        }
    }

    public final boolean b(boolean param0) {
        if (!param0) {
          this.field_m = (Room) null;
          return false;
        }
        return false;
    }

    public final int getPreviousY(int param0) {
        if (param0 != -21185) {
          WorldBody var3 = (WorldBody) null;
          this.a(69, (WorldBody) null);
        }
        return this.field_r;
    }

    public final int getHeight(byte param0) {
        if (param0 != 55) {
          this.getPreviousX(29);
        }
        return this.field_q;
    }

    public final boolean tryPush(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 <= 68) {
          field_h = (mp) null;
          return false;
        }
        return false;
    }

    public final boolean l(int param0) {
        TrapModel var3;
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          var3 = (TrapModel) null;
          this.a((TrapModel) null, false);
        }
        stackIn_6_0 = (this.field_m.o((byte) -82)) && (!this.b(this.field_m.i(param0 ^ 6029), 1569));
        return stackIn_6_0;
    }

    final void a(int param0, Room param1) {
        int var4 = 0;
        TrapModel var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          param1.collisionGrid.remove((Collidable) (this), (byte) 105);
          if (param0 > -74) {
            this.field_k = (IntrusiveDeque) null;
          }
          this.field_p = param1.getWidth((byte) -86) / 2 - (this.field_p - param1.getWidth((byte) -86) / 2);
          param1.collisionGrid.insert((Collidable) (this), 7073);
          var5 = (TrapModel) (this.field_k.first(-80));
          while (var5 != null) {
            var5.h(61);
            var5 = (TrapModel) (this.field_k.next(108));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("db.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final int applyProjectileEffect(Effect param0, Projectile param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < -97) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_2_0 = -79;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("db.SD(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public final boolean isExpired(int param0) {
        if (param0 != 18407) {
          this.field_n = -92;
          return false;
        }
        return false;
    }

    public final boolean interceptsBeam(int param0, WorldBody param1, int param2, BeamSegment param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_s = (jea) null;
          }
          var5_int = SimulationObserver.a(this.field_g, 12, this.field_r, this.field_q, param3, this.field_p, 2);
          if (var5_int == -1) {
            return false;
          }
          var6 = wm.a(4096, var5_int, param0 - 59);
          param3.a(var6, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("db.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final boolean overlapsBox(int param0, WorldBody param1, int param2, int param3, int param4, Collidable param5, int param6, int param7) {
        RuntimeException var9 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == param1) {
            return false;
          }
          if (4 < param7) {
            return false;
          }
          if (param2 > 55) {
            stackIn_12_0 = this.intersectsRect((byte) 110, param4, param6, param0, param3);
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_15_0 = var9;
          stackIn_15_1 = new StringBuilder().append("db.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean a(WorldBody param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          this.isFallingIntoPit(-123);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("db.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(boolean param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        TrapModel var4 = (TrapModel) (this.field_k.first(-80));
        while (var4 != null) {
          var4.e(-41);
          var4 = (TrapModel) (this.field_k.next(118));
        }
        if (!param0) {
          this.field_i = false;
        }
    }

    final void a(boolean param0, BitPacketBuffer param1) {
        TrapModel var5 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          param1.writeBits((byte) -1, this.field_p / 1048576, 7);
          param1.writeBits((byte) -8, this.field_r / 1048576, 7);
          param1.writeBits((byte) 74, this.field_g / 2097152, 6);
          param1.writeBits((byte) -7, this.field_q / 2097152, 6);
          if (!param0) {
            this.field_i = false;
          }
          if (this.field_m.formatVersion >= 9) {
            param1.writeBits((byte) -36, this.field_k.size((byte) -16), 2);
            var5 = (TrapModel) (this.field_k.first(-80));
            while (var5 != null) {
              rm.field_a.writeModel(15682, param1, var5);
              var5 = (TrapModel) (this.field_k.next(127));
            }
          }
          this.field_o.a((byte) -79, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "db.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -5 / ((1 - param0) / 45);
        return 0;
    }

    private final void n(int param0) {
        this.t(0);
        if (param0 != -8195) {
          return;
        }
        this.a(rm.field_a.a((TrapPart) null, (WorldBody) (this), -116), true);
    }

    public final int getRenderZ(byte param0) {
        if (param0 > -86) {
          field_f = (IntrusiveDeque) null;
          return 0;
        }
        return 0;
    }

    public final int applyBeamEffect(Effect param0, int param1, BeamSegment param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 12) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_2_0 = -101;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("db.ED(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        this.field_m.collisionGrid.remove((Collidable) (this), (byte) 104);
        this.field_p = this.field_p + param1;
        this.field_r = this.field_r + param1;
        var3 = -(this.field_g / 2) + this.field_p;
        var4 = -(this.field_q / 2) + this.field_r;
        if (param0 >= -122) {
          this.getRenderY((byte) 50);
        }
        var5 = this.field_g / 2 + this.field_p;
        var6 = this.field_q / 2 + this.field_r;
        if (param1 >= var4) {
          var4 = 0;
        }
        if (var3 <= param1) {
          var3 = 0;
        }
        var7 = this.field_m.getWidth((byte) -86);
        var8 = this.field_m.getHeight(34);
        if (-param1 + var7 <= var5) {
          var5 = var7;
        }
        this.field_p = (var5 - var3) / 2 + var3;
        if (var6 >= var8 - param1) {
          var6 = var8;
        }
        this.field_q = var6 - var4;
        this.field_r = (var6 - var4) / 2 + var4;
        this.field_g = -var3 + var5;
        this.field_m.collisionGrid.insert((Collidable) (this), 7073);
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_j = null;
        field_s = null;
        if (param0 >= -22) {
          return;
        }
        field_f = null;
    }

    private final boolean r(int param0) {
        if (param0 != 24269) {
          this.tryPush(58, true, 114, 87, -117, -85);
        }
        return this.field_m.o((byte) -82);
    }

    public final int getCollisionId(boolean param0) {
        if (!param0) {
          this.field_q = -83;
        }
        return 5 + 5 * this.field_n;
    }

    public final int getY(int param0) {
        if (param0 != 9648) {
          return -56;
        }
        return this.field_r;
    }

    public final int getFacingAngle(int param0) {
        if (param0 != -25787) {
          this.a(82, -58);
        }
        return 0;
    }

    public final int getRenderX(byte param0) {
        int var2 = -80 % ((param0 + 23) / 53);
        return this.field_p;
    }

    public final Room getRoom(byte param0) {
        int var2 = 110 / ((param0 - 0) / 61);
        return this.field_m;
    }

    public final boolean intersectsRect(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
          return false;
        }
        return io.centredBoxesOverlap(param4, this.getY(9648), (byte) -80, param3, this.getX(3), param1, this.field_q, this.field_g, param2);
    }

    final void s(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        TrapModel var2 = (TrapModel) (this.field_k.first(-80));
        if (param0 != 0) {
          this.field_p = 88;
        }
        while (var2 != null) {
          var2.d(-1);
          var2 = (TrapModel) (this.field_k.next(124));
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          field_h = (mp) null;
          return false;
        }
        return false;
    }

    final void a(byte param0, uw param1) {
        int var4 = 0;
        TrapModel var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.r(24269)) {
            param1.a((byte) -106, 9, (Renderable) (this));
          }
          if (param0 <= 6) {
            return;
          }
          var5 = (TrapModel) (this.field_k.first(-80));
          while (var5 != null) {
            var5.b(0, param1);
            var5 = (TrapModel) (this.field_k.next(112));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("db.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final boolean isPushable(byte param0, boolean param1) {
        if (param0 != -55) {
          TrapModel var4 = (TrapModel) null;
          this.a((TrapModel) null, true);
        }
        return false;
    }

    public final int applyAreaEffect(Effect param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          field_l = 26;
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("db.WC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean b(int param0, int param1) {
        if (param1 != 1569) {
          WorldBody var4 = (WorldBody) null;
          this.a((WorldBody) null, -24);
        }
        return this.field_o.a(param0, 14530);
    }

    final void m(int param0) {
        if (this.field_i) {
          return;
        }
        this.field_i = true;
        this.t(param0);
    }

    private final void a(TrapModel param0, boolean param1) {
        if (param0 == null) {
          return;
        }
        try {
          this.field_k.addLast((byte) -73, param0);
          if (!param1) {
            this.field_r = -69;
          }
          param0.attach((TrapPart) null, (WorldBody) (this), (byte) 36);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "db.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean isFallingIntoPit(int param0) {
        if (param0 != -1) {
          return false;
        }
        return false;
    }

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          this.field_g = -15;
        }
        return this.field_r;
    }

    public final int getX(int param0) {
        if (param0 != 3) {
          return -6;
        }
        return this.field_p;
    }

    db(Room param0, BitPacketBuffer param1) {
        int var4 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        TrapModel var5 = null;
        this.field_k = new IntrusiveDeque();
        this.field_o = new bca();
        this.field_i = false;
        try {
          this.field_m = param0;
          if (param0.formatVersion > 20) {
            this.field_p = 1048576 * param1.readBits((byte) 44, 7);
            this.field_r = param1.readBits((byte) 44, 7) * 1048576;
            this.field_g = param1.readBits((byte) 44, 6) * 2097152;
            this.field_q = param1.readBits((byte) 44, 6) * 2097152;
          } else {
            this.field_p = param1.readBits((byte) 44, 12) << 16;
            this.field_r = param1.readBits((byte) 44, 12) << 16;
            this.field_q = param1.readBits((byte) 44, 10) << 16;
            this.field_g = param1.readBits((byte) 44, 10) << 16;
          }
          if (8 < param0.formatVersion) {
            var3_int = param1.readBits((byte) 44, 2);
            for (var4 = 0; var4 < var3_int; var4++) {
              var5 = rm.field_a.readModel(param0, param1, false);
              this.a(var5, true);
            }
          } else {
            this.n(-8195);
          }
          this.field_o = new bca(param0.formatVersion, param1);
          fieldTemp$0 = fi.field_c;
          fi.field_c = fi.field_c + 1;
          this.field_n = fieldTemp$0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("db.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_f = null;
        field_j = "Unable to add friend - system busy";
        field_l = 5;
        field_h = new mp();
    }
}
