/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends we {
    static jea field_z;
    private int field_u;
    private int[] field_A;
    private long[][] field_w;
    static String field_v;
    private int[][] field_F;
    private int[] field_B;
    static jea field_s;
    private int field_E;
    private int[] field_D;
    static int field_r;
    private String[][] field_y;
    private int field_x;
    static int field_C;
    private int[] field_t;

    final String b(int param0, byte param1) {
        if (param1 < 111) {
            this.a(false, true, 79);
        }
        if (-1 == (param0 ^ -1)) {
            return fga.field_a;
        }
        return super.b(param0, (byte) 113);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4;
        int var5_int;
        bb var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        if (param0) {
          if (vpa.a(8)) {
            this.field_E = 1;
            return;
          } else {
            var4 = cb.field_i.length;
            var5_int = 0;
            L0: while (true) {
              if (var5_int >= var4) {
                L1: {
                  var5 = pt.field_p;
                  if (var5 == null) {
                    pt.field_p = uta.a(3, this.field_u, 0, 10, 1);
                    this.field_E = 0;
                    break L1;
                  } else {
                    if (!var5.field_h) {
                      this.field_E = 0;
                      break L1;
                    } else {
                      if (var5.field_k != null) {
                        this.field_F = var5.field_p;
                        this.field_y = var5.field_k;
                        this.field_E = 2;
                        this.field_w = var5.field_o;
                        if (this.field_y[this.field_x][0] == null) {
                          this.field_E = 3;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        this.field_E = 1;
                        break L1;
                      }
                    }
                  }
                }
                return;
              } else {
                if (jba.field_j >= -(this.field_D[var5_int] >> 1503307809) + this.field_A[var5_int]) {
                  if (jba.field_j <= this.field_A[var5_int] + (this.field_D[var5_int] >> -1780601759)) {
                    if (-(this.field_t[var5_int] >> -1779214079) + this.field_B[var5_int] <= sta.field_B) {
                      if ((this.field_t[var5_int] >> -1442500191) + this.field_B[var5_int] >= sta.field_B) {
                        if (1 == hf.field_b) {
                          pt.field_p = null;
                          this.field_u = var5_int;
                          var5_int++;
                          continue L0;
                        } else {
                          var5_int++;
                          continue L0;
                        }
                      } else {
                        var5_int++;
                        continue L0;
                      }
                    } else {
                      var5_int++;
                      continue L0;
                    }
                  } else {
                    var5_int++;
                    continue L0;
                  }
                } else {
                  var5_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0, int param1) {
        boolean discarded$0 = false;
        if (param0 <= 54) {
            discarded$0 = this.a(-109, (byte) -61, 118);
        }
        this.field_x = param1;
    }

    final int a(byte param0, int param1) {
        if (param0 < 111) {
            return 78;
        }
        return 335 + (-(80 * this.field_m.length) - -(param1 * 160));
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            this.g(-68, -86);
        }
        return koa.b(0) + -30;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        da var11 = null;
        da var12 = null;
        String var8 = null;
        String var10 = null;
        try {
            var11 = kn.field_p;
            var12 = var11;
            int var9 = 44 % ((param4 - -34) / 41);
            var8 = param1 >= 10 ? Integer.toString(param1) : "0" + (char)(48 - -param1);
            if ((param1 ^ -1) == 0) {
                var8 = "";
            }
            var10 = f.a(2843, true, bg.field_t, (long)param2, 0);
            var11.a(-1, -1, ab.field_t[0], param3 | -16777216, param0, var8);
            var11.a(param0, false, param5, ab.field_t[1], param3 | -16777216, -1);
            var12.a(12199, param0, var10, -1, param3 | -16777216, ab.field_t[2]);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pk.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int stackIn_3_0 = 0;
        Object stackIn_18_0;
        int stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        Object stackIn_19_0;
        int stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        int stackIn_19_4;
        String stackIn_26_0 = null;
        String[] var4;
        kb var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        String var13;
        int var14;
        int var15;
        int var16;
        String[] var17;
        int[] var24;
        long[] var25;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var17 = this.field_y[param0];
          var4 = var17;
          var24 = this.field_F[param0];
          var25 = this.field_w[param0];
          var7 = qv.field_o;
          var8 = 0;
          if (var7 != null) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var9 = stackIn_3_0;
        var10 = param2 + 140;
        var11 = 0;
        var12 = 140 + param2;
        L1: while (true) {
          if (var11 >= 10) {
            L2: {
              if (var9 != 0) {
                break L2;
              } else {
                if (this.field_u == var7.field_f) {
                  var8 = 1;
                  this.a(var10 - -20, -1, var7.field_o[0], -5818367, -91, fna.field_k);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < -85) {
                break L3;
              } else {
                stackIn_26_0 = (String) null;
                field_v = stackIn_26_0;
                break L3;
              }
            }
            return var8 != 0;
          } else {
            var13 = var17[var11];
            if (var13 != null) {
              if (var13.length() != 0) {
                L4: {
                  var14 = var24[var11];
                  var15 = 0;
                  if (var9 == 0) {
                    if (var25[var11] != var7.field_h) {
                      break L4;
                    } else {
                      if (var7.field_o[0] != var14) {
                        break L4;
                      } else {
                        if (ue.a(var13, 0)) {
                          var9 = 1;
                          var15 = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var10 = var12;
                  stackIn_18_0 = this;

                  stackIn_18_1 = var12;

                  stackIn_18_2 = var11 - -1;

                  stackIn_18_3 = var14;

                  if (var15 != 0) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = stackIn_18_2;
                    stackIn_19_3 = stackIn_18_3;
                    stackIn_19_4 = 10309393;
                    break L5;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = stackIn_18_2;
                    stackIn_19_3 = stackIn_18_3;
                    stackIn_19_4 = 2431750;
                    break L5;
                  }
                }
                this.a(stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, -105, var13);
                var8 = 1;
                var11++;
                var12 += 20;
                continue L1;
              } else {
                var11++;
                var12 += 20;
                continue L1;
              }
            } else {
              var11++;
              var12 += 20;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        boolean discarded$0 = false;
        int var4;
        Object var5;
        int var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        qr.field_v.a(param1 + 63, false, vea.field_a.toUpperCase() + " - " + bi.field_b[this.field_x].toUpperCase(), 65, -14279929, -1);
        if (param2 <= -9) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= cb.field_i.length) {
              L1: {
                var4 = 120 + param1 - -50;
                eda.field_f.a(-1, -1, ab.field_t[0], -14671840, var4, hl.field_a);
                eda.field_f.a(var4, false, pta.field_g.toUpperCase(), ab.field_t[1], -14671840, -1);
                eda.field_f.a(12199, var4, lc.field_L.toUpperCase(), -1, -14671840, ab.field_t[2]);
                var5 = null;
                var6 = this.field_E;
                if (var6 == 0) {
                  var5 = dt.field_n;
                  break L1;
                } else {
                  if (-2 == (var6 ^ -1)) {
                    var5 = kt.field_H;
                    break L1;
                  } else {
                    if (3 == var6) {
                      var5 = nm.field_j;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (var5 != null) {
                  oka.a(((String) (var5)).toUpperCase(), 65793, eda.field_f, -1, 240 + param1, aaa.a(false) / 2, -1);
                  break L2;
                } else {
                  discarded$0 = this.a(this.field_x, (byte) -91, 50 + param1);
                  break L2;
                }
              }
              kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, param1 + 405, rpa.field_f);
              return;
            } else {
              L3: {
                var5 = null;
                var6 = 255;
                if ((this.field_u ^ -1) == (var4 ^ -1)) {
                  var5 = cb.field_i[var4];
                  break L3;
                } else {
                  var6 = var6 >> 1;
                  var5 = qf.field_k[var4];
                  break L3;
                }
              }
              ((nh) (var5)).a(this.field_A[var4] + -(this.field_D[var4] >> -1994034495), -(this.field_t[var4] >> 1911868801) + (this.field_B[var4] + param1), this.field_D[var4], this.field_t[var4], 0, 16777215 | var6 << 1231961464, 1);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            field_C = -47;
        }
        return param0 * 160 + 465 + -(80 * this.field_m.length);
    }

    final boolean a(int param0, int param1) {
        if (param0 != -13) {
            return true;
        }
        return -1 + param1 == this.field_x ? true : false;
    }

    public static void b(boolean param0) {
        if (!param0) {
            pk.b(false);
        }
        field_z = null;
        field_s = null;
        field_v = null;
    }

    pk(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        this.field_u = 0;
        this.field_E = 0;
        this.field_x = 0;
        try {
            var7_int = cb.field_i.length;
            this.field_B = new int[var7_int];
            this.field_D = new int[var7_int];
            this.field_A = new int[var7_int];
            this.field_t = new int[var7_int];
            for (var8 = 0; var7_int > var8; var8++) {
                var9 = cb.field_i[var8].a();
                var10 = cb.field_i[var8].c();
                this.field_A[var8] = (aaa.a(false) >> 114881377) + -(32 * (-1 + cb.field_i.length)) + var8 * 65;
                this.field_B[var8] = 110;
                this.field_D[var8] = 3 * var9 / 4;
                this.field_t[var8] = 3 * var10 / 4;
                if (var8 == 1) {
                    this.field_A[var8] = this.field_A[var8] - 15;
                }
                if (-3 == (var8 ^ -1)) {
                    this.field_A[var8] = this.field_A[var8] - 20;
                    this.field_D[var8] = var9 >> -2129476991;
                    this.field_t[var8] = var10 >> 1113247521;
                }
                if (3 == var8) {
                    this.field_A[var8] = this.field_A[var8] - 10;
                    this.field_B[var8] = this.field_B[var8] - 5;
                }
                if (var8 == 4) {
                    this.field_A[var8] = this.field_A[var8] - 15;
                }
                if (5 == var8) {
                    this.field_A[var8] = this.field_A[var8] - 15;
                }
                if (var8 == 6) {
                    this.field_A[var8] = this.field_A[var8] - 10;
                    this.field_B[var8] = this.field_B[var8] + 5;
                }
                if (7 == var8) {
                    this.field_A[var8] = this.field_A[var8] - 15;
                    this.field_B[var8] = this.field_B[var8] - 5;
                }
                if (var8 == 8) {
                    this.field_A[var8] = this.field_A[var8] - 10;
                }
            }
            this.field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = "Invalid name";
        field_C = 0;
    }
}
