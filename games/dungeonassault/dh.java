/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh implements Iterable {
    static af field_b;
    static String field_c;
    static String field_f;
    ll field_d;
    static cn field_a;
    static int field_g;
    static String field_e;

    final static boolean a(boolean param0) {
        if (param0) {
            field_g = -66;
            return true;
        }
        return true;
    }

    final void a(ll param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            if (null != param0.field_l) {
                param0.b((byte) -2);
            }
            param0.field_n = ((dh) this).field_d;
            param0.field_l = ((dh) this).field_d.field_l;
            param0.field_l.field_n = param0;
            param0.field_n.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "dh.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new id((dh) this);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var15 = new int[4];
            var13 = var15;
            var11 = var13;
            var9 = var11;
            var8 = var9;
            var16 = var8;
            gf.a(var15);
            gf.e(0, param3 - 16, 640, param2 + (param0 + param3));
            var5 = (200 - bl.field_s.field_E >> 1) + param1;
            var6 = -16 + param3;
            L1: while (true) {
              if (32 + param2 + param3 <= var6) {
                gf.b(var16);
                ao.field_n.d(param1 + (-ao.field_n.field_E + 200 >> 1), -(ao.field_n.field_G >> 1) + -16 + param3, 500, 0);
                rn.field_c.d((200 - rn.field_c.field_E >> 1) + param1, param2 + param3 + (20 - (rn.field_c.field_G >> 1)), 0, 500);
                break L0;
              } else {
                bl.field_s.h(var5, var6);
                var6 = var6 + bl.field_s.field_G;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "dh.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void b(int param0) {
        if (0 - hh.field_b != nl.field_d) {
          if (nl.field_d != -hh.field_b + 250) {
            nl.field_d = nl.field_d + 1;
            return;
          } else {
            nl.field_d = nl.field_d + 1;
            return;
          }
        } else {
          nl.field_d = nl.field_d + 1;
          return;
        }
    }

    final ll b(boolean param0) {
        ll var2 = null;
        Object var3 = null;
        var2 = ((dh) this).field_d.field_n;
        if (((dh) this).field_d != var2) {
          var2.b((byte) -2);
          if (!param0) {
            var3 = null;
            ((dh) this).a((ll) null, false);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < -46) {
          if (sp.field_c != null) {
            if (pd.field_A != qa.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_g = -126;
          if (sp.field_c != null) {
            if (pd.field_A != qa.field_c) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 20) {
          dh.a(-80);
          field_f = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          return;
        }
    }

    private dh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<br><br>This will activate your dungeon, allowing other players to raid it.";
        field_b = new af();
        field_e = "Traps";
    }
}
