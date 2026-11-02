/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpiltMilkSpecial extends SpecialOrder {
    static du field_p;

    final static void c(byte param0) {
        sja.field_fb.writeCipheredByte(95, (byte) 104);
        if (param0 != -69) {
          uha var2 = (uha) null;
          SpiltMilkSpecial.a((uha) null, -126);
        }
    }

    public static void d(byte param0) {
        if (param0 != 45) {
          return;
        }
        field_p = null;
    }

    final CreatureEvent a(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        SpiltMilkEvent var4 = null;
        CreatureEvent stackIn_2_0 = null;
        SpiltMilkEvent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            stackIn_2_0 = (CreatureEvent) null;
            return stackIn_2_0;
          }
          var3 = this.creature.a(118, param0);
          var4 = new SpiltMilkEvent(this.moveId, new CreatureRef(var3));
          var4.effects.a(new DamageEffect(new CreatureRef(var3), false, 1, 0, 43), true);
          stackIn_4_0 = var4;
          return (CreatureEvent) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("h.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(uha param0, int param1) {
        uha var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          param0.unlink(false);
          if (param1 != 0) {
            return;
          }
          var2 = (uha) (uma.field_M.b((byte) 90));
          while (var2 != null) {
            if (var2.a(param1 ^ -7, param0)) {
              var2 = (uha) (uma.field_M.c(0));
              continue;
            }
            break;
          }
          if (var2 == null) {
            uma.field_M.a(param0, true);
            return;
          }
          stackIn_10_0 = 106;
          RageAnimation.$cfr$intArgs$a$94cfdbf41ae0(stackIn_10_0, var2, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("h.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    SpiltMilkSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    final static boolean a(int param0, boolean param1, ue param2, int param3, String param4, String param5, String param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        tea var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tn.field_a != ola.field_p) {
            return false;
          }
          var9 = new tea(gja.field_m, param2);
          var8 = -49 / ((-8 - param3) / 56);
          gja.field_m.a((wj) (var9), (byte) 86);
          if (AttackUpAllEvent.d((byte) 77)) {
            var9.r(-7);
            return true;
          }
          ola.field_p = kq.field_j;
          pma.field_k = param1;
          sc.field_n = param5;
          ZombiesSpecial.field_p = null;
          wj.field_i = param4;
          em.field_V = param6;
          fga.field_f = param0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("h.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_p = new du(11, 0, 1, 2);
    }
}
