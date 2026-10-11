/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sl {
    static aa field_e;
    int field_h;
    private int field_k;
    int[][] field_i;
    int[][] field_d;
    byte[][] field_o;
    static int field_n;
    int field_l;
    static int field_j;
    private boolean field_g;
    private int field_c;
    int field_f;
    private int field_m;
    int field_b;
    int field_a;

    final void a(boolean param0, int param1, boolean param2) {
        int var5 = 0;
        int var7 = 0;
        int var4;
        int var6;
        int var8;
        int var9;
        int var10;
        var10 = TrackController.field_F ? 1 : 0;
        if (!param2) {
          this.field_f = -91;
        }
        this.field_m = this.field_h / 5 % ri.field_H.length;
        var4 = this.field_f;
        for (var5 = 0; this.field_o.length > var5; var5++) {
          var6 = this.field_a;
          for (var7 = 0; var7 < this.field_o[0].length; var7++) {
            this.a(var6, var4, 0, (int) this.field_o[var5][var7]);
            var8 = -65 & this.field_d[var5][var7];
            if (var8 >= 7 &&
              var8 < 38) {
              ii.field_r[var8].e(var6, var4);
              if ((this.field_d[var5][var7] & 64) != 0) {
                ue.a(var6, var8, (byte) 91, var4);
              }
            } else {
              if (var8 == 38) {
                if (param0 &&
                  this.field_h % 30 < 15) {
                  ii.field_r[50].e(var6, var4);
                }
                var9 = this.field_b / 3 % 4;
                if (ui.a(0, param2) &&
                  this.field_b != 0) {
                  da.field_p[32 + this.field_l][var9].e(var6, var4);
                } else {
                  da.field_p[this.field_l][var9].e(var6, var4);
                }
              }
            }
            var6 += 26;
          }
          var4 += 26;
        }
        this.a(467, (byte) -117, 229 + param1);
    }

    final void a(int[][] param0, byte param1, int[][] param2, byte[][] param3) {
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param3.length == 0) {
            this.field_o = new byte[0][0];
          } else {
            this.field_o = new byte[param3.length][param3[0].length];
          }
          if (param1 != 50) {
            this.a(-69, 10, -15, -70);
          }
          if (param0.length != 0) {
            this.field_d = new int[param0.length][param0[0].length];
          } else {
            this.field_d = new int[0][0];
          }
          for (var5_int = 0; var5_int < param3.length; var5_int++) {
            pd.a(param3[var5_int], 0, this.field_o[var5_int], 0, param3[var5_int].length);
            pd.a(param0[var5_int], 0, this.field_d[var5_int], 0, param0[var5_int].length);
          }
          this.field_i = new int[param2.length][param2[0].length];
          for (var5_intLifetime1 = 0; var5_intLifetime1 < param2.length; var5_intLifetime1++) {
            pd.a(param2[var5_intLifetime1], 0, this.field_i[var5_intLifetime1], 0, param2[0].length);
          }
          if (this.field_g) {
            var5_intLifetime2 = 6;
            var6 = 0;
            var7 = 8;
            var8 = 0;
            for (var9 = 0; 8 > var9; var9++) {
              for (var10 = 0; var10 < 6; var10++) {
                if (0 != param2[var9][var10]) {
                  var5_intLifetime2 = Math.min(var5_intLifetime2, var10);
                  var6 = Math.max(var6, var10);
                  var7 = Math.min(var7, var9);
                  var8 = Math.max(var8, var9);
                }
              }
            }
            this.field_k = (5 - var6 - var5_intLifetime2) * 13;
            this.field_c = (7 - var8 - var7) * 13;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("sl.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 107) {
          String var2 = (String) null;
          sl.a((Throwable) null, (String) null);
        }
    }

    void a(ea param0, int param1) {
        try {
          this.a(param0.field_d, (byte) 50, param0.field_i, param0.field_o);
          if (param1 <= 36) {
            this.field_f = 43;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "sl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          var5 = param3;
          if (var5 != 0) {
            if (var5 != 1 &&
              var5 != 2) {
              switch (var5) {
                case 4:
                  ii.field_r[ri.field_H[this.field_m]].g(param0, param1);
                  break L0;
                case 3:
                  ii.field_r[ri.field_H[this.field_m]].e(param0, param1);
                  break L0;
                case 6:
                  ii.field_r[ki.field_c[this.field_m]].f(param0, param1);
                  break L0;
                default:
                  break L0;
                case 5:
                  ii.field_r[ki.field_c[this.field_m]].e(param0, param1);
                  break L0;
              }
            }
            ii.field_r[param3].e(param0, param1);
          }
        }
        if (param2 != 0) {
          this.a(false, 1);
        }
    }

    void a(boolean param0, int param1) {
        if (param1 < 72) {
          return;
        }
        this.field_h = this.field_h + 1;
    }

    final static th a(int param0, int param1) {
        th var2 = new th();
        if (param1 > -89) {
          return (th) null;
        }
        fh.field_b.a((byte) -122, var2);
        nk.a(param0, -108);
        return var2;
    }

    final static void b(byte param0) {
        if (param0 != -51) {
          field_n = -45;
        }
    }

    final static nl a(Throwable param0, String param1) {
        nl var2 = null;
        if (!(param0 instanceof nl)) {
          var2 = new nl(param0, param1);
        } else {
          var2 = (nl) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    final void a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var8 = 0;
        qj var4;
        int var5;
        int var7;
        int var9;
        int var10;
        qj var11;
        var10 = TrackController.field_F ? 1 : 0;
        var11 = nd.field_L[4];
        var4 = var11;
        cl.a(nd.field_L, -10 + param0, 228, param2 - 10, 176, 4);
        if (param1 > 0) {
          return;
        }
        nd.field_L[4] = var11;
        ll.a(nd.field_F);
        ll.b(param0, param2, param0 + 156, param2 + 208);
        cl.a(nd.field_L, param0 - 10, 228, -10 + param2, 176, 4);
        var5 = this.field_c + param2;
        for (var6 = 0; 8 > var6; var6++) {
          var7 = param0 + this.field_k;
          for (var8 = 0; var8 < 6; var8++) {
            var9 = this.field_i[var6][var8];
            if (var9 >= 7 &&
              var9 < 38) {
              ii.field_r[var9].e(var7, var5);
            }
            var7 += 26;
          }
          var5 += 26;
        }
        ll.b(nd.field_F);
    }

    sl(boolean param0, int param1, int param2) {
        this.field_c = 0;
        this.field_f = param2;
        this.field_k = 0;
        this.field_g = param0 ? true : false;
        this.field_a = param1;
    }

    static {
        field_e = new aa(8, 0, 4, 1);
    }
}
