/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static int field_j;
    float field_c;
    private int field_e;
    static int field_b;
    private hj[] field_h;
    static af field_f;
    static int[] field_d;
    private int field_i;
    String field_g;
    private int field_a;

    private final void a(hj param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var4_float = (float)param2 / (float)100 + (float)(1 + ((dm) this).field_e);
          ((dm) this).field_c = (float)((dm) this).field_a * var4_float / (float)(1 + ((dm) this).field_i);
          if (param2 != 0) {
            ((dm) this).field_g = param0.field_l + " - " + param2 + "%";
            return;
          } else {
            ((dm) this).field_g = param0.field_m;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("dm.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 100 + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 20583) {
            dm.a(-62);
            field_f = null;
            field_d = null;
            return;
        }
        field_f = null;
        field_d = null;
    }

    final boolean a(boolean param0) {
        hj var2 = null;
        int var3 = 0;
        hj var4 = null;
        hj var5 = null;
        var3 = MinerDisturbance.field_ab;
        if (param0) {
          L0: while (true) {
            if (((dm) this).field_e < ((dm) this).field_i) {
              var5 = ((dm) this).field_h[((dm) this).field_e];
              var4 = var5;
              var2 = var4;
              if (var5.field_j.a((byte) 102)) {
                L1: {
                  if (0 > var5.field_d) {
                    break L1;
                  } else {
                    if (var5.field_j.d(var5.field_d, 0)) {
                      break L1;
                    } else {
                      this.a(var2, 100, var5.field_j.a(var5.field_d, true));
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var5.field_g) {
                    break L2;
                  } else {
                    if (!var5.field_j.a(false, var5.field_g)) {
                      this.a(var2, 100, var5.field_j.a(var5.field_g, -128));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var5.field_d >= 0) {
                    break L3;
                  } else {
                    if (var5.field_g != null) {
                      break L3;
                    } else {
                      if (var5.field_l == null) {
                        break L3;
                      } else {
                        if (var5.field_j.b(-1)) {
                          break L3;
                        } else {
                          this.a(var2, 100, var5.field_j.c(-14858));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((dm) this).field_e = ((dm) this).field_e + 1;
                continue L0;
              } else {
                this.a(var5, 100, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private dm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
        field_b = 0;
        field_d = new int[8192];
        field_f = null;
    }
}
