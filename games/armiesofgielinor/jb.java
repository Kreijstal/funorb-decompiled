/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends IntrusiveNode {
    int field_m;
    int field_k;
    static String field_n;
    int field_s;
    static long[] field_u;
    float field_t;
    int field_o;
    int field_r;
    int field_q;
    static String field_v;
    int field_l;
    static int[] field_p;

    final static void e(int param0) {
        if (param0 != 17023) {
          field_p = (int[]) null;
        }
        if (ra.field_e != null) {
          ra.field_e.field_h = false;
        }
        ds.a(0, param0 ^ -16982);
    }

    public static void f(int param0) {
        field_p = null;
        int var1 = -70 / ((-47 - param0) / 52);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final boolean g(int param0) {
        int var2 = 75 / ((-13 - param0) / 54);
        return this.field_k != -1 ? true : false;
    }

    final int a(byte param0, AiPlanner param1) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hw var3 = null;
        RuntimeException var3_ref = null;
        mn var4 = null;
        try {
          if (this.field_s != -1) {
            if (this.field_l == -1) {
              param1.field_U.a(this.field_q, (byte) -116, this.field_s);
              if (param1.field_U.field_m <= 0 &&
                this.field_k == -1) {
                this.field_r = -2;
              }
              if (this.field_k != -1) {
                param1.field_U.field_l = -this.field_s + this.field_k;
                param1.field_U.field_j = this.field_o - this.field_q;
              }
              var4 = param1.field_U.a(param1.field_z, 103);
              if (!param1.a(var4, -125)) {
                this.field_r = -2;
              }
            } else {
              var3 = new hw(this.field_m, this.field_s, this.field_q, this.field_l);
              param1.a(var3, -124);
            }
          }
          if (param0 != 5) {
            this.field_o = 65;
          }
          stackIn_15_0 = this.field_r;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("jb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void h(int param0) {
        this.field_m = -1;
        this.field_t = 1.401298464324817e-45f;
        this.field_s = -1;
        this.field_l = -1;
        this.field_q = -1;
        this.field_r = -1;
        this.field_o = param0;
        this.field_k = -1;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          this.g(-25);
        }
        return this.field_s != -1 ? true : false;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 16150) {
            return true;
          }
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = ou.field_a;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "jb.F(" + param0 + ',' + param1 + ')');
        }
    }

    jb() {
    }

    static {
        field_u = new long[32];
        field_v = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_n = "Dragonhide armour deflects fire and acts as a barrier to heat.";
        field_p = new int[8192];
    }
}
