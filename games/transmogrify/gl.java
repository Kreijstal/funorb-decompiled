/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends fi {
    static pg field_B;
    static String field_C;
    static String field_z;
    static int field_D;
    static int field_y;
    int field_A;

    public gl() {
        super(0, 0, 0, 0, (ui) null, (ma) null);
        this.field_A = 256;
    }

    gl(qg param0) {
        super(param0.field_p, param0.field_n, param0.field_l, param0.field_h, (ui) null, (ma) null);
        try {
          param0.a(-128, 0, 0, this.field_l, this.field_h);
          this.field_v = param0;
          this.field_A = 256;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_C = null;
        field_z = null;
        field_B = null;
        if (param0 != 2483) {
          gl.j(-39);
        }
    }

    final static void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2, byte[] param3, oa param4, int param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          var7_int = ta.a(0, param5);
          if (null == i.field_a) {
            i.field_a = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = i.field_a.nextInt();
          }
          if (pg.field_b == null ||
            !(var7_int <= pg.field_b.field_g.length)) {
            pg.field_b = new oa(var7_int);
          }
          pg.field_b.field_h = 0;
          pg.field_b.a((byte) -10, param3, param5, param6);
          pg.field_b.h(-30190, var7_int);
          pg.field_b.a(var13, 111);
          if (kd.field_c == null ||
            !(kd.field_c.field_g.length >= 100)) {
            kd.field_c = new oa(100);
          }
          kd.field_c.field_h = 0;
          kd.field_c.f(6389, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            kd.field_c.a(-119, var13[var11]);
            var11++;
          }
          kd.field_c.c(param5, -159688920);
          kd.field_c.a(param2, -119, param1);
          param4.a((byte) -29, kd.field_c.field_g, kd.field_c.field_h, 0);
          param4.a((byte) -108, pg.field_b.field_g, pg.field_b.field_h, 0);
          if (param0 >= -116) {
            field_B = (pg) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("gl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
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
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 != param2) {
          return;
        }
        if (this.field_v == null) {
          return;
        }
        if (this.field_A == 0) {
          return;
        }
        if (256 == this.field_A) {
          this.field_v.a(param0 + this.field_p, this.field_n + param1, param2, (byte) -12);
          return;
        }
        int var6 = -59 / ((77 - param3) / 34);
        ti var7 = new ti(this.field_v.field_l, this.field_v.field_h);
        oj.a(var7, 256);
        this.field_v.a(0, 0, param2, (byte) -117);
        fi.c(true);
        var7.e(this.field_p + param0, this.field_n + param1, this.field_A);
    }

    final static void j(int param0) {
        if (param0 != 31107) {
          field_B = (pg) null;
        }
        if (null != re.field_h) {
          re.field_h.d();
        }
        if (u.field_a != null) {
          u.field_a.d();
        }
    }

    static {
        field_z = "Just play";
        field_C = "This entry doesn't match";
        field_D = 0;
    }
}
