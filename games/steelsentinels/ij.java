/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends dl implements ae {
    static int field_X;
    private oj field_R;
    static String field_Q;
    static int field_W;
    static String field_P;
    private oa[] field_U;
    static String field_T;
    static int field_Y;
    static String field_S;
    static String field_V;
    private String[] field_Z;

    public static void a(byte param0) {
        field_T = null;
        field_S = null;
        field_V = null;
        field_P = null;
        field_Q = null;
    }

    final void a(boolean param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        bl var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              ((ij) this).field_K.g(6);
              if (param0) {
                break L1;
              } else {
                ((ij) this).field_Z = null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  ((ij) this).field_Z = new String[var3_int];
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new bl(tj.field_e, 0, 1);
                      ((ij) this).field_U = new oa[var3_int - -1];
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          ((ij) this).field_U[var3_int] = new oa(rc.field_f, (tn) this);
                          ((ij) this).field_U[var3_int].field_p = (qk) (Object) var4;
                          ((ij) this).field_U[var3_int].a(0, (byte) -126, 16 + (var3_int * 16 + 20), 100, 15);
                          ((ij) this).a((lh) (Object) ((ij) this).field_U[var3_int], -114);
                          break L0;
                        } else {
                          ((ij) this).field_U[var5] = new oa(((ij) this).field_Z[var5], (tn) this);
                          ((ij) this).field_U[var5].field_p = (qk) (Object) var4;
                          ((ij) this).field_U[var5].field_v = un.field_f;
                          ((ij) this).field_U[var5].a(0, (byte) -120, var5 * 16 + 20, 80, 15);
                          ((ij) this).a((lh) (Object) ((ij) this).field_U[var5], -95);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      ((ij) this).field_Z[var4_int] = cn.a((byte) 90, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            ((ij) this).field_Z = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ij.K(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= ((ij) this).field_Z.length) {
                L2: {
                  var6_int = -108 % ((-85 - param1) / 36);
                  if (((ij) this).field_U[((ij) this).field_Z.length] != param3) {
                    break L2;
                  } else {
                    ((ij) this).field_R.a((byte) 86);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param3 == ((ij) this).field_U[var6_int]) {
                    ((ij) this).field_R.a(20522, ((ij) this).field_Z[var6_int]);
                    break L3;
                  } else {
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
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ij.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 41);
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((ij) this).b(param0 ^ -22560, param3);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((ij) this).b(param3, 92);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ij.R(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    ij(oj param0) {
        super(0, 0, 0, 0, (qk) null);
        try {
            ((ij) this).field_R = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ij.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = -var3 + ((var3 << 5) + e.a(param0.charAt(var4), 732));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("ij.M(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    final static void k(int param0) {
        int var1 = 0;
        if (32 >= lb.field_ac) {
            bb.a(0, (byte) 64);
        } else {
            var1 = lb.field_ac % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            bb.a(-var1 + lb.field_ac, (byte) 64);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -113, param2, param3);
        if (param3 != 0) {
            return;
        }
        if (param1 >= -99) {
            Object var6 = null;
            ((ij) this).a(false, (String[]) null);
        }
        mi var5 = tj.field_e;
        if (null != ((ij) this).field_Z) {
            int discarded$0 = var5.a(qi.field_h, param2 + ((ij) this).field_o, ((ij) this).field_z + param0, ((ij) this).field_x, 20, 16777215, -1, 0, 0, var5.field_F + var5.field_G);
        }
    }

    final static wk j(int param0) {
        int var4_int = 0;
        int var5 = SteelSentinels.field_G;
        int var1 = ca.field_r[0] * le.field_L[0];
        if (param0 != -100) {
            return null;
        }
        byte[] var2 = dl.field_L[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = ba.field_d[ec.a(255, (int) var2[var4_int])];
        }
        wk var4 = new wk(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var3);
        uh.a(9324);
        return var4;
    }

    final static gk[] i(int param0) {
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        gk[] var1 = new gk[rl.field_d];
        for (var2 = 0; rl.field_d > var2; var2++) {
            var1[var2] = new gk(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], dl.field_L[var2], ba.field_d);
        }
        uh.a(9324);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Training Complete";
        field_Y = -1;
        field_Q = "Average rating";
        field_V = "You can join this game";
        field_X = 0;
        field_S = "Enter name of friend to add to list";
    }
}
