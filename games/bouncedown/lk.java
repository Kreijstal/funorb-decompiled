/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lk extends ai {
    String field_q;
    ed field_l;
    int field_i;
    int field_u;
    static lj field_t;
    fc field_j;
    int field_v;
    int field_m;
    int field_r;
    sk field_n;
    static Boolean field_p;
    static String field_s;
    boolean field_g;
    int field_o;
    int field_k;
    String field_h;

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param2;
        this.field_r = param3;
        this.field_i = param4;
        this.field_m = param0;
        if (param1 != 80) {
          this.field_r = -53;
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        int var5_int = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.c(uc.field_C, 0, param2, param1, ll.field_y) ? 1 : 0;
          if (var5_int != (this.field_g ? 1 : 0)) {
            stackIn_4_1 = (var5_int != 0);
            this.field_g = stackIn_4_1;
            if (null != this.field_n &&
              this.field_n instanceof dj) {
              ((dj) (this.field_n)).a(-124, var5_int != 0, this);
            }
          }
          if (param0 != -1) {
            this.field_g = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("lk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
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
          if (this.a(param2, param3, (byte) 14, param0)) {
            this.a(param0, param3, param2, 32362);
          }
          if (param1) {
            stackIn_6_0 = (StringBuilder) (param3);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lk.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    int f(int param0) {
        if (param0 != 0) {
          this.field_k = -2;
          return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == 0) {
          if (this.field_j == null) {
            if (param2 < 33) {
              this.field_l = (ed) null;
              return;
            }
            return;
          }
          this.field_j.a(param1, this, (byte) -127, true, param3);
        }
        if (param2 >= 33) {
          return;
        }
        this.field_l = (ed) null;
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_i).append(" ").append(this.field_k).append("x").append(this.field_m);
          if (this.field_h != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_h).append('"');
          }
          if (this.field_g) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.e(param3 - 32361)) {
            discarded$3 = param1.append(" focused");
          }
          if (param3 != 32362) {
            this.c(-89, 94, 115, -98, -13);
          }
          if (this.field_j != null) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_j instanceof lk) {
              param1 = this.a(1 + param0, true, param2, param1);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_j);
              }
            } else {
              discarded$5 = param1.append(this.field_j);
            }
          }
          if (null != this.field_n) {
            discarded$6 = param1.append(" listener=");
            if (this.field_n instanceof lk) {
              param1 = this.a(1 + param0, true, param2, param1);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param1.append(this.field_n);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("lk.OB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    lk(String param0, sk param1) {
        this(param0, ma.field_m.field_c, param1);
    }

    void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        try {
          if (param4 != 34) {
            this.field_q = (String) null;
          }
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "lk.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    String d(int param0) {
        if (param0 == 0) {
          return !this.field_g ? null : this.field_q;
        }
        this.e(15);
        return !this.field_g ? null : this.field_q;
    }

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 28455) {
            this.e(-128);
          }
          if (!this.c(param3, 0, param6, param2, param5)) {
            return false;
          }
          this.field_u = param0;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("lk.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        int var7;
        bj var8;
        bj var9;
        bj var10;
        bj var11;
        var7 = Bounce.field_N;
        this.a(-1, param0, param3, this);
        var5 = this.e(1) ? 1 : 0;
        if (!param2) {
          if (var5 != 0 &&
            vh.field_e != 0) {
            this.c((byte) 114);
            if (var7 != 0) {
              if (0 != va.field_a) {
                this.a(param0, ll.field_y, va.field_a, uc.field_C, param3, this, true);
              }
              if (vh.field_e != 0) {
                if (!this.a(vh.field_e, this, param0, og.field_a, 28455, rk.field_a, param3)) {
                  this.c((byte) 114);
                }
                param2 = false;
              }
              if (0 == n.field_m &&
                0 != d.field_B) {
                this.a(ll.field_y, param0, this, param3, 34, uc.field_C);
                var8 = nd.field_A;
                if (var8 != null) {
                  if (var8.field_n instanceof df) {
                    ((df) (var8.field_n)).a(var8, (byte) 109, (se) null);
                  }
                  nd.field_A = null;
                }
              }
            }
          }
        } else {
          if (0 != va.field_a) {
            if (var5 == 0) {
              if (vh.field_e != 0 &&
                this.a(vh.field_e, this, param0, og.field_a, 28455, rk.field_a, param3)) {
                param2 = false;
              }
              if (0 != n.field_m) {
                d.field_B = n.field_m;
                if (!param1) {
                  return false;
                }
                gk.a(73, this.d(0));
                return param2;
              }
              if (0 == d.field_B) {
                d.field_B = n.field_m;
                if (!param1) {
                  return false;
                }
                gk.a(73, this.d(0));
                return param2;
              }
              this.a(ll.field_y, param0, this, param3, 34, uc.field_C);
              var9 = nd.field_A;
              if (var9 != null) {
                if (var9.field_n instanceof df) {
                  ((df) (var9.field_n)).a(var9, (byte) 109, (se) null);
                }
                nd.field_A = null;
              }
              d.field_B = n.field_m;
              if (!param1) {
                return false;
              }
              gk.a(73, this.d(0));
              return param2;
            }
            this.a(param0, ll.field_y, va.field_a, uc.field_C, param3, this, true);
          }
          if (vh.field_e != 0) {
            if (this.a(vh.field_e, this, param0, og.field_a, 28455, rk.field_a, param3)) {
              param2 = false;
            } else {
              if (var5 != 0) {
                this.c((byte) 114);
                if (var7 != 0) {
                  param2 = false;
                  if (0 == n.field_m &&
                    0 != d.field_B) {
                    this.a(ll.field_y, param0, this, param3, 34, uc.field_C);
                    var10 = nd.field_A;
                    if (var10 != null) {
                      if (var10.field_n instanceof df) {
                        ((df) (var10.field_n)).a(var10, (byte) 109, (se) null);
                      }
                      nd.field_A = null;
                    }
                    d.field_B = n.field_m;
                    if (!param1) {
                      return false;
                    }
                    gk.a(73, this.d(0));
                    return param2;
                  }
                  d.field_B = n.field_m;
                  if (!param1) {
                    return false;
                  }
                  gk.a(73, this.d(0));
                  return param2;
                }
              }
            }
          }
          if (0 == n.field_m &&
            0 != d.field_B) {
            this.a(ll.field_y, param0, this, param3, 34, uc.field_C);
            var11 = nd.field_A;
            if (var11 != null) {
              if (var11.field_n instanceof df) {
                ((df) (var11.field_n)).a(var11, (byte) 109, (se) null);
              }
              nd.field_A = null;
            }
            d.field_B = n.field_m;
            if (!param1) {
              return false;
            }
            gk.a(73, this.d(0));
            return param2;
          }
        }
        d.field_B = n.field_m;
        if (!param1) {
          return false;
        }
        gk.a(73, this.d(0));
        return param2;
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (!this.e(1)) {
          if (param0 > -72) {
            this.a((byte) -98, -66, '￺');
            var4 = param1;
            if (80 != var4) {
              return false;
            }
            return this.a(this, false);
          }
          var4Lifetime3 = param1;
          if (80 != var4Lifetime3) {
            return false;
          }
          return this.a(this, false);
        }
        if (this.a(this, param2, param1, -14565)) {
          return true;
        }
        if (param0 > -72) {
          this.a((byte) -98, -66, '￺');
          var4Lifetime1 = param1;
          if (80 != var4Lifetime1) {
            return false;
          }
          return this.a(this, false);
        }
        var4Lifetime2 = param1;
        if (80 != var4Lifetime2) {
          return false;
        }
        return this.a(this, false);
    }

    final void g(int param0) {
        this.b(this.field_m, param0 - 11133, this.field_k, this.field_r, this.field_i);
        if (param0 != 11213) {
          this.a(69, false, (Hashtable) null, (StringBuilder) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        var6 = Bounce.field_N;
        var4 = this.f(0);
        var5 = 0;
        while (true) {
          if (var4 < var5) {
            if (param2 <= -28) {
              var11 = ag.b(-1);
              if (var11 != null) {
                ma.field_m.a(ha.field_b, var11, mh.field_Z, true);
              }
              return;
            }
            this.a(88, (StringBuilder) null, (Hashtable) null, -53);
            var10 = ag.b(-1);
            if (var10 != null) {
              ma.field_m.a(ha.field_b, var10, mh.field_Z, true);
            }
            return;
          }
          this.a(var5, param0, 85, param1);
          var5++;
          if (var6 != 0) {
            var7 = ag.b(-1);
            if (var7 != null) {
              ma.field_m.a(ha.field_b, var7, mh.field_Z, true);
            }
            return;
          }
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
          this.c((byte) -37);
          return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 14) {
            this.a(-119, false, (Hashtable) null, (StringBuilder) null);
          }
          if (!param0.containsKey(this)) {
            param0.put(this, this);
            return true;
          }
          discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lk.PB(");
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
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_s = null;
        int var1 = 30 / ((param0 + 5) / 58);
        field_t = null;
        field_p = null;
    }

    boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.a(8, 111, 24);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.PA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, lk param5, boolean param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param6) {
            lk.b((byte) -10);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("lk.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, true, new Hashtable(), new StringBuilder()).toString();
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 0) {
          return false;
        }
        if (param0 < this.field_r + param3) {
          return false;
        }
        if (param2 + this.field_i > param4) {
          return false;
        }
        if (param0 >= param3 + this.field_r + this.field_k) {
          return false;
        }
        if (param4 < this.field_m + param2 + this.field_i) {
          return true;
        }
        return false;
    }

    boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -14565) {
            return false;
          }
          this.field_n = (sk) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("lk.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void c(byte param0) {
        if (param0 < 80) {
          this.field_j = (fc) null;
        }
    }

    protected lk() {
        this.field_v = 0;
        this.field_o = 0;
    }

    lk(String param0, fc param1, sk param2) {
        RuntimeException runtimeException = null;
        sf var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_v = 0;
        this.field_o = 0;
        try {
          this.field_h = param0;
          this.field_n = param2;
          this.field_j = param1;
          if (this.field_j instanceof sf) {
            var4 = (sf) ((Object) this.field_j);
            this.field_k = var4.a(-79925823, this);
            this.field_m = var4.a(this, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lk.<init>(");
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
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    lk(int param0, int param1, int param2, int param3, fc param4, sk param5) {
        this.field_v = 0;
        this.field_o = 0;
        try {
          this.field_k = param2;
          this.field_j = param4;
          this.field_r = param0;
          this.field_m = param3;
          this.field_n = param5;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new lj();
        field_s = "Password is valid";
    }
}
