/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_g;
    static RgbSprite field_c;
    static int field_e;
    static String field_b;
    static int field_a;
    static int field_f;
    static boolean field_h;
    static int field_d;

    final static String a(String param0, byte param1, String param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          var4_int = param3.length();
          var5 = param0.length();
          var6 = param2.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          if (param1 != 11) {
            field_a = 34;
          }
          var8 = var6 - var5;
          if (0 != var8) {
            var9_int = 0;
            while (true) {
              var9_int = param3.indexOf(param0, var9_int);
              if (var9_int < 0) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param3.indexOf(param0, var10);
            if (var11 < 0) {
              discarded$2 = var9.append(param3.substring(var10));
              stackIn_16_0 = var9.toString();
              return stackIn_16_0;
            }
            discarded$0 = var9.append(param3.substring(var10, var11));
            var10 = var11 + var5;
            discarded$1 = var9.append(param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ln.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static ik a(byte param0) {
        if (param0 > -53) {
          field_a = 61;
        }
        return new ik(hl.d(87), jk.c((byte) 105));
    }

    final static byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param0);
          if (param1 < 126) {
            field_e = 55;
          }
          var3 = var9.f((byte) -72);
          var4 = var9.i(0);
          if (var4 >= 0 && (uf.field_c == 0 ||
            !(var4 > uf.field_c))) {
            if (0 == var3) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(0, var12, 28, var4);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.i(0);
            if (var5 >= 0 && (uf.field_c == 0 ||
              !(var5 > uf.field_c))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 != var3) {
                var7 = wc.field_e;
                synchronized (var7) {
                  wc.field_e.a(var9, var13, true);
                }
              } else {
                oi.a(var13, var5, param0, var4, 9);
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ln.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (param2 != -16121) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var3 = jd.a(param0, param1, 88);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          var4 = 0;
          while (true) {
            if (param0.length() <= var4) {
              return null;
            }
            if (im.a(param0.charAt(var4), false)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = GameApplet.field_f;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ln.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_g = 53;
        }
        field_c = null;
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = SteelSentinels.obfuscationControl;
          try {
            if (ne.field_N != null) {
              ne.field_N.b(111);
            }
            if (param0 != -8601) {
              field_b = (String) null;
            }
            if (null != hk.field_oc) {
              hk.field_oc.a(0);
            }
            if (null != si.field_o) {
              try {
                si.field_o.c(param0 ^ 8679);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (rh.field_o != null) {
              for (var1_int = 0; var1_int < rh.field_o.length; var1_int++) {
                if (rh.field_o[var1_int] != null) {
                  try {
                    rh.field_o[var1_int].c(-127);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ci.a((Throwable) ((Object) var1), "ln.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Email: ";
        field_c = null;
        field_a = 0;
        field_f = 0;
        field_d = 32;
    }
}
