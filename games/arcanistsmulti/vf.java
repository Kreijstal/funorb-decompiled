/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends pg {
    static so field_g;
    byte[] field_t;
    static ed field_k;
    static ec field_s;
    static kc field_i;
    static int field_m;
    static String field_p;
    static int field_o;
    static int field_q;
    static int field_r;
    static int[] field_n;
    static kc field_u;
    static int field_l;
    static int[] field_v;
    static String field_h;
    static String field_j;

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 3) {
            stackIn_3_0 = fm.field_a;
            return stackIn_3_0;
          }
          if (6 == param2) {
            stackIn_6_0 = rf.field_k;
            return stackIn_6_0;
          }
          if (param2 == 7) {
            stackIn_10_0 = mm.field_v;
            return stackIn_10_0;
          }
          if (param2 == 8) {
            stackIn_14_0 = mf.field_f;
            return stackIn_14_0;
          }
          if (param0 >= -5) {
            field_o = -110;
          }
          if (param2 == 9) {
            stackIn_19_0 = v.field_n;
            return stackIn_19_0;
          }
          if (10 == param2) {
            stackIn_23_0 = oj.field_c;
            return stackIn_23_0;
          }
          if (11 == param2) {
            stackIn_27_0 = wd.field_f;
            return stackIn_27_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_31_0 = tj.a(-17, new String[]{param1}, ji.field_k);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("vf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    final static cg a(long param0, int param1) {
        if (param1 != 8192) {
          field_h = (String) null;
          return (cg) (kn.field_qb.a(param0, (byte) -121));
        }
        return (cg) (kn.field_qb.a(param0, (byte) -121));
    }

    public static void a(int param0) {
        field_i = null;
        field_h = null;
        field_p = null;
        field_u = null;
        field_n = null;
        field_s = null;
        field_j = null;
        field_g = null;
        if (param0 == 27494) {
          field_v = null;
          field_k = null;
          return;
        }
        vf.a(-96L, -109);
        field_v = null;
        field_k = null;
    }

    vf(byte[] param0) {
        try {
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new so(1);
        field_p = "Press '<col=ffffff><%0></col>' or '<col=ffffff><%1></col>' to cycle through your minions or to centre on your Arcanist.<br>  Use the '<col=ffffff>Arrow keys</col>' to scroll around the map.";
        km.a(100, 50);
        field_v = new int[8192];
        field_h = "Spellbook not acquired";
    }
}
