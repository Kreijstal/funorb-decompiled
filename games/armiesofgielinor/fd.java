/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends tc {
    int field_k;
    static kl field_m;
    static String field_o;
    static String field_l;
    wp field_p;
    static String[][] field_n;

    final static int a(boolean param0, int param1) {
        int discarded$1 = 0;
        int var2 = 0;
        var2 = param1 >>> -1846380831;
        var2 = var2 | var2 >>> -1059359743;
        var2 = var2 | var2 >>> -294303678;
        if (!param0) {
          discarded$1 = fd.a(true, 15);
          var2 = var2 | var2 >>> -412502876;
          var2 = var2 | var2 >>> -1676140568;
          var2 = var2 | var2 >>> 1799204304;
          return param1 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> -412502876;
          var2 = var2 | var2 >>> -1676140568;
          var2 = var2 | var2 >>> 1799204304;
          return param1 & (var2 ^ -1);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        if (param0 != -30097) {
          field_n = (String[][]) null;
          field_n = (String[][]) null;
          field_l = null;
          return;
        } else {
          field_n = (String[][]) null;
          field_l = null;
          return;
        }
    }

    fd(kl param0, kl param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            this.field_k = param2;
            this.field_p = new wp(param2);
            tl.a((byte) -121, param1, param0);
            L1: while (true) {
              if (this.field_p.f((byte) -65)) {
                break L0;
              } else {
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("fd.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Potions";
        field_l = "Show game chat from my friends";
        field_n = new String[][]{new String[]{"b", "b", "a", "b", " ", "a b c", "b", "a", "jeer_f"}, new String[]{"a", "a", "a", " ", "a", "a", "a", "a", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"z", "z", "z", " ", "z", "z", "z", "z", " "}, new String[]{"c", "c", "a", "b", "b", "b", "c", "c", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", " ", "a", "a", "a", "a", "a", " "}, new String[]{"a", "a", "e", "i", "sacrifice_a", "a", "a", "a", "special_f"}, new String[]{"a", "a", "a", "a", " ", "e", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "i", "bury_a", "a b c", "b", "a", "special_f"}, new String[]{"e", "c", "a", "i", "b", "a b c", "b", "a", " "}, new String[]{"f", "a", "b", "d", " ", "e", "b", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", " ", "a", "a", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "c", "a", "j", "a", "a", "b", "a", " "}, new String[]{"a", "a", "a", "i", "sacrifice_a", "a b c", "b", "a", "special_f"}, new String[]{"c", "c", "b", " ", "b", "c", "c", "c", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "i", "b", "a b c", "b", "a", "special_f"}, new String[]{"a", "a", "a", "i", "b", "a b c", "b", "a", " "}, new String[]{"f", "a", "b", "d", " ", "e", "b", "a", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "j", "a", "a b c", "b", "a", " "}, new String[]{"a", "d", "e", "d", " ", "a", "c", "b", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a b", "a", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "f", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "i", "b", "a b c", "b", "a", "special_f"}, new String[]{"a", "a", "a", "b", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "b", "a", " ", "a", "a", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "i", "b", "a b c", "b", "a", " "}, new String[]{"a", "a", " ", "a", "a", "a", "a", "a", " "}, new String[]{"a", "a", "a", " ", "a", " ", "a", "a", " "}, new String[]{"a", "growth_a", "recede_a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", " ", "a b", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"b", "a", "a", "bear_new_attack", " ", "a", "a", "bear_new_death", " "}, new String[]{"ranged_c", "a", " ", " ", "c", " ", " ", "a", " "}, new String[]{"a", "a", "a", "j", " ", "a", "a", "a", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "f", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "c", " ", "e", "b", "a", " "}, new String[]{"a", "a", "a", "j", "a", "e", "b", "a", " "}, new String[]{"a", "a", "a", "c", " ", "e", "b", "a", " "}, new String[]{"a", "a", "a", "i", " ", "a", "b", "a", " "}, new String[]{"idle_a", "teleport_in", "teleport_out", "a", " ", " ", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "b", " ", "a", "a", "a", " "}, new String[]{"b", "a", "a", "a", " ", "a", "b", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"b", "a", "a", "a", " ", "a", "b", "a", " "}, new String[]{"a", "a", " ", "b", " ", "a", "b", "a", " "}, new String[]{"c", "a", "a", "a", " ", " ", "a", "a", " "}, new String[]{"b", "a", "a", "a", " ", "a", "b", "a", " "}, new String[]{"b", "b", " ", "b", " ", "b", "b", "b", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "c", "b", "c", " ", "a", "b", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "g", " ", "a b c", "b", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a b c", "b", "a", " "}, new String[]{"c", "a", "d", "h", " ", "a b c", "b", "a", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "a", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", " ", "a", " ", "a", "a", "a", " "}, new String[]{"a", "a", "e", "i", " ", "a b c", " ", "b", " "}, new String[]{"c", "c", "a", "b", "b", "b", "c", "c", " "}, new String[]{"a", "build_a", "break_a", " ", "a", " ", "ready_a", "break_a", " "}, new String[]{"portal", "portal", "portal", "portal", "portal_grow", "portal", "portal", "portal_shrink", " "}, new String[]{"a", "a", "a", "j", " ", "a", "b", "a", " "}, new String[]{"a", "c", "a", "j", "a", "a", "b", "a", " "}, new String[]{"a", "a", "a", "j", "a", "a b c", "b", "a", " "}, new String[]{"a", "a", "a", "j", "a", "e", "b", "a", " "}, new String[]{"c", "c", "a", "b", "b", "b", "c", "c", " "}, new String[]{"ahrim_ready", "ahrim_walk", "ahrim_run", "ahrim_attack", "ahrim_ranged", "ahrim_jeer", "ahrim_defend", "ahrim_death", ""}, new String[]{"dharok_ready", "dharok_walk", "dharok_run", "dharok_attack_a", "", "dharok_jeer", "dharok_defend", "dharok_death", ""}, new String[]{"guthan_ready", "guthan_walk", "guthan_run", "guthan_attack_a", "", "guthan_jeer", "guthan_defend", "guthan_death", ""}, new String[]{"karil_ready", "karil_walk", "karil_run", "karil_attack", "karil_ranged", "karil_jeer", "karil_defend", "karil_death", ""}, new String[]{"torag_ready", "torag_walk", "torag_run", "torag_attack", "", "torag_jeer", "torag_defend", "torag_death", ""}, new String[]{"verac_ready", "verac_walk", "verac_run", "verac_attack", "", "verac_jeer", "verac_defend", "verac_death", ""}, new String[]{"zemo_zemouregal_ready", "zemo_zemouregal_walk", "zemo_zemouregal_walk", "zemo_zemouregal_attack", "", "zemo_zemouregal_jeer", "zemo_zemouregal_defend", "zemo_zemouregal_death", ""}, new String[]{"karil_ready", "karil_walk", "karil_run", "karil_attack", "karil_ranged", "karil_jeer", "karil_defend", "karil_death", ""}};
    }
}
