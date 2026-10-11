/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn implements Runnable {
    rk field_f;
    static int field_d;
    volatile boolean field_e;
    volatile boolean field_a;
    static long[] field_b;
    volatile tk[] field_c;

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        rb var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var9 = new rb(param0);
          var3 = var9.g(-123);
          var4 = var9.a((byte) 113);
          if (var4 >= 0 && (0 == kk.field_K ||
            !(var4 > kk.field_K))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(0, param1 + 7186, var4, var13);
              stackIn_24_0 = var5;
              return stackIn_24_0;
            }
            var5_int = var9.a((byte) 110);
            if (var5_int >= 0 && (kk.field_K == 0 ||
              !(var5_int > kk.field_K))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                on.a(var12, var5_int, param0, var4, 9);
              } else {
                var7 = vg.field_h;
                synchronized (var7) {
                  vg.field_h.a(var12, 10, var9);
                }
              }
              stackIn_22_0 = var6;
              return stackIn_22_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("pn.D(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 9) {
          field_d = 33;
        }
        field_b = null;
    }

    public final void run() {
        int var1_int = 0;
        tk var2 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        this.field_e = true;
        try {
          while (!this.field_a) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_c[var1_int];
              if (var2 != null) {
                var2.h();
              }
            }
            wf.a(10L, false);
            rb.a(5, (Object) null, this.field_f);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          v.a((String) null, (byte) -52, (Throwable) ((Object) exception));
        } finally {
          this.field_e = false;
        }
    }

    final static ak a(Throwable param0, String param1) {
        ak var2 = null;
        if (!(param0 instanceof ak)) {
          var2 = new ak(param0, param1);
        } else {
          var2 = (ak) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    final static void a(oc param0, byte param1, int param2) {
        try {
          ci.field_j.a(77, param0);
          if (param1 > -70) {
            field_b = (long[]) null;
          }
          ac.a(param2, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          var1_int = gi.field_i[0];
          if (!param0) {
            return;
          }
          for (var2 = 1; var2 < gi.field_i.length; var2++) {
            var3 = gi.field_i[var2];
            au.a(jr.field_n, var2 << 4, jr.field_n, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pn.C(" + param0 + ')');
        }
    }

    pn() {
        this.field_c = new tk[2];
        this.field_a = false;
        this.field_e = false;
    }

    static {
        field_d = 20;
        field_b = new long[32];
    }
}
