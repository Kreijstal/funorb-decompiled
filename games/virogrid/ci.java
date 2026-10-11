/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends qe {
    static p field_o;
    private wa field_p;
    static int field_q;
    static int field_r;
    static String field_n;
    static mg field_s;

    public static void h(int param0) {
        if (param0 >= -6) {
          return;
        }
        field_s = null;
        field_n = null;
        field_o = null;
    }

    final static boolean i(int param0) {
        if (param0 != 24410) {
          return true;
        }
        return !w.field_I.b(-95) ? true : false;
    }

    final String a(int param0, String param1) {
        le var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26358) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_p instanceof fg) {
            var3 = ((fg) ((Object) this.field_p)).a(-1);
            if (var3 != null) {
              if (var3.a(-22243) == bm.field_i &&
                !param1.equals(this.field_p.field_n)) {
                stackIn_9_0 = od.field_t;
                return stackIn_9_0;
              }
              stackIn_11_0 = var3.b(28433);
              return stackIn_11_0;
            }
          }
          if (param1.equals(this.field_p.field_n)) {
            return null;
          }
          stackIn_15_0 = od.field_t;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ci.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        oh.field_c = null;
        if (param0 != 45) {
          ci.a(-6L, -103);
          oj.field_Gb = null;
          return;
        }
        oj.field_Gb = null;
    }

    final wl a(String param0, boolean param1) {
        le var3 = null;
        RuntimeException var3_ref = null;
        wl stackIn_7_0 = null;
        wl stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_s = (mg) null;
          }
          if (this.field_p instanceof fg) {
            var3 = ((fg) ((Object) this.field_p)).a(-1);
            if (var3 != null &&
              var3.a(-22243) != bm.field_i) {
              stackIn_7_0 = ee.field_c;
              return stackIn_7_0;
            }
          }
          if (!param0.equals(this.field_p.field_n)) {
            stackIn_11_0 = ee.field_c;
          } else {
            stackIn_11_0 = bm.field_i;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ci.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Virogrid.field_F ? 1 : 0;
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (0L != var4) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = h.field_f[(int)(-(param0 * 37L) + var7)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        if (param1 > 64) {
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        ci.i(-57);
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void b(boolean param0, int param1) {
        tm.field_l.a(0, 0, 0);
        if (param1 >= -125) {
          ci.j(39);
        }
    }

    ci(wa param0, wa param1) {
        super(param0);
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static km j(int param0) {
        if (param0 >= -109) {
          return (km) null;
        }
        return cg.b(1463);
    }

    static {
        field_q = -1;
        field_n = "<%0> has not yet unlocked this option for use.";
    }
}
