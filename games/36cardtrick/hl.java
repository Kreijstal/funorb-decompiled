/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hl extends lk {
    private boolean field_z;
    boolean field_D;
    static boolean[] field_y;
    static String field_C;
    private boolean field_A;
    boolean field_B;

    boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B &&
            this.a(-102, param0, param6, param2, param1)) {
            this.a(107, param4);
            this.field_x = param5;
            if (this.field_k != null) {
              if (!(this.field_k instanceof fi)) {
                return true;
              }
              ((fi) (this.field_k)).a(param6, param0, param2, this, param5, param1, (byte) -124);
            }
            return true;
          }
          if (param3 <= -14) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("hl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(le param0, int param1) {
        RuntimeException var2 = null;
        le var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            var3 = (le) null;
            hl.a((le) null, -15);
          }
          stackIn_3_0 = param0.b((byte) -127);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hl.BB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    hl(String param0, pl param1) {
        this(param0, pj.field_a.field_i, param1);
    }

    final boolean d(int param0) {
        if (param0 <= 44) {
          this.field_A = false;
          return this.field_z;
        }
        return this.field_z;
    }

    void a(int param0, int param1, lk param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_x != 0 &&
            k.field_c != this.field_x) {
            if (this.a(-47, param1, ij.field_e, eg.field_b, param0) &&
              k.field_c == 0) {
              this.a(-param0 + ij.field_e, true, this.field_x, -param1 + eg.field_b);
            }
            this.a(false, param2, eg.field_b, param1, param0, ij.field_e);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B &&
            this.field_A) {
            param1.c((byte) 31);
            this.field_z = true;
            if (this.field_k != null &&
              this.field_k instanceof nj) {
              ((nj) (this.field_k)).a(62, this.field_z, (lk) (this));
            }
            if (param0 > 71) {
              return true;
            }
            this.field_z = true;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    hl(String param0, ci param1, pl param2) {
        super(param0, param1, param2);
        this.field_z = false;
        this.field_A = true;
        this.field_B = true;
    }

    final void c(byte param0) {
        if (param0 <= 27) {
          return;
        }
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (null == this.field_k) {
          return;
        }
        if (!(this.field_k instanceof nj)) {
          return;
        }
        ((nj) (this.field_k)).a(81, this.field_z, (lk) (this));
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        if (param0) {
          return;
        }
        try {
          if (this.field_k != null &&
            this.field_k instanceof fi) {
            ((fi) (this.field_k)).a(param4, -32051, param5, this, param3, param2);
          }
          this.field_x = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hl.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        qk var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.d(123) && (param2 == 84 ||
            param2 == 83)) {
            this.a(-1, true, 1, -1);
            return true;
          }
          if (param1 < -99) {
            return false;
          }
          var6 = (qk) null;
          hl.a((qk) null, -100, -63, -51);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hl.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_C = null;
        field_y = null;
        if (param0 > -33) {
          hl.d((byte) -15);
        }
    }

    final StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
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
          if (param1) {
            this.field_z = false;
          }
          if (this.a(param3, param2, param1, param0)) {
            this.a(param0, (byte) -16, param3, param2);
            if (this.field_D) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param3.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hl.V(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          return;
        }
        if (this.field_k == null) {
          return;
        }
        if (this.field_k instanceof qh) {
          ((qh) (this.field_k)).a(param0, 23, param2, this, param3);
          return;
        }
    }

    final static kc[] a(qk param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kc[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 57 / ((param1 - 0) / 50);
          if (tc.a(param3, param2, 25479, param0)) {
            stackIn_4_0 = pf.a(111);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (kc[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("hl.WA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected hl() {
        this.field_z = false;
        this.field_A = true;
        this.field_B = true;
        this.field_v = pj.field_a.field_n;
    }

    static {
        field_C = "Passwords can only contain letters and numbers";
    }
}
