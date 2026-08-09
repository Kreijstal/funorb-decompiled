/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private int field_h;
    private long field_a;
    static String[] field_f;
    private long[][] field_c;
    private int field_g;
    static byte[][] field_e;
    private int field_b;
    private Object[][] field_d;

    final Object b(int param0) {
        Object var4 = null;
        int fieldTemp$0 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (0 > this.field_g) {
            return null;
        }
        Object[] var6 = this.field_d[(int)((long)(-1 + this.field_b) & this.field_a)];
        Object[] var2 = var6;
        long[] var3 = this.field_c[(int)(this.field_a & (long)(this.field_b + -1))];
        do {
            if (var6.length <= this.field_g) {
                this.field_g = param0;
                return null;
            }
            var4 = var6[this.field_g];
            if (var5 != 0) {
                return null;
            }
            if (var4 == null) {
                this.field_g = param0;
                return null;
            }
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            if (!((this.field_a ^ -1L) != (var3[fieldTemp$0] ^ -1L))) {
                return var4;
            }
        } while (var5 == 0);
        this.field_g = param0;
        return null;
    }

    final Object a(int param0, long param1) {
        if (param0 > -123) {
          field_f = (String[]) null;
          this.field_a = param1;
          this.field_g = 0;
          return this.b(-1);
        } else {
          this.field_a = param1;
          this.field_g = 0;
          return this.b(-1);
        }
    }

    public static void a(int param0) {
        field_e = (byte[][]) null;
        field_f = null;
        if (param0 < 75) {
            field_f = (String[]) null;
        }
    }

    final void a(Object param0, byte param1, long param2) {
        Object[] array$0 = null;
        long[] array$1 = null;
        Object[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object[] var5 = null;
        RuntimeException var5_ref = null;
        long[] var6 = null;
        int var7_int = 0;
        Object[] var7 = null;
        long[] var8 = null;
        int var9 = 0;
        Object[] var10 = null;
        long[] var11 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              throw new IllegalArgumentException();
            } else {
              var10 = this.field_d[(int)((long)(-1 + this.field_b) & param2)];
              var5 = var10;
              var11 = this.field_c[(int)((long)(this.field_b + -1) & param2)];
              var6 = var11;
              var7_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7_int >= var10.length) {
                      break L3;
                    } else {
                      stackIn_15_0 = (Object[]) (var5);

                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (stackIn_15_0[var7_int] == null) {
                          var5[var7_int] = param0;
                          var11[var7_int] = param2;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var7_int++;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == 26) {
                    stackIn_15_0 = (Object[]) (var5);
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                var7 = stackIn_15_0;
                var8 = var6;
                array$0 = new Object[var7.length + this.field_h];
                var5 = array$0;
                this.field_d[(int)ej.a((long)(this.field_b + -1), param2)] = array$0;
                array$1 = new long[var8.length + this.field_h];
                var6 = array$1;
                this.field_c[(int)ej.a(param2, (long)(-1 + this.field_b))] = array$1;
                ji.a(var7, 0, var5, 0, var7.length);
                ji.a(var8, 0, var6, 0, var8.length);
                var5[var7.length] = param0;
                var6[var8.length] = param2;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5_ref);

            stackIn_19_1 = new StringBuilder().append("ld.D(");

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
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
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

    ld(int param0, int param1, int param2) {
        Object[] array$2 = null;
        long[] array$3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    this.field_h = param2;
                    this.field_b = param0;
                    this.field_d = new Object[this.field_b][];
                    this.field_c = new long[this.field_b][];
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_b <= var4) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    array$2 = new Object[param1];
                    this.field_d[var4] = array$2;
                    array$3 = new long[param1];
                    this.field_c[var4] = array$3;
                    var4++;
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
    }
}
