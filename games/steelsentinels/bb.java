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
        if (param0 < 126) {
            field_S = (int[]) null;
        }
    }

    bb(ka param0, int param1, int param2) {
        super(-param1 + ck.field_l >> 758611745, kd.field_u - param2 >> 725993697, param1, param2, (qk) null);
        try {
            this.field_U = 0;
            this.field_Q = false;
            this.field_V = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final lh h(int param0) {
        lh var2 = super.h(param0 ^ 0);
        if (param0 != -1) {
            this.a(96, (byte) -104, -78, -99);
            if (!(var2 == null)) {
                return var2;
            }
            return (lh) (this);
        }
        if (!(var2 == null)) {
            return var2;
        }
        return (lh) (this);
    }

    boolean j(int param0) {
        lh discarded$2 = null;
        if (param0 <= -50) {
          this.field_U = this.a(false);
          if (-1 == (this.field_U ^ -1)) {
            if (this.field_Q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$2 = this.h(-124);
          this.field_U = this.a(false);
          if (-1 == (this.field_U ^ -1)) {
            if (this.field_Q) {
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
            field_W = (gh) null;
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
        this.a(-param1 + ck.field_l >> -407255071, (byte) -103, -param2 + kd.field_u >> -1364939967, param1, param2);
        int var4 = 103 / ((param0 - 0) / 45);
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
            var2 = (pc) ((Object) mm.field_b.e(13058));
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (null == rl.field_c) {
                    break L3;
                  } else {
                    var2 = (pc) ((Object) rl.field_c.e(13058));
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        L5: {
                          if (var2.field_u.b((byte) -12)) {
                            var2.field_v.e(128 + lb.field_ac * var2.field_t >> 1637122248);
                            break L5;
                          } else {
                            var2.b(4);
                            break L5;
                          }
                        }
                        var2 = (pc) ((Object) rl.field_c.a((byte) -75));
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  if (var2.field_u.b((byte) -12)) {
                    var2.field_v.e(128 + lb.field_ac * var2.field_t >> 210727176);
                    break L6;
                  } else {
                    var2.b(param1 + -60);
                    break L6;
                  }
                }
                var2 = (pc) ((Object) mm.field_b.a((byte) -84));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "bb.SB(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          return -118;
        } else {
          L0: {
            if (this.field_Q) {
              if (this.field_V.i(-1850) != this) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var2 = this.a(false);
        var3 = var2 - this.field_U;
        if (param0 == -8350) {
          L0: {
            if (-1 > (var3 ^ -1)) {
              this.field_U = this.field_U + (-1 + (8 + var3)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (-1 >= (var3 ^ -1)) {
            if (this.field_U == 0) {
              if (0 != var2) {
                return false;
              } else {
                L1: {
                  if (this.field_Q) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L1;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L1;
                  }
                }
                return stackIn_21_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            this.field_U = this.field_U + (-16 + var3 + 1) / 16;
            if (this.field_U == 0) {
              if (0 != var2) {
                return false;
              } else {
                L2: {
                  if (this.field_Q) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                return stackIn_12_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
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
        if (this.field_U != 0) {
          if (this.field_U < 256) {
            if (lc.field_b != null) {
              if (this.field_x <= lc.field_b.field_A) {
                if (lc.field_b.field_F >= this.field_E) {
                  q.a(lc.field_b, (byte) -103);
                  pb.b();
                  this.a(0, 0, true);
                  super.a(-param0 - this.field_z, (byte) -108, -this.field_o + -param2, param3);
                  tk.f((byte) 111);
                  lc.field_b.b(param2 - -this.field_o, param0 + this.field_z, this.field_U);
                  return;
                } else {
                  lc.field_b = new wk(this.field_x, this.field_E);
                  q.a(lc.field_b, (byte) -103);
                  pb.b();
                  this.a(0, 0, true);
                  super.a(-param0 - this.field_z, (byte) -108, -this.field_o + -param2, param3);
                  tk.f((byte) 111);
                  lc.field_b.b(param2 - -this.field_o, param0 + this.field_z, this.field_U);
                  return;
                }
              } else {
                lc.field_b = new wk(this.field_x, this.field_E);
                q.a(lc.field_b, (byte) -103);
                pb.b();
                this.a(0, 0, true);
                super.a(-param0 - this.field_z, (byte) -108, -this.field_o + -param2, param3);
                tk.f((byte) 111);
                lc.field_b.b(param2 - -this.field_o, param0 + this.field_z, this.field_U);
                return;
              }
            } else {
              lc.field_b = new wk(this.field_x, this.field_E);
              q.a(lc.field_b, (byte) -103);
              pb.b();
              this.a(0, 0, true);
              super.a(-param0 - this.field_z, (byte) -108, -this.field_o + -param2, param3);
              tk.f((byte) 111);
              lc.field_b.b(param2 - -this.field_o, param0 + this.field_z, this.field_U);
              return;
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              this.a(param2 + this.field_o, param0 + this.field_z, true);
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
        field_R = new String[]{"Game-time mode", "Technology level", "Game map"};
        field_P = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_S = new int[]{108, -1, 30, 28, -1, -1, -1, -1, -1, -1, -1};
    }
}
