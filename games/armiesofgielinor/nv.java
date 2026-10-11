/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nv extends hs implements he {
    private fw field_U;
    private fw field_P;
    private fw field_Z;
    static String field_bb;
    private boolean field_M;
    private boolean field_N;
    private int field_K;
    int field_T;
    int field_Q;
    private int field_L;
    int field_W;
    static String field_J;
    private int field_X;
    private int field_S;
    private wc field_O;
    private boolean field_V;
    private fw field_ab;
    private int field_R;
    private fw field_Y;

    private final void b(byte param0, boolean param1) {
        fw stackIn_8_0 = null;
        fw stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        fw stackIn_19_0 = null;
        boolean stackIn_22_1 = false;
        fw stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        fw stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        fw stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        fw stackIn_47_0 = null;
        boolean stackIn_49_1 = false;
        fw stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        fw stackIn_62_0 = null;
        boolean stackIn_63_1 = false;
        fw stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        fw stackIn_77_0 = null;
        boolean stackIn_79_1 = false;
        fw stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        fw stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        fw stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        stackIn_47_0 = this.field_P;
        if (param1) {
          stackIn_49_1 = true;
        } else {
          if (this.field_V) {
            stackIn_47_0.field_I = true;
            if (this.field_O.field_E instanceof fw) {
              stackIn_19_0 = (fw) (this.field_O.field_E);
              if (param1) {
                stackIn_19_0.field_I = true;
                if (this.field_Z != null) {
                  stackIn_8_0 = this.field_Z;
                  stackIn_8_0.field_I = true;
                }
                if (param0 <= 123) {
                  return;
                }
                if (this.field_ab != null) {
                  stackIn_14_0 = this.field_ab;
                  stackIn_15_1 = (!param1) ? false : true;
                  stackIn_14_0.field_I = stackIn_15_1;
                }
                return;
              }
              stackIn_22_1 = (!this.field_V) ? false : true;
              stackIn_19_0.field_I = stackIn_22_1;
            }
            if (this.field_Z == null) {
              if (param0 <= 123) {
                return;
              }
              if (this.field_ab != null) {
                stackIn_29_0 = this.field_ab;
                stackIn_30_1 = (!param1) ? false : true;
                stackIn_29_0.field_I = stackIn_30_1;
              }
              return;
            }
            stackIn_36_0 = this.field_Z;
            stackIn_37_1 = (!param1) ? false : true;
            stackIn_36_0.field_I = stackIn_37_1;
            if (param0 <= 123) {
              return;
            }
            if (this.field_ab != null) {
              stackIn_42_0 = this.field_ab;
              stackIn_43_1 = (!param1) ? false : true;
              stackIn_42_0.field_I = stackIn_43_1;
            }
            return;
          }
          stackIn_49_1 = false;
        }
        stackIn_47_0.field_I = stackIn_49_1;
        if (this.field_O.field_E instanceof fw) {
          stackIn_77_0 = (fw) (this.field_O.field_E);
          if (param1) {
            stackIn_79_1 = true;
          } else {
            if (this.field_V) {
              stackIn_77_0.field_I = true;
              if (this.field_Z == null) {
                if (param0 <= 123) {
                  return;
                }
                if (this.field_ab != null) {
                  stackIn_72_0 = this.field_ab;
                  stackIn_73_1 = (!param1) ? false : true;
                  stackIn_72_0.field_I = stackIn_73_1;
                }
                return;
              }
              stackIn_56_0 = this.field_Z;
              stackIn_57_1 = (!param1) ? false : true;
              stackIn_56_0.field_I = stackIn_57_1;
              if (param0 <= 123) {
                return;
              }
              if (this.field_ab != null) {
                stackIn_62_0 = this.field_ab;
                stackIn_63_1 = (!param1) ? false : true;
                stackIn_62_0.field_I = stackIn_63_1;
              }
              return;
            }
            stackIn_79_1 = false;
          }
          stackIn_77_0.field_I = stackIn_79_1;
        }
        if (this.field_Z == null) {
          if (param0 <= 123) {
            return;
          }
          if (this.field_ab != null) {
            stackIn_99_0 = this.field_ab;
            stackIn_100_1 = (!param1) ? false : true;
            stackIn_99_0.field_I = stackIn_100_1;
          }
          return;
        }
        stackIn_83_0 = this.field_Z;
        stackIn_84_1 = (!param1) ? false : true;
        stackIn_83_0.field_I = stackIn_84_1;
        if (param0 <= 123) {
          return;
        }
        if (this.field_ab != null) {
          stackIn_89_0 = this.field_ab;
          stackIn_90_1 = (!param1) ? false : true;
          stackIn_89_0.field_I = stackIn_90_1;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.a(param0, param1, param2, param3 ^ 0)) {
            return true;
          }
          if (this.field_N &&
            this.field_O.a(false)) {
            if (98 == param1) {
              this.d(this.field_W - this.field_Q, 0);
              return true;
            }
            if (param1 == 99) {
              this.d(this.field_Q + this.field_W, 0);
              return true;
            }
            if (96 == param1) {
              this.a(this.field_T - this.field_K, (byte) 125);
              return true;
            }
            if (param1 == 97) {
              this.a(this.field_T + this.field_K, (byte) 111);
              return true;
            }
            if (param1 == 104) {
              this.d(this.field_W - this.b(true), 0);
              return true;
            }
            if (param1 == 105) {
              this.d(this.field_W + this.b(true), 0);
              return true;
            }
            if (param1 == 102) {
              if (this.field_M &&
                br.field_f[82]) {
                this.d(0, param3 ^ -12215);
                return true;
              }
              if (this.field_V) {
                this.a(0, (byte) 48);
                return true;
              }
            } else {
              if (param1 == 103) {
                if (this.field_M &&
                  br.field_f[82]) {
                  this.d(65536, param3 + 12215);
                  return true;
                }
                if (this.field_V) {
                  this.a(65536, (byte) 117);
                  return true;
                }
              }
            }
          }
          if (param3 == -12215) {
            return false;
          }
          field_bb = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_49_0 = var5;
          stackIn_49_1 = new StringBuilder().append("nv.F(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    nv(int param0, int param1, int param2, int param3, kh param4, kh param5, kh param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        wc dupTemp$0 = null;
        fw dupTemp$1 = null;
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
        this.field_N = true;
        this.field_K = 1024;
        this.field_L = 0;
        this.field_Q = 1024;
        this.field_T = 32768;
        this.field_W = 32768;
        this.field_X = 0;
        this.field_R = 8192;
        this.field_S = 8192;
        try {
          this.field_C = new kb[6];
          dupTemp$0 = new wc(param0, param1, param7, param8, (kh) null, (qo) null, new fw(0, 0, param7, param8, param6, (qo) null), false, false);
          this.field_O = dupTemp$0;
          this.field_C[0] = (kb) ((Object) dupTemp$0);
          dupTemp$1 = new fw(param0, param1, param7, param8, param5, (qo) null);
          this.field_P = dupTemp$1;
          this.field_C[1] = (kb) ((Object) dupTemp$1);
          stackIn_4_1 = (param12);
          this.field_M = stackIn_4_1;
          this.field_X = param9;
          this.field_L = param10;
          stackIn_7_1 = (param11);
          this.field_V = stackIn_7_1;
          this.e(-86, param13);
          this.a((byte) -123, param14);
          this.a(param0, param2, param1, 8192, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("nv.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    private final void n(int param0) {
        int var3 = 0;
        int var2 = this.field_Z == null ? this.field_P.field_p : this.field_Z.field_p + this.field_Z.field_w;
        if (param0 == 16695) {
          var3 = this.field_ab != null ? -this.field_O.field_w + this.field_ab.field_p : -this.field_O.field_w + this.field_P.field_p + this.field_P.field_w;
          this.field_O.field_p = var2 + ((-var2 + var3) * this.field_W >> 16);
          return;
        }
    }

    final boolean a(int param0, kb param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11) {
            return false;
          }
          var3 = this.field_O;
          if (var3 != null &&
            ((kb) ((Object) var3)).a(param0 ^ 0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("nv.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 < 0) {
          this.field_W = 0;
          if (param0 != -123) {
            this.field_R = -68;
            this.n(16695);
            return;
          }
          this.n(16695);
          return;
        }
        if (param1 > 65536) {
          this.field_W = 65536;
          if (param0 != -123) {
            this.field_R = -68;
            this.n(16695);
            return;
          }
          this.n(16695);
          return;
        }
        this.field_W = param1;
        if (param0 == -123) {
          this.n(16695);
          return;
        }
        this.field_R = -68;
        this.n(16695);
    }

    final static boolean c(int param0, int param1) {
        if (param0 != 0) {
          nv.l(106);
          if (!(param1 < bw.unitDefinitions.length)) {
            return false;
          }
          return 3 == bw.unitDefinitions[param1][0] ? true : false;
        }
        if (!(param1 < bw.unitDefinitions.length)) {
          return false;
        }
        return 3 == bw.unitDefinitions[param1][0] ? true : false;
    }

    private final void e(int param0, int param1) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = 123 % ((param0 - 2) / 56);
        if (param1 < 0) {
          this.field_T = 0;
          this.m(1681504464);
          return;
        }
        if (param1 > 65536) {
          this.field_T = 65536;
          this.m(1681504464);
          return;
        }
        this.field_T = param1;
        this.m(1681504464);
    }

    final void a(int param0, int param1, int param2, kb param3) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          if ((!(this.field_O.field_E instanceof fw) ||
            ((fw) (this.field_O.field_E)).field_I) && this.field_O.field_q == 1) {
            if (this.field_V) {
              var5_int = this.field_T;
              this.k(115);
              if (this.field_T != var5_int &&
                this.field_x instanceof jw) {
                ((jw) (this.field_x)).a(this.field_T, this.field_T, (byte) -39, this);
              }
            } else {
              this.m(1681504464);
            }
            if (this.field_M) {
              var5_intLifetime2 = this.field_W;
              this.j(0);
              if (this.field_W != var5_intLifetime2 &&
                this.field_x instanceof jw) {
                ((jw) (this.field_x)).a(this.field_T, this.field_W, (byte) -39, this);
              }
            } else {
              this.n(16695);
            }
          }
          if (this.field_P.field_I &&
            this.field_P.field_G == 1) {
            if (this.field_M) {
              if (this.field_V) {
                var5_intLifetime1 = -this.field_B - param1 + (AiPlanningStrategy.field_d - (this.field_O.field_B + (this.field_O.field_l >> 1)));
                var6 = -param2 + ko.field_b - (this.field_p + this.field_O.field_p + (this.field_O.field_w >> 1));
                if (Math.abs(var6) > Math.abs(var5_intLifetime1)) {
                  if (0 < var6) {
                    this.d(this.field_R + this.field_W, param0 ^ 32722);
                  } else {
                    this.d(-this.field_R + this.field_W, 0);
                  }
                } else {
                  if (var5_intLifetime1 <= 0) {
                    this.a(this.field_T - this.field_S, (byte) 117);
                  } else {
                    this.a(this.field_T + this.field_S, (byte) 101);
                  }
                }
              } else {
                if ((this.field_O.field_w >> 1) + (param2 + this.field_O.field_p) >= ko.field_b) {
                  this.d(-this.field_R + this.field_W, param0 ^ 32722);
                } else {
                  this.d(this.field_R + this.field_W, 0);
                }
              }
            } else {
              if (this.field_V) {
                if (param1 + (this.field_O.field_B + (this.field_O.field_l >> 1)) >= AiPlanningStrategy.field_d) {
                  this.a(this.field_T - this.field_S, (byte) 84);
                } else {
                  this.a(this.field_T + this.field_S, (byte) 110);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("nv.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        fw stackIn_8_0 = null;
        fw stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        fw stackIn_18_0 = null;
        boolean stackIn_21_1 = false;
        fw stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        fw stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        fw stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        fw stackIn_45_0 = null;
        boolean stackIn_47_1 = false;
        fw stackIn_54_0 = null;
        boolean stackIn_55_1 = false;
        fw stackIn_59_0 = null;
        boolean stackIn_60_1 = false;
        fw stackIn_68_0 = null;
        boolean stackIn_69_1 = false;
        fw stackIn_74_0 = null;
        boolean stackIn_76_1 = false;
        fw stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        fw stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        fw stackIn_95_0 = null;
        boolean stackIn_96_1 = false;
        stackIn_45_0 = this.field_P;
        if (param1) {
          stackIn_47_1 = true;
        } else {
          if (this.field_M) {
            stackIn_45_0.field_I = true;
            if (this.field_O.field_E instanceof fw) {
              stackIn_18_0 = (fw) (this.field_O.field_E);
              if (param1) {
                stackIn_18_0.field_I = true;
                if (null != this.field_U) {
                  stackIn_8_0 = this.field_U;
                  stackIn_8_0.field_I = true;
                }
                if (this.field_Y != null) {
                  stackIn_13_0 = this.field_Y;
                  stackIn_14_1 = (!param1) ? false : true;
                  stackIn_13_0.field_I = stackIn_14_1;
                }
                if (param0 != 11) {
                  this.field_K = 42;
                }
                return;
              }
              stackIn_21_1 = (!this.field_M) ? false : true;
              stackIn_18_0.field_I = stackIn_21_1;
            }
            if (null == this.field_U) {
              if (this.field_Y != null) {
                stackIn_27_0 = this.field_Y;
                stackIn_28_1 = (!param1) ? false : true;
                stackIn_27_0.field_I = stackIn_28_1;
              }
              if (param0 != 11) {
                this.field_K = 42;
              }
              return;
            }
            stackIn_34_0 = this.field_U;
            stackIn_35_1 = (!param1) ? false : true;
            stackIn_34_0.field_I = stackIn_35_1;
            if (this.field_Y != null) {
              stackIn_39_0 = this.field_Y;
              stackIn_40_1 = (!param1) ? false : true;
              stackIn_39_0.field_I = stackIn_40_1;
            }
            if (param0 == 11) {
              return;
            }
            this.field_K = 42;
            return;
          }
          stackIn_47_1 = false;
        }
        stackIn_45_0.field_I = stackIn_47_1;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_O.field_E instanceof fw) {
          stackIn_74_0 = (fw) (this.field_O.field_E);
          if (param1) {
            stackIn_76_1 = true;
          } else {
            if (this.field_M) {
              stackIn_74_0.field_I = true;
              if (null == this.field_U) {
                if (this.field_Y != null) {
                  stackIn_68_0 = this.field_Y;
                  stackIn_69_1 = (!param1) ? false : true;
                  stackIn_68_0.field_I = stackIn_69_1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_54_0 = this.field_U;
                stackIn_55_1 = (!param1) ? false : true;
                stackIn_54_0.field_I = stackIn_55_1;
                if (this.field_Y != null) {
                  stackIn_59_0 = this.field_Y;
                  stackIn_60_1 = (!param1) ? false : true;
                  stackIn_59_0.field_I = stackIn_60_1;
                }
                if (param0 != 11) {
                  this.field_K = 42;
                }
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_76_1 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_74_0.field_I = stackIn_76_1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (null == this.field_U) {
            if (this.field_Y != null) {
              stackIn_95_0 = this.field_Y;
              stackIn_96_1 = (!param1) ? false : true;
              stackIn_95_0.field_I = stackIn_96_1;
            }
          } else {
            stackIn_80_0 = this.field_U;
            stackIn_81_1 = (!param1) ? false : true;
            stackIn_80_0.field_I = stackIn_81_1;
            if (this.field_Y != null) {
              stackIn_85_0 = this.field_Y;
              stackIn_86_1 = (!param1) ? false : true;
              stackIn_85_0.field_I = stackIn_86_1;
            }
          }
        }
        if (param0 == 11) {
          return;
        }
        this.field_K = 42;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 == 1 &&
            this.field_N) {
            if (this.field_M &&
              param4 == this.field_Z) {
              this.d(this.field_W - this.field_Q, 0);
            } else {
              if (this.field_M &&
                this.field_ab == param4) {
                this.d(this.field_W + this.field_Q, 0);
              } else {
                if (this.field_V &&
                  this.field_U == param4) {
                  this.a(-this.field_K + this.field_T, (byte) 121);
                } else {
                  if (this.field_V &&
                    this.field_Y == param4) {
                    this.a(this.field_T + this.field_K, (byte) 118);
                  }
                }
              }
            }
          }
          if (param1 != 11) {
            field_bb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("nv.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        if (param0 != -24061) {
          nv.l(-117);
          field_bb = null;
          field_J = null;
          return;
        }
        field_bb = null;
        field_J = null;
    }

    private final void d(int param0, int param1) {
        if (param1 != 0) {
          field_J = (String) null;
          this.a((byte) -123, param0);
          if (this.field_x instanceof jw) {
            ((jw) (this.field_x)).a((byte) -112, this, this.field_W, this.field_W);
            return;
          }
          return;
        }
        this.a((byte) -123, param0);
        if (!(this.field_x instanceof jw)) {
          return;
        }
        ((jw) (this.field_x)).a((byte) -112, this, this.field_W, this.field_W);
    }

    private final void a(int param0, byte param1) {
        if (param1 >= 47) {
          this.e(-114, param0);
          if (this.field_x instanceof jw) {
            ((jw) (this.field_x)).a((byte) -109, this, this.field_W, this.field_T);
          }
          return;
        }
        this.field_P = (fw) null;
        this.e(-114, param0);
        if (this.field_x instanceof jw) {
          ((jw) (this.field_x)).a((byte) -109, this, this.field_W, this.field_T);
        }
    }

    private final int b(boolean param0) {
        if (!param0) {
          return -2;
        }
        return (this.field_O.field_w << 16) / this.field_P.field_w;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (param0 <= param2) {
          this.field_O.a(this.field_O.field_B, this.field_P.field_l, this.field_O.field_p, 8192, this.field_O.field_w);
          this.a((byte) 11, false);
        } else {
          var4 = this.field_P.field_l * param2 / param0;
          if (var4 < this.field_X) {
            var4 = this.field_X;
          }
          this.field_O.a(this.field_O.field_B, var4, this.field_O.field_p, 8192, this.field_O.field_w);
          this.a((byte) 11, true);
        }
        if (param1 == 124) {
          this.m(1681504464);
          return;
        }
    }

    private final void k(int param0) {
        int var2 = null == this.field_U ? this.field_P.field_B : this.field_U.field_l + this.field_U.field_B;
        int var3 = null == this.field_Y ? -this.field_O.field_l + (this.field_P.field_l + this.field_P.field_B) : -this.field_O.field_l + this.field_Y.field_B;
        if (param0 >= 96) {
          this.e(116, var3 > var2 ? (-var2 + this.field_O.field_B << 16) / (-var2 + var3) : 0);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 <= param0) {
          this.field_O.a(this.field_O.field_B, this.field_O.field_l, this.field_O.field_p, 8192, this.field_P.field_w);
          this.b((byte) 124, false);
        } else {
          var4 = param0 * this.field_P.field_w / param2;
          if (this.field_L > var4) {
            var4 = this.field_L;
          }
          this.field_O.a(this.field_O.field_B, this.field_O.field_l, this.field_O.field_p, 8192, var4);
          this.b((byte) 127, true);
        }
        if (param1 == -13127) {
          this.n(16695);
          return;
        }
    }

    private final void j(int param0) {
        int var3 = 0;
        int var2 = null != this.field_Z ? this.field_Z.field_p + this.field_Z.field_w : this.field_P.field_p;
        if (param0 == 0) {
          var3 = this.field_ab != null ? -this.field_O.field_w + this.field_ab.field_p : this.field_P.field_p - (-this.field_P.field_w + this.field_O.field_w);
          this.a((byte) -123, var2 >= var3 ? 0 : (-var2 + this.field_O.field_p << 16) / (-var2 + var3));
          return;
        }
    }

    final void d(byte param0) {
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 < 84) {
          return;
        }
        if (this.field_U == null) {
          this.field_P.field_B = 0;
        } else {
          this.field_U.field_B = 0;
          this.field_U.field_p = this.field_w - this.field_U.field_w >> 1;
          this.field_P.field_B = this.field_U.field_l + this.field_U.field_B;
        }
        if (null == this.field_Y) {
          this.field_P.field_l = -this.field_P.field_B + this.field_l;
          this.m(1681504464);
          if (null == this.field_Z) {
            this.field_P.field_p = 0;
          } else {
            this.field_Z.field_p = 0;
            this.field_Z.field_B = this.field_l - this.field_Z.field_l >> 1;
            this.field_P.field_p = this.field_Z.field_p + this.field_Z.field_w;
          }
          if (this.field_ab == null) {
            this.field_P.field_w = this.field_w - this.field_P.field_p;
          } else {
            this.field_ab.field_B = this.field_l - this.field_ab.field_l >> 1;
            this.field_ab.field_p = this.field_w - this.field_ab.field_w;
            this.field_P.field_w = -this.field_ab.field_w - this.field_P.field_p + this.field_w;
          }
          this.n(16695);
          if (!this.field_M) {
            this.field_O.field_w = this.field_P.field_w;
            this.field_O.field_p = 0;
          }
          if (!this.field_V) {
            this.field_O.field_B = 0;
            this.field_O.field_l = this.field_P.field_l;
          }
          this.field_O.e(0);
          return;
        }
        this.field_Y.field_B = -this.field_Y.field_l + this.field_l;
        this.field_Y.field_p = -this.field_Y.field_w + this.field_w >> 1;
        this.field_P.field_l = -this.field_P.field_B + (this.field_l - this.field_Y.field_l);
        this.m(1681504464);
        if (null != this.field_Z) {
          this.field_Z.field_p = 0;
          this.field_Z.field_B = this.field_l - this.field_Z.field_l >> 1;
          this.field_P.field_p = this.field_Z.field_p + this.field_Z.field_w;
          if (this.field_ab == null) {
            this.field_P.field_w = this.field_w - this.field_P.field_p;
          } else {
            this.field_ab.field_B = this.field_l - this.field_ab.field_l >> 1;
            this.field_ab.field_p = this.field_w - this.field_ab.field_w;
            this.field_P.field_w = -this.field_ab.field_w - this.field_P.field_p + this.field_w;
          }
          this.n(16695);
          if (!this.field_M) {
            this.field_O.field_w = this.field_P.field_w;
            this.field_O.field_p = 0;
          }
          if (!this.field_V) {
            this.field_O.field_B = 0;
            this.field_O.field_l = this.field_P.field_l;
          }
          this.field_O.e(0);
          return;
        }
        this.field_P.field_p = 0;
        if (this.field_ab == null) {
          this.field_P.field_w = this.field_w - this.field_P.field_p;
        } else {
          this.field_ab.field_B = this.field_l - this.field_ab.field_l >> 1;
          this.field_ab.field_p = this.field_w - this.field_ab.field_w;
          this.field_P.field_w = -this.field_ab.field_w - this.field_P.field_p + this.field_w;
        }
        this.n(16695);
        if (!this.field_M) {
          this.field_O.field_w = this.field_P.field_w;
          this.field_O.field_p = 0;
        }
        if (!this.field_V) {
          this.field_O.field_B = 0;
          this.field_O.field_l = this.field_P.field_l;
        }
        this.field_O.e(0);
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 1681504464) {
          var2 = null == this.field_U ? this.field_P.field_B : this.field_U.field_B + this.field_U.field_l;
          var3 = null != this.field_Y ? -this.field_O.field_l + this.field_Y.field_B : this.field_P.field_l + this.field_P.field_B - this.field_O.field_l;
          this.field_O.field_B = var2 + ((-var2 + var3) * this.field_T >> 16);
          return;
        }
        this.field_P = (fw) null;
        var2Lifetime1 = null == this.field_U ? this.field_P.field_B : this.field_U.field_B + this.field_U.field_l;
        var3Lifetime1 = null != this.field_Y ? -this.field_O.field_l + this.field_Y.field_B : this.field_P.field_l + this.field_P.field_B - this.field_O.field_l;
        this.field_O.field_B = var2Lifetime1 + ((-var2Lifetime1 + var3Lifetime1) * this.field_T >> 16);
    }

    static {
        field_J = "Melee weapons are useful in close combat.";
        field_bb = "AnimateStatic";
    }
}
