/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    int field_C;
    static ha field_v;
    boolean[] field_n;
    byte[][] field_e;
    int field_f;
    byte[] field_B;
    int field_m;
    int[] field_A;
    int field_h;
    byte[] field_c;
    int field_o;
    int field_i;
    int field_b;
    byte[] field_G;
    int field_E;
    int[] field_g;
    int field_F;
    int field_u;
    int field_w;
    int field_l;
    byte[] field_a;
    int[][] field_p;
    int[] field_k;
    int[][] field_j;
    int field_t;
    boolean[] field_d;
    byte[] field_r;
    int[][] field_y;
    byte[] field_q;
    byte field_z;
    static int field_s;
    int field_D;
    int field_x;
    int[] field_H;

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_15_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = Bounce.field_N;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param1.getParameter("cookieprefix");
                    if (param0) {
                      var3 = var9 + "settings";
                      var4 = (String) (ac.a(param1, "getcookies", -31185));
                      var5 = di.a(-116, ';', var4);
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                break L3;
                              } else {
                                stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    if (jg.field_B == null) {
                      stackIn_17_0 = param1.getParameter("settings");
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      stackIn_15_0 = jg.field_B;
                      decompiledRegionSelector1 = 0;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref);

                stackIn_20_1 = new StringBuilder().append("uj.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L5;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L5;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_3_0;
                } else {
                  return stackIn_9_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_v = null;
        if (param0 <= 36) {
            field_s = -35;
        }
    }

    uj() {
        this.field_n = new boolean[16];
        this.field_G = new byte[4096];
        this.field_c = new byte[18002];
        this.field_B = new byte[18002];
        this.field_e = new byte[6][258];
        this.field_g = new int[6];
        this.field_j = new int[6][258];
        this.field_a = new byte[256];
        this.field_p = new int[6][258];
        this.field_y = new int[6][258];
        this.field_t = 0;
        this.field_d = new boolean[256];
        this.field_k = new int[16];
        this.field_H = new int[257];
        this.field_A = new int[256];
        this.field_C = 0;
    }

    static {
    }
}
