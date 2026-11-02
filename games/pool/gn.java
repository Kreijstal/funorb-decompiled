/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static boolean field_f;
    static String tutorialEightBallAfterfirstpot;
    static int field_b;
    static int field_d;
    static int keycodeDefaultRight1;
    static eg field_e;

    final static Sprite[] a(Sprite[] param0, byte param1) {
        RuntimeException var2 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[3].field_y = param0[3].field_A;
          if (param1 != -29) {
            tutorialEightBallAfterfirstpot = (String) null;
          }
          param0[1].field_w = param0[1].field_z;
          param0[5].field_y = param0[5].field_A;
          param0[7].field_w = param0[7].field_z;
          stackIn_3_0 = (Sprite[]) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gn.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        if (wg.field_Nb == null) {
          wg.field_Nb = new int[param0 * 2];
          if (TickClock.field_g == null ||
            !(param0 <= TickClock.field_g.length)) {
            TickClock.field_g = new int[param0 * 2];
          }
          if (null == ob.field_y ||
            !(ob.field_y.length >= param0)) {
            ob.field_y = new int[param0 * 2];
          }
          if (param2) {
            return;
          }
          if (om.field_s == null ||
            !(om.field_s.length >= param0)) {
            om.field_s = new int[2 * param0];
          }
          if (gd.field_d == null) {
            gd.field_d = new int[param0 * 2];
          } else {
            if (gd.field_d.length < param0) {
              gd.field_d = new int[param0 * 2];
              if (ah.field_c == null ||
                !(ah.field_c.length >= param0)) {
                ah.field_c = new int[param0 * 2];
              }
              if (NetworkGameClient.field_H == null ||
                !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
              }
              if (im.field_cc == null ||
                !(im.field_cc.length >= param0)) {
                im.field_cc = new boolean[2 * param0];
              }
              rn.field_d = 2147483647;
              q.field_a = -2147483648;
              jl.field_c = -2147483648;
              jh.field_c = 0;
              ArchiveRequest.field_z = 2147483647;
              return;
            }
          }
          if (ah.field_c == null) {
            ah.field_c = new int[param0 * 2];
            if (NetworkGameClient.field_H == null ||
              !(param1 + param0 <= NetworkGameClient.field_H.length)) {
              NetworkGameClient.field_H = new int[2 * (param1 + param0)];
            }
            if (im.field_cc == null ||
              !(im.field_cc.length >= param0)) {
              im.field_cc = new boolean[2 * param0];
            }
          } else {
            if (ah.field_c.length < param0) {
              ah.field_c = new int[param0 * 2];
              if (NetworkGameClient.field_H == null ||
                !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
              }
              if (im.field_cc == null ||
                !(im.field_cc.length >= param0)) {
                im.field_cc = new boolean[2 * param0];
              }
            } else {
              if (NetworkGameClient.field_H == null) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                if (im.field_cc == null ||
                  !(im.field_cc.length >= param0)) {
                  im.field_cc = new boolean[2 * param0];
                }
              } else {
                if (param1 + param0 > NetworkGameClient.field_H.length) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  if (im.field_cc == null ||
                    !(im.field_cc.length >= param0)) {
                    im.field_cc = new boolean[2 * param0];
                  }
                } else {
                  if (im.field_cc == null) {
                    im.field_cc = new boolean[2 * param0];
                  } else {
                    if (im.field_cc.length < param0) {
                      im.field_cc = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (param0 <= wg.field_Nb.length) {
            if (TickClock.field_g == null ||
              !(param0 <= TickClock.field_g.length)) {
              TickClock.field_g = new int[param0 * 2];
            }
            if (null == ob.field_y ||
              !(ob.field_y.length >= param0)) {
              ob.field_y = new int[param0 * 2];
            }
            if (param2) {
              return;
            }
            if (om.field_s == null ||
              !(om.field_s.length >= param0)) {
              om.field_s = new int[2 * param0];
            }
            if (gd.field_d == null) {
              gd.field_d = new int[param0 * 2];
            } else {
              if (gd.field_d.length < param0) {
                gd.field_d = new int[param0 * 2];
                if (ah.field_c == null ||
                  !(ah.field_c.length >= param0)) {
                  ah.field_c = new int[param0 * 2];
                }
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
                if (im.field_cc == null ||
                  !(im.field_cc.length >= param0)) {
                  im.field_cc = new boolean[2 * param0];
                }
                rn.field_d = 2147483647;
                q.field_a = -2147483648;
                jl.field_c = -2147483648;
                jh.field_c = 0;
                ArchiveRequest.field_z = 2147483647;
                return;
              }
            }
            if (ah.field_c == null) {
              ah.field_c = new int[param0 * 2];
              if (NetworkGameClient.field_H == null ||
                !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
              }
              if (im.field_cc == null ||
                !(im.field_cc.length >= param0)) {
                im.field_cc = new boolean[2 * param0];
              }
            } else {
              if (ah.field_c.length < param0) {
                ah.field_c = new int[param0 * 2];
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
                if (im.field_cc == null ||
                  !(im.field_cc.length >= param0)) {
                  im.field_cc = new boolean[2 * param0];
                }
              } else {
                if (NetworkGameClient.field_H == null) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  if (im.field_cc == null ||
                    !(im.field_cc.length >= param0)) {
                    im.field_cc = new boolean[2 * param0];
                  }
                } else {
                  if (param1 + param0 > NetworkGameClient.field_H.length) {
                    NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                    if (im.field_cc == null ||
                      !(im.field_cc.length >= param0)) {
                      im.field_cc = new boolean[2 * param0];
                    }
                  } else {
                    if (im.field_cc == null) {
                      im.field_cc = new boolean[2 * param0];
                    } else {
                      if (im.field_cc.length < param0) {
                        im.field_cc = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            wg.field_Nb = new int[param0 * 2];
            if (TickClock.field_g == null ||
              !(param0 <= TickClock.field_g.length)) {
              TickClock.field_g = new int[param0 * 2];
            }
            if (null == ob.field_y ||
              !(ob.field_y.length >= param0)) {
              ob.field_y = new int[param0 * 2];
            }
            if (param2) {
              return;
            }
            if (om.field_s == null ||
              !(om.field_s.length >= param0)) {
              om.field_s = new int[2 * param0];
            }
            if (gd.field_d == null) {
              gd.field_d = new int[param0 * 2];
            } else {
              if (gd.field_d.length < param0) {
                gd.field_d = new int[param0 * 2];
                if (ah.field_c == null ||
                  !(ah.field_c.length >= param0)) {
                  ah.field_c = new int[param0 * 2];
                }
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
                if (im.field_cc == null ||
                  !(im.field_cc.length >= param0)) {
                  im.field_cc = new boolean[2 * param0];
                }
                rn.field_d = 2147483647;
                q.field_a = -2147483648;
                jl.field_c = -2147483648;
                jh.field_c = 0;
                ArchiveRequest.field_z = 2147483647;
                return;
              }
            }
            if (ah.field_c == null) {
              ah.field_c = new int[param0 * 2];
              if (NetworkGameClient.field_H == null) {
                NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                if (im.field_cc == null ||
                  !(im.field_cc.length >= param0)) {
                  im.field_cc = new boolean[2 * param0];
                }
              } else {
                if (param1 + param0 > NetworkGameClient.field_H.length) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  if (im.field_cc == null ||
                    !(im.field_cc.length >= param0)) {
                    im.field_cc = new boolean[2 * param0];
                  }
                } else {
                  if (im.field_cc == null) {
                    im.field_cc = new boolean[2 * param0];
                  } else {
                    if (im.field_cc.length < param0) {
                      im.field_cc = new boolean[2 * param0];
                    }
                  }
                }
              }
            } else {
              if (ah.field_c.length < param0) {
                ah.field_c = new int[param0 * 2];
                if (NetworkGameClient.field_H == null ||
                  !(param1 + param0 <= NetworkGameClient.field_H.length)) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                }
              } else {
                if (NetworkGameClient.field_H == null) {
                  NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                } else {
                  if (param1 + param0 > NetworkGameClient.field_H.length) {
                    NetworkGameClient.field_H = new int[2 * (param1 + param0)];
                  }
                }
              }
              if (im.field_cc == null) {
                im.field_cc = new boolean[2 * param0];
              } else {
                if (im.field_cc.length < param0) {
                  im.field_cc = new boolean[2 * param0];
                }
              }
            }
          }
        }
        rn.field_d = 2147483647;
        q.field_a = -2147483648;
        jl.field_c = -2147483648;
        jh.field_c = 0;
        ArchiveRequest.field_z = 2147483647;
    }

    final static eg a(eg param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        eg stackIn_6_0 = null;
        eg stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          for (var2_int = 0; param0.field_q.length > var2_int; var2_int++) {
            param0.field_q[var2_int] = -param0.field_q[var2_int];
          }
          if (param1 != 5) {
            stackIn_6_0 = (eg) null;
            return stackIn_6_0;
          }
          ImageProducerRasterBuffer.a(param0, (byte) 38);
          param0.a();
          stackIn_8_0 = (eg) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("gn.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          return;
        }
        field_e = null;
        tutorialEightBallAfterfirstpot = null;
    }

    static {
        tutorialEightBallAfterfirstpot = "Now you have potted a ball, that group - either spots (balls 1-7) or stripes (balls 9-15) - becomes yours. Your objective is now to pot the rest of the balls of your group, then the black ball. You must always hit one of your balls first!";
        keycodeDefaultRight1 = 50;
    }
}
