/*
 * Decompiled by CFR-JS 0.4.0.
 */
class i extends jb {
    String field_v;
    static ut[] field_E;
    private int field_C;
    private int field_s;
    static vc[] field_A;
    static String field_w;
    static int field_x;
    int field_y;
    String field_u;
    static double field_B;
    lv field_t;
    static long field_z;
    ut field_D;

    void a(int param0, boolean param1) {
        if (param0 != 3) {
          i.f(-13);
        }
    }

    final static void f(int param0) {
        boolean[] array$0 = null;
        int var11 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        boolean[] stackIn_26_0 = null;
        boolean[] stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        boolean stackIn_27_3 = false;
        int stackIn_29_2 = 0;
        boolean stackIn_30_3 = false;
        int stackIn_32_2 = 0;
        boolean stackIn_33_3 = false;
        int stackIn_35_2 = 0;
        boolean stackIn_36_3 = false;
        ut[][][] stackIn_38_0 = null;
        int stackIn_39_1 = 0;
        ut[] stackIn_43_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_49_0 = 0;
        ut[][] stackIn_51_0 = null;
        int stackIn_52_1 = 0;
        ut[] stackIn_54_0 = null;
        int stackIn_55_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        nl var3 = null;
        int var4 = 0;
        boolean[] var5 = null;
        ut var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        ut[][] var10 = null;
        int var12 = 0;
        ut var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean[] var17 = null;
        ut var18 = null;
        int var4Lifetime1;
        var16 = Kickabout.field_G;
        try {
          if (null == ae.field_C) {
            return;
          }
          if (param0 != 70) {
            return;
          }
          if (1 != ks.field_e) {
            stackIn_12_0 = (ks.field_e == 3) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var1_int = stackIn_12_0;
          if (ks.field_e != 2) {
            stackIn_18_0 = (ks.field_e == 3) ? 1 : 0;
          } else {
            stackIn_18_0 = 1;
          }
          var2 = stackIn_18_0;
          if (var1_int == 0 &&
            var2 == 0) {
            return;
          }
          var3 = et.field_d.a((byte) -90, 0);
          if (var1_int != 0) {
            var4 = var3.field_G;
            array$0 = new boolean[4];
            stackIn_26_0 = array$0;
            stackIn_26_1 = array$0;
            stackIn_26_2 = 0;
            stackIn_27_3 = ((var4 & 2) != 0);
            stackIn_26_1[stackIn_26_2] = stackIn_27_3;
            stackIn_29_2 = 1;
            stackIn_30_3 = ((var4 & 8) != 0);
            stackIn_26_0[stackIn_29_2] = stackIn_30_3;
            stackIn_32_2 = 2;
            stackIn_33_3 = ((var4 & 4) != 0);
            stackIn_26_0[stackIn_32_2] = stackIn_33_3;
            stackIn_35_2 = 3;
            stackIn_36_3 = ((var4 & 1) != 0);
            stackIn_26_0[stackIn_35_2] = stackIn_36_3;
            var17 = stackIn_26_0;
            var5 = var17;
            var6 = var3.f(-113);
            var7 = -22 + var3.a(true);
            var8_ref_int__ = new int[]{var6 - 60, var6 + 60, var6, var6};
            var9_ref_int__ = new int[]{var7, var7, -60 + var7, 60 + var7};
            stackIn_38_0 = ae.field_C;
            if (!cl.field_d) {
              stackIn_39_1 = 1;
            } else {
              stackIn_39_1 = 0;
            }
            var10 = stackIn_38_0[stackIn_39_1];
            for (var11 = 0; var11 < 4; var11++) {
              var12 = var17[var11] ? 1 : 0;
              stackIn_43_0 = var10[var11];
              if (var12 == 0) {
                stackIn_44_1 = 0;
              } else {
                stackIn_44_1 = 1;
              }
              var13 = stackIn_43_0[stackIn_44_1];
              var14 = hw.field_i * var13.field_o >> 8;
              var15 = var13.field_v * hw.field_i >> 8;
              var13.b(ug.a(param0 ^ 70, var8_ref_int__[var11]) - (var14 >> 1), lf.a((byte) -90, var9_ref_int__[var11]) - (var15 >> 1), var14, var15);
            }
          }
          if (var2 != 0) {
            stackIn_49_0 = (4 != var3.field_u) ? 0 : 1;
            var4Lifetime1 = stackIn_49_0;
            stackIn_51_0 = kd.field_y;
            if (!cl.field_d) {
              stackIn_52_1 = 1;
            } else {
              stackIn_52_1 = 0;
            }
            stackIn_54_0 = stackIn_51_0[stackIn_52_1];
            if (var4Lifetime1 == 0) {
              stackIn_55_1 = 0;
            } else {
              stackIn_55_1 = 1;
            }
            var18 = stackIn_54_0[stackIn_55_1];
            var5_ref = var18;
            if (var1_int != 0) {
              var6 = var3.f(-101);
              var7 = 70 + var3.a(true);
            } else {
              var6 = var3.f(-124);
              var7 = var3.a(true) + 30;
            }
            var8 = hw.field_i * var18.field_o >> 8;
            var9 = hw.field_i * var18.field_v >> 8;
            var5_ref.b(ug.a(0, var6) - (var8 >> 1), -(var9 >> 1) + lf.a((byte) -77, var7), var8, var9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "i.R(" + param0 + ')');
        }
    }

    final int a(boolean param0) {
        if (this.field_y == 1) {
          return 46;
        }
        if (this.field_y == 12) {
          return 46;
        }
        if (this.field_y == 13) {
          return 46;
        }
        if (this.field_y == 14) {
          return 46;
        }
        if (this.field_y == 15) {
          return 46;
        }
        if (this.field_y == 16) {
          return 46;
        }
        if (17 == this.field_y) {
          return 46;
        }
        if (this.field_y == 8) {
          return 46;
        }
        if (this.field_y == 9) {
          return 46;
        }
        if (this.field_y == 10) {
          return 46;
        }
        if (this.field_y == 11) {
          return 46;
        }
        if (this.field_y == 18) {
          return 46;
        }
        if (param0) {
          this.field_C = 17;
        }
        if (19 == this.field_y) {
          return 46;
        }
        if (this.field_y == 20) {
          return 46;
        }
        if (this.field_y == 21) {
          return 46;
        }
        if (this.field_y == 23) {
          return 46;
        }
        if (this.field_y == 24) {
          return 46;
        }
        if (27 == this.field_y) {
          return 46;
        }
        if (this.field_y == 29) {
          return 46;
        }
        if (this.field_y == 30) {
          return 46;
        }
        if (this.field_y == 34) {
          return 46;
        }
        if (this.field_y == 37) {
          return 46;
        }
        if (this.field_y == 32) {
          return 46;
        }
        return 53;
    }

    int b(int param0) {
        int var2 = 290;
        if (null != this.field_t) {
          var2 = var2 + (15 + this.field_t.b(0));
        }
        if (param0 == -1379118556) {
          if (this.field_D != null) {
            var2 = var2 + (15 + this.field_D.field_o);
          }
          return var2;
        }
        return 53;
    }

    public static void f(byte param0) {
        field_w = null;
        field_E = null;
        field_A = null;
        int var1 = -14 % ((param0 - 19) / 57);
    }

    int a(byte param0) {
        if (param0 < 75) {
          return -109;
        }
        return 80 + (20 + (this.field_C + 30));
    }

    i(int param0) {
        this(param0, (lv) null);
    }

    void a(byte param0, int param1, int param2) {
        int var4 = 10 + param1;
        int var5 = 45 + param2;
        int var6 = -20 + this.b(-1379118556);
        int var7 = -20 + this.a((byte) 80) - 80;
        on.a(var4, var5, var6, var7, 10, 65793, 140);
        un.field_d.a(this.field_u, 5 + var4, var5 - 12, 16777215, -1);
        int var8 = 25 + param2 + 35;
        if (27 == this.field_y) {
          var8 -= 15;
        }
        if (param0 >= -11) {
          return;
        }
        pb.field_C.a(this.field_v, -15 + this.b(-1379118556) + (param1 + (-10 - this.field_s)), var8, this.field_s, this.field_C, 16777215, -1, 0, 1, 16);
        if (this.field_t != null) {
          this.field_t.a((var7 >> 1) + var5, 23, (this.field_t.b(0) >> 1) + (var4 + 15));
          return;
        }
        if (null != this.field_D) {
          this.field_D.c(15 + var4, var5 + (var7 - this.field_D.field_v >> 1));
          return;
        }
    }

    final void a(String param0, lv param1, ut param2, int param3, String param4) {
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.field_D = param2;
          this.field_t = param1;
          this.field_u = param4.toUpperCase();
          this.field_v = param0;
          this.field_s = -50 + this.b(-1379118556);
          if (param3 >= -70) {
            this.a((byte) 40);
          }
          if (this.field_t != null) {
            this.field_s = this.field_s - (15 + this.field_t.b(0));
          } else {
            if (null != this.field_D) {
              this.field_s = this.field_s - (this.field_D.field_o + 15);
            }
          }
          this.field_C = pb.field_C.c(this.field_v, this.field_s, 16);
          stackIn_9_1 = this.field_C;
          if (this.field_D != null) {
            stackIn_10_2 = this.field_D.field_v;
          } else {
            stackIn_10_2 = 0;
          }
          this.field_C = Math.max(stackIn_9_1, stackIn_10_2);
          stackIn_12_1 = this.field_C;
          if (this.field_t != null) {
            stackIn_13_2 = this.field_t.a(15);
          } else {
            stackIn_13_2 = 0;
          }
          this.field_C = Math.max(stackIn_12_1, stackIn_13_2);
          if (this.field_t == null &&
            this.field_D == null) {
            this.field_C = this.field_C + 20;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("i.P(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    i(int param0, lv param1) {
        this(param0, param1, pb.field_G[param0], gd.field_e[param0]);
    }

    void a(int param0, int param1) {
        ii.a((byte) -125);
        if (param0 >= 60) {
          if (this.field_y == 40) {
            wf.b(10, true);
          }
          return;
        }
        this.b(62);
        if (this.field_y == 40) {
          wf.b(10, true);
        }
    }

    i(int param0, lv param1, String param2, String param3) {
        try {
          this.field_y = param0;
          this.a(param3, param1, da.b(2, this.field_y), -125, param2);
          this.a(ds.a(this.field_y, 1), pg.a(false, this.field_y), 1054928844);
          if (this.field_y == 8) {
            this.a(wo.field_j, (byte) 90);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "i.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "<%0> scores a goal, closing the gap to <%1> with a score of <%2> to <%3>.";
        field_A = new vc[9];
        field_B = 0.0;
    }
}
