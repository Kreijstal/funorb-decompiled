/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameEvent extends IntrusiveNode {
    int field_f;
    static ao field_h;
    static String field_g;

    abstract void apply(int param0, GameScreen param1);

    final static int writeCompressedString(PacketBuffer param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.position;
          var5 = (CharSequence) ((Object) param1);
          var4 = qo.a(var5, (byte) -116);
          if (param2 != -31746) {
            stackIn_2_0 = 73;
            return stackIn_2_0;
          }
          param0.c(var4.length, (byte) 78);
          param0.position = param0.position + r.field_a.compress(var4.length, (byte) -62, 0, param0.payload, param0.position, var4);
          stackIn_4_0 = -var3_int + param0.position;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ae.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void setTick(int param0, int param1) {
        if (param0 != 0) {
          field_g = (String) null;
          this.field_f = param1;
          return;
        }
        this.field_f = param1;
    }

    GameEvent() {
    }

    final static Sprite[] createCentreOnlyFrame(Sprite param0, int param1) {
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite[] var3 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = param0;
          if (param1 != 27117) {
            field_g = (String) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ae.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_g = null;
          field_h = null;
          return;
        }
        String var2 = (String) null;
        GameEvent.writeCompressedString((PacketBuffer) null, (String) null, -18);
        field_g = null;
        field_h = null;
    }

    void removeFromQueue(byte param0) {
        if (param0 >= -47) {
          GameScreen var3 = (GameScreen) null;
          this.apply(-7, (GameScreen) null);
          this.unlink(true);
          return;
        }
        this.unlink(true);
    }

    GameEvent(int param0) {
        this.setTick(0, param0);
    }

    abstract void drawDebugOverlay(int param0, boolean param1, int param2, int param3);

    static {
        field_g = "<%0>'s game";
        field_h = new ao(7, 0, 1, 1);
    }
}
