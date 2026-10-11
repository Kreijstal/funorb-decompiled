/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends al {
    private int field_mb;
    private cf field_kb;
    private int field_rb;
    private int field_lb;
    static int field_nb;
    static String field_ib;
    private int field_gb;
    static long field_sb;
    static int[] field_ob;
    private lf field_pb;
    private int field_qb;
    static cj field_jb;
    private na field_hb;

    public static void l(int param0) {
        if (param0 != 7181) {
          return;
        }
        field_jb = null;
        field_ob = null;
        field_ib = null;
    }

    boolean i(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_pb != null) {
          if (ld.field_Rb == this.field_pb) {
            fieldTemp$0 = this.field_lb + 1;
            this.field_lb = this.field_lb + 1;
            if (fieldTemp$0 != this.field_qb) {
              this.field_hb.field_E = 256 - (this.field_lb << 8) / this.field_qb;
              if (param0 != -27388) {
                this.h(-5);
                return super.i(-27388);
              }
              return super.i(-27388);
            }
            this.field_pb = ll.field_j;
            this.a(this.field_mb, (byte) -112, this.field_rb + (12 + this.field_kb.field_w), 12 + this.field_kb.field_n);
            this.field_lb = 0;
            this.field_hb.field_E = 0;
            if (param0 != -27388) {
              this.h(-5);
              return super.i(-27388);
            }
            return super.i(-27388);
          }
          if (this.field_pb != lf.field_a) {
            if (param0 == -27388) {
              return super.i(-27388);
            }
            this.h(-5);
            return super.i(-27388);
          }
          fieldTemp$1 = this.field_lb + 1;
          this.field_lb = this.field_lb + 1;
          if (fieldTemp$1 == this.field_gb) {
            this.field_hb.field_E = 256;
            this.field_pb = null;
            if (param0 == -27388) {
              return super.i(-27388);
            }
            this.h(-5);
            return super.i(-27388);
          }
          this.field_hb.field_E = (this.field_lb << 8) / this.field_gb;
          if (param0 == -27388) {
            return super.i(-27388);
          }
          this.h(-5);
          return super.i(-27388);
        }
        if (param0 == -27388) {
          return super.i(-27388);
        }
        this.h(-5);
        return super.i(-27388);
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_hb == null) {
            return false;
          }
          if (98 == param0) {
            this.field_hb.a(param2, param3 + 6208);
          }
          if (param0 == 99) {
            this.field_hb.a(param2, 0);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ie.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (null != ki.field_e) {
          oo.f(oo.field_f, oo.field_e, -oo.field_f + oo.field_g, oo.field_d - oo.field_e);
          ki.field_e.c(param0, -1);
          if (param1) {
            field_ob = (int[]) null;
            return;
          }
          return;
        }
        if (!param1) {
          return;
        }
        field_ob = (int[]) null;
    }

    final void j(byte param0) {
        if (param0 >= -70) {
          field_ob = (int[]) null;
          if (ld.field_Rb != this.field_pb) {
            this.field_pb = lf.field_a;
            this.field_lb = 0;
            this.a(this.field_kb, false);
            this.field_hb.field_E = 0;
            this.field_kb = null;
            return;
          }
          return;
        }
        if (ld.field_Rb != this.field_pb) {
          this.field_pb = lf.field_a;
          this.field_lb = 0;
          this.a(this.field_kb, false);
          this.field_hb.field_E = 0;
          this.field_kb = null;
          return;
        }
    }

    final boolean h(int param0) {
        this.h((byte) 30);
        if (param0 != -6134) {
          return false;
        }
        return super.h(-6134);
    }

    ie(vk param0, cf param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, 12 + (param2 + param1.field_w));
        try {
          this.field_gb = param3;
          this.field_qb = param3;
          this.field_mb = param4;
          this.field_rb = param2;
          this.a(param1, false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ie.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(byte param0) {
        if (this.field_pb == null) {
          super.h((byte) 63);
          if (param0 < 29) {
            this.h(-78);
            return;
          }
          return;
        }
        if (this.field_pb != lf.field_a) {
          this.b(12 + this.field_kb.field_n, this.field_kb.field_w + (this.field_rb + 12), 78);
          this.a(this.field_kb, false);
        } else {
          this.field_pb = null;
          this.field_hb.field_E = 256;
          super.h((byte) 63);
          if (param0 < 29) {
            this.h(-78);
            return;
          }
          return;
        }
        this.field_pb = null;
        this.field_hb.field_E = 256;
        super.h((byte) 63);
        if (param0 >= 29) {
          return;
        }
        this.h(-78);
    }

    void a(cf param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_kb = param0;
          var3_int = -11 % ((param1 - 61) / 56);
          if (this.field_pb == ll.field_j) {
            this.a(this.field_mb, (byte) -112, 12 + this.field_rb + this.field_kb.field_w, this.field_kb.field_n + 12);
            this.field_lb = 0;
            return;
          }
          if (ld.field_Rb == this.field_pb) {
            return;
          }
          this.field_lb = 0;
          this.field_pb = ld.field_Rb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ie.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(cf param0, boolean param1) {
        try {
          if (param1) {
            this.field_lb = -61;
          }
          if (null != this.field_hb) {
            this.field_hb.a(true);
          }
          if (param0 != null) {
            param0.b(6, 6 + this.field_rb, 28972, param0.field_n, param0.field_w);
            this.field_hb = new na(param0);
          } else {
            this.field_hb = new na();
          }
          this.b((byte) 95, this.field_hb);
          this.field_kb = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ie.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
