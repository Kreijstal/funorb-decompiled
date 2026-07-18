/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends hd {
    static double[][] field_Bb;
    np field_Cb;
    static boolean field_Db;
    hd field_Eb;
    hd field_yb;
    hd field_zb;
    static n field_Ab;

    final static int a(boolean param0, byte param1) {
        int var2 = 0;
        if (ja.field_O) {
          if (!param0) {
            var2 = 87 % ((-53 - param1) / 43);
            return (256 + -hw.field_i >> 1) + 70;
          } else {
            return 200;
          }
        } else {
          var2 = 87 % ((-53 - param1) / 43);
          return (256 + -hw.field_i >> 1) + 70;
        }
    }

    public static void a(int param0) {
        field_Ab = null;
        field_Bb = null;
        if (param0 != 1) {
            tc discarded$0 = al.h((byte) 68);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((al) this).field_mb = param1;
        ((al) this).field_J = param3;
        ((al) this).field_s = param7;
        ((al) this).field_q = param4;
        ((al) this).a(param6, param0, (byte) 19, param2);
        if (param5 < 82) {
            al.a(-85);
        }
    }

    al(long param0, hd param1, hd param2, na param3, hd param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((al) this).field_yb = new hd(0L, (hd) null);
            ((al) this).field_Cb = new np(0L, ((al) this).field_yb, param2, param3);
            ((al) this).field_Eb = new hd(0L, param4);
            ((al) this).field_zb = new hd(0L, param4);
            ((al) this).field_Eb.field_E = param5;
            ((al) this).field_zb.field_E = param6;
            ((al) this).a((byte) -110, (hd) (Object) ((al) this).field_Cb);
            ((al) this).a((byte) -113, ((al) this).field_Eb);
            ((al) this).a((byte) -109, ((al) this).field_zb);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "al.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static tc h(byte param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        tc var2 = null;
        int var3 = 0;
        tc stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        tc stackOut_5_0 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (param0 >= 123) {
              break L0;
            } else {
              field_Bb = null;
              break L0;
            }
          }
          var1_int = 0;
          L1: while (true) {
            var2 = vc.field_x.a(200, var1_int);
            if (!var2.field_t) {
              var1_int++;
              continue L1;
            } else {
              stackOut_5_0 = (tc) var2;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    al(long param0, al param1, String param2, String param3) {
        this(param0, (hd) (Object) param1, param1.field_Cb.field_zb, param1.field_Cb.field_Fb, param1.field_Eb, param2, param3);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (((al) this).field_q + param0) / 2;
        var6 = -param3 + ((al) this).field_mb;
        ((al) this).field_Cb.a(param0, 117, var6 - param0, 0, 0, ((al) this).field_q, param1);
        ((al) this).field_Eb.field_s = 0;
        ((al) this).field_Eb.field_J = var6;
        if (param2 != 19) {
          al.a(48);
          ((al) this).field_Eb.field_mb = param3;
          ((al) this).field_Eb.field_q = var5 + -param0;
          ((al) this).field_zb.field_q = ((al) this).field_q + -var5;
          ((al) this).field_zb.field_J = var6;
          ((al) this).field_zb.field_s = var5;
          ((al) this).field_zb.field_mb = param3;
          return;
        } else {
          ((al) this).field_Eb.field_mb = param3;
          ((al) this).field_Eb.field_q = var5 + -param0;
          ((al) this).field_zb.field_q = ((al) this).field_q + -var5;
          ((al) this).field_zb.field_J = var6;
          ((al) this).field_zb.field_s = var5;
          ((al) this).field_zb.field_mb = param3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new double[][]{new double[3], new double[3], new double[3]};
    }
}
