/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tjb extends llb {
    private int field_Jb;
    static String field_Cb;
    static int field_wb;
    private int field_zb;
    private int field_Ib;
    private int field_Hb;
    private int field_Eb;
    private int field_Gb;
    private int field_vb;
    private char[] field_yb;
    private tjb[] field_Db;
    private int field_Fb;
    private tjb field_xb;
    private cna[] field_Bb;
    private int[] field_Ab;

    final boolean a(int param0, int param1, int param2) {
        int var6 = 0;
        int var4;
        int var5;
        int var7;
        int stackIn_5_0 = 0;
        var7 = VoidHunters.field_G;
        if (param1 > -60) {
          this.field_Eb = 67;
        }
        stackIn_5_0 = (pma.field_o != 85) ? 0 : 1;
        var4 = stackIn_5_0;
        if (this.field_xb != null) {
          if (var4 != 0 &&
            this.field_xb.field_vb == -1) {
            this.j(16384);
            this.a((byte) 112, 0);
            return true;
          }
          return this.field_xb.a(param0, -126, param2);
        }
        if (null == this.field_xb &&
          this == fkb.field_m &&
          var4 != 0) {
          fea.a(-1);
          return true;
        }
        var5 = jl.field_r;
        if (var5 > 0) {
          if (ttb.field_B == var5) {
            var5 = 63;
          }
          for (var6 = 0; var6 < this.field_yb.length; var6++) {
            if (var5 == this.field_yb[var6]) {
              this.a(var6, true, param0, param2);
              return true;
            }
          }
        }
        return false;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        long stackIn_15_2 = 0L;
        boolean stackIn_16_3;
        var7 = VoidHunters.field_G;
        if (!param1) {
          return;
        }
        if (this.field_vb != param0) {
          if (this.field_Db[param0] != null) {
            this.j(16384);
            this.a((byte) 116, 0);
            this.field_vb = param0;
            this.field_xb = this.field_Db[this.field_vb];
            wkb.a(this.field_xb, 6);
            this.field_xb.a((byte) 121, 12);
          } else {
            if (this.field_Ab[param0] != -1) {
              var5 = 32768 | this.field_Ab[param0];
              var6 = ow.field_b;
              if (var6 == 0 &&
                null != lqa.field_o) {
                var6 = 1;
              }
              if (jia.a(var6, (byte) 19) == 2) {
                mea.a(1, (byte) -119, param2, var6);
              }
              var8 = (String) null;
              va.a((String) null, -25719, var5, param3, ow.field_b, waa.field_x);
              stackIn_15_0 = ow.field_b;
              stackIn_15_1 = var5;
              stackIn_15_2 = lsa.field_f;
              stackIn_16_3 = (param1) ? false : true;
              jtb.a(stackIn_15_0, stackIn_15_1, stackIn_15_2, stackIn_16_3, waa.field_x);
              fea.a(-1);
              fd.a(4907);
            } else {
              wha.a(29012);
              fea.a(-1);
            }
          }
        } else {
          this.j(16384);
          this.a((byte) 121, 0);
        }
    }

    tjb(long param0, llb param1, llb param2, llb param3, tjb[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        no var17 = null;
        no var18 = null;
        this.field_vb = -1;
        try {
          this.field_yb = param7;
          this.field_Ab = param5;
          this.field_Db = param4;
          this.field_Gb = this.field_Ab.length;
          var17 = param3.field_eb;
          var18 = var17;
          this.field_Ib = var18.field_A + (var18.field_k + 2);
          this.field_Jb = 0;
          this.field_Bb = new cna[this.field_Gb];
          this.field_zb = this.field_Ib * this.field_Gb;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Gb > var13; var13++) {
            if (this.field_yb[var13] > 0) {
              param6[var13] = var11 + av.a(this.field_yb[var13], 6).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.field_Db[var13] != null ||
              this.field_Ab[var13] == -1) {
              var14 = ie.field_o;
            }
            this.field_Bb[var13] = new cna(0L, param2, (llb) null, param3, (phb) (var14), param6[var13]);
            this.b(-561, this.field_Bb[var13]);
            var15 = var17.b(param6[var13]);
            if (this.field_Jb < var15) {
              this.field_Jb = var15;
            }
          }
          this.field_Jb = this.field_Jb + (10 + ie.field_o.field_m);
          this.a((byte) 120, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("tjb.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = VoidHunters.field_G;
        this.field_Fb = param1;
        if (param0 < 109) {
          this.field_Eb = -122;
        }
        for (var5 = 0; var5 < this.field_Gb; var5++) {
          var4 = this.field_Fb * this.field_Fb;
          var3 = var5 * this.field_Ib;
          this.field_Bb[var5].field_K = ((this.field_Hb - this.field_u) * var4 + (-var4 + 144) * var3) / 144;
        }
    }

    final int k(int param0) {
        if (param0 != -4109) {
          this.a(-122, 20, 102);
        }
        return this.field_Eb + (null != this.field_xb ? this.field_xb.k(-4109) : 0);
    }

    public static void i(int param0) {
        if (param0 != 85) {
          return;
        }
        field_Cb = null;
    }

    final void j(int param0) {
        int var3 = 0;
        cna var4 = null;
        int var5 = VoidHunters.field_G;
        cna[] var6 = this.field_Bb;
        cna[] var2 = var6;
        if (param0 != 16384) {
          this.field_zb = -32;
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_o = 0;
          var4.field_J = false;
        }
        if (this.field_xb != null) {
          this.field_xb.j(16384);
          this.field_xb.b(param0 - 20230);
        }
        this.field_xb = null;
        this.field_vb = -1;
        this.a((byte) 113, 12);
    }

    final static boolean l(int param0) {
        if (param0 != 0) {
          return false;
        }
        tsb.field_q = true;
        ska.field_p = wt.a(false) + 15000L;
        return qmb.field_q == 11 ? true : false;
    }

    final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4_int;
        cna var6;
        int var7;
        cna stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        tjb var4;
        tjb var8;
        var7 = VoidHunters.field_G;
        var4_int = -84 / ((-12 - param2) / 44);
        for (var5 = 0; this.field_Bb.length > var5; var5++) {
          var6 = this.field_Bb[var5];
          if (var6.field_o == 1) {
            this.a(var5, true, param0, param1);
            stackIn_7_0 = var6;
            stackIn_8_1 = (var5 == this.field_vb);
            stackIn_7_0.field_J = stackIn_8_1;
          }
        }
        if (this.field_vb != -1) {
          var8 = this.field_Db[this.field_vb];
          var4 = var8;
          if (var4 != null) {
            var8.a(param0, param1, (byte) 78);
          }
        }
        if (0 < this.field_Fb) {
          this.a((byte) 123, this.field_Fb - 1);
        }
    }

    final boolean h(int param0) {
        int var2;
        cna[] var3;
        int var4;
        cna var5;
        int var6;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_18_0 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = this.field_Bb;
        var4 = 0;
        while (var4 < var3.length) {
          var5 = var3[var4];
          stackIn_5_0 = var2;
          stackIn_5_1 = var5.field_o;
          if (stackIn_5_1 == 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          var2 = stackIn_5_0 | stackIn_8_1;
          var4++;
        }
        if (param0 != -25675) {
          tjb.l(52);
        }
        if (var2 == 0 &&
          -1 != this.field_vb &&
          this.field_Db[this.field_vb] != null) {
          stackIn_18_0 = (!this.field_Db[this.field_vb].h(-25675)) ? 0 : 1;
          var2 = stackIn_18_0;
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        this.field_Eb = this.field_Jb + 2 * param3;
        if (param0 != 12) {
          return;
        }
        this.a(param2, param0 - 41, this.field_Eb, param1 - this.field_zb, this.field_zb);
        if (param4 != this.field_Hb) {
          this.field_Hb = param4;
          this.a((byte) 116, this.field_Fb);
        }
        for (var7 = 0; var7 < this.field_Gb; var7++) {
          this.field_Bb[var7].a(this.field_Bb[var7].field_K, 0, -127, param3, param5, this.field_Eb, this.field_Ib);
        }
        if (this.field_vb != -1 &&
          this.field_Db[this.field_vb] != null) {
          var7Lifetime1 = this.field_Db[this.field_vb].field_Gb;
          for (var8 = this.field_K + (this.field_vb + var7Lifetime1) * this.field_Ib; param1 < var8; var8 = var8 - this.field_Ib) {
          }
          this.field_Db[this.field_vb].a(12, var8, this.field_Eb + param2, param3, this.field_Bb[this.field_vb].field_u, param5);
          return;
        }
        return;
    }

    final static Object a(Object[] param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = VoidHunters.field_G;
        try {
          if (!ls.field_q) {
            stackIn_3_0 = null;
            return stackIn_3_0;
          }
          if (param1 != 0) {
            ((byte[]) (param0[2]))[0] = ((byte[]) (param0[12]))[2];
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length <= 0) {
            stackIn_19_0 = null;
            return stackIn_19_0;
          }
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            if (VoidHunters.a(true, param0[var2_int])) {
              stackIn_16_0 = param0[var2_int];
              return stackIn_16_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("tjb.K(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Cb = "Invalid name";
        field_wb = 2;
    }
}
