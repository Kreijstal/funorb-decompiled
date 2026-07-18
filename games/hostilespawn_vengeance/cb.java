/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int[] field_d;
    static String field_b;
    private dk field_a;
    private int field_i;
    static String field_h;
    private dk[] field_f;
    static bd[][] field_g;
    static long field_e;
    static int field_c;
    private long field_j;

    final static ll a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ll stackIn_4_0 = null;
        ll stackIn_8_0 = null;
        ll stackIn_17_0 = null;
        ll stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_3_0 = null;
        ll stackOut_7_0 = null;
        Object stackOut_25_0 = null;
        ll stackOut_16_0 = null;
        ll stackOut_20_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = gf.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (63 < var2_int) {
                stackOut_7_0 = hb.field_v;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var2_int <= var3) {
                    if (param1 <= 18) {
                      field_g = null;
                      stackOut_25_0 = null;
                      stackIn_26_0 = stackOut_25_0;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (-1 + var2_int != var3) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_16_0 = we.field_g;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        if (ce.field_g.indexOf(var4) == -1) {
                          stackOut_20_0 = we.field_g;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("cb.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ')');
        }
        return (ll) (Object) stackIn_26_0;
    }

    final static void a(int param0, oj param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              in.a(false);
              jg.field_d.e((640 + -jg.field_d.field_z) / 2, -4 + (-jg.field_d.field_A + 480));
              var2_int = (640 + -gj.field_d.field_z) / 2;
              var3 = -gj.field_d.field_A + 478;
              var4 = (gj.field_d.field_z - 4) * ij.k(-86) >> 9;
              si.c(var2_int - -2, var3 - -3, var4, 2, 16772608);
              gj.field_d.e(var2_int, var3);
              al.field_Z.c(hk.field_k.toUpperCase(), 8, 472, 16776960, -1);
              al.field_Z.b(bi.field_c[n.field_s].toUpperCase(), 320, 471, 16776960, -1);
              var5 = el.field_i.toUpperCase();
              var6 = al.field_Z.a(var5);
              al.field_Z.a(var5, 631, 472, 16776960, -1);
              ec.a(7, 472, false, (vm) (Object) al.field_Z, 631 + -var6 + -5, 16776960, Integer.toString(cf.field_s));
              stackOut_0_0 = -11003;
              stackOut_0_1 = Math.max(eh.field_g, 0);
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (0 >= um.field_e) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = ba.a((byte) 61);
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = Math.max(eh.field_g, qi.field_J);
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              sm.a(stackIn_3_0, stackIn_3_1, stackIn_3_2);
              if (le.field_D <= 0) {
                break L2;
              } else {
                mk.field_L.b(jh.a((byte) -93, le.field_D / 50), 320, 52, 16711680, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("cb.D(").append(631).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final dk a(long param0, int param1) {
        dk var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != -30828) {
            return null;
        }
        ((cb) this).field_j = param0;
        dk var4 = ((cb) this).field_f[(int)((long)(-1 + ((cb) this).field_i) & param0)];
        ((cb) this).field_a = var4.field_j;
        while (((cb) this).field_a != var4) {
            if (!(~param0 != ~((cb) this).field_a.field_h)) {
                var5 = ((cb) this).field_a;
                ((cb) this).field_a = ((cb) this).field_a.field_j;
                return var5;
            }
            ((cb) this).field_a = ((cb) this).field_a.field_j;
        }
        ((cb) this).field_a = null;
        return null;
    }

    final void a(long param0, dk param1, int param2) {
        dk var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_i) {
                break L1;
              } else {
                param1.c(-1);
                break L1;
              }
            }
            L2: {
              var5 = ((cb) this).field_f[(int)(param0 & (long)(-1 + ((cb) this).field_i))];
              param1.field_j = var5;
              param1.field_i = var5.field_i;
              param1.field_i.field_j = param1;
              param1.field_j.field_i = param1;
              param1.field_h = param0;
              if (param2 == 320) {
                break L2;
              } else {
                var6 = null;
                ll discarded$2 = cb.a((String) null, 83);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("cb.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final dk a(int param0) {
        dk var3_ref_dk = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (((cb) this).field_a == null) {
            return null;
        }
        dk var2 = ((cb) this).field_f[(int)(((cb) this).field_j & (long)(-1 + ((cb) this).field_i))];
        while (((cb) this).field_a != var2) {
            if (!(~((cb) this).field_j != ~((cb) this).field_a.field_h)) {
                var3_ref_dk = ((cb) this).field_a;
                ((cb) this).field_a = ((cb) this).field_a.field_j;
                return var3_ref_dk;
            }
            ((cb) this).field_a = ((cb) this).field_a.field_j;
        }
        int var3 = -86 / (param0 / 48);
        ((cb) this).field_a = null;
        return null;
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_b = null;
        field_h = null;
    }

    cb(int param0) {
        int var2 = 0;
        dk var3 = null;
        ((cb) this).field_i = param0;
        ((cb) this).field_f = new dk[param0];
        for (var2 = 0; var2 < param0; var2++) {
            dk dupTemp$0 = new dk();
            var3 = dupTemp$0;
            ((cb) this).field_f[var2] = dupTemp$0;
            var3.field_i = var3;
            var3.field_j = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[12];
        field_b = "Log in";
        field_h = "Find the entrance to the military base and locate the lift.";
    }
}
