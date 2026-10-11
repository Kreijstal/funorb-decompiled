/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends se {
    private vb field_fb;
    static String field_P;
    static bn field_cb;
    static ok field_bb;
    private String field_eb;
    private int field_db;
    private km field_T;

    final void a(int param0, int param1, mf param2, int param3) {
        try {
          this.field_db = this.field_db + 1;
          super.a(param0, -32, param2, param3);
          if (param1 >= -6) {
            mf var6 = (mf) null;
            this.a(95, -66, (mf) null, 75);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ea.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void g(byte param0) {
        int var1 = 101 / ((param0 - 37) / 53);
        field_bb = null;
        field_P = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        mk var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        km var16;
        String var17;
        Object var18;
        km var19;
        km var20;
        km var21;
        String var22;
        Object var23;
        km var24;
        km var25;
        km var26;
        String var27;
        Object var28;
        km var29;
        km var31;
        km var37;
        km var38;
        Object var39;
        km var40;
        km var41;
        km var42;
        mg var43;
        mg var44;
        mg var45;
        mg var46;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        String var5Lifetime1;
        mk var6Lifetime1;
        mk var6Lifetime2;
        km var16Lifetime1;
        var18 = null;
        var23 = null;
        var28 = null;
        var39 = null;
        var13 = Chess.field_G;
        if (param2 >= -80) {
          return;
        }
        var6 = this.field_fb.a(21314);
        if (in.field_g == var6) {
          var17 = cc.field_v;
          if (!var17.equals(this.field_v)) {
            this.field_v = var17;
            this.f((byte) 105);
          }
          super.a(param0, param1, -109, param3);
          var6 = this.field_fb.a(21314);
          var43 = (mg) ((Object) this.field_n);
          var9 = param3 + this.field_u;
          var10 = var43.a(0, param0, (mf) (this)) + (var43.a((mf) (this), -23159).a((byte) 34) >> 1);
          if (in.field_g != var6 &&
            var6 != ek.field_d) {
            if (var6 == qk.field_b) {
              var19 = uh.field_p[2];
              var19.d(var9, -(var19.field_t >> 1) + var10, 256);
              return;
            }
            if (oa.field_a != var6) {
              return;
            }
            var20 = uh.field_p[1];
            var20.d(var9, -(var20.field_t >> 1) + var10, 256);
            return;
          }
          var21 = uh.field_p[0];
          var11 = var21.field_v << 1;
          var12 = var21.field_u << 1;
          if (null == this.field_T) {
            this.field_T = new km(var11, var12);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var11 > this.field_T.field_w) {
              this.field_T = new km(var11, var12);
              tl.a((byte) -67, this.field_T);
            } else {
              if (var12 > this.field_T.field_t) {
                this.field_T = new km(var11, var12);
                tl.a((byte) -67, this.field_T);
              } else {
                tl.a((byte) -67, this.field_T);
                wb.b();
              }
            }
          }
          var21.b(112, 144, var21.field_v << 4, var21.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.d(-(var21.field_v >> 1) + var9, -var21.field_u + var10, 256);
          return;
        }
        if (var6 == ek.field_d) {
          var22 = cc.field_v;
          if (!var22.equals(this.field_v)) {
            this.field_v = var22;
            this.f((byte) 105);
          }
          super.a(param0, param1, -109, param3);
          var6 = this.field_fb.a(21314);
          var44 = (mg) ((Object) this.field_n);
          var9Lifetime1 = param3 + this.field_u;
          var10Lifetime1 = var44.a(0, param0, (mf) (this)) + (var44.a((mf) (this), -23159).a((byte) 34) >> 1);
          if (in.field_g != var6 &&
            var6 != ek.field_d) {
            if (var6 == qk.field_b) {
              var24 = uh.field_p[2];
              var24.d(var9Lifetime1, -(var24.field_t >> 1) + var10Lifetime1, 256);
              return;
            }
            if (oa.field_a != var6) {
              return;
            }
            var25 = uh.field_p[1];
            var25.d(var9Lifetime1, -(var25.field_t >> 1) + var10Lifetime1, 256);
            return;
          }
          var26 = uh.field_p[0];
          var11Lifetime1 = var26.field_v << 1;
          var12Lifetime1 = var26.field_u << 1;
          if (null == this.field_T) {
            this.field_T = new km(var11Lifetime1, var12Lifetime1);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var11Lifetime1 > this.field_T.field_w) {
              this.field_T = new km(var11Lifetime1, var12Lifetime1);
              tl.a((byte) -67, this.field_T);
            } else {
              if (var12Lifetime1 > this.field_T.field_t) {
                this.field_T = new km(var11Lifetime1, var12Lifetime1);
                tl.a((byte) -67, this.field_T);
              } else {
                tl.a((byte) -67, this.field_T);
                wb.b();
              }
            }
          }
          var26.b(112, 144, var26.field_v << 4, var26.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.d(-(var26.field_v >> 1) + var9Lifetime1, -var26.field_u + var10Lifetime1, 256);
          return;
        }
        var5 = this.field_fb.a(false);
        if (var5 != null) {
          if (!var5.equals(this.field_v)) {
            this.field_v = var5;
            this.f((byte) 105);
          }
          super.a(param0, param1, -109, param3);
          var6Lifetime1 = this.field_fb.a(21314);
          var46 = (mg) ((Object) this.field_n);
          var9Lifetime2 = param3 + this.field_u;
          var10Lifetime2 = var46.a(0, param0, (mf) (this)) + (var46.a((mf) (this), -23159).a((byte) 34) >> 1);
          if (in.field_g != var6Lifetime1 &&
            var6Lifetime1 != ek.field_d) {
            if (var6Lifetime1 == qk.field_b) {
              var40 = uh.field_p[2];
              var40.d(var9Lifetime2, -(var40.field_t >> 1) + var10Lifetime2, 256);
              return;
            }
            if (oa.field_a != var6Lifetime1) {
              return;
            }
            var41 = uh.field_p[1];
            var41.d(var9Lifetime2, -(var41.field_t >> 1) + var10Lifetime2, 256);
            return;
          }
          var42 = uh.field_p[0];
          var11Lifetime2 = var42.field_v << 1;
          var12Lifetime2 = var42.field_u << 1;
          if (null != this.field_T &&
            var11Lifetime2 <= this.field_T.field_w) {
            if (var12Lifetime2 <= this.field_T.field_t) {
              tl.a((byte) -67, this.field_T);
              wb.b();
            } else {
              this.field_T = new km(var11Lifetime2, var12Lifetime2);
              tl.a((byte) -67, this.field_T);
            }
          } else {
            this.field_T = new km(var11Lifetime2, var12Lifetime2);
            tl.a((byte) -67, this.field_T);
          }
          var42.b(112, 144, var42.field_v << 4, var42.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.d(-(var42.field_v >> 1) + var9Lifetime2, -var42.field_u + var10Lifetime2, 256);
          return;
        }
        var27 = this.field_eb;
        var5Lifetime1 = var27;
        if (!var27.equals(this.field_v)) {
          this.field_v = var27;
          this.f((byte) 105);
        }
        super.a(param0, param1, -109, param3);
        var6Lifetime2 = this.field_fb.a(21314);
        var45 = (mg) ((Object) this.field_n);
        var9Lifetime3 = param3 + this.field_u;
        var10Lifetime3 = var45.a(0, param0, (mf) (this)) + (var45.a((mf) (this), -23159).a((byte) 34) >> 1);
        if (in.field_g == var6Lifetime2) {
          var29 = uh.field_p[0];
          var16 = var29;
          var11Lifetime3 = var29.field_v << 1;
          var12Lifetime3 = var29.field_u << 1;
          if (null == this.field_T) {
            this.field_T = new km(var11Lifetime3, var12Lifetime3);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var11Lifetime3 > this.field_T.field_w) {
              this.field_T = new km(var11Lifetime3, var12Lifetime3);
              tl.a((byte) -67, this.field_T);
            } else {
              if (var12Lifetime3 <= this.field_T.field_t) {
                tl.a((byte) -67, this.field_T);
                wb.b();
              } else {
                this.field_T = new km(var11Lifetime3, var12Lifetime3);
                tl.a((byte) -67, this.field_T);
              }
            }
          }
          var29.b(112, 144, var29.field_v << 4, var29.field_u << 4, -this.field_db << 10, 4096);
          fd.a(28773);
          this.field_T.d(-(var29.field_v >> 1) + var9Lifetime3, -var29.field_u + var10Lifetime3, 256);
          return;
        }
        if (var6Lifetime2 != ek.field_d) {
          if (var6Lifetime2 == qk.field_b) {
            var37 = uh.field_p[2];
            var37.d(var9Lifetime3, -(var37.field_t >> 1) + var10Lifetime3, 256);
            return;
          }
          if (oa.field_a != var6Lifetime2) {
            return;
          }
          var38 = uh.field_p[1];
          var38.d(var9Lifetime3, -(var38.field_t >> 1) + var10Lifetime3, 256);
          return;
        }
        var31 = uh.field_p[0];
        var16Lifetime1 = var31;
        var11Lifetime4 = var31.field_v << 1;
        var12Lifetime4 = var31.field_u << 1;
        if (null == this.field_T) {
          this.field_T = new km(var11Lifetime4, var12Lifetime4);
          tl.a((byte) -67, this.field_T);
        } else {
          if (var11Lifetime4 > this.field_T.field_w) {
            this.field_T = new km(var11Lifetime4, var12Lifetime4);
            tl.a((byte) -67, this.field_T);
          } else {
            if (var12Lifetime4 > this.field_T.field_t) {
              this.field_T = new km(var11Lifetime4, var12Lifetime4);
              tl.a((byte) -67, this.field_T);
            } else {
              tl.a((byte) -67, this.field_T);
              wb.b();
            }
          }
        }
        var31.b(112, 144, var31.field_v << 4, var31.field_u << 4, -this.field_db << 10, 4096);
        fd.a(28773);
        this.field_T.d(-(var31.field_v >> 1) + var9Lifetime3, -var31.field_u + var10Lifetime3, 256);
    }

    final String g(int param0) {
        if (param0 == 0) {
          return null;
        }
        this.g(93);
        return null;
    }

    final boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ea.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int h(byte param0) {
        if (param0 != -16) {
          field_bb = (ok) null;
          return si.field_o;
        }
        return si.field_o;
    }

    ea(vb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, je.d(false));
        try {
          this.field_fb = param0;
          this.field_eb = param1;
          this.a(param3, 34, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static long i(byte param0) {
        int var1 = 40 % ((-84 - param0) / 36);
        return -ml.field_d + ud.a(2);
    }

    static {
        field_P = "Shortcut Reference";
    }
}
