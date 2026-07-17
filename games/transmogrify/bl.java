/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int[] field_d;
    private ci field_f;
    static String[] field_b;
    private ci field_c;
    private fl field_a;
    private fl field_e;

    private final hb b(int param0, int param1, int[] param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hb var8 = null;
        ml var9 = null;
        hb stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        hb stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        hb stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = (param1 << 4 & 65529 | param1 >>> 12) ^ param0;
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (hb) (Object) ((bl) this).field_e.a(var6, 0);
            if (var8 != null) {
              stackOut_2_0 = (hb) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2[0] > 0) {
                    break L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (hb) (Object) stackIn_7_0;
                  }
                }
              }
              L2: {
                var9 = (ml) (Object) ((bl) this).field_a.a(var6, 0);
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = ml.a(((bl) this).field_f, param1, param0);
                  if (var9 != null) {
                    ((bl) this).field_a.a(var6, (byte) -100, (wf) (Object) var9);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.c(5);
                ((bl) this).field_e.a(var6, (byte) 74, (wf) (Object) var8);
                stackOut_16_0 = (hb) var8;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("bl.E(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 79289964 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(int param0) {
        if (param0 != 858) {
            return;
        }
        ec.a("", param0 ^ 815, (String) null);
    }

    final hb a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        hb stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hb stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        hb stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (1 != ((bl) this).field_f.a(117)) {
            if (param0 == 1673501264) {
              if (((bl) this).field_f.a(param1, (byte) 121) != 1) {
                throw new RuntimeException();
              } else {
                int discarded$4 = 79289964;
                stackOut_7_0 = this.b(0, param1, param2);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (hb) (Object) stackIn_5_0;
            }
          } else {
            int discarded$5 = 79289964;
            stackOut_1_0 = this.b(param1, 0, param2);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("bl.F(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L0;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L0;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final hb a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        hb stackIn_5_0 = null;
        hb stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_8_0 = null;
        hb stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (param2 == 17) {
            if (((bl) this).field_c.a(param2 ^ 112) != 1) {
              if (((bl) this).field_c.a(param1, (byte) 101) == 1) {
                stackOut_8_0 = this.a(-48, 0, param0, param1);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                throw new RuntimeException();
              }
            } else {
              stackOut_4_0 = this.a(-94, param1, param0, 0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (hb) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("bl.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        cf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = (cf) (Object) mh.field_e.a((byte) -95);
          L0: while (true) {
            if (var4 == null) {
              field_d = null;
              return;
            } else {
              int discarded$2 = 2;
              gj.a((byte) 83, var4);
              var4 = (cf) (Object) mh.field_e.a(true);
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "bl.A(" + 0 + 44 + 2 + 41);
        }
    }

    public static void b() {
        field_d = null;
        field_b = null;
    }

    private final hb a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hb var8 = null;
        r var9 = null;
        int var10 = 0;
        hb var11 = null;
        hb stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        hb stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_13_0 = null;
        Object stackOut_8_0 = null;
        hb stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var5_int = param1 ^ (65533 & param3 << 4 | param3 >>> 12);
            var5_int = var5_int | param3 << 16;
            var6 = (long)var5_int;
            var8 = (hb) (Object) ((bl) this).field_e.a(var6, 0);
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2[0] > 0) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var9 = r.a(((bl) this).field_c, param3, param1);
              if (var9 != null) {
                L2: {
                  var10 = -92 / ((48 - param0) / 34);
                  var11 = var9.a();
                  var8 = var11;
                  ((bl) this).field_e.a(var6, (byte) 75, (wf) (Object) var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var11.field_l.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_13_0 = (hb) var8;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (hb) (Object) stackIn_9_0;
              }
            } else {
              stackOut_1_0 = (hb) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("bl.C(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    bl(ci param0, ci param1) {
        ((bl) this).field_a = new fl(256);
        ((bl) this).field_e = new fl(256);
        try {
            ((bl) this).field_f = param1;
            ((bl) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "bl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_b = new String[]{"Score 600+ points", "Score 1,000+ points", "Submit a 6+ letter word that uses exactly the same tiles as the previous word", "Submit a 9+ letter word that uses exactly the same tiles as the previous word", "Submit a word where every tile has already been used at least twice", "Submit a word where every tile has already been used at least three times", "Reuse any one consonant tile in every word", "Reuse any two consonant tiles in every word", "Submit a word of 10+ letters", "Submit a 12-letter word", "Extend a 4+ letter word by using every one of its tiles plus 3 new ones", "Submit a 100-point word", "Get a time bonus of 100+ points", "Get a time bonus of 150+ points", "Score 600+ points, including a time bonus of 100+", "Spell 'pumpkin', 'mummy', 'skeleton' or 'vampire'!"};
    }
}
