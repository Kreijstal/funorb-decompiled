/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    cm field_g;
    private int field_k;
    int field_j;
    int[] field_a;
    static String field_e;
    int field_c;
    static String[] field_i;
    int[] field_b;
    int[] field_d;
    static jl field_h;
    static int[] field_l;
    static je field_f;

    public static void b(int param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        field_i = null;
        field_h = null;
        if (param0 != 0) {
            field_f = (je) null;
        }
    }

    hm(vh param0, boolean param1) {
        this();
        int discarded$0 = 0;
        try {
            discarded$0 = this.a(param0, -2, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(mo param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                hm.a(-8, 127, -35, 78, 58, -62, -122);
                break L1;
              }
            }
            L2: {
              var2_int = ni.field_d;
              if (param0.field_b != 2) {
                if ((param0.field_b ^ -1) == -5) {
                  var2_int = fm.field_d[param0.field_b];
                  break L2;
                } else {
                  if ((oh.field_H ^ -1L) == (param0.field_n ^ -1L)) {
                    var2_int = ag.field_A[param0.field_b];
                    break L2;
                  } else {
                    var2_int = fm.field_d[param0.field_b];
                    break L2;
                  }
                }
              } else {
                if (!param0.field_f) {
                  L3: {
                    if (0 != param0.field_a) {
                      break L3;
                    } else {
                      if (param0.field_e != 0) {
                        break L3;
                      } else {
                        var2_int = ag.field_A[param0.field_b];
                        break L2;
                      }
                    }
                  }
                  var2_int = fm.field_d[param0.field_b];
                  break L2;
                } else {
                  var2_int = ni.field_d;
                  break L2;
                }
              }
            }
            stackIn_16_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("hm.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final int a(byte param0) {
        if (param0 <= 44) {
            this.a((byte) 121);
        }
        return -this.field_k + this.field_c;
    }

    final boolean a(int param0, byte param1) {
        if (!(this.a((byte) 57) >= param0)) {
            return false;
        }
        this.field_k = this.field_k + param0;
        if (param1 != 103) {
            field_l = (int[]) null;
            return true;
        }
        return true;
    }

    final int a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = at.field_c.length;
        int var3 = this.field_j + this.field_c;
        for (var4 = param0; var4 < var2; var4++) {
            var5 = at.field_c[var4];
            var3 = var3 - var5;
            if (!(0 <= var3)) {
                return var4;
            }
        }
        return var2;
    }

    private final int a(vh param0, int param1, boolean param2) {
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param0.k(param1 + 2);
            if (9 >= var4_int) {
              L1: {
                if ((var4_int ^ -1) <= param1) {
                  L2: {
                    L3: {
                      if (-6 < (var4_int ^ -1)) {
                        break L3;
                      } else {
                        if (!param2) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6 = 0;
                    L4: while (true) {
                      if (this.field_a.length <= var6) {
                        break L2;
                      } else {
                        this.field_a[var6] = param0.k(0);
                        var6++;
                        continue L4;
                      }
                    }
                  }
                  var6 = 0;
                  L5: while (true) {
                    if (this.field_d.length <= var6) {
                      this.field_c = param0.i(1);
                      var6 = 0;
                      L6: while (true) {
                        if (7 <= var6) {
                          break L1;
                        } else {
                          this.field_b[var6] = param0.e((byte) -104);
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      L7: {
                        this.field_d[var6] = param0.e((byte) -104);
                        if ((this.field_d[var6] ^ -1) <= -136) {
                          this.field_d[var6] = -1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L8: {
                var5 = -1;
                if (6 <= var4_int) {
                  this.field_k = param0.i(1);
                  this.field_j = param0.i(1);
                  this.field_g.a(var4_int, param0, -115);
                  break L8;
                } else {
                  var5 = param0.k(0);
                  this.field_k = 0;
                  this.field_j = 0;
                  var6 = 0;
                  L9: while (true) {
                    if (var6 >= var5) {
                      break L8;
                    } else {
                      var7 = at.field_c[var6];
                      this.field_j = this.field_j + var7;
                      var6++;
                      continue L9;
                    }
                  }
                }
              }
              stackIn_26_0 = var4_int;
              break L0;
            } else {
              throw new RuntimeException("Unrecognized version: " + var4_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4);

            stackIn_29_1 = new StringBuilder().append("hm.F(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        as.field_E.a(param5, -20500, param6, param2, param4);
        if (qd.field_I != null) {
            qd.field_I.b(param1, param3, param5, -kn.field_z + param1, param5, param0 ^ 6518);
        }
        if (param0 != -1) {
            field_i = (String[]) null;
        }
    }

    private hm() {
        int var1 = 0;
        this.field_k = 0;
        this.field_a = new int[135];
        this.field_b = new int[7];
        this.field_c = 0;
        this.field_j = 0;
        this.field_d = new int[5];
        for (var1 = 0; 5 > var1; var1++) {
            this.field_d[var1] = -1;
        }
        int var3 = 0;
        var1 = var3;
        while (135 > var3) {
            this.field_a[var3] = 0;
            var3++;
        }
        this.field_g = new cm();
    }

    static {
        field_i = new String[]{"Full health", "1/2 health", "1/3 health", "1/4 health", "1/5 health", "1/6 health"};
        field_e = "Are You Sure?";
        field_l = new int[]{0, 0, 536870912, 553634816, 544700415};
        field_h = new jl();
    }
}
