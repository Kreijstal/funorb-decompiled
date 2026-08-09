/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    float field_i;
    String field_h;
    private int field_c;
    private ah[] field_d;
    static int field_e;
    private int field_f;
    static int[] field_j;
    static int field_b;
    static p field_g;
    private int field_a;

    final boolean a(byte param0) {
        ah var2;
        int var3;
        ah var4;
        L0: {
          var3 = StarCannon.field_A;
          if (param0 == 15) {
            break L0;
          } else {
            this.a((byte) -63);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_c < this.field_f) {
            var4 = this.field_d[this.field_c];
            var2 = var4;
            if (var4.field_b.b((byte) 99)) {
              L2: {
                if ((var4.field_j ^ -1) > -1) {
                  break L2;
                } else {
                  if (!var4.field_b.c(var4.field_j, -31)) {
                    this.a((byte) 75, var2, var4.field_b.a(100, var4.field_j));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null == var4.field_g) {
                  break L3;
                } else {
                  if (var4.field_b.a(var4.field_g, -9883)) {
                    break L3;
                  } else {
                    this.a((byte) -121, var2, var4.field_b.a(var4.field_g, (byte) 96));
                    return false;
                  }
                }
              }
              L4: {
                if (0 <= var4.field_j) {
                  break L4;
                } else {
                  if (null != var4.field_g) {
                    break L4;
                  } else {
                    if (null == var4.field_k) {
                      break L4;
                    } else {
                      if (var4.field_b.a(29741)) {
                        break L4;
                      } else {
                        this.a((byte) 27, var2, var4.field_b.a((byte) 62));
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_c = this.field_c + 1;
              continue L1;
            } else {
              this.a((byte) 49, var4, 0);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = 117 / ((param0 - 14) / 53);
        field_g = null;
    }

    private final void a(byte param0, ah param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param2 / 100.0f + (float)(1 + this.field_c);
          var5 = 68 % ((-74 - param0) / 45);
          this.field_i = var4_float * (float)this.field_a / (float)(1 + this.field_f);
          if (param2 != 0) {
            this.field_h = param1.field_k + " - " + param2 + "%";
            return;
          } else {
            this.field_h = param1.field_h;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    private cg() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_g = new p();
    }
}
