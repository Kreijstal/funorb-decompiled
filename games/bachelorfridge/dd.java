/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends vd implements lja {
    private String[] field_F;
    static String field_G;
    private uja field_D;
    private hf[] field_E;
    static boolean field_H;

    dd(uja param0) {
        super(0, 0, 0, 0, (qda) null);
        try {
            this.field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_F.length <= var6_int) {
                L2: {
                  if (param1 != this.field_E[this.field_F.length]) {
                    break L2;
                  } else {
                    this.field_D.a(14322);
                    break L2;
                  }
                }
                if (param3 > 50) {
                  break L0;
                } else {
                  this.a((byte) -38, -88, -30, 94);
                  return;
                }
              } else {
                L3: {
                  if (this.field_E[var6_int] == param1) {
                    this.field_D.a(this.field_F[var6_int], (byte) -114);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        rt.a("", (String) null, 9);
        if (param0 >= -10) {
            field_H = true;
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        pka var4 = null;
        int var5 = 0;
        int var6 = 0;
        wj var7 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              this.field_A.d(67);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != 0) {
                  var3_int = param0.length;
                  this.field_F = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new pka(jca.field_a, 0, 1);
                      this.field_E = new hf[1 + var3_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var3_int <= var5) {
                          L4: {
                            this.field_E[var3_int] = new hf(mt.field_t, (pl) (this));
                            this.field_E[var3_int].field_f = (qda) ((Object) var4);
                            this.field_E[var3_int].a(0, 15, (byte) 59, 100, 20 + var3_int * 16 + 16);
                            if (param1 < -19) {
                              break L4;
                            } else {
                              var7 = (wj) null;
                              this.a(28, 90, '￺', (wj) null);
                              break L4;
                            }
                          }
                          this.c(this.field_E[var3_int], 112);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_E[var5] = new hf(this.field_F[var5], (pl) (this));
                          this.field_E[var5].field_f = (qda) ((Object) var4);
                          this.field_E[var5].field_h = a.field_p;
                          this.field_E[var5].a(0, 15, (byte) 59, 80, 16 * var5 + 20);
                          this.c(this.field_E[var5], -125);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_F[var4_int] = lu.a((CharSequence) ((Object) param0[var4_int]), 7995).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_F = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("dd.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 0) {
            field_H = true;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        po var5;
        int var6;
        super.a((byte) 108, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var6 = -102 / ((-20 - param0) / 54);
          var5 = jca.field_a;
          if (this.field_F != null) {
            var5.a(oja.field_b, this.field_s + param3, this.field_v + param1, this.field_p, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_B);
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0 ^ 0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != 98) {
                L1: {
                  if (param0 == 10) {
                    break L1;
                  } else {
                    this.a((byte) 70, -46, 111, 92);
                    break L1;
                  }
                }
                if ((param1 ^ -1) != -100) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.b(param3, 1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(-124, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("dd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    static {
        field_H = false;
    }
}
