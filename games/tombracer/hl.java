/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl implements mta {
    private jaclib.memory.heap.NativeHeapBuffer field_b;
    private int field_f;
    static String field_i;
    static String field_a;
    kda field_h;
    private int field_g;
    private int field_e;
    private int field_k;
    static oc[] field_c;
    private int field_d;
    private boolean field_j;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        jaggl.MapBuffer var5 = null;
        int stackIn_9_0;
        int stackIn_9_1;
        Object stackIn_9_2;
        int stackIn_9_3;
        int stackIn_10_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_12_0 = null;
        jaggl.MapBuffer stackIn_18_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            var5 = (jaggl.MapBuffer) null;
            this.a((jaggl.MapBuffer) null, -94);
          }
          if (this.field_e == 0) {
            this.d(1);
            if (0 >= this.field_f) {
              this.field_e = 2;
              stackIn_20_0 = this.field_b;
              return (jaclib.memory.Buffer) ((Object) stackIn_20_0);
            }
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
            if (param1) {
              stackIn_9_0 = this.field_k;
              stackIn_9_1 = this.field_d;
              stackIn_9_2 = null;
              stackIn_9_3 = 0;
              if (!this.field_j) {
                stackIn_10_4 = 35044;
              } else {
                stackIn_10_4 = 35040;
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_9_0, stackIn_9_1, (byte[]) (stackIn_9_2), stackIn_9_3, stackIn_10_4);
              if (this.field_h.field_o.c >= this.field_g) {
                this.field_e = 1;
                stackIn_12_0 = this.field_h.field_o;
                return (jaclib.memory.Buffer) ((Object) stackIn_12_0);
              }
            }
            if (param0.b()) {
              return null;
            }
            if (param0.a(this.field_k, this.field_g, 35001)) {
              this.field_e = 2;
              stackIn_18_0 = (jaggl.MapBuffer) (param0);
              return (jaclib.memory.Buffer) ((Object) stackIn_18_0);
            }
          }
          stackIn_22_0 = null;
          return (jaclib.memory.Buffer) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("hl.O(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(int param0) {
        if (0 <= this.field_f) {
          return;
        }
        if (param0 != 1) {
          this.d(14);
        }
        if (this.field_h.field_fd) {
          jaggl.OpenGL.glGenBuffersARB(1, uqa.field_x, 0);
          this.field_f = uqa.field_x[0];
          jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
        } else {
          this.field_f = 0;
        }
    }

    protected final void finalize() throws Throwable {
        this.a(12574);
        super.finalize();
    }

    final void c(int param0) {
        if (param0 != -3) {
          return;
        }
        if (this.field_h.field_fd) {
          jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int var40Lifetime1;
        int var41Lifetime1;
        int var42Lifetime1;
        int var43Lifetime1;
        var47 = TombRacer.field_G ? 1 : 0;
        try {
          var8_int = 0;
          var9 = param7;
          var10 = 0;
          var11 = -param6 + param5;
          var12 = param7 - param6;
          var13 = param5 * param5;
          var14 = param7 * param7;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 1;
          if (!param4) {
            hl.a(-80, 16, -30, 69, false, -29, -88, -33);
          }
          var18 = var13 << 1;
          var19 = var16 << 1;
          var20 = var15 << 1;
          var21 = param7 << 1;
          var22 = var12 << 1;
          var23 = var17 + (1 - var21) * var13;
          var24 = var14 - var18 * (var21 - 1);
          var25 = (1 - var22) * var15 + var19;
          var26 = -(var20 * (var22 - 1)) + var16;
          var27 = var13 << 2;
          var28 = var14 << 2;
          var29 = var15 << 2;
          var30 = var16 << 2;
          var31 = 3 * var17;
          var32 = (-3 + var21) * var18;
          var33 = 3 * var19;
          var34 = var20 * (-3 + var22);
          var35 = var28;
          var36 = var27 * (-1 + param7);
          var37 = var30;
          var38 = var29 * (var12 - 1);
          if (gca.field_d <= param2 &&
            hc.field_h >= param2) {
            var57 = vaa.field_a[param2];
            var40 = rp.a(ss.field_c, -16226, pka.field_b, -param5 + param3);
            var41 = rp.a(ss.field_c, -16226, pka.field_b, param5 + param3);
            var42 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var11);
            var43 = rp.a(ss.field_c, -16226, pka.field_b, param3 + var11);
            nra.a((byte) -55, param0, var42, var57, var40);
            nra.a((byte) -55, param1, var43, var57, var42);
            nra.a((byte) -55, param0, var41, var57, var43);
          }
          while (true) {
            if (var9 <= 0) {
              return;
            }
            stackIn_11_0 = (var9 > var12) ? 0 : 1;
            var39 = stackIn_11_0;
            if (var39 != 0) {
              if (var25 < 0) {
                while (var25 < 0) {
                  var26 = var26 + var37;
                  var25 = var25 + var33;
                  var37 = var37 + var30;
                  var10++;
                  var33 = var33 + var30;
                }
              }
              if (var26 < 0) {
                var25 = var25 + var33;
                var26 = var26 + var37;
                var10++;
                var37 = var37 + var30;
                var33 = var33 + var30;
              }
              var26 = var26 - var34;
              var25 = var25 - var38;
              var38 = var38 - var29;
              var34 = var34 - var29;
            }
            if (var23 < 0) {
              while (0 > var23) {
                var23 = var23 + var31;
                var24 = var24 + var35;
                var35 = var35 + var28;
                var31 = var31 + var28;
                var8_int++;
              }
            }
            if (0 > var24) {
              var24 = var24 + var35;
              var23 = var23 + var31;
              var8_int++;
              var35 = var35 + var28;
              var31 = var31 + var28;
            }
            var24 = var24 - var32;
            var23 = var23 - var36;
            var32 = var32 - var27;
            var9--;
            var36 = var36 - var27;
            var40Lifetime1 = -var9 + param2;
            var41Lifetime1 = param2 + var9;
            if (gca.field_d > var41Lifetime1) {
              continue;
            }
            if (hc.field_h < var40Lifetime1) {
              continue;
            }
            var42Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, var8_int + param3);
            var43Lifetime1 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var8_int);
            if (var39 == 0) {
              if (var40Lifetime1 >= gca.field_d) {
                nra.a((byte) -55, param0, var42Lifetime1, vaa.field_a[var40Lifetime1], var43Lifetime1);
              }
              if (var41Lifetime1 > hc.field_h) {
                continue;
              }
              nra.a((byte) -55, param0, var42Lifetime1, vaa.field_a[var41Lifetime1], var43Lifetime1);
              continue;
            }
            var44 = rp.a(ss.field_c, -16226, pka.field_b, param3 + var10);
            var45 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var10);
            if (var40Lifetime1 >= gca.field_d) {
              var58 = vaa.field_a[var40Lifetime1];
              nra.a((byte) -55, param0, var45, var58, var43Lifetime1);
              nra.a((byte) -55, param1, var44, var58, var45);
              nra.a((byte) -55, param0, var42Lifetime1, var58, var44);
            }
            if (var41Lifetime1 > hc.field_h) {
              continue;
            }
            var59 = vaa.field_a[var41Lifetime1];
            nra.a((byte) -55, param0, var45, var59, var43Lifetime1);
            nra.a((byte) -55, param1, var44, var59, var45);
            nra.a((byte) -55, param0, var42Lifetime1, var59, var44);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var8), "hl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void e(int param0) {
        field_i = null;
        int var1 = -35 / ((param0 + 82) / 44);
        field_c = null;
        field_a = null;
    }

    void a(int param0) {
        if (param0 != 12574) {
          this.a(72);
        }
        if (0 < this.field_f) {
          this.field_h.a(this.field_g, this.field_f, (byte) 62);
          this.field_f = -1;
        }
    }

    void a(int param0, int param1) {
        if (this.field_d < param1) {
          this.d(1);
          if (this.field_f > 0) {
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
            jaggl.OpenGL.glBufferDataARBub(this.field_k, param1, (byte[]) null, 0, !this.field_j ? 35044 : 35040);
            this.field_h.field_X = this.field_h.field_X + (-this.field_d + param1);
          } else {
            this.field_b = this.field_h.a(false, param1, false);
          }
          this.field_d = param1;
        }
        this.field_g = param1;
        int var3 = -18 % ((param0 + 30) / 36);
    }

    final boolean a(jaggl.MapBuffer param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 91) {
            this.field_e = -84;
          }
          var3_int = 1;
          if (this.field_e != 0) {
            if (this.field_f > 0) {
              jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_f);
              if (this.field_e != 1) {
                stackIn_10_0 = (!param0.a()) ? 0 : 1;
                var3_int = stackIn_10_0;
              } else {
                jaggl.OpenGL.glBufferSubDataARBa(this.field_k, 0, this.field_d, this.field_h.field_o.getAddress());
              }
            }
            this.field_e = 0;
          }
          stackIn_13_0 = var3_int;
          return stackIn_13_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hl.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final long b(boolean param0) {
        if (!param0) {
          return -36L;
        }
        return this.field_f != 0 ? 0L : this.field_b.getAddress();
    }

    hl(kda param0, int param1, boolean param2) {
        this.field_f = -1;
        this.field_e = 0;
        try {
          this.field_k = param1;
          this.field_j = param2 ? true : false;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "RANK";
    }
}
