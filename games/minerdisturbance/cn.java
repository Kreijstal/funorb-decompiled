/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    byte[] field_n;
    int[][] field_a;
    int[] field_p;
    int field_y;
    byte[] field_J;
    byte[] field_r;
    byte[] field_f;
    byte[][] field_I;
    int field_H;
    int field_e;
    static String field_F;
    int field_b;
    static int field_C;
    int field_q;
    int field_o;
    int field_G;
    byte[] field_s;
    int field_j;
    int[] field_w;
    int field_c;
    int[][] field_x;
    int field_z;
    static String field_K;
    int field_t;
    byte[] field_A;
    boolean[] field_u;
    int[] field_E;
    boolean[] field_h;
    int field_m;
    int[] field_l;
    static we field_g;
    int[][] field_k;
    static vi field_v;
    int field_B;
    int field_D;
    byte field_d;
    int field_i;

    final static boolean a(int param0, int param1, int param2, bj param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        byte[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
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
            var6 = param3.a(false, param2, param0);
            var4 = var6;
            if (var6 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                im.a(param1 ^ -339, var6);
                if (param1 == 258) {
                  break L1;
                } else {
                  var5 = null;
                  cn.a((java.applet.Applet) null, (String) null, -57, false);
                  break L1;
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("cn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(int param0) {
        field_v = null;
        if (param0 >= -107) {
          field_C = 7;
          field_g = null;
          field_K = null;
          field_F = null;
          return;
        } else {
          field_g = null;
          field_K = null;
          field_F = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, String param1, int param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              if (param2 == 11050) {
                L0: {
                  if (vf.field_j.startsWith("win")) {
                    if (uh.a((byte) 115, param1)) {
                      return;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                {
                  L1: {
                    param0.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var4_ref;
                stackOut_11_1 = new StringBuilder().append("cn.B(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L2;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L2;
                }
              }
              L3: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
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
              throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        Object var10 = null;
        var9 = MinerDisturbance.field_ab;
        if (param1 != 0) {
          var10 = null;
          boolean discarded$1 = cn.a(-102, -75, -127, (bj) null);
          if (param3 <= param5) {
            if (param5 >= param0) {
              if (param3 >= param0) {
                h.a(param3, param0, eh.field_f, param6, param5, param2, -13612, param7, param4);
                return;
              } else {
                h.a(param0, param3, eh.field_f, param4, param5, param2, param1 ^ -13612, param7, param6);
                return;
              }
            } else {
              h.a(param5, param3, eh.field_f, param2, param0, param4, -13612, param7, param6);
              return;
            }
          } else {
            if (param0 <= param3) {
              if (param5 < param0) {
                h.a(param0, param5, eh.field_f, param4, param3, param6, -13612, param7, param2);
                return;
              } else {
                h.a(param5, param0, eh.field_f, param2, param3, param6, param1 + -13612, param7, param4);
                return;
              }
            } else {
              h.a(param3, param5, eh.field_f, param6, param0, param4, -13612, param7, param2);
              return;
            }
          }
        } else {
          if (param3 <= param5) {
            if (param5 >= param0) {
              if (param3 >= param0) {
                h.a(param3, param0, eh.field_f, param6, param5, param2, -13612, param7, param4);
                return;
              } else {
                h.a(param0, param3, eh.field_f, param4, param5, param2, param1 ^ -13612, param7, param6);
                return;
              }
            } else {
              h.a(param5, param3, eh.field_f, param2, param0, param4, -13612, param7, param6);
              return;
            }
          } else {
            if (param0 <= param3) {
              if (param5 < param0) {
                h.a(param0, param5, eh.field_f, param4, param3, param6, -13612, param7, param2);
                return;
              } else {
                h.a(param5, param0, eh.field_f, param2, param3, param6, param1 + -13612, param7, param4);
                return;
              }
            } else {
              h.a(param3, param5, eh.field_f, param6, param0, param4, -13612, param7, param2);
              return;
            }
          }
        }
    }

    cn() {
        ((cn) this).field_J = new byte[4096];
        ((cn) this).field_n = new byte[256];
        ((cn) this).field_I = new byte[6][258];
        ((cn) this).field_u = new boolean[16];
        ((cn) this).field_r = new byte[18002];
        ((cn) this).field_h = new boolean[256];
        ((cn) this).field_H = 0;
        ((cn) this).field_a = new int[6][258];
        ((cn) this).field_l = new int[16];
        ((cn) this).field_x = new int[6][258];
        ((cn) this).field_w = new int[6];
        ((cn) this).field_p = new int[257];
        ((cn) this).field_k = new int[6][258];
        ((cn) this).field_m = 0;
        ((cn) this).field_E = new int[256];
        ((cn) this).field_f = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "No Achievements";
        field_F = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
