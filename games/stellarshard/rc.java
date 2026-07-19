/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int discarded$0 = 0;
        int var9 = stellarshard.field_B;
        long var2 = System.nanoTime();
        long var4 = var2 + -this.field_j;
        this.field_j = var2;
        if (-5000000000L < var4) {
            if (!((var4 ^ -1L) <= -5000000001L)) {
                this.field_o[this.field_l] = var4;
                if (this.field_i < 1) {
                    this.field_i = this.field_i + 1;
                }
                this.field_l = (1 + this.field_l) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_i; var8++) {
            var6 = var6 + this.field_o[(10 + this.field_l + -var8) % 10];
        }
        if (param0 != 51) {
            discarded$0 = this.a(false, 51L);
        }
        return var6 / (long)this.field_i;
    }

    public static void d(int param0) {
        String discarded$0 = null;
        field_k = null;
        field_f = null;
        field_e = null;
        if (param0 != 23805) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = rc.a(true, 103, (CharSequence) null);
        }
    }

    final int a(boolean param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        if (param0) {
          if ((this.field_g ^ -1L) >= (this.field_n ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              L1: {
                this.field_g = this.field_g + param1;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (this.field_n > this.field_g) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_n > this.field_g) {
                  this.field_g = this.field_n;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            this.field_j = this.field_j + (this.field_g + -this.field_n);
            this.field_n = this.field_n + (-this.field_n + this.field_g);
            this.field_g = this.field_g + param1;
            return 1;
          }
        } else {
          return -54;
        }
    }

    final static int a(byte param0, int param1) {
        if (!((param1 ^ -1) != -16711936)) {
            return 0;
        }
        if (param0 != -61) {
            String var3 = (String) null;
            rc.a((String) null, (String) null, false);
        }
        return (15 & param1 >> 614291140) + ((param1 & 61440) >> 802981352);
    }

    final long b(int param0) {
        this.field_n = this.field_n + this.b((byte) 51);
        if (param0 != 30393) {
            String var3 = (String) null;
            rc.a((String) null, (String) null, true);
        }
        if (!((this.field_g ^ -1L) >= (this.field_n ^ -1L))) {
            return (-this.field_n + this.field_g) / 1000000L;
        }
        return 0L;
    }

    final void a(byte param0) {
        if ((this.field_n ^ -1L) > (this.field_g ^ -1L)) {
            this.field_n = this.field_n + (this.field_g - this.field_n);
        }
        this.field_j = 0L;
        int var2 = -109 / ((-36 - param0) / 63);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_13_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            if (param1 == 10) {
              var3 = s.a(param2, param0, (byte) 3);
              if (var3 != null) {
                stackOut_6_0 = (String) (var3);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = 0;
                L1: while (true) {
                  if (var4 < param2.length()) {
                    if (!b.a(param2.charAt(var4), (byte) -123)) {
                      stackOut_13_0 = ob.field_d;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("rc.E(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(String param0, String param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              bk.a(12, param0, false, param1);
              if (param2) {
                break L1;
              } else {
                field_k = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rc.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    rc() {
        this.field_g = 0L;
        this.field_i = 1;
        this.field_j = 0L;
        this.field_o = new long[10];
        this.field_l = 0;
        this.field_n = 0L;
        this.field_n = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_f = "Music Off";
        field_e = new String[]{"Super Gunner", "Fireball", "Plasma Gunner", "Golden Beamer", "Fusion Gunner", "Master of Arms", "Crazy Pilot", "Insane Pilot", "Shard Destroyer", "Shard Obliterator", "Shard Annihilator", "Shard Fighter", "Shard Warrior", "High Spirits"};
        field_m = 4;
    }
}
