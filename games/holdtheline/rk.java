/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends vd {
    private byte field_f;
    private bm field_g;

    final static void a() {
        kk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            var1 = (kk) (Object) rl.field_J.b((byte) 105);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var1) {
                    break L3;
                  } else {
                    mk.a(true, var1);
                    var1.d(0);
                    var1 = (kk) (Object) rl.field_J.c((byte) -48);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1_ref, "rk.B(" + 107 + 41);
        }
    }

    final static String a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -128 % ((9 - param0) / 35);
            stackOut_0_0 = sm.a(param1.length, 0, -129, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("rk.D(").append(param0).append(44);
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, gn param1) {
        byte[] var2 = null;
        int var3 = 0;
        L0: {
          var3 = HoldTheLine.field_D;
          tl.field_w = param1;
          var2 = ln.a("TEXT_GAME_NAME", 0);
          if (var2 != null) {
            di.field_w = rk.a((byte) -97, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = ln.a("TEXT_LOADING", 0);
          if (null == var2) {
            break L1;
          } else {
            ek.field_q = rk.a((byte) 48, var2);
            break L1;
          }
        }
        L2: {
          var2 = ln.a("TEXT_POSITION,0", 0);
          if (null != var2) {
            rf.field_Y[0] = rk.a((byte) 47, var2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = ln.a("TEXT_POSITION,1", 0);
          if (var2 == null) {
            break L3;
          } else {
            rf.field_Y[1] = rk.a((byte) 107, var2);
            break L3;
          }
        }
        L4: {
          var2 = ln.a("TEXT_POSITION,2", 0);
          if (null != var2) {
            rf.field_Y[2] = rk.a((byte) 86, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = ln.a("TEXT_POSITION,3", 0);
          if (var2 != null) {
            rf.field_Y[3] = rk.a((byte) -124, var2);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var2 = ln.a("TEXT_STANDINGS_DID_NOT_FINISH", 0);
          if (var2 != null) {
            ln.field_m = rk.a((byte) 91, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = ln.a("TEXT_STANDINGS_PTS", 0);
          if (var2 != null) {
            ij.field_a = rk.a((byte) -39, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = ln.a("TEXT_STANDINGS_1PT", 0);
          if (var2 != null) {
            la.field_h = rk.a((byte) 45, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = ln.a("TEXT_STANDINGS_LEADERBOARD", 0);
          if (null != var2) {
            qh.field_e = rk.a((byte) -117, var2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = ln.a("TEXT_SELECT_VEHICLE", 0);
          if (var2 != null) {
            jc.field_a = rk.a((byte) -38, var2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = ln.a("TEXT_NEXT_COURSE", 0);
          if (null != var2) {
            ue.field_c = rk.a((byte) 68, var2);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          var2 = ln.a("TEXT_RACE_PRESTART", 0);
          if (null != var2) {
            ik.field_e = rk.a((byte) -121, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = ln.a("TEXT_NAVIGATE_BACK", 0);
          if (var2 == null) {
            break L13;
          } else {
            hl.field_c = rk.a((byte) -84, var2);
            break L13;
          }
        }
        L14: {
          var2 = ln.a("TEXT_RESUME", 0);
          if (null != var2) {
            da.field_s = rk.a((byte) 91, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = ln.a("TEXT_LOGIN_REGISTER", 0);
          if (null != var2) {
            ld.field_f = rk.a((byte) -58, var2);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          var2 = ln.a("TEXT_STANDINGS", 0);
          if (var2 != null) {
            va.field_h = rk.a((byte) 124, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = ln.a("TEXT_SAVE_PROGRESS", 0);
          if (null != var2) {
            lj.field_d = rk.a((byte) 53, var2);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = ln.a("TEXT_AI_RACERS", 0);
          if (var2 != null) {
            gk.field_c = rk.a((byte) -26, var2);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          var2 = ln.a("TEXT_MODE", 0);
          if (var2 != null) {
            sa.field_a = rk.a((byte) 96, var2);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = ln.a("TEXT_PLAY_TUTORIAL", 0);
          if (null != var2) {
            eb.field_p = rk.a((byte) 116, var2);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          var2 = ln.a("TEXT_ACHIEVEMENTS_THISGAME", 0);
          if (var2 != null) {
            ug.field_i = rk.a((byte) -46, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = ln.a("TEXT_RETRY", 0);
          if (var2 != null) {
            qj.field_J = rk.a((byte) -103, var2);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = ln.a("TEXT_RETRIES_REMAINING_ZERO", 0);
          if (null == var2) {
            break L23;
          } else {
            h.field_a = rk.a((byte) -51, var2);
            break L23;
          }
        }
        L24: {
          var2 = ln.a("TEXT_RETRIES_REMAINING_ONE", 0);
          if (var2 == null) {
            break L24;
          } else {
            va.field_f = rk.a((byte) 89, var2);
            break L24;
          }
        }
        L25: {
          var2 = ln.a("TEXT_RETRIES_REMAINING_MULTIPLE", 0);
          if (null == var2) {
            break L25;
          } else {
            sh.field_c = rk.a((byte) -41, var2);
            break L25;
          }
        }
        L26: {
          var2 = ln.a("TEXT_CONTINUE", 0);
          if (null == var2) {
            break L26;
          } else {
            hk.field_b = rk.a((byte) -56, var2);
            break L26;
          }
        }
        L27: {
          var2 = ln.a("TEXT_BACK_TO_MENU", 0);
          if (var2 == null) {
            break L27;
          } else {
            String discarded$1 = rk.a((byte) -72, var2);
            break L27;
          }
        }
        L28: {
          var2 = ln.a("TEXT_KILLS", 0);
          if (null != var2) {
            vf.field_u = rk.a((byte) 118, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = ln.a("TEXT_DEATHS", 0);
          if (null == var2) {
            break L29;
          } else {
            bl.field_o = rk.a((byte) -103, var2);
            break L29;
          }
        }
        L30: {
          var2 = ln.a("TEXT_UNLOCKED", 0);
          if (var2 != null) {
            kj.field_n = rk.a((byte) -65, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = ln.a("TEXT_ENDOFFREE", 0);
          if (var2 != null) {
            ub.field_E = rk.a((byte) -100, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = ln.a("TEXT_JUSTPLAY_TEXT", 0);
          if (null == var2) {
            break L32;
          } else {
            ko.field_a = rk.a((byte) 125, var2);
            break L32;
          }
        }
        L33: {
          var2 = ln.a("TEXT_JUSTPLAY_TITLE", 0);
          if (null == var2) {
            break L33;
          } else {
            nc.field_b = rk.a((byte) 87, var2);
            break L33;
          }
        }
        L34: {
          var2 = ln.a("TEXT_HS_FETCHING", 0);
          if (var2 != null) {
            fm.field_b = rk.a((byte) -86, var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = ln.a("TEXT_HS_TOTAL", 0);
          if (null == var2) {
            break L35;
          } else {
            gl.field_a = rk.a((byte) 49, var2);
            break L35;
          }
        }
        L36: {
          var2 = ln.a("TEXT_JUSTPLAY2", 0);
          if (null != var2) {
            ue.field_b = rk.a((byte) -113, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = ln.a("TEXT_JUSTPLAY1", 0);
          if (var2 == null) {
            break L37;
          } else {
            nk.field_M = rk.a((byte) -108, var2);
            break L37;
          }
        }
        L38: {
          var2 = ln.a("keycode_multi2_left", 0);
          if (null != var2) {
            rl.field_I = var2[0] & 255;
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = ln.a("keycode_multi2_right", 0);
          if (var2 != null) {
            km.field_G = var2[0] & 255;
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = ln.a("keycode_multi2_accel", 0);
          if (var2 == null) {
            break L40;
          } else {
            ik.field_a = 255 & var2[0];
            break L40;
          }
        }
        L41: {
          var2 = ln.a("keycode_multi2_brake", 0);
          if (null != var2) {
            lf.field_g = 255 & var2[0];
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = ln.a("TEXT_MEMBER_BENEFITS,0", 0);
          if (var2 != null) {
            co.field_a[0] = rk.a((byte) 107, var2);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = ln.a("TEXT_MEMBER_BENEFITS,1", 0);
          if (var2 != null) {
            co.field_a[1] = rk.a((byte) -96, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = ln.a("TEXT_MEMBER_BENEFITS,2", 0);
          if (null != var2) {
            co.field_a[2] = rk.a((byte) 58, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = ln.a("TEXT_MEMBER_BENEFITS,3", 0);
          if (null == var2) {
            break L45;
          } else {
            co.field_a[3] = rk.a((byte) 55, var2);
            break L45;
          }
        }
        L46: {
          var2 = ln.a("TEXT_MEMBER_BENEFITS,4", 0);
          if (null == var2) {
            break L46;
          } else {
            co.field_a[4] = rk.a((byte) 94, var2);
            break L46;
          }
        }
        L47: {
          var2 = ln.a("TEXT_MEMBER_BENEFITS,5", 0);
          if (null == var2) {
            break L47;
          } else {
            co.field_a[5] = rk.a((byte) -112, var2);
            break L47;
          }
        }
        L48: {
          var2 = ln.a("ACV_NAMES,0", 0);
          if (null != var2) {
            ae.field_c[0] = rk.a((byte) 96, var2);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = ln.a("ACV_NAMES,1", 0);
          if (var2 == null) {
            break L49;
          } else {
            ae.field_c[1] = rk.a((byte) 117, var2);
            break L49;
          }
        }
        L50: {
          var2 = ln.a("ACV_NAMES,2", 0);
          if (null != var2) {
            ae.field_c[2] = rk.a((byte) -85, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = ln.a("ACV_NAMES,3", 0);
          if (var2 != null) {
            ae.field_c[3] = rk.a((byte) -84, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = ln.a("ACV_NAMES,4", 0);
          if (null == var2) {
            break L52;
          } else {
            ae.field_c[4] = rk.a((byte) 69, var2);
            break L52;
          }
        }
        L53: {
          var2 = ln.a("ACV_NAMES,5", 0);
          if (null != var2) {
            ae.field_c[5] = rk.a((byte) 49, var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = ln.a("ACV_NAMES,6", 0);
          if (var2 != null) {
            ae.field_c[6] = rk.a((byte) -123, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = ln.a("ACV_NAMES,7", 0);
          if (var2 != null) {
            ae.field_c[7] = rk.a((byte) 103, var2);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = ln.a("ACV_NAMES,8", 0);
          if (var2 == null) {
            break L56;
          } else {
            ae.field_c[8] = rk.a((byte) 114, var2);
            break L56;
          }
        }
        L57: {
          var2 = ln.a("ACV_NAMES,9", 0);
          if (null != var2) {
            ae.field_c[9] = rk.a((byte) -59, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = ln.a("ACV_NAMES,10", 0);
          if (null != var2) {
            ae.field_c[10] = rk.a((byte) 124, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = ln.a("ACV_NAMES,11", 0);
          if (null != var2) {
            ae.field_c[11] = rk.a((byte) 101, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          var2 = ln.a("ACV_NAMES,12", 0);
          if (var2 == null) {
            break L60;
          } else {
            ae.field_c[12] = rk.a((byte) 73, var2);
            break L60;
          }
        }
        L61: {
          var2 = ln.a("ACV_NAMES,13", 0);
          if (var2 != null) {
            ae.field_c[13] = rk.a((byte) 82, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = ln.a("ACV_NAMES,14", 0);
          if (var2 != null) {
            ae.field_c[14] = rk.a((byte) 71, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = ln.a("ACV_NAMES,15", 0);
          if (null == var2) {
            break L63;
          } else {
            ae.field_c[15] = rk.a((byte) 105, var2);
            break L63;
          }
        }
        L64: {
          var2 = ln.a("ACV_CRITERIA,0", 0);
          if (null != var2) {
            lf.field_j[0] = rk.a((byte) 90, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = ln.a("ACV_CRITERIA,1", 0);
          if (null != var2) {
            lf.field_j[1] = rk.a((byte) 105, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = ln.a("ACV_CRITERIA,2", 0);
          if (var2 == null) {
            break L66;
          } else {
            lf.field_j[2] = rk.a((byte) -83, var2);
            break L66;
          }
        }
        L67: {
          var2 = ln.a("ACV_CRITERIA,3", 0);
          if (var2 != null) {
            lf.field_j[3] = rk.a((byte) -82, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = ln.a("ACV_CRITERIA,4", 0);
          if (null == var2) {
            break L68;
          } else {
            lf.field_j[4] = rk.a((byte) -67, var2);
            break L68;
          }
        }
        L69: {
          var2 = ln.a("ACV_CRITERIA,5", 0);
          if (var2 != null) {
            lf.field_j[5] = rk.a((byte) 119, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = ln.a("ACV_CRITERIA,6", 0);
          if (var2 == null) {
            break L70;
          } else {
            lf.field_j[6] = rk.a((byte) 94, var2);
            break L70;
          }
        }
        L71: {
          var2 = ln.a("ACV_CRITERIA,7", 0);
          if (null == var2) {
            break L71;
          } else {
            lf.field_j[7] = rk.a((byte) -36, var2);
            break L71;
          }
        }
        L72: {
          var2 = ln.a("ACV_CRITERIA,8", 0);
          if (null != var2) {
            lf.field_j[8] = rk.a((byte) -49, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = ln.a("ACV_CRITERIA,9", 0);
          if (var2 != null) {
            lf.field_j[9] = rk.a((byte) -93, var2);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          var2 = ln.a("ACV_CRITERIA,10", 0);
          if (var2 != null) {
            lf.field_j[10] = rk.a((byte) -105, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = ln.a("ACV_CRITERIA,11", 0);
          if (var2 != null) {
            lf.field_j[11] = rk.a((byte) 87, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = ln.a("ACV_CRITERIA,12", 0);
          if (null == var2) {
            break L76;
          } else {
            lf.field_j[12] = rk.a((byte) -112, var2);
            break L76;
          }
        }
        L77: {
          var2 = ln.a("ACV_CRITERIA,13", 0);
          if (null == var2) {
            break L77;
          } else {
            lf.field_j[13] = rk.a((byte) -40, var2);
            break L77;
          }
        }
        L78: {
          var2 = ln.a("ACV_CRITERIA,14", 0);
          if (var2 == null) {
            break L78;
          } else {
            lf.field_j[14] = rk.a((byte) 123, var2);
            break L78;
          }
        }
        L79: {
          var2 = ln.a("ACV_CRITERIA,15", 0);
          if (var2 != null) {
            lf.field_j[15] = rk.a((byte) 122, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = ln.a("TEXT_HIGHSCORES_ALL", 0);
          if (null == var2) {
            break L80;
          } else {
            jc.field_d = rk.a((byte) -71, var2);
            break L80;
          }
        }
        L81: {
          var2 = ln.a("TEXT_HIGHSCORES_MINE", 0);
          if (null == var2) {
            break L81;
          } else {
            b.field_e = rk.a((byte) 123, var2);
            break L81;
          }
        }
        L82: {
          var2 = ln.a("TEXT_HIGHSCORES_BEST", 0);
          if (var2 == null) {
            break L82;
          } else {
            o.field_b = rk.a((byte) 67, var2);
            break L82;
          }
        }
        L83: {
          var2 = ln.a("HIGHSCORE_TOOLTIPS,0", 0);
          if (null == var2) {
            break L83;
          } else {
            ga.field_k[0] = rk.a((byte) 94, var2);
            break L83;
          }
        }
        L84: {
          var2 = ln.a("HIGHSCORE_TOOLTIPS,1", 0);
          if (var2 != null) {
            ga.field_k[1] = rk.a((byte) 100, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = ln.a("HIGHSCORE_TOOLTIPS,2", 0);
          if (null == var2) {
            break L85;
          } else {
            ga.field_k[2] = rk.a((byte) -126, var2);
            break L85;
          }
        }
        L86: {
          var2 = ln.a("HIGHSCORE_TOOLTIPS,3", 0);
          if (var2 == null) {
            break L86;
          } else {
            ga.field_k[3] = rk.a((byte) -30, var2);
            break L86;
          }
        }
        L87: {
          var2 = ln.a("TEXT_INSTRUCTIONS1", 0);
          if (var2 != null) {
            sk.field_f = rk.a((byte) 67, var2);
            break L87;
          } else {
            break L87;
          }
        }
        L88: {
          var2 = ln.a("TEXT_INSTRUCTIONS2", 0);
          if (var2 != null) {
            vg.field_L = rk.a((byte) -103, var2);
            break L88;
          } else {
            break L88;
          }
        }
        L89: {
          var2 = ln.a("TEXT_INSTRUCTIONS3", 0);
          if (null == var2) {
            break L89;
          } else {
            sf.field_k = rk.a((byte) -39, var2);
            break L89;
          }
        }
        L90: {
          var2 = ln.a("TEXT_INSTRUCTIONS4_1", 0);
          if (var2 == null) {
            break L90;
          } else {
            ik.field_k = rk.a((byte) -76, var2);
            break L90;
          }
        }
        L91: {
          var2 = ln.a("TEXT_INSTRUCTIONS4_2", 0);
          if (var2 != null) {
            mk.field_o = rk.a((byte) -110, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = ln.a("TEXT_INSTRUCTIONS5_1", 0);
          if (null != var2) {
            aa.field_p = rk.a((byte) 120, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = ln.a("TEXT_INSTRUCTIONS5_2", 0);
          if (null != var2) {
            hl.field_e = rk.a((byte) 55, var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = ln.a("TEXT_INSTRUCTIONS5_3", 0);
          if (null == var2) {
            break L94;
          } else {
            wb.field_b = rk.a((byte) -41, var2);
            break L94;
          }
        }
        L95: {
          var2 = ln.a("TEXT_INSTRUCTIONS5_4", 0);
          if (var2 != null) {
            ub.field_D = rk.a((byte) 80, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = ln.a("TEXT_INSTRUCTIONS6", 0);
          if (null == var2) {
            break L96;
          } else {
            ji.field_n = rk.a((byte) 88, var2);
            break L96;
          }
        }
        L97: {
          var2 = ln.a("TEXT_INSTRUCTIONS7", 0);
          if (var2 == null) {
            break L97;
          } else {
            io.field_f = rk.a((byte) 75, var2);
            break L97;
          }
        }
        L98: {
          var2 = ln.a("INSTR_PAGES,0", 0);
          if (null != var2) {
            od.field_i[0] = rk.a((byte) 66, var2);
            break L98;
          } else {
            break L98;
          }
        }
        L99: {
          var2 = ln.a("INSTR_PAGES,1", 0);
          if (var2 != null) {
            od.field_i[1] = rk.a((byte) -89, var2);
            break L99;
          } else {
            break L99;
          }
        }
        L100: {
          var2 = ln.a("INSTR_PAGES,2", 0);
          if (var2 == null) {
            break L100;
          } else {
            od.field_i[2] = rk.a((byte) -40, var2);
            break L100;
          }
        }
        L101: {
          var2 = ln.a("INSTR_PAGES,3", 0);
          if (null == var2) {
            break L101;
          } else {
            od.field_i[3] = rk.a((byte) -102, var2);
            break L101;
          }
        }
        L102: {
          var2 = ln.a("INSTR_PAGES,4", 0);
          if (null != var2) {
            od.field_i[4] = rk.a((byte) -66, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = ln.a("INSTR_PAGES,5", 0);
          if (var2 != null) {
            od.field_i[5] = rk.a((byte) -69, var2);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = ln.a("INSTR_PAGES,6", 0);
          if (null == var2) {
            break L104;
          } else {
            od.field_i[6] = rk.a((byte) -62, var2);
            break L104;
          }
        }
        L105: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS3", 0);
          if (null != var2) {
            gj.field_v = rk.a((byte) -67, var2);
            break L105;
          } else {
            break L105;
          }
        }
        L106: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS2", 0);
          if (var2 != null) {
            kb.field_d = rk.a((byte) -36, var2);
            break L106;
          } else {
            break L106;
          }
        }
        L107: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS1", 0);
          if (null == var2) {
            break L107;
          } else {
            wl.field_e = rk.a((byte) -106, var2);
            break L107;
          }
        }
        L108: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SPEED3", 0);
          if (null != var2) {
            sg.field_K = rk.a((byte) -110, var2);
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SPEED2", 0);
          if (null != var2) {
            ga.field_h = rk.a((byte) 94, var2);
            break L109;
          } else {
            break L109;
          }
        }
        L110: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SPEED1", 0);
          if (null == var2) {
            break L110;
          } else {
            uk.field_f = rk.a((byte) 111, var2);
            break L110;
          }
        }
        L111: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS3", 0);
          if (null != var2) {
            oa.field_o = rk.a((byte) 107, var2);
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS2", 0);
          if (null == var2) {
            break L112;
          } else {
            vg.field_K = rk.a((byte) -113, var2);
            break L112;
          }
        }
        L113: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS1", 0);
          if (var2 != null) {
            bj.field_J = rk.a((byte) 102, var2);
            break L113;
          } else {
            break L113;
          }
        }
        L114: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_NONE", 0);
          if (null == var2) {
            break L114;
          } else {
            HoldTheLine.field_B = rk.a((byte) -126, var2);
            break L114;
          }
        }
        L115: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SHIELDS", 0);
          if (null != var2) {
            bf.field_a = rk.a((byte) 44, var2);
            break L115;
          } else {
            break L115;
          }
        }
        L116: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_SPEED", 0);
          if (var2 != null) {
            gn.field_h = rk.a((byte) 109, var2);
            break L116;
          } else {
            break L116;
          }
        }
        L117: {
          var2 = ln.a("TEXT_INSTRUCTIONS_POWERUP_WEAPONS", 0);
          if (var2 == null) {
            break L117;
          } else {
            wn.field_k = rk.a((byte) -59, var2);
            break L117;
          }
        }
        L118: {
          var2 = ln.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI2", 0);
          if (null != var2) {
            o.field_a = rk.a((byte) 80, var2);
            break L118;
          } else {
            break L118;
          }
        }
        L119: {
          var2 = ln.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI2_COLOUR", 0);
          if (var2 == null) {
            break L119;
          } else {
            im.field_f = rk.a((byte) 91, var2);
            break L119;
          }
        }
        L120: {
          var2 = ln.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI1", 0);
          if (null != var2) {
            hc.field_a = rk.a((byte) -122, var2);
            break L120;
          } else {
            break L120;
          }
        }
        L121: {
          var2 = ln.a("TEXT_INSTRUCTIONS_CONTROLS_MULTI1_COLOUR", 0);
          if (var2 != null) {
            gm.field_a = rk.a((byte) -32, var2);
            break L121;
          } else {
            break L121;
          }
        }
        L122: {
          var2 = ln.a("TEXT_INSTRUCTIONS_CONTROLS_ACTION", 0);
          if (null == var2) {
            break L122;
          } else {
            m.field_b = rk.a((byte) 117, var2);
            break L122;
          }
        }
        L123: {
          var2 = ln.a("TEXT_INSTRUCTIONS_CONTROLS_SINGLE", 0);
          if (var2 == null) {
            break L123;
          } else {
            am.field_c = rk.a((byte) 107, var2);
            break L123;
          }
        }
        L124: {
          var2 = ln.a("TEXT_INSTRUCTIONS_ACTIVATE", 0);
          if (null == var2) {
            break L124;
          } else {
            kc.field_c = rk.a((byte) 65, var2);
            break L124;
          }
        }
        L125: {
          var2 = ln.a("TEXT_INSTRUCTIONS_RIGHT", 0);
          if (null == var2) {
            break L125;
          } else {
            cf.field_t = rk.a((byte) -117, var2);
            break L125;
          }
        }
        L126: {
          var2 = ln.a("TEXT_INSTRUCTIONS_LEFT", 0);
          if (var2 == null) {
            break L126;
          } else {
            gi.field_H = rk.a((byte) -43, var2);
            break L126;
          }
        }
        L127: {
          var2 = ln.a("TEXT_INSTRUCTIONS_BRAKE", 0);
          if (var2 == null) {
            break L127;
          } else {
            pa.field_i = rk.a((byte) 91, var2);
            break L127;
          }
        }
        L128: {
          var2 = ln.a("TEXT_INSTRUCTIONS_ACCELERATE", 0);
          if (null != var2) {
            b.field_a = rk.a((byte) 76, var2);
            break L128;
          } else {
            break L128;
          }
        }
        L129: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_ENTER", 0);
          if (var2 != null) {
            cc.field_A = rk.a((byte) -106, var2);
            break L129;
          } else {
            break L129;
          }
        }
        L130: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_SPACE_CTRL", 0);
          if (null == var2) {
            break L130;
          } else {
            vm.field_xb = rk.a((byte) 78, var2);
            break L130;
          }
        }
        L131: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_RIGHT", 0);
          if (null == var2) {
            break L131;
          } else {
            en.field_c = rk.a((byte) -27, var2);
            break L131;
          }
        }
        L132: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_LEFT", 0);
          if (null == var2) {
            break L132;
          } else {
            fk.field_a = rk.a((byte) 64, var2);
            break L132;
          }
        }
        L133: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_DOWN", 0);
          if (var2 == null) {
            break L133;
          } else {
            ra.field_fb = rk.a((byte) -122, var2);
            break L133;
          }
        }
        L134: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_UP", 0);
          if (null == var2) {
            break L134;
          } else {
            qm.field_a = rk.a((byte) 62, var2);
            break L134;
          }
        }
        L135: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_ALT_CONTROL_TAB", 0);
          if (var2 != null) {
            jh.field_b = rk.a((byte) -107, var2);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_C", 0);
          if (var2 == null) {
            break L136;
          } else {
            ka.field_a = rk.a((byte) 72, var2);
            break L136;
          }
        }
        L137: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_X", 0);
          if (null != var2) {
            vd.field_e = rk.a((byte) -30, var2);
            break L137;
          } else {
            break L137;
          }
        }
        L138: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_A", 0);
          if (null == var2) {
            break L138;
          } else {
            p.field_f = rk.a((byte) -107, var2);
            break L138;
          }
        }
        L139: {
          var2 = ln.a("TEXT_INSTRUCTIONS_KEY_Q", 0);
          if (var2 == null) {
            break L139;
          } else {
            dj.field_H = rk.a((byte) -119, var2);
            break L139;
          }
        }
        L140: {
          var2 = ln.a("GAMETYPE_NAME_RACE", 0);
          if (var2 == null) {
            break L140;
          } else {
            bo.field_a = rk.a((byte) 84, var2);
            break L140;
          }
        }
        L141: {
          var2 = ln.a("GAMETYPE_NAME_TT", 0);
          if (var2 != null) {
            cj.field_M = rk.a((byte) -58, var2);
            break L141;
          } else {
            break L141;
          }
        }
        L142: {
          var2 = ln.a("GAMETYPE_NAME_DEMOLITION", 0);
          if (var2 == null) {
            break L142;
          } else {
            qm.field_g = rk.a((byte) 96, var2);
            break L142;
          }
        }
        L143: {
          var2 = ln.a("GAMETYPE_NAME_CHAMPIONSHIP", 0);
          if (var2 == null) {
            break L143;
          } else {
            pg.field_H = rk.a((byte) 100, var2);
            break L143;
          }
        }
        L144: {
          var2 = ln.a("GAMETYPE_PLAYERS1", 0);
          if (null == var2) {
            break L144;
          } else {
            tf.field_r = rk.a((byte) 68, var2);
            break L144;
          }
        }
        L145: {
          var2 = ln.a("GAMETYPE_PLAYERS2", 0);
          if (var2 == null) {
            break L145;
          } else {
            h.field_e = rk.a((byte) -87, var2);
            break L145;
          }
        }
        L146: {
          var2 = ln.a("GAMETYPE_TOOLTIPS,0", 0);
          if (null != var2) {
            cc.field_C[0] = rk.a((byte) 63, var2);
            break L146;
          } else {
            break L146;
          }
        }
        L147: {
          var2 = ln.a("GAMETYPE_TOOLTIPS,1", 0);
          if (var2 == null) {
            break L147;
          } else {
            cc.field_C[1] = rk.a((byte) 59, var2);
            break L147;
          }
        }
        L148: {
          var2 = ln.a("GAMETYPE_TOOLTIPS,2", 0);
          if (null == var2) {
            break L148;
          } else {
            cc.field_C[2] = rk.a((byte) 121, var2);
            break L148;
          }
        }
        L149: {
          var2 = ln.a("GAMETYPE_TOOLTIPS,7", 0);
          if (null == var2) {
            break L149;
          } else {
            cc.field_C[7] = rk.a((byte) -56, var2);
            break L149;
          }
        }
        L150: {
          var2 = ln.a("AI_TOOLTIP", 0);
          if (var2 != null) {
            cd.field_c = rk.a((byte) 94, var2);
            break L150;
          } else {
            break L150;
          }
        }
        L151: {
          var2 = ln.a("TOOLTIP_COURSE", 0);
          if (var2 != null) {
            nc.field_a = rk.a((byte) -77, var2);
            break L151;
          } else {
            break L151;
          }
        }
        L152: {
          var2 = ln.a("TOOLTIP_VEHICLE", 0);
          if (var2 == null) {
            break L152;
          } else {
            ui.field_m = rk.a((byte) -97, var2);
            break L152;
          }
        }
        L153: {
          var2 = ln.a("TOOLTIP_PLAYER1", 0);
          if (null == var2) {
            break L153;
          } else {
            ac.field_g = rk.a((byte) -86, var2);
            break L153;
          }
        }
        L154: {
          var2 = ln.a("TOOLTIP_PLAYER2", 0);
          if (null == var2) {
            break L154;
          } else {
            qe.field_e = rk.a((byte) -30, var2);
            break L154;
          }
        }
        L155: {
          var2 = ln.a("TOOLTIP_COURSE_TYPE", 0);
          if (null == var2) {
            break L155;
          } else {
            vb.field_c = rk.a((byte) -65, var2);
            break L155;
          }
        }
        L156: {
          var2 = ln.a("PROFILE_NOT_ATTEMPTED", 0);
          if (null != var2) {
            sm.field_d = rk.a((byte) -45, var2);
            break L156;
          } else {
            break L156;
          }
        }
        L157: {
          var2 = ln.a("PROFILE_NA", 0);
          if (null != var2) {
            on.field_p = rk.a((byte) 120, var2);
            break L157;
          } else {
            break L157;
          }
        }
        L158: {
          var2 = ln.a("PROFILE_LAP_TIME", 0);
          if (var2 != null) {
            vm.field_zb = rk.a((byte) -97, var2);
            break L158;
          } else {
            break L158;
          }
        }
        L159: {
          var2 = ln.a("TOOLTIP_CHAMPIONSHIP", 0);
          if (null != var2) {
            hb.field_a = rk.a((byte) -104, var2);
            break L159;
          } else {
            break L159;
          }
        }
        L160: {
          var2 = ln.a("PROFILE_NOT_COMPLETE", 0);
          if (null != var2) {
            vm.field_tb = rk.a((byte) 107, var2);
            break L160;
          } else {
            break L160;
          }
        }
        L161: {
          var2 = ln.a("PROFILE_BEST_TIME", 0);
          if (var2 == null) {
            break L161;
          } else {
            bj.field_I = rk.a((byte) 53, var2);
            break L161;
          }
        }
        L162: {
          var2 = ln.a("ALERT_READY", 0);
          if (null == var2) {
            break L162;
          } else {
            cj.field_L = rk.a((byte) -128, var2);
            break L162;
          }
        }
        L163: {
          var2 = ln.a("ALERT_SET", 0);
          if (null == var2) {
            break L163;
          } else {
            io.field_a = rk.a((byte) -42, var2);
            break L163;
          }
        }
        L164: {
          var2 = ln.a("ALERT_GO", 0);
          if (var2 != null) {
            il.field_b = rk.a((byte) -50, var2);
            break L164;
          } else {
            break L164;
          }
        }
        L165: {
          var2 = ln.a("ALERT_ZOMBIES", 0);
          if (var2 != null) {
            vj.field_n = rk.a((byte) 111, var2);
            break L165;
          } else {
            break L165;
          }
        }
        L166: {
          var2 = ln.a("ALERT_FINISH", 0);
          if (var2 != null) {
            ee.field_o = rk.a((byte) -105, var2);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          var2 = ln.a("ALERT_FINAL_LAP", 0);
          if (null != var2) {
            hc.field_d = rk.a((byte) 77, var2);
            break L167;
          } else {
            break L167;
          }
        }
        L168: {
          var2 = ln.a("ALERT_ONE_KILL", 0);
          if (var2 == null) {
            break L168;
          } else {
            pd.field_g = rk.a((byte) 104, var2);
            break L168;
          }
        }
        L169: {
          var2 = ln.a("ALERT_TWO_KILLS", 0);
          if (null == var2) {
            break L169;
          } else {
            ij.field_n = rk.a((byte) -74, var2);
            break L169;
          }
        }
        L170: {
          var2 = ln.a("ALERT_X_KILLS", 0);
          if (var2 != null) {
            ag.field_p = rk.a((byte) 114, var2);
            break L170;
          } else {
            break L170;
          }
        }
        L171: {
          var2 = ln.a("SETTING_NAMES,0", 0);
          if (null == var2) {
            break L171;
          } else {
            gh.field_t[0] = rk.a((byte) 67, var2);
            break L171;
          }
        }
        L172: {
          var2 = ln.a("SETTING_NAMES,1", 0);
          if (null != var2) {
            gh.field_t[1] = rk.a((byte) -33, var2);
            break L172;
          } else {
            break L172;
          }
        }
        L173: {
          var2 = ln.a("SETTING_NAMES,2", 0);
          if (var2 == null) {
            break L173;
          } else {
            gh.field_t[2] = rk.a((byte) -68, var2);
            break L173;
          }
        }
        L174: {
          var2 = ln.a("SETTING_NAMES,3", 0);
          if (null == var2) {
            break L174;
          } else {
            gh.field_t[3] = rk.a((byte) 116, var2);
            break L174;
          }
        }
        L175: {
          var2 = ln.a("SETTING_DESCRIPTIONS,0", 0);
          if (null == var2) {
            break L175;
          } else {
            sa.field_d[0] = rk.a((byte) 69, var2);
            break L175;
          }
        }
        L176: {
          var2 = ln.a("SETTING_DESCRIPTIONS,1", 0);
          if (var2 == null) {
            break L176;
          } else {
            sa.field_d[1] = rk.a((byte) 53, var2);
            break L176;
          }
        }
        L177: {
          var2 = ln.a("SETTING_DESCRIPTIONS,2", 0);
          if (var2 == null) {
            break L177;
          } else {
            sa.field_d[2] = rk.a((byte) -30, var2);
            break L177;
          }
        }
        L178: {
          var2 = ln.a("SETTING_DESCRIPTIONS,3", 0);
          if (null == var2) {
            break L178;
          } else {
            sa.field_d[3] = rk.a((byte) 115, var2);
            break L178;
          }
        }
        L179: {
          var2 = ln.a("SETTING_CH_NOT_QUALIFIED,1", 0);
          if (var2 != null) {
            ac.field_a[1] = rk.a((byte) -106, var2);
            break L179;
          } else {
            break L179;
          }
        }
        L180: {
          var2 = ln.a("SETTING_CH_NOT_QUALIFIED,2", 0);
          if (var2 != null) {
            ac.field_a[2] = rk.a((byte) -125, var2);
            break L180;
          } else {
            break L180;
          }
        }
        L181: {
          var2 = ln.a("SETTING_CH_NOT_QUALIFIED,3", 0);
          if (null != var2) {
            ac.field_a[3] = rk.a((byte) 101, var2);
            break L181;
          } else {
            break L181;
          }
        }
        L182: {
          var2 = ln.a("SETTING_NOT_REACHED,1", 0);
          if (var2 == null) {
            break L182;
          } else {
            lf.field_f[1] = rk.a((byte) -80, var2);
            break L182;
          }
        }
        L183: {
          var2 = ln.a("SETTING_NOT_REACHED,2", 0);
          if (var2 != null) {
            lf.field_f[2] = rk.a((byte) 108, var2);
            break L183;
          } else {
            break L183;
          }
        }
        L184: {
          var2 = ln.a("SETTING_NOT_REACHED,3", 0);
          if (var2 != null) {
            lf.field_f[3] = rk.a((byte) -29, var2);
            break L184;
          } else {
            break L184;
          }
        }
        L185: {
          var2 = ln.a("COURSE_NOT_REACHED,0", 0);
          if (null == var2) {
            break L185;
          } else {
            HoldTheLine.field_G[0] = rk.a((byte) 108, var2);
            break L185;
          }
        }
        L186: {
          var2 = ln.a("COURSE_NOT_REACHED,1", 0);
          if (null != var2) {
            HoldTheLine.field_G[1] = rk.a((byte) 92, var2);
            break L186;
          } else {
            break L186;
          }
        }
        L187: {
          var2 = ln.a("COURSE_NOT_REACHED,2", 0);
          if (var2 != null) {
            HoldTheLine.field_G[2] = rk.a((byte) 74, var2);
            break L187;
          } else {
            break L187;
          }
        }
        L188: {
          var2 = ln.a("COURSE_NOT_REACHED,3", 0);
          if (null == var2) {
            break L188;
          } else {
            HoldTheLine.field_G[3] = rk.a((byte) 82, var2);
            break L188;
          }
        }
        L189: {
          var2 = ln.a("SETTING_SUBSCRIBER_ONLY", 0);
          if (var2 != null) {
            ug.field_m = rk.a((byte) 62, var2);
            break L189;
          } else {
            break L189;
          }
        }
        L190: {
          var2 = ln.a("CARNAME_F1", 0);
          if (null == var2) {
            break L190;
          } else {
            mi.field_h = rk.a((byte) -57, var2);
            break L190;
          }
        }
        L191: {
          var2 = ln.a("CARNAME_TOURER", 0);
          if (null != var2) {
            qh.field_a = rk.a((byte) -103, var2);
            break L191;
          } else {
            break L191;
          }
        }
        L192: {
          var2 = ln.a("CARNAME_SNOWCAT", 0);
          if (var2 == null) {
            break L192;
          } else {
            fj.field_p = rk.a((byte) -35, var2);
            break L192;
          }
        }
        L193: {
          var2 = ln.a("CARNAME_SNOWMOBILE", 0);
          if (var2 == null) {
            break L193;
          } else {
            ga.field_a = rk.a((byte) -75, var2);
            break L193;
          }
        }
        L194: {
          var2 = ln.a("CARNAME_DRAGSTER", 0);
          if (null != var2) {
            u.field_Q = rk.a((byte) 117, var2);
            break L194;
          } else {
            break L194;
          }
        }
        L195: {
          var2 = ln.a("CARNAME_DUNEBUGGY", 0);
          if (var2 == null) {
            break L195;
          } else {
            lf.field_d = rk.a((byte) -34, var2);
            break L195;
          }
        }
        L196: {
          var2 = ln.a("CARNAME_HATCHBACK", 0);
          if (var2 != null) {
            rg.field_d = rk.a((byte) 68, var2);
            break L196;
          } else {
            break L196;
          }
        }
        L197: {
          var2 = ln.a("CARNAME_SUV", 0);
          if (var2 != null) {
            fe.field_a = rk.a((byte) -113, var2);
            break L197;
          } else {
            break L197;
          }
        }
        L198: {
          var2 = ln.a("CARTIP_FORMAT", 0);
          if (null == var2) {
            break L198;
          } else {
            pe.field_d = rk.a((byte) -79, var2);
            break L198;
          }
        }
        tl.field_w = null;
        L199: {
          if (!md.field_h) {
            break L199;
          } else {
            var3++;
            HoldTheLine.field_D = var3;
            break L199;
          }
        }
    }

    final void a(float param0, int[] param1, int param2, int[] param3, byte param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var6_array = new int[param3.length - -param1.length];
              if (param4 == 49) {
                break L1;
              } else {
                ((rk) this).field_g = null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param3.length >= ~var7) {
                    break L4;
                  } else {
                    var6_array[var7] = param3[var7];
                    var7++;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var7 = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  if (~(param1.length / 2) >= ~var7) {
                    break L6;
                  } else {
                    var6_array[param3.length + 2 * var7] = param1[-(var7 * 2) + param1.length - 2];
                    var6_array[1 + (param3.length - -(var7 * 2))] = param1[-1 + (param1.length - 2 * var7)];
                    var7++;
                    if (var9 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  var8 = ((rk) this).field_f;
                  if (param2 != 0) {
                    break L7;
                  } else {
                    var8 = (byte)(var8 << 2);
                    break L7;
                  }
                }
                L8: {
                  if (param2 < 1) {
                    break L8;
                  } else {
                    var8 = (byte)(var8 << 4);
                    break L8;
                  }
                }
                tk.a(var6_array, (byte) -92, (byte) var8, ((rk) this).field_g);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("rk.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L10;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param4 + 41);
        }
    }

    rk(bm param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((rk) this).field_g = param0;
            ((rk) this).field_f = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rk.<init>(");
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
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    static {
    }
}
