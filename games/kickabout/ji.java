/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends hd {
    static int[] field_Db;
    private hd field_yb;
    private hd field_Ib;
    private int field_Gb;
    private boolean field_Cb;
    private hd field_zb;
    static int field_Hb;
    static String field_Eb;
    private hd field_Ab;
    private hd field_Bb;
    private hd field_Fb;

    final int a(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = param1;
        int var6 = this.field_zb.field_q - this.field_yb.field_q;
        if (var6 > 0) {
          var7 = this.field_yb.field_s;
          var8 = param0 - param3;
          var5 = (var6 / 2 + var8 * var7) / var6;
        }
        if (!param2) {
          if (-param3 + param0 < var5) {
            var5 = -param3 + param0;
          }
          if (var5 >= 0) {
            return var5;
          }
          var5 = 0;
          return var5;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (-param3 + param0 < var5) {
          var5 = param0 - param3;
          return var5;
        }
        return var5;
    }

    final boolean b(int param0) {
        if (this.field_Bb.field_sb != 0) {
          this.field_Gb = 20;
          return true;
        }
        if (0 == this.field_Bb.field_qb) {
          if (param0 > -47) {
            this.j(69);
            return false;
          }
          return false;
        }
        if (this.field_Gb > 0) {
          this.field_Gb = this.field_Gb - 1;
        }
        if (this.field_Gb == 0) {
          this.field_Gb = 3;
          return true;
        }
        if (param0 > -47) {
          this.j(69);
          return false;
        }
        return false;
    }

    final boolean h(int param0) {
        if (this.field_Fb.field_sb != 0) {
          this.field_Gb = 20;
          return true;
        }
        if (this.field_Fb.field_qb == param0) {
          return false;
        }
        if (this.field_Gb > 0) {
          this.field_Gb = this.field_Gb - 1;
          if (this.field_Gb != 0) {
            return false;
          }
          this.field_Gb = 3;
          return true;
        }
        if (this.field_Gb == 0) {
          this.field_Gb = 3;
          return true;
        }
        return false;
    }

    ji(long param0, ji param1, boolean param2) {
        this(param0, param1.field_Bb, param1.field_Fb, param1.field_Ab, param1.field_yb, param2);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (this.field_Cb) {
          this.a(true, param0, param3, param1);
          if (param2 < 13) {
            field_Db = (int[]) null;
            return;
          }
          return;
        }
        this.c(param0, 2, param1, param3);
        if (param2 < 13) {
          field_Db = (int[]) null;
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (ns.field_a <= 0) {
          if (param0 <= 10) {
            field_Eb = (String) null;
            if (fj.field_a <= 0 &&
              ee.field_b <= 0) {
              return;
            }
            if (!td.field_b) {
              return;
            }
            on.g(0, 0, on.field_g, g.field_a.field_T);
            tn.field_f.a(125, param1);
            return;
          }
          if (fj.field_a > 0) {
            if (!td.field_b) {
              return;
            }
            on.g(0, 0, on.field_g, g.field_a.field_T);
            tn.field_f.a(125, param1);
            return;
          }
          if (ee.field_b <= 0) {
            return;
          }
          if (td.field_b) {
            on.g(0, 0, on.field_g, g.field_a.field_T);
            tn.field_f.a(125, param1);
          }
          return;
        }
        if (!qv.field_f) {
          if (param0 <= 10) {
            field_Eb = (String) null;
          }
          if (fj.field_a <= 0 &&
            ee.field_b <= 0) {
            return;
          }
          if (!td.field_b) {
            return;
          }
        } else {
          on.g(0, 0, on.field_g, g.field_a.field_T);
          kk.field_j.a(77, param1);
          if (param0 <= 10) {
            field_Eb = (String) null;
          }
          if (fj.field_a > 0) {
            if (!td.field_b) {
              return;
            }
          } else {
            if (ee.field_b <= 0) {
              return;
            }
            if (!td.field_b) {
              return;
            }
          }
        }
        on.g(0, 0, on.field_g, g.field_a.field_T);
        tn.field_f.a(125, param1);
    }

    private ji(long param0, hd param1, hd param2, hd param3, hd param4, boolean param5) {
        super(param0, (hd) null);
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        hd var10 = null;
        hd var11 = null;
        try {
          stackIn_4_1 = (param5);
          this.field_Cb = stackIn_4_1;
          this.field_Bb = new hd(0L, param1);
          this.field_Fb = new hd(0L, param2);
          this.a((byte) -116, this.field_Bb);
          this.a((byte) -110, this.field_Fb);
          this.field_zb = new hd(0L, (hd) null);
          this.a((byte) -113, this.field_zb);
          this.field_Ab = new hd(0L, param3);
          this.field_Ib = new hd(0L, param3);
          this.field_Ib.field_ob = true;
          var10 = this.field_Ab;
          var11 = var10;
          var11.field_ob = true;
          this.field_zb.a((byte) -108, this.field_Ab);
          this.field_zb.a((byte) -116, this.field_Ib);
          this.field_yb = new hd(0L, param4);
          this.field_yb.field_Y = true;
          this.field_zb.a((byte) -117, this.field_yb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ji.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hd var15 = null;
        hd var16 = null;
        hd var17 = null;
        hd var18 = null;
        hd var19 = null;
        hd var20 = null;
        int var14 = Kickabout.field_G;
        hd var15Lifetime1;
        hd var15Lifetime2;
        hd var16Lifetime1;
        hd var16Lifetime2;
        hd var17Lifetime1;
        hd var17Lifetime2;
        hd var18Lifetime1;
        hd var18Lifetime2;
        hd var19Lifetime1;
        hd var19Lifetime2;
        hd var20Lifetime1;
        hd var20Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (this.field_mb * 2 > this.field_q) {
          var6 = this.field_q / 2;
          var5 = this.field_q / 2;
        } else {
          var6 = this.field_q - this.field_mb;
          var5 = this.field_mb;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param3 >= param2) {
          var7 = 0;
          var9 = param2 - param3;
          var10 = var7 - var8;
          var11 = 0;
          if (0 < var9) {
            var11 = (var10 * param0 + var9 / 2) / var9;
          }
          var12 = var8 / param1 + var11;
          var15 = this.field_Bb;
          var15.field_s = 0;
          var15.field_J = 0;
          var15.field_q = var5;
          var15.field_mb = this.field_mb;
          var16 = this.field_Fb;
          var16.field_q = -var6 + this.field_q;
          var16.field_J = 0;
          var16.field_s = var6;
          var16.field_mb = this.field_mb;
          var17 = this.field_zb;
          var17.field_q = var7;
          var17.field_mb = this.field_mb;
          var17.field_J = 0;
          var17.field_s = var5;
          var18 = this.field_Ab;
          var18.field_J = 0;
          var18.field_q = var12;
          var18.field_mb = this.field_mb;
          var18.field_s = 0;
          var19 = this.field_Ib;
          var19.field_q = -var12 + var7;
          var19.field_s = var12;
          var19.field_mb = this.field_mb;
          var19.field_J = 0;
          var20 = this.field_yb;
          var20.field_mb = this.field_mb;
          var20.field_s = var11;
          var20.field_q = var8;
          var20.field_J = 0;
          this.field_zb.field_lb = param3 < param2 ? true : false;
          this.field_Fb.field_lb = param3 < param2 ? true : false;
          this.field_Bb.field_lb = param3 < param2 ? true : false;
          return;
        }
        var8 = var8 * param3 / param2;
        if (!(this.field_mb <= var8)) {
          var8 = this.field_mb;
        }
        if (var7 < var8) {
          var8 = var7;
          var9Lifetime1 = param2 - param3;
          var10Lifetime1 = var7 - var8;
          var11Lifetime1 = 0;
          if (0 < var9Lifetime1) {
            var11Lifetime1 = (var10Lifetime1 * param0 + var9Lifetime1 / 2) / var9Lifetime1;
          }
          var12Lifetime1 = var8 / param1 + var11Lifetime1;
          var15Lifetime1 = this.field_Bb;
          var15Lifetime1.field_s = 0;
          var15Lifetime1.field_J = 0;
          var15Lifetime1.field_q = var5;
          var15Lifetime1.field_mb = this.field_mb;
          var16Lifetime1 = this.field_Fb;
          var16Lifetime1.field_q = -var6 + this.field_q;
          var16Lifetime1.field_J = 0;
          var16Lifetime1.field_s = var6;
          var16Lifetime1.field_mb = this.field_mb;
          var17Lifetime1 = this.field_zb;
          var17Lifetime1.field_q = var7;
          var17Lifetime1.field_mb = this.field_mb;
          var17Lifetime1.field_J = 0;
          var17Lifetime1.field_s = var5;
          var18Lifetime1 = this.field_Ab;
          var18Lifetime1.field_J = 0;
          var18Lifetime1.field_q = var12Lifetime1;
          var18Lifetime1.field_mb = this.field_mb;
          var18Lifetime1.field_s = 0;
          var19Lifetime1 = this.field_Ib;
          var19Lifetime1.field_q = -var12Lifetime1 + var7;
          var19Lifetime1.field_s = var12Lifetime1;
          var19Lifetime1.field_mb = this.field_mb;
          var19Lifetime1.field_J = 0;
          var20Lifetime1 = this.field_yb;
          var20Lifetime1.field_mb = this.field_mb;
          var20Lifetime1.field_s = var11Lifetime1;
          var20Lifetime1.field_q = var8;
          var20Lifetime1.field_J = 0;
          this.field_zb.field_lb = param3 < param2 ? true : false;
          this.field_Fb.field_lb = param3 < param2 ? true : false;
          this.field_Bb.field_lb = param3 < param2 ? true : false;
          return;
        }
        var9Lifetime2 = param2 - param3;
        var10Lifetime2 = var7 - var8;
        var11Lifetime2 = 0;
        if (0 < var9Lifetime2) {
          var11Lifetime2 = (var10Lifetime2 * param0 + var9Lifetime2 / 2) / var9Lifetime2;
        }
        var12Lifetime2 = var8 / param1 + var11Lifetime2;
        var15Lifetime2 = this.field_Bb;
        var15Lifetime2.field_s = 0;
        var15Lifetime2.field_J = 0;
        var15Lifetime2.field_q = var5;
        var15Lifetime2.field_mb = this.field_mb;
        var16Lifetime2 = this.field_Fb;
        var16Lifetime2.field_q = -var6 + this.field_q;
        var16Lifetime2.field_J = 0;
        var16Lifetime2.field_s = var6;
        var16Lifetime2.field_mb = this.field_mb;
        var17Lifetime2 = this.field_zb;
        var17Lifetime2.field_q = var7;
        var17Lifetime2.field_mb = this.field_mb;
        var17Lifetime2.field_J = 0;
        var17Lifetime2.field_s = var5;
        var18Lifetime2 = this.field_Ab;
        var18Lifetime2.field_J = 0;
        var18Lifetime2.field_q = var12Lifetime2;
        var18Lifetime2.field_mb = this.field_mb;
        var18Lifetime2.field_s = 0;
        var19Lifetime2 = this.field_Ib;
        var19Lifetime2.field_q = -var12Lifetime2 + var7;
        var19Lifetime2.field_s = var12Lifetime2;
        var19Lifetime2.field_mb = this.field_mb;
        var19Lifetime2.field_J = 0;
        var20Lifetime2 = this.field_yb;
        var20Lifetime2.field_mb = this.field_mb;
        var20Lifetime2.field_s = var11Lifetime2;
        var20Lifetime2.field_q = var8;
        var20Lifetime2.field_J = 0;
        this.field_zb.field_lb = param3 < param2 ? true : false;
        this.field_Fb.field_lb = param3 < param2 ? true : false;
        this.field_Bb.field_lb = param3 < param2 ? true : false;
    }

    public static void a(int param0) {
        if (param0 >= -117) {
          ji.k(91);
          field_Db = null;
          field_Eb = null;
          return;
        }
        field_Db = null;
        field_Eb = null;
    }

    final boolean i(int param0) {
        if (this.field_Ib.field_sb != 0) {
          this.field_Gb = 20;
          return true;
        }
        if (param0 >= -47) {
          field_Hb = 113;
        }
        if (0 == this.field_Ib.field_qb) {
          return false;
        }
        if (this.field_Gb > 0) {
          this.field_Gb = this.field_Gb - 1;
        }
        if (0 != this.field_Gb) {
          return false;
        }
        if (n.field_m < this.field_yb.field_v + this.field_yb.field_T - (-this.field_yb.field_mb - this.field_yb.field_L)) {
          return false;
        }
        this.field_Gb = 3;
        return true;
    }

    ji(String param0, hd param1, hd param2, hd param3, hd param4, boolean param5) {
        this(vb.a(0, (CharSequence) ((Object) param0)), param1, param2, param3, param4, param5);
    }

    final int a(int param0, boolean param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = -this.field_yb.field_mb + this.field_zb.field_mb;
        if (0 < var6) {
          var7 = this.field_yb.field_J;
          var8 = -param3 + param0;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (!param1) {
          if (-param3 + param0 < var5) {
            var5 = param0 - param3;
          }
          if (0 > var5) {
            var5 = 0;
          }
        } else {
          if (0 > var5) {
            var5 = 0;
          }
          if (var5 > -param3 + param0) {
            var5 = -param3 + param0;
          }
        }
        if (param2 == -95) {
          return var5;
        }
        this.c(29, 92, -42, -36);
        return var5;
    }

    final boolean j(int param0) {
        if (param0 != 0) {
          return false;
        }
        return 0 != this.field_yb.field_qb ? true : false;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        hd var15;
        hd var16;
        hd var17;
        hd var18;
        hd var19;
        hd var20;
        hd stackIn_13_0 = null;
        hd stackIn_13_1 = null;
        hd stackIn_13_2 = null;
        boolean stackIn_14_3 = false;
        hd stackIn_23_0 = null;
        hd stackIn_23_1 = null;
        hd stackIn_23_2 = null;
        boolean stackIn_24_3 = false;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        hd var15Lifetime1;
        hd var16Lifetime1;
        hd var17Lifetime1;
        hd var18Lifetime1;
        hd var19Lifetime1;
        hd var20Lifetime1;
        var14 = Kickabout.field_G;
        if (2 * this.field_q > this.field_mb) {
          var6 = this.field_mb / 2;
          var5 = this.field_mb / 2;
        } else {
          var6 = -this.field_q + this.field_mb;
          var5 = this.field_q;
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param3 <= param2) {
          var7 = 0;
        } else {
          var8 = param2 * var8 / param3;
          if (this.field_q > var8) {
            var8 = this.field_q;
          }
          if (var7 < var8) {
            var8 = var7;
            var9 = -param2 + param3;
            var10 = -var8 + var7;
            var11 = 0;
            if (0 < var9) {
              var11 = (param1 * var10 + var9 / 2) / var9;
            }
            var12 = var11 + var8 / 2;
            var15 = this.field_Bb;
            var15.field_s = 0;
            var15.field_J = 0;
            var15.field_mb = var5;
            var15.field_q = this.field_q;
            var16 = this.field_Fb;
            var16.field_q = this.field_q;
            var16.field_J = var6;
            var16.field_mb = -var6 + this.field_mb;
            if (!param0) {
              return;
            }
            var16.field_s = 0;
            var17 = this.field_zb;
            var17.field_mb = var7;
            var17.field_J = var5;
            var17.field_s = 0;
            var17.field_q = this.field_q;
            var18 = this.field_Ab;
            var18.field_q = this.field_q;
            var18.field_mb = var12;
            var18.field_s = 0;
            var18.field_J = 0;
            var19 = this.field_Ib;
            var19.field_mb = -var12 + var7;
            var19.field_s = 0;
            var19.field_q = this.field_q;
            var19.field_J = var12;
            var20 = this.field_yb;
            var20.field_q = this.field_q;
            stackIn_13_0 = this.field_Bb;
            stackIn_13_1 = this.field_Fb;
            stackIn_13_2 = this.field_zb;
            stackIn_14_3 = (param2 >= param3) ? false : true;
            stackIn_13_2.field_lb = stackIn_14_3;
            stackIn_13_1.field_lb = stackIn_14_3;
            stackIn_13_0.field_lb = stackIn_14_3;
            var20.field_J = var11;
            var20.field_mb = var8;
            var20.field_s = 0;
            return;
          }
        }
        var9Lifetime1 = -param2 + param3;
        var10Lifetime1 = -var8 + var7;
        var11Lifetime1 = 0;
        if (0 < var9Lifetime1) {
          var11Lifetime1 = (param1 * var10Lifetime1 + var9Lifetime1 / 2) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var15Lifetime1 = this.field_Bb;
        var15Lifetime1.field_s = 0;
        var15Lifetime1.field_J = 0;
        var15Lifetime1.field_mb = var5;
        var15Lifetime1.field_q = this.field_q;
        var16Lifetime1 = this.field_Fb;
        var16Lifetime1.field_q = this.field_q;
        var16Lifetime1.field_J = var6;
        var16Lifetime1.field_mb = -var6 + this.field_mb;
        if (!param0) {
          return;
        }
        var16Lifetime1.field_s = 0;
        var17Lifetime1 = this.field_zb;
        var17Lifetime1.field_mb = var7;
        var17Lifetime1.field_J = var5;
        var17Lifetime1.field_s = 0;
        var17Lifetime1.field_q = this.field_q;
        var18Lifetime1 = this.field_Ab;
        var18Lifetime1.field_q = this.field_q;
        var18Lifetime1.field_mb = var12Lifetime1;
        var18Lifetime1.field_s = 0;
        var18Lifetime1.field_J = 0;
        var19Lifetime1 = this.field_Ib;
        var19Lifetime1.field_mb = -var12Lifetime1 + var7;
        var19Lifetime1.field_s = 0;
        var19Lifetime1.field_q = this.field_q;
        var19Lifetime1.field_J = var12Lifetime1;
        var20Lifetime1 = this.field_yb;
        var20Lifetime1.field_q = this.field_q;
        stackIn_23_0 = this.field_Bb;
        stackIn_23_1 = this.field_Fb;
        stackIn_23_2 = this.field_zb;
        stackIn_24_3 = (param2 >= param3) ? false : true;
        stackIn_23_2.field_lb = stackIn_24_3;
        stackIn_23_1.field_lb = stackIn_24_3;
        stackIn_23_0.field_lb = stackIn_24_3;
        var20Lifetime1.field_J = var11Lifetime1;
        var20Lifetime1.field_mb = var8;
        var20Lifetime1.field_s = 0;
    }

    final boolean c(boolean param0) {
        if (this.field_Ab.field_sb != 0) {
          this.field_Gb = 20;
          return true;
        }
        if (0 != this.field_Ab.field_qb) {
          if (this.field_Gb > 0) {
            this.field_Gb = this.field_Gb - 1;
          }
          if (this.field_Gb == 0 &&
            this.field_yb.field_v + this.field_yb.field_T > n.field_m) {
            this.field_Gb = 3;
            return true;
          }
        }
        if (param0) {
          return false;
        }
        this.field_yb = (hd) null;
        return false;
    }

    final static void k(int param0) {
        th.a((byte) -99);
        if (param0 != 0) {
          field_Eb = (String) null;
          pn.field_z.b(22997);
          return;
        }
        pn.field_z.b(22997);
    }

    static {
        field_Eb = "Reject <%0> from this game";
        field_Hb = -1;
    }
}
