/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static char[] field_c;
    static hl[] field_b;
    static n field_a;
    static df field_d;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 48) {
            return;
        }
        field_d = null;
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        of var4_ref_of = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        pg var8 = null;
        ia var9 = null;
        byte[] var13 = null;
        var6 = StarCannon.field_A;
        if (param0 == -107) {
          L0: {
            var9 = se.field_p;
            var2 = var9.j(7909);
            if (-1 == (var2 ^ -1)) {
              var8 = (pg) (Object) ab.field_H.c(-3905);
              if (var8 == null) {
                ec.a((byte) 27);
                return;
              } else {
                L1: {
                  var4 = var9.j(7909);
                  if (var4 == 0) {
                    var5 = null;
                    break L1;
                  } else {
                    var13 = new byte[var4];
                    var9.a(var4, (byte) 88, var13, 0);
                    break L1;
                  }
                }
                var9.field_g = var9.field_g + 4;
                if (!var9.f(0)) {
                  ec.a((byte) 27);
                  return;
                } else {
                  var8.b(4);
                  break L0;
                }
              }
            } else {
              if (1 == var2) {
                var3 = var9.f((byte) -91);
                var4_ref_of = (of) (Object) fi.field_c.c(-3905);
                L2: while (true) {
                  L3: {
                    if (var4_ref_of == null) {
                      break L3;
                    } else {
                      if (var4_ref_of.field_h != var3) {
                        var4_ref_of = (of) (Object) fi.field_c.a(-16913);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4_ref_of != null) {
                    var4_ref_of.b(4);
                    break L0;
                  } else {
                    ec.a((byte) 27);
                    return;
                  }
                }
              } else {
                hc.a((Throwable) null, "A1: " + oe.a(-121), (byte) 74);
                ec.a((byte) 27);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        ti.field_b.l(26756);
        if (!(null != ve.field_f)) {
            ve.field_f = new lf(ti.field_b, sg.field_n);
        }
        ti.field_b.a((byte) 81, (uj) (Object) ve.field_f);
        if (param0 > -19) {
            ea.a((byte) -78);
        }
    }

    final static void a(byte param0, vc param1, int param2) {
        if (param0 < 39) {
            field_b = null;
        }
        ia var3 = d.field_b;
        var3.d((byte) 74, param2);
        var3.a(5, -70);
        var3.a(0, -120);
        var3.c(param1.field_i, -306);
        var3.a(param1.field_h, -50);
        var3.a(param1.field_l, -80);
    }

    final static void a(Object param0, int param1, ka param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        if (null != param2.field_w) {
          var4 = -109 % ((param1 - 3) / 59);
          var3_int = 0;
          L0: while (true) {
            L1: {
              if ((var3_int ^ -1) <= -51) {
                break L1;
              } else {
                if (param2.field_w.peekEvent() == null) {
                  break L1;
                } else {
                  uc.a(-117, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  param2.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
                  break L2;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new char[]{(char)91, (char)93, (char)35};
        field_b = new hl[9];
    }
}
