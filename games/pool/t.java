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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if ((param1[param2 >> 1575286501] & 1 << (param2 & 31)) != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("t.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        try {
          L0: {
            L1: {
              if (param0 > 81) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var1_ref = "(" + hb.field_e + " " + vd.field_g + " " + ia.field_l + ") " + uq.field_c;
              if (of.field_Pb > 0) {
                var1_ref = var1_ref + ":";
                var2 = 0;
                L3: while (true) {
                  if (of.field_Pb <= var2) {
                    break L2;
                  } else {
                    L4: {
                      var1_ref = var1_ref + ' ';
                      var3 = kn.field_e.field_t[var2] & 255;
                      var4 = var3 >> -593389148;
                      var3 = var3 & 15;
                      if (var4 >= 10) {
                        var4 += 55;
                        break L4;
                      } else {
                        var4 += 48;
                        break L4;
                      }
                    }
                    L5: {
                      var1_ref = var1_ref + (char)var4;
                      if (var3 < 10) {
                        var3 += 48;
                        break L5;
                      } else {
                        var3 += 55;
                        break L5;
                      }
                    }
                    var1_ref = var1_ref + (char)var3;
                    var2++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_17_0 = (String) var1_ref;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "t.C(" + param0 + ')');
        }
        return stackIn_18_0;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 == 29050) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (~var2_int >= ~var4) {
                stackOut_6_0 = var3;
                stackIn_7_0 = stackOut_6_0;
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
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("t.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
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
              boolean discarded$15 = fk.field_cb.a(-122, sa.field_p, true, tl.field_M);
              fk.field_cb.h((byte) 122);
              L2: while (true) {
                if (!n.h(127)) {
                  break L0;
                } else {
                  boolean discarded$16 = fk.field_cb.a(-81, qi.field_a, ml.field_b);
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
                    fk.field_cb.b((ei) (Object) new gk(fk.field_cb, el.field_K), 30000);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "t.F(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
            field_a = null;
            field_c = null;
            field_b = null;
            if (param0 > -16) {
                field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "t.A(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != sa.field_f) {
                qh.g(qh.field_b, qh.field_c, qh.field_j + -qh.field_b, qh.field_g + -qh.field_c);
                sa.field_f.a((byte) -79, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 48) {
                break L2;
              } else {
                t.b(-101);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "t.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        try {
            tg.a(-124, param1, param2, (String) null);
            int var3_int = -51 / ((param0 - 59) / 47);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "t.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_e = 0;
    }
}
