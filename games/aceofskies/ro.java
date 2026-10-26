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
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != -3992) {
          ro.c((byte) 102);
        }
        bi var2 = (bi) (hh.field_b.a((byte) -27, (long)param1));
        if (var2 == null) {
          byte[] var11 = new byte[512];
          byte[] var10 = var11;
          byte[] var3 = var10;
          Random var4 = new Random((long)param1);
          for (int var5 = 0; var5 < 255; var5++) {
            var3[var5] = (byte)var5;
          }
          for (int var5Lifetime1 = 0; var5Lifetime1 < 255; var5Lifetime1++) {
            int var6 = -var5Lifetime1 + 255;
            int var7 = bs.a(-1, var4, var6);
            int var8 = var11[var7];
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
        String stackIn_49_2 = null;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            boolean var4_int = false;
            boolean var5 = false;
            int var6 = 0;
            if (param2 > -77) {
              field_p = (String) null;
            }
            int var7 = param3.length();
            for (int var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              int var9 = param3.charAt(var8);
              if (0 == var8 &&
                var9 == 45) {
                var4_int = true;
                decompiledFrameRemainder0 = false;
              }
              if (decompiledFrameRemainder0 && (0 != var8 || (var9 != 43 ||
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
                if (var4_int) {
                  var9 = -var9;
                }
                int var10 = var6 * param0 + var9;
                if (var10 / param0 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
              }
            }
            if (!var5) {
              throw new NumberFormatException();
            }
            int stackIn_45_0 = var6;
            return stackIn_45_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_48_0 = var4;
          StringBuilder stackIn_48_1 = new StringBuilder().append("ro.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
