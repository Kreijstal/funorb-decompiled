/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static bl field_h;
    int[] field_g;
    int field_f;
    static pi field_b;
    static String field_e;
    static int field_a;
    static String field_d;
    int field_c;

    final static void a(String param0, int param1, String param2) {
        if (param1 == 0) {
          if (oj.field_q != null) {
            oj.field_q.q(param1 + 4210752);
            ig.field_ib = new pk(param2, param0, false, true, true);
            kg.field_j.a(false, (pj) (Object) ig.field_ib);
            return;
          } else {
            ig.field_ib = new pk(param2, param0, false, true, true);
            kg.field_j.a(false, (pj) (Object) ig.field_ib);
            return;
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          if (((ed) this).field_g != null) {
            if (((ed) this).field_g.length == 0) {
              return 0;
            } else {
              return ((ed) this).field_g[((ed) this).field_g.length + -1];
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          field_h = null;
          if (((ed) this).field_g == null) {
            return 0;
          } else {
            L0: {
              if (((ed) this).field_g.length != 0) {
                stackOut_4_0 = ((ed) this).field_g[((ed) this).field_g.length + -1];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != -1) {
            Object var2 = null;
            String discarded$0 = ed.a((String) null, (ki) null, -31, (String) null, (String) null);
        }
    }

    final static long b(int param0) {
        if (param0 != -1) {
            return -60L;
        }
        return -of.field_L + ji.b(-96);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (null != ((ed) this).field_g) {
          if (((ed) this).field_g.length != 0) {
            if (param1 == -1052047551) {
              var3 = 1;
              L0: while (true) {
                if (((ed) this).field_g.length > var3) {
                  if (param0 < ((ed) this).field_g[var3] + ((ed) this).field_g[-1 + var3] >> -1052047551) {
                    return var3 + -1;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return -1 + ((ed) this).field_g.length;
                }
              }
            } else {
              return -104;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static String a(String param0, ki param1, int param2, String param3, String param4) {
        if (param2 == -14416) {
          if (!param1.b(param2 ^ 14415)) {
            return param3;
          } else {
            return param0 + " - " + param1.a((byte) 102, param4) + "%";
          }
        } else {
          field_d = null;
          if (!param1.b(param2 ^ 14415)) {
            return param3;
          } else {
            return param0 + " - " + param1.a((byte) 102, param4) + "%";
          }
        }
    }

    ed(int param0, int param1, int param2) {
        ((ed) this).field_f = param0;
        ((ed) this).field_c = param1;
        ((ed) this).field_g = new int[param2 + 1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Range";
        field_a = 640;
        field_d = "Not upgradable";
    }
}
