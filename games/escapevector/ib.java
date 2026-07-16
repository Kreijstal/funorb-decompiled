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
        hg var4 = ((ib) this).field_c[(int)((long)(param1 + ((ib) this).field_d) & param0)];
        ((ib) this).field_g = var4.field_b;
        while (var4 != ((ib) this).field_g) {
            if ((param0 ^ -1L) == (((ib) this).field_g.field_e ^ -1L)) {
                var5 = ((ib) this).field_g;
                ((ib) this).field_g = ((ib) this).field_g.field_b;
                return var5;
            }
            ((ib) this).field_g = ((ib) this).field_g.field_b;
        }
        ((ib) this).field_g = null;
        return null;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
        field_f = null;
    }

    final hg a(byte param0) {
        hg var2 = null;
        int var3 = EscapeVector.field_A;
        if (-1 > (((ib) this).field_e ^ -1)) {
            if (((ib) this).field_b != ((ib) this).field_c[((ib) this).field_e + -1]) {
                var2 = ((ib) this).field_b;
                ((ib) this).field_b = var2.field_b;
                return var2;
            }
        }
        if (param0 != 62) {
            return null;
        }
        do {
            if (((ib) this).field_e >= ((ib) this).field_d) {
                return null;
            }
            int fieldTemp$0 = ((ib) this).field_e;
            ((ib) this).field_e = ((ib) this).field_e + 1;
            var2 = ((ib) this).field_c[fieldTemp$0].field_b;
        } while (((ib) this).field_c[-1 + ((ib) this).field_e] == var2);
        ((ib) this).field_b = var2.field_b;
        return var2;
    }

    final hg a(boolean param0) {
        if (param0) {
            hg discarded$0 = ((ib) this).a(-30L, 70);
        }
        ((ib) this).field_e = 0;
        return ((ib) this).a((byte) 62);
    }

    final void a(hg param0, int param1, long param2) {
        if (null != param0.field_d) {
            param0.c((byte) -115);
        }
        if (param1 != 10901) {
            return;
        }
        hg var5 = ((ib) this).field_c[(int)((long)(((ib) this).field_d + -1) & param2)];
        param0.field_d = var5.field_d;
        param0.field_b = var5;
        param0.field_d.field_b = param0;
        param0.field_b.field_d = param0;
        param0.field_e = param2;
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, lk param3, int param4, int param5) {
        ja[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ja[] var10 = null;
        la var11 = null;
        var9 = EscapeVector.field_A;
        if (param3.c(0)) {
          L0: {
            if (-1 == (param4 ^ -1)) {
              var10 = dh.a(6629, param3);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8].field_c == param1) {
                      if (param2 == var10[var8].field_g) {
                        L2: {
                          if (0 == param5) {
                            break L2;
                          } else {
                            if (var10[var8].field_f == param5) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param4 < var10[var8].field_d) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param4 = var10[var8].field_d;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          L4: {
            if (param0 == 93) {
              break L4;
            } else {
              field_a = null;
              break L4;
            }
          }
          var11 = param3.a(-103, param4, param2, param5, param1);
          L5: while (true) {
            if (var11.field_f != 0) {
              var7 = (java.awt.Frame) var11.field_b;
              if (var7 != null) {
                if ((var11.field_f ^ -1) != -3) {
                  return var7;
                } else {
                  af.a(param3, var7, false);
                  return null;
                }
              } else {
                return null;
              }
            } else {
              en.a((byte) -31, 10L);
              continue L5;
            }
          }
        } else {
          return null;
        }
    }

    ib(int param0) {
        int var2 = 0;
        hg var3 = null;
        ((ib) this).field_e = 0;
        ((ib) this).field_d = param0;
        ((ib) this).field_c = new hg[param0];
        for (var2 = 0; param0 > var2; var2++) {
            hg dupTemp$0 = new hg();
            var3 = dupTemp$0;
            ((ib) this).field_c[var2] = dupTemp$0;
            var3.field_d = var3;
            var3.field_b = var3;
        }
    }

    static {
    }
}
