/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class n extends gn implements dm {
    private sh field_S;
    static int field_M;
    static fj[] field_L;
    static boolean field_P;
    static ah field_N;
    static int field_O;
    private String[] field_V;
    static hj field_U;
    private ae[] field_T;
    static String field_R;
    static boolean field_Q;

    final static String a(boolean param0, String param1, String param2, String param3) {
        int var5 = TetraLink.field_J;
        int var4 = param3.indexOf(param1);
        while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param1.length());
            var4 = param3.indexOf(param1, var4 - -param2.length());
        }
        return param3;
    }

    n(sh param0) {
        super(0, 0, 0, 0, (kg) null);
        try {
            ((n) this).field_S = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_U = null;
        field_R = null;
        field_L = null;
        field_N = null;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= ((n) this).field_V.length) {
                L3: {
                  if (((n) this).field_T[((n) this).field_V.length] != param1) {
                    break L3;
                  } else {
                    ((n) this).field_S.a(true);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param1 != ((n) this).field_T[var6_int]) {
                    break L4;
                  } else {
                    ((n) this).field_S.a(-118, ((n) this).field_V[var6_int]);
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("n.M(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
            return;
        }
        jb var5 = od.field_S;
        if (null != ((n) this).field_V) {
            int discarded$0 = var5.a(pg.field_c, param1 + ((n) this).field_t, param2 - -((n) this).field_w, ((n) this).field_F, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_N);
        }
    }

    final void a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              ((n) this).field_J.b(1);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  var3_int = param1.length;
                  ((n) this).field_V = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new q(od.field_S, param0, 1);
                      ((n) this).field_T = new ae[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var3_int <= var5) {
                          ((n) this).field_T[var3_int] = new ae(qc.field_ab, (dn) this);
                          ((n) this).field_T[var3_int].field_H = (kg) (Object) var4;
                          ((n) this).field_T[var3_int].a(15, 16 + var3_int * 16 + 20, param0 + 73, 0, 100);
                          ((n) this).c((na) (Object) ((n) this).field_T[var3_int], 10);
                          break L0;
                        } else {
                          ((n) this).field_T[var5] = new ae(((n) this).field_V[var5], (dn) this);
                          ((n) this).field_T[var5].field_H = (kg) (Object) var4;
                          ((n) this).field_T[var5].field_C = rn.field_a;
                          ((n) this).field_T[var5].a(15, 16 * var5 + 20, 80, 0, 80);
                          ((n) this).c((na) (Object) ((n) this).field_T[var5], 10);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      ((n) this).field_V[var4_int] = p.a((CharSequence) (Object) param1[var4_int], (byte) 43).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ((n) this).field_V = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("n.E(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param0) {
                if (99 == param0) {
                  stackOut_8_0 = ((n) this).b(param3, 108);
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_4_0 = ((n) this).d(param3, 54);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("n.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(byte param0, fj param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        String var6 = null;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        String stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        String stackIn_1_2 = null;
        int stackIn_1_3 = 0;
        Object stackIn_1_4 = null;
        Object stackIn_1_5 = null;
        long stackIn_1_6 = 0L;
        hl stackIn_1_7 = null;
        String stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        String stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        Object stackIn_2_4 = null;
        Object stackIn_2_5 = null;
        long stackIn_2_6 = 0L;
        hl stackIn_2_7 = null;
        String stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        String stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        Object stackIn_3_4 = null;
        Object stackIn_3_5 = null;
        long stackIn_3_6 = 0L;
        hl stackIn_3_7 = null;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        String stackOut_0_2 = null;
        int stackOut_0_3 = 0;
        Object stackOut_0_4 = null;
        Object stackOut_0_5 = null;
        long stackOut_0_6 = 0L;
        hl stackOut_0_7 = null;
        String stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        String stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        Object stackOut_2_4 = null;
        Object stackOut_2_5 = null;
        long stackOut_2_6 = 0L;
        hl stackOut_2_7 = null;
        int stackOut_2_8 = 0;
        String stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        String stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        Object stackOut_1_4 = null;
        Object stackOut_1_5 = null;
        long stackOut_1_6 = 0L;
        hl stackOut_1_7 = null;
        int stackOut_1_8 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = param1.field_n;
              stackOut_0_1 = 255;
              stackOut_0_2 = param1.field_e;
              stackOut_0_3 = param1.field_i;
              stackOut_0_4 = null;
              stackOut_0_5 = null;
              stackOut_0_6 = param1.field_r;
              stackOut_0_7 = param1.field_f;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_2_4 = stackOut_0_4;
              stackIn_2_5 = stackOut_0_5;
              stackIn_2_6 = stackOut_0_6;
              stackIn_2_7 = stackOut_0_7;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              stackIn_1_4 = stackOut_0_4;
              stackIn_1_5 = stackOut_0_5;
              stackIn_1_6 = stackOut_0_6;
              stackIn_1_7 = stackOut_0_7;
              if (param1.field_i == 1) {
                stackOut_2_0 = (String) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = (String) (Object) stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = stackIn_2_6;
                stackOut_2_7 = (hl) (Object) stackIn_2_7;
                stackOut_2_8 = param1.field_j;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                stackIn_3_5 = stackOut_2_5;
                stackIn_3_6 = stackOut_2_6;
                stackIn_3_7 = stackOut_2_7;
                stackIn_3_8 = stackOut_2_8;
                break L1;
              } else {
                stackOut_1_0 = (String) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = (String) (Object) stackIn_1_2;
                stackOut_1_3 = stackIn_1_3;
                stackOut_1_4 = stackIn_1_4;
                stackOut_1_5 = stackIn_1_5;
                stackOut_1_6 = stackIn_1_6;
                stackOut_1_7 = (hl) (Object) stackIn_1_7;
                stackOut_1_8 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                stackIn_3_5 = stackOut_1_5;
                stackIn_3_6 = stackOut_1_6;
                stackIn_3_7 = stackOut_1_7;
                stackIn_3_8 = stackOut_1_8;
                break L1;
              }
            }
            L2: {
              gd.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, (rb) (Object) stackIn_3_4, (int[]) (Object) stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
              if (param1.field_i != 0) {
                break L2;
              } else {
                if (u.a(113)) {
                  break L2;
                } else {
                  if (null != qb.field_N) {
                    break L2;
                  } else {
                    if (null == qe.field_a) {
                      L3: {
                        if (!fn.field_K) {
                          var5 = hd.field_s;
                          var6 = mn.field_f;
                          var5.field_j.a(var6, 1, 14);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = hd.field_s;
                      var8 = bc.field_x;
                      var7.field_j.a(var8, 1, 20);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (param1.field_i != 1) {
                break L4;
              } else {
                if (u.a(111)) {
                  break L4;
                } else {
                  if (null == qb.field_N) {
                    break L4;
                  } else {
                    if (param1.field_j != qb.field_N.j(-106)) {
                      break L4;
                    } else {
                      L5: {
                        if (fn.field_K) {
                          break L5;
                        } else {
                          var9 = hd.field_s;
                          var10 = lc.field_d;
                          var9.field_j.a(var10, 1, 14);
                          break L5;
                        }
                      }
                      var11 = hd.field_s;
                      var12 = bd.field_d;
                      var11.field_j.a(var12, 1, 20);
                      break L4;
                    }
                  }
                }
              }
            }
            hd.field_s.b((byte) 79);
            hd.field_s.a(19, false);
            hd.field_s.a(param1.field_i, param1.field_a, true);
            hd.field_s.a(true);
            hd.field_s.a(param1, 12);
            var13 = hd.field_s;
            var3 = ci.field_B;
            var4 = li.field_o;
            var13.field_j.a(0, var4, -73, 0, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("n.A(").append(111).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    static {
    }
}
