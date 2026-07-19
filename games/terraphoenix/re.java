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
        int stackOut_4_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param2 <= 0) {
                var4 = -20 / ((-11 - param1) / 61);
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = 1 & param0 | var3_int << -863504319;
                param2--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "re.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        if (param0 != 52) {
            field_h = (String[]) null;
        }
        field_h = null;
        field_d = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, boolean param4, int param5, int param6) {
        boolean discarded$2 = false;
        int incrementValue$3 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = Terraphoenix.field_V;
        try {
          L0: {
            if (param6 > param5) {
              if (param0 <= 1 + param5) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 <= 5 + param5) {
                    break L1;
                  } else {
                    if (param2 == param3) {
                      break L1;
                    } else {
                      L2: {
                        var7_int = (param3 >> -2062059871) - -(param2 >> 20129377) + (param3 & param2 & 1);
                        var8 = param5;
                        if (param1 < -19) {
                          break L2;
                        } else {
                          discarded$2 = re.a(-91, '\n');
                          break L2;
                        }
                      }
                      var9 = param2;
                      var10 = param3;
                      var11 = param5;
                      L3: while (true) {
                        if (var11 >= param0) {
                          re.a(var8, (byte) -77, param2, var9, param4, param5, param6);
                          re.a(param0, (byte) -62, var10, param3, param4, var8, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L4: {
                            var12 = pf.field_b[var11];
                            if (param4) {
                              stackOut_24_0 = a.field_c[var12];
                              stackIn_25_0 = stackOut_24_0;
                              break L4;
                            } else {
                              stackOut_23_0 = al.field_bb[var12];
                              stackIn_25_0 = stackOut_23_0;
                              break L4;
                            }
                          }
                          L5: {
                            var13 = stackIn_25_0;
                            if (var13 > var7_int) {
                              L6: {
                                pf.field_b[var11] = pf.field_b[var8];
                                if (var13 >= var9) {
                                  break L6;
                                } else {
                                  var9 = var13;
                                  break L6;
                                }
                              }
                              incrementValue$3 = var8;
                              var8++;
                              pf.field_b[incrementValue$3] = var12;
                              break L5;
                            } else {
                              if (var10 < var13) {
                                var10 = var13;
                                break L5;
                              } else {
                                var11++;
                                continue L3;
                              }
                            }
                          }
                          var11++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param0;
                L7: while (true) {
                  if (var7_int <= param5) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param5;
                    L8: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L7;
                      } else {
                        L9: {
                          var9 = pf.field_b[var8];
                          var10 = pf.field_b[var8 + 1];
                          if (!rb.a(var9, param4, (byte) 126, var10)) {
                            break L9;
                          } else {
                            pf.field_b[var8] = var10;
                            pf.field_b[1 + var8] = var9;
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var7), "re.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_10_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (128 > param1) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (255 < param1) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            if (param0 == -10152) {
              L3: {
                if (param1 != 0) {
                  var6 = oj.field_s;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= var6.length) {
                      break L3;
                    } else {
                      var4 = var6[var3];
                      if (param1 != var4) {
                        var3++;
                        continue L4;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2_ref), "re.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    re(int param0) {
        int var2 = 0;
        L0: {
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
          if (-1 == (var2 ^ -1)) {
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
            break L0;
          } else {
            if (-2 == (var2 ^ -1)) {
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
              break L0;
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
                break L0;
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
                  break L0;
                } else {
                  if ((var2 ^ -1) == -19) {
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
                    break L0;
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
                      break L0;
                    } else {
                      if (-6 == (var2 ^ -1)) {
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
                        break L0;
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
                          break L0;
                        } else {
                          if (-8 == (var2 ^ -1)) {
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
                            break L0;
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
                              break L0;
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
                                break L0;
                              } else {
                                if (-12 == (var2 ^ -1)) {
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
                                  break L0;
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
                                    break L0;
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
                                      break L0;
                                    } else {
                                      if (-14 == (var2 ^ -1)) {
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
                                        break L0;
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
                                          break L0;
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
                                            break L0;
                                          } else {
                                            if (-17 == (var2 ^ -1)) {
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
                                              break L0;
                                            } else {
                                              if (17 == var2) {
                                                this.field_o = 0;
                                                this.field_r = kd.field_a;
                                                this.field_p = -1;
                                                this.field_l = 50;
                                                this.field_s = 10;
                                                break L0;
                                              } else {
                                                if (20 != var2) {
                                                  break L0;
                                                } else {
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
                                                  break L0;
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
        }
        L1: {
          if (this.field_t) {
            break L1;
          } else {
            this.field_f = true;
            break L1;
          }
        }
    }

    static {
        field_h = new String[]{"TODO Summary page of the goal and control mechanism.", "TODO Full controls.", "TODO Objective and/or plot. May want to go from this page to tutorial."};
        field_d = "More suggestions";
    }
}
