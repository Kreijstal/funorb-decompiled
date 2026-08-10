/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kb {
    static cj field_n;
    th field_K;
    static String field_w;
    fc field_h;
    int field_l;
    int[] field_v;
    int field_F;
    int[] field_d;
    boolean field_c;
    int field_f;
    int field_C;
    private hk[] field_k;
    boolean field_i;
    int field_t;
    int[] field_m;
    th field_s;
    long[] field_e;
    static String field_p;
    int[] field_o;
    static String field_q;
    int field_r;
    int[] field_z;
    th field_G;
    int field_H;
    th field_A;
    int field_j;
    int[][] field_D;
    int field_g;
    int[] field_a;
    int[] field_J;
    String[] field_b;
    int field_I;
    static String field_E;
    th field_u;
    static cj field_x;
    int[] field_y;
    static String field_B;

    final static void a(int param0, int param1, ja[] param2, int param3, ja[] param4, fm param5, int param6, int param7, int param8, int param9, ja[] param10, byte param11, int param12, int param13, int param14) {
        int var16 = 0;
        int var15_int = param5.field_J + param5.field_r;
        if (param11 >= -114) {
            return;
        }
        try {
            var16 = param5.field_J;
            em.a(param14, param8, 2, param3, var15_int, param10, param13, param1, param5, param7, param12, 480, var16, param4, param0, param5, param2, var16, param9, var15_int, param6);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final boolean b(byte param0, int param1, int param2) {
        if (param2 < 0) {
            return false;
        }
        if (param0 > -61) {
            this.b(103, -2);
        }
        return (1L << param1 & this.field_e[param2] ^ -1L) != -1L ? true : false;
    }

    final int a(int param0) {
        if (param0 != -16777216) {
            return 30;
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        return fieldTemp$0;
    }

    final int a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
            return -15;
        }
        return g.a(param1, param0, this.b((byte) -81, 59, param2), this.b((byte) -92, 56, param2));
    }

    public static void b(int param0) {
        field_p = null;
        field_B = null;
        if (param0 != -6) {
            ja[] var2 = (ja[]) null;
            kb.a(-39, -50, (ja[]) null, -9, (ja[]) null, (fm) null, -54, 88, -18, -27, (ja[]) null, (byte) -4, -116, -58, 27);
        }
        field_E = null;
        field_n = null;
        field_q = null;
        field_w = null;
        field_x = null;
    }

    final th a(byte param0) {
        if (param0 < 108) {
            return (th) null;
        }
        return this.field_K;
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = param2;
        if (this.b((byte) -66, 58, param1)) {
            var4 = var4 + param2 / 2;
        }
        if (param0 != 32) {
            this.field_C = 122;
        }
        if (!(!this.b((byte) -101, 57, param1))) {
            var4 = var4 + param2;
        }
        return var4;
    }

    final void a(byte param0, int param1) {
        if (param0 != -110) {
            this.a(-88, true);
        }
        this.field_c = true;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + we.a((byte) -73, "%0a", param1, "\n"));
        if (param0 != 2) {
            field_n = (cj) null;
        }
    }

    final boolean b(int param0, int param1) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_u = (th) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.b((byte) -83, 45, param1)) {
              break L2;
            } else {
              L3: {
                if (!this.b((byte) -83, 46, param1)) {
                  break L3;
                } else {
                  if ((hp.a((byte) 7, g.field_a, 100) ^ -1) <= -41) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_8_0 = 0;
              break L1;
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final id a(int param0, byte param1) {
        id var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (id) ((Object) this.field_K.c(param1 ^ 27));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param1 == 33) {
                break L1;
              } else {
                this.field_A = (th) null;
                break L1;
              }
            }
            var3 = (id) ((Object) this.field_u.c(47));
            L2: while (true) {
              if (var3 != null) {
                if (param0 != var3.field_y) {
                  var3 = (id) ((Object) this.field_u.b(param1 + -27));
                  continue L2;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          } else {
            if (var3.field_y == param0) {
              return var3;
            } else {
              var3 = (id) ((Object) this.field_K.b(6));
              continue L0;
            }
          }
        }
    }

    final void a(int param0, k param1) {
        int dupTemp$0 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jj stackIn_21_0;
        jj stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        jj stackIn_22_0;
        jj stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_22_5;
        int stackIn_22_6;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wb var10 = null;
        cg var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17 = 0;
        String var18 = null;
        gm var19 = null;
        jj var20 = null;
        ce var21 = null;
        var16 = null;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_H = param1.c((byte) -18);
              stackIn_3_0 = this;

              if (0 == param1.g(param0 ^ 31367)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((kb) (this)).field_i = stackIn_4_1 != 0;
              this.field_C = param1.d((byte) 69);
              this.field_I = param1.d((byte) 69);
              this.field_g = param1.d((byte) 69);
              this.field_l = param1.g(31365);
              if (param0 == 2) {
                break L2;
              } else {
                var18 = (String) null;
                kb.a(51, (String) null);
                break L2;
              }
            }
            var3_int = 0;
            L3: while (true) {
              if (var3_int >= this.field_t) {
                L4: while (true) {
                  dupTemp$0 = param1.g(31365);
                  var3_int = dupTemp$0;
                  if (dupTemp$0 == 0) {
                    break L0;
                  } else {
                    L5: {
                      var4 = null;
                      var5 = param1.g(31365);
                      var6 = param1.d((byte) 69);
                      var7 = param1.d((byte) 69);
                      var8 = param1.d((byte) 69);
                      var8 = 255 & var8 | var8 << 2063955664 & -16777216;
                      var14 = var3_int;
                      if (-2 == (var14 ^ -1)) {
                        var9 = (byte)(3 & var8 >>> -112407074);
                        var8 = var8 & 1073741823;
                        var10 = new wb(var6, var7, var8);
                        var10.field_Lb = var9;
                        var4 = var10;
                        this.field_m[var9] = this.field_m[var9] + 1;
                        break L5;
                      } else {
                        if (var14 == 2) {
                          var19 = pg.a(var6, (byte) -83, var8, var7);
                          var19 = var19;
                          break L5;
                        } else {
                          if (3 == var14) {
                            L6: {
                              stackIn_21_0 = null;

                              stackIn_21_1 = null;

                              stackIn_21_2 = var6;

                              stackIn_21_3 = var7;

                              stackIn_21_4 = var8 & 1;

                              stackIn_21_5 = 3 & var8 >>> 1525576830;

                              if ((536870912 & var8) == 0) {
                                stackIn_22_0 = null;
                                stackIn_22_1 = null;
                                stackIn_22_2 = stackIn_21_2;
                                stackIn_22_3 = stackIn_21_3;
                                stackIn_22_4 = stackIn_21_4;
                                stackIn_22_5 = stackIn_21_5;
                                stackIn_22_6 = 0;
                                break L6;
                              } else {
                                stackIn_22_0 = null;
                                stackIn_22_1 = null;
                                stackIn_22_2 = stackIn_21_2;
                                stackIn_22_3 = stackIn_21_3;
                                stackIn_22_4 = stackIn_21_4;
                                stackIn_22_5 = stackIn_21_5;
                                stackIn_22_6 = 1;
                                break L6;
                              }
                            }
                            var20 = new jj(stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_22_5, stackIn_22_6 != 0);
                            var20 = var20;
                            break L5;
                          } else {
                            if ((var14 ^ -1) != -5) {
                              if ((var14 ^ -1) == -6) {
                                var4 = null;
                                var14 = var5;
                                var15 = var8 & 255 | var8 >> 1679984176;
                                this.a(var6, var14, 117, var7, var15, (fh) null);
                                var21 = (ce) ((Object) this.field_s.a((byte) -127));
                                var21.field_l = var15 * 2;
                                break L5;
                              } else {
                                throw new IllegalArgumentException("invalid actor type: " + var3_int);
                              }
                            } else {
                              var13 = new cg((var8 & -1073741824) >>> -1684007362, var6, var7);
                              this.field_A.a(var13, false);
                              var4 = null;
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (var4 == null) {
                      continue L4;
                    } else {
                      ((id) (var4)).field_y = var5;
                      this.field_f = 1 + var5;
                      this.field_K.a((br) (var4), false);
                      continue L4;
                    }
                  }
                }
              } else {
                this.field_y[var3_int] = param1.g(31365);
                this.field_D[var3_int][0] = param1.e(128);
                this.field_D[var3_int][1] = param1.e(128);
                this.field_d[var3_int] = param1.d((byte) 69);
                this.field_e[var3_int] = (long)param1.e(128) << 1814250280;
                this.field_m[var3_int] = 0;
                this.field_J[var3_int] = 0;
                this.field_a[var3_int] = param1.d((byte) 69);
                this.field_z[var3_int] = param1.d((byte) 69);
                var3_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("kb.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final static void a(int param0, String param1, int param2, String param3, int param4, int param5) {
        ga var8 = null;
        int var7 = 0;
        try {
            var8 = ma.field_a;
            ga var6 = var8;
            var8.b((byte) -35, param2);
            if (param5 != 29602) {
                field_w = (String) null;
            }
            var8.field_j = var8.field_j + 1;
            var7 = var8.field_j;
            var8.a(114, param4);
            if (param4 == 2) {
                var8.a(param1, (byte) 105);
            }
            if (param3 == null) {
                var8.a(param0, (byte) -71);
            } else {
                ae.a(var8, param3, -31746);
            }
            var8.e(41, var8.field_j + -var7);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kb.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, ff param1) {
        try {
            param1.a(true);
            param1.a(-4564);
            if (param0 >= -95) {
                this.field_g = 51;
            }
            param1.c((byte) -70);
            this.field_u.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kb.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (!((this.field_l ^ -1) != -2)) {
            this.field_C = this.field_C - 250;
        }
        this.field_g = this.field_g - 1;
        if (param0 >= -57) {
            this.field_h = (fc) null;
        }
    }

    final wb a(int param0, boolean param1) {
        id var3 = this.a(param0, (byte) 33);
        if (var3 == null) {
            return null;
        }
        if (!(var3 instanceof wb)) {
            return null;
        }
        if (param1) {
            String var4 = (String) null;
            kb.a(-73, (String) null, 60, (String) null, 9, -123);
        }
        return (wb) ((Object) var3);
    }

    final gm a(int param0, int param1) {
        id var3 = this.a(param0, (byte) 33);
        if (var3 == null) {
            return null;
        }
        int var4 = 94 / ((param1 - -27) / 43);
        if (!(var3 instanceof gm)) {
            return null;
        }
        return (gm) ((Object) var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, fh param5) {
        ce var7 = null;
        ja[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              var7 = new ce(param5, param0, param3, param4, param1);
              this.field_s.a(var7, false);
              if (param2 > 98) {
                break L1;
              } else {
                var8 = (ja[]) null;
                kb.a(-11, 108, (ja[]) null, -106, (ja[]) null, (fm) null, -103, -20, -90, 29, (ja[]) null, (byte) 50, 82, -116, 28);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7_ref);

            stackIn_5_1 = new StringBuilder().append("kb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    kb(String[] param0, fc param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_r = 0;
              this.field_b = param0;
              this.field_h = param1;
              if (null == this.field_h) {
                break L1;
              } else {
                this.field_r = this.field_h.field_i;
                break L1;
              }
            }
            L2: {
              this.field_t = param0.length;
              if (-2 != (this.field_t ^ -1)) {
                break L2;
              } else {
                this.field_t = 2;
                break L2;
              }
            }
            this.field_J = new int[this.field_t];
            this.field_D = new int[this.field_t][2];
            this.field_e = new long[this.field_t];
            this.field_d = new int[this.field_t];
            this.field_m = new int[this.field_t];
            this.field_y = new int[this.field_t];
            this.field_K = new th();
            this.field_u = new th();
            this.field_A = new th();
            this.field_s = new th();
            this.field_G = new th();
            this.field_o = new int[this.field_t];
            this.field_v = new int[this.field_t];
            this.field_a = new int[this.field_t];
            this.field_k = new hk[this.field_t];
            this.field_z = new int[this.field_t];
            var3_int = 0;
            L3: while (true) {
              if (this.field_t <= var3_int) {
                this.field_t = param0.length;
                this.field_c = false;
                this.field_l = 0;
                break L0;
              } else {
                this.field_k[var3_int] = new hk();
                var3_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kb.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_w = "This game has started.";
        field_q = "This option cannot be combined with the current settings for:  ";
        field_p = "Owner";
        field_E = "Mouse-over an icon for details";
        field_B = "Resign";
    }
}
