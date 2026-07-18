/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    private int field_m;
    static cf[] field_v;
    private int field_d;
    private int field_s;
    static String field_h;
    private int field_q;
    private int field_j;
    int field_k;
    private cn field_a;
    private int field_p;
    static String field_w;
    private cn field_u;
    static hd field_x;
    private cn field_g;
    private cn field_c;
    int field_b;
    private int field_l;
    static int field_f;
    private int field_o;
    static String field_t;
    private cn field_r;
    private int field_n;
    private int field_i;
    int field_y;
    static String field_e;

    final void a(cn param0, int param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        cn var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((sa) this).field_i = ((sa) this).field_l;
              ((sa) this).field_n = ((sa) this).field_p;
              var6_int = 14 % ((58 - param3) / 52);
              ((sa) this).field_a = ((sa) this).field_r;
              ((sa) this).field_c = ((sa) this).field_u;
              ((sa) this).field_p = param1;
              ((sa) this).field_l = param4;
              if (!param2) {
                ((sa) this).field_s = 32;
                break L1;
              } else {
                ((sa) this).field_q = param4;
                ((sa) this).field_g = param0;
                ((sa) this).field_d = param1;
                break L1;
              }
            }
            ((sa) this).field_u = param0;
            ((sa) this).field_r = new cn(((sa) this).field_u.field_y - -4, 4 + ((sa) this).field_u.field_v);
            jh.a(((sa) this).field_r);
            ((sa) this).field_u.e(2, 2, 12690143);
            gf.d(2, 2, 0, 0, ((sa) this).field_r.field_y, ((sa) this).field_r.field_v);
            jh.b();
            var7 = ((sa) this).field_r;
            ((sa) this).field_r.field_A = -2;
            var7.field_w = -2;
            ((sa) this).field_o = 384;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("sa.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b() {
        field_x = null;
        field_h = null;
        field_e = null;
        field_t = null;
        field_v = null;
        field_w = null;
    }

    private final void a() {
        ((sa) this).a(((sa) this).field_g, ((sa) this).field_d, true, -89, ((sa) this).field_q);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DungeonAssault.field_K;
          var2 = (-((sa) this).field_u.field_y + ((sa) this).field_b >> 1) + ((sa) this).field_m;
          var3 = ((sa) this).field_j - -((sa) this).field_l;
          if (0 == ((sa) this).field_o) {
            int discarded$1 = -66;
            this.a(var2, var3, ((sa) this).field_u);
            break L0;
          } else {
            if (((sa) this).field_o <= 256) {
              if (((sa) this).field_o <= 128) {
                this.a(var3, (byte) -28, var2, ((sa) this).field_o << 1, ((sa) this).field_r);
                this.a(var3, (byte) 105, var2, 128 + -((sa) this).field_o << 1, ((sa) this).field_u);
                break L0;
              } else {
                L1: {
                  if (((sa) this).field_c != null) {
                    var4 = ((sa) this).field_m + (((sa) this).field_b + -((sa) this).field_c.field_y >> 1);
                    var5 = ((sa) this).field_i + ((sa) this).field_j;
                    this.a(var5, (byte) 62, var4, ((sa) this).field_o + -128 << 1, ((sa) this).field_a);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.a(var3, (byte) 107, var2, -((sa) this).field_o + 256 << 1, ((sa) this).field_r);
                break L0;
              }
            } else {
              if (null != ((sa) this).field_c) {
                var4 = ((sa) this).field_m - -(((sa) this).field_b + -((sa) this).field_c.field_y >> 1);
                var5 = ((sa) this).field_i + ((sa) this).field_j;
                this.a(var5, (byte) 80, var4, -256 + ((sa) this).field_o << 1, ((sa) this).field_c);
                this.a(var5, (byte) -35, var4, -((sa) this).field_o + 384 << 1, ((sa) this).field_a);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 < -20) {
            break L2;
          } else {
            field_h = null;
            break L2;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, cn param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
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
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            var17 = new int[4];
            var15 = var17;
            var13 = var15;
            var11 = var13;
            var10 = var11;
            var18 = var10;
            gf.a(var17);
            var7 = 1;
            L1: while (true) {
              if (var7 >= ((sa) this).field_k) {
                var8 = -112 / ((param1 - 27) / 32);
                gf.e(((sa) this).field_m, ((sa) this).field_k + ((sa) this).field_j, ((sa) this).field_m + ((sa) this).field_b, ((sa) this).field_j + ((sa) this).field_y - ((sa) this).field_k);
                param4.b(param2, param0, param3);
                gf.b(var18);
                break L0;
              } else {
                var8 = var7 * param3 / ((sa) this).field_k;
                gf.e(((sa) this).field_m, var7 + ((sa) this).field_j, ((sa) this).field_m + ((sa) this).field_b, 1 + (((sa) this).field_j - -var7));
                param4.b(param2, param0, var8);
                gf.e(((sa) this).field_m, ((sa) this).field_y + (((sa) this).field_j + -1) - var7, ((sa) this).field_b + ((sa) this).field_m, -var7 + (((sa) this).field_j + ((sa) this).field_y));
                param4.b(param2, param0, var8);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("sa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, int param1, cn param2) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
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
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var16 = new int[4];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var9 = var10;
            var17 = var9;
            gf.a(var16);
            var6 = 1;
            L1: while (true) {
              if (((sa) this).field_k <= var6) {
                var6 = 73;
                gf.e(((sa) this).field_m, ((sa) this).field_j - -((sa) this).field_k, ((sa) this).field_b + ((sa) this).field_m, ((sa) this).field_j + (((sa) this).field_y - ((sa) this).field_k));
                param2.h(param0, param1);
                gf.b(var17);
                break L0;
              } else {
                var7 = (var6 << 8) / ((sa) this).field_k;
                gf.e(((sa) this).field_m, ((sa) this).field_j + var6, ((sa) this).field_m - -((sa) this).field_b, var6 + (((sa) this).field_j - -1));
                param2.d(param0, param1, var7);
                gf.e(((sa) this).field_m, -var6 + (-1 + (((sa) this).field_y + ((sa) this).field_j)), ((sa) this).field_b + ((sa) this).field_m, ((sa) this).field_y + ((sa) this).field_j + -var6);
                param2.d(param0, param1, var7);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sa.A(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -66 + ')');
        }
    }

    final void a(int param0, boolean param1, cn param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((sa) this).a(param2, 0, param1, 118, ((sa) this).field_y + -param2.field_v >> 1);
              if (param0 == 1929) {
                break L1;
              } else {
                ((sa) this).a(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sa.H(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(boolean param0, String param1, byte param2, String param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        String[] var12 = null;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        Object var16 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var15 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              jh.c();
              var6_int = -40 + ((sa) this).field_b;
              var7 = jn.a(param3, new int[1], -121, (se) (Object) la.field_b);
              var8 = var7.length;
              var9 = la.field_b.field_E + var8 * la.field_b.field_H;
              if (param1 == null) {
                break L1;
              } else {
                var9 = var9 + 2 * la.field_b.field_H;
                break L1;
              }
            }
            L2: {
              var10 = la.field_b.field_H;
              var11 = new cn(var6_int, var9);
              var11.e();
              if (param1 != null) {
                db.field_v.c(param1, var6_int >> 1, var10, param4, -1);
                var10 = var10 + 2 * la.field_b.field_H;
                break L2;
              } else {
                break L2;
              }
            }
            var12 = var7;
            var13 = 0;
            L3: while (true) {
              if (var13 >= var12.length) {
                L4: {
                  jh.b();
                  ((sa) this).a(1929, param0, var11);
                  if (param2 == 91) {
                    break L4;
                  } else {
                    var16 = null;
                    sa.a((byte) -10, -54, -25, -114, (int[]) null);
                    break L4;
                  }
                }
                break L0;
              } else {
                var14 = var12[var13];
                la.field_b.c(var14, var6_int >> 1, var10, param4, -1);
                var10 = var10 + la.field_b.field_H;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("sa.I(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        L0: {
          ((sa) this).field_o = ((sa) this).field_o - 12;
          if (((sa) this).field_o < 0) {
            ((sa) this).field_o = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((mo.field_a & 3) == 0) {
            L2: {
              if (((sa) this).field_o == 0) {
                int fieldTemp$173 = ((sa) this).field_p - 1;
                ((sa) this).field_p = ((sa) this).field_p - 1;
                if (fieldTemp$173 >= 0) {
                  ((sa) this).field_l = ((sa) this).field_l - 1;
                  if (-17 != ((sa) this).field_p) {
                    break L2;
                  } else {
                    int discarded$174 = 384;
                    this.a();
                    break L2;
                  }
                } else {
                  if (((sa) this).field_g == ((sa) this).field_u) {
                    break L2;
                  } else {
                    int fieldTemp$175 = ((sa) this).field_s - 1;
                    ((sa) this).field_s = ((sa) this).field_s - 1;
                    if (-1 <= fieldTemp$175) {
                      int discarded$176 = 384;
                      this.a();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            int fieldTemp$177 = ((sa) this).field_n - 1;
            ((sa) this).field_n = ((sa) this).field_n - 1;
            if (fieldTemp$177 >= 0) {
              ((sa) this).field_i = ((sa) this).field_i - 1;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            ((sa) this).a(true);
            break L3;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
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
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: while (true) {
              param1--;
              if (param1 < 0) {
                L2: {
                  if (param0 == 45) {
                    break L2;
                  } else {
                    var9 = null;
                    sa.a((byte) 65, 42, 56, 44, (int[]) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var10 = param4;
                var5 = var10;
                var6 = param2;
                var7 = param3;
                var10[var6] = var7 + (nb.a(var10[var6], 16711422) >> 1);
                param2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("sa.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    sa(int param0, int param1, int param2, int param3) {
        ((sa) this).field_k = 16;
        ((sa) this).field_b = param2;
        ((sa) this).field_y = param3;
        ((sa) this).field_j = param1;
        ((sa) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Updates will sent to the email address you've given";
        field_w = "Loading graphics";
        field_e = "REVIVE";
    }
}
