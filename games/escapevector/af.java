/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_b;
    static String field_f;
    volatile boolean field_c;
    static String field_g;
    static te[] field_a;
    java.awt.Frame field_d;
    static int field_h;
    static sk field_e;

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((af) this).field_c = true;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "af.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (!(bk.field_r == null)) {
            bk.field_r.a((byte) -118);
        }
    }

    public static void a() {
        field_g = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(byte param0, lk param1, Object param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (param1.field_k == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("af.B(").append(-61).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(lk param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$3 = 0;
              af.a(param0, ((af) this).field_d);
              if (param1) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("af.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    af() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          vi.field_e[jf.field_J] = param4;
          cd.field_q[jf.field_J] = jf.field_J;
          fl.field_k[jf.field_J] = param5;
          if (param5 < vl.field_e) {
            pg.field_d = param5;
            break L0;
          } else {
            break L0;
          }
        }
        if (oa.field_t >= param5) {
          pc.field_c[jf.field_J] = param1;
          if (param0 == 1) {
            L1: {
              mi.field_k[jf.field_J] = param2;
              tm.field_fb[jf.field_J] = param3;
              var6 = param3 + param2 + param1;
              if (var6 != 0) {
                stackOut_47_0 = param1 * 1000 / var6;
                stackIn_48_0 = stackOut_47_0;
                break L1;
              } else {
                stackOut_46_0 = 0;
                stackIn_48_0 = stackOut_46_0;
                break L1;
              }
            }
            var7 = stackIn_48_0;
            th.field_v[jf.field_J] = var7;
            jf.field_J = jf.field_J + 1;
            if (var7 < pg.field_d) {
              L2: {
                pg.field_d = var7;
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            L4: {
              af.a(-7, 8, -13, 15, -127, 46);
              mi.field_k[jf.field_J] = param2;
              tm.field_fb[jf.field_J] = param3;
              var6 = param3 + param2 + param1;
              if (var6 != 0) {
                stackOut_34_0 = param1 * 1000 / var6;
                stackIn_35_0 = stackOut_34_0;
                break L4;
              } else {
                stackOut_33_0 = 0;
                stackIn_35_0 = stackOut_33_0;
                break L4;
              }
            }
            var7 = stackIn_35_0;
            th.field_v[jf.field_J] = var7;
            jf.field_J = jf.field_J + 1;
            if (var7 < pg.field_d) {
              L5: {
                pg.field_d = var7;
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } else {
          pl.field_r = param5;
          pc.field_c[jf.field_J] = param1;
          if (param0 != 1) {
            L7: {
              af.a(-7, 8, -13, 15, -127, 46);
              mi.field_k[jf.field_J] = param2;
              tm.field_fb[jf.field_J] = param3;
              var6 = param3 + param2 + param1;
              if (var6 != 0) {
                stackOut_20_0 = param1 * 1000 / var6;
                stackIn_21_0 = stackOut_20_0;
                break L7;
              } else {
                stackOut_19_0 = 0;
                stackIn_21_0 = stackOut_19_0;
                break L7;
              }
            }
            var7 = stackIn_21_0;
            th.field_v[jf.field_J] = var7;
            jf.field_J = jf.field_J + 1;
            if (var7 < pg.field_d) {
              L8: {
                pg.field_d = var7;
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            } else {
              L9: {
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          } else {
            L10: {
              mi.field_k[jf.field_J] = param2;
              tm.field_fb[jf.field_J] = param3;
              var6 = param3 + param2 + param1;
              if (var6 != 0) {
                stackOut_7_0 = param1 * 1000 / var6;
                stackIn_8_0 = stackOut_7_0;
                break L10;
              } else {
                stackOut_6_0 = 0;
                stackIn_8_0 = stackOut_6_0;
                break L10;
              }
            }
            var7 = stackIn_8_0;
            th.field_v[jf.field_J] = var7;
            jf.field_J = jf.field_J + 1;
            if (var7 < pg.field_d) {
              L11: {
                pg.field_d = var7;
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            } else {
              L12: {
                if (pl.field_r < var7) {
                  pl.field_r = var7;
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          }
        }
    }

    final static void a(lk param0, java.awt.Frame param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a((byte) 45, param1);
              L2: while (true) {
                if (-1 != var3.field_f) {
                  if (-2 == var3.field_f) {
                    param1.setVisible(false);
                    param1.dispose();
                    break L0;
                  } else {
                    en.a((byte) -10, 100L);
                    continue L1;
                  }
                } else {
                  en.a((byte) 93, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("af.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Crate location";
        field_f = "Rock busters: ";
        field_g = "Five rock busters";
        field_h = 20;
    }
}
