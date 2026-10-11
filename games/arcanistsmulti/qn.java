/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends ob implements vb {
    private ag field_V;
    static String field_kb;
    static le field_ob;
    static String field_lb;
    static String field_pb;
    static vn field_mb;
    static String field_nb;
    static String field_jb;

    final static void a(int param0, int param1) {
        fd.field_d = 1000000000L / (long)param1;
        if (param0 != 16) {
          field_nb = (String) null;
        }
    }

    final static int k(byte param0) {
        if (param0 != -14) {
          return -111;
        }
        return hd.field_b + ((on.field_h << 4) + (ra.field_m << 2));
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            qn.a(-13, -64, -6, 93, true, 96, 127);
          }
          if (this.field_V != param4) {
            return;
          }
          this.g(109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("qn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final ag a(wc param0, String param1, byte param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_2_0 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ag(param1, param0);
          var4.field_r = (pf) ((Object) new mm());
          var5 = this.field_k - 6;
          this.field_k = this.field_k + 38;
          var4.a(30, var5, -14 + (this.field_v - 16), 15, -128);
          if (param2 <= 1) {
            stackIn_2_0 = (ag) null;
            return stackIn_2_0;
          }
          this.c(-110, var4);
          this.e((byte) 86);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("qn.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, eg param1, eg param2) {
        try {
          bb.field_a = param2;
          an.field_o = param1;
          if (param0 != -24539) {
            qn.a(-80, (byte) 86);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qn.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(int param0) {
        tf var1 = null;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        tf var1Lifetime1;
        try {
          rc.field_m = 0;
          ie.field_Nb = null;
          pc.field_b = 0;
          vd.field_d.c(-124);
          oo.field_B.c(-124);
          var1 = ie.field_Qb.f(-118);
          while (var1 != null) {
            var1.a((byte) 88);
            var1 = ie.field_Qb.a(-1);
          }
          if (param0 < 30) {
            field_ob = (le) null;
          }
          var1Lifetime1 = uc.field_c.f(-63);
          while (var1Lifetime1 != null) {
            var1Lifetime1.a((byte) 88);
            var1Lifetime1 = uc.field_c.a(-1);
          }
          jb.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qn.C(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        if (param0 < 33) {
          return;
        }
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        String var7 = null;
        if (nj.field_c == 2) {
          var7 = ji.field_e;
        } else {
          var7 = vk.field_v;
        }
        if (param1 <= -50) {
          uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
          return;
        }
        eg var8 = (eg) null;
        qn.a(10, (eg) null, (eg) null);
        uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
    }

    final static boolean a(int param0, byte param1) {
        if (param1 >= -6) {
          return false;
        }
        if (param0 == 2) {
          return true;
        }
        if (param0 == 3) {
          return true;
        }
        if (4 == param0) {
          return true;
        }
        if (param0 == 1) {
          return true;
        }
        if (param0 == 14) {
          return true;
        }
        if (param0 != 5) {
          return false;
        }
        return true;
    }

    public static void h(int param0) {
        if (param0 == 1) {
          field_nb = null;
          field_lb = null;
          field_jb = null;
          field_ob = null;
          field_mb = null;
          field_pb = null;
          field_kb = null;
          return;
        }
        qn.k((byte) 17);
        field_nb = null;
        field_lb = null;
        field_jb = null;
        field_ob = null;
        field_mb = null;
        field_pb = null;
        field_kb = null;
    }

    qn(h param0, ih param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm var4 = null;
        try {
          var3 = null;
          if (oo.field_C == param1) {
            var3 = wi.field_j;
          } else {
            if (param1 != vi.field_C) {
              if (param1 == bh.field_c) {
                this.field_k = this.field_k + 30;
                var3 = fl.field_d;
              }
            } else {
              this.field_k = this.field_k + 10;
              var3 = ki.field_w;
              if (ne.b(-22768)) {
                this.field_k = this.field_k + 20;
                var3 = ch.field_f;
              }
            }
          }
          var4 = new qm((String) (var3), (wc) null);
          var4.field_v = this.field_v;
          var4.field_j = 50;
          var4.field_k = 80;
          var4.field_n = 0;
          var4.field_r = (pf) ((Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.c(-86, var4);
          this.field_V = this.a((wc) (this), dd.field_e, (byte) 113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qn.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_kb = "Unit cannot use this ability after being damaged";
        field_lb = "Continue";
        field_pb = "Join";
        field_mb = new vn();
        field_nb = "Report abuse";
        field_jb = "With spells like this, you just need to click on the location you wish the effect to be centred on and the spell will be activated. Try clicking on a target.";
    }
}
