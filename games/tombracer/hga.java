/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hga extends vpa {
    static String field_n;
    private static String[] field_o;

    hga(int param0) {
        this(mj.field_J, param0);
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        if (param2 != 16777215) {
          return;
        }
        try {
          if (param4) {
            bl.a(param0.field_m, param3 + param0.field_n, param0.field_p, param1 + param0.field_i, 1);
          }
          super.a(param0, param1, param2 + 0, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hga.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        field_o = null;
        field_n = null;
        int var1 = 71 % ((param0 - 38) / 42);
    }

    hga(il param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_w, -1, 2147483647, false);
    }

    final static void a(boolean param0, byte[] param1) {
        int var11_int = 0;
        int var15_int = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ji var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        g[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        String[][] var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String[][] var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        int var13Lifetime1;
        int var16Lifetime1;
        int var14Lifetime1;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          var27 = sra.a((byte) 43, new uia(param1));
          var31 = var27;
          var3 = -1;
          var4 = -1;
          var5 = -1;
          var6 = -1;
          var7 = -1;
          var8 = -1;
          var9 = -1;
          var10 = -1;
          for (var11_int = 0; var11_int < var27[0].length; var11_int++) {
            var29 = var27[0][var11_int];
            var30 = var29.trim();
            if (var30.equals("World")) {
              var3 = var11_int;
            } else {
              if (!var30.equals("File Name")) {
                if (var30.equals("Group Name")) {
                  var6 = var11_int;
                } else {
                  if (!var30.equals("Room Id")) {
                    if (!var30.equals("Special")) {
                      if (!var30.equals("Multiplayer ID")) {
                        if (var30.equals("MemLev")) {
                          var9 = var11_int;
                        } else {
                          if (var30.equals("Par Time")) {
                            var10 = var11_int;
                          }
                        }
                      } else {
                        var8 = var11_int;
                      }
                    } else {
                      var7 = var11_int;
                    }
                  } else {
                    var5 = var11_int;
                  }
                }
              } else {
                var4 = var11_int;
              }
            }
          }
          var11 = new ji(8);
          var12 = 0;
          for (var13 = 1; var27.length > var13; var13++) {
            var14 = Integer.parseInt(var27[var13][var3]);
            if (null == var11.a((byte) -100, (long)var14)) {
              var11.a((long)var14, 109, new vg());
              var12++;
            }
          }
          cm.field_a = new qg[var12];
          rda.field_n = new int[var12];
          if (!param0) {
            return;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < var12; var13Lifetime1++) {
            var14Lifetime1 = 0;
            for (var15_int = 1; var31.length > var15_int; var15_int++) {
              var16 = Integer.parseInt(var31[var15_int][var3]) - 1;
              if (var16 == var13Lifetime1) {
                var14Lifetime1++;
              }
            }
            var15 = new g[var14Lifetime1];
            rda.field_n[var13Lifetime1] = var14Lifetime1;
            var16Lifetime1 = 0;
            var17 = 0;
            for (var18 = 1; var31.length > var18; var18++) {
              var19 = -1 + Integer.parseInt(var31[var18][var3]);
              if (var19 == var13Lifetime1) {
                var32 = var31[var18][var5];
                if (var32.length() <= 0) {
                  stackIn_44_0 = -1;
                } else {
                  stackIn_44_0 = Integer.parseInt(var32) - 1;
                }
                var21 = stackIn_44_0;
                var28 = var31[var18][var8];
                var33 = var28;
                if (0 < var33.length()) {
                  stackIn_47_0 = Integer.parseInt(var28) - 1;
                } else {
                  stackIn_47_0 = -1;
                }
                var22 = stackIn_47_0;
                var34 = var31[var18][var9];
                if (var34.length() > 0) {
                  stackIn_53_0 = (!var34.equalsIgnoreCase("FALSE")) ? 1 : 0;
                } else {
                  stackIn_53_0 = 1;
                }
                var23 = stackIn_53_0;
                var35 = var31[var18][var10];
                if (var35.length() <= 0) {
                  stackIn_56_0 = 0;
                } else {
                  stackIn_56_0 = Integer.parseInt(var35);
                }
                var24 = stackIn_56_0;
                incrementValue$0 = var17;
                var17++;
                var15[incrementValue$0] = new g(var31[var18][var6], var31[var18][var4], var21, var22, var23 != 0, var24);
                var25 = var31[var18][var7].equalsIgnoreCase("Tutorial") ? 1 : 0;
                var16Lifetime1 = var25;
                var31[var18][var7].equalsIgnoreCase("Corridor");
              }
            }
            cm.field_a[var13Lifetime1] = new qg(var15, var16Lifetime1 != 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_62_0 = var2;
          stackIn_62_1 = new StringBuilder().append("hga.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    static {
        field_n = "Create your own free Jagex account";
        field_o = new String[2];
        field_o[0] = "Finish";
        field_o[1] = "Ignore Fall";
    }
}
