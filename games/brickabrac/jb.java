/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends SingleChildWidget {
    static int field_H;
    static String field_G;
    static int[] field_I;

    final void handlePointerRelease(int pointerY, int pointerX, int parentY, Widget focusRoot, int obfuscationGuard, int parentX) {
        dn var7 = null;
        try {
          super.handlePointerRelease(pointerY, pointerX, parentY, focusRoot, obfuscationGuard, parentX);
          var7 = gd.field_c;
          if (var7 != null &&
            this.containsPoint(pointerY, parentY, parentX, 3, pointerX)) {
            if (this.listener instanceof em) {
              ((em) (this.listener)).a(-24178, var7, this);
              gd.field_c = null;
              return;
            }
            if (var7.listener instanceof em) {
              ((em) (var7.listener)).a(-24178, var7, this);
              gd.field_c = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jb.GA(" + pointerY + ',' + pointerX + ',' + parentY + ',' + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ')');
        }
    }

    private jb(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetListener param5, Widget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.child = param6;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(byte param0) {
        field_I = null;
        field_G = null;
        if (param0 >= -47) {
          jb.requestJoinGame(-87, 55, -124);
        }
    }

    final static void requestJoinGame(int gameId, int opcode, int obfuscationGuard) {
        BitPacketBuffer packet = k.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-115, 3);
        if (obfuscationGuard == 11912) {
          packet.writeByte(-113, 8);
          packet.writeShort((byte) 109, gameId);
          return;
        }
    }

    static {
        field_I = new int[]{2, 3, 4, 5};
        field_G = "Checking";
    }
}
