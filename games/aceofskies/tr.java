/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    static st field_a;

    final static void a(s param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            L1: {
              if (param1 <= -85) {
                break L1;
              } else {
                field_a = (st) null;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= dd.field_a) {
                aa.field_c[param0.a(0)] = aa.field_c[param0.a(0)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (dd.field_a <= var3) {
                    dd.field_a = var2;
                    dd.field_a = dd.field_a + 1;
                    ve.field_b[dd.field_a] = param0;
                    return;
                  } else {
                    L4: {
                      if (ve.field_b[var3].field_f == ((s) param0).field_f) {
                        var4 = ve.field_b[var3].a(0);
                        if (gq.field_a < aa.field_c[var4]) {
                          aa.field_c[var4] = aa.field_c[var4] - 1;
                          var3++;
                          continue L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    ve.field_b[var2] = ve.field_b[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (((s) param0).field_f == ve.field_b[var2].field_f) {
                  aa.field_c[ve.field_b[var2].a(0)] = aa.field_c[ve.field_b[var2].a(0)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            aa.field_c[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
            tr.a(118);
        }
        field_a = null;
    }

    final static void a(gk param0, byte param1) {
        ll var2 = new ll(param0.a("final_frame.jpg", (byte) -71, ""), (java.awt.Component) (Object) ci.field_f);
        int var3 = ((ll) var2).field_r;
        int var4 = ((ll) var2).field_n;
        qk.a((byte) -92);
        gl.field_d = new ll(var3, 3 * var4 / 4);
        gl.field_d.b();
        var2.c(0, 0);
        gt.field_o = new ll(var3, var4 - gl.field_d.field_n);
        gt.field_o.b();
        var2.c(0, -gl.field_d.field_n);
        gt.field_o.field_p = gl.field_d.field_n;
        if (param1 > -64) {
            return;
        }
        sl.c(2765);
    }

    final static void a(rb param0, int param1, int param2, int param3, int param4) {
        param0.b(-1336879960, 12);
        param0.a(17, 23385);
        param0.a(param3, 23385);
        param0.a(param2, 23385);
        param0.b(-1336879960, param1);
        if (param4 != 0) {
            rb var6 = (rb) null;
            tr.a((rb) null, 50, -109, 117, 45);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new st();
    }
}
