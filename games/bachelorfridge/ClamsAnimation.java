/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClamsAnimation extends EventAnimation {
    static String field_z;
    private taa field_v;
    static IndexedSprite field_y;
    static String field_A;
    static int field_x;
    private ClamsEvent field_w;

    private final void e(int param0) {
        int var2 = 28 % ((51 - param0) / 62);
    }

    private final void d(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_w.creature.a(56, this.screen.field_h);
        if (var2.isDown(-109)) {
          return;
        }
        EventEffect var3 = (EventEffect) (this.field_w.effects.b((byte) 90));
        if (param0 == 6) {
          al.a(param0 ^ -103, this.field_w.moveId);
          while (var3 != null) {
            var4 = var3.target.a(param0 ^ -27455, this.screen);
            var4.b(-1, 6);
            var3.a(var2, this.screen.field_h, 12);
            var3 = (EventEffect) (this.field_w.effects.c(param0 - 6));
          }
          return;
        }
    }

    private final void f(int param0) {
        int var4 = 0;
        uea discarded$0 = null;
        hd var2;
        BattleState var3;
        int var5;
        int var6;
        int var7;
        hd var8;
        var7 = BachelorFridge.field_y;
        var8 = (hd) (al.a(-79, this.field_w.moveId));
        var2 = var8;
        var3 = this.screen.field_h;
        this.field_w.creature.a(90, this.screen.field_h);
        this.field_w.c(false);
        for (var4 = param0; this.field_w.field_r.length > var4; var4++) {
          var5 = this.field_w.field_r[var4][0];
          var6 = this.field_w.field_r[var4][1];
          if (var5 >= 0 &&
            var3.width > var5 &&
            var6 >= 0 &&
            var6 < var3.height) {
            discarded$0 = new uea(this.screen, var5, var6, gma.field_e[var8.field_q].field_a);
          }
        }
        this.field_w.a(this.screen.field_h, false);
    }

    public static void g(int param0) {
        if (param0 != -1111) {
          return;
        }
        field_y = null;
        field_A = null;
        field_z = null;
    }

    final boolean c(byte param0) {
        int var2 = -119 / ((param0 - 71) / 47);
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_v.isLinked((byte) -106)) {
          return false;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$0) {
          if (this.field_l == 25) {
            this.f(0);
            this.d(6);
            return false;
          }
          return false;
        }
        this.e(118);
        return true;
    }

    final static nv a(sna param0, int[] param1, sna param2, int param3, sna param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        nv[] var8 = null;
        int var9 = 0;
        pda var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_7_0 = null;
        nv stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = BachelorFridge.field_y;
        try {
          var5_int = param1.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new nv[var5_int];
          var9 = 49;
          try {
            for (var10_int = param3; var5_int > var10_int; var10_int++) {
              var11 = cea.field_h.a(param3 ^ -22834, param1[var10_int]);
              var6[var10_int] = var11.d((byte) 80);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = null;
            return (nv) (stackIn_7_0);
          }
          stackIn_9_0 = new nv(0L, param0, param4, param2, var8, param1, var6, var14);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("lma.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    ClamsAnimation(gj param0, ClamsEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
          this.field_v = new taa(this.screen, this.field_w.field_q, this.field_w.field_t);
          this.a(27799, this.field_v);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_A = "Fly immunity!";
        field_z = "Add name";
        field_x = 0;
    }
}
