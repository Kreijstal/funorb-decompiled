/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class af {
    static boolean field_c;
    static String[] field_a;
    static int field_b;

    final static String a(mo param0, byte param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = null;
        var2 = var6;
        if (param0.field_q != null) {
          L0: {
            var5 = param0.field_q;
            var2 = var5;
            var3 = var2;
            var2 = var5;
            if ((param0.field_p ^ -1) == -2) {
              var2 = "<img=0>" + var5;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((param0.field_p ^ -1) != -3) {
              break L1;
            } else {
              var2 = "<img=1>" + var2;
              var3 = var2;
              var3 = var2;
              break L1;
            }
          }
          if (param1 == 103) {
            var3 = "";
            if (2 == param0.field_b) {
              if (!param0.field_f) {
                if (0 == param0.field_a) {
                  if (param0.field_e == 0) {
                    var3 = fo.a(param1 + 4697, ta.field_Q, new String[1]);
                    return var3;
                  } else {
                    var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                    return var3;
                  }
                } else {
                  var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              L2: {
                if (0 != param0.field_b) {
                  break L2;
                } else {
                  if (!bq.field_c) {
                    break L2;
                  } else {
                    var3 = "[" + sa.field_c + "] ";
                    break L2;
                  }
                }
              }
              L3: {
                if (-2 == (param0.field_b ^ -1)) {
                  var3 = "[" + fo.a(param1 + 4697, cv.field_m, new String[1]) + "] ";
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (4 != param0.field_b) {
                  break L4;
                } else {
                  if (null == ur.field_C) {
                    break L4;
                  } else {
                    var3 = "[" + ur.field_C + "] ";
                    break L4;
                  }
                }
              }
              L5: {
                if ((param0.field_b ^ -1) != -4) {
                  break L5;
                } else {
                  var3 = "[#" + param0.field_k + "] ";
                  break L5;
                }
              }
              if (param0.field_f) {
                return var3;
              } else {
                var3 = var3 + var2 + ": ";
                return var3;
              }
            }
          } else {
            field_c = false;
            var3 = "";
            if (2 == param0.field_b) {
              if (!param0.field_f) {
                if (0 == param0.field_a) {
                  if (param0.field_e != 0) {
                    var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                    return var3;
                  } else {
                    var3 = fo.a(param1 + 4697, ta.field_Q, new String[1]);
                    return var3;
                  }
                } else {
                  var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                  var8 = var3;
                  var3 = var8;
                  var8 = var3;
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              L6: {
                if (0 != param0.field_b) {
                  break L6;
                } else {
                  if (!bq.field_c) {
                    break L6;
                  } else {
                    var3 = "[" + sa.field_c + "] ";
                    break L6;
                  }
                }
              }
              L7: {
                if (-2 == (param0.field_b ^ -1)) {
                  var3 = "[" + fo.a(param1 + 4697, cv.field_m, new String[1]) + "] ";
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (4 != param0.field_b) {
                  break L8;
                } else {
                  if (null == ur.field_C) {
                    break L8;
                  } else {
                    var3 = "[" + ur.field_C + "] ";
                    break L8;
                  }
                }
              }
              L9: {
                if ((param0.field_b ^ -1) != -4) {
                  break L9;
                } else {
                  var3 = "[#" + param0.field_k + "] ";
                  break L9;
                }
              }
              if (param0.field_f) {
                return var3;
              } else {
                var3 = var3 + var2 + ": ";
                return var3;
              }
            }
          }
        } else {
          if (param1 == 103) {
            var3 = "";
            if (2 == param0.field_b) {
              if (!param0.field_f) {
                if (0 == param0.field_a) {
                  if (param0.field_e != 0) {
                    var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                    return var3;
                  } else {
                    var3 = fo.a(param1 + 4697, ta.field_Q, new String[1]);
                    var2 = var3;
                    var3 = var2;
                    var2 = var3;
                    return var3;
                  }
                } else {
                  var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                  return var3;
                }
              } else {
                return var3;
              }
            } else {
              L10: {
                if (0 != param0.field_b) {
                  break L10;
                } else {
                  if (!bq.field_c) {
                    break L10;
                  } else {
                    var3 = "[" + sa.field_c + "] ";
                    break L10;
                  }
                }
              }
              L11: {
                if (-2 == (param0.field_b ^ -1)) {
                  var3 = "[" + fo.a(param1 + 4697, cv.field_m, new String[1]) + "] ";
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (4 != param0.field_b) {
                  break L12;
                } else {
                  if (null == ur.field_C) {
                    break L12;
                  } else {
                    var3 = "[" + ur.field_C + "] ";
                    break L12;
                  }
                }
              }
              L13: {
                if ((param0.field_b ^ -1) != -4) {
                  break L13;
                } else {
                  var3 = "[#" + param0.field_k + "] ";
                  break L13;
                }
              }
              if (param0.field_f) {
                return var3;
              } else {
                var3 = var3 + var6 + ": ";
                return var3;
              }
            }
          } else {
            L14: {
              field_c = false;
              var3 = "";
              if (2 == param0.field_b) {
                if (!param0.field_f) {
                  var6 = var2;
                  if (0 != param0.field_a) {
                    var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                    var7 = var3;
                    var3 = var7;
                    var7 = var3;
                    return var3;
                  } else {
                    L15: {
                      var6 = var2;
                      if (param0.field_e == 0) {
                        var3 = fo.a(param1 + 4697, ta.field_Q, new String[1]);
                        break L15;
                      } else {
                        var3 = fo.a(param1 + 4697, ov.field_l, new String[1]);
                        break L15;
                      }
                    }
                    return var3;
                  }
                } else {
                  break L14;
                }
              } else {
                L16: {
                  if (0 != param0.field_b) {
                    break L16;
                  } else {
                    if (!bq.field_c) {
                      break L16;
                    } else {
                      var3 = "[" + sa.field_c + "] ";
                      break L16;
                    }
                  }
                }
                L17: {
                  if (-2 == (param0.field_b ^ -1)) {
                    var3 = "[" + fo.a(param1 + 4697, cv.field_m, new String[1]) + "] ";
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (4 != param0.field_b) {
                    break L18;
                  } else {
                    if (null == ur.field_C) {
                      break L18;
                    } else {
                      var3 = "[" + ur.field_C + "] ";
                      break L18;
                    }
                  }
                }
                L19: {
                  if ((param0.field_b ^ -1) != -4) {
                    break L19;
                  } else {
                    var3 = "[#" + param0.field_k + "] ";
                    break L19;
                  }
                }
                if (!param0.field_f) {
                  var3 = var3 + var6 + ": ";
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            return var3;
          }
        }
    }

    abstract void a(vh param0, int param1);

    public static void b(byte param0) {
        if (param0 >= -95) {
            return;
        }
        field_a = null;
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            int var3_int = 0;
            String var4 = null;
            wo var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            hd stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            hd stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            hd stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            String stackIn_13_5 = null;
            hd stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            hd stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            hd stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_int = 16 % ((7 - param1) / 62);
                            var4 = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var4 = qv.a(0, param0);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param2 == null) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4 = var4 + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4 = var4 + param2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            wq.a(var4, false);
                            var8 = dv.a(var4, -75, ":", "%3a");
                            var9 = dv.a(var8, -110, "@", "%40");
                            var10 = dv.a(var9, -68, "&", "%26");
                            var11 = dv.a(var10, -102, "#", "%23");
                            if (vu.field_L != null) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = vh.field_s;
                            stackOut_10_1 = null;
                            stackOut_10_2 = null;
                            stackOut_10_3 = vu.field_L.getCodeBase();
                            stackOut_10_4 = new StringBuilder().append("clienterror.ws?c=").append(hw.field_B).append("&u=");
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            stackIn_12_4 = stackOut_10_4;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            stackIn_11_4 = stackOut_10_4;
                            if (uk.field_l == null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (hd) (Object) stackIn_11_0;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = (java.net.URL) (Object) stackIn_11_3;
                            stackOut_11_4 = (StringBuilder) (Object) stackIn_11_4;
                            stackOut_11_5 = uk.field_l;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_13_5 = stackOut_11_5;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (hd) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = "" + ck.field_b;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            new java.net.URL((java.net.URL) (Object) stackIn_13_3, (String) (Object) (stackIn_13_5 + "&v1=" + hd.field_t + "&v2=" + hd.field_u + "&e=" + var11));
                            var5 = ((hd) (Object) stackIn_13_0).a((java.net.URL) (Object) stackIn_13_1, false);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var5.field_g != 0) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            nu.a(1L, 0);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var5.field_g == 1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var6 = (DataInputStream) var5.field_f;
                            int discarded$1 = var6.read();
                            var6.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract h a(byte param0);

    final static void a(boolean param0, String param1, int param2) {
        se.field_f = param0 ? true : false;
        ac.field_n = true;
        qc.field_a = new ro(rl.field_C, bv.field_t, param1, fh.field_i, se.field_f);
        rl.field_C.a((kb) (Object) qc.field_a, param2 ^ param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"BARBARIAN", "AVIANSIE", "GORILLA", "BARBARIANSPEARWOMAN", "DRAGON", "TXHAARKET", "DAGANNOTH", "PORTALMAGE", "PALADIN", "SARADOMINOWL", "MONK", "SARADOMINMAGE", "WHITEKNIGHT", "UNICORN", "CENTAURBOWMAN", "LION", "SARADOMINRANGER", "PRIEST", "ICYENE", "WEREWOLF", "SKELETON", "NECROMANCER", "ZAMORAKMAGE", "BLACKKNIGHT", "BLACKDEMON", "ZAMORAKRANGER", "HELLHOUND", "SEASLUG", "VYREWATCH", "PYRELORD", "TERRORBIRDGNOME", "WOLF", "DRUID", "BLACKGUARDDWARF", "DWARFCANNON", "MOSSGIANT", "VOIDKNIGHT", "TORTOISEGNOME", "GLIDERGNOME", "JADEVINE", "ENT", "FALCON", "BLACKBEAR", "ELFSONGSTRESS", "ELFSHIELDMAIDEN", "GRENWALL", "DIREWOLF", "ELVENPIKEMEN", "ELVENARCHER", "ELFLORD", "ELFLADY", "SHADOWCREATURE", "GOBLIN", "GOBLINHIGHPRIEST", "OGRE", "JOGRE", "MOGRE", "HOBGOBLIN", "OGRESHAMAN", "CYCLOPS", "ORK", "OGRESS", "OURG", "KALPHITEQUEEN", "JACKAL", "MUMMY", "LOCUST", "BEBADINNOMAD", "MENAPHITETHUG", "WARRIOROFICTHLARIN", "CROCODILE", "SCARABITEMAGE", "SPHINX", "ELIDINISELEMENTAL", "KINGBLACKDRAGON", "DWARFCANNON(cannon)", "PORTALMAGE(portal)", "", "", "", "", "BLUEDRAGON", "BARROWS AHRIM", "BARROWS DHAROK", "BARROWS GUTHAN", "BARROWS KARIL", "BARROWS TORAG", "BARROWS VERAC", "ZEMOUREGAL"};
        field_b = 0;
    }
}
