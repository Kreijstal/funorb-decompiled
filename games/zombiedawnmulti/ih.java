/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String[] field_e;
    static UiComponent field_d;
    static String field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (SocketConnector.field_h == null) {
          return;
        }
        try {
          if (null == ud.field_P) {
            ud.field_P = new Sprite(512, 512);
          }
          ud.field_P.bindAsRenderTarget();
          for (var1_int = param0; 0 < var1_int; var1_int--) {
            SoftwareRasterizer.fillCircle(256, 256, var1_int, -var1_int + 256);
          }
          SocketConnector.field_h.b((byte) 125);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ih.C(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, MusicTrack param2) {
        try {
          MenuScreen.a(param0, param1, 92, param2);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ih.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 >= 40) {
          field_b = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
        ih.a(-3);
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (cr.a((byte) -115)) {
          cn.a(param0, param5, param6, (byte) -120);
          if (pk.field_b != null) {
            if (!pk.field_b.handleMenuSelection(param3, param4, (byte) -8, param5, param0)) {
              m.a(param5, 0, param0);
              UiWidget.a(param2, param5, true);
              param5 = false;
              if (param1 != 4) {
                ih.a(29);
                return param5;
              }
              return param5;
            }
            param5 = false;
            q.b(89);
          }
          m.a(param5, 0, param0);
          UiWidget.a(param2, param5, true);
          param5 = false;
        }
        if (param1 == 4) {
          return param5;
        }
        ih.a(29);
        return param5;
    }

    final static void a(n param0, int param1, int param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = ma.field_a;
          var5.b((byte) -35, param2);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(param1 ^ 112, param1);
          if (null == param0.field_f) {
            var5.writeByte(-92, 0);
          } else {
            var5.writeByte(-33, param0.field_f.length);
            var5.writeBytes(param0.field_f, param0.field_f.length, 0, 115);
          }
          var5.f(var4, 121);
          var5.position = var5.position - 4;
          param0.field_h = var5.readInt(-1478490344);
          var5.e(41, -var4 + var5.position);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ih.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, MusicPatchNode param1, int param2) {
        CipherPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = ma.field_a;
          var6.b((byte) -35, param2);
          int var5 = -62 / ((20 - param0) / 57);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(118, 1);
          var6.writeByte(-128, param1.field_i);
          var6.writeByte(-109, param1.field_f);
          var6.writeInt(-104, param1.field_m);
          var6.writeInt(91, param1.field_l);
          var6.writeInt(43, param1.field_g);
          var6.writeInt(-99, param1.field_n);
          var6.f(var4, 117);
          var6.e(35, var6.position - var4);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ih.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = new String[]{"Win a Rated game", "Win 10 Rated games", "Win 50 Rated games", "Win 100 Rated games", "Win a game using only one kind of powerup, having a Rating of at least 1500", "Win without equipping any powerups, having a Rating of at least 2000", "Win a game having captured more humans than zombies (at least 10)", "Master the entire Zombie research tree", "Master the entire Overlord research tree", "Master the entire Planetary research tree", "Curse back a cursed zombie", "Have an enemy overlord target one of your phantoms with a powerup", "Win a game with no traits equipped, having a Rating of at least 2500", "Spread the zombie virus by defeating someone who has this Achievement, while having a Rating of at least 1337", "Lose 30 of your zombies, but still win", "Win a four-player match, having a Rating of at least 2000", "Win a game having captured a live pumpkin-head", "Kill 80 enemy zombies in one match", "Kill the enemy's last zombie", "Capture a human that was near an enemy's portal", "Zombify 10 humans using a single super-sped zombie", "Master half of all research items", "Breach an enemy's Miasma", "Win a battle on every map"};
        field_d = new UiComponent();
        field_b = "Your science will advance more from any humans you capture alive.";
        field_c = "Rematch!";
    }
}
