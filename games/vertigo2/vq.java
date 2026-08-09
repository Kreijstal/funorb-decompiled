/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static lg field_i;
    int[] field_D;
    byte[] field_K;
    static String field_p;
    int field_A;
    int field_d;
    int field_E;
    int field_w;
    int field_e;
    int[] field_m;
    int field_H;
    static int[] field_q;
    int field_y;
    int field_t;
    int[] field_b;
    static int field_r;
    int field_l;
    int[] field_G;
    byte field_n;
    byte[] field_J;
    boolean[] field_g;
    static String field_k;
    int[][] field_I;
    boolean[] field_o;
    int field_C;
    int field_s;
    int field_v;
    byte[] field_F;
    byte[] field_f;
    int field_u;
    int[][] field_a;
    int[][] field_h;
    int field_x;
    int field_B;
    byte[][] field_z;
    byte[] field_c;
    byte[] field_j;

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        java.applet.Applet var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                var5 = (java.applet.Applet) null;
                vq.a((java.applet.Applet) null, (byte) 54);
                break L1;
              }
            }
            var6 = eb.field_g;
            var1 = var6;
            var2 = 0;
            var3 = var6.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "vq.B(" + param0 + ')');
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 > 84) {
                        break L2;
                      } else {
                        field_r = 66;
                        break L2;
                      }
                    }
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (je.a(param0, false, "getcookies"));
                    var5 = jr.a((byte) -9, ';', var4);
                    var6 = 0;
                    L3: while (true) {
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var7 = var5[var6].indexOf('=');
                          if ((var7 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (var5[var6].substring(0, var7).trim().equals(var3)) {
                              stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null != v.field_b) {
                    stackIn_16_0 = v.field_b;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param0.getParameter("settings");
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("vq.A(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_16_0;
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_i = null;
        int var1 = 26 % ((47 - param0) / 63);
        field_p = null;
        field_q = null;
    }

    vq() {
        this.field_K = new byte[18002];
        this.field_m = new int[16];
        this.field_D = new int[257];
        this.field_o = new boolean[256];
        this.field_F = new byte[18002];
        this.field_v = 0;
        this.field_I = new int[6][258];
        this.field_g = new boolean[16];
        this.field_f = new byte[4096];
        this.field_h = new int[6][258];
        this.field_G = new int[256];
        this.field_u = 0;
        this.field_z = new byte[6][258];
        this.field_b = new int[6];
        this.field_c = new byte[256];
        this.field_a = new int[6][258];
    }

    static {
        field_q = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_p = "Names cannot start or end with space or underscore";
        field_k = "Level <%0> - Unlucky!";
        field_r = 0;
    }
}
