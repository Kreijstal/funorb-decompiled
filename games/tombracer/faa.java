/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa implements fo {
    static String field_g;
    int field_e;
    int field_b;
    vsa field_c;
    int field_d;
    bua field_f;
    int field_a;

    public final void f(int param0) {
        if (param0 != -4366) {
            ((faa) this).field_a = 43;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_12_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 67) {
                break L1;
              } else {
                faa.a(true);
                break L1;
              }
            }
            L2: {
              var5 = (CharSequence) (Object) param0;
              var3 = jd.a(1, var5);
              var6 = (CharSequence) (Object) param2;
              var4 = jd.a(1, var6);
              if (var3 != null) {
                break L2;
              } else {
                if (var4 == null) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            if (var3 == null) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0 != 0;
            } else {
              if (var4 != null) {
                stackOut_12_0 = var3.equals((Object) (Object) var4);
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("faa.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0;
    }

    public final int b(byte param0) {
        int var3 = 0;
        int var2 = 3 % ((param0 - -23) / 53);
        if (((faa) this).field_b == 0) {
            var3 = 0;
        } else {
            var3 = ((faa) this).field_c.o((byte) 122);
        }
        return var3 + (((faa) this).field_c.b((byte) -86) - -((faa) this).field_d);
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            boolean discarded$0 = faa.a((String) null, -123, (String) null);
            field_g = null;
            return;
        }
        field_g = null;
    }

    public final int c(byte param0) {
        int var2 = 0;
        L0: {
          if (((faa) this).field_b != 0) {
            var2 = ((faa) this).field_c.p((byte) 68);
            break L0;
          } else {
            var2 = 0;
            break L0;
          }
        }
        if (param0 < 91) {
          return 78;
        } else {
          return ((faa) this).field_c.c((byte) 124) - -((faa) this).field_a - -var2;
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            field_g = null;
            return ((faa) this).field_c.d((byte) 48);
        }
        return ((faa) this).field_c.d((byte) 48);
    }

    public final int e(byte param0) {
        if (param0 <= -86) {
          if (-1 == ((faa) this).field_b) {
            return 0;
          } else {
            return ((faa) this).field_c.e((byte) -104);
          }
        } else {
          faa.a(true);
          if (-1 == ((faa) this).field_b) {
            return 0;
          } else {
            return ((faa) this).field_c.e((byte) -104);
          }
        }
    }

    public final void a(int param0, iq param1) {
        if (param0 <= 103) {
            ((faa) this).field_f = null;
        }
        gr var3 = ((faa) this).field_c.c(-98);
        if (var3 != null) {
            if (!var3.a(-127)) {
                return;
            }
        }
        if (!(null != ((faa) this).field_f)) {
            return;
        }
        try {
            gqa.a(((faa) this).field_e, -83584144, ((faa) this).c((byte) 105), ((faa) this).b((byte) -102), ((faa) this).field_f.b((byte) 74), ((faa) this).e((byte) -98));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "faa.DB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
