/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ma {
    byte field_H;
    int field_P;
    int field_M;
    int field_N;
    static String field_r;
    byte field_D;
    static String field_F;
    static String field_K;
    static int field_y;
    int field_n;
    ge field_T;
    static String field_p;
    static String field_B;
    int field_u;
    short field_C;
    int field_I;
    ko field_m;
    byte field_w;
    int[] field_U;
    static String field_G;
    static String field_O;
    int field_v;
    boolean field_t;
    int field_L;
    static int field_o;
    static oc[] field_S;
    int field_Q;
    int field_z;
    int field_q;
    static int field_J;
    short field_A;
    boolean field_E;
    short field_V;
    byte field_l;
    ko field_R;
    long field_x;
    int field_s;

    final boolean a(byte param0, int param1) {
        aa var3;
        int var4;
        cr var5;
        var3 = new aa(this.field_m);
        var4 = 105 / ((param0 + 53) / 59);
        var5 = (cr) (var3.b((byte) -92));
        while (var5 != null) {
          if (var5.field_n == param1) {
            return true;
          }
          var5 = (cr) (var3.b(-108));
        }
        return false;
    }

    final static tc b(boolean param0) {
        if (!param0) {
          field_K = (String) null;
          return w.a(false, 1);
        }
        return w.a(false, 1);
    }

    final String a(int param0, al param1) {
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var3Lifetime1;
        String var3Lifetime2;
        String var3Lifetime3;
        try {
          if (param0 != 1) {
            qe.b(false);
          }
          var5 = "Shot " + this.field_v + " " + am.a(8, this.field_q) + " player " + param1.field_h[this.field_L];
          var3 = var5;
          var3Lifetime1 = var5;
          var3Lifetime2 = var5;
          if (0 <= this.field_M) {
            var3Lifetime2 = var5 + " break seed " + this.field_M;
          }
          var4 = this.field_u;
          if (var4 != 2) {
            if (var4 != 3) {
              if (var4 == 1) {
                var3Lifetime2 = var3Lifetime2 + " BiH kitchen";
              }
            } else {
              var3Lifetime2 = var3Lifetime2 + " BiH D";
            }
          } else {
            var3Lifetime2 = var3Lifetime2 + " BiH anywhere";
          }
          var6 = var3Lifetime2 + " before_group_on=" + this.field_z;
          var3Lifetime3 = var6;
          if (null == this.field_T) {
            var3Lifetime3 = var6 + " before state null!";
          }
          stackIn_17_0 = var3Lifetime3;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("qe.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        if (param0 > -66) {
          return false;
        }
        if (0 == (ab.field_g & this.field_s)) {
          return false;
        }
        if ((24 & this.field_l) == 0) {
          return true;
        }
        return false;
    }

    final void a(ge param0, byte param1) {
        if (param1 != 0) {
          return;
        }
        try {
          param0.a((int) this.field_l, false);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qe.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_K = null;
        field_B = null;
        field_r = null;
        field_F = null;
        field_G = null;
        if (param0 >= 100) {
          field_p = null;
          field_O = null;
          field_S = null;
          return;
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (null == this.field_R) {
            this.field_R = new ko();
          }
          this.field_R.b((byte) 124, new dn(param0, param2));
          if (param1 != -14) {
            field_S = (oc[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("qe.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        p.a(param3, param2 ^ 40844);
        hp.a(param1, param3, param0, 30);
        if (param2 != -40960) {
          qe.b(false);
        }
    }

    final void b(byte param0, ge param1) {
        boolean discarded$1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(param1.g(-105), true);
          if (!this.d(117)) {
            this.field_q = 3;
          }
          if (param0 <= 13) {
            discarded$1 = this.a(30, -70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
          if (param5 < qh.field_b) {
            param0 = param0 - (-param5 + qh.field_b);
            param5 = qh.field_b;
          }
          if (param3 < qh.field_c) {
            param1 = param1 - (-param3 + qh.field_c);
            param3 = qh.field_c;
          }
          if (qh.field_j < param0 + param5) {
            param0 = qh.field_j - param5;
          }
          if (qh.field_g < param3 + param1) {
            param1 = qh.field_g - param3;
          }
          if (param0 > 0 &&
            param1 > 0) {
            var6_int = param5 + qh.field_l * param3;
            var7 = -param0 + qh.field_l;
            param3 = -param1;
            if (param4 < 94) {
              return;
            }
            while (0 > param3) {
              for (param5 = -param0; 0 > param5; param5++) {
                var8 = qh.field_d[var6_int];
                if (param2 < (65280 & var8) >> 8 &&
                  (var8 & 65280) >> 8 >= (var8 & 16711680) >> 16) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = (255 & var8) >> 3;
                  qh.field_d[var6_int] = md.a(var11, md.a(var9 << 16, var10));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
              param3++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var6), "qe.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        var2 = param0;
        var3 = im.field_fc;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (param1 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
        } else {
          if (var3 < 105) {
            var2 = (-40960 + 16384 * var3) / 220;
            var4 = 1;
            var5 = 0;
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 3) {
              var4 = -1;
            }
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
            }
            if (param1 == 5) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 == 6) {
              var5 = -1;
              var4 = 1;
            }
            if (param1 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (param1 == 8) {
                var4 = -1;
                var5 = -1;
              }
            }
          } else {
            if (120 <= var3) {
              var4 = 1;
              var5 = 0;
              if (param1 == 1) {
                var5 = 1;
              }
              if (param1 == 3) {
                var4 = -1;
              }
              if (param1 == 4) {
                var5 = 1;
                var4 = 1;
              }
              if (param1 == 5) {
                var4 = -1;
                var5 = 1;
              }
              if (param1 == 6) {
                var5 = -1;
                var4 = 1;
              }
              if (param1 == 7 ||
                param1 == 8) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 11) {
                var4 = -1;
              }
              if (param1 == 12) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 13) {
                var5 = -1;
                var4 = 1;
              }
              if (param1 == 14) {
                var5 = 1;
                var4 = -1;
              }
              if (param1 == 15) {
                var4 = 1;
                var5 = 1;
              }
              li.field_b = cf.a(var2 * var5, false, var2 * var4);
              return;
            }
            var3 = -var3 + 120;
            var2 = 8192 - var3 * (var3 * 8192) / 3300;
            var4 = 1;
            var5 = 0;
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 3) {
              var4 = -1;
            }
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
            }
            if (param1 == 5) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 == 6) {
              var5 = -1;
              var4 = 1;
            }
            if (param1 == 7 ||
              param1 == 8) {
              var4 = -1;
              var5 = -1;
            }
          }
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (param1 == 12) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (param1 == 15) {
          var4 = 1;
          var5 = 1;
        }
        li.field_b = cf.a(var2 * var5, false, var2 * var4);
    }

    final byte c(byte param0, ge param1) {
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param0 != -28) {
            this.field_T = (ge) null;
          }
          var3_int = param1.g(-78) & 255;
          if ((this.field_v & 255) != var3_int) {
            param1.field_v = param1.field_v + 6;
            if (var3_int >= this.field_v - 1) {
              return (byte) 1;
            }
            System.out.println("Read the wrong move packet. Wanted " + this.field_v + ", but got " + var3_int);
            stackIn_17_0 = 1;
            return (byte) stackIn_17_0;
          }
          var4 = param1.d((byte) -80);
          var5 = param1.d((byte) -108);
          var6 = param1.d((byte) -103);
          var7 = param1.e((byte) 105);
          var8 = param1.e((byte) 105);
          if (this.field_q == 0) {
            this.field_D = (byte)var7;
            this.field_H = (byte)var8;
            this.field_C = (short)var4;
            this.field_V = (short)var6;
            this.field_A = (short)var5;
            stackIn_13_0 = 0;
            return (byte) stackIn_13_0;
          }
          if (this.field_C == var4 &&
            var5 == this.field_A &&
            var6 == this.field_V &&
            this.field_D == var7 &&
            var8 == this.field_H) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = 2;
          }
          return (byte) stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("qe.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void b(ge param0, byte param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_q != 2 &&
            3 != this.field_q) {
            throw new IllegalStateException("Can't write an end resolution until the shot is finished");
          }
          param0.b(this.field_s, 66);
          if (param1 >= -65) {
            qe.a(false, 'ﾨ');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qe.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(boolean param0) {
        String var3 = "end choice: ";
        String var2 = var3;
        var2 = var3;
        var2 = var3;
        if ((this.field_l & 1) != 0) {
          var2 = var3 + "; group 0";
        }
        if ((this.field_l & 2) != 0) {
          var2 = var2 + "; group 1";
        }
        if ((this.field_l & 16) != 0) {
          var2 = var2 + "; pass";
        }
        if (param0) {
          if ((8 & this.field_l) != 0) {
            var2 = var2 + "; play";
          }
          if ((64 & this.field_l) != 0) {
            var2 = var2 + "; opponent pass";
          }
          if (0 != (this.field_l & 32)) {
            var2 = var2 + "; opponent play";
          }
          return var2;
        }
        qe.a(82, -62, 92, 61, (byte) 96, -63);
        if ((8 & this.field_l) != 0) {
          var2 = var2 + "; play";
        }
        if ((64 & this.field_l) != 0) {
          var2 = var2 + "; opponent pass";
        }
        if (0 != (this.field_l & 32)) {
          var2 = var2 + "; opponent play";
        }
        return var2;
    }

    final void a(al param0, ge param1, int param2) {
        al var6 = null;
        pq var5 = null;
        ge var4_ref = null;
        try {
          var6 = param0;
          al var4 = var6;
          var5 = var6.field_l[0];
          this.field_Q = var5.field_k;
          this.field_P = var5.field_g;
          if (param2 != -7478) {
            this.field_t = false;
          }
          var4_ref = param1;
          var4_ref.a(true, this.field_P);
          var4_ref.a(true, this.field_Q);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qe.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String c(int param0) {
        if (param0 == 26859) {
          return "firstcontactid: " + this.field_n + ", pottings: " + this.field_m.a(45) + (!this.field_t ? "" : ", fouled") + ", resolution: " + ab.a(this.field_s, (byte) 10);
        }
        field_p = (String) null;
        return "firstcontactid: " + this.field_n + ", pottings: " + this.field_m.a(45) + (!this.field_t ? "" : ", fouled") + ", resolution: " + ab.a(this.field_s, (byte) 10);
    }

    final boolean c(boolean param0) {
        if (!param0) {
          return true;
        }
        if (0 == (oa.field_b & this.field_s)) {
          return false;
        }
        if ((3 & this.field_l) == 0) {
          return true;
        }
        return false;
    }

    final String e(int param0) {
        StringBuilder stackIn_5_0 = null;
        String stackIn_5_1 = null;
        StringBuilder stackIn_6_0 = null;
        if (param0 != 0) {
          return (String) null;
        }
        stackIn_6_0 = new StringBuilder().append("ang=").append(this.field_C).append(",").append(this.field_A).append("; pow=").append(this.field_V).append("; strk=").append(this.field_D).append(",").append(this.field_H);
        if (-1 == this.field_P) {
          stackIn_5_0 = stackIn_6_0;
          stackIn_5_1 = "";
          return ((StringBuilder) (Object) stackIn_5_0).append(stackIn_5_1).toString();
        }
        if (this.field_Q == -1) {
          return ((StringBuilder) (Object) stackIn_6_0).append("").toString();
        }
        return ((StringBuilder) (Object) stackIn_6_0).append(" cueball@" + this.field_P + "," + this.field_Q).toString();
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        ge var5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        ge var5Lifetime1;
        ge var5Lifetime2;
        ge var5Lifetime3;
        int var3Lifetime4;
        var4 = Pool.field_O;
        if ((oa.field_b & this.field_s) != 0) {
          if ((3 & param0) == 0) {
            if ((ab.field_g & this.field_s) != 0 &&
              (param0 & 24) != 0) {
              var3 = this.field_l & 24;
              if (var3 == 0) {
                var3 = param0;
                this.field_l = (byte)(this.field_l | param0);
              } else {
                if (param0 != var3) {
                  throw new IllegalStateException("Already made another play/pass choice!");
                }
              }
            }
            if ((a.field_d & this.field_s) != 0 &&
              (96 & param0) != 0) {
              var3Lifetime4 = this.field_l & 96;
              if (var3Lifetime4 != 0) {
                if (var3Lifetime4 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              } else {
                var3Lifetime4 = param0;
                this.field_l = (byte)(this.field_l | param0);
              }
            }
            if (!this.a(-28872, param0)) {
              throw new IllegalStateException("Can't make a choice now!");
            }
            this.field_l = (byte)(this.field_l | param0);
            if (!param1) {
              var5 = (ge) null;
              this.b((byte) 32, (ge) null);
            }
            return;
          }
          var3Lifetime2 = this.field_l & 3;
          if (var3Lifetime2 != 0) {
            if (var3Lifetime2 != param0) {
              throw new IllegalStateException("Already made another group choice!");
            }
            if ((ab.field_g & this.field_s) != 0 &&
              (param0 & 24) != 0) {
              var3Lifetime2 = this.field_l & 24;
              if (var3Lifetime2 == 0) {
                var3Lifetime2 = param0;
                this.field_l = (byte)(this.field_l | param0);
              } else {
                if (param0 != var3Lifetime2) {
                  throw new IllegalStateException("Already made another play/pass choice!");
                }
              }
            }
            if ((a.field_d & this.field_s) != 0 &&
              (96 & param0) != 0) {
              var3Lifetime2 = this.field_l & 96;
              if (var3Lifetime2 != 0) {
                if (var3Lifetime2 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              } else {
                var3Lifetime2 = param0;
                this.field_l = (byte)(this.field_l | param0);
              }
            }
            if (!this.a(-28872, param0)) {
              throw new IllegalStateException("Can't make a choice now!");
            }
            this.field_l = (byte)(this.field_l | param0);
            if (param1) {
              return;
            }
            var5Lifetime3 = (ge) null;
            this.b((byte) 32, (ge) null);
            return;
          }
          var3Lifetime3 = param0;
          this.field_l = (byte)(this.field_l | param0);
        }
        if ((ab.field_g & this.field_s) == 0) {
          if ((a.field_d & this.field_s) != 0 &&
            (96 & param0) != 0) {
            var3Lifetime1 = this.field_l & 96;
            if (var3Lifetime1 == 0) {
              var3Lifetime1 = param0;
              this.field_l = (byte)(this.field_l | param0);
            } else {
              if (var3Lifetime1 != param0) {
                throw new IllegalStateException("Already made another opponent play/pass choice!");
              }
            }
          }
        } else {
          if ((param0 & 24) == 0) {
            if ((a.field_d & this.field_s) != 0 &&
              (96 & param0) != 0) {
              var3Lifetime1 = this.field_l & 96;
              if (var3Lifetime1 == 0) {
                var3Lifetime1 = param0;
                this.field_l = (byte)(this.field_l | param0);
              } else {
                if (var3Lifetime1 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              }
            }
          } else {
            var3Lifetime1 = this.field_l & 24;
            if (var3Lifetime1 == 0) {
              var3Lifetime1 = param0;
              this.field_l = (byte)(this.field_l | param0);
              if ((a.field_d & this.field_s) != 0 &&
                (96 & param0) != 0) {
                var3Lifetime1 = this.field_l & 96;
                if (var3Lifetime1 == 0) {
                  var3Lifetime1 = param0;
                  this.field_l = (byte)(this.field_l | param0);
                } else {
                  if (var3Lifetime1 != param0) {
                    throw new IllegalStateException("Already made another opponent play/pass choice!");
                  }
                }
              }
            } else {
              if (param0 != var3Lifetime1) {
                throw new IllegalStateException("Already made another play/pass choice!");
              }
              if ((a.field_d & this.field_s) != 0 &&
                (96 & param0) != 0) {
                var3Lifetime1 = this.field_l & 96;
                if (var3Lifetime1 == 0) {
                  var3Lifetime1 = param0;
                  this.field_l = (byte)(this.field_l | param0);
                  if (!this.a(-28872, param0)) {
                    throw new IllegalStateException("Can't make a choice now!");
                  }
                  this.field_l = (byte)(this.field_l | param0);
                  if (!param1) {
                    var5Lifetime1 = (ge) null;
                    this.b((byte) 32, (ge) null);
                  }
                  return;
                }
                if (var3Lifetime1 != param0) {
                  throw new IllegalStateException("Already made another opponent play/pass choice!");
                }
              }
            }
          }
        }
        if (!this.a(-28872, param0)) {
          throw new IllegalStateException("Can't make a choice now!");
        }
        this.field_l = (byte)(this.field_l | param0);
        if (param1) {
          return;
        }
        var5Lifetime2 = (ge) null;
        this.b((byte) 32, (ge) null);
    }

    final boolean d(int param0) {
        if (this.field_s == uk.field_a) {
          return false;
        }
        if (param0 < 105) {
          return false;
        }
        if (this.c(true)) {
          return true;
        }
        if (this.a(-103)) {
          return true;
        }
        if (!this.c((byte) 85)) {
          return false;
        }
        return true;
    }

    final void a(byte param0, ge param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.f(98);
          if (param0 < 76) {
            return;
          }
          this.c(2, var3_int);
          if ((pd.field_i & 2097152L) != 0L) {
            System.out.println("->S2C_END_SHOT: " + ab.a(this.field_s, (byte) 10));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qe.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static String a(boolean param0, char param1) {
        if (param0) {
          return (String) null;
        }
        return String.valueOf(param1);
    }

    final void c(int param0, int param1) {
        try {
          if (param0 != 2) {
            return;
          }
          if (uk.field_a == this.field_s) {
            this.field_s = param1;
            return;
          }
          if (this.field_s == param1) {
            return;
          }
          tc.a(new Throwable(), "New end resolution 0b" + Integer.toString(this.field_s, 2) + ": " + wd.b(param1, param0 ^ 87) + " does not match current one 0b" + Integer.toString(param1, 2) + ": " + wd.b(this.field_s, 77), -8555);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, int param1) {
        boolean stackIn_27_0 = false;
        boolean stackIn_101_0 = false;
        if ((this.field_s & oa.field_b) == 0) {
          if ((ab.field_g & this.field_s) != 0 &&
            0 != (24 & param1)) {
            if ((24 & this.field_l) == 0) {
              return true;
            }
            if ((24 & this.field_l) == param1) {
              return true;
            }
            return false;
          }
          if (param0 != -28872) {
            this.field_A = (short) 5;
            if ((this.field_s & a.field_d) == 0) {
              return (param1 == 0);
            }
            if ((param1 & 96) == 0) {
              return (param1 == 0);
            }
            stackIn_27_0 = ((this.field_l & 96) == 0) || (param1 == (96 & this.field_l));
            return stackIn_27_0;
          }
        } else {
          if ((param1 & 3) != 0) {
            if ((3 & this.field_l) == 0) {
              stackIn_101_0 = true;
            } else {
              if ((3 & this.field_l) == param1) {
                return true;
              }
              stackIn_101_0 = false;
            }
            return stackIn_101_0;
          }
          if ((ab.field_g & this.field_s) != 0 &&
            0 != (24 & param1)) {
            if ((24 & this.field_l) == 0) {
              return true;
            }
            if ((24 & this.field_l) != param1) {
              return false;
            }
            return true;
          }
          if (param0 == -28872) {
            if ((this.field_s & a.field_d) == 0) {
              return (param1 == 0);
            }
            if ((param1 & 96) == 0) {
              return (param1 == 0);
            }
            if ((this.field_l & 96) == 0) {
              return true;
            }
            if (param1 != (96 & this.field_l)) {
              return false;
            }
            return true;
          }
          this.field_A = (short) 5;
        }
        if ((this.field_s & a.field_d) == 0) {
          return (param1 == 0);
        }
        if ((param1 & 96) == 0) {
          return (param1 == 0);
        }
        if ((this.field_l & 96) == 0) {
          return true;
        }
        if (param1 == (96 & this.field_l)) {
          return true;
        }
        return false;
    }

    final boolean c(byte param0) {
        if (param0 <= 73) {
          this.field_H = (byte) 46;
          if ((this.field_s & a.field_d) == 0) {
            return false;
          }
          if ((this.field_l & 96) == 0) {
            return true;
          }
          return false;
        }
        if ((this.field_s & a.field_d) == 0) {
          return false;
        }
        if ((this.field_l & 96) == 0) {
          return true;
        }
        return false;
    }

    qe() {
        this.field_N = -1;
        this.field_P = -1;
        this.field_w = (byte) 0;
        this.field_t = false;
        this.field_M = -1;
        this.field_u = 0;
        this.field_Q = -1;
        this.field_q = 0;
        this.field_E = false;
        this.field_I = -1;
        this.field_n = -1;
        this.field_V = (short) -1;
        this.field_m = new ko();
        this.field_x = 0L;
        this.field_l = (byte) 0;
        this.field_R = null;
        this.field_s = uk.field_a;
    }

    qe(int param0, int param1) {
        this.field_N = -1;
        this.field_P = -1;
        this.field_w = (byte) 0;
        this.field_t = false;
        this.field_M = -1;
        this.field_u = 0;
        this.field_Q = -1;
        this.field_q = 0;
        this.field_E = false;
        this.field_I = -1;
        this.field_n = -1;
        this.field_V = (short) -1;
        this.field_m = new ko();
        this.field_x = 0L;
        this.field_l = (byte) 0;
        this.field_R = null;
        this.field_s = uk.field_a;
        this.field_L = param1;
        this.field_v = param0;
    }

    static {
        field_r = "mm:ss.ff";
        field_B = "Honour";
        field_G = "Lost";
        field_K = "Unable to delete friend - system busy";
        field_F = "<%0> is out of lives!";
        field_p = "Menu";
        field_O = "With Guides";
    }
}
