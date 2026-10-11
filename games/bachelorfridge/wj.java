/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wj extends bw {
    int field_v;
    static String field_x;
    static String field_r;
    int field_s;
    int field_q;
    String field_h;
    boolean field_t;
    int field_p;
    int field_m;
    static int[] field_n;
    static boolean field_g;
    String field_w;
    static String field_i;
    int field_u;
    qda field_f;
    vv field_j;
    int field_o;
    static int[] field_l;
    pl field_k;

    String c(byte param0) {
        if (param0 != 16) {
          field_r = (String) null;
          if (this.field_t) {
            return this.field_h;
          }
          return null;
        }
        if (this.field_t) {
          return this.field_h;
        }
        return null;
    }

    public final String toString() {
        return this.a(new Hashtable(), 0, (byte) 117, new StringBuilder()).toString();
    }

    StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 20) {
            this.field_m = 90;
          }
          if (this.a(param0, param1, param3, (byte) -104)) {
            this.a(9, param0, param3, param1);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wj.V(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        int var5_int = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(gd.field_m, mk.field_p, 0, param0, param1) ? 1 : 0;
          if ((this.field_t ? 1 : 0) != var5_int) {
            stackIn_4_1 = (var5_int != 0);
            this.field_t = stackIn_4_1;
            if (this.field_k != null &&
              this.field_k instanceof aaa) {
              ((aaa) (this.field_k)).a(-14301, var5_int != 0, this);
            }
          }
          if (param3 != 20) {
            field_x = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wj.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    wj(String param0, pl param1) {
        this(param0, fda.field_i.field_i, param1);
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var7;
        raa var8;
        raa var9;
        raa var10;
        raa var11;
        var7 = BachelorFridge.field_y;
        this.a(param1, param2, this, param3 ^ 6393);
        var5 = this.e(1023) ? 1 : 0;
        if (!param0) {
          if (var5 == 0) {
            uga.field_y = fia.field_t;
            if (param3 != 6381) {
              this.a((byte) -90, -84, 109, 31);
            }
            ji.a(param3 - 6496, this.c((byte) 16));
            return param0;
          }
          if (lf.field_c == 0) {
            uga.field_y = fia.field_t;
            if (param3 != 6381) {
              this.a((byte) -90, -84, 109, 31);
            }
            ji.a(param3 - 6496, this.c((byte) 16));
            return param0;
          }
          this.f(31);
          if (var7 == 0) {
            uga.field_y = fia.field_t;
            if (param3 != 6381) {
              this.a((byte) -90, -84, 109, 31);
            }
            ji.a(param3 - 6496, this.c((byte) 16));
            return param0;
          }
        }
        if (0 != vc.field_a &&
          var5 != 0) {
          this.a(gd.field_m, 13, mk.field_p, vc.field_a, param2, this, param1);
        }
        if (0 == lf.field_c) {
          if (fia.field_t == 0 &&
            uga.field_y != 0) {
            this.a(param1, mk.field_p, (byte) -101, this, gd.field_m, param2);
            var8 = cea.field_b;
            if (var8 != null) {
              if (var8.field_k instanceof mo) {
                ((mo) (var8.field_k)).a((re) null, var8, (byte) 88);
              }
              cea.field_b = null;
            }
          }
        } else {
          if (this.b(nfa.field_a, -7375, param1, lf.field_c, param2, this, jc.field_r)) {
            param0 = false;
            if (var7 == 0) {
              if (fia.field_t == 0 &&
                uga.field_y != 0) {
                this.a(param1, mk.field_p, (byte) -101, this, gd.field_m, param2);
                var9 = cea.field_b;
                if (var9 != null) {
                  if (var9.field_k instanceof mo) {
                    ((mo) (var9.field_k)).a((re) null, var9, (byte) 88);
                  }
                  cea.field_b = null;
                  uga.field_y = fia.field_t;
                  if (param3 != 6381) {
                    this.a((byte) -90, -84, 109, 31);
                  }
                  ji.a(param3 - 6496, this.c((byte) 16));
                  return param0;
                }
              }
              uga.field_y = fia.field_t;
              if (param3 != 6381) {
                this.a((byte) -90, -84, 109, 31);
              }
              ji.a(param3 - 6496, this.c((byte) 16));
              return param0;
            }
          }
          if (var5 != 0) {
            this.f(param3 - 6350);
            if (fia.field_t == 0 &&
              uga.field_y != 0) {
              this.a(param1, mk.field_p, (byte) -101, this, gd.field_m, param2);
              var11 = cea.field_b;
              if (var11 != null) {
                if (var11.field_k instanceof mo) {
                  ((mo) (var11.field_k)).a((re) null, var11, (byte) 88);
                }
                cea.field_b = null;
                uga.field_y = fia.field_t;
                if (param3 != 6381) {
                  this.a((byte) -90, -84, 109, 31);
                }
                ji.a(param3 - 6496, this.c((byte) 16));
                return param0;
              }
            }
          } else {
            if (fia.field_t == 0 &&
              uga.field_y != 0) {
              this.a(param1, mk.field_p, (byte) -101, this, gd.field_m, param2);
              var10 = cea.field_b;
              if (var10 != null) {
                if (var10.field_k instanceof mo) {
                  ((mo) (var10.field_k)).a((re) null, var10, (byte) 88);
                }
                cea.field_b = null;
                uga.field_y = fia.field_t;
                if (param3 != 6381) {
                  this.a((byte) -90, -84, 109, 31);
                }
                ji.a(param3 - 6496, this.c((byte) 16));
                return param0;
              }
            }
          }
        }
        uga.field_y = fia.field_t;
        if (param3 != 6381) {
          this.a((byte) -90, -84, 109, 31);
        }
        ji.a(param3 - 6496, this.c((byte) 16));
        return param0;
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param2 != 0) {
          var5 = -22 % ((param0 + 20) / 54);
          return;
        }
        if (this.field_f != null) {
          this.field_f.a(param3, this, 32679, param1, true);
          var5Lifetime1 = -22 % ((param0 + 20) / 54);
          return;
        }
        var5Lifetime2 = -22 % ((param0 + 20) / 54);
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_s).append(",").append(this.field_v).append(" ").append(this.field_p).append("x").append(this.field_q);
          if (null != this.field_w) {
            discarded$1 = param2.append(" text=\"").append(this.field_w).append('"');
          }
          if (this.field_t) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.e(1023)) {
            discarded$3 = param2.append(" focused");
          }
          if (this.field_f != null) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_f instanceof wj)) {
              discarded$5 = param2.append(this.field_f);
              if (var6 != 0) {
                param2 = this.a(param1, 1 + param3, (byte) 22, param2);
              }
            } else {
              param2 = this.a(param1, 1 + param3, (byte) 22, param2);
            }
          }
          if (null != this.field_k) {
            discarded$6 = param2.append(" listener=");
            if (this.field_k instanceof wj) {
              param2 = this.a(param1, param3 + 1, (byte) 80, param2);
              if (var6 != 0) {
                discarded$7 = param2.append(this.field_k);
              }
            } else {
              discarded$7 = param2.append(this.field_k);
            }
          }
          if (param0 != 9) {
            this.a((Hashtable) null, 66, (byte) -12, (StringBuilder) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("wj.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final static eka a(vr param0, boolean param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        eka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.b(param2, 0);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          if (param1) {
            wj.a((vr) null, false, -62);
          }
          stackIn_6_0 = new eka(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("wj.IB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    int b(int param0) {
        if (param0 > -3) {
          this.a(-50, -110, (byte) 54, 56, -56);
          return 0;
        }
        return 0;
    }

    void f(int param0) {
        if (param0 != 31) {
          this.field_f = (qda) null;
        }
    }

    final static kv[] a(int param0, int[] param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        kv[] var3 = null;
        kv[] stackIn_2_0 = null;
        kv[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new kv[14];
          var2 = var3;
          var3[1] = qs.field_l[1][param1[1]];
          var3[0] = qs.field_l[0][param1[0]];
          var3[2] = qs.field_l[2][param1[2]];
          var3[3] = qs.field_l[3][param1[3]];
          var3[5] = qs.field_l[5][param1[5]];
          if (param0 != -863) {
            stackIn_2_0 = (kv[]) null;
            return stackIn_2_0;
          }
          var3[8] = qs.field_l[8][param1[8]];
          var3[4] = qs.field_l[4][param1[4]];
          var3[9] = qs.field_l[9][param1[9]];
          var3[10] = qs.field_l[10][param1[10]];
          var3[7] = qs.field_l[7][param1[7]];
          var3[6] = qs.field_l[6][param1[6]];
          var3[11] = qs.field_l[11][param1[8]];
          var3[12] = qs.field_l[12][param1[9]];
          var3[13] = qs.field_l[13][param1[10]];
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("wj.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("wj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(')').toString());
        }
    }

    final void d(int param0) {
        this.a(this.field_s, this.field_q, (byte) 59, this.field_p, this.field_v);
        if (param0 != 6) {
          this.a('ﾚ', (byte) -65, 19);
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            this.f(-104);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wj.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean e(int param0) {
        if (param0 != 1023) {
          this.field_t = true;
          return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, byte param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 64 / ((param3 + 39) / 34);
          if (param0.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("wj.FB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.e(1023)) {
          var4 = param2;
          if (80 == var4) {
            return this.a(this, -117);
          }
          if (param1 == 7) {
            return false;
          }
          field_g = true;
          return false;
        }
        if (this.a(param1 + 3, param2, param0, this)) {
          return true;
        }
        var4Lifetime1 = param2;
        if (80 == var4Lifetime1) {
          return this.a(this, -117);
        }
        if (param1 == 7) {
          return false;
        }
        field_g = true;
        return false;
    }

    void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        try {
          this.field_u = 0;
          if (param2 != -101) {
            this.a(49, -90, 17, 95, -112, (wj) null, -44);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wj.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param2 != 0) {
          this.toString();
          if (param3 + this.field_s > param1) {
            return false;
          }
          if (param4 + this.field_v > param0) {
            return false;
          }
          if (this.field_p + param3 + this.field_s <= param1) {
            return false;
          }
          if (param0 >= param4 - (-this.field_v - this.field_q)) {
            return false;
          }
          return true;
        }
        if (param3 + this.field_s > param1) {
          return false;
        }
        if (param4 + this.field_v > param0) {
          return false;
        }
        stackIn_18_0 = (this.field_p + param3 + this.field_s > param1) && (param0 < param4 - (-this.field_v - this.field_q));
        return stackIn_18_0;
    }

    public static void c(int param0) {
        field_n = null;
        field_l = null;
        field_r = null;
        field_x = null;
        field_i = null;
        if (param0 != 1023) {
          wj.a((vr) null, true, -12);
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param6, param0, 0, param2, param4)) {
            this.field_u = param3;
          }
          if (param1 == -7375) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("wj.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = BachelorFridge.field_y;
        var4 = this.b(param2 - 20156);
        if (param2 != 20077) {
          return;
        }
        var5_int = 0;
        while (var5_int <= var4) {
          this.a((byte) 106, param1, var5_int, param0);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = er.f(75);
        if (var5 == null) {
          return;
        }
        fda.field_i.a((byte) -49, jl.field_s, eaa.field_b, var5);
    }

    boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -78) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wj.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        this.field_q = param1;
        this.field_v = param4;
        this.field_p = param3;
        this.field_s = param0;
        if (param2 != 59) {
          this.b(-45);
        }
    }

    protected wj() {
        this.field_m = 0;
        this.field_o = 0;
    }

    wj(String param0, qda param1, pl param2) {
        RuntimeException runtimeException = null;
        qka var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_m = 0;
        this.field_o = 0;
        try {
          this.field_w = param0;
          this.field_k = param2;
          this.field_f = param1;
          if (this.field_f instanceof qka) {
            var4 = (qka) ((Object) this.field_f);
            this.field_p = var4.a(-21928, this);
            this.field_q = var4.c(this, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    wj(int param0, int param1, int param2, int param3, qda param4, pl param5) {
        this.field_m = 0;
        this.field_o = 0;
        try {
          this.field_k = param5;
          this.field_q = param3;
          this.field_f = param4;
          this.field_v = param1;
          this.field_s = param0;
          this.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "On";
        field_g = true;
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_l = new int[]{65, 85, 85, 0, 75, 85};
        field_r = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
