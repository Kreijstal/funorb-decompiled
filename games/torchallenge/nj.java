/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static boolean[] field_c;
    static ka[][] field_e;
    private sl field_d;
    static int field_g;
    private static k field_h;
    private da field_f;
    static int[][] field_b;
    static boolean field_a;

    final static void a(ka param0, int param1) {
        try {
          if (param1 != 2) {
            field_e = (ka[][]) null;
          }
          fc.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "nj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final da a(int param0) {
        da var2 = null;
        da var2Lifetime1;
        if (param0 > -31) {
          this.a(-93);
          var2 = this.field_d.field_e.field_h;
          if (this.field_d.field_e == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.field_h;
          return var2;
        }
        var2Lifetime1 = this.field_d.field_e.field_h;
        if (this.field_d.field_e == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.field_h;
        return var2Lifetime1;
    }

    final static void b(int param0) {
        int var1 = -127 % ((42 - param0) / 60);
        if (null != t.field_b) {
          t.field_b.g((byte) -37);
        }
        if (oa.field_k == null) {
          rf.n(19630);
          return;
        }
        oa.field_k.l(100);
        rf.n(19630);
    }

    final da a(da param0, int param1) {
        da var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        da stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_d.field_e.field_h;
          } else {
            var3 = param0;
          }
          if (this.field_d.field_e == var3) {
            this.field_f = null;
            stackIn_5_0 = null;
            return (da) (stackIn_5_0);
          }
          var4 = 28 / ((49 - param1) / 58);
          this.field_f = var3.field_h;
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("nj.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final da b(da param0, int param1) {
        da var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        da stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_d.field_e.field_f;
          }
          var4 = -98 % ((-42 - param1) / 45);
          if (this.field_d.field_e == var3) {
            this.field_f = null;
            stackIn_6_0 = null;
            return (da) (stackIn_6_0);
          }
          this.field_f = var3.field_f;
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("nj.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final da a(boolean param0) {
        if (param0) {
          return (da) null;
        }
        da var2 = this.field_f;
        if (var2 == this.field_d.field_e) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2.field_f;
        return var2;
    }

    public static void b(byte param0) {
        field_e = (ka[][]) null;
        field_b = (int[][]) null;
        field_h = null;
        if (param0 == -40) {
          field_c = null;
          return;
        }
        ka var2 = (ka) null;
        nj.a((ka) null, 74);
        field_c = null;
    }

    final da c(byte param0) {
        da var2 = null;
        da var2Lifetime1;
        if (param0 != -13) {
          field_e = (ka[][]) null;
          var2 = this.field_f;
          if (this.field_d.field_e == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.field_h;
          return var2;
        }
        var2Lifetime1 = this.field_f;
        if (this.field_d.field_e == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.field_h;
        return var2Lifetime1;
    }

    final static k[] a(byte param0) {
        if (param0 >= 86) {
          return new k[]{ij.field_w, dg.field_O, il.field_n, lh.field_w, oh.field_d, hc.field_P, ek.field_C, bf.field_g, le.field_f, lk.field_d, lk.field_a, kf.field_e, di.field_F, field_h};
        }
        nj.a((byte) 105);
        return new k[]{ij.field_w, dg.field_O, il.field_n, lh.field_w, oh.field_d, hc.field_P, ek.field_C, bf.field_g, le.field_f, lk.field_d, lk.field_a, kf.field_e, di.field_F, field_h};
    }

    nj(sl param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "nj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        ka var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            var5 = (ka) null;
            nj.a((ka) null, 63);
          }
          try {
            var4 = param2.getGraphics();
            la.field_f.a(-19275, param1, param0, var4);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("nj.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final da c(int param0) {
        da var2 = null;
        da var2Lifetime1;
        if (param0 != 0) {
          da var3 = (da) null;
          this.a((da) null, 103);
          var2 = this.field_d.field_e.field_f;
          if (this.field_d.field_e == var2) {
            this.field_f = null;
            return null;
          }
          this.field_f = var2.field_f;
          return var2;
        }
        var2Lifetime1 = this.field_d.field_e.field_f;
        if (this.field_d.field_e == var2Lifetime1) {
          this.field_f = null;
          return null;
        }
        this.field_f = var2Lifetime1.field_f;
        return var2Lifetime1;
    }

    final static t a(String param0, boolean param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        t stackIn_2_0 = null;
        t stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (t) null;
            return stackIn_2_0;
          }
          var4_long = 0L;
          var6 = null;
          if (param2.indexOf('@') != -1) {
            var6 = param2;
          } else {
            var7 = (CharSequence) ((Object) param2);
            var4_long = lg.a(var7, -1);
          }
          stackIn_7_0 = ac.a(var4_long, (String) (var6), -12, param0, param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nj.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = new ka[2][64];
        field_c = new boolean[112];
        field_b = new int[64][2];
        field_h = new k(15, 0, 1, 0);
        field_a = false;
    }
}
