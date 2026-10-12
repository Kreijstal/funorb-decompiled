/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static wc field_e;
    private ResourceArchive field_l;
    private ResourceArchive field_c;
    private NodeHashTable field_i;
    static int field_g;
    static String field_h;
    static boolean field_j;
    static IndexedSprite[] field_a;
    static byte[] field_f;
    static String field_k;
    static String field_b;
    private NodeHashTable field_d;

    final sk a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sk stackIn_3_0 = null;
        sk stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.getGroupCapacity((byte) -61) == 1) {
            stackIn_3_0 = this.a(param1, false, 0, param0);
            return stackIn_3_0;
          }
          if (this.field_c.getFileCapacity(true, param1) == 1) {
            stackIn_7_0 = this.a(0, false, param1, param0);
            return stackIn_7_0;
          }
          if (param2 != -6923) {
            ub.a(false, 68);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ub.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        DualNode var1 = null;
        int var2 = SteelSentinels.obfuscationControl;
        DualNode var1Lifetime1;
        try {
          nn.field_f = null;
          vd.field_h = 0;
          cc.field_gc = 0;
          Sprite.field_c.clear(6);
          am.field_c.clear(6);
          var1 = pi.field_a.a(114);
          while (var1 != null) {
            var1.unlinkDual(480);
            var1 = pi.field_a.a((byte) -55);
          }
          var1Lifetime1 = db.field_h.a(97);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkDual(480);
            var1Lifetime1 = db.field_h.a((byte) -117);
          }
          if (!param0) {
            ub.c(-100);
          }
          qc.field_P = 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ub.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_k = null;
        if (param0 >= 68) {
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        }
        field_b = (String) null;
        field_h = null;
        field_f = null;
        field_e = null;
    }

    final static String a(byte param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_2_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          var11 = new char[param3];
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (param0 != 37) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = 0;
          for (var6 = 0; param3 > var6; var6++) {
            var7 = param2[var6 + param1] & 255;
            if (var7 != 0) {
              if (128 <= var7 &&
                160 > var7) {
                var8 = gl.field_w[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var9[incrementValue$1] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var11, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("ub.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final sk a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        sk stackIn_4_0 = null;
        sk stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -35) {
            ub.a(-82);
          }
          if (this.field_l.getGroupCapacity((byte) 121) == 1) {
            stackIn_4_0 = this.a(0, 0, param2, param1);
            return stackIn_4_0;
          }
          if (1 != this.field_l.getFileCapacity(true, param2)) {
            throw new RuntimeException();
          }
          stackIn_7_0 = this.a(param2, 0, 0, param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ub.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (wb.field_c == null) {
          return;
        }
        pa.a(wb.field_c, 9174);
        if (param0 == 0) {
          wb.field_c.a(hb.field_i, param0 ^ -101);
          wb.field_c = null;
          if (null != ve.field_a) {
            ve.field_a.a(15481);
          }
          sl.field_n.requestFocus();
          return;
        }
        field_k = (String) null;
        wb.field_c.a(hb.field_i, param0 ^ -101);
        wb.field_c = null;
        if (null != ve.field_a) {
          ve.field_a.a(15481);
        }
        sl.field_n.requestFocus();
    }

    private final sk a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sk var8 = null;
        uk var9 = null;
        sk stackIn_5_0 = null;
        sk stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk var8Lifetime1;
        try {
          var5_int = param2 ^ (65520 & param0 << 4 | param0 >>> 12);
          var5_int = var5_int | param0 << 16;
          if (param1 != 0) {
            this.field_d = (NodeHashTable) null;
          }
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (sk) (this.field_d.get(var6, 127));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            return null;
          }
          var9 = (uk) (this.field_i.get(var6, 124));
          if (var9 == null) {
            var9 = uk.a(this.field_l, param0, param2);
            if (var9 == null) {
              return null;
            }
            this.field_i.put(var6, var9, -1816);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink(4);
          this.field_d.put(var6, var8Lifetime1, -1816);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ub.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final sk a(String param0, int param1, String param2, int[] param3) {
        sk discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        sk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_c.getGroupId(param0, 103);
          if (var5_int < 0) {
            return null;
          }
          if (param1 > -67) {
            var7 = (int[]) null;
            discarded$1 = this.a((String) null, 67, (String) null, (int[]) null);
          }
          var6 = this.field_c.getFileId(var5_int, -32759, param2);
          if (var6 < 0) {
            return null;
          }
          stackIn_9_0 = this.a(var6, false, var5_int, param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ub.M(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final sk a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        sk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -34 / ((param2 - 33) / 60);
          stackIn_1_0 = this.a(param1, -78, param0, (int[]) null);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ub.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final sk a(int param0, boolean param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sk var8 = null;
        mh var9 = null;
        sk var10 = null;
        sk stackIn_2_0 = null;
        sk stackIn_5_0 = null;
        sk stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk var8Lifetime1;
        try {
          var5_int = param0 ^ (param2 >>> 12 | param2 << 4 & 65532);
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int;
          if (param1) {
            stackIn_2_0 = (sk) null;
            return stackIn_2_0;
          }
          var8 = (sk) (this.field_d.get(var6, 124));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            return null;
          }
          var9 = mh.a(this.field_c, param2, param0);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_d.put(var6, var8Lifetime1, -1816);
          if (param3 != null) {
            param3[0] = param3[0] - var10.field_r.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = SteelSentinels.obfuscationControl;
        if (param0 > 115) {
          var2 = param1;
          if (var2 == 2) {
            return 96;
          }
          if (var2 == 56) {
            return 97;
          }
          if (58 == var2) {
            return 98;
          }
          if (var2 == 66) {
            return 99;
          }
          if (var2 == 70) {
            return 100;
          }
          if (var2 == 76) {
            return 102;
          }
          if (80 == var2) {
            return 103;
          }
          if (85 == var2) {
            return 104;
          }
          if (89 == var2) {
            return 105;
          }
          if (var2 != 93) {
            return -1;
          }
          return 106;
        }
        field_k = (String) null;
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 2) {
          return 96;
        }
        if (var2Lifetime1 == 56) {
          return 97;
        }
        if (58 == var2Lifetime1) {
          return 98;
        }
        if (var2Lifetime1 == 66) {
          return 99;
        }
        if (var2Lifetime1 == 70) {
          return 100;
        }
        if (var2Lifetime1 == 76) {
          return 102;
        }
        if (80 == var2Lifetime1) {
          return 103;
        }
        if (85 == var2Lifetime1) {
          return 104;
        }
        if (89 == var2Lifetime1) {
          return 105;
        }
        if (var2Lifetime1 == 93) {
          return 106;
        }
        return -1;
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
          return;
        }
        if (g.field_c != null) {
          l.a(g.field_c, (byte) -128);
          ef.a(1, ll.field_q * 2);
        }
        if (param1 != -1) {
          if (qj.field_q[param1] != null) {
            g.field_c = em.a(qj.field_q[param1], 100, ll.field_q);
            ef.a(1, ll.field_q / 2);
            on.a(g.field_c, -48);
          }
          return;
        }
    }

    final static int b(int param0) {
        if (param0 >= -62) {
          field_k = (String) null;
          return km.field_f;
        }
        return km.field_f;
    }

    ub(ResourceArchive param0, ResourceArchive param1) {
        this.field_i = new NodeHashTable(256);
        this.field_d = new NodeHashTable(256);
        try {
          this.field_c = param0;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new wc();
        field_h = "<%0> would need a rating of <%1> to play with the current options.";
        field_j = false;
        field_g = -1;
        field_k = "Campaign: <col=ffffff><%0></col>";
        field_b = "You must be a member to play with the current options.";
    }
}
