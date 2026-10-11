/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends kl implements vb {
    int field_Z;
    int field_L;
    static String field_S;
    private boolean field_Y;
    private ag field_H;
    static String field_I;
    private boolean field_Q;
    private se field_db;
    private int field_V;
    private int field_bb;
    private ag field_cb;
    static String[][] field_P;
    static int field_M;
    private int field_W;
    private ag field_R;
    private ag field_O;
    int field_T;
    private int field_J;
    private boolean field_X;
    private int field_eb;
    static int field_N;
    static int field_U;
    private ag field_ab;

    private final void a(int param0, int param1) {
        this.a((byte) -6, param1);
        if (this.field_o instanceof qh) {
          ((qh) (this.field_o)).a(this.field_L, this.field_L, this, false);
        }
        if (param0 == -780737471) {
          return;
        }
        this.field_W = 73;
    }

    private final void a(int param0, boolean param1) {
        ag stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        ag stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        ag stackIn_18_0 = null;
        boolean stackIn_21_1 = false;
        ag stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        ag stackIn_31_0 = null;
        boolean stackIn_32_1 = false;
        ag stackIn_39_0 = null;
        boolean stackIn_41_1 = false;
        ag stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        ag stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        ag stackIn_62_0 = null;
        boolean stackIn_64_1 = false;
        ag stackIn_69_0 = null;
        boolean stackIn_70_1 = false;
        ag stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        stackIn_39_0 = this.field_cb;
        if (param1) {
          stackIn_41_1 = true;
        } else {
          if (this.field_Y) {
            stackIn_39_0.field_B = true;
            boolean decompiledFrameRemainder1 = true;
            if (this.field_db.field_B instanceof ag) {
              stackIn_18_0 = (ag) (this.field_db.field_B);
              if (param1) {
                stackIn_18_0.field_B = true;
                if (null != this.field_O) {
                  stackIn_8_0 = this.field_O;
                  stackIn_9_1 = (!param1) ? false : true;
                  stackIn_8_0.field_B = stackIn_9_1;
                }
                if (null != this.field_H) {
                  stackIn_13_0 = this.field_H;
                  stackIn_14_1 = (!param1) ? false : true;
                  stackIn_13_0.field_B = stackIn_14_1;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_21_1 = (!this.field_Y) ? false : true;
                stackIn_18_0.field_B = stackIn_21_1;
              }
            }
            if (decompiledFrameRemainder1) {
              if (null != this.field_O) {
                stackIn_26_0 = this.field_O;
                stackIn_27_1 = (!param1) ? false : true;
                stackIn_26_0.field_B = stackIn_27_1;
              }
              if (null == this.field_H) {
                if (param0 == 0) {
                  return;
                }
                field_N = -32;
                return;
              }
              stackIn_31_0 = this.field_H;
              stackIn_32_1 = (!param1) ? false : true;
              stackIn_31_0.field_B = stackIn_32_1;
            }
            if (param0 != 0) {
              field_N = -32;
            }
            return;
          }
          stackIn_41_1 = false;
        }
        stackIn_39_0.field_B = stackIn_41_1;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_db.field_B instanceof ag) {
          stackIn_62_0 = (ag) (this.field_db.field_B);
          if (param1) {
            stackIn_64_1 = true;
          } else {
            if (this.field_Y) {
              stackIn_62_0.field_B = true;
              if (null != this.field_O) {
                stackIn_48_0 = this.field_O;
                stackIn_49_1 = (!param1) ? false : true;
                stackIn_48_0.field_B = stackIn_49_1;
              }
              if (null != this.field_H) {
                stackIn_53_0 = this.field_H;
                stackIn_54_1 = (!param1) ? false : true;
                stackIn_53_0.field_B = stackIn_54_1;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_64_1 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_62_0.field_B = stackIn_64_1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (null != this.field_O) {
            stackIn_69_0 = this.field_O;
            stackIn_70_1 = (!param1) ? false : true;
            stackIn_69_0.field_B = stackIn_70_1;
          }
          if (null != this.field_H) {
            stackIn_74_0 = this.field_H;
            stackIn_75_1 = (!param1) ? false : true;
            stackIn_74_0.field_B = stackIn_75_1;
          }
        }
        if (param0 == 0) {
          return;
        }
        field_N = -32;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param1 <= param0) {
          this.field_db.a(this.field_db.field_k, this.field_db.field_j, this.field_cb.field_v, this.field_db.field_n, -68);
          this.a(0, false);
          var4 = 44 / ((param2 - 86) / 32);
          this.g(-1844589680);
          return;
        }
        var4Lifetime1 = this.field_cb.field_v * param0 / param1;
        if (var4Lifetime1 < this.field_W) {
          var4Lifetime1 = this.field_W;
        }
        this.field_db.a(this.field_db.field_k, this.field_db.field_j, var4Lifetime1, this.field_db.field_n, -121);
        this.a(0, true);
        var4Lifetime2 = 44 / ((param2 - 86) / 32);
        this.g(-1844589680);
    }

    final boolean a(int param0, qm param1) {
        se var3 = null;
        RuntimeException var3_ref = null;
        qm var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_db;
          if (param0 != 0) {
            var4 = (qm) null;
            this.a((qm) null, 32, -61, -41);
          }
          if (var3 != null &&
            ((qm) ((Object) var3)).a(0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (param2 < param0) {
          var4 = param2 * this.field_cb.field_k / param0;
          if (var4 < this.field_J) {
            var4 = this.field_J;
          }
          this.field_db.a(var4, this.field_db.field_j, this.field_db.field_v, this.field_db.field_n, -125);
          this.b(8, true);
          this.h((byte) -128);
          if (param1 != -42) {
            ma.h(-40);
            return;
          }
          return;
        }
        this.field_db.a(this.field_cb.field_k, this.field_db.field_j, this.field_db.field_v, this.field_db.field_n, -54);
        this.b(8, false);
        this.h((byte) -128);
        if (param1 != -42) {
          ma.h(-40);
          return;
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.a(param0, (byte) -127, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.field_db = (se) null;
          }
          if (this.field_X) {
            if (!this.field_db.d(-2116)) {
              return false;
            }
            if (98 == param3) {
              this.a(-780737471, this.field_L - this.field_T);
              return true;
            }
            if (param3 == 99) {
              this.a(-780737471, this.field_L + this.field_T);
              return true;
            }
            if (param3 == 96) {
              this.b((byte) -125, this.field_Z - this.field_eb);
              return true;
            }
            if (97 == param3) {
              this.b((byte) -128, this.field_Z + this.field_eb);
              return true;
            }
            if (param3 == 104) {
              this.a(-780737471, this.field_L - this.i((byte) 107));
              return true;
            }
            if (param3 == 105) {
              this.a(-780737471, this.field_L + this.i((byte) 110));
              return true;
            }
            if (param3 != 102) {
              if (param3 == 103) {
                if (this.field_Y &&
                  ri.field_b[82]) {
                  this.a(-780737471, 65536);
                  return true;
                }
                if (this.field_Q) {
                  this.b((byte) -124, 65536);
                  return true;
                }
              }
            } else {
              if (this.field_Y &&
                ri.field_b[82]) {
                this.a(-780737471, 0);
                return true;
              }
              if (this.field_Q) {
                this.b((byte) -125, 0);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_50_0 = var5;
          stackIn_50_1 = new StringBuilder().append("ma.N(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if ((!(this.field_db.field_B instanceof ag) ||
            ((ag) (this.field_db.field_B)).field_B) && this.field_db.field_t == 1) {
            if (!this.field_Q) {
              this.g(-1844589680);
            } else {
              var5_int = this.field_Z;
              this.f(0);
              if (var5_int != this.field_Z &&
                this.field_o instanceof qh) {
                ((qh) (this.field_o)).a(14372, this.field_Z, this.field_Z, this);
              }
            }
            if (this.field_Y) {
              var5_intLifetime2 = this.field_L;
              this.j((byte) -91);
              if (var5_intLifetime2 != this.field_L &&
                this.field_o instanceof qh) {
                ((qh) (this.field_o)).a(param2 + 14202, this.field_Z, this.field_L, this);
              }
            } else {
              this.h((byte) -128);
            }
          }
          if (this.field_cb.field_B &&
            this.field_cb.field_F == 1) {
            if (!this.field_Y) {
              if (this.field_Q) {
                if (an.field_g > param1 - (-this.field_db.field_n - (this.field_db.field_v >> 1))) {
                  this.b((byte) -125, this.field_Z + this.field_V);
                } else {
                  this.b((byte) -127, -this.field_V + this.field_Z);
                }
              }
            } else {
              if (!this.field_Q) {
                if (me.field_I > (this.field_db.field_k >> 1) + param3 + this.field_db.field_j) {
                  this.a(param2 - 780737641, this.field_bb + this.field_L);
                } else {
                  this.a(param2 - 780737641, -this.field_bb + this.field_L);
                }
              } else {
                var5_intLifetime1 = -this.field_n + (an.field_g - param1) + (-(this.field_db.field_v >> 1) - this.field_db.field_n);
                var6 = me.field_I - param3 - (this.field_j - (-this.field_db.field_j - (this.field_db.field_k >> 1)));
                if (Math.abs(var6) <= Math.abs(var5_intLifetime1)) {
                  if (var5_intLifetime1 <= 0) {
                    this.b((byte) -126, -this.field_V + this.field_Z);
                  } else {
                    this.b((byte) -124, this.field_Z + this.field_V);
                  }
                } else {
                  if (0 >= var6) {
                    this.a(-780737471, -this.field_bb + this.field_L);
                  } else {
                    this.a(param2 - 780737641, this.field_bb + this.field_L);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("ma.E(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        ag stackIn_8_0 = null;
        ag stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        ag stackIn_18_0 = null;
        boolean stackIn_21_1 = false;
        ag stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        ag stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        ag stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        ag stackIn_44_0 = null;
        boolean stackIn_46_1 = false;
        ag stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        ag stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        ag stackIn_67_0 = null;
        boolean stackIn_68_1 = false;
        ag stackIn_72_0 = null;
        boolean stackIn_74_1 = false;
        ag stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        ag stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        ag stackIn_92_0 = null;
        boolean stackIn_93_1 = false;
        stackIn_44_0 = this.field_cb;
        if (param1) {
          stackIn_46_1 = true;
        } else {
          if (this.field_Q) {
            stackIn_44_0.field_B = true;
            if (this.field_db.field_B instanceof ag) {
              stackIn_18_0 = (ag) (this.field_db.field_B);
              if (param1) {
                stackIn_18_0.field_B = true;
                if (this.field_ab != null) {
                  stackIn_8_0 = this.field_ab;
                  stackIn_8_0.field_B = true;
                }
                if (param0 != 8) {
                  return;
                }
                if (null != this.field_R) {
                  stackIn_13_0 = this.field_R;
                  stackIn_14_1 = (!param1) ? false : true;
                  stackIn_13_0.field_B = stackIn_14_1;
                }
                return;
              }
              stackIn_21_1 = (!this.field_Q) ? false : true;
              stackIn_18_0.field_B = stackIn_21_1;
            }
            if (this.field_ab == null) {
              if (param0 != 8) {
                return;
              }
              if (null != this.field_R) {
                stackIn_27_0 = this.field_R;
                stackIn_28_1 = (!param1) ? false : true;
                stackIn_27_0.field_B = stackIn_28_1;
              }
              return;
            }
            stackIn_34_0 = this.field_ab;
            stackIn_35_1 = (!param1) ? false : true;
            stackIn_34_0.field_B = stackIn_35_1;
            if (param0 != 8) {
              return;
            }
            if (null != this.field_R) {
              stackIn_39_0 = this.field_R;
              stackIn_40_1 = (!param1) ? false : true;
              stackIn_39_0.field_B = stackIn_40_1;
            }
            return;
          }
          stackIn_46_1 = false;
        }
        stackIn_44_0.field_B = stackIn_46_1;
        if (this.field_db.field_B instanceof ag) {
          stackIn_72_0 = (ag) (this.field_db.field_B);
          if (param1) {
            stackIn_74_1 = true;
          } else {
            if (this.field_Q) {
              stackIn_72_0.field_B = true;
              if (this.field_ab == null) {
                if (param0 != 8) {
                  return;
                }
                if (null != this.field_R) {
                  stackIn_67_0 = this.field_R;
                  stackIn_68_1 = (!param1) ? false : true;
                  stackIn_67_0.field_B = stackIn_68_1;
                }
                return;
              }
              stackIn_53_0 = this.field_ab;
              stackIn_54_1 = (!param1) ? false : true;
              stackIn_53_0.field_B = stackIn_54_1;
              if (param0 != 8) {
                return;
              }
              if (null != this.field_R) {
                stackIn_58_0 = this.field_R;
                stackIn_59_1 = (!param1) ? false : true;
                stackIn_58_0.field_B = stackIn_59_1;
              }
              return;
            }
            stackIn_74_1 = false;
          }
          stackIn_72_0.field_B = stackIn_74_1;
        }
        if (this.field_ab == null) {
          if (param0 != 8) {
            return;
          }
          if (null != this.field_R) {
            stackIn_92_0 = this.field_R;
            stackIn_93_1 = (!param1) ? false : true;
            stackIn_92_0.field_B = stackIn_93_1;
          }
          return;
        }
        stackIn_78_0 = this.field_ab;
        stackIn_79_1 = (!param1) ? false : true;
        stackIn_78_0.field_B = stackIn_79_1;
        if (param0 != 8) {
          return;
        }
        if (null != this.field_R) {
          stackIn_83_0 = this.field_R;
          stackIn_84_1 = (!param1) ? false : true;
          stackIn_83_0.field_B = stackIn_84_1;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 0) {
          var2 = null != this.field_O ? this.field_O.field_n + this.field_O.field_v : this.field_cb.field_n;
          var3 = this.field_H == null ? this.field_cb.field_v + (this.field_cb.field_n - this.field_db.field_v) : -this.field_db.field_v + this.field_H.field_n;
          this.b(1, var2 >= var3 ? 0 : (this.field_db.field_n - var2 << 16) / (var3 - var2));
          return;
        }
        ma.h(62);
        var2Lifetime1 = null != this.field_O ? this.field_O.field_n + this.field_O.field_v : this.field_cb.field_n;
        var3Lifetime1 = this.field_H == null ? this.field_cb.field_v + (this.field_cb.field_n - this.field_db.field_v) : -this.field_db.field_v + this.field_H.field_n;
        this.b(1, var2Lifetime1 >= var3Lifetime1 ? 0 : (this.field_db.field_n - var2Lifetime1 << 16) / (var3Lifetime1 - var2Lifetime1));
    }

    ma(int param0, int param1, int param2, int param3, pf param4, pf param5, pf param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        se dupTemp$0 = null;
        ag dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_Z = 32768;
        this.field_L = 32768;
        this.field_bb = 8192;
        this.field_V = 8192;
        this.field_W = 0;
        this.field_eb = 1024;
        this.field_T = 1024;
        this.field_J = 0;
        this.field_X = true;
        try {
          this.field_z = new qm[6];
          dupTemp$0 = new se(param0, param1, param7, param8, (pf) null, (wc) null, new ag(0, 0, param7, param8, param6, (wc) null), false, false);
          this.field_db = dupTemp$0;
          this.field_z[0] = (qm) ((Object) dupTemp$0);
          dupTemp$1 = new ag(param0, param1, param7, param8, param5, (wc) null);
          this.field_cb = dupTemp$1;
          this.field_z[1] = (qm) ((Object) dupTemp$1);
          stackIn_4_1 = (param11);
          this.field_Q = stackIn_4_1;
          this.field_J = param10;
          stackIn_7_1 = (param12);
          this.field_Y = stackIn_7_1;
          this.field_W = param9;
          this.b(1, param13);
          this.a((byte) -6, param14);
          this.a(param3, param1, param2, param0, -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("ma.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    final void e(int param0) {
        int var3;
        qm var4;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 17) {
          var4 = (qm) null;
          this.a(11, (qm) null);
        }
        if (this.field_O == null) {
          this.field_cb.field_n = 0;
        } else {
          this.field_O.field_n = 0;
          this.field_O.field_j = this.field_k - this.field_O.field_k >> 1;
          this.field_cb.field_n = this.field_O.field_n + this.field_O.field_v;
        }
        if (null == this.field_H) {
          this.field_cb.field_v = -this.field_cb.field_n + this.field_v;
          this.g(-1844589680);
          if (this.field_ab != null) {
            this.field_ab.field_j = 0;
            this.field_ab.field_n = -this.field_ab.field_v + this.field_v >> 1;
            this.field_cb.field_j = this.field_ab.field_k + this.field_ab.field_j;
          } else {
            this.field_cb.field_j = 0;
          }
        } else {
          this.field_H.field_j = this.field_k - this.field_H.field_k >> 1;
          this.field_H.field_n = -this.field_H.field_v + this.field_v;
          this.field_cb.field_v = -this.field_H.field_v - this.field_cb.field_n + this.field_v;
          this.g(-1844589680);
          if (this.field_ab == null) {
            this.field_cb.field_j = 0;
          } else {
            this.field_ab.field_j = 0;
            this.field_ab.field_n = -this.field_ab.field_v + this.field_v >> 1;
            this.field_cb.field_j = this.field_ab.field_k + this.field_ab.field_j;
          }
        }
        if (null != this.field_R) {
          this.field_R.field_j = this.field_k - this.field_R.field_k;
          this.field_R.field_n = this.field_v - this.field_R.field_v >> 1;
          this.field_cb.field_k = this.field_k - (this.field_cb.field_j + this.field_R.field_k);
        } else {
          this.field_cb.field_k = -this.field_cb.field_j + this.field_k;
        }
        this.h((byte) 43);
        if (!this.field_Q) {
          this.field_db.field_v = this.field_cb.field_v;
          this.field_db.field_n = 0;
        }
        if (!this.field_Y) {
          this.field_db.field_k = this.field_cb.field_k;
          this.field_db.field_j = 0;
        }
        this.field_db.e((byte) 127);
    }

    private final void b(int param0, int param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 1) {
          this.field_V = -24;
          if (param1 < 0) {
            this.field_Z = 0;
            this.g(param0 - 1844589681);
            return;
          }
          if (param1 <= 65536) {
            this.field_Z = param1;
            this.g(param0 - 1844589681);
            return;
          }
          this.field_Z = 65536;
          this.g(param0 - 1844589681);
          return;
        }
        if (param1 < 0) {
          this.field_Z = 0;
          this.g(param0 - 1844589681);
          return;
        }
        if (param1 <= 65536) {
          this.field_Z = param1;
          this.g(param0 - 1844589681);
          return;
        }
        this.field_Z = 65536;
        this.g(param0 - 1844589681);
    }

    public static void g(byte param0) {
        field_S = null;
        field_P = (String[][]) null;
        field_I = null;
        if (param0 != 54) {
          String var2 = (String) null;
          ma.a((String) null, 123, (byte) 33);
        }
    }

    final static gl[] a(byte param0, ab param1) {
        gl[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        gl[] var4 = null;
        int var5 = 0;
        gl var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var5Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.d(28089, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.d(28089, 12);
          var4 = new gl[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (hd.a(param1, (byte) 112)) {
              var6 = new gl();
              param1.d(28089, 24);
              param1.d(28089, 24);
              var6.field_e = param1.d(28089, 24);
              param1.d(28089, 9);
              param1.d(28089, 12);
              param1.d(28089, 12);
              param1.d(28089, 12);
              var4[var5] = var6;
            } else {
              var6_int = param1.d(28089, fj.a(-1 + var5, 29797));
              var4[var5] = var4[var6_int];
            }
          }
          var5Lifetime1 = 64 % ((param0 + 32) / 54);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ma.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        if (param0 <= -123) {
          this.b(1, param1);
          if (this.field_o instanceof qh) {
            ((qh) (this.field_o)).a(this.field_L, this.field_Z, this, false);
          }
          return;
        }
    }

    private final void g(int param0) {
        int var3 = 0;
        int var2 = null != this.field_O ? this.field_O.field_v + this.field_O.field_n : this.field_cb.field_n;
        int var3Lifetime1;
        if (param0 == -1844589680) {
          var3 = this.field_H != null ? this.field_H.field_n - this.field_db.field_v : this.field_cb.field_n - (-this.field_cb.field_v + this.field_db.field_v);
          this.field_db.field_n = var2 + (this.field_Z * (var3 - var2) >> 16);
          return;
        }
        this.field_db = (se) null;
        var3Lifetime1 = this.field_H != null ? this.field_H.field_n - this.field_db.field_v : this.field_cb.field_n - (-this.field_cb.field_v + this.field_db.field_v);
        this.field_db.field_n = var2 + (this.field_Z * (var3Lifetime1 - var2) >> 16);
    }

    final static void a(String param0, int param1, byte param2) {
        rb var3 = null;
        if (param2 > -27) {
          return;
        }
        try {
          var3 = new rb(param0, param1);
          pb.field_m.b(var3, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ma.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void h(byte param0) {
        int var2 = 14 / ((-59 - param0) / 62);
        int var3 = null == this.field_ab ? this.field_cb.field_j : this.field_ab.field_k + this.field_ab.field_j;
        int var4 = null == this.field_R ? -this.field_db.field_k + (this.field_cb.field_k + this.field_cb.field_j) : this.field_R.field_j - this.field_db.field_k;
        this.field_db.field_j = (this.field_L * (-var3 + var4) >> 16) + var3;
    }

    final static void i(int param0) {
        if (param0 < 74) {
          return;
        }
        dk.a(true, 14067);
    }

    final static void h(int param0) {
        int var1 = 39 / ((62 - param0) / 49);
        if (vf.field_k != null) {
          vf.field_k.h(77);
        }
        oa.field_c = new sn();
        g.field_e.a((byte) -92, (qm) (oa.field_c));
    }

    final void a(byte param0, int param1) {
        qm var5 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        qm var5Lifetime1;
        qm var5Lifetime2;
        if (param1 >= 0) {
          if (param1 > 65536) {
            this.field_L = 65536;
            this.h((byte) -126);
            if (param0 != -6) {
              var5 = (qm) null;
              this.a((qm) null, (byte) -4, 'i', 61);
              return;
            }
            return;
          }
          this.field_L = param1;
          this.h((byte) -126);
          if (param0 != -6) {
            var5Lifetime2 = (qm) null;
            this.a((qm) null, (byte) -4, 'i', 61);
            return;
          }
          return;
        }
        this.field_L = 0;
        this.h((byte) -126);
        if (param0 == -6) {
          return;
        }
        var5Lifetime1 = (qm) null;
        this.a((qm) null, (byte) -4, 'i', 61);
    }

    private final int i(byte param0) {
        if (param0 > 104) {
          return (this.field_db.field_k << 16) / this.field_cb.field_k;
        }
        this.j((byte) 97);
        return (this.field_db.field_k << 16) / this.field_cb.field_k;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        qm var8 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 == 1 &&
            this.field_X) {
            if (this.field_Y &&
              param4 == this.field_ab) {
              this.a(-780737471, this.field_L - this.field_T);
            } else {
              if (this.field_Y &&
                param4 == this.field_R) {
                this.a(-780737471, this.field_L + this.field_T);
              } else {
                if (this.field_Q &&
                  this.field_O == param4) {
                  this.b((byte) -128, -this.field_eb + this.field_Z);
                } else {
                  if (this.field_Q &&
                    param4 == this.field_H) {
                    this.b((byte) -125, this.field_eb + this.field_Z);
                  }
                }
              }
            }
          }
          if (!param0) {
            var8 = (qm) null;
            this.a((qm) null, -20, 39, 69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ma.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        int var2 = null != this.field_ab ? this.field_ab.field_j + this.field_ab.field_k : this.field_cb.field_j;
        int var3 = this.field_R == null ? this.field_cb.field_k + this.field_cb.field_j - this.field_db.field_k : this.field_R.field_j - this.field_db.field_k;
        int var4 = 19 % ((param0 - 4) / 50);
        this.a((byte) -6, var2 < var3 ? (-var2 + this.field_db.field_j << 16) / (var3 - var2) : 0);
    }

    static {
        field_I = "Reading Book of Cogs";
        field_S = "Arrows:";
        field_U = 0;
        field_N = 360;
    }
}
