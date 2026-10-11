/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static String field_i;
    private boolean field_d;
    static String field_a;
    private qa field_f;
    private Object[] field_j;
    private Object[][] field_c;
    private int field_g;
    static boolean field_e;
    private tm field_h;
    static String field_b;
    static int field_k;

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(-14354)) {
            return false;
          }
          if (param0) {
            return true;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_h.field_a.a(to.a(123, var4), -117);
          stackIn_8_0 = this.a(param0, var3_int);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("nh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final synchronized void d(int param0, int param1) {
        if (!this.field_d) {
          this.field_j[param0] = kj.a(false, false, this.field_f.a(param0, -7249));
        } else {
          this.field_j[param0] = this.field_f.a(param0, -7249);
        }
        if (param1 != -23889) {
          this.a(false, -26);
        }
    }

    final synchronized boolean a(int param0) {
        if (this.field_h == null) {
          this.field_h = this.field_f.a(param0 + 40892);
          if (this.field_h == null) {
            return false;
          }
          this.field_j = new Object[this.field_h.field_l];
          this.field_c = new Object[this.field_h.field_l][];
        }
        if (param0 != -14354) {
          this.a(((int[]) (this.field_j[21]))[0], 48, -75);
          return true;
        }
        return true;
    }

    final static void c(boolean param0) {
        if (!param0) {
          field_a = (String) null;
        }
        cd.field_f = new rg();
        ta.field_a.b(1, cd.field_f);
    }

    final static void a(byte param0, nh param1, mb param2, int param3) {
        hh.field_b = eg.c(1) * param3 / 1000;
        ac.a((byte) -125, param1);
        kd.a(31913, param1);
        ob.a((byte) -53, param1);
        ck.e((byte) 65);
        hn.d((byte) -117);
        if (param0 >= -67) {
          return;
        }
        try {
          nl.field_d = -hh.field_b + 0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "nh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (!this.e(-1, param0)) {
          return 0;
        }
        if (param1 != 0) {
          ((byte[]) (((Object[]) (this.field_j[3]))[14]))[11] = (byte) 119;
        }
        return this.field_h.field_i[param0];
    }

    public static void a(boolean param0) {
        field_i = null;
        field_a = null;
        if (param0) {
          return;
        }
        field_b = null;
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(-14354)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_a.a(to.a(param1 ^ 122, var4), -125);
          if (param1 <= var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("nh.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(String param0, int param1) {
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
          if (!this.a(param1 ^ 14353)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          if (param1 != -1) {
            stackIn_5_0 = ((int[]) (this.field_j[1]))[0];
            return stackIn_5_0;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_a.a(to.a(115, var4), -119);
          stackIn_7_0 = this.c(param1 ^ 123, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("nh.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, byte param2, int param3) {
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        byte[] var8 = null;
        try {
          var5_int = -116 / ((-47 - param2) / 63);
          if (!this.a(param3, param1, (byte) -119)) {
            return null;
          }
          var6 = null;
          if ((this.field_c[param1] == null ||
            this.field_c[param1][param3] == null) && !this.a(param0, param3, param1, -12028)) {
            this.d(param1, -23889);
            if (!this.a(param0, param3, param1, -12028)) {
              return null;
            }
          }
          if (this.field_c[param1] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_c[param1][param3]) {
            var8 = dn.a(this.field_c[param1][param3], false, (byte) 48);
            var6 = var8;
            if (var8 == null) {
              throw new RuntimeException("");
            }
          }
          if (var6 != null) {
            if (this.field_g == 1) {
              this.field_c[param1][param3] = null;
              if (this.field_h.field_i[param1] == 1) {
                this.field_c[param1] = null;
              }
            } else {
              if (2 == this.field_g) {
                this.field_c[param1] = null;
              }
            }
          }
          stackIn_28_0 = var6;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("nh.AA(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param2 - 14272)) {
            return false;
          }
          param1 = param1.toLowerCase();
          if (param2 != -82) {
            var6 = (String) null;
            this.b((String) null, (String) null, (byte) 88);
          }
          param0 = param0.toLowerCase();
          var7 = (CharSequence) ((Object) param1);
          var4_int = this.field_h.field_a.a(to.a(121, var7), -120);
          if (var4_int < 0) {
            return false;
          }
          var8 = (CharSequence) ((Object) param0);
          var5 = this.field_h.field_n[var4_int].a(to.a(121, var8), -126);
          if (0 <= var5) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("nh.BA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 != 2) {
          field_b = (String) (this.field_j[5]);
        }
        if (!this.a(param0, param2, (byte) -122)) {
          return false;
        }
        if (null != this.field_c[param2] &&
          this.field_c[param2][param0] != null) {
          return true;
        }
        if (null != this.field_j[param2]) {
          return true;
        }
        this.d(param2, -23889);
        if (null != this.field_j[param2]) {
          return true;
        }
        return false;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.e(-1, param1)) {
          return false;
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        this.d(param1, -23889);
        if (param0) {
          return false;
        }
        if (null != this.field_j[param1]) {
          return true;
        }
        return false;
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param0 ^ 3479)) {
            return false;
          }
          if (param0 != -13703) {
            var6 = (String) null;
            this.a(110, (String) null, 85);
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param2);
          var4_int = this.field_h.field_a.a(to.a(115, var7), -121);
          if (!this.e(param0 + 13702, var4_int)) {
            return false;
          }
          var8 = (CharSequence) ((Object) param1);
          var5 = this.field_h.field_n[var4_int].a(to.a(117, var8), -117);
          stackIn_9_0 = this.a(var5, 2, var4_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("nh.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized byte[] a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(-14354)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param0 = param0.toLowerCase();
          if (param2 >= -106) {
            this.field_j = (Object[]) null;
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_h.field_a.a(to.a(116, var6), -121);
          if (!this.e(-1, var4_int)) {
            stackIn_7_0 = null;
            return (byte[]) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_h.field_n[var4_int].a(to.a(118, var7), -124);
          stackIn_9_0 = this.b(5, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("nh.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = DungeonAssault.field_K;
        if (!this.a(param0 ^ -14454)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; var4 < this.field_j.length; var4++) {
          if (this.field_h.field_k[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.c(-126, var4);
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = param0 * var3 / var2;
        return var4Lifetime1;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(-14354)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_h.field_a.a(to.a(118, var4), param1 - 1119);
          if (!this.e(param1 ^ -1001, var3_int)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param1 != 1000) {
            nh.c(true);
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("nh.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int c(int param0, int param1) {
        int var3 = -122 % ((param0 + 67) / 52);
        if (!this.e(-1, param1)) {
          return 0;
        }
        if (this.field_j[param1] != null) {
          return 100;
        }
        return this.field_f.b(param1, 27318);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        boolean stackIn_38_2 = false;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        ec var26 = null;
        byte[] var27 = null;
        ec var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        ec var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = DungeonAssault.field_K;
        try {
          if (!this.e(-1, param2)) {
            return false;
          }
          if (this.field_j[param2] == null) {
            return false;
          }
          var5_int = this.field_h.field_k[param2];
          var34 = this.field_h.field_m[param2];
          var24 = var34;
          var6 = var24;
          if (null == this.field_c[param2]) {
            array$0 = new Object[this.field_h.field_i[param2]];
            this.field_c[param2] = array$0;
          }
          var7 = this.field_c[param2];
          var8 = 1;
          if (param3 != -12028) {
            stackIn_11_0 = ((boolean[]) (((Object[]) (((Object[]) (this.field_j[0]))[0]))[7]))[13];
            return stackIn_11_0;
          }
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 == null) {
              var10 = var9_int;
            } else {
              var10 = var34[var9_int];
            }
            if (var7[var10] != null) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null && (0 != param0[0] ||
            param0[1] != 0 ||
            0 != param0[2] ||
            param0[3] != 0)) {
            var35 = dn.a(this.field_j[param2], true, (byte) 48);
            var25 = var35;
            var9 = var25;
            var26 = new ec(var35);
            var26.a(var26.field_m.length, param0, 5, -10708);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = dn.a(this.field_j[param2], false, (byte) 48);
          }
          try {
            var36 = lc.a(var9, 50166);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_37_0 = var11_ref_RuntimeException;
            stackIn_37_1 = new StringBuilder();
            stackIn_38_2 = (param0 != null);
            throw vk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(qh.a(16777215, var9, var9.length)).append(" ").append(qh.a(16777215, var9, -2 + var9.length)).append(" ").append(this.field_h.field_q[param2]).append(" ").append(this.field_h.field_f).toString());
          }
          if (this.field_d) {
            this.field_j[param2] = null;
          }
          if (var5_int > 1) {
            if (this.field_g == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - 4 * (var12 * var5_int);
              var32 = new ec(var43);
              var14 = 0;
              var32.field_o = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var32.h(param3 ^ 11905);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (var19 == param1) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var32.field_o = var11;
              var14Lifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var32.h(-35);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (param1 == var21) {
                    cj.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var5_int * var12 * 4;
              var29 = new ec(var43);
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              var29.field_o = var11;
              for (var15 = 0; var12 > var15; var15++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var29.h(-121);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.field_o = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var5_int > var19; var19++) {
                  var18 = var18 + var29.h(-117);
                  cj.a(var43, var16, var39[var19], var38[var19], var18);
                  var16 = var16 + var18;
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.field_g != 0) {
                  var7[var18] = var39[var17];
                } else {
                  var7[var18] = kj.a(false, false, var39[var17]);
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (0 == this.field_g) {
              var7[var11] = kj.a(false, false, var36);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_107_0 = var5;
          stackIn_107_1 = new StringBuilder().append("nh.F(");
          if (param0 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param0 != 5) {
          field_b = (String) null;
        }
        return this.a((int[]) null, param1, (byte) 76, param2);
    }

    final int b(boolean param0) {
        if (!param0) {
          this.a(((int[]) (this.field_j[3]))[0], 56);
        }
        if (!this.a(-14354)) {
          return -1;
        }
        return this.field_h.field_i.length;
    }

    private final synchronized boolean e(int param0, int param1) {
        if (!this.a(-14354)) {
          return false;
        }
        if (~param1 <= param0 &&
          param1 < this.field_h.field_i.length &&
          this.field_h.field_i[param1] != 0) {
          return true;
        }
        if (!ro.field_u) {
          return false;
        }
        throw new IllegalArgumentException(Integer.toString(param1));
    }

    final synchronized boolean a(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        if (!this.a(-14354)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; this.field_h.field_j.length > var3; var3++) {
          var4 = this.field_h.field_j[var3];
          if (null == this.field_j[var4]) {
            this.d(var4, param0 ^ -23916);
            if (this.field_j[var4] == null) {
              var2 = 0;
            }
          }
        }
        if (param0 != 59) {
          this.a(((int[]) (this.field_j[5]))[0], -79);
        }
        return var2 != 0;
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!this.a(param0 ^ 8699)) {
          return null;
        }
        if (1 == this.field_h.field_i.length) {
          return this.b(param0 + 6640, 0, param1);
        }
        if (!this.e(-1, param1)) {
          return null;
        }
        if (this.field_h.field_i[param1] == 1) {
          return this.b(5, param1, 0);
        }
        if (param0 != -6635) {
          this.field_j[3] = this.field_j[3];
        }
        throw new RuntimeException();
    }

    nh(qa param0, boolean param1, int param2) {
        this.field_h = null;
        try {
          if (param2 < 0 ||
            2 < param2) {
            throw new IllegalArgumentException("");
          }
          this.field_f = param0;
          this.field_d = param1 ? true : false;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(-14354)) {
          return false;
        }
        if (param1 < 0 ||
          param0 < 0 ||
          this.field_h.field_i.length <= param1 ||
          this.field_h.field_i[param1] <= param0) {
          if (!ro.field_u) {
            return false;
          }
          throw new IllegalArgumentException(param1 + " " + param0);
        }
        if (param2 >= -100) {
          this.a((String) (this.field_j[1]), -34);
          return true;
        }
        return true;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            stackIn_2_0 = 42;
            return stackIn_2_0;
          }
          if (!this.e(-1, param2)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          param1 = param1.toLowerCase();
          var5 = (CharSequence) ((Object) param1);
          var4_int = this.field_h.field_n[param2].a(to.a(121, var5), -125);
          if (this.a(var4_int, param2, (byte) -109)) {
            stackIn_10_0 = var4_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("nh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_i = "<%0> active";
        field_a = "There is nothing in this room to trouble a party of raiders.";
        field_b = "Raider was detected by guardian, which alerted the monsters of the dungeon.";
    }
}
