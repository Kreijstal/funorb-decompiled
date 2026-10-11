/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends wd {
    int field_D;
    int field_L;
    int field_P;
    float field_E;
    float field_A;
    private int field_O;
    qm field_H;
    int field_z;
    qm field_U;
    float field_K;
    static int field_y;
    static ge field_G;
    static String field_J;
    int field_B;
    int field_N;
    int field_R;
    qm field_F;
    static boolean field_T;
    private int field_S;
    qm field_Q;
    float field_I;
    static int field_M;

    final static boolean a(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0) {
            field_M = 1;
          }
          try {
            if (!ib.field_s.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (var3 >= param1.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("hn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final in g(int param0) {
        float var2 = this.field_E;
        var2 = var2 + (this.field_I < this.field_E ? 1.5707963705062866f : -1.5707963705062866f);
        if (param0 != -1) {
          return (in) null;
        }
        return new in(var2);
    }

    final qm l(int param0) {
        if (param0 != 8421504) {
          this.field_E = 0.36725643277168274f;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_D * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_D * Math.sin((double)this.field_I)));
    }

    final in a(boolean param0) {
        float var2 = this.field_I;
        var2 = var2 + (!(this.field_E > this.field_I) ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0) {
          this.field_S = -21;
        }
        return new in(var2);
    }

    final qm a(float param0, int param1) {
        float var3 = this.field_E + (-this.field_E + this.field_I) * param0;
        if (param1 != 255) {
          this.h(78);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_O * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_O * Math.sin((double)var3)));
    }

    final qm a(float param0, boolean param1) {
        float var3 = this.field_E + (this.field_I - this.field_E) * param0;
        if (param1) {
          return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_S * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_S * Math.sin((double)var3)));
    }

    final qm h(int param0) {
        if (param0 != 7560980) {
          this.a(0.218789204955101f, (byte) 23);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_O * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_O * Math.sin((double)this.field_I)));
    }

    final qm a(int param0) {
        if (param0 != 0) {
          return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_z * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_z * Math.sin((double)this.field_I)));
    }

    final qm n(int param0) {
        if (param0 != 3337) {
          this.a(1.24961256980896f, -83);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_R * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_R * Math.sin((double)this.field_E)));
    }

    final qm c(float param0, int param1) {
        if (param1 < 90) {
          this.field_F = (qm) null;
        }
        float var3 = this.field_E + (-this.field_E + this.field_I) * param0;
        return new qm((int)((double)this.field_U.field_h + (double)this.field_D * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_D * Math.sin((double)var3)));
    }

    final qm a(byte param0) {
        if (param0 != 29) {
          this.field_Q = (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_S * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_S * Math.sin((double)this.field_I)));
    }

    final in a(byte param0, float param1) {
        float var3 = (this.field_I - this.field_E) * param1 + this.field_E;
        var3 = var3 + (this.field_I < this.field_E ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0 < 117) {
          this.field_Q = (qm) null;
        }
        return new in(var3);
    }

    final qm a(int param0, float param1) {
        if (param0 != -851) {
          this.field_O = 100;
        }
        float var3 = this.field_E + (this.field_I - this.field_E) * param1;
        return new qm((int)((double)this.field_U.field_h + (double)this.field_R * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_R * Math.sin((double)var3)));
    }

    final qm a(boolean param0, float param1) {
        float var3 = this.field_E + param1 * (-this.field_E + this.field_I);
        if (param0) {
          return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_z * Math.cos((double)var3)), (int)((double)this.field_U.field_f - (double)this.field_z * Math.sin((double)var3)));
    }

    final float a(float param0, byte param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 < 33) {
          field_y = 109;
        }
        if (this.field_I < this.field_E) {
          while (param0 < this.field_I) {
            param0 = (float)((double)param0 + 6.283185307179586);
          }
          while (this.field_E < param0) {
            param0 = (float)((double)param0 - 6.283185307179586);
          }
          return (-this.field_E + param0) / (this.field_I - this.field_E);
        }
        while (this.field_I < param0) {
          param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (this.field_E > param0) {
          param0 = (float)((double)param0 + 6.283185307179586);
        }
        return (param0 - this.field_E) / (this.field_I - this.field_E);
    }

    final float f(int param0) {
        if (param0 != 50) {
          this.l(-4);
        }
        return Math.abs(this.field_I - this.field_E) * (float)this.field_z;
    }

    public static void p(int param0) {
        if (param0 >= -120) {
          field_y = 99;
        }
        field_J = null;
        field_G = null;
    }

    final qm m(int param0) {
        if (param0 != -14) {
          this.field_S = 113;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_R * Math.cos((double)this.field_I)), (int)((double)this.field_U.field_f - (double)this.field_R * Math.sin((double)this.field_I)));
    }

    final qm o(int param0) {
        if (param0 != -14) {
          return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_S * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_S * Math.sin((double)this.field_E)));
    }

    final qm k(int param0) {
        if (param0 != 255) {
          this.a(true, -0.0722532868385315f);
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_D * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_D * Math.sin((double)this.field_E)));
    }

    final qm c(boolean param0) {
        if (!param0) {
          return (qm) null;
        }
        return new qm((int)((double)this.field_U.field_h + (double)this.field_O * Math.cos((double)this.field_E)), (int)((double)this.field_U.field_f - (double)this.field_O * Math.sin((double)this.field_E)));
    }

    hn(qm param0, int param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8, qm param9, qm param10, qm param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        try {
          stackIn_4_1 = (param13);
          this.field_s = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.field_w = stackIn_7_1;
          stackIn_10_1 = (param17);
          this.field_q = stackIn_10_1;
          this.field_E = param2;
          this.field_U = param0;
          this.field_Q = param10;
          this.field_L = param8;
          this.field_N = param5;
          this.field_H = param11;
          this.field_B = param6;
          this.field_P = param7;
          this.field_I = param3;
          stackIn_13_1 = (param15);
          this.field_x = stackIn_13_1;
          this.field_k = param4;
          stackIn_16_1 = (param16);
          this.field_t = stackIn_16_1;
          this.field_F = param9;
          this.field_z = param1;
          stackIn_19_1 = (param14);
          this.field_m = stackIn_19_1;
          stackIn_21_1 = this.field_z;
          if (this.field_E >= this.field_I) {
            stackIn_22_2 = -this.field_L;
          } else {
            stackIn_22_2 = this.field_L;
          }
          this.field_R = stackIn_21_1 + stackIn_22_2;
          stackIn_24_1 = this.field_z;
          if (this.field_E >= this.field_I) {
            stackIn_25_2 = -this.field_B;
          } else {
            stackIn_25_2 = this.field_B;
          }
          this.field_S = stackIn_24_1 + stackIn_25_2;
          this.field_K = 1.0f;
          stackIn_27_1 = this.field_z;
          if (!(this.field_I <= this.field_E)) {
            stackIn_28_2 = this.field_P;
          } else {
            stackIn_28_2 = -this.field_P;
          }
          this.field_D = stackIn_27_1 + stackIn_28_2;
          this.field_o = 0.0f;
          if (this.field_I <= this.field_E) {
            stackIn_31_1 = -this.field_N;
          } else {
            stackIn_31_1 = this.field_N;
          }
          this.field_O = stackIn_31_1 + this.field_z;
          this.field_A = 0.0f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_35_0 = var19;
          stackIn_35_1 = new StringBuilder().append("hn.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param10 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param11 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(')').toString());
        }
    }

    final boolean b(byte param0, float param1) {
        int var4 = HoldTheLine.field_D;
        if (param0 != -113) {
          this.field_P = 69;
        }
        if (this.field_E > this.field_I) {
          while (this.field_I < param1) {
            param1 = (float)((double)param1 - 6.283185307179586);
          }
          while (param1 < this.field_I) {
            param1 = (float)((double)param1 + 6.283185307179586);
          }
          return this.field_E > param1 ? true : false;
        }
        while (this.field_E < param1) {
          param1 = (float)((double)param1 - 6.283185307179586);
        }
        while (this.field_E > param1) {
          param1 = (float)((double)param1 + 6.283185307179586);
        }
        return this.field_I > param1 ? true : false;
    }

    final qm b(float param0, int param1) {
        float var3 = this.field_A + (-this.field_A + this.field_K) * param0;
        int var4 = (int)((float)this.field_F.field_h * (-var3 + 1.0f) * (-var3 + 1.0f) + (-var3 + 1.0f) * (float)(2 * this.field_H.field_h) * var3 + var3 * (float)this.field_Q.field_h * var3);
        int var5 = (int)(var3 * (float)this.field_Q.field_f * var3 + (var3 * ((float)(2 * this.field_H.field_f) * (1.0f - var3)) + (float)this.field_F.field_f * (-var3 + 1.0f) * (1.0f - var3)));
        if (param1 != 7560980) {
          return (qm) null;
        }
        return new qm(var4, var5);
    }

    static {
        field_J = "Sound: ";
        field_G = new ge();
    }
}
