/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    String field_g;
    static jp field_d;
    private int field_b;
    private int field_c;
    float field_e;
    private int field_h;
    private po[] field_f;
    static String field_a;

    final void a(mf param0, boolean param1, String param2, String param3) {
        try {
            if (param1) {
                ((s) this).field_c = -45;
            }
            this.a((String) null, param2, param3, param0, -1, 99);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "s.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean d(int param0) {
        int var3 = 0;
        po var5 = null;
        po var6 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 > -94) {
          field_d = null;
          L0: while (true) {
            if (((s) this).field_c < ((s) this).field_b) {
              var6 = ((s) this).field_f[((s) this).field_c];
              if (!var6.field_b.a((byte) -127)) {
                this.a(0, -22269, var6);
                return false;
              } else {
                L1: {
                  if (0 > var6.field_h) {
                    break L1;
                  } else {
                    if (!var6.field_b.a(-13083, var6.field_h)) {
                      this.a(var6.field_b.d(var6.field_h, -27509), -22269, var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var6.field_d == null) {
                    break L2;
                  } else {
                    if (var6.field_b.a(var6.field_d, -28138)) {
                      break L2;
                    } else {
                      this.a(var6.field_b.b(0, var6.field_d), -22269, var6);
                      return false;
                    }
                  }
                }
                L3: {
                  if (var6.field_h >= 0) {
                    break L3;
                  } else {
                    if (null != var6.field_d) {
                      break L3;
                    } else {
                      if (var6.field_g == null) {
                        break L3;
                      } else {
                        if (var6.field_b.a(108)) {
                          break L3;
                        } else {
                          this.a(var6.field_b.b(-4126), -22269, var6);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((s) this).field_c = ((s) this).field_c + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((s) this).field_c < ((s) this).field_b) {
              var5 = ((s) this).field_f[((s) this).field_c];
              if (!var5.field_b.a((byte) -127)) {
                this.a(0, -22269, var5);
                return false;
              } else {
                L5: {
                  if (0 > var5.field_h) {
                    break L5;
                  } else {
                    if (!var5.field_b.a(-13083, var5.field_h)) {
                      this.a(var5.field_b.d(var5.field_h, -27509), -22269, var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5.field_d == null) {
                    break L6;
                  } else {
                    if (var5.field_b.a(var5.field_d, -28138)) {
                      break L6;
                    } else {
                      this.a(var5.field_b.b(0, var5.field_d), -22269, var5);
                      return false;
                    }
                  }
                }
                L7: {
                  if (var5.field_h >= 0) {
                    break L7;
                  } else {
                    if (null != var5.field_d) {
                      break L7;
                    } else {
                      if (var5.field_g == null) {
                        break L7;
                      } else {
                        if (var5.field_b.a(108)) {
                          break L7;
                        } else {
                          this.a(var5.field_b.b(-4126), -22269, var5);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((s) this).field_c = ((s) this).field_c + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final void a(String param0, String param1, int param2, String param3, mf param4) {
        try {
            this.a(param1, param0, param3, param4, -1, -90);
            int var6_int = -82 / ((73 - param2) / 51);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "s.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(String param0, String param1, String param2, mf param3, int param4, int param5) {
        po[] var10 = null;
        po var9 = null;
        po var11 = null;
        try {
            if (((s) this).field_b >= ((s) this).field_f.length) {
                var10 = new po[2 * ((s) this).field_b];
                po[] var7 = var10;
                pm.a((Object[]) (Object) ((s) this).field_f, 0, (Object[]) (Object) var10, 0, ((s) this).field_b);
                ((s) this).field_f = var10;
            }
            var9 = new po();
            var11 = var9;
            po var7_ref = var11;
            var11.field_f = param1;
            int var8 = 0 / ((26 - param5) / 51);
            var11.field_g = param2;
            var11.field_b = param3;
            var11.field_d = param0;
            var11.field_h = -1;
            int fieldTemp$0 = ((s) this).field_b;
            ((s) this).field_b = ((s) this).field_b + 1;
            ((s) this).field_f[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "s.J(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + -1 + 44 + param5 + 41);
        }
    }

    final static void a() {
        Object var2 = null;
        fr.a(true, (String) null, am.field_cc);
    }

    final static void b(int param0) {
        Object var2 = null;
        mh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        mh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        mh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        mh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        mh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        mh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        L0: {
          stackOut_0_0 = qb.field_v;
          stackOut_0_1 = 18;
          stackOut_0_2 = 0;
          stackOut_0_3 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (vd.field_e) {
            stackOut_2_0 = (mh) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 2 + (ec.field_J - -2) - -40;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (mh) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        ((mh) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, -stackIn_3_4 + vn.field_A.field_Ib, (byte) 64);
        ij.field_a.a(18, 0, -42 + vn.field_A.field_Ib + -ec.field_J, 42 + ec.field_J, (byte) 64);
        if (param0 < 122) {
          var2 = null;
          s.a((jp) null, -53, 56, (jp) null, (pb) null, -22, (byte) -5, (jp) null);
          fo.field_b.a(2, (byte) -118, vn.field_A.field_Ib, 0, 20, ec.field_J, vn.field_A.field_cb - 20);
          return;
        } else {
          fo.field_b.a(2, (byte) -118, vn.field_A.field_Ib, 0, 20, ec.field_J, vn.field_A.field_cb - 20);
          return;
        }
    }

    final static boolean a(int param0) {
        int var1 = -28;
        return tn.field_m != null ? true : false;
    }

    final static void a(jp param0, int param1, int param2, jp param3, pb param4, int param5, byte param6, jp param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            fc.a(-72, param4.field_p);
            lb.g(0, 0, param4.field_i, param4.field_q, kg.field_d[param2], 22953);
            param3.c((-param3.field_x + param4.field_i) / 2 - 147 / param1, 480 + param5 + -param7.field_z);
            param0.b(-(80 / param1) + (param4.field_i - param0.field_x) / 2, -(201 / param1) + (param4.field_q + param5) + -param0.field_z, 41, 110);
            var8_int = -97 / ((param6 - 54) / 61);
            sc.b(-95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("s.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param7 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    s(int param0) {
        ((s) this).field_f = new po[16];
        ((s) this).field_h = param0;
    }

    public static void c(int param0) {
        field_a = null;
        field_d = null;
        if (param0 == 4862) {
            return;
        }
        s.c(25);
    }

    private final void a(int param0, int param1, po param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              var4_float = (float)param0 / 100.0f + (float)(((s) this).field_c + 1);
              ((s) this).field_e = (float)((s) this).field_h * var4_float / (float)(1 + ((s) this).field_b);
              if (param0 == 0) {
                ((s) this).field_g = param2.field_f;
                break L1;
              } else {
                ((s) this).field_g = param2.field_g + " - " + param0 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("s.F(").append(param0).append(44).append(-22269).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Offer unrated rematch";
    }
}
