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
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if ((param1[param2 >> 1575286501] & 1 << (param2 & 31)) != 0) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("t.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        String var8;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        if (param0 > 81) {
          var14 = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
          var1 = var14;
          if ((of.field_Pb ^ -1) >= -1) {
            return var1;
          } else {
            var1 = var14 + ":";
            var2 = 0;
            L0: while (true) {
              if (of.field_Pb <= var2) {
                return var1;
              } else {
                L1: {
                  var15 = var1 + ' ';
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
                  var16 = var15 + (char)var4;
                  if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                    break L2;
                  } else {
                    var3 += 55;
                    break L2;
                  }
                }
                var1 = var16 + (char)var3;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          field_b = (vh) null;
          var8 = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
          var1 = var8;
          if ((of.field_Pb ^ -1) < -1) {
            var1 = var8 + ":";
            var2 = 0;
            L3: while (true) {
              if (of.field_Pb > var2) {
                L4: {
                  var12 = var1 + ' ';
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
                  var13 = var12 + (char)var4;
                  if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                    break L5;
                  } else {
                    var3 += 55;
                    break L5;
                  }
                }
                var1 = var13 + (char)var3;
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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 == 29050) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_6_0 = var3;
                break L0;
              } else {
                var3 = (var3 << -523769531) + (-var3 + vi.a(param1.charAt(var4), true));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("t.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            if (ql.a(param0 + -6709)) {
              L1: {
                if (param0 == -11) {
                  break L1;
                } else {
                  t.b(-62);
                  break L1;
                }
              }
              fk.field_cb.a(-122, sa.field_p, true, tl.field_M);
              fk.field_cb.h((byte) 122);
              L2: while (true) {
                if (!n.h(127)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fk.field_cb.a(-81, qi.field_a, ml.field_b);
                  continue L2;
                }
              }
            } else {
              L3: {
                if (ne.field_u == null) {
                  break L3;
                } else {
                  if (ne.field_u.field_e) {
                    tq.d((byte) -124);
                    fk.field_cb.b(new gk(fk.field_cb, el.field_K), 30000);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "t.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_a = (int[][][]) null;
        field_c = null;
        field_b = null;
        if (param0 > -16) {
            field_a = (int[][][]) null;
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
        String var4 = (String) null;
        tg.a(-124, param1, param2, (String) null);
        int var3 = -51 / ((param0 - 59) / 47);
    }

    static {
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_e = 0;
    }
}
