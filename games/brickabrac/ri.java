/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends ib implements en {
    private vf field_K;
    private String[] field_J;
    static int[] field_I;
    static String field_O;
    static String field_L;
    static String field_N;
    static int field_M;
    private d[] field_H;

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
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
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= ((ri) this).field_J.length) {
                L2: {
                  if (param4 != ((ri) this).field_H[((ri) this).field_J.length]) {
                    break L2;
                  } else {
                    ((ri) this).field_K.a((byte) 100);
                    break L2;
                  }
                }
                L3: {
                  if (param2 < -22) {
                    break L3;
                  } else {
                    ((ri) this).a(-93, -52, -108, (byte) -4);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (((ri) this).field_H[var6_int] == param4) {
                    ((ri) this).field_K.a(((ri) this).field_J[var6_int], (byte) 56);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ri.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static boolean a(int param0) {
        if (param0 > -69) {
            return false;
        }
        return null != td.field_t ? true : false;
    }

    final void a(byte param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        bb var4 = null;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ri) this).field_G.c((byte) -95);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  var3_int = param1.length;
                  ((ri) this).field_J = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new bb(a.field_u, 0, 1);
                      ((ri) this).field_H = new d[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          ((ri) this).field_H[var3_int] = new d(sh.field_c, (uh) this);
                          var5 = 52 / ((-9 - param0) / 59);
                          ((ri) this).field_H[var3_int].field_l = (ub) (Object) var4;
                          ((ri) this).field_H[var3_int].a(15, 0, 16 * (var3_int - -1) + 20, (byte) -119, 100);
                          ((ri) this).a((oc) (Object) ((ri) this).field_H[var3_int], true);
                          break L0;
                        } else {
                          ((ri) this).field_H[var5] = new d(((ri) this).field_J[var5], (uh) this);
                          ((ri) this).field_H[var5].field_l = (ub) (Object) var4;
                          ((ri) this).field_H[var5].field_z = aa.field_c;
                          ((ri) this).field_H[var5].a(15, 0, var5 * 16 + 20, (byte) -119, 80);
                          ((ri) this).a((oc) (Object) ((ri) this).field_H[var5], true);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      ((ri) this).field_J[var4_int] = ap.a(true, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ((ri) this).field_J = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ri.U(").append(param0).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static void h(int param0) {
        if (param0 > -41) {
            return;
        }
        int discarded$0 = 96;
        aa.a();
        ko.a(-32120);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
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
              if (param0 == 98) {
                stackOut_6_0 = ((ri) this).b(param2, (byte) -60);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 == 99) {
                  stackOut_10_0 = ((ri) this).a(param2, (byte) -117);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ri.T(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
        return stackIn_11_0;
    }

    final static byte[] a(byte[] param0, int param1, pi param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param2.c(16, (byte) -112);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.c(3, (byte) 98);
                var6 = (byte)param2.c(8, (byte) 31);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (byte)(var6 + param2.c(var5, (byte) 107));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_17_0 = (byte[]) param0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ri.W(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(16).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 20 + 41);
        }
        return stackIn_18_0;
    }

    public static void a() {
        field_I = null;
        field_O = null;
        field_L = null;
        field_N = null;
    }

    final static void c() {
        int var1 = 0;
        if (ki.field_d < 224) {
            var1 = ki.field_d % 32;
            h.a(13894, ki.field_d + (32 + -var1));
        } else {
            h.a(13894, 256);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        dh var5 = a.field_u;
        if (((ri) this).field_J != null) {
            int discarded$0 = var5.a(i.field_l, param1 - -((ri) this).field_o, ((ri) this).field_w + param0, ((ri) this).field_t, 20, 16777215, -1, 0, 0, var5.field_P + var5.field_F);
        }
    }

    ri(vf param0) {
        super(0, 0, 0, 0, (ub) null);
        try {
            ((ri) this).field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ri.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Continue";
        field_O = "Remove <%0> from ignore list";
    }
}
