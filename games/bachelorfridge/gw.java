/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw {
    static String field_c;
    private dha field_a;
    private boolean field_e;
    private dha field_f;
    private dha field_d;
    private dha field_b;

    final dha a(double param0, int param1) {
        double var4;
        double var6;
        double var8;
        L0: {
          if (param1 > 57) {
            break L0;
          } else {
            gw.a(69);
            break L0;
          }
        }
        var4 = 1.0 - param0;
        var6 = Math.pow(var4, 3.0) * (double)this.field_f.field_c + param0 * (3.0 * Math.pow(var4, 2.0)) * (double)this.field_b.field_c + var4 * (Math.pow(param0, 2.0) * 3.0) * (double)this.field_a.field_c + Math.pow(param0, 3.0) * (double)this.field_d.field_c;
        var8 = Math.pow(var4, 3.0) * (double)this.field_f.field_a + param0 * (3.0 * Math.pow(var4, 2.0)) * (double)this.field_b.field_a + Math.pow(param0, 2.0) * 3.0 * var4 * (double)this.field_a.field_a + Math.pow(param0, 3.0) * (double)this.field_d.field_a;
        if (!this.field_e) {
          return new dha((int)Math.round(var6), (int)Math.round(var8));
        } else {
          return new dha((-(int)Math.round(var6) + 65536) % 65536, (int)Math.round(var8));
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 110) {
            return true;
        }
        if (jv.field_j < 10) {
            return false;
        }
        if (13 > lk.field_r) {
            return false;
        }
        return true;
    }

    final static kv[] a(String param0, String param1, vr param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vr var6 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a(param0, false);
              if (param3 <= -31) {
                break L1;
              } else {
                var6 = (vr) null;
                gw.a((String) null, (String) null, (vr) null, 110);
                break L1;
              }
            }
            var5 = param2.a((byte) 6, var4_int, param1);
            stackIn_3_0 = bna.a(var4_int, param2, -116, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("gw.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 25354) {
            gw.a((byte) 11);
        }
    }

    gw(dha param0, dha param1, dha param2, dha param3, int param4) {
        try {
            this.field_b = param1;
            this.field_a = param2;
            this.field_d = param3;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_c = "<%0> has lost connection.";
    }
}
