/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lua implements ntb, ofa {
    private qob[] field_b;
    static int field_d;
    private int field_a;
    static int field_c;

    final qob a(byte param0, int param1) {
        qob var3 = this.field_b[param1];
        int var4 = -90 / ((param0 - 0) / 38);
        this.field_b = (qob[]) ((Object) dt.a(rma.field_c, param1, 15667, this.field_b));
        this.a(125);
        return var3;
    }

    public final void a(tv param0, int param1) {
        lua var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tv var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = (lua) ((Object) param0);
              if (param1 < -19) {
                break L1;
              } else {
                var5 = (tv) null;
                this.b((byte) 8, (tv) null);
                break L1;
              }
            }
            L2: {
              tja.a(var3.field_b, 1, this.field_b, false, 5547);
              var4 = 0;
              if (dn.a(var3.field_b, false, 1, this.field_b, 124)) {
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("lua.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = sja.field_g;
        sja.field_g = sja.field_g + 1;
        this.field_a = fieldTemp$0;
        if (param0 <= 118) {
            lua.a((byte) 80);
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
        int stackIn_4_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3 = param0;
              var4 = this.field_b;
              if (var4 != null) {
                stackIn_4_0 = var4.length;
                break L1;
              } else {
                stackIn_4_0 = 0;
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
                      stackIn_10_0 = (faa) (var3);

                      stackIn_10_1 = -68;

                      if (var8 == null) {
                        stackIn_11_0 = (faa) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 0;
                        break L4;
                      } else {
                        stackIn_11_0 = (faa) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      if (!vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                        break L5;
                      } else {
                        stb.a(2, 1, var3, var8);
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
              this.field_b = (qob[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("lua.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        lua var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = 75 % ((param0 - 22) / 59);
            var3 = (lua) ((Object) param1);
            stackIn_1_0 = dn.a(var3.field_b, false, 1, this.field_b, -78);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("lua.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            return;
        }
        lua var3 = (lua) ((Object) param1);
        if (var3.field_a == this.field_a) {
            return;
        }
        try {
            var3.field_a = this.field_a;
            var3.field_b = (qob[]) ((Object) sqb.a(var3.field_b, this.field_b, 1, rma.field_c, false));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lua.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(qob param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_b) {
                break L1;
              } else {
                if (-4096 >= (this.field_b.length ^ -1)) {
                  stackIn_4_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              this.field_b = (qob[]) ((Object) ija.a(param0, this.field_b, 0, rma.field_c));
              this.a(124);
              if (param1 > 73) {
                break L2;
              } else {
                this.a(60);
                break L2;
              }
            }
            stackIn_8_0 = -1 + this.field_b.length;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("lua.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    final qob[] a(boolean param0) {
        if (param0) {
            this.field_a = -112;
            return this.field_b;
        }
        return this.field_b;
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                lua.a((byte) 76);
            }
            this.field_b = (qob[]) ((Object) kcb.a(12, rma.field_c, param0, 1, -65, this.field_b));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lua.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static qsa a(byte param0) {
        qsa[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var1;
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
          fieldTemp$2 = bjb.field_p;
          fieldTemp$3 = hcb.field_p;
          hcb.field_p = hcb.field_p + 1;
          return fieldTemp$2[fieldTemp$3];
        }
    }

    lua() {
        this.field_a = 0;
        this.a(123);
        this.field_b = null;
    }

    static {
        field_d = 1024;
        field_c = 0;
    }
}
