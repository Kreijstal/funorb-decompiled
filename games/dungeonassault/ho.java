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

    private final void a(byte param0) {
        ((ho) this).field_a = 1;
        ((ho) this).field_g = null;
        if (param0 <= 51) {
            field_i = null;
        }
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
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_i = null;
        field_c = null;
        field_e = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        pp stackIn_15_0 = null;
        pp stackIn_16_0 = null;
        pp stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        pp stackOut_14_0 = null;
        pp stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        pp stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var2 = DungeonAssault.field_K;
        if (param0 == -36) {
          ac.field_s = 0;
          var1 = 0;
          L0: while (true) {
            if ((var1 ^ -1) <= -9) {
              L1: {
                stackOut_14_0 = sn.field_b;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (gm.field_d.field_s < ac.field_s) {
                  stackOut_16_0 = (pp) (Object) stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L1;
                } else {
                  stackOut_15_0 = (pp) (Object) stackIn_15_0;
                  stackOut_15_1 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L1;
                }
              }
              stackIn_17_0.field_w = stackIn_17_1 != 0;
              lb.a(true);
              return;
            } else {
              if (um.field_i[var1] != null) {
                if (um.field_i[var1] != gm.field_d.field_a[var1]) {
                  L2: {
                    if (gm.field_d.field_a[var1] == null) {
                      break L2;
                    } else {
                      if (gm.field_d.field_a[var1].field_c == um.field_i[var1].field_c) {
                        ac.field_s = ac.field_s + gj.a(-1704798751, um.field_i[var1].field_n);
                        var1++;
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ac.field_s = ac.field_s + ib.a(um.field_i[var1].field_n, 918);
                  var1++;
                  continue L0;
                } else {
                  var1++;
                  continue L0;
                }
              } else {
                var1++;
                continue L0;
              }
            }
          }
        } else {
          return;
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
              ((ho) this).field_a = ((ho) this).field_a + 1;
              var1 = ((ho) this).field_h.field_d[((ho) this).field_a].field_e;
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
            ((ho) this).field_a = ((ho) this).field_a + 1;
            if (((ho) this).field_h.field_d[((ho) this).field_a].field_e != ((ho) this).field_h.field_d[-1 + ((ho) this).field_a]) {
                ((ho) this).field_d = ((ho) this).field_h.field_d[-1 + ((ho) this).field_a].field_e;
                return true;
            }
            ((ho) this).field_d = ((ho) this).field_h.field_d[((ho) this).field_a + -1];
        }
        return false;
    }

    final static void a(qg param0, Object param1, byte param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        if (param0.field_e != null) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (50 <= var3_int) {
                break L1;
              } else {
                if (null == param0.field_e.peekEvent()) {
                  break L1;
                } else {
                  pj.a(0, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param2 == -32) {
                break L2;
              } else {
                field_c = null;
                break L2;
              }
            }
            try {
              L3: {
                if (param1 != null) {
                  param0.field_e.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                  break L3;
                } else {
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    ho(qi param0) {
        ((ho) this).field_g = null;
        ((ho) this).field_h = param0;
        this.a((byte) 67);
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
