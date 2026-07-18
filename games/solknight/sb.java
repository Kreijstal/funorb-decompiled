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
        int var3 = param0 >> 16;
        int var4 = 65535 & param0;
        int var5 = param1 >> 16;
        int var6 = 65535 & param1;
        return (var4 * var6 >> 16) + (param1 * var3 - -(var4 * var5));
    }

    final static hd a(byte[] param0, int param1) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new hd(param0, ph.field_h, qf.field_d, sa.field_l, uj.field_b, jc.field_c);
              og.a((byte) -97);
              stackOut_3_0 = (hd) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("sb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 32223 + ')');
        }
        return stackIn_4_0;
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
