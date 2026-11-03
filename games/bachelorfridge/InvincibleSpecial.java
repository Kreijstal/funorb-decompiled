/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InvincibleSpecial extends SpecialOrder {
    static IndexedSprite field_p;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_p = null;
    }

    InvincibleSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final static IndexedSprite b(int param0) {
        IndexedSprite var1 = new IndexedSprite(ok.field_Bb, MassPoisonEvent.field_r, fl.field_j[0], AirstrikeAnimation.field_D[0], lq.field_A[0], InsanoSauceSpecial.field_s[0], BananarangAnimation.field_P[0], hk.field_f);
        if (param0 == -32124) {
          al.releaseStatics(-18073);
          return var1;
        }
        field_p = (IndexedSprite) null;
        al.releaseStatics(-18073);
        return var1;
    }

    final static int[] c(int param0) {
        if (o.d((byte) 80)) {
          return null;
        }
        if (!bf.field_h[CreatureType.field_n].c((byte) 95)) {
          if (bf.field_h[CreatureType.field_n].field_i) {
            return bf.field_h[CreatureType.field_n].field_c[bf.field_h[CreatureType.field_n].field_e];
          }
          if (!bf.field_h[CreatureType.field_n].field_i) {
            return bf.field_h[CreatureType.field_n].field_c[bf.field_h[CreatureType.field_n].field_a - 1];
          }
          if (param0 < 90) {
            return (int[]) null;
          }
          return null;
        }
        if (!bf.field_h[CreatureType.field_n].field_i) {
          return bf.field_h[CreatureType.field_n].field_c[bf.field_h[CreatureType.field_n].field_a - 1];
        }
        if (param0 < 90) {
          return (int[]) null;
        }
        return null;
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        InvincibleEvent var4 = null;
        CreatureEvent stackIn_2_0 = null;
        InvincibleEvent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(param1 ^ 20, param0);
          var4 = new InvincibleEvent(this.moveId, new CreatureRef(var3));
          var4.effects.a(new DamageEffect(new CreatureRef(var3), false, 1, 0, 33), true);
          if (param1 == 3) {
            stackIn_4_0 = var4;
            return (CreatureEvent) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (CreatureEvent) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("dr.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
