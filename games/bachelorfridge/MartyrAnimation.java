/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MartyrAnimation extends EventAnimation {
    static boolean field_x;
    static String field_v;
    private MartyrEvent field_w;

    private final void d(int param0) {
        if (param0 < -60) {
          return;
        }
        FridgeCreature var3 = (FridgeCreature) null;
        MartyrAnimation.a(-28, -56, 3, (FridgeCreature) null, 27);
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 == 2) {
          return;
        }
        field_x = false;
    }

    private final void e(byte param0) {
        BattleCreature var2;
        DamageEffect var3;
        int var5;
        CreatureActor var6;
        var5 = BachelorFridge.field_y;
        var2 = this.field_w.creature.a(40, this.screen.field_h);
        if (var2.isDown(-99)) {
          return;
        }
        var3 = (DamageEffect) (this.field_w.effects.b((byte) 90));
        al.a(-48, this.field_w.moveId);
        if (param0 <= 60) {
          return;
        }
        while (var3 != null) {
          var3.apply(var2, this.screen.field_h, 12);
          var6 = var3.target.a(-27449, this.screen);
          var6.b(-1, 7);
          var6.a(24831, 41, kna.field_g[31]);
          var3 = (DamageEffect) (this.field_w.effects.c(0));
        }
    }

    MartyrAnimation(BattleScreen param0, MartyrEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, FridgeCreature param3, int param4) {
        int var5_int = 0;
        if (AttackUpAllAnimation.e(param0 - 33828)) {
          return;
        }
        try {
          sja.field_fb.writeCipheredByte(90, (byte) 126);
          sja.field_fb.position = sja.field_fb.position + 2;
          var5_int = sja.field_fb.position;
          rha.a(param3.field_g, sja.field_fb, (byte) -93);
          if (param0 != 3909) {
            field_x = true;
          }
          sja.field_fb.writeByte(param2, 0);
          sja.field_fb.writeByte(param1, 0);
          sja.field_fb.writeByte(param4, 0);
          sja.field_fb.writeLengthShort((byte) -88, -var5_int + sja.field_fb.position);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "wf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        ol.a(rt.field_a[param0], true);
        int var2 = 49 / ((83 - param1) / 43);
    }

    final boolean isFinished(byte param0) {
        int var2 = -56 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          this.d(-108);
          return true;
        }
        if (this.field_l != 25) {
          return false;
        }
        MartyrAnimation.a(34, (byte) -101);
        this.e((byte) 120);
        return false;
    }

    static {
        field_v = "Now click End Phase again and watch the attack.  <br><col=BBFF00> Next</col>";
        field_x = true;
    }
}
