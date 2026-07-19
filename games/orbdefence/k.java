/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    private o field_c;
    private o[] field_b;
    static String field_e;
    static String field_a;
    private long field_f;
    private int field_d;

    final void a(int param0, o param1, long param2) {
        o var5 = null;
        try {
            if (!(param1.field_g == null)) {
                param1.c(-1);
            }
            var5 = this.field_b[(int)((long)(param0 + this.field_d) & param2)];
            param1.field_f = var5;
            param1.field_g = var5.field_g;
            param1.field_g.field_f = param1;
            param1.field_h = param2;
            param1.field_f.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "k.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        Boolean discarded$1 = null;
        nd.field_a[61] = 27;
        nd.field_a[92] = 74;
        nd.field_a[91] = 42;
        nd.field_a[93] = 43;
        nd.field_a[44] = 71;
        nd.field_a[45] = 26;
        if (param0 != 0) {
          discarded$1 = k.b((byte) 21);
          nd.field_a[520] = 59;
          nd.field_a[222] = 58;
          nd.field_a[192] = 28;
          nd.field_a[59] = 57;
          nd.field_a[47] = 73;
          nd.field_a[46] = 72;
          return;
        } else {
          nd.field_a[520] = 59;
          nd.field_a[222] = 58;
          nd.field_a[192] = 28;
          nd.field_a[59] = 57;
          nd.field_a[47] = 73;
          nd.field_a[46] = 72;
          return;
        }
    }

    final static Boolean b(byte param0) {
        int var1 = 112 / ((50 - param0) / 52);
        Boolean var2 = ci.field_h;
        ci.field_h = null;
        return var2;
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 <= -77) {
            return;
        }
        k.a((byte) -75);
    }

    final o c(byte param0) {
        o var2 = null;
        o var3 = null;
        int var4 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_6_0 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (null != this.field_c) {
          if (param0 < -9) {
            var2 = this.field_b[(int)(this.field_f & (long)(-1 + this.field_d))];
            L0: while (true) {
              if (this.field_c != var2) {
                stackOut_15_0 = this;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (var4 == 0) {
                  if (((k) (this)).field_c.field_h != this.field_f) {
                    this.field_c = this.field_c.field_f;
                    continue L0;
                  } else {
                    var3 = this.field_c;
                    this.field_c = this.field_c.field_f;
                    return var3;
                  }
                } else {
                  ((k) (this)).field_c = null;
                  return null;
                }
              } else {
                this.field_c = null;
                return null;
              }
            }
          } else {
            k.a((byte) -31);
            var2 = this.field_b[(int)(this.field_f & (long)(-1 + this.field_d))];
            L1: while (true) {
              if (this.field_c != var2) {
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (var4 == 0) {
                  if (((k) (this)).field_c.field_h != this.field_f) {
                    this.field_c = this.field_c.field_f;
                    continue L1;
                  } else {
                    var3 = this.field_c;
                    this.field_c = this.field_c.field_f;
                    return var3;
                  }
                } else {
                  ((k) (this)).field_c = null;
                  return null;
                }
              } else {
                this.field_c = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final o a(byte param0, long param1) {
        o var4 = null;
        o var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_3_0 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        this.field_f = param1;
        var4 = this.field_b[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_c = var4.field_f;
        if (param0 <= 97) {
          field_a = (String) null;
          L0: while (true) {
            if (this.field_c != var4) {
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var6 == 0) {
                if ((((k) (this)).field_c.field_h ^ -1L) != (param1 ^ -1L)) {
                  this.field_c = this.field_c.field_f;
                  continue L0;
                } else {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_f;
                  return var5;
                }
              } else {
                ((k) (this)).field_c = null;
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (this.field_c != var4) {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var6 == 0) {
                if ((((k) (this)).field_c.field_h ^ -1L) != (param1 ^ -1L)) {
                  this.field_c = this.field_c.field_f;
                  continue L1;
                } else {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_f;
                  return var5;
                }
              } else {
                ((k) (this)).field_c = null;
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        }
    }

    k(int param0) {
        o dupTemp$2 = null;
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_b = new o[param0];
        this.field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new o();
            var3 = dupTemp$2;
            this.field_b[var2] = dupTemp$2;
            var3.field_g = var3;
            var3.field_f = var3;
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
        field_e = "start members game";
        field_a = "SNEAKO";
    }
}
