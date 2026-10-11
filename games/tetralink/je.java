/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static hl field_e;
    static db field_d;
    static int[] field_b;
    mc field_c;
    static int field_f;
    private mc field_a;
    static String field_g;
    static int[] field_h;

    final void b(int param0) {
        mc var2;
        int var3;
        var3 = TetraLink.field_J;
        while (true) {
          var2 = this.field_c.field_j;
          if (var2 != this.field_c) {
            var2.b(false);
            continue;
          }
          break;
        }
        this.field_a = null;
        if (param0 != 1) {
          field_h = (int[]) null;
        }
        return;
    }

    final mc a(byte param0, mc param1) {
        mc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        mc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_c.field_j;
          }
          if (this.field_c == var3) {
            this.field_a = null;
            stackIn_6_0 = null;
            return (mc) (stackIn_6_0);
          }
          if (param0 != -10) {
            field_g = (String) null;
          }
          this.field_a = var3.field_j;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("je.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final mc a(byte param0) {
        mc var2 = this.field_a;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_j;
        if (param0 != -70) {
          mc var3 = (mc) null;
          this.a((mc) null, -40);
        }
        return var2;
    }

    final mc d(boolean param0) {
        if (!param0) {
          field_b = (int[]) null;
        }
        mc var2 = this.field_c.field_e;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_e;
        return var2;
    }

    final mc c(byte param0) {
        if (param0 < 123) {
          field_g = (String) null;
        }
        mc var2 = this.field_c.field_e;
        if (var2 == this.field_c) {
          return null;
        }
        var2.b(false);
        return var2;
    }

    final mc c(boolean param0) {
        if (param0) {
          mc var3 = (mc) null;
          this.a((mc) null, 0);
        }
        mc var2 = this.field_c.field_j;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_j;
        return var2;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          je.a(-87);
        }
        return this.field_c == this.field_c.field_j ? true : false;
    }

    final static void a(int param0, int param1, bh param2, int param3, int param4) {
        param2.a(12, false);
        param2.b(17, false);
        param2.b(param1, false);
        param2.b(param4, false);
        if (param0 >= -32) {
          return;
        }
        try {
          param2.a(param3, false);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "je.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_h = null;
        field_d = null;
        int var1 = -31 % ((param0 + 60) / 59);
    }

    final mc d(byte param0) {
        mc var2 = this.field_a;
        if (var2 == this.field_c) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_e;
        if (param0 != 14) {
          this.b(true);
        }
        return var2;
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        bh var5 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var6 = 0;
        var4 = TetraLink.field_J;
        try {
          var1 = vi.field_a;
          synchronized (var1) {
            dh.field_m = bb.field_e;
            if (param0 != 13397) {
              var5 = (bh) null;
              je.a(15, 10, (bh) null, 22, 69);
            }
            wk.field_c = wk.field_c + 1;
            if (mh.field_b < 0) {
              var6 = 0;
              var2 = var6;
              while (var6 < 112) {
                sn.field_a[var6] = false;
                var6++;
              }
              mh.field_b = s.field_d;
            } else {
              while (s.field_d != mh.field_b) {
                var2 = ah.field_g[s.field_d];
                s.field_d = 127 & 1 + s.field_d;
                if (var2 < 0) {
                  sn.field_a[~var2] = false;
                  continue;
                }
                sn.field_a[var2] = true;
              }
            }
            bb.field_e = eh.field_n;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "je.C(" + param0 + ')');
        }
    }

    final void a(mc param0, boolean param1) {
        try {
          if (null != param0.field_e) {
            param0.b(false);
          }
          if (param1) {
            this.d((byte) 106);
          }
          param0.field_j = this.field_c;
          param0.field_e = this.field_c.field_e;
          param0.field_e.field_j = param0;
          param0.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "je.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final mc a(boolean param0) {
        mc var2 = this.field_c.field_j;
        if (var2 == this.field_c) {
          return null;
        }
        var2.b(param0);
        return var2;
    }

    final static void a(boolean param0, int param1, String param2, boolean param3, int param4) {
        String stackIn_4_0 = null;
        boolean stackIn_26_0 = false;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = TetraLink.field_J;
        try {
          ma.field_g = true;
          bm.field_q = param1;
          var11 = param2;
          if (!param0) {
            stackIn_4_0 = ug.field_X;
          } else {
            stackIn_4_0 = hl.field_ub;
          }
          var6 = stackIn_4_0;
          if (bm.field_q == 0) {
            var7 = t.a(480, 118, var11, jj.field_d, ko.field_u);
            var8 = 3 + var7;
            hk.field_b = new String[var8];
            bi.field_c = new int[var8];
            for (var9 = 0; var8 > var9; var9++) {
              bi.field_c[var9] = -1;
            }
            j.field_x = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              hk.field_b[var9] = jj.field_d[var9];
            }
            hk.field_b[var8 - 3] = "";
            hk.field_b[-2 + var8] = var6;
            bi.field_c[var8 - 2] = 0;
            j.field_x[0] = 1;
            hk.field_b[var8 - 1] = d.field_a;
            bi.field_c[var8 - 1] = 1;
            j.field_x[1] = 2;
          } else {
            if (1 != bm.field_q) {
              throw new IllegalArgumentException();
            }
            var7 = t.a(480, 108, var11, jj.field_d, ko.field_u);
            var8 = 2 + var7;
            bi.field_c = new int[var8];
            hk.field_b = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              bi.field_c[var9] = -1;
            }
            j.field_x = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              hk.field_b[var9] = jj.field_d[var9];
            }
            hk.field_b[var8 - 2] = "";
            hk.field_b[var8 - 1] = d.field_a;
            bi.field_c[var8 - 1] = 0;
            j.field_x[0] = 2;
          }
          hb.field_a.field_g = j.field_x.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; hk.field_b.length > var8Lifetime1; var8Lifetime1++) {
            stackIn_26_0 = !(bi.field_c[var8Lifetime1] < 0);
            var9Lifetime1 = tn.a(stackIn_26_0, 1, hk.field_b[var8Lifetime1]);
            if (-1 != bi.field_c[var8Lifetime1]) {
              var9Lifetime1 = var9Lifetime1 + 2 * ao.field_a;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          if (param4 != -1381732671) {
            field_e = (hl) null;
          }
          hk.field_a = (hc.field_q + cd.field_e << 1) * hb.field_a.field_g;
          ja.field_j = nh.field_Nb - (var7Lifetime1 >> 1);
          hd.field_q = -(var7Lifetime1 >> 1) + (var7Lifetime1 + nh.field_Nb);
          for (var8Lifetime2 = 0; var8Lifetime2 < hk.field_b.length; var8Lifetime2++) {
            stackIn_39_0 = hk.field_a;
            if (bi.field_c[var8Lifetime2] < 0) {
              stackIn_40_1 = hl.field_wb;
            } else {
              stackIn_40_1 = i.field_n;
            }
            hk.field_a = stackIn_39_0 + stackIn_40_1;
          }
          ab.field_Q = -(hk.field_a >> 1) + fk.field_S;
          hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 126), 0, param3, -98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_45_0 = var5;
          stackIn_45_1 = new StringBuilder().append("je.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(mc param0, int param1) {
        try {
          if (null != param0.field_e) {
            param0.b(false);
          }
          param0.field_e = this.field_c;
          param0.field_j = this.field_c.field_j;
          param0.field_e.field_j = param0;
          int var3_int = -56 / ((param1 - 37) / 58);
          param0.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "je.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public je() {
        this.field_c = new mc();
        this.field_c.field_e = this.field_c;
        this.field_c.field_j = this.field_c;
    }

    static {
        field_b = new int[256];
        field_d = new db(14, 0, 4, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
