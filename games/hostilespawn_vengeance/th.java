/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends le {
    le field_Ib;
    static int[] field_Fb;
    static int[] field_Jb;
    static int field_Lb;
    static bd[] field_Hb;
    le field_Kb;
    private pb field_Gb;
    private pb field_Mb;

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        be.field_g = null;
        ce.field_e = 0;
        db.field_o = null;
        var2 = mb.field_p;
        if (param0 > 120) {
          L0: {
            mb.field_p = hn.field_a;
            if ((param1 ^ -1) == -52) {
              ig.field_N.field_e = 2;
              break L0;
            } else {
              if ((param1 ^ -1) != -51) {
                ig.field_N.field_e = 1;
                break L0;
              } else {
                ig.field_N.field_e = 5;
                break L0;
              }
            }
          }
          L1: {
            hn.field_a = var2;
            ig.field_N.field_k = ig.field_N.field_k + 1;
            if (2 > ig.field_N.field_k) {
              break L1;
            } else {
              if (-52 != (param1 ^ -1)) {
                break L1;
              } else {
                return 2;
              }
            }
          }
          L2: {
            if (2 > ig.field_N.field_k) {
              break L2;
            } else {
              if ((param1 ^ -1) == -51) {
                return 5;
              } else {
                break L2;
              }
            }
          }
          if (4 <= ig.field_N.field_k) {
            return 1;
          } else {
            return -1;
          }
        } else {
          return -96;
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        if (param0 >= -110) {
            return;
        }
        this.a(this.field_Kb.field_sb, this.field_Kb.field_qb, param1, (byte) 58, param2, param3);
    }

    final static fn a(int param0, byte[] param1) {
        fn var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        Object stackIn_2_0 = null;
        fn stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new fn(param1, field_Jb, nh.field_O, sf.field_X, hd.field_r, ja.field_e);
                uj.d(-63);
                if (param0 == -5427) {
                  break L1;
                } else {
                  var3 = (String) null;
                  th.a((gb) null, 13, (String) null, (gb) null, (String) null);
                  break L1;
                }
              }
              stackIn_6_0 = (fn) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("th.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fn) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void d(byte param0) {
        field_Jb = null;
        field_Fb = null;
        field_Hb = null;
        if (param0 != 16) {
            th.d((byte) -46);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          this.field_Kb.field_qb = this.field_qb;
          this.field_Ib.field_tb = 0;
          this.field_Kb.field_sb = this.field_sb;
          this.field_Ib.field_zb = 0;
          this.field_Gb.b(110);
          this.field_Mb.b(115);
          var5 = 30 / ((param2 - -45) / 56);
          if (this.field_Kb.field_qb >= this.field_Ib.field_qb) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (this.field_Kb.field_sb >= this.field_Ib.field_sb) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = stackIn_6_0;
            if (var4 == 0) {
              break L3;
            } else {
              if (var6 != 0) {
                this.a(false, this.field_Mb);
                this.a(false, this.field_Gb);
                this.field_Kb.field_qb = this.field_Kb.field_qb - (param1 + param0);
                this.field_Kb.field_sb = this.field_Kb.field_sb - (param1 + param0);
                this.field_Mb.a(this.field_sb - param0, this.field_qb + -param0, param0, 99, 0);
                this.field_Mb.b(this.field_Kb.field_qb, this.field_Ib.field_qb, -this.field_Ib.field_tb, false);
                this.field_Gb.a(0, param0, -param0 + this.field_sb, -13, this.field_qb + -param0);
                this.field_Gb.b(this.field_Kb.field_sb, this.field_Ib.field_sb, -this.field_Ib.field_zb, false);
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (var4 != 0) {
            this.a(false, this.field_Mb);
            this.field_Kb.field_sb = this.field_Kb.field_sb - (param0 - -param1);
            this.field_Mb.a(-param0 + this.field_sb, this.field_qb, param0, 104, 0);
            this.field_Mb.b(this.field_Kb.field_qb, this.field_Ib.field_qb, -this.field_Ib.field_tb, false);
            break L2;
          } else {
            if (var6 == 0) {
              break L2;
            } else {
              this.a(false, this.field_Gb);
              this.field_Kb.field_qb = this.field_Kb.field_qb - (param0 + param1);
              this.field_Gb.a(0, param0, this.field_sb, 127, -param0 + this.field_qb);
              this.field_Gb.b(this.field_Kb.field_sb, this.field_Ib.field_sb, -this.field_Ib.field_zb, false);
              break L2;
            }
          }
        }
    }

    th(long param0, le param1, le param2, pb param3) {
        super(param0, (le) null);
        try {
            this.field_Kb = new le(0L, param2);
            this.field_Gb = new pb(0L, param3, true);
            this.field_Mb = new pb(0L, param3, false);
            this.a(false, this.field_Kb);
            this.a(false, this.field_Gb);
            this.a(false, this.field_Mb);
            this.field_Ib = param1;
            this.field_Kb.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "th.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static nc a(gb param0, int param1, String param2, gb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        nc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0.a((byte) -2, param4);
            var6 = -53 / ((param1 - -52) / 49);
            var7 = param0.a(var5_int, param2, -1);
            stackIn_1_0 = cj.a(param3, 7844, var7, param0, var5_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("th.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, boolean param5) {
        int var8;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_Gb.i(4308)) {
            this.field_Ib.field_z = this.field_Ib.field_z + param4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 > 10) {
            break L1;
          } else {
            field_Lb = 108;
            break L1;
          }
        }
        L2: {
          if (!this.field_Gb.g(122)) {
            break L2;
          } else {
            this.field_Ib.field_z = this.field_Ib.field_z - param4;
            break L2;
          }
        }
        L3: {
          if (this.field_Gb.h(-1)) {
            this.field_Ib.field_z = this.field_Ib.field_z + param1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_Gb.e((byte) 112)) {
            this.field_Ib.field_z = this.field_Ib.field_z - param1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (this.field_Mb.i(4308)) {
            this.field_Ib.field_ib = this.field_Ib.field_ib + param4;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (this.field_Mb.g(126)) {
            this.field_Ib.field_ib = this.field_Ib.field_ib - param4;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (!this.field_Mb.h(-1)) {
            break L7;
          } else {
            this.field_Ib.field_ib = this.field_Ib.field_ib + param0;
            break L7;
          }
        }
        L8: {
          if (this.field_Mb.e((byte) 63)) {
            this.field_Ib.field_ib = this.field_Ib.field_ib - param0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (this.field_S) {
            if (this.field_Kb.field_sb <= this.field_Ib.field_sb) {
              this.field_Ib.field_z = this.field_Ib.field_z - param2;
              break L9;
            } else {
              this.field_Ib.field_ib = this.field_Ib.field_ib - param2;
              break L9;
            }
          } else {
            break L9;
          }
        }
        L10: {
          if (param5) {
            L11: {
              if (-(this.field_Ib.field_z + this.field_Ib.field_zb) < 0) {
                this.field_Ib.field_z = -this.field_Ib.field_zb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (-1 >= (-(this.field_Ib.field_ib + this.field_Ib.field_tb) ^ -1)) {
                break L12;
              } else {
                this.field_Ib.field_ib = -this.field_Ib.field_tb;
                break L12;
              }
            }
            L13: {
              if (this.field_Ib.field_sb + (this.field_Ib.field_N + -this.field_Kb.field_sb) >= -(this.field_Ib.field_zb - -this.field_Ib.field_z)) {
                break L13;
              } else {
                this.field_Ib.field_z = -this.field_Ib.field_zb + -(-this.field_Kb.field_sb + (this.field_Ib.field_N + this.field_Ib.field_sb));
                break L13;
              }
            }
            if (this.field_Ib.field_X + this.field_Ib.field_qb + -this.field_Kb.field_qb < -(this.field_Ib.field_ib + this.field_Ib.field_tb)) {
              this.field_Ib.field_ib = -(this.field_Ib.field_qb - -this.field_Ib.field_X - this.field_Kb.field_qb) - this.field_Ib.field_tb;
              break L10;
            } else {
              break L10;
            }
          } else {
            L14: {
              if (-this.field_Kb.field_sb + this.field_Ib.field_sb - -this.field_Ib.field_N < -(this.field_Ib.field_z + this.field_Ib.field_zb)) {
                this.field_Ib.field_z = -this.field_Ib.field_zb + -(this.field_Ib.field_sb - (-this.field_Ib.field_N - -this.field_Kb.field_sb));
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-(this.field_Ib.field_zb - -this.field_Ib.field_z) >= 0) {
                break L15;
              } else {
                this.field_Ib.field_z = -this.field_Ib.field_zb;
                break L15;
              }
            }
            L16: {
              if (this.field_Ib.field_X + this.field_Ib.field_qb + -this.field_Kb.field_qb >= -(this.field_Ib.field_ib + this.field_Ib.field_tb)) {
                break L16;
              } else {
                this.field_Ib.field_ib = -(-this.field_Kb.field_qb + this.field_Ib.field_qb - -this.field_Ib.field_X) + -this.field_Ib.field_tb;
                break L16;
              }
            }
            if ((-(this.field_Ib.field_ib + this.field_Ib.field_tb) ^ -1) > -1) {
              this.field_Ib.field_ib = -this.field_Ib.field_tb;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L17: {
          if (this.field_Gb.d((byte) -124)) {
            this.field_Ib.field_zb = -this.field_Gb.a(this.field_Ib.field_sb, param5, this.field_Kb.field_sb, 101);
            this.field_Ib.field_z = 0;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if (this.field_Mb.d((byte) -128)) {
            this.field_Ib.field_tb = -this.field_Mb.b(this.field_Ib.field_qb, param5, 121, this.field_Kb.field_qb);
            this.field_Ib.field_ib = 0;
            break L18;
          } else {
            break L18;
          }
        }
        this.field_Gb.b(this.field_Kb.field_sb, this.field_Ib.field_sb, -this.field_Ib.field_zb, false);
        this.field_Mb.b(this.field_Kb.field_qb, this.field_Ib.field_qb, -this.field_Ib.field_tb, false);
    }

    static {
        field_Fb = new int[]{40, 3, 30, 0, 30, 50, 6, 50};
        field_Lb = 0;
    }
}
