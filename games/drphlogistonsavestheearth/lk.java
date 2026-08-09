/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk extends u {
    private long field_g;
    static String field_n;
    static he[] field_m;
    static String[] field_i;
    static volatile boolean field_j;
    static he field_k;
    static String field_l;
    private String field_h;

    final static int[] c(byte param0) {
        if (param0 != 8) {
            field_j = false;
        }
        return new int[8];
    }

    final static vj a(boolean param0, boolean param1, int param2, int param3, int param4) {
        if (param4 != 8) {
            field_k = (he) null;
        }
        return na.a(param1, param2, false, param0, true, param3);
    }

    db b(byte param0) {
        if (param0 != -98) {
            this.field_g = -35L;
        }
        return si.field_A;
    }

    final static void b(int param0) {
        qg.a(true, bg.field_q, ol.field_j, (byte) -11);
        hl.field_b = true;
        if (param0 != 1) {
            lk.c((byte) -37);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_n = null;
        field_i = null;
        field_k = null;
        field_m = null;
        if (param0 != -27996) {
            field_k = (he) null;
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
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
        od var16 = null;
        od var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var16 = new od(param0);
            var17 = var16;
            var17.field_j = -2 + param0.length;
            bd.field_M = var17.j(-788751192);
            vi.field_b = new int[bd.field_M];
            a.field_e = new byte[bd.field_M][];
            bd.field_O = new boolean[bd.field_M];
            ll.field_o = new byte[bd.field_M][];
            kh.field_i = new int[bd.field_M];
            qa.field_J = new int[bd.field_M];
            gf.field_o = new int[bd.field_M];
            var17.field_j = -(bd.field_M * 8) + (-7 + param0.length);
            oe.field_b = var17.j(-788751192);
            ih.field_K = var17.j(-788751192);
            var3 = (var17.l(31760) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (bd.field_M <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= bd.field_M) {
                    var5 = 35 % ((param1 - -12) / 63);
                    var4 = 0;
                    L3: while (true) {
                      if (bd.field_M <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= bd.field_M) {
                            var17.field_j = -(3 * var3) + (3 + (-7 + param0.length) + -(bd.field_M * 8));
                            aj.field_a = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_j = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (bd.field_M <= var4) {
                                    break L0;
                                  } else {
                                    var5 = gf.field_o[var4];
                                    var6 = qa.field_J[var4];
                                    var7 = var5 * var6;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    a.field_e[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    ll.field_o[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.l(31760);
                                    stackIn_23_0 = -1;
                                    stackIn_23_1 = 1 & var11 ^ -1;
                                    L7: {
                                      if (stackIn_23_0 != stackIn_23_1) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) != 0) {
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
                                                        dupTemp$0 = var17.n(99);
                                                        var9[var13 * var5 + var12] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_48_0 = var10;

                                                        if (-1 == var14) {
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
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.n(-88);
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
                                            if (-1 == (var11 & 2 ^ -1)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    dupTemp$1 = var17.n(98);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_32_0 = var10;

                                                    if (var13 == -1) {
                                                      stackIn_33_0 = stackIn_32_0;
                                                      stackIn_33_1 = 0;
                                                      break L15;
                                                    } else {
                                                      stackIn_33_0 = stackIn_32_0;
                                                      stackIn_33_1 = 1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_33_0 | stackIn_33_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.n(-98);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    bd.field_O[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  aj.field_a[var4] = var17.g(-1);
                                  if (-1 == (aj.field_a[var4] ^ -1)) {
                                    aj.field_a[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            qa.field_J[var4] = var17.j(-788751192);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        gf.field_o[var4] = var17.j(-788751192);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    vi.field_b[var4] = var17.j(-788751192);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                kh.field_i[var4] = var16.j(-788751192);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("lk.O(");

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
          throw ie.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
    }

    final void a(od param0, int param1) {
        if (param1 <= 19) {
            return;
        }
        try {
            param0.a(this.field_g, (byte) 127);
            param0.b(1, this.field_h);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "lk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    lk(long param0, String param1) {
        try {
            this.field_g = param0;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Connection restored.";
        field_j = false;
        field_l = "Use this alternative as your account name";
    }
}
