/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends km {
    static String[] field_Kb;
    static String field_Gb;
    private km field_Jb;
    static int[] field_Lb;
    int field_Hb;
    private km[] field_Fb;
    private km[] field_Ib;
    static long field_Eb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 != -22361) {
            byte[] var9 = (byte[]) null;
            d.a((byte) 53, (byte[]) null);
        }
        this.field_K = param2;
        this.field_tb = param5;
        this.field_F = param6;
        this.field_ub = param1;
        this.b(param0, param4, param3 ^ -20132);
    }

    final static km h(int param0) {
        if (param0 != 0) {
            return (km) null;
        }
        return ve.field_q.field_Lb;
    }

    final void g(int param0) {
        km dupTemp$0 = null;
        km dupTemp$1 = null;
        int var2;
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          if (this.field_Fb.length <= var2) {
            return;
          } else {
            if (this.field_Hb != var2) {
              if (this.field_Fb[var2].field_nb != 0) {
                this.field_Fb[this.field_Hb].field_xb = false;
                dupTemp$0 = this.field_Ib[this.field_Hb];
                dupTemp$0.field_tb = dupTemp$0.field_tb + 10000;
                this.field_Hb = var2;
                this.field_Fb[var2].field_xb = true;
                dupTemp$1 = this.field_Ib[var2];
                dupTemp$1.field_tb = dupTemp$1.field_tb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        km dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param2 == 6651) {
          var4 = 0;
          L0: while (true) {
            if (this.field_Fb.length <= var4) {
              this.field_Jb.a(0, -param0 + this.field_ub, this.field_K, (byte) -70, param0);
              var8 = 0;
              var4 = var8;
              L1: while (true) {
                if (var8 >= this.field_Ib.length) {
                  return;
                } else {
                  this.field_Ib[var8].a(param1, this.field_Jb.field_ub - param1 * 2, -(param1 * 2) + this.field_Jb.field_K, (byte) -115, param1);
                  if (this.field_Hb != var8) {
                    dupTemp$0 = this.field_Ib[var8];
                    dupTemp$0.field_tb = dupTemp$0.field_tb + 10000;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = var4 * this.field_K / this.field_Fb.length;
              var6 = this.field_K * (1 + var4) / this.field_Fb.length;
              this.field_Fb[var4].field_tb = var5;
              this.field_Fb[var4].field_F = 0;
              this.field_Fb[var4].field_K = -var5 + var6;
              this.field_Fb[var4].field_ub = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 != -73) {
            field_Eb = -122L;
        }
        field_Lb = null;
        field_Gb = null;
        field_Kb = null;
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jc var16 = null;
        jc var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new jc(param1);
            var17 = var16;
            var17.field_l = param1.length + -2;
            rj.field_h = var17.c((byte) -83);
            db.field_k = new int[rj.field_h];
            ei.field_d = new boolean[rj.field_h];
            mb.field_bb = new int[rj.field_h];
            md.field_g = new byte[rj.field_h][];
            gb.field_F = new int[rj.field_h];
            lj.field_j = new byte[rj.field_h][];
            el.field_w = new int[rj.field_h];
            var17.field_l = -(8 * rj.field_h) + param1.length - 7;
            oj.field_Kb = var17.c((byte) -108);
            se.field_d = var17.c((byte) 90);
            var3 = (var17.g(11132) & 255) + 1;
            if (param0 <= 0) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= rj.field_h) {
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= rj.field_h) {
                      var4 = 0;
                      L3: while (true) {
                        if (var4 >= rj.field_h) {
                          var4 = 0;
                          L4: while (true) {
                            if (rj.field_h <= var4) {
                              var17.field_l = 3 + -(var3 * 3) + (-7 + (param1.length - 8 * rj.field_h));
                              k.field_c = new int[var3];
                              var4 = 1;
                              L5: while (true) {
                                if (var4 >= var3) {
                                  var17.field_l = 0;
                                  var4 = 0;
                                  L6: while (true) {
                                    if (var4 >= rj.field_h) {
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    } else {
                                      var5 = db.field_k[var4];
                                      var6 = gb.field_F[var4];
                                      var7 = var5 * var6;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      lj.field_j[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      md.field_g[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.g(11132);
                                      stackIn_24_0 = -1;
                                      stackIn_24_1 = 1 & var11 ^ -1;
                                      L7: {
                                        if (stackIn_24_0 != stackIn_24_1) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if (var5 <= var12) {
                                              if (-1 == (var11 & 2 ^ -1)) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L9: while (true) {
                                                  if (var5 <= var12) {
                                                    break L7;
                                                  } else {
                                                    var13 = 0;
                                                    L10: while (true) {
                                                      if (var6 <= var13) {
                                                        var12++;
                                                        continue L9;
                                                      } else {
                                                        L11: {
                                                          dupTemp$0 = var17.a((byte) -69);
                                                          var9[var12 + var5 * var13] = dupTemp$0;
                                                          var14 = dupTemp$0;
                                                          stackIn_48_0 = var10;

                                                          if ((var14 ^ -1) == 0) {
                                                            stackIn_49_0 = stackIn_48_0;
                                                            stackIn_49_1 = 0;
                                                            break L11;
                                                          } else {
                                                            stackIn_49_0 = stackIn_48_0;
                                                            stackIn_49_1 = 1;
                                                            break L11;
                                                          }
                                                        }
                                                        var10 = stackIn_49_0 | stackIn_49_1;
                                                        var13++;
                                                        continue L10;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var13 = 0;
                                              L12: while (true) {
                                                if (var13 >= var6) {
                                                  var12++;
                                                  continue L8;
                                                } else {
                                                  var8[var5 * var13 + var12] = var17.a((byte) 78);
                                                  var13++;
                                                  continue L12;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var12 = 0;
                                          L13: while (true) {
                                            if (var12 >= var7) {
                                              if (0 == (var11 & 2)) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L14: while (true) {
                                                  if (var12 >= var7) {
                                                    break L7;
                                                  } else {
                                                    L15: {
                                                      dupTemp$1 = var17.a((byte) -114);
                                                      var9[var12] = dupTemp$1;
                                                      var13 = dupTemp$1;
                                                      stackIn_33_0 = var10;

                                                      if (-1 == var13) {
                                                        stackIn_34_0 = stackIn_33_0;
                                                        stackIn_34_1 = 0;
                                                        break L15;
                                                      } else {
                                                        stackIn_34_0 = stackIn_33_0;
                                                        stackIn_34_1 = 1;
                                                        break L15;
                                                      }
                                                    }
                                                    var10 = stackIn_34_0 | stackIn_34_1;
                                                    var12++;
                                                    continue L14;
                                                  }
                                                }
                                              }
                                            } else {
                                              var8[var12] = var17.a((byte) 118);
                                              var12++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      }
                                      ei.field_d[var4] = var10 != 0;
                                      var4++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  L16: {
                                    k.field_c[var4] = var17.a(-25842);
                                    if ((k.field_c[var4] ^ -1) != -1) {
                                      break L16;
                                    } else {
                                      k.field_c[var4] = 1;
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  continue L5;
                                }
                              }
                            } else {
                              gb.field_F[var4] = var17.c((byte) 97);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          db.field_k[var4] = var17.c((byte) 41);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      mb.field_bb[var4] = var17.c((byte) 53);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  el.field_w[var4] = var16.c((byte) -112);
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("d.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    d(long param0, km param1, String[] param2, km param3, km[] param4, int param5) {
        super(param0, (km) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        km var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Fb = new km[param2.length];
            this.field_Jb = new km(0L, param3);
            this.field_Ib = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.a(0, this.field_Jb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (var11 >= param4.length) {
                    this.field_Hb = param5;
                    this.field_Fb[param5].field_xb = true;
                    break L0;
                  } else {
                    this.field_Jb.a(0, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new km(0L, param1);
                var9.field_V = param2[var8_int];
                this.field_Fb[var8_int] = var9;
                this.a(0, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("d.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final static int f(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2 = -109 / ((param0 - -29) / 58);
            var1_int = 0;
            L1: while (true) {
              if (!nd.b((byte) -116)) {
                L2: {
                  g.field_b.a(ve.a(hk.field_Jb, nl.field_u, (byte) 66), false, ve.a(a.field_y, ii.field_b, (byte) 66));
                  if (g.field_b.b(false)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var3 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (-1 < (g.field_b.field_d ^ -1)) {
                      break L3;
                    } else {
                      var3 = ia.field_e[g.field_b.field_d];
                      if (var3 == 2) {
                        wn.c(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_14_0 = var3;
                break L0;
              } else {
                g.field_b.e(-87);
                if (!g.field_b.b(false)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "d.F(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_Lb = new int[8192];
        field_Kb = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
