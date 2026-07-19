/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dl extends ri {
    static long[][] field_n;
    int field_o;
    static long[] field_q;
    static byte[][] field_p;
    static fc field_l;
    static String field_m;

    public static void b(boolean param0) {
        field_l = null;
        field_n = (long[][]) null;
        if (param0) {
            return;
        }
        try {
            field_q = null;
            field_m = null;
            field_p = (byte[][]) null;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "dl.D(" + param0 + ')');
        }
    }

    abstract Object c(byte param0);

    dl(int param0) {
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "dl.<init>(" + param0 + ')');
        }
    }

    final static void a(ci param0, byte param1) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_247_0 = null;
        StringBuilder stackIn_247_1 = null;
        RuntimeException stackIn_249_0 = null;
        StringBuilder stackIn_249_1 = null;
        RuntimeException stackIn_250_0 = null;
        StringBuilder stackIn_250_1 = null;
        String stackIn_250_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_246_0 = null;
        StringBuilder stackOut_246_1 = null;
        RuntimeException stackOut_249_0 = null;
        StringBuilder stackOut_249_1 = null;
        String stackOut_249_2 = null;
        RuntimeException stackOut_247_0 = null;
        StringBuilder stackOut_247_1 = null;
        String stackOut_247_2 = null;
        try {
          L0: {
            L1: {
              uj.field_h = param0;
              var2 = qd.a(10, "defaultlang");
              if (var2 != null) {
                hi.field_d = eg.a(104, var2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = qd.a(10, "achievement_names,0");
              if (var2 != null) {
                qj.field_a[0] = eg.a(120, var2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = qd.a(10, "achievement_names,1");
              if (null != var2) {
                qj.field_a[1] = eg.a(84, var2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = qd.a(10, "achievement_names,2");
              if (null == var2) {
                break L4;
              } else {
                qj.field_a[2] = eg.a(97, var2);
                break L4;
              }
            }
            L5: {
              var2 = qd.a(10, "achievement_names,3");
              if (var2 == null) {
                break L5;
              } else {
                qj.field_a[3] = eg.a(111, var2);
                break L5;
              }
            }
            L6: {
              var2 = qd.a(10, "achievement_names,4");
              if (null != var2) {
                qj.field_a[4] = eg.a(112, var2);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var2 = qd.a(10, "achievement_names,5");
              if (null == var2) {
                break L7;
              } else {
                qj.field_a[5] = eg.a(126, var2);
                break L7;
              }
            }
            L8: {
              var2 = qd.a(10, "achievement_names,6");
              if (null != var2) {
                qj.field_a[6] = eg.a(108, var2);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2 = qd.a(10, "achievement_names,7");
              if (var2 == null) {
                break L9;
              } else {
                qj.field_a[7] = eg.a(114, var2);
                break L9;
              }
            }
            L10: {
              var2 = qd.a(10, "achievement_names,8");
              if (null != var2) {
                qj.field_a[8] = eg.a(110, var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2 = qd.a(10, "achievement_names,9");
              if (var2 != null) {
                qj.field_a[9] = eg.a(96, var2);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2 = qd.a(10, "achievement_names,10");
              if (null != var2) {
                qj.field_a[10] = eg.a(95, var2);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var2 = qd.a(10, "achievement_names,11");
              if (null == var2) {
                break L13;
              } else {
                qj.field_a[11] = eg.a(84, var2);
                break L13;
              }
            }
            L14: {
              var2 = qd.a(10, "achievement_names,12");
              if (var2 == null) {
                break L14;
              } else {
                qj.field_a[12] = eg.a(102, var2);
                break L14;
              }
            }
            L15: {
              var2 = qd.a(10, "achievement_names,13");
              if (var2 == null) {
                break L15;
              } else {
                qj.field_a[13] = eg.a(107, var2);
                break L15;
              }
            }
            L16: {
              var2 = qd.a(10, "achievement_names,14");
              if (null == var2) {
                break L16;
              } else {
                qj.field_a[14] = eg.a(92, var2);
                break L16;
              }
            }
            L17: {
              var2 = qd.a(10, "achievement_names,15");
              if (var2 != null) {
                qj.field_a[15] = eg.a(117, var2);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = qd.a(10, "achievement_criteria,0");
              if (var2 != null) {
                bl.field_b[0] = eg.a(109, var2);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2 = qd.a(10, "achievement_criteria,1");
              if (var2 == null) {
                break L19;
              } else {
                bl.field_b[1] = eg.a(85, var2);
                break L19;
              }
            }
            L20: {
              var2 = qd.a(10, "achievement_criteria,2");
              if (null != var2) {
                bl.field_b[2] = eg.a(106, var2);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2 = qd.a(10, "achievement_criteria,3");
              if (var2 != null) {
                bl.field_b[3] = eg.a(86, var2);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2 = qd.a(10, "achievement_criteria,4");
              if (null != var2) {
                bl.field_b[4] = eg.a(125, var2);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2 = qd.a(10, "achievement_criteria,5");
              if (null != var2) {
                bl.field_b[5] = eg.a(124, var2);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2 = qd.a(10, "achievement_criteria,6");
              if (null != var2) {
                bl.field_b[6] = eg.a(95, var2);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              var2 = qd.a(10, "achievement_criteria,7");
              if (var2 == null) {
                break L25;
              } else {
                bl.field_b[7] = eg.a(102, var2);
                break L25;
              }
            }
            L26: {
              var2 = qd.a(10, "achievement_criteria,8");
              if (null != var2) {
                bl.field_b[8] = eg.a(112, var2);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = qd.a(10, "achievement_criteria,9");
              if (null != var2) {
                bl.field_b[9] = eg.a(124, var2);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = qd.a(10, "achievement_criteria,10");
              if (var2 != null) {
                bl.field_b[10] = eg.a(118, var2);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              var2 = qd.a(10, "achievement_criteria,11");
              if (null != var2) {
                bl.field_b[11] = eg.a(88, var2);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              var2 = qd.a(10, "achievement_criteria,12");
              if (var2 == null) {
                break L30;
              } else {
                bl.field_b[12] = eg.a(92, var2);
                break L30;
              }
            }
            L31: {
              var2 = qd.a(10, "achievement_criteria,13");
              if (var2 != null) {
                bl.field_b[13] = eg.a(111, var2);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = qd.a(10, "achievement_criteria,14");
              if (null == var2) {
                break L32;
              } else {
                bl.field_b[14] = eg.a(118, var2);
                break L32;
              }
            }
            L33: {
              var2 = qd.a(10, "achievement_criteria,15");
              if (null != var2) {
                bl.field_b[15] = eg.a(112, var2);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = qd.a(10, "submit_for_space");
              var3 = 66 % ((param1 - 46) / 51);
              if (var2 != null) {
                tj.field_z = eg.a(106, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = qd.a(10, "submit");
              if (null == var2) {
                break L35;
              } else {
                da.field_z = eg.a(94, var2);
                break L35;
              }
            }
            L36: {
              var2 = qd.a(10, "shuffle");
              if (var2 == null) {
                break L36;
              } else {
                th.field_b = eg.a(125, var2);
                break L36;
              }
            }
            L37: {
              var2 = qd.a(10, "variety_bonus");
              if (var2 == null) {
                break L37;
              } else {
                sg.field_k = eg.a(88, var2);
                break L37;
              }
            }
            L38: {
              var2 = qd.a(10, "time_bonus");
              if (null != var2) {
                ub.field_e = eg.a(115, var2);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2 = qd.a(10, "total");
              if (var2 != null) {
                ve.field_D = eg.a(99, var2);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = qd.a(10, "confirm_zero_score");
              if (var2 != null) {
                he.field_g = eg.a(98, var2);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2 = qd.a(10, "ok");
              if (var2 != null) {
                il.field_a = eg.a(124, var2);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2 = qd.a(10, "cancel");
              if (var2 != null) {
                nh.field_h = eg.a(93, var2);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2 = qd.a(10, "cont");
              if (var2 == null) {
                break L43;
              } else {
                pd.field_c = eg.a(108, var2);
                break L43;
              }
            }
            L44: {
              var2 = qd.a(10, "resume_tutorial");
              if (var2 == null) {
                break L44;
              } else {
                re.field_m = eg.a(113, var2);
                break L44;
              }
            }
            L45: {
              var2 = qd.a(10, "end_tutorial");
              if (null == var2) {
                break L45;
              } else {
                ca.field_a = eg.a(104, var2);
                break L45;
              }
            }
            L46: {
              var2 = qd.a(10, "loadingHalloween");
              if (var2 != null) {
                ih.field_c = eg.a(125, var2);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = qd.a(10, "waitingHalloween");
              if (var2 == null) {
                break L47;
              } else {
                q.field_e = eg.a(83, var2);
                break L47;
              }
            }
            L48: {
              var2 = qd.a(10, "halloweenAchievemnts,0");
              if (null != var2) {
                ua.field_a[0] = eg.a(123, var2);
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              var2 = qd.a(10, "halloweenAchievemnts,1");
              if (null != var2) {
                ua.field_a[1] = eg.a(104, var2);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2 = qd.a(10, "halloweenAchievemnts,2");
              if (null == var2) {
                break L50;
              } else {
                ua.field_a[2] = eg.a(99, var2);
                break L50;
              }
            }
            L51: {
              var2 = qd.a(10, "halloweenAchievemnts,3");
              if (var2 != null) {
                ua.field_a[3] = eg.a(124, var2);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2 = qd.a(10, "all");
              if (var2 == null) {
                break L52;
              } else {
                ol.field_c = eg.a(117, var2);
                break L52;
              }
            }
            L53: {
              var2 = qd.a(10, "mine");
              if (var2 == null) {
                break L53;
              } else {
                se.field_q = eg.a(98, var2);
                break L53;
              }
            }
            L54: {
              var2 = qd.a(10, "besteach");
              if (var2 != null) {
                uc.field_b = eg.a(83, var2);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = qd.a(10, "languagecolon");
              if (null != var2) {
                ck.field_H = eg.a(111, var2);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2 = qd.a(10, "instructions_pages,0");
              if (var2 == null) {
                break L56;
              } else {
                db.field_b[0] = eg.a(118, var2);
                break L56;
              }
            }
            L57: {
              var2 = qd.a(10, "instructions_pages,1");
              if (null == var2) {
                break L57;
              } else {
                db.field_b[1] = eg.a(93, var2);
                break L57;
              }
            }
            L58: {
              var2 = qd.a(10, "instructions_pages,2");
              if (var2 == null) {
                break L58;
              } else {
                db.field_b[2] = eg.a(93, var2);
                break L58;
              }
            }
            L59: {
              var2 = qd.a(10, "instructions_pages,3");
              if (null != var2) {
                db.field_b[3] = eg.a(117, var2);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = qd.a(10, "instructions_pages,4");
              if (var2 != null) {
                db.field_b[4] = eg.a(98, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = qd.a(10, "instructions_pages,5");
              if (var2 != null) {
                db.field_b[5] = eg.a(112, var2);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2 = qd.a(10, "submission_rack_label");
              if (var2 == null) {
                break L62;
              } else {
                ej.field_p = eg.a(125, var2);
                break L62;
              }
            }
            L63: {
              var2 = qd.a(10, "tuttext1");
              if (null != var2) {
                sh.field_a = eg.a(126, var2);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2 = qd.a(10, "tuttext2");
              if (var2 == null) {
                break L64;
              } else {
                ll.field_W = eg.a(126, var2);
                break L64;
              }
            }
            L65: {
              var2 = qd.a(10, "tuttext3");
              if (var2 != null) {
                nl.field_g = eg.a(94, var2);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2 = qd.a(10, "readysetgo_str,0");
              if (var2 == null) {
                break L66;
              } else {
                mc.field_a[0] = eg.a(124, var2);
                break L66;
              }
            }
            L67: {
              var2 = qd.a(10, "readysetgo_str,1");
              if (var2 != null) {
                mc.field_a[1] = eg.a(109, var2);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2 = qd.a(10, "readysetgo_str,2");
              if (var2 != null) {
                mc.field_a[2] = eg.a(83, var2);
                break L68;
              } else {
                break L68;
              }
            }
            uj.field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L69: {
            var2_ref = decompiledCaughtException;
            stackOut_246_0 = (RuntimeException) (var2_ref);
            stackOut_246_1 = new StringBuilder().append("dl.E(");
            stackIn_249_0 = stackOut_246_0;
            stackIn_249_1 = stackOut_246_1;
            stackIn_247_0 = stackOut_246_0;
            stackIn_247_1 = stackOut_246_1;
            if (param0 == null) {
              stackOut_249_0 = (RuntimeException) ((Object) stackIn_249_0);
              stackOut_249_1 = (StringBuilder) ((Object) stackIn_249_1);
              stackOut_249_2 = "null";
              stackIn_250_0 = stackOut_249_0;
              stackIn_250_1 = stackOut_249_1;
              stackIn_250_2 = stackOut_249_2;
              break L69;
            } else {
              stackOut_247_0 = (RuntimeException) ((Object) stackIn_247_0);
              stackOut_247_1 = (StringBuilder) ((Object) stackIn_247_1);
              stackOut_247_2 = "{...}";
              stackIn_250_0 = stackOut_247_0;
              stackIn_250_1 = stackOut_247_1;
              stackIn_250_2 = stackOut_247_2;
              break L69;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_250_0), stackIn_250_2 + ',' + param1 + ')');
        }
    }

    abstract boolean d(int param0);

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            long var2 = 0L;
            long var4 = 0L;
            long var6 = 0L;
            long var8 = 0L;
            long var10 = 0L;
            long var12 = 0L;
            int var14 = 0;
            long stackIn_6_0 = 0L;
            long stackOut_5_0 = 0L;
            long stackOut_3_0 = 0L;
            field_n = new long[8][256];
            field_q = new long[11];
            var0 = 0;
            L0: while (true) {
              if (-257 >= (var0 ^ -1)) {
                field_q[0] = 0L;
                var0 = 1;
                L1: while (true) {
                  if (10 < var0) {
                    field_p = new byte[50][];
                    field_m = "Highscores";
                    break $cfr$clinit;
                  } else {
                    var1 = (-1 + var0) * 8;
                    field_q[var0] = aj.a(ej.a(255L, field_n[7][7 + var1]), aj.a(ej.a(field_n[6][var1 - -6], 65280L), aj.a(ej.a(16711680L, field_n[5][5 + var1]), aj.a(aj.a(ej.a(1095216660480L, field_n[3][var1 + 3]), aj.a(aj.a(ej.a(field_n[1][1 + var1], 71776119061217280L), ej.a(-72057594037927936L, field_n[0][var1])), ej.a(field_n[2][var1 - -2], 280375465082880L))), ej.a(field_n[4][var1 + 4], 4278190080L)))));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if ((1 & var0) != 0) {
                    stackOut_5_0 = (long)(var1 & 255);
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (long)(var1 >>> -6554328);
                    stackIn_6_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_6_0;
                  var4 = var2 << -6316671;
                  if (256L <= var4) {
                    var4 = var4 ^ 285L;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << -1747385407;
                  if (256L > var6) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << 555409281;
                  if ((var10 ^ -1L) > -257L) {
                    break L5;
                  } else {
                    var10 = var10 ^ 285L;
                    break L5;
                  }
                }
                var12 = var2 ^ var10;
                field_n[0][var0] = hi.a(hi.a(var4 << 1278463816, hi.a(hi.a(var10 << -1981598952, hi.a(hi.a(var6 << -1943898904, hi.a(var2 << -121003344, var2 << 1904724856)), var2 << 517900064)), var8 << -57554160)), var12);
                var14 = 1;
                L6: while (true) {
                  if (var14 >= 8) {
                    var0++;
                    continue L0;
                  } else {
                    field_n[var14][var0] = hi.a(field_n[-1 + var14][var0] << -1702575496, field_n[-1 + var14][var0] >>> -824773816);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
