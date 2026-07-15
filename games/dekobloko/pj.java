/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends sf {
    int field_K;
    static String field_G;
    static String field_F;
    static String[] field_N;
    static String field_L;
    static ck field_I;
    wl field_J;
    byte field_M;

    final int a(boolean param0) {
        if (param0) {
            return -110;
        }
        if (!(((pj) this).field_J != null)) {
            return 0;
        }
        return 100 * ((pj) this).field_J.field_n / (-((pj) this).field_M + ((pj) this).field_J.field_r.length);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void h(byte param0) {
        field_N = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
        if (param0 < 78) {
            int discarded$0 = pj.d(-100);
        }
    }

    final byte[] g(byte param0) {
        if (!((pj) this).field_z) {
          if (((pj) this).field_J.field_r.length - ((pj) this).field_M <= ((pj) this).field_J.field_n) {
            if (param0 <= 65) {
              int discarded$2 = pj.d(9);
              return ((pj) this).field_J.field_r;
            } else {
              return ((pj) this).field_J.field_r;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static int d(int param0) {
        int var1 = -62 % ((param0 - 81) / 40);
        return ac.field_A;
    }

    final static void a(ve param0, byte param1) {
        ve var2 = null;
        int var3 = 0;
        ve var4 = null;
        var3 = client.field_A ? 1 : 0;
        param0.b((byte) 108);
        if (param1 == -50) {
          ve dupTemp$2 = (ve) (Object) h.field_b.c((byte) -99);
          var4 = dupTemp$2;
          var2 = dupTemp$2;
          L0: while (true) {
            if (var4 != null) {
              if (var4.a(param0, false)) {
                var2 = (ve) (Object) h.field_b.d(true);
                continue L0;
              } else {
                L1: {
                  if (var2 != null) {
                    fm.a((byte) 114, (bh) (Object) param0, (bh) (Object) var2);
                    break L1;
                  } else {
                    h.field_b.a((bh) (Object) param0, 2777);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (var2 != null) {
                  fm.a((byte) 114, (bh) (Object) param0, (bh) (Object) var2);
                  break L2;
                } else {
                  h.field_b.a((bh) (Object) param0, 2777);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ul.field_d = param2;
        qk.field_d = param1;
        if (param0 != 31004) {
            int discarded$0 = pj.d(-44);
        }
    }

    pj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "This game option is only available to members.";
        field_G = "Add <%0> to ignore list";
        field_N = new String[16];
        field_L = "Enter name of player to add to list";
    }
}
