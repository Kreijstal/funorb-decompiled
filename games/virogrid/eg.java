/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends in {
    static String field_t;
    private int[] field_w;
    private int[] field_q;
    static int field_l;
    static String field_G;
    private i field_x;
    private int field_r;
    private sc field_B;
    static String field_z;
    private sc field_E;
    static String field_p;
    private int field_v;
    private sc field_u;
    private int field_k;
    private i field_A;
    static String field_s;
    private int field_C;
    private boolean field_n;
    private boolean field_o;
    private i field_m;
    static int field_y;
    static String field_F;

    final static km d(int param0) {
        if (param0 != 1048576) {
          return (km) null;
        }
        return hj.c(112);
    }

    final static void a(int param0, int param1, boolean param2) {
        dj var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        gh var3 = gk.a((byte) -100, param0, param2);
        dj var4Lifetime1;
        if (param1 > -16) {
          field_G = (String) null;
        }
        if (var3 != null) {
          md.field_e.a(false, (byte) -99);
          var4 = md.field_e;
          var5_ref_String = hm.field_a;
          var4.field_a.a(1, var5_ref_String, 5);
          var4Lifetime1 = md.field_e;
          var5 = ii.field_b;
          var6 = a.field_y;
          var4Lifetime1.field_a.a(0, 0, 0, var5, var6);
        }
        qm.a(param0, param2, (byte) 115);
    }

    private final void a(int param0, byte param1, int param2, i param3) {
        try {
          param3.a(param0, true, -1);
          param3.c(-128, param2);
          if (param1 > -85) {
            eg.b((byte) -72);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "eg.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 68) {
          field_F = (String) null;
        }
        this.field_C = param1;
    }

    final static mg a(int param0, byte param1, int param2) {
        int var5 = Virogrid.field_F ? 1 : 0;
        mg var6 = new mg(param0, param0);
        mg var3 = var6;
        int var4 = 0;
        if (param1 > 13) {
          while (var3.field_B.length > var4) {
            var6.field_B[var4] = param2;
            var4++;
          }
          return var3;
        }
        return (mg) null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
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
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_C <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_n) {
            if (this.field_r > 0 &&
              !this.field_A.d(115)) {
              this.field_B = null;
              this.field_n = false;
              this.field_r = -this.field_r;
            } else {
              if (this.field_r < 0 &&
                !this.field_x.d(111)) {
                this.field_r = -this.field_r;
                this.field_u = null;
                this.field_n = false;
              }
            }
          }
          var4_int = (this.field_k >> 12) * this.field_C / 256;
          var5 = -var4_int + this.field_C;
          if (this.field_r != 0) {
            this.field_k = this.field_k + this.field_r * param2;
            if (1048576 > this.field_k) {
              if (this.field_k <= 0) {
                this.field_k = 0;
                if (!this.field_n) {
                  this.field_r = 0;
                  if (!this.field_o) {
                    if (null != this.field_B) {
                      this.field_A.c(false);
                    }
                    this.field_B = null;
                  }
                }
              }
            } else {
              this.field_k = 1048576;
              if (!this.field_n) {
                this.field_r = 0;
                if (!this.field_o) {
                  if (this.field_u != null) {
                    this.field_x.c(false);
                  }
                  this.field_u = null;
                }
              }
            }
          }
          if (!ua.field_q) {
            stackIn_32_0 = param2;
          } else {
            stackIn_32_0 = param2 << 1;
          }
          var6 = stackIn_32_0;
          if (this.field_v < 256 && (this.field_B != null ||
            this.field_u != null)) {
            if (var4_int != 256) {
              if (256 != var5) {
                if (null != this.field_w &&
                  this.field_w.length >= var6) {
                  ek.a(this.field_w, 0, var6);
                  ek.a(this.field_q, 0, var6);
                } else {
                  this.field_q = new int[var6];
                  this.field_w = new int[var6];
                }
                this.field_A.b(this.field_w, 0, param2);
                this.field_x.b(this.field_q, 0, param2);
                if (!ua.field_q) {
                  stackIn_47_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_47_0 = localTemp$0;
                }
                var7 = stackIn_47_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_q[var8] + var4_int * this.field_w[var8] >> 8);
                }
              } else {
                this.field_x.b(param0, param1, param2);
              }
            } else {
              this.field_A.b(param0, param1, param2);
            }
          }
          if (this.field_E != null &&
            this.field_v != 0) {
            if (this.field_w != null &&
              this.field_w.length >= var6) {
              ek.a(this.field_w, 0, var6);
            } else {
              this.field_q = new int[var6];
              this.field_w = new int[var6];
            }
            this.field_m.b(this.field_w, 0, param2);
            if (!ua.field_q) {
              stackIn_60_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_60_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_60_0;
            var8Lifetime1 = this.field_v * this.field_C / 256;
            var9 = -var8Lifetime1 + this.field_C;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = param0[var7Lifetime1 + var10] * var9 + var8Lifetime1 * this.field_w[var10] >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_66_0 = var4;
          stackIn_66_1 = new StringBuilder().append("eg.A(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 47) {
          return true;
        }
        return rk.field_f;
    }

    final in b() {
        return null;
    }

    final in c() {
        return null;
    }

    final synchronized int d() {
        return 2;
    }

    final static wf a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          int var4_int = 0;
          RuntimeException var4 = null;
          Class var5 = null;
          Throwable var5_ref = null;
          wf var6 = null;
          gd var6_ref = null;
          wf stackIn_2_0 = null;
          gd stackIn_4_0 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            var4_int = -32 % ((param3 + 6) / 37);
            try {
              var5 = Class.forName("n");
              var6 = (wf) (var5.newInstance());
              var6.a(param2, param1, (byte) -56, param0);
              stackIn_2_0 = var6;
              return stackIn_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = decompiledCaughtException;
              var6_ref = new gd();
              ((wf) ((Object) var6_ref)).a(param2, param1, (byte) -66, param0);
              stackIn_4_0 = var6_ref;
              return (wf) ((Object) stackIn_4_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var4;
            stackIn_7_1 = new StringBuilder().append("eg.F(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_t = null;
        field_G = null;
        if (param0 >= -43) {
          return;
        }
        field_z = null;
        field_s = null;
        field_F = null;
        field_p = null;
    }

    final synchronized void a(sc param0, int param1, int param2, boolean param3, int param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_33_0 = 0;
        i stackIn_41_0 = null;
        boolean stackIn_42_1 = false;
        i stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          if (this.field_n &&
            param3) {
            if (this.field_r <= 0) {
              if (this.field_u != null) {
                this.field_x.c(false);
              }
              this.field_u = param0;
              if (param0 != null) {
                this.field_x.a(false, 37, param0);
                this.a(param1, (byte) -108, param4, this.field_x);
              }
            } else {
              if (this.field_B != null) {
                this.field_A.c(false);
              }
              this.field_B = param0;
              if (param0 != null) {
                this.field_A.a(false, 37, param0);
                this.a(param1, (byte) -107, param4, this.field_A);
              }
            }
            return;
          }
          stackIn_19_1 = (param3);
          this.field_n = stackIn_19_1;
          if (param5 <= 119) {
            return;
          }
          if (this.field_B == param0) {
            this.field_r = param2;
            this.a(param1, (byte) -116, param4, this.field_A);
            return;
          }
          if (param0 == this.field_u) {
            this.field_r = -param2;
            this.a(param1, (byte) -93, param4, this.field_x);
            return;
          }
          if (null != this.field_B) {
            if (null == this.field_u) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_k >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (null != this.field_B) {
              this.field_A.c(false);
            }
            this.field_B = param0;
            if (param0 != null) {
              stackIn_51_0 = this.field_A;
              stackIn_52_1 = !(param3);
              ((i) (Object) stackIn_51_0).a(stackIn_52_1, 37, param0);
              this.a(param1, (byte) -86, param4, this.field_A);
            }
            this.field_r = param2;
          } else {
            if (null != this.field_u) {
              this.field_x.c(false);
            }
            this.field_u = param0;
            if (param0 != null) {
              stackIn_41_0 = this.field_x;
              stackIn_42_1 = !(param3);
              ((i) (Object) stackIn_41_0).a(stackIn_42_1, 37, param0);
              this.a(param1, (byte) -124, param4, this.field_x);
            }
            this.field_r = -param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("eg.Q(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 > -53) {
          field_l = -55;
        }
        stackIn_7_0 = (j.field_l >= 10) && (!oi.field_d) && (!wl.b((byte) -119));
        return stackIn_7_0;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (this.field_k > 0 &&
          this.field_B != null) {
          this.field_A.a(param0);
        }
        if (1048576 > this.field_k &&
          null != this.field_u) {
          this.field_x.a(param0);
        }
        if (0 < this.field_v &&
          null != this.field_E) {
          this.field_m.a(param0);
        }
        if (this.field_n) {
          if (0 < this.field_r &&
            !this.field_A.d(121)) {
            this.field_r = -this.field_r;
            this.field_B = null;
            this.field_n = false;
          } else {
            if (this.field_r < 0 &&
              !this.field_x.d(122)) {
              this.field_n = false;
              this.field_r = -this.field_r;
              this.field_u = null;
            }
          }
        }
        if (this.field_r != 0) {
          this.field_k = this.field_k + param0 * this.field_r;
          if (1048576 <= this.field_k) {
            this.field_k = 1048576;
            if (!this.field_n) {
              this.field_r = 0;
              if (!this.field_o) {
                if (this.field_u != null) {
                  this.field_x.c(false);
                }
                this.field_u = null;
              }
            }
          } else {
            if (this.field_k <= 0) {
              this.field_k = 0;
              if (!this.field_n) {
                this.field_r = 0;
                if (!this.field_o) {
                  if (this.field_B != null) {
                    this.field_A.c(false);
                  }
                  this.field_B = null;
                }
              }
            }
          }
        }
    }

    private eg() throws Throwable {
        throw new Error();
    }

    static {
        field_t = "Day";
        field_p = "<%0> has entered another game.";
        field_z = "You can ask to join this game";
        field_G = "Staff impersonation";
        field_s = "Checking";
        field_y = 2;
        field_F = "There are no valid types of game that match your preferences.";
    }
}
