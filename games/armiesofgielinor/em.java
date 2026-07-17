/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String field_e;
    static String field_c;
    int field_f;
    static String field_b;
    int field_a;
    static String field_d;

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= ~((em) this).field_f) {
              ((em) this).field_a = ((em) this).field_a + 1;
              if (~((em) this).field_f >= ~((em) this).field_a) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "em.D(" + param0 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 17) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            ((em) this).field_a = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "em.F(" + param0 + 41);
        }
    }

    final static void a(kl param0, int param1) {
        byte[] var2 = null;
        int var3 = 0;
        int stackIn_3452_0 = 0;
        int stackOut_3451_0 = 0;
        int stackOut_3450_0 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          sb.field_e = param0;
          var2 = fk.a(false, "player_config_login_free");
          if (var2 != null) {
            String discarded$15 = uu.a(var2, (byte) 73);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = fk.a(false, "achievement_names,0");
          if (null != var2) {
            so.field_a[0] = uu.a(var2, (byte) 48);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = fk.a(false, "achievement_names,1");
          if (null == var2) {
            break L2;
          } else {
            so.field_a[1] = uu.a(var2, (byte) 32);
            break L2;
          }
        }
        L3: {
          var2 = fk.a(false, "achievement_names,2");
          if (null == var2) {
            break L3;
          } else {
            so.field_a[2] = uu.a(var2, (byte) -96);
            break L3;
          }
        }
        L4: {
          var2 = fk.a(false, "achievement_names,3");
          if (var2 == null) {
            break L4;
          } else {
            so.field_a[3] = uu.a(var2, (byte) -104);
            break L4;
          }
        }
        L5: {
          var2 = fk.a(false, "achievement_names,4");
          if (null == var2) {
            break L5;
          } else {
            so.field_a[4] = uu.a(var2, (byte) -115);
            break L5;
          }
        }
        L6: {
          var2 = fk.a(false, "achievement_names,5");
          if (null == var2) {
            break L6;
          } else {
            so.field_a[5] = uu.a(var2, (byte) -128);
            break L6;
          }
        }
        L7: {
          var2 = fk.a(false, "achievement_names,6");
          if (var2 != null) {
            so.field_a[6] = uu.a(var2, (byte) 76);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = fk.a(false, "achievement_names,7");
          if (null == var2) {
            break L8;
          } else {
            so.field_a[7] = uu.a(var2, (byte) -98);
            break L8;
          }
        }
        L9: {
          var2 = fk.a(false, "achievement_names,8");
          if (var2 == null) {
            break L9;
          } else {
            so.field_a[8] = uu.a(var2, (byte) -118);
            break L9;
          }
        }
        L10: {
          var2 = fk.a(false, "achievement_names,9");
          if (var2 != null) {
            so.field_a[9] = uu.a(var2, (byte) -112);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = fk.a(false, "achievement_names,10");
          if (null == var2) {
            break L11;
          } else {
            so.field_a[10] = uu.a(var2, (byte) -116);
            break L11;
          }
        }
        L12: {
          var2 = fk.a(false, "achievement_names,11");
          if (null == var2) {
            break L12;
          } else {
            so.field_a[11] = uu.a(var2, (byte) -94);
            break L12;
          }
        }
        L13: {
          var2 = fk.a(false, "achievement_names,12");
          if (var2 == null) {
            break L13;
          } else {
            so.field_a[12] = uu.a(var2, (byte) -122);
            break L13;
          }
        }
        L14: {
          var2 = fk.a(false, "achievement_names,13");
          if (null != var2) {
            so.field_a[13] = uu.a(var2, (byte) 103);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = fk.a(false, "achievement_names,14");
          if (var2 == null) {
            break L15;
          } else {
            so.field_a[14] = uu.a(var2, (byte) 49);
            break L15;
          }
        }
        L16: {
          var2 = fk.a(false, "achievement_names,15");
          if (var2 == null) {
            break L16;
          } else {
            so.field_a[15] = uu.a(var2, (byte) 118);
            break L16;
          }
        }
        L17: {
          var2 = fk.a(false, "achievement_names,16");
          if (null != var2) {
            so.field_a[16] = uu.a(var2, (byte) -126);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = fk.a(false, "achievement_names,17");
          if (var2 != null) {
            so.field_a[17] = uu.a(var2, (byte) -107);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          var2 = fk.a(false, "achievement_names,18");
          if (null != var2) {
            so.field_a[18] = uu.a(var2, (byte) 74);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = fk.a(false, "achievement_names,19");
          if (var2 == null) {
            break L20;
          } else {
            so.field_a[19] = uu.a(var2, (byte) -103);
            break L20;
          }
        }
        L21: {
          var2 = fk.a(false, "achievement_names,20");
          if (null != var2) {
            so.field_a[20] = uu.a(var2, (byte) 41);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = fk.a(false, "achievement_names,21");
          if (null != var2) {
            so.field_a[21] = uu.a(var2, (byte) -110);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = fk.a(false, "achievement_names,22");
          if (var2 == null) {
            break L23;
          } else {
            so.field_a[22] = uu.a(var2, (byte) -119);
            break L23;
          }
        }
        L24: {
          var2 = fk.a(false, "achievement_names,23");
          if (null == var2) {
            break L24;
          } else {
            so.field_a[23] = uu.a(var2, (byte) -118);
            break L24;
          }
        }
        L25: {
          var2 = fk.a(false, "achievement_names,24");
          if (var2 != null) {
            so.field_a[24] = uu.a(var2, (byte) 58);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = fk.a(false, "achievement_names,25");
          if (var2 == null) {
            break L26;
          } else {
            so.field_a[25] = uu.a(var2, (byte) 112);
            break L26;
          }
        }
        L27: {
          var2 = fk.a(false, "achievement_names,26");
          if (var2 == null) {
            break L27;
          } else {
            so.field_a[26] = uu.a(var2, (byte) -104);
            break L27;
          }
        }
        L28: {
          var2 = fk.a(false, "achievement_names,27");
          if (var2 != null) {
            so.field_a[27] = uu.a(var2, (byte) -117);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = fk.a(false, "achievement_names,28");
          if (null != var2) {
            so.field_a[28] = uu.a(var2, (byte) 44);
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          var2 = fk.a(false, "achievement_names,29");
          if (var2 != null) {
            so.field_a[29] = uu.a(var2, (byte) -123);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = fk.a(false, "achievement_names,30");
          if (var2 != null) {
            so.field_a[30] = uu.a(var2, (byte) -111);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = fk.a(false, "achievement_names,31");
          if (var2 != null) {
            so.field_a[31] = uu.a(var2, (byte) 88);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = fk.a(false, "achievement_names,32");
          if (var2 != null) {
            so.field_a[32] = uu.a(var2, (byte) 9);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2 = fk.a(false, "achievement_names,33");
          if (var2 == null) {
            break L34;
          } else {
            so.field_a[33] = uu.a(var2, (byte) -95);
            break L34;
          }
        }
        L35: {
          var2 = fk.a(false, "achievement_names,34");
          if (var2 == null) {
            break L35;
          } else {
            so.field_a[34] = uu.a(var2, (byte) -100);
            break L35;
          }
        }
        L36: {
          var2 = fk.a(false, "achievement_names,35");
          if (null != var2) {
            so.field_a[35] = uu.a(var2, (byte) 74);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = fk.a(false, "achievement_names,36");
          if (var2 == null) {
            break L37;
          } else {
            so.field_a[36] = uu.a(var2, (byte) 14);
            break L37;
          }
        }
        L38: {
          var2 = fk.a(false, "achievement_names,37");
          if (var2 == null) {
            break L38;
          } else {
            so.field_a[37] = uu.a(var2, (byte) -117);
            break L38;
          }
        }
        L39: {
          var2 = fk.a(false, "achievement_names,38");
          if (null != var2) {
            so.field_a[38] = uu.a(var2, (byte) -98);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = fk.a(false, "achievement_names,39");
          if (null != var2) {
            so.field_a[39] = uu.a(var2, (byte) -102);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = fk.a(false, "achievement_names,40");
          if (var2 == null) {
            break L41;
          } else {
            so.field_a[40] = uu.a(var2, (byte) 2);
            break L41;
          }
        }
        L42: {
          var2 = fk.a(false, "achievement_names,41");
          if (var2 != null) {
            so.field_a[41] = uu.a(var2, (byte) -100);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = fk.a(false, "achievement_names,42");
          if (null != var2) {
            so.field_a[42] = uu.a(var2, (byte) 73);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = fk.a(false, "achievement_names,43");
          if (null == var2) {
            break L44;
          } else {
            so.field_a[43] = uu.a(var2, (byte) -106);
            break L44;
          }
        }
        L45: {
          var2 = fk.a(false, "achievement_names,44");
          if (null == var2) {
            break L45;
          } else {
            so.field_a[44] = uu.a(var2, (byte) 77);
            break L45;
          }
        }
        L46: {
          var2 = fk.a(false, "achievement_names,45");
          if (null != var2) {
            so.field_a[45] = uu.a(var2, (byte) 112);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = fk.a(false, "achievement_names,46");
          if (var2 == null) {
            break L47;
          } else {
            so.field_a[46] = uu.a(var2, (byte) -99);
            break L47;
          }
        }
        L48: {
          var2 = fk.a(false, "achievement_names,47");
          if (var2 != null) {
            so.field_a[47] = uu.a(var2, (byte) -127);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = fk.a(false, "achievement_names,48");
          if (null == var2) {
            break L49;
          } else {
            so.field_a[48] = uu.a(var2, (byte) 47);
            break L49;
          }
        }
        L50: {
          var2 = fk.a(false, "achievement_names,49");
          if (var2 != null) {
            so.field_a[49] = uu.a(var2, (byte) 109);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = fk.a(false, "achievement_names,50");
          if (null != var2) {
            so.field_a[50] = uu.a(var2, (byte) -122);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = fk.a(false, "achievement_names,51");
          if (var2 == null) {
            break L52;
          } else {
            so.field_a[51] = uu.a(var2, (byte) -98);
            break L52;
          }
        }
        L53: {
          var2 = fk.a(false, "achievement_names,52");
          if (null != var2) {
            so.field_a[52] = uu.a(var2, (byte) -127);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = fk.a(false, "achievement_names,53");
          if (null == var2) {
            break L54;
          } else {
            so.field_a[53] = uu.a(var2, (byte) -97);
            break L54;
          }
        }
        L55: {
          var2 = fk.a(false, "achievement_names,54");
          if (null != var2) {
            so.field_a[54] = uu.a(var2, (byte) -98);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = fk.a(false, "achievement_names,55");
          if (null != var2) {
            so.field_a[55] = uu.a(var2, (byte) -106);
            break L56;
          } else {
            break L56;
          }
        }
        L57: {
          var2 = fk.a(false, "achievement_criteria,0");
          if (var2 != null) {
            oi.field_a[0] = uu.a(var2, (byte) 98);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = fk.a(false, "achievement_criteria,1");
          if (var2 == null) {
            break L58;
          } else {
            oi.field_a[1] = uu.a(var2, (byte) 39);
            break L58;
          }
        }
        L59: {
          var2 = fk.a(false, "achievement_criteria,2");
          if (null != var2) {
            oi.field_a[2] = uu.a(var2, (byte) 64);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          var2 = fk.a(false, "achievement_criteria,3");
          if (null == var2) {
            break L60;
          } else {
            oi.field_a[3] = uu.a(var2, (byte) -93);
            break L60;
          }
        }
        L61: {
          var2 = fk.a(false, "achievement_criteria,4");
          if (null == var2) {
            break L61;
          } else {
            oi.field_a[4] = uu.a(var2, (byte) -94);
            break L61;
          }
        }
        L62: {
          var2 = fk.a(false, "achievement_criteria,5");
          if (var2 == null) {
            break L62;
          } else {
            oi.field_a[5] = uu.a(var2, (byte) -114);
            break L62;
          }
        }
        L63: {
          var2 = fk.a(false, "achievement_criteria,6");
          if (null == var2) {
            break L63;
          } else {
            oi.field_a[6] = uu.a(var2, (byte) 47);
            break L63;
          }
        }
        L64: {
          var2 = fk.a(false, "achievement_criteria,7");
          if (null != var2) {
            oi.field_a[7] = uu.a(var2, (byte) -121);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = fk.a(false, "achievement_criteria,8");
          if (null == var2) {
            break L65;
          } else {
            oi.field_a[8] = uu.a(var2, (byte) -119);
            break L65;
          }
        }
        L66: {
          var2 = fk.a(false, "achievement_criteria,9");
          if (var2 == null) {
            break L66;
          } else {
            oi.field_a[9] = uu.a(var2, (byte) 37);
            break L66;
          }
        }
        L67: {
          var2 = fk.a(false, "achievement_criteria,10");
          if (var2 != null) {
            oi.field_a[10] = uu.a(var2, (byte) -118);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = fk.a(false, "achievement_criteria,11");
          if (null != var2) {
            oi.field_a[11] = uu.a(var2, (byte) 62);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = fk.a(false, "achievement_criteria,12");
          if (var2 != null) {
            oi.field_a[12] = uu.a(var2, (byte) 103);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = fk.a(false, "achievement_criteria,13");
          if (var2 == null) {
            break L70;
          } else {
            oi.field_a[13] = uu.a(var2, (byte) 68);
            break L70;
          }
        }
        L71: {
          var2 = fk.a(false, "achievement_criteria,14");
          if (var2 == null) {
            break L71;
          } else {
            oi.field_a[14] = uu.a(var2, (byte) 55);
            break L71;
          }
        }
        L72: {
          var2 = fk.a(false, "achievement_criteria,15");
          if (null != var2) {
            oi.field_a[15] = uu.a(var2, (byte) 14);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = fk.a(false, "achievement_criteria,16");
          if (var2 != null) {
            oi.field_a[16] = uu.a(var2, (byte) -110);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          var2 = fk.a(false, "achievement_criteria,17");
          if (null == var2) {
            break L74;
          } else {
            oi.field_a[17] = uu.a(var2, (byte) -115);
            break L74;
          }
        }
        L75: {
          var2 = fk.a(false, "achievement_criteria,18");
          if (var2 != null) {
            oi.field_a[18] = uu.a(var2, (byte) -111);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = fk.a(false, "achievement_criteria,19");
          if (null != var2) {
            oi.field_a[19] = uu.a(var2, (byte) -108);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = fk.a(false, "achievement_criteria,20");
          if (var2 != null) {
            oi.field_a[20] = uu.a(var2, (byte) 2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = fk.a(false, "achievement_criteria,21");
          if (null == var2) {
            break L78;
          } else {
            oi.field_a[21] = uu.a(var2, (byte) 75);
            break L78;
          }
        }
        L79: {
          var2 = fk.a(false, "achievement_criteria,22");
          if (var2 != null) {
            oi.field_a[22] = uu.a(var2, (byte) -92);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = fk.a(false, "achievement_criteria,23");
          if (null != var2) {
            oi.field_a[23] = uu.a(var2, (byte) -93);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = fk.a(false, "achievement_criteria,24");
          if (null != var2) {
            oi.field_a[24] = uu.a(var2, (byte) 70);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = fk.a(false, "achievement_criteria,25");
          if (null != var2) {
            oi.field_a[25] = uu.a(var2, (byte) -125);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          var2 = fk.a(false, "achievement_criteria,26");
          if (var2 == null) {
            break L83;
          } else {
            oi.field_a[26] = uu.a(var2, (byte) 38);
            break L83;
          }
        }
        L84: {
          var2 = fk.a(false, "achievement_criteria,27");
          if (null == var2) {
            break L84;
          } else {
            oi.field_a[27] = uu.a(var2, (byte) -128);
            break L84;
          }
        }
        L85: {
          var2 = fk.a(false, "achievement_criteria,28");
          if (null == var2) {
            break L85;
          } else {
            oi.field_a[28] = uu.a(var2, (byte) -117);
            break L85;
          }
        }
        L86: {
          var2 = fk.a(false, "achievement_criteria,29");
          if (var2 != null) {
            oi.field_a[29] = uu.a(var2, (byte) 118);
            break L86;
          } else {
            break L86;
          }
        }
        L87: {
          var2 = fk.a(false, "achievement_criteria,30");
          if (var2 != null) {
            oi.field_a[30] = uu.a(var2, (byte) 94);
            break L87;
          } else {
            break L87;
          }
        }
        L88: {
          var2 = fk.a(false, "achievement_criteria,31");
          if (var2 == null) {
            break L88;
          } else {
            oi.field_a[31] = uu.a(var2, (byte) 30);
            break L88;
          }
        }
        L89: {
          var2 = fk.a(false, "achievement_criteria,32");
          if (null == var2) {
            break L89;
          } else {
            oi.field_a[32] = uu.a(var2, (byte) 77);
            break L89;
          }
        }
        L90: {
          var2 = fk.a(false, "achievement_criteria,33");
          if (null != var2) {
            oi.field_a[33] = uu.a(var2, (byte) 65);
            break L90;
          } else {
            break L90;
          }
        }
        L91: {
          var2 = fk.a(false, "achievement_criteria,34");
          if (var2 != null) {
            oi.field_a[34] = uu.a(var2, (byte) 84);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = fk.a(false, "achievement_criteria,35");
          if (var2 != null) {
            oi.field_a[35] = uu.a(var2, (byte) -113);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = fk.a(false, "achievement_criteria,36");
          if (var2 != null) {
            oi.field_a[36] = uu.a(var2, (byte) 3);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = fk.a(false, "achievement_criteria,37");
          if (null != var2) {
            oi.field_a[37] = uu.a(var2, (byte) -102);
            break L94;
          } else {
            break L94;
          }
        }
        L95: {
          var2 = fk.a(false, "achievement_criteria,38");
          if (var2 == null) {
            break L95;
          } else {
            oi.field_a[38] = uu.a(var2, (byte) 34);
            break L95;
          }
        }
        L96: {
          var2 = fk.a(false, "achievement_criteria,39");
          if (var2 != null) {
            oi.field_a[39] = uu.a(var2, (byte) -108);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = fk.a(false, "achievement_criteria,40");
          if (null == var2) {
            break L97;
          } else {
            oi.field_a[40] = uu.a(var2, (byte) 120);
            break L97;
          }
        }
        L98: {
          var2 = fk.a(false, "achievement_criteria,41");
          if (null == var2) {
            break L98;
          } else {
            oi.field_a[41] = uu.a(var2, (byte) -97);
            break L98;
          }
        }
        L99: {
          var2 = fk.a(false, "achievement_criteria,42");
          if (var2 == null) {
            break L99;
          } else {
            oi.field_a[42] = uu.a(var2, (byte) -105);
            break L99;
          }
        }
        L100: {
          var2 = fk.a(false, "achievement_criteria,43");
          if (null == var2) {
            break L100;
          } else {
            oi.field_a[43] = uu.a(var2, (byte) 81);
            break L100;
          }
        }
        L101: {
          var2 = fk.a(false, "achievement_criteria,44");
          if (null == var2) {
            break L101;
          } else {
            oi.field_a[44] = uu.a(var2, (byte) -96);
            break L101;
          }
        }
        L102: {
          var2 = fk.a(false, "achievement_criteria,45");
          if (var2 == null) {
            break L102;
          } else {
            oi.field_a[45] = uu.a(var2, (byte) 15);
            break L102;
          }
        }
        L103: {
          var2 = fk.a(false, "achievement_criteria,46");
          if (var2 != null) {
            oi.field_a[46] = uu.a(var2, (byte) -92);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = fk.a(false, "achievement_criteria,47");
          if (var2 != null) {
            oi.field_a[47] = uu.a(var2, (byte) 42);
            break L104;
          } else {
            break L104;
          }
        }
        L105: {
          var2 = fk.a(false, "achievement_criteria,48");
          if (null != var2) {
            oi.field_a[48] = uu.a(var2, (byte) -114);
            break L105;
          } else {
            break L105;
          }
        }
        L106: {
          var2 = fk.a(false, "achievement_criteria,49");
          if (null == var2) {
            break L106;
          } else {
            oi.field_a[49] = uu.a(var2, (byte) -93);
            break L106;
          }
        }
        L107: {
          var2 = fk.a(false, "achievement_criteria,50");
          if (var2 != null) {
            oi.field_a[50] = uu.a(var2, (byte) -102);
            break L107;
          } else {
            break L107;
          }
        }
        L108: {
          var2 = fk.a(false, "achievement_criteria,51");
          if (null != var2) {
            oi.field_a[51] = uu.a(var2, (byte) -100);
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          var2 = fk.a(false, "achievement_criteria,52");
          if (var2 != null) {
            oi.field_a[52] = uu.a(var2, (byte) 7);
            break L109;
          } else {
            break L109;
          }
        }
        L110: {
          var2 = fk.a(false, "achievement_criteria,53");
          if (null != var2) {
            oi.field_a[53] = uu.a(var2, (byte) 123);
            break L110;
          } else {
            break L110;
          }
        }
        L111: {
          var2 = fk.a(false, "achievement_criteria,54");
          if (null != var2) {
            oi.field_a[54] = uu.a(var2, (byte) 65);
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = fk.a(false, "achievement_criteria,55");
          if (var2 == null) {
            break L112;
          } else {
            oi.field_a[55] = uu.a(var2, (byte) 19);
            break L112;
          }
        }
        L113: {
          var2 = fk.a(false, "text_config_pleaselogin_free");
          if (var2 != null) {
            r.field_G = uu.a(var2, (byte) 19);
            break L113;
          } else {
            break L113;
          }
        }
        L114: {
          var2 = fk.a(false, "text_campaign_pleaselogin_free");
          if (null == var2) {
            break L114;
          } else {
            bi.field_e = uu.a(var2, (byte) 4);
            break L114;
          }
        }
        L115: {
          var2 = fk.a(false, "TXT_REQUIRES");
          if (null == var2) {
            break L115;
          } else {
            co.field_s = uu.a(var2, (byte) -93);
            break L115;
          }
        }
        L116: {
          var2 = fk.a(false, "TXT_REQUIRESPRESTIGE");
          if (var2 == null) {
            break L116;
          } else {
            ll.field_Jb = uu.a(var2, (byte) -99);
            break L116;
          }
        }
        L117: {
          var2 = fk.a(false, "TXT_AND");
          if (var2 == null) {
            break L117;
          } else {
            gk.field_L = uu.a(var2, (byte) 101);
            break L117;
          }
        }
        L118: {
          var2 = fk.a(false, "PANTHEON_REQUIRED");
          if (var2 == null) {
            break L118;
          } else {
            vs.field_i = uu.a(var2, (byte) 31);
            break L118;
          }
        }
        L119: {
          var2 = fk.a(false, "maptypes,0");
          if (null == var2) {
            break L119;
          } else {
            dj.field_c[0] = uu.a(var2, (byte) 29);
            break L119;
          }
        }
        L120: {
          var2 = fk.a(false, "maptypes,1");
          if (null != var2) {
            dj.field_c[1] = uu.a(var2, (byte) -110);
            break L120;
          } else {
            break L120;
          }
        }
        L121: {
          var2 = fk.a(false, "maptypes,2");
          if (var2 == null) {
            break L121;
          } else {
            dj.field_c[2] = uu.a(var2, (byte) 121);
            break L121;
          }
        }
        L122: {
          var2 = fk.a(false, "maptypes,3");
          if (null == var2) {
            break L122;
          } else {
            dj.field_c[3] = uu.a(var2, (byte) -118);
            break L122;
          }
        }
        L123: {
          var2 = fk.a(false, "maptypes,4");
          if (var2 != null) {
            dj.field_c[4] = uu.a(var2, (byte) -120);
            break L123;
          } else {
            break L123;
          }
        }
        L124: {
          var2 = fk.a(false, "gameoptlabels,0");
          if (var2 != null) {
            pf.field_a[0] = uu.a(var2, (byte) -122);
            break L124;
          } else {
            break L124;
          }
        }
        L125: {
          var2 = fk.a(false, "gameoptlabels,1");
          if (var2 != null) {
            pf.field_a[1] = uu.a(var2, (byte) -93);
            break L125;
          } else {
            break L125;
          }
        }
        L126: {
          var2 = fk.a(false, "gameoptlabels,2");
          if (null == var2) {
            break L126;
          } else {
            pf.field_a[2] = uu.a(var2, (byte) 68);
            break L126;
          }
        }
        L127: {
          var2 = fk.a(false, "gameoptlabels,3");
          if (var2 == null) {
            break L127;
          } else {
            pf.field_a[3] = uu.a(var2, (byte) 51);
            break L127;
          }
        }
        L128: {
          var2 = fk.a(false, "gameoptlabels,4");
          if (null != var2) {
            pf.field_a[4] = uu.a(var2, (byte) 76);
            break L128;
          } else {
            break L128;
          }
        }
        L129: {
          var2 = fk.a(false, "gameoptlabels,5");
          if (null == var2) {
            break L129;
          } else {
            pf.field_a[5] = uu.a(var2, (byte) -96);
            break L129;
          }
        }
        L130: {
          var2 = fk.a(false, "gameoptnames,0,0");
          if (null != var2) {
            ku.field_L[0][0] = uu.a(var2, (byte) 56);
            break L130;
          } else {
            break L130;
          }
        }
        L131: {
          var2 = fk.a(false, "gameoptnames,0,1");
          if (null == var2) {
            break L131;
          } else {
            ku.field_L[0][1] = uu.a(var2, (byte) -120);
            break L131;
          }
        }
        L132: {
          var2 = fk.a(false, "gameoptnames,0,2");
          if (var2 == null) {
            break L132;
          } else {
            ku.field_L[0][2] = uu.a(var2, (byte) 64);
            break L132;
          }
        }
        L133: {
          var2 = fk.a(false, "gameoptnames,0,3");
          if (var2 != null) {
            ku.field_L[0][3] = uu.a(var2, (byte) -106);
            break L133;
          } else {
            break L133;
          }
        }
        L134: {
          var2 = fk.a(false, "gameoptnames,0,4");
          if (null == var2) {
            break L134;
          } else {
            ku.field_L[0][4] = uu.a(var2, (byte) -93);
            break L134;
          }
        }
        L135: {
          var2 = fk.a(false, "gameoptnames,0,5");
          if (null != var2) {
            ku.field_L[0][5] = uu.a(var2, (byte) -110);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          var2 = fk.a(false, "gameoptnames,0,6");
          if (null != var2) {
            ku.field_L[0][6] = uu.a(var2, (byte) -127);
            break L136;
          } else {
            break L136;
          }
        }
        L137: {
          var2 = fk.a(false, "gameoptnames,1,0");
          if (var2 != null) {
            ku.field_L[1][0] = uu.a(var2, (byte) 39);
            break L137;
          } else {
            break L137;
          }
        }
        L138: {
          var2 = fk.a(false, "gameoptnames,1,1");
          if (var2 != null) {
            ku.field_L[1][1] = uu.a(var2, (byte) 51);
            break L138;
          } else {
            break L138;
          }
        }
        L139: {
          var2 = fk.a(false, "gameoptnames,1,2");
          if (null == var2) {
            break L139;
          } else {
            ku.field_L[1][2] = uu.a(var2, (byte) -108);
            break L139;
          }
        }
        L140: {
          var2 = fk.a(false, "gameoptnames,1,3");
          if (var2 != null) {
            ku.field_L[1][3] = uu.a(var2, (byte) -126);
            break L140;
          } else {
            break L140;
          }
        }
        L141: {
          var2 = fk.a(false, "gameoptnames,2,0");
          if (null == var2) {
            break L141;
          } else {
            ku.field_L[2][0] = uu.a(var2, (byte) -108);
            break L141;
          }
        }
        L142: {
          var2 = fk.a(false, "gameoptnames,2,1");
          if (null == var2) {
            break L142;
          } else {
            ku.field_L[2][1] = uu.a(var2, (byte) -94);
            break L142;
          }
        }
        L143: {
          var2 = fk.a(false, "gameoptnames,2,2");
          if (null == var2) {
            break L143;
          } else {
            ku.field_L[2][2] = uu.a(var2, (byte) -101);
            break L143;
          }
        }
        L144: {
          var2 = fk.a(false, "gameoptnames,2,3");
          if (var2 == null) {
            break L144;
          } else {
            ku.field_L[2][3] = uu.a(var2, (byte) -99);
            break L144;
          }
        }
        L145: {
          var2 = fk.a(false, "gameoptnames,4,0");
          if (null == var2) {
            break L145;
          } else {
            ku.field_L[4][0] = uu.a(var2, (byte) 112);
            break L145;
          }
        }
        L146: {
          var2 = fk.a(false, "gameoptnames,4,1");
          if (null != var2) {
            ku.field_L[4][1] = uu.a(var2, (byte) 104);
            break L146;
          } else {
            break L146;
          }
        }
        L147: {
          var2 = fk.a(false, "gameoptnames,5,0");
          if (var2 == null) {
            break L147;
          } else {
            ku.field_L[5][0] = uu.a(var2, (byte) -97);
            break L147;
          }
        }
        L148: {
          var2 = fk.a(false, "gameoptnames,5,1");
          if (var2 != null) {
            ku.field_L[5][1] = uu.a(var2, (byte) 87);
            break L148;
          } else {
            break L148;
          }
        }
        L149: {
          var2 = fk.a(false, "gameoptnames,5,2");
          if (var2 != null) {
            ku.field_L[5][2] = uu.a(var2, (byte) -126);
            break L149;
          } else {
            break L149;
          }
        }
        L150: {
          var2 = fk.a(false, "gameoptnames,5,3");
          if (null != var2) {
            ku.field_L[5][3] = uu.a(var2, (byte) -113);
            break L150;
          } else {
            break L150;
          }
        }
        L151: {
          var2 = fk.a(false, "gameoptnames,5,4");
          if (null != var2) {
            ku.field_L[5][4] = uu.a(var2, (byte) -111);
            break L151;
          } else {
            break L151;
          }
        }
        L152: {
          var2 = fk.a(false, "gameopttooltips,0,0");
          if (var2 == null) {
            break L152;
          } else {
            ki.field_d[0][0] = uu.a(var2, (byte) 105);
            break L152;
          }
        }
        L153: {
          var2 = fk.a(false, "gameopttooltips,0,1");
          if (null == var2) {
            break L153;
          } else {
            ki.field_d[0][1] = uu.a(var2, (byte) -128);
            break L153;
          }
        }
        L154: {
          var2 = fk.a(false, "gameopttooltips,0,2");
          if (var2 != null) {
            ki.field_d[0][2] = uu.a(var2, (byte) -104);
            break L154;
          } else {
            break L154;
          }
        }
        L155: {
          var2 = fk.a(false, "gameopttooltips,0,3");
          if (null != var2) {
            ki.field_d[0][3] = uu.a(var2, (byte) 96);
            break L155;
          } else {
            break L155;
          }
        }
        L156: {
          var2 = fk.a(false, "gameopttooltips,0,4");
          if (var2 == null) {
            break L156;
          } else {
            ki.field_d[0][4] = uu.a(var2, (byte) 102);
            break L156;
          }
        }
        L157: {
          var2 = fk.a(false, "gameopttooltips,0,5");
          if (var2 != null) {
            ki.field_d[0][5] = uu.a(var2, (byte) -95);
            break L157;
          } else {
            break L157;
          }
        }
        L158: {
          var2 = fk.a(false, "gameopttooltips,0,6");
          if (var2 != null) {
            ki.field_d[0][6] = uu.a(var2, (byte) 56);
            break L158;
          } else {
            break L158;
          }
        }
        L159: {
          var2 = fk.a(false, "gameopttooltips,1,0");
          if (var2 != null) {
            ki.field_d[1][0] = uu.a(var2, (byte) 31);
            break L159;
          } else {
            break L159;
          }
        }
        L160: {
          var2 = fk.a(false, "gameopttooltips,1,1");
          if (null == var2) {
            break L160;
          } else {
            ki.field_d[1][1] = uu.a(var2, (byte) -102);
            break L160;
          }
        }
        L161: {
          var2 = fk.a(false, "gameopttooltips,1,2");
          if (null != var2) {
            ki.field_d[1][2] = uu.a(var2, (byte) 76);
            break L161;
          } else {
            break L161;
          }
        }
        L162: {
          var2 = fk.a(false, "gameopttooltips,1,3");
          if (null == var2) {
            break L162;
          } else {
            ki.field_d[1][3] = uu.a(var2, (byte) 24);
            break L162;
          }
        }
        L163: {
          var2 = fk.a(false, "gameopttooltips,2,0");
          if (null != var2) {
            ki.field_d[2][0] = uu.a(var2, (byte) 126);
            break L163;
          } else {
            break L163;
          }
        }
        L164: {
          var2 = fk.a(false, "gameopttooltips,2,1");
          if (null == var2) {
            break L164;
          } else {
            ki.field_d[2][1] = uu.a(var2, (byte) -100);
            break L164;
          }
        }
        L165: {
          var2 = fk.a(false, "gameopttooltips,2,2");
          if (var2 == null) {
            break L165;
          } else {
            ki.field_d[2][2] = uu.a(var2, (byte) -112);
            break L165;
          }
        }
        L166: {
          var2 = fk.a(false, "gameopttooltips,2,3");
          if (var2 != null) {
            ki.field_d[2][3] = uu.a(var2, (byte) -122);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          var2 = fk.a(false, "gameopttooltips,3,0");
          if (null != var2) {
            ki.field_d[3][0] = uu.a(var2, (byte) -106);
            break L167;
          } else {
            break L167;
          }
        }
        L168: {
          var2 = fk.a(false, "gameopttooltips,3,1");
          if (null == var2) {
            break L168;
          } else {
            ki.field_d[3][1] = uu.a(var2, (byte) 30);
            break L168;
          }
        }
        L169: {
          var2 = fk.a(false, "gameopttooltips,3,2");
          if (var2 == null) {
            break L169;
          } else {
            ki.field_d[3][2] = uu.a(var2, (byte) 40);
            break L169;
          }
        }
        L170: {
          var2 = fk.a(false, "gameopttooltips,3,3");
          if (var2 != null) {
            ki.field_d[3][3] = uu.a(var2, (byte) 64);
            break L170;
          } else {
            break L170;
          }
        }
        L171: {
          var2 = fk.a(false, "gameopttooltips,3,4");
          if (var2 != null) {
            ki.field_d[3][4] = uu.a(var2, (byte) -100);
            break L171;
          } else {
            break L171;
          }
        }
        L172: {
          var2 = fk.a(false, "gameopttooltips,4,0");
          if (var2 == null) {
            break L172;
          } else {
            ki.field_d[4][0] = uu.a(var2, (byte) 108);
            break L172;
          }
        }
        L173: {
          var2 = fk.a(false, "gameopttooltips,4,1");
          if (null == var2) {
            break L173;
          } else {
            ki.field_d[4][1] = uu.a(var2, (byte) -115);
            break L173;
          }
        }
        L174: {
          var2 = fk.a(false, "gameopttooltips,5,0");
          if (null == var2) {
            break L174;
          } else {
            ki.field_d[5][0] = uu.a(var2, (byte) -119);
            break L174;
          }
        }
        L175: {
          var2 = fk.a(false, "gameopttooltips,5,1");
          if (var2 != null) {
            ki.field_d[5][1] = uu.a(var2, (byte) -104);
            break L175;
          } else {
            break L175;
          }
        }
        L176: {
          var2 = fk.a(false, "gameopttooltips,5,2");
          if (null != var2) {
            ki.field_d[5][2] = uu.a(var2, (byte) 24);
            break L176;
          } else {
            break L176;
          }
        }
        L177: {
          var2 = fk.a(false, "gameopttooltips,5,3");
          if (var2 != null) {
            ki.field_d[5][3] = uu.a(var2, (byte) -124);
            break L177;
          } else {
            break L177;
          }
        }
        L178: {
          var2 = fk.a(false, "gameopttooltips,5,4");
          if (null != var2) {
            ki.field_d[5][4] = uu.a(var2, (byte) -97);
            break L178;
          } else {
            break L178;
          }
        }
        L179: {
          var2 = fk.a(false, "instructions_titles,0,0");
          if (null != var2) {
            up.field_b[0][0] = uu.a(var2, (byte) -102);
            break L179;
          } else {
            break L179;
          }
        }
        L180: {
          var2 = fk.a(false, "instructions_titles,1,0");
          if (null == var2) {
            break L180;
          } else {
            up.field_b[1][0] = uu.a(var2, (byte) 20);
            break L180;
          }
        }
        L181: {
          var2 = fk.a(false, "instructions_titles,3,0");
          if (var2 != null) {
            up.field_b[3][0] = uu.a(var2, (byte) 108);
            break L181;
          } else {
            break L181;
          }
        }
        L182: {
          var2 = fk.a(false, "instructions_titles,4,0");
          if (null != var2) {
            up.field_b[4][0] = uu.a(var2, (byte) -127);
            break L182;
          } else {
            break L182;
          }
        }
        L183: {
          var2 = fk.a(false, "instructions_titles,5,0");
          if (var2 == null) {
            break L183;
          } else {
            up.field_b[5][0] = uu.a(var2, (byte) 53);
            break L183;
          }
        }
        L184: {
          var2 = fk.a(false, "instructions_titles,6,0");
          if (var2 == null) {
            break L184;
          } else {
            up.field_b[6][0] = uu.a(var2, (byte) -103);
            break L184;
          }
        }
        L185: {
          var2 = fk.a(false, "instructions_titles,7,0");
          if (var2 != null) {
            up.field_b[7][0] = uu.a(var2, (byte) 78);
            break L185;
          } else {
            break L185;
          }
        }
        L186: {
          var2 = fk.a(false, "instructions_titles,8,0");
          if (var2 == null) {
            break L186;
          } else {
            up.field_b[8][0] = uu.a(var2, (byte) 111);
            break L186;
          }
        }
        L187: {
          var2 = fk.a(false, "instructions_titles,9,0");
          if (null == var2) {
            break L187;
          } else {
            up.field_b[9][0] = uu.a(var2, (byte) -114);
            break L187;
          }
        }
        L188: {
          var2 = fk.a(false, "instructions_titles,9,1");
          if (var2 != null) {
            up.field_b[9][1] = uu.a(var2, (byte) -100);
            break L188;
          } else {
            break L188;
          }
        }
        L189: {
          var2 = fk.a(false, "instructions_titles,11,0");
          if (null != var2) {
            up.field_b[11][0] = uu.a(var2, (byte) -122);
            break L189;
          } else {
            break L189;
          }
        }
        L190: {
          var2 = fk.a(false, "instructions_titles,12,0");
          if (null != var2) {
            up.field_b[12][0] = uu.a(var2, (byte) -105);
            break L190;
          } else {
            break L190;
          }
        }
        L191: {
          var2 = fk.a(false, "instructions_titles,14,0");
          if (var2 == null) {
            break L191;
          } else {
            up.field_b[14][0] = uu.a(var2, (byte) -112);
            break L191;
          }
        }
        L192: {
          var2 = fk.a(false, "instructions_titles,15,0");
          if (null != var2) {
            up.field_b[15][0] = uu.a(var2, (byte) 124);
            break L192;
          } else {
            break L192;
          }
        }
        L193: {
          var2 = fk.a(false, "instructions_titles,16,0");
          if (null != var2) {
            up.field_b[16][0] = uu.a(var2, (byte) 8);
            break L193;
          } else {
            break L193;
          }
        }
        L194: {
          var2 = fk.a(false, "instructions_subtitles,0,0,0");
          if (null != var2) {
            up.field_g[0][0][0] = uu.a(var2, (byte) 7);
            break L194;
          } else {
            break L194;
          }
        }
        L195: {
          var2 = fk.a(false, "instructions_subtitles,6,0,1");
          if (var2 == null) {
            break L195;
          } else {
            up.field_g[6][0][1] = uu.a(var2, (byte) -103);
            break L195;
          }
        }
        L196: {
          var2 = fk.a(false, "instructions_subtitles,6,0,2");
          if (null == var2) {
            break L196;
          } else {
            up.field_g[6][0][2] = uu.a(var2, (byte) 98);
            break L196;
          }
        }
        L197: {
          var2 = fk.a(false, "instructions_subtitles,6,0,3");
          if (null != var2) {
            up.field_g[6][0][3] = uu.a(var2, (byte) 13);
            break L197;
          } else {
            break L197;
          }
        }
        L198: {
          var2 = fk.a(false, "instructions_subtitles,7,0,1");
          if (null != var2) {
            up.field_g[7][0][1] = uu.a(var2, (byte) -103);
            break L198;
          } else {
            break L198;
          }
        }
        L199: {
          var2 = fk.a(false, "instructions_subtitles,7,0,2");
          if (null == var2) {
            break L199;
          } else {
            up.field_g[7][0][2] = uu.a(var2, (byte) -114);
            break L199;
          }
        }
        L200: {
          var2 = fk.a(false, "instructions_subtitles,7,0,3");
          if (null != var2) {
            up.field_g[7][0][3] = uu.a(var2, (byte) 75);
            break L200;
          } else {
            break L200;
          }
        }
        L201: {
          var2 = fk.a(false, "instructions_subtitles,8,0,3");
          if (var2 == null) {
            break L201;
          } else {
            up.field_g[8][0][3] = uu.a(var2, (byte) -100);
            break L201;
          }
        }
        L202: {
          var2 = fk.a(false, "instructions_subtitles,9,0,1");
          if (null == var2) {
            break L202;
          } else {
            up.field_g[9][0][1] = uu.a(var2, (byte) -99);
            break L202;
          }
        }
        L203: {
          var2 = fk.a(false, "instructions_subtitles,9,0,2");
          if (var2 != null) {
            up.field_g[9][0][2] = uu.a(var2, (byte) -117);
            break L203;
          } else {
            break L203;
          }
        }
        L204: {
          var2 = fk.a(false, "instructions_subtitles,9,0,3");
          if (var2 == null) {
            break L204;
          } else {
            up.field_g[9][0][3] = uu.a(var2, (byte) -118);
            break L204;
          }
        }
        L205: {
          var2 = fk.a(false, "instructions_subtitles,9,0,4");
          if (null != var2) {
            up.field_g[9][0][4] = uu.a(var2, (byte) 20);
            break L205;
          } else {
            break L205;
          }
        }
        L206: {
          var2 = fk.a(false, "instructions_subtitles,11,0,1");
          if (null != var2) {
            up.field_g[11][0][1] = uu.a(var2, (byte) 59);
            break L206;
          } else {
            break L206;
          }
        }
        L207: {
          var2 = fk.a(false, "instructions_subtitles,11,0,2");
          if (var2 == null) {
            break L207;
          } else {
            up.field_g[11][0][2] = uu.a(var2, (byte) -123);
            break L207;
          }
        }
        L208: {
          var2 = fk.a(false, "instructions_subtitles,11,0,3");
          if (null != var2) {
            up.field_g[11][0][3] = uu.a(var2, (byte) -120);
            break L208;
          } else {
            break L208;
          }
        }
        L209: {
          var2 = fk.a(false, "instructions_subtitles,14,0,0");
          if (null != var2) {
            up.field_g[14][0][0] = uu.a(var2, (byte) -121);
            break L209;
          } else {
            break L209;
          }
        }
        L210: {
          var2 = fk.a(false, "instructions_subtitles,14,0,1");
          if (null == var2) {
            break L210;
          } else {
            up.field_g[14][0][1] = uu.a(var2, (byte) -95);
            break L210;
          }
        }
        L211: {
          var2 = fk.a(false, "instructions_subtitles,14,0,2");
          if (null == var2) {
            break L211;
          } else {
            up.field_g[14][0][2] = uu.a(var2, (byte) 27);
            break L211;
          }
        }
        L212: {
          var2 = fk.a(false, "instructions_paragraphs,0,0,1,0");
          if (var2 == null) {
            break L212;
          } else {
            up.field_c[0][0][1][0] = uu.a(var2, (byte) -124);
            break L212;
          }
        }
        L213: {
          var2 = fk.a(false, "instructions_paragraphs,0,0,2,0");
          if (var2 == null) {
            break L213;
          } else {
            up.field_c[0][0][2][0] = uu.a(var2, (byte) 46);
            break L213;
          }
        }
        L214: {
          var2 = fk.a(false, "instructions_paragraphs,0,0,3,0");
          if (var2 != null) {
            up.field_c[0][0][3][0] = uu.a(var2, (byte) -112);
            break L214;
          } else {
            break L214;
          }
        }
        L215: {
          var2 = fk.a(false, "instructions_paragraphs,1,0,0,0");
          if (var2 == null) {
            break L215;
          } else {
            up.field_c[1][0][0][0] = uu.a(var2, (byte) -119);
            break L215;
          }
        }
        L216: {
          var2 = fk.a(false, "instructions_paragraphs,1,0,1,0");
          if (var2 == null) {
            break L216;
          } else {
            up.field_c[1][0][1][0] = uu.a(var2, (byte) 19);
            break L216;
          }
        }
        L217: {
          var2 = fk.a(false, "instructions_paragraphs,1,0,2,0");
          if (var2 != null) {
            up.field_c[1][0][2][0] = uu.a(var2, (byte) -97);
            break L217;
          } else {
            break L217;
          }
        }
        L218: {
          var2 = fk.a(false, "instructions_paragraphs,1,0,3,0");
          if (var2 == null) {
            break L218;
          } else {
            up.field_c[1][0][3][0] = uu.a(var2, (byte) -110);
            break L218;
          }
        }
        L219: {
          var2 = fk.a(false, "instructions_paragraphs,2,0,0,0");
          if (null != var2) {
            up.field_c[2][0][0][0] = uu.a(var2, (byte) -93);
            break L219;
          } else {
            break L219;
          }
        }
        L220: {
          var2 = fk.a(false, "instructions_paragraphs,2,0,1,0");
          if (var2 != null) {
            up.field_c[2][0][1][0] = uu.a(var2, (byte) 88);
            break L220;
          } else {
            break L220;
          }
        }
        L221: {
          var2 = fk.a(false, "instructions_paragraphs,2,0,2,0");
          if (var2 != null) {
            up.field_c[2][0][2][0] = uu.a(var2, (byte) -95);
            break L221;
          } else {
            break L221;
          }
        }
        L222: {
          var2 = fk.a(false, "instructions_paragraphs,3,0,0,0");
          if (var2 == null) {
            break L222;
          } else {
            up.field_c[3][0][0][0] = uu.a(var2, (byte) -112);
            break L222;
          }
        }
        L223: {
          var2 = fk.a(false, "instructions_paragraphs,3,0,1,0");
          if (var2 == null) {
            break L223;
          } else {
            up.field_c[3][0][1][0] = uu.a(var2, (byte) 15);
            break L223;
          }
        }
        L224: {
          var2 = fk.a(false, "instructions_paragraphs,3,0,2,0");
          if (var2 != null) {
            up.field_c[3][0][2][0] = uu.a(var2, (byte) 114);
            break L224;
          } else {
            break L224;
          }
        }
        L225: {
          var2 = fk.a(false, "instructions_paragraphs,3,0,3,0");
          if (var2 == null) {
            break L225;
          } else {
            up.field_c[3][0][3][0] = uu.a(var2, (byte) 101);
            break L225;
          }
        }
        L226: {
          var2 = fk.a(false, "instructions_paragraphs,3,0,4,0");
          if (null == var2) {
            break L226;
          } else {
            up.field_c[3][0][4][0] = uu.a(var2, (byte) 111);
            break L226;
          }
        }
        L227: {
          var2 = fk.a(false, "instructions_paragraphs,4,0,0,0");
          if (null != var2) {
            up.field_c[4][0][0][0] = uu.a(var2, (byte) 81);
            break L227;
          } else {
            break L227;
          }
        }
        L228: {
          var2 = fk.a(false, "instructions_paragraphs,4,0,1,0");
          if (null == var2) {
            break L228;
          } else {
            up.field_c[4][0][1][0] = uu.a(var2, (byte) -99);
            break L228;
          }
        }
        L229: {
          var2 = fk.a(false, "instructions_paragraphs,4,0,2,0");
          if (null == var2) {
            break L229;
          } else {
            up.field_c[4][0][2][0] = uu.a(var2, (byte) 75);
            break L229;
          }
        }
        L230: {
          var2 = fk.a(false, "instructions_paragraphs,4,0,3,0");
          if (null == var2) {
            break L230;
          } else {
            up.field_c[4][0][3][0] = uu.a(var2, (byte) -99);
            break L230;
          }
        }
        L231: {
          var2 = fk.a(false, "instructions_paragraphs,4,0,4,0");
          if (null != var2) {
            up.field_c[4][0][4][0] = uu.a(var2, (byte) -117);
            break L231;
          } else {
            break L231;
          }
        }
        L232: {
          var2 = fk.a(false, "instructions_paragraphs,5,0,0,0");
          if (null == var2) {
            break L232;
          } else {
            up.field_c[5][0][0][0] = uu.a(var2, (byte) -115);
            break L232;
          }
        }
        L233: {
          var2 = fk.a(false, "instructions_paragraphs,5,0,1,0");
          if (var2 == null) {
            break L233;
          } else {
            up.field_c[5][0][1][0] = uu.a(var2, (byte) -99);
            break L233;
          }
        }
        L234: {
          var2 = fk.a(false, "instructions_paragraphs,5,0,2,0");
          if (null != var2) {
            up.field_c[5][0][2][0] = uu.a(var2, (byte) -95);
            break L234;
          } else {
            break L234;
          }
        }
        L235: {
          var2 = fk.a(false, "instructions_paragraphs,5,0,5,0");
          if (null == var2) {
            break L235;
          } else {
            up.field_c[5][0][5][0] = uu.a(var2, (byte) 84);
            break L235;
          }
        }
        L236: {
          var2 = fk.a(false, "instructions_paragraphs,6,0,0,0");
          if (null == var2) {
            break L236;
          } else {
            up.field_c[6][0][0][0] = uu.a(var2, (byte) 32);
            break L236;
          }
        }
        L237: {
          var2 = fk.a(false, "instructions_paragraphs,6,0,4,0");
          if (var2 != null) {
            up.field_c[6][0][4][0] = uu.a(var2, (byte) 111);
            break L237;
          } else {
            break L237;
          }
        }
        L238: {
          var2 = fk.a(false, "instructions_paragraphs,6,0,5,0");
          if (var2 != null) {
            up.field_c[6][0][5][0] = uu.a(var2, (byte) 42);
            break L238;
          } else {
            break L238;
          }
        }
        L239: {
          var2 = fk.a(false, "instructions_paragraphs,7,0,0,0");
          if (null == var2) {
            break L239;
          } else {
            up.field_c[7][0][0][0] = uu.a(var2, (byte) -92);
            break L239;
          }
        }
        L240: {
          var2 = fk.a(false, "instructions_paragraphs,7,0,4,0");
          if (null == var2) {
            break L240;
          } else {
            up.field_c[7][0][4][0] = uu.a(var2, (byte) -117);
            break L240;
          }
        }
        L241: {
          var2 = fk.a(false, "instructions_paragraphs,8,0,0,0");
          if (null != var2) {
            up.field_c[8][0][0][0] = uu.a(var2, (byte) 67);
            break L241;
          } else {
            break L241;
          }
        }
        L242: {
          var2 = fk.a(false, "instructions_paragraphs,8,0,1,0");
          if (null == var2) {
            break L242;
          } else {
            up.field_c[8][0][1][0] = uu.a(var2, (byte) 8);
            break L242;
          }
        }
        L243: {
          var2 = fk.a(false, "instructions_paragraphs,8,0,2,0");
          if (var2 == null) {
            break L243;
          } else {
            up.field_c[8][0][2][0] = uu.a(var2, (byte) -127);
            break L243;
          }
        }
        L244: {
          var2 = fk.a(false, "instructions_paragraphs,9,0,0,0");
          if (null != var2) {
            up.field_c[9][0][0][0] = uu.a(var2, (byte) -124);
            break L244;
          } else {
            break L244;
          }
        }
        L245: {
          var2 = fk.a(false, "instructions_paragraphs,9,1,0,0");
          if (null == var2) {
            break L245;
          } else {
            up.field_c[9][1][0][0] = uu.a(var2, (byte) -112);
            break L245;
          }
        }
        L246: {
          var2 = fk.a(false, "instructions_paragraphs,9,1,1,0");
          if (null != var2) {
            up.field_c[9][1][1][0] = uu.a(var2, (byte) 75);
            break L246;
          } else {
            break L246;
          }
        }
        L247: {
          var2 = fk.a(false, "instructions_paragraphs,9,1,2,0");
          if (var2 == null) {
            break L247;
          } else {
            up.field_c[9][1][2][0] = uu.a(var2, (byte) -109);
            break L247;
          }
        }
        L248: {
          var2 = fk.a(false, "instructions_paragraphs,9,1,3,0");
          if (null == var2) {
            break L248;
          } else {
            up.field_c[9][1][3][0] = uu.a(var2, (byte) 33);
            break L248;
          }
        }
        L249: {
          var2 = fk.a(false, "instructions_paragraphs,10,0,0,0");
          if (var2 != null) {
            up.field_c[10][0][0][0] = uu.a(var2, (byte) -118);
            break L249;
          } else {
            break L249;
          }
        }
        L250: {
          var2 = fk.a(false, "instructions_paragraphs,10,0,1,0");
          if (null == var2) {
            break L250;
          } else {
            up.field_c[10][0][1][0] = uu.a(var2, (byte) -104);
            break L250;
          }
        }
        L251: {
          var2 = fk.a(false, "instructions_paragraphs,10,0,2,0");
          if (null != var2) {
            up.field_c[10][0][2][0] = uu.a(var2, (byte) -96);
            break L251;
          } else {
            break L251;
          }
        }
        L252: {
          var2 = fk.a(false, "instructions_paragraphs,10,0,3,0");
          if (null == var2) {
            break L252;
          } else {
            up.field_c[10][0][3][0] = uu.a(var2, (byte) -114);
            break L252;
          }
        }
        L253: {
          var2 = fk.a(false, "instructions_paragraphs,10,0,4,0");
          if (var2 == null) {
            break L253;
          } else {
            up.field_c[10][0][4][0] = uu.a(var2, (byte) -115);
            break L253;
          }
        }
        L254: {
          var2 = fk.a(false, "instructions_paragraphs,10,0,5,0");
          if (var2 == null) {
            break L254;
          } else {
            up.field_c[10][0][5][0] = uu.a(var2, (byte) 29);
            break L254;
          }
        }
        L255: {
          var2 = fk.a(false, "instructions_paragraphs,11,0,0,0");
          if (null == var2) {
            break L255;
          } else {
            up.field_c[11][0][0][0] = uu.a(var2, (byte) -107);
            break L255;
          }
        }
        L256: {
          var2 = fk.a(false, "instructions_paragraphs,11,0,4,0");
          if (null == var2) {
            break L256;
          } else {
            up.field_c[11][0][4][0] = uu.a(var2, (byte) 63);
            break L256;
          }
        }
        L257: {
          var2 = fk.a(false, "instructions_paragraphs,11,0,5,0");
          if (null == var2) {
            break L257;
          } else {
            up.field_c[11][0][5][0] = uu.a(var2, (byte) 25);
            break L257;
          }
        }
        L258: {
          var2 = fk.a(false, "instructions_paragraphs,11,0,6,0");
          if (null != var2) {
            up.field_c[11][0][6][0] = uu.a(var2, (byte) -92);
            break L258;
          } else {
            break L258;
          }
        }
        L259: {
          var2 = fk.a(false, "instructions_paragraphs,12,0,0,0");
          if (var2 == null) {
            break L259;
          } else {
            up.field_c[12][0][0][0] = uu.a(var2, (byte) -104);
            break L259;
          }
        }
        L260: {
          var2 = fk.a(false, "instructions_paragraphs,12,0,1,0");
          if (var2 == null) {
            break L260;
          } else {
            up.field_c[12][0][1][0] = uu.a(var2, (byte) 124);
            break L260;
          }
        }
        L261: {
          var2 = fk.a(false, "instructions_paragraphs,12,0,2,0");
          if (null != var2) {
            up.field_c[12][0][2][0] = uu.a(var2, (byte) -106);
            break L261;
          } else {
            break L261;
          }
        }
        L262: {
          var2 = fk.a(false, "instructions_paragraphs,12,0,3,0");
          if (null == var2) {
            break L262;
          } else {
            up.field_c[12][0][3][0] = uu.a(var2, (byte) -93);
            break L262;
          }
        }
        L263: {
          var2 = fk.a(false, "instructions_paragraphs,13,0,0,0");
          if (null == var2) {
            break L263;
          } else {
            up.field_c[13][0][0][0] = uu.a(var2, (byte) 103);
            break L263;
          }
        }
        L264: {
          var2 = fk.a(false, "instructions_paragraphs,13,0,1,0");
          if (var2 == null) {
            break L264;
          } else {
            up.field_c[13][0][1][0] = uu.a(var2, (byte) -121);
            break L264;
          }
        }
        L265: {
          var2 = fk.a(false, "instructions_paragraphs,13,0,2,0");
          if (var2 == null) {
            break L265;
          } else {
            up.field_c[13][0][2][0] = uu.a(var2, (byte) 56);
            break L265;
          }
        }
        L266: {
          var2 = fk.a(false, "instructions_paragraphs,13,0,3,0");
          if (var2 != null) {
            up.field_c[13][0][3][0] = uu.a(var2, (byte) 66);
            break L266;
          } else {
            break L266;
          }
        }
        L267: {
          var2 = fk.a(false, "instructions_paragraphs,14,0,0,0");
          if (null != var2) {
            up.field_c[14][0][0][0] = uu.a(var2, (byte) -125);
            break L267;
          } else {
            break L267;
          }
        }
        L268: {
          var2 = fk.a(false, "instructions_paragraphs,14,0,1,0");
          if (var2 != null) {
            up.field_c[14][0][1][0] = uu.a(var2, (byte) 110);
            break L268;
          } else {
            break L268;
          }
        }
        L269: {
          var2 = fk.a(false, "instructions_paragraphs,14,0,2,0");
          if (null == var2) {
            break L269;
          } else {
            up.field_c[14][0][2][0] = uu.a(var2, (byte) -111);
            break L269;
          }
        }
        L270: {
          var2 = fk.a(false, "instructions_paragraphs,15,0,0,0");
          if (var2 != null) {
            up.field_c[15][0][0][0] = uu.a(var2, (byte) -97);
            break L270;
          } else {
            break L270;
          }
        }
        L271: {
          var2 = fk.a(false, "instructions_paragraphs,15,0,1,0");
          if (var2 != null) {
            up.field_c[15][0][1][0] = uu.a(var2, (byte) -99);
            break L271;
          } else {
            break L271;
          }
        }
        L272: {
          var2 = fk.a(false, "instructions_paragraphs,15,0,2,0");
          if (null == var2) {
            break L272;
          } else {
            up.field_c[15][0][2][0] = uu.a(var2, (byte) -122);
            break L272;
          }
        }
        L273: {
          var2 = fk.a(false, "instructions_paragraphs,15,0,3,0");
          if (null == var2) {
            break L273;
          } else {
            up.field_c[15][0][3][0] = uu.a(var2, (byte) 41);
            break L273;
          }
        }
        L274: {
          var2 = fk.a(false, "instructions_paragraphs,16,0,0,0");
          if (null != var2) {
            up.field_c[16][0][0][0] = uu.a(var2, (byte) 72);
            break L274;
          } else {
            break L274;
          }
        }
        L275: {
          var2 = fk.a(false, "instructions_paragraphs,16,0,1,0");
          if (var2 != null) {
            up.field_c[16][0][1][0] = uu.a(var2, (byte) -108);
            break L275;
          } else {
            break L275;
          }
        }
        L276: {
          var2 = fk.a(false, "instructions_paragraphs,16,0,2,0");
          if (var2 == null) {
            break L276;
          } else {
            up.field_c[16][0][2][0] = uu.a(var2, (byte) 71);
            break L276;
          }
        }
        L277: {
          var2 = fk.a(false, "instructions_paragraphs,16,0,3,0");
          if (var2 != null) {
            up.field_c[16][0][3][0] = uu.a(var2, (byte) -98);
            break L277;
          } else {
            break L277;
          }
        }
        L278: {
          var2 = fk.a(false, "TEXT_SKIP");
          if (var2 != null) {
            field_c = uu.a(var2, (byte) 33);
            break L278;
          } else {
            break L278;
          }
        }
        L279: {
          var2 = fk.a(false, "LABEL_AWARD_BUILDINGS");
          if (null != var2) {
            tg.field_l = uu.a(var2, (byte) -100);
            break L279;
          } else {
            break L279;
          }
        }
        L280: {
          var2 = fk.a(false, "LABEL_AWARD_FIRSTTOWERS");
          if (var2 != null) {
            gk.field_N = uu.a(var2, (byte) 59);
            break L280;
          } else {
            break L280;
          }
        }
        L281: {
          var2 = fk.a(false, "LABEL_AWARD_FIRSTHOUSES");
          if (null != var2) {
            tv.field_c = uu.a(var2, (byte) -93);
            break L281;
          } else {
            break L281;
          }
        }
        L282: {
          var2 = fk.a(false, "LABEL_AWARD_FIRSTPORTALS");
          if (null == var2) {
            break L282;
          } else {
            tv.field_b = uu.a(var2, (byte) 85);
            break L282;
          }
        }
        L283: {
          var2 = fk.a(false, "LABEL_AWARD_KILLS");
          if (null != var2) {
            vn.field_g = uu.a(var2, (byte) -102);
            break L283;
          } else {
            break L283;
          }
        }
        L284: {
          var2 = fk.a(false, "LABEL_AWARD_SUMMONS");
          if (null != var2) {
            dn.field_Kb = uu.a(var2, (byte) 28);
            break L284;
          } else {
            break L284;
          }
        }
        L285: {
          var2 = fk.a(false, "LABEL_AWARD_UNITBEATUP");
          if (null == var2) {
            break L285;
          } else {
            qu.field_r = uu.a(var2, (byte) 38);
            break L285;
          }
        }
        L286: {
          var2 = fk.a(false, "LABEL_AWARD_UNITBULLY");
          if (null == var2) {
            break L286;
          } else {
            r.field_I = uu.a(var2, (byte) 122);
            break L286;
          }
        }
        L287: {
          var2 = fk.a(false, "LABEL_AWARD_UNITTOUGHEST");
          if (null != var2) {
            we.field_h = uu.a(var2, (byte) 115);
            break L287;
          } else {
            break L287;
          }
        }
        L288: {
          var2 = fk.a(false, "LABEL_AWARD_KBDSUMMONER");
          if (null == var2) {
            break L288;
          } else {
            kd.field_Q = uu.a(var2, (byte) 54);
            break L288;
          }
        }
        L289: {
          var2 = fk.a(false, "LABEL_AWARD_MANASPEND");
          if (var2 != null) {
            og.field_t = uu.a(var2, (byte) 103);
            break L289;
          } else {
            break L289;
          }
        }
        L290: {
          var2 = fk.a(false, "LABEL_AWARD_HEALTHLOST");
          if (null == var2) {
            break L290;
          } else {
            mg.field_c = uu.a(var2, (byte) -119);
            break L290;
          }
        }
        L291: {
          var2 = fk.a(false, "LABEL_AWARD_HEALTHGAINED");
          if (null == var2) {
            break L291;
          } else {
            fg.field_l = uu.a(var2, (byte) -107);
            break L291;
          }
        }
        L292: {
          var2 = fk.a(false, "LABEL_AWARD_MOSTUNITS");
          if (null != var2) {
            pi.field_P = uu.a(var2, (byte) 5);
            break L292;
          } else {
            break L292;
          }
        }
        L293: {
          var2 = fk.a(false, "LABEL_AWARD_MOSTHONOURABLE");
          if (var2 == null) {
            break L293;
          } else {
            qq.field_H = uu.a(var2, (byte) 85);
            break L293;
          }
        }
        L294: {
          var2 = fk.a(false, "LABEL_AWARD_MOSTCRUEL");
          if (null != var2) {
            ut.field_ib = uu.a(var2, (byte) 63);
            break L294;
          } else {
            break L294;
          }
        }
        L295: {
          var2 = fk.a(false, "BONUS_MANA_DESCRIPTION");
          if (null == var2) {
            break L295;
          } else {
            hw.field_D = uu.a(var2, (byte) -94);
            break L295;
          }
        }
        L296: {
          var2 = fk.a(false, "BONUS_MANA_TITLE");
          if (var2 == null) {
            break L296;
          } else {
            hf.field_b = uu.a(var2, (byte) -97);
            break L296;
          }
        }
        L297: {
          var2 = fk.a(false, "DIFFICULTY");
          if (null == var2) {
            break L297;
          } else {
            k.field_b = uu.a(var2, (byte) 66);
            break L297;
          }
        }
        L298: {
          var2 = fk.a(false, "BESTSCORE");
          if (null == var2) {
            break L298;
          } else {
            uh.field_c = uu.a(var2, (byte) 100);
            break L298;
          }
        }
        L299: {
          var2 = fk.a(false, "START_MISSION");
          if (var2 == null) {
            break L299;
          } else {
            ul.field_j = uu.a(var2, (byte) 108);
            break L299;
          }
        }
        L300: {
          var2 = fk.a(false, "REPLAY_MISSION");
          if (var2 != null) {
            pn.field_k = uu.a(var2, (byte) -109);
            break L300;
          } else {
            break L300;
          }
        }
        L301: {
          var2 = fk.a(false, "REWARD");
          if (null != var2) {
            ft.field_l = uu.a(var2, (byte) -114);
            break L301;
          } else {
            break L301;
          }
        }
        L302: {
          var2 = fk.a(false, "REWARD_TITLE");
          if (null != var2) {
            rk.field_gb = uu.a(var2, (byte) -124);
            break L302;
          } else {
            break L302;
          }
        }
        L303: {
          var2 = fk.a(false, "QUICKSAVE_TITLE");
          if (var2 != null) {
            be.field_A = uu.a(var2, (byte) -119);
            break L303;
          } else {
            break L303;
          }
        }
        L304: {
          var2 = fk.a(false, "QUICKSAVE_PROGRESS");
          if (var2 == null) {
            break L304;
          } else {
            wd.field_e = uu.a(var2, (byte) -113);
            break L304;
          }
        }
        L305: {
          var2 = fk.a(false, "QUICKSAVING");
          if (var2 == null) {
            break L305;
          } else {
            vh.field_p = uu.a(var2, (byte) -125);
            break L305;
          }
        }
        L306: {
          var2 = fk.a(false, "SAVE_AND_QUIT");
          if (null == var2) {
            break L306;
          } else {
            jn.field_a = uu.a(var2, (byte) -110);
            break L306;
          }
        }
        L307: {
          var2 = fk.a(false, "PLAY_CAMPAIGN");
          if (null == var2) {
            break L307;
          } else {
            io.field_o = uu.a(var2, (byte) 111);
            break L307;
          }
        }
        L308: {
          var2 = fk.a(false, "LOAD_QUICKSAVE");
          if (var2 != null) {
            es.field_b = uu.a(var2, (byte) 87);
            break L308;
          } else {
            break L308;
          }
        }
        L309: {
          var2 = fk.a(false, "COMING_SOON");
          if (null == var2) {
            break L309;
          } else {
            String discarded$16 = uu.a(var2, (byte) 43);
            break L309;
          }
        }
        L310: {
          var2 = fk.a(false, "CAMPAIGNS");
          if (var2 == null) {
            break L310;
          } else {
            ai.field_V = uu.a(var2, (byte) -106);
            break L310;
          }
        }
        L311: {
          var2 = fk.a(false, "BACK");
          if (null == var2) {
            break L311;
          } else {
            lb.field_c = uu.a(var2, (byte) -125);
            break L311;
          }
        }
        L312: {
          var2 = fk.a(false, "INPROGRESS");
          if (var2 == null) {
            break L312;
          } else {
            qf.field_a = uu.a(var2, (byte) 97);
            break L312;
          }
        }
        L313: {
          var2 = fk.a(false, "OVERWRITE");
          if (var2 != null) {
            hi.field_h = uu.a(var2, (byte) -106);
            break L313;
          } else {
            break L313;
          }
        }
        L314: {
          var2 = fk.a(false, "HAVEONGOINGMISSION");
          if (null == var2) {
            break L314;
          } else {
            sb.field_f = uu.a(var2, (byte) 30);
            break L314;
          }
        }
        L315: {
          var2 = fk.a(false, "CONTINUEMISSION");
          if (var2 == null) {
            break L315;
          } else {
            kd.field_Y = uu.a(var2, (byte) -96);
            break L315;
          }
        }
        L316: {
          var2 = fk.a(false, "RESTARTMISSION");
          if (null == var2) {
            break L316;
          } else {
            vh.field_r = uu.a(var2, (byte) 66);
            break L316;
          }
        }
        L317: {
          var2 = fk.a(false, "STALEMATEWARNIGN");
          if (null == var2) {
            break L317;
          } else {
            jc.field_x = uu.a(var2, (byte) 33);
            break L317;
          }
        }
        L318: {
          var2 = fk.a(false, "mapsizes,0");
          if (var2 == null) {
            break L318;
          } else {
            h.field_e[0] = uu.a(var2, (byte) 64);
            break L318;
          }
        }
        L319: {
          var2 = fk.a(false, "mapsizes,1");
          if (var2 == null) {
            break L319;
          } else {
            h.field_e[1] = uu.a(var2, (byte) 16);
            break L319;
          }
        }
        L320: {
          var2 = fk.a(false, "mapsizes,2");
          if (null != var2) {
            h.field_e[2] = uu.a(var2, (byte) 87);
            break L320;
          } else {
            break L320;
          }
        }
        L321: {
          var2 = fk.a(false, "mapsizes,3");
          if (var2 == null) {
            break L321;
          } else {
            h.field_e[3] = uu.a(var2, (byte) -119);
            break L321;
          }
        }
        L322: {
          var2 = fk.a(false, "godnames,0");
          if (null != var2) {
            wf.field_q[0] = uu.a(var2, (byte) 5);
            break L322;
          } else {
            break L322;
          }
        }
        L323: {
          var2 = fk.a(false, "godnames,1");
          if (null == var2) {
            break L323;
          } else {
            wf.field_q[1] = uu.a(var2, (byte) -108);
            break L323;
          }
        }
        L324: {
          var2 = fk.a(false, "godnames,2");
          if (null == var2) {
            break L324;
          } else {
            wf.field_q[2] = uu.a(var2, (byte) 99);
            break L324;
          }
        }
        L325: {
          var2 = fk.a(false, "godnames,3");
          if (null == var2) {
            break L325;
          } else {
            wf.field_q[3] = uu.a(var2, (byte) 114);
            break L325;
          }
        }
        L326: {
          var2 = fk.a(false, "godnames,4");
          if (var2 == null) {
            break L326;
          } else {
            wf.field_q[4] = uu.a(var2, (byte) -128);
            break L326;
          }
        }
        L327: {
          var2 = fk.a(false, "godnames,5");
          if (var2 != null) {
            wf.field_q[5] = uu.a(var2, (byte) 10);
            break L327;
          } else {
            break L327;
          }
        }
        L328: {
          var2 = fk.a(false, "godnames,6");
          if (var2 == null) {
            break L328;
          } else {
            wf.field_q[6] = uu.a(var2, (byte) 121);
            break L328;
          }
        }
        L329: {
          var2 = fk.a(false, "goddescriptions,0");
          if (var2 == null) {
            break L329;
          } else {
            al.field_l[0] = uu.a(var2, (byte) 22);
            break L329;
          }
        }
        L330: {
          var2 = fk.a(false, "goddescriptions,1");
          if (var2 == null) {
            break L330;
          } else {
            al.field_l[1] = uu.a(var2, (byte) 60);
            break L330;
          }
        }
        L331: {
          var2 = fk.a(false, "goddescriptions,2");
          if (null != var2) {
            al.field_l[2] = uu.a(var2, (byte) 6);
            break L331;
          } else {
            break L331;
          }
        }
        L332: {
          var2 = fk.a(false, "goddescriptions,3");
          if (var2 == null) {
            break L332;
          } else {
            al.field_l[3] = uu.a(var2, (byte) -125);
            break L332;
          }
        }
        L333: {
          var2 = fk.a(false, "goddescriptions,4");
          if (var2 == null) {
            break L333;
          } else {
            al.field_l[4] = uu.a(var2, (byte) -120);
            break L333;
          }
        }
        L334: {
          var2 = fk.a(false, "goddescriptions,5");
          if (var2 != null) {
            al.field_l[5] = uu.a(var2, (byte) -121);
            break L334;
          } else {
            break L334;
          }
        }
        L335: {
          var2 = fk.a(false, "goddescriptions,6");
          if (var2 != null) {
            al.field_l[6] = uu.a(var2, (byte) 41);
            break L335;
          } else {
            break L335;
          }
        }
        L336: {
          var2 = fk.a(false, "ACTION_VINE");
          if (null != var2) {
            fn.field_S = uu.a(var2, (byte) -111);
            break L336;
          } else {
            break L336;
          }
        }
        L337: {
          var2 = fk.a(false, "ACTION_CANNON");
          if (null == var2) {
            break L337;
          } else {
            lq.field_f = uu.a(var2, (byte) -106);
            break L337;
          }
        }
        L338: {
          var2 = fk.a(false, "ACTION_PRIEST");
          if (null == var2) {
            break L338;
          } else {
            de.field_b = uu.a(var2, (byte) 23);
            break L338;
          }
        }
        L339: {
          var2 = fk.a(false, "ACTION_BARRIER");
          if (var2 != null) {
            aj.field_p = uu.a(var2, (byte) -97);
            break L339;
          } else {
            break L339;
          }
        }
        L340: {
          var2 = fk.a(false, "ACTION_PORTAL");
          if (var2 == null) {
            break L340;
          } else {
            uf.field_g = uu.a(var2, (byte) 88);
            break L340;
          }
        }
        L341: {
          var2 = fk.a(false, "ACTION_SPHINX");
          if (null != var2) {
            np.field_Ob = uu.a(var2, (byte) 70);
            break L341;
          } else {
            break L341;
          }
        }
        L342: {
          var2 = fk.a(false, "ACTION_PORTALMAGE");
          if (var2 == null) {
            break L342;
          } else {
            fp.field_Ib = uu.a(var2, (byte) 76);
            break L342;
          }
        }
        L343: {
          var2 = fk.a(false, "ACTION_MOVE");
          if (var2 != null) {
            wn.field_gb = uu.a(var2, (byte) -102);
            break L343;
          } else {
            break L343;
          }
        }
        L344: {
          var2 = fk.a(false, "ACTION_TOOFAR");
          if (var2 == null) {
            break L344;
          } else {
            fo.field_a = uu.a(var2, (byte) -106);
            break L344;
          }
        }
        L345: {
          var2 = fk.a(false, "ACTION_ATTACK");
          if (null != var2) {
            wf.field_A = uu.a(var2, (byte) -114);
            break L345;
          } else {
            break L345;
          }
        }
        L346: {
          var2 = fk.a(false, "ACTION_NEEDMOVEFIRST");
          if (null == var2) {
            break L346;
          } else {
            op.field_g = uu.a(var2, (byte) 40);
            break L346;
          }
        }
        L347: {
          var2 = fk.a(false, "ACTION_NOATTACK");
          if (var2 != null) {
            ui.field_a = uu.a(var2, (byte) 94);
            break L347;
          } else {
            break L347;
          }
        }
        L348: {
          var2 = fk.a(false, "ACTION_SUMMON");
          if (null == var2) {
            break L348;
          } else {
            ub.field_a = uu.a(var2, (byte) 45);
            break L348;
          }
        }
        L349: {
          var2 = fk.a(false, "ACTION_TIRED");
          if (null == var2) {
            break L349;
          } else {
            j.field_d = uu.a(var2, (byte) -126);
            break L349;
          }
        }
        L350: {
          var2 = fk.a(false, "ACTION_NONE");
          if (null != var2) {
            kv.field_J = uu.a(var2, (byte) 34);
            break L350;
          } else {
            break L350;
          }
        }
        L351: {
          var2 = fk.a(false, "ACTION_NOTYOURS");
          if (null != var2) {
            si.field_a = uu.a(var2, (byte) 77);
            break L351;
          } else {
            break L351;
          }
        }
        L352: {
          var2 = fk.a(false, "ACTION_FIXED");
          if (null != var2) {
            ui.field_k = uu.a(var2, (byte) -97);
            break L352;
          } else {
            break L352;
          }
        }
        L353: {
          var2 = fk.a(false, "WRONG_GROUND_PORTAL");
          if (var2 != null) {
            ao.field_x = uu.a(var2, (byte) -120);
            break L353;
          } else {
            break L353;
          }
        }
        L354: {
          var2 = fk.a(false, "WRONG_GROUND_CANNON");
          if (null == var2) {
            break L354;
          } else {
            jv.field_e = uu.a(var2, (byte) -93);
            break L354;
          }
        }
        L355: {
          var2 = fk.a(false, "GROUND_TIP_PORTAL");
          if (var2 != null) {
            wp.field_F = uu.a(var2, (byte) -102);
            break L355;
          } else {
            break L355;
          }
        }
        L356: {
          var2 = fk.a(false, "GROUND_TIP_TOWER");
          if (var2 != null) {
            og.field_n = uu.a(var2, (byte) 47);
            break L356;
          } else {
            break L356;
          }
        }
        L357: {
          var2 = fk.a(false, "GROUND_TIP_TEMPLE");
          if (null != var2) {
            dg.field_a = uu.a(var2, (byte) -124);
            break L357;
          } else {
            break L357;
          }
        }
        L358: {
          var2 = fk.a(false, "GROUND_TIP_VILLAGE");
          if (var2 == null) {
            break L358;
          } else {
            on.field_p = uu.a(var2, (byte) 60);
            break L358;
          }
        }
        L359: {
          var2 = fk.a(false, "EMPTY_TILE_ERROR");
          if (null != var2) {
            ij.field_A = uu.a(var2, (byte) -108);
            break L359;
          } else {
            break L359;
          }
        }
        L360: {
          var2 = fk.a(false, "STATUS_NORANGE");
          if (var2 == null) {
            break L360;
          } else {
            String discarded$17 = uu.a(var2, (byte) 10);
            break L360;
          }
        }
        L361: {
          var2 = fk.a(false, "STATUS_RANGE");
          if (null == var2) {
            break L361;
          } else {
            ud.field_Y = uu.a(var2, (byte) -120);
            break L361;
          }
        }
        L362: {
          var2 = fk.a(false, "STATUS_RANGES");
          if (null == var2) {
            break L362;
          } else {
            cw.field_a = uu.a(var2, (byte) 41);
            break L362;
          }
        }
        L363: {
          var2 = fk.a(false, "STATUSTEXT,0");
          if (var2 != null) {
            fh.field_f[0] = uu.a(var2, (byte) -96);
            break L363;
          } else {
            break L363;
          }
        }
        L364: {
          var2 = fk.a(false, "STATUSTEXT,1");
          if (null != var2) {
            fh.field_f[1] = uu.a(var2, (byte) -101);
            break L364;
          } else {
            break L364;
          }
        }
        L365: {
          var2 = fk.a(false, "STATUSTEXT,2");
          if (var2 == null) {
            break L365;
          } else {
            fh.field_f[2] = uu.a(var2, (byte) -100);
            break L365;
          }
        }
        L366: {
          var2 = fk.a(false, "STATUSTEXT,3");
          if (var2 == null) {
            break L366;
          } else {
            fh.field_f[3] = uu.a(var2, (byte) -111);
            break L366;
          }
        }
        L367: {
          var2 = fk.a(false, "STATUSTEXT,4");
          if (var2 == null) {
            break L367;
          } else {
            fh.field_f[4] = uu.a(var2, (byte) -99);
            break L367;
          }
        }
        L368: {
          var2 = fk.a(false, "STATUSTEXT,5");
          if (var2 == null) {
            break L368;
          } else {
            fh.field_f[5] = uu.a(var2, (byte) 80);
            break L368;
          }
        }
        L369: {
          var2 = fk.a(false, "STATUSTEXT,6");
          if (var2 == null) {
            break L369;
          } else {
            fh.field_f[6] = uu.a(var2, (byte) -95);
            break L369;
          }
        }
        L370: {
          var2 = fk.a(false, "STATUSTEXT,7");
          if (null != var2) {
            fh.field_f[7] = uu.a(var2, (byte) 85);
            break L370;
          } else {
            break L370;
          }
        }
        L371: {
          var2 = fk.a(false, "STATUS_ARMOUR,0");
          if (var2 != null) {
            pr.field_a[0] = uu.a(var2, (byte) 40);
            break L371;
          } else {
            break L371;
          }
        }
        L372: {
          var2 = fk.a(false, "STATUS_ARMOUR,1");
          if (null != var2) {
            pr.field_a[1] = uu.a(var2, (byte) 80);
            break L372;
          } else {
            break L372;
          }
        }
        L373: {
          var2 = fk.a(false, "STATUS_ARMOUR,2");
          if (null != var2) {
            pr.field_a[2] = uu.a(var2, (byte) -97);
            break L373;
          } else {
            break L373;
          }
        }
        L374: {
          var2 = fk.a(false, "STATUS_ARMOUR,3");
          if (var2 != null) {
            pr.field_a[3] = uu.a(var2, (byte) 83);
            break L374;
          } else {
            break L374;
          }
        }
        L375: {
          var2 = fk.a(false, "STATUS_ARMOUR,4");
          if (null != var2) {
            pr.field_a[4] = uu.a(var2, (byte) -117);
            break L375;
          } else {
            break L375;
          }
        }
        L376: {
          var2 = fk.a(false, "STATUS_ARMOUR,5");
          if (null != var2) {
            pr.field_a[5] = uu.a(var2, (byte) 127);
            break L376;
          } else {
            break L376;
          }
        }
        L377: {
          var2 = fk.a(false, "STATUS_ARMOUR,6");
          if (var2 != null) {
            pr.field_a[6] = uu.a(var2, (byte) 14);
            break L377;
          } else {
            break L377;
          }
        }
        L378: {
          var2 = fk.a(false, "STATUS_ARMOUR,7");
          if (null == var2) {
            break L378;
          } else {
            pr.field_a[7] = uu.a(var2, (byte) -100);
            break L378;
          }
        }
        L379: {
          var2 = fk.a(false, "STATUS_STUN,0");
          if (null != var2) {
            ba.field_E[0] = uu.a(var2, (byte) 57);
            break L379;
          } else {
            break L379;
          }
        }
        L380: {
          var2 = fk.a(false, "STATUS_STUN,1");
          if (null == var2) {
            break L380;
          } else {
            ba.field_E[1] = uu.a(var2, (byte) 63);
            break L380;
          }
        }
        L381: {
          var2 = fk.a(false, "STATUS_EFFECTEXPAND");
          if (var2 != null) {
            qc.field_f = uu.a(var2, (byte) -123);
            break L381;
          } else {
            break L381;
          }
        }
        L382: {
          var2 = fk.a(false, "STATUS_VAMPIRE");
          if (var2 != null) {
            c.field_f = uu.a(var2, (byte) 98);
            break L382;
          } else {
            break L382;
          }
        }
        L383: {
          var2 = fk.a(false, "STATUS_MITOSE");
          if (var2 != null) {
            td.field_h = uu.a(var2, (byte) 82);
            break L383;
          } else {
            break L383;
          }
        }
        L384: {
          var2 = fk.a(false, "STATUS_ACCESSORY,0");
          if (var2 == null) {
            break L384;
          } else {
            gs.field_c[0] = uu.a(var2, (byte) 88);
            break L384;
          }
        }
        L385: {
          var2 = fk.a(false, "STATUS_ACCESSORY,1");
          if (var2 == null) {
            break L385;
          } else {
            gs.field_c[1] = uu.a(var2, (byte) -94);
            break L385;
          }
        }
        L386: {
          var2 = fk.a(false, "STATUS_ACCESSORY,2");
          if (null != var2) {
            gs.field_c[2] = uu.a(var2, (byte) -99);
            break L386;
          } else {
            break L386;
          }
        }
        L387: {
          var2 = fk.a(false, "STATUS_ACCESSORY,3");
          if (null == var2) {
            break L387;
          } else {
            gs.field_c[3] = uu.a(var2, (byte) -108);
            break L387;
          }
        }
        L388: {
          var2 = fk.a(false, "STATUS_ACCESSORY,4");
          if (null == var2) {
            break L388;
          } else {
            gs.field_c[4] = uu.a(var2, (byte) 91);
            break L388;
          }
        }
        L389: {
          var2 = fk.a(false, "STATUS_ACCESSORY,5");
          if (var2 != null) {
            gs.field_c[5] = uu.a(var2, (byte) -125);
            break L389;
          } else {
            break L389;
          }
        }
        L390: {
          var2 = fk.a(false, "WEAPON_TYPES,0");
          if (null == var2) {
            break L390;
          } else {
            pg.field_b[0] = uu.a(var2, (byte) 44);
            break L390;
          }
        }
        L391: {
          var2 = fk.a(false, "WEAPON_TYPES,1");
          if (null != var2) {
            pg.field_b[1] = uu.a(var2, (byte) -128);
            break L391;
          } else {
            break L391;
          }
        }
        L392: {
          var2 = fk.a(false, "WEAPON_TYPES,2");
          if (null != var2) {
            pg.field_b[2] = uu.a(var2, (byte) -127);
            break L392;
          } else {
            break L392;
          }
        }
        L393: {
          var2 = fk.a(false, "WEAPON_TYPES,3");
          if (null == var2) {
            break L393;
          } else {
            pg.field_b[3] = uu.a(var2, (byte) -112);
            break L393;
          }
        }
        L394: {
          var2 = fk.a(false, "WEAPON_TYPES,4");
          if (var2 == null) {
            break L394;
          } else {
            pg.field_b[4] = uu.a(var2, (byte) -107);
            break L394;
          }
        }
        L395: {
          var2 = fk.a(false, "WEAPON_CLASSES,0");
          if (null != var2) {
            vp.field_y[0] = uu.a(var2, (byte) -118);
            break L395;
          } else {
            break L395;
          }
        }
        L396: {
          var2 = fk.a(false, "WEAPON_CLASSES,1");
          if (null != var2) {
            vp.field_y[1] = uu.a(var2, (byte) 5);
            break L396;
          } else {
            break L396;
          }
        }
        L397: {
          var2 = fk.a(false, "WEAPON_CLASSES,2");
          if (var2 == null) {
            break L397;
          } else {
            vp.field_y[2] = uu.a(var2, (byte) -120);
            break L397;
          }
        }
        L398: {
          var2 = fk.a(false, "WEAPON_CLASSES,3");
          if (var2 == null) {
            break L398;
          } else {
            vp.field_y[3] = uu.a(var2, (byte) 28);
            break L398;
          }
        }
        L399: {
          var2 = fk.a(false, "WEAPON_CLASSES,4");
          if (var2 == null) {
            break L399;
          } else {
            vp.field_y[4] = uu.a(var2, (byte) 9);
            break L399;
          }
        }
        L400: {
          var2 = fk.a(false, "WEAPON_CLASSES,5");
          if (null != var2) {
            vp.field_y[5] = uu.a(var2, (byte) -119);
            break L400;
          } else {
            break L400;
          }
        }
        L401: {
          var2 = fk.a(false, "WEAPON_CLASSES,6");
          if (null == var2) {
            break L401;
          } else {
            vp.field_y[6] = uu.a(var2, (byte) -113);
            break L401;
          }
        }
        L402: {
          var2 = fk.a(false, "BUTTON_CHATTAB");
          if (null != var2) {
            pq.field_e = uu.a(var2, (byte) -121);
            break L402;
          } else {
            break L402;
          }
        }
        L403: {
          var2 = fk.a(false, "BUTTON_ENDTURN");
          if (null == var2) {
            break L403;
          } else {
            fg.field_k = uu.a(var2, (byte) 11);
            break L403;
          }
        }
        L404: {
          var2 = fk.a(false, "BUTTON_TOGGLEMAP");
          if (var2 != null) {
            ep.field_a = uu.a(var2, (byte) 73);
            break L404;
          } else {
            break L404;
          }
        }
        L405: {
          var2 = fk.a(false, "BUTTON_ANNOUNCE");
          if (null != var2) {
            mo.field_o = uu.a(var2, (byte) 37);
            break L405;
          } else {
            break L405;
          }
        }
        L406: {
          var2 = fk.a(false, "BUTTON_TEAMCHATON");
          if (var2 == null) {
            break L406;
          } else {
            or.field_e = uu.a(var2, (byte) -119);
            break L406;
          }
        }
        L407: {
          var2 = fk.a(false, "BUTTON_TEAMCHATOFF");
          if (var2 == null) {
            break L407;
          } else {
            kd.field_E = uu.a(var2, (byte) 34);
            break L407;
          }
        }
        L408: {
          var2 = fk.a(false, "BUTTON_EQUIPMENT");
          if (null != var2) {
            dm.field_x = uu.a(var2, (byte) -107);
            break L408;
          } else {
            break L408;
          }
        }
        L409: {
          var2 = fk.a(false, "HOVER_GOD");
          if (var2 != null) {
            pq.field_c = uu.a(var2, (byte) 82);
            break L409;
          } else {
            break L409;
          }
        }
        L410: {
          var2 = fk.a(false, "HOVER_ANNOUNCE");
          if (null == var2) {
            break L410;
          } else {
            String discarded$18 = uu.a(var2, (byte) -118);
            break L410;
          }
        }
        L411: {
          var2 = fk.a(false, "HOVER_ANNOUNCEYOU");
          if (var2 == null) {
            break L411;
          } else {
            ce.field_H = uu.a(var2, (byte) 50);
            break L411;
          }
        }
        L412: {
          var2 = fk.a(false, "ANNOUNCE_WINNER");
          if (var2 == null) {
            break L412;
          } else {
            p.field_i = uu.a(var2, (byte) -92);
            break L412;
          }
        }
        L413: {
          var2 = fk.a(false, "ANNOUNCE_WINNERYOU");
          if (var2 != null) {
            tr.field_y = uu.a(var2, (byte) 89);
            break L413;
          } else {
            break L413;
          }
        }
        L414: {
          var2 = fk.a(false, "ANNOUNCE_DRAW");
          if (var2 == null) {
            break L414;
          } else {
            r.field_J = uu.a(var2, (byte) -92);
            break L414;
          }
        }
        L415: {
          var2 = fk.a(false, "GAME_STATS,0");
          if (null != var2) {
            vo.field_f[0] = uu.a(var2, (byte) 42);
            break L415;
          } else {
            break L415;
          }
        }
        L416: {
          var2 = fk.a(false, "GAME_STATS,1");
          if (null == var2) {
            break L416;
          } else {
            vo.field_f[1] = uu.a(var2, (byte) -112);
            break L416;
          }
        }
        L417: {
          var2 = fk.a(false, "GAME_STATS,2");
          if (null != var2) {
            vo.field_f[2] = uu.a(var2, (byte) 48);
            break L417;
          } else {
            break L417;
          }
        }
        L418: {
          var2 = fk.a(false, "GAME_STATS,3");
          if (var2 == null) {
            break L418;
          } else {
            vo.field_f[3] = uu.a(var2, (byte) 97);
            break L418;
          }
        }
        L419: {
          var2 = fk.a(false, "GAME_STATS,5");
          if (var2 != null) {
            vo.field_f[5] = uu.a(var2, (byte) 88);
            break L419;
          } else {
            break L419;
          }
        }
        L420: {
          var2 = fk.a(false, "GAME_STATS,6");
          if (null != var2) {
            vo.field_f[6] = uu.a(var2, (byte) -123);
            break L420;
          } else {
            break L420;
          }
        }
        L421: {
          var2 = fk.a(false, "GAME_STATS,7");
          if (var2 == null) {
            break L421;
          } else {
            vo.field_f[7] = uu.a(var2, (byte) -122);
            break L421;
          }
        }
        L422: {
          var2 = fk.a(false, "GAME_STATS,8");
          if (null == var2) {
            break L422;
          } else {
            vo.field_f[8] = uu.a(var2, (byte) 57);
            break L422;
          }
        }
        L423: {
          var2 = fk.a(false, "MANA_INCREASE");
          if (null == var2) {
            break L423;
          } else {
            dr.field_w = uu.a(var2, (byte) -93);
            break L423;
          }
        }
        L424: {
          var2 = fk.a(false, "MANA_COUNTER");
          if (var2 == null) {
            break L424;
          } else {
            lu.field_v = uu.a(var2, (byte) 112);
            break L424;
          }
        }
        L425: {
          var2 = fk.a(false, "MANA_COUNTER_VICTORY");
          if (var2 == null) {
            break L425;
          } else {
            cr.field_bb = uu.a(var2, (byte) -108);
            break L425;
          }
        }
        L426: {
          var2 = fk.a(false, "MANA_COUNTER_VICTORY2");
          if (null == var2) {
            break L426;
          } else {
            bo.field_c = uu.a(var2, (byte) -125);
            break L426;
          }
        }
        L427: {
          var2 = fk.a(false, "TERRAIN_BONUS");
          if (null == var2) {
            break L427;
          } else {
            String discarded$19 = uu.a(var2, (byte) -105);
            break L427;
          }
        }
        L428: {
          var2 = fk.a(false, "CLASSES,0");
          if (null != var2) {
            hi.field_m[0] = uu.a(var2, (byte) 65);
            break L428;
          } else {
            break L428;
          }
        }
        L429: {
          var2 = fk.a(false, "CLASSES,1");
          if (null == var2) {
            break L429;
          } else {
            hi.field_m[1] = uu.a(var2, (byte) 36);
            break L429;
          }
        }
        L430: {
          var2 = fk.a(false, "CLASSES,2");
          if (null != var2) {
            hi.field_m[2] = uu.a(var2, (byte) -103);
            break L430;
          } else {
            break L430;
          }
        }
        L431: {
          var2 = fk.a(false, "CLASSES,3");
          if (null != var2) {
            hi.field_m[3] = uu.a(var2, (byte) 117);
            break L431;
          } else {
            break L431;
          }
        }
        L432: {
          var2 = fk.a(false, "CLASSES,4");
          if (null == var2) {
            break L432;
          } else {
            hi.field_m[4] = uu.a(var2, (byte) 53);
            break L432;
          }
        }
        L433: {
          var2 = fk.a(false, "CLASSES,5");
          if (null == var2) {
            break L433;
          } else {
            hi.field_m[5] = uu.a(var2, (byte) -115);
            break L433;
          }
        }
        L434: {
          var2 = fk.a(false, "CLASSES,6");
          if (var2 == null) {
            break L434;
          } else {
            hi.field_m[6] = uu.a(var2, (byte) -94);
            break L434;
          }
        }
        L435: {
          var2 = fk.a(false, "CLASSES,7");
          if (null != var2) {
            hi.field_m[7] = uu.a(var2, (byte) -95);
            break L435;
          } else {
            break L435;
          }
        }
        L436: {
          var2 = fk.a(false, "BARBARIAN_CHIEF");
          if (null == var2) {
            break L436;
          } else {
            ov.field_a = uu.a(var2, (byte) -113);
            break L436;
          }
        }
        L437: {
          var2 = fk.a(false, "groundnames,0");
          if (var2 != null) {
            jj.field_a[0] = uu.a(var2, (byte) -115);
            break L437;
          } else {
            break L437;
          }
        }
        L438: {
          var2 = fk.a(false, "groundnames,1");
          if (null != var2) {
            jj.field_a[1] = uu.a(var2, (byte) -109);
            break L438;
          } else {
            break L438;
          }
        }
        L439: {
          var2 = fk.a(false, "groundnames,2");
          if (null != var2) {
            jj.field_a[2] = uu.a(var2, (byte) -106);
            break L439;
          } else {
            break L439;
          }
        }
        L440: {
          var2 = fk.a(false, "groundnames,3");
          if (null != var2) {
            jj.field_a[3] = uu.a(var2, (byte) 43);
            break L440;
          } else {
            break L440;
          }
        }
        L441: {
          var2 = fk.a(false, "groundnames,4");
          if (var2 == null) {
            break L441;
          } else {
            jj.field_a[4] = uu.a(var2, (byte) -112);
            break L441;
          }
        }
        L442: {
          var2 = fk.a(false, "groundnames,5");
          if (null == var2) {
            break L442;
          } else {
            jj.field_a[5] = uu.a(var2, (byte) 34);
            break L442;
          }
        }
        L443: {
          var2 = fk.a(false, "groundnames,6");
          if (null != var2) {
            jj.field_a[6] = uu.a(var2, (byte) -124);
            break L443;
          } else {
            break L443;
          }
        }
        L444: {
          var2 = fk.a(false, "groundnames,7");
          if (null != var2) {
            jj.field_a[7] = uu.a(var2, (byte) 52);
            break L444;
          } else {
            break L444;
          }
        }
        L445: {
          var2 = fk.a(false, "groundnames,8");
          if (var2 == null) {
            break L445;
          } else {
            jj.field_a[8] = uu.a(var2, (byte) 109);
            break L445;
          }
        }
        L446: {
          var2 = fk.a(false, "groundnames,9");
          if (var2 != null) {
            jj.field_a[9] = uu.a(var2, (byte) 51);
            break L446;
          } else {
            break L446;
          }
        }
        L447: {
          var2 = fk.a(false, "groundnames,10");
          if (null == var2) {
            break L447;
          } else {
            jj.field_a[10] = uu.a(var2, (byte) -115);
            break L447;
          }
        }
        L448: {
          var2 = fk.a(false, "groundnames,11");
          if (null != var2) {
            jj.field_a[11] = uu.a(var2, (byte) 22);
            break L448;
          } else {
            break L448;
          }
        }
        L449: {
          var2 = fk.a(false, "groundnames,12");
          if (var2 == null) {
            break L449;
          } else {
            jj.field_a[12] = uu.a(var2, (byte) 43);
            break L449;
          }
        }
        L450: {
          var2 = fk.a(false, "groundnames,13");
          if (var2 != null) {
            jj.field_a[13] = uu.a(var2, (byte) 79);
            break L450;
          } else {
            break L450;
          }
        }
        L451: {
          var2 = fk.a(false, "groundnames,14");
          if (null == var2) {
            break L451;
          } else {
            jj.field_a[14] = uu.a(var2, (byte) -127);
            break L451;
          }
        }
        L452: {
          var2 = fk.a(false, "groundnames,15");
          if (null == var2) {
            break L452;
          } else {
            jj.field_a[15] = uu.a(var2, (byte) -113);
            break L452;
          }
        }
        L453: {
          var2 = fk.a(false, "burntgroundnames,4");
          if (var2 == null) {
            break L453;
          } else {
            dj.field_d[4] = uu.a(var2, (byte) 12);
            break L453;
          }
        }
        L454: {
          var2 = fk.a(false, "burntgroundnames,6");
          if (null == var2) {
            break L454;
          } else {
            dj.field_d[6] = uu.a(var2, (byte) 83);
            break L454;
          }
        }
        L455: {
          var2 = fk.a(false, "LEADER");
          if (var2 == null) {
            break L455;
          } else {
            og.field_r = uu.a(var2, (byte) -123);
            break L455;
          }
        }
        L456: {
          var2 = fk.a(false, "GUARD");
          if (null == var2) {
            break L456;
          } else {
            fa.field_f = uu.a(var2, (byte) 109);
            break L456;
          }
        }
        L457: {
          var2 = fk.a(false, "EXIT");
          if (null == var2) {
            break L457;
          } else {
            ce.field_P = uu.a(var2, (byte) -110);
            break L457;
          }
        }
        L458: {
          var2 = fk.a(false, "UN_OWNED");
          if (var2 != null) {
            rn.field_b = uu.a(var2, (byte) 65);
            break L458;
          } else {
            break L458;
          }
        }
        L459: {
          var2 = fk.a(false, "UN_OWNABLE");
          if (null != var2) {
            al.field_k = uu.a(var2, (byte) 104);
            break L459;
          } else {
            break L459;
          }
        }
        L460: {
          var2 = fk.a(false, "OWNED_BY");
          if (null == var2) {
            break L460;
          } else {
            m.field_h = uu.a(var2, (byte) -124);
            break L460;
          }
        }
        L461: {
          var2 = fk.a(false, "OWNED_BY_YOU");
          if (null == var2) {
            break L461;
          } else {
            al.field_e = uu.a(var2, (byte) -93);
            break L461;
          }
        }
        L462: {
          var2 = fk.a(false, "MANA_SCORE");
          if (null == var2) {
            break L462;
          } else {
            vg.field_t = uu.a(var2, (byte) 10);
            break L462;
          }
        }
        L463: {
          var2 = fk.a(false, "NO_MANA");
          if (null == var2) {
            break L463;
          } else {
            ps.field_x = uu.a(var2, (byte) -92);
            break L463;
          }
        }
        L464: {
          var2 = fk.a(false, "terrainicontext,0,0");
          if (var2 == null) {
            break L464;
          } else {
            ek.field_b[0][0] = uu.a(var2, (byte) 52);
            break L464;
          }
        }
        L465: {
          var2 = fk.a(false, "terrainicontext,0,1");
          if (null == var2) {
            break L465;
          } else {
            ek.field_b[0][1] = uu.a(var2, (byte) 46);
            break L465;
          }
        }
        L466: {
          var2 = fk.a(false, "terrainicontext,0,2");
          if (var2 != null) {
            ek.field_b[0][2] = uu.a(var2, (byte) -102);
            break L466;
          } else {
            break L466;
          }
        }
        L467: {
          var2 = fk.a(false, "terrainicontext,0,3");
          if (var2 != null) {
            ek.field_b[0][3] = uu.a(var2, (byte) -118);
            break L467;
          } else {
            break L467;
          }
        }
        L468: {
          var2 = fk.a(false, "terrainicontext,0,4");
          if (var2 == null) {
            break L468;
          } else {
            ek.field_b[0][4] = uu.a(var2, (byte) 68);
            break L468;
          }
        }
        L469: {
          var2 = fk.a(false, "terrainicontext,0,5");
          if (null != var2) {
            ek.field_b[0][5] = uu.a(var2, (byte) -119);
            break L469;
          } else {
            break L469;
          }
        }
        L470: {
          var2 = fk.a(false, "terrainicontext,0,6");
          if (var2 == null) {
            break L470;
          } else {
            ek.field_b[0][6] = uu.a(var2, (byte) -117);
            break L470;
          }
        }
        L471: {
          var2 = fk.a(false, "terrainicontext,0,7");
          if (var2 == null) {
            break L471;
          } else {
            ek.field_b[0][7] = uu.a(var2, (byte) 58);
            break L471;
          }
        }
        L472: {
          var2 = fk.a(false, "terrainicontext,0,8");
          if (null == var2) {
            break L472;
          } else {
            ek.field_b[0][8] = uu.a(var2, (byte) -125);
            break L472;
          }
        }
        L473: {
          var2 = fk.a(false, "terrainicontext,0,9");
          if (null == var2) {
            break L473;
          } else {
            ek.field_b[0][9] = uu.a(var2, (byte) -121);
            break L473;
          }
        }
        L474: {
          var2 = fk.a(false, "terrainicontext,0,10");
          if (null == var2) {
            break L474;
          } else {
            ek.field_b[0][10] = uu.a(var2, (byte) -109);
            break L474;
          }
        }
        L475: {
          var2 = fk.a(false, "terrainicontext,0,11");
          if (var2 != null) {
            ek.field_b[0][11] = uu.a(var2, (byte) 17);
            break L475;
          } else {
            break L475;
          }
        }
        L476: {
          var2 = fk.a(false, "terrainicontext,0,12");
          if (var2 != null) {
            ek.field_b[0][12] = uu.a(var2, (byte) -106);
            break L476;
          } else {
            break L476;
          }
        }
        L477: {
          var2 = fk.a(false, "terrainicontext,0,13");
          if (null == var2) {
            break L477;
          } else {
            ek.field_b[0][13] = uu.a(var2, (byte) 111);
            break L477;
          }
        }
        L478: {
          var2 = fk.a(false, "terrainicontext,0,14");
          if (var2 == null) {
            break L478;
          } else {
            ek.field_b[0][14] = uu.a(var2, (byte) -96);
            break L478;
          }
        }
        L479: {
          var2 = fk.a(false, "terrainicontext,0,15");
          if (null != var2) {
            ek.field_b[0][15] = uu.a(var2, (byte) -115);
            break L479;
          } else {
            break L479;
          }
        }
        L480: {
          var2 = fk.a(false, "terrainicontext,0,16");
          if (null != var2) {
            ek.field_b[0][16] = uu.a(var2, (byte) -120);
            break L480;
          } else {
            break L480;
          }
        }
        L481: {
          var2 = fk.a(false, "terrainicontext,0,17");
          if (null != var2) {
            ek.field_b[0][17] = uu.a(var2, (byte) -103);
            break L481;
          } else {
            break L481;
          }
        }
        L482: {
          var2 = fk.a(false, "terrainicontext,1,1");
          if (null != var2) {
            ek.field_b[1][1] = uu.a(var2, (byte) -102);
            break L482;
          } else {
            break L482;
          }
        }
        L483: {
          var2 = fk.a(false, "terrainicontext,1,2");
          if (null == var2) {
            break L483;
          } else {
            ek.field_b[1][2] = uu.a(var2, (byte) 91);
            break L483;
          }
        }
        L484: {
          var2 = fk.a(false, "terrainicontext,1,4");
          if (var2 != null) {
            ek.field_b[1][4] = uu.a(var2, (byte) -108);
            break L484;
          } else {
            break L484;
          }
        }
        L485: {
          var2 = fk.a(false, "terrainicontext,1,5");
          if (null != var2) {
            ek.field_b[1][5] = uu.a(var2, (byte) 122);
            break L485;
          } else {
            break L485;
          }
        }
        L486: {
          var2 = fk.a(false, "terrainicontext,1,6");
          if (null != var2) {
            ek.field_b[1][6] = uu.a(var2, (byte) 77);
            break L486;
          } else {
            break L486;
          }
        }
        L487: {
          var2 = fk.a(false, "terrainicontext,1,7");
          if (null != var2) {
            ek.field_b[1][7] = uu.a(var2, (byte) -94);
            break L487;
          } else {
            break L487;
          }
        }
        L488: {
          var2 = fk.a(false, "terrainicontext,1,8");
          if (null != var2) {
            ek.field_b[1][8] = uu.a(var2, (byte) -100);
            break L488;
          } else {
            break L488;
          }
        }
        L489: {
          var2 = fk.a(false, "terrainicontext,1,9");
          if (null != var2) {
            ek.field_b[1][9] = uu.a(var2, (byte) -119);
            break L489;
          } else {
            break L489;
          }
        }
        L490: {
          var2 = fk.a(false, "terrainicontext,1,17");
          if (null != var2) {
            ek.field_b[1][17] = uu.a(var2, (byte) 103);
            break L490;
          } else {
            break L490;
          }
        }
        L491: {
          var2 = fk.a(false, "terrainicontext,2,2");
          if (null == var2) {
            break L491;
          } else {
            ek.field_b[2][2] = uu.a(var2, (byte) 35);
            break L491;
          }
        }
        L492: {
          var2 = fk.a(false, "unitnames,0");
          if (null == var2) {
            break L492;
          } else {
            dn.field_Pb[0] = uu.a(var2, (byte) 94);
            break L492;
          }
        }
        L493: {
          var2 = fk.a(false, "unitnames,1");
          if (null != var2) {
            dn.field_Pb[1] = uu.a(var2, (byte) 70);
            break L493;
          } else {
            break L493;
          }
        }
        L494: {
          var2 = fk.a(false, "unitnames,2");
          if (var2 == null) {
            break L494;
          } else {
            dn.field_Pb[2] = uu.a(var2, (byte) -100);
            break L494;
          }
        }
        L495: {
          var2 = fk.a(false, "unitnames,3");
          if (var2 != null) {
            dn.field_Pb[3] = uu.a(var2, (byte) -113);
            break L495;
          } else {
            break L495;
          }
        }
        L496: {
          var2 = fk.a(false, "unitnames,4");
          if (null == var2) {
            break L496;
          } else {
            dn.field_Pb[4] = uu.a(var2, (byte) -128);
            break L496;
          }
        }
        L497: {
          var2 = fk.a(false, "unitnames,5");
          if (var2 == null) {
            break L497;
          } else {
            dn.field_Pb[5] = uu.a(var2, (byte) -119);
            break L497;
          }
        }
        L498: {
          var2 = fk.a(false, "unitnames,6");
          if (null == var2) {
            break L498;
          } else {
            dn.field_Pb[6] = uu.a(var2, (byte) -117);
            break L498;
          }
        }
        L499: {
          var2 = fk.a(false, "unitnames,7");
          if (null != var2) {
            dn.field_Pb[7] = uu.a(var2, (byte) 125);
            break L499;
          } else {
            break L499;
          }
        }
        L500: {
          var2 = fk.a(false, "unitnames,8");
          if (var2 == null) {
            break L500;
          } else {
            dn.field_Pb[8] = uu.a(var2, (byte) -116);
            break L500;
          }
        }
        L501: {
          var2 = fk.a(false, "unitnames,9");
          if (var2 == null) {
            break L501;
          } else {
            dn.field_Pb[9] = uu.a(var2, (byte) 102);
            break L501;
          }
        }
        L502: {
          var2 = fk.a(false, "unitnames,10");
          if (null == var2) {
            break L502;
          } else {
            dn.field_Pb[10] = uu.a(var2, (byte) 23);
            break L502;
          }
        }
        L503: {
          var2 = fk.a(false, "unitnames,11");
          if (var2 == null) {
            break L503;
          } else {
            dn.field_Pb[11] = uu.a(var2, (byte) 32);
            break L503;
          }
        }
        L504: {
          var2 = fk.a(false, "unitnames,12");
          if (null != var2) {
            dn.field_Pb[12] = uu.a(var2, (byte) -97);
            break L504;
          } else {
            break L504;
          }
        }
        L505: {
          var2 = fk.a(false, "unitnames,13");
          if (null == var2) {
            break L505;
          } else {
            dn.field_Pb[13] = uu.a(var2, (byte) 117);
            break L505;
          }
        }
        L506: {
          var2 = fk.a(false, "unitnames,14");
          if (null == var2) {
            break L506;
          } else {
            dn.field_Pb[14] = uu.a(var2, (byte) -106);
            break L506;
          }
        }
        L507: {
          var2 = fk.a(false, "unitnames,15");
          if (var2 != null) {
            dn.field_Pb[15] = uu.a(var2, (byte) 41);
            break L507;
          } else {
            break L507;
          }
        }
        L508: {
          var2 = fk.a(false, "unitnames,16");
          if (null != var2) {
            dn.field_Pb[16] = uu.a(var2, (byte) 112);
            break L508;
          } else {
            break L508;
          }
        }
        L509: {
          var2 = fk.a(false, "unitnames,17");
          if (null == var2) {
            break L509;
          } else {
            dn.field_Pb[17] = uu.a(var2, (byte) -123);
            break L509;
          }
        }
        L510: {
          var2 = fk.a(false, "unitnames,18");
          if (null != var2) {
            dn.field_Pb[18] = uu.a(var2, (byte) 59);
            break L510;
          } else {
            break L510;
          }
        }
        L511: {
          var2 = fk.a(false, "unitnames,19");
          if (null != var2) {
            dn.field_Pb[19] = uu.a(var2, (byte) -124);
            break L511;
          } else {
            break L511;
          }
        }
        L512: {
          var2 = fk.a(false, "unitnames,20");
          if (var2 == null) {
            break L512;
          } else {
            dn.field_Pb[20] = uu.a(var2, (byte) -110);
            break L512;
          }
        }
        L513: {
          var2 = fk.a(false, "unitnames,21");
          if (var2 == null) {
            break L513;
          } else {
            dn.field_Pb[21] = uu.a(var2, (byte) -99);
            break L513;
          }
        }
        L514: {
          var2 = fk.a(false, "unitnames,22");
          if (null != var2) {
            dn.field_Pb[22] = uu.a(var2, (byte) -94);
            break L514;
          } else {
            break L514;
          }
        }
        L515: {
          var2 = fk.a(false, "unitnames,23");
          if (var2 != null) {
            dn.field_Pb[23] = uu.a(var2, (byte) -108);
            break L515;
          } else {
            break L515;
          }
        }
        L516: {
          var2 = fk.a(false, "unitnames,24");
          if (null == var2) {
            break L516;
          } else {
            dn.field_Pb[24] = uu.a(var2, (byte) 125);
            break L516;
          }
        }
        L517: {
          var2 = fk.a(false, "unitnames,25");
          if (var2 != null) {
            dn.field_Pb[25] = uu.a(var2, (byte) -124);
            break L517;
          } else {
            break L517;
          }
        }
        L518: {
          var2 = fk.a(false, "unitnames,26");
          if (var2 != null) {
            dn.field_Pb[26] = uu.a(var2, (byte) 92);
            break L518;
          } else {
            break L518;
          }
        }
        L519: {
          var2 = fk.a(false, "unitnames,27");
          if (null == var2) {
            break L519;
          } else {
            dn.field_Pb[27] = uu.a(var2, (byte) 109);
            break L519;
          }
        }
        L520: {
          var2 = fk.a(false, "unitnames,28");
          if (var2 == null) {
            break L520;
          } else {
            dn.field_Pb[28] = uu.a(var2, (byte) -96);
            break L520;
          }
        }
        L521: {
          var2 = fk.a(false, "unitnames,29");
          if (var2 != null) {
            dn.field_Pb[29] = uu.a(var2, (byte) 20);
            break L521;
          } else {
            break L521;
          }
        }
        L522: {
          var2 = fk.a(false, "unitnames,30");
          if (null == var2) {
            break L522;
          } else {
            dn.field_Pb[30] = uu.a(var2, (byte) -106);
            break L522;
          }
        }
        L523: {
          var2 = fk.a(false, "unitnames,31");
          if (null != var2) {
            dn.field_Pb[31] = uu.a(var2, (byte) -99);
            break L523;
          } else {
            break L523;
          }
        }
        L524: {
          var2 = fk.a(false, "unitnames,32");
          if (var2 != null) {
            dn.field_Pb[32] = uu.a(var2, (byte) 70);
            break L524;
          } else {
            break L524;
          }
        }
        L525: {
          var2 = fk.a(false, "unitnames,33");
          if (var2 == null) {
            break L525;
          } else {
            dn.field_Pb[33] = uu.a(var2, (byte) 70);
            break L525;
          }
        }
        L526: {
          var2 = fk.a(false, "unitnames,34");
          if (null != var2) {
            dn.field_Pb[34] = uu.a(var2, (byte) -128);
            break L526;
          } else {
            break L526;
          }
        }
        L527: {
          var2 = fk.a(false, "unitnames,35");
          if (null != var2) {
            dn.field_Pb[35] = uu.a(var2, (byte) -109);
            break L527;
          } else {
            break L527;
          }
        }
        L528: {
          var2 = fk.a(false, "unitnames,36");
          if (null != var2) {
            dn.field_Pb[36] = uu.a(var2, (byte) -105);
            break L528;
          } else {
            break L528;
          }
        }
        L529: {
          var2 = fk.a(false, "unitnames,37");
          if (var2 == null) {
            break L529;
          } else {
            dn.field_Pb[37] = uu.a(var2, (byte) 11);
            break L529;
          }
        }
        L530: {
          var2 = fk.a(false, "unitnames,38");
          if (null != var2) {
            dn.field_Pb[38] = uu.a(var2, (byte) 109);
            break L530;
          } else {
            break L530;
          }
        }
        L531: {
          var2 = fk.a(false, "unitnames,39");
          if (var2 == null) {
            break L531;
          } else {
            dn.field_Pb[39] = uu.a(var2, (byte) 75);
            break L531;
          }
        }
        L532: {
          var2 = fk.a(false, "unitnames,40");
          if (null != var2) {
            dn.field_Pb[40] = uu.a(var2, (byte) -128);
            break L532;
          } else {
            break L532;
          }
        }
        L533: {
          var2 = fk.a(false, "unitnames,41");
          if (var2 != null) {
            dn.field_Pb[41] = uu.a(var2, (byte) 63);
            break L533;
          } else {
            break L533;
          }
        }
        L534: {
          var2 = fk.a(false, "unitnames,42");
          if (null == var2) {
            break L534;
          } else {
            dn.field_Pb[42] = uu.a(var2, (byte) 90);
            break L534;
          }
        }
        L535: {
          var2 = fk.a(false, "unitnames,43");
          if (var2 == null) {
            break L535;
          } else {
            dn.field_Pb[43] = uu.a(var2, (byte) 107);
            break L535;
          }
        }
        L536: {
          var2 = fk.a(false, "unitnames,44");
          if (var2 == null) {
            break L536;
          } else {
            dn.field_Pb[44] = uu.a(var2, (byte) -112);
            break L536;
          }
        }
        L537: {
          var2 = fk.a(false, "unitnames,45");
          if (var2 != null) {
            dn.field_Pb[45] = uu.a(var2, (byte) 62);
            break L537;
          } else {
            break L537;
          }
        }
        L538: {
          var2 = fk.a(false, "unitnames,46");
          if (var2 == null) {
            break L538;
          } else {
            dn.field_Pb[46] = uu.a(var2, (byte) 12);
            break L538;
          }
        }
        L539: {
          var2 = fk.a(false, "unitnames,47");
          if (var2 == null) {
            break L539;
          } else {
            dn.field_Pb[47] = uu.a(var2, (byte) 35);
            break L539;
          }
        }
        L540: {
          var2 = fk.a(false, "unitnames,48");
          if (null == var2) {
            break L540;
          } else {
            dn.field_Pb[48] = uu.a(var2, (byte) 36);
            break L540;
          }
        }
        L541: {
          var2 = fk.a(false, "unitnames,49");
          if (null == var2) {
            break L541;
          } else {
            dn.field_Pb[49] = uu.a(var2, (byte) -110);
            break L541;
          }
        }
        L542: {
          var2 = fk.a(false, "unitnames,50");
          if (null != var2) {
            dn.field_Pb[50] = uu.a(var2, (byte) 102);
            break L542;
          } else {
            break L542;
          }
        }
        L543: {
          var2 = fk.a(false, "unitnames,51");
          if (null != var2) {
            dn.field_Pb[51] = uu.a(var2, (byte) 54);
            break L543;
          } else {
            break L543;
          }
        }
        L544: {
          var2 = fk.a(false, "unitnames,52");
          if (null == var2) {
            break L544;
          } else {
            dn.field_Pb[52] = uu.a(var2, (byte) -106);
            break L544;
          }
        }
        L545: {
          var2 = fk.a(false, "unitnames,53");
          if (var2 != null) {
            dn.field_Pb[53] = uu.a(var2, (byte) 18);
            break L545;
          } else {
            break L545;
          }
        }
        L546: {
          var2 = fk.a(false, "unitnames,54");
          if (var2 != null) {
            dn.field_Pb[54] = uu.a(var2, (byte) 18);
            break L546;
          } else {
            break L546;
          }
        }
        L547: {
          var2 = fk.a(false, "unitnames,55");
          if (var2 == null) {
            break L547;
          } else {
            dn.field_Pb[55] = uu.a(var2, (byte) -93);
            break L547;
          }
        }
        L548: {
          var2 = fk.a(false, "unitnames,56");
          if (null != var2) {
            dn.field_Pb[56] = uu.a(var2, (byte) 70);
            break L548;
          } else {
            break L548;
          }
        }
        L549: {
          var2 = fk.a(false, "unitnames,57");
          if (null != var2) {
            dn.field_Pb[57] = uu.a(var2, (byte) 107);
            break L549;
          } else {
            break L549;
          }
        }
        L550: {
          var2 = fk.a(false, "unitnames,58");
          if (null == var2) {
            break L550;
          } else {
            dn.field_Pb[58] = uu.a(var2, (byte) -126);
            break L550;
          }
        }
        L551: {
          var2 = fk.a(false, "unitnames,59");
          if (null != var2) {
            dn.field_Pb[59] = uu.a(var2, (byte) -105);
            break L551;
          } else {
            break L551;
          }
        }
        L552: {
          var2 = fk.a(false, "unitnames,60");
          if (null == var2) {
            break L552;
          } else {
            dn.field_Pb[60] = uu.a(var2, (byte) -124);
            break L552;
          }
        }
        L553: {
          var2 = fk.a(false, "unitnames,61");
          if (null == var2) {
            break L553;
          } else {
            dn.field_Pb[61] = uu.a(var2, (byte) -106);
            break L553;
          }
        }
        L554: {
          var2 = fk.a(false, "unitnames,62");
          if (var2 != null) {
            dn.field_Pb[62] = uu.a(var2, (byte) -94);
            break L554;
          } else {
            break L554;
          }
        }
        L555: {
          var2 = fk.a(false, "unitnames,63");
          if (var2 == null) {
            break L555;
          } else {
            dn.field_Pb[63] = uu.a(var2, (byte) -115);
            break L555;
          }
        }
        L556: {
          var2 = fk.a(false, "unitnames,64");
          if (null == var2) {
            break L556;
          } else {
            dn.field_Pb[64] = uu.a(var2, (byte) -92);
            break L556;
          }
        }
        L557: {
          var2 = fk.a(false, "unitnames,65");
          if (var2 != null) {
            dn.field_Pb[65] = uu.a(var2, (byte) -116);
            break L557;
          } else {
            break L557;
          }
        }
        L558: {
          var2 = fk.a(false, "unitnames,66");
          if (var2 != null) {
            dn.field_Pb[66] = uu.a(var2, (byte) 35);
            break L558;
          } else {
            break L558;
          }
        }
        L559: {
          var2 = fk.a(false, "unitnames,67");
          if (var2 != null) {
            dn.field_Pb[67] = uu.a(var2, (byte) 56);
            break L559;
          } else {
            break L559;
          }
        }
        L560: {
          var2 = fk.a(false, "unitnames,68");
          if (var2 != null) {
            dn.field_Pb[68] = uu.a(var2, (byte) -121);
            break L560;
          } else {
            break L560;
          }
        }
        L561: {
          var2 = fk.a(false, "unitnames,69");
          if (null == var2) {
            break L561;
          } else {
            dn.field_Pb[69] = uu.a(var2, (byte) 118);
            break L561;
          }
        }
        L562: {
          var2 = fk.a(false, "unitnames,70");
          if (var2 != null) {
            dn.field_Pb[70] = uu.a(var2, (byte) -119);
            break L562;
          } else {
            break L562;
          }
        }
        L563: {
          var2 = fk.a(false, "unitnames,71");
          if (null == var2) {
            break L563;
          } else {
            dn.field_Pb[71] = uu.a(var2, (byte) -117);
            break L563;
          }
        }
        L564: {
          var2 = fk.a(false, "unitnames,72");
          if (var2 != null) {
            dn.field_Pb[72] = uu.a(var2, (byte) 19);
            break L564;
          } else {
            break L564;
          }
        }
        L565: {
          var2 = fk.a(false, "unitnames,73");
          if (null == var2) {
            break L565;
          } else {
            dn.field_Pb[73] = uu.a(var2, (byte) -128);
            break L565;
          }
        }
        L566: {
          var2 = fk.a(false, "unitnames,74");
          if (var2 == null) {
            break L566;
          } else {
            dn.field_Pb[74] = uu.a(var2, (byte) -128);
            break L566;
          }
        }
        L567: {
          var2 = fk.a(false, "unitnames,75");
          if (var2 != null) {
            dn.field_Pb[75] = uu.a(var2, (byte) 14);
            break L567;
          } else {
            break L567;
          }
        }
        L568: {
          var2 = fk.a(false, "unitnames,76");
          if (null == var2) {
            break L568;
          } else {
            dn.field_Pb[76] = uu.a(var2, (byte) -118);
            break L568;
          }
        }
        L569: {
          var2 = fk.a(false, "unitnames,77");
          if (var2 != null) {
            dn.field_Pb[77] = uu.a(var2, (byte) 72);
            break L569;
          } else {
            break L569;
          }
        }
        L570: {
          var2 = fk.a(false, "unitnames,78");
          if (var2 != null) {
            dn.field_Pb[78] = uu.a(var2, (byte) 113);
            break L570;
          } else {
            break L570;
          }
        }
        L571: {
          var2 = fk.a(false, "unitnames,79");
          if (var2 != null) {
            dn.field_Pb[79] = uu.a(var2, (byte) 124);
            break L571;
          } else {
            break L571;
          }
        }
        L572: {
          var2 = fk.a(false, "unitnames,80");
          if (var2 != null) {
            dn.field_Pb[80] = uu.a(var2, (byte) -92);
            break L572;
          } else {
            break L572;
          }
        }
        L573: {
          var2 = fk.a(false, "unitnames,81");
          if (var2 != null) {
            dn.field_Pb[81] = uu.a(var2, (byte) 98);
            break L573;
          } else {
            break L573;
          }
        }
        L574: {
          var2 = fk.a(false, "unitnames,82");
          if (var2 != null) {
            dn.field_Pb[82] = uu.a(var2, (byte) 63);
            break L574;
          } else {
            break L574;
          }
        }
        L575: {
          var2 = fk.a(false, "unitnames,83");
          if (null != var2) {
            dn.field_Pb[83] = uu.a(var2, (byte) -115);
            break L575;
          } else {
            break L575;
          }
        }
        L576: {
          var2 = fk.a(false, "unitnames,84");
          if (var2 != null) {
            dn.field_Pb[84] = uu.a(var2, (byte) 31);
            break L576;
          } else {
            break L576;
          }
        }
        L577: {
          var2 = fk.a(false, "unitnames,85");
          if (var2 == null) {
            break L577;
          } else {
            dn.field_Pb[85] = uu.a(var2, (byte) 69);
            break L577;
          }
        }
        L578: {
          var2 = fk.a(false, "unitnames,86");
          if (var2 != null) {
            dn.field_Pb[86] = uu.a(var2, (byte) -107);
            break L578;
          } else {
            break L578;
          }
        }
        L579: {
          var2 = fk.a(false, "unitnames,87");
          if (var2 == null) {
            break L579;
          } else {
            dn.field_Pb[87] = uu.a(var2, (byte) -99);
            break L579;
          }
        }
        L580: {
          var2 = fk.a(false, "unitnames,88");
          if (var2 == null) {
            break L580;
          } else {
            dn.field_Pb[88] = uu.a(var2, (byte) -109);
            break L580;
          }
        }
        L581: {
          var2 = fk.a(false, "STATS_MULTIRANGE");
          if (var2 != null) {
            g.field_e = uu.a(var2, (byte) 67);
            break L581;
          } else {
            break L581;
          }
        }
        L582: {
          var2 = fk.a(false, "STATS_SINGLERANGE");
          if (var2 != null) {
            jd.field_y = uu.a(var2, (byte) 88);
            break L582;
          } else {
            break L582;
          }
        }
        L583: {
          var2 = fk.a(false, "STATS_CANNONRANGE");
          if (null != var2) {
            vl.field_l = uu.a(var2, (byte) 70);
            break L583;
          } else {
            break L583;
          }
        }
        L584: {
          var2 = fk.a(false, "TXT_RANGES");
          if (var2 != null) {
            td.field_a = uu.a(var2, (byte) 121);
            break L584;
          } else {
            break L584;
          }
        }
        L585: {
          var2 = fk.a(false, "TXT_RANGES2");
          if (null == var2) {
            break L585;
          } else {
            sm.field_e = uu.a(var2, (byte) 78);
            break L585;
          }
        }
        L586: {
          var2 = fk.a(false, "TXT_RANGE");
          if (null != var2) {
            vk.field_d = uu.a(var2, (byte) -92);
            break L586;
          } else {
            break L586;
          }
        }
        L587: {
          var2 = fk.a(false, "TXT_STRENGTH");
          if (var2 == null) {
            break L587;
          } else {
            mk.field_i = uu.a(var2, (byte) 101);
            break L587;
          }
        }
        L588: {
          var2 = fk.a(false, "TXT_SPEED");
          if (var2 == null) {
            break L588;
          } else {
            lq.field_a = uu.a(var2, (byte) -103);
            break L588;
          }
        }
        L589: {
          var2 = fk.a(false, "TXT_LEVEL");
          if (var2 != null) {
            dl.field_d = uu.a(var2, (byte) -96);
            break L589;
          } else {
            break L589;
          }
        }
        L590: {
          var2 = fk.a(false, "TXT_MANA");
          if (var2 == null) {
            break L590;
          } else {
            bt.field_d = uu.a(var2, (byte) 96);
            break L590;
          }
        }
        L591: {
          var2 = fk.a(false, "LABEL_ENDTURN");
          if (var2 == null) {
            break L591;
          } else {
            kf.field_I = uu.a(var2, (byte) -118);
            break L591;
          }
        }
        L592: {
          var2 = fk.a(false, "LABEL_ALIGNMENTS");
          if (var2 == null) {
            break L592;
          } else {
            be.field_F = uu.a(var2, (byte) 36);
            break L592;
          }
        }
        L593: {
          var2 = fk.a(false, "ROLLOVER_MANA");
          if (null == var2) {
            break L593;
          } else {
            vs.field_h = uu.a(var2, (byte) 99);
            break L593;
          }
        }
        L594: {
          var2 = fk.a(false, "ROLLOVER_CHAT");
          if (var2 == null) {
            break L594;
          } else {
            String discarded$20 = uu.a(var2, (byte) 59);
            break L594;
          }
        }
        L595: {
          var2 = fk.a(false, "ROLLOVER_STRENGTH");
          if (null == var2) {
            break L595;
          } else {
            ln.field_c = uu.a(var2, (byte) 14);
            break L595;
          }
        }
        L596: {
          var2 = fk.a(false, "ROLLOVER_BONUS");
          if (var2 != null) {
            ki.field_c = uu.a(var2, (byte) 68);
            break L596;
          } else {
            break L596;
          }
        }
        L597: {
          var2 = fk.a(false, "CAMPAIGN_PROGRESS");
          if (var2 == null) {
            break L597;
          } else {
            og.field_l = uu.a(var2, (byte) -103);
            break L597;
          }
        }
        L598: {
          var2 = fk.a(false, "HOTSEAT_NAMES,0");
          if (var2 == null) {
            break L598;
          } else {
            jm.field_w[0] = uu.a(var2, (byte) 13);
            break L598;
          }
        }
        L599: {
          var2 = fk.a(false, "HOTSEAT_NAMES,1");
          if (var2 == null) {
            break L599;
          } else {
            jm.field_w[1] = uu.a(var2, (byte) 21);
            break L599;
          }
        }
        L600: {
          var2 = fk.a(false, "HOTSEAT_NAMES,2");
          if (var2 == null) {
            break L600;
          } else {
            jm.field_w[2] = uu.a(var2, (byte) 17);
            break L600;
          }
        }
        L601: {
          var2 = fk.a(false, "HOTSEAT_NAMES,3");
          if (null == var2) {
            break L601;
          } else {
            jm.field_w[3] = uu.a(var2, (byte) 49);
            break L601;
          }
        }
        L602: {
          var2 = fk.a(false, "HOTSEAT_NAMES,4");
          if (var2 == null) {
            break L602;
          } else {
            jm.field_w[4] = uu.a(var2, (byte) 55);
            break L602;
          }
        }
        L603: {
          var2 = fk.a(false, "HOTSEAT_NAMES,5");
          if (var2 != null) {
            jm.field_w[5] = uu.a(var2, (byte) -105);
            break L603;
          } else {
            break L603;
          }
        }
        L604: {
          var2 = fk.a(false, "HOTSEAT_NAMES,6");
          if (null == var2) {
            break L604;
          } else {
            jm.field_w[6] = uu.a(var2, (byte) -120);
            break L604;
          }
        }
        L605: {
          var2 = fk.a(false, "HOTSEAT_NAMES,7");
          if (var2 != null) {
            jm.field_w[7] = uu.a(var2, (byte) -101);
            break L605;
          } else {
            break L605;
          }
        }
        L606: {
          var2 = fk.a(false, "TUT_PLAYER");
          if (var2 != null) {
            ei.field_i = uu.a(var2, (byte) 4);
            break L606;
          } else {
            break L606;
          }
        }
        L607: {
          var2 = fk.a(false, "TUT_ENEMY");
          if (null == var2) {
            break L607;
          } else {
            vs.field_b = uu.a(var2, (byte) -101);
            break L607;
          }
        }
        L608: {
          var2 = fk.a(false, "TEAM_RED");
          if (var2 == null) {
            break L608;
          } else {
            vj.field_n = uu.a(var2, (byte) 34);
            break L608;
          }
        }
        L609: {
          var2 = fk.a(false, "TEAM_BLUE");
          if (null == var2) {
            break L609;
          } else {
            om.field_p = uu.a(var2, (byte) -117);
            break L609;
          }
        }
        L610: {
          var2 = fk.a(false, "SPACE");
          if (null == var2) {
            break L610;
          } else {
            String discarded$21 = uu.a(var2, (byte) 22);
            break L610;
          }
        }
        L611: {
          var2 = fk.a(false, "KBD_SUMMON_DESCRIPTION");
          if (null == var2) {
            break L611;
          } else {
            String discarded$22 = uu.a(var2, (byte) -110);
            break L611;
          }
        }
        L612: {
          var2 = fk.a(false, "unitspecials,0");
          if (null != var2) {
            bh.field_M[0] = uu.a(var2, (byte) -100);
            break L612;
          } else {
            break L612;
          }
        }
        L613: {
          var2 = fk.a(false, "unitspecials,3");
          if (null == var2) {
            break L613;
          } else {
            bh.field_M[3] = uu.a(var2, (byte) -126);
            break L613;
          }
        }
        L614: {
          var2 = fk.a(false, "unitspecials,4");
          if (null == var2) {
            break L614;
          } else {
            bh.field_M[4] = uu.a(var2, (byte) -92);
            break L614;
          }
        }
        L615: {
          var2 = fk.a(false, "unitspecials,6");
          if (null != var2) {
            bh.field_M[6] = uu.a(var2, (byte) -109);
            break L615;
          } else {
            break L615;
          }
        }
        L616: {
          var2 = fk.a(false, "unitspecials,7");
          if (var2 == null) {
            break L616;
          } else {
            bh.field_M[7] = uu.a(var2, (byte) 59);
            break L616;
          }
        }
        L617: {
          var2 = fk.a(false, "unitspecials,10");
          if (null != var2) {
            bh.field_M[10] = uu.a(var2, (byte) -119);
            break L617;
          } else {
            break L617;
          }
        }
        L618: {
          var2 = fk.a(false, "unitspecials,17");
          if (null == var2) {
            break L618;
          } else {
            bh.field_M[17] = uu.a(var2, (byte) -96);
            break L618;
          }
        }
        L619: {
          var2 = fk.a(false, "unitspecials,18");
          if (null != var2) {
            bh.field_M[18] = uu.a(var2, (byte) 28);
            break L619;
          } else {
            break L619;
          }
        }
        L620: {
          var2 = fk.a(false, "unitspecials,20");
          if (null != var2) {
            bh.field_M[20] = uu.a(var2, (byte) -113);
            break L620;
          } else {
            break L620;
          }
        }
        L621: {
          var2 = fk.a(false, "unitspecials,21");
          if (null == var2) {
            break L621;
          } else {
            bh.field_M[21] = uu.a(var2, (byte) -108);
            break L621;
          }
        }
        L622: {
          var2 = fk.a(false, "unitspecials,27");
          if (var2 == null) {
            break L622;
          } else {
            bh.field_M[27] = uu.a(var2, (byte) -99);
            break L622;
          }
        }
        L623: {
          var2 = fk.a(false, "unitspecials,28");
          if (null != var2) {
            bh.field_M[28] = uu.a(var2, (byte) -101);
            break L623;
          } else {
            break L623;
          }
        }
        L624: {
          var2 = fk.a(false, "unitspecials,29");
          if (null == var2) {
            break L624;
          } else {
            bh.field_M[29] = uu.a(var2, (byte) -105);
            break L624;
          }
        }
        L625: {
          var2 = fk.a(false, "unitspecials,32");
          if (var2 != null) {
            bh.field_M[32] = uu.a(var2, (byte) 40);
            break L625;
          } else {
            break L625;
          }
        }
        L626: {
          var2 = fk.a(false, "unitspecials,34");
          if (null != var2) {
            bh.field_M[34] = uu.a(var2, (byte) -103);
            break L626;
          } else {
            break L626;
          }
        }
        L627: {
          var2 = fk.a(false, "unitspecials,39");
          if (null != var2) {
            bh.field_M[39] = uu.a(var2, (byte) -123);
            break L627;
          } else {
            break L627;
          }
        }
        L628: {
          var2 = fk.a(false, "unitspecials,40");
          if (null == var2) {
            break L628;
          } else {
            bh.field_M[40] = uu.a(var2, (byte) -95);
            break L628;
          }
        }
        L629: {
          var2 = fk.a(false, "unitspecials,43");
          if (var2 != null) {
            bh.field_M[43] = uu.a(var2, (byte) 75);
            break L629;
          } else {
            break L629;
          }
        }
        L630: {
          var2 = fk.a(false, "unitspecials,51");
          if (null == var2) {
            break L630;
          } else {
            bh.field_M[51] = uu.a(var2, (byte) -93);
            break L630;
          }
        }
        L631: {
          var2 = fk.a(false, "unitspecials,53");
          if (var2 != null) {
            bh.field_M[53] = uu.a(var2, (byte) 102);
            break L631;
          } else {
            break L631;
          }
        }
        L632: {
          var2 = fk.a(false, "unitspecials,56");
          if (var2 == null) {
            break L632;
          } else {
            bh.field_M[56] = uu.a(var2, (byte) -120);
            break L632;
          }
        }
        L633: {
          var2 = fk.a(false, "unitspecials,57");
          if (null == var2) {
            break L633;
          } else {
            bh.field_M[57] = uu.a(var2, (byte) -108);
            break L633;
          }
        }
        L634: {
          var2 = fk.a(false, "unitspecials,58");
          if (null != var2) {
            bh.field_M[58] = uu.a(var2, (byte) -121);
            break L634;
          } else {
            break L634;
          }
        }
        L635: {
          var2 = fk.a(false, "unitspecials,59");
          if (null == var2) {
            break L635;
          } else {
            bh.field_M[59] = uu.a(var2, (byte) 43);
            break L635;
          }
        }
        L636: {
          var2 = fk.a(false, "unitspecials,62");
          if (null != var2) {
            bh.field_M[62] = uu.a(var2, (byte) 80);
            break L636;
          } else {
            break L636;
          }
        }
        L637: {
          var2 = fk.a(false, "unitspecials,63");
          if (var2 != null) {
            bh.field_M[63] = uu.a(var2, (byte) 89);
            break L637;
          } else {
            break L637;
          }
        }
        L638: {
          var2 = fk.a(false, "unitspecials,65");
          if (null != var2) {
            bh.field_M[65] = uu.a(var2, (byte) 43);
            break L638;
          } else {
            break L638;
          }
        }
        L639: {
          var2 = fk.a(false, "unitspecials,66");
          if (var2 != null) {
            bh.field_M[66] = uu.a(var2, (byte) -97);
            break L639;
          } else {
            break L639;
          }
        }
        L640: {
          var2 = fk.a(false, "unitspecials,70");
          if (null == var2) {
            break L640;
          } else {
            bh.field_M[70] = uu.a(var2, (byte) -116);
            break L640;
          }
        }
        L641: {
          var2 = fk.a(false, "unitspecials,71");
          if (var2 != null) {
            bh.field_M[71] = uu.a(var2, (byte) 41);
            break L641;
          } else {
            break L641;
          }
        }
        L642: {
          var2 = fk.a(false, "unitspecials,72");
          if (var2 == null) {
            break L642;
          } else {
            bh.field_M[72] = uu.a(var2, (byte) -92);
            break L642;
          }
        }
        L643: {
          var2 = fk.a(false, "unitspecials,73");
          if (var2 != null) {
            bh.field_M[73] = uu.a(var2, (byte) -121);
            break L643;
          } else {
            break L643;
          }
        }
        L644: {
          var2 = fk.a(false, "unitspecials,74");
          if (var2 == null) {
            break L644;
          } else {
            bh.field_M[74] = uu.a(var2, (byte) 33);
            break L644;
          }
        }
        L645: {
          var2 = fk.a(false, "unitspecials,81");
          if (var2 != null) {
            bh.field_M[81] = uu.a(var2, (byte) -123);
            break L645;
          } else {
            break L645;
          }
        }
        L646: {
          var2 = fk.a(false, "descriptions,0");
          if (var2 == null) {
            break L646;
          } else {
            ut.field_cb[0] = uu.a(var2, (byte) -107);
            break L646;
          }
        }
        L647: {
          var2 = fk.a(false, "descriptions,1");
          if (var2 == null) {
            break L647;
          } else {
            ut.field_cb[1] = uu.a(var2, (byte) -92);
            break L647;
          }
        }
        L648: {
          var2 = fk.a(false, "descriptions,2");
          if (var2 != null) {
            ut.field_cb[2] = uu.a(var2, (byte) -97);
            break L648;
          } else {
            break L648;
          }
        }
        L649: {
          var2 = fk.a(false, "descriptions,3");
          if (null != var2) {
            ut.field_cb[3] = uu.a(var2, (byte) -106);
            break L649;
          } else {
            break L649;
          }
        }
        L650: {
          var2 = fk.a(false, "descriptions,4");
          if (var2 == null) {
            break L650;
          } else {
            ut.field_cb[4] = uu.a(var2, (byte) 45);
            break L650;
          }
        }
        L651: {
          var2 = fk.a(false, "descriptions,5");
          if (null != var2) {
            ut.field_cb[5] = uu.a(var2, (byte) 109);
            break L651;
          } else {
            break L651;
          }
        }
        L652: {
          var2 = fk.a(false, "descriptions,6");
          if (null == var2) {
            break L652;
          } else {
            ut.field_cb[6] = uu.a(var2, (byte) 45);
            break L652;
          }
        }
        L653: {
          var2 = fk.a(false, "descriptions,7");
          if (null == var2) {
            break L653;
          } else {
            ut.field_cb[7] = uu.a(var2, (byte) 61);
            break L653;
          }
        }
        L654: {
          var2 = fk.a(false, "descriptions,8");
          if (null != var2) {
            ut.field_cb[8] = uu.a(var2, (byte) -112);
            break L654;
          } else {
            break L654;
          }
        }
        L655: {
          var2 = fk.a(false, "descriptions,9");
          if (null != var2) {
            ut.field_cb[9] = uu.a(var2, (byte) -99);
            break L655;
          } else {
            break L655;
          }
        }
        L656: {
          var2 = fk.a(false, "descriptions,10");
          if (null != var2) {
            ut.field_cb[10] = uu.a(var2, (byte) 126);
            break L656;
          } else {
            break L656;
          }
        }
        L657: {
          var2 = fk.a(false, "descriptions,11");
          if (var2 != null) {
            ut.field_cb[11] = uu.a(var2, (byte) 85);
            break L657;
          } else {
            break L657;
          }
        }
        L658: {
          var2 = fk.a(false, "descriptions,12");
          if (var2 != null) {
            ut.field_cb[12] = uu.a(var2, (byte) -102);
            break L658;
          } else {
            break L658;
          }
        }
        L659: {
          var2 = fk.a(false, "descriptions,13");
          if (null == var2) {
            break L659;
          } else {
            ut.field_cb[13] = uu.a(var2, (byte) -115);
            break L659;
          }
        }
        L660: {
          var2 = fk.a(false, "descriptions,14");
          if (null == var2) {
            break L660;
          } else {
            ut.field_cb[14] = uu.a(var2, (byte) -92);
            break L660;
          }
        }
        L661: {
          var2 = fk.a(false, "descriptions,15");
          if (null != var2) {
            ut.field_cb[15] = uu.a(var2, (byte) -118);
            break L661;
          } else {
            break L661;
          }
        }
        L662: {
          var2 = fk.a(false, "descriptions,16");
          if (null == var2) {
            break L662;
          } else {
            ut.field_cb[16] = uu.a(var2, (byte) -115);
            break L662;
          }
        }
        L663: {
          var2 = fk.a(false, "descriptions,17");
          if (null != var2) {
            ut.field_cb[17] = uu.a(var2, (byte) -93);
            break L663;
          } else {
            break L663;
          }
        }
        L664: {
          var2 = fk.a(false, "descriptions,18");
          if (null == var2) {
            break L664;
          } else {
            ut.field_cb[18] = uu.a(var2, (byte) 30);
            break L664;
          }
        }
        L665: {
          var2 = fk.a(false, "descriptions,19");
          if (var2 != null) {
            ut.field_cb[19] = uu.a(var2, (byte) 95);
            break L665;
          } else {
            break L665;
          }
        }
        L666: {
          var2 = fk.a(false, "descriptions,20");
          if (null == var2) {
            break L666;
          } else {
            ut.field_cb[20] = uu.a(var2, (byte) -101);
            break L666;
          }
        }
        L667: {
          var2 = fk.a(false, "descriptions,21");
          if (null != var2) {
            ut.field_cb[21] = uu.a(var2, (byte) -95);
            break L667;
          } else {
            break L667;
          }
        }
        L668: {
          var2 = fk.a(false, "descriptions,22");
          if (null == var2) {
            break L668;
          } else {
            ut.field_cb[22] = uu.a(var2, (byte) 86);
            break L668;
          }
        }
        L669: {
          var2 = fk.a(false, "descriptions,23");
          if (null != var2) {
            ut.field_cb[23] = uu.a(var2, (byte) 86);
            break L669;
          } else {
            break L669;
          }
        }
        L670: {
          var2 = fk.a(false, "descriptions,24");
          if (null != var2) {
            ut.field_cb[24] = uu.a(var2, (byte) -128);
            break L670;
          } else {
            break L670;
          }
        }
        L671: {
          var2 = fk.a(false, "descriptions,25");
          if (null != var2) {
            ut.field_cb[25] = uu.a(var2, (byte) 49);
            break L671;
          } else {
            break L671;
          }
        }
        L672: {
          var2 = fk.a(false, "descriptions,26");
          if (null != var2) {
            ut.field_cb[26] = uu.a(var2, (byte) 68);
            break L672;
          } else {
            break L672;
          }
        }
        L673: {
          var2 = fk.a(false, "descriptions,27");
          if (null == var2) {
            break L673;
          } else {
            ut.field_cb[27] = uu.a(var2, (byte) 21);
            break L673;
          }
        }
        L674: {
          var2 = fk.a(false, "descriptions,28");
          if (var2 != null) {
            ut.field_cb[28] = uu.a(var2, (byte) -117);
            break L674;
          } else {
            break L674;
          }
        }
        L675: {
          var2 = fk.a(false, "descriptions,29");
          if (var2 != null) {
            ut.field_cb[29] = uu.a(var2, (byte) 98);
            break L675;
          } else {
            break L675;
          }
        }
        L676: {
          var2 = fk.a(false, "descriptions,30");
          if (null != var2) {
            ut.field_cb[30] = uu.a(var2, (byte) 41);
            break L676;
          } else {
            break L676;
          }
        }
        L677: {
          var2 = fk.a(false, "descriptions,31");
          if (null == var2) {
            break L677;
          } else {
            ut.field_cb[31] = uu.a(var2, (byte) -113);
            break L677;
          }
        }
        L678: {
          var2 = fk.a(false, "descriptions,32");
          if (null != var2) {
            ut.field_cb[32] = uu.a(var2, (byte) 38);
            break L678;
          } else {
            break L678;
          }
        }
        L679: {
          var2 = fk.a(false, "descriptions,33");
          if (null != var2) {
            ut.field_cb[33] = uu.a(var2, (byte) -114);
            break L679;
          } else {
            break L679;
          }
        }
        L680: {
          var2 = fk.a(false, "descriptions,34");
          if (null == var2) {
            break L680;
          } else {
            ut.field_cb[34] = uu.a(var2, (byte) 113);
            break L680;
          }
        }
        L681: {
          var2 = fk.a(false, "descriptions,35");
          if (null == var2) {
            break L681;
          } else {
            ut.field_cb[35] = uu.a(var2, (byte) -119);
            break L681;
          }
        }
        L682: {
          var2 = fk.a(false, "descriptions,36");
          if (var2 != null) {
            ut.field_cb[36] = uu.a(var2, (byte) 91);
            break L682;
          } else {
            break L682;
          }
        }
        L683: {
          var2 = fk.a(false, "descriptions,37");
          if (null == var2) {
            break L683;
          } else {
            ut.field_cb[37] = uu.a(var2, (byte) 88);
            break L683;
          }
        }
        L684: {
          var2 = fk.a(false, "descriptions,38");
          if (var2 == null) {
            break L684;
          } else {
            ut.field_cb[38] = uu.a(var2, (byte) -100);
            break L684;
          }
        }
        L685: {
          var2 = fk.a(false, "descriptions,39");
          if (var2 != null) {
            ut.field_cb[39] = uu.a(var2, (byte) 15);
            break L685;
          } else {
            break L685;
          }
        }
        L686: {
          var2 = fk.a(false, "descriptions,40");
          if (var2 != null) {
            ut.field_cb[40] = uu.a(var2, (byte) 99);
            break L686;
          } else {
            break L686;
          }
        }
        L687: {
          var2 = fk.a(false, "descriptions,41");
          if (null != var2) {
            ut.field_cb[41] = uu.a(var2, (byte) 84);
            break L687;
          } else {
            break L687;
          }
        }
        L688: {
          var2 = fk.a(false, "descriptions,42");
          if (null != var2) {
            ut.field_cb[42] = uu.a(var2, (byte) -99);
            break L688;
          } else {
            break L688;
          }
        }
        L689: {
          var2 = fk.a(false, "descriptions,43");
          if (var2 == null) {
            break L689;
          } else {
            ut.field_cb[43] = uu.a(var2, (byte) 32);
            break L689;
          }
        }
        L690: {
          var2 = fk.a(false, "descriptions,44");
          if (null != var2) {
            ut.field_cb[44] = uu.a(var2, (byte) -94);
            break L690;
          } else {
            break L690;
          }
        }
        L691: {
          var2 = fk.a(false, "descriptions,45");
          if (null != var2) {
            ut.field_cb[45] = uu.a(var2, (byte) 10);
            break L691;
          } else {
            break L691;
          }
        }
        L692: {
          var2 = fk.a(false, "descriptions,46");
          if (null != var2) {
            ut.field_cb[46] = uu.a(var2, (byte) 46);
            break L692;
          } else {
            break L692;
          }
        }
        L693: {
          var2 = fk.a(false, "descriptions,47");
          if (var2 == null) {
            break L693;
          } else {
            ut.field_cb[47] = uu.a(var2, (byte) 2);
            break L693;
          }
        }
        L694: {
          var2 = fk.a(false, "descriptions,48");
          if (var2 != null) {
            ut.field_cb[48] = uu.a(var2, (byte) -101);
            break L694;
          } else {
            break L694;
          }
        }
        L695: {
          var2 = fk.a(false, "descriptions,49");
          if (var2 != null) {
            ut.field_cb[49] = uu.a(var2, (byte) 24);
            break L695;
          } else {
            break L695;
          }
        }
        L696: {
          var2 = fk.a(false, "descriptions,50");
          if (var2 != null) {
            ut.field_cb[50] = uu.a(var2, (byte) -97);
            break L696;
          } else {
            break L696;
          }
        }
        L697: {
          var2 = fk.a(false, "descriptions,51");
          if (var2 == null) {
            break L697;
          } else {
            ut.field_cb[51] = uu.a(var2, (byte) -100);
            break L697;
          }
        }
        L698: {
          var2 = fk.a(false, "descriptions,52");
          if (var2 == null) {
            break L698;
          } else {
            ut.field_cb[52] = uu.a(var2, (byte) 115);
            break L698;
          }
        }
        L699: {
          var2 = fk.a(false, "descriptions,53");
          if (var2 == null) {
            break L699;
          } else {
            ut.field_cb[53] = uu.a(var2, (byte) 5);
            break L699;
          }
        }
        L700: {
          var2 = fk.a(false, "descriptions,54");
          if (var2 != null) {
            ut.field_cb[54] = uu.a(var2, (byte) -121);
            break L700;
          } else {
            break L700;
          }
        }
        L701: {
          var2 = fk.a(false, "descriptions,55");
          if (null != var2) {
            ut.field_cb[55] = uu.a(var2, (byte) 90);
            break L701;
          } else {
            break L701;
          }
        }
        L702: {
          var2 = fk.a(false, "descriptions,56");
          if (var2 != null) {
            ut.field_cb[56] = uu.a(var2, (byte) 120);
            break L702;
          } else {
            break L702;
          }
        }
        L703: {
          var2 = fk.a(false, "descriptions,57");
          if (var2 != null) {
            ut.field_cb[57] = uu.a(var2, (byte) 42);
            break L703;
          } else {
            break L703;
          }
        }
        L704: {
          var2 = fk.a(false, "descriptions,58");
          if (null != var2) {
            ut.field_cb[58] = uu.a(var2, (byte) -95);
            break L704;
          } else {
            break L704;
          }
        }
        L705: {
          var2 = fk.a(false, "descriptions,59");
          if (var2 == null) {
            break L705;
          } else {
            ut.field_cb[59] = uu.a(var2, (byte) -93);
            break L705;
          }
        }
        L706: {
          var2 = fk.a(false, "descriptions,60");
          if (null != var2) {
            ut.field_cb[60] = uu.a(var2, (byte) -93);
            break L706;
          } else {
            break L706;
          }
        }
        L707: {
          var2 = fk.a(false, "descriptions,61");
          if (var2 != null) {
            ut.field_cb[61] = uu.a(var2, (byte) 22);
            break L707;
          } else {
            break L707;
          }
        }
        L708: {
          var2 = fk.a(false, "descriptions,62");
          if (null != var2) {
            ut.field_cb[62] = uu.a(var2, (byte) -96);
            break L708;
          } else {
            break L708;
          }
        }
        L709: {
          var2 = fk.a(false, "descriptions,63");
          if (null != var2) {
            ut.field_cb[63] = uu.a(var2, (byte) 12);
            break L709;
          } else {
            break L709;
          }
        }
        L710: {
          var2 = fk.a(false, "descriptions,64");
          if (var2 != null) {
            ut.field_cb[64] = uu.a(var2, (byte) 108);
            break L710;
          } else {
            break L710;
          }
        }
        L711: {
          var2 = fk.a(false, "descriptions,65");
          if (null != var2) {
            ut.field_cb[65] = uu.a(var2, (byte) -124);
            break L711;
          } else {
            break L711;
          }
        }
        L712: {
          var2 = fk.a(false, "descriptions,66");
          if (var2 == null) {
            break L712;
          } else {
            ut.field_cb[66] = uu.a(var2, (byte) -124);
            break L712;
          }
        }
        L713: {
          var2 = fk.a(false, "descriptions,67");
          if (var2 != null) {
            ut.field_cb[67] = uu.a(var2, (byte) -114);
            break L713;
          } else {
            break L713;
          }
        }
        L714: {
          var2 = fk.a(false, "descriptions,68");
          if (null != var2) {
            ut.field_cb[68] = uu.a(var2, (byte) -113);
            break L714;
          } else {
            break L714;
          }
        }
        L715: {
          var2 = fk.a(false, "descriptions,69");
          if (var2 != null) {
            ut.field_cb[69] = uu.a(var2, (byte) 109);
            break L715;
          } else {
            break L715;
          }
        }
        L716: {
          var2 = fk.a(false, "descriptions,70");
          if (null != var2) {
            ut.field_cb[70] = uu.a(var2, (byte) -109);
            break L716;
          } else {
            break L716;
          }
        }
        L717: {
          var2 = fk.a(false, "descriptions,71");
          if (null != var2) {
            ut.field_cb[71] = uu.a(var2, (byte) -109);
            break L717;
          } else {
            break L717;
          }
        }
        L718: {
          var2 = fk.a(false, "descriptions,72");
          if (null != var2) {
            ut.field_cb[72] = uu.a(var2, (byte) -121);
            break L718;
          } else {
            break L718;
          }
        }
        L719: {
          var2 = fk.a(false, "descriptions,73");
          if (null != var2) {
            ut.field_cb[73] = uu.a(var2, (byte) 87);
            break L719;
          } else {
            break L719;
          }
        }
        L720: {
          var2 = fk.a(false, "descriptions,74");
          if (null != var2) {
            ut.field_cb[74] = uu.a(var2, (byte) 97);
            break L720;
          } else {
            break L720;
          }
        }
        L721: {
          var2 = fk.a(false, "NO_PASSIVE");
          if (null == var2) {
            break L721;
          } else {
            du.field_f = uu.a(var2, (byte) -117);
            break L721;
          }
        }
        L722: {
          var2 = fk.a(false, "passivespecials,0");
          if (var2 != null) {
            cj.field_n[0] = uu.a(var2, (byte) -122);
            break L722;
          } else {
            break L722;
          }
        }
        L723: {
          var2 = fk.a(false, "passivespecials,1");
          if (var2 == null) {
            break L723;
          } else {
            cj.field_n[1] = uu.a(var2, (byte) 74);
            break L723;
          }
        }
        L724: {
          var2 = fk.a(false, "passivespecials,2");
          if (null == var2) {
            break L724;
          } else {
            cj.field_n[2] = uu.a(var2, (byte) -95);
            break L724;
          }
        }
        L725: {
          var2 = fk.a(false, "passivespecials,3");
          if (var2 == null) {
            break L725;
          } else {
            cj.field_n[3] = uu.a(var2, (byte) 114);
            break L725;
          }
        }
        L726: {
          var2 = fk.a(false, "passivespecials,4");
          if (var2 == null) {
            break L726;
          } else {
            cj.field_n[4] = uu.a(var2, (byte) -104);
            break L726;
          }
        }
        L727: {
          var2 = fk.a(false, "passivespecials,5");
          if (null == var2) {
            break L727;
          } else {
            cj.field_n[5] = uu.a(var2, (byte) 10);
            break L727;
          }
        }
        L728: {
          var2 = fk.a(false, "passivespecials,6");
          if (null == var2) {
            break L728;
          } else {
            cj.field_n[6] = uu.a(var2, (byte) 40);
            break L728;
          }
        }
        L729: {
          var2 = fk.a(false, "passivespecials,7");
          if (null != var2) {
            cj.field_n[7] = uu.a(var2, (byte) 48);
            break L729;
          } else {
            break L729;
          }
        }
        L730: {
          var2 = fk.a(false, "passivespecials,8");
          if (null != var2) {
            cj.field_n[8] = uu.a(var2, (byte) 13);
            break L730;
          } else {
            break L730;
          }
        }
        L731: {
          var2 = fk.a(false, "passivespecials,9");
          if (var2 != null) {
            cj.field_n[9] = uu.a(var2, (byte) 75);
            break L731;
          } else {
            break L731;
          }
        }
        L732: {
          var2 = fk.a(false, "passivespecials,10");
          if (var2 == null) {
            break L732;
          } else {
            cj.field_n[10] = uu.a(var2, (byte) 51);
            break L732;
          }
        }
        L733: {
          var2 = fk.a(false, "passivespecials,11");
          if (var2 == null) {
            break L733;
          } else {
            cj.field_n[11] = uu.a(var2, (byte) 45);
            break L733;
          }
        }
        L734: {
          var2 = fk.a(false, "passivespecials,12");
          if (var2 == null) {
            break L734;
          } else {
            cj.field_n[12] = uu.a(var2, (byte) -99);
            break L734;
          }
        }
        L735: {
          var2 = fk.a(false, "passivespecials,13");
          if (null == var2) {
            break L735;
          } else {
            cj.field_n[13] = uu.a(var2, (byte) -109);
            break L735;
          }
        }
        L736: {
          var2 = fk.a(false, "passivespecials,14");
          if (var2 == null) {
            break L736;
          } else {
            cj.field_n[14] = uu.a(var2, (byte) -102);
            break L736;
          }
        }
        L737: {
          var2 = fk.a(false, "passivespecials,15");
          if (var2 != null) {
            cj.field_n[15] = uu.a(var2, (byte) -96);
            break L737;
          } else {
            break L737;
          }
        }
        L738: {
          var2 = fk.a(false, "passivespecials,16");
          if (var2 != null) {
            cj.field_n[16] = uu.a(var2, (byte) -109);
            break L738;
          } else {
            break L738;
          }
        }
        L739: {
          var2 = fk.a(false, "passivespecials,17");
          if (null != var2) {
            cj.field_n[17] = uu.a(var2, (byte) 63);
            break L739;
          } else {
            break L739;
          }
        }
        L740: {
          var2 = fk.a(false, "passivespecials,18");
          if (null != var2) {
            cj.field_n[18] = uu.a(var2, (byte) 25);
            break L740;
          } else {
            break L740;
          }
        }
        L741: {
          var2 = fk.a(false, "passivespecials,19");
          if (null != var2) {
            cj.field_n[19] = uu.a(var2, (byte) 32);
            break L741;
          } else {
            break L741;
          }
        }
        L742: {
          var2 = fk.a(false, "passivespecials,20");
          if (null != var2) {
            cj.field_n[20] = uu.a(var2, (byte) -118);
            break L742;
          } else {
            break L742;
          }
        }
        L743: {
          var2 = fk.a(false, "passivespecials,21");
          if (var2 != null) {
            cj.field_n[21] = uu.a(var2, (byte) -93);
            break L743;
          } else {
            break L743;
          }
        }
        L744: {
          var2 = fk.a(false, "passivespecials,22");
          if (var2 != null) {
            cj.field_n[22] = uu.a(var2, (byte) -122);
            break L744;
          } else {
            break L744;
          }
        }
        L745: {
          var2 = fk.a(false, "SUMMON_ERRORS,0");
          if (null == var2) {
            break L745;
          } else {
            go.field_c[0] = uu.a(var2, (byte) -98);
            break L745;
          }
        }
        L746: {
          var2 = fk.a(false, "SUMMON_ERRORS,1");
          if (null != var2) {
            go.field_c[1] = uu.a(var2, (byte) -98);
            break L746;
          } else {
            break L746;
          }
        }
        L747: {
          var2 = fk.a(false, "SUMMON_ERRORS,2");
          if (var2 == null) {
            break L747;
          } else {
            go.field_c[2] = uu.a(var2, (byte) -97);
            break L747;
          }
        }
        L748: {
          var2 = fk.a(false, "SUMMON_ERRORS,3");
          if (null == var2) {
            break L748;
          } else {
            go.field_c[3] = uu.a(var2, (byte) -101);
            break L748;
          }
        }
        L749: {
          var2 = fk.a(false, "SUMMON_ERRORS,4");
          if (null == var2) {
            break L749;
          } else {
            go.field_c[4] = uu.a(var2, (byte) -104);
            break L749;
          }
        }
        L750: {
          var2 = fk.a(false, "directions,0");
          if (null == var2) {
            break L750;
          } else {
            k.field_a[0] = uu.a(var2, (byte) 82);
            break L750;
          }
        }
        L751: {
          var2 = fk.a(false, "directions,1");
          if (null == var2) {
            break L751;
          } else {
            k.field_a[1] = uu.a(var2, (byte) 121);
            break L751;
          }
        }
        L752: {
          var2 = fk.a(false, "directions,2");
          if (var2 == null) {
            break L752;
          } else {
            k.field_a[2] = uu.a(var2, (byte) 8);
            break L752;
          }
        }
        L753: {
          var2 = fk.a(false, "directions,3");
          if (var2 != null) {
            k.field_a[3] = uu.a(var2, (byte) 48);
            break L753;
          } else {
            break L753;
          }
        }
        L754: {
          var2 = fk.a(false, "SLASH");
          if (var2 != null) {
            hs.field_I = uu.a(var2, (byte) -128);
            break L754;
          } else {
            break L754;
          }
        }
        L755: {
          var2 = fk.a(false, "QUIT_MULTI");
          if (var2 != null) {
            tc.field_g = uu.a(var2, (byte) 12);
            break L755;
          } else {
            break L755;
          }
        }
        L756: {
          var2 = fk.a(false, "QUIT_HOTSEAT");
          if (var2 == null) {
            break L756;
          } else {
            vq.field_f = uu.a(var2, (byte) 17);
            break L756;
          }
        }
        L757: {
          var2 = fk.a(false, "QUIT_MISSION");
          if (null != var2) {
            pv.field_d = uu.a(var2, (byte) -111);
            break L757;
          } else {
            break L757;
          }
        }
        L758: {
          var2 = fk.a(false, "PLACE_FIRST");
          if (var2 != null) {
            String discarded$23 = uu.a(var2, (byte) -120);
            break L758;
          } else {
            break L758;
          }
        }
        L759: {
          var2 = fk.a(false, "PLACE_SECOND");
          if (var2 != null) {
            String discarded$24 = uu.a(var2, (byte) -115);
            break L759;
          } else {
            break L759;
          }
        }
        L760: {
          var2 = fk.a(false, "PLACE_THIRD");
          if (null != var2) {
            String discarded$25 = uu.a(var2, (byte) 126);
            break L760;
          } else {
            break L760;
          }
        }
        L761: {
          var2 = fk.a(false, "PLACE_OTHERS");
          if (var2 != null) {
            String discarded$26 = uu.a(var2, (byte) -121);
            break L761;
          } else {
            break L761;
          }
        }
        L762: {
          var2 = fk.a(false, "placedrawn");
          if (null != var2) {
            sp.field_g = uu.a(var2, (byte) -116);
            break L762;
          } else {
            break L762;
          }
        }
        L763: {
          var2 = fk.a(false, "placenames,0");
          if (var2 != null) {
            ph.field_b[0] = uu.a(var2, (byte) 69);
            break L763;
          } else {
            break L763;
          }
        }
        L764: {
          var2 = fk.a(false, "placenames,1");
          if (var2 != null) {
            ph.field_b[1] = uu.a(var2, (byte) -104);
            break L764;
          } else {
            break L764;
          }
        }
        L765: {
          var2 = fk.a(false, "placenames,2");
          if (null != var2) {
            ph.field_b[2] = uu.a(var2, (byte) 23);
            break L765;
          } else {
            break L765;
          }
        }
        L766: {
          var2 = fk.a(false, "placenames,3");
          if (null != var2) {
            ph.field_b[3] = uu.a(var2, (byte) -114);
            break L766;
          } else {
            break L766;
          }
        }
        L767: {
          var2 = fk.a(false, "placenames,4");
          if (null != var2) {
            ph.field_b[4] = uu.a(var2, (byte) 56);
            break L767;
          } else {
            break L767;
          }
        }
        L768: {
          var2 = fk.a(false, "placenames,5");
          if (var2 != null) {
            ph.field_b[5] = uu.a(var2, (byte) -108);
            break L768;
          } else {
            break L768;
          }
        }
        L769: {
          var2 = fk.a(false, "placenames,6");
          if (var2 != null) {
            ph.field_b[6] = uu.a(var2, (byte) -97);
            break L769;
          } else {
            break L769;
          }
        }
        L770: {
          var2 = fk.a(false, "placenames,7");
          if (null == var2) {
            break L770;
          } else {
            ph.field_b[7] = uu.a(var2, (byte) 23);
            break L770;
          }
        }
        L771: {
          var2 = fk.a(false, "QUALITY_HIGH");
          if (var2 != null) {
            dc.field_s = uu.a(var2, (byte) -124);
            break L771;
          } else {
            break L771;
          }
        }
        L772: {
          var2 = fk.a(false, "QUALITY_LOW");
          if (null == var2) {
            break L772;
          } else {
            uk.field_k = uu.a(var2, (byte) 26);
            break L772;
          }
        }
        L773: {
          var2 = fk.a(false, "SKIP_ON");
          if (var2 != null) {
            sk.field_N = uu.a(var2, (byte) -126);
            break L773;
          } else {
            break L773;
          }
        }
        L774: {
          var2 = fk.a(false, "SKIP_OFF");
          if (null != var2) {
            fk.field_a = uu.a(var2, (byte) -121);
            break L774;
          } else {
            break L774;
          }
        }
        L775: {
          var2 = fk.a(false, "LABEL_CAMPAIGNS");
          if (var2 != null) {
            qk.field_f = uu.a(var2, (byte) 14);
            break L775;
          } else {
            break L775;
          }
        }
        L776: {
          var2 = fk.a(false, "LABEL_NEWGAME");
          if (var2 != null) {
            od.field_g = uu.a(var2, (byte) -112);
            break L776;
          } else {
            break L776;
          }
        }
        L777: {
          var2 = fk.a(false, "LABEL_UNITS");
          if (var2 != null) {
            ma.field_Y = uu.a(var2, (byte) 42);
            break L777;
          } else {
            break L777;
          }
        }
        L778: {
          var2 = fk.a(false, "LABEL_CONFIG");
          if (null == var2) {
            break L778;
          } else {
            String discarded$27 = uu.a(var2, (byte) 54);
            break L778;
          }
        }
        L779: {
          var2 = fk.a(false, "LABEL_TUTORIAL");
          if (null == var2) {
            break L779;
          } else {
            ig.field_m = uu.a(var2, (byte) 98);
            break L779;
          }
        }
        L780: {
          var2 = fk.a(false, "LABEL_SANDBOX");
          if (null == var2) {
            break L780;
          } else {
            bj.field_l = uu.a(var2, (byte) 40);
            break L780;
          }
        }
        L781: {
          var2 = fk.a(false, "LABEL_STARTGAME");
          if (null == var2) {
            break L781;
          } else {
            bg.field_b = uu.a(var2, (byte) 126);
            break L781;
          }
        }
        L782: {
          var2 = fk.a(false, "LABEL_PLAYERS");
          if (null != var2) {
            wf.field_s = uu.a(var2, (byte) 89);
            break L782;
          } else {
            break L782;
          }
        }
        L783: {
          var2 = fk.a(false, "LABEL_NUM_AI_PLAYERS");
          if (var2 != null) {
            hc.field_d = uu.a(var2, (byte) 87);
            break L783;
          } else {
            break L783;
          }
        }
        L784: {
          var2 = fk.a(false, "LABEL_MAPTYPE");
          if (var2 != null) {
            field_e = uu.a(var2, (byte) 33);
            break L784;
          } else {
            break L784;
          }
        }
        L785: {
          var2 = fk.a(false, "LABEL_MAPSIZE");
          if (null != var2) {
            qm.field_I = uu.a(var2, (byte) -97);
            break L785;
          } else {
            break L785;
          }
        }
        L786: {
          var2 = fk.a(false, "LABEL_MODEL_VIEWER");
          if (var2 != null) {
            ij.field_C = uu.a(var2, (byte) -111);
            break L786;
          } else {
            break L786;
          }
        }
        L787: {
          var2 = fk.a(false, "LABEL_BATTLE_VIEWER");
          if (null == var2) {
            break L787;
          } else {
            mn.field_r = uu.a(var2, (byte) -108);
            break L787;
          }
        }
        L788: {
          var2 = fk.a(false, "LABEL_FOG_SELECT");
          if (null == var2) {
            break L788;
          } else {
            gv.field_b = uu.a(var2, (byte) -121);
            break L788;
          }
        }
        L789: {
          var2 = fk.a(false, "LABEL_COATOFARMS");
          if (null == var2) {
            break L789;
          } else {
            pf.field_e = uu.a(var2, (byte) -97);
            break L789;
          }
        }
        L790: {
          var2 = fk.a(false, "LABEL_OPTIONS");
          if (var2 == null) {
            break L790;
          } else {
            wd.field_j = uu.a(var2, (byte) 36);
            break L790;
          }
        }
        L791: {
          var2 = fk.a(false, "LABEL_QUALITY");
          if (null != var2) {
            rj.field_G = uu.a(var2, (byte) -117);
            break L791;
          } else {
            break L791;
          }
        }
        L792: {
          var2 = fk.a(false, "LABEL_SKIPBATTLES");
          if (null != var2) {
            lg.field_c = uu.a(var2, (byte) 70);
            break L792;
          } else {
            break L792;
          }
        }
        L793: {
          var2 = fk.a(false, "LABEL_WALKSPEED");
          if (var2 == null) {
            break L793;
          } else {
            up.field_f = uu.a(var2, (byte) -115);
            break L793;
          }
        }
        L794: {
          var2 = fk.a(false, "LABEL_MORE_OPTIONS");
          if (var2 == null) {
            break L794;
          } else {
            kg.field_c = uu.a(var2, (byte) -123);
            break L794;
          }
        }
        L795: {
          var2 = fk.a(false, "LABEL_SLOW");
          if (null != var2) {
            on.field_o = uu.a(var2, (byte) 94);
            break L795;
          } else {
            break L795;
          }
        }
        L796: {
          var2 = fk.a(false, "LABEL_MEDIUM");
          if (var2 == null) {
            break L796;
          } else {
            uh.field_b = uu.a(var2, (byte) -115);
            break L796;
          }
        }
        L797: {
          var2 = fk.a(false, "LABEL_FAST");
          if (null == var2) {
            break L797;
          } else {
            uq.field_v = uu.a(var2, (byte) -126);
            break L797;
          }
        }
        L798: {
          var2 = fk.a(false, "LABEL_INGAME_SINGLE");
          if (var2 == null) {
            break L798;
          } else {
            cb.field_d = uu.a(var2, (byte) 81);
            break L798;
          }
        }
        L799: {
          var2 = fk.a(false, "LABEL_INGAME_MULTI");
          if (var2 != null) {
            cw.field_b = uu.a(var2, (byte) -108);
            break L799;
          } else {
            break L799;
          }
        }
        L800: {
          var2 = fk.a(false, "LABEL_INGAME_MULTI_FINISHED");
          if (null == var2) {
            break L800;
          } else {
            l.field_g = uu.a(var2, (byte) -98);
            break L800;
          }
        }
        L801: {
          var2 = fk.a(false, "LABEL_INGAME_MULTI_SPECTATING");
          if (var2 != null) {
            gg.field_H = uu.a(var2, (byte) 82);
            break L801;
          } else {
            break L801;
          }
        }
        L802: {
          var2 = fk.a(false, "LABEL_MISSION_SELECTION");
          if (var2 == null) {
            break L802;
          } else {
            ni.field_b = uu.a(var2, (byte) 84);
            break L802;
          }
        }
        L803: {
          var2 = fk.a(false, "LABEL_CAMPAIGN_SELECTION");
          if (var2 == null) {
            break L803;
          } else {
            og.field_u = uu.a(var2, (byte) -101);
            break L803;
          }
        }
        L804: {
          var2 = fk.a(false, "LABEL_HOTSEAT");
          if (null == var2) {
            break L804;
          } else {
            nl.field_F = uu.a(var2, (byte) -115);
            break L804;
          }
        }
        L805: {
          var2 = fk.a(false, "LABEL_INSTRUCTIONS");
          if (var2 != null) {
            kw.field_N = uu.a(var2, (byte) 8);
            break L805;
          } else {
            break L805;
          }
        }
        L806: {
          var2 = fk.a(false, "LABEL_ACHIEVEMENTS");
          if (var2 != null) {
            pu.field_h = uu.a(var2, (byte) 7);
            break L806;
          } else {
            break L806;
          }
        }
        L807: {
          var2 = fk.a(false, "LABEL_GAME_ACHIEVEMENTS");
          if (null == var2) {
            break L807;
          } else {
            jn.field_e = uu.a(var2, (byte) -95);
            break L807;
          }
        }
        L808: {
          var2 = fk.a(false, "LABEL_INVITE_LOGIN");
          if (var2 == null) {
            break L808;
          } else {
            nw.field_z = uu.a(var2, (byte) -93);
            break L808;
          }
        }
        L809: {
          var2 = fk.a(false, "LABEL_ERROR");
          if (var2 == null) {
            break L809;
          } else {
            nh.field_J = uu.a(var2, (byte) -123);
            break L809;
          }
        }
        L810: {
          var2 = fk.a(false, "LABEL_SPELLBOOK");
          if (null == var2) {
            break L810;
          } else {
            bk.field_b = uu.a(var2, (byte) 11);
            break L810;
          }
        }
        L811: {
          var2 = fk.a(false, "LABEL_COA");
          if (null != var2) {
            ar.field_y = uu.a(var2, (byte) -96);
            break L811;
          } else {
            break L811;
          }
        }
        L812: {
          var2 = fk.a(false, "LABEL_SETTINGS");
          if (var2 != null) {
            ov.field_d = uu.a(var2, (byte) 123);
            break L812;
          } else {
            break L812;
          }
        }
        L813: {
          var2 = fk.a(false, "LABEL_BENEFITS");
          if (var2 == null) {
            break L813;
          } else {
            hc.field_w = uu.a(var2, (byte) 93);
            break L813;
          }
        }
        L814: {
          var2 = fk.a(false, "LABEL_SETTINGS_INGAME");
          if (null == var2) {
            break L814;
          } else {
            ke.field_f = uu.a(var2, (byte) 24);
            break L814;
          }
        }
        L815: {
          var2 = fk.a(false, "LABEL_TRINKETS");
          if (null != var2) {
            dd.field_g = uu.a(var2, (byte) 119);
            break L815;
          } else {
            break L815;
          }
        }
        L816: {
          var2 = fk.a(false, "LABEL_RETURN_COFNIRM");
          if (null == var2) {
            break L816;
          } else {
            hm.field_e = uu.a(var2, (byte) 26);
            break L816;
          }
        }
        L817: {
          var2 = fk.a(false, "LABEL_RETURN_QUESTION");
          if (var2 == null) {
            break L817;
          } else {
            mu.field_e = uu.a(var2, (byte) -106);
            break L817;
          }
        }
        L818: {
          var2 = fk.a(false, "LABEL_RESTART_QUESTION");
          if (null != var2) {
            vd.field_a = uu.a(var2, (byte) 127);
            break L818;
          } else {
            break L818;
          }
        }
        L819: {
          var2 = fk.a(false, "LABEL_PRESTIGE");
          if (null == var2) {
            break L819;
          } else {
            dk.field_x = uu.a(var2, (byte) 7);
            break L819;
          }
        }
        L820: {
          var2 = fk.a(false, "LABEL_MEMBERS");
          if (null != var2) {
            od.field_f = uu.a(var2, (byte) -112);
            break L820;
          } else {
            break L820;
          }
        }
        L821: {
          var2 = fk.a(false, "LABEL_NONMEMBERS");
          if (null != var2) {
            vg.field_l = uu.a(var2, (byte) 117);
            break L821;
          } else {
            break L821;
          }
        }
        L822: {
          var2 = fk.a(false, "LABEL_YES");
          if (null == var2) {
            break L822;
          } else {
            nt.field_p = uu.a(var2, (byte) -105);
            break L822;
          }
        }
        L823: {
          var2 = fk.a(false, "LABEL_NO");
          if (null != var2) {
            oa.field_G = uu.a(var2, (byte) -111);
            break L823;
          } else {
            break L823;
          }
        }
        L824: {
          var2 = fk.a(false, "LABEL_STATS");
          if (var2 != null) {
            lw.field_lb = uu.a(var2, (byte) 110);
            break L824;
          } else {
            break L824;
          }
        }
        L825: {
          var2 = fk.a(false, "LABEL_ZAMORAK_HIGHSCORE");
          if (var2 != null) {
            lb.field_d = uu.a(var2, (byte) -125);
            break L825;
          } else {
            break L825;
          }
        }
        L826: {
          var2 = fk.a(false, "LABEL_SARADOMIN_HIGHSCORE");
          if (null != var2) {
            gk.field_P = uu.a(var2, (byte) 12);
            break L826;
          } else {
            break L826;
          }
        }
        L827: {
          var2 = fk.a(false, "LABEL_GUTHIX_HIGHSCORE");
          if (null != var2) {
            mh.field_d = uu.a(var2, (byte) 73);
            break L827;
          } else {
            break L827;
          }
        }
        L828: {
          var2 = fk.a(false, "RESULTS_PERFORMANCE");
          if (null != var2) {
            cs.field_eb = uu.a(var2, (byte) -111);
            break L828;
          } else {
            break L828;
          }
        }
        L829: {
          var2 = fk.a(false, "RESULTS_TURNSUSED");
          if (null == var2) {
            break L829;
          } else {
            fg.field_m = uu.a(var2, (byte) -123);
            break L829;
          }
        }
        L830: {
          var2 = fk.a(false, "RESULTS_DAMAGETAKEN");
          if (null != var2) {
            as.field_y = uu.a(var2, (byte) 91);
            break L830;
          } else {
            break L830;
          }
        }
        L831: {
          var2 = fk.a(false, "RESULTS_FINALSCORE");
          if (var2 != null) {
            qf.field_g = uu.a(var2, (byte) -127);
            break L831;
          } else {
            break L831;
          }
        }
        L832: {
          var2 = fk.a(false, "INTRO_0");
          if (var2 != null) {
            ts.field_b = uu.a(var2, (byte) -119);
            break L832;
          } else {
            break L832;
          }
        }
        L833: {
          var2 = fk.a(false, "INTRO_1");
          if (null != var2) {
            wi.field_a = uu.a(var2, (byte) 7);
            break L833;
          } else {
            break L833;
          }
        }
        L834: {
          var2 = fk.a(false, "INTRO_2");
          if (null != var2) {
            rf.field_e = uu.a(var2, (byte) -92);
            break L834;
          } else {
            break L834;
          }
        }
        L835: {
          var2 = fk.a(false, "INTRO_3");
          if (null != var2) {
            je.field_lb = uu.a(var2, (byte) 55);
            break L835;
          } else {
            break L835;
          }
        }
        L836: {
          var2 = fk.a(false, "INTRO_4");
          if (var2 != null) {
            ob.field_P = uu.a(var2, (byte) -128);
            break L836;
          } else {
            break L836;
          }
        }
        L837: {
          var2 = fk.a(false, "TEXT_ON");
          if (var2 == null) {
            break L837;
          } else {
            dn.field_Mb = uu.a(var2, (byte) 78);
            break L837;
          }
        }
        L838: {
          var2 = fk.a(false, "TEXT_OFF");
          if (var2 == null) {
            break L838;
          } else {
            qd.field_J = uu.a(var2, (byte) -124);
            break L838;
          }
        }
        L839: {
          var2 = fk.a(false, "TUT_TEXT,0");
          if (null != var2) {
            ci.field_f[0] = uu.a(var2, (byte) 103);
            break L839;
          } else {
            break L839;
          }
        }
        L840: {
          var2 = fk.a(false, "TUT_TEXT,1");
          if (null != var2) {
            ci.field_f[1] = uu.a(var2, (byte) -102);
            break L840;
          } else {
            break L840;
          }
        }
        L841: {
          var2 = fk.a(false, "TUT_TEXT,2");
          if (var2 != null) {
            ci.field_f[2] = uu.a(var2, (byte) 10);
            break L841;
          } else {
            break L841;
          }
        }
        L842: {
          var2 = fk.a(false, "TUT_TEXT,3");
          if (null != var2) {
            ci.field_f[3] = uu.a(var2, (byte) 106);
            break L842;
          } else {
            break L842;
          }
        }
        L843: {
          var2 = fk.a(false, "TUT_TEXT,4");
          if (null == var2) {
            break L843;
          } else {
            ci.field_f[4] = uu.a(var2, (byte) 83);
            break L843;
          }
        }
        L844: {
          var2 = fk.a(false, "TUT_TEXT,5");
          if (null != var2) {
            ci.field_f[5] = uu.a(var2, (byte) 80);
            break L844;
          } else {
            break L844;
          }
        }
        L845: {
          var2 = fk.a(false, "TUT_TEXT,6");
          if (var2 == null) {
            break L845;
          } else {
            ci.field_f[6] = uu.a(var2, (byte) 106);
            break L845;
          }
        }
        L846: {
          var2 = fk.a(false, "TUT_TEXT,7");
          if (var2 == null) {
            break L846;
          } else {
            ci.field_f[7] = uu.a(var2, (byte) 93);
            break L846;
          }
        }
        L847: {
          var2 = fk.a(false, "TUT_TEXT,8");
          if (var2 != null) {
            ci.field_f[8] = uu.a(var2, (byte) -108);
            break L847;
          } else {
            break L847;
          }
        }
        L848: {
          var2 = fk.a(false, "TUT_TEXT,9");
          if (var2 == null) {
            break L848;
          } else {
            ci.field_f[9] = uu.a(var2, (byte) 123);
            break L848;
          }
        }
        L849: {
          var2 = fk.a(false, "TUT_TEXT,10");
          if (var2 != null) {
            ci.field_f[10] = uu.a(var2, (byte) 35);
            break L849;
          } else {
            break L849;
          }
        }
        L850: {
          var2 = fk.a(false, "TUT_TEXT,11");
          if (var2 != null) {
            ci.field_f[11] = uu.a(var2, (byte) -127);
            break L850;
          } else {
            break L850;
          }
        }
        L851: {
          var2 = fk.a(false, "TUT_TEXT,12");
          if (null != var2) {
            ci.field_f[12] = uu.a(var2, (byte) -102);
            break L851;
          } else {
            break L851;
          }
        }
        L852: {
          var2 = fk.a(false, "TUT_TEXT,13");
          if (null != var2) {
            ci.field_f[13] = uu.a(var2, (byte) -114);
            break L852;
          } else {
            break L852;
          }
        }
        L853: {
          var2 = fk.a(false, "TUT_TEXT,14");
          if (var2 != null) {
            ci.field_f[14] = uu.a(var2, (byte) 28);
            break L853;
          } else {
            break L853;
          }
        }
        L854: {
          var2 = fk.a(false, "TUT_TEXT,15");
          if (var2 != null) {
            ci.field_f[15] = uu.a(var2, (byte) 13);
            break L854;
          } else {
            break L854;
          }
        }
        L855: {
          var2 = fk.a(false, "TUT_TEXT,16");
          if (var2 == null) {
            break L855;
          } else {
            ci.field_f[16] = uu.a(var2, (byte) -110);
            break L855;
          }
        }
        L856: {
          var2 = fk.a(false, "TUT_TEXT,17");
          if (null == var2) {
            break L856;
          } else {
            ci.field_f[17] = uu.a(var2, (byte) -107);
            break L856;
          }
        }
        L857: {
          var2 = fk.a(false, "TUT_TEXT,18");
          if (var2 == null) {
            break L857;
          } else {
            ci.field_f[18] = uu.a(var2, (byte) 48);
            break L857;
          }
        }
        L858: {
          var2 = fk.a(false, "TUT_TEXT,19");
          if (var2 != null) {
            ci.field_f[19] = uu.a(var2, (byte) -124);
            break L858;
          } else {
            break L858;
          }
        }
        L859: {
          var2 = fk.a(false, "TUT_TEXT,20");
          if (var2 != null) {
            ci.field_f[20] = uu.a(var2, (byte) 69);
            break L859;
          } else {
            break L859;
          }
        }
        L860: {
          var2 = fk.a(false, "TUT_TEXT,21");
          if (null != var2) {
            ci.field_f[21] = uu.a(var2, (byte) -125);
            break L860;
          } else {
            break L860;
          }
        }
        L861: {
          var2 = fk.a(false, "TUT_TEXT,22");
          if (null != var2) {
            ci.field_f[22] = uu.a(var2, (byte) 26);
            break L861;
          } else {
            break L861;
          }
        }
        L862: {
          var2 = fk.a(false, "TUT_TEXT,23");
          if (var2 != null) {
            ci.field_f[23] = uu.a(var2, (byte) 96);
            break L862;
          } else {
            break L862;
          }
        }
        L863: {
          var2 = fk.a(false, "TUT_TEXT,24");
          if (var2 != null) {
            ci.field_f[24] = uu.a(var2, (byte) -99);
            break L863;
          } else {
            break L863;
          }
        }
        L864: {
          var2 = fk.a(false, "TUT_TEXT,25");
          if (null != var2) {
            ci.field_f[25] = uu.a(var2, (byte) 62);
            break L864;
          } else {
            break L864;
          }
        }
        L865: {
          var2 = fk.a(false, "TUT_TEXT,26");
          if (var2 == null) {
            break L865;
          } else {
            ci.field_f[26] = uu.a(var2, (byte) -107);
            break L865;
          }
        }
        L866: {
          var2 = fk.a(false, "TUT_TEXT,27");
          if (null != var2) {
            ci.field_f[27] = uu.a(var2, (byte) 15);
            break L866;
          } else {
            break L866;
          }
        }
        L867: {
          var2 = fk.a(false, "DEFEATLEADER");
          if (null != var2) {
            qt.field_a = uu.a(var2, (byte) -123);
            break L867;
          } else {
            break L867;
          }
        }
        L868: {
          var2 = fk.a(false, "CAPTUREGOAL");
          if (var2 == null) {
            break L868;
          } else {
            jj.field_f = uu.a(var2, (byte) -116);
            break L868;
          }
        }
        L869: {
          var2 = fk.a(false, "CAPTUREGOALORDEFEATLEADER");
          if (var2 == null) {
            break L869;
          } else {
            pp.field_Y = uu.a(var2, (byte) -93);
            break L869;
          }
        }
        L870: {
          var2 = fk.a(false, "PREVENTSUMMONING");
          if (null != var2) {
            bk.field_c = uu.a(var2, (byte) 9);
            break L870;
          } else {
            break L870;
          }
        }
        L871: {
          var2 = fk.a(false, "DEFEATALLENEMIES");
          if (var2 != null) {
            pl.field_C = uu.a(var2, (byte) 18);
            break L871;
          } else {
            break L871;
          }
        }
        L872: {
          var2 = fk.a(false, "ESCORTLEADER");
          if (var2 != null) {
            fa.field_g = uu.a(var2, (byte) 81);
            break L872;
          } else {
            break L872;
          }
        }
        L873: {
          var2 = fk.a(false, "CLOSE");
          if (var2 == null) {
            break L873;
          } else {
            al.field_m = uu.a(var2, (byte) 73);
            break L873;
          }
        }
        L874: {
          var2 = fk.a(false, "CONTINUE");
          if (null == var2) {
            break L874;
          } else {
            qf.field_c = uu.a(var2, (byte) 101);
            break L874;
          }
        }
        L875: {
          var2 = fk.a(false, "OBJHIDE");
          if (var2 == null) {
            break L875;
          } else {
            kj.field_t = uu.a(var2, (byte) 91);
            break L875;
          }
        }
        L876: {
          var2 = fk.a(false, "OBJSHOW");
          if (null != var2) {
            vg.field_k = uu.a(var2, (byte) 49);
            break L876;
          } else {
            break L876;
          }
        }
        L877: {
          var2 = fk.a(false, "TUTHIDE");
          if (null != var2) {
            jk.field_a = uu.a(var2, (byte) 53);
            break L877;
          } else {
            break L877;
          }
        }
        L878: {
          var2 = fk.a(false, "TUTSHOW");
          if (var2 != null) {
            pl.field_z = uu.a(var2, (byte) 79);
            break L878;
          } else {
            break L878;
          }
        }
        L879: {
          var2 = fk.a(false, "TUTWAIT");
          if (null == var2) {
            break L879;
          } else {
            bc.field_f = uu.a(var2, (byte) 82);
            break L879;
          }
        }
        L880: {
          var2 = fk.a(false, "TUTEND");
          if (var2 != null) {
            ac.field_u = uu.a(var2, (byte) -120);
            break L880;
          } else {
            break L880;
          }
        }
        L881: {
          var2 = fk.a(false, "MANA_LOTS");
          if (var2 == null) {
            break L881;
          } else {
            String discarded$28 = uu.a(var2, (byte) 107);
            break L881;
          }
        }
        L882: {
          var2 = fk.a(false, "SPELLBOOK_PURCHASE");
          if (null != var2) {
            wv.field_e = uu.a(var2, (byte) -112);
            break L882;
          } else {
            break L882;
          }
        }
        L883: {
          var2 = fk.a(false, "SPELLBOOK_OWNED");
          if (var2 == null) {
            break L883;
          } else {
            iq.field_b = uu.a(var2, (byte) 17);
            break L883;
          }
        }
        L884: {
          var2 = fk.a(false, "SPELLBOOK_FREE");
          if (var2 == null) {
            break L884;
          } else {
            tc.field_d = uu.a(var2, (byte) -121);
            break L884;
          }
        }
        L885: {
          var2 = fk.a(false, "SPELLBOOK_RUNES");
          if (null != var2) {
            lm.field_f = uu.a(var2, (byte) -120);
            break L885;
          } else {
            break L885;
          }
        }
        L886: {
          var2 = fk.a(false, "SPELLBOOK_RUNE");
          if (null != var2) {
            bt.field_b = uu.a(var2, (byte) -106);
            break L886;
          } else {
            break L886;
          }
        }
        L887: {
          var2 = fk.a(false, "SPELLBOOK_PURSE");
          if (var2 != null) {
            ov.field_f = uu.a(var2, (byte) 17);
            break L887;
          } else {
            break L887;
          }
        }
        L888: {
          var2 = fk.a(false, "TRINKET_HAVE");
          if (var2 == null) {
            break L888;
          } else {
            me.field_a = uu.a(var2, (byte) -125);
            break L888;
          }
        }
        L889: {
          var2 = fk.a(false, "MESSAGE_LOADING");
          if (var2 == null) {
            break L889;
          } else {
            vp.field_A = uu.a(var2, (byte) 78);
            break L889;
          }
        }
        L890: {
          var2 = fk.a(false, "MESSAGE_QUIT");
          if (null == var2) {
            break L890;
          } else {
            wd.field_g = uu.a(var2, (byte) -126);
            break L890;
          }
        }
        L891: {
          var2 = fk.a(false, "MESSAGE_DEAD");
          if (var2 == null) {
            break L891;
          } else {
            mq.field_Mb = uu.a(var2, (byte) -126);
            break L891;
          }
        }
        L892: {
          var2 = fk.a(false, "MESSAGE_DRAW");
          if (null != var2) {
            bk.field_h = uu.a(var2, (byte) -117);
            break L892;
          } else {
            break L892;
          }
        }
        L893: {
          var2 = fk.a(false, "MESSAGE_UNDRAW");
          if (null != var2) {
            q.field_y = uu.a(var2, (byte) 113);
            break L893;
          } else {
            break L893;
          }
        }
        L894: {
          var2 = fk.a(false, "trinketnames,0");
          if (null == var2) {
            break L894;
          } else {
            fq.field_f[0] = uu.a(var2, (byte) -116);
            break L894;
          }
        }
        L895: {
          var2 = fk.a(false, "trinketnames,1");
          if (var2 == null) {
            break L895;
          } else {
            fq.field_f[1] = uu.a(var2, (byte) -96);
            break L895;
          }
        }
        L896: {
          var2 = fk.a(false, "trinketnames,2");
          if (null != var2) {
            fq.field_f[2] = uu.a(var2, (byte) 42);
            break L896;
          } else {
            break L896;
          }
        }
        L897: {
          var2 = fk.a(false, "trinketnames,3");
          if (null == var2) {
            break L897;
          } else {
            fq.field_f[3] = uu.a(var2, (byte) 108);
            break L897;
          }
        }
        L898: {
          var2 = fk.a(false, "trinketnames,4");
          if (var2 != null) {
            fq.field_f[4] = uu.a(var2, (byte) 94);
            break L898;
          } else {
            break L898;
          }
        }
        L899: {
          var2 = fk.a(false, "trinketnames,5");
          if (var2 != null) {
            fq.field_f[5] = uu.a(var2, (byte) -128);
            break L899;
          } else {
            break L899;
          }
        }
        L900: {
          var2 = fk.a(false, "trinketnames,6");
          if (var2 == null) {
            break L900;
          } else {
            fq.field_f[6] = uu.a(var2, (byte) -125);
            break L900;
          }
        }
        L901: {
          var2 = fk.a(false, "trinketnames,7");
          if (null != var2) {
            fq.field_f[7] = uu.a(var2, (byte) -114);
            break L901;
          } else {
            break L901;
          }
        }
        L902: {
          var2 = fk.a(false, "trinketnames,8");
          if (null == var2) {
            break L902;
          } else {
            fq.field_f[8] = uu.a(var2, (byte) 43);
            break L902;
          }
        }
        L903: {
          var2 = fk.a(false, "trinketnames,9");
          if (var2 != null) {
            fq.field_f[9] = uu.a(var2, (byte) -109);
            break L903;
          } else {
            break L903;
          }
        }
        L904: {
          var2 = fk.a(false, "trinketnames,10");
          if (var2 != null) {
            fq.field_f[10] = uu.a(var2, (byte) -127);
            break L904;
          } else {
            break L904;
          }
        }
        L905: {
          var2 = fk.a(false, "trinketnames,11");
          if (null != var2) {
            fq.field_f[11] = uu.a(var2, (byte) -122);
            break L905;
          } else {
            break L905;
          }
        }
        L906: {
          var2 = fk.a(false, "trinketnames,12");
          if (null != var2) {
            fq.field_f[12] = uu.a(var2, (byte) -102);
            break L906;
          } else {
            break L906;
          }
        }
        L907: {
          var2 = fk.a(false, "trinketnames,13");
          if (var2 == null) {
            break L907;
          } else {
            fq.field_f[13] = uu.a(var2, (byte) 112);
            break L907;
          }
        }
        L908: {
          var2 = fk.a(false, "trinketnames,14");
          if (var2 == null) {
            break L908;
          } else {
            fq.field_f[14] = uu.a(var2, (byte) 11);
            break L908;
          }
        }
        L909: {
          var2 = fk.a(false, "trinketnames,15");
          if (var2 == null) {
            break L909;
          } else {
            fq.field_f[15] = uu.a(var2, (byte) 98);
            break L909;
          }
        }
        L910: {
          var2 = fk.a(false, "trinketnames,16");
          if (null != var2) {
            fq.field_f[16] = uu.a(var2, (byte) -95);
            break L910;
          } else {
            break L910;
          }
        }
        L911: {
          var2 = fk.a(false, "trinketnames,17");
          if (var2 != null) {
            fq.field_f[17] = uu.a(var2, (byte) -121);
            break L911;
          } else {
            break L911;
          }
        }
        L912: {
          var2 = fk.a(false, "trinketnames,18");
          if (null == var2) {
            break L912;
          } else {
            fq.field_f[18] = uu.a(var2, (byte) 121);
            break L912;
          }
        }
        L913: {
          var2 = fk.a(false, "trinketnames,19");
          if (null != var2) {
            fq.field_f[19] = uu.a(var2, (byte) 108);
            break L913;
          } else {
            break L913;
          }
        }
        L914: {
          var2 = fk.a(false, "trinketnames,20");
          if (var2 == null) {
            break L914;
          } else {
            fq.field_f[20] = uu.a(var2, (byte) 16);
            break L914;
          }
        }
        L915: {
          var2 = fk.a(false, "trinketnames,21");
          if (var2 != null) {
            fq.field_f[21] = uu.a(var2, (byte) -117);
            break L915;
          } else {
            break L915;
          }
        }
        L916: {
          var2 = fk.a(false, "trinketnames,22");
          if (null != var2) {
            fq.field_f[22] = uu.a(var2, (byte) 98);
            break L916;
          } else {
            break L916;
          }
        }
        L917: {
          var2 = fk.a(false, "trinketnames,23");
          if (null != var2) {
            fq.field_f[23] = uu.a(var2, (byte) 16);
            break L917;
          } else {
            break L917;
          }
        }
        L918: {
          var2 = fk.a(false, "trinketnames,24");
          if (var2 != null) {
            fq.field_f[24] = uu.a(var2, (byte) -107);
            break L918;
          } else {
            break L918;
          }
        }
        L919: {
          var2 = fk.a(false, "trinketnames,25");
          if (var2 == null) {
            break L919;
          } else {
            fq.field_f[25] = uu.a(var2, (byte) 123);
            break L919;
          }
        }
        L920: {
          var2 = fk.a(false, "trinketnames,26");
          if (var2 != null) {
            fq.field_f[26] = uu.a(var2, (byte) 105);
            break L920;
          } else {
            break L920;
          }
        }
        L921: {
          var2 = fk.a(false, "trinketnames,27");
          if (null != var2) {
            fq.field_f[27] = uu.a(var2, (byte) -127);
            break L921;
          } else {
            break L921;
          }
        }
        L922: {
          var2 = fk.a(false, "trinketnames,28");
          if (var2 == null) {
            break L922;
          } else {
            fq.field_f[28] = uu.a(var2, (byte) 12);
            break L922;
          }
        }
        L923: {
          var2 = fk.a(false, "trinketnames,29");
          if (var2 == null) {
            break L923;
          } else {
            fq.field_f[29] = uu.a(var2, (byte) 89);
            break L923;
          }
        }
        L924: {
          var2 = fk.a(false, "trinketnames,30");
          if (var2 == null) {
            break L924;
          } else {
            fq.field_f[30] = uu.a(var2, (byte) -127);
            break L924;
          }
        }
        L925: {
          var2 = fk.a(false, "trinketnames,31");
          if (null == var2) {
            break L925;
          } else {
            fq.field_f[31] = uu.a(var2, (byte) -122);
            break L925;
          }
        }
        L926: {
          var2 = fk.a(false, "trinketnames,32");
          if (var2 == null) {
            break L926;
          } else {
            fq.field_f[32] = uu.a(var2, (byte) -118);
            break L926;
          }
        }
        L927: {
          var2 = fk.a(false, "trinketnames,33");
          if (null != var2) {
            fq.field_f[33] = uu.a(var2, (byte) -113);
            break L927;
          } else {
            break L927;
          }
        }
        L928: {
          var2 = fk.a(false, "trinketnames,34");
          if (var2 != null) {
            fq.field_f[34] = uu.a(var2, (byte) 12);
            break L928;
          } else {
            break L928;
          }
        }
        L929: {
          var2 = fk.a(false, "trinketnames,35");
          if (null == var2) {
            break L929;
          } else {
            fq.field_f[35] = uu.a(var2, (byte) -113);
            break L929;
          }
        }
        L930: {
          var2 = fk.a(false, "trinketnames,36");
          if (null != var2) {
            fq.field_f[36] = uu.a(var2, (byte) 60);
            break L930;
          } else {
            break L930;
          }
        }
        L931: {
          var2 = fk.a(false, "trinketnames,37");
          if (null != var2) {
            fq.field_f[37] = uu.a(var2, (byte) 9);
            break L931;
          } else {
            break L931;
          }
        }
        L932: {
          var2 = fk.a(false, "trinketnames,38");
          if (null == var2) {
            break L932;
          } else {
            fq.field_f[38] = uu.a(var2, (byte) 28);
            break L932;
          }
        }
        L933: {
          var2 = fk.a(false, "trinketnames,39");
          if (var2 != null) {
            fq.field_f[39] = uu.a(var2, (byte) -100);
            break L933;
          } else {
            break L933;
          }
        }
        L934: {
          var2 = fk.a(false, "trinketnames,40");
          if (var2 != null) {
            fq.field_f[40] = uu.a(var2, (byte) -94);
            break L934;
          } else {
            break L934;
          }
        }
        L935: {
          var2 = fk.a(false, "trinketnames,41");
          if (var2 == null) {
            break L935;
          } else {
            fq.field_f[41] = uu.a(var2, (byte) -113);
            break L935;
          }
        }
        L936: {
          var2 = fk.a(false, "trinketnames,42");
          if (var2 != null) {
            fq.field_f[42] = uu.a(var2, (byte) 75);
            break L936;
          } else {
            break L936;
          }
        }
        L937: {
          var2 = fk.a(false, "trinketnames,43");
          if (var2 == null) {
            break L937;
          } else {
            fq.field_f[43] = uu.a(var2, (byte) -93);
            break L937;
          }
        }
        L938: {
          var2 = fk.a(false, "trinketnames,44");
          if (null == var2) {
            break L938;
          } else {
            fq.field_f[44] = uu.a(var2, (byte) -108);
            break L938;
          }
        }
        L939: {
          var2 = fk.a(false, "trinketnames,45");
          if (null != var2) {
            fq.field_f[45] = uu.a(var2, (byte) 116);
            break L939;
          } else {
            break L939;
          }
        }
        L940: {
          var2 = fk.a(false, "trinketnames,46");
          if (null != var2) {
            fq.field_f[46] = uu.a(var2, (byte) -119);
            break L940;
          } else {
            break L940;
          }
        }
        L941: {
          var2 = fk.a(false, "trinketnames,47");
          if (var2 != null) {
            fq.field_f[47] = uu.a(var2, (byte) -128);
            break L941;
          } else {
            break L941;
          }
        }
        L942: {
          var2 = fk.a(false, "trinketnames,48");
          if (var2 != null) {
            fq.field_f[48] = uu.a(var2, (byte) -103);
            break L942;
          } else {
            break L942;
          }
        }
        L943: {
          var2 = fk.a(false, "trinketnames,49");
          if (null == var2) {
            break L943;
          } else {
            fq.field_f[49] = uu.a(var2, (byte) -112);
            break L943;
          }
        }
        L944: {
          var2 = fk.a(false, "trinketnames,50");
          if (null == var2) {
            break L944;
          } else {
            fq.field_f[50] = uu.a(var2, (byte) -121);
            break L944;
          }
        }
        L945: {
          var2 = fk.a(false, "trinketnames,51");
          if (var2 == null) {
            break L945;
          } else {
            fq.field_f[51] = uu.a(var2, (byte) -102);
            break L945;
          }
        }
        L946: {
          var2 = fk.a(false, "trinketnames,52");
          if (var2 != null) {
            fq.field_f[52] = uu.a(var2, (byte) 4);
            break L946;
          } else {
            break L946;
          }
        }
        L947: {
          var2 = fk.a(false, "trinketnames,53");
          if (null == var2) {
            break L947;
          } else {
            fq.field_f[53] = uu.a(var2, (byte) -101);
            break L947;
          }
        }
        L948: {
          var2 = fk.a(false, "trinketnames,54");
          if (null != var2) {
            fq.field_f[54] = uu.a(var2, (byte) 110);
            break L948;
          } else {
            break L948;
          }
        }
        L949: {
          var2 = fk.a(false, "trinketnames,55");
          if (var2 != null) {
            fq.field_f[55] = uu.a(var2, (byte) -108);
            break L949;
          } else {
            break L949;
          }
        }
        L950: {
          var2 = fk.a(false, "trinketnames,56");
          if (var2 != null) {
            fq.field_f[56] = uu.a(var2, (byte) -110);
            break L950;
          } else {
            break L950;
          }
        }
        L951: {
          var2 = fk.a(false, "trinketnames,57");
          if (var2 == null) {
            break L951;
          } else {
            fq.field_f[57] = uu.a(var2, (byte) -120);
            break L951;
          }
        }
        L952: {
          var2 = fk.a(false, "trinketnames,58");
          if (var2 == null) {
            break L952;
          } else {
            fq.field_f[58] = uu.a(var2, (byte) 43);
            break L952;
          }
        }
        L953: {
          var2 = fk.a(false, "trinketnames,59");
          if (var2 == null) {
            break L953;
          } else {
            fq.field_f[59] = uu.a(var2, (byte) 17);
            break L953;
          }
        }
        L954: {
          var2 = fk.a(false, "trinketnames,60");
          if (null != var2) {
            fq.field_f[60] = uu.a(var2, (byte) 20);
            break L954;
          } else {
            break L954;
          }
        }
        L955: {
          var2 = fk.a(false, "trinketnames,61");
          if (var2 == null) {
            break L955;
          } else {
            fq.field_f[61] = uu.a(var2, (byte) 7);
            break L955;
          }
        }
        L956: {
          var2 = fk.a(false, "trinketnames,62");
          if (null == var2) {
            break L956;
          } else {
            fq.field_f[62] = uu.a(var2, (byte) 14);
            break L956;
          }
        }
        L957: {
          var2 = fk.a(false, "trinketnames,63");
          if (null == var2) {
            break L957;
          } else {
            fq.field_f[63] = uu.a(var2, (byte) -96);
            break L957;
          }
        }
        L958: {
          var2 = fk.a(false, "trinketnames,64");
          if (var2 == null) {
            break L958;
          } else {
            fq.field_f[64] = uu.a(var2, (byte) 62);
            break L958;
          }
        }
        L959: {
          var2 = fk.a(false, "trinketnames,65");
          if (null != var2) {
            fq.field_f[65] = uu.a(var2, (byte) 123);
            break L959;
          } else {
            break L959;
          }
        }
        L960: {
          var2 = fk.a(false, "trinketnames,66");
          if (var2 == null) {
            break L960;
          } else {
            fq.field_f[66] = uu.a(var2, (byte) -106);
            break L960;
          }
        }
        L961: {
          var2 = fk.a(false, "trinketnames,67");
          if (null == var2) {
            break L961;
          } else {
            fq.field_f[67] = uu.a(var2, (byte) -108);
            break L961;
          }
        }
        L962: {
          var2 = fk.a(false, "trinketnames,68");
          if (null != var2) {
            fq.field_f[68] = uu.a(var2, (byte) 56);
            break L962;
          } else {
            break L962;
          }
        }
        L963: {
          var2 = fk.a(false, "trinketnames,69");
          if (null != var2) {
            fq.field_f[69] = uu.a(var2, (byte) 42);
            break L963;
          } else {
            break L963;
          }
        }
        L964: {
          var2 = fk.a(false, "trinketnames,70");
          if (var2 == null) {
            break L964;
          } else {
            fq.field_f[70] = uu.a(var2, (byte) -118);
            break L964;
          }
        }
        L965: {
          var2 = fk.a(false, "trinketnames,71");
          if (null == var2) {
            break L965;
          } else {
            fq.field_f[71] = uu.a(var2, (byte) 121);
            break L965;
          }
        }
        L966: {
          var2 = fk.a(false, "trinketnames,72");
          if (var2 == null) {
            break L966;
          } else {
            fq.field_f[72] = uu.a(var2, (byte) -114);
            break L966;
          }
        }
        L967: {
          var2 = fk.a(false, "trinketnames,73");
          if (null != var2) {
            fq.field_f[73] = uu.a(var2, (byte) -126);
            break L967;
          } else {
            break L967;
          }
        }
        L968: {
          var2 = fk.a(false, "trinketnames,74");
          if (null != var2) {
            fq.field_f[74] = uu.a(var2, (byte) -127);
            break L968;
          } else {
            break L968;
          }
        }
        L969: {
          var2 = fk.a(false, "trinketnames,75");
          if (null != var2) {
            fq.field_f[75] = uu.a(var2, (byte) -109);
            break L969;
          } else {
            break L969;
          }
        }
        L970: {
          var2 = fk.a(false, "trinketnames,76");
          if (null == var2) {
            break L970;
          } else {
            fq.field_f[76] = uu.a(var2, (byte) 61);
            break L970;
          }
        }
        L971: {
          var2 = fk.a(false, "trinketnames,77");
          if (null == var2) {
            break L971;
          } else {
            fq.field_f[77] = uu.a(var2, (byte) -103);
            break L971;
          }
        }
        L972: {
          var2 = fk.a(false, "trinketnames,78");
          if (var2 != null) {
            fq.field_f[78] = uu.a(var2, (byte) 41);
            break L972;
          } else {
            break L972;
          }
        }
        L973: {
          var2 = fk.a(false, "trinketnames,79");
          if (null == var2) {
            break L973;
          } else {
            fq.field_f[79] = uu.a(var2, (byte) 8);
            break L973;
          }
        }
        L974: {
          var2 = fk.a(false, "trinketnames,80");
          if (null != var2) {
            fq.field_f[80] = uu.a(var2, (byte) 3);
            break L974;
          } else {
            break L974;
          }
        }
        L975: {
          var2 = fk.a(false, "trinketnames,81");
          if (null == var2) {
            break L975;
          } else {
            fq.field_f[81] = uu.a(var2, (byte) 67);
            break L975;
          }
        }
        L976: {
          var2 = fk.a(false, "trinketnames,82");
          if (null != var2) {
            fq.field_f[82] = uu.a(var2, (byte) -103);
            break L976;
          } else {
            break L976;
          }
        }
        L977: {
          var2 = fk.a(false, "trinketnames,83");
          if (null != var2) {
            fq.field_f[83] = uu.a(var2, (byte) 98);
            break L977;
          } else {
            break L977;
          }
        }
        L978: {
          var2 = fk.a(false, "trinketnames,84");
          if (null == var2) {
            break L978;
          } else {
            fq.field_f[84] = uu.a(var2, (byte) 126);
            break L978;
          }
        }
        L979: {
          var2 = fk.a(false, "trinketnames,85");
          if (null != var2) {
            fq.field_f[85] = uu.a(var2, (byte) -105);
            break L979;
          } else {
            break L979;
          }
        }
        L980: {
          var2 = fk.a(false, "trinketnames,86");
          if (var2 == null) {
            break L980;
          } else {
            fq.field_f[86] = uu.a(var2, (byte) -117);
            break L980;
          }
        }
        L981: {
          var2 = fk.a(false, "trinketnames,87");
          if (var2 != null) {
            fq.field_f[87] = uu.a(var2, (byte) -115);
            break L981;
          } else {
            break L981;
          }
        }
        L982: {
          var2 = fk.a(false, "trinketnames,88");
          if (var2 == null) {
            break L982;
          } else {
            fq.field_f[88] = uu.a(var2, (byte) -115);
            break L982;
          }
        }
        L983: {
          var2 = fk.a(false, "trinketnames,89");
          if (null == var2) {
            break L983;
          } else {
            fq.field_f[89] = uu.a(var2, (byte) -127);
            break L983;
          }
        }
        L984: {
          var2 = fk.a(false, "trinketnames,90");
          if (null == var2) {
            break L984;
          } else {
            fq.field_f[90] = uu.a(var2, (byte) -105);
            break L984;
          }
        }
        L985: {
          var2 = fk.a(false, "trinketnames,91");
          if (null != var2) {
            fq.field_f[91] = uu.a(var2, (byte) -122);
            break L985;
          } else {
            break L985;
          }
        }
        L986: {
          var2 = fk.a(false, "trinketnames,92");
          if (var2 == null) {
            break L986;
          } else {
            fq.field_f[92] = uu.a(var2, (byte) 20);
            break L986;
          }
        }
        L987: {
          var2 = fk.a(false, "trinketnames,93");
          if (var2 != null) {
            fq.field_f[93] = uu.a(var2, (byte) -128);
            break L987;
          } else {
            break L987;
          }
        }
        L988: {
          var2 = fk.a(false, "trinketnames,94");
          if (null != var2) {
            fq.field_f[94] = uu.a(var2, (byte) -123);
            break L988;
          } else {
            break L988;
          }
        }
        L989: {
          var2 = fk.a(false, "trinketnames,95");
          if (null != var2) {
            fq.field_f[95] = uu.a(var2, (byte) -93);
            break L989;
          } else {
            break L989;
          }
        }
        L990: {
          var2 = fk.a(false, "trinketnames,96");
          if (var2 == null) {
            break L990;
          } else {
            fq.field_f[96] = uu.a(var2, (byte) 76);
            break L990;
          }
        }
        L991: {
          var2 = fk.a(false, "trinketnames,97");
          if (var2 != null) {
            fq.field_f[97] = uu.a(var2, (byte) -94);
            break L991;
          } else {
            break L991;
          }
        }
        L992: {
          var2 = fk.a(false, "trinketnames,98");
          if (var2 != null) {
            fq.field_f[98] = uu.a(var2, (byte) 126);
            break L992;
          } else {
            break L992;
          }
        }
        L993: {
          var2 = fk.a(false, "trinketnames,99");
          if (null == var2) {
            break L993;
          } else {
            fq.field_f[99] = uu.a(var2, (byte) -104);
            break L993;
          }
        }
        L994: {
          var2 = fk.a(false, "trinketnames,100");
          if (var2 == null) {
            break L994;
          } else {
            fq.field_f[100] = uu.a(var2, (byte) 10);
            break L994;
          }
        }
        L995: {
          var2 = fk.a(false, "trinketnames,101");
          if (null == var2) {
            break L995;
          } else {
            fq.field_f[101] = uu.a(var2, (byte) -113);
            break L995;
          }
        }
        L996: {
          var2 = fk.a(false, "trinketnames,102");
          if (var2 == null) {
            break L996;
          } else {
            fq.field_f[102] = uu.a(var2, (byte) 92);
            break L996;
          }
        }
        L997: {
          var2 = fk.a(false, "trinketnames,103");
          if (null == var2) {
            break L997;
          } else {
            fq.field_f[103] = uu.a(var2, (byte) 103);
            break L997;
          }
        }
        L998: {
          var2 = fk.a(false, "trinketnames,104");
          if (null != var2) {
            fq.field_f[104] = uu.a(var2, (byte) -112);
            break L998;
          } else {
            break L998;
          }
        }
        L999: {
          var2 = fk.a(false, "trinketnames,105");
          if (null != var2) {
            fq.field_f[105] = uu.a(var2, (byte) 16);
            break L999;
          } else {
            break L999;
          }
        }
        L1000: {
          var2 = fk.a(false, "trinketnames,106");
          if (var2 == null) {
            break L1000;
          } else {
            fq.field_f[106] = uu.a(var2, (byte) -123);
            break L1000;
          }
        }
        L1001: {
          var2 = fk.a(false, "trinketnames,107");
          if (var2 != null) {
            fq.field_f[107] = uu.a(var2, (byte) 121);
            break L1001;
          } else {
            break L1001;
          }
        }
        L1002: {
          var2 = fk.a(false, "trinketnames,108");
          if (null != var2) {
            fq.field_f[108] = uu.a(var2, (byte) 123);
            break L1002;
          } else {
            break L1002;
          }
        }
        L1003: {
          var2 = fk.a(false, "trinketnames,109");
          if (var2 == null) {
            break L1003;
          } else {
            fq.field_f[109] = uu.a(var2, (byte) -113);
            break L1003;
          }
        }
        L1004: {
          var2 = fk.a(false, "trinketnames,110");
          if (null == var2) {
            break L1004;
          } else {
            fq.field_f[110] = uu.a(var2, (byte) -105);
            break L1004;
          }
        }
        L1005: {
          var2 = fk.a(false, "trinketnames,111");
          if (var2 == null) {
            break L1005;
          } else {
            fq.field_f[111] = uu.a(var2, (byte) -97);
            break L1005;
          }
        }
        L1006: {
          var2 = fk.a(false, "trinketnames,112");
          if (null != var2) {
            fq.field_f[112] = uu.a(var2, (byte) 66);
            break L1006;
          } else {
            break L1006;
          }
        }
        L1007: {
          var2 = fk.a(false, "trinketnames,113");
          if (null != var2) {
            fq.field_f[113] = uu.a(var2, (byte) 93);
            break L1007;
          } else {
            break L1007;
          }
        }
        L1008: {
          var2 = fk.a(false, "trinketnames,114");
          if (null == var2) {
            break L1008;
          } else {
            fq.field_f[114] = uu.a(var2, (byte) 61);
            break L1008;
          }
        }
        L1009: {
          var2 = fk.a(false, "trinketnames,115");
          if (var2 == null) {
            break L1009;
          } else {
            fq.field_f[115] = uu.a(var2, (byte) -97);
            break L1009;
          }
        }
        L1010: {
          var2 = fk.a(false, "trinketnames,116");
          if (var2 != null) {
            fq.field_f[116] = uu.a(var2, (byte) 18);
            break L1010;
          } else {
            break L1010;
          }
        }
        L1011: {
          var2 = fk.a(false, "trinketnames,117");
          if (null == var2) {
            break L1011;
          } else {
            fq.field_f[117] = uu.a(var2, (byte) -92);
            break L1011;
          }
        }
        L1012: {
          var2 = fk.a(false, "trinketnames,118");
          if (null != var2) {
            fq.field_f[118] = uu.a(var2, (byte) -99);
            break L1012;
          } else {
            break L1012;
          }
        }
        L1013: {
          var2 = fk.a(false, "trinketnames,119");
          if (var2 != null) {
            fq.field_f[119] = uu.a(var2, (byte) 75);
            break L1013;
          } else {
            break L1013;
          }
        }
        L1014: {
          var2 = fk.a(false, "trinketnames,120");
          if (var2 == null) {
            break L1014;
          } else {
            fq.field_f[120] = uu.a(var2, (byte) -110);
            break L1014;
          }
        }
        L1015: {
          var2 = fk.a(false, "trinketnames,121");
          if (null != var2) {
            fq.field_f[121] = uu.a(var2, (byte) 85);
            break L1015;
          } else {
            break L1015;
          }
        }
        L1016: {
          var2 = fk.a(false, "trinketnames,122");
          if (null == var2) {
            break L1016;
          } else {
            fq.field_f[122] = uu.a(var2, (byte) -99);
            break L1016;
          }
        }
        L1017: {
          var2 = fk.a(false, "trinketnames,123");
          if (null != var2) {
            fq.field_f[123] = uu.a(var2, (byte) -101);
            break L1017;
          } else {
            break L1017;
          }
        }
        L1018: {
          var2 = fk.a(false, "trinketnames,124");
          if (var2 == null) {
            break L1018;
          } else {
            fq.field_f[124] = uu.a(var2, (byte) -103);
            break L1018;
          }
        }
        L1019: {
          var2 = fk.a(false, "trinketnames,125");
          if (null == var2) {
            break L1019;
          } else {
            fq.field_f[125] = uu.a(var2, (byte) -97);
            break L1019;
          }
        }
        L1020: {
          var2 = fk.a(false, "trinketnames,126");
          if (var2 == null) {
            break L1020;
          } else {
            fq.field_f[126] = uu.a(var2, (byte) 69);
            break L1020;
          }
        }
        L1021: {
          var2 = fk.a(false, "trinketnames,127");
          if (null != var2) {
            fq.field_f[127] = uu.a(var2, (byte) 38);
            break L1021;
          } else {
            break L1021;
          }
        }
        L1022: {
          var2 = fk.a(false, "trinketnames,128");
          if (var2 == null) {
            break L1022;
          } else {
            fq.field_f[128] = uu.a(var2, (byte) -114);
            break L1022;
          }
        }
        L1023: {
          var2 = fk.a(false, "trinketnames,129");
          if (null == var2) {
            break L1023;
          } else {
            fq.field_f[129] = uu.a(var2, (byte) 19);
            break L1023;
          }
        }
        L1024: {
          var2 = fk.a(false, "trinketnames,130");
          if (null == var2) {
            break L1024;
          } else {
            fq.field_f[130] = uu.a(var2, (byte) 99);
            break L1024;
          }
        }
        L1025: {
          var2 = fk.a(false, "trinketnames,131");
          if (null == var2) {
            break L1025;
          } else {
            fq.field_f[131] = uu.a(var2, (byte) -126);
            break L1025;
          }
        }
        L1026: {
          var2 = fk.a(false, "trinketnames,132");
          if (null != var2) {
            fq.field_f[132] = uu.a(var2, (byte) 108);
            break L1026;
          } else {
            break L1026;
          }
        }
        L1027: {
          var2 = fk.a(false, "trinketnames,133");
          if (var2 == null) {
            break L1027;
          } else {
            fq.field_f[133] = uu.a(var2, (byte) -126);
            break L1027;
          }
        }
        L1028: {
          var2 = fk.a(false, "trinketnames,134");
          if (var2 == null) {
            break L1028;
          } else {
            fq.field_f[134] = uu.a(var2, (byte) -110);
            break L1028;
          }
        }
        L1029: {
          var2 = fk.a(false, "trinketdescriptions,0");
          if (var2 != null) {
            mn.field_l[0] = uu.a(var2, (byte) -125);
            break L1029;
          } else {
            break L1029;
          }
        }
        L1030: {
          var2 = fk.a(false, "trinketdescriptions,1");
          if (var2 != null) {
            mn.field_l[1] = uu.a(var2, (byte) 46);
            break L1030;
          } else {
            break L1030;
          }
        }
        L1031: {
          var2 = fk.a(false, "trinketdescriptions,2");
          if (var2 != null) {
            mn.field_l[2] = uu.a(var2, (byte) 45);
            break L1031;
          } else {
            break L1031;
          }
        }
        L1032: {
          var2 = fk.a(false, "trinketdescriptions,3");
          if (null != var2) {
            mn.field_l[3] = uu.a(var2, (byte) -110);
            break L1032;
          } else {
            break L1032;
          }
        }
        L1033: {
          var2 = fk.a(false, "trinketdescriptions,4");
          if (var2 == null) {
            break L1033;
          } else {
            mn.field_l[4] = uu.a(var2, (byte) 12);
            break L1033;
          }
        }
        L1034: {
          var2 = fk.a(false, "trinketdescriptions,5");
          if (null != var2) {
            mn.field_l[5] = uu.a(var2, (byte) -118);
            break L1034;
          } else {
            break L1034;
          }
        }
        L1035: {
          var2 = fk.a(false, "trinketdescriptions,6");
          if (null != var2) {
            mn.field_l[6] = uu.a(var2, (byte) 80);
            break L1035;
          } else {
            break L1035;
          }
        }
        L1036: {
          var2 = fk.a(false, "trinketdescriptions,7");
          if (null == var2) {
            break L1036;
          } else {
            mn.field_l[7] = uu.a(var2, (byte) 27);
            break L1036;
          }
        }
        L1037: {
          var2 = fk.a(false, "trinketdescriptions,8");
          if (var2 == null) {
            break L1037;
          } else {
            mn.field_l[8] = uu.a(var2, (byte) -111);
            break L1037;
          }
        }
        L1038: {
          var2 = fk.a(false, "trinketdescriptions,9");
          if (var2 != null) {
            mn.field_l[9] = uu.a(var2, (byte) -112);
            break L1038;
          } else {
            break L1038;
          }
        }
        L1039: {
          var2 = fk.a(false, "trinketdescriptions,10");
          if (null != var2) {
            mn.field_l[10] = uu.a(var2, (byte) -128);
            break L1039;
          } else {
            break L1039;
          }
        }
        L1040: {
          var2 = fk.a(false, "trinketdescriptions,11");
          if (var2 != null) {
            mn.field_l[11] = uu.a(var2, (byte) 116);
            break L1040;
          } else {
            break L1040;
          }
        }
        L1041: {
          var2 = fk.a(false, "trinketdescriptions,12");
          if (var2 != null) {
            mn.field_l[12] = uu.a(var2, (byte) 36);
            break L1041;
          } else {
            break L1041;
          }
        }
        L1042: {
          var2 = fk.a(false, "trinketdescriptions,13");
          if (var2 != null) {
            mn.field_l[13] = uu.a(var2, (byte) -104);
            break L1042;
          } else {
            break L1042;
          }
        }
        L1043: {
          var2 = fk.a(false, "trinketdescriptions,14");
          if (null == var2) {
            break L1043;
          } else {
            mn.field_l[14] = uu.a(var2, (byte) 35);
            break L1043;
          }
        }
        L1044: {
          var2 = fk.a(false, "trinketdescriptions,15");
          if (var2 != null) {
            mn.field_l[15] = uu.a(var2, (byte) 28);
            break L1044;
          } else {
            break L1044;
          }
        }
        L1045: {
          var2 = fk.a(false, "trinketdescriptions,16");
          if (null == var2) {
            break L1045;
          } else {
            mn.field_l[16] = uu.a(var2, (byte) -124);
            break L1045;
          }
        }
        L1046: {
          var2 = fk.a(false, "trinketdescriptions,17");
          if (null != var2) {
            mn.field_l[17] = uu.a(var2, (byte) 36);
            break L1046;
          } else {
            break L1046;
          }
        }
        L1047: {
          var2 = fk.a(false, "trinketdescriptions,18");
          if (var2 == null) {
            break L1047;
          } else {
            mn.field_l[18] = uu.a(var2, (byte) 112);
            break L1047;
          }
        }
        L1048: {
          var2 = fk.a(false, "trinketdescriptions,19");
          if (var2 == null) {
            break L1048;
          } else {
            mn.field_l[19] = uu.a(var2, (byte) -112);
            break L1048;
          }
        }
        L1049: {
          var2 = fk.a(false, "trinketdescriptions,20");
          if (null == var2) {
            break L1049;
          } else {
            mn.field_l[20] = uu.a(var2, (byte) -125);
            break L1049;
          }
        }
        L1050: {
          var2 = fk.a(false, "trinketdescriptions,21");
          if (null != var2) {
            mn.field_l[21] = uu.a(var2, (byte) -108);
            break L1050;
          } else {
            break L1050;
          }
        }
        L1051: {
          var2 = fk.a(false, "trinketdescriptions,22");
          if (null == var2) {
            break L1051;
          } else {
            mn.field_l[22] = uu.a(var2, (byte) -96);
            break L1051;
          }
        }
        L1052: {
          var2 = fk.a(false, "trinketdescriptions,23");
          if (null == var2) {
            break L1052;
          } else {
            mn.field_l[23] = uu.a(var2, (byte) 98);
            break L1052;
          }
        }
        L1053: {
          var2 = fk.a(false, "trinketdescriptions,24");
          if (null == var2) {
            break L1053;
          } else {
            mn.field_l[24] = uu.a(var2, (byte) 45);
            break L1053;
          }
        }
        L1054: {
          var2 = fk.a(false, "trinketdescriptions,25");
          if (null != var2) {
            mn.field_l[25] = uu.a(var2, (byte) -123);
            break L1054;
          } else {
            break L1054;
          }
        }
        L1055: {
          var2 = fk.a(false, "trinketdescriptions,26");
          if (var2 != null) {
            mn.field_l[26] = uu.a(var2, (byte) -126);
            break L1055;
          } else {
            break L1055;
          }
        }
        L1056: {
          var2 = fk.a(false, "trinketdescriptions,27");
          if (null != var2) {
            mn.field_l[27] = uu.a(var2, (byte) 82);
            break L1056;
          } else {
            break L1056;
          }
        }
        L1057: {
          var2 = fk.a(false, "trinketdescriptions,28");
          if (var2 != null) {
            mn.field_l[28] = uu.a(var2, (byte) -93);
            break L1057;
          } else {
            break L1057;
          }
        }
        L1058: {
          var2 = fk.a(false, "trinketdescriptions,29");
          if (null == var2) {
            break L1058;
          } else {
            mn.field_l[29] = uu.a(var2, (byte) -101);
            break L1058;
          }
        }
        L1059: {
          var2 = fk.a(false, "trinketdescriptions,30");
          if (null == var2) {
            break L1059;
          } else {
            mn.field_l[30] = uu.a(var2, (byte) 65);
            break L1059;
          }
        }
        L1060: {
          var2 = fk.a(false, "trinketdescriptions,31");
          if (null == var2) {
            break L1060;
          } else {
            mn.field_l[31] = uu.a(var2, (byte) -107);
            break L1060;
          }
        }
        L1061: {
          var2 = fk.a(false, "trinketdescriptions,32");
          if (null != var2) {
            mn.field_l[32] = uu.a(var2, (byte) 77);
            break L1061;
          } else {
            break L1061;
          }
        }
        L1062: {
          var2 = fk.a(false, "trinketdescriptions,33");
          if (null != var2) {
            mn.field_l[33] = uu.a(var2, (byte) -106);
            break L1062;
          } else {
            break L1062;
          }
        }
        L1063: {
          var2 = fk.a(false, "trinketdescriptions,34");
          if (null != var2) {
            mn.field_l[34] = uu.a(var2, (byte) -123);
            break L1063;
          } else {
            break L1063;
          }
        }
        L1064: {
          var2 = fk.a(false, "trinketdescriptions,35");
          if (null == var2) {
            break L1064;
          } else {
            mn.field_l[35] = uu.a(var2, (byte) -115);
            break L1064;
          }
        }
        L1065: {
          var2 = fk.a(false, "trinketdescriptions,36");
          if (var2 == null) {
            break L1065;
          } else {
            mn.field_l[36] = uu.a(var2, (byte) -93);
            break L1065;
          }
        }
        L1066: {
          var2 = fk.a(false, "trinketdescriptions,37");
          if (var2 != null) {
            mn.field_l[37] = uu.a(var2, (byte) -121);
            break L1066;
          } else {
            break L1066;
          }
        }
        L1067: {
          var2 = fk.a(false, "trinketdescriptions,38");
          if (null == var2) {
            break L1067;
          } else {
            mn.field_l[38] = uu.a(var2, (byte) -120);
            break L1067;
          }
        }
        L1068: {
          var2 = fk.a(false, "trinketdescriptions,39");
          if (null == var2) {
            break L1068;
          } else {
            mn.field_l[39] = uu.a(var2, (byte) 19);
            break L1068;
          }
        }
        L1069: {
          var2 = fk.a(false, "trinketdescriptions,40");
          if (null == var2) {
            break L1069;
          } else {
            mn.field_l[40] = uu.a(var2, (byte) 46);
            break L1069;
          }
        }
        L1070: {
          var2 = fk.a(false, "trinketdescriptions,41");
          if (null == var2) {
            break L1070;
          } else {
            mn.field_l[41] = uu.a(var2, (byte) -110);
            break L1070;
          }
        }
        L1071: {
          var2 = fk.a(false, "trinketdescriptions,42");
          if (null != var2) {
            mn.field_l[42] = uu.a(var2, (byte) -107);
            break L1071;
          } else {
            break L1071;
          }
        }
        L1072: {
          var2 = fk.a(false, "trinketdescriptions,43");
          if (null != var2) {
            mn.field_l[43] = uu.a(var2, (byte) 31);
            break L1072;
          } else {
            break L1072;
          }
        }
        L1073: {
          var2 = fk.a(false, "trinketdescriptions,44");
          if (var2 == null) {
            break L1073;
          } else {
            mn.field_l[44] = uu.a(var2, (byte) -110);
            break L1073;
          }
        }
        L1074: {
          var2 = fk.a(false, "trinketdescriptions,45");
          if (var2 == null) {
            break L1074;
          } else {
            mn.field_l[45] = uu.a(var2, (byte) 4);
            break L1074;
          }
        }
        L1075: {
          var2 = fk.a(false, "trinketdescriptions,46");
          if (null == var2) {
            break L1075;
          } else {
            mn.field_l[46] = uu.a(var2, (byte) -114);
            break L1075;
          }
        }
        L1076: {
          var2 = fk.a(false, "trinketdescriptions,47");
          if (null == var2) {
            break L1076;
          } else {
            mn.field_l[47] = uu.a(var2, (byte) 40);
            break L1076;
          }
        }
        L1077: {
          var2 = fk.a(false, "trinketdescriptions,48");
          if (null != var2) {
            mn.field_l[48] = uu.a(var2, (byte) -103);
            break L1077;
          } else {
            break L1077;
          }
        }
        L1078: {
          var2 = fk.a(false, "trinketdescriptions,49");
          if (null == var2) {
            break L1078;
          } else {
            mn.field_l[49] = uu.a(var2, (byte) -92);
            break L1078;
          }
        }
        L1079: {
          var2 = fk.a(false, "trinketdescriptions,50");
          if (null == var2) {
            break L1079;
          } else {
            mn.field_l[50] = uu.a(var2, (byte) 124);
            break L1079;
          }
        }
        L1080: {
          var2 = fk.a(false, "trinketdescriptions,51");
          if (var2 != null) {
            mn.field_l[51] = uu.a(var2, (byte) -95);
            break L1080;
          } else {
            break L1080;
          }
        }
        L1081: {
          var2 = fk.a(false, "trinketdescriptions,52");
          if (null == var2) {
            break L1081;
          } else {
            mn.field_l[52] = uu.a(var2, (byte) -115);
            break L1081;
          }
        }
        L1082: {
          var2 = fk.a(false, "trinketdescriptions,53");
          if (var2 != null) {
            mn.field_l[53] = uu.a(var2, (byte) 97);
            break L1082;
          } else {
            break L1082;
          }
        }
        L1083: {
          var2 = fk.a(false, "trinketdescriptions,54");
          if (null == var2) {
            break L1083;
          } else {
            mn.field_l[54] = uu.a(var2, (byte) -117);
            break L1083;
          }
        }
        L1084: {
          var2 = fk.a(false, "trinketdescriptions,55");
          if (var2 != null) {
            mn.field_l[55] = uu.a(var2, (byte) 10);
            break L1084;
          } else {
            break L1084;
          }
        }
        L1085: {
          var2 = fk.a(false, "trinketdescriptions,56");
          if (null != var2) {
            mn.field_l[56] = uu.a(var2, (byte) -121);
            break L1085;
          } else {
            break L1085;
          }
        }
        L1086: {
          var2 = fk.a(false, "trinketdescriptions,57");
          if (null == var2) {
            break L1086;
          } else {
            mn.field_l[57] = uu.a(var2, (byte) -96);
            break L1086;
          }
        }
        L1087: {
          var2 = fk.a(false, "trinketdescriptions,58");
          if (null == var2) {
            break L1087;
          } else {
            mn.field_l[58] = uu.a(var2, (byte) -112);
            break L1087;
          }
        }
        L1088: {
          var2 = fk.a(false, "trinketdescriptions,59");
          if (var2 != null) {
            mn.field_l[59] = uu.a(var2, (byte) -127);
            break L1088;
          } else {
            break L1088;
          }
        }
        L1089: {
          var2 = fk.a(false, "trinketdescriptions,60");
          if (null != var2) {
            mn.field_l[60] = uu.a(var2, (byte) 36);
            break L1089;
          } else {
            break L1089;
          }
        }
        L1090: {
          var2 = fk.a(false, "trinketdescriptions,61");
          if (null != var2) {
            mn.field_l[61] = uu.a(var2, (byte) 42);
            break L1090;
          } else {
            break L1090;
          }
        }
        L1091: {
          var2 = fk.a(false, "trinketdescriptions,62");
          if (null != var2) {
            mn.field_l[62] = uu.a(var2, (byte) 47);
            break L1091;
          } else {
            break L1091;
          }
        }
        L1092: {
          var2 = fk.a(false, "trinketdescriptions,63");
          if (var2 == null) {
            break L1092;
          } else {
            mn.field_l[63] = uu.a(var2, (byte) -107);
            break L1092;
          }
        }
        L1093: {
          var2 = fk.a(false, "trinketdescriptions,64");
          if (null != var2) {
            mn.field_l[64] = uu.a(var2, (byte) 119);
            break L1093;
          } else {
            break L1093;
          }
        }
        L1094: {
          var2 = fk.a(false, "trinketdescriptions,65");
          if (var2 != null) {
            mn.field_l[65] = uu.a(var2, (byte) 85);
            break L1094;
          } else {
            break L1094;
          }
        }
        L1095: {
          var2 = fk.a(false, "trinketdescriptions,66");
          if (var2 == null) {
            break L1095;
          } else {
            mn.field_l[66] = uu.a(var2, (byte) 34);
            break L1095;
          }
        }
        L1096: {
          var2 = fk.a(false, "trinketdescriptions,67");
          if (null == var2) {
            break L1096;
          } else {
            mn.field_l[67] = uu.a(var2, (byte) -92);
            break L1096;
          }
        }
        L1097: {
          var2 = fk.a(false, "trinketdescriptions,68");
          if (null != var2) {
            mn.field_l[68] = uu.a(var2, (byte) 116);
            break L1097;
          } else {
            break L1097;
          }
        }
        L1098: {
          var2 = fk.a(false, "trinketdescriptions,69");
          if (var2 == null) {
            break L1098;
          } else {
            mn.field_l[69] = uu.a(var2, (byte) -111);
            break L1098;
          }
        }
        L1099: {
          var2 = fk.a(false, "trinketdescriptions,70");
          if (var2 != null) {
            mn.field_l[70] = uu.a(var2, (byte) -104);
            break L1099;
          } else {
            break L1099;
          }
        }
        L1100: {
          var2 = fk.a(false, "trinketdescriptions,71");
          if (null != var2) {
            mn.field_l[71] = uu.a(var2, (byte) 73);
            break L1100;
          } else {
            break L1100;
          }
        }
        L1101: {
          var2 = fk.a(false, "trinketdescriptions,72");
          if (var2 != null) {
            mn.field_l[72] = uu.a(var2, (byte) 13);
            break L1101;
          } else {
            break L1101;
          }
        }
        L1102: {
          var2 = fk.a(false, "trinketdescriptions,73");
          if (var2 != null) {
            mn.field_l[73] = uu.a(var2, (byte) -104);
            break L1102;
          } else {
            break L1102;
          }
        }
        L1103: {
          var2 = fk.a(false, "trinketdescriptions,74");
          if (null == var2) {
            break L1103;
          } else {
            mn.field_l[74] = uu.a(var2, (byte) 59);
            break L1103;
          }
        }
        L1104: {
          var2 = fk.a(false, "trinketdescriptions,75");
          if (null != var2) {
            mn.field_l[75] = uu.a(var2, (byte) -122);
            break L1104;
          } else {
            break L1104;
          }
        }
        L1105: {
          var2 = fk.a(false, "trinketdescriptions,76");
          if (var2 == null) {
            break L1105;
          } else {
            mn.field_l[76] = uu.a(var2, (byte) -126);
            break L1105;
          }
        }
        L1106: {
          var2 = fk.a(false, "trinketdescriptions,77");
          if (null == var2) {
            break L1106;
          } else {
            mn.field_l[77] = uu.a(var2, (byte) -96);
            break L1106;
          }
        }
        L1107: {
          var2 = fk.a(false, "trinketdescriptions,78");
          if (var2 != null) {
            mn.field_l[78] = uu.a(var2, (byte) 14);
            break L1107;
          } else {
            break L1107;
          }
        }
        L1108: {
          var2 = fk.a(false, "trinketdescriptions,79");
          if (null != var2) {
            mn.field_l[79] = uu.a(var2, (byte) 30);
            break L1108;
          } else {
            break L1108;
          }
        }
        L1109: {
          var2 = fk.a(false, "trinketdescriptions,80");
          if (null == var2) {
            break L1109;
          } else {
            mn.field_l[80] = uu.a(var2, (byte) -94);
            break L1109;
          }
        }
        L1110: {
          var2 = fk.a(false, "trinketdescriptions,81");
          if (var2 != null) {
            mn.field_l[81] = uu.a(var2, (byte) 57);
            break L1110;
          } else {
            break L1110;
          }
        }
        L1111: {
          var2 = fk.a(false, "trinketdescriptions,82");
          if (var2 == null) {
            break L1111;
          } else {
            mn.field_l[82] = uu.a(var2, (byte) 98);
            break L1111;
          }
        }
        L1112: {
          var2 = fk.a(false, "trinketdescriptions,83");
          if (null != var2) {
            mn.field_l[83] = uu.a(var2, (byte) 60);
            break L1112;
          } else {
            break L1112;
          }
        }
        L1113: {
          var2 = fk.a(false, "trinketdescriptions,84");
          if (var2 != null) {
            mn.field_l[84] = uu.a(var2, (byte) -102);
            break L1113;
          } else {
            break L1113;
          }
        }
        L1114: {
          var2 = fk.a(false, "trinketdescriptions,85");
          if (var2 == null) {
            break L1114;
          } else {
            mn.field_l[85] = uu.a(var2, (byte) -127);
            break L1114;
          }
        }
        L1115: {
          var2 = fk.a(false, "trinketdescriptions,86");
          if (var2 != null) {
            mn.field_l[86] = uu.a(var2, (byte) 43);
            break L1115;
          } else {
            break L1115;
          }
        }
        L1116: {
          var2 = fk.a(false, "trinketdescriptions,87");
          if (null == var2) {
            break L1116;
          } else {
            mn.field_l[87] = uu.a(var2, (byte) 77);
            break L1116;
          }
        }
        L1117: {
          var2 = fk.a(false, "trinketdescriptions,88");
          if (null == var2) {
            break L1117;
          } else {
            mn.field_l[88] = uu.a(var2, (byte) 102);
            break L1117;
          }
        }
        L1118: {
          var2 = fk.a(false, "trinketdescriptions,89");
          if (var2 == null) {
            break L1118;
          } else {
            mn.field_l[89] = uu.a(var2, (byte) -116);
            break L1118;
          }
        }
        L1119: {
          var2 = fk.a(false, "trinketdescriptions,90");
          if (null == var2) {
            break L1119;
          } else {
            mn.field_l[90] = uu.a(var2, (byte) -94);
            break L1119;
          }
        }
        L1120: {
          var2 = fk.a(false, "trinketdescriptions,91");
          if (null != var2) {
            mn.field_l[91] = uu.a(var2, (byte) -124);
            break L1120;
          } else {
            break L1120;
          }
        }
        L1121: {
          var2 = fk.a(false, "trinketdescriptions,92");
          if (null != var2) {
            mn.field_l[92] = uu.a(var2, (byte) -98);
            break L1121;
          } else {
            break L1121;
          }
        }
        L1122: {
          var2 = fk.a(false, "trinketdescriptions,93");
          if (var2 != null) {
            mn.field_l[93] = uu.a(var2, (byte) -118);
            break L1122;
          } else {
            break L1122;
          }
        }
        L1123: {
          var2 = fk.a(false, "trinketdescriptions,94");
          if (null == var2) {
            break L1123;
          } else {
            mn.field_l[94] = uu.a(var2, (byte) 67);
            break L1123;
          }
        }
        L1124: {
          var2 = fk.a(false, "trinketdescriptions,95");
          if (null == var2) {
            break L1124;
          } else {
            mn.field_l[95] = uu.a(var2, (byte) -99);
            break L1124;
          }
        }
        L1125: {
          var2 = fk.a(false, "trinketdescriptions,96");
          if (var2 != null) {
            mn.field_l[96] = uu.a(var2, (byte) -111);
            break L1125;
          } else {
            break L1125;
          }
        }
        L1126: {
          var2 = fk.a(false, "trinketdescriptions,97");
          if (null != var2) {
            mn.field_l[97] = uu.a(var2, (byte) -112);
            break L1126;
          } else {
            break L1126;
          }
        }
        L1127: {
          var2 = fk.a(false, "trinketdescriptions,98");
          if (null != var2) {
            mn.field_l[98] = uu.a(var2, (byte) 44);
            break L1127;
          } else {
            break L1127;
          }
        }
        L1128: {
          var2 = fk.a(false, "trinketdescriptions,99");
          if (var2 == null) {
            break L1128;
          } else {
            mn.field_l[99] = uu.a(var2, (byte) 54);
            break L1128;
          }
        }
        L1129: {
          var2 = fk.a(false, "trinketdescriptions,100");
          if (var2 != null) {
            mn.field_l[100] = uu.a(var2, (byte) 69);
            break L1129;
          } else {
            break L1129;
          }
        }
        L1130: {
          var2 = fk.a(false, "trinketdescriptions,101");
          if (var2 != null) {
            mn.field_l[101] = uu.a(var2, (byte) -116);
            break L1130;
          } else {
            break L1130;
          }
        }
        L1131: {
          var2 = fk.a(false, "trinketdescriptions,102");
          if (var2 == null) {
            break L1131;
          } else {
            mn.field_l[102] = uu.a(var2, (byte) 30);
            break L1131;
          }
        }
        L1132: {
          var2 = fk.a(false, "trinketdescriptions,103");
          if (null != var2) {
            mn.field_l[103] = uu.a(var2, (byte) 79);
            break L1132;
          } else {
            break L1132;
          }
        }
        L1133: {
          var2 = fk.a(false, "trinketdescriptions,104");
          if (null != var2) {
            mn.field_l[104] = uu.a(var2, (byte) 97);
            break L1133;
          } else {
            break L1133;
          }
        }
        L1134: {
          var2 = fk.a(false, "trinketdescriptions,105");
          if (null == var2) {
            break L1134;
          } else {
            mn.field_l[105] = uu.a(var2, (byte) -108);
            break L1134;
          }
        }
        L1135: {
          var2 = fk.a(false, "trinketdescriptions,106");
          if (var2 != null) {
            mn.field_l[106] = uu.a(var2, (byte) -113);
            break L1135;
          } else {
            break L1135;
          }
        }
        L1136: {
          var2 = fk.a(false, "trinketdescriptions,107");
          if (null != var2) {
            mn.field_l[107] = uu.a(var2, (byte) -95);
            break L1136;
          } else {
            break L1136;
          }
        }
        L1137: {
          var2 = fk.a(false, "trinketdescriptions,108");
          if (null != var2) {
            mn.field_l[108] = uu.a(var2, (byte) -126);
            break L1137;
          } else {
            break L1137;
          }
        }
        L1138: {
          var2 = fk.a(false, "trinketdescriptions,109");
          if (null == var2) {
            break L1138;
          } else {
            mn.field_l[109] = uu.a(var2, (byte) 113);
            break L1138;
          }
        }
        L1139: {
          var2 = fk.a(false, "trinketdescriptions,110");
          if (null != var2) {
            mn.field_l[110] = uu.a(var2, (byte) -98);
            break L1139;
          } else {
            break L1139;
          }
        }
        L1140: {
          var2 = fk.a(false, "trinketdescriptions,111");
          if (null != var2) {
            mn.field_l[111] = uu.a(var2, (byte) 109);
            break L1140;
          } else {
            break L1140;
          }
        }
        L1141: {
          var2 = fk.a(false, "trinketdescriptions,112");
          if (var2 == null) {
            break L1141;
          } else {
            mn.field_l[112] = uu.a(var2, (byte) 58);
            break L1141;
          }
        }
        L1142: {
          var2 = fk.a(false, "trinketdescriptions,113");
          if (var2 == null) {
            break L1142;
          } else {
            mn.field_l[113] = uu.a(var2, (byte) -125);
            break L1142;
          }
        }
        L1143: {
          var2 = fk.a(false, "trinketdescriptions,114");
          if (var2 == null) {
            break L1143;
          } else {
            mn.field_l[114] = uu.a(var2, (byte) -128);
            break L1143;
          }
        }
        L1144: {
          var2 = fk.a(false, "trinketdescriptions,115");
          if (var2 != null) {
            mn.field_l[115] = uu.a(var2, (byte) 102);
            break L1144;
          } else {
            break L1144;
          }
        }
        L1145: {
          var2 = fk.a(false, "trinketdescriptions,116");
          if (null != var2) {
            mn.field_l[116] = uu.a(var2, (byte) -99);
            break L1145;
          } else {
            break L1145;
          }
        }
        L1146: {
          var2 = fk.a(false, "trinketdescriptions,117");
          if (null != var2) {
            mn.field_l[117] = uu.a(var2, (byte) -108);
            break L1146;
          } else {
            break L1146;
          }
        }
        L1147: {
          var2 = fk.a(false, "trinketdescriptions,118");
          if (null != var2) {
            mn.field_l[118] = uu.a(var2, (byte) -112);
            break L1147;
          } else {
            break L1147;
          }
        }
        L1148: {
          var2 = fk.a(false, "trinketdescriptions,119");
          if (null == var2) {
            break L1148;
          } else {
            mn.field_l[119] = uu.a(var2, (byte) 36);
            break L1148;
          }
        }
        L1149: {
          var2 = fk.a(false, "trinketdescriptions,120");
          if (null == var2) {
            break L1149;
          } else {
            mn.field_l[120] = uu.a(var2, (byte) -114);
            break L1149;
          }
        }
        L1150: {
          var2 = fk.a(false, "trinketdescriptions,121");
          if (var2 == null) {
            break L1150;
          } else {
            mn.field_l[121] = uu.a(var2, (byte) -107);
            break L1150;
          }
        }
        L1151: {
          var2 = fk.a(false, "trinketdescriptions,122");
          if (var2 != null) {
            mn.field_l[122] = uu.a(var2, (byte) -113);
            break L1151;
          } else {
            break L1151;
          }
        }
        L1152: {
          var2 = fk.a(false, "trinketdescriptions,123");
          if (var2 == null) {
            break L1152;
          } else {
            mn.field_l[123] = uu.a(var2, (byte) 96);
            break L1152;
          }
        }
        L1153: {
          var2 = fk.a(false, "trinketdescriptions,124");
          if (null == var2) {
            break L1153;
          } else {
            mn.field_l[124] = uu.a(var2, (byte) 84);
            break L1153;
          }
        }
        L1154: {
          var2 = fk.a(false, "trinketdescriptions,125");
          if (var2 == null) {
            break L1154;
          } else {
            mn.field_l[125] = uu.a(var2, (byte) -126);
            break L1154;
          }
        }
        L1155: {
          var2 = fk.a(false, "trinketdescriptions,126");
          if (var2 == null) {
            break L1155;
          } else {
            mn.field_l[126] = uu.a(var2, (byte) -115);
            break L1155;
          }
        }
        L1156: {
          var2 = fk.a(false, "trinketdescriptions,127");
          if (null == var2) {
            break L1156;
          } else {
            mn.field_l[127] = uu.a(var2, (byte) -113);
            break L1156;
          }
        }
        L1157: {
          var2 = fk.a(false, "trinketdescriptions,128");
          if (null != var2) {
            mn.field_l[128] = uu.a(var2, (byte) -126);
            break L1157;
          } else {
            break L1157;
          }
        }
        L1158: {
          var2 = fk.a(false, "trinketdescriptions,129");
          if (var2 != null) {
            mn.field_l[129] = uu.a(var2, (byte) 96);
            break L1158;
          } else {
            break L1158;
          }
        }
        L1159: {
          var2 = fk.a(false, "trinketdescriptions,130");
          if (null != var2) {
            mn.field_l[130] = uu.a(var2, (byte) -93);
            break L1159;
          } else {
            break L1159;
          }
        }
        L1160: {
          var2 = fk.a(false, "trinketdescriptions,131");
          if (null == var2) {
            break L1160;
          } else {
            mn.field_l[131] = uu.a(var2, (byte) -126);
            break L1160;
          }
        }
        L1161: {
          var2 = fk.a(false, "trinketdescriptions,132");
          if (null == var2) {
            break L1161;
          } else {
            mn.field_l[132] = uu.a(var2, (byte) -106);
            break L1161;
          }
        }
        L1162: {
          var2 = fk.a(false, "trinketdescriptions,133");
          if (null != var2) {
            mn.field_l[133] = uu.a(var2, (byte) 91);
            break L1162;
          } else {
            break L1162;
          }
        }
        L1163: {
          var2 = fk.a(false, "trinketdescriptions,134");
          if (var2 == null) {
            break L1163;
          } else {
            mn.field_l[134] = uu.a(var2, (byte) 27);
            break L1163;
          }
        }
        L1164: {
          var2 = fk.a(false, "TXT_BACKTO");
          if (var2 != null) {
            rr.field_a = uu.a(var2, (byte) 12);
            break L1164;
          } else {
            break L1164;
          }
        }
        L1165: {
          var2 = fk.a(false, "TTREEN_INVENTORY");
          if (null == var2) {
            break L1165;
          } else {
            or.field_j = uu.a(var2, (byte) -114);
            break L1165;
          }
        }
        L1166: {
          var2 = fk.a(false, "TTREEN_EQUIPMENT");
          if (var2 != null) {
            qc.field_i = uu.a(var2, (byte) 60);
            break L1166;
          } else {
            break L1166;
          }
        }
        L1167: {
          var2 = fk.a(false, "TTREEN_SPELLS");
          if (null != var2) {
            na.field_I = uu.a(var2, (byte) 17);
            break L1167;
          } else {
            break L1167;
          }
        }
        L1168: {
          var2 = fk.a(false, "TTREEN_POTIONS");
          if (var2 == null) {
            break L1168;
          } else {
            fd.field_o = uu.a(var2, (byte) 92);
            break L1168;
          }
        }
        L1169: {
          var2 = fk.a(false, "TTREEN_ARMOUR");
          if (var2 == null) {
            break L1169;
          } else {
            dn.field_Lb = uu.a(var2, (byte) -109);
            break L1169;
          }
        }
        L1170: {
          var2 = fk.a(false, "TTREEN_WEAPONS");
          if (null == var2) {
            break L1170;
          } else {
            sa.field_d = uu.a(var2, (byte) 94);
            break L1170;
          }
        }
        L1171: {
          var2 = fk.a(false, "TTREEN_ACCESSORIES");
          if (var2 != null) {
            jm.field_d = uu.a(var2, (byte) 19);
            break L1171;
          } else {
            break L1171;
          }
        }
        L1172: {
          var2 = fk.a(false, "TTREEN_PLATE");
          if (null == var2) {
            break L1172;
          } else {
            hw.field_x = uu.a(var2, (byte) 108);
            break L1172;
          }
        }
        L1173: {
          var2 = fk.a(false, "TTREEN_PADDED");
          if (var2 != null) {
            ci.field_b = uu.a(var2, (byte) -114);
            break L1173;
          } else {
            break L1173;
          }
        }
        L1174: {
          var2 = fk.a(false, "TTREEN_ENCHANTED");
          if (null == var2) {
            break L1174;
          } else {
            r.field_w = uu.a(var2, (byte) -103);
            break L1174;
          }
        }
        L1175: {
          var2 = fk.a(false, "TTREEN_DRAGONSCALE");
          if (null != var2) {
            oh.field_F = uu.a(var2, (byte) -113);
            break L1175;
          } else {
            break L1175;
          }
        }
        L1176: {
          var2 = fk.a(false, "TTREEN_CAMOUFLAGE");
          if (null == var2) {
            break L1176;
          } else {
            ms.field_p = uu.a(var2, (byte) -112);
            break L1176;
          }
        }
        L1177: {
          var2 = fk.a(false, "TTREEN_RUNIC");
          if (var2 == null) {
            break L1177;
          } else {
            tl.field_f = uu.a(var2, (byte) 29);
            break L1177;
          }
        }
        L1178: {
          var2 = fk.a(false, "TTREEN_SACRIFICIAL");
          if (null == var2) {
            break L1178;
          } else {
            fi.field_l = uu.a(var2, (byte) 49);
            break L1178;
          }
        }
        L1179: {
          var2 = fk.a(false, "TTREEN_MELEE");
          if (var2 != null) {
            on.field_k = uu.a(var2, (byte) 23);
            break L1179;
          } else {
            break L1179;
          }
        }
        L1180: {
          var2 = fk.a(false, "TTREEN_RANGED");
          if (null != var2) {
            hl.field_Lb = uu.a(var2, (byte) -120);
            break L1180;
          } else {
            break L1180;
          }
        }
        L1181: {
          var2 = fk.a(false, "TTREEN_MAGIC");
          if (null == var2) {
            break L1181;
          } else {
            hf.field_g = uu.a(var2, (byte) -112);
            break L1181;
          }
        }
        L1182: {
          var2 = fk.a(false, "TTREEN_AERIAL");
          if (null != var2) {
            ms.field_n = uu.a(var2, (byte) 59);
            break L1182;
          } else {
            break L1182;
          }
        }
        L1183: {
          var2 = fk.a(false, "TTREEN_FLAME");
          if (var2 != null) {
            nl.field_D = uu.a(var2, (byte) -110);
            break L1183;
          } else {
            break L1183;
          }
        }
        L1184: {
          var2 = fk.a(false, "TTREEN_HEALING");
          if (var2 != null) {
            mi.field_C = uu.a(var2, (byte) -117);
            break L1184;
          } else {
            break L1184;
          }
        }
        L1185: {
          var2 = fk.a(false, "TTREEN_HARMING");
          if (null == var2) {
            break L1185;
          } else {
            nl.field_G = uu.a(var2, (byte) -99);
            break L1185;
          }
        }
        L1186: {
          var2 = fk.a(false, "TTREEN_MOVES");
          if (var2 == null) {
            break L1186;
          } else {
            dr.field_y = uu.a(var2, (byte) 118);
            break L1186;
          }
        }
        L1187: {
          var2 = fk.a(false, "TTREEN_INSTANTS");
          if (var2 != null) {
            go.field_h = uu.a(var2, (byte) -119);
            break L1187;
          } else {
            break L1187;
          }
        }
        L1188: {
          var2 = fk.a(false, "TTREEN_LANDSCAPE");
          if (var2 == null) {
            break L1188;
          } else {
            v.field_f = uu.a(var2, (byte) 77);
            break L1188;
          }
        }
        L1189: {
          var2 = fk.a(false, "TTREEN_INFLUENCE");
          if (null != var2) {
            fq.field_a = uu.a(var2, (byte) -93);
            break L1189;
          } else {
            break L1189;
          }
        }
        L1190: {
          var2 = fk.a(false, "TTREEN_RAYS");
          if (null == var2) {
            break L1190;
          } else {
            vv.field_a = uu.a(var2, (byte) 55);
            break L1190;
          }
        }
        L1191: {
          var2 = fk.a(false, "TTREEN_AURAS");
          if (var2 != null) {
            ij.field_v = uu.a(var2, (byte) -113);
            break L1191;
          } else {
            break L1191;
          }
        }
        L1192: {
          var2 = fk.a(false, "TTREEN_BOLTS");
          if (null != var2) {
            qb.field_l = uu.a(var2, (byte) 120);
            break L1192;
          } else {
            break L1192;
          }
        }
        L1193: {
          var2 = fk.a(false, "TTREEN_RAINS");
          if (var2 == null) {
            break L1193;
          } else {
            vv.field_c = uu.a(var2, (byte) -119);
            break L1193;
          }
        }
        L1194: {
          var2 = fk.a(false, "TTREEN_CURSE");
          if (null != var2) {
            iv.field_m = uu.a(var2, (byte) -121);
            break L1194;
          } else {
            break L1194;
          }
        }
        L1195: {
          var2 = fk.a(false, "TTREEN_SOURCERY");
          if (var2 == null) {
            break L1195;
          } else {
            dv.field_i = uu.a(var2, (byte) -97);
            break L1195;
          }
        }
        L1196: {
          var2 = fk.a(false, "TTREEN_PRAYER");
          if (var2 == null) {
            break L1196;
          } else {
            kp.field_j = uu.a(var2, (byte) -93);
            break L1196;
          }
        }
        L1197: {
          var2 = fk.a(false, "TTREEN_TONICS");
          if (null == var2) {
            break L1197;
          } else {
            c.field_b = uu.a(var2, (byte) -114);
            break L1197;
          }
        }
        L1198: {
          var2 = fk.a(false, "TTREEN_TOXINS");
          if (null == var2) {
            break L1198;
          } else {
            vf.field_h = uu.a(var2, (byte) -93);
            break L1198;
          }
        }
        L1199: {
          var2 = fk.a(false, "TTREEN_POLYMORPHICS");
          if (var2 == null) {
            break L1199;
          } else {
            ov.field_c = uu.a(var2, (byte) -109);
            break L1199;
          }
        }
        L1200: {
          var2 = fk.a(false, "TTREEN_MUTAGENS");
          if (null != var2) {
            rg.field_d = uu.a(var2, (byte) 50);
            break L1200;
          } else {
            break L1200;
          }
        }
        L1201: {
          var2 = fk.a(false, "TTREED_INVENTORY");
          if (null == var2) {
            break L1201;
          } else {
            ck.field_d = uu.a(var2, (byte) 19);
            break L1201;
          }
        }
        L1202: {
          var2 = fk.a(false, "TTREED_EQUIPMENT");
          if (null == var2) {
            break L1202;
          } else {
            ma.field_X = uu.a(var2, (byte) 25);
            break L1202;
          }
        }
        L1203: {
          var2 = fk.a(false, "TTREED_SPELLS");
          if (null == var2) {
            break L1203;
          } else {
            ea.field_b = uu.a(var2, (byte) 13);
            break L1203;
          }
        }
        L1204: {
          var2 = fk.a(false, "TTREED_POTIONS");
          if (null != var2) {
            vq.field_e = uu.a(var2, (byte) -115);
            break L1204;
          } else {
            break L1204;
          }
        }
        L1205: {
          var2 = fk.a(false, "TTREED_ARMOUR");
          if (var2 != null) {
            qu.field_n = uu.a(var2, (byte) 25);
            break L1205;
          } else {
            break L1205;
          }
        }
        L1206: {
          var2 = fk.a(false, "TTREED_WEAPONS");
          if (null != var2) {
            ed.field_a = uu.a(var2, (byte) -98);
            break L1206;
          } else {
            break L1206;
          }
        }
        L1207: {
          var2 = fk.a(false, "TTREED_ACCESSORIES");
          if (null != var2) {
            dq.field_d = uu.a(var2, (byte) -111);
            break L1207;
          } else {
            break L1207;
          }
        }
        L1208: {
          var2 = fk.a(false, "TTREED_PLATE");
          if (null == var2) {
            break L1208;
          } else {
            wh.field_e = uu.a(var2, (byte) -122);
            break L1208;
          }
        }
        L1209: {
          var2 = fk.a(false, "TTREED_PADDED");
          if (var2 == null) {
            break L1209;
          } else {
            ki.field_f = uu.a(var2, (byte) -116);
            break L1209;
          }
        }
        L1210: {
          var2 = fk.a(false, "TTREED_ENCHANTED");
          if (var2 != null) {
            nh.field_H = uu.a(var2, (byte) -126);
            break L1210;
          } else {
            break L1210;
          }
        }
        L1211: {
          var2 = fk.a(false, "TTREED_DRAGONSCALE");
          if (null != var2) {
            jb.field_n = uu.a(var2, (byte) -122);
            break L1211;
          } else {
            break L1211;
          }
        }
        L1212: {
          var2 = fk.a(false, "TTREED_CAMOUFLAGE");
          if (null == var2) {
            break L1212;
          } else {
            ai.field_J = uu.a(var2, (byte) -97);
            break L1212;
          }
        }
        L1213: {
          var2 = fk.a(false, "TTREED_RUNIC");
          if (var2 != null) {
            ll.field_Kb = uu.a(var2, (byte) -119);
            break L1213;
          } else {
            break L1213;
          }
        }
        L1214: {
          var2 = fk.a(false, "TTREED_SACRIFICIAL");
          if (null == var2) {
            break L1214;
          } else {
            mc.field_c = uu.a(var2, (byte) -117);
            break L1214;
          }
        }
        L1215: {
          var2 = fk.a(false, "TTREED_MELEE");
          if (var2 != null) {
            nv.field_J = uu.a(var2, (byte) -108);
            break L1215;
          } else {
            break L1215;
          }
        }
        L1216: {
          var2 = fk.a(false, "TTREED_RANGED");
          if (var2 == null) {
            break L1216;
          } else {
            dq.field_j = uu.a(var2, (byte) 114);
            break L1216;
          }
        }
        L1217: {
          var2 = fk.a(false, "TTREED_MAGIC");
          if (null != var2) {
            fm.field_b = uu.a(var2, (byte) -113);
            break L1217;
          } else {
            break L1217;
          }
        }
        L1218: {
          var2 = fk.a(false, "TTREED_AERIAL");
          if (var2 != null) {
            bl.field_a = uu.a(var2, (byte) 41);
            break L1218;
          } else {
            break L1218;
          }
        }
        L1219: {
          var2 = fk.a(false, "TTREED_FLAME");
          if (null == var2) {
            break L1219;
          } else {
            mn.field_q = uu.a(var2, (byte) 24);
            break L1219;
          }
        }
        L1220: {
          var2 = fk.a(false, "TTREED_HEALING");
          if (var2 != null) {
            bh.field_L = uu.a(var2, (byte) -94);
            break L1220;
          } else {
            break L1220;
          }
        }
        L1221: {
          var2 = fk.a(false, "TTREED_HARMING");
          if (var2 != null) {
            fj.field_u = uu.a(var2, (byte) 52);
            break L1221;
          } else {
            break L1221;
          }
        }
        L1222: {
          var2 = fk.a(false, "TTREED_MOVES");
          if (var2 != null) {
            hg.field_c = uu.a(var2, (byte) 104);
            break L1222;
          } else {
            break L1222;
          }
        }
        L1223: {
          var2 = fk.a(false, "TTREED_INSTANTS");
          if (var2 == null) {
            break L1223;
          } else {
            st.field_A = uu.a(var2, (byte) -106);
            break L1223;
          }
        }
        L1224: {
          var2 = fk.a(false, "TTREED_LANDSCAPE");
          if (null == var2) {
            break L1224;
          } else {
            nf.field_Pb = uu.a(var2, (byte) -109);
            break L1224;
          }
        }
        L1225: {
          var2 = fk.a(false, "TTREED_INFLUENCE");
          if (var2 == null) {
            break L1225;
          } else {
            rd.field_a = uu.a(var2, (byte) 61);
            break L1225;
          }
        }
        L1226: {
          var2 = fk.a(false, "TTREED_RAYS");
          if (var2 == null) {
            break L1226;
          } else {
            cn.field_q = uu.a(var2, (byte) 89);
            break L1226;
          }
        }
        L1227: {
          var2 = fk.a(false, "TTREED_AURAS");
          if (var2 == null) {
            break L1227;
          } else {
            cn.field_s = uu.a(var2, (byte) -110);
            break L1227;
          }
        }
        L1228: {
          var2 = fk.a(false, "TTREED_BOLTS");
          if (var2 == null) {
            break L1228;
          } else {
            ja.field_o = uu.a(var2, (byte) 124);
            break L1228;
          }
        }
        L1229: {
          var2 = fk.a(false, "TTREED_RAINS");
          if (null != var2) {
            ng.field_s = uu.a(var2, (byte) 121);
            break L1229;
          } else {
            break L1229;
          }
        }
        L1230: {
          var2 = fk.a(false, "TTREED_CURSE");
          if (null == var2) {
            break L1230;
          } else {
            m.field_g = uu.a(var2, (byte) 22);
            break L1230;
          }
        }
        L1231: {
          var2 = fk.a(false, "TTREED_SOURCERY");
          if (null == var2) {
            break L1231;
          } else {
            lf.field_v = uu.a(var2, (byte) -101);
            break L1231;
          }
        }
        L1232: {
          var2 = fk.a(false, "TTREED_PRAYER");
          if (var2 == null) {
            break L1232;
          } else {
            ir.field_l = uu.a(var2, (byte) -102);
            break L1232;
          }
        }
        L1233: {
          var2 = fk.a(false, "TTREED_TONICS");
          if (var2 != null) {
            ao.field_u = uu.a(var2, (byte) 94);
            break L1233;
          } else {
            break L1233;
          }
        }
        L1234: {
          var2 = fk.a(false, "TTREED_TOXINS");
          if (var2 != null) {
            gi.field_a = uu.a(var2, (byte) 91);
            break L1234;
          } else {
            break L1234;
          }
        }
        L1235: {
          var2 = fk.a(false, "TTREED_POLYMORPHICS");
          if (null != var2) {
            p.field_c = uu.a(var2, (byte) 40);
            break L1235;
          } else {
            break L1235;
          }
        }
        L1236: {
          var2 = fk.a(false, "TTREED_MUTAGENS");
          if (var2 != null) {
            sl.field_a = uu.a(var2, (byte) 101);
            break L1236;
          } else {
            break L1236;
          }
        }
        L1237: {
          var2 = fk.a(false, "TERROR_NOTMYTURN");
          if (null == var2) {
            break L1237;
          } else {
            sj.field_g = uu.a(var2, (byte) 36);
            break L1237;
          }
        }
        L1238: {
          var2 = fk.a(false, "TERROR_NOTYET");
          if (var2 != null) {
            kv.field_I = uu.a(var2, (byte) -111);
            break L1238;
          } else {
            break L1238;
          }
        }
        L1239: {
          var2 = fk.a(false, "TERROR_NOTENOUGHRUNES");
          if (null != var2) {
            nn.field_v = uu.a(var2, (byte) 63);
            break L1239;
          } else {
            break L1239;
          }
        }
        L1240: {
          var2 = fk.a(false, "TERROR_NOGOD");
          if (var2 == null) {
            break L1240;
          } else {
            a.field_n = uu.a(var2, (byte) 49);
            break L1240;
          }
        }
        L1241: {
          var2 = fk.a(false, "TERROR_GODMAXED");
          if (var2 == null) {
            break L1241;
          } else {
            rr.field_b = uu.a(var2, (byte) 96);
            break L1241;
          }
        }
        L1242: {
          var2 = fk.a(false, "TERROR_NOKBD");
          if (var2 != null) {
            ij.field_B = uu.a(var2, (byte) 117);
            break L1242;
          } else {
            break L1242;
          }
        }
        L1243: {
          var2 = fk.a(false, "TERROR_NOTARGET");
          if (var2 == null) {
            break L1243;
          } else {
            ld.field_G = uu.a(var2, (byte) 108);
            break L1243;
          }
        }
        L1244: {
          var2 = fk.a(false, "TERROR_NOPORTALS");
          if (null == var2) {
            break L1244;
          } else {
            kp.field_c = uu.a(var2, (byte) 60);
            break L1244;
          }
        }
        L1245: {
          var2 = fk.a(false, "TERROR_NOUNIT");
          if (null == var2) {
            break L1245;
          } else {
            ai.field_N = uu.a(var2, (byte) -126);
            break L1245;
          }
        }
        L1246: {
          var2 = fk.a(false, "TERROR_NOTALLY");
          if (var2 == null) {
            break L1246;
          } else {
            gp.field_a = uu.a(var2, (byte) 11);
            break L1246;
          }
        }
        L1247: {
          var2 = fk.a(false, "TERROR_NOTMINE");
          if (var2 == null) {
            break L1247;
          } else {
            ji.field_a = uu.a(var2, (byte) 16);
            break L1247;
          }
        }
        L1248: {
          var2 = fk.a(false, "TERROR_NOTENEMY");
          if (null != var2) {
            qv.field_r = uu.a(var2, (byte) 84);
            break L1248;
          } else {
            break L1248;
          }
        }
        L1249: {
          var2 = fk.a(false, "TERROR_NOTKQUEEN");
          if (var2 != null) {
            eq.field_k = uu.a(var2, (byte) -109);
            break L1249;
          } else {
            break L1249;
          }
        }
        L1250: {
          var2 = fk.a(false, "TERROR_NOTSONGSTRESS");
          if (var2 == null) {
            break L1250;
          } else {
            fg.field_n = uu.a(var2, (byte) 16);
            break L1250;
          }
        }
        L1251: {
          var2 = fk.a(false, "TERROR_NOTCYCLOPS");
          if (var2 != null) {
            pj.field_A = uu.a(var2, (byte) -119);
            break L1251;
          } else {
            break L1251;
          }
        }
        L1252: {
          var2 = fk.a(false, "TERROR_NOTOGRE");
          if (var2 == null) {
            break L1252;
          } else {
            al.field_i = uu.a(var2, (byte) 115);
            break L1252;
          }
        }
        L1253: {
          var2 = fk.a(false, "TERROR_NOTGOBLIN");
          if (null != var2) {
            cs.field_X = uu.a(var2, (byte) 110);
            break L1253;
          } else {
            break L1253;
          }
        }
        L1254: {
          var2 = fk.a(false, "TERROR_NOTMOVED");
          if (var2 == null) {
            break L1254;
          } else {
            eq.field_g = uu.a(var2, (byte) 108);
            break L1254;
          }
        }
        L1255: {
          var2 = fk.a(false, "TERROR_LOWLEVEL");
          if (var2 != null) {
            sq.field_s = uu.a(var2, (byte) 65);
            break L1255;
          } else {
            break L1255;
          }
        }
        L1256: {
          var2 = fk.a(false, "TERROR_NOTOTHER");
          if (var2 != null) {
            na.field_N = uu.a(var2, (byte) -126);
            break L1256;
          } else {
            break L1256;
          }
        }
        L1257: {
          var2 = fk.a(false, "TERROR_NOTFLAT");
          if (var2 == null) {
            break L1257;
          } else {
            qt.field_d = uu.a(var2, (byte) 83);
            break L1257;
          }
        }
        L1258: {
          var2 = fk.a(false, "TERROR_NOTVILLAGE");
          if (null != var2) {
            mt.field_g = uu.a(var2, (byte) -122);
            break L1258;
          } else {
            break L1258;
          }
        }
        L1259: {
          var2 = fk.a(false, "TERROR_NOTYOURS");
          if (null == var2) {
            break L1259;
          } else {
            ra.field_k = uu.a(var2, (byte) 29);
            break L1259;
          }
        }
        L1260: {
          var2 = fk.a(false, "TERROR_NOREVOLT");
          if (null == var2) {
            break L1260;
          } else {
            tv.field_d = uu.a(var2, (byte) -105);
            break L1260;
          }
        }
        L1261: {
          var2 = fk.a(false, "TERROR_NOTOWNED");
          if (var2 != null) {
            uc.field_c = uu.a(var2, (byte) 70);
            break L1261;
          } else {
            break L1261;
          }
        }
        L1262: {
          var2 = fk.a(false, "TERROR_NOTRINKET");
          if (null == var2) {
            break L1262;
          } else {
            qq.field_A = uu.a(var2, (byte) -100);
            break L1262;
          }
        }
        L1263: {
          var2 = fk.a(false, "TERROR_GOTONE");
          if (var2 != null) {
            ti.field_b = uu.a(var2, (byte) -126);
            break L1263;
          } else {
            break L1263;
          }
        }
        L1264: {
          var2 = fk.a(false, "TERROR_CLONING");
          if (var2 == null) {
            break L1264;
          } else {
            lb.field_b = uu.a(var2, (byte) -94);
            break L1264;
          }
        }
        L1265: {
          var2 = fk.a(false, "TERROR_CLONEIMMOBILE");
          if (var2 != null) {
            sd.field_l = uu.a(var2, (byte) -95);
            break L1265;
          } else {
            break L1265;
          }
        }
        L1266: {
          var2 = fk.a(false, "TERROR_CLONEJADEVINE");
          if (var2 != null) {
            oi.field_b = uu.a(var2, (byte) 56);
            break L1266;
          } else {
            break L1266;
          }
        }
        L1267: {
          var2 = fk.a(false, "TERROR_ACCESSORYFAIL");
          if (var2 != null) {
            sp.field_d = uu.a(var2, (byte) 44);
            break L1267;
          } else {
            break L1267;
          }
        }
        L1268: {
          var2 = fk.a(false, "TERROR_IRREGULARMOVE");
          if (var2 == null) {
            break L1268;
          } else {
            sc.field_i = uu.a(var2, (byte) -98);
            break L1268;
          }
        }
        L1269: {
          var2 = fk.a(false, "TERROR_ALREADYMOVED");
          if (null != var2) {
            vg.field_o = uu.a(var2, (byte) 123);
            break L1269;
          } else {
            break L1269;
          }
        }
        L1270: {
          var2 = fk.a(false, "TERROR_ALREADYUSED");
          if (null != var2) {
            po.field_a = uu.a(var2, (byte) -124);
            break L1270;
          } else {
            break L1270;
          }
        }
        L1271: {
          var2 = fk.a(false, "TERROR_NOSOULSTONELEADER");
          if (null != var2) {
            cl.field_w = uu.a(var2, (byte) -123);
            break L1271;
          } else {
            break L1271;
          }
        }
        L1272: {
          var2 = fk.a(false, "TERROR_BLADEFLYER");
          if (var2 == null) {
            break L1272;
          } else {
            ah.field_c = uu.a(var2, (byte) 123);
            break L1272;
          }
        }
        L1273: {
          var2 = fk.a(false, "TERROR_BLADEMAGE");
          if (var2 == null) {
            break L1273;
          } else {
            qa.field_E = uu.a(var2, (byte) 48);
            break L1273;
          }
        }
        L1274: {
          var2 = fk.a(false, "TERROR_BOWNORANGE");
          if (var2 == null) {
            break L1274;
          } else {
            wn.field_bb = uu.a(var2, (byte) -126);
            break L1274;
          }
        }
        L1275: {
          var2 = fk.a(false, "TERROR_HATNOMAGIC");
          if (null == var2) {
            break L1275;
          } else {
            hv.field_O = uu.a(var2, (byte) 68);
            break L1275;
          }
        }
        L1276: {
          var2 = fk.a(false, "TERROR_TALONSGROUNDED");
          if (var2 != null) {
            bc.field_h = uu.a(var2, (byte) 22);
            break L1276;
          } else {
            break L1276;
          }
        }
        L1277: {
          var2 = fk.a(false, "TERROR_FIRENOFLAME");
          if (var2 != null) {
            sd.field_r = uu.a(var2, (byte) -120);
            break L1277;
          } else {
            break L1277;
          }
        }
        L1278: {
          var2 = fk.a(false, "TERROR_CANNONFIREONLY");
          if (null == var2) {
            break L1278;
          } else {
            fc.field_c = uu.a(var2, (byte) -116);
            break L1278;
          }
        }
        L1279: {
          var2 = fk.a(false, "TERROR_POISONWEAPON");
          if (null == var2) {
            break L1279;
          } else {
            iu.field_r = uu.a(var2, (byte) -122);
            break L1279;
          }
        }
        L1280: {
          var2 = fk.a(false, "TERROR_POISONED");
          if (var2 != null) {
            jd.field_T = uu.a(var2, (byte) 73);
            break L1280;
          } else {
            break L1280;
          }
        }
        L1281: {
          var2 = fk.a(false, "TRINKET_WORTH");
          if (null == var2) {
            break L1281;
          } else {
            lt.field_f = uu.a(var2, (byte) -102);
            break L1281;
          }
        }
        L1282: {
          var2 = fk.a(false, "TRT_TEXT,0");
          if (var2 == null) {
            break L1282;
          } else {
            r.field_E[0] = uu.a(var2, (byte) -114);
            break L1282;
          }
        }
        L1283: {
          var2 = fk.a(false, "TRT_TEXT,1");
          if (null == var2) {
            break L1283;
          } else {
            r.field_E[1] = uu.a(var2, (byte) -97);
            break L1283;
          }
        }
        L1284: {
          var2 = fk.a(false, "TRT_TEXT,2");
          if (null == var2) {
            break L1284;
          } else {
            r.field_E[2] = uu.a(var2, (byte) -124);
            break L1284;
          }
        }
        L1285: {
          var2 = fk.a(false, "TRT_TEXT,3");
          if (var2 != null) {
            r.field_E[3] = uu.a(var2, (byte) -113);
            break L1285;
          } else {
            break L1285;
          }
        }
        L1286: {
          var2 = fk.a(false, "TRT_TEXT,4");
          if (null != var2) {
            r.field_E[4] = uu.a(var2, (byte) -105);
            break L1286;
          } else {
            break L1286;
          }
        }
        L1287: {
          var2 = fk.a(false, "TRT_TEXT,5");
          if (var2 == null) {
            break L1287;
          } else {
            r.field_E[5] = uu.a(var2, (byte) 101);
            break L1287;
          }
        }
        L1288: {
          var2 = fk.a(false, "TRT_TEXT,6");
          if (null != var2) {
            r.field_E[6] = uu.a(var2, (byte) -113);
            break L1288;
          } else {
            break L1288;
          }
        }
        if (param1 == 10207) {
          L1289: {
            var2 = fk.a(false, "TRT_TEXT,7");
            if (var2 == null) {
              break L1289;
            } else {
              r.field_E[7] = uu.a(var2, (byte) -118);
              break L1289;
            }
          }
          L1290: {
            var2 = fk.a(false, "TRT_TEXT,8");
            if (var2 != null) {
              r.field_E[8] = uu.a(var2, (byte) 100);
              break L1290;
            } else {
              break L1290;
            }
          }
          L1291: {
            var2 = fk.a(false, "TRT_TEXT,9");
            if (null != var2) {
              r.field_E[9] = uu.a(var2, (byte) -96);
              break L1291;
            } else {
              break L1291;
            }
          }
          L1292: {
            var2 = fk.a(false, "TRT_TEXT,10");
            if (var2 != null) {
              r.field_E[10] = uu.a(var2, (byte) 121);
              break L1292;
            } else {
              break L1292;
            }
          }
          L1293: {
            var2 = fk.a(false, "TRT_TEXT,11");
            if (null == var2) {
              break L1293;
            } else {
              r.field_E[11] = uu.a(var2, (byte) -107);
              break L1293;
            }
          }
          L1294: {
            var2 = fk.a(false, "TRT_TEXT,12");
            if (null != var2) {
              r.field_E[12] = uu.a(var2, (byte) -97);
              break L1294;
            } else {
              break L1294;
            }
          }
          L1295: {
            var2 = fk.a(false, "TRT_TEXT,13");
            if (var2 == null) {
              break L1295;
            } else {
              r.field_E[13] = uu.a(var2, (byte) -107);
              break L1295;
            }
          }
          L1296: {
            var2 = fk.a(false, "TRT_TEXT,14");
            if (null == var2) {
              break L1296;
            } else {
              r.field_E[14] = uu.a(var2, (byte) -124);
              break L1296;
            }
          }
          L1297: {
            var2 = fk.a(false, "TRT_TEXT,15");
            if (var2 != null) {
              r.field_E[15] = uu.a(var2, (byte) -125);
              break L1297;
            } else {
              break L1297;
            }
          }
          L1298: {
            var2 = fk.a(false, "TRT_TEXT,16");
            if (var2 != null) {
              r.field_E[16] = uu.a(var2, (byte) -128);
              break L1298;
            } else {
              break L1298;
            }
          }
          L1299: {
            var2 = fk.a(false, "TRT_TEXT,17");
            if (var2 == null) {
              break L1299;
            } else {
              r.field_E[17] = uu.a(var2, (byte) -94);
              break L1299;
            }
          }
          L1300: {
            var2 = fk.a(false, "TRT_TEXT,18");
            if (var2 == null) {
              break L1300;
            } else {
              r.field_E[18] = uu.a(var2, (byte) -126);
              break L1300;
            }
          }
          L1301: {
            var2 = fk.a(false, "TRT_TEXT,19");
            if (var2 == null) {
              break L1301;
            } else {
              r.field_E[19] = uu.a(var2, (byte) 86);
              break L1301;
            }
          }
          L1302: {
            var2 = fk.a(false, "TRT_TEXT,20");
            if (var2 != null) {
              r.field_E[20] = uu.a(var2, (byte) 16);
              break L1302;
            } else {
              break L1302;
            }
          }
          L1303: {
            var2 = fk.a(false, "TRT_TEXT,21");
            if (null != var2) {
              r.field_E[21] = uu.a(var2, (byte) -108);
              break L1303;
            } else {
              break L1303;
            }
          }
          L1304: {
            var2 = fk.a(false, "TRT_TEXT,22");
            if (var2 != null) {
              r.field_E[22] = uu.a(var2, (byte) 127);
              break L1304;
            } else {
              break L1304;
            }
          }
          L1305: {
            var2 = fk.a(false, "TRT_TEXT,23");
            if (var2 == null) {
              break L1305;
            } else {
              r.field_E[23] = uu.a(var2, (byte) 3);
              break L1305;
            }
          }
          L1306: {
            var2 = fk.a(false, "TRT_TEXT,24");
            if (null != var2) {
              r.field_E[24] = uu.a(var2, (byte) -108);
              break L1306;
            } else {
              break L1306;
            }
          }
          L1307: {
            var2 = fk.a(false, "TRT_TEXT,25");
            if (var2 != null) {
              r.field_E[25] = uu.a(var2, (byte) 102);
              break L1307;
            } else {
              break L1307;
            }
          }
          L1308: {
            var2 = fk.a(false, "TRT_TEXT,26");
            if (var2 == null) {
              break L1308;
            } else {
              r.field_E[26] = uu.a(var2, (byte) -107);
              break L1308;
            }
          }
          L1309: {
            var2 = fk.a(false, "TRT_TEXT,27");
            if (var2 != null) {
              r.field_E[27] = uu.a(var2, (byte) 60);
              break L1309;
            } else {
              break L1309;
            }
          }
          L1310: {
            var2 = fk.a(false, "TRT_TEXT,28");
            if (var2 == null) {
              break L1310;
            } else {
              r.field_E[28] = uu.a(var2, (byte) -127);
              break L1310;
            }
          }
          L1311: {
            var2 = fk.a(false, "TRT_TEXT,29");
            if (null != var2) {
              r.field_E[29] = uu.a(var2, (byte) -120);
              break L1311;
            } else {
              break L1311;
            }
          }
          L1312: {
            var2 = fk.a(false, "TRT_TEXT,30");
            if (null != var2) {
              r.field_E[30] = uu.a(var2, (byte) 88);
              break L1312;
            } else {
              break L1312;
            }
          }
          L1313: {
            var2 = fk.a(false, "TRT_TEXT,31");
            if (var2 == null) {
              break L1313;
            } else {
              r.field_E[31] = uu.a(var2, (byte) -108);
              break L1313;
            }
          }
          L1314: {
            var2 = fk.a(false, "TRT_TEXT,32");
            if (var2 != null) {
              r.field_E[32] = uu.a(var2, (byte) -110);
              break L1314;
            } else {
              break L1314;
            }
          }
          L1315: {
            var2 = fk.a(false, "TRT_TEXT,33");
            if (var2 == null) {
              break L1315;
            } else {
              r.field_E[33] = uu.a(var2, (byte) 95);
              break L1315;
            }
          }
          L1316: {
            var2 = fk.a(false, "trinketcongratulations,0");
            if (null != var2) {
              us.field_b[0] = uu.a(var2, (byte) -128);
              break L1316;
            } else {
              break L1316;
            }
          }
          L1317: {
            var2 = fk.a(false, "trinketcongratulations,1");
            if (var2 == null) {
              break L1317;
            } else {
              us.field_b[1] = uu.a(var2, (byte) 88);
              break L1317;
            }
          }
          L1318: {
            var2 = fk.a(false, "trinketcongratulations,2");
            if (var2 == null) {
              break L1318;
            } else {
              us.field_b[2] = uu.a(var2, (byte) -109);
              break L1318;
            }
          }
          L1319: {
            var2 = fk.a(false, "trinketcongratulations,3");
            if (null == var2) {
              break L1319;
            } else {
              us.field_b[3] = uu.a(var2, (byte) -99);
              break L1319;
            }
          }
          L1320: {
            var2 = fk.a(false, "trinketcongratulations,4");
            if (var2 != null) {
              us.field_b[4] = uu.a(var2, (byte) -94);
              break L1320;
            } else {
              break L1320;
            }
          }
          L1321: {
            var2 = fk.a(false, "trinketcongratulations,5");
            if (null == var2) {
              break L1321;
            } else {
              us.field_b[5] = uu.a(var2, (byte) 40);
              break L1321;
            }
          }
          L1322: {
            var2 = fk.a(false, "trinketcongratulations,6");
            if (var2 == null) {
              break L1322;
            } else {
              us.field_b[6] = uu.a(var2, (byte) 105);
              break L1322;
            }
          }
          L1323: {
            var2 = fk.a(false, "trinketcongratulations,7");
            if (null != var2) {
              us.field_b[7] = uu.a(var2, (byte) 58);
              break L1323;
            } else {
              break L1323;
            }
          }
          L1324: {
            var2 = fk.a(false, "trinketcongratulations,8");
            if (var2 != null) {
              us.field_b[8] = uu.a(var2, (byte) 7);
              break L1324;
            } else {
              break L1324;
            }
          }
          L1325: {
            var2 = fk.a(false, "trinketcongratulations,9");
            if (var2 != null) {
              us.field_b[9] = uu.a(var2, (byte) -95);
              break L1325;
            } else {
              break L1325;
            }
          }
          L1326: {
            var2 = fk.a(false, "trinketcongratulations,10");
            if (var2 == null) {
              break L1326;
            } else {
              us.field_b[10] = uu.a(var2, (byte) 57);
              break L1326;
            }
          }
          L1327: {
            var2 = fk.a(false, "trinketcongratulations,11");
            if (null != var2) {
              us.field_b[11] = uu.a(var2, (byte) 47);
              break L1327;
            } else {
              break L1327;
            }
          }
          L1328: {
            var2 = fk.a(false, "trinketcongratulations,12");
            if (null == var2) {
              break L1328;
            } else {
              us.field_b[12] = uu.a(var2, (byte) -125);
              break L1328;
            }
          }
          L1329: {
            var2 = fk.a(false, "trinketcongratulations,13");
            if (null == var2) {
              break L1329;
            } else {
              us.field_b[13] = uu.a(var2, (byte) 68);
              break L1329;
            }
          }
          L1330: {
            var2 = fk.a(false, "trinketcongratulations,14");
            if (null != var2) {
              us.field_b[14] = uu.a(var2, (byte) -107);
              break L1330;
            } else {
              break L1330;
            }
          }
          L1331: {
            var2 = fk.a(false, "trinketcongratulations,15");
            if (null != var2) {
              us.field_b[15] = uu.a(var2, (byte) -115);
              break L1331;
            } else {
              break L1331;
            }
          }
          L1332: {
            var2 = fk.a(false, "trinketcongratulations,16");
            if (null == var2) {
              break L1332;
            } else {
              us.field_b[16] = uu.a(var2, (byte) 46);
              break L1332;
            }
          }
          L1333: {
            var2 = fk.a(false, "trinketcongratulations,17");
            if (null == var2) {
              break L1333;
            } else {
              us.field_b[17] = uu.a(var2, (byte) 42);
              break L1333;
            }
          }
          L1334: {
            var2 = fk.a(false, "trinketcongratulations,18");
            if (null == var2) {
              break L1334;
            } else {
              us.field_b[18] = uu.a(var2, (byte) 93);
              break L1334;
            }
          }
          L1335: {
            var2 = fk.a(false, "trinketcongratulations,19");
            if (var2 != null) {
              us.field_b[19] = uu.a(var2, (byte) -112);
              break L1335;
            } else {
              break L1335;
            }
          }
          L1336: {
            var2 = fk.a(false, "trinketcongratulations,20");
            if (null == var2) {
              break L1336;
            } else {
              us.field_b[20] = uu.a(var2, (byte) 95);
              break L1336;
            }
          }
          L1337: {
            var2 = fk.a(false, "trinketcongratulations,21");
            if (null == var2) {
              break L1337;
            } else {
              us.field_b[21] = uu.a(var2, (byte) 79);
              break L1337;
            }
          }
          L1338: {
            var2 = fk.a(false, "trinketcongratulations,22");
            if (null != var2) {
              us.field_b[22] = uu.a(var2, (byte) -104);
              break L1338;
            } else {
              break L1338;
            }
          }
          L1339: {
            var2 = fk.a(false, "trinketcongratulations,23");
            if (null != var2) {
              us.field_b[23] = uu.a(var2, (byte) -105);
              break L1339;
            } else {
              break L1339;
            }
          }
          L1340: {
            var2 = fk.a(false, "trinketcongratulations,24");
            if (var2 == null) {
              break L1340;
            } else {
              us.field_b[24] = uu.a(var2, (byte) -105);
              break L1340;
            }
          }
          L1341: {
            var2 = fk.a(false, "trinketcongratulations,25");
            if (var2 != null) {
              us.field_b[25] = uu.a(var2, (byte) 42);
              break L1341;
            } else {
              break L1341;
            }
          }
          L1342: {
            var2 = fk.a(false, "trinketcongratulations,26");
            if (null == var2) {
              break L1342;
            } else {
              us.field_b[26] = uu.a(var2, (byte) -121);
              break L1342;
            }
          }
          L1343: {
            var2 = fk.a(false, "trinketcongratulations,27");
            if (var2 == null) {
              break L1343;
            } else {
              us.field_b[27] = uu.a(var2, (byte) 111);
              break L1343;
            }
          }
          L1344: {
            var2 = fk.a(false, "trinketcongratulations,28");
            if (null != var2) {
              us.field_b[28] = uu.a(var2, (byte) 31);
              break L1344;
            } else {
              break L1344;
            }
          }
          L1345: {
            var2 = fk.a(false, "LABEL_EQUIPMENTSELECT");
            if (var2 != null) {
              String discarded$29 = uu.a(var2, (byte) 58);
              break L1345;
            } else {
              break L1345;
            }
          }
          L1346: {
            var2 = fk.a(false, "LABEL_EQUIPMENTNAVIGATE");
            if (var2 != null) {
              ae.field_x = uu.a(var2, (byte) 109);
              break L1346;
            } else {
              break L1346;
            }
          }
          L1347: {
            var2 = fk.a(false, "LABEL_EQUIPMENTSTOCK");
            if (var2 == null) {
              break L1347;
            } else {
              ar.field_x = uu.a(var2, (byte) 63);
              break L1347;
            }
          }
          L1348: {
            var2 = fk.a(false, "LABEL_STOCK");
            if (null != var2) {
              ou.field_j = uu.a(var2, (byte) 20);
              break L1348;
            } else {
              break L1348;
            }
          }
          L1349: {
            var2 = fk.a(false, "LABEL_STORE");
            if (var2 == null) {
              break L1349;
            } else {
              l.field_e = uu.a(var2, (byte) 23);
              break L1349;
            }
          }
          L1350: {
            var2 = fk.a(false, "LABEL_EQUIPPED");
            if (null == var2) {
              break L1350;
            } else {
              cp.field_c = uu.a(var2, (byte) 30);
              break L1350;
            }
          }
          L1351: {
            var2 = fk.a(false, "LABEL_STOCKBUTTON");
            if (null == var2) {
              break L1351;
            } else {
              fu.field_b = uu.a(var2, (byte) 94);
              break L1351;
            }
          }
          L1352: {
            var2 = fk.a(false, "LABEL_STOREBUTTON");
            if (var2 != null) {
              nu.field_w = uu.a(var2, (byte) -113);
              break L1352;
            } else {
              break L1352;
            }
          }
          L1353: {
            var2 = fk.a(false, "LABEL_EQUIP");
            if (var2 == null) {
              break L1353;
            } else {
              wi.field_h = uu.a(var2, (byte) -117);
              break L1353;
            }
          }
          L1354: {
            var2 = fk.a(false, "LABEL_DEQUIP");
            if (null == var2) {
              break L1354;
            } else {
              ni.field_c = uu.a(var2, (byte) 45);
              break L1354;
            }
          }
          L1355: {
            var2 = fk.a(false, "caption1");
            if (null != var2) {
              hi.field_a = uu.a(var2, (byte) -109);
              break L1355;
            } else {
              break L1355;
            }
          }
          L1356: {
            var2 = fk.a(false, "caption2");
            if (var2 != null) {
              gm.field_b = uu.a(var2, (byte) 119);
              break L1356;
            } else {
              break L1356;
            }
          }
          L1357: {
            var2 = fk.a(false, "caption3");
            if (null == var2) {
              break L1357;
            } else {
              ft.field_o = uu.a(var2, (byte) -112);
              break L1357;
            }
          }
          L1358: {
            var2 = fk.a(false, "caption4");
            if (var2 == null) {
              break L1358;
            } else {
              pp.field_S = uu.a(var2, (byte) 10);
              break L1358;
            }
          }
          L1359: {
            var2 = fk.a(false, "caption5");
            if (null == var2) {
              break L1359;
            } else {
              bj.field_q = uu.a(var2, (byte) 107);
              break L1359;
            }
          }
          L1360: {
            var2 = fk.a(false, "membersExpanionTitle");
            if (null == var2) {
              break L1360;
            } else {
              bi.field_c = uu.a(var2, (byte) -99);
              break L1360;
            }
          }
          L1361: {
            var2 = fk.a(false, "PRESTIGE_LEVEL");
            if (var2 == null) {
              break L1361;
            } else {
              hf.field_e = uu.a(var2, (byte) 30);
              break L1361;
            }
          }
          L1362: {
            var2 = fk.a(false, "PRESTIGE_GOT");
            if (null != var2) {
              gt.field_g = uu.a(var2, (byte) -100);
              break L1362;
            } else {
              break L1362;
            }
          }
          L1363: {
            var2 = fk.a(false, "PRESTIGE_DETAILS");
            if (var2 == null) {
              break L1363;
            } else {
              hw.field_w = uu.a(var2, (byte) 66);
              break L1363;
            }
          }
          L1364: {
            var2 = fk.a(false, "PRESTIGE_REFUNDING");
            if (var2 != null) {
              qf.field_b = uu.a(var2, (byte) 47);
              break L1364;
            } else {
              break L1364;
            }
          }
          L1365: {
            var2 = fk.a(false, "TRINKET_USE_MESSAGE");
            if (null == var2) {
              break L1365;
            } else {
              jr.field_e = uu.a(var2, (byte) 67);
              break L1365;
            }
          }
          L1366: {
            var2 = fk.a(false, "TRINKET_ACCESSORY_CONFIRM");
            if (var2 == null) {
              break L1366;
            } else {
              io.field_u = uu.a(var2, (byte) 11);
              break L1366;
            }
          }
          L1367: {
            var2 = fk.a(false, "TRINKET_ARMOUR_CONFIRM");
            if (null == var2) {
              break L1367;
            } else {
              oo.field_o = uu.a(var2, (byte) -123);
              break L1367;
            }
          }
          L1368: {
            var2 = fk.a(false, "TRINKET_WEAPON_CONFIRM");
            if (null != var2) {
              rb.field_c = uu.a(var2, (byte) -108);
              break L1368;
            } else {
              break L1368;
            }
          }
          L1369: {
            var2 = fk.a(false, "TRINKET_TURN_LIMIT");
            if (var2 == null) {
              break L1369;
            } else {
              ae.field_w = uu.a(var2, (byte) 118);
              break L1369;
            }
          }
          L1370: {
            var2 = fk.a(false, "TRINKET_EMPTY");
            if (null != var2) {
              st.field_y = uu.a(var2, (byte) -111);
              break L1370;
            } else {
              break L1370;
            }
          }
          L1371: {
            var2 = fk.a(false, "TRINKET_SCROLL");
            if (null != var2) {
              dq.field_g = uu.a(var2, (byte) -126);
              break L1371;
            } else {
              break L1371;
            }
          }
          L1372: {
            var2 = fk.a(false, "MEMBERS_ONLY");
            if (var2 != null) {
              bn.field_g = uu.a(var2, (byte) -107);
              break L1372;
            } else {
              break L1372;
            }
          }
          L1373: {
            var2 = fk.a(false, "ZERO");
            if (var2 != null) {
              dv.field_g = uu.a(var2, (byte) -111);
              break L1373;
            } else {
              break L1373;
            }
          }
          sb.field_e = null;
          L1374: {
            if (var3 == 0) {
              break L1374;
            } else {
              L1375: {
                if (!iv.field_k) {
                  stackOut_3451_0 = 1;
                  stackIn_3452_0 = stackOut_3451_0;
                  break L1375;
                } else {
                  stackOut_3450_0 = 0;
                  stackIn_3452_0 = stackOut_3450_0;
                  break L1375;
                }
              }
              iv.field_k = stackIn_3452_0 != 0;
              break L1374;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(cf param0, byte param1, bv param2) {
        RuntimeException var3 = null;
        id var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sd var7 = null;
        id[] var8 = null;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_ref = new id();
            var3_ref.field_a = param2.k(0);
            var3_ref.field_e = param2.h((byte) 121);
            var3_ref.field_b = param2.e((byte) -104);
            if (param1 == -7) {
              var4 = param2.k(0);
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var5 <= ~var4) {
                      break L3;
                    } else {
                      var6 = param2.k(param1 + 7);
                      var7 = param0.field_q[var6];
                      int fieldTemp$1 = var7.field_o;
                      var7.field_o = var7.field_o + 1;
                      var7.field_k[fieldTemp$1] = var3_ref;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (~var7.field_o != ~var7.field_k.length) {
                            break L4;
                          } else {
                            var8 = var7.field_k;
                            var7.field_k = new id[10 + var8.length];
                            vm.a((Object[]) (Object) var8, 0, (Object[]) (Object) var7.field_k, 0, var8.length);
                            break L4;
                          }
                        }
                        var5++;
                        if (var9 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("em.A(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gs.field_a) {
                L2: {
                  var9_int = param4 + og.field_p[param4];
                  if (!vs.field_e[param4].c((byte) -79)) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var10 = vs.field_e[param4].b((byte) -102);
                        var11 = 0;
                        if (param6 == 0) {
                          break L4;
                        } else {
                          if (var10 != vs.field_e[param4 - 1].b((byte) -34)) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var11 = var11 | 1;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (0 == param2) {
                          break L6;
                        } else {
                          if (vs.field_e[-ks.field_y + param4].b((byte) -96) == var10) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var11 = var11 | 2;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (param6 == -1 + ks.field_y) {
                          break L8;
                        } else {
                          if (~vs.field_e[param4 - -1].b((byte) -95) != ~var10) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = var11 | 4;
                      break L7;
                    }
                    L9: {
                      L10: {
                        if (~(ef.field_c - 1) == ~param2) {
                          break L10;
                        } else {
                          if (vs.field_e[ks.field_y + param4].b((byte) -55) != var10) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var11 = var11 | 8;
                      break L9;
                    }
                    dm.a(var10, false, 20 + param3, param7 - -40, var11, true);
                    break L2;
                  }
                }
                L11: {
                  var10 = fn.field_Q[vs.field_e[param4].field_h];
                  if (var10 > -1) {
                    L12: {
                      var11 = vs.field_e[param4].field_a;
                      if (bv.field_w == null) {
                        break L12;
                      } else {
                        var11 = bv.field_w.o(var11, -1);
                        break L12;
                      }
                    }
                    L13: {
                      if (var10 != 2) {
                        break L13;
                      } else {
                        L14: {
                          l.field_b[17].b(param7, -40 + param3, param0, param8);
                          mv.a(param7 - -20, (byte) -95, ug.field_b + param4, var11, param3);
                          if (var11 > -1) {
                            ks.a(mn.field_k[76][var11], false, -40 + param3, pr.field_g, 128, 150, param7, (js) null, -10374);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        l.field_b[16].b(param7, -40 + param3, param0, param8);
                        break L13;
                      }
                    }
                    L15: {
                      if (var10 != 3) {
                        break L15;
                      } else {
                        L16: {
                          if (var11 > -1) {
                            mv.a(param7 + 20, (byte) -74, param4 + ug.field_b, var11, param3);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        ks.a(mn.field_k[76][var11], false, param3 - 40, pr.field_g, 128, 150, param7, (js) null, -10374);
                        if (var13 == 0) {
                          break L11;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (!param1) {
                      L17: {
                        if (var10 != 1) {
                          break L17;
                        } else {
                          l.field_b[8 - -(var9_int % 3)].b(param7, -50 + param3, param0, param8);
                          if (var11 <= -1) {
                            break L11;
                          } else {
                            wb.a(7816226, 21 + param7, var11, param4 - -ug.field_b, param3 - 30);
                            if (var13 == 0) {
                              break L11;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L18: {
                        if (8 == var10) {
                          break L18;
                        } else {
                          L19: {
                            if (9 != var10) {
                              break L19;
                            } else {
                              l.field_b[var9_int % 2 + 14].a(param7, -40 + param3);
                              if (var13 == 0) {
                                break L11;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if (var10 != 0) {
                              break L20;
                            } else {
                              l.field_b[var9_int % 8].b(param7, param3 + -40, param0, param8);
                              if (var11 <= -1) {
                                break L11;
                              } else {
                                wb.a(7816226, 20 + param7, var11, param4 - -ug.field_b, param3 + 10);
                                if (var13 == 0) {
                                  break L11;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          L21: {
                            if (var10 != 4) {
                              break L21;
                            } else {
                              la.a(param3 - -20, og.field_p[param4] + param4, param8, 40 + param7, param0, false);
                              if (var13 == 0) {
                                break L11;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (var10 == 6) {
                            ui.a(param2, param7, (byte) -107, param6, param3);
                            if (var13 == 0) {
                              break L11;
                            } else {
                              break L18;
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                      L22: {
                        L23: {
                          var12 = -15;
                          if (bt.field_f != 4) {
                            break L23;
                          } else {
                            var12 -= 22;
                            if (var13 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var12 -= 10;
                        break L22;
                      }
                      l.field_b[var9_int % 2 + 11].b(param7, -50 + param3, param0, param8);
                      if (var11 <= -1) {
                        break L11;
                      } else {
                        wb.a(7816226, param7 + 22, var11, param4 + ug.field_b, param3 - -var12);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L24: {
                  if (!vs.field_e[param4].c(-26)) {
                    break L24;
                  } else {
                    es.field_d[var9_int % 4].b(param7, -25 + param3, param0, param8);
                    break L24;
                  }
                }
                var11 = bv.field_w.b(param5 + 31, param2, param6, -1);
                var12 = vs.field_e[param4].field_h;
                if (4 == var12) {
                  break L1;
                } else {
                  if (var12 == 6) {
                    break L1;
                  } else {
                    if (var12 == 2) {
                      break L1;
                    } else {
                      if (0 == (var11 & 1)) {
                        break L1;
                      } else {
                        jr.a(var9_int, param5 ^ 117, param3, ug.field_b, param7);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L25: {
              if (param5 == 0) {
                break L25;
              } else {
                em.a((cf) null, (byte) -46, (bv) null);
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var9, "em.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              if (param0 == 1) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            field_e = null;
            field_c = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "em.B(" + param0 + 41);
        }
    }

    em(int param0) {
        try {
            ((em) this).field_f = param0;
            ((em) this).field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "em.<init>(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Theme: ";
        field_c = "Skip";
        field_d = "Invite players";
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }
}
