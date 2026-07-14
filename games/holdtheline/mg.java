/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private boolean field_j;
    private boolean field_d;
    static boolean field_c;
    static String field_i;
    static jg[] field_g;
    static java.awt.Frame field_f;
    private hj[] field_h;
    static String field_e;
    static String field_k;
    private int field_a;
    private hj field_b;

    final static void a(int param0) {
        int var1 = (cf.field_w ^ -1) == 0 ? 0 : cf.field_w;
        ca.field_r = (kj.b(2, 10) ^ -1) == param0 ? 6 : 5;
        nm.field_b = ca.field_r == 6 ? tk.field_c[5][var1] : tk.field_c[var1][0];
        if (!pd.a(nm.field_b, true)) {
            qn.field_k = false;
            fl.field_j = false;
            on.field_r = -1;
            bl.field_r = null;
            sk.field_i = -1;
        } else {
            bl.field_r = new sg(nm.field_b, ca.field_r, false, false, -1, -1);
            ca.field_r = -1;
        }
        kk.field_j = false;
    }

    final mg a(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hj var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = HoldTheLine.field_D;
        var10 = ((mg) this).field_b.e();
        var12 = var10.field_z;
        var11 = var12;
        var4 = var11;
        var5 = param1 & 16711935;
        var6 = param1 & 65280;
        var7 = 0;
        if (param0 == -4503) {
          L0: while (true) {
            if (var7 >= var12.length) {
              return new mg(var10, ((mg) this).field_a, ((mg) this).field_j, ((mg) this).field_d);
            } else {
              var8 = var12[var7];
              if (-1 != (var8 ^ -1)) {
                if ((65535 & var8) == var8 >> -1425068536) {
                  var8 = var8 & 255;
                  var4[var7] = 1 + (pk.a(16711680, var6 * var8) + pk.a(var5 * var8, -16712192) >>> -113251128);
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        this.b(27854);
        ((mg) this).field_a = param0;
    }

    final hj a(float param0, int param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        param0 = (float)((double)param0 * 10.185916357881302);
        if (param1 != 27788) {
            return null;
        }
        for (var3 = Math.round(param0); (var3 ^ -1) > -1; var3 += 64) {
        }
        while (var3 >= 64) {
            var3 -= 64;
        }
        return this.a(var3, (byte) 120);
    }

    final static int a(qi param0, String param1, String[] param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = HoldTheLine.field_D;
          var5 = 62 / ((param3 - 29) / 60);
          var6 = param0.a(param1);
          if (param4 < var6) {
            break L0;
          } else {
            if (0 == (param1.indexOf("<br>") ^ -1)) {
              param2[0] = (String) (Object) param2;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var7 = (-1 + (param4 + var6)) / param4;
        param4 = var6 / var7;
        var7 = 0;
        var8 = 0;
        var9 = param1.length();
        var10 = 0;
        L1: while (true) {
          if (var10 >= var9) {
            L2: {
              if (var8 >= var9) {
                break L2;
              } else {
                var7++;
                param2[var7] = param1.substring(var8, var9).trim();
                break L2;
              }
            }
            return var7;
          } else {
            L3: {
              L4: {
                var11 = param1.charAt(var10);
                if (32 == var11) {
                  break L4;
                } else {
                  if (var11 == 45) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var12 = param1.substring(var8, 1 + var10).trim();
              var13 = param0.a(var12);
              if (param4 > var13) {
                break L3;
              } else {
                var8 = var10 - -1;
                var7++;
                param2[var7] = var12;
                break L3;
              }
            }
            if (62 == var11) {
              if (param1.regionMatches(-3 + var10, "<br>", 0, 4)) {
                var7++;
                param2[var7] = param1.substring(var8, -3 + var10).trim();
                var8 = var10 + 1;
                var10++;
                continue L1;
              } else {
                var10++;
                continue L1;
              }
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        la var3 = null;
        if (param1 == null) {
            return null;
        }
        if (!(-137 <= (param1.length ^ -1))) {
            var3 = new la();
            ((ej) (Object) var3).a(95, param1);
            return (Object) (Object) var3;
        }
        if (param0 <= 93) {
            return null;
        }
        if (!param2) {
            return (Object) (Object) param1;
        }
        return (Object) (Object) sj.a(param1, (byte) -69);
    }

    public static void a(byte param0) {
        field_g = null;
        field_k = null;
        if (param0 != -28) {
            return;
        }
        field_i = null;
        field_e = null;
        field_f = null;
    }

    private final void b(int param0) {
        ((mg) this).field_h = new hj[64];
        if (param0 != 27854) {
            this.b(85);
        }
    }

    private final hj a(int param0, byte param1) {
        int var5 = 0;
        int var4 = 0;
        hj var6 = null;
        int var3 = 40 % ((2 - param1) / 63);
        if (((mg) this).field_h[param0] != null) {
        } else {
            var5 = ((mg) this).field_b.field_o - -((mg) this).field_b.field_v;
            var4 = ((mg) this).field_b.field_o - -((mg) this).field_b.field_v;
            var6 = new hj(var4, var5);
            vb.a(-128, var6);
            if (((mg) this).field_d) {
                ((mg) this).field_b.a(15, 16384 + param0 * 1024, ((mg) this).field_a, var4 >> -2135304671, var5 >> -1038939487);
            } else {
                ((mg) this).field_b.b(var4 >> -1637533279, var5 >> -229593983, 16384 + param0 * 1024, ((mg) this).field_a);
            }
            if (!((mg) this).field_j) {
                var6.c();
            }
            ((mg) this).field_h[param0] = new hj(var6.field_s, var6.field_y);
            ((mg) this).field_h[param0].field_z = var6.field_z;
            ug.b(-1);
        }
        return ((mg) this).field_h[param0];
    }

    mg(hj param0, boolean param1, boolean param2) {
        ((mg) this).field_d = param2 ? true : false;
        ((mg) this).field_j = param1 ? true : false;
        ((mg) this).field_b = param0;
        ((mg) this).a(4096, false);
    }

    mg(hj param0, int param1, boolean param2, boolean param3) {
        ((mg) this).field_j = param2 ? true : false;
        ((mg) this).field_d = param3 ? true : false;
        ((mg) this).field_b = param0;
        ((mg) this).a(param1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = "Members";
        field_i = "Quit";
        field_k = "to keep fullscreen or";
    }
}
