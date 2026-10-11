/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ak {
    static String field_Jb;
    static String field_Eb;
    static v field_Lb;
    ak field_Fb;
    static String[] field_Hb;
    vp field_Gb;
    ak field_Ib;
    static tf field_Kb;

    gp(long param0, ak param1, ak param2, vp param3) {
        super(param0, (ak) null);
        try {
          this.field_Ib = new ak(0L, param2);
          this.field_Gb = new vp(0L, param3);
          this.a(this.field_Ib, (byte) 26);
          this.a(this.field_Gb, (byte) 26);
          this.field_Fb = param1;
          this.field_Ib.a(param1, (byte) 26);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          dk.field_c = false;
          gj.field_V = false;
          if (null != to.field_r &&
            to.field_r.field_N) {
            if (param2 == 8) {
              if (!to.field_s) {
                param1 = bo.field_b;
              } else {
                param1 = mp.field_e;
              }
              param2 = 2;
              nf.field_b.a(h.field_U, -13939);
            }
            var3_int = 1;
            if (param2 == 10) {
              var3_int = 0;
              dm.i((byte) -51);
            }
            if (var3_int != 0) {
              if (gj.field_V) {
                param1 = sd.a(vf.field_a, 79, new String[]{param1});
              }
              if (ke.field_d) {
                param1 = lh.field_a;
              }
              to.field_r.a(param2, 5804, param1);
            }
            if (256 != param2 &&
              param2 != 10 &&
              !to.field_s) {
              nf.field_b.m(-10515);
            }
          }
          if (!param0) {
            field_Hb = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("gp.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, byte param4) {
        int var6;
        if (this.field_Gb.e((byte) 123)) {
          this.field_Fb.field_wb = this.field_Fb.field_wb + param2;
        }
        var6 = 13 / ((70 - param4) / 55);
        if (this.field_Gb.b((byte) 70)) {
          this.field_Fb.field_wb = this.field_Fb.field_wb - param2;
        }
        if (this.field_Gb.f((byte) 83)) {
          this.field_Fb.field_wb = this.field_Fb.field_wb + param1;
        }
        if (this.field_Gb.j(-1)) {
          this.field_Fb.field_wb = this.field_Fb.field_wb - param1;
        }
        if (this.field_W) {
          this.field_Fb.field_wb = this.field_Fb.field_wb - param3;
        }
        if (param0) {
          if (0 > -(this.field_Fb.field_S + this.field_Fb.field_wb)) {
            this.field_Fb.field_wb = -this.field_Fb.field_S;
          }
          if (this.field_Fb.field_Z + this.field_Fb.field_nb - this.field_Ib.field_nb < -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
            this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z - this.field_Ib.field_nb) - this.field_Fb.field_S;
          }
        } else {
          if (this.field_Fb.field_Z + this.field_Fb.field_nb - this.field_Ib.field_nb < -(this.field_Fb.field_wb + this.field_Fb.field_S)) {
            this.field_Fb.field_wb = -(this.field_Fb.field_nb + this.field_Fb.field_Z - this.field_Ib.field_nb) - this.field_Fb.field_S;
          }
          if (-(this.field_Fb.field_wb + this.field_Fb.field_S) < 0) {
            this.field_Fb.field_wb = -this.field_Fb.field_S;
          }
        }
        if (this.field_Gb.k(92)) {
          this.field_Fb.field_S = -this.field_Gb.a(3, this.field_Fb.field_nb, param0, this.field_Ib.field_nb);
          this.field_Fb.field_wb = 0;
        }
        this.field_Gb.a(this.field_Ib.field_nb, (byte) 108, -this.field_Fb.field_S, this.field_Fb.field_nb);
    }

    private final void a(boolean param0, int param1, int param2) {
        if (!param0) {
          this.field_Ib.field_nb = this.field_nb;
          this.field_Ib.field_K = -param2 + (this.field_K - param1);
          this.field_Fb.field_D = 0;
          this.field_Fb.field_K = -param2 + (this.field_K - param1);
          this.field_Gb.a(-param2 + this.field_K, this.field_Fb.field_nb, this.field_nb, this.field_Ib.field_nb, -this.field_Fb.field_S, param2, 0, -1);
          return;
        }
        field_Jb = (String) null;
        this.field_Ib.field_nb = this.field_nb;
        this.field_Ib.field_K = -param2 + (this.field_K - param1);
        this.field_Fb.field_D = 0;
        this.field_Fb.field_K = -param2 + (this.field_K - param1);
        this.field_Gb.a(-param2 + this.field_K, this.field_Fb.field_nb, this.field_nb, this.field_Ib.field_nb, -this.field_Fb.field_S, param2, 0, -1);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        this.field_K = param3;
        this.field_nb = param5;
        this.field_S = param4;
        this.field_D = param0;
        if (param2 >= 43) {
          this.a(false, param1, param6);
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param3) {
          if (!this.field_W) {
            var8 = 0;
            if (param5 == 7736) {
              this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
              this.a(false, param4, param2, param0, (byte) 127);
              return var8 != 0;
            }
            gp.a(-48, -99L);
            this.field_Fb.a(param1, (byte) -128, var8 != 0, this.field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8 != 0;
          }
          if (param6) {
            var8Lifetime2 = 0;
            if (param5 == 7736) {
              this.field_Fb.a(param1, (byte) -128, var8Lifetime2 != 0, this.field_Ib.field_nb);
              this.a(false, param4, param2, param0, (byte) 127);
              return var8Lifetime2 != 0;
            }
            gp.a(-48, -99L);
            this.field_Fb.a(param1, (byte) -128, var8Lifetime2 != 0, this.field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8Lifetime2 != 0;
          }
          var8Lifetime3 = 1;
          if (param5 == 7736) {
            this.field_Fb.a(param1, (byte) -128, var8Lifetime3 != 0, this.field_Ib.field_nb);
            this.a(false, param4, param2, param0, (byte) 127);
            return var8Lifetime3 != 0;
          }
          gp.a(-48, -99L);
          this.field_Fb.a(param1, (byte) -128, var8Lifetime3 != 0, this.field_Ib.field_nb);
          this.a(false, param4, param2, param0, (byte) 127);
          return var8Lifetime3 != 0;
        }
        var8Lifetime1 = 1;
        if (param5 == 7736) {
          this.field_Fb.a(param1, (byte) -128, var8Lifetime1 != 0, this.field_Ib.field_nb);
          this.a(false, param4, param2, param0, (byte) 127);
          return var8Lifetime1 != 0;
        }
        gp.a(-48, -99L);
        this.field_Fb.a(param1, (byte) -128, var8Lifetime1 != 0, this.field_Ib.field_nb);
        this.a(false, param4, param2, param0, (byte) 127);
        return var8Lifetime1 != 0;
    }

    final static uj a(int param0, long param1) {
        if (param0 == 2) {
          return (uj) (il.field_d.a(param0 - 11436, param1));
        }
        String var4 = (String) null;
        gp.a(true, (String) null, -69);
        return (uj) (il.field_d.a(param0 - 11436, param1));
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.a(param2, this.field_Ib.field_nb, param1, param3, (byte) -43);
        int var5 = -81 / ((param0 + 15) / 62);
    }

    public static void j(int param0) {
        field_Hb = null;
        field_Eb = null;
        if (param0 != 0) {
          return;
        }
        field_Kb = null;
        field_Lb = null;
        field_Jb = null;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param4 == 0) {
          return this.a(param3, param2, param5, param1, this.field_Ib.field_nb, 7736, param0);
        }
        this.a(false, true, -57, 93, -15, 99);
        return this.a(param3, param2, param5, param1, this.field_Ib.field_nb, 7736, param0);
    }

    static {
        field_Eb = "Disruptive behaviour";
        field_Hb = new String[]{"Many grids have a dark edge of cells called the <col=FF9900>buffer</col>. Use these to drop tiles half-on, half-off the central grid. They are not included as part of the picture."};
        field_Jb = "Location";
    }
}
