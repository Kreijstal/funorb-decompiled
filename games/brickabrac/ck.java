/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends IntrusiveNode {
    static n field_k;
    static String field_i;
    static String field_j;
    static boolean[] field_m;
    StringBuilder field_l;

    final static void a(int param0, ResourceArchive param1) {
        bk var2 = null;
        bk.b(param1.takeFileByName(111, "headers.packvorbis", ""));
        if (param0 != -2196) {
          return;
        }
        try {
          var2 = bk.a(param1, "jagex logo2.packvorbis", "");
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ck.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param2 != 14209) {
              ck.a(53);
            }
            var4 = param0.getGraphics();
            BallPulseEffect.framebuffer.draw(param3, param1, -17260, var4);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("ck.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        if (param0 == 30850) {
          field_k = null;
          field_i = null;
          return;
        }
        field_j = (String) null;
        field_k = null;
        field_i = null;
    }

    ck() {
        this(30);
    }

    private ck(int param0) {
        this.field_l = new StringBuilder(param0);
    }

    final static void a(byte param0) {
        wc.field_b = false;
        ga.field_i = 13;
        MatchCompleteScreen.field_E = 0;
        tb.field_eb = null;
        GameClock.field_d = 0;
        c.field_i = un.field_e;
        BitPacketBuffer.field_q = 0;
        cm.field_s = false;
        kb.field_Sb = false;
        jl.field_a = 1;
        if (param0 > 27) {
          wl.field_N = false;
          rf.field_f = false;
          pp.field_a = 13;
          return;
        }
    }

    static {
        field_i = "Previous";
        field_j = "You appear to be telling someone your password - please don't!";
        field_m = new boolean[29];
        field_m[17] = true;
        field_m[5] = true;
        field_m[3] = false;
        field_m[15] = false;
        field_m[12] = true;
        field_m[14] = true;
        field_m[18] = true;
        field_m[6] = false;
        field_m[11] = false;
        field_m[13] = false;
        field_m[8] = false;
        field_m[10] = true;
        field_m[7] = false;
        field_m[9] = false;
        field_m[16] = false;
        field_m[4] = true;
        field_k = new n();
    }
}
