/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh {
    static String field_b;
    int field_f;
    java.awt.Image field_a;
    int[] field_d;
    static boolean field_c;
    int field_e;

    final void a(int param0) {
        if (param0 != -40) {
          ((fh) this).field_e = -67;
          ul.a(((fh) this).field_d, ((fh) this).field_e, ((fh) this).field_f);
          return;
        } else {
          ul.a(((fh) this).field_d, ((fh) this).field_e, ((fh) this).field_f);
          return;
        }
    }

    final static gj a(int param0, int param1, int param2, int param3, byte param4) {
        gj var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var5 = (gj) (Object) cb.field_b.b((byte) -106);
        L0: while (true) {
          if (var5 != null) {
            if (var5.field_o == param2) {
              return var5;
            } else {
              var5 = (gj) (Object) cb.field_b.d(853);
              continue L0;
            }
          } else {
            var5 = new gj();
            var5.field_o = param2;
            var6 = 102;
            var5.field_m = param3;
            var5.field_n = param0;
            cb.field_b.a(-92, (ca) (Object) var5);
            se.a(var5, param1, -38);
            return var5;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 17489) {
                  Object discarded$1 = gm.a(true, "resizing", new Object[1], uj.b((byte) -120));
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, boolean param3);

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
            field_c = true;
        }
    }

    final static void a(ki param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int[] var6 = null;
        int var7 = 0;
        se var8 = null;
        int var9 = 0;
        se var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new se(param0.a("", 1, "logo.fo3d"));
              var10 = var8;
              var3 = var10.b((byte) 90);
              var10.n(9471);
              cg.field_c = mc.a(12, var10);
              if (param1 == -237) {
                break L1;
              } else {
                fh.a((byte) -39);
                break L1;
              }
            }
            tc.field_a = new wd[var3];
            ne.field_a = new int[var3][];
            var4 = 0;
            L2: while (true) {
              if (var3 <= var4) {
                var10.m(param1 ^ -236);
                var9 = 0;
                var4 = var9;
                L3: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = tc.field_a[var9];
                    var5.a(3940, 6, 6, 6, 1);
                    var5.a(2);
                    var6 = new int[]{var5.field_d + var5.field_P >> 1, var5.field_J + var5.field_F >> 1, var5.field_v - -var5.field_z >> 1};
                    ne.field_a[var9] = var6;
                    var5.a((byte) 7, -var6[1], -var6[2], -var6[0]);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                tc.field_a[var4] = f.a(var8, 16);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("fh.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          bl.field_n.c(param3, param1);
          if (param0 == 8) {
            break L0;
          } else {
            var5 = null;
            fh.a((ki) null, 88);
            break L0;
          }
        }
        if (param2) {
          L1: {
            var4 = 2 * (le.field_c % bl.field_n.field_o);
            if (bl.field_n.field_o > var4) {
              break L1;
            } else {
              var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
              break L1;
            }
          }
          if (10 <= var4) {
            if (-40 + bl.field_n.field_o >= var4) {
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              return;
            } else {
              var4 = -40 + bl.field_n.field_o;
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              return;
            }
          } else {
            var4 = 10;
            hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
            return;
          }
        } else {
          return;
        }
    }

    final static hj[] a(ki param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object stackIn_4_0 = null;
        hj[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -74) {
                break L1;
              } else {
                var5 = null;
                hj[] discarded$2 = fh.a((ki) null, -76, (byte) -18, -119);
                break L1;
              }
            }
            if (pk.a(-128, param3, param0, param1)) {
              stackOut_5_0 = lm.a(-127);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (hj[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("fh.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_c = true;
    }
}
