/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    boolean field_j;
    static String field_l;
    private Object[] field_m;
    static String field_h;
    static String field_i;
    private Object[][] field_n;
    private lc field_e;
    static wh field_g;
    static int[][] field_c;
    private ci field_f;
    static String field_a;
    static int field_b;
    static bc field_d;
    int field_k;

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 124)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_b.a(24396, pc.a(false, var7));
          var5 = -116 / ((58 - param0) / 34);
          if (var4_int < 0) {
            return false;
          }
          var8 = (CharSequence) ((Object) param1);
          var6 = this.field_f.field_i[var4_int].a(24396, pc.a(false, var8));
          if (var6 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bc.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -63, param0)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param2 = param2.toLowerCase();
          var5 = (CharSequence) ((Object) param2);
          var4_int = this.field_f.field_i[param0].a(24396, pc.a(false, var5));
          if (param1 != 106) {
            ((boolean[]) (this.field_m[2]))[1] = true;
          }
          if (this.b((byte) 52, param0, var4_int)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized boolean b(byte param0) {
        int var2 = -20 % ((60 - param0) / 47);
        if (this.field_f == null) {
          this.field_f = this.field_e.a(6);
          if (this.field_f == null) {
            return false;
          }
          this.field_m = new Object[this.field_f.field_a];
          this.field_n = new Object[this.field_f.field_a][];
        }
        return true;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 22) {
            stackIn_2_0 = -90;
            return stackIn_2_0;
          }
          if (!this.b((byte) 127)) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_b.a(24396, pc.a(false, var4));
          stackIn_7_0 = this.c((byte) 36, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bc.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 > -72) {
          this.field_m[4] = this.field_m[0];
        }
        if (!this.b((byte) -16)) {
          return -1;
        }
        return this.field_f.field_m.length;
    }

    final synchronized int c(byte param0, int param1) {
        if (!this.b((byte) -63, param1)) {
          return 0;
        }
        if (this.field_m[param1] != null) {
          return 100;
        }
        if (param0 != 36) {
          this.field_m = (Object[]) (this.field_m[11]);
        }
        return this.field_e.a(param1, (byte) 77);
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        String var6;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -1) {
          var6 = (String) null;
          this.a((String) null, (byte) -122);
        }
        if (!this.b((byte) -43)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_f.field_q.length; var3++) {
          var4 = this.field_f.field_q[var3];
          if (null == this.field_m[var4]) {
            this.a((byte) -113, var4);
            if (null == this.field_m[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -43)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_f.field_b.a(24396, pc.a(false, var4));
          if (param0 <= 121) {
            field_h = (String) null;
          }
          if (this.b((byte) -63, var3_int)) {
            stackIn_9_0 = var3_int;
            return stackIn_9_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -80)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 != 5) {
            stackIn_6_0 = ((boolean[]) (this.field_m[20]))[23];
            return stackIn_6_0;
          }
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_f.field_b.a(param1 + 24391, pc.a(false, var6));
          if (!this.b((byte) -63, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.field_f.field_i[var4_int].a(param1 ^ 24393, pc.a(false, var7));
          stackIn_11_0 = this.a((byte) 125, var5, var4_int);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("bc.P(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final synchronized boolean b(byte param0, int param1, int param2) {
        if (!this.b((byte) 125)) {
          return false;
        }
        if (param1 < 0 ||
          param2 < 0 ||
          this.field_f.field_m.length <= param1 ||
          this.field_f.field_m[param1] <= param2) {
          if (!sd.field_v) {
            return false;
          }
          throw new IllegalArgumentException(param1 + " " + param2);
        }
        if (param0 <= 40) {
          field_g = (wh) (this.field_m[17]);
          return true;
        }
        return true;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 127)) {
            return false;
          }
          var4 = 2 % ((param1 + 1) / 49);
          param0 = param0.toLowerCase();
          var5 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_b.a(24396, pc.a(false, var5));
          stackIn_4_0 = this.b(87, var3_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bc.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -466) {
          return;
        }
        field_g = null;
        field_c = (int[][]) null;
        field_a = null;
        field_h = null;
        field_i = null;
        field_l = null;
        field_d = null;
    }

    private final synchronized void a(byte param0, int param1) {
        if (!this.field_j) {
          this.field_m[param1] = wq.a(false, (byte) -126, this.field_e.a((byte) -120, param1));
        } else {
          this.field_m[param1] = this.field_e.a((byte) -112, param1);
        }
        if (param0 >= -42) {
          this.c((byte) 112, -73);
        }
    }

    final static void a(int param0, byte param1, long param2) {
        sl var4 = js.field_f;
        var4.h(param0, param1 + 253);
        if (param1 != 2) {
          return;
        }
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        var4.c(7, (byte) -82);
        var4.b(-16426, param2);
        var4.b(-var5 + var4.field_j, (byte) 127);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        Object stackIn_27_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int[] var7 = null;
        byte[] var8 = null;
        try {
          if (!this.b((byte) 106, param2, param1)) {
            return null;
          }
          if (param3 <= 81) {
            var7 = (int[]) null;
            discarded$0 = this.a(42, (int[]) null, -94, (byte) -122);
          }
          var5 = null;
          if ((null == this.field_n[param2] ||
            null == this.field_n[param2][param1]) && !this.a(param1, param0, param2, (byte) -113)) {
            this.a((byte) -127, param2);
            if (!this.a(param1, param0, param2, (byte) -114)) {
              return null;
            }
          }
          if (this.field_n[param2] == null) {
            throw new RuntimeException("");
          }
          if (this.field_n[param2][param1] != null) {
            var8 = sq.a(-1, this.field_n[param2][param1], false);
            var5 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.field_k == 1) {
              this.field_n[param2][param1] = null;
              if (this.field_f.field_m[param2] == 1) {
                this.field_n[param2] = null;
              }
            } else {
              if (2 == this.field_k) {
                this.field_n[param2] = null;
              }
            }
          }
          stackIn_27_0 = var5;
          return (byte[]) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("bc.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 2)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_f.field_b.a(24396, pc.a(false, var4));
          if (0 > var3_int) {
            return false;
          }
          if (param1 < -110) {
            return true;
          }
          stackIn_9_0 = ((boolean[]) (this.field_m[2]))[11];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bc.K(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean b(byte param0, int param1) {
        if (!this.b((byte) 115)) {
          return false;
        }
        if (param1 < 0 ||
          this.field_f.field_m.length <= param1 ||
          this.field_f.field_m[param1] == 0) {
          if (sd.field_v) {
            throw new IllegalArgumentException(Integer.toString(param1));
          }
          return false;
        }
        if (param0 != -63) {
          this.a((byte) 34, -45, 63);
          return true;
        }
        return true;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -1) {
          field_i = (String) (this.field_m[11]);
        }
        return this.a((int[]) null, param2, param0, 113);
    }

    final int a(int param0, int param1) {
        if (!this.b((byte) -63, param0)) {
          return 0;
        }
        if (param1 != -26268) {
          return ((int[]) (this.field_m[0]))[4];
        }
        return this.field_f.field_m[param0];
    }

    final synchronized byte[] a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        cm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        cm stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a((byte) 105, 121);
          }
          if (!this.b((byte) -117)) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          stackIn_7_0 = this.field_f.field_b;
          stackIn_7_1 = 24396;
          stackIn_8_2 = !(param0);
          var6 = (CharSequence) ((Object) param2);
          var4_int = ((cm) (Object) stackIn_7_0).a(stackIn_7_1, pc.a(stackIn_8_2, var6));
          if (!this.b((byte) -63, var4_int)) {
            return null;
          }
          stackIn_13_0 = this.field_f.field_i[var4_int];
          stackIn_13_1 = 24396;
          stackIn_14_2 = !(param0);
          var7 = (CharSequence) ((Object) param1);
          var5 = ((cm) (Object) stackIn_13_0).a(stackIn_13_1, pc.a(stackIn_14_2, var7));
          stackIn_15_0 = this.a(var4_int, -1, var5);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (param0 != 125) {
          field_c = (int[][]) null;
        }
        if (!this.b((byte) 104, param2, param1)) {
          return false;
        }
        if (this.field_n[param2] != null &&
          null != this.field_n[param2][param1]) {
          return true;
        }
        if (this.field_m[param2] != null) {
          return true;
        }
        this.a((byte) -66, param2);
        if (this.field_m[param2] == null) {
          return false;
        }
        return true;
    }

    final synchronized int d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.b((byte) 111)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_m.length; var4++) {
          if (0 < this.field_f.field_n[var4]) {
            var3 = var3 + this.c((byte) 36, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * param0 / var2;
        return var4Lifetime1;
    }

    final synchronized byte[] a(boolean param0, int param1) {
        if (!this.b((byte) -106)) {
          return null;
        }
        if (1 == this.field_f.field_m.length) {
          return this.a(0, -1, param1);
        }
        if (!this.b((byte) -63, param1)) {
          return null;
        }
        if (param0) {
          String var4 = (String) null;
          this.a((String) null, (byte) -7);
        }
        if (this.field_f.field_m[param1] == 1) {
          return this.a(param1, -1, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
        Object[] array$0 = null;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        ob var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        ob var26 = null;
        byte[] var27 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        int[] var32 = null;
        byte[] var33 = null;
        byte[] var34 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        ob var13Lifetime1;
        int var12Lifetime1;
        int var15_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var14_intLifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var19Lifetime2;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!this.b((byte) -63, param2)) {
            return false;
          }
          if (this.field_m[param2] == null) {
            return false;
          }
          var5_int = this.field_f.field_n[param2];
          var32 = this.field_f.field_k[param2];
          var24 = var32;
          var6 = var24;
          if (null == this.field_n[param2]) {
            array$0 = new Object[this.field_f.field_m[param2]];
            this.field_n[param2] = array$0;
          }
          var7 = this.field_n[param2];
          var8 = 1;
          var9_int = 0;
          if (param3 > -4) {
            return false;
          }
          while (var9_int < var5_int) {
            if (null != var6) {
              var10 = var32[var9_int];
            } else {
              var10 = var9_int;
            }
            if (var7[var10] != null) {
              var9_int++;
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != param1 && (0 != param1[0] ||
            param1[1] != 0 ||
            param1[2] != 0 ||
            param1[3] != 0)) {
            var33 = sq.a(-1, this.field_m[param2], true);
            var25 = var33;
            var9 = var25;
            var26 = new ob(var33);
            var26.a(5, param1, (byte) -82, var26.field_h.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = sq.a(-1, this.field_m[param2], false);
          }
          try {
            var34 = pa.a(var9, 200);
            var27 = var34;
            var23 = var27;
            var41 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param1 != null);
            throw r.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(me.a(63, var9, var9.length)).append(" ").append(me.a(59, var9, var9.length - 2)).append(" ").append(this.field_f.field_f[param2]).append(" ").append(this.field_f.field_c).toString());
          }
          if (this.field_j) {
            this.field_m[param2] = null;
          }
          if (var5_int > 1) {
            if (this.field_k == 2) {
              var11 = var34.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - 4 * (var5_int * var12);
              var13 = new ob(var41);
              var14_int = 0;
              var13.field_j = var11;
              var15_int = 0;
              for (var16 = 0; var16 < var12; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var13.a(16711680);
                  if (var6 != null) {
                    var19 = var32[var18];
                  } else {
                    var19 = var18;
                  }
                  if (var19 == param0) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var42 = new byte[var14_int];
              var14_intLifetime1 = 0;
              var13.field_j = var11;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var13.a(16711680);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var32[var20];
                  }
                  if (param0 == var21) {
                    ps.a(var41, var17Lifetime4, var42, var14_intLifetime1, var19Lifetime2);
                    var14_intLifetime1 = var14_intLifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15_int] = var42;
              return true;
            }
            var11 = var34.length;
            var11--;
            var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - 4 * (var12Lifetime1 * var5_int);
            var13Lifetime1 = new ob(var41);
            var13Lifetime1.field_j = var11;
            var37 = new int[var5_int];
            var30 = var37;
            var14 = var30;
            for (var15_intLifetime1 = 0; var12Lifetime1 > var15_intLifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var13Lifetime1.a(16711680);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var38 = new byte[var5_int][];
            var31 = var38;
            var15 = var31;
            for (var16Lifetime2 = 0; var16Lifetime2 < var5_int; var16Lifetime2++) {
              array$1 = new byte[var37[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var37[var16Lifetime2] = 0;
            }
            var13Lifetime1.field_j = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var12Lifetime1 > var17Lifetime2; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var13Lifetime1.a(16711680);
                ps.a(var41, var16Lifetime3, var38[var19Lifetime1], var37[var19Lifetime1], var18Lifetime1);
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 == null) {
                var18Lifetime2 = var17Lifetime3;
              } else {
                var18Lifetime2 = var32[var17Lifetime3];
              }
              if (this.field_k != 0) {
                var7[var18Lifetime2] = var38[var17Lifetime3];
              } else {
                var7[var18Lifetime2] = wq.a(false, (byte) -127, var38[var17Lifetime3]);
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var32[0];
            }
            if (0 != this.field_k) {
              var7[var11] = var41;
            } else {
              var7[var11] = wq.a(false, (byte) -126, var34);
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("bc.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!qe.a(116)) {
            if (null != bj.field_K &&
              bj.field_K.field_c) {
              ej.c(0);
              rp.field_I.a(true, new bo(rp.field_I, bg.field_f));
            }
            return;
          }
          if (param0 > -11) {
            field_h = (String) null;
          }
          rp.field_I.a(eg.field_o, true, re.field_b, (byte) 0);
          rp.field_I.i(125);
          while (cc.$cfr$intArgs$e$296a4c2b494e(55)) {
            rp.field_I.a(oq.field_j, ho.field_h, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "bc.V(" + param0 + ')');
        }
    }

    final synchronized boolean b(int param0, int param1) {
        if (!this.b((byte) -63, param1)) {
          return false;
        }
        if (null != this.field_m[param1]) {
          return true;
        }
        this.a((byte) -73, param1);
        if (this.field_m[param1] != null) {
          return true;
        }
        if (param0 < 83) {
          this.d(-19);
          return false;
        }
        return false;
    }

    bc(lc param0, boolean param1, int param2) {
        this.field_f = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_k = param2;
          this.field_j = param1 ? true : false;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "Password is valid";
        field_a = "1 point, 1 point per turn.";
        field_c = new int[4][];
        field_i = "Accept invitation to <%0>'s game";
        field_h = "Scamming";
    }
}
