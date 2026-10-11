/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo implements ntb, ofa, iu {
    int[] field_d;
    static java.security.SecureRandom field_a;
    int field_h;
    int field_f;
    static String field_g;
    int field_b;
    private int field_c;
    static int field_e;

    final int a(int param0, int param1, int param2) {
        int var7_int = 0;
        int incrementValue$0 = 0;
        int var4;
        int var5;
        int var8;
        int var6;
        int[] var7;
        var8 = VoidHunters.field_G;
        var4 = 0;
        if (param0 > -9) {
          this.c(105, -29);
        }
        while (this.field_d.length > var4) {
          var5 = this.field_d[var4];
          if (param1 != var5) {
            var6 = 0;
            for (var7_int = 0; var7_int < param2; var7_int++) {
              if (var5 != ada.field_a[var7_int]) {
                continue;
              }
              var6 = 1;
              break;
            }
            if (var6 == 0) {
              if (ada.field_a.length == param2) {
                var7 = new int[10 + ada.field_a.length];
                cua.a(ada.field_a, 0, var7, 0, ada.field_a.length);
                ada.field_a = var7;
              }
              incrementValue$0 = param2;
              param2++;
              ada.field_a[incrementValue$0] = var5;
            }
          }
          var4++;
        }
        return param2;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
          jo.a(true);
        }
        field_a = null;
    }

    final boolean c(int param0, int param1) {
        this.field_d = wm.a(param0, (byte) 116, this.field_d);
        this.a((byte) -119);
        if (null == this.field_d) {
          return true;
        }
        if (param1 != 8) {
          return true;
        }
        return false;
    }

    public final void b(faa param0, int param1) {
        try {
          pgb.a(8, null != this.field_d ? this.field_d.length : 0, 73, param0, this.field_d);
          param0.a(-632, this.field_h, 8);
          if (param1 > -109) {
            this.field_b = -39;
          }
          param0.a(-632, this.field_b, 8);
          param0.a(-632, this.field_f, 2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jo.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(Object param0, boolean param1) {
        jo var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = 114;
            return stackIn_2_0;
          }
          var3 = (jo) (param0);
          if (var3.field_h > this.field_h) {
            stackIn_20_0 = -1;
            return stackIn_20_0;
          }
          if (var3.field_h < this.field_h) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (this.field_b < var3.field_b) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (var3.field_b < this.field_b) {
            stackIn_10_0 = 1;
            return stackIn_10_0;
          }
          if (this.field_f < var3.field_f) {
            stackIn_16_0 = -1;
            return stackIn_16_0;
          }
          if (this.field_f <= var3.field_f) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_14_0 = 1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("jo.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        jo var5 = null;
        try {
          if (param1 >= -19) {
            this.field_d = (int[]) null;
          }
          var5 = (jo) (param0);
          var4 = 0;
          if (ikb.a(this.field_d, var5.field_d, false)) {
            var4 = 1;
            System.out.println("int[] ids has changed. ");
          }
          if (this.field_h != var5.field_h) {
            System.out.println("int gridx has changed. before=" + var5.field_h + ", now=" + this.field_h);
            var4 = 1;
          }
          if (this.field_b != var5.field_b) {
            var4 = 1;
            System.out.println("int gridy has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (var5.field_f != this.field_f) {
            var4 = 1;
            System.out.println("int type has changed. before=" + var5.field_f + ", now=" + this.field_f);
          }
          if (var4 != 0) {
            System.out.println("This instance of PartitionZone has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("jo.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        jo var3 = (jo) (param1);
        if (this.field_c == var3.field_c) {
          return;
        }
        try {
          var3.field_c = this.field_c;
          var3.field_d = dob.a(var3.field_d, (byte) -55, this.field_d);
          var3.field_b = this.field_b;
          var3.field_h = this.field_h;
          if (param0 <= 54) {
            faa var4 = (faa) null;
            this.b((faa) null, 31);
          }
          var3.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4;
        faa var5;
        var4 = VoidHunters.field_G;
        for (var3 = 0; var3 < this.field_d.length; var3++) {
          if (param1 < this.field_d[var3]) {
            this.field_d[var3] = this.field_d[var3] - 1;
            this.a((byte) -82);
          }
        }
        if (param0 != 11964) {
          var5 = (faa) null;
          this.b((faa) null, 55);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.field_d = (int[]) null;
          }
          this.field_d = wkb.a((byte) 37, this.field_d, param0, 8);
          this.field_h = uwa.a(8, param0, (byte) 20);
          this.field_b = uwa.a(8, param0, (byte) 20);
          this.field_f = param0.i(0, 2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "jo.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        jo var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (jo) (param1);
          var4 = 11 % ((22 - param0) / 59);
          stackIn_7_0 = (wpb.a(var3.field_d, this.field_d, (byte) 28)) || (this.field_h != var3.field_h) || (this.field_b != var3.field_b) || (this.field_f != var3.field_f);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 >= -57) {
          this.field_c = -117;
        }
        int fieldTemp$0 = kgb.field_a;
        kgb.field_a = kgb.field_a + 1;
        this.field_c = fieldTemp$0;
    }

    final void a(int param0, int param1) {
        if (param1 != -13251) {
          this.a(-116, 102, -62);
        }
        this.field_d = nra.a(true, this.field_d, param0, param1 + 42100, true);
        this.a((byte) -77);
    }

    jo() {
        this.field_c = 0;
        this.a((byte) -92);
    }

    jo(int param0, int param1, int param2) {
        this.field_c = 0;
        this.a((byte) -92);
        this.field_f = param2;
        this.field_b = param1;
        this.field_h = param0;
    }

    static {
        field_g = "Blueprint Showdown";
        field_e = 500;
    }
}
