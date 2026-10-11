/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends af {
    static int[][] field_F;
    static String[] field_H;
    static tp field_J;
    static String field_G;
    static String field_I;
    static String field_K;

    final void d(int param0) {
        if (param0 > -60) {
          this.a(-74, (byte) 4);
        }
        this.a(mi.field_b, 0);
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = kf.a(param1, param2, 3);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          for (var4 = param0; var4 < param2.length(); var4++) {
            if (!mh.a(true, param2.charAt(var4))) {
              stackIn_11_0 = cq.field_i;
              return stackIn_11_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bl.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1) {
        boolean stackIn_13_0 = false;
        if (eo.a(this.field_t, param0, (byte) -75)) {
          return false;
        }
        if (param1 != 38) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 != 22 &&
          26 != param0 && (lc.a(0, -93) ||
          param0 != 16 &&
          param0 != 41)) {
          stackIn_13_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_13_0 = true;
        }
        return stackIn_13_0;
    }

    final static void f(int param0) {
        String var2 = null;
        if (param0 != 0) {
          return;
        }
        if (pk.field_g != null) {
          var2 = pk.field_g;
          String var1 = var2;
          ag.a((byte) -83, rd.a(nf.field_T, new String[]{var2}, (byte) 103));
          pk.field_g = null;
        }
    }

    bl() {
        super(8, fr.field_l);
        this.field_t = mk.field_b;
    }

    public static void h(byte param0) {
        field_G = null;
        field_J = null;
        field_H = null;
        field_K = null;
        field_F = (int[][]) null;
        int var1 = 121 / ((param0 + 59) / 32);
        field_I = null;
    }

    static {
        field_K = "You cannot join this game - it is in progress";
        field_I = "Advertising websites";
        field_G = "Please try changing the following settings:  ";
    }
}
