/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends kg {
    static bf field_u;
    private int field_p;
    static String field_v;
    private fc field_q;
    static String field_s;
    static be field_r;
    static String field_t;

    final void i(int param0) {
        this.field_p = this.field_n * param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          for (var5_int = param1; param2 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            param0[var5_int + param3] = (byte)(this.field_m[fieldTemp$0] - this.field_q.c(km.a(param1, 256)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hb.NA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    hb(byte[] param0) {
        super(param0);
    }

    final void b(boolean param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$0] = (byte)(this.field_q.c(256) + param1);
        if (!param0) {
          this.j(-107);
        }
    }

    final void a(int[] param0, int param1) {
        try {
          int var3_int = -124 % ((17 - param1) / 51);
          this.field_q = new fc(param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "hb.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 122) {
            return;
          }
          hm.field_qb = hm.field_qb + 1;
          if (-1 == c.field_t &&
            -1 == ah.field_Q) {
            c.field_t = ld.field_l;
            ah.field_Q = jh.field_R;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(vf.field_o));
          } else {
            decompiledFrameRemainder0 = (vf.field_o == null);
          }
          if (decompiledFrameRemainder0) {
            if (!sa.field_R) {
              if (kc.field_t <= hm.field_qb) {
                stackIn_18_0 = (kc.field_t + hm.field_nb > hm.field_qb) ? 1 : 0;
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
            var2_int = stackIn_18_0;
            if (param1 == null) {
              hm.field_qb = 0;
            } else {
              if (sa.field_R) {
                hm.field_qb = kc.field_t;
              } else {
                if (var2_int == 0) {
                  hm.field_qb = 0;
                } else {
                  hm.field_qb = kc.field_t;
                }
              }
            }
            if (param1 != null) {
              sa.field_R = false;
            } else {
              if (var2_int != 0) {
                sa.field_R = true;
              }
            }
            nm.field_I = c.field_t;
            he.field_f = ah.field_Q;
          }
          vf.field_o = param1;
          if (!sa.field_R &&
            hm.field_qb < kc.field_t &&
            hn.field_D) {
            hm.field_qb = 0;
            he.field_f = ah.field_Q;
            nm.field_I = c.field_t;
          }
          if (sa.field_R &&
            hm.field_qb == qa.field_f) {
            hm.field_qb = 0;
            sa.field_R = false;
          }
          c.field_t = -1;
          ah.field_Q = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("hb.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var3 = this.field_p >> 3;
        int var4 = 8 - (7 & this.field_p);
        this.field_p = this.field_p + param0;
        int var5 = param1;
        while (var4 < param0) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((hn.field_C[var4] & this.field_m[incrementValue$0]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 != var4) {
          var5 = var5 + (this.field_m[var3] >> var4 - param0 & hn.field_C[param0]);
        } else {
          var5 = var5 + (hn.field_C[var4] & this.field_m[var3]);
        }
        return var5;
    }

    hb(int param0) {
        super(param0);
    }

    final int h(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == -1) {
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
          return this.field_m[fieldTemp$0] - this.field_q.c(param0 ^ -257) & 255;
        }
        field_r = (be) null;
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_m[fieldTemp$1] - this.field_q.c(param0 ^ -257) & 255;
    }

    final void j(int param0) {
        int var2 = 126 % ((77 - param0) / 38);
        this.field_n = (this.field_p + 7) / 8;
    }

    public static void g(int param0) {
        field_r = null;
        field_s = null;
        field_t = null;
        if (param0 == -1) {
          field_u = null;
          field_v = null;
          return;
        }
        hb.g(10);
        field_u = null;
        field_v = null;
    }

    static {
        field_s = "Score";
        field_t = "Confirm Password: ";
    }
}
