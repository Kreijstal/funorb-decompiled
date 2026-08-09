/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class il extends jl {
    private oa field_ab;
    private int field_jb;
    private vg field_ib;
    private int field_db;
    static bi field_gb;
    private int field_Z;
    static String field_fb;
    static ob field_kb;
    static a field_bb;
    static String field_Y;
    static String field_lb;
    private int field_mb;
    private int field_X;
    static String field_hb;
    private cg field_eb;
    static float field_cb;

    private final void a(int param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == this.field_eb) {
                break L1;
              } else {
                this.field_eb.b((byte) -124);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                param1.a(6 + this.field_db, param1.field_n, (byte) 121, 6, param1.field_x);
                this.field_eb = new cg(param1);
                break L2;
              } else {
                this.field_eb = new cg();
                break L2;
              }
            }
            this.b((byte) -97, this.field_eb);
            this.field_ib = null;
            if (param0 <= -5) {
              break L0;
            } else {
              this.k(-80);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("il.WB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    il(tc param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_x, param1.field_n + param2 + 12);
        try {
            this.field_db = param2;
            this.field_mb = param4;
            this.field_jb = param3;
            this.field_X = param3;
            this.a(-75, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (this.field_eb == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param0) {
                      break L2;
                    } else {
                      this.field_eb.a((byte) -60, param3);
                      break L2;
                    }
                  }
                  if (param0 != 99) {
                    break L1;
                  } else {
                    this.field_eb.a((byte) -23, param3);
                    return false;
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("il.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void h(byte param0) {
        if (param0 != 88) {
          il.h((byte) -12);
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        } else {
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        }
    }

    final void g(byte param0) {
        if (this.field_ab == gs.field_j) {
          return;
        } else {
          this.field_Z = 0;
          this.field_ab = je.field_a;
          if (param0 > -100) {
            return;
          } else {
            this.a(-125, this.field_ib);
            this.field_eb.field_J = 0;
            this.field_ib = null;
            return;
          }
        }
    }

    boolean a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_ab) {
          if (gs.field_j != this.field_ab) {
            if (this.field_ab == je.field_a) {
              fieldTemp$2 = this.field_Z + 1;
              this.field_Z = this.field_Z + 1;
              if (fieldTemp$2 != this.field_jb) {
                this.field_eb.field_J = (this.field_Z << 1306723848) / this.field_jb;
                var2 = -108 % ((param0 - -23) / 52);
                return super.a((byte) 81);
              } else {
                this.field_eb.field_J = 256;
                this.field_ab = null;
                var2 = -108 % ((param0 - -23) / 52);
                return super.a((byte) 81);
              }
            } else {
              var2 = -108 % ((param0 - -23) / 52);
              return super.a((byte) 81);
            }
          } else {
            fieldTemp$3 = this.field_Z + 1;
            this.field_Z = this.field_Z + 1;
            if (this.field_X == fieldTemp$3) {
              this.field_ab = hd.field_s;
              this.b(-127, this.field_mb, 12 - -this.field_ib.field_x, this.field_ib.field_n + this.field_db + 12);
              this.field_Z = 0;
              this.field_eb.field_J = 0;
              var2 = -108 % ((param0 - -23) / 52);
              return super.a((byte) 81);
            } else {
              this.field_eb.field_J = -((this.field_Z << 1400059496) / this.field_X) + 256;
              var2 = -108 % ((param0 - -23) / 52);
              return super.a((byte) 81);
            }
          }
        } else {
          var2 = -108 % ((param0 - -23) / 52);
          return super.a((byte) 81);
        }
    }

    void b(vg param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 87 / ((51 - param1) / 57);
            this.field_ib = param0;
            if (hd.field_s != this.field_ab) {
              if (gs.field_j == this.field_ab) {
                break L0;
              } else {
                this.field_ab = gs.field_j;
                this.field_Z = 0;
                return;
              }
            } else {
              this.b(-55, this.field_mb, this.field_ib.field_x + 12, this.field_ib.field_n + this.field_db + 12);
              this.field_Z = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("il.AB(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void n(int param0) {
        if (null != this.field_ab) {
            if (!(this.field_ab == je.field_a)) {
                this.b(12 - -this.field_db + this.field_ib.field_n, 12 - -this.field_ib.field_x, (byte) -109);
                this.a(-107, this.field_ib);
            }
            this.field_eb.field_J = 256;
            this.field_ab = null;
        }
        super.n(param0);
    }

    final static void a(int param0, int param1, int param2, bi param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ra.field_a) {
                  break L2;
                } else {
                  if (ra.field_a.length == gf.field_b) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ra.field_a = new int[gf.field_b];
              break L1;
            }
            var4_int = param2 & 15;
            param2 = param2 >> 4;
            var5 = param0 & 15;
            param0 = param0 >> 4;
            var12 = param1;
            var13 = param3.field_z * param2 + param0;
            var14 = -gf.field_b + param3.field_z;
            var15 = -gf.field_k;
            L3: while (true) {
              if (0 <= var15) {
                break L0;
              } else {
                var16 = 0;
                var17 = -1 + gf.field_b;
                L4: while (true) {
                  if (0 > var17) {
                    var15++;
                    var13 = var13 + var14;
                    continue L3;
                  } else {
                    var6 = param3.field_B[var13];
                    var8 = var6 & 65280;
                    var7 = var6 & 16711935;
                    var10 = 267390960 & var5 * var7;
                    var11 = var5 * var8 & 1044480;
                    var9 = var11 | var10;
                    var8 = var16 + var9;
                    var7 = 267390960 & var8;
                    var16 = (var6 << -313753724) - var9;
                    var6 = var8 & 1044480;
                    var10 = -16711936 & var4_int * var7;
                    var11 = 16711680 & var6 * var4_int;
                    var9 = var10 | var11;
                    gf.field_h[var12] = ra.field_a[var17] + var9 >> -810457816;
                    ra.field_a[var17] = (var8 << -1124030076) - var9;
                    var12++;
                    var13++;
                    var17--;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("il.VB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final boolean k(int param0) {
        if (param0 != 0) {
            return true;
        }
        this.n(7489);
        return super.k(0);
    }

    static {
        field_fb = "Kick <%0> from this game";
        field_gb = null;
        field_lb = "Click to stop building fleets in this territory.";
        field_hb = "Accept NAP";
        field_Y = "WAITING FOR 1 PLAYER.";
    }
}
