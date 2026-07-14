/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    static String field_c;
    static boolean field_d;
    il[] field_h;
    static wk[] field_e;
    static String field_a;
    static vi field_b;
    static wk field_f;
    static String field_i;
    static int field_g;

    final static boolean a(cm param0, cm param1, int param2, cm param3) {
        if (param0.a(true)) {
            // ifeq L22
        } else {
            return false;
        }
        if (param3.a(true)) {
            // ifeq L46
        } else {
            return false;
        }
        if (param1.a(true)) {
            // ifeq L70
        } else {
            return false;
        }
        if (param2 != -1) {
            return false;
        }
        return true;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        il var6 = null;
        int var7 = 0;
        int var8 = SteelSentinels.field_G;
        if (null != ((da) this).field_h) {
            // if_icmpeq L38
            // if_icmplt L38
        } else {
            return -1;
        }
        if (((da) this).field_h[-1 + ((da) this).field_h.length].field_a < param2) {
            return -1;
        }
        if (!(1 != ((da) this).field_h.length)) {
            return ((da) this).field_h[0].a((byte) 105, param1);
        }
        int var4 = param0;
        for (var5 = 0; var5 < ((da) this).field_h.length; var5++) {
            var6 = ((da) this).field_h[var5];
            if (var6.field_h <= param2) {
                if (!(var6.field_a < param2)) {
                    var7 = var6.a((byte) 125, param1);
                    if (!(0 != (var7 ^ -1))) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_f.length);
        }
        return -1;
    }

    final static void a(cm param0, int param1, int param2, wg param3) {
        if (param1 <= 67) {
            da.a(true, -102);
        }
        vc.field_c = param2 * sj.a((byte) -108) / 1000;
        ea.a(param0, 1728986241);
        nl.a((byte) 90, param0);
        ah.a(77, param0);
        lk.a(true);
        ee.a(true);
        vn.field_h = 0 - vc.field_c;
    }

    final int b(byte param0) {
        int var2 = 0;
        il[] var3 = null;
        int var4 = 0;
        il var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          if (param0 == -100) {
            break L0;
          } else {
            field_g = -5;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != ((da) this).field_h) {
            var3 = ((da) this).field_h;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(-1);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static ah a(String param0, byte param1) {
        String var2 = null;
        ah var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = SteelSentinels.field_G;
        if (null != db.field_h) {
          L0: {
            var6 = (CharSequence) (Object) param0;
            var2 = ui.a(param1 ^ -42, var6);
            if (var2 == null) {
              var2 = (String) (Object) var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 == -41) {
            var3 = (ah) (Object) db.field_h.a((long)var2.hashCode(), (byte) -81);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_dc;
                  var4 = ui.a(1, var7);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_dc;
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (ah) (Object) db.field_h.c((byte) 116);
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        il var4 = null;
        int var5 = SteelSentinels.field_G;
        if (param0 != -1) {
            Object var6 = null;
            boolean discarded$0 = da.a((cm) null, (cm) null, -88, (cm) null);
        }
        for (var3 = 0; var3 < ((da) this).field_h.length; var3++) {
            var4 = ((da) this).field_h[var3];
            if (!(var4.field_f.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_f.length);
        }
        return ((da) this).field_h.length;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 24) {
            break L0;
          } else {
            int discarded$2 = ((da) this).a(114, 23, 65);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((da) this).field_h == null) {
              break L2;
            } else {
              if ((((da) this).field_h.length ^ -1) < -1) {
                stackOut_6_0 = ((da) this).field_h[((da) this).field_h.length + -1].field_a - ((da) this).field_h[0].field_h;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = SteelSentinels.field_G;
          var5 = 0;
          var6 = 0;
          var7 = param0.length();
          if (param3 >= 94) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (var7 <= var8) {
            if ((var5 ^ -1) >= -1) {
              return 0;
            } else {
              return (-param2 + param1 << -2127364504) / var5;
            }
          } else {
            var9 = param0.charAt(var8);
            if (var9 != 60) {
              if (var9 == 62) {
                var6 = 0;
                var8++;
                continue L1;
              } else {
                if (var6 == 0) {
                  if (32 == var9) {
                    var5++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            } else {
              var6 = 1;
              var8++;
              continue L1;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        il var5 = null;
        int var6 = SteelSentinels.field_G;
        if (param0 != 1) {
            field_b = null;
        }
        il[] var7 = ((da) this).field_h;
        il[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_f.length > param1) {
                return var5.field_f[param1];
            }
            param1 = param1 - (var5.field_f.length - 1);
        }
        return 0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 25104) {
            return;
        }
        if (jc.a(2)) {
            param0 = false;
        }
        bf.a((byte) -112, param0);
        if (di.field_b) {
            pb.f(fg.field_Tb.field_d.field_Y, fg.field_Tb.field_d.field_eb, fg.field_Tb.field_d.field_zb, fg.field_Tb.field_d.field_Lb);
            fg.field_Tb.field_d.a(param0, (byte) 127);
        }
        il.a(param0, (byte) -125);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_i = null;
        field_b = null;
        if (!param0) {
            field_b = null;
        }
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This is your RuneScape clan if you have one.";
        field_a = "Invalid date";
        field_i = ", and was finished off by a rock";
    }
}
