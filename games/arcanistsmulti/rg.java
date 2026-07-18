/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static qb field_a;
    static String field_e;
    static String field_b;
    static String field_f;
    static String field_c;
    static int[] field_d;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_b = null;
              field_f = null;
              field_d = null;
              field_e = null;
              if (param0 == 35) {
                break L1;
              } else {
                rg.a(59);
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "rg.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (~vn.field_d != param1) {
              if (102 != vn.field_d) {
                L1: {
                  L2: {
                    if (null == nn.field_q) {
                      break L2;
                    } else {
                      if (!nn.field_q.b(param1 ^ -122, param0, param2)) {
                        break L2;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                }
                break L0;
              } else {
                nn.field_q.e(param1 ^ -89);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              uc.c(3);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "rg.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        boolean stackIn_35_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        boolean stackOut_34_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 == 13) {
                break L1;
              } else {
                boolean discarded$1 = rg.a(-21, -66, -84, -38);
                break L1;
              }
            }
            L2: {
              if (pm.field_b == null) {
                break L2;
              } else {
                if (13 == vn.field_d) {
                  pm.field_b = null;
                  stackOut_46_0 = 1;
                  stackIn_47_0 = stackOut_46_0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!ef.field_r) {
              L3: {
                if (oj.field_i) {
                  break L3;
                } else {
                  if (vn.field_d == 9) {
                    break L3;
                  } else {
                    if (vn.field_d == 10) {
                      break L3;
                    } else {
                      if (vn.field_d != 11) {
                        L4: {
                          if (80 != vn.field_d) {
                            break L4;
                          } else {
                            if (tn.g((byte) 111)) {
                              ef.field_r = true;
                              stackOut_42_0 = 1;
                              stackIn_43_0 = stackOut_42_0;
                              return stackIn_43_0 != 0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_34_0 = rg.a(param1, -14, param3);
              stackIn_35_0 = stackOut_34_0;
              return stackIn_35_0;
            } else {
              if (tn.g((byte) -40)) {
                L5: {
                  L6: {
                    var4_int = ko.a(param2 + -121, param0, param3) ? 1 : 0;
                    if (vn.field_d == 80) {
                      break L6;
                    } else {
                      if (vn.field_d != 84) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var4_int = 1;
                  ef.field_r = false;
                  break L5;
                }
                L7: {
                  if (vn.field_d != 13) {
                    break L7;
                  } else {
                    ue.b(10);
                    var4_int = 1;
                    ef.field_r = false;
                    break L7;
                  }
                }
                stackOut_22_0 = var4_int;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0 != 0;
              } else {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "rg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_47_0 != 0;
    }

    final static void a(eg param0, byte param1) {
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          gn.field_e = param0;
          var2 = tj.a("text_game_name", param1 ^ -75);
          if (null == var2) {
            break L0;
          } else {
            String discarded$3 = sc.a((byte) 92, var2);
            break L0;
          }
        }
        L1: {
          var2 = tj.a("text_benefits,0", -106);
          if (var2 == null) {
            break L1;
          } else {
            ij.field_Ub[0] = sc.a((byte) 95, var2);
            break L1;
          }
        }
        L2: {
          var2 = tj.a("text_benefits,1", -88);
          if (null == var2) {
            break L2;
          } else {
            ij.field_Ub[1] = sc.a((byte) 93, var2);
            break L2;
          }
        }
        L3: {
          var2 = tj.a("text_benefits,2", -74);
          if (var2 == null) {
            break L3;
          } else {
            ij.field_Ub[2] = sc.a((byte) 114, var2);
            break L3;
          }
        }
        L4: {
          var2 = tj.a("receiving_game", -108);
          if (var2 != null) {
            rb.field_l = sc.a((byte) 104, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = tj.a("exp_1_title", -98);
          if (null != var2) {
            be.field_i = sc.a((byte) 97, var2);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var2 = tj.a("exp1inst", -101);
          if (null == var2) {
            break L6;
          } else {
            wj.field_e = sc.a((byte) 90, var2);
            break L6;
          }
        }
        L7: {
          var2 = tj.a("exp_1_cap,0", -76);
          if (null != var2) {
            dh.field_Kb[0] = sc.a((byte) 124, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = tj.a("exp_1_cap,1", -82);
          if (var2 == null) {
            break L8;
          } else {
            dh.field_Kb[1] = sc.a((byte) 110, var2);
            break L8;
          }
        }
        L9: {
          var2 = tj.a("exp_1_cap,2", -128);
          if (null == var2) {
            break L9;
          } else {
            dh.field_Kb[2] = sc.a((byte) 103, var2);
            break L9;
          }
        }
        L10: {
          var2 = tj.a("exp_1_cap,3", -102);
          if (var2 == null) {
            break L10;
          } else {
            dh.field_Kb[3] = sc.a((byte) 109, var2);
            break L10;
          }
        }
        L11: {
          var2 = tj.a("exp_1_cap,4", -116);
          if (var2 == null) {
            break L11;
          } else {
            dh.field_Kb[4] = sc.a((byte) 127, var2);
            break L11;
          }
        }
        L12: {
          var2 = tj.a("exp_1_cap,5", -94);
          if (null != var2) {
            dh.field_Kb[5] = sc.a((byte) 89, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = tj.a("ai1", -70);
          if (var2 == null) {
            break L13;
          } else {
            ga.field_n = sc.a((byte) 94, var2);
            break L13;
          }
        }
        L14: {
          var2 = tj.a("ai2", -91);
          if (null != var2) {
            rf.field_l = sc.a((byte) 105, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = tj.a("ai3", -123);
          if (null != var2) {
            field_c = sc.a((byte) 117, var2);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          var2 = tj.a("text_x_hasbeendefeated", param1 ^ -75);
          if (var2 == null) {
            break L16;
          } else {
            jl.field_i = sc.a((byte) 88, var2);
            break L16;
          }
        }
        L17: {
          var2 = tj.a("youcanchangeyourcharacter", -75);
          if (null != var2) {
            io.field_x = sc.a((byte) 118, var2);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = tj.a("smittenmessage", -94);
          if (var2 == null) {
            break L18;
          } else {
            co.field_d = sc.a((byte) 102, var2);
            break L18;
          }
        }
        L19: {
          var2 = tj.a("spellstrings,0", -108);
          if (null == var2) {
            break L19;
          } else {
            vm.field_d[0] = sc.a((byte) 87, var2);
            break L19;
          }
        }
        L20: {
          var2 = tj.a("spellstrings,1", -122);
          if (var2 != null) {
            vm.field_d[1] = sc.a((byte) 99, var2);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          var2 = tj.a("spellstrings,2", -91);
          if (var2 == null) {
            break L21;
          } else {
            vm.field_d[2] = sc.a((byte) 93, var2);
            break L21;
          }
        }
        L22: {
          var2 = tj.a("spellstrings,3", -73);
          if (null == var2) {
            break L22;
          } else {
            vm.field_d[3] = sc.a((byte) 98, var2);
            break L22;
          }
        }
        L23: {
          var2 = tj.a("spellstrings,4", -71);
          if (var2 == null) {
            break L23;
          } else {
            vm.field_d[4] = sc.a((byte) 123, var2);
            break L23;
          }
        }
        L24: {
          var2 = tj.a("spellstrings,5", -119);
          if (var2 != null) {
            vm.field_d[5] = sc.a((byte) 125, var2);
            break L24;
          } else {
            break L24;
          }
        }
        L25: {
          var2 = tj.a("spellstrings,6", param1 + -142);
          if (var2 != null) {
            vm.field_d[6] = sc.a((byte) 110, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = tj.a("spellstrings,7", param1 + -122);
          if (var2 != null) {
            vm.field_d[7] = sc.a((byte) 115, var2);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          var2 = tj.a("spellstrings,8", -110);
          if (var2 != null) {
            vm.field_d[8] = sc.a((byte) 108, var2);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          var2 = tj.a("spellstrings,9", -108);
          if (null == var2) {
            break L28;
          } else {
            vm.field_d[9] = sc.a((byte) 111, var2);
            break L28;
          }
        }
        L29: {
          var2 = tj.a("spellstrings,10", -87);
          if (var2 == null) {
            break L29;
          } else {
            vm.field_d[10] = sc.a((byte) 127, var2);
            break L29;
          }
        }
        L30: {
          var2 = tj.a("spellstrings,11", -122);
          if (null != var2) {
            vm.field_d[11] = sc.a((byte) 121, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = tj.a("spellstrings,12", -95);
          if (var2 == null) {
            break L31;
          } else {
            vm.field_d[12] = sc.a((byte) 105, var2);
            break L31;
          }
        }
        L32: {
          var2 = tj.a("spellstrings,13", -119);
          if (null != var2) {
            vm.field_d[13] = sc.a((byte) 96, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = tj.a("spellstrings,14", param1 + -106);
          if (null == var2) {
            break L33;
          } else {
            vm.field_d[14] = sc.a((byte) 88, var2);
            break L33;
          }
        }
        L34: {
          var2 = tj.a("spellstrings,15", -98);
          if (null != var2) {
            vm.field_d[15] = sc.a((byte) 87, var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = tj.a("spellstrings,16", -90);
          if (null != var2) {
            vm.field_d[16] = sc.a((byte) 105, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = tj.a("spellstrings,17", -113);
          if (var2 == null) {
            break L36;
          } else {
            vm.field_d[17] = sc.a((byte) 106, var2);
            break L36;
          }
        }
        L37: {
          var2 = tj.a("spellstrings,18", -113);
          if (var2 == null) {
            break L37;
          } else {
            vm.field_d[18] = sc.a((byte) 115, var2);
            break L37;
          }
        }
        L38: {
          var2 = tj.a("spellstrings,19", -113);
          if (var2 != null) {
            vm.field_d[19] = sc.a((byte) 106, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = tj.a("spellstrings,20", -74);
          if (var2 != null) {
            vm.field_d[20] = sc.a((byte) 94, var2);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = tj.a("spellstrings,21", -97);
          if (var2 == null) {
            break L40;
          } else {
            vm.field_d[21] = sc.a((byte) 98, var2);
            break L40;
          }
        }
        L41: {
          var2 = tj.a("spellstrings,22", -87);
          if (null == var2) {
            break L41;
          } else {
            vm.field_d[22] = sc.a((byte) 114, var2);
            break L41;
          }
        }
        L42: {
          var2 = tj.a("spellstrings,23", -97);
          if (null == var2) {
            break L42;
          } else {
            vm.field_d[23] = sc.a((byte) 101, var2);
            break L42;
          }
        }
        L43: {
          var2 = tj.a("spellstrings,24", -96);
          if (var2 != null) {
            vm.field_d[24] = sc.a((byte) 93, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = tj.a("spellstrings,25", -75);
          if (null == var2) {
            break L44;
          } else {
            vm.field_d[25] = sc.a((byte) 100, var2);
            break L44;
          }
        }
        L45: {
          var2 = tj.a("spellstrings,26", -93);
          if (null == var2) {
            break L45;
          } else {
            vm.field_d[26] = sc.a((byte) 104, var2);
            break L45;
          }
        }
        L46: {
          var2 = tj.a("spellstrings,27", -83);
          if (null != var2) {
            vm.field_d[27] = sc.a((byte) 108, var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = tj.a("spellstrings,28", -91);
          if (var2 != null) {
            vm.field_d[28] = sc.a((byte) 86, var2);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          var2 = tj.a("spellstrings,29", -80);
          if (var2 == null) {
            break L48;
          } else {
            vm.field_d[29] = sc.a((byte) 120, var2);
            break L48;
          }
        }
        L49: {
          var2 = tj.a("spellstrings,30", -124);
          if (var2 != null) {
            vm.field_d[30] = sc.a((byte) 89, var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = tj.a("spellstrings,31", -126);
          if (var2 != null) {
            vm.field_d[31] = sc.a((byte) 95, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = tj.a("spellstrings,32", -84);
          if (null != var2) {
            vm.field_d[32] = sc.a((byte) 106, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = tj.a("spellstrings,33", -77);
          if (var2 == null) {
            break L52;
          } else {
            vm.field_d[33] = sc.a((byte) 101, var2);
            break L52;
          }
        }
        L53: {
          var2 = tj.a("spellstrings,34", -124);
          if (null != var2) {
            vm.field_d[34] = sc.a((byte) 111, var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = tj.a("spellstrings,35", -100);
          if (null == var2) {
            break L54;
          } else {
            vm.field_d[35] = sc.a((byte) 96, var2);
            break L54;
          }
        }
        L55: {
          var2 = tj.a("spellstrings,36", param1 + -120);
          if (var2 != null) {
            vm.field_d[36] = sc.a((byte) 115, var2);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = tj.a("spellstrings,37", param1 + -116);
          if (null == var2) {
            break L56;
          } else {
            vm.field_d[37] = sc.a((byte) 101, var2);
            break L56;
          }
        }
        L57: {
          var2 = tj.a("spellstrings,38", -80);
          if (null == var2) {
            break L57;
          } else {
            vm.field_d[38] = sc.a((byte) 95, var2);
            break L57;
          }
        }
        L58: {
          var2 = tj.a("spellstrings,39", -87);
          if (var2 == null) {
            break L58;
          } else {
            vm.field_d[39] = sc.a((byte) 115, var2);
            break L58;
          }
        }
        L59: {
          var2 = tj.a("spellstrings,40", -128);
          if (null == var2) {
            break L59;
          } else {
            vm.field_d[40] = sc.a((byte) 124, var2);
            break L59;
          }
        }
        L60: {
          var2 = tj.a("spellstrings,41", -122);
          if (var2 != null) {
            vm.field_d[41] = sc.a((byte) 101, var2);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          var2 = tj.a("spellstrings,42", -81);
          if (var2 != null) {
            vm.field_d[42] = sc.a((byte) 97, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = tj.a("spellstrings,43", -80);
          if (null != var2) {
            vm.field_d[43] = sc.a((byte) 86, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = tj.a("spellstrings,44", -104);
          if (null != var2) {
            vm.field_d[44] = sc.a((byte) 95, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = tj.a("spellstrings,45", param1 + -147);
          if (null == var2) {
            break L64;
          } else {
            vm.field_d[45] = sc.a((byte) 101, var2);
            break L64;
          }
        }
        L65: {
          var2 = tj.a("spellstrings,46", -85);
          if (var2 != null) {
            vm.field_d[46] = sc.a((byte) 123, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = tj.a("spellstrings,47", param1 ^ -108);
          if (var2 != null) {
            vm.field_d[47] = sc.a((byte) 114, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = tj.a("spellstrings,48", -123);
          if (var2 != null) {
            vm.field_d[48] = sc.a((byte) 108, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = tj.a("spellstrings,49", -86);
          if (null == var2) {
            break L68;
          } else {
            vm.field_d[49] = sc.a((byte) 107, var2);
            break L68;
          }
        }
        L69: {
          var2 = tj.a("spellstrings,50", param1 ^ -104);
          if (var2 == null) {
            break L69;
          } else {
            vm.field_d[50] = sc.a((byte) 93, var2);
            break L69;
          }
        }
        L70: {
          var2 = tj.a("spellstrings,51", -107);
          if (null == var2) {
            break L70;
          } else {
            vm.field_d[51] = sc.a((byte) 116, var2);
            break L70;
          }
        }
        L71: {
          var2 = tj.a("spellstrings,52", -128);
          if (var2 != null) {
            vm.field_d[52] = sc.a((byte) 110, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = tj.a("spellstrings,53", param1 ^ -128);
          if (null == var2) {
            break L72;
          } else {
            vm.field_d[53] = sc.a((byte) 95, var2);
            break L72;
          }
        }
        L73: {
          var2 = tj.a("spellstrings,54", param1 + -103);
          if (var2 == null) {
            break L73;
          } else {
            vm.field_d[54] = sc.a((byte) 100, var2);
            break L73;
          }
        }
        L74: {
          var2 = tj.a("spellstrings,55", -77);
          if (null != var2) {
            vm.field_d[55] = sc.a((byte) 123, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = tj.a("spellstrings,56", -104);
          if (var2 != null) {
            vm.field_d[56] = sc.a((byte) 120, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = tj.a("spellstrings,57", param1 ^ -126);
          if (null == var2) {
            break L76;
          } else {
            vm.field_d[57] = sc.a((byte) 94, var2);
            break L76;
          }
        }
        L77: {
          var2 = tj.a("spellstrings,58", param1 + -117);
          if (null != var2) {
            vm.field_d[58] = sc.a((byte) 110, var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = tj.a("spellstrings,59", param1 ^ -128);
          if (var2 != null) {
            vm.field_d[59] = sc.a((byte) 89, var2);
            break L78;
          } else {
            break L78;
          }
        }
        L79: {
          var2 = tj.a("spellstrings,60", -87);
          if (var2 != null) {
            vm.field_d[60] = sc.a((byte) 119, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = tj.a("spellstrings,61", -112);
          if (var2 != null) {
            vm.field_d[61] = sc.a((byte) 108, var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = tj.a("spellstrings,62", -72);
          if (var2 != null) {
            vm.field_d[62] = sc.a((byte) 100, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = tj.a("spellstrings,63", -85);
          if (var2 == null) {
            break L82;
          } else {
            vm.field_d[63] = sc.a((byte) 109, var2);
            break L82;
          }
        }
        L83: {
          var2 = tj.a("spellstrings,64", -75);
          if (var2 != null) {
            vm.field_d[64] = sc.a((byte) 123, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          var2 = tj.a("spellstrings,65", -95);
          if (var2 == null) {
            break L84;
          } else {
            vm.field_d[65] = sc.a((byte) 87, var2);
            break L84;
          }
        }
        L85: {
          var2 = tj.a("spellstrings,66", param1 ^ -71);
          if (var2 == null) {
            break L85;
          } else {
            vm.field_d[66] = sc.a((byte) 122, var2);
            break L85;
          }
        }
        L86: {
          var2 = tj.a("spellstrings,67", -80);
          if (null == var2) {
            break L86;
          } else {
            vm.field_d[67] = sc.a((byte) 92, var2);
            break L86;
          }
        }
        L87: {
          var2 = tj.a("spellstrings,68", -112);
          if (null == var2) {
            break L87;
          } else {
            vm.field_d[68] = sc.a((byte) 107, var2);
            break L87;
          }
        }
        L88: {
          var2 = tj.a("spellstrings,69", -102);
          if (null == var2) {
            break L88;
          } else {
            vm.field_d[69] = sc.a((byte) 110, var2);
            break L88;
          }
        }
        L89: {
          var2 = tj.a("spellstrings,70", -108);
          if (null != var2) {
            vm.field_d[70] = sc.a((byte) 87, var2);
            break L89;
          } else {
            break L89;
          }
        }
        L90: {
          var2 = tj.a("spellstrings,71", -90);
          if (var2 == null) {
            break L90;
          } else {
            vm.field_d[71] = sc.a((byte) 127, var2);
            break L90;
          }
        }
        L91: {
          var2 = tj.a("spellstrings,72", -123);
          if (null != var2) {
            vm.field_d[72] = sc.a((byte) 110, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = tj.a("spellstrings,73", -93);
          if (null != var2) {
            vm.field_d[73] = sc.a((byte) 113, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = tj.a("spellstrings,74", -100);
          if (null != var2) {
            vm.field_d[74] = sc.a((byte) 126, var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = tj.a("spellstrings,75", -121);
          if (var2 != null) {
            vm.field_d[75] = sc.a((byte) 123, var2);
            break L94;
          } else {
            break L94;
          }
        }
        L95: {
          var2 = tj.a("spellstrings,76", -123);
          if (null != var2) {
            vm.field_d[76] = sc.a((byte) 90, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = tj.a("spellstrings,77", param1 + -116);
          if (null == var2) {
            break L96;
          } else {
            vm.field_d[77] = sc.a((byte) 107, var2);
            break L96;
          }
        }
        L97: {
          var2 = tj.a("spellstrings,78", -124);
          if (var2 != null) {
            vm.field_d[78] = sc.a((byte) 103, var2);
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          var2 = tj.a("spellstrings,79", param1 ^ -124);
          if (var2 == null) {
            break L98;
          } else {
            vm.field_d[79] = sc.a((byte) 97, var2);
            break L98;
          }
        }
        L99: {
          var2 = tj.a("spellstrings,80", -113);
          if (null == var2) {
            break L99;
          } else {
            vm.field_d[80] = sc.a((byte) 114, var2);
            break L99;
          }
        }
        L100: {
          var2 = tj.a("spellstrings,81", -127);
          if (var2 != null) {
            vm.field_d[81] = sc.a((byte) 108, var2);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          var2 = tj.a("spellstrings,82", -81);
          if (null != var2) {
            vm.field_d[82] = sc.a((byte) 102, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          var2 = tj.a("spellstrings,83", -89);
          if (var2 != null) {
            vm.field_d[83] = sc.a((byte) 120, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = tj.a("spellstrings,84", -114);
          if (var2 != null) {
            vm.field_d[84] = sc.a((byte) 91, var2);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = tj.a("spellstrings,85", -92);
          if (var2 == null) {
            break L104;
          } else {
            vm.field_d[85] = sc.a((byte) 111, var2);
            break L104;
          }
        }
        L105: {
          var2 = tj.a("spellstrings,86", -101);
          if (var2 != null) {
            vm.field_d[86] = sc.a((byte) 113, var2);
            break L105;
          } else {
            break L105;
          }
        }
        L106: {
          var2 = tj.a("spellstrings,87", -123);
          if (var2 != null) {
            vm.field_d[87] = sc.a((byte) 124, var2);
            break L106;
          } else {
            break L106;
          }
        }
        L107: {
          var2 = tj.a("spellstrings,88", param1 ^ -77);
          if (null != var2) {
            vm.field_d[88] = sc.a((byte) 103, var2);
            break L107;
          } else {
            break L107;
          }
        }
        L108: {
          var2 = tj.a("spellstrings,89", -124);
          if (null == var2) {
            break L108;
          } else {
            vm.field_d[89] = sc.a((byte) 86, var2);
            break L108;
          }
        }
        L109: {
          var2 = tj.a("spellstrings,90", -83);
          if (null == var2) {
            break L109;
          } else {
            vm.field_d[90] = sc.a((byte) 103, var2);
            break L109;
          }
        }
        L110: {
          var2 = tj.a("spellstrings,91", param1 ^ -79);
          if (null != var2) {
            vm.field_d[91] = sc.a((byte) 92, var2);
            break L110;
          } else {
            break L110;
          }
        }
        L111: {
          var2 = tj.a("spellstrings,92", -99);
          if (var2 != null) {
            vm.field_d[92] = sc.a((byte) 90, var2);
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = tj.a("spellstrings,93", -107);
          if (var2 == null) {
            break L112;
          } else {
            vm.field_d[93] = sc.a((byte) 97, var2);
            break L112;
          }
        }
        L113: {
          var2 = tj.a("spellstrings,94", -76);
          if (var2 == null) {
            break L113;
          } else {
            vm.field_d[94] = sc.a((byte) 126, var2);
            break L113;
          }
        }
        L114: {
          var2 = tj.a("spellstrings,95", -86);
          if (var2 != null) {
            vm.field_d[95] = sc.a((byte) 114, var2);
            break L114;
          } else {
            break L114;
          }
        }
        L115: {
          var2 = tj.a("spellstrings,96", param1 + -101);
          if (null == var2) {
            break L115;
          } else {
            vm.field_d[96] = sc.a((byte) 99, var2);
            break L115;
          }
        }
        L116: {
          var2 = tj.a("spellstrings,97", -88);
          if (null == var2) {
            break L116;
          } else {
            vm.field_d[97] = sc.a((byte) 123, var2);
            break L116;
          }
        }
        L117: {
          var2 = tj.a("spellstrings,98", -117);
          if (var2 != null) {
            vm.field_d[98] = sc.a((byte) 98, var2);
            break L117;
          } else {
            break L117;
          }
        }
        L118: {
          var2 = tj.a("spellstrings,99", param1 + -122);
          if (null == var2) {
            break L118;
          } else {
            vm.field_d[99] = sc.a((byte) 116, var2);
            break L118;
          }
        }
        L119: {
          var2 = tj.a("spellstrings,100", -105);
          if (var2 == null) {
            break L119;
          } else {
            vm.field_d[100] = sc.a((byte) 103, var2);
            break L119;
          }
        }
        L120: {
          var2 = tj.a("spellstrings,101", -78);
          if (null != var2) {
            vm.field_d[101] = sc.a((byte) 107, var2);
            break L120;
          } else {
            break L120;
          }
        }
        L121: {
          var2 = tj.a("spellstrings,102", -93);
          if (var2 == null) {
            break L121;
          } else {
            vm.field_d[102] = sc.a((byte) 120, var2);
            break L121;
          }
        }
        L122: {
          var2 = tj.a("spellstrings,103", -127);
          if (var2 == null) {
            break L122;
          } else {
            vm.field_d[103] = sc.a((byte) 108, var2);
            break L122;
          }
        }
        L123: {
          var2 = tj.a("spellstrings,104", -111);
          if (null == var2) {
            break L123;
          } else {
            vm.field_d[104] = sc.a((byte) 122, var2);
            break L123;
          }
        }
        L124: {
          var2 = tj.a("spellstrings,105", -77);
          if (var2 == null) {
            break L124;
          } else {
            vm.field_d[105] = sc.a((byte) 124, var2);
            break L124;
          }
        }
        L125: {
          var2 = tj.a("spellstrings,106", -127);
          if (null != var2) {
            vm.field_d[106] = sc.a((byte) 121, var2);
            break L125;
          } else {
            break L125;
          }
        }
        L126: {
          var2 = tj.a("spellstrings,107", -79);
          if (null != var2) {
            vm.field_d[107] = sc.a((byte) 87, var2);
            break L126;
          } else {
            break L126;
          }
        }
        L127: {
          var2 = tj.a("spellstrings,108", param1 ^ -110);
          if (null == var2) {
            break L127;
          } else {
            vm.field_d[108] = sc.a((byte) 106, var2);
            break L127;
          }
        }
        L128: {
          var2 = tj.a("spellstrings,109", -84);
          if (null != var2) {
            vm.field_d[109] = sc.a((byte) 97, var2);
            break L128;
          } else {
            break L128;
          }
        }
        L129: {
          var2 = tj.a("spellstrings,110", -75);
          if (null != var2) {
            vm.field_d[110] = sc.a((byte) 117, var2);
            break L129;
          } else {
            break L129;
          }
        }
        L130: {
          var2 = tj.a("spellstrings,111", -123);
          if (var2 == null) {
            break L130;
          } else {
            vm.field_d[111] = sc.a((byte) 87, var2);
            break L130;
          }
        }
        L131: {
          var2 = tj.a("spellstrings,112", -108);
          if (null == var2) {
            break L131;
          } else {
            vm.field_d[112] = sc.a((byte) 126, var2);
            break L131;
          }
        }
        L132: {
          var2 = tj.a("spellstrings,113", -104);
          if (var2 == null) {
            break L132;
          } else {
            vm.field_d[113] = sc.a((byte) 123, var2);
            break L132;
          }
        }
        L133: {
          var2 = tj.a("spellstrings,114", -128);
          if (null != var2) {
            vm.field_d[114] = sc.a((byte) 116, var2);
            break L133;
          } else {
            break L133;
          }
        }
        L134: {
          var2 = tj.a("spellstrings,115", -122);
          if (null == var2) {
            break L134;
          } else {
            vm.field_d[115] = sc.a((byte) 122, var2);
            break L134;
          }
        }
        L135: {
          var2 = tj.a("spellstrings,116", -126);
          if (null != var2) {
            vm.field_d[116] = sc.a((byte) 87, var2);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          var2 = tj.a("spellstrings,117", param1 ^ -65);
          if (null != var2) {
            vm.field_d[117] = sc.a((byte) 127, var2);
            break L136;
          } else {
            break L136;
          }
        }
        L137: {
          var2 = tj.a("spellstrings,118", -72);
          if (null != var2) {
            vm.field_d[118] = sc.a((byte) 95, var2);
            break L137;
          } else {
            break L137;
          }
        }
        L138: {
          var2 = tj.a("spellstrings,119", -82);
          if (var2 == null) {
            break L138;
          } else {
            vm.field_d[119] = sc.a((byte) 98, var2);
            break L138;
          }
        }
        L139: {
          var2 = tj.a("spellstrings,120", -101);
          if (null != var2) {
            vm.field_d[120] = sc.a((byte) 105, var2);
            break L139;
          } else {
            break L139;
          }
        }
        L140: {
          var2 = tj.a("spellstrings,121", -107);
          if (null != var2) {
            vm.field_d[121] = sc.a((byte) 103, var2);
            break L140;
          } else {
            break L140;
          }
        }
        L141: {
          var2 = tj.a("spellstrings,122", param1 + -94);
          if (null != var2) {
            vm.field_d[122] = sc.a((byte) 122, var2);
            break L141;
          } else {
            break L141;
          }
        }
        L142: {
          var2 = tj.a("spellstrings,123", -122);
          if (var2 != null) {
            vm.field_d[123] = sc.a((byte) 115, var2);
            break L142;
          } else {
            break L142;
          }
        }
        L143: {
          var2 = tj.a("spellstrings,124", param1 + -129);
          if (var2 != null) {
            vm.field_d[124] = sc.a((byte) 99, var2);
            break L143;
          } else {
            break L143;
          }
        }
        L144: {
          var2 = tj.a("spellstrings,125", -80);
          if (var2 == null) {
            break L144;
          } else {
            vm.field_d[125] = sc.a((byte) 127, var2);
            break L144;
          }
        }
        L145: {
          var2 = tj.a("spellstrings,126", param1 ^ -105);
          if (null != var2) {
            vm.field_d[126] = sc.a((byte) 118, var2);
            break L145;
          } else {
            break L145;
          }
        }
        L146: {
          var2 = tj.a("spellstrings,127", -114);
          if (null == var2) {
            break L146;
          } else {
            vm.field_d[127] = sc.a((byte) 102, var2);
            break L146;
          }
        }
        L147: {
          var2 = tj.a("spellstrings,128", param1 + -133);
          if (null != var2) {
            vm.field_d[128] = sc.a((byte) 107, var2);
            break L147;
          } else {
            break L147;
          }
        }
        L148: {
          var2 = tj.a("spellstrings,129", -127);
          if (var2 == null) {
            break L148;
          } else {
            vm.field_d[129] = sc.a((byte) 127, var2);
            break L148;
          }
        }
        L149: {
          var2 = tj.a("spellstrings,130", -86);
          if (var2 == null) {
            break L149;
          } else {
            vm.field_d[130] = sc.a((byte) 100, var2);
            break L149;
          }
        }
        L150: {
          var2 = tj.a("spellstrings,131", -127);
          if (null == var2) {
            break L150;
          } else {
            vm.field_d[131] = sc.a((byte) 123, var2);
            break L150;
          }
        }
        L151: {
          var2 = tj.a("spellstrings,132", param1 + -108);
          if (var2 == null) {
            break L151;
          } else {
            vm.field_d[132] = sc.a((byte) 86, var2);
            break L151;
          }
        }
        L152: {
          var2 = tj.a("spellstrings,133", param1 + -106);
          if (null == var2) {
            break L152;
          } else {
            vm.field_d[133] = sc.a((byte) 111, var2);
            break L152;
          }
        }
        L153: {
          var2 = tj.a("spellstrings,134", -74);
          if (var2 != null) {
            vm.field_d[134] = sc.a((byte) 91, var2);
            break L153;
          } else {
            break L153;
          }
        }
        L154: {
          var2 = tj.a("spellstrings,135", -95);
          if (null == var2) {
            break L154;
          } else {
            vm.field_d[135] = sc.a((byte) 87, var2);
            break L154;
          }
        }
        L155: {
          var2 = tj.a("spellstrings,136", param1 ^ -74);
          if (var2 != null) {
            vm.field_d[136] = sc.a((byte) 113, var2);
            break L155;
          } else {
            break L155;
          }
        }
        L156: {
          var2 = tj.a("spellstrings,137", -74);
          if (null != var2) {
            vm.field_d[137] = sc.a((byte) 93, var2);
            break L156;
          } else {
            break L156;
          }
        }
        L157: {
          var2 = tj.a("spellstrings,138", -108);
          if (var2 != null) {
            vm.field_d[138] = sc.a((byte) 120, var2);
            break L157;
          } else {
            break L157;
          }
        }
        L158: {
          var2 = tj.a("spellstrings,139", -97);
          if (var2 != null) {
            vm.field_d[139] = sc.a((byte) 90, var2);
            break L158;
          } else {
            break L158;
          }
        }
        L159: {
          var2 = tj.a("spellstrings,140", -96);
          if (var2 == null) {
            break L159;
          } else {
            vm.field_d[140] = sc.a((byte) 124, var2);
            break L159;
          }
        }
        L160: {
          var2 = tj.a("spellstrings,141", -110);
          if (null == var2) {
            break L160;
          } else {
            vm.field_d[141] = sc.a((byte) 122, var2);
            break L160;
          }
        }
        L161: {
          var2 = tj.a("spellstrings,142", -94);
          if (var2 == null) {
            break L161;
          } else {
            vm.field_d[142] = sc.a((byte) 124, var2);
            break L161;
          }
        }
        L162: {
          var2 = tj.a("spellstrings,143", param1 ^ -75);
          if (null != var2) {
            vm.field_d[143] = sc.a((byte) 101, var2);
            break L162;
          } else {
            break L162;
          }
        }
        L163: {
          var2 = tj.a("spellstrings,144", param1 + -122);
          if (null != var2) {
            vm.field_d[144] = sc.a((byte) 118, var2);
            break L163;
          } else {
            break L163;
          }
        }
        L164: {
          var2 = tj.a("spellstrings,145", param1 + -93);
          if (null == var2) {
            break L164;
          } else {
            vm.field_d[145] = sc.a((byte) 127, var2);
            break L164;
          }
        }
        L165: {
          var2 = tj.a("spellstrings,146", -119);
          if (var2 == null) {
            break L165;
          } else {
            vm.field_d[146] = sc.a((byte) 126, var2);
            break L165;
          }
        }
        L166: {
          var2 = tj.a("spellstrings,147", param1 + -107);
          if (null != var2) {
            vm.field_d[147] = sc.a((byte) 102, var2);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          var2 = tj.a("spellstrings,148", -83);
          if (null == var2) {
            break L167;
          } else {
            vm.field_d[148] = sc.a((byte) 99, var2);
            break L167;
          }
        }
        L168: {
          var2 = tj.a("spellstrings,149", param1 + -96);
          if (var2 == null) {
            break L168;
          } else {
            vm.field_d[149] = sc.a((byte) 115, var2);
            break L168;
          }
        }
        L169: {
          var2 = tj.a("spellstrings,150", -114);
          if (null != var2) {
            vm.field_d[150] = sc.a((byte) 124, var2);
            break L169;
          } else {
            break L169;
          }
        }
        L170: {
          var2 = tj.a("spellstrings,151", -119);
          if (var2 == null) {
            break L170;
          } else {
            vm.field_d[151] = sc.a((byte) 104, var2);
            break L170;
          }
        }
        L171: {
          var2 = tj.a("spellstrings,152", -118);
          if (null != var2) {
            vm.field_d[152] = sc.a((byte) 97, var2);
            break L171;
          } else {
            break L171;
          }
        }
        L172: {
          var2 = tj.a("spellstrings,153", -71);
          if (null != var2) {
            vm.field_d[153] = sc.a((byte) 89, var2);
            break L172;
          } else {
            break L172;
          }
        }
        L173: {
          var2 = tj.a("spellstrings,154", -124);
          if (null == var2) {
            break L173;
          } else {
            vm.field_d[154] = sc.a((byte) 117, var2);
            break L173;
          }
        }
        L174: {
          var2 = tj.a("spellstrings,155", -85);
          if (null != var2) {
            vm.field_d[155] = sc.a((byte) 124, var2);
            break L174;
          } else {
            break L174;
          }
        }
        L175: {
          var2 = tj.a("spellstrings,156", -117);
          if (null == var2) {
            break L175;
          } else {
            vm.field_d[156] = sc.a((byte) 114, var2);
            break L175;
          }
        }
        L176: {
          var2 = tj.a("spellstrings,157", -125);
          if (null != var2) {
            vm.field_d[157] = sc.a((byte) 93, var2);
            break L176;
          } else {
            break L176;
          }
        }
        L177: {
          var2 = tj.a("reqachievement", param1 + -128);
          if (null == var2) {
            break L177;
          } else {
            kl.field_y = sc.a((byte) 119, var2);
            break L177;
          }
        }
        L178: {
          var2 = tj.a("needthetimebook", -125);
          if (null != var2) {
            vg.field_n = sc.a((byte) 120, var2);
            break L178;
          } else {
            break L178;
          }
        }
        L179: {
          var2 = tj.a("needhatsfortime", param1 ^ -114);
          if (null == var2) {
            break L179;
          } else {
            vn.field_j = sc.a((byte) 126, var2);
            break L179;
          }
        }
        L180: {
          var2 = tj.a("spellnames,0", param1 + -136);
          if (var2 != null) {
            tc.field_w[0] = sc.a((byte) 113, var2);
            break L180;
          } else {
            break L180;
          }
        }
        L181: {
          var2 = tj.a("spellnames,1", -117);
          if (var2 == null) {
            break L181;
          } else {
            tc.field_w[1] = sc.a((byte) 109, var2);
            break L181;
          }
        }
        L182: {
          var2 = tj.a("spellnames,2", -109);
          if (var2 == null) {
            break L182;
          } else {
            tc.field_w[2] = sc.a((byte) 88, var2);
            break L182;
          }
        }
        L183: {
          var2 = tj.a("spellnames,3", -78);
          if (var2 == null) {
            break L183;
          } else {
            tc.field_w[3] = sc.a((byte) 125, var2);
            break L183;
          }
        }
        L184: {
          var2 = tj.a("spellnames,4", param1 ^ -115);
          if (var2 == null) {
            break L184;
          } else {
            tc.field_w[4] = sc.a((byte) 86, var2);
            break L184;
          }
        }
        L185: {
          var2 = tj.a("spellnames,5", -70);
          if (var2 == null) {
            break L185;
          } else {
            tc.field_w[5] = sc.a((byte) 126, var2);
            break L185;
          }
        }
        L186: {
          var2 = tj.a("spellnames,6", -124);
          if (var2 == null) {
            break L186;
          } else {
            tc.field_w[6] = sc.a((byte) 92, var2);
            break L186;
          }
        }
        L187: {
          var2 = tj.a("spellnames,7", -77);
          if (null == var2) {
            break L187;
          } else {
            tc.field_w[7] = sc.a((byte) 120, var2);
            break L187;
          }
        }
        L188: {
          var2 = tj.a("spellnames,8", -110);
          if (var2 == null) {
            break L188;
          } else {
            tc.field_w[8] = sc.a((byte) 107, var2);
            break L188;
          }
        }
        L189: {
          var2 = tj.a("spellnames,9", -92);
          if (var2 == null) {
            break L189;
          } else {
            tc.field_w[9] = sc.a((byte) 96, var2);
            break L189;
          }
        }
        L190: {
          var2 = tj.a("spellnames,10", -87);
          if (var2 == null) {
            break L190;
          } else {
            tc.field_w[10] = sc.a((byte) 115, var2);
            break L190;
          }
        }
        L191: {
          var2 = tj.a("spellnames,11", -109);
          if (null == var2) {
            break L191;
          } else {
            tc.field_w[11] = sc.a((byte) 103, var2);
            break L191;
          }
        }
        L192: {
          var2 = tj.a("spellnames,12", param1 ^ -66);
          if (var2 != null) {
            tc.field_w[12] = sc.a((byte) 117, var2);
            break L192;
          } else {
            break L192;
          }
        }
        L193: {
          var2 = tj.a("spellnames,13", -123);
          if (var2 != null) {
            tc.field_w[13] = sc.a((byte) 107, var2);
            break L193;
          } else {
            break L193;
          }
        }
        L194: {
          var2 = tj.a("spellnames,14", -108);
          if (var2 != null) {
            tc.field_w[14] = sc.a((byte) 111, var2);
            break L194;
          } else {
            break L194;
          }
        }
        L195: {
          var2 = tj.a("spellnames,15", -84);
          if (var2 != null) {
            tc.field_w[15] = sc.a((byte) 111, var2);
            break L195;
          } else {
            break L195;
          }
        }
        L196: {
          var2 = tj.a("spellnames,16", -82);
          if (var2 == null) {
            break L196;
          } else {
            tc.field_w[16] = sc.a((byte) 88, var2);
            break L196;
          }
        }
        L197: {
          var2 = tj.a("spellnames,17", -71);
          if (var2 == null) {
            break L197;
          } else {
            tc.field_w[17] = sc.a((byte) 111, var2);
            break L197;
          }
        }
        L198: {
          var2 = tj.a("spellnames,18", -120);
          if (var2 == null) {
            break L198;
          } else {
            tc.field_w[18] = sc.a((byte) 101, var2);
            break L198;
          }
        }
        L199: {
          var2 = tj.a("spellnames,19", -79);
          if (null == var2) {
            break L199;
          } else {
            tc.field_w[19] = sc.a((byte) 120, var2);
            break L199;
          }
        }
        L200: {
          var2 = tj.a("spellnames,20", -115);
          if (var2 != null) {
            tc.field_w[20] = sc.a((byte) 110, var2);
            break L200;
          } else {
            break L200;
          }
        }
        L201: {
          var2 = tj.a("spellnames,21", param1 + -101);
          if (null == var2) {
            break L201;
          } else {
            tc.field_w[21] = sc.a((byte) 120, var2);
            break L201;
          }
        }
        L202: {
          var2 = tj.a("spellnames,22", param1 + -129);
          if (null != var2) {
            tc.field_w[22] = sc.a((byte) 87, var2);
            break L202;
          } else {
            break L202;
          }
        }
        L203: {
          var2 = tj.a("spellnames,23", param1 ^ -78);
          if (null == var2) {
            break L203;
          } else {
            tc.field_w[23] = sc.a((byte) 103, var2);
            break L203;
          }
        }
        L204: {
          var2 = tj.a("spellnames,24", -100);
          if (null == var2) {
            break L204;
          } else {
            tc.field_w[24] = sc.a((byte) 94, var2);
            break L204;
          }
        }
        L205: {
          var2 = tj.a("spellnames,25", param1 ^ -95);
          if (null == var2) {
            break L205;
          } else {
            tc.field_w[25] = sc.a((byte) 88, var2);
            break L205;
          }
        }
        L206: {
          var2 = tj.a("spellnames,26", -76);
          if (null == var2) {
            break L206;
          } else {
            tc.field_w[26] = sc.a((byte) 107, var2);
            break L206;
          }
        }
        L207: {
          var2 = tj.a("spellnames,27", -112);
          if (var2 == null) {
            break L207;
          } else {
            tc.field_w[27] = sc.a((byte) 100, var2);
            break L207;
          }
        }
        L208: {
          var2 = tj.a("spellnames,28", -119);
          if (var2 == null) {
            break L208;
          } else {
            tc.field_w[28] = sc.a((byte) 106, var2);
            break L208;
          }
        }
        L209: {
          var2 = tj.a("spellnames,29", -110);
          if (var2 == null) {
            break L209;
          } else {
            tc.field_w[29] = sc.a((byte) 118, var2);
            break L209;
          }
        }
        L210: {
          var2 = tj.a("spellnames,30", -102);
          if (null == var2) {
            break L210;
          } else {
            tc.field_w[30] = sc.a((byte) 92, var2);
            break L210;
          }
        }
        L211: {
          var2 = tj.a("spellnames,31", param1 + -97);
          if (var2 != null) {
            tc.field_w[31] = sc.a((byte) 98, var2);
            break L211;
          } else {
            break L211;
          }
        }
        L212: {
          var2 = tj.a("spellnames,32", -89);
          if (null != var2) {
            tc.field_w[32] = sc.a((byte) 123, var2);
            break L212;
          } else {
            break L212;
          }
        }
        L213: {
          var2 = tj.a("spellnames,33", -96);
          if (var2 == null) {
            break L213;
          } else {
            tc.field_w[33] = sc.a((byte) 113, var2);
            break L213;
          }
        }
        L214: {
          var2 = tj.a("spellnames,34", param1 ^ -79);
          if (null == var2) {
            break L214;
          } else {
            tc.field_w[34] = sc.a((byte) 103, var2);
            break L214;
          }
        }
        L215: {
          var2 = tj.a("spellnames,35", param1 + -134);
          if (null == var2) {
            break L215;
          } else {
            tc.field_w[35] = sc.a((byte) 127, var2);
            break L215;
          }
        }
        L216: {
          var2 = tj.a("spellnames,36", -99);
          if (null != var2) {
            tc.field_w[36] = sc.a((byte) 91, var2);
            break L216;
          } else {
            break L216;
          }
        }
        L217: {
          var2 = tj.a("spellnames,37", -116);
          if (null != var2) {
            tc.field_w[37] = sc.a((byte) 124, var2);
            break L217;
          } else {
            break L217;
          }
        }
        L218: {
          var2 = tj.a("spellnames,38", -87);
          if (null != var2) {
            tc.field_w[38] = sc.a((byte) 92, var2);
            break L218;
          } else {
            break L218;
          }
        }
        L219: {
          var2 = tj.a("spellnames,39", -113);
          if (null == var2) {
            break L219;
          } else {
            tc.field_w[39] = sc.a((byte) 92, var2);
            break L219;
          }
        }
        L220: {
          var2 = tj.a("spellnames,40", -101);
          if (null == var2) {
            break L220;
          } else {
            tc.field_w[40] = sc.a((byte) 97, var2);
            break L220;
          }
        }
        L221: {
          var2 = tj.a("spellnames,41", param1 ^ -70);
          if (null == var2) {
            break L221;
          } else {
            tc.field_w[41] = sc.a((byte) 122, var2);
            break L221;
          }
        }
        L222: {
          var2 = tj.a("spellnames,42", -128);
          if (null == var2) {
            break L222;
          } else {
            tc.field_w[42] = sc.a((byte) 116, var2);
            break L222;
          }
        }
        L223: {
          var2 = tj.a("spellnames,43", -110);
          if (var2 == null) {
            break L223;
          } else {
            tc.field_w[43] = sc.a((byte) 103, var2);
            break L223;
          }
        }
        L224: {
          var2 = tj.a("spellnames,44", -96);
          if (var2 == null) {
            break L224;
          } else {
            tc.field_w[44] = sc.a((byte) 93, var2);
            break L224;
          }
        }
        L225: {
          var2 = tj.a("spellnames,45", -90);
          if (null == var2) {
            break L225;
          } else {
            tc.field_w[45] = sc.a((byte) 116, var2);
            break L225;
          }
        }
        L226: {
          var2 = tj.a("spellnames,46", -103);
          if (null == var2) {
            break L226;
          } else {
            tc.field_w[46] = sc.a((byte) 108, var2);
            break L226;
          }
        }
        L227: {
          var2 = tj.a("spellnames,47", -105);
          if (null == var2) {
            break L227;
          } else {
            tc.field_w[47] = sc.a((byte) 100, var2);
            break L227;
          }
        }
        L228: {
          var2 = tj.a("spellnames,48", param1 + -145);
          if (null != var2) {
            tc.field_w[48] = sc.a((byte) 86, var2);
            break L228;
          } else {
            break L228;
          }
        }
        L229: {
          var2 = tj.a("spellnames,49", -124);
          if (null != var2) {
            tc.field_w[49] = sc.a((byte) 123, var2);
            break L229;
          } else {
            break L229;
          }
        }
        L230: {
          var2 = tj.a("spellnames,50", param1 + -124);
          if (var2 != null) {
            tc.field_w[50] = sc.a((byte) 103, var2);
            break L230;
          } else {
            break L230;
          }
        }
        L231: {
          var2 = tj.a("spellnames,51", -108);
          if (null != var2) {
            tc.field_w[51] = sc.a((byte) 116, var2);
            break L231;
          } else {
            break L231;
          }
        }
        L232: {
          var2 = tj.a("spellnames,52", -122);
          if (var2 != null) {
            tc.field_w[52] = sc.a((byte) 111, var2);
            break L232;
          } else {
            break L232;
          }
        }
        L233: {
          var2 = tj.a("spellnames,53", -97);
          if (null != var2) {
            tc.field_w[53] = sc.a((byte) 113, var2);
            break L233;
          } else {
            break L233;
          }
        }
        L234: {
          var2 = tj.a("spellnames,54", param1 ^ -74);
          if (null != var2) {
            tc.field_w[54] = sc.a((byte) 117, var2);
            break L234;
          } else {
            break L234;
          }
        }
        L235: {
          var2 = tj.a("spellnames,55", -124);
          if (null == var2) {
            break L235;
          } else {
            tc.field_w[55] = sc.a((byte) 107, var2);
            break L235;
          }
        }
        L236: {
          var2 = tj.a("spellnames,56", -99);
          if (null != var2) {
            tc.field_w[56] = sc.a((byte) 90, var2);
            break L236;
          } else {
            break L236;
          }
        }
        L237: {
          var2 = tj.a("spellnames,57", param1 + -143);
          if (null == var2) {
            break L237;
          } else {
            tc.field_w[57] = sc.a((byte) 93, var2);
            break L237;
          }
        }
        L238: {
          var2 = tj.a("spellnames,58", -119);
          if (var2 == null) {
            break L238;
          } else {
            tc.field_w[58] = sc.a((byte) 92, var2);
            break L238;
          }
        }
        L239: {
          var2 = tj.a("spellnames,59", -124);
          if (var2 == null) {
            break L239;
          } else {
            tc.field_w[59] = sc.a((byte) 96, var2);
            break L239;
          }
        }
        L240: {
          var2 = tj.a("spellnames,60", -128);
          if (var2 != null) {
            tc.field_w[60] = sc.a((byte) 115, var2);
            break L240;
          } else {
            break L240;
          }
        }
        L241: {
          var2 = tj.a("spellnames,61", -93);
          if (var2 != null) {
            tc.field_w[61] = sc.a((byte) 107, var2);
            break L241;
          } else {
            break L241;
          }
        }
        L242: {
          var2 = tj.a("spellnames,62", -76);
          if (null == var2) {
            break L242;
          } else {
            tc.field_w[62] = sc.a((byte) 90, var2);
            break L242;
          }
        }
        L243: {
          var2 = tj.a("spellnames,63", param1 ^ -96);
          if (var2 == null) {
            break L243;
          } else {
            tc.field_w[63] = sc.a((byte) 86, var2);
            break L243;
          }
        }
        L244: {
          var2 = tj.a("spellnames,64", -108);
          if (var2 == null) {
            break L244;
          } else {
            tc.field_w[64] = sc.a((byte) 122, var2);
            break L244;
          }
        }
        L245: {
          var2 = tj.a("spellnames,65", -115);
          if (null == var2) {
            break L245;
          } else {
            tc.field_w[65] = sc.a((byte) 116, var2);
            break L245;
          }
        }
        L246: {
          var2 = tj.a("spellnames,66", -118);
          if (var2 == null) {
            break L246;
          } else {
            tc.field_w[66] = sc.a((byte) 110, var2);
            break L246;
          }
        }
        L247: {
          var2 = tj.a("spellnames,67", -91);
          if (var2 != null) {
            tc.field_w[67] = sc.a((byte) 124, var2);
            break L247;
          } else {
            break L247;
          }
        }
        L248: {
          var2 = tj.a("spellnames,68", param1 ^ -118);
          if (var2 != null) {
            tc.field_w[68] = sc.a((byte) 121, var2);
            break L248;
          } else {
            break L248;
          }
        }
        L249: {
          var2 = tj.a("spellnames,69", -99);
          if (null == var2) {
            break L249;
          } else {
            tc.field_w[69] = sc.a((byte) 108, var2);
            break L249;
          }
        }
        L250: {
          var2 = tj.a("spellnames,70", param1 ^ -114);
          if (var2 == null) {
            break L250;
          } else {
            tc.field_w[70] = sc.a((byte) 97, var2);
            break L250;
          }
        }
        L251: {
          var2 = tj.a("spellnames,71", -109);
          if (null == var2) {
            break L251;
          } else {
            tc.field_w[71] = sc.a((byte) 86, var2);
            break L251;
          }
        }
        L252: {
          var2 = tj.a("spellnames,72", -80);
          if (var2 == null) {
            break L252;
          } else {
            tc.field_w[72] = sc.a((byte) 94, var2);
            break L252;
          }
        }
        L253: {
          var2 = tj.a("spellnames,73", param1 + -140);
          if (null == var2) {
            break L253;
          } else {
            tc.field_w[73] = sc.a((byte) 103, var2);
            break L253;
          }
        }
        L254: {
          var2 = tj.a("spellnames,74", param1 ^ -75);
          if (null == var2) {
            break L254;
          } else {
            tc.field_w[74] = sc.a((byte) 119, var2);
            break L254;
          }
        }
        L255: {
          var2 = tj.a("spellnames,75", param1 + -120);
          if (var2 == null) {
            break L255;
          } else {
            tc.field_w[75] = sc.a((byte) 90, var2);
            break L255;
          }
        }
        L256: {
          var2 = tj.a("spellnames,76", param1 ^ -100);
          if (null != var2) {
            tc.field_w[76] = sc.a((byte) 86, var2);
            break L256;
          } else {
            break L256;
          }
        }
        L257: {
          var2 = tj.a("spellnames,77", -75);
          if (null == var2) {
            break L257;
          } else {
            tc.field_w[77] = sc.a((byte) 99, var2);
            break L257;
          }
        }
        L258: {
          var2 = tj.a("spellnames,78", param1 ^ -110);
          if (var2 == null) {
            break L258;
          } else {
            tc.field_w[78] = sc.a((byte) 113, var2);
            break L258;
          }
        }
        L259: {
          var2 = tj.a("spellnames,79", -123);
          if (null != var2) {
            tc.field_w[79] = sc.a((byte) 99, var2);
            break L259;
          } else {
            break L259;
          }
        }
        L260: {
          var2 = tj.a("spellnames,80", param1 ^ -91);
          if (null != var2) {
            tc.field_w[80] = sc.a((byte) 127, var2);
            break L260;
          } else {
            break L260;
          }
        }
        L261: {
          var2 = tj.a("spellnames,81", param1 ^ -122);
          if (null != var2) {
            tc.field_w[81] = sc.a((byte) 123, var2);
            break L261;
          } else {
            break L261;
          }
        }
        L262: {
          var2 = tj.a("spellnames,82", param1 ^ -118);
          if (var2 == null) {
            break L262;
          } else {
            tc.field_w[82] = sc.a((byte) 126, var2);
            break L262;
          }
        }
        L263: {
          var2 = tj.a("spellnames,83", param1 ^ -105);
          if (null == var2) {
            break L263;
          } else {
            tc.field_w[83] = sc.a((byte) 104, var2);
            break L263;
          }
        }
        L264: {
          var2 = tj.a("spellnames,84", -77);
          if (var2 == null) {
            break L264;
          } else {
            tc.field_w[84] = sc.a((byte) 86, var2);
            break L264;
          }
        }
        L265: {
          var2 = tj.a("spellnames,85", -70);
          if (var2 == null) {
            break L265;
          } else {
            tc.field_w[85] = sc.a((byte) 89, var2);
            break L265;
          }
        }
        L266: {
          var2 = tj.a("spellnames,86", -80);
          if (var2 != null) {
            tc.field_w[86] = sc.a((byte) 100, var2);
            break L266;
          } else {
            break L266;
          }
        }
        L267: {
          var2 = tj.a("spellnames,87", param1 ^ -84);
          if (var2 != null) {
            tc.field_w[87] = sc.a((byte) 90, var2);
            break L267;
          } else {
            break L267;
          }
        }
        L268: {
          var2 = tj.a("spellnames,88", -95);
          if (var2 == null) {
            break L268;
          } else {
            tc.field_w[88] = sc.a((byte) 93, var2);
            break L268;
          }
        }
        L269: {
          var2 = tj.a("spellnames,89", -74);
          if (var2 == null) {
            break L269;
          } else {
            tc.field_w[89] = sc.a((byte) 87, var2);
            break L269;
          }
        }
        L270: {
          var2 = tj.a("spellnames,90", -96);
          if (var2 == null) {
            break L270;
          } else {
            tc.field_w[90] = sc.a((byte) 110, var2);
            break L270;
          }
        }
        L271: {
          var2 = tj.a("spellnames,91", -118);
          if (var2 == null) {
            break L271;
          } else {
            tc.field_w[91] = sc.a((byte) 95, var2);
            break L271;
          }
        }
        L272: {
          var2 = tj.a("spellnames,92", -87);
          if (null != var2) {
            tc.field_w[92] = sc.a((byte) 121, var2);
            break L272;
          } else {
            break L272;
          }
        }
        L273: {
          var2 = tj.a("spellnames,93", param1 + -146);
          if (null == var2) {
            break L273;
          } else {
            tc.field_w[93] = sc.a((byte) 113, var2);
            break L273;
          }
        }
        L274: {
          var2 = tj.a("spellnames,94", param1 + -139);
          if (null != var2) {
            tc.field_w[94] = sc.a((byte) 92, var2);
            break L274;
          } else {
            break L274;
          }
        }
        L275: {
          var2 = tj.a("spellnames,95", -108);
          if (var2 == null) {
            break L275;
          } else {
            tc.field_w[95] = sc.a((byte) 122, var2);
            break L275;
          }
        }
        L276: {
          var2 = tj.a("spellnames,96", -80);
          if (null != var2) {
            tc.field_w[96] = sc.a((byte) 106, var2);
            break L276;
          } else {
            break L276;
          }
        }
        L277: {
          var2 = tj.a("spellnames,97", -122);
          if (var2 != null) {
            tc.field_w[97] = sc.a((byte) 101, var2);
            break L277;
          } else {
            break L277;
          }
        }
        L278: {
          var2 = tj.a("spellnames,98", -93);
          if (null == var2) {
            break L278;
          } else {
            tc.field_w[98] = sc.a((byte) 88, var2);
            break L278;
          }
        }
        L279: {
          var2 = tj.a("spellnames,99", -119);
          if (null != var2) {
            tc.field_w[99] = sc.a((byte) 121, var2);
            break L279;
          } else {
            break L279;
          }
        }
        L280: {
          var2 = tj.a("spellnames,100", param1 + -99);
          if (var2 != null) {
            tc.field_w[100] = sc.a((byte) 97, var2);
            break L280;
          } else {
            break L280;
          }
        }
        L281: {
          var2 = tj.a("spellnames,101", param1 ^ -96);
          if (null != var2) {
            tc.field_w[101] = sc.a((byte) 99, var2);
            break L281;
          } else {
            break L281;
          }
        }
        L282: {
          var2 = tj.a("spellnames,102", -75);
          if (var2 != null) {
            tc.field_w[102] = sc.a((byte) 117, var2);
            break L282;
          } else {
            break L282;
          }
        }
        L283: {
          var2 = tj.a("spellnames,103", -96);
          if (var2 == null) {
            break L283;
          } else {
            tc.field_w[103] = sc.a((byte) 107, var2);
            break L283;
          }
        }
        L284: {
          var2 = tj.a("spellnames,104", -113);
          if (null != var2) {
            tc.field_w[104] = sc.a((byte) 115, var2);
            break L284;
          } else {
            break L284;
          }
        }
        L285: {
          var2 = tj.a("spellnames,105", -104);
          if (var2 != null) {
            tc.field_w[105] = sc.a((byte) 123, var2);
            break L285;
          } else {
            break L285;
          }
        }
        L286: {
          var2 = tj.a("spellnames,106", param1 ^ -70);
          if (null != var2) {
            tc.field_w[106] = sc.a((byte) 113, var2);
            break L286;
          } else {
            break L286;
          }
        }
        L287: {
          var2 = tj.a("spellnames,107", -80);
          if (var2 == null) {
            break L287;
          } else {
            tc.field_w[107] = sc.a((byte) 89, var2);
            break L287;
          }
        }
        L288: {
          var2 = tj.a("spellnames,108", -98);
          if (null == var2) {
            break L288;
          } else {
            tc.field_w[108] = sc.a((byte) 98, var2);
            break L288;
          }
        }
        L289: {
          var2 = tj.a("spellnames,109", param1 ^ -76);
          if (null == var2) {
            break L289;
          } else {
            tc.field_w[109] = sc.a((byte) 113, var2);
            break L289;
          }
        }
        L290: {
          var2 = tj.a("spellnames,110", -88);
          if (null == var2) {
            break L290;
          } else {
            tc.field_w[110] = sc.a((byte) 107, var2);
            break L290;
          }
        }
        L291: {
          var2 = tj.a("spellnames,111", -122);
          if (null != var2) {
            tc.field_w[111] = sc.a((byte) 112, var2);
            break L291;
          } else {
            break L291;
          }
        }
        L292: {
          var2 = tj.a("spellnames,112", -83);
          if (null == var2) {
            break L292;
          } else {
            tc.field_w[112] = sc.a((byte) 120, var2);
            break L292;
          }
        }
        L293: {
          var2 = tj.a("spellnames,113", -126);
          if (var2 == null) {
            break L293;
          } else {
            tc.field_w[113] = sc.a((byte) 92, var2);
            break L293;
          }
        }
        L294: {
          var2 = tj.a("spellnames,114", -110);
          if (var2 != null) {
            tc.field_w[114] = sc.a((byte) 112, var2);
            break L294;
          } else {
            break L294;
          }
        }
        L295: {
          var2 = tj.a("spellnames,115", -95);
          if (var2 != null) {
            tc.field_w[115] = sc.a((byte) 88, var2);
            break L295;
          } else {
            break L295;
          }
        }
        L296: {
          var2 = tj.a("spellnames,116", param1 + -142);
          if (null == var2) {
            break L296;
          } else {
            tc.field_w[116] = sc.a((byte) 93, var2);
            break L296;
          }
        }
        L297: {
          var2 = tj.a("spellnames,117", -110);
          if (var2 != null) {
            tc.field_w[117] = sc.a((byte) 89, var2);
            break L297;
          } else {
            break L297;
          }
        }
        L298: {
          var2 = tj.a("spellnames,118", param1 ^ -98);
          if (null != var2) {
            tc.field_w[118] = sc.a((byte) 124, var2);
            break L298;
          } else {
            break L298;
          }
        }
        L299: {
          var2 = tj.a("spellnames,119", -101);
          if (null == var2) {
            break L299;
          } else {
            tc.field_w[119] = sc.a((byte) 95, var2);
            break L299;
          }
        }
        L300: {
          var2 = tj.a("spellnames,120", param1 + -118);
          if (null == var2) {
            break L300;
          } else {
            tc.field_w[120] = sc.a((byte) 89, var2);
            break L300;
          }
        }
        L301: {
          var2 = tj.a("spellnames,121", -116);
          if (null != var2) {
            tc.field_w[121] = sc.a((byte) 87, var2);
            break L301;
          } else {
            break L301;
          }
        }
        L302: {
          var2 = tj.a("spellnames,122", -76);
          if (var2 != null) {
            tc.field_w[122] = sc.a((byte) 122, var2);
            break L302;
          } else {
            break L302;
          }
        }
        L303: {
          var2 = tj.a("spellnames,123", -108);
          if (var2 == null) {
            break L303;
          } else {
            tc.field_w[123] = sc.a((byte) 124, var2);
            break L303;
          }
        }
        L304: {
          var2 = tj.a("spellnames,124", -124);
          if (null == var2) {
            break L304;
          } else {
            tc.field_w[124] = sc.a((byte) 110, var2);
            break L304;
          }
        }
        L305: {
          var2 = tj.a("spellnames,125", -110);
          if (null == var2) {
            break L305;
          } else {
            tc.field_w[125] = sc.a((byte) 103, var2);
            break L305;
          }
        }
        L306: {
          var2 = tj.a("spellnames,126", -81);
          if (var2 == null) {
            break L306;
          } else {
            tc.field_w[126] = sc.a((byte) 119, var2);
            break L306;
          }
        }
        L307: {
          var2 = tj.a("spellnames,127", -125);
          if (null == var2) {
            break L307;
          } else {
            tc.field_w[127] = sc.a((byte) 103, var2);
            break L307;
          }
        }
        L308: {
          var2 = tj.a("spellnames,128", -106);
          if (null != var2) {
            tc.field_w[128] = sc.a((byte) 114, var2);
            break L308;
          } else {
            break L308;
          }
        }
        L309: {
          var2 = tj.a("spellnames,129", -91);
          if (null == var2) {
            break L309;
          } else {
            tc.field_w[129] = sc.a((byte) 111, var2);
            break L309;
          }
        }
        L310: {
          var2 = tj.a("spellnames,130", -124);
          if (var2 != null) {
            tc.field_w[130] = sc.a((byte) 118, var2);
            break L310;
          } else {
            break L310;
          }
        }
        L311: {
          var2 = tj.a("spellnames,131", -70);
          if (null == var2) {
            break L311;
          } else {
            tc.field_w[131] = sc.a((byte) 98, var2);
            break L311;
          }
        }
        L312: {
          var2 = tj.a("spellnames,132", -118);
          if (var2 != null) {
            tc.field_w[132] = sc.a((byte) 124, var2);
            break L312;
          } else {
            break L312;
          }
        }
        L313: {
          var2 = tj.a("spellnames,133", param1 ^ -104);
          if (null == var2) {
            break L313;
          } else {
            tc.field_w[133] = sc.a((byte) 110, var2);
            break L313;
          }
        }
        L314: {
          var2 = tj.a("spellnames,134", -80);
          if (null != var2) {
            tc.field_w[134] = sc.a((byte) 117, var2);
            break L314;
          } else {
            break L314;
          }
        }
        L315: {
          var2 = tj.a("spellnames,135", -126);
          if (var2 == null) {
            break L315;
          } else {
            tc.field_w[135] = sc.a((byte) 115, var2);
            break L315;
          }
        }
        L316: {
          var2 = tj.a("spellnames,136", param1 + -103);
          if (null == var2) {
            break L316;
          } else {
            tc.field_w[136] = sc.a((byte) 99, var2);
            break L316;
          }
        }
        L317: {
          var2 = tj.a("spellnames,137", param1 + -126);
          if (var2 != null) {
            tc.field_w[137] = sc.a((byte) 101, var2);
            break L317;
          } else {
            break L317;
          }
        }
        L318: {
          var2 = tj.a("spellnames,138", param1 + -97);
          if (null == var2) {
            break L318;
          } else {
            tc.field_w[138] = sc.a((byte) 101, var2);
            break L318;
          }
        }
        L319: {
          var2 = tj.a("spellnames,139", -80);
          if (null == var2) {
            break L319;
          } else {
            tc.field_w[139] = sc.a((byte) 125, var2);
            break L319;
          }
        }
        L320: {
          var2 = tj.a("spellnames,140", -100);
          if (null == var2) {
            break L320;
          } else {
            tc.field_w[140] = sc.a((byte) 122, var2);
            break L320;
          }
        }
        L321: {
          var2 = tj.a("spellnames,141", param1 + -93);
          if (var2 == null) {
            break L321;
          } else {
            tc.field_w[141] = sc.a((byte) 124, var2);
            break L321;
          }
        }
        L322: {
          var2 = tj.a("spellnames,142", -88);
          if (var2 == null) {
            break L322;
          } else {
            tc.field_w[142] = sc.a((byte) 117, var2);
            break L322;
          }
        }
        L323: {
          var2 = tj.a("spellnames,143", -112);
          if (var2 != null) {
            tc.field_w[143] = sc.a((byte) 95, var2);
            break L323;
          } else {
            break L323;
          }
        }
        L324: {
          var2 = tj.a("spellnames,144", -100);
          if (null != var2) {
            tc.field_w[144] = sc.a((byte) 90, var2);
            break L324;
          } else {
            break L324;
          }
        }
        L325: {
          var2 = tj.a("spellnames,145", param1 ^ -105);
          if (var2 != null) {
            tc.field_w[145] = sc.a((byte) 113, var2);
            break L325;
          } else {
            break L325;
          }
        }
        L326: {
          var2 = tj.a("spellnames,146", -109);
          if (null != var2) {
            tc.field_w[146] = sc.a((byte) 108, var2);
            break L326;
          } else {
            break L326;
          }
        }
        L327: {
          var2 = tj.a("spellnames,147", -114);
          if (null == var2) {
            break L327;
          } else {
            tc.field_w[147] = sc.a((byte) 98, var2);
            break L327;
          }
        }
        L328: {
          var2 = tj.a("spellnames,148", param1 ^ -91);
          if (var2 != null) {
            tc.field_w[148] = sc.a((byte) 95, var2);
            break L328;
          } else {
            break L328;
          }
        }
        L329: {
          var2 = tj.a("spellnames,149", param1 + -142);
          if (var2 != null) {
            tc.field_w[149] = sc.a((byte) 97, var2);
            break L329;
          } else {
            break L329;
          }
        }
        L330: {
          var2 = tj.a("spellnames,150", -107);
          if (var2 == null) {
            break L330;
          } else {
            tc.field_w[150] = sc.a((byte) 87, var2);
            break L330;
          }
        }
        L331: {
          var2 = tj.a("spellnames,151", -107);
          if (var2 != null) {
            tc.field_w[151] = sc.a((byte) 99, var2);
            break L331;
          } else {
            break L331;
          }
        }
        L332: {
          var2 = tj.a("spellnames,152", param1 + -141);
          if (null == var2) {
            break L332;
          } else {
            tc.field_w[152] = sc.a((byte) 116, var2);
            break L332;
          }
        }
        L333: {
          var2 = tj.a("spellnames,153", -97);
          if (var2 == null) {
            break L333;
          } else {
            tc.field_w[153] = sc.a((byte) 116, var2);
            break L333;
          }
        }
        L334: {
          var2 = tj.a("spellnames,154", -77);
          if (null == var2) {
            break L334;
          } else {
            tc.field_w[154] = sc.a((byte) 92, var2);
            break L334;
          }
        }
        L335: {
          var2 = tj.a("spellnames,155", param1 + -107);
          if (null != var2) {
            tc.field_w[155] = sc.a((byte) 122, var2);
            break L335;
          } else {
            break L335;
          }
        }
        L336: {
          var2 = tj.a("spellnames,156", -127);
          if (var2 != null) {
            tc.field_w[156] = sc.a((byte) 88, var2);
            break L336;
          } else {
            break L336;
          }
        }
        L337: {
          var2 = tj.a("spellnames,157", -126);
          if (var2 != null) {
            tc.field_w[157] = sc.a((byte) 86, var2);
            break L337;
          } else {
            break L337;
          }
        }
        L338: {
          var2 = tj.a("achievement_names,0", -74);
          if (var2 != null) {
            rb.field_n[0] = sc.a((byte) 96, var2);
            break L338;
          } else {
            break L338;
          }
        }
        L339: {
          var2 = tj.a("achievement_names,1", -123);
          if (var2 == null) {
            break L339;
          } else {
            rb.field_n[1] = sc.a((byte) 106, var2);
            break L339;
          }
        }
        L340: {
          var2 = tj.a("achievement_names,2", param1 + -106);
          if (null != var2) {
            rb.field_n[2] = sc.a((byte) 99, var2);
            break L340;
          } else {
            break L340;
          }
        }
        L341: {
          var2 = tj.a("achievement_names,3", -109);
          if (null == var2) {
            break L341;
          } else {
            rb.field_n[3] = sc.a((byte) 113, var2);
            break L341;
          }
        }
        L342: {
          var2 = tj.a("achievement_names,4", -75);
          if (var2 != null) {
            rb.field_n[4] = sc.a((byte) 95, var2);
            break L342;
          } else {
            break L342;
          }
        }
        L343: {
          var2 = tj.a("achievement_names,5", param1 + -127);
          if (null != var2) {
            rb.field_n[5] = sc.a((byte) 86, var2);
            break L343;
          } else {
            break L343;
          }
        }
        L344: {
          var2 = tj.a("achievement_names,6", param1 ^ -70);
          if (var2 == null) {
            break L344;
          } else {
            rb.field_n[6] = sc.a((byte) 101, var2);
            break L344;
          }
        }
        L345: {
          var2 = tj.a("achievement_names,7", -79);
          if (null != var2) {
            rb.field_n[7] = sc.a((byte) 95, var2);
            break L345;
          } else {
            break L345;
          }
        }
        L346: {
          var2 = tj.a("achievement_names,8", param1 ^ -108);
          if (null == var2) {
            break L346;
          } else {
            rb.field_n[8] = sc.a((byte) 108, var2);
            break L346;
          }
        }
        L347: {
          var2 = tj.a("achievement_names,9", -91);
          if (var2 == null) {
            break L347;
          } else {
            rb.field_n[9] = sc.a((byte) 122, var2);
            break L347;
          }
        }
        L348: {
          var2 = tj.a("achievement_names,10", -112);
          if (null != var2) {
            rb.field_n[10] = sc.a((byte) 104, var2);
            break L348;
          } else {
            break L348;
          }
        }
        L349: {
          var2 = tj.a("achievement_names,11", -92);
          if (var2 != null) {
            rb.field_n[11] = sc.a((byte) 107, var2);
            break L349;
          } else {
            break L349;
          }
        }
        L350: {
          var2 = tj.a("achievement_names,12", -115);
          if (null == var2) {
            break L350;
          } else {
            rb.field_n[12] = sc.a((byte) 92, var2);
            break L350;
          }
        }
        L351: {
          var2 = tj.a("achievement_names,13", -110);
          if (var2 != null) {
            rb.field_n[13] = sc.a((byte) 114, var2);
            break L351;
          } else {
            break L351;
          }
        }
        L352: {
          var2 = tj.a("achievement_names,14", -79);
          if (var2 == null) {
            break L352;
          } else {
            rb.field_n[14] = sc.a((byte) 124, var2);
            break L352;
          }
        }
        L353: {
          var2 = tj.a("achievement_names,15", -105);
          if (var2 != null) {
            rb.field_n[15] = sc.a((byte) 87, var2);
            break L353;
          } else {
            break L353;
          }
        }
        L354: {
          var2 = tj.a("achievement_names,16", -101);
          if (null != var2) {
            rb.field_n[16] = sc.a((byte) 115, var2);
            break L354;
          } else {
            break L354;
          }
        }
        L355: {
          var2 = tj.a("achievement_names,17", -86);
          if (var2 != null) {
            rb.field_n[17] = sc.a((byte) 87, var2);
            break L355;
          } else {
            break L355;
          }
        }
        L356: {
          var2 = tj.a("achievement_names,18", param1 + -126);
          if (var2 == null) {
            break L356;
          } else {
            rb.field_n[18] = sc.a((byte) 117, var2);
            break L356;
          }
        }
        L357: {
          var2 = tj.a("achievement_names,19", -128);
          if (var2 != null) {
            rb.field_n[19] = sc.a((byte) 95, var2);
            break L357;
          } else {
            break L357;
          }
        }
        L358: {
          var2 = tj.a("achievement_names,20", -87);
          if (null == var2) {
            break L358;
          } else {
            rb.field_n[20] = sc.a((byte) 119, var2);
            break L358;
          }
        }
        L359: {
          var2 = tj.a("achievement_names,21", param1 ^ -120);
          if (var2 == null) {
            break L359;
          } else {
            rb.field_n[21] = sc.a((byte) 94, var2);
            break L359;
          }
        }
        L360: {
          var2 = tj.a("achievement_names,22", param1 ^ -98);
          if (var2 != null) {
            rb.field_n[22] = sc.a((byte) 91, var2);
            break L360;
          } else {
            break L360;
          }
        }
        L361: {
          var2 = tj.a("achievement_names,23", -93);
          if (var2 != null) {
            rb.field_n[23] = sc.a((byte) 103, var2);
            break L361;
          } else {
            break L361;
          }
        }
        L362: {
          var2 = tj.a("achievement_names,24", -73);
          if (null != var2) {
            rb.field_n[24] = sc.a((byte) 106, var2);
            break L362;
          } else {
            break L362;
          }
        }
        L363: {
          var2 = tj.a("achievement_names,25", -72);
          if (null != var2) {
            rb.field_n[25] = sc.a((byte) 106, var2);
            break L363;
          } else {
            break L363;
          }
        }
        L364: {
          var2 = tj.a("achievement_names,26", -118);
          if (var2 != null) {
            rb.field_n[26] = sc.a((byte) 118, var2);
            break L364;
          } else {
            break L364;
          }
        }
        L365: {
          var2 = tj.a("achievement_names,27", param1 ^ -89);
          if (var2 != null) {
            rb.field_n[27] = sc.a((byte) 120, var2);
            break L365;
          } else {
            break L365;
          }
        }
        L366: {
          var2 = tj.a("achievement_names,28", -84);
          if (null == var2) {
            break L366;
          } else {
            rb.field_n[28] = sc.a((byte) 117, var2);
            break L366;
          }
        }
        L367: {
          var2 = tj.a("achievement_names,29", -114);
          if (null != var2) {
            rb.field_n[29] = sc.a((byte) 112, var2);
            break L367;
          } else {
            break L367;
          }
        }
        L368: {
          var2 = tj.a("achievement_names,30", -106);
          if (null != var2) {
            rb.field_n[30] = sc.a((byte) 93, var2);
            break L368;
          } else {
            break L368;
          }
        }
        L369: {
          var2 = tj.a("achievement_names,31", param1 + -115);
          if (null == var2) {
            break L369;
          } else {
            rb.field_n[31] = sc.a((byte) 115, var2);
            break L369;
          }
        }
        L370: {
          var2 = tj.a("achievement_names,32", -111);
          if (var2 != null) {
            rb.field_n[32] = sc.a((byte) 88, var2);
            break L370;
          } else {
            break L370;
          }
        }
        L371: {
          var2 = tj.a("achievement_names,33", -101);
          if (var2 == null) {
            break L371;
          } else {
            rb.field_n[33] = sc.a((byte) 114, var2);
            break L371;
          }
        }
        L372: {
          var2 = tj.a("achievement_names,34", -107);
          if (null == var2) {
            break L372;
          } else {
            rb.field_n[34] = sc.a((byte) 126, var2);
            break L372;
          }
        }
        L373: {
          var2 = tj.a("achievement_names,35", -99);
          if (var2 != null) {
            rb.field_n[35] = sc.a((byte) 105, var2);
            break L373;
          } else {
            break L373;
          }
        }
        L374: {
          var2 = tj.a("achievement_names,36", -83);
          if (null != var2) {
            rb.field_n[36] = sc.a((byte) 126, var2);
            break L374;
          } else {
            break L374;
          }
        }
        L375: {
          var2 = tj.a("achievement_names,37", param1 ^ -94);
          if (var2 == null) {
            break L375;
          } else {
            rb.field_n[37] = sc.a((byte) 102, var2);
            break L375;
          }
        }
        L376: {
          var2 = tj.a("achievement_names,38", param1 + -141);
          if (var2 != null) {
            rb.field_n[38] = sc.a((byte) 124, var2);
            break L376;
          } else {
            break L376;
          }
        }
        L377: {
          var2 = tj.a("achievement_names,39", -106);
          if (null == var2) {
            break L377;
          } else {
            rb.field_n[39] = sc.a((byte) 97, var2);
            break L377;
          }
        }
        L378: {
          var2 = tj.a("achievement_names,40", -112);
          if (var2 == null) {
            break L378;
          } else {
            rb.field_n[40] = sc.a((byte) 125, var2);
            break L378;
          }
        }
        L379: {
          var2 = tj.a("achievement_names,41", -109);
          if (null == var2) {
            break L379;
          } else {
            rb.field_n[41] = sc.a((byte) 121, var2);
            break L379;
          }
        }
        L380: {
          var2 = tj.a("achievement_names,42", -79);
          if (var2 != null) {
            rb.field_n[42] = sc.a((byte) 102, var2);
            break L380;
          } else {
            break L380;
          }
        }
        L381: {
          var2 = tj.a("achievement_names,43", -117);
          if (var2 == null) {
            break L381;
          } else {
            rb.field_n[43] = sc.a((byte) 108, var2);
            break L381;
          }
        }
        L382: {
          var2 = tj.a("achievement_names,44", param1 ^ -109);
          if (var2 != null) {
            rb.field_n[44] = sc.a((byte) 101, var2);
            break L382;
          } else {
            break L382;
          }
        }
        L383: {
          var2 = tj.a("achievement_names,45", param1 ^ -101);
          if (var2 == null) {
            break L383;
          } else {
            rb.field_n[45] = sc.a((byte) 120, var2);
            break L383;
          }
        }
        L384: {
          var2 = tj.a("achievement_names,46", -127);
          if (null == var2) {
            break L384;
          } else {
            rb.field_n[46] = sc.a((byte) 104, var2);
            break L384;
          }
        }
        L385: {
          var2 = tj.a("achievement_names,47", -111);
          if (var2 != null) {
            rb.field_n[47] = sc.a((byte) 98, var2);
            break L385;
          } else {
            break L385;
          }
        }
        L386: {
          var2 = tj.a("achievement_names,48", -118);
          if (var2 == null) {
            break L386;
          } else {
            rb.field_n[48] = sc.a((byte) 88, var2);
            break L386;
          }
        }
        L387: {
          var2 = tj.a("achievement_names,49", -125);
          if (var2 != null) {
            rb.field_n[49] = sc.a((byte) 99, var2);
            break L387;
          } else {
            break L387;
          }
        }
        L388: {
          var2 = tj.a("achievement_names,50", -112);
          if (var2 == null) {
            break L388;
          } else {
            rb.field_n[50] = sc.a((byte) 95, var2);
            break L388;
          }
        }
        L389: {
          var2 = tj.a("achievement_names,51", -113);
          if (var2 == null) {
            break L389;
          } else {
            rb.field_n[51] = sc.a((byte) 118, var2);
            break L389;
          }
        }
        L390: {
          var2 = tj.a("achievement_names,52", -125);
          if (var2 == null) {
            break L390;
          } else {
            rb.field_n[52] = sc.a((byte) 88, var2);
            break L390;
          }
        }
        L391: {
          var2 = tj.a("achievement_names,53", -81);
          if (var2 != null) {
            rb.field_n[53] = sc.a((byte) 116, var2);
            break L391;
          } else {
            break L391;
          }
        }
        L392: {
          var2 = tj.a("achievement_names,54", param1 + -103);
          if (null != var2) {
            rb.field_n[54] = sc.a((byte) 88, var2);
            break L392;
          } else {
            break L392;
          }
        }
        L393: {
          var2 = tj.a("achievement_names,55", -80);
          if (null == var2) {
            break L393;
          } else {
            rb.field_n[55] = sc.a((byte) 106, var2);
            break L393;
          }
        }
        L394: {
          var2 = tj.a("achievement_names,56", -82);
          if (null == var2) {
            break L394;
          } else {
            rb.field_n[56] = sc.a((byte) 96, var2);
            break L394;
          }
        }
        L395: {
          var2 = tj.a("achievement_names,57", -115);
          if (null == var2) {
            break L395;
          } else {
            rb.field_n[57] = sc.a((byte) 95, var2);
            break L395;
          }
        }
        L396: {
          var2 = tj.a("achievement_names,58", -98);
          if (null == var2) {
            break L396;
          } else {
            rb.field_n[58] = sc.a((byte) 116, var2);
            break L396;
          }
        }
        L397: {
          var2 = tj.a("achievement_names,59", -125);
          if (null != var2) {
            rb.field_n[59] = sc.a((byte) 119, var2);
            break L397;
          } else {
            break L397;
          }
        }
        L398: {
          var2 = tj.a("achievement_names,60", -120);
          if (null != var2) {
            rb.field_n[60] = sc.a((byte) 115, var2);
            break L398;
          } else {
            break L398;
          }
        }
        L399: {
          var2 = tj.a("achievement_names,61", -77);
          if (null == var2) {
            break L399;
          } else {
            rb.field_n[61] = sc.a((byte) 116, var2);
            break L399;
          }
        }
        L400: {
          var2 = tj.a("achievement_names,62", -88);
          if (null != var2) {
            rb.field_n[62] = sc.a((byte) 114, var2);
            break L400;
          } else {
            break L400;
          }
        }
        L401: {
          var2 = tj.a("achievement_names,63", param1 + -142);
          if (var2 == null) {
            break L401;
          } else {
            rb.field_n[63] = sc.a((byte) 104, var2);
            break L401;
          }
        }
        L402: {
          var2 = tj.a("achievement_names,64", -74);
          if (var2 == null) {
            break L402;
          } else {
            rb.field_n[64] = sc.a((byte) 107, var2);
            break L402;
          }
        }
        L403: {
          var2 = tj.a("achievement_names,65", param1 + -115);
          if (var2 == null) {
            break L403;
          } else {
            rb.field_n[65] = sc.a((byte) 88, var2);
            break L403;
          }
        }
        L404: {
          var2 = tj.a("achievement_names,66", param1 ^ -108);
          if (var2 == null) {
            break L404;
          } else {
            rb.field_n[66] = sc.a((byte) 105, var2);
            break L404;
          }
        }
        L405: {
          var2 = tj.a("achievement_names,67", param1 + -123);
          if (var2 != null) {
            rb.field_n[67] = sc.a((byte) 104, var2);
            break L405;
          } else {
            break L405;
          }
        }
        L406: {
          var2 = tj.a("achievement_names,68", -111);
          if (null == var2) {
            break L406;
          } else {
            rb.field_n[68] = sc.a((byte) 126, var2);
            break L406;
          }
        }
        L407: {
          var2 = tj.a("achievement_names,69", -117);
          if (null != var2) {
            rb.field_n[69] = sc.a((byte) 116, var2);
            break L407;
          } else {
            break L407;
          }
        }
        L408: {
          var2 = tj.a("achievement_names,70", -126);
          if (null != var2) {
            rb.field_n[70] = sc.a((byte) 97, var2);
            break L408;
          } else {
            break L408;
          }
        }
        L409: {
          var2 = tj.a("achievement_names,71", -94);
          if (null != var2) {
            rb.field_n[71] = sc.a((byte) 123, var2);
            break L409;
          } else {
            break L409;
          }
        }
        L410: {
          var2 = tj.a("achievement_names,72", -97);
          if (null != var2) {
            rb.field_n[72] = sc.a((byte) 103, var2);
            break L410;
          } else {
            break L410;
          }
        }
        L411: {
          var2 = tj.a("achievement_names,73", -120);
          if (var2 != null) {
            rb.field_n[73] = sc.a((byte) 106, var2);
            break L411;
          } else {
            break L411;
          }
        }
        L412: {
          var2 = tj.a("achievement_names,74", param1 ^ -108);
          if (var2 != null) {
            rb.field_n[74] = sc.a((byte) 117, var2);
            break L412;
          } else {
            break L412;
          }
        }
        L413: {
          var2 = tj.a("achievement_names,75", -84);
          if (var2 == null) {
            break L413;
          } else {
            rb.field_n[75] = sc.a((byte) 93, var2);
            break L413;
          }
        }
        L414: {
          var2 = tj.a("achievement_names,76", param1 ^ -103);
          if (null == var2) {
            break L414;
          } else {
            rb.field_n[76] = sc.a((byte) 100, var2);
            break L414;
          }
        }
        L415: {
          var2 = tj.a("achievement_names,77", -85);
          if (var2 == null) {
            break L415;
          } else {
            rb.field_n[77] = sc.a((byte) 93, var2);
            break L415;
          }
        }
        L416: {
          var2 = tj.a("achievement_names,78", -118);
          if (var2 != null) {
            rb.field_n[78] = sc.a((byte) 88, var2);
            break L416;
          } else {
            break L416;
          }
        }
        L417: {
          var2 = tj.a("achievement_names,79", -117);
          if (var2 != null) {
            rb.field_n[79] = sc.a((byte) 117, var2);
            break L417;
          } else {
            break L417;
          }
        }
        L418: {
          var2 = tj.a("achievement_names,80", -84);
          if (var2 == null) {
            break L418;
          } else {
            rb.field_n[80] = sc.a((byte) 106, var2);
            break L418;
          }
        }
        L419: {
          var2 = tj.a("achievement_names,81", -98);
          if (null == var2) {
            break L419;
          } else {
            rb.field_n[81] = sc.a((byte) 98, var2);
            break L419;
          }
        }
        L420: {
          var2 = tj.a("achievement_names,82", -78);
          if (var2 == null) {
            break L420;
          } else {
            rb.field_n[82] = sc.a((byte) 96, var2);
            break L420;
          }
        }
        L421: {
          var2 = tj.a("achievement_names,83", -96);
          if (var2 == null) {
            break L421;
          } else {
            rb.field_n[83] = sc.a((byte) 87, var2);
            break L421;
          }
        }
        L422: {
          var2 = tj.a("achievement_names,84", -102);
          if (null != var2) {
            rb.field_n[84] = sc.a((byte) 92, var2);
            break L422;
          } else {
            break L422;
          }
        }
        L423: {
          var2 = tj.a("achievement_names,85", -112);
          if (null == var2) {
            break L423;
          } else {
            rb.field_n[85] = sc.a((byte) 98, var2);
            break L423;
          }
        }
        L424: {
          var2 = tj.a("achievement_names,86", -81);
          if (null != var2) {
            rb.field_n[86] = sc.a((byte) 105, var2);
            break L424;
          } else {
            break L424;
          }
        }
        L425: {
          var2 = tj.a("achievement_names,87", -80);
          if (null == var2) {
            break L425;
          } else {
            rb.field_n[87] = sc.a((byte) 106, var2);
            break L425;
          }
        }
        L426: {
          var2 = tj.a("achievement_names,88", param1 ^ -101);
          if (var2 != null) {
            rb.field_n[88] = sc.a((byte) 116, var2);
            break L426;
          } else {
            break L426;
          }
        }
        L427: {
          var2 = tj.a("achievement_names,89", param1 + -104);
          if (var2 == null) {
            break L427;
          } else {
            rb.field_n[89] = sc.a((byte) 122, var2);
            break L427;
          }
        }
        L428: {
          var2 = tj.a("achievement_names,90", -118);
          if (var2 == null) {
            break L428;
          } else {
            rb.field_n[90] = sc.a((byte) 117, var2);
            break L428;
          }
        }
        L429: {
          var2 = tj.a("achievement_names,91", param1 + -106);
          if (null != var2) {
            rb.field_n[91] = sc.a((byte) 107, var2);
            break L429;
          } else {
            break L429;
          }
        }
        L430: {
          var2 = tj.a("achievement_names,92", -80);
          if (var2 == null) {
            break L430;
          } else {
            rb.field_n[92] = sc.a((byte) 103, var2);
            break L430;
          }
        }
        L431: {
          var2 = tj.a("achievement_names,93", -101);
          if (null != var2) {
            rb.field_n[93] = sc.a((byte) 99, var2);
            break L431;
          } else {
            break L431;
          }
        }
        L432: {
          var2 = tj.a("achievement_names,94", -117);
          if (null == var2) {
            break L432;
          } else {
            rb.field_n[94] = sc.a((byte) 88, var2);
            break L432;
          }
        }
        L433: {
          var2 = tj.a("achievement_criteria,0", param1 ^ -119);
          if (null != var2) {
            af.field_Bb[0] = sc.a((byte) 123, var2);
            break L433;
          } else {
            break L433;
          }
        }
        L434: {
          var2 = tj.a("achievement_criteria,1", -105);
          if (var2 == null) {
            break L434;
          } else {
            af.field_Bb[1] = sc.a((byte) 125, var2);
            break L434;
          }
        }
        L435: {
          var2 = tj.a("achievement_criteria,2", -98);
          if (null != var2) {
            af.field_Bb[2] = sc.a((byte) 108, var2);
            break L435;
          } else {
            break L435;
          }
        }
        L436: {
          var2 = tj.a("achievement_criteria,3", -116);
          if (var2 != null) {
            af.field_Bb[3] = sc.a((byte) 98, var2);
            break L436;
          } else {
            break L436;
          }
        }
        L437: {
          var2 = tj.a("achievement_criteria,4", -70);
          if (null != var2) {
            af.field_Bb[4] = sc.a((byte) 115, var2);
            break L437;
          } else {
            break L437;
          }
        }
        L438: {
          var2 = tj.a("achievement_criteria,5", param1 + -141);
          if (null == var2) {
            break L438;
          } else {
            af.field_Bb[5] = sc.a((byte) 125, var2);
            break L438;
          }
        }
        L439: {
          var2 = tj.a("achievement_criteria,6", -119);
          if (null != var2) {
            af.field_Bb[6] = sc.a((byte) 101, var2);
            break L439;
          } else {
            break L439;
          }
        }
        L440: {
          var2 = tj.a("achievement_criteria,7", -82);
          if (var2 != null) {
            af.field_Bb[7] = sc.a((byte) 121, var2);
            break L440;
          } else {
            break L440;
          }
        }
        L441: {
          var2 = tj.a("achievement_criteria,8", -75);
          if (var2 == null) {
            break L441;
          } else {
            af.field_Bb[8] = sc.a((byte) 109, var2);
            break L441;
          }
        }
        L442: {
          var2 = tj.a("achievement_criteria,9", -100);
          if (null != var2) {
            af.field_Bb[9] = sc.a((byte) 88, var2);
            break L442;
          } else {
            break L442;
          }
        }
        L443: {
          var2 = tj.a("achievement_criteria,10", -125);
          if (var2 == null) {
            break L443;
          } else {
            af.field_Bb[10] = sc.a((byte) 123, var2);
            break L443;
          }
        }
        L444: {
          var2 = tj.a("achievement_criteria,11", -112);
          if (null == var2) {
            break L444;
          } else {
            af.field_Bb[11] = sc.a((byte) 91, var2);
            break L444;
          }
        }
        L445: {
          var2 = tj.a("achievement_criteria,12", param1 + -142);
          if (var2 == null) {
            break L445;
          } else {
            af.field_Bb[12] = sc.a((byte) 88, var2);
            break L445;
          }
        }
        L446: {
          var2 = tj.a("achievement_criteria,13", -79);
          if (null == var2) {
            break L446;
          } else {
            af.field_Bb[13] = sc.a((byte) 106, var2);
            break L446;
          }
        }
        L447: {
          var2 = tj.a("achievement_criteria,14", param1 + -125);
          if (null != var2) {
            af.field_Bb[14] = sc.a((byte) 97, var2);
            break L447;
          } else {
            break L447;
          }
        }
        L448: {
          var2 = tj.a("achievement_criteria,15", param1 ^ -119);
          if (null != var2) {
            af.field_Bb[15] = sc.a((byte) 109, var2);
            break L448;
          } else {
            break L448;
          }
        }
        L449: {
          var2 = tj.a("achievement_criteria,16", param1 + -130);
          if (var2 == null) {
            break L449;
          } else {
            af.field_Bb[16] = sc.a((byte) 102, var2);
            break L449;
          }
        }
        L450: {
          var2 = tj.a("achievement_criteria,17", -73);
          if (var2 == null) {
            break L450;
          } else {
            af.field_Bb[17] = sc.a((byte) 124, var2);
            break L450;
          }
        }
        L451: {
          var2 = tj.a("achievement_criteria,18", -101);
          if (var2 == null) {
            break L451;
          } else {
            af.field_Bb[18] = sc.a((byte) 113, var2);
            break L451;
          }
        }
        L452: {
          var2 = tj.a("achievement_criteria,19", -97);
          if (null != var2) {
            af.field_Bb[19] = sc.a((byte) 103, var2);
            break L452;
          } else {
            break L452;
          }
        }
        L453: {
          var2 = tj.a("achievement_criteria,20", -101);
          if (var2 != null) {
            af.field_Bb[20] = sc.a((byte) 101, var2);
            break L453;
          } else {
            break L453;
          }
        }
        L454: {
          var2 = tj.a("achievement_criteria,21", -106);
          if (var2 != null) {
            af.field_Bb[21] = sc.a((byte) 92, var2);
            break L454;
          } else {
            break L454;
          }
        }
        L455: {
          var2 = tj.a("achievement_criteria,22", param1 + -126);
          if (var2 == null) {
            break L455;
          } else {
            af.field_Bb[22] = sc.a((byte) 106, var2);
            break L455;
          }
        }
        L456: {
          var2 = tj.a("achievement_criteria,23", -124);
          if (null == var2) {
            break L456;
          } else {
            af.field_Bb[23] = sc.a((byte) 90, var2);
            break L456;
          }
        }
        L457: {
          var2 = tj.a("achievement_criteria,24", -125);
          if (null == var2) {
            break L457;
          } else {
            af.field_Bb[24] = sc.a((byte) 124, var2);
            break L457;
          }
        }
        L458: {
          var2 = tj.a("achievement_criteria,25", -103);
          if (null != var2) {
            af.field_Bb[25] = sc.a((byte) 98, var2);
            break L458;
          } else {
            break L458;
          }
        }
        L459: {
          var2 = tj.a("achievement_criteria,26", param1 + -97);
          if (null == var2) {
            break L459;
          } else {
            af.field_Bb[26] = sc.a((byte) 112, var2);
            break L459;
          }
        }
        L460: {
          var2 = tj.a("achievement_criteria,27", -110);
          if (var2 == null) {
            break L460;
          } else {
            af.field_Bb[27] = sc.a((byte) 124, var2);
            break L460;
          }
        }
        L461: {
          var2 = tj.a("achievement_criteria,28", -75);
          if (var2 != null) {
            af.field_Bb[28] = sc.a((byte) 121, var2);
            break L461;
          } else {
            break L461;
          }
        }
        L462: {
          var2 = tj.a("achievement_criteria,29", -100);
          if (null != var2) {
            af.field_Bb[29] = sc.a((byte) 116, var2);
            break L462;
          } else {
            break L462;
          }
        }
        L463: {
          var2 = tj.a("achievement_criteria,30", -94);
          if (var2 == null) {
            break L463;
          } else {
            af.field_Bb[30] = sc.a((byte) 109, var2);
            break L463;
          }
        }
        L464: {
          var2 = tj.a("achievement_criteria,31", -108);
          if (var2 == null) {
            break L464;
          } else {
            af.field_Bb[31] = sc.a((byte) 89, var2);
            break L464;
          }
        }
        L465: {
          var2 = tj.a("achievement_criteria,32", -85);
          if (var2 == null) {
            break L465;
          } else {
            af.field_Bb[32] = sc.a((byte) 114, var2);
            break L465;
          }
        }
        L466: {
          var2 = tj.a("achievement_criteria,33", -122);
          if (null == var2) {
            break L466;
          } else {
            af.field_Bb[33] = sc.a((byte) 114, var2);
            break L466;
          }
        }
        L467: {
          var2 = tj.a("achievement_criteria,34", -88);
          if (null == var2) {
            break L467;
          } else {
            af.field_Bb[34] = sc.a((byte) 106, var2);
            break L467;
          }
        }
        L468: {
          var2 = tj.a("achievement_criteria,35", param1 ^ -115);
          if (var2 != null) {
            af.field_Bb[35] = sc.a((byte) 120, var2);
            break L468;
          } else {
            break L468;
          }
        }
        L469: {
          var2 = tj.a("achievement_criteria,36", -122);
          if (null == var2) {
            break L469;
          } else {
            af.field_Bb[36] = sc.a((byte) 101, var2);
            break L469;
          }
        }
        L470: {
          var2 = tj.a("achievement_criteria,37", -88);
          if (null != var2) {
            af.field_Bb[37] = sc.a((byte) 117, var2);
            break L470;
          } else {
            break L470;
          }
        }
        L471: {
          var2 = tj.a("achievement_criteria,38", -81);
          if (null == var2) {
            break L471;
          } else {
            af.field_Bb[38] = sc.a((byte) 103, var2);
            break L471;
          }
        }
        L472: {
          var2 = tj.a("achievement_criteria,39", -97);
          if (var2 == null) {
            break L472;
          } else {
            af.field_Bb[39] = sc.a((byte) 122, var2);
            break L472;
          }
        }
        L473: {
          var2 = tj.a("achievement_criteria,40", param1 ^ -71);
          if (var2 == null) {
            break L473;
          } else {
            af.field_Bb[40] = sc.a((byte) 113, var2);
            break L473;
          }
        }
        L474: {
          var2 = tj.a("achievement_criteria,41", -121);
          if (var2 == null) {
            break L474;
          } else {
            af.field_Bb[41] = sc.a((byte) 105, var2);
            break L474;
          }
        }
        L475: {
          var2 = tj.a("achievement_criteria,42", -86);
          if (null != var2) {
            af.field_Bb[42] = sc.a((byte) 89, var2);
            break L475;
          } else {
            break L475;
          }
        }
        L476: {
          var2 = tj.a("achievement_criteria,43", -79);
          if (var2 != null) {
            af.field_Bb[43] = sc.a((byte) 98, var2);
            break L476;
          } else {
            break L476;
          }
        }
        L477: {
          var2 = tj.a("achievement_criteria,44", -96);
          if (var2 != null) {
            af.field_Bb[44] = sc.a((byte) 123, var2);
            break L477;
          } else {
            break L477;
          }
        }
        L478: {
          var2 = tj.a("achievement_criteria,45", -115);
          if (null != var2) {
            af.field_Bb[45] = sc.a((byte) 115, var2);
            break L478;
          } else {
            break L478;
          }
        }
        L479: {
          var2 = tj.a("achievement_criteria,46", param1 + -144);
          if (var2 != null) {
            af.field_Bb[46] = sc.a((byte) 114, var2);
            break L479;
          } else {
            break L479;
          }
        }
        L480: {
          var2 = tj.a("achievement_criteria,47", -80);
          if (null == var2) {
            break L480;
          } else {
            af.field_Bb[47] = sc.a((byte) 110, var2);
            break L480;
          }
        }
        L481: {
          var2 = tj.a("achievement_criteria,48", param1 ^ -107);
          if (var2 == null) {
            break L481;
          } else {
            af.field_Bb[48] = sc.a((byte) 126, var2);
            break L481;
          }
        }
        L482: {
          var2 = tj.a("achievement_criteria,49", -118);
          if (var2 == null) {
            break L482;
          } else {
            af.field_Bb[49] = sc.a((byte) 88, var2);
            break L482;
          }
        }
        L483: {
          var2 = tj.a("achievement_criteria,50", -115);
          if (var2 != null) {
            af.field_Bb[50] = sc.a((byte) 127, var2);
            break L483;
          } else {
            break L483;
          }
        }
        L484: {
          var2 = tj.a("achievement_criteria,51", -86);
          if (var2 == null) {
            break L484;
          } else {
            af.field_Bb[51] = sc.a((byte) 86, var2);
            break L484;
          }
        }
        L485: {
          var2 = tj.a("achievement_criteria,52", -71);
          if (var2 == null) {
            break L485;
          } else {
            af.field_Bb[52] = sc.a((byte) 96, var2);
            break L485;
          }
        }
        L486: {
          var2 = tj.a("achievement_criteria,53", -96);
          if (var2 == null) {
            break L486;
          } else {
            af.field_Bb[53] = sc.a((byte) 98, var2);
            break L486;
          }
        }
        L487: {
          var2 = tj.a("achievement_criteria,54", param1 ^ -123);
          if (null == var2) {
            break L487;
          } else {
            af.field_Bb[54] = sc.a((byte) 92, var2);
            break L487;
          }
        }
        L488: {
          var2 = tj.a("achievement_criteria,55", -83);
          if (var2 != null) {
            af.field_Bb[55] = sc.a((byte) 98, var2);
            break L488;
          } else {
            break L488;
          }
        }
        L489: {
          var2 = tj.a("achievement_criteria,56", param1 ^ -111);
          if (null == var2) {
            break L489;
          } else {
            af.field_Bb[56] = sc.a((byte) 125, var2);
            break L489;
          }
        }
        L490: {
          var2 = tj.a("achievement_criteria,57", -103);
          if (var2 != null) {
            af.field_Bb[57] = sc.a((byte) 109, var2);
            break L490;
          } else {
            break L490;
          }
        }
        L491: {
          var2 = tj.a("achievement_criteria,58", -120);
          if (var2 == null) {
            break L491;
          } else {
            af.field_Bb[58] = sc.a((byte) 110, var2);
            break L491;
          }
        }
        L492: {
          var2 = tj.a("achievement_criteria,59", -103);
          if (var2 == null) {
            break L492;
          } else {
            af.field_Bb[59] = sc.a((byte) 98, var2);
            break L492;
          }
        }
        L493: {
          var2 = tj.a("achievement_criteria,60", param1 ^ -90);
          if (var2 == null) {
            break L493;
          } else {
            af.field_Bb[60] = sc.a((byte) 118, var2);
            break L493;
          }
        }
        L494: {
          var2 = tj.a("achievement_criteria,61", -91);
          if (var2 != null) {
            af.field_Bb[61] = sc.a((byte) 108, var2);
            break L494;
          } else {
            break L494;
          }
        }
        L495: {
          var2 = tj.a("achievement_criteria,62", -110);
          if (null != var2) {
            af.field_Bb[62] = sc.a((byte) 125, var2);
            break L495;
          } else {
            break L495;
          }
        }
        L496: {
          var2 = tj.a("achievement_criteria,63", -76);
          if (var2 == null) {
            break L496;
          } else {
            af.field_Bb[63] = sc.a((byte) 127, var2);
            break L496;
          }
        }
        L497: {
          var2 = tj.a("achievement_criteria,64", -127);
          if (null == var2) {
            break L497;
          } else {
            af.field_Bb[64] = sc.a((byte) 122, var2);
            break L497;
          }
        }
        L498: {
          var2 = tj.a("achievement_criteria,65", -108);
          if (null == var2) {
            break L498;
          } else {
            af.field_Bb[65] = sc.a((byte) 124, var2);
            break L498;
          }
        }
        L499: {
          var2 = tj.a("achievement_criteria,66", -96);
          if (null != var2) {
            af.field_Bb[66] = sc.a((byte) 86, var2);
            break L499;
          } else {
            break L499;
          }
        }
        L500: {
          var2 = tj.a("achievement_criteria,67", param1 ^ -105);
          if (null != var2) {
            af.field_Bb[67] = sc.a((byte) 115, var2);
            break L500;
          } else {
            break L500;
          }
        }
        L501: {
          var2 = tj.a("achievement_criteria,68", -115);
          if (var2 != null) {
            af.field_Bb[68] = sc.a((byte) 99, var2);
            break L501;
          } else {
            break L501;
          }
        }
        L502: {
          var2 = tj.a("achievement_criteria,69", -72);
          if (var2 == null) {
            break L502;
          } else {
            af.field_Bb[69] = sc.a((byte) 89, var2);
            break L502;
          }
        }
        L503: {
          var2 = tj.a("achievement_criteria,70", -97);
          if (var2 != null) {
            af.field_Bb[70] = sc.a((byte) 99, var2);
            break L503;
          } else {
            break L503;
          }
        }
        L504: {
          var2 = tj.a("achievement_criteria,71", -121);
          if (null != var2) {
            af.field_Bb[71] = sc.a((byte) 119, var2);
            break L504;
          } else {
            break L504;
          }
        }
        L505: {
          var2 = tj.a("achievement_criteria,72", -114);
          if (var2 == null) {
            break L505;
          } else {
            af.field_Bb[72] = sc.a((byte) 99, var2);
            break L505;
          }
        }
        L506: {
          var2 = tj.a("achievement_criteria,73", -94);
          if (var2 != null) {
            af.field_Bb[73] = sc.a((byte) 105, var2);
            break L506;
          } else {
            break L506;
          }
        }
        L507: {
          var2 = tj.a("achievement_criteria,74", -98);
          if (var2 == null) {
            break L507;
          } else {
            af.field_Bb[74] = sc.a((byte) 118, var2);
            break L507;
          }
        }
        L508: {
          var2 = tj.a("achievement_criteria,75", param1 + -110);
          if (var2 != null) {
            af.field_Bb[75] = sc.a((byte) 91, var2);
            break L508;
          } else {
            break L508;
          }
        }
        L509: {
          var2 = tj.a("achievement_criteria,76", -89);
          if (var2 != null) {
            af.field_Bb[76] = sc.a((byte) 89, var2);
            break L509;
          } else {
            break L509;
          }
        }
        L510: {
          var2 = tj.a("achievement_criteria,77", -126);
          if (var2 == null) {
            break L510;
          } else {
            af.field_Bb[77] = sc.a((byte) 126, var2);
            break L510;
          }
        }
        L511: {
          var2 = tj.a("achievement_criteria,78", param1 + -124);
          if (null != var2) {
            af.field_Bb[78] = sc.a((byte) 110, var2);
            break L511;
          } else {
            break L511;
          }
        }
        L512: {
          var2 = tj.a("achievement_criteria,79", -75);
          if (null != var2) {
            af.field_Bb[79] = sc.a((byte) 108, var2);
            break L512;
          } else {
            break L512;
          }
        }
        L513: {
          var2 = tj.a("achievement_criteria,80", -100);
          if (var2 != null) {
            af.field_Bb[80] = sc.a((byte) 119, var2);
            break L513;
          } else {
            break L513;
          }
        }
        L514: {
          var2 = tj.a("achievement_criteria,81", param1 ^ -81);
          if (var2 != null) {
            af.field_Bb[81] = sc.a((byte) 96, var2);
            break L514;
          } else {
            break L514;
          }
        }
        L515: {
          var2 = tj.a("achievement_criteria,82", -92);
          if (var2 == null) {
            break L515;
          } else {
            af.field_Bb[82] = sc.a((byte) 121, var2);
            break L515;
          }
        }
        L516: {
          var2 = tj.a("achievement_criteria,83", -105);
          if (null != var2) {
            af.field_Bb[83] = sc.a((byte) 88, var2);
            break L516;
          } else {
            break L516;
          }
        }
        L517: {
          var2 = tj.a("achievement_criteria,84", -111);
          if (null != var2) {
            af.field_Bb[84] = sc.a((byte) 122, var2);
            break L517;
          } else {
            break L517;
          }
        }
        L518: {
          var2 = tj.a("achievement_criteria,85", -79);
          if (null == var2) {
            break L518;
          } else {
            af.field_Bb[85] = sc.a((byte) 119, var2);
            break L518;
          }
        }
        L519: {
          var2 = tj.a("achievement_criteria,86", -124);
          if (null == var2) {
            break L519;
          } else {
            af.field_Bb[86] = sc.a((byte) 126, var2);
            break L519;
          }
        }
        L520: {
          var2 = tj.a("achievement_criteria,87", param1 + -137);
          if (null == var2) {
            break L520;
          } else {
            af.field_Bb[87] = sc.a((byte) 127, var2);
            break L520;
          }
        }
        L521: {
          var2 = tj.a("achievement_criteria,88", -119);
          if (var2 != null) {
            af.field_Bb[88] = sc.a((byte) 115, var2);
            break L521;
          } else {
            break L521;
          }
        }
        L522: {
          var2 = tj.a("achievement_criteria,89", param1 + -126);
          if (null != var2) {
            af.field_Bb[89] = sc.a((byte) 126, var2);
            break L522;
          } else {
            break L522;
          }
        }
        L523: {
          var2 = tj.a("achievement_criteria,90", -122);
          if (null == var2) {
            break L523;
          } else {
            af.field_Bb[90] = sc.a((byte) 115, var2);
            break L523;
          }
        }
        L524: {
          var2 = tj.a("achievement_criteria,91", param1 ^ -125);
          if (var2 != null) {
            af.field_Bb[91] = sc.a((byte) 91, var2);
            break L524;
          } else {
            break L524;
          }
        }
        L525: {
          var2 = tj.a("achievement_criteria,92", -122);
          if (null != var2) {
            af.field_Bb[92] = sc.a((byte) 91, var2);
            break L525;
          } else {
            break L525;
          }
        }
        L526: {
          var2 = tj.a("achievement_criteria,93", -81);
          if (var2 == null) {
            break L526;
          } else {
            af.field_Bb[93] = sc.a((byte) 120, var2);
            break L526;
          }
        }
        L527: {
          var2 = tj.a("achievement_criteria,94", -90);
          if (var2 != null) {
            af.field_Bb[94] = sc.a((byte) 107, var2);
            break L527;
          } else {
            break L527;
          }
        }
        L528: {
          var2 = tj.a("keycode_walkleft1", -72);
          if (null == var2) {
            break L528;
          } else {
            ig.field_g = var2[0] & 255;
            break L528;
          }
        }
        L529: {
          var2 = tj.a("keycode_walkright1", -72);
          if (var2 != null) {
            im.field_g = var2[0] & 255;
            break L529;
          } else {
            break L529;
          }
        }
        L530: {
          var2 = tj.a("keycode_walkleft2", -123);
          if (null != var2) {
            ko.field_k = var2[0] & 255;
            break L530;
          } else {
            break L530;
          }
        }
        L531: {
          var2 = tj.a("keycode_walkright2", -100);
          if (null == var2) {
            break L531;
          } else {
            ud.field_w = 255 & var2[0];
            break L531;
          }
        }
        L532: {
          var2 = tj.a("keycode_scrollup", -102);
          if (var2 != null) {
            fi.field_e = 255 & var2[0];
            break L532;
          } else {
            break L532;
          }
        }
        L533: {
          var2 = tj.a("keycode_scrolldown", -93);
          if (null == var2) {
            break L533;
          } else {
            cm.field_j = 255 & var2[0];
            break L533;
          }
        }
        L534: {
          var2 = tj.a("keycode_scrollleft", param1 + -119);
          if (var2 == null) {
            break L534;
          } else {
            p.field_a = var2[0] & 255;
            break L534;
          }
        }
        L535: {
          var2 = tj.a("keycode_scrollright", -105);
          if (null == var2) {
            break L535;
          } else {
            qo.field_b = 255 & var2[0];
            break L535;
          }
        }
        L536: {
          var2 = tj.a("keycode_q", -96);
          if (var2 != null) {
            bg.field_c = var2[0] & 255;
            break L536;
          } else {
            break L536;
          }
        }
        L537: {
          var2 = tj.a("keycode_c", param1 ^ -104);
          if (null == var2) {
            break L537;
          } else {
            ao.field_f = 255 & var2[0];
            break L537;
          }
        }
        L538: {
          var2 = tj.a("text_login_or_discard", -86);
          if (var2 == null) {
            break L538;
          } else {
            String discarded$4 = sc.a((byte) 90, var2);
            break L538;
          }
        }
        L539: {
          var2 = tj.a("charcreate", -110);
          if (var2 == null) {
            break L539;
          } else {
            ie.field_Lb = sc.a((byte) 124, var2);
            break L539;
          }
        }
        L540: {
          var2 = tj.a("spelselect", -82);
          if (null != var2) {
            ji.field_l = sc.a((byte) 104, var2);
            break L540;
          } else {
            break L540;
          }
        }
        L541: {
          var2 = tj.a("multiplayer", -101);
          if (null != var2) {
            ol.field_a = sc.a((byte) 117, var2);
            break L541;
          } else {
            break L541;
          }
        }
        L542: {
          var2 = tj.a("text_randomize", -72);
          if (var2 != null) {
            nj.field_l = sc.a((byte) 93, var2);
            break L542;
          } else {
            break L542;
          }
        }
        L543: {
          var2 = tj.a("text_offeringrematch", -113);
          if (var2 != null) {
            hf.field_b = sc.a((byte) 114, var2);
            break L543;
          } else {
            break L543;
          }
        }
        L544: {
          var2 = tj.a("text_waiting", -72);
          if (null != var2) {
            lc.field_r = sc.a((byte) 95, var2);
            break L544;
          } else {
            break L544;
          }
        }
        L545: {
          var2 = tj.a("text_declined", -104);
          if (var2 == null) {
            break L545;
          } else {
            ea.field_I = sc.a((byte) 96, var2);
            break L545;
          }
        }
        L546: {
          var2 = tj.a("gameoptlabels,0", -125);
          if (null == var2) {
            break L546;
          } else {
            aj.field_a[0] = sc.a((byte) 101, var2);
            break L546;
          }
        }
        L547: {
          var2 = tj.a("gameoptlabels,1", -75);
          if (var2 == null) {
            break L547;
          } else {
            aj.field_a[1] = sc.a((byte) 97, var2);
            break L547;
          }
        }
        L548: {
          var2 = tj.a("gameoptlabels,2", -110);
          if (null != var2) {
            aj.field_a[2] = sc.a((byte) 123, var2);
            break L548;
          } else {
            break L548;
          }
        }
        L549: {
          var2 = tj.a("gameopt_buttonnames,0,0", -75);
          if (null == var2) {
            break L549;
          } else {
            rm.field_l[0][0] = sc.a((byte) 89, var2);
            break L549;
          }
        }
        L550: {
          var2 = tj.a("gameopt_buttonnames,0,1", -127);
          if (null == var2) {
            break L550;
          } else {
            rm.field_l[0][1] = sc.a((byte) 106, var2);
            break L550;
          }
        }
        L551: {
          var2 = tj.a("gameopt_buttonnames,0,2", param1 + -142);
          if (null != var2) {
            rm.field_l[0][2] = sc.a((byte) 107, var2);
            break L551;
          } else {
            break L551;
          }
        }
        L552: {
          var2 = tj.a("gameopt_buttonnames,0,3", -72);
          if (null != var2) {
            rm.field_l[0][3] = sc.a((byte) 105, var2);
            break L552;
          } else {
            break L552;
          }
        }
        L553: {
          var2 = tj.a("gameopt_buttonnames,0,4", -99);
          if (null == var2) {
            break L553;
          } else {
            rm.field_l[0][4] = sc.a((byte) 93, var2);
            break L553;
          }
        }
        L554: {
          var2 = tj.a("gameopt_buttonnames,0,5", param1 + -112);
          if (null == var2) {
            break L554;
          } else {
            rm.field_l[0][5] = sc.a((byte) 95, var2);
            break L554;
          }
        }
        L555: {
          var2 = tj.a("gameopt_buttonnames,0,6", -92);
          if (var2 != null) {
            rm.field_l[0][6] = sc.a((byte) 94, var2);
            break L555;
          } else {
            break L555;
          }
        }
        L556: {
          var2 = tj.a("gameopt_buttonnames,2,0", -83);
          if (null == var2) {
            break L556;
          } else {
            rm.field_l[2][0] = sc.a((byte) 94, var2);
            break L556;
          }
        }
        L557: {
          var2 = tj.a("gameopt_buttonnames,2,1", -121);
          if (var2 == null) {
            break L557;
          } else {
            rm.field_l[2][1] = sc.a((byte) 102, var2);
            break L557;
          }
        }
        L558: {
          var2 = tj.a("gameopt_tooltipnames,0,0", param1 + -92);
          if (var2 != null) {
            jh.field_d[0][0] = sc.a((byte) 91, var2);
            break L558;
          } else {
            break L558;
          }
        }
        L559: {
          var2 = tj.a("gameopt_tooltipnames,0,1", param1 ^ -123);
          if (null == var2) {
            break L559;
          } else {
            jh.field_d[0][1] = sc.a((byte) 111, var2);
            break L559;
          }
        }
        L560: {
          var2 = tj.a("gameopt_tooltipnames,0,2", -114);
          if (var2 != null) {
            jh.field_d[0][2] = sc.a((byte) 101, var2);
            break L560;
          } else {
            break L560;
          }
        }
        L561: {
          var2 = tj.a("gameopt_tooltipnames,0,3", param1 + -140);
          if (null == var2) {
            break L561;
          } else {
            jh.field_d[0][3] = sc.a((byte) 102, var2);
            break L561;
          }
        }
        L562: {
          var2 = tj.a("gameopt_tooltipnames,0,4", -73);
          if (var2 != null) {
            jh.field_d[0][4] = sc.a((byte) 103, var2);
            break L562;
          } else {
            break L562;
          }
        }
        L563: {
          var2 = tj.a("gameopt_tooltipnames,0,5", -119);
          if (null != var2) {
            jh.field_d[0][5] = sc.a((byte) 118, var2);
            break L563;
          } else {
            break L563;
          }
        }
        L564: {
          var2 = tj.a("gameopt_tooltipnames,0,6", -127);
          if (null != var2) {
            jh.field_d[0][6] = sc.a((byte) 117, var2);
            break L564;
          } else {
            break L564;
          }
        }
        L565: {
          var2 = tj.a("gameopt_tooltipnames,1,0", param1 ^ -84);
          if (null == var2) {
            break L565;
          } else {
            jh.field_d[1][0] = sc.a((byte) 115, var2);
            break L565;
          }
        }
        L566: {
          var2 = tj.a("gameopt_tooltipnames,1,1", -95);
          if (var2 != null) {
            jh.field_d[1][1] = sc.a((byte) 90, var2);
            break L566;
          } else {
            break L566;
          }
        }
        L567: {
          var2 = tj.a("gameopt_tooltipnames,1,2", -90);
          if (var2 != null) {
            jh.field_d[1][2] = sc.a((byte) 86, var2);
            break L567;
          } else {
            break L567;
          }
        }
        L568: {
          var2 = tj.a("gameopt_tooltipnames,1,3", -78);
          if (null == var2) {
            break L568;
          } else {
            jh.field_d[1][3] = sc.a((byte) 108, var2);
            break L568;
          }
        }
        L569: {
          var2 = tj.a("gameopt_tooltipnames,1,4", param1 ^ -71);
          if (var2 != null) {
            jh.field_d[1][4] = sc.a((byte) 116, var2);
            break L569;
          } else {
            break L569;
          }
        }
        L570: {
          var2 = tj.a("gameopt_tooltipnames,1,5", -105);
          if (null == var2) {
            break L570;
          } else {
            jh.field_d[1][5] = sc.a((byte) 121, var2);
            break L570;
          }
        }
        L571: {
          var2 = tj.a("gameopt_tooltipnames,1,6", param1 + -132);
          if (null != var2) {
            jh.field_d[1][6] = sc.a((byte) 105, var2);
            break L571;
          } else {
            break L571;
          }
        }
        L572: {
          var2 = tj.a("gameopt_tooltipnames,1,7", -76);
          if (null == var2) {
            break L572;
          } else {
            jh.field_d[1][7] = sc.a((byte) 107, var2);
            break L572;
          }
        }
        L573: {
          var2 = tj.a("gameopt_tooltipnames,1,8", -115);
          if (null != var2) {
            jh.field_d[1][8] = sc.a((byte) 122, var2);
            break L573;
          } else {
            break L573;
          }
        }
        L574: {
          var2 = tj.a("gameopt_tooltipnames,1,9", -86);
          if (var2 == null) {
            break L574;
          } else {
            jh.field_d[1][9] = sc.a((byte) 107, var2);
            break L574;
          }
        }
        L575: {
          var2 = tj.a("gameopt_tooltipnames,2,0", -86);
          if (null != var2) {
            jh.field_d[2][0] = sc.a((byte) 87, var2);
            break L575;
          } else {
            break L575;
          }
        }
        L576: {
          var2 = tj.a("gameopt_tooltipnames,2,1", -80);
          if (var2 == null) {
            break L576;
          } else {
            jh.field_d[2][1] = sc.a((byte) 127, var2);
            break L576;
          }
        }
        L577: {
          var2 = tj.a("instructions_pages,0", param1 ^ -121);
          if (null == var2) {
            break L577;
          } else {
            gd.field_kb[0] = sc.a((byte) 117, var2);
            break L577;
          }
        }
        L578: {
          var2 = tj.a("instructions_pages,1", -99);
          if (null != var2) {
            gd.field_kb[1] = sc.a((byte) 93, var2);
            break L578;
          } else {
            break L578;
          }
        }
        L579: {
          var2 = tj.a("instructions_pages,2", -71);
          if (null != var2) {
            gd.field_kb[2] = sc.a((byte) 121, var2);
            break L579;
          } else {
            break L579;
          }
        }
        L580: {
          var2 = tj.a("instructions_pages,3", param1 + -146);
          if (null == var2) {
            break L580;
          } else {
            gd.field_kb[3] = sc.a((byte) 109, var2);
            break L580;
          }
        }
        L581: {
          var2 = tj.a("instructions_pages,4", -113);
          if (null == var2) {
            break L581;
          } else {
            gd.field_kb[4] = sc.a((byte) 93, var2);
            break L581;
          }
        }
        L582: {
          var2 = tj.a("instructions_pages,5", param1 ^ -124);
          if (var2 == null) {
            break L582;
          } else {
            gd.field_kb[5] = sc.a((byte) 125, var2);
            break L582;
          }
        }
        L583: {
          var2 = tj.a("instructions_pages,6", -107);
          if (null == var2) {
            break L583;
          } else {
            gd.field_kb[6] = sc.a((byte) 87, var2);
            break L583;
          }
        }
        L584: {
          var2 = tj.a("instructions_pages,7", param1 ^ -114);
          if (var2 == null) {
            break L584;
          } else {
            gd.field_kb[7] = sc.a((byte) 106, var2);
            break L584;
          }
        }
        L585: {
          var2 = tj.a("instructions_pages,8", -79);
          if (null != var2) {
            gd.field_kb[8] = sc.a((byte) 125, var2);
            break L585;
          } else {
            break L585;
          }
        }
        L586: {
          var2 = tj.a("instructions_pages,9", -96);
          if (var2 == null) {
            break L586;
          } else {
            gd.field_kb[9] = sc.a((byte) 86, var2);
            break L586;
          }
        }
        L587: {
          var2 = tj.a("instructions_pages,10", -76);
          if (var2 == null) {
            break L587;
          } else {
            gd.field_kb[10] = sc.a((byte) 103, var2);
            break L587;
          }
        }
        L588: {
          var2 = tj.a("instructions_pages,11", param1 ^ -101);
          if (var2 == null) {
            break L588;
          } else {
            gd.field_kb[11] = sc.a((byte) 110, var2);
            break L588;
          }
        }
        L589: {
          var2 = tj.a("instructions_pages,12", -121);
          if (var2 != null) {
            gd.field_kb[12] = sc.a((byte) 122, var2);
            break L589;
          } else {
            break L589;
          }
        }
        L590: {
          var2 = tj.a("yourname", param1 ^ -76);
          if (null != var2) {
            k.field_p = sc.a((byte) 107, var2);
            break L590;
          } else {
            break L590;
          }
        }
        L591: {
          var2 = tj.a("castingspace", param1 + -97);
          if (var2 != null) {
            li.field_I = sc.a((byte) 90, var2);
            break L591;
          } else {
            break L591;
          }
        }
        L592: {
          var2 = tj.a("spellbook_membersonly", -73);
          if (null != var2) {
            qe.field_r = sc.a((byte) 107, var2);
            break L592;
          } else {
            break L592;
          }
        }
        L593: {
          var2 = tj.a("rated_membersonly", -127);
          if (var2 == null) {
            break L593;
          } else {
            dg.field_t = sc.a((byte) 118, var2);
            break L593;
          }
        }
        L594: {
          var2 = tj.a("wands_membersonly", -101);
          if (var2 != null) {
            tk.field_o = sc.a((byte) 91, var2);
            break L594;
          } else {
            break L594;
          }
        }
        L595: {
          var2 = tj.a("youhavenoplatipusesavailaible", param1 ^ -113);
          if (null == var2) {
            break L595;
          } else {
            aa.field_j = sc.a((byte) 114, var2);
            break L595;
          }
        }
        L596: {
          var2 = tj.a("playratedgamesgoshdarnit", -109);
          if (null != var2) {
            rl.field_i = sc.a((byte) 94, var2);
            break L596;
          } else {
            break L596;
          }
        }
        L597: {
          var2 = tj.a("wandsavail", -87);
          if (var2 != null) {
            ug.field_l = sc.a((byte) 89, var2);
            break L597;
          } else {
            break L597;
          }
        }
        L598: {
          var2 = tj.a("playmoregames", -115);
          if (null == var2) {
            break L598;
          } else {
            ic.field_b = sc.a((byte) 124, var2);
            break L598;
          }
        }
        L599: {
          var2 = tj.a("nowands", param1 ^ -104);
          if (null != var2) {
            jl.field_l = sc.a((byte) 109, var2);
            break L599;
          } else {
            break L599;
          }
        }
        L600: {
          var2 = tj.a("wandsspace", -80);
          if (var2 != null) {
            mh.field_I = sc.a((byte) 97, var2);
            break L600;
          } else {
            break L600;
          }
        }
        L601: {
          var2 = tj.a("timetickingdown", -113);
          if (null == var2) {
            break L601;
          } else {
            im.field_i = sc.a((byte) 119, var2);
            break L601;
          }
        }
        L602: {
          var2 = tj.a("dsc7", -98);
          if (var2 == null) {
            break L602;
          } else {
            kj.field_d = sc.a((byte) 126, var2);
            break L602;
          }
        }
        L603: {
          var2 = tj.a("tit7", -114);
          if (null != var2) {
            bm.field_c = sc.a((byte) 105, var2);
            break L603;
          } else {
            break L603;
          }
        }
        L604: {
          var2 = tj.a("dsc6", -124);
          if (null != var2) {
            na.field_lc = sc.a((byte) 86, var2);
            break L604;
          } else {
            break L604;
          }
        }
        L605: {
          var2 = tj.a("tit6", param1 ^ -93);
          if (var2 == null) {
            break L605;
          } else {
            gn.field_j = sc.a((byte) 125, var2);
            break L605;
          }
        }
        L606: {
          var2 = tj.a("dsc5", -113);
          if (var2 != null) {
            bj.field_pb = sc.a((byte) 125, var2);
            break L606;
          } else {
            break L606;
          }
        }
        L607: {
          var2 = tj.a("tit5", -121);
          if (null == var2) {
            break L607;
          } else {
            ih.field_a = sc.a((byte) 110, var2);
            break L607;
          }
        }
        L608: {
          var2 = tj.a("dsc4", param1 + -117);
          if (var2 != null) {
            lm.field_h = sc.a((byte) 94, var2);
            break L608;
          } else {
            break L608;
          }
        }
        L609: {
          var2 = tj.a("tit4", -90);
          if (null == var2) {
            break L609;
          } else {
            gj.field_b = sc.a((byte) 118, var2);
            break L609;
          }
        }
        L610: {
          var2 = tj.a("dsc3", -70);
          if (null != var2) {
            gi.field_h = sc.a((byte) 99, var2);
            break L610;
          } else {
            break L610;
          }
        }
        L611: {
          var2 = tj.a("tit3", param1 + -94);
          if (null == var2) {
            break L611;
          } else {
            hn.field_c = sc.a((byte) 111, var2);
            break L611;
          }
        }
        L612: {
          var2 = tj.a("dsc2", -109);
          if (null != var2) {
            pc.field_f = sc.a((byte) 89, var2);
            break L612;
          } else {
            break L612;
          }
        }
        L613: {
          var2 = tj.a("tit2", param1 ^ -82);
          if (var2 == null) {
            break L613;
          } else {
            mg.field_F = sc.a((byte) 123, var2);
            break L613;
          }
        }
        L614: {
          var2 = tj.a("dsc1", -128);
          if (null == var2) {
            break L614;
          } else {
            gm.field_b = sc.a((byte) 126, var2);
            break L614;
          }
        }
        L615: {
          var2 = tj.a("tit1", param1 ^ -66);
          if (var2 != null) {
            rj.field_d = sc.a((byte) 96, var2);
            break L615;
          } else {
            break L615;
          }
        }
        L616: {
          var2 = tj.a("dsc0", -115);
          if (null != var2) {
            jo.field_d = sc.a((byte) 124, var2);
            break L616;
          } else {
            break L616;
          }
        }
        L617: {
          var2 = tj.a("tit0", -85);
          if (null != var2) {
            aj.field_f = sc.a((byte) 92, var2);
            break L617;
          } else {
            break L617;
          }
        }
        L618: {
          var2 = tj.a("clicktobuybook", -87);
          if (var2 != null) {
            ij.field_Ob = sc.a((byte) 97, var2);
            break L618;
          } else {
            break L618;
          }
        }
        L619: {
          var2 = tj.a("getmorewands", -115);
          if (null == var2) {
            break L619;
          } else {
            mb.field_R = sc.a((byte) 124, var2);
            break L619;
          }
        }
        L620: {
          var2 = tj.a("getmorewands_free", -76);
          if (var2 == null) {
            break L620;
          } else {
            nf.field_yb = sc.a((byte) 111, var2);
            break L620;
          }
        }
        L621: {
          var2 = tj.a("wandstobuy5", param1 + -95);
          if (var2 != null) {
            aj.field_b = sc.a((byte) 92, var2);
            break L621;
          } else {
            break L621;
          }
        }
        L622: {
          var2 = tj.a("overdisc2", -117);
          if (var2 == null) {
            break L622;
          } else {
            wd.field_k = sc.a((byte) 108, var2);
            break L622;
          }
        }
        L623: {
          var2 = tj.a("underdisc2", -71);
          if (var2 == null) {
            break L623;
          } else {
            jk.field_v = sc.a((byte) 122, var2);
            break L623;
          }
        }
        L624: {
          var2 = tj.a("frostdisc2", -111);
          if (var2 == null) {
            break L624;
          } else {
            ie.field_Jb = sc.a((byte) 96, var2);
            break L624;
          }
        }
        L625: {
          var2 = tj.a("stormdisc2", -75);
          if (null != var2) {
            ec.field_h = sc.a((byte) 110, var2);
            break L625;
          } else {
            break L625;
          }
        }
        L626: {
          var2 = tj.a("stonedisc2", -119);
          if (var2 != null) {
            sb.field_d = sc.a((byte) 90, var2);
            break L626;
          } else {
            break L626;
          }
        }
        L627: {
          var2 = tj.a("naturedisc2", -84);
          if (var2 == null) {
            break L627;
          } else {
            dg.field_q = sc.a((byte) 107, var2);
            break L627;
          }
        }
        L628: {
          var2 = tj.a("oceandisc2", -104);
          if (null == var2) {
            break L628;
          } else {
            q.field_H = sc.a((byte) 121, var2);
            break L628;
          }
        }
        L629: {
          var2 = tj.a("level3locked", -124);
          if (null == var2) {
            break L629;
          } else {
            vl.field_k = sc.a((byte) 104, var2);
            break L629;
          }
        }
        L630: {
          var2 = tj.a("thisislevel2locked", -113);
          if (null != var2) {
            jf.field_f = sc.a((byte) 95, var2);
            break L630;
          } else {
            break L630;
          }
        }
        L631: {
          var2 = tj.a("overdisc", param1 + -120);
          if (null == var2) {
            break L631;
          } else {
            gi.field_f = sc.a((byte) 116, var2);
            break L631;
          }
        }
        L632: {
          var2 = tj.a("overbook", -104);
          if (null != var2) {
            ej.field_M = sc.a((byte) 86, var2);
            break L632;
          } else {
            break L632;
          }
        }
        L633: {
          var2 = tj.a("underidsc", -73);
          if (null != var2) {
            pk.field_g = sc.a((byte) 86, var2);
            break L633;
          } else {
            break L633;
          }
        }
        L634: {
          var2 = tj.a("underbook", param1 ^ -127);
          if (null == var2) {
            break L634;
          } else {
            ad.field_g = sc.a((byte) 92, var2);
            break L634;
          }
        }
        L635: {
          var2 = tj.a("frostdisc", -113);
          if (var2 != null) {
            tk.field_r = sc.a((byte) 103, var2);
            break L635;
          } else {
            break L635;
          }
        }
        L636: {
          var2 = tj.a("frostbook", -70);
          if (null == var2) {
            break L636;
          } else {
            fh.field_d = sc.a((byte) 126, var2);
            break L636;
          }
        }
        L637: {
          var2 = tj.a("stormdisc", -100);
          if (var2 != null) {
            hm.field_d = sc.a((byte) 88, var2);
            break L637;
          } else {
            break L637;
          }
        }
        L638: {
          var2 = tj.a("stormbook", -101);
          if (var2 != null) {
            df.field_x = sc.a((byte) 120, var2);
            break L638;
          } else {
            break L638;
          }
        }
        L639: {
          var2 = tj.a("stonedisc", -99);
          if (var2 == null) {
            break L639;
          } else {
            ri.field_d = sc.a((byte) 91, var2);
            break L639;
          }
        }
        L640: {
          var2 = tj.a("stonebook", param1 + -93);
          if (var2 == null) {
            break L640;
          } else {
            io.field_z = sc.a((byte) 97, var2);
            break L640;
          }
        }
        L641: {
          var2 = tj.a("flamedisc", -88);
          if (null != var2) {
            j.field_b = sc.a((byte) 114, var2);
            break L641;
          } else {
            break L641;
          }
        }
        L642: {
          var2 = tj.a("flamebook", -82);
          if (var2 == null) {
            break L642;
          } else {
            gd.field_qb = sc.a((byte) 101, var2);
            break L642;
          }
        }
        L643: {
          var2 = tj.a("arcanedisc", -82);
          if (null == var2) {
            break L643;
          } else {
            ld.field_k = sc.a((byte) 113, var2);
            break L643;
          }
        }
        L644: {
          var2 = tj.a("arcanebook", -98);
          if (null == var2) {
            break L644;
          } else {
            ee.field_c = sc.a((byte) 90, var2);
            break L644;
          }
        }
        L645: {
          var2 = tj.a("naturedisc", param1 ^ -124);
          if (null == var2) {
            break L645;
          } else {
            tk.field_w = sc.a((byte) 123, var2);
            break L645;
          }
        }
        L646: {
          if (param1 == 22) {
            break L646;
          } else {
            field_e = null;
            break L646;
          }
        }
        L647: {
          var2 = tj.a("naturebook", param1 + -93);
          if (null == var2) {
            break L647;
          } else {
            nf.field_e = sc.a((byte) 101, var2);
            break L647;
          }
        }
        L648: {
          var2 = tj.a("oceandisc", -93);
          if (null == var2) {
            break L648;
          } else {
            mi.field_s = sc.a((byte) 95, var2);
            break L648;
          }
        }
        L649: {
          var2 = tj.a("oceanbook", -92);
          if (null != var2) {
            oo.field_r = sc.a((byte) 117, var2);
            break L649;
          } else {
            break L649;
          }
        }
        L650: {
          var2 = tj.a("cogsdisc", param1 ^ -101);
          if (var2 == null) {
            break L650;
          } else {
            uk.field_f = sc.a((byte) 89, var2);
            break L650;
          }
        }
        L651: {
          var2 = tj.a("cogsbook", -107);
          if (var2 != null) {
            j.field_c = sc.a((byte) 102, var2);
            break L651;
          } else {
            break L651;
          }
        }
        L652: {
          var2 = tj.a("choosespellsmoredetail", -84);
          if (var2 != null) {
            tn.field_Ib = sc.a((byte) 94, var2);
            break L652;
          } else {
            break L652;
          }
        }
        L653: {
          var2 = tj.a("choosespells", -111);
          if (null != var2) {
            vl.field_l = sc.a((byte) 121, var2);
            break L653;
          } else {
            break L653;
          }
        }
        L654: {
          var2 = tj.a("buyfor3", -86);
          if (null != var2) {
            ej.field_P = sc.a((byte) 117, var2);
            break L654;
          } else {
            break L654;
          }
        }
        L655: {
          var2 = tj.a("buyfor2", -116);
          if (null != var2) {
            gi.field_l = sc.a((byte) 99, var2);
            break L655;
          } else {
            break L655;
          }
        }
        L656: {
          var2 = tj.a("notenoughwands", param1 + -137);
          if (null != var2) {
            jk.field_d = sc.a((byte) 104, var2);
            break L656;
          } else {
            break L656;
          }
        }
        L657: {
          var2 = tj.a("buyasmember", param1 ^ -107);
          if (var2 == null) {
            break L657;
          } else {
            gg.field_g = sc.a((byte) 88, var2);
            break L657;
          }
        }
        L658: {
          var2 = tj.a("spellbooknotpur", param1 + -94);
          if (null != var2) {
            ra.field_i = sc.a((byte) 90, var2);
            break L658;
          } else {
            break L658;
          }
        }
        L659: {
          var2 = tj.a("spellbooknotaquired", -118);
          if (var2 != null) {
            vf.field_h = sc.a((byte) 125, var2);
            break L659;
          } else {
            break L659;
          }
        }
        L660: {
          var2 = tj.a("chosesspells", -115);
          if (var2 == null) {
            break L660;
          } else {
            tc.field_F = sc.a((byte) 118, var2);
            break L660;
          }
        }
        L661: {
          var2 = tj.a("sort1", -74);
          if (null == var2) {
            break L661;
          } else {
            ij.field_Cb = sc.a((byte) 125, var2);
            break L661;
          }
        }
        L662: {
          var2 = tj.a("sort0", -96);
          if (var2 == null) {
            break L662;
          } else {
            me.field_N = sc.a((byte) 112, var2);
            break L662;
          }
        }
        L663: {
          var2 = tj.a("waitingforawards", -99);
          if (var2 == null) {
            break L663;
          } else {
            nj.field_b = sc.a((byte) 117, var2);
            break L663;
          }
        }
        L664: {
          var2 = tj.a("mostbounce", -76);
          if (var2 == null) {
            break L664;
          } else {
            gk.field_a = sc.a((byte) 107, var2);
            break L664;
          }
        }
        L665: {
          var2 = tj.a("mostfit", -108);
          if (var2 != null) {
            rk.field_S = sc.a((byte) 108, var2);
            break L665;
          } else {
            break L665;
          }
        }
        L666: {
          var2 = tj.a("mosthonor", -109);
          if (var2 != null) {
            nj.field_i = sc.a((byte) 98, var2);
            break L666;
          } else {
            break L666;
          }
        }
        L667: {
          var2 = tj.a("mostcruel", -98);
          if (null == var2) {
            break L667;
          } else {
            gi.field_i = sc.a((byte) 115, var2);
            break L667;
          }
        }
        L668: {
          var2 = tj.a("mostresil", -111);
          if (var2 != null) {
            co.field_b = sc.a((byte) 95, var2);
            break L668;
          } else {
            break L668;
          }
        }
        L669: {
          var2 = tj.a("minionmaster", -101);
          if (var2 == null) {
            break L669;
          } else {
            ao.field_a = sc.a((byte) 98, var2);
            break L669;
          }
        }
        L670: {
          var2 = tj.a("dragonmaster", -108);
          if (var2 == null) {
            break L670;
          } else {
            ob.field_X = sc.a((byte) 118, var2);
            break L670;
          }
        }
        L671: {
          var2 = tj.a("impmaster", param1 ^ -76);
          if (var2 == null) {
            break L671;
          } else {
            ed.field_Eb = sc.a((byte) 109, var2);
            break L671;
          }
        }
        L672: {
          var2 = tj.a("mostcrap", -72);
          if (var2 == null) {
            break L672;
          } else {
            wk.field_h = sc.a((byte) 125, var2);
            break L672;
          }
        }
        L673: {
          var2 = tj.a("mostwet", param1 + -147);
          if (null != var2) {
            q.field_J = sc.a((byte) 119, var2);
            break L673;
          } else {
            break L673;
          }
        }
        L674: {
          var2 = tj.a("mostskill", -107);
          if (var2 != null) {
            be.field_a = sc.a((byte) 111, var2);
            break L674;
          } else {
            break L674;
          }
        }
        L675: {
          var2 = tj.a("mostkill", -86);
          if (var2 == null) {
            break L675;
          } else {
            tl.field_e = sc.a((byte) 90, var2);
            break L675;
          }
        }
        L676: {
          var2 = tj.a("mostminion", -124);
          if (null == var2) {
            break L676;
          } else {
            ej.field_N = sc.a((byte) 124, var2);
            break L676;
          }
        }
        L677: {
          var2 = tj.a("mostannoying", param1 ^ -110);
          if (null == var2) {
            break L677;
          } else {
            qa.field_p = sc.a((byte) 103, var2);
            break L677;
          }
        }
        L678: {
          var2 = tj.a("mostpower", -103);
          if (null != var2) {
            tm.field_e = sc.a((byte) 109, var2);
            break L678;
          } else {
            break L678;
          }
        }
        L679: {
          var2 = tj.a("mostdamage", param1 + -131);
          if (var2 == null) {
            break L679;
          } else {
            lo.field_v = sc.a((byte) 120, var2);
            break L679;
          }
        }
        L680: {
          var2 = tj.a("mostzombiemonkies", -72);
          if (null == var2) {
            break L680;
          } else {
            lj.field_q = sc.a((byte) 101, var2);
            break L680;
          }
        }
        L681: {
          var2 = tj.a("gameoutoftime", param1 + -141);
          if (null != var2) {
            ff.field_d = sc.a((byte) 114, var2);
            break L681;
          } else {
            break L681;
          }
        }
        L682: {
          var2 = tj.a("drawgame", -98);
          if (null != var2) {
            th.field_a = sc.a((byte) 109, var2);
            break L682;
          } else {
            break L682;
          }
        }
        L683: {
          var2 = tj.a("winnerdash", -84);
          if (null == var2) {
            break L683;
          } else {
            rn.field_K = sc.a((byte) 116, var2);
            break L683;
          }
        }
        L684: {
          var2 = tj.a("pressstart", -94);
          if (null != var2) {
            qe.field_s = sc.a((byte) 115, var2);
            break L684;
          } else {
            break L684;
          }
        }
        L685: {
          var2 = tj.a("currentlyyourturnpressstart", -74);
          if (null == var2) {
            break L685;
          } else {
            ae.field_d = sc.a((byte) 118, var2);
            break L685;
          }
        }
        L686: {
          var2 = tj.a("ins55", param1 + -95);
          if (var2 == null) {
            break L686;
          } else {
            ao.field_b = sc.a((byte) 95, var2);
            break L686;
          }
        }
        L687: {
          var2 = tj.a("ins54", -72);
          if (null == var2) {
            break L687;
          } else {
            lo.field_t = sc.a((byte) 108, var2);
            break L687;
          }
        }
        L688: {
          var2 = tj.a("ins53", -123);
          if (var2 != null) {
            lm.field_d = sc.a((byte) 112, var2);
            break L688;
          } else {
            break L688;
          }
        }
        L689: {
          var2 = tj.a("ins52", -111);
          if (var2 == null) {
            break L689;
          } else {
            wn.field_A = sc.a((byte) 127, var2);
            break L689;
          }
        }
        L690: {
          var2 = tj.a("ins51", param1 ^ -93);
          if (null != var2) {
            sc.field_S = sc.a((byte) 110, var2);
            break L690;
          } else {
            break L690;
          }
        }
        L691: {
          var2 = tj.a("ins50", -122);
          if (var2 == null) {
            break L691;
          } else {
            oo.field_q = sc.a((byte) 94, var2);
            break L691;
          }
        }
        L692: {
          var2 = tj.a("ins49", param1 ^ -75);
          if (null == var2) {
            break L692;
          } else {
            dn.field_Bb = sc.a((byte) 101, var2);
            break L692;
          }
        }
        L693: {
          var2 = tj.a("ins48", -83);
          if (null == var2) {
            break L693;
          } else {
            hn.field_o = sc.a((byte) 93, var2);
            break L693;
          }
        }
        L694: {
          var2 = tj.a("ins47", param1 + -120);
          if (var2 != null) {
            ah.field_e = sc.a((byte) 90, var2);
            break L694;
          } else {
            break L694;
          }
        }
        L695: {
          var2 = tj.a("ins46", -119);
          if (var2 != null) {
            rk.field_J = sc.a((byte) 93, var2);
            break L695;
          } else {
            break L695;
          }
        }
        L696: {
          var2 = tj.a("ins45", -124);
          if (var2 == null) {
            break L696;
          } else {
            kn.field_pb = sc.a((byte) 119, var2);
            break L696;
          }
        }
        L697: {
          var2 = tj.a("ins44", -97);
          if (null == var2) {
            break L697;
          } else {
            na.field_Tb = sc.a((byte) 103, var2);
            break L697;
          }
        }
        L698: {
          var2 = tj.a("ins43", -105);
          if (var2 == null) {
            break L698;
          } else {
            ne.field_j = sc.a((byte) 100, var2);
            break L698;
          }
        }
        L699: {
          var2 = tj.a("ins42", -109);
          if (null == var2) {
            break L699;
          } else {
            an.field_m = sc.a((byte) 95, var2);
            break L699;
          }
        }
        L700: {
          var2 = tj.a("ins41", -108);
          if (null != var2) {
            fo.field_j = sc.a((byte) 122, var2);
            break L700;
          } else {
            break L700;
          }
        }
        L701: {
          var2 = tj.a("ins40", -125);
          if (var2 == null) {
            break L701;
          } else {
            an.field_n = sc.a((byte) 117, var2);
            break L701;
          }
        }
        L702: {
          var2 = tj.a("spacewands", -124);
          if (var2 != null) {
            dk.field_g = sc.a((byte) 86, var2);
            break L702;
          } else {
            break L702;
          }
        }
        L703: {
          var2 = tj.a("spacewand", param1 + -97);
          if (null != var2) {
            wn.field_x = sc.a((byte) 118, var2);
            break L703;
          } else {
            break L703;
          }
        }
        L704: {
          var2 = tj.a("ins39", param1 + -122);
          if (null == var2) {
            break L704;
          } else {
            hh.field_a = sc.a((byte) 102, var2);
            break L704;
          }
        }
        L705: {
          var2 = tj.a("ins38", -103);
          if (var2 != null) {
            km.field_b = sc.a((byte) 91, var2);
            break L705;
          } else {
            break L705;
          }
        }
        L706: {
          var2 = tj.a("ins37", -75);
          if (var2 == null) {
            break L706;
          } else {
            i.field_h = sc.a((byte) 110, var2);
            break L706;
          }
        }
        L707: {
          var2 = tj.a("ins36", -115);
          if (var2 != null) {
            tn.field_Kb = sc.a((byte) 121, var2);
            break L707;
          } else {
            break L707;
          }
        }
        L708: {
          var2 = tj.a("ins35", -77);
          if (null == var2) {
            break L708;
          } else {
            tk.field_m = sc.a((byte) 121, var2);
            break L708;
          }
        }
        L709: {
          var2 = tj.a("ins34", -119);
          if (var2 == null) {
            break L709;
          } else {
            oa.field_b = sc.a((byte) 100, var2);
            break L709;
          }
        }
        L710: {
          var2 = tj.a("ins33", param1 + -111);
          if (null != var2) {
            hc.field_a = sc.a((byte) 106, var2);
            break L710;
          } else {
            break L710;
          }
        }
        L711: {
          var2 = tj.a("ins32", -106);
          if (null == var2) {
            break L711;
          } else {
            u.field_m = sc.a((byte) 89, var2);
            break L711;
          }
        }
        L712: {
          var2 = tj.a("ins31", -117);
          if (var2 != null) {
            lh.field_h = sc.a((byte) 107, var2);
            break L712;
          } else {
            break L712;
          }
        }
        L713: {
          var2 = tj.a("ins30", -87);
          if (null != var2) {
            ue.field_a = sc.a((byte) 110, var2);
            break L713;
          } else {
            break L713;
          }
        }
        L714: {
          var2 = tj.a("ins29", -92);
          if (null != var2) {
            n.field_e = sc.a((byte) 93, var2);
            break L714;
          } else {
            break L714;
          }
        }
        L715: {
          var2 = tj.a("ins28", param1 ^ -68);
          if (null == var2) {
            break L715;
          } else {
            jd.field_e = sc.a((byte) 86, var2);
            break L715;
          }
        }
        L716: {
          var2 = tj.a("ins27", -76);
          if (var2 == null) {
            break L716;
          } else {
            me.field_P = sc.a((byte) 126, var2);
            break L716;
          }
        }
        L717: {
          var2 = tj.a("ins26", -120);
          if (var2 == null) {
            break L717;
          } else {
            gb.field_e = sc.a((byte) 124, var2);
            break L717;
          }
        }
        L718: {
          var2 = tj.a("ins26b", -114);
          if (var2 == null) {
            break L718;
          } else {
            jn.field_b = sc.a((byte) 112, var2);
            break L718;
          }
        }
        L719: {
          var2 = tj.a("ins25", -88);
          if (var2 == null) {
            break L719;
          } else {
            om.field_L = sc.a((byte) 96, var2);
            break L719;
          }
        }
        L720: {
          var2 = tj.a("ins24", -121);
          if (var2 == null) {
            break L720;
          } else {
            sn.field_J = sc.a((byte) 106, var2);
            break L720;
          }
        }
        L721: {
          var2 = tj.a("ins23", -108);
          if (var2 == null) {
            break L721;
          } else {
            rc.field_f = sc.a((byte) 122, var2);
            break L721;
          }
        }
        L722: {
          var2 = tj.a("ins22", -103);
          if (var2 == null) {
            break L722;
          } else {
            hn.field_i = sc.a((byte) 110, var2);
            break L722;
          }
        }
        L723: {
          var2 = tj.a("ins21", -103);
          if (var2 != null) {
            qj.field_b = sc.a((byte) 106, var2);
            break L723;
          } else {
            break L723;
          }
        }
        L724: {
          var2 = tj.a("ins20", -127);
          if (null == var2) {
            break L724;
          } else {
            jf.field_i = sc.a((byte) 113, var2);
            break L724;
          }
        }
        L725: {
          var2 = tj.a("ins19", param1 + -147);
          if (var2 == null) {
            break L725;
          } else {
            am.field_b = sc.a((byte) 99, var2);
            break L725;
          }
        }
        L726: {
          var2 = tj.a("ins18", -111);
          if (null == var2) {
            break L726;
          } else {
            mn.field_q = sc.a((byte) 125, var2);
            break L726;
          }
        }
        L727: {
          var2 = tj.a("ins17", -97);
          if (var2 == null) {
            break L727;
          } else {
            oj.field_a = sc.a((byte) 115, var2);
            break L727;
          }
        }
        L728: {
          var2 = tj.a("ins16", -105);
          if (null != var2) {
            ma.field_S = sc.a((byte) 121, var2);
            break L728;
          } else {
            break L728;
          }
        }
        L729: {
          var2 = tj.a("ins15", -91);
          if (null != var2) {
            lc.field_o = sc.a((byte) 124, var2);
            break L729;
          } else {
            break L729;
          }
        }
        L730: {
          var2 = tj.a("ins14", -123);
          if (var2 != null) {
            p.field_h = sc.a((byte) 116, var2);
            break L730;
          } else {
            break L730;
          }
        }
        L731: {
          var2 = tj.a("ins13", -85);
          if (var2 == null) {
            break L731;
          } else {
            pm.field_g = sc.a((byte) 106, var2);
            break L731;
          }
        }
        L732: {
          var2 = tj.a("ins12", param1 + -108);
          if (null == var2) {
            break L732;
          } else {
            cf.field_e = sc.a((byte) 123, var2);
            break L732;
          }
        }
        L733: {
          var2 = tj.a("ins11", -111);
          if (null != var2) {
            lf.field_d = sc.a((byte) 108, var2);
            break L733;
          } else {
            break L733;
          }
        }
        L734: {
          var2 = tj.a("ins10", -78);
          if (null != var2) {
            vf.field_p = sc.a((byte) 127, var2);
            break L734;
          } else {
            break L734;
          }
        }
        L735: {
          var2 = tj.a("ins9", param1 ^ -76);
          if (var2 == null) {
            break L735;
          } else {
            ch.field_e = sc.a((byte) 103, var2);
            break L735;
          }
        }
        L736: {
          var2 = tj.a("ins8", -90);
          if (var2 == null) {
            break L736;
          } else {
            cc.field_b = sc.a((byte) 126, var2);
            break L736;
          }
        }
        L737: {
          var2 = tj.a("ins7", -79);
          if (var2 == null) {
            break L737;
          } else {
            qm.field_l = sc.a((byte) 105, var2);
            break L737;
          }
        }
        L738: {
          var2 = tj.a("ins6", -94);
          if (var2 != null) {
            md.field_e = sc.a((byte) 99, var2);
            break L738;
          } else {
            break L738;
          }
        }
        L739: {
          var2 = tj.a("ins5", -97);
          if (null == var2) {
            break L739;
          } else {
            fj.field_g = sc.a((byte) 103, var2);
            break L739;
          }
        }
        L740: {
          var2 = tj.a("ins4", -99);
          if (var2 != null) {
            fd.field_c = sc.a((byte) 119, var2);
            break L740;
          } else {
            break L740;
          }
        }
        L741: {
          var2 = tj.a("ins3", -77);
          if (var2 == null) {
            break L741;
          } else {
            cn.field_J = sc.a((byte) 115, var2);
            break L741;
          }
        }
        L742: {
          var2 = tj.a("ins3_free", param1 + -112);
          if (var2 != null) {
            cb.field_d = sc.a((byte) 117, var2);
            break L742;
          } else {
            break L742;
          }
        }
        L743: {
          var2 = tj.a("ins2", -120);
          if (null == var2) {
            break L743;
          } else {
            ud.field_u = sc.a((byte) 94, var2);
            break L743;
          }
        }
        L744: {
          var2 = tj.a("ins1", -76);
          if (var2 != null) {
            nj.field_j = sc.a((byte) 107, var2);
            break L744;
          } else {
            break L744;
          }
        }
        L745: {
          var2 = tj.a("ins0", -112);
          if (null == var2) {
            break L745;
          } else {
            wm.field_J = sc.a((byte) 118, var2);
            break L745;
          }
        }
        L746: {
          var2 = tj.a("skincolour", param1 + -99);
          if (var2 == null) {
            break L746;
          } else {
            ka.field_l = sc.a((byte) 91, var2);
            break L746;
          }
        }
        L747: {
          var2 = tj.a("haircolour", param1 + -133);
          if (var2 != null) {
            th.field_j = sc.a((byte) 94, var2);
            break L747;
          } else {
            break L747;
          }
        }
        L748: {
          var2 = tj.a("secondarycolour", param1 ^ -103);
          if (null == var2) {
            break L748;
          } else {
            ce.field_j = sc.a((byte) 98, var2);
            break L748;
          }
        }
        L749: {
          var2 = tj.a("primarycolour", -116);
          if (var2 == null) {
            break L749;
          } else {
            gg.field_f = sc.a((byte) 111, var2);
            break L749;
          }
        }
        L750: {
          var2 = tj.a("pressentertocont", -116);
          if (var2 != null) {
            sk.field_c = sc.a((byte) 91, var2);
            break L750;
          } else {
            break L750;
          }
        }
        L751: {
          var2 = tj.a("rechargespell", -104);
          if (null != var2) {
            mj.field_x = sc.a((byte) 121, var2);
            break L751;
          } else {
            break L751;
          }
        }
        L752: {
          var2 = tj.a("chargeleft", -100);
          if (null == var2) {
            break L752;
          } else {
            tc.field_z = sc.a((byte) 88, var2);
            break L752;
          }
        }
        L753: {
          var2 = tj.a("chargesleft", -91);
          if (var2 == null) {
            break L753;
          } else {
            tk.field_s = sc.a((byte) 107, var2);
            break L753;
          }
        }
        L754: {
          var2 = tj.a("turnleft", param1 + -105);
          if (var2 == null) {
            break L754;
          } else {
            tg.field_g = sc.a((byte) 122, var2);
            break L754;
          }
        }
        L755: {
          var2 = tj.a("turnsleft", -72);
          if (var2 == null) {
            break L755;
          } else {
            ki.field_x = sc.a((byte) 110, var2);
            break L755;
          }
        }
        L756: {
          var2 = tj.a("licheblocks", -128);
          if (var2 != null) {
            oi.field_a = sc.a((byte) 102, var2);
            break L756;
          } else {
            break L756;
          }
        }
        L757: {
          var2 = tj.a("unitcapreached", -108);
          if (var2 != null) {
            tk.field_p = sc.a((byte) 104, var2);
            break L757;
          } else {
            break L757;
          }
        }
        L758: {
          var2 = tj.a("shiningpowerblocks", -106);
          if (var2 != null) {
            bj.field_sb = sc.a((byte) 116, var2);
            break L758;
          } else {
            break L758;
          }
        }
        L759: {
          var2 = tj.a("alreadycastled", -94);
          if (null != var2) {
            qa.field_k = sc.a((byte) 111, var2);
            break L759;
          } else {
            break L759;
          }
        }
        L760: {
          var2 = tj.a("togglehelp", -116);
          if (null == var2) {
            break L760;
          } else {
            mk.field_L = sc.a((byte) 109, var2);
            break L760;
          }
        }
        L761: {
          var2 = tj.a("verses", param1 + -123);
          if (var2 != null) {
            sb.field_c = sc.a((byte) 95, var2);
            break L761;
          } else {
            break L761;
          }
        }
        L762: {
          var2 = tj.a("tut53", -82);
          if (null != var2) {
            q.field_F = sc.a((byte) 97, var2);
            break L762;
          } else {
            break L762;
          }
        }
        L763: {
          var2 = tj.a("tut52", -107);
          if (var2 != null) {
            oc.field_h = sc.a((byte) 123, var2);
            break L763;
          } else {
            break L763;
          }
        }
        L764: {
          var2 = tj.a("tut51", param1 + -121);
          if (var2 != null) {
            vd.field_j = sc.a((byte) 88, var2);
            break L764;
          } else {
            break L764;
          }
        }
        L765: {
          var2 = tj.a("tut50", -111);
          if (var2 == null) {
            break L765;
          } else {
            mo.field_l = sc.a((byte) 120, var2);
            break L765;
          }
        }
        L766: {
          var2 = tj.a("tut49", -112);
          if (var2 == null) {
            break L766;
          } else {
            bb.field_d = sc.a((byte) 119, var2);
            break L766;
          }
        }
        L767: {
          var2 = tj.a("tut48", param1 + -123);
          if (null == var2) {
            break L767;
          } else {
            jl.field_e = sc.a((byte) 110, var2);
            break L767;
          }
        }
        L768: {
          var2 = tj.a("tut47", -102);
          if (null != var2) {
            fk.field_i = sc.a((byte) 97, var2);
            break L768;
          } else {
            break L768;
          }
        }
        L769: {
          var2 = tj.a("tut46", -93);
          if (var2 == null) {
            break L769;
          } else {
            bh.field_a = sc.a((byte) 108, var2);
            break L769;
          }
        }
        L770: {
          var2 = tj.a("tut45", -79);
          if (null != var2) {
            dc.field_g = sc.a((byte) 102, var2);
            break L770;
          } else {
            break L770;
          }
        }
        L771: {
          var2 = tj.a("tut44", param1 + -143);
          if (null != var2) {
            tc.field_y = sc.a((byte) 114, var2);
            break L771;
          } else {
            break L771;
          }
        }
        L772: {
          var2 = tj.a("tut43", param1 + -144);
          if (null != var2) {
            r.field_c = sc.a((byte) 118, var2);
            break L772;
          } else {
            break L772;
          }
        }
        L773: {
          var2 = tj.a("tut42", -70);
          if (null != var2) {
            pa.field_f = sc.a((byte) 108, var2);
            break L773;
          } else {
            break L773;
          }
        }
        L774: {
          var2 = tj.a("tut41", -126);
          if (null == var2) {
            break L774;
          } else {
            ol.field_e = sc.a((byte) 88, var2);
            break L774;
          }
        }
        L775: {
          var2 = tj.a("tut40", param1 ^ -124);
          if (var2 == null) {
            break L775;
          } else {
            to.field_o = sc.a((byte) 96, var2);
            break L775;
          }
        }
        L776: {
          var2 = tj.a("tut39", -78);
          if (null != var2) {
            tc.field_E = sc.a((byte) 111, var2);
            break L776;
          } else {
            break L776;
          }
        }
        L777: {
          var2 = tj.a("tut38", -110);
          if (null == var2) {
            break L777;
          } else {
            va.field_b = sc.a((byte) 121, var2);
            break L777;
          }
        }
        L778: {
          var2 = tj.a("tut37", -101);
          if (null != var2) {
            af.field_Cb = sc.a((byte) 113, var2);
            break L778;
          } else {
            break L778;
          }
        }
        L779: {
          var2 = tj.a("tut36", param1 + -136);
          if (null == var2) {
            break L779;
          } else {
            mk.field_M = sc.a((byte) 126, var2);
            break L779;
          }
        }
        L780: {
          var2 = tj.a("tut35", -93);
          if (var2 == null) {
            break L780;
          } else {
            bm.field_a = sc.a((byte) 92, var2);
            break L780;
          }
        }
        L781: {
          var2 = tj.a("tut34", -109);
          if (var2 == null) {
            break L781;
          } else {
            io.field_u = sc.a((byte) 108, var2);
            break L781;
          }
        }
        L782: {
          var2 = tj.a("tut33", param1 + -122);
          if (var2 != null) {
            uj.field_b = sc.a((byte) 121, var2);
            break L782;
          } else {
            break L782;
          }
        }
        L783: {
          var2 = tj.a("tut32", -96);
          if (null == var2) {
            break L783;
          } else {
            jd.field_c = sc.a((byte) 122, var2);
            break L783;
          }
        }
        L784: {
          var2 = tj.a("tut31", param1 + -108);
          if (var2 == null) {
            break L784;
          } else {
            eb.field_c = sc.a((byte) 112, var2);
            break L784;
          }
        }
        L785: {
          var2 = tj.a("tut30", -92);
          if (null != var2) {
            ui.field_u = sc.a((byte) 114, var2);
            break L785;
          } else {
            break L785;
          }
        }
        L786: {
          var2 = tj.a("tut29", param1 + -137);
          if (var2 == null) {
            break L786;
          } else {
            ub.field_f = sc.a((byte) 109, var2);
            break L786;
          }
        }
        L787: {
          var2 = tj.a("tut28", param1 ^ -106);
          if (var2 == null) {
            break L787;
          } else {
            gh.field_o = sc.a((byte) 113, var2);
            break L787;
          }
        }
        L788: {
          var2 = tj.a("tut27", param1 + -147);
          if (var2 != null) {
            e.field_D = sc.a((byte) 104, var2);
            break L788;
          } else {
            break L788;
          }
        }
        L789: {
          var2 = tj.a("tut26", -107);
          if (null == var2) {
            break L789;
          } else {
            gn.field_f = sc.a((byte) 105, var2);
            break L789;
          }
        }
        L790: {
          var2 = tj.a("tut25", -115);
          if (null != var2) {
            ag.field_x = sc.a((byte) 110, var2);
            break L790;
          } else {
            break L790;
          }
        }
        L791: {
          var2 = tj.a("tut24", -88);
          if (var2 != null) {
            qe.field_n = sc.a((byte) 119, var2);
            break L791;
          } else {
            break L791;
          }
        }
        L792: {
          var2 = tj.a("tut23", param1 + -97);
          if (var2 == null) {
            break L792;
          } else {
            be.field_h = sc.a((byte) 108, var2);
            break L792;
          }
        }
        L793: {
          var2 = tj.a("tut22", -99);
          if (null == var2) {
            break L793;
          } else {
            qn.field_jb = sc.a((byte) 90, var2);
            break L793;
          }
        }
        L794: {
          var2 = tj.a("tut21", -119);
          if (null == var2) {
            break L794;
          } else {
            nb.field_f = sc.a((byte) 115, var2);
            break L794;
          }
        }
        L795: {
          var2 = tj.a("tut20", -71);
          if (null != var2) {
            lh.field_d = sc.a((byte) 96, var2);
            break L795;
          } else {
            break L795;
          }
        }
        L796: {
          var2 = tj.a("tut19", param1 ^ -128);
          if (var2 == null) {
            break L796;
          } else {
            ra.field_g = sc.a((byte) 92, var2);
            break L796;
          }
        }
        L797: {
          var2 = tj.a("tut18", -84);
          if (null == var2) {
            break L797;
          } else {
            tf.field_h = sc.a((byte) 122, var2);
            break L797;
          }
        }
        L798: {
          var2 = tj.a("tut17", param1 + -96);
          if (var2 == null) {
            break L798;
          } else {
            ub.field_d = sc.a((byte) 119, var2);
            break L798;
          }
        }
        L799: {
          var2 = tj.a("tut16", -121);
          if (null != var2) {
            nj.field_h = sc.a((byte) 94, var2);
            break L799;
          } else {
            break L799;
          }
        }
        L800: {
          var2 = tj.a("tut15", -92);
          if (var2 != null) {
            mk.field_N = sc.a((byte) 111, var2);
            break L800;
          } else {
            break L800;
          }
        }
        L801: {
          var2 = tj.a("tut14", -92);
          if (null != var2) {
            td.field_D = sc.a((byte) 120, var2);
            break L801;
          } else {
            break L801;
          }
        }
        L802: {
          var2 = tj.a("tut13", param1 + -124);
          if (var2 != null) {
            wi.field_i = sc.a((byte) 115, var2);
            break L802;
          } else {
            break L802;
          }
        }
        L803: {
          var2 = tj.a("tut12", -90);
          if (null != var2) {
            vi.field_D = sc.a((byte) 97, var2);
            break L803;
          } else {
            break L803;
          }
        }
        L804: {
          var2 = tj.a("tut11", param1 + -146);
          if (var2 == null) {
            break L804;
          } else {
            ke.field_E = sc.a((byte) 109, var2);
            break L804;
          }
        }
        L805: {
          var2 = tj.a("tut10", -77);
          if (var2 != null) {
            mk.field_R = sc.a((byte) 86, var2);
            break L805;
          } else {
            break L805;
          }
        }
        L806: {
          var2 = tj.a("tut9", -116);
          if (null == var2) {
            break L806;
          } else {
            ie.field_Mb = sc.a((byte) 110, var2);
            break L806;
          }
        }
        L807: {
          var2 = tj.a("tut8", -122);
          if (null == var2) {
            break L807;
          } else {
            re.field_m = sc.a((byte) 118, var2);
            break L807;
          }
        }
        L808: {
          var2 = tj.a("tut7", -123);
          if (null == var2) {
            break L808;
          } else {
            kj.field_f = sc.a((byte) 100, var2);
            break L808;
          }
        }
        L809: {
          var2 = tj.a("tut6", -75);
          if (null != var2) {
            oi.field_b = sc.a((byte) 90, var2);
            break L809;
          } else {
            break L809;
          }
        }
        L810: {
          var2 = tj.a("tut5", param1 ^ -79);
          if (null != var2) {
            sk.field_i = sc.a((byte) 121, var2);
            break L810;
          } else {
            break L810;
          }
        }
        L811: {
          var2 = tj.a("tut4", -96);
          if (null != var2) {
            ej.field_Q = sc.a((byte) 114, var2);
            break L811;
          } else {
            break L811;
          }
        }
        L812: {
          var2 = tj.a("tut3", -99);
          if (var2 == null) {
            break L812;
          } else {
            we.field_a = sc.a((byte) 117, var2);
            break L812;
          }
        }
        L813: {
          var2 = tj.a("tut2", -125);
          if (null != var2) {
            ic.field_c = sc.a((byte) 110, var2);
            break L813;
          } else {
            break L813;
          }
        }
        L814: {
          var2 = tj.a("tut1", param1 ^ -106);
          if (null != var2) {
            ab.field_s = sc.a((byte) 99, var2);
            break L814;
          } else {
            break L814;
          }
        }
        L815: {
          var2 = tj.a("tut0", -102);
          if (var2 == null) {
            break L815;
          } else {
            vc.field_f = sc.a((byte) 99, var2);
            break L815;
          }
        }
        L816: {
          var2 = tj.a("youfallenintowater4", -85);
          if (null != var2) {
            bc.field_a = sc.a((byte) 115, var2);
            break L816;
          } else {
            break L816;
          }
        }
        L817: {
          var2 = tj.a("youfallenintowater3", param1 + -145);
          if (null != var2) {
            ck.field_g = sc.a((byte) 92, var2);
            break L817;
          } else {
            break L817;
          }
        }
        L818: {
          var2 = tj.a("youfallenintowater2", -108);
          if (var2 != null) {
            ml.field_K = sc.a((byte) 105, var2);
            break L818;
          } else {
            break L818;
          }
        }
        L819: {
          var2 = tj.a("youfallenintowater", -106);
          if (null != var2) {
            in.field_Kb = sc.a((byte) 107, var2);
            break L819;
          } else {
            break L819;
          }
        }
        L820: {
          var2 = tj.a("timeleftcolon", param1 + -111);
          if (var2 == null) {
            break L820;
          } else {
            co.field_i = sc.a((byte) 86, var2);
            break L820;
          }
        }
        L821: {
          var2 = tj.a("unpack10", param1 ^ -78);
          if (var2 == null) {
            break L821;
          } else {
            md.field_d = sc.a((byte) 112, var2);
            break L821;
          }
        }
        L822: {
          var2 = tj.a("unpack9", param1 + -120);
          if (null != var2) {
            mn.field_v = sc.a((byte) 120, var2);
            break L822;
          } else {
            break L822;
          }
        }
        L823: {
          var2 = tj.a("unpack8", -79);
          if (null == var2) {
            break L823;
          } else {
            fl.field_c = sc.a((byte) 86, var2);
            break L823;
          }
        }
        L824: {
          var2 = tj.a("unpack7", -103);
          if (null == var2) {
            break L824;
          } else {
            ld.field_j = sc.a((byte) 119, var2);
            break L824;
          }
        }
        L825: {
          var2 = tj.a("unpack6", -74);
          if (var2 != null) {
            fe.field_m = sc.a((byte) 91, var2);
            break L825;
          } else {
            break L825;
          }
        }
        L826: {
          var2 = tj.a("unpack5", -125);
          if (null != var2) {
            wh.field_j = sc.a((byte) 97, var2);
            break L826;
          } else {
            break L826;
          }
        }
        L827: {
          var2 = tj.a("unpack4", -126);
          if (var2 != null) {
            ba.field_b = sc.a((byte) 88, var2);
            break L827;
          } else {
            break L827;
          }
        }
        L828: {
          var2 = tj.a("unpack3", -80);
          if (var2 != null) {
            go.field_h = sc.a((byte) 126, var2);
            break L828;
          } else {
            break L828;
          }
        }
        L829: {
          var2 = tj.a("unpacknature", param1 ^ -96);
          if (null == var2) {
            break L829;
          } else {
            tl.field_g = sc.a((byte) 100, var2);
            break L829;
          }
        }
        L830: {
          var2 = tj.a("unpackocean", -99);
          if (var2 != null) {
            lo.field_s = sc.a((byte) 101, var2);
            break L830;
          } else {
            break L830;
          }
        }
        L831: {
          var2 = tj.a("unpackcogs", -83);
          if (null != var2) {
            ma.field_I = sc.a((byte) 118, var2);
            break L831;
          } else {
            break L831;
          }
        }
        L832: {
          var2 = tj.a("unpack2", -85);
          if (null == var2) {
            break L832;
          } else {
            vm.field_f = sc.a((byte) 112, var2);
            break L832;
          }
        }
        L833: {
          var2 = tj.a("unpace1", -98);
          if (var2 == null) {
            break L833;
          } else {
            ee.field_a = sc.a((byte) 107, var2);
            break L833;
          }
        }
        L834: {
          var2 = tj.a("unpack0", -89);
          if (var2 != null) {
            vi.field_Q = sc.a((byte) 97, var2);
            break L834;
          } else {
            break L834;
          }
        }
        L835: {
          var2 = tj.a("hahahiddenisthis", -118);
          if (var2 != null) {
            wk.field_k = sc.a((byte) 123, var2);
            break L835;
          } else {
            break L835;
          }
        }
        L836: {
          var2 = tj.a("blueteam", param1 + -142);
          if (var2 != null) {
            cn.field_I = sc.a((byte) 87, var2);
            break L836;
          } else {
            break L836;
          }
        }
        L837: {
          var2 = tj.a("redteam", -121);
          if (null != var2) {
            b.field_d = sc.a((byte) 94, var2);
            break L837;
          } else {
            break L837;
          }
        }
        L838: {
          var2 = tj.a("rumrumrum", -100);
          if (null == var2) {
            break L838;
          } else {
            uh.field_l = sc.a((byte) 114, var2);
            break L838;
          }
        }
        L839: {
          var2 = tj.a("mosletitle", -119);
          if (var2 != null) {
            b.field_c = sc.a((byte) 126, var2);
            break L839;
          } else {
            break L839;
          }
        }
        L840: {
          var2 = tj.a("skycastlepower", param1 + -109);
          if (null != var2) {
            qj.field_f = sc.a((byte) 109, var2);
            break L840;
          } else {
            break L840;
          }
        }
        L841: {
          var2 = tj.a("skycastletitle", -119);
          if (null != var2) {
            ck.field_c = sc.a((byte) 102, var2);
            break L841;
          } else {
            break L841;
          }
        }
        L842: {
          var2 = tj.a("summonclickonscreen", -87);
          if (null == var2) {
            break L842;
          } else {
            vn.field_a = sc.a((byte) 87, var2);
            break L842;
          }
        }
        L843: {
          var2 = tj.a("timetimetime", -111);
          if (null != var2) {
            mf.field_e = sc.a((byte) 101, var2);
            break L843;
          } else {
            break L843;
          }
        }
        L844: {
          var2 = tj.a("yaywecanswim", param1 ^ -103);
          if (null == var2) {
            break L844;
          } else {
            fg.field_i = sc.a((byte) 104, var2);
            break L844;
          }
        }
        L845: {
          var2 = tj.a("natureisgoodaswell", -128);
          if (null == var2) {
            break L845;
          } else {
            dk.field_f = sc.a((byte) 87, var2);
            break L845;
          }
        }
        L846: {
          var2 = tj.a("morehealingwtf", param1 + -112);
          if (var2 != null) {
            pb.field_l = sc.a((byte) 97, var2);
            break L846;
          } else {
            break L846;
          }
        }
        L847: {
          var2 = tj.a("respawnpoint", -108);
          if (null == var2) {
            break L847;
          } else {
            sl.field_M = sc.a((byte) 96, var2);
            break L847;
          }
        }
        L848: {
          var2 = tj.a("bouncyminions", -114);
          if (var2 != null) {
            pk.field_b = sc.a((byte) 124, var2);
            break L848;
          } else {
            break L848;
          }
        }
        L849: {
          var2 = tj.a("speedsrecharges", -128);
          if (var2 != null) {
            lc.field_p = sc.a((byte) 103, var2);
            break L849;
          } else {
            break L849;
          }
        }
        L850: {
          var2 = tj.a("damageresist", -82);
          if (null == var2) {
            break L850;
          } else {
            ik.field_a = sc.a((byte) 123, var2);
            break L850;
          }
        }
        L851: {
          var2 = tj.a("flamup", param1 + -121);
          if (var2 == null) {
            break L851;
          } else {
            uh.field_q = sc.a((byte) 121, var2);
            break L851;
          }
        }
        L852: {
          var2 = tj.a("familarpowers", -85);
          if (var2 != null) {
            nb.field_c = sc.a((byte) 100, var2);
            break L852;
          } else {
            break L852;
          }
        }
        L853: {
          var2 = tj.a("mustbeamemeberforanimals", param1 ^ -78);
          if (var2 == null) {
            break L853;
          } else {
            kc.field_M = sc.a((byte) 114, var2);
            break L853;
          }
        }
        L854: {
          var2 = tj.a("famtitle", param1 ^ -67);
          if (null != var2) {
            db.field_d = sc.a((byte) 119, var2);
            break L854;
          } else {
            break L854;
          }
        }
        L855: {
          var2 = tj.a("tp4", -87);
          if (null != var2) {
            va.field_a = sc.a((byte) 89, var2);
            break L855;
          } else {
            break L855;
          }
        }
        L856: {
          var2 = tj.a("tp3", -123);
          if (null != var2) {
            nm.field_d = sc.a((byte) 127, var2);
            break L856;
          } else {
            break L856;
          }
        }
        L857: {
          var2 = tj.a("tp2", -95);
          if (null == var2) {
            break L857;
          } else {
            jl.field_f = sc.a((byte) 117, var2);
            break L857;
          }
        }
        L858: {
          var2 = tj.a("tp0", -96);
          if (null != var2) {
            hl.field_i = sc.a((byte) 88, var2);
            break L858;
          } else {
            break L858;
          }
        }
        L859: {
          var2 = tj.a("tptitle", -97);
          if (var2 != null) {
            gl.field_a = sc.a((byte) 119, var2);
            break L859;
          } else {
            break L859;
          }
        }
        L860: {
          var2 = tj.a("earnlessnowhehe", param1 + -110);
          if (var2 == null) {
            break L860;
          } else {
            ck.field_e = sc.a((byte) 92, var2);
            break L860;
          }
        }
        L861: {
          var2 = tj.a("tradeinnowdammit", -85);
          if (var2 == null) {
            break L861;
          } else {
            vh.field_h = sc.a((byte) 104, var2);
            break L861;
          }
        }
        L862: {
          var2 = tj.a("earnedlotstradeinnow", param1 ^ -75);
          if (null == var2) {
            break L862;
          } else {
            ti.field_F = sc.a((byte) 117, var2);
            break L862;
          }
        }
        L863: {
          var2 = tj.a("youaredamagedhahaha", -72);
          if (var2 != null) {
            qn.field_kb = sc.a((byte) 90, var2);
            break L863;
          } else {
            break L863;
          }
        }
        L864: {
          var2 = tj.a("sorryonlyonceperturn", -70);
          if (var2 != null) {
            hc.field_g = sc.a((byte) 110, var2);
            break L864;
          } else {
            break L864;
          }
        }
        L865: {
          var2 = tj.a("nocastwhileflying", -81);
          if (var2 != null) {
            sc.field_T = sc.a((byte) 117, var2);
            break L865;
          } else {
            break L865;
          }
        }
        L866: {
          var2 = tj.a("nocastvinewhileflying", -99);
          if (null != var2) {
            rc.field_l = sc.a((byte) 109, var2);
            break L866;
          } else {
            break L866;
          }
        }
        L867: {
          var2 = tj.a("wateronlyspell", param1 + -150);
          if (var2 != null) {
            bj.field_jb = sc.a((byte) 116, var2);
            break L867;
          } else {
            break L867;
          }
        }
        L868: {
          var2 = tj.a("arcanzeroblocks", -82);
          if (null == var2) {
            break L868;
          } else {
            s.field_a = sc.a((byte) 104, var2);
            break L868;
          }
        }
        L869: {
          var2 = tj.a("youareentangled", -82);
          if (null != var2) {
            String discarded$5 = sc.a((byte) 118, var2);
            break L869;
          } else {
            break L869;
          }
        }
        L870: {
          var2 = tj.a("levelx", -125);
          if (null != var2) {
            bk.field_H = sc.a((byte) 121, var2);
            break L870;
          } else {
            break L870;
          }
        }
        L871: {
          var2 = tj.a("alreadyatmax", -108);
          if (var2 != null) {
            rc.field_i = sc.a((byte) 98, var2);
            break L871;
          } else {
            break L871;
          }
        }
        L872: {
          var2 = tj.a("notenoughhp", param1 + -141);
          if (null == var2) {
            break L872;
          } else {
            hm.field_b = sc.a((byte) 108, var2);
            break L872;
          }
        }
        L873: {
          var2 = tj.a("poweringupfamiliar", -75);
          if (null == var2) {
            break L873;
          } else {
            kj.field_b = sc.a((byte) 105, var2);
            break L873;
          }
        }
        L874: {
          var2 = tj.a("starttut", -77);
          if (var2 != null) {
            me.field_Q = sc.a((byte) 127, var2);
            break L874;
          } else {
            break L874;
          }
        }
        L875: {
          var2 = tj.a("gotosandbox", -103);
          if (var2 != null) {
            mo.field_d = sc.a((byte) 120, var2);
            break L875;
          } else {
            break L875;
          }
        }
        L876: {
          var2 = tj.a("brats", -74);
          if (null == var2) {
            break L876;
          } else {
            ui.field_q = sc.a((byte) 119, var2);
            break L876;
          }
        }
        L877: {
          var2 = tj.a("bwins", param1 ^ -117);
          if (var2 == null) {
            break L877;
          } else {
            mj.field_y = sc.a((byte) 117, var2);
            break L877;
          }
        }
        L878: {
          var2 = tj.a("cogscaps", param1 ^ -80);
          if (var2 != null) {
            ie.field_Rb = sc.a((byte) 106, var2);
            break L878;
          } else {
            break L878;
          }
        }
        L879: {
          var2 = tj.a("oceancaps", param1 + -121);
          if (null != var2) {
            fo.field_i = sc.a((byte) 114, var2);
            break L879;
          } else {
            break L879;
          }
        }
        L880: {
          var2 = tj.a("naturecaps", -88);
          if (null == var2) {
            break L880;
          } else {
            ra.field_e = sc.a((byte) 111, var2);
            break L880;
          }
        }
        L881: {
          var2 = tj.a("overcaps", -95);
          if (var2 == null) {
            break L881;
          } else {
            go.field_f = sc.a((byte) 122, var2);
            break L881;
          }
        }
        L882: {
          var2 = tj.a("underdarkcaps", -89);
          if (null != var2) {
            di.field_b = sc.a((byte) 127, var2);
            break L882;
          } else {
            break L882;
          }
        }
        L883: {
          var2 = tj.a("frostcaps", -80);
          if (var2 != null) {
            pc.field_a = sc.a((byte) 107, var2);
            break L883;
          } else {
            break L883;
          }
        }
        L884: {
          var2 = tj.a("stonecaps", -85);
          if (null == var2) {
            break L884;
          } else {
            ra.field_b = sc.a((byte) 87, var2);
            break L884;
          }
        }
        L885: {
          var2 = tj.a("stormcaps", -99);
          if (null != var2) {
            hm.field_a = sc.a((byte) 90, var2);
            break L885;
          } else {
            break L885;
          }
        }
        L886: {
          var2 = tj.a("flamecaps", -116);
          if (var2 == null) {
            break L886;
          } else {
            ve.field_s = sc.a((byte) 87, var2);
            break L886;
          }
        }
        L887: {
          var2 = tj.a("whensummoning", -121);
          if (var2 != null) {
            kl.field_F = sc.a((byte) 109, var2);
            break L887;
          } else {
            break L887;
          }
        }
        L888: {
          var2 = tj.a("optionscreen", param1 + -110);
          if (var2 == null) {
            break L888;
          } else {
            jk.field_j = sc.a((byte) 116, var2);
            break L888;
          }
        }
        gn.field_e = null;
        L889: {
          if (var3 == 0) {
            break L889;
          } else {
            var4 = dc.field_b;
            var4++;
            dc.field_b = var4;
            break L889;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "If you are not, please change your password to something more obscure!";
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_c = "Moe";
        field_e = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
