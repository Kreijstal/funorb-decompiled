/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eaa {
    static long field_a;
    static eaa field_d;
    bw field_g;
    static boolean field_c;
    static String field_f;
    private bw field_e;
    static int field_b;

    final bw c(int param0) {
        bw var2 = null;
        var2 = ((eaa) this).field_e;
        if (((eaa) this).field_g != var2) {
          ((eaa) this).field_e = var2.field_b;
          if (param0 != 0) {
            ((eaa) this).field_g = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((eaa) this).field_e = null;
          return null;
        }
    }

    final bw a(bw param0, int param1) {
        bw var3 = null;
        if (param1 != 0) {
            field_a = 81L;
            if (param0 != null) {
                var3 = param0;
            } else {
                var3 = ((eaa) this).field_g.field_b;
            }
            if (!(var3 != ((eaa) this).field_g)) {
                ((eaa) this).field_e = null;
                return null;
            }
            ((eaa) this).field_e = var3.field_b;
            return var3;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((eaa) this).field_g.field_b;
        }
        if (!(var3 != ((eaa) this).field_g)) {
            ((eaa) this).field_e = null;
            return null;
        }
        ((eaa) this).field_e = var3.field_b;
        return var3;
    }

    final int g(int param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = param0;
        bw var3 = ((eaa) this).field_g.field_b;
        while (((eaa) this).field_g != var3) {
            var2++;
            var3 = var3.field_b;
        }
        return var2;
    }

    final bw b(byte param0) {
        if (param0 != 90) {
            return null;
        }
        bw var2 = ((eaa) this).field_g.field_b;
        if (!(var2 != ((eaa) this).field_g)) {
            ((eaa) this).field_e = null;
            return null;
        }
        ((eaa) this).field_e = var2.field_b;
        return var2;
    }

    final bw c(byte param0) {
        bw var2 = null;
        var2 = ((eaa) this).field_e;
        if (var2 != ((eaa) this).field_g) {
          ((eaa) this).field_e = var2.field_e;
          if (param0 != 116) {
            bw discarded$2 = ((eaa) this).b((byte) -39);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((eaa) this).field_e = null;
          return null;
        }
    }

    final void d(int param0) {
        bw var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        L0: while (true) {
          var2 = ((eaa) this).field_g.field_b;
          if (var2 == ((eaa) this).field_g) {
            if (param0 <= 56) {
              bw discarded$2 = ((eaa) this).c((byte) -57);
              ((eaa) this).field_e = null;
              return;
            } else {
              ((eaa) this).field_e = null;
              return;
            }
          } else {
            var2.a(false);
            continue L0;
          }
        }
    }

    final static void f(int param0) {
        ld.a(16777215, 0, 45, 0);
        ld.a(12648447, 3, 45, 3);
        ld.a(16777152, 5, 45, 5);
        ld.a(49407, 2, 45, 2);
        ld.a(12648384, 4, 45, 4);
        ld.a(16760832, 1, param0 ^ 31910, 1);
        ld.a(12632256, 7, 45, 7);
        if (param0 != 31883) {
          eaa.b(60);
          ld.a(16711872, 6, param0 + -31838, 6);
          return;
        } else {
          ld.a(16711872, 6, param0 + -31838, 6);
          return;
        }
    }

    final int a(byte param0, bw[] param1) {
        int var3 = 0;
        bw var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var3 = 0;
        var4 = ((eaa) this).field_g.field_b;
        if (param0 >= 65) {
          L0: while (true) {
            if (var4 == ((eaa) this).field_g) {
              return var3;
            } else {
              var3++;
              param1[var3] = (bw) (Object) param1;
              var4 = var4.field_b;
              continue L0;
            }
          }
        } else {
          boolean discarded$1 = ((eaa) this).e(98);
          L1: while (true) {
            if (var4 == ((eaa) this).field_g) {
              return var3;
            } else {
              var3++;
              param1[var3] = (bw) (Object) param1;
              var4 = var4.field_b;
              continue L1;
            }
          }
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 12917) {
          L0: {
            bw discarded$10 = ((eaa) this).c((byte) -117);
            if (((eaa) this).field_g.field_b != ((eaa) this).field_g) {
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
            if (((eaa) this).field_g.field_b != ((eaa) this).field_g) {
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

    public static void b(int param0) {
        field_f = null;
        if (param0 != 7) {
            field_a = 30L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, bw param1) {
        L0: {
          if (param1.field_e != null) {
            param1.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_b = ((eaa) this).field_g.field_b;
        param1.field_e = ((eaa) this).field_g;
        param1.field_e.field_b = param1;
        if (param0 > -2) {
          return;
        } else {
          param1.field_b.field_e = param1;
          return;
        }
    }

    private final void a(eaa param0, bw param1, boolean param2) {
        bw var4 = null;
        var4 = ((eaa) this).field_g.field_e;
        ((eaa) this).field_g.field_e = param1.field_e;
        param1.field_e.field_b = ((eaa) this).field_g;
        if (param2) {
          if (param1 == ((eaa) this).field_g) {
            return;
          } else {
            param1.field_e = param0.field_g.field_e;
            param1.field_e.field_b = param1;
            var4.field_b = param0.field_g;
            param0.field_g.field_e = var4;
            return;
          }
        } else {
          bw discarded$1 = ((eaa) this).a(true);
          if (param1 == ((eaa) this).field_g) {
            return;
          } else {
            param1.field_e = param0.field_g.field_e;
            param1.field_e.field_b = param1;
            var4.field_b = param0.field_g;
            param0.field_g.field_e = var4;
            return;
          }
        }
    }

    final void a(eaa param0, int param1) {
        Object var4 = null;
        this.a(param0, ((eaa) this).field_g.field_b, true);
        if (param1 == 12632256) {
          return;
        } else {
          var4 = null;
          this.a((eaa) null, (bw) null, true);
          return;
        }
    }

    final bw a(int param0) {
        bw var2 = null;
        Object var3 = null;
        var2 = ((eaa) this).field_g.field_e;
        if (((eaa) this).field_g != var2) {
          ((eaa) this).field_e = var2.field_e;
          if (param0 != 6) {
            var3 = null;
            ((eaa) this).a((bw) null, false);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((eaa) this).field_e = null;
          return null;
        }
    }

    final bw a(byte param0) {
        bw var2 = null;
        var2 = ((eaa) this).field_g.field_e;
        if (param0 == -124) {
          if (((eaa) this).field_g == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(bw param0, boolean param1) {
        Object var4 = null;
        bw stackIn_2_0 = null;
        bw stackIn_3_0 = null;
        bw stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        bw stackOut_1_0 = null;
        bw stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        bw stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          if (null == param0.field_e) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = (bw) param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param1) {
                stackOut_3_0 = (bw) (Object) stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (bw) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((bw) (Object) stackIn_4_0).a(stackIn_4_1 != 0);
            break L0;
          }
        }
        param0.field_b = ((eaa) this).field_g;
        if (!param1) {
          var4 = null;
          bw discarded$2 = ((eaa) this).a((bw) null, 125);
          param0.field_e = ((eaa) this).field_g.field_e;
          param0.field_e.field_b = param0;
          param0.field_b.field_e = param0;
          return;
        } else {
          param0.field_e = ((eaa) this).field_g.field_e;
          param0.field_e.field_b = param0;
          param0.field_b.field_e = param0;
          return;
        }
    }

    final bw a(boolean param0) {
        bw var2 = ((eaa) this).field_g.field_b;
        if (var2 == ((eaa) this).field_g) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    public eaa() {
        ((eaa) this).field_g = new bw();
        ((eaa) this).field_g.field_e = ((eaa) this).field_g;
        ((eaa) this).field_g.field_b = ((eaa) this).field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_f = "Show all game chat";
        field_b = -1;
        field_d = new eaa();
    }
}
