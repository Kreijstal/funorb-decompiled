/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private gk field_b;
    static int field_a;
    static String field_g;
    static long field_c;
    private uk field_d;
    static java.awt.Frame field_h;
    static int field_f;
    private gk field_i;
    private uk field_e;

    final ue a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        ue stackIn_3_0 = null;
        ue stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_b.a(true) ^ -1) == -2) {
              stackIn_3_0 = this.a(param1, 0, param2, (byte) -61);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 25910) {
                  break L1;
                } else {
                  i.a(-63);
                  break L1;
                }
              }
              if (1 == this.field_b.a((byte) 47, param1)) {
                stackIn_9_0 = this.a(0, param1, param2, (byte) -66);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        int var1 = 48 % ((param0 - 59) / 57);
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (!(-12 != (mh.field_U ^ -1))) {
                lj.a((byte) -50);
            }
            dh.a(tk.field_a, ea.field_c, q.field_I, -608757616);
            qi.a(param0, 0, param1, param1 + -25971);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "i.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final ue a(int[] param0, int param1, int param2, int param3) {
        ue discarded$0 = null;
        ue stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        ue stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ue var8 = null;
        te var9 = null;
        int[] var10 = null;
        try {
          L0: {
            var5_int = param1 ^ (param2 >>> 354292780 | 65532 & param2 << -1911228444);
            var5_int = var5_int | param2 << 1484658992;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (ue) ((Object) this.field_e.a(param3 ^ -1911228517, var6));
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0[0] > 0) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (param3 == -1911228444) {
                  break L2;
                } else {
                  var10 = (int[]) null;
                  discarded$0 = this.a((int[]) null, -26, -39, -29);
                  break L2;
                }
              }
              L3: {
                var9 = (te) ((Object) this.field_d.a(50, var6));
                if (var9 == null) {
                  var9 = te.a(this.field_i, param2, param1);
                  if (var9 != null) {
                    this.field_d.a(var6, 120, var9);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.c(2);
                this.field_e.a(var6, param3 + 1911228564, var8);
                stackIn_19_0 = (ue) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (ue) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("i.B(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ue) ((Object) stackIn_6_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    private final ue a(int param0, int param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        long var7 = 0L;
        ue var9 = null;
        ei var10 = null;
        ue var11 = null;
        ue stackIn_2_0 = null;
        ue stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = ((-805302273 & param1) << -1155737596 | param1 >>> -708791060) ^ param0;
            var5_int = var5_int | param1 << -1769112592;
            var6 = -109 % ((param3 - 18) / 61);
            var7 = (long)var5_int;
            var9 = (ue) ((Object) this.field_e.a(45, var7));
            if (var9 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (0 < param2[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var10 = ei.a(this.field_b, param1, param0);
              if (var10 != null) {
                L2: {
                  var11 = var10.b();
                  var9 = var11;
                  this.field_e.a(var7, 115, var9);
                  if (param2 == null) {
                    break L2;
                  } else {
                    param2[0] = param2[0] - var11.field_h.length;
                    break L2;
                  }
                }
                stackIn_13_0 = (ue) (var9);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (ue) (var9);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("i.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_13_0;
        }
    }

    final ue a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        ue stackIn_2_0 = null;
        ue stackIn_5_0 = null;
        ue stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_i.a(true) ^ -1) != -2) {
              if (param1 == 0) {
                if (this.field_i.a((byte) 47, param2) != 1) {
                  throw new RuntimeException();
                } else {
                  stackIn_8_0 = this.a(param0, 0, param2, -1911228444);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (ue) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(param0, param2, 0, -1911228444);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("i.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    i(gk param0, gk param1) {
        this.field_d = new uk(256);
        this.field_e = new uk(256);
        try {
            this.field_b = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "i.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Quit to website";
        field_f = -1;
    }
}
