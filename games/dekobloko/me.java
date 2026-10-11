/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends be {
    int[] field_F;
    static long field_E;
    static String field_C;
    static String field_B;
    static pi field_J;
    private String[] field_H;
    private int[][] field_D;
    static String field_G;
    private int[] field_A;
    static int field_y;
    static jk field_z;
    static int[] field_I;

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        wl var5 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          while (true) {
            var3_int = param1.d((byte) -88);
            if (var3_int != 0) {
              this.a(var3_int, param0 ^ 2598, param1);
              continue;
            }
            break;
          }
          if (param0 != 80) {
            var5 = (wl) null;
            this.a((byte) 71, (wl) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("me.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String f(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = client.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (param0 > -57) {
          wl var5 = (wl) null;
          this.a((byte) 104, (wl) null);
        }
        if (null == this.field_H) {
          return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_H[0]);
        for (var3 = 1; this.field_H.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var6.append(this.field_H[var3]);
        }
        return var2.toString();
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 != 19423) {
          me.c(-120);
        }
        if (this.field_F != null) {
          for (var2 = 0; var2 < this.field_F.length; var2++) {
            this.field_F[var2] = de.b(this.field_F[var2], 32768);
          }
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_G = null;
        field_B = null;
        field_C = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
          field_y = 75;
        }
    }

    private final void a(int param0, int param1, wl param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param1 != 2678) {
            return;
          }
          if (param0 == 1) {
            this.field_H = ji.a('<', (byte) 66, param2.c((byte) -38));
          } else {
            if (param0 == 2) {
              var4_int = param2.d((byte) -86);
              this.field_F = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_F[var5] = param2.e(3);
              }
            } else if (param0 == 3) {
              var4_int = param2.d((byte) -89);
              this.field_D = new int[var4_int][];
              this.field_A = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param2.e(3);
                var7 = je.a(-121, var6);
                if (var7 != null) {
                  this.field_A[var5] = var6;
                  array$0 = new int[var7.field_f];
                  this.field_D[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_f; var8++) {
                    this.field_D[var5][var8] = param2.e(qm.b(param1, 2677));
                  }
                }
              }
            } else {
              if (param0 == 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("me.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          int var4 = 0;
          java.net.URL var5 = null;
          try {
            try {
              var5 = param1.getCodeBase();
              var3 = gn.a(var5, -1, param1).getFile();
              nc.a("updatelinks", -14541, param1, new Object[]{"home", var3 + "home.ws"});
              var4 = -128 / ((param0 - 10) / 61);
              nc.a("updatelinks", -14541, param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
              nc.a("updatelinks", -14541, param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              nc.a("updatelinks", -14541, param1, new Object[]{"options", var3 + "options.ws"});
              nc.a("updatelinks", -14541, param1, new Object[]{"terms", var3 + "terms.ws"});
              nc.a("updatelinks", -14541, param1, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref;
            stackIn_6_1 = new StringBuilder().append("me.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    me() {
    }

    final static ck a(ck param0, boolean param1, byte param2, boolean param3) {
        ck stackIn_60_0 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var6Lifetime4;
        int var6Lifetime5;
        int var7Lifetime4;
        int var7Lifetime5;
        int var8Lifetime3;
        var10 = client.field_A ? 1 : 0;
        try {
          param0.b();
          var11 = new ck(36, 36);
          var12 = var11;
          for (var5 = 0; var5 < 18; var5++) {
            for (var6 = 0; var6 < 18; var6++) {
              var7 = param0.field_D[var5 * 18 + var6];
              if (var7 != 0) {
                var7 = var7 + 16777216;
              }
              var12.field_D[var5 * 72 + 2 * var6] = var7;
            }
            for (var6Lifetime4 = 0; var6Lifetime4 < 17; var6Lifetime4++) {
              var7Lifetime4 = var12.field_D[var6Lifetime4 * 2 + 72 * var5];
              var8 = var12.field_D[2 + var6Lifetime4 * 2 + var5 * 72];
              var9 = ((var8 & 16711423) >> 1) + ((16711423 & var7Lifetime4) >> 1);
              if (var9 == 0 &&
                (var8 | var7Lifetime4) != 0) {
                var9 = 1;
              }
              if (var7Lifetime4 != 0 &&
                var8 != 0) {
                var9 = var9 + 16777216;
              }
              var12.field_D[1 + var5 * 72 + var6Lifetime4 * 2] = var9;
            }
            if (param3) {
              var6Lifetime5 = var12.field_D[34 + 72 * var5];
              var7Lifetime5 = var11.field_D[72 * var5];
              var8Lifetime3 = ((16711422 & var6Lifetime5) >> 1) + ((var7Lifetime5 & 16711423) >> 1);
              if (var8Lifetime3 == 0 &&
                (var7Lifetime5 | var6Lifetime5) != 0) {
                var8Lifetime3 = 1;
              }
              if (var6Lifetime5 != 0 &&
                0 != var7Lifetime5) {
                var8Lifetime3 = var8Lifetime3 + 16777216;
              }
              var12.field_D[34 + (var5 * 72 + 1)] = var8Lifetime3;
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < 17; var5Lifetime1++) {
            for (var6Lifetime1 = 0; var6Lifetime1 < 36; var6Lifetime1++) {
              L10: {
                var7Lifetime1 = var12.field_D[var6Lifetime1 + var5Lifetime1 * 72];
                var8Lifetime1 = var12.field_D[var6Lifetime1 + (var5Lifetime1 * 72 + 72)];
                var9Lifetime1 = ((var8Lifetime1 & 16711423) >> 1) + ((16711423 & var7Lifetime1) >> 1);
                if ((var7Lifetime1 | var8Lifetime1) < 16777216 && ((16777215 & var7Lifetime1) == 0 ||
                  (16777215 & var8Lifetime1) == 0)) {
                  var9Lifetime1 = 0;
                  break L10;
                }
                if (var9Lifetime1 == 0) {
                  var9Lifetime1 = 1;
                }
              }
              var12.field_D[36 + (var6Lifetime1 + 72 * var5Lifetime1)] = var9Lifetime1;
            }
          }
          if (param1) {
            for (var5Lifetime2 = 0; var5Lifetime2 < 36; var5Lifetime2++) {
              L4: {
                var6Lifetime2 = var11.field_D[1224 + var5Lifetime2];
                var7Lifetime2 = var11.field_D[var5Lifetime2];
                var8Lifetime2 = (8355711 & var6Lifetime2 >> 1) + ((16711423 & var7Lifetime2) >> 1);
                if ((var7Lifetime2 | var6Lifetime2) < 16777216 && ((var6Lifetime2 & 16777215) == 0 ||
                  (16777215 & var7Lifetime2) == 0)) {
                  var8Lifetime2 = 0;
                  break L4;
                }
                if (var8Lifetime2 == 0) {
                  var8Lifetime2 = 1;
                }
              }
              var12.field_D[36 + var5Lifetime2 + 1224] = var8Lifetime2;
            }
          }
          for (var5Lifetime3 = 0; var5Lifetime3 < 18; var5Lifetime3++) {
            for (var6Lifetime3 = 0; var6Lifetime3 < 36; var6Lifetime3++) {
              var7Lifetime3 = var12.field_D[72 * var5Lifetime3 + var6Lifetime3];
              var7Lifetime3 = var7Lifetime3 & 16777215;
              var12.field_D[var6Lifetime3 + 72 * var5Lifetime3] = var7Lifetime3;
            }
          }
          var5Lifetime4 = 23 % ((59 - param2) / 42);
          stackIn_60_0 = var12;
          return stackIn_60_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_63_0 = var4;
          stackIn_63_1 = new StringBuilder().append("me.D(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_B = "Orb coins: ";
        field_G = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_C = "Members";
        field_J = new pi(0, 0, 0);
        field_y = 9;
        field_I = new int[8];
    }
}
