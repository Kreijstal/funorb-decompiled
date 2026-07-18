/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends hp implements hh {
    static String field_J;
    static String field_I;
    private ri field_K;
    static vo field_L;
    private an[] field_G;
    private String[] field_H;
    static int field_F;

    public static void b(boolean param0) {
        field_I = null;
        field_J = null;
        field_L = null;
    }

    kn(ri param0) {
        super(0, 0, 0, 0, (io) null);
        try {
            ((kn) this).field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        dp var4 = null;
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
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              ((kn) this).field_x.b(97);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  ((kn) this).field_H = new String[var3_int];
                  if (param1 > 18) {
                    var4_int = 0;
                    L2: while (true) {
                      if (var4_int >= var3_int) {
                        var4 = new dp(ia.field_e, 0, 1);
                        ((kn) this).field_G = new an[var3_int + 1];
                        var5 = 0;
                        L3: while (true) {
                          if (var3_int <= var5) {
                            ((kn) this).field_G[var3_int] = new an(mm.field_j, (sk) this);
                            ((kn) this).field_G[var3_int].field_h = (io) (Object) var4;
                            ((kn) this).field_G[var3_int].a(52, 20 - -((1 + var3_int) * 16), 0, 100, 15);
                            ((kn) this).a((ga) (Object) ((kn) this).field_G[var3_int], 10);
                            break L0;
                          } else {
                            ((kn) this).field_G[var5] = new an(((kn) this).field_H[var5], (sk) this);
                            ((kn) this).field_G[var5].field_h = (io) (Object) var4;
                            ((kn) this).field_G[var5].field_s = sj.field_b;
                            ((kn) this).field_G[var5].a(-94, 16 * var5 + 20, 0, 80, 15);
                            ((kn) this).a((ga) (Object) ((kn) this).field_G[var5], 10);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        ((kn) this).field_H[var4_int] = nh.a((CharSequence) (Object) param0[var4_int], 126).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            ((kn) this).field_H = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("kn.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 0);
        if (!(param3 == param1)) {
            return;
        }
        rb var5 = ia.field_e;
        if (null != ((kn) this).field_H) {
            int discarded$0 = var5.a(ic.field_Q, param2 - -((kn) this).field_k, param0 - -((kn) this).field_j, ((kn) this).field_i, 20, 16777215, -1, 0, 0, var5.field_I - -var5.field_x);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(-126, param1, param2, param3)) {
              if (98 == param1) {
                stackOut_5_0 = ((kn) this).b((byte) 119, param2);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var5_int = -57 / ((param0 - -83) / 32);
                if (param1 == 99) {
                  stackOut_9_0 = ((kn) this).a(1, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("kn.I(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
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
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (((kn) this).field_H.length <= var6_int) {
                L2: {
                  if (param1 == -6) {
                    break L2;
                  } else {
                    var8 = null;
                    ((kn) this).a((String[]) null, (byte) -97);
                    break L2;
                  }
                }
                L3: {
                  if (((kn) this).field_G[((kn) this).field_H.length] != param2) {
                    break L3;
                  } else {
                    ((kn) this).field_K.a(param1 + 127);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (((kn) this).field_G[var6_int] == param2) {
                    ((kn) this).field_K.a((byte) 103, ((kn) this).field_H[var6_int]);
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
            stackOut_12_1 = new StringBuilder().append("kn.K(").append(param0).append(',').append(param1).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Humans captured: ";
        field_J = "You have <%0> unread messages!";
        field_L = new vo();
        field_F = 0;
    }
}
