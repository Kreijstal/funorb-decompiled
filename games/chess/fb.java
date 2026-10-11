/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fb extends mf {
    boolean field_I;
    private boolean field_J;
    static String field_F;
    private boolean field_E;
    static String field_D;
    static jc field_L;
    boolean field_H;
    static String field_G;
    static int field_K;

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        try {
          if (null != this.field_p &&
            this.field_p instanceof te) {
            ((te) (this.field_p)).a(this, param0, param5, 8563, param3, param2);
          }
          this.field_q = param4;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "fb.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, -91, param2, param3);
          if (this.field_q != 0 &&
            wh.field_f != this.field_q) {
            if (this.a(rf.field_b, param3, param0, (byte) -117, hn.field_k) &&
              wh.field_f == 0) {
              this.a(-param3 + rf.field_b, false, this.field_q, -param0 + hn.field_k);
            }
            this.a(rf.field_b, param2, param0, hn.field_k, 0, param3);
          }
          if (param1 < -6) {
            return;
          }
          this.field_H = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("fb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.d((byte) -67) && (84 == param1 ||
            param1 == 83)) {
            this.a(-1, false, 1, -1);
            return true;
          }
          if (param2 == -1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fb.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_F = null;
        field_L = null;
        field_D = null;
        field_G = null;
        if (param0 != -1) {
          fb.h(-5);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
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
          if (param3 != 1) {
            field_K = 55;
          }
          if (this.a(param1, param0, param2, -119)) {
            this.a(param0, param2, param1, false);
            if (this.field_I) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_H) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fb.WA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
          field_G = (String) null;
          return this.field_J;
        }
        return this.field_J;
    }

    final void d(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (!this.field_J) {
          var2 = 42 % ((34 - param0) / 57);
          return;
        }
        this.field_J = false;
        if (null == this.field_p) {
          var2Lifetime1 = 42 % ((34 - param0) / 57);
          return;
        }
        if (!(this.field_p instanceof sd)) {
          var2Lifetime2 = 42 % ((34 - param0) / 57);
          return;
        }
        ((sd) (this.field_p)).a((mf) (this), this.field_J, (byte) 34);
        var2Lifetime3 = 42 % ((34 - param0) / 57);
    }

    fb(String param0, rg param1) {
        this(param0, a.field_a.field_a, param1);
    }

    fb(String param0, jm param1, rg param2) {
        super(param0, param1, param2);
        this.field_J = false;
        this.field_H = true;
        this.field_E = true;
    }

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        RuntimeException var8 = null;
        mf var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 88) {
            var9 = (mf) null;
            this.a(-48, (mf) null);
          }
          if (this.field_H &&
            this.a(param2, param5, param6, (byte) -117, param1)) {
            this.a(0, param4);
            this.field_q = param0;
            if (null != this.field_p) {
              if (!(this.field_p instanceof te)) {
                return true;
              }
              ((te) (this.field_p)).a(param0, param2, param5, (byte) -79, param6, this, param1);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("fb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_H &&
            this.field_E) {
            if (param0 != 0) {
              field_D = (String) null;
            }
            param1.d(param0 + 91);
            this.field_J = true;
            if (this.field_p != null &&
              this.field_p instanceof sd) {
              ((sd) (this.field_p)).a((mf) (this), this.field_J, (byte) 34);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("fb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    void a(int param0, boolean param1, int param2, int param3) {
        if (null != this.field_p) {
          if (!(this.field_p instanceof mj)) {
            if (param1) {
              this.d(-101);
              return;
            }
            return;
          }
          ((mj) (this.field_p)).a(this, param2, param0, param3, -24221);
        }
        if (!param1) {
          return;
        }
        this.d(-101);
    }

    protected fb() {
        this.field_J = false;
        this.field_H = true;
        this.field_E = true;
        this.field_n = a.field_a.field_c;
    }

    static {
        field_D = "<%0>'s game";
        field_F = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_G = "Seriously offensive language";
        field_L = new jc();
        field_K = 0;
    }
}
