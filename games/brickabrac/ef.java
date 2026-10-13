/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ef extends IOException {
    static String field_f;
    static RgbSprite[] field_b;
    static oe[] field_a;
    static RgbSprite[] field_e;
    static int[] keyEventCodes;
    static String field_c;

    final static void a(int param0, int param1) {
        BitPacketBuffer var2 = null;
        if (param0 == -22809) {
          var2 = k.field_h;
          var2.writeCipheredOpcode(-13413, param1);
          var2.writeByte(-5, 1);
          var2.writeByte(param0 ^ 22903, 1);
          return;
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 10) {
          return;
        }
        keyEventCodes = null;
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    ef(String param0) {
        super(param0);
    }

    final static void a(RgbSprite param0, RgbSprite param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, int param9, RgbSprite param10) {
        param0.drawAt((-param0.canvasWidth + param9) / 2 + (param2 + (param4 * 5 >> 16)), param5);
        param1.drawTransparent((10 * param4 >> 16) + (param2 - (-((-param1.canvasWidth + param9) / 2) - 10 / param8)), -(22 / param8) + param5 + (param6 + 480 - param1.canvasHeight));
        if (param3) {
          return;
        }
        try {
          param10.drawTransparent((-param10.canvasWidth + param9) / 2 + param2 + ((20 * param4 >> 16) + 10 / param8), 480 + (param5 + param6 - param10.canvasHeight));
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ef.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int var1 = hj.field_Yb * hj.field_Yb;
        int var2 = -(hc.field_f * hc.field_f) + var1;
        int var3Lifetime1;
        if (param0 < -27) {
          var3 = (-rn.field_h + ej.field_O) * var2 / var1 + rn.field_h;
          DualLinkDeque.field_d.a(120, var3, qh.field_f, 640, (byte) 64);
          fj.a(kn.field_z, 5, ej.field_O - 24, 640, om.field_oc, 0, (byte) 94);
          return;
        }
        keyEventCodes = (int[]) null;
        var3Lifetime1 = (-rn.field_h + ej.field_O) * var2 / var1 + rn.field_h;
        DualLinkDeque.field_d.a(120, var3Lifetime1, qh.field_f, 640, (byte) 64);
        fj.a(kn.field_z, 5, ej.field_O - 24, 640, om.field_oc, 0, (byte) 94);
    }

    final static void a(String param0, int param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -106) {
            var6 = (String[]) null;
            ef.a((String) null, 72, 40, (String[]) null);
          }
          ka.field_l = up.field_v;
          if (param2 != 255) {
            if (param2 < 100) {
              he.field_H = i.a(param2, -60, param0);
              return;
            }
            if (param2 > 105) {
              he.field_H = i.a(param2, -60, param0);
              return;
            }
            var8 = param3;
            md.a(var8, true);
            he.field_H = lm.a(param1 ^ 2167, param3);
            return;
          }
          stackIn_6_0 = true;
          stackIn_7_1 = !(Paddle.field_x >= 13);
          he.field_H = cd.a(stackIn_6_0, stackIn_7_1);
          var7 = (String[]) null;
          md.a((String[]) null, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ef.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_a = new oe[29];
        keyEventCodes = new int[128];
        field_c = "1-UP: an extra life.";
        field_f = "No players";
    }
}
