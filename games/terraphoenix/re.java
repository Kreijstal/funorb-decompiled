/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    boolean field_q;
    static String[] field_h;
    int field_m;
    static String field_d;
    int[] field_b;
    boolean field_t;
    int[] field_g;
    String field_i;
    int field_c;
    String field_r;
    int field_a;
    boolean field_f;
    String field_e;
    int field_n;
    int field_o;
    int field_s;
    String field_j;
    String field_k;
    int field_p;
    int field_l;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var3_int = 0;
          while (param2 > 0) {
            var3_int = 1 & param0 | var3_int << 1;
            param2--;
            param0 = param0 >>> 1;
          }
          var4 = -20 / ((-11 - param1) / 61);
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "re.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 52) {
          field_h = (String[]) null;
        }
        field_h = null;
        field_d = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Terraphoenix.field_V;
        try {
          if (param6 <= param5) {
            return;
          }
          if (param0 <= 1 + param5) {
            return;
          }
          if (param0 > 5 + param5 &&
            param2 != param3) {
            var7_int = (param3 >> 1) + (param2 >> 1) + (param3 & param2 & 1);
            var8 = param5;
            if (param1 >= -19) {
              re.a(-91, '\n');
            }
            var9 = param2;
            var10 = param3;
            for (var11 = param5; var11 < param0; var11++) {
              var12 = pf.field_b[var11];
              if (param4) {
                stackIn_25_0 = a.field_c[var12];
              } else {
                stackIn_25_0 = al.field_bb[var12];
              }
              var13 = stackIn_25_0;
              if (var13 > var7_int) {
                pf.field_b[var11] = pf.field_b[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                pf.field_b[incrementValue$0] = var12;
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            re.a(var8, (byte) -77, param2, var9, param4, param5, param6);
            re.a(param0, (byte) -62, var10, param3, param4, var8, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param0; var7_intLifetime1 > param5; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = pf.field_b[var8Lifetime1];
              var10Lifetime1 = pf.field_b[var8Lifetime1 + 1];
              if (rb.a(var9Lifetime1, param4, (byte) 126, var10Lifetime1)) {
                pf.field_b[var8Lifetime1] = var10Lifetime1;
                pf.field_b[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var7), "re.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          if (param1 > 0 &&
            128 > param1) {
            return true;
          }
          if (param1 >= 160 &&
            255 >= param1) {
            return true;
          }
          if (param0 != -10152) {
            return true;
          }
          if (param1 != 0) {
            var6 = oj.field_s;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (param1 != var4) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2_ref), "re.D(" + param0 + ',' + param1 + ')');
        }
    }

    re(int param0) {
        int var2;
        this.field_b = new int[3];
        this.field_g = new int[5];
        this.field_t = false;
        this.field_r = "";
        this.field_f = false;
        this.field_e = "";
        this.field_k = "";
        this.field_q = false;
        this.field_i = "";
        this.field_s = 0;
        this.field_j = "";
        this.field_j = uh.field_L[param0];
        this.field_k = of.field_h[param0];
        this.field_e = i.field_b[param0];
        this.field_i = da.field_i[param0];
        var2 = param0;
        if (var2 == 0) {
          this.field_l = 16;
          this.field_o = 12;
          this.field_p = 2;
          this.field_g[0] = 80;
          this.field_r = df.field_M;
          this.field_b[0] = 22;
          this.field_g[1] = 40;
          this.field_g[2] = 5;
          this.field_b[1] = 20;
          this.field_m = 1;
          this.field_c = 0;
          this.field_g[4] = 50;
          this.field_g[3] = 90;
          this.field_n = 72;
          this.field_s = 0;
          this.field_b[2] = 20;
          this.field_a = 73;
          this.field_t = true;
        } else {
          if (var2 == 1) {
            this.field_g[0] = 15;
            this.field_r = ml.field_r;
            this.field_p = 1;
            this.field_l = 5;
            this.field_o = 8;
            this.field_g[1] = 10;
            this.field_b[0] = 40;
            this.field_n = 74;
            this.field_g[4] = 10;
            this.field_m = 0;
            this.field_s = 15;
            this.field_t = true;
            this.field_g[3] = 15;
            this.field_b[1] = 30;
            this.field_c = 0;
            this.field_a = 75;
          } else {
            if (var2 == 2) {
              this.field_r = sa.field_a;
              this.field_o = 30;
              this.field_l = 30;
              this.field_p = 2;
              this.field_g[0] = 110;
              this.field_g[1] = 50;
              this.field_b[0] = 55;
              this.field_b[1] = 30;
              this.field_g[2] = 10;
              this.field_n = 70;
              this.field_g[4] = 75;
              this.field_g[3] = 140;
              this.field_c = 0;
              this.field_b[2] = 10;
              this.field_q = true;
              this.field_s = 30;
              this.field_a = 71;
              this.field_m = 2;
              this.field_t = true;
            } else {
              if (3 == var2) {
                this.field_g[0] = 95;
                this.field_r = sd.field_a;
                this.field_l = 16;
                this.field_p = 2;
                this.field_o = 24;
                this.field_g[1] = 55;
                this.field_b[0] = 20;
                this.field_b[1] = 15;
                this.field_g[2] = 2;
                this.field_g[4] = 75;
                this.field_g[3] = 100;
                this.field_t = true;
                this.field_a = 69;
                this.field_b[2] = 5;
                this.field_c = 0;
                this.field_s = 8;
                this.field_m = 1;
                this.field_n = 68;
              } else {
                if (var2 == 18) {
                  this.field_o = 50;
                  this.field_l = 40;
                  this.field_g[0] = 80;
                  this.field_r = vc.field_b;
                  this.field_p = 2;
                  this.field_g[1] = 0;
                  this.field_b[0] = 70;
                  this.field_b[1] = 50;
                  this.field_g[2] = 5;
                  this.field_g[4] = 90;
                  this.field_a = 67;
                  this.field_s = 50;
                  this.field_g[3] = 100;
                  this.field_b[2] = 5;
                  this.field_t = true;
                  this.field_q = true;
                  this.field_m = 1;
                  this.field_c = 0;
                  this.field_n = 66;
                } else {
                  if (var2 == 4) {
                    this.field_r = k.field_a;
                    this.field_l = 100;
                    this.field_o = 1;
                    this.field_g[0] = 150;
                    this.field_p = 0;
                    this.field_g[3] = 150;
                    this.field_c = 1;
                    this.field_a = 80;
                    this.field_n = 79;
                    this.field_s = 50;
                    this.field_t = true;
                    this.field_m = 3;
                    this.field_g[4] = 150;
                    this.field_b[0] = 80;
                    this.field_q = true;
                  } else {
                    if (var2 == 5) {
                      this.field_g[0] = 100;
                      this.field_l = 50;
                      this.field_o = -1;
                      this.field_r = dm.field_e;
                      this.field_p = 0;
                      this.field_m = 1;
                      this.field_a = 77;
                      this.field_g[4] = 100;
                      this.field_c = 6;
                      this.field_g[3] = 100;
                      this.field_t = true;
                      this.field_s = 1;
                      this.field_b[0] = 20;
                      this.field_q = true;
                      this.field_n = 76;
                    } else {
                      if (6 == var2) {
                        this.field_p = 2;
                        this.field_r = ab.field_m;
                        this.field_g[0] = 90;
                        this.field_l = 45;
                        this.field_o = 0;
                        this.field_b[0] = 80;
                        this.field_g[1] = 50;
                        this.field_g[2] = 25;
                        this.field_q = true;
                        this.field_b[1] = 60;
                        this.field_n = 56;
                        this.field_a = 57;
                        this.field_g[3] = 200;
                        this.field_c = 2;
                        this.field_m = 3;
                        this.field_b[2] = 10;
                        this.field_g[4] = 75;
                        this.field_s = 60;
                      } else {
                        if (var2 == 7) {
                          this.field_p = 2;
                          this.field_g[0] = 125;
                          this.field_o = 0;
                          this.field_l = 40;
                          this.field_r = fc.field_j;
                          this.field_b[0] = 35;
                          this.field_g[1] = 65;
                          this.field_g[2] = 25;
                          this.field_q = true;
                          this.field_b[1] = 25;
                          this.field_b[2] = 25;
                          this.field_a = 55;
                          this.field_m = 3;
                          this.field_c = 2;
                          this.field_n = 54;
                          this.field_t = false;
                          this.field_g[4] = 75;
                          this.field_g[3] = 300;
                          this.field_s = 40;
                        } else {
                          if (var2 == 8) {
                            this.field_o = 25;
                            this.field_r = hh.field_p;
                            this.field_l = 6;
                            this.field_g[0] = 40;
                            this.field_p = 2;
                            this.field_g[1] = 25;
                            this.field_b[0] = 30;
                            this.field_g[2] = 1;
                            this.field_b[1] = 10;
                            this.field_n = 62;
                            this.field_g[3] = 75;
                            this.field_m = 1;
                            this.field_c = 3;
                            this.field_b[2] = 8;
                            this.field_a = 63;
                            this.field_g[4] = 50;
                            this.field_s = 15;
                          } else {
                            if (9 == var2) {
                              this.field_o = 25;
                              this.field_p = 2;
                              this.field_r = ij.field_c;
                              this.field_g[0] = 80;
                              this.field_l = 9;
                              this.field_g[1] = 30;
                              this.field_b[0] = 30;
                              this.field_g[2] = 2;
                              this.field_b[1] = 15;
                              this.field_b[2] = 6;
                              this.field_c = 3;
                              this.field_g[4] = 50;
                              this.field_s = 30;
                              this.field_n = 60;
                              this.field_g[3] = 100;
                              this.field_m = 2;
                              this.field_a = 61;
                            } else {
                              if (var2 == 11) {
                                this.field_r = bb.field_h;
                                this.field_o = -1;
                                this.field_g[0] = 100;
                                this.field_p = 0;
                                this.field_l = 90;
                                this.field_g[3] = 100;
                                this.field_q = true;
                                this.field_a = 64;
                                this.field_m = 1;
                                this.field_n = 76;
                                this.field_c = 7;
                                this.field_s = 5;
                                this.field_g[4] = 100;
                                this.field_b[0] = 20;
                              } else {
                                if (var2 == 10) {
                                  this.field_l = 8;
                                  this.field_p = 2;
                                  this.field_r = kh.field_O;
                                  this.field_g[0] = 100;
                                  this.field_o = 25;
                                  this.field_b[0] = 25;
                                  this.field_g[1] = 30;
                                  this.field_b[1] = 10;
                                  this.field_g[2] = 3;
                                  this.field_g[4] = 50;
                                  this.field_b[2] = 6;
                                  this.field_c = 3;
                                  this.field_a = 59;
                                  this.field_g[3] = 100;
                                  this.field_m = 2;
                                  this.field_s = 25;
                                  this.field_q = true;
                                  this.field_n = 58;
                                } else {
                                  if (12 == var2) {
                                    this.field_p = 2;
                                    this.field_o = 26;
                                    this.field_g[0] = 85;
                                    this.field_l = 50;
                                    this.field_r = kf.field_a;
                                    this.field_g[1] = 65;
                                    this.field_b[0] = 25;
                                    this.field_g[2] = 5;
                                    this.field_b[1] = 18;
                                    this.field_n = 50;
                                    this.field_m = 1;
                                    this.field_g[4] = 75;
                                    this.field_g[3] = 100;
                                    this.field_c = 4;
                                    this.field_b[2] = 12;
                                    this.field_a = 51;
                                    this.field_s = 20;
                                  } else {
                                    if (var2 == 13) {
                                      this.field_l = 80;
                                      this.field_o = 24;
                                      this.field_p = 2;
                                      this.field_r = jh.field_k;
                                      this.field_g[0] = 100;
                                      this.field_b[0] = 40;
                                      this.field_g[1] = 86;
                                      this.field_g[2] = 10;
                                      this.field_b[1] = 30;
                                      this.field_m = 2;
                                      this.field_c = 4;
                                      this.field_g[3] = 150;
                                      this.field_n = 45;
                                      this.field_g[4] = 100;
                                      this.field_a = 46;
                                      this.field_b[2] = 20;
                                      this.field_s = 60;
                                    } else {
                                      if (14 == var2) {
                                        this.field_p = 2;
                                        this.field_l = 115;
                                        this.field_r = wl.field_y;
                                        this.field_o = 16;
                                        this.field_g[0] = 110;
                                        this.field_g[1] = 75;
                                        this.field_b[0] = 50;
                                        this.field_b[1] = 35;
                                        this.field_g[2] = 15;
                                        this.field_g[4] = 125;
                                        this.field_s = 70;
                                        this.field_m = 2;
                                        this.field_n = 43;
                                        this.field_a = 44;
                                        this.field_g[3] = 200;
                                        this.field_c = 4;
                                        this.field_b[2] = 15;
                                      } else {
                                        if (15 == var2) {
                                          this.field_g[0] = 150;
                                          this.field_p = 0;
                                          this.field_o = 1;
                                          this.field_r = wa.field_q;
                                          this.field_l = 150;
                                          this.field_c = 5;
                                          this.field_s = 80;
                                          this.field_b[0] = 55;
                                          this.field_n = 47;
                                          this.field_g[3] = 150;
                                          this.field_m = 3;
                                          this.field_g[4] = 150;
                                          this.field_a = 48;
                                        } else {
                                          if (var2 == 16) {
                                            this.field_p = 2;
                                            this.field_l = 90;
                                            this.field_o = 20;
                                            this.field_g[0] = 110;
                                            this.field_r = sa.field_b;
                                            this.field_g[1] = 90;
                                            this.field_b[0] = 40;
                                            this.field_g[2] = 20;
                                            this.field_b[1] = 30;
                                            this.field_q = true;
                                            this.field_n = 52;
                                            this.field_g[3] = 200;
                                            this.field_a = 53;
                                            this.field_m = 2;
                                            this.field_c = 4;
                                            this.field_g[4] = 125;
                                            this.field_b[2] = 20;
                                            this.field_s = 50;
                                          } else {
                                            if (17 == var2) {
                                              this.field_o = 0;
                                              this.field_r = kd.field_a;
                                              this.field_p = -1;
                                              this.field_l = 50;
                                              this.field_s = 10;
                                            } else {
                                              if (20 == var2) {
                                                this.field_g[0] = 40;
                                                this.field_p = 2;
                                                this.field_l = 50;
                                                this.field_o = 25;
                                                this.field_g[1] = 25;
                                                this.field_b[0] = 30;
                                                this.field_g[2] = 1;
                                                this.field_b[1] = 10;
                                                this.field_g[3] = 75;
                                                this.field_m = 4;
                                                this.field_c = 8;
                                                this.field_b[2] = 8;
                                                this.field_n = 82;
                                                this.field_s = 15;
                                                this.field_a = 82;
                                                this.field_g[4] = 50;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (!this.field_t) {
          this.field_f = true;
        }
    }

    static {
        field_h = new String[]{"TODO Summary page of the goal and control mechanism.", "TODO Full controls.", "TODO Objective and/or plot. May want to go from this page to tutorial."};
        field_d = "More suggestions";
    }
}
