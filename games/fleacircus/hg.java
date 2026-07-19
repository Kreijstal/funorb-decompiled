/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends lh {
    int field_j;
    static String field_l;
    static String field_o;
    int field_m;
    static ob field_i;
    static int[] field_q;
    static sf field_n;
    static sf field_k;
    static String[] field_p;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= param0.length()) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2_int ^ -1;
                    stackIn_9_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == (param0.charAt(var3) ^ -1)) {
                        var3++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("hg.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static void a(int param0) {
        int fieldTemp$2 = 0;
        lh discarded$3 = null;
        vh.field_o = vh.field_o ^ ni.field_j;
        pg.field_d = pg.field_d ^ ni.field_j;
        if (null != pb.field_f.c((byte) 47)) {
          fieldTemp$2 = hi.field_q + 1;
          hi.field_q = hi.field_q + 1;
          if ((fieldTemp$2 ^ -1) == -336) {
            hi.field_q = 0;
            discarded$3 = pb.field_f.e(-22033);
            if (param0 > -74) {
              hg.a(15);
              dh.field_d = dh.field_d - ag.field_f;
              se.field_b = se.field_b + ag.field_f;
              return;
            } else {
              dh.field_d = dh.field_d - ag.field_f;
              se.field_b = se.field_b + ag.field_f;
              return;
            }
          } else {
            if (param0 > -74) {
              hg.a(15);
              dh.field_d = dh.field_d - ag.field_f;
              se.field_b = se.field_b + ag.field_f;
              return;
            } else {
              dh.field_d = dh.field_d - ag.field_f;
              se.field_b = se.field_b + ag.field_f;
              return;
            }
          }
        } else {
          if (param0 > -74) {
            hg.a(15);
            dh.field_d = dh.field_d - ag.field_f;
            se.field_b = se.field_b + ag.field_f;
            return;
          } else {
            dh.field_d = dh.field_d - ag.field_f;
            se.field_b = se.field_b + ag.field_f;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_p = null;
        field_k = null;
        field_l = null;
        field_o = null;
        if (param0 < 104) {
          field_n = (sf) null;
          field_q = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_n = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 1 << param1;
        if (param0 != -25389) {
            hg.a(72, -8, -103, 2);
            if (!(0 == (kh.field_b & var4))) {
                return;
            }
            fleas.field_L = fleas.field_L | var4;
            kh.field_b = kh.field_b | var4;
            pb.field_f.a(false, new kb(param1));
            a.field_e.a(false, new hi(param1, param2, lj.field_h, se.field_b, dh.field_d, e.field_b));
            return;
        }
        if (!(0 == (kh.field_b & var4))) {
            return;
        }
        fleas.field_L = fleas.field_L | var4;
        kh.field_b = kh.field_b | var4;
        pb.field_f.a(false, new kb(param1));
        a.field_e.a(false, new hi(param1, param2, lj.field_h, se.field_b, dh.field_d, e.field_b));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        kh.field_g = param4;
        if (param0 != 0) {
          hg.a(127);
          hb.field_t = param1;
          cm.field_f = param3;
          ta.field_y = param2;
          return;
        } else {
          hb.field_t = param1;
          cm.field_f = param3;
          ta.field_y = param2;
          return;
        }
    }

    private hg() throws Throwable {
        throw new Error();
    }

    static {
        field_l = "Menu";
        field_o = "Start level";
        field_i = new ob();
        field_p = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
