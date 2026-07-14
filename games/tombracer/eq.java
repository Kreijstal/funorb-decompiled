/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends nv {
    static ola field_n;
    static int field_r;
    private boolean field_u;
    static int[] field_p;
    private boolean field_t;
    private boolean field_q;
    private int field_s;
    private boolean field_o;

    final void a(int param0, boolean param1) {
        ((eq) this).field_t = param1 ? true : false;
        if (param0 != -28592) {
            int discarded$0 = ((eq) this).a(-6, 77);
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            if (fia.field_j.startsWith("win")) {
                if (!(!qla.a(param2, -127))) {
                    return;
                }
            }
            try {
                if (param0 != 1) {
                    field_n = null;
                }
                param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                ssa.a("MGR1: " + param2, (byte) 125, (Throwable) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, int param1) {
        ((eq) this).field_o = param0 ? true : false;
        if (param1 >= -23) {
            Object var4 = null;
            boolean discarded$0 = ((eq) this).a(33, -58, (pc) null, 39);
        }
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        if (!(4 <= ((eq) this).b(param0).field_E)) {
            param1.h(3, 0);
            param1.a(3, (byte) -12, false);
            ((eq) this).field_q = true;
        }
    }

    final void b(byte param0, boolean param1) {
        if (param0 > -53) {
            return;
        }
        ((eq) this).field_q = param1 ? true : false;
    }

    eq(la param0, boolean param1) {
        super(param0, param1);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            field_p = null;
            return param0;
        }
        return param0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        if (param6 instanceof ep) {
          if (!((eq) this).field_o) {
            if (param2 != 1) {
              int discarded$4 = ((eq) this).a(true);
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          if (param2 != 1) {
            int discarded$5 = ((eq) this).a(true);
            return true;
          } else {
            return true;
          }
        }
    }

    final static boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (!vpa.a(79)) {
          if (param0 != 0) {
            L0: {
              field_n = null;
              if (ld.field_e < 2) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if (ld.field_e < 2) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    eq(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        if (-5 >= (param0.field_E ^ -1)) {
            ((eq) this).field_q = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
        }
        if (param0.field_E <= -7) {
            ((eq) this).field_u = 1 == param1.b((byte) 44, 1) ? true : false;
        }
        if (-12 <= param0.field_E) {
            ((eq) this).field_t = -2 == param1.b((byte) 44, 1) ? true : false;
        }
        if (-21 <= param0.field_E) {
            ((eq) this).field_o = param1.b((byte) 44, 1) == 1 ? true : false;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((eq) this).a(true, (fsa) null);
            return 12;
        }
        return 12;
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        if (((eq) this).field_t) {
          return false;
        } else {
          if (param1 != 1) {
            ((eq) this).a(true, 49);
            param2.a(param3, (byte) 47);
            return true;
          } else {
            param2.a(param3, (byte) 47);
            return true;
          }
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_n = null;
        if (param0 != 15602) {
            eq.b(22);
        }
    }

    final void k(int param0) {
        Object var3 = null;
        if (((eq) this).field_q) {
          if (!((eq) this).d(8031)) {
            if (param0 != 5418) {
              var3 = null;
              boolean discarded$5 = ((eq) this).a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            } else {
              return;
            }
          } else {
            ((eq) this).m((byte) 19).a(2, (byte) -123, ((eq) this).field_s);
            if (param0 != 5418) {
              var3 = null;
              boolean discarded$6 = ((eq) this).a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (((eq) this).field_u) {
            if (((eq) this).d(8031)) {
              ((eq) this).b(true).r(-36);
              if (param0 != 5418) {
                var3 = null;
                boolean discarded$7 = ((eq) this).a(-117, 44, 70, 106, 36, -110, (ffa) null);
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 5418) {
                var3 = null;
                boolean discarded$8 = ((eq) this).a(-117, 44, 70, 106, 36, -110, (ffa) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 5418) {
              return;
            } else {
              var3 = null;
              boolean discarded$9 = ((eq) this).a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            }
          }
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 56, ((eq) this).field_q ? 1 : 0, 1);
        param1.a((byte) -125, ((eq) this).field_u ? 1 : 0, 1);
        param1.a((byte) 69, ((eq) this).field_t ? 1 : 0, 1);
        param1.a((byte) -125, ((eq) this).field_o ? 1 : 0, 1);
    }

    final void a(int param0, byte param1) {
        ((eq) this).field_s = param0;
        if (param1 != -22) {
            Object var4 = null;
            boolean discarded$0 = ((eq) this).a(-37, 114, -50, -103, 24, 15, (ffa) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[8192];
        field_r = -1;
    }
}
