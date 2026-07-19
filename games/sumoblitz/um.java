/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class um implements Iterable {
    int field_d;
    ms[] field_c;
    private ms field_b;
    private ms field_a;
    private int field_e;

    final static void b(int param0) {
        if (!(null == vv.field_b)) {
            vv.field_b.field_g = false;
        }
        jl.a(25, param0);
    }

    final ms c(int param0) {
        this.field_e = 0;
        if (param0 != -1) {
          this.field_c = (ms[]) null;
          return this.a(param0 + 0);
        } else {
          return this.a(param0 + 0);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ia((um) (this)));
    }

    final ms a(int param0, long param1) {
        ms var4 = null;
        ms var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var4 = this.field_c[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_a = var4.field_b;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == this.field_a) {
                break L2;
              } else {
                stackOut_2_0 = ((param1 ^ -1L) < (this.field_a.field_h ^ -1L) ? -1 : ((param1 ^ -1L) == (this.field_a.field_h ^ -1L) ? 0 : 1));
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == 0) {
                    var5 = this.field_a;
                    this.field_a = this.field_a.field_b;
                    return var5;
                  } else {
                    this.field_a = this.field_a.field_b;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            this.field_a = null;
            stackOut_7_0 = param0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          if (stackIn_8_0 == 575) {
            return null;
          } else {
            this.field_d = -69;
            return null;
          }
        }
    }

    final void a(int param0, ms param1, long param2) {
        ms var5 = null;
        try {
            if (!(param1.field_g == null)) {
                param1.b(false);
            }
            if (param0 != -20657) {
                this.field_d = -114;
            }
            var5 = this.field_c[(int)((long)(this.field_d - 1) & param2)];
            param1.field_g = var5.field_g;
            param1.field_b = var5;
            param1.field_g.field_b = param1;
            param1.field_h = param2;
            param1.field_b.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "um.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final ms a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        ms var4 = null;
        ms var5 = null;
        ms var6 = null;
        ms var9 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -1) {
          if (this.field_e > 0) {
            if (this.field_b == this.field_c[-1 + this.field_e]) {
              L0: while (true) {
                if (this.field_d > this.field_e) {
                  fieldTemp$2 = this.field_e;
                  this.field_e = this.field_e + 1;
                  var4 = this.field_c[fieldTemp$2].field_b;
                  var6 = var4;
                  if (var4 == this.field_c[-1 + this.field_e]) {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      return null;
                    }
                  } else {
                    this.field_b = var6.field_b;
                    return var6;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var9 = this.field_b;
              this.field_b = var9.field_b;
              return var9;
            }
          } else {
            L1: while (true) {
              if (this.field_d > this.field_e) {
                fieldTemp$3 = this.field_e;
                this.field_e = this.field_e + 1;
                var4 = this.field_c[fieldTemp$3].field_b;
                var5 = var4;
                if (var4 == this.field_c[-1 + this.field_e]) {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  this.field_b = var5.field_b;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return (ms) null;
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, byte param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
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
            if (param3 > 123) {
              break L0;
            } else {
              var5 = (java.awt.Canvas) null;
              um.a(-16, -25, (java.awt.Canvas) null, (byte) 50);
              break L0;
            }
          }
          try {
            L1: {
              var4 = param2.getGraphics();
              m.field_R.a(-52, param1, var4, param0);
              var4.dispose();
              break L1;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4_ref2);
            stackOut_6_1 = new StringBuilder().append("um.B(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    um(int param0) {
        ms dupTemp$2 = null;
        int var2 = 0;
        ms var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_e = 0;
        this.field_c = new ms[param0];
        this.field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new ms();
            var3 = dupTemp$2;
            this.field_c[var2] = dupTemp$2;
            var3.field_g = var3;
            var3.field_b = var3;
            var2++;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
    }
}
