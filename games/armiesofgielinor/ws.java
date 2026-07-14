/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ws extends fw {
    static int field_O;
    static je field_P;
    int field_L;
    int field_Q;
    int field_N;
    int field_S;
    int field_R;
    int field_M;
    static String field_T;

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.a(param0, param1, param2, 120, param4, param5, param6)) {
          if (param3 < 103) {
            field_O = 36;
            return false;
          } else {
            return false;
          }
        } else {
          var8 = param0 + (-((ws) this).field_B + (-param1 + -((ws) this).field_S));
          var9 = param5 + -((ws) this).field_M + (-((ws) this).field_p + -param2);
          if (var8 * var8 + var9 * var9 < ((ws) this).field_Q * ((ws) this).field_Q) {
            var10 = Math.atan2((double)var9, (double)var8) - lf.field_b;
            if (0.0 <= var10) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)((ws) this).field_L;
                ((ws) this).field_R = (int)((double)((ws) this).field_L * var10 / 6.283185307179586);
                L0: while (true) {
                  if (((ws) this).field_R >= ((ws) this).field_L) {
                    ((ws) this).field_R = ((ws) this).field_R - ((ws) this).field_L;
                    continue L0;
                  } else {
                    L1: while (true) {
                      if (-1 >= (((ws) this).field_R ^ -1)) {
                        return true;
                      } else {
                        ((ws) this).field_R = ((ws) this).field_R + ((ws) this).field_L;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                ((ws) this).field_R = (int)((double)((ws) this).field_L * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((ws) this).field_R >= ((ws) this).field_L) {
                    ((ws) this).field_R = ((ws) this).field_R - ((ws) this).field_L;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (-1 >= (((ws) this).field_R ^ -1)) {
                        return true;
                      } else {
                        ((ws) this).field_R = ((ws) this).field_R + ((ws) this).field_L;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((ws) this).field_L;
              ((ws) this).field_R = (int)((double)((ws) this).field_L * var10 / 6.283185307179586);
              L4: while (true) {
                if (((ws) this).field_R >= ((ws) this).field_L) {
                  ((ws) this).field_R = ((ws) this).field_R - ((ws) this).field_L;
                  continue L4;
                } else {
                  L5: while (true) {
                    if (-1 >= (((ws) this).field_R ^ -1)) {
                      return true;
                    } else {
                      ((ws) this).field_R = ((ws) this).field_R + ((ws) this).field_L;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          L0: {
            field_P = null;
            hw.a((byte) 52, wf.field_y, 6);
            hw.a((byte) 33, sh.field_r, 26);
            kr.field_D.a(kr.field_D.a(26, (byte) -107) - -30, 26, (byte) 126);
            hw.a((byte) 111, pu.field_B, 8);
            hw.a((byte) 67, sh.field_r, 27);
            kr.field_D.a(30 + kr.field_D.a(27, (byte) -126), 27, (byte) 125);
            hw.a((byte) 78, sh.field_r, 28);
            kr.field_D.a(kr.field_D.a(28, (byte) -122) + 30, 28, (byte) 120);
            hw.a((byte) 45, pu.field_B, 9);
            if (!rf.a(27875)) {
              hw.a((byte) 54, cg.field_b, 1);
              hw.a((byte) 91, oj.field_t, 24);
              hw.a((byte) 101, op.field_f, 17);
              hw.a((byte) 39, sa.field_i, 3);
              hw.a((byte) 78, wp.field_D, 4);
              il.field_t[40] = od.field_f;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            hw.a((byte) 52, wf.field_y, 6);
            hw.a((byte) 33, sh.field_r, 26);
            kr.field_D.a(kr.field_D.a(26, (byte) -107) - -30, 26, (byte) 126);
            hw.a((byte) 111, pu.field_B, 8);
            hw.a((byte) 67, sh.field_r, 27);
            kr.field_D.a(30 + kr.field_D.a(27, (byte) -126), 27, (byte) 125);
            hw.a((byte) 78, sh.field_r, 28);
            kr.field_D.a(kr.field_D.a(28, (byte) -122) + 30, 28, (byte) 120);
            hw.a((byte) 45, pu.field_B, 9);
            if (!rf.a(27875)) {
              hw.a((byte) 54, cg.field_b, 1);
              hw.a((byte) 91, oj.field_t, 24);
              hw.a((byte) 101, op.field_f, 17);
              hw.a((byte) 39, sa.field_i, 3);
              hw.a((byte) 78, wp.field_D, 4);
              il.field_t[40] = od.field_f;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 > -122) {
                    Object var3 = null;
                    ws.a((java.applet.Applet) null, -54);
                }
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(ck.a(-3780, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_P = null;
        if (param0 < 124) {
            field_P = null;
            field_T = null;
            return;
        }
        field_T = null;
    }

    private ws() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = 0;
        field_T = "Players: <%0>/<%1>";
    }
}
