/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ek extends ce {
    boolean field_H;
    boolean field_I;
    private boolean field_G;
    private boolean field_J;

    boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_I &&
            this.field_J) {
            if (param0) {
              this.d((byte) 59);
            }
            param1.d((byte) -95);
            this.field_G = true;
            if (this.field_v != null) {
              if (!(this.field_v instanceof m)) {
                return true;
              }
              ((m) (this.field_v)).a(-28841, this.field_G, (ce) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ek.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param3 != 520) {
          this.field_J = false;
          if (null == this.field_v) {
            return;
          }
          if (this.field_v instanceof vn) {
            ((vn) (this.field_v)).a((byte) 67, param2, this, param0, param1);
            return;
          }
          return;
        }
        if (null == this.field_v) {
          return;
        }
        if (this.field_v instanceof vn) {
          ((vn) (this.field_v)).a((byte) 67, param2, this, param0, param1);
          return;
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -55) {
            this.field_G = true;
          }
          if (this.field_I &&
            this.a(param1, (byte) -48, param4, param0, param5)) {
            this.a(false, param2);
            this.field_o = param3;
            if (null != this.field_v &&
              this.field_v instanceof sj) {
              ((sj) (this.field_v)).a(param3, -4040, this, param5, param0, param4, param1);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("ek.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void d(byte param0) {
        ce var3 = null;
        ce var3Lifetime1;
        ce var3Lifetime2;
        ce var3Lifetime3;
        if (!this.field_G) {
          if (param0 == -95) {
            return;
          }
          var3 = (ce) null;
          this.a((ce) null, -106, -89, 48);
          return;
        }
        this.field_G = false;
        if (this.field_v == null) {
          if (param0 == -95) {
            return;
          }
          var3Lifetime1 = (ce) null;
          this.a((ce) null, -106, -89, 48);
          return;
        }
        if (this.field_v instanceof m) {
          ((m) (this.field_v)).a(-28841, this.field_G, (ce) (this));
          if (param0 == -95) {
            return;
          }
          var3Lifetime2 = (ce) null;
          this.a((ce) null, -106, -89, 48);
          return;
        }
        if (param0 == -95) {
          return;
        }
        var3Lifetime3 = (ce) null;
        this.a((ce) null, -106, -89, 48);
    }

    final static ck[] a(String param0, String param1, int param2, ji param3) {
        ck[] var4 = null;
        RuntimeException var4_ref = null;
        ji var5 = null;
        ck[] var6 = null;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = bb.a(18064, param1, param3, param0);
          var4 = var6;
          if (param2 > -43) {
            var5 = (ji) null;
            ek.a((String) null, (String) null, -51, (ji) null);
          }
          var6[1].field_C = var6[1].field_H;
          var6[7].field_C = var6[7].field_H;
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ek.U(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            this.field_I = true;
          }
          if (this.a(0, param1, param0, param2)) {
            this.a((byte) 72, param2, param0, param1);
            if (this.field_H) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_I) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_11_0 = (StringBuilder) (param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ek.MB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void g(int param0) {
        if (param0 != -1209) {
          return;
        }
        ph.field_Ab = false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        try {
          if (param1 < 38) {
            this.field_H = true;
          }
          super.a(param0, 94, param2, param3);
          if (this.field_o != 0 &&
            be.field_n != this.field_o) {
            if (this.a(bh.field_g, (byte) -124, param2, pm.field_f, param3) &&
              be.field_n == 0) {
              this.b(-param3 + bh.field_g, pm.field_f - param2, this.field_o, 520);
            }
            this.a(pm.field_f, 64, param3, param0, param2, bh.field_g);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ek.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ek(String param0, kg param1) {
        this(param0, bf.field_x.field_b, param1);
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -127 / ((param0 + 22) / 49);
          if (this.a(true) && (param1 == 84 ||
            param1 == 83)) {
            this.b(-1, -1, 1, 520);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ek.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ke a(boolean param0, boolean param1, int param2) {
        ke var7 = new ke(3);
        ke var8 = var7;
        var8.a(new ec(25, jb.field_h, a.field_t), 110);
        var8.a(new ec(13, param1 ? on.field_c : pc.field_f, a.field_t), 120);
        var8.a(new ec(26, og.field_hb, a.field_t), 122);
        var7.field_f[1].field_n = 40 + a.field_t.a(var7.field_f[1].field_o);
        ec var4 = var7.field_f[0];
        var7.field_f[2].field_n = 120;
        var4.field_n = 120;
        var7.field_f[1].field_l = -(var7.field_f[1].field_n / 2) + 320;
        var7.field_f[0].field_l = 32;
        var7.field_f[2].field_l = param2 + (-var7.field_f[2].field_n - 32);
        ec var5 = var7.field_f[0];
        var7.field_f[2].field_m = 400;
        ec var6 = var7.field_f[1];
        var6.field_m = 400;
        var8.field_y = 520;
        var8.field_w = 60;
        var8.field_q = 284;
        var5.field_m = 400;
        var8.field_z = 96;
        var8.a(1, param0, param2 ^ -513);
        ac.f((byte) -119);
        return var8;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.field_I = false;
          return this.field_G;
        }
        return this.field_G;
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_v &&
            this.field_v instanceof sj) {
            ((sj) (this.field_v)).a(param0, param2, param4, param5, this, param1 + 19001);
          }
          this.field_o = 0;
          if (param1 == 64) {
            return;
          }
          this.field_G = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ek.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ek(String param0, gl param1, kg param2) {
        super(param0, param1, param2);
        this.field_G = false;
        this.field_I = true;
        this.field_J = true;
    }

    protected ek() {
        this.field_G = false;
        this.field_I = true;
        this.field_J = true;
        this.field_p = bf.field_x.field_g;
    }

    static {
    }
}
