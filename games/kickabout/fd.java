/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fd extends gn {
    boolean field_m;
    int field_t;
    String field_q;
    int field_n;
    iq field_h;
    int field_s;
    static ut field_e;
    static String field_j;
    int field_i;
    String field_u;
    int field_o;
    static volatile int field_l;
    jv field_k;
    int field_p;
    int field_g;
    static int[] field_f;
    gj field_r;

    public final String toString() {
        return this.a(17883, 0, new Hashtable(), new StringBuilder()).toString();
    }

    final static int a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4) {
        int stackIn_3_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          var5_int = 0;
          if (param2 != 97) {
            stackIn_3_0 = 89;
            return stackIn_3_0;
          }
          if (param0) {
            var5_int++;
          }
          if (param1) {
            var5_int++;
          }
          if (param3) {
            var5_int++;
          }
          if (param4) {
            var5_int++;
          }
          var6 = 1 + dq.$cfr$intArgs$a$7f8aad568c81(112, var5_int, pd.field_E);
          while (var6 > 0) {
            if (param0) {
              var6--;
              if (var6 == 0) {
                continue;
              }
              param0 = false;
              continue;
            }
            if (param1) {
              var6--;
              if (var6 == 0) {
                continue;
              }
              param1 = false;
              continue;
            }
            if (param3) {
              var6--;
              if (var6 == 0) {
                continue;
              }
              param3 = false;
              continue;
            }
            if (!param4) {
              var6 = 0;
              continue;
            }
            var6--;
            if (0 == var6) {
              continue;
            }
            param4 = false;
          }
          if (param0) {
            stackIn_44_0 = q.field_e[dq.$cfr$intArgs$a$7f8aad568c81(-103, q.field_e.length, pd.field_E)];
            return stackIn_44_0;
          }
          if (param1) {
            stackIn_34_0 = cd.field_a[dq.$cfr$intArgs$a$7f8aad568c81(-123, cd.field_a.length, pd.field_E)];
            return stackIn_34_0;
          }
          if (param3) {
            stackIn_42_0 = tm.field_y[dq.$cfr$intArgs$a$7f8aad568c81(-121, tm.field_y.length, pd.field_E)];
            return stackIn_42_0;
          }
          if (param4) {
            stackIn_40_0 = qr.field_e[dq.$cfr$intArgs$a$7f8aad568c81(120, qr.field_e.length, pd.field_E)];
            return stackIn_40_0;
          }
          stackIn_38_0 = q.field_e[dq.$cfr$intArgs$a$7f8aad568c81(95, q.field_e.length, pd.field_E)];
          return stackIn_38_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var5), "fd.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
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
        var6 = Kickabout.field_G;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_t).append(",").append(this.field_g).append(" ").append(this.field_n).append("x").append(this.field_i);
          if (this.field_q != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_q).append('"');
          }
          if (this.field_m) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.b(64)) {
            discarded$3 = param1.append(" focused");
          }
          if (param3 != -18568) {
            return;
          }
          if (null != this.field_r) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_r instanceof fd) {
              param1 = this.a(17883, 1 + param0, param2, param1);
            } else {
              discarded$5 = param1.append(this.field_r);
            }
          }
          if (this.field_k != null) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_k instanceof fd)) {
              discarded$7 = param1.append(this.field_k);
            } else {
              param1 = this.a(17883, param0 + 1, param2, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("fd.V(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    String f(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        if (!this.field_m) {
          return null;
        }
        return this.field_u;
    }

    void a(byte param0, fd param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a((byte) -98, param2, param3, el.field_A, n.field_m) ? 1 : 0;
          stackIn_3_0 = (this.field_m) ? 0 : 1;
          if (var5_int != 0) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_11_1 = (var5_int != 0);
            this.field_m = stackIn_11_1;
            if (null != this.field_k &&
              this.field_k instanceof uu) {
              ((uu) (this.field_k)).a(var5_int != 0, (byte) -103, this);
            }
          }
          if (param0 != 12) {
            field_e = (ut) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("fd.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a(18, 73, (byte) 32);
          }
          if (!this.a((byte) 57, param5, param1, param2, param4)) {
            return false;
          }
          this.field_p = param6;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("fd.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void g(int param0) {
        if (param0 != 84) {
          this.field_r = (gj) null;
        }
    }

    fd(String param0, jv param1) {
        this(param0, nb.field_i.field_c, param1);
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -60) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("fd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (null == e.field_m) {
          return;
        }
        hm.a(param0 ^ -120, e.field_m);
        if (param0 != 0) {
          fd.g((byte) 9);
        }
        e.field_m.a(oo.field_c, param0 + 9);
        e.field_m = null;
        if (null != kl.field_h) {
          kl.field_h.a(0);
        }
        ic.field_d.requestFocus();
    }

    public static void g(byte param0) {
        field_f = null;
        field_j = null;
        if (param0 <= 77) {
          fd.g((byte) 74);
        }
        field_e = null;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 1) {
          return;
        }
        this.field_t = param2;
        this.field_g = param4;
        this.field_i = param0;
        this.field_n = param3;
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        int var6;
        boolean stackIn_6_0 = false;
        var6 = 96 % ((-4 - param0) / 38);
        stackIn_6_0 = (param3 >= param1 + this.field_t) && (param4 >= this.field_g + param2) && (param3 < this.field_n + (this.field_t + param1)) && (param4 < this.field_g + (param2 + this.field_i));
        return stackIn_6_0;
    }

    boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fd.HA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var7;
        jg var6;
        var7 = Kickabout.field_G;
        this.a((byte) 12, this, param2, param0);
        var5 = this.b(73) ? 1 : 0;
        if (param3) {
          if (id.field_v != 0 &&
            var5 != 0) {
            this.a(n.field_m, this, param2, el.field_A, param0, id.field_v, param1 ^ 31923);
          }
          if (wj.field_A != 0) {
            if (this.a(true, param0, sm.field_q, this, vc.field_y, param2, wj.field_A)) {
              param3 = false;
            } else {
              if (var5 != 0) {
                this.g(84);
              }
            }
          }
          if (nl.field_p == 0 &&
            vg.field_Ob != 0) {
            this.a(param0, n.field_m, el.field_A, this, param1 ^ -31948, param2);
            var6 = mp.field_g;
            if (var6 != null) {
              if (var6.field_k instanceof co) {
                ((co) (var6.field_k)).a(var6, (ln) null, 14578);
              }
              mp.field_g = null;
            }
          }
        } else {
          if (var5 != 0 &&
            0 != wj.field_A) {
            this.g(84);
          }
        }
        vg.field_Ob = nl.field_p;
        cg.a(this.f(-1), (byte) -98);
        if (param1 == 31947) {
          return param3;
        }
        return false;
    }

    boolean b(int param0) {
        if (param0 <= 10) {
          this.a(32, -97, -104, 83);
        }
        return false;
    }

    final boolean a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return true;
          }
          if (!param2.containsKey(this)) {
            param2.put(this, this);
            return true;
          }
          discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fd.JA(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, int param2) {
        if (this.b(87) &&
          this.a(param0, (byte) -121, this, param2)) {
          return true;
        }
        int var4 = param2;
        if (var4 == 80) {
          return this.a(this, 0);
        }
        var4 = 41 / ((41 - param1) / 57);
        return false;
    }

    boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 35 / ((param6 - 63) / 56);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("fd.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var5_int = 0;
        int var6 = Kickabout.field_G;
        int var4 = this.f((byte) 118);
        for (var5_int = 0; var5_int <= var4; var5_int++) {
          this.a(var5_int, 65, param1, param0);
        }
        if (param2 >= -85) {
          return;
        }
        String var5 = u.a(true);
        if (var5 != null) {
          nb.field_i.a(ws.field_e, (byte) 115, td.field_d, var5);
        }
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
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
          if (param0 != 17883) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(1, param3, param2, param1)) {
            this.b(param1, param3, param2, -18568);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fd.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void e(int param0) {
        if (param0 != -1947) {
          fd var3 = (fd) null;
          this.a('ﾜ', (byte) -95, (fd) null, -57);
        }
        this.a(this.field_i, 1, this.field_t, this.field_n, this.field_g);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == 0 &&
          this.field_r != null) {
          this.field_r.a(126, true, param3, this, param2);
        }
        if (param1 != 65) {
          field_e = (ut) null;
        }
    }

    void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        try {
          this.field_p = 0;
          if (param4 != -1) {
            fd var8 = (fd) null;
            this.a((fd) null, 108);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "fd.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    int f(byte param0) {
        if (param0 != 118) {
          return 69;
        }
        return 0;
    }

    protected fd() {
        this.field_s = 0;
        this.field_o = 0;
    }

    fd(String param0, gj param1, jv param2) {
        RuntimeException runtimeException = null;
        ke var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_s = 0;
        this.field_o = 0;
        try {
          this.field_q = param0;
          this.field_k = param2;
          this.field_r = param1;
          if (this.field_r instanceof ke) {
            var4 = (ke) ((Object) this.field_r);
            this.field_n = var4.a(this, 56);
            this.field_i = var4.b(3, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("fd.<init>(");
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
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    fd(int param0, int param1, int param2, int param3, gj param4, jv param5) {
        this.field_s = 0;
        this.field_o = 0;
        try {
          this.field_r = param4;
          this.field_n = param2;
          this.field_k = param5;
          this.field_t = param0;
          this.field_g = param1;
          this.field_i = param3;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "fd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_j = "Starting price at min";
        field_l = 0;
        field_e = new ut(140, 140);
        field_f = new int[16];
        for (var0 = 0; var0 < 16; var0++) {
          field_f[var0] = var0 * var0;
        }
    }
}
