/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iia extends jm {
    static int field_p;
    static sna field_m;
    static String field_o;
    private int field_r;
    static String field_q;
    static String field_n;

    final void a(boolean param0, op param1) {
        try {
            if (param0) {
                field_q = (String) null;
            }
            param1.field_S[this.field_r].field_c = true;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iia.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ub param0, int param1) {
        gj var4 = param0.field_o;
        gj var3 = var4;
        if (param1 > -2) {
            return;
        }
        try {
            var4.field_T[this.field_r] = 0;
            this.a(false, var3.field_h);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iia.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    iia(int param0) {
        this.field_j = 0;
        this.field_r = param0;
    }

    final static void a(int param0, vr param1) {
        le var2 = le.a(param1, "", "fridge4");
        if (param0 != -167571320) {
            return;
        }
        try {
            ni.field_l = (ss) ((Object) var2.a(0, 485, 0, -5120, 12800));
            ni.field_l.a(128, 122, 128);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iia.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, kv param3, int param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var21 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = (-param2 + param4 << 1118039656) / param3.field_n;
              param5 = param5 + param3.field_t;
              param1 = param1 + param3.field_u;
              var7 = (param2 << 218447976) + param3.field_t * var6_int;
              var8 = param1 * dg.field_i + param5;
              var9 = 0;
              var10 = param3.field_p;
              var12 = 41 % ((61 - param0) / 61);
              var11 = param3.field_q;
              var13 = -var11 + dg.field_i;
              if (param1 >= dg.field_j) {
                break L1;
              } else {
                var15 = dg.field_j - param1;
                var9 = var9 + var11 * var15;
                param1 = dg.field_j;
                var8 = var8 + dg.field_i * var15;
                var10 = var10 - var15;
                break L1;
              }
            }
            L2: {
              var14 = 0;
              if (param5 < dg.field_f) {
                var15 = -param5 + dg.field_f;
                var7 = var7 + var15 * var6_int;
                var13 = var13 + var15;
                var14 = var14 + var15;
                var8 = var8 + var15;
                param5 = dg.field_f;
                var11 = var11 - var15;
                var9 = var9 + var15;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (dg.field_k >= var10 + param1) {
                break L3;
              } else {
                var10 = var10 - (-dg.field_k + (param1 - -var10));
                break L3;
              }
            }
            L4: {
              if (dg.field_h < var11 + param5) {
                var15 = var11 + param5 - dg.field_h;
                var11 = var11 - var15;
                var13 = var13 + var15;
                var14 = var14 + var15;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if ((var10 ^ -1) >= -1) {
                  break L5;
                } else {
                  param1 = -var10;
                  L6: while (true) {
                    if (-1 >= (param1 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var15 = var7;
                      param5 = -var11;
                      L7: while (true) {
                        if (-1 >= (param5 ^ -1)) {
                          var8 = var8 + var13;
                          var9 = var9 + var14;
                          param1++;
                          continue L6;
                        } else {
                          L8: {
                            var16 = var15 >> -167571320;
                            var15 = var15 + var6_int;
                            var17 = -var16 + 256;
                            if (var16 >= 0) {
                              L9: {
                                incrementValue$1 = var9;
                                var9++;
                                var18 = param3.field_v[incrementValue$1];
                                if (var18 == 0) {
                                  break L9;
                                } else {
                                  if ((var16 ^ -1) < -256) {
                                    dg.field_e[var8] = var18;
                                    break L9;
                                  } else {
                                    var19 = dg.field_e[var8];
                                    var20 = (16711935 & var18) * var16 + (16711935 & var19) * var17 >> 1314859432 & 16711935;
                                    dg.field_e[var8] = var20 - -dda.a(var17 * dda.a(65280, var19) + var16 * dda.a(var18, 65280) >> -677565880, 65280);
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              break L8;
                            } else {
                              var8++;
                              var9++;
                              break L8;
                            }
                          }
                          param5++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("iia.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(pia param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        try {
            hl.field_C = param0;
            var2_int = 1000;
            var3 = 6 + (hl.field_C.field_F - -hl.field_C.field_B);
            if (!((1 & var3) != param1)) {
                var3++;
            }
            cea.field_i = new kv(var2_int, var3);
            oa.field_Bb = new kv(var2_int, var3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iia.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    iia(lu param0) {
        try {
            this.field_j = 0;
            this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(lu param0, byte param1) {
        try {
            int var3_int = -120 / ((37 - param1) / 38);
            param0.d(this.field_r, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "iia.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_n = null;
        field_q = null;
        field_m = null;
        if (param0 != 1314859432) {
            field_q = (String) null;
        }
    }

    static {
        field_o = "Accept rematch";
        field_n = "Owner";
        field_q = "To <%0>: ";
    }
}
