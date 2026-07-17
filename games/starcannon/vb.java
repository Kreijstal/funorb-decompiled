/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vb extends qf {
    static hl field_l;
    private fe field_n;
    static rk field_k;
    static int field_m;
    static String field_j;

    final String a(String param0, boolean param1) {
        he var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_15_0 = null;
        Object stackOut_20_0 = null;
        String stackOut_18_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (!(((vb) this).field_n instanceof ub)) {
                  break L1;
                } else {
                  var3 = ((ub) (Object) ((vb) this).field_n).a(false);
                  if (var3 == null) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.b((byte) 12) != bf.field_x) {
                        break L2;
                      } else {
                        if (!param0.equals((Object) (Object) ((vb) this).field_n.field_k)) {
                          stackOut_13_0 = qb.field_d;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_15_0 = var3.a(26162);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                }
              }
              if (param0.equals((Object) (Object) ((vb) this).field_n.field_k)) {
                stackOut_20_0 = null;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                stackOut_18_0 = qb.field_d;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("vb.A(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return (String) (Object) stackIn_21_0;
    }

    vb(fe param0, fe param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((vb) this).field_n = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vb.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static void a(ue param0) {
        byte[] var2 = null;
        int var3 = 0;
        L0: {
          var3 = StarCannon.field_A;
          ri.field_c = param0;
          int discarded$122 = -124;
          var2 = cb.a("gamename");
          if (null != var2) {
            wc.field_g = uh.a(121, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          int discarded$123 = -124;
          var2 = cb.a("achievement_names,0");
          if (null != var2) {
            di.field_j[0] = uh.a(127, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          int discarded$124 = -124;
          var2 = cb.a("achievement_names,1");
          if (var2 != null) {
            di.field_j[1] = uh.a(dg.a(30962, 30856), var2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          int discarded$125 = -124;
          var2 = cb.a("achievement_names,2");
          if (null != var2) {
            di.field_j[2] = uh.a(126, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          int discarded$126 = -124;
          var2 = cb.a("achievement_names,3");
          if (var2 == null) {
            break L4;
          } else {
            di.field_j[3] = uh.a(dg.a(30962, 30858), var2);
            break L4;
          }
        }
        L5: {
          int discarded$127 = -124;
          var2 = cb.a("achievement_names,4");
          if (var2 == null) {
            break L5;
          } else {
            di.field_j[4] = uh.a(120, var2);
            break L5;
          }
        }
        L6: {
          int discarded$128 = -124;
          var2 = cb.a("achievement_names,5");
          if (null == var2) {
            break L6;
          } else {
            di.field_j[5] = uh.a(115, var2);
            break L6;
          }
        }
        L7: {
          int discarded$129 = -124;
          var2 = cb.a("achievement_names,6");
          if (var2 == null) {
            break L7;
          } else {
            di.field_j[6] = uh.a(127, var2);
            break L7;
          }
        }
        L8: {
          int discarded$130 = -124;
          var2 = cb.a("achievement_names,7");
          if (var2 != null) {
            di.field_j[7] = uh.a(112, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          int discarded$131 = -124;
          var2 = cb.a("achievement_names,8");
          if (var2 != null) {
            di.field_j[8] = uh.a(113, var2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          int discarded$132 = -124;
          var2 = cb.a("achievement_names,9");
          if (var2 == null) {
            break L10;
          } else {
            di.field_j[9] = uh.a(121, var2);
            break L10;
          }
        }
        L11: {
          int discarded$133 = -124;
          var2 = cb.a("achievement_names,10");
          if (var2 == null) {
            break L11;
          } else {
            di.field_j[10] = uh.a(122, var2);
            break L11;
          }
        }
        L12: {
          int discarded$134 = -124;
          var2 = cb.a("achievement_names,11");
          if (var2 != null) {
            di.field_j[11] = uh.a(126, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          int discarded$135 = -124;
          var2 = cb.a("achievement_names,12");
          if (null != var2) {
            di.field_j[12] = uh.a(123, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          int discarded$136 = -124;
          var2 = cb.a("achievement_names,13");
          if (var2 != null) {
            di.field_j[13] = uh.a(120, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          int discarded$137 = -124;
          var2 = cb.a("achievement_names,14");
          if (var2 == null) {
            break L15;
          } else {
            di.field_j[14] = uh.a(120, var2);
            break L15;
          }
        }
        L16: {
          int discarded$138 = -124;
          var2 = cb.a("achievement_criteria,0");
          if (null == var2) {
            break L16;
          } else {
            vd.field_h[0] = uh.a(116, var2);
            break L16;
          }
        }
        L17: {
          int discarded$139 = -124;
          var2 = cb.a("achievement_criteria,1");
          if (null == var2) {
            break L17;
          } else {
            vd.field_h[1] = uh.a(dg.a(30962, 30850), var2);
            break L17;
          }
        }
        L18: {
          int discarded$140 = -124;
          var2 = cb.a("achievement_criteria,2");
          if (null == var2) {
            break L18;
          } else {
            vd.field_h[2] = uh.a(123, var2);
            break L18;
          }
        }
        L19: {
          int discarded$141 = -124;
          var2 = cb.a("achievement_criteria,3");
          if (var2 == null) {
            break L19;
          } else {
            vd.field_h[3] = uh.a(dg.a(30962, 30850), var2);
            break L19;
          }
        }
        L20: {
          int discarded$142 = -124;
          var2 = cb.a("achievement_criteria,4");
          if (var2 != null) {
            vd.field_h[4] = uh.a(120, var2);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          int discarded$143 = -124;
          var2 = cb.a("achievement_criteria,5");
          if (var2 != null) {
            vd.field_h[5] = uh.a(120, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          int discarded$144 = -124;
          var2 = cb.a("achievement_criteria,6");
          if (var2 == null) {
            break L22;
          } else {
            vd.field_h[6] = uh.a(119, var2);
            break L22;
          }
        }
        L23: {
          int discarded$145 = -124;
          var2 = cb.a("achievement_criteria,7");
          if (null == var2) {
            break L23;
          } else {
            vd.field_h[7] = uh.a(116, var2);
            break L23;
          }
        }
        L24: {
          int discarded$146 = -124;
          var2 = cb.a("achievement_criteria,8");
          if (var2 != null) {
            vd.field_h[8] = uh.a(117, var2);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          int discarded$147 = -124;
          var2 = cb.a("achievement_criteria,9");
          if (null != var2) {
            vd.field_h[9] = uh.a(127, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          int discarded$148 = -124;
          var2 = cb.a("achievement_criteria,10");
          if (var2 == null) {
            break L26;
          } else {
            vd.field_h[10] = uh.a(122, var2);
            break L26;
          }
        }
        L27: {
          int discarded$149 = -124;
          var2 = cb.a("achievement_criteria,11");
          if (null == var2) {
            break L27;
          } else {
            vd.field_h[11] = uh.a(120, var2);
            break L27;
          }
        }
        L28: {
          int discarded$150 = -124;
          var2 = cb.a("achievement_criteria,12");
          if (var2 != null) {
            vd.field_h[12] = uh.a(117, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          int discarded$151 = -124;
          var2 = cb.a("achievement_criteria,13");
          if (var2 == null) {
            break L29;
          } else {
            vd.field_h[13] = uh.a(123, var2);
            break L29;
          }
        }
        L30: {
          int discarded$152 = -124;
          var2 = cb.a("achievement_criteria,14");
          if (var2 != null) {
            vd.field_h[14] = uh.a(121, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          int discarded$153 = -124;
          var2 = cb.a("optionscaps");
          if (null == var2) {
            break L31;
          } else {
            String discarded$154 = uh.a(127, var2);
            break L31;
          }
        }
        L32: {
          int discarded$155 = -124;
          var2 = cb.a("bosshealthcaps");
          if (var2 != null) {
            s.field_h = uh.a(112, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          int discarded$156 = -124;
          var2 = cb.a("lev7a");
          if (var2 != null) {
            jg.field_I = uh.a(127, var2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          int discarded$157 = -124;
          var2 = cb.a("lev6c");
          if (var2 == null) {
            break L34;
          } else {
            eh.field_c = uh.a(117, var2);
            break L34;
          }
        }
        L35: {
          int discarded$158 = -124;
          var2 = cb.a("lev6b");
          if (var2 != null) {
            jf.field_b = uh.a(122, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          int discarded$159 = -124;
          var2 = cb.a("lev6a");
          if (var2 == null) {
            break L36;
          } else {
            d.field_n = uh.a(126, var2);
            break L36;
          }
        }
        L37: {
          int discarded$160 = -124;
          var2 = cb.a("lev5b");
          if (var2 == null) {
            break L37;
          } else {
            sb.field_o = uh.a(112, var2);
            break L37;
          }
        }
        L38: {
          int discarded$161 = -124;
          var2 = cb.a("lev5a");
          if (var2 != null) {
            bc.field_l = uh.a(126, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          int discarded$162 = -124;
          var2 = cb.a("lev4a");
          if (null != var2) {
            vf.field_a = uh.a(126, var2);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          int discarded$163 = -124;
          var2 = cb.a("lev3a");
          if (null == var2) {
            break L40;
          } else {
            qc.field_a = uh.a(121, var2);
            break L40;
          }
        }
        L41: {
          int discarded$164 = -124;
          var2 = cb.a("lev2a");
          if (null == var2) {
            break L41;
          } else {
            ig.field_c = uh.a(123, var2);
            break L41;
          }
        }
        L42: {
          int discarded$165 = -124;
          var2 = cb.a("lev1");
          if (null == var2) {
            break L42;
          } else {
            eg.field_i = uh.a(114, var2);
            break L42;
          }
        }
        L43: {
          int discarded$166 = -124;
          var2 = cb.a("spacetofire");
          if (null != var2) {
            String discarded$167 = uh.a(120, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          int discarded$168 = -124;
          var2 = cb.a("escforopts");
          if (null != var2) {
            String discarded$169 = uh.a(112, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          int discarded$170 = -124;
          var2 = cb.a("scorecapscolon");
          if (null == var2) {
            break L45;
          } else {
            rd.field_o = uh.a(112, var2);
            break L45;
          }
        }
        L46: {
          int discarded$171 = -124;
          var2 = cb.a("collecttopowerup");
          if (null == var2) {
            break L46;
          } else {
            p.field_e = uh.a(117, var2);
            break L46;
          }
        }
        L47: {
          int discarded$172 = -124;
          var2 = cb.a("lancepower");
          if (var2 == null) {
            break L47;
          } else {
            ve.field_g = uh.a(114, var2);
            break L47;
          }
        }
        L48: {
          int discarded$173 = -124;
          var2 = cb.a("helixpower");
          if (null == var2) {
            break L48;
          } else {
            b.field_d = uh.a(124, var2);
            break L48;
          }
        }
        L49: {
          int discarded$174 = -124;
          var2 = cb.a("pulsepower");
          if (null == var2) {
            break L49;
          } else {
            be.field_b = uh.a(119, var2);
            break L49;
          }
        }
        L50: {
          int discarded$175 = -124;
          var2 = cb.a("livescapscolon");
          if (var2 != null) {
            vk.field_w = uh.a(120, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          int discarded$176 = -124;
          var2 = cb.a("atgcaps");
          if (null != var2) {
            String discarded$177 = uh.a(115, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          int discarded$178 = -124;
          var2 = cb.a("levhard");
          if (null != var2) {
            hg.field_D = uh.a(127, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          int discarded$179 = -124;
          var2 = cb.a("levmedium");
          if (var2 != null) {
            fl.field_g = uh.a(120, var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          int discarded$180 = -124;
          var2 = cb.a("leveasy");
          if (null != var2) {
            cf.field_k = uh.a(115, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          int discarded$181 = -124;
          var2 = cb.a("fsoff");
          if (var2 == null) {
            break L55;
          } else {
            String discarded$182 = uh.a(126, var2);
            break L55;
          }
        }
        L56: {
          int discarded$183 = -124;
          var2 = cb.a("fson");
          if (var2 == null) {
            break L56;
          } else {
            String discarded$184 = uh.a(114, var2);
            break L56;
          }
        }
        L57: {
          int discarded$185 = -124;
          var2 = cb.a("gfxhigh");
          if (null != var2) {
            gh.field_A = uh.a(120, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          int discarded$186 = -124;
          var2 = cb.a("gfxmed");
          if (var2 != null) {
            fd.field_d = uh.a(112, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          int discarded$187 = -124;
          var2 = cb.a("gfxlow");
          if (var2 != null) {
            ec.field_d = uh.a(121, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          int discarded$188 = -124;
          var2 = cb.a("maxpowtext");
          if (var2 != null) {
            ab.field_B = uh.a(117, var2);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          int discarded$189 = -124;
          var2 = cb.a("sideguntext");
          if (null == var2) {
            break L61;
          } else {
            ra.field_y = uh.a(124, var2);
            break L61;
          }
        }
        L62: {
          int discarded$190 = -124;
          var2 = cb.a("backguntext");
          if (null != var2) {
            oi.field_i = uh.a(119, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          int discarded$191 = -124;
          var2 = cb.a("shieldtext");
          if (null != var2) {
            t.field_x = uh.a(113, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          int discarded$192 = -124;
          var2 = cb.a("enginetext");
          if (var2 != null) {
            hb.field_g = uh.a(126, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          int discarded$193 = -124;
          var2 = cb.a("powerup2of2");
          if (var2 != null) {
            di.field_k = uh.a(120, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          int discarded$194 = -124;
          var2 = cb.a("collecttext");
          if (var2 != null) {
            la.field_a = uh.a(117, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          int discarded$195 = -124;
          var2 = cb.a("lifetext");
          if (null != var2) {
            a.field_c = uh.a(126, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          int discarded$196 = -124;
          var2 = cb.a("lancetext");
          if (var2 != null) {
            mg.field_k = uh.a(118, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          int discarded$197 = -124;
          var2 = cb.a("helixtext");
          if (null != var2) {
            mc.field_i = uh.a(120, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          int discarded$198 = -124;
          var2 = cb.a("pulsetext");
          if (var2 != null) {
            gf.field_e = uh.a(123, var2);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          int discarded$199 = -124;
          var2 = cb.a("powerup1of2");
          if (null != var2) {
            vc.field_k = uh.a(127, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          int discarded$200 = -124;
          var2 = cb.a("con7");
          if (null != var2) {
            eb.field_e = uh.a(127, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          int discarded$201 = -124;
          var2 = cb.a("con6");
          if (var2 != null) {
            p.field_b = uh.a(114, var2);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          int discarded$202 = -124;
          var2 = cb.a("con5");
          if (var2 != null) {
            cc.field_k = uh.a(119, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          int discarded$203 = -124;
          var2 = cb.a("con4");
          if (null == var2) {
            break L75;
          } else {
            qd.field_y = uh.a(119, var2);
            break L75;
          }
        }
        L76: {
          int discarded$204 = -124;
          var2 = cb.a("con3");
          if (null == var2) {
            break L76;
          } else {
            ac.field_c = uh.a(120, var2);
            break L76;
          }
        }
        L77: {
          int discarded$205 = -124;
          var2 = cb.a("con2");
          if (null == var2) {
            break L77;
          } else {
            fi.field_a = uh.a(112, var2);
            break L77;
          }
        }
        L78: {
          int discarded$206 = -124;
          var2 = cb.a("con1");
          if (null == var2) {
            break L78;
          } else {
            s.field_a = uh.a(122, var2);
            break L78;
          }
        }
        L79: {
          int discarded$207 = -124;
          var2 = cb.a("controlcaps");
          if (null == var2) {
            break L79;
          } else {
            tc.field_y = uh.a(126, var2);
            break L79;
          }
        }
        L80: {
          int discarded$208 = -124;
          var2 = cb.a("storytext");
          if (var2 == null) {
            break L80;
          } else {
            ff.field_p = uh.a(123, var2);
            break L80;
          }
        }
        L81: {
          int discarded$209 = -124;
          var2 = cb.a("storycaps");
          if (null == var2) {
            break L81;
          } else {
            sb.field_p = uh.a(117, var2);
            break L81;
          }
        }
        L82: {
          int discarded$210 = -124;
          var2 = cb.a("nextcaps");
          if (null == var2) {
            break L82;
          } else {
            String discarded$211 = uh.a(127, var2);
            break L82;
          }
        }
        L83: {
          int discarded$212 = -124;
          var2 = cb.a("prevcaps");
          if (null != var2) {
            String discarded$213 = uh.a(119, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          int discarded$214 = -124;
          var2 = cb.a("pageno");
          if (null != var2) {
            ui.field_t = uh.a(120, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          int discarded$215 = -124;
          var2 = cb.a("instrcaps");
          if (null != var2) {
            String discarded$216 = uh.a(114, var2);
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          int discarded$217 = -124;
          var2 = cb.a("hsunavail");
          if (null == var2) {
            break L86;
          } else {
            String discarded$218 = uh.a(115, var2);
            break L86;
          }
        }
        L87: {
          int discarded$219 = -124;
          var2 = cb.a("waitforhs");
          if (null == var2) {
            break L87;
          } else {
            String discarded$220 = uh.a(127, var2);
            break L87;
          }
        }
        L88: {
          int discarded$221 = -124;
          var2 = cb.a("hardcaps");
          if (var2 == null) {
            break L88;
          } else {
            td.field_j = uh.a(118, var2);
            break L88;
          }
        }
        L89: {
          int discarded$222 = -124;
          var2 = cb.a("mediumcaps");
          if (var2 == null) {
            break L89;
          } else {
            lb.field_l = uh.a(116, var2);
            break L89;
          }
        }
        L90: {
          int discarded$223 = -124;
          var2 = cb.a("easycaps");
          if (null != var2) {
            ta.field_a = uh.a(124, var2);
            break L90;
          } else {
            break L90;
          }
        }
        L91: {
          int discarded$224 = -124;
          var2 = cb.a("lastscorestring");
          if (null == var2) {
            break L91;
          } else {
            String discarded$225 = uh.a(120, var2);
            break L91;
          }
        }
        L92: {
          int discarded$226 = -124;
          var2 = cb.a("logincaps");
          if (null != var2) {
            String discarded$227 = uh.a(122, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          int discarded$228 = -124;
          var2 = cb.a("highscorescaps");
          if (null == var2) {
            break L93;
          } else {
            String discarded$229 = uh.a(113, var2);
            break L93;
          }
        }
        L94: {
          int discarded$230 = -124;
          var2 = cb.a("menucaps");
          if (null == var2) {
            break L94;
          } else {
            String discarded$231 = uh.a(123, var2);
            break L94;
          }
        }
        L95: {
          int discarded$232 = -124;
          var2 = cb.a("hiddenachievement");
          if (null != var2) {
            String discarded$233 = uh.a(127, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          int discarded$234 = -124;
          var2 = cb.a("achievementscaps");
          if (var2 != null) {
            String discarded$235 = uh.a(112, var2);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          int discarded$236 = -124;
          var2 = cb.a("mainmenucaps");
          if (null != var2) {
            String discarded$237 = uh.a(120, var2);
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          int discarded$238 = -124;
          var2 = cb.a("warninghardmode");
          if (var2 == null) {
            break L98;
          } else {
            String discarded$239 = uh.a(126, var2);
            break L98;
          }
        }
        L99: {
          int discarded$240 = -124;
          var2 = cb.a("gameover");
          if (var2 != null) {
            ne.field_i = uh.a(127, var2);
            break L99;
          } else {
            break L99;
          }
        }
        int discarded$241 = -124;
        var2 = cb.a("benefits,0");
        L100: {
          if (null != var2) {
            rj.field_l[0] = uh.a(114, var2);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          int discarded$242 = -124;
          var2 = cb.a("benefits,1");
          if (null != var2) {
            rj.field_l[1] = uh.a(121, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          int discarded$243 = -124;
          var2 = cb.a("benefits,2");
          if (null == var2) {
            break L102;
          } else {
            rj.field_l[2] = uh.a(125, var2);
            break L102;
          }
        }
        ri.field_c = null;
        L103: {
          if (!th.field_i) {
            break L103;
          } else {
            var3++;
            StarCannon.field_A = var3;
            break L103;
          }
        }
    }

    public static void e(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_k = null;
              if (param0 >= 108) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "vb.M(" + param0 + 41);
        }
    }

    final p a(String param0, int param1) {
        RuntimeException var3 = null;
        he var3_ref = null;
        p stackIn_8_0 = null;
        p stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        p stackOut_7_0 = null;
        p stackOut_15_0 = null;
        p stackOut_13_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (((vb) this).field_n instanceof ub) {
                var3_ref = ((ub) (Object) ((vb) this).field_n).a(false);
                if (var3_ref == null) {
                  break L1;
                } else {
                  if (var3_ref.b((byte) -8) == bf.field_x) {
                    break L1;
                  } else {
                    stackOut_7_0 = sb.field_n;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -26188) {
                break L2;
              } else {
                vb.e((byte) 95);
                break L2;
              }
            }
            L3: {
              if (!param0.equals((Object) (Object) ((vb) this).field_n.field_k)) {
                stackOut_15_0 = sb.field_n;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_13_0 = bf.field_x;
                stackIn_16_0 = stackOut_13_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("vb.B(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new rk();
        field_j = "Prev";
    }
}
