/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_a;
    private ma field_f;
    static String field_i;
    static String field_d;
    private ma[] field_g;
    static String field_l;
    static di field_k;
    private ma field_j;
    static int field_h;
    private int field_m;
    static vh field_e;
    private int field_b;
    static int[] field_c;

    final void a(byte param0, ma param1, long param2) {
        ma var5 = null;
        try {
          if (param1.field_k != null) {
            param1.a((byte) -117);
          }
          if (param0 >= -112) {
            bm.a(-17, 57L);
          }
          var5 = this.field_g[(int)(param2 & (long)(this.field_b - 1))];
          param1.field_d = var5;
          param1.field_k = var5.field_k;
          param1.field_k.field_d = param1;
          param1.field_d.field_k = param1;
          param1.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "bm.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 30) {
          field_h = 17;
        }
        field_d = null;
        field_c = null;
        field_i = null;
        field_l = null;
        field_k = null;
        field_e = null;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 524288) {
            field_c = (int[]) null;
          }
          var2_int = nj.b(hq.field_i, ta.field_f, -21223);
          if (1 == var2_int) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_8_0 = (String) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("bm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var2;
        var2 = Pool.field_O;
        if (param0) {
          return;
        }
        if ((1 << ba.field_ub.field_db & ba.field_ub.field_I.field_x) != 0) {
          nk.field_f[10] = dj.field_h;
        } else {
          if (ba.field_ub.field_I.field_x == 0) {
            nk.field_f[10] = eq.field_O;
          } else {
            nk.field_f[10] = ff.field_g;
          }
        }
    }

    final ma a(boolean param0, long param1) {
        ma var5 = null;
        int var6 = Pool.field_O;
        ma var4 = this.field_g[(int)(param1 & (long)(this.field_b - 1))];
        if (param0) {
          return (ma) null;
        }
        this.field_j = var4.field_d;
        while (this.field_j != var4) {
          if (this.field_j.field_c == param1) {
            var5 = this.field_j;
            this.field_j = this.field_j.field_d;
            return var5;
          }
          this.field_j = this.field_j.field_d;
        }
        this.field_j = null;
        return null;
    }

    final ma a(int param0) {
        this.field_m = param0;
        return this.b(-1);
    }

    final ma b(int param0) {
        int fieldTemp$0 = 0;
        ma var2;
        int var3;
        var3 = Pool.field_O;
        if (0 < this.field_m &&
          this.field_g[this.field_m - 1] != this.field_f) {
          var2 = this.field_f;
          this.field_f = var2.field_d;
          return var2;
        }
        do {
          if (this.field_b <= this.field_m) {
            if (param0 != -1) {
              return (ma) null;
            }
            return null;
          }
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          var2 = this.field_g[fieldTemp$0].field_d;
        } while (this.field_g[-1 + this.field_m] == var2);
        this.field_f = var2.field_d;
        return var2;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          var2_int = param0.charAt(0);
          var3 = 1;
          if (param1 > -103) {
            field_i = (String) null;
          }
          while (true) {
            if (var3 >= param0.length()) {
              return true;
            }
            if (var2_int == param0.charAt(var3)) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("bm.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static long a(int param0, long param1) {
        int var3;
        String var4;
        int var3Lifetime1;
        if (0L == param1) {
          return 0L;
        }
        if (param0 > -94) {
          var4 = (String) null;
          bm.a(47, (String) null);
        }
        if (0L > param1) {
          throw new IllegalArgumentException("");
        }
        if (param1 < 32768L) {
          if (128L > param1) {
            if (param1 >= 8L) {
              if (param1 < 32L) {
                var3 = 6;
              } else {
                var3 = 5;
              }
            } else {
              if (param1 < 2L) {
                return 256L;
              }
              var3 = 7;
            }
          } else {
            if (param1 < 2048L) {
              var3 = (512L <= param1) ? 3 : 4;
            } else {
              var3 = (param1 >= 8192L) ? 1 : 2;
            }
          }
          param1 = param1 << (var3 << 1);
          return (long)(ac.field_o[(int)(param1 - 32768L)] >> var3);
        }
        if (131072L > param1) {
          return (long)ac.field_o[(int)(-32768L + param1)];
        }
        if (param1 < 549755813888L) {
          if (param1 < 134217728L) {
            if (param1 >= 2097152L) {
              if (param1 >= 33554432L) {
                var3Lifetime1 = 5;
              } else {
                var3Lifetime1 = (param1 < 8388608L) ? 3 : 4;
              }
            } else {
              var3Lifetime1 = (param1 < 524288L) ? 1 : 2;
            }
          } else {
            if (8589934592L > param1) {
              if (param1 < 2147483648L) {
                var3Lifetime1 = (param1 < 536870912L) ? 6 : 7;
              } else {
                var3Lifetime1 = 8;
              }
            } else {
              if (param1 < 137438953472L) {
                var3Lifetime1 = (param1 >= 34359738368L) ? 10 : 9;
              } else {
                var3Lifetime1 = 11;
              }
            }
          }
        } else {
          if (param1 < 2251799813685248L) {
            if (param1 < 35184372088832L) {
              if (param1 < 8796093022208L) {
                var3Lifetime1 = (param1 >= 2199023255552L) ? 13 : 12;
              } else {
                var3Lifetime1 = 14;
              }
            } else {
              if (param1 < 562949953421312L) {
                var3Lifetime1 = (param1 < 140737488355328L) ? 15 : 16;
              } else {
                var3Lifetime1 = 17;
              }
            }
          } else {
            if (param1 >= 144115188075855872L) {
              if (param1 < 2305843009213693952L) {
                var3Lifetime1 = (param1 < 576460752303423488L) ? 21 : 22;
              } else {
                var3Lifetime1 = 23;
              }
            } else {
              if (param1 >= 36028797018963968L) {
                var3Lifetime1 = 20;
              } else {
                var3Lifetime1 = (9007199254740992L <= param1) ? 19 : 18;
              }
            }
          }
        }
        param1 = param1 >> (var3Lifetime1 << 1);
        return (long)ac.field_o[(int)(-32768L + param1)] << var3Lifetime1;
    }

    bm(int param0) {
        int var2 = 0;
        ma dupTemp$0 = null;
        ma var3 = null;
        this.field_m = 0;
        this.field_b = param0;
        this.field_g = new ma[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new ma();
          var3 = dupTemp$0;
          this.field_g[var2] = dupTemp$0;
          var3.field_k = var3;
          var3.field_d = var3;
        }
    }

    static {
        field_a = "Passwords can only contain letters and numbers";
        field_i = "End Game";
        field_d = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_l = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
