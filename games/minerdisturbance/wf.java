/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends cc {
    static String[][] field_Y;
    static int[] field_P;
    private int field_T;
    static String field_N;
    private int field_S;
    private int field_W;
    static String field_U;
    static String field_V;
    private int field_O;
    static String[][] field_Q;
    private int field_X;
    private int field_R;

    boolean a(boolean param0) {
        if (param0) {
          this.field_S = 78;
        }
        this.o(24619);
        return super.a(false);
    }

    final static void p(int param0) {
        int var1_int = 0;
        int var2 = MinerDisturbance.field_ab;
        int var1_intLifetime1;
        try {
          if (param0 != 4462) {
            field_Q = (String[][]) null;
          }
          eb.field_d.a(true);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            fb.field_e[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            si.field_f[var1_intLifetime1] = 0L;
          }
          ig.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "wf.T(" + param0 + ')');
        }
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = MinerDisturbance.field_ab;
        eh.c(6 + param2, 35 + param1, this.field_v - 12, -40 + this.field_q, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var4 > var7) {
          if (eh.field_d <= var8 &&
            var8 < eh.field_e) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_v;
            if (20 >= var7) {
              while (20 >= var10) {
                var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (20 - var10);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  eh.field_f[var10 + eh.field_g * var8 + param2] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    eh.field_f[var11 + (var8 * eh.field_g + param2)] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            eh.e(param2 + var10, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param1;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          eh.e(param2, var8Lifetime1, 6, var9Lifetime1);
          eh.e(param2 + this.field_v - 6, var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        if (param0 != 21533) {
          return;
        }
        fh.field_a.f(-90 + param2 + this.field_v, param1 + 10);
        pm.a(param1 + 35, param0 - 21532, 5 + param2, -10 + this.field_v, vk.field_e);
        pm.a(-22 + this.field_q + param1, param0 - 21532, param2, this.field_v, v.field_d);
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_q;
        var7Lifetime2 = 0;
        var8Lifetime2 = param1 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          eh.e(param2, var8Lifetime2, 6, var9Lifetime2);
          eh.e(-6 + this.field_v + param2, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 <= 0) {
          this.a(param3, param2, (byte) 55);
          return;
        }
        this.field_R = this.field_v;
        this.field_S = param2;
        this.field_O = param0;
        this.field_W = 0;
        this.field_T = this.field_q;
        this.field_X = param3;
        if (!param1) {
          this.a(-63, false, 91, -16);
        }
    }

    final static boolean q(int param0) {
        if (param0 < 2) {
          return true;
        }
        return -vh.field_g + (di.field_X + qd.field_M * ac.field_b) == 11055064 + a.field_c ? true : false;
    }

    wf(hm param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_W = 0;
        this.field_O = 0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != 8) {
          field_N = (String) null;
        }
        ti.a((byte) 127);
        eh.f(param1, param0, param3, param4);
    }

    void o(int param0) {
        if (this.field_O <= 0) {
          return;
        }
        this.a(this.field_X, this.field_S, (byte) 55);
        if (param0 != 24619) {
          return;
        }
        this.field_O = 0;
        this.b(true);
    }

    void b(boolean param0) {
        if (!param0) {
          this.field_X = -66;
        }
    }

    public static void g(byte param0) {
        field_Y = (String[][]) null;
        field_P = null;
        field_V = null;
        field_N = null;
        field_Q = (String[][]) null;
        if (param0 != 87) {
          wf.q(-90);
        }
        field_U = null;
    }

    boolean n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != -4) {
          this.b(true);
        }
        if (this.field_O > 0) {
          var2 = this.field_S;
          var3 = this.field_X;
          fieldTemp$0 = this.field_W + 1;
          this.field_W = this.field_W + 1;
          if (this.field_O > fieldTemp$0) {
            var4 = this.field_W * (-this.field_W + this.field_O * 2);
            var5 = this.field_O * this.field_O;
            var3 = var4 * (this.field_X - this.field_T) / var5 + this.field_T;
            var2 = var4 * (-this.field_R + this.field_S) / var5 + this.field_R;
          } else {
            this.field_O = 0;
            this.b(true);
          }
          this.a(var3, var2, (byte) 55);
        }
        return super.n(param0 + 0);
    }

    static {
        field_Y = new String[][]{null, new String[]{"Ice: This stuff's hard, but a little slippery. Watch your footing."}};
        field_N = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_Q = new String[][]{new String[]{"In the top-left corner of the game screen is a list of your equipment. Hold the mouse over an icon to find out more about it.", "", "In the top-right corner of the game screen is your current score.", "", "In the bottom-left corner of the game screen you have a seismograph. Use this to gauge the stability of the volcano."}};
        field_V = "Dig Deep or Die Tryin'";
    }
}
