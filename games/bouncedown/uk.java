/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    private int field_h;
    private int field_a;
    static bc field_d;
    private ai field_e;
    private ai[] field_c;
    static String field_b;
    private ai field_g;
    static tg[] field_f;

    public static void c(int param0) {
        field_f = null;
        int var1 = -69 % ((61 - param0) / 48);
        field_d = null;
        field_b = null;
    }

    final void a(long param0, int param1, ai param2) {
        ai var5 = null;
        try {
            if (!(null == param2.field_f)) {
                param2.c(2);
            }
            if (param1 < 18) {
                ai var6 = (ai) null;
                this.a(-59L, -124, (ai) null);
            }
            var5 = this.field_c[(int)(param0 & (long)(this.field_a - 1))];
            param2.field_f = var5.field_f;
            param2.field_c = var5;
            param2.field_f.field_c = param2;
            param2.field_d = param0;
            param2.field_c.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "uk.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ai a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        ai var4 = null;
        ai var5 = null;
        ai var6 = null;
        ai var9 = null;
        var3 = Bounce.field_N;
        if (param0 > (this.field_h ^ -1)) {
          if (this.field_e == this.field_c[-1 + this.field_h]) {
            L0: while (true) {
              if (this.field_a > this.field_h) {
                fieldTemp$2 = this.field_h;
                this.field_h = this.field_h + 1;
                var4 = this.field_c[fieldTemp$2].field_c;
                var6 = var4;
                if (var4 != this.field_c[this.field_h + -1]) {
                  this.field_e = var6.field_c;
                  return var6;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            var9 = this.field_e;
            this.field_e = var9.field_c;
            return var9;
          }
        } else {
          L1: while (true) {
            if (this.field_a > this.field_h) {
              fieldTemp$3 = this.field_h;
              this.field_h = this.field_h + 1;
              var4 = this.field_c[fieldTemp$3].field_c;
              var5 = var4;
              if (var4 != this.field_c[this.field_h + -1]) {
                this.field_e = var5.field_c;
                return var5;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final ai a(int param0, long param1) {
        ai var4 = null;
        ai var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        var4 = this.field_c[(int)(param1 & (long)(this.field_a + -1))];
        this.field_g = var4.field_c;
        L0: while (true) {
          if (this.field_g == var4) {
            this.field_g = null;
            if (param0 >= 7) {
              return null;
            } else {
              uk.c(-8);
              return null;
            }
          } else {
            if ((param1 ^ -1L) != (this.field_g.field_d ^ -1L)) {
              this.field_g = this.field_g.field_c;
              continue L0;
            } else {
              var5 = this.field_g;
              this.field_g = this.field_g.field_c;
              return var5;
            }
          }
        }
    }

    final ai b(int param0) {
        this.field_h = param0;
        return this.a(-1);
    }

    final static lj a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oh var6 = null;
        Object stackIn_7_0 = null;
        lj stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lj stackOut_11_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var2_int <= var3) {
                L2: {
                  if (param0 == -58) {
                    break L2;
                  } else {
                    var6 = (oh) null;
                    uk.a((oh) null, 104, 43, (oh) null, -71, (byte) 23);
                    break L2;
                  }
                }
                stackOut_11_0 = mh.field_R;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("uk.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lj) ((Object) stackIn_7_0);
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(oh param0, int param1, int param2, oh param3, int param4, byte param5) {
        try {
            if (param5 != 82) {
                uk.c(1);
            }
            hj.field_a = param2;
            le.field_a = param3;
            cl.field_m = param1;
            d.field_F = param0;
            kk.field_z = param4;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "uk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    uk(int param0) {
        ai dupTemp$2 = null;
        int var2 = 0;
        ai var3 = null;
        this.field_h = 0;
        this.field_a = param0;
        this.field_c = new ai[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new ai();
            var3 = dupTemp$2;
            this.field_c[var2] = dupTemp$2;
            var3.field_c = var3;
            var3.field_f = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_d = new bc();
        field_b = "Close";
    }
}
