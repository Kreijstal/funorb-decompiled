/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    private int field_m;
    static String field_e;
    private boolean field_p;
    private int field_l;
    static boolean field_a;
    static int uiBootstrapStage;
    static RgbSprite arcticSmallSprite;
    private int field_b;
    static String field_n;
    static int field_j;
    static int[] field_o;
    private int field_h;
    RgbSprite[] field_f;
    RgbSprite field_k;
    static int field_g;
    private int field_i;

    public static void b(int param0) {
        if (param0 != 2) {
          return;
        }
        field_n = null;
        field_o = null;
        field_e = null;
        arcticSmallSprite = null;
    }

    final be b(int param0, byte param1) {
        if (param1 != -50) {
          this.a(true, -56);
          this.field_i = param0;
          return this;
        }
        this.field_i = param0;
        return this;
    }

    final be a(boolean param0, boolean param1) {
        this.field_p = param0 ? true : false;
        if (!param1) {
          return this;
        }
        String var4 = (String) null;
        be.a((ResourceArchive) null, (String) null, -112, (String) null);
        return this;
    }

    final be a(int param0, byte param1) {
        if (param1 != -69) {
          this.field_h = 10;
          this.field_l = param0;
          return this;
        }
        this.field_l = param0;
        return this;
    }

    final static String a(ResourceArchive param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 94 % ((param2 - 52) / 42);
          if (!param0.ensureIndex((byte) -127)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          stackIn_5_0 = param3 + " - " + param0.getProgress(-4126) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("be.L(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, up param1, Widget param2, byte param3, int param4) {
        TextFont stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int stackIn_22_6 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var7Lifetime1;
        try {
          nh.a(param2.width, param2.height, -40, param2.x + param4, this.field_f, param0 + param2.y);
          if (null != this.field_k) {
            var6_int = this.field_i + param2.x + param4;
            if (param1.field_f == 1) {
              var6_int = var6_int + (param2.width - this.field_k.canvasWidth) / 2;
            }
            var7 = this.field_m + (param0 + param2.y);
            if (param1.field_m == 1) {
              var7 = var7 + (-this.field_k.canvasHeight + param2.height) / 2;
            }
            if (2 == param1.field_f) {
              var6_int = var6_int + (param2.width - this.field_k.canvasWidth);
            }
            if (param1.field_m == 2) {
              var7 = var7 + (param2.height - this.field_k.canvasHeight);
            }
            this.field_k.drawTransparent(var6_int, var7);
          }
          var6 = param1.a(param2, true);
          var7Lifetime1 = 3 % ((param3 - 13) / 43);
          if (var6 != null &&
            param1.field_k != null &&
            0 <= this.field_h) {
            stackIn_18_0 = param1.field_k;
            stackIn_18_1 = var6;
            if (this.field_i != -2147483648) {
              stackIn_19_2 = this.field_i;
            } else {
              stackIn_19_2 = 0;
            }
            stackIn_21_2 = stackIn_19_2 + param1.field_d + (param4 + param2.x);
            stackIn_21_3 = param0;
            stackIn_21_4 = -param2.y;
            stackIn_21_5 = -param1.field_q;
            if (this.field_m == -2147483648) {
              stackIn_22_6 = 0;
            } else {
              stackIn_22_6 = this.field_m;
            }
            stackIn_24_3 = stackIn_21_3 - (stackIn_21_4 + (stackIn_21_5 - stackIn_22_6));
            stackIn_24_4 = param2.width - param1.field_d - param1.field_i;
            stackIn_24_5 = -param1.field_q + (param2.height - param1.field_a);
            stackIn_24_6 = this.field_h;
            stackIn_24_7 = this.field_l;
            if (this.field_b == -2147483648) {
              stackIn_25_8 = 256;
            } else {
              stackIn_25_8 = this.field_b;
            }
            ((TextFont) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param1.field_f, param1.field_m, param1.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("be.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(be param0, int param1, up param2, Widget param3, int param4, int param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_p) {
            param0.a(param5, param2, param3, (byte) 99, param4);
            param0.a(-2147483648);
          }
          if (this.field_i != -2147483648) {
            param0.field_i = this.field_i;
          }
          if (this.field_m != -2147483648) {
            param0.field_m = this.field_m;
          }
          if (null != this.field_k) {
            param0.field_k = this.field_k;
          }
          if (-1 <= this.field_h) {
            param0.field_h = this.field_h;
          }
          if (this.field_l >= -1) {
            param0.field_l = this.field_l;
          }
          if (~this.field_b != param1) {
            param0.field_b = this.field_b;
          }
          if (null == this.field_f) {
            return;
          }
          param0.field_f = this.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("be.N(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static byte[] readArchiveBytes(boolean obfuscationGuard, Object storage, boolean copy) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (storage == null) {
            return null;
          }
          if (storage instanceof byte[]) {
            var3 = (byte[]) (storage);
            if (!copy) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            stackIn_6_0 = AppletGameShell.copyBytes(false, var3);
            return stackIn_6_0;
          }
          if (obfuscationGuard) {
            stackIn_11_0 = (byte[]) null;
            return stackIn_11_0;
          }
          if (!(storage instanceof ByteStorage)) {
            throw new IllegalArgumentException();
          }
          var4 = (ByteStorage) (storage);
          stackIn_14_0 = var4.toByteArray(16616);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("be.G(").append(obfuscationGuard).append(',');
          if (storage == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(copy).append(')').toString());
        }
    }

    final be a(int param0, int param1) {
        if (param0 != 0) {
          this.field_h = 14;
          this.field_m = param1;
          return this;
        }
        this.field_m = param1;
        return this;
    }

    final be a(boolean param0, int param1) {
        this.field_h = param1;
        if (param0) {
          this.a(false, 75);
          return this;
        }
        return this;
    }

    final void a(boolean param0, be param1) {
        try {
          if (param0) {
            Object var4 = (Object) null;
            be.readArchiveBytes(true, (Object) null, true);
          }
          param1.field_k = this.field_k;
          param1.field_i = this.field_i;
          param1.field_p = this.field_p;
          param1.field_b = this.field_b;
          param1.field_h = this.field_h;
          param1.field_m = this.field_m;
          param1.field_f = this.field_f;
          param1.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "be.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = 47 % ((59 - param0) / 63);
        return tf.field_i;
    }

    final be a(RgbSprite[] param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2147483648) {
            field_o = (int[]) null;
          }
          this.field_f = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("be.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_b = 256;
        this.field_h = 0;
        if (param0 == -2147483648) {
          this.field_i = 0;
          this.field_m = 0;
          this.field_l = -1;
          this.field_f = null;
          this.field_k = null;
          return;
        }
    }

    be() {
        this.field_m = -2147483648;
        this.field_p = false;
        this.field_l = -2;
        this.field_b = -2147483648;
        this.field_h = -2;
        this.field_f = null;
        this.field_k = null;
        this.field_i = -2147483648;
    }

    static {
        uiBootstrapStage = 0;
        field_a = true;
        field_e = "Won";
        field_n = "You can ask to join this game";
        field_o = new int[]{20, 21, 36, 6, 8};
    }
}
