/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ujb {
    static boolean field_j;
    String field_a;
    String field_i;
    static int field_g;
    static int field_h;
    String field_e;
    int field_b;
    asb field_f;
    static String field_d;
    static int field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 384) {
          L0: {
            ujb.a(-23, -58, 67);
            if (-1 == (384 & param2 ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (384 & param2 ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(byte param0, int[] param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == -57) {
              var5_int = 0;
              L1: while (true) {
                if (param1.length <= var5_int) {
                  stackIn_11_0 = fra.a(param1, param3, 2, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var6 = param1[var5_int];
                  var7 = param1[1 + var5_int];
                  var8 = param1[(2 + var5_int) % param1.length];
                  var9 = param1[(var5_int - -3) % param1.length];
                  var10 = lv.a(param4, var7, var9, param2, var6, 8, var8, param3, param0 + 100);
                  if ((var10 ^ -1) == 0) {
                    var5_int += 2;
                    continue L1;
                  } else {
                    stackIn_8_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ujb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -99) {
            ujb.a((byte) 62);
        }
    }

    final static boolean a(int param0) {
        if (param0 < -99) {
          if (wh.g(-118)) {
            if (hcb.field_o <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_h = -105;
          if (wh.g(-118)) {
            if (hcb.field_o <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_39_0 = 0;
        int var6;
        int var7;
        L0: {
          hb.field_d[bea.field_e] = param4;
          sv.field_f[bea.field_e] = bea.field_e;
          fmb.field_o[bea.field_e] = param1;
          if (pn.field_b < param1) {
            qbb.field_a = param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= rha.field_d) {
          emb.field_o[bea.field_e] = param0;
          hma.field_d[bea.field_e] = param2;
          fv.field_o[bea.field_e] = param5;
          var6 = param0 + param2 - -param5;
          if (param3 == 13336) {
            L1: {
              if (0 == var6) {
                stackIn_39_0 = 0;
                break L1;
              } else {
                stackIn_39_0 = 1000 * param0 / var6;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_39_0;
              hga.field_o[bea.field_e] = var7;
              bea.field_e = bea.field_e + 1;
              if (var7 > qbb.field_a) {
                qbb.field_a = var7;
                break L2;
              } else {
                break L2;
              }
            }
            if (npa.field_d > var7) {
              npa.field_d = var7;
              return;
            } else {
              return;
            }
          } else {
            L3: {
              field_c = -21;
              if (0 == var6) {
                stackIn_29_0 = 0;
                break L3;
              } else {
                stackIn_29_0 = 1000 * param0 / var6;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_29_0;
              hga.field_o[bea.field_e] = var7;
              bea.field_e = bea.field_e + 1;
              if (var7 > qbb.field_a) {
                qbb.field_a = var7;
                break L4;
              } else {
                break L4;
              }
            }
            if (npa.field_d > var7) {
              npa.field_d = var7;
              return;
            } else {
              return;
            }
          }
        } else {
          npa.field_d = param1;
          emb.field_o[bea.field_e] = param0;
          hma.field_d[bea.field_e] = param2;
          fv.field_o[bea.field_e] = param5;
          var6 = param0 + param2 - -param5;
          if (param3 != 13336) {
            L5: {
              field_c = -21;
              if (0 == var6) {
                stackIn_18_0 = 0;
                break L5;
              } else {
                stackIn_18_0 = 1000 * param0 / var6;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_18_0;
              hga.field_o[bea.field_e] = var7;
              bea.field_e = bea.field_e + 1;
              if (var7 > qbb.field_a) {
                qbb.field_a = var7;
                break L6;
              } else {
                break L6;
              }
            }
            if (npa.field_d > var7) {
              npa.field_d = var7;
              return;
            } else {
              return;
            }
          } else {
            L7: {
              if (0 == var6) {
                stackIn_8_0 = 0;
                break L7;
              } else {
                stackIn_8_0 = 1000 * param0 / var6;
                break L7;
              }
            }
            L8: {
              var7 = stackIn_8_0;
              hga.field_o[bea.field_e] = var7;
              bea.field_e = bea.field_e + 1;
              if (var7 > qbb.field_a) {
                qbb.field_a = var7;
                break L8;
              } else {
                break L8;
              }
            }
            if (npa.field_d > var7) {
              npa.field_d = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_j = true;
        field_g = 1;
        field_h = 20;
        field_d = "Sound: ";
    }
}
