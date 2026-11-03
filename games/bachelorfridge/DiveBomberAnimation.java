/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DiveBomberAnimation extends EventAnimation {
    static String[] field_y;
    static int field_x;
    private DiveBomberEvent field_v;
    static PalettedBitmapFont field_w;

    final static Sprite[] a(Sprite[] param0, int param1) {
        int var3 = 0;
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        Sprite[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2 = new Sprite[param0.length];
          var4 = 76 / ((-25 - param1) / 32);
          for (var3 = 0; var3 < param0.length; var3++) {
            if (null != param0[var3]) {
              var2[var3] = new Sprite(param0[var3].field_n, param0[var3].field_o);
              var2[var3].b();
              da.a(0, 0, -110, param0[var3]);
            }
          }
          hga.field_U.a((byte) 119);
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("kla.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(byte param0) {
        al.a(109, this.field_v.moveId);
        BattleCreature var2 = this.field_v.creature.a(36, this.screen.field_h);
        if (param0 != -60) {
          return;
        }
        this.field_v.d((byte) 27);
        gv var3 = new gv(this.screen, var2.tileX, var2.tileY);
        ((TileEffect) ((Object) var3)).a(0);
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (ona.c(param0, 34)) {
            stackIn_6_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> 32);
            return stackIn_6_0;
          }
          var3_int = -(int)(4294967296L % (long)param0) + param2;
          do {
            var4 = param1.nextInt();
          } while (var3_int <= var4);
          stackIn_10_0 = ZombiesSpecial.a(param0, 1816304479, var4);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kla.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static hh e(int param0) {
        if (param0 <= 44) {
          field_x = 70;
        }
        String var1 = waa.a(true);
        if (var1 != null &&
          !(var1.indexOf('@') < 0)) {
          var1 = "";
        }
        return new hh(waa.a(true), SleepAnimation.e(1071140296));
    }

    final static void b(boolean param0) {
        if (!o.d((byte) 54) &&
          bf.field_h[CreatureType.field_n] != null) {
          bf.field_h[CreatureType.field_n].a((byte) 106);
        }
        if (!param0) {
          field_x = 109;
        }
        if (null != mn.field_l &&
          ua.field_b) {
          mn.field_l.a((byte) 19);
        }
        if (!o.d((byte) 81)) {
          if (!bf.field_h[CreatureType.field_n].field_i) {
            ImageProducerRasterBuffer.field_h.a((byte) 19);
          }
          if (bf.field_h[CreatureType.field_n] != null) {
            bf.field_h[CreatureType.field_n].a((byte) 113);
          }
        }
    }

    private final void g(byte param0) {
        if (param0 != 23) {
          this.field_v = (DiveBomberEvent) null;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 63) {
          return;
        }
        field_w = null;
        field_y = null;
    }

    final static String f(int param0) {
        if (!(SuperSpeedAllEvent.field_r >= 2)) {
          return dc.field_m;
        }
        if (null != lh.field_s) {
          if (!lh.field_s.a(0)) {
            return OneAnimation.field_G;
          }
          return rj.field_q;
        }
        if (!bv.field_B.a(param0 ^ param0)) {
          return TileEffect.field_a;
        }
        if (!bv.field_B.a("commonui", 20637)) {
          return iea.field_b + " - " + bv.field_B.a(0, "commonui") + "%";
        }
        if (!fi.field_n.a(param0 + 10284)) {
          return is.field_d;
        }
        if (!fi.field_n.a("commonui", 20637)) {
          return jh.field_m + " - " + fi.field_n.a(0, "commonui") + "%";
        }
        if (!em.field_T.a(0)) {
          return AirstrikeSpecial.field_p;
        }
        if (!em.field_T.b((byte) 110)) {
          return SetFriendlyEffect.field_i + " - " + em.field_T.a(true) + "%";
        }
        return fo.field_b;
    }

    final boolean isFinished(byte param0) {
        if (100 == this.field_l) {
          jja.a(256, -1, 11);
          this.field_l = this.field_l - 1;
        }
        int var2 = -109 / ((param0 - 71) / 47);
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            this.e((byte) -60);
            this.f((byte) 118);
          }
          if (this.field_l == 15) {
            jja.a(128, -1, 12);
          }
          if (15 <= this.field_l) {
            return false;
          }
          this.screen.field_s.a(-1907, 10 + this.field_l);
          return false;
        }
        this.g((byte) 23);
        return true;
    }

    DiveBomberAnimation(BattleScreen param0, DiveBomberEvent param1) {
        super(param0, param1);
        try {
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(byte param0) {
        CreatureActor var4 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_v.creature.a(53, this.screen.field_h);
        if (var2.isDown(127)) {
          return;
        }
        DamageEffect var3 = (DamageEffect) (this.field_v.effects.b((byte) 90));
        if (param0 <= 110) {
          return;
        }
        al.a(89, this.field_v.moveId);
        while (var3 != null) {
          var4 = var3.target.a(-27449, this.screen);
          var4.b(-1, 6);
          var3.apply(var2, this.screen.field_h, 12);
          this.addChild(27799, new DamagePopupAnimation(this.screen, var4, 40));
          var3 = (DamageEffect) (this.field_v.effects.c(0));
        }
    }

    static {
        field_y = new String[]{"Create one creature of every base food type", "Fill all of your ice tray slots", "Win a game with only bakery-based creatures", "Win a game in 10 turns or less", "Win a game with only meat-based creatures", "Win a game with only dairy-based creatures", "Win a game with only fruit and vegetable-based creatures", "Win a game with only non-food based creatures", "Fill your basket up in one shopping trip", "Win a game with only ready meal-based creatures", "Win a game with only drinks-based creatures", "Win a game with only fish-based creatures", "Chain-feed a creature four food items, without it getting interrupted or another creature stealing any food", "Have a Colonel Chuck, a Rashermon, a Fartilator, a Porcinator and The Grey Earl all wandering around your fridge at the same time", "Get healed by a creature on another team", "Win any game on the Dessert board", "Win any game on the Pizza board", "Lose your entire team to the Curry board's random explosions", "Kill three or more creatures in one action", "Win any game on the Curry board", "Win by killing everybody else's creatures in a 3 or 4-player match", "Win with only one creature left alive", "Win a Capture the Fly match", "Win an Annihilation match", "Win a Take the Grub match", "Win a Capture the Fly match without ever having your fly taken", "Win an Annihilation match without losing a single creature", "Win a Take the Grub match by taking every single control point", "Win on every single board type", "Win on every single game type", "Do 10,000 points of damage", "Do 5,000 points of damage", "Do 1,000 points of damage", "Heal 1,000 points of damage", "Heal 500 points of damage", "Use 40 different special moves", "Use every creature type in battle", "Have every food type eaten at least once", "Shove 200 creatures into pits", "Use any special move a total of 100 times", "Collect 500 flies", "Collect 1000 flies", "Take 500 capture points", "Take 1,000 capture points", "Levitate a Rashermon or a Porcinator", "Split three times in one game", "Inflict 100 status changes", "Inflict 20 different status changes", "Kill a Vindaloony with a Yeastiboi", "Beat a JMod, or a player who has beaten a JMod"};
    }
}
