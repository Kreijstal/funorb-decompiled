/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CourseLayout implements dv {
    static int field_a;
    private int[] roomIds;
    static String field_c;
    static gqa[] field_d;
    private boolean[] roomFlags;

    public final void decode(BitPacketBuffer param0, boolean param1) {
        this.roomFlags = PooledObject.readBitFlags(8, this.roomFlags, (byte) -84, param0);
        if (param1) {
          return;
        }
        try {
          this.roomIds = fa.readBitValues(0, param0, 8, this.roomIds);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "wea.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 8) {
          CourseLayout.releaseStatics(105);
          field_c = null;
          field_d = null;
          return;
        }
        field_c = null;
        field_d = null;
    }

    final void setRoom(int param0, int param1, boolean param2, byte param3) {
        if (param3 <= -35) {
          this.roomFlags[param0] = param2;
          this.roomIds[param0] = param1;
          return;
        }
        this.setRoom(-48, 98, false, (byte) -57);
        this.roomFlags[param0] = param2;
        this.roomIds[param0] = param1;
    }

    final static void initAudioOutputs(int param0, int param1, MusicPlayer param2, boolean param3, java.awt.Component param4, PlatformTaskDispatcher param5) {
        try {
          nba.initAudioOutputs(param5, param2, param1, param0, param0, param4, -45, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "wea.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final Room createRoom(int param0, int param1, int param2, PlayerSimulation param3) {
        RuntimeException var5 = null;
        Room stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1024) {
            field_a = 4;
          }
          stackIn_3_0 = WhiteLightShooterComponent.createCourseRoom(this.roomIds[param1], this.roomFlags[param1], param3, param2, (byte) -125);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wea.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    CourseLayout() {
    }

    CourseLayout(int param0) {
        this.roomFlags = new boolean[param0];
        this.roomIds = new int[param0];
    }

    static {
        field_c = "Asking for or providing contact information";
    }
}
