/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gk extends ca implements vn {
    static String field_Db;
    static boolean field_Ib;
    private boolean field_Fb;
    private boolean field_Ab;
    private mm field_Bb;
    private r field_xb;
    static byte[][] field_yb;
    static int[] field_Cb;
    static w field_Hb;
    static String field_Gb;
    private boolean field_Eb;
    private boolean field_zb;

    final void n(int param0) {
        if (!this.field_S) {
          return;
        }
        this.field_S = false;
        int var2 = 6 % ((-68 - param0) / 51);
        if (this.field_Ab) {
          qf.a(true);
          return;
        }
        if (this.field_Eb) {
          ai.h(-73);
          return;
        }
    }

    final void o(int param0) {
        this.field_xb.a(param0, 4088, 2121792);
        dj var2 = new dj(this, this.field_Bb, fm.field_a);
        var2.a(mn.field_a, 15, param0 ^ 4210766);
        this.c(var2, (byte) 51);
    }

    final static int c(int param0, int param1, int param2) {
        if (param1 != param2) {
          return fc.field_b[param2];
        }
        if (!ll.a(param0, (byte) -96)) {
          return fc.field_b[param2];
        }
        return 29;
    }

    gk(ka param0, mm param1, String param2, boolean param3, boolean param4) {
        super(param0, new dj((gk) null, param1, param2), 77, 10, 10);
        try {
          this.field_Bb = param1;
          this.field_Ab = param3 ? true : false;
          this.field_zb = false;
          this.field_Fb = false;
          this.field_Eb = param4 ? true : false;
          this.field_xb = new r(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_xb.field_L = true;
          this.b(this.field_xb, (byte) -55);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(w param0, boolean param1) {
        w var4 = null;
        w var5 = null;
        int var3 = client.field_A ? 1 : 0;
        try {
          var4 = (w) (param0.field_M.c((byte) -76));
          w var2 = var4;
          while (var4 != null) {
            var4.field_Ib = 0;
            var4.field_Mb = 0;
            var4.field_F = 0;
            var4.field_N = 0;
            var5 = (w) (param0.field_M.d(true));
            var5 = var5;
          }
          if (!param1) {
            field_yb = (byte[][]) null;
          }
          param0.field_Mb = 0;
          param0.field_Ib = 0;
          param0.field_F = 0;
          param0.field_N = 0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "gk.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        boolean stackIn_8_1 = false;
        dj stackIn_14_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        dj var6 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (param0 != 48) {
            return;
          }
          if (this.field_Fb) {
            return;
          }
          stackIn_8_1 = (256 == param2);
          this.field_zb = stackIn_8_1;
          this.field_Fb = true;
          this.field_xb.a(4210752, 4088, 8405024);
          var6 = new dj(this, this.field_Bb, param1);
          if (param2 != 5) {
            if (param2 != 256) {
              stackIn_14_0 = var6;
              if (!this.field_Ab) {
                stackIn_15_1 = bl.field_X;
              } else {
                stackIn_15_1 = sh.field_c;
              }
              ((dj) (Object) stackIn_14_0).a(stackIn_15_1, -1, 14);
            } else {
              var6.a(116, sh.field_c, (kg) (this));
            }
          } else {
            var6.a(pb.field_e, 11, 14);
            var6.a(ig.field_Tb, 17, param0 ^ 62);
          }
          if (3 != param2) {
            if (param2 != 4) {
              if (6 != param2) {
                if (param2 == 9) {
                  var6.a(127, pc.field_e, (kg) (this));
                }
              } else {
                var6.a(vb.field_Y, 9, 14);
              }
            } else {
              var6.a(ai.field_U, 8, 14);
            }
          } else {
            var6.a(ce.field_z, 7, 14);
          }
          this.c(var6, (byte) 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("gk.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, cc param3) {
        try {
          int var4_int = -111 % ((param2 - 41) / 38);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "gk.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            this.n(63);
            return true;
          }
          var5_int = -15 / ((param0 + 22) / 49);
          stackIn_5_0 = super.a(123, param1, param2, param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("gk.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 67) {
            this.field_Eb = true;
          }
          if (!this.field_zb) {
            aj.a("tochangedisplayname.ws", param0 ^ -79, se.h(param0 ^ 25211));
            return;
          }
          hm.a(3, (byte) -124);
          this.n(-9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("gk.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void p(int param0) {
        field_Gb = null;
        field_yb = (byte[][]) null;
        int var1 = 107 % ((-66 - param0) / 34);
        field_Db = null;
        field_Cb = null;
        field_Hb = null;
    }

    static {
        field_Db = "Options";
        field_yb = new byte[50][];
        field_Cb = new int[4];
        field_Gb = "Quick Chat Help";
    }
}
