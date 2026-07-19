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
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("em.S(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static ad a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            ca var8 = null;
            ad stackIn_12_0 = null;
            ad stackIn_16_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            ad stackOut_15_0 = null;
            ad stackOut_11_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (null == rk.field_g.field_t) {
                    break L1;
                  } else {
                    ah.field_f = new ch(rk.field_g.field_t, 5200, 0);
                    rk.field_g.field_t = null;
                    var6 = new gf(255, ah.field_f, new ch(rk.field_g.field_i, 12000, 0), 2097152);
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
                    var7 = new gf(param1, ah.field_f, bl.field_o[param1], 2097152);
                    break L2;
                  }
                }
                var8 = c.field_h.a(-24559, (gf) (var6), param1, (gf) (var7), param0);
                if (param5 == 50) {
                  L5: {
                    if (!param2) {
                      break L5;
                    } else {
                      var8.a(-1);
                      break L5;
                    }
                  }
                  stackOut_15_0 = new ad(var8, param3, param4);
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_11_0 = (ad) null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_12_0;
            } else {
              return stackIn_16_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(long param0, boolean param1) {
        if ((param0 ^ -1L) < -1L) {
          if (!param1) {
            if (0L != param0 % 10L) {
              hc.a(param0, (byte) -50);
              if (MonkeyPuzzle2.field_F) {
                hc.a(param0 - 1L, (byte) -50);
                hc.a(1L, (byte) -50);
                return;
              } else {
                return;
              }
            } else {
              hc.a(param0 - 1L, (byte) -50);
              hc.a(1L, (byte) -50);
              return;
            }
          } else {
            field_C = (pj) null;
            if (0L != param0 % 10L) {
              hc.a(param0, (byte) -50);
              if (!MonkeyPuzzle2.field_F) {
                return;
              } else {
                hc.a(param0 - 1L, (byte) -50);
                hc.a(1L, (byte) -50);
                return;
              }
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
            this.field_h = hi.field_b.field_l;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Object param0, byte param1, md param2) {
        boolean discarded$1 = false;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        String var5 = null;
        java.awt.AWTEvent stackIn_6_0 = null;
        java.awt.AWTEvent stackIn_12_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        java.awt.AWTEvent stackOut_5_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.field_b != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (50 <= var3_int) {
                      break L3;
                    } else {
                      stackOut_5_0 = param2.field_b.peekEvent();
                      stackIn_12_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 == null) {
                          break L3;
                        } else {
                          em.a(1L, false);
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    if (param1 == -101) {
                      break L4;
                    } else {
                      var5 = (String) null;
                      discarded$1 = em.a((byte) -42, (String) null);
                      break L4;
                    }
                  }
                  stackOut_11_0 = param0;
                  stackIn_12_0 = (java.awt.AWTEvent) ((Object) stackOut_11_0);
                  break L2;
                }
                if (stackIn_12_0 != null) {
                  try {
                    L5: {
                      param2.field_b.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = (Exception) (Object) decompiledCaughtException;
                    return;
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("em.BA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    private em(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        try {
            this.field_h = hi.field_b.field_l;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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
          if (this.field_u) {
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
        ((em) (this)).field_u = stackIn_3_1 != 0;
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
            this.field_u = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_C = new pj();
    }
}
