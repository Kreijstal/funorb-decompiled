/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_p;
    static int field_d;
    static int field_f;
    static String field_g;
    static boolean field_b;
    static h field_e;
    private int field_l;
    static String field_i;
    static int field_a;
    static String[] field_m;
    static int[] field_h;
    private int field_c;
    private hb field_k;
    static a field_j;
    private q field_o;
    static boolean field_q;
    static gh field_n;

    private final void a(byte param0, int param1, Object param2, long param3) {
        bg var6 = null;
        le var6_ref = null;
        int var7 = SteelSentinels.field_G;
        try {
          if (this.field_c < param1) {
            throw new IllegalStateException();
          }
          this.a((byte) 117, param3);
          this.field_l = this.field_l - param1;
          while (this.field_l < 0) {
            var6 = (bg) (this.field_k.a(12515));
            this.a(var6, -17389);
          }
          if (param0 > -47) {
            field_e = (h) null;
          }
          var6_ref = new le(param2, param1);
          this.field_o.a(var6_ref, param3, false);
          this.field_k.a((byte) 47, var6_ref);
          ((bg) ((Object) var6_ref)).field_w = 0L;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_n = null;
        if (param0 > 126) {
          field_j = null;
          field_h = null;
          field_i = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        nc.a((byte[]) null, 57);
        field_j = null;
        field_h = null;
        field_i = null;
    }

    private final void a(byte param0, long param1) {
        if (param0 != 117) {
          return;
        }
        bg var4 = (bg) (this.field_o.a(param1, (byte) -125));
        this.a(var4, param0 ^ -17306);
    }

    final Object a(long param0, int param1) {
        Object var9 = null;
        le var6 = null;
        bg var8 = (bg) (this.field_o.a(param0, (byte) -127));
        le var6Lifetime1;
        if (var8 == null) {
          return null;
        }
        if (param1 > -30) {
          bg var7 = (bg) null;
          this.a((bg) null, -108);
          var9 = var8.d((byte) 125);
          if (var9 == null) {
            var8.b(4);
            var8.e(480);
            this.field_l = this.field_l + var8.field_z;
            return null;
          }
          if (!var8.h(-29304)) {
            this.field_k.a((byte) 50, var8);
            var8.field_w = 0L;
            return var9;
          }
          var6 = new le(var9, var8.field_z);
          this.field_o.a(var6, var8.field_j, false);
          this.field_k.a((byte) 72, var6);
          ((bg) ((Object) var6)).field_w = 0L;
          var8.b(4);
          var8.e(480);
          return var9;
        }
        Object var10 = var8.d((byte) 125);
        if (var10 == null) {
          var8.b(4);
          var8.e(480);
          this.field_l = this.field_l + var8.field_z;
          return null;
        }
        if (!var8.h(-29304)) {
          this.field_k.a((byte) 50, var8);
          var8.field_w = 0L;
          return var10;
        }
        var6Lifetime1 = new le(var10, var8.field_z);
        this.field_o.a(var6Lifetime1, var8.field_j, false);
        this.field_k.a((byte) 72, var6Lifetime1);
        ((bg) ((Object) var6Lifetime1)).field_w = 0L;
        var8.b(4);
        var8.e(480);
        return var10;
    }

    private final void a(bg param0, int param1) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            param0.b(param1 ^ -17385);
            param0.e(param1 + 17869);
            this.field_l = this.field_l + param0.field_z;
          }
          if (param1 == -17389) {
            return;
          }
          var4 = (java.applet.Applet) null;
          nc.a((byte) -12, (java.applet.Applet) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nc.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ld a(byte[] param0, int param1) {
        ld var2 = null;
        RuntimeException var2_ref = null;
        java.applet.Applet var3 = null;
        Object stackIn_2_0 = null;
        ld stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (ld) (stackIn_2_0);
          }
          if (param1 != 7045) {
            var3 = (java.applet.Applet) null;
            nc.a((byte) 100, (java.applet.Applet) null);
          }
          var2 = new ld(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
          uh.a(param1 + 2279);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("nc.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ch.field_O != null) {
            ch.field_O.m(105);
          }
          jd.field_kb = new pm(param0, param1, false, true, true);
          ci.field_a.c(jd.field_kb, -22908735);
          if (param2 < -37) {
            return;
          }
          var4 = (java.applet.Applet) null;
          nc.a((byte) 60, (java.applet.Applet) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(long param0, Object param1, int param2) {
        try {
          this.a((byte) -109, param2, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nc.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    nc(int param0) {
        this(param0, param0);
    }

    final static vc[] a(int param0, pn param1) {
        int var5 = 0;
        vc[] stackIn_4_0 = null;
        vc[] stackIn_10_0 = null;
        vc[] stackIn_13_0 = null;
        vc[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        vc[] var4 = null;
        vc var6 = null;
        int var7 = 0;
        wj var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = SteelSentinels.field_G;
        try {
          if (!param1.b(-35)) {
            stackIn_4_0 = new vc[]{};
            return stackIn_4_0;
          }
          var8 = param1.a(param0 ^ -30726);
          while (var8.field_a == 0) {
            a.a((byte) 121, 10L);
          }
          if (var8.field_a == 2) {
            stackIn_10_0 = new vc[]{};
            return stackIn_10_0;
          }
          if (param0 != 38) {
            stackIn_13_0 = (vc[]) null;
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.field_c);
          var9 = var10;
          var3 = var9;
          var4 = new vc[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new vc();
            var4[var5] = var6;
            var6.field_a = var3[var5 << 2];
            var6.field_g = var3[1 + (var5 << 2)];
            var6.field_j = var3[(var5 << 2) + 2];
            var6.field_i = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("nc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(ge.a(0, var2, param1), "_top");
              var3 = 58 % ((-15 - param0) / 42);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("nc.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private nc(int param0, int param1) {
        int var3;
        this.field_k = new hb();
        this.field_l = param0;
        this.field_c = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_o = new q(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_o = new q(var3);
        return;
    }

    final static gk a(int param0, byte param1) {
        if (param0 >= 35) {
          return bl.field_p[param0 - 35];
        }
        if (param1 < -93) {
          return ie.field_d[param0];
        }
        return (gk) null;
    }

    static {
        field_b = false;
        field_d = 0;
        field_h = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_p = "Unable to add name - system busy";
        field_m = new String[]{"speed_icons", "diff_icons", "map_icons"};
        field_i = "Email (Login):";
        field_q = false;
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
