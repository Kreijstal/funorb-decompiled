/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ip extends m implements jo {
    static String field_j;
    static int[] field_l;
    static String field_i;
    private rm field_h;
    static String field_k;

    abstract od a(String param0, int param1);

    final static ab a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        var2 = param1.length();
        if (var2 != 0) {
          if (var2 <= 63) {
            var3 = param0;
            L0: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var3 != var2 - 1) {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return np.field_E;
                } else {
                  if ((qj.field_b.indexOf(var4) ^ -1) == 0) {
                    return np.field_E;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return ta.field_d;
          }
        } else {
          return ri.field_e;
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_l = null;
        field_j = null;
        field_k = null;
        if (param0 != 19) {
            Object var2 = null;
            ab discarded$0 = ip.a(-122, (String) null);
        }
    }

    public final void a(rm param0, byte param1) {
        if (param1 >= -117) {
            field_j = null;
        }
    }

    public final boolean a(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = -78 % ((param0 - 8) / 40);
        if (null != ((ip) this).field_h.field_w) {
          if (((ip) this).field_h.field_w.length() == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    abstract String a(byte param0, String param1);

    final od b(boolean param0) {
        if (param0) {
          od discarded$2 = ((ip) this).b(true);
          return ((ip) this).a(((ip) this).field_h.field_w, -92);
        } else {
          return ((ip) this).a(((ip) this).field_h.field_w, -92);
        }
    }

    final String c(int param0) {
        if (param0 != 63) {
          field_j = null;
          return ((ip) this).a((byte) 48, ((ip) this).field_h.field_w);
        } else {
          return ((ip) this).a((byte) 48, ((ip) this).field_h.field_w);
        }
    }

    ip(rm param0) {
        ((ip) this).field_h = param0;
    }

    public final void a(rm param0, int param1) {
        ((ip) this).b(2899);
        if (param1 != 10000536) {
            field_i = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_i = "To Customer Support";
        field_k = "<col=DB0100><%0></col> attempted, <col=DB0100><%1></col> successful";
    }
}
