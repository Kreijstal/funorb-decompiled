/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends vm {
    static int[] field_w;
    static ci field_m;
    private boolean field_s;
    static int field_l;
    static km[] field_p;
    private String field_t;
    static String field_q;
    static String[] field_u;
    static String field_n;
    static int[] field_r;
    static String field_o;
    static String field_v;

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        aj var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          var3 = tf.a(-73, var5);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_t)) {
            var4 = sb.b(param0, true);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_e) {
              return null;
            }
            this.field_t = param0;
            this.field_s = var4.field_h;
          }
          if (!this.field_s) {
            stackIn_12_0 = eg.field_g;
            return stackIn_12_0;
          }
          if (param1 == -9316) {
            stackIn_17_0 = rl.field_c;
            return stackIn_17_0;
          }
          stackIn_15_0 = (String) null;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("uh.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    uh(qn param0) {
        super(param0);
        this.field_s = false;
    }

    final static un i(int param0) {
        if (param0 != 23156) {
          return (un) null;
        }
        if (!hl.field_h) {
          return oc.field_p;
        }
        return pd.field_Lb;
    }

    final static int a(boolean param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        int var3Lifetime1;
        if ((param1 & 7) != 0) {
          var2 = 8 - (param1 & 7);
        }
        if (!param0) {
          var3 = var2 + param1;
          return var3;
        }
        uh.i(-54);
        var3Lifetime1 = var2 + param1;
        return var3Lifetime1;
    }

    final static void j(int param0) {
        if (param0 != -3750) {
          return;
        }
        if (!ad.field_b) {
          throw new IllegalStateException();
        }
        vh.field_e = true;
        vf.a(false, -128);
        rm.field_Q = 0;
    }

    final void h(int param0) {
        int var2 = -52 / ((param0 + 6) / 52);
        this.field_t = null;
    }

    public static void k(int param0) {
        field_u = null;
        field_r = null;
        field_m = null;
        field_w = null;
        field_p = null;
        if (param0 == 16) {
          field_q = null;
          field_n = null;
          field_v = null;
          field_o = null;
          return;
        }
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        aj var4 = null;
        CharSequence var5 = null;
        mk stackIn_3_0 = null;
        mk stackIn_10_0 = null;
        mk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -38 / ((-49 - param0) / 62);
          var5 = (CharSequence) ((Object) param1);
          if (!eb.a(var5, -1)) {
            stackIn_3_0 = qk.field_b;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_t)) {
            var4 = sb.b(param1, true);
            if (var4 != null &&
              null == var4.field_e) {
              this.field_t = param1;
              this.field_s = var4.field_h;
            } else {
              stackIn_10_0 = ek.field_d;
              return stackIn_10_0;
            }
          }
          if (this.field_s) {
            stackIn_15_0 = oa.field_a;
          } else {
            stackIn_15_0 = qk.field_b;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("uh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_w = new int[28];
        field_u = new String[28];
        field_w[23] = 2;
        field_u[25] = "halloween_background_models/wilderness_roots1";
        field_u[27] = "halloween_background_models/wilderness_roots3";
        field_w[6] = 2;
        field_u[13] = "halloween_background_models/plants_deadtree1";
        field_u[24] = "halloween_background_models/floor_dugupsoil6_0";
        field_w[12] = 2;
        field_w[19] = 2;
        field_w[21] = 2;
        field_u[14] = "halloween_background_models/plants_deadtree2";
        field_u[8] = "halloween_background_models/clanwars_dead_tree2";
        field_u[9] = "halloween_background_models/clanwars_dead_tree3";
        field_u[17] = "halloween_background_models/graves_east";
        field_u[22] = "halloween_background_models/floor_dugupsoil4_0";
        field_u[18] = "halloween_background_models/graves_south";
        field_w[4] = 2;
        field_w[15] = 2;
        field_u[3] = "halloween_background_models/area_wilderness_trees_treec3";
        field_u[6] = "halloween_background_models/area_wilderness_trees_treec6";
        field_w[14] = 2;
        field_u[7] = "halloween_background_models/clanwars_dead_tree1";
        field_w[20] = 2;
        field_u[26] = "halloween_background_models/wilderness_roots2";
        field_u[4] = "halloween_background_models/area_wilderness_trees_treec4";
        field_w[24] = 2;
        field_u[20] = "halloween_background_models/floor_dugupsoil2_0";
        field_u[10] = "halloween_background_models/clanwars_dead_tree4";
        field_w[1] = 2;
        field_w[10] = 2;
        field_w[25] = 2;
        field_u[15] = "halloween_background_models/plants_deadtree4";
        field_u[21] = "halloween_background_models/floor_dugupsoil3_0";
        field_w[26] = 2;
        field_u[19] = "halloween_background_models/floor_dugupsoil1_0";
        field_u[5] = "halloween_background_models/area_wilderness_trees_treec5";
        field_u[2] = "halloween_background_models/area_wilderness_trees_treec2";
        field_w[9] = 2;
        field_w[2] = 2;
        field_u[11] = "halloween_background_models/draynor_deadtree";
        field_u[23] = "halloween_background_models/floor_dugupsoil5_0";
        field_w[22] = 2;
        field_w[18] = 2;
        field_u[16] = "halloween_background_models/graves_north";
        field_w[8] = 2;
        field_w[17] = 2;
        field_w[7] = 2;
        field_w[13] = 2;
        field_w[27] = 2;
        field_w[11] = 2;
        field_u[1] = "halloween_background_models/area_wilderness_trees_treec1";
        field_u[12] = "halloween_background_models/hist_dead_tree";
        field_w[5] = 2;
        field_w[16] = 2;
        field_w[3] = 2;
        field_n = "Please remove <%0> from your ignore list first.";
        field_q = "Passwords must be between 5 and 20 letters and numbers";
        field_o = "Try changing the '<%0>' setting.";
        field_v = "Invite players";
    }
}
