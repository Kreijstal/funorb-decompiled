/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends hd {
    int field_Sb;
    static String field_Kb;
    static rv field_yb;
    hd field_Hb;
    boolean field_Gb;
    static String field_Ub;
    String field_Rb;
    long field_Ab;
    String field_Nb;
    int field_Qb;
    hd field_zb;
    static String field_Eb;
    int field_Mb;
    boolean field_Fb;
    long field_Ib;
    hd field_Tb;
    hd field_Lb;
    boolean field_Cb;
    int field_Db;
    hd field_Ob;
    int field_Jb;
    int field_Pb;
    static String field_Bb;

    public static void b(int param0) {
        field_yb = null;
        field_Bb = null;
        field_Eb = null;
        if (param0 != 240) {
          field_Bb = (String) null;
        }
        field_Kb = null;
        field_Ub = null;
    }

    final static int a(byte param0, int[] param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3_ref_int__ = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = 0;
          var3_ref_int__ = param1;
          for (var4 = 0; var4 < var3_ref_int__.length; var4++) {
            var5 = var3_ref_int__[var4];
            var2_int = var2_int + var5;
          }
          var3 = -10 / ((param0 - 40) / 37);
          stackIn_5_0 = var2_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(he param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = this.field_Fb;
          if (param0.field_Fb) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_6_0 = this.field_Fb;
            return stackIn_6_0;
          }
          stackIn_10_0 = (this.field_Gb) ? 0 : 1;
          if (stackIn_10_0 == (param0.field_Gb ? 1 : 0)) {
            stackIn_13_0 = this.field_Gb;
            return stackIn_13_0;
          }
          if (param1 == -82) {
            stackIn_20_0 = !(this.field_Ib >= param0.field_Ib);
            return stackIn_20_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("he.I(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (nr.field_f == wk.field_f) {
          return ld.field_a;
        }
        if (param0 != 320) {
          vm var2 = (vm) null;
          he.a((vm) null, false);
        }
        if (!lc.field_e.a((byte) -80)) {
          return lc.field_e.a(3);
        }
        if (mj.field_a == nr.field_f) {
          return lc.field_e.a(param0 ^ 323);
        }
        return ep.field_b;
    }

    final static void i(int param0) {
        int var5 = 0;
        int var8 = 0;
        int var2 = 0;
        int var3 = 0;
        dt[] var4 = null;
        dt var6 = null;
        int var7 = 0;
        int var9 = 0;
        gm var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var9 = Kickabout.field_G;
        try {
          if (null != af.field_a &&
            nw.field_b.field_R[ek.field_G].d(3511)) {
            var10 = (gm) (nw.field_b.a((byte) -76, ek.field_G));
            var2 = ug.a(param0, var10.field_kb >> 16);
            var3 = lf.a((byte) -119, var10.field_bb >> 16);
            if (!lb.a(var2, var3, param0 ^ 480)) {
              var2 = 320;
              var3 = 240;
            }
            var4 = af.field_a;
            for (var5 = 0; var5 < var4.length; var5++) {
              var6 = var4[var5];
              var7 = -1;
              for (var8 = 0; nw.field_b.field_I > var8; var8++) {
                if (nw.field_b.field_g[ek.field_G].field_p == nw.field_b.field_g[var8].field_p &&
                  var6.field_h == nw.field_b.field_R[var8].field_g) {
                  var7 = var8;
                }
                var6.a(var2, var3, var7, -113);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "he.F(" + param0 + ')');
        }
    }

    he(String param0, String param1, long param2) {
        super(0L, (hd) null);
        CharSequence var6 = null;
        try {
          this.field_Ab = param2;
          this.field_Rb = param0;
          this.field_Nb = param1;
          var6 = (CharSequence) ((Object) this.field_Rb);
          mo.a(0, var6);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean h(int param0) {
        if (param0 != -13356) {
          this.field_Db = -100;
        }
        return !this.a((byte) -60) ? true : false;
    }

    final static wh a(int param0, boolean param1, int param2, int param3, int param4) {
        if (param2 != 240) {
          field_Ub = (String) null;
        }
        return wt.a(param3, ga.field_O[param4], em.field_e ? !param1 ? true : false : param1, param4, param0, -121);
    }

    final static void a(vm param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != vg.field_Bb) {
            vg.field_Bb.b(param0);
          }
          if (!param1) {
            he.i(10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, String param1, String param2) {
        CharSequence var5 = null;
        this.field_Rb = param2;
        if (param0 != -2) {
          return;
        }
        try {
          this.field_Nb = param1;
          var5 = (CharSequence) ((Object) this.field_Rb);
          mo.a(param0 ^ -2, var5);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "he.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Ub = "home";
        field_Kb = "Visit the Account Management section on the main site to view.";
        field_Eb = "Bid";
        field_Bb = "MANAGEMENT";
        field_yb = new rv();
    }
}
