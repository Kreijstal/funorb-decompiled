/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    int field_h;
    static String field_c;
    static ah field_b;
    int field_k;
    static boolean field_j;
    int field_i;
    static ug field_a;
    static volatile int field_d;
    int field_e;
    static int[] field_f;
    static ah field_g;
    static String field_l;

    final static void a(String param0, int param1, String param2) {
        try {
          om.a(false, false, param0, param2);
          if (param1 <= 27) {
            field_l = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_l = (String) null;
        }
        field_b = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_l = null;
        field_g = null;
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param1, (byte) -92);
        var2.a(2, false);
        if (param0 <= 55) {
          return;
        }
        var2.a(4, false);
        var2.a(wg.a(true), false);
    }

    final static oh a(int param0) {
        int var4_int = 0;
        int var5 = TetraLink.field_J;
        int var1 = je.field_h[0] * sn.field_e[param0];
        byte[] var2 = ga.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = ti.field_c[pl.a((int) var2[var4_int], 255)];
        }
        oh var4 = new oh(wm.field_l, mm.field_w, qa.field_x[0], i.field_t[0], je.field_h[0], sn.field_e[0], var3);
        an.b(-83);
        return var4;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, boolean param3) {
        int var8 = 0;
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
        var11 = TetraLink.field_J;
        try {
          if (param1 >= 2 &&
            36 >= param1) {
            var4_int = 0;
            if (!param2) {
              return false;
            }
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  return false;
                }
                if (var9 >= param1) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param1;
                if (var10 / param1 != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("nl.A(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param0 != 52) {
          field_b = (ah) null;
        }
        for (var4 = 0; var4 < param2; var4++) {
          var6[var4] = param1;
        }
        return new String(var6);
    }

    final static void a(oh param0, byte param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          var3_int = param0.field_E * param0.field_u;
          while (var3_int != 0) {
            var3_int--;
            param0.field_C[var3_int] = param2;
          }
          if (param1 > -118) {
            field_d = -72;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nl.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1, long param2) {
        ud var4 = null;
        RuntimeException var4_ref = null;
        oh var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 126) {
            var5 = (oh) null;
            nl.a((oh) null, (byte) -84, -67);
          }
          var4 = ke.a(param1, false);
          if (var4 != null &&
            var4.field_Ub != null) {
            return true;
          }
          stackIn_10_0 = (null != qb.field_N) && (sf.a(-18701, param2) != null);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("nl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "Orb coins: <%0>";
        field_d = -1;
        field_j = false;
        field_f = new int[8192];
        field_l = "This password contains your email address, and would be easy to guess";
    }
}
