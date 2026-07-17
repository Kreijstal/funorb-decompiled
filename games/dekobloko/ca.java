/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends t {
    private ef field_ub;
    private int field_nb;
    private int field_tb;
    static int field_vb;
    static ke field_wb;
    private int field_lb;
    private ce field_sb;
    private i field_pb;
    private int field_rb;
    private int field_mb;
    static ck field_qb;
    static int field_kb;
    static String field_ob;

    final void j(byte param0) {
        if (((ca) this).field_pb == da.field_b) {
            return;
        }
        int var2 = -119 % ((param0 - 30) / 39);
        ((ca) this).field_rb = 0;
        ((ca) this).field_pb = rb.field_c;
        int discarded$0 = -29870;
        this.a(((ca) this).field_sb);
        ((ca) this).field_ub.field_Q = 0;
        ((ca) this).field_sb = null;
    }

    private final void a(ce param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (((ca) this).field_ub == null) {
                break L1;
              } else {
                ((ca) this).field_ub.b((byte) 111);
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                param0.b(param0.field_y, param0.field_t, 6, ((ca) this).field_nb + 6, -16555);
                ((ca) this).field_ub = new ef(param0);
                break L2;
              } else {
                ((ca) this).field_ub = new ef();
                break L2;
              }
            }
            ((ca) this).b((ce) (Object) ((ca) this).field_ub, (byte) -55);
            ((ca) this).field_sb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ca.U(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + -29870 + 41);
        }
    }

    final static void a(String param0, String param1, String param2, byte param3) {
        hl var6 = null;
        try {
            var6 = new hl(2, param0, 0, param1, param2);
            int discarded$0 = -3;
            rb.a(var6);
            int var7 = 121 % ((20 - param3) / 42);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ca.W(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + 2 + 44 + 0 + 41);
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int var9 = 0;
        ck[] var10 = null;
        ck[] var11_ref_ck__ = null;
        int var11 = 0;
        int var12 = 0;
        ck var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = client.field_A ? 1 : 0;
        var9 = 3;
        var10 = new ck[]{new ck(var9, var9), new ck(3, var9), new ck(var9, var9), new ck(var9, 3), new ck(64, 64), new ck(var9, 3), new ck(var9, var9), new ck(3, var9), new ck(var9, var9)};
        var11_ref_ck__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_ck__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_D[var11 + 3 * (-1 + -var12 + var9)] = 65793;
                                var10[3].field_D[-var12 - (1 + -var9 - var9 * var11)] = 65793;
                                var10[7].field_D[var12 * 3 - -var11] = 65793;
                                var10[5].field_D[var12 + var9 * var11] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_D[(-1 + var9 - var12) * 3 + var11] = 0;
                            var10[5].field_D[-var12 - (1 + -var9 - var11 * var9)] = 0;
                            var10[1].field_D[var12 * 3 + var11] = 0;
                            var10[3].field_D[var9 * var11 - -var12] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_D[var12 - -(var9 * var11)] = 0;
                          var10[0].field_D[var9 * var12 + var11] = 0;
                          if (~(-var11 + var9) < ~var12) {
                            var10[2].field_D[var12 - -(var11 * var9)] = 0;
                            var10[6].field_D[var12 * var9 + var11] = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_D[var12 + (var9 + -var11 - 1) * var9] = 0;
                    var10[8].field_D[(-1 + (var9 + -var11)) * var9 + var12] = 0;
                    var10[2].field_D[-var11 - 1 - -var9 + var12 * var9] = 0;
                    var10[8].field_D[var12 * var9 + (-var11 + (-1 + var9))] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ck__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_D.length) {
                var12++;
                continue L0;
              } else {
                var13.field_D[var14] = 0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    void c(ce param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 10) {
                break L1;
              } else {
                field_kb = -79;
                break L1;
              }
            }
            L2: {
              ((ca) this).field_sb = param0;
              if (fh.field_e != ((ca) this).field_pb) {
                if (da.field_b == ((ca) this).field_pb) {
                  break L2;
                } else {
                  ((ca) this).field_pb = da.field_b;
                  ((ca) this).field_rb = 0;
                  break L2;
                }
              } else {
                ((ca) this).b(((ca) this).field_sb.field_t + 12, ((ca) this).field_tb, ((ca) this).field_sb.field_y + ((ca) this).field_nb + 12, 194);
                ((ca) this).field_rb = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ca.T(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static ck[] m() {
        ck[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = client.field_A ? 1 : 0;
        var1 = new ck[ec.field_g];
        var2 = 0;
        L0: while (true) {
          if (var2 >= ec.field_g) {
            oa.a(126);
            return var1;
          } else {
            L1: {
              var3 = hc.field_c[var2] * tm.field_a[var2];
              var21 = tc.field_Nb[var2];
              if (da.field_d[var2]) {
                var23 = pd.field_e[var2];
                var24 = new int[var3];
                var20 = var24;
                var16 = var20;
                var13 = var16;
                var6 = var13;
                var7 = 0;
                L2: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (ck) (Object) new ld(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var24);
                    break L1;
                  } else {
                    var6[var7] = de.b(lb.a((int) var23[var7], 255) << 24, mb.field_d[lb.a((int) var21[var7], 255)]);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = new int[var3];
                var22 = var9;
                var6_int = 0;
                L3: while (true) {
                  if (var3 <= var6_int) {
                    var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var22);
                    break L1;
                  } else {
                    var9[var6_int] = mb.field_d[lb.a(255, (int) var21[var6_int])];
                    var6_int++;
                    continue L3;
                  }
                }
              }
            }
            var2++;
            continue L0;
          }
        }
    }

    public static void l() {
        field_wb = null;
        field_ob = null;
        field_qb = null;
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(82, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                var5_int = 0;
                if (((ca) this).field_ub == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 == param1) {
                      boolean discarded$4 = ((ca) this).field_ub.a(false, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param1 == 99) {
                    boolean discarded$5 = ((ca) this).field_ub.a(false, param2);
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ca.QA(").append(123).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void j(int param0) {
        if (!(null == ((ca) this).field_pb)) {
            if (((ca) this).field_pb != rb.field_c) {
                ((ca) this).a(108, ((ca) this).field_sb.field_t + 12, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y);
                int discarded$0 = -29870;
                this.a(((ca) this).field_sb);
            }
            ((ca) this).field_ub.field_Q = 256;
            ((ca) this).field_pb = null;
        }
        super.j(92);
        int var2 = 11 % ((-15 - param0) / 49);
    }

    boolean h(byte param0) {
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (((ca) this).field_pb == null) {
            break L0;
          } else {
            if (da.field_b == ((ca) this).field_pb) {
              int fieldTemp$38 = ((ca) this).field_rb + 1;
              ((ca) this).field_rb = ((ca) this).field_rb + 1;
              if (~fieldTemp$38 == ~((ca) this).field_lb) {
                ((ca) this).field_pb = fh.field_e;
                ((ca) this).b(12 + ((ca) this).field_sb.field_t, ((ca) this).field_tb, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y, 194);
                ((ca) this).field_ub.field_Q = 0;
                ((ca) this).field_rb = 0;
                break L0;
              } else {
                ((ca) this).field_ub.field_Q = -((((ca) this).field_rb << 8) / ((ca) this).field_lb) + 256;
                break L0;
              }
            } else {
              if (((ca) this).field_pb != rb.field_c) {
                break L0;
              } else {
                int fieldTemp$39 = ((ca) this).field_rb + 1;
                ((ca) this).field_rb = ((ca) this).field_rb + 1;
                if (fieldTemp$39 == ((ca) this).field_mb) {
                  ((ca) this).field_ub.field_Q = 256;
                  ((ca) this).field_pb = null;
                  break L0;
                } else {
                  ((ca) this).field_ub.field_Q = (((ca) this).field_rb << 8) / ((ca) this).field_mb;
                  break L0;
                }
              }
            }
          }
        }
        return super.h((byte) 47);
    }

    ca(ka param0, ce param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + (param2 - -param1.field_y));
        try {
            ((ca) this).field_mb = param3;
            ((ca) this).field_lb = param3;
            ((ca) this).field_nb = param2;
            ((ca) this).field_tb = param4;
            int discarded$0 = -29870;
            this.a(param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ca.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean f(byte param0) {
        if (param0 <= 77) {
            ((ca) this).field_pb = null;
        }
        ((ca) this).j(-109);
        return super.f((byte) 116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Your ignore list is full. Max of 100 hit.";
    }
}
