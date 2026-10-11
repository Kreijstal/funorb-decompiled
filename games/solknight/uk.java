/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends a {
    private vg field_j;
    private vg field_l;
    static o field_k;

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_j.field_i.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (b.a(var5, (byte) 117)) {
            stackIn_6_0 = ub.field_a;
            return stackIn_6_0;
          }
          if (lc.a(0, var5)) {
            stackIn_9_0 = kb.field_e;
            return stackIn_9_0;
          }
          if (param1) {
            var6 = (String) null;
            this.a((String) null, false);
          }
          if (lh.a(var5, (byte) -112)) {
            stackIn_15_0 = uh.field_P;
            return stackIn_15_0;
          }
          if (this.a((byte) 85, param0)) {
            stackIn_18_0 = ji.field_c;
            return stackIn_18_0;
          }
          if (var7.length() <= 0) {
            stackIn_33_0 = ik.field_a;
            return stackIn_33_0;
          }
          if (ne.a(var5, false, var7)) {
            stackIn_23_0 = la.field_m;
            return stackIn_23_0;
          }
          if (gl.a(var5, 124, var7)) {
            stackIn_27_0 = wf.field_a;
            return stackIn_27_0;
          }
          if (!l.a(var7, var5, 0)) {
            return ub.field_a;
          }
          stackIn_31_0 = la.field_m;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("uk.K(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    final qf a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qf stackIn_3_0 = null;
        qf stackIn_6_0 = null;
        qf stackIn_11_0 = null;
        qf stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_j.field_i.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_3_0 = rg.field_f;
            return stackIn_3_0;
          }
          if (!bg.a(var3, 74, var4)) {
            stackIn_6_0 = rg.field_f;
            return stackIn_6_0;
          }
          if (param1 >= -109) {
            uk.a((byte) -12, 94);
          }
          if (!this.a((byte) 82, param0)) {
            stackIn_13_0 = ph.field_g;
            return stackIn_13_0;
          }
          stackIn_11_0 = rg.field_f;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uk.J(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean h(int param0) {
        if (param0 == 250) {
          return 250 < ad.field_h ? true : false;
        }
        uk.i(78);
        return 250 < ad.field_h ? true : false;
    }

    uk(vg param0, vg param1, vg param2) {
        super(param0);
        try {
          this.field_l = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != -64) {
          return 94;
        }
        if (param1 >= 4096) {
          return 6144 <= param1 ? -db.field_m[8192 - param1] : -db.field_m[param1 - 4096];
        }
        return 2048 <= param1 ? db.field_m[4096 - param1] : db.field_m[param1];
    }

    private final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = this.field_l.field_i.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 < 3) {
            field_k = (o) null;
          }
          if (var8.length() > 0 &&
            var4.length() > 0) {
            var5 = var8.lastIndexOf("@");
            if (var5 >= 0) {
              if (-1 + var8.length() <= var5) {
                return false;
              }
              var6 = var8.substring(0, var5);
              var7 = var8.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (0 <= var4.indexOf(var7)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("uk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int[] i(int param0) {
        if (param0 != -1) {
          uk.h(48);
          return new int[8];
        }
        return new int[8];
    }

    public static void j(int param0) {
        field_k = null;
        if (param0 != 8191) {
          uk.a((byte) -70, 101);
        }
    }

    static {
    }
}
