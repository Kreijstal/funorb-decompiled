/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends f implements Cloneable {
    static dl field_k;
    static ko field_l;
    ea field_j;
    private int field_i;

    public static void f(int param0) {
        if (param0 != 3) {
          field_k = (dl) null;
          field_k = null;
          field_l = null;
          return;
        }
        field_k = null;
        field_l = null;
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return true;
          }
          field_l = (ko) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("de.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        if (param2 != 24) {
          kj.field_a[this.field_i].b(param5, param4, 2 * param2, param0 * 2);
          if (null != this.field_j) {
            this.field_j.a(param0, param5, param2, param4, true);
            qc.field_f[this.field_i].b(param5, param4, 2 * param2, 2 * param0);
          }
        } else {
          if (param0 == 24) {
            kj.field_a[this.field_i].c(param5, param4);
            if (null != this.field_j) {
              this.field_j.a(param0, param5, param2, param4, true);
              qc.field_f[this.field_i].a(param5, param4);
            }
          } else {
            kj.field_a[this.field_i].b(param5, param4, 2 * param2, param0 * 2);
            if (null != this.field_j) {
              this.field_j.a(param0, param5, param2, param4, true);
              qc.field_f[this.field_i].b(param5, param4, 2 * param2, 2 * param0);
            }
          }
        }
        var7 = 8 / ((-70 - param1) / 33);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          field_k = (dl) null;
          return 3;
        }
        return 3;
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          return (f) null;
        }
        return new pf(param2, param0, (f) (this)).a(param0, (byte) -110, param2);
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
          return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
          this.field_i = 114;
          return true;
        }
        return true;
    }

    final static db a(boolean param0, boolean param1, int param2, int param3, int param4) {
        if (param4 == 12) {
          return qk.a(param2, param4 + 86, param0, param1, false, param3);
        }
        field_l = (ko) null;
        return qk.a(param2, param4 + 86, param0, param1, false, param3);
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -21) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("de.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, db param1) {
        dl var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new dl(param1.a(7693, "", "final_frame.jpg"), (java.awt.Component) ((Object) jd.field_D));
          var3 = var2.field_l;
          var4 = var2.field_u;
          hd.a(false);
          if (param0 >= -58) {
            field_l = (ko) null;
          }
          kn.field_p = new dl(var3, var4 * 3 / 4);
          kn.field_p.a();
          var2.c(0, 0);
          ne.field_e = new dl(var3, var4 - kn.field_p.field_u);
          ne.field_e.a();
          var2.c(0, -kn.field_p.field_u);
          ne.field_e.field_t = kn.field_p.field_u;
          lg.a(1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "de.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final nj a(int param0, nj param1) {
        de var3 = null;
        RuntimeException var3_ref = null;
        nj stackIn_2_0 = null;
        nj stackIn_5_0 = null;
        nj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            stackIn_2_0 = (nj) null;
            return stackIn_2_0;
          }
          var3 = new de(this.field_i);
          if (null == this.field_j) {
            stackIn_5_0 = ng.a(mg.field_h, param1, var3, (byte) -83, hl.field_e);
            return stackIn_5_0;
          }
          var3.field_j = (ea) (this.field_j.clone());
          stackIn_7_0 = ng.a(mg.field_h, param1, var3, (byte) -83, wa.field_j);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("de.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 16736352) {
            return true;
          }
          field_l = (ko) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("de.M(").append(param0).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(')').toString());
        }
    }

    de() {
        this(0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        f stackIn_2_0 = null;
        ig stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -87) {
            stackIn_2_0 = (f) null;
            return stackIn_2_0;
          }
          if (param4 == null) {
            return (f) (this);
          }
          dd.field_c.a(32, 12 * param2, 12 * param1, 0, (byte) -111);
          stackIn_8_0 = new ig(param0, param4, (f) (this), false);
          return (f) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("de.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        if (null != this.field_j) {
          si.field_e.a(128, param2, param1, 60, (byte) -111);
        }
        if (param0 == -29660) {
          return;
        }
        mj var5 = (mj) null;
        this.a(false, (f[][]) null, (mj) null);
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
          field_k = (dl) null;
          this.field_i = param0;
          return;
        }
        this.field_i = param0;
    }

    private de(int param0) {
        this.field_j = null;
        this.field_i = param0;
    }

    static {
    }
}
