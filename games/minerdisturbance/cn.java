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
        String var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param3.a(false, param2, param0);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          im.a(param1 ^ -339, var6);
          if (param1 != 258) {
            var5 = (String) null;
            cn.a((java.applet.Applet) null, (String) null, -57, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("cn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_v = null;
        if (param0 < -107) {
          field_g = null;
          field_K = null;
          field_F = null;
          return;
        }
        field_C = 7;
        field_g = null;
        field_K = null;
        field_F = null;
    }

    final static void a(java.applet.Applet param0, String param1, int param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 != 11050) {
              return;
            }
            if (vf.field_j.startsWith("win") &&
              uh.a((byte) 115, param1)) {
              return;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              di.a((Throwable) null, 1, "MGR1: " + param1);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var4_ref;
            stackIn_13_1 = new StringBuilder().append("cn.B(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = MinerDisturbance.field_ab;
        if (param1 == 0) {
          if (param3 > param5) {
            if (param0 > param3) {
              h.a(param3, param5, eh.field_f, param6, param0, param4, -13612, param7, param2);
              return;
            }
            if (param5 >= param0) {
              h.a(param5, param0, eh.field_f, param2, param3, param6, param1 - 13612, param7, param4);
              return;
            }
            h.a(param0, param5, eh.field_f, param4, param3, param6, -13612, param7, param2);
            return;
          }
          if (param5 < param0) {
            h.a(param5, param3, eh.field_f, param2, param0, param4, -13612, param7, param6);
            return;
          }
          if (param3 < param0) {
            h.a(param0, param3, eh.field_f, param4, param5, param2, param1 ^ -13612, param7, param6);
            return;
          }
          h.a(param3, param0, eh.field_f, param6, param5, param2, -13612, param7, param4);
          return;
        }
        bj var10 = (bj) null;
        cn.a(-102, -75, -127, (bj) null);
        if (param3 > param5) {
          if (param0 > param3) {
            h.a(param3, param5, eh.field_f, param6, param0, param4, -13612, param7, param2);
            return;
          }
          if (param5 >= param0) {
            h.a(param5, param0, eh.field_f, param2, param3, param6, param1 - 13612, param7, param4);
            return;
          }
          h.a(param0, param5, eh.field_f, param4, param3, param6, -13612, param7, param2);
          return;
        }
        if (param5 < param0) {
          h.a(param5, param3, eh.field_f, param2, param0, param4, -13612, param7, param6);
          return;
        }
        if (param3 < param0) {
          h.a(param0, param3, eh.field_f, param4, param5, param2, param1 ^ -13612, param7, param6);
          return;
        }
        h.a(param3, param0, eh.field_f, param6, param5, param2, -13612, param7, param4);
    }

    cn() {
        this.field_J = new byte[4096];
        this.field_n = new byte[256];
        this.field_I = new byte[6][258];
        this.field_u = new boolean[16];
        this.field_r = new byte[18002];
        this.field_h = new boolean[256];
        this.field_H = 0;
        this.field_a = new int[6][258];
        this.field_l = new int[16];
        this.field_x = new int[6][258];
        this.field_w = new int[6];
        this.field_p = new int[257];
        this.field_k = new int[6][258];
        this.field_m = 0;
        this.field_E = new int[256];
        this.field_f = new byte[18002];
    }

    static {
        field_K = "No Achievements";
        field_F = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
