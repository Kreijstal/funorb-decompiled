/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ea extends IntrusiveNode {
    int field_l;
    pp field_m;
    ir field_e;
    int field_q;
    boolean field_g;
    String field_k;
    int field_i;
    String field_f;
    no field_o;
    int field_n;
    int field_h;
    int field_p;
    int field_j;

    void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        try {
          this.field_i = 0;
          if (param5 != 91) {
            this.c((byte) 76);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ea.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32462) {
            this.a(-29, -8, 103, 5, 81);
          }
          if (this.a(param0, param2, false, param3)) {
            this.a(param0, 0, param3, param2);
          }
          stackIn_6_0 = (StringBuilder) (param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ea.A(");
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
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return true;
          }
          if (param3.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ea.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void d(int param0) {
        if (param0 != 7398) {
          this.a(75, true, 115, true);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param2 >= -17) {
          this.field_p = -80;
          if (param4 < this.field_p + param3) {
            return false;
          }
          if (param0 < this.field_h + param1) {
            return false;
          }
          if (this.field_p + (param3 + this.field_q) <= param4) {
            return false;
          }
          if (param0 >= this.field_h + param1 + this.field_n) {
            return false;
          }
          return true;
        }
        if (param4 < this.field_p + param3) {
          return false;
        }
        if (param0 < this.field_h + param1) {
          return false;
        }
        stackIn_18_0 = (this.field_p + (param3 + this.field_q) > param4) && (param0 < this.field_h + param1 + this.field_n);
        return stackIn_18_0;
    }

    int f(int param0) {
        if (param0 != 0) {
          this.field_q = -15;
          return 0;
        }
        return 0;
    }

    ea(String param0, no param1) {
        this(param0, ag.field_n.field_k, param1);
    }

    boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -42) {
            return false;
          }
          this.field_e = (ir) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ea.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param6, param4, -68, param1, param2)) {
            this.field_i = param3;
          }
          if (param0 == 34) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ea.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        var4 = this.f(param1 + param1);
        var5_int = 0;
        while (var5_int <= var4) {
          this.a((byte) 81, var5_int, param2, param0);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = fh.c((byte) -125);
        if (var5 != null) {
          ag.field_n.a(10066329, var5, nl.field_o, we.field_c);
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = hf.a(51, param1.length, 0, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ea.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        int var5_int = 0;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(cf.field_g, param2, -98, param3, ic.field_b) ? 1 : 0;
          if (param0 <= 13) {
            this.a(117, true, 91, true);
          }
          stackIn_4_0 = this.field_g;
          if (var5_int != 0) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_g = stackIn_10_1;
            if (this.field_o != null &&
              this.field_o instanceof kl) {
              ((kl) (this.field_o)).a(this, (byte) -58, var5_int != 0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ea.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          if (param0 > 64) {
            return;
          }
          this.field_p = 100;
          return;
        }
        if (null == this.field_e) {
          if (param0 > 64) {
            return;
          }
          this.field_p = 100;
          return;
        }
        this.field_e.a(true, -7592, param3, this, param2);
        if (param0 > 64) {
          return;
        }
        this.field_p = 100;
    }

    final void a(boolean param0) {
        this.a(this.field_n, this.field_p, this.field_h, this.field_q, (byte) 126);
        if (param0) {
          this.field_f = (String) null;
        }
    }

    void a(int param0, int param1, int param2, int param3, byte param4) {
        this.field_q = param3;
        this.field_n = param0;
        this.field_h = param2;
        if (param4 <= 122) {
          return;
        }
        this.field_p = param1;
    }

    public final String toString() {
        return this.a(new StringBuilder(), 32462, 0, new Hashtable()).toString();
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_p).append(",").append(this.field_h).append(" ").append(this.field_q).append("x").append(this.field_n);
          if (this.field_f != null) {
            discarded$1 = param0.append(" text=\"").append(this.field_f).append('"');
          }
          if (this.field_g) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.e(28660)) {
            discarded$3 = param0.append(" focused");
          }
          if (param1 != 0) {
            this.field_m = (pp) null;
          }
          if (this.field_e != null) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_e instanceof ea)) {
              discarded$5 = param0.append(this.field_e);
            } else {
              param0 = this.a(param0, param1 + 32462, 1 + param3, param2);
            }
          }
          if (null != this.field_o) {
            discarded$6 = param0.append(" listener=");
            if (!(this.field_o instanceof ea)) {
              discarded$7 = param0.append(this.field_o);
            } else {
              param0 = this.a(param0, 32462, 1 + param3, param2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ea.K(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean e(int param0) {
        if (param0 != 28660) {
          this.field_p = -18;
          return false;
        }
        return false;
    }

    String c(byte param0) {
        if (param0 > -41) {
          return (String) null;
        }
        return !this.field_g ? null : this.field_k;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3) {
        Object stackIn_49_0;
        int stackIn_49_1;
        int stackIn_49_2;
        int stackIn_49_3;
        int stackIn_49_4;
        int stackIn_49_5;
        Object stackIn_49_6;
        Object stackIn_50_0;
        Object stackIn_50_6;
        boolean stackIn_50_7;
        int var5;
        hg var6;
        hg var7;
        hg var8;
        hg var9;
        hg var10;
        hg var12;
        hg var13;
        hg var6Lifetime1;
        this.a((byte) 68, this, param0, param2);
        if (!param1) {
          return true;
        }
        var5 = this.e(28660) ? 1 : 0;
        if (!param3) {
          if (var5 != 0 &&
            vj.pressedMouseButton != 0) {
            this.d(7398);
          }
          fp.field_g = vu.heldMouseButton;
          qs.a(-6939, this.c((byte) -123));
          return param3;
        }
        if (nh.field_e == 0) {
          if (vj.pressedMouseButton == 0) {
            if (vu.heldMouseButton != 0) {
              fp.field_g = vu.heldMouseButton;
              qs.a(-6939, this.c((byte) -123));
              return param3;
            }
            if (fp.field_g == 0) {
              fp.field_g = vu.heldMouseButton;
              qs.a(-6939, this.c((byte) -123));
              return param3;
            }
            this.a(param2, param0, cf.field_g, ic.field_b, this, (byte) 91);
            var7 = mm.field_a;
            if (var7 != null) {
              if (var7.field_o instanceof ma) {
                ((ma) (var7.field_o)).a(var7, -16073, (sh) null);
              }
              mm.field_a = null;
            }
            fp.field_g = vu.heldMouseButton;
            qs.a(-6939, this.c((byte) -123));
            return param3;
          }
          if (this.a(34, param2, ln.field_c, vj.pressedMouseButton, param0, this, lq.field_a)) {
            param3 = false;
          } else {
            if (var5 != 0) {
              this.d(7398);
              if (vu.heldMouseButton != 0) {
                fp.field_g = vu.heldMouseButton;
                qs.a(-6939, this.c((byte) -123));
                return param3;
              }
              if (fp.field_g == 0) {
                fp.field_g = vu.heldMouseButton;
                qs.a(-6939, this.c((byte) -123));
                return param3;
              }
              this.a(param2, param0, cf.field_g, ic.field_b, this, (byte) 91);
              var8 = mm.field_a;
              if (var8 != null) {
                if (var8.field_o instanceof ma) {
                  ((ma) (var8.field_o)).a(var8, -16073, (sh) null);
                }
                mm.field_a = null;
              }
              fp.field_g = vu.heldMouseButton;
              qs.a(-6939, this.c((byte) -123));
              return param3;
            }
          }
          if (vu.heldMouseButton != 0) {
            fp.field_g = vu.heldMouseButton;
            qs.a(-6939, this.c((byte) -123));
            return param3;
          }
          if (fp.field_g == 0) {
            fp.field_g = vu.heldMouseButton;
            qs.a(-6939, this.c((byte) -123));
            return param3;
          }
          this.a(param2, param0, cf.field_g, ic.field_b, this, (byte) 91);
          var9 = mm.field_a;
          var6 = var9;
          if (var9 != null) {
            if (var9.field_o instanceof ma) {
              ((ma) (var9.field_o)).a(var9, -16073, (sh) null);
            }
            mm.field_a = null;
          }
          fp.field_g = vu.heldMouseButton;
          qs.a(-6939, this.c((byte) -123));
          return param3;
        }
        if (var5 != 0) {
          stackIn_49_0 = this;
          stackIn_49_1 = cf.field_g;
          stackIn_49_2 = ic.field_b;
          stackIn_49_3 = nh.field_e;
          stackIn_49_4 = param2;
          stackIn_49_5 = param0;
          stackIn_49_6 = this;
          if (param1) {
            stackIn_50_0 = this;
            stackIn_50_6 = this;
            stackIn_50_7 = false;
          } else {
            stackIn_50_0 = this;
            stackIn_50_6 = this;
            stackIn_50_7 = true;
          }
          this.a(stackIn_49_1, stackIn_49_2, stackIn_49_3, stackIn_49_4, stackIn_49_5, this, stackIn_50_7);
        }
        if (vj.pressedMouseButton == 0) {
          if (vu.heldMouseButton != 0) {
            fp.field_g = vu.heldMouseButton;
            qs.a(-6939, this.c((byte) -123));
            return param3;
          }
          if (fp.field_g == 0) {
            fp.field_g = vu.heldMouseButton;
            qs.a(-6939, this.c((byte) -123));
            return param3;
          }
          this.a(param2, param0, cf.field_g, ic.field_b, this, (byte) 91);
          var10 = mm.field_a;
          var6Lifetime1 = var10;
          if (var10 != null) {
            if (var10.field_o instanceof ma) {
              ((ma) (var10.field_o)).a(var10, -16073, (sh) null);
            }
            mm.field_a = null;
          }
          fp.field_g = vu.heldMouseButton;
          qs.a(-6939, this.c((byte) -123));
          return param3;
        }
        if (this.a(34, param2, ln.field_c, vj.pressedMouseButton, param0, this, lq.field_a)) {
          param3 = false;
        } else {
          if (var5 != 0) {
            this.d(7398);
            if (vu.heldMouseButton != 0) {
              fp.field_g = vu.heldMouseButton;
              qs.a(-6939, this.c((byte) -123));
              return param3;
            }
            if (fp.field_g == 0) {
              fp.field_g = vu.heldMouseButton;
              qs.a(-6939, this.c((byte) -123));
              return param3;
            }
            this.a(param2, param0, cf.field_g, ic.field_b, this, (byte) 91);
            var12 = mm.field_a;
            if (var12 != null) {
              if (var12.field_o instanceof ma) {
                ((ma) (var12.field_o)).a(var12, -16073, (sh) null);
              }
              mm.field_a = null;
            }
            fp.field_g = vu.heldMouseButton;
            qs.a(-6939, this.c((byte) -123));
            return param3;
          }
        }
        if (vu.heldMouseButton != 0) {
          fp.field_g = vu.heldMouseButton;
          qs.a(-6939, this.c((byte) -123));
          return param3;
        }
        if (fp.field_g == 0) {
          fp.field_g = vu.heldMouseButton;
          qs.a(-6939, this.c((byte) -123));
          return param3;
        }
        this.a(param2, param0, cf.field_g, ic.field_b, this, (byte) 91);
        var13 = mm.field_a;
        if (var13 != null) {
          if (var13.field_o instanceof ma) {
            ((ma) (var13.field_o)).a(var13, -16073, (sh) null);
          }
          mm.field_a = null;
        }
        fp.field_g = vu.heldMouseButton;
        qs.a(-6939, this.c((byte) -123));
        return param3;
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (this.e(28660)) {
          if (this.a(-115, param2, param1, this)) {
            return true;
          }
          if (param0 > 40) {
            var4 = param2;
            if (var4 == 80) {
              return this.a(this, (byte) -42);
            }
            return false;
          }
          this.field_l = 17;
          var4Lifetime3 = param2;
          if (var4Lifetime3 == 80) {
            return this.a(this, (byte) -42);
          }
          return false;
        }
        if (param0 <= 40) {
          this.field_l = 17;
          var4Lifetime1 = param2;
          if (var4Lifetime1 == 80) {
            return this.a(this, (byte) -42);
          }
          return false;
        }
        var4Lifetime2 = param2;
        if (var4Lifetime2 == 80) {
          return this.a(this, (byte) -42);
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, boolean param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param6) {
            return false;
          }
          this.c((byte) 58);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ea.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 43 / ((-53 - param0) / 33);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ea.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    protected ea() {
        this.field_l = 0;
        this.field_j = 0;
    }

    ea(String param0, ir param1, no param2) {
        RuntimeException runtimeException = null;
        et var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_l = 0;
        this.field_j = 0;
        try {
          this.field_e = param1;
          this.field_o = param2;
          this.field_f = param0;
          if (this.field_e instanceof et) {
            var4 = (et) ((Object) this.field_e);
            this.field_q = var4.a(this, 124);
            this.field_n = var4.a(2147483647, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ea.<init>(");
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
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ea(int param0, int param1, int param2, int param3, ir param4, no param5) {
        this.field_l = 0;
        this.field_j = 0;
        try {
          this.field_q = param2;
          this.field_p = param0;
          this.field_e = param4;
          this.field_n = param3;
          this.field_o = param5;
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ea.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
