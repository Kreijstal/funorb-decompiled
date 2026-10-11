/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    boolean field_d;
    private go field_j;
    private go[] field_a;
    private int field_h;
    private int[] field_b;
    private int field_e;
    private int field_f;
    static nj field_i;
    private int field_k;
    private int field_c;
    static int field_g;

    final void a(lg param0, int param1) {
        try {
          param0.a(jm.field_B, this.field_e);
          if (param1 != -875079928) {
            lg var4 = (lg) null;
            this.a((lg) null, 64);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wg.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 > -30) {
          return true;
        }
        if (this.field_j == null) {
          return true;
        }
        if (this.field_j.field_a) {
          return false;
        }
        if (this.field_f < this.field_j.field_j) {
          return false;
        }
        return true;
    }

    final bn a(boolean param0, boolean param1, boolean param2, bn param3) {
        bn var5 = null;
        RuntimeException var5_ref = null;
        bn stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        boolean stackIn_2_2 = false;
        boolean stackIn_3_3;
        bn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (bn) (param3);
          stackIn_2_1 = param0;
          stackIn_2_2 = param2;
          stackIn_3_3 = !(param1);
          var5 = ((bn) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_3_3);
          var5.a(jm.field_B, this.field_e, (ei) null, -1, 0, 0, param1);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("wg.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int dupTemp$0 = 0;
        int var2;
        this.field_d = false;
        if (this.field_a == null) {
          if (null == this.field_j) {
            return true;
          }
          this.field_k = this.field_k - 1;
          if (this.field_k <= 0) {
            return this.a(false);
          }
          if (param0 == -660903963) {
            return false;
          }
          this.field_c = -76;
          return false;
        }
        if (this.field_h < 0) {
          if (null == this.field_j) {
            return true;
          }
          this.field_k = this.field_k - 1;
          if (this.field_k <= 0) {
            return this.a(false);
          }
          if (param0 == -660903963) {
            return false;
          }
          this.field_c = -76;
          return false;
        }
        dupTemp$0 = this.field_b[this.field_h];
        this.field_b[this.field_h] = dupTemp$0 - 1;
        if (dupTemp$0 >= 0) {
          if (null == this.field_j) {
            return true;
          }
          this.field_k = this.field_k - 1;
          if (this.field_k <= 0) {
            return this.a(false);
          }
          if (param0 == -660903963) {
            return false;
          }
          this.field_c = -76;
          return false;
        }
        var2 = this.field_h;
        this.a(this.field_a[this.field_h], (byte) 82);
        this.field_h = var2;
        this.field_a[this.field_h] = null;
        this.field_h = this.field_h + 1;
        if (this.field_a.length == this.field_h) {
          this.field_h = 0;
        }
        if (null == this.field_a[this.field_h]) {
          this.field_h = -1;
        }
        if (null == this.field_j) {
          return true;
        }
        this.field_k = this.field_k - 1;
        if (this.field_k <= 0) {
          return this.a(false);
        }
        if (param0 == -660903963) {
          return false;
        }
        this.field_c = -76;
        return false;
    }

    private final void b(int param0) {
        this.field_c = 0;
        this.field_e = 0;
        this.field_d = false;
        this.field_f = 0;
        this.field_k = param0;
    }

    final void a(go param0, byte param1) {
        if (param1 < 51) {
          return;
        }
        try {
          this.b(0);
          this.field_j = param0;
          this.field_e = this.field_j.field_c[this.field_c];
          this.field_k = this.field_j.field_e[this.field_c];
          this.field_h = -1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        this.field_d = true;
        this.field_c = this.field_c + 1;
        if (this.field_j.field_c.length > this.field_c) {
          this.field_e = this.field_j.field_c[this.field_c];
          this.field_k = this.field_j.field_e[this.field_c];
          return false;
        }
        this.field_f = this.field_f + 1;
        if (!this.field_j.field_a) {
          if (this.field_f >= this.field_j.field_j) {
            return true;
          }
          if (this.field_j.field_b < 0) {
            this.field_c = 0;
            this.field_e = this.field_j.field_c[this.field_c];
            this.field_k = this.field_j.field_e[this.field_c];
            return false;
          }
          if (this.field_j.field_c.length > this.field_j.field_b) {
            this.field_c = this.field_j.field_b;
            this.field_e = this.field_j.field_c[this.field_c];
            this.field_k = this.field_j.field_e[this.field_c];
            return false;
          }
          this.field_c = 0;
          this.field_e = this.field_j.field_c[this.field_c];
          this.field_k = this.field_j.field_e[this.field_c];
          return false;
        }
        if (this.field_j.field_b < 0) {
          this.field_c = 0;
          this.field_e = this.field_j.field_c[this.field_c];
          this.field_k = this.field_j.field_e[this.field_c];
          return false;
        }
        if (this.field_j.field_c.length > this.field_j.field_b) {
          this.field_c = this.field_j.field_b;
          this.field_e = this.field_j.field_c[this.field_c];
          this.field_k = this.field_j.field_e[this.field_c];
          return false;
        }
        this.field_c = 0;
        this.field_e = this.field_j.field_c[this.field_c];
        this.field_k = this.field_j.field_e[this.field_c];
        return false;
    }

    final static int a(int param0, int param1) {
        if ((long)param1 < 65536L) {
          if (256L > (long)param1) {
            if (param1 >= 0) {
              return de.field_d[param1] >> 12;
            }
            if (param0 >= 89) {
              return -1;
            }
            wg.d(66);
            return -1;
          }
          if ((long)param1 < 4096L) {
            if ((long)param1 >= 1024L) {
              return de.field_d[param1 >> 4] >> 10;
            }
            return de.field_d[param1 >> 2] >> 11;
          }
          if ((long)param1 < 16384L) {
            return de.field_d[param1 >> 6] >> 9;
          }
          return de.field_d[param1 >> 8] >> 8;
        }
        if (16777216L <= (long)param1) {
          if ((long)param1 < 268435456L) {
            if ((long)param1 >= 67108864L) {
              return de.field_d[param1 >> 20] >> 2;
            }
            return de.field_d[param1 >> 18] >> 3;
          }
          if ((long)param1 >= 1073741824L) {
            return de.field_d[param1 >> 24];
          }
          return de.field_d[param1 >> 22] >> 1;
        }
        if ((long)param1 < 1048576L) {
          if ((long)param1 < 262144L) {
            return de.field_d[param1 >> 10] >> 7;
          }
          return de.field_d[param1 >> 12] >> 6;
        }
        if ((long)param1 < 4194304L) {
          return de.field_d[param1 >> 14] >> 5;
        }
        return de.field_d[param1 >> 16] >> 4;
    }

    final void a(wg param0, byte param1) {
        try {
          this.field_f = param0.field_f;
          if (param1 <= 10) {
            this.field_h = -79;
          }
          this.field_e = param0.field_e;
          this.field_c = param0.field_c;
          this.field_d = param0.field_d;
          this.field_j = param0.field_j;
          this.field_k = param0.field_k;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var2 = (param1 * param1 >> 12) * param1 >> 12;
        if (param0 == 0) {
          var3 = -61440 + 6 * param1;
          var4 = (var3 * param1 >> 12) + 40960;
          return var2 * var4 >> 12;
        }
        return -28;
    }

    public wg() {
        this.field_d = false;
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != -900429434) {
          wg.b(-112, -107);
        }
    }

    static {
        field_i = new nj();
    }
}
