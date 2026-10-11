/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static ao field_d;
    static int field_g;
    static String field_c;
    static int field_e;
    static String field_f;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 4) {
          return;
        }
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static fc a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fc stackIn_2_0 = null;
        bm stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        bm stackIn_12_0 = null;
        bm stackIn_14_0 = null;
        bm stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -96) {
            stackIn_2_0 = (fc) null;
            return stackIn_2_0;
          }
          var2_int = re.a(param1, 0, (byte) 77);
          if (var2_int == 3) {
            stackIn_16_0 = gd.a(param1, (byte) 46);
            return (fc) ((Object) stackIn_16_0);
          }
          if (4 == var2_int) {
            stackIn_14_0 = ij.a(param1, 7);
            return (fc) ((Object) stackIn_14_0);
          }
          if (5 == var2_int) {
            stackIn_7_0 = bo.a(param1, 24);
            return (fc) ((Object) stackIn_7_0);
          }
          if (var2_int == 6) {
            stackIn_12_0 = no.a((byte) 104, param1);
            return (fc) ((Object) stackIn_12_0);
          }
          stackIn_10_0 = null;
          return (fc) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("sf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param2);
          if (!em.a(var6, (byte) -38)) {
            stackIn_3_0 = u.field_f;
            return stackIn_3_0;
          }
          if (sf.a(1, param2)) {
            stackIn_6_0 = hf.field_b;
            return stackIn_6_0;
          }
          if (ge.field_zb != 2) {
            stackIn_9_0 = bg.field_d;
            return stackIn_9_0;
          }
          if (hp.a(param2, 1020)) {
            stackIn_12_0 = vl.a(lo.field_i, new String[]{param2}, 2);
            return stackIn_12_0;
          }
          if (fn.field_d >= 100) {
            stackIn_15_0 = th.field_c;
            return stackIn_15_0;
          }
          if (kj.a((byte) -94, param2)) {
            stackIn_18_0 = vl.a(lo.field_h, new String[]{param2}, 2);
            return stackIn_18_0;
          }
          if (param0 >= -75) {
            field_d = (ao) null;
          }
          var5 = ma.field_a;
          var5.b((byte) -35, param1);
          var5.field_j = var5.field_j + 1;
          var4 = var5.field_j;
          var5.a(125, 2);
          var5.a(param2, (byte) 105);
          var5.e(100, -var4 + var5.field_j);
          stackIn_22_0 = null;
          return (String) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("sf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return false;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_4_0 = kf.field_k.equals(tg.a(var3, false));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_f = "Waiting for levels";
        field_g = 32;
        field_b = 17;
        field_e = 39;
        field_c = "<%0> cannot join; the game has started.";
        field_a = (640 - ((field_b - 1) * (-field_g + field_e) + field_g * field_b)) / 2;
        field_d = new ao(1, 2, 2, 0);
    }
}
