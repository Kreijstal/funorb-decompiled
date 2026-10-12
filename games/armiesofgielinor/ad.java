/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends tj implements he {
    private ro field_L;
    private BitmapFont field_J;
    static gu field_K;
    private String field_G;
    private int field_E;
    private int[] field_F;
    private fw[] field_H;
    static String field_I;

    final fw a(String param0, qo param1, byte param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fw(param0, param1);
          var4.painter = (WidgetPainter) ((Object) new nu());
          var5 = this.height - 2;
          var6 = -98 / ((24 - param2) / 44);
          this.setBounds(0, this.width, 0, 8192, this.height + 34);
          var4.setBounds(7, this.width - 14, var5, 8192, 30);
          this.a((byte) 10, (Widget) (var4));
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ad.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_E >= param0) {
          return;
        }
        int var4 = -57 % ((44 - param1) / 34);
        fw[] var8 = new fw[param0];
        fw[] var3 = var8;
        int[] var5 = new int[param0];
        for (var6 = 0; var6 < this.field_E; var6++) {
          var8[var6] = this.field_H[var6];
          var5[var6] = this.field_F[var6];
        }
        this.field_H = var3;
        this.field_E = param0;
        this.field_F = var5;
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 != 63) {
          field_I = (String) null;
        }
        field_I = null;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var6_int = 0; this.field_E > var6_int; var6_int++) {
            if (this.field_H[var6_int] == param4) {
              var7 = this.field_F[var6_int];
              if (var7 != -1) {
                gl.a(123, this.field_F[var6_int]);
                break;
              }
              this.field_L.b(true);
              break;
            }
          }
          if (param1 != 11) {
            this.field_F = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ad.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    ad(ro param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int var4_int = 0;
        this.field_E = 0;
        try {
          this.field_G = param2;
          this.field_L = param0;
          this.field_J = param1;
          var4_int = this.field_G != null ? this.field_J.getParagraphHeight(this.field_G, 260, this.field_J.field_H) : 0;
          this.setBounds(0, 288, 0, 8192, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -123, param3);
        this.field_J.a(this.field_G, 14 + param0 + this.x, this.y + param1 + 10, -28 + this.width, this.height, 16777215, -1, 0, 0, this.field_J.field_H);
        if (param2 > -82) {
          ad.a((byte) 73);
        }
    }

    final static void advanceLobbyNotifications(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        LobbyPlayer var1 = null;
        LobbyRoom var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        LobbyPlayer var1Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.first((byte) 97));
          while (var1 != null) {
            if (0 < var1.notificationTicks) {
              var1.notificationTicks = var1.notificationTicks - 1;
              if (var1.notificationTicks == 0) {
                var1.notificationCode = 0;
                if (var1.isRemovedFromIndex(0)) {
                  var1.unlink(-126);
                }
              }
            }
            var1 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.next((byte) 123));
          }
          var1_ref = (LobbyRoom) (qc.lobbyRoomOrder.first((byte) 89));
          while (var1_ref != null) {
            if (0 < var1_ref.notificationTicks) {
              var1_ref.notificationTicks = var1_ref.notificationTicks - 1;
              if (var1_ref.notificationTicks == 0) {
                var1_ref.notificationCode = 0;
                if (var1_ref.isRemovedFromIndex(-7)) {
                  var1_ref.unlink(106);
                }
              }
            }
            var1_ref = (LobbyRoom) (qc.lobbyRoomOrder.next((byte) 123));
          }
          var2 = -62 % ((obfuscationGuard + 41) / 60);
          var1Lifetime1 = (LobbyPlayer) (wl.currentRoomPlayers.first((byte) 115));
          while (var1Lifetime1 != null) {
            if (0 < var1Lifetime1.notificationTicks) {
              var1Lifetime1.notificationTicks = var1Lifetime1.notificationTicks - 1;
              if (var1Lifetime1.notificationTicks != 0) {
                var1Lifetime1 = (LobbyPlayer) (wl.currentRoomPlayers.next((byte) 123));
                continue;
              }
              var1Lifetime1.notificationCode = 0;
              if (var1Lifetime1.isRemovedFromIndex(0)) {
                var1Lifetime1.unlink(-123);
              }
            }
            var1Lifetime1 = (LobbyPlayer) (wl.currentRoomPlayers.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref2), "ad.E(" + obfuscationGuard + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_E;
          this.b(var4_int + param2, -104);
          this.field_H[var4_int] = this.a(param0, (qo) (this), (byte) 104);
          this.field_F[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ad.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_K = new gu();
    }
}
