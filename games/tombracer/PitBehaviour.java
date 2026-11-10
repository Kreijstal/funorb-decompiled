/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PitBehaviour extends Behaviour {
    private int field_n;
    private int field_q;
    private boolean field_s;
    private int field_u;
    private MazeGrid field_t;
    private int field_o;
    private boolean field_r;
    private boolean field_p;

    final static jea b(int param0) {
        if (param0 > -31) {
          PitBehaviour.b(47);
        }
        return dn.field_b.field_tb;
    }

    final int hashState(int param0, int param1) {
        if (param1 > -48) {
          return -114;
        }
        return param0;
    }

    final void a(int param0, boolean param1) {
        if (param0 != 16) {
          this.hashState(-128, 105);
        }
        this.field_p = param1 ? true : false;
    }

    final void tick(int param0) {
        if (param0 != 5418) {
          this.getTypeId(true);
        }
    }

    final void a(Collidable param0, byte param1, WorldBody param2, int param3) {
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Room var7_ref_la = null;
        int var8 = 0;
        TileGrid var8_ref_tqa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var17 = 0;
        Object var18 = null;
        Player var19 = null;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var18 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          super.a(param0, (byte) 54, param2, param3);
          if (param3 != 1) {
            return;
          }
          if (param2 instanceof Player) {
            var5_int = param2.getX(3);
            var6 = param2.getY(9648);
            var7_ref_la = this.getRoom(true);
            var8_ref_tqa = var7_ref_la.getTileGrid((byte) 93);
            var9 = var8_ref_tqa.a(var5_int, false);
            var10 = var8_ref_tqa.a(var6, false);
            var11 = var6 % this.field_u;
            var12 = var5_int % this.field_u;
            var13 = this.field_u / 2;
            if (var11 > var13 &&
              !var8_ref_tqa.a(79, var9, 1 + var10).a(-111, new int[]{1, 0})) {
              return;
            }
            if (var11 < var13 &&
              !var8_ref_tqa.a(74, var9, var10 - 1).a(-126, new int[]{1, 0})) {
              return;
            }
            if (var12 < var13 &&
              !var8_ref_tqa.a(-108, var9 - 1, var10).a(-117, new int[]{1, 0})) {
              return;
            }
            if (var12 > var13 &&
              !var8_ref_tqa.a(-112, var9 + 1, var10).a(-111, new int[]{1, 0})) {
              return;
            }
            var19 = (Player) (param2);
            if (this.field_s) {
              var19.a(10, (byte) -19);
            } else {
              if (this.field_p) {
                var19.kill(4, (byte) -18, 6);
              } else {
                var19.kill(4, (byte) 102, 5);
              }
            }
            return;
          }
          if (this.field_n == 0) {
            return;
          }
          var5_intLifetime1 = param2.getX(3);
          var6Lifetime1 = param2.getY(9648);
          var7 = param2.getWidth(-93);
          var8 = param2.getHeight((byte) 55);
          var9Lifetime1 = var5_intLifetime1 - var7 / 2 - this.trap.r((byte) -95) - this.field_o;
          var10Lifetime1 = var6Lifetime1 - var8 / 2 + (-this.trap.getTop(2) - this.field_q);
          var11Lifetime1 = var9Lifetime1 + (var7 - 1);
          var12Lifetime1 = var10Lifetime1 + var8 - 1;
          var9Lifetime1 = var9Lifetime1 / this.field_u;
          var11Lifetime1 = var11Lifetime1 / this.field_u;
          var12Lifetime1 = var12Lifetime1 / this.field_u;
          var10Lifetime1 = var10Lifetime1 / this.field_u;
          if (param1 <= 18) {
            return;
          }
          var13Lifetime1 = param2.getWeight(-124);
          for (var15 = var9Lifetime1; var11Lifetime1 >= var15; var15++) {
            for (var16 = var10Lifetime1; var16 <= var12Lifetime1; var16++) {
              if (this.field_t.isInBounds(var15, var16, (byte) -128)) {
                var14 = this.field_t.getCell((byte) -5, var16, var15);
                if (-1 != var14) {
                  if (this.field_r) {
                    var14 = var14 + var13Lifetime1;
                    if (var14 >= this.field_n) {
                      var14 = -1;
                    }
                    this.field_t.setCell(var16, var14, 0, var15);
                  } else {
                    if (this.field_n <= var13Lifetime1 &&
                      this.field_n >= 0) {
                      this.field_t.setCell(var16, -1, 0, var15);
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_55_0 = var5;
          stackIn_55_1 = new StringBuilder().append("mo.SB(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param3).append(')').toString());
        }
    }

    PitBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_u = PasswordValidator.field_l;
        this.field_n = 0;
        this.field_p = false;
        this.field_s = false;
        this.field_r = false;
        try {
          this.field_u = PasswordValidator.field_l;
          this.c(0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
          super.attachToTrap(param0, param1);
          this.trap.b((byte) -102, 4);
          this.trap.a(true, (byte) -25, 0);
          this.trap.a((byte) -114, true, 1);
          this.trap.setFloating((byte) 17, param0);
          var3_int = this.trap.getWidth(-56) / this.field_u;
          var4 = this.trap.getHeight((byte) 55) / this.field_u;
          this.field_t = new MazeGrid(var3_int, var4, 0);
          this.field_o = (this.trap.getWidth(-92) - this.field_t.width * this.field_u) / 2;
          this.field_q = (this.trap.getHeight((byte) 55) - this.field_t.height * this.field_u) / 2;
          this.trap.getRoom((byte) -93).a(1, -1, this.trap.getX(3), this.trap.getY(9648), this.trap.getWidth(-27), this.trap.getHeight((byte) 55), 123);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mo.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var14 = 0;
        int var15 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var16;
        var16 = TombRacer.field_G ? 1 : 0;
        if (0 != param3) {
          return 0;
        }
        if (!io.centredBoxesOverlap(this.field_u * this.field_t.width, param2, (byte) -115, this.field_u * this.field_t.height, param5, this.trap.getY(9648), param1, param0, this.trap.getX(3))) {
          return 0;
        }
        var7 = 0;
        var8 = this.trap.r((byte) -95) + this.field_o;
        if (param4 < 79) {
          this.getTypeId(false);
        }
        var9 = this.trap.getTop(2) + this.field_q;
        var10 = -(param0 / 2) - (var8 - param5);
        var11 = param2 - param1 / 2 - var9;
        var12 = -1 + (param0 + var10);
        var13 = var11 - (-param1 + 1);
        var10 = var10 / this.field_u;
        var11 = var11 / this.field_u;
        var13 = var13 / this.field_u;
        var12 = var12 / this.field_u;
        for (var14 = var10; var12 >= var14; var14++) {
          for (var15 = var11; var15 <= var13; var15++) {
            if (this.field_t.isInBounds(var14, var15, (byte) -128) &&
              this.field_t.getCell((byte) -5, var15, var14) != -1) {
              var7 = var7 + S2CRoundDeadlinePacket.a(param1, param5, var15 * this.field_u + (this.field_u / 2 + var9), param2, this.field_u, (byte) 75, param0, this.field_u, 16, var8 - (-(this.field_u / 2) - this.field_u * var14));
            }
          }
        }
        return var7;
    }

    PitBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_4_1 = false;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = PasswordValidator.field_l;
        this.field_n = 0;
        this.field_p = false;
        this.field_s = false;
        this.field_r = false;
        try {
          this.field_n = param1.readBits((byte) 44, 8);
          stackIn_4_1 = (1 == param1.readBits((byte) 44, 1));
          this.field_r = stackIn_4_1;
          if (param0.formatVersion < 4) {
            this.field_u = PasswordValidator.field_l;
          } else {
            this.field_u = param1.readBits((byte) 44, 10) << 16;
          }
          if (param0.formatVersion >= 11) {
            stackIn_12_1 = (param1.readBits((byte) 44, 1) == 1);
            this.field_s = stackIn_12_1;
            this.c(0);
          } else {
            this.c(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("mo.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.field_t = (MazeGrid) null;
        }
        return 8;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 71, this.field_n, 8);
          param1.writeBits((byte) 34, this.field_r ? 1 : 0, 1);
          param1.writeBits((byte) 69, this.field_u >> 16, 10);
          param1.writeBits((byte) -128, !this.field_s ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mo.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
          this.field_t = (MazeGrid) null;
        }
        if (this.field_s) {
          this.field_n = 0;
        }
        if (!(dsa.field_b <= this.field_u)) {
          this.field_u = dsa.field_b;
        }
    }

    static {
    }
}
