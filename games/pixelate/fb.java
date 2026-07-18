/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ak {
    static String field_Eb;
    static String field_Gb;
    private ak field_Ib;
    private ak field_Fb;
    static int field_Hb;

    public static void j(int param0) {
        field_Eb = null;
        field_Gb = null;
    }

    final int b(byte param0, int param1) {
        if (param0 < 106) {
          ((fb) this).a(99, 86, 52, 40, 114, 127);
          return ((fb) this).field_Fb.g(0) + param1 + ((fb) this).field_Ib.g(0);
        } else {
          return ((fb) this).field_Fb.g(0) + param1 + ((fb) this).field_Ib.g(0);
        }
    }

    final static ak c(byte param0) {
        return v.field_e.field_Fb;
    }

    private final void b(int param0, boolean param1) {
        ((fb) this).field_Fb.a(0, ((fb) this).field_nb, 0, 256, ((fb) this).field_Fb.g(0));
        int var3 = param0 + ((fb) this).field_Fb.field_K;
        ((fb) this).field_Ib.a(0, ((fb) this).field_nb, var3, 256, -var3 + ((fb) this).field_K);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((fb) this).a(param2, param0, param1, param5 + 256, param3);
        if (param5 != 0) {
          field_Hb = -3;
          this.b(param4, false);
          return;
        } else {
          this.b(param4, false);
          return;
        }
    }

    final static void a(int param0, int param1) {
        pc var2 = aa.field_f;
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 1);
    }

    fb(long param0, tf param1, tf param2, int param3, ak param4, String param5) {
        this(param0, (ak) null, param4, param5);
        try {
            ((fb) this).field_Fb.field_kb = param3;
            ((fb) this).field_Fb.field_z = param1;
            ((fb) this).field_Fb.field_H = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static ak b(byte param0) {
        return fd.a(0);
    }

    private fb(long param0, ak param1, ak param2, String param3) {
        super(param0, (ak) null);
        try {
            ((fb) this).field_Fb = new ak(0L, param1);
            ((fb) this).field_Ib = new ak(0L, param2);
            ((fb) this).field_Ib.field_cb = param3;
            ((fb) this).a(((fb) this).field_Fb, (byte) 26);
            ((fb) this).a(((fb) this).field_Ib, (byte) 26);
            ((fb) this).h(-257);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    fb(long param0, fb param1, String param2) {
        this(param0, param1.field_Fb, param1.field_Ib, param2);
    }

    final static int a(int param0, byte param1, int param2) {
        if (2 > param0) {
            if (param2 < 5) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final static void a(boolean param0, String param1, eq param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wi var9 = null;
        String var10 = null;
        wi var11 = null;
        String var12 = null;
        wi var13 = null;
        String var14 = null;
        wi var15 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              em.a((String) null, 0L, (String) null, param2.c((byte) 8), (ak) (Object) param2, -163, aj.field_k, (int[]) null, -1);
              if (!param2.field_dc) {
                break L1;
              } else {
                L2: {
                  if (param2.field_Tb == 2) {
                    break L2;
                  } else {
                    if (wo.field_h < 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var9 = eg.field_n;
                var10 = sd.a(oe.field_Kb, 103, new String[1]);
                var9.field_b.a(var10, (byte) -112, 10);
                break L1;
              }
            }
            L3: {
              eg.field_n.c(-107);
              if (param0) {
                if (ec.field_r == eg.field_n.field_m) {
                  var13 = eg.field_n;
                  var14 = sd.a(kb.field_M, 77, new String[1]);
                  var13.field_b.a(var14, (byte) -111, 16);
                  break L3;
                } else {
                  var11 = eg.field_n;
                  var12 = sd.a(sd.field_J, 89, new String[1]);
                  var11.field_b.a(var12, (byte) -61, 15);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var6 = -41 / ((23 - param3) / 40);
            var15 = eg.field_n;
            var5 = uo.field_a;
            var7 = ji.field_c;
            var15.field_b.b(0, var5, 62, var7, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fb.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = "Game";
        field_Eb = "You have declined the invitation.";
        field_Hb = 0;
    }
}
