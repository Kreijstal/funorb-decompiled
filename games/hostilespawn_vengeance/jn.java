/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends fc {
    int field_D;
    static String field_K;
    static String field_E;
    static bd field_B;
    static boolean field_C;
    static p[] field_F;
    static String[] field_I;
    static int field_J;
    static vm field_G;
    static vl field_H;

    final static void l(int param0) {
        ji var2 = null;
        ji var2Lifetime1;
        if (param0 != 0) {
          jn.k(83);
          var2 = (ji) null;
          ij.a((byte) -17, (ji) null);
          return;
        }
        var2Lifetime1 = (ji) null;
        ij.a((byte) -17, (ji) null);
    }

    public jn() {
        super(0, 0, 0, 0, (nn) null, (mh) null);
        this.field_D = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        bd var8 = null;
        bd var9 = null;
        if (0 != param3) {
          return;
        }
        if (null == this.field_A) {
          return;
        }
        if (param2 < 42) {
          int[] var6 = (int[]) null;
          jn.a((int[]) null, -119, -105, 49, -23);
          if (this.field_D == 0) {
            return;
          }
          if (256 != this.field_D) {
            var8 = new bd(this.field_A.field_s, this.field_A.field_x);
            sb.a(var8, -125);
            this.field_A.a(0, 0, (byte) 60, param3);
            eh.b(false);
            var8.b(this.field_v + param1, param0 + this.field_m, this.field_D);
            return;
          }
          this.field_A.a(param0 + this.field_m, param1 + this.field_v, (byte) 110, param3);
          return;
        }
        if (this.field_D == 0) {
          return;
        }
        if (256 != this.field_D) {
          var9 = new bd(this.field_A.field_s, this.field_A.field_x);
          sb.a(var9, -125);
          this.field_A.a(0, 0, (byte) 60, param3);
          eh.b(false);
          var9.b(this.field_v + param1, param0 + this.field_m, this.field_D);
          return;
        }
        this.field_A.a(param0 + this.field_m, param1 + this.field_v, (byte) 110, param3);
    }

    public static void k(int param0) {
        field_E = null;
        field_K = null;
        field_H = null;
        field_F = null;
        if (param0 == 608) {
          field_B = null;
          field_I = null;
          field_G = null;
          return;
        }
        int[] var2 = (int[]) null;
        jn.a((int[]) null, 33, 96, 74, -62);
        field_B = null;
        field_I = null;
        field_G = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          while (true) {
            param1--;
            if (param1 < 0) {
              if (param2 == -1) {
                return;
              }
              field_E = (String) null;
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param3;
            var9[var6] = var7 + ua.a(8355711, var9[var6] >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("jn.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    jn(ag param0) {
        super(param0.field_v, param0.field_m, param0.field_s, param0.field_x, (nn) null, (mh) null);
        try {
          param0.a(this.field_s, 0, 0, 0, this.field_x);
          this.field_D = 256;
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = nj.field_c;
        synchronized (var1_ref) {
          if (nm.field_j == ee.field_e) {
            return false;
          }
          pj.field_e = cm.field_a[ee.field_e];
          aj.field_e = pe.field_db[ee.field_e];
          var2 = 26 % ((-11 - param0) / 61);
          ee.field_e = 127 & ee.field_e + 1;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 == 100) {
          if (param1 > 0) {
            si.d(32, 32, 608, 440);
            vg.field_c.a(param2, param3, param1);
            si.c();
          }
          return;
        }
        field_I = (String[]) null;
        if (param1 > 0) {
          si.d(32, 32, 608, 440);
          vg.field_c.a(param2, param3, param1);
          si.c();
        }
    }

    final static void a(int param0, int param1) {
        q.field_d = (param1 << 16) / 150;
        q.field_k = param1 * 100 / 150;
        if (param0 == 256) {
          q.field_h = 400 * param1 / 150;
          return;
        }
    }

    static {
        field_E = "Life signs detected! Proceed with caution.";
        field_I = new String[]{"Showing by rating", "Showing by win percentage"};
        field_K = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_H = new vl();
    }
}
