/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static tg[] field_c;
    static int[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fk.field_a = param0 >> 4 & 3;
              wb.field_a = (13 & param0) >> 2;
              if (fk.field_a > 2) {
                fk.field_a = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (wb.field_a <= 2) {
                break L2;
              } else {
                wb.field_a = 2;
                break L2;
              }
            }
            L3: {
              bk.field_a = 3 & param0;
              if (bk.field_a <= 2) {
                break L3;
              } else {
                bk.field_a = 2;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "ij.C(" + param0 + 44 + 2 + 41);
        }
    }

    final static void a(gk param0) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_229_0 = null;
        StringBuilder stackIn_229_1 = null;
        RuntimeException stackIn_231_0 = null;
        StringBuilder stackIn_231_1 = null;
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        String stackIn_232_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_228_0 = null;
        StringBuilder stackOut_228_1 = null;
        RuntimeException stackOut_231_0 = null;
        StringBuilder stackOut_231_1 = null;
        String stackOut_231_2 = null;
        RuntimeException stackOut_229_0 = null;
        StringBuilder stackOut_229_1 = null;
        String stackOut_229_2 = null;
        try {
          L0: {
            L1: {
              ih.field_p = param0;
              var2 = mg.a((byte) 48, "achievement_names,0");
              if (null != var2) {
                lj.field_b[0] = c.a(0, var2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = mg.a((byte) 48, "achievement_names,1");
              if (var2 == null) {
                break L2;
              } else {
                lj.field_b[1] = c.a(0, var2);
                break L2;
              }
            }
            L3: {
              var2 = mg.a((byte) 48, "achievement_names,2");
              if (var2 != null) {
                lj.field_b[2] = c.a(0, var2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = mg.a((byte) 48, "achievement_names,3");
              if (null == var2) {
                break L4;
              } else {
                lj.field_b[3] = c.a(0, var2);
                break L4;
              }
            }
            L5: {
              var2 = mg.a((byte) 48, "achievement_names,4");
              if (var2 == null) {
                break L5;
              } else {
                lj.field_b[4] = c.a(0, var2);
                break L5;
              }
            }
            L6: {
              var2 = mg.a((byte) 48, "achievement_names,5");
              if (null == var2) {
                break L6;
              } else {
                lj.field_b[5] = c.a(0, var2);
                break L6;
              }
            }
            L7: {
              var2 = mg.a((byte) 48, "achievement_names,6");
              if (null != var2) {
                lj.field_b[6] = c.a(0, var2);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2 = mg.a((byte) 48, "achievement_names,7");
              if (null != var2) {
                lj.field_b[7] = c.a(0, var2);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2 = mg.a((byte) 48, "achievement_names,8");
              if (var2 == null) {
                break L9;
              } else {
                lj.field_b[8] = c.a(0, var2);
                break L9;
              }
            }
            L10: {
              var2 = mg.a((byte) 48, "achievement_names,9");
              if (var2 != null) {
                lj.field_b[9] = c.a(0, var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2 = mg.a((byte) 48, "achievement_criteria,0");
              if (null == var2) {
                break L11;
              } else {
                bb.field_a[0] = c.a(0, var2);
                break L11;
              }
            }
            L12: {
              var2 = mg.a((byte) 48, "achievement_criteria,1");
              if (var2 != null) {
                bb.field_a[1] = c.a(0, var2);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var2 = mg.a((byte) 48, "achievement_criteria,2");
              if (var2 == null) {
                break L13;
              } else {
                bb.field_a[2] = c.a(0, var2);
                break L13;
              }
            }
            L14: {
              var2 = mg.a((byte) 48, "achievement_criteria,3");
              if (null != var2) {
                bb.field_a[3] = c.a(0, var2);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = mg.a((byte) 48, "achievement_criteria,4");
              if (var2 == null) {
                break L15;
              } else {
                bb.field_a[4] = c.a(0, var2);
                break L15;
              }
            }
            L16: {
              var2 = mg.a((byte) 48, "achievement_criteria,5");
              if (var2 != null) {
                bb.field_a[5] = c.a(0, var2);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var2 = mg.a((byte) 48, "achievement_criteria,6");
              if (var2 != null) {
                bb.field_a[6] = c.a(0, var2);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = mg.a((byte) 48, "achievement_criteria,7");
              if (null != var2) {
                bb.field_a[7] = c.a(0, var2);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2 = mg.a((byte) 48, "achievement_criteria,8");
              if (var2 == null) {
                break L19;
              } else {
                bb.field_a[8] = c.a(0, var2);
                break L19;
              }
            }
            L20: {
              var2 = mg.a((byte) 48, "achievement_criteria,9");
              if (var2 == null) {
                break L20;
              } else {
                bb.field_a[9] = c.a(0, var2);
                break L20;
              }
            }
            L21: {
              var2 = mg.a((byte) 48, "pressescape");
              if (null == var2) {
                break L21;
              } else {
                hf.field_c = c.a(0, var2);
                break L21;
              }
            }
            L22: {
              var2 = mg.a((byte) 48, "scorehyphen");
              if (var2 != null) {
                ui.field_j = c.a(0, var2);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2 = mg.a((byte) 48, "music");
              if (var2 != null) {
                ob.field_b = c.a(0, var2);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2 = mg.a((byte) 48, "sound");
              if (null == var2) {
                break L24;
              } else {
                md.field_u = c.a(0, var2);
                break L24;
              }
            }
            L25: {
              var2 = mg.a((byte) 48, "threeplayer");
              if (null != var2) {
                kl.field_m = c.a(0, var2);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = mg.a((byte) 48, "twoplayer");
              if (var2 == null) {
                break L26;
              } else {
                nf.field_b = c.a(0, var2);
                break L26;
              }
            }
            L27: {
              var2 = mg.a((byte) 48, "oneplayer");
              if (var2 == null) {
                break L27;
              } else {
                c.field_b = c.a(0, var2);
                break L27;
              }
            }
            L28: {
              var2 = mg.a((byte) 48, "waitforhs");
              if (null != var2) {
                ib.field_j = c.a(0, var2);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              var2 = mg.a((byte) 48, "nohs");
              if (var2 != null) {
                jk.field_m = c.a(0, var2);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              var2 = mg.a((byte) 48, "ins,0");
              if (var2 == null) {
                break L30;
              } else {
                Bounce.field_A[0] = c.a(0, var2);
                break L30;
              }
            }
            L31: {
              var2 = mg.a((byte) 48, "ins,1");
              if (null != var2) {
                Bounce.field_A[1] = c.a(0, var2);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = mg.a((byte) 48, "ins,2");
              if (var2 == null) {
                break L32;
              } else {
                Bounce.field_A[2] = c.a(0, var2);
                break L32;
              }
            }
            L33: {
              var2 = mg.a((byte) 48, "ins,3");
              if (null == var2) {
                break L33;
              } else {
                Bounce.field_A[3] = c.a(0, var2);
                break L33;
              }
            }
            L34: {
              var2 = mg.a((byte) 48, "ins,4");
              if (var2 != null) {
                Bounce.field_A[4] = c.a(0, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = mg.a((byte) 48, "ins,5");
              if (var2 == null) {
                break L35;
              } else {
                Bounce.field_A[5] = c.a(0, var2);
                break L35;
              }
            }
            L36: {
              var2 = mg.a((byte) 48, "ins,6");
              if (null != var2) {
                Bounce.field_A[6] = c.a(0, var2);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2 = mg.a((byte) 48, "ins,7");
              if (var2 == null) {
                break L37;
              } else {
                Bounce.field_A[7] = c.a(0, var2);
                break L37;
              }
            }
            L38: {
              var2 = mg.a((byte) 48, "ins,8");
              if (null == var2) {
                break L38;
              } else {
                Bounce.field_A[8] = c.a(0, var2);
                break L38;
              }
            }
            L39: {
              var2 = mg.a((byte) 48, "ins,9");
              if (var2 != null) {
                Bounce.field_A[9] = c.a(0, var2);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = mg.a((byte) 48, "ins,10");
              if (var2 != null) {
                Bounce.field_A[10] = c.a(0, var2);
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              var2 = mg.a((byte) 48, "ins,11");
              if (var2 != null) {
                Bounce.field_A[11] = c.a(0, var2);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2 = mg.a((byte) 48, "ins,12");
              if (var2 == null) {
                break L42;
              } else {
                Bounce.field_A[12] = c.a(0, var2);
                break L42;
              }
            }
            L43: {
              var2 = mg.a((byte) 48, "ins,13");
              if (var2 != null) {
                Bounce.field_A[13] = c.a(0, var2);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2 = mg.a((byte) 48, "ins,14");
              if (var2 != null) {
                Bounce.field_A[14] = c.a(0, var2);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              var2 = mg.a((byte) 48, "ins,15");
              if (null == var2) {
                break L45;
              } else {
                Bounce.field_A[15] = c.a(0, var2);
                break L45;
              }
            }
            L46: {
              var2 = mg.a((byte) 48, "ins,16");
              if (var2 != null) {
                Bounce.field_A[16] = c.a(0, var2);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = mg.a((byte) 48, "ins,17");
              if (var2 == null) {
                break L47;
              } else {
                Bounce.field_A[17] = c.a(0, var2);
                break L47;
              }
            }
            L48: {
              var2 = mg.a((byte) 48, "ins,18");
              if (null == var2) {
                break L48;
              } else {
                Bounce.field_A[18] = c.a(0, var2);
                break L48;
              }
            }
            L49: {
              var2 = mg.a((byte) 48, "ins,19");
              if (var2 != null) {
                Bounce.field_A[19] = c.a(0, var2);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2 = mg.a((byte) 48, "ins,20");
              if (var2 != null) {
                Bounce.field_A[20] = c.a(0, var2);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              var2 = mg.a((byte) 48, "ins,21");
              if (var2 == null) {
                break L51;
              } else {
                Bounce.field_A[21] = c.a(0, var2);
                break L51;
              }
            }
            L52: {
              var2 = mg.a((byte) 48, "ins,22");
              if (var2 != null) {
                Bounce.field_A[22] = c.a(0, var2);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2 = mg.a((byte) 48, "ins,23");
              if (null != var2) {
                Bounce.field_A[23] = c.a(0, var2);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2 = mg.a((byte) 48, "ins,24");
              if (null != var2) {
                Bounce.field_A[24] = c.a(0, var2);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = mg.a((byte) 48, "ins,25");
              if (null != var2) {
                Bounce.field_A[25] = c.a(0, var2);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2 = mg.a((byte) 48, "p1");
              if (var2 == null) {
                break L56;
              } else {
                u.field_f = c.a(0, var2);
                break L56;
              }
            }
            L57: {
              var2 = mg.a((byte) 48, "p2");
              if (null != var2) {
                c.field_a = c.a(0, var2);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              var2 = mg.a((byte) 48, "p3");
              if (null != var2) {
                bk.field_b = c.a(0, var2);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2 = mg.a((byte) 48, "arr");
              var3 = 0;
              if (var2 != null) {
                wa.field_a = c.a(0, var2);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = mg.a((byte) 48, "keys");
              if (var2 != null) {
                ka.field_k = c.a(0, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = mg.a((byte) 48, "keycode_player1left");
              if (null == var2) {
                break L61;
              } else {
                nj.field_m = 255 & var2[0];
                break L61;
              }
            }
            L62: {
              var2 = mg.a((byte) 48, "keycode_player1right");
              if (var2 == null) {
                break L62;
              } else {
                ee.field_a = 255 & var2[0];
                break L62;
              }
            }
            L63: {
              var2 = mg.a((byte) 48, "keycode_player2left");
              if (null == var2) {
                break L63;
              } else {
                nb.field_g = 255 & var2[0];
                break L63;
              }
            }
            L64: {
              var2 = mg.a((byte) 48, "keycode_player2right");
              ih.field_p = null;
              if (null != var2) {
                db.field_S = 255 & var2[0];
                break L64;
              } else {
                break L64;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L65: {
            var2_ref = decompiledCaughtException;
            stackOut_228_0 = (RuntimeException) var2_ref;
            stackOut_228_1 = new StringBuilder().append("ij.E(");
            stackIn_231_0 = stackOut_228_0;
            stackIn_231_1 = stackOut_228_1;
            stackIn_229_0 = stackOut_228_0;
            stackIn_229_1 = stackOut_228_1;
            if (param0 == null) {
              stackOut_231_0 = (RuntimeException) (Object) stackIn_231_0;
              stackOut_231_1 = (StringBuilder) (Object) stackIn_231_1;
              stackOut_231_2 = "null";
              stackIn_232_0 = stackOut_231_0;
              stackIn_232_1 = stackOut_231_1;
              stackIn_232_2 = stackOut_231_2;
              break L65;
            } else {
              stackOut_229_0 = (RuntimeException) (Object) stackIn_229_0;
              stackOut_229_1 = (StringBuilder) (Object) stackIn_229_1;
              stackOut_229_2 = "{...}";
              stackIn_232_0 = stackOut_229_0;
              stackIn_232_1 = stackOut_229_1;
              stackIn_232_2 = stackOut_229_2;
              break L65;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_232_0, stackIn_232_2 + 44 + -123 + 41);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (~oa.field_a == ~(0 - fe.field_i)) {
                break L1;
              } else {
                if (oa.field_a != 250 + -fe.field_i) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            oa.field_a = oa.field_a + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ij.B(" + -105 + 41);
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ij.A(" + 1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              bl.field_e[q.field_M] = param1;
              w.field_f[q.field_M] = q.field_M;
              sj.field_j[q.field_M] = param2;
              if (param2 >= va.field_b) {
                break L1;
              } else {
                mg.field_n = param2;
                break L1;
              }
            }
            L2: {
              if (w.field_d < param2) {
                uc.field_A = param2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              nh.field_S[q.field_M] = param0;
              gk.field_i[q.field_M] = param5;
              th.field_c[q.field_M] = param4;
              var6_int = param5 + (param0 + param4);
              if (0 != var6_int) {
                stackOut_10_0 = 1000 * param0 / var6_int;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_11_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_11_0;
              field_b[q.field_M] = var7;
              if (var7 >= mg.field_n) {
                break L4;
              } else {
                mg.field_n = var7;
                break L4;
              }
            }
            L5: {
              q.field_M = q.field_M + 1;
              if (~uc.field_A > ~var7) {
                uc.field_A = var7;
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var6, "ij.D(" + param0 + 44 + param1 + 44 + param2 + 44 + 0 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
    }
}
