/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends hc {
    static ea[] field_O;
    private aa field_I;
    private int field_N;
    static String[] field_K;
    static String[] field_R;
    static bj field_L;
    int field_J;
    static long field_Q;
    static String field_M;
    int field_P;

    public static void a(int param0) {
        field_K = null;
        field_O = null;
        field_R = null;
        field_L = null;
        field_M = null;
        if (param0 != 2) {
          ne.a((byte) 76, -30);
        }
    }

    final static int a(boolean param0) {
        if (param0) {
          field_R = (String[]) null;
          return -1422590333 ^ pj.field_b;
        }
        return -1422590333 ^ pj.field_b;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              if (param1 != 30433) {
                ne.a(false);
              }
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4);
              param0.getAppletContext().showDocument(nn.a(param1 - 30307, param0, var5), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("ne.I(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        if (param0 != -84) {
          ne.a(-91);
          return this.field_N;
        }
        return this.field_N;
    }

    final static void a(int param0, int param1) {
        od.a(128, param0, oc.field_f, 4);
        int var2 = 45 % ((-17 - param1) / 46);
    }

    final int m(int param0) {
        if (param0 == 22302) {
          return this.field_I.b(5717);
        }
        java.applet.Applet var3 = (java.applet.Applet) null;
        ne.a((java.applet.Applet) null, 18);
        return this.field_I.b(5717);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = MinerDisturbance.field_ab;
        try {
          if (!super.a(param0, param1, param2 + param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_J + param0 - param6;
          var9 = this.field_v - 2 * this.field_J;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_N / var9;
          if (param4 == 1) {
            this.field_I.d(6524, var8_int);
          }
          if (param4 != 1 ||
            var14 != 0) {
            if (2 != param4) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            var12 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (this.field_I.b(5717) > var12) {
                var13 = this.field_I.a(var12, (byte) 7) - var8_int;
                var13 = var13 * var13;
                stackIn_19_0 = var10;
                stackIn_19_1 = var13;
                if ((var14 != 0) &&
                  (decompiledFrameRemainder0 = !(stackIn_19_0 >= stackIn_19_1))) {
                  break;
                }
                if (decompiledFrameRemainder0) {
                  if (stackIn_19_0 > stackIn_19_1) {
                    var10 = var13;
                    var11 = var12;
                  }
                  var12++;
                  continue;
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var11 < 0)) {
                break;
              }
              this.field_I.c(var11, 0);
              break;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_30_0 = var8;
          stackIn_30_1 = new StringBuilder().append("ne.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean a(int param0, char[] param1, sb param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          if (param0 != param1[0]) {
            return false;
          }
          var4_int = param2.field_o;
          var5 = 1;
          L1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (param1.length > var5) {
              stackIn_9_0 = param2.field_o;
              stackIn_9_1 = param2.field_u.length;
              if (var6 != 0) {
                if (stackIn_9_0 < stackIn_9_1) {
                  break L1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_9_0 != stackIn_9_1 &&
                  param2.m(4) == param1[var5]) {
                  var5++;
                  continue;
                } else {
                  param2.field_o = var4_int;
                  return false;
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (param3 < -3)) {
              break L1;
            }
            ne.a(false);
            break;
          }
          param2.field_o = var4_int;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ne.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    private ne() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, int param1) {
        if (sj.field_d == null) {
          return false;
        }
        if (param0 != 10) {
          return false;
        }
        return nm.a(param1, sj.field_d, -827843803);
    }

    final int a(int param0, boolean param1) {
        if (0 > param0) {
          return -1;
        }
        if (this.field_I.b(5717) <= param0) {
          return -1;
        }
        if (param1) {
          return this.field_I.a(param0, (byte) -119);
        }
        return -40;
    }

    static {
        field_O = new ea[4];
        field_R = new String[]{"Welcome to the Miner Market - the last stop before the volcano. You have 500 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot.", "Welcome to the Miner Market - the last stop before the Super Volcano. You have 600 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot."};
        field_M = "Gold: <%0>";
    }
}
