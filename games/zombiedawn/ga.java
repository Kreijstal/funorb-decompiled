/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ga extends le {
    static int field_q;
    int field_k;
    int field_p;
    int field_j;
    sk field_v;
    int field_m;
    int field_n;
    static int field_r;
    vg field_t;
    io field_h;
    String field_o;
    boolean field_l;
    String field_s;
    int field_u;
    static boolean field_w;
    int field_i;

    void c(byte param0) {
        if (param0 != 57) {
          this.a((ga) null, -6, 18, 10, -10, false, 55);
        }
    }

    boolean a(ga param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5) {
            return false;
          }
          this.field_s = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ga.OA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 67) {
            return false;
          }
          this.field_l = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ga.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param3, 21224, param2, param4, param0)) {
            this.field_m = param5;
          }
          if (param1 == 1) {
            return false;
          }
          this.a((ga) null, 64, -30, -110, -58, false, 34);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ga.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_j).append(" ").append(this.field_i).append("x").append(this.field_n);
          if (null != this.field_o) {
            discarded$1 = param3.append(" text=\"").append(this.field_o).append('"');
          }
          if (this.field_l) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.e(-17741)) {
            discarded$3 = param3.append(" focused");
          }
          if (null != this.field_h) {
            discarded$4 = param3.append(" renderer=");
            if (this.field_h instanceof ga) {
              param3 = this.a(param0, param3, true, param1 + 1);
              if (var6 != 0) {
                discarded$5 = param3.append(this.field_h);
              }
            } else {
              discarded$5 = param3.append(this.field_h);
            }
          }
          if (this.field_v != null) {
            discarded$6 = param3.append(" listener=");
            if (this.field_v instanceof ga) {
              param3 = this.a(param0, param3, true, param1 + 1);
              if (var6 != 0) {
                discarded$7 = param3.append(this.field_v);
              }
            } else {
              discarded$7 = param3.append(this.field_v);
            }
          }
          if (param2 <= 64) {
            this.d(37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ga.UA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        int var5;
        ij var6;
        int var7;
        ij var8;
        ij var9;
        ij var10;
        ij var11;
        ij var12;
        ij var13;
        ij var14;
        ij var15;
        ij var16;
        int var5Lifetime1;
        var7 = ZombieDawn.field_J;
        this.a(this, (byte) 108, param0, param1);
        if (param3) {
          var5 = this.e(-17741) ? 1 : 0;
          if (!param2) {
            if (var5 == 0) {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
            if (0 == ci.field_d) {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
            this.c((byte) 57);
            if (var7 == 0) {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
          }
          if (id.field_I != 0) {
            if (var5 == 0) {
              if (ci.field_d != 0) {
                if (!this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, this)) {
                  if (var5 != 0) {
                    this.c((byte) 57);
                    if (var7 != 0) {
                      param2 = false;
                    }
                  }
                } else {
                  param2 = false;
                }
              }
              if (kc.field_R != 0) {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
              if (0 == he.field_b) {
                he.field_b = kc.field_R;
                og.a(this.d(-58), 0);
                return param2;
              }
              this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
              var8 = np.field_H;
              if (var8 != null) {
                if (var8.field_v instanceof in) {
                  ((in) (var8.field_v)).a(-12156, (rd) null, var8);
                }
                np.field_H = null;
              }
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
            this.a(this, id.field_I, param1, ha.field_b, param0, true, ei.field_K);
          }
          if (ci.field_d != 0) {
            if (this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, this)) {
              param2 = false;
            } else {
              if (var5 != 0) {
                this.c((byte) 57);
                if (var7 != 0) {
                  param2 = false;
                  if (kc.field_R != 0) {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                  if (0 == he.field_b) {
                    he.field_b = kc.field_R;
                    og.a(this.d(-58), 0);
                    return param2;
                  }
                  this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
                  var9 = np.field_H;
                  if (var9 != null) {
                    if (var9.field_v instanceof in) {
                      ((in) (var9.field_v)).a(-12156, (rd) null, var9);
                    }
                    np.field_H = null;
                  }
                  he.field_b = kc.field_R;
                  og.a(this.d(-58), 0);
                  return param2;
                }
              }
            }
          }
          if (kc.field_R != 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          if (0 == he.field_b) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
          var10 = np.field_H;
          if (var10 != null) {
            if (var10.field_v instanceof in) {
              ((in) (var10.field_v)).a(-12156, (rd) null, var10);
            }
            np.field_H = null;
          }
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        this.a(76, 88, -58, 36, -103, -17, (ga) null);
        var5Lifetime1 = this.e(-17741) ? 1 : 0;
        if (!param2) {
          if (var5Lifetime1 == 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          if (0 == ci.field_d) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.c((byte) 57);
          if (var7 == 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
        }
        if (id.field_I != 0) {
          if (var5Lifetime1 == 0) {
            if (ci.field_d != 0 &&
              this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, this)) {
              param2 = false;
            }
            if (kc.field_R != 0) {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
            if (0 == he.field_b) {
              he.field_b = kc.field_R;
              og.a(this.d(-58), 0);
              return param2;
            }
            this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
            var11 = np.field_H;
            var6 = var11;
            if (var11 != null) {
              if (var11.field_v instanceof in) {
                ((in) (var11.field_v)).a(-12156, (rd) null, var11);
              }
              np.field_H = null;
            }
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.a(this, id.field_I, param1, ha.field_b, param0, true, ei.field_K);
        }
        if (ci.field_d == 0) {
          if (kc.field_R != 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          if (0 == he.field_b) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
          var12 = np.field_H;
          if (var12 != null) {
            if (var12.field_v instanceof in) {
              ((in) (var12.field_v)).a(-12156, (rd) null, var12);
            }
            np.field_H = null;
          }
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        if (this.a(nc.field_j, 1, param0, hp.field_D, param1, ci.field_d, this)) {
          param2 = false;
          if (kc.field_R != 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          if (0 == he.field_b) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
          var16 = np.field_H;
          if (var16 != null) {
            if (var16.field_v instanceof in) {
              ((in) (var16.field_v)).a(-12156, (rd) null, var16);
            }
            np.field_H = null;
          }
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        if (var5Lifetime1 == 0) {
          if (kc.field_R != 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          if (0 == he.field_b) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
          var13 = np.field_H;
          if (var13 != null) {
            if (var13.field_v instanceof in) {
              ((in) (var13.field_v)).a(-12156, (rd) null, var13);
            }
            np.field_H = null;
          }
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        this.c((byte) 57);
        if (var7 == 0) {
          if (kc.field_R != 0) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          if (0 == he.field_b) {
            he.field_b = kc.field_R;
            og.a(this.d(-58), 0);
            return param2;
          }
          this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
          var14 = np.field_H;
          if (var14 != null) {
            if (var14.field_v instanceof in) {
              ((in) (var14.field_v)).a(-12156, (rd) null, var14);
            }
            np.field_H = null;
          }
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        param2 = false;
        if (kc.field_R != 0) {
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        if (0 == he.field_b) {
          he.field_b = kc.field_R;
          og.a(this.d(-58), 0);
          return param2;
        }
        this.a(param1, 112, ha.field_b, ei.field_K, param0, this);
        var15 = np.field_H;
        if (var15 != null) {
          if (var15.field_v instanceof in) {
            ((in) (var15.field_v)).a(-12156, (rd) null, var15);
          }
          np.field_H = null;
        }
        he.field_b = kc.field_R;
        og.a(this.d(-58), 0);
        return param2;
    }

    void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        try {
          if (param1 < 1) {
            this.field_v = (sk) null;
          }
          this.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ga.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return this.a(new Hashtable(), new StringBuilder(), true, 0).toString();
    }

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param1 != 21224) {
          this.a(22, -63, true, true);
          if (param4 < this.field_k + param3) {
            return false;
          }
          if (param0 < this.field_j + param2) {
            return false;
          }
          if (this.field_i + param3 + this.field_k <= param4) {
            return false;
          }
          if (param0 >= param2 + this.field_j + this.field_n) {
            return false;
          }
          return true;
        }
        if (param4 < this.field_k + param3) {
          return false;
        }
        if (param0 < this.field_j + param2) {
          return false;
        }
        stackIn_18_0 = (this.field_i + param3 + this.field_k > param4) && (param0 < param2 + this.field_j + this.field_n);
        return stackIn_18_0;
    }

    int c(int param0) {
        if (param0 != 0) {
          this.field_u = 73;
          return 0;
        }
        return 0;
    }

    final static void a(int param0, int param1, lo param2) {
        am var3 = null;
        try {
          var3 = dp.field_e;
          var3.j(11, param0);
          var3.i(2, 93);
          var3.i(param1, param1 ^ 35);
          var3.i(param2.field_k, -96);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ga.VA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = ZombieDawn.field_J;
        var4 = this.c(0);
        var5_int = param0;
        while (var4 >= var5_int) {
          this.a(param2, var5_int, param1, 0);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = eg.a(109);
        if (var5 == null) {
          return;
        }
        se.field_j.a(mm.field_i, lc.field_i, var5, -104);
    }

    void a(ga param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.b(ei.field_K, 21224, param2, param3, ha.field_b) ? 1 : 0;
          var6 = 7 / ((46 - param1) / 42);
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (stackIn_3_0 == (this.field_l ? 1 : 0)) {
            stackIn_8_1 = (var5_int != 0);
            this.field_l = stackIn_8_1;
            if (null != this.field_v) {
              if (!(this.field_v instanceof ue)) {
                return;
              }
              ((ue) (this.field_v)).a(this, 10766, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ga.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean e(int param0) {
        if (param0 != -17741) {
          this.a(-123, 51, -13, -35, -43, -14, (ga) null);
          return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param1;
        this.field_i = param3;
        this.field_k = param2;
        this.field_n = param4;
        int var6 = 124 / ((param0 + 23) / 48);
    }

    final void a(boolean param0) {
        this.a(38, this.field_j, this.field_k, this.field_i, this.field_n);
        if (!param0) {
          ga.a(122, 7, (lo) null);
        }
    }

    ga(String param0, sk param1) {
        this(param0, se.field_j.field_n, param1);
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -46 / ((param0 + 83) / 32);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ga.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.e(-17741)) {
          var4 = param0;
          if (var4 == 80) {
            return this.a((byte) 76, this);
          }
          if (param1 > 21) {
            return false;
          }
          this.field_n = 58;
          return false;
        }
        if (this.a(28, param0, this, param2)) {
          return true;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.a((byte) 76, this);
        }
        if (param1 > 21) {
          return false;
        }
        this.field_n = 58;
        return false;
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, 11098, param3)) {
            this.a(param0, param3, 67, param1);
          }
          if (!param2) {
            this.toString();
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ga.NA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 11098) {
            field_q = 49;
          }
          if (param0.containsKey(this)) {
            discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ga.BB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String d(int param0) {
        int var2 = 67 / ((10 - param0) / 58);
        return !this.field_l ? null : this.field_s;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 == param3) {
          if (this.field_h == null) {
            return;
          }
          this.field_h.a(16777215, true, param0, this, param2);
        }
    }

    protected ga() {
        this.field_p = 0;
        this.field_u = 0;
    }

    ga(String param0, io param1, sk param2) {
        ak var4 = null;
        this.field_p = 0;
        this.field_u = 0;
        try {
          this.field_v = param2;
          this.field_o = param0;
          this.field_h = param1;
          if (this.field_h instanceof ak) {
            var4 = (ak) ((Object) this.field_h);
            this.field_i = var4.b((byte) -58, this);
            this.field_n = var4.a(false, this);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ga(int param0, int param1, int param2, int param3, io param4, sk param5) {
        this.field_p = 0;
        this.field_u = 0;
        try {
          this.field_h = param4;
          this.field_k = param0;
          this.field_j = param1;
          this.field_n = param3;
          this.field_i = param2;
          this.field_v = param5;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 15;
        field_w = false;
        field_r = 0;
    }
}
