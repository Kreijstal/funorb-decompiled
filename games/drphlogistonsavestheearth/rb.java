/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static he[] field_c;
    private boolean field_b;
    static int[] field_e;
    private int field_a;
    private int field_f;
    private int[] field_d;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
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
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = vj.a(param0, -115);
              if (param1.indexOf(param0) != param2) {
                break L1;
              } else {
                if (-1 != param1.indexOf(var3)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param1.startsWith(param0)) {
                        break L3;
                      } else {
                        if (param1.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param1.endsWith(param0)) {
                            break L3;
                          } else {
                            if (!param1.endsWith(var3)) {
                              stackIn_12_0 = 0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackIn_12_0 = 1;
                    break L2;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("rb.J(");

            if (param0 == null) {
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
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void d(int param0, int param1) {
        if (param0 < -11) {
          if (-1 >= (param1 ^ -1)) {
            if (param1 > this.field_a) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L0: {
                if (param1 != this.field_a) {
                  kg.a(this.field_d, 1 + param1, this.field_d, param1, -param1 + this.field_a);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          this.d(-66, 80);
          if (-1 >= (param1 ^ -1)) {
            if (param1 > this.field_a) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param1 != this.field_a) {
                  kg.a(this.field_d, 1 + param1, this.field_d, param1, -param1 + this.field_a);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 105) {
                break L1;
              } else {
                field_e = (int[]) null;
                break L1;
              }
            }
            lc.field_h = wg.field_u;
            if (param0 != 255) {
              if (100 > param0) {
                kf.field_a = kj.a(param0, 4, param2);
                return;
              } else {
                if (param0 <= 105) {
                  var4 = param1;
                  pi.a(true, var4);
                  kf.field_a = sa.a((byte) 3, param1);
                  break L0;
                } else {
                  kf.field_a = kj.a(param0, 4, param2);
                  return;
                }
              }
            } else {
              L2: {
                if (13 <= rd.field_z) {
                  stackIn_7_0 = 0;
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L2;
                }
              }
              kf.field_a = b.a(stackIn_7_0 != 0, 93);
              var6 = (String[]) null;
              pi.a(true, (String[]) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("rb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        pi.field_Q = -1;
        em.field_c = false;
        dd.field_l = 0;
        ie.field_C = null;
        if (param0 != -102) {
            return;
        }
        oh.field_e = -1;
    }

    final void c(int param0, int param1) {
        int var3 = 69 % ((param1 - 69) / 56);
        this.a(21125, this.field_a + 1, param0);
    }

    private final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
          return 83;
        } else {
          var3 = this.field_d.length;
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (this.field_b) {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * this.field_f;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              } else {
                var3 = var3 + this.field_f;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 0) {
            field_c = (he[]) null;
        }
    }

    private final void a(int param0, int param1) {
        int[] var3;
        int[] var4;
        var4 = new int[this.a(param0, true)];
        var3 = var4;
        if (param1 != -1) {
          return;
        } else {
          kg.a(this.field_d, 0, var4, 0, this.field_d.length);
          this.field_d = var4;
          return;
        }
    }

    final int b(int param0, int param1) {
        if (this.field_a >= param1) {
          if (param0 > -30) {
            this.d(-4, -55);
            return this.field_d[param1];
          } else {
            return this.field_d[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.a(true);
            return this.field_a + 1;
        }
        return this.field_a + 1;
    }

    private rb() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        String var5;
        if (this.field_a >= param1) {
          L0: {
            if (param1 >= this.field_d.length) {
              this.a(param1, -1);
              break L0;
            } else {
              break L0;
            }
          }
          this.field_d[param1] = param2;
          if (param0 != 21125) {
            var5 = (String) null;
            rb.a((String) null, (String) null, -54);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            this.field_a = param1;
            if (param1 >= this.field_d.length) {
              this.a(param1, -1);
              break L1;
            } else {
              break L1;
            }
          }
          this.field_d[param1] = param2;
          if (param0 == 21125) {
            return;
          } else {
            var5 = (String) null;
            rb.a((String) null, (String) null, -54);
            return;
          }
        }
    }

    static {
        field_e = new int[4];
    }
}
