/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    private vb[] field_g;
    private int field_e;
    String field_j;
    static pd field_f;
    static km field_i;
    static int field_c;
    float field_a;
    private int field_d;
    private int field_b;
    static boolean field_h;

    private final void a(vb param0, int param1, int param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)param2 / 100.0f + (float)(1 + ((qc) this).field_d);
            if (param2 == 0) {
                ((qc) this).field_j = param0.field_b;
            } else {
                ((qc) this).field_j = param0.field_e + " - " + param2 + "%";
            }
            if (param1 > -19) {
                qc.a(85, (byte) -81);
            }
            ((qc) this).field_a = var4_float * (float)((qc) this).field_b / (float)(1 + ((qc) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qc.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static hh a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        hh var7 = null;
        int var8 = 0;
        hh stackIn_3_0 = null;
        hh stackIn_7_0 = null;
        hh stackIn_11_0 = null;
        hh stackIn_17_0 = null;
        hh stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_6_0 = null;
        hh stackOut_10_0 = null;
        hh stackOut_21_0 = null;
        hh stackOut_16_0 = null;
        hh stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_6_0 = cb.field_a;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3 = ql.a(param1, (byte) -123, '.');
                if (2 > var3.length) {
                  stackOut_10_0 = a.field_H;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      L2: {
                        if (param0 == 28320) {
                          break L2;
                        } else {
                          qc.a((byte) 90);
                          break L2;
                        }
                      }
                      stackOut_21_0 = jm.a(true, var3[-1 + var3.length]);
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = vf.a(var6, 8286);
                      if (var7 != null) {
                        stackOut_16_0 = (hh) var7;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = a.field_H;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("qc.D(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0;
    }

    final boolean a(boolean param0) {
        vb var2 = null;
        int var3 = 0;
        vb var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        L0: while (true) {
          if (((qc) this).field_e <= ((qc) this).field_d) {
            if (!param0) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((qc) this).field_g[((qc) this).field_d];
            var2 = var4;
            if (var4.field_f.c(0)) {
              L1: {
                if (var4.field_m < 0) {
                  break L1;
                } else {
                  if (!var4.field_f.c((byte) 81, var4.field_m)) {
                    this.a(var2, -50, var4.field_f.b((byte) 105, var4.field_m));
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_k == null) {
                  break L2;
                } else {
                  if (var4.field_f.a((byte) -102, var4.field_k)) {
                    break L2;
                  } else {
                    this.a(var2, -97, var4.field_f.a(var4.field_k, 126));
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_m >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_k) {
                    break L3;
                  } else {
                    if (null == var4.field_e) {
                      break L3;
                    } else {
                      if (!var4.field_f.b(25867)) {
                        this.a(var2, -95, var4.field_f.a(-2677));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((qc) this).field_d = ((qc) this).field_d + 1;
              continue L0;
            } else {
              this.a(var4, -87, 0);
              return false;
            }
          }
        }
    }

    final static mg[] a(int param0, mg param1) {
        mg[] var2 = null;
        RuntimeException var2_ref = null;
        mg[] var3 = null;
        Object stackIn_2_0 = null;
        mg[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new mg[9];
            var2 = var3;
            var3[4] = param1;
            if (param0 >= 16) {
              stackOut_3_0 = (mg[]) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mg[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("qc.F(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0) {
        ph.field_l[me.field_b] = df.field_d;
        pb.field_i[me.field_b] = df.field_i;
        m.field_i[me.field_b] = df.field_k;
        ng.field_O[me.field_b] = df.field_g;
        qe.field_h[me.field_b] = df.field_h;
        kn.field_K[me.field_b] = df.field_e;
        se.field_e[me.field_b] = df.field_f;
        if (param0 <= 96) {
          return;
        } else {
          me.field_b = me.field_b + 1;
          return;
        }
    }

    final static void b(byte param0) {
        if (ug.a(true)) {
          if (param0 != -12) {
            qc.b((byte) -103);
            nm.a(false, 4, (byte) 107);
            return;
          } else {
            nm.a(false, 4, (byte) 107);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 81) {
            return;
        }
        hd.field_f = 1000000000L / (long)param0;
    }

    public static void a(byte param0) {
        if (param0 != 9) {
            field_c = -88;
            field_i = null;
            field_f = null;
            return;
        }
        field_i = null;
        field_f = null;
    }

    private qc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
    }
}
