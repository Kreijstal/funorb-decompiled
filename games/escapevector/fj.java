/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends vg {
    static String field_kb;
    private md field_cb;
    static int field_jb;
    static String field_bb;
    private int field_ib;
    private int field_gb;
    private TerrainMaskSupport field_Z;
    private int field_ab;
    static ce field_eb;
    private int field_fb;
    private int field_db;
    private hm field_hb;

    void a(hm param0, int param1) {
        String stackIn_11_2 = null;
        try {
          this.field_hb = param0;
          if (mc.field_c == this.field_Z) {
            this.a(false, this.field_ib, 12 + this.field_hb.field_g, this.field_hb.field_x + this.field_fb + 12);
            this.field_ab = 0;
          } else if (this.field_Z != t.field_a) {
            this.field_ab = 0;
            this.field_Z = t.field_a;
          }
          if (param1 == 30) {
            return;
          }
          this.a((byte) -72);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("fj.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    fj(tb param0, hm param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param1.field_x + (param2 + 12));
        try {
          this.field_ib = param4;
          this.field_db = param3;
          this.field_gb = param3;
          this.field_fb = param2;
          this.b((byte) -123, param1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 50 / ((param0 - 7) / 55);
        this.b(false);
        return super.a((byte) 112);
    }

    public static void n(int param0) {
        field_kb = null;
        if (param0 != -11555) {
          fj.n(-20);
          field_bb = null;
          field_eb = null;
          return;
        }
        field_bb = null;
        field_eb = null;
    }

    final void b(boolean param0) {
        if (null == this.field_Z) {
          super.b(param0);
          return;
        }
        if (this.field_Z != ff.field_b) {
          this.b(255, this.field_hb.field_x + 12 + this.field_fb, 12 + this.field_hb.field_g);
          this.b((byte) -121, this.field_hb);
        } else {
          this.field_Z = null;
          this.field_cb.field_F = 256;
          super.b(param0);
          return;
        }
        this.field_Z = null;
        this.field_cb.field_F = 256;
        super.b(param0);
    }

    boolean j(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (param0 == -13907) {
          if (null == this.field_Z) {
            return super.j(-13907);
          }
          if (this.field_Z != t.field_a) {
            if (ff.field_b != this.field_Z) {
              return super.j(-13907);
            }
            int fieldTemp$0 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$0 != this.field_db) {
              this.field_cb.field_F = (this.field_ab << 8) / this.field_db;
              return super.j(-13907);
            }
            this.field_Z = null;
            this.field_cb.field_F = 256;
            return super.j(-13907);
          }
          int fieldTemp$1 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (this.field_gb == fieldTemp$1) {
            this.field_Z = mc.field_c;
            this.a(false, this.field_ib, 12 + this.field_hb.field_g, 12 - (-this.field_fb - this.field_hb.field_x));
            this.field_ab = 0;
            this.field_cb.field_F = 0;
            return super.j(-13907);
          }
          this.field_cb.field_F = -((this.field_ab << 8) / this.field_gb) + 256;
          return super.j(-13907);
        }
        field_eb = (ce) null;
        if (null == this.field_Z) {
          return super.j(-13907);
        }
        if (this.field_Z != t.field_a) {
          if (ff.field_b != this.field_Z) {
            return super.j(-13907);
          }
          int fieldTemp$2 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (fieldTemp$2 != this.field_db) {
            this.field_cb.field_F = (this.field_ab << 8) / this.field_db;
            return super.j(-13907);
          }
          this.field_Z = null;
          this.field_cb.field_F = 256;
          return super.j(-13907);
        }
        int fieldTemp$3 = this.field_ab + 1;
        this.field_ab = this.field_ab + 1;
        if (this.field_gb == fieldTemp$3) {
          this.field_Z = mc.field_c;
          this.a(false, this.field_ib, 12 + this.field_hb.field_g, 12 - (-this.field_fb - this.field_hb.field_x));
          this.field_ab = 0;
          this.field_cb.field_F = 0;
          return super.j(-13907);
        }
        this.field_cb.field_F = -((this.field_ab << 8) / this.field_gb) + 256;
        return super.j(-13907);
    }

    private final void b(byte param0, hm param1) {
        String stackIn_12_2 = null;
        try {
          if (this.field_cb != null) {
            this.field_cb.unlink((byte) -62);
          }
          if (param1 != null) {
            param1.a(param1.field_g, 6 + this.field_fb, 6, true, param1.field_x);
            this.field_cb = new md(param1);
          } else {
            this.field_cb = new md();
          }
          this.b(this.field_cb, false);
          this.field_hb = null;
          if (param0 <= -72) {
            return;
          }
          this.field_gb = 65;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var3;
          StringBuilder stackIn_11_1 = new StringBuilder().append("fj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        String stackIn_18_2 = null;
        try {
          if (super.a(param0, param1, param2, 43)) {
            return true;
          }
          if (param3 <= 0) {
            this.field_Z = (TerrainMaskSupport) null;
          }
          if (this.field_cb == null) {
            return false;
          }
          if (98 == param2) {
            this.field_cb.a(-4659, param0);
          }
          if (99 == param2) {
            this.field_cb.a(-4659, param0);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("fj.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void m(int param0) {
        if (t.field_a == this.field_Z) {
          return;
        }
        this.field_Z = ff.field_b;
        this.field_ab = 0;
        this.b((byte) -115, this.field_hb);
        int var2 = 41 / ((45 - param0) / 53);
        this.field_hb = null;
        this.field_cb.field_F = 0;
    }

    static {
        field_kb = "Next";
        field_bb = "Checking";
        field_jb = 10;
    }
}
