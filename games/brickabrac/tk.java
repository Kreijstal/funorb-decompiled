/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk extends nm {
    static String field_o;
    static mh field_t;
    static int field_q;
    static jp[][] field_l;
    static int field_r;
    static String field_m;
    static byte[] field_k;
    long field_j;
    static String field_i;
    tk field_n;
    static String field_p;
    tk field_s;

    final void d(int param0) {
        if (null == ((tk) this).field_n) {
            return;
        }
        ((tk) this).field_n.field_s = ((tk) this).field_s;
        ((tk) this).field_s.field_n = ((tk) this).field_n;
        ((tk) this).field_n = null;
        if (param0 != 3) {
            ((tk) this).field_s = null;
        }
        ((tk) this).field_s = null;
    }

    final static void a(int param0, ak param1, bi param2, j param3) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var8_int = 5;
            var9 = 5;
            var10 = 3 + param2.field_B + param2.field_P;
            var11 = var8_int + 527;
            var12 = 10 + (var9 - -param2.field_B);
            param2.c(jo.field_j, var11, var12, 2, -1);
            var12 = var12 + var10;
            param2.c(lq.field_e, var11, var12, 1, -1);
            var12 = var12 + var10;
            param2.c(ff.field_j, var11, var12, 2, -1);
            var12 = var12 + var10;
            param2.c(vd.field_d, var11, var12, 0, -1);
            L1: {
              L2: {
                if (!r.field_A) {
                  break L2;
                } else {
                  if (!wl.field_N) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var11 -= 2;
              var12 = var12 + (param2.field_P + 4);
              var13 = 0;
              L3: while (true) {
                if (var13 >= -1 + param3.field_rb) {
                  break L1;
                } else {
                  L4: {
                    if (var13 < -2 + param3.field_rb) {
                      ch.field_l.a(var11, var12, 196);
                      break L4;
                    } else {
                      ch.field_l.e(ch.field_l.field_x / 2 + var11, var12 - -(ch.field_l.field_z / 2), 0, 4480 - -(BrickABrac.c(2048, 200 * de.field_x) * 384 >> 16));
                      break L4;
                    }
                  }
                  L5: {
                    var11 = var11 + ch.field_l.field_D / 2;
                    if (612 < var11 - -ch.field_l.field_D) {
                      var12 = var12 + (ch.field_l.field_C - -2);
                      var11 = 527 - -var8_int + -2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var12 + ch.field_l.field_C > 10 - (-130 + var9)) {
                    break L1;
                  } else {
                    var13++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("tk.VB(").append(130).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + -104 + ',' + 527 + ',' + 10 + ',' + 85 + ')');
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_m = null;
        field_l = null;
        field_k = null;
        field_i = null;
        field_t = null;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = sq.a((byte) -32, 16, true, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("tk.QB(").append(16).append(',').append(-55).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final long e(int param0) {
        if (param0 != -19451) {
            ((tk) this).field_s = null;
        }
        return ((tk) this).field_j;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            tk.a((byte) 86, 25, 9);
        }
        if (null == ((tk) this).field_n) {
            return false;
        }
        return true;
    }

    final void a(long param0, int param1) {
        if (!(((tk) this).field_n == null)) {
            throw new RuntimeException();
        }
        if (param1 >= -62) {
            field_k = null;
        }
        ((tk) this).field_j = param0;
    }

    final static void a(byte param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == cf.field_c) {
              break L1;
            } else {
              if (param1 > cf.field_c.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          cf.field_c = new int[param1 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (ec.field_N == null) {
              break L3;
            } else {
              if (ec.field_N.length < param1) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          ec.field_N = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (lf.field_r == null) {
              break L5;
            } else {
              if (lf.field_r.length < param1) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          lf.field_r = new int[param1 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (ao.field_p == null) {
              break L7;
            } else {
              if (param1 <= ao.field_p.length) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          ao.field_p = new int[param1 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (null == ib.field_D) {
              break L9;
            } else {
              if (param1 > ib.field_D.length) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          ib.field_D = new int[2 * param1];
          break L8;
        }
        L10: {
          L11: {
            if (pj.field_b == null) {
              break L11;
            } else {
              if (pj.field_b.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          pj.field_b = new int[2 * param1];
          break L10;
        }
        L12: {
          L13: {
            if (fj.field_Pb == null) {
              break L13;
            } else {
              if (param2 + param1 > fj.field_Pb.length) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          fj.field_Pb = new int[2 * (param2 + param1)];
          break L12;
        }
        L14: {
          L15: {
            if (null == ga.field_l) {
              break L15;
            } else {
              if (ga.field_l.length >= param1) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          ga.field_l = new boolean[2 * param1];
          break L14;
        }
        rn.field_l = -2147483648;
        if (param0 >= 0) {
          wi.field_m = 0;
          ba.field_w = 2147483647;
          pe.field_u = 2147483647;
          uf.field_b = -2147483648;
          return;
        } else {
          return;
        }
    }

    final static boolean a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!bd.a(param0, 0, true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2_int = 0;
              L1: while (true) {
                if (param0.length() <= var2_int) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (m.a(true, param0.charAt(var2_int))) {
                    var2_int++;
                    continue L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("tk.SB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + false + ')');
        }
        return stackIn_12_0 != 0;
    }

    protected tk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Honour";
        field_m = "Show game chat from my friends";
        field_k = new byte[]{(byte) 1};
        field_i = "Scamming";
    }
}
