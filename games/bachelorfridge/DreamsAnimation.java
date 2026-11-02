/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DreamsAnimation extends EventAnimation {
    static String field_y;
    static String field_z;
    static String field_v;
    static int field_x;
    private DreamsEvent field_w;
    static int field_A;
    static String[] field_B;

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          int var2 = 89 % ((param0 - 71) / 47);
          this.f(99);
          return true;
        }
        if (this.field_l != 25) {
          return false;
        }
        jja.a(256, -1, 52);
        this.e(44);
        return false;
    }

    public static void d(int param0) {
        field_y = null;
        field_z = null;
        field_B = null;
        field_v = null;
        if (param0 != -13837) {
          String var2 = (String) null;
          DreamsAnimation.b(-16, (String) null);
        }
    }

    private final void e(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        if (param0 != 44) {
          return;
        }
        BattleCreature var2 = this.field_w.creature.a(76, this.screen.field_h);
        if (var2.isDown(69)) {
          return;
        }
        DamageEffect var3 = (DamageEffect) (this.field_w.effects.b((byte) 90));
        al.a(107, this.field_w.moveId);
        while (var3 != null) {
          var3.a(var2, this.screen.field_h, 12);
          var4 = var3.target.a(-27449, this.screen);
          var4.b(-1, 18);
          var4.a(24831, 110, kna.field_g[44]);
          var3 = (DamageEffect) (this.field_w.effects.c(param0 ^ 44));
        }
    }

    final static void b(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = mk.field_p;
          var3 = gd.field_m;
          var4 = qs.field_m.field_jb.b(param1, 500);
          var5 = 6 + qs.field_m.field_jb.c(param1, 500);
          var6 = 2 + rg.field_h * var4;
          var7 = ResetAnimation.a(12, var5, var2_int, -21264);
          if (param0 != -25942) {
            DreamsAnimation.d(20);
          }
          var8 = nga.a(var6, var3, (byte) 126, 20);
          SoftwareRasterizer.drawRectangle(var7, var8, var5, var6, 0);
          SoftwareRasterizer.fillRectangle(1 + var7, 1 + var8, var5 - 2, var6 - 2, 16777088);
          qs.field_m.field_jb.drawParagraph(param1, 3 + var7, -qs.field_m.field_jb.field_u + (MoveEvent.field_r + 1 + var8), 500, 1000, 0, -1, 0, 0, rg.field_h);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "gp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    DreamsAnimation(gj param0, DreamsEvent param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "gp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f(int param0) {
        int var2 = -38 % ((-11 - param0) / 52);
    }

    final static void a(boolean param0, int param1) {
        if (it.field_l == null) {
          it.field_l = new int[param1];
        } else {
          if (it.field_l.length < param1) {
            it.field_l = new int[param1];
          }
        }
        if (param0) {
          return;
        }
        field_v = (String) null;
    }

    static {
        field_z = "Players";
        field_y = "Please enter your date of birth to enable chat:";
        field_B = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_v = "Player Name: ";
    }
}
