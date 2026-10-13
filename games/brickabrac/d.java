/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class d extends oc {
    private boolean field_I;
    static String field_C;
    private boolean field_E;
    static String field_D;
    boolean field_F;
    static String field_G;
    static int recentRenderRate;
    boolean field_J;

    public static void g(int param0) {
        if (param0 > -22) {
          return;
        }
        field_G = null;
        field_C = null;
        field_D = null;
    }

    final void b(boolean param0) {
        if (param0) {
          oc var3 = (oc) null;
          this.a((oc) null, (byte) -52, -45, 104);
          if (!this.field_E) {
            return;
          }
          this.field_E = false;
          if (this.field_i == null) {
            return;
          }
          if (!(this.field_i instanceof gm)) {
            return;
          }
          ((gm) (this.field_i)).a(this.field_E, (oc) (this), 19365);
          return;
        }
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
        if (this.field_i == null) {
          return;
        }
        if (!(this.field_i instanceof gm)) {
          return;
        }
        ((gm) (this.field_i)).a(this.field_E, (oc) (this), 19365);
    }

    d(String param0, uh param1) {
        this(param0, bj.field_T.field_q, param1);
    }

    d(String param0, ub param1, uh param2) {
        super(param0, param1, param2);
        this.field_I = true;
        this.field_E = false;
        this.field_J = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, 1595637992, param0, param1)) {
            this.a(param1, param0, 0, param3);
            if (this.field_F) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_J) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param2 != 24) {
            this.field_E = true;
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("d.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_J &&
            this.a(param5, param3, param2, param6 + 3, param1)) {
            this.a(true, param0);
            this.field_n = param4;
            if (this.field_i != null) {
              if (!(this.field_i instanceof ca)) {
                return true;
              }
              ((ca) (this.field_i)).a(param2, param4, this, param5, param1, param3, -13469);
            }
            return true;
          }
          if (param6 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("d.MA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (this.field_i == null) {
          if (param2 < -8) {
            return;
          }
          this.f(-13);
          return;
        }
        if (!(this.field_i instanceof en)) {
          if (param2 < -8) {
            return;
          }
          this.f(-13);
          return;
        }
        ((en) (this.field_i)).a(param0, param1, (byte) -60, param3, this);
        if (param2 < -8) {
          return;
        }
        this.f(-13);
    }

    boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        oc stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_J &&
            this.field_I) {
            stackIn_7_0 = (oc) (param1);
            stackIn_8_1 = !(param0);
            ((oc) (Object) stackIn_7_0).b(stackIn_8_1);
            stackIn_11_1 = (param0);
            this.field_E = stackIn_11_1;
            if (null != this.field_i) {
              if (!(this.field_i instanceof gm)) {
                return true;
              }
              ((gm) (this.field_i)).a(this.field_E, (oc) (this), 19365);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("d.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_n != 0 &&
            cb.heldButton != this.field_n) {
            if (this.a(po.pointerY, param3, param2, param1 + 3, pq.pointerX) &&
              cb.heldButton == 0) {
              this.a(po.pointerY - param3, this.field_n, -79, -param2 + pq.pointerX);
            }
            this.a(po.pointerY, pq.pointerX, param3, param0, 19223, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "d.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 110) {
            return false;
          }
          if (!this.f(-103)) {
            return false;
          }
          if (param0 != 84 &&
            param0 != 83) {
            return false;
          }
          this.a(-1, 1, -18, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("d.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        try {
          if (null != this.field_i &&
            this.field_i instanceof ca) {
            ((ca) (this.field_i)).a((byte) 10, param2, param0, this, param5, param1);
          }
          if (param4 != 19223) {
            this.f(87);
          }
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "d.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 < -49) {
          return this.field_E;
        }
        oc var3 = (oc) null;
        this.a((oc) null, -26, 22, -12, 8, -95, 39);
        return this.field_E;
    }

    protected d() {
        this.field_I = true;
        this.field_E = false;
        this.field_J = true;
        this.field_l = bj.field_T.field_r;
    }

    static {
        field_D = "Achievements";
        recentRenderRate = 0;
        field_G = "Join <%0>'s game";
    }
}
