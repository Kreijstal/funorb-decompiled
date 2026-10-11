/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends lm {
    private int field_m;
    static int[] field_j;
    static String field_p;
    static e field_n;
    private String field_k;
    static gn field_q;
    private int field_l;
    private int field_i;
    static String field_r;
    private int field_g;
    private int field_f;
    private qi field_o;
    private boolean field_h;
    static int field_e;

    final void a(int param0, String param1, int param2, int param3, int param4, qi param5, int param6, int param7) {
        lf stackIn_35_0;
        lf stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        lf stackIn_36_0 = null;
        lf stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        lf stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        lf var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = HoldTheLine.field_D;
        try {
          if (0 == param2) {
            param2 = param5.field_F;
          }
          if (param1 == null) {
            this.field_b = null;
            return;
          }
          if (this.field_o == param5 &&
            !this.field_h &&
            this.field_g == param7 &&
            param6 == this.field_l &&
            this.field_m == param2 &&
            this.field_i == param4 &&
            this.field_f == param0 &&
            null != this.field_k &&
            this.field_k.equals(param1)) {
            return;
          }
          this.field_o = param5;
          this.field_i = param4;
          this.field_l = param6;
          this.field_f = param0;
          this.field_m = param2;
          this.field_g = param7;
          this.field_k = param1;
          this.field_h = false;
          var16 = new String[param3 + param5.d(param1, param0)];
          var17 = var16;
          var10 = Math.max(1, param5.a(param1, new int[]{param0}, var17));
          if (this.field_l == 3 &&
            1 == var10) {
            this.field_l = 1;
          }
          if (0 == this.field_l) {
            var11 = param5.field_G;
          } else {
            if (1 == this.field_l) {
              var11 = (-(var10 * this.field_m) + this.field_i >> 1) + param5.field_G;
            } else {
              if (this.field_l == 2) {
                var11 = this.field_i - param5.field_I - var10 * this.field_m;
              } else {
                var12 = (-(this.field_m * var10) + this.field_i) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = var12 + param5.field_G;
                this.field_m = this.field_m + var12;
              }
            }
          }
          this.field_b = new lf[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = var11 - param5.field_G;
            stackIn_35_3 = param5.field_I + var11;
            if (var13 == null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var13.length();
            }
            var14 = new lf(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param5.a(var13);
              stackIn_39_0 = var14;
              if (param7 != 3) {
                stackIn_40_1 = 0;
              } else {
                stackIn_40_1 = this.a(param5.a(var13), param0, var13, (byte) -115);
              }
              oc.a(stackIn_39_0, stackIn_40_1, param5, 120, var13);
            }
            this.field_b[var12Lifetime1] = var14;
            var11 = var11 + param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("lg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        if (!param0) {
          field_n = null;
          field_r = null;
          field_q = null;
          field_j = null;
          return;
        }
        lg.b(true);
        field_n = null;
        field_r = null;
        field_q = null;
        field_j = null;
    }

    private final lf a(int param0, String param1, qi param2, int param3) {
        lf var5 = null;
        RuntimeException var5_ref = null;
        lf var6 = null;
        lf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 83) {
            lg.a(true);
          }
          var6 = new lf(-param2.field_G + param3, param3 + param2.field_I, param1.length());
          var5 = var6;
          this.field_b = new lf[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("lg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, int param3, qi param4) {
        lf var7 = null;
        lf var8 = null;
        if (param0 == null) {
          this.field_b = null;
          return;
        }
        if (param4 == this.field_o && this.field_h && this.field_g == 0 && this.field_k != null &&
          this.field_k.equals(param0)) {
          return;
        }
        try {
          this.field_k = param0;
          this.field_o = param4;
          this.field_g = 0;
          this.field_h = true;
          var7 = this.a(122, param0, param4, param2);
          var8 = var7;
          var7.field_c[0] = param3;
          if (param1 != -12476) {
            field_j = (int[]) null;
          }
          var8.field_c[param0.length()] = param4.a(param0) + param3;
          oc.a(var8, 0, param4, 123, param0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "lg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, qi param2, int param3, int param4) {
        lf var8 = null;
        lf var9 = null;
        if (param1 != 965) {
          this.field_h = false;
        }
        if (param0 == null) {
          this.field_b = null;
          return;
        }
        if (param2 == this.field_o &&
          this.field_h &&
          this.field_g == 2 &&
          null != this.field_k &&
          this.field_k.equals(param0)) {
          return;
        }
        try {
          this.field_g = 2;
          this.field_h = true;
          this.field_o = param2;
          this.field_k = param0;
          var8 = this.a(122, param0, param2, param3);
          var9 = var8;
          var9.field_c[0] = param4 - param2.a(param0);
          var9.field_c[param0.length()] = param4;
          oc.a(var9, 0, param2, 113, param0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "lg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(qi param0, byte param1, int param2, String param3, int param4) {
        lf var8 = null;
        int var7 = 0;
        if (param3 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_o == param0 && this.field_h && this.field_g == 1 && null != this.field_k &&
          this.field_k.equals(param3)) {
          return;
        }
        try {
          this.field_h = true;
          this.field_o = param0;
          if (param1 != -37) {
            this.field_o = (qi) null;
          }
          this.field_g = 1;
          var8 = this.a(117, param3, param0, param2);
          var7 = param0.a(param3);
          var8.field_c[0] = param4 - (var7 >> 1);
          var8.field_c[param3.length()] = param4 + (var7 >> 1);
          oc.a(var8, 0, param0, param1 ^ -93, param3);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "lg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public lg() {
    }

    final static ui a(db param0, byte param1) {
        ui var2 = null;
        RuntimeException var2_ref = null;
        db var3 = null;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -68) {
            var3 = (db) null;
            lg.a((db) null, (byte) 118);
          }
          var2 = new ui(param0, param0);
          ol.field_b.a((byte) -127, var2);
          pk.field_H.a(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("lg.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          lg.b(true);
        }
        if (ic.field_d == null) {
          return;
        }
        var1 = ic.field_d;
        synchronized (var1) {
          ic.field_d = null;
        }
    }

    static {
        field_j = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        field_p = "Retry";
        field_r = "Prev";
        field_n = new e(13, 0, 1, 0);
    }
}
