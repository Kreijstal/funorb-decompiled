/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class pr extends ma {
    int field_w;
    int field_A;
    int field_E;
    jg field_C;
    int field_G;
    static int field_l;
    int field_B;
    int field_y;
    g field_u;
    int field_s;
    int field_v;
    int field_m;
    int field_q;
    int field_z;
    int field_F;
    int field_t;
    int field_r;
    int field_D;
    nb field_o;
    int field_n;
    int field_p;
    kp field_x;

    final static void c(byte param0) {
        if (!(null == ta.field_h)) {
            qf.field_d.a((kd) (Object) ta.field_h);
        }
        ta.field_h = null;
        mp.field_R = null;
        int var1 = 107 / ((24 - param0) / 56);
        wm.field_Xb = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        CharSequence var3 = null;
        if (param0 != -23989) {
            return;
        }
        String var2 = param1.getParameter("username");
        if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            // ifeq L38
        } else {
            return;
        }
    }

    final static void a(int[] param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        L0: {
          var6 = Pool.field_O;
          fo.field_c = new int[jd.field_h.length][5][3];
          var2 = param0[9] >> -343778814;
          var3 = param0[10] >> -1707735358;
          var4 = var2 * var2 - -(var3 * var3) >> -392414640;
          if (-1 <= (var4 ^ -1)) {
            var3 = 65536;
            var2 = 0;
            break L0;
          } else {
            var5 = rf.a(var4, -127);
            var2 = lh.a(var5, (byte) -81, (long)var2);
            var3 = lh.a(var5, (byte) -121, (long)var3);
            break L0;
          }
        }
        L1: {
          if (!param1) {
            break L1;
          } else {
            var7 = null;
            pr.a(-15, (java.applet.Applet) null);
            break L1;
          }
        }
        var2 = var2 >> 3;
        var3 = var3 >> 3;
        var8 = 0;
        var4 = var8;
        L2: while (true) {
          if (var8 >= fo.field_c.length) {
            return;
          } else {
            L3: {
              fo.field_c[var8][0][0] = var2;
              fo.field_c[var8][0][1] = var3;
              fo.field_c[var8][0][2] = jd.field_h[var8];
              fo.field_c[var8][1][0] = var2 >> 1390158465;
              fo.field_c[var8][1][1] = var3 >> -1764583103;
              fo.field_c[var8][1][2] = jd.field_h[var8];
              fo.field_c[var8][2][0] = 0;
              fo.field_c[var8][2][1] = 0;
              fo.field_c[var8][2][2] = jd.field_h[var8];
              fo.field_c[var8][3][0] = -var2 >> -702933407;
              fo.field_c[var8][3][1] = -var3 >> -1092755231;
              fo.field_c[var8][3][2] = jd.field_h[var8];
              fo.field_c[var8][4][0] = -var2;
              fo.field_c[var8][4][1] = -var3;
              fo.field_c[var8][4][2] = jd.field_h[var8];
              ga.a(param0, fo.field_c[var8][0], false);
              ga.a(param0, fo.field_c[var8][1], param1);
              ga.a(param0, fo.field_c[var8][2], false);
              ga.a(param0, fo.field_c[var8][3], false);
              ga.a(param0, fo.field_c[var8][4], false);
              if (fo.field_c[var8][0][2] >= 0) {
                break L3;
              } else {
                fo.field_c[var8][0][1] = qh.field_f;
                break L3;
              }
            }
            L4: {
              if (-1 < (fo.field_c[var8][1][2] ^ -1)) {
                fo.field_c[var8][1][1] = qh.field_f;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 < (fo.field_c[var8][2][2] ^ -1)) {
                fo.field_c[var8][2][1] = qh.field_f;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((fo.field_c[var8][3][2] ^ -1) <= -1) {
                break L6;
              } else {
                fo.field_c[var8][3][1] = qh.field_f;
                break L6;
              }
            }
            if ((fo.field_c[var8][4][2] ^ -1) > -1) {
              fo.field_c[var8][4][1] = qh.field_f;
              var8++;
              continue L2;
            } else {
              var8++;
              continue L2;
            }
          }
        }
    }

    final void a(int param0) {
        ((pr) this).field_u = null;
        if (param0 != 2) {
            ((pr) this).a(-106);
        }
        ((pr) this).field_x = null;
        ((pr) this).field_C = null;
        ((pr) this).field_o = null;
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, byte param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            java.net.URL stackIn_47_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_46_0 = null;
            var5 = param1.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (-1 < var7_int) {
                    break L1;
                  } else {
                    if (-1 <= param0) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 >= (var7_int ^ -1)) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int ^ -1) > -1) {
                    break L3;
                  } else {
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 - -1);
                if (var7_int < 0) {
                  break L4;
                } else {
                  if (param4 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                if (param3 == 63) {
                  break L6;
                } else {
                  field_l = 117;
                  break L6;
                }
              }
              L7: {
                StringBuilder discarded$11 = var7.append(var5.substring(0, var6));
                if (-1 > (param0 ^ -1)) {
                  StringBuilder discarded$12 = var7.append("/l=");
                  StringBuilder discarded$13 = var7.append(Integer.toString(param0));
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param2 == null) {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (0 < param4.length()) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L8;
                    } else {
                      if (param4 == null) {
                        break L8;
                      } else {
                        if (0 >= param4.length()) {
                          break L8;
                        } else {
                          StringBuilder discarded$16 = var7.append("/s=");
                          StringBuilder discarded$17 = var7.append(param4);
                          break L8;
                        }
                      }
                    }
                  }
                } else {
                  if (param4 == null) {
                    break L8;
                  } else {
                    if (0 >= param4.length()) {
                      break L8;
                    } else {
                      StringBuilder discarded$18 = var7.append("/s=");
                      StringBuilder discarded$19 = var7.append(param4);
                      break L8;
                    }
                  }
                }
              }
              L9: {
                if (var6 < var5.length()) {
                  StringBuilder discarded$20 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                } else {
                  StringBuilder discarded$21 = var7.append(47);
                  break L9;
                }
              }
              try {
                stackOut_46_0 = new java.net.URL(param1, var7.toString());
                stackIn_47_0 = stackOut_46_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_47_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pr() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 6348;
    }
}
