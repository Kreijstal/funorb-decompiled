/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends nt {
    private int field_z;
    private int field_s;
    static String field_x;
    private int field_t;
    static int[] field_y;
    static pl field_v;
    private int field_u;
    static ns field_w;

    final static void f(int param0) {
        ct var1 = null;
        byte[] var3 = null;
        ks var1_ref = null;
        byte[] var4 = null;
        if (null == pd.field_n) {
            var1 = new ct();
            var3 = var1.a(128, 128, false, 16);
            pd.field_n = aj.a((byte) -125, var3, false);
        }
        if (!(mk.field_d != null)) {
            var1_ref = new ks();
            var4 = var1_ref.b(1, 128, 128, 16);
            mk.field_d = aj.a((byte) -120, var4, false);
        }
        if (param0 != 23369) {
            field_x = (String) null;
        }
    }

    public static void e(int param0) {
        field_x = null;
        field_y = null;
        field_w = null;
        field_v = null;
        int var1 = -34 % ((param0 - -2) / 42);
    }

    final void a(ha param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -121) {
                break L1;
              } else {
                discarded$2 = this.a(-59);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 != this.field_t) {
                  break L3;
                } else {
                  uc.field_a.a((float)(this.field_k >> 1538054664), (float)(this.field_o >> 1016533960), 1024, 0, 0, (this.field_p * (128 / this.field_s) << 1199849944) + this.field_q, 1);
                  if (!Sumoblitz.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              im.field_a.a((float)(this.field_k >> 1988628584), (float)(this.field_o >> 1218913224), 4096, 0, 0, (this.field_p * (128 / this.field_s) << 677098712) + this.field_q, 1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("as.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    as(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        this.field_z = param5;
        this.field_t = param6;
        this.field_s = param0;
        this.field_u = param4;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (ce.field_o == null) {
                break L1;
              } else {
                ce.field_o.field_B.a(param1, false);
                break L1;
              }
            }
            L2: {
              if (ro.field_a == null) {
                break L2;
              } else {
                ro.field_a.field_E.a(param1, false);
                break L2;
              }
            }
            L3: {
              if (param0 == 256) {
                break L3;
              } else {
                field_y = (int[]) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("as.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (this.field_s <= this.field_p) {
            break L0;
          } else {
            L1: {
              L2: {
                this.field_k = this.field_k + this.field_u;
                this.field_o = this.field_o + this.field_z;
                this.field_u = this.field_u * 251 / 285;
                this.field_z = this.field_z * 251 / 285;
                if (-1 >= (this.field_u ^ -1)) {
                  break L2;
                } else {
                  this.field_u = this.field_u - 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_u = this.field_u + 1;
              break L1;
            }
            L3: {
              if ((this.field_z ^ -1) <= -1) {
                break L3;
              } else {
                this.field_z = this.field_z - 1;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            this.field_z = this.field_z + 1;
            break L0;
          }
        }
        L4: {
          if (param0 == -2567) {
            break L4;
          } else {
            as.e(-88);
            break L4;
          }
        }
        return super.a(param0 + 0);
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_x = "lives: ";
            field_y = new int[256];
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (8 <= var2) {
                    field_y[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0 ^ -1) == -2) {
                      var0 = var0 >>> -1832820543 ^ -306674912;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
