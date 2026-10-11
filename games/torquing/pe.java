/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends hn implements wm, ng {
    static String field_M;
    private lg field_B;
    private boolean field_I;
    private lg field_D;
    static t field_J;
    private String field_N;
    private lg field_K;
    private boolean field_F;
    private tk field_C;
    static uc field_E;
    private tk field_L;
    private boolean field_G;
    static char[] field_H;

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -115 / ((-33 - param3) / 57);
          if (super.a(param0, param1, param2, -117)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_5_0 = this.a((byte) -94, param1);
            return stackIn_5_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param1, -9928);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void h(int param0) {
        this.field_C.i((byte) 85);
        if (param0 != 16180) {
          return;
        }
        this.field_L.i((byte) 77);
    }

    pe(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (el) null);
        na dupTemp$0 = null;
        na dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        lg stackIn_18_1 = null;
        lg stackIn_18_2 = null;
        lg stackIn_19_1 = null;
        lg stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        rf var6 = null;
        RuntimeException var6_ref = null;
        uc var7 = null;
        String var8 = null;
        he var9 = null;
        na var12 = null;
        na var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_F = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_G = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_I = stackIn_10_1;
          this.field_N = param1;
          if (this.field_G && (this.field_I ||
            this.field_F)) {
            throw new IllegalStateException();
          }
          this.field_C = (tk) ((Object) new gp(param0, (ca) (this), 100));
          this.field_L = (tk) ((Object) new gp("", (ca) (this), 20));
          if (!this.field_G) {
            this.field_K = new lg(qp.field_r, (ca) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_F) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = qh.field_a;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = ha.field_c;
            }
            this.field_B = new lg(stackIn_19_3, (ca) null);
            if (this.field_I) {
              this.field_D = new lg(qh.field_e, (ca) (this));
            }
          } else {
            this.field_K = new lg(qm.field_b, (ca) null);
            this.field_B = new lg(pf.field_q, (ca) null);
            this.field_C.field_x = false;
          }
          this.field_C.field_q = (el) ((Object) new ig(10000536));
          this.field_L.field_q = (el) ((Object) new io(10000536));
          var6 = new rf();
          this.field_K.field_q = (el) ((Object) var6);
          if (null != this.field_B) {
            this.field_B.field_q = (el) ((Object) var6);
          }
          if (this.field_D != null) {
            this.field_D.field_q = (el) ((Object) var6);
          }
          this.field_C.field_n = eo.field_e;
          if (this.field_D != null) {
            this.field_D.field_n = um.field_q;
          }
          if (this.field_G) {
            this.field_B.field_n = qg.field_v;
          } else {
            if (this.field_F) {
              this.field_B.field_n = ll.field_m;
              this.field_B.field_q = (el) ((Object) new je());
            } else {
              this.field_B.field_q = (el) ((Object) new je());
            }
          }
          this.field_k = 15;
          var7 = dg.field_e;
          if (this.field_N != null) {
            this.field_k = this.field_k + (5 + var7.a(this.field_N, this.field_p - 40, var7.field_x));
          }
          var8 = hq.field_c;
          var9 = go.a(false, ip.a(9));
          if (var9 != mf.field_u) {
            if (h.field_l == var9) {
              var8 = gj.field_g;
            }
          } else {
            var8 = go.field_v;
          }
          dupTemp$0 = new na(10, this.field_k, this.field_p - 20, 25, this.field_C, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, -6938);
          this.field_k = this.field_k + (((gm) ((Object) var12)).field_o + 5);
          dupTemp$1 = new na(10, this.field_k, -20 + this.field_p, 25, this.field_L, false, 80, 3, var7, 16777215, hm.field_v);
          var13 = dupTemp$1;
          this.a(dupTemp$1, -6938);
          this.field_K.field_t = (ca) (this);
          this.field_k = this.field_k + (5 + ((gm) ((Object) var13)).field_o);
          if (this.field_D != null) {
            this.field_D.field_t = (ca) (this);
          }
          if (null != this.field_B) {
            this.field_B.field_t = (ca) (this);
          }
          if (this.field_D == null) {
            this.field_K.a((byte) -46, 8, this.field_k, 30, -16 + this.field_p);
            this.field_k = this.field_k + 35;
          } else {
            this.field_K.a((byte) -97, 85, this.field_k, 30, this.field_p - 95);
            this.field_k = this.field_k + 60;
          }
          if (null != this.field_D) {
            this.field_D.a((byte) -18, 8, this.field_k, 30, this.field_p - 6 - 10);
            this.field_k = this.field_k + 35;
          }
          if (null != this.field_B) {
            if (!this.field_G &&
              !this.field_F) {
              this.field_B.a((byte) -21, 8, this.field_k, 20, 40);
              this.field_k = this.field_k + 25;
            } else {
              this.field_B.a((byte) -13, 8, this.field_k, 30, -6 + this.field_p - 10);
              this.field_k = this.field_k + 35;
            }
          }
          this.a((byte) 123, 0, 0, 3 + this.field_k, this.field_p);
          this.a(this.field_K, -6938);
          if (this.field_D != null) {
            this.a(this.field_D, -6938);
          }
          if (this.field_B != null) {
            this.a(this.field_B, -6938);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("pe.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, double param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = Torquing.field_u;
        try {
          if (param0 >= -97) {
            field_H = (char[]) null;
          }
          if (param1 != eq.field_a) {
            for (var3_int = 0; var3_int < 256; var3_int++) {
              var4 = (int)(Math.pow((double)var3_int / 255.0, param1) * 255.0);
              uk.field_b[var3_int] = 255 >= var4 ? var4 : 255;
            }
            eq.field_a = param1;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pe.C(" + param0 + ',' + param1 + ')');
        }
    }

    final String i(int param0) {
        if (param0 >= -68) {
          this.field_B = (lg) null;
        }
        if (this.field_C.field_m == null) {
          return "";
        }
        return this.field_C.field_m;
    }

    final void a(int param0, String param1) {
        tk var3 = null;
        String var4 = null;
        try {
          if (param0 >= -54) {
            field_E = (uc) null;
          }
          var3 = this.field_C;
          var4 = param1;
          var3.a(false, var4, true);
          this.field_L.i((byte) 68);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pe.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, tk param1) {
        try {
          if (param0 <= 3) {
            this.i(127);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_J = null;
        field_E = null;
        field_M = null;
        field_H = null;
        if (param0 >= -105) {
          pe.a((byte) -24, -0.6311276396635903);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, df param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Torquing.field_u;
        try {
          var4_int = param3.e(param1, -90);
          if (param0 <= 74) {
            field_J = (t) null;
          }
          if (var4_int == 0) {
            return null;
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new byte[var4_int];
          }
          var5 = param3.e(3, 78);
          var6 = (byte)param3.e(8, -93);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (byte)(param3.e(var5, -58) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pe.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (vg.d(0) ||
          !(this.field_C.field_m.length() <= 0) &&
          !(0 >= this.field_L.field_m.length())) {
          sa.a(this.field_C.field_m, 122, this.field_L.field_m);
        }
        if (param0 < 120) {
          this.a(99, (gm) null, 'ﾠ', 63);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != this.field_N) {
          dg.field_e.a(this.field_N, param3 + this.field_w + 20, param2 + this.field_k + 15, -40 + this.field_p, this.field_o, 16777215, -1, 1, 0, dg.field_e.field_x);
        }
        if (param1 >= -7) {
          this.field_C = (tk) null;
        }
        if (null != this.field_D) {
          ph.b(param3 + 10, 134 + param2, -20 + this.field_p, 4210752);
        }
        super.a(param0, (byte) -98, param2, param3);
    }

    final static jb[] a(byte param0, df param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        jb[] var4 = null;
        int var6_int = 0;
        jb var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        jb[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Torquing.field_u;
        try {
          var2_int = param1.e(8, -80);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (jb[]) (stackIn_3_0);
          }
          var4_int = -80 / ((-20 - param0) / 36);
          var3 = param1.e(12, -73);
          var4 = new jb[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (df.a(param1, -103)) {
              var6 = new jb();
              param1.e(24, -59);
              param1.e(24, 55);
              var6.field_a = param1.e(24, -85);
              param1.e(9, -113);
              param1.e(12, -114);
              param1.e(12, 99);
              param1.e(12, 97);
              var4[var5] = var6;
            } else {
              var6_int = param1.e(ci.a(-1 + var5, 2), -64);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("pe.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void a(tk param0, byte param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -122) {
            this.field_F = false;
          }
          if (this.field_C == param0) {
            this.field_L.a((gm) (this), false);
          }
          if (this.field_L == param0) {
            this.a((byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pe.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Torquing.field_u;
        try {
          if (param0 > -85) {
            this.field_F = false;
          }
          if (param1 == this.field_K) {
            this.a((byte) 123);
          } else {
            if (param1 == this.field_D) {
              m.a(11);
            } else {
              if (this.field_B == param1) {
                if (this.field_G) {
                  aj.a(2);
                } else {
                  if (!this.field_F) {
                    ka.a((byte) -110);
                  } else {
                    of.b((byte) 105);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("pe.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_M = "Discard";
        field_H = new char[128];
    }
}
