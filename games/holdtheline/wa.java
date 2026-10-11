/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends gd {
    static int field_j;
    private nk field_l;
    private nk field_i;
    static int field_k;

    final fd a(String param0, byte param1) {
        boolean discarded$1 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        fd stackIn_4_0 = null;
        fd stackIn_8_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 52) {
            var5 = (String) null;
            discarded$1 = this.b((String) null, (byte) 79);
          }
          var3 = this.field_i.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_4_0 = g.field_k;
            return stackIn_4_0;
          }
          if (!ll.a(-103, var3, var4)) {
            stackIn_8_0 = g.field_k;
            return stackIn_8_0;
          }
          if (!this.b(param0, (byte) -57)) {
            return tg.field_d;
          }
          stackIn_12_0 = g.field_k;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wa.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ij a(boolean param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        da var8 = null;
        on var9 = null;
        var7 = HoldTheLine.field_D;
        var8 = rd.field_e;
        var3 = var8.f((byte) -70);
        stackIn_3_0 = ((128 & var3) != 0);
        jc.field_f = stackIn_3_0;
        ch.field_m = 127 & var3;
        pj.field_o = var8.f((byte) -104);
        fc.field_c = var8.d(true);
        if (ch.field_m != 2) {
          kf.field_H = 0;
          vn.field_f = 0;
        } else {
          kf.field_H = var8.k(-108);
          vn.field_f = var8.c(false);
        }
        stackIn_9_0 = (1 != var8.f((byte) -101)) ? 0 : 1;
        var4 = stackIn_9_0;
        wj.field_a = var8.j(-1231);
        if (param1) {
          field_k = 82;
        }
        if (var4 == 0) {
          kl.field_u = wj.field_a;
        } else {
          kl.field_u = var8.j(-1231);
        }
        if (1 == ch.field_m) {
          var8.k(95);
          var8.j(-1231);
        } else {
          if (ch.field_m == 4) {
            var8.k(95);
            var8.j(-1231);
          }
        }
        if (!param0) {
          fi.field_kb = ta.a(80, var8, param1);
          lm.field_d = null;
          return new ij(param0);
        }
        var5 = var8.k(99);
        try {
          var9 = hg.field_H.a(var5, 1);
          fi.field_kb = var9.f(245197136);
          if (kl.field_u.equals(ng.field_e)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_o;
          }
          lm.field_d = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          bl.a((Throwable) ((Object) var6), (byte) -49, "CC1");
          lm.field_d = null;
          fi.field_kb = null;
          return new ij(param0);
        }
        return new ij(param0);
    }

    final static int a(int param0, int param1, int param2) {
        if (nc.field_h == null) {
          return -1;
        }
        if (param0 <= 114) {
          return -100;
        }
        if (param2 < qm.field_b) {
          if (vg.field_J > param2) {
            return -1;
          }
          if (param2 >= nc.field_h.field_s + vg.field_J) {
            return -1;
          }
          if (param1 < le.field_t) {
            return -1;
          }
          if (le.field_t + nc.field_h.field_y > param1) {
            return 1;
          }
          return -1;
        }
        if (param2 >= nc.field_h.field_s + qm.field_b) {
          if (vg.field_J > param2) {
            return -1;
          }
          if (param2 >= nc.field_h.field_s + vg.field_J) {
            return -1;
          }
          if (param1 < le.field_t) {
            return -1;
          }
          if (le.field_t + nc.field_h.field_y > param1) {
            return 1;
          }
          return -1;
        }
        if (param1 >= pk.field_L &&
          pk.field_L + nc.field_h.field_y > param1) {
          return 0;
        }
        if (vg.field_J > param2) {
          return -1;
        }
        if (param2 >= nc.field_h.field_s + vg.field_J) {
          return -1;
        }
        if (param1 < le.field_t) {
          return -1;
        }
        if (le.field_t + nc.field_h.field_y <= param1) {
          return -1;
        }
        return 1;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_i.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (!param1) {
            field_k = -118;
          }
          var5 = var4;
          if (wc.a(var5, (byte) -27)) {
            stackIn_8_0 = mf.field_b;
            return stackIn_8_0;
          }
          if (t.a(0, var5)) {
            stackIn_11_0 = md.field_c;
            return stackIn_11_0;
          }
          if (aa.a(var5, 1)) {
            stackIn_15_0 = ak.field_a;
            return stackIn_15_0;
          }
          if (this.b(param0, (byte) -57)) {
            stackIn_19_0 = pc.field_i;
            return stackIn_19_0;
          }
          if (0 >= var6.length()) {
            stackIn_22_0 = vj.field_m;
            return stackIn_22_0;
          }
          if (ka.a(var5, (byte) 126, var6)) {
            stackIn_25_0 = le.field_p;
            return stackIn_25_0;
          }
          if (jc.a(var5, var6, 95)) {
            stackIn_29_0 = mc.field_c;
            return stackIn_29_0;
          }
          if (!an.a((byte) -127, var5, var6)) {
            stackIn_34_0 = mf.field_b;
            return stackIn_34_0;
          }
          stackIn_32_0 = le.field_p;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("wa.L(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        hj[] var6 = new hj[9];
        hj[] var5 = var6;
        hj dupTemp$0 = mk.a(param2, 124, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[param1] = dupTemp$0;
        var5[0] = dupTemp$0;
        hj dupTemp$1 = mk.a(param4, wb.a(param1, -97), param0);
        var5[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 == 0) {
          return var5;
        }
        var5[4] = mk.a(param3, param1 - 108, 64);
        return var5;
    }

    wa(nk param0, nk param1, nk param2) {
        super(param0);
        try {
          this.field_l = param2;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -57) {
            this.field_i = (nk) null;
          }
          var3 = this.field_l.field_q.toLowerCase();
          var4 = param0.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0) {
              if (var3.length() - 1 <= var5) {
                return false;
              }
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wa.V(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
