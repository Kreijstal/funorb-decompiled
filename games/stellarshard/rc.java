/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rc extends ci {
    static int field_h;
    private long field_g;
    static String[] field_e;
    static String field_f;
    private int field_l;
    private int field_i;
    private long field_j;
    private long[] field_o;
    static int[] field_k;
    static int field_m;
    private long field_n;

    private final long b(byte param0) {
        int var8 = 0;
        int var9 = stellarshard.field_B;
        long var2 = System.nanoTime();
        long var4 = var2 + -((rc) this).field_j;
        ((rc) this).field_j = var2;
        if (-5000000000L < var4) {
            if (!(var4 >= 5000000000L)) {
                ((rc) this).field_o[((rc) this).field_l] = var4;
                if (((rc) this).field_i < 1) {
                    ((rc) this).field_i = ((rc) this).field_i + 1;
                }
                ((rc) this).field_l = (1 + ((rc) this).field_l) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((rc) this).field_i; var8++) {
            var6 = var6 + ((rc) this).field_o[(10 + ((rc) this).field_l + -var8) % 10];
        }
        return var6 / (long)((rc) this).field_i;
    }

    public static void d(int param0) {
        field_k = null;
        field_f = null;
        field_e = null;
    }

    final int a(boolean param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        if (param0) {
          if (~((rc) this).field_g >= ~((rc) this).field_n) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((rc) this).field_g = ((rc) this).field_g + param1;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (((rc) this).field_n > ((rc) this).field_g) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((rc) this).field_n > ((rc) this).field_g) {
                  ((rc) this).field_g = ((rc) this).field_n;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((rc) this).field_j = ((rc) this).field_j + (((rc) this).field_g + -((rc) this).field_n);
            ((rc) this).field_n = ((rc) this).field_n + (-((rc) this).field_n + ((rc) this).field_g);
            ((rc) this).field_g = ((rc) this).field_g + param1;
            return 1;
          }
        } else {
          return -54;
        }
    }

    final static int a(byte param0, int param1) {
        if (!(param1 != 16711935)) {
            return 0;
        }
        return (15 & param1 >> 4) + ((param1 & 61440) >> 8);
    }

    final long b(int param0) {
        ((rc) this).field_n = ((rc) this).field_n + this.b((byte) 51);
        if (param0 != 30393) {
            Object var3 = null;
            rc.a((String) null, (String) null, true);
        }
        if (!(~((rc) this).field_g >= ~((rc) this).field_n)) {
            return (-((rc) this).field_n + ((rc) this).field_g) / 1000000L;
        }
        return 0L;
    }

    final void a(byte param0) {
        if (~((rc) this).field_n > ~((rc) this).field_g) {
            ((rc) this).field_n = ((rc) this).field_n + (((rc) this).field_g - ((rc) this).field_n);
        }
        ((rc) this).field_j = 0L;
        int var2 = -109 / ((-36 - param0) / 63);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = stellarshard.field_B;
        try {
          var3 = s.a(param2, false, (byte) 3);
          if (var3 != null) {
            stackOut_5_0 = (String) var3;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (!b.a(param2.charAt(var4), (byte) -123)) {
                  stackOut_12_0 = ob.field_d;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("rc.E(").append(false).append(',').append(10).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final static void a(String param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            bk.a(12, param0, false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("rc.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + true + ')');
        }
    }

    rc() {
        ((rc) this).field_g = 0L;
        ((rc) this).field_i = 1;
        ((rc) this).field_j = 0L;
        ((rc) this).field_o = new long[10];
        ((rc) this).field_l = 0;
        ((rc) this).field_n = 0L;
        ((rc) this).field_n = System.nanoTime();
        ((rc) this).field_g = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Music Off";
        field_e = new String[]{"Super Gunner", "Fireball", "Plasma Gunner", "Golden Beamer", "Fusion Gunner", "Master of Arms", "Crazy Pilot", "Insane Pilot", "Shard Destroyer", "Shard Obliterator", "Shard Annihilator", "Shard Fighter", "Shard Warrior", "High Spirits"};
        field_m = 4;
    }
}
