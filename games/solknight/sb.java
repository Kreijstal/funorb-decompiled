/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static nc field_c;
    dl field_b;
    volatile gj[] field_a;
    volatile boolean field_e;
    volatile boolean field_f;
    static int field_d;

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        gj var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        ((sb) this).field_f = true;
        try {
          L0: while (true) {
            if (((sb) this).field_e) {
              ((sb) this).field_f = false;
              return;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (2 <= var1_int) {
                  i.a((byte) 18, 10L);
                  var5 = null;
                  pb.a(((sb) this).field_b, (Object) null, (byte) 106);
                  continue L0;
                } else {
                  L2: {
                    var2 = ((sb) this).field_a[var1_int];
                    if (var2 == null) {
                      var1_int++;
                      var1_int++;
                      break L2;
                    } else {
                      var2.b();
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
          var6 = null;
          hi.a((Throwable) (Object) var1, (String) null, 1);
          ((sb) this).field_f = false;
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          ((sb) this).field_f = false;
          throw sb.<RuntimeException>$cfr$sneakyThrow(var3);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param2 != 1513551664) {
          return -96;
        } else {
          var3 = param0 >> 1218313584;
          var4 = 65535 & param0;
          var5 = param1 >> 134446224;
          var6 = 65535 & param1;
          return (var4 * var6 >> 1513551664) + (param1 * var3 - -(var4 * var5));
        }
    }

    final static hd a(byte[] param0, int param1) {
        hd var2 = null;
        if (param0 != null) {
          if (param1 != 32223) {
            field_d = 21;
            var2 = new hd(param0, ph.field_h, qf.field_d, sa.field_l, uj.field_b, jc.field_c);
            og.a((byte) -97);
            return var2;
          } else {
            var2 = new hd(param0, ph.field_h, qf.field_d, sa.field_l, uj.field_b, jc.field_c);
            og.a((byte) -97);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -90) {
            sb.a((byte) -7);
        }
    }

    sb() {
        ((sb) this).field_a = new gj[2];
        ((sb) this).field_e = false;
        ((sb) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new nc();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
