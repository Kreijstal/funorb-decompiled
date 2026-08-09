/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int[] field_d;
    int[] field_j;
    short[] field_s;
    short[] field_h;
    private int field_w;
    short[] field_q;
    int[] field_I;
    int[] field_v;
    int field_E;
    jt[] field_m;
    ava[] field_B;
    int[] field_c;
    short[] field_K;
    int[] field_D;
    byte field_k;
    rga[] field_e;
    byte[] field_z;
    int field_L;
    byte[] field_G;
    byte[] field_u;
    short[] field_y;
    int[] field_p;
    int[] field_l;
    byte[] field_n;
    short[] field_J;
    int field_F;
    byte[] field_g;
    byte[] field_i;
    int[] field_x;
    int field_o;
    byte[] field_C;
    short[] field_t;
    static su field_H;
    int[] field_b;
    int[] field_f;
    short[] field_A;
    short[] field_a;
    short[] field_r;

    final int[][] c(byte param0) {
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$2 = null;
        int var2;
        int[] var3;
        int var4;
        int var5_int;
        int var6;
        int var8;
        int[] var9;
        int[] var11;
        int[][] var5;
        int var7;
        int[][] var10;
        int[][] var12;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 83 % ((param0 - 22) / 49);
        var11 = new int[256];
        var9 = var11;
        var3 = var9;
        var4 = 0;
        var5_int = 0;
        L0: while (true) {
          if (this.field_o <= var5_int) {
            var12 = new int[var4 - -1][];
            var10 = var12;
            var5 = var10;
            var6 = 0;
            L1: while (true) {
              if (var4 < var6) {
                var6 = 0;
                L2: while (true) {
                  if (this.field_o <= var6) {
                    return var5;
                  } else {
                    var7 = this.field_D[var6];
                    if (0 <= var7) {
                      var12 = var10;
                      dupTemp$0 = var3[var7];
                      arrayValue$1 = var12[var7];
                      var3[var7] = dupTemp$0 + 1;
                      arrayValue$1[dupTemp$0] = var6;
                      var6++;
                      continue L2;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                array$2 = new int[var11[var6]];
                var5[var6] = array$2;
                var11[var6] = 0;
                var6++;
                continue L1;
              }
            }
          } else {
            var6 = this.field_D[var5_int];
            if (-1 >= (var6 ^ -1)) {
              var3[var6] = var3[var6] + 1;
              if (var4 < var6) {
                var4 = var6;
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
          }
        }
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != -71) {
            oc.a((byte) 123);
        }
    }

    final int[][] b(byte param0) {
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$2 = null;
        int[] var2;
        int var3;
        int var4_int;
        int var5;
        int var7;
        int[] var8;
        int[] var9;
        int[] var11;
        int[][] var4;
        int var6;
        int[][] var10;
        int[][] var12;
        var7 = TombRacer.field_G ? 1 : 0;
        var11 = new int[256];
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (this.field_m.length <= var4_int) {
            var12 = new int[1 + var3][];
            var10 = var12;
            var4 = var10;
            var5 = 0;
            L1: while (true) {
              if (var3 < var5) {
                L2: {
                  if (param0 < -76) {
                    break L2;
                  } else {
                    this.a(false, (byte) -5);
                    break L2;
                  }
                }
                var5 = 0;
                L3: while (true) {
                  if (this.field_m.length <= var5) {
                    return var4;
                  } else {
                    var6 = this.field_m[var5].field_b;
                    if ((var6 ^ -1) <= -1) {
                      dupTemp$0 = var2[var6];
                      arrayValue$1 = var12[var6];
                      var2[var6] = dupTemp$0 + 1;
                      arrayValue$1[dupTemp$0] = var5;
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                array$2 = new int[var11[var5]];
                var4[var5] = array$2;
                var11[var5] = 0;
                var5++;
                continue L1;
              }
            }
          } else {
            var5 = this.field_m[var4_int].field_b;
            if (0 <= var5) {
              var8[var5] = var8[var5] + 1;
              if (var3 < var5) {
                var3 = var5;
                var4_int++;
                continue L0;
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    private final int a(int param0, short param1, oc param2, int param3) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                this.field_n = (byte[]) null;
                break L1;
              }
            }
            var5_int = param2.field_b[param0];
            var6 = param2.field_I[param0];
            var7 = param2.field_p[param0];
            var8 = 0;
            L2: while (true) {
              if (this.field_E <= var8) {
                L3: {
                  this.field_b[this.field_E] = var5_int;
                  this.field_I[this.field_E] = var6;
                  this.field_p[this.field_E] = var7;
                  this.field_y[this.field_E] = (short)param1;
                  stackIn_14_0 = this.field_l;

                  stackIn_14_1 = this.field_E;

                  if (null != param2.field_l) {
                    stackIn_15_0 = (int[]) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = param2.field_l[param0];
                    break L3;
                  } else {
                    stackIn_15_0 = (int[]) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = -1;
                    break L3;
                  }
                }
                stackIn_15_0[stackIn_15_1] = stackIn_15_2;
                fieldTemp$0 = this.field_E;
                this.field_E = this.field_E + 1;
                stackIn_16_0 = fieldTemp$0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (var5_int != this.field_b[var8]) {
                    break L4;
                  } else {
                    if (this.field_I[var8] != var6) {
                      break L4;
                    } else {
                      if (this.field_p[var8] == var7) {
                        this.field_y[var8] = (short)fh.a((int) this.field_y[var8], (int) param1);
                        stackIn_10_0 = var8;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("oc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_16_0;
        }
    }

    private final void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        RuntimeException stackIn_188_0 = null;
        StringBuilder stackIn_188_1 = null;
        String stackIn_188_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        uia var4 = null;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        uia var65 = null;
        uia var66 = null;
        var64 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var65 = new uia(param0);
              var66 = var65;
              var4 = new uia(param0);
              var5 = new uia(param0);
              var6 = new uia(param0);
              var7 = new uia(param0);
              var8 = new uia(param0);
              var9 = new uia(param0);
              var66.field_h = param0.length - 23;
              this.field_E = var66.d(123);
              this.field_o = var66.d(123);
              this.field_F = var66.h(255);
              var10 = var66.h(255);
              if ((var10 & 1) != 1) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              var11 = stackIn_4_0;
              if ((var10 & 2) != 2) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              if ((var10 & 4 ^ -1) != -5) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 1;
                break L3;
              }
            }
            L4: {
              var13 = stackIn_10_0;
              if (8 != (var10 & 8)) {
                stackIn_13_0 = 0;
                break L4;
              } else {
                stackIn_13_0 = 1;
                break L4;
              }
            }
            L5: {
              var14 = stackIn_13_0;
              if (var14 == 0) {
                break L5;
              } else {
                var66.field_h = var66.field_h - 7;
                this.field_w = var66.h(255);
                var66.field_h = var66.field_h + 6;
                break L5;
              }
            }
            L6: {
              var15 = var66.h(param1 ^ 255);
              var16 = var66.h(255);
              var17 = var66.h(255);
              var18 = var66.h(255);
              var19 = var66.h(255);
              var20 = var66.d(param1 + 124);
              var21 = var66.d(127);
              var22 = var66.d(param1 + 127);
              var23 = var66.d(124);
              var24 = var66.d(param1 + 124);
              var25 = 0;
              var26 = 0;
              var27 = 0;
              if (0 < this.field_F) {
                this.field_u = new byte[this.field_F];
                var66.field_h = 0;
                var28 = 0;
                L7: while (true) {
                  if (this.field_F <= var28) {
                    break L6;
                  } else {
                    L8: {
                      dupTemp$0 = var65.c((byte) 52);
                      this.field_u[var28] = dupTemp$0;
                      var29 = dupTemp$0;
                      if ((var29 ^ -1) > -2) {
                        break L8;
                      } else {
                        if (var29 > 3) {
                          break L8;
                        } else {
                          var26++;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (-1 == (var29 ^ -1)) {
                        var25++;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var29 != 2) {
                        break L10;
                      } else {
                        var27++;
                        break L10;
                      }
                    }
                    var28++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            L11: {
              var28 = this.field_F;
              var29 = var28;
              var28 = var28 + this.field_E;
              var30 = var28;
              if (var11 == 0) {
                break L11;
              } else {
                var28 = var28 + this.field_o;
                break L11;
              }
            }
            L12: {
              var31 = var28;
              var28 = var28 + this.field_o;
              var32 = var28;
              if (var15 != 255) {
                break L12;
              } else {
                var28 = var28 + this.field_o;
                break L12;
              }
            }
            L13: {
              var33 = var28;
              if ((var17 ^ -1) == -2) {
                var28 = var28 + this.field_o;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var34 = var28;
              if (1 == var19) {
                var28 = var28 + this.field_E;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var35 = var28;
              if (var16 != 1) {
                break L15;
              } else {
                var28 = var28 + this.field_o;
                break L15;
              }
            }
            L16: {
              var36 = var28;
              var28 = var28 + var23;
              var37 = var28;
              if ((var18 ^ -1) == -2) {
                var28 = var28 + 2 * this.field_o;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var38 = var28;
              var28 = var28 + var24;
              var39 = var28;
              var28 = var28 + this.field_o * 2;
              var40 = var28;
              var28 = var28 + var20;
              var41 = var28;
              var28 = var28 + var21;
              var42 = var28;
              var28 = var28 + var22;
              var43 = var28;
              var28 = var28 + var25 * 6;
              var44 = var28;
              var28 = var28 + 6 * var26;
              var45 = 6;
              if (-15 != (this.field_w ^ -1)) {
                if ((this.field_w ^ -1) > -16) {
                  break L17;
                } else {
                  var45 = 9;
                  break L17;
                }
              } else {
                var45 = 7;
                break L17;
              }
            }
            L18: {
              var46 = var28;
              var28 = var28 + var45 * var26;
              var47 = var28;
              var28 = var28 + var26;
              var48 = var28;
              var28 = var28 + var26;
              var49 = var28;
              var28 = var28 + (var27 * 2 + var26);
              this.field_t = new short[this.field_o];
              var50 = var28;
              this.field_p = new int[this.field_E];
              this.field_a = new short[this.field_o];
              if (-2 != (var18 ^ -1)) {
                break L18;
              } else {
                if (0 >= this.field_F) {
                  break L18;
                } else {
                  this.field_g = new byte[this.field_o];
                  break L18;
                }
              }
            }
            L19: {
              if (var16 != 1) {
                break L19;
              } else {
                this.field_n = new byte[this.field_o];
                break L19;
              }
            }
            L20: {
              if (-1 <= (this.field_F ^ -1)) {
                break L20;
              } else {
                L21: {
                  this.field_K = new short[this.field_F];
                  if (0 >= var26) {
                    break L21;
                  } else {
                    this.field_i = new byte[var26];
                    this.field_j = new int[var26];
                    this.field_x = new int[var26];
                    this.field_f = new int[var26];
                    this.field_z = new byte[var26];
                    this.field_d = new int[var26];
                    break L21;
                  }
                }
                L22: {
                  this.field_q = new short[this.field_F];
                  if (0 < var27) {
                    this.field_c = new int[var27];
                    this.field_v = new int[var27];
                    break L22;
                  } else {
                    break L22;
                  }
                }
                this.field_s = new short[this.field_F];
                break L20;
              }
            }
            L23: {
              if (var11 != 0) {
                this.field_G = new byte[this.field_o];
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (255 != var15) {
                this.field_k = (byte)var15;
                break L24;
              } else {
                this.field_C = new byte[this.field_o];
                break L24;
              }
            }
            L25: {
              if (1 == var18) {
                this.field_r = new short[this.field_o];
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              this.field_A = new short[this.field_o];
              this.field_I = new int[this.field_E];
              this.field_J = new short[this.field_o];
              if ((var17 ^ -1) != -2) {
                break L26;
              } else {
                this.field_D = new int[this.field_o];
                break L26;
              }
            }
            L27: {
              var66.field_h = var29;
              this.field_b = new int[this.field_E];
              if (var19 == 1) {
                this.field_l = new int[this.field_E];
                break L27;
              } else {
                break L27;
              }
            }
            var4.field_h = var40;
            var5.field_h = var41;
            var6.field_h = var42;
            var7.field_h = var34;
            var51 = 0;
            var52 = 0;
            var53 = 0;
            var54 = 0;
            L28: while (true) {
              if (this.field_E <= var54) {
                var66.field_h = var39;
                var4.field_h = var30;
                var5.field_h = var32;
                var6.field_h = var35;
                var7.field_h = var33;
                var8.field_h = var37;
                var9.field_h = var38;
                var54 = 0;
                L29: while (true) {
                  if (var54 >= this.field_o) {
                    var66.field_h = var36;
                    this.field_L = -1;
                    var4.field_h = var31;
                    var54 = 0;
                    var55 = 0;
                    var56 = 0;
                    var57 = 0;
                    var58 = 0;
                    L30: while (true) {
                      if (var58 >= this.field_o) {
                        L31: {
                          var66.field_h = var43;
                          if (param1 == 0) {
                            break L31;
                          } else {
                            this.field_e = (rga[]) null;
                            break L31;
                          }
                        }
                        this.field_L = this.field_L + 1;
                        var4.field_h = var44;
                        var5.field_h = var46;
                        var6.field_h = var47;
                        var7.field_h = var48;
                        var8.field_h = var49;
                        var58 = 0;
                        L32: while (true) {
                          if (var58 >= this.field_F) {
                            L33: {
                              var66.field_h = var50;
                              if (var12 == 0) {
                                break L33;
                              } else {
                                L34: {
                                  var58 = var66.h(255);
                                  if (0 < var58) {
                                    this.field_B = new ava[var58];
                                    var59 = 0;
                                    L35: while (true) {
                                      if (var59 >= var58) {
                                        break L34;
                                      } else {
                                        L36: {
                                          var60 = var66.d(param1 + 121);
                                          var61 = var66.d(122);
                                          if (255 != var15) {
                                            var62 = (byte)var15;
                                            break L36;
                                          } else {
                                            var62 = this.field_C[var61];
                                            break L36;
                                          }
                                        }
                                        this.field_B[var59] = new ava(var60, (int) this.field_a[var61], (int) this.field_t[var61], (int) this.field_J[var61], (byte) var62);
                                        var59++;
                                        continue L35;
                                      }
                                    }
                                  } else {
                                    break L34;
                                  }
                                }
                                var59 = var66.h(255);
                                if (-1 <= (var59 ^ -1)) {
                                  break L33;
                                } else {
                                  this.field_e = new rga[var59];
                                  var60 = 0;
                                  L37: while (true) {
                                    if (var60 >= var59) {
                                      break L33;
                                    } else {
                                      var61 = var66.d(121);
                                      var62 = var66.d(123);
                                      this.field_e[var60] = new rga(var61, var62);
                                      var60++;
                                      continue L37;
                                    }
                                  }
                                }
                              }
                            }
                            L38: {
                              L39: {
                                if (var13 == 0) {
                                  break L39;
                                } else {
                                  var58 = var66.h(255);
                                  if ((var58 ^ -1) < -1) {
                                    this.field_m = new jt[var58];
                                    var59 = 0;
                                    L40: while (true) {
                                      if (var59 >= var58) {
                                        break L39;
                                      } else {
                                        var60 = var66.d(124);
                                        var61 = var66.d(param1 ^ 123);
                                        var62 = var66.h(param1 + 255);
                                        var63 = var66.c((byte) 60);
                                        this.field_m[var59] = new jt(var60, var61, var62, var63);
                                        var59++;
                                        continue L40;
                                      }
                                    }
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              break L38;
                            }
                            break L0;
                          } else {
                            L41: {
                              var59 = this.field_u[var58] & 255;
                              if ((var59 ^ -1) != -1) {
                                break L41;
                              } else {
                                this.field_s[var58] = (short)var66.d(123);
                                this.field_q[var58] = (short)var66.d(125);
                                this.field_K[var58] = (short)var66.d(123);
                                break L41;
                              }
                            }
                            L42: {
                              if (-2 != (var59 ^ -1)) {
                                break L42;
                              } else {
                                L43: {
                                  this.field_s[var58] = (short)var4.d(126);
                                  this.field_q[var58] = (short)var4.d(123);
                                  this.field_K[var58] = (short)var4.d(param1 + 122);
                                  if (15 > this.field_w) {
                                    L44: {
                                      this.field_j[var58] = var5.d(param1 + 127);
                                      if (this.field_w < 14) {
                                        this.field_f[var58] = var5.d(123);
                                        break L44;
                                      } else {
                                        this.field_f[var58] = var5.a(-32768);
                                        break L44;
                                      }
                                    }
                                    this.field_x[var58] = var5.d(kha.b(param1, 125));
                                    break L43;
                                  } else {
                                    this.field_j[var58] = var5.a(-32768);
                                    this.field_f[var58] = var5.a(-32768);
                                    this.field_x[var58] = var5.a(-32768);
                                    break L43;
                                  }
                                }
                                this.field_i[var58] = var6.c((byte) 87);
                                this.field_z[var58] = var7.c((byte) 96);
                                this.field_d[var58] = var8.c((byte) 75);
                                break L42;
                              }
                            }
                            L45: {
                              if (var59 == 2) {
                                L46: {
                                  this.field_s[var58] = (short)var4.d(126);
                                  this.field_q[var58] = (short)var4.d(127);
                                  this.field_K[var58] = (short)var4.d(param1 + 123);
                                  if (this.field_w >= 15) {
                                    this.field_j[var58] = var5.a(-32768);
                                    this.field_f[var58] = var5.a(-32768);
                                    this.field_x[var58] = var5.a(-32768);
                                    break L46;
                                  } else {
                                    L47: {
                                      this.field_j[var58] = var5.d(122);
                                      if (-15 >= (this.field_w ^ -1)) {
                                        this.field_f[var58] = var5.a(-32768);
                                        break L47;
                                      } else {
                                        this.field_f[var58] = var5.d(param1 + 126);
                                        break L47;
                                      }
                                    }
                                    this.field_x[var58] = var5.d(122);
                                    break L46;
                                  }
                                }
                                this.field_i[var58] = var6.c((byte) 122);
                                this.field_z[var58] = var7.c((byte) 119);
                                this.field_d[var58] = var8.c((byte) 88);
                                this.field_v[var58] = var8.c((byte) 82);
                                this.field_c[var58] = var8.c((byte) 65);
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                            L48: {
                              if ((var59 ^ -1) == -4) {
                                L49: {
                                  this.field_s[var58] = (short)var4.d(125);
                                  this.field_q[var58] = (short)var4.d(param1 + 124);
                                  this.field_K[var58] = (short)var4.d(125);
                                  if (-16 < (this.field_w ^ -1)) {
                                    L50: {
                                      this.field_j[var58] = var5.d(123);
                                      if ((this.field_w ^ -1) > -15) {
                                        this.field_f[var58] = var5.d(123);
                                        break L50;
                                      } else {
                                        this.field_f[var58] = var5.a(-32768);
                                        break L50;
                                      }
                                    }
                                    this.field_x[var58] = var5.d(123);
                                    break L49;
                                  } else {
                                    this.field_j[var58] = var5.a(kha.b(param1, -32768));
                                    this.field_f[var58] = var5.a(kha.b(param1, -32768));
                                    this.field_x[var58] = var5.a(param1 + -32768);
                                    break L49;
                                  }
                                }
                                this.field_i[var58] = var6.c((byte) 31);
                                this.field_z[var58] = var7.c((byte) 70);
                                this.field_d[var58] = var8.c((byte) 32);
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            var58++;
                            continue L32;
                          }
                        }
                      } else {
                        L51: {
                          var59 = var4.h(255);
                          if (-2 != (var59 ^ -1)) {
                            break L51;
                          } else {
                            L52: {
                              var54 = (short)(var57 + var66.f((byte) -128));
                              var57 = var54;
                              var55 = (short)(var66.f((byte) -128) + var57);
                              var57 = var55;
                              var56 = (short)(var66.f((byte) -128) + var57);
                              var57 = var56;
                              this.field_a[var58] = (short)var54;
                              this.field_t[var58] = (short)var55;
                              this.field_J[var58] = (short)var56;
                              if (var54 <= this.field_L) {
                                break L52;
                              } else {
                                this.field_L = var54;
                                break L52;
                              }
                            }
                            L53: {
                              if (this.field_L < var55) {
                                this.field_L = var55;
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            if (this.field_L < var56) {
                              this.field_L = var56;
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                        }
                        L54: {
                          if (2 == var59) {
                            var55 = var56;
                            var56 = (short)(var66.f((byte) -128) + var57);
                            this.field_a[var58] = (short)var54;
                            var57 = var56;
                            this.field_t[var58] = (short)var55;
                            this.field_J[var58] = (short)var56;
                            if (this.field_L < var56) {
                              this.field_L = var56;
                              break L54;
                            } else {
                              break L54;
                            }
                          } else {
                            break L54;
                          }
                        }
                        L55: {
                          if (var59 != 3) {
                            break L55;
                          } else {
                            var54 = var56;
                            var56 = (short)(var66.f((byte) -128) + var57);
                            this.field_a[var58] = (short)var54;
                            var57 = var56;
                            this.field_t[var58] = (short)var55;
                            this.field_J[var58] = (short)var56;
                            if (var56 > this.field_L) {
                              this.field_L = var56;
                              break L55;
                            } else {
                              break L55;
                            }
                          }
                        }
                        L56: {
                          if (-5 != (var59 ^ -1)) {
                            break L56;
                          } else {
                            var60 = var54;
                            var54 = var55;
                            var55 = var60;
                            var56 = (short)(var57 + var66.f((byte) -128));
                            var57 = var56;
                            this.field_a[var58] = (short)var54;
                            this.field_t[var58] = (short)var55;
                            this.field_J[var58] = (short)var56;
                            if (this.field_L >= var56) {
                              break L56;
                            } else {
                              this.field_L = var56;
                              break L56;
                            }
                          }
                        }
                        var58++;
                        continue L30;
                      }
                    }
                  } else {
                    L57: {
                      this.field_A[var54] = (short)var66.d(127);
                      if (var11 != 0) {
                        this.field_G[var54] = var4.c((byte) 33);
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                    L58: {
                      if (-256 != (var15 ^ -1)) {
                        break L58;
                      } else {
                        this.field_C[var54] = var5.c((byte) 96);
                        break L58;
                      }
                    }
                    L59: {
                      if (-2 == (var16 ^ -1)) {
                        this.field_n[var54] = var6.c((byte) 119);
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    L60: {
                      if (var17 != 1) {
                        break L60;
                      } else {
                        this.field_D[var54] = var7.h(255);
                        break L60;
                      }
                    }
                    L61: {
                      if ((var18 ^ -1) == -2) {
                        this.field_r[var54] = (short)(var8.d(kha.b(param1, 127)) + -1);
                        break L61;
                      } else {
                        break L61;
                      }
                    }
                    L62: {
                      if (this.field_g != null) {
                        if ((this.field_r[var54] ^ -1) != 0) {
                          this.field_g[var54] = (byte)(var9.h(255) - 1);
                          break L62;
                        } else {
                          this.field_g[var54] = (byte)-1;
                          break L62;
                        }
                      } else {
                        break L62;
                      }
                    }
                    var54++;
                    continue L29;
                  }
                }
              } else {
                L63: {
                  var55 = var66.h(255);
                  var56 = 0;
                  if (-1 != (var55 & 1 ^ -1)) {
                    var56 = var4.f((byte) -128);
                    break L63;
                  } else {
                    break L63;
                  }
                }
                L64: {
                  var57 = 0;
                  if (-1 != (2 & var55 ^ -1)) {
                    var57 = var5.f((byte) -128);
                    break L64;
                  } else {
                    break L64;
                  }
                }
                L65: {
                  var58 = 0;
                  if ((var55 & 4) == 0) {
                    break L65;
                  } else {
                    var58 = var6.f((byte) -128);
                    break L65;
                  }
                }
                L66: {
                  this.field_b[var54] = var51 + var56;
                  this.field_I[var54] = var52 + var57;
                  this.field_p[var54] = var53 - -var58;
                  var53 = this.field_p[var54];
                  var51 = this.field_b[var54];
                  var52 = this.field_I[var54];
                  if (1 == var19) {
                    this.field_l[var54] = var7.h(kha.b(param1, 255));
                    break L66;
                  } else {
                    break L66;
                  }
                }
                var54++;
                continue L28;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L67: {
            var3 = decompiledCaughtException;
            stackIn_187_0 = (RuntimeException) (var3);

            stackIn_187_1 = new StringBuilder().append("oc.D(");

            if (param0 == null) {
              stackIn_188_0 = (RuntimeException) ((Object) stackIn_187_0);
              stackIn_188_1 = (StringBuilder) ((Object) stackIn_187_1);
              stackIn_188_2 = "null";
              break L67;
            } else {
              stackIn_188_0 = (RuntimeException) ((Object) stackIn_187_0);
              stackIn_188_1 = (StringBuilder) ((Object) stackIn_187_1);
              stackIn_188_2 = "{...}";
              break L67;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_188_0), stackIn_188_2 + ',' + param1 + ')');
        }
    }

    final int[][] a(boolean param0, byte param1) {
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$2 = null;
        int[] var3;
        int var4;
        int var5;
        int var6_int;
        int var7;
        int var9;
        int[] var10;
        int[] var11;
        int[] var13;
        int stackIn_3_0 = 0;
        int[][] var6;
        int var8;
        int[][] var12;
        int[][] var14;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var13 = new int[256];
          var11 = var13;
          var10 = var11;
          var3 = var10;
          var4 = 0;
          if (param0) {
            stackIn_3_0 = this.field_E;
            break L0;
          } else {
            stackIn_3_0 = this.field_L;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6_int = 0;
        L1: while (true) {
          if (var6_int >= var5) {
            L2: {
              if (param1 == 64) {
                break L2;
              } else {
                this.field_g = (byte[]) null;
                break L2;
              }
            }
            var14 = new int[var4 + 1][];
            var12 = var14;
            var6 = var12;
            var7 = 0;
            L3: while (true) {
              if (var7 > var4) {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var5) {
                    return var6;
                  } else {
                    var8 = this.field_l[var7];
                    if ((var8 ^ -1) <= -1) {
                      dupTemp$0 = var3[var8];
                      arrayValue$1 = var14[var8];
                      var3[var8] = dupTemp$0 + 1;
                      arrayValue$1[dupTemp$0] = var7;
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                array$2 = new int[var13[var7]];
                var6[var7] = array$2;
                var13[var7] = 0;
                var7++;
                continue L3;
              }
            }
          } else {
            var7 = this.field_l[var6_int];
            if (var7 >= 0) {
              var10[var7] = var10[var7] + 1;
              if (var4 < var7) {
                var4 = var7;
                var6_int++;
                continue L1;
              } else {
                var6_int++;
                continue L1;
              }
            } else {
              var6_int++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, byte[] param1) {
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        var43 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 0;
              var5 = new uia(param1);
              var6 = new uia(param1);
              var7 = new uia(param1);
              var8 = new uia(param1);
              var9 = new uia(param1);
              var5.field_h = -18 + param1.length;
              this.field_E = var5.d(param0 + -5349);
              this.field_o = var5.d(124);
              this.field_F = var5.h(255);
              var10 = var5.h(param0 + -5219);
              var11 = var5.h(param0 ^ 5533);
              var12 = var5.h(255);
              var13 = var5.h(255);
              var14 = var5.h(param0 ^ 5533);
              var15 = var5.d(123);
              var16 = var5.d(125);
              var17 = var5.d(param0 + -5348);
              var18 = var5.d(127);
              var19 = 0;
              var20 = var19;
              var19 = var19 + this.field_E;
              var21 = var19;
              var19 = var19 + this.field_o;
              var22 = var19;
              if (-256 == (var11 ^ -1)) {
                var19 = var19 + this.field_o;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var23 = var19;
              if (1 == var13) {
                var19 = var19 + this.field_o;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var24 = var19;
              if (1 == var10) {
                var19 = var19 + this.field_o;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var25 = var19;
              if (var14 == 1) {
                var19 = var19 + this.field_E;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var26 = var19;
              if (1 == var12) {
                var19 = var19 + this.field_o;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var27 = var19;
              var19 = var19 + var18;
              var28 = var19;
              var19 = var19 + this.field_o * 2;
              var29 = var19;
              var19 = var19 + this.field_F * 6;
              var30 = var19;
              var19 = var19 + var15;
              var31 = var19;
              var19 = var19 + var16;
              var32 = var19;
              this.field_p = new int[this.field_E];
              this.field_t = new short[this.field_o];
              if (-1 <= (this.field_F ^ -1)) {
                break L6;
              } else {
                this.field_u = new byte[this.field_F];
                this.field_s = new short[this.field_F];
                this.field_K = new short[this.field_F];
                this.field_q = new short[this.field_F];
                break L6;
              }
            }
            L7: {
              if (-2 == (var13 ^ -1)) {
                this.field_D = new int[this.field_o];
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              this.field_I = new int[this.field_E];
              var19 = var19 + var17;
              this.field_a = new short[this.field_o];
              if (255 == var11) {
                this.field_C = new byte[this.field_o];
                break L8;
              } else {
                this.field_k = (byte)var11;
                break L8;
              }
            }
            L9: {
              this.field_J = new short[this.field_o];
              this.field_A = new short[this.field_o];
              var5.field_h = var20;
              if ((var14 ^ -1) != -2) {
                break L9;
              } else {
                this.field_l = new int[this.field_E];
                break L9;
              }
            }
            L10: {
              if (1 == var10) {
                this.field_G = new byte[this.field_o];
                this.field_g = new byte[this.field_o];
                this.field_r = new short[this.field_o];
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              this.field_b = new int[this.field_E];
              if ((var12 ^ -1) != -2) {
                break L11;
              } else {
                this.field_n = new byte[this.field_o];
                break L11;
              }
            }
            var6.field_h = var30;
            var7.field_h = var31;
            var8.field_h = var32;
            var9.field_h = var25;
            var33 = 0;
            var34 = 0;
            var35 = 0;
            var36 = 0;
            L12: while (true) {
              if (this.field_E <= var36) {
                var5.field_h = var28;
                var6.field_h = var24;
                var7.field_h = var22;
                var8.field_h = var26;
                var9.field_h = var23;
                var36 = 0;
                L13: while (true) {
                  if (this.field_o <= var36) {
                    this.field_L = -1;
                    var5.field_h = var27;
                    var6.field_h = var21;
                    var36 = 0;
                    var37 = 0;
                    var38 = 0;
                    var39 = 0;
                    var40 = 0;
                    L14: while (true) {
                      if (var40 >= this.field_o) {
                        var5.field_h = var29;
                        this.field_L = this.field_L + 1;
                        var40 = 0;
                        if (param0 == 5474) {
                          L15: while (true) {
                            if (this.field_F <= var40) {
                              L16: {
                                if (null == this.field_g) {
                                  break L16;
                                } else {
                                  var40 = 0;
                                  var44 = 0;
                                  var41 = var44;
                                  L17: while (true) {
                                    if (var44 >= this.field_o) {
                                      if (var40 != 0) {
                                        break L16;
                                      } else {
                                        this.field_g = null;
                                        break L16;
                                      }
                                    } else {
                                      L18: {
                                        var42 = 255 & this.field_g[var44];
                                        if (255 != var42) {
                                          L19: {
                                            if (this.field_a[var44] != (this.field_s[var42] & 65535)) {
                                              break L19;
                                            } else {
                                              if (this.field_t[var44] != (65535 & this.field_q[var42])) {
                                                break L19;
                                              } else {
                                                if ((65535 & this.field_K[var42]) != this.field_J[var44]) {
                                                  break L19;
                                                } else {
                                                  this.field_g[var44] = (byte)-1;
                                                  break L18;
                                                }
                                              }
                                            }
                                          }
                                          var40 = 1;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var44++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                              L20: {
                                if (var3_int != 0) {
                                  break L20;
                                } else {
                                  this.field_G = null;
                                  break L20;
                                }
                              }
                              L21: {
                                if (var4 == 0) {
                                  this.field_r = null;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              this.field_u[var40] = (byte) 0;
                              this.field_s[var40] = (short)var5.d(kha.b(param0, 5407));
                              this.field_q[var40] = (short)var5.d(126);
                              this.field_K[var40] = (short)var5.d(kha.b(param0, 5407));
                              var40++;
                              continue L15;
                            }
                          }
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        L22: {
                          var41 = var6.h(255);
                          if (-2 == (var41 ^ -1)) {
                            L23: {
                              var36 = (short)(var39 + var5.f((byte) -128));
                              var39 = var36;
                              var37 = (short)(var39 + var5.f((byte) -128));
                              var39 = var37;
                              var38 = (short)(var39 + var5.f((byte) -128));
                              var39 = var38;
                              this.field_a[var40] = (short)var36;
                              this.field_t[var40] = (short)var37;
                              this.field_J[var40] = (short)var38;
                              if (this.field_L < var36) {
                                this.field_L = var36;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            L24: {
                              if (var37 > this.field_L) {
                                this.field_L = var37;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            if (var38 <= this.field_L) {
                              break L22;
                            } else {
                              this.field_L = var38;
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                        L25: {
                          if (2 == var41) {
                            var37 = var38;
                            var38 = (short)(var5.f((byte) -128) + var39);
                            this.field_a[var40] = (short)var36;
                            var39 = var38;
                            this.field_t[var40] = (short)var37;
                            this.field_J[var40] = (short)var38;
                            if (this.field_L < var38) {
                              this.field_L = var38;
                              break L25;
                            } else {
                              break L25;
                            }
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (3 == var41) {
                            var36 = var38;
                            var38 = (short)(var39 + var5.f((byte) -128));
                            this.field_a[var40] = (short)var36;
                            var39 = var38;
                            this.field_t[var40] = (short)var37;
                            this.field_J[var40] = (short)var38;
                            if (this.field_L < var38) {
                              this.field_L = var38;
                              break L26;
                            } else {
                              break L26;
                            }
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if ((var41 ^ -1) == -5) {
                            var42 = var36;
                            var36 = var37;
                            var37 = var42;
                            var38 = (short)(var39 + var5.f((byte) -128));
                            this.field_a[var40] = (short)var36;
                            var39 = var38;
                            this.field_t[var40] = (short)var37;
                            this.field_J[var40] = (short)var38;
                            if (this.field_L >= var38) {
                              break L27;
                            } else {
                              this.field_L = var38;
                              break L27;
                            }
                          } else {
                            break L27;
                          }
                        }
                        var40++;
                        continue L14;
                      }
                    }
                  } else {
                    L28: {
                      this.field_A[var36] = (short)var5.d(param0 + -5352);
                      if (-2 == (var10 ^ -1)) {
                        L29: {
                          var37 = var6.h(255);
                          if ((var37 & 1 ^ -1) != -2) {
                            this.field_G[var36] = (byte) 0;
                            break L29;
                          } else {
                            this.field_G[var36] = (byte) 1;
                            var3_int = 1;
                            break L29;
                          }
                        }
                        if (-3 != (2 & var37 ^ -1)) {
                          this.field_g[var36] = (byte)-1;
                          this.field_r[var36] = (short)-1;
                          break L28;
                        } else {
                          this.field_g[var36] = (byte)(var37 >> -852499038);
                          this.field_r[var36] = this.field_A[var36];
                          this.field_A[var36] = (short)127;
                          if (0 != (this.field_r[var36] ^ -1)) {
                            var4 = 1;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      } else {
                        break L28;
                      }
                    }
                    L30: {
                      if (-256 != (var11 ^ -1)) {
                        break L30;
                      } else {
                        this.field_C[var36] = var7.c((byte) 92);
                        break L30;
                      }
                    }
                    L31: {
                      if (1 == var12) {
                        this.field_n[var36] = var8.c((byte) 87);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      if (1 != var13) {
                        break L32;
                      } else {
                        this.field_D[var36] = var9.h(255);
                        break L32;
                      }
                    }
                    var36++;
                    continue L13;
                  }
                }
              } else {
                L33: {
                  var37 = var5.h(255);
                  var38 = 0;
                  if (-1 == (var37 & 1 ^ -1)) {
                    break L33;
                  } else {
                    var38 = var6.f((byte) -128);
                    break L33;
                  }
                }
                L34: {
                  var39 = 0;
                  if ((var37 & 2) == 0) {
                    break L34;
                  } else {
                    var39 = var7.f((byte) -128);
                    break L34;
                  }
                }
                L35: {
                  var40 = 0;
                  if ((4 & var37) == 0) {
                    break L35;
                  } else {
                    var40 = var8.f((byte) -128);
                    break L35;
                  }
                }
                L36: {
                  this.field_b[var36] = var33 - -var38;
                  this.field_I[var36] = var39 + var34;
                  this.field_p[var36] = var40 + var35;
                  var35 = this.field_p[var36];
                  var34 = this.field_I[var36];
                  var33 = this.field_b[var36];
                  if (-2 == (var14 ^ -1)) {
                    this.field_l[var36] = var9.h(255);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                var36++;
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var3 = decompiledCaughtException;
            stackIn_115_0 = (RuntimeException) (var3);

            stackIn_115_1 = new StringBuilder().append("oc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "null";
              break L37;
            } else {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "{...}";
              break L37;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_116_0), stackIn_116_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    oc(byte[] param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_k = (byte) 0;
        this.field_L = 0;
        this.field_o = 0;
        this.field_F = 0;
        this.field_w = 12;
        this.field_E = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 != (param0[param0.length + -1] ^ -1)) {
                  break L2;
                } else {
                  if ((param0[param0.length + -2] ^ -1) != 0) {
                    break L2;
                  } else {
                    this.a(param0, 0);
                    break L1;
                  }
                }
              }
              this.a(5474, param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("oc.<init>(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    oc(oc[] param0, int param1) {
        byte dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        byte[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        byte[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        oc var13_ref_oc = null;
        int var14 = 0;
        oc var14_ref_oc = null;
        oc var15 = null;
        int var15_int = 0;
        int var16 = 0;
        jt var16_ref_jt = null;
        int var17 = 0;
        int var18 = 0;
        this.field_k = (byte) 0;
        this.field_L = 0;
        this.field_o = 0;
        this.field_F = 0;
        this.field_w = 12;
        this.field_E = 0;
        try {
          L0: {
            this.field_F = 0;
            this.field_o = 0;
            this.field_E = 0;
            var3_int = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            this.field_k = (byte) -1;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (param1 <= var12) {
                L2: {
                  if ((var4 ^ -1) >= -1) {
                    break L2;
                  } else {
                    this.field_e = new rga[var4];
                    break L2;
                  }
                }
                L3: {
                  if (var9 == 0) {
                    break L3;
                  } else {
                    this.field_g = new byte[this.field_o];
                    break L3;
                  }
                }
                L4: {
                  this.field_a = new short[this.field_o];
                  if (var10 == 0) {
                    break L4;
                  } else {
                    this.field_r = new short[this.field_o];
                    break L4;
                  }
                }
                L5: {
                  if (this.field_F <= 0) {
                    break L5;
                  } else {
                    this.field_v = new int[this.field_F];
                    this.field_z = new byte[this.field_F];
                    this.field_c = new int[this.field_F];
                    this.field_f = new int[this.field_F];
                    this.field_s = new short[this.field_F];
                    this.field_q = new short[this.field_F];
                    this.field_x = new int[this.field_F];
                    this.field_j = new int[this.field_F];
                    this.field_K = new short[this.field_F];
                    this.field_i = new byte[this.field_F];
                    this.field_d = new int[this.field_F];
                    this.field_u = new byte[this.field_F];
                    break L5;
                  }
                }
                L6: {
                  this.field_A = new short[this.field_o];
                  if (var7 == 0) {
                    break L6;
                  } else {
                    this.field_C = new byte[this.field_o];
                    break L6;
                  }
                }
                L7: {
                  this.field_I = new int[this.field_E];
                  this.field_p = new int[this.field_E];
                  this.field_y = new short[this.field_E];
                  this.field_h = new short[this.field_o];
                  this.field_J = new short[this.field_o];
                  this.field_b = new int[this.field_E];
                  if (var11 == 0) {
                    break L7;
                  } else {
                    this.field_D = new int[this.field_o];
                    break L7;
                  }
                }
                L8: {
                  this.field_l = new int[this.field_E];
                  if ((var5 ^ -1) >= -1) {
                    break L8;
                  } else {
                    this.field_m = new jt[var5];
                    break L8;
                  }
                }
                L9: {
                  this.field_t = new short[this.field_o];
                  if (var6 == 0) {
                    break L9;
                  } else {
                    this.field_G = new byte[this.field_o];
                    break L9;
                  }
                }
                L10: {
                  if (var8 == 0) {
                    break L10;
                  } else {
                    this.field_n = new byte[this.field_o];
                    break L10;
                  }
                }
                L11: {
                  if (-1 <= (var3_int ^ -1)) {
                    break L11;
                  } else {
                    this.field_B = new ava[var3_int];
                    break L11;
                  }
                }
                var3_int = 0;
                var5 = 0;
                var4 = 0;
                this.field_o = 0;
                this.field_F = 0;
                this.field_E = 0;
                var12 = 0;
                L12: while (true) {
                  if (param1 <= var12) {
                    var12 = 0;
                    this.field_L = this.field_E;
                    var13 = 0;
                    L13: while (true) {
                      if (param1 <= var13) {
                        break L0;
                      } else {
                        L14: {
                          var14 = (short)(1 << var13);
                          var15 = param0[var13];
                          if (var15 == null) {
                            break L14;
                          } else {
                            var16 = 0;
                            L15: while (true) {
                              if (var15.field_o <= var16) {
                                var16 = 0;
                                L16: while (true) {
                                  if (var15.field_F <= var16) {
                                    break L14;
                                  } else {
                                    L17: {
                                      dupTemp$0 = var15.field_u[var16];
                                      this.field_u[this.field_F] = dupTemp$0;
                                      var17 = dupTemp$0;
                                      if ((var17 ^ -1) != -1) {
                                        break L17;
                                      } else {
                                        this.field_s[this.field_F] = (short)this.a((int) var15.field_s[var16], (short) var14, var15, 1);
                                        this.field_q[this.field_F] = (short)this.a((int) var15.field_q[var16], (short) var14, var15, 1);
                                        this.field_K[this.field_F] = (short)this.a((int) var15.field_K[var16], (short) var14, var15, 1);
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if ((var17 ^ -1) > -2) {
                                        break L18;
                                      } else {
                                        if ((var17 ^ -1) < -4) {
                                          break L18;
                                        } else {
                                          this.field_s[this.field_F] = var15.field_s[var16];
                                          this.field_q[this.field_F] = var15.field_q[var16];
                                          this.field_K[this.field_F] = var15.field_K[var16];
                                          this.field_j[this.field_F] = var15.field_j[var16];
                                          this.field_f[this.field_F] = var15.field_f[var16];
                                          this.field_x[this.field_F] = var15.field_x[var16];
                                          this.field_i[this.field_F] = var15.field_i[var16];
                                          this.field_z[this.field_F] = var15.field_z[var16];
                                          this.field_d[this.field_F] = var15.field_d[var16];
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if ((var17 ^ -1) != -3) {
                                        break L19;
                                      } else {
                                        this.field_v[this.field_F] = var15.field_v[var16];
                                        this.field_c[this.field_F] = var15.field_c[var16];
                                        break L19;
                                      }
                                    }
                                    this.field_F = this.field_F + 1;
                                    var16++;
                                    continue L16;
                                  }
                                }
                              } else {
                                L20: {
                                  if (var9 == 0) {
                                    break L20;
                                  } else {
                                    L21: {
                                      L22: {
                                        incrementValue$1 = var12;
                                        var12++;
                                        stackIn_99_0 = this.field_g;

                                        stackIn_99_1 = incrementValue$1;

                                        if (null == var15.field_g) {
                                          break L22;
                                        } else {
                                          stackIn_99_0 = (byte[]) ((Object) stackIn_99_0);

                                          if ((var15.field_g[var16] ^ -1) == 0) {
                                            break L22;
                                          } else {
                                            stackIn_100_0 = (byte[]) ((Object) stackIn_99_0);
                                            stackIn_100_1 = stackIn_99_1;
                                            stackIn_100_2 = this.field_F + var15.field_g[var16];
                                            break L21;
                                          }
                                        }
                                      }
                                      stackIn_100_0 = (byte[]) ((Object) stackIn_99_0);
                                      stackIn_100_1 = stackIn_99_1;
                                      stackIn_100_2 = -1;
                                      break L21;
                                    }
                                    stackIn_100_0[stackIn_100_1] = (byte)stackIn_100_2;
                                    break L20;
                                  }
                                }
                                var16++;
                                continue L15;
                              }
                            }
                          }
                        }
                        var13++;
                        continue L13;
                      }
                    }
                  } else {
                    L23: {
                      var13 = (short)(1 << var12);
                      var14_ref_oc = param0[var12];
                      if (var14_ref_oc == null) {
                        break L23;
                      } else {
                        L24: {
                          if (var14_ref_oc.field_m == null) {
                            break L24;
                          } else {
                            var15_int = 0;
                            L25: while (true) {
                              if (var15_int >= var14_ref_oc.field_m.length) {
                                break L24;
                              } else {
                                var16_ref_jt = var14_ref_oc.field_m[var15_int];
                                incrementValue$2 = var5;
                                var5++;
                                this.field_m[incrementValue$2] = var16_ref_jt.a(9677, var16_ref_jt.field_a + this.field_o);
                                var15_int++;
                                continue L25;
                              }
                            }
                          }
                        }
                        var15_int = 0;
                        L26: while (true) {
                          if (var14_ref_oc.field_o <= var15_int) {
                            L27: {
                              if (null == var14_ref_oc.field_B) {
                                break L27;
                              } else {
                                var15_int = 0;
                                L28: while (true) {
                                  if (var14_ref_oc.field_B.length <= var15_int) {
                                    break L27;
                                  } else {
                                    var16 = this.a(var14_ref_oc.field_B[var15_int].field_a, (short) var13, var14_ref_oc, 1);
                                    var17 = this.a(var14_ref_oc.field_B[var15_int].field_c, (short) var13, var14_ref_oc, 1);
                                    var18 = this.a(var14_ref_oc.field_B[var15_int].field_b, (short) var13, var14_ref_oc, 1);
                                    this.field_B[var3_int] = var14_ref_oc.field_B[var15_int].a(0, var17, var18, var16);
                                    var3_int++;
                                    var15_int++;
                                    continue L28;
                                  }
                                }
                              }
                            }
                            if (null == var14_ref_oc.field_e) {
                              break L23;
                            } else {
                              var15_int = 0;
                              L29: while (true) {
                                if (var14_ref_oc.field_e.length <= var15_int) {
                                  break L23;
                                } else {
                                  var16 = this.a(var14_ref_oc.field_e[var15_int].field_a, (short) var13, var14_ref_oc, 1);
                                  this.field_e[var4] = var14_ref_oc.field_e[var15_int].a(0, var16);
                                  var4++;
                                  var15_int++;
                                  continue L29;
                                }
                              }
                            }
                          } else {
                            L30: {
                              if (var6 == 0) {
                                break L30;
                              } else {
                                if (null == var14_ref_oc.field_G) {
                                  break L30;
                                } else {
                                  this.field_G[this.field_o] = var14_ref_oc.field_G[var15_int];
                                  break L30;
                                }
                              }
                            }
                            L31: {
                              if (var7 == 0) {
                                break L31;
                              } else {
                                if (null != var14_ref_oc.field_C) {
                                  this.field_C[this.field_o] = var14_ref_oc.field_C[var15_int];
                                  break L31;
                                } else {
                                  this.field_C[this.field_o] = var14_ref_oc.field_k;
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              if (var8 == 0) {
                                break L32;
                              } else {
                                if (null == var14_ref_oc.field_n) {
                                  break L32;
                                } else {
                                  this.field_n[this.field_o] = var14_ref_oc.field_n[var15_int];
                                  break L32;
                                }
                              }
                            }
                            L33: {
                              if (var10 == 0) {
                                break L33;
                              } else {
                                if (null == var14_ref_oc.field_r) {
                                  this.field_r[this.field_o] = (short)-1;
                                  break L33;
                                } else {
                                  this.field_r[this.field_o] = var14_ref_oc.field_r[var15_int];
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (var11 == 0) {
                                break L34;
                              } else {
                                if (var14_ref_oc.field_D != null) {
                                  this.field_D[this.field_o] = var14_ref_oc.field_D[var15_int];
                                  break L34;
                                } else {
                                  this.field_D[this.field_o] = -1;
                                  break L34;
                                }
                              }
                            }
                            this.field_a[this.field_o] = (short)this.a((int) var14_ref_oc.field_a[var15_int], (short) var13, var14_ref_oc, 1);
                            this.field_t[this.field_o] = (short)this.a((int) var14_ref_oc.field_t[var15_int], (short) var13, var14_ref_oc, 1);
                            this.field_J[this.field_o] = (short)this.a((int) var14_ref_oc.field_J[var15_int], (short) var13, var14_ref_oc, 1);
                            this.field_h[this.field_o] = (short)var13;
                            this.field_A[this.field_o] = var14_ref_oc.field_A[var15_int];
                            this.field_o = this.field_o + 1;
                            var15_int++;
                            continue L26;
                          }
                        }
                      }
                    }
                    var12++;
                    continue L12;
                  }
                }
              } else {
                L35: {
                  var13_ref_oc = param0[var12];
                  if (var13_ref_oc == null) {
                    break L35;
                  } else {
                    L36: {
                      this.field_E = this.field_E + var13_ref_oc.field_E;
                      this.field_o = this.field_o + var13_ref_oc.field_o;
                      this.field_F = this.field_F + var13_ref_oc.field_F;
                      if (var13_ref_oc.field_e == null) {
                        break L36;
                      } else {
                        var4 = var4 + var13_ref_oc.field_e.length;
                        break L36;
                      }
                    }
                    L37: {
                      if (null == var13_ref_oc.field_m) {
                        break L37;
                      } else {
                        var5 = var5 + var13_ref_oc.field_m.length;
                        break L37;
                      }
                    }
                    L38: {
                      if (null == var13_ref_oc.field_B) {
                        break L38;
                      } else {
                        var3_int = var3_int + var13_ref_oc.field_B.length;
                        break L38;
                      }
                    }
                    L39: {
                      stackIn_12_0 = var6;

                      if (null == var13_ref_oc.field_G) {
                        stackIn_13_0 = stackIn_12_0;
                        stackIn_13_1 = 0;
                        break L39;
                      } else {
                        stackIn_13_0 = stackIn_12_0;
                        stackIn_13_1 = 1;
                        break L39;
                      }
                    }
                    L40: {
                      var6 = stackIn_13_0 | stackIn_13_1;
                      stackIn_15_0 = var11;

                      if (null == var13_ref_oc.field_D) {
                        stackIn_16_0 = stackIn_15_0;
                        stackIn_16_1 = 0;
                        break L40;
                      } else {
                        stackIn_16_0 = stackIn_15_0;
                        stackIn_16_1 = 1;
                        break L40;
                      }
                    }
                    L41: {
                      var11 = stackIn_16_0 | stackIn_16_1;
                      if (null == var13_ref_oc.field_C) {
                        L42: {
                          if ((this.field_k ^ -1) != 0) {
                            break L42;
                          } else {
                            this.field_k = var13_ref_oc.field_k;
                            break L42;
                          }
                        }
                        if (this.field_k == var13_ref_oc.field_k) {
                          break L41;
                        } else {
                          var7 = 1;
                          break L41;
                        }
                      } else {
                        var7 = 1;
                        break L41;
                      }
                    }
                    L43: {
                      stackIn_24_0 = var8;

                      if (null == var13_ref_oc.field_n) {
                        stackIn_25_0 = stackIn_24_0;
                        stackIn_25_1 = 0;
                        break L43;
                      } else {
                        stackIn_25_0 = stackIn_24_0;
                        stackIn_25_1 = 1;
                        break L43;
                      }
                    }
                    L44: {
                      var8 = stackIn_25_0 | stackIn_25_1;
                      stackIn_27_0 = var10;

                      if (null == var13_ref_oc.field_r) {
                        stackIn_28_0 = stackIn_27_0;
                        stackIn_28_1 = 0;
                        break L44;
                      } else {
                        stackIn_28_0 = stackIn_27_0;
                        stackIn_28_1 = 1;
                        break L44;
                      }
                    }
                    L45: {
                      var10 = stackIn_28_0 | stackIn_28_1;
                      stackIn_30_0 = var9;

                      if (null == var13_ref_oc.field_g) {
                        stackIn_31_0 = stackIn_30_0;
                        stackIn_31_1 = 0;
                        break L45;
                      } else {
                        stackIn_31_0 = stackIn_30_0;
                        stackIn_31_1 = 1;
                        break L45;
                      }
                    }
                    var9 = stackIn_31_0 | stackIn_31_1;
                    break L35;
                  }
                }
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L46: {
            var3 = decompiledCaughtException;
            stackIn_116_0 = (RuntimeException) (var3);

            stackIn_116_1 = new StringBuilder().append("oc.<init>(");

            if (param0 == null) {
              stackIn_117_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "null";
              break L46;
            } else {
              stackIn_117_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackIn_117_2 = "{...}";
              break L46;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_117_0), stackIn_117_2 + ',' + param1 + ')');
        }
    }

    static {
        field_H = new su(15, 0, 1, 0);
    }
}
