/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc extends u {
    private int field_gb;
    private int field_Z;
    private ge field_db;
    private int field_fb;
    private n field_X;
    private int field_cb;
    static e field_ib;
    static hj field_ab;
    static int field_bb;
    private int field_Y;
    private he field_eb;
    static String field_hb;

    final void b(boolean param0) {
        if (null == ((dc) this).field_db) {
            super.b(param0);
            return;
        }
        if (((dc) this).field_db != hn.field_G) {
            ((dc) this).b(537342017, ((dc) this).field_X.field_x + 12, 12 - (-((dc) this).field_Z + -((dc) this).field_X.field_u));
            int discarded$0 = -100;
            this.d(((dc) this).field_X);
        } else {
            ((dc) this).field_db = null;
            ((dc) this).field_eb.field_F = 256;
            super.b(param0);
            return;
        }
        ((dc) this).field_db = null;
        ((dc) this).field_eb.field_F = 256;
        super.b(param0);
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (null != ((dc) this).field_db) {
          if (((dc) this).field_db != dg.field_a) {
            if (hn.field_G == ((dc) this).field_db) {
              int fieldTemp$2 = ((dc) this).field_gb + 1;
              ((dc) this).field_gb = ((dc) this).field_gb + 1;
              if (((dc) this).field_cb == fieldTemp$2) {
                ((dc) this).field_db = null;
                ((dc) this).field_eb.field_F = 256;
                return super.g((byte) 39);
              } else {
                ((dc) this).field_eb.field_F = (((dc) this).field_gb << 8) / ((dc) this).field_cb;
                return super.g((byte) 39);
              }
            } else {
              return super.g((byte) 39);
            }
          } else {
            int fieldTemp$3 = ((dc) this).field_gb + 1;
            ((dc) this).field_gb = ((dc) this).field_gb + 1;
            if (((dc) this).field_fb != fieldTemp$3) {
              ((dc) this).field_eb.field_F = -((((dc) this).field_gb << 8) / ((dc) this).field_fb) + 256;
              return super.g((byte) 39);
            } else {
              ((dc) this).field_db = qj.field_M;
              ((dc) this).b(117, 12 - -((dc) this).field_X.field_x, ((dc) this).field_Y, 12 + (((dc) this).field_Z - -((dc) this).field_X.field_u));
              ((dc) this).field_gb = 0;
              ((dc) this).field_eb.field_F = 0;
              return super.g((byte) 39);
            }
          }
        } else {
          return super.g((byte) 39);
        }
    }

    void a(n param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          var3_int = -27 % ((param1 - -38) / 50);
          ((dc) this).field_X = param0;
          if (((dc) this).field_db == qj.field_M) {
            ((dc) this).b(67, 12 - -((dc) this).field_X.field_x, ((dc) this).field_Y, ((dc) this).field_X.field_u + 12 + ((dc) this).field_Z);
            ((dc) this).field_gb = 0;
            return;
          } else {
            if (((dc) this).field_db != dg.field_a) {
              ((dc) this).field_gb = 0;
              ((dc) this).field_db = dg.field_a;
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("dc.HA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    private final void d(n param0) {
        try {
            if (null != ((dc) this).field_eb) {
                ((dc) this).field_eb.d(0);
            }
            if (param0 == null) {
                ((dc) this).field_eb = new he();
            } else {
                param0.a(6, (byte) 122, ((dc) this).field_Z + 6, param0.field_u, param0.field_x);
                ((dc) this).field_eb = new he(param0);
            }
            ((dc) this).a(true, (n) (Object) ((dc) this).field_eb);
            ((dc) this).field_X = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "dc.IA(" + (param0 != null ? "{...}" : "null") + 44 + -100 + 41);
        }
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, (byte) -78, param3)) {
              L1: {
                if (null == ((dc) this).field_eb) {
                  break L1;
                } else {
                  L2: {
                    if (param1 != 98) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((dc) this).field_eb.a(param0, -25823);
                      break L2;
                    }
                  }
                  if (param1 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((dc) this).field_eb.a(param0, -25823);
                    return false;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("dc.T(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + -78 + 44 + param3 + 41);
        }
        return stackIn_9_0 != 0;
    }

    public static void c() {
        field_hb = null;
        field_ib = null;
        field_ab = null;
    }

    final static int m(int param0) {
        if (param0 != 29675) {
            int discarded$0 = 0;
            dc.c();
            return ua.field_a;
        }
        return ua.field_a;
    }

    final boolean a(boolean param0) {
        ((dc) this).b(false);
        if (!param0) {
            ((dc) this).field_fb = 23;
            return super.a(param0);
        }
        return super.a(param0);
    }

    final void k(int param0) {
        Object var3 = null;
        if (dg.field_a != ((dc) this).field_db) {
          ((dc) this).field_gb = 0;
          ((dc) this).field_db = hn.field_G;
          if (param0 >= -100) {
            var3 = null;
            ((dc) this).a((n) null, (byte) -61);
            int discarded$4 = -100;
            this.d(((dc) this).field_X);
            ((dc) this).field_X = null;
            ((dc) this).field_eb.field_F = 0;
            return;
          } else {
            int discarded$5 = -100;
            this.d(((dc) this).field_X);
            ((dc) this).field_X = null;
            ((dc) this).field_eb.field_F = 0;
            return;
          }
        } else {
          return;
        }
    }

    dc(qj param0, n param1, int param2, int param3, int param4) {
        super(param0, param1.field_x + 12, param1.field_u + (param2 + 12));
        try {
            ((dc) this).field_Y = param4;
            ((dc) this).field_cb = param3;
            ((dc) this).field_fb = param3;
            ((dc) this).field_Z = param2;
            int discarded$0 = -100;
            this.d(param1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "dc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static hn a(float param0, int param1, float param2, hn param3) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        hn var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var4_float = param3.field_E + (param3.field_I - param3.field_E) * param0;
          var5 = param3.field_E + (-param3.field_E + param3.field_I) * param2;
          var6 = new hn(param3.field_U, param3.field_z, var4_float, var5, param3.field_k, param3.field_N, param3.field_B, param3.field_P, param3.field_L, param3.field_F, param3.field_Q, param3.field_H, param3.field_w, param3.field_s, param3.field_m, param3.field_x, param3.field_t, param3.field_q);
          var6.field_A = (param3.field_K - param3.field_A) * param0 + param3.field_A;
          var6.field_o = param3.field_o;
          var6.field_K = (-param3.field_A + param3.field_K) * param2 + param3.field_A;
          return var6;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("dc.GA(").append(param0).append(44).append(-18895).append(44).append(param2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = new e(12, 0, 1, 0);
        field_hb = "Error connecting to server. Please try using a different server.";
    }
}
