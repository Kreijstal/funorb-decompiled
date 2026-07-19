/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    private le field_g;
    static String[] field_h;
    private le[] field_d;
    static String field_b;
    static String[] field_a;
    private int field_k;
    private le field_j;
    static int field_f;
    private int field_i;
    static int field_c;
    static String field_e;

    final static boolean a(boolean param0) {
        int[] discarded$0 = null;
        if (param0) {
            discarded$0 = dl.a(-127, -88, 106);
            return ic.field_U;
        }
        return ic.field_U;
    }

    public static void a(int param0) {
        int[] discarded$2 = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -974314864) {
          discarded$2 = dl.a(-16, -82, 52);
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final void a(int param0, long param1, le param2) {
        le var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2.field_d != null) {
                param2.b(-27598);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = this.field_d[(int)((long)(-1 + this.field_i) & param1)];
            param2.field_d = var5.field_d;
            param2.field_b = var5;
            param2.field_d.field_b = param2;
            param2.field_f = param1;
            param2.field_b.field_d = param2;
            if (param0 <= -95) {
              break L0;
            } else {
              field_c = -96;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("dl.G(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final le b(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        le var4 = null;
        le var8 = null;
        le var11 = null;
        var3 = ZombieDawn.field_J;
        if (0 < this.field_k) {
          if (this.field_d[this.field_k + -1] == this.field_j) {
            L0: while (true) {
              if (this.field_k < this.field_i) {
                fieldTemp$2 = this.field_k;
                this.field_k = this.field_k + 1;
                var8 = this.field_d[fieldTemp$2].field_b;
                if (this.field_d[this.field_k + -1] == var8) {
                  continue L0;
                } else {
                  this.field_j = var8.field_b;
                  return var8;
                }
              } else {
                var2 = -85 % ((param0 - 65) / 34);
                return null;
              }
            }
          } else {
            var11 = this.field_j;
            this.field_j = var11.field_b;
            return var11;
          }
        } else {
          L1: while (true) {
            if (this.field_k < this.field_i) {
              fieldTemp$3 = this.field_k;
              this.field_k = this.field_k + 1;
              var4 = this.field_d[fieldTemp$3].field_b;
              if (this.field_d[this.field_k + -1] == var4) {
                continue L1;
              } else {
                this.field_j = var4.field_b;
                return var4;
              }
            } else {
              var2 = -85 % ((param0 - 65) / 34);
              return null;
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = rd.a(true, param2);
        var4 = fb.a(1311979239, param2);
        if (param0 != 0) {
          return (int[]) null;
        } else {
          var5 = rd.a(true, param1);
          var6 = fb.a(1311979239, param1);
          var7 = (int)((long)var5 * (long)var3 >> -974314864);
          var8 = (int)((long)var3 * (long)var6 >> -292699824);
          var9 = (int)((long)var4 * (long)var5 >> 1947186064);
          var10 = (int)((long)var4 * (long)var6 >> -962322544);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final le a(long param0, int param1) {
        le var4 = null;
        le var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var4 = this.field_d[(int)((long)(this.field_i - 1) & param0)];
        if (param1 >= 41) {
          this.field_g = var4.field_b;
          L0: while (true) {
            if (var4 != this.field_g) {
              if ((param0 ^ -1L) != (this.field_g.field_f ^ -1L)) {
                this.field_g = this.field_g.field_b;
                continue L0;
              } else {
                var5 = this.field_g;
                this.field_g = this.field_g.field_b;
                return var5;
              }
            } else {
              this.field_g = null;
              return null;
            }
          }
        } else {
          return (le) null;
        }
    }

    final le a(byte param0) {
        if (param0 != -113) {
          this.field_i = 55;
          this.field_k = 0;
          return this.b((byte) -56);
        } else {
          this.field_k = 0;
          return this.b((byte) -56);
        }
    }

    dl(int param0) {
        le dupTemp$2 = null;
        int var2 = 0;
        le var3 = null;
        this.field_k = 0;
        this.field_i = param0;
        this.field_d = new le[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new le();
            var3 = dupTemp$2;
            this.field_d[var2] = dupTemp$2;
            var3.field_b = var3;
            var3.field_d = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_c = 66;
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
