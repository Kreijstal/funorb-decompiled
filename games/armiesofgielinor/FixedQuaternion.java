/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FixedQuaternion {
    static String field_g;
    private int w;
    private int y;
    private int x;
    static String field_c;
    static FullscreenFocusCanvas fullscreenCanvas;
    private int z;

    final static boolean isOnlineFriendOrRoomMember(long accountId, String name, byte obfuscationGuard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        SocialListEntry var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 95 % ((-83 - obfuscationGuard) / 33);
          var5 = lg.findFriend(name, (byte) -34);
          if (var5 != null &&
            var5.locationLabel != null) {
            return true;
          }
          stackIn_8_0 = (ToggleWidget.currentRoom != null) && (null != UnitModelPreview.getCurrentRoomPlayer(accountId, -77));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("wq.H(").append(accountId).append(',');
          if (name == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void copyInto(FixedQuaternion destination, boolean obfuscationGuard) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this;
          if (destination == null) {
            destination = new FixedQuaternion();
          }
          destination.z = ((FixedQuaternion) (var3)).z;
          destination.w = ((FixedQuaternion) (var3)).w;
          if (!obfuscationGuard) {
            FixedQuaternion.a(true, -102, -89, 25, 68, 22, (byte) 122);
          }
          destination.y = ((FixedQuaternion) (var3)).y;
          destination.x = ((FixedQuaternion) (var3)).x;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wq.E(");
          if (destination == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void prependRotation(int obfuscationGuard, FixedQuaternion other) {
        int newW = Spell.multiplyFixed16((long)other.w, (long)this.w, -1700635440) - Spell.multiplyFixed16((long)other.x, (long)this.x, -1700635440) - (Spell.multiplyFixed16((long)other.y, (long)this.y, -1700635440) + Spell.multiplyFixed16((long)other.z, (long)this.z, obfuscationGuard - 1700635441));
        int newX = Spell.multiplyFixed16((long)other.w, (long)this.x, -1700635440) + (Spell.multiplyFixed16((long)other.x, (long)this.w, -1700635440) + Spell.multiplyFixed16((long)other.y, (long)this.z, -1700635440)) - Spell.multiplyFixed16((long)other.z, (long)this.y, -1700635440);
        int newY = Spell.multiplyFixed16((long)other.w, (long)this.y, -1700635440) - Spell.multiplyFixed16((long)other.x, (long)this.z, -1700635440) + (Spell.multiplyFixed16((long)other.y, (long)this.w, -1700635440) + Spell.multiplyFixed16((long)other.z, (long)this.x, -1700635440));
        this.z = Spell.multiplyFixed16((long)other.w, (long)this.z, obfuscationGuard - 1700635441) + Spell.multiplyFixed16((long)other.x, (long)this.y, -1700635440) + (-Spell.multiplyFixed16((long)other.y, (long)this.x, -1700635440) + Spell.multiplyFixed16((long)other.z, (long)this.w, -1700635440));
        if (obfuscationGuard != 1) {
          return;
        }
        try {
          this.w = newW;
          this.y = newY;
          this.x = newX;
          this.normalize(obfuscationGuard ^ 125);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wq.B(" + obfuscationGuard + ',' + (other != null ? "{...}" : "null") + ')');
        }
    }

    final void normalize(int obfuscationGuard) {
        if (obfuscationGuard <= 65) {
          return;
        }
        int squaredMagnitude = Spell.multiplyFixed16((long)this.w, (long)this.w, -1700635440) + Spell.multiplyFixed16((long)this.x, (long)this.x, -1700635440) + (Spell.multiplyFixed16((long)this.y, (long)this.y, -1700635440) + Spell.multiplyFixed16((long)this.z, (long)this.z, -1700635440));
        if (squaredMagnitude < 65535) {
          squaredMagnitude = so.sqrtFixed16(squaredMagnitude, -129);
          this.w = BufferedFile.divideFixed16((long)this.w, (long)squaredMagnitude, (byte) 97);
          this.x = BufferedFile.divideFixed16((long)this.x, (long)squaredMagnitude, (byte) 97);
          this.y = BufferedFile.divideFixed16((long)this.y, (long)squaredMagnitude, (byte) 97);
          this.z = BufferedFile.divideFixed16((long)this.z, (long)squaredMagnitude, (byte) 97);
          return;
        }
        if (squaredMagnitude <= 65537) {
          return;
        }
        squaredMagnitude = so.sqrtFixed16(squaredMagnitude, -129);
        this.w = BufferedFile.divideFixed16((long)this.w, (long)squaredMagnitude, (byte) 97);
        this.x = BufferedFile.divideFixed16((long)this.x, (long)squaredMagnitude, (byte) 97);
        this.y = BufferedFile.divideFixed16((long)this.y, (long)squaredMagnitude, (byte) 97);
        this.z = BufferedFile.divideFixed16((long)this.z, (long)squaredMagnitude, (byte) 97);
    }

    final void setAxisAngle(byte obfuscationGuard, int axisX, int axisZ, int axisY, int angle) {
        angle = angle >> 1;
        int var6 = CombatViewTransition.c(angle, 125);
        int var7 = MoveAttackAction.a((byte) 67, angle);
        this.w = var7;
        this.x = Spell.multiplyFixed16((long)axisX, (long)var6, -1700635440);
        this.y = Spell.multiplyFixed16((long)axisY, (long)var6, obfuscationGuard ^ -1700635393);
        this.z = Spell.multiplyFixed16((long)axisZ, (long)var6, -1700635440);
        if (obfuscationGuard == 47) {
          return;
        }
        String var8 = (String) null;
        FixedQuaternion.isOnlineFriendOrRoomMember(-48L, (String) null, (byte) -22);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        String var8 = null;
        String var8Lifetime1;
        if (jj.b((byte) -73)) {
          jt.a(param6 - 32133, param0, param4, param3);
          if (null != FullscreenMembershipDialog.activeContextMenu) {
            if (!FullscreenMembershipDialog.activeContextMenu.pollAndDispatch(param1, (byte) 103, param4, param5, param0)) {
              AccountRegistrationForm.a(param6 ^ -81, param4, param0);
              wm.a(0, param2, param0);
              param0 = false;
              if (param6 != -83) {
                var8 = (String) null;
                FixedQuaternion.a((String) null, false);
                return param0;
              }
              return param0;
            }
            param0 = false;
            FixInvisibleUnitsConsoleCommand.g(76);
          }
          AccountRegistrationForm.a(param6 ^ -81, param4, param0);
          wm.a(0, param2, param0);
          param0 = false;
        }
        if (param6 == -83) {
          return param0;
        }
        var8Lifetime1 = (String) null;
        FixedQuaternion.a((String) null, false);
        return param0;
    }

    final static void a(String param0, boolean param1) {
        if (!param1) {
          System.out.println("Error: " + ConsolePanel.replaceText(param0, -87, "%0a", "\n"));
          return;
        }
        String var3 = (String) null;
        FixedQuaternion.isOnlineFriendOrRoomMember(71L, (String) null, (byte) 79);
        System.out.println("Error: " + ConsolePanel.replaceText(param0, -87, "%0a", "\n"));
    }

    public static void a(byte param0) {
        fullscreenCanvas = null;
        field_g = null;
        if (param0 != -57) {
          return;
        }
        field_c = null;
    }

    FixedQuaternion() {
        this.w = 65536;
    }

    static {
        field_g = "Quick Chat lobby";
        field_c = "ESC - cancel this line";
    }
}
