/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends um {
    private nn field_x;
    static int field_u;
    static String field_q;
    static String field_s;
    static int field_w;
    static long[] field_r;
    static String[] field_v;
    static hl field_t;

    final jk a(int param0, String param1) {
        vm var3 = null;
        jk stackIn_6_0 = null;
        jk stackIn_11_0 = null;
        jk stackIn_17_0 = null;
        jk stackOut_16_0 = null;
        jk stackOut_15_0 = null;
        jk stackOut_10_0 = null;
        jk stackOut_9_0 = null;
        jk stackOut_5_0 = null;
        jk stackOut_4_0 = null;
        if (param0 == 0) {
          if (((cb) this).field_x instanceof uc) {
            var3 = ((uc) (Object) ((cb) this).field_x).a(-123);
            if (var3 != null) {
              if (var3.c(-36) == pf.field_a) {
                L0: {
                  if (param1.equals((Object) (Object) ((cb) this).field_x.field_A)) {
                    stackOut_16_0 = pf.field_a;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_15_0 = db.field_h;
                    stackIn_17_0 = stackOut_15_0;
                    break L0;
                  }
                }
                return stackIn_17_0;
              } else {
                return db.field_h;
              }
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((cb) this).field_x.field_A)) {
                  stackOut_10_0 = pf.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  break L1;
                } else {
                  stackOut_9_0 = db.field_h;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                }
              }
              return stackIn_11_0;
            }
          } else {
            L2: {
              if (param1.equals((Object) (Object) ((cb) this).field_x.field_A)) {
                stackOut_5_0 = pf.field_a;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = db.field_h;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return null;
        }
    }

    cb(nn param0, nn param1) {
        super(param0);
        ((cb) this).field_x = param1;
    }

    public static void d(byte param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        field_s = null;
        if (param0 < 62) {
          cb.d((byte) -92);
          field_v = null;
          return;
        } else {
          field_v = null;
          return;
        }
    }

    final String a(String param0, int param1) {
        vm var3 = null;
        if (((cb) this).field_x instanceof uc) {
          var3 = ((uc) (Object) ((cb) this).field_x).a(-126);
          if (var3 != null) {
            if (var3.c(-64) == pf.field_a) {
              if (param0.equals((Object) (Object) ((cb) this).field_x.field_A)) {
                return var3.a((byte) -73);
              } else {
                return tl.field_N;
              }
            } else {
              return var3.a((byte) -73);
            }
          } else {
            if (!param0.equals((Object) (Object) ((cb) this).field_x.field_A)) {
              return tl.field_N;
            } else {
              if (param1 == 26202) {
                return null;
              } else {
                return null;
              }
            }
          }
        } else {
          if (!param0.equals((Object) (Object) ((cb) this).field_x.field_A)) {
            return tl.field_N;
          } else {
            if (param1 == 26202) {
              return null;
            } else {
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Find opponents";
        field_r = new long[1000];
        field_w = 360;
        field_s = "Game full";
    }
}
