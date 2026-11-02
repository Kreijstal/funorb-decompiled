/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FlirtAnimation extends EventAnimation {
    private ActorAnimation field_v;
    static hk field_x;
    private FlirtEvent field_w;
    static boolean field_y;

    final static void e(int param0) {
        String var2 = null;
        if (WhirlpoolDigest.field_b != null) {
          var2 = WhirlpoolDigest.field_b;
          String var1 = var2;
          rg.a(lga.a(true, new String[]{var2}, MouseInputHandler.field_a), param0 ^ 9943);
          WhirlpoolDigest.field_b = null;
        }
        if (param0 != 9941) {
          field_y = false;
          return;
        }
    }

    final boolean isFinished(byte param0) {
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_v.isLinked((byte) -106)) {
          return false;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (75 != this.field_l) {
            return false;
          }
          jja.a(256, -1, 18);
          this.g(-1);
          return false;
        }
        int var2 = 100 % ((71 - param0) / 47);
        this.g((byte) 28);
        return true;
    }

    final static boolean d(int param0) {
        if (param0 != 11154) {
          FlirtAnimation.d(122);
          if (jv.field_j < 10) {
            return false;
          }
          if (!qo.field_c) {
            return !cia.a(0) ? true : false;
          }
          return false;
        }
        if (jv.field_j < 10) {
          return false;
        }
        if (!qo.field_c) {
          return !cia.a(0) ? true : false;
        }
        return false;
    }

    final static String f(int param0) {
        if (b.field_r) {
          if (param0 != 75) {
            field_x = (hk) null;
            return null;
          }
          return null;
        }
        if (pv.field_i > MoveEvent.field_o) {
          if (param0 != 75) {
            field_x = (hk) null;
            return null;
          }
          return null;
        }
        if (MoveEvent.field_o < pv.field_i + MoveDefinition.field_i) {
          return ov.field_g;
        }
        if (param0 != 75) {
          field_x = (hk) null;
          return null;
        }
        return null;
    }

    private final void g(byte param0) {
        if (param0 >= 7) {
          return;
        }
        FlirtAnimation.d(-7);
    }

    public static void f(byte param0) {
        field_x = null;
        if (param0 < -116) {
          return;
        }
        field_y = true;
    }

    final static void e(byte param0) {
        dj.field_c = null;
        UiComponent.field_fb = null;
        OhNoEvent.d(34);
        au.field_b = true;
        bf.field_f = false;
        sia.field_h = true;
        kaa.field_m = -3;
        if (param0 < -64) {
          ena.a((byte) -44, IterableNodeHashTable.field_a);
          gs.field_f = new saa(cha.field_l);
          aq.a(0, -1);
          jn.b(0);
          return;
        }
    }

    private final void g(int param0) {
        EventEffect var3;
        sia var5;
        int var6;
        BattleCreature var7;
        CreatureActor var8;
        var6 = BachelorFridge.field_y;
        var7 = this.field_w.creature.a(param0 ^ -113, this.screen.field_h);
        if (var7.isDown(param0 - 104)) {
          return;
        }
        var3 = (EventEffect) (this.field_w.effects.b((byte) 90));
        al.a(116, this.field_w.moveId);
        if (param0 != -1) {
          return;
        }
        while (var3 != null) {
          if (var3 instanceof SetFriendlyEffect) {
            var8 = var3.target.a(param0 ^ 27448, this.screen);
            var8.b(-1, 6);
            var5 = new sia(this.screen, var8.field_s.tileX, var8.field_s.tileY, this.field_w.creature.a(-27449, this.screen));
            ((TileEffect) ((Object) var5)).a(0);
          }
          var3.apply(var7, this.screen.field_h, 12);
          var3 = (EventEffect) (this.field_w.effects.c(0));
        }
    }

    FlirtAnimation(BattleScreen param0, FlirtEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
          al.a(105, this.field_w.moveId);
          this.field_v = new ActorAnimation(this.screen, this.field_w.field_s.a(-27449, this.screen));
          this.addChild(27799, this.field_v);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "er.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(CreatureRef param0, int param1, PacketBuffer param2) {
        if (param1 < 105) {
          return;
        }
        if (param0 == null) {
          param2.writeByte(-1, 0);
          return;
        }
        try {
          param2.writeByte(param0.field_f | param0.field_g << 5, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "er.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = new hk("usename");
    }
}
