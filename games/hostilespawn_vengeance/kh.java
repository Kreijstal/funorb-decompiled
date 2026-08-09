/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends w {
    static String field_X;
    private boolean field_Z;
    static boolean[] field_Q;
    private int[] field_db;
    private mn field_gb;
    static boolean[] field_cb;
    private int[] field_Y;
    private int field_W;
    static ia field_ab;
    static int[] field_ib;
    static int[] field_U;
    static int[] field_bb;
    static String[][] field_fb;
    static java.lang.reflect.Method field_eb;
    static String field_V;
    static char[] field_hb;

    final static void a(ji param0, int param1, byte param2, boolean param3) {
        Object var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            L1: {
              if (ha.field_w != null) {
                r.a(1048576, 14654, param0, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 == -105) {
              L2: {
                if (uh.field_l == null) {
                  break L2;
                } else {
                  var4_ref = uj.field_m;
                  synchronized (var4_ref) {
                    L3: {
                      uh.field_l.a(param1, -1, (byte) -77);
                      if (param0 != id.field_t) {
                        L4: {
                          uh.field_l.e(param2 ^ -4580);
                          uj.field_m.e();
                          id.field_t = param0;
                          if (null == id.field_t) {
                            break L4;
                          } else {
                            uh.field_l.a(param3, (byte) 38, id.field_t);
                            break L4;
                          }
                        }
                        break L3;
                      } else {
                        return;
                      }
                    }
                  }
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref2);

            stackIn_19_1 = new StringBuilder().append("kh.FB(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (!(0 != (param1 ^ -1))) {
            this.field_W = param0;
            return;
        }
        super.a(param0, param1, (byte) -113);
        if (param2 >= -47) {
            ji var5 = (ji) null;
            kh.a((ji) null, 55, (byte) -98, false);
        }
        this.field_db[param1] = param0 << -1846097044;
    }

    private final synchronized void b(int param0, int param1, int param2, int param3) {
        this.field_Z = false;
        if (!(null != this.field_gb)) {
            this.field_gb = new mn();
        }
        this.field_gb.field_d[param0] = param3;
        int var5 = this.field_db[param0];
        int var6 = (this.field_gb.field_d[param0] << 786661388) - var5;
        int var7 = -97 % ((param2 - 58) / 42);
        int var8 = 0;
        int var9 = 0;
        if (!(0 <= var6)) {
            var9 = 1;
            var6 = -var6;
        }
        if (-1 > (var6 ^ -1)) {
            var8 = (1 + var6) / (1 + param1);
        }
        this.field_Y[param0] = var9 != 0 ? -var8 : var8;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.g(122);
              this.b((byte) -58, var4_int * this.field_W >> -285476600);
              super.b(param0, param1, param2);
              if (this.field_Z) {
                break L1;
              } else {
                var5 = 1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 16) {
                    if (var5 != 0) {
                      this.field_Z = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L3: {
                      var7 = this.field_Y[var6];
                      if (0 != var7) {
                        L4: {
                          this.field_db[var6] = this.field_db[var6] + var7 * param2;
                          var8 = this.field_gb.field_d[var6];
                          if (var8 <= this.field_db[var6] >> 263823980) {
                            stackIn_9_0 = 0;
                            break L4;
                          } else {
                            stackIn_9_0 = 1;
                            break L4;
                          }
                        }
                        L5: {


                          if ((var7 ^ -1) >= -1) {

                            stackIn_12_1 = 0;
                            break L5;
                          } else {

                            stackIn_12_1 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          if ((stackIn_9_0 ^ stackIn_12_1) != 0) {
                            this.field_Y[var6] = 0;
                            this.field_db[var6] = var8 << 1103738220;
                            break L6;
                          } else {
                            var5 = 0;
                            break L6;
                          }
                        }
                        super.a(this.field_db[var6] >> 1776273356, var6, (byte) -53);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
            this.b((byte) 55, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("kh.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(mn param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param2 != -1702) {
                ji var5 = (ji) null;
                this.a(false, (byte) 48, false, (ji) null);
            }
            var4_int = param1 * ug.field_g / 1000;
            this.a(var4_int, -17, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kh.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        for (var2 = 0; -17 < (var2 ^ -1); var2++) {
            this.field_db[var2] = 1048576;
        }
        if (param0 != 381) {
            field_bb = (int[]) null;
        }
        super.a(256, -1, (byte) -107);
    }

    public static void a(byte param0) {
        field_ab = null;
        field_hb = null;
        field_eb = null;
        field_ib = null;
        field_fb = (String[][]) null;
        field_X = null;
        field_Q = null;
        field_cb = null;
        field_U = null;
        if (param0 > -29) {
            field_Q = (boolean[]) null;
        }
        field_V = null;
        field_bb = null;
    }

    public kh() {
        this.field_db = new int[16];
        this.field_Y = new int[16];
        this.field_W = 256;
        this.h(381);
    }

    private final synchronized void a(int param0, int param1, mn param2) {
        int var4_int = 0;
        int var5 = 0;
        ji var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            this.field_gb = param2;
            var4_int = 0;
            L1: while (true) {
              if ((var4_int ^ -1) <= -17) {
                L2: {
                  if (param1 == -17) {
                    break L2;
                  } else {
                    var6 = (ji) null;
                    kh.a((ji) null, -104, (byte) -19, false);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.b(var4_int, param0, param1 ^ -128, this.field_gb.field_d[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("kh.EB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    kh(w param0) {
        super(param0);
        this.field_db = new int[16];
        this.field_Y = new int[16];
        this.field_W = 256;
        try {
            this.h(381);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        try {
            if (param1 < 123) {
                ji var6 = (ji) null;
                kh.a((ji) null, -112, (byte) 83, true);
            }
            this.h(381);
            super.a(param0, (byte) 125, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "kh.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_X = "No highscores";
        field_Q = new boolean[8];
        field_cb = new boolean[field_Q.length];
        field_U = new int[]{1, 0};
        field_ib = new int[4];
        field_ab = new ia();
        field_fb = new String[][]{new String[]{"Power Cut", "Control", "Self Destruct", "Entrance", "Destruction", "Security", "Infiltration", "The Hive", "Regicide", "Escape", ""}, new String[]{"Medical", "Lockdown", "Breach", "Infest Station", "Bridge", "Nightmare", "Invasion", "Torment", "Planet-side", "Hostile Revenant"}};
        field_hb = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_V = "You found a secret area! There are many areas that don't appear on your scans. Keep your eyes peeled.";
    }
}
