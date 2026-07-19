/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class w {
    static char[] field_c;
    static boolean field_f;
    static ck field_d;
    static String field_a;
    static String[] field_b;
    static String field_e;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param7--;
        L0: while (true) {
          if (param7 < 0) {
            return;
          } else {
            var9 = param6 - 1;
            L1: while (true) {
              if (var9 < 0) {
                param1 = param1 + param8;
                param7--;
                continue L0;
              } else {
                if (param0[param1] > 1) {
                  L2: {
                    param2 = param1 - 1;
                    param3 = param1 + 1;
                    param4 = param1 - vb.field_f;
                    param5 = param1 + vb.field_f;
                    if (param0[param4 + 1] != 0) {
                      break L2;
                    } else {
                      param0[param4 + 1] = 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0[param5 + 1] != 0) {
                      break L3;
                    } else {
                      param0[param5 + 1] = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (param0[param4 - 1] != 0) {
                      break L4;
                    } else {
                      param0[param4 - 1] = 1;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0[param5 - 1] != 0) {
                      break L5;
                    } else {
                      param0[param5 - 1] = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (param0[param2] != 0) {
                      break L6;
                    } else {
                      param0[param2] = 1;
                      break L6;
                    }
                  }
                  L7: {
                    if (param0[param3] != 0) {
                      break L7;
                    } else {
                      param0[param3] = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (param0[param4] != 0) {
                      break L8;
                    } else {
                      param0[param4] = 1;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0[param5] != 0) {
                      break L9;
                    } else {
                      param0[param5] = 1;
                      break L9;
                    }
                  }
                  L10: {
                    if (param0[param2 - 1] != 0) {
                      break L10;
                    } else {
                      param0[param2 - 1] = 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (param0[param3 + 1] != 0) {
                      break L11;
                    } else {
                      param0[param3 + 1] = 1;
                      break L11;
                    }
                  }
                  L12: {
                    if (param0[param4 - vb.field_f] != 0) {
                      break L12;
                    } else {
                      param0[param4 - vb.field_f] = 1;
                      break L12;
                    }
                  }
                  if (param0[param5 + vb.field_f] == 0) {
                    param0[param5 + vb.field_f] = 1;
                    param1++;
                    var9--;
                    continue L1;
                  } else {
                    param1++;
                    var9--;
                    continue L1;
                  }
                } else {
                  param1++;
                  var9--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 < 51) {
            field_b = (String[]) null;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static nc a(String param0, rh param1, rh param2, boolean param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            var5_int = param1.a((byte) 127, param0);
            var6 = param1.a(param4, -107, var5_int);
            stackOut_2_0 = pi.a(param2, var5_int, -128, param1, var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("w.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            pk var4 = null;
            pk var5 = null;
            if (null == sd.field_B) {
                sd.field_B = ja.field_D.a(sd.field_x, ol.field_I, false);
            }
            if (param1 != 52) {
                field_d = (ck) null;
            }
            if (!(sd.field_B.field_a != 0)) {
                return false;
            }
            long dupTemp$0 = oa.a(param1 ^ -12500);
            v.field_r = dupTemp$0;
            kh.field_e = dupTemp$0;
            if (1 != sd.field_B.field_a) {
                pk.field_l = qi.field_h;
            } else {
                try {
                    oc.field_e = new ba((java.net.Socket) (sd.field_B.field_b), ja.field_D);
                    var4 = eh.field_d;
                    var5 = var4;
                    fj.field_q.field_f = 0;
                    var5.field_f = 0;
                    ad.field_o = param0 ? -2 : -1;
                    dc.field_b = param0 ? -2 : -1;
                    kg.field_n = param0 ? -2 : -1;
                    pk.field_l = gi.field_d;
                    ke.a(qe.field_b, true, ok.field_f, mk.field_l, fj.field_q);
                    cm.a(param1 ^ -53, -1);
                } catch (IOException iOException) {
                    pk.field_l = qi.field_h;
                }
            }
            sd.field_B = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        var8 = -param5;
        L0: while (true) {
          if (var8 >= 0) {
            return;
          } else {
            var9 = param3 + param4 - 3;
            L1: while (true) {
              if (param3 >= var9) {
                var9 += 3;
                L2: while (true) {
                  if (param3 >= var9) {
                    param3 = param3 + param6;
                    param2 = param2 + param7;
                    var8++;
                    continue L0;
                  } else {
                    if (param0[param3] == 0) {
                      param0[param3] = param1[param2];
                      param3++;
                      param2++;
                      continue L2;
                    } else {
                      param3++;
                      param2++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  if (param0[param3] != 0) {
                    break L3;
                  } else {
                    param0[param3] = param1[param2];
                    break L3;
                  }
                }
                L4: {
                  param3++;
                  param2++;
                  if (param0[param3] != 0) {
                    break L4;
                  } else {
                    param0[param3] = param1[param2];
                    break L4;
                  }
                }
                L5: {
                  param3++;
                  param2++;
                  if (param0[param3] != 0) {
                    break L5;
                  } else {
                    param0[param3] = param1[param2];
                    break L5;
                  }
                }
                param3++;
                param2++;
                if (param0[param3] == 0) {
                  param0[param3] = param1[param2];
                  param3++;
                  param2++;
                  continue L1;
                } else {
                  param3++;
                  param2++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(dm param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param1 = param1 + param0.field_u;
          param2 = param2 + param0.field_p;
          var3 = param1 + param2 * vb.field_f;
          var4 = 0;
          var5 = param0.field_m;
          var6 = param0.field_r;
          var7 = vb.field_f - var6;
          var8 = 0;
          if (param2 >= vb.field_i) {
            break L0;
          } else {
            var9 = vb.field_i - param2;
            var5 = var5 - var9;
            param2 = vb.field_i;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vb.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= vb.field_d) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - vb.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= vb.field_e) {
            break L2;
          } else {
            var9 = vb.field_e - param1;
            var6 = var6 - var9;
            param1 = vb.field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= vb.field_k) {
            break L3;
          } else {
            var9 = param1 + var6 - vb.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              w.a(vb.field_c, param0.field_v, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void a(int param0) {
        int var1 = -58 % ((param0 - -28) / 50);
    }

    static {
        field_c = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_a = "Mouse over an icon for details";
        field_d = new ck(1, 2, 2, 0);
        field_e = "Countdown";
        field_b = new String[]{"menu_select", "jewel_1", "jewel_2", "jewel_3", "space_1", "space_2", "space_3", "sun_1", "sun_2", "sun_3", "baking_1", "baking_2", "baking_3", "germs_1", "germs_2", "germs_3", "sport_1", "sport_2", "sport_3", "sweets_1", "sweets_2", "sweets_3", "cry", "to_angry", "to_excited", "to_happy", "to_unhappy", "electric_shock", "bubble_swell", "button_bleep", "geom_rain", "geom_vanish", "bonus", "round_clear"};
    }
}
