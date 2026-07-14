/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qk extends vd {
    static String field_z;
    static bi[] field_y;
    private int field_w;
    String field_u;
    static String field_v;
    static int field_x;

    final void a(byte param0, String param1) {
        if (param0 >= -81) {
            ((qk) this).field_w = 9;
        }
        ((qk) this).field_u = param1;
    }

    qk(int param0, int param1, String param2) {
        this(param0, param1, rs.field_Cb.c(param2), rs.field_Cb.field_J, param2);
    }

    qk(int param0, int param1, int param2, int param3, String param4) {
        super(param0, param1, param2, param3);
        ((qk) this).field_u = param4;
        ((qk) this).field_w = 16777215;
    }

    final static String[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tq var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 == 13) {
          var6 = vg.g(param1 + 105);
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0.length) {
              return var6.a(220);
            } else {
              L1: while (true) {
                L2: {
                  if (var4 >= param0.length) {
                    break L2;
                  } else {
                    if (param0[var4] == 13) {
                      break L2;
                    } else {
                      if (param0[var4] == 10) {
                        break L2;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  }
                }
                var6.a(qi.a(param0, -var3 + var4, var3, -118), -126);
                L3: while (true) {
                  L4: {
                    if (param0.length <= var4) {
                      break L4;
                    } else {
                      if (13 != param0[var4]) {
                        if (param0[var4] != 10) {
                          break L4;
                        } else {
                          var4++;
                          continue L3;
                        }
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                  var3 = var4;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static gm a(qf param0, int param1) {
        if (param1 < 44) {
            Object var3 = null;
            qk.a((String) null, 122, (byte) 75);
        }
        return e.a(param0.field_a, -124, param0.field_f);
    }

    void a(int param0) {
        if (!(((qk) this).field_s)) {
            return;
        }
        int var2 = -21 / ((67 - param0) / 47);
        if (!(null == ((qk) this).field_u)) {
            rs.field_Cb.c(((qk) this).field_u, ((qk) this).field_m / 2 + ((qk) this).field_k, 3 * rs.field_Cb.field_J / 4 + ((qk) this).field_t, ((qk) this).field_w, -1);
        }
    }

    final static void g(int param0) {
        fe.f(-1);
        oe.field_f = true;
        el.field_b = true;
        le.field_e.k(99);
        if (param0 > -12) {
            return;
        }
        fk.a(we.field_b, -78, false);
    }

    public static void f(int param0) {
        field_y = null;
        field_z = null;
        field_v = null;
        int var1 = -126 / ((param0 - 53) / 36);
    }

    qk(int param0, int param1, int param2, int param3, String param4, int param5) {
        super(param0, param1, param2, param3);
        ((qk) this).field_u = param4;
        ((qk) this).field_w = param5;
    }

    final static void a(String param0, int param1, byte param2) {
        if (param2 < 74) {
            Object var4 = null;
            gm discarded$0 = qk.a((qf) null, 124);
        }
        jb.field_g = po.field_f;
        sh.field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Message game";
        field_v = "Most fleets controlled at one time.";
    }
}
