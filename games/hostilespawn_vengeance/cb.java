/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int[] field_d;
    static String field_b;
    private dk field_a;
    private int field_i;
    static String field_h;
    private dk[] field_f;
    static bd[][] field_g;
    static long field_e;
    static int field_c;
    private long field_j;

    final static ll a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        var2 = param0.length();
        if (var2 == 0) {
          return gf.field_f;
        } else {
          if (63 < var2) {
            return hb.field_v;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var2 <= var3) {
                if (param1 <= 18) {
                  field_g = null;
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param0.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (-1 + var2 != var3) {
                        var3++;
                        var3++;
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return we.field_g;
                } else {
                  if (ce.field_g.indexOf(var4) == -1) {
                    return we.field_g;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, oj param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        L0: {
          in.a(false);
          jg.field_d.e((640 + -jg.field_d.field_z) / 2, -4 + (-jg.field_d.field_A + 480));
          var2 = (640 + -gj.field_d.field_z) / 2;
          var3 = -gj.field_d.field_A + 478;
          var4 = (gj.field_d.field_z - 4) * ij.k(param0 ^ -547) >> 1563681481;
          si.c(var2 - -2, var3 - -3, var4, 2, 16772608);
          gj.field_d.e(var2, var3);
          al.field_Z.c(hk.field_k.toUpperCase(), 8, 472, 16776960, -1);
          al.field_Z.b(bi.field_c[n.field_s].toUpperCase(), 320, 471, 16776960, -1);
          var5 = el.field_i.toUpperCase();
          var6 = al.field_Z.a(var5);
          al.field_Z.a(var5, param0, 472, 16776960, -1);
          ec.a(7, 472, false, (vm) (Object) al.field_Z, 631 + -var6 + -5, 16776960, Integer.toString(cf.field_s));
          stackOut_0_0 = -11003;
          stackOut_0_1 = Math.max(eh.field_g, 0);
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (0 >= um.field_e) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = ba.a((byte) 61);
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = Math.max(eh.field_g, qi.field_J);
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        sm.a(stackIn_3_0, stackIn_3_1, stackIn_3_2);
        if ((le.field_D ^ -1) >= -1) {
          return;
        } else {
          mk.field_L.b(jh.a((byte) -93, le.field_D / 50), 320, 52, 16711680, 0);
          return;
        }
    }

    final dk a(long param0, int param1) {
        dk var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != -30828) {
            return null;
        }
        ((cb) this).field_j = param0;
        dk var4 = ((cb) this).field_f[(int)((long)(-1 + ((cb) this).field_i) & param0)];
        ((cb) this).field_a = var4.field_j;
        while (((cb) this).field_a != var4) {
            if (!((param0 ^ -1L) != (((cb) this).field_a.field_h ^ -1L))) {
                var5 = ((cb) this).field_a;
                ((cb) this).field_a = ((cb) this).field_a.field_j;
                return var5;
            }
            ((cb) this).field_a = ((cb) this).field_a.field_j;
        }
        ((cb) this).field_a = null;
        return null;
    }

    final void a(long param0, dk param1, int param2) {
        dk var5 = null;
        Object var6 = null;
        if (null != param1.field_i) {
            param1.c(-1);
            var5 = ((cb) this).field_f[(int)(param0 & (long)(-1 + ((cb) this).field_i))];
            param1.field_j = var5;
            param1.field_i = var5.field_i;
            param1.field_i.field_j = param1;
            param1.field_j.field_i = param1;
            param1.field_h = param0;
            if (param2 == 320) {
                return;
            }
            var6 = null;
            ll discarded$0 = cb.a((String) null, 83);
            return;
        }
        var5 = ((cb) this).field_f[(int)(param0 & (long)(-1 + ((cb) this).field_i))];
        param1.field_j = var5;
        param1.field_i = var5.field_i;
        param1.field_i.field_j = param1;
        param1.field_j.field_i = param1;
        param1.field_h = param0;
        if (param2 != 320) {
            var6 = null;
            ll discarded$1 = cb.a((String) null, 83);
            return;
        }
    }

    final dk a(int param0) {
        dk var3_ref = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (((cb) this).field_a == null) {
            return null;
        }
        dk var2 = ((cb) this).field_f[(int)(((cb) this).field_j & (long)(-1 + ((cb) this).field_i))];
        while (((cb) this).field_a != var2) {
            if (!((((cb) this).field_j ^ -1L) != (((cb) this).field_a.field_h ^ -1L))) {
                var3_ref = ((cb) this).field_a;
                ((cb) this).field_a = ((cb) this).field_a.field_j;
                return var3_ref;
            }
            ((cb) this).field_a = ((cb) this).field_a.field_j;
        }
        int var3 = -86 / ((param0 - 0) / 48);
        ((cb) this).field_a = null;
        return null;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -109) {
            field_h = null;
            field_g = null;
            field_b = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_b = null;
        field_h = null;
    }

    cb(int param0) {
        int var2 = 0;
        dk var3 = null;
        ((cb) this).field_i = param0;
        ((cb) this).field_f = new dk[param0];
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new dk();
            ((cb) this).field_f[var2] = new dk();
            var3.field_i = var3;
            var3.field_j = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[12];
        field_b = "Log in";
        field_h = "Find the entrance to the military base and locate the lift.";
    }
}
