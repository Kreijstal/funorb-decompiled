/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t extends bl {
    private int field_db;
    private int field_gb;
    private int field_eb;
    static String field_bb;
    static String field_ib;
    private int field_jb;
    static String[] field_cb;
    private int field_hb;
    private int field_fb;

    boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_hb > 0) {
          var2 = this.field_jb;
          var3 = this.field_gb;
          fieldTemp$0 = this.field_eb + 1;
          this.field_eb = this.field_eb + 1;
          if (this.field_hb <= fieldTemp$0) {
            this.field_hb = 0;
            this.j((byte) -52);
          } else {
            var4 = (-this.field_eb + 2 * this.field_hb) * this.field_eb;
            var5 = this.field_hb * this.field_hb;
            var2 = var4 * (this.field_jb - this.field_db) / var5 + this.field_db;
            var3 = this.field_fb + var4 * (-this.field_fb + this.field_gb) / var5;
          }
          this.a(110, var2, var3);
        }
        if (param0 < 15) {
          return true;
        }
        return super.h((byte) 90);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 != 194) {
          this.b(35, 121, -128, 19);
        }
        if (param1 <= 0) {
          this.a(121, param0, param2);
          return;
        }
        this.field_hb = param1;
        this.field_gb = param2;
        this.field_db = this.field_t;
        this.field_fb = this.field_y;
        this.field_jb = param0;
        this.field_eb = 0;
    }

    final static void k(byte param0) {
        if (param0 != -73) {
          return;
        }
        de.field_W.c(new lg(), (byte) 121);
    }

    void j(int param0) {
        if (this.field_hb <= 0) {
          return;
        }
        this.a(112, this.field_jb, this.field_gb);
        this.field_hb = 0;
        this.j((byte) -32);
        int var2 = 40 % ((param0 + 15) / 49);
    }

    final static boolean i(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 124) {
          field_bb = (String) null;
        }
        stackIn_6_0 = (hc.field_d >= 10) && (ca.field_vb >= 13);
        return stackIn_6_0;
    }

    t(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_eb = 0;
        this.field_hb = 0;
    }

    boolean f(byte param0) {
        this.j(38);
        if (param0 < 77) {
          field_bb = (String) null;
        }
        return super.f((byte) 125);
    }

    void j(byte param0) {
        int var2 = -128 % ((param0 - 30) / 39);
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 104) {
          return;
        }
        uc.a(true, param1, 54);
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = client.field_A ? 1 : 0;
        if (param0 > -127) {
          return;
        }
        hk.d(6 + param2, 35 + param1, -12 + this.field_t, this.field_y - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var4 > var7) {
          if (hk.field_h <= var8 &&
            hk.field_b > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_t;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (-var7 + 20) + (-var10 + 20) * (20 - var10);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (-var12 + 462) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  hk.field_l[hk.field_j * var8 + param2 + var10] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (20 >= var13Lifetime1) {
                var14 = (-var7 + 20) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (420 > var14) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    hk.field_l[param2 + var8 * hk.field_j + var11] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            hk.a(var10 + param2, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          hk.a(param2, var8Lifetime1, 6, var9Lifetime1);
          hk.a(param2 + this.field_t - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        jm.field_q.c(-90 + (param2 + this.field_t), 10 + param1);
        ng.a(c.field_m, -10 + this.field_t, param1 + 35, -1, 5 + param2);
        ng.a(g.field_O, this.field_t, param1 + (this.field_y - 22), -1, param2);
        var4Lifetime2 = this.field_y - 79;
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          hk.a(param2, var8Lifetime2, 6, var9Lifetime2);
          hk.a(-6 + (this.field_t + param2), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
        return;
    }

    final static pi[] a(String param0, ji param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pi[] stackIn_2_0 = null;
        pi[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            stackIn_2_0 = (pi[]) null;
            return stackIn_2_0;
          }
          var4_int = param1.b(-1, param3);
          var5 = param1.a(var4_int, 13030, param0);
          stackIn_4_0 = on.a(var5, (byte) 37, var4_int, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("t.MA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void l(byte param0) {
        field_bb = null;
        field_ib = null;
        if (param0 != 94) {
          String var2 = (String) null;
          t.a((String) null, (ji) null, true, (String) null);
        }
        field_cb = null;
    }

    final static hm k(int param0) {
        try {
          Throwable var1 = null;
          hm stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != -22) {
            return (hm) null;
          }
          try {
            stackIn_3_0 = (hm) (Class.forName("ag").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_bb = "Matching Score: ";
        field_ib = "Animals";
        field_cb = new String[255];
    }
}
