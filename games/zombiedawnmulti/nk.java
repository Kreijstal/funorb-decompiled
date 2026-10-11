/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends br {
    static String field_j;
    private int field_r;
    static String field_q;
    private boolean field_k;
    static int field_s;
    static String field_f;
    private int field_o;
    private th field_l;
    private int field_p;
    private ge field_t;
    private int field_i;
    private rl field_m;
    static ea field_h;
    static String[] field_n;
    private boolean field_g;

    final static void a(int param0, double param1, int param2, int param3, double param4) {
        th discarded$0 = null;
        if (od.field_Db == 0 &&
          param2 > 0) {
          he.field_k = new th();
        } else {
          if (0 == param2) {
            he.field_k = null;
          }
        }
        od.field_Db = param2;
        la.field_n = param1;
        if (param3 == ab.field_o &&
          param0 > 0) {
          discarded$0 = new th();
        } else {
          if (param0 != 0) {
          }
        }
        si.field_C = param4;
        ab.field_o = param0;
    }

    final static ae a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ri var9 = null;
        jm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          var4 = param1.d((byte) 69);
          var5 = param1.d((byte) 69);
          if (param0 != 20399) {
            var9 = (ri) null;
            nk.a(-34, (int[]) null, (ri) null);
          }
          var6 = param1.d((byte) 69);
          var7 = param1.d((byte) 69);
          var8 = param1.d((byte) 69);
          stackIn_3_0 = td.a(var5, var2_int, var4, (byte) 125, var8, var6, var7, var3);
          return (ae) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    nk(ge param0, int param1, int param2, boolean param3) {
        this(param0.field_A, param1, param2, param3);
        try {
          this.field_t = param0;
          this.field_l.a(this.field_t, false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ri a(int param0, int[] param1, ri param2) {
        ri var3 = null;
        RuntimeException var3_ref = null;
        ri stackIn_2_0 = null;
        ri stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ri(0, 0, 0);
          var3.field_b = param2.field_b;
          var3.field_f = param2.field_f;
          var3.field_m = param2.field_m;
          var3.field_h = param2.field_h;
          if (param0 < 84) {
            stackIn_2_0 = (ri) null;
            return stackIn_2_0;
          }
          var3.field_j = param2.field_j;
          var3.field_a = param2.field_a;
          var3.field_e = param2.field_e;
          var3.field_l = param1;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("nk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static ja a(ja param0, int param1, int param2, int param3) {
        int var5 = 0;
        ja stackIn_14_0 = null;
        ja stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          g.c(vb.field_b);
          oo.b();
          param0.g(3, 3);
          var10 = oo.field_i;
          var9 = var10;
          var4 = var9;
          for (var5 = 0; var5 < var10.length; var5++) {
            var6 = var10[var5];
            if (0 != var6) {
              if (0 != (65535 & var6)) {
                if ((16711935 & var6) == 0) {
                  var7 = var6 >> 8;
                  var4[var5] = cr.b(tq.b(16711696, var7 * tq.b(255, param1 >> 16) << 8), cr.b(tq.b(255, param1) * var7 >> 8, tq.b(tq.b(param1 >> 8, 255) * var7, 65280)));
                }
              } else {
                var7 = var6 >> 16;
                var4[var5] = cr.b(tq.b(1107361536, var7 * tq.b(255, param3 >> 16)) << 8, cr.b(var7 * tq.b(255, param3) >> 8, tq.b(65280, var7 * (tq.b(65362, param3) >> 8))));
              }
            }
          }
          g.d();
          if (param2 == 255) {
            stackIn_16_0 = vb.field_b;
            return stackIn_16_0;
          }
          stackIn_14_0 = (ja) null;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("nk.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ja[] a(int param0, byte param1) {
        int var2 = -119 / ((43 - param1) / 47);
        ja[] var3 = new ja[9];
        var3[4] = k.a(-111, 64, param0);
        return var3;
    }

    final void a(int param0) {
        int var2;
        br var3;
        br var4;
        ek var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_p = this.field_p + 6;
        if (this.field_r < this.field_p) {
          if (this.field_k) {
            this.field_m.field_b.field_i.a((byte) 122);
            this.field_m.field_b.a(48);
          }
          this.a(true);
        }
        var2 = this.field_p * this.field_p;
        if (param0 < 91) {
          nk.a((byte) -1);
        }
        var3 = this.field_l.c(49);
        while (var3 instanceof ha) {
          var4 = var3.field_d;
          if (((ha) (var3)).field_f < var2) {
            var3.a(true);
            var5 = ((ha) (var3)).field_m;
            if (!(var5 instanceof ge)) {
              if (var5 instanceof lm) {
                if (!this.field_g) {
                  ((lm) (var5)).a(800, true);
                } else {
                  ((lm) (var5)).c(false);
                }
              }
            } else {
              if (var5 != this.field_t &&
                !this.field_g) {
                ((ge) (var5)).d(400, -118);
              } else {
                ((ge) (var5)).m((byte) 42);
                this.field_t = null;
              }
            }
          }
          var3 = var4;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_n = null;
        field_q = null;
        field_h = null;
        int var1 = -54 / ((21 - param0) / 40);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawnMulti.field_E ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (param2 & 16712141) >> 16;
        int var5 = param2 >> 8 & 255;
        int var6 = 255 & param2;
        int var7 = (16766674 & param0) >> 16;
        if (param1 != 455739624) {
          ri var13 = (ri) null;
          nk.a(-88, (int[]) null, (ri) null);
        }
        int var8 = param0 >> 8 & 255;
        int var9 = 255 & param0;
        for (var10 = 0; 256 > var10; var10++) {
          var11 = -var10 + 256;
          var14[var10] = (var6 * var10 >> 8) - (-(var9 * var11 >> 8) - (((var10 * var4 >> 8) + (var11 * var7 >> 8) << 16) + ((var8 * var11 >> 8) + (var10 * var5 >> 8) << 8)));
        }
        return var3;
    }

    nk(rl param0, int param1, int param2, boolean param3) {
        boolean stackIn_4_1 = false;
        int stackIn_7_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        br var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ge var13 = null;
        this.field_k = false;
        try {
          stackIn_4_1 = (param3);
          this.field_g = stackIn_4_1;
          this.field_m = param0;
          if (!this.field_g) {
            stackIn_7_1 = 180;
          } else {
            stackIn_7_1 = 90;
          }
          this.field_r = stackIn_7_1;
          if (!this.field_m.field_b.a(-128, param2, param1)) {
            param2 = param2 - (param2 % 24 - 4);
          }
          this.field_p = 0;
          this.field_i = param2;
          this.field_o = param1;
          this.field_l = new th();
          var5_int = this.field_r * this.field_r;
          var6 = this.field_m.field_u.c(76);
          while (var6 instanceof ek) {
            boolean decompiledFrameRemainder0 = true;
            if (((!(var6 instanceof ge) ||
              9 == ((ge) (var6)).field_Q) &&
              !(var6 instanceof fd)) &&
              (decompiledFrameRemainder0 = !(!(var6 instanceof lm)))) {
              decompiledFrameRemainder0 = (((lm) (var6)).field_Q != 2);
            }
            if (decompiledFrameRemainder0) {
              var7 = ((ek) (var6)).e((byte) -112);
              var8 = ((ek) (var6)).g(1829947600);
              var9 = this.field_o - var7;
              var10 = -var8 + this.field_i;
              var11 = var10 * var10 + var9 * var9;
              stackIn_19_0 = (var11 >= var5_int) ? 0 : 1;
              var12 = stackIn_19_0;
              if (!(var6 instanceof fd)) {
                stackIn_29_0 = var12;
                if (this.field_m.field_b.a(var8, -34, var7, this.field_i, this.field_o) == -1) {
                  stackIn_30_1 = 0;
                } else {
                  stackIn_30_1 = 1;
                }
                var12 = stackIn_29_0 & stackIn_30_1;
              } else {
                stackIn_24_0 = var12;
                if (-1 == this.field_m.field_b.a(-24 + (-24 + (var8 - 2)), 98, var7, this.field_i, this.field_o) &&
                  this.field_m.field_b.a(-48 + var8 - 2, -58, var7 + 24, this.field_i, this.field_o) == -1 &&
                  -1 == this.field_m.field_b.a(var8 + 2, -124, var7, this.field_i, this.field_o) &&
                  this.field_m.field_b.a(2 + var8, 107, 24 + var7, this.field_i, this.field_o) == -1) {
                  stackIn_26_1 = 0;
                } else {
                  stackIn_26_1 = 1;
                }
                var12 = stackIn_24_0 & stackIn_26_1;
              }
              if (var12 != 0) {
                if (var6 instanceof ge) {
                  var13 = (ge) (var6);
                  if (this.field_m.field_m.b(0, var13.field_gb)) {
                    this.field_m.a((byte) -100, var13);
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.field_l.a(new ha((ek) (var6), var11), false);
                }
              }
            }
            var6 = var6.field_d;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("nk.<init>(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_j = "Remove <%0> from friend list";
        field_q = "Orb points: ";
        field_f = "Learn to organise them.";
    }
}
