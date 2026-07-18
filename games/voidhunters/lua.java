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
        int var4 = -90 / (param0 / 38);
        ((lua) this).field_b = (qob[]) (Object) dt.a(rma.field_c, param1, 15667, (Object[]) (Object) ((lua) this).field_b);
        this.a(125);
        return var3;
    }

    public final void a(tv param0, int param1) {
        lua var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3 = (lua) (Object) param0;
              if (param1 < -19) {
                break L1;
              } else {
                var5 = null;
                ((lua) this).b((byte) 8, (tv) null);
                break L1;
              }
            }
            L2: {
              boolean discarded$2 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) ((lua) this).field_b, false, 5547);
              var4 = 0;
              if (dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) ((lua) this).field_b, 124)) {
                var4 = 1;
                System.out.println("Nebula[] nebulae has changed. ");
                break L2;
              } else {
                break L2;
              }
            }
            if (var4 != 0) {
              System.out.println("This instance of NebulaContainer has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("lua.F(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = sja.field_g;
        sja.field_g = sja.field_g + 1;
        ((lua) this).field_a = fieldTemp$0;
        if (param0 <= 118) {
            qsa discarded$1 = lua.a((byte) 80);
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        RuntimeException var3_ref = null;
        qob[] var4 = null;
        int var5 = 0;
        qob[] var6 = null;
        int var7 = 0;
        qob var8 = null;
        int var9 = 0;
        int stackIn_4_0 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3 = param0;
              var4 = ((lua) this).field_b;
              if (var4 != null) {
                stackOut_3_0 = var4.length;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_4_0;
              var3.a(-632, var5, 12);
              if (var5 != 0) {
                var6 = var4;
                var7 = 0;
                L3: while (true) {
                  if (var6.length <= var7) {
                    break L2;
                  } else {
                    L4: {
                      var8 = var6[var7];
                      stackOut_8_0 = (faa) var3;
                      stackOut_8_1 = -68;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var8 == null) {
                        stackOut_10_0 = (faa) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L4;
                      } else {
                        stackOut_9_0 = (faa) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L4;
                      }
                    }
                    L5: {
                      if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 == 0)) {
                        var7++;
                        var7++;
                        break L5;
                      } else {
                        stb.a(2, 1, var3, (tv) (Object) var8);
                        var7++;
                        break L5;
                      }
                    }
                    var7++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            if (param1 <= -109) {
              break L0;
            } else {
              ((lua) this).field_b = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3_ref;
            stackOut_21_1 = new StringBuilder().append("lua.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        lua var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = 75 % ((param0 - 22) / 59);
            var3 = (lua) (Object) param1;
            stackOut_0_0 = dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) var3.field_b, -78);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("lua.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            return;
        }
        lua var3 = (lua) (Object) param1;
        if (var3.field_a == var3.field_a) {
            return;
        }
        try {
            var3.field_a = var3.field_a;
            int discarded$0 = 0;
            var3.field_b = (qob[]) (Object) sqb.a((tv[]) (Object) var3.field_b, (tv[]) (Object) var3.field_b, 1, rma.field_c);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "lua.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(qob param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((lua) this).field_b) {
                break L1;
              } else {
                if (((lua) this).field_b.length >= 4095) {
                  stackOut_3_0 = -1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ((lua) this).field_b = (qob[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((lua) this).field_b, 0, rma.field_c);
              this.a(124);
              if (param1 > 73) {
                break L2;
              } else {
                this.a(60);
                break L2;
              }
            }
            stackOut_7_0 = -1 + ((lua) this).field_b.length;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("lua.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final qob[] a(boolean param0) {
        if (param0) {
            ((lua) this).field_a = -112;
            return ((lua) this).field_b;
        }
        return ((lua) this).field_b;
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                qsa discarded$0 = lua.a((byte) 76);
            }
            ((lua) this).field_b = (qob[]) (Object) kcb.a(12, rma.field_c, param0, 1, -65, (tv[]) (Object) ((lua) this).field_b);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "lua.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          qsa[] fieldTemp$4 = bjb.field_p;
          int fieldTemp$5 = hcb.field_p;
          hcb.field_p = hcb.field_p + 1;
          return fieldTemp$4[fieldTemp$5];
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
