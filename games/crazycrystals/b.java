/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class b {
    static int field_a;
    private be field_c;
    private int field_f;
    private ug field_e;
    static String field_b;
    static String field_d;
    private int field_g;

    private final void a(int param0, ib param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 62) {
            this.a((Object) null, -109, (byte) 8, -120L);
          }
          if (param1 != null) {
            param1.a(false);
            param1.a(1);
            this.field_g = this.field_g + param1.field_n;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("b.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
    }

    final static Vector a(int param0, InputStream param1, String[] param2) throws IOException {
        int var7 = 0;
        int var15 = 0;
        Vector stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Vector var6 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        f[][] var12 = null;
        f var13 = null;
        int var14 = 0;
        int var16 = 0;
        DataInputStream var17 = null;
        String var18 = null;
        String var19 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        var16 = CrazyCrystals.field_B;
        try {
          var17 = new DataInputStream(param1);
          var4 = var17.readByte();
          var5 = var17.readShort();
          var6 = new Vector();
          for (var7 = param0; var5 > var7; var7++) {
            var18 = sb.a(1, var17);
            var8 = var18;
            var9 = var17.readUnsignedByte();
            var10 = var17.readInt();
            var11 = var17.readInt();
            var12 = new f[var11 + 2][2 + var10];
            var13 = ff.a(0, 0, 1, var4, var17);
            for (var14 = 0; var14 < 2 + var10; var14++) {
              var12[0][var14] = var13;
            }
            for (var14Lifetime1 = 1; 1 + var11 > var14Lifetime1; var14Lifetime1++) {
              var12[var14Lifetime1][0] = var13;
              for (var15 = 1; var10 + 1 > var15; var15++) {
                var12[var14Lifetime1][var15] = ff.a(var4, var15, oe.a(param0, 1), var14Lifetime1, var17);
              }
              var12[var14Lifetime1][var10 + 1] = var13;
            }
            for (var14Lifetime2 = 0; var14Lifetime2 < 2 + var10; var14Lifetime2++) {
              var12[1 + var11][var14Lifetime2] = var13;
            }
            boolean decompiledFrameRemainder0 = true;
            if (param2 != null) {
              if (var18.length() == 0) {
                var6.addElement((Object) null);
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ul.field_g == 0 &&
                  !param2[var7].equals(var18)) {
                  throw new IllegalStateException(Integer.toString(var7));
                }
                var19 = param2[var7];
                var8 = var19;
                if (go.field_l.a(var19) > 146) {
                }
              }
            }
            if (decompiledFrameRemainder0) {
              var6.addElement(new kb(var12, var8, var9));
            }
          }
          stackIn_27_0 = var6;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("b.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final Object a(int param0, long param1) {
        qd var6 = null;
        ib var7 = (ib) (this.field_e.a(param1, -114));
        if (var7 == null) {
          return null;
        }
        if (param0 < 83) {
          field_b = (String) null;
        }
        Object var5 = var7.f(-18088);
        if (var5 == null) {
          var7.a(false);
          var7.a(1);
          this.field_g = this.field_g + var7.field_n;
          return null;
        }
        if (!var7.h(-964)) {
          this.field_c.a((byte) 8, var7);
          var7.field_k = 0L;
        } else {
          var6 = new qd(var5, var7.field_n);
          this.field_e.a(var7.field_e, (byte) 42, var6);
          this.field_c.a((byte) 124, var6);
          ((ib) ((Object) var6)).field_k = 0L;
          var7.a(false);
          var7.a(1);
        }
        return var5;
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        ib var6 = null;
        qd var6_ref = null;
        int var7 = CrazyCrystals.field_B;
        try {
          if (param2 < 46) {
            field_d = (String) null;
          }
          if (param1 > this.field_f) {
            throw new IllegalStateException();
          }
          this.a(param3, -70);
          this.field_g = this.field_g - param1;
          while (this.field_g < 0) {
            var6 = (ib) (this.field_c.a(30244));
            this.a(66, var6);
          }
          var6_ref = new qd(param0, param1);
          this.field_e.a(param3, (byte) 42, var6_ref);
          this.field_c.a((byte) 119, var6_ref);
          ((ib) ((Object) var6_ref)).field_k = 0L;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "b.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = CrazyCrystals.field_B;
        if (param10 != 44) {
          b.a(127);
        }
        if (param11 <= param13) {
          if (param3 <= param13) {
            if (param3 <= param11) {
              cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
            } else {
              cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
            }
          } else {
            cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
          }
        } else {
          if (param3 <= param11) {
            if (param3 <= param13) {
              cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
            } else {
              cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, param15);
            }
          } else {
            cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, param15);
          }
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          field_a = -27;
        }
        stackIn_6_0 = (null != oi.field_c) && (gj.field_k.a(-2));
        return stackIn_6_0;
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        ng var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var9 = new ng(param0);
          var3 = var9.h(255);
          var4 = var9.b((byte) 127);
          if (param1 >= ~var4 && (0 == w.field_g ||
            !(w.field_g < var4))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(var4, var12, (byte) -58, 0);
              stackIn_7_0 = var5_ref_byte__;
              return stackIn_7_0;
            }
            var5 = var9.b((byte) 126);
            if (var5 >= 0 && (w.field_g == 0 ||
              !(w.field_g < var5))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 == 1) {
                di.a(var13, var5, param0, var4, 9);
              } else {
                var7 = qg.field_s;
                synchronized (var7) {
                  qg.field_s.a(var13, var9, -19515);
                }
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("b.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(long param0, int param1) {
        ib var4 = (ib) (this.field_e.a(param0, -117));
        this.a(98, var4);
        if (param1 > -66) {
          b.a(6, -67, 121, -107, 106, -115, -66, 114, 26, -103, -124, 35, 74, -126, 34, 60);
        }
    }

    final void a(Object param0, int param1, long param2) {
        try {
          this.a(param0, param1, (byte) 60, param2);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "b.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Select Level";
        field_d = "Arcade Levels";
    }
}
