/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends cj {
    static String field_O;
    static String[] field_M;
    static int field_Q;
    static boolean field_T;
    private String field_R;
    private int field_V;
    static nc field_Z;
    static String field_S;
    private bd field_P;
    static String field_X;
    static int[] field_W;
    static int[] field_U;
    private bg field_Y;
    static vh field_N;

    final String e(int param0) {
        if (param0 == 34) {
          return null;
        }
        return (String) null;
    }

    public static void a(byte param0) {
        field_U = null;
        field_X = null;
        field_N = null;
        field_W = null;
        field_O = null;
        field_M = null;
        if (param0 == 78) {
          field_Z = null;
          field_S = null;
          return;
        }
    }

    final boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        ag var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0) {
            var4 = (ag) null;
            this.a((ag) null, -14, 37, 1);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("al.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    al(bg param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ni.a(101));
        try {
          this.field_R = param1;
          this.field_Y = param0;
          this.a(param4, param3, 0, param2, param5);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
          this.field_V = this.field_V + 1;
          super.a(param0, param1, param2 ^ param2, param3);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "al.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        bm var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        bd var19;
        bd var20;
        Object var22;
        Object var27;
        Object var31;
        Object var36;
        Object var42;
        Object var46;
        mi var50;
        String var5;
        int var11;
        int var12;
        bd var16;
        bd var21;
        bd var23;
        bd var24;
        bd var25;
        String var26;
        bd var28;
        bd var29;
        bd var30;
        bd var32;
        bd var33;
        bd var34;
        String var35;
        bd var37;
        bd var38;
        bd var39;
        bd var43;
        bd var44;
        bd var45;
        bd var47;
        bd var48;
        bd var49;
        mi var51;
        mi var52;
        mi var53;
        mi var54;
        mi var55;
        mi var56;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var9Lifetime5;
        int var10Lifetime5;
        int var11Lifetime5;
        int var12Lifetime5;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        bm var6Lifetime1;
        bm var6Lifetime2;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var42 = null;
        var46 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var6 = this.field_Y.b(-110);
        if (wl.field_c == var6) {
          var17 = mg.field_d;
          if (!var17.equals(this.field_n)) {
            this.field_n = var17;
            this.j(-25638);
          }
          super.a(param0, param1, (byte) 107, param3);
          var6 = this.field_Y.b(-100);
          if (param2 <= 42) {
            field_Q = 125;
            var50 = (mi) ((Object) this.field_h);
            var9 = this.field_v + param1;
            var10 = var50.a(-1, (ag) (this), param0) + (var50.a((ag) (this), 1).a(true) >> 1);
            if (var6 != wl.field_c &&
              m.field_n != var6) {
              if (bi.field_d == var6) {
                var20 = cf.field_u[2];
                var20.c(var9, -(var20.field_A >> 1) + var10, 256);
                return;
              }
              if (var6 != nd.field_d) {
                return;
              }
              var19 = cf.field_u[1];
              var19.c(var9, var10 - (var19.field_A >> 1), 256);
              return;
            }
            var21 = cf.field_u[0];
            var11 = var21.field_u << 1;
            var12 = var21.field_r << 1;
            if (this.field_P != null &&
              this.field_P.field_z >= var11 &&
              this.field_P.field_A >= var12) {
              sb.a(this.field_P, -117);
              si.d();
            } else {
              this.field_P = new bd(var11, var12);
              sb.a(this.field_P, -120);
            }
            var21.b(112, 144, var21.field_u << 4, var21.field_r << 4, -this.field_V << 10, 4096);
            eh.b(false);
            this.field_P.c(-(var21.field_u >> 1) + var9, var10 - var21.field_r, 256);
            return;
          }
          var51 = (mi) ((Object) this.field_h);
          var9Lifetime5 = this.field_v + param1;
          var10Lifetime5 = var51.a(-1, (ag) (this), param0) + (var51.a((ag) (this), 1).a(true) >> 1);
          if (var6 != wl.field_c &&
            m.field_n != var6) {
            if (bi.field_d == var6) {
              var24 = cf.field_u[2];
              var24.c(var9Lifetime5, -(var24.field_A >> 1) + var10Lifetime5, 256);
              return;
            }
            if (var6 != nd.field_d) {
              return;
            }
            var23 = cf.field_u[1];
            var23.c(var9Lifetime5, var10Lifetime5 - (var23.field_A >> 1), 256);
            return;
          }
          var25 = cf.field_u[0];
          var11Lifetime5 = var25.field_u << 1;
          var12Lifetime5 = var25.field_r << 1;
          if (this.field_P == null) {
            this.field_P = new bd(var11Lifetime5, var12Lifetime5);
            sb.a(this.field_P, -120);
          } else {
            if (this.field_P.field_z < var11Lifetime5) {
              this.field_P = new bd(var11Lifetime5, var12Lifetime5);
              sb.a(this.field_P, -120);
            } else {
              if (this.field_P.field_A >= var12Lifetime5) {
                sb.a(this.field_P, -117);
                si.d();
              } else {
                this.field_P = new bd(var11Lifetime5, var12Lifetime5);
                sb.a(this.field_P, -120);
              }
            }
          }
          var25.b(112, 144, var25.field_u << 4, var25.field_r << 4, -this.field_V << 10, 4096);
          eh.b(false);
          this.field_P.c(-(var25.field_u >> 1) + var9Lifetime5, var10Lifetime5 - var25.field_r, 256);
          return;
        }
        if (var6 == m.field_n) {
          var26 = mg.field_d;
          if (!var26.equals(this.field_n)) {
            this.field_n = var26;
            this.j(-25638);
          }
          super.a(param0, param1, (byte) 107, param3);
          var6 = this.field_Y.b(-100);
          if (param2 <= 42) {
            field_Q = 125;
            var52 = (mi) ((Object) this.field_h);
            var9Lifetime1 = this.field_v + param1;
            var10Lifetime1 = var52.a(-1, (ag) (this), param0) + (var52.a((ag) (this), 1).a(true) >> 1);
            if (var6 != wl.field_c &&
              m.field_n != var6) {
              if (bi.field_d == var6) {
                var29 = cf.field_u[2];
                var29.c(var9Lifetime1, -(var29.field_A >> 1) + var10Lifetime1, 256);
                return;
              }
              if (var6 != nd.field_d) {
                return;
              }
              var28 = cf.field_u[1];
              var28.c(var9Lifetime1, var10Lifetime1 - (var28.field_A >> 1), 256);
              return;
            }
            var30 = cf.field_u[0];
            var11Lifetime1 = var30.field_u << 1;
            var12Lifetime1 = var30.field_r << 1;
            if (this.field_P != null &&
              this.field_P.field_z >= var11Lifetime1 &&
              this.field_P.field_A >= var12Lifetime1) {
              sb.a(this.field_P, -117);
              si.d();
            } else {
              this.field_P = new bd(var11Lifetime1, var12Lifetime1);
              sb.a(this.field_P, -120);
            }
            var30.b(112, 144, var30.field_u << 4, var30.field_r << 4, -this.field_V << 10, 4096);
            eh.b(false);
            this.field_P.c(-(var30.field_u >> 1) + var9Lifetime1, var10Lifetime1 - var30.field_r, 256);
            return;
          }
          var53 = (mi) ((Object) this.field_h);
          var9Lifetime1Lifetime1 = this.field_v + param1;
          var10Lifetime1Lifetime1 = var53.a(-1, (ag) (this), param0) + (var53.a((ag) (this), 1).a(true) >> 1);
          if (var6 != wl.field_c &&
            m.field_n != var6) {
            if (bi.field_d == var6) {
              var33 = cf.field_u[2];
              var33.c(var9Lifetime1Lifetime1, -(var33.field_A >> 1) + var10Lifetime1Lifetime1, 256);
              return;
            }
            if (var6 != nd.field_d) {
              return;
            }
            var32 = cf.field_u[1];
            var32.c(var9Lifetime1Lifetime1, var10Lifetime1Lifetime1 - (var32.field_A >> 1), 256);
            return;
          }
          var34 = cf.field_u[0];
          var11Lifetime1Lifetime1 = var34.field_u << 1;
          var12Lifetime1Lifetime1 = var34.field_r << 1;
          if (this.field_P == null) {
            this.field_P = new bd(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            sb.a(this.field_P, -120);
          } else {
            if (this.field_P.field_z < var11Lifetime1Lifetime1) {
              this.field_P = new bd(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              sb.a(this.field_P, -120);
            } else {
              if (this.field_P.field_A < var12Lifetime1Lifetime1) {
                this.field_P = new bd(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                sb.a(this.field_P, -120);
              } else {
                sb.a(this.field_P, -117);
                si.d();
              }
            }
          }
          var34.b(112, 144, var34.field_u << 4, var34.field_r << 4, -this.field_V << 10, 4096);
          eh.b(false);
          this.field_P.c(-(var34.field_u >> 1) + var9Lifetime1Lifetime1, var10Lifetime1Lifetime1 - var34.field_r, 256);
          return;
        }
        var5 = this.field_Y.a(-56);
        if (var5 == null) {
          var35 = this.field_R;
          var5 = var35;
          if (!var35.equals(this.field_n)) {
            this.field_n = var35;
            this.j(-25638);
          }
          super.a(param0, param1, (byte) 107, param3);
          var6Lifetime1 = this.field_Y.b(-100);
          if (param2 <= 42) {
            field_Q = 125;
          }
          var54 = (mi) ((Object) this.field_h);
          var9Lifetime2 = this.field_v + param1;
          var10Lifetime2 = var54.a(-1, (ag) (this), param0) + (var54.a((ag) (this), 1).a(true) >> 1);
          if (var6Lifetime1 != wl.field_c &&
            m.field_n != var6Lifetime1) {
            if (bi.field_d == var6Lifetime1) {
              var38 = cf.field_u[2];
              var38.c(var9Lifetime2, -(var38.field_A >> 1) + var10Lifetime2, 256);
            } else {
              if (var6Lifetime1 != nd.field_d) {
                return;
              }
              var37 = cf.field_u[1];
              var37.c(var9Lifetime2, var10Lifetime2 - (var37.field_A >> 1), 256);
            }
            return;
          }
          var39 = cf.field_u[0];
          var16 = var39;
          var11Lifetime2 = var39.field_u << 1;
          var12Lifetime2 = var39.field_r << 1;
          if (this.field_P == null) {
            this.field_P = new bd(var11Lifetime2, var12Lifetime2);
            sb.a(this.field_P, -120);
          } else {
            if (this.field_P.field_z < var11Lifetime2) {
              this.field_P = new bd(var11Lifetime2, var12Lifetime2);
              sb.a(this.field_P, -120);
            } else {
              if (this.field_P.field_A >= var12Lifetime2) {
                sb.a(this.field_P, -117);
                si.d();
              } else {
                this.field_P = new bd(var11Lifetime2, var12Lifetime2);
                sb.a(this.field_P, -120);
              }
            }
          }
          var39.b(112, 144, var39.field_u << 4, var39.field_r << 4, -this.field_V << 10, 4096);
          eh.b(false);
          this.field_P.c(-(var39.field_u >> 1) + var9Lifetime2, var10Lifetime2 - var39.field_r, 256);
          return;
        }
        if (!var5.equals(this.field_n)) {
          this.field_n = var5;
          this.j(-25638);
        }
        super.a(param0, param1, (byte) 107, param3);
        var6Lifetime2 = this.field_Y.b(-100);
        if (param2 > 42) {
          var56 = (mi) ((Object) this.field_h);
          var9Lifetime3 = this.field_v + param1;
          var10Lifetime3 = var56.a(-1, (ag) (this), param0) + (var56.a((ag) (this), 1).a(true) >> 1);
          if (var6Lifetime2 != wl.field_c &&
            m.field_n != var6Lifetime2) {
            if (bi.field_d == var6Lifetime2) {
              var48 = cf.field_u[2];
              var48.c(var9Lifetime3, -(var48.field_A >> 1) + var10Lifetime3, 256);
              return;
            }
            if (var6Lifetime2 != nd.field_d) {
              return;
            }
            var47 = cf.field_u[1];
            var47.c(var9Lifetime3, var10Lifetime3 - (var47.field_A >> 1), 256);
            return;
          }
          var49 = cf.field_u[0];
          var11Lifetime3 = var49.field_u << 1;
          var12Lifetime3 = var49.field_r << 1;
          if (this.field_P != null &&
            this.field_P.field_z >= var11Lifetime3 &&
            this.field_P.field_A >= var12Lifetime3) {
            sb.a(this.field_P, -117);
            si.d();
          } else {
            this.field_P = new bd(var11Lifetime3, var12Lifetime3);
            sb.a(this.field_P, -120);
          }
          var49.b(112, 144, var49.field_u << 4, var49.field_r << 4, -this.field_V << 10, 4096);
          eh.b(false);
          this.field_P.c(-(var49.field_u >> 1) + var9Lifetime3, var10Lifetime3 - var49.field_r, 256);
          return;
        }
        field_Q = 125;
        var55 = (mi) ((Object) this.field_h);
        var9Lifetime4 = this.field_v + param1;
        var10Lifetime4 = var55.a(-1, (ag) (this), param0) + (var55.a((ag) (this), 1).a(true) >> 1);
        if (var6Lifetime2 != wl.field_c &&
          m.field_n != var6Lifetime2) {
          if (bi.field_d == var6Lifetime2) {
            var44 = cf.field_u[2];
            var44.c(var9Lifetime4, -(var44.field_A >> 1) + var10Lifetime4, 256);
            return;
          }
          if (var6Lifetime2 != nd.field_d) {
            return;
          }
          var43 = cf.field_u[1];
          var43.c(var9Lifetime4, var10Lifetime4 - (var43.field_A >> 1), 256);
          return;
        }
        var45 = cf.field_u[0];
        var11Lifetime4 = var45.field_u << 1;
        var12Lifetime4 = var45.field_r << 1;
        if (this.field_P != null &&
          this.field_P.field_z >= var11Lifetime4 &&
          this.field_P.field_A >= var12Lifetime4) {
          sb.a(this.field_P, -117);
          si.d();
        } else {
          this.field_P = new bd(var11Lifetime4, var12Lifetime4);
          sb.a(this.field_P, -120);
        }
        var45.b(112, 144, var45.field_u << 4, var45.field_r << 4, -this.field_V << 10, 4096);
        eh.b(false);
        this.field_P.c(-(var45.field_u >> 1) + var9Lifetime4, var10Lifetime4 - var45.field_r, 256);
        return;
    }

    static {
        field_O = "Pick-ups";
        field_M = new String[255];
        field_Q = 0;
        field_S = "Collect ammo packs to replenish your stocks. If you run out of ammo you will have to rely on your pistol.<br>The auto gun and the C.R.A.G. share ammo packs, while the railgun and plasma cannon share energy cells.";
        field_X = "Accept";
        field_U = new int[6];
        field_W = new int[128];
    }
}
