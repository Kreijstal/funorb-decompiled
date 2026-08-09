/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp {
    static at field_e;
    private long field_d;
    private ms[] field_h;
    private int field_b;
    private ms field_a;
    static String field_c;
    static String field_f;
    private int field_i;
    private ms field_g;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final ms d(int param0) {
        ms var2;
        ms var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_g != null) {
          var2 = this.field_h[(int)(this.field_d & (long)(this.field_b + -1))];
          if (param0 != -348) {
            return (ms) null;
          } else {
            L0: while (true) {
              if (var2 == this.field_g) {
                this.field_g = null;
                return null;
              } else {
                if ((this.field_d ^ -1L) != (this.field_g.field_q ^ -1L)) {
                  this.field_g = this.field_g.field_s;
                  continue L0;
                } else {
                  var3 = this.field_g;
                  this.field_g = this.field_g.field_s;
                  return var3;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        int var1 = 20 / ((11 - param0) / 56);
    }

    final ms a(byte param0, long param1) {
        ms var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_d = param1;
        ms var4 = this.field_h[(int)((long)(this.field_b + -1) & param1)];
        this.field_g = var4.field_s;
        while (var4 != this.field_g) {
            if ((this.field_g.field_q ^ -1L) == (param1 ^ -1L)) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_s;
                return var5;
            }
            this.field_g = this.field_g.field_s;
        }
        if (param0 != -27) {
            ms var7 = (ms) null;
            this.a(-62, 115L, (ms) null);
            this.field_g = null;
            return null;
        }
        this.field_g = null;
        return null;
    }

    final ms a(byte param0) {
        if (param0 != 66) {
            field_f = (String) null;
            this.field_i = 0;
            return this.c(1);
        }
        this.field_i = 0;
        return this.c(1);
    }

    final static int b(int param0) {
        if (param0 > -68) {
            return -119;
        }
        return (int)(1000000000L / rd.field_i);
    }

    final void a(int param0, long param1, ms param2) {
        ms var5 = null;
        try {
            if (param2.field_l != null) {
                param2.c((byte) -76);
            }
            var5 = this.field_h[(int)(param1 & (long)(param0 + this.field_b))];
            param2.field_l = var5.field_l;
            param2.field_s = var5;
            param2.field_l.field_s = param2;
            param2.field_q = param1;
            param2.field_s.field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tp.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ms c(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var3;
        ms var4;
        ms var5;
        ms var6;
        ms var9;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((this.field_i ^ -1) < -1) {
          if (this.field_h[this.field_i - 1] != this.field_a) {
            var9 = this.field_a;
            this.field_a = var9.field_s;
            return var9;
          } else {
            L0: while (true) {
              if (this.field_i >= this.field_b) {
                if (param0 != 1) {
                  return (ms) null;
                } else {
                  return null;
                }
              } else {
                fieldTemp$3 = this.field_i;
                this.field_i = this.field_i + 1;
                var4 = this.field_h[fieldTemp$3].field_s;
                var6 = var4;
                if (var4 != this.field_h[-1 + this.field_i]) {
                  this.field_a = var6.field_s;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_i >= this.field_b) {
              if (param0 != 1) {
                return (ms) null;
              } else {
                return null;
              }
            } else {
              fieldTemp$4 = this.field_i;
              this.field_i = this.field_i + 1;
              var4 = this.field_h[fieldTemp$4].field_s;
              var5 = var4;
              if (var4 != this.field_h[-1 + this.field_i]) {
                this.field_a = var5.field_s;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    tp(int param0) {
        ms dupTemp$1 = null;
        int var2;
        ms var3;
        this.field_i = 0;
        this.field_h = new ms[param0];
        this.field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$1 = new ms();
            var3 = dupTemp$1;
            this.field_h[var2] = dupTemp$1;
            var3.field_l = var3;
            var3.field_s = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_e = new at();
        field_f = "Your game";
        field_c = "Try changing the '<%0>' setting.";
    }
}
