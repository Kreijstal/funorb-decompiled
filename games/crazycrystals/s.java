/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends ke {
    static dl[] field_o;
    private long field_m;
    private int field_g;
    static int[] field_h;
    private int field_j;
    static String field_f;
    static char[] field_d;
    static boolean field_l;
    private long field_e;
    static long field_k;
    private long field_i;
    private long[] field_n;

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = CrazyCrystals.field_B;
          if (param1 == -19) {
            break L0;
          } else {
            dl[] discarded$1 = s.a(69, -78, -40, (byte) 66);
            break L0;
          }
        }
        if (((s) this).field_e <= ((s) this).field_i) {
          var4 = 0;
          L1: while (true) {
            L2: {
              var4++;
              ((s) this).field_e = ((s) this).field_e + param0;
              if (10 <= var4) {
                break L2;
              } else {
                if (((s) this).field_e < ((s) this).field_i) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((s) this).field_i > ((s) this).field_e) {
                ((s) this).field_e = ((s) this).field_i;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((s) this).field_m = ((s) this).field_m + (-((s) this).field_i + ((s) this).field_e);
          ((s) this).field_i = ((s) this).field_i + (-((s) this).field_i + ((s) this).field_e);
          ((s) this).field_e = ((s) this).field_e + param0;
          return 1;
        }
    }

    final static dl[] a(int param0, int param1, int param2, byte param3) {
        if (param3 < 126) {
            return null;
        }
        return ue.a(9, param0, 1, param2, param1);
    }

    public static void b(byte param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_o = null;
    }

    final void a(int param0) {
        if (param0 == 15834) {
          ((s) this).field_m = 0L;
          if (((s) this).field_e <= ((s) this).field_i) {
            return;
          } else {
            ((s) this).field_i = ((s) this).field_i + (((s) this).field_e - ((s) this).field_i);
            return;
          }
        } else {
          return;
        }
    }

    final static String a(ng param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        String var6 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var4 = 36 % ((param1 - 40) / 56);
              var3_int = param0.c(false);
              if (80 >= var3_int) {
                break L0;
              } else {
                var3_int = 80;
                break L0;
              }
            }
            var5 = new byte[var3_int];
            param0.field_f = param0.field_f + dm.field_f.a(param0.field_h, 0, -1, var3_int, param0.field_f, var5);
            var6 = gd.a((byte) 61, var5, 0, var3_int);
            stackOut_2_0 = (String) var6;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("s.I(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + 80 + 41);
        }
    }

    final long a(boolean param0) {
        ((s) this).field_i = ((s) this).field_i + this.c((byte) 14);
        if (~((s) this).field_e >= ~((s) this).field_i) {
          if (!param0) {
            return 27L;
          } else {
            return 0L;
          }
        } else {
          return (((s) this).field_e - ((s) this).field_i) / 1000000L;
        }
    }

    private final long c(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        var2 = System.nanoTime();
        var4 = var2 - ((s) this).field_m;
        ((s) this).field_m = var2;
        if (var4 > -5000000000L) {
          if (5000000000L > var4) {
            ((s) this).field_n[((s) this).field_j] = var4;
            ((s) this).field_j = (1 + ((s) this).field_j) % 10;
            if (((s) this).field_g >= 1) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (((s) this).field_g < var8) {
                  return var6 / (long)((s) this).field_g;
                } else {
                  var6 = var6 + ((s) this).field_n[(10 + ((s) this).field_j + -var8) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((s) this).field_g = ((s) this).field_g + 1;
              var6 = 0L;
              var8 = 1;
              L1: while (true) {
                if (((s) this).field_g < var8) {
                  return var6 / (long)((s) this).field_g;
                } else {
                  var6 = var6 + ((s) this).field_n[(10 + ((s) this).field_j + -var8) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((s) this).field_g < var8) {
                return var6 / (long)((s) this).field_g;
              } else {
                var6 = var6 + ((s) this).field_n[(10 + ((s) this).field_j + -var8) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((s) this).field_g < var8) {
              return var6 / (long)((s) this).field_g;
            } else {
              var6 = var6 + ((s) this).field_n[(10 + ((s) this).field_j + -var8) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    s() {
        ((s) this).field_m = 0L;
        ((s) this).field_g = 1;
        ((s) this).field_i = 0L;
        ((s) this).field_j = 0;
        ((s) this).field_n = new long[10];
        ((s) this).field_e = 0L;
        ((s) this).field_i = System.nanoTime();
        ((s) this).field_e = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{'[', ']', '#'};
        field_k = 20000000L;
        field_f = "EXCLUSIVE";
    }
}
