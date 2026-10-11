/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pk extends ms {
    String field_t;
    boolean field_k;
    int field_q;
    int field_n;
    ag field_u;
    int field_v;
    int field_p;
    String field_m;
    int field_s;
    qm field_o;
    int field_r;
    int field_l;
    mh field_w;

    final void a(int param0, int param1, boolean param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var4 = this.e(93);
        var5_int = 0;
        while (var5_int <= var4) {
          this.a(param1, param0, (byte) -110, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = jd.e(102);
        if (var5 != null) {
          ks.field_x.a(za.field_k, 13421772, hq.field_b, var5);
        }
        if (!param2) {
          return;
        }
        this.field_s = 113;
    }

    void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_l = 0;
          if (param1) {
            this.field_p = 20;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pk.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param1.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (param0 != -24) {
            pk.d((byte) -20);
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("pk.NB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        this.a(-57, this.field_r, this.field_v, this.field_p, this.field_q);
        if (param0) {
          this.field_t = (String) null;
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            this.toString();
          }
          if (this.a(param0, param1, -123, param2)) {
            this.a(param0, (byte) -128, param2, param1);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pk.S(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_q = param4;
        this.field_v = param2;
        int var6 = -104 % ((param0 - 28) / 63);
        this.field_p = param3;
        this.field_r = param1;
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = 66 % ((-25 - param1) / 45);
          var6 = this.b(ko.field_p, -1, param0, pi.field_e, param3) ? 1 : 0;
          stackIn_3_0 = (this.field_k) ? 0 : 1;
          if (var6 != 0) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_11_1 = (var6 != 0);
            this.field_k = stackIn_11_1;
            if (this.field_o != null &&
              this.field_o instanceof bd) {
              ((bd) (this.field_o)).a(103, var6 != 0, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("pk.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
          var5_int = 110 / ((param2 + 73) / 48);
          if (!param1.containsKey(this)) {
            param1.put(this, this);
            return true;
          }
          discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pk.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        if (vs.b((byte) 9)) {
          if (param0 >= -15) {
            pk.d((byte) -33);
            return;
          }
          return;
        }
        ah.field_g = kc.c(-5204);
        if (null != ah.field_g) {
          pd.a(ah.field_g, 6, 5412);
          if (param0 >= -15) {
            pk.d((byte) -33);
            return;
          }
          return;
        }
        if (param0 < -15) {
          return;
        }
        pk.d((byte) -33);
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var7;
        jh var8;
        jh var9;
        jh var10;
        jh var11;
        jh var12;
        jh var13;
        jh var14;
        var7 = Sumoblitz.field_L ? 1 : 0;
        this.a(param1, -71, this, param0);
        var5 = this.d(param3 ^ 0) ? 1 : 0;
        if (param3 != -1) {
          this.field_n = 102;
          if (!param2) {
            if (var5 != 0 &&
              0 != hk.field_c) {
              this.c((byte) 115);
            }
          } else {
            if (0 == pn.field_r) {
              if (hk.field_c != 0) {
                if (!this.a(this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                  if (var5 != 0) {
                    this.c((byte) -116);
                    if (var7 != 0) {
                      param2 = false;
                    }
                  }
                } else {
                  param2 = false;
                }
              }
              if (ar.field_G == 0 &&
                ml.field_l != 0) {
                this.a(this, false, param1, pi.field_e, ko.field_p, param0);
                var8 = gt.field_gb;
                if (var8 != null) {
                  if (var8.field_o instanceof sf) {
                    ((sf) (var8.field_o)).a(var8, (st) null, 20302);
                  }
                  gt.field_gb = null;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  0 != hk.field_c) {
                  this.c((byte) 115);
                }
              }
            } else {
              if (var5 == 0) {
                if (hk.field_c != 0 &&
                  this.a(this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                  param2 = false;
                }
                if (ar.field_G == 0 &&
                  ml.field_l != 0) {
                  this.a(this, false, param1, pi.field_e, ko.field_p, param0);
                  var9 = gt.field_gb;
                  if (var9 != null) {
                    if (var9.field_o instanceof sf) {
                      ((sf) (var9.field_o)).a(var9, (st) null, 20302);
                    }
                    gt.field_gb = null;
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != hk.field_c) {
                    this.c((byte) 115);
                  }
                }
              } else {
                this.a(param0, pn.field_r, -1, param1, pi.field_e, this, ko.field_p);
                if (hk.field_c != 0) {
                  if (!this.a(this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                    this.c((byte) -116);
                    if (var7 != 0) {
                      param2 = false;
                    }
                  } else {
                    param2 = false;
                  }
                }
                if (ar.field_G == 0 &&
                  ml.field_l != 0) {
                  this.a(this, false, param1, pi.field_e, ko.field_p, param0);
                  var10 = gt.field_gb;
                  if (var10 != null) {
                    if (var10.field_o instanceof sf) {
                      ((sf) (var10.field_o)).a(var10, (st) null, 20302);
                    }
                    gt.field_gb = null;
                  }
                  if (var7 != 0 &&
                    0 != hk.field_c) {
                    this.c((byte) 115);
                  }
                }
              }
            }
          }
        } else {
          L0: {
            if (param2) {
              if (0 != pn.field_r &&
                var5 != 0) {
                this.a(param0, pn.field_r, -1, param1, pi.field_e, this, ko.field_p);
                if (hk.field_c != 0) {
                  if (!this.a(this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                    this.c((byte) -116);
                    if (var7 != 0) {
                      param2 = false;
                    }
                  } else {
                    param2 = false;
                  }
                }
                if (ar.field_G != 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                if (ml.field_l == 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                this.a(this, false, param1, pi.field_e, ko.field_p, param0);
                var11 = gt.field_gb;
                if (var11 != null) {
                  if (!(var11.field_o instanceof sf)) {
                    gt.field_gb = null;
                  } else {
                    ((sf) (var11.field_o)).a(var11, (st) null, 20302);
                    gt.field_gb = null;
                  }
                }
                if (var7 == 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                if (0 == hk.field_c) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                this.c((byte) 115);
                ml.field_l = ar.field_G;
                ek.a(this.c(-6696), -124);
                return param2;
              }
              if (hk.field_c == 0) {
                if (ar.field_G != 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                if (ml.field_l == 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                this.a(this, false, param1, pi.field_e, ko.field_p, param0);
                var12 = gt.field_gb;
                if (var12 == null) {
                  if (var7 == 0) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  if (var5 == 0) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  if (0 == hk.field_c) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  this.c((byte) 115);
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                if (!(var12.field_o instanceof sf)) {
                  gt.field_gb = null;
                  if (var7 == 0) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  if (var5 == 0) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  if (0 == hk.field_c) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  this.c((byte) 115);
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                ((sf) (var12.field_o)).a(var12, (st) null, 20302);
                gt.field_gb = null;
                if (var7 == 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                if (var5 == 0) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                if (0 == hk.field_c) {
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                this.c((byte) 115);
                ml.field_l = ar.field_G;
                ek.a(this.c(-6696), -124);
                return param2;
              }
              if (!this.a(this, param3 ^ 80, jc.field_f, hk.field_c, param1, nb.field_a, param0)) {
                if (var5 == 0) {
                  if (ar.field_G != 0) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  if (ml.field_l == 0) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  this.a(this, false, param1, pi.field_e, ko.field_p, param0);
                  var13 = gt.field_gb;
                  if (var13 == null) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  if (!(var13.field_o instanceof sf)) {
                    gt.field_gb = null;
                    if (var7 != 0 &&
                      var5 != 0 &&
                      0 != hk.field_c) {
                      this.c((byte) 115);
                    }
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  ((sf) (var13.field_o)).a(var13, (st) null, 20302);
                  gt.field_gb = null;
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                this.c((byte) -116);
                if (var7 != 0) {
                  param2 = false;
                }
              } else {
                param2 = false;
              }
              if (ar.field_G != 0) {
                break L0;
              }
              if (ml.field_l == 0) {
                break L0;
              }
              this.a(this, false, param1, pi.field_e, ko.field_p, param0);
              var14 = gt.field_gb;
              if (var14 != null) {
                if (!(var14.field_o instanceof sf)) {
                  gt.field_gb = null;
                  if (var7 != 0 &&
                    var5 != 0) {
                    if (0 == hk.field_c) {
                      ml.field_l = ar.field_G;
                      ek.a(this.c(-6696), -124);
                      return param2;
                    }
                    this.c((byte) 115);
                  }
                  ml.field_l = ar.field_G;
                  ek.a(this.c(-6696), -124);
                  return param2;
                }
                ((sf) (var14.field_o)).a(var14, (st) null, 20302);
                gt.field_gb = null;
                if (var7 != 0 &&
                  var5 != 0) {
                  if (0 == hk.field_c) {
                    ml.field_l = ar.field_G;
                    ek.a(this.c(-6696), -124);
                    return param2;
                  }
                  this.c((byte) 115);
                }
                ml.field_l = ar.field_G;
                ek.a(this.c(-6696), -124);
                return param2;
              }
              if (var7 == 0) {
                break L0;
              }
            }
            if (var5 != 0) {
              if (0 == hk.field_c) {
                ml.field_l = ar.field_G;
                ek.a(this.c(-6696), -124);
                return param2;
              }
              this.c((byte) 115);
            }
          }
        }
        ml.field_l = ar.field_G;
        ek.a(this.c(-6696), -124);
        return param2;
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -42) {
            return true;
          }
          if (!this.b(param5, -1, param4, param2, param6)) {
            return false;
          }
          this.field_l = param3;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("pk.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param1 != -1) {
          this.a(-12, -50, (byte) 63, 31);
          if (this.field_r + param2 > param0) {
            return false;
          }
          if (this.field_v + param4 > param3) {
            return false;
          }
          if (param0 >= this.field_q + this.field_r + param2) {
            return false;
          }
          if (this.field_p + (param4 + this.field_v) <= param3) {
            return false;
          }
          return true;
        }
        if (this.field_r + param2 > param0) {
          return false;
        }
        if (this.field_v + param4 > param3) {
          return false;
        }
        stackIn_18_0 = (param0 < this.field_q + this.field_r + param2) && (this.field_p + (param4 + this.field_v) > param3);
        return stackIn_18_0;
    }

    boolean d(int param0) {
        if (param0 != -1) {
          this.field_w = (mh) null;
          return false;
        }
        return false;
    }

    final void a(int param0, byte param1, StringBuilder param2, Hashtable param3) {
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_v).append(" ").append(this.field_q).append("x").append(this.field_p);
          if (param1 != -128) {
            return;
          }
          if (this.field_m != null) {
            discarded$1 = param2.append(" text=\"").append(this.field_m).append('"');
          }
          if (this.field_k) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.d(-1)) {
            discarded$3 = param2.append(" focused");
          }
          if (null != this.field_w) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_w instanceof pk)) {
              discarded$5 = param2.append(this.field_w);
              if (var6 != 0) {
                param2 = this.a(param0 + 1, param3, param2, 0);
              }
            } else {
              param2 = this.a(param0 + 1, param3, param2, 0);
            }
          }
          if (this.field_o != null) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_o instanceof pk)) {
              discarded$7 = param2.append(this.field_o);
              if (var6 == 0) {
                return;
              }
            }
            param2 = this.a(param0 + 1, param3, param2, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("pk.OB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("pk.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param6).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void a(int param0, int param1, byte param2, int param3) {
        pk var6 = null;
        pk var6Lifetime1;
        pk var6Lifetime2;
        if (param3 != 0) {
          if (param2 < -35) {
            return;
          }
          var6 = (pk) null;
          this.a((pk) null, (byte) -58);
          return;
        }
        if (this.field_w == null) {
          if (param2 < -35) {
            return;
          }
          var6Lifetime1 = (pk) null;
          this.a((pk) null, (byte) -58);
          return;
        }
        this.field_w.a(this, param1, 5592405, true, param0);
        if (param2 < -35) {
          return;
        }
        var6Lifetime2 = (pk) null;
        this.a((pk) null, (byte) -58);
    }

    pk(String param0, qm param1) {
        this(param0, ks.field_x.field_e, param1);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 52) {
          return true;
        }
        return 0 != (param0 & 52) ? true : false;
    }

    boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 61) {
            return false;
          }
          this.toString();
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pk.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void c(byte param0) {
        int var2 = -25 / ((64 - param0) / 51);
    }

    int e(int param0) {
        int var2 = -90 / ((-10 - param0) / 46);
        return 0;
    }

    final boolean a(char param0, int param1, boolean param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (!this.d(-1)) {
          if (!param2) {
            this.a(-3, -1, (byte) 78, -21);
            var4 = param1;
            if (var4 == 80) {
              return this.a(this, (byte) 61);
            }
            return false;
          }
          var4Lifetime3 = param1;
          if (var4Lifetime3 == 80) {
            return this.a(this, (byte) 61);
          }
          return false;
        }
        if (this.a(this, param0, (byte) 108, param1)) {
          return true;
        }
        if (!param2) {
          this.a(-3, -1, (byte) 78, -21);
          var4Lifetime1 = param1;
          if (var4Lifetime1 == 80) {
            return this.a(this, (byte) 61);
          }
          return false;
        }
        var4Lifetime2 = param1;
        if (var4Lifetime2 == 80) {
          return this.a(this, (byte) 61);
        }
        return false;
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > 9) {
            return false;
          }
          this.field_k = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pk.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String c(int param0) {
        if (param0 == -6696) {
          return !this.field_k ? null : this.field_t;
        }
        this.field_n = -60;
        return !this.field_k ? null : this.field_t;
    }

    protected pk() {
        this.field_n = 0;
        this.field_s = 0;
    }

    pk(String param0, mh param1, qm param2) {
        RuntimeException runtimeException = null;
        de var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_n = 0;
        this.field_s = 0;
        try {
          this.field_w = param1;
          this.field_m = param0;
          this.field_o = param2;
          if (this.field_w instanceof de) {
            var4 = (de) ((Object) this.field_w);
            this.field_q = var4.a(this, (byte) 83);
            this.field_p = var4.b(this, (byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pk.<init>(");
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
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    pk(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        this.field_n = 0;
        this.field_s = 0;
        try {
          this.field_r = param0;
          this.field_o = param5;
          this.field_p = param3;
          this.field_w = param4;
          this.field_v = param1;
          this.field_q = param2;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
