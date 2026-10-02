/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends qc {
    static String field_r;
    static int field_n;
    private ne field_p;
    private int field_s;
    static gk field_l;
    static String field_q;
    static Sprite resultBubbleSprite;
    static boolean[] connectivityVisitedByEntityId;
    static int field_m;

    final void c(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        try {
          var5_int = 31 % ((param0 + 36) / 37);
          for (var6 = 0; var6 < param3; var6++) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            param2[var6 + param1] = (byte)(this.field_j[fieldTemp$0] - this.field_p.b(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var5);
          stackIn_7_1 = new StringBuilder().append("pk.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = param2 >>> 31;
        if (param1 != -6) {
            pk.k((byte) 101);
        }
        return -var3 + (param2 + var3) / param0;
    }

    final static void k(byte param0) {
        da.field_a = 0;
        if (param0 != -13) {
            pk.a(106, (byte) 22, 96);
        }
    }

    final void a(int[] param0, boolean param1) {
        try {
            this.field_p = new ne(param0);
            if (param1) {
                this.i(-68);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "pk.JB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void k(int param0) {
        this.field_s = param0 * this.field_f;
    }

    pk(byte[] param0) {
        super(param0);
    }

    final static void h(int param0, int param1) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        PcmSample var3 = null;
        int var4 = 0;
        try {
          var2_int = 0;
          if (param0 >= -117) {
            return;
          }
          {
            L0: while (33 > var2_int) {
              if (param1 != ck.field_c[var2_int]) {
                var2_int++;
                continue L0;
              }
              if (!vg.field_j[var2_int]) {
                L3: {
                  if (10 <= var2_int) {
                    if (26 >= var2_int) {
                      var3 = te.field_c.c(-1879044097, w.field_b[var2_int]);
                      break L3;
                    }
                  }
                  var3 = te.field_c.b(1, w.field_b[var2_int]);
                }
                fl.field_c[var2_int] = var3.a(p.field_i);
                vg.field_j[var2_int] = true;
              }
              var2_int++;
            }
            var4 = 0;
            var2_int = var4;
            L1: while (var4 < 33) {
              if (!vg.field_j[var4]) {
                return;
              }
              var4++;
            }
            p.field_i = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "pk.IB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void j(int param0) {
        connectivityVisitedByEntityId = null;
        resultBubbleSprite = null;
        if (param0 != 0) {
            field_r = (String) null;
        }
        field_r = null;
        field_q = null;
        field_l = null;
    }

    final int e(byte param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Geoblox.field_C;
        int var3 = this.field_s >> 3;
        if (param0 != -17) {
            return -69;
        }
        int var4 = 8 - (7 & this.field_s);
        int var5 = 0;
        this.field_s = this.field_s + param1;
        while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_j[incrementValue$0] & kj.field_G[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var5 = var5 + (this.field_j[var3] & kj.field_G[var4]);
        } else {
            var5 = var5 + (this.field_j[var3] >> var4 - param1 & kj.field_G[param1]);
        }
        return var5;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 + this.field_p.b(0));
        if (param1 >= -12) {
            pk.h(-6, -80);
        }
    }

    final void i(int param0) {
        this.field_f = (7 + this.field_s) / 8;
        if (param0 != -16989) {
            this.field_p = (ne) null;
        }
    }

    final int j(byte param0) {
        if (param0 != 122) {
            this.k(-51);
        }
        int fieldTemp$0 = this.field_f;
        this.field_f = this.field_f + 1;
        return 255 & this.field_j[fieldTemp$0] - this.field_p.b(0);
    }

    pk(int param0) {
        super(param0);
    }

    static {
        field_r = "   ";
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = 15;
        connectivityVisitedByEntityId = new boolean[1000];
    }
}
