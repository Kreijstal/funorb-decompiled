/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String[] field_e;
    static ji field_a;
    static int[] field_d;
    bh field_c;
    private bh field_b;

    final boolean b(int param0) {
        if (param0 >= -1) {
          field_d = (int[]) null;
        }
        return this.field_c.field_b == this.field_c ? true : false;
    }

    final void c(int param0) {
        bh var2;
        int var3;
        bh var4;
        var3 = client.field_A ? 1 : 0;
        if (param0 < 104) {
          var4 = (bh) null;
          this.a((bh) null, 114);
        }
        while (true) {
          var2 = this.field_c.field_b;
          if (this.field_c != var2) {
            var2.b((byte) 120);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    final bh d(int param0) {
        if (param0 >= -23) {
          return (bh) null;
        }
        bh var2 = this.field_c.field_a;
        if (this.field_c == var2) {
          return null;
        }
        var2.b((byte) 115);
        return var2;
    }

    final void a(int param0, bh param1, vj param2) {
        bh var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var4 = this.field_c.field_a;
          this.field_c.field_a = param1.field_a;
          param1.field_a.field_b = this.field_c;
          if (param0 > -95) {
            this.field_b = (bh) null;
          }
          if (param1 != this.field_c) {
            param1.field_a = param2.field_c.field_a;
            param1.field_a.field_b = param1;
            var4.field_b = param2.field_c;
            param2.field_c.field_a = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("vj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final bh a(int param0, bh param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        bh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 1) {
            this.b(-55);
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_c.field_b;
          }
          if (this.field_c != var3) {
            this.field_b = var3.field_b;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (bh) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        ck var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = client.field_A ? 1 : 0;
        try {
          cm.field_f.b(-30693);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            sf.field_y[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            jd.field_Ub[var1_intLifetime1] = 0L;
          }
          vm.field_r = 0;
          if (!param0) {
            var3 = (ck) null;
            vj.a((ck) null, -91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "vj.H(" + param0 + ')');
        }
    }

    final bh c(boolean param0) {
        if (!param0) {
          field_d = (int[]) null;
        }
        bh var2 = this.field_b;
        if (var2 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    public static void b(byte param0) {
        if (param0 != 79) {
          return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static ck[] a(ck param0, int param1) {
        ck[] var2 = null;
        RuntimeException var2_ref = null;
        ck[] var3 = null;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32169) {
            vj.e(-16);
          }
          var3 = new ck[9];
          var2 = var3;
          var3[4] = param0;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("vj.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final bh c(byte param0) {
        int var2 = -55 / ((param0 + 17) / 35);
        bh var3 = this.field_c.field_b;
        if (var3 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var3.field_b;
        return var3;
    }

    final void a(bh param0, int param1) {
        if (param0.field_a != null) {
          param0.b((byte) 124);
        }
        param0.field_b = this.field_c;
        param0.field_a = this.field_c.field_a;
        if (param1 != 2777) {
          return;
        }
        try {
          param0.field_a.field_b = param0;
          param0.field_b.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bh d(boolean param0) {
        if (!param0) {
          return (bh) null;
        }
        bh var2 = this.field_b;
        if (var2 == this.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final bh b(boolean param0) {
        if (!param0) {
          return (bh) null;
        }
        bh var2 = this.field_c.field_a;
        if (this.field_c == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    final void b(bh param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0.field_a != null) {
            param0.b((byte) 115);
          }
          param0.field_b = this.field_c.field_b;
          param0.field_a = this.field_c;
          param0.field_a.field_b = param0;
          param0.field_b.field_a = param0;
          if (param1 != 7143) {
            this.d(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vj.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final bh a(int param0) {
        bh var2 = this.field_c.field_b;
        if (this.field_c == var2) {
          return null;
        }
        var2.b((byte) 108);
        if (param0 != 4) {
          return (bh) null;
        }
        return var2;
    }

    final int a(byte param0) {
        int var5 = client.field_A ? 1 : 0;
        int var2 = 0;
        int var3 = 60 % ((param0 - 13) / 50);
        bh var4 = this.field_c.field_b;
        while (this.field_c != var4) {
          var2++;
          var4 = var4.field_b;
        }
        return var2;
    }

    public vj() {
        this.field_c = new bh();
        this.field_c.field_a = this.field_c;
        this.field_c.field_b = this.field_c;
    }

    final static qm[] e(int param0) {
        if (param0 != -23521) {
          vj.a(false);
        }
        return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
    }

    static {
        field_d = new int[8192];
    }
}
