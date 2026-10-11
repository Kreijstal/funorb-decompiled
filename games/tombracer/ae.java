/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ae extends vg {
    bja field_l;
    int field_p;
    boolean field_f;
    int field_m;
    String field_o;
    int field_n;
    String field_q;
    int field_t;
    static int field_g;
    static String field_k;
    int field_s;
    int field_i;
    int field_j;
    qc field_h;
    isa field_r;

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_i).append(",").append(this.field_n).append(" ").append(this.field_m).append("x").append(this.field_p);
          if (this.field_o != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_o).append('"');
          }
          if (this.field_f) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.b((byte) -34)) {
            discarded$3 = param1.append(" focused");
          }
          if (null != this.field_r) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_r instanceof ae) {
              param1 = this.a(param3 + 1, param2, param1, 0);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_r);
              }
            } else {
              discarded$5 = param1.append(this.field_r);
            }
          }
          if (this.field_h != null) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_h instanceof ae)) {
              discarded$7 = param1.append(this.field_h);
              if (var6 != 0) {
                param1 = this.a(1 + param3, param2, param1, 0);
              }
            } else {
              param1 = this.a(1 + param3, param2, param1, 0);
            }
          }
          if (param0 != 1) {
            field_g = 99;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ae.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -82 / ((-38 - param2) / 50);
        if (param0 < param1 + this.field_i) {
          return false;
        }
        if (this.field_n + param4 > param3) {
          return false;
        }
        if (param0 >= this.field_m + param1 + this.field_i) {
          return false;
        }
        if (param3 < this.field_p + (param4 + this.field_n)) {
          return true;
        }
        return false;
    }

    final void c(byte param0) {
        int var2 = -39 / ((77 - param0) / 44);
        this.a((byte) -31, this.field_m, this.field_p, this.field_i, this.field_n);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = this.a(false);
        var5 = 0;
        while (true) {
          if (var4 < var5) {
            if (param0 < -23) {
              var11 = of.a(1);
              if (var11 != null) {
                afa.field_c.a(var11, vf.field_f, true, mi.field_f);
              }
              return;
            }
            this.field_m = -42;
            var10 = of.a(1);
            if (var10 != null) {
              afa.field_c.a(var10, vf.field_f, true, mi.field_f);
            }
            return;
          }
          this.a(param2, param1, 0, var5);
          var5++;
          if (var6 != 0) {
            var7 = of.a(1);
            if (var7 != null) {
              afa.field_c.a(var7, vf.field_f, true, mi.field_f);
            }
            return;
          }
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            return false;
          }
          field_k = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ae.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void f(byte param0) {
        int var2 = -8 / ((-38 - param0) / 60);
    }

    boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 == -1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ae.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.b((byte) -34)) {
          var4 = param1;
          if (var4 != 80) {
            var4 = 17 / ((38 - param0) / 57);
            return false;
          }
          return this.a(this, false);
        }
        if (this.a(param2, this, param1, true)) {
          return true;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 != 80) {
          var4Lifetime1 = 17 / ((38 - param0) / 57);
          return false;
        }
        return this.a(this, false);
    }

    final boolean a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
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
          var5_int = -45 % ((-63 - param0) / 44);
          if (!param2.containsKey(this)) {
            param2.put(this, this);
            return true;
          }
          discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ae.IA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ae(String param0, qc param1) {
        this(param0, afa.field_c.field_k, param1);
    }

    boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ae.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    int a(boolean param0) {
        if (param0) {
          return 28;
        }
        return 0;
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        this.field_i = param3;
        this.field_n = param4;
        this.field_p = param2;
        this.field_m = param1;
        if (param0 != -31) {
          this.a((byte) 27, -25, '﾿');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == param3) {
          if (this.field_r == null) {
            return;
          }
          this.field_r.a(this, param0, 16777215, param1, true);
        }
    }

    boolean b(byte param0) {
        if (param0 != -34) {
          this.field_p = 89;
          return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 70) {
            this.field_f = false;
          }
          if (!this.a(param6, param1, 47, param3, param2)) {
            return false;
          }
          this.field_s = param4;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ae.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 2097152) {
            field_k = (String) null;
          }
          var5_int = this.a(jba.field_j, param0, -105, sta.field_B, param3) ? 1 : 0;
          stackIn_5_0 = (this.field_f) ? 0 : 1;
          if (var5_int != 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_13_1 = (var5_int != 0);
            this.field_f = stackIn_13_1;
            if (this.field_h != null &&
              this.field_h instanceof ar) {
              ((ar) (this.field_h)).a(var5_int != 0, (byte) 113, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ae.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -122, param0, param1, param2)) {
            this.a(1, param2, param1, param0);
          }
          if (param3 == 0) {
            stackIn_7_0 = (StringBuilder) (param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ae.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = -111 / ((param0 - 81) / 44);
        field_k = null;
    }

    String d(byte param0) {
        int var2 = 7 % ((param0 + 58) / 60);
        if (!this.field_f) {
          return null;
        }
        return this.field_q;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 6100) {
          return true;
        }
        if (qp.a(param0, (byte) 101, param1) | (0 != (393216 & param0) ? true : false)) {
          return true;
        }
        if (vua.e(param0, param1, 13650)) {
          return true;
        }
        if (!tia.b(param1, param2 - 29503, param0)) {
          return false;
        }
        return true;
    }

    void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        try {
          if (param0 != 59) {
            this.field_q = (String) null;
          }
          this.field_s = 0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ae.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var7;
        vp var8;
        vp var9;
        vp var10;
        vp var11;
        vp var12;
        vp var13;
        var7 = TombRacer.field_G ? 1 : 0;
        this.a(param2, 2097152, this, param0);
        var5 = this.b((byte) -34) ? 1 : 0;
        if (!param1) {
          if (var5 != 0 &&
            hf.field_b != 0) {
            this.f((byte) 119);
          }
          kca.field_f = ksa.field_p;
          fea.a((byte) -33, this.d((byte) 68));
          if (param3 <= -86) {
            return param1;
          }
          this.c((byte) -121);
          return param1;
        }
        if (0 == pg.field_y) {
          if (hf.field_b != 0) {
            if (!this.a(97, param2, param0, lba.field_p, hf.field_b, this, jm.field_m)) {
              if (var5 == 0) {
                if (ksa.field_p == 0 &&
                  kca.field_f != 0) {
                  this.a((byte) 59, this, sta.field_B, param2, param0, jba.field_j);
                  var8 = ava.field_f;
                  if (var8 != null) {
                    if (!(var8.field_h instanceof kja)) {
                      ava.field_f = null;
                    } else {
                      ((kja) (var8.field_h)).a(var8, (byte) 59, (k) null);
                      ava.field_f = null;
                    }
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    hf.field_b != 0) {
                    this.f((byte) 119);
                  }
                }
                kca.field_f = ksa.field_p;
                fea.a((byte) -33, this.d((byte) 68));
                if (param3 > -86) {
                  this.c((byte) -121);
                }
                return param1;
              }
              this.f((byte) -98);
              if (var7 != 0) {
                param1 = false;
              }
            } else {
              param1 = false;
            }
          }
          if (ksa.field_p == 0 &&
            kca.field_f != 0) {
            this.a((byte) 59, this, sta.field_B, param2, param0, jba.field_j);
            var9 = ava.field_f;
            if (var9 != null) {
              if (var9.field_h instanceof kja) {
                ((kja) (var9.field_h)).a(var9, (byte) 59, (k) null);
              }
              ava.field_f = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              hf.field_b != 0) {
              this.f((byte) 119);
            }
            kca.field_f = ksa.field_p;
            fea.a((byte) -33, this.d((byte) 68));
            if (param3 > -86) {
              this.c((byte) -121);
            }
            return param1;
          }
          kca.field_f = ksa.field_p;
          fea.a((byte) -33, this.d((byte) 68));
          if (param3 <= -86) {
            return param1;
          }
          this.c((byte) -121);
          return param1;
        }
        if (var5 == 0) {
          if (hf.field_b != 0) {
            if (!this.a(97, param2, param0, lba.field_p, hf.field_b, this, jm.field_m)) {
              if (ksa.field_p == 0 &&
                kca.field_f != 0) {
                this.a((byte) 59, this, sta.field_B, param2, param0, jba.field_j);
                var10 = ava.field_f;
                if (var10 != null) {
                  if (!(var10.field_h instanceof kja)) {
                    ava.field_f = null;
                  } else {
                    ((kja) (var10.field_h)).a(var10, (byte) 59, (k) null);
                    ava.field_f = null;
                  }
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  hf.field_b != 0) {
                  this.f((byte) 119);
                }
              }
              kca.field_f = ksa.field_p;
              fea.a((byte) -33, this.d((byte) 68));
              if (param3 > -86) {
                this.c((byte) -121);
              }
              return param1;
            }
            param1 = false;
          }
          if (ksa.field_p == 0 &&
            kca.field_f != 0) {
            this.a((byte) 59, this, sta.field_B, param2, param0, jba.field_j);
            var11 = ava.field_f;
            if (var11 != null) {
              if (var11.field_h instanceof kja) {
                ((kja) (var11.field_h)).a(var11, (byte) 59, (k) null);
              }
              ava.field_f = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              hf.field_b != 0) {
              this.f((byte) 119);
            }
            kca.field_f = ksa.field_p;
            fea.a((byte) -33, this.d((byte) 68));
            if (param3 > -86) {
              this.c((byte) -121);
            }
            return param1;
          }
          kca.field_f = ksa.field_p;
          fea.a((byte) -33, this.d((byte) 68));
          if (param3 <= -86) {
            return param1;
          }
          this.c((byte) -121);
          return param1;
        }
        this.a(pg.field_y, param0, param2, sta.field_B, this, jba.field_j, -1);
        if (hf.field_b != 0) {
          if (!this.a(97, param2, param0, lba.field_p, hf.field_b, this, jm.field_m)) {
            this.f((byte) -98);
            if (var7 != 0) {
              param1 = false;
            }
          } else {
            param1 = false;
          }
        }
        if (ksa.field_p != 0) {
          kca.field_f = ksa.field_p;
          fea.a((byte) -33, this.d((byte) 68));
          if (param3 <= -86) {
            return param1;
          }
          this.c((byte) -121);
          return param1;
        }
        if (kca.field_f == 0) {
          kca.field_f = ksa.field_p;
          fea.a((byte) -33, this.d((byte) 68));
          if (param3 <= -86) {
            return param1;
          }
          this.c((byte) -121);
          return param1;
        }
        this.a((byte) 59, this, sta.field_B, param2, param0, jba.field_j);
        var13 = ava.field_f;
        if (var13 != null) {
          if (var13.field_h instanceof kja) {
            ((kja) (var13.field_h)).a(var13, (byte) 59, (k) null);
          }
          ava.field_f = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          hf.field_b != 0) {
          this.f((byte) 119);
        }
        kca.field_f = ksa.field_p;
        fea.a((byte) -33, this.d((byte) 68));
        if (param3 <= -86) {
          return param1;
        }
        this.c((byte) -121);
        return param1;
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    protected ae() {
        this.field_t = 0;
        this.field_j = 0;
    }

    ae(String param0, isa param1, qc param2) {
        RuntimeException runtimeException = null;
        oaa var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_t = 0;
        this.field_j = 0;
        try {
          this.field_r = param1;
          this.field_o = param0;
          this.field_h = param2;
          if (this.field_r instanceof oaa) {
            var4 = (oaa) ((Object) this.field_r);
            this.field_m = var4.a(3459, this);
            this.field_p = var4.b((byte) -79, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ae.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ae(int param0, int param1, int param2, int param3, isa param4, qc param5) {
        this.field_t = 0;
        this.field_j = 0;
        try {
          this.field_i = param0;
          this.field_r = param4;
          this.field_h = param5;
          this.field_p = param3;
          this.field_m = param2;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ae.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Members";
    }
}
