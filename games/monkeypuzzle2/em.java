/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class em extends t {
    static pj field_C;
    static int field_B;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 84) {
                break L1;
              } else {
                field_B = 72;
                break L1;
              }
            }
            L2: {
              if (null == ch.a(param1, -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("em.S(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static ad a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            ca var8 = null;
            ad stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ad stackOut_14_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null == rk.field_g.field_t) {
                    break L1;
                  } else {
                    ah.field_f = new ch(rk.field_g.field_t, 5200, 0);
                    rk.field_g.field_t = null;
                    var6 = (Object) (Object) new gf(255, ah.field_f, new ch(rk.field_g.field_i, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (ah.field_f == null) {
                    break L2;
                  } else {
                    L3: {
                      if (bl.field_o == null) {
                        bl.field_o = new ch[rk.field_g.field_e.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null == bl.field_o[param1]) {
                        bl.field_o[param1] = new ch(rk.field_g.field_e[param1], 12000, 0);
                        rk.field_g.field_e[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new gf(param1, ah.field_f, bl.field_o[param1], 2097152);
                    break L2;
                  }
                }
                var8 = c.field_h.a(-24559, (gf) var6, param1, (gf) var7, param0);
                L5: {
                  if (!param2) {
                    break L5;
                  } else {
                    var8.a(-1);
                    break L5;
                  }
                }
                stackOut_14_0 = new ad((rf) (Object) var8, param3, param4);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(long param0, boolean param1) {
        if (param0 > 0L) {
          if (!param1) {
            if (0L != param0 % 10L) {
              hc.a(param0, (byte) -50);
              return;
            } else {
              hc.a(param0 - 1L, (byte) -50);
              hc.a(1L, (byte) -50);
              return;
            }
          } else {
            field_C = null;
            if (0L != param0 % 10L) {
              hc.a(param0, (byte) -50);
              return;
            } else {
              hc.a(param0 - 1L, (byte) -50);
              hc.a(1L, (byte) -50);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -27714) {
            field_B = 50;
            field_C = null;
            return;
        }
        field_C = null;
    }

    private em(String param0, of param1) {
        this(param0, hi.field_b.field_i, param1);
        try {
            ((em) this).field_h = hi.field_b.field_l;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "em.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(Object param0, byte param1, md param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2.field_b != null) {
            var3_int = 0;
            L0: while (true) {
              L1: {
                if (50 <= var3_int) {
                  break L1;
                } else {
                  if (param2.field_b.peekEvent() == null) {
                    break L1;
                  } else {
                    em.a(1L, false);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              L2: {
                if (param1 == -101) {
                  break L2;
                } else {
                  var5 = null;
                  boolean discarded$1 = em.a((byte) -42, (String) null);
                  break L2;
                }
              }
              try {
                L3: {
                  if (param0 != null) {
                    param2.field_b.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                    break L3;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                return;
              }
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("em.BA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    private em(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        try {
            ((em) this).field_h = hi.field_b.field_l;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "em.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((em) this).field_u) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((em) this).field_u = stackIn_3_1 != 0;
        if (param0 >= -23) {
          em.a(-109);
          super.b(-48, param1, param2, param3);
          return;
        } else {
          super.b(-48, param1, param2, param3);
          return;
        }
    }

    em(String param0, of param1, boolean param2) {
        this(param0, param1);
        try {
            ((em) this).field_u = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "em.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new pj();
    }
}
