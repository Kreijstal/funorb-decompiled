/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private ja field_d;
    static uf[] field_l;
    static String field_m;
    private int field_j;
    static boolean field_k;
    private long[] field_n;
    int[] field_b;
    static String field_f;
    int[] field_h;
    private boolean field_i;
    static uh field_e;
    int field_c;
    private ei field_o;
    static int field_g;
    int[] field_a;

    final ec a(int param0, int param1, ec param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ja stackIn_6_1 = null;
        ja stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_d ||
            !this.field_i) {
            if (2 != this.field_j) {
              stackIn_6_1 = ja.a(this.field_n, param2, param1);
            } else {
              stackIn_6_1 = ja.a(param2, param1);
            }
            this.field_d = stackIn_6_1;
            this.field_i = true;
          }
          var4_int = 26 % ((param0 - 75) / 41);
          stackIn_8_0 = this.field_d;
          return (ec) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ti.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(lm param0, int param1) {
        ud var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Torquing.field_u;
        try {
          var3 = (ud) (this.field_o.b(param1 ^ param1));
          while (var3 != null) {
            if (param0.a(var3.field_m)) {
              var3.f(0);
              if (var3.field_o != null) {
                je.a((byte) -43, var3.field_o);
              }
              if (null != this.field_n) {
                je.a((byte) -43, this.field_n);
                this.field_n = null;
              }
              this.field_j = -1;
              this.b((byte) 62);
            }
            var3 = (ud) (this.field_o.f(-24059));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ti.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final ec a(int param0, int param1) {
        if (null == this.field_d) {
          this.field_d = ja.a(this.field_n, param0);
          this.field_i = false;
        } else {
          if (this.field_i) {
            this.field_d = ja.a(this.field_n, param0);
            this.field_i = false;
          }
        }
        if (param1 < -41) {
          return (ec) ((Object) this.field_d);
        }
        this.a(126, -79);
        return (ec) ((Object) this.field_d);
    }

    final ti c(byte param0) {
        int var4 = Torquing.field_u;
        ti var2 = new ti(this.field_b, this.field_h, this.field_a, this.field_c);
        ud var3 = (ud) (this.field_o.b(0));
        while (var3 != null) {
          var2.field_o.a((byte) 54, var3.a(true, var2));
          var3 = (ud) (this.field_o.f(-24059));
        }
        if (param0 >= 54) {
          if (null != this.field_n) {
            var2.field_n = ee.b(-114);
            dk.a(this.field_n, 0, var2.field_n, 0, this.field_n.length);
          }
          var2.field_j = this.field_j;
          return var2;
        }
        this.c((byte) -48);
        if (null != this.field_n) {
          var2.field_n = ee.b(-114);
          dk.a(this.field_n, 0, var2.field_n, 0, this.field_n.length);
        }
        var2.field_j = this.field_j;
        return var2;
    }

    private final void c(int param0) {
        Object var2;
        ud var2_ref;
        int var4;
        int var3;
        var2 = null;
        var4 = Torquing.field_u;
        if (null == this.field_n) {
          this.field_j = -1;
          var2_ref = (ud) (this.field_o.b(0));
          while (var2_ref != null) {
            L1: {
              if (var2_ref.field_o == null) {
                var2_ref.a(param0 - 4682);
                if (var2_ref.field_p) {
                  je.a((byte) -43, var2_ref.field_o);
                  var2_ref.f(param0 ^ 4803);
                  break L1;
                }
              }
              if (this.field_n != null) {
                for (var3 = 0; var3 < 64; var3++) {
                  this.field_n[var3] = ee.a(this.field_n[var3], var2_ref.field_o[var3]);
                }
              } else {
                this.field_n = ee.b(-123);
                dk.a(var2_ref.field_o, 0, this.field_n, 0, 64);
              }
            }
            var2_ref = (ud) (this.field_o.f(-24059));
          }
        } else {
          je.a((byte) -43, this.field_n);
          this.field_n = null;
          this.field_j = -1;
          var2_ref = (ud) (this.field_o.b(0));
          while (var2_ref != null) {
            boolean decompiledFrameRemainder0 = true;
            if (var2_ref.field_o == null) {
              var2_ref.a(param0 - 4682);
              if (var2_ref.field_p) {
                je.a((byte) -43, var2_ref.field_o);
                var2_ref.f(param0 ^ 4803);
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              if (this.field_n != null) {
                for (var3 = 0; var3 < 64; var3++) {
                  this.field_n[var3] = ee.a(this.field_n[var3], var2_ref.field_o[var3]);
                }
              } else {
                this.field_n = ee.b(-123);
                dk.a(var2_ref.field_o, 0, this.field_n, 0, 64);
              }
            }
            var2_ref = (ud) (this.field_o.f(-24059));
          }
        }
        if (param0 == 4803) {
          return;
        }
        this.a(-93, 64);
    }

    final static void a(la param0, int param1) {
        ho var2 = null;
        try {
          ho.a(param0.a(-125, "", "headers.packvorbis"));
          if (param1 != 28922) {
            ti.a(true);
          }
          var2 = ho.a(param0, "jagex logo2.packvorbis", "");
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ti.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 1) {
          return;
        }
        re.field_e = kj.field_d.h((byte) 113);
        CharSequence var2 = (CharSequence) ((Object) re.field_e);
        tj.field_j = hf.a(var2, 112);
    }

    final void a(boolean param0, lm param1) {
        int var4 = Torquing.field_u;
        if (this.field_j == 2 &&
          this.field_o.a(false) == 1 &&
          ((ud) (this.field_o.b(0))).field_m == null) {
          return;
        }
        ud var3 = (ud) (this.field_o.b(0));
        while (var3 != null) {
          if (param1.a(var3.field_m)) {
            return;
          }
          var3 = (ud) (this.field_o.f(-24059));
        }
        this.field_o.a((byte) 54, new ud(this, param1));
        if (null != this.field_n) {
          je.a((byte) -43, this.field_n);
          this.field_n = null;
        }
        if (!param0) {
          return;
        }
        try {
          this.b((byte) 62);
          this.field_j = -1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ti.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 == 62) {
          if (this.field_d != null) {
            this.field_d.b();
          }
          this.field_d = null;
          return;
        }
        field_k = false;
        if (this.field_d != null) {
          this.field_d.b();
        }
        this.field_d = null;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_l = null;
        field_e = null;
        if (param0) {
          return;
        }
        field_m = null;
    }

    final boolean a(int param0) {
        long[] var2;
        Object var3;
        ud var3_ref;
        int var4;
        long[] var5;
        var3 = null;
        var4 = Torquing.field_u;
        if (param0 != -3) {
          this.b((byte) -91);
        }
        if (1 >= this.field_o.a(false)) {
          return false;
        }
        var5 = ((ud) (this.field_o.b(0))).field_o;
        var2 = var5;
        dk.a(this.field_n, 0, var5, 0, 64);
        var3_ref = (ud) (this.field_o.b(0));
        while (var3_ref != null) {
          if (null != var3_ref.field_o &&
            var3_ref.field_o != var5) {
            je.a((byte) -43, var3_ref.field_o);
          }
          var3_ref = (ud) (this.field_o.f(-24059));
        }
        this.field_o.a(0);
        this.field_o.a((byte) 54, new ud(var5));
        return true;
    }

    ti(int[] param0, int[] param1, int[] param2, int param3) {
        this.field_j = -1;
        try {
          this.field_b = param0;
          this.field_h = param1;
          this.field_a = param2;
          this.field_c = param3;
          this.field_o = new ei();
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(byte param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = Torquing.field_u;
        if (this.field_j != -1) {
          return this.field_j;
        }
        if (null == this.field_n) {
          this.c(4803);
        }
        if (this.field_o.a(false) == 0) {
          this.field_j = 0;
          return this.field_j;
        }
        var2 = 6;
        while (true) {
          if (57 < var2) {
            this.field_j = 2;
            if (param0 > 82) {
              return this.field_j;
            }
            this.a((byte) 76);
            return this.field_j;
          }
          var5 = this.field_c;
          if (var5 == 0) {
            var3 = 144115188075855872L - (1L << -1 + var2);
          } else {
            if (var5 != 1) {
              if (var5 != 2) {
                if (var5 == 3) {
                  var3 = -32L + (1L << var2);
                } else {
                  var3 = 0L;
                }
              } else {
                var3 = (1L << var2 - 6 + 1) - 1L << 63 - var2;
              }
            } else {
              var3 = -32L + (1L << -var2 + 63);
            }
          }
          if ((this.field_n[var2] & var3) == var3) {
            var2++;
            continue;
          }
          break;
        }
        this.field_j = 1;
        return this.field_j;
    }

    static {
        field_m = "Create a free account to start using this feature";
        field_f = "Create a free account to store your progress.";
        field_k = false;
    }
}
