/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private tk field_f;
    private int field_k;
    private long field_g;
    private int field_h;
    private tk[] field_e;
    static long field_j;
    private tk field_d;
    static int[] field_b;
    static String[][] field_c;
    static java.applet.Applet field_i;
    static String field_a;

    final tk a(long param0, int param1) {
        tk var4;
        tk var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        this.field_g = param0;
        var4 = this.field_e[(int)((long)(this.field_k + param1) & param0)];
        this.field_d = var4.field_s;
        L0: while (true) {
          if (this.field_d != var4) {
            if (param0 == this.field_d.field_j) {
              var5 = this.field_d;
              this.field_d = this.field_d.field_s;
              return var5;
            } else {
              this.field_d = this.field_d.field_s;
              continue L0;
            }
          } else {
            this.field_d = null;
            return null;
          }
        }
    }

    final tk a(byte param0) {
        tk var2;
        int var3_int;
        tk var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null != this.field_d) {
          var2 = this.field_e[(int)((long)(this.field_k + -1) & this.field_g)];
          L0: while (true) {
            if (this.field_d != var2) {
              if (this.field_g != this.field_d.field_j) {
                this.field_d = this.field_d.field_s;
                continue L0;
              } else {
                var3 = this.field_d;
                this.field_d = this.field_d.field_s;
                return var3;
              }
            } else {
              var3_int = 61 / ((param0 - 37) / 63);
              this.field_d = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final tk a(boolean param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        Object var4;
        tk var4_ref;
        tk var5;
        tk var36;
        tk var37;
        tk var38;
        tk var39;
        tk var42;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          if (0 < this.field_h) {
            if (this.field_e[-1 + this.field_h] == this.field_f) {
              L0: while (true) {
                if (this.field_k > this.field_h) {
                  fieldTemp$4 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var4_ref = this.field_e[fieldTemp$4].field_s;
                  var39 = var4_ref;
                  if (var4_ref == this.field_e[-1 + this.field_h]) {
                    continue L0;
                  } else {
                    this.field_f = var39.field_s;
                    return var39;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var42 = this.field_f;
              this.field_f = var42.field_s;
              return var42;
            }
          } else {
            L1: while (true) {
              if (this.field_k > this.field_h) {
                fieldTemp$5 = this.field_h;
                this.field_h = this.field_h + 1;
                var4_ref = this.field_e[fieldTemp$5].field_s;
                var38 = var4_ref;
                if (var4_ref == this.field_e[-1 + this.field_h]) {
                  continue L1;
                } else {
                  this.field_f = var38.field_s;
                  return var38;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          this.a(31L, -107);
          if (0 < this.field_h) {
            if (this.field_e[-1 + this.field_h] != this.field_f) {
              var36 = this.field_f;
              this.field_f = var36.field_s;
              return var36;
            } else {
              L2: while (true) {
                if (this.field_k > this.field_h) {
                  fieldTemp$6 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var4_ref = this.field_e[fieldTemp$6].field_s;
                  var37 = var4_ref;
                  if (var4_ref == this.field_e[-1 + this.field_h]) {
                    continue L2;
                  } else {
                    this.field_f = var37.field_s;
                    return var37;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (this.field_k > this.field_h) {
                fieldTemp$7 = this.field_h;
                this.field_h = this.field_h + 1;
                var4_ref = this.field_e[fieldTemp$7].field_s;
                var5 = var4_ref;
                if (var4_ref == this.field_e[-1 + this.field_h]) {
                  continue L3;
                } else {
                  this.field_f = var5.field_s;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final tk b(byte param0) {
        this.field_h = 0;
        if (param0 <= 57) {
            return (tk) null;
        }
        return this.a(false);
    }

    final static void a(int param0) {
        if (param0 == -1) {
            return;
        }
        mk.c((byte) 88);
    }

    final void a(long param0, tk param1, int param2) {
        if (!(null == param1.field_n)) {
            param1.d(3);
        }
        tk var5 = this.field_e[(int)(param0 & (long)(-1 + this.field_k))];
        param1.field_n = var5.field_n;
        param1.field_s = var5;
        param1.field_n.field_s = param1;
        if (param2 <= 38) {
            return;
        }
        try {
            param1.field_s.field_n = param1;
            param1.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "mk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_c = (String[][]) null;
        field_b = null;
        field_a = null;
        if (param0 > 47) {
            return;
        }
        field_i = (java.applet.Applet) null;
    }

    mk(int param0) {
        tk dupTemp$1 = null;
        int var2;
        tk var3;
        this.field_h = 0;
        this.field_e = new tk[param0];
        this.field_k = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$1 = new tk();
            var3 = dupTemp$1;
            this.field_e[var2] = dupTemp$1;
            var3.field_n = var3;
            var3.field_s = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_b = vn.d(8);
        field_a = "Wipe out: cancels out any positive power-ups.";
    }
}
