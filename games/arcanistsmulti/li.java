/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends df implements vb {
    private ro field_D;
    static String field_H;
    private String[] field_K;
    static String field_I;
    static String field_G;
    static byte[] field_E;
    private ag[] field_J;
    static lg field_F;

    final static void a(int param0, int param1) {
        try {
            try {
                Object discarded$0 = ei.a("resizing", cd.e(113), (byte) 114, new Object[1]);
            } catch (Throwable throwable) {
            }
            if (param1 != 0) {
                li.a(-52, 47);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) -109, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        dj var5 = ia.field_c;
        if (param0 >= -52) {
            Object var6 = null;
            boolean discarded$0 = ((li) this).a((qm) null, (byte) -28, 'ￒ', -66);
        }
        if (!(null == ((li) this).field_K)) {
            int discarded$1 = var5.a(ji.field_f, ((li) this).field_n + param1, param3 - -((li) this).field_j, ((li) this).field_v, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_m);
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_7_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -124, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param1 < -120) {
                  break L1;
                } else {
                  ((li) this).field_D = null;
                  break L1;
                }
              }
              if (param3 != 98) {
                if (param3 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((li) this).b(2, param0);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = ((li) this).a(param0, 9555);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("li.N(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void a() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (an.field_f <= 0) {
                break L1;
              } else {
                if (an.field_j > 0) {
                  var1_int = wk.field_l.field_w;
                  var2 = wk.field_l.field_n;
                  var3 = km.field_e.field_n;
                  var4 = -var3 + an.field_f;
                  var5 = km.field_e.field_w;
                  var6 = -var5 + an.field_j;
                  var7 = an.field_f - var1_int;
                  var8 = an.field_j - var1_int;
                  km.field_e.c(0, 0);
                  km.field_e.e(var4, 0);
                  km.field_e.d(0, var6);
                  km.field_e.a(var4, var6);
                  de.h(var3, 0, var4, an.field_j);
                  var9 = var3;
                  L2: while (true) {
                    if (var4 <= var9) {
                      de.h(0, var5, an.field_f, var6);
                      var9 = var5;
                      L3: while (true) {
                        if (var9 >= var6) {
                          de.a();
                          break L0;
                        } else {
                          hk.field_k.c(0, var9);
                          hk.field_k.e(var7, var9);
                          var9 = var9 + var2;
                          continue L3;
                        }
                      }
                    } else {
                      wk.field_l.c(var9, 0);
                      wk.field_l.d(var9, var8);
                      var9 = var9 + var2;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "li.F(" + 99 + ')');
        }
    }

    public static void a(int param0) {
        field_G = null;
        field_H = null;
        field_E = null;
        field_I = null;
        field_F = null;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (((li) this).field_K.length <= var6_int) {
                if (param0) {
                  L2: {
                    if (((li) this).field_J[((li) this).field_K.length] == param4) {
                      ((li) this).field_D.a((byte) -7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                L3: {
                  if (((li) this).field_J[var6_int] != param4) {
                    break L3;
                  } else {
                    ((li) this).field_D.a(((li) this).field_K[var6_int], 90);
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("li.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    li(ro param0) {
        super(0, 0, 0, 0, (pf) null);
        try {
            ((li) this).field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((li) this).field_B.c(109);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  ((li) this).field_K = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new gm(ia.field_c, 0, 1);
                      ((li) this).field_J = new ag[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          var6 = 11 / ((6 - param1) / 42);
                          ((li) this).field_J[var3_int] = new ag(pc.field_d, (wc) this);
                          ((li) this).field_J[var3_int].field_r = (pf) (Object) var4;
                          ((li) this).field_J[var3_int].a(15, (1 + var3_int) * 16 + 20, 100, 0, -60);
                          ((li) this).c(-87, (qm) (Object) ((li) this).field_J[var3_int]);
                          break L0;
                        } else {
                          ((li) this).field_J[var5] = new ag(((li) this).field_K[var5], (wc) this);
                          ((li) this).field_J[var5].field_r = (pf) (Object) var4;
                          ((li) this).field_J[var5].field_q = si.field_q;
                          ((li) this).field_J[var5].a(15, var5 * 16 + 20, 80, 0, -80);
                          ((li) this).c(-82, (qm) (Object) ((li) this).field_J[var5]);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      ((li) this).field_K[var4_int] = qo.a((byte) 80, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ((li) this).field_K = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("li.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Shortcut Reference";
        field_I = "Casting ";
        field_G = "to keep fullscreen or";
        field_E = new byte[]{(byte) 7, (byte) 10, (byte) 2};
    }
}
