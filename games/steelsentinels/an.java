/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an implements Runnable {
    volatile boolean field_c;
    volatile tb[] field_e;
    static int[] field_d;
    static int field_b;
    static gh field_a;
    static int field_h;
    pn field_j;
    static dd field_i;
    static String[] field_g;
    volatile boolean field_f;

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var4 = 83 % ((param3 - 35) / 50);
        if (param0 != -1) {
          if (param0 != -2) {
            L0: {
              if (param1) {
                qf.a(false, (byte) -117);
                break L0;
              } else {
                break L0;
              }
            }
            i.field_e[param0].r(0);
            return;
          } else {
            pb.b();
            return;
          }
        } else {
          qf.a(param2, (byte) -122);
          return;
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        tb var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        ((an) this).field_f = true;
        try {
          L0: while (true) {
            if (((an) this).field_c) {
              ((an) this).field_f = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  a.a((byte) 118, 10L);
                  le.a((Object) null, 50, ((an) this).field_j);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((an) this).field_e[var1_int];
                    if (var2 != null) {
                      var2.b();
                      var1_int++;
                      break L2;
                    } else {
                      var1_int++;
                      break L2;
                    }
                  }
                  var1_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Exception) (Object) decompiledCaughtException;
          var5 = null;
          sj.a((String) null, -72, (Throwable) (Object) var1);
          ((an) this).field_f = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((an) this).field_f = false;
          throw an.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    public static void a() {
        field_d = null;
        field_i = null;
        field_g = null;
        field_a = null;
    }

    an() {
        ((an) this).field_e = new tb[2];
        ((an) this).field_c = false;
        ((an) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 100;
        field_h = 20;
        field_d = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
