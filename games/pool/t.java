/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_c;
    static int field_d;
    static vh field_b;
    static int field_e;
    static int[][][] field_a;

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_6_0 = ((param1[param2 >> 5] & 1 << (param2 & 31)) == 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("t.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        String var8;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        if (param0 > 81) {
          var14 = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
          var1 = var14;
          if (of.field_Pb <= 0) {
            return var1;
          }
          var1Lifetime3 = var14 + ":";
          for (var2 = 0; of.field_Pb > var2; var2++) {
            var15 = var1Lifetime3 + ' ';
            var3 = kn.field_e.field_t[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var16 = var15 + (char)var4;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var1Lifetime3 = var16 + (char)var3;
          }
          return var1Lifetime3;
        }
        field_b = (vh) null;
        var8 = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
        var1Lifetime1 = var8;
        if (of.field_Pb <= 0) {
          return var1Lifetime1;
        }
        var1Lifetime2 = var8 + ":";
        for (var2Lifetime1 = 0; of.field_Pb > var2Lifetime1; var2Lifetime1++) {
          var12 = var1Lifetime2 + ' ';
          var3Lifetime1 = kn.field_e.field_t[var2Lifetime1] & 255;
          var4Lifetime1 = var3Lifetime1 >> 4;
          var3Lifetime1 = var3Lifetime1 & 15;
          if (var4Lifetime1 >= 10) {
            var4Lifetime1 += 55;
          } else {
            var4Lifetime1 += 48;
          }
          var13 = var12 + (char)var4Lifetime1;
          if (var3Lifetime1 < 10) {
            var3Lifetime1 += 48;
          } else {
            var3Lifetime1 += 55;
          }
          var1Lifetime2 = var13 + (char)var3Lifetime1;
        }
        return var1Lifetime2;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 != 29050) {
            field_c = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = (var3 << 5) + (-var3 + vi.a(param1.charAt(var4), true));
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("t.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!ql.a(param0 - 6709)) {
            if (ne.field_u != null &&
              ne.field_u.field_e) {
              tq.d((byte) -124);
              fk.field_cb.b(new gk(fk.field_cb, el.field_K), 30000);
            }
            return;
          }
          if (param0 != -11) {
            t.b(-62);
          }
          fk.field_cb.a(-122, sa.field_p, true, tl.field_M);
          fk.field_cb.h((byte) 122);
          while (n.h(127)) {
            fk.field_cb.a(-81, qi.field_a, ml.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "t.F(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_a = (int[][][]) null;
        field_c = null;
        field_b = null;
        if (param0 > -16) {
          field_a = (int[][][]) null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != sa.field_f) {
          qh.g(qh.field_b, qh.field_c, qh.field_j - qh.field_b, qh.field_g - qh.field_c);
          sa.field_f.a((byte) -79, param1);
        }
        if (param0 == 48) {
          return;
        }
        t.b(-101);
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        tg.a(-124, param1, param2, (String) null);
        int var3 = -51 / ((param0 - 59) / 47);
    }

    static {
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_e = 0;
    }
}
