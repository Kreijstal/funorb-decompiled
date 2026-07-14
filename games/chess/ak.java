/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends o {
    static int field_j;
    static int[][] field_q;
    static kj field_u;
    static int[] field_y;
    static int[] field_k;
    int field_n;
    int field_w;
    int field_t;
    static String field_x;
    int field_v;
    static int[] field_r;
    int field_l;
    int field_s;
    int[] field_o;
    static int[] field_m;
    int field_p;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 21296) {
          field_m = null;
          field_m = null;
          field_k = null;
          field_u = null;
          field_r = null;
          field_y = null;
          field_x = null;
          return;
        } else {
          field_m = null;
          field_k = null;
          field_u = null;
          field_r = null;
          field_y = null;
          field_x = null;
          return;
        }
    }

    final static void a(jk param0, byte param1, Object param2) {
        int var3 = 0;
        Exception var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var5 = Chess.field_G;
        if (param0.field_x != null) {
          var3 = -60 % ((param1 - 44) / 55);
          var4_int = 0;
          L0: while (true) {
            L1: {
              if (-51 >= (var4_int ^ -1)) {
                break L1;
              } else {
                if (param0.field_x.peekEvent() == null) {
                  break L1;
                } else {
                  bc.a(1L, (byte) -123);
                  var4_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  param0.field_x.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                  break L2;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var4 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                if (param0) {
                    Object var3 = null;
                    ak.a((jk) null, (byte) 6, (Object) null);
                }
                param1.getAppletContext().showDocument(rh.a(var2, param1, (byte) -87), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(km[][] param0, byte[] param1, int[] param2, um param3, byte[] param4, int param5, rk[] param6, int param7, String[] param8, String[][] param9, int[] param10, int param11, km[][] param12, um param13, um param14, boolean param15, String[][] param16) {
        if (param11 != 22193) {
            ak.c((byte) -125);
        }
        Object var18 = null;
        Chess.a(param8, (String[]) null, param1, param6, param14, param7, param2, param4, param12, param15, param9, param13, 1, param3, param10, param0, param16, 1, param5);
    }

    final static void c(byte param0) {
        a.field_a = hm.a(-64);
        jh.field_e = new fm();
        if (param0 >= -87) {
            return;
        }
        in.a((byte) 112, true, true);
    }

    final static boolean a(boolean param0) {
        Object var2 = null;
        if (param0) {
          if (tj.h(105)) {
            if (-1 != (8 & r.field_Eb)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = null;
          ak.a((jk) null, (byte) 23, (Object) null);
          if (tj.h(105)) {
            if (-1 != (8 & r.field_Eb)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1796065185;
        if (param1 != 1045) {
          field_u = null;
          param0 = param0 | param0 >>> -1905065694;
          param0 = param0 | param0 >>> -1551630844;
          param0 = param0 | param0 >>> -498468376;
          param0 = param0 | param0 >>> 1797442160;
          return 1 + param0;
        } else {
          param0 = param0 | param0 >>> -1905065694;
          param0 = param0 | param0 >>> -1551630844;
          param0 = param0 | param0 >>> -498468376;
          param0 = param0 | param0 >>> 1797442160;
          return 1 + param0;
        }
    }

    ak(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((ak) this).field_w = param1;
        ((ak) this).field_p = param4;
        th.field_b = th.field_b + 1;
        ((ak) this).field_s = th.field_b & 65535;
        ((ak) this).field_v = param2;
        ((ak) this).field_l = param5;
        ((ak) this).field_t = param0;
        ((ak) this).field_o = param6;
        ((ak) this).field_n = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[12][];
        field_y = new int[12];
        field_x = "<%0> wants to join";
        field_r = new int[12];
        field_k = new int[12];
        field_m = new int[12];
        sa.a(new int[10], 455, 27, 170, 0, 185, 27690);
        sa.a(new int[6], 455, 27, 190, 1, 185, 27690);
        sa.a(new int[8], 455, 27, 190, 2, 185, 27690);
        sa.a(new int[3], 208, 25, 133, 3, 31, 27690);
        sa.a(new int[2], 440, 27, 410, 4, 200, 27690);
        sa.a(new int[10], 620, 27, 155, 5, 485, 27690);
        sa.a(new int[2], 420, 27, 410, 6, 220, 27690);
        sa.a(new int[2], 540, 27, 170, 7, 50, 27690);
        sa.a(new int[1], 590, 27, 400, 8, 500, 27690);
        sa.a(new int[5], 480, 27, 200, 9, 160, 27690);
        sa.a(new int[3], 208, 25, 133, 10, 31, 27690);
        sa.a(new int[6], 540, 27, 190, 11, 50, 27690);
    }
}
