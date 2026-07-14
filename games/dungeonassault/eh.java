/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    int field_g;
    il[] field_l;
    int field_m;
    int[] field_k;
    int[] field_j;
    String field_b;
    static String[] field_e;
    nh field_d;
    static String field_a;
    private md field_n;
    int field_f;
    String field_i;
    static ed field_o;
    static int field_h;
    int field_c;

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 83) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (il.field_c == null) {
              break L2;
            } else {
              if (!il.field_c.b(-108)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(boolean param0, String param1) {
        if (!param0) {
            boolean discarded$0 = eh.b(-91);
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return nn.field_k.equals((Object) (Object) jm.a((byte) 59, var3));
    }

    final void a(byte param0) {
        ((eh) this).field_n = null;
        if (param0 != -19) {
            Object var3 = null;
            boolean discarded$0 = eh.a(true, (String) null);
        }
        ((eh) this).field_l = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_o = null;
        if (param0 <= 49) {
            Object var2 = null;
            boolean discarded$0 = eh.a(false, (String) null);
        }
    }

    private final cn a(byte param0, int param1) {
        cn var3 = null;
        int var3_int = 0;
        int var4 = 0;
        cn var4_ref = null;
        int var5 = 0;
        cn var6 = null;
        L0: {
          var5 = DungeonAssault.field_K;
          if (((eh) this).field_l != null) {
            break L0;
          } else {
            ((eh) this).field_l = new il[((eh) this).field_c];
            break L0;
          }
        }
        L1: {
          if (null == ((eh) this).field_l[param1]) {
            break L1;
          } else {
            var3 = ((eh) this).field_l[param1].a(16);
            if (var3 == null) {
              break L1;
            } else {
              return var3;
            }
          }
        }
        var3_int = 0;
        L2: while (true) {
          if (var3_int >= ((eh) this).field_c) {
            var4 = -62 / ((56 - param0) / 55);
            var6 = ia.a(((eh) this).field_b, ((eh) this).field_m, ((eh) this).field_i, 2316, ((eh) this).field_g, Integer.toString(((eh) this).field_k[param1]), ((eh) this).field_d);
            var3 = var6;
            ((eh) this).field_l[param1] = new il(var6);
            return var3;
          } else {
            if (((eh) this).field_k[var3_int] == ((eh) this).field_k[param1]) {
              if (null != ((eh) this).field_l[var3_int]) {
                var4_ref = ((eh) this).field_l[var3_int].a(16);
                if (var4_ref != null) {
                  ((eh) this).field_l[param1] = ((eh) this).field_l[var3_int];
                  return var4_ref;
                } else {
                  var3_int++;
                  continue L2;
                }
              } else {
                var3_int++;
                continue L2;
              }
            } else {
              var3_int++;
              continue L2;
            }
          }
        }
    }

    final cn a(int param0, int param1, int param2, int param3) {
        fl var5_ref = null;
        cn var8 = null;
        int var7 = DungeonAssault.field_K;
        if (param0 == ((eh) this).field_g) {
            if (((eh) this).field_m == param2) {
                return this.a((byte) -94, param1);
            }
        }
        if (param3 != 0) {
            return null;
        }
        if (!(((eh) this).field_n != null)) {
            ((eh) this).field_n = new md();
        }
        fl var5 = (fl) (Object) ((eh) this).field_n.e(param3 ^ -24172);
        while (var5 != null) {
            if (var5.field_q == param0) {
                // if_icmpeq L129
            }
            var5 = (fl) (Object) ((eh) this).field_n.a(param3 ^ 4);
        }
        if (!(var5 != null)) {
            var5_ref = new fl(param0, param2, ((eh) this).field_c);
            ((eh) this).field_n.a((ne) (Object) var5_ref, false);
        }
        cn var6 = null;
        if (var5_ref.field_k[param1] != null) {
            var6 = var5_ref.field_k[param1].a(param3 ^ 16);
        }
        if (!(var6 != null)) {
            var8 = lc.a(-121, this.a((byte) -105, param1), param0, param2);
            var6 = var8;
            var5_ref.field_k[param1] = new il(var8);
        }
        return var6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Guardians", "<%highlight>This is a guardian room</col> - similar to <%traps>, a <%guardian> may be triggered by a raider entering the room. Unlike traps, they will never injure raiders or prevent progress through the dungeon. Instead, a triggered <%guardian> <%highlight>alerts all monsters in the dungeon</col>, making it harder to get the first attack against them."};
        field_a = "Gold stolen: ";
        field_h = 0;
    }
}
