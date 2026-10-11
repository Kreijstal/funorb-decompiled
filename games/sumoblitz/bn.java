/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends ar {
    private wb field_K;
    static int field_R;
    private v field_Q;
    static int field_T;
    private String field_U;
    private int field_S;
    static String field_O;
    static boolean field_P;

    final String c(int param0) {
        if (param0 == -6696) {
          return null;
        }
        return (String) null;
    }

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        pk var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 61) {
            return false;
          }
          var4 = (pk) null;
          this.a((pk) null, (byte) 73);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bn.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
          this.field_S = this.field_S + 1;
          super.a(param0, 83, param2, param3);
          int var5_int = -76 / ((param1 + 25) / 45);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "bn.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5;
        gf var6;
        int var13;
        Object var17;
        Object var22;
        Object var27;
        Object var32;
        Object var37;
        Object var46;
        int var9;
        int var10;
        int var11;
        int var12;
        wb var16;
        wb var18;
        wb var19;
        wb var20;
        String var21;
        wb var23;
        wb var24;
        wb var25;
        String var26;
        wb var28;
        wb var29;
        wb var30;
        String var31;
        wb var33;
        wb var34;
        wb var35;
        String var36;
        wb var38;
        wb var39;
        wb var44;
        wb var45;
        wb var47;
        wb var48;
        wb var49;
        de var50;
        de var51;
        de var52;
        de var53;
        de var54;
        de var55;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime6;
        gf var6Lifetime1;
        gf var6Lifetime2;
        gf var6Lifetime3;
        gf var6Lifetime4;
        gf var6Lifetime5;
        var17 = null;
        var22 = null;
        var27 = null;
        var32 = null;
        var37 = null;
        var46 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        if (param2 < -35) {
          var6 = this.field_Q.c(-126);
          if (var6 != mb.field_f &&
            var6 != kt.field_a) {
            var5 = this.field_Q.a(3690);
            if (var5 == null) {
              var5 = this.field_U;
            }
          } else {
            var5 = hi.field_g;
          }
          if (!var5.equals(this.field_m)) {
            this.field_m = var5;
            this.a(9);
          }
          super.a(param0, param1, (byte) -119, param3);
          var6Lifetime5 = this.field_Q.c(-106);
          var50 = (de) ((Object) this.field_w);
          var9 = this.field_r + param0;
          var10 = var50.b(param1, (pk) (this), 0) + (var50.b(-3, (pk) (this)).a(true) >> 1);
          if (var6Lifetime5 != mb.field_f &&
            kt.field_a != var6Lifetime5) {
            if (qr.field_e == var6Lifetime5) {
              var18 = fw.field_m[2];
              var18.d(var9, -(var18.field_u >> 1) + var10, 256);
              return;
            }
            if (qe.field_a != var6Lifetime5) {
              return;
            }
            var19 = fw.field_m[1];
            var19.d(var9, var10 - (var19.field_u >> 1), 256);
            return;
          }
          var20 = fw.field_m[0];
          var11 = var20.field_z << 1;
          var12 = var20.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new wb(var11, var12);
            jq.a(7161, this.field_K);
          } else {
            if (var11 > this.field_K.field_x) {
              this.field_K = new wb(var11, var12);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u < var12) {
                this.field_K = new wb(var11, var12);
                jq.a(7161, this.field_K);
              } else {
                jq.a(7161, this.field_K);
                lk.b();
              }
            }
          }
          var20.a(112, 144, var20.field_z << 4, var20.field_w << 4, -this.field_S << 10, 4096);
          su.a((byte) -50);
          this.field_K.d(-(var20.field_z >> 1) + var9, -var20.field_w + var10, 256);
          return;
        }
        this.a(-71, -15, (byte) -42, -1);
        var6Lifetime1 = this.field_Q.c(-126);
        if (var6Lifetime1 == mb.field_f) {
          var21 = hi.field_g;
          if (!var21.equals(this.field_m)) {
            this.field_m = var21;
            this.a(9);
          }
          super.a(param0, param1, (byte) -119, param3);
          var6Lifetime1 = this.field_Q.c(-106);
          var51 = (de) ((Object) this.field_w);
          var9Lifetime1 = this.field_r + param0;
          var10Lifetime1 = var51.b(param1, (pk) (this), 0) + (var51.b(-3, (pk) (this)).a(true) >> 1);
          if (var6Lifetime1 != mb.field_f &&
            kt.field_a != var6Lifetime1) {
            if (qr.field_e == var6Lifetime1) {
              var23 = fw.field_m[2];
              var23.d(var9Lifetime1, -(var23.field_u >> 1) + var10Lifetime1, 256);
              return;
            }
            if (qe.field_a != var6Lifetime1) {
              return;
            }
            var24 = fw.field_m[1];
            var24.d(var9Lifetime1, var10Lifetime1 - (var24.field_u >> 1), 256);
            return;
          }
          var25 = fw.field_m[0];
          var11Lifetime1 = var25.field_z << 1;
          var12Lifetime1 = var25.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new wb(var11Lifetime1, var12Lifetime1);
            jq.a(7161, this.field_K);
          } else {
            if (var11Lifetime1 > this.field_K.field_x) {
              this.field_K = new wb(var11Lifetime1, var12Lifetime1);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u < var12Lifetime1) {
                this.field_K = new wb(var11Lifetime1, var12Lifetime1);
                jq.a(7161, this.field_K);
              } else {
                jq.a(7161, this.field_K);
                lk.b();
              }
            }
          }
          var25.a(112, 144, var25.field_z << 4, var25.field_w << 4, -this.field_S << 10, 4096);
          su.a((byte) -50);
          this.field_K.d(-(var25.field_z >> 1) + var9Lifetime1, -var25.field_w + var10Lifetime1, 256);
          return;
        }
        if (var6Lifetime1 == kt.field_a) {
          var26 = hi.field_g;
          if (!var26.equals(this.field_m)) {
            this.field_m = var26;
            this.a(9);
          }
          super.a(param0, param1, (byte) -119, param3);
          var6Lifetime1 = this.field_Q.c(-106);
          var52 = (de) ((Object) this.field_w);
          var9Lifetime2 = this.field_r + param0;
          var10Lifetime2 = var52.b(param1, (pk) (this), 0) + (var52.b(-3, (pk) (this)).a(true) >> 1);
          if (var6Lifetime1 != mb.field_f &&
            kt.field_a != var6Lifetime1) {
            if (qr.field_e == var6Lifetime1) {
              var28 = fw.field_m[2];
              var28.d(var9Lifetime2, -(var28.field_u >> 1) + var10Lifetime2, 256);
              return;
            }
            if (qe.field_a != var6Lifetime1) {
              return;
            }
            var29 = fw.field_m[1];
            var29.d(var9Lifetime2, var10Lifetime2 - (var29.field_u >> 1), 256);
            return;
          }
          var30 = fw.field_m[0];
          var11Lifetime2 = var30.field_z << 1;
          var12Lifetime2 = var30.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new wb(var11Lifetime2, var12Lifetime2);
            jq.a(7161, this.field_K);
          } else {
            if (var11Lifetime2 > this.field_K.field_x) {
              this.field_K = new wb(var11Lifetime2, var12Lifetime2);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u >= var12Lifetime2) {
                jq.a(7161, this.field_K);
                lk.b();
              } else {
                this.field_K = new wb(var11Lifetime2, var12Lifetime2);
                jq.a(7161, this.field_K);
              }
            }
          }
          var30.a(112, 144, var30.field_z << 4, var30.field_w << 4, -this.field_S << 10, 4096);
          su.a((byte) -50);
          this.field_K.d(-(var30.field_z >> 1) + var9Lifetime2, -var30.field_w + var10Lifetime2, 256);
          return;
        }
        var31 = this.field_Q.a(3690);
        if (var31 != null) {
          if (!var31.equals(this.field_m)) {
            this.field_m = var31;
            this.a(9);
          }
          super.a(param0, param1, (byte) -119, param3);
          var6Lifetime2 = this.field_Q.c(-106);
          var53 = (de) ((Object) this.field_w);
          var9Lifetime3 = this.field_r + param0;
          var10Lifetime3 = var53.b(param1, (pk) (this), 0) + (var53.b(-3, (pk) (this)).a(true) >> 1);
          if (var6Lifetime2 != mb.field_f &&
            kt.field_a != var6Lifetime2) {
            if (qr.field_e == var6Lifetime2) {
              var33 = fw.field_m[2];
              var33.d(var9Lifetime3, -(var33.field_u >> 1) + var10Lifetime3, 256);
              return;
            }
            if (qe.field_a != var6Lifetime2) {
              return;
            }
            var34 = fw.field_m[1];
            var34.d(var9Lifetime3, var10Lifetime3 - (var34.field_u >> 1), 256);
            return;
          }
          var35 = fw.field_m[0];
          var11Lifetime3 = var35.field_z << 1;
          var12Lifetime3 = var35.field_w << 1;
          if (this.field_K == null) {
            this.field_K = new wb(var11Lifetime3, var12Lifetime3);
            jq.a(7161, this.field_K);
          } else {
            if (var11Lifetime3 > this.field_K.field_x) {
              this.field_K = new wb(var11Lifetime3, var12Lifetime3);
              jq.a(7161, this.field_K);
            } else {
              if (this.field_K.field_u >= var12Lifetime3) {
                jq.a(7161, this.field_K);
                lk.b();
              } else {
                this.field_K = new wb(var11Lifetime3, var12Lifetime3);
                jq.a(7161, this.field_K);
              }
            }
          }
          var35.a(112, 144, var35.field_z << 4, var35.field_w << 4, -this.field_S << 10, 4096);
          su.a((byte) -50);
          this.field_K.d(-(var35.field_z >> 1) + var9Lifetime3, -var35.field_w + var10Lifetime3, 256);
          return;
        }
        var36 = this.field_U;
        if (var36.equals(this.field_m)) {
          super.a(param0, param1, (byte) -119, param3);
          var6Lifetime3 = this.field_Q.c(-106);
          var55 = (de) ((Object) this.field_w);
          var9Lifetime4 = this.field_r + param0;
          var10Lifetime4 = var55.b(param1, (pk) (this), 0) + (var55.b(-3, (pk) (this)).a(true) >> 1);
          if (var6Lifetime3 != mb.field_f &&
            kt.field_a != var6Lifetime3) {
            if (qr.field_e == var6Lifetime3) {
              var47 = fw.field_m[2];
              var47.d(var9Lifetime4, -(var47.field_u >> 1) + var10Lifetime4, 256);
              return;
            }
            if (qe.field_a != var6Lifetime3) {
              return;
            }
            var48 = fw.field_m[1];
            var48.d(var9Lifetime4, var10Lifetime4 - (var48.field_u >> 1), 256);
            return;
          }
          var49 = fw.field_m[0];
          var11Lifetime4 = var49.field_z << 1;
          var12Lifetime4 = var49.field_w << 1;
          if (this.field_K != null &&
            var11Lifetime4 <= this.field_K.field_x) {
            if (this.field_K.field_u >= var12Lifetime4) {
              jq.a(7161, this.field_K);
              lk.b();
            } else {
              this.field_K = new wb(var11Lifetime4, var12Lifetime4);
              jq.a(7161, this.field_K);
            }
          } else {
            this.field_K = new wb(var11Lifetime4, var12Lifetime4);
            jq.a(7161, this.field_K);
          }
          var49.a(112, 144, var49.field_z << 4, var49.field_w << 4, -this.field_S << 10, 4096);
          su.a((byte) -50);
          this.field_K.d(-(var49.field_z >> 1) + var9Lifetime4, -var49.field_w + var10Lifetime4, 256);
          return;
        }
        this.field_m = var36;
        this.a(9);
        super.a(param0, param1, (byte) -119, param3);
        var6Lifetime4 = this.field_Q.c(-106);
        var54 = (de) ((Object) this.field_w);
        var9Lifetime5 = this.field_r + param0;
        var10Lifetime5 = var54.b(param1, (pk) (this), 0) + (var54.b(-3, (pk) (this)).a(true) >> 1);
        if (var6Lifetime4 == mb.field_f) {
          var38 = fw.field_m[0];
          var11Lifetime5 = var38.field_z << 1;
          var12Lifetime5 = var38.field_w << 1;
          if (this.field_K != null &&
            var11Lifetime5 <= this.field_K.field_x) {
            if (this.field_K.field_u >= var12Lifetime5) {
              jq.a(7161, this.field_K);
              lk.b();
            } else {
              this.field_K = new wb(var11Lifetime5, var12Lifetime5);
              jq.a(7161, this.field_K);
            }
          } else {
            this.field_K = new wb(var11Lifetime5, var12Lifetime5);
            jq.a(7161, this.field_K);
          }
          var38.a(112, 144, var38.field_z << 4, var38.field_w << 4, -this.field_S << 10, 4096);
          su.a((byte) -50);
          this.field_K.d(-(var38.field_z >> 1) + var9Lifetime5, -var38.field_w + var10Lifetime5, 256);
          return;
        }
        if (kt.field_a != var6Lifetime4) {
          if (qr.field_e == var6Lifetime4) {
            var44 = fw.field_m[2];
            var44.d(var9Lifetime5, -(var44.field_u >> 1) + var10Lifetime5, 256);
            return;
          }
          if (qe.field_a != var6Lifetime4) {
            return;
          }
          var45 = fw.field_m[1];
          var45.d(var9Lifetime5, var10Lifetime5 - (var45.field_u >> 1), 256);
          return;
        }
        var39 = fw.field_m[0];
        var16 = var39;
        var11Lifetime6 = var39.field_z << 1;
        var12Lifetime6 = var39.field_w << 1;
        if (this.field_K != null &&
          var11Lifetime6 <= this.field_K.field_x) {
          if (this.field_K.field_u >= var12Lifetime6) {
            jq.a(7161, this.field_K);
            lk.b();
          } else {
            this.field_K = new wb(var11Lifetime6, var12Lifetime6);
            jq.a(7161, this.field_K);
          }
        } else {
          this.field_K = new wb(var11Lifetime6, var12Lifetime6);
          jq.a(7161, this.field_K);
        }
        var39.a(112, 144, var39.field_z << 4, var39.field_w << 4, -this.field_S << 10, 4096);
        su.a((byte) -50);
        this.field_K.d(-(var39.field_z >> 1) + var9Lifetime5, -var39.field_w + var10Lifetime5, 256);
        return;
    }

    final static void f(int param0) {
        nv.field_a = nv.field_a + 1;
        jt.field_u = 150;
        int var1 = nv.field_a / param0;
        if (un.field_a.length - 1 != var1) {
          if (un.field_a.length <= var1) {
            var1 = un.field_a.length - 1;
          }
          pd.field_p = un.field_a[var1];
          return;
        }
        ta.field_b = ta.field_b + 1;
        if (ps.field_e[12] == ta.field_b) {
          th.b(24753, 243, 12);
          if (un.field_a.length <= var1) {
            var1 = un.field_a.length - 1;
          }
          pd.field_p = un.field_a[var1];
          return;
        }
        if (un.field_a.length <= var1) {
          var1 = un.field_a.length - 1;
        }
        pd.field_p = un.field_a[var1];
    }

    bn(v param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, fw.a(0));
        try {
          this.field_U = param1;
          this.field_Q = param0;
          this.a(-60, param2, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void g(byte param0) {
        field_O = null;
        int var1 = -83 / ((param0 + 17) / 49);
    }

    static {
        field_T = 5;
        field_O = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_P = false;
        field_R = 0;
    }
}
