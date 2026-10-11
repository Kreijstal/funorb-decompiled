/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends aba {
    static boolean field_g;
    private lka field_j;
    static String field_h;
    private lka field_k;
    static sna[] field_i;

    final jg a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_6_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_13_0 = null;
        jg stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_j.field_w.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_3_0 = jt.field_f;
            return stackIn_3_0;
          }
          if (!bq.a(var4, 20133, var3)) {
            stackIn_6_0 = jt.field_f;
            return stackIn_6_0;
          }
          if (this.a(true, param0)) {
            stackIn_10_0 = jt.field_f;
            return stackIn_10_0;
          }
          if (!param1) {
            stackIn_15_0 = cm.field_u;
            return stackIn_15_0;
          }
          stackIn_13_0 = (jg) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wg.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!qo.field_c) {
          throw new IllegalStateException();
        }
        if (param0) {
          return;
        }
        lia.field_i = true;
        gq.a(true, 19626);
        jv.field_j = 0;
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 22753) {
          field_i = (sna[]) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_j.field_w.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (eha.a(15, var5)) {
            stackIn_6_0 = fd.field_E;
            return stackIn_6_0;
          }
          if (kaa.a(var5, (byte) 63)) {
            stackIn_10_0 = sh.field_D;
            return stackIn_10_0;
          }
          var6 = 24 / ((param0 + 8) / 45);
          if (tfa.a(-124, var5)) {
            stackIn_13_0 = uv.field_k;
            return stackIn_13_0;
          }
          if (this.a(true, param1)) {
            stackIn_16_0 = um.field_b;
            return stackIn_16_0;
          }
          if (0 >= var7.length()) {
            stackIn_31_0 = nw.field_q;
            return stackIn_31_0;
          }
          if (vs.a(-62, var7, var5)) {
            stackIn_21_0 = me.field_s;
            return stackIn_21_0;
          }
          if (cw.a(var5, var7, true)) {
            stackIn_25_0 = pka.field_a;
            return stackIn_25_0;
          }
          if (!db.a(var7, var5, false)) {
            return fd.field_E;
          }
          stackIn_29_0 = me.field_s;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("wg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final boolean a(boolean param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            wg.a(true);
          }
          var3 = this.field_k.field_w.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              -1 + var3.length() > var5) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (0 <= var4.indexOf(var6)) {
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
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        String var2 = null;
        String var2Lifetime1;
        if (param1 != 83) {
          wg.a(false, -62);
          var2 = lka.field_E[param0][19];
          var2 = var2.trim();
          if (var2.equals("")) {
            return -1;
          }
          return ((ji) (pga.field_b.a(true, (long)var2.hashCode()))).field_h;
        }
        var2Lifetime1 = lka.field_E[param0][19];
        var2Lifetime1 = var2Lifetime1.trim();
        if (var2Lifetime1.equals("")) {
          return -1;
        }
        return ((ji) (pga.field_b.a(true, (long)var2Lifetime1.hashCode()))).field_h;
    }

    wg(lka param0, lka param1, lka param2) {
        super(param0);
        try {
          this.field_k = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -21) {
          return;
        }
        if (jea.field_c != null) {
          if (!jea.field_c.a(param0, (byte) -113)) {
            return;
          }
          jea.field_c = null;
        }
    }

    static {
        field_h = "This is your shopping list. You can click this to be taken to groceout.com, where you can spend your ill-gotten gains on more food!";
        field_g = false;
    }
}
