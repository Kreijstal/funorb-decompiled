/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class id implements uk, pj {
    int field_c;
    int field_h;
    int field_i;
    static oj field_g;
    bd field_a;
    private boolean field_b;
    int field_d;
    int field_j;
    int field_f;
    int field_o;
    static String field_l;
    int field_k;
    int field_m;
    private int field_e;
    int field_n;

    public final void a(rj param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vk var17 = null;
        vk var18 = null;
        var16 = stellarshard.field_B;
        try {
          if (param5 == param1) {
            return;
          }
          if (!param0.e(param3)) {
            return;
          }
          var17 = this.b(param0, (byte) 111);
          var18 = var17;
          if (param5 >= param1) {
            var9 = param5;
            var8 = param1;
          } else {
            var9 = param1;
            var8 = param5;
          }
          var10 = var18.a(111, var8);
          var11 = var18.a(62, var9);
          gg.a(23, param4 + (param0.field_w + param0.field_p), param2 + param0.field_k, param0.field_t + param0.field_k + param2, param0.field_w + param4);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var17.field_a[var12];
            if (var10 != var12) {
              stackIn_14_0 = var13.field_a[0];
            } else {
              stackIn_14_0 = var18.b(var8, param3 ^ 109);
            }
            var14 = stackIn_14_0;
            if (var12 == var11) {
              stackIn_19_0 = var18.b(var9, -128);
            } else {
              if (var13 == null) {
                stackIn_19_0 = 0;
              } else {
                stackIn_19_0 = var13.field_a[-1 + var13.field_a.length];
              }
            }
            var15 = stackIn_19_0;
            n.field_i.a(this.a(param0, var14, param4, false), this.field_o, this.field_o >>> 24, param0.field_n + (param2 + param0.field_k) + this.field_c + var13.field_b, var13.field_c, var15 - var14, (byte) 76);
          }
          id.b((byte) -58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("id.Q(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, boolean param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        uj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vk var13 = null;
        vk var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3.e(0)) {
            var13 = this.b(param3, (byte) 100);
            var14 = var13;
            var7 = var14.a(74, param0);
            var8 = var13.field_a[var7];
            var9 = var14.b(param0, -126);
            var10 = this.a(param3, var9, param4, false);
            var11 = this.a((byte) -64, param3, param2) + Math.max(0, var8.field_b);
            stackIn_4_0 = this.a((byte) -117, param3, param2);
            stackIn_4_1 = this.a((byte) -89, param3);
            stackIn_4_2 = var8.field_c;
            if (1 + var7 >= var14.field_a.length) {
              stackIn_5_3 = var8.field_c;
            } else {
              stackIn_5_3 = var13.field_a[1 + var7].field_b;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            gg.a(61, param4 - (-param3.field_w - param3.field_p), param3.field_k + param2, param2 - (-param3.field_k - param3.field_t), param3.field_w + param4);
            n.field_i.a(this.field_n, var11, 10066329, var10, var10, var12);
            id.b((byte) -58);
          }
          if (!param1) {
            return;
          }
          this.field_j = -62;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("id.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    public final int a(int param0, rj param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = this.a(param1, 0, param2, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = 44;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("id.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(rj param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 28361) {
            id.a(true);
          }
          this.b(param0, (byte) 125);
          stackIn_3_0 = param0.field_r.a(17201) + this.field_c + this.field_k;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("id.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(byte param0) {
        if (param0 == -73) {
          return this.field_a.field_N + this.field_a.field_r;
        }
        field_l = (String) null;
        return this.field_a.field_N + this.field_a.field_r;
    }

    final static boolean b(int param0) {
        pf.field_c = true;
        if (param0 == -4) {
          vc.field_a = 15000L + ih.a((byte) -98);
          return eg.field_d == 11 ? true : false;
        }
        field_l = (String) null;
        vc.field_a = 15000L + ih.a((byte) -98);
        return eg.field_d == 11 ? true : false;
    }

    public final int a(rj param0, byte param1) {
        RuntimeException var3 = null;
        rj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 25) {
            var4 = (rj) null;
            this.a(-8, -64, -12, -116, -119, -62, (rj) null, 87);
          }
          this.b(param0, (byte) 111);
          stackIn_3_0 = param0.field_r.a(false) - (-this.field_m - this.field_f);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("id.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, rj param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < -122) {
            stackIn_4_0 = param1.field_k + (param3 + this.field_c) + (param1.field_n + param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 14;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("id.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1392322465) {
          field_g = (oj) null;
          field_l = null;
          return;
        }
        field_l = null;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rj param6, int param7) {
        int discarded$0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rj var14 = null;
        int var12Lifetime1;
        var13 = stellarshard.field_B;
        try {
          boolean decompiledFrameRemainder0 = true;
          gg.a(83, param3 + (param6.field_w + param6.field_p), param2 + param6.field_k, param6.field_k + param2 + param6.field_t, param6.field_w + param3);
          var9_int = this.a(param0 - 27246, param6);
          var10 = this.a((byte) -89, param6);
          if (!this.field_b) {
            var12 = this.field_d;
            if (0 != var12) {
              if (var12 != 2) {
                if (3 != var12 &&
                  var12 == 1) {
                }
                var11 = (-this.field_a.field_r + var10 - this.field_a.field_N >> 1) + this.field_a.field_N;
              } else {
                var11 = var10 - this.field_a.field_r;
              }
            } else {
              var11 = this.field_a.field_N;
            }
            var12Lifetime1 = this.field_h;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_a.c(this.b(param6, 0), this.a(param6, param4, param3, false) + (var9_int >> 1), var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_a.b(this.b(param6, 0), this.a(param6, param4, param3, false) + var9_int, var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_a.a(this.b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
            }
          } else {
            this.field_a.a(this.b(param6, 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -126, param2), var9_int, var10, param7, param1, this.field_h, this.field_d, this.field_j);
          }
          id.b((byte) -58);
          if (param0 == 0) {
            return;
          }
          var14 = (rj) null;
          discarded$0 = this.a((byte) 2, (rj) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("id.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(')').toString());
        }
    }

    public void a(boolean param0, int param1, int param2, rj param3, int param4) {
        if (null == this.field_a) {
          return;
        }
        try {
          if (param4 != 4549) {
            this.field_c = 84;
          }
          this.a(param3, param1, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void b(byte param0, rj param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = stellarshard.field_B;
        try {
          if (param1.field_r == null) {
            param1.field_r = (vk) ((Object) new pd());
          }
          var3_int = this.a(-27246, param1);
          var4 = this.a((byte) -89, param1);
          if (param0 <= 77) {
            this.field_e = 29;
          }
          var6 = this.field_d;
          if (var6 != 0) {
            if (2 != var6) {
              if (var6 != 3 &&
                1 != var6) {
              }
              var5 = (var4 - this.field_a.field_N - this.field_a.field_r >> 1) + this.field_a.field_N;
            } else {
              var5 = -this.field_a.field_r + var4;
            }
          } else {
            var5 = this.field_a.field_N;
          }
          var6Lifetime1 = this.field_h;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_r instanceof pd)) {
                return;
              }
              ((pd) (param1.field_r)).a(true, this.b(param1, 0), var5, var3_int >> 1, this.field_a);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_r instanceof pd)) {
              return;
            }
            ((pd) (param1.field_r)).a(var3_int, this.field_a, var5, this.b(param1, 0), (byte) 22);
            return;
          }
          if (param1.field_r instanceof pd) {
            ((pd) (param1.field_r)).a(0, this.field_a, this.b(param1, 0), 0, var5);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("id.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = stellarshard.field_B;
          try {
            if (od.field_v != null) {
              od.field_v.a((byte) 112);
            }
            if (ib.field_k != null) {
              ib.field_k.a((byte) -103);
            }
            if (!param0) {
              id.a(true);
            }
            if (ma.field_s != null) {
              try {
                ma.field_s.a(-4506);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != df.field_d) {
              for (var1_int = 0; df.field_d.length > var1_int; var1_int++) {
                if (df.field_d[var1_int] != null) {
                  try {
                    df.field_d[var1_int].a(-4506);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ma.a((Throwable) ((Object) var1_ref), "id.CA(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(rj param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        rj var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            var6 = (rj) null;
            this.b((rj) null, 81);
          }
          stackIn_3_0 = param0.field_l + (param2 + param0.field_w + this.field_m) + param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("id.IA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final vk b(rj param0, byte param1) {
        RuntimeException var3 = null;
        vk stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_r) {
            param0.field_r = (vk) ((Object) new pd());
          }
          if (!this.field_b) {
            this.b((byte) 122, param0);
          } else {
            ((pd) (param0.field_r)).a(this.field_d, this.field_j, this.a(-27246, param0), this.field_h, this.field_a, this.a((byte) -89, param0), this.b(param0, 0), (byte) -100);
          }
          if (param1 <= 93) {
            this.field_b = true;
          }
          stackIn_8_0 = param0.field_r;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("id.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, rj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -27246) {
            this.field_i = 49;
          }
          stackIn_3_0 = -this.field_m + param1.field_p - this.field_f;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("id.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    String b(rj param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        rj var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (rj) null;
            discarded$1 = this.a((byte) -122, (rj) null);
          }
          stackIn_3_0 = param0.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("id.JA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    id(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(int param0, rj param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param1, (byte) 115);
          var7_int = 63 % ((-53 - param0) / 37);
          stackIn_1_0 = param1.field_r.a(param5 - this.a(0, param1, param2), (byte) -53, -this.a((byte) 118, param1, param4) + param3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("id.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(byte param0, rj param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -54 % ((param0 - 46) / 41);
          stackIn_1_0 = this.a(0, param1, (byte) -126, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("id.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(byte param0, rj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -89) {
            this.field_b = false;
          }
          stackIn_3_0 = -this.field_k + param1.field_t - this.field_c;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("id.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        ma var1_ref = null;
        Object var1 = null;
        ma var1_refLifetime1;
        if (param0 != -58) {
          id.b(46);
          var1_ref = (ma) (dd.field_g.c((byte) -111));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          ti.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_r);
          ti.d(var1_ref.field_t, var1_ref.field_u, var1_ref.field_n, var1_ref.field_l);
          var1_ref.field_p = null;
          mb.field_b.b(param0 - 61, var1_ref);
          return;
        }
        var1_refLifetime1 = (ma) (dd.field_g.c((byte) -111));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        ti.a(var1_refLifetime1.field_p, var1_refLifetime1.field_q, var1_refLifetime1.field_r);
        ti.d(var1_refLifetime1.field_t, var1_refLifetime1.field_u, var1_refLifetime1.field_n, var1_refLifetime1.field_l);
        var1_refLifetime1.field_p = null;
        mb.field_b.b(param0 - 61, var1_refLifetime1);
    }

    private final void a(rj param0, int param1, int param2, int param3) {
        try {
          this.a(param2, this.field_e, param3, param1, 0, 0, param0, this.field_i);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "id.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected id() {
    }

    final void a(id param0, byte param1) {
        try {
          param0.field_f = this.field_f;
          param0.field_d = this.field_d;
          param0.field_m = this.field_m;
          param0.field_o = this.field_o;
          param0.field_b = this.field_b;
          param0.field_c = this.field_c;
          param0.field_e = this.field_e;
          param0.field_j = this.field_j;
          param0.field_a = this.field_a;
          param0.field_n = this.field_n;
          if (param1 != -34) {
            this.field_d = -80;
          }
          param0.field_k = this.field_k;
          param0.field_i = this.field_i;
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "id.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    id(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_h = param7;
          this.field_c = param3;
          this.field_j = param9;
          this.field_o = param11;
          this.field_b = param12 ? true : false;
          this.field_m = param1;
          this.field_e = param6;
          this.field_f = param2;
          this.field_i = param5;
          this.field_a = param0;
          this.field_n = param10;
          this.field_k = param4;
          this.field_d = param8;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_g = new oj();
        field_l = "Mouse over an icon for details";
    }
}
