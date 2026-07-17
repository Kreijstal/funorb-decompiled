/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends mc {
    static faa field_w;
    static jra field_v;

    final void a(int param0) {
        int var2 = 43 / ((-80 - param0) / 42);
        ((bk) this).field_t.a(false);
    }

    final void b(int param0, int param1, int param2, int param3) {
        L0: {
          if (param1 != 0) {
            break L0;
          } else {
            if (null != ((bk) this).field_q) {
              ((bk) this).field_q.a(92, (shb) this, param0, param3, true);
              break L0;
            } else {
              if (param2 >= 47) {
                if (((bk) this).field_h != 0) {
                  if (((bk) this).field_f != 0) {
                    msa.field_s.a(((bk) this).field_r + param3 - -((bk) this).field_f, (byte) 123, ((bk) this).field_h + ((bk) this).field_g + param0, param3 + ((bk) this).field_r, param0 - -((bk) this).field_g);
                    ((bk) this).field_t.b(param0 + ((bk) this).field_g, param1, 63, param3 + ((bk) this).field_r);
                    msa.field_s.a((byte) 92);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (param2 >= 47) {
          if (((bk) this).field_h != 0) {
            if (((bk) this).field_f != 0) {
              msa.field_s.a(((bk) this).field_r + param3 - -((bk) this).field_f, (byte) 123, ((bk) this).field_h + ((bk) this).field_g + param0, param3 + ((bk) this).field_r, param0 - -((bk) this).field_g);
              ((bk) this).field_t.b(param0 + ((bk) this).field_g, param1, 63, param3 + ((bk) this).field_r);
              msa.field_s.a((byte) 92);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 <= 40) {
            bk.e(87);
            field_w = null;
            return;
        }
        field_w = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param6 < -17) {
                break L1;
              } else {
                ((bk) this).b(90, -56, -39, 108);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((bk) this).a(param2, param1, param0, param5, (byte) 22)) {
                  break L3;
                } else {
                  if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -123)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("bk.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_6_0 != 0;
    }

    bk(int param0, int param1, int param2, int param3, wwa param4, shb param5) {
        super(param0, param1, param2, param3, param4, (sba) null);
        try {
            ((bk) this).field_t = param5;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new faa(1048576);
        field_v = new jra();
    }
}
