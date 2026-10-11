/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_f;
    static String field_a;
    static mf field_e;
    static int field_d;
    static boolean[] field_b;
    static boolean field_c;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          c var2 = (c) null;
          wk.a(10, (c) null);
        }
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 55) {
          wk.a(50, 41, 94);
        }
        if (null == vi.field_e ||
          !(param0 <= vi.field_e.length)) {
          vi.field_e = new int[param0 * 2];
        }
        if (null == fl.field_k ||
          !(param0 <= fl.field_k.length)) {
          fl.field_k = new int[param0 * 2];
        }
        if (pc.field_c == null ||
          !(pc.field_c.length >= param0)) {
          pc.field_c = new int[2 * param0];
        }
        if (mi.field_k == null ||
          !(mi.field_k.length >= param0)) {
          mi.field_k = new int[2 * param0];
        }
        if (tm.field_fb == null ||
          !(tm.field_fb.length >= param0)) {
          tm.field_fb = new int[2 * param0];
        }
        if (null == th.field_v ||
          !(param0 <= th.field_v.length)) {
          th.field_v = new int[2 * param0];
        }
        if (cd.field_q == null ||
          !(param2 + param0 <= cd.field_q.length)) {
          cd.field_q = new int[2 * (param0 + param2)];
        }
        if (null == dj.field_a ||
          !(param0 <= dj.field_a.length)) {
          dj.field_a = new boolean[2 * param0];
        }
        pl.field_r = -2147483648;
        jf.field_J = 0;
        oa.field_t = -2147483648;
        pg.field_d = 2147483647;
        vl.field_e = 2147483647;
    }

    final static int a(boolean param0, int param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        try {
          if (param1 >= 2 &&
            36 >= param1) {
            var4_int = 0;
            if (param3 != 97) {
              stackIn_7_0 = 11;
              return stackIn_7_0;
            }
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param1 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param1 + var9;
                if (var6 != var10 / param1) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("wk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ia a(int param0, c param1) {
        int var8 = 0;
        ia stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ia var6 = null;
        int var7 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        try {
          var2_int = param1.j(8, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = 51 % ((-82 - param0) / 38);
          var4 = da.a(param1, (byte) -104) ? 1 : 0;
          var5 = da.a(param1, (byte) -114) ? 1 : 0;
          var6 = new ia();
          var6.field_K = (short)param1.j(16, 8);
          var6.field_L = rg.a(param1, 16, var6.field_L, -1);
          var6.field_r = rg.a(param1, 16, var6.field_r, -1);
          var6.field_J = rg.a(param1, 16, var6.field_J, -1);
          var6.field_D = (short)param1.j(16, 8);
          var6.field_e = rg.a(param1, 16, var6.field_e, -1);
          var6.field_o = rg.a(param1, 16, var6.field_o, -1);
          var6.field_f = rg.a(param1, 16, var6.field_f, -1);
          if (var4 != 0) {
            var6.field_M = (short)param1.j(16, 8);
            var6.field_N = rg.a(param1, 16, var6.field_N, -1);
            var6.field_q = rg.a(param1, 16, var6.field_q, -1);
            var6.field_w = rg.a(param1, 16, var6.field_w, -1);
            var6.field_h = rg.a(param1, 16, var6.field_h, -1);
            var6.field_u = rg.a(param1, 16, var6.field_u, -1);
            var6.field_j = rg.a(param1, 16, var6.field_j, -1);
          }
          if (var5 != 0) {
            param1.j(16, 8);
            var6.field_v = rg.a(param1, 16, var6.field_v, -1);
            var6.field_c = rg.a(param1, 16, var6.field_c, -1);
            var6.field_Q = rg.a(param1, 16, var6.field_Q, -1);
            var6.field_G = rg.a(param1, 16, var6.field_G, -1);
            var6.field_F = rg.a(param1, 16, var6.field_F, -1);
          }
          if (da.a(param1, (byte) -104)) {
            var6.field_m = rg.a(param1, 16, var6.field_m, -1);
          }
          if (da.a(param1, (byte) -102)) {
            var6.field_n = jm.a(16, 118, param1, var6.field_n);
            var7 = 0;
            for (var8 = 0; var8 < var6.field_n.length; var8++) {
              if ((255 & var6.field_n[var8]) > var7) {
                var7 = var6.field_n[var8] & 255;
              }
            }
            if (0 == var7) {
              var6.field_n = null;
            } else {
              var6.field_I = (byte)(1 + var7);
            }
          }
          stackIn_24_0 = var6;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("wk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static String a(String param0, boolean param1, String param2, String param3, mf param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4.b(0)) {
            stackIn_2_0 = (String) (param0);
            return stackIn_2_0;
          }
          if (param1) {
            field_a = (String) null;
          }
          stackIn_6_0 = param2 + " - " + param4.a(param3, 0) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wk.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_f = "No highscores";
        field_a = "Error connecting to server. Please try using a different server.";
        field_b = new boolean[]{true, true, true, true, true};
    }
}
