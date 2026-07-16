/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    private ah field_d;
    static int field_a;
    static String[] field_c;
    private ah field_b;
    static ve field_e;
    private ec field_f;

    public static void a(int param0) {
        if (param0 != 32768) {
            return;
        }
        field_c = null;
        field_e = null;
    }

    final static void b(byte param0) {
        jo.a(gk.field_d, 6, -13850);
        jo.a(il.field_T, 8, -13850);
        if (!wk.a((byte) 122)) {
            jo.a(in.field_c, 2, -13850);
            jo.a(qj.field_b, 3, -13850);
            jo.a(wg.field_f, 4, -13850);
            jo.a(od.field_Y, 5, -13850);
            if (param0 <= -45) {
                hg.field_b[8] = hg.field_b[8] + 32;
                return;
            }
            hj.b((byte) 99);
            hg.field_b[8] = hg.field_b[8] + 32;
            return;
        }
        if (param0 > -45) {
            hj.b((byte) 99);
            hg.field_b[8] = hg.field_b[8] + 32;
            return;
        }
        hg.field_b[8] = hg.field_b[8] + 32;
    }

    final static sj a(String param0, int param1, boolean param2) {
        sj var3 = new sj(param2);
        var3.field_i = param0;
        var3.field_d = param1;
        return var3;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        if (param0 != -93) {
            return;
        }
        int var1 = ug.field_bb[0];
        for (var2 = 1; var2 < ug.field_bb.length; var2++) {
            var3 = ug.field_bb[var2];
            rd.a(lg.field_ab, var2 << 2040505732, lg.field_ab, var1, var3);
            var1 = var1 + var3;
        }
    }

    final qa a(int param0, boolean param1) {
        byte[] var4 = null;
        if (!param1) {
            return null;
        }
        qa var3 = (qa) ((hj) this).field_f.a((byte) 120, (long)param0);
        if (!(var3 == null)) {
            return var3;
        }
        if (32768 > param0) {
            var4 = ((hj) this).field_b.a(-86, param0, 0);
        } else {
            var4 = ((hj) this).field_d.a(-103, param0 & 32767, 0);
        }
        var3 = new qa();
        if (var4 != null) {
            var3.a(new bh(var4), 0);
            if (!(32768 > param0)) {
                var3.g(32768);
            }
            ((hj) this).field_f.a((Object) (Object) var3, (long)param0, (byte) 50);
            return var3;
        }
        if (!(32768 > param0)) {
            var3.g(32768);
        }
        ((hj) this).field_f.a((Object) (Object) var3, (long)param0, (byte) 50);
        return var3;
    }

    hj(int param0, ah param1, ah param2) {
        ((hj) this).field_f = new ec(64);
        ((hj) this).field_b = param1;
        ((hj) this).field_d = param2;
        if (((hj) this).field_b != null) {
            int discarded$0 = ((hj) this).field_b.b(-23126, 0);
        }
        if (((hj) this).field_d != null) {
            int discarded$1 = ((hj) this).field_d.b(-23126, 0);
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        if (!hi.field_a) {
          return;
        } else {
          ck.field_bb.a(0, param0);
          var4 = gl.field_o.c(param3) ? 1 : 0;
          if (!param3) {
            L0: {
              if (0 == tm.field_t) {
                break L0;
              } else {
                if (var4 == 0) {
                  fk.e((byte) -8);
                  param0 = false;
                  break L0;
                } else {
                  L1: {
                    if (param0) {
                      gl.field_o.a(0, param1, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var4 != 0) {
                      ck.field_bb.a(0, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5 = gl.field_o.h(0) - -gl.field_o.field_eb;
                  if (640 < var5) {
                    d.field_e = d.field_e + 5;
                    return;
                  } else {
                    if ((var5 ^ -1) > -636) {
                      if (-1 > (d.field_e ^ -1)) {
                        d.field_e = d.field_e - 5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            L3: {
              if (param0) {
                gl.field_o.a(0, param1, param2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 != 0) {
                ck.field_bb.a(0, param0);
                break L4;
              } else {
                break L4;
              }
            }
            var5 = gl.field_o.h(0) - -gl.field_o.field_eb;
            if (640 < var5) {
              d.field_e = d.field_e + 5;
              return;
            } else {
              if ((var5 ^ -1) <= -636) {
                return;
              } else {
                if (-1 > (d.field_e ^ -1)) {
                  d.field_e = d.field_e - 5;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
