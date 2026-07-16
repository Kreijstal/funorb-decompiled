/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends qk {
    static int field_Ob;
    private boolean field_Nb;
    int field_Pb;

    final void w(int param0) {
        ((fc) this).field_x = 9;
        ((fc) this).field_y = param0;
        ((fc) this).e(0, -6904);
    }

    final void g(int param0) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 > 95) {
            break L0;
          } else {
            var4 = null;
            ((fc) this).a((byte) -121, (wk) null);
            break L0;
          }
        }
        L1: {
          if (-1 > ((fc) this).field_Gb) {
            ((fc) this).field_Gb = ((fc) this).field_Gb - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 != ((fc) this).field_F) {
            if (((fc) this).field_F == 10) {
              L3: {
                if (2 == ((fc) this).field_G) {
                  ((fc) this).field_yb.z(0);
                  ((fc) this).e(0, -6904);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((fc) this).d(((fc) this).field_F, -26109);
              break L2;
            } else {
              ((fc) this).d(((fc) this).field_F, -26109);
              break L2;
            }
          } else {
            if (-1 <= (((fc) this).field_Pb ^ -1)) {
              this.p((byte) -119);
              ((fc) this).d(((fc) this).field_F, -26109);
              break L2;
            } else {
              ((fc) this).field_Pb = ((fc) this).field_Pb - 1;
              ((fc) this).d(((fc) this).field_F, -26109);
              break L2;
            }
          }
        }
    }

    final static void o(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == ea.field_c) {
            break L0;
          } else {
            var1 = (Object) (Object) ea.field_c;
            synchronized (var1) {
              L1: {
                ea.field_c = null;
                break L1;
              }
            }
            break L0;
          }
        }
        L2: {
          if (param0 < -72) {
            break L2;
          } else {
            fc.o((byte) -40);
            break L2;
          }
        }
    }

    final void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var3 = param1.a(((fc) this).a(true), (byte) -70);
          var4 = param1.a(((fc) this).f(237239984), 0);
          var5 = 0;
          if ((((fc) this).field_F ^ -1) != -11) {
            break L0;
          } else {
            if (var5 == 0) {
              L1: {
                if (((fc) this).field_Nb) {
                  stackOut_5_0 = 2;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var5 = stackIn_6_0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L2: {
          ld.field_l[((fc) this).field_t][var5].b(var3 - 24, var4 + -48);
          if (0 < ((fc) this).field_Gb) {
            L3: {
              var6 = var3 - 3;
              if (((fc) this).field_Nb) {
                break L3;
              } else {
                var6 += 8;
                break L3;
              }
            }
            ((fc) this).b(var6, (byte) -104, var4);
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          if (param0 < -76) {
            break L4;
          } else {
            field_Ob = -119;
            break L4;
          }
        }
        L5: {
          if (!b.field_h) {
            break L5;
          } else {
            bi.d(var3 + 12, 24 + var4, 260, 16711680);
            bi.e(var3, var4, 260 + var3, 260 + var4, 16711680);
            bi.e(var3, var4, -260 + var3, 260 + var4, 16711680);
            bj.field_q.c(Integer.toString(var5), var3, var4, 16777215, 0);
            bj.field_q.c(Integer.toString(((fc) this).field_N), 20 + var3, var4, 16777215, 0);
            bj.field_q.c(Integer.toString(((fc) this).field_F), var3, -20 + var4, 16777215, 0);
            break L5;
          }
        }
    }

    final static on a(byte[] param0, byte param1) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = 100;
        int var3 = 100;
        byte[] var4 = new byte[8 + param0.length];
        for (var5 = 0; var5 < 6; var5++) {
            fb.a(var5, var4, (byte) 71, md.a(var5, param0, 72));
        }
        fb.a(6, var4, (byte) -108, var2);
        fb.a(7, var4, (byte) 57, var3);
        for (var5 = 6; var5 < param0.length / 4; var5++) {
            fb.a(var5 + 2, var4, (byte) 98, md.a(var5, param0, 105));
        }
        if (param1 < 45) {
            return null;
        }
        return gm.a(var4, -27);
    }

    fc(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((fc) this).field_Nb = false;
        ((fc) this).field_Pb = 0;
        ((fc) this).field_S = 2;
        ha.field_d = (fc) this;
    }

    private final void p(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        le var6 = null;
        int var7 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (((fc) this).field_yb != null) {
            ((fc) this).field_yb = null;
            break L0;
          } else {
            break L0;
          }
        }
        var5 = -1;
        var6 = dj.field_e.field_R.b((byte) 26);
        L1: while (true) {
          if (!(var6 instanceof fb)) {
            L2: {
              if (var5 > 67600) {
                ((fc) this).field_yb = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((fc) this).field_yb != null) {
                L4: {
                  ((fc) this).e(10, -6904);
                  ((fc) this).field_Gb = 10;
                  ((fc) this).field_U = dc.a((byte) 18, 44);
                  stackOut_20_0 = this;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (((fc) this).field_Nb) {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L4;
                  } else {
                    stackOut_21_0 = this;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L4;
                  }
                }
                ((fc) this).field_Nb = stackIn_23_1 != 0;
                break L3;
              } else {
                ((fc) this).field_Pb = 20;
                break L3;
              }
            }
            L5: {
              if (param0 <= -27) {
                break L5;
              } else {
                fc.o((byte) 99);
                break L5;
              }
            }
            return;
          } else {
            L6: {
              if (!(var6 instanceof kd)) {
                break L6;
              } else {
                if (((kd) (Object) var6).x(91)) {
                  var2 = ((kd) (Object) var6).a(true) - ((fc) this).a(true);
                  var3 = ((kd) (Object) var6).f(237239984) - ((fc) this).f(237239984);
                  if (0 >= var3) {
                    break L6;
                  } else {
                    if (Math.abs(var2) >= var3) {
                      break L6;
                    } else {
                      L7: {
                        var4 = var2 * var2 + var3 * var3;
                        if (var4 < var5) {
                          break L7;
                        } else {
                          if (-1 != var5) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((fc) this).field_yb = (kd) (Object) var6;
                      var5 = var4;
                      break L6;
                    }
                  }
                } else {
                  var6 = var6.field_b;
                  continue L1;
                }
              }
            }
            var6 = var6.field_b;
            continue L1;
          }
        }
    }

    static {
    }
}
