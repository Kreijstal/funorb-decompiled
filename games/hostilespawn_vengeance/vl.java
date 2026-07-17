/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    am field_b;
    static vl field_c;
    private am field_a;

    final void d(int param0) {
        am var2 = null;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        L0: while (true) {
          var2 = ((vl) this).field_b.field_g;
          if (((vl) this).field_b != var2) {
            var2.b(param0 + -5692);
            continue L0;
          } else {
            ((vl) this).field_a = null;
            if (param0 != 5719) {
              field_c = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final am g(int param0) {
        am var2 = null;
        if (param0 < -2) {
          var2 = ((vl) this).field_b.field_g;
          if (((vl) this).field_b == var2) {
            ((vl) this).field_a = null;
            return null;
          } else {
            ((vl) this).field_a = var2.field_g;
            return var2;
          }
        } else {
          ((vl) this).field_a = null;
          var2 = ((vl) this).field_b.field_g;
          if (((vl) this).field_b == var2) {
            ((vl) this).field_a = null;
            return null;
          } else {
            ((vl) this).field_a = var2.field_g;
            return var2;
          }
        }
    }

    final am b(int param0) {
        am var2 = null;
        if (param0 == -27493) {
          var2 = ((vl) this).field_b.field_f;
          if (var2 == ((vl) this).field_b) {
            return null;
          } else {
            var2.b(27);
            return var2;
          }
        } else {
          return null;
        }
    }

    final am b(byte param0) {
        am var2 = null;
        if (param0 != 117) {
            am discarded$0 = ((vl) this).c(-99);
            var2 = ((vl) this).field_b.field_f;
            if (!(((vl) this).field_b != var2)) {
                ((vl) this).field_a = null;
                return null;
            }
            ((vl) this).field_a = var2.field_f;
            return var2;
        }
        var2 = ((vl) this).field_b.field_f;
        if (!(((vl) this).field_b != var2)) {
            ((vl) this).field_a = null;
            return null;
        }
        ((vl) this).field_a = var2.field_f;
        return var2;
    }

    public static void f(int param0) {
        if (param0 <= 46) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final am c(int param0) {
        am var2 = null;
        var2 = ((vl) this).field_b.field_g;
        if (param0 == 18120) {
          if (((vl) this).field_b == var2) {
            return null;
          } else {
            var2.b(106);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(am param0, int param1) {
        try {
            if (param0.field_f != null) {
                param0.b(123);
            }
            param0.field_g = ((vl) this).field_b;
            param0.field_f = ((vl) this).field_b.field_f;
            if (param1 <= 79) {
                ((vl) this).field_b = null;
            }
            param0.field_f.field_g = param0;
            param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vl.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -20049) {
          L0: {
            ((vl) this).field_b = null;
            if (((vl) this).field_b.field_g != ((vl) this).field_b) {
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
            if (((vl) this).field_b.field_g != ((vl) this).field_b) {
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

    final am a(byte param0) {
        am var2 = null;
        var2 = ((vl) this).field_a;
        if (((vl) this).field_b != var2) {
          ((vl) this).field_a = var2.field_f;
          if (param0 <= 4) {
            am discarded$2 = ((vl) this).b(24);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((vl) this).field_a = null;
          return null;
        }
    }

    public vl() {
        ((vl) this).field_b = new am();
        ((vl) this).field_b.field_f = ((vl) this).field_b;
        ((vl) this).field_b.field_g = ((vl) this).field_b;
    }

    final void a(byte param0, am param1) {
        try {
            if (param1.field_f != null) {
                param1.b(116);
            }
            if (param0 > -45) {
                ((vl) this).field_b = null;
            }
            param1.field_f = ((vl) this).field_b;
            param1.field_g = ((vl) this).field_b.field_g;
            param1.field_f.field_g = param1;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "vl.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final am a(int param0) {
        if (param0 != 12684) {
            return null;
        }
        am var2 = ((vl) this).field_a;
        if (!(((vl) this).field_b != var2)) {
            ((vl) this).field_a = null;
            return null;
        }
        ((vl) this).field_a = var2.field_g;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new vl();
    }
}
