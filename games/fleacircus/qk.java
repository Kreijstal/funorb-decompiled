/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    private long field_e;
    static int[] field_b;
    private pa field_d;
    static int field_a;
    static String field_h;
    private int field_g;
    static int[] field_f;
    private pa[] field_c;

    final pa a(long param0, int param1) {
        pa var4 = null;
        pa var5 = null;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackOut_5_0 = null;
        var6 = fleas.field_A ? 1 : 0;
        if (param1 == 16571) {
          this.field_e = param0;
          var4 = this.field_c[(int)((long)(-1 + this.field_g) & param0)];
          this.field_d = var4.field_p;
          L0: while (true) {
            if (var4 != this.field_d) {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                if (((qk) (this)).field_d.field_j == param0) {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_p;
                  return var5;
                } else {
                  this.field_d = this.field_d.field_p;
                  continue L0;
                }
              } else {
                ((qk) (this)).field_d = null;
                return null;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        } else {
          return (pa) null;
        }
    }

    final pa a(int param0) {
        pa var2 = null;
        pa var3 = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_5_0 = null;
        var4 = fleas.field_A ? 1 : 0;
        if (this.field_d != null) {
          var2 = this.field_c[(int)(this.field_e & (long)(this.field_g - 1))];
          if (param0 > -60) {
            field_a = -114;
            L0: while (true) {
              if (var2 != this.field_d) {
                stackOut_14_0 = this;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (var4 == 0) {
                  if ((((qk) (this)).field_d.field_j ^ -1L) != (this.field_e ^ -1L)) {
                    this.field_d = this.field_d.field_p;
                    continue L0;
                  } else {
                    var3 = this.field_d;
                    this.field_d = this.field_d.field_p;
                    return var3;
                  }
                } else {
                  ((qk) (this)).field_d = null;
                  return null;
                }
              } else {
                this.field_d = null;
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (var2 != this.field_d) {
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var4 == 0) {
                  if ((((qk) (this)).field_d.field_j ^ -1L) != (this.field_e ^ -1L)) {
                    this.field_d = this.field_d.field_p;
                    continue L1;
                  } else {
                    var3 = this.field_d;
                    this.field_d = this.field_d.field_p;
                    return var3;
                  }
                } else {
                  ((qk) (this)).field_d = null;
                  return null;
                }
              } else {
                this.field_d = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_h = null;
        field_b = null;
        if (param0 == 0) {
            return;
        }
        field_h = (String) null;
    }

    qk(int param0) {
        pa dupTemp$2 = null;
        int var2 = 0;
        pa var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        this.field_c = new pa[param0];
        this.field_g = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new pa();
            var3 = dupTemp$2;
            this.field_c[var2] = dupTemp$2;
            var3.field_m = var3;
            var3.field_p = var3;
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

    final void a(pa param0, int param1, long param2) {
        pa var5 = null;
        try {
            if (!(null == param0.field_m)) {
                param0.e(param1 ^ -103);
            }
            var5 = this.field_c[(int)((long)(param1 + this.field_g) & param2)];
            param0.field_m = var5.field_m;
            param0.field_p = var5;
            param0.field_m.field_p = param0;
            param0.field_p.field_m = param0;
            param0.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new int[128];
        field_a = 0;
        field_f = new int[8192];
        field_h = "Create a free Account";
    }
}
