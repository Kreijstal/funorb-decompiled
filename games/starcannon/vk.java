/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vk extends uj implements ch {
    static String field_x;
    static String field_w;
    static String field_t;
    static String field_v;
    rk field_u;

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        ba var2 = null;
        uj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          var2 = new ba(this.field_u);
          if (param0 >= -72) {
            field_t = (String) null;
          }
          var3 = (uj) (var2.a(0));
          while (var3 != null) {
            var3.b((byte) -127);
            var3 = (uj) (var2.b(106));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "vk.NA(" + param0 + ')');
        }
    }

    final boolean d(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            vk.e((byte) 0);
          }
          stackIn_7_0 = (null != this.h(1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "vk.UA(" + param0 + ')');
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = StarCannon.field_A;
        try {
          if (param0 == 0 &&
            null != this.field_o) {
            this.field_o.a(param1, true, 71, param3, (uj) (this));
          }
          var5 = new ba(this.field_u);
          var6 = (uj) (var5.a(false));
          if (param2 != 49) {
            return;
          }
          while (null != var6) {
            var6.a(param0, this.field_s + param1, (byte) 49, param3 + this.field_j);
            var6 = (uj) (var5.a((byte) -34));
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "vk.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        ia var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        rj var3 = null;
        hb var3_ref = null;
        int[] var3_array = null;
        int[] var4 = null;
        rj var4_ref = null;
        ia var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          var1 = se.field_p;
          var2 = var1.j(7909);
          if (var2 != 0) {
            if (var2 != 1) {
              if (2 != var2) {
                hc.a((Throwable) null, "A1: " + oe.a(87), (byte) 72);
                ec.a((byte) 27);
                decompiledFrameRemainder0 = (var8 != 0);
              }
              if (decompiledFrameRemainder0) {
                var3 = (rj) (sd.field_d.c(-3905));
                if (var3 == null) {
                  ec.a((byte) 27);
                  return;
                }
                var3.field_g = wa.a((byte) -109);
                var3.field_k = var3.field_g[0];
                var3.field_n = true;
                var3.b(4);
                decompiledFrameRemainder0 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              var3_ref = (hb) (hi.field_f.c(-3905));
              if (var3_ref == null) {
                ec.a((byte) 27);
                return;
              }
              var3_ref.b(4);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (var2 == 0 ||
            var8 != 0)) {
            var3_array = wa.a((byte) -77);
            var4 = var3_array;
            var5 = var1;
            var6 = ((rb) ((Object) var5)).j(7909);
            var7 = 0;
            while (var7 < var6) {
              var4[var7] = ((rb) ((Object) var5)).f((byte) -125);
              var7++;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              var4_ref = (rj) (sd.field_d.c(-3905));
              if (var4_ref == null) {
                ec.a((byte) 27);
                return;
              }
              var4_ref.field_n = true;
              var4_ref.field_k = var3_array[0];
              var4_ref.field_g = var3_array;
              var4_ref.b(4);
            }
          }
          if (param0 >= -25) {
            vk.a((String) null, -7, (String) null, (ue) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "vk.SB(" + param0 + ')');
        }
    }

    final static hl a(String param0, int param1, String param2, ue param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hl stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param0, false);
          var5 = param3.a(param2, true, var4_int);
          if (param1 <= 9) {
            field_x = (String) null;
          }
          stackIn_4_0 = di.a(130, var5, param3, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vk.EB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$9 = null;
        int var7 = 0;
        StringBuilder discarded$10 = null;
        ba var5 = null;
        uj var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          var5 = new ba(this.field_u);
          if (param0 != -36) {
            field_w = (String) null;
          }
          var6 = (uj) (var5.a(param0 + 36));
          while (null != var6) {
            discarded$9 = param2.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$10 = param2.append(' ');
            }
            var6.a(param1, param2, (byte) 39, 1 + param3);
            var6 = (uj) (var5.b(param0 + 149));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("vk.WB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, uj param1) {
        ba var3 = null;
        uj var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = new ba(this.field_u);
          var4 = (uj) (var3.a(param0));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(0, param1)) {
              var4 = (uj) (var3.b(95));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("vk.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        RuntimeException runtimeException = null;
        ba var2 = null;
        uj var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ba(this.field_u);
          if (param0 != 27807) {
            this.a((Hashtable) null, (StringBuilder) null, (byte) -115, -49);
          }
          var3 = (uj) (var2.a(0));
          while (null != var3) {
            var3.d((byte) -30);
            var3 = (uj) (var2.b(95));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "vk.TB(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, uj param4, int param5, int param6) {
        ba var8 = null;
        RuntimeException var8_ref = null;
        uj var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var10 = StarCannon.field_A;
        try {
          var8 = new ba(this.field_u);
          var9 = (uj) (var8.a(0));
          L1: while (true) {
            if (var9 != null) {
              stackOut_3_0 = var9.a((byte) -110);
              stackIn_17_0 = stackOut_3_0 ? 1 : 0;
              stackIn_4_0 = stackOut_3_0;
              if (var10 != 0) {
                break L1;
              }
              if (stackIn_4_0) {
                if (var9.d(true) &&
                  var9.a(param0, param1, param2, param3, param4, param5, -81)) {
                  return true;
                }
                var9 = (uj) (var8.b(param6 ^ -46));
                continue;
              }
            }
            stackIn_17_0 = param6;
            break;
          }
          if (stackIn_17_0 != -81) {
            field_w = (String) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_25_0 = var8_ref;
          stackIn_25_1 = new StringBuilder().append("vk.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 0, param1, param3)) {
            this.a(param0, param1, param3, 19103);
            this.a((byte) -36, param0, param1, param3);
          }
          if (param2 != 39) {
            this.g(89);
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("vk.SA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param1 != 32) {
              field_w = (String) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("vk.AC(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sk a(byte param0, String param1) {
        sk stackIn_3_0 = null;
        sk stackIn_6_0 = null;
        sk stackIn_12_0 = null;
        int stackIn_22_0 = 0;
        sk stackIn_30_0 = null;
        Object stackIn_34_0 = null;
        sk stackIn_37_0 = null;
        sk stackIn_53_0 = null;
        sk stackIn_61_0 = null;
        Object stackIn_65_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = StarCannon.field_A;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_3_0 = qb.field_b;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_6_0 = ai.field_a;
            return stackIn_6_0;
          }
          if (34 == param1.charAt(0)) {
            if (34 != param1.charAt(-1 + var2_int)) {
              stackIn_12_0 = ra.field_t;
              return stackIn_12_0;
            }
            var3 = 0;
            var4 = 1;
            while (-1 + var2_int > var4) {
              var5 = param1.charAt(var4);
              if (92 == var5) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              }
              if (92 != var5 ||
                var6 != 0) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_30_0 = ra.field_t;
                  return stackIn_30_0;
                }
                var3 = 0;
              }
              var4++;
              if (var6 == 0) {
                continue;
              }
              break;
            }
            stackIn_34_0 = null;
            return (sk) (stackIn_34_0);
          }
          var3Lifetime1 = 0;
          if (param0 != 63) {
            stackIn_37_0 = (sk) null;
            return stackIn_37_0;
          }
          var4Lifetime1 = 0;
          while (var2_int > var4Lifetime1) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = (var6 != 0);
              } else {
                stackIn_53_0 = ra.field_t;
                return stackIn_53_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == oj.field_k.indexOf(var5Lifetime1)) {
                stackIn_61_0 = ra.field_t;
                return stackIn_61_0;
              }
              var3Lifetime1 = 0;
            }
            var4Lifetime1++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          stackIn_65_0 = null;
          return (sk) (stackIn_65_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_69_0 = var2;
          stackIn_69_1 = new StringBuilder().append("vk.UB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        try {
          fd.a(4, 0);
          if (param0 >= -18) {
            vk.b((java.applet.Applet) null, 53);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vk.CB(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          super.a(param0, param1, (byte) 118, param3, param4);
          if (param2 < 115) {
            this.field_u = (rk) null;
          }
          this.g(27807);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var6), "vk.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0, uj param1) {
        ba var3 = null;
        uj var4 = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_30_0 = false;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        boolean stackOut_20_0;
        RuntimeException var3_ref = null;
        var7 = StarCannon.field_A;
        try {
          if (this.field_u.a(true)) {
            return false;
          }
          if (param0 != -103) {
            field_x = (String) null;
          }
          var3 = new ba(this.field_u);
          var4 = (uj) (var3.a(param0 ^ -103));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var4))) {
            stackOut_11_0 = var4.d(true);
            stackIn_30_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var7 == 0) {
              if (stackIn_12_0) {
                var5 = new ba(this.field_u);
                var5.a(var4, param0 + 103);
                var6 = (uj) (var5.b(95));
                while (null != var6) {
                  stackOut_20_0 = var6.a(0, param1);
                  stackIn_30_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (stackIn_21_0) {
                    return true;
                  }
                  var6 = (uj) (var5.b(101));
                }
              }
              var4 = (uj) (var3.b(102));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_30_0 = false;
          }
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_34_0 = var3_ref;
          stackIn_34_1 = new StringBuilder().append("vk.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        RuntimeException runtimeException = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = StarCannon.field_A;
        try {
          if (param0 <= 27) {
            return;
          }
          super.a(120, param1, param2, param3);
          var5 = new ba(this.field_u);
          var6 = (uj) (var5.a(0));
          while (var6 != null) {
            if (var6.a((byte) -125)) {
              var6.a(119, param1 + this.field_s, param2, this.field_j + param3);
              var6 = (uj) (var5.b(69));
              if (var7 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("vk.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_x = null;
        field_t = null;
        field_w = null;
        if (param0 != 73) {
          return;
        }
        try {
          field_v = null;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "vk.BB(" + param0 + ')');
        }
    }

    final String d(int param0) {
        ba var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          var2 = new ba(this.field_u);
          var3 = (uj) (var2.a(0));
          if (param0 != 12606) {
            field_x = (String) null;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            var4 = var3.d(12606);
            stackIn_15_0 = null;
            if (var5 == 0) {
              if (stackIn_15_0 != var4) {
                stackIn_12_0 = var4;
                return stackIn_12_0;
              }
              var3 = (uj) (var2.b(param0 - 12496));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = null;
          }
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "vk.T(" + param0 + ')');
        }
    }

    uj h(int param0) {
        ba var2 = null;
        uj var3 = null;
        uj stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          var2 = new ba(this.field_u);
          var3 = (uj) (var2.a(param0 ^ param0));
          while (true) {
            if (null == var3) {
              stackIn_9_0 = null;
              return (uj) (stackIn_9_0);
            }
            if (!var3.d(true)) {
              var3 = (uj) (var2.b(114));
              continue;
            }
            break;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "vk.IA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        ba var7 = null;
        uj var8 = null;
        int var9 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var9 = StarCannon.field_A;
        try {
          var7 = new ba(this.field_u);
          var8 = (uj) (var7.a(param4 ^ -22));
          L1: while (true) {
            if (null != var8) {
              stackOut_3_0 = var8.a((byte) 24);
              stackIn_9_0 = stackOut_3_0 ? 1 : 0;
              stackIn_4_0 = stackOut_3_0;
              if (var9 != 0) {
                break L1;
              }
              if (stackIn_4_0) {
                var8.a(param0, param1 + this.field_j, param2 + this.field_s, param3, (byte) -22, param5);
                var8 = (uj) (var7.b(param4 + 142));
                continue;
              }
            }
            stackIn_9_0 = param4;
            break;
          }
          if (stackIn_9_0 != -22) {
            field_v = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("vk.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean b(int param0, uj param1) {
        int var3_int = 0;
        ba var4 = null;
        uj var5 = null;
        ba var6 = null;
        uj var7 = null;
        int var8 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0;
        boolean stackOut_14_0;
        RuntimeException var3 = null;
        var8 = StarCannon.field_A;
        try {
          var3_int = 96 / ((param0 + 61) / 35);
          if (this.field_u.a(true)) {
            return false;
          }
          var4 = new ba(this.field_u);
          var5 = (uj) (var4.a(false));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 == null))) {
            stackOut_8_0 = var5.d(true);
            stackIn_24_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (var8 == 0) {
              if (stackIn_9_0) {
                var6 = new ba(this.field_u);
                var6.a(0, var5);
                var7 = (uj) (var6.a((byte) -34));
                while (var7 != null) {
                  stackOut_14_0 = var7.a(0, param1);
                  stackIn_24_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (stackIn_15_0) {
                    return true;
                  }
                  var7 = (uj) (var6.a((byte) -34));
                }
              }
              var5 = (uj) (var4.a((byte) -34));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_24_0 = false;
          }
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("vk.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final int c(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ba var3 = null;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = StarCannon.field_A;
        try {
          var2_int = 0;
          var3 = new ba(this.field_u);
          var4 = (uj) (var3.a(0));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            var5 = var4.c(false);
            stackIn_10_0 = ~var2_int;
            if (var6 == 0) {
              if (stackIn_10_0 > ~var5) {
                var2_int = var5;
              }
              var4 = (uj) (var3.b(80));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = param0 ? 1 : 0;
          }
          if (stackIn_10_0 != 0) {
            field_v = (String) null;
          }
          stackIn_14_0 = var2_int;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "vk.HB(" + param0 + ')');
        }
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        ba var8 = null;
        RuntimeException var8_ref = null;
        uj var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var10 = StarCannon.field_A;
        try {
          var8 = new ba(this.field_u);
          if (param4 != -11) {
            field_v = (String) null;
          }
          var9 = (uj) (var8.a(param4 ^ -11));
          L2: while (true) {
            if (null != var9) {
              stackOut_6_0 = var9.a((byte) 120);
              stackIn_17_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var10 != 0) {
                break L2;
              }
              if (stackIn_7_0) {
                if (var9.a(param0, param1, param2 + this.field_s, param3 + this.field_j, (byte) -11, param5, param6)) {
                  return true;
                }
                var9 = (uj) (var8.b(68));
                continue;
              }
            }
            stackIn_17_0 = false;
            break;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_21_0 = var8_ref;
          stackIn_21_1 = new StringBuilder().append("vk.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        ba var5 = null;
        RuntimeException var5_ref = null;
        uj var6_ref_uj = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_22_0 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var7 = StarCannon.field_A;
        try {
          var5 = new ba(this.field_u);
          if (param2 != -90) {
            field_x = (String) null;
          }
          var6_ref_uj = (uj) (var5.a(param2 + 90));
          L2: while (true) {
            if (null != var6_ref_uj) {
              stackOut_6_0 = var6_ref_uj.a((byte) 64);
              stackIn_22_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var7 != 0) {
                break L2;
              }
              if (stackIn_7_0) {
                if (var6_ref_uj.d(true) &&
                  var6_ref_uj.a(param0, param1, (byte) -90, param3)) {
                  return true;
                }
                var6_ref_uj = (uj) (var5.b(97));
                continue;
              }
            }
            stackIn_22_0 = param3;
            break;
          }
          var6 = stackIn_22_0;
          if (var6 != 80) {
            return false;
          }
          if (!wc.field_c[81]) {
            stackIn_29_0 = this.a((byte) -103, param0);
          } else {
            stackIn_29_0 = this.b(-110, param0);
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_35_0 = var5_ref;
          stackIn_35_1 = new StringBuilder().append("vk.EA(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ia var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        ld var6 = null;
        String var6_ref = null;
        String var7 = null;
        ld var7_ref = null;
        String var8 = null;
        ld var8_ref = null;
        int var9 = 0;
        Object var4Lifetime1;
        String var5_ref_StringLifetime1;
        var9 = StarCannon.field_A;
        try {
          var1 = se.field_p;
          var3 = 82 / ((-41 - param0) / 54);
          var2 = var1.j(7909);
          if (var2 == 0) {
            if (td.field_o == null) {
              td.field_o = new ai(128);
              hi.field_b = 0;
            }
            stackIn_11_0 = (1 != var1.j(7909)) ? 0 : 1;
            var4_int = stackIn_11_0;
            var5_ref_String = var1.a(-120);
            if (var4_int != 0) {
              var1.a(-71);
            }
            var6 = wk.a(var5_ref_String, 92);
            var7 = var1.a(-79);
            var8 = ni.a(126, (CharSequence) ((Object) var5_ref_String));
            if (var8 == null) {
              var8 = var5_ref_String;
            }
            if (var6 == null) {
              var6 = wk.a(var7, 89);
              if (var6 != null) {
                td.field_o.a(2, (long)var8.hashCode(), var6);
              }
            }
            if (null == var6) {
              var6 = new ld();
              td.field_o.a(2, (long)var8.hashCode(), var6);
              fieldTemp$0 = hi.field_b;
              hi.field_b = hi.field_b + 1;
              var6.field_hb = fieldTemp$0;
              ma.field_c.b(122, var6);
            }
            var6.field_kb = var5_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (1 == bd.field_f) {
                bd.field_f = 2;
              }
              return;
            }
            if (3 == var2) {
              if (bd.field_f == 2) {
                bd.field_f = 1;
              }
              return;
            }
            if (var2 != 4) {
              hc.a((Throwable) null, "F1: " + oe.a(73), (byte) 106);
              ec.a((byte) 27);
              return;
            }
            bd.field_f = 1;
            var4 = var1.a(-72);
            wg.field_a = ((String) (var4)).intern();
            var5 = var1.j(7909);
            ej.b(true, var5);
            return;
          }
          if (m.field_d == null) {
            m.field_d = new ai(128);
            ec.field_b = 0;
          }
          var4Lifetime1 = var1.a(-42);
          if (((String) (var4Lifetime1)).equals("")) {
            var4Lifetime1 = null;
          }
          var5_ref_StringLifetime1 = var1.a(-39);
          var6_ref = var1.a(-107);
          var7_ref = hg.a(120, var5_ref_StringLifetime1);
          if (var7_ref == null) {
            var7_ref = hg.a(120, var6_ref);
            if (null != var7_ref) {
              m.field_d.a(2, (long)ni.a(107, (CharSequence) ((Object) var5_ref_StringLifetime1)).hashCode(), var7_ref);
            }
          }
          if (null == var7_ref) {
            var7_ref = new ld();
            m.field_d.a(2, (long)ni.a(113, (CharSequence) ((Object) var5_ref_StringLifetime1)).hashCode(), var7_ref);
            fieldTemp$1 = ec.field_b;
            ec.field_b = ec.field_b + 1;
            var7_ref.field_hb = fieldTemp$1;
            ti.field_a.b(121, var7_ref);
          }
          if (null != var4Lifetime1) {
            var4Lifetime1 = ((String) (var4Lifetime1)).intern();
          }
          var7_ref.field_gb = (String) (var4Lifetime1);
          var7_ref.field_kb = var5_ref_StringLifetime1;
          var7_ref.b(4);
          var8_ref = (ld) (ti.field_a.c(-3905));
          while (var8_ref != null) {
            if (ff.a(80, var7_ref, var8_ref)) {
              var8_ref = (ld) (ti.field_a.a(-16913));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (null == var8_ref) {
            ti.field_a.b(66, var7_ref);
            if (var9 == 0) {
              return;
            }
          }
          fe.a(var8_ref, var7_ref, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "vk.GB(" + param0 + ')');
        }
    }

    final void a(boolean param0, uj param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0) {
            field_w = (String) null;
          }
          this.field_u.b(91, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vk.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    vk(int param0, int param1, int param2, int param3, de param4) {
        super(param0, param1, param2, param3, param4, (qg) null);
        this.field_u = new rk();
    }

    static {
        field_x = "Unfortunately we are unable to create an account for you at this time.";
        field_t = "OVER <%0>";
        field_w = "LIVES:";
    }
}
