/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sk {
    static String field_d;
    bf field_b;
    static Hashtable field_e;
    static boolean field_c;
    static int field_a;

    abstract void a(boolean param0);

    abstract void a(boolean param0, boolean param1);

    void d(int param0) {
        try {
            if (param0 != 18580) {
                ((sk) this).c(-55);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.O(" + param0 + ')');
        }
    }

    void b(int param0) {
        try {
            if (param0 > -117) {
                field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.P(" + param0 + ')');
        }
    }

    abstract boolean e(int param0);

    abstract void a(int param0, int param1, jj param2);

    public static void a(byte param0) {
        try {
            field_e = null;
            int var1_int = -89 % ((0 - param0) / 52);
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.Q(" + param0 + ')');
        }
    }

    void c(int param0) {
        try {
            if (param0 != 404277666) {
                field_e = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.N(" + param0 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0, byte param1);

    final static rm[] a(rk param0, int param1) {
        RuntimeException var2 = null;
        en var2_ref = null;
        int[] var3 = null;
        rm[] var4 = null;
        int var5 = 0;
        rm var6 = null;
        int var7 = 0;
        rm[] stackIn_3_0 = null;
        Object stackIn_12_0 = null;
        rm[] stackIn_17_0 = null;
        rm[] stackIn_21_0 = null;
        rm[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        rm[] stackOut_16_0 = null;
        rm[] stackOut_20_0 = null;
        rm[] stackOut_24_0 = null;
        rm[] stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 84)) {
              var2_ref = param0.a(param1 ^ 1175069693);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_ref.field_a != 0) {
                      break L3;
                    } else {
                      wf.a(10L, false);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param1 == 1175069442) {
                    break L2;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (rm[]) (Object) stackIn_12_0;
                  }
                }
                if (var2_ref.field_a == 2) {
                  stackOut_16_0 = new rm[]{};
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  var3 = (int[]) var2_ref.field_f;
                  var4 = new rm[var3.length >> 1175069442];
                  var5 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (~var5 <= ~var4.length) {
                          break L6;
                        } else {
                          var6 = new rm();
                          stackOut_20_0 = (rm[]) var4;
                          stackIn_25_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var7 != 0) {
                            break L5;
                          } else {
                            stackIn_21_0[var5] = var6;
                            var6.field_f = var3[var5 << 1786747298];
                            var6.field_b = var3[1 + (var5 << 404277666)];
                            var6.field_d = var3[(var5 << 376585666) - -2];
                            var6.field_a = var3[3 + (var5 << 99721154)];
                            var5++;
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      stackOut_24_0 = (rm[]) var4;
                      stackIn_25_0 = stackOut_24_0;
                      break L5;
                    }
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = new rm[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("sk.M(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    void a(int param0) {
        try {
            if (param0 != 10) {
                field_a = -26;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.D(" + param0 + ')');
        }
    }

    void b(byte param0) {
        try {
            if (param0 != -25) {
                ((sk) this).a(98, 67, (jj) null);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.L(" + param0 + ')');
        }
    }

    sk(bf param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((sk) this).field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Achieved";
        field_e = new Hashtable();
        field_c = false;
    }
}
