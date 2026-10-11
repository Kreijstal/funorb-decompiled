/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ma extends oa {
    private vl field_db;
    static vd field_Y;
    static ef field_cb;
    static int field_W;
    private NodeDeque field_ab;
    static ek field_eb;
    static Boolean field_bb;
    static String field_Z;
    private String[] field_X;
    static int field_V;

    ma(String param0, qk param1) {
        super(param0, (tn) null);
        this.field_db = null;
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, byte param1, String param2, String param3) {
        if (param1 > -60) {
          return;
        }
        try {
          vn.field_i = param3;
          cc.field_Xb = param2;
          bf.a((byte) -102, param0, rh.field_p);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ma.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    String e(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (this.field_db == null) {
          return null;
        }
        if (null == this.field_X) {
          return null;
        }
        if (this.field_X.length > this.field_db.field_p) {
          return this.field_X[this.field_db.field_p];
        }
        return null;
    }

    final static String a(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (cb.field_j == nj.field_ab) {
          return bl.field_f;
        }
        return vn.field_i;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 >= -71) {
          return;
        }
        super.a(param0, (byte) -122, param2, param3, param4);
        this.f((byte) -109);
    }

    public static void c(boolean param0) {
        field_eb = null;
        field_cb = null;
        if (!param0) {
          field_Y = null;
          field_Z = null;
          field_bb = null;
          return;
        }
        field_bb = (Boolean) null;
        field_Y = null;
        field_Z = null;
        field_bb = null;
    }

    final void f(byte param0) {
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        int var3;
        eg var4;
        da var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        il var13;
        int var14;
        int var15;
        vl var16;
        int var17;
        int var8Lifetime1;
        var17 = SteelSentinels.obfuscationControl;
        var2 = 48 / ((-24 - param0) / 38);
        this.field_ab = new NodeDeque();
        var3 = 0;
        var4 = (eg) ((Object) this.field_p);
        var5 = var4.b(-1, (lh) (this));
        while (true) {
          var6 = this.field_y.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          }
          var8 = this.field_y.indexOf(">", var6);
          var7 = this.field_y.substring(var6 + 9, var8);
          var8Lifetime1 = Integer.parseInt(var7);
          var3 = this.field_y.indexOf("</hotspot>", var6);
          var9 = var5.b(-1, var6);
          var10 = var5.b(-1, var3);
          var11 = null;
          for (var12 = var9; var10 >= var12; var12++) {
            var13 = var5.field_h[var12];
            if (~var9 == ~var12) {
              stackIn_8_0 = var5.a(1, var6);
            } else {
              stackIn_8_0 = var13.field_f[0];
            }
            var14 = stackIn_8_0;
            if (var12 == var10) {
              stackIn_13_0 = var5.a(1, var3);
            } else {
              if (var13 != null) {
                stackIn_13_0 = var13.field_f[-1 + var13.field_f.length];
              } else {
                stackIn_13_0 = 0;
              }
            }
            var15 = stackIn_13_0;
            var16 = new vl(var8Lifetime1, var14, var13.field_h, var15 - var14, Math.max(var4.a(-40), var13.field_a - var13.field_h));
            if (var11 == null) {
              this.field_ab.addLast(3, var16);
              var11 = var16;
            } else {
              ((vl) (var11)).field_q = var16;
              this.field_ab.addLast(3, var16);
              var11 = var16;
            }
          }
        }
    }

    final void b(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        vl var7 = null;
        vl var7Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        super.b(param0, (byte) -124, param2, param3);
        if (param1 >= -122) {
          String var8 = (String) null;
          ma.a(true, (byte) -7, (String) null, (String) null);
          var5 = -this.field_o + param2;
          var6 = -this.field_z + param3;
          var7 = this.a(-1, var5, var6);
          if (var7 == null) {
            return;
          }
          if (null != this.field_A) {
            ((cg) ((Object) this.field_A)).a(param0, var7.field_p, this, 127);
            return;
          }
          return;
        }
        var5Lifetime1 = -this.field_o + param2;
        var6Lifetime1 = -this.field_z + param3;
        var7Lifetime1 = this.a(-1, var5Lifetime1, var6Lifetime1);
        if (var7Lifetime1 == null) {
          return;
        }
        if (null != this.field_A) {
          ((cg) ((Object) this.field_A)).a(param0, var7Lifetime1.field_p, this, 127);
          return;
        }
    }

    final static void a(int param0, kf param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = mm.field_g;
          var3.a(param0, (byte) -117);
          var3.a((byte) 115, 5);
          var3.a((byte) 110, 0);
          if (param2 != -2864) {
            ma.a(false);
          }
          var3.d(param1.field_C, param2 + 2960);
          var3.a((byte) 125, param1.field_u);
          var3.a((byte) 113, param1.field_w);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ma.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (wc.field_i == null) {
          if (param0 == 0) {
            return;
          }
          ma.a(false);
          return;
        }
        var1 = wc.field_i;
        synchronized (var1) {
          wc.field_i = null;
        }
        if (param0 != 0) {
          ma.a(false);
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_X == null ||
            this.field_X.length <= param1) {
            var7 = new String[1 + param1];
            var8 = var7;
            var4 = var8;
            if (this.field_X != null) {
              for (var5 = 0; this.field_X.length > var5; var5++) {
                var7[var5] = this.field_X[var5];
              }
            }
            this.field_X = var8;
          }
          this.field_X[param1] = param0;
          if (param2 < -42) {
            return;
          }
          field_Y = (vd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("ma.DA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ma.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 == -1) {
          this.a(param0, (byte) -109, param1, param2, ((eg) ((Object) this.field_p)).b((byte) 31, (lh) (this)));
          return;
        }
        field_cb = (ef) null;
        this.a(param0, (byte) -109, param1, param2, ((eg) ((Object) this.field_p)).b((byte) 31, (lh) (this)));
    }

    void a(int param0, int param1, lh param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, 126, param2, param3);
          if (param1 < 56) {
            this.a(-59, (byte) 44, 102, -46);
          }
          this.field_db = null;
          if (!this.field_C) {
            return;
          }
          var5_int = -this.field_o + (oh.field_f - param0);
          var6 = -param3 + (pi.field_c - this.field_z);
          this.field_db = this.a(-1, var5_int, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ma.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final vl a(int param0, int param1, int param2) {
        vl var4;
        vl var5;
        int var6;
        vl var4Lifetime1;
        vl var5Lifetime1;
        var6 = SteelSentinels.obfuscationControl;
        if (param0 == -1) {
          var4 = (vl) (this.field_ab.first(13058));
          while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
              if (var5.field_s <= param1 &&
                param2 >= var5.field_w &&
                param1 < var5.field_s + var5.field_u &&
                param2 <= var5.field_o + var5.field_w) {
                return var4;
              }
              var5 = var5.field_q;
            }
            var4 = (vl) (this.field_ab.next((byte) -116));
          }
          return null;
        }
        ma.c(true);
        var4Lifetime1 = (vl) (this.field_ab.first(13058));
        while (var4Lifetime1 != null) {
          var5Lifetime1 = var4Lifetime1;
          while (var5Lifetime1 != null) {
            if (var5Lifetime1.field_s <= param1 &&
              param2 >= var5Lifetime1.field_w &&
              param1 < var5Lifetime1.field_s + var5Lifetime1.field_u &&
              param2 <= var5Lifetime1.field_o + var5Lifetime1.field_w) {
              return var4Lifetime1;
            }
            var5Lifetime1 = var5Lifetime1.field_q;
          }
          var4Lifetime1 = (vl) (this.field_ab.next((byte) -116));
        }
        return null;
    }

    void a(int param0, byte param1, int param2, int param3) {
        vl var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -112, param2, param3);
        if (param3 != 0) {
          return;
        }
        eg var9 = (eg) ((Object) this.field_p);
        if (param1 <= -99) {
          var6 = this.field_db;
          if (var6 == null) {
          } else {
            var7 = var9.a(param2, 3, (lh) (this));
            var8 = var9.a((byte) -121, (lh) (this), param0);
            do {
              ha.a(var7 + var6.field_s - 2, var6.field_u + 2, 2 + var6.field_o, 0, var6.field_w + var8 - 2);
              var6 = var6.field_q;
            } while (var6 != null);
          }
          return;
        }
    }

    static {
        field_Y = new vd();
        field_W = -1;
        field_V = -1;
        field_Z = "Ignore";
        field_cb = new ef();
    }
}
