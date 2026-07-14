/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lua implements ntb, ofa {
    private qob[] field_b;
    static int field_d;
    private int field_a;
    static int field_c;

    final qob a(byte param0, int param1) {
        qob var3 = ((lua) this).field_b[param1];
        int var4 = -90 / ((param0 - 0) / 38);
        ((lua) this).field_b = (qob[]) (Object) dt.a(rma.field_c, param1, 15667, (Object[]) (Object) ((lua) this).field_b);
        this.a(125);
        return var3;
    }

    public final void a(tv param0, int param1) {
        lua var3 = null;
        int var4 = 0;
        Object var5 = null;
        var3 = (lua) (Object) param0;
        if (param1 >= -19) {
          L0: {
            var5 = null;
            ((lua) this).b((byte) 8, (tv) null);
            boolean discarded$2 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) ((lua) this).field_b, false, 5547);
            var4 = 0;
            if (dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) ((lua) this).field_b, 124)) {
              var4 = 1;
              System.out.println("Nebula[] nebulae has changed. ");
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of NebulaContainer has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            boolean discarded$3 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) ((lua) this).field_b, false, 5547);
            var4 = 0;
            if (dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) ((lua) this).field_b, 124)) {
              var4 = 1;
              System.out.println("Nebula[] nebulae has changed. ");
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of NebulaContainer has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    private final void a(int param0) {
        sja.field_g = sja.field_g + 1;
        ((lua) this).field_a = sja.field_g;
        if (param0 <= 118) {
            qsa discarded$0 = lua.a((byte) 80);
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        qob[] var4 = null;
        int var5 = 0;
        qob[] var6 = null;
        int var7 = 0;
        qob var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var3 = param0;
          var4 = ((lua) this).field_b;
          if (var4 != null) {
            stackOut_2_0 = var4.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var3.a(-632, var5, 12);
        if (var5 != 0) {
          var6 = var4;
          var7 = 0;
          L1: while (true) {
            if (var6.length <= var7) {
              if (param1 > -109) {
                ((lua) this).field_b = null;
                return;
              } else {
                return;
              }
            } else {
              L2: {
                var8 = var6[var7];
                stackOut_10_0 = (faa) var3;
                stackOut_10_1 = -68;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (var8 == null) {
                  stackOut_12_0 = (faa) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L2;
                } else {
                  stackOut_11_0 = (faa) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L2;
                }
              }
              if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 == 0)) {
                var7++;
                var7++;
                var7++;
                continue L1;
              } else {
                stb.a(2, 1, var3, (tv) (Object) var8);
                var7++;
                var7++;
                continue L1;
              }
            }
          }
        } else {
          if (param1 <= -109) {
            return;
          } else {
            ((lua) this).field_b = null;
            return;
          }
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 75 % ((param0 - 22) / 59);
        lua var3 = (lua) (Object) param1;
        return dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) var3.field_b, -78);
    }

    public final void b(byte param0, tv param1) {
        lua var3 = null;
        if (param0 >= 54) {
          var3 = (lua) (Object) param1;
          if (var3.field_a == var3.field_a) {
            return;
          } else {
            var3.field_a = var3.field_a;
            var3.field_b = (qob[]) (Object) sqb.a((tv[]) (Object) var3.field_b, (tv[]) (Object) var3.field_b, 1, rma.field_c, false);
            return;
          }
        } else {
          return;
        }
    }

    final int a(qob param0, int param1) {
        if (null == ((lua) this).field_b) {
          ((lua) this).field_b = (qob[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((lua) this).field_b, 0, rma.field_c);
          this.a(124);
          if (param1 <= 73) {
            this.a(60);
            return -1 + ((lua) this).field_b.length;
          } else {
            return -1 + ((lua) this).field_b.length;
          }
        } else {
          if (-4096 < (((lua) this).field_b.length ^ -1)) {
            ((lua) this).field_b = (qob[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((lua) this).field_b, 0, rma.field_c);
            this.a(124);
            if (param1 > 73) {
              return -1 + ((lua) this).field_b.length;
            } else {
              this.a(60);
              return -1 + ((lua) this).field_b.length;
            }
          } else {
            return -1;
          }
        }
    }

    final qob[] a(boolean param0) {
        if (param0) {
            ((lua) this).field_a = -112;
            return ((lua) this).field_b;
        }
        return ((lua) this).field_b;
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          qsa discarded$2 = lua.a((byte) 76);
          ((lua) this).field_b = (qob[]) (Object) kcb.a(12, rma.field_c, param0, 1, -65, (tv[]) (Object) ((lua) this).field_b);
          return;
        } else {
          ((lua) this).field_b = (qob[]) (Object) kcb.a(12, rma.field_c, param0, 1, -65, (tv[]) (Object) ((lua) this).field_b);
          return;
        }
    }

    final static qsa a(byte param0) {
        int var1 = 0;
        if (bjb.field_p.length <= hcb.field_p) {
          nkb.a(false, "We've run out of temp objective slots");
          return null;
        } else {
          L0: {
            if (bjb.field_p[hcb.field_p] == null) {
              bjb.field_p[hcb.field_p] = new qsa();
              break L0;
            } else {
              break L0;
            }
          }
          var1 = 28 / ((15 - param0) / 47);
          hcb.field_p = hcb.field_p + 1;
          return bjb.field_p[hcb.field_p];
        }
    }

    lua() {
        ((lua) this).field_a = 0;
        this.a(123);
        ((lua) this).field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1024;
        field_c = 0;
    }
}
