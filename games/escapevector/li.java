/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.Vector;

final class li {
    private int field_B;
    private int field_f;
    static int[] field_u;
    private int field_K;
    static ed field_r;
    private oe field_n;
    static String field_p;
    private int field_H;
    private cn field_C;
    static String field_O;
    private sa field_D;
    private int[] field_w;
    private int field_N;
    private int field_a;
    private int field_t;
    private int field_y;
    private int[] field_e;
    boolean field_L;
    private int field_g;
    private wd field_j;
    private int field_x;
    private boolean[] field_s;
    int field_v;
    private int field_J;
    private int field_m;
    int field_c;
    private int field_q;
    private int[] field_o;
    private int field_l;
    boolean field_d;
    private pe field_M;
    private int field_b;
    private int field_F;
    private boolean field_I;
    private int field_G;
    private int field_k;
    private pe field_z;
    private int field_i;
    private boolean field_E;
    private int field_h;
    private int field_A;

    private final void f(int param0, int param1, int param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        if (param0 <= 85) {
            return;
        }
        int var4 = this.field_n.field_Mb * this.field_v;
        int var5 = this.field_v * this.field_n.field_D;
        int var6 = (this.field_f + -var4) / 2;
        int var7 = (-var5 + this.field_H) / 2;
        this.a(var6, (byte) 104, var5, var4, var7);
        var7 = var7 + param1;
        var6 = var6 + param2;
        for (var8 = 0; var8 < this.field_n.field_D; var8++) {
            for (var9 = 0; this.field_n.field_Mb > var9; var9++) {
                this.b(var9, (byte) 99, var7 - -(this.field_v * var8), this.field_v * var9 + var6, var8);
            }
        }
    }

