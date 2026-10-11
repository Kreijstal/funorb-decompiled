/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ck extends lm {
    private boolean field_C;
    boolean field_B;
    static cn field_G;
    static fm field_H;
    static String field_D;
    boolean field_E;
    private boolean field_F;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
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
          if (this.a(param1, param0, 108, param2)) {
            this.a(param0, param2, param1, 1);
            if (this.field_E) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param2.append(" disabled");
            }
          }
          if (param3 > -76) {
            ck.e((byte) 58);
          }
          stackIn_10_0 = (StringBuilder) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ck.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    ck(String param0, ca param1, pg param2) {
        super(param0, param1, param2);
        this.field_C = true;
        this.field_B = true;
        this.field_F = false;
    }

    final static void h(int param0) {
        jb.k((byte) -82);
        int var1 = 28 / ((param0 + 14) / 61);
    }

    final void e(int param0) {
        if (this.field_F) {
          this.field_F = false;
          if (null != this.field_n &&
            this.field_n instanceof io) {
            ((io) (this.field_n)).a(this.field_F, 124, (lm) (this));
          }
        }
        if (param0 <= 1) {
          String var3 = (String) null;
          ck.a((String) null, 62, (String) null);
        }
    }

    boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            this.field_E = true;
          }
          if (!this.field_B) {
            return false;
          }
          if (!this.field_C) {
            return false;
          }
          param1.e(53);
          this.field_F = true;
          if (this.field_n != null &&
            this.field_n instanceof io) {
            ((io) (this.field_n)).a(this.field_F, -71, (lm) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ck.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 108 / ((param5 + 80) / 35);
          if (this.field_B &&
            this.a(param4, param3, param6, -1, param2)) {
            this.a(34, param0);
            this.field_y = param1;
            if (this.field_n != null) {
              if (!(this.field_n instanceof si)) {
                return true;
              }
              ((si) (this.field_n)).a(param2, this, param3, -100, param1, param6, param4);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("ck.U(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_y != 0) {
            if (la.field_g == this.field_y) {
              return;
            }
            if (this.a(hj.field_S, param0, param1, -1, eh.field_h) &&
              0 == la.field_g) {
              this.b(-param1 + eh.field_h, this.field_y, 1, -param0 + hj.field_S);
            }
            this.a(param1, true, eh.field_h, param2, param0, hj.field_S);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ck.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    ck(String param0, pg param1) {
        this(param0, hl.field_a.field_o, param1);
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 93) && (param2 == 84 ||
            param2 == 83)) {
            this.b(-1, 1, 1, -1);
            return true;
          }
          if (param3 <= 55) {
            this.b(56, -107, -73, -111);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ck.W(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = DungeonAssault.field_K;
        try {
          re.b();
          jk.field_Bb = new int[260];
          lh.field_t = 11;
          if (param0 != 65) {
            return;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            jk.field_Bb[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < jk.field_Bb.length) {
            jk.field_Bb[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "ck.RA(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        if (this.field_n != null &&
          this.field_n instanceof si) {
          ((si) (this.field_n)).a((byte) 42, param2, param0, param4, this, param5);
        }
        if (!param1) {
          return;
        }
        try {
          this.field_y = 0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ck.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 <= 6) {
          this.a((byte) -101);
        }
        return this.field_F;
    }

    final static void a(String param0, int param1, String param2) {
        try {
          if (param1 != 11) {
            field_D = (String) null;
          }
          lp.a(param0, -74, false, param2);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ck.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_D = null;
        if (!param0) {
          ck.g(50);
        }
        field_G = null;
        field_H = null;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
          this.field_C = false;
        }
        if (this.field_n != null &&
          this.field_n instanceof vg) {
          ((vg) (this.field_n)).a(this, (byte) 98, param1, param0, param3);
        }
    }

    final static boolean g(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -1) {
          return true;
        }
        stackIn_7_0 = (nk.field_Ib != null) || (td.field_c);
        return stackIn_7_0;
    }

    protected ck() {
        this.field_C = true;
        this.field_B = true;
        this.field_F = false;
        this.field_o = hl.field_a.field_d;
    }

    static {
        field_D = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
