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
                this.field_c = -45;
            }
            this.a((String) null, param2, param3, param0, -1, 99);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "s.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(int param0) {
        int var3;
        po var4;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (param0 <= -94) {
            break L0;
          } else {
            field_d = (jp) null;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_c < this.field_b) {
            var4 = this.field_f[this.field_c];
            if (!var4.field_b.a((byte) -127)) {
              this.a(0, -22269, var4);
              return false;
            } else {
              L2: {
                if (0 > var4.field_h) {
                  break L2;
                } else {
                  if (!var4.field_b.a(-13083, var4.field_h)) {
                    this.a(var4.field_b.d(var4.field_h, -27509), -22269, var4);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_d == null) {
                  break L3;
                } else {
                  if (var4.field_b.a(var4.field_d, -28138)) {
                    break L3;
                  } else {
                    this.a(var4.field_b.b(0, var4.field_d), -22269, var4);
                    return false;
                  }
                }
              }
              L4: {
                if (-1 >= (var4.field_h ^ -1)) {
                  break L4;
                } else {
                  if (null != var4.field_d) {
                    break L4;
                  } else {
                    if (var4.field_g == null) {
                      break L4;
                    } else {
                      if (var4.field_b.a(108)) {
                        break L4;
                      } else {
                        this.a(var4.field_b.b(-4126), -22269, var4);
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_c = this.field_c + 1;
              continue L1;
            }
          } else {
            return true;
          }
        }
    }

    final void a(String param0, String param1, int param2, String param3, mf param4) {
        try {
            this.a(param1, param0, param3, param4, -1, -90);
            int var6_int = -82 / ((73 - param2) / 51);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "s.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(String param0, String param1, String param2, mf param3, int param4, int param5) {
        po[] var10 = null;
        po var9 = null;
        po var11 = null;
        int fieldTemp$0 = 0;
        try {
            if (this.field_b >= this.field_f.length) {
                var10 = new po[2 * this.field_b];
                po[] var7 = var10;
                pm.a(this.field_f, 0, var10, 0, this.field_b);
                this.field_f = var10;
            }
            var9 = new po();
            var11 = var9;
            po var7_ref = var11;
            var11.field_f = param1;
            int var8 = 0 / ((26 - param5) / 51);
            var11.field_g = param2;
            var11.field_b = param3;
            var11.field_d = param0;
            var11.field_h = param4;
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_f[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "s.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        fr.a(true, (String) null, am.field_cc);
        if (param0 == -30) {
            return;
        }
        field_a = (String) null;
    }

    final static void b(int param0) {
        jp var2;
        mh stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        mh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        L0: {
          stackIn_2_0 = qb.field_v;

          stackIn_2_1 = 18;

          stackIn_2_2 = 0;

          stackIn_2_3 = 0;

          if (vd.field_e) {
            stackIn_3_0 = (mh) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = stackIn_2_3;
            stackIn_3_4 = 2 + (ec.field_J - -2) - -40;
            break L0;
          } else {
            stackIn_3_0 = (mh) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = stackIn_2_3;
            stackIn_3_4 = 0;
            break L0;
          }
        }
        ((mh) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, -stackIn_3_4 + vn.field_A.field_Ib, (byte) 64);
        ij.field_a.a(18, 0, -42 + vn.field_A.field_Ib + -ec.field_J, 42 + ec.field_J, (byte) 64);
        if (param0 < 122) {
          var2 = (jp) null;
          s.a((jp) null, -53, 56, (jp) null, (pb) null, -22, (byte) -5, (jp) null);
          fo.field_b.a(2, (byte) -118, vn.field_A.field_Ib, 0, 20, ec.field_J, vn.field_A.field_cb - 20);
          return;
        } else {
          fo.field_b.a(2, (byte) -118, vn.field_A.field_Ib, 0, 20, ec.field_J, vn.field_A.field_cb - 20);
          return;
        }
    }

    final static boolean a(int param0) {
        int var1 = -86 / ((28 - param0) / 42);
        return tn.field_m != null ? true : false;
    }

    final static void a(jp param0, int param1, int param2, jp param3, pb param4, int param5, byte param6, jp param7) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
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
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("s.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
    }

    s(int param0) {
        this.field_f = new po[16];
        this.field_h = param0;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_float = (float)param0 / 100.0f + (float)(this.field_c + 1);
            this.field_e = (float)this.field_h * var4_float / (float)(1 + this.field_b);
            if (param1 == -22269) {
              break L0;
            } else {
              s.b(116);
              break L0;
            }
          }
          if (-1 == (param0 ^ -1)) {
            this.field_g = param2.field_f;
            return;
          } else {
            this.field_g = param2.field_g + " - " + param0 + "%";
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("s.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_a = "Offer unrated rematch";
    }
}
