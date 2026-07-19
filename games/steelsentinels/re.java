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
        int discarded$0 = 0;
        try {
            if (param0 != 15853) {
                discarded$0 = this.h((byte) 24);
            }
            rc.field_m.a(param3, param2 - -param1.field_o + (param1.field_x >> 1442117697), param4 - (-param1.field_z + 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "re.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, (byte) -106, param2, param3, param4);
        var6 = param3 - 130 >> -1318290079;
        if (this.field_Y) {
          this.field_gb.a(var6, (byte) -79, 0, 25, param4);
          this.field_fb.a(45 + var6, (byte) -78, 0, 25, param4);
          if (param1 < -71) {
            this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
            return;
          } else {
            this.field_Y = true;
            this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
            return;
          }
        } else {
          this.field_fb.a(var6, (byte) -107, 0, 25, param4);
          this.field_gb.a(var6 + 45, (byte) -90, 0, 25, param4);
          if (param1 < -71) {
            this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
            return;
          } else {
            this.field_Y = true;
            this.field_db.a(90 + var6, (byte) -110, 0, 40, param4);
            return;
          }
        }
    }

    final String e(int param0) {
        String var2 = null;
        String stackIn_7_0 = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        var2 = this.field_gb.e(param0 ^ param0);
        if (var2 != null) {
          return var2;
        } else {
          if (!this.field_C) {
            return null;
          } else {
            L0: {
              if (null != this.field_v) {
                stackOut_6_0 = this.field_v;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = this.field_y;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    public static void l(int param0) {
        field_W = null;
        field_ab = null;
        field_hb = null;
        field_bb = null;
        field_cb = null;
        if (param0 != 0) {
          field_W = (String) null;
          field_X = null;
          field_ib = null;
          return;
        } else {
          field_X = null;
          field_ib = null;
          return;
        }
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
        if (!(param3 == 0)) {
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
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 14879) {
            break L0;
          } else {
            var3 = (String) null;
            this.a(-54, (lh) null, -29, (String) null, -63);
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = -1 + Integer.parseInt(this.field_gb.field_y);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 < -71) {
            break L0;
          } else {
            field_X = (String) null;
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(this.field_fb.field_y);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            Exception var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                    param0.getAppletContext().showDocument(ge.a(param1 + -9268, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param1 == 9268) {
                  break L0;
                } else {
                  re.l(36);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("re.M(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean i(int param0) {
        if (this.field_fb.field_y != null) {
          if (0 != this.field_fb.field_y.length()) {
            if (null != this.field_gb.field_y) {
              if (0 != this.field_gb.field_y.length()) {
                if (this.field_db.field_y != null) {
                  if (this.field_db.field_y.length() != 0) {
                    if (param0 != -7034) {
                      this.a(47, (byte) 89, 117, 7);
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final int h(byte param0) {
        int discarded$2 = 0;
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 16) {
                break L1;
              } else {
                discarded$2 = this.k(13);
                break L1;
              }
            }
            stackOut_2_0 = Integer.parseInt(this.field_db.field_y);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
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
