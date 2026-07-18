/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends qr {
    static String[] field_Bb;
    qr field_Eb;
    static qr field_xb;
    qr field_Fb;
    static int field_Gb;
    static String field_Ab;
    ub field_Db;
    static long field_Cb;
    static String field_zb;
    qr field_yb;

    public static void g(int param0) {
        field_Bb = null;
        field_zb = null;
        field_Ab = null;
        if (param0 != 23880) {
            Object var2 = null;
            am.a(-49, 17, (bi) null, -112, 60, 124, (byte) -54);
            field_xb = null;
            return;
        }
        field_xb = null;
    }

    am(long param0, am param1, String param2, String param3) {
        this(param0, (qr) (Object) param1, param1.field_Db.field_zb, param1.field_Db.field_Ab, param1.field_Fb, param2, param3);
    }

    am(long param0, qr param1, qr param2, ur param3, qr param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((am) this).field_Eb = new qr(0L, (qr) null);
            ((am) this).field_Db = new ub(0L, ((am) this).field_Eb, param2, param3);
            ((am) this).field_Fb = new qr(0L, param4);
            ((am) this).field_yb = new qr(0L, param4);
            ((am) this).field_Fb.field_z = param5;
            ((am) this).field_yb.field_z = param6;
            ((am) this).a(4, (qr) (Object) ((am) this).field_Db);
            ((am) this).a(4, ((am) this).field_Fb);
            ((am) this).a(4, ((am) this).field_yb);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "am.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (((am) this).field_K + param0) / 2;
        int var6 = ((am) this).field_mb - param3;
        ((am) this).field_Db.a(((am) this).field_K, 0, 0, param0, param2 ^ -126, var6 + -param0, param1);
        ((am) this).field_Fb.field_mb = param3;
        ((am) this).field_Fb.field_hb = param2;
        ((am) this).field_Fb.field_K = -param0 + var5;
        ((am) this).field_Fb.field_db = var6;
        ((am) this).field_yb.field_K = ((am) this).field_K + -var5;
        ((am) this).field_yb.field_hb = var5;
        ((am) this).field_yb.field_db = var6;
        ((am) this).field_yb.field_mb = param3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        ((am) this).field_db = param1;
        if (param6 < 78) {
            ((am) this).field_yb = null;
            ((am) this).field_mb = param0;
            ((am) this).field_hb = param7;
            ((am) this).field_K = param5;
            ((am) this).a(param3, param2, 0, param4);
            return;
        }
        ((am) this).field_mb = param0;
        ((am) this).field_hb = param7;
        ((am) this).field_K = param5;
        ((am) this).a(param3, param2, 0, param4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = param3 / 10 + 1;
            var7 = 96 / var6_int;
            if (param2 < -14) {
              jq.a(96, 127, param0, 96 - var7, param4, param5, false, param1);
              var8 = 96;
              var9 = 1;
              L1: while (true) {
                if (var9 >= var6_int) {
                  break L0;
                } else {
                  var8 = var8 - var7;
                  jq.a(var8, 78, param0, -var7 + var8, param4, var9 * 10 + param5, true, param1);
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "am.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, bi param2, int param3, int param4, int param5, byte param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param1 = param1 - param2.field_x;
            param3 = param3 - param2.field_t;
            var8 = 103 / ((param6 - 72) / 52);
            var7_int = param1 * param2.field_z - -param3;
            var9 = gf.field_b * param5 + param0;
            L1: while (true) {
              param4--;
              if (param4 < 0) {
                break L0;
              } else {
                int incrementValue$8 = var9;
                var9++;
                int incrementValue$9 = var7_int;
                var7_int++;
                gf.field_h[incrementValue$8] = param2.field_B[incrementValue$9];
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("am.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_Ab = "Who can join";
        field_zb = "Efficiency";
    }
}
