/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends rf {
    static u field_P;
    private int field_E;
    private dl field_K;
    private n field_L;
    private String field_N;
    static ko field_H;
    static am field_M;
    static String field_J;
    static int field_O;
    static String[] field_I;

    final String a(byte param0) {
        if (param0 < -23) {
          return null;
        }
        return (String) null;
    }

    final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("io.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, db param1, db param2) {
        try {
          oj.field_H = param2;
          ka.field_m = param1;
          if (param0 != 4096) {
            field_P = (u) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "io.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_H = null;
        field_P = null;
        field_M = null;
        field_J = null;
        if (param0 <= -120) {
          field_I = null;
          return;
        }
        un var2 = (un) null;
        io.a(89, 18, -26, (un) null, -101, 42);
        field_I = null;
    }

    io(n param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, c.b(false));
        try {
          this.field_N = param1;
          this.field_L = param0;
          this.a(param5, param2, param3, param4, (byte) -52);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "io.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        oi var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        dl var19;
        Object var22;
        Object var27;
        Object var31;
        Object var35;
        Object var39;
        Object var43;
        Object var47;
        fi var51;
        String var5;
        int var11;
        int var12;
        dl var20;
        dl var21;
        dl var23;
        dl var24;
        dl var25;
        String var26;
        dl var28;
        dl var29;
        dl var30;
        dl var32;
        dl var33;
        dl var34;
        dl var36;
        dl var37;
        dl var38;
        dl var40;
        dl var41;
        dl var42;
        dl var44;
        dl var45;
        dl var46;
        dl var48;
        dl var49;
        dl var50;
        fi var52;
        fi var53;
        fi var54;
        fi var55;
        fi var56;
        fi var57;
        fi var58;
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
        int var9Lifetime2Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime2Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        oi var6Lifetime1;
        oi var6Lifetime2;
        oi var6Lifetime3;
        oi var6Lifetime1Lifetime1;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var35 = null;
        var39 = null;
        var43 = null;
        var47 = null;
        var13 = CrazyCrystals.field_B;
        var6 = this.field_L.c((byte) 45);
        if (ta.field_h == var6) {
          var17 = vo.field_b;
          if (!var17.equals(this.field_o)) {
            this.field_o = var17;
            this.b(true);
          }
          if (param1 > -12) {
            this.field_N = (String) null;
            super.a(param0, (byte) -110, param2, param3);
            var6 = this.field_L.c((byte) 45);
            var51 = (fi) ((Object) this.field_i);
            var9 = param2 + this.field_r;
            var10 = var51.a(param0, (byte) 50, (qm) (this)) + (var51.a((qm) (this), 1).a((byte) -90) >> 1);
            if (var6 != ta.field_h &&
              ec.field_h != var6) {
              if (var6 == rk.field_c) {
                var20 = ao.field_b[2];
                var20.d(var9, -(var20.field_u >> 1) + var10, 256);
                return;
              }
              if (ih.field_b != var6) {
                return;
              }
              var19 = ao.field_b[1];
              var19.d(var9, -(var19.field_u >> 1) + var10, 256);
              return;
            }
            var21 = ao.field_b[0];
            var11 = var21.field_n << 1;
            var12 = var21.field_o << 1;
            if (this.field_K != null &&
              var11 <= this.field_K.field_l &&
              var12 <= this.field_K.field_u) {
              em.a((byte) 38, this.field_K);
              kh.a();
            } else {
              this.field_K = new dl(var11, var12);
              em.a((byte) 38, this.field_K);
            }
            var21.a(112, 144, var21.field_n << 4, var21.field_o << 4, -this.field_E << 10, 4096);
            lg.a(1);
            this.field_K.d(var9 - (var21.field_n >> 1), var10 - var21.field_o, 256);
            return;
          }
          super.a(param0, (byte) -110, param2, param3);
          var6 = this.field_L.c((byte) 45);
          var52 = (fi) ((Object) this.field_i);
          var9Lifetime5 = param2 + this.field_r;
          var10Lifetime5 = var52.a(param0, (byte) 50, (qm) (this)) + (var52.a((qm) (this), 1).a((byte) -90) >> 1);
          if (var6 != ta.field_h &&
            ec.field_h != var6) {
            if (var6 == rk.field_c) {
              var24 = ao.field_b[2];
              var24.d(var9Lifetime5, -(var24.field_u >> 1) + var10Lifetime5, 256);
              return;
            }
            if (ih.field_b != var6) {
              return;
            }
            var23 = ao.field_b[1];
            var23.d(var9Lifetime5, -(var23.field_u >> 1) + var10Lifetime5, 256);
            return;
          }
          var25 = ao.field_b[0];
          var11Lifetime5 = var25.field_n << 1;
          var12Lifetime5 = var25.field_o << 1;
          if (this.field_K == null) {
            this.field_K = new dl(var11Lifetime5, var12Lifetime5);
            em.a((byte) 38, this.field_K);
          } else {
            if (var11Lifetime5 > this.field_K.field_l) {
              this.field_K = new dl(var11Lifetime5, var12Lifetime5);
              em.a((byte) 38, this.field_K);
            } else {
              if (var12Lifetime5 <= this.field_K.field_u) {
                em.a((byte) 38, this.field_K);
                kh.a();
              } else {
                this.field_K = new dl(var11Lifetime5, var12Lifetime5);
                em.a((byte) 38, this.field_K);
              }
            }
          }
          var25.a(112, 144, var25.field_n << 4, var25.field_o << 4, -this.field_E << 10, 4096);
          lg.a(1);
          this.field_K.d(var9Lifetime5 - (var25.field_n >> 1), var10Lifetime5 - var25.field_o, 256);
          return;
        }
        if (ec.field_h == var6) {
          var26 = vo.field_b;
          if (!var26.equals(this.field_o)) {
            this.field_o = var26;
            this.b(true);
          }
          if (param1 > -12) {
            this.field_N = (String) null;
            super.a(param0, (byte) -110, param2, param3);
            var6 = this.field_L.c((byte) 45);
            var53 = (fi) ((Object) this.field_i);
            var9Lifetime1 = param2 + this.field_r;
            var10Lifetime1 = var53.a(param0, (byte) 50, (qm) (this)) + (var53.a((qm) (this), 1).a((byte) -90) >> 1);
            if (var6 != ta.field_h &&
              ec.field_h != var6) {
              if (var6 == rk.field_c) {
                var29 = ao.field_b[2];
                var29.d(var9Lifetime1, -(var29.field_u >> 1) + var10Lifetime1, 256);
                return;
              }
              if (ih.field_b != var6) {
                return;
              }
              var28 = ao.field_b[1];
              var28.d(var9Lifetime1, -(var28.field_u >> 1) + var10Lifetime1, 256);
              return;
            }
            var30 = ao.field_b[0];
            var11Lifetime1 = var30.field_n << 1;
            var12Lifetime1 = var30.field_o << 1;
            if (this.field_K != null &&
              var11Lifetime1 <= this.field_K.field_l &&
              var12Lifetime1 <= this.field_K.field_u) {
              em.a((byte) 38, this.field_K);
              kh.a();
            } else {
              this.field_K = new dl(var11Lifetime1, var12Lifetime1);
              em.a((byte) 38, this.field_K);
            }
            var30.a(112, 144, var30.field_n << 4, var30.field_o << 4, -this.field_E << 10, 4096);
            lg.a(1);
            this.field_K.d(var9Lifetime1 - (var30.field_n >> 1), var10Lifetime1 - var30.field_o, 256);
            return;
          }
          super.a(param0, (byte) -110, param2, param3);
          var6 = this.field_L.c((byte) 45);
          var54 = (fi) ((Object) this.field_i);
          var9Lifetime1Lifetime1 = param2 + this.field_r;
          var10Lifetime1Lifetime1 = var54.a(param0, (byte) 50, (qm) (this)) + (var54.a((qm) (this), 1).a((byte) -90) >> 1);
          if (var6 != ta.field_h &&
            ec.field_h != var6) {
            if (var6 == rk.field_c) {
              var33 = ao.field_b[2];
              var33.d(var9Lifetime1Lifetime1, -(var33.field_u >> 1) + var10Lifetime1Lifetime1, 256);
              return;
            }
            if (ih.field_b != var6) {
              return;
            }
            var32 = ao.field_b[1];
            var32.d(var9Lifetime1Lifetime1, -(var32.field_u >> 1) + var10Lifetime1Lifetime1, 256);
            return;
          }
          var34 = ao.field_b[0];
          var11Lifetime1Lifetime1 = var34.field_n << 1;
          var12Lifetime1Lifetime1 = var34.field_o << 1;
          if (this.field_K == null) {
            this.field_K = new dl(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            em.a((byte) 38, this.field_K);
          } else {
            if (var11Lifetime1Lifetime1 > this.field_K.field_l) {
              this.field_K = new dl(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              em.a((byte) 38, this.field_K);
            } else {
              if (var12Lifetime1Lifetime1 > this.field_K.field_u) {
                this.field_K = new dl(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                em.a((byte) 38, this.field_K);
              } else {
                em.a((byte) 38, this.field_K);
                kh.a();
              }
            }
          }
          var34.a(112, 144, var34.field_n << 4, var34.field_o << 4, -this.field_E << 10, 4096);
          lg.a(1);
          this.field_K.d(var9Lifetime1Lifetime1 - (var34.field_n >> 1), var10Lifetime1Lifetime1 - var34.field_o, 256);
          return;
        }
        var5 = this.field_L.a(-16774);
        if (var5 == null) {
          var5 = this.field_N;
        }
        if (var5.equals(this.field_o)) {
          if (param1 <= -12) {
            super.a(param0, (byte) -110, param2, param3);
            var6Lifetime1 = this.field_L.c((byte) 45);
            var58 = (fi) ((Object) this.field_i);
            var9Lifetime2 = param2 + this.field_r;
            var10Lifetime2 = var58.a(param0, (byte) 50, (qm) (this)) + (var58.a((qm) (this), 1).a((byte) -90) >> 1);
            if (var6Lifetime1 != ta.field_h &&
              ec.field_h != var6Lifetime1) {
              if (var6Lifetime1 == rk.field_c) {
                var49 = ao.field_b[2];
                var49.d(var9Lifetime2, -(var49.field_u >> 1) + var10Lifetime2, 256);
                return;
              }
              if (ih.field_b != var6Lifetime1) {
                return;
              }
              var48 = ao.field_b[1];
              var48.d(var9Lifetime2, -(var48.field_u >> 1) + var10Lifetime2, 256);
              return;
            }
            var50 = ao.field_b[0];
            var11Lifetime2 = var50.field_n << 1;
            var12Lifetime2 = var50.field_o << 1;
            if (this.field_K != null &&
              var11Lifetime2 <= this.field_K.field_l &&
              var12Lifetime2 <= this.field_K.field_u) {
              em.a((byte) 38, this.field_K);
              kh.a();
            } else {
              this.field_K = new dl(var11Lifetime2, var12Lifetime2);
              em.a((byte) 38, this.field_K);
            }
            var50.a(112, 144, var50.field_n << 4, var50.field_o << 4, -this.field_E << 10, 4096);
            lg.a(1);
            this.field_K.d(var9Lifetime2 - (var50.field_n >> 1), var10Lifetime2 - var50.field_o, 256);
            return;
          }
          this.field_N = (String) null;
          super.a(param0, (byte) -110, param2, param3);
          var6Lifetime1Lifetime1 = this.field_L.c((byte) 45);
          var57 = (fi) ((Object) this.field_i);
          var9Lifetime2Lifetime1 = param2 + this.field_r;
          var10Lifetime2Lifetime1 = var57.a(param0, (byte) 50, (qm) (this)) + (var57.a((qm) (this), 1).a((byte) -90) >> 1);
          if (var6Lifetime1Lifetime1 != ta.field_h &&
            ec.field_h != var6Lifetime1Lifetime1) {
            if (var6Lifetime1Lifetime1 == rk.field_c) {
              var45 = ao.field_b[2];
              var45.d(var9Lifetime2Lifetime1, -(var45.field_u >> 1) + var10Lifetime2Lifetime1, 256);
              return;
            }
            if (ih.field_b != var6Lifetime1Lifetime1) {
              return;
            }
            var44 = ao.field_b[1];
            var44.d(var9Lifetime2Lifetime1, -(var44.field_u >> 1) + var10Lifetime2Lifetime1, 256);
            return;
          }
          var46 = ao.field_b[0];
          var11Lifetime2Lifetime1 = var46.field_n << 1;
          var12Lifetime2Lifetime1 = var46.field_o << 1;
          if (this.field_K != null &&
            var11Lifetime2Lifetime1 <= this.field_K.field_l &&
            var12Lifetime2Lifetime1 <= this.field_K.field_u) {
            em.a((byte) 38, this.field_K);
            kh.a();
          } else {
            this.field_K = new dl(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
            em.a((byte) 38, this.field_K);
          }
          var46.a(112, 144, var46.field_n << 4, var46.field_o << 4, -this.field_E << 10, 4096);
          lg.a(1);
          this.field_K.d(var9Lifetime2Lifetime1 - (var46.field_n >> 1), var10Lifetime2Lifetime1 - var46.field_o, 256);
          return;
        }
        this.field_o = var5;
        this.b(true);
        if (param1 > -12) {
          this.field_N = (String) null;
          super.a(param0, (byte) -110, param2, param3);
          var6Lifetime2 = this.field_L.c((byte) 45);
          var55 = (fi) ((Object) this.field_i);
          var9Lifetime3 = param2 + this.field_r;
          var10Lifetime3 = var55.a(param0, (byte) 50, (qm) (this)) + (var55.a((qm) (this), 1).a((byte) -90) >> 1);
          if (var6Lifetime2 != ta.field_h &&
            ec.field_h != var6Lifetime2) {
            if (var6Lifetime2 == rk.field_c) {
              var37 = ao.field_b[2];
              var37.d(var9Lifetime3, -(var37.field_u >> 1) + var10Lifetime3, 256);
              return;
            }
            if (ih.field_b != var6Lifetime2) {
              return;
            }
            var36 = ao.field_b[1];
            var36.d(var9Lifetime3, -(var36.field_u >> 1) + var10Lifetime3, 256);
            return;
          }
          var38 = ao.field_b[0];
          var11Lifetime3 = var38.field_n << 1;
          var12Lifetime3 = var38.field_o << 1;
          if (this.field_K != null &&
            var11Lifetime3 <= this.field_K.field_l &&
            var12Lifetime3 <= this.field_K.field_u) {
            em.a((byte) 38, this.field_K);
            kh.a();
          } else {
            this.field_K = new dl(var11Lifetime3, var12Lifetime3);
            em.a((byte) 38, this.field_K);
          }
          var38.a(112, 144, var38.field_n << 4, var38.field_o << 4, -this.field_E << 10, 4096);
          lg.a(1);
          this.field_K.d(var9Lifetime3 - (var38.field_n >> 1), var10Lifetime3 - var38.field_o, 256);
          return;
        }
        super.a(param0, (byte) -110, param2, param3);
        var6Lifetime3 = this.field_L.c((byte) 45);
        var56 = (fi) ((Object) this.field_i);
        var9Lifetime4 = param2 + this.field_r;
        var10Lifetime4 = var56.a(param0, (byte) 50, (qm) (this)) + (var56.a((qm) (this), 1).a((byte) -90) >> 1);
        if (var6Lifetime3 != ta.field_h &&
          ec.field_h != var6Lifetime3) {
          if (var6Lifetime3 == rk.field_c) {
            var41 = ao.field_b[2];
            var41.d(var9Lifetime4, -(var41.field_u >> 1) + var10Lifetime4, 256);
            return;
          }
          if (ih.field_b != var6Lifetime3) {
            return;
          }
          var40 = ao.field_b[1];
          var40.d(var9Lifetime4, -(var40.field_u >> 1) + var10Lifetime4, 256);
          return;
        }
        var42 = ao.field_b[0];
        var11Lifetime4 = var42.field_n << 1;
        var12Lifetime4 = var42.field_o << 1;
        if (this.field_K == null) {
          this.field_K = new dl(var11Lifetime4, var12Lifetime4);
          em.a((byte) 38, this.field_K);
        } else {
          if (var11Lifetime4 > this.field_K.field_l) {
            this.field_K = new dl(var11Lifetime4, var12Lifetime4);
            em.a((byte) 38, this.field_K);
          } else {
            if (var12Lifetime4 <= this.field_K.field_u) {
              em.a((byte) 38, this.field_K);
              kh.a();
            } else {
              this.field_K = new dl(var11Lifetime4, var12Lifetime4);
              em.a((byte) 38, this.field_K);
            }
          }
        }
        var42.a(112, 144, var42.field_n << 4, var42.field_o << 4, -this.field_E << 10, 4096);
        lg.a(1);
        this.field_K.d(var9Lifetime4 - (var42.field_n >> 1), var10Lifetime4 - var42.field_o, 256);
        return;
    }

    final static dd a(int param0, int param1, int param2, un param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        dd var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = pg.a((byte) 112, param4, param0, param1, param3, param5);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (dd) (stackIn_2_0);
          }
          var7 = new dd();
          if (param2 != 1038170945) {
            field_M = (am) null;
          }
          var7.field_e = var8;
          var7.field_e.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param4);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("io.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          int var5_int = 31 / ((-50 - param1) / 59);
          this.field_E = this.field_E + 1;
          super.a(param0, 72, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "io.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_P = new u();
        field_J = "This level is available as a taster of the '<%0>' section.";
        field_I = new String[]{"Over 50 more mind-bending puzzles", "Lasers and explosions", "Spiders to kill, balls to trap", "Make everything work together", "Picture levels, variety levels ...", "... and some truly zany levels!", "12 exacting two-player puzzles", "Kill each other ...", "... or work and die together!", "5 crazy three-player puzzles", "And you thought two was bad!", "25 frantic arcade levels", "Race and outrun the bombs!", "Spiders and balls take chase!", "Dodge balls for England!", "Start avalanches and chain reactions!", null, null, "<col=FF0000>WARNING: serious challenges ahead."};
    }
}
