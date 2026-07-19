/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends sq {
    static int[] field_h;
    static int field_l;
    static kf[] field_j;
    static dd field_k;
    static kl field_e;
    static String field_i;
    static int field_g;
    static uo[][] field_f;

    final static void c(byte param0) {
        int var1 = 0;
        kh.field_Vb.field_Db = 240;
        if (param0 >= -68) {
          return;
        } else {
          kh.field_Vb.field_Fb = 3;
          kh.field_Vb.field_ob = kh.field_Vb.field_F[1].field_A;
          kh.field_Vb.field_eb = 120;
          kh.field_Vb.field_qb = 160;
          kh.field_Vb.field_cb = 0;
          kh.field_Vb.field_gb = 320;
          kh.field_Vb.field_V = kh.field_Vb.field_F[3].field_z;
          var1 = kh.field_Vb.field_I.b(kh.field_Vb.field_nb, -kh.field_Vb.field_F[3].field_z + (kh.field_Vb.field_gb - kh.field_Vb.field_F[5].field_z), 2 + kh.field_Vb.field_I.field_G);
          hk.field_t.field_gb = hk.field_t.field_I.b(hk.field_t.field_nb) + hk.field_t.field_F[3].field_z + hk.field_t.field_F[5].field_z;
          hk.field_t.field_qb = kh.field_Vb.field_F[3].field_z;
          hk.field_t.field_Db = 20;
          hk.field_t.field_eb = var1 + kh.field_Vb.field_F[1].field_A - -3;
          rl.field_b.field_gb = rl.field_b.field_I.b(rl.field_b.field_nb) - (-rl.field_b.field_F[3].field_z - rl.field_b.field_F[5].field_z);
          rl.field_b.field_Db = hk.field_t.field_Db;
          rl.field_b.field_eb = 3 + var1 + kh.field_Vb.field_F[1].field_A;
          rl.field_b.field_qb = -kh.field_Vb.field_F[5].field_z + (kh.field_Vb.field_gb + -rl.field_b.field_gb);
          kh.field_Vb.field_Db = 3 + var1 + (kh.field_Vb.field_F[1].field_A + (hk.field_t.field_Db - -kh.field_Vb.field_F[7].field_A));
          return;
        }
    }

    final boolean a(int param0, byte param1, qe param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 9) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("mc.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    mc(al param0) {
        super(param0);
    }

    final boolean a(int param0, byte param1, int param2) {
        boolean discarded$0 = false;
        if (param1 < 122) {
            discarded$0 = this.a(-87, (byte) -91, -37);
            return true;
        }
        return true;
    }

    final boolean f(int param0) {
        if (param0 < 113) {
            this.c(55);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = 101 % ((param0 - -79) / 38);
        return 1;
    }

    final int a(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 118 / ((-32 - param1) / 40);
            stackOut_0_0 = -1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("mc.CA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final int[] a(int param0, byte param1) {
        boolean discarded$0 = false;
        if (param1 != -32) {
            qe var4 = (qe) null;
            discarded$0 = this.a(-52, (byte) -33, (qe) null);
            return dp.field_k;
        }
        return dp.field_k;
    }

    final boolean c(qe param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 < -33) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_l = -63;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("mc.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final int a(byte param0) {
        int var2 = -96 / ((param0 - -37) / 60);
        int var3 = ll.field_f;
        if (this.field_d.d((byte) 85)) {
            var3 = var3 | um.field_c;
        }
        return var3;
    }

    public static void d(byte param0) {
        field_j = null;
        field_k = null;
        field_f = (uo[][]) null;
        field_i = null;
        if (param0 > -94) {
            return;
        }
        field_h = null;
        field_e = null;
    }

    final int a(boolean param0) {
        if (param0) {
            return 62;
        }
        return 1;
    }

    final byte b(int param0, int param1) {
        if (-1 == (param0 & 7 ^ -1)) {
          return (byte) -1;
        } else {
          if (param1 != 30554) {
            return (byte) -84;
          } else {
            return (byte)((9 & param0) >> -2023959837);
          }
        }
    }

    final int h(int param0) {
        this.field_d.j(96).field_t = true;
        if (param0 != -1) {
            return 77;
        }
        return ll.field_f;
    }

    final int a(int param0) {
        if (param0 != -1) {
            return 98;
        }
        return -1;
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        if (param0 > -25) {
            discarded$0 = this.a(41, 107);
        }
    }

    final dd b(qe param0, int param1) {
        RuntimeException var3 = null;
        dd stackIn_2_0 = null;
        dd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_3_0 = null;
        dd stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackOut_3_0 = mf.field_n;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (dd) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("mc.JA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int i(int param0) {
        int discarded$0 = 0;
        if (param0 != 26840) {
            discarded$0 = this.a((byte) 16);
            return 16;
        }
        return 16;
    }

    final boolean a(int param0, int param1) {
        boolean discarded$0 = false;
        if (param1 >= -28) {
            discarded$0 = this.f(-106);
            return false;
        }
        return false;
    }

    static {
        field_j = new kf[5];
        field_i = "Only show private chat from my friends and opponents";
    }
}
