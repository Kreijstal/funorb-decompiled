/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends ma {
    static String[] field_s;
    static k field_n;
    static String[] field_p;
    static int[] field_o;
    static int[] field_r;
    static long field_m;
    static int[] field_q;

    il(dj param0) {
        super(param0);
    }

    final rj a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        rj stackIn_7_0 = null;
        rj stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != aj.a(param1, true)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param0 != 24) {
            il.f(-25);
          }
          if (var3_int != 0) {
            stackIn_9_0 = tf.field_w;
            return stackIn_9_0;
          }
          stackIn_7_0 = lk.field_c;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("il.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String f(int param0) {
        if (qc.field_i == gj.field_a) {
          return mj.field_d;
        }
        if (!ji.field_k.b(param0 ^ param0)) {
          return ji.field_k.a(0);
        }
        if (qc.field_i == eh.field_p) {
          return ji.field_k.a(0);
        }
        return lg.field_b;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -24) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.a((byte) 24, param0) != lk.field_c) {
            stackIn_7_0 = rk.field_c;
            return stackIn_7_0;
          }
          stackIn_5_0 = d.field_r;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("il.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (null == ji.field_p) {
          si.e((byte) 125);
        }
        if (param1 != 0) {
          return;
        }
        gb.a(2, -66, ag.field_e, 32, ji.field_p, ji.field_p, param0, ag.field_e.field_x, tf.field_x, 24, 24, 8, 18, 320, 240);
    }

    final static String a(CharSequence param0, byte param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (ak.a(95, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (ak.a(95, param0.charAt(-1 + var3))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param0.charAt(var6);
            if (ie.a((byte) 82, (char) var7)) {
              var8 = uk.a((char) var7, (byte) -111);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (param1 != 21) {
            il.a(true, -106);
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("il.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (11 == gj.field_c) {
          mf.c(-122);
        }
        if (param0 != -20895) {
          return;
        }
        try {
          c.a(sa.field_b, 127, hk.field_d, bg.field_G);
          nj.a(0, 0, param1, param0 + 20895);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "il.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_q = null;
        field_s = null;
        field_o = null;
        field_r = null;
        if (param0 != 8) {
          field_p = (String[]) null;
        }
        field_n = null;
        field_p = null;
    }

    static {
        field_s = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_n = new k(2, 4, 4, 0);
        field_o = new int[]{3, 4, 5};
        field_p = new String[]{"4 more towers.", "2 more master monks.", "Many more seals and riches to collect."};
        field_q = new int[16];
        field_r = new int[8192];
    }
}
