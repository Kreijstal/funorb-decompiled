/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cg extends k implements pi {
    static lh field_e;
    static int field_h;
    static kc field_i;
    private hf field_g;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (0 == param1) {
                break L3;
              } else {
                var6 = se.field_K;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2_ref, "cg.P(" + 111 + 44 + param1 + 41);
        }
        return stackIn_19_0 != 0;
    }

    public static void f() {
        field_e = null;
        field_i = null;
    }

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -1) {
          if (null != ((cg) this).field_g.field_r) {
            if (((cg) this).field_g.field_r.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((cg) this).field_g = null;
          if (null == ((cg) this).field_g.field_r) {
            return true;
          } else {
            L0: {
              if (((cg) this).field_g.field_r.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final sg e(int param0) {
        if (param0 != 14) {
          field_i = null;
          return ((cg) this).a(((cg) this).field_g.field_r, -103);
        } else {
          return ((cg) this).a(((cg) this).field_g.field_r, -103);
        }
    }

    abstract sg a(String param0, int param1);

    final static aj b() {
        if (!(aj.field_a != null)) {
            aj.field_a = new aj();
            aj.field_a.a(-1, j.field_C);
            aj.field_a.field_d = 2763306;
            aj.field_a.field_e = 0;
            aj.field_a.field_l = 6;
            aj.field_a.field_o = me.field_c;
            aj.field_a.field_g = 7697781;
            aj.field_a.field_f = 4;
            aj.field_a.field_j = 5;
            aj.field_a.field_c = 14;
        }
        return aj.field_a;
    }

    public final void a(hf param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((cg) this).a(-98);
              if (param1 == 12891) {
                break L1;
              } else {
                field_f = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cg.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public final void a(int param0, hf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                boolean discarded$2 = ((cg) this).a((byte) -37);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cg.GA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final String d(int param0) {
        if (param0 != -5777) {
            return null;
        }
        return ((cg) this).a(((cg) this).field_g.field_r, false);
    }

    abstract String a(String param0, boolean param1);

    cg(hf param0) {
        try {
            ((cg) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "cg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new lh(1);
    }
}
