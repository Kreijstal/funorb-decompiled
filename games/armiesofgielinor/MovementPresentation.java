/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MovementPresentation implements EventPresentation {
    private int[] pathDirections;
    private int pathLength;
    private int field_f;
    private int[] field_k;
    private int elapsedFrames;
    private int[] field_m;
    private int field_a;
    private int[] field_g;
    private int[] field_c;
    private int[] field_b;
    private int[] field_n;
    private Battlefield battlefield;
    private int pathIndex;
    private int[] field_e;
    private int[] field_d;
    private BattleCamera camera;
    private EventPresenter presenter;
    static char[] field_i;
    private int field_t;
    static h field_l;
    private int durationFrames;
    static int[] field_j;
    static String field_r;

    public final boolean isCombatViewReady(byte obfuscationGuard) {
        if (obfuscationGuard >= -25) {
          return true;
        }
        return false;
    }

    private final void h(int param0) {
        if (this.presenter.event.eventKind != 7) {
          this.field_f = nu.field_z[ek.field_d];
        } else {
          this.field_f = 50;
        }
        if (param0 != -7432) {
          return;
        }
        this.durationFrames = this.pathLength * this.field_f;
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte[] param4, int param5) {
        CipherPacketBuffer var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var6 = vl.field_n;
          var6.writeCipheredOpcode(32161, param0);
          var6.position = var6.position + 1;
          if (param5 != 5623) {
            field_i = (char[]) null;
          }
          var7 = var6.position;
          var6.writeByte(1, 4);
          var6.writeByte(1, param1);
          var8 = param2;
          if (param3) {
            var8 += 128;
          }
          var6.writeByte(1, var8);
          var6.a(param4, 0, param4.length, 102);
          var6.e(var6.position - var7, 5930);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "qv.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public final boolean initialize(GameEvent event, byte obfuscationGuard) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int[] var7 = null;
        MoveEvent var8 = null;
        String var9 = null;
        ParasiteEvent var10 = null;
        String var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var17 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 57) {
            this.elapsedFrames = 46;
          }
          this.elapsedFrames = 0;
          if (event.eventKind != 0) {
            if (7 == event.eventKind) {
              var10 = (ParasiteEvent) (event);
              var4 = var10.sourceX + var10.sourceY * this.field_t;
              var10.unit = this.battlefield.getUnitAt(var10.sourceY, true, var10.sourceX);
              if (null == var10.unit) {
                var11 = Battlefield.field_q + ": Can see parasite";
                this.battlefield.a(0, var11, event);
                return false;
              }
              var14 = new int[1];
              var12 = var14;
              var7 = var12;
              var17 = var7;
              if (var10.destinationX - var10.sourceX == 0) {
                if (0 < var10.destinationY - var10.sourceY) {
                  var17[0] = 2;
                } else {
                  var17[0] = 1;
                }
              } else {
                if (-var10.sourceX + var10.destinationX > 0) {
                  var17[0] = 0;
                } else {
                  var14[0] = 3;
                }
              }
              var10.a(var10.unit, obfuscationGuard - 45);
              this.a(var17, true, var4);
              this.advanceFrame(var10, (byte) -94);
            }
          } else {
            var8 = (MoveEvent) (event);
            var4 = this.field_t * var8.startY + var8.startX;
            this.a(var8.pathDirections, true, var4);
            if (null == var8.unit) {
              var8.unit = this.battlefield.getUnitAt(var8.startY, true, var8.startX);
            }
            if (var8.unit == null) {
              var9 = Battlefield.field_q + ": Can see start";
              this.battlefield.a(0, var9, event);
              return false;
            }
            if (var8.unit.packedFlag256) {
              var8.unit = var8.unit.copyDetached(false);
              hs.b(-90, 29);
            }
            var8.unit.field_z = 1;
            var8.a(var8.unit, 12);
            this.advanceFrame(var8, (byte) 58);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("qv.E(");
          if (event == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var4 = 0;
        String[][][] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        String[][][] var8 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var8 = wh.a(117);
          var1 = var8;
          var2 = var8.length;
          if (sf.field_P.length < var2) {
            var2 = sf.field_P.length;
          }
          var3 = fd.field_n[0].length;
          BestScoreStrategy.field_j = new int[var2][var3][];
          if (param0 != -11757) {
            return;
          }
          for (var4 = 0; var4 < var2; var4++) {
            var5 = sf.field_P[var4];
            var6 = jq.field_I[var5];
            PreparedAction.a(var8[var4], var6, var4, 2378077);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1_ref), "qv.P(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        this.field_e[0] = this.field_d[0];
        this.field_e[1] = this.field_d[1];
        if (0 >= this.pathLength) {
          return;
        }
        int var2 = this.pathDirections[0];
        this.field_k[1] = 0;
        this.field_k[0] = 0;
        this.a(var2, 96);
        if (param0 <= 24) {
          return;
        }
        this.field_n[1] = this.field_e[1] + this.field_k[1];
        this.field_n[0] = this.field_k[0] + this.field_e[0];
    }

    public final void drawOverlayLayer(byte obfuscationGuard) {
        if (obfuscationGuard != -52) {
          MovementPresentation.c(101);
        }
    }

    private final boolean a(boolean param0) {
        if (param0) {
          this.field_b = (int[]) null;
        }
        int var2 = this.elapsedFrames / this.field_f;
        this.field_a = (-(this.field_f * this.pathIndex) + this.elapsedFrames << 8) / this.field_f;
        if (var2 == this.pathIndex) {
          return false;
        }
        if (this.pathIndex + 1 == var2) {
          this.pathIndex = var2;
          this.field_e[1] = this.field_n[1];
          this.field_e[0] = this.field_n[0];
          this.field_k[1] = 0;
          this.field_k[0] = 0;
          this.field_a = (-(this.field_f * this.pathIndex) + this.elapsedFrames << 8) / this.field_f;
          this.a(this.pathDirections[this.pathIndex], 126);
          this.field_n[0] = this.field_e[0] + this.field_k[0];
          this.field_n[1] = this.field_k[1] + this.field_e[1];
          return true;
        }
        this.i(-14628);
        this.pathIndex = var2;
        this.field_a = (-(this.field_f * this.pathIndex) + this.elapsedFrames << 8) / this.field_f;
        return true;
    }

    private final void a(int param0, int param1) {
        if (param0 == 1) {
          this.field_k[1] = -1;
        }
        if (0 == param0) {
          this.field_k[0] = 1;
        }
        int var3 = 86 / ((28 - param1) / 55);
        if (param0 == 2) {
          this.field_k[1] = 1;
        }
        if (param0 == 3) {
          this.field_k[0] = -1;
        }
    }

    public final void drawBaseLayer(byte obfuscationGuard) {
        if (obfuscationGuard >= -119) {
          this.drawOverlayLayer((byte) 114);
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        ContextualRuntimeException var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var11Lifetime5Lifetime1;
        String var11Lifetime5Lifetime2;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!(param1 instanceof ContextualRuntimeException)) {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11Lifetime6 = var2;
        } else {
          var14 = (ContextualRuntimeException) ((Object) param1);
          param1 = var14.originalCause;
          var2 = var14.context + " | ";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        if (param0 != 0) {
          field_i = (char[]) null;
        }
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var11Lifetime3 = var7;
        var2Lifetime2 = var11Lifetime3;
        var11Lifetime4 = var7;
        while (true) {
          var8 = var6.readLine();
          var11Lifetime5 = var8;
          var2Lifetime3 = var11Lifetime5;
          var11Lifetime5Lifetime1 = var8;
          if (var8 == null) {
            var2Lifetime3 = var2Lifetime3 + "| " + var7;
            return var2Lifetime3;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', var9 + 1);
          if (var9 != -1) {
            var11Lifetime5Lifetime2 = var8.substring(0, var9);
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
            var2Lifetime3Lifetime1 = var11Lifetime5Lifetime2;
          } else {
            var11Lifetime5Lifetime2 = var8;
          }
          var16 = var11Lifetime5Lifetime2.trim();
          var2Lifetime3Lifetime2 = var16;
          var2Lifetime3Lifetime3 = var16;
          var17 = var16.substring(var16.lastIndexOf(' ') + 1);
          var2Lifetime3Lifetime4 = var17;
          var2Lifetime3Lifetime5 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf('\t'));
          var2Lifetime3Lifetime6 = var18;
          var2Lifetime3Lifetime7 = var18;
          var19 = var2Lifetime3Lifetime7 + var18;
          var2Lifetime3Lifetime8 = var19;
          var2Lifetime3Lifetime9 = var19;
          var2Lifetime3Lifetime10 = var19;
          if (-1 != var9 &&
            var10 != -1) {
            var12 = var8.indexOf(".java:", var9);
            if (0 <= var12) {
              var2Lifetime3Lifetime10 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime10 = var2Lifetime3Lifetime10 + ' ';
        }
    }

    private final int e(byte param0) {
        if (this.pathDirections == null ||
          this.pathDirections.length < 1) {
          return -1;
        }
        int var2 = this.pathDirections[this.pathIndex];
        int var3 = 1792;
        if (1 == var2) {
          var3 -= 1024;
        }
        if (param0 != -69) {
          this.field_d = (int[]) null;
        }
        if (var2 == 0) {
          var3 -= 512;
        }
        if (var2 == 2) {
          var3 += 0;
        }
        if (var2 == 3) {
          var3 -= 1536;
        }
        return var3;
    }

    private final void e(int param0) {
        int var2 = this.field_m[0] - this.field_c[0];
        var2 = this.field_a * var2 >> 8;
        int var3 = this.field_m[1] - this.field_c[param0];
        this.field_b[0] = var2 + this.field_c[0];
        var3 = this.field_a * var3 >> 8;
        this.field_b[1] = var3 + this.field_c[1];
    }

    public final void requestFinish(int obfuscationGuard) {
        if (obfuscationGuard < 94) {
          this.field_g = (int[]) null;
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_n[0] = this.field_d[0];
        this.field_n[1] = this.field_d[1];
        this.field_k[0] = 0;
        this.field_k[1] = 0;
        if (param0 != -14628) {
          this.e(87);
        }
        for (var2 = 0; var2 <= this.pathIndex; var2++) {
          this.a(this.pathDirections[this.pathIndex], 104);
          this.field_n[0] = this.field_n[0] + this.field_k[0];
          this.field_n[1] = this.field_n[1] + this.field_k[1];
        }
        this.field_e[0] = this.field_n[0] - this.field_k[0];
        this.field_e[1] = -this.field_k[1] + this.field_n[1];
    }

    private final void f(byte param0) {
        this.pathIndex = this.pathLength - 1;
        this.i(-14628);
        if (param0 > -79) {
          this.field_k = (int[]) null;
        }
        this.field_g[0] = this.field_n[0];
        this.field_g[1] = this.field_n[1];
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 <= 3) {
          return;
        }
        field_l = null;
        field_j = null;
        field_i = null;
    }

    public final boolean isFinished(int obfuscationGuard) {
        if (obfuscationGuard != 8865) {
          this.field_d = (int[]) null;
        }
        return this.durationFrames <= this.elapsedFrames ? true : false;
    }

    private final void a(boolean param0, GameEvent param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.presenter.tileIndex = this.f(-4923);
          if (!param0) {
            MovementPresentation.j(101);
          }
          var3_int = 0;
          var4 = 0;
          if (this.presenter.tileIndex != -1) {
            if (this.presenter.tileIndex == -2) {
              var3_int = this.field_n[0];
              var4 = this.field_n[1];
            }
          } else {
            var3_int = this.field_e[0];
            var4 = this.field_e[1];
          }
          this.presenter.tileIndex = var4 * this.field_t + var3_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qv.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -11) {
          return false;
        }
        stackIn_7_0 = (p.field_b >= 10) && (!bl.field_b) && (!TeamRoster.a(-103));
        return stackIn_7_0;
    }

    MovementPresentation(Battlefield battlefield, BattleCamera camera, EventPresenter presenter) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_n = new int[2];
          this.field_c = new int[2];
          this.battlefield = battlefield;
          this.field_m = new int[2];
          this.camera = camera;
          this.field_t = battlefield.mapWidth;
          this.presenter = presenter;
          this.field_b = new int[2];
          this.field_g = new int[2];
          this.field_e = new int[2];
          this.field_d = new int[2];
          this.field_k = new int[2];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("qv.<init>(");
          if (battlefield == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (camera == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (presenter == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.pathDirections = param0;
          this.pathLength = this.pathDirections.length;
          this.field_d[1] = param2 / this.field_t;
          this.field_d[0] = -(this.field_d[1] * this.field_t) + param2;
          this.f((byte) -116);
          this.h(-7432);
          this.pathIndex = 0;
          if (!param1) {
            return;
          }
          this.d((byte) 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qv.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void advanceFrame(GameEvent event, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Unit var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(false)) {
            dh.a(event.unit.unitType, 0, 32);
          }
          if (event == null) {
            return;
          }
          this.a(true, event);
          this.d(22);
          this.e(1);
          this.presenter.screenX = this.field_b[0];
          this.presenter.screenY = this.field_b[1];
          var3_int = this.e((byte) -69);
          var4 = event.unit;
          if (event.eventKind != 7) {
            var4.field_z = 1;
          } else {
            var4.field_z = 5;
          }
          this.presenter.field_u.a(1 + this.presenter.screenX, -35, this.presenter.screenY - 6, var3_int, var4);
          var5 = 115 / ((obfuscationGuard + 26) / 48);
          this.elapsedFrames = this.elapsedFrames + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qv.Q(");
          if (event == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final int f(int param0) {
        int var2;
        int var3;
        if (null != this.pathDirections &&
          1 <= this.pathDirections.length) {
          var2 = this.pathDirections[this.pathIndex];
          if (param0 != -4923) {
            return -113;
          }
          var3 = -1;
          if (var2 == 1) {
            var3 = -1;
          }
          if (var2 == 0) {
            var3 = -1;
          }
          if (2 == var2) {
            var3 = -2;
          }
          if (3 == var2) {
            var3 = -2;
          }
          return var3;
        }
        return -1;
    }

    private final void d(int param0) {
        if (param0 <= 12) {
          this.presenter = (EventPresenter) null;
        }
        this.camera.field_c[1] = this.field_e[1];
        this.camera.field_c[0] = this.field_e[0];
        this.camera.f(-88);
        this.camera.i(0);
        this.field_c[1] = this.camera.field_e[1];
        this.field_c[0] = this.camera.field_e[0];
        this.camera.field_c[1] = this.field_n[1];
        this.camera.field_c[0] = this.field_n[0];
        this.camera.f(-54);
        this.camera.i(0);
        this.field_m[0] = this.camera.field_e[0];
        this.field_m[1] = this.camera.field_e[1];
    }

    static {
        field_i = new char[]{(char)91, (char)93, (char)35};
        field_l = new h(0);
        field_r = "This item can only be used on enemy units.";
    }
}
