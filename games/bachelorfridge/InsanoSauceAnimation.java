/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InsanoSauceAnimation extends EventAnimation {
    private InsanoSauceEvent field_w;
    static IntrusiveNodeHashTable field_x;
    static int[] field_y;
    static int[] field_v;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        var13 = BachelorFridge.field_y;
        try {
          var8 = param0 - param4;
          var7_int = param4 + param6;
          for (var11 = param6; var11 < var7_int; var11++) {
            hba.a(param1, param2, tj.field_b[var11], 7, param3);
          }
          var12 = -103 % ((param5 - 16) / 45);
          for (var11Lifetime1 = param0; var8 < var11Lifetime1; var11Lifetime1--) {
            hba.a(param1, param2, tj.field_b[var11Lifetime1], 7, param3);
          }
          var10 = param3 - param4;
          var9 = param4 + param2;
          for (var11Lifetime2 = var7_int; var8 >= var11Lifetime2; var11Lifetime2++) {
            var17 = tj.field_b[var11Lifetime2];
            hba.a(param1, param2, var17, 7, var9);
            hba.a(param1, var10, var17, 7, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var7), "cma.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(boolean param0) {
        field_y = null;
        field_v = null;
        field_x = null;
        if (param0) {
          InsanoSauceAnimation.a(-88, 115, -61, 22, -9, -70, 105);
        }
    }

    private final void e(byte param0) {
        ad var5 = null;
        int var6 = BachelorFridge.field_y;
        BattleCreature var7 = this.field_w.creature.a(param0 + 9, this.screen.field_h);
        BattleCreature var2 = var7;
        if (var7.isDown(107)) {
          return;
        }
        EventEffect var3 = (EventEffect) (this.field_w.effects.b((byte) 90));
        if (param0 != 35) {
          field_v = (int[]) null;
        }
        al.a(109, this.field_w.moveId);
        int var4 = 0;
        while (var3 != null) {
          var5 = var3.target.a(-27449, this.screen);
          var5.b(-1, 6);
          if (var3 instanceof DamageEffect) {
            ((DamageEffect) (var3)).a((byte) 74, var7, this.screen.field_h, this.field_w.field_q[var4]);
          } else {
            var3.a(var7, this.screen.field_h, 12);
          }
          this.a(27799, new ek(this.screen, var5, var3.field_f));
          var4++;
          var3 = (EventEffect) (this.field_w.effects.c(0));
        }
    }

    InsanoSauceAnimation(gj param0, InsanoSauceEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "cma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0) {
        int var12 = 0;
        int var13 = 0;
        uea discarded$0 = null;
        BattleState var3;
        BattleCreature var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var14;
        int var15;
        int var16;
        Object var18;
        hd var18_ref;
        int[][] var21;
        var18 = null;
        var16 = BachelorFridge.field_y;
        var18_ref = (hd) (al.a(-88, this.field_w.moveId));
        if (param0 >= -123) {
          return;
        }
        var3 = this.screen.field_h;
        var4 = this.field_w.creature.a(102, this.screen.field_h);
        var21 = this.field_w.a(0, -19, this.screen.field_h, var4);
        var6 = this.field_w.field_r;
        var7 = this.field_w.field_s;
        var8 = 17;
        var9 = 17;
        var10 = var8 - 1 >> 1;
        var11 = var9 - 1 >> 1;
        for (var12 = 0; var12 < var8; var12++) {
          for (var13 = 0; var9 > var13; var13++) {
            if (var21[var12][var13] == 1) {
              var14 = var6 - (-var12 + var10);
              var15 = -var11 + var13 + var7;
              if (var14 >= 0 &&
                var3.width > var14 &&
                0 <= var15 &&
                var3.height > var15) {
                discarded$0 = new uea(this.screen, var14, var15, gma.field_e[var18_ref.field_q].field_a);
              }
            }
          }
        }
        return;
    }

    final boolean c(byte param0) {
        int var2 = -105 / ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            this.e(-128);
            this.e((byte) 35);
          }
          return false;
        }
        this.d(1);
        return true;
    }

    private final void d(int param0) {
        if (param0 != 1) {
          field_v = (int[]) null;
        }
    }

    static {
        field_y = new int[]{2, 3, 4};
        field_v = new int[]{11, 12, 13, 6, 5, 10, 9, 8, 0, 7, 4, 3, 2, 1};
    }
}
