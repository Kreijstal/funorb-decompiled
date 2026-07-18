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
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                  var4 = (Object) (Object) uj.field_m;
                  synchronized (var4) {
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("kh.FB(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (!(param1 != -1)) {
            ((kh) this).field_W = param0;
            return;
        }
        super.a(param0, param1, (byte) -113);
        if (param2 >= -47) {
            Object var5 = null;
            kh.a((ji) null, 55, (byte) -98, false);
        }
        ((kh) this).field_db[param1] = param0 << 12;
    }

    private final synchronized void b(int param0, int param1, int param2, int param3) {
        ((kh) this).field_Z = false;
        if (!(null != ((kh) this).field_gb)) {
            ((kh) this).field_gb = new mn();
        }
        ((kh) this).field_gb.field_d[param0] = param3;
        int var5 = ((kh) this).field_db[param0];
        int var6 = (((kh) this).field_gb.field_d[param0] << 12) - var5;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (!(0 <= var6)) {
            var9 = 1;
            var6 = -var6;
        }
        if (var6 > 0) {
            var8 = (1 + var6) / (1 + param1);
        }
        ((kh) this).field_Y[param0] = var9 != 0 ? -var8 : var8;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = ((kh) this).g(122);
              ((kh) this).b((byte) -58, var4_int * ((kh) this).field_W >> 8);
              super.b(param0, param1, param2);
              if (((kh) this).field_Z) {
                break L1;
              } else {
                var5 = 1;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 16) {
                    if (var5 != 0) {
                      ((kh) this).field_Z = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L3: {
                      var7 = ((kh) this).field_Y[var6];
                      if (0 != var7) {
                        L4: {
                          ((kh) this).field_db[var6] = ((kh) this).field_db[var6] + var7 * param2;
                          var8 = ((kh) this).field_gb.field_d[var6];
                          if (var8 <= ((kh) this).field_db[var6] >> 12) {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            break L4;
                          } else {
                            stackOut_7_0 = 1;
                            stackIn_9_0 = stackOut_7_0;
                            break L4;
                          }
                        }
                        L5: {
                          stackOut_9_0 = stackIn_9_0;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var7 <= 0) {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            break L5;
                          } else {
                            stackOut_10_0 = stackIn_10_0;
                            stackOut_10_1 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            break L5;
                          }
                        }
                        L6: {
                          if ((stackIn_12_0 ^ stackIn_12_1) != 0) {
                            ((kh) this).field_Y[var6] = 0;
                            ((kh) this).field_db[var6] = var8 << 12;
                            break L6;
                          } else {
                            var5 = 0;
                            break L6;
                          }
                        }
                        super.a(((kh) this).field_db[var6] >> 12, var6, (byte) -53);
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
            ((kh) this).b((byte) 55, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("kh.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(mn param0, int param1, int param2) {
        int var4_int = 0;
        try {
            if (param2 != -1702) {
                Object var5 = null;
                ((kh) this).a(false, (byte) 48, false, (ji) null);
            }
            var4_int = param1 * ug.field_g / 1000;
            this.a(var4_int, -17, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "kh.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        for (var2 = 0; var2 < 16; var2++) {
            ((kh) this).field_db[var2] = 1048576;
        }
        super.a(256, -1, (byte) -107);
    }

    public static void a(byte param0) {
        field_ab = null;
        field_hb = null;
        field_eb = null;
        field_ib = null;
        field_fb = null;
        field_X = null;
        field_Q = null;
        field_cb = null;
        field_U = null;
        field_V = null;
        field_bb = null;
    }

    public kh() {
        ((kh) this).field_db = new int[16];
        ((kh) this).field_Y = new int[16];
        ((kh) this).field_W = 256;
        this.h(381);
    }

    private final synchronized void a(int param0, int param1, mn param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            ((kh) this).field_gb = param2;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= 16) {
                break L0;
              } else {
                this.b(var4_int, param0, 111, ((kh) this).field_gb.field_d[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kh.EB(").append(param0).append(',').append(-17).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    kh(w param0) {
        super(param0);
        ((kh) this).field_db = new int[16];
        ((kh) this).field_Y = new int[16];
        ((kh) this).field_W = 256;
        try {
            this.h(381);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        try {
            if (param1 < 123) {
                Object var6 = null;
                kh.a((ji) null, -112, (byte) 83, true);
            }
            this.h(381);
            super.a(param0, (byte) 125, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "kh.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "No highscores";
        field_Q = new boolean[8];
        field_cb = new boolean[field_Q.length];
        field_U = new int[]{1, 0};
        field_ib = new int[4];
        field_ab = new ia();
        field_fb = new String[][]{new String[11], new String[10]};
        field_hb = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_V = "You found a secret area! There are many areas that don't appear on your scans. Keep your eyes peeled.";
    }
}
