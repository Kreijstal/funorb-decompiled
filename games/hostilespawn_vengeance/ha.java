/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends cn {
    static kd field_w;
    static String field_x;
    static int field_v;
    static String field_y;
    private gm field_u;
    static int field_t;
    private gm[] field_s;

    public ha() {
        ((ha) this).field_s = new gm[6];
        ((ha) this).field_u = new gm();
        ((ha) this).field_s[0] = new gm();
        gm var1 = new gm();
        var1.b(122);
    }

    final gm a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        ((ha) this).field_s[param0] = new gm();
        return new gm();
    }

    final void a(boolean param0, bd param1) {
        gm[] var3 = null;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        gm[] var7 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var7 = ((ha) this).field_s;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_v = 103;
                break L1;
              }
            }
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_a = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = 40 / ((-19 - param0) / 41);
        hj.a(param1, 91);
        qa.a(false, (byte) -62, jj.field_i);
    }

    ha(ha param0, boolean param1) {
        this();
        param0.a(param1, 0, (ha) this);
    }

    private final void a(boolean param0, int param1, ha param2) {
        int var4 = 0;
        gm var5 = null;
        gm var6 = null;
        int var7 = 0;
        gm stackIn_8_0 = null;
        gm stackIn_9_0 = null;
        gm stackIn_10_0 = null;
        gm stackIn_10_1 = null;
        gm stackOut_7_0 = null;
        gm stackOut_9_0 = null;
        gm stackOut_9_1 = null;
        gm stackOut_8_0 = null;
        gm stackOut_8_1 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        super.a(-110, (cn) (Object) param2);
        if (param1 == 0) {
          L0: {
            if (param0) {
              var4 = 0;
              L1: while (true) {
                if (6 <= var4) {
                  break L0;
                } else {
                  var5 = ((ha) this).field_s[var4];
                  if (var5 == null) {
                    param2.field_s[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = param2.field_s[var4];
                      stackOut_7_0 = (gm) var5;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var6 != null) {
                        stackOut_9_0 = (gm) (Object) stackIn_9_0;
                        stackOut_9_1 = (gm) var6;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        param2.field_s[var4] = new gm();
                        stackOut_8_0 = (gm) (Object) stackIn_8_0;
                        stackOut_8_1 = new gm();
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    ((gm) (Object) stackIn_10_0).a(stackIn_10_1, (byte) 33);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              kf.a((Object[]) (Object) ((ha) this).field_s, 0, (Object[]) (Object) param2.field_s, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        if (param1 != -10454) {
            field_w = null;
        }
        int var12 = uj.field_p.field_e + 36;
        int var13 = 12 + uj.field_p.field_g;
        int var14 = -var12 + am.field_e;
        int var4 = var14 << -256246014;
        int var15 = -var13 + jg.field_l;
        int var6 = param0 << -255579742;
        int var8 = 8;
        int var11 = 1;
        int var7 = param3 << 726809954;
        int var5 = var15 << 161869730;
        int var9 = 16;
        int var10 = 1;
        int var16 = (32 + -param2.field_e) * 200 / 32;
        km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, 112, var4, var16, var8);
        int var17 = (int)((double)var8 / 1.0);
        int var18 = (int)((double)var9 / 1.2);
        bh.a((byte) var10, wk.field_d, (byte) var11, var17, var4, var5, var7, var18, var16, var6, 9233);
    }

    final static void b(int param0) {
        double var2 = 0.0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        ge.b();
        pk.field_i = new int[260];
        ih.field_w = 11;
        int var1 = 0;
        if (param0 != 255) {
            return;
        }
        while (-257 < (var1 ^ -1)) {
            var2 = 15.0;
            pk.field_i[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
            var1++;
        }
        int var5 = 256;
        var1 = var5;
        while (pk.field_i.length > var5) {
            pk.field_i[var5] = 255;
            var5++;
        }
    }

    final void a(int param0, bd[] param1, byte param2) {
        int var4 = param0;
        if (!(((ha) this).field_s[var4] != null)) {
            ((ha) this).field_s[var4] = new gm();
        }
        if (param2 >= -4) {
            field_w = null;
        }
        ((ha) this).field_s[param0].field_c = param1;
    }

    final void a(boolean param0, bd[] param1) {
        gm[] var3 = null;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var3 = ((ha) this).field_s;
          var4 = 0;
          if (!param0) {
            break L0;
          } else {
            var7 = null;
            ((ha) this).a(-43, -76, 69, (ag) null, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_c = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static StringBuilder a(char param0, int param1, byte param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        int var4 = param3.length();
        param3.setLength(param1);
        for (var5 = var4; var5 < param1; var5++) {
            param3.setCharAt(var5, param0);
        }
        if (param2 > -126) {
            field_v = -44;
        }
        return param3;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_y = null;
        field_w = null;
        field_x = null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        gm var7 = null;
        gm var9 = null;
        Object var10 = null;
        ph var11 = null;
        gm var12 = null;
        gm var13 = null;
        gm var14 = null;
        gm var15 = null;
        ag stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ag stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof ph)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ag) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ag) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (ph) (Object) stackIn_3_0;
          sf.a(param1 + param3.field_v + param3.field_s, param3.field_m + param0, param3.field_x + param0 - -param3.field_m, param1 - -param3.field_v, true);
          if (var11 == null) {
            break L1;
          } else {
            param4 = param4 & var11.field_D;
            break L1;
          }
        }
        L2: {
          var7 = ((ha) this).field_s[0];
          ((ha) this).field_u.b(param2 + -15305);
          var7.a(param3, ((ha) this).field_u, (byte) 88, (ha) this, param0, param1);
          if (var11 == null) {
            break L2;
          } else {
            L3: {
              if (!var11.field_A) {
                break L3;
              } else {
                var12 = ((ha) this).field_s[1];
                if (var12 != null) {
                  var12.a(param3, ((ha) this).field_u, (byte) 95, (ha) this, param0, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (!var11.field_u) {
              break L2;
            } else {
              L4: {
                var13 = ((ha) this).field_s[3];
                if (-1 == (var11.field_r ^ -1)) {
                  break L4;
                } else {
                  if (var13 == null) {
                    break L4;
                  } else {
                    var13.a(param3, ((ha) this).field_u, (byte) 57, (ha) this, param0, param1);
                    break L2;
                  }
                }
              }
              var9 = ((ha) this).field_s[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a(param3, ((ha) this).field_u, (byte) 106, (ha) this, param0, param1);
                break L2;
              }
            }
          }
        }
        L5: {
          if (param3.g(param2 ^ -8049)) {
            var14 = ((ha) this).field_s[5];
            if (var14 == null) {
              break L5;
            } else {
              var14.a(param3, ((ha) this).field_u, (byte) 81, (ha) this, param0, param1);
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param4) {
            break L6;
          } else {
            var15 = ((ha) this).field_s[4];
            if (var15 != null) {
              var15.a(param3, ((ha) this).field_u, (byte) 82, (ha) this, param0, param1);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          ((ha) this).field_u.a((ha) this, 126, param1, param3, param0);
          if (param2 == 15430) {
            break L7;
          } else {
            var10 = null;
            ((ha) this).a(-65, (bd[]) null, (byte) -86);
            break L7;
          }
        }
        eh.b(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "<col=ffffff>Security<nbsp>pass</col><br>This badge allows access to high-security areas of modern space stations.";
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
