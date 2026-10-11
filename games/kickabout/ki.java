/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends am {
    int field_v;
    static mb field_n;
    up[] field_s;
    byte field_o;
    int field_u;
    int field_r;
    static ut field_q;
    gr field_t;
    byte field_p;

    final static int a(int param0, byte param1, int param2) {
        if (param1 > -24) {
          field_n = (mb) null;
        }
        if (param2 >= 2) {
          return 2;
        }
        if (5 > param0) {
          return 0;
        }
        return 1;
    }

    final static String g(byte param0) {
        if (!(hl.field_d >= 2)) {
          return sr.field_c;
        }
        if (null != qq.field_H) {
          if (!qq.field_H.d(-42)) {
            return ks.field_g;
          }
          return ep.field_e;
        }
        int var1 = 27 % ((param0 + 48) / 56);
        if (!bw.field_b.d(-78)) {
          return nu.field_M;
        }
        if (!bw.field_b.a(false, "commonui")) {
          return bh.field_q + " - " + bw.field_b.a("commonui", -16248) + "%";
        }
        if (!gs.field_c.d(-122)) {
          return te.field_b;
        }
        if (!gs.field_c.a(false, "commonui")) {
          return lj.field_l + " - " + gs.field_c.a("commonui", -16248) + "%";
        }
        if (!up.field_k.d(-96)) {
          return oe.field_l;
        }
        if (!up.field_k.a(false)) {
          return hm.field_H + " - " + up.field_k.e(-8185) + "%";
        }
        return uf.field_a;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_q = null;
    }

    final static void a(boolean param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        wd stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        wd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ml var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var14 = un.field_e;
          var2 = var14.h((byte) -109);
          var3 = (wd) (ak.field_i.g(24009));
          while (var3 != null) {
            if (var2 != var3.field_k) {
              var3 = (wd) (ak.field_i.c(33));
              continue;
            }
            break;
          }
          if (var3 == null) {
            lr.b((byte) -116);
            return;
          }
          var4 = var14.h((byte) -127);
          if (0 != var4) {
            sc.field_B[0] = ow.field_e;
            var5 = var3.field_p;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              sc.field_B[var6_int] = var14.a(124);
            }
            n.a(-20669, var4, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              pf.a(var14, 542439655);
              if (var6_intLifetime1 == 0) {
                var3.field_f = lr.field_r;
                var3.field_m = pl.field_d;
                var3.field_j = io.field_j;
                var3.field_h = df.field_E;
                su.a(df.field_E, (byte) -106, io.field_j, var6_intLifetime1, lr.field_r, pl.field_d);
              } else {
                su.a(df.field_E, (byte) -106, io.field_j, var6_intLifetime1, lr.field_r, pl.field_d);
              }
            }
            kf.a(var5, (byte) 63);
            dupTemp$0 = new String[2][var5];
            var3.field_i = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_o = dupTemp$1;
            var7 = dupTemp$1;
            var8 = wf.field_O;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = pf.field_d[var9];
              var6[0][var10] = sc.field_B[var11];
              var7[0][4 * var10] = bl.field_m[var11];
              var7[0][1 + var10 * 4] = qp.field_G[var11];
              var7[0][2 + var10 * 4] = fo.field_j[var11];
              var7[0][3 + 4 * var10] = ln.field_B[var11];
              if (hm.a((byte) -89, sc.field_B[var11]) &&
                ln.field_B[var11] + qp.field_G[var11] + fo.field_j[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = pf.field_d[var5 + var9Lifetime1];
              var6[1][var13] = sc.field_B[var11Lifetime1];
              var7[1][4 * var13] = bl.field_m[var11Lifetime1];
              var7[1][1 + var13 * 4] = qp.field_G[var11Lifetime1];
              var7[1][var13 * 4 + 2] = fo.field_j[var11Lifetime1];
              var7[1][4 * var13 + 3] = ln.field_B[var11Lifetime1];
              if (hm.a((byte) 52, sc.field_B[var11Lifetime1]) &&
                qp.field_G[var11Lifetime1] + fo.field_j[var11Lifetime1] + ln.field_B[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          stackIn_35_0 = var3;
          stackIn_36_1 = (param0);
          stackIn_35_0.field_e = stackIn_36_1;
          var3.c((byte) -109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "ki.D(" + param0 + ')');
        }
    }

    final static boolean a(iw param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.h((byte) -121);
          var4 = 4 % ((param1 - 15) / 62);
          stackIn_3_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_3_0;
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ki.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    ki(int param0, int param1, int param2, byte param3, byte param4) {
        this.field_r = param0;
        this.field_v = param2;
        this.field_u = param1;
        this.field_o = param3;
        this.field_p = param4;
    }

    public final String toString() {
        Object var1;
        Object var2;
        int var3;
        int var4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var4 = Kickabout.field_G;
        var1 = null;
        if (this.field_r == 0) {
          var1 = "Keyheld";
        }
        var2 = " " + this.field_v;
        if (this.field_r == 2) {
          var1 = "Mouse";
          var2 = "Click(" + this.field_o + "," + this.field_p + ") ";
        }
        if (this.field_r == 1) {
          var1 = "Keypress";
          var3 = this.field_v;
          if (0 == var3) {
            var2 = " DASH";
          } else {
            if (var3 == 1) {
              var2 = " SELECT0";
            } else {
              if (2 != var3) {
                if (var3 != 3) {
                  if (var3 != 4) {
                    if (5 != var3) {
                      if (var3 == 6) {
                        var2 = " CHARGE_KICK_LEFT";
                      } else {
                        if (var3 == 7) {
                          var2 = " CHARGE_KICK_RIGHT";
                        }
                      }
                    } else {
                      var2 = " SELECT4";
                    }
                  } else {
                    var2 = " SELECT3";
                  }
                } else {
                  var2 = " SELECT2";
                }
              } else {
                var2 = " SELECT1";
              }
            }
          }
        }
        if (4 == this.field_r) {
          var1 = "Team";
          var3Lifetime1 = this.field_v;
          if (0 == var3Lifetime1) {
            var2 = " Left";
          } else {
            if (var3Lifetime1 == 1) {
              var2 = " Right";
            } else {
              if (var3Lifetime1 == 2) {
                var2 = " Ready";
              }
            }
          }
          var2 = " data=" + this.field_v;
        }
        if (5 == this.field_r) {
          var2 = " data=" + this.field_v;
          var1 = "LineUp";
        }
        if (this.field_r == 7) {
          var1 = "Cheat";
          var2 = " data=" + this.field_v;
        }
        if (6 == this.field_r) {
          var3Lifetime2 = this.field_v;
          if (var3Lifetime2 != 0) {
            if (var3Lifetime2 != 1) {
              if (2 != var3Lifetime2) {
                if (var3Lifetime2 == 3) {
                  var2 = " OfferRematch";
                }
              } else {
                var2 = " OfferDraw";
              }
            } else {
              var2 = " Resign";
            }
          } else {
            var2 = " Depart";
          }
          var1 = "meta";
          var2 = var1;
          var2 = var1;
        }
        if (this.field_r == 3) {
          var3Lifetime3 = this.field_v;
          if (var3Lifetime3 != 0) {
            if (var3Lifetime3 == 1) {
              var2 = " Right";
            } else {
              if (var3Lifetime3 == 2) {
                var2 = " OK";
              }
            }
          } else {
            var2 = " Left";
          }
          var1 = "formation";
        }
        return new String("{Move" + (String) (var1) + (String) (var2) + "}");
    }

    static {
    }
}
