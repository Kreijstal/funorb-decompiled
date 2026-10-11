/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends wi {
    int field_L;
    int field_H;
    int field_I;
    static int field_E;
    static String[] field_M;
    int field_G;
    int field_K;
    static String field_F;
    int field_J;

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param2 + (-this.field_H + (-param5 - this.field_t));
          var9 = param4 - (this.field_G + (param1 + this.field_g));
          if (var8_int * var8_int + var9 * var9 >= this.field_J * this.field_J) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - vb.field_c;
          if (!(0.0 > var10)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_K;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_K;
          }
          this.field_L = (int)((double)this.field_K * var10 / 6.283185307179586);
          while (this.field_L >= this.field_K) {
            this.field_L = this.field_L - this.field_K;
          }
          while (this.field_L < 0) {
            this.field_L = this.field_L + this.field_K;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("s.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 != -1) {
          field_F = (String) null;
          field_M = null;
          field_F = null;
          return;
        }
        field_M = null;
        field_F = null;
    }

    final static ec j(int param0) {
        String var1 = null;
        if (param0 >= 33) {
          var1 = ls.g(-26370);
          if (var1 != null &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          return new ec(ls.g(-26370), gu.b(-20010));
        }
        return (ec) null;
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = Kickabout.field_G;
        try {
          var4_int = -1;
          for (var5 = param3; param0 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ cl.field_c[(param2[var5] ^ var4_int) & 255];
          }
          var5Lifetime1 = -114 % ((37 - param1) / 40);
          var4_int = ~var4_int;
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("s.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
          return;
        }
        np.field_Jb.a(new ek(param3, param1, param2), 3);
    }

    private s() throws Throwable {
        throw new Error();
    }

    static {
        field_M = new String[]{"<img=0>This is no-holds-barred football. Be as brutal as you like, but don't get left lying in the mud.", "<img=0>The ball cannot leave the pitch and is always in play.", "<img=0>Multiplayer games last for 4, 8, or 12 minutes. There is no half-time break.", "<img=0>All multiplayer games earn you EXP for the players used, league points and money.", "<img=0>Rated Games earn ten times the reward of Unrated Games, but you'll have to defeat your opponent 1-on-1 using your own team.", "<img=0>If a Rated Game finishes too quickly, or you've played the opponent recently, you'll only get the Unrated Game reward.", "<img=0>We recommend a PING time of under 200ms to fully enjoy Kickabout. Lag will affect gameplay; use the lag-o-meter bars in the corner of the game screen to see if there's a problem."};
        field_F = "Ok";
    }
}
