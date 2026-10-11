/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int[] field_d;
    static String field_b;
    private dk field_a;
    private int field_i;
    static String field_h;
    private dk[] field_f;
    static bd[][] field_g;
    static long field_e;
    static int field_c;
    private long field_j;

    final static ll a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ll stackIn_4_0 = null;
        ll stackIn_8_0 = null;
        ll stackIn_18_0 = null;
        ll stackIn_22_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = gf.field_f;
            return stackIn_4_0;
          }
          if (63 < var2_int) {
            stackIn_8_0 = hb.field_v;
            return stackIn_8_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                -1 + var2_int == var3) {
                stackIn_18_0 = we.field_g;
                return stackIn_18_0;
              }
            } else {
              if (ce.field_g.indexOf(var4) == -1) {
                stackIn_22_0 = we.field_g;
                return stackIn_22_0;
              }
            }
          }
          if (param1 > 18) {
            return null;
          }
          field_g = (bd[][]) null;
          stackIn_29_0 = null;
          return (ll) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("cb.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, oj param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          in.a(false);
          jg.field_d.e((640 - jg.field_d.field_z) / 2, -4 + (-jg.field_d.field_A + 480));
          var2_int = (640 - gj.field_d.field_z) / 2;
          var3 = -gj.field_d.field_A + 478;
          var4 = (gj.field_d.field_z - 4) * ij.k(param0 ^ -547) >> 9;
          si.c(var2_int + 2, var3 + 3, var4, 2, 16772608);
          gj.field_d.e(var2_int, var3);
          al.field_Z.c(hk.field_k.toUpperCase(), 8, 472, 16776960, -1);
          al.field_Z.b(bi.field_c[n.field_s].toUpperCase(), 320, 471, 16776960, -1);
          var5 = el.field_i.toUpperCase();
          var6 = al.field_Z.a(var5);
          al.field_Z.a(var5, param0, 472, 16776960, -1);
          ec.a(7, 472, false, al.field_Z, 631 - var6 - 5, 16776960, Integer.toString(cf.field_s));
          stackIn_2_0 = -11003;
          stackIn_2_1 = Math.max(eh.field_g, 0);
          if (0 >= um.field_e) {
            stackIn_3_2 = ba.a((byte) 61);
          } else {
            stackIn_3_2 = Math.max(eh.field_g, qi.field_J);
          }
          sm.a(stackIn_2_0, stackIn_2_1, stackIn_3_2);
          if (le.field_D > 0) {
            mk.field_L.b(jh.a((byte) -93, le.field_D / 50), 320, 52, 16711680, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final dk a(long param0, int param1) {
        dk var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != -30828) {
          return (dk) null;
        }
        this.field_j = param0;
        dk var4 = this.field_f[(int)((long)(-1 + this.field_i) & param0)];
        this.field_a = var4.field_j;
        while (this.field_a != var4) {
          if (~param0 == ~this.field_a.field_h) {
            var5 = this.field_a;
            this.field_a = this.field_a.field_j;
            return var5;
          }
          this.field_a = this.field_a.field_j;
        }
        this.field_a = null;
        return null;
    }

    final void a(long param0, dk param1, int param2) {
        dk var5 = null;
        String var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param1.field_i) {
            param1.c(-1);
          }
          var5 = this.field_f[(int)(param0 & (long)(-1 + this.field_i))];
          param1.field_j = var5;
          param1.field_i = var5.field_i;
          param1.field_i.field_j = param1;
          param1.field_j.field_i = param1;
          param1.field_h = param0;
          if (param2 != 320) {
            var6 = (String) null;
            cb.a((String) null, 83);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("cb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final dk a(int param0) {
        dk var3_ref_dk = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_a == null) {
          return null;
        }
        dk var2 = this.field_f[(int)(this.field_j & (long)(-1 + this.field_i))];
        while (this.field_a != var2) {
          if (~this.field_j == ~this.field_a.field_h) {
            var3_ref_dk = this.field_a;
            this.field_a = this.field_a.field_j;
            return var3_ref_dk;
          }
          this.field_a = this.field_a.field_j;
        }
        int var3 = -86 / ((param0 - 0) / 48);
        this.field_a = null;
        return null;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -109) {
          field_h = (String) null;
          field_g = (bd[][]) null;
          field_b = null;
          field_h = null;
          return;
        }
        field_g = (bd[][]) null;
        field_b = null;
        field_h = null;
    }

    cb(int param0) {
        int var2 = 0;
        dk dupTemp$0 = null;
        dk var3 = null;
        this.field_i = param0;
        this.field_f = new dk[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new dk();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.field_i = var3;
          var3.field_j = var3;
        }
    }

    static {
        field_d = new int[12];
        field_b = "Log in";
        field_h = "Find the entrance to the military base and locate the lift.";
    }
}
