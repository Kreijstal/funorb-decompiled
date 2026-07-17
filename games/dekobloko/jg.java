/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    private boolean field_l;
    static int[] field_f;
    static String[] field_k;
    static boolean field_i;
    private String field_d;
    static int field_g;
    static ud field_j;
    static int[] field_h;
    static String field_c;
    static byte[][][] field_b;
    static volatile boolean field_e;
    static ui field_a;

    public static void b(byte param0) {
        field_k = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_j = null;
        int var1 = -13;
        field_b = null;
        field_c = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            vf.field_a = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            pf.a(param0, var2, var4, (byte) 89, var3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "jg.C(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            jg.a(-65);
            return ((jg) this).field_l;
        }
        return ((jg) this).field_l;
    }

    final static void a(boolean param0, String param1) {
        hl.field_a = param1;
        if (!param0) {
            return;
        }
        try {
            hm.a(12, (byte) -111);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "jg.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static ui a(boolean param0, pl param1, int param2, int param3, ji param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        byte[] var7 = null;
        ui stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ui stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var7 = param4.a(param2, 108, param3);
              var5 = var7;
              if (param0) {
                break L1;
              } else {
                var6 = null;
                jg.a(false, (String) null);
                break L1;
              }
            }
            if (var7 != null) {
              stackOut_5_0 = new ui(new wl(var7), param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5_ref;
            stackOut_7_1 = new StringBuilder().append("jg.B(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final static w b(boolean param0) {
        return gf.field_c.field_Ob;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    jg(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((jg) this).field_d = param0;
              if (((jg) this).field_d != null) {
                break L1;
              } else {
                ((jg) this).field_d = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((jg) this).field_l = stackIn_6_1 != 0;
            if (((jg) this).field_d.length() != 0) {
              break L0;
            } else {
              ((jg) this).field_l = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("jg.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final String a(byte param0) {
        Object var3 = null;
        if (param0 != 56) {
          var3 = null;
          ui discarded$2 = jg.a(true, (pl) null, -94, -75, (ji) null);
          return ((jg) this).field_d;
        } else {
          return ((jg) this).field_d;
        }
    }

    jg(String param0) {
        this(param0, false);
    }

    final static void a(int param0) {
        pl.a(3970);
        if (param0 >= -38) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = true;
        field_g = 0;
        field_k = new String[]{"This shape is called a Deko:", "This shape is called a Bloko:", "You can activate special items by popping shapes next to them.", "Using 'Z' and 'X' for rotation will give you more control.", "If you pop 2 or more shapes in one go, you will be awarded a special item!", "If you pop 4 or more shapes in one go, you will be awarded 2 special items!", "If you pop 7 or more shapes in one go, you will be awarded 4 special items!", "In multiplayer, any special items you earn will be given to both you and your victim.", "Dropping shapes quickly using the 'DOWN' arrow will give you 'fast drop' bonus points.", "Try popping several shapes simultaneously for bonus points!", "Try popping several shapes in a row for bonus points! This is called a chain.", "A chain of 2 will give you 1000 points, but a chain of 4 will give you 6000 points!"};
        field_c = "Players: ";
        field_h = new int[8192];
        field_e = false;
    }
}
