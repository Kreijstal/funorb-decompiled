/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static bi field_f;
    static int[] field_e;
    private mn field_b;
    private rk field_c;
    static long field_d;
    static double[] field_a;

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        qf var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (!param0) {
              stackIn_9_0 = var3;
              return stackIn_9_0;
            }
            stackIn_7_0 = ug.a(var3, 194);
            return stackIn_7_0;
          }
          if (param2 instanceof qf) {
            var4 = (qf) (param2);
            stackIn_13_0 = var4.a(87);
            return stackIn_13_0;
          }
          if (param1 != 6) {
            field_e = (int[]) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("vb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (!fd.field_j) {
          throw new IllegalStateException();
        }
        qf.field_g = true;
        if (param0 < 104) {
          vb.a((byte) -90, '￘');
        }
        aa.a((byte) -118, false);
        rk.field_e = 0;
    }

    final rk b(rk param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        rk var4 = null;
        Object stackIn_5_0 = null;
        rk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_b.field_a.field_h;
          }
          if (this.field_b.field_a == var3) {
            this.field_c = null;
            stackIn_5_0 = null;
            return (rk) (stackIn_5_0);
          }
          this.field_c = var3.field_h;
          if (param1 != 6) {
            var4 = (rk) null;
            this.a((rk) null, 28);
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vb.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final rk a(rk param0, int param1) {
        rk var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        rk stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_c = (rk) null;
          }
          if (param0 == null) {
            var3 = this.field_b.field_a.field_a;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_b.field_a) {
            this.field_c = null;
            stackIn_8_0 = null;
            return (rk) (stackIn_8_0);
          }
          this.field_c = var3.field_a;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("vb.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (ld.a((byte) -21, param1)) {
            return true;
          }
          var6 = gk.field_y;
          var2 = var6;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (~var4 == ~param1) {
              return true;
            }
          }
          if (param0 != -37) {
            vb.b((byte) -35);
          }
          var7 = pa.field_d;
          var2Lifetime1 = var7;
          var8 = 0;
          var3Lifetime1 = var8;
          while (true) {
            if (var7.length <= var8) {
              return false;
            }
            var4Lifetime1 = var7[var8];
            if (var4Lifetime1 != param1) {
              var8++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "vb.J(" + param0 + ',' + param1 + ')');
        }
    }

    final rk c(int param0) {
        rk var2 = this.field_b.field_a.field_a;
        if (var2 == this.field_b.field_a) {
          this.field_c = null;
          return null;
        }
        if (param0 != 7) {
          return (rk) null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    vb(mn param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final rk a(byte param0) {
        if (param0 != 120) {
          vb.b((byte) -33);
        }
        rk var2 = this.field_b.field_a.field_h;
        if (this.field_b.field_a == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 8) {
          field_d = -115L;
        }
        field_a = null;
        field_e = null;
    }

    final rk a(int param0) {
        if (param0 != 0) {
          field_d = -121L;
        }
        rk var2 = this.field_c;
        if (this.field_b.field_a == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final rk b(int param0) {
        int var2 = -88 % ((param0 - 17) / 35);
        rk var3 = this.field_c;
        if (var3 == this.field_b.field_a) {
          this.field_c = null;
          return null;
        }
        this.field_c = var3.field_h;
        return var3;
    }

    static {
        field_e = new int[1024];
        field_a = new double[]{6.0, 6.0, 7.0, 8.0, 6.0, 4.0, 5.0, 6.0, 5.5, 6.0, 7.0, 6.0, 5.0, 6.0, 6.0, 8.0, 5.0, 8.0, 8.0, 6.0, 10.0, 9.0, 8.0, 7.0, 7.0};
    }
}
