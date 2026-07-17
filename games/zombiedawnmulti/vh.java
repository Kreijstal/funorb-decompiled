/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends cj {
    static String field_Nb;
    static boolean field_Mb;
    int field_Ob;
    static ej field_Gb;
    private int field_Jb;
    static String field_Fb;
    static boolean field_Hb;
    static ri field_Lb;
    static String[] field_Ib;
    private ja field_Kb;

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = bd.field_g - ((vh) this).field_x;
          var3 = -((vh) this).field_Q + bo.field_d;
          if ((param0 & jf.field_e) != 0) {
            if (var3 < 0) {
              break L0;
            } else {
              if (~var3 > ~((vh) this).field_z) {
                L1: {
                  if (var2 < 0) {
                    break L1;
                  } else {
                    if (~((vh) this).field_zb < ~var2) {
                      ((vh) this).field_Ob = ((vh) this).field_Kb.field_B[((vh) this).field_Kb.field_x * var3 - -var2];
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (4 + ((vh) this).field_zb > var2) {
                    break L2;
                  } else {
                    if (((vh) this).field_zb + 12 <= var2) {
                      break L2;
                    } else {
                      ((vh) this).field_Jb = -(185 * var3 / ((vh) this).field_z) + 255;
                      this.a(((vh) this).field_Kb, 12);
                      break L0;
                    }
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 < -24) {
                break L1;
              } else {
                field_Hb = false;
                break L1;
              }
            }
            if (!param0) {
              stackOut_5_0 = e.field_c.a(param2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = wn.field_u.a(param2);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vh.HA(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    vh(long param0, cj param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5, (String) null);
        ((vh) this).field_Jb = 190;
        try {
            ((vh) this).field_Kb = new ja(param4, param5);
            this.a(((vh) this).field_Kb, 12);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "vh.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static boolean a(char param0, byte param1) {
        return param0 >= 48 && 57 >= param0;
    }

    final void i(int param0) {
        ((vh) this).field_Kb.c(((vh) this).field_x, ((vh) this).field_Q);
        oo.a(4 + ((vh) this).field_zb + ((vh) this).field_x, ((vh) this).field_Q, 8, ((vh) this).field_z, 16777215, 4671303);
        int var4 = 18 / ((param0 - 16) / 42);
        int var2 = -((vh) this).field_x + bd.field_g;
        int var3 = bo.field_d - ((vh) this).field_Q;
        if (-1 != (jf.field_e & 1)) {
            if (var3 >= 0) {
                if (!(((vh) this).field_z <= var3)) {
                    if (-1 <= var2) {
                        if (var2 < ((vh) this).field_zb) {
                            oo.c(bd.field_g, bo.field_d, 2, 0);
                        }
                    }
                }
            }
        }
    }

    private final void a(ja param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.field_w <= var3_int) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= param0.field_x) {
                    var3_int++;
                    continue L1;
                  } else {
                    var5 = var4 * 256 / param0.field_x;
                    var6 = -(var3_int * 256 / param0.field_w) + 255;
                    param0.field_B[var3_int * param0.field_x + var4] = gi.a(var6, ((vh) this).field_Jb, var5, (byte) -115);
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vh.BA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 12 + 41);
        }
    }

    public static void c(byte param0) {
        if (param0 >= -97) {
            return;
        }
        field_Ib = null;
        field_Lb = null;
        field_Fb = null;
        field_Gb = null;
        field_Nb = null;
    }

    final static void a(int param0, int[] param1, Object[] param2) {
        try {
            if (param0 != -7255) {
                Object var4 = null;
                vh.a(((int[]) param2[10])[0], (int[]) null, (Object[]) null);
            }
            qf.a(param2, 0, 2, param1.length + -1, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "vh.GA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static int h(int param0) {
        return lq.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = false;
        field_Nb = "Status";
        field_Hb = false;
        field_Ib = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
