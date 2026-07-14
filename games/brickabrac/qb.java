/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends ki {
    static mf field_r;
    static boolean field_u;
    static mh field_x;
    static mh field_v;
    static String field_y;
    static String field_s;
    static int field_w;
    static String field_t;

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (param1 >= -84) {
            field_v = null;
        }
        if (((qb) this).b((byte) -122)) {
            var6 = kd.a(((qb) this).field_m, param3, (byte) -36);
            if (!var6.a((byte) -84, param3, ((qb) this).field_m)) {
                qf.a(param3, var6, 2, rp.field_w, -13, false);
                var6.a(((qb) this).field_m, param3, (byte) 78);
            }
            dg.a(-899814320, 306, param2, cr.field_D, var6.field_p, param0, 2, ep.field_b, param4, -13);
        } else {
            lb.g(param2, param0, 306, 480, rm.field_d[param3], 22953);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var7 = null;
        if (((qb) this).b((byte) -106)) {
            var7 = ge.a(((qb) this).field_m, param3, -20777);
            if (!(var7.a((byte) -84, param3, ((qb) this).field_m))) {
                qf.a(param3, var7, 1, dm.field_f, 0, !param0 ? true : false);
                var7.a(((qb) this).field_m, param3, (byte) 78);
            }
            dg.a(-899814320, 640, param4, lc.field_e, var7.field_p, param2, 1, rm.field_f, param1, 0);
        } else {
            lb.g(param4, param2, 640, 480, rm.field_d[param3], 22953);
        }
        if (!param0) {
            ((qb) this).a((byte) -27, 96, -30, 88);
        }
    }

    final static jp a(jp param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param1) {
            return null;
        }
        jp var3 = new jp(param0.field_x * param2, param0.field_z);
        var3.g();
        for (var4 = 0; param2 > var4; var4++) {
            param0.c(param0.field_x * var4, 0);
        }
        kc.field_q.a((byte) 116);
        return var3;
    }

    qb(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0;
        int stackOut_7_0;
        L0: {
          if (param0 <= -91) {
            break L0;
          } else {
            field_u = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lc.field_e) {
              break L2;
            } else {
              if (rm.field_f == null) {
                break L2;
              } else {
                if (dm.field_f == null) {
                  break L2;
                } else {
                  if (null == gn.field_z) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(boolean param0) {
        if (!(i.field_m.a("farm", -28138))) {
            return false;
        }
        lc.field_e = pl.a("farm", "farm_near", (byte) 103, i.field_m);
        rm.field_f = pl.a("farm", "farm_mid", (byte) -63, i.field_m);
        dm.field_f = pl.a("farm", "farm_far", (byte) -78, i.field_m);
        gn.field_z = pl.a("farm", "farm_small", (byte) 106, i.field_m);
        if (param0) {
            qb.g(-29);
        }
        cr.field_D = jh.a(0, lc.field_e);
        ep.field_b = jh.a(0, rm.field_f);
        rp.field_w = jh.a(0, dm.field_f);
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 > -1) {
            lb.g(param2, param3, 153, 238, rm.field_d[param1], 22953);
        } else {
            lb.g(param2, param3, 153, 238, 7829367, 22953);
        }
        if (((qb) this).b((byte) -109)) {
            gn.field_z.c(param2, param3);
        }
        int var5 = -18 / ((-28 - param0) / 43);
    }

    final static String[] a(byte param0, String param1, char param2) {
        int var8 = 0;
        int var9 = 0;
        int var10 = BrickABrac.field_J ? 1 : 0;
        CharSequence var11 = (CharSequence) (Object) param1;
        int var3 = pp.a((byte) 120, param2, var11);
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = -40 % ((param0 - 61) / 61);
        int var7 = 0;
        for (var8 = 0; var8 < var3; var8++) {
            for (var9 = var7; param2 != param1.charAt(var9); var9++) {
            }
            var5++;
            var4[var5] = param1.substring(var7, var9);
            var7 = var9 + 1;
        }
        var4[var3] = param1.substring(var7);
        return var4;
    }

    final static int a(String[] args, int param1, int param2, dh param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          var5 = param3.c(param4);
          if (param1 < var5) {
            break L0;
          } else {
            if (0 != (param4.indexOf("<br>") ^ -1)) {
              break L0;
            } else {
              args[0] = (String) (Object) args;
              return 1;
            }
          }
        }
        var6 = (var5 - (-param1 - -1)) / param1;
        param1 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param4.length();
        var9 = 0;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var8 <= var7) {
                break L2;
              } else {
                var6++;
                args[var6] = param4.substring(var7, var8).trim();
                break L2;
              }
            }
            L3: {
              if (param2 == -63) {
                break L3;
              } else {
                field_s = null;
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param4.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param3.c(var11);
              if (param1 <= var12) {
                var6++;
                args[var6] = var11;
                var7 = 1 + var9;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                var6++;
                args[var6] = param4.substring(var7, var9 - 3).trim();
                var7 = var9 + 1;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
            Object var2 = null;
            v discarded$0 = qb.a((Throwable) null, (String) null);
        }
        field_x = null;
        field_r = null;
        field_s = null;
    }

    final static v a(Throwable param0, String param1) {
        v var2_ref = null;
        v var2 = null;
        if (!(param0 instanceof v)) {
            var2 = new v(param0, param1);
        } else {
            var2_ref = (v) (Object) param0;
            var2_ref.field_d = var2_ref.field_d + 32 + param1;
        }
        return var2_ref;
    }

    final static void g(int param0) {
        if (10 != i.field_j) {
            // ifne L32
        }
        ec.h(6846);
        i.field_j = 11;
        if (param0 < 105) {
            qb.f(-80);
        }
        vq.field_C = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Please enter your age in years";
        field_s = "Who can join";
        field_t = "Connection restored.";
    }
}
