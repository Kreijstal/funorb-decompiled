/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uj {
    static int field_d;
    static String field_a;
    static String field_e;
    static String field_b;
    static cn field_c;

    final static int a(Random param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (qh.a(param2, 245)) {
            stackIn_7_0 = (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> 32);
            return stackIn_7_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param2);
          if (param1 != 37) {
            field_c = (cn) null;
          }
          do {
            var4 = param0.nextInt();
          } while (var3_int <= var4);
          stackIn_12_0 = cc.a(param2, var4, (byte) -122);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("uj.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder var13 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = DungeonAssault.field_K;
        int var3Lifetime1;
        long var4Lifetime1;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        if (param1 == -1) {
          var3 = 0;
          var4 = param0;
          while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
          }
          var13 = new StringBuilder(var3);
          while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = ak.field_j[(int)(-(param0 * 37L) + var7)];
            if (var9 == 95) {
              var10 = -1 + var13.length();
              var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var13.append((char) var9);
          }
          var13.reverse();
          var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
          return var13.toString();
        }
        field_d = -60;
        var3Lifetime1 = 0;
        var4Lifetime1 = param0;
        while (var4Lifetime1 != 0L) {
          var4Lifetime1 = var4Lifetime1 / 37L;
          var3Lifetime1++;
        }
        StringBuilder var12 = new StringBuilder(var3Lifetime1);
        while (0L != param0) {
          var7Lifetime1 = param0;
          param0 = param0 / 37L;
          var9Lifetime1 = ak.field_j[(int)(-(param0 * 37L) + var7Lifetime1)];
          if (var9Lifetime1 == 95) {
            var10Lifetime1 = -1 + var12.length();
            var12.setCharAt(var10Lifetime1, Character.toUpperCase(var12.charAt(var10Lifetime1)));
            var9Lifetime1 = 160;
          }
          discarded$1 = var12.append((char) var9Lifetime1);
        }
        var12.reverse();
        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
        return var12.toString();
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 == 37) {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
        uj.a(103L, 16);
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static void a(en param0, int param1) {
        try {
          rb.field_O = param0;
          if (param1 != 95) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "uj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Renown";
        field_a = "Please check if address is correct";
        field_b = "When entering a monster room, you can choose for your raider to Charge (increases Attack, decreases Defence), Advance (which leaves stats unchanged) or Flee (attempt to retreat from the room without engaging in combat). When combat begins, the raider's Sneak level is rolled against the monster's Detect level to determine who attacks first. In each round of combat, the attacker's Attack level is rolled against the defender's Defence level - if the attacker wins, the defender is defeated, otherwise, if the defender wins, they get a turn to attack. Fleeing works in much the same way, but instead of attacking each round, the raider rolls Dodge against the room's Snare - if successful, the raider escapes.";
    }
}
