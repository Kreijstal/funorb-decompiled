/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends gf implements ta {
    static String field_I;
    static int[] field_H;
    static km field_K;
    static il field_L;
    private jb field_M;
    static bk field_G;
    static boolean field_J;
    private tg field_N;

    ab(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (ol) null);
        this.field_M = new jb(new cc(10000536), wd.field_a, 0, 0, 140, 25);
        this.field_M.a(2, new al());
        this.field_N = new tg(md.field_c, (cd) (this));
        this.field_E = new fi[]{(fi) ((Object) this.field_M), (fi) ((Object) this.field_N)};
        this.field_N.field_w = (ol) ((Object) new hf());
        this.d(false);
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (param0 != 12085) {
          this.field_M = (jb) null;
        }
        if (this.field_M.a(param0 - 12086).a(param0 - 34328) != bm.field_i) {
          return;
        }
        try {
          ce.a(this.field_M.f(-2), this.field_M.g(param0 - 12114), -2, this.field_M.g(true));
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ab.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        if (param0 < -82) {
          var2 = 250;
          this.field_M.a(25, true, this.field_m + 20 - 25 >> 1, this.field_g - var2 >> 1, 140);
          this.field_N.a(30, true, (20 + (this.field_m - 30) >> 1) + 2, 140 + ((-var2 + this.field_g >> 1) + 10), 100);
          return;
        }
    }

    final static boolean b(int param0, int param1) {
        if (param1 != 1) {
          field_L = (il) null;
          if (!mf.a(95, param0)) {
            return false;
          }
          if (param0 != -2) {
            return true;
          }
          return false;
        }
        if (!mf.a(95, param0)) {
          return false;
        }
        if (param0 != -2) {
          return true;
        }
        return false;
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        hg var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param1);
          if (!dm.a(var7, param0 - 1551)) {
            stackIn_2_0 = sa.field_l;
            return stackIn_2_0;
          }
          if (oa.field_q != 2) {
            stackIn_5_0 = jl.field_F;
            return stackIn_5_0;
          }
          if (jc.a(param1, true)) {
            stackIn_9_0 = ql.field_k;
            return stackIn_9_0;
          }
          if (ch.a(param1, (byte) -73)) {
            stackIn_12_0 = oi.a(new String[]{param1}, og.field_e, 2);
            return stackIn_12_0;
          }
          if (sg.field_j >= 100 &&
            bn.field_d <= 0) {
            stackIn_17_0 = qi.field_a;
            return stackIn_17_0;
          }
          if (sg.field_j >= 200) {
            stackIn_20_0 = qi.field_a;
            return stackIn_20_0;
          }
          if (fm.a(param1, param0 ^ -1369854407)) {
            stackIn_23_0 = oi.a(new String[]{param1}, kk.field_o, 2);
            return stackIn_23_0;
          }
          var6 = gk.field_g;
          var6.g(param2, 8);
          var6.field_l = var6.field_l + 1;
          var4 = var6.field_l;
          var6.a(0, param0 ^ -25);
          var6.a(param1, (byte) -112);
          var6.b(var6.field_l - var4, param0 - 74);
          if (param0 == 73) {
            return null;
          }
          var5 = (String) null;
          ab.a((byte) -58, (String) null, 66);
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ab.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
        try {
          if (param1 < 113) {
            ab.b(-49, -84);
          }
          super.a(param0, 124, param2, param3);
          this.field_N.field_C = this.field_M.a(-1).a(-22243) == bm.field_i ? true : false;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ab.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        dk.field_j.b(bn.field_c, 4 + (this.field_l + param1), 4 + (dk.field_j.field_H + (this.field_u + param2)), 16777215, -1);
    }

    public static void e(int param0) {
        field_G = null;
        if (param0 != -16349) {
          return;
        }
        field_I = null;
        field_L = null;
        field_K = null;
        field_H = null;
    }

    static {
        field_H = new int[128];
        field_I = "This option cannot be combined with the current settings for:  ";
        field_G = null;
    }
}
