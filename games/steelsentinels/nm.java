/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends ia {
    static String[] field_n;
    static int field_w;
    private String field_u;
    private boolean field_r;
    static String field_t;
    static int[] field_s;
    static int[] field_v;
    static boolean field_p;
    static SceneWidget field_q;
    private tk field_x;
    static qc field_o;

    final static void a(boolean param0, hk param1) {
        hk var2 = null;
        int var3 = 0;
        hk var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          param1.unlink(4);
          var2 = (hk) (ci.field_e.first(13058));
          if (!param0) {
            var4 = (hk) null;
            nm.a(true, (hk) null);
          }
          while (var2 != null) {
            if (var2.a(param1, (byte) -63)) {
              var2 = (hk) (ci.field_e.next((byte) -101));
              continue;
            }
            break;
          }
          if (var2 != null) {
            IsaacRandom.insertNodeBefore(var2, 30, param1);
          } else {
            ci.field_e.addLast(3, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("nm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        ql.j(-29713);
        if (param3 != 12) {
          return;
        }
        try {
          ag.field_p.h(param3 + 109);
          jd.field_kb = new pm(cc.field_Xb, (String) null, de.field_d, param1, param2);
          ci.field_a = new bf(ag.field_p, jd.field_kb);
          ag.field_p.a(ci.field_a, 93);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        CipherPacketBuffer var4 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 100) {
            var4 = (CipherPacketBuffer) null;
            nm.a((CipherPacketBuffer) null, (byte) 97);
          }
          if (this.field_x.a(param1, -1) == fa.field_d) {
            stackIn_4_0 = this.field_x.a(100, param1);
            return stackIn_4_0;
          }
          if (this.a(param1, param0 ^ -101) != fa.field_d) {
            stackIn_9_0 = mg.field_lc;
            return stackIn_9_0;
          }
          stackIn_7_0 = pl.field_W;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("nm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        CipherPacketBuffer var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 109, 1);
        var2.a((byte) 108, 1);
        int var3 = 30 / ((11 - param1) / 51);
    }

    final vd a(String param0, int param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        vd stackIn_2_0 = null;
        vd stackIn_8_0 = null;
        vd stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_x.a(param0, param1) == fa.field_d) {
            stackIn_2_0 = fa.field_d;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_u)) {
            var3 = ri.a(param0, -98);
            if (!var3.a((byte) -72)) {
              stackIn_8_0 = ma.field_Y;
              return stackIn_8_0;
            }
            this.field_u = param0;
            this.field_r = var3.b(200);
          }
          if (this.field_r) {
            stackIn_13_0 = vf.field_b;
          } else {
            stackIn_13_0 = fa.field_d;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("nm.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_v = null;
        field_s = null;
        field_n = null;
        int var1 = -69 / ((param0 - 61) / 55);
    }

    nm(jf param0, jf param1) {
        super(param0);
        this.field_u = "";
        this.field_r = false;
        try {
          this.field_x = new tk(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        qf.field_c.a(0, param1, param4, param3, param5);
        if (param6 <= 81) {
          field_n = (String[]) null;
        }
        if (jk.field_i != null) {
          jk.field_i.a(param2, param4, param0, (byte) 27, -ed.field_i + param0, param4);
        }
    }

    final static jj[] a(CipherPacketBuffer param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        jj[] var4 = null;
        jj var6_ref_jj = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        jj[] stackIn_6_0 = null;
        jj[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param0.g(-126, 8);
          if (0 < var2_int) {
            stackIn_3_0 = null;
            return (jj[]) (stackIn_3_0);
          }
          if (param1 <= 22) {
            stackIn_6_0 = (jj[]) null;
            return stackIn_6_0;
          }
          var3 = param0.g(-77, 12);
          var4 = new jj[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (!he.a(-1766, param0)) {
              var6 = param0.g(30, fm.a(-1 + var5, 80));
              var4[var5] = var4[var6];
            } else {
              var6_ref_jj = new jj();
              param0.g(-78, 24);
              param0.g(80, 24);
              var6_ref_jj.field_g = param0.g(94, 24);
              param0.g(62, 9);
              param0.g(-75, 12);
              param0.g(122, 12);
              param0.g(-103, 12);
              var4[var5] = var6_ref_jj;
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("nm.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, String param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RgbSprite[] var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RgbSprite[] stackIn_16_0 = null;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= oh.field_f) {
            if (param5 + param1 > oh.field_f) {
              if (param0 <= pi.field_c) {
                stackIn_10_0 = (param0 + param4 > pi.field_c) ? 1 : 0;
              } else {
                stackIn_10_0 = 0;
              }
            } else {
              stackIn_10_0 = 0;
            }
          } else {
            stackIn_10_0 = 0;
          }
          var6_int = stackIn_10_0;
          stackIn_13_0 = (var6_int == 0) ? 1146810 : 0;
          var7 = stackIn_13_0;
          if (var6_int == 0) {
            stackIn_16_0 = hk.field_Tb;
          } else {
            stackIn_16_0 = wc.field_d;
          }
          var8 = stackIn_16_0;
          if (param2 < 115) {
            return true;
          }
          jm.a(param0, param4, var8, 1, param1, param5);
          if (param3 != null) {
            pl.field_U.a(param3, param5 / 2 + param1, (1 + (param4 + pl.field_U.field_U)) / 2 + param0, var7, -1);
          }
          stackIn_23_0 = var6_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("nm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        var2 = param1;
        if (var2 == 1) {
          return 0;
        }
        if (var2 == 2) {
          return 1;
        }
        if (var2 == 3) {
          return 2;
        }
        if (var2 == 4) {
          return 3;
        }
        if (var2 == 20) {
          return 4;
        }
        if (11 == var2) {
          return 10;
        }
        if (var2 == 12) {
          return 11;
        }
        if (var2 == 13) {
          return 12;
        }
        if (14 == var2) {
          return 13;
        }
        if (6 == var2) {
          return 5;
        }
        if (var2 == 7) {
          return 6;
        }
        if (var2 == 8) {
          return 7;
        }
        if (var2 == 9) {
          return 8;
        }
        if (var2 == 26) {
          return 10;
        }
        if (var2 == 15) {
          return 27;
        }
        if (param0 != 8241) {
          field_t = (String) null;
        }
        return -1;
    }

    static {
        field_p = false;
        field_v = new int[]{48, 272, 380, 490, 591};
        field_s = new int[12];
        field_w = -1;
    }
}
