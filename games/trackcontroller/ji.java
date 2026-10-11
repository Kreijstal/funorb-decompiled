/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    int field_c;
    int field_b;
    int field_g;
    int field_f;
    static nh field_a;
    static String field_e;
    static String field_d;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -64) {
          ji.a((byte) 111);
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (10 > gl.field_I) {
            var3_int = 0;
            if (vh.field_q) {
              vh.field_q = false;
              var3_int = 1;
            }
            fb.a(var3_int != 0, ie.a(122), dg.field_E, ei.a((byte) 116), (byte) -103);
          } else {
            if (!ic.a(false)) {
              ll.a();
              hi.b(320, -122, 240);
              qd.a(param2, 0, 0, 2901);
            } else {
              if (rl.field_N == 0) {
                ki.a(false, 0, param1);
                qd.a(param2, 0, 0, 2901);
              } else {
                l.a((byte) 85, param2);
              }
            }
          }
          var3_intLifetime1 = -98 / ((7 - param0) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_a = new nh(2);
        field_e = "Unpacking music";
        field_d = "to keep fullscreen or";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$f0d318109cc1(int param0, boolean param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (10 > gl.field_I) {
            var3_int = 0;
            if (vh.field_q) {
              vh.field_q = false;
              var3_int = 1;
            }
            fb.a(var3_int != 0, ie.a(122), dg.field_E, ei.a((byte) 116), (byte) -103);
          } else {
            if (!ic.a(false)) {
              ll.a();
              hi.b(320, -122, 240);
              qd.a(param2, 0, 0, 2901);
            } else {
              if (rl.field_N == 0) {
                ki.a(false, 0, param1);
                qd.a(param2, 0, 0, 2901);
              } else {
                l.a((byte) 85, param2);
              }
            }
          }
          var3_intLifetime1 = -98 / ((7 - param0) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }
}
