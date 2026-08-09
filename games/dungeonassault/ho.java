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
        this.field_a = 1;
        this.field_g = null;
        if (param0 <= 51) {
            field_i = (String) null;
        }
        this.field_d = this.field_h.field_d[0].field_e;
    }

    public final void remove() {
        if (!(this.field_g != null)) {
            throw new IllegalStateException();
        }
        this.field_g.a(false);
        this.field_g = null;
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
        int var1_int = 0;
        int var2 = 0;
        pp stackIn_16_0 = null;
        pp stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == -36) {
              ac.field_s = 0;
              var1_int = 0;
              L1: while (true) {
                if ((var1_int ^ -1) <= -9) {
                  L2: {
                    stackIn_16_0 = sn.field_b;

                    if (gm.field_d.field_s < ac.field_s) {
                      stackIn_17_0 = (pp) ((Object) stackIn_16_0);
                      stackIn_17_1 = 0;
                      break L2;
                    } else {
                      stackIn_17_0 = (pp) ((Object) stackIn_16_0);
                      stackIn_17_1 = 1;
                      break L2;
                    }
                  }
                  stackIn_17_0.field_w = stackIn_17_1 != 0;
                  lb.a(true);
                  decompiledRegionSelector0 = 1;
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
                        ac.field_s = ac.field_s + ib.a(um.field_i[var1_int].field_n, 918);
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "ho.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        ne var1;
        int var2;
        var2 = DungeonAssault.field_K;
        if (this.field_h.field_d[-1 + this.field_a] != this.field_d) {
          var1 = this.field_d;
          this.field_g = var1;
          this.field_d = var1.field_e;
          return var1;
        } else {
          L0: while (true) {
            if (this.field_h.field_g > this.field_a) {
              fieldTemp$1 = this.field_a;
              this.field_a = this.field_a + 1;
              var1 = this.field_h.field_d[fieldTemp$1].field_e;
              if (this.field_h.field_d[this.field_a - 1] != var1) {
                this.field_g = var1;
                this.field_d = var1.field_e;
                return var1;
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
        int fieldTemp$0 = 0;
        int var2 = DungeonAssault.field_K;
        if (this.field_h.field_d[this.field_a - 1] != this.field_d) {
            return true;
        }
        while (this.field_a < this.field_h.field_g) {
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            if (this.field_h.field_d[fieldTemp$0].field_e != this.field_h.field_d[-1 + this.field_a]) {
                this.field_d = this.field_h.field_d[-1 + this.field_a].field_e;
                return true;
            }
            this.field_d = this.field_h.field_d[this.field_a + -1];
        }
        return false;
    }

    final static void a(qg param0, Object param1, byte param2) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
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
                L3: {
                  if (param2 == -32) {
                    break L3;
                  } else {
                    field_c = (String) null;
                    break L3;
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param1 != null) {
                        param0.field_e.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ho.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ho(qi param0) {
        this.field_g = null;
        try {
            this.field_h = param0;
            this.a((byte) 67);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ho.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Play free version";
        field_c = "Cost: <%0>";
        field_e = "<col=FF0000>Defence -3</col>";
        field_b = "Select a party leader, who will be first to enter the next room.";
    }
}
