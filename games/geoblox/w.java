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
            field_b = null;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static nc a(String param0, rh param1, rh param2, boolean param3, String param4) {
        if (!param3) {
            field_b = null;
        }
        int var5 = param1.a((byte) 127, param0);
        int var6 = param1.a(param4, -107, var5);
        return pi.a(param2, var5, -128, param1, var6);
    }

    final static boolean a(boolean param0, int param1) {
        try {
            pk var4 = null;
            pk var5 = null;
            if (null == sd.field_B) {
                sd.field_B = ja.field_D.a(sd.field_x, ol.field_I, false);
            }
            if (param1 != 52) {
                field_d = null;
            }
            if (!(sd.field_B.field_a != 0)) {
                return false;
            }
            v.field_r = oa.a(param1 ^ -12500);
            kh.field_e = oa.a(param1 ^ -12500);
            if (1 != sd.field_B.field_a) {
                pk.field_l = qi.field_h;
            } else {
                try {
                    oc.field_e = new ba((java.net.Socket) sd.field_B.field_b, ja.field_D);
                    var4 = eh.field_d;
                    var5 = var4;
                    fj.field_q.field_f = 0;
                    var5.field_f = 0;
                    ad.field_o = param0 ? -2 : -1;
                    dc.field_b = param0 ? -2 : -1;
                    kg.field_n = param0 ? -2 : -1;
                    pk.field_l = gi.field_d;
                    ke.a(qe.field_b, true, ok.field_f, mk.field_l, (qc) (Object) fj.field_q);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_a = "Mouse over an icon for details";
        field_d = new ck(1, 2, 2, 0);
        field_e = "Countdown";
        field_b = new String[]{"menu_select", "jewel_1", "jewel_2", "jewel_3", "space_1", "space_2", "space_3", "sun_1", "sun_2", "sun_3", "baking_1", "baking_2", "baking_3", "germs_1", "germs_2", "germs_3", "sport_1", "sport_2", "sport_3", "sweets_1", "sweets_2", "sweets_3", "cry", "to_angry", "to_excited", "to_happy", "to_unhappy", "electric_shock", "bubble_swell", "button_bleep", "geom_rain", "geom_vanish", "bonus", "round_clear"};
    }
}
