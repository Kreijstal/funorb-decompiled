/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_b;
    static int field_d;
    private int[] field_e;
    static bm field_c;
    static String field_a;
    static String field_f;

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          if (!li.a(param0, param2, 18116)) {
            return false;
          }
          var3_int = param1;
          while (true) {
            if (param2.length() <= var3_int) {
              return true;
            }
            if (qb.a(param2.charAt(var3_int), (byte) 61)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ja var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          var4 = (ja) (vd.field_l.d(9272));
          while (var4 != null) {
            eb.a(var4, 0, param1);
            var4 = (ja) (vd.field_l.e((byte) -119));
          }
          if (param0 == -336) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "sa.E(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.awt.Color var12 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = Terraphoenix.field_V;
        try {
          if (param1 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          if (param0 >= -20) {
            var12 = (java.awt.Color) null;
            sa.a(-76, (String) null, 76, (java.awt.Color) null, true);
          }
          param1 = param1 + param2;
          var8 = param3;
          L3: while (true) {
            var9 = param5[var8];
            if (var9 < 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_e[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param4[incrementValue$1] = (byte)(~var10);
              if (param2 >= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 == (64 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$2 = this.field_e[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (0 > dupTemp$2) {
              incrementValue$3 = param2;
              param2++;
              param4[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 >= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$4 = this.field_e[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param4[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param1 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$6 = this.field_e[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (0 > dupTemp$6) {
              incrementValue$7 = param2;
              param2++;
              param4[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 >= param1) {
                break L3;
              }
              var7_int = 0;
            }
            if ((8 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$8 = this.field_e[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param4[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param1 <= param2) {
                return -param3 + (1 + var8);
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_e[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param4[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param1 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_e[var7_int];
            }
            dupTemp$12 = this.field_e[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param4[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param1 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (1 & var9)) {
              var7_int = this.field_e[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_e[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param2;
              param2++;
              param4[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param1 <= param2) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_65_0 = -param3 + (1 + var8);
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("sa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, String param1, int param2, java.awt.Color param3, boolean param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          try {
            var9 = ae.field_G.getGraphics();
            if (null == t.field_e) {
              t.field_e = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param4) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, ja.field_j, wc.field_p);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (ag.field_a == null) {
                ag.field_a = ae.field_G.createImage(304, 34);
              }
              var10 = ag.field_a.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param2 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param2 + 2, 2, 300 - 3 * param2, 30);
              var10.setFont(t.field_e);
              if (param0 != -26) {
                return;
              }
              var10.setColor(java.awt.Color.white);
              var10.drawString(param1, (304 - param1.length() * 6) / 2, 22);
              var9.drawImage(ag.field_a, -152 + ja.field_j / 2, -18 + wc.field_p / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + ja.field_j / 2;
              var8 = wc.field_p / 2 - 18;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, var8 + 2, 3 * param2, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(2 + var7 + 3 * param2, 2 + var8, -(param2 * 3) + 300, 30);
              var9.setFont(t.field_e);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param1, var7 + (-(6 * param1.length()) + 304) / 2, 22 + var8);
            }
            if (e.field_o == null) {
              return;
            }
            var9.setFont(t.field_e);
            var9.setColor(java.awt.Color.white);
            var9.drawString(e.field_o, ja.field_j / 2 - 6 * e.field_o.length() / 2, -26 + wc.field_p / 2);
            return;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ae.field_G.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("sa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = null;
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
        field_b = (String) null;
        field_b = null;
        field_c = null;
        field_f = null;
        field_a = null;
    }

    static {
        field_a = "M-06";
        field_b = "HTRRG-1";
    }
}
