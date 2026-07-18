/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;

final class ne extends ka {
    private float[] field_k;
    private byte[] field_q;
    private short[] field_E;
    private od field_i;
    private short[] field_G;
    private uia[] field_D;
    private int field_w;
    private int field_u;
    private short field_t;
    private short[] field_g;
    private int field_d;
    private short[] field_b;
    private short[] field_A;
    private short[] field_n;
    private dga[] field_r;
    private short[] field_l;
    private short field_C;
    private short field_j;
    private int[] field_a;
    static String field_m;
    private int field_B;
    private short[] field_h;
    private int[] field_H;
    static boolean field_v;
    private int[][] field_K;
    private short field_e;
    private int[] field_s;
    private short[] field_c;
    private float[] field_J;
    private int field_f;
    private byte[] field_z;
    private boolean field_p;
    private int field_o;
    private int[] field_F;
    private int field_x;
    private int[] field_y;
    private short[] field_I;

    final void O(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (((ne) this).field_f <= var4) {
            L1: {
              if (((ne) this).field_i == null) {
                break L1;
              } else {
                break L1;
              }
            }
            ((ne) this).field_p = false;
            return;
          } else {
            L2: {
              if (param0 != 128) {
                ((ne) this).field_y[var4] = param0 * ((ne) this).field_y[var4] >> 7;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 128) {
                break L3;
              } else {
                ((ne) this).field_a[var4] = param1 * ((ne) this).field_a[var4] >> 7;
                break L3;
              }
            }
            if (param2 != 128) {
              ((ne) this).field_s[var4] = param2 * ((ne) this).field_s[var4] >> 7;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final short a(byte param0, int param1, int param2, int param3, float param4, int param5, long param6, int param7, cbb param8, float param9) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        short stackIn_7_0 = 0;
        short stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_6_0 = 0;
        short stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var12_int = ((ne) this).field_H[param7];
            var13 = ((ne) this).field_H[param7 - -1];
            var14 = 0;
            var15 = var12_int;
            L1: while (true) {
              L2: {
                if (var15 >= var13) {
                  break L2;
                } else {
                  var16 = ((ne) this).field_c[var15];
                  if (var16 != 0) {
                    if (fgb.field_m[var15] != param6) {
                      var15++;
                      continue L1;
                    } else {
                      stackOut_6_0 = (short)(-1 + var16);
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  } else {
                    var14 = var15;
                    break L2;
                  }
                }
              }
              L3: {
                ((ne) this).field_c[var14] = (short)(((ne) this).field_x - -1);
                fgb.field_m[var14] = param6;
                ((ne) this).field_I[((ne) this).field_x] = (short)param1;
                ((ne) this).field_h[((ne) this).field_x] = (short)param2;
                ((ne) this).field_A[((ne) this).field_x] = (short)param5;
                ((ne) this).field_z[((ne) this).field_x] = (byte)param3;
                ((ne) this).field_J[((ne) this).field_x] = param9;
                ((ne) this).field_k[((ne) this).field_x] = param4;
                if (param0 >= 109) {
                  break L3;
                } else {
                  ((ne) this).field_G = null;
                  break L3;
                }
              }
              int fieldTemp$1 = ((ne) this).field_x;
              ((ne) this).field_x = ((ne) this).field_x + 1;
              stackOut_11_0 = (short)fieldTemp$1;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var12;
            stackOut_13_1 = new StringBuilder().append("ne.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param8 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param9 + ')');
        }
        return stackIn_12_0;
    }

    final void H(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ne) this).field_f) {
            L1: {
              if (null == ((ne) this).field_i) {
                break L1;
              } else {
                break L1;
              }
            }
            ((ne) this).field_p = false;
            return;
          } else {
            L2: {
              if (0 != param0) {
                ((ne) this).field_y[var4] = ((ne) this).field_y[var4] + param0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != 0) {
                ((ne) this).field_a[var4] = ((ne) this).field_a[var4] + param1;
                break L3;
              } else {
                break L3;
              }
            }
            if (param2 != 0) {
              ((ne) this).field_s[var4] = ((ne) this).field_s[var4] + param2;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final int G() {
        if (!(((ne) this).field_p)) {
            int discarded$0 = -10;
            this.a();
        }
        return ((ne) this).field_j;
    }

    final int V() {
        if (!(((ne) this).field_p)) {
            int discarded$0 = -10;
            this.a();
        }
        return ((ne) this).field_C;
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        L0: while (true) {
          if (((ne) this).field_f <= var10) {
            ((ne) this).field_C = (short)var2;
            ((ne) this).field_j = (short)var7;
            ((ne) this).field_e = (short)var5;
            ((ne) this).field_t = (short)var4;
            ((ne) this).field_p = true;
            return;
          } else {
            L1: {
              var11 = ((ne) this).field_y[var10];
              var12 = ((ne) this).field_a[var10];
              if (var11 <= var5) {
                break L1;
              } else {
                var5 = var11;
                break L1;
              }
            }
            L2: {
              if (var12 >= var3) {
                break L2;
              } else {
                var3 = var12;
                break L2;
              }
            }
            L3: {
              if (var11 < var2) {
                var2 = var11;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var13 = ((ne) this).field_s[var10];
              if (var12 > var6) {
                var6 = var12;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var13 < var4) {
                var4 = var13;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var13 <= var7) {
                break L6;
              } else {
                var7 = var13;
                break L6;
              }
            }
            L7: {
              var14 = var11 * var11 + var13 * var13;
              if (var8 < var14) {
                var8 = var14;
                break L7;
              } else {
                break L7;
              }
            }
            var14 = var13 * var13 + (var11 * var11 + var12 * var12);
            if (var9 < var14) {
              var9 = var14;
              var10++;
              continue L0;
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 97) {
                break L1;
              } else {
                var12 = null;
                java.net.URL discarded$15 = ne.a((java.net.URL) null, (byte) 9, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              var4_int = param3.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param3.indexOf((int) param0, var8_int);
                  if (var8_int < 0) {
                    break L2;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param3.indexOf((int) param0, var9);
              if (var10 >= 0) {
                StringBuilder discarded$16 = var8.append(param3.substring(var9, var10));
                StringBuilder discarded$17 = var8.append(param2);
                var9 = 1 + var10;
                continue L4;
              } else {
                StringBuilder discarded$18 = var8.append(param3.substring(var9));
                stackOut_12_0 = var8.toString();
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ne.J(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final static java.net.URL a(java.net.URL param0, byte param1, java.applet.Applet param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        Object var5 = null;
        java.net.URL stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -60 / ((param1 - -49) / 39);
              var4 = null;
              if (nga.field_e == null) {
                break L1;
              } else {
                if (!nga.field_e.equals((Object) (Object) param2.getParameter("settings"))) {
                  var4 = (Object) (Object) nga.field_e;
                  var5 = var4;
                  var5 = var4;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = null;
              if (cta.field_p == null) {
                break L2;
              } else {
                if (cta.field_p.equals((Object) (Object) param2.getParameter("session"))) {
                  break L2;
                } else {
                  var5 = (Object) (Object) cta.field_p;
                  break L2;
                }
              }
            }
            stackOut_7_0 = mpb.a(-1, param0, (byte) 50, (String) var4, (String) var5);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ne.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final int HA() {
        if (!(((ne) this).field_p)) {
            int discarded$0 = -10;
            this.a();
        }
        return ((ne) this).field_t;
    }

    final int RA() {
        if (!(((ne) this).field_p)) {
            int discarded$0 = -10;
            this.a();
        }
        return ((ne) this).field_e;
    }

    public static void a(int param0) {
        field_m = null;
    }

    final static boolean a(boolean param0) {
        L0: {
          if (null != pqa.field_o) {
            break L0;
          } else {
            pqa.field_o = cp.field_n.a(pcb.field_p, ff.field_p, -122);
            break L0;
          }
        }
        if (pqa.field_o.field_f != 0) {
          L1: {
            long dupTemp$2 = wt.a(false);
            bgb.field_o = dupTemp$2;
            cbb.field_q = dupTemp$2;
            if (1 != pqa.field_o.field_f) {
              break L1;
            } else {
              break L1;
            }
          }
          tc.field_c = rta.field_o;
          pqa.field_o = null;
          return true;
        } else {
          return false;
        }
    }

    ne(qfa param0) {
        ((ne) this).field_B = 0;
        ((ne) this).field_f = 0;
        ((ne) this).field_d = 0;
        ((ne) this).field_p = false;
        ((ne) this).field_x = 0;
        try {
            ((ne) this).field_i = new od((uq) null, 5126, 3, 0);
            od discarded$0 = new od((uq) null, 5126, 2, 0);
            od discarded$1 = new od((uq) null, 5126, 3, 0);
            od discarded$2 = new od((uq) null, 5121, 4, 0);
            dgb discarded$3 = new dgb();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ne(qfa param0, cbb param1, int param2, int param3, int param4, int param5) {
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        opa var10_ref_opa = null;
        int var11_int = 0;
        mmb[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        dea[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        bqa var20_ref_bqa = null;
        int var20 = 0;
        sr var21_ref_sr = null;
        int var21 = 0;
        int var22_int = 0;
        float var22 = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        dea var31_ref_dea = null;
        int var32_int = 0;
        long var32_long = 0L;
        dea var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        int var39 = 0;
        float var39_float = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43_float = 0.0f;
        int var43 = 0;
        float var44_float = 0.0f;
        int var44 = 0;
        float var45_float = 0.0f;
        int var45 = 0;
        float var46_float = 0.0f;
        int var46 = 0;
        float var47_float = 0.0f;
        int var47 = 0;
        float var48_float = 0.0f;
        int var48 = 0;
        float var49_float = 0.0f;
        int var49 = 0;
        float var50_float = 0.0f;
        int var50 = 0;
        float var51_float = 0.0f;
        int var51 = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int[] var64 = null;
        d var65 = null;
        opa var66 = null;
        opa var67 = null;
        long[] var68 = null;
        bqa var69 = null;
        sr var70 = null;
        mmb var71 = null;
        mmb var72 = null;
        mmb var73 = null;
        opa var74 = null;
        kua var75 = null;
        mmb var77 = null;
        mmb var78 = null;
        mmb var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        long[] var82 = null;
        int[] var84 = null;
        int[] var85 = null;
        long[] var86 = null;
        int[] var88 = null;
        int[] var89 = null;
        long[] var90 = null;
        float[] var91 = null;
        int[] var92 = null;
        int stackIn_24_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_111_0 = 0;
        long stackIn_165_0 = 0L;
        int stackIn_165_1 = 0;
        long stackIn_166_0 = 0L;
        int stackIn_166_1 = 0;
        long stackIn_167_0 = 0L;
        int stackIn_167_1 = 0;
        int stackIn_167_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_72_0 = 0;
        byte stackOut_72_1 = 0;
        int stackOut_110_0 = 0;
        short stackOut_109_0 = 0;
        long stackOut_164_0 = 0L;
        int stackOut_164_1 = 0;
        long stackOut_166_0 = 0L;
        int stackOut_166_1 = 0;
        int stackOut_166_2 = 0;
        long stackOut_165_0 = 0L;
        int stackOut_165_1 = 0;
        int stackOut_165_2 = 0;
        byte stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        L0: {
          ((ne) this).field_B = 0;
          ((ne) this).field_f = 0;
          ((ne) this).field_d = 0;
          ((ne) this).field_p = false;
          ((ne) this).field_x = 0;
          ((ne) this).field_w = param2;
          ((ne) this).field_u = param5;
          if (!lgb.a(param5, 82, param2)) {
            break L0;
          } else {
            ((ne) this).field_i = new od((uq) null, 5126, 3, 0);
            break L0;
          }
        }
        L1: {
          if (!mq.a(param5, param2, false)) {
            break L1;
          } else {
            od discarded$13 = new od((uq) null, 5126, 2, 0);
            break L1;
          }
        }
        L2: {
          if (!toa.a(-8636, param2, param5)) {
            break L2;
          } else {
            od discarded$14 = new od((uq) null, 5126, 3, 0);
            break L2;
          }
        }
        L3: {
          if (!rb.a(-6070, param5, param2)) {
            break L3;
          } else {
            od discarded$15 = new od((uq) null, 5121, 4, 0);
            break L3;
          }
        }
        L4: {
          if (!dwa.a(param2, param5, false)) {
            break L4;
          } else {
            dgb discarded$16 = new dgb();
            break L4;
          }
        }
        var65 = param0.field_a;
        ((ne) this).field_H = new int[param1.field_D + 1];
        var89 = new int[param1.field_j];
        var85 = var89;
        var81 = var85;
        var64 = var81;
        var8 = var64;
        var9_int = 0;
        L5: while (true) {
          if (var9_int >= param1.field_j) {
            L6: {
              ((ne) this).field_d = ((ne) this).field_B;
              var90 = new long[((ne) this).field_B];
              var86 = var90;
              var82 = var86;
              var68 = var82;
              var9 = var68;
              if (0 == (256 & ((ne) this).field_w)) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L6;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
                break L6;
              }
            }
            var10 = stackIn_24_0;
            var11_int = 0;
            L7: while (true) {
              if (((ne) this).field_B <= var11_int) {
                L8: {
                  kn.a((byte) -24, var89, var90);
                  ((ne) this).field_s = param1.field_x;
                  ((ne) this).field_y = param1.field_v;
                  ((ne) this).field_f = param1.field_D;
                  ((ne) this).field_a = param1.field_G;
                  var11 = new mmb[((ne) this).field_f];
                  if (param1.field_g == null) {
                    break L8;
                  } else {
                    ((ne) this).field_o = param1.field_g.length;
                    ((ne) this).field_r = new dga[((ne) this).field_o];
                    ((ne) this).field_D = new uia[((ne) this).field_o];
                    var12 = 0;
                    L9: while (true) {
                      if (((ne) this).field_o <= var12) {
                        break L8;
                      } else {
                        var69 = param1.field_g[var12];
                        int discarded$17 = 0;
                        var70 = jm.a(var69.field_e);
                        var15_int = -1;
                        var16 = 0;
                        L10: while (true) {
                          L11: {
                            if (((ne) this).field_B <= var16) {
                              break L11;
                            } else {
                              if (var89[var16] != var69.field_b) {
                                var16++;
                                continue L10;
                              } else {
                                var15_int = var16;
                                break L11;
                              }
                            }
                          }
                          if (-1 != var15_int) {
                            L12: {
                              var16 = klb.field_o[65535 & param1.field_b[var69.field_b]] & 16777215;
                              stackOut_71_0 = var16;
                              stackIn_73_0 = stackOut_71_0;
                              stackIn_72_0 = stackOut_71_0;
                              if (param1.field_r == null) {
                                stackOut_73_0 = stackIn_73_0;
                                stackOut_73_1 = 0;
                                stackIn_74_0 = stackOut_73_0;
                                stackIn_74_1 = stackOut_73_1;
                                break L12;
                              } else {
                                stackOut_72_0 = stackIn_72_0;
                                stackOut_72_1 = param1.field_r[var69.field_b];
                                stackIn_74_0 = stackOut_72_0;
                                stackIn_74_1 = stackOut_72_1;
                                break L12;
                              }
                            }
                            var16 = stackIn_74_0 | -stackIn_74_1 + 255 << 24;
                            ((ne) this).field_D[var12] = new uia(var15_int, (int) param1.field_k[var69.field_b], (int) param1.field_o[var69.field_b], (int) param1.field_K[var69.field_b], var70.field_g, var70.field_b, var70.field_e, var70.field_d, var70.field_f, var70.field_a, var70.field_c, var69.field_c);
                            ((ne) this).field_r[var12] = new dga(var16);
                            var12++;
                            continue L9;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  var12 = 3 * ((ne) this).field_B;
                  ((ne) this).field_g = new short[((ne) this).field_B];
                  ((ne) this).field_k = new float[var12];
                  ((ne) this).field_h = new short[var12];
                  ((ne) this).field_c = new short[var12];
                  ((ne) this).field_q = new byte[((ne) this).field_B];
                  fgb.field_m = new long[var12];
                  ((ne) this).field_E = new short[((ne) this).field_B];
                  ((ne) this).field_J = new float[var12];
                  ((ne) this).field_l = new short[((ne) this).field_B];
                  ((ne) this).field_z = new byte[var12];
                  ((ne) this).field_I = new short[var12];
                  ((ne) this).field_b = new short[((ne) this).field_B];
                  ((ne) this).field_A = new short[var12];
                  if (null == param1.field_w) {
                    break L13;
                  } else {
                    ((ne) this).field_G = new short[((ne) this).field_B];
                    break L13;
                  }
                }
                ((ne) this).field_n = new short[((ne) this).field_B];
                var13 = 0;
                var14 = 0;
                L14: while (true) {
                  if (param1.field_D <= var14) {
                    ((ne) this).field_H[param1.field_D] = var13;
                    int discarded$18 = -3;
                    var75 = ao.a(param1, var8, ((ne) this).field_B);
                    var15 = new dea[param1.field_j];
                    var16 = 0;
                    L15: while (true) {
                      if (param1.field_j <= var16) {
                        var16 = 0;
                        L16: while (true) {
                          if (((ne) this).field_B <= var16) {
                            var16 = 0;
                            var17 = -10000;
                            var18 = 0;
                            L17: while (true) {
                              if (((ne) this).field_d <= var18) {
                                ((ne) this).field_F = new int[1 + var16];
                                var17 = -10000;
                                var16 = 0;
                                var18 = 0;
                                L18: while (true) {
                                  if (var18 >= ((ne) this).field_d) {
                                    L19: {
                                      ((ne) this).field_F[var16] = ((ne) this).field_d;
                                      fgb.field_m = null;
                                      ((ne) this).field_I = ioa.a(((ne) this).field_I, 125, ((ne) this).field_x);
                                      ((ne) this).field_h = ioa.a(((ne) this).field_h, 99, ((ne) this).field_x);
                                      ((ne) this).field_A = ioa.a(((ne) this).field_A, 73, ((ne) this).field_x);
                                      int discarded$19 = 5666;
                                      ((ne) this).field_z = sna.a(((ne) this).field_z, ((ne) this).field_x);
                                      ((ne) this).field_J = ht.a(((ne) this).field_x, 0, ((ne) this).field_J);
                                      ((ne) this).field_k = ht.a(((ne) this).field_x, 0, ((ne) this).field_k);
                                      if (param1.field_p == null) {
                                        break L19;
                                      } else {
                                        if (!bwa.a(param2, (byte) 121, ((ne) this).field_u)) {
                                          break L19;
                                        } else {
                                          int[][] discarded$20 = param1.a((byte) -37, false);
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (param1.field_g == null) {
                                        break L20;
                                      } else {
                                        if (!ifb.a(-54, param2, ((ne) this).field_u)) {
                                          break L20;
                                        } else {
                                          int[][] discarded$21 = param1.a(-96);
                                          break L20;
                                        }
                                      }
                                    }
                                    L21: {
                                      if (null == param1.field_y) {
                                        break L21;
                                      } else {
                                        if (!ujb.a(384, ((ne) this).field_u, param2)) {
                                          break L21;
                                        } else {
                                          var18 = 0;
                                          var92 = new int[256];
                                          var88 = var92;
                                          var84 = var88;
                                          var80 = var84;
                                          var19 = var80;
                                          var20 = 0;
                                          L22: while (true) {
                                            if (var20 >= ((ne) this).field_B) {
                                              ((ne) this).field_K = new int[var18 + 1][];
                                              var20 = 0;
                                              L23: while (true) {
                                                if (var20 > var18) {
                                                  var20 = 0;
                                                  L24: while (true) {
                                                    if (((ne) this).field_B <= var20) {
                                                      break L21;
                                                    } else {
                                                      L25: {
                                                        var21 = param1.field_y[var89[var20]];
                                                        if (0 > var21) {
                                                          break L25;
                                                        } else {
                                                          var19[var21] = var19[var21] + 1;
                                                          ((ne) this).field_K[var21][var19[var21]] = var20;
                                                          break L25;
                                                        }
                                                      }
                                                      var20++;
                                                      continue L24;
                                                    }
                                                  }
                                                } else {
                                                  ((ne) this).field_K[var20] = new int[var92[var20]];
                                                  var92[var20] = 0;
                                                  var20++;
                                                  continue L23;
                                                }
                                              }
                                            } else {
                                              L26: {
                                                var21 = param1.field_y[var89[var20]];
                                                if (0 > var21) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if (var21 <= var18) {
                                                      break L27;
                                                    } else {
                                                      var18 = var21;
                                                      break L27;
                                                    }
                                                  }
                                                  var19[var21] = var19[var21] + 1;
                                                  break L26;
                                                }
                                              }
                                              var20++;
                                              continue L22;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    return;
                                  } else {
                                    L28: {
                                      var19_int = ((ne) this).field_g[var18];
                                      if (var17 == var19_int) {
                                        break L28;
                                      } else {
                                        int incrementValue$22 = var16;
                                        var16++;
                                        ((ne) this).field_F[incrementValue$22] = var18;
                                        var17 = var19_int;
                                        break L28;
                                      }
                                    }
                                    var18++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L29: {
                                  var19_int = ((ne) this).field_g[var18];
                                  if (var17 == var19_int) {
                                    break L29;
                                  } else {
                                    var16++;
                                    var17 = var19_int;
                                    break L29;
                                  }
                                }
                                var18++;
                                continue L17;
                              }
                            }
                          } else {
                            L30: {
                              var17 = var89[var16];
                              var18 = param1.field_b[var17] & 65535;
                              if (param1.field_M != null) {
                                var19_int = param1.field_M[var17];
                                break L30;
                              } else {
                                var19_int = -1;
                                break L30;
                              }
                            }
                            L31: {
                              if (null == param1.field_r) {
                                var20 = 0;
                                break L31;
                              } else {
                                var20 = param1.field_r[var17] & 255;
                                break L31;
                              }
                            }
                            L32: {
                              if (null == param1.field_u) {
                                stackOut_110_0 = -1;
                                stackIn_111_0 = stackOut_110_0;
                                break L32;
                              } else {
                                stackOut_109_0 = param1.field_u[var17];
                                stackIn_111_0 = stackOut_109_0;
                                break L32;
                              }
                            }
                            L33: {
                              var21 = stackIn_111_0;
                              if (var21 == -1) {
                                break L33;
                              } else {
                                if ((64 & ((ne) this).field_u) == 0) {
                                  break L33;
                                } else {
                                  var74 = var65.a(-20292, var21 & 65535);
                                  if (!var74.field_r) {
                                    break L33;
                                  } else {
                                    var21 = -1;
                                    break L33;
                                  }
                                }
                              }
                            }
                            L34: {
                              var22 = 0.0f;
                              var23 = 0.0f;
                              var24 = 0.0f;
                              var25 = 0.0f;
                              var26 = 0.0f;
                              var27 = 0.0f;
                              var28 = 0;
                              var29 = 0;
                              var30 = 0;
                              if (var21 == -1) {
                                break L34;
                              } else {
                                if (var19_int != -1) {
                                  var19_int = var19_int & 255;
                                  var31 = param1.field_e[var19_int];
                                  if (0 != var31) {
                                    var32_int = param1.field_k[var17];
                                    var33_int = param1.field_o[var17];
                                    var34 = param1.field_K[var17];
                                    var35 = var75.field_d[var19_int];
                                    var36 = var75.field_b[var19_int];
                                    var37 = var75.field_f[var19_int];
                                    var91 = var75.field_c[var19_int];
                                    var39 = param1.field_n[var19_int];
                                    var40 = (float)param1.field_L[var19_int] / 256.0f;
                                    if (var31 != 1) {
                                      if (var31 == 2) {
                                        var41 = (float)param1.field_f[var19_int] / 256.0f;
                                        var42 = (float)param1.field_I[var19_int] / 256.0f;
                                        var43 = -param1.field_v[var32_int] + param1.field_v[var33_int];
                                        var44 = param1.field_G[var33_int] + -param1.field_G[var32_int];
                                        var45 = param1.field_x[var33_int] - param1.field_x[var32_int];
                                        var46 = param1.field_v[var34] + -param1.field_v[var32_int];
                                        var47 = -param1.field_G[var32_int] + param1.field_G[var34];
                                        var48 = -param1.field_x[var32_int] + param1.field_x[var34];
                                        var49 = var44 * var48 - var45 * var47;
                                        var50 = var46 * var45 - var48 * var43;
                                        var51 = var47 * var43 - var46 * var44;
                                        var52 = 64.0f / (float)param1.field_F[var19_int];
                                        var53 = 64.0f / (float)param1.field_a[var19_int];
                                        var54 = 64.0f / (float)param1.field_C[var19_int];
                                        var55 = (var91[2] * (float)var51 + ((float)var49 * var91[0] + (float)var50 * var91[1])) / var52;
                                        var56 = ((float)var50 * var91[4] + (float)var49 * var91[3] + var91[5] * (float)var51) / var53;
                                        var57 = (var91[7] * (float)var50 + var91[6] * (float)var49 + var91[8] * (float)var51) / var54;
                                        var30 = mpa.a(-93, var56, var55, var57);
                                        dhb.a(var42, param1.field_x[var32_int], var41, (byte) 39, param1.field_v[var32_int], var37, param1.field_G[var32_int], var30, bea.field_f, var35, var39, var91, var36, var40);
                                        var23 = bea.field_f[1];
                                        var22 = bea.field_f[0];
                                        dhb.a(var42, param1.field_x[var33_int], var41, (byte) 67, param1.field_v[var33_int], var37, param1.field_G[var33_int], var30, bea.field_f, var35, var39, var91, var36, var40);
                                        var24 = bea.field_f[0];
                                        var25 = bea.field_f[1];
                                        dhb.a(var42, param1.field_x[var34], var41, (byte) 26, param1.field_v[var34], var37, param1.field_G[var34], var30, bea.field_f, var35, var39, var91, var36, var40);
                                        var27 = bea.field_f[1];
                                        var26 = bea.field_f[0];
                                        break L34;
                                      } else {
                                        if (3 != var31) {
                                          break L34;
                                        } else {
                                          oma.a(var91, param1.field_x[var32_int], var40, bea.field_f, var37, param1.field_v[var32_int], (byte) -82, var36, param1.field_G[var32_int], var39, var35);
                                          var23 = bea.field_f[1];
                                          var22 = bea.field_f[0];
                                          oma.a(var91, param1.field_x[var33_int], var40, bea.field_f, var37, param1.field_v[var33_int], (byte) -82, var36, param1.field_G[var33_int], var39, var35);
                                          var24 = bea.field_f[0];
                                          var25 = bea.field_f[1];
                                          oma.a(var91, param1.field_x[var34], var40, bea.field_f, var37, param1.field_v[var34], (byte) -82, var36, param1.field_G[var34], var39, var35);
                                          var27 = bea.field_f[1];
                                          var26 = bea.field_f[0];
                                          if ((1 & var39) != 0) {
                                            L35: {
                                              if (0.5f < -var23 + var25) {
                                                var28 = 1;
                                                var25 = var25 - 1.0f;
                                                break L35;
                                              } else {
                                                if (0.5f >= var23 - var25) {
                                                  break L35;
                                                } else {
                                                  var25 = var25 + 1.0f;
                                                  var28 = 2;
                                                  break L35;
                                                }
                                              }
                                            }
                                            if (-var23 + var27 <= 0.5f) {
                                              if (0.5f >= var23 - var27) {
                                                break L34;
                                              } else {
                                                var27 = var27 + 1.0f;
                                                var29 = 2;
                                                break L34;
                                              }
                                            } else {
                                              var27 = var27 - 1.0f;
                                              var29 = 1;
                                              break L34;
                                            }
                                          } else {
                                            L36: {
                                              if (0.5f >= var24 - var22) {
                                                if (0.5f >= var22 - var24) {
                                                  break L36;
                                                } else {
                                                  var28 = 2;
                                                  var24 = var24 + 1.0f;
                                                  break L36;
                                                }
                                              } else {
                                                var24 = var24 - 1.0f;
                                                var28 = 1;
                                                break L36;
                                              }
                                            }
                                            if (var26 - var22 > 0.5f) {
                                              var26 = var26 - 1.0f;
                                              var29 = 1;
                                              break L34;
                                            } else {
                                              if (0.5f >= -var26 + var22) {
                                                break L34;
                                              } else {
                                                var29 = 2;
                                                var26 = var26 + 1.0f;
                                                break L34;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var41 = (float)param1.field_C[var19_int] / 1024.0f;
                                      ac.a(var91, var36, var39, var40, param1.field_v[var32_int], param1.field_G[var32_int], (byte) -52, var41, var37, bea.field_f, var35, param1.field_x[var32_int]);
                                      var22 = bea.field_f[0];
                                      var23 = bea.field_f[1];
                                      ac.a(var91, var36, var39, var40, param1.field_v[var33_int], param1.field_G[var33_int], (byte) -52, var41, var37, bea.field_f, var35, param1.field_x[var33_int]);
                                      var24 = bea.field_f[0];
                                      var25 = bea.field_f[1];
                                      ac.a(var91, var36, var39, var40, param1.field_v[var34], param1.field_G[var34], (byte) -52, var41, var37, bea.field_f, var35, param1.field_x[var34]);
                                      var27 = bea.field_f[1];
                                      var26 = bea.field_f[0];
                                      var42 = var41 / 2.0f;
                                      if ((var39 & 1) == 0) {
                                        L37: {
                                          if (var42 >= var24 - var22) {
                                            if (-var24 + var22 <= var42) {
                                              break L37;
                                            } else {
                                              var24 = var24 + var41;
                                              var28 = 2;
                                              break L37;
                                            }
                                          } else {
                                            var28 = 1;
                                            var24 = var24 - var41;
                                            break L37;
                                          }
                                        }
                                        if (var26 - var22 > var42) {
                                          var26 = var26 - var41;
                                          var29 = 1;
                                          break L34;
                                        } else {
                                          if (-var26 + var22 <= var42) {
                                            break L34;
                                          } else {
                                            var29 = 2;
                                            var26 = var26 + var41;
                                            break L34;
                                          }
                                        }
                                      } else {
                                        L38: {
                                          if (-var23 + var25 > var42) {
                                            var25 = var25 - var41;
                                            var28 = 1;
                                            break L38;
                                          } else {
                                            if (var42 >= -var25 + var23) {
                                              break L38;
                                            } else {
                                              var28 = 2;
                                              var25 = var25 + var41;
                                              break L38;
                                            }
                                          }
                                        }
                                        if (var27 - var23 > var42) {
                                          var27 = var27 - var41;
                                          var29 = 1;
                                          break L34;
                                        } else {
                                          if (-var27 + var23 <= var42) {
                                            break L34;
                                          } else {
                                            var29 = 2;
                                            var27 = var27 + var41;
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var32_int = param1.field_k[var17];
                                    var33_int = param1.field_o[var17];
                                    var34 = param1.field_K[var17];
                                    var35 = param1.field_t[var19_int];
                                    var36 = param1.field_i[var19_int];
                                    var37 = param1.field_H[var19_int];
                                    var38 = (float)param1.field_v[var35];
                                    var39_float = (float)param1.field_G[var35];
                                    var40 = (float)param1.field_x[var35];
                                    var41 = -var38 + (float)param1.field_v[var36];
                                    var42 = (float)param1.field_G[var36] - var39_float;
                                    var43_float = (float)param1.field_x[var36] - var40;
                                    var44_float = -var38 + (float)param1.field_v[var37];
                                    var45_float = -var39_float + (float)param1.field_G[var37];
                                    var46_float = (float)param1.field_x[var37] - var40;
                                    var47_float = (float)param1.field_v[var32_int] - var38;
                                    var48_float = -var39_float + (float)param1.field_G[var32_int];
                                    var49_float = (float)param1.field_x[var32_int] - var40;
                                    var50_float = -var38 + (float)param1.field_v[var33_int];
                                    var51_float = (float)param1.field_G[var33_int] - var39_float;
                                    var52 = (float)param1.field_x[var33_int] - var40;
                                    var53 = (float)param1.field_v[var34] - var38;
                                    var54 = -var39_float + (float)param1.field_G[var34];
                                    var55 = (float)param1.field_x[var34] - var40;
                                    var56 = var46_float * var42 - var45_float * var43_float;
                                    var57 = var43_float * var44_float - var46_float * var41;
                                    var58 = -(var44_float * var42) + var45_float * var41;
                                    var59 = -(var46_float * var57) + var58 * var45_float;
                                    var60 = var46_float * var56 - var44_float * var58;
                                    var61 = -(var45_float * var56) + var57 * var44_float;
                                    var62 = 1.0f / (var43_float * var61 + (var41 * var59 + var60 * var42));
                                    var24 = (var59 * var50_float + var51_float * var60 + var61 * var52) * var62;
                                    var26 = var62 * (var54 * var60 + var59 * var53 + var55 * var61);
                                    var22 = var62 * (var59 * var47_float + var60 * var48_float + var61 * var49_float);
                                    var61 = -(var42 * var56) + var57 * var41;
                                    var60 = -(var41 * var58) + var56 * var43_float;
                                    var59 = var58 * var42 - var57 * var43_float;
                                    var62 = 1.0f / (var60 * var45_float + var59 * var44_float + var46_float * var61);
                                    var25 = (var60 * var51_float + var50_float * var59 + var52 * var61) * var62;
                                    var23 = (var59 * var47_float + var60 * var48_float + var61 * var49_float) * var62;
                                    var27 = (var55 * var61 + (var60 * var54 + var59 * var53)) * var62;
                                    break L34;
                                  }
                                } else {
                                  var24 = 1.0f;
                                  var23 = 1.0f;
                                  var27 = 0.0f;
                                  var25 = 1.0f;
                                  var28 = 1;
                                  var26 = 0.0f;
                                  var29 = 2;
                                  var22 = 0.0f;
                                  break L34;
                                }
                              }
                            }
                            L39: {
                              if (null == param1.field_E) {
                                var31 = 0;
                                break L39;
                              } else {
                                var31 = param1.field_E[var17];
                                break L39;
                              }
                            }
                            L40: {
                              if (var31 != 0) {
                                if (var31 != 1) {
                                  break L40;
                                } else {
                                  L41: {
                                    var32 = var15[var17];
                                    stackOut_164_0 = (long)(var18 << 8) + ((long)(var30 << 24) + (long)var20) << 32;
                                    stackOut_164_1 = (256 + var32.field_a << 22) + (256 + var32.field_c << 12);
                                    stackIn_166_0 = stackOut_164_0;
                                    stackIn_166_1 = stackOut_164_1;
                                    stackIn_165_0 = stackOut_164_0;
                                    stackIn_165_1 = stackOut_164_1;
                                    if (var32.field_b > 0) {
                                      stackOut_166_0 = stackIn_166_0;
                                      stackOut_166_1 = stackIn_166_1;
                                      stackOut_166_2 = 1024;
                                      stackIn_167_0 = stackOut_166_0;
                                      stackIn_167_1 = stackOut_166_1;
                                      stackIn_167_2 = stackOut_166_2;
                                      break L41;
                                    } else {
                                      stackOut_165_0 = stackIn_165_0;
                                      stackOut_165_1 = stackIn_165_1;
                                      stackOut_165_2 = 2048;
                                      stackIn_167_0 = stackOut_165_0;
                                      stackIn_167_1 = stackOut_165_1;
                                      stackIn_167_2 = stackOut_165_2;
                                      break L41;
                                    }
                                  }
                                  var33 = stackIn_167_0 + (long)(stackIn_167_1 + stackIn_167_2 + (var19_int << 2));
                                  ((ne) this).field_E[var16] = this.a((byte) 123, var32.field_b, var32.field_c, 0, var23, var32.field_a, var33, (int) param1.field_k[var17], param1, var22);
                                  ((ne) this).field_b[var16] = this.a((byte) 123, var32.field_b, var32.field_c, 0, var25, var32.field_a, var33 + (long)var28, (int) param1.field_o[var17], param1, var24);
                                  ((ne) this).field_n[var16] = this.a((byte) 112, var32.field_b, var32.field_c, 0, var27, var32.field_a, var33 + (long)var29, (int) param1.field_K[var17], param1, var26);
                                  break L40;
                                }
                              } else {
                                var32_long = (long)(var19_int << 2) + ((long)(var18 << 8) + (long)(var30 << 24) + (long)var20 << 32);
                                var34 = param1.field_k[var17];
                                var35 = param1.field_o[var17];
                                var36 = param1.field_K[var17];
                                var77 = var11[var34];
                                ((ne) this).field_E[var16] = this.a((byte) 111, var77.field_a, var77.field_f, var77.field_c, var23, var77.field_h, var32_long, var34, param1, var22);
                                var78 = var11[var35];
                                ((ne) this).field_b[var16] = this.a((byte) 112, var78.field_a, var78.field_f, var78.field_c, var25, var78.field_h, (long)var28 + var32_long, var35, param1, var24);
                                var79 = var11[var36];
                                ((ne) this).field_n[var16] = this.a((byte) 124, var79.field_a, var79.field_f, var79.field_c, var27, var79.field_h, var32_long + (long)var29, var36, param1, var26);
                                break L40;
                              }
                            }
                            L42: {
                              if (param1.field_r == null) {
                                break L42;
                              } else {
                                ((ne) this).field_q[var16] = param1.field_r[var17];
                                break L42;
                              }
                            }
                            L43: {
                              if (null == param1.field_w) {
                                break L43;
                              } else {
                                ((ne) this).field_G[var16] = param1.field_w[var17];
                                break L43;
                              }
                            }
                            ((ne) this).field_l[var16] = param1.field_b[var17];
                            ((ne) this).field_g[var16] = (short)var21;
                            var16++;
                            continue L16;
                          }
                        }
                      } else {
                        var17 = param1.field_k[var16];
                        var18 = param1.field_o[var16];
                        var19_int = param1.field_K[var16];
                        var20 = ((ne) this).field_y[var18] - ((ne) this).field_y[var17];
                        var21 = ((ne) this).field_a[var18] + -((ne) this).field_a[var17];
                        var22_int = -((ne) this).field_s[var17] + ((ne) this).field_s[var18];
                        var23_int = ((ne) this).field_y[var19_int] + -((ne) this).field_y[var17];
                        var24_int = -((ne) this).field_a[var17] + ((ne) this).field_a[var19_int];
                        var25_int = ((ne) this).field_s[var19_int] + -((ne) this).field_s[var17];
                        var26_int = -(var22_int * var24_int) + var25_int * var21;
                        var27_int = var22_int * var23_int - var25_int * var20;
                        var28 = -(var21 * var23_int) + var24_int * var20;
                        L44: while (true) {
                          L45: {
                            if (8192 < var26_int) {
                              break L45;
                            } else {
                              if (8192 < var27_int) {
                                break L45;
                              } else {
                                if (var28 > 8192) {
                                  break L45;
                                } else {
                                  if (-8192 > var26_int) {
                                    break L45;
                                  } else {
                                    if (var27_int < -8192) {
                                      break L45;
                                    } else {
                                      if (-8192 <= var28) {
                                        L46: {
                                          var29 = (int)Math.sqrt((double)(var26_int * var26_int - -(var27_int * var27_int) - -(var28 * var28)));
                                          if (0 < var29) {
                                            break L46;
                                          } else {
                                            var29 = 1;
                                            break L46;
                                          }
                                        }
                                        L47: {
                                          var28 = 256 * var28 / var29;
                                          var27_int = 256 * var27_int / var29;
                                          var26_int = 256 * var26_int / var29;
                                          if (param1.field_E != null) {
                                            stackOut_94_0 = param1.field_E[var16];
                                            stackIn_95_0 = stackOut_94_0;
                                            break L47;
                                          } else {
                                            stackOut_93_0 = 0;
                                            stackIn_95_0 = stackOut_93_0;
                                            break L47;
                                          }
                                        }
                                        L48: {
                                          var30 = stackIn_95_0;
                                          if (var30 != 0) {
                                            if (var30 != 1) {
                                              break L48;
                                            } else {
                                              dea dupTemp$23 = new dea();
                                              var15[var16] = dupTemp$23;
                                              var31_ref_dea = dupTemp$23;
                                              var31_ref_dea.field_a = var28;
                                              var31_ref_dea.field_c = var27_int;
                                              var31_ref_dea.field_b = var26_int;
                                              break L48;
                                            }
                                          } else {
                                            var71 = var11[var17];
                                            var71.field_a = var71.field_a + var26_int;
                                            var71.field_f = var71.field_f + var27_int;
                                            var71.field_h = var71.field_h + var28;
                                            var71.field_c = var71.field_c + 1;
                                            var72 = var11[var18];
                                            var72.field_a = var72.field_a + var26_int;
                                            var72.field_f = var72.field_f + var27_int;
                                            var72.field_c = var72.field_c + 1;
                                            var72.field_h = var72.field_h + var28;
                                            var73 = var11[var19_int];
                                            var73.field_f = var73.field_f + var27_int;
                                            var73.field_h = var73.field_h + var28;
                                            var73.field_a = var73.field_a + var26_int;
                                            var73.field_c = var73.field_c + 1;
                                            break L48;
                                          }
                                        }
                                        var16++;
                                        continue L15;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var26_int = var26_int >> 1;
                          var28 = var28 >> 1;
                          var27_int = var27_int >> 1;
                          continue L44;
                        }
                      }
                    }
                  } else {
                    var15_int = ((ne) this).field_H[var14];
                    ((ne) this).field_H[var14] = var13;
                    var11[var14] = new mmb();
                    var13 = var13 + var15_int;
                    var14++;
                    continue L14;
                  }
                }
              } else {
                L49: {
                  L50: {
                    var12 = var89[var11_int];
                    var13_ref = null;
                    var14 = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17 = 0;
                    if (null == param1.field_g) {
                      break L50;
                    } else {
                      var18 = 0;
                      var19_int = 0;
                      L51: while (true) {
                        if (param1.field_g.length <= var19_int) {
                          if (var18 == 0) {
                            break L50;
                          } else {
                            var9[var11_int] = 9223372036854775807L;
                            ((ne) this).field_d = ((ne) this).field_d - 1;
                            break L49;
                          }
                        } else {
                          L52: {
                            var20_ref_bqa = param1.field_g[var19_int];
                            if (var20_ref_bqa.field_b != var12) {
                              break L52;
                            } else {
                              L53: {
                                int discarded$24 = 0;
                                var21_ref_sr = jm.a(var20_ref_bqa.field_e);
                                if (!var21_ref_sr.field_a) {
                                  break L53;
                                } else {
                                  var18 = 1;
                                  break L53;
                                }
                              }
                              if (var21_ref_sr.field_e == -1) {
                                break L52;
                              } else {
                                var66 = var65.a(-20292, var21_ref_sr.field_e);
                                if (var66.field_q != 2) {
                                  break L52;
                                } else {
                                  break L52;
                                }
                              }
                            }
                          }
                          var19_int++;
                          continue L51;
                        }
                      }
                    }
                  }
                  L54: {
                    var18 = -1;
                    if (param1.field_u == null) {
                      break L54;
                    } else {
                      var18 = param1.field_u[var12];
                      if (var18 == -1) {
                        break L54;
                      } else {
                        L55: {
                          var67 = var65.a(-20292, 65535 & var18);
                          if (0 == (64 & ((ne) this).field_u)) {
                            break L55;
                          } else {
                            if (var67.field_r) {
                              var13_ref = null;
                              var18 = -1;
                              break L54;
                            } else {
                              break L55;
                            }
                          }
                        }
                        L56: {
                          var17 = var67.field_n;
                          if (0 != var67.field_p) {
                            break L56;
                          } else {
                            if (var67.field_d != 0) {
                              break L56;
                            } else {
                              break L56;
                            }
                          }
                        }
                        var16 = var67.field_c;
                        break L54;
                      }
                    }
                  }
                  L57: {
                    L58: {
                      if (null == param1.field_r) {
                        break L58;
                      } else {
                        if (param1.field_r[var12] == 0) {
                          break L58;
                        } else {
                          stackOut_47_0 = 1;
                          stackIn_53_0 = stackOut_47_0;
                          break L57;
                        }
                      }
                    }
                    if (var13_ref != null) {
                      if (0 != ((opa) var13_ref).field_q) {
                        stackOut_52_0 = 1;
                        stackIn_53_0 = stackOut_52_0;
                        break L57;
                      } else {
                        stackOut_51_0 = 0;
                        stackIn_53_0 = stackOut_51_0;
                        break L57;
                      }
                    } else {
                      stackOut_49_0 = 0;
                      stackIn_53_0 = stackOut_49_0;
                      break L57;
                    }
                  }
                  L59: {
                    L60: {
                      var19_int = stackIn_53_0;
                      if (var10 != 0) {
                        break L60;
                      } else {
                        if (var19_int == 0) {
                          break L59;
                        } else {
                          break L60;
                        }
                      }
                    }
                    if (null == param1.field_m) {
                      break L59;
                    } else {
                      var14 = var14 + (param1.field_m[var12] << 17);
                      break L59;
                    }
                  }
                  L61: {
                    if (var19_int == 0) {
                      break L61;
                    } else {
                      var14 = var14 + 65536;
                      break L61;
                    }
                  }
                  var14 = var14 + (65280 & var16 << 8);
                  var15_int = var15_int + ((65535 & var18) << 16);
                  var14 = var14 + (var17 & 255);
                  var15_int = var15_int + (65535 & var11_int);
                  var9[var11_int] = ((long)var14 << 32) + (long)var15_int;
                  break L49;
                }
                var11_int++;
                continue L7;
              }
            }
          } else {
            L62: {
              L63: {
                if (param1.field_E == null) {
                  break L63;
                } else {
                  if (param1.field_E[var9_int] == 2) {
                    break L62;
                  } else {
                    break L63;
                  }
                }
              }
              L64: {
                if (null == param1.field_u) {
                  break L64;
                } else {
                  if (param1.field_u[var9_int] == -1) {
                    break L64;
                  } else {
                    L65: {
                      var10_ref_opa = var65.a(-20292, param1.field_u[var9_int] & 65535);
                      if ((64 & ((ne) this).field_u) == 0) {
                        break L65;
                      } else {
                        if (var10_ref_opa.field_r) {
                          break L64;
                        } else {
                          break L65;
                        }
                      }
                    }
                    if (var10_ref_opa.field_m) {
                      break L62;
                    } else {
                      break L64;
                    }
                  }
                }
              }
              int fieldTemp$25 = ((ne) this).field_B;
              ((ne) this).field_B = ((ne) this).field_B + 1;
              var8[fieldTemp$25] = var9_int;
              ((ne) this).field_H[param1.field_k[var9_int]] = ((ne) this).field_H[param1.field_k[var9_int]] + 1;
              ((ne) this).field_H[param1.field_o[var9_int]] = ((ne) this).field_H[param1.field_o[var9_int]] + 1;
              ((ne) this).field_H[param1.field_K[var9_int]] = ((ne) this).field_H[param1.field_K[var9_int]] + 1;
              break L62;
            }
            var9_int++;
            continue L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Small thruster";
        field_v = true;
    }
}
