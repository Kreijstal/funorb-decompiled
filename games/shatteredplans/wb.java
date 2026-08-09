/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_f;
    private cn field_c;
    static int[] field_b;
    static String field_d;
    private cn field_e;
    static String[] field_a;

    final cn d(int param0) {
        if (param0 > -96) {
            wb.a(79);
        }
        cn var2 = this.field_e;
        if (!(var2 != this.field_c)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_x;
        return var2;
    }

    final void a(byte param0) {
        cn var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: while (true) {
          var2 = this.field_c.field_x;
          if (this.field_c != var2) {
            var2.f((byte) -62);
            continue L0;
          } else {
            L1: {
              this.field_e = null;
              if (param0 == 112) {
                break L1;
              } else {
                this.a((byte) 101);
                break L1;
              }
            }
            return;
          }
        }
    }

    final int c(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        cn var3 = this.field_c.field_x;
        while (this.field_c != var3) {
            var3 = var3.field_x;
            var2++;
        }
        if (param0 != -7432) {
            this.c(107);
        }
        return var2;
    }

    final static int[][] a(ln[] param0, int param1) {
        int[][] stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var5_ref_ln__ = null;
        int var6 = 0;
        int var7 = 0;
        ln var7_ref_ln = null;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            var11 = new int[var2_int][var2_int];
            var10 = var11;
            var3 = var10;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                var4 = param1;
                L2: while (true) {
                  if (var2_int <= var4) {
                    stackIn_29_0 = (int[][]) (var3);
                    break L0;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var2_int) {
                        var4++;
                        continue L2;
                      } else {
                        var9 = 0;
                        var6 = var9;
                        L4: while (true) {
                          if (var9 >= var2_int) {
                            var5++;
                            continue L3;
                          } else {
                            L5: {
                              if (-1 == var11[var5][var4]) {
                                break L5;
                              } else {
                                if (-1 != var11[var4][var9]) {
                                  L6: {
                                    var7 = var11[var4][var9] + var11[var5][var4];
                                    if (var11[var5][var9] == -1) {
                                      break L6;
                                    } else {
                                      if (var7 >= var11[var5][var9]) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var11[var5][var9] = var7;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var9++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L7: while (true) {
                  if (var5 >= var2_int) {
                    var11[var4][var4] = 0;
                    var5_ref_ln__ = param0[var4].field_D;
                    var6 = 0;
                    L8: while (true) {
                      if (var5_ref_ln__.length <= var6) {
                        var4++;
                        continue L1;
                      } else {
                        L9: {
                          var7_ref_ln = var5_ref_ln__[var6];
                          if (var7_ref_ln.field_R != param0[var4].field_R) {
                            break L9;
                          } else {
                            var11[var4][var7_ref_ln.field_p] = 1;
                            break L9;
                          }
                        }
                        var6++;
                        continue L8;
                      }
                    }
                  } else {
                    var11[var4][var5] = -1;
                    var5++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("wb.C(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

    final void a(byte param0, cn param1) {
        if (param0 != 9) {
            return;
        }
        try {
            if (!(null == param1.field_u)) {
                param1.f((byte) -62);
            }
            param1.field_x = this.field_c;
            param1.field_u = this.field_c.field_u;
            param1.field_u.field_x = param1;
            param1.field_x.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 >= -72) {
            field_a = (String[]) null;
        }
    }

    public wb() {
        this.field_c = new cn();
        this.field_c.field_u = this.field_c;
        this.field_c.field_x = this.field_c;
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 > 79) {
            break L0;
          } else {
            wb.a(25);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (gm.field_i ^ -1)) {
              break L2;
            } else {
              if (-14 < (ma.field_p ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final cn e(int param0) {
        cn var2 = this.field_c.field_x;
        if (!(this.field_c != var2)) {
            this.field_e = null;
            return null;
        }
        if (param0 != -31364) {
            field_d = (String) null;
        }
        this.field_e = var2.field_x;
        return var2;
    }

    static {
        field_f = "You cannot add yourself!";
        field_d = "Error connecting to server. Please try using a different server.";
        field_a = new String[255];
    }
}
