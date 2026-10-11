/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mf extends o {
    int field_r;
    static String field_x;
    int field_C;
    static hg field_m;
    String field_v;
    static String field_B;
    int field_q;
    static ci[] field_l;
    rg field_p;
    int field_A;
    int field_u;
    int field_y;
    static boolean field_o;
    jm field_n;
    int field_k;
    boolean field_w;
    static int field_z;
    String field_j;
    ub field_t;
    static rk[] field_s;

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param2, param5, param6, (byte) -117, param1)) {
            this.field_q = param0;
          }
          if (param3 == 88) {
            return false;
          }
          this.field_j = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("mf.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_z = 37;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void d(int param0) {
        int var2 = 70 % ((34 - param0) / 57);
    }

    final boolean a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!this.d((byte) -67)) {
          var4 = -101 / ((2 - param1) / 35);
          var5 = param2;
          if (var5 != 80) {
            return false;
          }
          return this.a(0, this);
        }
        if (this.a(param0, param2, -1, this)) {
          return true;
        }
        var4Lifetime1 = -101 / ((2 - param1) / 35);
        var5Lifetime1 = param2;
        if (var5Lifetime1 != 80) {
          return false;
        }
        return this.a(0, this);
    }

    boolean a(int param0, int param1, int param2, mf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 59) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("mf.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_B = null;
        field_s = null;
        field_x = null;
        if (param0 != 0) {
          return;
        }
        field_m = null;
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, boolean param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        mf var7 = null;
        var6 = Chess.field_G;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_u).append(",").append(this.field_r).append(" ").append(this.field_y).append("x").append(this.field_C);
          if (this.field_v != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_v).append('"');
          }
          if (this.field_w) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.d((byte) -67)) {
            discarded$3 = param1.append(" focused");
          }
          if (this.field_n != null) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_n instanceof mf) {
              param1 = this.a(param0, param2 + 1, param1, 1);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_n);
              }
            } else {
              discarded$5 = param1.append(this.field_n);
            }
          }
          if (this.field_p != null) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_p instanceof mf)) {
              discarded$7 = param1.append(this.field_p);
              if (var6 != 0) {
                param1 = this.a(param0, 1 + param2, param1, 1);
              }
            } else {
              param1 = this.a(param0, 1 + param2, param1, 1);
            }
          }
          if (param3) {
            var7 = (mf) null;
            this.a(107, 21, -55, (byte) -96, (mf) null, -117, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("mf.WB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(pf param0, int param1) {
        try {
          ka.field_a.a(false, param0, param1 + 113);
          if (param1 != 0) {
            field_m = (hg) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "mf.UB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        return this.a(new Hashtable(), 0, new StringBuilder(), 1).toString();
    }

    void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_q = param4;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "mf.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(byte param0) {
        if (param0 <= 89) {
          return;
        }
        this.a(this.field_r, 34, this.field_C, this.field_y, this.field_u);
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var7;
        kb var8;
        kb var9;
        kb var11;
        kb var12;
        kb var19;
        var7 = Chess.field_G;
        this.a(param2, -87, this, param1);
        if (param0 >= -116) {
          return true;
        }
        L0: {
          var5 = this.d((byte) -67) ? 1 : 0;
          if (param3) {
            if (0 != fl.field_p) {
              if (var5 == 0) {
                if (0 == th.field_d) {
                  if (((wh.field_f == 0)) &&
                    ((on.field_h != 0))) {
                    this.a(rf.field_b, this, param2, hn.field_k, 0, param1);
                    var8 = vj.field_a;
                    if (var8 != null) {
                      if (!(var8.field_p instanceof cj)) {
                        vj.field_a = null;
                      } else {
                        ((cj) (var8.field_p)).a(var8, -10925, (ji) null);
                        vj.field_a = null;
                      }
                    }
                    if (var7 != 0 &&
                      var5 != 0 &&
                      th.field_d != 0) {
                      this.d(102);
                    }
                  }
                } else {
                  if (this.a(th.field_d, re.field_m, ag.field_f, (byte) 88, this, param1, param2)) {
                    param3 = false;
                  }
                  if (((wh.field_f == 0)) &&
                    ((on.field_h != 0))) {
                    this.a(rf.field_b, this, param2, hn.field_k, 0, param1);
                    var9 = vj.field_a;
                    if (var9 != null) {
                      if (!(var9.field_p instanceof cj)) {
                        vj.field_a = null;
                      } else {
                        ((cj) (var9.field_p)).a(var9, -10925, (ji) null);
                        vj.field_a = null;
                      }
                    }
                  }
                }
                break L0;
              }
              this.a(78, fl.field_p, param1, this, param2, rf.field_b, hn.field_k);
            }
            if (0 == th.field_d) {
              if (((wh.field_f == 0)) &&
                ((on.field_h != 0))) {
                this.a(rf.field_b, this, param2, hn.field_k, 0, param1);
                var11 = vj.field_a;
                if (var11 == null) {
                  if (((var7 != 0)) &&
                    ((var5 != 0)) &&
                    ((th.field_d != 0))) {
                    this.d(102);
                  }
                } else {
                  if (!(var11.field_p instanceof cj)) {
                    vj.field_a = null;
                    if (((var7 != 0)) &&
                      ((var5 != 0)) &&
                      ((th.field_d != 0))) {
                      this.d(102);
                    }
                  } else {
                    ((cj) (var11.field_p)).a(var11, -10925, (ji) null);
                    vj.field_a = null;
                    if (((var7 != 0)) &&
                      ((var5 != 0)) &&
                      ((th.field_d != 0))) {
                      this.d(102);
                    }
                  }
                }
              }
              break L0;
            }
            if (!this.a(th.field_d, re.field_m, ag.field_f, (byte) 88, this, param1, param2)) {
              if (var5 == 0) {
                if (((wh.field_f == 0)) &&
                  ((on.field_h != 0))) {
                  this.a(rf.field_b, this, param2, hn.field_k, 0, param1);
                  var12 = vj.field_a;
                  if (var12 == null) {
                    if (var7 != 0 &&
                      var5 != 0 &&
                      th.field_d != 0) {
                      this.d(102);
                      break L0;
                    }
                  } else {
                    if (!(var12.field_p instanceof cj)) {
                      vj.field_a = null;
                      if (var7 != 0 &&
                        var5 != 0 &&
                        th.field_d != 0) {
                        this.d(102);
                      }
                    } else {
                      ((cj) (var12.field_p)).a(var12, -10925, (ji) null);
                      vj.field_a = null;
                    }
                  }
                }
                break L0;
              }
              this.d(115);
              if (var7 != 0) {
                param3 = false;
              }
            } else {
              param3 = false;
            }
            if ((wh.field_f == 0) &&
              (on.field_h != 0)) {
              this.a(rf.field_b, this, param2, hn.field_k, 0, param1);
              var19 = vj.field_a;
              if (var19 != null) {
                if (!(var19.field_p instanceof cj)) {
                  vj.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    th.field_d != 0) {
                    this.d(102);
                    break L0;
                  }
                } else {
                  ((cj) (var19.field_p)).a(var19, -10925, (ji) null);
                  vj.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    th.field_d != 0) {
                    this.d(102);
                    break L0;
                  }
                }
                break L0;
              }
              if ((var7 != 0) && (var5 != 0 &&
                th.field_d != 0)) {
                this.d(102);
              }
            }
          } else {
            if (var5 != 0 &&
              th.field_d != 0) {
              this.d(102);
            }
          }
        }
        on.field_h = wh.field_f;
        sb.a(this.g(0), true);
        return param3;
    }

    String g(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return !this.field_w ? null : this.field_j;
    }

    void a(int param0, int param1, mf param2, int param3) {
        int var5_int = 0;
        mf var6 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(rf.field_b, param3, param0, (byte) -117, hn.field_k) ? 1 : 0;
          stackIn_2_0 = this.field_w;
          if (var5_int != 0) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_8_1 = (var5_int != 0);
            this.field_w = stackIn_8_1;
            if (null != this.field_p &&
              this.field_p instanceof qg) {
              ((qg) (this.field_p)).a(this, var5_int != 0, 92);
            }
          }
          if (param1 > -6) {
            var6 = (mf) null;
            this.a(67, 95, -96, (mf) null, 27, -113, 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("mf.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    mf(String param0, rg param1) {
        this(param0, a.field_a.field_f, param1);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -80) {
          return;
        }
        if (param1 != 0) {
          return;
        }
        if (null != this.field_n) {
          this.field_n.a((byte) 126, param3, param0, true, this);
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_y = param3;
        this.field_C = param2;
        if (param1 == 34) {
          this.field_r = param0;
          this.field_u = param4;
          return;
        }
        mf var7 = (mf) null;
        this.a(-106, (mf) null, 9, 48, 115, -76);
        this.field_r = param0;
        this.field_u = param4;
    }

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param3 != -117) {
          mf.f(-121);
          if (this.field_u + param2 > param4) {
            return false;
          }
          if (param1 + this.field_r > param0) {
            return false;
          }
          if (this.field_y + (param2 + this.field_u) <= param4) {
            return false;
          }
          if (param0 >= this.field_C + (param1 + this.field_r)) {
            return false;
          }
          return true;
        }
        if (this.field_u + param2 > param4) {
          return false;
        }
        if (param1 + this.field_r > param0) {
          return false;
        }
        stackIn_18_0 = (this.field_y + (param2 + this.field_u) > param4) && (param0 < this.field_C + (param1 + this.field_r));
        return stackIn_18_0;
    }

    boolean d(byte param0) {
        if (param0 != -67) {
          this.toString();
          return false;
        }
        return false;
    }

    final static void e(int param0) {
        ld.a("", (String) null, 0);
        if (param0 < 76) {
          pf var2 = (pf) null;
          mf.a((pf) null, 89);
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -3) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, 58, false);
          }
          if (param1.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param1.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mf.PB(").append(param0).append(',');
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
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 8308) {
          return -18;
        }
        if (param1 != 1) {
          return fj.field_f[param1];
        }
        if (sh.a(14222, param0)) {
          return 29;
        }
        return fj.field_f[param1];
    }

    int a(boolean param0) {
        if (!param0) {
          StringBuilder var3 = (StringBuilder) null;
          this.a((Hashtable) null, -62, (StringBuilder) null, -111);
          return 0;
        }
        return 0;
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, param0, param2, -34)) {
            this.a(param0, param2, param1, false);
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mf.WA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("mf.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Chess.field_G;
        var4 = this.a(param0);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.a(param1, var5_int, -84, param2);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = lc.d((byte) 60);
        if (!param0) {
          mf.f(118);
        }
        if (var5 == null) {
          return;
        }
        a.field_a.a(var5, fm.field_S, 106, vn.field_Db);
    }

    protected mf() {
        this.field_k = 0;
        this.field_A = 0;
    }

    mf(String param0, jm param1, rg param2) {
        mg var4 = null;
        this.field_k = 0;
        this.field_A = 0;
        try {
          this.field_p = param2;
          this.field_v = param0;
          this.field_n = param1;
          if (this.field_n instanceof mg) {
            var4 = (mg) ((Object) this.field_n);
            this.field_y = var4.a((byte) -119, this);
            this.field_C = var4.a(true, this);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    mf(int param0, int param1, int param2, int param3, jm param4, rg param5) {
        this.field_k = 0;
        this.field_A = 0;
        try {
          this.field_u = param0;
          this.field_n = param4;
          this.field_y = param2;
          this.field_C = param3;
          this.field_r = param1;
          this.field_p = param5;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "mf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "Accept draw";
        field_B = "Please remove <%0> from your friend list first.";
        field_m = new hg(11, 0, 1, 2);
    }
}
