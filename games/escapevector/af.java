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
        ((af) this).field_c = true;
    }

    final static void a(int param0) {
        if (!(bk.field_r == null)) {
            bk.field_r.a((byte) -118);
        }
        if (param0 != 0) {
            af.a((byte) -8);
            return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 37) {
          field_a = null;
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static void a(byte param0, lk param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        if (param1.field_k == null) {
          return;
        } else {
          if (param0 == -61) {
            var3_int = 0;
            L0: while (true) {
              L1: {
                if (50 <= var3_int) {
                  break L1;
                } else {
                  if (null == param1.field_k.peekEvent()) {
                    break L1;
                  } else {
                    en.a((byte) -15, 1L);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              try {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    param1.field_k.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  break L3;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(lk param0, boolean param1) {
        af.a(param0, ((af) this).field_d, false);
        if (!param1) {
            field_e = null;
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

    final static void a(lk param0, java.awt.Frame param1, boolean param2) {
        la var3 = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        L0: while (true) {
          var3 = param0.a((byte) 45, param1);
          L1: while (true) {
            if (-1 != var3.field_f) {
              if (-2 == var3.field_f) {
                param1.setVisible(param2);
                param1.dispose();
                return;
              } else {
                en.a((byte) -10, 100L);
                continue L0;
              }
            } else {
              en.a((byte) 93, 10L);
              continue L1;
            }
          }
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
