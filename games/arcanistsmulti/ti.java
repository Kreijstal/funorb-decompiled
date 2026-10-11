/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends df implements vb {
    private int field_K;
    mb field_P;
    String field_D;
    static String field_F;
    private ag field_O;
    static int field_N;
    dj field_Q;
    private ag field_E;
    static String field_C;
    boolean field_G;
    private int field_R;
    static ll[] field_I;
    static String field_M;
    sl field_H;
    private boolean field_J;

    ti(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (pf) null);
        this.field_D = "";
        this.field_Q = ia.field_c;
        try {
          this.field_P = new mb(this, this.field_Q, param0, param1);
          this.field_G = false;
          this.field_P.field_o = (wc) (this);
          this.field_R = param2;
          this.field_O = new ag("", new j(this), (wc) (this));
          this.field_E = new ag();
          this.field_E.field_r = (pf) ((Object) new va());
          this.field_E.field_o = (wc) (this);
          this.c(-83, this.field_O);
          this.c(-74, this.field_E);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean d(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -2116) {
          this.g(69);
        }
        stackIn_7_0 = (this.field_J) || (super.d(-2116));
        return stackIn_7_0;
    }

    private final void i(int param0) {
        if (this.j(param0 + 2)) {
          this.b(this.field_n, this.field_v, this.field_K, this.field_j, 65);
          if (param0 != 0) {
            qm var3 = (qm) null;
            this.a((qm) null, -14, -32, 91);
          }
          this.field_G = false;
          this.field_H.a(true);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
          this.field_E = (ag) null;
        }
        this.field_K = param0;
        this.b(param3, param2, param0, param1, 107);
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        boolean stackIn_58_0 = false;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int var6_intLifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!this.d(-2116)) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_P.field_W) {
            var5_int = this.field_P.field_W.length;
            if (param3 != 99 &&
              98 != param3) {
              if (param3 != 105 &&
                param3 != 104) {
                if (param3 == 84) {
                  if (!this.field_G) {
                    this.g(-83);
                  } else {
                    this.i(0);
                  }
                  return true;
                }
                if (param3 == 85) {
                  var6_int = this.field_D.length();
                  if (var6_int <= 0) {
                    return true;
                  }
                  this.field_D = this.field_D.substring(0, var6_int - 1);
                  return true;
                }
                decompiledFrameRemainder0 = !(param2 < 32);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(param2 >= 128))) {
                  var6 = this.field_D + param2;
                  this.a(var6, -86);
                  return true;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.j(2)) {
                  this.g(-62);
                }
                var6_intLifetime1 = this.field_H.field_P.field_k / this.field_P.field_T;
                if (param3 != 105) {
                  this.field_P.field_Y = this.field_P.field_Y - var6_intLifetime1;
                } else {
                  this.field_P.field_Y = this.field_P.field_Y + var6_intLifetime1;
                }
                if (this.field_P.field_Y < 0) {
                  this.field_P.field_Y = 0;
                }
                if (var5_int <= this.field_P.field_Y) {
                  this.field_P.field_Y = -1 + var5_int;
                }
                this.h(11149);
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              if (!this.j(2)) {
                this.g(-114);
              }
              if (param3 == 99) {
                this.field_P.field_Y = this.field_P.field_Y + 1;
              } else {
                this.field_P.field_Y = this.field_P.field_Y - 1;
              }
              if (0 > this.field_P.field_Y) {
                this.field_P.field_Y = 0;
              }
              if (var5_int <= this.field_P.field_Y) {
                this.field_P.field_Y = -1 + var5_int;
              }
              this.h(11149);
              return true;
            }
          }
          if (param1 > -120) {
            this.d(59);
          }
          if (param3 != 80) {
            stackIn_58_0 = super.a(param0, (byte) -125, param2, param3);
            return stackIn_58_0;
          }
          this.i(0);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_61_0 = var5;
          stackIn_61_1 = new StringBuilder().append("ti.N(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        qm var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!param0) {
            var7 = (qm) null;
            this.a(-2, (qm) null);
          }
          if (!this.j(2)) {
            this.g(-107);
          } else {
            this.i(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ti.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, boolean param2, qb param3, ll param4, nf param5, int param6) {
        int var21 = 0;
        int var22 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var26 = null;
        byte[] var29 = null;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param6 = param6 + param3.field_x;
          param0 = param0 + param3.field_o;
          param1 = param1 + param3.field_o;
          var7_int = param3.field_q;
          var8 = param3.field_y;
          if (param6 >= param5.field_y) {
            return false;
          }
          if (param6 <= -var7_int) {
            return false;
          }
          if (param2) {
            return false;
          }
          if (param0 < param5.field_H &&
            param0 > -var8) {
            stackIn_17_0 = (0 < param6) ? param6 : 0;
            var9 = stackIn_17_0;
            var10 = param6 + var7_int;
            if (param5.field_y < var10) {
              var10 = param5.field_y;
            }
            stackIn_22_0 = (param0 <= 0) ? 0 : param0;
            var11 = stackIn_22_0;
            var12 = param0 + var8;
            var10 = var10 - var9;
            if (var12 > param5.field_y) {
              var12 = param5.field_y;
            }
            var12 = var12 - var11;
            if ((1 & var10) > 0) {
              var10--;
            }
            if ((1 & var12) > 0) {
              var12--;
            }
            var13 = param5.field_hb * (var11 >> 1) + (var9 >> 1);
            var14 = param5.field_hb - (var10 >> 1);
            var15 = (var11 - param0) * param3.field_q - (-var9 + param6);
            var16 = var7_int - var10;
            var17 = var9 - (param6 - (-param1 + var11) * param3.field_q);
            var16 = var16 + var7_int;
            var29 = param4.field_m;
            var26 = param3.field_A;
            var24 = var26;
            var19 = var24;
            var20 = var26.length;
            for (var21 = var12; var21 > 0; var21 -= 2) {
              for (var22 = var10; var22 > 0; var22 -= 2) {
                if (var29[var13] != 0 && (1 + var7_int + (var17 + var7_int) >= var20 ||
                  0 == var19[var7_int + var17] &&
                  var19[1 + (var7_int + var17)] == 0 &&
                  var19[var17 + var7_int + var7_int] == 0 &&
                  var19[var17 - (-var7_int - var7_int) + 1] == 0)) {
                  if (var26[var15] != 0) {
                    return true;
                  }
                  if (var19[1 + var15] != 0) {
                    return true;
                  }
                  if (var19[var7_int + var15] != 0) {
                    return true;
                  }
                  if (var19[var7_int + var15 + 1] != 0) {
                    return true;
                  }
                }
                var13++;
                var15 += 2;
                var17 += 2;
              }
              var17 = var17 + var16;
              var13 = var13 + var14;
              var15 = var15 + var16;
              if (param4.field_m.length <= var13) {
                return false;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_64_0 = var7;
          stackIn_64_1 = new StringBuilder().append("ti.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param4 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(String param0, int param1) {
        if (this.field_P.field_W == null) {
          return;
        }
        if (param1 >= -39) {
          this.a(-126);
        }
        int var3_int = this.a((byte) 78, param0.toLowerCase());
        if (var3_int == -1) {
          return;
        }
        try {
          this.field_P.field_Y = var3_int;
          this.h(11149);
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ti.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0) {
        if (ce.field_g != null) {
          return;
        }
        ce.field_g = new String[31];
        ce.field_g[14] = jk.field_j;
        ce.field_g[0] = nj.field_g;
        ce.field_g[23] = ArcanistsMulti.field_H;
        ce.field_g[19] = tm.field_f;
        ce.field_g[21] = th.field_i;
        ce.field_g[6] = mb.field_Z;
        ce.field_g[20] = sd.field_g;
        ce.field_g[18] = mj.field_y;
        if (param0 != -90) {
          wf var2 = (wf) null;
          ti.a((byte) 106, 40, (wf) null);
        }
        ce.field_g[2] = r.field_e;
        ce.field_g[26] = mn.field_w;
        ce.field_g[17] = ui.field_q;
        ce.field_g[28] = ji.field_l;
        ce.field_g[9] = ed.field_xb;
        ce.field_g[7] = se.field_J;
        ce.field_g[4] = da.field_a;
        ce.field_g[5] = he.field_b;
        ce.field_g[11] = eg.field_d;
        ce.field_g[1] = ol.field_a;
        ce.field_g[30] = mo.field_d;
        ce.field_g[29] = me.field_Q;
        ce.field_g[8] = null;
        ce.field_g[27] = ie.field_Lb;
        ce.field_g[22] = he.field_g;
        ce.field_g[15] = be.field_i;
        ce.field_g[24] = lh.field_a;
        ce.field_g[13] = gb.field_a;
        ce.field_g[25] = ab.field_q;
    }

    private final void h(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        int var8Lifetime1;
        if (this.j(2) &&
          this.field_P.field_Y != -1 &&
          this.field_P.field_W != null &&
          null != this.field_H.field_O) {
          if (param0 != 11149) {
            this.field_P = (mb) null;
          }
          var2 = this.field_H.field_P.field_k;
          var3 = this.field_P.field_T;
          var4 = this.field_P.field_k - var2;
          if (0 >= var4) {
            return;
          }
          var5 = var3 * this.field_P.field_Y;
          var6 = this.field_H.field_P.field_B.field_j + var5;
          var7 = var2 >> 2;
          if (var7 > var6) {
            var8 = -(-var5 + var7 << 16) / var4;
            if (var8 < 0) {
              var8 = 0;
            }
            this.field_H.field_O.field_L = var8;
          }
          var7Lifetime1 = (var2 * 3 >> 2) - var3;
          if (var7Lifetime1 < var6) {
            var8Lifetime1 = -(var7Lifetime1 - var5 << 16) / var4;
            if (var8Lifetime1 > 65536) {
              var8Lifetime1 = 65536;
            }
            this.field_H.field_O.field_L = var8Lifetime1;
          }
          return;
        }
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_Q = (dj) null;
          }
          param1.d((byte) 29);
          this.field_D = "";
          this.field_J = true;
          if (null != this.field_o &&
            this.field_o instanceof wb) {
            ((wb) (this.field_o)).a(false, this.field_J, (qm) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ti.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 != 0) {
          this.field_P = (mb) null;
        }
        if (this.field_o instanceof ak) {
          ((ak) ((Object) this.field_o)).a(this, -6509);
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        super.a(param2, param3, param1, param0, -76);
        this.field_O.a(this.field_K, 0, param1 - 20, 0, -89);
        this.field_E.a(this.field_K, 0, 20, param1 - 20, -73);
        if (this.field_G) {
          this.field_H.a(-this.field_K + param2, this.field_K, param1, 0, -110);
        }
        if (param4 < 27) {
          this.b(false);
        }
    }

    final static fk a(byte param0, int param1, wf param2) {
        RuntimeException var3 = null;
        fk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -30) {
            field_I = (ll[]) null;
          }
          stackIn_3_0 = sc.a(kd.a(param2, 100, param1), (byte) 68);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ti.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String b(boolean param0) {
        int discarded$0 = 0;
        if (!this.field_w) {
          return null;
        }
        if (param0) {
          String var3 = (String) null;
          discarded$0 = this.a((byte) -128, (String) null);
        }
        if (this.j(2) &&
          this.field_H.field_w &&
          -1 != this.field_P.field_Q) {
          return this.field_P.field_W[this.field_P.field_Q].toString();
        }
        if (this.field_P.g(126) != null) {
          return this.field_P.g(127).toString();
        }
        return super.b(false);
    }

    private final void g(int param0) {
        int var2 = this.field_P.f(27825);
        int var3 = var2;
        int var4 = 0;
        if (var3 > this.field_R) {
          var4 = 1;
          var3 = this.field_R;
        }
        this.b(this.field_n, this.field_v, var3 + this.field_K, this.field_j, 55);
        this.field_P.a(var2, 0, this.field_v, 0, -50);
        this.field_H = new sl(0, 0, 0, 0, new eb(), this.field_P, (pf) null);
        if (var4 != 0) {
          this.field_H.a(true, 1, rd.b(-15438));
        }
        this.field_H.a(this.field_k - this.field_K, this.field_K, this.field_v, 0, -114);
        this.field_G = true;
        this.c(-90, this.field_H);
        this.h(11149);
        if (param0 >= -38) {
          this.field_D = (String) null;
        }
    }

    private final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param1 = param1.toLowerCase();
          var3_int = 0;
          while (true) {
            if (this.field_P.field_W.length <= var3_int) {
              if (param0 < 35) {
                this.j(5);
              }
              stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var4 = this.field_P.field_W[var3_int].toString().toLowerCase();
            if (!var4.startsWith(param1)) {
              var3_int++;
              continue;
            }
            break;
          }
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ti.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        this.field_J = false;
        super.d(param0);
    }

    final int g(byte param0) {
        if (param0 != 37) {
          this.field_O = (ag) null;
        }
        return this.field_P.field_Y;
    }

    final boolean j(int param0) {
        int discarded$0 = 0;
        if (param0 != 2) {
          String var3 = (String) null;
          discarded$0 = this.a((byte) -123, (String) null);
        }
        return this.field_G;
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -94 / ((-42 - param4) / 35);
          stackIn_1_0 = super.a(param0, param1, param2, param3, -105, param5, param6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ti.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void k(int param0) {
        if (param0 != 0) {
          nf var2 = (nf) null;
          ti.a(64, -6, true, (qb) null, (ll) null, (nf) null, 111);
        }
        field_F = null;
        field_M = null;
        field_I = null;
        field_C = null;
    }

    static {
        field_F = "You have earned as many wands as you are currently able to, and can now trade in all of your spells to purchase a prestige hat, which will appear within the game.<br>Be warned that, with every prestige hat you acquire, it will become increasingly harder to earn wands.";
        field_C = "Private";
        field_M = "Return to Main Menu";
    }
}
