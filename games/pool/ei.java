/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ei extends ma {
    int field_D;
    int field_v;
    static vh field_A;
    int field_l;
    int field_y;
    fp field_z;
    boolean field_s;
    static int field_u;
    int field_r;
    static int field_o;
    String field_m;
    String field_p;
    op field_x;
    static java.math.BigInteger field_q;
    int field_n;
    int field_C;
    static int field_B;
    cc field_t;
    static String field_E;
    static String field_w;

    ei(String param0, cc param1) {
        this(param0, db.field_Sb.field_c, param1);
    }

    void a(ei param0, int param1, int param2, int param3) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 958) {
            return;
          }
          var5_int = this.a(param2, param3, wn.field_i, param1 - 959, gg.field_f) ? 1 : 0;
          if (var5_int != (this.field_s ? 1 : 0)) {
            stackIn_7_1 = (var5_int != 0);
            this.field_s = stackIn_7_1;
            if (null != this.field_t) {
              if (!(this.field_t instanceof qj)) {
                return;
              }
              ((qj) (this.field_t)).a(var5_int != 0, this, -101);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ei.S(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_A = null;
        if (param0 != 80) {
          return;
        }
        field_E = null;
        field_w = null;
    }

    boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        ei var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -126) {
            var9 = (ei) null;
            this.a((ei) null, 51, 64, -111);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ei.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 44 / ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ei.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == field_E) {
            return false;
          }
          if (param0 != -71) {
            field_A = (vh) null;
          }
          stackIn_9_0 = !(param1.toLowerCase().indexOf(field_E.toLowerCase()) < 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ei.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    int c(int param0) {
        if (param0 < 33) {
          this.e(-86);
          return 0;
        }
        return 0;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
          if (this.b(param1, param2, param0, -1)) {
            this.a(1, param2, param0, param1);
          }
          if (param3 > 13) {
            stackIn_6_0 = (StringBuilder) (param0);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ei.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            return false;
          }
          field_o = 14;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ei.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param0 != -81) {
          this.field_s = true;
          if (this.d(param0 - 11) &&
            this.a(param2, param1, false, this)) {
            return true;
          }
          var4 = param1;
          if (var4 == 80) {
            return this.a(this, (byte) -103);
          }
          return false;
        }
        if (!this.d(param0 - 11)) {
          var4Lifetime1 = param1;
          if (var4Lifetime1 == 80) {
            return this.a(this, (byte) -103);
          }
          return false;
        }
        if (this.a(param2, param1, false, this)) {
          return true;
        }
        var4Lifetime2 = param1;
        if (var4Lifetime2 == 80) {
          return this.a(this, (byte) -103);
        }
        return false;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        this.field_D = param4;
        if (!param3) {
          this.field_l = param0;
          this.field_C = param1;
          this.field_y = param2;
          return;
        }
        this.d(43);
        this.field_l = param0;
        this.field_C = param1;
        this.field_y = param2;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        ei var7;
        if (param3 != -1) {
          var7 = (ei) null;
          this.a((ei) null, 25, false, 45, 66, -10, 22);
          if (param0 + this.field_C > param2) {
            return false;
          }
          if (param4 < this.field_D + param1) {
            return false;
          }
          if (this.field_C + param0 + this.field_l <= param2) {
            return false;
          }
          if (param4 >= this.field_y + this.field_D + param1) {
            return false;
          }
          return true;
        }
        if (param0 + this.field_C > param2) {
          return false;
        }
        if (param4 < this.field_D + param1) {
          return false;
        }
        stackIn_18_0 = (this.field_C + param0 + this.field_l > param2) && (param4 < this.field_y + this.field_D + param1);
        return stackIn_18_0;
    }

    final static dd[] a(byte param0, int param1) {
        dd[] var4 = new dd[9];
        dd[] var2 = var4;
        if (param0 > 4) {
          var4[4] = ad.a(param1, 64, 7);
          return var2;
        }
        String var3 = (String) null;
        ei.a((byte) 3, (String) null);
        var4[4] = ad.a(param1, 64, 7);
        return var2;
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_C).append(",").append(this.field_D).append(" ").append(this.field_l).append("x").append(this.field_y);
          if (null != this.field_m) {
            discarded$1 = param2.append(" text=\"").append(this.field_m).append('"');
          }
          if (this.field_s) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.d(123)) {
            discarded$3 = param2.append(" focused");
          }
          if (param0 != 1) {
            this.field_y = -51;
          }
          if (this.field_z != null) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_z instanceof ei)) {
              discarded$5 = param2.append(this.field_z);
            } else {
              param2 = this.a(param2, param3 + 1, param1, 25);
            }
          }
          if (this.field_t != null) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_t instanceof ei)) {
              discarded$7 = param2.append(this.field_t);
            } else {
              param2 = this.a(param2, param3 + 1, param1, 75);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ei.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean d(int param0) {
        int var2 = 101 % ((7 - param0) / 48);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        wj var7;
        wj var8;
        wj var9;
        wj var10;
        wj var11;
        wj var12;
        wj var13;
        wj var14;
        wj var15;
        wj var16;
        wj var17;
        int var5Lifetime1;
        this.a(this, 958, param1, param3);
        if (param0 <= -118) {
          var5 = this.d(85) ? 1 : 0;
          if (!param2) {
            if (var5 != 0 &&
              0 != ne.field_s) {
              this.d((byte) 99);
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
          if (wp.field_d != 0 &&
            var5 != 0) {
            this.a(this, wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
            if (ne.field_s != 0) {
              if (this.a(this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                param2 = false;
              } else {
                this.d((byte) 99);
              }
            }
            if (cd.field_b != 0) {
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
            if (sa.field_t == 0) {
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
            this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
            var7 = uh.field_u;
            if (var7 != null) {
              if (var7.field_t instanceof jm) {
                ((jm) (var7.field_t)).a(-87, (k) null, var7);
              }
              uh.field_u = null;
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
          if (ne.field_s != 0) {
            if (!this.a(this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
              if (var5 == 0) {
                if (cd.field_b != 0) {
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.e(-94));
                  return param2;
                }
                if (sa.field_t == 0) {
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, this.e(-94));
                  return param2;
                }
                this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
                var8 = uh.field_u;
                if (var8 != null) {
                  if (var8.field_t instanceof jm) {
                    ((jm) (var8.field_t)).a(-87, (k) null, var8);
                  }
                  uh.field_u = null;
                }
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
              this.d((byte) 99);
              if (cd.field_b != 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
              if (sa.field_t == 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
              this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
              var9 = uh.field_u;
              if (var9 != null) {
                if (var9.field_t instanceof jm) {
                  ((jm) (var9.field_t)).a(-87, (k) null, var9);
                }
                uh.field_u = null;
              }
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
            param2 = false;
          }
          if (cd.field_b != 0) {
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
          if (sa.field_t == 0) {
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
          this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
          var10 = uh.field_u;
          if (var10 != null) {
            if (var10.field_t instanceof jm) {
              ((jm) (var10.field_t)).a(-87, (k) null, var10);
            }
            uh.field_u = null;
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, this.e(-94));
          return param2;
        }
        ei.c((byte) 17);
        var5Lifetime1 = this.d(85) ? 1 : 0;
        if (!param2) {
          if (var5Lifetime1 != 0 &&
            0 != ne.field_s) {
            this.d((byte) 99);
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
        } else {
          if (wp.field_d == 0) {
            sharedTailExit_0: {
              if (ne.field_s != 0) {
                if (!this.a(this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                  if (var5Lifetime1 == 0) {
                    if (((cd.field_b == 0)) &&
                      ((sa.field_t != 0))) {
                      this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
                      var11 = uh.field_u;
                      if (var11 != null) {
                        if (var11.field_t instanceof jm) {
                          ((jm) (var11.field_t)).a(-87, (k) null, var11);
                        }
                        uh.field_u = null;
                      }
                    }
                  } else {
                    this.d((byte) 99);
                    if (((cd.field_b == 0)) &&
                      ((sa.field_t != 0))) {
                      this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
                      var12 = uh.field_u;
                      if (var12 != null) {
                        if (var12.field_t instanceof jm) {
                          ((jm) (var12.field_t)).a(-87, (k) null, var12);
                        }
                        uh.field_u = null;
                      }
                    }
                  }
                  break sharedTailExit_0;
                }
                param2 = false;
              }
              if (cd.field_b == 0 &&
                sa.field_t != 0) {
                this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
                var13 = uh.field_u;
                if (var13 != null) {
                  if (var13.field_t instanceof jm) {
                    ((jm) (var13.field_t)).a(-87, (k) null, var13);
                  }
                  uh.field_u = null;
                }
              }
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
          if (var5Lifetime1 != 0) {
            this.a(this, wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
            if (ne.field_s != 0) {
              if (this.a(this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                param2 = false;
              } else {
                this.d((byte) 99);
              }
            }
            if (cd.field_b == 0 &&
              sa.field_t != 0) {
              this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
              var14 = uh.field_u;
              if (var14 != null) {
                if (var14.field_t instanceof jm) {
                  ((jm) (var14.field_t)).a(-87, (k) null, var14);
                }
                uh.field_u = null;
              }
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
          if (ne.field_s != 0) {
            if (!this.a(this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
              if (cd.field_b != 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
              if (sa.field_t == 0) {
                sa.field_t = cd.field_b;
                ue.a((byte) 70, this.e(-94));
                return param2;
              }
              this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
              var15 = uh.field_u;
              if (var15 != null) {
                if (var15.field_t instanceof jm) {
                  ((jm) (var15.field_t)).a(-87, (k) null, var15);
                }
                uh.field_u = null;
              }
              sa.field_t = cd.field_b;
              ue.a((byte) 70, this.e(-94));
              return param2;
            }
            param2 = false;
          }
          if (cd.field_b == 0 &&
            sa.field_t != 0) {
            this.a(param1, wn.field_i, param3, gg.field_f, (byte) 105, this);
            var17 = uh.field_u;
            if (var17 != null) {
              if (var17.field_t instanceof jm) {
                ((jm) (var17.field_t)).a(-87, (k) null, var17);
              }
              uh.field_u = null;
            }
            sa.field_t = cd.field_b;
            ue.a((byte) 70, this.e(-94));
            return param2;
          }
        }
        sa.field_t = cd.field_b;
        ue.a((byte) 70, this.e(-94));
        return param2;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param5, param6, -1, param4)) {
            this.field_n = param3;
          }
          if (param2) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ei.AA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String e(int param0) {
        if (param0 <= -10) {
          return !this.field_s ? null : this.field_p;
        }
        this.c(-28);
        return !this.field_s ? null : this.field_p;
    }

    public final String toString() {
        return this.a(new StringBuilder(), 0, new Hashtable(), 99).toString();
    }

    void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        try {
          if (param4 < 62) {
            this.a(-128, 68, 'ﾮ');
          }
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            this.a(84, -105, '￈');
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
          stackIn_9_1 = new StringBuilder().append("ei.MB(").append(param0).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var5_int = 0;
        int var4 = this.c(66);
        for (var5_int = 0; var4 >= var5_int; var5_int++) {
          this.a(var5_int, (byte) -118, param0, param2);
        }
        if (param1 < 73) {
          return;
        }
        String var5 = jd.a(9383);
        if (var5 == null) {
          return;
        }
        db.field_Sb.a((byte) -52, ne.field_n, id.field_b, var5);
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param0 != 0) {
          var5 = -117 / ((-42 - param1) / 53);
          return;
        }
        if (null != this.field_z) {
          this.field_z.a(true, param2, (byte) 71, param3, this);
          var5Lifetime1 = -117 / ((-42 - param1) / 53);
          return;
        }
        var5Lifetime2 = -117 / ((-42 - param1) / 53);
    }

    final void e(byte param0) {
        if (param0 <= -64) {
          this.a(this.field_l, this.field_C, this.field_y, false, this.field_D);
          return;
        }
        field_o = -58;
        this.a(this.field_l, this.field_C, this.field_y, false, this.field_D);
    }

    void d(byte param0) {
        if (param0 != 99) {
          ei var3 = (ei) null;
          this.a((ei) null, -125, false, 30, 62, -88, -86);
        }
    }

    protected ei() {
        this.field_v = 0;
        this.field_r = 0;
    }

    ei(String param0, fp param1, cc param2) {
        io var4 = null;
        this.field_v = 0;
        this.field_r = 0;
        try {
          this.field_t = param2;
          this.field_z = param1;
          this.field_m = param0;
          if (this.field_z instanceof io) {
            var4 = (io) ((Object) this.field_z);
            this.field_l = var4.a(this, -1848150943);
            this.field_y = var4.a(1, this);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ei(int param0, int param1, int param2, int param3, fp param4, cc param5) {
        this.field_v = 0;
        this.field_r = 0;
        try {
          this.field_y = param3;
          this.field_D = param1;
          this.field_t = param5;
          this.field_C = param0;
          this.field_z = param4;
          this.field_l = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 500;
        field_u = 0;
        field_q = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_w = "You are on <%0>";
    }
}
