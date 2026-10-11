/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class joa {
    static int field_a;
    static kn field_c;
    static jea field_d;
    private java.util.zip.Inflater field_b;

    final static qla a(String param0, cn param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        qla stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 52 % ((param3 - 12) / 56);
          var5 = param1.a(param2, (byte) 126, param0);
          if (var5 != null) {
            stackIn_4_0 = new qla(var5);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (qla) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("joa.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public joa() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte param0, byte[] param1, uia param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2.field_g[param2.field_h] == 31 &&
              -117 == param2.field_g[1 + param2.field_h]) {
              if (null == this.field_b) {
                this.field_b = new java.util.zip.Inflater(true);
              }
              try {
                this.field_b.setInput(param2.field_g, param2.field_h + 10, param2.field_g.length - (10 + (param2.field_h + 8)));
                this.field_b.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_b.reset();
                throw new RuntimeException("");
              }
              if (param0 != -34) {
                field_d = (jea) null;
              }
              this.field_b.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("joa.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          long dupTemp$1 = 0L;
          int var2 = 0;
          IOException var3 = null;
          kh var4 = null;
          int stackIn_10_0 = 0;
          Throwable decompiledCaughtException = null;
          if (la.field_R == null) {
            la.field_R = kqa.field_a.a(-24818, rsa.field_x, nn.field_b);
          }
          var2 = -67 % ((param1 - 67) / 35);
          if (0 == la.field_R.field_b) {
            return false;
          }
          dupTemp$1 = bva.b((byte) -107);
          mha.field_D = dupTemp$1;
          ue.field_s = dupTemp$1;
          if (la.field_R.field_b != 1) {
            km.field_p = af.field_g;
          } else {
            try {
              oba.field_e = new jqa((java.net.Socket) (la.field_R.field_f), kqa.field_a);
              ql.field_k.field_h = 0;
              var4 = vc.field_q;
              km.field_p = sua.field_G;
              var4.field_h = 0;
              stackIn_10_0 = (!param0) ? -1 : -2;
              vua.field_B = stackIn_10_0;
              hla.field_xb = stackIn_10_0;
              ufa.field_c = stackIn_10_0;
              ea.a((byte) -125, csa.field_g, ql.field_k, vh.field_g, be.field_c);
              bl.a(-1, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (IOException) (Object) decompiledCaughtException;
              km.field_p = af.field_g;
              la.field_R = null;
              return true;
            }
          }
          la.field_R = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          field_c = null;
          return;
        }
        String var2 = (String) null;
        joa.a((String) null, (cn) null, (String) null, (byte) 49);
        field_c = null;
    }

    final static String a(boolean param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        StringBuilder stackIn_10_0 = null;
        String stackIn_11_1 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = 58 % ((3 - param1) / 60);
          while (true) {
            if (16 <= var3_int) {
              stackIn_15_0 = "Learn to spell";
              return stackIn_15_0;
            }
            if (!dra.field_b[var3_int].equalsIgnoreCase(param2)) {
              var3_int++;
              continue;
            }
            break;
          }
          if (param0) {
            v.b(var3_int, 0);
          } else {
            aoa.a(120, var3_int);
          }
          stackIn_10_0 = new StringBuilder().append(param2).append(" set ");
          if (!param0) {
            stackIn_11_1 = "Off";
          } else {
            stackIn_11_1 = "On";
          }
          stackIn_12_0 = ((StringBuilder) (Object) stackIn_10_0).append(stackIn_11_1).toString();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("joa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private joa(int param0, int param1, int param2) {
    }

    static {
    }
}
