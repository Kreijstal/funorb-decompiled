/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ro extends ua implements ti {
    static AircraftDefinition field_u;
    static hd field_o;
    private la field_s;
    static String field_p;
    static lh field_r;
    static int field_q;
    static int[] field_t;

    final static byte[] b(int param0, int param1) {
        bi var2;
        byte[] var3;
        Random var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        byte[] var10;
        byte[] var11;
        int var5Lifetime1;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != -3992) {
          ro.c((byte) 102);
        }
        var2 = (bi) (hh.field_b.a((byte) -27, (long)param1));
        if (var2 == null) {
          var11 = new byte[512];
          var10 = var11;
          var3 = var10;
          var4 = new Random((long)param1);
          for (var5 = 0; var5 < 255; var5++) {
            var3[var5] = (byte)var5;
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 255; var5Lifetime1++) {
            var6 = -var5Lifetime1 + 255;
            var7 = bs.a(-1, var4, var6);
            var8 = var11[var7];
            var3[var7] = var11[var6];
            var3[511 - var5Lifetime1] = (byte) var8;
            var3[var6] = (byte) var8;
          }
          var2 = new bi(var11);
          hh.field_b.a(var2, 2, (long)param1);
        }
        return var2.field_n;
    }

    ro(jc param0, la param1, boolean param2) {
        super(param0, 34963, param2);
        try {
          this.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1) {
        super.a(param0, param1 * this.field_s.field_c);
    }

    public final boolean a(byte param0) {
        int var2 = 16 / ((param0 + 61) / 59);
        return super.a(this.field_a.field_Qc, (byte) -115);
    }

    public final void a(int param0) {
        super.a(param0);
    }

    public static void d(byte param0) {
        field_r = null;
        field_o = null;
        field_u = null;
        field_p = null;
        field_t = null;
        int var1 = 41 / ((15 - param0) / 62);
    }

    final static int a(int param0, boolean param1, int param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (param2 > -77) {
              field_p = (String) null;
            }
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param0) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param0 + var9;
                if (var10 / param0 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_45_0 = var6;
            return stackIn_45_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_48_0 = var4;
          stackIn_48_1 = new StringBuilder().append("ro.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 32570) {
          this.a((byte) -43);
        }
        return super.a(this.field_a.field_Qc, param0, -10386);
    }

    final static int c(byte param0) {
        if (param0 != -37) {
          return -16;
        }
        return oj.field_g;
    }

    static {
        field_u = new AircraftDefinition(4.0, 20, 3, 100, 25, 2.0, 20.0, 32, 2);
        field_p = "ACHIEVEMENTS";
        field_o = new hd(1);
        field_r = new lh();
        field_t = new int[8192];
    }
}
