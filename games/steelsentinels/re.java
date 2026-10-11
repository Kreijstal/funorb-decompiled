/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends ha {
    private jf field_fb;
    static String field_hb;
    static String field_ab;
    static String field_W;
    private jf field_gb;
    static mi field_ib;
    private boolean field_Y;
    static int field_eb;
    static String field_X;
    static int[] field_bb;
    private jf field_db;
    static int field_Z;
    static String field_cb;

    private final void a(int param0, lh param1, int param2, String param3, int param4) {
        try {
          if (param0 != 15853) {
            this.h((byte) 24);
          }
          rc.field_m.a(param3, param2 + param1.field_o + (param1.field_x >> 1), param4 - (-param1.field_z + 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "re.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -106, param2, param3, param4);
        int var6 = param3 - 130 >> 1;
        if (!this.field_Y) {
          this.field_fb.a(var6, (byte) -107, 0, 25, param4);
          this.field_gb.a(var6 + 45, (byte) -90, 0, 25, param4);
          if (param1 >= -71) {
            this.field_Y = true;
            this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
            return;
          }
          this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
          return;
        }
        this.field_gb.a(var6, (byte) -79, 0, 25, param4);
        this.field_fb.a(45 + var6, (byte) -78, 0, 25, param4);
        if (param1 >= -71) {
          this.field_Y = true;
          this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
          return;
        }
        this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
    }

    final String e(int param0) {
        String var2 = this.field_gb.e(param0 ^ param0);
        if (var2 != null) {
          return var2;
        }
        if (this.field_C) {
          return null == this.field_v ? this.field_y : this.field_v;
        }
        return null;
    }

    public static void l(int param0) {
        field_W = null;
        field_ab = null;
        field_hb = null;
        field_bb = null;
        field_cb = null;
        if (param0 == 0) {
          field_X = null;
          field_ib = null;
          return;
        }
        field_W = (String) null;
        field_X = null;
        field_ib = null;
    }

    re(qk param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param2, (byte) -101, param3, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 >= -99) {
          return;
        }
        super.a(param0, (byte) -116, param2, param3);
        if (param3 != 0) {
          return;
        }
        param2 = param2 + this.field_o;
        param0 = param0 + this.field_z;
        this.a(15853, this.field_fb, param2, fb.field_n, param0);
        this.a(15853, this.field_gb, param2, qi.field_b, param0);
        this.a(15853, this.field_db, param2, fj.field_g, param0);
    }

    final int k(int param0) {
        NumberFormatException var2 = null;
        String var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 14879) {
          var3 = (String) null;
          this.a(-54, (lh) null, -29, (String) null, -63);
        }
        try {
          stackIn_3_0 = -1 + Integer.parseInt(this.field_gb.field_y);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 >= -71) {
          field_X = (String) null;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_fb.field_y);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              param0.getAppletContext().showDocument(ge.a(param1 - 9268, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 == 9268) {
              return;
            }
            re.l(36);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("re.M(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean i(int param0) {
        if (this.field_fb.field_y == null) {
          return true;
        }
        if (0 == this.field_fb.field_y.length()) {
          return true;
        }
        if (null == this.field_gb.field_y) {
          return true;
        }
        if (0 == this.field_gb.field_y.length()) {
          return true;
        }
        if (this.field_db.field_y == null) {
          return true;
        }
        if (this.field_db.field_y.length() == 0) {
          return true;
        }
        if (param0 == -7034) {
          return false;
        }
        this.a(47, (byte) 89, 117, 7);
        return false;
    }

    final int h(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 < 16) {
            this.k(13);
          }
          stackIn_3_0 = Integer.parseInt(this.field_db.field_y);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private re(qk param0, boolean param1) {
        super(0, 0, 0, 0, (qk) null);
        try {
          this.field_fb = (jf) ((Object) new bc("", (tn) null, 2));
          this.field_gb = (jf) ((Object) new bc("", (tn) null, 2));
          this.field_db = (jf) ((Object) new bc("", (tn) null, 4));
          this.field_db.field_p = param0;
          this.field_gb.field_p = param0;
          this.field_fb.field_p = param0;
          this.field_Y = param1 ? true : false;
          if (!this.field_Y) {
            this.a(this.field_fb, -102);
            this.a(this.field_gb, -122);
          } else {
            this.a(this.field_gb, -98);
            this.a(this.field_fb, -97);
          }
          this.a(this.field_db, -114);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, vn param1) {
        super.a((byte) -84, param1);
        if (param0 > -17) {
          return;
        }
        try {
          this.field_fb.field_A = (tn) ((Object) param1);
          this.field_gb.field_A = (tn) ((Object) param1);
          this.field_db.field_A = (tn) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_hb = "Get access to new weapons by expending solarite cubes on engineering. Until you engineer a weapon, it cannot be equipped on a sentinel.";
        field_W = "AI INVADER ";
        field_ab = "<%1> was caught in <%0>'s nuclear fireball";
        field_X = "<br><col=ffffff>and the following ";
        field_bb = new int[8192];
        field_eb = -1;
        field_cb = "TAB - hide chat temporarily";
    }
}
