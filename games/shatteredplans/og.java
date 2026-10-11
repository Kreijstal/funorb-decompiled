/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements iq {
    static int[] field_c;
    static bg field_b;
    static String field_a;

    final static uj a(int param0, mn param1, fs param2, dc param3, int param4) {
        RuntimeException var5 = null;
        cj stackIn_5_0 = null;
        sc stackIn_8_0 = null;
        rj stackIn_11_0 = null;
        hg stackIn_14_0 = null;
        ma stackIn_18_0 = null;
        j stackIn_23_0 = null;
        ka stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -69) {
            field_b = (bg) null;
          }
          if (param0 == 2) {
            stackIn_5_0 = new cj(param3, param2, param1);
            return (uj) ((Object) stackIn_5_0);
          }
          if (4 == param0) {
            stackIn_8_0 = new sc(param3, param2, param1);
            return (uj) ((Object) stackIn_8_0);
          }
          if (5 == param0) {
            stackIn_11_0 = new rj(param3, param2, param1);
            return (uj) ((Object) stackIn_11_0);
          }
          if (param0 == 6) {
            stackIn_14_0 = new hg(param3, param2, param1);
            return (uj) ((Object) stackIn_14_0);
          }
          if (param0 == 7) {
            stackIn_18_0 = new ma(param3, param2, param1);
            return (uj) ((Object) stackIn_18_0);
          }
          if (param0 != 0 &&
            1 != param0) {
            stackIn_25_0 = new ka(param3, param2, param1, param0);
            return (uj) ((Object) stackIn_25_0);
          }
          stackIn_23_0 = new j(param3, param2, param1, param0);
          return (uj) ((Object) stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("og.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0) {
          field_b = (bg) null;
        }
        if (null == pd.field_j) {
          return;
        }
        var1 = pd.field_j;
        synchronized (var1) {
          pd.field_j = null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -1) {
          field_a = (String) null;
        }
    }

    final static void a(int param0, boolean param1) {
        le.field_e.a(0, param0, (byte) -66);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bi var8 = null;
        try {
          var6_int = param0.field_m + param1;
          if (param4 != 12) {
            return;
          }
          var7 = param3 + param0.field_q;
          rg.a((byte) -73, var7, param0.field_n, var6_int, param0.field_x);
          var8 = lp.field_w[1];
          if (param0 instanceof kg &&
            ((kg) (param0)).field_z) {
            var8.c(1 + (var6_int + (param0.field_x - var8.field_o >> 1)), (-var8.field_p + param0.field_n >> 1) + 1 + var7, 256);
          }
          if (!param0.f(param4 ^ 13)) {
            return;
          }
          dd.a(-4 + param0.field_n, 1, -4 + param0.field_x, var6_int + 2, 2 + var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("og.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, ln[] param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime2Lifetime1;
        int var6Lifetime3Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = -117 % ((param0 + 84) / 33);
          for (var5 = 0; param1.length > var5; var5++) {
            if (null != param1[var5]) {
              var7 = var5 / param2;
              stackIn_7_0 = (var7 % 2 != 0) ? 0 : 1;
              var8 = stackIn_7_0;
              var6 = 1 + var5;
              if (0 != var6 % param2 &&
                param1[var6] != null &&
                param1[var5].field_p < param1[var6].field_p) {
                param1[var5].a((byte) -123, param1[var6]);
                param1[var6].a((byte) -104, param1[var5]);
              }
              var6Lifetime1 = var5 - 1;
              if (var5 % param2 != 0 &&
                param1[var6Lifetime1] != null &&
                param1[var6Lifetime1].field_p > param1[var5].field_p) {
                param1[var5].a((byte) -87, param1[var6Lifetime1]);
                param1[var6Lifetime1].a((byte) -77, param1[var5]);
              }
              if (var7 > 0) {
                if (var5 % param2 != 0 ||
                  var8 == 0) {
                  if (var8 == 0) {
                    var6Lifetime2 = var5 - param2;
                  } else {
                    var6Lifetime2 = -param2 - 1 + var5;
                  }
                  if (param1[var6Lifetime2] != null &&
                    param1[var6Lifetime2].field_p > param1[var5].field_p) {
                    param1[var5].a((byte) -120, param1[var6Lifetime2]);
                    param1[var6Lifetime2].a((byte) -112, param1[var5]);
                  }
                }
                if (var8 != 0 ||
                  0 != (var5 + 1) % param2) {
                  if (var8 == 0) {
                    var6Lifetime2Lifetime1 = -param2 + var5 + 1;
                  } else {
                    var6Lifetime2Lifetime1 = -param2 + var5;
                  }
                  if (null != param1[var6Lifetime2Lifetime1] &&
                    param1[var6Lifetime2Lifetime1].field_p > param1[var5].field_p) {
                    param1[var5].a((byte) -93, param1[var6Lifetime2Lifetime1]);
                    param1[var6Lifetime2Lifetime1].a((byte) -88, param1[var5]);
                  }
                }
              }
              if (var7 < param3 - 1) {
                if (var8 == 0 ||
                  0 != var5 % param2) {
                  if (var8 != 0) {
                    var6Lifetime3 = var5 - (-param2 + 1);
                  } else {
                    var6Lifetime3 = var5 + param2;
                  }
                  if (null != param1[var6Lifetime3] &&
                    param1[var6Lifetime3].field_p > param1[var5].field_p) {
                    param1[var5].a((byte) -81, param1[var6Lifetime3]);
                    param1[var6Lifetime3].a((byte) -124, param1[var5]);
                  }
                }
                if (var8 != 0 ||
                  (var5 + 1) % param2 != 0) {
                  if (var8 == 0) {
                    var6Lifetime3Lifetime1 = param2 + var5 + 1;
                  } else {
                    var6Lifetime3Lifetime1 = param2 + var5;
                  }
                  if (param1[var6Lifetime3Lifetime1] != null &&
                    param1[var5].field_p < param1[var6Lifetime3Lifetime1].field_p) {
                    param1[var5].a((byte) -83, param1[var6Lifetime3Lifetime1]);
                    param1[var6Lifetime3Lifetime1].a((byte) -104, param1[var5]);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_62_0 = var4;
          stackIn_62_1 = new StringBuilder().append("og.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = new bg("email");
        field_a = "Rules: Classic";
    }
}
