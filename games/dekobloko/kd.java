/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends wm {
    static int field_p;
    static int[][] field_s;
    static int field_u;
    static String field_r;
    static String field_q;
    static ck field_t;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param0, (byte) -40) == vm.field_u) {
              stackIn_3_0 = um.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != -11) {
                field_u = 2;
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("kd.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_7_0);
        }
    }

    final tb b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        tb stackIn_2_0 = null;
        tb stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (be.a((byte) 98, var4)) {
              L1: {
                if (param1 == -40) {
                  break L1;
                } else {
                  field_t = (ck) null;
                  break L1;
                }
              }
              L2: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = cb.a((byte) -106, var5);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -131) {
                    break L2;
                  } else {
                    return dc.field_b;
                  }
                }
              }
              stackIn_9_0 = vm.field_u;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = vm.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kd.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1 + param0;
              var6 = param4 + param3;
              if (param1 > hk.field_c) {
                stackIn_4_0 = param1;
                break L1;
              } else {
                stackIn_4_0 = hk.field_c;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              var9 = -83 / ((param2 - 29) / 53);
              if (hk.field_h >= param3) {
                stackIn_7_0 = hk.field_h;
                break L2;
              } else {
                stackIn_7_0 = param3;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (hk.field_g <= var5_int) {
                stackIn_10_0 = hk.field_g;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var10 = stackIn_10_0;
              if (var6 < hk.field_b) {
                stackIn_13_0 = var6;
                break L4;
              } else {
                stackIn_13_0 = hk.field_b;
                break L4;
              }
            }
            L5: {
              var11 = stackIn_13_0;
              if (param1 < hk.field_c) {
                break L5;
              } else {
                if (hk.field_g <= param1) {
                  break L5;
                } else {
                  var12 = param1 + var8 * hk.field_j;
                  var13 = -var8 + var11 + 1 >> -97095103;
                  L6: while (true) {
                    var13--;
                    if ((var13 ^ -1) > -1) {
                      break L5;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 = var12 + hk.field_j * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (param3 < hk.field_h) {
                break L7;
              } else {
                if (hk.field_b <= var6) {
                  break L7;
                } else {
                  var12 = hk.field_j * param3 + var7;
                  var13 = -var7 + var10 + 1 >> -1989691583;
                  L8: while (true) {
                    var13--;
                    if (-1 < (var13 ^ -1)) {
                      break L7;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (var5_int < hk.field_c) {
                break L9;
              } else {
                if (var5_int < hk.field_g) {
                  var12 = (var8 - -(var5_int - param1 & 1)) * hk.field_j - -var5_int;
                  var13 = -var8 + 1 + var11 >> -2048490399;
                  L10: while (true) {
                    var13--;
                    if ((var13 ^ -1) > -1) {
                      break L9;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 = var12 + 2 * hk.field_j;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (hk.field_h > param3) {
                break L11;
              } else {
                if (hk.field_b > var6) {
                  var12 = (-param3 + var6 & 1) + var6 * hk.field_j - -var7;
                  var13 = 1 - -var10 - var7 >> -418335423;
                  L12: while (true) {
                    var13--;
                    if (0 > var13) {
                      break L11;
                    } else {
                      hk.field_l[var12] = 16777215;
                      var12 += 2;
                      continue L12;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "kd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    kd(rk param0) {
        super(param0);
    }

    public static void e(int param0) {
        field_t = null;
        field_q = null;
        field_s = (int[][]) null;
        field_r = null;
        int var1 = -6 / ((80 - param0) / 42);
    }

    static {
        field_s = new int[2][8];
        field_r = "Find opponent";
        field_q = "Loading music";
        vj discarded$0 = new vj();
    }
}
