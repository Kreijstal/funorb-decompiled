/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static String field_h;
    private hf[] field_e;
    static Boolean field_b;
    private hf field_a;
    private int field_c;
    private int field_f;
    private hf field_g;
    static bg field_d;

    final hf a(long param0, byte param1) {
        hf var5 = null;
        hf discarded$0 = null;
        hf var4 = this.field_e[(int)((long)(-1 + this.field_c) & param0)];
        this.field_g = var4.field_b;
        while (var4 != this.field_g) {
            if (!((this.field_g.field_a ^ -1L) != (param0 ^ -1L))) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_b;
                return var5;
            }
            this.field_g = this.field_g.field_b;
        }
        if (param1 >= -73) {
            discarded$0 = this.a((byte) -38);
            this.field_g = null;
            return null;
        }
        this.field_g = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 2048) {
            field_h = (String) null;
            param0 = param0 & 8191;
            if (-4097 >= (param0 ^ -1)) {
                return -6145 >= (param0 ^ -1) ? ai.field_l[-6144 + param0] : -ai.field_l[-param0 + 6144];
            }
            return 2048 <= param0 ? -ai.field_l[param0 + -2048] : ai.field_l[-param0 + 2048];
        }
        param0 = param0 & 8191;
        if (-4097 >= (param0 ^ -1)) {
            return -6145 >= (param0 ^ -1) ? ai.field_l[-6144 + param0] : -ai.field_l[-param0 + 6144];
        }
        return 2048 <= param0 ? -ai.field_l[param0 + -2048] : ai.field_l[-param0 + 2048];
    }

    final void a(byte param0, hf param1, long param2) {
        hf var5 = null;
        try {
            if (!(null == param1.field_c)) {
                param1.a(false);
            }
            var5 = this.field_e[(int)((long)(this.field_c + -1) & param2)];
            param1.field_b = var5;
            param1.field_c = var5.field_c;
            param1.field_c.field_b = param1;
            param1.field_a = param2;
            if (param0 != 102) {
                field_d = (bg) null;
            }
            param1.field_b.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fi.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, rf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1 == fe.field_e) {
                  break L2;
                } else {
                  uh.field_y.d(-9268);
                  fj.field_p.a();
                  fe.field_e = param1;
                  uh.field_y.a(true, fe.field_e, -1706);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("fi.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final hf a(byte param0) {
        if (param0 != 125) {
            fi.a(103);
            this.field_f = 0;
            return this.b(param0 + -195);
        }
        this.field_f = 0;
        return this.b(param0 + -195);
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 >= -113) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    fi(int param0) {
        hf dupTemp$2 = null;
        int var2 = 0;
        hf var3 = null;
        this.field_f = 0;
        this.field_c = param0;
        this.field_e = new hf[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new hf();
            var3 = dupTemp$2;
            this.field_e[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final hf b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        hf var3 = null;
        hf var4 = null;
        hf var7 = null;
        if (-1 > (this.field_f ^ -1)) {
          if (this.field_a != this.field_e[this.field_f + -1]) {
            var7 = this.field_a;
            this.field_a = var7.field_b;
            return var7;
          } else {
            L0: while (true) {
              if (this.field_c <= this.field_f) {
                var2 = 47 % ((param0 - 28) / 38);
                return null;
              } else {
                fieldTemp$2 = this.field_f;
                this.field_f = this.field_f + 1;
                var4 = this.field_e[fieldTemp$2].field_b;
                if (this.field_e[-1 + this.field_f] != var4) {
                  this.field_a = var4.field_b;
                  return var4;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_c <= this.field_f) {
              var2 = 47 % ((param0 - 28) / 38);
              return null;
            } else {
              fieldTemp$3 = this.field_f;
              this.field_f = this.field_f + 1;
              var3 = this.field_e[fieldTemp$3].field_b;
              if (this.field_e[-1 + this.field_f] != var3) {
                this.field_a = var3.field_b;
                return var3;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    static {
        field_h = "Change display name";
    }
}
