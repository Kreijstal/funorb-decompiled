/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static cn field_a;
    static String field_c;
    static cn field_f;
    static String field_e;
    static String field_b;
    static boolean field_d;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0) {
          field_a = null;
          field_c = null;
          return;
        }
        field_b = (String) null;
        field_a = null;
        field_c = null;
    }

    final static boolean a(byte param0) {
        if (param0 < -19) {
          return !im.field_b.b(36) ? true : false;
        }
        field_c = (String) null;
        return !im.field_b.b(36) ? true : false;
    }

    final static int a(int param0, int param1, int param2) {
        if (null == nl.field_g) {
          return -1;
        }
        if (param2 == 1) {
          if (wk.field_h <= param0 &&
            param0 < wk.field_h + nl.field_g.field_y &&
            param1 >= fo.field_b) {
            if (fo.field_b + nl.field_g.field_v > param1) {
              return 0;
            }
            if (param0 < rm.field_T) {
              return -1;
            }
            if (param0 >= nl.field_g.field_y + rm.field_T) {
              return -1;
            }
            if (param1 < mi.field_f) {
              return -1;
            }
            if (nl.field_g.field_v + mi.field_f <= param1) {
              return -1;
            }
            return 1;
          }
          if (param0 >= rm.field_T &&
            param0 < nl.field_g.field_y + rm.field_T &&
            param1 >= mi.field_f &&
            nl.field_g.field_v + mi.field_f > param1) {
            return 1;
          }
          return -1;
        }
        field_f = (cn) null;
        if (wk.field_h <= param0) {
          if (param0 >= wk.field_h + nl.field_g.field_y) {
            if (param0 < rm.field_T) {
              return -1;
            }
            if (param0 >= nl.field_g.field_y + rm.field_T) {
              return -1;
            }
            if (param1 < mi.field_f) {
              return -1;
            }
            if (nl.field_g.field_v + mi.field_f > param1) {
              return 1;
            }
            return -1;
          }
          if (param1 >= fo.field_b &&
            fo.field_b + nl.field_g.field_v > param1) {
            return 0;
          }
        }
        if (param0 < rm.field_T) {
          return -1;
        }
        if (param0 >= nl.field_g.field_y + rm.field_T) {
          return -1;
        }
        if (param1 < mi.field_f) {
          return -1;
        }
        if (nl.field_g.field_v + mi.field_f <= param1) {
          return -1;
        }
        return 1;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        jd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DungeonAssault.field_K;
        try {
          var2_int = -12 / ((param1 + 9) / 36);
          var3 = (jd) (ta.field_f.e(-24172));
          while (var3 != null) {
            o.a(param0, 62, var3);
            var3 = (jd) (ta.field_f.a(4));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "f.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "<%0>: <col=<%1>><%2></col>";
        field_c = "DUNGEON BUILDER";
        field_e = "A large, snarling wolf; it's grey fur is matted with blood.<br><br>If this monster detects a raider, its howl will alert monsters in adjacent rooms, increasing their <%detect> by 2.";
    }
}
