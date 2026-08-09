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
            this.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "af.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
          field_a = (te[]) null;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (param1.field_k == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == -61) {
                var3_int = 0;
                L1: while (true) {
                  L2: {
                    if (50 <= var3_int) {
                      break L2;
                    } else {
                      if (null == param1.field_k.peekEvent()) {
                        break L2;
                      } else {
                        en.a((byte) -15, 1L);
                        var3_int++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    L3: {
                      if (param2 == null) {
                        break L3;
                      } else {
                        param1.field_k.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        return;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = (Exception) (Object) decompiledCaughtException;
                    return;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("af.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(lk param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              af.a(param0, this.field_d, false);
              if (param1) {
                break L1;
              } else {
                field_e = (sk) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("af.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    af() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int var6;
        int var7;
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
                stackIn_48_0 = param1 * 1000 / var6;
                break L1;
              } else {
                stackIn_48_0 = 0;
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
                stackIn_35_0 = param1 * 1000 / var6;
                break L4;
              } else {
                stackIn_35_0 = 0;
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
                stackIn_21_0 = param1 * 1000 / var6;
                break L7;
              } else {
                stackIn_21_0 = 0;
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
                stackIn_8_0 = param1 * 1000 / var6;
                break L10;
              } else {
                stackIn_8_0 = 0;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a((byte) 45, param1);
              L2: while (true) {
                if (-1 != (var3.field_f ^ -1)) {
                  if (-2 == (var3.field_f ^ -1)) {
                    param1.setVisible(param2);
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
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("af.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Crate location";
        field_f = "Rock busters: ";
        field_g = "Five rock busters";
        field_h = 20;
    }
}
