/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    private ca field_g;
    private int field_h;
    private int field_d;
    private ca[] field_e;
    private ca field_c;
    static java.awt.Frame field_b;
    static String field_f;
    static dl[] field_a;

    final void a(long param0, byte param1, ca param2) {
        ca var5 = null;
        try {
            if (!(param2.field_c == null)) {
                param2.b(57);
            }
            var5 = this.field_e[(int)((long)(this.field_d + -1) & param0)];
            param2.field_c = var5.field_c;
            param2.field_e = var5;
            param2.field_c.field_e = param2;
            int var6 = 4 / ((param1 - -48) / 34);
            param2.field_e.field_c = param2;
            param2.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mh.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ca c(byte param0) {
        ca discarded$6 = null;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        ca discarded$10 = null;
        int fieldTemp$11 = 0;
        int var3 = 0;
        ca var4 = null;
        ca var5 = null;
        ca var17 = null;
        ca var18 = null;
        ca var22 = null;
        ca var31 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        if ((this.field_h ^ -1) < -1) {
          if (this.field_e[-1 + this.field_h] == this.field_c) {
            if (param0 >= -55) {
              discarded$6 = this.a((byte) 19);
              L0: while (true) {
                if (this.field_h < this.field_d) {
                  fieldTemp$7 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var4 = this.field_e[fieldTemp$7].field_e;
                  var22 = var4;
                  if (var4 != this.field_e[this.field_h - 1]) {
                    this.field_c = var22.field_e;
                    return var22;
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
              L1: while (true) {
                if (this.field_h < this.field_d) {
                  fieldTemp$8 = this.field_h;
                  this.field_h = this.field_h + 1;
                  var4 = this.field_e[fieldTemp$8].field_e;
                  var18 = var4;
                  if (var4 != this.field_e[this.field_h - 1]) {
                    this.field_c = var18.field_e;
                    return var18;
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
            var31 = this.field_c;
            this.field_c = var31.field_e;
            return var31;
          }
        } else {
          if (param0 < -55) {
            L2: while (true) {
              if (this.field_h < this.field_d) {
                fieldTemp$9 = this.field_h;
                this.field_h = this.field_h + 1;
                var4 = this.field_e[fieldTemp$9].field_e;
                var17 = var4;
                if (var4 != this.field_e[this.field_h - 1]) {
                  this.field_c = var17.field_e;
                  return var17;
                } else {
                  if (var3 == 0) {
                    continue L2;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            discarded$10 = this.a((byte) 19);
            L3: while (true) {
              if (this.field_h < this.field_d) {
                fieldTemp$11 = this.field_h;
                this.field_h = this.field_h + 1;
                var4 = this.field_e[fieldTemp$11].field_e;
                var5 = var4;
                if (var4 != this.field_e[this.field_h - 1]) {
                  this.field_c = var5.field_e;
                  return var5;
                } else {
                  if (var3 == 0) {
                    continue L3;
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static void b(byte param0) {
        pc.a(-1, sk.field_G, of.field_H, true);
        jc.field_j = true;
        if (param0 == -57) {
            return;
        }
        mh.b((byte) -116);
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 == 1) {
            return;
        }
        field_b = (java.awt.Frame) null;
    }

    final ca a(byte param0) {
        ca discarded$2 = null;
        if (param0 < 115) {
          discarded$2 = this.a((byte) -8);
          this.field_h = 0;
          return this.c((byte) -108);
        } else {
          this.field_h = 0;
          return this.c((byte) -108);
        }
    }

    mh(int param0) {
        ca dupTemp$2 = null;
        int var2 = 0;
        ca var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_h = 0;
        this.field_d = param0;
        this.field_e = new ca[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new ca();
            var3 = dupTemp$2;
            this.field_e[var2] = dupTemp$2;
            var3.field_e = var3;
            var3.field_c = var3;
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

    final ca a(long param0, int param1) {
        ca var4 = null;
        ca var5 = null;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackOut_5_0 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (param1 == -1) {
          var4 = this.field_e[(int)(param0 & (long)(-1 + this.field_d))];
          this.field_g = var4.field_e;
          L0: while (true) {
            if (this.field_g != var4) {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                if ((((mh) (this)).field_g.field_d ^ -1L) != (param0 ^ -1L)) {
                  this.field_g = this.field_g.field_e;
                  continue L0;
                } else {
                  var5 = this.field_g;
                  this.field_g = this.field_g.field_e;
                  return var5;
                }
              } else {
                ((mh) (this)).field_g = null;
                return null;
              }
            } else {
              this.field_g = null;
              return null;
            }
          }
        } else {
          return (ca) null;
        }
    }

    static {
        field_f = "Please try again in a few minutes.";
    }
}
