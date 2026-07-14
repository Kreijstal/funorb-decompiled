/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends tm {
    static String field_D;
    static String field_E;
    static String field_B;
    static int[] field_A;
    static double[][][] field_C;

    public static void g(int param0) {
        field_D = null;
        if (param0 != 220) {
          field_E = null;
          field_E = null;
          field_A = null;
          field_B = null;
          field_C = null;
          return;
        } else {
          field_E = null;
          field_A = null;
          field_B = null;
          field_C = null;
          return;
        }
    }

    uc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int h(byte param0) {
        if (param0 > -7) {
            return -31;
        }
        return -nb.field_k + so.field_e;
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
          field_E = null;
          return new li(hm.a((byte) 120, param1[0].b(-30368)));
        } else {
          return new li(hm.a((byte) 120, param1[0].b(-30368)));
        }
    }

    final static int h(int param0) {
        int var1 = 0;
        var1 = (int)(nj.a(-109) % 1440L) - 1000;
        if ((var1 ^ -1) < -1) {
          return 256 - (var1 % 220 << 31496968) / 220;
        } else {
          if (param0 < 9) {
            field_C = null;
            return -1;
          } else {
            return -1;
          }
        }
    }

    final static void a(tf param0, int param1) {
        gn var2 = null;
        gn var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = Kickabout.field_G;
        if (!ia.field_c) {
          L0: while (true) {
            if (kk.a(-27054, param0)) {
              if (param1 == -22488) {
                return;
              } else {
                var5 = null;
                uc.a((tf) null, 81);
                return;
              }
            } else {
              var2 = param0.g(24009);
              L1: while (true) {
                if (!(var2 instanceof ak)) {
                  continue L0;
                } else {
                  if (!(var2.field_d instanceof ak)) {
                    continue L0;
                  } else {
                    L2: {
                      var3 = var2.field_d;
                      if (((ak) (Object) var2).a((byte) -13) <= ((ak) (Object) var3).a((byte) 124)) {
                        break L2;
                      } else {
                        var2.c((byte) -109);
                        pa.a(var2, var3, (byte) 126);
                        break L2;
                      }
                    }
                    var2 = var3;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          ov.a(param0, 0);
          return;
        }
    }

    final static void a(long param0, int param1, int param2) {
        ml var4 = null;
        int var5 = 0;
        var4 = or.field_d;
        var4.b(param1, (byte) -94);
        var4.field_n = var4.field_n + 1;
        var5 = var4.field_n;
        var4.a(108, 6);
        if (param2 < 119) {
          return;
        } else {
          var4.a(param0, -1781890008);
          var4.c(62, var4.field_n - var5);
          return;
        }
    }

    final static void g(byte param0) {
        ou.a(0);
        hk.field_G = true;
        if (param0 != -54) {
            return;
        }
        po.field_f = true;
        wd.field_l.k(103);
        ku.a(ul.field_a, 4, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_B = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_C = new double[33][33][33];
        field_A = new int[256];
    }
}
