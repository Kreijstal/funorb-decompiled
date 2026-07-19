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
        int fieldTemp$2 = 0;
        Object[] var2 = null;
        long[] var3 = null;
        Object var4 = null;
        int var5 = 0;
        Object[] var6 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (0 <= this.field_g) {
          var6 = this.field_d[(int)((long)(-1 + this.field_b) & this.field_a)];
          var2 = var6;
          var3 = this.field_c[(int)(this.field_a & (long)(this.field_b + -1))];
          L0: while (true) {
            if (var6.length > this.field_g) {
              var4 = var6[this.field_g];
              if (var5 == 0) {
                if (var4 != null) {
                  fieldTemp$2 = this.field_g;
                  this.field_g = this.field_g + 1;
                  if ((this.field_a ^ -1L) == (var3[fieldTemp$2] ^ -1L)) {
                    return var4;
                  } else {
                    continue L0;
                  }
                } else {
                  this.field_g = param0;
                  return null;
                }
              } else {
                return null;
              }
            } else {
              this.field_g = param0;
              return null;
            }
          }
        } else {
          return null;
        }
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
        Object[] array$2 = null;
        long[] array$3 = null;
        RuntimeException var5 = null;
        Object[] var5_array = null;
        long[] var6 = null;
        int var7_int = 0;
        Object[] var7 = null;
        long[] var8 = null;
        int var9 = 0;
        Object[] var10 = null;
        long[] var11 = null;
        Object[] stackIn_7_0 = null;
        Object[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object[] stackOut_6_0 = null;
        Object[] stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              throw new IllegalArgumentException();
            } else {
              var10 = this.field_d[(int)((long)(-1 + this.field_b) & param2)];
              var5_array = var10;
              var11 = this.field_c[(int)((long)(this.field_b + -1) & param2)];
              var6 = var11;
              var7_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7_int >= var10.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = (Object[]) (var5_array);
                      stackIn_15_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0[var7_int] == null) {
                          var5_array[var7_int] = param0;
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
                    stackOut_14_0 = (Object[]) (var5_array);
                    stackIn_15_0 = stackOut_14_0;
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                var7 = stackIn_15_0;
                var8 = var6;
                array$2 = new Object[var7.length + this.field_h];
                var5_array = array$2;
                this.field_d[(int)ej.a((long)(this.field_b + -1), param2)] = array$2;
                array$3 = new long[var8.length + this.field_h];
                var6 = array$3;
                this.field_c[(int)ej.a(param2, (long)(-1 + this.field_b))] = array$3;
                ji.a(var7, 0, var5_array, 0, var7.length);
                ji.a(var8, 0, var6, 0, var8.length);
                var5_array[var7.length] = param0;
                var6[var8.length] = param2;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("ld.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
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
        Object[] array$0 = null;
        long[] array$1 = null;
        int var5 = Transmogrify.field_A ? 1 : 0;
        this.field_h = param2;
        this.field_b = param0;
        this.field_d = new Object[this.field_b][];
        this.field_c = new long[this.field_b][];
        int var4 = 0;
        while (this.field_b > var4) {
            array$0 = new Object[param1];
            this.field_d[var4] = array$0;
            array$1 = new long[param1];
            this.field_c[var4] = array$1;
            var4++;
            if (var5 != 0) {
                return;
            }
        }
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
    }
}
