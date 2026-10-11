/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends oj {
    int field_J;
    private boolean field_C;
    private int field_F;
    int field_I;
    static String field_D;
    static String field_z;
    static String field_y;
    static String field_A;
    static String field_H;
    int field_G;

    final static void e(byte param0) {
        if (param0 >= -73) {
          field_y = (String) null;
        }
        if (ib.field_j != -fw.field_C + 0 &&
          250 - fw.field_C == ib.field_j) {
        }
        ib.field_j = ib.field_j + 1;
    }

    final boolean a(at param0, byte param1, ic param2) {
        int stackIn_104_0 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var8 = 0;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        jd var14 = null;
        jd var15 = null;
        jd var16 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = 0;
          var6 = this.field_F;
          if (2 != var6 &&
            var6 != 3) {
            if (var6 != 1) {
              if (var6 != 4) {
                if (var6 != 0) {
                  this.c((byte) -95);
                } else if (this.a((byte) -39, param2, param0, true)) {
                  var4_int = 1;
                }
              } else if (!param2.field_xb.field_Eb[param2.field_xb.field_v * this.field_J + this.field_I].c(111)) {
                this.c((byte) -74);
              } else if (this.a((byte) -39, param2, param0, true)) {
                var4_int = 1;
              }
            } else {
              if (this.field_I > 0) {
                var13 = param2.field_xb.c(this.field_J, true, this.field_I - 1);
                if (param2.field_xb.field_Eb[this.field_I - (1 - param2.field_xb.field_v * this.field_J)].c(-65) &&
                  null == this.field_w ||
                  var13 != null &&
                  param2.field_xb.c(var13.field_O, -16985, this.field_G) &&
                  var13.a(23072)) {
                  this.field_s = this.field_s + 1;
                  if (this.a(this.field_J, 15, param2, param0, this.field_I - 1)) {
                    var4_int = 1;
                  }
                }
              }
              if (this.field_I < param2.field_xb.field_v - 1) {
                var14 = param2.field_xb.c(this.field_J, true, this.field_I + 1);
                if (param2.field_xb.field_Eb[this.field_I + 1 + param2.field_xb.field_v * this.field_J].c(-26) &&
                  this.field_w == null ||
                  var14 != null &&
                  param2.field_xb.c(var14.field_O, -16985, this.field_G) &&
                  var14.a(23072)) {
                  this.field_s = this.field_s + 1;
                  if (this.a(this.field_J, 15, param2, param0, 1 + this.field_I)) {
                    var4_int = 1;
                  }
                }
              }
              if (0 < this.field_J) {
                var15 = param2.field_xb.c(-1 + this.field_J, true, this.field_I);
                if (param2.field_xb.field_Eb[(this.field_J - 1) * param2.field_xb.field_v + this.field_I].c(-45) &&
                  this.field_w == null ||
                  var15 != null &&
                  param2.field_xb.c(var15.field_O, -16985, this.field_G) &&
                  var15.a(23072)) {
                  this.field_s = this.field_s + 1;
                  if (this.a(-1 + this.field_J, 15, param2, param0, this.field_I)) {
                    var4_int = 1;
                  }
                }
              }
              if (-1 + param2.field_xb.field_db > this.field_J) {
                var16 = param2.field_xb.c(this.field_J + 1, true, this.field_I);
                if (param2.field_xb.field_Eb[this.field_I + (1 + this.field_J) * param2.field_xb.field_v].c(-44) &&
                  null == this.field_w ||
                  var16 != null &&
                  param2.field_xb.c(var16.field_O, -16985, this.field_G) &&
                  var16.a(23072)) {
                  this.field_s = this.field_s + 1;
                  if (this.a(this.field_J + 1, 15, param2, param0, this.field_I)) {
                    var4_int = 1;
                  }
                }
              }
              if (this.field_s <= 1) {
                this.c((byte) -127);
              } else if (this.a((byte) -39, param2, param0, true)) {
                var4_int = 1;
              }
            }
          } else {
            if (this.field_I > 0) {
              var9 = param2.field_xb.c(this.field_J, true, this.field_I - 1);
              if (var9 != null &&
                param2.field_xb.c(var9.field_O, -16985, this.field_G)) {
                this.field_s = this.field_s + 1;
                if (this.a(this.field_J, 15, param2, param0, this.field_I - 1)) {
                  var4_int = 1;
                }
              }
            }
            if (param2.field_xb.field_v - 1 > this.field_I) {
              var10 = param2.field_xb.c(this.field_J, true, this.field_I + 1);
              if (var10 != null &&
                param2.field_xb.c(var10.field_O, -16985, this.field_G)) {
                this.field_s = this.field_s + 1;
                if (this.a(this.field_J, 15, param2, param0, this.field_I + 1)) {
                  var4_int = 1;
                }
              }
            }
            if (this.field_J > 0) {
              var11 = param2.field_xb.c(this.field_J - 1, true, this.field_I);
              if (var11 != null &&
                param2.field_xb.c(var11.field_O, -16985, this.field_G)) {
                this.field_s = this.field_s + 1;
                if (this.a(-1 + this.field_J, 15, param2, param0, this.field_I)) {
                  var4_int = 1;
                }
              }
            }
            if (this.field_J < param2.field_xb.field_db - 1) {
              var12 = param2.field_xb.c(1 + this.field_J, true, this.field_I);
              if (var12 != null &&
                param2.field_xb.c(var12.field_O, -16985, this.field_G)) {
                this.field_s = this.field_s + 1;
                if (this.a(1 + this.field_J, 15, param2, param0, this.field_I)) {
                  var4_int = 1;
                }
              }
            }
            if (1 < this.field_s) {
              if (this.a((byte) -39, param2, param0, true)) {
                var4_int = 1;
              }
            } else {
              this.c((byte) -114);
            }
          }
          if (param1 >= -84) {
            qq.a((byte) -37, 26, -64, -50);
          }
          this.a(param2.field_xb, -26661);
          stackIn_104_0 = var4_int;
          return stackIn_104_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_107_0 = var4;
          stackIn_107_1 = new StringBuilder().append("qq.A(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          param0 = param0 << 8 | param0;
          var4_int = param0 ^ param0 >> 1;
          if (param1 != -12933) {
            return;
          }
          for (var7 = 0; 4 > var7; var7++) {
            var5 = -54 + (bm.field_y[var7][0] + param3) + (var4_int & 15);
            var6 = param2 + (bm.field_y[var7][1] + (param0 & 7) - 64);
            fe.a(jq.field_G[3], 60 + var5, var6 + 50, jq.field_G[3].field_A >> 1, jq.field_G[3].field_x >> 1);
            var4_int = var4_int >> 1;
            param0 = param0 >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "qq.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          wd.field_b = rs.field_n.a(il.field_t[17]) + 20;
          var1_int = rs.field_n.a(il.field_t[18]);
          if (wd.field_b < var1_int) {
            wd.field_b = var1_int;
          }
          if (kr.field_G == null) {
            kr.field_G = new rk();
          }
          kr.field_G.f((byte) 79);
          if (kr.field_E == null) {
            kr.field_E = new dm();
          }
          kr.field_E.i(param0 + 0);
          kr.field_E.e((byte) 97);
          ts.field_j = bm.field_D;
          if (param0 != 1) {
            field_A = (String) null;
          }
          for (var2 = 0; var2 < oh.field_G.length; var2++) {
            oh.field_G[var2] = true;
          }
          oh.field_G[37] = false;
          oh.field_G[32] = re.a(0, (byte) -98);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "qq.D(" + param0 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != 35) {
          return;
        }
        field_A = null;
        field_y = null;
        field_D = null;
        field_H = null;
        field_z = null;
    }

    final void a(ha param0, int param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ic var5 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_C) {
            return;
          }
          this.field_C = true;
          var3_int = this.field_F;
          if (var3_int != 0) {
            if (var3_int == 1) {
              param0.a((byte) 34, this.field_G, this.field_J, this.field_I + 1);
              param0.a((byte) 30, this.field_G, this.field_J, -1 + this.field_I);
              param0.a((byte) 61, this.field_G, this.field_J + 1, this.field_I);
              param0.a((byte) 35, this.field_G, this.field_J - 1, this.field_I);
            } else {
              if (var3_int != 2) {
                if (3 == var3_int) {
                  param0.f(this.field_I + 1, this.field_G, 126, this.field_J);
                  param0.f(-1 + this.field_I, this.field_G, param1 + 26785, this.field_J);
                  param0.f(this.field_I, this.field_G, 121, this.field_J + 1);
                  param0.f(this.field_I, this.field_G, 119, -1 + this.field_J);
                } else {
                  if (4 == var3_int) {
                    param0.a(-100, param0.field_Eb[param0.field_v * this.field_J + this.field_I]);
                  }
                }
              } else {
                param0.a(-122, false, this.field_I + 1, this.field_J, this.field_G, 3);
                param0.a(-125, false, -1 + this.field_I, this.field_J, this.field_G, 3);
                param0.a(-119, false, this.field_I, 1 + this.field_J, this.field_G, 3);
                param0.a(-128, false, this.field_I, -1 + this.field_J, this.field_G, 3);
              }
            }
          } else {
            param0.c(this.field_J, this.field_I, this.field_G, (byte) -115);
          }
          if (param1 != -26661) {
            var5 = (ic) null;
            this.a((at) null, (byte) -124, (ic) null);
          }
          if (2 == this.field_F ||
            3 == this.field_F) {
            param0.e(14, this.field_I + 1, this.field_G, this.field_J);
            param0.e(14, -1 + this.field_I, this.field_G, this.field_J);
            param0.e(14, this.field_I, this.field_G, 1 + this.field_J);
            param0.e(param1 + 26675, this.field_I, this.field_G, -1 + this.field_J);
          }
          fl.a(param0, -111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("qq.G(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (nw.g(98)) {
          return;
        }
        bv var4 = vl.field_n;
        var4.h(32161, 16);
        var4.field_q = var4.field_q + 1;
        int var5 = var4.field_q;
        var4.b(param0 ^ 7, 0);
        var4.b(true, param1);
        var4.b(1, param2);
        var4.b(true, param3);
        if (param0 != 6) {
          qq.a(-60, -103, 22, 28, -21);
        }
        var4.e(-var5 + var4.field_q, 5930);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          qn.e(param1, param4, 1 + param0, 10000536);
          qn.e(param1, param4 + param2, param0 + 1, 12105912);
          var5_int = 1;
          if (qn.field_a > var5_int + param4) {
            var5_int = -param4 + qn.field_a;
          }
          var6 = param2;
          if (qn.field_f < var6 + param4) {
            var6 = qn.field_f - param4;
          }
          var7 = var5_int;
          var8 = 125 / ((param3 - 27) / 51);
          while (var7 < var6) {
            var9 = 152 + var7 * 48 / param2;
            var10 = var9 << 16 | var9 << 8 | var9;
            qn.field_d[(var7 + param4) * qn.field_l + param1] = var10;
            qn.field_d[qn.field_l * (param4 + var7) + (param1 + param0)] = var10;
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "qq.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, boolean param1) {
        int var3;
        int var4_int;
        String var4;
        int var5;
        String var4Lifetime1;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -2 / ((53 - param0) / 51);
        if (param1) {
          System.out.println("State change event debug");
          System.out.println("At " + this.field_I + "," + this.field_J);
          System.out.println("Player" + this.field_G);
          var4_int = this.field_F;
          if (var4_int != 0) {
            if (var4_int == 1) {
              System.out.println("Raise");
            } else {
              if (var4_int == 2) {
                System.out.println("Heal");
              } else {
                if (var4_int != 3) {
                  if (var4_int != 4) {
                    var4 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
                    return var4;
                  }
                  System.out.println("Bury");
                } else {
                  System.out.println("Pump");
                }
              }
            }
          } else {
            System.out.println("Capture");
          }
        }
        var4Lifetime1 = "EventStateChange: pos: (" + this.field_I + "," + this.field_J + "), type: " + this.field_F + ", player: " + this.field_G;
        return var4Lifetime1;
    }

    qq(int param0, int param1, int param2, int param3) {
        int var5;
        this.field_G = param3;
        this.field_F = param0;
        this.field_I = param1;
        this.field_J = param2;
        this.field_m = -1;
        var5 = this.field_F;
        if (var5 == 0) {
          this.field_m = 3;
        } else {
          if (1 == var5) {
            this.field_m = 16;
          } else {
            if (var5 == 2) {
              this.field_m = 12;
            } else {
              if (var5 == 3) {
                this.field_m = 14;
              } else {
                if (var5 == 4) {
                  this.field_m = 17;
                }
              }
            }
          }
        }
    }

    final static void a(kl param0, kl param1, kl param2, int param3, boolean param4) {
        se.field_g = cr.a("", 4210752);
        se.field_g.a(false, true);
        if (param3 != 0) {
          return;
        }
        try {
          kr.a(param2, false, param1, param0);
          da.b(-2);
          oh.field_L = nb.field_i;
          mh.field_b = nb.field_i;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "qq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_z = "Invalid date";
        field_y = "Skip";
        field_A = "Empty";
        field_H = "Most honourable";
        field_D = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
