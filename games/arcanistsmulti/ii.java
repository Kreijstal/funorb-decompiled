/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii implements WidgetPainter {
    static boolean field_f;
    static SceneWidget field_b;
    static Sprite field_d;
    static int field_c;
    static int field_a;
    static String field_e;

    public final void a(UiComponent param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var6_int = param2 + param0.field_n;
          if (param1 != 5592405) {
            return;
          }
          var7 = param3 + param0.field_j;
          TextLayout.drawBevelBox(param0.field_v, var6_int, var7, param0.field_k, param1 - 5592532);
          var8 = qk.field_lb[1];
          if (param0 instanceof TextButton &&
            ((TextButton) (param0)).field_z) {
            var8.drawAdditive((-var8.field_n + param0.field_v >> 1) + 1 + var6_int, (param0.field_k - var8.field_w >> 1) + (var7 + 1), 256);
          }
          if (!param0.isFocused(param1 ^ -5594391)) {
            return;
          }
          oj.a(param1 - 5624576, var7 + 2, var6_int + 2, param0.field_k - 4, -4 + param0.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ii.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 >= -109) {
          field_c = -37;
          return lo.field_q;
        }
        return lo.field_q;
    }

    final static fk playSample(int param0, boolean param1, PcmSample param2, int param3) {
        RuntimeException var4 = null;
        fk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            ii.a((byte) 81);
          }
          stackIn_3_0 = sc.a(PcmSampleStream.createAtRatePercent(param2, param0, param3), (byte) 68);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ii.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var1_int = 53 / ((26 - param0) / 49);
          while (ib.b(false)) {
            if (IntrusiveDeque.field_d == 16) {
              MusicCrossfadeStream.a(65, (byte) -84);
            }
            if (IntrusiveDeque.field_d == 17) {
              MusicCrossfadeStream.a(73, (byte) 112);
            }
            if (IntrusiveDeque.field_d == 18) {
              MusicCrossfadeStream.a(97, (byte) -93);
            }
            if (IntrusiveDeque.field_d == 19) {
              MusicCrossfadeStream.a(69, (byte) 76);
            }
            if (IntrusiveDeque.field_d == 20) {
              MusicCrossfadeStream.a(67, (byte) 89);
            }
            if (IntrusiveDeque.field_d == 21) {
              MusicCrossfadeStream.a(17, (byte) 31);
            }
            if (IntrusiveDeque.field_d == 13 &&
              (CredentialKind.field_b & 64) > 0) {
              stackIn_19_0 = 2;
              return stackIn_19_0;
            }
            vf.field_g.a((byte) -76);
            if (!vf.field_g.b(true)) {
              continue;
            }
          }
          vf.field_g.a(TextFieldValidator.a(me.field_I, EmailLoginCredentials.field_g, -123), TextFieldValidator.a(ja.field_s, pb.field_h, -74), -97);
          if (!vf.field_g.b(true)) {
          }
          var2 = 0;
          stackIn_24_0 = var2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "ii.E(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != 106) {
          field_a = 84;
        }
    }

    static {
        field_c = 0;
        field_a = field_c;
        field_e = "Loading music";
    }
}
