/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_a;
    static o[] field_e;
    private int field_c;
    static o[] field_f;
    private gg field_h;
    private gg[] field_g;
    static int field_d;
    private gg field_b;
    private int field_i;

    final gg c(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        gg var4 = null;
        gg var5 = null;
        gg var9 = null;
        gg var12 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 49) {
          if (0 < this.field_c) {
            if (this.field_g[this.field_c + -1] == this.field_h) {
              L0: while (true) {
                if (this.field_i > this.field_c) {
                  fieldTemp$2 = this.field_c;
                  this.field_c = this.field_c + 1;
                  var4 = this.field_g[fieldTemp$2].field_d;
                  var9 = var4;
                  if (var4 != this.field_g[this.field_c + -1]) {
                    this.field_h = var9.field_d;
                    return var9;
                  } else {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              var12 = this.field_h;
              this.field_h = var12.field_d;
              return var12;
            }
          } else {
            L1: while (true) {
              if (this.field_i > this.field_c) {
                fieldTemp$3 = this.field_c;
                this.field_c = this.field_c + 1;
                var4 = this.field_g[fieldTemp$3].field_d;
                var5 = var4;
                if (var4 != this.field_g[this.field_c + -1]) {
                  this.field_h = var5.field_d;
                  return var5;
                } else {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return (gg) null;
        }
    }

    final gg a(boolean param0, long param1) {
        gg discarded$2 = null;
        gg var4 = null;
        gg var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = this.field_g[(int)((long)(this.field_i + -1) & param1)];
        this.field_b = var4.field_d;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == this.field_b) {
                break L2;
              } else {
                stackOut_2_0 = ((this.field_b.field_g ^ -1L) < (param1 ^ -1L) ? -1 : ((this.field_b.field_g ^ -1L) == (param1 ^ -1L) ? 0 : 1));
                stackIn_8_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0 == 0) {
                    var5 = this.field_b;
                    this.field_b = this.field_b.field_d;
                    return var5;
                  } else {
                    this.field_b = this.field_b.field_d;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            this.field_b = null;
            stackOut_7_0 = param0;
            stackIn_8_0 = stackOut_7_0 ? 1 : 0;
            break L1;
          }
          if (stackIn_8_0 == 1) {
            return null;
          } else {
            discarded$2 = this.c((byte) -46);
            return null;
          }
        }
    }

    final gg b(int param0) {
        this.field_c = param0;
        return this.c((byte) 107);
    }

    final static void a(byte param0) {
        h.a(4, true);
        if (param0 == -13) {
            return;
        }
        qd.a(28);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 4) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    final void a(byte param0, gg param1, long param2) {
        gg var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1.field_a != null) {
                param1.c(10);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = this.field_g[(int)(param2 & (long)(this.field_i - 1))];
            param1.field_d = var5;
            param1.field_a = var5.field_a;
            param1.field_a.field_d = param1;
            param1.field_d.field_a = param1;
            param1.field_g = param2;
            if (param0 > 22) {
              break L0;
            } else {
              field_d = -118;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("qd.F(").append(param0).append(',');
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
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final static boolean b(byte param0) {
        L0: {
          if (te.field_O != -1) {
            break L0;
          } else {
            if (!bf.c(79, 1)) {
              return false;
            } else {
              te.field_O = te.field_N.j(255);
              te.field_N.field_m = 0;
              break L0;
            }
          }
        }
        L1: {
          if ((te.field_O ^ -1) != 1) {
            break L1;
          } else {
            if (bf.c(36, 2)) {
              te.field_O = te.field_N.i(-22);
              te.field_N.field_m = 0;
              break L1;
            } else {
              return false;
            }
          }
        }
        if (param0 <= 124) {
          qd.a(-104);
          return bf.c(100, te.field_O);
        } else {
          return bf.c(100, te.field_O);
        }
    }

    qd(int param0) {
        gg dupTemp$2 = null;
        int var2 = 0;
        gg var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_c = 0;
        this.field_g = new gg[param0];
        this.field_i = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new gg();
            var3 = dupTemp$2;
            this.field_g[var2] = dupTemp$2;
            var3.field_a = var3;
            var3.field_d = var3;
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
        field_a = "To server list";
        field_d = 0;
    }
}
