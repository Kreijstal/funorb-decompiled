/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qa extends lh {
    boolean field_x;
    static int field_k;
    kd field_s;
    int field_u;
    int field_v;
    ch field_p;
    int field_r;
    static bi field_l;
    ne field_w;
    int field_n;
    static String field_o;
    int field_z;
    int field_j;
    int field_y;
    String field_i;
    String field_m;
    static String field_q;
    static String field_t;

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_z = param2;
        this.field_j = param3;
        if (param4 == 80) {
          this.field_u = param1;
          this.field_y = param0;
          return;
        }
        field_k = 51;
        this.field_u = param1;
        this.field_y = param0;
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, int param3) {
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
          var5_int = 122 % ((8 - param1) / 54);
          if (!param0.containsKey(this)) {
            param0.put(this, this);
            return true;
          }
          discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qa.G(");
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_t = null;
        field_q = null;
        field_l = null;
        if (param0 != 0) {
          field_q = (String) null;
        }
    }

    public final String toString() {
        return this.a(new StringBuilder(), new Hashtable(), 0, -83).toString();
    }

    StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
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
          if (param3 >= -47) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, 108, param0, param2)) {
            this.a(param2, 95, param0, param1);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qa.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -26) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qa.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 >= -85) {
            return;
          }
          var5_int = this.b(param0, param1, 0, ag.field_f, kc.field_b) ? 1 : 0;
          stackIn_5_0 = (var5_int != 0) ? 0 : 1;
          if (this.field_x) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_12_1 = (var5_int != 0);
            this.field_x = stackIn_12_1;
            if (null != this.field_s) {
              if (!(this.field_s instanceof mb)) {
                return;
              }
              ((mb) (this.field_s)).a(-12999, var5_int != 0, this);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("qa.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param0, param6, 0, param4, param2)) {
            this.field_v = param5;
          }
          if (param1) {
            return false;
          }
          this.field_p = (ch) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        try {
          try {
            eb.a("resizing", new Object[]{new Integer(param1)}, -11745, rl.a((byte) -116));
          } catch (Throwable throwable) {
          }
          int var2 = -46 % ((43 - param0) / 61);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        pk var6;
        int var7;
        pk var8;
        pk var9;
        pk var10;
        pk var11;
        pk var12;
        pk var13;
        var7 = fleas.field_A ? 1 : 0;
        this.a(param0, param3, this, (byte) -111);
        var5 = this.e(1) ? 1 : 0;
        if (!param2) {
          if (var5 != 0 &&
            jk.field_r != 0) {
            this.f(-1);
          }
        } else {
          if (al.field_f == 0) {
            sharedTailExit_2: {
              if (jk.field_r != 0) {
                if (this.a(param0, true, ob.field_e, this, pb.field_d, jk.field_r, param3)) {
                  param2 = false;
                } else {
                  if (var5 != 0) {
                    this.f(-1);
                    if (var7 != 0) {
                      param2 = false;
                      if (0 == kc.field_f &&
                        ta.field_u != 0) {
                        this.a((byte) 5, this, param3, ag.field_f, kc.field_b, param0);
                        var8 = wi.field_e;
                        if (var8 != null) {
                          if (var8.field_s instanceof vd) {
                            ((vd) (var8.field_s)).a(var8, (qj) null, (byte) -46);
                          }
                          wi.field_e = null;
                        }
                        if (jk.field_r != 0) {
                          this.f(-1);
                        }
                      }
                      break sharedTailExit_2;
                    }
                  }
                }
              }
              if (0 == kc.field_f &&
                ta.field_u != 0) {
                this.a((byte) 5, this, param3, ag.field_f, kc.field_b, param0);
                var9 = wi.field_e;
                var6 = var9;
                if (var9 != null) {
                  if (var9.field_s instanceof vd) {
                    ((vd) (var9.field_s)).a(var9, (qj) null, (byte) -46);
                  }
                  wi.field_e = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  jk.field_r != 0) {
                  this.f(-1);
                  ta.field_u = kc.field_f;
                  if (param1 < 38) {
                    return false;
                  }
                  df.a(0, this.g(4));
                  return param2;
                }
              }
            }
          } else {
            if (var5 != 0) {
              this.a(param0, this, kc.field_b, -31628, ag.field_f, param3, al.field_f);
              if (jk.field_r != 0) {
                if (this.a(param0, true, ob.field_e, this, pb.field_d, jk.field_r, param3)) {
                  param2 = false;
                } else {
                  this.f(-1);
                  if (var7 != 0) {
                    param2 = false;
                    if (0 == kc.field_f &&
                      ta.field_u != 0) {
                      this.a((byte) 5, this, param3, ag.field_f, kc.field_b, param0);
                      var12 = wi.field_e;
                      var6 = var12;
                      if (var12 != null) {
                        if (var12.field_s instanceof vd) {
                          ((vd) (var12.field_s)).a(var12, (qj) null, (byte) -46);
                        }
                        wi.field_e = null;
                      }
                      if (jk.field_r != 0) {
                        this.f(-1);
                      }
                    }
                    ta.field_u = kc.field_f;
                    if (param1 < 38) {
                      return false;
                    }
                    df.a(0, this.g(4));
                    return param2;
                  }
                }
              }
              if (0 != kc.field_f) {
                ta.field_u = kc.field_f;
                if (param1 < 38) {
                  return false;
                }
                df.a(0, this.g(4));
                return param2;
              }
              if (ta.field_u == 0) {
                ta.field_u = kc.field_f;
                if (param1 < 38) {
                  return false;
                }
                df.a(0, this.g(4));
                return param2;
              }
              this.a((byte) 5, this, param3, ag.field_f, kc.field_b, param0);
              var13 = wi.field_e;
              var6 = var13;
              if (var13 != null) {
                if (var13.field_s instanceof vd) {
                  ((vd) (var13.field_s)).a(var13, (qj) null, (byte) -46);
                }
                wi.field_e = null;
              }
              if (var7 != 0 &&
                jk.field_r != 0) {
                this.f(-1);
              }
              ta.field_u = kc.field_f;
              if (param1 < 38) {
                return false;
              }
              df.a(0, this.g(4));
              return param2;
            }
            if (jk.field_r != 0) {
              if (this.a(param0, true, ob.field_e, this, pb.field_d, jk.field_r, param3)) {
                param2 = false;
              } else {
              }
            }
            if (0 == kc.field_f) {
              if (ta.field_u == 0) {
                ta.field_u = kc.field_f;
                if (param1 < 38) {
                  return false;
                }
                df.a(0, this.g(4));
                return param2;
              }
              this.a((byte) 5, this, param3, ag.field_f, kc.field_b, param0);
              var11 = wi.field_e;
              if (var11 != null) {
                if (var11.field_s instanceof vd) {
                  ((vd) (var11.field_s)).a(var11, (qj) null, (byte) -46);
                }
                wi.field_e = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                jk.field_r != 0) {
                this.f(-1);
                ta.field_u = kc.field_f;
                if (param1 < 38) {
                  return false;
                }
                df.a(0, this.g(4));
                return param2;
              }
            }
          }
        }
        ta.field_u = kc.field_f;
        if (param1 < 38) {
          return false;
        }
        df.a(0, this.g(4));
        return param2;
    }

    void f(int param0) {
        if (param0 != -1) {
          this.field_m = (String) null;
        }
    }

    final static dd h(int param0) {
        int var1;
        byte[] var2;
        int[] var3;
        int var4_int;
        dd var4;
        int var5;
        var5 = fleas.field_A ? 1 : 0;
        var1 = ob.field_a[0] * ij.field_H[0];
        var2 = of.field_d[0];
        var3 = new int[var1];
        var4_int = 0;
        while (var1 > var4_int) {
          var3[var4_int] = rd.field_d[sc.a((int) var2[var4_int], 255)];
          var4_int++;
          if (var5 == 0) {
            continue;
          }
          break;
        }
        var4 = new dd(e.field_e, uf.field_k, vg.field_I[0], b.field_b[0], ij.field_H[0], ob.field_a[0], var3);
        c.o(-28210);
        if (param0 > 75) {
          return var4;
        }
        field_t = (String) null;
        return var4;
    }

    String g(int param0) {
        if (param0 != 4) {
          this.a('P', (byte) 48, 41);
          if (this.field_x) {
            return this.field_m;
          }
          return null;
        }
        if (this.field_x) {
          return this.field_m;
        }
        return null;
    }

    qa(String param0, kd param1) {
        this(param0, nf.field_M.field_i, param1);
    }

    final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_y).append(",").append(this.field_z).append(" ").append(this.field_u).append("x").append(this.field_j);
          if (null != this.field_i) {
            discarded$1 = param2.append(" text=\"").append(this.field_i).append('"');
          }
          if (this.field_x) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.e(1)) {
            discarded$3 = param2.append(" focused");
          }
          if (this.field_p != null) {
            discarded$4 = param2.append(" renderer=");
            if (this.field_p instanceof qa) {
              param2 = this.a(param2, param3, param0 + 1, -71);
              if (var6 != 0) {
                discarded$5 = param2.append(this.field_p);
              }
            } else {
              discarded$5 = param2.append(this.field_p);
            }
          }
          var5_int = 27 / ((param1 - 36) / 46);
          if (null != this.field_s) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_s instanceof qa)) {
              discarded$7 = param2.append(this.field_s);
              if (var6 != 0) {
                param2 = this.a(param2, param3, 1 + param0, -110);
              }
            } else {
              param2 = this.a(param2, param3, 1 + param0, -110);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("qa.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.a(this.field_y, this.field_u, this.field_z, this.field_j, 80);
        if (param0) {
          this.g(-71);
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          field_o = (String) null;
          if (0 == param3) {
            if (null != this.field_p) {
              this.field_p.a(-96, param1, true, this, param0);
            }
            return;
          }
          return;
        }
        if (0 != param3) {
          return;
        }
        if (null != this.field_p) {
          this.field_p.a(-96, param1, true, this, param0);
          return;
        }
    }

    int c(byte param0) {
        if (param0 != 8) {
          field_o = (String) null;
          return 0;
        }
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = fleas.field_A ? 1 : 0;
        var4 = this.c((byte) 8);
        var5_int = param0;
        while (var4 >= var5_int) {
          this.b(param1, param2, true, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = oe.a(param0 ^ 19007);
        if (var5 != null) {
          nf.field_M.a(param0 + 13421772, aa.field_t, var5, gg.field_f);
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.a(46, -115, (StringBuilder) null, (Hashtable) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qa.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_v = 0;
          if (param0 != 5) {
            qa.d(-24);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "qa.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (param1 > -15) {
          qa.h(111);
          if (!this.e(1)) {
            var4 = param2;
            if (80 != var4) {
              return false;
            }
            return this.a(this, -124);
          }
          if (this.a(-2, param2, this, param0)) {
            return true;
          }
          var4Lifetime3 = param2;
          if (80 != var4Lifetime3) {
            return false;
          }
          return this.a(this, -124);
        }
        if (!this.e(1)) {
          var4Lifetime1 = param2;
          if (80 != var4Lifetime1) {
            return false;
          }
          return this.a(this, -124);
        }
        if (this.a(-2, param2, this, param0)) {
          return true;
        }
        var4Lifetime2 = param2;
        if (80 != var4Lifetime2) {
          return false;
        }
        return this.a(this, -124);
    }

    boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -31628) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("qa.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 0) {
          return true;
        }
        if (param1 + this.field_y > param3) {
          return false;
        }
        if (param4 < param0 + this.field_z) {
          return false;
        }
        if (this.field_u + param1 + this.field_y <= param3) {
          return false;
        }
        if (this.field_j + param0 + this.field_z > param4) {
          return true;
        }
        return false;
    }

    protected qa() {
        this.field_n = 0;
        this.field_r = 0;
    }

    qa(String param0, ch param1, kd param2) {
        eg var4 = null;
        this.field_n = 0;
        this.field_r = 0;
        try {
          this.field_s = param2;
          this.field_i = param0;
          this.field_p = param1;
          if (this.field_p instanceof eg) {
            var4 = (eg) ((Object) this.field_p);
            this.field_u = var4.a(-110, this);
            this.field_j = var4.b(-101, this);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qa(int param0, int param1, int param2, int param3, ch param4, kd param5) {
        this.field_n = 0;
        this.field_r = 0;
        try {
          this.field_j = param3;
          this.field_y = param0;
          this.field_p = param4;
          this.field_s = param5;
          this.field_u = param2;
          this.field_z = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "qa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
          this.a(-97, -125, (qa) null, 'ﾹ');
          return false;
        }
        return false;
    }

    static {
        field_o = "<%0>Slopes:<%1> Fleas can climb these.";
        field_k = 4;
        field_q = "They can only be placed on empty squares.";
        field_t = "Passwords can only contain letters and numbers";
    }
}
