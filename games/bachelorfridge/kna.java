/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kna extends bw {
    static String field_h;
    static String[] field_g;
    int field_f;

    public static void a(int param0) {
        if (param0 <= 33) {
          CharSequence var2 = (CharSequence) null;
          kna.a(-6, (CharSequence) null, true, 97);
        }
        field_h = null;
        field_g = null;
    }

    final static int a(int param0, CharSequence param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = BachelorFridge.field_y;
        try {
          if (2 <= param0 &&
            param0 <= 36) {
            var4_int = 0;
            if (param3 != 24808) {
              var12 = (CharSequence) null;
              kna.a(91, (CharSequence) null, false, -125);
            }
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param0) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param0;
                if (var10 / param0 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_41_0 = var6;
            return stackIn_41_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("kna.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.field_f = this.field_f + 1;
        if (!param0) {
          field_g = (String[]) null;
        }
    }

    final void c(byte param0) {
        this.field_f = this.field_f - 1;
        int var2 = 66 / ((param0 + 69) / 55);
    }

    kna(int param0, int param1) {
        this.field_f = param1;
    }

    static {
        field_g = new String[]{"Normal", "Poison", "Stun", "Protect", "Stamina down", "Speed down", "Fisticuffs down", "Flingstuff down", "Immobilise", "Disarm", "Fatigue", "Ignoring orders", "Strong poison", "Spiky", "Regen", "Knockback", "Stamina up", "Speed up", "Fisticuffs up", "Flingstuff up", "Berserk", "Double duration of effects", "Triple duration of effects", "Pull forward", "Carrying red fly", "Carrying green fly", "Carrying yellow fly", "Carrying blue fly", "Speed capped", "Sleeping", "Damage down", "Martyr", "Levitate", "Invincible", "Disabled", "Zombie", "Stuck", "Smitten", "Losing speed", "Jellied", "Fear", "Reset buffs", "Rage", "Spilling milk", "Dreaming", "Knockback 2 squares", "Knockback 3 squares", "Push aside", "Switch places", "Create poison tile", "Create regen tile", "Confuse", "Panic", "Burning", "Bagpiping"};
        field_h = "Chat is currently disabled.";
    }
}
