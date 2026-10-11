/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static int[] field_l;
    private int field_u;
    private int field_p;
    static bm field_q;
    private int field_o;
    private int field_k;
    private float field_r;
    static String field_v;
    private int field_i;
    private int field_m;
    private int field_s;
    private int field_e;
    private int field_g;
    static int field_t;
    private int field_c;
    private ni field_j;
    private int field_d;
    private int field_w;
    private int field_f;
    private boolean field_h;
    private int field_n;
    static int[] field_a;
    private int field_b;

    final void a(int param0) {
        int var2 = 91 % ((5 - param0) / 40);
        this.field_j.a(9887, this.field_e, this.field_m);
    }

    final boolean c(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 7468) {
          return false;
        }
        stackIn_6_0 = (this.field_c <= qb.field_g) && (me.field_o > 0);
        return stackIn_6_0;
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Terraphoenix.field_V;
        var2 = this.field_w;
        var3 = this.field_s;
        if (!this.c(7468)) {
          this.field_h = false;
          return;
        }
        if (this.field_b >= var3) {
          if (this.field_n > var3) {
            var3 = this.field_n;
          }
        } else {
          var3 = this.field_b;
        }
        if (this.field_k < var2) {
          var2 = this.field_k;
        } else {
          if (var2 < this.field_o) {
            var2 = this.field_o;
          }
        }
        if (this.field_r > 0.0f) {
          var4 = (int)(0.5f + (float)var3 * this.field_r);
          if (var2 >= var4) {
            if (var2 > var4) {
              var2 = var4;
            }
          } else {
            var3 = (int)((float)var2 / this.field_r);
          }
        }
        if (param0 < 75) {
          this.b((byte) -11);
        }
        if (var2 != ja.field_j ||
          var3 != wc.field_p) {
          this.field_j.a(9887, var3, var2);
        }
        if (this.field_w > 0) {
          ng.field_v = (this.field_w - ja.field_j) / 2;
        }
    }

    final static oa a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oa stackIn_3_0 = null;
        oa stackIn_7_0 = null;
        oa stackIn_16_0 = null;
        oa stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Terraphoenix.field_V;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = b.field_f;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_7_0 = lg.field_j;
            return stackIn_7_0;
          }
          var4 = 15 % ((44 - param0) / 54);
          for (var3 = 0; var3 < var2_int; var3++) {
            var5 = param1.charAt(var3);
            if (var5 == 45) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_16_0 = ge.field_a;
                return stackIn_16_0;
              }
            } else {
              if (ge.field_f.indexOf(var5) == -1) {
                stackIn_19_0 = ge.field_a;
                return stackIn_19_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("pj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 <= 109) {
          return;
        }
        field_v = null;
        field_l = null;
        field_q = null;
        field_a = null;
    }

    final ck b(int param0) {
        this.field_m = ja.field_j;
        this.field_e = wc.field_p;
        this.field_j.a(9887, this.field_p, this.field_u);
        ai.field_h = false;
        ck var2 = jb.a(this.field_p, this.field_u, param0, 0, (byte) 109, nj.field_l);
        if (var2 == null) {
          this.a(param0 + 97);
        }
        return var2;
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        if (a.field_b != null) {
          return;
        }
        if (me.field_o <= 0) {
          this.field_h = false;
        }
        if (this.field_h) {
          fieldTemp$0 = this.field_i - 1;
          this.field_i = this.field_i - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          if (param0 != 92) {
            this.a((byte) 40);
          }
          this.field_i = this.field_f;
          if (qb.field_g >= this.field_c) {
            this.b((byte) 78);
          } else {
            this.field_h = false;
          }
          return;
        }
        if (this.field_w > ja.field_j) {
          ng.field_v = (this.field_w - ja.field_j) / 2;
        } else {
          if (this.field_w > 0) {
            ng.field_v = 0;
          }
        }
        if (ja.field_j != this.field_g ||
          this.field_d != wc.field_p) {
          this.field_j.a(param0 + 9795, this.field_d, this.field_g);
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3, int param4) {
        if (param0 < 36) {
          pj.d(-99);
        }
        int var5 = 256 - param2;
        int var6 = l.field_i[param4];
        int var7 = ((16711680 & param3) >> 16) * param2 + var5 * (var6 >> 16 & 255) >> 8;
        int var8 = (255 & param3 >> 8) * param2 + var5 * ((65280 & var6) >> 8) >> 8;
        int var9 = param2 * (param3 & 255) + var5 * (var6 & 255) >> 8;
        l.field_i[param4] = var9 + 65536 * var7 + var8 * 256;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_s = param2;
        if (param0 <= 48) {
          this.b((byte) -79);
        }
        this.field_w = param1;
    }

    private pj() throws Throwable {
        throw new Error();
    }

    static {
        field_v = "RECRUIT";
        field_a = new int[8192];
    }
}
