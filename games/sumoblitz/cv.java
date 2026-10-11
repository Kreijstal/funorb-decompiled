/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cv extends sp implements pw, ai {
    static tg field_F;
    private wp field_A;
    static int[] field_G;
    private dh field_H;
    private boolean field_J;
    private dh field_I;
    private String field_K;
    private wp field_N;
    static int field_E;
    private wp field_D;
    private boolean field_M;
    static int field_O;
    private boolean field_B;

    public final void a(dh param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_H == param0) {
            this.field_I.a((pk) (this), (byte) 61);
          }
          if (param0 == this.field_I) {
            this.e((byte) -23);
          }
          if (param1 >= -41) {
            this.a(51, -15, (byte) 12, 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cv.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 != 710) {
            this.field_H = (dh) null;
          }
          if (param2 == this.field_A) {
            this.e((byte) -23);
          } else {
            if (this.field_D == param2) {
              rv.a((byte) 58);
            } else {
              if (this.field_N == param2) {
                if (this.field_B) {
                  nt.c(param1 ^ 710);
                } else {
                  if (this.field_J) {
                    nb.a(true);
                  } else {
                    pi.a((byte) -110);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("cv.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != this.field_K) {
          kw.field_b.a(this.field_K, 20 + (this.field_r + param0), param1 + this.field_v + 15, this.field_q - 40, this.field_p, 16777215, -1, 1, 0, kw.field_b.field_s);
        }
        if (param2 >= -35) {
          this.field_H = (dh) null;
        }
        if (null != this.field_D) {
          lk.f(param0 + 10, param1 + 134, -20 + this.field_q, 4210752);
        }
        super.a(param0, param1, (byte) -59, param3);
    }

    cv(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (mh) null);
        rt dupTemp$0 = null;
        rt dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        wp stackIn_18_1 = null;
        wp stackIn_18_2 = null;
        wp stackIn_19_1 = null;
        wp stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ue var6 = null;
        RuntimeException var6_ref = null;
        vn var7 = null;
        String var8 = null;
        jj var9 = null;
        rt var12 = null;
        rt var13 = null;
        try {
          stackIn_4_1 = (param2);
          this.field_B = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_M = stackIn_7_1;
          this.field_K = param1;
          stackIn_10_1 = (param4);
          this.field_J = stackIn_10_1;
          if (this.field_B && (this.field_M ||
            this.field_J)) {
            throw new IllegalStateException();
          }
          this.field_H = (dh) ((Object) new qq(param0, (qm) (this), 100));
          this.field_I = (dh) ((Object) new qq("", (qm) (this), 20));
          if (!this.field_B) {
            this.field_A = new wp(ma.field_c, (qm) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (this.field_J) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = tm.field_b;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = cq.field_c;
            }
            this.field_N = new wp(stackIn_19_3, (qm) null);
            if (this.field_M) {
              this.field_D = new wp(ms.field_i, (qm) (this));
            }
          } else {
            this.field_A = new wp(ii.field_b, (qm) null);
            this.field_N = new wp(of.field_k, (qm) null);
            this.field_H.field_x = false;
          }
          this.field_H.field_w = (mh) ((Object) new nl(10000536));
          this.field_I.field_w = (mh) ((Object) new c(10000536));
          var6 = new ue();
          this.field_A.field_w = (mh) ((Object) var6);
          if (this.field_N != null) {
            this.field_N.field_w = (mh) ((Object) var6);
          }
          this.field_H.field_t = cn.field_hb;
          if (null != this.field_D) {
            this.field_D.field_w = (mh) ((Object) var6);
          }
          if (null != this.field_D) {
            this.field_D.field_t = aj.field_x;
          }
          if (this.field_B) {
            this.field_N.field_t = rv.field_a;
          } else {
            if (!this.field_J) {
              this.field_N.field_w = (mh) ((Object) new bv());
            } else {
              this.field_N.field_t = hg.field_t;
              this.field_N.field_w = (mh) ((Object) new bv());
            }
          }
          this.field_v = 15;
          var7 = kw.field_b;
          if (this.field_K != null) {
            this.field_v = this.field_v + (var7.a(this.field_K, -40 + this.field_q, var7.field_s) + 5);
          }
          var8 = ej.field_g;
          var9 = lv.a(ra.c(2), 1);
          if (go.field_m != var9) {
            if (tr.field_j == var9) {
              var8 = ph.field_h;
            }
          } else {
            var8 = ow.field_b;
          }
          dupTemp$0 = new rt(10, this.field_v, this.field_q - 20, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, 80);
          this.field_v = this.field_v + (((pk) ((Object) var12)).field_p + 5);
          dupTemp$1 = new rt(10, this.field_v, -20 + this.field_q, 25, this.field_I, false, 80, 3, var7, 16777215, pi.field_g);
          var13 = dupTemp$1;
          this.a(dupTemp$1, 107);
          this.field_v = this.field_v + (((pk) ((Object) var13)).field_p + 5);
          this.field_A.field_o = (qm) (this);
          if (this.field_D != null) {
            this.field_D.field_o = (qm) (this);
          }
          if (this.field_N != null) {
            this.field_N.field_o = (qm) (this);
          }
          if (null != this.field_D) {
            this.field_A.a(-123, 85, this.field_v, 30, this.field_q - 95);
            this.field_v = this.field_v + 60;
          } else {
            this.field_A.a(120, 8, this.field_v, 30, -16 + this.field_q);
            this.field_v = this.field_v + 35;
          }
          if (null != this.field_D) {
            this.field_D.a(111, 8, this.field_v, 30, -6 + (this.field_q - 10));
            this.field_v = this.field_v + 35;
          }
          if (this.field_N != null) {
            if (!this.field_B &&
              !this.field_J) {
              this.field_N.a(-110, 8, this.field_v, 20, 40);
              this.field_v = this.field_v + 25;
            } else {
              this.field_N.a(126, 8, this.field_v, 30, this.field_q - 16);
              this.field_v = this.field_v + 35;
            }
          }
          this.a(-48, 0, 0, this.field_v + 3, this.field_q);
          this.a(this.field_A, 84);
          if (null != this.field_D) {
            this.a(this.field_D, 127);
          }
          if (null != this.field_N) {
            this.a(this.field_N, 117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("cv.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_G = null;
        if (param0 >= -116) {
          return;
        }
        field_F = null;
    }

    final static int e(boolean param0) {
        if (param0) {
          field_O = -86;
        }
        return cb.field_c;
    }

    final void h(int param0) {
        this.field_H.i(-1);
        this.field_I.i(-1);
        if (param0 >= -76) {
          this.field_H = (dh) null;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 9) {
            return false;
          }
          if (super.a(param0, param1, (byte) 63, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_9_0 = this.a((byte) -104, param0);
            return stackIn_9_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_12_0 = this.a(param0, false);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("cv.KA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(byte param0) {
        if (oi.a((byte) -64) ||
          !(this.field_H.field_m.length() <= 0) &&
          !(this.field_I.field_m.length() <= 0)) {
          m.a(this.field_I.field_m, this.field_H.field_m, -1807);
        }
        if (param0 != -23) {
          this.field_D = (wp) null;
        }
    }

    public final void a(dh param0, byte param1) {
        try {
          if (param1 > -127) {
            this.field_A = (wp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cv.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, String param1) {
        dh var3 = null;
        String var4 = null;
        try {
          if (param0 != -3499) {
            dh var5 = (dh) null;
            this.a((dh) null, 89);
          }
          var3 = this.field_H;
          var4 = param1;
          var3.a(false, var4, (byte) 67);
          this.field_I.i(param0 + 3498);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cv.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0) {
        if (this.field_H.field_m == null) {
          return "";
        }
        int var2 = -85 % ((-35 - param0) / 59);
        return this.field_H.field_m;
    }

    static {
        field_G = new int[128];
        field_F = new tg();
        field_O = 480;
    }
}
