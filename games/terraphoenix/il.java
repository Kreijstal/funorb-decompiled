/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private int field_f;
    static volatile boolean field_e;
    static byte[][] field_b;
    private uf field_g;
    private uf[] field_d;
    private int field_c;
    private uf field_a;

    final static void a(int param0, ci param1) {
        try {
            ja.c((byte) -52);
            if (param0 != 1) {
                ci var3 = (ci) null;
                il.a(74, (ci) null);
            }
            l.a(param1.field_z, param1.field_q, param1.field_u);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "il.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(uf param0, long param1, byte param2) {
        uf var5 = null;
        try {
            if (param2 >= -62) {
                this.a(false);
            }
            if (!(null == param0.field_a)) {
                param0.b((byte) 12);
            }
            var5 = this.field_d[(int)((long)(this.field_c - 1) & param1)];
            param0.field_d = var5;
            param0.field_a = var5.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            param0.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "il.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_b = (byte[][]) null;
        int var1 = 117 / ((50 - param0) / 52);
    }

    final static ci a(String param0, String param1, fa param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ci stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param2.c(param3, param1);
            var5 = param2.a(-117, var4_int, param0);
            stackIn_1_0 = hl.a(param2, var5, (byte) -90, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("il.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final uf a(byte param0, long param1) {
        uf var4;
        uf var5;
        int var6;
        var6 = Terraphoenix.field_V;
        if (param0 == 46) {
          var4 = this.field_d[(int)((long)(-1 + this.field_c) & param1)];
          this.field_g = var4.field_d;
          L0: while (true) {
            if (var4 == this.field_g) {
              this.field_g = null;
              return null;
            } else {
              if (this.field_g.field_g == param1) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_d;
                return var5;
              } else {
                this.field_g = this.field_g.field_d;
                continue L0;
              }
            }
          }
        } else {
          this.field_g = (uf) null;
          var4 = this.field_d[(int)((long)(-1 + this.field_c) & param1)];
          this.field_g = var4.field_d;
          L1: while (true) {
            if (var4 == this.field_g) {
              this.field_g = null;
              return null;
            } else {
              if (this.field_g.field_g == param1) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_d;
                return var5;
              } else {
                this.field_g = this.field_g.field_d;
                continue L1;
              }
            }
          }
        }
    }

    final uf a(byte param0) {
        this.field_f = 0;
        if (param0 != 117) {
            return (uf) null;
        }
        return this.a(true);
    }

    final uf a(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        Object var4;
        uf var4_ref;
        uf var5;
        uf var9;
        uf var12;
        var3 = Terraphoenix.field_V;
        if ((this.field_f ^ -1) < -1) {
          if (this.field_a != this.field_d[-1 + this.field_f]) {
            var12 = this.field_a;
            this.field_a = var12.field_d;
            return var12;
          } else {
            if (!param0) {
              return (uf) null;
            } else {
              L0: while (true) {
                if (this.field_f < this.field_c) {
                  fieldTemp$2 = this.field_f;
                  this.field_f = this.field_f + 1;
                  var4_ref = this.field_d[fieldTemp$2].field_d;
                  var9 = var4_ref;
                  if (var4_ref == this.field_d[this.field_f - 1]) {
                    continue L0;
                  } else {
                    this.field_a = var9.field_d;
                    return var9;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          if (!param0) {
            return (uf) null;
          } else {
            L1: while (true) {
              if (this.field_f < this.field_c) {
                fieldTemp$3 = this.field_f;
                this.field_f = this.field_f + 1;
                var4_ref = this.field_d[fieldTemp$3].field_d;
                var5 = var4_ref;
                if (var4_ref == this.field_d[this.field_f - 1]) {
                  continue L1;
                } else {
                  this.field_a = var5.field_d;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        fa var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 70) {
                break L1;
              } else {
                var3 = (fa) null;
                il.a((String) null, (String) null, (fa) null, -14);
                break L1;
              }
            }
            stackIn_3_0 = nj.field_i.a("", param1, -21653);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("il.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    il(int param0) {
        uf dupTemp$1 = null;
        int var2;
        uf var3;
        this.field_f = 0;
        this.field_d = new uf[param0];
        this.field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$1 = new uf();
            var3 = dupTemp$1;
            this.field_d[var2] = dupTemp$1;
            var3.field_d = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_b = new byte[1000][];
        field_e = true;
    }
}
