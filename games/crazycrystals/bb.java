/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends qf implements Cloneable {
    static ko field_x;
    static dl[] field_y;

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (param5 == 4261) {
            break L0;
          } else {
            bb.b(true);
            break L0;
          }
        }
        if (!((bb) this).field_u) {
          if (24 == param2) {
            if (param3 != 24) {
              jm.field_i.b(param1, -param3 + param4, 2 * param2, 3 * param3);
              return;
            } else {
              jm.field_i.a(param1, -param3 + param4);
              return;
            }
          } else {
            jm.field_i.b(param1, -param3 + param4, 2 * param2, 3 * param3);
            return;
          }
        } else {
          var7 = param2 + param1 << 1817689252;
          var8 = (param4 << -269689820) - -(param3 << -409829213);
          var9 = param2 * 4096 / 24;
          var10 = (int)(1024.0 * Math.random() - 512.0);
          jm.field_i.a(384, 576, var7, var8, var10, var9);
          return;
        }
    }

    bb(f param0) {
        super(param0);
    }

    public static void b(boolean param0) {
        field_y = null;
        field_x = null;
        if (!param0) {
            field_x = null;
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (0 >= param3) {
          if (param2) {
            return null;
          } else {
            return super.a(param0, param1, false, param3, param4, param5);
          }
        } else {
          fp.field_c.a(64, param4 * 12, 12 * param1, 0, (byte) -111);
          if (param2) {
            return null;
          } else {
            return super.a(param0, param1, false, param3, param4, param5);
          }
        }
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          return null;
        } else {
          return ng.a(ii.field_e, param1, (f) (Object) new bb((f) (Object) new kp(-1)), (byte) -83, rl.field_g);
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        if (param2 >= 0) {
          bb.b(false);
          fn.field_j = fn.field_j - 5;
          mb.field_g = mb.field_g - 5;
          fp.field_a = fp.field_a + 10;
          je.field_j = je.field_j + 5;
          b.field_a = b.field_a + 5;
          we.field_h = we.field_h + 10;
          bc.field_a.a(64, 12 * param3, param1 * 12, 0, (byte) -111);
          return false;
        } else {
          fn.field_j = fn.field_j - 5;
          mb.field_g = mb.field_g - 5;
          fp.field_a = fp.field_a + 10;
          je.field_j = je.field_j + 5;
          b.field_a = b.field_a + 5;
          we.field_h = we.field_h + 10;
          bc.field_a.a(64, 12 * param3, param1 * 12, 0, (byte) -111);
          return false;
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        if (!(((bb) this).field_s <= 0)) {
            fp.field_c.a(64, ((bb) this).field_o * ((bb) this).field_m + param3 * 12, ((bb) this).field_m * ((bb) this).field_s + param1 * 12, 0, (byte) -111);
        }
        int var5 = -102 % ((-43 - param2) / 51);
        return super.b(param0, param1, (byte) -105, param3);
    }

    static {
    }
}
