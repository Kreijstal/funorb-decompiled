/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class cf extends br {
    int field_n;
    String field_x;
    static String field_v;
    int field_u;
    static String field_p;
    boolean field_l;
    static rl field_s;
    int field_q;
    static String field_m;
    static String field_t;
    int field_w;
    int field_z;
    bj field_A;
    int field_y;
    nl field_h;
    mp field_k;
    static long field_g;
    String field_j;
    static String[] field_f;
    static String field_o;
    static boolean field_r;
    int field_i;

    final static void d(int param0) {
        qa var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          dc.field_Fb = 0;
          fn.field_d = 0;
          ta.field_ob = null;
          ro.field_M.e(param0 ^ 22926);
          jf.field_d.e(-30986);
          if (param0 != -8328) {
            field_o = (String) null;
          }
          var1 = ol.field_o.a((byte) 7);
          while (true) {
            if (var1 != null) {
              var1.a(-4564);
              var1 = ol.field_o.c((byte) 112);
              if (var2 == 0) {
                continue;
              }
              break;
            }
            var1 = bh.field_f.a((byte) 7);
            break;
          }
          while (var1 != null) {
            var1.a(param0 ^ 12628);
            var1 = bh.field_f.c((byte) 104);
            if (var2 != 0) {
              return;
            }
          }
          ge.field_zb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "cf.RB(" + param0 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        sc.field_j.field_wb = param1;
        ee.field_a = true;
        int var2_int = dl.field_h.field_h;
        int var3 = dl.field_h.field_f;
        int var4 = sc.field_j.field_yb.a(param1, 272, sc.field_j.field_J);
        int var5 = -(var4 / 2) + 7 + (-110 + var3 / 2);
        lm.field_gb.a(-(2 * var5) + var3 - 120, var5, 320, (-320 + var2_int) / 2, -3344);
        lm.field_gb.field_ab = tg.a(2105376, lm.field_gb.field_z, 8421504, 3, 11579568, 114);
        sc.field_j.a(-20 + (lm.field_gb.field_z - 24), 16, -24 + lm.field_gb.field_zb - 24, 24, -3344);
        if (param0 >= -6) {
          return;
        }
        try {
          kn.field_a.a(24, -24 + (-20 + lm.field_gb.field_z), 80, 120, -3344);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "cf.CC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        this.b(this.field_y, this.field_i, 28972, this.field_n, this.field_w);
        if (param0 != -1) {
          field_m = (String) null;
          return;
        }
    }

    cf(String param0, bj param1) {
        this(param0, ra.field_o.field_s, param1);
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
          if (this.a(param1, -24, param3, param2)) {
            this.a(param2, param3, (byte) 26, param1);
          }
          if (param0 == 7) {
            stackIn_6_0 = (StringBuilder) (param3);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("cf.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        try {
          if (!param4) {
            field_g = 71L;
          }
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "cf.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -62 / ((param0 - 48) / 37);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("cf.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2, boolean param3) {
        int var5;
        int var7;
        ua var8;
        ua var9;
        ua var10;
        ua var11;
        ua var12;
        ua var13;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          this.a(-5407, this, param0, param2);
          var5 = this.c(127) ? 1 : 0;
          if (param3) {
            if (t.field_d == 0) {
              if (kd.field_b == 0) {
                if (0 == pq.field_f &&
                  aj.field_j != 0) {
                  this.a(bd.field_g, this, param2, bo.field_d, true, param0);
                  var8 = qi.field_a;
                  if (var8 != null) {
                    if (!(var8.field_A instanceof vq)) {
                      qi.field_a = null;
                    } else {
                      ((vq) (var8.field_A)).a(var8, (byte) 5, (sd) null);
                      qi.field_a = null;
                    }
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != kd.field_b) {
                    this.c((byte) 32);
                  }
                }
                aj.field_j = pq.field_f;
                ii.a(-16898, this.d((byte) -51));
                if (param1 != -27) {
                  this.field_w = -89;
                }
                return param3;
              }
              if (!this.a(ka.field_t, vb.field_f, kd.field_b, this, -24, param0, param2)) {
                if (var5 == 0) {
                  if (0 == pq.field_f &&
                    aj.field_j != 0) {
                    this.a(bd.field_g, this, param2, bo.field_d, true, param0);
                    var9 = qi.field_a;
                    if (var9 != null) {
                      if (!(var9.field_A instanceof vq)) {
                        qi.field_a = null;
                      } else {
                        ((vq) (var9.field_A)).a(var9, (byte) 5, (sd) null);
                        qi.field_a = null;
                      }
                    }
                    if (var7 != 0 &&
                      var5 != 0 &&
                      0 != kd.field_b) {
                      this.c((byte) 32);
                    }
                  }
                  aj.field_j = pq.field_f;
                  ii.a(-16898, this.d((byte) -51));
                  if (param1 != -27) {
                    this.field_w = -89;
                  }
                  return param3;
                }
                this.c((byte) 32);
                if (var7 != 0) {
                  param3 = false;
                }
              } else {
                param3 = false;
              }
              if (0 == pq.field_f &&
                aj.field_j != 0) {
                this.a(bd.field_g, this, param2, bo.field_d, true, param0);
                var10 = qi.field_a;
                if (var10 != null) {
                  if (!(var10.field_A instanceof vq)) {
                    qi.field_a = null;
                    if (var7 != 0 &&
                      var5 != 0 &&
                      0 != kd.field_b) {
                      this.c((byte) 32);
                    }
                    aj.field_j = pq.field_f;
                    ii.a(-16898, this.d((byte) -51));
                    if (param1 != -27) {
                      this.field_w = -89;
                    }
                    return param3;
                  }
                  ((vq) (var10.field_A)).a(var10, (byte) 5, (sd) null);
                  qi.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != kd.field_b) {
                    this.c((byte) 32);
                  }
                  aj.field_j = pq.field_f;
                  ii.a(-16898, this.d((byte) -51));
                  if (param1 != -27) {
                    this.field_w = -89;
                  }
                  return param3;
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  0 != kd.field_b) {
                  this.c((byte) 32);
                  aj.field_j = pq.field_f;
                  ii.a(-16898, this.d((byte) -51));
                  if (param1 != -27) {
                    this.field_w = -89;
                  }
                  return param3;
                }
              }
              break L0;
            }
            if (var5 != 0) {
              this.a((byte) -111, t.field_d, bo.field_d, param0, param2, bd.field_g, this);
            }
            if (kd.field_b == 0) {
              if (0 != pq.field_f) {
                aj.field_j = pq.field_f;
                ii.a(-16898, this.d((byte) -51));
                if (param1 != -27) {
                  this.field_w = -89;
                }
                return param3;
              }
              if (aj.field_j != 0) {
                this.a(bd.field_g, this, param2, bo.field_d, true, param0);
                var11 = qi.field_a;
                if (var11 != null) {
                  if (!(var11.field_A instanceof vq)) {
                    qi.field_a = null;
                  } else {
                    ((vq) (var11.field_A)).a(var11, (byte) 5, (sd) null);
                    qi.field_a = null;
                  }
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  0 != kd.field_b) {
                  this.c((byte) 32);
                }
              }
              aj.field_j = pq.field_f;
              ii.a(-16898, this.d((byte) -51));
              if (param1 != -27) {
                this.field_w = -89;
              }
              return param3;
            }
            if (!this.a(ka.field_t, vb.field_f, kd.field_b, this, -24, param0, param2)) {
              if (var5 == 0) {
                if (0 == pq.field_f &&
                  aj.field_j != 0) {
                  this.a(bd.field_g, this, param2, bo.field_d, true, param0);
                  var12 = qi.field_a;
                  if (var12 != null) {
                    if (!(var12.field_A instanceof vq)) {
                      qi.field_a = null;
                    } else {
                      ((vq) (var12.field_A)).a(var12, (byte) 5, (sd) null);
                      qi.field_a = null;
                    }
                  }
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != kd.field_b) {
                    this.c((byte) 32);
                  }
                }
                break L0;
              }
              this.c((byte) 32);
              if (var7 != 0) {
                param3 = false;
              }
            } else {
              param3 = false;
            }
            if ((0 == pq.field_f) &&
              (aj.field_j != 0)) {
              this.a(bd.field_g, this, param2, bo.field_d, true, param0);
              var13 = qi.field_a;
              if (var13 != null) {
                if (!(var13.field_A instanceof vq)) {
                  qi.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != kd.field_b) {
                    this.c((byte) 32);
                    break L0;
                  }
                } else {
                  ((vq) (var13.field_A)).a(var13, (byte) 5, (sd) null);
                  qi.field_a = null;
                  if (var7 != 0 &&
                    var5 != 0 &&
                    0 != kd.field_b) {
                    this.c((byte) 32);
                    break L0;
                  }
                }
                break L0;
              }
              if ((var7 != 0) && (var5 != 0 &&
                0 != kd.field_b)) {
                this.c((byte) 32);
              }
            }
          } else {
            if (var5 != 0 &&
              0 != kd.field_b) {
              this.c((byte) 32);
            }
          }
        }
        aj.field_j = pq.field_f;
        ii.a(-16898, this.d((byte) -51));
        if (param1 == -27) {
          return param3;
        }
        this.field_w = -89;
        return param3;
    }

    boolean c(int param0) {
        if (param0 <= 123) {
          this.f((byte) -51);
          return false;
        }
        return false;
    }

    final void a(int param0, StringBuilder param1, byte param2, Hashtable param3) {
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_y).append(",").append(this.field_i).append(" ").append(this.field_n).append("x").append(this.field_w);
          if (this.field_j != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_j).append('"');
          }
          if (this.field_l) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.c(param2 + 98)) {
            discarded$3 = param1.append(" focused");
          }
          if (this.field_h != null) {
            discarded$4 = param1.append(" renderer=");
            if (!(this.field_h instanceof cf)) {
              discarded$5 = param1.append(this.field_h);
              if (var6 != 0) {
                param1 = this.a(7, param3, 1 + param0, param1);
              }
            } else {
              param1 = this.a(7, param3, 1 + param0, param1);
            }
          }
          if (param2 != 26) {
            return;
          }
          if (null != this.field_A) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_A instanceof cf)) {
              discarded$7 = param1.append(this.field_A);
              if (var6 != 0) {
                param1 = this.a(7, param3, param0 + 1, param1);
              }
            } else {
              param1 = this.a(7, param3, param0 + 1, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("cf.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.f((byte) 44);
        var5_int = 0;
        while (var5_int <= var4) {
          this.a(-2, param1, var5_int, param2);
          var5_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        var5 = up.a(-19);
        if (var5 != null) {
          ra.field_o.a(tf.field_Db, var5, bl.field_c, (byte) 95);
        }
        var6 = 46 % ((param0 + 30) / 47);
    }

    boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          this.field_y = -78;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cf.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != -2) {
          this.field_n = -82;
          if (param2 == 0) {
            if (this.field_h != null) {
              this.field_h.a(true, param1, -15112, param3, this);
            }
            return;
          }
          return;
        }
        if (param2 == 0) {
          if (this.field_h != null) {
            this.field_h.a(true, param1, -15112, param3, this);
          }
          return;
        }
    }

    int f(byte param0) {
        if (param0 == 44) {
          return 0;
        }
        cf var3 = (cf) null;
        this.a(-73, 92, -41, (cf) null, 104, -40, -53);
        return 0;
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == -6208) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("cf.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 < -61) {
          field_o = null;
          field_p = null;
          field_m = null;
          field_f = null;
          field_s = null;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 72 % ((44 - param0) / 36);
        if (param1 + this.field_y > param2) {
          return false;
        }
        if (param3 < param4 + this.field_i) {
          return false;
        }
        if (param2 >= param1 + this.field_y + this.field_n) {
          return false;
        }
        if (param3 < this.field_w + this.field_i + param4) {
          return true;
        }
        return false;
    }

    void a(int param0, cf param1, int param2, int param3) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != -5407) {
            return;
          }
          var5_int = this.a(param0 ^ 5437, param2, bd.field_g, bo.field_d, param3) ? 1 : 0;
          if ((this.field_l ? 1 : 0) != var5_int) {
            stackIn_7_1 = (var5_int != 0);
            this.field_l = stackIn_7_1;
            if (this.field_A != null &&
              this.field_A instanceof ar) {
              ((ar) (this.field_A)).a(this, -14339, var5_int != 0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("cf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
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
          var5_int = 0 / ((param1 - 61) / 45);
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
          stackIn_7_1 = new StringBuilder().append("cf.BC(");
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    void c(byte param0) {
        if (param0 == 32) {
          return;
        }
        this.field_q = 74;
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(-88, param5, param1, param0, param6)) {
            this.field_u = param2;
          }
          if (param4 == -24) {
            return false;
          }
          field_p = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        String var5 = null;
        String var5Lifetime1;
        String var5Lifetime2;
        if (bk.field_i == null) {
          if (!param2) {
            var5 = (String) null;
            cf.a((byte) -35, (String) null);
            return;
          }
          return;
        }
        int var3 = bk.field_i.a((byte) -58, param1);
        if (var3 == -2) {
          if (!param2) {
            var5Lifetime1 = (String) null;
            cf.a((byte) -35, (String) null);
            return;
          }
          return;
        }
        if (var3 != -1) {
          var4 = bk.field_i.i(-23217) ? 1 : 0;
          ed.a(bk.field_i.h(-26895), bk.field_i.field_Fb, param0, var3, var4 != 0, 21965);
        }
        bk.field_i = null;
        q.b(80);
        if (!param2) {
          var5Lifetime2 = (String) null;
          cf.a((byte) -35, (String) null);
          return;
        }
    }

    public final String toString() {
        return this.a(7, new Hashtable(), 0, new StringBuilder()).toString();
    }

    String d(byte param0) {
        int var2 = 32 / ((53 - param0) / 57);
        if (!this.field_l) {
          return null;
        }
        return this.field_x;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.c(param0 ^ 126)) {
          var4 = param2;
          if (var4 == 80) {
            return this.a(this, param0 ^ 0);
          }
          if (param0 == 0) {
            return false;
          }
          this.f((byte) 66);
          return false;
        }
        if (this.a(param2, param1, this, param0 - 6208)) {
          return true;
        }
        var4Lifetime1 = param2;
        if (var4Lifetime1 == 80) {
          return this.a(this, param0 ^ 0);
        }
        if (param0 == 0) {
          return false;
        }
        this.f((byte) 66);
        return false;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param3;
        if (param2 == 28972) {
          this.field_i = param1;
          this.field_w = param4;
          this.field_y = param0;
          return;
        }
        field_m = (String) null;
        this.field_i = param1;
        this.field_w = param4;
        this.field_y = param0;
    }

    protected cf() {
        this.field_z = 0;
        this.field_q = 0;
    }

    cf(String param0, nl param1, bj param2) {
        RuntimeException runtimeException = null;
        rk var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_z = 0;
        this.field_q = 0;
        try {
          this.field_j = param0;
          this.field_h = param1;
          this.field_A = param2;
          if (this.field_h instanceof rk) {
            var4 = (rk) ((Object) this.field_h);
            this.field_n = var4.b(this, -126);
            this.field_w = var4.a((byte) 39, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("cf.<init>(");
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
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    cf(int param0, int param1, int param2, int param3, nl param4, bj param5) {
        this.field_z = 0;
        this.field_q = 0;
        try {
          this.field_h = param4;
          this.field_A = param5;
          this.field_n = param2;
          this.field_y = param0;
          this.field_w = param3;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "cf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Lobby";
        field_p = "Unable to delete friend - system busy";
        field_v = "Click or press F10 to open Quick Chat";
        field_t = "Create an illusion of a zombie that will scare the foolish humans.";
        field_o = "Powerups with this modifier can be used on humans or enemy zombies, but can only be applied to a few - experiment with it...";
    }
}
