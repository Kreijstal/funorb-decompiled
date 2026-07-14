/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wc extends hl {
    int field_k;
    static byte[][] field_i;
    static String field_j;

    abstract qm a(boolean param0, float param1);

    final static boolean a(String param0, byte param1) {
        if (param1 != -27) {
            field_j = null;
        }
        if (param0 != null) {
            if (param0.length() >= ci.field_d) {
                if (param0.length() <= dn.field_D) {
                    return false;
                }
            }
        }
        return true;
    }

    abstract in a(boolean param0);

    final static fi a(int param0, String param1) {
        String var2 = null;
        fi var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = HoldTheLine.field_D;
        if (ah.field_a != null) {
          L0: {
            var6 = (CharSequence) (Object) param1;
            var2 = kf.a(var6, (byte) -76);
            if (var2 == null) {
              var2 = (String) (Object) var6;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              field_j = null;
              break L1;
            }
          }
          var3 = (fi) (Object) ah.field_a.a(-25839, (long)var2.hashCode());
          L2: while (true) {
            if (var3 != null) {
              L3: {
                var7 = (CharSequence) (Object) var3.field_mb;
                var4 = kf.a(var7, (byte) 119);
                if (var4 != null) {
                  break L3;
                } else {
                  var4 = var3.field_mb;
                  break L3;
                }
              }
              if (!var4.equals((Object) (Object) var2)) {
                var3 = (fi) (Object) ah.field_a.a(20240);
                continue L2;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    abstract in a(byte param0, float param1);

    final static int e(int param0) {
        ra.field_Z.a(true);
        if (!(ce.field_n.a((byte) 83))) {
            return qk.b(1);
        }
        if (param0 != -17204) {
            field_j = null;
            return 0;
        }
        return 0;
    }

    abstract qm a(int param0);

    abstract float f(int param0);

    final static void a(byte param0, ib param1, java.awt.Component param2, int param3, int param4, boolean param5, int param6, tf param7) {
        if (param0 > -108) {
            int discarded$0 = wc.e(-51);
        }
        lo.a(param6, param5, 10);
        pk.field_G = lo.a(param1, param2, 0, param3);
        jd.field_G = lo.a(param1, param2, 1, param4);
        pk.field_H = new fg();
        ua.field_a = param4;
        jd.field_G.a((tj) (Object) pk.field_H);
        ai.field_a = param7;
        ai.field_a.a(mk.field_e, -32284);
        pk.field_G.a((tj) (Object) ai.field_a);
    }

    wc() {
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_j = null;
        }
        field_i = null;
        field_j = null;
    }

    final static wd a(wd param0, float param1, float param2, byte param3) {
        if (param0 instanceof dd) {
            return (wd) (Object) pb.a(param1, (byte) -111, (dd) (Object) param0, param2);
        }
        if (param3 != -115) {
            wc.b(false);
        }
        return (wd) (Object) dc.a(param1, -18895, param2, (hn) (Object) param0);
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = HoldTheLine.field_D;
        if (param1 != -6408) {
            wc.b(true);
        }
        if ((param2 ^ -1) >= -1) {
            var4 = param0;
        } else {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
                var8[var5_int] = param0[var5_int + param2];
            }
        }
        pa var5 = new pa();
        var5.b(false);
        var5.a(var4, (byte) -108, (long)(param3 * 8));
        byte[] var6 = new byte[64];
        var5.a(param1 ^ -530, var6, 0);
        return var6;
    }

    abstract in g(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Play the game without logging in just yet";
    }
}
