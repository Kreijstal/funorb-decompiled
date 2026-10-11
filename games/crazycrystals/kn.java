/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends bo implements Cloneable {
    private int field_r;
    static int field_q;
    static dl field_p;

    final void c(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        int var3 = -1 + s.field_o.length;
        int var4 = (int)(3.0 * ((double)var3 * Math.random()));
        if (var4 < 0) {
          return;
        }
        if (var4 < var3) {
          this.field_r = 1 + var4;
          return;
        }
    }

    protected final Object clone() {
        kn var1 = (kn) (super.clone());
        var1.field_r = this.field_r;
        return var1;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.a(-78, (ea) null, 7, -88, (byte) 87, 74, (f[][]) null);
          }
          stackIn_3_0 = ng.a(dq.field_H, param1, new kn(new kp(-1)), (byte) -83, wi.field_b);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kn.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        fq var9 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fn.field_j = fn.field_j - 3;
          if (param4 > -87) {
            this.a(-12, (ea) null, -116, -77, (byte) 28, -29, (f[][]) null);
          }
          mb.field_g = mb.field_g - 3;
          wd.field_j = wd.field_j - 1;
          mb.field_g = mb.field_g - ob.field_l;
          tm.field_f.a(32, (param5 + param2) * 12, (param3 + param0) * 12, 60, (byte) -111);
          var9 = (fq) (param1);
          this.field_l.a(1 << var9.field_u, true, tm.field_e);
          stackIn_3_0 = this.field_l.a(param0, param1, param2, param3, (byte) -98, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("kn.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -21) {
            return true;
          }
          field_q = -71;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("kn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 122 % ((param0 - 74) / 41);
        if (param1 != 24) {
          s.field_o[jm.field_j ? this.field_r : 0].b(param4, param5 - param2, param1 * 2, param2 * 3);
          return;
        }
        if (param2 == 24) {
          s.field_o[!jm.field_j ? 0 : this.field_r].a(param4, param5 - param2);
          return;
        }
        s.field_o[jm.field_j ? this.field_r : 0].b(param4, param5 - param2, param1 * 2, param2 * 3);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          field_q = 34;
          return 0;
        }
        return 0;
    }

    kn(f param0) {
        super(param0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -87) {
            this.field_r = 127;
          }
          je.field_j = je.field_j + 64;
          b.field_a = b.field_a + 64;
          we.field_h = we.field_h + 128;
          fp.field_a = fp.field_a + 128;
          cn.field_e.a(64, param2 * 12, 12 * param1, 0, (byte) -111);
          this.field_l.a((byte) 108, param0);
          stackIn_3_0 = new ig(param0, bd.field_n, this.field_l, true);
          return (f) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("kn.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void g(int param0) {
        int var1 = -57 % ((-51 - param0) / 48);
        field_p = null;
    }

    static {
    }
}
