/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends vo {
    static String field_f;
    private bm field_i;
    private bm field_h;
    static String field_g;
    static boolean[] field_e;

    final static void a(int param0, float param1, String param2) {
        try {
          dq.field_b = param2;
          NetworkGameClient.field_I = param1;
          if (param0 >= -23) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        if (param0 != 31574) {
          field_f = (String) null;
          return nf.field_a;
        }
        return nf.field_a;
    }

    final static String c(byte param0) {
        int var1 = 106 / ((-51 - param0) / 60);
        if (ht.field_g) {
          return null;
        }
        if (jp.field_b > ScreenParticle.field_o) {
          return null;
        }
        if (!(ScreenParticle.field_o >= NetworkGameClient.field_B + jp.field_b)) {
          return qj.field_s;
        }
        return null;
    }

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_e = (boolean[]) null;
          }
          var8 = this.field_h.field_f.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 < var8.length()) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var8.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < -1 + var8.length()) {
              var6 = var8.substring(0, var5);
              var7 = var8.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_14_0 = (var4.indexOf(var7) >= 0);
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("fh.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
          field_f = (String) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_i.field_f.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (param1 != 72) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          var5 = var4;
          if (vr.a(var5, param1 ^ 74)) {
            stackIn_9_0 = co.field_a;
            return stackIn_9_0;
          }
          if (ul.a(var5, (byte) -115)) {
            stackIn_12_0 = ii.field_g;
            return stackIn_12_0;
          }
          if (Vector2.a(var5, 26035)) {
            stackIn_16_0 = mh.field_j;
            return stackIn_16_0;
          }
          if (this.b(param0, -1)) {
            stackIn_20_0 = fj.field_b;
            return stackIn_20_0;
          }
          if (var6.length() <= 0) {
            stackIn_23_0 = lk.field_g;
            return stackIn_23_0;
          }
          if (ol.a(var6, -128, var5)) {
            stackIn_27_0 = mr.field_a;
            return stackIn_27_0;
          }
          if (cr.a(var5, var6, (byte) 52)) {
            stackIn_30_0 = qa.field_c;
            return stackIn_30_0;
          }
          if (!lb.a(var6, var5, -115)) {
            stackIn_35_0 = co.field_a;
            return stackIn_35_0;
          }
          stackIn_33_0 = mr.field_a;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("fh.EA(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    final pt a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        pt stackIn_2_0 = null;
        pt stackIn_6_0 = null;
        pt stackIn_9_0 = null;
        pt stackIn_12_0 = null;
        pt stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8192) {
            stackIn_2_0 = (pt) null;
            return stackIn_2_0;
          }
          var3 = this.field_i.field_f.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_6_0 = bt.field_a;
            return stackIn_6_0;
          }
          if (!bu.a(118, var4, var3)) {
            stackIn_9_0 = bt.field_a;
            return stackIn_9_0;
          }
          if (!this.b(param0, -1)) {
            stackIn_14_0 = fd.field_a;
            return stackIn_14_0;
          }
          stackIn_12_0 = bt.field_a;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fh.DA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    fh(bm param0, bm param1, bm param2) {
        super(param0);
        try {
          this.field_i = param1;
          this.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new boolean[64];
        field_g = "???";
        field_f = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
