/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk {
    int[] field_e;
    int field_d;
    int field_i;
    static String field_c;
    static String field_g;
    java.awt.Image field_b;
    static String field_f;
    static String field_h;
    static cr field_a;

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    final static String a(byte param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        tp var4_ref_tp = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        int var7 = 0;
        tp var8 = null;
        CharSequence var9 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var9 = (CharSequence) ((Object) param2);
          if (!hi.a((byte) -3, var9)) {
            stackIn_3_0 = or.field_a;
            return stackIn_3_0;
          }
          if (ba.field_d != 2) {
            stackIn_7_0 = oa.field_o;
            return stackIn_7_0;
          }
          var8 = vo.a(param2, 0);
          if (var8 == null) {
            stackIn_10_0 = Vertigo2.a(new String[]{param2}, tq.field_a, 26);
            return stackIn_10_0;
          }
          tm.field_a.b(var8, (byte) -50);
          while (true) {
            var4_ref_tp = (tp) (tm.field_a.b(125));
            if (var4_ref_tp != null) {
              var4_ref_tp.field_Pb = var4_ref_tp.field_Pb - 1;
              continue;
            }
            break;
          }
          var8.c(2);
          var4 = 114 % ((param0 - 24) / 54);
          var8.a(-102);
          sq.field_b = sq.field_b - 1;
          var5 = uh.field_Wb;
          var5.j(param1, 120);
          var5.field_u = var5.field_u + 1;
          var6 = var5.field_u;
          var5.f(1, -96);
          var5.a((byte) 0, param2);
          var5.b((byte) -100, var5.field_u - var6);
          stackIn_16_0 = null;
          return (String) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("lk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    public static void b(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != -18390) {
          return;
        }
        field_f = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int[] param0, byte param1) {
        try {
          if (param1 != -48) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "lk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        bi.a(this.field_e, this.field_i, this.field_d);
        int var2 = -99 / ((param0 + 92) / 32);
    }

    final static boolean a(int param0, long param1, String param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            lk.b(91);
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4 != null && (param3 != 2 ||
            rm.a((byte) -125, param1, param2))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("lk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_h = "<%0> is BLUE";
        field_f = "<%0> is already on your ignore list.";
        field_g = "Unpacking levels";
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
