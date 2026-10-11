/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vg extends gi {
    em field_s;
    int field_t;
    int field_y;
    int field_k;
    String field_v;
    int field_m;
    static int field_i;
    fd field_u;
    int field_w;
    static String field_x;
    int field_o;
    int field_q;
    static int[] field_r;
    cg field_l;
    String field_p;
    static hm field_j;
    static he[] field_h;
    boolean field_n;

    final boolean a(Hashtable param0, StringBuilder param1, int param2, int param3) {
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
          var5_int = -8 % ((param3 + 11) / 48);
          if (!param0.containsKey(this)) {
            param0.put(this, this);
            return true;
          }
          discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vg.QB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > 63) {
            return false;
          }
          this.a(false);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vg.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, byte param2, int param3, vg param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 43) {
            return false;
          }
          this.field_u = (fd) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("vg.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = this.d(3);
        var5_int = param1;
        while (var4 >= var5_int) {
          this.a(param0, var5_int, (byte) -21, param2);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = hf.g(~param1);
        if (var5 == null) {
          return;
        }
        ja.field_Q.a(pi.field_Q, var5, -126, oh.field_e);
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param2;
        this.field_w = param4;
        this.field_k = param1;
        this.field_m = param0;
        if (param3 != 16535) {
          vg var7 = (vg) null;
          this.a(125, -80, 21, (vg) null, -78, false);
          return;
        }
    }

    final static void d(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 != 103) {
            field_x = (String) null;
          }
          var5 = of.field_w;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "vg.OB(" + param0 + ')');
        }
    }

    boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          this.field_v = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vg.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static vi a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        vi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0 >= -97) {
            field_x = (String) null;
          }
          var2_int = param1.length();
          var3 = 0;
          while (var3 < var2_int) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              stackIn_9_0 = null;
              return (vi) (stackIn_9_0);
            }
            var3++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_12_0 = dh.field_H;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("vg.IB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        pi var6;
        int var7;
        pi var8;
        pi var9;
        pi var10;
        pi var11;
        pi var12;
        pi var14;
        pi var15;
        pi var16;
        pi var17;
        pi var6Lifetime1;
        pi var6Lifetime2;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.a(this, param0, param1, (byte) -128);
        var5 = this.a(true) ? 1 : 0;
        if (!param2) {
          if (var5 != 0 &&
            mh.field_f != 0) {
            this.c((byte) 61);
          }
          i.field_a = db.field_a;
          g.a(this.e(param3 ^ -125), param3 ^ param3);
          return param2;
        }
        if (ma.field_sb == 0) {
          if (0 == mh.field_f) {
            if (db.field_a == 0 &&
              i.field_a != 0) {
              this.a(param0, param1, ob.field_g, this, ck.field_c, false);
              var8 = oh.field_b;
              if (var8 != null) {
                if (var8.field_u instanceof hk) {
                  ((hk) (var8.field_u)).a((byte) 70, var8, (jk) null);
                }
                oh.field_b = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                mh.field_f != 0) {
                this.c((byte) 61);
              }
            }
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          L19: {
            if (this.a(ih.field_R, this, mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
              param2 = false;
              if (var7 == 0) {
                break L19;
              }
            }
            if (var5 != 0) {
              this.c((byte) 117);
              if (db.field_a == 0 &&
                i.field_a != 0) {
                this.a(param0, param1, ob.field_g, this, ck.field_c, false);
                var9 = oh.field_b;
                if (var9 != null) {
                  if (var9.field_u instanceof hk) {
                    ((hk) (var9.field_u)).a((byte) 70, var9, (jk) null);
                  }
                  oh.field_b = null;
                }
                if (var7 != 0 &&
                  mh.field_f != 0) {
                  this.c((byte) 61);
                }
              }
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
          }
          if (db.field_a != 0) {
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          if (i.field_a == 0) {
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          this.a(param0, param1, ob.field_g, this, ck.field_c, false);
          var10 = oh.field_b;
          if (var10 != null) {
            if (var10.field_u instanceof hk) {
              ((hk) (var10.field_u)).a((byte) 70, var10, (jk) null);
            }
            oh.field_b = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            mh.field_f != 0) {
            this.c((byte) 61);
          }
          i.field_a = db.field_a;
          g.a(this.e(param3 ^ -125), param3 ^ param3);
          return param2;
        }
        if (var5 != 0) {
          this.a(ck.field_c, ob.field_g, (byte) 89, ma.field_sb, this, param1, param0);
          if (0 == mh.field_f) {
            if (db.field_a == 0 &&
              i.field_a != 0) {
              this.a(param0, param1, ob.field_g, this, ck.field_c, false);
              var15 = oh.field_b;
              var6 = var15;
              if (var15 != null) {
                if (var15.field_u instanceof hk) {
                  ((hk) (var15.field_u)).a((byte) 70, var15, (jk) null);
                }
                oh.field_b = null;
              }
              if (var7 != 0 &&
                mh.field_f != 0) {
                this.c((byte) 61);
              }
            }
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          L0: {
            if (this.a(ih.field_R, this, mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
              param2 = false;
              if (var7 == 0) {
                break L0;
              }
            }
            this.c((byte) 117);
            if (db.field_a == 0 &&
              i.field_a != 0) {
              this.a(param0, param1, ob.field_g, this, ck.field_c, false);
              var16 = oh.field_b;
              var6Lifetime1 = var16;
              if (var16 != null) {
                if (var16.field_u instanceof hk) {
                  ((hk) (var16.field_u)).a((byte) 70, var16, (jk) null);
                }
                oh.field_b = null;
              }
              if (var7 != 0 &&
                mh.field_f != 0) {
                this.c((byte) 61);
              }
            }
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          if (db.field_a != 0) {
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          if (i.field_a == 0) {
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
          this.a(param0, param1, ob.field_g, this, ck.field_c, false);
          var17 = oh.field_b;
          var6Lifetime2 = var17;
          if (var17 != null) {
            if (var17.field_u instanceof hk) {
              ((hk) (var17.field_u)).a((byte) 70, var17, (jk) null);
            }
            oh.field_b = null;
          }
          if (var7 != 0 &&
            mh.field_f != 0) {
            this.c((byte) 61);
          }
          i.field_a = db.field_a;
          g.a(this.e(param3 ^ -125), param3 ^ param3);
          return param2;
        }
        if (0 == mh.field_f) {
          if (db.field_a == 0 &&
            i.field_a != 0) {
            this.a(param0, param1, ob.field_g, this, ck.field_c, false);
            var11 = oh.field_b;
            if (var11 != null) {
              if (var11.field_u instanceof hk) {
                ((hk) (var11.field_u)).a((byte) 70, var11, (jk) null);
              }
              oh.field_b = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              mh.field_f != 0) {
              this.c((byte) 61);
            }
          }
          i.field_a = db.field_a;
          g.a(this.e(param3 ^ -125), param3 ^ param3);
          return param2;
        }
        if (this.a(ih.field_R, this, mh.field_f, (byte) 115, ae.field_gb, param0, param1)) {
          param2 = false;
          if (var7 == 0) {
            if (db.field_a != 0) {
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
            if (i.field_a == 0) {
              i.field_a = db.field_a;
              g.a(this.e(param3 ^ -125), param3 ^ param3);
              return param2;
            }
            this.a(param0, param1, ob.field_g, this, ck.field_c, false);
            var14 = oh.field_b;
            if (var14 != null) {
              if (var14.field_u instanceof hk) {
                ((hk) (var14.field_u)).a((byte) 70, var14, (jk) null);
              }
              oh.field_b = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              mh.field_f != 0) {
              this.c((byte) 61);
            }
            i.field_a = db.field_a;
            g.a(this.e(param3 ^ -125), param3 ^ param3);
            return param2;
          }
        }
        if (db.field_a != 0) {
          i.field_a = db.field_a;
          g.a(this.e(param3 ^ -125), param3 ^ param3);
          return param2;
        }
        if (i.field_a == 0) {
          i.field_a = db.field_a;
          g.a(this.e(param3 ^ -125), param3 ^ param3);
          return param2;
        }
        this.a(param0, param1, ob.field_g, this, ck.field_c, false);
        var12 = oh.field_b;
        if (var12 != null) {
          if (var12.field_u instanceof hk) {
            ((hk) (var12.field_u)).a((byte) 70, var12, (jk) null);
          }
          oh.field_b = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          mh.field_f != 0) {
          this.c((byte) 61);
        }
        i.field_a = db.field_a;
        g.a(this.e(param3 ^ -125), param3 ^ param3);
        return param2;
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          return true;
        }
        if (param1 + this.field_o > param3) {
          return false;
        }
        if (param4 < param0 + this.field_m) {
          return false;
        }
        if (param3 >= this.field_o + param1 + this.field_w) {
          return false;
        }
        if (this.field_k + this.field_m + param0 > param4) {
          return true;
        }
        return false;
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param6, param5, false, param4, param0)) {
            this.field_y = param2;
          }
          if (param3 >= 113) {
            return false;
          }
          this.field_k = -92;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("vg.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.a(true)) {
          if (param2 <= 31) {
            return false;
          }
          var4 = param0;
          if (var4 != 80) {
            return false;
          }
          return this.a(false, this);
        }
        if (this.a(param0, param1, this, 84)) {
          return true;
        }
        if (param2 <= 31) {
          return false;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 != 80) {
          return false;
        }
        return this.a(false, this);
    }

    final static bg a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        bg var9 = null;
        RuntimeException var9_ref = null;
        bg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_j = (hm) null;
          }
          var9 = new bg(param8, param5, param2, param6, param1, param4, param7);
          gf.field_h.a(var9, 255);
          jc.a(param3, var9, -121);
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("vg.KB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param8).append(')').toString());
        }
    }

    vg(String param0, fd param1) {
        this(param0, ja.field_Q.field_i, param1);
    }

    final void e(byte param0) {
        this.a(this.field_m, this.field_k, this.field_o, 16535, this.field_w);
        if (param0 <= 11) {
          this.e(37);
          return;
        }
    }

    void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        try {
          this.field_y = 0;
          if (param5) {
            this.field_q = 115;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "vg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    String e(int param0) {
        if (param0 >= -39) {
          return (String) null;
        }
        return !this.field_n ? null : this.field_v;
    }

    final static void b(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        lh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var1 = nj.field_p;
          if (param0 <= 45) {
            return;
          }
          stackIn_5_0 = 99;
          while (ck.b(stackIn_5_0)) {
            var1.d(8, -18392);
            fieldTemp$0 = var1.field_j + 1;
            var1.field_j = var1.field_j + 1;
            var2 = fieldTemp$0;
            nc.a((byte) -95, var1);
            nj.field_p.b(-var2 + var1.field_j, (byte) 87);
            if (var3 != 0) {
              return;
            }
            stackIn_5_0 = 99;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "vg.JB(" + param0 + ')');
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        StringBuilder var6 = null;
        StringBuilder var6Lifetime1;
        if (param1 == 0) {
          if (this.field_l == null) {
            if (param2 != -21) {
              var6 = (StringBuilder) null;
              this.a(15, (Hashtable) null, (StringBuilder) null, 118);
              return;
            }
            return;
          }
          this.field_l.a(true, 117, this, param3, param0);
        }
        if (param2 != -21) {
          var6Lifetime1 = (StringBuilder) null;
          this.a(15, (Hashtable) null, (StringBuilder) null, 118);
          return;
        }
    }

    final void a(StringBuilder param0, byte param1, int param2, Hashtable param3) {
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
        vg var7 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_m).append(" ").append(this.field_w).append("x").append(this.field_k);
          if (this.field_p != null) {
            discarded$1 = param0.append(" text=\"").append(this.field_p).append('"');
          }
          if (this.field_n) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.a(true)) {
            discarded$3 = param0.append(" focused");
          }
          if (this.field_l != null) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_l instanceof vg)) {
              discarded$5 = param0.append(this.field_l);
              if (var6 != 0) {
                param0 = this.a(param2 + 1, param3, param0, -10612);
              }
            } else {
              param0 = this.a(param2 + 1, param3, param0, -10612);
            }
          }
          if (null != this.field_u) {
            discarded$6 = param0.append(" listener=");
            if (this.field_u instanceof vg) {
              param0 = this.a(1 + param2, param3, param0, -10612);
              if (var6 != 0) {
                discarded$7 = param0.append(this.field_u);
              }
            } else {
              discarded$7 = param0.append(this.field_u);
            }
          }
          if (param1 != 89) {
            var7 = (vg) null;
            this.a(45, 110, 39, (vg) null, 34, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("vg.LB(");
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
          throw ie.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    boolean a(boolean param0) {
        if (!param0) {
          this.field_k = -58;
          return false;
        }
        return false;
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), -10612).toString();
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param2, param0, param3 + 10725)) {
            this.a(param2, (byte) 89, param0, param1);
          }
          if (param3 == -10612) {
            stackIn_6_0 = (StringBuilder) (param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vg.WA(").append(param0).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        String var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(param2, param1, false, ck.field_c, ob.field_g) ? 1 : 0;
          if (param3 > -127) {
            var6 = (String) null;
            vg.a((byte) -123, (String) null);
          }
          stackIn_5_0 = (this.field_n) ? 0 : 1;
          if (var5_int != 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_13_1 = (var5_int != 0);
            this.field_n = stackIn_13_1;
            if (this.field_u != null &&
              this.field_u instanceof wc) {
              ((wc) (this.field_u)).a(this, var5_int != 0, (byte) -117);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("vg.I(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    int d(int param0) {
        if (param0 != 3) {
          this.field_v = (String) null;
          return 0;
        }
        return 0;
    }

    final static void a(vj param0, boolean param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int[] var6 = null;
        int var7 = 0;
        lh var8 = null;
        lh var9 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1) {
            return;
          }
          var8 = new lh(param0.a("logo.fo3d", "", 24874));
          var9 = var8;
          var3 = var9.l(31760);
          var9.d((byte) 65);
          dm.field_B = m.a(103, var9);
          q.field_b = new int[var3][];
          r.field_c = new ja[var3];
          var4 = 0;
          do {
            if (var3 <= var4) {
              var9.o(-124);
              break;
            }
            r.field_c[var4] = tl.a(var8, (byte) 105);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var4 < var3) {
            var5 = r.field_c[var4];
            var5.a(6, 6, 6, (byte) -65, 1);
            var5.b(32767);
            var6 = new int[]{var5.field_I + var5.field_s >> 1, var5.field_N + var5.field_d >> 1, var5.field_j + var5.field_C >> 1};
            q.field_b[var4] = var6;
            var5.a(-var6[0], -var6[2], 0, -var6[1]);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("vg.MB(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_j = null;
        field_r = null;
        field_x = null;
        field_h = null;
        int var1 = 10 % ((param0 + 2) / 56);
    }

    protected vg() {
        this.field_t = 0;
        this.field_q = 0;
    }

    void c(byte param0) {
        int var2 = -54 % ((-10 - param0) / 51);
    }

    vg(String param0, cg param1, fd param2) {
        va var4 = null;
        this.field_t = 0;
        this.field_q = 0;
        try {
          this.field_u = param2;
          this.field_p = param0;
          this.field_l = param1;
          if (this.field_l instanceof va) {
            var4 = (va) ((Object) this.field_l);
            this.field_w = var4.a((byte) 48, this);
            this.field_k = var4.a(170, this);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "vg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    vg(int param0, int param1, int param2, int param3, cg param4, fd param5) {
        this.field_t = 0;
        this.field_q = 0;
        try {
          this.field_w = param2;
          this.field_m = param1;
          this.field_o = param0;
          this.field_u = param5;
          this.field_l = param4;
          this.field_k = param3;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "vg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "This password is part of your Player Name, and would be easy to guess";
        field_r = new int[]{3, 2, 3, 3, 3, 0, -1, 0, -1, -1, -1, 8, -1, 5, 5, 5, 5, 8, 8, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, -1, 2, 3, 3, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0};
    }
}
