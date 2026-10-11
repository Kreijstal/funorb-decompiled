/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mi implements le {
    static String field_e;
    static String field_f;
    static int field_c;
    private long field_b;
    static String field_a;
    static String field_d;

    final static boolean a(byte param0) {
        if (param0 >= -103) {
          field_f = (String) null;
          return ih.field_b == null ? fe.field_Gb : true;
        }
        return ih.field_b == null ? fe.field_Gb : true;
    }

    public final String b(int param0) {
        if (this.a(true)) {
          return null;
        }
        if (hc.a(-9986) < (this.field_b + 350L)) {
          return null;
        }
        if (param0 == 28433) {
          return this.c(-103);
        }
        field_e = (String) null;
        return this.c(-103);
    }

    final static void a(String param0, boolean param1, boolean param2, boolean param3) {
        try {
          vi.b((byte) -126);
          tm.field_l.a((byte) 76);
          aa.field_a = new ca(pm.field_g, (String) null, kb.field_c, param1, param2);
          fi.field_t = new de(tm.field_l, aa.field_a);
          tm.field_l.a(0, fi.field_t);
          if (!param3) {
            field_c = 59;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mi.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (ag.c(-110)) {
          param0 = false;
        }
        if (param1 != -8241) {
          mi.e(-16);
          hn.a(-1781, param0);
          if (en.field_Fb) {
            df.g(he.field_pc.field_c.field_tb, he.field_pc.field_c.field_F, he.field_pc.field_c.field_K, he.field_pc.field_c.field_ub);
            he.field_pc.field_c.a(param0, 24960);
            la.a(param1 ^ 8271, param0);
            return;
          }
          la.a(param1 ^ 8271, param0);
          return;
        }
        hn.a(-1781, param0);
        if (!en.field_Fb) {
          la.a(param1 ^ 8271, param0);
          return;
        }
        df.g(he.field_pc.field_c.field_tb, he.field_pc.field_c.field_F, he.field_pc.field_c.field_K, he.field_pc.field_c.field_ub);
        he.field_pc.field_c.a(param0, 24960);
        la.a(param1 ^ 8271, param0);
    }

    final static void d(int param0) {
        if (null != tm.field_l) {
          tm.field_l.g(-115);
        }
        if (null != md.field_i) {
          md.field_i.k(18);
        }
        int var1 = 7 / ((param0 + 74) / 41);
        qd.a(-44);
    }

    public static void e(int param0) {
        field_f = null;
        if (param0 != 12) {
          return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        la var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = (la) (vi.field_h.a((byte) -58));
          while (var4 != null) {
            oa.a(param0, var4, 97);
            var4 = (la) (vi.field_h.a(16213));
          }
          if (param1 == 12) {
            return;
          }
          field_e = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "mi.W(" + param0 + ',' + param1 + ')');
        }
    }

    public final void b(boolean param0) {
        if (param0) {
          mi.a(true, 21);
          this.field_b = hc.a(-9986);
          return;
        }
        this.field_b = hc.a(-9986);
    }

    public final wl a(int param0) {
        if (this.a(true)) {
          return wm.field_v;
        }
        if (!(hc.a(param0 + 12257) >= 350L + this.field_b)) {
          return gd.field_r;
        }
        if (param0 == -22243) {
          return this.f(-843083384);
        }
        this.a(7);
        return this.f(-843083384);
    }

    abstract String c(int param0);

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          if (param0 != 1203) {
            mi.a(-52, -85);
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = c.a(param2, true);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!ck.a(var4.charAt(0), -46) &&
              !ck.a(var4.charAt(-1 + var4.length()), param0 - 1249)) {
              var5 = 0;
              for (var6 = 0; param2.length() > var6; var6++) {
                var7 = param2.charAt(var6);
                if (ck.a((char) var7, -46)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("mi.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    abstract wl f(int param0);

    static {
        field_f = "Sorry, you were removed from the game you were playing. This happened either because you were disconnected for too long, or because the server was updated.";
        field_e = "Unpacking music";
        field_a = "Hide private chat and appear offline to friends";
    }
}
