/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends al {
    private int field_n;
    static vk field_m;

    final void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        oi stackIn_26_0;
        String stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_4 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        String var23;
        int var21Lifetime1;
        int var21Lifetime2;
        var22 = ZombieDawn.field_J;
        super.a((byte) -75);
        li.a(false);
        var2 = 3 + bj.field_q.field_x + bj.field_q.field_I;
        var3 = 600;
        var6 = vh.field_b + 200;
        stackIn_3_0 = (jp.field_a != 1) ? 0 : 1;
        var7 = stackIn_3_0;
        stackIn_6_0 = (jp.field_a != 3) ? 0 : 1;
        var8 = stackIn_6_0;
        if (param0 >= -35) {
          var23 = (String) null;
          fg.a((String) null, 98, (String) null, (String) null);
        }
        boolean decompiledFrameRemainder0 = true;
        var9 = id.field_M + 135;
        var10 = vh.field_b + 20;
        sg.field_jb.c(gj.field_k[this.field_n][0], var10, var9, 0, 0);
        var20 = this.field_n;
        if (var20 != 0) {
          if (var20 == 1) {
            var11 = 340;
            var2 -= 4;
            if (var7 != 0 ||
              var8 != 0) {
              var11 = 400;
            }
            var13 = 24;
            var12 = var9 + 20;
            le.field_a[1].b(-50 + var6, -8 + var12);
            if (var8 != 0) {
              var13 = 20;
            }
            var12 = var12 + (bj.field_q.a(gj.field_g[1][0], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2 + var13);
            var14 = var6 - 95;
            var15 = var12 - 20;
            var12 = var12 + (bj.field_q.a(gj.field_g[1][1], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2 + var13);
            lb.field_eb[3].b(var6 - 31, var12 + 3);
            le.field_a[3].b(-20 + var6, var12 + 15);
            var12 = var12 + (var13 + bj.field_q.a(gj.field_g[1][2], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2);
            le.field_a[5].b(-46 + var6, var12 + 2);
            var12 = var12 + (bj.field_q.a(gj.field_g[1][3], var6, var12, var11, 50, 16777215, 0, 0, 0, var2) * var2 + var13);
            le.field_a[6].b(var6 - 60, var12 - 7);
            var12 = var12 + (var13 + var2 * bj.field_q.a(gj.field_g[1][4], var6, var12, var11, 50, 16777215, 0, 0, 0, var2));
            le.field_a[0].b(var14, var15);
            nb.field_k[0].e(var14 - 8, -4 + var15, 128);
            nb.field_k[0].e(13 + var14, var15 + 14, 128);
            nb.field_k[0].e(var14 + 41, var15 + 11, 128);
            bi.c(var14 + 3, 14 + var15, 77, 47, 16777215);
            bi.b(var14 + 4, 15 + var15, 75, 45, 10066431, 32);
            bi.a(var14 + 5, var15 + 16, 73, 43, 3355647, 32);
          } else {
            if (var20 == 2) {
              var13 = 32;
              var12 = var9 + 40;
              var2 -= 4;
              lb.field_eb[8].b(var6 - 36, 4 + var12);
              le.field_a[3].b(-25 + var6, var12 + 15);
              var12 = var12 + (var13 + var2 * bj.field_q.a(gj.field_g[this.field_n][0], var6, var12, 340, 50, 16777215, 0, 0, 0, var2));
              le.field_a[4].b(-110 + var6, var12 - 10);
              nb.field_k[0].e(var6 - 54, var12 - 3, 128);
              le.field_a[3].b(-25 + var6, var12 + 30);
              var12 = var12 + (var13 + bj.field_q.a(gj.field_g[this.field_n][1], var6, var12, 340, 50, 16777215, 0, 0, 0, var2) * var2);
              le.field_a[7].b(-63 + var6, 10 + var12);
              var12 = var12 + (var13 + var2 * bj.field_q.a(gj.field_g[this.field_n][2], var6, var12, 340, 50, 16777215, 0, 0, 0, var2));
              le.field_a[9].b(var6 - 93, var12 + 10);
              var12 = var12 + (var13 + var2 * bj.field_q.a(gj.field_g[this.field_n][3], var6, var12, 340, 50, 16777215, 0, 0, 0, var2));
            } else {
              if (var20 != 3) {
                if (var20 == 4) {
                  var4 = bj.field_q.a(gj.field_g[this.field_n][0], var10, var9 + 20, var3, 440, 16777215, 0, 0, 0, var2);
                  var5 = var9 + (39 + var2 * var4);
                  for (var20 = 0; var20 < cc.field_h[this.field_n].length; var20++) {
                    var21 = cc.field_h[this.field_n][var20];
                    kb.field_i[var21].b(var10, var5 + 5);
                    var5 = var5 + (bj.field_q.a(gj.field_j[var21], vh.field_b + 60, var5, var3 - 40, 400, 16777215, 0, 0, 0, var2) * var2 + 15);
                  }
                } else {
                  if (var20 == 5) {
                    var5 = 19 + var9;
                    for (var20 = 0; var20 < cc.field_h[this.field_n].length; var20++) {
                      var21Lifetime1 = cc.field_h[this.field_n][var20];
                      kb.field_i[var21Lifetime1].b(var10, 5 + var5);
                      var5 = var5 + (var2 * bj.field_q.a(gj.field_j[var21Lifetime1], var10 + 40, var5, var3 - 40, 400, 16777215, 0, 0, 0, var2) + 15);
                    }
                  } else {
                    if (var20 == 6) {
                      var5 = 20 + var9;
                      for (var20 = 0; 4 > var20; var20++) {
                        qn.field_k[var20].b(var10 + 8, var5 - 8);
                        var5 = var5 + (var2 * bj.field_q.a(gj.field_p[var20], 80 + var10, var5, -80 + var3, 400, 16777215, 0, 0, 0, var2) + 20);
                      }
                    } else {
                      if (var20 == 7) {
                        var5 = var9 + 20;
                        for (var20 = 4; qn.field_k.length > var20; var20++) {
                          qn.field_k[var20].b(var10 + 8, -8 + var5);
                          var5 = var5 + (var2 * bj.field_q.a(gj.field_p[var20], var10 + 80, var5, var3 - 80, 400, 16777215, 0, 0, 0, var2) + 20);
                        }
                      } else {
                        if (var20 != 8 &&
                          var20 != 9) {
                          if (var20 == 10) {
                            var5 = var9 + 20;
                            for (var20 = 0; var20 < 4; var20++) {
                              j.field_e[var20].b(var10 + 8, -8 + var5);
                              var5 = var5 + (bj.field_q.a(gj.field_p[var20 + 8], 80 + var10, var5, -80 + var3, 400, 16777215, 0, 0, 0, var2) * var2 + 20);
                            }
                          } else {
                            if ((11 == var20)) {
                              var16 = 30 + var10;
                              var5 = 20 + var9;
                              var18 = 3;
                              var17 = var5;
                              var19 = 3;
                              bi.c(-var18 + var16, var17 - var19, cn.field_c[0].field_w + 2 * var18, var19 * 2 + cn.field_c[0].field_t, 0);
                              var18--;
                              var19--;
                              bi.c(-var18 + var16, -var19 + var17, 2 * var18 + cn.field_c[0].field_w, 2 * var19 + cn.field_c[0].field_t, 16777215);
                              var19--;
                              var18--;
                              bi.c(var16 - var18, -var19 + var17, var18 * 2 + cn.field_c[0].field_w, 2 * var19 + cn.field_c[0].field_t, 0);
                              cn.field_c[0].b(var16, var17);
                              var4 = bj.field_q.a(gj.field_g[this.field_n][0], 195 + vh.field_b, 5 + var5, -170 + var3, 440, 16777215, 0, 0, 0, var2);
                            }
                          }
                        } else {
                          var4 = bj.field_q.a(gj.field_g[this.field_n][0], var10, var9 + 20, var3, 440, 16777215, 0, 0, 0, var2);
                          var5 = 39 + var2 * var4 + var9;
                          for (var20 = 0; cc.field_h[this.field_n].length > var20; var20++) {
                            var21Lifetime2 = cc.field_h[this.field_n][var20];
                            kb.field_i[var21Lifetime2].b(var10, 5 + var5);
                            var5 = var5 + (15 + bj.field_q.a(gj.field_j[var21Lifetime2], var10 + 40, var5, var3 - 40, 400, 16777215, 0, 0, 0, var2) * var2);
                          }
                        }
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                si.field_Ub[0].b(vh.field_b + 8, id.field_M + 148);
                si.field_Ub[1].b(70 + vh.field_b, id.field_M + 230);
                sg.field_jb.c("1/5", 90 + vh.field_b, 202 + id.field_M, 2, -1);
                sg.field_jb.c("3", 80 + vh.field_b, 285 + id.field_M, 1, -1);
                sg.field_jb.c("2:15", vh.field_b + 75, id.field_M + 365, 0, -1);
                var4 = bj.field_q.a(gj.field_g[3][0], 155 + vh.field_b, 170 + id.field_M, var3 - 140, 440, 16777215, 0, 0, 0, var2);
              }
            }
          }
        } else {
          stackIn_26_0 = bj.field_q;
          stackIn_26_1 = gj.field_g[0][0];
          stackIn_26_2 = var10;
          stackIn_26_3 = var9 + 20;
          if (var7 == 0) {
            stackIn_27_4 = -70 + var3;
          } else {
            stackIn_27_4 = var3;
          }
          var4 = ((oi) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_27_4, 440, 16777215, 0, 0, 0, var2);
          var5 = var4 * var2;
          if (var7 != 0) {
            var5 -= 20;
          }
          sg.field_jb.c(gj.field_k[0][1], var10, var5 + (var9 + 75), 0, 0);
          bj.field_q.a(gj.field_g[0][1], var10, var5 + var9 + 95, var3, 440, 16777215, 0, 0, 0, var2);
          if (var7 == 0) {
            l.field_b[0].b(530 + vh.field_b, 150 + id.field_M);
            l.field_b[1].b(vh.field_b + 230, id.field_M + 242);
          }
        }
        bj.field_q.b(uk.a(1 + this.field_n, (byte) 58, 1 + this.a(true)), 634 + vh.field_b, id.field_M + 410, 16777215, 0);
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          field_m = (vk) null;
        }
        return this.c(param1, 6) + 180;
    }

    final void d(byte param0) {
        int var2 = -82 / ((param0 - 32) / 56);
        this.field_n = 0;
    }

    final static vn d(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var1;
        Object var3;
        int[] var5_ref_int__;
        int var7;
        int[] var9;
        int[] var11;
        int[] var13;
        byte[] var16;
        byte[] var17;
        var7 = ZombieDawn.field_J;
        if (param0 > -98) {
          return (vn) null;
        }
        var1 = uf.field_n[0] * bn.field_c[0];
        var17 = vj.field_m[0];
        if (!jc.field_r[0]) {
          var9 = new int[var1];
          for (var5 = 0; var1 > var5; var5++) {
            var9[var5] = j.field_a[eg.a((int) var17[var5], 255)];
          }
          var3 = new vn(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], var9);
        } else {
          var16 = ka.field_f[0];
          var13 = new int[var1];
          var11 = var13;
          var5_ref_int__ = var11;
          for (var6 = 0; var1 > var6; var6++) {
            var5_ref_int__[var6] = hi.a(eg.a((int) var16[var6], 255) << 24, j.field_a[eg.a(255, (int) var17[var6])]);
          }
          var3 = new cd(gl.field_F, kd.field_pb, sl.field_d[0], bo.field_o[0], bn.field_c[0], uf.field_n[0], var13);
        }
        no.f((byte) -73);
        return (vn) (var3);
    }

    final void a(int param0) {
        int var2;
        int var3;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -31645) {
          return;
        }
        stackIn_5_0 = (this.field_n != 0) ? 0 : 1;
        var2 = stackIn_5_0;
        stackIn_8_0 = (this.field_n != this.a(true)) ? 0 : 1;
        var3 = stackIn_8_0;
        if ((var2 != 0 ||
          var3 != 0) && (kg.field_i == 96 ||
          kg.field_i == 97)) {
          this.field_b.a(1, -1);
          if (var2 != 0 &&
            this.field_b.field_d == 0) {
            this.field_b.a(1, -1);
            return;
          }
          if (var3 != 0 &&
            this.field_b.field_d == 2) {
            this.field_b.a(1, -1);
          }
          return;
        }
        this.field_b.a(1, -1);
    }

    fg(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_n = 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = ZombieDawn.field_J;
        try {
          while (true) {
            param3--;
            if (param3 < 0) {
              if (param5 != 61653921) {
                var17 = (int[]) null;
                fg.a(107, -48, -75, 124, 49, 11, -113, -78, 117, (int[]) null);
              }
              return;
            }
            var18 = param9;
            var10 = var18;
            var11 = param6;
            var12 = param0;
            var13 = param8;
            var14 = param4;
            var15 = (16711422 & var18[var11]) >> 1;
            var10[var11] = var15 + (eg.a(33518850, var14) >> 17) + (eg.a(var13 >> 9, 65280) + eg.a(16711680, var12 >> 1));
            param6++;
            param8 = param8 + param7;
            param4 = param4 + param1;
            param0 = param0 + param2;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("fg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_m = null;
        if (param0 != -25585) {
          field_m = (vk) null;
        }
    }

    final boolean b(int param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param1 != -1) {
          return false;
        }
        stackIn_10_0 = ((param0 != 0 ||
          this.field_n != 0) &&
          (2 != param0 ||
          this.field_n != this.a(true)));
        return stackIn_10_0;
    }

    final static jc a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ZombieDawn.field_J;
        jc var5 = (jc) (on.field_g.b((byte) 26));
        while (var5 != null) {
          if (param3 == var5.field_s) {
            return var5;
          }
          var5 = (jc) (on.field_g.a(false));
        }
        jc var7 = new jc();
        var5 = var7;
        var7.field_s = param3;
        var7.field_o = param4;
        var7.field_u = param1;
        if (param2 != 1) {
          return (jc) null;
        }
        on.field_g.a(0, var5);
        pm.a(0, param0, var5);
        return var5;
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        this.field_n = this.field_n - 1;
        if (param0 != 20921) {
          return;
        }
        if (!param1 &&
          this.field_n == 0) {
          var3 = kg.field_i;
          kg.field_i = 97;
          this.field_b.a(1, -1);
          kg.field_i = var3;
        }
    }

    private final int a(boolean param0) {
        if (!param0) {
          this.field_n = 42;
        }
        return be.field_j <= 0 ? 7 : gj.field_g.length - 1;
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        if (param1 <= 119) {
          int[] var4 = (int[]) null;
          fg.a(6, 53, 47, 73, 20, 34, -122, -33, -19, (int[]) null);
        }
        this.field_n = this.field_n + 1;
        if (!param0 &&
          this.field_n == this.a(true)) {
          var3 = kg.field_i;
          kg.field_i = 96;
          this.field_b.a(1, -1);
          kg.field_i = var3;
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var5 = ZombieDawn.field_J;
        int var4 = param3.indexOf(param0);
        if (param1 >= -126) {
          field_m = (vk) null;
        }
        while (var4 != -1) {
          param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param0.length());
          var4 = param3.indexOf(param0, param2.length() + var4);
        }
        return param3;
    }

    static {
        field_m = new vk();
    }
}
