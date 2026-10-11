/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends fc {
    int field_s;
    int field_t;
    bh field_l;
    int field_F;
    int field_A;
    int field_v;
    int field_u;
    static kk field_x;
    static int field_z;
    ik field_n;
    int field_p;
    mh field_B;
    static qj[] field_m;
    int field_q;
    int field_y;
    int field_C;
    int field_i;
    int field_j;
    int field_o;
    int field_w;
    uh field_k;
    int field_G;
    static qj field_E;
    int field_r;
    int field_D;

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2, byte[] param3, int param4, byte param5, be param6) {
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
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var7_int = ae.a((byte) -39, param2);
          if (null == oj.field_b) {
            oj.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          var9 = 0;
          if (param5 < 43) {
            field_E = (qj) null;
          }
          while (4 > var9) {
            var8[var9] = oj.field_b.nextInt();
            var9++;
          }
          if (null == dg.field_H ||
            !(dg.field_H.field_j.length >= var7_int)) {
            dg.field_H = new be(var7_int);
          }
          dg.field_H.field_k = 0;
          dg.field_H.a(param2, 121, param4, param3);
          dg.field_H.a(-3869, var7_int);
          dg.field_H.a(29715, var13);
          if (al.field_w == null ||
            !(al.field_w.field_j.length >= 100)) {
            al.field_w = new be(100);
          }
          al.field_w.field_k = 0;
          al.field_w.a(10, (byte) -83);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            al.field_w.b(false, var13[var11]);
            var11++;
          }
          al.field_w.b(param2, (byte) -120);
          al.field_w.a(param1, param0, false);
          param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
          param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("ha.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void e(int param0) {
        this.field_l = null;
        this.field_n = null;
        int var2 = -87 / ((-49 - param0) / 34);
        this.field_k = null;
        this.field_B = null;
    }

    final static oi a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        oi var5 = null;
        oh var6 = null;
        oi stackIn_4_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_12_0 = null;
        oi stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = oc.field_j;
              return stackIn_7_0;
            }
            if (param1 > -106) {
              var6 = (oh) null;
              ha.a((oh) null, 98, -93, (oh) null);
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = tf.a(0, var3);
            if (var5 == null) {
              stackIn_14_0 = jd.a(var4, 255);
              return stackIn_14_0;
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = gd.field_f;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ha.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_m = null;
        if (param0 != 4) {
          field_z = 126;
          field_x = null;
          field_E = null;
          return;
        }
        field_x = null;
        field_E = null;
    }

    final static void a(oh param0, int param1, int param2, oh param3) {
        try {
          mk.field_b = param0;
          r.field_k = param3;
          sc.field_f = param2;
          jk.a(ll.field_k / param1, -120, ll.field_d / 2);
          vb.a(param3.field_H, param0.field_H + param0.field_u, param1 - 107, param0.field_H, param3.field_H + param3.field_u);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ha.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    ha() {
    }

    static {
        field_z = -1;
        field_E = new qj(270, 70);
    }
}
