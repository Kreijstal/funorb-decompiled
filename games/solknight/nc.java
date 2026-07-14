/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    gg field_e;
    static String field_b;
    static int field_g;
    static long field_f;
    static java.math.BigInteger field_d;
    private gg field_c;
    static int field_a;

    final gg e(byte param0) {
        gg var2 = null;
        if (param0 == 86) {
          var2 = ((nc) this).field_e.field_a;
          if (var2 == ((nc) this).field_e) {
            return null;
          } else {
            var2.c(10);
            return var2;
          }
        } else {
          return null;
        }
    }

    final gg b(int param0) {
        gg var2 = null;
        var2 = ((nc) this).field_c;
        if (((nc) this).field_e != var2) {
          if (param0 >= -13) {
            boolean discarded$2 = ((nc) this).c(125);
            ((nc) this).field_c = var2.field_d;
            return var2;
          } else {
            ((nc) this).field_c = var2.field_d;
            return var2;
          }
        } else {
          ((nc) this).field_c = null;
          return null;
        }
    }

    final gg b(byte param0) {
        gg var2 = null;
        if (param0 != 94) {
            field_f = 120L;
            var2 = ((nc) this).field_c;
            if (!(var2 != ((nc) this).field_e)) {
                ((nc) this).field_c = null;
                return null;
            }
            ((nc) this).field_c = var2.field_a;
            return var2;
        }
        var2 = ((nc) this).field_c;
        if (!(var2 != ((nc) this).field_e)) {
            ((nc) this).field_c = null;
            return null;
        }
        ((nc) this).field_c = var2.field_a;
        return var2;
    }

    final gg a(int param0) {
        gg var2 = null;
        if (param0 == 0) {
          var2 = ((nc) this).field_e.field_d;
          if (var2 == ((nc) this).field_e) {
            return null;
          } else {
            var2.c(10);
            return var2;
          }
        } else {
          return null;
        }
    }

    final gg c(byte param0) {
        gg var2 = ((nc) this).field_e.field_a;
        if (param0 != 96) {
            Object var3 = null;
            nc.a((byte) 61, (java.awt.Canvas) null);
            if (!(var2 != ((nc) this).field_e)) {
                ((nc) this).field_c = null;
                return null;
            }
            ((nc) this).field_c = var2.field_a;
            return var2;
        }
        if (!(var2 != ((nc) this).field_e)) {
            ((nc) this).field_c = null;
            return null;
        }
        ((nc) this).field_c = var2.field_a;
        return var2;
    }

    public static void d(byte param0) {
        field_b = null;
        if (param0 >= -105) {
            field_f = 59L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            field_f = 105L;
            if (((nc) this).field_e != ((nc) this).field_e.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((nc) this).field_e != ((nc) this).field_e.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(gg param0, int param1) {
        if (param1 == -7044) {
          if (null != param0.field_a) {
            param0.c(param1 ^ -7050);
            param0.field_d = ((nc) this).field_e;
            param0.field_a = ((nc) this).field_e.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            return;
          } else {
            param0.field_d = ((nc) this).field_e;
            param0.field_a = ((nc) this).field_e.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            return;
          }
        } else {
          field_g = -70;
          if (null == param0.field_a) {
            param0.field_d = ((nc) this).field_e;
            param0.field_a = ((nc) this).field_e.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            return;
          } else {
            param0.c(param1 ^ -7050);
            param0.field_d = ((nc) this).field_e;
            param0.field_a = ((nc) this).field_e.field_a;
            param0.field_a.field_d = param0;
            param0.field_d.field_a = param0;
            return;
          }
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        Object var3 = null;
        ob.a(-1, (java.awt.Component) (Object) param1);
        if (param0 == 86) {
          sj.a((java.awt.Component) (Object) param1, -122);
          if (ah.field_d != null) {
            ah.field_d.a((java.awt.Component) (Object) param1, -127);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          nc.a((java.awt.Canvas) null, 35, true);
          sj.a((java.awt.Component) (Object) param1, -122);
          if (ah.field_d == null) {
            return;
          } else {
            ah.field_d.a((java.awt.Component) (Object) param1, -127);
            return;
          }
        }
    }

    final void a(int param0, gg param1) {
        L0: {
          if (null != param1.field_a) {
            param1.c(10);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_d = ((nc) this).field_e.field_d;
        param1.field_a = ((nc) this).field_e;
        param1.field_a.field_d = param1;
        if (param0 != -3024) {
          gg discarded$2 = ((nc) this).c((byte) -25);
          param1.field_d.field_a = param1;
          return;
        } else {
          param1.field_d.field_a = param1;
          return;
        }
    }

    final gg a(byte param0) {
        gg var2 = null;
        if (param0 != 51) {
            field_f = -72L;
            var2 = ((nc) this).field_e.field_d;
            if (!(((nc) this).field_e != var2)) {
                ((nc) this).field_c = null;
                return null;
            }
            ((nc) this).field_c = var2.field_d;
            return var2;
        }
        var2 = ((nc) this).field_e.field_d;
        if (!(((nc) this).field_e != var2)) {
            ((nc) this).field_c = null;
            return null;
        }
        ((nc) this).field_c = var2.field_d;
        return var2;
    }

    final static pd a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            pd var5 = null;
            oa var5_ref = null;
            pd stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            pd stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("vf");
                var5 = (pd) var4.newInstance();
                if (param2 == -35) {
                  break L0;
                } else {
                  field_b = null;
                  break L0;
                }
              }
              var5.a(param3, param2 ^ -9354, param1, param0);
              stackOut_2_0 = (pd) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param1 > 26) {
          if ((kj.field_R ^ -1) <= -11) {
            if (uk.h(250)) {
              if (-1 != (fj.field_i ^ -1)) {
                ih.a(20753, param0);
                return;
              } else {
                nh.a((byte) -101, false, param2);
                uf.a((byte) 99, 0, 0, param0);
                return;
              }
            } else {
              mi.a();
              vg.b(240, 320, 18);
              uf.a((byte) 99, 0, 0, param0);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (!wa.field_b) {
                break L0;
              } else {
                wa.field_b = false;
                var3 = 1;
                break L0;
              }
            }
            la.a(ak.a(true), ae.field_e, 82, var3 != 0, mc.a(-100));
            return;
          }
        } else {
          field_a = -33;
          if ((kj.field_R ^ -1) <= -11) {
            if (uk.h(250)) {
              if (-1 != (fj.field_i ^ -1)) {
                ih.a(20753, param0);
                return;
              } else {
                nh.a((byte) -101, false, param2);
                uf.a((byte) 99, 0, 0, param0);
                return;
              }
            } else {
              mi.a();
              vg.b(240, 320, 18);
              uf.a((byte) 99, 0, 0, param0);
              return;
            }
          } else {
            L1: {
              var3 = 0;
              if (!wa.field_b) {
                break L1;
              } else {
                wa.field_b = false;
                var3 = 1;
                break L1;
              }
            }
            la.a(ak.a(true), ae.field_e, 82, var3 != 0, mc.a(-100));
            return;
          }
        }
    }

    public nc() {
        ((nc) this).field_e = new gg();
        ((nc) this).field_e.field_d = ((nc) this).field_e;
        ((nc) this).field_e.field_a = ((nc) this).field_e;
    }

    final void a(boolean param0) {
        gg var2 = null;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          var2 = ((nc) this).field_e.field_d;
          if (var2 != ((nc) this).field_e) {
            var2.c(10);
            continue L0;
          } else {
            if (!param0) {
              return;
            } else {
              ((nc) this).field_c = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = new java.math.BigInteger("65537");
    }
}
