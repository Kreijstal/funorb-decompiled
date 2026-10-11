/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends ei {
    static String[] field_db;
    static int field_Y;
    private String field_bb;
    private String field_eb;
    private hm field_cb;
    private boolean field_W;
    static byte[][] field_Z;
    private boolean field_ab;
    static String field_X;

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
          nh.field_D = param3;
          ol.field_Hb = param1;
          int var4_int = -26 / ((32 - param2) / 55);
          ta.a(fh.field_x, param0, 10);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "na.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1, String param2, float param3) {
        RuntimeException runtimeException = null;
        String var6 = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = this.field_W;
          if (param1) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_8_1 = (param1);
            this.field_W = stackIn_8_1;
            if (this.field_W) {
              this.field_cb.a(4210752, -7062047, 8405024);
              this.field_cb.field_P = true;
            } else {
              this.field_cb.a(4210752, -7062047, 2113632);
              if (this.field_ab) {
                this.field_cb.field_P = false;
              }
            }
          }
          if (param0 != 60) {
            var6 = (String) null;
            na.a(true, (String) null, 41, (String) null);
          }
          this.field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
          this.field_eb = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("na.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2) {
        super.a(param0, param1, param2);
        be.field_x.c(this.field_eb, param0 + (this.field_p >> 1), param1 + 103, 16777215, -1);
        if (null != this.field_bb) {
          l.d(20 + param0, -7 + (120 + param1), 260, 8421504);
          be.field_x.a(this.field_bb, 20 + param0, param1 + 128, 260, 100, 16777215, -1, 1, 0, be.field_x.field_s);
        }
    }

    final void h(byte param0) {
        if (param0 <= -73) {
          this.field_cb.field_P = false;
          this.field_ab = true;
          return;
        }
        this.h((byte) 5);
        this.field_cb.field_P = false;
        this.field_ab = true;
    }

    na(d param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_bb = param1;
          if (this.field_bb != null) {
            var3_int = be.field_x.a(this.field_bb, 260, be.field_x.field_s);
            this.b(98, 150 + var3_int, 300);
          }
          this.field_cb = new hm(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ab = false;
          this.field_W = false;
          this.field_cb.field_P = true;
          this.b((byte) 95, this.field_cb);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_Z = (byte[][]) null;
        if (!param0) {
          field_Y = -73;
          field_db = null;
          field_X = null;
          return;
        }
        field_db = null;
        field_X = null;
    }

    static {
        field_Z = new byte[250][];
        field_Y = 5;
        field_X = "You have <%0> unread messages!";
        field_db = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
