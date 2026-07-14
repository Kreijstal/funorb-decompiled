/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wd {
    static wh field_b;
    static vg field_a;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        lh var2 = null;
        int var3 = 0;
        hi var4 = null;
        var3 = fleas.field_A ? 1 : 0;
        if (param0 == -29250) {
          var4 = (hi) (Object) bf.field_e.c((byte) 47);
          L0: while (true) {
            if (var4 == null) {
              var2 = rj.field_i.c((byte) 47);
              L1: while (true) {
                if (var2 != null) {
                  ki.a(param1, 1);
                  var2 = rj.field_i.b((byte) -105);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              sc.a(param1, var4, param0 + 29251);
              var4 = (hi) (Object) bf.field_e.b((byte) -105);
              continue L0;
            }
          }
        } else {
          field_c = -7;
          var4 = (hi) (Object) bf.field_e.c((byte) 47);
          L2: while (true) {
            if (var4 == null) {
              var2 = rj.field_i.c((byte) 47);
              L3: while (true) {
                if (var2 != null) {
                  ki.a(param1, 1);
                  var2 = rj.field_i.b((byte) -105);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              sc.a(param1, var4, param0 + 29251);
              var4 = (hi) (Object) bf.field_e.b((byte) -105);
              continue L2;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, kc param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ue.field_a[0] = jj.field_R.nextInt();
        ue.field_a[1] = jj.field_R.nextInt();
        ue.field_a[2] = (int)(ug.field_a >> -848677216);
        sd.field_i.field_i = 0;
        ue.field_a[3] = (int)ug.field_a;
        sd.field_i.a(ue.field_a[0], (byte) -23);
        sd.field_i.a(ue.field_a[1], (byte) -100);
        sd.field_i.a(ue.field_a[2], (byte) -96);
        var5 = 27 % ((-65 - param1) / 51);
        sd.field_i.a(ue.field_a[3], (byte) -104);
        lc.a(sd.field_i, (byte) -113);
        sd.field_i.b((byte) 99, param3);
        param2.a(sd.field_i, (byte) -100);
        ud.field_b.field_i = 0;
        if (param0) {
          L0: {
            ud.field_b.a(-11, 18);
            ud.field_b.field_i = ud.field_b.field_i + 2;
            var6 = ud.field_b.field_i;
            ud.field_b.a(pc.field_j, (byte) -125);
            ud.field_b.a(-108, c.field_P);
            var7 = 0;
            if (!va.field_m) {
              break L0;
            } else {
              var7 = var7 | 1;
              break L0;
            }
          }
          L1: {
            if (!bk.field_e) {
              break L1;
            } else {
              var7 = var7 | 4;
              break L1;
            }
          }
          L2: {
            if (!param4) {
              break L2;
            } else {
              var7 = var7 | 8;
              break L2;
            }
          }
          L3: {
            if (wc.field_p == null) {
              break L3;
            } else {
              var7 = var7 | 16;
              break L3;
            }
          }
          L4: {
            ud.field_b.a(-11, var7);
            var8 = w.a(0, rl.a((byte) -75));
            if (var8 == null) {
              var8 = "";
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            ud.field_b.a(116, var8);
            if (null != wc.field_p) {
              ud.field_b.a(wc.field_p, (byte) -87);
              break L5;
            } else {
              break L5;
            }
          }
          cg.a(fj.field_c, -111, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
          ud.field_b.a((byte) 119, -var6 + ud.field_b.field_i);
          dk.b((byte) 41, -1);
          return;
        } else {
          L6: {
            ud.field_b.a(-11, 16);
            ud.field_b.field_i = ud.field_b.field_i + 2;
            var6 = ud.field_b.field_i;
            ud.field_b.a(pc.field_j, (byte) -125);
            ud.field_b.a(-108, c.field_P);
            var7 = 0;
            if (!va.field_m) {
              break L6;
            } else {
              var7 = var7 | 1;
              break L6;
            }
          }
          L7: {
            if (!bk.field_e) {
              break L7;
            } else {
              var7 = var7 | 4;
              break L7;
            }
          }
          L8: {
            if (!param4) {
              break L8;
            } else {
              var7 = var7 | 8;
              break L8;
            }
          }
          L9: {
            if (wc.field_p == null) {
              break L9;
            } else {
              var7 = var7 | 16;
              break L9;
            }
          }
          L10: {
            ud.field_b.a(-11, var7);
            var8 = w.a(0, rl.a((byte) -75));
            if (var8 == null) {
              var8 = "";
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            ud.field_b.a(116, var8);
            if (null != wc.field_p) {
              ud.field_b.a(wc.field_p, (byte) -87);
              break L11;
            } else {
              break L11;
            }
          }
          cg.a(fj.field_c, -111, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
          ud.field_b.a((byte) 119, -var6 + ud.field_b.field_i);
          dk.b((byte) 41, -1);
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            String discarded$0 = wd.a((byte) -2, -36L);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static String a(byte param0, long param1) {
        hh.field_c.setTime(new Date(param1));
        int var3 = hh.field_c.get(7);
        if (param0 > -7) {
            return null;
        }
        int var4 = hh.field_c.get(5);
        int var5 = hh.field_c.get(2);
        int var6 = hh.field_c.get(1);
        int var7 = hh.field_c.get(11);
        int var8 = hh.field_c.get(12);
        int var9 = hh.field_c.get(13);
        return th.field_m[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_P[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new wh("usename");
    }
}
