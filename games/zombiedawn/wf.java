/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends hm {
    static boolean[] field_P;
    private String field_Q;
    private vn field_O;
    private vc field_R;
    private int field_T;

    final boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 67) {
            return false;
          }
          this.field_T = 52;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_P = null;
        if (param0 < 62) {
          wf.h(-102);
        }
    }

    wf(vc param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, tp.c(113));
        try {
          this.field_Q = param1;
          this.field_R = param0;
          this.a(-119, param3, param2, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
          int var5_int = 101 / ((46 - param1) / 42);
          this.field_T = this.field_T + 1;
          super.a(param0, (byte) -91, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "wf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        rh var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        vn var16;
        String var17;
        Object var18;
        vn var19;
        vn var20;
        vn var21;
        String var22;
        Object var23;
        vn var24;
        vn var25;
        vn var26;
        String var27;
        Object var28;
        vn var29;
        vn var30;
        vn var33;
        vn var34;
        Object var35;
        vn var36;
        vn var37;
        vn var38;
        ak var39;
        ak var40;
        ak var41;
        ak var42;
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
        rh var6Lifetime1;
        rh var6Lifetime2;
        vn var16Lifetime1;
        var18 = null;
        var23 = null;
        var28 = null;
        var35 = null;
        var13 = ZombieDawn.field_J;
        var6 = this.field_R.a((byte) -73);
        if (var6 == se.field_l) {
          var17 = no.field_E;
          if (!var17.equals(this.field_o)) {
            this.field_o = var17;
            this.d((byte) -36);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.a((byte) -120);
          var39 = (ak) ((Object) this.field_h);
          var9 = this.field_k + param2;
          var10 = var39.a((ga) (this), param3 + 1, param0) + (var39.a(112, (ga) (this)).a((byte) 102) >> 1);
          if (var6 != se.field_l &&
            gj.field_v != var6) {
            if (var6 == uc.field_b) {
              var20 = dj.field_k[2];
              var20.b(var9, -(var20.field_t >> 1) + var10, 256);
              return;
            }
            if (mc.field_g != var6) {
              return;
            }
            var19 = dj.field_k[1];
            var19.b(var9, -(var19.field_t >> 1) + var10, 256);
            return;
          }
          var21 = dj.field_k[0];
          var11 = var21.field_r << 1;
          var12 = var21.field_q << 1;
          if (this.field_O == null) {
            this.field_O = new vn(var11, var12);
            ki.a((byte) -118, this.field_O);
          } else {
            if (var11 > this.field_O.field_w) {
              this.field_O = new vn(var11, var12);
              ki.a((byte) -118, this.field_O);
            } else {
              if (var12 > this.field_O.field_t) {
                this.field_O = new vn(var11, var12);
                ki.a((byte) -118, this.field_O);
              } else {
                ki.a((byte) -103, this.field_O);
                bi.d();
              }
            }
          }
          var21.a(112, 144, var21.field_r << 4, var21.field_q << 4, -this.field_T << 10, 4096);
          pa.a(-21189);
          this.field_O.b(-(var21.field_r >> 1) + var9, var10 - var21.field_q, 256);
          return;
        }
        if (var6 == gj.field_v) {
          var22 = no.field_E;
          if (!var22.equals(this.field_o)) {
            this.field_o = var22;
            this.d((byte) -36);
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_R.a((byte) -120);
          var40 = (ak) ((Object) this.field_h);
          var9Lifetime1 = this.field_k + param2;
          var10Lifetime1 = var40.a((ga) (this), param3 + 1, param0) + (var40.a(112, (ga) (this)).a((byte) 102) >> 1);
          if (var6 != se.field_l &&
            gj.field_v != var6) {
            if (var6 == uc.field_b) {
              var25 = dj.field_k[2];
              var25.b(var9Lifetime1, -(var25.field_t >> 1) + var10Lifetime1, 256);
              return;
            }
            if (mc.field_g != var6) {
              return;
            }
            var24 = dj.field_k[1];
            var24.b(var9Lifetime1, -(var24.field_t >> 1) + var10Lifetime1, 256);
            return;
          }
          var26 = dj.field_k[0];
          var11Lifetime1 = var26.field_r << 1;
          var12Lifetime1 = var26.field_q << 1;
          if (this.field_O == null) {
            this.field_O = new vn(var11Lifetime1, var12Lifetime1);
            ki.a((byte) -118, this.field_O);
          } else {
            if (var11Lifetime1 > this.field_O.field_w) {
              this.field_O = new vn(var11Lifetime1, var12Lifetime1);
              ki.a((byte) -118, this.field_O);
            } else {
              if (var12Lifetime1 <= this.field_O.field_t) {
                ki.a((byte) -103, this.field_O);
                bi.d();
              } else {
                this.field_O = new vn(var11Lifetime1, var12Lifetime1);
                ki.a((byte) -118, this.field_O);
              }
            }
          }
          var26.a(112, 144, var26.field_r << 4, var26.field_q << 4, -this.field_T << 10, 4096);
          pa.a(-21189);
          this.field_O.b(-(var26.field_r >> 1) + var9Lifetime1, var10Lifetime1 - var26.field_q, 256);
          return;
        }
        var5 = this.field_R.b((byte) 78);
        if (var5 != null) {
          if (!var5.equals(this.field_o)) {
            this.field_o = var5;
            this.d((byte) -36);
          }
          super.a(param0, param1, param2, param3);
          var6Lifetime1 = this.field_R.a((byte) -120);
          var42 = (ak) ((Object) this.field_h);
          var9Lifetime2 = this.field_k + param2;
          var10Lifetime2 = var42.a((ga) (this), param3 + 1, param0) + (var42.a(112, (ga) (this)).a((byte) 102) >> 1);
          if (var6Lifetime1 != se.field_l &&
            gj.field_v != var6Lifetime1) {
            if (var6Lifetime1 == uc.field_b) {
              var37 = dj.field_k[2];
              var37.b(var9Lifetime2, -(var37.field_t >> 1) + var10Lifetime2, 256);
              return;
            }
            if (mc.field_g != var6Lifetime1) {
              return;
            }
            var36 = dj.field_k[1];
            var36.b(var9Lifetime2, -(var36.field_t >> 1) + var10Lifetime2, 256);
            return;
          }
          var38 = dj.field_k[0];
          var11Lifetime2 = var38.field_r << 1;
          var12Lifetime2 = var38.field_q << 1;
          if (this.field_O != null &&
            var11Lifetime2 <= this.field_O.field_w) {
            if (var12Lifetime2 <= this.field_O.field_t) {
              ki.a((byte) -103, this.field_O);
              bi.d();
            } else {
              this.field_O = new vn(var11Lifetime2, var12Lifetime2);
              ki.a((byte) -118, this.field_O);
            }
          } else {
            this.field_O = new vn(var11Lifetime2, var12Lifetime2);
            ki.a((byte) -118, this.field_O);
          }
          var38.a(112, 144, var38.field_r << 4, var38.field_q << 4, -this.field_T << 10, 4096);
          pa.a(-21189);
          this.field_O.b(-(var38.field_r >> 1) + var9Lifetime2, var10Lifetime2 - var38.field_q, 256);
          return;
        }
        var27 = this.field_Q;
        var5Lifetime1 = var27;
        if (!var27.equals(this.field_o)) {
          this.field_o = var27;
          this.d((byte) -36);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime2 = this.field_R.a((byte) -120);
        var41 = (ak) ((Object) this.field_h);
        var9Lifetime3 = this.field_k + param2;
        var10Lifetime3 = var41.a((ga) (this), param3 + 1, param0) + (var41.a(112, (ga) (this)).a((byte) 102) >> 1);
        if (var6Lifetime2 == se.field_l) {
          var29 = dj.field_k[0];
          var16 = var29;
          var11Lifetime3 = var29.field_r << 1;
          var12Lifetime3 = var29.field_q << 1;
          if (this.field_O == null) {
            this.field_O = new vn(var11Lifetime3, var12Lifetime3);
            ki.a((byte) -118, this.field_O);
          } else {
            if (var11Lifetime3 > this.field_O.field_w) {
              this.field_O = new vn(var11Lifetime3, var12Lifetime3);
              ki.a((byte) -118, this.field_O);
            } else {
              if (var12Lifetime3 <= this.field_O.field_t) {
                ki.a((byte) -103, this.field_O);
                bi.d();
              } else {
                this.field_O = new vn(var11Lifetime3, var12Lifetime3);
                ki.a((byte) -118, this.field_O);
              }
            }
          }
          var29.a(112, 144, var29.field_r << 4, var29.field_q << 4, -this.field_T << 10, 4096);
          pa.a(-21189);
          this.field_O.b(-(var29.field_r >> 1) + var9Lifetime3, var10Lifetime3 - var29.field_q, 256);
          return;
        }
        if (gj.field_v != var6Lifetime2) {
          if (var6Lifetime2 == uc.field_b) {
            var34 = dj.field_k[2];
            var34.b(var9Lifetime3, -(var34.field_t >> 1) + var10Lifetime3, 256);
            return;
          }
          if (mc.field_g != var6Lifetime2) {
            return;
          }
          var33 = dj.field_k[1];
          var33.b(var9Lifetime3, -(var33.field_t >> 1) + var10Lifetime3, 256);
          return;
        }
        var30 = dj.field_k[0];
        var16Lifetime1 = var30;
        var11Lifetime4 = var30.field_r << 1;
        var12Lifetime4 = var30.field_q << 1;
        if (this.field_O == null) {
          this.field_O = new vn(var11Lifetime4, var12Lifetime4);
          ki.a((byte) -118, this.field_O);
        } else {
          if (var11Lifetime4 > this.field_O.field_w) {
            this.field_O = new vn(var11Lifetime4, var12Lifetime4);
            ki.a((byte) -118, this.field_O);
          } else {
            if (var12Lifetime4 > this.field_O.field_t) {
              this.field_O = new vn(var11Lifetime4, var12Lifetime4);
              ki.a((byte) -118, this.field_O);
            } else {
              ki.a((byte) -103, this.field_O);
              bi.d();
            }
          }
        }
        var30.a(112, 144, var30.field_r << 4, var30.field_q << 4, -this.field_T << 10, 4096);
        pa.a(-21189);
        this.field_O.b(-(var30.field_r >> 1) + var9Lifetime3, var10Lifetime3 - var30.field_q, 256);
    }

    final String d(int param0) {
        int var2 = 44 / ((10 - param0) / 58);
        return null;
    }

    final static Boolean e(byte param0) {
        Boolean var1 = ba.field_g;
        ba.field_g = null;
        if (param0 < 22) {
          field_P = (boolean[]) null;
          return var1;
        }
        return var1;
    }

    static {
        field_P = new boolean[32];
    }
}
