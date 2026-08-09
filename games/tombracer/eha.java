/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eha {
    private vna field_a;
    private vna field_b;

    final void a(bs param0, hca param1, boolean param2) {
        try {
            this.field_b.b((byte) -96, new dda(param1, param0));
            if (!param2) {
                la var5 = (la) null;
                this.a(-124, (la) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "eha.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, pc param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              var7_int = -(param0 / param6) + param5;
              var8 = -(param3 / 2) + param2;
              if (ab.a(var8, param4.field_d, var8 + param3, param4.field_k, param0 + var7_int, var7_int, 112)) {
                var9 = 0;
                break L1;
              } else {
                var9 = hm.a(param4.field_a, (byte) -15, var7_int, var7_int - -param0, var8 - -param3, param1, param4.field_e, param4.field_k, param4.field_d, var8);
                if (var9 < -1) {
                  System.out.println("Uh oh, collide.lineseg_box returned " + var9);
                  System.out.println("collide.lineseg_box(" + param4.field_d + ", " + param4.field_k + ", " + param4.field_e + ", " + param4.field_a + ", " + var7_int + ", " + var8 + ", " + (param0 + var7_int) + ", " + (var8 - -param3) + ", " + param1 + ")");
                  var9 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackIn_6_0 = var9;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7);

            stackIn_9_1 = new StringBuilder().append("eha.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0;
    }

    abstract void a(int param0, int param1, hca param2, fsa param3);

    abstract void a(fsa param0, int param1);

    final void a(dt param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 52) {
                break L1;
              } else {
                this.field_a = (vna) null;
                break L1;
              }
            }
            if (param0.h(126)) {
              this.a((byte) -27, param0);
              param0.a(-1, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("eha.L(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        rfa.field_B = bha.field_B + " <b>" + vc.field_s + "</b> " + cq.field_c + " <b>" + mha.field_F + "</b> " + kka.field_p + "<br>" + "<br>" + wg.field_k;
        if (param0 != -27) {
            pc var2 = (pc) null;
            eha.a(-114, -20, 86, 69, (pc) null, -36, 11);
        }
    }

    abstract void a(int param0, la param1);

    abstract void a(int param0, hca param1, la param2);

    final void a(dt param0, pi param1, boolean param2) {
        int var5 = 0;
        fsa var6 = null;
        pi var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var6 = (fsa) null;
                this.a(-16, -102, (hca) null, (fsa) null);
                break L1;
              }
            }
            if (!param1.a(param0.field_g.r(-108), 3)) {
              var7 = (pi) ((Object) this.field_a.f(-80));
              L2: while (true) {
                if (var7 == null) {
                  this.field_a.b((byte) -82, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var7.a(param1, 0)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var7 = (pi) ((Object) this.field_a.e(107));
                    continue L2;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("eha.I(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void b(int param0) {
        if (param0 > -111) {
            return;
        }
        this.field_b.d(8);
    }

    abstract void a(int param0, hca param1, int param2, la param3, int param4, int param5);

    final dda a(int param0) {
        if (param0 < 99) {
            return (dda) null;
        }
        return (dda) ((Object) this.field_b.c(23));
    }

    abstract void a(hca param0, la param1, boolean param2);

    protected eha() {
        this.field_b = new vna();
        this.field_a = new vna();
    }

    private final void a(byte param0, dt param1) {
        int var3_int = 0;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        fsa var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.field_c;
              var4 = param1.field_g.r(-102);
              if (param0 == -27) {
                break L1;
              } else {
                var7 = (fsa) null;
                this.a(84, 86, (hca) null, (fsa) null);
                break L1;
              }
            }
            var5 = (pi) ((Object) this.field_a.f(param0 + -53));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L3: {
                  if (!var5.a(var3_int, -1, var4)) {
                    if (var5.c(var3_int, 113)) {
                      var5.a(param1, var5.b(var3_int, -87), param0 + 27);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var5.a(param1, -102);
                    var5.p(40);
                    break L3;
                  }
                }
                var5 = (pi) ((Object) this.field_a.e(122));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("eha.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
    }
}
