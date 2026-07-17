/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    private String[] field_b;
    static tf[] field_g;
    static we field_d;
    int field_f;
    private int field_c;
    private String field_a;
    private int field_e;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        t.a(((bi) this).field_f, ((bi) this).field_e, 250, ((bi) this).field_c, 12, 0, 180);
        t.e(((bi) this).field_f, ((bi) this).field_e, 250, ((bi) this).field_c, 12, 0);
        var2 = 4 + ((bi) this).field_e - -8;
        if (!param0) {
          L0: {
            if (null != ((bi) this).field_a) {
              hk.field_d.b(((bi) this).field_a, ((bi) this).field_f - -125, var2 + pe.field_c, 16776960, 0);
              var2 = var2 + (8 + pe.field_c);
              break L0;
            } else {
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((bi) this).field_b.length) {
              return;
            } else {
              var2 = var2 + pe.field_c * hk.field_d.a(((bi) this).field_b[var3], 8 + ((bi) this).field_f, var2, 234, ((bi) this).field_c, 16777215, 0, 0, 0, pe.field_c);
              var2 += 8;
              var3++;
              continue L1;
            }
          }
        } else {
          L2: {
            bi.a(1);
            if (null != ((bi) this).field_a) {
              hk.field_d.b(((bi) this).field_a, ((bi) this).field_f - -125, var2 + pe.field_c, 16776960, 0);
              var2 = var2 + (8 + pe.field_c);
              break L2;
            } else {
              break L2;
            }
          }
          var3 = 0;
          L3: while (true) {
            if (var3 >= ((bi) this).field_b.length) {
              return;
            } else {
              var2 = var2 + pe.field_c * hk.field_d.a(((bi) this).field_b[var3], 8 + ((bi) this).field_f, var2, 234, ((bi) this).field_c, 16777215, 0, 0, 0, pe.field_c);
              var2 += 8;
              var3++;
              continue L3;
            }
          }
        }
    }

    final static tf a(String param0, String param1, fm param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a(127, param0);
              if (param3 < -19) {
                break L1;
              } else {
                tg discarded$2 = bi.b(25);
                break L1;
              }
            }
            var5 = param2.a((byte) -105, param1, var4_int);
            stackOut_2_0 = dk.a(var5, param2, var4_int, -1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("bi.A(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -8) {
            field_g = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static tg b(int param0) {
        if (param0 != 4) {
            bi.a(-128);
            if (!(null != ll.field_c)) {
                ll.field_c = new tg();
                ll.field_c.a(4, he.field_d);
                ll.field_c.field_p = 5;
                ll.field_c.field_d = 7697781;
                ll.field_c.field_q = 14;
                ll.field_c.field_e = 2763306;
                ll.field_c.field_o = 0;
                ll.field_c.field_g = 4;
                ll.field_c.field_n = 6;
                ll.field_c.field_m = ep.field_b;
            }
            return ll.field_c;
        }
        if (!(null != ll.field_c)) {
            ll.field_c = new tg();
            ll.field_c.a(4, he.field_d);
            ll.field_c.field_p = 5;
            ll.field_c.field_d = 7697781;
            ll.field_c.field_q = 14;
            ll.field_c.field_e = 2763306;
            ll.field_c.field_o = 0;
            ll.field_c.field_g = 4;
            ll.field_c.field_n = 6;
            ll.field_c.field_m = ep.field_b;
        }
        return ll.field_c;
    }

    bi(String param0, String[] param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              ((bi) this).field_a = param0;
              ((bi) this).field_c = 16;
              ((bi) this).field_b = param1;
              if (null == ((bi) this).field_a) {
                break L1;
              } else {
                ((bi) this).field_c = ((bi) this).field_c + (pe.field_c + 8);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (((bi) this).field_b.length <= var4_int) {
                L3: {
                  ((bi) this).field_e = 20;
                  ((bi) this).field_f = -250;
                  if (!param2) {
                    break L3;
                  } else {
                    ((bi) this).field_e = ((bi) this).field_e + 50;
                    break L3;
                  }
                }
                break L0;
              } else {
                ((bi) this).field_c = ((bi) this).field_c + pe.field_c * hk.field_d.b(((bi) this).field_b[var4_int], 234);
                ((bi) this).field_c = ((bi) this).field_c + 8;
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("bi.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    static {
    }
}
