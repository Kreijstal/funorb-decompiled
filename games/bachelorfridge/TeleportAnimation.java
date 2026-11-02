/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeleportAnimation extends EventAnimation {
    static Sprite field_x;
    static Sprite field_v;
    private TeleportEvent field_A;
    private boolean field_w;
    private boolean field_z;
    private boolean field_y;

    private final void h(int param0) {
        if (param0 != -11007) {
          return;
        }
        this.field_n.field_p = 0;
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        WhirlpoolDigest var5 = null;
        byte[] var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (0 < param2) {
            var8 = new byte[param0];
            var4 = var8;
            for (var5_int = 0; var5_int < param0; var5_int++) {
              var8[var5_int] = param1[var5_int + param2];
            }
          } else {
            var4 = param1;
          }
          var5 = new WhirlpoolDigest();
          var5.b(true);
          var5.a(var4, (long)(param0 * param3), 0);
          var6 = new byte[64];
          var5.a(65, 0, var6);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ln.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void g(int param0) {
        CreatureActor var4 = null;
        CreatureActor var6 = null;
        MoveCreatureEffect var5 = null;
        int var7 = BachelorFridge.field_y;
        if (param0 != 0) {
          this.g(2);
        }
        BattleCreature var8 = this.field_n.field_s;
        if (var8.isDown(-118)) {
          return;
        }
        EventEffect var3 = (EventEffect) (this.field_A.effects.b((byte) 90));
        al.a(-99, this.field_A.moveId);
        while (var3 != null) {
          var4 = var3.target.a(-27449, this.screen);
          var4.b(-1, 7);
          if (var3 instanceof MoveCreatureEffect) {
            var5 = (MoveCreatureEffect) (var3);
            var6 = var5.target.a(-27449, this.screen);
            this.screen.a(var5.field_i, var6, (byte) -106, var5.field_l);
          } else {
            var3.apply(var8, this.screen.field_h, 12);
          }
          var3 = (EventEffect) (this.field_A.effects.c(0));
        }
        this.field_y = true;
    }

    public static void releaseStatics(int param0) {
        field_v = null;
        field_x = null;
        if (param0 != 4) {
          TeleportAnimation.f(41);
        }
    }

    final static void e(int param0) {
        if (param0 > -114) {
          TeleportAnimation.e(-92);
        }
        gs.field_f.a((byte) 79);
        if (!AttackUpAllAnimation.e(-29919)) {
          sja.field_fb.writeCipheredByte(79, (byte) 103);
        }
    }

    final boolean isFinished(byte param0) {
        int var2 = 32 % ((71 - param0) / 47);
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (!this.field_y) {
          if (!this.field_z &&
            !(this.field_n.field_p <= -192)) {
            this.field_z = true;
            aba.a((byte) 62, 60);
          }
          this.field_n.field_p = this.field_n.field_p + 2;
          if (this.field_n.field_p < 0) {
            return false;
          }
          this.g(0);
          this.field_m = new ActorAnimation(this.screen, this.field_n);
          this.addChild(27799, this.field_m);
          this.field_n.field_p = 1;
          return false;
        }
        if (!this.field_w &&
          this.field_n.field_p > 48) {
          this.field_w = true;
          aba.a((byte) 18, 60);
        }
        this.field_n.field_p = this.field_n.field_p + 2;
        if (!(this.field_n.field_p >= 256)) {
          return false;
        }
        this.h(-11007);
        return true;
    }

    TeleportAnimation(BattleScreen param0, TeleportEvent param1) {
        super(param0, param1);
        try {
          this.field_n.field_p = -256;
          this.field_A = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(int param0) {
        int var1_int = 0;
        int var3 = BachelorFridge.field_y;
        try {
          fi.field_m = new IntrusiveNodeHashTable(4);
          for (var1_int = 0; SuperSpeedEvent.field_q.length > var1_int; var1_int++) {
            fi.field_m.a((long)SuperSpeedEvent.field_q[var1_int].hashCode(), (byte) 86, new ji(var1_int + 1));
          }
          int var2 = -38 % ((param0 - 43) / 46);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ln.B(" + param0 + ')');
        }
    }

    static {
    }
}
