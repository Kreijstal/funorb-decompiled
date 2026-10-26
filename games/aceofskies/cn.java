/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cn extends mi {
    int field_y;
    int field_w;
    static String[] field_z;
    int field_C;
    int field_x;
    int field_A;
    int field_B;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        String stackIn_19_2 = null;
        int var12 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          int var8_int = param2 - this.field_C - (param1 + this.field_p);
          int var9 = param6 - (this.field_x + this.field_h) - param4;
          if (this.field_A * this.field_A > var8_int * var8_int + var9 * var9) {
            double var10 = Math.atan2((double)var9, (double)var8_int) - GameCanvas.field_c;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_w;
            } else if (var10 > 0.0) {
              var10 = var10 + 3.141592653589793 / (double)this.field_w;
            }
            this.field_y = (int)(var10 * (double)this.field_w / 6.283185307179586);
            while (this.field_y >= this.field_w) {
              this.field_y = this.field_y - this.field_w;
            }
            while (0 > this.field_y) {
              this.field_y = this.field_y + this.field_w;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var8;
          StringBuilder stackIn_18_1 = new StringBuilder().append("cn.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_z = null;
        if (param0 < -27) {
          return;
        }
        rk var2 = (rk) null;
        cn.a((rk) null, (byte) 13);
    }

    final static byte[] a(File param0, int param1, boolean param2) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param2) {
                rk var4 = (rk) null;
                cn.a((rk) null, (byte) -127);
              }
              byte[] var5 = new byte[param1];
              byte[] var3 = var5;
              IntKeyLookup.a((byte) -106, param1, param0, var5);
              byte[] stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var3_ref = (IOException) (Object) decompiledCaughtException;
              Object stackIn_5_0 = null;
              return (byte[]) (stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var3_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("cn.DA(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          cn.a(95);
          return ks.field_b;
        }
        return ks.field_b;
    }

    private cn() throws Throwable {
        throw new Error();
    }

    final static boolean a(rk param0, byte param1) {
        String stackIn_8_2 = null;
        try {
          if (param1 == 75) {
            boolean stackIn_4_0 = param0.a((byte) 84);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("cn.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
