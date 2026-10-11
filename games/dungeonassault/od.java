/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static String field_c;
    static String field_a;
    static String[] field_b;

    final static boolean a(byte param0) {
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$6 = 0;
        int var1;
        int var2;
        int var3;
        gn var4;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        gn var4Lifetime1;
        gn var4Lifetime2;
        gn var4Lifetime3;
        gn var4Lifetime4;
        gn var4Lifetime5;
        gn var4Lifetime6;
        gn var4Lifetime1Lifetime1;
        gn var4Lifetime1Lifetime2;
        gn var4Lifetime2Lifetime1;
        var3 = DungeonAssault.field_K;
        if (null != gk.field_L) {
          if (la.field_g == 0) {
            ii.field_G = -1;
            a.field_i = -1;
          } else {
            if (ii.field_G != -1) {
              var1 = -ii.field_G + hj.field_S;
              var2 = eh.field_h - a.field_i;
              hh.field_p = hh.field_p + var1;
              ed.field_P = ed.field_P + var2;
              if (hh.field_p < 0) {
                hh.field_p = 0;
              }
              if (hh.field_p > 640) {
                hh.field_p = 640;
              }
              if (ed.field_P < 0) {
                ed.field_P = 0;
              }
              ii.field_G = hj.field_S;
              if (480 < ed.field_P) {
                ed.field_P = 480;
              }
              a.field_i = eh.field_h;
            } else {
              ii.field_G = -1;
              a.field_i = -1;
            }
          }
          if (!pd.c(eh.field_h, hj.field_S, (byte) 120)) {
            return false;
          }
          if (no.field_d != 0 &&
            -1 == ii.field_G) {
            ii.field_G = lc.field_c;
            a.field_i = hm.field_k;
            if (param0 > -50) {
              field_b = (String[]) null;
            }
            eg.a(pp.field_K, true);
            if (ec.field_n != hh.field_s) {
              if (tk.field_k != hh.field_s) {
                if (ti.field_A != hh.field_s) {
                  return true;
                }
                var4 = (gn) null;
                og.a(false, 0, (gn) null);
                return true;
              }
              fieldTemp$14 = fc.field_d - 1;
              fc.field_d = fc.field_d - 1;
              if (0 > fieldTemp$14) {
                fc.field_d = -1 + uo.field_f.length;
              }
              og.a(true, 0, uo.field_f[fc.field_d]);
            } else {
              fieldTemp$15 = fc.field_d + 1;
              fc.field_d = fc.field_d + 1;
              if (fieldTemp$15 >= uo.field_f.length) {
                fc.field_d = 0;
              }
              og.a(false, 0, uo.field_f[fc.field_d]);
            }
            return true;
          }
          if (param0 > -50) {
            field_b = (String[]) null;
            eg.a(pp.field_K, true);
            if (ec.field_n != hh.field_s) {
              if (tk.field_k != hh.field_s) {
                if (ti.field_A == hh.field_s) {
                  var4Lifetime5 = (gn) null;
                  og.a(false, 0, (gn) null);
                }
              } else {
                fieldTemp$18 = fc.field_d - 1;
                fc.field_d = fc.field_d - 1;
                if (0 > fieldTemp$18) {
                  fc.field_d = -1 + uo.field_f.length;
                }
                og.a(true, 0, uo.field_f[fc.field_d]);
              }
            } else {
              fieldTemp$19 = fc.field_d + 1;
              fc.field_d = fc.field_d + 1;
              if (fieldTemp$19 >= uo.field_f.length) {
                fc.field_d = 0;
              }
              og.a(false, 0, uo.field_f[fc.field_d]);
            }
            return true;
          }
          eg.a(pp.field_K, true);
          if (ec.field_n == hh.field_s) {
            fieldTemp$17 = fc.field_d + 1;
            fc.field_d = fc.field_d + 1;
            if (fieldTemp$17 >= uo.field_f.length) {
              fc.field_d = 0;
            }
            og.a(false, 0, uo.field_f[fc.field_d]);
            return true;
          }
          if (tk.field_k != hh.field_s) {
            if (ti.field_A != hh.field_s) {
              return true;
            }
            var4Lifetime6 = (gn) null;
            og.a(false, 0, (gn) null);
            return true;
          }
          fieldTemp$16 = fc.field_d - 1;
          fc.field_d = fc.field_d - 1;
          if (0 > fieldTemp$16) {
            fc.field_d = -1 + uo.field_f.length;
          }
          og.a(true, 0, uo.field_f[fc.field_d]);
          return true;
        }
        if (null != jn.field_l) {
          if (la.field_g == 0) {
            ii.field_G = -1;
            a.field_i = -1;
          } else {
            if (ii.field_G != -1) {
              var1Lifetime1 = -ii.field_G + hj.field_S;
              var2Lifetime1 = eh.field_h - a.field_i;
              hh.field_p = hh.field_p + var1Lifetime1;
              ed.field_P = ed.field_P + var2Lifetime1;
              if (hh.field_p < 0) {
                hh.field_p = 0;
              }
              if (hh.field_p > 640) {
                hh.field_p = 640;
              }
              if (ed.field_P < 0) {
                ed.field_P = 0;
              }
              ii.field_G = hj.field_S;
              if (480 < ed.field_P) {
                ed.field_P = 480;
              }
              a.field_i = eh.field_h;
            } else {
              ii.field_G = -1;
              a.field_i = -1;
            }
          }
          if (!pd.c(eh.field_h, hj.field_S, (byte) 120)) {
            return false;
          }
          if (no.field_d != 0 &&
            -1 == ii.field_G) {
            ii.field_G = lc.field_c;
            a.field_i = hm.field_k;
            if (param0 > -50) {
              field_b = (String[]) null;
            }
            eg.a(pp.field_K, true);
            if (ec.field_n != hh.field_s) {
              if (tk.field_k != hh.field_s) {
                if (ti.field_A == hh.field_s) {
                  var4Lifetime1 = (gn) null;
                  og.a(false, 0, (gn) null);
                }
              } else {
                fieldTemp$8 = fc.field_d - 1;
                fc.field_d = fc.field_d - 1;
                if (0 > fieldTemp$8) {
                  fc.field_d = -1 + uo.field_f.length;
                }
                og.a(true, 0, uo.field_f[fc.field_d]);
              }
            } else {
              fieldTemp$9 = fc.field_d + 1;
              fc.field_d = fc.field_d + 1;
              if (fieldTemp$9 >= uo.field_f.length) {
                fc.field_d = 0;
              }
              og.a(false, 0, uo.field_f[fc.field_d]);
            }
            return true;
          }
          if (param0 > -50) {
            field_b = (String[]) null;
            eg.a(pp.field_K, true);
            if (ec.field_n != hh.field_s) {
              if (tk.field_k != hh.field_s) {
                if (ti.field_A == hh.field_s) {
                  var4Lifetime1Lifetime1 = (gn) null;
                  og.a(false, 0, (gn) null);
                }
              } else {
                fieldTemp$12 = fc.field_d - 1;
                fc.field_d = fc.field_d - 1;
                if (0 > fieldTemp$12) {
                  fc.field_d = -1 + uo.field_f.length;
                }
                og.a(true, 0, uo.field_f[fc.field_d]);
              }
            } else {
              fieldTemp$13 = fc.field_d + 1;
              fc.field_d = fc.field_d + 1;
              if (fieldTemp$13 >= uo.field_f.length) {
                fc.field_d = 0;
              }
              og.a(false, 0, uo.field_f[fc.field_d]);
            }
            return true;
          }
          eg.a(pp.field_K, true);
          if (ec.field_n == hh.field_s) {
            fieldTemp$11 = fc.field_d + 1;
            fc.field_d = fc.field_d + 1;
            if (fieldTemp$11 >= uo.field_f.length) {
              fc.field_d = 0;
            }
            og.a(false, 0, uo.field_f[fc.field_d]);
            return true;
          }
          if (tk.field_k != hh.field_s) {
            if (ti.field_A != hh.field_s) {
              return true;
            }
            var4Lifetime1Lifetime2 = (gn) null;
            og.a(false, 0, (gn) null);
            return true;
          }
          fieldTemp$10 = fc.field_d - 1;
          fc.field_d = fc.field_d - 1;
          if (0 > fieldTemp$10) {
            fc.field_d = -1 + uo.field_f.length;
          }
          og.a(true, 0, uo.field_f[fc.field_d]);
          return true;
        }
        if (no.field_d != 0) {
          if (!pd.c(hm.field_k, lc.field_c, (byte) 67)) {
            return false;
          }
          og.a(false, 0, uo.field_f[fc.field_d]);
          return true;
        }
        if (la.field_g == 0) {
          ii.field_G = -1;
          a.field_i = -1;
        } else {
          if (ii.field_G != -1) {
            var1Lifetime2 = -ii.field_G + hj.field_S;
            var2Lifetime2 = eh.field_h - a.field_i;
            hh.field_p = hh.field_p + var1Lifetime2;
            ed.field_P = ed.field_P + var2Lifetime2;
            if (hh.field_p < 0) {
              hh.field_p = 0;
            }
            if (hh.field_p > 640) {
              hh.field_p = 640;
            }
            if (ed.field_P < 0) {
              ed.field_P = 0;
            }
            ii.field_G = hj.field_S;
            if (480 < ed.field_P) {
              ed.field_P = 480;
            }
            a.field_i = eh.field_h;
          } else {
            ii.field_G = -1;
            a.field_i = -1;
          }
        }
        if (!pd.c(eh.field_h, hj.field_S, (byte) 120)) {
          return false;
        }
        if (no.field_d != 0 &&
          -1 == ii.field_G) {
          ii.field_G = lc.field_c;
          a.field_i = hm.field_k;
          if (param0 > -50) {
            field_b = (String[]) null;
            eg.a(pp.field_K, true);
            if (ec.field_n != hh.field_s) {
              if (tk.field_k != hh.field_s) {
                if (ti.field_A == hh.field_s) {
                  var4Lifetime2 = (gn) null;
                  og.a(false, 0, (gn) null);
                }
              } else {
                fieldTemp$2 = fc.field_d - 1;
                fc.field_d = fc.field_d - 1;
                if (0 > fieldTemp$2) {
                  fc.field_d = -1 + uo.field_f.length;
                }
                og.a(true, 0, uo.field_f[fc.field_d]);
              }
            } else {
              fieldTemp$3 = fc.field_d + 1;
              fc.field_d = fc.field_d + 1;
              if (fieldTemp$3 >= uo.field_f.length) {
                fc.field_d = 0;
              }
              og.a(false, 0, uo.field_f[fc.field_d]);
            }
            return true;
          }
          eg.a(pp.field_K, true);
          if (ec.field_n == hh.field_s) {
            fieldTemp$1 = fc.field_d + 1;
            fc.field_d = fc.field_d + 1;
            if (fieldTemp$1 >= uo.field_f.length) {
              fc.field_d = 0;
            }
            og.a(false, 0, uo.field_f[fc.field_d]);
            return true;
          }
          if (tk.field_k != hh.field_s) {
            if (ti.field_A != hh.field_s) {
              return true;
            }
            var4Lifetime2Lifetime1 = (gn) null;
            og.a(false, 0, (gn) null);
            return true;
          }
          fieldTemp$0 = fc.field_d - 1;
          fc.field_d = fc.field_d - 1;
          if (0 > fieldTemp$0) {
            fc.field_d = -1 + uo.field_f.length;
          }
          og.a(true, 0, uo.field_f[fc.field_d]);
          return true;
        }
        if (param0 <= -50) {
          eg.a(pp.field_K, true);
          if (ec.field_n == hh.field_s) {
            fieldTemp$5 = fc.field_d + 1;
            fc.field_d = fc.field_d + 1;
            if (fieldTemp$5 >= uo.field_f.length) {
              fc.field_d = 0;
            }
            og.a(false, 0, uo.field_f[fc.field_d]);
            return true;
          }
          if (tk.field_k != hh.field_s) {
            if (ti.field_A != hh.field_s) {
              return true;
            }
            var4Lifetime3 = (gn) null;
            og.a(false, 0, (gn) null);
            return true;
          }
          fieldTemp$4 = fc.field_d - 1;
          fc.field_d = fc.field_d - 1;
          if (0 > fieldTemp$4) {
            fc.field_d = -1 + uo.field_f.length;
          }
          og.a(true, 0, uo.field_f[fc.field_d]);
          return true;
        }
        field_b = (String[]) null;
        eg.a(pp.field_K, true);
        if (ec.field_n == hh.field_s) {
          fieldTemp$7 = fc.field_d + 1;
          fc.field_d = fc.field_d + 1;
          if (fieldTemp$7 >= uo.field_f.length) {
            fc.field_d = 0;
          }
          og.a(false, 0, uo.field_f[fc.field_d]);
          return true;
        }
        if (tk.field_k != hh.field_s) {
          if (ti.field_A != hh.field_s) {
            return true;
          }
          var4Lifetime4 = (gn) null;
          og.a(false, 0, (gn) null);
          return true;
        }
        fieldTemp$6 = fc.field_d - 1;
        fc.field_d = fc.field_d - 1;
        if (0 > fieldTemp$6) {
          fc.field_d = -1 + uo.field_f.length;
        }
        og.a(true, 0, uo.field_f[fc.field_d]);
        return true;
    }

    public static void b(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 < 81) {
          return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "This is the active raider.";
        field_c = "<col=FF8000><%0></col> of your raiders were caught and eaten.";
        field_b = new String[]{"<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal"};
    }
}
