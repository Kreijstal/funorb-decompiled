/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dha {
    int field_a;
    static kf field_b;
    static String field_d;
    int field_c;

    final static int a(int param0, byte param1, String param2, boolean param3, String param4, int param5, String param6) {
        hh var7 = null;
        RuntimeException var7_ref = null;
        hh var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new hh(param2);
          var8 = new hh(param4);
          if (param1 == 53) {
            stackIn_4_0 = DamageEffect.a(-15, param5, param0, var7, param6, param3, var8);
            return stackIn_4_0;
          }
          stackIn_2_0 = -12;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("dha.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(int param0, SpecialEvent param1, BattleScreen param2) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        EventEffect var4 = null;
        CreatureActor var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          var3 = param1.creature.a(60, param2.field_h);
          if (var3.isDown(-69)) {
            return false;
          }
          param1.creature.a(-27449, param2);
          if (param0 > -87) {
            return true;
          }
          var4 = (EventEffect) (param1.effects.b((byte) 90));
          while (var4 != null) {
            var5 = var4.target.a(-27449, param2);
            var5.b(-1, 6);
            var4.apply(var3, param2.field_h, 12);
            var4 = (EventEffect) (param1.effects.c(0));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("dha.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var3 = 51 % ((param0 + 73) / 34);
        String var2 = TextInputWidget.field_E[param1][16];
        var2 = var2.trim();
        var2 = var2.toLowerCase();
        if (!var2.equals("")) {
          return ((ji) (InsanoSauceAnimation.field_x.a(true, (long)var2.hashCode()))).field_h;
        }
        return -1;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (!param0) {
          dha.a((byte) 25, 125);
        }
    }

    final static void a(IntrusiveDeque param0, int param1, Random param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        rea var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          var4_int = 64 / ((param3 + 22) / 47);
          var5 = (rea) (param0.b((byte) 90));
          while (var5 != null) {
            fieldTemp$0 = var5.field_n + var5.field_h;
            var5.field_n = var5.field_n + var5.field_h;
            if (0 > fieldTemp$0) {
              var5.unlink(false);
            } else {
              var5.field_l = var5.field_l + var5.field_o;
              DiveBomberAnimation.a(50, param2, -2147483648);
            }
            var5 = (rea) (param0.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("dha.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    dha(int param0, int param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    static {
        field_d = "Private";
        field_b = new kf();
    }
}
