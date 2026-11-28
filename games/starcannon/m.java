/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static BufferedSocket field_b;
    static boolean field_c;
    static int field_e;
    static ai field_d;
    static Sprite field_a;
    static re field_f;

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        if (param0 < -32) {
          field_b = null;
          field_f = null;
          return;
        }
        m.drawBenefitsButtonFrameWithIntGuard(-98, true, -18, -57);
        field_b = null;
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        int var9 = StarCannon.field_A;
        if (param6 < 16) {
          return;
        }
        if (param0 <= param2) {
          if (param2 < param5) {
            ProxySocketConnector.a(param5, param4, param3, param1, param2, param7, SoftwareRasterizer.field_a, (byte) -43, param0);
            return;
          }
          if (param5 <= param0) {
            ProxySocketConnector.a(param2, param7, param3, param4, param0, param1, SoftwareRasterizer.field_a, (byte) -43, param5);
            return;
          }
          ProxySocketConnector.a(param2, param1, param3, param4, param5, param7, SoftwareRasterizer.field_a, (byte) -43, param0);
          return;
        }
        if (param0 < param5) {
          ProxySocketConnector.a(param5, param7, param3, param1, param0, param4, SoftwareRasterizer.field_a, (byte) -43, param2);
          return;
        }
        if (param5 <= param2) {
          ProxySocketConnector.a(param0, param4, param3, param7, param2, param1, SoftwareRasterizer.field_a, (byte) -43, param5);
          return;
        }
        ProxySocketConnector.a(param0, param1, param3, param7, param5, param4, SoftwareRasterizer.field_a, (byte) -43, param2);
    }

    final static boolean a(int param0) {
        if (param0 < 0) {
          return qb.field_h > 250 ? true : false;
        }
        m.a(-56);
        return qb.field_h > 250 ? true : false;
    }

    final static void drawBenefitsButtonFrame(byte param0, boolean param1, int param2, int param3) {
        int var4;
        if (param0 != 112) {
          return;
        }
        KeyboardInput.field_c.draw(param2, param3);
        if (!param1) {
          return;
        }
        var4 = Bzip2State.field_a % KeyboardInput.field_c.field_u * 2;
        if (var4 >= KeyboardInput.field_c.field_u) {
          var4 = -var4 + (KeyboardInput.field_c.field_u + KeyboardInput.field_c.field_u);
        }
        if (var4 < 10) {
          var4 = 10;
        } else {
          if (-40 + KeyboardInput.field_c.field_u < var4) {
            var4 = KeyboardInput.field_c.field_u - 40;
          }
        }
        sc.a(KeyboardInput.field_c, param0 ^ 14352, 80, param2, 30, var4, 0, param3, 0);
        return;
    }

    static {
        field_c = false;
        field_e = 20;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void drawBenefitsButtonFrameWithIntGuard(int param0, boolean param1, int param2, int param3) {
        int var4;
        if (param0 != 112) {
          return;
        }
        KeyboardInput.field_c.draw(param2, param3);
        if (!param1) {
          return;
        }
        var4 = Bzip2State.field_a % KeyboardInput.field_c.field_u * 2;
        if (var4 >= KeyboardInput.field_c.field_u) {
          var4 = -var4 + (KeyboardInput.field_c.field_u + KeyboardInput.field_c.field_u);
        }
        if (var4 < 10) {
          var4 = 10;
        } else {
          if (-40 + KeyboardInput.field_c.field_u < var4) {
            var4 = KeyboardInput.field_c.field_u - 40;
          }
        }
        sc.a(KeyboardInput.field_c, param0 ^ 14352, 80, param2, 30, var4, 0, param3, 0);
        return;
    }
}
