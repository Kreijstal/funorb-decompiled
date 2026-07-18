/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        Object stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        Object stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param0;
            var3 = tf.a(-73, var5);
            if (var3 == null) {
              L1: {
                if (param0.equals((Object) (Object) ((uh) this).field_t)) {
                  break L1;
                } else {
                  int discarded$2 = 1;
                  var4 = sb.b(param0);
                  if (var4 != null) {
                    if (null == var4.field_e) {
                      ((uh) this).field_t = param0;
                      ((uh) this).field_s = var4.field_h;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((uh) this).field_s) {
                if (param1 == -9316) {
                  stackOut_16_0 = rl.field_c;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_14_0 = null;
                  stackIn_15_0 = stackOut_14_0;
                  return (String) (Object) stackIn_15_0;
                }
              } else {
                stackOut_11_0 = eg.field_g;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("uh.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    uh(qn param0) {
        super(param0);
        ((uh) this).field_s = false;
    }

    final static un i(int param0) {
        if (param0 != 23156) {
            return null;
        }
        if (!hl.field_h) {
            return oc.field_p;
        }
        return pd.field_Lb;
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        if (!((param1 & 7) == 0)) {
            var2 = 8 - (param1 & 7);
        }
        int var3 = var2 + param1;
        return var3;
    }

    final static void j() {
        if (!(ad.field_b)) {
            throw new IllegalStateException();
        }
        vh.field_e = true;
        vf.a(false, -128);
        rm.field_Q = 0;
    }

    final void h(int param0) {
        int var2 = -52 / ((param0 - -6) / 52);
        ((uh) this).field_t = null;
    }

    public static void k() {
        field_u = null;
        field_r = null;
        field_m = null;
        field_w = null;
        field_p = null;
        field_q = null;
        field_n = null;
        field_v = null;
        field_o = null;
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        aj var4 = null;
        CharSequence var5 = null;
        mk stackIn_3_0 = null;
        mk stackIn_10_0 = null;
        mk stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_2_0 = null;
        mk stackOut_9_0 = null;
        mk stackOut_14_0 = null;
        mk stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3_int = -38 / ((-49 - param0) / 62);
            var5 = (CharSequence) (Object) param1;
            int discarded$11 = -1;
            if (!eb.a(var5)) {
              stackOut_2_0 = qk.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((uh) this).field_t)) {
                  L2: {
                    int discarded$12 = 1;
                    var4 = sb.b(param1);
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (null == var4.field_e) {
                        ((uh) this).field_t = param1;
                        ((uh) this).field_s = var4.field_h;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_9_0 = ek.field_d;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (((uh) this).field_s) {
                  stackOut_14_0 = oa.field_a;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = qk.field_b;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("uh.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