    private final boolean[] a(int[] param0, int param1, int param2, byte param3) {
        boolean[] stackIn_9_0 = null;
        boolean[] stackIn_12_0 = null;
        boolean[] stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (null == this.field_s) {
                  this.field_s = new boolean[param1 * param2];
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0 != this.field_w) {
                this.field_s = this.a(0, this.field_s);
                if (param3 >= 104) {
                  var5_int = this.field_B / param1;
                  var6 = this.field_N / param2;
                  var7 = 0;
                  L2: while (true) {
                    if (param2 <= var7) {
                      stackIn_30_0 = this.field_s;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var8 = var7 * var6;
                      var9 = param1 * var7;
                      var10 = 0;
                      L3: while (true) {
                        if (param1 <= var10) {
                          var7++;
                          continue L2;
                        } else {
                          var11 = var10 * var5_int;
                          var12 = 0;
                          L4: while (true) {
                            L5: {
                              if (var6 <= var12) {
                                break L5;
                              } else {
                                var13 = var8 - -var12;
                                if ((this.field_N ^ -1) < (var13 ^ -1)) {
                                  var14 = param0[var13];
                                  var15 = var10 + var9;
                                  var16 = 0;
                                  L6: while (true) {
                                    L7: {
                                      if (var5_int <= var16) {
                                        break L7;
                                      } else {
                                        var17 = var16 + var11;
                                        if (var17 < this.field_B) {
                                          this.field_s[var15] = df.a(this.field_s[var15], this.c(var14, var17, -2));
                                          var16++;
                                          continue L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var12++;
                                    continue L4;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var10++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  stackIn_12_0 = (boolean[]) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_9_0 = this.g(0);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("li.IA(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_30_0;
          }
        }
    }

    final void a(sa param0, int param1) {
        hg var3 = null;
        sa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (1 != param0.field_n) {
                  break L1;
                } else {
                  this.field_D = null;
                  break L1;
                }
              }
              if (this.field_C.a(param1 ^ -4348)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == 4236) {
                  var3 = this.field_C.a(false);
                  L2: while (true) {
                    if (var3 == null) {
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var4 = (sa) ((Object) var3);
                      if (var4.field_j == param0.field_j) {
                        var4.c((byte) -60);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var3 = this.field_C.b((byte) 70);
                        continue L2;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("li.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final ed a(int param0, int param1) {
        ih var3 = fh.field_g;
        int var4 = var3.field_r - -var3.field_x;
        int var5 = var4 / 2;
        int var6 = (-var5 + var4) / 2;
        if (param1 != -5425) {
            this.a(85, false, 28, 3);
        }
        ed var7 = new ed(var4, var4);
        var7.g();
        em.a(var6, var6, var5, var5, param0);
        md.field_D.a(param1 + 5535);
        return var7;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        this.f(98, param1, param2);
        this.a(false, param1, param2);
        this.d(param1, param2, 109);
        this.b(89, param1, param2);
        if (param3 != 4) {
            this.a(-104, 44, -51, -65, 36, -11, -3);
        }
        if (param0) {
            this.e(-124, param1, param2);
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = em.field_i[param3];
        int var6 = 16711680;
        int var7 = 16;
        int var8 = 65280;
        int var9 = 8;
        int var10 = 255;
        int var11 = 0;
        int var12 = this.a(var6, param0, 256, param2, var5, var7);
        int var13 = this.a(var8, param0, 256, param2, var5, var9);
        int var14 = this.a(var10, param0, 256, param2, var5, var11);
        int var15 = 0;
        var15 = var15 | var6 & var12 << var7;
        var15 = var15 | var13 << var9 & var8;
        if (param1) {
            return;
        }
        var15 = var15 | var14 << var11 & var10;
        em.field_i[param3] = var15;
    }

    public static void a(int param0) {
        field_u = null;
        field_p = null;
        field_O = null;
        int var1 = 30 / ((param0 - -2) / 47);
        field_r = null;
    }

    private final void e(int param0) {
        int discarded$0 = 0;
        int var2 = (this.field_f - this.field_j.a(true)) / 2;
        int var3 = (this.field_f - this.field_v * this.field_n.field_Mb) / 2;
        int var4 = this.field_n.field_Mb * this.field_v;
        if (param0 <= 118) {
            discarded$0 = this.a(28, -44, (byte) -72, -60, -37, 49, -114);
        }
        int var5 = 8;
        int var6 = var5 + var3 + var4;
        int var7 = var6 - var2;
        this.field_j.a((byte) -93, var7);
    }

    final boolean b(byte param0) {
        if (param0 >= -101) {
            return true;
        }
        return this.field_I;
    }

    final void b(int param0, boolean param1, int param2, int param3) {
        if (!this.field_I) {
            return;
        }
        if (!(!this.field_L)) {
            em.b(0, 0, this.field_f, this.field_H);
        }
        this.a(param2, -32279, param0);
        if (!this.field_E) {
            this.a(param1, param0, param2, param3 ^ 4);
            return;
        }
        int var5 = this.field_n.field_Mb * this.field_v;
        int var6 = this.f(56);
        int var7 = var6 - var5;
        if (param3 > var6) {
            this.a(param1, param0, -var6 + param2, 4);
            this.a(param1, param0, param2 + -var7, 4);
        } else {
            this.a(param1, param0, var7 + param2, 4);
            this.a(param1, param0, var6 + param2, param3 + 4);
        }
    }

    private final tc[] a(cn param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        tc[] var4 = null;
        int var5 = 0;
        hg var6 = null;
        tc var7 = null;
        int var8 = 0;
        tc[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.c((byte) 62);
            var4 = new tc[var3_int];
            var5 = param1;
            var6 = param0.a(false);
            L1: while (true) {
              if (var6 == null) {
                stackIn_5_0 = (tc[]) (var4);
                break L0;
              } else {
                var7 = (tc) ((Object) var6);
                incrementValue$1 = var5;
                var5++;
                var4[incrementValue$1] = var7;
                var6 = param0.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("li.K(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    private final int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = (param5 & param4) >>> param0;
        int var9 = (param4 & param3) >>> param0;
        int var10 = -var8 + var9;
        if (!((param6 ^ -1) < -2)) {
            return var8;
        }
        int var11 = var8 + var10 * param1 / (-1 + param6);
        if (param2 <= 117) {
            this.f(-52, -118, -38);
        }
        return var11;
    }

    private final int d(byte param0) {
        int var2 = 1;
        int var3 = this.field_a / this.field_n.field_Mb;
        int var4 = this.field_K / this.field_n.field_D;
        if (param0 > -98) {
            this.c((byte) 81);
        }
        var2 = var3;
        if (!(var4 >= var3)) {
            var2 = var4;
        }
        return var2;
    }

    private final int[] a(int[] param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_6_0 = null;
        int[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              var4_int = this.field_v * param1;
              if (var4_int >= 0) {
                L1: {
                  if (param2) {
                    break L1;
                  } else {
                    this.field_L = false;
                    break L1;
                  }
                }
                var5 = 0;
                var6 = var4_int;
                L2: while (true) {
                  if (var5 >= this.field_o.length) {
                    stackIn_16_0 = this.field_o;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L3: {
                      if (this.field_e.length > var6) {
                        this.field_o[var5] = this.field_e[var6];
                        break L3;
                      } else {
                        this.field_o[var5] = this.field_e[this.field_e.length + -1];
                        break L3;
                      }
                    }
                    var5++;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("li.W(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_6_0);
        } else {
          return stackIn_16_0;
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.a(param4, (byte) -119, param5, param0);
        int var8 = this.a(param3, (byte) -119, param5, param0);
        int var9 = -param1 + param2;
        int var10 = param1;
        int var11 = var7 * var9 + var8 * var10 >> 1332510024;
        return var11;
    }

    private final void a(int[] param0, int param1, int param2, int param3, boolean[] param4, int param5, byte param6, int param7, int param8) {
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
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
        var25 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (-1 < (param3 ^ -1)) {
                break L1;
              } else {
                if ((param3 ^ -1) < -257) {
                  break L1;
                } else {
                  L2: {
                    if (param6 < -62) {
                      break L2;
                    } else {
                      this.a(false);
                      break L2;
                    }
                  }
                  var10_int = param8 * this.field_f + param2;
                  if ((var10_int ^ -1) > -1) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L3: {
                      if (param0 == null) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = 1;
                        break L3;
                      }
                    }
                    var11 = stackIn_13_0;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= param7) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L5: {
                          var13 = var12 + param8;
                          if (this.field_M.field_a > var13) {
                            break L5;
                          } else {
                            if (var13 >= this.field_z.field_a) {
                              break L5;
                            } else {
                              L6: {
                                var14 = param1 * var12;
                                var15 = var12 * this.field_f + var10_int;
                                var16 = param5;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  var16 = param0[var12];
                                  break L6;
                                }
                              }
                              L7: {
                                var17 = 0;
                                if (var11 != 0) {
                                  L8: {
                                    if (var13 % this.field_i != 0) {
                                      stackIn_24_0 = 0;
                                      break L8;
                                    } else {
                                      stackIn_24_0 = 1;
                                      break L8;
                                    }
                                  }
                                  var17 = stackIn_24_0;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var18 = 0;
                              L9: while (true) {
                                if (var18 >= param1) {
                                  break L5;
                                } else {
                                  L10: {
                                    var19 = param2 - -var18;
                                    if (this.field_M.field_b > var19) {
                                      break L10;
                                    } else {
                                      if (var19 >= this.field_z.field_b) {
                                        break L10;
                                      } else {
                                        var20 = var15 + var18;
                                        if (var20 < 0) {
                                          break L10;
                                        } else {
                                          if (em.field_i.length <= var20) {
                                            break L10;
                                          } else {
                                            L11: {
                                              var21 = var14 + var18;
                                              var22 = 1;
                                              if (param4 == null) {
                                                break L11;
                                              } else {
                                                var22 = param4[var21] ? 1 : 0;
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              var23 = param5;
                                              if (var22 != 0) {
                                                var23 = var16;
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              var24 = 0;
                                              if (var11 == 0) {
                                                break L13;
                                              } else {
                                                if (var17 != 0) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (0 != var19 % this.field_h) {
                                                      stackIn_41_0 = 0;
                                                      break L14;
                                                    } else {
                                                      stackIn_41_0 = 1;
                                                      break L14;
                                                    }
                                                  }
                                                  var24 = stackIn_41_0;
                                                  break L13;
                                                }
                                              }
                                            }
                                            L15: {
                                              if (var22 == 0) {
                                                break L15;
                                              } else {
                                                L16: {
                                                  if (var24 != 0) {
                                                    break L16;
                                                  } else {
                                                    if (var17 == 0) {
                                                      break L15;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                var23 = this.field_A;
                                                break L15;
                                              }
                                            }
                                            if (param3 == 256) {
                                              em.field_i[var20] = var23;
                                              break L10;
                                            } else {
                                              this.a(param3, false, var23, var20);
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var18++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var10 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var10);

            stackIn_55_1 = new StringBuilder().append("li.T(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L17;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L18;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), stackIn_59_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (!(this.field_d)) {
            return;
        }
        int var6 = param3 + param0;
        int var7 = param2 + param4;
        int var8 = 6;
        fk.a(var6 - -var8, this.field_F, 73, 0, this.field_g, -var8 + param4, param0 - var8, 0, var7 - -var8);
        ih var9 = fh.field_g;
        int var10 = var9.field_x + var9.field_r;
        if (param1 != 104) {
            this.field_E = false;
        }
        int var11 = -var8 + (param4 - (var10 - -var9.field_x));
        int var12 = 15658734;
        String var13 = null == this.field_D ? sj.field_k : af.field_b;
        var9.c(var13, this.field_f / 2, var11, var12, -1);
        this.d(111);
    }

    private final void d(int param0) {
        if (!(this.field_j != null)) {
            return;
        }
        int var3 = -40 / ((param0 - -5) / 37);
        int var2 = (this.field_H - this.field_v * this.field_n.field_D) / 2;
        int var4 = this.field_v * this.field_n.field_D;
        int var5 = this.field_j.b((byte) -90);
        int var6 = (-var5 + var4) / 2 + var2;
        this.field_j.a(var6, 3);
    }

    private final boolean c(int param0, int param1, int param2) {
        if (param2 != -2) {
            this.field_f = -61;
        }
        return 0 != (1 << param1 & param0) ? true : false;
    }

    private final void b(int param0, int param1, int param2) {
        sa var7 = null;
        int var8 = EscapeVector.field_A;
        cn var4 = this.field_n.field_k;
        if (var4 == null) {
            return;
        }
        if (var4.a(-116)) {
            return;
        }
        int var5 = this.a((byte) -29, this.field_x);
        hg var6 = var4.a(false);
        while (var6 != null) {
            var7 = (sa) ((Object) var6);
            if (var7.field_r) {
                this.a(param2, var7.field_k, this.field_l, var5, param1, var7.field_g, 4);
            }
            var6 = var4.b((byte) 70);
        }
        if (param0 < 40) {
            this.field_e = (int[]) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        sa var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        if (this.field_C.a(-103)) {
            return;
        }
        hg var4 = this.field_C.a(false);
        if (param2 < 35) {
            this.c((byte) 4);
        }
        while (var4 != null) {
            var5 = (sa) ((Object) var4);
            var6 = this.a((byte) -29, this.field_m);
            this.a(param1, var5.field_k, this.field_G, var6, param0, var5.field_g, 4);
            var4 = this.field_C.b((byte) 70);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = (this.field_f + -(this.field_n.field_Mb * this.field_v)) / 2;
        int var9 = (this.field_H + -(this.field_v * this.field_n.field_D)) / 2;
        int var10 = param1 * this.field_v / this.field_B;
        int var11 = this.field_v * param5 / this.field_N;
        int var12 = var8 + var10;
        if (param6 != 4) {
            this.field_n = (oe) null;
        }
        int var13 = var11 + var9;
        int var14 = this.field_v * this.field_t;
        var14 = 20 < var14 ? 20 : var14;
        int var15 = var14;
        int var16 = var14;
        this.a((int[]) null, var15, var12 + param0, param3, (boolean[]) null, param2, (byte) -72, var16, var13 - -param4);
    }

    private final void c(byte param0) {
        ih var2 = fh.field_g;
        int var3 = 16777215;
        int var4 = 16777215;
        if (param0 != -112) {
            this.field_b = 95;
        }
        this.field_j.a(var4, var2, var3, 125);
    }

    private final String[] b(cn param0, int param1) {
        int discarded$2 = 0;
        int incrementValue$3 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        hg var6 = null;
        sj var7 = null;
        int var8 = 0;
        String[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.c((byte) 73);
            var4 = new String[var3_int];
            var5 = 0;
            var6 = param0.a(false);
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param1 == 11125) {
                    break L2;
                  } else {
                    discarded$2 = this.a(54, -100, (byte) 126, 78, 66, 10, 81);
                    break L2;
                  }
                }
                stackIn_7_0 = (String[]) (var4);
                break L0;
              } else {
                var7 = (sj) ((Object) var6);
                incrementValue$3 = var5;
                var5++;
                var4[incrementValue$3] = var7.field_g;
                var6 = param0.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("li.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void b(int param0) {
        int discarded$0 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        this.field_o = new int[this.field_v];
        if (param0 != 100) {
            discarded$0 = this.a(76, (byte) -11, -116, -105);
        }
        int var2 = this.field_n.field_D * this.field_v;
        this.field_e = new int[var2];
        for (var3 = 0; var3 < this.field_e.length; var3++) {
            var4 = this.a(16, var3, (byte) 122, this.field_k, 16711680, this.field_b, this.field_e.length);
            var5 = this.a(8, var3, (byte) 120, this.field_k, 65280, this.field_b, this.field_e.length);
            var6 = this.a(0, var3, (byte) 118, this.field_k, 255, this.field_b, this.field_e.length);
            var7 = 16770546 & var4 << -1211673040;
            var7 = var7 | (-1442840321 & var5) << 407970600;
            var7 = var7 | 255 & var6;
            this.field_e[var3] = var7;
        }
    }

    final void a(byte param0) {
        this.b(0, true, 0, 0);
        if (param0 != -120) {
            li.a(80);
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = this.field_c;
        var3 = var3 % param1;
        param1 = param1 / 2;
        int var4 = param1 <= var3 ? 1 : 0;
        if (!(var4 == 0)) {
            var3 = var3 - param1;
        }
        if (param0 != -29) {
            this.field_e = (int[]) null;
        }
        if (var4 != 0) {
            return var3 * 255 / param1;
        }
        return -(255 * var3 / param1) + 255;
    }

    final void e(byte param0) {
        if (param0 != -101) {
            return;
        }
        this.field_I = !this.field_I ? true : false;
    }

    private final boolean[] g(int param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        for (var2 = param0; this.field_s.length > var2; var2++) {
            this.field_s[var2] = true;
        }
        return this.field_s;
    }

    private final void c(int param0) {
        Vector var2;
        int var3;
        int var4;
        sa var5;
        int var7;
        int var6;
        var7 = EscapeVector.field_A;
        if (this.field_n == null) {
          return;
        } else {
          var2 = this.field_n.field_kb;
          var3 = var2.size();
          var4 = param0;
          L0: while (true) {
            if (var3 <= var4) {
              return;
            } else {
              var5 = (sa) (var2.elementAt(var4));
              if (var5 != null) {
                L1: {
                  var6 = var5.field_n;
                  if (mf.a(var6, -64)) {
                    break L1;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      if ((var6 ^ -1) == -6) {
                        break L1;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                }
                if (-2 != (var6 ^ -1)) {
                  this.field_C.a(param0 + -12328, var5);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    private final int f(int param0) {
        int var2 = this.field_n.field_Mb * this.field_v;
        int var3 = var2 / 2;
        int var4 = this.field_n.field_t >> -18590128;
        var4 = this.field_v * var4 / this.field_B;
        int var5 = 1 + var3 + -var4;
        if (param0 < 24) {
            return 24;
        }
        return var5;
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = this.field_n.field_H >> -470045104;
        if (param0 > -117) {
            return;
        }
        int var5 = this.field_n.field_p >> 1830333776;
        this.a(param2, var4, this.field_y, 256, param1, var5, 4);
    }

    private final void a(int param0, int param1, int param2) {
        ed discarded$0 = null;
        int var4 = this.field_n.field_Mb * this.field_v;
        int var5 = this.field_n.field_D * this.field_v;
        if (param1 != -32279) {
            discarded$0 = this.a(91, -67);
        }
        int var6 = (this.field_f - var4) / 2 - -param0;
        int var7 = var4 + var6;
        int var8 = (this.field_H - var5) / 2 - -param2;
        int var9 = var8 - -var5;
        this.field_M.field_a = var8;
        this.field_M.field_b = var6;
        this.field_z.field_b = var7;
        this.field_z.field_a = var9;
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        ed discarded$0 = null;
        if (param1 != -119) {
            discarded$0 = this.a(118, -21);
        }
        return (param3 & param0) >> param2;
    }

    private final boolean[] a(int param0, boolean[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        boolean[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0;
            L1: while (true) {
              if (param1.length <= var3_int) {
                stackIn_5_0 = (boolean[]) (param1);
                break L0;
              } else {
                param1[var3_int] = false;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("li.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(boolean param0, int param1, int param2) {
        boolean[] discarded$0 = null;
        if (param0) {
            boolean[] var5 = (boolean[]) null;
            discarded$0 = this.a(122, (boolean[]) null);
        }
        if (null == this.field_D) {
            return;
        }
        if (this.field_n.field_ec) {
            return;
        }
        int var4 = this.a((byte) -29, this.field_J);
        this.a(param2, this.field_D.field_k, this.field_q, var4, param1, this.field_D.field_g, 4);
    }

    private final void a(boolean param0) {
        String var2;
        cn var3;
        cn var4;
        cn var5;
        var2 = sf.field_n;
        var3 = new cn();
        var4 = new cn();
        var3.a(-12328, new sj(qj.field_d));
        if (param0) {
          L0: {
            var4.a(-12328, new tc(new ed[]{this.a(this.field_y, -5425)}, 0));
            if (null != this.field_D) {
              var3.a(-12328, new sj(gk.field_b));
              var4.a(-12328, new tc(new ed[]{this.a(this.field_q, -5425)}, 0));
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = this.field_n.field_k;
            if (var5 == null) {
              break L1;
            } else {
              if (var5.a(-103)) {
                break L1;
              } else {
                var3.a(-12328, new sj(wd.field_q));
                var4.a(-12328, new tc(new ed[]{this.a(this.field_l, -5425)}, 0));
                break L1;
              }
            }
          }
          L2: {
            if (this.field_C == null) {
              break L2;
            } else {
              if (this.field_C.a(-111)) {
                break L2;
              } else {
                var3.a(-12328, new sj(vb.field_a));
                var4.a(-12328, new tc(new ed[]{this.a(this.field_G, -5425)}, 0));
                break L2;
              }
            }
          }
          this.field_j = new wd(var2, this.a(var4, 0), this.b(var3, 11125));
          this.c((byte) -112);
          this.e(126);
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, byte param1, int param2, int param3, int param4) {
        int[] var8 = null;
        int[] var9 = null;
        boolean[] var10 = null;
        if (param1 <= 60) {
            return;
        }
        int[][] var11 = this.field_n.field_V;
        int[][] var6 = var11;
        int var7 = param4 * this.field_n.field_Mb - -param0;
        if (!(var11 != null)) {
            return;
        }
        if (var7 >= 0) {
            if (var11.length <= var7) {
                return;
            }
            var8 = var11[var7];
            var9 = this.a(var8, param4, true);
            var10 = this.a(var8, this.field_v, this.field_v, (byte) 109);
            this.a(var9, this.field_v, param3, 256, var10, this.field_F, (byte) -99, this.field_v, param2);
            return;
        }
    }

    li(oe param0, sa param1, boolean param2) {
        this.field_B = 32;
        this.field_w = si.field_v;
        this.field_f = 640;
        this.field_K = 349;
        this.field_H = 480;
        this.field_N = 32;
        this.field_a = 402;
        this.field_C = new cn();
        this.field_L = true;
        this.field_g = 4755528;
        this.field_y = 15658734;
        this.field_m = 100;
        this.field_c = 0;
        this.field_J = 100;
        this.field_t = 2;
        this.field_v = 1;
        this.field_d = true;
        this.field_I = false;
        this.field_q = 16711680;
        this.field_x = 100;
        this.field_l = 16711680;
        this.field_F = 1;
        this.field_k = 998158;
        this.field_G = 16776960;
        this.field_b = 3568436;
        this.field_M = new pe(0, 0);
        this.field_z = new pe(this.field_f, this.field_H);
        this.field_i = 4;
        this.field_h = 4;
        this.field_A = 1138193;
        try {
            this.field_D = param1;
            this.field_E = param2 ? true : false;
            this.field_n = param0;
            this.c(0);
            this.field_v = this.d((byte) -105);
            this.b(100);
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_u = new int[8192];
        field_p = "Rock Buster";
        field_O = "Back";
    }
}
