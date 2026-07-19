/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

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
          if (this.field_f <= var4) {
            L1: {
              if (this.field_i == null) {
                break L1;
              } else {
                break L1;
              }
            }
            this.field_p = false;
            return;
          } else {
            L2: {
              if (param0 != 128) {
                this.field_y[var4] = param0 * this.field_y[var4] >> -32585593;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 128) {
                break L3;
              } else {
                this.field_a[var4] = param1 * this.field_a[var4] >> -1979419097;
                break L3;
              }
            }
            if (param2 != 128) {
              this.field_s[var4] = param2 * this.field_s[var4] >> -1648169401;
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
        int fieldTemp$1 = 0;
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
        int decompiledRegionSelector0 = 0;
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
            var12_int = this.field_H[param7];
            var13 = this.field_H[param7 - -1];
            var14 = 0;
            var15 = var12_int;
            L1: while (true) {
              L2: {
                if (var15 >= var13) {
                  break L2;
                } else {
                  var16 = this.field_c[var15];
                  if (-1 != (var16 ^ -1)) {
                    if (fgb.field_m[var15] != param6) {
                      var15++;
                      continue L1;
                    } else {
                      stackOut_6_0 = (short)(-1 + var16);
                      stackIn_7_0 = stackOut_6_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var14 = var15;
                    break L2;
                  }
                }
              }
              L3: {
                this.field_c[var14] = (short)(this.field_x - -1);
                fgb.field_m[var14] = param6;
                this.field_I[this.field_x] = (short)param1;
                this.field_h[this.field_x] = (short)param2;
                this.field_A[this.field_x] = (short)param5;
                this.field_z[this.field_x] = (byte)param3;
                this.field_J[this.field_x] = param9;
                this.field_k[this.field_x] = param4;
                if (param0 >= 109) {
                  break L3;
                } else {
                  this.field_G = (short[]) null;
                  break L3;
                }
              }
              fieldTemp$1 = this.field_x;
              this.field_x = this.field_x + 1;
              stackOut_11_0 = (short)fieldTemp$1;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var12);
            stackOut_13_1 = new StringBuilder().append("ne.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param8 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void H(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_f) {
            L1: {
              if (null == this.field_i) {
                break L1;
              } else {
                break L1;
              }
            }
            this.field_p = false;
            return;
          } else {
            L2: {
              if (0 != param0) {
                this.field_y[var4] = this.field_y[var4] + param0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != 0) {
                this.field_a[var4] = this.field_a[var4] + param1;
                break L3;
              } else {
                break L3;
              }
            }
            if (param2 != 0) {
              this.field_s[var4] = this.field_s[var4] + param2;
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
        if (!(this.field_p)) {
            this.a((byte) -10);
        }
        return this.field_j;
    }

    final int V() {
        if (!(this.field_p)) {
            this.a((byte) -10);
        }
        return this.field_C;
    }

    private final void a(byte param0) {
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
        if (param0 == -10) {
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          L0: while (true) {
            if (this.field_f <= var10) {
              this.field_C = (short)var2;
              this.field_j = (short)var7;
              this.field_e = (short)var5;
              this.field_t = (short)var4;
              this.field_p = true;
              return;
            } else {
              L1: {
                var11 = this.field_y[var10];
                var12 = this.field_a[var10];
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
                var13 = this.field_s[var10];
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
        } else {
          return;
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        java.net.URL discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
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
        java.applet.Applet var12 = null;
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
                var12 = (java.applet.Applet) null;
                discarded$15 = ne.a((java.net.URL) null, (byte) 9, (java.applet.Applet) null);
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
                  if ((var8_int ^ -1) > -1) {
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
              if ((var10 ^ -1) <= -1) {
                discarded$16 = var8.append(param3.substring(var9, var10));
                discarded$17 = var8.append(param2);
                var9 = 1 + var10;
                continue L4;
              } else {
                discarded$18 = var8.append(param3.substring(var9));
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
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ne.J(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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
                if (!nga.field_e.equals(param2.getParameter("settings"))) {
                  var4 = nga.field_e;
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
                if (cta.field_p.equals(param2.getParameter("session"))) {
                  break L2;
                } else {
                  var5 = cta.field_p;
                  break L2;
                }
              }
            }
            stackOut_7_0 = mpb.a(-1, param0, (byte) 50, (String) (var4), (String) (var5));
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ne.D(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final int HA() {
        if (!(this.field_p)) {
            this.a((byte) -10);
        }
        return this.field_t;
    }

    final int RA() {
        if (!(this.field_p)) {
            this.a((byte) -10);
        }
        return this.field_e;
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != -2) {
            field_m = (String) null;
        }
    }

    final static boolean a(boolean param0, byte param1) {
        long dupTemp$3 = 0L;
        if (param1 == -11) {
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
              dupTemp$3 = wt.a(false);
              bgb.field_o = dupTemp$3;
              cbb.field_q = dupTemp$3;
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
        } else {
          return true;
        }
    }

    ne(qfa param0) {
        od discarded$0 = null;
        od discarded$1 = null;
        od discarded$2 = null;
        dgb discarded$3 = null;
        this.field_B = 0;
        this.field_f = 0;
        this.field_d = 0;
        this.field_p = false;
        this.field_x = 0;
        try {
            this.field_i = new od((uq) null, 5126, 3, 0);
            discarded$0 = new od((uq) null, 5126, 2, 0);
            discarded$1 = new od((uq) null, 5126, 3, 0);
            discarded$2 = new od((uq) null, 5121, 4, 0);
            discarded$3 = new dgb();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ne(qfa param0, cbb param1, int param2, int param3, int param4, int param5) {
        od discarded$10 = null;
        od discarded$11 = null;
        od discarded$12 = null;
        dgb discarded$13 = null;
        int[][] discarded$14 = null;
        int[][] discarded$15 = null;
        int[] array$16 = null;
        int incrementValue$17 = 0;
        dea dupTemp$18 = null;
        int fieldTemp$19 = 0;
        RuntimeException var7 = null;
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
        float[] var86 = null;
        int stackIn_25_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_113_0 = 0;
        long stackIn_167_0 = 0L;
        int stackIn_167_1 = 0;
        long stackIn_168_0 = 0L;
        int stackIn_168_1 = 0;
        long stackIn_169_0 = 0L;
        int stackIn_169_1 = 0;
        int stackIn_169_2 = 0;
        RuntimeException stackIn_210_0 = null;
        StringBuilder stackIn_210_1 = null;
        RuntimeException stackIn_211_0 = null;
        StringBuilder stackIn_211_1 = null;
        RuntimeException stackIn_212_0 = null;
        StringBuilder stackIn_212_1 = null;
        String stackIn_212_2 = null;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        RuntimeException stackIn_215_0 = null;
        StringBuilder stackIn_215_1 = null;
        String stackIn_215_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_74_0 = 0;
        byte stackOut_74_1 = 0;
        int stackOut_112_0 = 0;
        short stackOut_111_0 = 0;
        long stackOut_166_0 = 0L;
        int stackOut_166_1 = 0;
        long stackOut_168_0 = 0L;
        int stackOut_168_1 = 0;
        int stackOut_168_2 = 0;
        long stackOut_167_0 = 0L;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        byte stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_209_0 = null;
        StringBuilder stackOut_209_1 = null;
        RuntimeException stackOut_211_0 = null;
        StringBuilder stackOut_211_1 = null;
        String stackOut_211_2 = null;
        RuntimeException stackOut_210_0 = null;
        StringBuilder stackOut_210_1 = null;
        String stackOut_210_2 = null;
        RuntimeException stackOut_212_0 = null;
        StringBuilder stackOut_212_1 = null;
        RuntimeException stackOut_214_0 = null;
        StringBuilder stackOut_214_1 = null;
        String stackOut_214_2 = null;
        RuntimeException stackOut_213_0 = null;
        StringBuilder stackOut_213_1 = null;
        String stackOut_213_2 = null;
        this.field_B = 0;
        this.field_f = 0;
        this.field_d = 0;
        this.field_p = false;
        this.field_x = 0;
        try {
          L0: {
            L1: {
              this.field_w = param2;
              this.field_u = param5;
              if (!lgb.a(param5, 82, param2)) {
                break L1;
              } else {
                this.field_i = new od((uq) null, 5126, 3, 0);
                break L1;
              }
            }
            L2: {
              if (!mq.a(param5, param2, false)) {
                break L2;
              } else {
                discarded$10 = new od((uq) null, 5126, 2, 0);
                break L2;
              }
            }
            L3: {
              if (!toa.a(-8636, param2, param5)) {
                break L3;
              } else {
                discarded$11 = new od((uq) null, 5126, 3, 0);
                break L3;
              }
            }
            L4: {
              if (!rb.a(-6070, param5, param2)) {
                break L4;
              } else {
                discarded$12 = new od((uq) null, 5121, 4, 0);
                break L4;
              }
            }
            L5: {
              if (!dwa.a(param2, param5, false)) {
                break L5;
              } else {
                discarded$13 = new dgb();
                break L5;
              }
            }
            var65 = param0.field_a;
            this.field_H = new int[param1.field_D + 1];
            var81 = new int[param1.field_j];
            var64 = var81;
            var8 = var64;
            var9_int = 0;
            L6: while (true) {
              if (var9_int >= param1.field_j) {
                L7: {
                  this.field_d = this.field_B;
                  var82 = new long[this.field_B];
                  var68 = var82;
                  var9 = var68;
                  if (0 == (256 & this.field_w)) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L7;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L7;
                  }
                }
                var10 = stackIn_25_0;
                var11_int = 0;
                L8: while (true) {
                  if (this.field_B <= var11_int) {
                    L9: {
                      kn.a((byte) -24, var81, var82);
                      this.field_s = param1.field_x;
                      this.field_y = param1.field_v;
                      this.field_f = param1.field_D;
                      this.field_a = param1.field_G;
                      var11 = new mmb[this.field_f];
                      if (param1.field_g == null) {
                        break L9;
                      } else {
                        this.field_o = param1.field_g.length;
                        this.field_r = new dga[this.field_o];
                        this.field_D = new uia[this.field_o];
                        var12 = 0;
                        L10: while (true) {
                          if (this.field_o <= var12) {
                            break L9;
                          } else {
                            var69 = param1.field_g[var12];
                            var70 = jm.a(var69.field_e, 0);
                            var15_int = -1;
                            var16 = 0;
                            L11: while (true) {
                              L12: {
                                if (this.field_B <= var16) {
                                  break L12;
                                } else {
                                  if (var81[var16] != var69.field_b) {
                                    var16++;
                                    continue L11;
                                  } else {
                                    var15_int = var16;
                                    break L12;
                                  }
                                }
                              }
                              if (-1 != var15_int) {
                                L13: {
                                  var16 = klb.field_o[65535 & param1.field_b[var69.field_b]] & 16777215;
                                  stackOut_73_0 = var16;
                                  stackIn_75_0 = stackOut_73_0;
                                  stackIn_74_0 = stackOut_73_0;
                                  if (param1.field_r == null) {
                                    stackOut_75_0 = stackIn_75_0;
                                    stackOut_75_1 = 0;
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    break L13;
                                  } else {
                                    stackOut_74_0 = stackIn_74_0;
                                    stackOut_74_1 = param1.field_r[var69.field_b];
                                    stackIn_76_0 = stackOut_74_0;
                                    stackIn_76_1 = stackOut_74_1;
                                    break L13;
                                  }
                                }
                                var16 = stackIn_76_0 | -stackIn_76_1 + 255 << 1432913432;
                                this.field_D[var12] = new uia(var15_int, (int) param1.field_k[var69.field_b], (int) param1.field_o[var69.field_b], (int) param1.field_K[var69.field_b], var70.field_g, var70.field_b, var70.field_e, var70.field_d, var70.field_f, var70.field_a, var70.field_c, var69.field_c);
                                this.field_r[var12] = new dga(var16);
                                var12++;
                                continue L10;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      var12 = 3 * this.field_B;
                      this.field_g = new short[this.field_B];
                      this.field_k = new float[var12];
                      this.field_h = new short[var12];
                      this.field_c = new short[var12];
                      this.field_q = new byte[this.field_B];
                      fgb.field_m = new long[var12];
                      this.field_E = new short[this.field_B];
                      this.field_J = new float[var12];
                      this.field_l = new short[this.field_B];
                      this.field_z = new byte[var12];
                      this.field_I = new short[var12];
                      this.field_b = new short[this.field_B];
                      this.field_A = new short[var12];
                      if (null == param1.field_w) {
                        break L14;
                      } else {
                        this.field_G = new short[this.field_B];
                        break L14;
                      }
                    }
                    this.field_n = new short[this.field_B];
                    var13 = 0;
                    var14 = 0;
                    L15: while (true) {
                      if (param1.field_D <= var14) {
                        this.field_H[param1.field_D] = var13;
                        var75 = ao.a(param1, var81, this.field_B, -3);
                        var15 = new dea[param1.field_j];
                        var16 = 0;
                        L16: while (true) {
                          if (param1.field_j <= var16) {
                            var16 = 0;
                            L17: while (true) {
                              if (this.field_B <= var16) {
                                var16 = 0;
                                var17 = -10000;
                                var18 = 0;
                                L18: while (true) {
                                  if (this.field_d <= var18) {
                                    this.field_F = new int[1 + var16];
                                    var17 = -10000;
                                    var16 = 0;
                                    var18 = 0;
                                    L19: while (true) {
                                      if (var18 >= this.field_d) {
                                        L20: {
                                          this.field_F[var16] = this.field_d;
                                          fgb.field_m = null;
                                          this.field_I = ioa.a(this.field_I, 125, this.field_x);
                                          this.field_h = ioa.a(this.field_h, 99, this.field_x);
                                          this.field_A = ioa.a(this.field_A, 73, this.field_x);
                                          this.field_z = sna.a(this.field_z, this.field_x, 5666);
                                          this.field_J = ht.a(this.field_x, 0, this.field_J);
                                          this.field_k = ht.a(this.field_x, 0, this.field_k);
                                          if (param1.field_p == null) {
                                            break L20;
                                          } else {
                                            if (!bwa.a(param2, (byte) 121, this.field_u)) {
                                              break L20;
                                            } else {
                                              discarded$14 = param1.a((byte) -37, false);
                                              break L20;
                                            }
                                          }
                                        }
                                        L21: {
                                          if (param1.field_g == null) {
                                            break L21;
                                          } else {
                                            if (!ifb.a(-54, param2, this.field_u)) {
                                              break L21;
                                            } else {
                                              discarded$15 = param1.a(-96);
                                              break L21;
                                            }
                                          }
                                        }
                                        L22: {
                                          if (null == param1.field_y) {
                                            break L22;
                                          } else {
                                            if (!ujb.a(384, this.field_u, param2)) {
                                              break L22;
                                            } else {
                                              var18 = 0;
                                              var84 = new int[256];
                                              var80 = var84;
                                              var19 = var80;
                                              var20 = 0;
                                              L23: while (true) {
                                                if (var20 >= this.field_B) {
                                                  this.field_K = new int[var18 + 1][];
                                                  var20 = 0;
                                                  L24: while (true) {
                                                    if (var20 > var18) {
                                                      var20 = 0;
                                                      L25: while (true) {
                                                        if (this.field_B <= var20) {
                                                          break L22;
                                                        } else {
                                                          L26: {
                                                            var21 = param1.field_y[var81[var20]];
                                                            if (0 > var21) {
                                                              break L26;
                                                            } else {
                                                              var19[var21] = var19[var21] + 1;
                                                              this.field_K[var21][var19[var21]] = var20;
                                                              break L26;
                                                            }
                                                          }
                                                          var20++;
                                                          continue L25;
                                                        }
                                                      }
                                                    } else {
                                                      array$16 = new int[var84[var20]];
                                                      this.field_K[var20] = array$16;
                                                      var84[var20] = 0;
                                                      var20++;
                                                      continue L24;
                                                    }
                                                  }
                                                } else {
                                                  L27: {
                                                    var21 = param1.field_y[var81[var20]];
                                                    if (0 > var21) {
                                                      break L27;
                                                    } else {
                                                      L28: {
                                                        if (var21 <= var18) {
                                                          break L28;
                                                        } else {
                                                          var18 = var21;
                                                          break L28;
                                                        }
                                                      }
                                                      var19[var21] = var19[var21] + 1;
                                                      break L27;
                                                    }
                                                  }
                                                  var20++;
                                                  continue L23;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        break L0;
                                      } else {
                                        L29: {
                                          var19_int = this.field_g[var18];
                                          if (var17 == var19_int) {
                                            break L29;
                                          } else {
                                            incrementValue$17 = var16;
                                            var16++;
                                            this.field_F[incrementValue$17] = var18;
                                            var17 = var19_int;
                                            break L29;
                                          }
                                        }
                                        var18++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L30: {
                                      var19_int = this.field_g[var18];
                                      if (var17 == var19_int) {
                                        break L30;
                                      } else {
                                        var16++;
                                        var17 = var19_int;
                                        break L30;
                                      }
                                    }
                                    var18++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L31: {
                                  var17 = var81[var16];
                                  var18 = param1.field_b[var17] & 65535;
                                  if (param1.field_M != null) {
                                    var19_int = param1.field_M[var17];
                                    break L31;
                                  } else {
                                    var19_int = -1;
                                    break L31;
                                  }
                                }
                                L32: {
                                  if (null == param1.field_r) {
                                    var20 = 0;
                                    break L32;
                                  } else {
                                    var20 = param1.field_r[var17] & 255;
                                    break L32;
                                  }
                                }
                                L33: {
                                  if (null == param1.field_u) {
                                    stackOut_112_0 = -1;
                                    stackIn_113_0 = stackOut_112_0;
                                    break L33;
                                  } else {
                                    stackOut_111_0 = param1.field_u[var17];
                                    stackIn_113_0 = stackOut_111_0;
                                    break L33;
                                  }
                                }
                                L34: {
                                  var21 = stackIn_113_0;
                                  if ((var21 ^ -1) == 0) {
                                    break L34;
                                  } else {
                                    if ((64 & this.field_u) == 0) {
                                      break L34;
                                    } else {
                                      var74 = var65.a(-20292, var21 & 65535);
                                      if (!var74.field_r) {
                                        break L34;
                                      } else {
                                        var21 = -1;
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                L35: {
                                  var22 = 0.0f;
                                  var23 = 0.0f;
                                  var24 = 0.0f;
                                  var25 = 0.0f;
                                  var26 = 0.0f;
                                  var27 = 0.0f;
                                  var28 = 0;
                                  var29 = 0;
                                  var30 = 0;
                                  if ((var21 ^ -1) == 0) {
                                    break L35;
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
                                        var86 = var75.field_c[var19_int];
                                        var39 = param1.field_n[var19_int];
                                        var40 = (float)param1.field_L[var19_int] / 256.0f;
                                        if (-2 != (var31 ^ -1)) {
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
                                            var55 = (var86[2] * (float)var51 + ((float)var49 * var86[0] + (float)var50 * var86[1])) / var52;
                                            var56 = ((float)var50 * var86[4] + (float)var49 * var86[3] + var86[5] * (float)var51) / var53;
                                            var57 = (var86[7] * (float)var50 + var86[6] * (float)var49 + var86[8] * (float)var51) / var54;
                                            var30 = mpa.a(-93, var56, var55, var57);
                                            dhb.a(var42, param1.field_x[var32_int], var41, (byte) 39, param1.field_v[var32_int], var37, param1.field_G[var32_int], var30, bea.field_f, var35, var39, var86, var36, var40);
                                            var23 = bea.field_f[1];
                                            var22 = bea.field_f[0];
                                            dhb.a(var42, param1.field_x[var33_int], var41, (byte) 67, param1.field_v[var33_int], var37, param1.field_G[var33_int], var30, bea.field_f, var35, var39, var86, var36, var40);
                                            var24 = bea.field_f[0];
                                            var25 = bea.field_f[1];
                                            dhb.a(var42, param1.field_x[var34], var41, (byte) 26, param1.field_v[var34], var37, param1.field_G[var34], var30, bea.field_f, var35, var39, var86, var36, var40);
                                            var27 = bea.field_f[1];
                                            var26 = bea.field_f[0];
                                            break L35;
                                          } else {
                                            if (3 != var31) {
                                              break L35;
                                            } else {
                                              oma.a(var86, param1.field_x[var32_int], var40, bea.field_f, var37, param1.field_v[var32_int], (byte) -82, var36, param1.field_G[var32_int], var39, var35);
                                              var23 = bea.field_f[1];
                                              var22 = bea.field_f[0];
                                              oma.a(var86, param1.field_x[var33_int], var40, bea.field_f, var37, param1.field_v[var33_int], (byte) -82, var36, param1.field_G[var33_int], var39, var35);
                                              var24 = bea.field_f[0];
                                              var25 = bea.field_f[1];
                                              oma.a(var86, param1.field_x[var34], var40, bea.field_f, var37, param1.field_v[var34], (byte) -82, var36, param1.field_G[var34], var39, var35);
                                              var27 = bea.field_f[1];
                                              var26 = bea.field_f[0];
                                              if ((1 & var39) != 0) {
                                                L36: {
                                                  if (0.5f < -var23 + var25) {
                                                    var28 = 1;
                                                    var25 = var25 - 1.0f;
                                                    break L36;
                                                  } else {
                                                    if (0.5f >= var23 - var25) {
                                                      break L36;
                                                    } else {
                                                      var25 = var25 + 1.0f;
                                                      var28 = 2;
                                                      break L36;
                                                    }
                                                  }
                                                }
                                                if (-var23 + var27 <= 0.5f) {
                                                  if (0.5f >= var23 - var27) {
                                                    break L35;
                                                  } else {
                                                    var27 = var27 + 1.0f;
                                                    var29 = 2;
                                                    break L35;
                                                  }
                                                } else {
                                                  var27 = var27 - 1.0f;
                                                  var29 = 1;
                                                  break L35;
                                                }
                                              } else {
                                                L37: {
                                                  if (0.5f >= var24 - var22) {
                                                    if (0.5f >= var22 - var24) {
                                                      break L37;
                                                    } else {
                                                      var28 = 2;
                                                      var24 = var24 + 1.0f;
                                                      break L37;
                                                    }
                                                  } else {
                                                    var24 = var24 - 1.0f;
                                                    var28 = 1;
                                                    break L37;
                                                  }
                                                }
                                                if (var26 - var22 > 0.5f) {
                                                  var26 = var26 - 1.0f;
                                                  var29 = 1;
                                                  break L35;
                                                } else {
                                                  if (0.5f >= -var26 + var22) {
                                                    break L35;
                                                  } else {
                                                    var29 = 2;
                                                    var26 = var26 + 1.0f;
                                                    break L35;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var41 = (float)param1.field_C[var19_int] / 1024.0f;
                                          ac.a(var86, var36, var39, var40, param1.field_v[var32_int], param1.field_G[var32_int], (byte) -52, var41, var37, bea.field_f, var35, param1.field_x[var32_int]);
                                          var22 = bea.field_f[0];
                                          var23 = bea.field_f[1];
                                          ac.a(var86, var36, var39, var40, param1.field_v[var33_int], param1.field_G[var33_int], (byte) -52, var41, var37, bea.field_f, var35, param1.field_x[var33_int]);
                                          var24 = bea.field_f[0];
                                          var25 = bea.field_f[1];
                                          ac.a(var86, var36, var39, var40, param1.field_v[var34], param1.field_G[var34], (byte) -52, var41, var37, bea.field_f, var35, param1.field_x[var34]);
                                          var27 = bea.field_f[1];
                                          var26 = bea.field_f[0];
                                          var42 = var41 / 2.0f;
                                          if (-1 == (var39 & 1 ^ -1)) {
                                            L38: {
                                              if (var42 >= var24 - var22) {
                                                if (-var24 + var22 <= var42) {
                                                  break L38;
                                                } else {
                                                  var24 = var24 + var41;
                                                  var28 = 2;
                                                  break L38;
                                                }
                                              } else {
                                                var28 = 1;
                                                var24 = var24 - var41;
                                                break L38;
                                              }
                                            }
                                            if (var26 - var22 > var42) {
                                              var26 = var26 - var41;
                                              var29 = 1;
                                              break L35;
                                            } else {
                                              if (-var26 + var22 <= var42) {
                                                break L35;
                                              } else {
                                                var29 = 2;
                                                var26 = var26 + var41;
                                                break L35;
                                              }
                                            }
                                          } else {
                                            L39: {
                                              if (-var23 + var25 > var42) {
                                                var25 = var25 - var41;
                                                var28 = 1;
                                                break L39;
                                              } else {
                                                if (var42 >= -var25 + var23) {
                                                  break L39;
                                                } else {
                                                  var28 = 2;
                                                  var25 = var25 + var41;
                                                  break L39;
                                                }
                                              }
                                            }
                                            if (var27 - var23 > var42) {
                                              var27 = var27 - var41;
                                              var29 = 1;
                                              break L35;
                                            } else {
                                              if (-var27 + var23 <= var42) {
                                                break L35;
                                              } else {
                                                var29 = 2;
                                                var27 = var27 + var41;
                                                break L35;
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
                                        break L35;
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
                                      break L35;
                                    }
                                  }
                                }
                                L40: {
                                  if (null == param1.field_E) {
                                    var31 = 0;
                                    break L40;
                                  } else {
                                    var31 = param1.field_E[var17];
                                    break L40;
                                  }
                                }
                                L41: {
                                  if (var31 != 0) {
                                    if (-2 != (var31 ^ -1)) {
                                      break L41;
                                    } else {
                                      L42: {
                                        var32 = var15[var17];
                                        stackOut_166_0 = (long)(var18 << -666879928) + ((long)(var30 << -141265320) + (long)var20) << 1718116512;
                                        stackOut_166_1 = (256 + var32.field_a << -924739338) + (256 + var32.field_c << 1508777740);
                                        stackIn_168_0 = stackOut_166_0;
                                        stackIn_168_1 = stackOut_166_1;
                                        stackIn_167_0 = stackOut_166_0;
                                        stackIn_167_1 = stackOut_166_1;
                                        if (-1 > (var32.field_b ^ -1)) {
                                          stackOut_168_0 = stackIn_168_0;
                                          stackOut_168_1 = stackIn_168_1;
                                          stackOut_168_2 = 1024;
                                          stackIn_169_0 = stackOut_168_0;
                                          stackIn_169_1 = stackOut_168_1;
                                          stackIn_169_2 = stackOut_168_2;
                                          break L42;
                                        } else {
                                          stackOut_167_0 = stackIn_167_0;
                                          stackOut_167_1 = stackIn_167_1;
                                          stackOut_167_2 = 2048;
                                          stackIn_169_0 = stackOut_167_0;
                                          stackIn_169_1 = stackOut_167_1;
                                          stackIn_169_2 = stackOut_167_2;
                                          break L42;
                                        }
                                      }
                                      var33 = stackIn_169_0 + (long)(stackIn_169_1 + stackIn_169_2 + (var19_int << 1879732450));
                                      this.field_E[var16] = this.a((byte) 123, var32.field_b, var32.field_c, 0, var23, var32.field_a, var33, (int) param1.field_k[var17], param1, var22);
                                      this.field_b[var16] = this.a((byte) 123, var32.field_b, var32.field_c, 0, var25, var32.field_a, var33 + (long)var28, (int) param1.field_o[var17], param1, var24);
                                      this.field_n[var16] = this.a((byte) 112, var32.field_b, var32.field_c, 0, var27, var32.field_a, var33 + (long)var29, (int) param1.field_K[var17], param1, var26);
                                      break L41;
                                    }
                                  } else {
                                    var32_long = (long)(var19_int << -1792692190) + ((long)(var18 << -165470392) + (long)(var30 << -800761256) + (long)var20 << 1187135712);
                                    var34 = param1.field_k[var17];
                                    var35 = param1.field_o[var17];
                                    var36 = param1.field_K[var17];
                                    var77 = var11[var34];
                                    this.field_E[var16] = this.a((byte) 111, var77.field_a, var77.field_f, var77.field_c, var23, var77.field_h, var32_long, var34, param1, var22);
                                    var78 = var11[var35];
                                    this.field_b[var16] = this.a((byte) 112, var78.field_a, var78.field_f, var78.field_c, var25, var78.field_h, (long)var28 + var32_long, var35, param1, var24);
                                    var79 = var11[var36];
                                    this.field_n[var16] = this.a((byte) 124, var79.field_a, var79.field_f, var79.field_c, var27, var79.field_h, var32_long + (long)var29, var36, param1, var26);
                                    break L41;
                                  }
                                }
                                L43: {
                                  if (param1.field_r == null) {
                                    break L43;
                                  } else {
                                    this.field_q[var16] = param1.field_r[var17];
                                    break L43;
                                  }
                                }
                                L44: {
                                  if (null == param1.field_w) {
                                    break L44;
                                  } else {
                                    this.field_G[var16] = param1.field_w[var17];
                                    break L44;
                                  }
                                }
                                this.field_l[var16] = param1.field_b[var17];
                                this.field_g[var16] = (short)var21;
                                var16++;
                                continue L17;
                              }
                            }
                          } else {
                            var17 = param1.field_k[var16];
                            var18 = param1.field_o[var16];
                            var19_int = param1.field_K[var16];
                            var20 = this.field_y[var18] - this.field_y[var17];
                            var21 = this.field_a[var18] + -this.field_a[var17];
                            var22_int = -this.field_s[var17] + this.field_s[var18];
                            var23_int = this.field_y[var19_int] + -this.field_y[var17];
                            var24_int = -this.field_a[var17] + this.field_a[var19_int];
                            var25_int = this.field_s[var19_int] + -this.field_s[var17];
                            var26_int = -(var22_int * var24_int) + var25_int * var21;
                            var27_int = var22_int * var23_int - var25_int * var20;
                            var28 = -(var21 * var23_int) + var24_int * var20;
                            L45: while (true) {
                              L46: {
                                if (8192 < var26_int) {
                                  break L46;
                                } else {
                                  if (8192 < var27_int) {
                                    break L46;
                                  } else {
                                    if (-8193 > (var28 ^ -1)) {
                                      break L46;
                                    } else {
                                      if (-8192 > var26_int) {
                                        break L46;
                                      } else {
                                        if ((var27_int ^ -1) > 8191) {
                                          break L46;
                                        } else {
                                          if (-8192 <= var28) {
                                            L47: {
                                              var29 = (int)Math.sqrt((double)(var26_int * var26_int - -(var27_int * var27_int) - -(var28 * var28)));
                                              if (0 < var29) {
                                                break L47;
                                              } else {
                                                var29 = 1;
                                                break L47;
                                              }
                                            }
                                            L48: {
                                              var28 = 256 * var28 / var29;
                                              var27_int = 256 * var27_int / var29;
                                              var26_int = 256 * var26_int / var29;
                                              if (param1.field_E != null) {
                                                stackOut_96_0 = param1.field_E[var16];
                                                stackIn_97_0 = stackOut_96_0;
                                                break L48;
                                              } else {
                                                stackOut_95_0 = 0;
                                                stackIn_97_0 = stackOut_95_0;
                                                break L48;
                                              }
                                            }
                                            L49: {
                                              var30 = stackIn_97_0;
                                              if (var30 != 0) {
                                                if (-2 != (var30 ^ -1)) {
                                                  break L49;
                                                } else {
                                                  dupTemp$18 = new dea();
                                                  var15[var16] = dupTemp$18;
                                                  var31_ref_dea = dupTemp$18;
                                                  var31_ref_dea.field_a = var28;
                                                  var31_ref_dea.field_c = var27_int;
                                                  var31_ref_dea.field_b = var26_int;
                                                  break L49;
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
                                                break L49;
                                              }
                                            }
                                            var16++;
                                            continue L16;
                                          } else {
                                            break L46;
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
                              continue L45;
                            }
                          }
                        }
                      } else {
                        var15_int = this.field_H[var14];
                        this.field_H[var14] = var13;
                        var11[var14] = new mmb();
                        var13 = var13 + var15_int;
                        var14++;
                        continue L15;
                      }
                    }
                  } else {
                    L50: {
                      L51: {
                        var12 = var81[var11_int];
                        var13_ref = null;
                        var14 = 0;
                        var15_int = 0;
                        var16 = 0;
                        var17 = 0;
                        if (null == param1.field_g) {
                          break L51;
                        } else {
                          var18 = 0;
                          var19_int = 0;
                          L52: while (true) {
                            if (param1.field_g.length <= var19_int) {
                              if (var18 == 0) {
                                break L51;
                              } else {
                                var9[var11_int] = 9223372036854775807L;
                                this.field_d = this.field_d - 1;
                                break L50;
                              }
                            } else {
                              L53: {
                                var20_ref_bqa = param1.field_g[var19_int];
                                if (var20_ref_bqa.field_b != var12) {
                                  break L53;
                                } else {
                                  L54: {
                                    var21_ref_sr = jm.a(var20_ref_bqa.field_e, 0);
                                    if (!var21_ref_sr.field_a) {
                                      break L54;
                                    } else {
                                      var18 = 1;
                                      break L54;
                                    }
                                  }
                                  if ((var21_ref_sr.field_e ^ -1) == 0) {
                                    break L53;
                                  } else {
                                    var66 = var65.a(-20292, var21_ref_sr.field_e);
                                    if (var66.field_q != 2) {
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                              }
                              var19_int++;
                              continue L52;
                            }
                          }
                        }
                      }
                      L55: {
                        var18 = -1;
                        if (param1.field_u == null) {
                          break L55;
                        } else {
                          var18 = param1.field_u[var12];
                          if (0 == (var18 ^ -1)) {
                            break L55;
                          } else {
                            L56: {
                              var67 = var65.a(-20292, 65535 & var18);
                              var13_ref = var67;
                              if (0 == (64 & this.field_u)) {
                                break L56;
                              } else {
                                if (var67.field_r) {
                                  var13_ref = null;
                                  var18 = -1;
                                  break L55;
                                } else {
                                  break L56;
                                }
                              }
                            }
                            L57: {
                              var17 = var67.field_n;
                              if (0 != var67.field_p) {
                                break L57;
                              } else {
                                if (var67.field_d != 0) {
                                  break L57;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            var16 = var67.field_c;
                            break L55;
                          }
                        }
                      }
                      L58: {
                        L59: {
                          if (null == param1.field_r) {
                            break L59;
                          } else {
                            if (-1 == (param1.field_r[var12] ^ -1)) {
                              break L59;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_55_0 = stackOut_48_0;
                              break L58;
                            }
                          }
                        }
                        if (var13_ref != null) {
                          if (0 != ((opa) (var13_ref)).field_q) {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            break L58;
                          } else {
                            stackOut_52_0 = 0;
                            stackIn_55_0 = stackOut_52_0;
                            break L58;
                          }
                        } else {
                          stackOut_50_0 = 0;
                          stackIn_55_0 = stackOut_50_0;
                          break L58;
                        }
                      }
                      L60: {
                        L61: {
                          var19_int = stackIn_55_0;
                          if (var10 != 0) {
                            break L61;
                          } else {
                            if (var19_int == 0) {
                              break L60;
                            } else {
                              break L61;
                            }
                          }
                        }
                        if (null == param1.field_m) {
                          break L60;
                        } else {
                          var14 = var14 + (param1.field_m[var12] << 1749674289);
                          break L60;
                        }
                      }
                      L62: {
                        if (var19_int == 0) {
                          break L62;
                        } else {
                          var14 = var14 + 65536;
                          break L62;
                        }
                      }
                      var14 = var14 + (65280 & var16 << -2016381304);
                      var15_int = var15_int + ((65535 & var18) << -1068163696);
                      var14 = var14 + (var17 & 255);
                      var15_int = var15_int + (65535 & var11_int);
                      var9[var11_int] = ((long)var14 << -1254456608) + (long)var15_int;
                      break L50;
                    }
                    var11_int++;
                    continue L8;
                  }
                }
              } else {
                L63: {
                  L64: {
                    if (param1.field_E == null) {
                      break L64;
                    } else {
                      if ((param1.field_E[var9_int] ^ -1) == -3) {
                        break L63;
                      } else {
                        break L64;
                      }
                    }
                  }
                  L65: {
                    if (null == param1.field_u) {
                      break L65;
                    } else {
                      if ((param1.field_u[var9_int] ^ -1) == 0) {
                        break L65;
                      } else {
                        L66: {
                          var10_ref_opa = var65.a(-20292, param1.field_u[var9_int] & 65535);
                          if ((64 & this.field_u) == 0) {
                            break L66;
                          } else {
                            if (var10_ref_opa.field_r) {
                              break L65;
                            } else {
                              break L66;
                            }
                          }
                        }
                        if (var10_ref_opa.field_m) {
                          break L63;
                        } else {
                          break L65;
                        }
                      }
                    }
                  }
                  fieldTemp$19 = this.field_B;
                  this.field_B = this.field_B + 1;
                  var8[fieldTemp$19] = var9_int;
                  this.field_H[param1.field_k[var9_int]] = this.field_H[param1.field_k[var9_int]] + 1;
                  this.field_H[param1.field_o[var9_int]] = this.field_H[param1.field_o[var9_int]] + 1;
                  this.field_H[param1.field_K[var9_int]] = this.field_H[param1.field_K[var9_int]] + 1;
                  break L63;
                }
                var9_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L67: {
            var7 = decompiledCaughtException;
            stackOut_209_0 = (RuntimeException) (var7);
            stackOut_209_1 = new StringBuilder().append("ne.<init>(");
            stackIn_211_0 = stackOut_209_0;
            stackIn_211_1 = stackOut_209_1;
            stackIn_210_0 = stackOut_209_0;
            stackIn_210_1 = stackOut_209_1;
            if (param0 == null) {
              stackOut_211_0 = (RuntimeException) ((Object) stackIn_211_0);
              stackOut_211_1 = (StringBuilder) ((Object) stackIn_211_1);
              stackOut_211_2 = "null";
              stackIn_212_0 = stackOut_211_0;
              stackIn_212_1 = stackOut_211_1;
              stackIn_212_2 = stackOut_211_2;
              break L67;
            } else {
              stackOut_210_0 = (RuntimeException) ((Object) stackIn_210_0);
              stackOut_210_1 = (StringBuilder) ((Object) stackIn_210_1);
              stackOut_210_2 = "{...}";
              stackIn_212_0 = stackOut_210_0;
              stackIn_212_1 = stackOut_210_1;
              stackIn_212_2 = stackOut_210_2;
              break L67;
            }
          }
          L68: {
            stackOut_212_0 = (RuntimeException) ((Object) stackIn_212_0);
            stackOut_212_1 = ((StringBuilder) (Object) stackIn_212_1).append(stackIn_212_2).append(',');
            stackIn_214_0 = stackOut_212_0;
            stackIn_214_1 = stackOut_212_1;
            stackIn_213_0 = stackOut_212_0;
            stackIn_213_1 = stackOut_212_1;
            if (param1 == null) {
              stackOut_214_0 = (RuntimeException) ((Object) stackIn_214_0);
              stackOut_214_1 = (StringBuilder) ((Object) stackIn_214_1);
              stackOut_214_2 = "null";
              stackIn_215_0 = stackOut_214_0;
              stackIn_215_1 = stackOut_214_1;
              stackIn_215_2 = stackOut_214_2;
              break L68;
            } else {
              stackOut_213_0 = (RuntimeException) ((Object) stackIn_213_0);
              stackOut_213_1 = (StringBuilder) ((Object) stackIn_213_1);
              stackOut_213_2 = "{...}";
              stackIn_215_0 = stackOut_213_0;
              stackIn_215_1 = stackOut_213_1;
              stackIn_215_2 = stackOut_213_2;
              break L68;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_215_0), stackIn_215_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_m = "Small thruster";
        field_v = true;
    }
}
