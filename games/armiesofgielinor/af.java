/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class af {
    static boolean field_c;
    static String[] field_a;
    static int field_b;

    final static String a(mo param0, byte param1) {
        Object var2 = null;
        Object var3 = null;
        String var3_ref = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param0.field_q != null) {
                L2: {
                  var5 = param0.field_q;
                  var2 = var5;
                  var3 = var2;
                  var2 = var5;
                  var2 = var5;
                  if ((param0.field_p ^ -1) == -2) {
                    var2 = "<img=0>" + var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if ((param0.field_p ^ -1) != -3) {
                  break L1;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  var3 = var2;
                  var3 = var2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 == 103) {
                break L3;
              } else {
                field_c = false;
                break L3;
              }
            }
            L4: {
              L5: {
                var3_ref = "";
                if (2 == param0.field_b) {
                  break L5;
                } else {
                  L6: {
                    if (0 != param0.field_b) {
                      break L6;
                    } else {
                      if (!bq.field_c) {
                        break L6;
                      } else {
                        var3_ref = "[" + sa.field_c + "] ";
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (-2 == (param0.field_b ^ -1)) {
                      var3_ref = "[" + fo.a(param1 + 4697, cv.field_m, new String[]{param0.field_k}) + "] ";
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
                        var3_ref = "[" + ur.field_C + "] ";
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if ((param0.field_b ^ -1) != -4) {
                      break L9;
                    } else {
                      var3_ref = "[#" + param0.field_k + "] ";
                      break L9;
                    }
                  }
                  if (!param0.field_f) {
                    var3_ref = var3_ref + (String) (var2) + ": ";
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              if (!param0.field_f) {
                L10: {
                  L11: {
                    if (0 != param0.field_a) {
                      break L11;
                    } else {
                      if (param0.field_e == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var3_ref = fo.a(param1 + 4697, ov.field_l, new String[]{(String) (var2)});
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L10;
                  }
                }
                var3_ref = fo.a(param1 + 4697, ta.field_Q, new String[]{(String) (var2)});
                break L4;
              } else {
                break L4;
              }
            }
            stackOut_32_0 = (String) (var3_ref);
            stackIn_33_0 = stackOut_32_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = var2;
            stackOut_34_1 = new StringBuilder().append("af.H(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        return stackIn_33_0;
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
            int discarded$1 = 0;
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            hd stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            hd stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            hd stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_int = 16 % ((7 - param1) / 62);
                  var4 = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var4 = qv.a(0, param0);
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 != null) {
                        var4 = var4 + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = var4 + param2;
                    break L2;
                  }
                }
                wq.a(var4, false);
                var8 = dv.a(var4, -75, ":", "%3a");
                var9 = dv.a(var8, -110, "@", "%40");
                var10 = dv.a(var9, -68, "&", "%26");
                var11 = dv.a(var10, -102, "#", "%23");
                if (vu.field_L != null) {
                  L4: {
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
                      stackOut_12_0 = (hd) ((Object) stackIn_12_0);
                      stackOut_12_1 = null;
                      stackOut_12_2 = null;
                      stackOut_12_3 = (java.net.URL) ((Object) stackIn_12_3);
                      stackOut_12_4 = (StringBuilder) ((Object) stackIn_12_4);
                      stackOut_12_5 = "" + ck.field_b;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      break L4;
                    } else {
                      stackOut_11_0 = (hd) ((Object) stackIn_11_0);
                      stackOut_11_1 = null;
                      stackOut_11_2 = null;
                      stackOut_11_3 = (java.net.URL) ((Object) stackIn_11_3);
                      stackOut_11_4 = (StringBuilder) ((Object) stackIn_11_4);
                      stackOut_11_5 = uk.field_l;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      break L4;
                    }
                  }
                  var5 = ((hd) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, stackIn_13_5 + "&v1=" + hd.field_t + "&v2=" + hd.field_u + "&e=" + var11), false);
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var5.field_g != 0) {
                          break L7;
                        } else {
                          nu.a(1L, 0);
                          if (var7 != 0) {
                            break L6;
                          } else {
                            if (var7 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var5.field_g == 1) {
                        break L6;
                      } else {
                        return;
                      }
                    }
                    var6 = (DataInputStream) (var5.field_f);
                    discarded$1 = var6.read();
                    var6.close();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract h a(byte param0);

    final static void a(boolean param0, String param1, int param2) {
        try {
            se.field_f = param0;
            ac.field_n = true;
            qc.field_a = new ro(rl.field_C, bv.field_t, param1, fh.field_i, se.field_f);
            rl.field_C.a(qc.field_a, param2 ^ param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "af.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[]{"BARBARIAN", "AVIANSIE", "GORILLA", "BARBARIANSPEARWOMAN", "DRAGON", "TXHAARKET", "DAGANNOTH", "PORTALMAGE", "PALADIN", "SARADOMINOWL", "MONK", "SARADOMINMAGE", "WHITEKNIGHT", "UNICORN", "CENTAURBOWMAN", "LION", "SARADOMINRANGER", "PRIEST", "ICYENE", "WEREWOLF", "SKELETON", "NECROMANCER", "ZAMORAKMAGE", "BLACKKNIGHT", "BLACKDEMON", "ZAMORAKRANGER", "HELLHOUND", "SEASLUG", "VYREWATCH", "PYRELORD", "TERRORBIRDGNOME", "WOLF", "DRUID", "BLACKGUARDDWARF", "DWARFCANNON", "MOSSGIANT", "VOIDKNIGHT", "TORTOISEGNOME", "GLIDERGNOME", "JADEVINE", "ENT", "FALCON", "BLACKBEAR", "ELFSONGSTRESS", "ELFSHIELDMAIDEN", "GRENWALL", "DIREWOLF", "ELVENPIKEMEN", "ELVENARCHER", "ELFLORD", "ELFLADY", "SHADOWCREATURE", "GOBLIN", "GOBLINHIGHPRIEST", "OGRE", "JOGRE", "MOGRE", "HOBGOBLIN", "OGRESHAMAN", "CYCLOPS", "ORK", "OGRESS", "OURG", "KALPHITEQUEEN", "JACKAL", "MUMMY", "LOCUST", "BEBADINNOMAD", "MENAPHITETHUG", "WARRIOROFICTHLARIN", "CROCODILE", "SCARABITEMAGE", "SPHINX", "ELIDINISELEMENTAL", "KINGBLACKDRAGON", "DWARFCANNON(cannon)", "PORTALMAGE(portal)", "", "", "", "", "BLUEDRAGON", "BARROWS AHRIM", "BARROWS DHAROK", "BARROWS GUTHAN", "BARROWS KARIL", "BARROWS TORAG", "BARROWS VERAC", "ZEMOUREGAL"};
        field_b = 0;
    }
}
