/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HazmatSpecial extends SpecialOrder {
    static MusicTrack field_p;

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -31303) {
            stackIn_4_0 = mk.a(param0, 0, -115, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 34;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wc.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 < 123) {
          HazmatSpecial.c((byte) 20);
        }
        field_p = null;
    }

    final CreatureEvent a(BattleState param0, int param1) {
        RuntimeException var3 = null;
        HazmatEvent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_p = (MusicTrack) null;
          }
          stackIn_3_0 = new HazmatEvent(this.moveId, this.creature, this.field_k, this.field_n);
          return (CreatureEvent) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wc.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    HazmatSpecial(int param0, BattleCreature param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "wc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          if (!DamageTileEffect.a(true, (byte) -85, param1)) {
            return false;
          }
          for (var2_int = param0; var2_int < param1.length(); var2_int++) {
            if (!RaiseSpecial.a(true, param1.charAt(var2_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("wc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
