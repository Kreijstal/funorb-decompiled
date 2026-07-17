/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ho implements Iterator {
    static String field_f;
    static String field_c;
    static String field_i;
    private ne field_g;
    static String field_b;
    static String field_e;
    private ne field_d;
    private qi field_h;
    private int field_a;

    private final void a() {
        ((ho) this).field_a = 1;
        ((ho) this).field_g = null;
        ((ho) this).field_d = ((ho) this).field_h.field_d[0].field_e;
    }

    public final void remove() {
        if (!(((ho) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((ho) this).field_g.a(false);
        ((ho) this).field_g = null;
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_i = null;
        field_c = null;
        field_e = null;
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        pp stackIn_15_0 = null;
        pp stackIn_16_0 = null;
        pp stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_14_0 = null;
        pp stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        pp stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            ac.field_s = 0;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 8) {
                L2: {
                  stackOut_14_0 = sn.field_b;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (gm.field_d.field_s < ac.field_s) {
                    stackOut_16_0 = (pp) (Object) stackIn_16_0;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L2;
                  } else {
                    stackOut_15_0 = (pp) (Object) stackIn_15_0;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L2;
                  }
                }
                stackIn_17_0.field_w = stackIn_17_1 != 0;
                int discarded$506 = 1;
                lb.a();
                break L0;
              } else {
                L3: {
                  if (um.field_i[var1_int] != null) {
                    if (um.field_i[var1_int] == gm.field_d.field_a[var1_int]) {
                      break L3;
                    } else {
                      L4: {
                        if (gm.field_d.field_a[var1_int] == null) {
                          break L4;
                        } else {
                          if (gm.field_d.field_a[var1_int].field_c == um.field_i[var1_int].field_c) {
                            ac.field_s = ac.field_s + gj.a(-1704798751, um.field_i[var1_int].field_n);
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      int discarded$507 = 918;
                      ac.field_s = ac.field_s + ib.a(um.field_i[var1_int].field_n);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ho.C(" + -36 + 41);
        }
    }

    public final Object next() {
        ne var1 = null;
        int var2 = 0;
        var2 = DungeonAssault.field_K;
        if (((ho) this).field_h.field_d[-1 + ((ho) this).field_a] != ((ho) this).field_d) {
          var1 = ((ho) this).field_d;
          ((ho) this).field_g = var1;
          ((ho) this).field_d = var1.field_e;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((ho) this).field_h.field_g > ((ho) this).field_a) {
              int fieldTemp$2 = ((ho) this).field_a;
              ((ho) this).field_a = ((ho) this).field_a + 1;
              var1 = ((ho) this).field_h.field_d[fieldTemp$2].field_e;
              if (((ho) this).field_h.field_d[((ho) this).field_a - 1] != var1) {
                ((ho) this).field_g = var1;
                ((ho) this).field_d = var1.field_e;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    public final boolean hasNext() {
        int var2 = DungeonAssault.field_K;
        if (((ho) this).field_h.field_d[((ho) this).field_a - 1] != ((ho) this).field_d) {
            return true;
        }
        while (((ho) this).field_a < ((ho) this).field_h.field_g) {
            int fieldTemp$0 = ((ho) this).field_a;
            ((ho) this).field_a = ((ho) this).field_a + 1;
            if (((ho) this).field_h.field_d[fieldTemp$0].field_e != ((ho) this).field_h.field_d[-1 + ((ho) this).field_a]) {
                ((ho) this).field_d = ((ho) this).field_h.field_d[-1 + ((ho) this).field_a].field_e;
                return true;
            }
            ((ho) this).field_d = ((ho) this).field_h.field_d[((ho) this).field_a + -1];
        }
        return false;
    }

    final static void a(qg param0, Object param1) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
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
        Throwable decompiledCaughtException = null;
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
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0.field_e != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (50 <= var3_int) {
                    break L2;
                  } else {
                    if (null == param0.field_e.peekEvent()) {
                      break L2;
                    } else {
                      pj.a(0, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param1 != null) {
                        param0.field_e.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("ho.B(");
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
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
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
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -32 + 41);
        }
    }

    ho(qi param0) {
        ((ho) this).field_g = null;
        try {
            ((ho) this).field_h = param0;
            int discarded$0 = 67;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ho.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Play free version";
        field_c = "Cost: <%0>";
        field_e = "<col=FF0000>Defence -3</col>";
        field_b = "Select a party leader, who will be first to enter the next room.";
    }
}
