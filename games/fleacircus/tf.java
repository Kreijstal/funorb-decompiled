/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends dk {
    int field_F;
    static ob field_H;
    static vc field_E;
    static ob field_G;

    tf(qa param0) {
        super(param0.field_y, param0.field_z, param0.field_u, param0.field_j, (ch) null, (kd) null);
        try {
            param0.a(0, this.field_u, 0, this.field_j, 80);
            this.field_A = param0;
            this.field_F = 256;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public tf() {
        super(0, 0, 0, 0, (ch) null, (kd) null);
        this.field_F = 256;
    }

    final static String a(ni param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param0.d(-13583);
                  if (var3_int <= param2) {
                    break L2;
                  } else {
                    var3_int = param2;
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_i = param0.field_i + qg.field_e.a(param0.field_k, param0.field_i, 0, var3_int, var4, param1 + -1);
                var5 = pg.a(var3_int, 0, var4, param1);
                stackOut_2_0 = (String) (var5);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackOut_4_0 = "Cabbage";
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3_ref);
            stackOut_6_1 = new StringBuilder().append("tf.DA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        field_G = null;
        field_H = null;
        field_E = null;
        if (param0 == 0) {
            return;
        }
        ni var2 = (ni) null;
        String discarded$0 = tf.a((ni) null, 24, -4);
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (!(this.field_A != null)) {
            return;
        }
        if (this.field_F == 0) {
            return;
        }
        if (!(-257 != (this.field_F ^ -1))) {
            this.field_A.b(this.field_z + param0, this.field_y + param1, true, param3);
            return;
        }
        dd var6 = new dd(this.field_A.field_u, this.field_A.field_j);
        r.a(var6, 45);
        this.field_A.b(0, 0, param2, param3);
        ia.a(-107);
        var6.c(this.field_y + param1, param0 + this.field_z, this.field_F);
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_G = (ob) null;
                break L1;
              }
            }
            stackOut_2_0 = em.field_c.a(0, param1, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("tf.EA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void d(boolean param0) {
        L0: {
          if (nb.field_a != null) {
            nb.field_a.k(-110);
            break L0;
          } else {
            break L0;
          }
        }
        if (em.field_g == null) {
          if (!param0) {
            field_H = (ob) null;
            bc.s(-33);
            return;
          } else {
            bc.s(-33);
            return;
          }
        } else {
          em.field_g.n(100);
          if (param0) {
            bc.s(-33);
            return;
          } else {
            field_H = (ob) null;
            bc.s(-33);
            return;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (param2 == -2) {
                break L1;
              } else {
                tf.d(false);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if ((param1 ^ -1) >= -2) {
                      break L5;
                    } else {
                      var6 = 1 & param1 ^ -1;
                      var5 = -1;
                      if (var4 != 0) {
                        if (var5 == var6) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          if (var5 != var6) {
                            var3_int = var3_int * param0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        param0 = param0 * param0;
                        param1 = param1 >> 1;
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (1 == param1) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                stackOut_15_0 = var3_int;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
              stackOut_13_0 = var3_int * param0;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "tf.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    static {
        field_H = new ob();
        field_G = new ob();
    }
}
