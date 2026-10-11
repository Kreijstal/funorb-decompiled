/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_d;
    static le field_c;
    static byte[] field_a;
    java.awt.Frame field_b;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        int var6Lifetime4;
        int var7Lifetime8;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime4Lifetime1;
        int var7Lifetime9;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (0 > mc.field_k) {
          return;
        }
        var3 = -135 + param0;
        var4 = -35 + param2;
        var5 = 256;
        if (mc.field_k < 75) {
          var5 = (mc.field_k << 8) / 75;
        }
        if (mc.field_k > 200) {
          var5 = (250 - mc.field_k << 8) / 50;
        }
        de.a(be.field_d, param1 ^ 144);
        k.b();
        lf.a();
        rg.b(0);
        if (var5 < 256) {
          lf.c(0, 0, lf.field_f, lf.field_a, 0, -var5 + 256);
          pd.a(param1 ^ -22835);
          if (param1 <= mc.field_k) {
            nc.field_n.b(var3 + 15, var4 + 10, var5);
          } else {
            be.field_d.f(var3, var4);
          }
          var6 = mc.field_k - 125;
          if (var6 > 0) {
            if (var6 >= 50) {
              var6 = mc.field_k - 140;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                jg.field_m.b(var3 + 15, var4 + 10, var5 * var7 >> 8);
              }
              return;
            }
            if (var6 >= 20) {
              if (30 > var6) {
                t.field_a.d(var3, var4, 256);
              } else {
                var7Lifetime9 = 256 * (50 - var6) / 20;
                t.field_a.d(var3, var4, var7Lifetime9);
              }
            } else {
              var7Lifetime9 = var6 * 256 / 20;
              t.field_a.d(var3, var4, var7Lifetime9);
            }
          }
          var6Lifetime4 = mc.field_k - 140;
          if (var6Lifetime4 > 0) {
            var7Lifetime8 = 256;
            if (var6Lifetime4 < 20) {
              var7Lifetime8 = 256 * var6Lifetime4 / 20;
            }
            jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime8 >> 8);
          }
          return;
        }
        pd.a(param1 ^ -22835);
        if (param1 > mc.field_k) {
          be.field_d.f(var3, var4);
          var6Lifetime1 = mc.field_k - 125;
          if (var6Lifetime1 > 0 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 >= 20) {
              if (30 > var6Lifetime1) {
                t.field_a.d(var3, var4, 256);
              } else {
                var7Lifetime1 = 256 * (50 - var6Lifetime1) / 20;
                t.field_a.d(var3, var4, var7Lifetime1);
              }
            } else {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              t.field_a.d(var3, var4, var7Lifetime1);
            }
          }
          var6Lifetime1Lifetime1 = mc.field_k - 140;
          if (var6Lifetime1Lifetime1 > 0) {
            var7Lifetime1Lifetime1 = 256;
            if (var6Lifetime1Lifetime1 < 20) {
              var7Lifetime1Lifetime1 = 256 * var6Lifetime1Lifetime1 / 20;
            }
            jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime1Lifetime1 >> 8);
          }
          return;
        }
        nc.field_n.b(var3 + 15, var4 + 10, var5);
        var6Lifetime2 = mc.field_k - 125;
        if (var6Lifetime2 <= 0) {
          var6Lifetime2 = mc.field_k - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime2 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime2 = 256 * var6Lifetime2 / 20;
            }
            jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime2 >> 8);
          }
          return;
        }
        if (var6Lifetime2 >= 50) {
          var6Lifetime2 = mc.field_k - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime3 = 256 * var6Lifetime2 / 20;
            }
            jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime3 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 20) {
          var7Lifetime4 = var6Lifetime2 * 256 / 20;
          t.field_a.d(var3, var4, var7Lifetime4);
          var6Lifetime2 = mc.field_k - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime4Lifetime1 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime4Lifetime1 = 256 * var6Lifetime2 / 20;
            }
            jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime4Lifetime1 >> 8);
          }
          return;
        }
        if (30 > var6Lifetime2) {
          t.field_a.d(var3, var4, 256);
          var6Lifetime2 = mc.field_k - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime5 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime5 = 256 * var6Lifetime2 / 20;
            }
            jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime5 >> 8);
          }
          return;
        }
        var7Lifetime6 = 256 * (50 - var6Lifetime2) / 20;
        t.field_a.d(var3, var4, var7Lifetime6);
        var6Lifetime3 = mc.field_k - 140;
        if (var6Lifetime3 > 0) {
          var7Lifetime7 = 256;
          if (var6Lifetime3 < 20) {
            var7Lifetime7 = 256 * var6Lifetime3 / 20;
          }
          jg.field_m.b(var3 + 15, var4 + 10, var5 * var7Lifetime7 >> 8);
        }
        return;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 20) {
          ra.a(0);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final void a(boolean param0, ab param1) {
        try {
          ca.a(param1, 15232, this.field_b);
          if (param0) {
            this.field_b = (java.awt.Frame) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ra.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        p.field_d[pf.field_o] = param4;
        ff.field_a[pf.field_o] = pf.field_o;
        we.field_g[pf.field_o] = param2;
        if (rb.field_a >= param2) {
          if (param2 < r.field_D) {
            ve.field_d = param2;
          }
          l.field_D[pf.field_o] = param5;
          oc.field_a[pf.field_o] = param0;
          hl.field_N[pf.field_o] = param3;
          var6 = param3 + (param0 + param5);
          if (param1 == var6) {
            stackIn_23_0 = 0;
          } else {
            stackIn_23_0 = 1000 * param5 / var6;
          }
          var7 = stackIn_23_0;
          oj.field_j[pf.field_o] = var7;
          if (ve.field_d > var7) {
            ve.field_d = var7;
          }
          if (var7 > l.field_G) {
            l.field_G = var7;
          }
          pf.field_o = pf.field_o + 1;
          return;
        }
        l.field_G = param2;
        if (param2 < r.field_D) {
          ve.field_d = param2;
        }
        l.field_D[pf.field_o] = param5;
        oc.field_a[pf.field_o] = param0;
        hl.field_N[pf.field_o] = param3;
        var6Lifetime1 = param3 + (param0 + param5);
        if (param1 == var6Lifetime1) {
          stackIn_7_0 = 0;
        } else {
          stackIn_7_0 = 1000 * param5 / var6Lifetime1;
        }
        var7Lifetime1 = stackIn_7_0;
        oj.field_j[pf.field_o] = var7Lifetime1;
        if (ve.field_d > var7Lifetime1) {
          ve.field_d = var7Lifetime1;
        }
        if (var7Lifetime1 > l.field_G) {
          l.field_G = var7Lifetime1;
        }
        pf.field_o = pf.field_o + 1;
    }

    final static boolean a(int param0) {
        if (param0 != -17977) {
          field_c = (le) null;
          return sc.field_e;
        }
        return sc.field_e;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_d = true;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ra.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ra() {
    }

    static {
        field_a = new byte[520];
    }
}
