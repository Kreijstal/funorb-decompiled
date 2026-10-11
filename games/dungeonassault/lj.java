/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements cl {
    static String field_e;
    private int field_s;
    private int field_t;
    static cn field_o;
    static int field_u;
    private pj field_h;
    static String field_p;
    private int[][] field_w;
    private wm field_k;
    private cn field_f;
    private int field_q;
    static volatile boolean field_g;
    static String field_j;
    static int field_m;
    private wm field_i;
    private int field_l;
    private cn field_c;
    private rh[][] field_v;
    private cn field_b;
    static int field_r;
    private int[] field_a;
    private int[] field_n;
    private cn field_d;

    public final void a(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_c = (cn) null;
          }
          if (this.field_t > 0) {
            var2_int = (this.field_t << 8) / 80;
            var3 = this.field_h.field_B;
            var4 = var3 / 7;
            var5 = var3 % 7;
            var6 = -224 - (-((var5 + var4) * 32) - this.field_q);
            var7 = -24 + (24 * (var4 - var5) + (168 + this.field_l));
            this.field_b.b(var6, var7, var2_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "lj.C(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.setFocusTraversalKeysEnabled(false);
          var2_int = -126 % ((21 - param1) / 40);
          param0.addKeyListener(in.field_C);
          param0.addFocusListener(in.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("lj.N(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, ph param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 2) {
            return;
          }
          this.a(param4.field_a, -32, param3, param2, param0);
          param4.d(param2, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("lj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void c(int param0) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        rh[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        rh var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int var7 = 0;
        rh[] var8 = null;
        int var9 = 0;
        rh var10 = null;
        int var11 = 0;
        var11 = DungeonAssault.field_K;
        try {
          var2_int = 0;
          if (param0 != -30876) {
            discarded$0 = this.a(false, 55);
          }
          while (true) {
            stackIn_5_0 = var2_int;
            stackIn_5_1 = 49;
            if (stackIn_5_0 < stackIn_5_1) {
              stackOut_6_0 = this.field_h.field_p.a(var2_int, (byte) 122);
              stackIn_28_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var11 == 0) {
                if (stackIn_7_0) {
                  this.field_n[var2_int] = this.field_n[var2_int] + 4;
                }
                if (this.field_n[var2_int] > 256) {
                  this.field_n[var2_int] = 256;
                  if ((3 & mo.field_a) == 0 &&
                    null != this.field_v[var2_int]) {
                    var3 = this.field_v[var2_int];
                    var4 = 0;
                    while (var3.length > var4) {
                      var5 = var3[var4];
                      var5.field_a = var5.field_a - 1;
                      stackIn_5_0 = -236;
                      stackIn_5_1 = ~var5.field_a;
                      if (stackIn_5_0 < stackIn_5_1) {
                        var5.field_a = 235;
                      }
                      var4++;
                    }
                  }
                }
                var2_int++;
                continue;
              }
            } else {
              stackIn_28_0 = ~this.field_s;
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted1 = true;
            if (stackIn_28_0 != 0 &&
              this.field_s + 160 > mo.field_a) {
              var2_int = mo.field_a - this.field_s;
              if (16 <= var2_int) {
                if (var2_int >= 72) {
                  stackIn_39_0 = -(2 * var2_int) + 400;
                } else {
                  stackIn_39_0 = 256;
                }
              } else {
                stackIn_39_0 = var2_int * 16;
              }
              var3_int = stackIn_39_0;
              var4 = je.field_d.length;
              var5_array = new int[var4];
              var6 = new int[var4];
              var7 = 0;
              do {
                if (var7 >= var4) {
                  var7 = 0;
                  break;
                }
                var5_array[var7] = hj.a((byte) 113, 12582912, var3_int, je.field_d[var7]);
                var6[var7] = hj.a((byte) 127, 65793, var3_int, rg.field_P[var7]);
                var7++;
              } while (var11 == 0);
              while (true) {
                stackIn_47_0 = -50;
                stackIn_47_1 = ~var7;
                if (stackIn_47_0 < stackIn_47_1) {
                  if (var11 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (null != this.field_v[var7]) {
                    var8 = this.field_v[var7];
                    var9 = 0;
                    while (var9 < var8.length) {
                      var10 = var8[var9];
                      var10.field_e = var5_array[this.field_a[var7]];
                      var10.field_h = var6[this.field_a[var7]];
                      stackIn_47_0 = ~var2_int;
                      stackIn_47_1 = -121;
                      if (stackIn_47_0 > stackIn_47_1) {
                        var10.field_a = 256;
                      }
                      var9++;
                    }
                  }
                  var7++;
                  continue;
                }
                break;
              }
              if (decompiledFrameCompleted1) {
                decompiledFrameRemainder0 = (var11 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              var2_int = 0;
              while (49 > var2_int) {
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (this.field_v[var2_int] != null ||
                  var11 != 0) {
                  var3 = this.field_v[var2_int];
                  var4 = 0;
                  while (var4 < var3.length) {
                    var5 = var3[var4];
                    var5.field_e = je.field_d[this.field_a[var2_int]];
                    var5.field_h = rg.field_P[this.field_a[var2_int]];
                    var4++;
                  }
                }
                var2_int++;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (this.field_t <= 0)) {
              return;
            }
            this.field_t = this.field_t - 1;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "lj.E(" + param0 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (0 < param2 ||
            param0) {
            if (param2 % 30 >= 15) {
              ec.a(this.field_l, this.field_q - 224, (byte) -72, this.field_f, 16711680, 256);
              if (DungeonAssault.field_K != 0) {
                this.field_f.b(-224 + this.field_q, this.field_l, 256);
              }
            } else {
              this.field_f.b(-224 + this.field_q, this.field_l, 256);
            }
          }
          if (param1 != -1723) {
            this.field_l = -37;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "lj.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          if (param1 % 7 != 0 &&
            this.field_i.a(-(param1 / 7) + (param1 - 1), (byte) 87)) {
            var3_int = var3_int | 1;
          }
          if (param1 % 7 != 6 &&
            this.field_i.a(-(param1 / 7) + param1, (byte) 123)) {
            var3_int = var3_int | 2;
          }
          if (param0) {
            this.b(-31);
          }
          if (param1 > 6 &&
            this.field_i.a(param1 + 35, (byte) 122)) {
            var3_int = var3_int | 4;
          }
          if (param1 < 42 &&
            this.field_i.a(param1 + 42, (byte) 118)) {
            var3_int = var3_int | 8;
          }
          stackIn_28_0 = var3_int;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lj.U(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        if (param0 < 53) {
          return;
        }
        try {
          field_o = null;
          field_e = null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lj.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        cn var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          var7 = fm.b(param1 - 29348, param3);
          if (null == var7) {
            return;
          }
          if (param2 != param1) {
            var8 = var7.field_E * param2 >> 8;
            var9 = param2 * var7.field_G >> 8;
            if (param4 == 256) {
              var7.c(-(var8 >> 1) + param0, param5 - var9, var8, var9);
            }
            if (param4 != 256 ||
              var10 != 0) {
              var7.d(param0 - (var8 >> 1), -var9 + param5, var8, var9, param4);
            }
            if (var10 == 0) {
              return;
            }
          }
          if (param4 != 256) {
            var7.d(-(var7.field_E >> 1) + param0, param5 - var7.field_G, param4);
            if (var10 == 0) {
              return;
            }
          }
          var7.h(param0 - (var7.field_E >> 1), -var7.field_G + param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var7_ref), "lj.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = -95 % ((43 - param2) / 50);
          var6_int = this.field_h.field_h[param1].field_a;
          if (!this.field_h.field_p.a(param1, (byte) 106) &&
            param1 != 24) {
            var6_int = 0;
          }
          i.field_r[var6_int].e(param4, param0 + 1, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "lj.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(int param0) {
        int stackIn_6_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_69_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        boolean stackOut_39_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        try {
          jh.c();
          if (null == this.field_c) {
            this.field_c = new cn(448, 356);
            this.field_f = new cn(480, 388);
            this.field_f.field_w = -16;
            this.field_f.field_A = -16;
          }
          this.field_c.e();
          gf.a();
          var2_int = 0;
          while (true) {
            stackIn_6_0 = -8;
            if (stackIn_6_0 < ~var2_int) {
              var3 = 32 * (6 - var2_int);
              var4 = var2_int * 24;
              var5 = -var2_int + 6;
              stackIn_33_0 = 0;
              if (var8 == 0) {
                var6 = stackIn_33_0;
                while (var6 < (1 + var2_int)) {
                  var7 = 16777215;
                  stackOut_10_0 = this.field_h.field_m.a(var5, (byte) 92);
                  stackIn_6_0 = stackOut_10_0 ? 1 : 0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!stackIn_11_0 ||
                    this.field_h.field_j.a(var5, (byte) 86)) {
                    var7 = 0;
                  }
                  if (0 != var5 &&
                    6 != var5) {
                    ri.field_d[5].e(var3, var4, var7);
                  }
                  if (6 != var5 &&
                    var5 != 48) {
                    ri.field_d[4].e(32 + var3, var4, var7);
                  }
                  this.b(var4, var5, -75, var7, var3);
                  var5 += 8;
                  var6++;
                  var3 += 64;
                }
                var2_int++;
                continue;
              }
            } else {
              stackIn_33_0 = 7;
            }
            var2_int = stackIn_33_0;
            while (true) {
              stackIn_35_0 = 13;
              if (stackIn_35_0 > var2_int) {
                var3Lifetime1 = 32 * (-6 + var2_int);
                var4Lifetime1 = var2_int * 24;
                var5Lifetime1 = var2_int * 7 - 42;
                stackIn_69_0 = 0;
                if (var8 == 0) {
                  var6Lifetime1 = stackIn_69_0;
                  while (var6Lifetime1 < 13 - var2_int) {
                    var7Lifetime1 = 16777215;
                    stackOut_39_0 = this.field_h.field_m.a(var5Lifetime1, (byte) 106);
                    stackIn_35_0 = stackOut_39_0 ? 1 : 0;
                    stackIn_40_0 = stackOut_39_0;
                    if (!stackIn_40_0 ||
                      this.field_h.field_j.a(var5Lifetime1, (byte) 74)) {
                      var7Lifetime1 = 0;
                    }
                    ri.field_d[5].e(var3Lifetime1, var4Lifetime1, var7Lifetime1);
                    ri.field_d[4].e(var3Lifetime1 + 32, var4Lifetime1, var7Lifetime1);
                    this.b(var4Lifetime1, var5Lifetime1, 115, var7Lifetime1, var3Lifetime1);
                    if (var6Lifetime1 == 0 &&
                      var5Lifetime1 != 0 &&
                      var5Lifetime1 != 42) {
                      ri.field_d[5].e(var3Lifetime1 + 32, 24 + var4Lifetime1, 0);
                    }
                    if (var6Lifetime1 == 12 - var2_int &&
                      42 != var5Lifetime1 &&
                      48 != var5Lifetime1) {
                      ri.field_d[4].e(var3Lifetime1, var4Lifetime1 + 24, 0);
                    }
                    var5Lifetime1 += 8;
                    var6Lifetime1++;
                    var3Lifetime1 += 64;
                  }
                  var2_int++;
                  continue;
                }
              } else {
                stackIn_69_0 = param0;
              }
              if (stackIn_69_0 != -20827) {
                this.field_w = (int[][]) null;
              }
              this.field_f.e();
              gf.a();
              this.field_c.e(16, 16, 16744448);
              gf.d(8, 8, 0, 0, this.field_f.field_y, this.field_f.field_v);
              this.field_c.e(16, 16, 0);
              jh.b();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "lj.J(" + param0 + ')');
        }
    }

    public final void a(byte param0) {
        try {
          int var2_int = -126 / ((4 - param0) / 45);
          this.field_s = mo.field_a;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lj.H(" + param0 + ')');
        }
    }

    public final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 19091) {
            this.field_s = 60;
          }
          param2 = param2 - this.field_l;
          param0 = param0 - this.field_q;
          var4_int = (3 * param0 - (-672 + 4 * (-168 + param2))) / 192;
          var5 = (param2 * 4 + param0 * 3) / 192;
          if (var4_int >= 0 &&
            var5 >= 0 &&
            var4_int < 7 &&
            var5 < 7) {
            stackIn_14_0 = var5 * 7 + var4_int;
            return stackIn_14_0;
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "lj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final gg b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        gg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0 % 7;
          var4 = param0 / 7;
          if (param1 != -15390) {
            this.a(-20, -18, 83, -99, 20, -65);
          }
          stackIn_4_0 = new gg(-192 + (32 * (var3_int + var4) + this.field_q), 168 + (24 * (var4 - var3_int) + this.field_l));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lj.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(cn param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_54_0Lifetime1;
        int stackIn_54_1Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var10Lifetime2;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime2;
        var19 = DungeonAssault.field_K;
        try {
          if (param1 != -32) {
            this.b(-31, -114, 86, -38, -41);
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == this.field_h) {
            var10 = 256;
            var11 = 10066329;
            if (gm.field_d.field_L[param2].field_a == 0) {
              var10 = 128;
            }
            var6_int = var10 * (192 + ((16711680 & var11) >> 18)) / 255;
            var7 = var10 * (192 + (63 & var11 >> 10)) / 255;
            var8 = var10 * ((var11 >> 2 & 63) + 192) / 255;
            decompiledFrameRemainder0 = (var19 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!this.field_h.field_p.a(param2, (byte) 89)) {
              if (param2 == 24) {
                var6_int = 96;
                var8 = 0;
                var7 = 48;
                decompiledFrameRemainder0 = (var19 != 0);
              }
              if (decompiledFrameRemainder0) {
                var6_int = 0;
                var7 = 0;
                var8 = 0;
                var10_ref_int__ = this.field_h.a((byte) 120, param2);
                var11Lifetime2 = 0;
                var12_ref_int__ = var10_ref_int__;
                var13 = 0;
                while (true) {
                  if (var12_ref_int__.length > var13) {
                    var14 = var12_ref_int__[var13];
                    stackOut_17_0 = this.field_h.field_p.a(var14, (byte) 80);
                    stackIn_25_0 = stackOut_17_0 ? 1 : 0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var19 == 0) {
                      if (stackIn_18_0) {
                        var15 = this.a((byte) -103, var14);
                        var16 = je.field_d[this.field_a[var14]];
                        var6_int = var6_int + (192 + ((16711680 & var16) >> 18)) * var15 / 255;
                        var7 = var7 + (192 + (var16 >> 10 & 63)) * var15 / 255;
                        var8 = var8 + (192 + ((var16 & 255) >> 2)) * var15 / 255;
                        var11Lifetime2++;
                      }
                      var13++;
                      continue;
                    }
                  } else {
                    stackIn_25_0 = var11Lifetime2;
                  }
                  break;
                }
                if (stackIn_25_0 > 0) {
                  var12 = 4 * var11Lifetime2;
                  var7 = var7 / var12;
                  var6_int = var6_int / var12;
                  var8 = var8 / var12;
                }
                var7 += 16;
                var6_int += 16;
                var8 += 16;
                var9 = var6_int - (-(var7 << 1) - var8) >> 2;
                decompiledFrameRemainder0 = (var19 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              var9Lifetime1 = this.a((byte) -72, param2);
              var10Lifetime2 = je.field_d[this.field_a[param2]];
              var8 = (192 + ((255 & var10Lifetime2) >> 2)) * var9Lifetime1 / 255;
              var6_int = (192 + ((var10Lifetime2 & 16711680) >> 18)) * var9Lifetime1 / 255;
              var7 = var9Lifetime1 * ((var10Lifetime2 >> 10 & 63) + 192) / 255;
              if (this.field_s != -1) {
                var11Lifetime3 = mo.field_a - this.field_s;
                if (var11Lifetime3 < 200) {
                  if (var11Lifetime3 >= 16) {
                    if (72 > var11Lifetime3) {
                      stackIn_41_0 = 256;
                    } else {
                      stackIn_41_0 = -(2 * var11Lifetime3) + 400;
                    }
                  } else {
                    stackIn_41_0 = var11Lifetime3 * 16;
                  }
                  var12Lifetime2 = stackIn_41_0;
                  var8 = var8 * (256 - var12Lifetime2) >>> 8;
                  var7 = (-var12Lifetime2 + 256) * var7 >>> 8;
                  var6_int = (var12Lifetime2 >> 1) + ((-var12Lifetime2 + 256) * var6_int >>> 8);
                }
              }
            }
          }
          var10Lifetime1 = 0;
          var11Lifetime1 = param3 + param0.field_w + gf.field_i * (param0.field_A + param4);
          var12Lifetime1 = -param0.field_y + gf.field_i;
          var14Lifetime1 = -param0.field_v;
          while (var14Lifetime1 < 0) {
            if (var19 != 0) {
              return;
            }
            var13Lifetime1 = -param0.field_y;
            while (var13Lifetime1 < 0) {
              var15Lifetime1 = param0.field_B[var10Lifetime1];
              stackIn_54_0 = ~var15Lifetime1;
              stackIn_54_1 = -1;
              if (stackIn_54_0 != stackIn_54_1) {
                var16Lifetime1 = var15Lifetime1 & 16711680;
                var17 = var15Lifetime1 & 65280;
                var17 = var17 * var7;
                var18 = 255 & var15Lifetime1;
                var16Lifetime1 = var16Lifetime1 * var6_int;
                var18 = var18 * var8;
                var15Lifetime1 = 65280 & var18 | (16711680 & var17 | var16Lifetime1 & -16777216);
                gf.field_b[var11Lifetime1] = mp.a(var15Lifetime1 >>> 8, -16777216);
              }
              var11Lifetime1++;
              var13Lifetime1++;
              var10Lifetime1++;
            }
            stackIn_54_0Lifetime1 = var11Lifetime1;
            stackIn_54_1Lifetime1 = var12Lifetime1;
            var11Lifetime1 = stackIn_54_0Lifetime1 + stackIn_54_1Lifetime1;
            var14Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_59_0 = var6;
          stackIn_59_1 = new StringBuilder().append("lj.R(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          jh.c();
          if (this.field_d == null) {
            this.field_d = new cn(64, 68);
            this.field_b = new cn(96, 100);
            this.field_b.field_w = -16;
            this.field_b.field_A = -16;
          }
          this.field_d.e();
          gf.a();
          var4_int = 0;
          var5 = 0;
          ri.field_d[5].e(var4_int, var5, 16777215);
          ri.field_d[4].e(var4_int + 32, var5, 16777215);
          this.b(var5, param2, -127, 16777215, var4_int);
          this.field_b.e();
          gf.a();
          this.field_d.e(16, 16, param1);
          gf.d(16, 16, 0, 0, this.field_b.field_y, this.field_b.field_v);
          this.field_d.e(16, 16, 0);
          jh.b();
          this.field_t = 80;
          if (param0 != -9398) {
            this.a(-70, -121, 96, 85, 77);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "lj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        hb[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        try {
          var5_int = 0;
          var6 = new hb[4];
          var7 = 0;
          L1: while (true) {
            if (4 > var7) {
              if (var8 == 0) {
                if (this.field_h.field_A[var7] != null &&
                  (6 & this.field_h.field_A[var7].field_o) == 0) {
                  incrementValue$0 = var5_int;
                  var5_int++;
                  var6[incrementValue$0] = this.field_h.field_A[var7];
                }
                var7++;
                continue;
              }
            } else {
              switch (var5_int) {
                case 0:
                  return;
                case 3:
                  this.a(param1 + 20, 256, 128, var6[0].field_c, param2, param3 + 37);
                  this.a(44 + param1, 256, 128, var6[1].field_c, param2, param3 + 37);
                  this.a(param1 + 32, 256, 128, var6[2].field_c, param2, 48 + param3);
                  if (var8 == 0) {
                    break L1;
                  }
                default:
                  this.a(param1 + 32, 256, 96, var6[0].field_c, param2, 31 + param3);
                  this.a(param1 + 16, 256, 96, var6[1].field_c, param2, param3 + 41);
                  this.a(48 + param1, 256, 96, var6[2].field_c, param2, 41 + param3);
                  this.a(32 + param1, 256, 96, var6[3].field_c, param2, 51 + param3);
                  if (var8 == 0) {
                    break L1;
                  }
                case 2:
                  this.a(22 + param1, 256, 144, var6[0].field_c, param2, 45 + param3);
                  this.a(42 + param1, 256, 144, var6[1].field_c, param2, param3 + 45);
                  if (var8 == 0) {
                    break L1;
                  }
                  break;
                case 1:
                  break;
              }
            }
            this.a(param1 + 32, 256, 192, var6[0].field_c, param2, param3 + 45);
            break;
          }
          var7 = -60 % ((param0 + 54) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "lj.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ai var7 = null;
        int var7_int = 0;
        cn var7_ref = null;
        int[] var7_array = null;
        rh[] var7_array2 = null;
        int var8 = 0;
        int var9_int = 0;
        rh var9 = null;
        int var10 = 0;
        cn var7_refLifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var7_intLifetime4;
        int var7_intLifetime1Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = DungeonAssault.field_K;
        try {
          if (param3 != -25) {
            field_u = -46;
          }
          boolean decompiledSharedTail0 = (null != this.field_h);
          if (!decompiledSharedTail0) {
            var7 = gm.field_d.field_L[param2];
            if (qj.field_c[param2] != null) {
              var7 = qj.field_c[param2];
            }
            var5_int = var7.field_a;
            var6 = 1;
            decompiledSharedTail0 = (var10 != 0);
          }
          if (decompiledSharedTail0) {
            var5_int = this.field_h.field_h[param2].field_a;
            var6 = this.field_h.field_p.a(param2, (byte) 106) ? 1 : 0;
          }
          if (var6 == 0 &&
            param2 != 24) {
            this.a(i.field_r[0], -32, param2, param0, param1 + 1);
            if (param2 > 6) {
              var7_int = param2 - 7;
              if (this.field_h.field_p.a(var7_int, (byte) 110) &&
                this.field_i.a(var7_int + 42, (byte) 78)) {
                ec.a(18 + param1, param0, (byte) -80, mf.field_b[0], (je.field_d[this.field_a[var7_int]] >> 1 & 8355711) + 8421504, this.a((byte) -11, var7_int) >> 2);
              }
            }
            if (param2 % 7 != 6) {
              var7_intLifetime2 = 1 + param2;
              if (this.field_h.field_p.a(var7_intLifetime2, (byte) 93) &&
                this.field_i.a(param2 - param2 / 7, (byte) 121)) {
                ec.a(param1 + 18, param0, (byte) -90, mf.field_b[1], 8421504 + (8355711 & je.field_d[this.field_a[var7_intLifetime2]] >> 1), this.a((byte) -8, var7_intLifetime2) >> 2);
              }
            }
            if (param2 < 42) {
              var7_intLifetime3 = 7 + param2;
              if (this.field_h.field_p.a(var7_intLifetime3, (byte) 104) &&
                this.field_i.a(param2 + 42, (byte) 97)) {
                ec.a(param1 + 18, param0, (byte) -128, mf.field_b[2], (8355711 & je.field_d[this.field_a[var7_intLifetime3]] >> 1) + 8421504, this.a((byte) -67, var7_intLifetime3) >> 2);
              }
            }
            if (0 == param2 % 7) {
              return;
            }
            var7_intLifetime4 = -1 + param2;
            if (this.field_h.field_p.a(var7_intLifetime4, (byte) 114) &&
              this.field_i.a(var7_intLifetime4 - var7_intLifetime4 / 7, (byte) 101)) {
              ec.a(18 + param1, param0, (byte) -105, mf.field_b[3], ((je.field_d[this.field_a[var7_intLifetime4]] & 16711422) >> 1) + 8421504, this.a((byte) -36, var7_intLifetime4) >> 2);
            }
            if (var10 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (var6 == 0) {
            if (var5_int != 0) {
              i.field_r[var5_int].h(param0, param1 + 1);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              var7_intLifetime1 = this.field_h.d(param2, 30813);
              mc.field_w[var7_intLifetime1].h(param0, 1 + param1);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (var6 != 0 ||
            var10 != 0)) {
            if (var5_int == 0) {
              var7_intLifetime1Lifetime1 = this.a(false, param2);
              this.a(mc.field_w[var7_intLifetime1Lifetime1], -32, param2, param0, param1 - 7);
            }
            if (var5_int != 0 ||
              var10 != 0) {
              this.a(i.field_r[var5_int], -32, param2, param0, param1 + 1);
              if (gh.field_i[var5_int].field_g == 2 && (this.field_h == null ||
                !this.field_h.field_j.a(param2, (byte) 101))) {
                var7_ref = jb.a((byte) -70, var5_int);
                if (var7_ref != null) {
                  if (null == this.field_h) {
                    if (null != var7_ref) {
                      var8 = var7_ref.field_E * 5 >> 3;
                      var9_int = var7_ref.field_G * 5 >> 3;
                      var7_ref.c(param0 + (-var8 + 48 >> 1), 40 + (param1 - var9_int), var8, var9_int);
                      if (var10 != 0) {
                        var7_ref.h(-(var7_ref.field_y >> 1) + (param0 + 32), -var7_ref.field_v + (24 + (21 + param1)));
                      }
                    }
                  } else {
                    var7_ref.h(-(var7_ref.field_y >> 1) + (param0 + 32), -var7_ref.field_v + (24 + (21 + param1)));
                  }
                }
              }
            }
            if (this.field_h != null) {
              L17: {
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameCompleted1 = true;
                if (this.field_v[param2] != null) {
                  var7_array = this.field_w[param2];
                  var8Lifetime1 = 0;
                  while (var8Lifetime1 < var7_array.length) {
                    var9_intLifetime1 = var7_array[var8Lifetime1];
                    sn.field_c[var9_intLifetime1].h(param0, param1);
                    var8Lifetime1++;
                    if (var10 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var7_array2 = this.field_v[param2];
                    var8Lifetime1Lifetime1 = 0;
                    while (var7_array2.length > var8Lifetime1Lifetime1) {
                      var9 = var7_array2[var8Lifetime1Lifetime1];
                      var9.e();
                      var8Lifetime1Lifetime1++;
                      if (var10 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
                if ((decompiledFrameCompleted0) &&
                  (param2 <= 6)) {
                  break L17;
                }
                var7_intLifetime1Lifetime1 = -7 + param2;
                if (this.field_h.field_p.a(var7_intLifetime1Lifetime1, (byte) 106) &&
                  this.field_i.a(var7_intLifetime1Lifetime1 + 42, (byte) 86)) {
                  ec.a(18 + param1, param0, (byte) -111, mf.field_b[0], 8421504 + ((16711422 & je.field_d[this.field_a[var7_intLifetime1Lifetime1]]) >> 1), this.a((byte) -39, var7_intLifetime1Lifetime1) >> 2);
                }
              }
              if (param2 % 7 != 6) {
                var7_intLifetime1Lifetime1 = param2 + 1;
                if (this.field_h.field_p.a(var7_intLifetime1Lifetime1, (byte) 110) &&
                  this.field_i.a(-(param2 / 7) + param2, (byte) 92)) {
                  ec.a(param1 + 18, param0, (byte) -82, mf.field_b[1], ((je.field_d[this.field_a[var7_intLifetime1Lifetime1]] & 16711422) >> 1) + 8421504, this.a((byte) -57, var7_intLifetime1Lifetime1) >> 2);
                }
              }
              if (param2 < 42) {
                var7_intLifetime1Lifetime1 = 7 + param2;
                if (this.field_h.field_p.a(var7_intLifetime1Lifetime1, (byte) 93) &&
                  this.field_i.a(param2 + 42, (byte) 92)) {
                  ec.a(param1 + 18, param0, (byte) -111, mf.field_b[2], 8421504 + ((je.field_d[this.field_a[var7_intLifetime1Lifetime1]] & 16711422) >> 1), this.a((byte) -56, var7_intLifetime1Lifetime1) >> 2);
                }
              }
              if (param2 % 7 != 0) {
                var7_intLifetime1Lifetime1 = param2 - 1;
                if (this.field_h.field_p.a(var7_intLifetime1Lifetime1, (byte) 69) &&
                  this.field_i.a(var7_intLifetime1Lifetime1 - var7_intLifetime1Lifetime1 / 7, (byte) 67)) {
                  ec.a(18 + param1, param0, (byte) -104, mf.field_b[3], 8421504 + (8355711 & je.field_d[this.field_a[var7_intLifetime1Lifetime1]] >> 1), this.a((byte) -52, var7_intLifetime1Lifetime1) >> 2);
                }
              }
            }
          }
          if (this.field_h != null) {
            if (this.field_h.field_q == param2) {
              this.a((byte) 56, param0, 256, param1);
              if (var10 == 0) {
                return;
              }
            }
            if (~param2 == ~this.field_h.field_B &&
              gh.field_i[var5_int].field_g != 2) {
              var7_refLifetime1 = fm.b(-29092, this.field_h.field_u.field_c);
              if (null != var7_refLifetime1) {
                var7_refLifetime1.d((64 - var7_refLifetime1.field_y >> 1) + param0, -var7_refLifetime1.field_v + param1 + 45, 80);
              }
              this.a((byte) -107, param0, 80, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var5), "lj.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    lj(go param0, int param1, int param2) {
        this(param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param0.field_Y;
          this.field_i = this.field_h.field_v;
          this.field_a = new int[49];
          this.field_n = new int[49];
          this.field_w = new int[49][];
          this.field_v = new rh[49][];
          this.field_k = new wm(84);
          this.field_s = -1;
          this.a(15122, 0);
          this.a(15122, 6);
          this.a(15122, 42);
          this.a(15122, 48);
          this.c((byte) 125);
          this.b(-20827);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0) {
        if (param0 != 2985) {
          return;
        }
        try {
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lj.D(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        try {
          this.field_w[param1][param0] = param4;
          var6_int = 1 + this.field_q + (32 * (param1 / 7 + param1 % 7) - 224 + ud.field_w[param4]);
          int var8 = -118 / ((param2 - 32) / 44);
          var7 = -21 + r.field_b[param4] + (168 + 24 * (-(param1 % 7) + param1 / 7)) + this.field_l;
          this.field_a[param1] = param3;
          this.field_v[param1][param0] = new rh(var6_int, var7, 20, 40, je.field_d[param3], rg.field_P[param3], 256);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lj.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void b(byte param0) {
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_199_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        int var12Lifetime2;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        var13 = DungeonAssault.field_K;
        try {
          nb.field_d.h(13 + (-320 + (this.field_q + 79)), this.field_l + 13);
          var2_int = 0;
          do {
            if (168 < var2_int) {
              if (param0 != -55) {
                this.field_n = (int[]) null;
              }
              break;
            }
            gf.b(-(var2_int * 4 / 3) + this.field_q, var2_int + (18 + this.field_l), 8 * var2_int / 3, 0);
            gf.b(-(4 * var2_int / 3) + this.field_q, -var2_int + 336 + 18 + this.field_l, 8 * var2_int / 3, 0);
            var2_int++;
          } while (var13 == 0);
          var2_int = 0;
          L3: while (true) {
            if (var2_int < 7) {
              var3 = -(32 * (1 + var2_int)) + this.field_q;
              var4 = var2_int * 24 + this.field_l;
              var5 = -var2_int + 6;
              stackIn_119_0 = 0;
              if (var13 != 0) {
                break L3;
              }
              var6 = stackIn_119_0;
              while (1 + var2_int > var6) {
                if (null != this.field_h &&
                  !this.field_h.field_p.a(var5, (byte) 104)) {
                  stackIn_25_0 = 0;
                } else {
                  stackIn_25_0 = 1;
                }
                var7 = stackIn_25_0;
                if (var6 == 0) {
                  if (var5 != 0 &&
                    var5 != 6) {
                    this.a(var4, 9, var3, var5, ua.field_b[5]);
                  }
                } else {
                  var8 = -7 + var5;
                  if (var7 == 0 &&
                    !this.field_h.field_p.a(var8, (byte) 67)) {
                    stackIn_42_0 = 0;
                  } else {
                    stackIn_42_0 = 1;
                  }
                  var9 = stackIn_42_0;
                  var10 = 5;
                  if (var9 != 0) {
                    var11 = this.field_i.a(42 + var8, (byte) 123) ? 1 : 0;
                    if (var11 != 0) {
                      boolean decompiledFrameRemainder1 = true;
                      if (this.field_h != null && (!this.field_h.field_j.a(var5, (byte) 110) &&
                        ~this.field_h.field_B != ~var5 ||
                        !this.field_h.field_j.a(var8, (byte) 103) &&
                        ~var8 != ~this.field_h.field_B)) {
                        stackIn_64_0 = 0;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        stackIn_64_0 = 1;
                      }
                      var12 = stackIn_64_0;
                      stackIn_68_0 = (var12 != 0) ? 1 : 3;
                      var10 = stackIn_68_0;
                    }
                  }
                  this.a(var4, param0 ^ -31, var3, var5, ua.field_b[var10]);
                }
                if (~var2_int == ~var6) {
                  if (var5 != 6 &&
                    var5 != 48) {
                    this.a(var4, 121, 32 + var3, var5, ua.field_b[4]);
                  }
                } else {
                  var8Lifetime2 = var5 + 1;
                  if (var7 == 0 &&
                    !this.field_h.field_p.a(var8Lifetime2, (byte) 89)) {
                    stackIn_87_0 = 0;
                  } else {
                    stackIn_87_0 = 1;
                  }
                  var9Lifetime2 = stackIn_87_0;
                  var10Lifetime2 = 4;
                  if (var9Lifetime2 != 0) {
                    var11Lifetime2 = this.field_i.a(-(var5 / 7) + var5, (byte) 90) ? 1 : 0;
                    if (var11Lifetime2 != 0) {
                      boolean decompiledFrameRemainder0 = true;
                      if (this.field_h != null && (!this.field_h.field_j.a(var5, (byte) 66) &&
                        var5 != this.field_h.field_B ||
                        !this.field_h.field_j.a(var8Lifetime2, (byte) 80) &&
                        ~var8Lifetime2 != ~this.field_h.field_B)) {
                        stackIn_109_0 = 0;
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        stackIn_109_0 = 1;
                      }
                      var12Lifetime2 = stackIn_109_0;
                      stackIn_113_0 = (var12Lifetime2 == 0) ? 2 : 0;
                      var10Lifetime2 = stackIn_113_0;
                    }
                  }
                  this.a(var4, param0 + 85, 32 + var3, var5, ua.field_b[var10Lifetime2]);
                }
                this.a(var3, var4, var5, -25);
                var6++;
                var3 += 64;
                var5 += 8;
              }
              var2_int++;
              continue L3;
            }
            stackIn_119_0 = 7;
            break;
          }
          var2_int = stackIn_119_0;
          while (var2_int < 13) {
            var3Lifetime1 = -(32 * (-var2_int + 13)) + this.field_q;
            var4Lifetime1 = var2_int * 24 + this.field_l;
            var5Lifetime1 = 7 * var2_int - 42;
            if (var13 != 0) {
              return;
            }
            var6Lifetime1 = 0;
            while (13 - var2_int > var6Lifetime1) {
              if (this.field_h != null &&
                !this.field_h.field_p.a(var5Lifetime1, (byte) 75)) {
                stackIn_134_0 = 0;
              } else {
                stackIn_134_0 = 1;
              }
              var7Lifetime1 = stackIn_134_0;
              var8Lifetime1 = -7 + var5Lifetime1;
              if (var7Lifetime1 == 0 &&
                !this.field_h.field_p.a(var8Lifetime1, (byte) 122)) {
                stackIn_141_0 = 0;
              } else {
                stackIn_141_0 = 1;
              }
              var9Lifetime1 = stackIn_141_0;
              var10Lifetime1 = 5;
              if (var9Lifetime1 != 0) {
                var11Lifetime1 = this.field_i.a(42 + var8Lifetime1, (byte) 121) ? 1 : 0;
                if (var11Lifetime1 != 0) {
                  boolean decompiledFrameRemainder3 = true;
                  if (this.field_h != null && (!this.field_h.field_j.a(var5Lifetime1, (byte) 68) &&
                    ~var5Lifetime1 != ~this.field_h.field_B ||
                    !this.field_h.field_j.a(var8Lifetime1, (byte) 103) &&
                    ~this.field_h.field_B != ~var8Lifetime1)) {
                    stackIn_163_0 = 0;
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    stackIn_163_0 = 1;
                  }
                  var12Lifetime1 = stackIn_163_0;
                  stackIn_167_0 = (var12Lifetime1 != 0) ? 1 : 3;
                  var10Lifetime1 = stackIn_167_0;
                }
              }
              var8Lifetime1Lifetime1 = var5Lifetime1 + 1;
              this.a(var4Lifetime1, 5, var3Lifetime1, var5Lifetime1, ua.field_b[var10Lifetime1]);
              var10Lifetime1Lifetime1 = 4;
              if (var7Lifetime1 == 0 &&
                !this.field_h.field_p.a(var8Lifetime1Lifetime1, (byte) 95)) {
                stackIn_175_0 = 0;
              } else {
                stackIn_175_0 = 1;
              }
              var9Lifetime1Lifetime1 = stackIn_175_0;
              if (var9Lifetime1Lifetime1 != 0) {
                var11Lifetime1Lifetime1 = this.field_i.a(-(var5Lifetime1 / 7) + var5Lifetime1, (byte) 116) ? 1 : 0;
                if (var11Lifetime1Lifetime1 != 0) {
                  boolean decompiledFrameRemainder2 = true;
                  if (null != this.field_h && (!this.field_h.field_j.a(var5Lifetime1, (byte) 88) &&
                    var5Lifetime1 != this.field_h.field_B ||
                    !this.field_h.field_j.a(var8Lifetime1Lifetime1, (byte) 70) &&
                    var8Lifetime1Lifetime1 != this.field_h.field_B)) {
                    stackIn_195_0 = 0;
                    decompiledFrameRemainder2 = false;
                  }
                  else {
                    stackIn_195_0 = 1;
                  }
                  var12Lifetime1Lifetime1 = stackIn_195_0;
                  stackIn_199_0 = (var12Lifetime1Lifetime1 != 0) ? 0 : 2;
                  var10Lifetime1Lifetime1 = stackIn_199_0;
                }
              }
              this.a(var4Lifetime1, 115, var3Lifetime1 + 32, var5Lifetime1, ua.field_b[var10Lifetime1Lifetime1]);
              this.a(var3Lifetime1, var4Lifetime1, var5Lifetime1, -25);
              if (var6Lifetime1 == 0 &&
                var5Lifetime1 != 0 &&
                42 != var5Lifetime1) {
                ua.field_b[4].h(var3Lifetime1, var4Lifetime1 + 24);
              }
              if (~var6Lifetime1 == ~(12 - var2_int) &&
                var5Lifetime1 != 42 &&
                var5Lifetime1 != 48) {
                ua.field_b[5].h(32 + var3Lifetime1, var4Lifetime1 + 24);
              }
              var3Lifetime1 += 64;
              var6Lifetime1++;
              var5Lifetime1 += 8;
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "lj.G(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1) {
        rh[] array$0 = null;
        int[] array$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        var10 = DungeonAssault.field_K;
        try {
          if (null != this.field_w[param1]) {
            return;
          }
          var3 = this.field_h.b(param1, (byte) -36);
          var4 = 0;
          if (param0 != 15122) {
            this.field_w = (int[][]) null;
          }
          var5_ref_int__ = var3;
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 >= var5_ref_int__.length))) {
            var7_int = var5_ref_int__[var6];
            stackOut_8_0 = this.field_k.a(var7_int, (byte) 88);
            stackIn_15_0 = stackOut_8_0 ? 1 : 0;
            stackIn_9_0 = stackOut_8_0;
            if (var10 == 0) {
              if (!stackIn_9_0) {
                var4++;
              }
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = oi.b(0, 5);
          }
          var5 = stackIn_15_0;
          if (var4 <= 0) {
            this.field_v[param1] = new rh[]{};
            this.field_w[param1] = new int[]{};
            if (var10 == 0) {
              return;
            }
          }
          array$0 = new rh[var4];
          this.field_v[param1] = array$0;
          array$1 = new int[var4];
          this.field_w[param1] = array$1;
          var6Lifetime1 = 0;
          var7 = var3;
          var8 = 0;
          while (var8 < var7.length) {
            var9 = var7[var8];
            if (var10 != 0) {
              return;
            }
            if (!this.field_k.a(var9, (byte) 93)) {
              this.field_k.a(var9, param0 - 15183);
              if (~var9 == ~(-(param1 / 7) + (param1 - 1))) {
                incrementValue$2 = var6Lifetime1;
                var6Lifetime1++;
                this.a(incrementValue$2, param1, param0 - 15007, var5, 6);
              }
              if (~var9 == ~(param1 - param1 / 7)) {
                incrementValue$3 = var6Lifetime1;
                var6Lifetime1++;
                this.a(incrementValue$3, param1, 98, var5, 3);
              }
              if (~(param1 + 35) == ~var9) {
                incrementValue$4 = var6Lifetime1;
                var6Lifetime1++;
                this.a(incrementValue$4, param1, param0 - 15007, var5, 1);
              }
              if (var9 == param1 + 42) {
                incrementValue$5 = var6Lifetime1;
                var6Lifetime1++;
                this.a(incrementValue$5, param1, 100, var5, 4);
              }
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3_ref), "lj.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 49))) {
            stackIn_23_0 = ~var2_int;
            stackIn_23_1 = -1;
            if (var3 == 0) {
              if (stackIn_23_0 != stackIn_23_1 &&
                var2_int != 6 &&
                42 != var2_int &&
                var2_int != 48 &&
                this.field_h.field_p.a(var2_int, (byte) 73)) {
                this.a(15122, var2_int);
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_23_0 = param0;
            stackIn_23_1 = 123;
          }
          if (stackIn_23_0 <= stackIn_23_1) {
            this.field_c = (cn) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "lj.Q(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_n[param1];
          if (var3_int < 256) {
            var4 = (int)(256.0 * (1.0 - Math.exp((double)(-var3_int) / 40.0)));
            var5 = (int)((1.0 - Math.cos((double)var3_int * 3.141592653589793 / 128.0)) * 64.0);
            var3_int = var4 + var5;
            if (DungeonAssault.field_K != 0) {
              var3_int = 256;
            }
          } else {
            var3_int = 256;
          }
          var3_int = (int)((double)var3_int + 48.0 * te.c(param1, mo.field_a, 0.03125));
          if (param0 > -1) {
            this.field_n = (int[]) null;
          }
          var3_int = var3_int >> 1;
          if (var3_int < 40) {
            var3_int = 40;
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "lj.L(" + param0 + ',' + param1 + ')');
        }
    }

    private lj(int param0, int param1) {
        this.field_c = null;
        this.field_d = null;
        try {
          this.field_l = -168 + param1;
          this.field_q = param0;
          this.field_i = gm.field_d.field_k;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lj.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    lj(go param0, lj param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = null;
        this.field_d = null;
        try {
          this.field_q = param1.field_q;
          this.field_l = param1.field_l;
          this.field_h = param0.field_Y;
          this.field_a = param1.field_a;
          this.field_n = param1.field_n;
          this.field_v = param1.field_v;
          this.field_w = param1.field_w;
          this.field_k = param1.field_k;
          this.field_s = -1;
          this.field_i = this.field_h.field_v;
          this.c((byte) 126);
          this.b(-20827);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_u = 100;
        field_p = "Raider wins!";
        field_j = "Your initial Renown after the next reset will be increased by 100.";
        field_r = 200;
        field_g = false;
    }
}
