/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    int field_a;
    private int[][] field_s;
    private int[] field_f;
    private int[][] field_r;
    static boolean[][] field_k;
    private int[][] field_u;
    private int[][] field_t;
    int field_l;
    private int[][][] field_o;
    static int[] field_j;
    static int field_g;
    int field_i;
    static String field_m;
    static String[] field_d;
    private int[][][] field_e;
    private int[][] field_c;
    static boolean field_q;
    static ka[][] field_b;
    private int[][] field_h;
    static int[][] field_p;
    private int[][] field_n;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var11 = 0;
        int var9;
        int var10;
        int var12;
        var12 = TorChallenge.field_F ? 1 : 0;
        if (param7 != -10440) {
          return;
        }
        for (var11 = 0; 1 >= var11; var11++) {
          if (0 == var11) {
            var10 = gl.field_l[param0][param2][0][1];
            var9 = gl.field_l[param0][param2][0][0];
          } else {
            if (0 == param2 &&
              var11 == 1) {
              var10 = gl.field_l[param0][param2][1][1];
              var9 = gl.field_l[param0][param2][0][1];
            } else {
              var9 = gl.field_l[param0][param2][1][0];
              var10 = gl.field_l[param0][param2][0][0];
            }
          }
          qg.a(ae.field_y);
          qg.a(var9, param1, var10, param4);
          if ((1 & ic.field_E[vb.field_a[param0][param2]][param5]) > 0) {
            sf.field_d[param6][param2][var11].a(var9, param1);
          }
          if ((2 & ic.field_E[vb.field_a[param0][param2]][param5]) > 0) {
            sf.field_d[param6][param2][var11].a(var9, param1 + 16);
          }
          if ((ic.field_E[vb.field_a[param0][param2]][param5] & 4) > 0) {
            sf.field_d[param6][param2][var11].a(var9, 32 + param1);
          }
          if ((8 & ic.field_E[vb.field_a[param0][param2]][param5]) > 0) {
            sf.field_d[param6][param2][var11].a(var9, 48 + param1);
          }
          qg.b(ae.field_y);
        }
        return;
    }

    final static int a(int param0) {
        if (li.field_K < 2) {
          return 0;
        }
        if (param0 != 1) {
          return -37;
        }
        if (kf.field_b == 0) {
          if (!sl.field_a.b(param0 - 7958)) {
            return 20;
          }
          if (!sl.field_a.b(param0 + 4, "commonui")) {
            return 40;
          }
          if (!gf.field_p.b(-7957)) {
            return 50;
          }
          if (!gf.field_p.b(param0 ^ 4, "commonui")) {
            return 60;
          }
          if (!jl.field_b.b(-7957)) {
            return 70;
          }
          if (!jl.field_b.b((byte) 79)) {
            return 80;
          }
        } else {
          if (null != rj.field_f) {
            if (!rj.field_f.b(-7957)) {
              return 14;
            }
            if (!rj.field_f.a((byte) -39, "")) {
              return 29;
            }
            if (!rj.field_f.b(param0 + 4, "")) {
              return 29;
            }
          }
          if (!sl.field_a.b(-7957)) {
            return 43;
          }
          if (!sl.field_a.b(param0 ^ 4, "commonui")) {
            return 57;
          }
          if (!gf.field_p.b(param0 - 7958)) {
            return 71;
          }
          if (!gf.field_p.b(5, "commonui")) {
            return 80;
          }
          if (!jl.field_b.b(-7957)) {
            return 82;
          }
          if (!jl.field_b.b((byte) 79)) {
            return 86;
          }
        }
        return 100;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int var12 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        var13 = TorChallenge.field_F ? 1 : 0;
        var6 = param1 / 32;
        if (param0 != 2) {
          this.field_u = (int[][]) null;
        }
        var7 = param4 / 16;
        for (var8 = var6; var8 * 32 < param1 + param3; var8++) {
        }
        for (var9 = var7; param4 + param2 > 16 * var9; var9++) {
        }
        if (var7 >> 2 < 0) {
          return true;
        }
        if (this.field_a <= var9 >> 2) {
          return true;
        }
        for (var11 = var6; var8 > var11; var11++) {
          var10 = var11;
          if (var10 < 0) {
            var10 += 64;
          }
          if (64 <= var10) {
            var10 -= 64;
          }
          for (var12 = var7; var12 < var9; var12++) {
            if (0 == (var12 & 3) &&
              (ic.field_E[var10][var12 >> 2] & 1) > 0) {
              return true;
            }
            if ((3 & var12) == 1 &&
              (2 & ic.field_E[var10][var12 >> 2]) > 0) {
              return true;
            }
            if (2 == (3 & var12) &&
              (4 & ic.field_E[var10][var12 >> 2]) > 0) {
              return true;
            }
            if ((3 & var12) == 3 &&
              (8 & ic.field_E[var10][var12 >> 2]) > 0) {
              return true;
            }
          }
        }
        return false;
    }

    final void a(boolean param0, int param1, boolean param2, ka param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_25_0;
        int stackIn_25_1;
        int stackIn_25_2;
        int stackIn_25_3;
        int stackIn_26_4 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_71_2 = 0;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        ka var26 = null;
        int stackIn_68_0Lifetime1;
        int stackIn_70_1Lifetime1;
        int stackIn_71_2Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int stackIn_68_0Lifetime2;
        int stackIn_70_1Lifetime2;
        int stackIn_71_2Lifetime2;
        int var20Lifetime2;
        int var22Lifetime2;
        int var22Lifetime1Lifetime1;
        var23 = TorChallenge.field_F ? 1 : 0;
        try {
          var10_int = param6 / 64;
          var11 = var10_int + 10;
          var12 = 64 * var10_int - param6;
          var13 = param5 % 32;
          var16 = null;
          var17 = null;
          je.field_i = false;
          qg.a(vd.field_e);
          if (var10_int < 0) {
            var11 = var11 - var10_int;
            var10_int = 0;
          }
          if (var11 > this.field_a) {
            var10_int = var10_int - (-this.field_a + var11);
            var11 = this.field_a;
          }
          this.field_n[1][0] = var10_int;
          this.field_n[1][1] = var11;
          if (param4 == 3 &&
            param2) {
            if (ub.field_i) {
              qg.a(0, 0, 640, 480 - td.field_n);
            }
            qg.c(0, 0, 25, this.field_a * 64, 14022908, 10533565);
            qg.c(615, 0, 25, 64 * this.field_a, 14022908, 10533565);
            og.a(param5, param6, -15516);
            if (ub.field_i) {
              qg.b(vd.field_e);
            }
          }
          for (var18 = -24; 0 >= var18; var18++) {
            if (var18 < -16) {
              qg.b(vd.field_e);
              qg.a(0, 0, 25, 480);
            } else {
              if (var18 == -16) {
                qg.b(vd.field_e);
              }
            }
            L11: {
              boolean decompiledFrameCompleted0 = true;
              var19 = 8 + (16 + var18);
              var12Lifetime1 = -param6 + 64 * var10_int;
              if (3 == param4) {
                for (var20 = 0; var20 <= 1; var20++) {
                  stackIn_25_0 = var13;
                  stackIn_25_1 = param5;
                  stackIn_25_2 = var20;
                  stackIn_25_3 = var19;
                  if (var20 == 0) {
                    stackIn_26_4 = var18;
                  } else {
                    stackIn_26_4 = -var18;
                  }
                  p.a(stackIn_25_0, stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_26_4, param6, -100, var10_int);
                  if (var19 == 0) {
                    this.field_n[0][var20] = vb.field_a[var19][var20];
                  }
                  var14 = -gl.field_l[var19][var20][1][0] + gl.field_l[var19][var20][1][1];
                  if (var14 > 0) {
                    cf.a(32, this.field_f, this.field_h[vb.field_a[var19][var20]], var14, false);
                    this.field_t[var20][0] = gl.field_l[var19][var20][1][0];
                    this.field_t[var20][1] = gl.field_l[var19][var20][1][1];
                    this.field_s[var20][0] = gl.field_l[var19][var20][2][0];
                    this.field_s[var20][1] = gl.field_l[var19][var20][2][1];
                    this.field_o[var20][0][0] = gl.field_l[var19][var20][0][0];
                    this.field_o[var20][0][1] = gl.field_l[var19][var20][0][1];
                    var15 = 1 & vb.field_a[var19][var20];
                    sh.a(var15, -100, this.field_f, var20, this.field_s, this.field_t, var18);
                    if (param3 != null) {
                      param3.d();
                    }
                  }
                }
              } else if (param4 == 6) {
                for (var20 = 0; var20 <= 1; var20++) {
                  this.field_o[var20][0][0] = gl.field_l[var19][var20][0][0];
                  this.field_o[var20][0][1] = gl.field_l[var19][var20][0][1];
                  if (var20 != 0) {
                    this.field_o[var20][1][0] = gl.field_l[var19][var20][1][0];
                    this.field_o[var20][1][1] = gl.field_l[var19][var20][0][0];
                  } else {
                    this.field_o[var20][1][0] = gl.field_l[var19][var20][0][1];
                    this.field_o[var20][1][1] = gl.field_l[var19][var20][1][1];
                  }
                  var15 = vb.field_a[var19][var20] & 1;
                  si.a(var18, this.field_e[vb.field_a[var19][var20]], var20, this.field_o, var15, 1);
                  if (param3 != null) {
                    param3.d();
                  }
                }
              } else {
                var20 = var10_int;
                if (var11 <= var20) {
                  break L11;
                }
                var21 = 0;
                if (var21 > 1) {
                  while (true) {
                    var12Lifetime1 += 64;
                    var20++;
                    if (var11 <= var20) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    for (var21 = 0; var21 <= 1; var21++) {
                      if (var18 == 0 &&
                        var21 == 1) {
                        if (param4 == 3 &&
                          param2) {
                          tk.b(var21, var12Lifetime1, var20, var19, param1 + 46);
                          hi.b(var21, 5446, var12Lifetime1, var19, var20);
                        }
                      } else {
                        if (-16 > var18) {
                          qg.b(vd.field_e);
                          stackIn_68_0 = (var21 == 0) ? 0 : 615;
                          stackIn_70_1 = 0;
                          if (0 == var21) {
                            stackIn_71_2 = 25;
                          } else {
                            stackIn_71_2 = 640;
                          }
                          qg.a(stackIn_68_0, stackIn_70_1, stackIn_71_2, 480);
                        } else {
                          if (var18 == -16) {
                            qg.b(vd.field_e);
                          }
                        }
                        var14 = gl.field_l[var19][var21][1][1] - gl.field_l[var19][var21][1][0];
                        if (param4 == 3 &&
                          var14 > 0) {
                          if ((64 & ic.field_E[vb.field_a[var19][var21]][var20]) <= 0) {
                            var22 = this.field_u[vb.field_a[var19][var21] >> 1][var20];
                            b.a((byte) 114, var22, var21, var18, 64 + var12Lifetime1, var19, var12Lifetime1);
                          } else {
                            var15 = vb.field_a[var19][var21] & 1;
                            TorChallenge.a(var18, var12Lifetime1, var20, false, var12Lifetime1 + 64, var19, var21, var15);
                          }
                        }
                        if (param4 == 3 &&
                          param2) {
                          tk.b(var21, var12Lifetime1, var20, var19, param1 + 46);
                          hi.b(var21, param1 ^ 5460, var12Lifetime1, var19, var20);
                        }
                        if (6 == param4 &&
                          param0) {
                          qg.a(ae.field_y);
                          var17 = hi.a(param6, vb.field_a[var19][var21], param5, 0, 101, var20);
                          qg.b(ae.field_y);
                          var16 = hi.a(param6, vb.field_a[var19][var21], param5, 1, 115, var20);
                          qg.b(ae.field_y);
                        }
                        if (param4 == 6 &&
                          0 == (16 & ic.field_E[vb.field_a[var19][var21]][var20])) {
                          qg.a(ae.field_y);
                          var22 = this.field_r[vb.field_a[var19][var21]][var20];
                          this.a(var19, var12Lifetime1, var21, var18, var12Lifetime1 + 64, var20, var22, -10440);
                          qg.b(ae.field_y);
                        }
                        if (param4 == 2 &&
                          param0) {
                          qg.a(ae.field_y);
                          var16 = hi.a(param6, vb.field_a[var19][var21], param5, 2, 113, var20);
                          qg.b(ae.field_y);
                        }
                        if (6 == param4) {
                          if (gl.field_l[var19][var21][0][0] <= param7 &&
                            var12Lifetime1 <= param8 &&
                            param8 < var12Lifetime1 + 64 &&
                            gl.field_l[var19][var21][0][1] > param7) {
                            this.field_l = vb.field_a[var19][var21];
                            this.field_i = var20;
                          }
                          if (vb.field_a[var19][var21] == this.field_l &&
                            this.field_i == var20 &&
                            ol.field_a) {
                            qg.a(ae.field_y);
                            qg.b(vd.field_e);
                            qg.b(gl.field_l[var19][var21][0][0], var12Lifetime1, -gl.field_l[var19][var21][0][0] + gl.field_l[var19][var21][0][1], 64, 16777215);
                            qg.a(ae.field_y[0], ae.field_y[1], ae.field_y[2], ae.field_y[3]);
                            if (var16 != null &&
                              md.field_j == null) {
                              md.field_j = (qe) (var16);
                            } else {
                              if (var17 != null &&
                                null == md.field_j) {
                                md.field_j = (qe) (var17);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  if (var18 == 0 &&
                    var21 == 1) {
                    while (true) {
                      if (param4 == 3 &&
                        param2) {
                        tk.b(var21, var12Lifetime1, var20, var19, param1 + 46);
                        hi.b(var21, 5446, var12Lifetime1, var19, var20);
                      }
                      while (true) {
                        var21++;
                        while (var21 > 1) {
                          var12Lifetime1 += 64;
                          var20++;
                          if (var11 <= var20) {
                            break L11;
                          }
                          var21 = 0;
                        }
                        if (var18 == 0 &&
                          var21 == 1) {
                          break;
                        }
                        if (-16 > var18) {
                          qg.b(vd.field_e);
                          stackIn_68_0Lifetime2 = (var21 == 0) ? 0 : 615;
                          stackIn_70_1Lifetime2 = 0;
                          if (0 == var21) {
                            stackIn_71_2Lifetime2 = 25;
                          } else {
                            stackIn_71_2Lifetime2 = 640;
                          }
                          qg.a(stackIn_68_0Lifetime2, stackIn_70_1Lifetime2, stackIn_71_2Lifetime2, 480);
                        } else {
                          if (var18 == -16) {
                            qg.b(vd.field_e);
                          }
                        }
                        var14 = gl.field_l[var19][var21][1][1] - gl.field_l[var19][var21][1][0];
                        if (param4 == 3 &&
                          var14 > 0) {
                          if ((64 & ic.field_E[vb.field_a[var19][var21]][var20]) <= 0) {
                            var22Lifetime2 = this.field_u[vb.field_a[var19][var21] >> 1][var20];
                            b.a((byte) 114, var22Lifetime2, var21, var18, 64 + var12Lifetime1, var19, var12Lifetime1);
                          } else {
                            var15 = vb.field_a[var19][var21] & 1;
                            TorChallenge.a(var18, var12Lifetime1, var20, false, var12Lifetime1 + 64, var19, var21, var15);
                          }
                        }
                        if (param4 == 3 &&
                          param2) {
                          tk.b(var21, var12Lifetime1, var20, var19, param1 + 46);
                          hi.b(var21, param1 ^ 5460, var12Lifetime1, var19, var20);
                        }
                        if (6 == param4 &&
                          param0) {
                          qg.a(ae.field_y);
                          var17 = hi.a(param6, vb.field_a[var19][var21], param5, 0, 101, var20);
                          qg.b(ae.field_y);
                          var16 = hi.a(param6, vb.field_a[var19][var21], param5, 1, 115, var20);
                          qg.b(ae.field_y);
                        }
                        if (param4 == 6 &&
                          0 == (16 & ic.field_E[vb.field_a[var19][var21]][var20])) {
                          qg.a(ae.field_y);
                          var22Lifetime2 = this.field_r[vb.field_a[var19][var21]][var20];
                          this.a(var19, var12Lifetime1, var21, var18, var12Lifetime1 + 64, var20, var22Lifetime2, -10440);
                          qg.b(ae.field_y);
                        }
                        if (param4 == 2 &&
                          param0) {
                          qg.a(ae.field_y);
                          var16 = hi.a(param6, vb.field_a[var19][var21], param5, 2, 113, var20);
                          qg.b(ae.field_y);
                        }
                        if (6 != param4) {
                          continue;
                        }
                        if (gl.field_l[var19][var21][0][0] <= param7 &&
                          var12Lifetime1 <= param8 &&
                          param8 < var12Lifetime1 + 64 &&
                          gl.field_l[var19][var21][0][1] > param7) {
                          this.field_l = vb.field_a[var19][var21];
                          this.field_i = var20;
                        }
                        if (vb.field_a[var19][var21] != this.field_l) {
                          continue;
                        }
                        if (this.field_i != var20) {
                          continue;
                        }
                        if (!ol.field_a) {
                          continue;
                        }
                        qg.a(ae.field_y);
                        qg.b(vd.field_e);
                        qg.b(gl.field_l[var19][var21][0][0], var12Lifetime1, -gl.field_l[var19][var21][0][0] + gl.field_l[var19][var21][0][1], 64, 16777215);
                        qg.a(ae.field_y[0], ae.field_y[1], ae.field_y[2], ae.field_y[3]);
                        if (var16 != null &&
                          md.field_j == null) {
                          md.field_j = (qe) (var16);
                          continue;
                        }
                        if (var17 == null) {
                          continue;
                        }
                        if (null != md.field_j) {
                          continue;
                        }
                        md.field_j = (qe) (var17);
                      }
                    }
                  }
                  while (true) {
                    if (-16 > var18) {
                      qg.b(vd.field_e);
                      stackIn_68_0Lifetime2 = (var21 == 0) ? 0 : 615;
                      stackIn_70_1Lifetime2 = 0;
                      if (0 == var21) {
                        stackIn_71_2Lifetime2 = 25;
                      } else {
                        stackIn_71_2Lifetime2 = 640;
                      }
                      qg.a(stackIn_68_0Lifetime2, stackIn_70_1Lifetime2, stackIn_71_2Lifetime2, 480);
                    } else {
                      if (var18 == -16) {
                        qg.b(vd.field_e);
                      }
                    }
                    var14 = gl.field_l[var19][var21][1][1] - gl.field_l[var19][var21][1][0];
                    if (param4 == 3 &&
                      var14 > 0) {
                      if ((64 & ic.field_E[vb.field_a[var19][var21]][var20]) <= 0) {
                        var22Lifetime2 = this.field_u[vb.field_a[var19][var21] >> 1][var20];
                        b.a((byte) 114, var22Lifetime2, var21, var18, 64 + var12Lifetime1, var19, var12Lifetime1);
                      } else {
                        var15 = vb.field_a[var19][var21] & 1;
                        TorChallenge.a(var18, var12Lifetime1, var20, false, var12Lifetime1 + 64, var19, var21, var15);
                      }
                    }
                    if (param4 == 3 &&
                      param2) {
                      tk.b(var21, var12Lifetime1, var20, var19, param1 + 46);
                      hi.b(var21, param1 ^ 5460, var12Lifetime1, var19, var20);
                    }
                    if (6 == param4 &&
                      param0) {
                      qg.a(ae.field_y);
                      var17 = hi.a(param6, vb.field_a[var19][var21], param5, 0, 101, var20);
                      qg.b(ae.field_y);
                      var16 = hi.a(param6, vb.field_a[var19][var21], param5, 1, 115, var20);
                      qg.b(ae.field_y);
                    }
                    if (param4 == 6 &&
                      0 == (16 & ic.field_E[vb.field_a[var19][var21]][var20])) {
                      qg.a(ae.field_y);
                      var22Lifetime2 = this.field_r[vb.field_a[var19][var21]][var20];
                      this.a(var19, var12Lifetime1, var21, var18, var12Lifetime1 + 64, var20, var22Lifetime2, -10440);
                      qg.b(ae.field_y);
                    }
                    if (param4 == 2 &&
                      param0) {
                      qg.a(ae.field_y);
                      var16 = hi.a(param6, vb.field_a[var19][var21], param5, 2, 113, var20);
                      qg.b(ae.field_y);
                    }
                    if (6 == param4) {
                      if (gl.field_l[var19][var21][0][0] <= param7 &&
                        var12Lifetime1 <= param8 &&
                        param8 < var12Lifetime1 + 64 &&
                        gl.field_l[var19][var21][0][1] > param7) {
                        this.field_l = vb.field_a[var19][var21];
                        this.field_i = var20;
                      }
                      if (vb.field_a[var19][var21] == this.field_l &&
                        this.field_i == var20 &&
                        ol.field_a) {
                        qg.a(ae.field_y);
                        qg.b(vd.field_e);
                        qg.b(gl.field_l[var19][var21][0][0], var12Lifetime1, -gl.field_l[var19][var21][0][0] + gl.field_l[var19][var21][0][1], 64, 16777215);
                        qg.a(ae.field_y[0], ae.field_y[1], ae.field_y[2], ae.field_y[3]);
                        if (var16 != null &&
                          md.field_j == null) {
                          md.field_j = (qe) (var16);
                        } else {
                          if (var17 != null &&
                            null == md.field_j) {
                            md.field_j = (qe) (var17);
                          }
                        }
                      }
                    }
                    while (true) {
                      var21++;
                      while (var21 > 1) {
                        var12Lifetime1 += 64;
                        var20++;
                        if (var11 <= var20) {
                          break L11;
                        }
                        var21 = 0;
                      }
                      if (var18 != 0) {
                        break;
                      }
                      if (var21 != 1) {
                        break;
                      }
                      if (param4 != 3) {
                        continue;
                      }
                      if (!param2) {
                        continue;
                      }
                      tk.b(var21, var12Lifetime1, var20, var19, param1 + 46);
                      hi.b(var21, 5446, var12Lifetime1, var19, var20);
                    }
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                for (var20Lifetime2 = var10_int; var11 > var20Lifetime2; var20Lifetime2++) {
                  for (var21Lifetime1 = 0; var21Lifetime1 <= 1; var21Lifetime1++) {
                    if (var18 == 0 &&
                      var21Lifetime1 == 1) {
                      if (param4 == 3 &&
                        param2) {
                        tk.b(var21Lifetime1, var12Lifetime1, var20Lifetime2, var19, param1 + 46);
                        hi.b(var21Lifetime1, 5446, var12Lifetime1, var19, var20Lifetime2);
                      }
                    } else {
                      if (-16 > var18) {
                        qg.b(vd.field_e);
                        stackIn_68_0Lifetime1 = (var21Lifetime1 == 0) ? 0 : 615;
                        stackIn_70_1Lifetime1 = 0;
                        if (0 == var21Lifetime1) {
                          stackIn_71_2Lifetime1 = 25;
                        } else {
                          stackIn_71_2Lifetime1 = 640;
                        }
                        qg.a(stackIn_68_0Lifetime1, stackIn_70_1Lifetime1, stackIn_71_2Lifetime1, 480);
                      } else {
                        if (var18 == -16) {
                          qg.b(vd.field_e);
                        }
                      }
                      var14Lifetime1 = gl.field_l[var19][var21Lifetime1][1][1] - gl.field_l[var19][var21Lifetime1][1][0];
                      if (param4 == 3 &&
                        var14Lifetime1 > 0) {
                        if ((64 & ic.field_E[vb.field_a[var19][var21Lifetime1]][var20Lifetime2]) <= 0) {
                          var22Lifetime1 = this.field_u[vb.field_a[var19][var21Lifetime1] >> 1][var20Lifetime2];
                          b.a((byte) 114, var22Lifetime1, var21Lifetime1, var18, 64 + var12Lifetime1, var19, var12Lifetime1);
                        } else {
                          var15Lifetime1 = vb.field_a[var19][var21Lifetime1] & 1;
                          TorChallenge.a(var18, var12Lifetime1, var20Lifetime2, false, var12Lifetime1 + 64, var19, var21Lifetime1, var15Lifetime1);
                        }
                      }
                      if (param4 == 3 &&
                        param2) {
                        tk.b(var21Lifetime1, var12Lifetime1, var20Lifetime2, var19, param1 + 46);
                        hi.b(var21Lifetime1, param1 ^ 5460, var12Lifetime1, var19, var20Lifetime2);
                      }
                      if (6 == param4 &&
                        param0) {
                        qg.a(ae.field_y);
                        var17 = hi.a(param6, vb.field_a[var19][var21Lifetime1], param5, 0, 101, var20Lifetime2);
                        qg.b(ae.field_y);
                        var16 = hi.a(param6, vb.field_a[var19][var21Lifetime1], param5, 1, 115, var20Lifetime2);
                        qg.b(ae.field_y);
                      }
                      if (param4 == 6 &&
                        0 == (16 & ic.field_E[vb.field_a[var19][var21Lifetime1]][var20Lifetime2])) {
                        qg.a(ae.field_y);
                        var22Lifetime1Lifetime1 = this.field_r[vb.field_a[var19][var21Lifetime1]][var20Lifetime2];
                        this.a(var19, var12Lifetime1, var21Lifetime1, var18, var12Lifetime1 + 64, var20Lifetime2, var22Lifetime1Lifetime1, -10440);
                        qg.b(ae.field_y);
                      }
                      if (param4 == 2 &&
                        param0) {
                        qg.a(ae.field_y);
                        var16 = hi.a(param6, vb.field_a[var19][var21Lifetime1], param5, 2, 113, var20Lifetime2);
                        qg.b(ae.field_y);
                      }
                      if (6 == param4) {
                        if (gl.field_l[var19][var21Lifetime1][0][0] <= param7 &&
                          var12Lifetime1 <= param8 &&
                          param8 < var12Lifetime1 + 64 &&
                          gl.field_l[var19][var21Lifetime1][0][1] > param7) {
                          this.field_l = vb.field_a[var19][var21Lifetime1];
                          this.field_i = var20Lifetime2;
                        }
                        if (vb.field_a[var19][var21Lifetime1] == this.field_l &&
                          this.field_i == var20Lifetime2 &&
                          ol.field_a) {
                          qg.a(ae.field_y);
                          qg.b(vd.field_e);
                          qg.b(gl.field_l[var19][var21Lifetime1][0][0], var12Lifetime1, -gl.field_l[var19][var21Lifetime1][0][0] + gl.field_l[var19][var21Lifetime1][0][1], 64, 16777215);
                          qg.a(ae.field_y[0], ae.field_y[1], ae.field_y[2], ae.field_y[3]);
                          if (var16 != null &&
                            md.field_j == null) {
                            md.field_j = (qe) (var16);
                          } else {
                            if (var17 != null &&
                              null == md.field_j) {
                              md.field_j = (qe) (var17);
                            }
                          }
                        }
                      }
                    }
                  }
                  var12Lifetime1 += 64;
                }
              }
            }
          }
          if (param1 != 18) {
            var26 = (ka) null;
            this.a(false, 6, false, (ka) null, 26, -8, -26, -57, 72);
          }
          if (param4 == 3) {
            nb.a((byte) 42, this.field_n);
          }
          if (param4 == 6 &&
            ub.field_i) {
            var18Lifetime1 = td.field_n >> 4;
            if (0 < td.field_n - (var18Lifetime1 << 4)) {
              var18Lifetime1++;
            }
            var19Lifetime1 = 480 + (-td.field_n - 16);
            jf.field_qb.field_q = qg.field_g;
            jf.field_qb.field_u = jf.field_qb.field_q;
            jf.field_qb.field_v = qg.field_f;
            jf.field_qb.field_x = jf.field_qb.field_v;
            mb.field_c.field_q = qg.field_g;
            jf.field_qb.field_y = qg.field_i;
            mb.field_c.field_v = qg.field_f;
            mb.field_c.field_u = mb.field_c.field_q;
            mb.field_c.field_y = qg.field_i;
            mb.field_c.field_x = mb.field_c.field_v;
            qg.f(0, var19Lifetime1 + 16, 640, 480 - (16 + var19Lifetime1), 1);
            for (var20Lifetime1 = 0; var18Lifetime1 > var20Lifetime1; var20Lifetime1++) {
              ka.a(jf.field_qb, mb.field_c, 0, var19Lifetime1, 0, var19Lifetime1 + 16, 640, 16);
              var19Lifetime1 += 16;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_131_0 = var10;
          stackIn_131_1 = new StringBuilder().append("ra.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_132_2 = "null";
          } else {
            stackIn_132_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_131_0), ((StringBuilder) (Object) stackIn_131_1).append(stackIn_132_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = (boolean[][]) null;
        field_b = (ka[][]) null;
        field_j = null;
        field_d = null;
        field_p = (int[][]) null;
        field_m = null;
        int var1 = 48 % ((param0 - 91) / 34);
    }

    final void b(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
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
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime1Lifetime1;
        var14 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        var9 = ea.field_e;
        if (gh.field_x) {
          var9 = -1 + (-6 + (var9 + 1) << 1);
        }
        var13 = 0;
        if (param0 < 57) {
          this.field_e = (int[][][]) null;
        }
        while (64 > var13) {
          var3 = 32 * var13;
          var4 = (-var3 + var2) % 2048;
          stackIn_8_0 = (var4 > 0) ? 1 : -1;
          var6 = stackIn_8_0;
          var4 = var4 * var6;
          var8 = fj.field_m[var4];
          if (var4 >= 511 &&
            var4 < 1536) {
            stackIn_13_0 = 1;
          } else {
            stackIn_13_0 = -1;
          }
          var6Lifetime1 = stackIn_13_0;
          this.field_e[var13][0][0] = var6Lifetime1 * (fj.a(1870096848, var8, ng.field_H[var9] << 16) >> 16) + ng.field_K[var9];
          var5 = (-512 + (-16 + (-var3 + var2))) % 2048;
          this.field_e[var13][0][1] = this.field_e[var13][0][0];
          stackIn_16_0 = (var5 > 0) ? 1 : -1;
          var7 = stackIn_16_0;
          var5 = var7 * var5;
          var8Lifetime1 = fj.field_m[var5];
          if (var5 >= 511 &&
            1536 > var5) {
            stackIn_20_0 = 1;
          } else {
            stackIn_20_0 = -1;
          }
          var7Lifetime1 = stackIn_20_0;
          var5Lifetime1 = (496 + (var2 - var3)) % 2048;
          this.field_e[var13][1][0] = var7Lifetime1 * (fj.a(1870096848, var8Lifetime1, ng.field_H[var9] << 16) >> 16) + ng.field_K[var9];
          stackIn_23_0 = (var5Lifetime1 > 0) ? 1 : -1;
          var7Lifetime2 = stackIn_23_0;
          var5Lifetime1 = var7Lifetime2 * var5Lifetime1;
          if (var5Lifetime1 >= 511 &&
            1536 > var5Lifetime1) {
            stackIn_27_0 = 1;
          } else {
            stackIn_27_0 = -1;
          }
          var7Lifetime3 = stackIn_27_0;
          var8Lifetime2 = fj.field_m[var5Lifetime1];
          this.field_e[var13][1][1] = (fj.a(1870096848, var8Lifetime2, ng.field_H[var9] << 16) >> 16) * var7Lifetime3 + ng.field_K[var9];
          if (var13 == 0) {
            var10 = (var2 - var3 - 16) % 2048;
            stackIn_32_0 = (var10 <= 0) ? -1 : 1;
            var12 = stackIn_32_0;
            var10 = var12 * var10;
            var8Lifetime3 = fj.field_m[var10];
            if (var10 >= 511 &&
              var10 < 1536) {
              stackIn_36_0 = 1;
            } else {
              stackIn_36_0 = -1;
            }
            var12Lifetime2 = stackIn_36_0;
            this.field_h[var13][0] = (fj.a(1870096848, var8Lifetime3, ub.field_k[var9] << 16) >> 16) * var12Lifetime2 + ub.field_a[var9];
          } else {
            this.field_h[var13][0] = this.field_h[-1 + var13][31];
          }
          if (var13 == 63) {
            this.field_h[var13][31] = this.field_h[0][0];
          } else {
            var11 = (16 + (-var3 + var2)) % 2048;
            stackIn_41_0 = (var11 > 0) ? 1 : -1;
            var12Lifetime1 = stackIn_41_0;
            var11 = var12Lifetime1 * var11;
            var8Lifetime4 = fj.field_m[var11];
            if (var11 >= 511 &&
              var11 < 1536) {
              stackIn_45_0 = 1;
            } else {
              stackIn_45_0 = -1;
            }
            var12Lifetime1Lifetime1 = stackIn_45_0;
            this.field_h[var13][31] = (fj.a(1870096848, var8Lifetime4, ub.field_k[var9] << 16) >> 16) * var12Lifetime1Lifetime1 + ub.field_a[var9];
          }
          h.a(0, this.field_h[var13][31], this.field_h[var13], this.field_h[var13][0], 32);
          var13++;
        }
    }

    final void a(int param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (0 > param1) {
          return;
        }
        if (param1 >= 6) {
          return;
        }
        for (var3 = 0; var3 < 3; var3++) {
          for (var4 = 0; var4 <= 1; var4++) {
            for (var5 = 0; 32 > var5; var5++) {
              cg.field_b[var3][var4][var5] = new ka(var5 + 1, ub.field_c[var3][var4].field_v);
              cg.field_b[var3][var4][var5].d();
              od.c(ub.field_c[var3][var4], 0, 0, var5 + 1, 0);
            }
          }
        }
        if (param0 != 2) {
          this.field_o = (int[][][]) null;
        }
        for (var3Lifetime1 = 0; 1 >= var3Lifetime1; var3Lifetime1++) {
          for (var4Lifetime1 = 0; 32 > var4Lifetime1; var4Lifetime1++) {
            fh.field_a[var3Lifetime1][var4Lifetime1] = new ka(var4Lifetime1 + 1, af.field_a[var3Lifetime1].field_v);
            fh.field_a[var3Lifetime1][var4Lifetime1].d();
            od.c(af.field_a[param1 * 2 + var3Lifetime1], 0, 0, 1 + var4Lifetime1, 0);
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < 2; var3Lifetime2++) {
          for (var4Lifetime2 = 0; 64 > var4Lifetime2; var4Lifetime2++) {
            nj.field_e[var3Lifetime2][var4Lifetime2] = new ka(var4Lifetime2 + 1, ef.field_a[var3Lifetime2].field_v);
            nj.field_e[var3Lifetime2][var4Lifetime2].d();
            od.c(ef.field_a[var3Lifetime2], 0, 0, 1 + var4Lifetime2, 0);
          }
        }
        la.field_f.a(102);
        return;
    }

    private final void b(int param0) {
        int var19 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var20;
        int var21;
        int var22;
        int[] var23;
        int[] var24;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var20Lifetime1;
        int var12Lifetime1;
        var21 = TorChallenge.field_F ? 1 : 0;
        var2 = e.b((byte) 57, 16);
        if (var2 < 2) {
          var2 = 2;
        }
        if (3 < var2) {
          var2 = 3;
        }
        var3 = lj.field_h[0].field_q * lj.field_h[0].field_v;
        var4 = 32;
        var5 = 16;
        var6 = var4 * 32;
        var7 = 32 * var5;
        var8 = var7 * var6;
        if (param0 != 28026) {
          field_b = (ka[][]) null;
        }
        da.field_e = var2 * var8 / var3 >> 4;
        var24 = new int[1];
        var23 = var24;
        var9 = var23;
        wc.field_e = new int[da.field_e][][];
        for (var10 = 0; var10 < 0; var10++) {
          var9[var10] = 8 >> var10;
        }
        var10Lifetime1 = 0;
        for (var11 = 0; var11 < 0; var11++) {
          var10Lifetime1 = var10Lifetime1 + var24[var11];
        }
        var9[0] = -var10Lifetime1 + 16;
        var12 = 0;
        for (var19 = 0; var19 < da.field_e; var19++) {
          var12Lifetime1 = 0;
          var11Lifetime1 = e.b((byte) 57, 16);
          var10Lifetime2 = 0;
          for (var20 = 0; var20 < 1; var20++) {
            var10Lifetime2 = var10Lifetime2 + var24[var20];
            if (var11Lifetime1 >= var10Lifetime2) {
              continue;
            }
            var12Lifetime1 = 1 + var20;
            break;
          }
          if (var12Lifetime1 != 0) {
            wc.field_e[var19] = new int[var12Lifetime1][3];
            var13 = e.b((byte) 57, var4);
            var14 = e.b((byte) 57, var5);
            var15 = 32 * var13 + 16;
            var16 = 16 + var14 * 32;
            var22 = 0;
            var20Lifetime1 = var22;
            while (var12Lifetime1 > var22) {
              var17 = e.b((byte) 57, 33);
              var18 = e.b((byte) 57, 33);
              var17 = -16 + var17;
              var17 = var15 + var17;
              var18 = -16 + var18;
              var18 = var16 + var18;
              wc.field_e[var19][var22][0] = var17;
              wc.field_e[var19][var22][1] = var18;
              wc.field_e[var19][var22][2] = e.b((byte) 57, 5);
              var22++;
            }
          }
        }
    }

    final static int c(int param0) {
        if (param0 != -2) {
          ra.c(57);
          return 1;
        }
        return 1;
    }

    final void d(int param0) {
        if (param0 != -1) {
          this.d(-113);
        }
    }

    ra(int param0, int param1) {
        int var3_int;
        double var3;
        int var4;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        this.field_f = new int[32];
        this.field_a = 32;
        this.field_o = new int[2][2][2];
        this.field_t = new int[2][2];
        this.field_s = new int[2][2];
        this.field_h = new int[64][32];
        this.field_n = new int[2][2];
        this.field_e = new int[64][2][2];
        this.field_a = param0;
        ol.field_g = this;
        ic.field_E = new int[64][this.field_a];
        for (var3_int = 0; var3_int < 3; var3_int++) {
          for (var4 = 0; var4 <= 1; var4++) {
            ub.field_c[var3_int][var4] = ic.field_D[var4 + (param1 * 12 + 2 * var3_int)];
            la.field_f.a(-73);
          }
        }
        rj.field_b[0] = af.field_a[param1 * 2];
        rj.field_b[1] = af.field_a[1 + 2 * param1];
        for (var3_intLifetime1 = 0; var3_intLifetime1 < 2; var3_intLifetime1++) {
          ef.field_a[var3_intLifetime1] = be.field_f[param1 * 4 + var3_intLifetime1];
        }
        this.field_r = new int[64][this.field_a];
        for (var3_intLifetime2 = 0; var3_intLifetime2 < 64; var3_intLifetime2++) {
          for (var4Lifetime1 = 0; this.field_a > var4Lifetime1; var4Lifetime1++) {
            this.field_r[var3_intLifetime2][var4Lifetime1] = e.b((byte) 57, 2);
          }
        }
        this.field_u = new int[32][this.field_a];
        for (var3_intLifetime3 = 0; var3_intLifetime3 < 32; var3_intLifetime3++) {
          for (var4Lifetime2 = 0; this.field_a > var4Lifetime2; var4Lifetime2++) {
            this.field_u[var3_intLifetime3][var4Lifetime2] = e.b((byte) 57, 3);
          }
        }
        this.field_c = new int[32][this.field_a];
        for (var3_intLifetime4 = 0; var3_intLifetime4 < 32; var3_intLifetime4++) {
          for (var4Lifetime3 = 0; var4Lifetime3 < this.field_a; var4Lifetime3++) {
            this.field_c[var3_intLifetime4][var4Lifetime3] = e.b((byte) 57, 10);
          }
        }
        var3 = 1.2217304763960306;
        Math.tan(var3);
        be.field_b = false;
        df.field_O = false;
        bi.field_g = new int[64][this.field_a][3][];
        this.b(28026);
    }

    static {
        field_k = new boolean[][]{new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, false, true}, new boolean[]{false, true, false}, new boolean[]{true, true, true}, new boolean[]{true, true, true}};
        field_j = new int[]{28, 20};
        field_b = new ka[2][2];
        field_q = false;
        field_g = 0;
        field_m = "Loading graphics";
        field_p = new int[][]{new int[]{0}, new int[]{6}, new int[]{12}, new int[]{18}, new int[]{24}, new int[]{30, -2}};
    }
}
