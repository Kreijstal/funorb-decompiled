/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ml extends da implements od {
    static String field_k;
    static int field_j;
    static String field_m;
    static qr field_l;
    private go field_i;

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 16647) {
          if (null != this.field_i.field_s) {
            if (this.field_i.field_s.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          field_l = (qr) null;
          if (null == this.field_i.field_s) {
            return true;
          } else {
            L0: {
              if (this.field_i.field_s.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final u a(boolean param0) {
        if (param0) {
          field_m = (String) null;
          return this.b(-11196, this.field_i.field_s);
        } else {
          return this.b(-11196, this.field_i.field_s);
        }
    }

    abstract u b(int param0, String param1);

    abstract String a(boolean param0, String param1);

    final static void a(int param0, int param1, int param2, int param3, bi param4, int param5, int param6) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param5 = param5 - param4.field_t;
              param2 = param2 - param4.field_x;
              if (param6 == 16403) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            var7_int = param5 + param4.field_z * param2;
            var8 = param3 + param0 * gf.field_b;
            L2: while (true) {
              param1--;
              if ((param1 ^ -1) > -1) {
                break L0;
              } else {
                incrementValue$4 = var7_int;
                var7_int++;
                var9 = param4.field_B[incrementValue$4];
                var10 = gf.field_h[var8];
                var11 = var9 + var10;
                var9 = (var9 & 16711935) + (var10 & 16711935);
                var10 = (var9 & 16777472) - -(-var9 + var11 & 65536);
                incrementValue$5 = var8;
                var8++;
                gf.field_h[incrementValue$5] = ee.a(-(var10 >>> -629182872) + var10, var11 - var10);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7);

            stackIn_9_1 = new StringBuilder().append("ml.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final void a(int param0, go param1) {
        try {
            if (param0 != 4340) {
                go var4 = (go) null;
                this.a(27, (go) null);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ml.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(go param0, int param1) {
        try {
            this.b(-85);
            if (param1 != 95) {
                this.c((byte) -44);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ml.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        eh var2;
        if (param0 >= 96) {
          tg.field_c.b(param1, -43);
          var2 = wi.field_c;
          if (var2 != null) {
            var2.a(tg.field_c.field_N, tg.field_c.field_B, (byte) -66);
            return;
          } else {
            return;
          }
        } else {
          field_l = (qr) null;
          tg.field_c.b(param1, -43);
          var2 = wi.field_c;
          if (var2 == null) {
            return;
          } else {
            var2.a(tg.field_c.field_N, tg.field_c.field_B, (byte) -66);
            return;
          }
        }
    }

    public static void d(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 != -65) {
            return;
        }
        field_k = null;
    }

    final String c(byte param0) {
        if (param0 <= 61) {
          field_k = (String) null;
          return this.a(false, this.field_i.field_s);
        } else {
          return this.a(false, this.field_i.field_s);
        }
    }

    ml(go param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = 4;
        field_k = "Select a system to anchor the other end of the Tannhäuser wormhole, or right click to cancel this project.";
        field_m = "Report <%0> for abuse";
    }
}
