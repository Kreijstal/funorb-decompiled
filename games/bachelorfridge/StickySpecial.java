/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StickySpecial extends SpecialOrder {
    static boolean field_p;

    final static UiComponent c(boolean param0) {
        if (!param0) {
          StickySpecial.c(false);
        }
        return ok.f((byte) -15);
    }

    final static void a(int param0, int param1, int param2, boolean param3, PlatformTaskDispatcher param4, int param5, java.awt.Component param6, MidiPcmStream param7) {
        try {
          AudioOutput.configure(param0, param3, 10);
          BoardChangeBatch.field_l = AudioOutput.a(param4, param6, 0, param1);
          nia.field_m = AudioOutput.a(param4, param6, 1, param2);
          saa.field_a = new PcmStreamMixer();
          SauceOfFlameSpecial.field_p = 1000 * param2 / param0;
          nia.field_m.a(saa.field_a);
          uf.field_c = param7;
          uf.field_c.a(23679, bs.field_k);
          BoardChangeBatch.field_l.a(uf.field_c);
          if (param5 != 19299) {
            field_p = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "efa.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param0.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = -var3 + (var3 << 5) + aca.a(param0.charAt(var4), 8220);
          }
          if (!param1) {
            field_p = true;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("efa.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    StickySpecial(int param0, BattleCreature param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "efa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        StickyEvent var4 = null;
        CreatureEvent stackIn_2_0 = null;
        StickyEvent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(107, param0);
          var4 = new StickyEvent(this.moveId, new CreatureRef(var3));
          var4.field_q = this.field_n;
          var4.field_r = this.field_k;
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
          stackIn_7_1 = new StringBuilder().append("efa.A(");
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
