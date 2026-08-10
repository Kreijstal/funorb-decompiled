/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qa extends br {
    static String field_m;
    static String field_g;
    qa field_p;
    static String field_n;
    static String field_j;
    static long field_i;
    static int field_h;
    static int field_o;
    qa field_k;
    static int[] field_f;
    long field_l;

    public static void a(byte param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_f = null;
        if (param0 != 43) {
            field_g = (String) null;
        }
    }

    final boolean c(int param0) {
        if (null == this.field_p) {
            return false;
        }
        if (param0 != 0) {
            field_i = -71L;
            return true;
        }
        return true;
    }

    final long d(int param0) {
        if (param0 > -60) {
            return -16L;
        }
        return this.field_l;
    }

    final void a(byte param0, long param1) {
        if (!(null == this.field_p)) {
            throw new RuntimeException();
        }
        this.field_l = param1;
        if (param0 != -85) {
            field_g = (String) null;
        }
    }

    final void a(int param0) {
        if (!(this.field_p != null)) {
            return;
        }
        this.field_p.field_k = this.field_k;
        this.field_k.field_p = this.field_p;
        if (param0 != -4564) {
            this.a((byte) -27, 73L);
        }
        this.field_k = null;
        this.field_p = null;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9;
        ja[] var10;
        ja[] var11_ref_ja__;
        int var11;
        int var12;
        ja var13;
        int var14;
        int var15;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = param7 + (param2 + param8);
        var10 = new ja[]{new ja(var9, var9), new ja(param3, var9), new ja(var9, var9), new ja(var9, param3), new ja(64, 64), new ja(var9, param3), new ja(var9, var9), new ja(param3, var9), new ja(var9, var9)};
        var11_ref_ja__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_ja__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (param2 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param2) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= param3) {
                        L4: {
                          if (param4 > 59) {
                            break L4;
                          } else {
                            qa.a((byte) -29);
                            break L4;
                          }
                        }
                        var11 = 0;
                        L5: while (true) {
                          if (param3 >> 179000001 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param8) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_B[(-var12 + (var9 + -1)) * param3 - -var11] = param5;
                                var10[3].field_B[var9 + -1 + -var12 + var9 * var11] = param5;
                                var10[7].field_B[param3 * var12 + var11] = param5;
                                var10[5].field_B[var9 * var11 + var12] = param5;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param2 > var12) {
                            var10[7].field_B[var11 + (-1 + var9 + -var12) * param3] = param0;
                            var10[5].field_B[var9 - (1 + var12 - var9 * var11)] = param0;
                            var10[1].field_B[var12 * param3 + var11] = param6;
                            var10[3].field_B[var12 + var9 * var11] = param6;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_B[var12 - -(var11 * var9)] = param6;
                        var10[0].field_B[var9 * var12 - -var11] = param6;
                        if (var9 + -var11 > var12) {
                          var10[2].field_B[var12 - -(var9 * var11)] = param6;
                          var10[6].field_B[var11 + var9 * var12] = param6;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L2;
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
                    var10[6].field_B[(var9 - (var11 - -1)) * var9 - -var12] = param0;
                    var10[8].field_B[var12 + var9 * (-1 + (var9 - var11))] = param0;
                    var10[2].field_B[var12 * var9 - -var9 + (-1 - var11)] = param0;
                    var10[8].field_B[-var11 + (-1 + var9 + var12 * var9)] = param0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ja__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_B.length) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param1;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var4 = 11 % ((-85 - param0) / 36);
            var3 = 1;
            L1: while (true) {
              if (param1.length() <= var3) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var2_int == param1.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("qa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    protected qa() {
    }

    static {
        field_n = "Find opponent";
        field_j = "Shortcut Reference";
        field_m = "Please enter your date of birth to enable chat:";
        field_g = "Account created successfully!";
        field_o = 15;
        field_f = new int[4];
    }
}
