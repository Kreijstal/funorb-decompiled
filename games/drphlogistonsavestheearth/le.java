/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static nh field_d;
    static ok field_e;
    static String[] field_a;
    static he field_c;
    static he[] field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (param0) {
          field_e = (ok) null;
        }
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 != 63) {
          return '\004';
        }
        int var2 = param1 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2 &&
          var2 < 160) {
          var3 = we.field_a[-128 + var2];
          if (0 == var3) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    final static void a(u param0, boolean param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          fb.field_b[0] = cm.field_M.nextInt();
          fb.field_b[1] = cm.field_M.nextInt();
          am.field_n.field_j = 0;
          fb.field_b[2] = (int)(s.field_c >> 32);
          fb.field_b[3] = (int)s.field_c;
          am.field_n.a(fb.field_b[0], (byte) -49);
          am.field_n.a(fb.field_b[1], (byte) 119);
          am.field_n.a(fb.field_b[2], (byte) -50);
          am.field_n.a(fb.field_b[3], (byte) -44);
          u.a(am.field_n, (byte) -102);
          am.field_n.c(param2, -17402);
          param0.a(am.field_n, param4 ^ 103);
          nj.field_p.field_j = 0;
          if (param3) {
            nj.field_p.c(18, (byte) -128);
          } else {
            nj.field_p.c(16, (byte) -105);
          }
          nj.field_p.field_j = nj.field_p.field_j + 2;
          var5_int = nj.field_p.field_j;
          nj.field_p.a(nf.field_t, (byte) 113);
          nj.field_p.a(n.field_i, (byte) -25);
          var6 = 0;
          if (bd.field_N) {
            var6 = var6 | 1;
          }
          if (wg.field_d) {
            var6 = var6 | 4;
          }
          if (param1) {
            var6 = var6 | 8;
          }
          if (cj.field_i != null) {
            var6 = var6 | 16;
          }
          nj.field_p.c(var6, (byte) -107);
          var7 = ob.a((byte) 117, nb.a(-109));
          if (var7 == null) {
            var7 = "";
          }
          nj.field_p.a(var7, -1);
          if (cj.field_i != null) {
            nj.field_p.a(-23805, cj.field_i);
          }
          i.a(nj.field_p, am.field_n, a.field_b, d.field_a, 0);
          nj.field_p.a(-2, nj.field_p.field_j - var5_int);
          if (param4 != 16) {
            return;
          }
          qj.a(-1, 14656);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("le.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
          int var6 = 0;
          int var3_int = 0;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String stackIn_6_0 = null;
          Object stackIn_11_0 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            try {
              var3_int = -108 % ((param2 + 47) / 54);
              var4 = (String) (pb.a("getcookies", param0, true));
              var5 = ki.a((byte) -113, ';', var4);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(param1)) {
                  stackIn_6_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            stackIn_11_0 = null;
            return (String) (stackIn_11_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref;
            stackIn_14_1 = new StringBuilder().append("le.A(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new String[]{"Introduction", "It gets harder", "The first command ship", "Asteroids!", "Mines!", "Alien starbase", "If these are the wastelands...", "...what are the cities like?", "The final showdown"};
    }
}
