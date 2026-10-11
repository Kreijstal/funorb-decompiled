/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_d;
    String field_c;
    boolean field_e;
    boolean field_f;
    String[] field_a;
    int field_b;

    final static void a(int param0) {
        jf.e(640);
        vg.field_o = true;
        u.field_i = true;
        gl.field_E.l(24910);
        nb.a(oj.field_c, false, -16257);
        if (param0 != -27958) {
          nj.b((byte) -82);
        }
    }

    public static void b(int param0) {
        if (param0 <= 6) {
          nj.a((byte) -57);
        }
        field_d = null;
    }

    final static void b(byte param0) {
        int var1 = 82 % ((param0 - 2) / 59);
        hb.field_i = null;
        dc.field_s = null;
    }

    final static ve a(byte param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          if (ug.field_cb == null) {
            return null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = r.a(var6, -11133);
          if (param0 < 122) {
            field_d = (String) null;
          }
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (ve) (ug.field_cb.a(-1, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_jb);
            var4 = r.a(var7, -11133);
            if (var4 == null) {
              var4 = var3.field_jb;
            }
            if (!var4.equals(var2)) {
              var3 = (ve) (ug.field_cb.a(-1));
              continue;
            }
            break;
          }
          stackIn_17_0 = var3;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("nj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          var5 = ok.field_F;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 != 125) {
            field_d = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "nj.C(" + param0 + ')');
        }
    }

    final static void a(q param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            rk.field_T[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < rk.field_ab; var2_intLifetime1++) {
            if (~rl.field_C[var2_intLifetime1].field_e == ~param0.field_e) {
              dupTemp$3 = rl.field_C[var2_intLifetime1].a((byte) -111);
              rk.field_T[dupTemp$3] = rk.field_T[dupTemp$3] + 1;
            }
          }
          if (param1 < 16) {
            field_d = (String) null;
          }
          dupTemp$0 = param0.a((byte) -94);
          rk.field_T[dupTemp$0] = rk.field_T[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < rk.field_ab; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_e == rl.field_C[var3].field_e) {
              var4 = rl.field_C[var3].a((byte) -123);
              if (hi.field_y < rk.field_T[var4]) {
                rk.field_T[var4] = rk.field_T[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              rl.field_C[incrementValue$2] = rl.field_C[var3];
            }
          }
          rk.field_ab = var2_intLifetime2;
          fieldTemp$1 = rk.field_ab;
          rk.field_ab = rk.field_ab + 1;
          rl.field_C[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("nj.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    nj(boolean param0) {
        this.field_e = param0 ? true : false;
    }

    static {
        field_d = "Score: ";
    }
}
