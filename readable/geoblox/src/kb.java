/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int spawnReleaseIntervalTicks;
    static int field_b;
    static int field_d;
    static int[] field_a;

    final static void a(int param0, int param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          if (param1 != 6568) {
            return;
          }
          si.field_g = va.field_e;
          if (param0 != 255) {
            if (param0 < 100) {
              ScorePopup.field_g = ig.a(param3, param0, false);
              return;
            }
            if (param0 > 105) {
              ScorePopup.field_g = ig.a(param3, param0, false);
              return;
            }
            var7 = param2;
            ci.a(var7, 416577356);
            ScorePopup.field_g = ac.a(param1 - 6540, param2);
            return;
          }
          stackIn_11_0 = param1 ^ 6648;
          if (rd.field_u >= 13) {
            stackIn_12_1 = false;
          } else {
            stackIn_12_1 = true;
          }
          ScorePopup.field_g = hh.a(stackIn_11_0, stackIn_12_1);
          var6 = (String[]) null;
          ci.a((String[]) null, 416577356);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var4);
          stackIn_16_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!hl.field_G) {
            throw new IllegalStateException();
        }
        kf.field_e = true;
        TextInputValidator.a((byte) 123, true);
        hj.field_a = 0;
        if (param0 < -90) {
            return;
        }
        kb.c(-89);
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        ue.a(param0, true, (byte) -102);
    }

    final static void b(int param0) {
        int var1 = 0;
        if (null != kd.field_e) {
            kd.field_e.l(0);
            if (vg.field_i != null) {
                vg.field_i.m(23181);
                eh.a((byte) -2);
                var1 = -121 % ((-38 - param0) / 59);
                return;
            }
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
        }
        if (vg.field_i == null) {
            eh.a((byte) -2);
            var1 = -121 % ((-38 - param0) / 59);
            return;
        }
        vg.field_i.m(23181);
        eh.a((byte) -2);
        var1 = -121 % ((-38 - param0) / 59);
    }

    public static void c(int param0) {
        if (param0 != 105) {
            spawnReleaseIntervalTicks = 71;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_b = 640;
    }
}
