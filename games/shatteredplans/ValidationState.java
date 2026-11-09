/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationState {
    static MusicCrossfadeStream field_b;
    static int[] field_d;
    static int[] field_c;
    static int field_a;

    public static void clearStatics(int param0) {
        field_b = null;
        if (param0 > -22) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0, boolean param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1) {
          ValidationState.clearStatics(58);
          if (GameRules.field_c == -3) {
            TextHotspotWidget.a(6493);
          } else {
            if (null != PasswordInputPainter.field_x) {
              IntrusiveDequeCursor.a(1, param0);
              return;
            }
            if (null == SecondaryNodeHashTable.field_g) {
              DraggableWidget.f((byte) -99);
              return;
            }
            IntrusiveDequeCursor.a(1, param0);
            return;
          }
          return;
        }
        if (GameRules.field_c == -3) {
          TextHotspotWidget.a(6493);
        } else {
          if (null != PasswordInputPainter.field_x) {
            IntrusiveDequeCursor.a(1, param0);
            return;
          }
          if (null == SecondaryNodeHashTable.field_g) {
            DraggableWidget.f((byte) -99);
            return;
          }
          IntrusiveDequeCursor.a(1, param0);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime1Lifetime1;
        param0 = param0 >> 4;
        param3 = param3 >> 4;
        param2 = param2 >> 4;
        param4 = param4 >> 4;
        if (param3 > param2) {
          var6 = param3;
          param3 = param2;
          param2 = var6;
          var6Lifetime2 = param0;
          param0 = param4;
          param4 = var6Lifetime2;
        }
        if (param2 < SoftwareRasterizer.field_i) {
          return;
        }
        if (param3 > SoftwareRasterizer.field_l) {
          return;
        }
        if (param4 < param0) {
          var6Lifetime1 = param3;
          param3 = param2;
          param2 = var6Lifetime1;
          var6Lifetime1Lifetime1 = param0;
          param0 = param4;
          param4 = var6Lifetime1Lifetime1;
        }
        if (param1 > -7) {
          return;
        }
        if (param4 < SoftwareRasterizer.field_a) {
          return;
        }
        if (!(SoftwareRasterizer.field_f >= param0)) {
          return;
        }
        SoftwareRasterizer.drawLine(param3, param0, param2, param4, param5);
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1_intLifetime1;
        oe.field_d.b(-1432175600);
        for (var1_int = 0; var1_int < 32; var1_int++) {
          nm.field_b[var1_int] = 0L;
        }
        for (var1_intLifetime1 = 0; 32 > var1_intLifetime1; var1_intLifetime1++) {
          fb.field_Cb[var1_intLifetime1] = 0L;
        }
        if (param0 <= 120) {
          return;
        }
        try {
          DerelictVictoryChecker.field_p = 0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "u.A(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        ProxyAuthenticationRequiredException.field_c.c(123);
        if (!TertiaryLinkNode.field_o.d(0)) {
          return IsaacRandom.b((byte) 115);
        }
        if (param0 < -28) {
          return 0;
        }
        field_a = -120;
        return 0;
    }

    static {
    }
}
