/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gd extends ac {
    private ja field_xb;
    static fh field_kb;
    static String field_ob;
    private int field_rb;
    private int field_yb;
    static gh field_jb;
    static boolean field_ub;
    private ui field_nb;
    private int field_tb;
    private int field_vb;
    private int field_ib;
    static al field_qb;
    static gh field_sb;
    private lh field_pb;
    static int field_lb;
    static gh field_wb;
    static int field_mb;

    final static gh l(byte param0) {
        int var1 = 116 / ((param0 + 52) / 48);
        return vi.field_W.field_Wb;
    }

    boolean i(int param0) {
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int var3;
        var3 = SteelSentinels.field_G;
        if (param0 != -8350) {
          field_ub = false;
        }
        if (this.field_xb != null) {
          if (this.field_xb != mj.field_Yb) {
            if (ob.field_t == this.field_xb) {
              fieldTemp$11 = this.field_vb + 1;
              this.field_vb = this.field_vb + 1;
              if (fieldTemp$11 == this.field_tb) {
                this.field_nb.field_R = 256;
                this.field_xb = null;
              } else {
                this.field_nb.field_R = (this.field_vb << 8) / this.field_tb;
              }
            }
          } else {
            fieldTemp$12 = this.field_vb + 1;
            this.field_vb = this.field_vb + 1;
            if (fieldTemp$12 != this.field_yb) {
              this.field_nb.field_R = -((this.field_vb << 8) / this.field_yb) + 256;
            } else {
              this.field_xb = gi.field_q;
              this.a((byte) 103, 12 - (-this.field_rb - this.field_pb.field_E), this.field_pb.field_x + 12, this.field_ib);
              this.field_vb = 0;
              this.field_nb.field_R = 0;
            }
          }
        }
        return super.i(-8350);
    }

    void c(lh param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -22908735) {
            return;
          }
          this.field_pb = param0;
          if (gi.field_q == this.field_xb) {
            this.a((byte) 103, this.field_pb.field_E + this.field_rb + 12, this.field_pb.field_x + 12, this.field_ib);
            this.field_vb = 0;
          } else {
            if (mj.field_Yb != this.field_xb) {
              this.field_vb = 0;
              this.field_xb = mj.field_Yb;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gd.NB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_wb = null;
        if (param0 != -12930) {
          gd.l((byte) 66);
        }
        field_ob = null;
        field_jb = null;
        field_qb = null;
        field_kb = null;
        field_sb = null;
    }

    final void j(byte param0) {
        if (this.field_xb == mj.field_Yb) {
          return;
        }
        this.field_vb = 0;
        this.field_xb = ob.field_t;
        this.c(-12243, this.field_pb);
        if (param0 < 6) {
          lh var3 = (lh) null;
          this.c(90, (lh) null);
        }
        this.field_nb.field_R = 0;
        this.field_pb = null;
    }

    final static int[] b(int param0, int param1, byte param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = SteelSentinels.field_G;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = param0 >> 16 & 255;
        int var5 = 255 & param0 >> 8;
        int var6 = param0 & 255;
        int var7 = (param1 & 16749042) >> 16;
        if (param2 != -104) {
          field_ub = true;
        }
        int var8 = param1 >> 8 & 255;
        int var9 = 255 & param1;
        for (var10 = 0; var10 < 256; var10++) {
          var11 = -var10 + 256;
          var13[var10] = (var10 * var6 >> 8) + ((var9 * var11 >> 8) + ((var5 * var10 >> 8) + (var11 * var8 >> 8) << 8) + ((var10 * var4 >> 8) + (var11 * var7 >> 8) << 16));
        }
        return var3;
    }

    private final void c(int param0, lh param1) {
        try {
          if (this.field_nb != null) {
            this.field_nb.b(4);
          }
          if (param0 != -12243) {
            this.field_rb = -45;
          }
          if (param1 == null) {
            this.field_nb = new ui();
          } else {
            param1.a(6, (byte) -86, 6 + this.field_rb, param1.field_x, param1.field_E);
            this.field_nb = new ui(param1);
          }
          this.a(this.field_nb, -88);
          this.field_pb = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "gd.QB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean j(int param0) {
        this.i((byte) -79);
        if (param0 > -50) {
          return false;
        }
        return super.j(-56);
    }

    gd(ka param0, lh param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_x, param2 + (12 + param1.field_E));
        try {
          this.field_rb = param2;
          this.field_ib = param4;
          this.field_tb = param3;
          this.field_yb = param3;
          this.c(-12243, param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        lh var6 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 ^ 0, param1, param2, param3)) {
            return true;
          }
          if (this.field_nb != null) {
            if (param1 == 98) {
              this.field_nb.a(1, param3);
            }
            if (param1 == 99) {
              this.field_nb.a(1, param3);
            }
          }
          if (param0 != 30373) {
            var6 = (lh) null;
            this.c((lh) null, -80);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("gd.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void i(byte param0) {
        if (this.field_xb != null) {
          if (this.field_xb != ob.field_t) {
            this.a((byte) -114, 12 + this.field_pb.field_x, this.field_rb + (12 + this.field_pb.field_E));
            this.c(-12243, this.field_pb);
          }
          this.field_nb.field_R = 256;
          this.field_xb = null;
        }
        int var2 = 29 / ((55 - param0) / 39);
        super.i((byte) 101);
    }

    static {
        field_ob = "Report <%0> for abuse";
    }
}
