/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tja implements ntb {
    static String field_b;
    bha[] field_c;
    static soa field_a;

    public static void a(boolean param0) {
        if (param0) {
          tja.a(false);
        }
        field_b = null;
        field_a = null;
    }

    final int a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        faa var5;
        var4 = VoidHunters.field_G;
        if (null == this.field_c) {
          return 0;
        }
        if (param0 != -5358) {
          var5 = (faa) null;
          this.b((faa) null, -13);
        }
        var2 = 0;
        for (var3 = 0; this.field_c.length > var3; var3++) {
          if (this.field_c[var3].field_a) {
            var2++;
          }
        }
        return var2;
    }

    public void b(faa param0, int param1) {
        int var8 = 0;
        faa var3 = null;
        bha[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        bha[] var7 = null;
        bha var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var10 = VoidHunters.field_G;
        try {
          if (param1 >= -109) {
            this.field_c = (bha[]) null;
          }
          var3 = param0;
          var4 = this.field_c;
          var5 = hab.field_h;
          if (var4 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = var4.length;
          }
          var6 = stackIn_6_0;
          var3.a(-632, var6, var5);
          if (var6 != 0) {
            var7 = var4;
            for (var8 = 0; var7.length > var8; var8++) {
              var9 = var7[var8];
              stackIn_12_0 = var3;
              stackIn_12_1 = -110;
              stackIn_13_2 = (var9 != null);
              if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
                stb.a(2, 1, var3, var9);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tja.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(ntb[] param0, int param1, ntb[] param2, boolean param3, int param4) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        ntb[] var10 = null;
        var9 = VoidHunters.field_G;
        try {
          if (param2 == null) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = param2.length;
          }
          var5_int = stackIn_4_0;
          if (param0 != null) {
            stackIn_7_0 = param0.length;
          } else {
            stackIn_7_0 = 0;
          }
          var6 = stackIn_7_0;
          if (var6 != var5_int) {
            return true;
          }
          var7 = 0;
          if (param4 != 5547) {
            var10 = (ntb[]) null;
            tja.a((ntb[]) null, 96, (ntb[]) null, true, 70);
          }
          for (var8 = 0; var8 < var5_int; var8++) {
            if (param3 &&
              null != param2[var8] &&
              param0[var8] != null &&
              param2[var8].getClass() != param0[var8].getClass()) {
              te.a(param4 + 24239, param2[var8], param0[var8]);
            } else {
              if (param2[var8] == null &&
                param0[var8] != null ||
                null != param2[var8] &&
                param0[var8] == null) {
                te.a(29786, param2[var8], param0[var8]);
              }
              if (null != param2[var8] &&
                null != param0[var8]) {
                param2[var8].a(param0[var8], param4 ^ -5605);
                if (param2[var8].a((byte) -78, param0[var8])) {
                  var7 = 1;
                  System.out.println("Element " + var8 + " has changed");
                }
              }
            }
          }
          stackIn_38_0 = var7;
          return stackIn_38_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_41_0 = var5;
          stackIn_41_1 = new StringBuilder().append("tja.N(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public void a(tv param0, int param1) {
        tja var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 >= -19) {
            field_a = (soa) null;
          }
          var3 = (tja) (param0);
          var4 = 0;
          tja.a(var3.field_c, 1, this.field_c, false, 5547);
          if (dn.a(var3.field_c, false, 1, this.field_c, 126)) {
            var4 = 1;
            iva.a(-6940, "CarouselPlayerInfo[] players has changed. ");
          }
          if (var4 != 0) {
            iva.a(-6940, "This instance of CarouselSlot has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("tja.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        tja var4 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -83 % ((22 - param0) / 59);
          var4 = (tja) (param1);
          stackIn_1_0 = dn.a(var4.field_c, false, 1, this.field_c, -93);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("tja.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    void a(tja param0, int param1, int param2, boolean param3) {
        try {
          if (param2 != 1) {
            this.a(-32);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tja.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void b(byte param0, tv param1) {
        tja var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (tja) (param1);
          var3.field_c = (bha[]) (sqb.a(var3.field_c, this.field_c, 1, uqa.field_q, false));
          if (param0 < 54) {
            this.field_c = (bha[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("tja.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    void a(boolean param0, int param1) {
        if (param0) {
          field_b = (String) null;
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var4 = new char[param2];
          var5 = 0;
          for (var6 = param1; var6 < param2; var6++) {
            var7 = 255 & param3[param0 + var6];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = tu.field_c[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_15_0 = new String(var4, 0, var5);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("tja.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    void a(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param1 <= 93) {
          field_a = (soa) null;
        }
        this.field_c = (bha[]) (uqa.field_q.a(11995, param0));
        for (var3 = 0; var3 < param0; var3++) {
          this.field_c[var3] = (bha) (uqa.field_q.a((byte) 15));
        }
    }

    public void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.field_c = (bha[]) (kcb.a(hab.field_h, uqa.field_q, param0, 1, -80, this.field_c));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tja.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Friends";
    }
}
