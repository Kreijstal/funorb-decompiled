/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends gb {
    static int field_A;
    static boolean field_v;
    static int[] field_x;
    String field_y;
    boolean field_w;
    char[] field_u;
    static String field_C;
    int[] field_z;
    int[] field_t;
    char[] field_D;

    public static void f(int param0) {
        if (param0 != 0) {
          return;
        }
        field_C = null;
        field_x = null;
    }

    final static int c(byte param0) {
        if (param0 > -83) {
          return -42;
        }
        return wh.field_k;
    }

    private final void a(bh param0, int param1, int param2) {
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char stackIn_17_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          if (param2 != 0) {
            this.g(-10);
          }
          if (param1 == 1) {
            this.field_y = param0.g((byte) 81);
          } else {
            if (param1 == 2) {
              var4_int = param0.d((byte) -99);
              this.field_D = new char[var4_int];
              this.field_z = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_z[var5] = param0.e(param2 + 127);
                var6 = param0.g(-1772093437);
                stackIn_9_0 = this.field_D;
                stackIn_9_1 = var5;
                if (var6 != 0) {
                  stackIn_10_2 = mk.a((byte) -13, (byte) var6);
                } else {
                  stackIn_10_2 = 0;
                }
                stackIn_9_0[stackIn_9_1] = (char) stackIn_10_2;
              }
            } else {
              if (param1 != 3) {
                if (param1 != 4) {
                  return;
                }
                this.field_w = true;
                return;
              }
              var4_int = param0.d((byte) -99);
              this.field_t = new int[var4_int];
              this.field_u = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_t[var5] = param0.e(127);
                var6 = param0.g(-1772093437);
                stackIn_16_0 = this.field_u;
                stackIn_16_1 = var5;
                if (0 == var6) {
                  stackIn_17_2 = (char)0;
                } else {
                  stackIn_17_2 = mk.a((byte) -13, (byte) var6);
                }
                stackIn_16_0[stackIn_16_1] = stackIn_17_2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("qa.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = um.a(param2, '_', false, "");
          if (param0 != 16732) {
            field_C = (String) null;
          }
          var3 = dj.a(108, param2);
          stackIn_7_0 = (-1 != param1.indexOf(param2)) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("qa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static oh[] a(String param0, int param1, ah param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oh[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param1, param0);
          var5 = param2.a(var4_int, false, param3);
          stackIn_1_0 = h.a(var4_int, var5, false, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("qa.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (hd.field_u == null) {
          return;
        }
        oa.a((byte) -119, hd.field_u);
        hd.field_u.a((byte) 52, nd.field_Pb);
        hd.field_u = null;
        if (hn.field_M != null) {
          hn.field_M.a((byte) 36);
        }
        uh.field_b.requestFocus();
        if (param0 < 21) {
          field_A = -4;
        }
    }

    final void g(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = TetraLink.field_J;
        int var2Lifetime1;
        if (this.field_t != null) {
          for (var2 = 0; this.field_t.length > var2; var2++) {
            this.field_t[var2] = mc.a(this.field_t[var2], 32768);
          }
        }
        if (param0 != 32768) {
          qa.b((byte) 15);
        }
        if (null != this.field_z) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (var4 < this.field_z.length) {
            this.field_z[var4] = mc.a(this.field_z[var4], 32768);
            var4++;
          }
        }
    }

    final void a(bh param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          while (true) {
            var3_int = param0.d((byte) -99);
            if (var3_int != 0) {
              this.a(param0, var3_int, param1 ^ 0);
              continue;
            }
            break;
          }
          if (param1 != 0) {
            this.g(109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qa.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    qa() {
        this.field_w = false;
    }

    static {
        field_C = "Waiting for graphics";
    }
}
