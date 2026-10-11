/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko extends ka {
    static String field_ib;
    static int field_hb;
    private String field_gb;
    static int field_cb;
    private boolean field_db;
    private String field_kb;
    private oc field_bb;
    private boolean field_ab;
    static int field_fb;
    static ak field_eb;
    static String field_jb;

    public static void n(int param0) {
        field_ib = null;
        field_eb = null;
        field_jb = null;
        if (param0 > -98) {
          String var2 = (String) null;
          ko.a(false, (String) null, 30);
        }
    }

    ko(kn param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_gb = param1;
          if (null != this.field_gb) {
            var3_int = ba.field_d.a(this.field_gb, 260, ba.field_d.field_w);
            this.a(150 + var3_int, (byte) -110, 300);
          }
          this.field_bb = new oc(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_db = false;
          this.field_bb.field_Y = true;
          this.field_ab = false;
          this.b(this.field_bb, 80);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ko.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        dm.a(param1, param0, 0);
    }

    final void o(int param0) {
        this.field_db = true;
        this.field_bb.field_Y = false;
        if (param0 != 30) {
          String var3 = (String) null;
          ko.a(true, (String) null, -92);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (!param2) {
          field_ib = (String) null;
          super.a(param0, param1, param2);
          ba.field_d.b(this.field_kb, param0 + (this.field_E >> 1), param1 + 103, 16777215, -1);
          if (this.field_gb != null) {
            t.b(param0 + 20, 120 + param1 - 7, 260, 8421504);
            ba.field_d.a(this.field_gb, 20 + param0, 128 + param1, 260, 100, 16777215, -1, 1, 0, ba.field_d.field_w);
            return;
          }
          return;
        }
        super.a(param0, param1, param2);
        ba.field_d.b(this.field_kb, param0 + (this.field_E >> 1), param1 + 103, 16777215, -1);
        if (this.field_gb == null) {
          return;
        }
        t.b(param0 + 20, 120 + param1 - 7, 260, 8421504);
        ba.field_d.a(this.field_gb, 20 + param0, 128 + param1, 260, 100, 16777215, -1, 1, 0, ba.field_d.field_w);
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param3) ? 0 : 1;
          if (stackIn_3_0 == (this.field_ab ? 1 : 0)) {
            stackIn_7_1 = (param3);
            this.field_ab = stackIn_7_1;
            if (this.field_ab) {
              this.field_bb.a((byte) 98, 8405024, 4210752);
              this.field_bb.field_Y = true;
            } else {
              this.field_bb.a((byte) 92, 2113632, 4210752);
              if (this.field_db) {
                this.field_bb.field_Y = false;
              }
            }
          }
          if (param2 != 7595) {
            return;
          }
          this.field_kb = param0;
          this.field_bb.field_Q = (int)(param1 / 100.0f * 65536.0f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("ko.P(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        try {
          dk.field_c = true;
          ke.field_d = param0 ? true : false;
          if (param2 != -26027) {
            String var4 = (String) null;
            ko.a(true, (String) null, -84);
          }
          to.field_r = new vk(wa.field_c, ba.field_d, param1, to.field_s, ke.field_d);
          wa.field_c.b(param2 ^ 32140, to.field_r);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ko.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_ib = "You have entered another game.";
        field_jb = "Lobby";
    }
}
