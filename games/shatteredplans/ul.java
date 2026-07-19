/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends qr {
    static String[] field_Qb;
    static int field_Hb;
    static int[] field_Db;
    private int field_yb;
    static String field_Ob;
    private qr field_Nb;
    private bi[] field_Lb;
    static hh field_xb;
    private qr field_Mb;
    private int field_Eb;
    static String[] field_Fb;
    private int field_Kb;
    private int field_zb;
    static String field_Ab;
    private int field_Jb;
    private sg[] field_Gb;
    static int[] field_Cb;
    private int[] field_Ib;
    private int field_Bb;
    private int field_Pb;

    final boolean f(byte param0) {
        if (this.field_Bb != -2) {
          return false;
        } else {
          if (param0 == 31) {
            if (13 == oq.field_j) {
              this.field_Bb = -1;
              return true;
            } else {
              return true;
            }
          } else {
            this.b(-117, 88, 37, -45, -114);
            if (13 != oq.field_j) {
              return true;
            } else {
              this.field_Bb = -1;
              return true;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          re.field_d[wm.field_c] = param4;
          lg.field_d[wm.field_c] = wm.field_c;
          kf.field_f[wm.field_c] = param1;
          if (us.field_b < param1) {
            s.field_e = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ef.field_a > param1) {
            ff.field_u = param1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          fb.field_zb[wm.field_c] = param2;
          aj.field_d[wm.field_c] = param3;
          f.field_y[wm.field_c] = param5;
          var6 = param5 + param3 + param2;
          if (param0 == var6) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1000 * param2 / var6;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var7 = stackIn_9_0;
        dc.field_c[wm.field_c] = var7;
        if (var7 > s.field_e) {
          L3: {
            s.field_e = var7;
            wm.field_c = wm.field_c + 1;
            if (ff.field_u > var7) {
              ff.field_u = var7;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            wm.field_c = wm.field_c + 1;
            if (ff.field_u > var7) {
              ff.field_u = var7;
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final void a(boolean param0, bi param1, String param2, int param3) {
        try {
            this.field_Gb[this.field_Pb] = new sg(0L, (qr) null, (qr) null, this.field_Mb, param1, param2);
            if (param0) {
                field_Ab = (String) null;
            }
            this.field_Gb[this.field_Pb].field_lb = this.field_Lb;
            this.field_Gb[this.field_Pb].field_r = true;
            this.field_Gb[this.field_Pb].field_G = 1;
            this.a(4, this.field_Gb[this.field_Pb]);
            this.field_Ib[this.field_Pb] = param3;
            this.field_Pb = this.field_Pb + 1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ul.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void g(int param0) {
        boolean discarded$2 = false;
        field_Ob = null;
        field_Cb = null;
        field_Fb = null;
        field_Db = null;
        field_Ab = null;
        field_Qb = null;
        if (param0 != 1000) {
          discarded$2 = ul.a(-91, 59, -35, 74, -62);
          field_xb = null;
          return;
        } else {
          field_xb = null;
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
            this.field_Gb[this.field_Pb] = new sg(0L, (qr) null, (qr) null, this.field_Mb, (bi) null, param2);
            this.field_Gb[this.field_Pb].field_lb = this.field_Lb;
            this.field_Gb[this.field_Pb].field_r = true;
            this.field_Gb[this.field_Pb].field_G = param0;
            this.a(4, this.field_Gb[this.field_Pb]);
            this.field_Ib[this.field_Pb] = param1;
            this.field_Pb = this.field_Pb + 1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ul.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4) {
        double var5 = 0.0;
        double var7 = 0.0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var5 = Math.atan2((double)param4, (double)param3);
          if (39 <= (param4 ^ -1)) {
            break L0;
          } else {
            if (param4 >= 0) {
              break L0;
            } else {
              if ((param3 ^ -1) <= -1) {
                break L0;
              } else {
                var5 = var5 + 6.283185307179586;
                break L0;
              }
            }
          }
        }
        if (param2 == 0) {
          var7 = Math.atan2((double)param1, (double)param0);
          if ((param1 ^ -1) < 39) {
            if (0 > param1) {
              if (0 <= param0) {
                L1: {
                  if (var7 >= var5) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L1;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L1;
                  }
                }
                return stackIn_24_0 != 0;
              } else {
                L2: {
                  var7 = var7 + 6.283185307179586;
                  if (var7 >= var5) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L2;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              L3: {
                if (var7 >= var5) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            L4: {
              if (var7 >= var5) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            return stackIn_10_0 != 0;
          }
        } else {
          return false;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_Pb == 0) {
          this.field_Gb[this.field_Pb] = new sg(0L, (qr) null, (qr) null, this.field_Nb, (bi) null, we.field_a);
          this.field_Gb[this.field_Pb].field_G = 1;
          this.a(param2 + 4, this.field_Gb[this.field_Pb]);
          this.field_Ib[this.field_Pb] = -1;
          this.field_Pb = this.field_Pb + 1;
          var6 = 0;
          var7 = param2;
          L0: while (true) {
            if (this.field_Pb <= var7) {
              var6 = var6 + 2 * this.field_Kb;
              var7 = this.field_yb + this.field_yb - -(this.field_Pb * this.field_zb);
              var8 = uh.a(param2 + -60, param3, var6, param0);
              var9 = uq.a(param1, param2 + 0, var7, param4);
              this.a(var6, var7, (byte) 46, var9, var8);
              var10 = 0;
              L1: while (true) {
                if (this.field_Pb <= var10) {
                  return;
                } else {
                  this.field_Gb[var10].a(50, this.field_zb, this.field_yb + var10 * this.field_zb, this.field_Eb, this.field_Jb, -(2 * this.field_Kb) + var6, this.field_Kb);
                  var10++;
                  continue L1;
                }
              }
            } else {
              var8 = this.field_Gb[var7].a(this.field_Jb, (byte) -98, this.field_Eb);
              if (var6 < var8) {
                var6 = var8;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          var6 = 0;
          var7 = param2;
          L2: while (true) {
            if (this.field_Pb <= var7) {
              var6 = var6 + 2 * this.field_Kb;
              var7 = this.field_yb + this.field_yb - -(this.field_Pb * this.field_zb);
              var8 = uh.a(param2 + -60, param3, var6, param0);
              var9 = uq.a(param1, param2 + 0, var7, param4);
              this.a(var6, var7, (byte) 46, var9, var8);
              var10 = 0;
              L3: while (true) {
                if (this.field_Pb <= var10) {
                  return;
                } else {
                  this.field_Gb[var10].a(50, this.field_zb, this.field_yb + var10 * this.field_zb, this.field_Eb, this.field_Jb, -(2 * this.field_Kb) + var6, this.field_Kb);
                  var10++;
                  continue L3;
                }
              }
            } else {
              var8 = this.field_Gb[var7].a(this.field_Jb, (byte) -98, this.field_Eb);
              if (var6 < var8) {
                var6 = var8;
                var7++;
                continue L2;
              } else {
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    ul(ul param0) {
        this(param0, param0.field_Lb, param0.field_Nb, param0.field_Mb, param0.field_Kb, param0.field_Eb, param0.field_Jb, param0.field_yb, param0.field_zb);
    }

    final int b(boolean param0, byte param1) {
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        this.a(param0, -20429);
        if (!param0) {
            return -2;
        }
        for (var3 = 0; this.field_Pb > var3; var3++) {
            if (this.field_Gb[var3].field_rb != 0) {
                return this.field_Ib[var3];
            }
        }
        int var4 = 82 % ((26 - param1) / 42);
        if (!(je.field_d == 0)) {
            return -1;
        }
        return this.field_Bb;
    }

    ul(qr param0, bi[] param1, qr param2, qr param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Ib = new int[256];
        this.field_Gb = new sg[256];
        this.field_Bb = -2;
        try {
            this.field_Kb = param4;
            this.field_Lb = param1;
            this.field_zb = param8;
            this.field_Mb = param3;
            this.field_Jb = param6;
            this.field_Nb = param2;
            this.field_Eb = param5;
            this.field_yb = param7;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_Db = new int[4];
        field_Hb = 2;
        field_Ob = "<col=2F5FBF>'ENTER'</col>";
        field_Qb = new String[]{"Attack with 95% of your forces (minimum 50 fleets) against a single enemy system.", "Assault an enemy system with 10 times as many fleets (minimum 50) as are defending it.", "Damage or destroy 100 fleets in one turn.", "Hold a system against attack from three or more systems in the same turn.", "Win a game, taking at least one system per turn throughout.", "Take five systems in one turn.", "Take eight systems in one turn.", "Have a treaty with all players simultaneously, then go on to win the game (minimum: 4 players).", "Win a game, having never signed a treaty (minimum: 4 players).", "Attack an enemy system with aid from an ally.", "Be holding at least 2 neutral homeworlds at the start of turn 8.", "Win a Conquest game in 20 turns or fewer (minimum: 4 players).", "Win 5 Rated games.", "Win 10 Rated games.", "Win 25 Rated games.", "Win 50 Rated games.", "Win 100 Rated games.", "Win a Capture and Hold game without anyone else ever capturing Sol (minimum: 4 players).", "Win a Points game before anyone else reaches 80% of the target score (minimum: 4 players).", "Own all derelicts on the map at once (minimum: 4 players).", "Win a Rated game of each type consecutively.", "Own all player homeworlds simultaneously (minimum: 4 players).", "Deploy all four projects in one turn.", "Defeat a JMod, or someone else who has this achievement.", "Deploy your projects when the time is right."};
        field_Fb = new String[]{"By rating", "By win percentage"};
        field_Cb = new int[8192];
        field_Ab = "You have incoming treaty offers.";
    }
}
