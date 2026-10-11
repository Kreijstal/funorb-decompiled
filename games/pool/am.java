/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class am implements fp, io {
    static String field_n;
    private int field_l;
    int field_d;
    int field_m;
    lr field_a;
    static int field_q;
    int field_g;
    static uf field_e;
    int field_f;
    int field_p;
    int field_j;
    private boolean field_o;
    int field_i;
    int field_k;
    int field_c;
    static int field_h;
    int field_b;

    final static String a(int param0, int param1) {
        if (param0 != 8) {
          field_h = -19;
        }
        return param1 != 0 ? param1 == 1 ? "animating" : 2 != param1 ? param1 != 3 ? "illegal state" : "finished with end choice" : "finished" : "waiting";
    }

    String c(int param0, ei param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = param1.field_m;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("am.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(int param0, ei param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        ei var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var4 = (ei) null;
            discarded$1 = this.a((ei) null, -35, -25, (byte) -43);
          }
          this.b(0, param1);
          stackIn_3_0 = param1.field_x.a((byte) 66) + this.field_f + this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 92 / ((28 - param0) / 59);
        field_n = null;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, ei param5) {
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
        vj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        op var17 = null;
        op var18 = null;
        var16 = Pool.field_O;
        try {
          if (param4 != 154888568) {
            am.a((byte) -85);
          }
          if (param0 == param1) {
            return;
          }
          if (param5.d(55)) {
            var17 = this.b(0, param5);
            var18 = var17;
            if (param1 >= param0) {
              var9 = param1;
              var8 = param0;
            } else {
              var9 = param0;
              var8 = param1;
            }
            var10 = var18.a(var8, param4 ^ 154888568);
            var11 = var18.a(var9, 0);
            wh.a(param2 + param5.field_C, param5.field_D + param3, param5.field_C + (param2 + param5.field_l), (byte) -118, param5.field_D + (param3 + param5.field_y));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_b[var12];
              if (var10 != var12) {
                stackIn_14_0 = var13.field_h[0];
              } else {
                stackIn_14_0 = var18.a(var8, (byte) -72);
              }
              var14 = stackIn_14_0;
              if (var11 != var12) {
                if (var13 != null) {
                  stackIn_19_0 = var13.field_h[-1 + var13.field_h.length];
                } else {
                  stackIn_19_0 = 0;
                }
              } else {
                stackIn_19_0 = var18.a(var9, (byte) -102);
              }
              var15 = stackIn_19_0;
              db.field_Sb.a(var15 - var14, this.field_c >>> 24, var13.field_i, var13.field_e + this.field_f + (param5.field_D + (param3 + param5.field_r)), this.field_c, (byte) 124, this.a(var14, (byte) 11, param2, param5));
            }
            oc.a(121);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("am.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final int a(byte param0, ei param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 26) {
            stackIn_4_0 = -this.field_g + (-this.field_i + param1.field_l);
            return stackIn_4_0;
          }
          stackIn_2_0 = 65;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("am.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, int param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 11) {
            field_h = 21;
          }
          stackIn_3_0 = param3.field_v + this.field_i + param2 + (param3.field_C + param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("am.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    am(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final op b(int param0, ei param1) {
        RuntimeException var3 = null;
        op stackIn_8_0 = null;
        op stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1.field_x) {
            param1.field_x = (op) ((Object) new ve());
          }
          if (!this.field_o) {
            this.a(param1, false);
          } else {
            ((ve) (param1.field_x)).a(this.field_m, this.c(-1, param1), this.field_a, this.b(param1, -3), this.field_b, this.a((byte) 26, param1), this.field_p, 0);
          }
          if (param0 == 0) {
            stackIn_10_0 = param1.field_x;
            return stackIn_10_0;
          }
          stackIn_8_0 = (op) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("am.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        int var6_int = 4 % ((param2 - 2) / 41);
        if (null == this.field_a) {
          return;
        }
        try {
          this.a((byte) -117, param4, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "am.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(ei param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(0, param0);
          if (param1 == -1848150943) {
            stackIn_4_0 = param0.field_x.a(-1) - (-this.field_i - this.field_g);
            return stackIn_4_0;
          }
          stackIn_2_0 = -29;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("am.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, int param1, int param2, ei param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 73) {
            this.field_o = false;
          }
          this.b(0, param3);
          stackIn_3_0 = param3.field_x.a(-this.a(param0, param3, (byte) -7) + param2, -this.a(5286, param3, param5) + param1, -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("am.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(ei param0, boolean param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ei var8 = null;
        int var6Lifetime1;
        var7 = Pool.field_O;
        try {
          if (param0.field_x == null) {
            param0.field_x = (op) ((Object) new ve());
          }
          var3_int = this.a((byte) 26, param0);
          var4 = this.b(param0, -3);
          var6 = this.field_p;
          if (var6 != 0) {
            if (2 == var6) {
              var5 = var4 - this.field_a.field_w;
            } else {
              if (3 != var6 &&
                1 == var6) {
              }
              var5 = this.field_a.field_C + (-this.field_a.field_w + (var4 - this.field_a.field_C) >> 1);
            }
          } else {
            var5 = this.field_a.field_C;
          }
          if (param1) {
            var8 = (ei) null;
            this.a(116, 45, -107, -47, -40, (ei) null);
          }
          var6Lifetime1 = this.field_m;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (!(param0.field_x instanceof ve)) {
                return;
              }
              ((ve) (param0.field_x)).a(this.field_a, var3_int >> 1, var5, this.c(-1, param0), false);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param0.field_x instanceof ve)) {
              return;
            }
            ((ve) (param0.field_x)).a(this.c(-1, param0), this.field_a, false, var5, var3_int);
            return;
          }
          if (param0.field_x instanceof ve) {
            ((ve) (param0.field_x)).a(var5, this.c(-1, param0), this.field_a, true, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("am.U(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, am param1) {
        param1.field_d = this.field_d;
        param1.field_m = this.field_m;
        param1.field_i = this.field_i;
        param1.field_g = this.field_g;
        param1.field_l = this.field_l;
        param1.field_c = this.field_c;
        param1.field_f = this.field_f;
        param1.field_o = this.field_o;
        param1.field_k = this.field_k;
        param1.field_p = this.field_p;
        param1.field_b = this.field_b;
        param1.field_j = this.field_j;
        if (param0 != -1177150015) {
          return;
        }
        try {
          param1.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "am.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        try {
          int var1_int = 0;
          int var3 = Pool.field_O;
          if (sq.field_c != null) {
            sq.field_c.c((byte) -80);
          }
          if (null != ri.field_U) {
            ri.field_U.a(-11307);
          }
          if (ih.field_a != null) {
            try {
              ih.field_a.b((byte) 86);
            } catch (IOException iOException) {
            }
          }
          if (null != ia.field_d) {
            for (var1_int = 0; ia.field_d.length > var1_int; var1_int++) {
              if (ia.field_d[var1_int] != null) {
                try {
                  ia.field_d[var1_int].b((byte) 86);
                } catch (IOException var2_ref) {
                }
              }
            }
          }
          if (param0 != 70) {
            am.a(-10, 42);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(int param0) {
        if (param0 != -10492) {
          return 54;
        }
        return this.field_a.field_C + this.field_a.field_w;
    }

    final static boolean a(byte param0, int[] param1, float[] param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 73) {
            return false;
          }
          param2[0] = 0.5f + 8.0f * param2[0];
          param2[1] = param2[1] * 8.0f + 0.5f;
          param2[2] = 0.5f + 8.0f * param2[2];
          if ((float)param1[9] * ((float)(-param1[0]) + param2[0]) + (float)param1[10] * ((float)(-param1[1]) + param2[1]) + (param2[2] - (float)param1[2]) * (float)param1[11] < 0.0f) {
            return false;
          }
          ag.a(param1, param2, 9);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("am.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int a(ei param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 68) {
            this.field_f = -82;
          }
          stackIn_3_0 = param2 + (param0.field_D + this.field_f) - (-param0.field_r - param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("am.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(int param0, ei param1, int param2) {
        RuntimeException var4 = null;
        ei var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5286) {
            var5 = (ei) null;
            this.a(51, (ei) null, 122);
          }
          stackIn_3_0 = this.a(0, (byte) 11, param2, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("am.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, ei param4) {
        int discarded$1 = 0;
        int var7 = 0;
        vj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ei var13 = null;
        op var14 = null;
        op var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4.d(66)) {
            var14 = this.b(param0 - 1, param4);
            var15 = var14;
            var7 = var15.a(param2, 0);
            var8 = var14.field_b[var7];
            var9 = var15.a(param2, (byte) -94);
            var10 = this.a(var9, (byte) 11, param3, param4);
            var11 = this.a(param1, param4, (byte) -7) + Math.max(0, var8.field_e);
            stackIn_3_0 = this.a(param1, param4, (byte) -7);
            stackIn_3_1 = this.b(param4, -3);
            stackIn_3_2 = var8.field_i;
            if (1 + var7 >= var15.field_b.length) {
              stackIn_4_3 = var8.field_i;
            } else {
              stackIn_4_3 = var14.field_b[var7 + 1].field_e;
            }
            var12 = stackIn_3_0 + Math.min(stackIn_3_1, Math.min(stackIn_3_2, stackIn_4_3));
            wh.a(param4.field_C + param3, param4.field_D + param1, param4.field_C + param3 + param4.field_l, (byte) -125, param4.field_y + param4.field_D + param1);
            db.field_Sb.a(-1, var10, var12, this.field_k, var10, var11);
            oc.a(param0 + 114);
          }
          if (param0 != 1) {
            var13 = (ei) null;
            discarded$1 = this.a((ei) null, 37, -42, (byte) -76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("am.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int a(int param0, ei param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -7) {
            this.field_g = -17;
          }
          stackIn_3_0 = this.a(param1, 0, param0, (byte) 98);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("am.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 < 114) {
          field_h = 49;
        }
        v.b((byte) -60);
    }

    private final int b(ei param0, int param1) {
        RuntimeException var3 = null;
        ei var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3) {
            var4 = (ei) null;
            this.a((byte) -37, (ei) null, 11, -127);
          }
          stackIn_3_0 = param0.field_y - this.field_f - this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, ei param2, int param3, int param4, int param5, int param6, byte param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Pool.field_O;
        try {
          wh.a(param2.field_C + param6, param5 + param2.field_D, param2.field_l + param2.field_C + param6, (byte) 85, param2.field_D + param5 + param2.field_y);
          var9_int = this.a((byte) 26, param2);
          var10 = this.b(param2, param7 + 19);
          if (param7 != -22) {
            this.field_l = 62;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o) {
            var12 = this.field_p;
            if (0 == var12) {
              var11 = this.field_a.field_C;
            } else {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = (var10 - this.field_a.field_C - this.field_a.field_w >> 1) + this.field_a.field_C;
              } else {
                var11 = -this.field_a.field_w + var10;
              }
            }
            var12Lifetime1 = this.field_m;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_a.b(this.c(-1, param2), this.a(param3, (byte) 11, param6, param2) + (var9_int >> 1), this.a(param2, param0, param5, (byte) 125) + var11, param1, param4);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_a.c(this.c(-1, param2), this.a(param3, (byte) 11, param6, param2) + var9_int, this.a(param2, param0, param5, (byte) 106) + var11, param1, param4);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_a.d(this.c(param7 ^ 21, param2), this.a(param3, (byte) 11, param6, param2), var11 + this.a(param2, param0, param5, (byte) 92), param1, param4);
            }
          } else {
            this.field_a.a(this.c(param7 ^ 21, param2), this.a(param3, (byte) 11, param6, param2), this.a(param2, param0, param5, (byte) 70), var9_int, var10, param1, param4, this.field_m, this.field_p, this.field_b);
          }
          oc.a(114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("am.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(byte param0, ei param1, int param2, int param3) {
        try {
          int var5_int = -52 / ((param0 + 10) / 61);
          this.a(0, this.field_d, param1, 0, this.field_l, param3, param2, (byte) -22);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "am.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected am() {
    }

    am(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_l = param6;
          this.field_p = param8;
          this.field_c = param11;
          this.field_f = param3;
          this.field_o = param12 ? true : false;
          this.field_a = param0;
          this.field_k = param10;
          this.field_i = param1;
          this.field_b = param9;
          this.field_g = param2;
          this.field_d = param5;
          this.field_j = param4;
          this.field_m = param7;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
