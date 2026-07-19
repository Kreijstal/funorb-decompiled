/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mha extends rj {
    static long field_D;
    private nua field_z;
    private int field_A;
    private static String[] field_B;
    static int field_C;
    static String field_F;
    static int field_E;

    final String d(byte param0) {
        int var2 = -38 / ((-58 - param0) / 60);
        if (!this.field_f) {
            return null;
        }
        return this.field_z.a(127);
    }

    public static void b(int param0) {
        field_B = null;
        if (param0 != -23897) {
            return;
        }
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            this.field_A = this.field_A + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mha.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    mha(nua param0) {
        try {
            this.field_z = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        it var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        iu var14 = null;
        iu var21 = null;
        iu var22 = null;
        iu var23 = null;
        iu var24 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, 0, param3);
        if (param3 == param2) {
          var5 = (this.field_m >> -1655065343) + this.field_i + param0;
          var6 = (this.field_p >> 977829985) + param1 - -this.field_n;
          var8 = this.field_z.b(-4666);
          if (gla.field_p != var8) {
            if (tea.field_b != var8) {
              if (fp.field_c != var8) {
                if (uh.field_k == var8) {
                  var22 = pq.field_b[1];
                  var22.a(var5 + -(var22.field_m >> 209900129), -(var22.field_q >> -1354890975) + var6, 256);
                  if (var11 != 0) {
                    L0: {
                      var23 = pq.field_b[2];
                      var23.a(var5 + -(var23.field_m >> -947988767), var6 + -(var23.field_q >> 562582945), 256);
                      var24 = pq.field_b[0];
                      var9 = var24.field_n << -575421567;
                      var10 = var24.field_k << -2008834943;
                      if (null == aj.field_l) {
                        break L0;
                      } else {
                        if (aj.field_l.field_m < var9) {
                          break L0;
                        } else {
                          if (var10 > aj.field_l.field_q) {
                            break L0;
                          } else {
                            nm.a(aj.field_l, (byte) 95);
                            bea.a();
                            aj.field_l = new iu(var9, var10);
                            nm.a(aj.field_l, (byte) 108);
                            var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                            pfa.a(1);
                            aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                            return;
                          }
                        }
                      }
                    }
                    aj.field_l = new iu(var9, var10);
                    nm.a(aj.field_l, (byte) 108);
                    var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var23 = pq.field_b[2];
                var23.a(var5 + -(var23.field_m >> -947988767), var6 + -(var23.field_q >> 562582945), 256);
                if (var11 != 0) {
                  var24 = pq.field_b[0];
                  var9 = var24.field_n << -575421567;
                  var10 = var24.field_k << -2008834943;
                  if (null != aj.field_l) {
                    if (aj.field_l.field_m >= var9) {
                      if (var10 <= aj.field_l.field_q) {
                        nm.a(aj.field_l, (byte) 95);
                        bea.a();
                        if (var11 != 0) {
                          aj.field_l = new iu(var9, var10);
                          nm.a(aj.field_l, (byte) 108);
                          var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                          pfa.a(1);
                          aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                          return;
                        } else {
                          var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                          pfa.a(1);
                          aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                          return;
                        }
                      } else {
                        aj.field_l = new iu(var9, var10);
                        nm.a(aj.field_l, (byte) 108);
                        var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                        pfa.a(1);
                        aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                        return;
                      }
                    } else {
                      aj.field_l = new iu(var9, var10);
                      nm.a(aj.field_l, (byte) 108);
                      var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                      pfa.a(1);
                      aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                      return;
                    }
                  } else {
                    aj.field_l = new iu(var9, var10);
                    nm.a(aj.field_l, (byte) 108);
                    var24.a(112, 144, var24.field_n << 495482532, var24.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var24.field_n + var5, var6 - var24.field_k, 256);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              var21 = pq.field_b[0];
              var9 = var21.field_n << -575421567;
              var10 = var21.field_k << -2008834943;
              if (null != aj.field_l) {
                if (aj.field_l.field_m >= var9) {
                  if (var10 <= aj.field_l.field_q) {
                    nm.a(aj.field_l, (byte) 95);
                    bea.a();
                    if (var11 != 0) {
                      aj.field_l = new iu(var9, var10);
                      nm.a(aj.field_l, (byte) 108);
                      var21.a(112, 144, var21.field_n << 495482532, var21.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                      pfa.a(1);
                      aj.field_l.a(-var21.field_n + var5, var6 - var21.field_k, 256);
                      return;
                    } else {
                      var21.a(112, 144, var21.field_n << 495482532, var21.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                      pfa.a(1);
                      aj.field_l.a(-var21.field_n + var5, var6 - var21.field_k, 256);
                      return;
                    }
                  } else {
                    aj.field_l = new iu(var9, var10);
                    nm.a(aj.field_l, (byte) 108);
                    var21.a(112, 144, var21.field_n << 495482532, var21.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var21.field_n + var5, var6 - var21.field_k, 256);
                    return;
                  }
                } else {
                  aj.field_l = new iu(var9, var10);
                  nm.a(aj.field_l, (byte) 108);
                  var21.a(112, 144, var21.field_n << 495482532, var21.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var21.field_n + var5, var6 - var21.field_k, 256);
                  return;
                }
              } else {
                aj.field_l = new iu(var9, var10);
                nm.a(aj.field_l, (byte) 108);
                var21.a(112, 144, var21.field_n << 495482532, var21.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                pfa.a(1);
                aj.field_l.a(-var21.field_n + var5, var6 - var21.field_k, 256);
                return;
              }
            }
          } else {
            var14 = pq.field_b[0];
            var9 = var14.field_n << -575421567;
            var10 = var14.field_k << -2008834943;
            if (null != aj.field_l) {
              if (aj.field_l.field_m >= var9) {
                if (var10 <= aj.field_l.field_q) {
                  nm.a(aj.field_l, (byte) 95);
                  bea.a();
                  if (var11 != 0) {
                    aj.field_l = new iu(var9, var10);
                    nm.a(aj.field_l, (byte) 108);
                    var14.a(112, 144, var14.field_n << 495482532, var14.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var14.field_n + var5, var6 - var14.field_k, 256);
                    return;
                  } else {
                    var14.a(112, 144, var14.field_n << 495482532, var14.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var14.field_n + var5, var6 - var14.field_k, 256);
                    return;
                  }
                } else {
                  aj.field_l = new iu(var9, var10);
                  nm.a(aj.field_l, (byte) 108);
                  var14.a(112, 144, var14.field_n << 495482532, var14.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var14.field_n + var5, var6 - var14.field_k, 256);
                  return;
                }
              } else {
                aj.field_l = new iu(var9, var10);
                nm.a(aj.field_l, (byte) 108);
                var14.a(112, 144, var14.field_n << 495482532, var14.field_k << -1562572412, -this.field_A << 1453014762, 4096);
                pfa.a(1);
                aj.field_l.a(-var14.field_n + var5, var6 - var14.field_k, 256);
                return;
              }
            } else {
              aj.field_l = new iu(var9, var10);
              nm.a(aj.field_l, (byte) 108);
              var14.a(112, 144, var14.field_n << 495482532, var14.field_k << -1562572412, -this.field_A << 1453014762, 4096);
              pfa.a(1);
              aj.field_l.a(-var14.field_n + var5, var6 - var14.field_k, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("mha.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_B = new String[5];
        field_B[3] = "Floating Rotator";
        field_B[0] = "Wheeled";
        field_B[4] = "Mirror Fixed";
        field_B[1] = "Mirror Base";
        field_B[2] = "Rotator";
        field_E = 480;
        field_F = "Cancel";
    }
}
