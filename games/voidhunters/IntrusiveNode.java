/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    IntrusiveNode next;
    IntrusiveNode previous;
    long key;

    final boolean isLinked(byte param0) {
        if (param0 != -63) {
          IntrusiveNode.clamp(-99, -70, 95, 66);
          if (this.previous != null) {
            return true;
          }
          return false;
        }
        if (this.previous != null) {
          return true;
        }
        return false;
    }

    final static void configureMenuTheme(Sprite[] param0, int param1, int param2, Sprite[] param3, Sprite[] param4, int param5, int param6, int param7, int param8, BitmapFont param9, int param10, int param11, int param12, int param13, int param14) {
        int var15_int = param9.maxDescent + param9.capHeight;
        int var16 = param9.capHeight;
        if (param13 != -14109) {
          return;
        }
        try {
          SetCountermeasuresCooldown.configureMenuTheme(param6, param1, param2, param9, var16, param3, param5, param14, var15_int, param8, var15_int, param4, param12, var16, param9, param7, param10, param13 + 14192, param11, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ksa.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static int clamp(int param0, int param1, int param2, int param3) {
        if (param0 == 31123) {
          return param1 > param3 ? param1 : param3 <= param2 ? param3 : param2;
        }
        IntrusiveNode.clamp(-107, -16, 102, -117);
        return param1 > param3 ? param1 : param3 <= param2 ? param3 : param2;
    }

    final void unlink(int param0) {
        if (this.previous == null) {
          return;
        }
        this.previous.next = this.next;
        if (param0 == -3846) {
          this.next.previous = this.previous;
          this.previous = null;
          this.next = null;
          return;
        }
    }

    final static IsaacPacketBuffer copySerializedStateBuffer(byte param0) {
        if (param0 == -6) {
          return new IsaacPacketBuffer(GameApplet.copyWrittenBytes((byte) 73, UiViewport.serializedStateBuffer));
        }
        BitmapFont var2 = (BitmapFont) null;
        IntrusiveNode.configureMenuTheme((Sprite[]) null, 27, -49, (Sprite[]) null, (Sprite[]) null, 58, 92, 102, -42, (BitmapFont) null, 125, 6, -7, 73, -90);
        return new IsaacPacketBuffer(GameApplet.copyWrittenBytes((byte) 73, UiViewport.serializedStateBuffer));
    }

    static {
    }
}
