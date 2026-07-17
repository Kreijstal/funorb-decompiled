/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_l;
    static boolean field_a;
    static int field_j;
    static String field_k;
    static int field_i;
    static int field_b;
    static int field_h;
    private boolean field_g;
    static String field_d;
    static qh field_c;
    static ie field_f;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 == 2) {
          if (wo.field_b != null) {
            if (null == wo.field_b.g(-113)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_h = 108;
          if (wo.field_b != null) {
            if (null == wo.field_b.g(-113)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!rk.a((byte) -125, param1)) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    boolean discarded$2 = m.a(-100);
                    break L1;
                  }
                }
                var6 = ce.field_f;
                var2 = var6;
                var3 = 0;
                L2: while (true) {
                  if (var6.length <= var3) {
                    var2 = si.field_n;
                    var3 = 0;
                    L3: while (true) {
                      if (var2.length <= var3) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L3;
                        } else {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2_ref, "m.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (ld.field_s) {
              L1: {
                if (ng.field_b != 2) {
                  break L1;
                } else {
                  if (kb.field_Qb == null) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    if (!kb.field_Qb.equals((Object) (Object) gb.a(var3, param0 + -13073))) {
                      break L1;
                    } else {
                      if (param0 == 13134) {
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        break L0;
                      } else {
                        field_e = null;
                        return true;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("m.E(").append(param0).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    m(String param0) {
        this(param0, false);
    }

    public static void c(int param0) {
        field_d = null;
        field_k = null;
        if (param0 != 2) {
          m.c(1);
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final String b(int param0) {
        if (param0 != 2) {
            field_k = null;
            return ((m) this).field_l;
        }
        return ((m) this).field_l;
    }

    final boolean a(byte param0) {
        if (param0 <= 24) {
            field_k = null;
            return ((m) this).field_g;
        }
        return ((m) this).field_g;
    }

    m(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
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
            L1: {
              ((m) this).field_l = param0;
              if (null != ((m) this).field_l) {
                break L1;
              } else {
                ((m) this).field_l = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((m) this).field_g = stackIn_6_1 != 0;
            if (((m) this).field_l.length() == 0) {
              ((m) this).field_g = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("m.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_k = "Loading fonts";
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_e = "Visit the Account Management section on the main site to view.";
        field_c = new qh();
    }
}
