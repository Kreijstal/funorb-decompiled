/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pta implements fo {
    static String field_g;
    private la field_e;
    vna field_b;
    private c field_f;
    private vna field_c;
    static String field_d;
    private boolean field_a;

    public static void b(boolean param0) {
        field_d = null;
        field_g = null;
        if (param0) {
            return;
        }
        field_d = null;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((pta) this).field_e = null;
            return 0;
        }
        return 0;
    }

    public final void f(int param0) {
        if (param0 == -4366) {
            return;
        }
        field_g = null;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            Object var3 = null;
            boolean discarded$0 = pta.a((CharSequence) null, -61);
            return 0;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = -68 % ((-41 - param1) / 42);
        c var4 = (c) (Object) ((pta) this).field_b.f(-80);
        while (var4 != null) {
            param0 = var4.a(param0, (byte) -39);
            var4 = (c) (Object) ((pta) this).field_b.e(121);
        }
        return param0;
    }

    final void a(uw param0, byte param1, boolean param2, int param3) {
        int var5 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((pta) this).field_a = stackIn_3_1 != 0;
        if (!param2) {
          param0.a((byte) 83, param3, (fo) this);
          var5 = -45 / ((59 - param1) / 63);
          return;
        } else {
          var5 = -45 / ((59 - param1) / 63);
          return;
        }
    }

    final void a(boolean param0) {
        c var2 = null;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var2 = (c) (Object) ((pta) this).field_b.f(-80);
          L0: while (true) {
            if (var2 != null) {
              System.out.println((Object) (Object) var2);
              var2 = (c) (Object) ((pta) this).field_b.e(116);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_d = null;
          var2 = (c) (Object) ((pta) this).field_b.f(-80);
          L1: while (true) {
            if (var2 != null) {
              System.out.println((Object) (Object) var2);
              var2 = (c) (Object) ((pta) this).field_b.e(116);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        c var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (c) (Object) ((pta) this).field_b.f(-80);
        L0: while (true) {
          if (var3 == null) {
            if (param1 < -19) {
              return;
            } else {
              field_d = null;
              return;
            }
          } else {
            L1: {
              var3.a(-1, param0);
              if (var3.h(18407)) {
                var3.p(76);
                ((pta) this).field_c.b((byte) -88, (vg) (Object) var3);
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (c) (Object) ((pta) this).field_b.e(127);
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        c var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = (c) (Object) ((pta) this).field_b.f(-80);
        L0: while (true) {
          if (var2 == null) {
            if (param0 <= 111) {
              var4 = null;
              ((pta) this).a((uw) null, (byte) -42, false, 21);
              return;
            } else {
              return;
            }
          } else {
            var2.p(88);
            ((pta) this).field_c.b((byte) -60, (vg) (Object) var2);
            var2 = (c) (Object) ((pta) this).field_b.e(112);
            continue L0;
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            ((pta) this).field_e = null;
            return false;
        }
        return false;
    }

    final c a(int param0, int param1, int param2, uw param3, int param4) {
        c var6 = null;
        c var7 = null;
        c var8 = null;
        if (param0 == -2698) {
          L0: {
            if (!((pta) this).field_c.d((byte) 14)) {
              var8 = (c) (Object) ((pta) this).field_c.c(param0 ^ 2800);
              var6 = var8;
              var8.p(param0 + 2821);
              break L0;
            } else {
              var6 = ((pta) this).field_f.d(true);
              break L0;
            }
          }
          var6.a(param4, (byte) -78, param1, param2);
          if (((pta) this).field_a) {
            if (param3 == null) {
              ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
              return var6;
            } else {
              var6.a(param3, param0 + 8163);
              ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
              return var6;
            }
          } else {
            ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
            return var6;
          }
        } else {
          L1: {
            ((pta) this).a((byte) 28);
            if (!((pta) this).field_c.d((byte) 14)) {
              var7 = (c) (Object) ((pta) this).field_c.c(param0 ^ 2800);
              var6 = var7;
              var7.p(param0 + 2821);
              break L1;
            } else {
              var6 = ((pta) this).field_f.d(true);
              break L1;
            }
          }
          var6.a(param4, (byte) -78, param1, param2);
          if (((pta) this).field_a) {
            if (param3 == null) {
              ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
              return var6;
            } else {
              var6.a(param3, param0 + 8163);
              ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
              return var6;
            }
          } else {
            ((pta) this).field_b.b((byte) -109, (vg) (Object) var6);
            return var6;
          }
        }
    }

    public final void a(int param0, iq param1) {
        int var4 = 0;
        c var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var5 = (c) (Object) ((pta) this).field_b.f(-80);
        if (param0 > 103) {
          L0: while (true) {
            if (var5 != null) {
              var5.a(104, param1);
              var5 = (c) (Object) ((pta) this).field_b.e(121);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 - -23) / 53);
        return 0;
    }

    final void a(int param0) {
        int var3 = 0;
        c var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 > 93) {
          var4 = (c) (Object) ((pta) this).field_b.f(-80);
          L0: while (true) {
            if (var4 != null) {
              var4.a(((pta) this).field_e, -63);
              var4 = (c) (Object) ((pta) this).field_b.e(109);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          int discarded$8 = ((pta) this).e((byte) 14);
          var4 = (c) (Object) ((pta) this).field_b.f(-80);
          L1: while (true) {
            if (var4 != null) {
              var4.a(((pta) this).field_e, -63);
              var4 = (c) (Object) ((pta) this).field_b.e(109);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 0) {
          field_g = null;
          return lg.a(false, param0, param1 + 1617);
        } else {
          return lg.a(false, param0, param1 + 1617);
        }
    }

    pta(la param0, c param1, int param2) {
        int var4 = 0;
        ((pta) this).field_b = new vna();
        ((pta) this).field_c = new vna();
        ((pta) this).field_e = param0;
        ((pta) this).field_f = param1;
        var4 = 0;
        L0: while (true) {
          if (param2 > var4) {
            ((pta) this).field_c.b((byte) -81, (vg) (Object) param1.d(true));
            var4++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Name";
        field_d = "Similar rating";
    }
}
