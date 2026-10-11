/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hf extends vg {
    private boolean field_F;
    static nh field_D;
    static int[] field_H;
    boolean field_E;
    private boolean field_B;
    static nh field_z;
    static int field_C;
    boolean field_A;
    static int[] field_G;

    final static String g(int param0) {
        if (param0 != -1) {
          field_D = (nh) null;
          if (em.field_c) {
            return null;
          }
          if (dd.field_l < qe.field_c) {
            return null;
          }
          if (!(dd.field_l >= je.field_j + qe.field_c)) {
            return ie.field_C;
          }
          return null;
        }
        if (em.field_c) {
          return null;
        }
        if (dd.field_l < qe.field_c) {
          return null;
        }
        if (!(dd.field_l >= je.field_j + qe.field_c)) {
          return ie.field_C;
        }
        return null;
    }

    hf(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
    }

    final void c(byte param0) {
        int var2 = 71 % ((param0 + 10) / 51);
        if (!this.field_F) {
          return;
        }
        this.field_F = false;
        if (null == this.field_u) {
          return;
        }
        if (!(this.field_u instanceof pl)) {
          return;
        }
        ((pl) (this.field_u)).a((vg) (this), this.field_F, false);
    }

    public static void f(int param0) {
        if (param0 != 7966) {
          return;
        }
        field_D = null;
        field_G = null;
        field_H = null;
        field_z = null;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        vg var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, (byte) -128);
          if (this.field_y != 0 &&
            db.field_a != this.field_y) {
            if (this.a(param2, param1, false, ck.field_c, ob.field_g) &&
              db.field_a == 0) {
              this.a(this.field_y, 26982, -param2 + ob.field_g, ck.field_c - param1);
            }
            this.a(param1, param2, ob.field_g, param0, ck.field_c, false);
          }
          if (param3 < -127) {
            return;
          }
          var6 = (vg) null;
          this.a(-47, 85, 6, (vg) null, -99, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("hf.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    hf(String param0, cg param1, fd param2) {
        super(param0, param1, param2);
        this.field_E = true;
        this.field_B = true;
        this.field_F = false;
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        if (param5) {
          return;
        }
        try {
          if (null != this.field_u &&
            this.field_u instanceof se) {
            ((se) (this.field_u)).a(param2, param4, param0, 17437, this, param1);
          }
          this.field_y = 0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "hf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_E) {
            return false;
          }
          if (!this.field_B) {
            return false;
          }
          param1.c((byte) 122);
          if (param0) {
            this.a(5, -103, -59, -102);
          }
          this.field_F = true;
          if (null != this.field_u &&
            this.field_u instanceof pl) {
            ((pl) (this.field_u)).a((vg) (this), this.field_F, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hf.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        vg var6 = null;
        vg var6Lifetime1;
        if (null != this.field_u) {
          if (!(this.field_u instanceof ke)) {
            if (param1 != 26982) {
              var6 = (vg) null;
              this.a((vg) null, -40, 15, (byte) 63);
              return;
            }
            return;
          }
          ((ke) (this.field_u)).a(param2, param3, true, this, param0);
        }
        if (param1 == 26982) {
          return;
        }
        var6Lifetime1 = (vg) null;
        this.a((vg) null, -40, 15, (byte) 63);
    }

    final boolean a(boolean param0) {
        if (!param0) {
          hf.f(-19);
          return this.field_F;
        }
        return this.field_F;
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(true) && (param0 == 84 ||
            param0 == 83)) {
            this.a(1, 26982, -1, -1);
            return true;
          }
          if (param3 >= 63) {
            return false;
          }
          hf.g(37);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hf.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_E &&
            this.a(param6, param5, false, param4, param0)) {
            this.a(false, param1);
            this.field_y = param2;
            if (this.field_u != null) {
              if (!(this.field_u instanceof se)) {
                return true;
              }
              ((se) (this.field_u)).a(param0, param6, 5708, param2, param5, param4, this);
            }
            return true;
          }
          if (param3 < 113) {
            field_H = (int[]) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("hf.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    protected hf() {
        this.field_E = true;
        this.field_B = true;
        this.field_F = false;
        this.field_l = ja.field_Q.field_a;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -10612) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, param2, param0, 101)) {
            this.a(param2, (byte) 89, param0, param1);
            if (this.field_A) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_E) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hf.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_H = new int[]{0, 50, 50, 50, 50, 50, 150, 30, 50, 140, 70, -1, 50, 50};
        field_G = new int[8192];
    }
}
