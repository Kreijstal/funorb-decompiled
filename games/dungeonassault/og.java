/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static ed field_e;
    static ad field_c;
    static String[] field_b;
    static String[] field_a;
    static int field_f;
    static String field_d;

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -30633) {
            stackIn_2_0 = -17;
            return stackIn_2_0;
          }
          if (param0) {
            stackIn_7_0 = i.field_x.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = n.field_c.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("og.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != in.field_C) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              oh.a(-161, (char) var2_int)) {
              var3 = 127 & ka.field_c + 1;
              if (var3 != je.field_i) {
                jk.field_Db[ka.field_c] = -1;
                b.field_a[ka.field_c] = (char)var2_int;
                ka.field_c = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "og.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, gn param2) {
        try {
          if (param2 != null) {
            param2.a((byte) -117);
          }
          ce.field_p = param1;
          gk.field_L = param2;
          bl.field_k = param0 ? true : false;
          hc.field_b = param2 != null ? param2.field_a : 0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "og.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, q param3, int param4, byte param5) {
        int incrementValue$1 = 0;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (param1 >= -6) {
            field_d = (String) null;
          }
          var6_int = param2 + param3.field_h * param4;
          while (true) {
            incrementValue$1 = param0;
            param0--;
            if (incrementValue$1 <= 0) {
              return;
            }
            param3.field_j[var6_int] = (byte)param5;
            var6_int = var6_int + param3.field_h;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("og.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != in.field_C) {
            ia.field_M = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("og.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != in.field_C) {
            hl.field_g = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              fl.field_m.length > var2_int) {
              var2_int = fl.field_m[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (0 <= ia.field_M &&
              var2_int >= 0) {
              ih.field_r[ia.field_M] = ~var2_int;
              ia.field_M = 127 & 1 + ia.field_M;
              if (dl.field_b == ia.field_M) {
                ia.field_M = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("og.keyReleased(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int a(se param0, byte param1, String[] param2, int param3, String param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var6Lifetime1;
        var14 = DungeonAssault.field_K;
        try {
          var5_int = param0.b(param4);
          if (param3 >= var5_int &&
            param4.indexOf("<br>") == -1) {
            param2[0] = param4;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (-1 + (param3 + var5_int)) / param3;
          param3 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param4.length();
          var10 = -128 % ((29 - param1) / 49);
          for (var9 = 0; var9 < var8; var9++) {
            var11 = param4.charAt(var9);
            if (32 == var11 ||
              var11 == 45) {
              var12 = param4.substring(var7, var9 + 1).trim();
              var13 = param0.b(var12);
              if (var13 >= param3) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param2[incrementValue$1] = var12;
              }
            }
            if (var11 == 62 &&
              param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param2[incrementValue$2] = param4.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param2[incrementValue$0] = param4.substring(var7, var8).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("og.F(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        if (param0 != 4) {
          return -99;
        }
        return jn.field_d;
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null != in.field_C) {
            hl.field_g = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              fl.field_m.length > var2_int) {
              var2_int = fl.field_m[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (0 <= ia.field_M &&
              var2_int >= 0) {
              ih.field_r[ia.field_M] = var2_int;
              ia.field_M = 1 + ia.field_M & 127;
              if (dl.field_b == ia.field_M) {
                ia.field_M = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & 1 + ka.field_c;
              if (var3 != je.field_i) {
                jk.field_Db[ka.field_c] = var2_int;
                b.field_a[ka.field_c] = (char)0;
                ka.field_c = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0) {
              param0.consume();
            } else {
              if (var2_int == 85) {
                param0.consume();
              } else {
                if (var2_int == 10) {
                  param0.consume();
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("og.keyPressed(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -129) {
          field_f = -21;
        }
        field_c = null;
        field_a = null;
        field_e = null;
    }

    static {
        field_c = new ad(8, 0, 4, 1);
        field_b = new String[]{"All scores", "My scores", "Best each"};
        field_a = new String[]{null, "One raider will be the <%highlight>party leader</col>, and will be first to enter the next room and encounter whatever lies inside. You can change your party leader before you enter any room by <col=FF0000>left-clicking on it in the party view</col> at the bottom-left of the screen."};
        field_d = "GUARDIAN";
    }
}
