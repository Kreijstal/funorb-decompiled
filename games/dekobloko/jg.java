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
        int var1 = 26 / ((-24 - param0) / 49);
        field_b = (byte[][][]) null;
        field_c = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            vf.field_a = true;
            if (param1 != 0) {
                field_f = (int[]) null;
            }
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            pf.a(param0, var2, var4, (byte) 89, var3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "jg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            jg.a(-65);
            return this.field_l;
        }
        return this.field_l;
    }

    final static void a(boolean param0, String param1) {
        hl.field_a = param1;
        if (!param0) {
            return;
        }
        try {
            hm.a(12, (byte) -111);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "jg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ui a(boolean param0, pl param1, int param2, int param3, ji param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        byte[] var7 = null;
        ui stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = param4.a(param2, 108, param3);
              var5 = var7;
              if (param0) {
                break L1;
              } else {
                var6 = (String) null;
                jg.a(false, (String) null);
                break L1;
              }
            }
            if (var7 != null) {
              stackIn_6_0 = new ui(new wl(var7), param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5_ref);

            stackIn_9_1 = new StringBuilder().append("jg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static w b(boolean param0) {
        ji var2;
        if (param0) {
          var2 = (ji) null;
          jg.a(true, (pl) null, 58, 53, (ji) null);
          return gf.field_c.field_Ob;
        } else {
          return gf.field_c.field_Ob;
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    jg(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_d = param0;
              if (this.field_d != null) {
                break L1;
              } else {
                this.field_d = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((jg) (this)).field_l = stackIn_6_1 != 0;
            if (this.field_d.length() != 0) {
              break L0;
            } else {
              this.field_l = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("jg.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final String a(byte param0) {
        ji var3;
        if (param0 != 56) {
          var3 = (ji) null;
          jg.a(true, (pl) null, -94, -75, (ji) null);
          return this.field_d;
        } else {
          return this.field_d;
        }
    }

    jg(String param0) {
        this(param0, false);
    }

    final static void a(int param0) {
        pl.a(3970);
        if (param0 >= -38) {
            field_h = (int[]) null;
        }
    }

    static {
        field_i = true;
        field_g = 0;
        field_k = new String[]{"This shape is called a Deko:", "This shape is called a Bloko:", "You can activate special items by popping shapes next to them.", "Using 'Z' and 'X' for rotation will give you more control.", "If you pop 2 or more shapes in one go, you will be awarded a special item!", "If you pop 4 or more shapes in one go, you will be awarded 2 special items!", "If you pop 7 or more shapes in one go, you will be awarded 4 special items!", "In multiplayer, any special items you earn will be given to both you and your victim.", "Dropping shapes quickly using the 'DOWN' arrow will give you 'fast drop' bonus points.", "Try popping several shapes simultaneously for bonus points!", "Try popping several shapes in a row for bonus points! This is called a chain.", "A chain of 2 will give you 1000 points, but a chain of 4 will give you 6000 points!"};
        field_c = "Players: ";
        field_h = new int[8192];
        field_e = false;
    }
}
