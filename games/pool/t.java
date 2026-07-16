/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_c;
    static int field_d;
    static vh field_b;
    static int field_e;
    static int[][][] field_a;

    final static boolean a(int param0, int[] param1, int param2) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          return false;
        } else {
          L0: {
            if ((param1[param2 >> 1575286501] & 1 << (param2 & 31)) != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0 > 81) {
          var1 = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
          if ((of.field_Pb ^ -1) < -1) {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (of.field_Pb <= var2) {
                return var1;
              } else {
                L1: {
                  var1 = var1 + 32;
                  var3 = kn.field_e.field_t[var2] & 255;
                  var4 = var3 >> -593389148;
                  var3 = var3 & 15;
                  if (-11 >= (var4 ^ -1)) {
                    var4 += 55;
                    break L1;
                  } else {
                    var4 += 48;
                    break L1;
                  }
                }
                L2: {
                  var1 = var1 + (char)var4;
                  if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                    break L2;
                  } else {
                    var3 += 55;
                    break L2;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L0;
              }
            }
          } else {
            return var1;
          }
        } else {
          field_b = null;
          var1 = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
          if ((of.field_Pb ^ -1) < -1) {
            var1 = var1 + ":";
            var2 = 0;
            L3: while (true) {
              if (of.field_Pb > var2) {
                L4: {
                  var1 = var1 + 32;
                  var3 = kn.field_e.field_t[var2] & 255;
                  var4 = var3 >> -593389148;
                  var3 = var3 & 15;
                  if (-11 >= (var4 ^ -1)) {
                    var4 += 55;
                    break L4;
                  } else {
                    var4 += 48;
                    break L4;
                  }
                }
                L5: {
                  var1 = var1 + (char)var4;
                  if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                    break L5;
                  } else {
                    var3 += 55;
                    break L5;
                  }
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = param1.length();
        var3 = 0;
        if (param0 != 29050) {
          field_c = null;
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = (var3 << -523769531) + (-var3 + vi.a(param1.charAt(var4), true));
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = (var3 << -523769531) + (-var3 + vi.a(param1.charAt(var4), true));
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0) {
        if (ql.a(param0 + -6709)) {
          if (param0 == -11) {
            boolean discarded$4 = fk.field_cb.a(-122, sa.field_p, true, tl.field_M);
            fk.field_cb.h((byte) 122);
            L0: while (true) {
              if (!n.h(127)) {
                return;
              } else {
                boolean discarded$5 = fk.field_cb.a(-81, qi.field_a, ml.field_b);
                continue L0;
              }
            }
          } else {
            t.b(-62);
            boolean discarded$6 = fk.field_cb.a(-122, sa.field_p, true, tl.field_M);
            fk.field_cb.h((byte) 122);
            L1: while (true) {
              if (!n.h(127)) {
                return;
              } else {
                boolean discarded$7 = fk.field_cb.a(-81, qi.field_a, ml.field_b);
                continue L1;
              }
            }
          }
        } else {
          if (ne.field_u != null) {
            if (!ne.field_u.field_e) {
              return;
            } else {
              tq.d((byte) -124);
              fk.field_cb.b((ei) (Object) new gk(fk.field_cb, el.field_K), 30000);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 > -16) {
            field_a = null;
        }
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (null != sa.field_f) {
            qh.g(qh.field_b, qh.field_c, qh.field_j + -qh.field_b, qh.field_g + -qh.field_c);
            sa.field_f.a((byte) -79, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 48) {
          t.b(-101);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        tg.a(-124, param1, param2, (String) null);
        int var3 = -51 / ((param0 - 59) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_e = 0;
    }
}
