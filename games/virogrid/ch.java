/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String[] field_j;
    static java.math.BigInteger field_i;
    int field_g;
    static String field_h;
    int field_d;
    int field_c;
    int field_k;
    static int field_f;
    static boolean field_b;
    static um field_a;
    static boolean field_e;

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -73) {
            stackIn_6_0 = (null != j.a(0, param0));
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ch.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == 0) {
          field_i = null;
          field_j = null;
          field_h = null;
          return;
        }
        field_e = true;
        field_i = null;
        field_j = null;
        field_h = null;
    }

    final static void a(byte param0) {
        if (!kb.field_c) {
          throw new IllegalStateException();
        }
        if (hf.field_w != null) {
          hf.field_w.h(true);
        }
        String var1 = og.c(-113);
        aa.field_a = new ca(var1, (String) null, true, false, false);
        tm.field_l.a(0, fi.field_t);
        if (param0 < -109) {
          fi.field_t.b(aa.field_a, (byte) -53);
          fi.field_t.j(-4236);
          return;
        }
        String var2 = (String) null;
        ch.a((String) null, (byte) -120);
        fi.field_t.b(aa.field_a, (byte) -53);
        fi.field_t.j(-4236);
    }

    final static void a(int param0, pd param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        ok.field_G = param8;
        co.field_g = param4;
        ed.field_b = param3;
        fd.field_C = param7;
        rj.field_l = param5;
        ii.field_a = param1;
        if (param6 < 7) {
          return;
        }
        try {
          dl.field_c = param0;
          rb.field_c = param2;
          ji.field_e = (dk) ((Object) new pn());
          bc.field_a = new sb(param1);
          ql.field_q = new ha(ji.field_e, bc.field_a);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ch.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(boolean param0) {
        if (null == md.field_e) {
          md.field_e = null;
          wf.field_d = null;
          if (param0) {
            return;
          }
          field_i = (java.math.BigInteger) null;
          return;
        }
        if (null == md.field_e.field_d) {
          md.field_e = null;
          wf.field_d = null;
          if (param0) {
            return;
          }
          field_i = (java.math.BigInteger) null;
          return;
        }
        md.field_e.field_d.field_xb = false;
        md.field_e = null;
        wf.field_d = null;
        if (param0) {
          return;
        }
        field_i = (java.math.BigInteger) null;
    }

    static {
        field_h = "<%0> cannot join; the game is full.";
        field_f = 0;
        field_i = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
