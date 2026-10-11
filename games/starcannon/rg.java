/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends vk implements si, ga {
    private boolean field_A;
    private dk field_C;
    static String field_E;
    private boolean field_H;
    static String field_K;
    private String field_J;
    private dk field_F;
    private fe field_I;
    static int field_D;
    static int field_B;
    private fe field_G;
    private dk field_y;
    private boolean field_z;

    final static hl[] i(int param0) {
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var7 = StarCannon.field_A;
        hl[] var1 = new hl[bj.field_b];
        int var2Lifetime1;
        for (var2 = 0; bj.field_b > var2; var2++) {
          var3 = gh.field_C[var2] * gg.field_d[var2];
          var10 = og.field_c[var2];
          var11 = new int[var3];
          var9 = var11;
          var5 = var9;
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = of.field_g[w.a(255, (int) var10[var6])];
          }
          var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var11);
        }
        var2Lifetime1 = 57 / ((47 - param0) / 46);
        rc.b((byte) -82);
        return var1;
    }

    final String j(int param0) {
        if (this.field_I.field_k == null) {
          return "";
        }
        if (param0 != 190) {
          field_E = (String) null;
        }
        return this.field_I.field_k;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (this.field_J != null) {
          nb.field_c.a(this.field_J, 20 + param1 + this.field_s, 15 + (param3 + this.field_j), this.field_i - 40, this.field_f, 16777215, -1, 1, 0, nb.field_c.field_p);
        }
        if (this.field_y != null) {
          ki.b(10 + param1, param3 + 134, -20 + this.field_i, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void k(int param0) {
        field_K = null;
        if (param0 > -94) {
          return;
        }
        field_E = null;
    }

    public final void a(int param0, fe param1) {
        try {
          if (param0 != -4312) {
            uj var4 = (uj) null;
            this.a((uj) null, 'ﾠ', (byte) 81, -62);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rg.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (de) null);
        ad dupTemp$0 = null;
        ad dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        dk stackIn_17_1 = null;
        dk stackIn_17_2 = null;
        dk stackIn_18_1 = null;
        dk stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        gb var6 = null;
        RuntimeException var6_ref = null;
        qe var7 = null;
        String var8 = null;
        mj var9 = null;
        ad var11 = null;
        ad var12 = null;
        try {
          stackIn_4_1 = (param3);
          this.field_H = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_z = stackIn_7_1;
          this.field_J = param1;
          stackIn_10_1 = (param4);
          this.field_A = stackIn_10_1;
          if (this.field_z && (this.field_H ||
            this.field_A)) {
            throw new IllegalStateException();
          }
          this.field_I = (fe) ((Object) new ng(param0, (qg) (this), 100));
          this.field_G = (fe) ((Object) new ng("", (qg) (this), 20));
          if (this.field_z) {
            this.field_C = new dk(ma.field_g, (qg) null);
            this.field_F = new dk(bg.field_b, (qg) null);
            this.field_I.field_u = false;
          } else {
            this.field_C = new dk(s.field_l, (qg) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_A) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = (String) (field_E);
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = dk.field_t;
            }
            this.field_F = new dk(stackIn_18_3, (qg) null);
            if (this.field_H) {
              this.field_y = new dk(qj.field_V, (qg) (this));
            }
          }
          this.field_I.field_o = (de) ((Object) new fh(10000536));
          this.field_G.field_o = (de) ((Object) new sh(10000536));
          var6 = new gb();
          this.field_C.field_o = (de) ((Object) var6);
          if (this.field_F != null) {
            this.field_F.field_o = (de) ((Object) var6);
          }
          this.field_I.field_p = ne.field_a;
          if (null != this.field_y) {
            this.field_y.field_o = (de) ((Object) var6);
          }
          if (null != this.field_y) {
            this.field_y.field_p = wj.field_f;
          }
          if (this.field_z) {
            this.field_F.field_p = qd.field_B;
          } else {
            if (!this.field_A) {
              this.field_F.field_o = (de) ((Object) new wa());
            } else {
              this.field_F.field_p = ej.field_t;
              this.field_F.field_o = (de) ((Object) new wa());
            }
          }
          this.field_j = 15;
          var7 = nb.field_c;
          if (null != this.field_J) {
            this.field_j = this.field_j + (var7.a(this.field_J, -40 + this.field_i, var7.field_p) + 5);
          }
          var8 = pf.field_b;
          var9 = kl.a(ll.b(95), (byte) 84);
          if (var9 != p.field_a) {
            if (bh.field_b == var9) {
              var8 = rc.field_c;
            }
          } else {
            var8 = v.field_a;
          }
          dupTemp$0 = new ad(10, this.field_j, -20 + this.field_i, 25, this.field_I, false, 80, 3, var7, 16777215, var8);
          var11 = dupTemp$0;
          this.a(true, dupTemp$0);
          this.field_j = this.field_j + (((uj) ((Object) var11)).field_f + 5);
          dupTemp$1 = new ad(10, this.field_j, -20 + this.field_i, 25, this.field_G, false, 80, 3, var7, 16777215, tj.field_y);
          var12 = dupTemp$1;
          this.a(true, dupTemp$1);
          this.field_C.field_g = (qg) (this);
          this.field_j = this.field_j + (5 + ((uj) ((Object) var12)).field_f);
          if (null != this.field_y) {
            this.field_y.field_g = (qg) (this);
          }
          if (null != this.field_F) {
            this.field_F.field_g = (qg) (this);
          }
          if (this.field_y != null) {
            this.field_C.a(85, this.field_i - 95, (byte) 121, 30, this.field_j);
            this.field_j = this.field_j + 60;
          } else {
            this.field_C.a(8, -10 + this.field_i - 6, (byte) 118, 30, this.field_j);
            this.field_j = this.field_j + 35;
          }
          if (null != this.field_y) {
            this.field_y.a(8, this.field_i - 6 - 10, (byte) 117, 30, this.field_j);
            this.field_j = this.field_j + 35;
          }
          if (this.field_F != null) {
            if (!this.field_z &&
              !this.field_A) {
              this.field_F.a(8, 40, (byte) 120, 20, this.field_j);
              this.field_j = this.field_j + 25;
            } else {
              this.field_F.a(8, -6 + this.field_i - 10, (byte) 127, 30, this.field_j);
              this.field_j = this.field_j + 35;
            }
          }
          this.a(0, this.field_i, (byte) 120, 3 + this.field_j, 0);
          this.a(true, this.field_C);
          if (null != this.field_y) {
            this.a(true, this.field_y);
          }
          if (this.field_F != null) {
            this.a(true, this.field_F);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("rg.<init>(");
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
          throw sd.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0) {
        this.field_I.i(19293);
        this.field_G.i(19293);
        if (param0) {
          fe var3 = (fe) null;
          this.a(false, (fe) null);
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.b(-112, param0);
            return stackIn_7_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_11_0 = this.a((byte) -103, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rg.EA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(boolean param0, fe param1) {
        String var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 == this.field_I) {
            this.field_G.a(0, (uj) (this));
          }
          if (this.field_G == param1) {
            this.a(-100);
          }
          if (param0) {
            var4 = (String) null;
            this.b((byte) -93, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("rg.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        if (param0 != -100) {
          this.field_J = (String) null;
        }
        if (se.d((byte) 125) ||
          !(this.field_I.field_k.length() <= 0) &&
          !(this.field_G.field_k.length() <= 0)) {
          ia.a(this.field_I.field_k, this.field_G.field_k, 0);
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          if (param0 != 10) {
            field_D = -57;
          }
          var3 = new byte[var2_int];
          ug.a(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = StarCannon.field_A;
        try {
          if (param2) {
            field_K = (String) null;
          }
          if (param0 != this.field_C) {
            if (param0 != this.field_y) {
              if (this.field_F == param0) {
                if (!this.field_z) {
                  if (this.field_A) {
                    ob.b(11);
                  } else {
                    vk.e(-59);
                  }
                } else {
                  ik.g(17);
                }
              }
            } else {
              pb.b(106);
            }
          } else {
            this.a(-100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("rg.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void b(byte param0, String param1) {
        fe var3 = null;
        String var4 = null;
        try {
          var3 = this.field_I;
          var4 = param1;
          var3.a((byte) -91, false, var4);
          if (param0 != -79) {
            this.field_I = (fe) null;
          }
          this.field_G.i(19293);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = bf.a(param1.length, 0, 4, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_K = "This password contains repeated characters, and would be easy to guess";
        field_B = 0;
        field_E = "Just play";
    }
}
