/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_g;
    static int field_e;
    java.awt.Frame field_i;
    static bd field_h;
    static int[] field_k;
    static bd field_j;
    static bd field_f;
    static ql field_a;
    static int field_d;
    static String field_b;
    static bd field_c;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_g = true;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ue.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.equals("I")) {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.equals("S")) {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param1.equals("J")) {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackIn_21_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L1: {
                          if (param0 == 0) {
                            break L1;
                          } else {
                            field_c = (bd) null;
                            break L1;
                          }
                        }
                        if (!param1.equals("D")) {
                          if (param1.equals("C")) {
                            stackIn_30_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackIn_26_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("ue.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      return stackIn_30_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (wb.field_R <= 0) {
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          L1: {
            ue.a((byte) -119);
            w.field_r = w.field_r + param0;
            qb.field_k = qb.field_k - param0;
            if (0 < rf.field_f) {
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            w.field_r = w.field_r + param0;
            qb.field_k = qb.field_k - param0;
            if (0 < rf.field_f) {
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    ue() {
    }

    final void a(boolean param0, fd param1) {
        try {
            sd.a(param1, -106, this.field_i);
            if (!param0) {
                field_h = (bd) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ue.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 != -27) {
          ue.a((byte) 62);
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        }
    }

    static {
        field_d = 0;
        field_a = new ql();
        field_b = "FROM ONLY";
    }
}
