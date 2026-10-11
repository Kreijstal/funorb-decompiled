/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends nv {
    private boolean field_t;
    private int field_r;
    private int field_q;
    static up field_o;
    static String field_u;
    static String field_s;
    private pc field_v;
    static String field_n;
    private int field_p;

    final void a(int param0, int param1, int param2) {
        if (param2 != 19072) {
          this.a(120, -24);
        }
        this.field_p = param0;
        this.field_r = param1;
    }

    public static void g(byte param0) {
        if (param0 != 91) {
          return;
        }
        field_o = null;
        field_u = null;
        field_n = null;
        field_s = null;
    }

    th(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = 2;
        this.field_q = 2;
        this.field_p = 1;
        this.field_v = new pc();
        try {
          this.field_q = param1.b((byte) 44, 2);
          this.field_r = param1.b((byte) 44, 4);
          this.field_p = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "th.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          return 84;
        }
        return param0;
    }

    final void h(int param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        super.h(param0);
        var2 = this.field_q;
        if (var2 != 3) {
          if (var2 == 1) {
            this.field_q = 3;
          }
        } else {
          this.field_q = 1;
        }
    }

    final void k(int param0) {
        int var17 = 0;
        hr stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        hr stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_3;
        ffa stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_56_2 = false;
        int stackIn_57_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        ffa[] var15;
        ffa[] var16;
        ffa var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        hr var24;
        hr var25;
        var23 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_g.d(3);
        var3 = this.field_g.e(9648);
        var4 = this.field_g.c(param0 ^ -5493);
        var5 = this.field_g.a((byte) 55);
        if (param0 != 5418) {
          this.field_q = 90;
        }
        var6 = dma.field_k[this.field_q][0] << 16;
        var7 = dma.field_k[this.field_q][1] << 16;
        var9 = this.field_p << 16;
        var10 = this.field_r << 16;
        var11 = 0;
        var13 = this.field_q;
        if (0 == var13) {
          var12 = var5;
          var11 = var3 + var5 / 2 - 1;
        } else {
          if (var13 == 2) {
            var11 = var3 - var5 / 2;
            var12 = var5;
          } else {
            if (var13 != 3) {
              if (var13 != 1) {
                return;
              }
              var12 = var4;
              var11 = var2 - var4 / 2;
            } else {
              var11 = var2 + var4 / 2 - 1;
              var12 = var4;
            }
          }
        }
        var14 = this.field_g.P(param0 - 5418);
        if (this.field_q != 0 &&
          this.field_q != 2) {
          var25 = this.b(true).a(var11, this.field_g.Q(2) + this.o((byte) 46).a(var5, 0), (byte) 100, var14);
          var25.a(false, 2, 3, 8, 10);
          stackIn_22_0 = var25;
          stackIn_22_1 = 72;
          stackIn_22_2 = 0;
          if (this.field_q == 3) {
            stackIn_23_3 = -var10;
          } else {
            stackIn_23_3 = var10;
          }
          ((hr) (Object) stackIn_22_0).b(stackIn_22_1, stackIn_22_2, stackIn_23_3);
        } else {
          var24 = this.b(true).a(this.field_g.r((byte) -95) + this.o((byte) 46).a(var4, 0), var11, (byte) 100, var14);
          var24.a(false, 2, 3, 8, 10);
          stackIn_18_0 = var24;
          stackIn_18_1 = 79;
          if (this.field_q != 0) {
            stackIn_19_2 = var10;
          } else {
            stackIn_19_2 = -var10;
          }
          ((hr) (Object) stackIn_18_0).b(stackIn_18_1, stackIn_19_2, 0);
        }
        var15 = this.b(true).field_u.b(var3, -1, var2, var4, var5);
        var16 = var15;
        for (var17 = 0; var17 < var16.length; var17++) {
          var18 = var16[var17];
          if (var18 != this.field_g &&
            !this.field_g.a(var18, true)) {
            var19 = var18.d(3);
            var20 = var18.e(param0 + 4230);
            if (this.field_g.a((byte) 110, var20, var19, 1, 1)) {
              var22 = this.field_q;
              if (var22 == 0) {
                var21 = var20 + var18.a((byte) 55) / 2;
              } else {
                switch (var22) {
                  case 2:
                    var21 = var20 - var18.a((byte) 55) / 2;
                    break;
                  default:
                    return;
                  case 1:
                    var21 = var19 - var18.c(param0 ^ -5496) / 2;
                    break;
                  case 3:
                    var21 = var19 + var18.c(-107) / 2;
                    break;
                }
              }
              var22 = ua.a(-var11 + var21, 2);
              if (var22 > 262144) {
                if (this.field_q != 0 &&
                  this.field_q != 2) {
                  this.field_v.a(var11, var21, var20, var20, 44);
                } else {
                  this.field_v.a(var19, var19, var11, var21, 44);
                }
              }
              if (!(var22 > 262144) ||
                !this.b(true).a(1, this.field_v, this.e(param0 ^ 5420), (byte) 60)) {
                var8 = bs.a(var12, param0 ^ -25604, var22);
                var8 = -gqa.a(var8, (byte) 24, -var9 + var10) + var10;
                var8 = za.$cfr$intArgs$a$c604db63f465(var9, 113, var10, var8);
                stackIn_56_0 = var18;
                stackIn_56_1 = 120;
                stackIn_56_2 = false;
                if (this.field_t) {
                  stackIn_57_3 = 2;
                } else {
                  stackIn_57_3 = 1;
                }
                ((ffa) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_57_3, gqa.a(var7, (byte) 24, var8), gqa.a(var6, (byte) 24, var8), 0);
              }}
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
          return -114;
        }
        return 26;
    }

    final static boolean b(int param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        if (param1 != 8) {
          return true;
        }
        stackIn_7_0 = (bqa.a(540800, param0, param2)) || (no.a(param2, param0, param1 ^ 36872));
        return stackIn_7_0;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) -128, this.field_q, 2);
          param1.a((byte) 44, this.field_r, 4);
          param1.a((byte) -128, this.field_p, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "th.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        int var3 = 118 / ((param0 + 45) / 59);
        this.field_q = param1;
    }

    th(la param0, boolean param1) {
        super(param0, param1);
        this.field_r = 2;
        this.field_q = 2;
        this.field_p = 1;
        this.field_v = new pc();
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
          this.field_q = 53;
          return true;
        }
        return true;
    }

    static {
        field_u = "Loading extra data";
        field_s = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_o = new up(4, 50);
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
