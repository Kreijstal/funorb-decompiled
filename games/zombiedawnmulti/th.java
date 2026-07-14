/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_c;
    br field_b;
    static String field_e;
    static String field_d;
    private br field_f;
    static String field_a;

    final br c(byte param0) {
        br var2 = null;
        var2 = ((th) this).field_f;
        if (var2 != ((th) this).field_b) {
          ((th) this).field_f = var2.field_b;
          if (param0 < 95) {
            field_c = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((th) this).field_f = null;
          return null;
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 28113) {
          L0: {
            br discarded$10 = ((th) this).c(-26);
            if (((th) this).field_b != ((th) this).field_b.field_d) {
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
            if (((th) this).field_b != ((th) this).field_b.field_d) {
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

    final br a(boolean param0) {
        br var2 = null;
        if (param0) {
          var2 = ((th) this).field_b.field_b;
          if (var2 == ((th) this).field_b) {
            return null;
          } else {
            var2.a(param0);
            return var2;
          }
        } else {
          br discarded$2 = ((th) this).b(-47);
          var2 = ((th) this).field_b.field_b;
          if (var2 == ((th) this).field_b) {
            return null;
          } else {
            var2.a(param0);
            return var2;
          }
        }
    }

    final int a(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param0;
        br var3 = ((th) this).field_b.field_d;
        while (var3 != ((th) this).field_b) {
            var3 = var3.field_d;
            var2++;
        }
        return var2;
    }

    final br c(int param0) {
        br var2 = null;
        if (param0 <= 38) {
            br discarded$0 = ((th) this).c(-100);
            var2 = ((th) this).field_b.field_d;
            if (!(((th) this).field_b != var2)) {
                ((th) this).field_f = null;
                return null;
            }
            ((th) this).field_f = var2.field_d;
            return var2;
        }
        var2 = ((th) this).field_b.field_d;
        if (!(((th) this).field_b != var2)) {
            ((th) this).field_f = null;
            return null;
        }
        ((th) this).field_f = var2.field_d;
        return var2;
    }

    final br a(byte param0, br param1) {
        br var3 = null;
        int var4 = 0;
        L0: {
          var4 = -72 / ((param0 - 10) / 33);
          if (param1 != null) {
            var3 = param1;
            break L0;
          } else {
            var3 = ((th) this).field_b.field_d;
            break L0;
          }
        }
        if (((th) this).field_b == var3) {
          ((th) this).field_f = null;
          return null;
        } else {
          ((th) this).field_f = var3.field_d;
          return var3;
        }
    }

    final void a(br param0, boolean param1) {
        br stackIn_3_0 = null;
        br stackIn_4_0 = null;
        br stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        br stackOut_2_0 = null;
        br stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        br stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        L0: {
          if (param0.field_b != null) {
            L1: {
              stackOut_2_0 = (br) param0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (param1) {
                stackOut_4_0 = (br) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = (br) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ((br) (Object) stackIn_5_0).a(stackIn_5_1 != 0);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_d = ((th) this).field_b;
        param0.field_b = ((th) this).field_b.field_b;
        param0.field_b.field_d = param0;
        if (param1) {
          return;
        } else {
          param0.field_d.field_b = param0;
          return;
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 <= 61) {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    final br g(int param0) {
        br var2 = null;
        var2 = ((th) this).field_b.field_d;
        if (var2 != ((th) this).field_b) {
          var2.a(true);
          if (param0 <= 33) {
            boolean discarded$2 = ((th) this).f(-15);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final void e(int param0) {
        br var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -30986) {
          L0: while (true) {
            var2 = ((th) this).field_b.field_d;
            if (((th) this).field_b != var2) {
              var2.a(true);
              continue L0;
            } else {
              ((th) this).field_f = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        byte[] var2 = null;
        byte[] var1 = null;
        if (param0 != -61) {
            boolean discarded$19 = th.a(30, 99, -87, 29, -54, -51, -90);
            if (wc.j(112)) {
                fn.field_b = true;
            } else {
                var2 = ll.field_k.f(-16613);
                var1 = var2;
                n discarded$20 = da.a(-55, 6, var2);
                return;
            }
            return;
        }
        if (wc.j(112)) {
            fn.field_b = true;
        } else {
            var2 = ll.field_k.f(-16613);
            var1 = var2;
            n discarded$21 = da.a(-55, 6, var2);
            return;
        }
    }

    final br a(byte param0) {
        br var2 = null;
        int var3 = 0;
        var2 = ((th) this).field_b.field_b;
        if (var2 == ((th) this).field_b) {
          ((th) this).field_f = null;
          return null;
        } else {
          ((th) this).field_f = var2.field_b;
          var3 = 19 % ((param0 - 13) / 39);
          return var2;
        }
    }

    final void a(int param0, br param1) {
        L0: {
          if (null != param1.field_b) {
            param1.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_b = ((th) this).field_b;
        param1.field_d = ((th) this).field_b.field_d;
        param1.field_b.field_d = param1;
        param1.field_d.field_b = param1;
        if (param0 == -25612) {
          return;
        } else {
          br discarded$2 = ((th) this).b(78);
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        var7 = -3 / ((param6 - 47) / 40);
        if (param2 >= param1) {
          if (param2 < param3 + param1) {
            if (param4 <= param0) {
              if (param5 + param4 <= param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public th() {
        ((th) this).field_b = new br();
        ((th) this).field_b.field_b = ((th) this).field_b;
        ((th) this).field_b.field_d = ((th) this).field_b;
    }

    final br b(int param0) {
        br var2 = null;
        var2 = ((th) this).field_f;
        if (((th) this).field_b != var2) {
          ((th) this).field_f = var2.field_d;
          if (param0 != 6) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((th) this).field_f = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Add <%0> to friend list";
        field_d = "NEW";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Names cannot start or end with space or underscore";
    }
}
