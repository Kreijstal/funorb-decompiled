/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wc extends hl {
    int field_k;
    static byte[][] field_i;
    static String field_j;

    abstract qm a(boolean param0, float param1);

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -27) {
            field_j = (String) null;
          }
          if (param0 != null &&
            param0.length() >= ci.field_d &&
            param0.length() <= dn.field_D) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("wc.QA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract in a(boolean param0);

    final static fi a(int param0, String param1) {
        String var2 = null;
        fi var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          if (ah.field_a == null) {
            stackIn_3_0 = null;
            return (fi) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = kf.a(var6, (byte) -76);
          if (var2 == null) {
            var2 = param1;
          }
          if (param0 != 0) {
            field_j = (String) null;
          }
          var3 = (fi) (ah.field_a.a(-25839, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_mb);
            var4 = kf.a(var7, (byte) 119);
            if (var4 == null) {
              var4 = var3.field_mb;
            }
            if (!var4.equals(var2)) {
              var3 = (fi) (ah.field_a.a(20240));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("wc.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    abstract in a(byte param0, float param1);

    final static int e(int param0) {
        ra.field_Z.a(true);
        if (!ce.field_n.a((byte) 83)) {
          return qk.b(1);
        }
        if (param0 != -17204) {
          field_j = (String) null;
          return 0;
        }
        return 0;
    }

    abstract qm a(int param0);

    abstract float f(int param0);

    final static void a(byte param0, ib param1, java.awt.Component param2, int param3, int param4, boolean param5, int param6, tf param7) {
        try {
          if (param0 > -108) {
            wc.e(-51);
          }
          lo.a(param6, param5, 10);
          pk.field_G = lo.a(param1, param2, 0, param3);
          jd.field_G = lo.a(param1, param2, 1, param4);
          pk.field_H = new fg();
          ua.field_a = param4;
          jd.field_G.a(pk.field_H);
          ai.field_a = param7;
          ai.field_a.a(mk.field_e, -32284);
          pk.field_G.a(ai.field_a);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "wc.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    wc() {
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_j = (String) null;
        }
        field_i = (byte[][]) null;
        field_j = null;
    }

    final static wd a(wd param0, float param1, float param2, byte param3) {
        RuntimeException var4 = null;
        dd stackIn_2_0 = null;
        hn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 instanceof dd) {
            stackIn_2_0 = pb.a(param1, (byte) -111, (dd) (param0), param2);
            return (wd) ((Object) stackIn_2_0);
          }
          if (param3 != -115) {
            wc.b(false);
          }
          stackIn_6_0 = dc.a(param1, -18895, param2, (hn) (param0));
          return (wd) ((Object) stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wc.PA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        pa var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param1 != -6408) {
            wc.b(true);
          }
          if (param2 > 0) {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
              var8[var5_int] = param0[var5_int + param2];
            }
          } else {
            var4 = param0;
          }
          var5 = new pa();
          var5.b(false);
          var5.a(var4, (byte) -108, (long)(param3 * 8));
          var6 = new byte[64];
          var5.a(param1 ^ -530, var6, 0);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("wc.LA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract in g(int param0);

    static {
        field_j = "Play the game without logging in just yet";
    }
}
