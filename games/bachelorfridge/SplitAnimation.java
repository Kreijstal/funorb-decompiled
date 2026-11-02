/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SplitAnimation extends EventAnimation {
    private SplitEvent field_y;
    static lo field_x;
    static ws field_w;
    static int field_v;

    private final void b(boolean param0) {
        if (param0) {
          this.isFinished((byte) 26);
        }
    }

    SplitAnimation(BattleScreen param0, SplitEvent param1) {
        super(param0, param1);
        try {
          this.field_y = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_y.creature.a(116, this.screen.field_h);
        if (var2.isDown(105)) {
          return;
        }
        this.screen.a(21915, this.screen.b(var2, -23990));
        EventEffect var3 = (EventEffect) (this.field_y.effects.b((byte) 90));
        al.a(88, this.field_y.moveId);
        int var4 = 96 / ((param0 + 68) / 50);
        while (var3 != null) {
          var3.apply(var2, this.screen.field_h, 12);
          var3 = (EventEffect) (this.field_y.effects.c(0));
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        if (param0) {
          field_v = -47;
          field_x = null;
          return;
        }
        field_x = null;
    }

    final boolean isFinished(byte param0) {
        if (this.field_y.field_p) {
          return true;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 > fieldTemp$0) {
          int var2 = 97 / ((param0 - 71) / 47);
          this.b(false);
          return true;
        }
        if (this.field_l == 25) {
          jja.a(256, -1, 70);
          this.d(-18);
          return false;
        }
        return false;
    }

    final static void a(int[][] param0, int param1) {
        try {
          if (param1 != -5) {
            field_x = (lo) null;
          }
          tj.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "tma.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static BattleUpdate a(PacketBuffer param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        BattleUpdate stackIn_6_0 = null;
        BattleUpdate stackIn_10_0 = null;
        BattleUpdate stackIn_14_0 = null;
        BattleUpdate stackIn_17_0 = null;
        BattleUpdate stackIn_20_0 = null;
        BattleUpdate stackIn_23_0 = null;
        BattleUpdate stackIn_26_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.readUnsignedByte(16711935);
          if (255 == var2_int) {
            return null;
          }
          if (var2_int == 2) {
            stackIn_6_0 = ih.a(param0, param1 ^ -276);
            return stackIn_6_0;
          }
          if (var2_int == 1) {
            stackIn_10_0 = ig.a(param0, 104);
            return stackIn_10_0;
          }
          if (var2_int == 4) {
            stackIn_14_0 = ba.a(param0, (byte) 119);
            return stackIn_14_0;
          }
          if (param1 != -50) {
            stackIn_17_0 = (BattleUpdate) null;
            return stackIn_17_0;
          }
          if (var2_int == 5) {
            stackIn_20_0 = rfa.a(29428, param0);
            return stackIn_20_0;
          }
          if (var2_int == 6) {
            stackIn_23_0 = SplitSpecial.a((byte) -121, param0);
            return stackIn_23_0;
          }
          if (var2_int != 7) {
            throw new IllegalStateException("Invalid move category");
          }
          stackIn_26_0 = gla.a(param0, (byte) -19);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("tma.F(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_x = new lo();
        field_w = new ws();
    }
}
