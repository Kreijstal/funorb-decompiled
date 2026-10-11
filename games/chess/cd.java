/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends pk {
    private boolean field_w;
    private int field_v;
    private String field_m;
    static w field_x;
    private lh field_t;
    private int field_o;
    static int field_p;
    boolean field_u;
    private boolean field_y;
    private rk field_q;
    private rk field_s;
    private rk field_r;
    private int field_n;

    final void c(byte param0) {
        int var3;
        var3 = Chess.field_G;
        if (this.field_v == bi.field_f) {
          this.field_r.a(this.field_i, this.field_k);
        } else {
          if (this.field_v != ji.field_O) {
            this.field_q.a(this.field_i, this.field_k);
          } else {
            if (null != this.field_s) {
              this.field_s.a(this.field_i, this.field_k);
            } else {
              this.field_q.a(this.field_i, this.field_k);
            }
          }
        }
        if (param0 != 56) {
          return;
        }
        if (null != this.field_t) {
          this.field_t.b(this.field_m, this.field_q.field_j / 2 + this.field_i, this.field_t.field_G / 2 + (this.field_q.field_i / 2 + this.field_k), this.field_o, this.field_n);
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -73) {
            field_p = 49;
          }
          stackIn_3_0 = sc.field_c.a("", 30045, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cd.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean c(int param0) {
        int var2 = 71 / ((-5 - param0) / 50);
        if (!this.a((byte) -9)) {
          return false;
        }
        if (wh.field_f != 1) {
          return false;
        }
        if (this.field_w) {
          return true;
        }
        if (this.field_u) {
          return false;
        }
        return true;
    }

    final boolean a(byte param0) {
        if (param0 == -9) {
          return this.field_q.b(this.field_i, this.field_k, hn.field_k, rf.field_b);
        }
        this.field_t = (lh) null;
        return this.field_q.b(this.field_i, this.field_k, hn.field_k, rf.field_b);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    private final void d(byte param0) {
        boolean stackIn_19_1 = false;
        boolean stackIn_39_1 = false;
        boolean stackIn_54_1 = false;
        boolean stackIn_77_1 = false;
        int var3;
        byte[] var4;
        byte[] var4Lifetime1;
        byte[] var4Lifetime2;
        byte[] var4Lifetime3;
        byte[] var4Lifetime4;
        var3 = Chess.field_G;
        if (this.field_d) {
          this.field_v = bi.field_f;
          if (!this.field_y) {
            if (this.c(91)) {
              this.field_d = true;
            } else {
              this.field_d = false;
            }
            if (param0 == 34) {
              return;
            }
            var4 = (byte[]) null;
            cd.a(67, (byte[]) null, true, -63, -46, 41);
            return;
          }
          if (!this.c(82)) {
            if (param0 == 34) {
              return;
            }
            var4Lifetime3 = (byte[]) null;
            cd.a(67, (byte[]) null, true, -63, -46, 41);
            return;
          }
          stackIn_77_1 = !(this.field_d);
          this.field_d = stackIn_77_1;
          if (param0 == 34) {
            return;
          }
          var4Lifetime4 = (byte[]) null;
          cd.a(67, (byte[]) null, true, -63, -46, 41);
          return;
        }
        if (!this.a((byte) -9)) {
          this.field_v = mi.field_r;
          if (this.field_y) {
            if (!this.c(82)) {
              if (param0 != 34) {
                var4Lifetime1 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
              }
              return;
            }
            stackIn_54_1 = !(this.field_d);
            this.field_d = stackIn_54_1;
          } else {
            if (this.c(91)) {
              this.field_d = true;
            } else {
              this.field_d = false;
            }
          }
        } else {
          if (1 == wh.field_f) {
            this.field_v = bi.field_f;
            if (!this.field_y) {
              if (!this.c(91)) {
                this.field_d = false;
              } else {
                this.field_d = true;
              }
              if (param0 != 34) {
                var4Lifetime1 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
              }
              return;
            }
            if (!this.c(82)) {
              if (param0 != 34) {
                var4Lifetime1 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
              }
              return;
            }
            stackIn_39_1 = !(this.field_d);
            this.field_d = stackIn_39_1;
          } else {
            this.field_v = ji.field_O;
            if (!this.field_y) {
              if (!this.c(91)) {
                this.field_d = false;
              } else {
                this.field_d = true;
              }
              if (param0 != 34) {
                var4Lifetime1 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
              }
              return;
            }
            if (!this.c(82)) {
              if (param0 != 34) {
                var4Lifetime1 = (byte[]) null;
                cd.a(67, (byte[]) null, true, -63, -46, 41);
              }
              return;
            }
            stackIn_19_1 = !(this.field_d);
            this.field_d = stackIn_19_1;
          }
        }
        if (param0 == 34) {
          return;
        }
        var4Lifetime2 = (byte[]) null;
        cd.a(67, (byte[]) null, true, -63, -46, 41);
    }

    final static void a(byte param0, um param1) {
        km var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new km(param1.a("final_frame.jpg", 30045, ""), (java.awt.Component) ((Object) ja.field_h));
          var3 = var2.field_w;
          var4 = var2.field_t;
          r.k(3029);
          v.field_i = new km(var3, 3 * var4 / 4);
          v.field_i.e();
          if (param0 < 125) {
            String var5 = (String) null;
            cd.a((String) null, -127);
          }
          var2.d(0, 0);
          re.field_u = new km(var3, -v.field_i.field_t + var4);
          re.field_u.e();
          var2.d(0, -v.field_i.field_t);
          re.field_u.field_r = v.field_i.field_t;
          fd.a(28773);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "cd.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1570) {
          field_p = -20;
          field_x = null;
          return;
        }
        field_x = null;
    }

    final static void a(int param0, byte[] param1, boolean param2, int param3, int param4, int param5) {
        nk var6 = null;
        int var7 = 0;
        int var9 = 0;
        try {
          var6 = qn.field_U;
          var6.f(param3, -82);
          var6.field_l = var6.field_l + 1;
          var7 = var6.field_l;
          var6.c(4, (byte) -75);
          int var8 = -76 / ((param5 + 3) / 40);
          var6.c(param4, (byte) 83);
          var9 = param0;
          if (param2) {
            var9 += 128;
          }
          var6.c(var9, (byte) 81);
          var6.a(param1, (byte) -45, 0, param1.length);
          var6.a(var6.field_l - var7, -1);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "cd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        this.d((byte) 34);
        this.field_u = wh.field_f == 1 ? true : false;
        if (param0 > -70) {
          cd.a(18);
          return;
        }
    }

    cd(int param0, int param1, rk param2, rk param3, rk param4, boolean param5, boolean param6) {
        this.field_o = 1;
        this.field_w = false;
        this.field_u = false;
        this.field_y = false;
        this.field_n = -1;
        try {
          this.field_i = param0;
          this.field_y = param5 ? true : false;
          this.field_q = param2;
          this.field_k = param1;
          this.field_w = param6 ? true : false;
          this.field_r = param3;
          this.field_s = param4;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "cd.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
