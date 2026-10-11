/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends SpellAreaEffect {
    static NodeDeque field_u;
    static kl field_w;
    static String field_D;
    static int field_E;
    private int field_t;
    static je field_y;
    static sa field_z;
    private int field_C;
    private int field_G;
    static String field_A;
    static String field_v;
    private int field_B;
    static String field_F;
    static int field_s;
    static int field_x;

    final void applyEffect(int obfuscationGuard, Battlefield battlefield) {
        try {
          this.field_C = battlefield.a(bw.unitDefinitions[this.field_t][1], this.field_B, this.field_G, 0, this.field_m, bw.unitDefinitions[this.field_t][2]);
          if (obfuscationGuard != 64) {
            CharSequence var4 = (CharSequence) null;
            be.a(-2, (CharSequence) null, false);
          }
          battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(this.field_t, this.field_G, this.field_B, this.field_C, this.field_m)));
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "be.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_4_0 = pu.field_G;
            return stackIn_4_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = k.a(param1, false);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!rs.a(var4.charAt(0), (byte) -122) &&
                !rs.a(var4.charAt(-1 + var4.length()), (byte) -107)) {
                if (param0 >= -22) {
                  stackIn_22_0 = (String) null;
                  return stackIn_22_0;
                }
                var5 = 0;
                for (var6 = 0; var6 < param1.length(); var6++) {
                  var7 = param1.charAt(var6);
                  if (rs.a((char) var7, (byte) -88)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_32_0 = ul.field_o;
                    return stackIn_32_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_37_0 = kd.field_U;
                return stackIn_37_0;
              }
              stackIn_19_0 = kd.field_U;
              return stackIn_19_0;
            }
            stackIn_14_0 = pu.field_G;
            return stackIn_14_0;
          }
          stackIn_9_0 = pu.field_G;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("be.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_u = null;
        field_w = null;
        field_y = null;
        if (param0 < 61) {
          field_v = (String) null;
        }
        field_F = null;
        field_D = null;
        field_v = null;
        field_z = null;
    }

    be(int param0, int param1, int param2, int param3, int param4) {
        this.field_B = param1;
        this.field_G = param0;
        this.field_t = param2;
        this.field_m = param4;
    }

    static {
        field_D = "Please try again in a few minutes.";
        field_A = "Ongoing Mission";
        field_v = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_E = 0;
        field_z = new sa();
        field_x = 77;
        field_F = "Choose three alignments";
    }
}
