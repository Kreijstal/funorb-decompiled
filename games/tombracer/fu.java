/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu extends dg {
    private fla field_r;
    private fla field_v;
    private int field_s;
    private int field_p;
    private int field_o;
    private int field_m;
    private boolean field_n;
    private int field_u;
    private int field_q;
    static jea field_t;

    final void a(boolean param0, int param1) {
        try {
          if (param0) {
            this.field_r = (fla) null;
          }
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fu.H(" + param0 + ',' + param1 + ')');
        }
    }

    fu(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void a(byte param0, kh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a((byte) 90, param1);
          var3_int = 39 % ((-8 - param0) / 40);
          param1.a((byte) -128, this.field_u, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fu.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    fu(int param0) {
        super(param0);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u == 0) {
            via.a(df.field_J[17], this.field_m, this.field_q, param3 + 1572864, param2, param1, 111, 0);
          } else {
            if (this.field_u == 1) {
              gqa.a(this.field_m, -83584144, param1, param2, df.field_J[76], param3);
            }
          }
          var6_int = 67 % ((param4 + 38) / 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("fu.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        Object var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        try {
          if (null != bl.field_a) {
            var3_int = bl.field_a.a(param2, 1513);
            if (var3_int != 0) {
              if (var3_int == 2 &&
                bl.field_a.field_r != null &&
                !bl.field_a.field_r.equals("")) {
                if (bl.field_a.field_r.charAt(0) != 91) {
                  var7 = (CharSequence) ((Object) bl.field_a.field_r);
                  var4 = jd.a(1, var7);
                } else {
                  var4 = bl.field_a.field_r;
                }
                var5 = null;
                if (cn.field_k == 0) {
                  var5 = rf.a(true, var4, param1);
                }
                if (1 == cn.field_k) {
                  var5 = uca.a(var4, (byte) 102, param1);
                }
                if (cn.field_k == 2) {
                  var5 = nna.a(-3, var4, param1);
                }
                if (3 == cn.field_k) {
                  var5 = kc.a(var4, param1, false, var4);
                }
                if (var5 != null) {
                  var6 = (String) null;
                  gu.a(0, true, var4, (String) (var5), (String) null, 2);
                }
              }
              bl.field_a = null;
              cn.field_k = -1;
            }
          }
          if (param0 > -37) {
            fu.n((byte) 14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "fu.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, la param1, kh param2) {
        iq var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.a(120, param1, param2);
          if (param0 <= 119) {
            var5 = (iq) null;
            this.a((iq) null, -12, 26, 100, (byte) -44);
          }
          if (param1.field_E >= 16) {
            this.field_u = param2.b((byte) 44, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fu.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void n(byte param0) {
        try {
          field_t = null;
          if (param0 != -51) {
            field_t = (jea) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fu.F(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        int var3_int = 0;
        fsa var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var7_int = 0;
        wda var7 = null;
        nv var8 = null;
        int var9 = 0;
        Object var10 = null;
        w var10_ref = null;
        vna var11 = null;
        uja var12 = null;
        vna var13 = null;
        uja var14 = null;
        int var4Lifetime1;
        var10 = null;
        var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          super.d(param0);
          if (this.field_u == 0) {
            var4 = this.j((byte) 16).d(3);
            var5 = this.j((byte) 16).e(param0 + 9649);
            if (this.field_n) {
              var3_int = 0;
              var2_int = 0;
              this.field_n = false;
            } else {
              var3_int = var5 - this.field_p;
              var2_int = var4 - this.field_o;
            }
            this.field_p = var5;
            this.field_o = var4;
            if (var2_int != 0 ||
              var3_int != 0) {
              this.field_m = dfa.a(qva.a((byte) -103, -var3_int, var2_int) >> 2, 2048, 125);
              this.field_q = dfa.a(this.field_q - (ua.a(var2_int >> 13, -113) + ua.a(var3_int >> 13, 67)), 2048, -100);
              if (!(65536 >= ua.a(var2_int, param0 + 93)) ||
                !(ua.a(var3_int, param0 ^ -85) <= 65536)) {
                this.a(103).a(false, this.b((byte) -119), 0, -var2_int, this.c((byte) 127), -var3_int);
              }
            }
          } else {
            if (this.field_u == 1 && (null == this.field_k ||
              this.field_k.a(-93))) {
              this.field_m = dfa.a(128 + this.field_m, 2048, 122);
            }
          }
          var10_ref = (w) (this.a(param0 + 64).field_G);
          if (var10_ref == null) {
            return;
          }
          var3_ref = (fsa) (this.field_h);
          if (!var3_ref.d(50, false)) {
            stackIn_28_0 = (this.field_u == 1) ? 1 : 0;
          } else {
            stackIn_28_0 = 1;
          }
          {
            var4Lifetime1 = stackIn_28_0;
            if (var4Lifetime1 != 0 && (null == this.field_v ||
              !this.field_v.l((byte) -101))) {
              if (this.field_u == 0) {
                this.field_v = var10_ref.a(new fm(10, this.b((byte) -90), this.c((byte) 103), this.e((byte) -103)), param0 - 57);
              } else if (this.field_u != 1) {
              } else {
                this.field_v = var10_ref.a(new fm(11, this.b((byte) 112), this.c((byte) 121), this.e((byte) -125)), -58);
              }
            } else {
              if (this.field_v != null &&
                var4Lifetime1 == 0) {
                this.field_v.a(-90, var10_ref);
                this.field_v = null;
              }
            }
          }
          if (this.field_v != null) {
            this.field_v.a(this.b((byte) -83), var10_ref.field_c, -128, var10_ref.field_h, this.c((byte) 107));
          }
          if (this.field_u == 1) {
            var11 = var3_ref.field_u;
            var12 = new uja(var11);
            var7_int = 0;
            var8 = (nv) (var12.a(true));
            while (var8 != null) {
              if (var8 instanceof fra &&
                ((fra) (var8)).field_o > 0) {
                var7_int = 1;
              }
              var8 = (nv) (var12.a(-1));
            }
            if (var7_int != 0 &&
              null == this.field_r) {
              this.field_r = var10_ref.a(new fm(12, this.b((byte) -105), this.c((byte) 104), this.e((byte) -119)), -58);
            }
            if (this.field_r != null &&
              this.field_r.field_i.field_f.e()) {
              this.field_r.a(-88, var10_ref);
              this.field_r = null;
            }
          }
          if (0 == this.field_u) {
            var13 = var3_ref.field_B;
            var14 = new uja(var13);
            var7 = (wda) (var14.a(true));
            while (var7 != null) {
              if (var7 instanceof ro &&
                ((ro) (var7)).d(false) != this.field_s) {
                var10_ref.a(new fm(3, this.b((byte) 68), this.c((byte) 124), this.e((byte) -111)), -58);
                this.field_s = ((ro) (var7)).d(false);
              }
              var7 = (wda) (var14.a(param0 + 0));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fu.K(" + param0 + ')');
        }
    }

    static {
    }
}
