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
          param0.field_n = this.field_d;
          param0.field_l = this.field_d.field_l;
          param0.field_l.field_n = param0;
          param0.field_n.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "dh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new id(this));
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int[] var11 = null;
        int[] var9 = null;
        int[] var8 = null;
        int[] var14 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        try {
          var11 = new int[4];
          var9 = var11;
          var8 = var9;
          var14 = var8;
          gf.a(var11);
          gf.e(0, param3 - 16, 640, param2 + (param0 + param3));
          var5 = (200 - bl.field_s.field_E >> 1) + param1;
          for (var6 = -16 + param3; 32 + param2 + param3 > var6; var6 = var6 + bl.field_s.field_G) {
            bl.field_s.h(var5, var6);
          }
          gf.b(var14);
          ao.field_n.d(param1 + (-ao.field_n.field_E + 200 >> 1), -(ao.field_n.field_G >> 1) - 16 + param3, 500, 0);
          rn.field_c.d((200 - rn.field_c.field_E >> 1) + param1, param2 + param3 + (20 - (rn.field_c.field_G >> 1)), 0, 500);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "dh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void b(int param0) {
        if (0 - hh.field_b == nl.field_d) {
          nl.field_d = nl.field_d + 1;
          if (param0 <= -123) {
            return;
          }
          dh.a(true);
          return;
        }
        if (nl.field_d != -hh.field_b + 250) {
          nl.field_d = nl.field_d + 1;
          if (param0 <= -123) {
            return;
          }
          dh.a(true);
          return;
        }
        nl.field_d = nl.field_d + 1;
        if (param0 <= -123) {
          return;
        }
        dh.a(true);
    }

    final ll b(boolean param0) {
        ll var2 = this.field_d.field_n;
        if (this.field_d == var2) {
          return null;
        }
        var2.b((byte) -2);
        if (param0) {
          return var2;
        }
        ll var3 = (ll) null;
        this.a((ll) null, false);
        return var2;
    }

    final static boolean a(byte param0) {
        if (param0 >= -46) {
          field_g = -126;
          if (sp.field_c == null) {
            return false;
          }
          if (pd.field_A == qa.field_c) {
            return true;
          }
          return false;
        }
        if (sp.field_c == null) {
          return false;
        }
        if (pd.field_A == qa.field_c) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 == 20) {
          field_f = null;
          field_e = null;
          return;
        }
        dh.a(-80);
        field_f = null;
        field_e = null;
    }

    private dh() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "<br><br>This will activate your dungeon, allowing other players to raid it.";
        field_b = new af();
        field_e = "Traps";
    }
}
