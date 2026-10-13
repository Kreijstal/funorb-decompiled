/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ib extends oc implements sd {
    static int[] field_D;
    static RgbSprite field_E;
    static String field_F;
    static String field_C;
    NodeDeque field_G;

    final boolean a(oc param0, byte param1) {
        NodeDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        oc var4 = null;
        NodeDequeCursor var5 = null;
        oc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_G.isEmpty(false)) {
            return false;
          }
          var3 = new NodeDequeCursor(this.field_G);
          if (param1 > -115) {
            return false;
          }
          var4 = (oc) (var3.first(240));
          while (var4 != null) {
            if (var4.f(-128)) {
              var5 = new NodeDequeCursor(this.field_G);
              var5.firstFrom(122, var4);
              var6 = (oc) (var5.next(7));
              while (var6 != null) {
                if (!var6.a(true, param0)) {
                  var6 = (oc) (var5.next(7));
                  continue;
                }
                return true;
              }
            }
            var4 = (oc) (var3.next(7));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("ib.FB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(oc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDequeCursor var4 = null;
        oc var5 = null;
        NodeDequeCursor var6 = null;
        oc var7 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = -60 % ((param1 - 51) / 34);
          if (this.field_G.isEmpty(false)) {
            return false;
          }
          var4 = new NodeDequeCursor(this.field_G);
          var5 = (oc) (var4.last(true));
          while (var5 != null) {
            if (var5.f(-57)) {
              var6 = new NodeDequeCursor(this.field_G);
              var6.lastFrom(16802, var5);
              var7 = (oc) (var6.previous(-24706));
              while (var7 != null) {
                if (var7.a(true, param0)) {
                  return true;
                }
                var7 = (oc) (var6.previous(-24706));
              }
            }
            var5 = (oc) (var4.previous(-24706));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ib.JB(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 == 0 &&
          this.field_l != null) {
          this.field_l.a(true, param3 - 20607, param1, (oc) (this), param0);
        }
        NodeDequeCursor var5 = new NodeDequeCursor(this.field_G);
        if (param3 != -11) {
          this.field_G = (NodeDeque) null;
        }
        oc var6 = (oc) (var5.last(true));
        while (var6 != null) {
          var6.a(this.field_w + param0, this.field_o + param1, param2, (byte) -11);
          var6 = (oc) (var5.previous(param3 - 24695));
        }
    }

    final void a(oc param0, boolean param1) {
        try {
          this.field_G.addLast(param0, (byte) 3);
          if (!param1) {
            field_F = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ib.IB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        NodeDequeCursor var2 = new NodeDequeCursor(this.field_G);
        int var3 = -77 % ((param0 - 69) / 46);
        oc var4 = (oc) (var2.first(240));
        while (var4 != null) {
          var4.e(1);
          var4 = (oc) (var2.next(7));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, oc param5, int param6) {
        NodeDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        oc var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var8 = new NodeDequeCursor(this.field_G);
          var9 = (oc) (var8.first(240));
          while (var9 != null) {
            if (var9.isLinked(0)) {
              if (var9.f(-65) &&
                var9.a(param0, param1, param2, -126, param4, param5, param6)) {
                return true;
              }
              var9 = (oc) (var8.next(7));
              continue;
            }
            break;
          }
          if (param3 < -125) {
            return false;
          }
          this.field_G = (NodeDeque) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ib.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_F = null;
        int var1 = -92 / ((param0 + 2) / 38);
        field_D = null;
        field_C = null;
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        NodeDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        oc var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var8 = new NodeDequeCursor(this.field_G);
          if (param6 != 0) {
            return true;
          }
          var9 = (oc) (var8.first(240));
          while (var9 != null) {
            if (var9.isLinked(param6 ^ 0)) {
              if (!var9.a(param0, param1, param2 + this.field_o, this.field_w + param3, param4, param5, 0)) {
                var9 = (oc) (var8.next(7));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_15_0 = var8_ref;
          stackIn_15_1 = new StringBuilder().append("ib.MA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        NodeDequeCursor var7 = null;
        oc var8 = null;
        int var9 = 0;
        StringBuilder var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var7 = new NodeDequeCursor(this.field_G);
          var8 = (oc) (var7.first(240));
          if (param4 != 19223) {
            var10 = (StringBuilder) null;
            this.a(-102, (Hashtable) null, 23, (StringBuilder) null);
          }
          while (var8 != null) {
            if (var8.isLinked(0)) {
              var8.a(param0, param1, param2 + this.field_w, param3, 19223, param5 + this.field_o);
              var8 = (oc) (var7.next(7));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("ib.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 8; var2_int++) {
            if (param0[var2_int] != 0) {
              return true;
            }
          }
          if (param1 != -1) {
            ib.a(89, false, 71, 122, false, 9, -88);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ib.KB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(StringBuilder param0, int param1, byte param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        NodeDequeCursor var5 = null;
        oc var6 = null;
        int var8 = 0;
        oc var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = new NodeDequeCursor(this.field_G);
          var6 = (oc) (var5.first(240));
          while (var6 != null) {
            discarded$2 = param0.append('\n');
            for (var7 = 0; param1 >= var7; var7++) {
              discarded$3 = param0.append(' ');
            }
            var6.a(param1 + 1, param3, 24, param0);
            var6 = (oc) (var5.next(7));
          }
          if (param2 <= 52) {
            var9 = (oc) null;
            this.a((oc) null, (byte) -19);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ib.MB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7;
        int var8;
        int var9_int;
        RgbSprite var9;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var7 = 0;
        param3 = (1414 + param3) % 1414;
        var8 = 0;
        if (284 >= param3) {
          var8 = 5;
          var7 = 11 + param3;
        }
        param3 -= 284;
        if (param3 > 0 &&
          param3 <= 5) {
          var9_int = 2048 * param3 / 5;
          var7 = 295 + (3 * InteractiveGameClient.sine8192(var9_int, -4097) >> 16);
          var8 = -(3 * BrickABrac.c(2048, var9_int) >> 16) + 8;
        }
        if (param1) {
          return;
        }
        param3 -= 5;
        if (param3 > 0 &&
          param3 <= 413) {
          var7 = 298;
          var8 = param3 + 8;
        }
        param3 -= 413;
        if (param3 > 0 &&
          param3 <= 5) {
          var9_intLifetime1 = param3 * 2048 / 5;
          var7 = 295 + (3 * BrickABrac.c(2048, var9_intLifetime1) >> 16);
          var8 = (InteractiveGameClient.sine8192(var9_intLifetime1, -4097) * 3 >> 16) + 421;
        }
        param3 -= 5;
        if (0 < param3 &&
          param3 <= 284) {
          var7 = 295 - param3;
          var8 = 424;
        }
        param3 -= 284;
        if (0 < param3 &&
          param3 <= 5) {
          var9_intLifetime2 = param3 * 2048 / 5;
          var7 = -(3 * InteractiveGameClient.sine8192(var9_intLifetime2, -4097) >> 16) + 11;
          var8 = 421 + (BrickABrac.c(2048, var9_intLifetime2) * 3 >> 16);
        }
        param3 -= 5;
        if (param3 > 0 &&
          param3 <= 413) {
          var7 = 8;
          var8 = 421 - param3;
        }
        param3 -= 413;
        if (param3 > 0) {
          var9_intLifetime3 = 2048 * param3 / 5;
          var7 = 11 - (3 * BrickABrac.c(2048, var9_intLifetime3) >> 16);
          var8 = 8 - (InteractiveGameClient.sine8192(var9_intLifetime3, -4097) * 3 >> 16);
        }
        var9 = tf.field_g[param0];
        param6 = param6 + (-(var9.canvasWidth / 2) + var7);
        param5 = param5 + (-(var9.canvasHeight / 2) + var8);
        if (param4) {
          SoftwareFramebuffer.a(-111, param5, param6, lk.field_n[param0]);
          BoundedFile.field_a[param0].f(param6, param5, 256);
        }
        var9.drawTransparent(param6, param5);
        return;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2 + 1595637968, param0, param1)) {
            this.a(param1, param0, 0, param3);
            this.a(param3, param0, (byte) 104, param1);
          }
          if (param2 != 24) {
            this.field_G = (NodeDeque) null;
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ib.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (param0 > -49) {
          this.g(4);
        }
        return this.g((byte) -3) != null ? true : false;
    }

    ib(int param0, int param1, int param2, int param3, ub param4) {
        super(param0, param1, param2, param3, param4, (uh) null);
        this.field_G = new NodeDeque();
    }

    oc g(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        NodeDequeCursor var2 = new NodeDequeCursor(this.field_G);
        oc var3 = (oc) (var2.first(240));
        while (var3 != null) {
          if (var3.f(-83)) {
            return var3;
          }
          var3 = (oc) (var2.next(7));
        }
        if (param0 == -3) {
          return null;
        }
        oc var5 = (oc) null;
        this.a((oc) null, (byte) -16, -70, 95);
        return null;
    }

    String d(int param0) {
        NodeDequeCursor var2;
        oc var3;
        String var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = new NodeDequeCursor(this.field_G);
        if (param0 < 6) {
          return (String) null;
        }
        var3 = (oc) (var2.first(240));
        while (var3 != null) {
          var4 = var3.d(37);
          if (var4 != null) {
            return var4;
          }
          var3 = (oc) (var2.next(7));
        }
        return null;
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        oc var9 = null;
        NodeDequeCursor var10 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var10 = new NodeDequeCursor(this.field_G);
          var9 = (oc) (var10.first(param1 + 130));
          while (var9 != null) {
            if (var9.isLinked(0)) {
              if (var9.f(-118) &&
                var9.a(param0, (byte) 110, param2, param3)) {
                return true;
              }
              var9 = (oc) (var10.next(param1 ^ 105));
              continue;
            }
            break;
          }
          if (param1 != 110) {
            var8 = (StringBuilder) null;
            this.a(87, (Hashtable) null, -4, (StringBuilder) null);
          }
          var6 = param0;
          if (var6 != 80) {
            return false;
          }
          if (IntArrayRequest.heldKeys[81]) {
            stackIn_17_0 = this.b(param2, (byte) -118);
          } else {
            stackIn_17_0 = this.a(param2, (byte) -128);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ib.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0) {
          ib.f((byte) 29);
        }
        NodeDequeCursor var2 = new NodeDequeCursor(this.field_G);
        oc var3 = (oc) (var2.first(240));
        while (var3 != null) {
          var3.b(false);
          var3 = (oc) (var2.next(7));
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(116);
    }

    final int e(byte param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = -70 % ((-17 - param0) / 43);
        int var2 = 0;
        NodeDequeCursor var4 = new NodeDequeCursor(this.field_G);
        oc var5 = (oc) (var4.first(240));
        while (var5 != null) {
          var6 = var5.e((byte) -86);
          if (var6 > var2) {
            var2 = var6;
          }
          var5 = (oc) (var4.next(7));
        }
        return var2;
    }

    final boolean a(boolean param0, oc param1) {
        NodeDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        oc var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = new NodeDequeCursor(this.field_G);
          if (!param0) {
            return true;
          }
          var4 = (oc) (var3.first(240));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, param1)) {
              var4 = (oc) (var3.next(7));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ib.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    void a(oc param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        NodeDequeCursor var5 = null;
        oc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new NodeDequeCursor(this.field_G);
          var6 = (oc) (var5.first(240));
          while (var6 != null) {
            if (var6.isLinked(param1 + 0)) {
              var6.a(param0, (byte) 0, this.field_o + param2, this.field_w + param3);
              var6 = (oc) (var5.next(7));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ib.WA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_C = "You have 1 unread message!";
        field_F = "Loading graphics";
    }
}
