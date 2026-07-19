/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sk implements Iterable {
    vg[] field_e;
    static int[] field_f;
    private vg field_d;
    private vg field_a;
    int field_g;
    static int[] field_c;
    private int field_b;

    public static void b(int param0) {
        field_c = null;
        if (param0 != 33) {
            sk.b(99);
        }
        field_f = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new nd((sk) (this)));
    }

    final void a(vg param0, byte param1, long param2) {
        if (!(param0.field_e == null)) {
            param0.p(92);
        }
        vg var5 = this.field_e[(int)(param2 & (long)(-1 + this.field_g))];
        param0.field_e = var5.field_e;
        if (param1 < 98) {
            return;
        }
        try {
            param0.field_a = var5;
            param0.field_e.field_a = param0;
            param0.field_a.field_e = param0;
            param0.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        vg var3 = null;
        vg var4 = null;
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            if (var2 >= this.field_g) {
              this.field_d = null;
              stackOut_12_0 = this;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackIn_13_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var5 != 0) {
                break L1;
              } else {
                var3 = ((sk) (this)).field_e[var2];
                L2: while (true) {
                  L3: {
                    L4: {
                      var4 = var3.field_a;
                      if (var3 == var4) {
                        if (var5 != 0) {
                          break L4;
                        } else {
                          if (var5 == 0) {
                            break L3;
                          } else {
                            var4.p(92);
                            break L4;
                          }
                        }
                      } else {
                        var4.p(92);
                        break L4;
                      }
                    }
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L0;
                }
              }
            }
          }
          ((sk) (this)).field_a = null;
          return;
        }
    }

    final vg b(byte param0) {
        if (param0 != 35) {
            this.field_d = (vg) null;
        }
        this.field_b = 0;
        return this.a((byte) 55);
    }

    sk(int param0) {
        int var2 = 0;
        vg dupTemp$0 = null;
        vg var3 = null;
        this.field_b = 0;
        this.field_e = new vg[param0];
        this.field_g = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new vg();
            var3 = dupTemp$0;
            this.field_e[var2] = dupTemp$0;
            var3.field_e = var3;
            var3.field_a = var3;
        }
    }

    final vg a(byte param0) {
        vg discarded$0 = null;
        int fieldTemp$1 = 0;
        vg var2 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 55) {
            discarded$0 = this.a(100L, true);
        }
        if (this.field_b > 0) {
            if (this.field_e[this.field_b - 1] != this.field_a) {
                var2 = this.field_a;
                this.field_a = var2.field_a;
                return var2;
            }
        }
        do {
            if (this.field_b >= this.field_g) {
                return null;
            }
            fieldTemp$1 = this.field_b;
            this.field_b = this.field_b + 1;
            var2 = this.field_e[fieldTemp$1].field_a;
            if (this.field_e[-1 + this.field_b] != var2) {
                this.field_a = var2.field_a;
                return var2;
            }
        } while (var3 == 0);
        return null;
    }

    final vg a(long param0, boolean param1) {
        vg var4 = null;
        vg var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = this.field_e[(int)((long)(-1 + this.field_g) & param0)];
        this.field_d = var4.field_a;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == this.field_d) {
                break L2;
              } else {
                stackOut_2_0 = (param0 < this.field_d.field_d ? -1 : (param0 == this.field_d.field_d ? 0 : 1));
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == 0) {
                    var5 = this.field_d;
                    this.field_d = this.field_d.field_a;
                    return var5;
                  } else {
                    this.field_d = this.field_d.field_a;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = param1;
            stackIn_8_0 = stackOut_7_0 ? 1 : 0;
            break L1;
          }
          L3: {
            if (stackIn_8_0 == 0) {
              break L3;
            } else {
              field_c = (int[]) null;
              break L3;
            }
          }
          this.field_d = null;
          return null;
        }
    }

    static {
        field_f = new int[]{15, 12, 18, 33};
        field_c = new int[256];
    }
}
