/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kc extends ma {
    static int[] field_s;
    static int field_n;
    private boolean field_o;
    static int[][] field_w;
    static int field_v;
    static int field_u;
    private gf field_r;
    static int[] field_m;
    static String field_t;
    static int[] field_p;
    private String field_q;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              var3 = je.a(param0, 0);
              if (-1 != param2.indexOf(param0)) {
                break L1;
              } else {
                if (param2.indexOf(var3) != -1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var4 = 28 % ((param1 - -1) / 49);
                      if (param2.startsWith(param0)) {
                        break L3;
                      } else {
                        if (param2.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param2.endsWith(param0)) {
                            break L3;
                          } else {
                            if (!param2.endsWith(var3)) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_18_0 = 1;
                    stackIn_21_0 = stackOut_18_0;
                    break L2;
                  }
                  break L0;
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("kc.B(");
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
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          L5: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void a(lj param0, int param1) {
        byte[] var2 = null;
        int var3 = 0;
        int stackIn_461_0 = 0;
        int stackOut_460_0 = 0;
        int stackOut_459_0 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          dj.field_cb = param0;
          var2 = vf.a(95, "gamename");
          if (null == var2) {
            break L0;
          } else {
            dl.field_E = re.a(18990, var2);
            break L0;
          }
        }
        L1: {
          var2 = vf.a(95, "achievement_names,0");
          if (null != var2) {
            wb.field_n[0] = re.a(param1 + 18990, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = vf.a(95, "achievement_names,1");
          if (null == var2) {
            break L2;
          } else {
            wb.field_n[1] = re.a(18990, var2);
            break L2;
          }
        }
        L3: {
          var2 = vf.a(95, "achievement_names,2");
          if (null != var2) {
            wb.field_n[2] = re.a(18990, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = vf.a(95, "achievement_names,3");
          if (var2 != null) {
            wb.field_n[3] = re.a(18990, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = vf.a(95, "achievement_names,4");
          if (var2 == null) {
            break L5;
          } else {
            wb.field_n[4] = re.a(18990, var2);
            break L5;
          }
        }
        L6: {
          var2 = vf.a(95, "achievement_names,5");
          if (null == var2) {
            break L6;
          } else {
            wb.field_n[5] = re.a(18990, var2);
            break L6;
          }
        }
        L7: {
          var2 = vf.a(95, "achievement_names,6");
          if (var2 == null) {
            break L7;
          } else {
            wb.field_n[6] = re.a(18990, var2);
            break L7;
          }
        }
        L8: {
          var2 = vf.a(95, "achievement_names,7");
          if (var2 != null) {
            wb.field_n[7] = re.a(18990, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = vf.a(95, "achievement_names,8");
          if (var2 == null) {
            break L9;
          } else {
            wb.field_n[8] = re.a(18990, var2);
            break L9;
          }
        }
        L10: {
          var2 = vf.a(95, "achievement_names,9");
          if (null != var2) {
            wb.field_n[9] = re.a(18990, var2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = vf.a(95, "achievement_names,10");
          if (var2 == null) {
            break L11;
          } else {
            wb.field_n[10] = re.a(18990, var2);
            break L11;
          }
        }
        L12: {
          var2 = vf.a(95, "achievement_names,11");
          if (var2 != null) {
            wb.field_n[11] = re.a(18990, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = vf.a(95, "achievement_names,12");
          if (null != var2) {
            wb.field_n[12] = re.a(18990, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = vf.a(95, "achievement_names,13");
          if (var2 == null) {
            break L14;
          } else {
            wb.field_n[13] = re.a(18990, var2);
            break L14;
          }
        }
        L15: {
          var2 = vf.a(95, "achievement_names,14");
          if (var2 == null) {
            break L15;
          } else {
            wb.field_n[14] = re.a(18990, var2);
            break L15;
          }
        }
        L16: {
          var2 = vf.a(95, "achievement_names,15");
          if (null != var2) {
            wb.field_n[15] = re.a(18990, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = vf.a(95, "achievement_names,16");
          if (null == var2) {
            break L17;
          } else {
            wb.field_n[16] = re.a(18990, var2);
            break L17;
          }
        }
        L18: {
          var2 = vf.a(95, "achievement_criteria,0");
          if (var2 != null) {
            jc.field_j[0] = re.a(18990, var2);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          var2 = vf.a(95, "achievement_criteria,1");
          if (null == var2) {
            break L19;
          } else {
            jc.field_j[1] = re.a(18990, var2);
            break L19;
          }
        }
        L20: {
          var2 = vf.a(95, "achievement_criteria,2");
          if (null == var2) {
            break L20;
          } else {
            jc.field_j[2] = re.a(18990, var2);
            break L20;
          }
        }
        L21: {
          var2 = vf.a(95, "achievement_criteria,3");
          if (null != var2) {
            jc.field_j[3] = re.a(18990, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = vf.a(95, "achievement_criteria,4");
          if (var2 == null) {
            break L22;
          } else {
            jc.field_j[4] = re.a(18990, var2);
            break L22;
          }
        }
        L23: {
          var2 = vf.a(95, "achievement_criteria,5");
          if (var2 != null) {
            jc.field_j[5] = re.a(TorChallenge.a(param1, 18990), var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = vf.a(95, "achievement_criteria,6");
          if (var2 == null) {
            break L24;
          } else {
            jc.field_j[6] = re.a(18990, var2);
            break L24;
          }
        }
        L25: {
          var2 = vf.a(95, "achievement_criteria,7");
          if (null == var2) {
            break L25;
          } else {
            jc.field_j[7] = re.a(18990, var2);
            break L25;
          }
        }
        L26: {
          var2 = vf.a(95, "achievement_criteria,8");
          if (null != var2) {
            jc.field_j[8] = re.a(param1 + 18990, var2);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          var2 = vf.a(95, "achievement_criteria,9");
          if (null == var2) {
            break L27;
          } else {
            jc.field_j[9] = re.a(18990, var2);
            break L27;
          }
        }
        L28: {
          var2 = vf.a(95, "achievement_criteria,10");
          if (null == var2) {
            break L28;
          } else {
            jc.field_j[10] = re.a(18990, var2);
            break L28;
          }
        }
        L29: {
          var2 = vf.a(95, "achievement_criteria,11");
          if (var2 == null) {
            break L29;
          } else {
            jc.field_j[11] = re.a(18990, var2);
            break L29;
          }
        }
        L30: {
          var2 = vf.a(95, "achievement_criteria,12");
          if (var2 == null) {
            break L30;
          } else {
            jc.field_j[12] = re.a(18990, var2);
            break L30;
          }
        }
        L31: {
          var2 = vf.a(95, "achievement_criteria,13");
          if (var2 != null) {
            jc.field_j[13] = re.a(18990, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = vf.a(95, "achievement_criteria,14");
          if (var2 != null) {
            jc.field_j[14] = re.a(18990, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = vf.a(95, "achievement_criteria,15");
          if (null == var2) {
            break L33;
          } else {
            jc.field_j[15] = re.a(TorChallenge.a(param1, 18990), var2);
            break L33;
          }
        }
        L34: {
          var2 = vf.a(95, "achievement_criteria,16");
          if (var2 == null) {
            break L34;
          } else {
            jc.field_j[16] = re.a(18990, var2);
            break L34;
          }
        }
        L35: {
          var2 = vf.a(95, "score_colon_space");
          if (var2 != null) {
            oi.field_h = re.a(18990, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = vf.a(95, "time_colon_space");
          if (var2 != null) {
            w.field_j = re.a(18990, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = vf.a(95, "cross");
          if (null == var2) {
            break L37;
          } else {
            vj.field_b = re.a(18990, var2);
            break L37;
          }
        }
        L38: {
          var2 = vf.a(95, "instructions_pages,0");
          if (var2 == null) {
            break L38;
          } else {
            ol.field_b[0] = re.a(18990, var2);
            break L38;
          }
        }
        L39: {
          var2 = vf.a(95, "instructions_pages,1");
          if (var2 != null) {
            ol.field_b[1] = re.a(18990, var2);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = vf.a(95, "instructions_pages,4");
          if (var2 == null) {
            break L40;
          } else {
            ol.field_b[4] = re.a(18990, var2);
            break L40;
          }
        }
        L41: {
          var2 = vf.a(95, "instructions_pages,6");
          if (var2 != null) {
            ol.field_b[6] = re.a(param1 + 18990, var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = vf.a(95, "instructions_pages,7");
          if (null == var2) {
            break L42;
          } else {
            ol.field_b[7] = re.a(TorChallenge.a(param1, 18990), var2);
            break L42;
          }
        }
        L43: {
          var2 = vf.a(95, "instructions_pages,8");
          if (null == var2) {
            break L43;
          } else {
            ol.field_b[8] = re.a(18990, var2);
            break L43;
          }
        }
        L44: {
          var2 = vf.a(95, "instructions_pages,9");
          if (null != var2) {
            ol.field_b[9] = re.a(18990, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = vf.a(95, "instructions_titles,0");
          if (var2 == null) {
            break L45;
          } else {
            oe.field_j[0] = re.a(18990, var2);
            break L45;
          }
        }
        L46: {
          var2 = vf.a(95, "instructions_titles,1");
          if (var2 == null) {
            break L46;
          } else {
            oe.field_j[1] = re.a(18990, var2);
            break L46;
          }
        }
        L47: {
          var2 = vf.a(95, "instructions_titles,2");
          if (null != var2) {
            oe.field_j[2] = re.a(TorChallenge.a(param1, 18990), var2);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          var2 = vf.a(95, "instructions_titles,3");
          if (var2 == null) {
            break L48;
          } else {
            oe.field_j[3] = re.a(18990, var2);
            break L48;
          }
        }
        L49: {
          var2 = vf.a(95, "instructions_titles,4");
          if (var2 == null) {
            break L49;
          } else {
            oe.field_j[4] = re.a(18990, var2);
            break L49;
          }
        }
        L50: {
          var2 = vf.a(95, "instructions_titles,5");
          if (null == var2) {
            break L50;
          } else {
            oe.field_j[5] = re.a(param1 + 18990, var2);
            break L50;
          }
        }
        L51: {
          var2 = vf.a(95, "instructions_titles,6");
          if (var2 != null) {
            oe.field_j[6] = re.a(18990, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = vf.a(95, "instructions_titles,7");
          if (var2 == null) {
            break L52;
          } else {
            oe.field_j[7] = re.a(18990, var2);
            break L52;
          }
        }
        L53: {
          var2 = vf.a(95, "instructions_titles,8");
          if (null == var2) {
            break L53;
          } else {
            oe.field_j[8] = re.a(18990, var2);
            break L53;
          }
        }
        L54: {
          var2 = vf.a(95, "instructions_titles,9");
          if (var2 != null) {
            oe.field_j[9] = re.a(18990, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = vf.a(95, "example_help_text");
          if (null == var2) {
            break L55;
          } else {
            kl.field_f = re.a(param1 + 18990, var2);
            break L55;
          }
        }
        L56: {
          var2 = vf.a(95, "seal");
          if (null == var2) {
            break L56;
          } else {
            gh.field_y = re.a(18990, var2);
            break L56;
          }
        }
        L57: {
          var2 = vf.a(95, "basic_controls,0,0");
          if (var2 == null) {
            break L57;
          } else {
            jf.field_ob[0][0] = re.a(18990, var2);
            break L57;
          }
        }
        L58: {
          var2 = vf.a(95, "basic_controls,1,0");
          if (null == var2) {
            break L58;
          } else {
            jf.field_ob[1][0] = re.a(18990, var2);
            break L58;
          }
        }
        L59: {
          var2 = vf.a(95, "basic_controls,2,0");
          if (null != var2) {
            jf.field_ob[2][0] = re.a(18990, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          var2 = vf.a(95, "basic_controls,3,0");
          if (var2 != null) {
            jf.field_ob[3][0] = re.a(TorChallenge.a(param1, 18990), var2);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          var2 = vf.a(95, "basic_controls,3,1");
          if (var2 == null) {
            break L61;
          } else {
            jf.field_ob[3][1] = re.a(18990, var2);
            break L61;
          }
        }
        L62: {
          var2 = vf.a(95, "BACK");
          if (null == var2) {
            break L62;
          } else {
            rc.field_q = re.a(18990, var2);
            break L62;
          }
        }
        L63: {
          var2 = vf.a(95, "HELP_POSTS_ON");
          if (null != var2) {
            gh.field_i = re.a(18990, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = vf.a(95, "HELP_POSTS_OFF");
          if (var2 == null) {
            break L64;
          } else {
            o.field_n = re.a(18990, var2);
            break L64;
          }
        }
        L65: {
          var2 = vf.a(95, "benefits,0");
          if (var2 == null) {
            break L65;
          } else {
            il.field_p[0] = re.a(18990, var2);
            break L65;
          }
        }
        L66: {
          var2 = vf.a(95, "benefits,1");
          if (var2 == null) {
            break L66;
          } else {
            il.field_p[1] = re.a(param1 + 18990, var2);
            break L66;
          }
        }
        L67: {
          var2 = vf.a(95, "benefits,2");
          if (null != var2) {
            il.field_p[2] = re.a(param1 + 18990, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = vf.a(95, "MONK_NAMES,0");
          if (null != var2) {
            me.field_a[0] = re.a(18990, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = vf.a(95, "MONK_NAMES,1");
          if (null != var2) {
            me.field_a[1] = re.a(18990, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = vf.a(95, "MONK_NAMES,2");
          if (null == var2) {
            break L70;
          } else {
            me.field_a[2] = re.a(18990, var2);
            break L70;
          }
        }
        L71: {
          var2 = vf.a(95, "MASTER_MONK_NAMES,0");
          if (var2 != null) {
            li.field_J[0] = re.a(18990, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = vf.a(95, "MASTER_MONK_NAMES,1");
          if (null != var2) {
            li.field_J[1] = re.a(18990, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = vf.a(95, "MASTER_MONK_NAMES,2");
          if (null == var2) {
            break L73;
          } else {
            li.field_J[2] = re.a(18990, var2);
            break L73;
          }
        }
        L74: {
          var2 = vf.a(95, "UNIT_NAMES,0");
          if (var2 != null) {
            i.field_p[0] = re.a(18990, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = vf.a(95, "UNIT_NAMES,1");
          if (var2 == null) {
            break L75;
          } else {
            i.field_p[1] = re.a(18990, var2);
            break L75;
          }
        }
        L76: {
          var2 = vf.a(95, "UNIT_NAMES,2");
          if (null != var2) {
            i.field_p[2] = re.a(18990, var2);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = vf.a(95, "UNIT_NAMES,3");
          if (null == var2) {
            break L77;
          } else {
            i.field_p[3] = re.a(param1 + 18990, var2);
            break L77;
          }
        }
        L78: {
          var2 = vf.a(95, "UNIT_NAMES,4");
          if (null == var2) {
            break L78;
          } else {
            i.field_p[4] = re.a(18990, var2);
            break L78;
          }
        }
        L79: {
          var2 = vf.a(95, "UNIT_NAMES,5");
          if (var2 == null) {
            break L79;
          } else {
            i.field_p[5] = re.a(param1 + 18990, var2);
            break L79;
          }
        }
        L80: {
          var2 = vf.a(95, "COIN_NAMES,0");
          if (var2 == null) {
            break L80;
          } else {
            k.field_a[0] = re.a(18990, var2);
            break L80;
          }
        }
        L81: {
          var2 = vf.a(95, "COIN_NAMES,1");
          if (var2 == null) {
            break L81;
          } else {
            k.field_a[1] = re.a(param1 + 18990, var2);
            break L81;
          }
        }
        L82: {
          var2 = vf.a(95, "COIN_NAMES,2");
          if (null == var2) {
            break L82;
          } else {
            k.field_a[2] = re.a(18990, var2);
            break L82;
          }
        }
        L83: {
          var2 = vf.a(95, "COIN_NAMES,3");
          if (var2 == null) {
            break L83;
          } else {
            k.field_a[3] = re.a(TorChallenge.a(param1, 18990), var2);
            break L83;
          }
        }
        L84: {
          var2 = vf.a(95, "POWER_UP_NAMES,0");
          if (null == var2) {
            break L84;
          } else {
            lb.field_u[0] = re.a(param1 + 18990, var2);
            break L84;
          }
        }
        L85: {
          var2 = vf.a(95, "POWER_UP_NAMES,1");
          if (null == var2) {
            break L85;
          } else {
            lb.field_u[1] = re.a(18990, var2);
            break L85;
          }
        }
        L86: {
          var2 = vf.a(95, "POWER_UP_NAMES,2");
          if (var2 == null) {
            break L86;
          } else {
            lb.field_u[2] = re.a(18990, var2);
            break L86;
          }
        }
        L87: {
          var2 = vf.a(95, "POWER_UP_NAMES,3");
          if (var2 == null) {
            break L87;
          } else {
            lb.field_u[3] = re.a(18990, var2);
            break L87;
          }
        }
        L88: {
          var2 = vf.a(95, "ITEM_NAMES,0");
          if (null == var2) {
            break L88;
          } else {
            kl.field_d[0] = re.a(18990, var2);
            break L88;
          }
        }
        L89: {
          var2 = vf.a(95, "ITEM_NAMES,1");
          if (null == var2) {
            break L89;
          } else {
            kl.field_d[1] = re.a(TorChallenge.a(param1, 18990), var2);
            break L89;
          }
        }
        L90: {
          var2 = vf.a(95, "ITEM_NAMES,2");
          if (var2 == null) {
            break L90;
          } else {
            kl.field_d[2] = re.a(TorChallenge.a(param1, 18990), var2);
            break L90;
          }
        }
        L91: {
          var2 = vf.a(95, "ITEM_NAMES,3");
          if (var2 != null) {
            kl.field_d[3] = re.a(18990, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = vf.a(95, "HELP_TEXT,0,0");
          if (null != var2) {
            aa.field_h[0][0] = re.a(18990, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = vf.a(95, "HELP_TEXT,0,1");
          if (var2 != null) {
            aa.field_h[0][1] = re.a(TorChallenge.a(param1, 18990), var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = vf.a(95, "HELP_TEXT,0,2");
          if (var2 != null) {
            aa.field_h[0][2] = re.a(18990, var2);
            break L94;
          } else {
            break L94;
          }
        }
        L95: {
          if (param1 == 0) {
            break L95;
          } else {
            field_m = null;
            break L95;
          }
        }
        L96: {
          var2 = vf.a(95, "HELP_TEXT,0,3");
          if (var2 != null) {
            aa.field_h[0][3] = re.a(18990, var2);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = vf.a(95, "HELP_TEXT,0,4");
          if (var2 == null) {
            break L97;
          } else {
            aa.field_h[0][4] = re.a(18990, var2);
            break L97;
          }
        }
        L98: {
          var2 = vf.a(95, "HELP_TEXT,0,5");
          if (null != var2) {
            aa.field_h[0][5] = re.a(18990, var2);
            break L98;
          } else {
            break L98;
          }
        }
        L99: {
          var2 = vf.a(95, "HELP_TEXT,0,6");
          if (var2 == null) {
            break L99;
          } else {
            aa.field_h[0][6] = re.a(18990, var2);
            break L99;
          }
        }
        L100: {
          var2 = vf.a(95, "HELP_TEXT,0,7");
          if (null != var2) {
            aa.field_h[0][7] = re.a(18990, var2);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          var2 = vf.a(95, "HELP_TEXT,0,8");
          if (var2 == null) {
            break L101;
          } else {
            aa.field_h[0][8] = re.a(18990, var2);
            break L101;
          }
        }
        L102: {
          var2 = vf.a(95, "HELP_TEXT,0,9");
          if (var2 == null) {
            break L102;
          } else {
            aa.field_h[0][9] = re.a(18990, var2);
            break L102;
          }
        }
        L103: {
          var2 = vf.a(95, "HELP_TEXT,0,10");
          if (null == var2) {
            break L103;
          } else {
            aa.field_h[0][10] = re.a(18990, var2);
            break L103;
          }
        }
        L104: {
          var2 = vf.a(95, "HELP_TEXT,0,11");
          if (var2 == null) {
            break L104;
          } else {
            aa.field_h[0][11] = re.a(18990, var2);
            break L104;
          }
        }
        L105: {
          var2 = vf.a(95, "HELP_TEXT,0,12");
          if (null != var2) {
            aa.field_h[0][12] = re.a(TorChallenge.a(param1, 18990), var2);
            break L105;
          } else {
            break L105;
          }
        }
        L106: {
          var2 = vf.a(95, "HELP_TEXT,0,13");
          if (null != var2) {
            aa.field_h[0][13] = re.a(param1 + 18990, var2);
            break L106;
          } else {
            break L106;
          }
        }
        L107: {
          var2 = vf.a(95, "HELP_TEXT,0,14");
          if (var2 == null) {
            break L107;
          } else {
            aa.field_h[0][14] = re.a(18990, var2);
            break L107;
          }
        }
        L108: {
          var2 = vf.a(95, "HELP_TEXT,0,15");
          if (var2 == null) {
            break L108;
          } else {
            aa.field_h[0][15] = re.a(18990, var2);
            break L108;
          }
        }
        L109: {
          var2 = vf.a(95, "HELP_TEXT,0,16");
          if (null != var2) {
            aa.field_h[0][16] = re.a(18990, var2);
            break L109;
          } else {
            break L109;
          }
        }
        L110: {
          var2 = vf.a(95, "HELP_TEXT,0,17");
          if (var2 == null) {
            break L110;
          } else {
            aa.field_h[0][17] = re.a(TorChallenge.a(param1, 18990), var2);
            break L110;
          }
        }
        L111: {
          var2 = vf.a(95, "HELP_TEXT,1,0");
          if (null != var2) {
            aa.field_h[1][0] = re.a(TorChallenge.a(param1, 18990), var2);
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = vf.a(95, "HELP_TEXT,1,1");
          if (null != var2) {
            aa.field_h[1][1] = re.a(18990, var2);
            break L112;
          } else {
            break L112;
          }
        }
        L113: {
          var2 = vf.a(95, "HELP_TEXT,1,2");
          if (var2 == null) {
            break L113;
          } else {
            aa.field_h[1][2] = re.a(18990, var2);
            break L113;
          }
        }
        L114: {
          var2 = vf.a(95, "HELP_TEXT,1,3");
          if (null != var2) {
            aa.field_h[1][3] = re.a(18990, var2);
            break L114;
          } else {
            break L114;
          }
        }
        L115: {
          var2 = vf.a(95, "HELP_TEXT,1,4");
          if (var2 == null) {
            break L115;
          } else {
            aa.field_h[1][4] = re.a(18990, var2);
            break L115;
          }
        }
        L116: {
          var2 = vf.a(95, "HELP_TEXT,1,5");
          if (var2 != null) {
            aa.field_h[1][5] = re.a(18990, var2);
            break L116;
          } else {
            break L116;
          }
        }
        L117: {
          var2 = vf.a(95, "HELP_TEXT,1,6");
          if (null != var2) {
            aa.field_h[1][6] = re.a(18990, var2);
            break L117;
          } else {
            break L117;
          }
        }
        L118: {
          var2 = vf.a(95, "HELP_TEXT,1,7");
          if (null == var2) {
            break L118;
          } else {
            aa.field_h[1][7] = re.a(18990, var2);
            break L118;
          }
        }
        L119: {
          var2 = vf.a(95, "HELP_TEXT,1,8");
          if (var2 == null) {
            break L119;
          } else {
            aa.field_h[1][8] = re.a(param1 + 18990, var2);
            break L119;
          }
        }
        L120: {
          var2 = vf.a(95, "HELP_TEXT,1,9");
          if (null != var2) {
            aa.field_h[1][9] = re.a(TorChallenge.a(param1, 18990), var2);
            break L120;
          } else {
            break L120;
          }
        }
        L121: {
          var2 = vf.a(95, "HELP_TEXT,1,10");
          if (var2 == null) {
            break L121;
          } else {
            aa.field_h[1][10] = re.a(18990, var2);
            break L121;
          }
        }
        L122: {
          var2 = vf.a(95, "HELP_TEXT,1,11");
          if (var2 == null) {
            break L122;
          } else {
            aa.field_h[1][11] = re.a(param1 + 18990, var2);
            break L122;
          }
        }
        L123: {
          var2 = vf.a(95, "HELP_TEXT,2,0");
          if (var2 == null) {
            break L123;
          } else {
            aa.field_h[2][0] = re.a(TorChallenge.a(param1, 18990), var2);
            break L123;
          }
        }
        L124: {
          var2 = vf.a(95, "HELP_TEXT,2,1");
          if (null == var2) {
            break L124;
          } else {
            aa.field_h[2][1] = re.a(18990, var2);
            break L124;
          }
        }
        L125: {
          var2 = vf.a(95, "HELP_TEXT,2,2");
          if (var2 != null) {
            aa.field_h[2][2] = re.a(18990, var2);
            break L125;
          } else {
            break L125;
          }
        }
        L126: {
          var2 = vf.a(95, "HELP_TEXT,2,3");
          if (var2 == null) {
            break L126;
          } else {
            aa.field_h[2][3] = re.a(18990, var2);
            break L126;
          }
        }
        L127: {
          var2 = vf.a(95, "HELP_TEXT,2,4");
          if (null == var2) {
            break L127;
          } else {
            aa.field_h[2][4] = re.a(18990, var2);
            break L127;
          }
        }
        L128: {
          var2 = vf.a(95, "HELP_TEXT,2,5");
          if (null != var2) {
            aa.field_h[2][5] = re.a(param1 + 18990, var2);
            break L128;
          } else {
            break L128;
          }
        }
        L129: {
          var2 = vf.a(95, "HELP_TEXT,2,6");
          if (var2 != null) {
            aa.field_h[2][6] = re.a(TorChallenge.a(param1, 18990), var2);
            break L129;
          } else {
            break L129;
          }
        }
        L130: {
          var2 = vf.a(95, "HELP_TEXT,3,0");
          if (null == var2) {
            break L130;
          } else {
            aa.field_h[3][0] = re.a(18990, var2);
            break L130;
          }
        }
        L131: {
          var2 = vf.a(95, "HELP_TEXT,3,1");
          if (null != var2) {
            aa.field_h[3][1] = re.a(18990, var2);
            break L131;
          } else {
            break L131;
          }
        }
        L132: {
          var2 = vf.a(95, "HELP_TEXT,3,2");
          if (var2 != null) {
            aa.field_h[3][2] = re.a(18990, var2);
            break L132;
          } else {
            break L132;
          }
        }
        L133: {
          var2 = vf.a(95, "HELP_TEXT,3,3");
          if (var2 != null) {
            aa.field_h[3][3] = re.a(TorChallenge.a(param1, 18990), var2);
            break L133;
          } else {
            break L133;
          }
        }
        L134: {
          var2 = vf.a(95, "HELP_TEXT,3,4");
          if (var2 == null) {
            break L134;
          } else {
            aa.field_h[3][4] = re.a(param1 + 18990, var2);
            break L134;
          }
        }
        L135: {
          var2 = vf.a(95, "HELP_TEXT,3,5");
          if (null != var2) {
            aa.field_h[3][5] = re.a(18990, var2);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          var2 = vf.a(95, "HELP_TEXT,3,6");
          if (null != var2) {
            aa.field_h[3][6] = re.a(18990, var2);
            break L136;
          } else {
            break L136;
          }
        }
        L137: {
          var2 = vf.a(95, "HELP_TEXT,3,7");
          if (var2 == null) {
            break L137;
          } else {
            aa.field_h[3][7] = re.a(param1 + 18990, var2);
            break L137;
          }
        }
        L138: {
          var2 = vf.a(95, "HELP_TEXT,3,8");
          if (var2 != null) {
            aa.field_h[3][8] = re.a(18990, var2);
            break L138;
          } else {
            break L138;
          }
        }
        L139: {
          var2 = vf.a(95, "HELP_TEXT,3,9");
          if (null != var2) {
            aa.field_h[3][9] = re.a(18990, var2);
            break L139;
          } else {
            break L139;
          }
        }
        L140: {
          var2 = vf.a(95, "HELP_TEXT,3,10");
          if (null == var2) {
            break L140;
          } else {
            aa.field_h[3][10] = re.a(18990, var2);
            break L140;
          }
        }
        L141: {
          var2 = vf.a(95, "HELP_TEXT,3,11");
          if (var2 != null) {
            aa.field_h[3][11] = re.a(18990, var2);
            break L141;
          } else {
            break L141;
          }
        }
        L142: {
          var2 = vf.a(95, "HELP_TEXT,3,12");
          if (null == var2) {
            break L142;
          } else {
            aa.field_h[3][12] = re.a(18990, var2);
            break L142;
          }
        }
        L143: {
          var2 = vf.a(95, "HELP_TEXT,3,13");
          if (var2 == null) {
            break L143;
          } else {
            aa.field_h[3][13] = re.a(18990, var2);
            break L143;
          }
        }
        L144: {
          var2 = vf.a(95, "HELP_TEXT,4,0");
          if (var2 == null) {
            break L144;
          } else {
            aa.field_h[4][0] = re.a(18990, var2);
            break L144;
          }
        }
        L145: {
          var2 = vf.a(95, "HELP_TEXT,4,1");
          if (null != var2) {
            aa.field_h[4][1] = re.a(18990, var2);
            break L145;
          } else {
            break L145;
          }
        }
        L146: {
          var2 = vf.a(95, "HELP_TEXT,4,2");
          if (null == var2) {
            break L146;
          } else {
            aa.field_h[4][2] = re.a(18990, var2);
            break L146;
          }
        }
        L147: {
          var2 = vf.a(95, "HELP_TEXT,4,3");
          if (null == var2) {
            break L147;
          } else {
            aa.field_h[4][3] = re.a(18990, var2);
            break L147;
          }
        }
        L148: {
          var2 = vf.a(95, "HELP_TEXT,4,4");
          if (var2 != null) {
            aa.field_h[4][4] = re.a(TorChallenge.a(param1, 18990), var2);
            break L148;
          } else {
            break L148;
          }
        }
        L149: {
          var2 = vf.a(95, "HELP_TEXT,4,5");
          if (null != var2) {
            aa.field_h[4][5] = re.a(18990, var2);
            break L149;
          } else {
            break L149;
          }
        }
        L150: {
          var2 = vf.a(95, "HELP_TEXT,4,6");
          if (var2 != null) {
            aa.field_h[4][6] = re.a(18990, var2);
            break L150;
          } else {
            break L150;
          }
        }
        L151: {
          var2 = vf.a(95, "HELP_TEXT,4,7");
          if (null == var2) {
            break L151;
          } else {
            aa.field_h[4][7] = re.a(18990, var2);
            break L151;
          }
        }
        L152: {
          var2 = vf.a(95, "HELP_TEXT,4,8");
          if (null == var2) {
            break L152;
          } else {
            aa.field_h[4][8] = re.a(18990, var2);
            break L152;
          }
        }
        L153: {
          var2 = vf.a(95, "HELP_TEXT,5,0");
          if (null == var2) {
            break L153;
          } else {
            aa.field_h[5][0] = re.a(param1 + 18990, var2);
            break L153;
          }
        }
        L154: {
          var2 = vf.a(95, "HELP_TEXT_MISSING");
          if (null == var2) {
            break L154;
          } else {
            wj.field_d = re.a(18990, var2);
            break L154;
          }
        }
        L155: {
          var2 = vf.a(95, "LEVEL_EXIT_UNLOCKED");
          if (var2 != null) {
            lj.field_k = re.a(18990, var2);
            break L155;
          } else {
            break L155;
          }
        }
        L156: {
          var2 = vf.a(95, "COLLECT_MORE_SEALS");
          if (null == var2) {
            break L156;
          } else {
            uf.field_p = re.a(18990, var2);
            break L156;
          }
        }
        L157: {
          var2 = vf.a(95, "INTRO_TEXT,0,0");
          if (var2 == null) {
            break L157;
          } else {
            dg.field_bb[0][0] = re.a(18990, var2);
            break L157;
          }
        }
        L158: {
          var2 = vf.a(95, "INTRO_TEXT,1,0");
          if (var2 == null) {
            break L158;
          } else {
            dg.field_bb[1][0] = re.a(18990, var2);
            break L158;
          }
        }
        L159: {
          var2 = vf.a(95, "INTRO_TEXT,1,1");
          if (var2 != null) {
            dg.field_bb[1][1] = re.a(18990, var2);
            break L159;
          } else {
            break L159;
          }
        }
        L160: {
          var2 = vf.a(95, "INTRO_TEXT,2,0");
          if (var2 != null) {
            dg.field_bb[2][0] = re.a(18990, var2);
            break L160;
          } else {
            break L160;
          }
        }
        L161: {
          var2 = vf.a(95, "INTRO_TEXT,2,1");
          if (null != var2) {
            dg.field_bb[2][1] = re.a(18990, var2);
            break L161;
          } else {
            break L161;
          }
        }
        L162: {
          var2 = vf.a(95, "INTRO_TEXT,3,0");
          if (var2 != null) {
            dg.field_bb[3][0] = re.a(18990, var2);
            break L162;
          } else {
            break L162;
          }
        }
        L163: {
          var2 = vf.a(95, "INTRO_TEXT,3,1");
          if (null == var2) {
            break L163;
          } else {
            dg.field_bb[3][1] = re.a(18990, var2);
            break L163;
          }
        }
        L164: {
          var2 = vf.a(95, "INTRO_TEXT,3,2");
          if (var2 == null) {
            break L164;
          } else {
            dg.field_bb[3][2] = re.a(TorChallenge.a(param1, 18990), var2);
            break L164;
          }
        }
        L165: {
          var2 = vf.a(95, "INTRO_TEXT,4,0");
          if (var2 != null) {
            dg.field_bb[4][0] = re.a(18990, var2);
            break L165;
          } else {
            break L165;
          }
        }
        L166: {
          var2 = vf.a(95, "GAME_COMPLETE_TEXT,0,0");
          if (var2 != null) {
            vg.field_b[0][0] = re.a(18990, var2);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          var2 = vf.a(95, "GAME_COMPLETE_TEXT,0,1");
          if (null == var2) {
            break L167;
          } else {
            vg.field_b[0][1] = re.a(param1 + 18990, var2);
            break L167;
          }
        }
        L168: {
          var2 = vf.a(95, "GAME_COMPLETE_TEXT,1,0");
          if (null != var2) {
            vg.field_b[1][0] = re.a(18990, var2);
            break L168;
          } else {
            break L168;
          }
        }
        L169: {
          var2 = vf.a(95, "GAME_COMPLETE_TEXT,1,1");
          if (var2 != null) {
            vg.field_b[1][1] = re.a(18990, var2);
            break L169;
          } else {
            break L169;
          }
        }
        L170: {
          var2 = vf.a(95, "HELP_TEXT_ENTER_DOOR");
          if (var2 == null) {
            break L170;
          } else {
            k.field_h = re.a(18990, var2);
            break L170;
          }
        }
        L171: {
          var2 = vf.a(95, "OPTION_TEXT_MISSING_ERROR");
          if (null == var2) {
            break L171;
          } else {
            oh.field_a = re.a(18990, var2);
            break L171;
          }
        }
        L172: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,0,0");
          if (null != var2) {
            p.field_c[0][0] = re.a(18990, var2);
            break L172;
          } else {
            break L172;
          }
        }
        L173: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,0,1");
          if (null == var2) {
            break L173;
          } else {
            p.field_c[0][1] = re.a(18990, var2);
            break L173;
          }
        }
        L174: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,1,0");
          if (var2 != null) {
            p.field_c[1][0] = re.a(18990, var2);
            break L174;
          } else {
            break L174;
          }
        }
        L175: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,1,1");
          if (var2 == null) {
            break L175;
          } else {
            p.field_c[1][1] = re.a(18990, var2);
            break L175;
          }
        }
        L176: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,2,0");
          if (null != var2) {
            p.field_c[2][0] = re.a(18990, var2);
            break L176;
          } else {
            break L176;
          }
        }
        L177: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,2,1");
          if (var2 != null) {
            p.field_c[2][1] = re.a(18990, var2);
            break L177;
          } else {
            break L177;
          }
        }
        L178: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,3,0");
          if (var2 == null) {
            break L178;
          } else {
            p.field_c[3][0] = re.a(18990, var2);
            break L178;
          }
        }
        L179: {
          var2 = vf.a(95, "PLAYER_CONTROL_INSTRUCTIONS,3,1");
          if (null == var2) {
            break L179;
          } else {
            p.field_c[3][1] = re.a(18990, var2);
            break L179;
          }
        }
        L180: {
          var2 = vf.a(95, "NOT_AVAILABLE");
          if (var2 != null) {
            di.field_B = re.a(18990, var2);
            break L180;
          } else {
            break L180;
          }
        }
        L181: {
          var2 = vf.a(95, "INTERFACE_INSTRUCTIONS,0");
          if (var2 == null) {
            break L181;
          } else {
            sl.field_d[0] = re.a(18990, var2);
            break L181;
          }
        }
        L182: {
          var2 = vf.a(95, "INTERFACE_INSTRUCTIONS,1");
          if (null == var2) {
            break L182;
          } else {
            sl.field_d[1] = re.a(param1 + 18990, var2);
            break L182;
          }
        }
        L183: {
          var2 = vf.a(95, "INTERFACE_INSTRUCTIONS,2");
          if (null == var2) {
            break L183;
          } else {
            sl.field_d[2] = re.a(18990, var2);
            break L183;
          }
        }
        L184: {
          var2 = vf.a(95, "INTERFACE_INSTRUCTIONS,3");
          if (var2 == null) {
            break L184;
          } else {
            sl.field_d[3] = re.a(TorChallenge.a(param1, 18990), var2);
            break L184;
          }
        }
        L185: {
          var2 = vf.a(95, "HEALTH_POTION_MESSAGE");
          if (var2 != null) {
            df.field_P = re.a(18990, var2);
            break L185;
          } else {
            break L185;
          }
        }
        L186: {
          var2 = vf.a(95, "keycode_attack");
          if (null == var2) {
            break L186;
          } else {
            of.field_d = 255 & var2[0];
            break L186;
          }
        }
        L187: {
          var2 = vf.a(95, "keycode_jump");
          dj.field_cb = null;
          if (null != var2) {
            ll.field_a = 255 & var2[0];
            break L187;
          } else {
            break L187;
          }
        }
        L188: {
          if (ug.field_k == 0) {
            break L188;
          } else {
            L189: {
              if (var3 == 0) {
                stackOut_460_0 = 1;
                stackIn_461_0 = stackOut_460_0;
                break L189;
              } else {
                stackOut_459_0 = 0;
                stackIn_461_0 = stackOut_459_0;
                break L189;
              }
            }
            TorChallenge.field_F = stackIn_461_0 != 0;
            break L188;
          }
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 != 102) {
            return;
        }
        try {
            field_s = null;
            field_t = null;
            field_w = null;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "kc.E(" + param0 + 41);
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((kc) this).field_r.a((byte) 24, param0) != lk.field_c) {
              L1: {
                if (param1 == -24) {
                  break L1;
                } else {
                  boolean discarded$2 = kc.a((String) null, (byte) -57, (String) null);
                  break L1;
                }
              }
              if (((kc) this).a((byte) 24, param0) == lk.field_c) {
                stackOut_9_0 = kg.field_cb;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_11_0 = rk.field_c;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = ((kc) this).field_r.a(param0, (byte) -24);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("kc.C(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (gj.field_c == param0) {
                  break L2;
                } else {
                  if (mf.a((byte) 91)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              vl.b((byte) 91);
              gj.field_c = 11;
              break L1;
            }
            hk.field_d = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "kc.L(" + param0 + 41);
        }
    }

    kc(dj param0, dj param1) {
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
        ((kc) this).field_o = false;
        ((kc) this).field_q = "";
        try {
          L0: {
            ((kc) this).field_r = new gf(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kc.<init>(");
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
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static void a(int param0, int[] param1, byte param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  param4--;
                  if (param4 < 0) {
                    break L3;
                  } else {
                    var5 = param1;
                    var6 = param3;
                    var7 = param0;
                    var5[var6] = var7 - -(jh.a(16711422, var5[var6]) >> 1);
                    param3++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 == -39) {
                  break L2;
                } else {
                  field_p = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("kc.G(").append(param0).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static qa g(int param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        qa stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        qa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 2) {
              stackOut_3_0 = new qa(il.f(param0 ^ -24042), ah.a((byte) -63));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "kc.A(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final rj a(byte param0, String param1) {
        vh var3 = null;
        RuntimeException var3_ref = null;
        rj stackIn_2_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_5_0 = null;
        rj stackOut_11_0 = null;
        rj stackOut_9_0 = null;
        rj stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((kc) this).field_r.a(param0, param1) != lk.field_c) {
              L1: {
                if (param1.equals((Object) (Object) ((kc) this).field_q)) {
                  break L1;
                } else {
                  var3 = si.a(param1, param0 + 89);
                  if (var3.b(0)) {
                    ((kc) this).field_q = param1;
                    ((kc) this).field_o = var3.a(false);
                    break L1;
                  } else {
                    stackOut_5_0 = jh.field_c;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              L2: {
                if (!((kc) this).field_o) {
                  stackOut_11_0 = lk.field_c;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_9_0 = tf.field_w;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = lk.field_c;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("kc.D(").append(param0).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_u = 0;
        field_w = null;
        field_v = 0;
        field_m = new int[8192];
        field_t = "OVER <%0>";
        field_p = new int[]{20, 20, 20, 30, 20, 30};
    }
}
