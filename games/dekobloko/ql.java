/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_g;
    static String field_a;
    static cc field_b;
    volatile boolean field_e;
    static int field_c;
    static String field_f;
    static int[] field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ql) this).field_e = true;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static lm a(ji param0, byte param1, int param2, int param3, ji param4) {
        if (param1 == 41) {
          if (!gb.a(param3, param0, param2, 56)) {
            return null;
          } else {
            return w.a(param4.a(param2, -117, param3), (byte) -5);
          }
        } else {
          field_a = null;
          if (!gb.a(param3, param0, param2, 56)) {
            return null;
          } else {
            return w.a(param4.a(param2, -117, param3), (byte) -5);
          }
        }
    }

    ql() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, byte param1) {
        int var2 = -50 % ((param1 - -51) / 49);
        int discarded$0 = qm.a((byte) 57);
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
            return false;
        }
        return !wl.field_p ? true : false;
    }

    final static void a(vj param0, int param1, int param2) {
        bh var3 = null;
        int var4 = 0;
        bh var5 = null;
        bh var6 = null;
        int var8 = 0;
        vj var9 = null;
        uk var10 = null;
        var8 = client.field_A ? 1 : 0;
        if ((param2 ^ -1) >= -2) {
          return;
        } else {
          var3 = param0.field_c.field_b;
          var4 = 0;
          if (param1 < -114) {
            L0: while (true) {
              if (param2 <= var4) {
                var9 = new vj();
                param0.a(-128, var3, var9);
                ql.a(param0, -117, (1 + param2) / 2);
                ql.a(var9, -127, param2 / 2);
                var5 = param0.field_c.field_b;
                L1: while (true) {
                  var6 = var9.field_c.field_b;
                  if (var9.field_c != var6) {
                    var10 = (uk) (Object) var6;
                    L2: while (true) {
                      if (param0.field_c == var5) {
                        fm.a((byte) 113, (bh) (Object) var10, var5);
                        continue L1;
                      } else {
                        if (var10.field_o <= ((uk) (Object) var5).field_o) {
                          fm.a((byte) 113, (bh) (Object) var10, var5);
                          continue L1;
                        } else {
                          var5 = var5.field_b;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var3 = var3.field_b;
                var4 += 2;
                continue L0;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 > -70) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) ik.field_f;
        synchronized (var1) {
          L0: {
            pf.field_g = pf.field_g + 1;
            be.field_n = pa.field_bb;
            bh.field_g = lc.field_f;
            if (param0 == -2) {
              break L0;
            } else {
              ql.c(-55);
              break L0;
            }
          }
          pm.field_f = te.field_r;
          pm.field_b = ml.field_b;
          ml.field_b = false;
          ig.field_Yb = nk.field_l;
          he.field_S = ge.field_a;
          nf.field_h = qa.field_t;
          nk.field_l = 0;
        }
    }

    final void a(fd param0, int param1) {
        Object var4 = null;
        if (param1 <= 4) {
          var4 = null;
          ((ql) this).a((fd) null, 55);
          wj.a(true, ((ql) this).field_g, param0);
          return;
        } else {
          wj.a(true, ((ql) this).field_g, param0);
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Month";
        field_f = "Reject";
    }
}
