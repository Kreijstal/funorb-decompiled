/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static he[] field_c;
    private boolean field_b;
    static int[] field_e;
    private int field_a;
    private int field_f;
    private int[] field_d;

    final static boolean a(String param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var3 = vj.a(param0, -115);
              if (param1.indexOf(param0) != -1) {
                break L1;
              } else {
                if (-1 != param1.indexOf(var3)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param1.startsWith(param0)) {
                        break L3;
                      } else {
                        if (param1.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param1.endsWith(param0)) {
                            break L3;
                          } else {
                            if (!param1.endsWith(var3)) {
                              stackOut_11_0 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                  break L0;
                }
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("rb.J(");
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -1 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void d(int param0, int param1) {
        if (param0 < -11) {
          if (param1 >= 0) {
            if (param1 > ((rb) this).field_a) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L0: {
                if (param1 != ((rb) this).field_a) {
                  kg.a(((rb) this).field_d, 1 + param1, ((rb) this).field_d, param1, -param1 + ((rb) this).field_a);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((rb) this).field_a = ((rb) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          ((rb) this).d(-66, 80);
          if (param1 >= 0) {
            if (param1 > ((rb) this).field_a) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param1 != ((rb) this).field_a) {
                  kg.a(((rb) this).field_d, 1 + param1, ((rb) this).field_d, param1, -param1 + ((rb) this).field_a);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((rb) this).field_a = ((rb) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final static void a(int param0, String[] param1, String param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            lc.field_h = wg.field_u;
            if (param0 != 255) {
              if (100 > param0) {
                kf.field_a = kj.a(param0, 4, param2);
                return;
              } else {
                if (param0 <= 105) {
                  var4 = param1;
                  pi.a(true, var4);
                  kf.field_a = sa.a((byte) 3, param1);
                  break L0;
                } else {
                  kf.field_a = kj.a(param0, 4, param2);
                  return;
                }
              }
            } else {
              L1: {
                if (13 <= rd.field_z) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              kf.field_a = b.a(stackIn_5_0 != 0, 93);
              var6 = null;
              pi.a(true, (String[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("rb.F(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 105 + 41);
        }
    }

    final static void a() {
        pi.field_Q = -1;
        em.field_c = false;
        dd.field_l = 0;
        ie.field_C = null;
        oh.field_e = -1;
    }

    final void c(int param0, int param1) {
        int var3 = 69 % ((param1 - 69) / 56);
        this.a(21125, ((rb) this).field_a + 1, param0);
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = ((rb) this).field_d.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((rb) this).field_b) {
              if (var3 != 0) {
                var3 = var3 * ((rb) this).field_f;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((rb) this).field_f;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a(param0, true)];
        int[] var3 = var4;
        kg.a(((rb) this).field_d, 0, var4, 0, ((rb) this).field_d.length);
        ((rb) this).field_d = var4;
    }

    final int b(int param0, int param1) {
        if (((rb) this).field_a >= param1) {
          if (param0 > -30) {
            ((rb) this).d(-4, -55);
            return ((rb) this).field_d[param1];
          } else {
            return ((rb) this).field_d[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((rb) this).a(true);
            return ((rb) this).field_a + 1;
        }
        return ((rb) this).field_a + 1;
    }

    private rb() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        if (((rb) this).field_a < param1) {
          L0: {
            ((rb) this).field_a = param1;
            if (param1 >= ((rb) this).field_d.length) {
              this.a(param1, -1);
              break L0;
            } else {
              break L0;
            }
          }
          ((rb) this).field_d[param1] = param2;
          return;
        } else {
          L1: {
            if (param1 >= ((rb) this).field_d.length) {
              this.a(param1, -1);
              break L1;
            } else {
              break L1;
            }
          }
          ((rb) this).field_d[param1] = param2;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
    }
}
