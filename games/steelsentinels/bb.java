/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends dl {
    static boolean field_T;
    static int[] field_X;
    static String[] field_R;
    static gh field_W;
    static String field_P;
    private ka field_V;
    boolean field_Q;
    private int field_U;
    static int[] field_S;

    public static void h(byte param0) {
        field_S = null;
        field_W = null;
        field_P = null;
        field_X = null;
        field_R = null;
    }

    bb(ka param0, int param1, int param2) {
        super(-param1 + ck.field_l >> 1, kd.field_u - param2 >> 1, param1, param2, (qk) null);
        try {
            ((bb) this).field_U = 0;
            ((bb) this).field_Q = false;
            ((bb) this).field_V = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final lh h(int param0) {
        lh var2 = super.h(param0);
        if (param0 != -1) {
            ((bb) this).a(96, (byte) -104, -78, -99);
            if (!(var2 == null)) {
                return var2;
            }
            return (lh) this;
        }
        if (!(var2 == null)) {
            return var2;
        }
        return (lh) this;
    }

    boolean j(int param0) {
        if (param0 <= -50) {
          ((bb) this).field_U = this.a(false);
          if (((bb) this).field_U == 0) {
            if (((bb) this).field_Q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          lh discarded$2 = ((bb) this).h(-124);
          ((bb) this).field_U = this.a(false);
          if (((bb) this).field_U == 0) {
            if (((bb) this).field_Q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0) {
        if (mg.field_ac) {
          ck.field_a = true;
          if (param0 <= 66) {
            field_W = null;
            nj.a(true, 40);
            uj.field_d = 0;
            return;
          } else {
            nj.a(true, 40);
            uj.field_d = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((bb) this).a(-param1 + ck.field_l >> 1, (byte) -103, -param2 + kd.field_u >> 1, param1, param2);
        int var4 = 103 / (param0 / 45);
    }

    final static void a(int param0, byte param1) {
        pc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              lb.field_ac = param0;
              if (param1 == 64) {
                break L1;
              } else {
                bb.a((byte) 37);
                break L1;
              }
            }
            var2 = (pc) (Object) mm.field_b.e(13058);
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (null == rl.field_c) {
                    break L3;
                  } else {
                    var2 = (pc) (Object) rl.field_c.e(13058);
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        L5: {
                          if (var2.field_u.b((byte) -12)) {
                            var2.field_v.e(128 + lb.field_ac * var2.field_t >> 8);
                            break L5;
                          } else {
                            var2.b(4);
                            break L5;
                          }
                        }
                        var2 = (pc) (Object) rl.field_c.a((byte) -75);
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  if (var2.field_u.b((byte) -12)) {
                    var2.field_v.e(128 + lb.field_ac * var2.field_t >> 8);
                    break L6;
                  } else {
                    var2.b(param1 + -60);
                    break L6;
                  }
                }
                var2 = (pc) (Object) mm.field_b.a((byte) -84);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "bb.SB(" + param0 + 44 + param1 + 41);
        }
    }

    private final int a(boolean param0) {
        return !((bb) this).field_Q ? 0 : (Object) (Object) ((bb) this).field_V.i(-1850) == this ? 256 : 0;
    }

    boolean i(int param0) {
        int var2 = this.a(false);
        int var3 = var2 - ((bb) this).field_U;
        if (param0 != -8350) {
            return false;
        }
        if (!(var3 <= 0)) {
            ((bb) this).field_U = ((bb) this).field_U + (-1 + (8 + var3)) / 8;
        }
        if (var3 < 0) {
            ((bb) this).field_U = ((bb) this).field_U + (-16 + var3 + 1) / 16;
            if (((bb) this).field_U != 0) {
                return false;
            }
            if (0 != var2) {
                return false;
            }
            return !((bb) this).field_Q ? true : false;
        }
        if (((bb) this).field_U != 0) {
            return false;
        }
        if (0 != var2) {
            return false;
        }
        return !((bb) this).field_Q ? true : false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param1 <= -99) {
            break L0;
          } else {
            bb.a(35, (byte) 1);
            break L0;
          }
        }
        if (((bb) this).field_U != 0) {
          if (((bb) this).field_U < 256) {
            if (lc.field_b != null) {
              if (((bb) this).field_x <= lc.field_b.field_A) {
                if (lc.field_b.field_F >= ((bb) this).field_E) {
                  q.a(lc.field_b, (byte) -103);
                  pb.b();
                  ((bb) this).a(0, 0, true);
                  super.a(-param0 - ((bb) this).field_z, (byte) -108, -((bb) this).field_o + -param2, param3);
                  tk.f((byte) 111);
                  lc.field_b.b(param2 - -((bb) this).field_o, param0 + ((bb) this).field_z, ((bb) this).field_U);
                  return;
                } else {
                  lc.field_b = new wk(((bb) this).field_x, ((bb) this).field_E);
                  q.a(lc.field_b, (byte) -103);
                  pb.b();
                  ((bb) this).a(0, 0, true);
                  super.a(-param0 - ((bb) this).field_z, (byte) -108, -((bb) this).field_o + -param2, param3);
                  tk.f((byte) 111);
                  lc.field_b.b(param2 - -((bb) this).field_o, param0 + ((bb) this).field_z, ((bb) this).field_U);
                  return;
                }
              } else {
                lc.field_b = new wk(((bb) this).field_x, ((bb) this).field_E);
                q.a(lc.field_b, (byte) -103);
                pb.b();
                ((bb) this).a(0, 0, true);
                super.a(-param0 - ((bb) this).field_z, (byte) -108, -((bb) this).field_o + -param2, param3);
                tk.f((byte) 111);
                lc.field_b.b(param2 - -((bb) this).field_o, param0 + ((bb) this).field_z, ((bb) this).field_U);
                return;
              }
            } else {
              lc.field_b = new wk(((bb) this).field_x, ((bb) this).field_E);
              q.a(lc.field_b, (byte) -103);
              pb.b();
              ((bb) this).a(0, 0, true);
              super.a(-param0 - ((bb) this).field_z, (byte) -108, -((bb) this).field_o + -param2, param3);
              tk.f((byte) 111);
              lc.field_b.b(param2 - -((bb) this).field_o, param0 + ((bb) this).field_z, ((bb) this).field_U);
              return;
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              ((bb) this).a(param2 + ((bb) this).field_o, param0 + ((bb) this).field_z, true);
              super.a(param0, (byte) -121, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1, boolean param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new String[]{"Game-time mode", "Technology level", "Game map"};
        field_P = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_S = new int[]{108, -1, 30, 28, -1, -1, -1, -1, -1, -1, -1};
    }
}
