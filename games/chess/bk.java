/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends o {
    static int field_n;
    static String[] field_l;
    boolean field_m;
    int field_j;
    static int field_k;
    int[] field_o;

    final static ln a(int param0, int param1) {
        if (param0 <= -115) {
          return null != ae.field_f ? (ln) (ae.field_f.a((long)param1, 3000)) : null;
        }
        String var3 = (String) null;
        bk.a((byte) -107, true, (String) null, (ol) null, (String) null, 55, (String) null);
        return null != ae.field_f ? (ln) (ae.field_f.a((long)param1, 3000)) : null;
    }

    final static void a(int param0) {
        if (param0 != 16777215) {
          field_k = 78;
          me.field_a = null;
          return;
        }
        me.field_a = null;
    }

    final static boolean a(byte param0, boolean param1, String param2, ol param3, String param4, int param5, String param6) {
        vd var7 = null;
        RuntimeException var7_ref = null;
        vd var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ji.field_T != g.field_a) {
            return false;
          }
          var8 = new vd(jh.field_e, param3);
          var7 = var8;
          jh.field_e.b(var8, (byte) -93);
          if (jn.a(32359)) {
            var8.o(-10896);
          } else {
            lg.field_a = null;
            ih.field_Q = param6;
            g.field_a = ci.field_ub;
            cn.field_f = param5;
            jd.field_d = param2;
            oc.field_o = param4;
            wc.field_E = param1;
          }
          if (param0 > 71) {
            return true;
          }
          field_k = 107;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        if (!param0) {
          field_k = 115;
        }
    }

    bk() {
        this.field_m = false;
    }

    static {
        field_l = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_k = 16777215;
    }
}
