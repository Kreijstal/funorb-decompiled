/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends vh {
    static String field_Mb;
    static String field_Lb;
    static String field_Ob;
    static String field_Nb;
    static String field_Qb;
    private vh field_Pb;

    final static boolean f(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Pool.field_O;
        if (param0 == -13164) {
          o.field_y = o.field_y + 1;
          if (pq.field_B.length > o.field_y) {
            var1 = 0;
            L0: while (true) {
              if (pc.field_a.length <= var1) {
                pc.field_a = pq.field_B[o.field_y];
                return true;
              } else {
                pq.field_B[o.field_y][var1].a(pc.field_a[var1], (byte) -12);
                var1++;
                continue L0;
              }
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$1 = fn.f(89);
          o.field_y = o.field_y + 1;
          if (pq.field_B.length > o.field_y) {
            var1 = 0;
            L1: while (true) {
              if (pc.field_a.length <= var1) {
                pc.field_a = pq.field_B[o.field_y];
                return true;
              } else {
                pq.field_B[o.field_y][var1].a(pc.field_a[var1], (byte) -12);
                var1++;
                continue L1;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static im b(long param0, int param1) {
        Object var4 = null;
        if (param1 != 0) {
          var4 = null;
          int discarded$2 = fn.a((String) null, -19, (String) null, -83, true, (String) null, -49);
          return (im) (Object) im.field_Qb.a(param0, false);
        } else {
          return (im) (Object) im.field_Qb.a(param0, false);
        }
    }

    final boolean b(byte param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -52) {
          L0: {
            ((fn) this).a(true, false);
            if (-1 == (ne.field_s ^ -1)) {
              if (-1 == (((fn) this).field_Pb.field_R ^ -1)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (-1 == (((fn) this).field_R ^ -1)) {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                L1: {
                  if (-1 == (((fn) this).field_Pb.field_R ^ -1)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L1;
                  }
                }
                return stackIn_7_0 != 0;
              }
            }
          }
          return stackIn_12_0 != 0;
        } else {
          return true;
        }
    }

    final static an a(byte param0, byte[] param1) {
        an var2 = null;
        if (param1 != null) {
          var2 = new an(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, v.field_b);
          sh.h(-1);
          if (param0 < 119) {
            boolean discarded$2 = fn.f(-82);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static int a(pn param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Pool.field_O;
        var2 = mc.field_g;
        if ((param0.field_p ^ -1) == -3) {
          if (param0.field_g) {
            var2 = mc.field_g;
            if (param1 > -30) {
              var4 = null;
              int discarded$7 = fn.a((pn) null, 64);
              return var2;
            } else {
              return var2;
            }
          } else {
            if (param0.field_m == 0) {
              if (param0.field_e == 0) {
                var2 = pq.field_F[param0.field_p];
                if (param1 > -30) {
                  var4 = null;
                  int discarded$8 = fn.a((pn) null, 64);
                  return var2;
                } else {
                  return var2;
                }
              } else {
                var2 = ng.field_A[param0.field_p];
                if (param1 > -30) {
                  var4 = null;
                  int discarded$9 = fn.a((pn) null, 64);
                  return var2;
                } else {
                  return var2;
                }
              }
            } else {
              var2 = ng.field_A[param0.field_p];
              if (param1 > -30) {
                var4 = null;
                int discarded$10 = fn.a((pn) null, 64);
                return var2;
              } else {
                return var2;
              }
            }
          }
        } else {
          if ((param0.field_p ^ -1) != -5) {
            if ((ve.field_m ^ -1L) == (param0.field_b ^ -1L)) {
              var2 = pq.field_F[param0.field_p];
              if (param1 > -30) {
                var4 = null;
                int discarded$11 = fn.a((pn) null, 64);
                return var2;
              } else {
                return var2;
              }
            } else {
              var2 = ng.field_A[param0.field_p];
              if (param1 <= -30) {
                return var2;
              } else {
                var4 = null;
                int discarded$12 = fn.a((pn) null, 64);
                return var2;
              }
            }
          } else {
            var2 = ng.field_A[param0.field_p];
            if (param1 <= -30) {
              return var2;
            } else {
              var4 = null;
              int discarded$13 = fn.a((pn) null, 64);
              return var2;
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = ir.field_h * ir.field_h;
        var3 = -(param1 * param1) + var2;
        ff.a(-24, qh.field_f - 120 + var3 * 120 / var2);
        if (param0 != 5938) {
          field_Nb = null;
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        field_Nb = null;
        if (param0 <= 12) {
            Object var2 = null;
            int discarded$0 = fn.a((String) null, -57, (String) null, 61, false, (String) null, 44);
            field_Mb = null;
            field_Qb = null;
            field_Ob = null;
            field_Lb = null;
            return;
        }
        field_Mb = null;
        field_Qb = null;
        field_Ob = null;
        field_Lb = null;
    }

    final static int a(String param0, int param1, String param2, int param3, boolean param4, String param5, int param6) {
        ke var7 = null;
        ke var8 = null;
        if (param3 != 50) {
          field_Lb = null;
          var7 = new ke(param2);
          var8 = new ke(param0);
          return ih.a(param5, (byte) 87, param1, param4, var7, var8, param6);
        } else {
          var7 = new ke(param2);
          var8 = new ke(param0);
          return ih.a(param5, (byte) 87, param1, param4, var7, var8, param6);
        }
    }

    fn(vh param0, vh param1, vh param2, vh param3, vh param4, vh param5) {
        int var12 = 0;
        vh var13 = null;
        vh var14 = null;
        int var15 = 0;
        vh var16 = new vh(0L, param1, w.field_m.toUpperCase());
        var16.field_Fb = 1;
        ((fn) this).field_Pb = new vh(0L, param2);
        vh var8 = new vh(0L, param3);
        vh var9 = new vh(0L, param3, jd.field_j);
        var9.field_Fb = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; bj.field_o.length > var12; var12++) {
            var13 = new vh(0L, param3, ck.field_T[var12]);
            var14 = new vh(0L, param3, bj.field_o[var12]);
            var15 = param3.field_I.b(bj.field_o[var12]);
            var13.b(var10, 2147483647, 20, 65, 15);
            if (var11 < var15) {
                var11 = var15;
            }
            var14.b(var10, 2147483647, 90, 640, 15);
            var8.a(-126, var13);
            var10 += 30;
            var8.a(-98, var14);
        }
        var16.b(0, 2147483647, 0, 20 + var11 - -90, 24);
        var10 += 15;
        ((fn) this).b(100, 2147483647, 100, var16.field_gb, var10 - -var16.field_Db);
        ((fn) this).field_Pb.b(5, 2147483647, -20 + var16.field_gb, 15, 15);
        var8.b(var16.field_Db, 2147483647, 0, ((fn) this).field_gb, ((fn) this).field_Db - var16.field_Db);
        var9.b(20, 2147483647, 0, ((fn) this).field_gb, 15);
        var8.field_F = rp.a(32450, 3, 2105376, var8.field_Db, 11579568, 8421504);
        var16.a(-115, ((fn) this).field_Pb);
        var8.a(-122, var9);
        ((fn) this).a(-95, var16);
        ((fn) this).a(-110, var8);
        ((fn) this).field_qb = -(((fn) this).field_gb >> -1470712895) + 320;
        var10 = 240 - (((fn) this).field_Db >> -642501663);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_Lb = "Add <%0> to friend list";
        field_Ob = "To <u=ffffff>rotate</u> around the table: <col=99ff99>Hold</col> the <img=2> <col=99ff99>right mouse button</col> (or <img=9>+<img=0> left mouse button) and move the mouse. Try it now to move on.";
        field_Nb = "Music: ";
        field_Qb = "You cannot add yourself!";
    }
}
