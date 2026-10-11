/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static tg field_e;
    static long field_b;
    static int field_c;
    static String field_f;
    static String field_a;
    static long[] field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 3) {
          bl var2 = (bl) null;
          l.a(-34, (bl) null);
        }
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -30 % ((-40 - param2) / 41);
        String var4 = (String) null;
        rk.a(4, (String) null, param1, param0);
    }

    final static void a(int param0, bl param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        var5 = Bounce.field_N;
        try {
          for (var2_int = 0; 3 > var2_int; var2_int++) {
            ef.field_i[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < oh.field_c; var2_intLifetime1++) {
            if (param1.field_h == sh.field_cb[var2_intLifetime1].field_h) {
              dupTemp$3 = sh.field_cb[var2_intLifetime1].a((byte) 78);
              ef.field_i[dupTemp$3] = ef.field_i[dupTemp$3] + 1;
            }
          }
          var3 = 98 / ((param0 - 45) / 34);
          dupTemp$0 = param1.a((byte) -94);
          ef.field_i[dupTemp$0] = ef.field_i[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          var6 = 0;
          var3Lifetime1 = var6;
          while (var6 < oh.field_c) {
            boolean decompiledFrameRemainder0 = true;
            if (param1.field_h == sh.field_cb[var6].field_h) {
              var4 = sh.field_cb[var6].a((byte) 113);
              if (ef.field_i[var4] > wk.field_G) {
                ef.field_i[var4] = ef.field_i[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              sh.field_cb[incrementValue$2] = sh.field_cb[var6];
            }
            var6++;
          }
          oh.field_c = var2_intLifetime2;
          fieldTemp$1 = oh.field_c;
          oh.field_c = oh.field_c + 1;
          sh.field_cb[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("l.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 < 126) {
          field_d = (long[]) null;
        }
        bi.field_h = param2;
        uf.field_a = param0;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          eb.a((java.awt.Component) ((Object) param1), (byte) -105);
          fb.a((java.awt.Component) ((Object) param1), (byte) -42);
          if (null != hg.field_k) {
            hg.field_k.a((java.awt.Component) ((Object) param1), false);
          }
          if (param0 != 0) {
            var3 = (java.awt.Canvas) null;
            l.a(-60, (java.awt.Canvas) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("l.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_c = -132108;
        field_a = "Confirm Email:";
        field_f = "Return to game";
        field_d = new long[32];
    }
}
