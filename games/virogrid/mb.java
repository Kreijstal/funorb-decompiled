/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb extends dc {
    private int field_lb;
    static int[][] field_db;
    static int[] field_bb;
    private int field_jb;
    static String field_eb;
    static String field_mb;
    private int field_cb;
    private int field_hb;
    private int field_nb;
    private fi field_ib;
    private on field_fb;
    static String field_gb;
    private kn field_kb;

    boolean f(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (param0 == 3) {
          if (null == this.field_fb) {
            return super.f(3);
          }
          if (dk.field_e == this.field_fb) {
            fieldTemp$0 = this.field_jb + 1;
            this.field_jb = this.field_jb + 1;
            if (fieldTemp$0 != this.field_cb) {
              this.field_kb.field_H = 256 - (this.field_jb << 8) / this.field_cb;
              return super.f(3);
            }
            this.field_fb = lm.field_e;
            this.a(this.field_lb + (12 + this.field_ib.field_m), param0 ^ 3, this.field_nb, 12 + this.field_ib.field_g);
            this.field_kb.field_H = 0;
            this.field_jb = 0;
            return super.f(3);
          }
          if (vf.field_b != this.field_fb) {
            return super.f(3);
          }
          fieldTemp$1 = this.field_jb + 1;
          this.field_jb = this.field_jb + 1;
          if (this.field_hb == fieldTemp$1) {
            this.field_fb = null;
            this.field_kb.field_H = 256;
            return super.f(3);
          }
          this.field_kb.field_H = (this.field_jb << 8) / this.field_hb;
          return super.f(3);
        }
        this.field_lb = -93;
        if (null == this.field_fb) {
          return super.f(3);
        }
        if (dk.field_e == this.field_fb) {
          fieldTemp$2 = this.field_jb + 1;
          this.field_jb = this.field_jb + 1;
          if (fieldTemp$2 != this.field_cb) {
            this.field_kb.field_H = 256 - (this.field_jb << 8) / this.field_cb;
            return super.f(3);
          }
          this.field_fb = lm.field_e;
          this.a(this.field_lb + (12 + this.field_ib.field_m), param0 ^ 3, this.field_nb, 12 + this.field_ib.field_g);
          this.field_kb.field_H = 0;
          this.field_jb = 0;
          return super.f(3);
        }
        if (vf.field_b != this.field_fb) {
          return super.f(3);
        }
        int fieldTemp$3 = this.field_jb + 1;
        this.field_jb = this.field_jb + 1;
        if (this.field_hb == fieldTemp$3) {
          this.field_fb = null;
          this.field_kb.field_H = 256;
          return super.f(3);
        }
        this.field_kb.field_H = (this.field_jb << 8) / this.field_hb;
        return super.f(3);
    }

    void b(fi param0, byte param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ib = param0;
          if (this.field_fb != lm.field_e) {
            if (this.field_fb != dk.field_e) {
              this.field_jb = 0;
              this.field_fb = dk.field_e;
            }
          } else {
            this.a(this.field_ib.field_m + (12 + this.field_lb), param1 ^ -53, this.field_nb, this.field_ib.field_g + 12);
            this.field_jb = 0;
          }
          if (param1 == -53) {
            return;
          }
          var4 = (fi) null;
          this.a((fi) null, '￈', 62, -58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mb.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
          mb.g((byte) -40);
          return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final void j(int param0) {
        if (null == this.field_fb) {
          super.j(param0);
          return;
        }
        if (this.field_fb != vf.field_b) {
          this.c(this.field_ib.field_m + 12 + this.field_lb, 120, 12 + this.field_ib.field_g);
          this.c(6, this.field_ib);
        } else {
          this.field_kb.field_H = 256;
          this.field_fb = null;
          super.j(param0);
          return;
        }
        this.field_kb.field_H = 256;
        this.field_fb = null;
        super.j(param0);
    }

    final void i(int param0) {
        if (this.field_fb == dk.field_e) {
          return;
        }
        this.field_jb = 0;
        this.field_fb = vf.field_b;
        this.c(6, this.field_ib);
        if (param0 > 43) {
          this.field_kb.field_H = 0;
          this.field_ib = null;
          return;
        }
    }

    private final void c(int param0, fi param1) {
        if (param0 != 6) {
          return;
        }
        try {
          if (this.field_kb != null) {
            this.field_kb.a(false);
          }
          if (param1 != null) {
            param1.a(param1.field_m, true, 6 + this.field_lb, 6, param1.field_g);
            this.field_kb = new kn(param1);
          } else {
            this.field_kb = new kn();
          }
          this.a((fi) (this.field_kb), (byte) -78);
          this.field_ib = null;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mb(je param0, fi param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param2 + (12 + param1.field_m));
        try {
          this.field_hb = param3;
          this.field_cb = param3;
          this.field_lb = param2;
          this.field_nb = param4;
          this.c(6, param1);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void h(byte param0) {
        field_bb = null;
        field_gb = null;
        field_mb = null;
        if (param0 >= 118) {
          field_eb = null;
          field_db = (int[][]) null;
          return;
        }
        field_db = (int[][]) null;
        field_eb = null;
        field_db = (int[][]) null;
    }

    final static void a(int param0, byte param1, mg[] param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 != null &&
            0 < param0) {
            var5_int = param2[0].field_u;
            var6 = param2[2].field_u;
            var7 = param2[1].field_u;
            param2[0].d(param3, param4);
            param2[2].d(-var6 + param0 + param3, param4);
            df.b(od.field_m);
            df.h(param3 + var5_int, param4, -var6 + param0 + param3, param2[1].field_z + param4);
            if (param1 != -117) {
              return;
            }
            var8 = param3 + var5_int;
            var9 = param0 + (param3 - var6);
            for (param3 = var8; var9 > param3; param3 = param3 + var7) {
              param2[1].d(param3, param4);
            }
            df.a(od.field_m);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mb.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void i(byte param0) {
        mi.field_d = sh.field_qb.h(-118);
        if (param0 < 42) {
          return;
        }
        CharSequence var2 = (CharSequence) ((Object) mi.field_d);
        wn.field_n = c.a(var2, true);
    }

    final static java.applet.Applet g(byte param0) {
        int var1 = 114 / ((param0 + 37) / 43);
        if (ai.field_a != null) {
          return ai.field_a;
        }
        return (java.applet.Applet) ((Object) jj.field_n);
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 32 % ((-75 - param3) / 36);
          if (super.a(param0, param1, param2, -117)) {
            return true;
          }
          if (this.field_kb == null) {
            return false;
          }
          if (param2 == 98) {
            this.field_kb.a(param0, -8515);
          }
          if (param2 == 99) {
            this.field_kb.a(param0, -8515);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("mb.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        this.j(-4236);
        int var2 = 32 % ((param0 - 50) / 33);
        return super.a((byte) -71);
    }

    static {
        field_eb = "Blue";
        field_gb = "Please enter your age in years";
        field_mb = "Create a free account to start using this feature";
    }
}
