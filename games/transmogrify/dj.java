/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
          return;
        }
        field_b = null;
    }

    final static String a(CharSequence param0, byte param1) {
        int var5 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        StringBuilder var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = 55 % ((-79 - param1) / 36);
          var3 = param0.length();
          var4 = new StringBuilder(var3);
          for (var5 = 0; var3 > var5; var5++) {
            var6 = param0.charAt(var5);
            if (var6 >= 97 &&
              var6 <= 122) {
              discarded$0 = var4.append((char) var6);
            } else if (var6 >= 48 &&
              var6 <= 57) {
              discarded$1 = var4.append((char) var6);
            } else if (var6 >= 65 &&
              90 >= var6) {
              discarded$2 = var4.append((char)(32 + var6));
            } else {
              if (var6 == 43) {
                discarded$3 = var4.append('+');
              } else {
                if (var6 != 38) {
                  var7 = var4.length();
                  if (0 < var7 &&
                    var4.charAt(-1 + var7) != 95) {
                    discarded$4 = var4.append('_');
                  }
                } else {
                  discarded$5 = var4.append('+');
                }
              }
            }
          }
          stackIn_25_0 = var4.toString();
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("dj.E(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (wj.field_o <= 0) {
          if (!qj.b((byte) 73)) {
            var2 = 1;
          } else {
            var2 = 0;
          }
        } else {
          if (vg.field_b == null) {
            ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
            if (null != ub.field_c) {
              var2 = 2;
              cj.a(ub.field_c, 13861);
            } else {
              var2 = 3;
            }
          } else {
            ub.field_c = vg.field_b.d((byte) -18);
            kc.a(-14226, 2);
            if (null != ub.field_c) {
              var2 = 2;
              cj.a(ub.field_c, 13861);
            } else {
              var2 = 3;
            }
          }
        }
        if (null == vg.field_b &&
          wc.field_b) {
          tf.a((byte) 46, param1, var2);
        }
        if (param0) {
          return;
        }
        dj.b(1);
    }

    final static byte[] a(int param0, hj param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var4_int = param1.k(param3, 1522829539);
          if (param0 != -39) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          if (var4_int == 0) {
            stackIn_6_0 = null;
            return (byte[]) (stackIn_6_0);
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new byte[var4_int];
          }
          var5 = param1.k(3, 1522829539);
          var6 = (byte)param1.k(8, 1522829539);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (byte)var6;
            }
          }
          stackIn_19_0 = (byte[]) (param2);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("dj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          return false;
        }
        if (param0 < 48) {
          return false;
        }
        if (57 < param0) {
          return false;
        }
        return true;
    }

    abstract void a(byte[] param0, byte param1);

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param2;
            param1--;
            param2 = param2 >>> 1;
          }
          if (!param0) {
            field_b = (StringBuilder) null;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "dj.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_a = (String) null;
          }
          if (ta.field_f != null) {
            ta.field_f.field_D.a(param1, 17036);
          }
          if (null == ca.field_g) {
            return;
          }
          ca.field_g.field_B.a(param1, 17036);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("dj.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        pd.field_b = true;
        if (param0 == -1) {
          qf.field_b = lk.a(param0 + 1) + 15000L;
          return 11 == gl.field_y ? true : false;
        }
        return false;
    }

    static {
        field_a = "Waiting for fonts";
        field_b = new StringBuilder(12);
    }
}
