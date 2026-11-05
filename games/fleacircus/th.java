/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sh {
    static volatile int field_s;
    static String[] field_m;
    private ei field_o;
    private boolean field_B;
    private int field_u;
    private ei field_C;
    private wk field_y;
    private wk field_F;
    static int field_n;
    private ei field_t;
    private int field_E;
    static int field_D;
    private int field_A;
    private int field_x;
    private int[] field_p;
    private wk field_r;
    static mf field_z;
    private int[] field_q;
    static dd[] field_v;
    private boolean field_w;

    private final void a(byte param0, int param1, int param2, ei param3) {
        param3.a(param2, true, -1);
        if (param0 < 16) {
          return;
        }
        try {
          param3.a((byte) -49, param1);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "th.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(wk param0, int param1, int param2, boolean param3, int param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_33_0 = 0;
        ei stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        ei stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (this.field_B &&
            param3) {
            if (this.field_u > 0) {
              if (this.field_F != null) {
                this.field_C.e(-398);
              }
              this.field_F = param0;
              if (param0 != null) {
                this.field_C.a(false, param2 + 524395, param0);
                this.a((byte) 87, param1, param5, this.field_C);
              }
            } else {
              if (this.field_r != null) {
                this.field_o.e(-398);
              }
              this.field_r = param0;
              if (param0 != null) {
                this.field_o.a(false, 64, param0);
                this.a((byte) 64, param1, param5, this.field_o);
              }
            }
            return;
          }
          stackIn_19_1 = (param3);
          this.field_B = stackIn_19_1;
          if (param0 == this.field_F) {
            this.field_u = param4;
            this.a((byte) 72, param1, param5, this.field_C);
            return;
          }
          if (param0 == this.field_r) {
            this.field_u = -param4;
            this.a((byte) 57, param1, param5, this.field_o);
            return;
          }
          if (param2 != -524289) {
            this.field_r = (wk) null;
          }
          if (null != this.field_F) {
            if (this.field_r == null) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_E >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (this.field_F != null) {
              this.field_C.e(-398);
            }
            this.field_F = param0;
            if (param0 != null) {
              stackIn_51_0 = this.field_C;
              stackIn_52_1 = !(param3);
              ((ei) (Object) stackIn_51_0).a(stackIn_52_1, 101, param0);
              this.a((byte) 79, param1, param5, this.field_C);
            }
            this.field_u = param4;
          } else {
            if (this.field_r != null) {
              this.field_o.e(-398);
            }
            this.field_r = param0;
            if (param0 != null) {
              stackIn_42_0 = this.field_o;
              stackIn_43_1 = !(param3);
              ((ei) (Object) stackIn_42_0).a(stackIn_43_1, param2 + 524353, param0);
              this.a((byte) 104, param1, param5, this.field_o);
            }
            this.field_u = -param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("th.F(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_z = null;
        if (param0) {
          field_D = -86;
        }
        field_v = null;
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final sh d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = fleas.field_A ? 1 : 0;
        try {
          if (0 >= this.field_x) {
            this.a(param2);
            return;
          }
          if (this.field_B) {
            if (this.field_u > 0 &&
              !this.field_C.d(31499)) {
              this.field_F = null;
              this.field_B = false;
              this.field_u = -this.field_u;
            } else {
              if (0 > this.field_u &&
                !this.field_o.d(31499)) {
                this.field_B = false;
                this.field_u = -this.field_u;
                this.field_r = null;
              }
            }
          }
          var4_int = this.field_x * (this.field_E >> 12) / 256;
          var5 = this.field_x - var4_int;
          if (0 != this.field_u) {
            this.field_E = this.field_E + param2 * this.field_u;
            if (this.field_E < 1048576) {
              if (0 >= this.field_E) {
                this.field_E = 0;
                if (!this.field_B) {
                  this.field_u = 0;
                  if (!this.field_w) {
                    if (this.field_F != null) {
                      this.field_C.e(-398);
                    }
                    this.field_F = null;
                  }
                }
              }
            } else {
              this.field_E = 1048576;
              if (!this.field_B) {
                this.field_u = 0;
                if (!this.field_w) {
                  if (this.field_r != null) {
                    this.field_o.e(-398);
                  }
                  this.field_r = null;
                }
              }
            }
          }
          if (la.field_h) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (this.field_A < 256 && (this.field_F != null ||
            this.field_r != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (this.field_q != null &&
                  var6 <= this.field_q.length) {
                  dm.a(this.field_q, 0, var6);
                  dm.a(this.field_p, 0, var6);
                } else {
                  this.field_p = new int[var6];
                  this.field_q = new int[var6];
                }
                this.field_C.b(this.field_q, 0, param2);
                this.field_o.b(this.field_p, 0, param2);
                if (!la.field_h) {
                  stackIn_49_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_49_0 = localTemp$0;
                }
                var7 = stackIn_49_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_q[var8] + this.field_p[var8] * var5 >> 8);
                }
              } else {
                this.field_o.b(param0, param1, param2);
              }
            } else {
              this.field_C.b(param0, param1, param2);
            }
          }
          if (this.field_y != null) {
            if (this.field_A == 0) {
              return;
            }
            if (null != this.field_q &&
              this.field_q.length >= var6) {
              dm.a(this.field_q, 0, var6);
            } else {
              this.field_q = new int[var6];
              this.field_p = new int[var6];
            }
            this.field_t.b(this.field_q, 0, param2);
            if (la.field_h) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            } else {
              stackIn_63_0 = param1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_A * this.field_x / 256;
            var9 = -var8Lifetime1 + this.field_x;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = param0[var10 + var7Lifetime1] * var9 + this.field_q[var10] * var8Lifetime1 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("th.G(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, byte param1) {
        this.field_x = param0;
        if (param1 <= 2) {
          this.field_E = -91;
        }
    }

    final sh c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = fleas.field_A ? 1 : 0;
        if (this.field_E > 0) {
          if (this.field_F != null) {
            this.field_C.a(param0);
            if (this.field_E >= 1048576) {
              if ((!(0 >= this.field_A)) &&
                ((null != this.field_y))) {
                this.field_t.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_r == null) {
                if ((!(0 >= this.field_A)) &&
                  ((null != this.field_y))) {
                  this.field_t.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_o.a(param0);
              }
            }
          } else {
            if (this.field_E >= 1048576) {
              if ((!(0 >= this.field_A)) &&
                ((null != this.field_y))) {
                this.field_t.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_r == null) {
                if ((!(0 >= this.field_A)) &&
                  ((null != this.field_y))) {
                  this.field_t.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_o.a(param0);
              }
            }
          }
        } else {
          if (this.field_E >= 1048576) {
            if ((!(0 >= this.field_A)) &&
              ((null != this.field_y))) {
              this.field_t.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_r == null) {
              if ((!(0 >= this.field_A)) &&
                ((null != this.field_y))) {
                this.field_t.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_o.a(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (0 < this.field_A &&
          null != this.field_y)) {
          this.field_t.a(param0);
        }
        if (this.field_B) {
          if (this.field_u > 0 &&
            !this.field_C.d(31499)) {
            this.field_u = -this.field_u;
            this.field_F = null;
            this.field_B = false;
          } else {
            if (this.field_u < 0 &&
              !this.field_o.d(31499)) {
              this.field_B = false;
              this.field_r = null;
              this.field_u = -this.field_u;
            }
          }
        }
        if (this.field_u != 0) {
          this.field_E = this.field_E + param0 * this.field_u;
          if (1048576 <= this.field_E) {
            this.field_E = 1048576;
            if (!this.field_B) {
              this.field_u = 0;
              if (!this.field_w) {
                if (null != this.field_r) {
                  this.field_o.e(-398);
                }
                this.field_r = null;
              }
            }
          } else {
            if (this.field_E <= 0) {
              this.field_E = 0;
              if (!this.field_B) {
                this.field_u = 0;
                if (!this.field_w) {
                  if (this.field_F != null) {
                    this.field_C.e(-398);
                  }
                  this.field_F = null;
                }
              }
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = 0;
        field_n = 0;
        field_D = 256;
        field_v = new dd[50];
    }
}
