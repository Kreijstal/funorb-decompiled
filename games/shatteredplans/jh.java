/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends vd implements ok {
    private boolean field_y;
    static String field_v;
    private int field_x;
    private bi field_E;
    private int field_u;
    private String field_G;
    private int field_z;
    static boolean field_D;
    private String field_C;
    static ga field_B;
    private bi field_F;
    private int field_w;

    final void g(int param0) {
        this.field_y = true;
        if (param0 < 80) {
          this.e((byte) 91);
        }
    }

    public static void d(byte param0) {
        field_v = null;
        if (param0 < 74) {
          field_D = false;
          field_B = null;
          return;
        }
        field_B = null;
    }

    final boolean f(int param0) {
        if (param0 != 244874369) {
          this.field_G = (String) null;
          return this.field_y;
        }
        return this.field_y;
    }

    final void a(int param0) {
        int var2 = 122 / ((param0 - 67) / 47);
        if (!this.field_s) {
          return;
        }
        if (this.field_y) {
          if (-1 != this.field_z) {
            gf.d(this.field_k, this.field_t, this.field_m, this.field_i, this.field_z);
            if (this.field_F != null) {
              this.field_F.f(this.field_k + (this.field_m - this.field_F.field_z) / 2, (this.field_i - this.field_F.field_w) / 2 + this.field_t);
            }
            if (this.field_G != null) {
              rs.field_Cb.c(this.field_G, this.field_m / 2 + 1 + this.field_k, rs.field_Cb.field_J / 2 + (this.field_i / 2 + this.field_t), this.field_u, -1);
              return;
            }
            return;
          }
          if (this.field_F != null) {
            this.field_F.f(this.field_k + (this.field_m - this.field_F.field_z) / 2, (this.field_i - this.field_F.field_w) / 2 + this.field_t);
          }
          if (this.field_G == null) {
            return;
          }
          rs.field_Cb.c(this.field_G, this.field_m / 2 + 1 + this.field_k, rs.field_Cb.field_J / 2 + (this.field_i / 2 + this.field_t), this.field_u, -1);
          return;
        }
        if (this.field_w != -1) {
          gf.d(this.field_k, this.field_t, this.field_m, this.field_i, this.field_w);
          if (this.field_E == null) {
            if (null != this.field_C) {
              rs.field_Cb.c(this.field_C, this.field_m / 2 + (1 + this.field_k), rs.field_Cb.field_J / 2 + (this.field_i / 2 + this.field_t), this.field_x, -1);
            }
            return;
          }
          this.field_E.f((-this.field_E.field_z + this.field_m) / 2 + this.field_k, (this.field_i - this.field_E.field_w) / 2 + this.field_t);
          if (null != this.field_C) {
            rs.field_Cb.c(this.field_C, this.field_m / 2 + (1 + this.field_k), rs.field_Cb.field_J / 2 + (this.field_i / 2 + this.field_t), this.field_x, -1);
          }
          return;
        }
        if (this.field_E != null) {
          this.field_E.f((-this.field_E.field_z + this.field_m) / 2 + this.field_k, (this.field_i - this.field_E.field_w) / 2 + this.field_t);
          if (null != this.field_C) {
            rs.field_Cb.c(this.field_C, this.field_m / 2 + (1 + this.field_k), rs.field_Cb.field_J / 2 + (this.field_i / 2 + this.field_t), this.field_x, -1);
          }
          return;
        }
        if (null != this.field_C) {
          rs.field_Cb.c(this.field_C, this.field_m / 2 + (1 + this.field_k), rs.field_Cb.field_J / 2 + (this.field_i / 2 + this.field_t), this.field_x, -1);
          return;
        }
    }

    final static void a(qr param0, qr param1, qr param2, qr param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (ck.field_a != null) {
            return;
          }
          sr.field_h = false;
          if (bg.field_g) {
            var5 = uh.field_d;
          } else {
            if (ae.field_b) {
              var5 = pg.field_E;
            } else {
              var5 = sl.field_q;
            }
          }
          var7 = (String) null;
          cq.a(-114, ho.field_c, (String) null, var5, 0);
          ck.field_a = uq.field_j;
          uq.field_j.field_ab = -(8355711 & ho.field_c >> 1) + (ho.field_c + ((16711422 & bh.field_k.field_ab) >> 1));
          uq.field_j.field_jb = -(8355711 & ho.field_c >> 1) + ho.field_c + ((bh.field_k.field_jb & 16711422) >> 1);
          er.field_j = cg.field_C;
          uq.field_j.field_qb = -(ho.field_c >> 1 & 8355711) + ho.field_c + (bh.field_k.field_qb >> 1 & 8355711);
          fa.field_X = new qr(0L, param1);
          mb.field_n = new qr(0L, param2);
          fe.field_w = new qr(0L, (qr) null);
          sg.field_Ab = new qr(0L, param3);
          uq.field_j = new qr((long)param4, param0);
          uq.field_j.field_nb = ho.field_f;
          sg.field_Ab.a(4, uq.field_j);
          cg.field_C = new qr(0L, er.field_j);
          sg.field_Ab.a(4, cg.field_C);
          hd.field_m = new qr(0L, bh.field_k, ld.field_n);
          cb.field_l = new qr(0L, bh.field_k);
          fa.field_X.a(4, mb.field_n);
          fa.field_X.a(4, fe.field_w);
          fe.field_w.a(4, sg.field_Ab);
          fe.field_w.a(param4 + 4, hd.field_m);
          fe.field_w.a(4, cb.field_l);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("jh.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    jh(int param0, int param1, int param2, int param3, int param4, bi param5, String param6, int param7, int param8, bi param9, String param10, int param11) {
        super(param0, param1, param2, param3);
        try {
          this.field_y = false;
          this.field_u = param11;
          this.field_z = param8;
          this.field_E = param5;
          this.field_G = param10;
          this.field_F = param9;
          this.field_x = param7;
          this.field_w = param4;
          this.field_C = param6;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ')');
        }
    }

    final void e(byte param0) {
        this.field_y = !this.field_y ? true : false;
        if (param0 <= 1) {
          field_B = (ga) null;
          return;
        }
    }

    final void d(boolean param0) {
        this.field_y = param0 ? true : false;
    }

    static {
        field_v = "Loading extra data";
        field_D = false;
    }
}
