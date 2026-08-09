/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    private int field_d;
    private hg[] field_c;
    private int field_e;
    private hg field_b;
    private hg field_g;
    static hh field_a;
    static eo field_f;

    final hg a(long param0, int param1) {
        hg var5 = null;
        int var6 = EscapeVector.field_A;
        hg var4 = this.field_c[(int)((long)(param1 + this.field_d) & param0)];
        this.field_g = var4.field_b;
        while (var4 != this.field_g) {
            if ((param0 ^ -1L) == (this.field_g.field_e ^ -1L)) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_b;
                return var5;
            }
            this.field_g = this.field_g.field_b;
        }
        this.field_g = null;
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = (hh) null;
        }
        field_f = null;
    }

    final hg a(byte param0) {
        int fieldTemp$0 = 0;
        hg var2 = null;
        int var3 = EscapeVector.field_A;
        if (-1 > (this.field_e ^ -1) && this.field_b != this.field_c[this.field_e + -1]) {
            var2 = this.field_b;
            this.field_b = var2.field_b;
            return var2;
        }
        if (param0 != 62) {
            return (hg) null;
        }
        do {
            if (this.field_e >= this.field_d) {
                return null;
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            var2 = this.field_c[fieldTemp$0].field_b;
        } while (this.field_c[-1 + this.field_e] == var2);
        this.field_b = var2.field_b;
        return var2;
    }

    final hg a(boolean param0) {
        if (param0) {
            this.a(-30L, 70);
        }
        this.field_e = 0;
        return this.a((byte) 62);
    }

    final void a(hg param0, int param1, long param2) {
        hg var5 = null;
        if (null != param0.field_d) {
            param0.c((byte) -115);
        }
        if (param1 != 10901) {
            return;
        }
        try {
            var5 = this.field_c[(int)((long)(this.field_d + -1) & param2)];
            param0.field_d = var5.field_d;
            param0.field_b = var5;
            param0.field_d.field_b = param0;
            param0.field_b.field_d = param0;
            param0.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ib.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, lk param3, int param4, int param5) {
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ja[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ja[] var10 = null;
        la var11 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param3.c(0)) {
              L1: {
                if (-1 == (param4 ^ -1)) {
                  var10 = dh.a(6629, param3);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (var10[var8].field_c == param1) {
                          if (param2 == var10[var8].field_g) {
                            L3: {
                              if (0 == param5) {
                                break L3;
                              } else {
                                if (var10[var8].field_f == param5) {
                                  break L3;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            L4: {
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param4 < var10[var8].field_d) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var10[var8].field_d;
                              break L4;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                if (param0 == 93) {
                  break L6;
                } else {
                  field_a = (hh) null;
                  break L6;
                }
              }
              var11 = param3.a(-103, param4, param2, param5, param1);
              L7: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) (var11.field_b);
                  if (var7 != null) {
                    if ((var11.field_f ^ -1) != -3) {
                      stackIn_40_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      af.a(param3, var7, false);
                      stackIn_38_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  en.a((byte) -31, 10L);
                  continue L7;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var6_ref);

            stackIn_43_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L8;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_38_0);
        } else {
          return stackIn_40_0;
        }
    }

    ib(int param0) {
        int var2 = 0;
        hg dupTemp$0 = null;
        hg var3 = null;
        this.field_e = 0;
        this.field_d = param0;
        this.field_c = new hg[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new hg();
            var3 = dupTemp$0;
            this.field_c[var2] = dupTemp$0;
            var3.field_d = var3;
            var3.field_b = var3;
        }
    }

    static {
    }
}
