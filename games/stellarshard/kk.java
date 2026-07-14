/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends lk {
    static String field_n;
    static bh field_k;
    static int field_o;
    static String field_l;
    static volatile long field_m;

    final String b(byte param0, String param1) {
        int var3 = 23 / ((param0 - 20) / 40);
        if (((kk) this).a((byte) 98, param1) != qj.field_c) {
            return null;
        }
        return a.field_g;
    }

    final static void a(int param0, gg param1, gg param2) {
        if (null != param1.field_c) {
            param1.c(20);
        }
        param1.field_c = param2.field_c;
        param1.field_g = param2;
        param1.field_c.field_g = param1;
        param1.field_g.field_c = param1;
        if (param0 < 53) {
            kk.e((byte) 58);
        }
    }

    final cg a(byte param0, String param1) {
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!(rg.a((byte) 19, var4))) {
            return qj.field_c;
        }
        if (param0 <= 10) {
            field_k = null;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = pf.a(var5, (byte) 125);
        if (0 < var3) {
            // if_icmplt L68
        } else {
            return qj.field_c;
        }
        return lg.field_c;
    }

    final static String a(int param0, byte param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = stellarshard.field_B;
        var11 = new char[param0];
        var10 = var11;
        var4 = var10;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param0) {
            var7 = 100 / ((-4 - param1) / 34);
            return new String(var11, 0, var5);
          } else {
            var7 = param3[var6 + param2] & 255;
            if (0 != var7) {
              L1: {
                if ((var7 ^ -1) > -129) {
                  break L1;
                } else {
                  if ((var7 ^ -1) <= -161) {
                    break L1;
                  } else {
                    L2: {
                      var8 = wf.field_a[var7 - 128];
                      if (var8 != 0) {
                        break L2;
                      } else {
                        var8 = 63;
                        break L2;
                      }
                    }
                    var7 = var8;
                    break L1;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    kk(ae param0) {
        super(param0);
    }

    public static void e(byte param0) {
        field_l = null;
        field_k = null;
        field_n = null;
        if (param0 != -61) {
            field_l = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "End Game";
        field_k = new bh("email");
        field_m = 0L;
        field_l = "Members";
    }
}
