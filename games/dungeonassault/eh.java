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

    final static boolean b() {
        return il.field_c != null && il.field_c.b(-108);
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param1;
            stackOut_0_0 = nn.field_k.equals((Object) (Object) jm.a((byte) 59, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("eh.A(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        ((eh) this).field_n = null;
        if (param0 != -19) {
            Object var3 = null;
            boolean discarded$0 = eh.a(true, (String) null);
        }
        ((eh) this).field_l = null;
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_o = null;
    }

    private final cn a(byte param0, int param1) {
        cn var3 = null;
        int var3_int = 0;
        int var4 = 0;
        cn var4_ref_cn = null;
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
                var4_ref_cn = ((eh) this).field_l[var3_int].a(16);
                if (var4_ref_cn != null) {
                  ((eh) this).field_l[param1] = ((eh) this).field_l[var3_int];
                  return var4_ref_cn;
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
        fl var5 = null;
        Object var6 = null;
        int var7 = 0;
        cn var8 = null;
        L0: {
          var7 = DungeonAssault.field_K;
          if (param0 != ((eh) this).field_g) {
            break L0;
          } else {
            if (((eh) this).field_m != param2) {
              break L0;
            } else {
              return this.a((byte) -94, param1);
            }
          }
        }
        if (param3 == 0) {
          L1: {
            if (((eh) this).field_n == null) {
              ((eh) this).field_n = new md();
              break L1;
            } else {
              break L1;
            }
          }
          var5 = (fl) (Object) ((eh) this).field_n.e(param3 ^ -24172);
          L2: while (true) {
            L3: {
              if (var5 == null) {
                break L3;
              } else {
                L4: {
                  if (var5.field_q != param0) {
                    break L4;
                  } else {
                    if (param2 == var5.field_p) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = (fl) (Object) ((eh) this).field_n.a(param3 ^ 4);
                continue L2;
              }
            }
            L5: {
              if (var5 == null) {
                var5 = new fl(param0, param2, ((eh) this).field_c);
                ((eh) this).field_n.a((ne) (Object) var5, false);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var6 = null;
              if (var5.field_k[param1] == null) {
                break L6;
              } else {
                var6 = (Object) (Object) var5.field_k[param1].a(param3 ^ 16);
                break L6;
              }
            }
            L7: {
              if (var6 == null) {
                var8 = lc.a(-121, this.a((byte) -105, param1), param0, param2);
                var6 = (Object) (Object) var8;
                var5.field_k[param1] = new il(var8);
                break L7;
              } else {
                break L7;
              }
            }
            return (cn) var6;
          }
        } else {
          return null;
        }
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
