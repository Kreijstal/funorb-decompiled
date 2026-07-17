/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ii extends cj {
    nq field_l;
    int field_k;
    static eaa field_m;

    public static void b(int param0) {
        if (param0 != -225) {
            ii.b(-121);
            field_m = null;
            return;
        }
        field_m = null;
    }

    void a(byte param0, lu param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              if (param0 <= -12) {
                break L1;
              } else {
                var4 = null;
                ii.a((String) null, false, -42, (uha) null);
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
            stackOut_3_1 = new StringBuilder().append("ii.F(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(lu param0, int param1) {
        try {
            param0.b(((ii) this).field_k, -121);
            er.a(((ii) this).field_l, param1 + 132, param0);
            if (param1 != -9) {
                ((ii) this).field_k = -23;
            }
            ((ii) this).a((byte) -54, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ii.O(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        if (b.field_u < 224) {
          var1 = b.field_u % 32;
          di.a(true, -var1 + 32 + b.field_u);
          return;
        } else {
          di.a(true, 256);
          return;
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_12_0 = 0;
            if (param0 > ig.field_m.field_g) {
              if (dma.field_b != null) {
                try {
                  L0: {
                    var2_int = dma.field_b.b(-42);
                    if (var2_int > param1) {
                      L1: {
                        if (-ig.field_m.field_g + param0 >= var2_int) {
                          break L1;
                        } else {
                          var2_int = -ig.field_m.field_g + param0;
                          break L1;
                        }
                      }
                      dma.field_b.a(ig.field_m.field_g, (byte) 75, ig.field_m.field_h, var2_int);
                      pk.field_c = f.b((byte) 73);
                      ig.field_m.field_g = ig.field_m.field_g + var2_int;
                      if (param0 > ig.field_m.field_g) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        ig.field_m.field_g = 0;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    } else {
                      if (var2_int < 0) {
                        vc.a((byte) -106);
                        return false;
                      } else {
                        if (30000L >= ag.e(param1 ^ -9109)) {
                          break L0;
                        } else {
                          vc.a((byte) -106);
                          return false;
                        }
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  vc.a((byte) -79);
                  return false;
                }
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ii(int param0, int param1, lu param2) {
        this(param0, param1, qi.a(param2, (byte) 80));
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener((java.awt.event.KeyListener) (Object) vv.field_e);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) vv.field_e);
            int var2_int = -78 / ((13 - param0) / 48);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ii.P(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ii(int param0, lu param1) {
        this(param0, param1.e((byte) 100), qi.a(param1, (byte) 21));
    }

    final static void a(String param0, boolean param1, int param2, uha param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ik var9 = null;
        String var10 = null;
        ik var11 = null;
        String var12 = null;
        ik var13 = null;
        String var14 = null;
        ik var15 = null;
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
              mna.a(param3.f((byte) -92), (int[]) null, 0L, (String) null, (String) null, -1, -99, p.field_n, (sna) (Object) param3);
              if (!param3.field_Zb) {
                break L1;
              } else {
                L2: {
                  if (2 == param3.field_Lb) {
                    break L2;
                  } else {
                    if (hea.field_r < 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var9 = ms.field_u;
                var10 = lga.a(true, new String[1], bea.field_s);
                var9.field_a.a(var10, true, 10);
                break L1;
              }
            }
            L3: {
              ms.field_u.b(true);
              if (!param1) {
                break L3;
              } else {
                if (hja.field_i != ms.field_u.field_k) {
                  var13 = ms.field_u;
                  var14 = lga.a(true, new String[1], jh.field_k);
                  var13.field_a.a(var14, true, 15);
                  break L3;
                } else {
                  var11 = ms.field_u;
                  var12 = lga.a(true, new String[1], wl.field_wb);
                  var11.field_a.a(var12, true, 16);
                  break L3;
                }
              }
            }
            L4: {
              var15 = ms.field_u;
              if (param2 == -3) {
                break L4;
              } else {
                field_m = null;
                break L4;
              }
            }
            var5 = nfa.field_a;
            var6 = jc.field_r;
            var15.field_a.a(0, false, var5, 0, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ii.U(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    ii(int param0, int param1, nq param2) {
        super(param0);
        try {
            ((ii) this).field_k = param1;
            ((ii) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ii.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new eaa();
    }
}
