/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up {
    static int field_d;
    private ll field_a;
    static String[] field_c;
    private ll field_e;
    static cn field_b;

    final ll c(int param0) {
        if (param0 != 13395) {
            return null;
        }
        ll var2 = ((up) this).field_a.field_n;
        if (!(var2 != ((up) this).field_a)) {
            ((up) this).field_e = null;
            return null;
        }
        ((up) this).field_e = var2.field_n;
        return var2;
    }

    final static void c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jn.field_n.a(100, false);
        if (hj.field_S == -1) {
          var1 = -qe.field_n + qe.field_f;
          var2 = qe.field_l - qe.field_c;
          var3 = ug.a(true, (var2 >> 12) * (var2 >> 12) + (var1 >> 12) * (var1 >> 12)) >> 6;
          if (0 > var3) {
            throw new RuntimeException();
          } else {
            L0: {
              if (var3 != 0) {
                var2 = var2 / var3;
                var1 = var1 / var3;
                qe.field_a = qe.field_a + var1;
                qe.field_j = qe.field_j + var2;
                qe.field_j = 14 * qe.field_j >> 4;
                qe.field_a = qe.field_a * 14 >> 4;
                break L0;
              } else {
                break L0;
              }
            }
            qe.field_n = qe.field_n + (int)(1048576.0 * te.a(mo.field_a));
            var4 = 100 / ((param0 - 46) / 52);
            qe.field_c = qe.field_c + (int)(te.a(mo.field_a ^ 773223) * 1048576.0);
            qe.field_c = qe.field_c + qe.field_j;
            qe.field_n = qe.field_n + qe.field_a;
            return;
          }
        } else {
          qe.field_l = eh.field_h << 16;
          qe.field_f = hj.field_S << 16;
          var1 = -qe.field_n + qe.field_f;
          var2 = qe.field_l - qe.field_c;
          var3 = ug.a(true, (var2 >> 12) * (var2 >> 12) + (var1 >> 12) * (var1 >> 12)) >> 6;
          if (0 > var3) {
            throw new RuntimeException();
          } else {
            L1: {
              if (var3 != 0) {
                var2 = var2 / var3;
                var1 = var1 / var3;
                qe.field_a = qe.field_a + var1;
                qe.field_j = qe.field_j + var2;
                qe.field_j = 14 * qe.field_j >> 4;
                qe.field_a = qe.field_a * 14 >> 4;
                break L1;
              } else {
                break L1;
              }
            }
            qe.field_n = qe.field_n + (int)(1048576.0 * te.a(mo.field_a));
            var4 = 100 / ((param0 - 46) / 52);
            qe.field_c = qe.field_c + (int)(te.a(mo.field_a ^ 773223) * 1048576.0);
            qe.field_c = qe.field_c + qe.field_j;
            qe.field_n = qe.field_n + qe.field_a;
            return;
          }
        }
    }

    final ll a(int param0) {
        ll var2 = null;
        int var3 = 0;
        var2 = ((up) this).field_a.field_n;
        var3 = 89 / ((58 - param0) / 60);
        if (var2 == ((up) this).field_a) {
          return null;
        } else {
          var2.b((byte) -2);
          return var2;
        }
    }

    final ll a(byte param0) {
        ll var2 = null;
        var2 = ((up) this).field_e;
        if (var2 != ((up) this).field_a) {
          ((up) this).field_e = var2.field_n;
          if (param0 <= 47) {
            field_c = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((up) this).field_e = null;
          return null;
        }
    }

    final static void b(int param0) {
        if (param0 >= -78) {
          up.a(true);
          lp.a(td.field_d, -40, true, he.field_m);
          jd.field_l = true;
          return;
        } else {
          lp.a(td.field_d, -40, true, he.field_m);
          jd.field_l = true;
          return;
        }
    }

    final void a(ll param0, int param1) {
        if (null != param0.field_l) {
            param0.b((byte) -2);
        }
        param0.field_n = ((up) this).field_a;
        if (param1 != -32711) {
            return;
        }
        try {
            param0.field_l = ((up) this).field_a.field_l;
            param0.field_l.field_n = param0;
            param0.field_n.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "up.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            up.c((byte) 109);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final int b(byte param0) {
        int var2 = 0;
        ll var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param0 != 53) {
          int discarded$2 = ((up) this).b((byte) 10);
          var2 = 0;
          var3 = ((up) this).field_a.field_n;
          L0: while (true) {
            if (((up) this).field_a == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_n;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = ((up) this).field_a.field_n;
          L1: while (true) {
            if (((up) this).field_a == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_n;
              continue L1;
            }
          }
        }
    }

    public up() {
        ((up) this).field_a = new ll();
        ((up) this).field_a.field_n = ((up) this).field_a;
        ((up) this).field_a.field_l = ((up) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Retreat", "Exercising the better part of valour, the <%0> is able to leave any room without triggering any trap or engaging any monster. (Single use)"};
    }
}
