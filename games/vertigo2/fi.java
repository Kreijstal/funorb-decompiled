/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private gp field_i;
    static String field_j;
    static byte[] field_c;
    static tj field_b;
    private long field_d;
    static String field_e;
    private int field_h;
    private int field_g;
    private gp field_a;
    private gp[] field_f;

    final static void a(int param0, boolean param1, String param2) {
        try {
            bf.field_a = param1;
            ed.field_t = true;
            df.field_l = new fj(ch.field_e, sg.field_a, param2, tk.field_e, bf.field_a);
            ch.field_e.b(df.field_l, param0 ^ param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "fi.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gp param0, long param1, int param2) {
        gp var5 = null;
        try {
            if (!(null == param0.field_o)) {
                param0.a(-107);
            }
            int var6 = 118 / ((param2 - -20) / 35);
            var5 = this.field_f[(int)(param1 & (long)(-1 + this.field_g))];
            param0.field_p = var5;
            param0.field_o = var5.field_o;
            param0.field_o.field_p = param0;
            param0.field_n = param1;
            param0.field_p.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "fi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_j = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final gp a(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        Object var4;
        gp var4_ref;
        gp var5;
        gp var29;
        gp var57;
        gp var58;
        gp var59;
        var3 = Vertigo2.field_L ? 1 : 0;
        if ((this.field_h ^ -1) >= -1) {
          if (param0 != -60) {
            this.a(-90);
            L0: while (true) {
              if (this.field_g > this.field_h) {
                fieldTemp$4 = this.field_h;
                this.field_h = this.field_h + 1;
                var4_ref = this.field_f[fieldTemp$4].field_p;
                var59 = var4_ref;
                if (var4_ref == this.field_f[-1 + this.field_h]) {
                  continue L0;
                } else {
                  this.field_a = var59.field_p;
                  return var59;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (this.field_g > this.field_h) {
                fieldTemp$5 = this.field_h;
                this.field_h = this.field_h + 1;
                var4_ref = this.field_f[fieldTemp$5].field_p;
                var58 = var4_ref;
                if (var4_ref == this.field_f[-1 + this.field_h]) {
                  continue L1;
                } else {
                  this.field_a = var58.field_p;
                  return var58;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (this.field_a == this.field_f[this.field_h - 1]) {
            if (param0 != -60) {
              this.a(-90);
              L2: while (true) {
                if (this.field_g > this.field_h) {
                  fieldTemp$6 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var4_ref = this.field_f[fieldTemp$6].field_p;
                  var29 = var4_ref;
                  if (var4_ref == this.field_f[-1 + this.field_h]) {
                    continue L2;
                  } else {
                    this.field_a = var29.field_p;
                    return var29;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L3: while (true) {
                if (this.field_g > this.field_h) {
                  fieldTemp$7 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var4_ref = this.field_f[fieldTemp$7].field_p;
                  var5 = var4_ref;
                  if (var4_ref == this.field_f[-1 + this.field_h]) {
                    continue L3;
                  } else {
                    this.field_a = var5.field_p;
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var57 = this.field_a;
            this.field_a = var57.field_p;
            return var57;
          }
        }
    }

    final static co a(int param0, r param1, r param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 34 % ((-6 - param4) / 33);
            if (hq.a(124, param0, param3, param1)) {
              stackIn_4_0 = m.a(param2.a(param0, param3, (byte) -103), 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("fi.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (co) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final gp b(int param0) {
        int var2 = 59 / ((-72 - param0) / 53);
        this.field_h = 0;
        return this.a((byte) -60);
    }

    final gp a(int param0, long param1) {
        gp var4;
        gp var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        this.field_d = param1;
        if (param0 == 3661) {
          var4 = this.field_f[(int)((long)(this.field_g - 1) & param1)];
          this.field_i = var4.field_p;
          L0: while (true) {
            if (var4 != this.field_i) {
              if ((param1 ^ -1L) == (this.field_i.field_n ^ -1L)) {
                var5 = this.field_i;
                this.field_i = this.field_i.field_p;
                return var5;
              } else {
                this.field_i = this.field_i.field_p;
                continue L0;
              }
            } else {
              this.field_i = null;
              return null;
            }
          }
        } else {
          return (gp) null;
        }
    }

    final gp a(int param0) {
        gp var2;
        gp var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != this.field_i) {
          if (param0 <= -89) {
            var2 = this.field_f[(int)(this.field_d & (long)(-1 + this.field_g))];
            L0: while (true) {
              if (this.field_i != var2) {
                if ((this.field_i.field_n ^ -1L) == (this.field_d ^ -1L)) {
                  var3 = this.field_i;
                  this.field_i = this.field_i.field_p;
                  return var3;
                } else {
                  this.field_i = this.field_i.field_p;
                  continue L0;
                }
              } else {
                this.field_i = null;
                return null;
              }
            }
          } else {
            return (gp) null;
          }
        } else {
          return null;
        }
    }

    fi(int param0) {
        gp dupTemp$1 = null;
        int var2;
        gp var3;
        this.field_h = 0;
        this.field_g = param0;
        this.field_f = new gp[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$1 = new gp();
            var3 = dupTemp$1;
            this.field_f[var2] = dupTemp$1;
            var3.field_p = var3;
            var3.field_o = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_j = "Average rating";
        field_b = new tj();
    }
}
