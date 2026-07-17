/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vf {
    private dm field_Q;
    private int field_P;
    static int[][] field_R;
    private dg field_M;
    static na field_O;
    static rf field_S;
    private String field_N;

    final String c(byte param0) {
        if (param0 == 69) {
            return null;
        }
        return null;
    }

    final static nc a(rh param0, int param1, int param2, rh param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5_int = 0;
            if (mf.a(param4, param1, 116, param3)) {
              int discarded$2 = -108;
              stackOut_3_0 = ni.a(param0.a(param1, -28153, param4));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("pi.O(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44).append(-128).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    final static void c(int param0, int param1) {
        L0: {
          wg.field_a = param0 >> 4 & 3;
          if (wg.field_a > 2) {
            wg.field_a = 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          qc.field_i = param0 >> 2 & 3;
          ad.field_j = 3 & param0;
          if (qc.field_i > 2) {
            qc.field_i = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (ad.field_j > 2) {
          ad.field_j = 2;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            ((pi) this).field_P = ((pi) this).field_P + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pi.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 <= -30) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((pi) this).field_P = 97;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pi.UA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        lh var6 = null;
        cc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        dm var15 = null;
        dm var16 = null;
        dm var17 = null;
        dm var18 = null;
        dm var19 = null;
        L0: {
          L1: {
            var14 = Geoblox.field_C;
            var6 = ((pi) this).field_M.a((byte) -105);
            if (var6 == bf.field_g) {
              break L1;
            } else {
              if (var6 != si.field_n) {
                var5 = ((pi) this).field_M.c(-21666);
                if (var5 == null) {
                  var5 = ((pi) this).field_N;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = cm.field_h;
          break L0;
        }
        L2: {
          if (var5.equals((Object) (Object) ((pi) this).field_s)) {
            break L2;
          } else {
            ((pi) this).field_s = var5;
            ((pi) this).g(-55);
            break L2;
          }
        }
        super.a(param0, param1, (byte) 106, param3);
        var6 = ((pi) this).field_M.a((byte) -105);
        var8 = (cc) (Object) ((pi) this).field_q;
        var9 = ((pi) this).field_v + param0;
        var10 = var8.a(param1, -2, (el) this) + (var8.a((byte) 125, (el) this).b(-3111) >> 1);
        var11 = 7 % ((param2 - 1) / 43);
        if (bf.field_g == var6) {
          var19 = oa.field_e[0];
          var12 = var19.field_s << 1;
          var13 = var19.field_o << 1;
          if (((pi) this).field_Q != null) {
            if (((pi) this).field_Q.field_r >= var12) {
              if (((pi) this).field_Q.field_m < var13) {
                ((pi) this).field_Q = new dm(var12, var13);
                Geoblox.a(1, ((pi) this).field_Q);
                var19.a(112, 144, var19.field_s << 4, var19.field_o << 4, -((pi) this).field_P << 10, 4096);
                int discarded$8 = 1;
                id.a();
                ((pi) this).field_Q.c(-(var19.field_s >> 1) + var9, var10 - var19.field_o, 256);
                return;
              } else {
                Geoblox.a(1, ((pi) this).field_Q);
                vb.c();
                var19.a(112, 144, var19.field_s << 4, var19.field_o << 4, -((pi) this).field_P << 10, 4096);
                int discarded$9 = 1;
                id.a();
                ((pi) this).field_Q.c(-(var19.field_s >> 1) + var9, var10 - var19.field_o, 256);
                return;
              }
            } else {
              ((pi) this).field_Q = new dm(var12, var13);
              Geoblox.a(1, ((pi) this).field_Q);
              var19.a(112, 144, var19.field_s << 4, var19.field_o << 4, -((pi) this).field_P << 10, 4096);
              int discarded$10 = 1;
              id.a();
              ((pi) this).field_Q.c(-(var19.field_s >> 1) + var9, var10 - var19.field_o, 256);
              return;
            }
          } else {
            ((pi) this).field_Q = new dm(var12, var13);
            Geoblox.a(1, ((pi) this).field_Q);
            var19.a(112, 144, var19.field_s << 4, var19.field_o << 4, -((pi) this).field_P << 10, 4096);
            int discarded$11 = 1;
            id.a();
            ((pi) this).field_Q.c(-(var19.field_s >> 1) + var9, var10 - var19.field_o, 256);
            return;
          }
        } else {
          if (var6 != si.field_n) {
            if (si.field_m != var6) {
              if (kk.field_w == var6) {
                var16 = oa.field_e[1];
                var16.c(var9, var10 - (var16.field_m >> 1), 256);
                return;
              } else {
                return;
              }
            } else {
              var17 = oa.field_e[2];
              var17.c(var9, var10 - (var17.field_m >> 1), 256);
              return;
            }
          } else {
            var18 = oa.field_e[0];
            var15 = var18;
            var12 = var18.field_s << 1;
            var13 = var18.field_o << 1;
            if (((pi) this).field_Q != null) {
              if (((pi) this).field_Q.field_r >= var12) {
                if (((pi) this).field_Q.field_m < var13) {
                  ((pi) this).field_Q = new dm(var12, var13);
                  Geoblox.a(1, ((pi) this).field_Q);
                  var18.a(112, 144, var18.field_s << 4, var18.field_o << 4, -((pi) this).field_P << 10, 4096);
                  int discarded$12 = 1;
                  id.a();
                  ((pi) this).field_Q.c(-(var18.field_s >> 1) + var9, var10 - var18.field_o, 256);
                  return;
                } else {
                  Geoblox.a(1, ((pi) this).field_Q);
                  vb.c();
                  var18.a(112, 144, var18.field_s << 4, var18.field_o << 4, -((pi) this).field_P << 10, 4096);
                  int discarded$13 = 1;
                  id.a();
                  ((pi) this).field_Q.c(-(var18.field_s >> 1) + var9, var10 - var18.field_o, 256);
                  return;
                }
              } else {
                ((pi) this).field_Q = new dm(var12, var13);
                Geoblox.a(1, ((pi) this).field_Q);
                var18.a(112, 144, var18.field_s << 4, var18.field_o << 4, -((pi) this).field_P << 10, 4096);
                int discarded$14 = 1;
                id.a();
                ((pi) this).field_Q.c(-(var18.field_s >> 1) + var9, var10 - var18.field_o, 256);
                return;
              }
            } else {
              ((pi) this).field_Q = new dm(var12, var13);
              Geoblox.a(1, ((pi) this).field_Q);
              var18.a(112, 144, var18.field_s << 4, var18.field_o << 4, -((pi) this).field_P << 10, 4096);
              int discarded$15 = 1;
              id.a();
              ((pi) this).field_Q.c(-(var18.field_s >> 1) + var9, var10 - var18.field_o, 256);
              return;
            }
          }
        }
    }

    public static void j() {
        field_R = null;
        field_S = null;
        field_O = null;
    }

    final static void a(boolean param0, boolean param1) {
        kd.field_e.a(0, 0, 0);
    }

    pi(dg param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (dh) (Object) ah.a());
        int discarded$0 = -66;
        try {
            ((pi) this).field_M = param0;
            ((pi) this).field_N = param1;
            ((pi) this).a(param5, param4, (byte) -77, param3, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
    }
}
