/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static ve field_f;
    int field_d;
    int field_c;
    int field_a;
    static String field_b;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param0) != 0) {
          var2 = -(param0 & 7) + 8;
        }
        int var3 = param0 + var2;
        if (param1 == -25349) {
          return var3;
        }
        field_f = (ve) null;
        return var3;
    }

    final static void a(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (null != as.field_d) {
            try {
              as.field_d.a(-23669, 0L);
              as.field_d.a(param0 ^ 0, 24, id.field_f.field_u, id.field_f.field_p);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              if (param0 == 0) {
                id.field_f.field_u = id.field_f.field_u + 24;
                return;
              }
              g.b(11);
              id.field_f.field_u = id.field_f.field_u + 24;
              return;
            }
          }
          if (param0 != 0) {
            g.b(11);
          }
          id.field_f.field_u = id.field_f.field_u + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        qn var1 = (qn) (te.field_z.a((byte) 100));
        if (var1 == null) {
          rm.b((byte) 85);
          return;
        }
        mi var2 = id.field_f;
        var2.b(true);
        var2.b(!param0 ? true : false);
        var2.b(true);
        var2.b(!param0 ? true : false);
        if (!param0) {
          var1.c(2);
          return;
        }
        field_b = (String) null;
        var1.c(2);
    }

    final static void a(byte param0) {
        if (param0 != -10) {
          return;
        }
        ui.field_g = 0;
        nb.h(param0 - 14819);
    }

    final static void b(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_135_0 = 0;
        int var1;
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (lc.field_b == am.field_n) {
          return;
        }
        if (al.a(lc.field_b, (byte) -94)) {
          fh.field_y[lc.field_b].c(20);
          qh.field_g = lc.field_d;
          vl.field_c = 0;
          lc.field_b = am.field_n;
          if (lc.field_b == -1) {
            var1 = 0;
            var2 = 0;
            if (null != ln.field_d) {
              var1 = ln.field_d.field_D.b(-6133);
              stackIn_14_0 = (1 != ln.field_d.field_D.field_r.h(9979)) ? 0 : 1;
              var2 = stackIn_14_0;
            } else {
              if (null != oe.field_pb) {
                var1 = oe.field_pb.field_D.b(-6133);
                stackIn_10_0 = (1 != oe.field_pb.field_D.field_r.h(9979)) ? 0 : 1;
                var2 = stackIn_10_0;
              }
            }
            if (var2 != 0) {
              db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
            }
          } else {
            if (1 == lc.field_b) {
              var1 = 0;
              var2 = 0;
              if (null != ln.field_d) {
                var1 = ln.field_d.field_D.b(-6133);
                stackIn_37_0 = (1 != ln.field_d.field_D.field_r.h(9979)) ? 0 : 1;
                var2 = stackIn_37_0;
              } else {
                if (null != oe.field_pb) {
                  var1 = oe.field_pb.field_D.b(-6133);
                  stackIn_33_0 = (1 != oe.field_pb.field_D.field_r.h(9979)) ? 0 : 1;
                  var2 = stackIn_33_0;
                }
              }
              if (var2 != 0) {
                db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
              }
            } else {
              if (2 != lc.field_b &&
                lc.field_b != 22 &&
                3 != lc.field_b &&
                lc.field_b != 4 &&
                lc.field_b != 18) {
                db.a(false, 12, (byte) -128, op.field_d, true, 12);
              } else {
                var1 = 0;
                var2 = 0;
                if (null != ln.field_d) {
                  var1 = ln.field_d.field_D.b(-6133);
                  stackIn_65_0 = (1 != ln.field_d.field_D.field_r.h(9979)) ? 0 : 1;
                  var2 = stackIn_65_0;
                } else {
                  if (null != oe.field_pb) {
                    var1 = oe.field_pb.field_D.b(-6133);
                    stackIn_61_0 = (1 != oe.field_pb.field_D.field_r.h(9979)) ? 0 : 1;
                    var2 = stackIn_61_0;
                  }
                }
                if (var2 != 0) {
                  db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                }
              }
            }
          }
          if (an.field_c) {
            ln.field_d = null;
            an.field_c = false;
            oe.field_pb = null;
          }
          if (param0 != 7) {
            g.a((byte) 107);
          }
          if (qh.field_f) {
            j.field_n = null;
            mb.field_y = null;
            uh.field_Xb = null;
            fg.field_eb.c(0);
            ml.field_z = 0;
            jq.field_e = 0;
            t.field_l = 0;
            oh.field_D.c(0);
            qh.field_f = false;
          }
        } else {
          qh.field_g = lc.field_d;
          vl.field_c = 0;
          lc.field_b = am.field_n;
          if (lc.field_b != -1 &&
            1 != lc.field_b &&
            2 != lc.field_b &&
            lc.field_b != 22 &&
            3 != lc.field_b &&
            lc.field_b != 4) {
            if (lc.field_b == 18) {
              var1 = 0;
              var2 = 0;
              if (null != ln.field_d) {
                var1 = ln.field_d.field_D.b(-6133);
                stackIn_102_0 = (1 != ln.field_d.field_D.field_r.h(9979)) ? 0 : 1;
                var2 = stackIn_102_0;
              } else {
                if (null != oe.field_pb) {
                  var1 = oe.field_pb.field_D.b(-6133);
                  stackIn_98_0 = (1 != oe.field_pb.field_D.field_r.h(9979)) ? 0 : 1;
                  var2 = stackIn_98_0;
                }
              }
              if (var2 != 0) {
                db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
              }
              if (an.field_c) {
                ln.field_d = null;
                an.field_c = false;
                oe.field_pb = null;
              }
              if (param0 != 7) {
                g.a((byte) 107);
              }
              if (qh.field_f) {
                j.field_n = null;
                mb.field_y = null;
                uh.field_Xb = null;
                fg.field_eb.c(0);
                ml.field_z = 0;
                jq.field_e = 0;
                t.field_l = 0;
                oh.field_D.c(0);
                qh.field_f = false;
              }
              if (sk.field_g) {
                ki.a((byte) -107);
                k.a(false);
                lh.a((byte) -22);
                sk.field_g = false;
              }
              return;
            }
            db.a(false, 12, (byte) -128, op.field_d, true, 12);
            if (an.field_c) {
              ln.field_d = null;
              an.field_c = false;
              oe.field_pb = null;
            }
            if (param0 != 7) {
              g.a((byte) 107);
              if (qh.field_f) {
                j.field_n = null;
                mb.field_y = null;
                uh.field_Xb = null;
                fg.field_eb.c(0);
                ml.field_z = 0;
                jq.field_e = 0;
                t.field_l = 0;
                oh.field_D.c(0);
                qh.field_f = false;
              }
            } else {
              if (!qh.field_f) {
                if (!sk.field_g) {
                  return;
                }
                ki.a((byte) -107);
                k.a(false);
                lh.a((byte) -22);
                sk.field_g = false;
                return;
              }
              j.field_n = null;
              mb.field_y = null;
              uh.field_Xb = null;
              fg.field_eb.c(0);
              ml.field_z = 0;
              jq.field_e = 0;
              t.field_l = 0;
              oh.field_D.c(0);
              qh.field_f = false;
            }
            if (sk.field_g) {
              ki.a((byte) -107);
              k.a(false);
              lh.a((byte) -22);
              sk.field_g = false;
            }
            return;
          }
          var1 = 0;
          var2 = 0;
          if (null != ln.field_d) {
            var1 = ln.field_d.field_D.b(-6133);
            stackIn_135_0 = (1 != ln.field_d.field_D.field_r.h(9979)) ? 0 : 1;
            var2 = stackIn_135_0;
          } else {
            if (null != oe.field_pb) {
              var1 = oe.field_pb.field_D.b(-6133);
              stackIn_120_0 = (1 != oe.field_pb.field_D.field_r.h(9979)) ? 0 : 1;
              var2 = stackIn_120_0;
              if (var2 != 0) {
                db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
              }
              if (an.field_c) {
                ln.field_d = null;
                an.field_c = false;
                oe.field_pb = null;
              }
              if (param0 != 7) {
                g.a((byte) 107);
              }
              if (qh.field_f) {
                j.field_n = null;
                mb.field_y = null;
                uh.field_Xb = null;
                fg.field_eb.c(0);
                ml.field_z = 0;
                jq.field_e = 0;
                t.field_l = 0;
                oh.field_D.c(0);
                qh.field_f = false;
              }
              if (sk.field_g) {
                ki.a((byte) -107);
                k.a(false);
                lh.a((byte) -22);
                sk.field_g = false;
              }
              return;
            }
          }
          if (var2 != 0) {
            db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
            if (an.field_c) {
              ln.field_d = null;
              an.field_c = false;
              oe.field_pb = null;
            }
            if (param0 != 7) {
              g.a((byte) 107);
            }
            if (qh.field_f) {
              j.field_n = null;
              mb.field_y = null;
              uh.field_Xb = null;
              fg.field_eb.c(0);
              ml.field_z = 0;
              jq.field_e = 0;
              t.field_l = 0;
              oh.field_D.c(0);
              qh.field_f = false;
            }
          } else {
            if (an.field_c) {
              ln.field_d = null;
              an.field_c = false;
              oe.field_pb = null;
            }
            if (param0 == 7) {
              if (qh.field_f) {
                j.field_n = null;
                mb.field_y = null;
                uh.field_Xb = null;
                fg.field_eb.c(0);
                ml.field_z = 0;
                jq.field_e = 0;
                t.field_l = 0;
                oh.field_D.c(0);
                qh.field_f = false;
              }
              if (!sk.field_g) {
                return;
              }
              ki.a((byte) -107);
              k.a(false);
              lh.a((byte) -22);
              sk.field_g = false;
              return;
            }
            g.a((byte) 107);
            if (!qh.field_f) {
              if (!sk.field_g) {
                return;
              }
              ki.a((byte) -107);
              k.a(false);
              lh.a((byte) -22);
              sk.field_g = false;
              return;
            }
            j.field_n = null;
            mb.field_y = null;
            uh.field_Xb = null;
            fg.field_eb.c(0);
            ml.field_z = 0;
            jq.field_e = 0;
            t.field_l = 0;
            oh.field_D.c(0);
            qh.field_f = false;
          }
        }
        if (sk.field_g) {
          ki.a((byte) -107);
          k.a(false);
          lh.a((byte) -22);
          sk.field_g = false;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        if (param0) {
          field_e = (String) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    static {
        field_f = new ve(0, 2, 2, 1);
        field_e = "You are invited to <%0>'s game.";
        field_b = "Seriously offensive language";
    }
}
