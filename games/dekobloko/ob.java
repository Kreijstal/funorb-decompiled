/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fm {
    private String field_h;
    static int field_g;
    static String field_l;
    static ud field_n;
    private String field_m;
    static ck[][][] field_j;
    static boolean field_k;
    static nk field_i;

    final static jg b(byte param0) {
        int var1 = 82 % ((param0 - -59) / 56);
        return new jg(f.a(116), em.b((byte) -126));
    }

    final void a(wl param0, byte param1) {
        ve discarded$0 = null;
        try {
            param0.b(8, this.field_m);
            if (param1 < 34) {
                discarded$0 = ob.a(-10, 21);
            }
            param0.a(this.field_h, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ob.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ve a(int param0, int param1) {
        be stackIn_4_0 = null;
        be stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        be stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        be stackOut_2_0 = null;
        if (param1 != 8) {
          L0: {
            field_l = (String) null;
            if (tg.field_b == null) {
              stackOut_7_0 = null;
              stackIn_8_0 = (be) ((Object) stackOut_7_0);
              break L0;
            } else {
              stackOut_6_0 = tg.field_b.a(param1 ^ 24718, (long)param0);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (ve) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (tg.field_b == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = (be) ((Object) stackOut_3_0);
              break L1;
            } else {
              stackOut_2_0 = tg.field_b.a(param1 ^ 24718, (long)param0);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (ve) ((Object) stackIn_4_0);
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3) {
        ck[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        var6 = client.field_A ? 1 : 0;
        var7 = new ck[9];
        var4 = var7;
        var7[0] = sm.a((byte) -99, param3, param0);
        var5 = 1;
        L0: while (true) {
          if (var5 >= 9) {
            if (param2 == -3932) {
              var7[4] = sm.a((byte) -122, 64, param1);
              return var4;
            } else {
              ob.a((byte) 72);
              var7[4] = sm.a((byte) -122, 64, param1);
              return var4;
            }
          } else {
            var7[var5] = var7[0];
            var5++;
            if (var6 == 0) {
              continue L0;
            } else {
              return var4;
            }
          }
        }
    }

    final gh a(int param0) {
        if (param0 != 18) {
            return (gh) null;
        }
        return pb.field_i;
    }

    final static void a(int param0, ui param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (rc.field_d != param1) {
                  break L2;
                } else {
                  wj.field_Ob.c(param0);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (rc.field_d == null) {
                  break L3;
                } else {
                  if (param1 == null) {
                    break L3;
                  } else {
                    wj.field_Ob.a(param1, 0, 0, 16);
                    rc.field_d = param1;
                    wj.field_Ob.c(param0);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              nn.a(param0, param1, true);
              break L1;
            }
            if (param2 >= 45) {
              break L0;
            } else {
              field_g = 64;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("ob.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        ck[] discarded$2 = null;
        field_i = null;
        field_j = (ck[][][]) null;
        field_l = null;
        if (param0 < 86) {
          discarded$2 = ob.a(-105, -21, 61, -11);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (256 != param2) {
          pg.field_e.f(param0, param3, param2 >> -299374302);
          if (param1 == -299374302) {
            return;
          } else {
            ob.a((byte) 0);
            return;
          }
        } else {
          pg.field_e.f(param0, param3, 64);
          if (!client.field_A) {
            if (param1 != -299374302) {
              ob.a((byte) 0);
              return;
            } else {
              return;
            }
          } else {
            pg.field_e.f(param0, param3, param2 >> -299374302);
            if (param1 == -299374302) {
              return;
            } else {
              ob.a((byte) 0);
              return;
            }
          }
        }
    }

    ob(String param0, String param1) {
        try {
            this.field_m = param0;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Message game";
        field_j = new ck[8][7][16];
    }
}
